package dev.krypton;

import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.TextureFormat;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1011;
import net.minecraft.class_1044;
import net.minecraft.class_12136;

// $FF: renamed from: dev.krypton.0B
public class InnerB_205 extends class_1044 {
   // $FF: renamed from: 3 dev.krypton.4w[]
   private static Innerw_173[] field_2820;
   // $FF: renamed from: a long
   private static final long field_2821 = class_228.method_4972(1434800453452027566L, 8674884757375062251L, MethodHandles.lookup().lookupClass()).method_36(116195046321846L);
   // $FF: renamed from: b long
   private static final long field_2822;
   // $FF: renamed from: c java.lang.Object[]
   private static final Object[] field_2823 = new Object[60];
   // $FF: renamed from: d java.lang.String[]
   private static final String[] field_2824 = new String[60];

   // $FF: renamed from: 1 () dev.krypton.4w[]
   public static Innerw_173[] method_4631() {
      return field_2820;
   }

   public InnerB_205(int var1, long var2, int var4, byte var5, TextureFormat var6, FilterMode var7, FilterMode var8) {
      long var9 = (var2 << 8 | (long)var5 << 56 >>> 56) ^ field_2821;
      super();
      Innerw_173[] var10000 = method_4631();
      GpuDevice var10002 = 6035817009296907040L.Û<invokedynamic>(6035817009296907040L, var9);
      this.k<invokedynamic>(this, var10002.È<invokedynamic>(var10002, "", (int)field_2822, var6, var1, var4, 1, 1, 6036717779386335859L, var9), 6035279660896699460L, var9);
      Innerw_173[] var11 = var10000;

      try {
         class_12136 var10001 = 6035705833744578010L.Û<invokedynamic>(6035705833744578010L, var9);
         this.k<invokedynamic>(this, var10001.È<invokedynamic>(var10001, 6036220584741384599L.D<invokedynamic>(6036220584741384599L, var9), 6036220584741384599L.D<invokedynamic>(6036220584741384599L, var9), var7, var8, false, 6036036886998550887L, var9), 6036387587780879109L, var9);
         this.k<invokedynamic>(this, 6035817009296907040L.Û<invokedynamic>(6035817009296907040L, var9).È<invokedynamic>(6035817009296907040L.Û<invokedynamic>(6035817009296907040L, var9), this.Æ<invokedynamic>(this, 6035279660896699460L, var9), 6035170254220047170L, var9), 6036313838289999613L, var9);
         if (var11 != null) {
            Innerw_173.method_4081(new String[4]);
         }

      } catch (IllegalArgumentException var12) {
         throw method_4642(var12);
      }
   }

   static {
      method_4644();
      long var0 = field_2821 ^ 23009335606295L;
      method_4648((Innerw_173[])null);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = -1365580600664445185L;
      byte[] var6 = var2.doFinal(new byte[]{(byte)((int)(var4 >>> 56)), (byte)((int)(var4 >>> 48)), (byte)((int)(var4 >>> 40)), (byte)((int)(var4 >>> 32)), (byte)((int)(var4 >>> 24)), (byte)((int)(var4 >>> 16)), (byte)((int)(var4 >>> 8)), (byte)((int)var4)});
      long var7 = ((long)var6[0] & 255L) << 56 | ((long)var6[1] & 255L) << 48 | ((long)var6[2] & 255L) << 40 | ((long)var6[3] & 255L) << 32 | ((long)var6[4] & 255L) << 24 | ((long)var6[5] & 255L) << 16 | ((long)var6[6] & 255L) << 8 | (long)var6[7] & 255L;
      boolean var10001 = true;
      field_2822 = var7;
   }

