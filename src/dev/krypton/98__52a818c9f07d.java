/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  java.lang.MatchException
 */
package dev.krypton;

import com.mojang.blaze3d.vertex.VertexFormat;
import dev.krypton._0m;
import dev.krypton._6N;
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
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _98 {
    public static final _8B cfr_renamed_5;
    public static final _8B cfr_renamed_4;
    public static final _8B cfr_renamed_2;
    public static int cfr_renamed_8;
    public static float cfr_renamed_0;
    private static _6N cfr_renamed_6;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static final Object[] h;
    private static final String[] i;

    public static void cfr_renamed_5(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        double d = (Double)objectArray[2];
        double d2 = (Double)objectArray[3];
        double d3 = (Double)objectArray[4];
        double d4 = (Double)objectArray[5];
        double d5 = (Double)objectArray[6];
        double d6 = (Double)objectArray[7];
        double d7 = (Double)objectArray[8];
        double d8 = (Double)objectArray[9];
        _8B b = (_8B)objectArray[10];
        _8B b2 = (_8B)objectArray[11];
        _8B b3 = (_8B)objectArray[12];
        double d9 = (Double)objectArray[13];
        long l3 = ((long)n << 56 | l2 << 8 >>> 8) ^ a;
        long l4 = l3 ^ 0x215A17B3A028L;
        Object[] objectArray2 = new Object[15];
        objectArray2[14] = true;
        objectArray2[13] = true;
        objectArray2[12] = l4;
        objectArray2[11] = d9;
        objectArray2[10] = b3;
        objectArray2[9] = b2;
        objectArray2[8] = b;
        objectArray2[7] = d8;
        objectArray2[6] = d7;
        objectArray2[5] = d6;
        objectArray2[4] = d5;
        objectArray2[3] = d4;
        objectArray2[2] = d3;
        objectArray2[1] = d2;
        objectArray2[0] = d;
        _98.c("\u00d6", (Object)objectArray2, -2590435140099121336L, (long)l3);
    }

    private _98() {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    _98.a = l.a(4971430075384779801L, 3075776629508403342L, MethodHandles.lookup().lookupClass()).a(153225709474455L);
                    var20 = _98.a ^ 24192642587210L;
                    var22_1 = var20 ^ 81131585316131L;
                    _98.h = new Object[72];
                    _98.i = new String[72];
                    _98.a();
                    _98.d = new HashMap<K, V>(13);
                    var11_2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var20 >>> 56);
                    for (var12_3 = 1; var12_3 < 8; ++var12_3) {
                        v2 = v2;
                        v2[var12_3] = (byte)(var20 << var12_3 * 8 >>> 56);
                    }
                    var11_2.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var18_4 = new String[2];
                    var16_5 = 0;
                    var15_6 = "\u00c4\u0006\u00152\u00da\u009b\u0016\u00f0&\u001f\u00f1\u00fd\u0090G7T\u0096\u001fw\u007f(\u00cbX\u001d\u008a\u00c5\u00a9\u00d5\u00ae-CX ^\u00e0Vi\r\u001a4\u00d1\u00a8J\u0007'\u00e3L\u0000\u00af}\u00b7\u00a8\u001d\u0010\u00d1\u00d9\u0004\u00d3\u0092[\u00ce\u008eK(%";
                    var17_7 = "\u00c4\u0006\u00152\u00da\u009b\u0016\u00f0&\u001f\u00f1\u00fd\u0090G7T\u0096\u001fw\u007f(\u00cbX\u001d\u008a\u00c5\u00a9\u00d5\u00ae-CX ^\u00e0Vi\r\u001a4\u00d1\u00a8J\u0007'\u00e3L\u0000\u00af}\u00b7\u00a8\u001d\u0010\u00d1\u00d9\u0004\u00d3\u0092[\u00ce\u008eK(%".length();
                    var14_8 = 32;
                    var13_9 = -1;
lbl25:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl27:
                    // 1 sources

                    while (true) {
                        var18_4[var16_5++] = _98.a(var19_10).intern();
                        if ((var13_9 += var14_8) < var17_7) {
                            var14_8 = var15_6.charAt(var13_9);
                            ** continue;
                        }
                        break block12;
                        break;
                    }
                    v3 = ++var13_9;
                    var19_10 = var11_2.doFinal(var15_6.substring(v3, v3 + var14_8).getBytes("ISO-8859-1"));
                    ** while (true)
                }
                _98.b = var18_4;
                _98.c = new String[2];
                _98.g = new HashMap<K, V>(13);
                var0_11 = Cipher.getInstance("DES/CBC/NoPadding");
                v4 = SecretKeyFactory.getInstance("DES");
                v5 = new byte[8];
                v6 = v5;
                v5[0] = (byte)(var20 >>> 56);
                for (var1_12 = 1; var1_12 < 8; ++var1_12) {
                    v6 = v6;
                    v6[var1_12] = (byte)(var20 << var1_12 * 8 >>> 56);
                }
                var0_11.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                var6_13 = new long[10];
                var3_14 = 0;
                var4_15 = "Y\u000f\u00d8\u0081\u00b6\u00c3\u0088\u00c5t\u0014\u00b2#\u0086\u00f2bXGZ\u00ef&=\u00c2\u00cd\u00aa\u000f\u00d7\u0084\u00c3\u00cb\u00d8\u009fK[\u00f5\u00f1lRK\u00ce\u00e6\u0002\u0093\u00e4u\u00db\u00a0B\u00e8\u00f0\u00b8(\u00f2r\u00e9\t\u00d0\u0012p'\u00dd\u001f\u00deKG";
                var5_16 = "Y\u000f\u00d8\u0081\u00b6\u00c3\u0088\u00c5t\u0014\u00b2#\u0086\u00f2bXGZ\u00ef&=\u00c2\u00cd\u00aa\u000f\u00d7\u0084\u00c3\u00cb\u00d8\u009fK[\u00f5\u00f1lRK\u00ce\u00e6\u0002\u0093\u00e4u\u00db\u00a0B\u00e8\u00f0\u00b8(\u00f2r\u00e9\t\u00d0\u0012p'\u00dd\u001f\u00deKG".length();
                var2_17 = 0;
                while (true) {
                    var7_18 = var4_15.substring(var2_17, var2_17 += 8).getBytes("ISO-8859-1");
                    v7 = var6_13;
                    v8 = var3_14++;
                    v9 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
                    v10 = -1;
                    break block13;
                    break;
                }
