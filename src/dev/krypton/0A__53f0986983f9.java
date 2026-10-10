/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 */
package dev.krypton;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import dev.krypton._0E;
import dev.krypton._0j;
import dev.krypton._4w;
import dev.krypton._6N;
import dev.krypton._8B;
import dev.krypton._8m;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _0A
implements _0E {
    public static final _8B cfr_renamed_0;
    public final _0j cfr_renamed_4;
    private final _6N cfr_renamed_1;
    private final _8m[] cfr_renamed_3;
    private _8m cfr_renamed_9;
    private boolean cfr_renamed_2;
    private boolean cfr_renamed_6;
    private double cfr_renamed_7;
    private double cfr_renamed_5;
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;
    private static final Object[] k;
    private static final String[] l;

    /*
     * Unable to fully structure code
     */
    public _0A(long var1_1, _0j var3_2) {
        v0 = var1_1 = _0A.a ^ var1_1;
        var4_3 = v0 ^ 76241290857580L;
        var6_4 = v0 ^ 137139544095783L;
        var8_5 = v0 ^ 45855446596442L;
        var10_6 = v0 ^ 16543523875778L;
        super();
        v1 = _0j.cfr_renamed_1();
        this.cfr_renamed_1 = new _6N((RenderPipeline)_0A.d("\u00c3", (long)316543391255735086L, (long)var1_1), var10_6);
        _0A.d("\u00f1", (Object)this, (double)1.0, (long)316141631509115714L, (long)var1_1);
        var12_7 = v1;
        _0A.d("\u00f1", (Object)this, (double)1.0, (long)316776157198039151L, (long)var1_1);
        this.cfr_renamed_4 = var3_2;
        v2 = new Object[1];
        v2[0] = var8_5;
        v3 = new Object[2];
        v3[1] = var4_3;
        v3[0] = _0A.d("h", (Object)var3_2, (Object)v2, (long)323082001591973052L, (long)var1_1);
        var13_8 = _0A.d("P", (Object)v3, (long)322445218601240548L, (long)var1_1);
        var14_9 = _0A.d("h", (Object)_0A.d("h", (Object)_0A.d("P", (int)((CallSite)var13_8).length, (long)317209849658142623L, (long)var1_1), (Object)var13_8, (long)322153318124308151L, (long)var1_1), (long)322867867692679487L, (long)var1_1);
        this.cfr_renamed_3 = new _8m[5];
        var15_10 = 0;
        while (var15_10 < ((CallSite)_0A.d("\u00e4", (Object)this, (long)322575644249655544L, (long)var1_1)).length) {
            _0A.d("\u00e4", (Object)this, (long)322575644249655544L, (long)var1_1)[var15_10] = new _8m((ByteBuffer)var14_9, (int)_0A.d("P", (double)(27.0 * ((double)var15_10 * 0.5 + 1.0)), (long)316684464804187095L, (long)var1_1), var6_4);
            ++var15_10;
lbl28:
            // 2 sources

            ** while (var12_7 == null)
lbl29:
            // 1 sources

        }
lbl30:
        // 2 sources

        if (var1_1 <= 0L) ** GOTO lbl28
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    _0A.a = dev.krypton.l.a(2503276299499098537L, -3041000404235446812L, MethodHandles.lookup().lookupClass()).a(192240011847686L);
                    var20 = _0A.a ^ 81288381352495L;
                    var22_1 = var20 ^ 122041830811707L;
                    _0A.k = new Object[82];
                    _0A.l = new String[82];
                    _0A.b();
                    _0A.e = new HashMap<K, V>(13);
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
                    var18_4 = new String[3];
                    var16_5 = 0;
                    var15_6 = "'\u009a\u0015\u00a3\u00da\u00b8\u00f2\u0088l\u00b1Ju\u008bR\u0093\u00f5\u00f5f\u00cab\u00d4)*Uy\u00d7bV\u0010\u00cbQ\u00b1\u00d0\u0098S$\u00d0\t!\u0092\u00a7\u0083n-\u00d0%\u00cfG\u00bb>\u00f8\u00b2\\\u00bdG\u0004\u0018N\u0004A\u0018\u00d2\u00e3'\u00d2\u00c6\u00e7\u0011f;D\u0004\u00d8\u0012?2\u00023\u00d9E\nX\u00de2EY\u008cN\u0004f\u0000K?\u009e\u00a4 \u00c1\u0094\u00e9\u007f.\u0007\u00d8\u00a8\u00ed\u0089a\u00a2\u008b\u00d4\u008d\u001c\u00c6\u00a0\u00d65\u009f\u00d4\f\u0093dp4\u00dc\u00b2\\Tf\u00bb\u00c5\u00c3nQ\u00f5vd\u001c\u00c9\u0090O\u00b6\u0091\u0002\u008dUD\u00802\u00ee\u000f\u0093\u0096E\u00c7Y'\u00e9\\\u00da\r\u0000\u0090\u00a1\u00a8G\u0093\u00a3\u0082\u00c2\u0084";
                    var17_7 = "'\u009a\u0015\u00a3\u00da\u00b8\u00f2\u0088l\u00b1Ju\u008bR\u0093\u00f5\u00f5f\u00cab\u00d4)*Uy\u00d7bV\u0010\u00cbQ\u00b1\u00d0\u0098S$\u00d0\t!\u0092\u00a7\u0083n-\u00d0%\u00cfG\u00bb>\u00f8\u00b2\\\u00bdG\u0004\u0018N\u0004A\u0018\u00d2\u00e3'\u00d2\u00c6\u00e7\u0011f;D\u0004\u00d8\u0012?2\u00023\u00d9E\nX\u00de2EY\u008cN\u0004f\u0000K?\u009e\u00a4 \u00c1\u0094\u00e9\u007f.\u0007\u00d8\u00a8\u00ed\u0089a\u00a2\u008b\u00d4\u008d\u001c\u00c6\u00a0\u00d65\u009f\u00d4\f\u0093dp4\u00dc\u00b2\\Tf\u00bb\u00c5\u00c3nQ\u00f5vd\u001c\u00c9\u0090O\u00b6\u0091\u0002\u008dUD\u00802\u00ee\u000f\u0093\u0096E\u00c7Y'\u00e9\\\u00da\r\u0000\u0090\u00a1\u00a8G\u0093\u00a3\u0082\u00c2\u0084".length();
                    var14_8 = 56;
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
                        var18_4[var16_5++] = _0A.a(var19_10).intern();
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
                _0A.c = var18_4;
                _0A.d = new String[3];
                _0A.h = new HashMap<K, V>(13);
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
                var6_13 = new long[5];
                var3_14 = 0;
                var4_15 = "\u008f\\\u00e0\u00b8\u00b6\u0081E\u00e8J\u00d2\u00a2q\u0083\u00c0\u00f6\f\\`\u0097\u00ed\u00e8\u00b8\u00b5\u0081";
                var5_16 = "\u008f\\\u00e0\u00b8\u00b6\u0081E\u00e8J\u00d2\u00a2q\u0083\u00c0\u00f6\f\\`\u0097\u00ed\u00e8\u00b8\u00b5\u0081".length();
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
                    var4_15 = "w$\u007f\u00c9\u00d2\u00c0 \u0089\u0089Q\\\u009a\u00e3FR\u001b";
                    var5_16 = "w$\u007f\u00c9\u00d2\u00c0 \u0089\u0089Q\\\u009a\u00e3FR\u001b".length();
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
        _0A.f = var6_13;
        _0A.g = new Integer[5];
        _0A.cfr_renamed_0 = new _8B((int)_0A.b("p", (int)4551, (long)(6423450258887114692L ^ var20)), (int)_0A.b("p", (int)22298, (long)(1237133159292647708L ^ var20)), var22_1, (int)_0A.b("p", (int)22298, (long)(1237133159292647708L ^ var20)), (int)_0A.b("p", (int)8157, (long)(4028257439587234268L ^ var20)));
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (l[n3] != null) {
            return n3;
        }
        Object object = k[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 41;
            case 1 -> 47;
            case 2 -> 57;
            case 3 -> 59;
            case 4 -> 35;
            case 5 -> 23;
            case 6 -> 52;
            case 7 -> 26;
            case 8 -> 32;
            case 9 -> 39;
            case 10 -> 31;
            case 11 -> 7;
            case 12 -> 12;
            case 13 -> 49;
            case 14 -> 40;
            case 15 -> 24;
            case 16 -> 43;
            case 17 -> 3;
            case 18 -> 51;
            case 19 -> 62;
            case 20 -> 45;
            case 21 -> 53;
            case 22 -> 63;
            case 23 -> 48;
            case 24 -> 28;
            case 25 -> 30;
            case 26 -> 16;
            case 27 -> 4;
            case 28 -> 21;
            case 29 -> 50;
            case 30 -> 34;
            case 31 -> 9;
            case 32 -> 8;
            case 33 -> 2;
            case 34 -> 37;
            case 35 -> 60;
            case 36 -> 38;
            case 37 -> 42;
            case 38 -> 61;
            case 39 -> 17;
            case 40 -> 5;
            case 41 -> 29;
            case 42 -> 54;
            case 43 -> 58;
            case 44 -> 13;
            case 45 -> 25;
            case 46 -> 46;
            case 47 -> 44;
            case 48 -> 55;
            case 49 -> 33;
            case 50 -> 6;
            case 51 -> 1;
            case 52 -> 27;
            case 53 -> 36;
            case 54 -> 14;
            case 55 -> 20;
            case 56 -> 11;
            case 57 -> 0;
            case 58 -> 10;
            case 59 -> 18;
            case 60 -> 22;
            case 61 -> 19;
            case 62 -> 15;
            default -> 56;
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
        _0A.l[n3] = new String(cArray);
        return n3;
    }

    @Override
    public double double_9(Object[] objectArray) {
        boolean bl;
        reference v5;
        long l2;
        block9: {
            block10: {
                CallSite callSite;
                _4w[] wArray;
                long l3;
                boolean bl2;
                block8: {
                    _0A a2;
                    block6: {
                        block7: {
                            l2 = (Long)objectArray[0];
                            bl2 = (Boolean)objectArray[1];
                            l3 = l2 ^ 0x1C88119082A1L;
                            wArray = _0j.cfr_renamed_1();
                            try {
                                try {
                                    a2 = this;
                                    if (wArray == null) break block6;
                                    if (_0A.d("\u00e4", (Object)a2, -4354761074873986590L, (long)l2) == false) break block7;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw _0A.a(runtimeException);
                                }
                                callSite = _0A.d("\u00e4", (Object)this, -4355971353502006372L, (long)l2);
                                break block8;
                            }
                            catch (RuntimeException runtimeException) {
                                throw _0A.a(runtimeException);
                            }
                        }
                        a2 = this;
                    }
                    callSite = _0A.d("\u00e4", (Object)a2, -4354848192062468334L, (long)l2)[0];
                }
                CallSite callSite2 = callSite;
                try {
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l3;
                    v5 = _0A.d("h", (Object)callSite2, (Object)objectArray2, -4356098319700274132L, (long)l2) + true;
                    bl = bl2;
                    if (wArray == null) break block9;
                    if (!bl) break block10;
                }
                catch (RuntimeException runtimeException) {
                    throw _0A.a(runtimeException);
                }
                bl = true;
                break block9;
            }
            bl = false;
        }
        return (double)(v5 + bl) * _0A.d("\u00e4", (Object)this, -4355237789861216379L, (long)l2) / 1.5;
    }

    public void void_9(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        CallSite callSite = _0A.d("\u00e4", (Object)this, 1295760172606922105L, (long)l2);
        int n = ((CallSite)callSite).length;
        _4w[] wArray = _0j.cfr_renamed_1();
        for (int j = 0; j < n; ++j) {
            CallSite callSite2 = callSite[j];
            _0A.d("h", (Object)_0A.d("\u00e4", (Object)callSite2, 1289982943003873179L, (long)l2), 1294796650234704957L, (long)l2);
            if (wArray != null) continue;
        }
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _0A.b(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _0A.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int b(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x467;
        if (g[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = f[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])h.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/0A", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _0A.g[n2] = n3;
        }
        return g[n2];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0A" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e4' || c == '\u00f1' || c == '\u00c3' || c == '\u00ed') {
                field = _0A.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e4' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f1' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _0A.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'h' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'P' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static void b() {
        Object[] objectArray = k;
        k[0] = "C\b\u0005X\n&^\u001d\u0007\u0019\u000fz\u0017/";
        objectArray[1] = "G\nZ\u000b`.N\u0004YB##H\u0004M@>%\n\u0011R]y4V\u0000D\u000bJ1Q1R]y4V\u0000aLh6";
        objectArray[2] = "\u0001h(/,\u0012\u001c}*n)NSC";
        objectArray[3] = "(J\u000f\u0004 L]j\u0004\u000b1\u0003<d\u000f\u00005YH";
        objectArray[4] = Void.TYPE;
        _0A.l[4] = "java/lang/Void";
        objectArray[5] = "c9s\bmy~,qIh%7\u001d";
        objectArray[6] = "\tM#ug,\u0014X!4bpYj";
        objectArray[7] = "6K\u007fxj4Cktw{{\"e\u007f|\u007f!V";
        objectArray[8] = "VM%cbzVM2?nuL\u00062!n`Kw`\u007f> \u000f";
        objectArray[9] = "$vDGP=QVOHAr0XDCE(D";
        objectArray[10] = "\u001cR*5F\u0006\u0001G(tCZ@\u000f";
        objectArray[11] = "R\u0011A\u0013d)[\u001fBZ'$]\u001fVX:\"\u001f\u000eEMl*X\u0010I\u0013[#_\u001aIOY/A\u001b@Tg#";
        objectArray[12] = "\u000fE_\u0017QfzeT\u0018@)\u001bk_\u0013Dso";
        objectArray[13] = Double.TYPE;
        _0A.l[13] = "java/lang/Double";
        objectArray[14] = "'0PWmyR\u0010[X|63\u001ePSxlG";
        objectArray[15] = "%\u0019^y)fP9Uv8)17^}<sE";
        objectArray[16] = Boolean.TYPE;
        _0A.l[16] = "java/lang/Boolean";
        objectArray[17] = "SL\u000eI&~NY\f\b#\"\u000fD";
        objectArray[18] = "4W\fBs\u0001Aw\u0007MbN y\fFf\u0014T";
        objectArray[19] = "RRs\u0003Q\\RRd_]SH\u0019dA]FOh4\u001c\f";
        objectArray[20] = "-{=\u0010/U-{*L#Z70*R#O0A{\tt";
        objectArray[21] = "\f+`d6~<\u0015}q4?9I<l{";
        objectArray[22] = "\u0017\u007f\u0014\u000epvb_\u001f\u0001a9\u0003Q\u0014\necw";
        objectArray[23] = Integer.TYPE;
        _0A.l[23] = "java/lang/Integer";
        objectArray[24] = "\\KeQ-T_E=rzNShfVe_D";
        objectArray[25] = "`\u0017";
        objectArray[26] = "'h&\u0006ME:}$GH\u0019pR";
        objectArray[27] = "t\u0001\u000bze>\u0001!\u0000utq`/\u000b~p+\u0014";
        objectArray[28] = "(\u000e";
        objectArray[29] = "\u0012\u001a\u0017\u0015U\u001c\u0019\u0015\u0006Z6\u0011\f\u0013";
        objectArray[30] = Long.TYPE;
        _0A.l[30] = "java/lang/Long";
        objectArray[31] = "\u0003\u0019zDQs\u0006\fqD\u007fq\n\rx\u0018hp\u0005\u0007n";
        objectArray[32] = "Y\u0013=p\u001fSD\u0006?1\u001a\u000f\r\u001c";
        objectArray[33] = "+K=\r+\u000b^k6\u0002:D?e=\t>\u001eK";
        objectArray[34] = ",C./zI)\f\u0011 $U2q,<1A+";
        objectArray[35] = "4r-i5>)g/(0bhU";
        objectArray[36] = "oG=*kK\u001ag6%z\u0004{i=.~^\u000f";
        objectArray[37] = "+JO\u0004-F6_ME(\u001a\u007fj";
        objectArray[38] = "J`lyZ\u001f?@gvKP^Nl}O\n*";
        objectArray[39] = "|G\u0012bk\u001b\tg\u0019mzThi\u0012f~\u000e\u001c";
        objectArray[40] = "\u0007'\u0017I\u0018b\f(\u0006\u0006ez\u001f/\u000fO";
        objectArray[41] = "\u0007E7q\u0017\u0015re<~\u0006Z\u0013k7u\u0002\u0000g";
        objectArray[42] = "\u0012'\u0000\u001d=\u0016g\u0007\u000b\u0012,Y\u0006\t\u0000\u0019(\u0003r";
        objectArray[43] = "mD\u001ey!PfK\u000f6@^m@\u000bl";
        objectArray[44] = "\u0015!'\fc*N 92j\u007fT? ^X-\u0011az\u0003\u000f+\u0015a*VkjOg'2";
        objectArray[45] = "e=3\u001a~:e 5\u0007D<^o?@+eb'n\u0011$";
        objectArray[46] = "(:P+KQ('V6q[\u0013%S0\u0017R|+Qw\u0012k))R2\u0014\u0017h6\r!q";
        objectArray[47] = "`\u0014\"hO}`\t$uuv[N/t\u001c| I)|\b";
        objectArray[48] = "$g?\u0002P7f13\u00122w\u0018r#\u001cTsw|![QJ$g?\u0002P7f13\u00122";
        objectArray[49] = "_`M/5\u0014\u001d6A?WV\f\tL/(\u000fZfB-o\nc5Y36\u000b\u001ew\u000f?&i";
        objectArray[50] = "3s|QI?4utErz\n-j\u0006\u001d!6e;W\u0012";
        objectArray[51] = "[[;:W\u0010\u0005\u00055a5\u0013d\u0000tbRK_\\`8D";
        objectArray[52] = "@\n7dbm@\u00171yXn{X;>72G\u0010jo8";
        objectArray[53] = "hV\u0013\u001ej\u000ebR_\r\u0014NlLH\u0018\u0014\u0005e\u000fA\u0011(M4^Ntp\f:\u000fE\rkL1I.";
        objectArray[54] = "\u001f5k*5Z]cg:W\u0019# w41\u001eL.us4'\u0019,v62[X3)%W";
        objectArray[55] = "V2Q\u001dC\u001eWf\u000eN?^/q\u000f\u000bY[@\u007f\rL\\b\u0015}\u000e\tZ\u001eTbQ\u001a?";
        objectArray[56] = "k{\u0018d#zl(G~\u00187\u0000;Ff~>o5D!{\u0007o~\u001bz(6r}\\i\u0018";
        objectArray[57] = "2xx\ty[2e~\u0014C^\tp&R>Ztwu\r$";
        objectArray[58] = "@\u0000EYQk\u0015\tVW29^\u001f^J_\u0018U\u000eZ|O<J\u001fM6]k\u0018\u0011\u0007\u0007@h_\u00027YHnGOJOHbVr";
        objectArray[59] = "v\u0005\u0012EO\\qVM_t\u0018\u001dELG\u0012\u0018rKN\u0000\u0017!,W\u0013W\u0011\u001dd\u0006BXt";
        objectArray[60] = "~\u0007#n~M~\u001a%sDLE\u000e!7?Hy[~3>";
        objectArray[61] = "+R:#k/i\u000463\tc\u0017G&=okxI$zjR+R:#k/i\u000463\t";
        objectArray[62] = "\u001b]9\u0005\u0005R\u0011@4\\|\u0007\u001aZ>\u000b\u00105N\u001bcU|\u000e\fA7\u0015L\u0004\u0011Lnl";
        objectArray[63] = "tax,\u0012\"s2'6)f\u001f`91\u00173';8/";
        objectArray[64] = "n$;.cWi\"3:X\u0017W7\"8>\u001589 \u007f;,m;#:=P,$|)X";
        objectArray[65] = "+?y*%n+\"\u007f7\u001fd\u0010;f/\"m  g? ";
        objectArray[66] = "\u000f\u007f\fB{hT~\u0012|r=Na\u000b\u0010@o\u000f=\\@\u0017n\fc\u0012E)<\n:\u0002|";
        objectArray[67] = "@\u0010\u001dZTNV\u0010\u0011KiKR\u0016![\u0006^IPLD\u0012TPjNCUP\u0012\u0017XCYA/";
        objectArray[68] = "d\u001cO2H\u0005?\u001dQ\fOY>\u0019B\f\u001eM9\u001fJp_Rf\f/";
        objectArray[69] = "XK\u0014dF&_M\u001cp}daX\rr\u001bd\u000eV\u000f5\u001e][T\fp\u0018!\u001aKSc}";
        objectArray[70] = "IpB\u0017{\u0011\u000b&N\u0007\u0019Sue^\t\u007fU\u001ak\\NzlIpB\u0017{\u0011\u000b&N\u0007\u0019";
        objectArray[71] = "o\u0019\\s\u0010\u0011\u007fE\u00026{A\u000e\\R3\u001dIaRPt\u0018plO^*A\u001ds[T3{";
        objectArray[72] = "sWw#%\u00101\u0001{3GTOBk=!T Liz$msWw#%\u00101\u0001{3G";
        objectArray[73] = "\"\u0012\t\u0005Vi\"\u000f\u000f\u0018li\u0019\u001fS\u0006R,c\u0015\u0016\u000eT";
        objectArray[74] = "m\u0000a`dA(\u0012;d\nZl2:`vJ\u0017\u0015?%q\u0004+@`!p;";
        objectArray[75] = ",f}M(d,{{P\u0012`\u0017o\u007f\u0014ia+: \u0010h";
        objectArray[76] = "5[#r\u001c\u001c.Z3p%\u0017RI{sF\u001ccTx4U";
        objectArray[77] = "8\u0015`4oR.\u0015l%RA3\u000e$W=Uk\fa*+Ug\u001d\\";
        objectArray[78] = "\u0002}g@k-\u000b.s\u000bQxgjm\u000f7}\bdoH2D\u0000+m\u0010h+\u0002/p\u0014Q";
        objectArray[79] = "#8\u0003JUI)<OY+\u001d$8YZ+B.aQE\u0017\n\u007f0^ \u001a\u001d~0[\u001cRL/?>";
        objectArray[80] = "]\u007f^B\u0017mWbS\u001bn8\\xYL\u0002\n\b9\u0003\u0011n0^g\u0004N\f0A>]+";
        Object[] objectArray2 = objectArray;
        objectArray[81] = "{.a\u001d<\u0013|}>\u0007\u0007Q\u0010n?\u001faW\u007f`=Xdn!|`\u000fbRi-1\u0000\u0007";
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Method h(long l2, long l3) {
        int n = _0A.e(l2, l3);
        Object object = k[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = l[n];
                int n3 = string2.indexOf(8);
                clazz3 = _0A.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _0A.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _0A.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _0A.k[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _0A.f(3044633603790167L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _0A.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _0A.k[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _0A.f(3044633603790167L, 0L);
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

    private static Class f(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _0A.e(l2, l3);
            object = k[n];
            try {
                if (!(object instanceof String)) break block2;
                _0A.k[n] = clazz = Class.forName(l[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _0A.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _0A.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _0A.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _0A.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0A" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _0A.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x270A;
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
                throw new RuntimeException("dev/krypton/0A", exception);
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
            _0A.d[n2] = _0A.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0A" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field g(long l2, long l3) {
        int n = _0A.e(l2, l3);
        Object object = k[n];
        if (object instanceof String) {
            String string = l[n];
            int n2 = string.indexOf(8);
            Class clazz = _0A.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _0A.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _0A.c(clazz3, string2, clazz2)) != null) {
                    _0A.k[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _0A.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _0A.k[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _0A.f(3044633603790167L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void void_0(Object[] var1_1) {
        block35: {
            block36: {
                block38: {
                    block41: {
                        block40: {
                            block39: {
                                block37: {
                                    block34: {
                                        block32: {
                                            block33: {
                                                block30: {
                                                    block31: {
                                                        var6_2 = (Double)var1_1[0];
                                                        var5_3 = (Boolean)var1_1[1];
                                                        var4_4 = (Boolean)var1_1[2];
                                                        var2_5 = (Long)var1_1[3];
                                                        v0 = var2_5;
                                                        var8_6 = v0 ^ 138389462524112L;
                                                        var10_7 = v0 ^ 83868838278778L;
                                                        var12_8 = _0j.cfr_renamed_1();
                                                        try {
                                                            try {
                                                                v1 /* !! */  = _0A.d("\u00e4", (Object)this, (long)7053101605845054355L, (long)var2_5);
                                                                if (var12_8 == null) break block30;
                                                                if (v1 /* !! */  == false) break block31;
                                                            }
                                                            catch (RuntimeException v2) {
                                                                throw _0A.a(v2);
                                                            }
                                                            throw new RuntimeException((String)_0A.a("q", (int)3670, (long)(2380134232509958319L ^ var2_5)));
                                                        }
                                                        catch (RuntimeException v3) {
                                                            throw _0A.a(v3);
                                                        }
                                                    }
                                                    v1 /* !! */  = (CallSite)var5_3;
                                                }
                                                try {
                                                    try {
                                                        if (var2_5 <= 0L || var12_8 == null) break block32;
                                                        if (v1 /* !! */  != false) break block33;
                                                    }
                                                    catch (RuntimeException v4) {
                                                        throw _0A.a(v4);
                                                    }
                                                    v5 = new Object[1];
                                                    v5[0] = var10_7;
                                                    _0A.d("h", (Object)_0A.d("\u00e4", (Object)this, (long)7059591235239913389L, (long)var2_5), (Object)v5, (long)7053220917593650038L, (long)var2_5);
                                                }
                                                catch (RuntimeException v6) {
                                                    throw _0A.a(v6);
                                                }
                                            }
                                            v1 /* !! */  = (CallSite)var4_4;
                                        }
                                        try {
                                            if (v1 /* !! */  == false) break block34;
                                            _0A.d("\u00f1", (Object)this, (_8m)_0A.d("\u00e4", (Object)this, (long)7052947015156428131L, (long)var2_5)[((CallSite)_0A.d("\u00e4", (Object)this, (long)7052947015156428131L, (long)var2_5)).length - 1], (long)7060828890698998253L, (long)var2_5);
                                            if (var2_5 <= 0L) break block35;
                                            if (var12_8 != null) break block36;
                                        }
                                        catch (RuntimeException v7) {
                                            throw _0A.a(v7);
                                        }
                                    }
                                    var13_9 = _0A.d("P", (double)(var6_2 * 10.0), (long)7052779464821912463L, (long)var2_5) / 10.0;
                                    try {
                                        cfr_temp_0 = var13_9 - 3.0;
                                        v8 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                        v9 = var12_8;
                                        if (var2_5 < 0L) ** GOTO lbl75
                                        if (v9 == null) break block37;
                                        if (v8 >= 0) {
                                        }
                                        ** GOTO lbl68
                                    }
                                    catch (RuntimeException v10) {
                                        throw _0A.a(v10);
                                    }
                                    v8 = (reference)5;
                                    if (var2_5 <= 0L) break block37;
                                    var15_10 = v8;
                                    try {
                                        if (var12_8 != null) break block38;
lbl68:
                                        // 2 sources

                                        v8 = (cfr_temp_1 = var13_9 - 2.5) == 0 ? 0 : (cfr_temp_1 > 0 ? 1 : -1);
                                    }
                                    catch (RuntimeException v11) {
                                        throw _0A.a(v11);
                                    }
                                }
                                try {
                                    v9 = var12_8;
lbl75:
                                    // 2 sources

                                    if (var2_5 < 0L) ** GOTO lbl94
                                    if (v9 == null) break block39;
                                    if (v8 >= 0) {
                                    }
                                    ** GOTO lbl87
                                }
                                catch (RuntimeException v12) {
                                    throw _0A.a(v12);
                                }
                                v8 = (reference)4;
                                if (var2_5 < 0L) break block39;
                                var15_10 = v8;
                                try {
                                    if (var12_8 != null) break block38;
lbl87:
                                    // 2 sources

                                    v8 = (cfr_temp_2 = var13_9 - 2.0) == 0 ? 0 : (cfr_temp_2 > 0 ? 1 : -1);
                                }
                                catch (RuntimeException v13) {
                                    throw _0A.a(v13);
                                }
                            }
                            try {
                                v9 = var12_8;
lbl94:
                                // 2 sources

                                if (var2_5 < 0L) ** GOTO lbl113
                                if (v9 == null) break block40;
                                if (v8 >= 0) {
                                }
                                ** GOTO lbl106
                            }
                            catch (RuntimeException v14) {
                                throw _0A.a(v14);
                            }
                            v8 = (reference)3;
                            if (var2_5 <= 0L) break block40;
                            var15_10 = v8;
                            try {
                                if (var12_8 != null) break block38;
lbl106:
                                // 2 sources

                                v8 = (cfr_temp_3 = var13_9 - 1.5) == 0 ? 0 : (cfr_temp_3 > 0 ? 1 : -1);
                            }
                            catch (RuntimeException v15) {
                                throw _0A.a(v15);
                            }
                        }
                        try {
                            v9 = var12_8;
lbl113:
                            // 2 sources

                            if (v9 == null) break block41;
                            if (v8 >= 0) {
                            }
                            ** GOTO lbl124
                        }
                        catch (RuntimeException v16) {
                            throw _0A.a(v16);
                        }
                        v8 = (reference)2;
                        if (var2_5 <= 0L) break block41;
                        var15_10 = v8;
                        try {
                            if (var12_8 != null) break block38;
lbl124:
                            // 2 sources

                            v8 = (reference)true;
                        }
                        catch (RuntimeException v17) {
                            throw _0A.a(v17);
                        }
                    }
                    var15_10 = v8;
                }
                _0A.d("\u00f1", (Object)this, (_8m)_0A.d("\u00e4", (Object)this, (long)7052947015156428131L, (long)var2_5)[var15_10 - true], (long)7060828890698998253L, (long)var2_5);
            }
            _0A.d("\u00f1", (Object)this, (boolean)_0A.b("p", (int)21270, (long)(3229110435481663104L ^ var2_5)), (long)7053101605845054355L, (long)var2_5);
            _0A.d("\u00f1", (Object)this, (boolean)var5_3, (long)7060642473066746852L, (long)var2_5);
            v18 = new Object[1];
            v18[0] = var8_6;
            _0A.d("\u00f1", (Object)this, (double)((double)_0A.d("h", (Object)_0A.d("\u00e4", (Object)this, (long)7060828890698998253L, (long)var2_5), (Object)v18, (long)7060913028552160861L, (long)var2_5) / 27.0), (long)7059449609271989977L, (long)var2_5);
            _0A.d("\u00f1", (Object)this, (double)(1.0 + (var6_2 - _0A.d("\u00e4", (Object)this, (long)7059449609271989977L, (long)var2_5)) / _0A.d("\u00e4", (Object)this, (long)7059449609271989977L, (long)var2_5)), (long)7061212224712826356L, (long)var2_5);
        }
    }

    @Override
    public double cfr_renamed_2(Object[] objectArray) {
        CallSite callSite;
        CallSite callSite2;
        long l2;
        long l3;
        block19: {
            long l4;
            _8B b;
            double d;
            double d2;
            String string;
            block18: {
                Object object;
                _4w[] wArray;
                block17: {
                    block15: {
                        boolean bl;
                        block16: {
                            l3 = (Long)objectArray[0];
                            string = (String)objectArray[1];
                            d2 = (Double)objectArray[2];
                            d = (Double)objectArray[3];
                            b = (_8B)objectArray[4];
                            bl = (Boolean)objectArray[5];
                            long l5 = l3;
                            l4 = l5 ^ 0x6E154983DB23L;
                            long l6 = l5 ^ 0x6CE89CD524A9L;
                            l2 = l5 ^ 0x7DC4796F589L;
                            wArray = _0j.cfr_renamed_1();
                            callSite2 = _0A.d("\u00e4", (Object)this, -8968941474516545035L, (long)l3);
                            try {
                                try {
                                    object = callSite2;
                                    if (wArray == null) break block15;
                                    if (object != false) break block16;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw _0A.a(runtimeException);
                                }
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l6;
                                _0A.d("h", (Object)this, (Object)objectArray2, -8964138223435226900L, (long)l3);
                            }
                            catch (RuntimeException runtimeException) {
                                throw _0A.a(runtimeException);
                            }
                        }
                        object = bl;
                    }
                    try {
                        try {
                            if (wArray == null) break block17;
                            if (object == false) break block18;
                        }
                        catch (RuntimeException runtimeException) {
                            throw _0A.a(runtimeException);
                        }
                        object = _0A.d("\u00e4", (Object)_0A.d("\u00c3", -8969692262655401326L, (long)l3), -8969431589910668866L, (long)l3);
                    }
                    catch (RuntimeException runtimeException) {
                        throw _0A.a(runtimeException);
                    }
                }
                Object object2 = object;
                _0A.d("\u00f1", (Object)_0A.d("\u00c3", -8969692262655401326L, (long)l3), (int)((int)((double)_0A.d("\u00e4", (Object)b, -8969431589910668866L, (long)l3) / 255.0 * (double)object2)), -8969431589910668866L, (long)l3);
                Object[] objectArray3 = new Object[7];
                objectArray3[6] = (double)(_0A.d("\u00e4", (Object)this, -8964350537190686830L, (long)l3) / 1.5);
                objectArray3[5] = l4;
                objectArray3[4] = _0A.d("\u00c3", -8969692262655401326L, (long)l3);
                objectArray3[3] = d + _0A.d("\u00e4", (Object)this, -8962592405637253953L, (long)l3) * _0A.d("\u00e4", (Object)this, -8964350537190686830L, (long)l3) / 1.5;
                objectArray3[2] = d2 + _0A.d("\u00e4", (Object)this, -8962592405637253953L, (long)l3) * _0A.d("\u00e4", (Object)this, -8964350537190686830L, (long)l3) / 1.5;
                objectArray3[1] = string;
                objectArray3[0] = _0A.d("\u00e4", (Object)this, -8962451991823235637L, (long)l3);
                callSite = _0A.d("h", (Object)_0A.d("\u00e4", (Object)this, -8963474140923165813L, (long)l3), (Object)objectArray3, -8963303269028394326L, (long)l3);
                Object[] objectArray4 = new Object[7];
                objectArray4[6] = (double)(_0A.d("\u00e4", (Object)this, -8964350537190686830L, (long)l3) / 1.5);
                objectArray4[5] = l4;
                objectArray4[4] = b;
                objectArray4[3] = d;
                objectArray4[2] = d2;
                objectArray4[1] = string;
                objectArray4[0] = _0A.d("\u00e4", (Object)this, -8962451991823235637L, (long)l3);
                _0A.d("h", (Object)_0A.d("\u00e4", (Object)this, -8963474140923165813L, (long)l3), (Object)objectArray4, -8963303269028394326L, (long)l3);
                _0A.d("\u00f1", (Object)_0A.d("\u00c3", -8969692262655401326L, (long)l3), (int)object2, -8969431589910668866L, (long)l3);
                if (l3 < 0L || wArray != null) break block19;
            }
            Object[] objectArray5 = new Object[7];
            objectArray5[6] = (double)(_0A.d("\u00e4", (Object)this, -8964350537190686830L, (long)l3) / 1.5);
            objectArray5[5] = l4;
            objectArray5[4] = b;
            objectArray5[3] = d;
            objectArray5[2] = d2;
            objectArray5[1] = string;
            objectArray5[0] = _0A.d("\u00e4", (Object)this, -8962451991823235637L, (long)l3);
            callSite = _0A.d("h", (Object)_0A.d("\u00e4", (Object)this, -8963474140923165813L, (long)l3), (Object)objectArray5, -8963303269028394326L, (long)l3);
        }
        try {
            if (l3 >= 0L && callSite2 == false) {
                Object[] objectArray6 = new Object[1];
                objectArray6[0] = l2;
                _0A.d("h", (Object)this, (Object)objectArray6, -8962567356637393892L, (long)l3);
            }
        }
        catch (RuntimeException runtimeException) {
            throw _0A.a(runtimeException);
        }
        return (double)callSite;
    }

    @Override
    public boolean boolean_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return (boolean)_0A.d("\u00e4", (Object)this, 9009693624473464698L, (long)l2);
    }

    @Override
    public void cfr_renamed_9(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        double d = (Double)objectArray[1];
        _0A.d("\u00f1", (Object)_0A.d("\u00e4", (Object)this, 8050127334209333730L, (long)l2), (double)d, 8048134198132698856L, (long)l2);
    }

    @Override
    public void void_8(Object[] objectArray) {
        block11: {
            _0A a2;
            long l2;
            block12: {
                CallSite callSite;
                long l3;
                long l4;
                long l5;
                long l6;
                long l7;
                long l8;
                long l9;
                block9: {
                    _4w[] wArray;
                    block10: {
                        l2 = (Long)objectArray[0];
                        long l10 = l2;
                        l9 = l10 ^ 0x413BA3BA39E4L;
                        l8 = l10 ^ 0x7DF0FE76A217L;
                        l7 = l10 ^ 0x529C5CB1EDADL;
                        l6 = l10 ^ 0x17155FAE23C0L;
                        l5 = l10 ^ 0x3C57B2948E09L;
                        l4 = l10 ^ 0x28D63C6FD401L;
                        l3 = l10 ^ 0x53F6B9FF8D83L;
                        wArray = _0j.cfr_renamed_1();
                        try {
                            try {
                                callSite = _0A.d("\u00e4", (Object)this, 8506997209604727932L, (long)l2);
                                if (wArray == null) break block9;
                                if (callSite != false) break block10;
                            }
                            catch (RuntimeException runtimeException) {
                                throw _0A.a(runtimeException);
                            }
                            throw new RuntimeException((String)((Object)_0A.a("q", 24296, (long)(0x1DEBEA6AD0AC0FFCL ^ l2))));
                        }
                        catch (RuntimeException runtimeException) {
                            throw _0A.a(runtimeException);
                        }
                    }
                    try {
                        if (l2 < 0L) break block11;
                        a2 = this;
                        if (wArray == null) break block12;
                        callSite = _0A.d("\u00e4", (Object)a2, 8508208454940673035L, (long)l2);
                    }
                    catch (RuntimeException runtimeException) {
                        throw _0A.a(runtimeException);
                    }
                }
                try {
                    if (callSite == false) {
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l9;
                        _0A.d("h", (Object)_0A.d("\u00e4", (Object)this, 8509550096855380034L, (long)l2), (Object)objectArray2, 8506220654318968247L, (long)l2);
                        Object[] objectArray3 = new Object[1];
                        objectArray3[0] = l3;
                        Object[] objectArray4 = new Object[2];
                        objectArray4[1] = l8;
                        objectArray4[0] = _0A.d("h", (Object)_0A.d("P", 8508290982075910254L, (long)l2), 8505108932811526013L, (long)l2);
                        Object[] objectArray5 = new Object[2];
                        objectArray5[1] = l4;
                        objectArray5[0] = _0A.d("\u00c3", 8507512757349636442L, (long)l2);
                        Object[] objectArray6 = new Object[2];
                        objectArray6[1] = l7;
                        objectArray6[0] = _0A.d("\u00e4", (Object)this, 8509550096855380034L, (long)l2);
                        Object[] objectArray7 = new Object[4];
                        objectArray7[3] = _0A.d("h", (Object)_0A.d("\u00e4", (Object)_0A.d("\u00e4", (Object)this, 8507950736430528002L, (long)l2), 8508377482289571950L, (long)l2), 8506383707787546778L, (long)l2);
                        objectArray7[2] = l6;
                        objectArray7[1] = _0A.d("h", (Object)_0A.d("\u00e4", (Object)_0A.d("\u00e4", (Object)this, 8507950736430528002L, (long)l2), 8508377482289571950L, (long)l2), 8509309144959295837L, (long)l2);
                        objectArray7[0] = _0A.a("q", 8815, (long)(0x7C72908C516CF378L ^ l2));
                        Object[] objectArray8 = new Object[1];
                        objectArray8[0] = l5;
                        _0A.d("h", (Object)_0A.d("h", (Object)_0A.d("h", (Object)_0A.d("h", (Object)_0A.d("h", (Object)_0A.d("P", (Object)objectArray3, 8506788010873454872L, (long)l2), (Object)objectArray4, 8507358294511031634L, (long)l2), (Object)objectArray5, 8506644622695290246L, (long)l2), (Object)objectArray6, 8508249982148180452L, (long)l2), (Object)objectArray7, 8507388386207513610L, (long)l2), (Object)objectArray8, 8507726544704275883L, (long)l2);
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw _0A.a(runtimeException);
                }
                _0A.d("\u00f1", (Object)this, (boolean)_0A.b("p", 32677, (long)(0x211AA05122090DDEL ^ l2)), 8506997209604727932L, (long)l2);
                a2 = this;
            }
            _0A.d("\u00f1", (Object)a2, 1.0, 8507648731908950555L, (long)l2);
        }
    }

    @Override
    public double double_8(Object[] objectArray) {
        boolean bl;
        CallSite callSite;
        long l2;
        block15: {
            block16: {
                CallSite callSite2;
                _4w[] wArray;
                long l3;
                boolean bl2;
                int n;
                String string;
                block14: {
                    _0A a2;
                    block12: {
                        block13: {
                            CallSite callSite3;
                            block10: {
                                block11: {
                                    string = (String)objectArray[0];
                                    l2 = (Long)objectArray[1];
                                    n = (Integer)objectArray[2];
                                    bl2 = (Boolean)objectArray[3];
                                    l3 = l2 ^ 0x420D62B60A2EL;
                                    wArray = _0j.cfr_renamed_1();
                                    try {
                                        try {
                                            callSite3 = _0A.d("h", string, -5158106570804252889L, (long)l2);
                                            if (wArray == null) break block10;
                                            if (callSite3 == false) break block11;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw _0A.a(runtimeException);
                                        }
                                        return 0.0;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw _0A.a(runtimeException);
                                    }
                                }
                                try {
                                    a2 = this;
                                    if (wArray == null) break block12;
                                    callSite3 = _0A.d("\u00e4", (Object)a2, -5158048239842268648L, (long)l2);
                                }
                                catch (RuntimeException runtimeException) {
                                    throw _0A.a(runtimeException);
                                }
                            }
                            try {
                                if (callSite3 == false) break block13;
                                callSite2 = _0A.d("\u00e4", (Object)this, -5154841972211238810L, (long)l2);
                                break block14;
                            }
                            catch (RuntimeException runtimeException) {
                                throw _0A.a(runtimeException);
                            }
                        }
                        a2 = this;
                    }
                    callSite2 = _0A.d("\u00e4", (Object)a2, -5158221294995360536L, (long)l2)[0];
                }
                CallSite callSite4 = callSite2;
                try {
                    Object[] objectArray2 = new Object[3];
                    objectArray2[2] = n;
                    objectArray2[1] = string;
                    objectArray2[0] = l3;
                    callSite = _0A.d("h", (Object)callSite4, (Object)objectArray2, -5157613096100301801L, (long)l2);
                    bl = bl2;
                    if (wArray == null) break block15;
                    if (!bl) break block16;
                }
                catch (RuntimeException runtimeException) {
                    throw _0A.a(runtimeException);
                }
                bl = true;
                break block15;
            }
            bl = false;
        }
        return (double)((callSite + (double)bl) * _0A.d("\u00e4", (Object)this, -5155143942633061249L, (long)l2) / 1.5);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_0A.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_0A.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_0A.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

