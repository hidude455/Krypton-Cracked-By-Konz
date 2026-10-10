/*
 * Decompiled with CFR 0.152.
 */
package dev.krypton;

import dev.krypton._2;
import dev.krypton._3T;
import dev.krypton._3a;
import dev.krypton._3i_0;
import dev.krypton._6U;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _4w {
    private final Map cfr_renamed_2 = new HashMap();
    private static String[] cfr_renamed_1;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public void cfr_renamed_5(_3T t) {
        block9: {
            List list;
            int[] nArray;
            long l2;
            block8: {
                l2 = a ^ 0x281161EBFC74L;
                nArray = _6U.cfr_renamed_7();
                List list2 = (List)this.cfr_renamed_2.get(t.getClass());
                try {
                    list = list2;
                    if (nArray != null) break block8;
                    if (list == null) break block9;
                }
                catch (Throwable throwable) {
                    throw _4w.a(throwable);
                }
                list = list2;
            }
            for (_3a a2 : list) {
                try {
                    a2.cfr_renamed_9(t);
                }
                catch (Throwable throwable) {
                    System.err.println((String)((Object)_4w.a("h", 21698, (long)(0x68202DEEF9866356L ^ l2))) + t.getClass().getSimpleName() + (String)((Object)_4w.a("h", 22262, (long)(0x2EC3A5C3F246E161L ^ l2))) + a2.cfr_renamed_4().getClass().getSimpleName());
                    throwable.printStackTrace();
                }
                if (nArray == null) continue;
            }
        }
        try {
            if (_4w.cfr_renamed_8() == null) {
                _6U.cfr_renamed_6(new int[5]);
            }
        }
        catch (Throwable throwable) {
            throw _4w.a(throwable);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                _4w.a = l.a(3312209389139567707L, -2731769230949984595L, MethodHandles.lookup().lookupClass()).a(41297617267758L);
                _4w.d = new HashMap<K, V>(13);
                var0 = _4w.a ^ 76194277625353L;
                _4w.cfr_renamed_8(new String[4]);
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[4];
                var7_4 = 0;
                var6_5 = "\u00fe/W\u00a8\u00bb8\u0000\u00f1Dx\u00c5\u00f7A\u001b\u0095\u00e7H\u00b3e\u00af\u0096\u00ca\u00f7\u00a4\u0082\u00a5\u00f5\u00dcz\u0098S\u0093\tO\u00a2\u000e\u00aek\u00d0\u0007\u00f5\u001e\u0003\u00a7LBk\u0017\u00b9Ms\u009fv\u008e5f~N&\u00a5\u00c6\u0002t\u0097\u00f0q&\u00ce\u00da\u00f5\u00bd6\u00e1\u00e3\u00ad\u0097\u001f\u0007\u00ef\u008b\u00bc\u00f7\u00cd4L\r\u00b0j\u0006";
                var8_6 = "\u00fe/W\u00a8\u00bb8\u0000\u00f1Dx\u00c5\u00f7A\u001b\u0095\u00e7H\u00b3e\u00af\u0096\u00ca\u00f7\u00a4\u0082\u00a5\u00f5\u00dcz\u0098S\u0093\tO\u00a2\u000e\u00aek\u00d0\u0007\u00f5\u001e\u0003\u00a7LBk\u0017\u00b9Ms\u009fv\u008e5f~N&\u00a5\u00c6\u0002t\u0097\u00f0q&\u00ce\u00da\u00f5\u00bd6\u00e1\u00e3\u00ad\u0097\u001f\u0007\u00ef\u008b\u00bc\u00f7\u00cd4L\r\u00b0j\u0006".length();
                var5_7 = 16;
                var4_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = _4w.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00c0agZ\u00ee\u009ePC\u0007\u00ca8\u00a3\u00c1J\u00f0\u00e08\u0085K\u0013\u0015R\u00fe@M\u00a2\u00f3$q\u0015\u00b1\u00de*\u00cf\u0082\u00ae\u00ae<x\u00deT\u00f8#g\r\u0086\u0004X\u00b1x\u00ac\u00ec\u00f1un^@\u0086\u00e5G\u00f2c\u0099\u00b3\u001c\u00b1Q\u0019\u00fcHF\u00c8\u00f6";
                    var8_6 = "\u00c0agZ\u00ee\u009ePC\u0007\u00ca8\u00a3\u00c1J\u00f0\u00e08\u0085K\u0013\u0015R\u00fe@M\u00a2\u00f3$q\u0015\u00b1\u00de*\u00cf\u0082\u00ae\u00ae<x\u00deT\u00f8#g\r\u0086\u0004X\u00b1x\u00ac\u00ec\u00f1un^@\u0086\u00e5G\u00f2c\u0099\u00b3\u001c\u00b1Q\u0019\u00fcHF\u00c8\u00f6".length();
                    var5_7 = 16;
                    var4_8 = -1;
lbl35:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = _4w.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl52:
                // 1 sources

                ** continue;
            }
        }
        _4w.b = var9_3;
        _4w.c = new String[4];
    }

    public void cfr_renamed_1() {
        this.cfr_renamed_2.clear();
    }

    private static List cfr_renamed_1(Class clazz) {
        return new CopyOnWriteArrayList();
    }

    public void cfr_renamed_1(Object object) {
        long l2 = a ^ 0x5A4E20B5A698L;
        int[] nArray = _6U.cfr_renamed_7();
        for (List list : this.cfr_renamed_2.values()) {
            list.removeIf(arg_0 -> _4w.cfr_renamed_2(object, arg_0));
            if (nArray == null) continue;
        }
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

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/4w" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x75ED;
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
                throw new RuntimeException("dev/krypton/4w", exception);
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
            _4w.c[n2] = _4w.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _4w.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private void cfr_renamed_4(Object object, Method method, _3i_0 i_0) {
        long l2 = a ^ 0x567A0AA9DFE1L;
        Class<?> clazz = method.getParameterTypes()[0];
        try {
            Class<?> clazz2 = method.getDeclaringClass();
            MethodHandles.Lookup lookup = MethodHandles.privateLookupIn(clazz2, MethodHandles.lookup());
            MethodHandle methodHandle = lookup.unreflect(method);
            CallSite callSite = LambdaMetafactory.metafactory(lookup, (String)((Object)_4w.a("h", 6928, (long)(0x6C5B0A5A74700F10L ^ l2))), MethodType.methodType(Consumer.class, clazz2), MethodType.methodType(Void.TYPE, Object.class), methodHandle, MethodType.methodType(Void.TYPE, clazz));
            Consumer consumer = callSite.getTarget().invoke(object);
            _3a a2 = new _3a(object, consumer, i_0.cfr_renamed_5());
            List list = this.cfr_renamed_2.computeIfAbsent(clazz, _4w::cfr_renamed_1);
            list.add(a2);
            list.sort(Comparator.comparingInt(_4w::cfr_renamed_6));
        }
        catch (Throwable throwable) {
            throw new RuntimeException((String)((Object)_4w.a("h", 23881, (long)(0x686A2179C07A494AL ^ l2))) + String.valueOf(method), throwable);
        }
    }

    private static boolean cfr_renamed_2(Object object, _3a a2) {
        boolean bl;
        long l2 = a ^ 0x67FE370F51C2L;
        try {
            bl = a2.cfr_renamed_4() == object;
        }
        catch (RuntimeException runtimeException) {
            throw _4w.a(runtimeException);
        }
        return bl;
    }

    private static int cfr_renamed_6(_3a a2) {
        return a2.dev_krypton_6U_4().cfr_renamed_0();
    }

    public static String[] cfr_renamed_8() {
        return cfr_renamed_1;
    }

    public static void cfr_renamed_8(String[] stringArray) {
        cfr_renamed_1 = stringArray;
    }

    public void cfr_renamed_8(Object object) {
        long l2 = a ^ 0x429FAD7598F6L;
        Method[] methodArray = object.getClass().getDeclaredMethods();
        int n = methodArray.length;
        int n2 = 0;
        int[] nArray = _6U.cfr_renamed_7();
        while (n2 < n) {
            block13: {
                block14: {
                    Method method;
                    Method method2;
                    block15: {
                        method2 = methodArray[n2];
                        try {
                            try {
                                try {
                                    try {
                                        if (nArray != null) break block13;
                                        if (!method2.isAnnotationPresent(_3i_0.class)) break block14;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw _4w.a(runtimeException);
                                    }
                                    method = method2;
                                    if (nArray != null) break block15;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw _4w.a(runtimeException);
                                }
                                if (method.getParameterCount() != 1) break block14;
                            }
                            catch (RuntimeException runtimeException) {
                                throw _4w.a(runtimeException);
                            }
                            method = method2;
                        }
                        catch (RuntimeException runtimeException) {
                            throw _4w.a(runtimeException);
                        }
                    }
                    Class<?> clazz = method.getParameterTypes()[0];
                    try {
                        try {
                            if (nArray != null) break block13;
                            if (!_3T.class.isAssignableFrom(clazz)) break block14;
                        }
                        catch (RuntimeException runtimeException) {
                            throw _4w.a(runtimeException);
                        }
                        this.cfr_renamed_4(object, method2, method2.getAnnotation(_3i_0.class));
                    }
                    catch (RuntimeException runtimeException) {
                        throw _4w.a(runtimeException);
                    }
                }
                ++n2;
            }
            if (nArray == null) continue;
            _4w.cfr_renamed_8(new String[3]);
            break;
        }
    }

    public static void cfr_renamed_9(_3T t) {
        _4w w;
        block6: {
            _4w w2;
            block7: {
                _2 v0;
                int[] nArray;
                long l2;
                block4: {
                    block5: {
                        long l3 = a ^ 0x20C473036911L;
                        l2 = l3 ^ 0x2BBE7C9A880FL;
                        nArray = _6U.cfr_renamed_7();
                        try {
                            v0 = _2.cfr_renamed_54;
                            if (nArray != null) break block4;
                            if (v0 != null) break block5;
                        }
                        catch (RuntimeException runtimeException) {
                            throw _4w.a(runtimeException);
                        }
                        return;
                    }
                    v0 = _2.cfr_renamed_54;
                }
                Object[] objectArray = new Object[1];
                objectArray[0] = l2;
                w2 = v0.dev_krypton_4w_8(objectArray);
                try {
                    w = w2;
                    if (nArray != null) break block6;
                    if (w != null) break block7;
                }
                catch (RuntimeException runtimeException) {
                    throw _4w.a(runtimeException);
                }
                return;
            }
            w = w2;
        }
        w.cfr_renamed_5(t);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_4w.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

