/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  java.lang.MatchException
 */
package dev.krypton;

import com.google.gson.JsonObject;
import dev.krypton._4l;
import dev.krypton._4w;
import dev.krypton._6Z;
import dev.krypton._7l;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _9W {
    private static BiConsumer cfr_renamed_1;
    private static _4l cfr_renamed_8;
    private static Runnable cfr_renamed_0;
    private static boolean cfr_renamed_4;
    private static JsonObject cfr_renamed_6;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static final Object[] h;
    private static final String[] i;

    public static boolean cfr_renamed_5(Object[] objectArray) {
        boolean bl;
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        try {
            bl = _9W.c("\u00aa", -4481633474789847485L, (long)l2) != null;
        }
        catch (MatchException matchException) {
            throw _9W.a(matchException);
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        _9W.a = l.a(745554315295440534L, -4612015646672608427L, MethodHandles.lookup().lookupClass()).a(183958352032210L);
                        var20 = _9W.a ^ 52796196161740L;
                        var22_1 = var20 ^ 104688090037065L;
                        _9W.h = new Object[66];
                        _9W.i = new String[66];
                        _9W.a();
                        _9W.d = new HashMap<K, V>(13);
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
                        var18_4 = new String[18];
                        var16_5 = 0;
                        var15_6 = "\u008d\u00ab\u0081\u001fb\u0010\u00c3\\`\u00c0Xj\u0017V_\u00bc 2\u0094\u00cbUn\u00d7u;xK\u00d0\u00be2p\u00af\bB\u0012r\u0094\u00a7\u00ad[K\u009fi\u009eK\u009bF\u0080\u007f \u00ba\u00e7\u00ac\u001b<\u00f15\u00fe\u00e3<Y\u0097\u0004%\u009a\u00e5\b3\u00ee\u00f3~H-\u00fb\u00e8\u0002\u00ad\u00cb\u00da\u00a7fI\u0010-\u00f21/\u00d5\u00b8$\u00a0A\u00bc\u00e7\u00d6\u00e3\u0097L\u00fd00f0\u001f\u00c1(\u00c1\u00b9E\u0092\u00d7\u00d9\u0091=\u0081A\u0002\r\u00c8+\u00b0\u00bd\u001e\u00f7\u0086\u00b9>\u000bt^\u00eb\u00b2X\u0005\u00d3,D:s\u00a7\u00e7\u00a2\u00b9g\u00e4_\u00f9\u000b \u00b4\u0006\u001e,l\u00b1!\u0084\u0081\u00d6i\u0001\u0089\u00e4\u0083d\u0000`\n\\\u00d9\u008e_\u00fe\u0016\u009b\u0007\u00fc\u00c8a\u00e6\u00e4 \u0094\u00e7\u00d7\u00f7\u0094e\u00a9\u0099\u00bf\u0096\u00fa\u00c3\u00a7\u00db\u00a1r\u0097\u00f3i1\u0098f#>\u00b0\u00a9Z\u00ea\u00e0\u008bej\u0010\u00d2\u00e3\u00db!\u00e9\u00b6m\u00b3Vw\u00acD|\"\u00c2\u0099\u0010ID\u00e4\u00da\u00bd\u00d58\u0099$\u0012\u00d8\u00ec\u0019t\u0000%\u0010\u00f9f\u0005~\u001a<\u0010\u00c5\u0088g\u00fcm\u0001\u0083)R\u0010ht\u00e4\u00fa+\u00c47\u00cb\u00e1=@\u00a4\u0095\u0089\u009e{\u0018N\u00ee \u00f2P(W\u00cb\u00e5(\u00c7\u00c0\u001cGn15\u00a6s\u00de\u0091\u00a7\u008b\u00e7\u0010\u00a8-\u00ff\\\u0085jDs\u0098\u00cd\u00ed\u00aa\u00c0\u00c7\u00c9\u00d2\u0010\u0088\u00a1\u00b5\u00cc7\u00fa\u00a8HM\u00f8\u009c\u00ee]2ya\u0010\u00b4\u00e3\u00ce\u00f7\"\u00ab\u00d5\u009b\u0099M\u0000\u00ab\u00f7\u00a2]~\u0010a{\u00df\b4\u0002m\u007f\u00d30\u00ce\u001du;\u008c\u00ff";
                        var17_7 = "\u008d\u00ab\u0081\u001fb\u0010\u00c3\\`\u00c0Xj\u0017V_\u00bc 2\u0094\u00cbUn\u00d7u;xK\u00d0\u00be2p\u00af\bB\u0012r\u0094\u00a7\u00ad[K\u009fi\u009eK\u009bF\u0080\u007f \u00ba\u00e7\u00ac\u001b<\u00f15\u00fe\u00e3<Y\u0097\u0004%\u009a\u00e5\b3\u00ee\u00f3~H-\u00fb\u00e8\u0002\u00ad\u00cb\u00da\u00a7fI\u0010-\u00f21/\u00d5\u00b8$\u00a0A\u00bc\u00e7\u00d6\u00e3\u0097L\u00fd00f0\u001f\u00c1(\u00c1\u00b9E\u0092\u00d7\u00d9\u0091=\u0081A\u0002\r\u00c8+\u00b0\u00bd\u001e\u00f7\u0086\u00b9>\u000bt^\u00eb\u00b2X\u0005\u00d3,D:s\u00a7\u00e7\u00a2\u00b9g\u00e4_\u00f9\u000b \u00b4\u0006\u001e,l\u00b1!\u0084\u0081\u00d6i\u0001\u0089\u00e4\u0083d\u0000`\n\\\u00d9\u008e_\u00fe\u0016\u009b\u0007\u00fc\u00c8a\u00e6\u00e4 \u0094\u00e7\u00d7\u00f7\u0094e\u00a9\u0099\u00bf\u0096\u00fa\u00c3\u00a7\u00db\u00a1r\u0097\u00f3i1\u0098f#>\u00b0\u00a9Z\u00ea\u00e0\u008bej\u0010\u00d2\u00e3\u00db!\u00e9\u00b6m\u00b3Vw\u00acD|\"\u00c2\u0099\u0010ID\u00e4\u00da\u00bd\u00d58\u0099$\u0012\u00d8\u00ec\u0019t\u0000%\u0010\u00f9f\u0005~\u001a<\u0010\u00c5\u0088g\u00fcm\u0001\u0083)R\u0010ht\u00e4\u00fa+\u00c47\u00cb\u00e1=@\u00a4\u0095\u0089\u009e{\u0018N\u00ee \u00f2P(W\u00cb\u00e5(\u00c7\u00c0\u001cGn15\u00a6s\u00de\u0091\u00a7\u008b\u00e7\u0010\u00a8-\u00ff\\\u0085jDs\u0098\u00cd\u00ed\u00aa\u00c0\u00c7\u00c9\u00d2\u0010\u0088\u00a1\u00b5\u00cc7\u00fa\u00a8HM\u00f8\u009c\u00ee]2ya\u0010\u00b4\u00e3\u00ce\u00f7\"\u00ab\u00d5\u009b\u0099M\u0000\u00ab\u00f7\u00a2]~\u0010a{\u00df\b4\u0002m\u007f\u00d30\u00ce\u001du;\u008c\u00ff".length();
                        var14_8 = 16;
                        var13_9 = -1;
lbl25:
                        // 2 sources

                        while (true) {
                            v3 = ++var13_9;
                            v4 = var15_6.substring(v3, v3 + var14_8);
                            v5 = -1;
                            break block13;
                            break;
                        }
lbl30:
                        // 1 sources

                        while (true) {
                            var18_4[var16_5++] = _9W.a(var19_10).intern();
                            if ((var13_9 += var14_8) < var17_7) {
                                var14_8 = var15_6.charAt(var13_9);
                                ** continue;
                            }
                            var15_6 = "\u00db\u0013\u00c9\u00ee\u001c\u00a0\u00b2\u0088\u00a8d\u00bd\u00e6$\u0019\u0080\u009e\u0010\u00e9a\u008e\u00e8\u00b9\u00d5$\u00e5\u00a6lK\u00e5\u00b0 \u00ab\u00d0";
                            var17_7 = "\u00db\u0013\u00c9\u00ee\u001c\u00a0\u00b2\u0088\u00a8d\u00bd\u00e6$\u0019\u0080\u009e\u0010\u00e9a\u008e\u00e8\u00b9\u00d5$\u00e5\u00a6lK\u00e5\u00b0 \u00ab\u00d0".length();
                            var14_8 = 16;
                            var13_9 = -1;
lbl39:
                            // 2 sources

                            while (true) {
                                v6 = ++var13_9;
                                v4 = var15_6.substring(v6, v6 + var14_8);
                                v5 = 0;
                                break block13;
                                break;
                            }
                            break;
                        }
lbl44:
                        // 1 sources

                        while (true) {
                            var18_4[var16_5++] = _9W.a(var19_10).intern();
                            if ((var13_9 += var14_8) < var17_7) {
                                var14_8 = var15_6.charAt(var13_9);
                                ** continue;
                            }
                            break block14;
                            break;
                        }
                    }
                    var19_10 = var11_2.doFinal(v4.getBytes("ISO-8859-1"));
                    switch (v5) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl56:
                        // 1 sources

                        ** continue;
                    }
                }
                _9W.b = var18_4;
                _9W.c = new String[18];
                _9W.g = new HashMap<K, V>(13);
                var0_11 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var1_12 = 1; var1_12 < 8; ++var1_12) {
                    v9 = v9;
                    v9[var1_12] = (byte)(var20 << var1_12 * 8 >>> 56);
                }
                var0_11.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_13 = new long[2];
                var3_14 = 0;
                var4_15 = "\u0005\u00b05\u00cc\u00c6\u008a\u00cc,U\u0084~\u00ef\u008a,\u00b4\u00ab";
                var5_16 = "\u0005\u00b05\u00cc\u00c6\u008a\u00cc,U\u0084~\u00ef\u008a,\u00b4\u00ab".length();
                var2_17 = 0;
                while (true) {
                    break block15;
                    break;
                }
