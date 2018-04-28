package api.player.model;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ModelPlayerBaseSorter {
   private Map explicitInferiors;
   private Map explicitSuperiors;
   private Map directInferiorsMap;
   private Map allInferiors;
   private List withoutSuperiors;
   private final List list;
   private final Map allBaseSuperiors;
   private final Map allBaseInferiors;
   private final String methodName;
   private static final Set Empty = new HashSet();

   public ModelPlayerBaseSorter(List list, Map allBaseSuperiors, Map allBaseInferiors, String methodName) {
      this.list = list;
      this.allBaseSuperiors = allBaseSuperiors;
      this.allBaseInferiors = allBaseInferiors;
      this.methodName = methodName;
   }

   public void Sort() {
      if (this.list.size() > 1) {
         if (this.explicitInferiors != null) {
            this.explicitInferiors.clear();
         }

         if (this.explicitSuperiors != null) {
            this.explicitSuperiors.clear();
         }

         if (this.directInferiorsMap != null) {
            this.directInferiorsMap.clear();
         }

         if (this.allInferiors != null) {
            this.allInferiors.clear();
         }

         int offset;
         for(offset = 0; offset < this.list.size(); ++offset) {
            String baseId = (String)this.list.get(offset);
            String[] inferiorNames = (String[])this.allBaseInferiors.get(baseId);
            boolean hasInferiors = inferiorNames != null && inferiorNames.length > 0;
            String[] superiorNames = (String[])this.allBaseSuperiors.get(baseId);
            boolean hasSuperiors = superiorNames != null && superiorNames.length > 0;
            if ((hasInferiors || hasSuperiors) && this.directInferiorsMap == null) {
               this.directInferiorsMap = new Hashtable();
            }

            if (hasInferiors) {
               this.explicitInferiors = build(baseId, this.explicitInferiors, this.directInferiorsMap, (Map)null, inferiorNames);
            }

            if (hasSuperiors) {
               this.explicitSuperiors = build(baseId, this.explicitSuperiors, (Map)null, this.directInferiorsMap, superiorNames);
            }
         }

         int size;
         Set inferiors;
         if (this.directInferiorsMap != null) {
            for(offset = 0; offset < this.list.size() - 1; ++offset) {
               for(size = offset + 1; size < this.list.size(); ++size) {
                  String left = (String)this.list.get(offset);
                  String right = (String)this.list.get(size);
                  Set leftInferiors = null;
                  inferiors = null;
                  if (this.explicitInferiors != null) {
                     leftInferiors = (Set)this.explicitInferiors.get(left);
                     inferiors = (Set)this.explicitInferiors.get(right);
                  }

                  Set leftSuperiors = null;
                  Set rightSuperiors = null;
                  if (this.explicitSuperiors != null) {
                     leftSuperiors = (Set)this.explicitSuperiors.get(left);
                     rightSuperiors = (Set)this.explicitSuperiors.get(right);
                  }

                  boolean leftWantsToBeInferiorToRight = leftSuperiors != null && leftSuperiors.contains(right);
                  boolean leftWantsToBeSuperiorToRight = leftInferiors != null && leftInferiors.contains(right);
                  boolean rightWantsToBeInferiorToLeft = rightSuperiors != null && rightSuperiors.contains(left);
                  boolean rightWantsToBeSuperiorToLeft = inferiors != null && inferiors.contains(left);
                  if (leftWantsToBeInferiorToRight && rightWantsToBeInferiorToLeft) {
                     throw new UnsupportedOperationException("Can not sort ModelPlayerBase classes for method '" + this.methodName + "'. '" + left + "' wants to be inferior to '" + right + "' and '" + right + "' wants to be inferior to '" + left + "'");
                  }

                  if (leftWantsToBeSuperiorToRight && rightWantsToBeSuperiorToLeft) {
                     throw new UnsupportedOperationException("Can not sort ModelPlayerBase classes for method '" + this.methodName + "'. '" + left + "' wants to be superior to '" + right + "' and '" + right + "' wants to be superior to '" + left + "'");
                  }

                  if (leftWantsToBeInferiorToRight && leftWantsToBeSuperiorToRight) {
                     throw new UnsupportedOperationException("Can not sort ModelPlayerBase classes for method '" + this.methodName + "'. '" + left + "' wants to be superior and inferior to '" + right + "'");
                  }

                  if (rightWantsToBeInferiorToLeft && rightWantsToBeSuperiorToLeft) {
                     throw new UnsupportedOperationException("Can not sort ModelPlayerBase classes for method '" + this.methodName + "'. '" + right + "' wants to be superior and inferior to '" + left + "'");
                  }
               }
            }

            if (this.allInferiors == null) {
               this.allInferiors = new Hashtable();
            }

            for(offset = 0; offset < this.list.size(); ++offset) {
               this.build((String)this.list.get(offset), (String)null);
            }
         }

         if (this.withoutSuperiors == null) {
            this.withoutSuperiors = new LinkedList();
         }

         offset = 0;
         size = this.list.size();

         while(size > 1) {
            this.withoutSuperiors.clear();

            int i;
            for(i = offset; i < offset + size; ++i) {
               this.withoutSuperiors.add(this.list.get(i));
            }

            if (this.allInferiors != null) {
               for(i = offset; i < offset + size; ++i) {
                  Set inferiors = (Set)this.allInferiors.get(this.list.get(i));
                  if (inferiors != null) {
                     this.withoutSuperiors.removeAll(inferiors);
                  }
               }
            }

            boolean initial = true;

            for(int i = offset; i < offset + size; ++i) {
               String key = (String)this.list.get(i);
               if (this.withoutSuperiors.contains(key)) {
                  if (initial) {
                     inferiors = null;
                     if (this.allInferiors != null) {
                        inferiors = (Set)this.allInferiors.get(key);
                     }

                     if (inferiors == null || inferiors.isEmpty()) {
                        this.withoutSuperiors.remove(key);
                        --size;
                        ++offset;
                        continue;
                     }
                  }

                  this.list.remove(i--);
                  --size;
               }

               initial = false;
            }

            this.list.addAll(offset + size, this.withoutSuperiors);
         }

      }
   }

   private Set build(String type, String startType) {
      Set inferiors = (Set)this.allInferiors.get(type);
      if (inferiors == null) {
         inferiors = this.build(type, (Set)null, startType != null ? startType : type);
         if (inferiors == null) {
            inferiors = Empty;
         }

         this.allInferiors.put(type, inferiors);
      }

      return inferiors;
   }

   private Set build(String type, Set inferiors, String startType) {
      Set directInferiors = (Set)this.directInferiorsMap.get(type);
      if (directInferiors == null) {
         return (Set)inferiors;
      } else {
         if (inferiors == null) {
            inferiors = new HashSet();
         }

         Iterator iter = directInferiors.iterator();

         while(iter.hasNext()) {
            String inferiorType = (String)iter.next();
            if (inferiorType == startType) {
               throw new UnsupportedOperationException("Can not sort ModelPlayerBase classes for method '" + this.methodName + "'. Circular superiosity found including '" + startType + "'");
            }

            if (this.list.contains(inferiorType)) {
               ((Set)inferiors).add(inferiorType);
            }

            Set inferiorSet;
            try {
               inferiorSet = this.build(inferiorType, startType);
            } catch (UnsupportedOperationException var9) {
               throw new UnsupportedOperationException("Can not sort ModelPlayerBase classes for method '" + this.methodName + "'. Circular superiosity found including '" + inferiorType + "'", var9);
            }

            if (inferiorSet != Empty) {
               ((Set)inferiors).addAll(inferiorSet);
            }
         }

         return (Set)inferiors;
      }
   }

   private static Map build(String baseId, Map map, Map directMap, Map otherDirectMap, String[] names) {
      if (map == null) {
         map = new Hashtable();
      }

      Set types = new HashSet();

      for(int n = 0; n < names.length; ++n) {
         if (names[n] != null) {
            types.add(names[n]);
         }
      }

      if (directMap != null) {
         getOrCreateSet(directMap, baseId).addAll(types);
      }

      if (otherDirectMap != null) {
         Iterator iter = types.iterator();

         while(iter.hasNext()) {
            getOrCreateSet(otherDirectMap, (String)iter.next()).add(baseId);
         }
      }

      ((Map)map).put(baseId, types);
      return (Map)map;
   }

   private static Set getOrCreateSet(Map map, String key) {
      Set value = (Set)map.get(key);
      if (value != null) {
         return value;
      } else {
         Set value = new HashSet();
         map.put(key, value);
         return value;
      }
   }
}
