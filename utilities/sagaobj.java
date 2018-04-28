package utilities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.resources.IResource;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.IModelCustom;
import net.minecraftforge.client.model.ModelFormatException;
import net.minecraftforge.client.model.obj.Face;
import net.minecraftforge.client.model.obj.GroupObject;
import net.minecraftforge.client.model.obj.TextureCoordinate;
import net.minecraftforge.client.model.obj.Vertex;

public class sagaobj implements IModelCustom {
   private static Pattern vertexPattern = Pattern.compile("(sa( (\\-){0,1}\\d+(\\.\\d+)?){3,4} *\\n)|(sa( (\\-){0,1}\\d+(\\.\\d+)?){3,4} *$)");
   private static Pattern vertexNormalPattern = Pattern.compile("(vn( (\\-){0,1}\\d+(\\.\\d+)?){3,4} *\\n)|(vn( (\\-){0,1}\\d+(\\.\\d+)?){3,4} *$)");
   private static Pattern textureCoordinatePattern = Pattern.compile("(sat( (\\-){0,1}\\d+\\.\\d+){2,3} *\\n)|(sat( (\\-){0,1}\\d+(\\.\\d+)?){2,3} *$)");
   private static Pattern face_V_VT_VN_Pattern = Pattern.compile("(saf( \\d+/\\d+/\\d+){3,4} *\\n)|(saf( \\d+/\\d+/\\d+){3,4} *$)");
   private static Pattern face_V_VT_Pattern = Pattern.compile("(saf( \\d+/\\d+){3,4} *\\n)|(saf( \\d+/\\d+){3,4} *$)");
   private static Pattern face_V_VN_Pattern = Pattern.compile("(saf( \\d+//\\d+){3,4} *\\n)|(saf( \\d+//\\d+){3,4} *$)");
   private static Pattern face_V_Pattern = Pattern.compile("(saf( \\d+){3,4} *\\n)|(saf( \\d+){3,4} *$)");
   private static Pattern groupObjectPattern = Pattern.compile("([go]( [\\w\\d\\.]+) *\\n)|([go]( [\\w\\d\\.]+) *$)");
   private static Matcher vertexMatcher;
   private static Matcher vertexNormalMatcher;
   private static Matcher textureCoordinateMatcher;
   private static Matcher face_V_VT_VN_Matcher;
   private static Matcher face_V_VT_Matcher;
   private static Matcher face_V_VN_Matcher;
   private static Matcher face_V_Matcher;
   private static Matcher groupObjectMatcher;
   public ArrayList vertices = new ArrayList();
   public ArrayList vertexNormals = new ArrayList();
   public ArrayList textureCoordinates = new ArrayList();
   public ArrayList groupObjects = new ArrayList();
   private GroupObject currentGroupObject;
   private String fileName;

   public sagaobj(ResourceLocation resource) throws ModelFormatException {
      this.fileName = resource.toString();

      try {
         IResource res = Minecraft.func_71410_x().func_110442_L().func_110536_a(resource);
         this.loadObjModel(res.func_110527_b());
      } catch (IOException var3) {
         throw new ModelFormatException("IO Exception reading model format", var3);
      }
   }

   public sagaobj(String filename, InputStream inputStream) throws ModelFormatException {
      this.fileName = filename;
      this.loadObjModel(inputStream);
   }

   private void loadObjModel(InputStream inputStream) throws ModelFormatException {
      BufferedReader reader = null;
      String currentLine = null;
      int lineCount = 0;

      try {
         reader = new BufferedReader(new InputStreamReader(inputStream));

         while((currentLine = reader.readLine()) != null) {
            ++lineCount;
            currentLine = currentLine.replaceAll("\\s+", " ").trim();
            if (!currentLine.startsWith("#") && currentLine.length() != 0) {
               Vertex vertex;
               if (currentLine.startsWith("sa ")) {
                  vertex = this.parseVertex(currentLine, lineCount);
                  if (vertex != null) {
                     this.vertices.add(vertex);
                  }
               } else if (currentLine.startsWith("vn ")) {
                  vertex = this.parseVertexNormal(currentLine, lineCount);
                  if (vertex != null) {
                     this.vertexNormals.add(vertex);
                  }
               } else if (currentLine.startsWith("sat ")) {
                  TextureCoordinate textureCoordinate = this.parseTextureCoordinate(currentLine, lineCount);
                  if (textureCoordinate != null) {
                     this.textureCoordinates.add(textureCoordinate);
                  }
               } else if (currentLine.startsWith("saf ")) {
                  if (this.currentGroupObject == null) {
                     this.currentGroupObject = new GroupObject("Default");
                  }

                  Face face = this.parseFace(currentLine, lineCount);
                  if (face != null) {
                     this.currentGroupObject.faces.add(face);
                  }
               } else if (currentLine.startsWith("g ") | currentLine.startsWith("o ")) {
                  GroupObject group = this.parseGroupObject(currentLine, lineCount);
                  if (group != null && this.currentGroupObject != null) {
                     this.groupObjects.add(this.currentGroupObject);
                  }

                  this.currentGroupObject = group;
               }
            }
         }

         this.groupObjects.add(this.currentGroupObject);
      } catch (IOException var16) {
         throw new ModelFormatException("IO Exception reading model format", var16);
      } finally {
         try {
            reader.close();
         } catch (IOException var15) {
            ;
         }

         try {
            inputStream.close();
         } catch (IOException var14) {
            ;
         }

      }
   }