   // $FF: renamed from: b (java.lang.Class, java.lang.String, java.lang.Class, int, java.lang.Class[]) java.lang.reflect.Method
   private static Method method_4632(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = method_4637(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for(int var7 = 0; var7 < var6.length; ++var7) {
               var5 = method_4632(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   // $FF: renamed from: b (long, long) java.lang.Class
   private static Class method_4633(long var0, long var2) {
      Class var5 = null;
      int var4 = method_4643(var0, var2);
      Object var6 = field_2823[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(field_2824[var4]);
            field_2823[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new RuntimeException(var8.toString());
      }

      var5 = (Class)var6;
      return var5;
   }

   // $FF: renamed from: b (java.lang.Class, java.lang.String, java.lang.Class) java.lang.reflect.Field
   private static Field method_4634(Class var0, String var1, Class var2) {
      Field var3 = method_4638(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for(int var5 = 0; var5 < var4.length; ++var5) {
               var3 = method_4634(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   // $FF: renamed from: c (long, long) java.lang.reflect.Field
   private static Field method_4635(long var0, long var2) {
      int var4 = method_4643(var0, var2);
      Object var5 = field_2823[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = field_2824[var4];
         int var7 = var6.indexOf(8);
         Class var8 = method_4633(Long.parseLong(var6.substring(0, var7), 36), 0L);
         ++var7;
         int var9 = var6.indexOf(8, var7);
         String var10 = var6.substring(var7, var9);
         ++var9;
         Class var11 = method_4633(Long.parseLong(var6.substring(var9), 36), 0L);
         Class var12 = var8;

         while(true) {
            Field var13 = method_4638(var12, var10, var11);
            if (var13 != null) {
               field_2823[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = method_4634(var14[var15], var10, var11);
                  if (var13 != null) {
                     field_2823[var4] = var13;
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
               var12 = method_4633(2015073723085319L, 0L);
            }
         }
      }
   }

   // $FF: renamed from: d (long, long) java.lang.reflect.Method
   private static Method method_4636(long var0, long var2) {
      int var4 = method_4643(var0, var2);
      Object var5 = field_2823[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = field_2824[var4];
         int var7 = var6.indexOf(8);
         Class var8 = method_4633(Long.parseLong(var6.substring(0, var7), 36), 0L);
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
            var15 = method_4633(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while(true) {
            Method var26 = method_4637(var23, var10, var15, var13, var14);
            if (var26 != null) {
               field_2823[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("java.lang.Object")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = method_4633(2015073723085319L, 0L);
               break;
            }
         }

         var23 = var8;

         while(true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for(int var18 = 0; var18 < var27.length; ++var18) {
                  Method var19 = method_4632(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     field_2823[var4] = var19;
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
               var23 = method_4633(2015073723085319L, 0L);
            }
         }
      }
   }

   // $FF: renamed from: a (java.lang.Class, java.lang.String, java.lang.Class, int, java.lang.Class[]) java.lang.reflect.Method
   private static Method method_4637(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   // $FF: renamed from: a (java.lang.Class, java.lang.String, java.lang.Class) java.lang.reflect.Field
   private static Field method_4638(Class var0, String var1, Class var2) {
      for(Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   // $FF: renamed from: a (java.lang.invoke.MethodHandles.Lookup, java.lang.String, java.lang.invoke.MethodType) java.lang.invoke.CallSite
   private static CallSite method_4639(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1, var2}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("dev/krypton/0B" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   // $FF: renamed from: a (java.lang.invoke.MethodHandles.Lookup, java.lang.invoke.MutableCallSite, java.lang.String, java.lang.invoke.MethodType, long, long) java.lang.invoke.MethodHandle
   private static MethodHandle method_4640(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      MethodHandle var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 198 && var8 != 'k' && var8 != 'D' && var8 != 192) {
            var11 = method_4636(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 200) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 219) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = method_4635(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 198) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 'k') {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 'D') {
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
   private static Object method_4641(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      ++var5;
      long var9 = (Long)var4[var5];
      MethodHandle var8 = method_4640(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      return var8.asSpreader(Object[].class, var4.length).invoke(var4);
   }

   // $FF: renamed from: a (java.lang.IllegalArgumentException) java.lang.IllegalArgumentException
   private static IllegalArgumentException method_4642(IllegalArgumentException var0) {
      return var0;
   }

   // $FF: renamed from: a (long, long) int
   private static int method_4643(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (field_2824[var4] != null) {
         return var4;
      } else {
         Object var5 = field_2823[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 34;
               case 1 -> var10000 = 8;
               case 2 -> var10000 = 15;
               case 3 -> var10000 = 39;
               case 4 -> var10000 = 61;
               case 5 -> var10000 = 10;
               case 6 -> var10000 = 0;
               case 7 -> var10000 = 25;
               case 8 -> var10000 = 54;
               case 9 -> var10000 = 11;
               case 10 -> var10000 = 26;
               case 11 -> var10000 = 1;
               case 12 -> var10000 = 29;
               case 13 -> var10000 = 12;
               case 14 -> var10000 = 47;
               case 15 -> var10000 = 45;
               case 16 -> var10000 = 30;
               case 17 -> var10000 = 51;
               case 18 -> var10000 = 62;
               case 19 -> var10000 = 57;
               case 20 -> var10000 = 5;
               case 21 -> var10000 = 60;
               case 22 -> var10000 = 27;
               case 23 -> var10000 = 63;
               case 24 -> var10000 = 6;
               case 25 -> var10000 = 41;
               case 26 -> var10000 = 36;
               case 27 -> var10000 = 19;
               case 28 -> var10000 = 22;
               case 29 -> var10000 = 32;
               case 30 -> var10000 = 50;
               case 31 -> var10000 = 4;
               case 32 -> var10000 = 52;
               case 33 -> var10000 = 28;
               case 34 -> var10000 = 53;
               case 35 -> var10000 = 2;
               case 36 -> var10000 = 44;
               case 37 -> var10000 = 16;
               case 38 -> var10000 = 42;
               case 39 -> var10000 = 21;
               case 40 -> var10000 = 3;
               case 41 -> var10000 = 46;
               case 42 -> var10000 = 9;
               case 43 -> var10000 = 14;
               case 44 -> var10000 = 58;
               case 45 -> var10000 = 35;
               case 46 -> var10000 = 43;
               case 47 -> var10000 = 23;
               case 48 -> var10000 = 37;
               case 49 -> var10000 = 33;
               case 50 -> var10000 = 40;
               case 51 -> var10000 = 13;
               case 52 -> var10000 = 49;
               case 53 -> var10000 = 55;
               case 54 -> var10000 = 17;
               case 55 -> var10000 = 18;
               case 56 -> var10000 = 56;
               case 57 -> var10000 = 38;
               case 58 -> var10000 = 20;
               case 59 -> var10000 = 59;
               case 60 -> var10000 = 7;
               case 61 -> var10000 = 31;
               case 62 -> var10000 = 24;
               default -> var10000 = 48;
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

            field_2824[var4] = new String(var13);
            return var4;
         }
      }
   }

   // $FF: renamed from: a () void
   private static void method_4644() {
      Object[] var10000 = field_2823;
      var10000[0] = "Zo0ZY\fGz2\u001b\\P\u000eH";
      var10000[1] = "l\u0019\u000631ze\u0017\u0005zrwc\u0017\u0011xoq!\u0002\u000ee(`}\u0013\u00183\u001bez\"\u000ee(`}\u0013";
      var10000[2] = Integer.TYPE;
      field_2824[2] = "java/lang/Integer";
      var10000[3] = "y\u0000J\u0011\u000e>p\u000eIXM3v\u000e]ZP54\u001c^L\u00174w\u001c\tx\u0013$^\nQV\u00004";
      var10000[4] = "qlk3gIzcz|\u001aQids5";
      var10000[5] = "0ap;3_9osrpR?ogpmT}zxm*E!kn;\nU+zhg;v<|pt*";
      var10000[6] = "O5_M\u000bmF;\\\u0004H`@;H\u0006Uf\u0002.W\u001b\u0012w^?AM!rY\u000eW\u001b\u0012w^?d\n\u0003u";
      var10000[7] = "\u0015+Dk$_\u0015+S7(P\u000f`S)(E\b\u0011\u0001wx\u0005L";
      var10000[8] = ";+UQet;+B\ri{!`B\u0013in&\u0011\u0010M9.c";
      var10000[9] = ":\u001fp4Db3\u0011s}\u0007o5\u0011g\u007f\u001aiw\u0004xb]x+\u0015n4hi=\u0002xiZ@6\u0014x";
      var10000[10] = "\u0015g\b\rL[\u001ci\u000bD\u000fV\u001ai\u001fF\u0012PX|\u0000[UA\u0004m\u0016\rg]\u001a|\u0000Ql[\u0012m";
      var10000[11] = Boolean.TYPE;
      field_2824[11] = "java/lang/Boolean";
      var10000[12] = ">qs\u0006\u0004 7\u007fpOG-1\u007fdMZ+smg[\u001d*0m0z\f!9{l{\u0010<){s";
      var10000[13] = "]\u0012rq\u0005(]\u0012e-\t'GYe3\t2@(7oYp\u0017\u0014j>\u001b2lF6nZ";
      var10000[14] = "hZQqJ`\u001dzZ~[/|tQu_u\b";
      var10000[15] = "Z3Wk\u001e\u0019G&U*\u001bE\u0006\u0000";
      var10000[16] = "hq";
      var10000[17] = "(J\":Nr]j)5_=<d\">[gH";
      var10000[18] = "Or \u0005>;:R+\n/t[\\ \u0001+./";
      var10000[19] = Void.TYPE;
      field_2824[19] = "java/lang/Void";
      var10000[20] = "\u001cm_\u0014/Z\u001fc\u00077x@\u0013N\\\u0013gQ\u0004";
      var10000[21] = "\u0017C";
      var10000[22] = "N+0VYfK>;VwdG?2\n`eH5$";
      var10000[23] = "LkIH[YEeJ\u0001\u0018TCe^\u0003\u0005R\u0001w]\u0015BSBw\n%Y[BeJ\u0002sXLk@\u0003D";
      var10000[24] = "4\fs33.A,x<\"a \"s7&;T";
      var10000[25] = "1\u0015x\u0003\u0007y1\u0015o_\u000bv+^oA\u000bc,/=\u001d[!";
      var10000[26] = "\nX#YZP\u000fM(YE^\u0016^!\u001a\u0018j\u0000G+\u0005Or\u0011C(";
      var10000[27] = Long.TYPE;
      field_2824[27] = "java/lang/Long";
      var10000[28] = "\u0016uG\\d\u0001\u001dzV\u0013\u0005\u000f\u0016qRI";
      var10000[29] = "f'\u0013]%6!h\u000b%p9'8\bIBjk`W\u0019\u0015mc$P_d)4>\b%";
      var10000[30] = "\u0001\tA\u0016we\u0007\u001c\u001d\u0000\u001crA\u001e\u0014\u0000qR\\\u0016\u0018\u0015zuv\u0015\u0016\u001bptAs\u0012\u001fqp\n\u0016\u0011\fnx;";
      var10000[31] = "\u0012\u000f\u0018\u000e\u007f\u0013VX\u0002V\u0005\rFK$\\d\rKKd\be\u0018\u0016N\u0018\bz\u001e\u00137]Q\u007f_RK]NyZ+";
      var10000[32] = "x^Foc~>\b\u0019 \u001f$>\u000f\u001avv'DZ\u001bj\":8Z\u0004l'C";
      var10000[33] = "w\b\\ui\u001d0GD\r7\u001e'\u0013LZgGwF\u001f\reN;\u0011Fj!\u00181H";
      var10000[34] = "%\":&\u0014ybm\"^Jzu9*\t\u001a &d}^\u0019$`c~9Gvj,";
      var10000[35] = "'M{\u001cq\u0003&\u00175\u001a\u000b\u0001+\u0012\fBs\u0015F\u0015.\u0019`\u0018&\u0017!Gud$\u001e{Nw\u0004&\u0011%[\u000b\u0006/K,Yk\u0004 \u00159%g\u000b-M~\u001fe\u0000#\u0012G";
      var10000[36] = "m9\u001dY[vn*\u0002Qjlx;\f]6t^7\u0000L\u0017ioZI\b\u0016,x+\r_\ft\u0002;H\u000e\u001a~8e\u0002\tR\u0013n5\u001b\nS)l>\u0015Uj";
      var10000[37] = "\u001cQ\u0013s\u0015\u0003MM_}\u007f\u0001LRNp\u00133\u001e\u0013\u0014&Dd\u001fKLkOX\u001c\u0011Nf\u007fZDLR'CY\u001eN_\u0017@\u0005\u0019@\u0012uGUJH.(\u001e\\O\u0012L/N\u000fG.\u0011n\u0002TJ\u0014Lp\u0001\u001e!\u0013\u0011oA\\FMCe\u000ed";
      var10000[38] = "RC(f9\u0005_\n=yS\u0004F\u001f:}>%M\u000e>K.\u0001R\u001f)\u0001j\u000fFO*}j\u0010@JSl=RN\u0018)m(RWr";
      var10000[39] = "\fQyV\u0005g\u000f\u000b{[5\u0001\u007flVci[\fQyV\u0005g\u000f\u000b{[";
      var10000[40] = "\u001ca\r|{k\u001d;Cz\u0001i\u0010>x)mv\u0010 JElb@)[?mw@01'h0\u0016'Q%gn\u0003[";
      var10000[41] = "/\u000ejQ\u0012V.\u001bjHxV/\u001f6E\u0014,/\u000ejQ\u0012V.\u001bjHx";
      var10000[42] = "P\u000egi\u0016G\u000bY4l'M\u0000\u0004h=p\u001fPX<Q\u0016D\nQ=5M\u0013YT";
      var10000[43] = "\u0007k\u0004FK\t@$\u001c>CkZ$\u0016\u0005\u001b\u000b_sF\u0005{\n\u0002*\bSATH-@>";
      var10000[44] = "~\\5%|J9\u0013-]|(#\u0013'f,H&DwfLD,HsdvF'F,]";
      var10000[45] = ")iu\u0010W&w#rX:w,60\r:p':qY\u0000r,4.`";
      var10000[46] = "\nu\u0002.oS\f`^8\u0004DJbW8is]\u007fB9~B04Q}e\u0015\u000btF&a/\toDy}S\tpB|\u0004\u0013\r2A89U[m\u000eD=OJ2G8=PL7>}dU\rvB}{S\b\u000f\u0007$~\u0012Is\u0007;x\u001706^>9VL6A8</\t7B{~^M`X#\u0004";
      var10000[47] = "y;nWz4x.nN\u00106i)SH`'\u007f),\u001e*+hU>K-<~/?^-%\u0014";
      var10000[48] = "c\u0016V\u001aw\u0016e\u0003\n\f\u001c\u0001#\u0001\u0003\fq64\u001c\u0016\rf\u0007\u0007\r\u0007\u000f\u001cSa\u0010U\nm\u00176\n\rp [(\n\f\u0017d\r\"Sj";
      var10000[49] = "\u007f\u001cW\u0010D\u0003~\tW\t.\u0003\u007f\u0017\u0003\u0003H\u0018t\u001dj[N\u0003/\u000b\u0016[Q\u0005*r";
      var10000[50] = "*$@&=5mkX^c6z?P\t0i&d\u0000^4okdF/p8q<";
      var10000[51] = "o\n\rM\u0012W+]\u0017\u0015hI;N?\u0015\u0012C?NqNU\u001b)NL\b\u0003Df2";
      var10000[52] = "j\u000e'\f$\u00061Yt\t\u0015\f:\u0004(XB^jXs4$\u00050Q}P\u007fRcT";
      var10000[53] = "hpg/qI,'}w\u000bW<4DqgD1H\"pq\u0005(4\"ow\u0000Qq{j6A-qdl38";
      var10000[54] = "8IC>$*\u007f\u0006[F(He\u0006Q}t(`Q\u0001}\u0014qeL\u0002?hqzJ\u0007F";
      var10000[55] = "\u0001|^Hl1\u0017%LIWjhr\u001a^.\"\u0014([\b&";
      var10000[56] = "w0h5s4&8/:Ik*'M?,|#6l\u001d o'6\u0016k69#1q:*u-[";
      var10000[57] = "{c\u0012OdI<,\n7k+&,\u0000\f4K#{P\fT\u0012&fSN(\u00129`V7";
      var10000[58] = "\u000b7x6o\u0001Z??9U^V J8+PP1\u0006o/\rQ7zi:QG\\";
      var10000[59] = "%kv\u000b#1{!qCNn)/(\u001c\"\\zlwE\u007f\u000b&:t\u00102k$5*\u0005N";
   }

   // $FF: renamed from: 0 (java.lang.Object[]) net.minecraft.class_1011
   private class_1011 method_4645(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = field_2821 ^ var2;
      long var4 = var2 ^ 122334842861972L;
      long var6 = var2 ^ 98273996215864L;

      class_1011.class_1012 var11;
      label23: {
         try {
            int[] var10000 = 319129634188906353L.D<invokedynamic>(319129634188906353L, var2);
            TextureFormat var10001 = this.Æ<invokedynamic>(this, 318779505789178857L, var2).È<invokedynamic>(this.Æ<invokedynamic>(this, 318779505789178857L, var2), 318873035865912027L, var2);
            switch (var10000[var10001.È<invokedynamic>(var10001, 317558853645279969L, var2)]) {
               case 1 -> var11 = 318977860047096587L.D<invokedynamic>(318977860047096587L, var2);
break label23;
               case 2 -> { }
               default -> throw new IllegalArgumentException();
            }
         } catch (IllegalArgumentException var9) {
            throw method_4642(var9);
         }

         var11 = 318222842468935200L.D<invokedynamic>(318222842468935200L, var2);
      }

      class_1011.class_1012 var8 = var11;
      return new class_1011(var8, this.È<invokedynamic>(this, new Object[]{var6}, 319304194478242339L, var2), this.È<invokedynamic>(this, new Object[]{var4}, 319116474489296553L, var2), false);
   }

   // $FF: renamed from: 4 (java.lang.Object[]) int
   public int method_4646(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = field_2821 ^ var2;
      GpuTexture var10000 = this.È<invokedynamic>(this, -8168941792836047456L, var2);
      return var10000.È<invokedynamic>(var10000, 0, -8168798674358575525L, var2);
   }

   // $FF: renamed from: 5 (java.lang.Object[]) void
   public void method_4647(Object[] var1) {
      byte[] var2 = (byte[])var1[0];
      long var3 = (Long)var1[1];
      var3 = field_2821 ^ var3;
      long var5 = var3 ^ 13565340343625L;
      this.È<invokedynamic>(this, new Object[]{var2.length.Û<invokedynamic>(var2.length, -1069326413276760652L, var3).È<invokedynamic>(var2.length.Û<invokedynamic>(var2.length, -1069326413276760652L, var3), var2, -1068887200306374948L, var3), var5}, -1068953400386332530L, var3);
   }

   // $FF: renamed from: 5 (dev.krypton.4w[]) void
   public static void method_4648(Innerw_173[] var0) {
      field_2820 = var0;
   }

   // $FF: renamed from: 7 (java.lang.Object[]) int
   public int method_4649(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = field_2821 ^ var2;
      GpuTexture var10000 = this.È<invokedynamic>(this, 2381877099147461132L, var2);
      return var10000.È<invokedynamic>(var10000, 0, 2379048296941502181L, var2);
   }

   // $FF: renamed from: 8 (java.lang.Object[]) void
   public void method_4650(Object[] var1) {
      ByteBuffer var2 = (ByteBuffer)var1[0];
      long var3 = (Long)var1[1];
      var3 = field_2821 ^ var3;
      long var5 = var3 ^ 74785449584648L;
      class_1011 var8 = this.È<invokedynamic>(this, new Object[]{var5}, -6975049926273921366L, var3);
      method_4631();
      var2.È<invokedynamic>(var2, -6975207195947004956L, var3);

      try {
         var2.Û<invokedynamic>(var2, -6975105614452863321L, var3).Û<invokedynamic>(var2.Û<invokedynamic>(var2, -6975105614452863321L, var3), var8.È<invokedynamic>(var8, -6973959339223747796L, var3), (long)var2.È<invokedynamic>(var2, -6974625639754757556L, var3), -6975599691887160135L, var3);
         -6973866764727101484L.Û<invokedynamic>(-6973866764727101484L, var3).È<invokedynamic>(-6973866764727101484L.Û<invokedynamic>(-6973866764727101484L, var3), -6971919282824295521L, var3).È<invokedynamic>(-6973866764727101484L.Û<invokedynamic>(-6973866764727101484L, var3).È<invokedynamic>(-6973866764727101484L.Û<invokedynamic>(-6973866764727101484L, var3), -6971919282824295521L, var3), this.Æ<invokedynamic>(this, -6974456967044691792L, var3), var8, -6975961855479719695L, var3);
         var8.È<invokedynamic>(var8, -6975493177970776213L, var3);
         if (Innerw_173.method_4080() == null) {
            method_4648(new Innerw_173[3]);
         }

      } catch (IllegalArgumentException var9) {
         throw method_4642(var9);
      }
   }
}
