/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  java.lang.MatchException
 */
package dev.krypton;

import com.google.gson.JsonObject;
import dev.krypton._43;
import dev.krypton._4u_0;
import dev.krypton._4w;
import dev.krypton._5k_0;
import dev.krypton.l;
import java.io.IOException;
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
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class _4l {
    private static final String[] cfr_renamed_4;
    private static _4w[] cfr_renamed_8;
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long[] i;
    private static final Integer[] j;
    private static final Map k;
    private static final Object[] m;
    private static final String[] n;

    protected abstract void cfr_renamed_5(Object[] var1);

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        _4l.a = l.a(5554078462599491986L, -5041958251880427296L, MethodHandles.lookup().lookupClass()).a(101997995726091L);
                        var20 = _4l.a ^ 30782863817205L;
                        _4l.m = new Object[34];
                        _4l.n = new String[34];
                        _4l.a();
                        _4l.e = new HashMap<K, V>(13);
                        _4l.cfr_renamed_8(new _4w[2]);
                        var11_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var12_2 = 1; var12_2 < 8; ++var12_2) {
                            v2 = v2;
                            v2[var12_2] = (byte)(var20 << var12_2 * 8 >>> 56);
                        }
                        var11_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var18_3 = new String[10];
                        var16_4 = 0;
                        var15_5 = "\"/cf\u00fe\u00b4\u0088F7\u00b1;\u00b4\u00b3a\u00bd\u00c6\u008bF\u00e41 \\\u00df\u00a3\u0098\u008a\u00b9\u00fe\u00d4+#[Qcd\u00d9\u00ed\u001dO\u0006\u0018\u00e8\u00bb\u00c8\u00e5\u00f7\u00e3\"&;{\u0094\u008c\u00d5hV|\u00f0\u00e1\u00dcJ\u0015s\u00d7\u00eb\u0010X\\\nj&\u0013\u00f6|\u0089S\u0007\u00e1'\u0006t\u0082\u00108\u0013\u00f4\u00f4l\u009c\u0089j\u00d2\u0014\u0014\u00dd\u0000\u00199\u00d0\u0010\u00c8\u00dbn\u00d8\u00b9\u00cbM2s\u00ec@\u00c9\u00f6\u0002\u00e0:\u0010'\u00aa\u00a8=\u00ed\u00d6\u00b0w\u009d\u00a0\u008f\u00d0*\u00b0\u00e8\u00b4\u0010\n\u00b8(\u00fe\u00d6FI\f\u00e4\t\u00a1\u00b0Q/\u00bc\u00bb\u0010\u00f2'e:\u00d0\u0004\u00fa&\u0016+)\u0016\u008d\u009d\u00c7\u0017";
                        var17_6 = "\"/cf\u00fe\u00b4\u0088F7\u00b1;\u00b4\u00b3a\u00bd\u00c6\u008bF\u00e41 \\\u00df\u00a3\u0098\u008a\u00b9\u00fe\u00d4+#[Qcd\u00d9\u00ed\u001dO\u0006\u0018\u00e8\u00bb\u00c8\u00e5\u00f7\u00e3\"&;{\u0094\u008c\u00d5hV|\u00f0\u00e1\u00dcJ\u0015s\u00d7\u00eb\u0010X\\\nj&\u0013\u00f6|\u0089S\u0007\u00e1'\u0006t\u0082\u00108\u0013\u00f4\u00f4l\u009c\u0089j\u00d2\u0014\u0014\u00dd\u0000\u00199\u00d0\u0010\u00c8\u00dbn\u00d8\u00b9\u00cbM2s\u00ec@\u00c9\u00f6\u0002\u00e0:\u0010'\u00aa\u00a8=\u00ed\u00d6\u00b0w\u009d\u00a0\u008f\u00d0*\u00b0\u00e8\u00b4\u0010\n\u00b8(\u00fe\u00d6FI\f\u00e4\t\u00a1\u00b0Q/\u00bc\u00bb\u0010\u00f2'e:\u00d0\u0004\u00fa&\u0016+)\u0016\u008d\u009d\u00c7\u0017".length();
                        var14_7 = 40;
                        var13_8 = -1;
lbl24:
                        // 2 sources

                        while (true) {
                            v3 = ++var13_8;
                            v4 = var15_5.substring(v3, v3 + var14_7);
                            v5 = -1;
                            break block13;
                            break;
                        }
