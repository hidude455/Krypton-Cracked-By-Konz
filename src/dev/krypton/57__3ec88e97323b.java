/*
 * Decompiled with CFR 0.152.
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
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
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _57 {
    private static final ConcurrentHashMap cfr_renamed_6;
    private static final ConcurrentHashMap cfr_renamed_0;
    private static final ConcurrentHashMap cfr_renamed_7;
    private static final ConcurrentHashMap cfr_renamed_3;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static final long[] e;
    private static final Long[] f;
    private static final Map g;
    private static final Object[] h;
    private static final String[] i;

    public static native String java_lang_String_1(Object[] var0);

    public static native void void_1(Object[] var0);

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    block11: {
                        a.b3478b03966d6fbad.a.init(_57.class, 43);
                        _57.a = l.a(4925131194908150782L, -9067117160498167351L, MethodHandles.lookup().lookupClass()).a(206885751546922L);
                        _57.h = new Object[51];
                        _57.i = new String[51];
                        _57.a();
                        _57.d = new HashMap<K, V>(13);
                        var11 = _57.a ^ 47981359563442L;
                        var13_1 = Cipher.getInstance("DES/CBC/NoPadding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var11 >>> 56);
                        for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                            v2 = v2;
                            v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                        }
                        var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var19_3 = new long[8];
                        var16_4 = 0;
                        var17_5 = "\u0016\u00dcB!\u001c\u0010;\u001av\u0012\u00985\u00fa\u0014'8D(\u001a=\u0098\u00c2T\u007f\u009e#\u0084\u00b2\u0015\u0014\u0094\u0010\u00ce`3\u00cbh\u00a5\u0014k\u00cf\u00a01\u0080B>7\u00f8";
                        var18_6 = "\u0016\u00dcB!\u001c\u0010;\u001av\u0012\u00985\u00fa\u0014'8D(\u001a=\u0098\u00c2T\u007f\u009e#\u0084\u00b2\u0015\u0014\u0094\u0010\u00ce`3\u00cbh\u00a5\u0014k\u00cf\u00a01\u0080B>7\u00f8".length();
                        var15_7 = 0;
                        while (true) {
                            var20_8 = var17_5.substring(var15_7, var15_7 += 8).getBytes("ISO-8859-1");
                            v3 = var19_3;
                            v4 = var16_4++;
                            v5 = ((long)var20_8[0] & 255L) << 56 | ((long)var20_8[1] & 255L) << 48 | ((long)var20_8[2] & 255L) << 40 | ((long)var20_8[3] & 255L) << 32 | ((long)var20_8[4] & 255L) << 24 | ((long)var20_8[5] & 255L) << 16 | ((long)var20_8[6] & 255L) << 8 | (long)var20_8[7] & 255L;
                            v6 = -1;
                            break block11;
                            break;
                        }
lbl30:
                        // 1 sources

                        while (true) {
                            v3[v4] = v7;
                            if (var15_7 < var18_6) ** continue;
                            var17_5 = "\u00db\u00df\u00ea\u00a5*\u0012Q\u00cc+,\u009euY\u0094#\u008d";
                            var18_6 = "\u00db\u00df\u00ea\u00a5*\u0012Q\u00cc+,\u009euY\u0094#\u008d".length();
                            var15_7 = 0;
                            while (true) {
                                var20_8 = var17_5.substring(var15_7, var15_7 += 8).getBytes("ISO-8859-1");
                                v3 = var19_3;
                                v4 = var16_4++;
                                v5 = ((long)var20_8[0] & 255L) << 56 | ((long)var20_8[1] & 255L) << 48 | ((long)var20_8[2] & 255L) << 40 | ((long)var20_8[3] & 255L) << 32 | ((long)var20_8[4] & 255L) << 24 | ((long)var20_8[5] & 255L) << 16 | ((long)var20_8[6] & 255L) << 8 | (long)var20_8[7] & 255L;
                                v6 = 0;
                                break block11;
                                break;
                            }
                            break;
                        }
lbl43:
                        // 1 sources

                        while (true) {
                            v3[v4] = v7;
                            if (var15_7 < var18_6) ** continue;
                            break block12;
                            break;
                        }
                    }
                    var21_9 = v5;
                    var23_10 = var13_1.doFinal(new byte[]{(byte)(var21_9 >>> 56), (byte)(var21_9 >>> 48), (byte)(var21_9 >>> 40), (byte)(var21_9 >>> 32), (byte)(var21_9 >>> 24), (byte)(var21_9 >>> 16), (byte)(var21_9 >>> 8), (byte)var21_9});
                    v7 = ((long)var23_10[0] & 255L) << 56 | ((long)var23_10[1] & 255L) << 48 | ((long)var23_10[2] & 255L) << 40 | ((long)var23_10[3] & 255L) << 32 | ((long)var23_10[4] & 255L) << 24 | ((long)var23_10[5] & 255L) << 16 | ((long)var23_10[6] & 255L) << 8 | (long)var23_10[7] & 255L;
                    switch (v6) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl56:
                        // 1 sources

                        ** continue;
                    }
                }
                _57.b = var19_3;
                _57.c = new Integer[8];
                _57.g = new HashMap<K, V>(13);
                var0_11 = Cipher.getInstance("DES/CBC/NoPadding");
                v8 = SecretKeyFactory.getInstance("DES");
                v9 = new byte[8];
                v10 = v9;
                v9[0] = (byte)(var11 >>> 56);
                for (var1_12 = 1; var1_12 < 8; ++var1_12) {
                    v10 = v10;
                    v10[var1_12] = (byte)(var11 << var1_12 * 8 >>> 56);
                }
                var0_11.init(2, (Key)v8.generateSecret(new DESKeySpec(v10)), new IvParameterSpec(new byte[8]));
                var6_13 = new long[2];
                var3_14 = 0;
                var4_15 = "\u0010\u00bec\u00e9\u00be3\u007f\u00df\u0085\u00b5\u008dB\u0005L\u00d9\u00eb";
                var5_16 = "\u0010\u00bec\u00e9\u00be3\u007f\u00df\u0085\u00b5\u008dB\u0005L\u00d9\u00eb".length();
                var2_17 = 0;
                while (true) {
                    break block13;
                    break;
                }
lbl78:
                // 1 sources

                while (true) {
                    var6_13[v11] = ((long)var10_20[0] & 255L) << 56 | ((long)var10_20[1] & 255L) << 48 | ((long)var10_20[2] & 255L) << 40 | ((long)var10_20[3] & 255L) << 32 | ((long)var10_20[4] & 255L) << 24 | ((long)var10_20[5] & 255L) << 16 | ((long)var10_20[6] & 255L) << 8 | (long)var10_20[7] & 255L;
                    if (var2_17 < var5_16) ** continue;
                    break block14;
                    break;
                }
            }
            var7_18 = var4_15.substring(var2_17, var2_17 += 8).getBytes("ISO-8859-1");
            v11 = var3_14++;
            var8_19 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
            var10_20 = var0_11.doFinal(new byte[]{(byte)(var8_19 >>> 56), (byte)(var8_19 >>> 48), (byte)(var8_19 >>> 40), (byte)(var8_19 >>> 32), (byte)(var8_19 >>> 24), (byte)(var8_19 >>> 16), (byte)(var8_19 >>> 8), (byte)var8_19});
            ** while (true)
        }
        _57.e = var6_13;
        _57.f = new Long[2];
        _57.cfr_renamed_6 = new ConcurrentHashMap<K, V>();
        _57.cfr_renamed_0 = new ConcurrentHashMap<K, V>();
        _57.cfr_renamed_7 = new ConcurrentHashMap<K, V>();
        _57.cfr_renamed_3 = new ConcurrentHashMap<K, V>();
    }

    public static native CompletableFuture cfr_renamed_1(Object[] var0);

    private static native CompletableFuture cfr_renamed_1(int var0, byte var1, int var2, byte var3, byte var4, Integer var5);

    private static native CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2);

    private static native long b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

    private static native long b(int var0, long var1);

    private static native Field b(Class var0, String var1, Class var2);

    private static native Class b(long var0, long var2);

    private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

    private static native CallSite c(MethodHandles.Lookup var0, String var1, MethodType var2);

    private static native Field c(long var0, long var2);

    private static native Method d(long var0, long var2);

    private static native Field a(Class var0, String var1, Class var2);

    private static native int a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

    private static native int a(long var0, long var2);

    private static native void a();

    private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

    private static native MethodHandle a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

    private static native Object a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

    private static native Throwable a(Throwable var0);

    private static native int a(int var0, long var1);

    private static native CallSite a(MethodHandles.Lookup var0, String var1, MethodType var2);

    public static native String cfr_renamed_4(Object[] var0);

    public static native String java_lang_String_6(Object[] var0);

    private static native byte[][] byte_arr_arr_6(Object[] var0);

    private static native CompletableFuture cfr_renamed_3(Integer var0);

    private static native CompletableFuture cfr_renamed_8(byte var0, byte var1, int var2, long var3, Integer var5);

    public static native CompletableFuture java_util_concurrent_CompletableFuture_7(Object[] var0);

    public static native void void_7(Object[] var0);

    private static native byte[][] cfr_renamed_0(Object[] var0);
}

