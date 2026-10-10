/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.FilterMode
 *  com.mojang.blaze3d.textures.TextureFormat
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  java.lang.MatchException
 */
package dev.krypton;

import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.blaze3d.vertex.VertexFormat;
import dev.krypton._0B;
import dev.krypton._6N;
import dev.krypton._8B;
import dev.krypton._93;
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

public class _4 {
    private static final String cfr_renamed_9;
    private static final _93 cfr_renamed_2;
    private static final Map cfr_renamed_0;
    private static _6N cfr_renamed_6;
    private static String cfr_renamed_5;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static final Object[] h;
    private static final String[] i;

    private _4() {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        _4.a = l.a(8425544819718900573L, 8415035422148257631L, MethodHandles.lookup().lookupClass()).a(168774214743864L);
                        _4.h = new Object[99];
                        _4.i = new String[99];
                        _4.a();
                        _4.d = new HashMap<K, V>(13);
                        _4.cfr_renamed_7("zMYgEc");
                        var11 = _4.a ^ 9536830007674L;
                        var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var11 >>> 56);
                        for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                            v2 = v2;
                            v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                        }
                        var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var20_3 = new String[6];
                        var18_4 = 0;
                        var17_5 = "K}\u00b9\u0017\u00fb\u00e0H\u009eH\u00f4\u001c2_&\"\u0086\u00e9kS4RS\u00b3\u00fe\u00f2\u00b2lO\u001f\u00c9\u00f7\u00fc\u00adHn\u00829\u00e4\u00d6h\u0010\"\u00ae\u00c8Z\u008e\u00ca\u00c5\u0014\u00c3\u00f1\t\u00f3\u001c\u00d7O\u00bc@Q\u00f7\u0004\u00ac\u0018\u00fd\u00e9\u009b\u00c9\u00a5Ow\u00f3\u00e6\u0004O\u0012h0\u00a1N\u0005\u0096\u00f0`v$\u00c8&\u009b\u00d8\u008d\u00b2\u0087\u00c2\u00fd\u00dc\u00e2m\u00cas\u00e3\u00ff\u00a3\u0014\u00ce\u00adl#\u00c7\\\u00ed\u00db\u008fI\u00b6ZA\u00c4\u001b)-+D(\u00c7\u009bW\u00f2\u00c6\u00edp\u0011\u00e9\u0084\u00d9\u009d7\u0085\u008d\u0087\u00d8\u0006\u0094\r-\u00b9\u0016D\u00a4%:\u00ea>\u000f\u00ff\r\u0098\u00f0@\u00d5\u0018\u0017\u0002\u00db";
                        var19_6 = "K}\u00b9\u0017\u00fb\u00e0H\u009eH\u00f4\u001c2_&\"\u0086\u00e9kS4RS\u00b3\u00fe\u00f2\u00b2lO\u001f\u00c9\u00f7\u00fc\u00adHn\u00829\u00e4\u00d6h\u0010\"\u00ae\u00c8Z\u008e\u00ca\u00c5\u0014\u00c3\u00f1\t\u00f3\u001c\u00d7O\u00bc@Q\u00f7\u0004\u00ac\u0018\u00fd\u00e9\u009b\u00c9\u00a5Ow\u00f3\u00e6\u0004O\u0012h0\u00a1N\u0005\u0096\u00f0`v$\u00c8&\u009b\u00d8\u008d\u00b2\u0087\u00c2\u00fd\u00dc\u00e2m\u00cas\u00e3\u00ff\u00a3\u0014\u00ce\u00adl#\u00c7\\\u00ed\u00db\u008fI\u00b6ZA\u00c4\u001b)-+D(\u00c7\u009bW\u00f2\u00c6\u00edp\u0011\u00e9\u0084\u00d9\u009d7\u0085\u008d\u0087\u00d8\u0006\u0094\r-\u00b9\u0016D\u00a4%:\u00ea>\u000f\u00ff\r\u0098\u00f0@\u00d5\u0018\u0017\u0002\u00db".length();
                        var16_7 = 40;
                        var15_8 = -1;