lbl29:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = _4l.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            var15_5 = "\u00c0\u00f1\u009b\u00ecA\u008a\u0017\u0096m1\u00a4\u00fb\u00f7\u0096\u00d7z\u0018\u00b6)\u00a6dK0\u0087I\u00cb\u00d0!\u00c6\u0014\u00ee\u00b3C\u00d2\u00f0e\u0093\u00e1\u0090\u00ff\u00e6";
                            var17_6 = "\u00c0\u00f1\u009b\u00ecA\u008a\u0017\u0096m1\u00a4\u00fb\u00f7\u0096\u00d7z\u0018\u00b6)\u00a6dK0\u0087I\u00cb\u00d0!\u00c6\u0014\u00ee\u00b3C\u00d2\u00f0e\u0093\u00e1\u0090\u00ff\u00e6".length();
                            var14_7 = 16;
                            var13_8 = -1;
lbl38:
                            // 2 sources

                            while (true) {
                                v6 = ++var13_8;
                                v4 = var15_5.substring(v6, v6 + var14_7);
                                v5 = 0;
                                break block13;
                                break;
                            }
                            break;
                        }
lbl43:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = _4l.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            break block14;
                            break;
                        }
                    }
                    var19_9 = var11_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                _4l.c = var18_3;
                _4l.d = new String[10];
                _4l.k = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var20 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[3];
                var3_13 = 0;
                var4_14 = "yS\u00cex\u009ch\u00f5\u00cd7\u00d3\u00c5\u00b8\u00c8 gw\u00e7R\u00a9*\u00d8\u00ee\u00b3\u008b";
                var5_15 = "yS\u00cex\u009ch\u00f5\u00cd7\u00d3\u00c5\u00b8\u00c8 gw\u00e7R\u00a9*\u00d8\u00ee\u00b3\u008b".length();
                var2_16 = 0;
                while (true) {
                    break block15;
                    break;
                }