   @SideOnly(Side.CLIENT)
   public void renderAll() {
      Tessellator tessellator = Tessellator.field_78398_a;
      if (this.currentGroupObject != null) {
         tessellator.func_78371_b(this.currentGroupObject.glDrawingMode);
      } else {
         tessellator.func_78371_b(4);
      }

      this.tessellateAll(tessellator);
      tessellator.func_78381_a();
   }

   @SideOnly(Side.CLIENT)
   public void tessellateAll(Tessellator tessellator) {
      Iterator var2 = this.groupObjects.iterator();

      while(var2.hasNext()) {
         GroupObject groupObject = (GroupObject)var2.next();
         groupObject.render(tessellator);
      }

   }

   @SideOnly(Side.CLIENT)
   public void renderOnly(String... groupNames) {
      Iterator var2 = this.groupObjects.iterator();

      while(var2.hasNext()) {
         GroupObject groupObject = (GroupObject)var2.next();
         String[] var4 = groupNames;
         int var5 = groupNames.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            String groupName = var4[var6];
            if (groupName.equalsIgnoreCase(groupObject.name)) {
               groupObject.render();
            }
         }
      }

   }

   @SideOnly(Side.CLIENT)
   public void tessellateOnly(Tessellator tessellator, String... groupNames) {
      Iterator var3 = this.groupObjects.iterator();

      while(var3.hasNext()) {
         GroupObject groupObject = (GroupObject)var3.next();
         String[] var5 = groupNames;
         int var6 = groupNames.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            String groupName = var5[var7];
            if (groupName.equalsIgnoreCase(groupObject.name)) {
               groupObject.render(tessellator);
            }
         }
      }

   }

   @SideOnly(Side.CLIENT)
   public void renderPart(String partName) {
      Iterator var2 = this.groupObjects.iterator();

      while(var2.hasNext()) {
         GroupObject groupObject = (GroupObject)var2.next();
         if (partName.equalsIgnoreCase(groupObject.name)) {
            groupObject.render();
         }
      }

   }

   @SideOnly(Side.CLIENT)
   public void tessellatePart(Tessellator tessellator, String partName) {
      Iterator var3 = this.groupObjects.iterator();

      while(var3.hasNext()) {
         GroupObject groupObject = (GroupObject)var3.next();
         if (partName.equalsIgnoreCase(groupObject.name)) {
            groupObject.render(tessellator);
         }
      }

   }

   @SideOnly(Side.CLIENT)
   public void renderAllExcept(String... excludedGroupNames) {
      Iterator var2 = this.groupObjects.iterator();

      while(var2.hasNext()) {
         GroupObject groupObject = (GroupObject)var2.next();
         boolean skipPart = false;
         String[] var5 = excludedGroupNames;
         int var6 = excludedGroupNames.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            String excludedGroupName = var5[var7];
            if (excludedGroupName.equalsIgnoreCase(groupObject.name)) {
               skipPart = true;
            }
         }

         if (!skipPart) {
            groupObject.render();
         }
      }

   }

   @SideOnly(Side.CLIENT)
   public void tessellateAllExcept(Tessellator tessellator, String... excludedGroupNames) {
      Iterator var4 = this.groupObjects.iterator();

      while(var4.hasNext()) {
         GroupObject groupObject = (GroupObject)var4.next();
         boolean exclude = false;
         String[] var6 = excludedGroupNames;
         int var7 = excludedGroupNames.length;

         for(int var8 = 0; var8 < var7; ++var8) {
            String excludedGroupName = var6[var8];
            if (excludedGroupName.equalsIgnoreCase(groupObject.name)) {
               exclude = true;
            }
         }

         if (!exclude) {
            groupObject.render(tessellator);
         }
      }

   }

   private Vertex parseVertex(String line, int lineCount) throws ModelFormatException {
      Vertex vertex = null;
      if (isValidVertexLine(line)) {
         line = line.substring(line.indexOf(" ") + 1);
         String[] tokens = line.split(" ");

         try {
            if (tokens.length == 2) {
               return new Vertex(Float.parseFloat(tokens[0]), Float.parseFloat(tokens[1]));
            } else {
               return (Vertex)(tokens.length == 3 ? new Vertex(Float.parseFloat(tokens[0]), Float.parseFloat(tokens[1]), Float.parseFloat(tokens[2])) : vertex);
            }
         } catch (NumberFormatException var6) {
            throw new ModelFormatException(String.format("Number formatting error at line %d", lineCount), var6);
         }
      } else {
         throw new ModelFormatException("Error parsing entry ('" + line + "', line " + lineCount + ") in file '" + this.fileName + "' - Incorrect format");
      }
   }

   private Vertex parseVertexNormal(String line, int lineCount) throws ModelFormatException {
      Vertex vertexNormal = null;
      if (isValidVertexNormalLine(line)) {
         line = line.substring(line.indexOf(" ") + 1);
         String[] tokens = line.split(" ");

         try {
            return (Vertex)(tokens.length == 3 ? new Vertex(Float.parseFloat(tokens[0]), Float.parseFloat(tokens[1]), Float.parseFloat(tokens[2])) : vertexNormal);
         } catch (NumberFormatException var6) {
            throw new ModelFormatException(String.format("Number formatting error at line %d", lineCount), var6);
         }
      } else {
         throw new ModelFormatException("Error parsing entry ('" + line + "', line " + lineCount + ") in file '" + this.fileName + "' - Incorrect format");
      }
   }

   private TextureCoordinate parseTextureCoordinate(String line, int lineCount) throws ModelFormatException {
      TextureCoordinate textureCoordinate = null;
      if (isValidTextureCoordinateLine(line)) {
         line = line.substring(line.indexOf(" ") + 1);
         String[] tokens = line.split(" ");

         try {
            if (tokens.length == 2) {
               return new TextureCoordinate(Float.parseFloat(tokens[0]), 1.0F - Float.parseFloat(tokens[1]));
            } else {
               return (TextureCoordinate)(tokens.length == 3 ? new TextureCoordinate(Float.parseFloat(tokens[0]), 1.0F - Float.parseFloat(tokens[1]), Float.parseFloat(tokens[2])) : textureCoordinate);
            }
         } catch (NumberFormatException var6) {
            throw new ModelFormatException(String.format("Number formatting error at line %d", lineCount), var6);
         }
      } else {
         throw new ModelFormatException("Error parsing entry ('" + line + "', line " + lineCount + ") in file '" + this.fileName + "' - Incorrect format");
      }
   }

   private Face parseFace(String line, int lineCount) throws ModelFormatException {
      Face face = null;
      if (isValidFaceLine(line)) {
         face = new Face();
         String trimmedLine = line.substring(line.indexOf(" ") + 1);
         String[] tokens = trimmedLine.split(" ");
         String[] subTokens = null;
         if (tokens.length == 3) {
            if (this.currentGroupObject.glDrawingMode == -1) {
               this.currentGroupObject.glDrawingMode = 4;
            } else if (this.currentGroupObject.glDrawingMode != 4) {
               throw new ModelFormatException("Error parsing entry ('" + line + "', line " + lineCount + ") in file '" + this.fileName + "' - Invalid number of points for face (expected 4, found " + tokens.length + ")");
            }
         } else if (tokens.length == 4) {
            if (this.currentGroupObject.glDrawingMode == -1) {
               this.currentGroupObject.glDrawingMode = 7;
            } else if (this.currentGroupObject.glDrawingMode != 7) {
               throw new ModelFormatException("Error parsing entry ('" + line + "', line " + lineCount + ") in file '" + this.fileName + "' - Invalid number of points for face (expected 3, found " + tokens.length + ")");
            }
         }

         int i;
         if (isValidFace_V_VT_VN_Line(line)) {
            face.vertices = new Vertex[tokens.length];
            face.textureCoordinates = new TextureCoordinate[tokens.length];
            face.vertexNormals = new Vertex[tokens.length];

            for(i = 0; i < tokens.length; ++i) {
               subTokens = tokens[i].split("/");
               face.vertices[i] = (Vertex)this.vertices.get(Integer.parseInt(subTokens[0]) - 1);
               face.textureCoordinates[i] = (TextureCoordinate)this.textureCoordinates.get(Integer.parseInt(subTokens[1]) - 1);
               face.vertexNormals[i] = (Vertex)this.vertexNormals.get(Integer.parseInt(subTokens[2]) - 1);
            }

            face.faceNormal = face.calculateFaceNormal();
         } else if (isValidFace_V_VT_Line(line)) {
            face.vertices = new Vertex[tokens.length];
            face.textureCoordinates = new TextureCoordinate[tokens.length];

            for(i = 0; i < tokens.length; ++i) {
               subTokens = tokens[i].split("/");
               face.vertices[i] = (Vertex)this.vertices.get(Integer.parseInt(subTokens[0]) - 1);
               face.textureCoordinates[i] = (TextureCoordinate)this.textureCoordinates.get(Integer.parseInt(subTokens[1]) - 1);
            }

            face.faceNormal = face.calculateFaceNormal();
         } else if (isValidFace_V_VN_Line(line)) {
            face.vertices = new Vertex[tokens.length];
            face.vertexNormals = new Vertex[tokens.length];

            for(i = 0; i < tokens.length; ++i) {
               subTokens = tokens[i].split("//");
               face.vertices[i] = (Vertex)this.vertices.get(Integer.parseInt(subTokens[0]) - 1);
               face.vertexNormals[i] = (Vertex)this.vertexNormals.get(Integer.parseInt(subTokens[1]) - 1);
            }

            face.faceNormal = face.calculateFaceNormal();
         } else {
            if (!isValidFace_V_Line(line)) {
               throw new ModelFormatException("Error parsing entry ('" + line + "', line " + lineCount + ") in file '" + this.fileName + "' - Incorrect format");
            }

            face.vertices = new Vertex[tokens.length];

            for(i = 0; i < tokens.length; ++i) {
               face.vertices[i] = (Vertex)this.vertices.get(Integer.parseInt(tokens[i]) - 1);
            }

            face.faceNormal = face.calculateFaceNormal();
         }

         return face;
      } else {
         throw new ModelFormatException("Error parsing entry ('" + line + "', line " + lineCount + ") in file '" + this.fileName + "' - Incorrect format");
      }
   }

   private GroupObject parseGroupObject(String line, int lineCount) throws ModelFormatException {
      GroupObject group = null;
      if (isValidGroupObjectLine(line)) {
         String trimmedLine = line.substring(line.indexOf(" ") + 1);
         if (trimmedLine.length() > 0) {
            group = new GroupObject(trimmedLine);
         }

         return group;
      } else {
         throw new ModelFormatException("Error parsing entry ('" + line + "', line " + lineCount + ") in file '" + this.fileName + "' - Incorrect format");
      }
   }

   private static boolean isValidVertexLine(String line) {
      if (vertexMatcher != null) {
         vertexMatcher.reset();
      }

      vertexMatcher = vertexPattern.matcher(line);
      return vertexMatcher.matches();
   }

   private static boolean isValidVertexNormalLine(String line) {
      if (vertexNormalMatcher != null) {
         vertexNormalMatcher.reset();
      }

      vertexNormalMatcher = vertexNormalPattern.matcher(line);
      return vertexNormalMatcher.matches();
   }

   private static boolean isValidTextureCoordinateLine(String line) {
      if (textureCoordinateMatcher != null) {
         textureCoordinateMatcher.reset();
      }

      textureCoordinateMatcher = textureCoordinatePattern.matcher(line);
      return textureCoordinateMatcher.matches();
   }

   private static boolean isValidFace_V_VT_VN_Line(String line) {
      if (face_V_VT_VN_Matcher != null) {
         face_V_VT_VN_Matcher.reset();
      }

      face_V_VT_VN_Matcher = face_V_VT_VN_Pattern.matcher(line);
      return face_V_VT_VN_Matcher.matches();
   }

   private static boolean isValidFace_V_VT_Line(String line) {
      if (face_V_VT_Matcher != null) {
         face_V_VT_Matcher.reset();
      }

      face_V_VT_Matcher = face_V_VT_Pattern.matcher(line);
      return face_V_VT_Matcher.matches();
   }

   private static boolean isValidFace_V_VN_Line(String line) {
      if (face_V_VN_Matcher != null) {
         face_V_VN_Matcher.reset();
      }

      face_V_VN_Matcher = face_V_VN_Pattern.matcher(line);
      return face_V_VN_Matcher.matches();
   }

   private static boolean isValidFace_V_Line(String line) {
      if (face_V_Matcher != null) {
         face_V_Matcher.reset();
      }

      face_V_Matcher = face_V_Pattern.matcher(line);
      return face_V_Matcher.matches();
   }

   private static boolean isValidFaceLine(String line) {
      return isValidFace_V_VT_VN_Line(line) || isValidFace_V_VT_Line(line) || isValidFace_V_VN_Line(line) || isValidFace_V_Line(line);
   }

   private static boolean isValidGroupObjectLine(String line) {
      if (groupObjectMatcher != null) {
         groupObjectMatcher.reset();
      }

      groupObjectMatcher = groupObjectPattern.matcher(line);
      return groupObjectMatcher.matches();
   }

   public String getType() {
      return "saga";
   }
}
