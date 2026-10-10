/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1799
 *  net.minecraft.class_1935
 */
package dev.krypton;

import dev.krypton._8B;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1799;
import net.minecraft.class_1935;

public class _3Y
extends Enum {
    public static final _3Y CLEAR;
    public static final _3Y RAIN;
    public static final _3Y THUNDER;
    final String cfr_renamed_3;
    final String cfr_renamed_0;
    final class_1799 cfr_renamed_2;
    final _8B cfr_renamed_9;
    private static final _3Y[] cfr_renamed_1;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _3Y(class_1799 class_17992, _8B b) {
        void var6_4;
        void var5_3;
        void cfr_renamed_27;
        void cfr_renamed_28;
        this.cfr_renamed_3 = class_17992;
        this.cfr_renamed_0 = b;
        this.cfr_renamed_2 = var5_3;
        this.cfr_renamed_9 = var6_4;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        _3Y.a = l.a(3730610870390153513L, -8067604822644550126L, MethodHandles.lookup().lookupClass()).a(112869477226447L);
                        var20 = _3Y.a ^ 75987925583240L;
                        var22_1 = var20 ^ 51309105480320L;
                        _3Y.b = new Object[18];
                        _3Y.c = new String[18];
                        _3Y.a();
                        var12_2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var13_3 = 1; var13_3 < 8; ++var13_3) {
                            v2 = v2;
                            v2[var13_3] = (byte)(var20 << var13_3 * 8 >>> 56);
                        }
                        var12_2.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var11_4 = new String[9];
                        var17_5 = 0;
                        var16_6 = "\u00ca\u00bb\u009b\u00e0\u00d5\u0005\u0096\u009a\u00f2\u00c9\u00b9\u00d4\u00e4r\u0095\u00c7\u0010\u00f9\u0092\u00a84\u00e5r\u00886j\u0018\u009dit\u00ee\u00adX\b\tX\u00f7\u0017\u00c9\u0080T\u0089\b}\u00c1-\u00e7\u00f4T\u00f3\u00ac\u0010\u00b3#\u00c2e\u0092\u00cbF\u0083\u0016\u00cd\u0016\u0019\n\u00a8\u00b8\u00a0\u0010$q\u00c48\u0092?mM\u00c5;\u00ec\n\"\u00c3/1\b\u00a5\u00beRy\u00f8\u00d8Y\u00be";
                        var18_7 = "\u00ca\u00bb\u009b\u00e0\u00d5\u0005\u0096\u009a\u00f2\u00c9\u00b9\u00d4\u00e4r\u0095\u00c7\u0010\u00f9\u0092\u00a84\u00e5r\u00886j\u0018\u009dit\u00ee\u00adX\b\tX\u00f7\u0017\u00c9\u0080T\u0089\b}\u00c1-\u00e7\u00f4T\u00f3\u00ac\u0010\u00b3#\u00c2e\u0092\u00cbF\u0083\u0016\u00cd\u0016\u0019\n\u00a8\u00b8\u00a0\u0010$q\u00c48\u0092?mM\u00c5;\u00ec\n\"\u00c3/1\b\u00a5\u00beRy\u00f8\u00d8Y\u00be".length();
                        var15_8 = 16;
                        var14_9 = -1;
lbl24:
                        // 2 sources

                        while (true) {
                            v3 = ++var14_9;
                            v4 = var16_6.substring(v3, v3 + var15_8);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl29:
                        // 1 sources

                        while (true) {
                            var11_4[var17_5++] = _3Y.a(var19_10).intern();
                            if ((var14_9 += var15_8) < var18_7) {
                                var15_8 = var16_6.charAt(var14_9);
                                ** continue;
                            }
                            var16_6 = ":}fL\u00afC\u00a8G?my\u00ea!^\u00e0\u0013\b\u0092\u0099j\u00a9\u001c\u0018w\u0018";
                            var18_7 = ":}fL\u00afC\u00a8G?my\u00ea!^\u00e0\u0013\b\u0092\u0099j\u00a9\u001c\u0018w\u0018".length();
                            var15_8 = 16;
                            var14_9 = -1;
lbl38:
                            // 2 sources

                            while (true) {
                                v6 = ++var14_9;
                                v4 = var16_6.substring(v6, v6 + var15_8);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl43:
                        // 1 sources

                        while (true) {
                            var11_4[var17_5++] = _3Y.a(var19_10).intern();
                            if ((var14_9 += var15_8) < var18_7) {
                                var15_8 = var16_6.charAt(var14_9);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_10 = var12_2.doFinal(v4.getBytes("ISO-8859-1"));
                    switch (v5) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl55:
                        // 1 sources

                        ** continue;
                    }
                }
                var1_11 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var2_12 = 1; var2_12 < 8; ++var2_12) {
                    v9 = v9;
                    v9[var2_12] = (byte)(var20 << var2_12 * 8 >>> 56);
                }
                var1_11.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var0_13 = new long[9];
                var4_14 = 0;
                var5_15 = "\f\u00ecTj\u009e\u00f1\u00ab\u0082\u001e\u00bc\u00d7$\u00a4)\u00ddV\u00f8F%\u0013\"G\u00e6\u00a5`S~\u0005,\u009a&\u008c\u00c9\u0015\u00f8=\u00bc\n\u00e2\u00d0\u008e\u00d6\u0087\u001c\u0001\u00c53\u00d4\u00de\u00ccy\u001fH\u00f8x!";
                var6_16 = "\f\u00ecTj\u009e\u00f1\u00ab\u0082\u001e\u00bc\u00d7$\u00a4)\u00ddV\u00f8F%\u0013\"G\u00e6\u00a5`S~\u0005,\u009a&\u008c\u00c9\u0015\u00f8=\u00bc\n\u00e2\u00d0\u008e\u00d6\u0087\u001c\u0001\u00c53\u00d4\u00de\u00ccy\u001fH\u00f8x!".length();
                var3_17 = 0;
                while (true) {
                    var7_18 = var5_15.substring(var3_17, var3_17 += 8).getBytes("ISO-8859-1");
                    v10 = var0_13;
                    v11 = var4_14++;
                    v12 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl79:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var3_17 < var6_16) ** continue;
                    var5_15 = "q\u0087\u00c9\u0083\u00f9\u00d8\u0099\u0098\u00be\u009f%\u00d8O\u00cd\u00f4\u0007";
                    var6_16 = "q\u0087\u00c9\u0083\u00f9\u00d8\u0099\u0098\u00be\u009f%\u00d8O\u00cd\u00f4\u0007".length();
                    var3_17 = 0;
                    while (true) {
                        var7_18 = var5_15.substring(var3_17, var3_17 += 8).getBytes("ISO-8859-1");
                        v10 = var0_13;
                        v11 = var4_14++;
                        v12 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl92:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var3_17 < var6_16) ** continue;
                    break block21;
                    break;
                }
            }
            var8_19 = v12;
            var10_20 = var1_11.doFinal(new byte[]{(byte)(var8_19 >>> 56), (byte)(var8_19 >>> 48), (byte)(var8_19 >>> 40), (byte)(var8_19 >>> 32), (byte)(var8_19 >>> 24), (byte)(var8_19 >>> 16), (byte)(var8_19 >>> 8), (byte)var8_19});
            v14 = ((long)var10_20[0] & 255L) << 56 | ((long)var10_20[1] & 255L) << 48 | ((long)var10_20[2] & 255L) << 40 | ((long)var10_20[3] & 255L) << 32 | ((long)var10_20[4] & 255L) << 24 | ((long)var10_20[5] & 255L) << 16 | ((long)var10_20[6] & 255L) << 8 | (long)var10_20[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl105:
                // 1 sources

                ** continue;
            }
        }
        _3Y.CLEAR = new _3Y(var11_4[3], 0, var11_4[4], var11_4[7], new class_1799((class_1935)_3Y.a("O", (long)-4549359022944010093L, (long)var20)), new _8B((int)var0_13[1], (int)var0_13[5], var22_1, (int)var0_13[2], (int)var0_13[4]));
        _3Y.RAIN = new _3Y(var11_4[6], 1, var11_4[8], var11_4[1], new class_1799((class_1935)_3Y.a("O", (long)-4549541798157611000L, (long)var20)), new _8B((int)var0_13[3], (int)var0_13[7], var22_1, (int)var0_13[0], (int)var0_13[4]));
        _3Y.THUNDER = new _3Y(var11_4[2], 2, var11_4[0], var11_4[5], new class_1799((class_1935)_3Y.a("O", (long)-4549289029566895760L, (long)var20)), new _8B((int)var0_13[8], (int)var0_13[6], var22_1, (int)var0_13[6], (int)var0_13[4]));
        _3Y.cfr_renamed_1 = _3Y.a("\u00cc", (long)-4549579296359077570L, (long)var20);
    }

    public static _3Y[] values() {
        long l2 = a ^ 0x72A787C2323FL;
        return (_3Y[])((Enum)((Object)_3Y.a("O", 3993386758621388191L, (long)l2))).clone();
    }

    public static _3Y valueOf(String string) {
        long l2 = a ^ 0x518714C3F1C5L;
        return (_3Y)((Object)_3Y.a("\u00cc", _3Y.class, (Object)string, -822121956640138519L, (long)l2));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _3Y.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _3Y.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _3Y.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _3Y.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _3Y.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _3Y.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _3Y.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _3Y.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _3Y.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _3Y.a(clazz3, string2, clazz2)) != null) {
                    _3Y.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _3Y.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _3Y.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _3Y.b(572117257380972L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _3Y.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = c[n];
                int n3 = string2.indexOf(8);
                clazz3 = _3Y.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
                int n4 = string2.indexOf(8, ++n3);
                string = string2.substring(n3, n4);
                int n5 = -1;
                int n6 = n4;
                do {
                    ++n5;
                    ++n6;
                } while ((n6 = string2.indexOf(8, n6)) > -1);
                n2 = n5 - 1;
                classArray2 = new Class[n2];
                clazz2 = null;
                n6 = n4 + 1;
                for (int j = 0; j < n5; ++j) {
                    int n7 = string2.indexOf(8, n6);
                    clazz2 = _3Y.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _3Y.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _3Y.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _3Y.b(572117257380972L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _3Y.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _3Y.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _3Y.b(572117257380972L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n8 = 0;
            while (n8 < n2) {
                stringBuffer.append(classArray2[n8].getName());
                if (++n8 >= n2) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    private static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n) continue;
            for (int j = 0; j < n; ++j) {
                if (classArray2[j] != classArray[j]) continue block0;
            }
            return method;
        }
        return null;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00de' || c == '\u00f9' || c == 'O' || c == 'S') {
                field = _3Y.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00de' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f9' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'O' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _3Y.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e0' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00cc' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _3Y.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/3Y" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int j = 0; j < n2; ++j) {
            char c;
            int n3 = 0xFF & byArray[j];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++j];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (j >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++j];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++j];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    private static int a(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (c[n3] != null) {
            return n3;
        }
        Object object = b[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 15;
            case 1 -> 35;
            case 2 -> 63;
            case 3 -> 30;
            case 4 -> 27;
            case 5 -> 37;
            case 6 -> 54;
            case 7 -> 33;
            case 8 -> 44;
            case 9 -> 60;
            case 10 -> 0;
            case 11 -> 59;
            case 12 -> 51;
            case 13 -> 53;
            case 14 -> 10;
            case 15 -> 20;
            case 16 -> 23;
            case 17 -> 41;
            case 18 -> 8;
            case 19 -> 62;
            case 20 -> 9;
            case 21 -> 19;
            case 22 -> 26;
            case 23 -> 25;
            case 24 -> 40;
            case 25 -> 49;
            case 26 -> 7;
            case 27 -> 12;
            case 28 -> 42;
            case 29 -> 45;
            case 30 -> 13;
            case 31 -> 43;
            case 32 -> 22;
            case 33 -> 50;
            case 34 -> 38;
            case 35 -> 14;
            case 36 -> 11;
            case 37 -> 16;
            case 38 -> 5;
            case 39 -> 17;
            case 40 -> 56;
            case 41 -> 28;
            case 42 -> 46;
            case 43 -> 3;
            case 44 -> 58;
            case 45 -> 2;
            case 46 -> 52;
            case 47 -> 61;
            case 48 -> 48;
            case 49 -> 1;
            case 50 -> 31;
            case 51 -> 36;
            case 52 -> 24;
            case 53 -> 6;
            case 54 -> 57;
            case 55 -> 55;
            case 56 -> 47;
            case 57 -> 21;
            case 58 -> 32;
            case 59 -> 18;
            case 60 -> 34;
            case 61 -> 4;
            case 62 -> 29;
            default -> 39;
        };
        int[] nArray = new int[6];
        int n5 = 0;
        while (n5 < 6) {
            n2 = 7 * (5 - n5);
            n = (int)(l2 >>> n2 & 0x7FL);
            if ((n -= n4) < 0) {
                n += 128;
            }
            nArray[n5] = n;
            ++n5;
        }
        char[] cArray = ((String)object).toCharArray();
        n2 = 0;
        while (n2 < cArray.length) {
            n = nArray[n2 % nArray.length];
            if (n == 0) break;
            cArray[n2] = (char)(cArray[n2] ^ n);
            ++n2;
        }
        _3Y.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "UW<h1\u0017HB>)4K\u0002k";
        objectArray[1] = "k{}\u0001\u001b'[E`\u0014\u0019f^\u0019*=V";
        objectArray[2] = "VZH\u0012)\u001d]UY]B\u001fIV";
        objectArray[3] = "G1\"!87L>3nU7L#'";
        objectArray[4] = "\b\rVd)S\u0003\u0002G+TK\u0010\u0005Nb";
        objectArray[5] = "JS.\u007f\u0016|zm3j\u0014=\u007f1yC[";
        objectArray[6] = "D\u0017rE\u0011%D\u0017e\u0019\u001d*^\\e\u0007\u001d?Y-7SL~";
        objectArray[7] = " \u0013/3[@ \u00138oWO:X8qWZ=)j*\u000f\u001b";
        objectArray[8] = "!FF7'A*IWxFO!BS\"";
        objectArray[9] = "DXp\u007fF1P\u0000'B\u0013C\u0014\u00016sG{M[s.";
        objectArray[10] = "*\"D\u0006u\\>z\u0013;*.z{\u0002\nt\u0016#!GW\u0011";
        objectArray[11] = "\u00194\"&|[J>/:\u0001XDi-'V\u0006\u001a<tK<\f\u001e> ({YL|";
        objectArray[12] = "\fIty<\u0010\u0018\u0011#D\u0004\"=j\u0003\t\u0002b\fIty<\u0010\u0018\u0011#";
        objectArray[13] = "DZ4`\u0006%\u0017P9|{&\u0019\u0007;a,qGWe0{uBQed\u00182\u0017\u0003'";
        objectArray[14] = "`}6\u0007j\u001f3w;\u001b\u0017\u001c= 9\u0006@Hcu`S\u0017Ofvg\u0003t\b3$%";
        objectArray[15] = "Z\u001e\"\u001co\tNFu!@?{2C!g\u001e\rF}SsFZ";
        objectArray[16] = "?Cas'_;\u0002fs@\u0010l\u001e'#\u0007\u0000\u0005@ \u007fxU:F?+)n>\u0015>!2Q5\u0000b<@T<Ag)qP}FgN";
        Object[] objectArray2 = objectArray;
        objectArray[17] = "XF_2Q\u007fL\u001e\b\u000foDuedcP6\tG\u0016w\ba";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static _3Y[] cfr_renamed_6() {
        long l2 = a ^ 0x1247319E23D2L;
        return new _3Y[]{_3Y.a("O", 2776360375748737966L, (long)l2), _3Y.a("O", 2774279958514893718L, (long)l2), _3Y.a("O", 2776304130469269230L, (long)l2)};
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_3Y.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