lbl78:
                // 1 sources

                while (true) {
                    var6_13[v10] = ((long)var10_20[0] & 255L) << 56 | ((long)var10_20[1] & 255L) << 48 | ((long)var10_20[2] & 255L) << 40 | ((long)var10_20[3] & 255L) << 32 | ((long)var10_20[4] & 255L) << 24 | ((long)var10_20[5] & 255L) << 16 | ((long)var10_20[6] & 255L) << 8 | (long)var10_20[7] & 255L;
                    if (var2_17 < var5_16) ** continue;
                    break block16;
                    break;
                }
            }
            var7_18 = var4_15.substring(var2_17, var2_17 += 8).getBytes("ISO-8859-1");
            v10 = var3_14++;
            var8_19 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
            var10_20 = var0_11.doFinal(new byte[]{(byte)(var8_19 >>> 56), (byte)(var8_19 >>> 48), (byte)(var8_19 >>> 40), (byte)(var8_19 >>> 32), (byte)(var8_19 >>> 24), (byte)(var8_19 >>> 16), (byte)(var8_19 >>> 8), (byte)var8_19});
            ** while (true)
        }
        _9W.e = var6_13;
        _9W.f = new Integer[2];
        _9W.c("\u00d2", (BiConsumer<Integer, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, 2(long int java.lang.String ), (Ljava/lang/Integer;Ljava/lang/String;)V)((long)var22_1), (long)361114372221732606L, (long)var20);
    }

    private static int b(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x7400;
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
                throw new RuntimeException("dev/krypton/9W", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _9W.f[n2] = n3;
        }
        return f[n2];
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _9W.a(l2, l3);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                _9W.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/9W" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _9W.b(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _9W.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _9W.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _9W.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _9W.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
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
            throw new RuntimeException("dev/krypton/9W" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l2, long l3) {
        int n = _9W.a(l2, l3);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = _9W.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _9W.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _9W.a(clazz3, string2, clazz2)) != null) {
                    _9W.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _9W.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _9W.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _9W.b(1927806908768326L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _9W.a(l2, l3);
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
                clazz3 = _9W.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _9W.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _9W.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _9W.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _9W.b(1927806908768326L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _9W.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _9W.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _9W.b(1927806908768326L, 0L);
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/9W" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
            case 0 -> 7;
            case 1 -> 61;
            case 2 -> 42;
            case 3 -> 21;
            case 4 -> 2;
            case 5 -> 13;
            case 6 -> 62;
            case 7 -> 1;
            case 8 -> 3;
            case 9 -> 25;
            case 10 -> 44;
            case 11 -> 10;
            case 12 -> 15;
            case 13 -> 23;
            case 14 -> 32;
            case 15 -> 38;
            case 16 -> 56;
            case 17 -> 14;
            case 18 -> 28;
            case 19 -> 31;
            case 20 -> 41;
            case 21 -> 18;
            case 22 -> 50;
            case 23 -> 9;
            case 24 -> 39;
            case 25 -> 34;
            case 26 -> 5;
            case 27 -> 26;
            case 28 -> 49;
            case 29 -> 63;
            case 30 -> 52;
            case 31 -> 35;
            case 32 -> 12;
            case 33 -> 48;
            case 34 -> 46;
            case 35 -> 54;
            case 36 -> 20;
            case 37 -> 47;
            case 38 -> 17;
            case 39 -> 33;
            case 40 -> 24;
            case 41 -> 27;
            case 42 -> 53;
            case 43 -> 51;
            case 44 -> 36;
            case 45 -> 45;
            case 46 -> 37;
            case 47 -> 22;
            case 48 -> 30;
            case 49 -> 8;
            case 50 -> 58;
            case 51 -> 43;
            case 52 -> 0;
            case 53 -> 6;
            case 54 -> 11;
            case 55 -> 40;
            case 56 -> 16;
            case 57 -> 19;
            case 58 -> 60;
            case 59 -> 29;
            case 60 -> 55;
            case 61 -> 4;
            case 62 -> 59;
            default -> 57;
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
        _9W.i[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "))[!K94<Y`Net\u001b";
        objectArray[1] = "a<I!i\u000e\u0014\u001cB.xAu\u0012I%|\u001b\u0001";
        objectArray[2] = Void.TYPE;
        _9W.i[2] = "java/lang/Void";
        objectArray[3] = Boolean.TYPE;
        _9W.i[3] = "java/lang/Boolean";
        objectArray[4] = "jf[U\u007f\u0007wsY\u0014z[:o";
        objectArray[5] = "I1]\u0005)\u0018E9\\N`\u0010Y1^\u0005\u0004\u0004E0\u007fI$\u0012I*";
        objectArray[6] = "eB3\u0006\u0011ZxW1G\u0014\u00066K";
        objectArray[7] = "C&b}^@6\u0006irO\u000fW\bbyKU#";
        objectArray[8] = "(:\u0017N=\u007f]\u001a\u001cA,0<\u0014\u0017J(jH";
        objectArray[9] = "\u0014\u0007\u000b5^z\u001f\b\u001az#b\f\u000f\u00133";
        objectArray[10] = "\u000fxa>N|\u0004wpq.e\b{r-";
        objectArray[11] = "x(^f68s'O)J!|'Iet1";
        objectArray[12] = "yz\u0016cY<ru\u0007,>>g~\u0007g\u0005";
        objectArray[13] = Integer.TYPE;
        _9W.i[13] = "java/lang/Integer";
        objectArray[14] = "~(v\bN\u001b\u000b\b}\u0007_Tj\u0006v\f[\u000e\u001e";
        objectArray[15] = "\u0016\u000bS\u0006]Y\u001d\u0004BI?Z\u0012\r";
        objectArray[16] = Long.TYPE;
        _9W.i[16] = "java/lang/Long";
        objectArray[17] = "\u0015 qSTw\b5s\u0012Q+D.";
        objectArray[18] = "\u0000*m\u0000\u0004\u0002\u000b%|Oy\u0017\u0019?~\f";
        objectArray[19] = "\u0003\u000e\tV=]\u0006A/EzZ\u001d<\u000bEvU\u0004";
        objectArray[20] = "S*!N]P_\" \u0005\u0014XC*\"NpL_+\t\f_RU+8";
        objectArray[21] = "\"O6m}=Wo=blr6a6ih(B";
        objectArray[22] = "6[CC>\r=TR\f}\u00002[RG}\u00042N\u001boq\u000f=]POu\u000f(|TAd\u000e.C";
        objectArray[23] = "C{e\u0011\u000fZHtt^LWG{t\u0015LSGn=\"TX]s~\u0015lnk\u007fr\u001e";
        objectArray[24] = "O7#oJ\u0011Q?9 \u0002\u0011K5!g\u000b\n\u000b\u0014<M\u000b\nV#8k\u0016";
        objectArray[25] = "q;1mp\u0003\u0004\u001b:baLe\u00151ie\u0016\u0011";
        objectArray[26] = "\"\u0004Jw8B?\u0011H6=\u001ep;";
        objectArray[27] = "u\\R\f\u001bW~SCCzYuXG\u0019";
        objectArray[28] = "G4?\n=q2\u00144\u0005,>S\u001a?\u000e(d'";
        objectArray[29] = "\u0010\u001e0o\u0002y\u001b\u001f4nb}G\u0012O.\u0007kT\u001b6)\u0000)H~\"(\u000f\u007fR\u0013- \u0003\u007f+G)!\u0002h\u0012@,*\u0012\u0014";
        objectArray[30] = "t[g\u001a\u0018\u0006s^`bBgu[z\u0006M\u0019-X~\f";
        objectArray[31] = "\u0017ss\u0004Id\\)qS;dNn2\u0005zz[\u0014w\rDcBmp\n\u0006\u007f'%rQ\ng\u001as*\u0001B\u001c";
        objectArray[32] = "\u0004q<V[3\u0003v~J>+\\x.Yy$:%x\u0010\u000f1\u0007s @GJ\u000b/z\u0018Ew]w*P>";
        objectArray[33] = "V\u001fk\u007fu\u0015Q\u001al\u0007#t\f\u001c\u007flpKM[pd";
        objectArray[34] = "3C\u0006\u0016 C4F\u0001np\"i\u001c\u0002\u0011+Ob\u001d\u0006\u0010";
        objectArray[35] = "z\\ZoLTq]^n,P-P}jKA,FYa,\u0007$CZuU\u0000#\u0001F\u0010\u0013\t/QD.A\u0004-P%)J\b!@\u001c.O\u00031<";
        objectArray[36] = "Hop{`dOjw\u0003;\u0005\u0019n{=zoX<yx";
        objectArray[37] = "\f9:A\bu\u0002nh_q`\u000e~\u0011R\u0014bc<2D\u000ej\u001a;5\u0006\u0012\u000f";
        objectArray[38] = "L$MJ,[\rcBBB[wzRG \u0002\u0019)\u0012\u00108dL$MJ,[\rcBBB";
        objectArray[39] = "<almj?3i`m\u0013=<%H}R4-Y0=*c*dfez+Q";
        objectArray[40] = "\u0007\\9#\\)R\u000b!$6\\\bU%.6|\u0002U>)\b)UM9";
        objectArray[41] = "NS\u0018\u0017K(ER\u001c\u0016+*\u0018O.\u0013i>\u0012U \u0002I(\u001eOgVN:\nV\u001eQIx\u00163\\\bT:\u0015^W\tP;u";
        objectArray[42] = "\u0014\u001d`3O\u000e\u0013\u001a\"/*\u001aS\u0005v(QwK\nt)\u001b\u0012X\u0012e%*MHBmq\u001aLEI`L";
        objectArray[43] = ";G;7\u0004|lL:5t6\u0007\\+/\u0016ji\u000fkx\u000e\f<^$6\u0014a7_ 7t";
        objectArray[44] = "[(\u0007CPe\\-\u0000;\u0007\u0004Xg\u001aY]j\u000b'MA;=\\&\u001cG\u0002:Y-\f;";
        objectArray[45] = "\u007f&X)\u001e9~g\b,f/i`4#\u001d}(bWv\u00058a";
        objectArray[46] = "\u001ac\u0001\u001e6\u0007\u0011b\u0005\u001fV\nHx~_3\u0015^f\u0007X4WB\u0003D\u0003l\u0018\u001c3E\u000eg\u0015!";
        objectArray[47] = "DEr\u000bx~CB0\u0017\u001d|\u0007Jv\bgf\u001cO\rE&>K[0\u0013~n\u0003 <O$6\u0001\u001dj\u0017t~z\u001eh\u000bbb\u0003\u0019oI~\u0007";
        objectArray[48] = "2\t\b\u00153\tsN\u0007\u001d]\n\tW\u0017\u0018?Pg\u0004WO'60SV\u001e!\u000f7V]\u000e]";
        objectArray[49] = "\u001b\u0003oe\\t\u001c\u0006h\u001d\u000f\u0015@^.o\n%AS%b";
        objectArray[50] = "@M`\u001c]$\u0015U%U%?VW9[A!,\b:XZ\"U\u000f=\u001aFG\u0015PnGY~\u0012UeW%";
        objectArray[51] = "5\n\u001d2\u0004'8\u0010Qry,6\u0011w?\u001f?:\b@\u0007)\t6\u0004KB\u0016x6\u0017T8\u0018/d\t-";
        objectArray[52] = "G\u001f\u007fPW\t@\u001ax(\u0003hDPbJZ\u0006\u0017\u00105R<Q@\u0011dT\u0005VE\u001at(";
        objectArray[53] = "\nzz!\u0005c\u0005rv!|a\n>^1'r\u001d#q%|0\u0002=h/\u00057\u0005\u007ftJ";
        objectArray[54] = "No\u0003ZT\b\u000f(\fR:\nu1\u001cWXQ\u001bb\\\u0000@7L5]QF\u000eK0VA:";
        objectArray[55] = "1c<\u000e\",z9>YP*h`{\u000f\u0017:\u00015=[a/<ce\u000b)T1c<\u000e\",z9>YP";
        objectArray[56] = "t2\u00166]4\u007f3\u00127=0#>13Z!\"(\u00158=g*-\u0016,D`-o\nI\u0003<0-\f0\u0004;r1ip[h/.Pw^c?R";
        objectArray[57] = "\b@\nE:=\u0014V\u0010DFriB\u0015C&)W\u0017B[!C";
        objectArray[58] = "*\u001d\u0007Y\u000f\u001dr\u001e\u0003S1\n!I\fEMc+P\nX\u0000\u00068H\u001bT1\u00028I\u0004\fT\u0011 X\b=\b\u0005{B\u001d\u0004\u000f\u0000pRa";
        objectArray[59] = "o\"yk\u0013\f.p{.b\u001c\"z\tl\u0004W?`0k\u0001\\/\u001c";
        objectArray[60] = "^yuSY%\u000b.mT3UO~w^3p[prY\r%\fhu";
        objectArray[61] = "\u001cs\u001fk\u0004\u0004\u0017r\u001bjd\u0006Jo`*\u0001\u0016Xv\u0019-\u0006TD\u0013\r,\t\u0002^~\u0002$\u0005\u0002'";
        objectArray[62] = "8}zUeo$k`T\u0019/Y/kKfq4$jOg\u0011";
        objectArray[63] = "y\bY\u0014'to[\u0018QUww=_\u00124m\u007ffI\r6th\u001b\u001c\u001a0i\u0010XF\u0017*ni_AU6\u000b";
        objectArray[64] = "#\u001f&^\u007f\u0002$\u001a!&*c P;Dr\rs\u0010l\\\u0014Ry\u0019l])\u0004!I$&";
        Object[] objectArray2 = objectArray;
        objectArray[65] = "e\u0005G\u0014!40R_\u0013KJg\rL\u000f+cm\u0006 \u001f%mn\u0001\u001eJrui";
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
            if (c == '\u00e7' || c == '\u00c8' || c == '\u00aa' || c == '\u00d2') {
                field = _9W.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e7' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c8' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00aa' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _9W.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'F' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _9W.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x7BFE;
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
                throw new RuntimeException("dev/krypton/9W", exception);
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
            _9W.c[n2] = _9W.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
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

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _9W.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void cfr_renamed_4(long var0, _6Z var2_1) {
        block40: {
            block48: {
                block47: {
                    block46: {
                        block45: {
                            block42: {
                                block44: {
                                    block43: {
                                        block41: {
                                            block37: {
                                                block39: {
                                                    block38: {
                                                        v0 = var0 = _9W.a ^ var0;
                                                        var3_2 = v0 ^ 75044838480293L;
                                                        var5_3 = v0 ^ 123690821485697L;
                                                        var7_4 = _7l.cfr_renamed_5();
                                                        try {
                                                            try {
                                                                try {
                                                                    v1 = _9W.c("\u00d1", (Object)var2_1, (long)8502888717383451497L, (long)var0);
                                                                    v2 = _9W.c("\u00aa", (long)8503929421024004179L, (long)var0);
                                                                    if (var7_4 == null) break block37;
                                                                    if (v1 == v2) {
                                                                    }
                                                                    ** GOTO lbl37
                                                                }
                                                                catch (MatchException v3) {
                                                                    throw _9W.a(v3);
                                                                }
                                                                v4 = _9W.c("\u00aa", (long)8505503749785974261L, (long)var0);
                                                                if (var7_4 == null) break block38;
                                                            }
                                                            catch (MatchException v5) {
                                                                throw _9W.a(v5);
                                                            }
                                                            if (v4 == null) break block39;
                                                        }
                                                        catch (MatchException v6) {
                                                            throw _9W.a(v6);
                                                        }
                                                        v4 = _9W.c("\u00aa", (long)8505503749785974261L, (long)var0);
                                                    }
                                                    _9W.c("\u00d1", (Object)v4, (Object)_9W.c("F", (int)_9W.c("\u00d1", (Object)_9W.c("\u00d1", (Object)_9W.c("\u00d1", (Object)var2_1, (long)8503267216427019443L, (long)var0), (Object)_9W.a("u", (int)28117, (long)(4727431693512728620L ^ var0)), (long)8503215435814256518L, (long)var0), (long)8504982968985789803L, (long)var0), (long)8503899723486779502L, (long)var0), (Object)_9W.c("\u00d1", (Object)_9W.c("\u00d1", (Object)_9W.c("\u00d1", (Object)var2_1, (long)8503267216427019443L, (long)var0), (Object)_9W.a("u", (int)19095, (long)(7643837545763030880L ^ var0)), (long)8503215435814256518L, (long)var0), (long)8503767624160932142L, (long)var0), (long)8503003917285596813L, (long)var0);
                                                }
                                                try {
                                                    try {
                                                        v7 = new Object[1];
                                                        v7[0] = var3_2;
                                                        _9W.c("F", (Object)v7, (long)8503709093180714477L, (long)var0);
                                                        if (var0 >= 0L && var7_4 != null) break block40;
lbl37:
                                                        // 2 sources

                                                        v8 = var2_1;
                                                        if (var0 < 0L || var7_4 == null) break block41;
                                                    }
                                                    catch (MatchException v9) {
                                                        throw _9W.a(v9);
                                                    }
                                                    v1 = _9W.c("\u00d1", (Object)v8, (long)8502888717383451497L, (long)var0);
                                                    v2 = _9W.c("\u00aa", (long)8503103972202859102L, (long)var0);
                                                }
                                                catch (MatchException v10) {
                                                    throw _9W.a(v10);
                                                }
                                            }
                                            if (v1 != v2) break block40;
                                            v8 = var2_1;
                                        }
                                        try {
                                            try {
                                                try {
                                                    v11 /* !! */  = _9W.c("\u00d1", (Object)_9W.c("\u00d1", (Object)v8, (long)8503267216427019443L, (long)var0), (Object)_9W.a("u", (int)12831, (long)(2491471591282950112L ^ var0)), (long)8504407934611114739L, (long)var0);
                                                    if (var7_4 == null) break block42;
                                                    if (v11 /* !! */  != false) {
                                                    }
                                                    ** GOTO lbl88
                                                }
                                                catch (MatchException v12) {
                                                    throw _9W.a(v12);
                                                }
                                                v11 /* !! */  = _9W.c("\u00d1", (Object)_9W.c("\u00d1", (Object)_9W.c("\u00d1", (Object)_9W.c("\u00d1", (Object)var2_1, (long)8503267216427019443L, (long)var0), (Object)_9W.a("u", (int)21669, (long)(1662046524836665686L ^ var0)), (long)8503215435814256518L, (long)var0), (long)8503767624160932142L, (long)var0), (Object)_9W.a("u", (int)25941, (long)(6210748424356817071L ^ var0)), (long)8504130936480492313L, (long)var0);
                                                v13 = var7_4;
                                                if (var0 >= 0L) {
                                                    if (v13 == null) break block42;
                                                }
                                                ** GOTO lbl96
                                            }
                                            catch (MatchException v14) {
                                                throw _9W.a(v14);
                                            }
                                            if (v11 /* !! */  != false) {
                                            }
                                            ** GOTO lbl88
                                        }
                                        catch (MatchException v15) {
                                            throw _9W.a(v15);
                                        }
                                        var8_5 = _9W.c("\u00d1", (Object)_9W.c("\u00d1", (Object)var2_1, (long)8503267216427019443L, (long)var0), (Object)_9W.a("u", (int)7045, (long)(1808902364075136632L ^ var0)), (long)8504057420988011745L, (long)var0);
                                        try {
                                            v16 = _9W.c("\u00aa", (long)8505503749785974261L, (long)var0);
                                            if (var7_4 == null) break block43;
                                            if (v16 == null) break block44;
                                        }
                                        catch (MatchException v17) {
                                            throw _9W.a(v17);
                                        }
                                        v16 = _9W.c("\u00aa", (long)8505503749785974261L, (long)var0);
                                    }
                                    _9W.c("\u00d1", (Object)v16, (Object)_9W.c("F", (int)_9W.c("\u00d1", (Object)_9W.c("\u00d1", (Object)var8_5, (Object)_9W.a("u", (int)11065, (long)(7937603571960981209L ^ var0)), (long)8503215435814256518L, (long)var0), (long)8504982968985789803L, (long)var0), (long)8503899723486779502L, (long)var0), (Object)_9W.c("\u00d1", (Object)_9W.c("\u00d1", (Object)var8_5, (Object)_9W.a("u", (int)17392, (long)(3221069345289981448L ^ var0)), (long)8503215435814256518L, (long)var0), (long)8503767624160932142L, (long)var0), (long)8503003917285596813L, (long)var0);
                                }
                                try {
                                    if (var7_4 != null) break block40;
lbl88:
                                    // 3 sources

                                    v11 /* !! */  = _9W.c("\u00d1", (Object)_9W.c("\u00d1", (Object)var2_1, (long)8503267216427019443L, (long)var0), (Object)_9W.a("u", (int)10562, (long)(5483540860339233970L ^ var0)), (long)8504407934611114739L, (long)var0);
                                }
                                catch (MatchException v18) {
                                    throw _9W.a(v18);
                                }
                            }
                            try {
                                try {
                                    v13 = var7_4;
lbl96:
                                    // 2 sources

                                    if (var0 > 0L) {
                                        if (v13 == null) break block45;
                                        if (v11 /* !! */  == false) break block40;
                                    }
                                    ** GOTO lbl111
                                }
                                catch (MatchException v19) {
                                    throw _9W.a(v19);
                                }
                                v11 /* !! */  = _9W.c("\u00d1", (Object)_9W.c("\u00d1", (Object)_9W.c("\u00d1", (Object)_9W.c("\u00d1", (Object)var2_1, (long)8503267216427019443L, (long)var0), (Object)_9W.a("u", (int)10562, (long)(5483540860339233970L ^ var0)), (long)8503215435814256518L, (long)var0), (long)8503767624160932142L, (long)var0), (Object)_9W.a("u", (int)29109, (long)(4676136068221205568L ^ var0)), (long)8504130936480492313L, (long)var0);
                            }
                            catch (MatchException v20) {
                                throw _9W.a(v20);
                            }
                        }
                        try {
                            if (var0 <= 0L) break block46;
                            v13 = var7_4;
lbl111:
                            // 2 sources

                            if (v13 == null) break block46;
                            if (v11 /* !! */  == false) break block40;
                        }
                        catch (MatchException v21) {
                            throw _9W.a(v21);
                        }
                        v11 /* !! */  = (CallSite)true;
                    }
                    try {
                        _9W.c("\u00d2", (boolean)v11 /* !! */ , (long)8503442554693000865L, (long)var0);
                        v22 = _9W.c("\u00aa", (long)8504782684424254593L, (long)var0);
                        if (var7_4 == null) break block47;
                        if (v22 == null) break block48;
                    }
                    catch (MatchException v23) {
                        throw _9W.a(v23);
                    }
                    v22 = _9W.c("\u00aa", (long)8504782684424254593L, (long)var0);
                }
                _9W.c("\u00d1", (Object)v22, (long)8503052345718538620L, (long)var0);
            }
            try {
                v24 = 8504646941911829230L;
                if (var0 > 0L) {
                    if (_9W.c("\u00aa", (long)v24, (long)var0) == null) break block40;
                    v24 = var5_3;
                }
                v25 = new Object[1];
                v25[0] = v24;
                _9W.c("F", (Object)v25, (long)8504219367895870592L, (long)var0);
            }
            catch (MatchException v26) {
                throw _9W.a(v26);
            }
        }
    }

    private static int cfr_renamed_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        CallSite callSite = _9W.c("\u00d1", (Object)_9W.c("F", -4531812716504842812L, (long)l2), -4531049495719569492L, (long)l2);
        return (int)_9W.c("F", (Object)_9W.c("\u00d1", (Object)callSite, 0, (int)_9W.c("\u00d1", (Object)callSite, (int)_9W.b("n", 5374, (long)(0x415F617558DD21E9L ^ l2)), -4530888691981720384L, (long)l2), -4531530153625071744L, (long)l2), -4534888237806887539L, (long)l2);
    }

    private static void cfr_renamed_3(long l2, int n, String string) {
        l2 = a ^ l2;
        _9W.c("\u00d1", (Object)_9W.c("\u00aa", -5508422924879038749L, (long)l2), (Object)((String)((Object)_9W.a("u", 5276, (long)(0x2C8F0125151BDCE3L ^ l2))) + n + (String)((Object)_9W.a("u", 2788, (long)(0x1D83F8EDC573C299L ^ l2))) + string), -5509633264505544967L, (long)l2);
    }

    public static void cfr_renamed_6(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        BiConsumer biConsumer = (BiConsumer)objectArray[1];
        l2 = a ^ l2;
        _9W.c("\u00d2", (BiConsumer)biConsumer, 6131927719509546724L, (long)l2);
    }

    private static void cfr_renamed_7(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x6D2EB74CB398L;
        long l5 = l3 ^ 0x5D77CFE9F5C5L;
        JsonObject jsonObject = new JsonObject();
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        _9W.c("\u00d1", (Object)jsonObject, (Object)_9W.a("u", 17480, (long)(0x4E1D42FD6E2AC0FEL ^ l2)), (Object)_9W.c("F", (int)_9W.c("F", (Object)objectArray2, -47829777123594072L, (long)l2), -50730291604795098L, (long)l2), -49848545083692431L, (long)l2);
        _9W.c("\u00d1", (Object)jsonObject, (Object)_9W.a("u", 27965, (long)(0x4B346BB35323E98EL ^ l2)), (Object)_9W.c("\u00aa", -49893663698336858L, (long)l2), -53629222358483842L, (long)l2);
        JsonObject jsonObject2 = new JsonObject();
        _9W.c("\u00d1", (Object)jsonObject2, (Object)_9W.a("u", 14235, (long)(0x2E86FB1FF218B32FL ^ l2)), (Object)_9W.a("u", 6116, (long)(0x38F782937960935EL ^ l2)), -51780094852033097L, (long)l2);
        _9W.c("\u00d1", (Object)jsonObject2, (Object)_9W.a("u", 12047, (long)(0x59EBA042961C2BA6L ^ l2)), (Object)jsonObject, -53629222358483842L, (long)l2);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l5;
        objectArray3[1] = jsonObject2;
        objectArray3[0] = _9W.c("\u00aa", -51449802920115434L, (long)l2);
        _9W.c("\u00d1", (Object)_9W.c("\u00aa", -49980244044091197L, (long)l2), (Object)objectArray3, -51222132980217581L, (long)l2);
        _9W.c("\u00d2", null, -49893663698336858L, (long)l2);
    }

    public static void cfr_renamed_9(Object[] objectArray) {
        block3: {
            CallSite callSite;
            long l2;
            long l3;
            block2: {
                l3 = (Long)objectArray[0];
                l2 = (l3 = a ^ l3) ^ 0x24B39982E073L;
                _4w[] wArray = _7l.cfr_renamed_5();
                try {
                    callSite = _9W.c("\u00aa", 7091580636598398439L, (long)l3);
                    if (wArray == null) break block2;
                    if (callSite == null) break block3;
                }
                catch (MatchException matchException) {
                    throw _9W.a(matchException);
                }
                callSite = _9W.c("\u00aa", 7091580636598398439L, (long)l3);
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l2;
            _9W.c("\u00d1", (Object)callSite, (Object)objectArray2, 7093095020809275782L, (long)l3);
            _9W.c("\u00d2", null, 7091580636598398439L, (long)l3);
            _9W.c("\u00d2", null, 7091784417436836077L, (long)l3);
            _9W.c("\u00d2", (boolean)_9W.b("n", 10570, (long)(0x1D4F6D21BF4C3F29L ^ l3)), 7092695950234454733L, (long)l3);
            _9W.c("\u00d2", null, 7091632044953656962L, (long)l3);
        }
    }

    public static boolean boolean_8(Object[] objectArray) {
        long l2;
        long l3;
        long l4;
        block4: {
            Runnable runnable;
            block5: {
                l4 = (Long)objectArray[0];
                l3 = (Long)objectArray[1];
                runnable = (Runnable)objectArray[2];
                long l5 = l3 = a ^ l3;
                l2 = l5 ^ 0x16CEC7ECE269L;
                long l6 = l5 ^ 0x6598D6890A46L;
                long l7 = l5 ^ 0x3BC60B7F132DL;
                _4w[] wArray = _7l.cfr_renamed_5();
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l6;
                        objectArray2[0] = arg_0 -> _9W.cfr_renamed_4(l7, arg_0);
                        _9W.c("\u00d2", (_4l)((Object)_9W.c("F", (Object)objectArray2, -1665215385718085432L, (long)l3)), -1665728768927078545L, (long)l3);
                        if (wArray == null) break block4;
                        if (_9W.c("\u00aa", -1665728768927078545L, (long)l3) != null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _9W.a(matchException);
                    }
                    return false;
                }
                catch (MatchException matchException) {
                    throw _9W.a(matchException);
                }
            }
            _9W.c("\u00d2", (Runnable)runnable, -1665368843897886107L, (long)l3);
        }
        JsonObject jsonObject = new JsonObject();
        _9W.c("\u00d1", (Object)jsonObject, (Object)"v", (Object)_9W.c("F", 1, -1664204682843765110L, (long)l3), -1665578996744421923L, (long)l3);
        _9W.c("\u00d1", (Object)jsonObject, (Object)_9W.a("u", 17259, (long)(0x30C21EE3B6F7507EL ^ l3)), (Object)_9W.c("F", (long)l4, -1664768190662780819L, (long)l3), -1665133402372865509L, (long)l3);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l2;
        objectArray3[1] = jsonObject;
        objectArray3[0] = _9W.c("\u00aa", -1658962905928416642L, (long)l3);
        _9W.c("\u00d1", (Object)_9W.c("\u00aa", -1665728768927078545L, (long)l3), (Object)objectArray3, -1664557229839835457L, (long)l3);
        return true;
    }

    public static void void_8(Object[] objectArray) {
        block7: {
            long l2 = (Long)objectArray[0];
            _7l l3 = (_7l)objectArray[1];
            long l4 = l2 = a ^ l2;
            long l5 = l4 ^ 0x71D14DDDFADBL;
            long l6 = l4 ^ 0x3C9EDEF73F5L;
            try {
                if (_9W.c("\u00aa", 104200866601373439L, (long)l2) == null) {
                    return;
                }
            }
            catch (MatchException matchException) {
                throw _9W.a(matchException);
            }
            try {
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l5;
                _9W.c("\u00d2", (JsonObject)_9W.c("\u00d1", (Object)l3, (Object)objectArray2, 103747953640413893L, (long)l2), 104393008661740954L, (long)l2);
                long l7 = 105333513095473621L;
                if (l2 >= 0L) {
                    if (_9W.c("\u00aa", (long)l7, (long)l2) == false) break block7;
                    l7 = l6;
                }
                Object[] objectArray3 = new Object[1];
                objectArray3[0] = l7;
                _9W.c("F", (Object)objectArray3, 104002546602564596L, (long)l2);
            }
            catch (MatchException matchException) {
                throw _9W.a(matchException);
            }
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_9W.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_9W.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_9W.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

