package dev.krypton;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

// $FF: renamed from: dev.krypton.8h
public enum Innerh {
   public static final Innerh north;
   public static final Innerh south;
   public static final Innerh east;
   public static final Innerh west;
   public static final Innerh northeast;
   public static final Innerh northwest;
   public static final Innerh southeast;
   public static final Innerh southwest;
   // $FF: renamed from: 2 dev.krypton.8h[]
   private static final Innerh[] field_394;
   // $FF: renamed from: 9 java.lang.String
   private static String field_395;
   // $FF: renamed from: a long
   private static final long field_396 = class_228.method_4972(6048617682996198840L, 4521074016680775753L, MethodHandles.lookup().lookupClass()).method_36(195216132345387L);
   // $FF: renamed from: b long[]
   private static final long[] field_397;
   // $FF: renamed from: c java.lang.Integer[]
   private static final Integer[] field_398;
   // $FF: renamed from: d java.util.Map
   private static final Map field_399;
   // $FF: renamed from: e java.lang.Object[]
   private static final Object[] field_400;
   // $FF: renamed from: f java.lang.String[]
   private static final String[] field_401;

   // $FF: renamed from: 1 () dev.krypton.8h
   public Innerh method_899() {
      long var1 = field_396 ^ 75089917271009L;

      8h var10000;
      label80: {
         label81: {
            label82: {
               label83: {
                  label84: {
                     label85: {
                        label86: {
                           try {
                              switch (this.Ê<invokedynamic>(this, -5410104591020555818L, var1)) {
                                 case 0 -> { }
                                 case 1 -> { }
                                 case 2 -> { }
                                 case 3 -> { }
                                 case 4 -> { }
                                 case 5 -> { }
                                 case 6 -> { }
                                 case 7 -> { }
                                 default -> throw new MatchException((String)null, (Throwable)null);
                              }
                           } catch (MatchException var3) {
                              throw method_914(var3);
                           }

                           var10000 = -5409959837368593782L.a<invokedynamic>(-5409959837368593782L, var1);
                           return var10000;
                        }

                        var10000 = -5409639376551097475L.a<invokedynamic>(-5409639376551097475L, var1);
                        return var10000;
                     }

                     var10000 = -5409395679293608215L.a<invokedynamic>(-5409395679293608215L, var1);
                     return var10000;
                  }

                  var10000 = -5410220516082479996L.a<invokedynamic>(-5410220516082479996L, var1);
                  return var10000;
               }

               var10000 = -5410310472648382287L.a<invokedynamic>(-5410310472648382287L, var1);
               return var10000;
            }

            var10000 = -5410489163743240875L.a<invokedynamic>(-5410489163743240875L, var1);
            return var10000;
         }

         var10000 = -5410076376365215480L.a<invokedynamic>(-5410076376365215480L, var1);
         return var10000;
      }

      var10000 = -5409569842766787482L.a<invokedynamic>(-5409569842766787482L, var1);
      return var10000;
   }