lbl24:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl29:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = _4.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00cd\u0080\u00c8v\u00e1r\u001fr\u009c9\u0001\u0001\u00b9\u001d\u0018\u0087\u00e9LF\u00cf\u00c7:nw\u001f\u00f0i\u00d4\u008c\u0091v\u00f0\u0010!\u009c_Q\u0092(\u009e\u00b8\u00bd\u0088\u009b!\u0006\u00ad4\u00da";
                            var19_6 = "\u00cd\u0080\u00c8v\u00e1r\u001fr\u009c9\u0001\u0001\u00b9\u001d\u0018\u0087\u00e9LF\u00cf\u00c7:nw\u001f\u00f0i\u00d4\u008c\u0091v\u00f0\u0010!\u009c_Q\u0092(\u009e\u00b8\u00bd\u0088\u009b!\u0006\u00ad4\u00da".length();
                            var16_7 = 32;
                            var15_8 = -1;
lbl38:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl43:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = _4.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var21_9 = var13_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                _4.b = var20_3;
                _4.c = new String[6];
                _4.cfr_renamed_9 = _4.a("q", (int)26417, (long)(545068493555621713L ^ var11));
                _4.g = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[4];
                var3_13 = 0;
                var4_14 = "<\u00fb+\u00a8<\u0010\u009a\u00bc\u0016v\u00fe\u00fek\u0081\u00d87";
                var5_15 = "<\u00fb+\u00a8<\u0010\u009a\u00bc\u0016v\u00fe\u00fek\u0081\u00d87".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v10 = var6_12;
                    v11 = var3_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl83:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "A\u00b0\u0088}aT\u00e3\u00b1\u001eY\u00aaq\u00b6\u0082R\u008d";
                    var5_15 = "A\u00b0\u0088}aT\u00e3\u00b1\u001eY\u00aaq\u00b6\u0082R\u008d".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v10 = var6_12;
                        v11 = var3_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl96:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    break block21;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl109:
                // 1 sources

                ** continue;
            }
        }
        _4.e = var6_12;
        _4.f = new Integer[4];
        _4.cfr_renamed_2 = new _93(null);
        _4.cfr_renamed_0 = new HashMap<K, V>();
    }

    private static int b(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x5A76;
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
                throw new RuntimeException("dev/krypton/4", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _4.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _4.b(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _4.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _4.b(classArray2[j], string, clazz2, n, classArray);
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
            int n = _4.a(l2, l3);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                _4.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _4.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _4.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _4.a(l2, l3);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = _4.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _4.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _4.a(clazz3, string2, clazz2)) != null) {
                    _4.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _4.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _4.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _4.b(441037956346880L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method d(long l2, long l3) {
        int n = _4.a(l2, l3);
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
                clazz3 = _4.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _4.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _4.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _4.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _4.b(441037956346880L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _4.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _4.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _4.b(441037956346880L, 0L);
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "*>*)I\u0006!1;f4\u00133+9%";
        objectArray[1] = "\"\u000e\u0010\u001a\u0006s'A6\tAt<<\u0012\tM{%";
        objectArray[2] = "Ib\u001a\u0011\u000e\u000fGs\u0015ZA\u001cI}\u0010P\u0001\f\by\u0012\u0011&0sd\u0014S\u001c";
        objectArray[3] = "\u000e<=.iD\u000bs\u0002!7X\u0010\u000e?=\"L\t";
        objectArray[4] = "\u0010\u0001j\u0010\u000b(\u0013\u000f2\u0012M'\b\u0013y\u0005\u000b\u0005\u0012\u0001n\u0002@2";
        objectArray[5] = "\u001cTGK4p\u0017[V\u0004Ih\u0004\\_M";
        objectArray[6] = "\u0012&|W\u00139\u0019)m\u0018r7\u0012\"iB";
        objectArray[7] = Void.TYPE;
        _4.i[7] = "java/lang/Void";
        objectArray[8] = "\u0013lk\u001dax\u0018czR\u001b|\u000bbj\u001d-x\u001c";
        objectArray[9] = "\"\u0011Cr\u0014Y)\u001eR=yY)\u0003F";
        objectArray[10] = "$zFF^,/uW\t3,/hCk\u001f!*~B";
        objectArray[11] = "\u0005\u0005G\u0017g\u0003\u0006\u000b\u001f\u0015!\f\u001d\u0017T\u0002g>\u001b\u0005_\u0012(\u001f\u000b'Y\u0017;\u001e\n\u0010B";
        objectArray[12] = "2\fj'N\u0002;\u0002in\r\u000f=\u0002}l\u0010\t\u007f\u0017bqW\u0018#\u0006t'e\u0004=\u0017b{n\u00025\u0006";
        objectArray[13] = "4/mcAT):o\"D\b`\b";
        objectArray[14] = "\u0014bv~LEaB}q]\n\u0000LvzYPt";
        objectArray[15] = "'\u0003`\u0002hg.\rcK+j(\rwI6lj\u0018hTq}6\t~\u0002Qm<\u0018x^`N+\u001e`Mq";
        objectArray[16] = ">y\u001c\bL+#l\u001eIIwn";
        objectArray[17] = "\u0002C1vK1\u001fV37Nm_\u0015";
        objectArray[18] = "\u0002S\n\u001a$\u001f\u001fF\b[!CRc";
        objectArray[19] = ":o<JtsOO7Ee<.A<NafZ";
        objectArray[20] = "8{*}:\u000e%n(<?Rl(";
        objectArray[21] = "r\\q`EEoIs!@\u0019.}";
        objectArray[22] = ".<PA\u0012\u007f[\u001c[N\u00030:\u0012PE\u0007jN";
        objectArray[23] = "\ns";
        objectArray[24] = "*zw#vc#ttj5n%t`h(hga\u007fuoy;pi#\\|<A\u007fuoy;pLd~{";
        objectArray[25] = "St\u0002cg\u001bNa\u0000\"bG\u0004_";
        objectArray[26] = "yK=^z9d^?\u001f\u007fe%\u0016";
        objectArray[27] = "Yt8ll\u0014Pz;%/\u0019Vz/'2\u001f\u0014k<2d\u0017Su0lS\u001eT\u007f00Q\u0012J~9+o\u001e";
        objectArray[28] = "~U!rJoc@#3O3,~";
        objectArray[29] = "&\u00043W{ZS$8Xj\u00152*3SnOF";
        objectArray[30] = "=0[!'\u0018H\u0010P.6W)\u001e[%2\r]";
        objectArray[31] = "$\u0001Ap\u001a'9\u0014C1\u001f{t&";
        objectArray[32] = "\u0014\u0001)&~\u0006a!\")oI\u0000/)\"k\u0013t";
        objectArray[33] = "\u0011tvb\u0010\u0017dT}m\u0001X\u0005Zvf\u0005\u0002q";
        objectArray[34] = "\u0012b3UZOgB8ZK\u0000\u0006L3QOZr";
        objectArray[35] = "\u0015?\u0000MiM`\u001f\u000bBx\u0002\u0001\u0011\u0000I|Xu";
        objectArray[36] = "V\u001fyz!V#?ru0\u0019B1y~4C6";
        objectArray[37] = "<\"\u0005=Z~I\u0002\u000e2K1(\f\u00059Ok\\";
        objectArray[38] = "Hn(h\u007fQHn?4s^R%?*sKUTow\"";
        objectArray[39] = "+)aAw\u00175!{\u000e\u0014\u00031";
        objectArray[40] = "ix\u0005&\\%\u001cX\u000e)Mj}V\u0005\"I0\t";
        objectArray[41] = "@\u001e&\u007f\u0001\u0000@\u001e1#\r\u000fZU1=\r\u001a]$cc]Z\u0019";
        objectArray[42] = "|>Mi*h\t\u001eFf;'h\u0010Mm?}\u001c";
        objectArray[43] = "#=Sp\u0016'V\u001dX\u007f\u0007h7\u0013St\u00032C";
        objectArray[44] = "-}$t\u0003gX]/{\u0012(9S$p\u0016rM";
        objectArray[45] = "U0>OC=H%<\u000eFa\u0001;";
        objectArray[46] = "^x9\r\u007f\u001dWv:D<\u0010Qv.F!\u0016\u0013a1Qf\u0017E9\u0002F`\u0006Xo\u0012L`\u001f\\c";
        objectArray[47] = "D\"7'K\\M,4n\bQK, l\u0015W\t;?{RV_c\flTGB5\u001cfT^F9~jJRT>\u0005<\u0013\n\u0011";
        objectArray[48] = "<\u007fSs[\u001bI_X|JT(QSwN\u000e\\";
        objectArray[49] = "\u001bUEN'\u0016nuNA6Y\u000f{EJ2\u0003{";
        objectArray[50] = Integer.TYPE;
        _4.i[50] = "java/lang/Integer";
        objectArray[51] = "4fr(\u0016H4fet\u001aG.-ej\u001aR)\\41M";
        objectArray[52] = "Q)hP\u0006m$\tc_\u0017\"E\u0007hT\u0013x1";
        objectArray[53] = "\u000b!n\u001d\u000eA~\u0001e\u0012\u001f\u000e\u001f\u000fn\u0019\u001bTk";
        objectArray[54] = Boolean.TYPE;
        _4.i[54] = "java/lang/Boolean";
        objectArray[55] = "\u000ef\u0001_NdEh\u0017_1?R~\u0007E]\r\u0000;Y\u001f\u0000Z_2[R\tcRg\u0001H1";
        objectArray[56] = "]UGp)5\t\\O<\u0012u\u0003lU4so\u000b7\u0013p{3\bF\u0016*tnd\f\u0010$/s\u0004[\u00130o\t_NE *u\n\u000fN3\u0012";
        objectArray[57] = "q@hjd`$\u0001cy\\b#]yi\u001brJ\u0005oof%$H>k#\u001cq@hjd`$\u0001cy\\";
        objectArray[58] = "\u0000q}\"PP\u0003,y1;\u0019`|q9AB\u0019\u007f,=R";
        objectArray[59] = "FtB]*#\n)\u001dA\u0010,\u0017\u007f~Ch=\u0001~^E}){.BYs\u007f\u001db\u001f\u0006oEF+E\u0000v?\u0015}J\u000e\u0010";
        objectArray[60] = "84Y,ls>'\u0013gU{\t[I|: 2=Pe/5";
        objectArray[61] = "Ox_ \u0000}V4E&j;-3\f4\u0007xHlS,\u0017r-hF\"\u0003hRq\n8\u0005\u0002";
        objectArray[62] = "fJ\u0018%^X\u007f\u0006\u0002#4\u001a\u0004\u0001K1Y]a^\u0014)IW\u0004\u0005K,\nA~V\u001d#\u0004'";
        objectArray[63] = "6\u00072A\u0011@)\u0013(B \u0010RDnFMW7\u001b1^]]R\u0019,_Z\u001c?\u00068EY-";
        objectArray[64] = ";\nl@\u0000P=F<\u0018}UQGg\u001d\u0000\u0013o\fi\u000b\u0000";
        objectArray[65] = "v\u0010V\u0019\u00014\"\u001ePMp\u0006\u0015,:\u0011p`p\bP[\u00107s\u001c\u0010";
        objectArray[66] = "x;\"\u0016ggg/8\u0015V5sA\u007fT+gf$ \u000b3wlA\"\u00162p-,=\u0002(s\u001c";
        objectArray[67] = "=HA%Xa$\u0004[#2!_\u0003\u00121_d:\\M)On_XX'[t A\u0014=]\u001e";
        objectArray[68] = "kx\rV\u007f42eD\u0006\u0003f9kl\u000bxn)m]\u000bJr\u000fkL\u000bjlT,O\nm1(y\u000e\u0001~\tn)_\\oxksP\u0001\u0003";
        objectArray[69] = "h;o\u0011H\b#5y\u00117\u000bYf1\u0011ZL<9n\tJFYb1\f\tP#1g\u0003\u00076";
        objectArray[70] = "\u001d\u0007!YCc\u0002\u0013;Zr0yD}^\u001ft\u001c\u001b\"F\u000f~y@}CLh\u0003\u0013+LB\u000e";
        objectArray[71] = "s\u0001\u000bvA8hX\u0005b}h\u0019[^e\u0010(|\u0004\u0001}\u0000\"\u0019\b\u001awF/%\u000eV'\u001eR";
        objectArray[72] = "MUn\u0006z0RAt\u0005Kl)\u00162\u0001&'LIm\u00196-)Kp\u00181lDTd\u00022]";
        objectArray[73] = "YZ_iE>FA[py<M@Ql\u0015\u000e\u0019\u0001\f2y FRS7\u001e?]VJ\u000b";
        objectArray[74] = "SJ\u0010Q\u001e'\u0002O\u0018Lp$8\u0012AH\u001d`]M\u001eP\rj8FCG\u001a&AK\u0005\fM\u001a";
        objectArray[75] = "I\u001dO\u0000$\u0007T\u0003J\nTH$B\u0016\u001c9\u0002A\u001dI\u0004)\b$\u0014KZ-\t\u001c\u0018S]=x";
        objectArray[76] = "^\u0017\u0019\u0017InI\u0015\u000b_.1I\ty\u0012E5\u001eL\u0017_\u00141[uEEEd\u001d\u001b\b\u0014A!$";
        objectArray[77] = "<\u00117\u0015H6'H9\u0001tlV\b8\u001bM;f\u001f:\t\u0005";
        objectArray[78] = "\u0017 \u001dRu~F%\u001a+rf\\JE\u0016b\"F(\u001d\u0016m%";
        objectArray[79] = "\u001d\u0000{T8Q\u0018Zt\tTKCYi\u0003T\u001d\u001f^,\b.NIQ\"n";
        objectArray[80] = "\u000b2\u0002\u000b\u001c6\u0012~\u0018\rvriyQ\u001f\u001b3\f&\u000e\u0007\u000b9i}Q\u0002H/\u0013.\u0007\rFI";
        objectArray[81] = "7<!UZHk|(\u001c0_d8\u0006@YKr\u0000*M\\]sDrK\u000b\u0000uy+VBP\t";
        objectArray[82] = "h\u0014}_-\u000e\u007f\u0016o\u0017JFo\n\u001dZ!U(Os\u0017pQmv!\r!\u0004+\u0018l\\%A\u0012Jv\rp\u0007|\u0007'\t5>";
        objectArray[83] = "J\u0015#zcn\u0001\u001b5z\u001c5\u0016\r%`p\u0007DLy7 P\u0000\u0014z<%9\u001d\r$m\u001c";
        objectArray[84] = "\nyeg\u001ap\u00135\u007fap6h26s\u001du\rmik\r\u007fh66nNi\u0012e`a@\u000f";
        objectArray[85] = "'pP\"5)\u007fp_%U3d,K`1-\u001evTp;sb#\u0015{(K#uM\"31p#B,U";
        objectArray[86] = "\u000e\u0016*\u00006DT\nn\u0013L:\u007f6\u001a6\u0016~\u000e\u0016*\u00006DT\nn\u0013";
        objectArray[87] = "Iw(BOlVc2A~>-4tE\u0013{Hk+]\u0003q-i6\\\u00040@v\"F\u0007\u0001";
        objectArray[88] = "S\u0016n\u0013y9ENk\u0005\u0004\u0002w<bzm>\u0006\u0019/\u001b{f\u0003\u000f";
        objectArray[89] = "\u0019^\u0003\u0015\u0011l\u0006J\u0019\u0016 8}\u001d_\u0012M{\u0018B\u0000\n]q}@\u001d\u000bZ0\u0010_\t\u0011Y\u0001";
        objectArray[90] = "H#*a'-F4/']u6!1\"%zHe?`#";
        objectArray[91] = "\u0014s\u00057L6\u000f*\u000b#pb~z\u00146K!B|Xf\u0013";
        objectArray[92] = "\u0007On\u0005-E\u001dB\"\u001c@B\u0016\u0012:\u0010\u0017\u0016HDaM@\\GO'\u0011)FJ\u0003>";
        objectArray[93] = "a\b\u0013?nabU\u0017,\u0005'zeK}xu{\u0000\u0014\"`eqeO}e&g\u001f\u001c+j(\u0001";
        objectArray[94] = "v2zox+o~`i\u0012h\u0014y){\u007f.q&vco$\u00142 ts)p%+7\u007fT";
        objectArray[95] = "\t\u000b`\u001e\u0012K\u0016\u0010d\u0007.I\u001d\u0011n\u001bB{IP4F.^\u0017\u00002\u0000N\u001d\u0010\u001cs|";
        objectArray[96] = "\u0013\u000bN2A\u0007\bR@&}Vy\nQ7\u0014\u0007\u0006\u0013\u001d-\u0012";
        objectArray[97] = "'.Zy\tF$s^jb\u0006Gz\u0003~\u000fE\"%\\f\u001fOG~\u0003c\\Y=-UlR?";
        Object[] objectArray2 = objectArray;
        objectArray[98] = "o\u0001\u0018\u001c\u0000tl\\\u001c\u000fk0\u000fUA\u001b\u0006wj\n\u001e\u0003\u0016}\u000fU@\u001e\u00120h\u0011\u0007\u0016\u000b7\u000f";
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
            if (c == '\u00d3' || c == 'B' || c == '\u00a5' || c == '\u00e5') {
                field = _4.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d3' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'B' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00a5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _4.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00a4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c8' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _4.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _4.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x4446;
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
                throw new RuntimeException("dev/krypton/4", exception);
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
            _4.c[n2] = _4.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
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
            case 1 -> 8;
            case 2 -> 18;
            case 3 -> 44;
            case 4 -> 19;
            case 5 -> 61;
            case 6 -> 20;
            case 7 -> 41;
            case 8 -> 52;
            case 9 -> 47;
            case 10 -> 30;
            case 11 -> 50;
            case 12 -> 11;
            case 13 -> 27;
            case 14 -> 63;
            case 15 -> 56;
            case 16 -> 13;
            case 17 -> 57;
            case 18 -> 25;
            case 19 -> 10;
            case 20 -> 58;
            case 21 -> 26;
            case 22 -> 34;
            case 23 -> 46;
            case 24 -> 15;
            case 25 -> 53;
            case 26 -> 35;
            case 27 -> 49;
            case 28 -> 4;
            case 29 -> 12;
            case 30 -> 59;
            case 31 -> 7;
            case 32 -> 5;
            case 33 -> 31;
            case 34 -> 38;
            case 35 -> 32;
            case 36 -> 43;
            case 37 -> 39;
            case 38 -> 1;
            case 39 -> 16;
            case 40 -> 9;
            case 41 -> 22;
            case 42 -> 40;
            case 43 -> 45;
            case 44 -> 6;
            case 45 -> 3;
            case 46 -> 48;
            case 47 -> 23;
            case 48 -> 33;
            case 49 -> 54;
            case 50 -> 55;
            case 51 -> 51;
            case 52 -> 42;
            case 53 -> 28;
            case 54 -> 17;
            case 55 -> 21;
            case 56 -> 36;
            case 57 -> 24;
            case 58 -> 14;
            case 59 -> 60;
            case 60 -> 37;
            case 61 -> 0;
            case 62 -> 29;
            default -> 2;
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
        _4.i[n3] = new String(cArray);
        return n3;
    }

    /*
     * Unable to fully structure code
     */
    private static _93 cfr_renamed_3(Object[] var0) {
        block23: {
            block22: {
                block19: {
                    block21: {
                        block20: {
                            var1_1 = (String)var0[0];
                            var2_2 = (Long)var0[1];
                            v0 = var2_2 = _4.a ^ var2_2;
                            var4_3 = v0 ^ 1232229900823L;
                            var6_4 = v0 ^ 21379225753928L;
                            v1 = v0 ^ 85238450797476L;
                            var8_5 = v1 >>> 8;
                            var10_6 = (int)(v1 << 56 >>> 56);
                            var11_7 = v0 ^ 3106883211794L;
                            var13_8 = _4.cfr_renamed_3();
                            var14_9 = (String)_4.a("q", (int)2628, (long)(1831091428282897722L ^ var2_2)) + var1_1 + (String)_4.a("q", (int)3299, (long)(2673705676824122268L ^ var2_2));
                            var15_10 = _4.c("\u00a4", (Object)_4.c("\u00a4", _4.class, (long)6569684308800521476L, (long)var2_2), (Object)var14_9, (long)6568907445350762532L, (long)var2_2);
                            try {
                                v2 = var15_10;
                                if (var13_8 != null) {
                                    if (v2 != null) break block19;
                                }
                                ** GOTO lbl43
                            }
                            catch (Throwable v3) {
                                throw _4.a(v3);
                            }
                            var16_12 = _4.c("\u00a5", (long)6570361554126495709L, (long)var2_2);
                            try {
                                v4 = var15_10;
                                if (var13_8 == null) break block20;
                                if (v4 == null) break block21;
                            }
                            catch (Throwable v5) {
                                throw _4.a(v5);
                            }
                            v4 = var15_10;
                        }
                        _4.c("\u00a4", (Object)v4, (long)6569500654707413735L, (long)var2_2);
                    }
                    return var16_12;
                }
                v2 = var15_10;
lbl43:
                // 2 sources

                var16_13 = _4.c("\u00c8", (Object)v2, (Object)_4.c("\u00a5", (long)6568512565549439589L, (long)var2_2), (long)6572539188601993874L, (long)var2_2);
                v6 = new Object[2];
                v6[1] = var16_13;
                v6[0] = var4_3;
                var17_15 = _4.c("\u00c8", (Object)v6, (long)6569291205121119232L, (long)var2_2);
                v7 = new Object[4];
                v7[3] = (int)_4.b("t", (int)18540, (long)(2388984756473088290L ^ var2_2));
                v7[2] = (int)_4.b("t", (int)897, (long)(8929252536234672846L ^ var2_2));
                v7[1] = var17_15;
                v7[0] = var11_7;
                var18_17 = _4.c("\u00c8", (Object)v7, (long)6569235455707049401L, (long)var2_2);
                var19_18 = new _0B((int)_4.b("t", (int)6856, (long)(7952710689948244868L ^ var2_2)), var8_5, (int)_4.b("t", (int)6856, (long)(7952710689948244868L ^ var2_2)), (byte)var10_6, (TextureFormat)_4.c("\u00a5", (long)6570289946052624833L, (long)var2_2), (FilterMode)_4.c("\u00a5", (long)6570164877651239835L, (long)var2_2), (FilterMode)_4.c("\u00a5", (long)6570164877651239835L, (long)var2_2));
                v8 = new Object[2];
                v8[1] = var6_4;
                v8[0] = var18_17;
                _4.c("\u00a4", (Object)var19_18, (Object)v8, (long)6568794593042956272L, (long)var2_2);
                var20_19 = new _93(var19_18);
                {
                    catch (Throwable var16_14) {
                        try {
                            block24: {
                                try {
                                    if (var2_2 < 0L) break block24;
                                    v9 = var15_10;
                                    if (var13_8 != null) {
                                        if (v9 == null) break block24;
                                    }
                                    ** GOTO lbl76
                                }
                                catch (Throwable v10) {
                                    throw _4.a(v10);
                                }
                                try {
                                    v9 = var15_10;
lbl76:
                                    // 2 sources

                                    _4.c("\u00a4", (Object)v9, (long)6569500654707413735L, (long)var2_2);
                                }
                                catch (Throwable var17_16) {
                                    _4.c("\u00a4", (Object)var16_14, (Object)var17_16, (long)6572609465021730266L, (long)var2_2);
                                }
                            }
                            throw var16_14;
                        }
                        catch (Exception var15_11) {
                            _4.c("\u00a4", (Object)_4.c("\u00a5", (long)6569560687126074657L, (long)var2_2), (Object)((String)_4.a("q", (int)32007, (long)(2928624429409952379L ^ var2_2)) + var1_1 + (String)_4.a("q", (int)9012, (long)(6593192412840279119L ^ var2_2)) + (String)_4.c("\u00c8", (Object)var15_11, (long)6572491362988761231L, (long)var2_2)), (long)6569956848099826526L, (long)var2_2);
                            return _4.c("\u00a5", (long)6570361554126495709L, (long)var2_2);
                        }
                    }
                }
                try {
                    v11 = var15_10;
                    if (var13_8 == null) break block22;
                    if (v11 == null) break block23;
                }
                catch (Throwable v12) {
                    throw _4.a(v12);
                }
                v11 = var15_10;
            }
            _4.c("\u00a4", (Object)v11, (long)6569500654707413735L, (long)var2_2);
        }
        return var20_19;
    }

    public static String cfr_renamed_3() {
        return cfr_renamed_5;
    }

    public static void cfr_renamed_6(Object[] objectArray) {
        CallSite callSite;
        CallSite callSite2;
        Object object;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        long l7;
        long l8;
        long l9;
        long l10;
        long l11;
        long l12;
        long l13;
        _8B b;
        double d;
        double d2;
        double d3;
        long l14;
        block17: {
            long l15;
            block18: {
                _93 v2;
                String string;
                int n;
                int n2;
                int n3;
                long l16;
                long l17;
                block15: {
                    block16: {
                        l14 = (Long)objectArray[0];
                        String string2 = (String)objectArray[1];
                        d3 = (Double)objectArray[2];
                        d2 = (Double)objectArray[3];
                        d = (Double)objectArray[4];
                        b = (_8B)objectArray[5];
                        long l18 = l14 = a ^ l14;
                        l13 = l18 ^ 0x38DA6D80DF40L;
                        long l19 = l18 ^ 0x698501CADEDFL;
                        l12 = l18 ^ 0xF6F72406CL;
                        l11 = l18 ^ 0x42D809082FE9L;
                        l10 = l18 ^ 0x411304C44B3L;
                        l9 = l18 ^ 0x7156C8B4A6EFL;
                        l15 = l18 ^ 0x7FCF88F1C731L;
                        l8 = l18 ^ 0x6EF49194C564L;
                        l7 = l18 ^ 0x45B67CAE68ADL;
                        l6 = l18 ^ 0x5137F25532A5L;
                        l5 = l18 ^ 0x2A1777C56B27L;
                        l4 = l18 ^ 0x2B7D928B0B09L;
                        l3 = l18 ^ 0x26698FFD8629L;
                        l17 = l18 ^ 0x6383965565E7L;
                        l2 = l18 ^ 0x6877F0D2E8FDL;
                        l16 = l18 ^ 0x5B484884CF57L;
                        long l20 = l18 ^ 0x61FD4027E5A4L;
                        n3 = (int)(l20 >>> 32);
                        n2 = (int)(l20 << 32 >>> 48);
                        n = (int)(l20 << 48 >>> 48);
                        string = _4.cfr_renamed_3();
                        object = (_93)((Object)_4.c("\u00a4", (Object)_4.c("\u00a5", -8022313362555598025L, (long)l14), (Object)string2, -8022223637998488884L, (long)l14));
                        try {
                            v2 = object;
                            if (string == null) break block15;
                            if (v2 != null) break block16;
                        }
                        catch (MatchException matchException) {
                            throw _4.a(matchException);
                        }
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l19;
                        objectArray2[0] = string2;
                        object = _4.c("\u00c8", (Object)objectArray2, -8022690417958707396L, (long)l14);
                        _4.c("\u00a4", (Object)_4.c("\u00a5", -8022313362555598025L, (long)l14), (Object)string2, (Object)object, -8021819023210763810L, (long)l14);
                    }
                    v2 = object;
                }
                try {
                    if (v2 == _4.c("\u00a5", -8021293076841360291L, (long)l14)) {
                        return;
                    }
                }
                catch (MatchException matchException) {
                    throw _4.a(matchException);
                }
                Object[] objectArray3 = new Object[1];
                objectArray3[0] = l16;
                callSite2 = _4.c("\u00a4", (Object)_4.c("\u00a5", -8018961705934225420L, (long)l14), (Object)objectArray3, -8025145001957682157L, (long)l14);
                try {
                    if (l14 >= 0L && callSite2 != false) {
                        Object[] objectArray4 = new Object[1];
                        objectArray4[0] = l17;
                        _4.c("\u00a4", (Object)_4.c("\u00a5", -8018961705934225420L, (long)l14), (Object)objectArray4, -8021185359473232653L, (long)l14);
                    }
                }
                catch (MatchException matchException) {
                    throw _4.a(matchException);
                }
                try {
                    try {
                        callSite = _4.c("\u00a5", -8025295323478666048L, (long)l14);
                        if (string == null) break block17;
                        if (callSite != null) break block18;
                    }
                    catch (MatchException matchException) {
                        throw _4.a(matchException);
                    }
                    _4.c("\u00e5", (_6N)new _6N(n3, (VertexFormat)_4.c("\u00a5", -8021215069288943919L, (long)l14), (VertexFormat.class_5596)_4.c("\u00a5", -8021068092054263064L, (long)l14), 4, (short)n2, (int)_4.b("t", 15792, (long)(0x1A4CA4322EA6F77DL ^ l14)), n), -8025295323478666048L, (long)l14);
                }
                catch (MatchException matchException) {
                    throw _4.a(matchException);
                }
            }
            Object[] objectArray5 = new Object[1];
            objectArray5[0] = l15;
            _4.c("\u00a4", (Object)_4.c("\u00a5", -8025295323478666048L, (long)l14), (Object)objectArray5, -8021672268666840806L, (long)l14);
            Object[] objectArray6 = new Object[3];
            objectArray6[2] = d2;
            objectArray6[1] = d3;
            objectArray6[0] = l12;
            Object[] objectArray7 = new Object[3];
            objectArray7[2] = 0.0;
            objectArray7[1] = 0.0;
            objectArray7[0] = l12;
            Object[] objectArray8 = new Object[2];
            objectArray8[1] = b;
            objectArray8[0] = l9;
            callSite = _4.c("\u00a4", (Object)_4.c("\u00a4", (Object)_4.c("\u00a4", (Object)_4.c("\u00a5", -8025295323478666048L, (long)l14), (Object)objectArray6, -8018894764084793700L, (long)l14), (Object)objectArray7, -8018894764084793700L, (long)l14), (Object)objectArray8, -8023009971656749650L, (long)l14);
        }
        Object[] objectArray9 = new Object[1];
        objectArray9[0] = l3;
        CallSite callSite3 = _4.c("\u00a4", (Object)callSite, (Object)objectArray9, -8020917992665527229L, (long)l14);
        Object[] objectArray10 = new Object[3];
        objectArray10[2] = d2 + d;
        objectArray10[1] = d3;
        objectArray10[0] = l12;
        Object[] objectArray11 = new Object[3];
        objectArray11[2] = 1.0;
        objectArray11[1] = 0.0;
        objectArray11[0] = l12;
        Object[] objectArray12 = new Object[2];
        objectArray12[1] = b;
        objectArray12[0] = l9;
        Object[] objectArray13 = new Object[1];
        objectArray13[0] = l3;
        CallSite callSite4 = _4.c("\u00a4", (Object)_4.c("\u00a4", (Object)_4.c("\u00a4", (Object)_4.c("\u00a4", (Object)_4.c("\u00a5", -8025295323478666048L, (long)l14), (Object)objectArray10, -8018894764084793700L, (long)l14), (Object)objectArray11, -8018894764084793700L, (long)l14), (Object)objectArray12, -8023009971656749650L, (long)l14), (Object)objectArray13, -8020917992665527229L, (long)l14);
        Object[] objectArray14 = new Object[3];
        objectArray14[2] = d2 + d;
        objectArray14[1] = d3 + d;
        objectArray14[0] = l12;
        Object[] objectArray15 = new Object[3];
        objectArray15[2] = 1.0;
        objectArray15[1] = 1.0;
        objectArray15[0] = l12;
        Object[] objectArray16 = new Object[2];
        objectArray16[1] = b;
        objectArray16[0] = l9;
        Object[] objectArray17 = new Object[1];
        objectArray17[0] = l3;
        CallSite callSite5 = _4.c("\u00a4", (Object)_4.c("\u00a4", (Object)_4.c("\u00a4", (Object)_4.c("\u00a4", (Object)_4.c("\u00a5", -8025295323478666048L, (long)l14), (Object)objectArray14, -8018894764084793700L, (long)l14), (Object)objectArray15, -8018894764084793700L, (long)l14), (Object)objectArray16, -8023009971656749650L, (long)l14), (Object)objectArray17, -8020917992665527229L, (long)l14);
        Object[] objectArray18 = new Object[3];
        objectArray18[2] = d2;
        objectArray18[1] = d3 + d;
        objectArray18[0] = l12;
        Object[] objectArray19 = new Object[3];
        objectArray19[2] = 0.0;
        objectArray19[1] = 1.0;
        objectArray19[0] = l12;
        Object[] objectArray20 = new Object[2];
        objectArray20[1] = b;
        objectArray20[0] = l9;
        Object[] objectArray21 = new Object[1];
        objectArray21[0] = l3;
        CallSite callSite6 = _4.c("\u00a4", (Object)_4.c("\u00a4", (Object)_4.c("\u00a4", (Object)_4.c("\u00a4", (Object)_4.c("\u00a5", -8025295323478666048L, (long)l14), (Object)objectArray18, -8018894764084793700L, (long)l14), (Object)objectArray19, -8018894764084793700L, (long)l14), (Object)objectArray20, -8023009971656749650L, (long)l14), (Object)objectArray21, -8020917992665527229L, (long)l14);
        try {
            Object[] objectArray22 = new Object[5];
            objectArray22[4] = (int)callSite6;
            objectArray22[3] = (int)callSite5;
            objectArray22[2] = (int)callSite4;
            objectArray22[1] = (int)callSite3;
            objectArray22[0] = l11;
            _4.c("\u00a4", (Object)_4.c("\u00a5", -8025295323478666048L, (long)l14), (Object)objectArray22, -8018662709044645876L, (long)l14);
            Object[] objectArray23 = new Object[1];
            objectArray23[0] = l13;
            _4.c("\u00a4", (Object)_4.c("\u00a5", -8025295323478666048L, (long)l14), (Object)objectArray23, -8021960647533081032L, (long)l14);
            Object[] objectArray24 = new Object[1];
            objectArray24[0] = l5;
            Object[] objectArray25 = new Object[2];
            objectArray25[1] = l10;
            objectArray25[0] = _4.c("\u00a4", (Object)_4.c("\u00c8", -8022588862275948955L, (long)l14), -8021037776381348495L, (long)l14);
            Object[] objectArray26 = new Object[2];
            objectArray26[1] = l6;
            objectArray26[0] = _4.c("\u00a5", -8018852293038745779L, (long)l14);
            Object[] objectArray27 = new Object[2];
            objectArray27[1] = l4;
            objectArray27[0] = _4.c("\u00a5", -8025295323478666048L, (long)l14);
            Object[] objectArray28 = new Object[4];
            objectArray28[3] = _4.c("\u00a4", (Object)_4.c("\u00d3", (Object)object, -8023061442540125152L, (long)l14), -8021883089375896864L, (long)l14);
            objectArray28[2] = l8;
            objectArray28[1] = _4.c("\u00a4", (Object)_4.c("\u00d3", (Object)object, -8023061442540125152L, (long)l14), -8019346702425554993L, (long)l14);
            objectArray28[0] = _4.a("q", 7007, (long)(0x138D66AC26634FA5L ^ l14));
            Object[] objectArray29 = new Object[1];
            objectArray29[0] = l7;
            _4.c("\u00a4", (Object)_4.c("\u00a4", (Object)_4.c("\u00a4", (Object)_4.c("\u00a4", (Object)_4.c("\u00a4", (Object)_4.c("\u00c8", (Object)objectArray24, -8021429669535747685L, (long)l14), (Object)objectArray25, -8018788207843457891L, (long)l14), (Object)objectArray26, -8021577675013630682L, (long)l14), (Object)objectArray27, -8022470245846664609L, (long)l14), (Object)objectArray28, -8022896731783188582L, (long)l14), (Object)objectArray29, -8022599799898984653L, (long)l14);
            if (l14 > 0L && callSite2 != false) {
                Object[] objectArray30 = new Object[1];
                objectArray30[0] = l2;
                _4.c("\u00a4", (Object)_4.c("\u00a5", -8018961705934225420L, (long)l14), (Object)objectArray30, -8025411244906371066L, (long)l14);
            }
        }
        catch (MatchException matchException) {
            throw _4.a(matchException);
        }
    }

    public static boolean cfr_renamed_7(Object[] objectArray) {
        boolean bl;
        Object object;
        long l2;
        block8: {
            Object object2;
            long l3;
            String string;
            block9: {
                boolean bl2;
                block11: {
                    block10: {
                        l2 = (Long)objectArray[0];
                        string = (String)objectArray[1];
                        l3 = (l2 = a ^ l2) ^ 0x74A9F20463A2L;
                        String string2 = _4.cfr_renamed_3();
                        object2 = (_93)((Object)_4.c("\u00a4", (Object)_4.c("\u00a5", 3302855606600185418L, (long)l2), (Object)string, 3302910072687234993L, (long)l2));
                        try {
                            try {
                                try {
                                    object = object2;
                                    if (string2 == null) break block8;
                                    if (object == null) break block9;
                                }
                                catch (MatchException matchException) {
                                    throw _4.a(matchException);
                                }
                                if (object2 == _4.c("\u00a5", 3302186761016092960L, (long)l2)) break block10;
                            }
                            catch (MatchException matchException) {
                                throw _4.a(matchException);
                            }
                            bl2 = true;
                            break block11;
                        }
                        catch (MatchException matchException) {
                            throw _4.a(matchException);
                        }
                    }
                    bl2 = false;
                }
                return bl2;
            }
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l3;
            objectArray2[0] = string;
            object2 = _4.c("\u00c8", (Object)objectArray2, 3302458760440226369L, (long)l2);
            _4.c("\u00a4", (Object)_4.c("\u00a5", 3302855606600185418L, (long)l2), (Object)string, (Object)object2, 3301661024645780643L, (long)l2);
            object = object2;
        }
        try {
            bl = object != _4.c("\u00a5", 3302186761016092960L, (long)l2);
        }
        catch (MatchException matchException) {
            throw _4.a(matchException);
        }
        return bl;
    }

    public static void cfr_renamed_7(String string) {
        cfr_renamed_5 = string;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_4.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_4.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_4.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