lbl63:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_17 < var5_16) ** continue;
                    var4_15 = "p\u00e32\u00b2`+x;\u00b2\u0089\u00ec\u0095&\u00b8\u001b\u00d7";
                    var5_16 = "p\u00e32\u00b2`+x;\u00b2\u0089\u00ec\u0095&\u00b8\u001b\u00d7".length();
                    var2_17 = 0;
                    while (true) {
                        var7_18 = var4_15.substring(var2_17, var2_17 += 8).getBytes("ISO-8859-1");
                        v7 = var6_13;
                        v8 = var3_14++;
                        v9 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
                        v10 = 0;
                        break block13;
                        break;
                    }
                    break;
                }
lbl76:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_17 < var5_16) ** continue;
                    break block14;
                    break;
                }
            }
            var8_19 = v9;
            var10_20 = var0_11.doFinal(new byte[]{(byte)(var8_19 >>> 56), (byte)(var8_19 >>> 48), (byte)(var8_19 >>> 40), (byte)(var8_19 >>> 32), (byte)(var8_19 >>> 24), (byte)(var8_19 >>> 16), (byte)(var8_19 >>> 8), (byte)var8_19});
            v11 = ((long)var10_20[0] & 255L) << 56 | ((long)var10_20[1] & 255L) << 48 | ((long)var10_20[2] & 255L) << 40 | ((long)var10_20[3] & 255L) << 32 | ((long)var10_20[4] & 255L) << 24 | ((long)var10_20[5] & 255L) << 16 | ((long)var10_20[6] & 255L) << 8 | (long)var10_20[7] & 255L;
            switch (v10) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl89:
                // 1 sources

                ** continue;
            }
        }
        _98.e = var6_13;
        _98.f = new Integer[10];
        _98.cfr_renamed_5 = new _8B((int)_98.b("l", (int)8619, (long)(1506821758330649074L ^ var20)), (int)_98.b("l", (int)25554, (long)(3394176740333288323L ^ var20)), var22_1, (int)_98.b("l", (int)23713, (long)(4831637768075035899L ^ var20)), (int)_98.b("l", (int)4271, (long)(2810773429358987506L ^ var20)));
        _98.cfr_renamed_4 = new _8B((int)_98.b("l", (int)30775, (long)(8841529102721540200L ^ var20)), (int)_98.b("l", (int)15834, (long)(3256692003048629633L ^ var20)), var22_1, (int)_98.b("l", (int)15834, (long)(3256692003048629633L ^ var20)), (int)_98.b("l", (int)7471, (long)(2515912322356708735L ^ var20)));
        _98.cfr_renamed_2 = new _8B((int)_98.b("l", (int)15834, (long)(3256692003048629633L ^ var20)), (int)_98.b("l", (int)15834, (long)(3256692003048629633L ^ var20)), var22_1, (int)_98.b("l", (int)15834, (long)(3256692003048629633L ^ var20)), (int)_98.b("l", (int)8593, (long)(2798150012617603529L ^ var20)));
        _98.c("\u00f4", (int)_98.b("l", (int)29017, (long)(835366935965526277L ^ var20)), (long)-1770702183210469240L, (long)var20);
        _98.c("\u00f4", (float)4.0f, (long)-1769314902891901911L, (long)var20);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/98" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x7F24;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])g.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/98", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _98.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _98.b(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _98.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _98.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _98.a(l2, l3);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                _98.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _98.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _98.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/98" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l2, long l3) {
        int n = _98.a(l2, l3);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = _98.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _98.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _98.a(clazz3, string2, clazz2)) != null) {
                    _98.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _98.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _98.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _98.b(2786234143029081L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _98.a(l2, l3);
        Object object = h[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = i[n];
                int n3 = string2.indexOf(8);
                clazz3 = _98.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _98.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _98.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _98.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _98.b(2786234143029081L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _98.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _98.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _98.b(2786234143029081L, 0L);
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x16F1;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l3 = Thread.currentThread().threadId();
                objectArray = (Object[])d.get(l3);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/98", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l2 >>> 56);
            for (int j = 1; j < 8; ++j) {
                byArray[j] = (byte)(l2 << j * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            _98.c[n2] = _98.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _98.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f6' || c == 'o' || c == 'k' || c == '\u00f4') {
                field = _98.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f6' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'o' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'k' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _98.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e6' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d6' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
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
        if (i[n3] != null) {
            return n3;
        }
        Object object = h[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 62;
            case 1 -> 3;
            case 2 -> 59;
            case 3 -> 2;
            case 4 -> 13;
            case 5 -> 23;
            case 6 -> 36;
            case 7 -> 29;
            case 8 -> 8;
            case 9 -> 63;
            case 10 -> 28;
            case 11 -> 37;
            case 12 -> 20;
            case 13 -> 49;
            case 14 -> 40;
            case 15 -> 14;
            case 16 -> 41;
            case 17 -> 56;
            case 18 -> 34;
            case 19 -> 33;
            case 20 -> 44;
            case 21 -> 21;
            case 22 -> 57;
            case 23 -> 0;
            case 24 -> 54;
            case 25 -> 6;
            case 26 -> 46;
            case 27 -> 42;
            case 28 -> 58;
            case 29 -> 47;
            case 30 -> 4;
            case 31 -> 43;
            case 32 -> 39;
            case 33 -> 53;
            case 34 -> 12;
            case 35 -> 27;
            case 36 -> 24;
            case 37 -> 7;
            case 38 -> 11;
            case 39 -> 22;
            case 40 -> 50;
            case 41 -> 17;
            case 42 -> 38;
            case 43 -> 31;
            case 44 -> 60;
            case 45 -> 5;
            case 46 -> 35;
            case 47 -> 10;
            case 48 -> 18;
            case 49 -> 61;
            case 50 -> 55;
            case 51 -> 26;
            case 52 -> 19;
            case 53 -> 1;
            case 54 -> 30;
            case 55 -> 15;
            case 56 -> 16;
            case 57 -> 52;
            case 58 -> 25;
            case 59 -> 32;
            case 60 -> 51;
            case 61 -> 9;
            case 62 -> 45;
            default -> 48;
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
        _98.i[n3] = new String(cArray);
        return n3;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _98.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "nv\u0014  Osc\u0016a%\u00133+";
        objectArray[1] = "ow\u0006\t\u0005Srb\u0004H\u0000\u000f3P";
        objectArray[2] = "1\u0019-\"\u0015{D9&-\u00044%7-&\u0000nQ";
        objectArray[3] = Void.TYPE;
        _98.i[3] = "java/lang/Void";
        objectArray[4] = "r\u0004tV\u0012`\u0007$\u007fY\u0003/f*tR\u0007u\u0012";
        objectArray[5] = "C6\u000e;v'C6\u0019gz(Y}\u0019yz=^\fH\"-";
        objectArray[6] = Integer.TYPE;
        _98.i[6] = "java/lang/Integer";
        objectArray[7] = "j\r\"e.pw\u0018 $+,8&";
        objectArray[8] = "U\u0006n|\u001dN &es\f\u0001A(nx\b[5";
        objectArray[9] = "mc4\\\n1\u0018C?S\u001b~yM4X\u001f$\r";
        objectArray[10] = "-=E\u000eiJ0(GOl\u0016}\u001a";
        objectArray[11] = "KF(hrq>f#gc>_h(lgd+";
        objectArray[12] = "~\\m`\t1\u000b|fo\u0018~jrmd\u001c$\u001e";
        objectArray[13] = "\u001d\u0002/D\n\u0017\u0000\u0017-\u0005\u000fKI\t";
        objectArray[14] = "ipQ2+5`~R{h8f~Fyu>$iYn2?r1jy4.ogzs47kk";
        objectArray[15] = "H\u0005_\bT.=%T\u0007Ea\\+_\fA;(";
        objectArray[16] = "8\"?#\u001eL%7=b\u001b\u0010l*";
        objectArray[17] = "\"i\u0005v\u0002\u001aWI\u000ey\u0013U6G\u0005r\u0017\u000fB";
        objectArray[18] = "RQp:*N[_ssiC]_gqtE\u001fJxl3TC[n:\u0000QDjxl3TC[K}\"V";
        objectArray[19] = "\b3GW7?\u0015&E\u00162cX\u0019";
        objectArray[20] = "\u0000t!cwwuT*lf8\u0014Z!gbb`";
        objectArray[21] = "\u0010}HqhD\u0019sK8+I\u001fs_:6O]pP9cN\u0001a\u000b\u0018u^1gC9`Y ~L<`";
        objectArray[22] = "Z~w(Fk/^|'W$NPw,S~:";
        objectArray[23] = "*6F*@\u000e_\u0016M%QA>\u0018F.U\u001bJ";
        objectArray[24] = ",\u0002\u0018\u0014\u0001VY\"\u0013\u001b\u0010\u00198,\u0018\u0010\u0014CL";
        objectArray[25] = ";\u001c\u000fAFSN<\u0004NW\u001c/2\u000fESF[";
        objectArray[26] = "jJ2P\u007f{\u001fj9_n4~d2Tjn\n";
        objectArray[27] = "d2\u0005f\u0016'\u0011\u0012\u000ei\u0007hp\u001c\u0005b\u00032\u0004";
        objectArray[28] = Float.TYPE;
        _98.i[28] = "java/lang/Float";
        objectArray[29] = "/./ZxH2;-\u001b}\u0014ss";
        objectArray[30] = "i~Nw$)`pM>g$fpY<z\"$aJ),*c\u007fFw\u001b#duF+\u0019/ztO0'#";
        objectArray[31] = "fu\u0012\u0004\u0010\u0007\u0013U\u0019\u000b\u0001Hr[\u0012\u0000\u0005\u0012\u0006";
        objectArray[32] = "V~mN\u0000+#^fA\u0011dBPmJ\u0015>6";
        objectArray[33] = "w[e\u0010SK\u0002{n\u001fB\u0004cue\u0014F^\u0017";
        objectArray[34] = "u\u000b|;6cu\u000bkg:lo@ky:yh19'j9,";
        objectArray[35] = "\u0012\u0001n;\u000bi\u001b\u000fmrHd\u001d\u000fypUb_\u0018fg\u0012c\t@Up\u0014r\u0014\u0016Ez\u0014k\u0010\u001a'v\ng\u0002\u001d\\ S?G";
        objectArray[36] = "\re\u001a4\u0001?xE\u0011;\u0010p\u0019K\u001a0\u0014*m";
        objectArray[37] = "JH\u0019\u00159CW]\u001bT<\u001f\u001c";
        objectArray[38] = "5Kb\u0010\u007fF5KuLsI/\u0000uRs\\(q%\u000f\"";
        objectArray[39] = "d68Y\u0014Io9)\u0016uGd2-L";
        objectArray[40] = "Re@6RT\u0012x\u001f'k^\bo\u001d&<\tU2CJWL\bp\u001cw\u0005A\u0011i";
        objectArray[41] = "2--\u0001j\u007fav?\u0016[|\u000fh>\u000b6\"ricD*E2--\u0001j\u007fav?\u0016[";
        objectArray[42] = "\u0012qbv>*A*pa\u000f-/4q|bwR5,3~\u0010\u0015'lgqj\u00174nj\u000f";
        objectArray[43] = "l7<844,*c)\r>6=a(Zik`<D1,6\"`yc!/;";
        objectArray[44] = "}T)<\u0006\rx\rtecSBO r\u000e\t?N}=\u0012n}T)<\u0006\rx\rtec";
        objectArray[45] = "!A\\ou\u0012$\u0018\u00016\u0010Nq\"@=a\u001cy_A`.\u0000\u001e\u001d[4/\u0014}\u0018\u0002ivq";
        objectArray[46] = "\u0010&r~mR\u0010:/\u0015m \u0005;nx0]\u0004f!dW\u001a\u0016&uk-\u0018\u0005$x\u0015";
        objectArray[47] = "5\\'3&_y\u0001\u007f0\u0019\u0017\u0004\b,3'\u0016cZtbf";
        objectArray[48] = "~\t\bx2<{PU!WaA\u0012\u00016:8<\u0013\\y&_{\u0001\u001c-)%y\u0012\u001e W";
        objectArray[49] = "|=\n-x`q$\u0006 D0\u0016%\b=)jk$Ur5\r}'_6;rqe\u0000/D";
        objectArray[50] = "?NF,f\u00181\u0013\\1\u0006\\SU@8k\u0006.T\u001dwwa>IR,h\u001c/LRr\u0006";
        objectArray[51] = "nj6OG\u0013cs:B{O\u0004r4_\u0016\u0019ysi\u0010\n~opcT\u0004\u0001c2<M{";
        objectArray[52] = "3GGA4e3[\u001a*5\u0017c\nTQ?-0QFF";
        objectArray[53] = "<\u001b%[q\u00181\u0002)VMKV\u0003'K \u0012+\u0002z\u0004<u=\u0001p@2\n1C/YM";
        objectArray[54] = "Fps*eRFl.Af \u0012=.,.\u001cT`c~";
        objectArray[55] = "F` \u0016yZC9}O\u001c\by{)Xq^\u0004zt\u0017m9F` \u0016yZC9}O\u001c";
        objectArray[56] = "\u0015#\u0018<.1\u0010zEeKl\u0014@\u0004n:?M=\u00053u#*\u007f\u001fgt7IzF:-R";
        objectArray[57] = "}W t?\u000b}K}\u001f=y)\u001a}rtEoG0 ";
        objectArray[58] = "|)\fnSC/r\u001eybBAl\u001fd\u000f\u001e<mB+\u0013y{\u007f\u0002\u007f\u001c\u0003yl\u0000rb";
        objectArray[59] = "\nQ\u0010\u000bi\u007f\nMM`l\r\u001fL\f\r4p\u001e\u0011C\u0011S7\fQ\u0017\u001e)5\u001fS\u001a`";
        objectArray[60] = "PD\b#;\u0005\u0003\u001f\u001a4\n\u0006m\u0001\u001b)gX\u0010\u0000Ff{?W\u0012\u00062tEU\u0001\u0004?\n";
        objectArray[61] = "52 {\u0018R5.}\u0010\u0012 ;x4n\u001fB!x.o";
        objectArray[62] = "\u0004N\u000f\u0015\bc\bO]\u001f6fg\u001b^EP<\u0003\u0012\u0011YY";
        objectArray[63] = "9B\u00031N\u0019<\u001b^h+E\u0006Y\n\u007fF\u001d{XW0Zz9B\u00031N\u0019<\u001b^h+";
        objectArray[64] = "eOL\u001a\tf`\u0016\u0011Cl<ZTET\u0001b'U\u0018\u001b\u001d\u0005eOL\u001a\tf`\u0016\u0011Cl";
        objectArray[65] = "\u001e\u000b Y$6\u001e\u0017}2#DO\u0007,@{y\u001d\n5Y";
        objectArray[66] = "a.\u0015\u0018QQl7\u0019\u0015m\u0000\u000b6\u0017\b\u0000[v7JG\u001c<m5\u0013\t\u0017\rg*A\u001dm";
        objectArray[67] = "_Vn;E`\u0007Aa{+sYU`g|'\u0007\u0003;:+zVR4eV\"A]t";
        objectArray[68] = "P ?K`\u007f\u0003{-\\Qyme,A<\"\u0010dq\u000e EQa B4x\u0003l9[Q";
        objectArray[69] = "\u0017$>\u0010\u0001?\u00178c{\u0005MCic\u0016Jq\u00054.D";
        objectArray[70] = "\u0018\\rX+6QR|\u0014\u0017d;-f\u0014~'\u0003Ja\u001ae:";
        Object[] objectArray2 = objectArray;
        objectArray[71] = "K]P\u0015\u0014\u001fLSK\bw\u001d_QY\b\u001b/\u000b\u0010\u0003UwCU\u0014EV\u0013\u0003HKTo";
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/98" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void cfr_renamed_3(Object[] var0) {
        block61: {
            block62: {
                block59: {
                    block60: {
                        block64: {
                            block58: {
                                block57: {
                                    block56: {
                                        block55: {
                                            block51: {
                                                block54: {
                                                    block52: {
                                                        block53: {
                                                            block50: {
                                                                block63: {
                                                                    block49: {
                                                                        block48: {
                                                                            block46: {
                                                                                block47: {
                                                                                    block44: {
                                                                                        block45: {
                                                                                            var7_1 = (Double)var0[0];
                                                                                            var9_2 = (Double)var0[1];
                                                                                            var11_3 = (Double)var0[2];
                                                                                            var13_4 = (Double)var0[3];
                                                                                            var15_5 = (Double)var0[4];
                                                                                            var17_6 = (Double)var0[5];
                                                                                            var19_7 = (Double)var0[6];
                                                                                            var21_8 = (Double)var0[7];
                                                                                            var6_9 = (_8B)var0[8];
                                                                                            var25_10 = (_8B)var0[9];
                                                                                            var5_11 = (_8B)var0[10];
                                                                                            var1_12 = (Double)var0[11];
                                                                                            var3_13 = (Long)var0[12];
                                                                                            var24_14 = (Boolean)var0[13];
                                                                                            var23_15 = (Boolean)var0[14];
                                                                                            v0 = var3_13 = _98.a ^ var3_13;
                                                                                            var26_16 = v0 ^ 120131414314720L;
                                                                                            var28_17 = v0 ^ 116556882960752L;
                                                                                            var30_18 = v0 ^ 94108181090764L;
                                                                                            var32_19 = v0 ^ 25564229287497L;
                                                                                            var34_20 = v0 ^ 89649314419987L;
                                                                                            var36_21 = v0 ^ 46555888866961L;
                                                                                            var38_22 = v0 ^ 61852351462377L;
                                                                                            var40_23 = v0 ^ 65338168497348L;
                                                                                            var42_24 = v0 ^ 17791221004557L;
                                                                                            var44_25 = v0 ^ 5153316086533L;
                                                                                            var46_26 = v0 ^ 140253700782727L;
                                                                                            var48_27 = v0 ^ 139525121448617L;
                                                                                            var50_28 = v0 ^ 127481679681417L;
                                                                                            var52_29 = v0 ^ 35627729875924L;
                                                                                            var54_30 = v0 ^ 127307790183711L;
                                                                                            var56_31 = v0 ^ 101352033026027L;
                                                                                            v1 = v0 ^ 57610206311428L;
                                                                                            var58_32 = (int)(v1 >>> 32);
                                                                                            var59_33 = (int)(v1 << 32 >>> 48);
                                                                                            var60_34 = (int)(v1 << 48 >>> 48);
                                                                                            var61_35 = v0 ^ 41361226435156L;
                                                                                            var63_36 = _0m.cfr_renamed_0();
                                                                                            try {
                                                                                                v2 = var11_3 == var7_1 ? 0 : (var11_3 < var7_1 ? -1 : 1);
                                                                                                if (var63_36) break block44;
                                                                                                if (v2 >= 0) break block45;
                                                                                            }
                                                                                            catch (MatchException v3) {
                                                                                                throw _98.a(v3);
                                                                                            }
                                                                                            var64_37 = var7_1;
                                                                                            var7_1 = var11_3;
                                                                                            var11_3 = var64_37;
                                                                                        }
                                                                                        try {
                                                                                            v4 = var13_4;
                                                                                            if (var3_13 <= 0L) break block46;
                                                                                            v5 = var9_2;
                                                                                            if (var63_36) break block47;
                                                                                            cfr_temp_0 = v4 - v5;
                                                                                            v2 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                                                                                        }
                                                                                        catch (MatchException v6) {
                                                                                            throw _98.a(v6);
                                                                                        }
                                                                                    }
                                                                                    if (v2 < 0) {
                                                                                        var64_37 = var9_2;
                                                                                        var9_2 = var13_4;
                                                                                        var13_4 = var64_37;
                                                                                    }
                                                                                    v7 = var11_3;
                                                                                    v5 = var7_1;
                                                                                }
                                                                                v4 = v7 - v5;
                                                                            }
                                                                            var64_37 = v4;
                                                                            var66_38 = var13_4 - var9_2;
                                                                            try {
                                                                                try {
                                                                                    cfr_temp_1 = var64_37 - 0.0;
                                                                                    v8 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                                                                                    if (var63_36) break block48;
                                                                                    if (v8 <= 0) break block49;
                                                                                }
                                                                                catch (MatchException v9) {
                                                                                    throw _98.a(v9);
                                                                                }
                                                                                cfr_temp_2 = var66_38 - 0.0;
                                                                                v8 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 < 0.0 ? -1 : 1);
                                                                            }
                                                                            catch (MatchException v10) {
                                                                                throw _98.a(v10);
                                                                            }
                                                                        }
                                                                        if (v8 > 0) break block63;
                                                                    }
                                                                    return;
                                                                }
                                                                var68_39 = null;
                                                                try {
                                                                    v11 = var24_14;
                                                                    v12 = var63_36;
                                                                    if (var3_13 > 0L) {
                                                                        if (v12) break block50;
                                                                        if (v11 == false) break block51;
                                                                    }
                                                                    ** GOTO lbl110
                                                                }
                                                                catch (MatchException v13) {
                                                                    throw _98.a(v13);
                                                                }
                                                                v11 = var23_15;
                                                            }
                                                            try {
                                                                try {
                                                                    v12 = var63_36;
lbl110:
                                                                    // 2 sources

                                                                    if (v12) break block52;
                                                                    if (v11 == false) break block53;
                                                                }
                                                                catch (MatchException v14) {
                                                                    throw _98.a(v14);
                                                                }
                                                                v15 = new Object[1];
                                                                v15[0] = var56_31;
                                                                v16 = _98.c("\u00d6", (Object)v15, (long)-9145420505306789492L, (long)var3_13);
                                                                break block54;
                                                            }
                                                            catch (MatchException v17) {
                                                                throw _98.a(v17);
                                                            }
                                                        }
                                                        v11 = _98.c("k", (long)-9148947252202152211L, (long)var3_13);
                                                    }
                                                    v18 = new Object[3];
                                                    v18[2] = var28_17;
                                                    v18[1] = Float.valueOf((float)_98.c("k", (long)-9144706154052605364L, (long)var3_13));
                                                    v18[0] = v11;
                                                    v16 = _98.c("\u00d6", (Object)v18, (long)-9145575180031674817L, (long)var3_13);
                                                }
                                                var68_39 = v16;
                                            }
                                            try {
                                                v19 = var68_39 != null;
                                            }
                                            catch (MatchException v20) {
                                                throw _98.a(v20);
                                            }
                                            var69_40 = v19;
                                            try {
                                                try {
                                                    v21 = var68_39;
                                                    if (var63_36) break block55;
                                                    if (v21 != null) break block56;
                                                }
                                                catch (MatchException v22) {
                                                    throw _98.a(v22);
                                                }
                                                v23 = new Object[1];
                                                v23[0] = var61_35;
                                                v21 = _98.c("\u00d6", (Object)v23, (long)-9145322715111572309L, (long)var3_13);
                                            }
                                            catch (MatchException v24) {
                                                throw _98.a(v24);
                                            }
                                        }
                                        var68_39 = v21;
                                    }
                                    var70_41 = (float)_98.c("\u00f6", (Object)_98.c("\u00e6", (Object)_98.c("k", (long)-9148576862412367115L, (long)var3_13), (long)-9148553952130082628L, (long)var3_13), (long)-9146218779014251820L, (long)var3_13);
                                    var71_42 = (float)_98.c("\u00f6", (Object)_98.c("\u00e6", (Object)_98.c("k", (long)-9148576862412367115L, (long)var3_13), (long)-9148553952130082628L, (long)var3_13), (long)-9145990204096836878L, (long)var3_13);
                                    try {
                                        try {
                                            cfr_temp_3 = var70_41 - 0.0f;
                                            v25 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1);
                                            if (var63_36) break block57;
                                            if (v25 <= 0) break block58;
                                        }
                                        catch (MatchException v26) {
                                            throw _98.a(v26);
                                        }
                                        cfr_temp_4 = var71_42 - 0.0f;
                                        v25 = cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 < 0.0f ? -1 : 1);
                                    }
                                    catch (MatchException v27) {
                                        throw _98.a(v27);
                                    }
                                }
                                if (v25 > 0) break block64;
                            }
                            return;
                        }
                        try {
                            try {
                                v28 = _98.c("k", (long)-9145391205181946305L, (long)var3_13);
                                if (var63_36) break block59;
                                if (v28 != null) break block60;
                            }
                            catch (MatchException v29) {
                                throw _98.a(v29);
                            }
                            _98.c("\u00f4", (_6N)new _6N(var58_32, (VertexFormat)_98.c("k", (long)-9145710073262813024L, (long)var3_13), (VertexFormat.class_5596)_98.c("k", (long)-9148838517417682755L, (long)var3_13), 4, (short)var59_33, (int)_98.b("l", (int)31341, (long)(6997783077164155990L ^ var3_13)), var60_34), (long)-9145391205181946305L, (long)var3_13);
                        }
                        catch (MatchException v30) {
                            throw _98.a(v30);
                        }
                    }
                    v31 = new Object[1];
                    v31[0] = var36_21;
                    _98.c("\u00e6", (Object)_98.c("k", (long)-9145391205181946305L, (long)var3_13), (Object)v31, (long)-9144828712045607897L, (long)var3_13);
                    v32 = new Object[3];
                    v32[2] = var9_2;
                    v32[1] = var7_1;
                    v32[0] = var30_18;
                    v28 = _98.c("\u00e6", (Object)_98.c("k", (long)-9145391205181946305L, (long)var3_13), (Object)v32, (long)-9146133168772186258L, (long)var3_13);
                }
                v33 = new Object[1];
                v33[0] = var50_28;
                var72_43 = _98.c("\u00e6", (Object)v28, (Object)v33, (long)-9148726635567267863L, (long)var3_13);
                v34 = new Object[3];
                v34[2] = var13_4;
                v34[1] = var7_1;
                v34[0] = var30_18;
                v35 = new Object[1];
                v35[0] = var50_28;
                var73_44 = _98.c("\u00e6", (Object)_98.c("\u00e6", (Object)_98.c("k", (long)-9145391205181946305L, (long)var3_13), (Object)v34, (long)-9146133168772186258L, (long)var3_13), (Object)v35, (long)-9148726635567267863L, (long)var3_13);
                v36 = new Object[3];
                v36[2] = var13_4;
                v36[1] = var11_3;
                v36[0] = var30_18;
                v37 = new Object[1];
                v37[0] = var50_28;
                var74_45 = _98.c("\u00e6", (Object)_98.c("\u00e6", (Object)_98.c("k", (long)-9145391205181946305L, (long)var3_13), (Object)v36, (long)-9146133168772186258L, (long)var3_13), (Object)v37, (long)-9148726635567267863L, (long)var3_13);
                v38 = new Object[3];
                v38[2] = var9_2;
                v38[1] = var11_3;
                v38[0] = var30_18;
                v39 = new Object[1];
                v39[0] = var50_28;
                var75_46 = _98.c("\u00e6", (Object)_98.c("\u00e6", (Object)_98.c("k", (long)-9145391205181946305L, (long)var3_13), (Object)v38, (long)-9146133168772186258L, (long)var3_13), (Object)v39, (long)-9148726635567267863L, (long)var3_13);
                v40 = new Object[5];
                v40[4] = (int)var75_46;
                v40[3] = (int)var74_45;
                v40[2] = (int)var73_44;
                v40[1] = (int)var72_43;
                v40[0] = var32_19;
                _98.c("\u00e6", (Object)_98.c("k", (long)-9145391205181946305L, (long)var3_13), (Object)v40, (long)-9146084754579306054L, (long)var3_13);
                v41 = new Object[1];
                v41[0] = var26_16;
                _98.c("\u00e6", (Object)_98.c("k", (long)-9145391205181946305L, (long)var3_13), (Object)v41, (long)-9144978303411795697L, (long)var3_13);
                v42 = new Object[16];
                v42[15] = var69_40;
                v42[14] = Float.valueOf(var71_42);
                v42[13] = Float.valueOf(var70_41);
                v42[12] = Float.valueOf((float)var1_12);
                v42[11] = var5_11;
                v42[10] = var25_10;
                v42[9] = var6_9;
                v42[8] = var38_22;
                v42[7] = Float.valueOf((float)var21_8);
                v42[6] = Float.valueOf((float)var19_7);
                v42[5] = Float.valueOf((float)var17_6);
                v42[4] = Float.valueOf((float)var15_5);
                v42[3] = Float.valueOf((float)var13_4);
                v42[2] = Float.valueOf((float)var11_3);
                v42[1] = Float.valueOf((float)var9_2);
                v42[0] = Float.valueOf((float)var7_1);
                var76_47 = _98.c("\u00d6", (Object)v42, (long)-9145542144359572713L, (long)var3_13);
                try {
                    try {
                        if (var63_36) break block61;
                        if (var68_39 != null) break block62;
                    }
                    catch (MatchException v43) {
                        throw _98.a(v43);
                    }
                    return;
                }
                catch (MatchException v44) {
                    throw _98.a(v44);
                }
            }
            v45 = new Object[1];
            v45[0] = var46_26;
            v46 = new Object[2];
            v46[1] = var34_20;
            v46[0] = _98.c("\u00e6", (Object)_98.c("k", (long)-9148576862412367115L, (long)var3_13), (long)-9148553952130082628L, (long)var3_13);
            v47 = new Object[2];
            v47[1] = var44_25;
            v47[0] = _98.c("k", (long)-9144684577721948417L, (long)var3_13);
            v48 = new Object[2];
            v48[1] = var48_27;
            v48[0] = _98.c("k", (long)-9145391205181946305L, (long)var3_13);
            v49 = new Object[3];
            v49[2] = var52_29;
            v49[1] = var76_47;
            v49[0] = _98.a("e", (int)19312, (long)(1825666508840492185L ^ var3_13));
            v50 = new Object[1];
            v50[0] = var54_30;
            v51 = new Object[4];
            v51[3] = _98.c("\u00d6", (Object)v50, (long)-9148897998620428634L, (long)var3_13);
            v51[2] = var40_23;
            v51[1] = var68_39;
            v51[0] = _98.a("e", (int)23389, (long)(4952301480063159477L ^ var3_13));
            v52 = new Object[1];
            v52[0] = var42_24;
            _98.c("\u00e6", (Object)_98.c("\u00e6", (Object)_98.c("\u00e6", (Object)_98.c("\u00e6", (Object)_98.c("\u00e6", (Object)_98.c("\u00e6", (Object)_98.c("\u00d6", (Object)v45, (long)-9148993816276124484L, (long)var3_13), (Object)v46, (long)-9145920699974625860L, (long)var3_13), (Object)v47, (long)-9144607254962427718L, (long)var3_13), (Object)v48, (long)-9145137756611848105L, (long)var3_13), (Object)v49, (long)-9145099632954906128L, (long)var3_13), (Object)v51, (long)-9145865997576034261L, (long)var3_13), (Object)v52, (long)-9145670025350279666L, (long)var3_13);
        }
    }

    public static void cfr_renamed_7(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        double d3 = (Double)objectArray[2];
        long l2 = (Long)objectArray[3];
        double d4 = (Double)objectArray[4];
        double d5 = (Double)objectArray[5];
        long l3 = (l2 = a ^ l2) ^ 0x1ED9F357707AL;
        Object[] objectArray2 = new Object[14];
        objectArray2[13] = true;
        objectArray2[12] = 2.0;
        objectArray2[11] = l3;
        objectArray2[10] = _98.c("k", 706828568567244593L, (long)l2);
        objectArray2[9] = _98.c("k", 707076119415037644L, (long)l2);
        objectArray2[8] = _98.c("k", 708139802471376625L, (long)l2);
        objectArray2[7] = d5;
        objectArray2[6] = d5;
        objectArray2[5] = d5;
        objectArray2[4] = d5;
        objectArray2[3] = d4;
        objectArray2[2] = d3;
        objectArray2[1] = d2;
        objectArray2[0] = d;
        _98.c("\u00d6", (Object)objectArray2, 707220176791978210L, (long)l2);
    }

    public static void cfr_renamed_9(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        double d3 = (Double)objectArray[2];
        double d4 = (Double)objectArray[3];
        double d5 = (Double)objectArray[4];
        double d6 = (Double)objectArray[5];
        double d7 = (Double)objectArray[6];
        double d8 = (Double)objectArray[7];
        _8B b = (_8B)objectArray[8];
        _8B b2 = (_8B)objectArray[9];
        _8B b3 = (_8B)objectArray[10];
        long l2 = (Long)objectArray[11];
        double d9 = (Double)objectArray[12];
        boolean bl = (Boolean)objectArray[13];
        long l3 = (l2 = a ^ l2) ^ 0x733C4F10F8BCL;
        Object[] objectArray2 = new Object[15];
        objectArray2[14] = false;
        objectArray2[13] = bl;
        objectArray2[12] = l3;
        objectArray2[11] = d9;
        objectArray2[10] = b3;
        objectArray2[9] = b2;
        objectArray2[8] = b;
        objectArray2[7] = d8;
        objectArray2[6] = d7;
        objectArray2[5] = d6;
        objectArray2[4] = d5;
        objectArray2[3] = d4;
        objectArray2[2] = d3;
        objectArray2[1] = d2;
        objectArray2[0] = d;
        _98.c("\u00d6", (Object)objectArray2, -8892147935805929508L, (long)l2);
    }

    public static void cfr_renamed_0(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        double d3 = (Double)objectArray[2];
        long l2 = (Long)objectArray[3];
        double d4 = (Double)objectArray[4];
        double d5 = (Double)objectArray[5];
        _8B b = (_8B)objectArray[6];
        long l3 = (l2 = a ^ l2) ^ 0x3C21498FF1F7L;
        Object[] objectArray2 = new Object[14];
        objectArray2[13] = true;
        objectArray2[12] = 2.0;
        objectArray2[11] = l3;
        objectArray2[10] = _98.c("k", -8628322742727022916L, (long)l2);
        objectArray2[9] = _98.c("k", -8620686818687475903L, (long)l2);
        objectArray2[8] = b;
        objectArray2[7] = d5;
        objectArray2[6] = d5;
        objectArray2[5] = d5;
        objectArray2[4] = d5;
        objectArray2[3] = d4;
        objectArray2[2] = d3;
        objectArray2[1] = d2;
        objectArray2[0] = d;
        _98.c("\u00d6", (Object)objectArray2, -8620540630731046545L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_98.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(_98.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_2() {
        try {
            return MethodHandles.lookup().findStatic(_98.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