   static {
      long var20 = field_396 ^ 122175825464028L;
      field_400 = new Object[20];
      field_401 = new String[20];
      method_915();
      if (method_917() != null) {
         method_918("o5GEt");
      }

      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var13 = 1; var13 < 8; ++var13) {
         var10003[var13] = (byte)((int)(var20 << var13 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[8];
      int var17 = 0;
      String var16 = "\u00ec\u00a9\u00bc@\u0092L\u00f2\u008d\b\u00dbl\u00af3`t\u00d0\u00a7\u0010z\u00e4fZ\u00f3\u0012\u0092\u00b7\u00d8\u00cc1\u00fc\u00b86\u00d5\u00ad\u0010\u0005RRZ\u001d\u001a\u00ee\u00f7G\u00d98\u000e\u00a8\u00e1A\u00c4\b\u008e\u00dca\u00ca=\u0092\u0098:\u0010\u00dd\u008f\u00f0\u00fb\u0017\u00e0\u00b4\u00f6\u00d0mL+\u007f\u00f5\u00aa\u00fc";
      int var18 = "\u00ec\u00a9\u00bc@\u0092L\u00f2\u008d\b\u00dbl\u00af3`t\u00d0\u00a7\u0010z\u00e4fZ\u00f3\u0012\u0092\u00b7\u00d8\u00cc1\u00fc\u00b86\u00d5\u00ad\u0010\u0005RRZ\u001d\u001a\u00ee\u00f7G\u00d98\u000e\u00a8\u00e1A\u00c4\b\u008e\u00dca\u00ca=\u0092\u0098:\u0010\u00dd\u008f\u00f0\u00fb\u0017\u00e0\u00b4\u00f6\u00d0mL+\u007f\u00f5\u00aa\u00fc".length();
      char var15 = '\b';
      int var24 = -1;

      label58:
      while(true) {
         ++var24;
         String var25 = var16.substring(var24, var24 + var15);
         int var10001 = -1;

         while(true) {
            byte[] var19 = var12.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = method_916(var19).intern();
            switch (var10001) {
               case 0:
                  var11[var17++] = var36;
                  if ((var24 += var15) >= var18) {
                     field_399 = new HashMap(13);
                     Cipher var0;
                     Cipher var27 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var38 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var27.init(2, var38.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[5];
                     int var3 = 0;
                     String var4 = "\u00fes\u00f9\u00ff\u001d\u00c2Y\u0090\u009f\u00e2\u0091B\u008bf\u00b4\u00c2\u00043\u00c8i\u0095\u00aa\u00f7\u00d6";
                     int var5 = "\u00fes\u00f9\u00ff\u001d\u00c2Y\u0090\u009f\u00e2\u0091B\u008bf\u00b4\u00c2\u00043\u00c8i\u0095\u00aa\u00f7\u00d6".length();
                     int var2 = 0;

                     label40:
                     while(true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var28 = var6;
                        var10001 = var3++;
                        long var39 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        byte var43 = -1;

                        while(true) {
                           long var8 = var39;
                           byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                           long var45 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                           switch (var43) {
                              case 0:
                                 var28[var10001] = var45;
                                 if (var2 >= var5) {
                                    field_397 = var6;
                                    field_398 = new Integer[5];
                                    north = new Innerh(var11[6], 0);
                                    south = new Innerh(var11[4], 1);
                                    east = new Innerh(var11[1], 2);
                                    west = new Innerh(var11[0], 3);
                                    northeast = new Innerh(var11[2], 4);
                                    northwest = new Innerh(var11[5], 5);
                                    southeast = new Innerh(var11[3], true.h<invokedynamic>(22874, 153249467429771097L ^ var20));
                                    southwest = new Innerh(var11[7], true.h<invokedynamic>(10865, 4368206427796907121L ^ var20));
                                    field_394 = -6496635952798022439L.R<invokedynamic>(-6496635952798022439L, var20);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label40;
                                 }

                                 var4 = "G\u00ee,v\u0003\u0094\u0097\u008d(~\u00fa\u00ce\u00fa-t'";
                                 var5 = "G\u00ee,v\u0003\u0094\u0097\u008d(~\u00fa\u00ce\u00fa-t'".length();
                                 var2 = 0;
                           }

                           var10001 = var2;
                           var2 += 8;
                           var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                           var28 = var6;
                           var10001 = var3++;
                           var39 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                           var43 = 0;
                        }
                     }
                  }

                  var15 = var16.charAt(var24);
                  break;
               default:
                  var11[var17++] = var36;
                  if ((var24 += var15) < var18) {
                     var15 = var16.charAt(var24);
                     continue label58;
                  }

                  var16 = "F\u0018\u00e1\u00d0\\\u00c9\u008bW\u0010\u0005\u009c\u0096\f*\u009cP\u00c0i\u00d1\\\u00f3e\u00f9\u0013\u00a4";
                  var18 = "F\u0018\u00e1\u00d0\\\u00c9\u008bW\u0010\u0005\u009c\u0096\f*\u009cP\u00c0i\u00d1\\\u00f3e\u00f9\u0013\u00a4".length();
                  var15 = '\b';
                  var24 = -1;
            }

            ++var24;
            var25 = var16.substring(var24, var24 + var15);
            var10001 = 0;
         }
      }
   }

   // $FF: renamed from: b (java.lang.invoke.MethodHandles.Lookup, java.lang.String, java.lang.invoke.MethodType) java.lang.invoke.CallSite
   private static CallSite method_900(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1, var2}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("dev/krypton/8h" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   // $FF: renamed from: b (long, long) java.lang.Class
   private static Class method_901(long var0, long var2) {
      Class var5 = null;
      int var4 = method_913(var0, var2);
      Object var6 = field_400[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(field_401[var4]);
            field_400[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new RuntimeException(var8.toString());
      }

      var5 = (Class)var6;
      return var5;
   }

   // $FF: renamed from: b (java.lang.Class, java.lang.String, java.lang.Class, int, java.lang.Class[]) java.lang.reflect.Method
   private static Method method_902(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = method_907(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for(int var7 = 0; var7 < var6.length; ++var7) {
               var5 = method_902(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   // $FF: renamed from: b (java.lang.Class, java.lang.String, java.lang.Class) java.lang.reflect.Field
   private static Field method_903(Class var0, String var1, Class var2) {
      Field var3 = method_906(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for(int var5 = 0; var5 < var4.length; ++var5) {
               var3 = method_903(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   // $FF: renamed from: c (long, long) java.lang.reflect.Field
   private static Field method_904(long var0, long var2) {
      int var4 = method_913(var0, var2);
      Object var5 = field_400[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = field_401[var4];
         int var7 = var6.indexOf(8);
         Class var8 = method_901(Long.parseLong(var6.substring(0, var7), 36), 0L);
         ++var7;
         int var9 = var6.indexOf(8, var7);
         String var10 = var6.substring(var7, var9);
         ++var9;
         Class var11 = method_901(Long.parseLong(var6.substring(var9), 36), 0L);
         Class var12 = var8;

         while(true) {
            Field var13 = method_906(var12, var10, var11);
            if (var13 != null) {
               field_400[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = method_903(var14[var15], var10, var11);
                  if (var13 != null) {
                     field_400[var4] = var13;
                     return var13;
                  }
               }
            }

            if (var12.getName().equals("java.lang.Object")) {
               StringBuffer var19 = new StringBuffer();
               var19.append("NoSuchFieldException in ").append(var8.getName()).append(' ').append(var11.getName()).append(' ').append(var10);
               throw new RuntimeException(var19.toString());
            }

            var12 = var12.getSuperclass();
            if (var12 == null) {
               var12 = method_901(497567259913927L, 0L);
            }
         }
      }
   }

   // $FF: renamed from: d (long, long) java.lang.reflect.Method
   private static Method method_905(long var0, long var2) {
      int var4 = method_913(var0, var2);
      Object var5 = field_400[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = field_401[var4];
         int var7 = var6.indexOf(8);
         Class var8 = method_901(Long.parseLong(var6.substring(0, var7), 36), 0L);
         ++var7;
         int var9 = var6.indexOf(8, var7);
         String var10 = var6.substring(var7, var9);
         int var11 = -1;
         int var12 = var9;

         do {
            ++var11;
            ++var12;
         } while((var12 = var6.indexOf(8, var12)) > -1);

         int var13;
         Class[] var14 = new Class[var13 = var11 - 1];
         Class var15 = null;
         var12 = var9 + 1;

         for(int var16 = 0; var16 < var11; ++var16) {
            int var17 = var6.indexOf(8, var12);
            var15 = method_901(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while(true) {
            Method var26 = method_907(var23, var10, var15, var13, var14);
            if (var26 != null) {
               field_400[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = method_901(497567259913927L, 0L);
               break;
            }
         }

         var23 = var8;

         while(true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for(int var18 = 0; var18 < var27.length; ++var18) {
                  Method var19 = method_902(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     field_400[var4] = var19;
                     return var19;
                  }
               }
            }

            if (var23.getName().equals("java.lang.Object")) {
               StringBuffer var28 = new StringBuffer();
               var28.append("NoSuchMethodException in ").append(var8.getName()).append(' ').append(var15.getName()).append(' ').append(var10).append('(');
               int var29 = 0;

               while(var29 < var13) {
                  var28.append(var14[var29].getName());
                  ++var29;
                  if (var29 < var13) {
                     var28.append(", ");
                  }
               }

               var28.append(')');
               throw new RuntimeException(var28.toString());
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = method_901(497567259913927L, 0L);
            }
         }
      }
   }

   // $FF: renamed from: a (java.lang.Class, java.lang.String, java.lang.Class) java.lang.reflect.Field
   private static Field method_906(Class var0, String var1, Class var2) {
      for(Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   // $FF: renamed from: a (java.lang.Class, java.lang.String, java.lang.Class, int, java.lang.Class[]) java.lang.reflect.Method
   private static Method method_907(Class var0, String var1, Class var2, int var3, Class[] var4) {
      label33:
      for(Method var8 : var0.getDeclaredMethods()) {
         if (var8.getName().equals(var1) && var8.getReturnType() == var2) {
            Class[] var9 = var8.getParameterTypes();
            if (var9.length == var3) {
               for(int var10 = 0; var10 < var3; ++var10) {
                  if (var9[var10] != var4[var10]) {
                     continue label33;
                  }
               }

               return var8;
            }
         }
      }

      return null;
   }

   // $FF: renamed from: a (java.lang.invoke.MethodHandles.Lookup, java.lang.String, java.lang.invoke.MethodType) java.lang.invoke.CallSite
   private static CallSite method_908(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("dev/krypton/8h" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   // $FF: renamed from: a (java.lang.invoke.MethodHandles.Lookup, java.lang.invoke.MutableCallSite, java.lang.String, java.lang.invoke.MethodType, long, long) java.lang.invoke.MethodHandle
   private static MethodHandle method_909(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      MethodHandle var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 206 && var8 != 223 && var8 != 'a' && var8 != 216) {
            var11 = method_905(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 202) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 'R') {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = method_904(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 206) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 223) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 'a') {
               var9 = var0.findStaticGetter(var12, var20, var14);
            } else {
               var9 = var0.findStaticSetter(var12, var20, var14);
            }
         }

         return MethodHandles.dropArguments(var9, var3.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
      } catch (Exception var15) {
         StringBuilder var13 = new StringBuilder();
         var13.append(var15.getClass().getName()).append(" : ").append(var10 != null ? var10.toString() : (var11 != null ? var11.toString() : " null ")).append(" : ").append(var15.toString());
         throw new RuntimeException(var13.toString());
      }
   }

   // $FF: renamed from: a (java.lang.invoke.MethodHandles.Lookup, java.lang.invoke.MutableCallSite, java.lang.String, java.lang.invoke.MethodType, java.lang.Object[]) java.lang.Object
   private static Object method_910(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      ++var5;
      long var9 = (Long)var4[var5];
      MethodHandle var8 = method_909(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      return var8.asSpreader(Object[].class, var4.length).invoke(var4);
   }

   // $FF: renamed from: a (java.lang.invoke.MethodHandles.Lookup, java.lang.invoke.MutableCallSite, java.lang.String, java.lang.Object[]) int
   private static int method_911(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = method_912(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   // $FF: renamed from: a (int, long) int
   private static int method_912(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11220;
      if (field_398[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = field_397[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = field_399.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               field_399.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("dev/krypton/8h", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         field_398[var3] = var15;
      }

      return field_398[var3];
   }

   // $FF: renamed from: a (long, long) int
   private static int method_913(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (field_401[var4] != null) {
         return var4;
      } else {
         Object var5 = field_400[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 58;
               case 1 -> var10000 = 52;
               case 2 -> var10000 = 56;
               case 3 -> var10000 = 59;
               case 4 -> var10000 = 61;
               case 5 -> var10000 = 10;
               case 6 -> var10000 = 33;
               case 7 -> var10000 = 5;
               case 8 -> var10000 = 26;
               case 9 -> var10000 = 25;
               case 10 -> var10000 = 31;
               case 11 -> var10000 = 55;
               case 12 -> var10000 = 37;
               case 13 -> var10000 = 3;
               case 14 -> var10000 = 2;
               case 15 -> var10000 = 44;
               case 16 -> var10000 = 9;
               case 17 -> var10000 = 46;
               case 18 -> var10000 = 50;
               case 19 -> var10000 = 17;
               case 20 -> var10000 = 62;
               case 21 -> var10000 = 34;
               case 22 -> var10000 = 19;
               case 23 -> var10000 = 24;
               case 24 -> var10000 = 0;
               case 25 -> var10000 = 20;
               case 26 -> var10000 = 15;
               case 27 -> var10000 = 39;
               case 28 -> var10000 = 41;
               case 29 -> var10000 = 6;
               case 30 -> var10000 = 43;
               case 31 -> var10000 = 16;
               case 32 -> var10000 = 29;
               case 33 -> var10000 = 49;
               case 34 -> var10000 = 51;
               case 35 -> var10000 = 30;
               case 36 -> var10000 = 53;
               case 37 -> var10000 = 18;
               case 38 -> var10000 = 36;
               case 39 -> var10000 = 57;
               case 40 -> var10000 = 13;
               case 41 -> var10000 = 32;
               case 42 -> var10000 = 47;
               case 43 -> var10000 = 11;
               case 44 -> var10000 = 28;
               case 45 -> var10000 = 45;
               case 46 -> var10000 = 63;
               case 47 -> var10000 = 48;
               case 48 -> var10000 = 7;
               case 49 -> var10000 = 23;
               case 50 -> var10000 = 54;
               case 51 -> var10000 = 14;
               case 52 -> var10000 = 38;
               case 53 -> var10000 = 8;
               case 54 -> var10000 = 4;
               case 55 -> var10000 = 22;
               case 56 -> var10000 = 27;
               case 57 -> var10000 = 1;
               case 58 -> var10000 = 40;
               case 59 -> var10000 = 21;
               case 60 -> var10000 = 42;
               case 61 -> var10000 = 60;
               case 62 -> var10000 = 12;
               default -> var10000 = 35;
            }

            var6 = var10000;
            int[] var7 = new int[6];

            for(int var8 = 0; var8 < 6; ++var8) {
               int var9 = 7 * (5 - var8);
               int var10 = (int)(var0 >>> var9 & 127L);
               var10 -= var6;
               if (var10 < 0) {
                  var10 += 128;
               }

               var7[var8] = var10;
            }

            char[] var13 = ((String)var5).toCharArray();

            for(int var14 = 0; var14 < var13.length; ++var14) {
               int var16 = var7[var14 % var7.length];
               if (var16 == 0) {
                  break;
               }

               var13[var14] = (char)(var13[var14] ^ var16);
            }

            field_401[var4] = new String(var13);
            return var4;
         }
      }
   }

   // $FF: renamed from: a (java.lang.MatchException) java.lang.MatchException
   private static MatchException method_914(MatchException var0) {
      return var0;
   }

   // $FF: renamed from: a () void
   private static void method_915() {
      Object[] var10000 = field_400;
      var10000[0] = "zM\u0013Hw8gX\u0011\trd&@";
      var10000[1] = Integer.TYPE;
      field_401[1] = "java/lang/Integer";
      var10000[2] = "%C\tg\u001c\n\u0015}\u0014r\u001eK\u0010!UjQ";
      var10000[3] = "\u000b;./l\u0007;\u00053:nF>Yr\"!";
      var10000[4] = "9xw-!%2wfbJ'&t";
      var10000[5] = "\u001d]`#\u001e~\u0016Rqls~\u0016Oe";
      var10000[6] = "\nm\u0013D^a\u0001b\u0002\u000b#y\u0012e\u000bB";
      var10000[7] = "\u0010\u0016Qgh\\\u001b\u0019@(\tR\u0010\u0012Dr";
      var10000[8] = "\u001f\u0011OkJVZQ\u0018TKZ^SF9YF_/\u001ajY\u0002YD_*\u000e";
      var10000[9] = "\\u\u0016\u00003u\u00195A?.d\f*\u0019V-\u001eY{\r^,$\u000er\u0012NI";
      var10000[10] = "\u001c\u0014\u000fl_ YTXSZ&[Vfo\u001b\"\u001fP\r*[u";
      var10000[11] = "~uU\u001ebD;5\u0002!~H87\\LqT>K\u0000\u001fq\u00108 E_&";
      var10000[12] = "z)PL;Q?i\u0007s:];kYs}\u0004/(C\u00188Dx";
      var10000[13] = "Ke@ge\u0001\u000e%\u0017X/jM`V8f\u0016\nc\u00103\u001f";
      var10000[14] = "H\u001eQ0yH\r^\u0006\u000feD\u000e\\X\u000f?\u001d\u001d\u001fBdz]J";
      var10000[15] = "s{HMg\u007fw~\u0002N\u0002>!$ONE.H{@_z%u/UM|@t/L]r+\"!C^\u0002{s:\\F=\u007fvp_#";
      var10000[16] = "gFy/,\u0010\"\u0006.\u00100\u001c!\u0004po;\u0000'x,.?D!\u0013inh";
      var10000[17] = "}\u00033O,\u001f8Cdp;\u001d:AZLh\u001d~G1\t(J";
      var10000[18] = "\u0005oy$%5@/.\u001be^\u0003jo{&\"Di)p";
      var10000[19] = "Y \b>\n'\u001c`_\u0001\u000b+\u0018b\u0001~\u001d7\u0019\u001e]?\u0019s\u001fu\u0018\u007fN";
   }

   // $FF: renamed from: a (byte[]) java.lang.String
   private static String method_916(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for(int var4 = 0; var4 < var2; ++var4) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            ++var4;
            var5 = var0[var4];
            var6 = (char)(var6 | (char)(var5 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << 12);
            ++var4;
            var5 = var0[var4];
            var12 = (char)(var12 | (char)(var5 & 63) << 6);
            ++var4;
            var5 = var0[var4];
            var12 = (char)(var12 | (char)(var5 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }

   // $FF: renamed from: 0 () java.lang.String
   public static String method_917() {
      return field_395;
   }

   // $FF: renamed from: 5 (java.lang.String) void
   public static void method_918(String var0) {
      field_395 = var0;
   }

   // $FF: renamed from: 8 () dev.krypton.8h[]
   private static Innerh[] method_919() {
      long var0 = field_396 ^ 129080909194364L;
      Innerh[] var10000 = new Innerh[true.h<invokedynamic>(25277, 6742537840335110684L ^ var0)];
      var10000[0] = -8397095213749594324L.a<invokedynamic>(-8397095213749594324L, var0);
      var10000[1] = -8397201287826971960L.a<invokedynamic>(-8397201287826971960L, var0);
      var10000[2] = -8399096974374243333L.a<invokedynamic>(-8399096974374243333L, var0);
      var10000[3] = -8397316519354044779L.a<invokedynamic>(-8397316519354044779L, var0);
      var10000[4] = -8397305522802987753L.a<invokedynamic>(-8397305522802987753L, var0);
      var10000[5] = -8399168737179994912L.a<invokedynamic>(-8399168737179994912L, var0);
      var10000[true.h<invokedynamic>(30304, 8918534488784393922L ^ var0)] = -8397462658521320679L.a<invokedynamic>(-8397462658521320679L, var0);
      var10000[true.h<invokedynamic>(9960, 8601745473875379788L ^ var0)] = -8398995168215248524L.a<invokedynamic>(-8398995168215248524L, var0);
      return var10000;
   }

   // $FF: renamed from: 8 () dev.krypton.8h
   public Innerh method_920() {
      long var1 = field_396 ^ 78208146398645L;

      8h var10000;
      label80: {
         label81: {
            label82: {
               label83: {
                  label84: {
                     label85: {
                        label86: {
                           try {
                              switch (this.Ê<invokedynamic>(this, 3656766645131675522L, var1)) {
                                 case 0 -> { }
                                 case 1 -> { }
                                 case 2 -> { }
                                 case 3 -> { }
                                 case 4 -> { }
                                 case 5 -> { }
                                 case 6 -> { }
                                 case 7 -> { }
                                 default -> throw new MatchException((String)null, (Throwable)null);
                              }
                           } catch (MatchException var3) {
                              throw method_914(var3);
                           }

                           var10000 = 3656911191887008990L.a<invokedynamic>(3656911191887008990L, var1);
                           return var10000;
                        }

                        var10000 = 3656652901105732304L.a<invokedynamic>(3656652901105732304L, var1);
                        return var10000;
                     }

                     var10000 = 3655220992159738045L.a<invokedynamic>(3655220992159738045L, var1);
                     return var10000;
                  }

                  var10000 = 3654982038188215593L.a<invokedynamic>(3654982038188215593L, var1);
                  return var10000;
               }

               var10000 = 3656385992134974209L.a<invokedynamic>(3656385992134974209L, var1);
               return var10000;
            }

            var10000 = 3656557997844803301L.a<invokedynamic>(3656557997844803301L, var1);
            return var10000;
         }

         var10000 = 3655053220401170994L.a<invokedynamic>(3655053220401170994L, var1);
         return var10000;
      }

      var10000 = 3656799036609156956L.a<invokedynamic>(3656799036609156956L, var1);
      return var10000;
   }
}
