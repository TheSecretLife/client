package com.voidswrath.modinstaller;

import com.voidswrath.util.Utilities;
import java.awt.EventQueue;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.swing.JOptionPane;

public class Installer implements Runnable {
   private static Thread thread;
   private final File destinationFolder;
   private static final int BUFFERSIZE = 4096;
   private final byte[] data = new byte[4096];

   private Installer(File destinationFolder) {
      this.destinationFolder = destinationFolder;
      Main.instance.progressBar.setStringPainted(true);
   }

   public static void install(File destinationFolder) {
      if (thread == null) {
         thread = new Thread(new Installer(destinationFolder));
         thread.start();
      } else {
         JOptionPane.showMessageDialog(Main.instance, "Another Installation is still in progress.");
      }

   }

   public void run() {
      try {
         File ex = this.outputModToTemp();
         if (ex != null) {
            this.destinationFolder.mkdirs();
            ZipFile zip = null;

            try {
               zip = new ZipFile(ex);
            } catch (Exception var7) {
               throw new Exception("Error locating zip file!", var7);
            }

            Enumeration zipFileEntries = zip.entries();

            while(zipFileEntries.hasMoreElements()) {
               try {
                  this.extractTo(zip, (ZipEntry)zipFileEntries.nextElement(), this.destinationFolder);
               } catch (Exception var6) {
                  throw new Exception("Error extracting zip file!", var6);
               }
            }

            try {
               zip.close();
            } catch (Exception var5) {
               ;
            }

            EventQueue.invokeLater(new ProgressbarUpdater("Deleting Temp File " + ex.getName() + "...", false, -1));
            System.out.println("Deleting Temp File " + ex.getName() + "...");
            if (!ex.delete()) {
               ex.deleteOnExit();
            }

            EventQueue.invokeLater(new ProgressbarUpdater("Complete", false, -2));
            JOptionPane.showMessageDialog(Main.instance, "Installation completed successfully!");
         }
      } catch (Exception var8) {
         JOptionPane.showMessageDialog(Main.instance, "<html><body>Installation Failed!<br />" + var8.getLocalizedMessage() + "</body></html>");
         var8.printStackTrace();
      }

      thread = null;
   }

   private File outputModToTemp() throws Exception {
      File tempfile = null;
      URL modurl = Utilities.class.getResource("/resources/mod.zip");
      if (modurl == null) {
         throw new NullPointerException("/resources/mod.zip could not be found in installer resources!");
      } else {
         BufferedInputStream zipis = new BufferedInputStream(modurl.openStream());
         tempfile = File.createTempFile("tmpmod", ".zip");
         EventQueue.invokeLater(new ProgressbarUpdater("Extracting mod zip...", false, -1));
         System.out.println("Extracting mod zip " + tempfile.getName() + "...");
         BufferedOutputStream zipos = new BufferedOutputStream(new FileOutputStream(tempfile), 4096);
         boolean bytesRead = false;
         int totalRead = 0;
         EventQueue.invokeLater(new ProgressbarUpdater((String)null, true, zipis.available()));

         int bytesRead1;
         while((bytesRead1 = zipis.read(this.data)) != -1) {
            zipos.write(this.data, 0, bytesRead1);
            totalRead += bytesRead1;
            EventQueue.invokeLater(new ProgressbarUpdater((String)null, false, totalRead));
         }

         zipos.flush();
         zipos.close();
         zipis.close();
         return tempfile;
      }
   }

   private void extractTo(ZipFile zip, ZipEntry entry, File destinationFolder) throws Exception {
      String currentEntry = entry.getName();
      File destFile = new File(destinationFolder, currentEntry);
      File destinationParent = destFile.getParentFile();
      destinationParent.mkdirs();
      if (entry.isDirectory()) {
         EventQueue.invokeLater(new ProgressbarUpdater("Creating Directory " + entry.getName() + "...", false, -1));
         System.out.println("Creating Directory " + entry.getName() + "...");
         destFile.mkdirs();
      } else {
         EventQueue.invokeLater(new ProgressbarUpdater("Extracting " + entry.getName() + "...", false, -1));
         System.out.println("Extracting " + entry.getName() + "...");
         InputStream zipIS = null;
         zipIS = zip.getInputStream(entry);
         BufferedInputStream is = new BufferedInputStream(zipIS);
         FileOutputStream fos = new FileOutputStream(destFile);
         BufferedOutputStream dest = new BufferedOutputStream(fos, 4096);
         int totalRead = 0;
         EventQueue.invokeLater(new ProgressbarUpdater((String)null, true, is.available()));
         boolean var12 = false;

         int bytesRead1;
         while((bytesRead1 = is.read(this.data, 0, 4096)) != -1) {
            dest.write(this.data, 0, bytesRead1);
            totalRead += bytesRead1;
            EventQueue.invokeLater(new ProgressbarUpdater((String)null, false, totalRead));
         }

         dest.flush();
         dest.close();
         is.close();
      }

   }
}