lbl77:
                // 1 sources

                while (true) {
                    var6_12[v10] = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
                    if (var2_16 < var5_15) ** continue;
                    break block16;
                    break;
                }
            }
            var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
            v10 = var3_13++;
            var8_18 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            ** while (true)
        }
        _4l.i = var6_12;
        _4l.j = new Integer[3];
        _4l.cfr_renamed_4 = new String[]{_4l.a("k", (int)14345, (long)(7755242757450692486L ^ var20)), _4l.a("k", (int)20051, (long)(1265567669215396304L ^ var20)), _4l.a("k", (int)17948, (long)(5223874603930880408L ^ var20)), _4l.a("k", (int)32463, (long)(3027522308265455949L ^ var20))};
    }

    private static Exception b(Exception exception) {
        return exception;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _4l.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _4l.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _4l.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _4l.b(classArray[j], string, clazz2);
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
            int n = _4l.a(l2, l3);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                _4l.m[n] = clazz = Class.forName(_4l.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int c(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x69CC;
        if (j[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = i[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])k.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    k.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/4l", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _4l.j[n2] = n3;
        }
        return j[n2];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _4l.c(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/4l" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l2, long l3) {
        int n = _4l.a(l2, l3);
        Object object = m[n];
        if (object instanceof String) {
            String string = _4l.n[n];
            int n2 = string.indexOf(8);
            Class clazz = _4l.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _4l.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _4l.a(clazz3, string2, clazz2)) != null) {
                    _4l.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _4l.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _4l.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _4l.b(1160083744708003L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _4l.a(l2, l3);
        Object object = m[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = _4l.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = _4l.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _4l.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _4l.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _4l.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _4l.b(1160083744708003L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _4l.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _4l.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _4l.b(1160083744708003L, 0L);
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

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/4l" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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
            if (c == '\u00f2' || c == '\u00fc' || c == '\u00df' || c == 'c') {
                field = _4l.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f2' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fc' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00df' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _4l.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'g' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'I' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _4l.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _4l.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static int a(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (_4l.n[n3] != null) {
            return n3;
        }
        Object object = m[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 9;
            case 1 -> 53;
            case 2 -> 45;
            case 3 -> 31;
            case 4 -> 32;
            case 5 -> 15;
            case 6 -> 38;
            case 7 -> 29;
            case 8 -> 14;
            case 9 -> 35;
            case 10 -> 43;
            case 11 -> 46;
            case 12 -> 42;
            case 13 -> 6;
            case 14 -> 56;
            case 15 -> 34;
            case 16 -> 55;
            case 17 -> 20;
            case 18 -> 25;
            case 19 -> 22;
            case 20 -> 40;
            case 21 -> 4;
            case 22 -> 63;
            case 23 -> 49;
            case 24 -> 3;
            case 25 -> 19;
            case 26 -> 16;
            case 27 -> 33;
            case 28 -> 18;
            case 29 -> 24;
            case 30 -> 39;
            case 31 -> 7;
            case 32 -> 51;
            case 33 -> 1;
            case 34 -> 28;
            case 35 -> 26;
            case 36 -> 2;
            case 37 -> 37;
            case 38 -> 57;
            case 39 -> 5;
            case 40 -> 61;
            case 41 -> 0;
            case 42 -> 23;
            case 43 -> 47;
            case 44 -> 59;
            case 45 -> 21;
            case 46 -> 10;
            case 47 -> 54;
            case 48 -> 27;
            case 49 -> 60;
            case 50 -> 52;
            case 51 -> 58;
            case 52 -> 8;
            case 53 -> 44;
            case 54 -> 11;
            case 55 -> 62;
            case 56 -> 17;
            case 57 -> 36;
            case 58 -> 12;
            case 59 -> 41;
            case 60 -> 48;
            case 61 -> 50;
            case 62 -> 13;
            default -> 30;
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
        _4l.n[n3] = new String(cArray);
        return n3;
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

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x5C16;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l3 = Thread.currentThread().threadId();
                objectArray = (Object[])e.get(l3);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l3, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/4l", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l2 >>> 56);
            for (int j = 1; j < 8; ++j) {
                byArray[j] = (byte)(l2 << j * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            _4l.d[n2] = _4l.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static void a() {
        Object[] objectArray = m;
        m[0] = "1_\u001ak\u0017|2QBH@f>|\u0019l_w)";
        objectArray[1] = Integer.TYPE;
        _4l.n[1] = "java/lang/Integer";
        objectArray[2] = "\u0002%";
        objectArray[3] = ";(mu\u0017v% w:lV\u0018\r";
        objectArray[4] = "^-Gvw}U\"V9\neF%_p";
        objectArray[5] = "P]/\".S\\U.ig[@],\"\u0003O\\\\\rn#YPF";
        objectArray[6] = Void.TYPE;
        _4l.n[6] = "java/lang/Void";
        objectArray[7] = "!)\u00125_\u0017<<\u0010tZKp'";
        objectArray[8] = "4A\u0015\u0003\u000bU)T\u0017B\u000e\tdH";
        objectArray[9] = "u\u00162^\u0016\u0002\u000069Q\u0007Ma82Z\u0003\u0017\u0015";
        objectArray[10] = "yV*i)qrY;&NsgR;mu";
        objectArray[11] = "yo";
        objectArray[12] = "fn1Q15ma \u001eL \u007f{\"]";
        objectArray[13] = "$\u0003^[pv/\fO\u0014\u001dr/\u0010{_/o+\fK_";
        objectArray[14] = Boolean.TYPE;
        _4l.n[14] = "java/lang/Boolean";
        objectArray[15] = "^@=]$P+`6R5\u001fVx%U<V>";
        objectArray[16] = "/2I\u0011 j$=X^Ad/6\\\u0004";
        objectArray[17] = "z0R\u00069c|n\u0000g-t8O\n\u001bUq(a\r\u0016nx6slYk7%b\u0006_5eD";
        objectArray[18] = "#z1%Mqvbj&?e~aUcXr~gqh?0c}5xEn*#=\u0019\u0005zs%lc[3--\r";
        objectArray[19] = "G%n+v\u0018A{<Jb\u000f\u0005\u001bo5s\u0019\u0012c+;%\u0019y%nt{\u001e\u0013#0&\u001a";
        objectArray[20] = "GG\u0003\u0002cW\u0019\u000e]\n\u0002F\u001aQ\u001fScK\u00067RTbK\r\n]PbU}^]V\u007f\u001d\u001bJ\u001dFz-";
        objectArray[21] = "9\u001c3},\u0000y\u000fc*\u0015\bj\u00165sp/^1\u0015\u0014/\u001ei\u0019`fo\r9NY";
        objectArray[22] = "-Hi\u0012m1m[9ET?p\u007f\u007f\u00015%x$9\u000b4{v^gBjs\u0017";
        objectArray[23] = "(sFm.N$t\u0018lJSs\u0010\u000bk+I{KMa*\u0017u1\u0013(t\u001f\u0014";
        objectArray[24] = "1c\"k\u0004\u007f=d|j`wa7Km\u0007f`!of`$};+v\u001az4e#\u0017Znmcrm\u0004'3k\u0013+\u001dpl4/t\u0011l1[";
        objectArray[25] = ">W\u0013WM$kOHT?0cLB\rA_4@OS^%j\t\u0011[?e~P\u0017\nE;7\u000e\u001fk";
        objectArray[26] = ":;\u0002U0@<eP45N`bW] G\u0004}P[=[?tNI\\\u0014:;]X6\u0012di<";
        objectArray[27] = "_6\u00051[C\u0001\u007f[9:E\u0002\u0002\u0002vWC./\u001ed:\u0003\u0015&]h@]\\xU\t";
        objectArray[28] = "ulv\u000bpZ+)lN\u001d[28k\u0013tXH,f\u001a|Ms%x\b\u001d";
        objectArray[29] = ":\u001c\u000f,vD<B]M`C{CW!\u001a\u0010:\u001cP!p\u0016dN1";
        objectArray[30] = "?Ah$!FcErdH\u0000\u0002\u0007ecvYlU`c\"9>Db|'\u0005aH~!H";
        objectArray[31] = "\u0000#\nD\\t\u0000-\u0015J?pR1\u0005[Dgu>\u0014LD\nG#\u0007@N1N=\u0015!GfP.\u0019\u001aNxBO";
        objectArray[32] = "a\u0012\u001cXf\u001b=\u0016\u0006\u0018\u000f\\\\\u0003\b\u0000o\u0006`SB^2";
        Object[] objectArray2 = objectArray;
        objectArray[33] = "~\t,\u001a\u0017P @r\u0012vE)\u0005\u0006S\nG?ys]\u001fA/\u00017SIAD";
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/4l" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void cfr_renamed_7(Object[] objectArray) {
        _5k_0 k_0 = (_5k_0)((Object)objectArray[0]);
        JsonObject jsonObject = (JsonObject)objectArray[1];
        long l2 = (Long)objectArray[2];
        long l3 = (l2 = a ^ l2) ^ 0x72A7A6C95749L;
        _4l.d("g", (Object)jsonObject, (Object)_4l.a("k", 14894, (long)(0x1F231874D89C6D9L ^ l2)), (Object)_4l.d("g", (Object)_4l.d("I", -6853600997483040744L, (long)l2), -6853419153973748607L, (long)l2), -6854347288633219618L, (long)l2);
        CallSite callSite = _4l.d("g", (Object)_4l.d("g", (Object)jsonObject, -6853479673576300667L, (long)l2), -6850475604812912430L, (long)l2);
        CallSite callSite2 = _4l.d("I", (int)(((CallSite)callSite).length + _4l.c("w", 29071, (long)(0x578235A61810B8A5L ^ l2))), -6854251981984904635L, (long)l2);
        _4w[] wArray = _4l.cfr_renamed_8();
        try {
            _4l.d("g", (Object)callSite2, (int)_4l.d("I", (int)_4l.d("g", (Object)((Object)k_0), -6854111521794554481L, (long)l2), -6854007401612718784L, (long)l2), -6853909796967687823L, (long)l2);
            _4l.d("g", (Object)callSite2, (int)_4l.d("I", (int)((CallSite)callSite).length, -6854007401612718784L, (long)l2), -6853909796967687823L, (long)l2);
            _4l.d("g", (Object)callSite2, (Object)callSite, -6853746898768482844L, (long)l2);
            _4l.d("g", (Object)callSite2, -6854140160470041557L, (long)l2);
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = callSite2;
            objectArray2[0] = l3;
            _4l.d("g", (Object)this, (Object)objectArray2, -6853970587571781548L, (long)l2);
            if (wArray == null) {
                _4w.cfr_renamed_8(new String[3]);
            }
        }
        catch (MatchException matchException) {
            throw _4l.b((Exception)((Object)matchException));
        }
    }

    public static _4w[] cfr_renamed_8() {
        return cfr_renamed_8;
    }

    public static void cfr_renamed_8(_4w[] wArray) {
        cfr_renamed_8 = wArray;
    }

    public abstract void cfr_renamed_8(Object[] var1);

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static _4l cfr_renamed_9(Object[] var0) {
        block28: {
            block31: {
                block26: {
                    block27: {
                        block24: {
                            block21: {
                                block22: {
                                    block20: {
                                        var3_1 = (Consumer)var0[0];
                                        var1_2 = (Long)var0[1];
                                        v0 = var1_2 = _4l.a ^ var1_2;
                                        var4_3 = v0 ^ 2484441504551L;
                                        var6_4 = v0 ^ 33800771532303L;
                                        var8_5 = _4l.cfr_renamed_8();
                                        var9_6 = _4l.d("g", (Object)_4l.d("I", (Object)_4l.a("k", (int)27795, (long)(4602276844731791428L ^ var1_2)), (long)5246047840117301333L, (long)var1_2), (long)5246655712480076700L, (long)var1_2);
                                        try {
                                            v1 /* !! */  = _4l.d("g", (Object)var9_6, (Object)_4l.a("k", (int)5039, (long)(3855202880167544691L ^ var1_2)), (long)5245585374429319705L, (long)var1_2);
                                            if (var8_5 == null) break block20;
                                            if (v1 /* !! */  == false) break block21;
                                        }
                                        catch (IOException v2) {
                                            throw _4l.b(v2);
                                        }
                                        v1 /* !! */  = (reference)false;
                                    }
                                    var10_7 = v1 /* !! */ ;
                                    while (true) {
                                        try {
                                            if (var10_7 >= _4l.c("w", (int)32568, (long)(7092612612535311935L ^ var1_2))) break;
                                            return new _43((String)_4l.a("k", (int)25488, (long)(8534712165576898383L ^ var1_2)) + (int)var10_7, var3_1, var4_3);
                                        }
                                        catch (MatchException v3) {
                                            throw _4l.b((Exception)v3);
                                        }
                                        {
                                            catch (IOException var11_9) {
                                                ++var10_7;
                                                v4 = var8_5;
                                                if (var1_2 < 0L) break block22;
                                                if (v4 != null) continue;
                                            }
                                        }
                                        break;
                                    }
                                    v4 = var8_5;
                                }
                                if (v4 != null) break block28;
                            }
                            var10_8 = null;
                            var11_10 = _4l.d("\u00df", (long)5242494585485824595L, (long)var1_2);
                            var12_12 = ((CallSite)var11_10).length;
                            var13_14 = 0;
                            while (var13_14 < var12_12) {
                                block23: {
                                    block29: {
                                        block25: {
                                            var14_15 = var11_10[var13_14];
                                            var10_8 = _4l.d("I", (Object)var14_15, (long)5246550395105488162L, (long)var1_2);
                                            v5 = var8_5;
                                            if (var1_2 <= 0L) break block23;
                                            if (v5 == null) break block29;
                                            try {
                                                block30: {
                                                    v6 = var10_8;
                                                    v7 = var8_5;
                                                    if (var1_2 <= 0L) ** GOTO lbl72
                                                    if (v7 == null) break block24;
                                                    break block30;
                                                    catch (IOException v8) {
                                                        throw _4l.b(v8);
                                                    }
                                                }
                                                if (v6 == null) break block25;
                                            }
                                            catch (IOException v9) {
                                                throw _4l.b(v9);
                                            }
                                            if (var1_2 >= 0L) break;
                                        }
                                        ++var13_14;
                                    }
                                    v5 = var8_5;
                                }
                                if (v5 != null) continue;
                            }
                            if (var1_2 <= 0L) break block31;
                            v6 = var10_8;
                        }
                        try {
                            v7 = var8_5;
lbl72:
                            // 2 sources

                            if (v7 == null) break block26;
                            if (v6 != null) break block27;
                        }
                        catch (IOException v10) {
                            throw _4l.b(v10);
                        }
                        var10_8 = _4l.a("k", (int)3382, (long)(4263990750303033839L ^ var1_2));
                    }
                    v6 = (String)var10_8 + (String)_4l.a("k", (int)15314, (long)(1919172692872081164L ^ var1_2));
                }
                var10_8 = v6;
            }
            var11_11 = 0;
            while (true) {
                try {
                    if (var11_11 >= _4l.c("w", (int)10650, (long)(7483533409640220830L ^ var1_2))) break;
                    return new _4u_0((String)var10_8 + var11_11, var3_1, var6_4);
                }
                catch (MatchException v11) {
                    throw _4l.b((Exception)v11);
                }
                {
                    catch (IOException var12_13) {
                        ++var11_11;
                        if (var1_2 <= 0L || var8_5 != null) continue;
                    }
                }
                break;
            }
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_4l.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_4l.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_4l.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

