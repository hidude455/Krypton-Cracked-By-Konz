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

// $FF: renamed from: dev.krypton.4m
public enum Innerm_165 {
   public static final Innerm_165 Regular;
   public static final Innerm_165 Bold;
   public static final Innerm_165 Italic;
   public static final Innerm_165 BoldItalic;
   // $FF: renamed from: 9 dev.krypton.4m[]
   private static final Innerm_165[] field_2303;
   // $FF: renamed from: a long
   private static final long field_2304 = class_228.method_4972(2791305683177859153L, 4193225042462754000L, MethodHandles.lookup().lookupClass()).method_36(172334019242632L);
   // $FF: renamed from: b java.lang.String[]
   private static final String[] field_2305;
   // $FF: renamed from: c java.lang.String[]
   private static final String[] field_2306;
   // $FF: renamed from: d java.util.Map
   private static final Map field_2307;
   // $FF: renamed from: e java.lang.Object[]
   private static final Object[] field_2308;
   // $FF: renamed from: f java.lang.String[]
   private static final String[] field_2309;

   static {
      long var9 = field_2304 ^ 1379922141928L;
      field_2308 = new Object[19];
      field_2309 = new String[19];
      method_3960();
      field_2307 = new HashMap(13);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[10];
      int var5 = 0;
      String var4 = "\u0095`c\u0085\u00a4\u0013\u008c\u00db\u00ab\u001fz\"<\u001b\u00b3\u008b@6u\u00e4R\u0092\u00c5K\u008e\u00d3\u0095*\u0000\u00d9\u0089\u0007\u0010Z\u000b\u00aa/9\u008e x\u0003\u008f\u00ea\u00cd\n\u00b2\b\u001f\u0010\u00b6\u00d8\u00bfk\u00ab\u00c7|\n\u001f\u0086M\u0088\u0017J\u00bd\u00d4\u0010\u000fj\u00ab\u00bfPM!\u00b3\u008f\u00e3\u0011\u00bc\u00e0'\u00c7L\u0018\u00e2\u0096\u0017\u0003\u0080c\u009fm\u00b3\u0089\u007f\u0084e\u00f5\u0007`\u00fb\u00f1\u00cc\u001cCl\u00ce\u007f i\u00fd\f\u00c7\u00f1\u009a\u00aa<}v\u009e\u00d79L\u00ca7i\u001d\u001av\u00db\u009aE\u00c1%79\u00e5\u00e2\u0006#\r\u0010\u00b0\u008e\u009e^\u00ca\u009e..,\u00ef\u0081\u001f\u00be\u00eb\u00cb\u00f7\u0018\u00dd\u00b6:\u009f\u00ea\u00db7\u008f \u00f1CNt\u009ek\u00a8\u0011\u00d9y(K,\u001c#";
      int var6 = "\u0095`c\u0085\u00a4\u0013\u008c\u00db\u00ab\u001fz\"<\u001b\u00b3\u008b@6u\u00e4R\u0092\u00c5K\u008e\u00d3\u0095*\u0000\u00d9\u0089\u0007\u0010Z\u000b\u00aa/9\u008e x\u0003\u008f\u00ea\u00cd\n\u00b2\b\u001f\u0010\u00b6\u00d8\u00bfk\u00ab\u00c7|\n\u001f\u0086M\u0088\u0017J\u00bd\u00d4\u0010\u000fj\u00ab\u00bfPM!\u00b3\u008f\u00e3\u0011\u00bc\u00e0'\u00c7L\u0018\u00e2\u0096\u0017\u0003\u0080c\u009fm\u00b3\u0089\u007f\u0084e\u00f5\u0007`\u00fb\u00f1\u00cc\u001cCl\u00ce\u007f i\u00fd\f\u00c7\u00f1\u009a\u00aa<}v\u009e\u00d79L\u00ca7i\u001d\u001av\u00db\u009aE\u00c1%79\u00e5\u00e2\u0006#\r\u0010\u00b0\u008e\u009e^\u00ca\u009e..,\u00ef\u0081\u001f\u00be\u00eb\u00cb\u00f7\u0018\u00dd\u00b6:\u009f\u00ea\u00db7\u008f \u00f1CNt\u009ek\u00a8\u0011\u00d9y(K,\u001c#".length();
      char var3 = ' ';
      int var12 = -1;

      label27:
      while(true) {
         ++var12;
         String var13 = var4.substring(var12, var12 + var3);
         byte var10001 = -1;

         while(true) {
            byte[] var8 = var0.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = method_3961(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var19;
                  if ((var12 += var3) >= var6) {
                     field_2305 = var7;
                     field_2306 = new String[10];
                     Regular = new Innerm_165(true.q<invokedynamic>(12276, 3498614572314235572L ^ var9), 0);
                     Bold = new Innerm_165(true.q<invokedynamic>(27062, 374284359308465393L ^ var9), 1);
                     Italic = new Innerm_165(true.q<invokedynamic>(15001, 6105532892821293008L ^ var9), 2);
                     BoldItalic = new Innerm_165(true.q<invokedynamic>(8728, 3084226944173186905L ^ var9), 3);
                     field_2303 = -3105457073317574790L.F<invokedynamic>(-3105457073317574790L, var9);
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var19;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "\u00f2\u00f5\u0015H\u0082\u00e0\u00d0\u008e=\u00a7G\u00e1{\u0015C\u00d0\u0010E\u0099\u00c7\u00c9R\u0007\u0092\u00bf\u00e1\u00ac\u00b2g<K\na";
                  var6 = "\u00f2\u00f5\u0015H\u0082\u00e0\u00d0\u008e=\u00a7G\u00e1{\u0015C\u00d0\u0010E\u0099\u00c7\u00c9R\u0007\u0092\u00bf\u00e1\u00ac\u00b2g<K\na".length();
                  var3 = 16;
                  var12 = -1;
            }

            ++var12;
            var13 = var4.substring(var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   public String toString() {
      long var1 = field_2304 ^ 7569988296276L;

      String var10000;
      label42: {
         label43: {
            try {
               switch (this.A<invokedynamic>(this, -6315209789649425182L, var1)) {
                  case 1:
                     var10000 = 27062.q<invokedynamic>(27062, 374289183572928589L ^ var1);
                     return var10000;
                  case 2:
                     break label42;
                  case 3:
                     break label43;
               }
            } catch (MatchException var3) {
               throw method_3962(var3);
            }

            var10000 = 28406.q<invokedynamic>(28406, 6898864980592275209L ^ var1);
            return var10000;
         }

         var10000 = 2146.q<invokedynamic>(2146, 5518731517200845208L ^ var1);
         return var10000;
      }

      var10000 = 15001.q<invokedynamic>(15001, 6105529187297262444L ^ var1);
      return var10000;
   }

   // $FF: renamed from: b (java.lang.invoke.MethodHandles.Lookup, java.lang.String, java.lang.invoke.MethodType) java.lang.invoke.CallSite
   private static CallSite method_3946(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1, var2}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("dev/krypton/4m" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   // $FF: renamed from: b (long, long) java.lang.Class
   private static Class method_3947(long var0, long var2) {
      Class var5 = null;
      int var4 = method_3952(var0, var2);
      Object var6 = field_2308[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(field_2309[var4]);
            field_2308[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new RuntimeException(var8.toString());
      }

      var5 = (Class)var6;
      return var5;
   }

   // $FF: renamed from: b (java.lang.Class, java.lang.String, java.lang.Class, int, java.lang.Class[]) java.lang.reflect.Method
   private static Method method_3948(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = method_3954(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for(int var7 = 0; var7 < var6.length; ++var7) {
               var5 = method_3948(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   // $FF: renamed from: b (java.lang.Class, java.lang.String, java.lang.Class) java.lang.reflect.Field
   private static Field method_3949(Class var0, String var1, Class var2) {
      Field var3 = method_3953(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for(int var5 = 0; var5 < var4.length; ++var5) {
               var3 = method_3949(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   // $FF: renamed from: c (long, long) java.lang.reflect.Field
   private static Field method_3950(long var0, long var2) {
      int var4 = method_3952(var0, var2);
      Object var5 = field_2308[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = field_2309[var4];
         int var7 = var6.indexOf(8);
         Class var8 = method_3947(Long.parseLong(var6.substring(0, var7), 36), 0L);
         ++var7;
         int var9 = var6.indexOf(8, var7);
         String var10 = var6.substring(var7, var9);
         ++var9;
         Class var11 = method_3947(Long.parseLong(var6.substring(var9), 36), 0L);
         Class var12 = var8;

         while(true) {
            Field var13 = method_3953(var12, var10, var11);
            if (var13 != null) {
               field_2308[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = method_3949(var14[var15], var10, var11);
                  if (var13 != null) {
                     field_2308[var4] = var13;
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
               var12 = method_3947(519486516268902L, 0L);
            }
         }
      }
   }

   // $FF: renamed from: d (long, long) java.lang.reflect.Method
   private static Method method_3951(long var0, long var2) {
      int var4 = method_3952(var0, var2);
      Object var5 = field_2308[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = field_2309[var4];
         int var7 = var6.indexOf(8);
         Class var8 = method_3947(Long.parseLong(var6.substring(0, var7), 36), 0L);
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
            var15 = method_3947(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while(true) {
            Method var26 = method_3954(var23, var10, var15, var13, var14);
            if (var26 != null) {
               field_2308[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = method_3947(519486516268902L, 0L);
               break;
            }
         }

         var23 = var8;

         while(true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for(int var18 = 0; var18 < var27.length; ++var18) {
                  Method var19 = method_3948(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     field_2308[var4] = var19;
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
               var23 = method_3947(519486516268902L, 0L);
            }
         }
      }
   }

   // $FF: renamed from: a (long, long) int
   private static int method_3952(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (field_2309[var4] != null) {
         return var4;
      } else {
         Object var5 = field_2308[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 60;
               case 1 -> var10000 = 27;
               case 2 -> var10000 = 49;
               case 3 -> var10000 = 19;
               case 4 -> var10000 = 61;
               case 5 -> var10000 = 62;
               case 6 -> var10000 = 9;
               case 7 -> var10000 = 24;
               case 8 -> var10000 = 21;
               case 9 -> var10000 = 43;
               case 10 -> var10000 = 14;
               case 11 -> var10000 = 48;
               case 12 -> var10000 = 57;
               case 13 -> var10000 = 17;
               case 14 -> var10000 = 3;
               case 15 -> var10000 = 18;
               case 16 -> var10000 = 2;
               case 17 -> var10000 = 26;
               case 18 -> var10000 = 38;
               case 19 -> var10000 = 11;
               case 20 -> var10000 = 7;
               case 21 -> var10000 = 25;
               case 22 -> var10000 = 42;
               case 23 -> var10000 = 16;
               case 24 -> var10000 = 23;
               case 25 -> var10000 = 13;
               case 26 -> var10000 = 53;
               case 27 -> var10000 = 15;
               case 28 -> var10000 = 50;
               case 29 -> var10000 = 58;
               case 30 -> var10000 = 33;
               case 31 -> var10000 = 8;
               case 32 -> var10000 = 46;
               case 33 -> var10000 = 29;
               case 34 -> var10000 = 36;
               case 35 -> var10000 = 5;
               case 36 -> var10000 = 59;
               case 37 -> var10000 = 35;
               case 38 -> var10000 = 4;
               case 39 -> var10000 = 45;
               case 40 -> var10000 = 30;
               case 41 -> var10000 = 1;
               case 42 -> var10000 = 63;
               case 43 -> var10000 = 10;
               case 44 -> var10000 = 28;
               case 45 -> var10000 = 12;
               case 46 -> var10000 = 34;
               case 47 -> var10000 = 32;
               case 48 -> var10000 = 37;
               case 49 -> var10000 = 31;
               case 50 -> var10000 = 40;
               case 51 -> var10000 = 0;
               case 52 -> var10000 = 20;
               case 53 -> var10000 = 22;
               case 54 -> var10000 = 39;
               case 55 -> var10000 = 44;
               case 56 -> var10000 = 56;
               case 57 -> var10000 = 51;
               case 58 -> var10000 = 55;
               case 59 -> var10000 = 47;
               case 60 -> var10000 = 54;
               case 61 -> var10000 = 52;
               case 62 -> var10000 = 6;
               default -> var10000 = 41;
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

            field_2309[var4] = new String(var13);
            return var4;
         }
      }
   }

   // $FF: renamed from: a (java.lang.Class, java.lang.String, java.lang.Class) java.lang.reflect.Field
   private static Field method_3953(Class var0, String var1, Class var2) {
      for(Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   // $FF: renamed from: a (java.lang.Class, java.lang.String, java.lang.Class, int, java.lang.Class[]) java.lang.reflect.Method
   private static Method method_3954(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   // $FF: renamed from: a (java.lang.invoke.MethodHandles.Lookup, java.lang.invoke.MutableCallSite, java.lang.String, java.lang.invoke.MethodType, long, long) java.lang.invoke.MethodHandle
   private static MethodHandle method_3955(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      MethodHandle var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 'M' && var8 != 210 && var8 != 223 && var8 != 'y') {
            var11 = method_3951(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'A') {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 'F') {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = method_3950(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'M') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 210) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 223) {
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
   private static Object method_3956(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      ++var5;
      long var9 = (Long)var4[var5];
      MethodHandle var8 = method_3955(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      return var8.asSpreader(Object[].class, var4.length).invoke(var4);
   }

   // $FF: renamed from: a (int, long) java.lang.String
   private static String method_3957(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27044;
      if (field_2306[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = field_2307.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               field_2307.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("dev/krypton/4m", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = field_2305[var5].getBytes("ISO-8859-1");
         field_2306[var5] = method_3961(((Cipher)var4[0]).doFinal(var9));
      }

      return field_2306[var5];
   }

   // $FF: renamed from: a (java.lang.invoke.MethodHandles.Lookup, java.lang.invoke.MutableCallSite, java.lang.String, java.lang.Object[]) java.lang.Object
   private static Object method_3958(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = method_3957(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   // $FF: renamed from: a (java.lang.invoke.MethodHandles.Lookup, java.lang.String, java.lang.invoke.MethodType) java.lang.invoke.CallSite
   private static CallSite method_3959(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("dev/krypton/4m" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   // $FF: renamed from: a () void
   private static void method_3960() {
      Object[] var10000 = field_2308;
      var10000[0] = "9hbv)E$}`7,\u0019i`";
      var10000[1] = Integer.TYPE;
      field_2309[1] = "java/lang/Integer";
      var10000[2] = "%A?@!].N.\u000fJ_:M";
      var10000[3] = "t\u0002dLxb\u007f\ru\u0003\u0015b\u007f\u0010a";
      var10000[4] = "\u0010\u00056\u000e\u0017M\u001b\n'AjU\b\r.\b";
      var10000[5] = "R\u000bzrWOb5ggU\u000egi*z\u001a";
      var10000[6] = "q^C%9/A`^0;nD<\u0013-t";
      var10000[7] = "\u0002>\u0015\nYS\t1\u0004E8]\u0002:\u0000\u001f";
      var10000[8] = Boolean.TYPE;
      field_2309[8] = "java/lang/Boolean";
      var10000[9] = "\"U%Xyv<N:5$\u0007{N$Kdh-X=\\\u001f";
      var10000[10] = "\u0011|6V\u0013V\u000fg);\u0012]\u0018o.R\u0011'M4w\u0001\u0005E\u0006js]u";
      var10000[11] = "\u0012.F\u001e\ta\f5Ys%w\u00130y\u000f\u0006t\u001678\u0016\u001dn\u001a:I\b\u0006q";
      var10000[12] = "\u0006.\u0018\u001a\u0002~\u00185\u0007w.h\u00070f\u0012\u0016q\u000e:\u0017\f\rn";
      var10000[13] = "z\u0003\u0015\u001fIjd\u0018\nr\u001e\u001b#\u0018\u0014\fTtu\u000e\r\u001b";
      var10000[14] = "\u001cAk3\u001b#\u0017\u00153&axNT7\u0002\u0006tJ/ns^\"WM%-Z~'";
      var10000[15] = "5\u001czkm\\+\u0007e\u0006JQ9\nem\u000bH\"\u0010i`zV9\u000f";
      var10000[16] = "\u0006d\u0019u=/\u0018\u007f\u0006\u0018\u00013\fk\u0003q!^\u0006d\u0019u=/\u0018\u007f\u0006";
      var10000[17] = "6Ds\u000ee@iXrUXXfG?\\\u001fH\u000f\u0019(\u0000!]t@,\u0001;&4M~K\"\u001d?\u0019&^X\u001fh\u0012}\f>@t\u0013&1";
      var10000[18] = "jY\u001c]w1a\rDH\rg(JICv\nl\u000b\u001d\u001bq5hVDF\r72Y\u0010Jc6#PF'";
   }

   // $FF: renamed from: a (byte[]) java.lang.String
   private static String method_3961(byte[] var0) {
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

   // $FF: renamed from: a (java.lang.MatchException) java.lang.MatchException
   private static MatchException method_3962(MatchException var0) {
      return var0;
   }

   // $FF: renamed from: 0 (java.lang.String) dev.krypton.4m
   public static Innerm_165 method_3963(String param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: 3 () dev.krypton.4m[]
   private static Innerm_165[] method_3964() {
      long var0 = field_2304 ^ 137556280086755L;
      return new Innerm_165[]{2804104794330338310L.ß<invokedynamic>(2804104794330338310L, var0), 2804945328993702244L.ß<invokedynamic>(2804945328993702244L, var0), 2805129553964692132L.ß<invokedynamic>(2805129553964692132L, var0), 2804877084563222191L.ß<invokedynamic>(2804877084563222191L, var0)};
   }
}
