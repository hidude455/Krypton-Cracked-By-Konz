/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_437
 *  net.minecraft.class_4587
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._02;
import dev.krypton._3G;
import dev.krypton._4w;
import dev.krypton._6;
import dev.krypton._9M;
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
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_437;
import net.minecraft.class_4587;

public class _2 {
    public static final class_4587 cfr_renamed_1;
    public static class_310 cfr_renamed_53;
    public static _2 cfr_renamed_54;
    public static _9l cfr_renamed_55;
    public static String cfr_renamed_9;
    public static String cfr_renamed_47;
    public static volatile long cfr_renamed_2;
    public static int cfr_renamed_56;
    private final Object cfr_renamed_7;
    public _6 cfr_renamed_57;
    public _3G cfr_renamed_58;
    public _02 cfr_renamed_59;
    public _4w cfr_renamed_0;
    public boolean cfr_renamed_20;
    public _9M cfr_renamed_4;
    public class_437 cfr_renamed_42;
    private volatile boolean cfr_renamed_8;
    private volatile boolean cfr_renamed_6;
    private ExecutorService cfr_renamed_5;
    private static String[] cfr_renamed_3;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static final long[] h;
    private static final Long[] i;
    private static final Map j;
    private static final Object[] k;
    private static final String[] l;

    private native void cfr_renamed_5(long var1);

    private native void cfr_renamed_5(int var1, long var2, List var4);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public _2(long l2) {
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x16C80A949C11L;
        long l5 = l4 >>> 8;
        int n = (int)(l4 << 56 >>> 56);
        long l6 = l3 ^ 0x28EF9DD86D03L;
        String[] stringArray = _2.cfr_renamed_9();
        this.cfr_renamed_7 = new Object();
        _2.d("o", (Object)this, null, -757625108285545225L, (long)l2);
        String[] stringArray2 = stringArray;
        _2.d("o", (Object)this, (boolean)_2.b("y", 9919, (long)(0x327BC302D8A3AEE7L ^ l2)), -758774171946866989L, (long)l2);
        _2.d("o", (Object)this, (boolean)_2.b("y", 9919, (long)(0x327BC302D8A3AEE7L ^ l2)), -771698338428923658L, (long)l2);
        _2.d("\u00d3", (_2)this, -771004907507716077L, (long)l2);
        _2.d("o", (Object)this, (ExecutorService)new ThreadPoolExecutor(0, (int)_2.b("y", 26523, (long)(0xCE37D4BBFCCEFF4L ^ l2)), (long)_2.c("f", 27846, (long)(0x68DC669DB4A3FD6EL ^ l2)), (TimeUnit)((Object)_2.d("V", -757286488573225825L, (long)l2)), new SynchronousQueue<Runnable>(), arg_0 -> _2.cfr_renamed_8(l5, (byte)n, arg_0), new ThreadPoolExecutor.AbortPolicy()), -757180736001161395L, (long)l2);
        _2.d("S", (Object)_2.d("p", (Object)this, -757180736001161395L, (long)l2), () -> this.cfr_renamed_6(l6), -772394446839667564L, (long)l2);
        String[] stringArray3 = _2.d("p", (Object)this, -757793474812487235L, (long)l2);
        synchronized (stringArray3) {
            block15: {
                block13: {
                    String[] stringArray4;
                    block14: {
                        while (_2.d("p", (Object)this, -758774171946866989L, (long)l2) == false) {
                            try {
                                _2.d("S", (Object)_2.d("p", (Object)this, -757793474812487235L, (long)l2), -758046405557742643L, (long)l2);
                                stringArray4 = stringArray2;
                                if (l2 <= 0L) break block13;
                            }
                            catch (InterruptedException interruptedException) {
                                _2.d("S", (Object)_2.d("\u00d4", -760734831361222223L, (long)l2), -756612882729499166L, (long)l2);
                                break block14;
                            }
                            if (stringArray4 != null) {
                                continue;
                            }
                            break block15;
                        }
                        break block14;
                        {
                            catch (NumberFormatException numberFormatException) {
                                throw _2.a(numberFormatException);
                            }
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw _2.a(numberFormatException);
                        }
                    }
                    stringArray4 = stringArray3;
                }
                // ** MonitorExit[v3] (shouldn't be in output)
            }
            try {
                String[] stringArray5 = stringArray2;
                if (l2 >= 0L) {
                    if (stringArray5 != null) return;
                    stringArray5 = new String[4];
                }
                _4w.cfr_renamed_8(stringArray5);
                return;
            }
            catch (InterruptedException interruptedException) {
                throw _2.a(interruptedException);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        block20: {
                            a.b3478b03966d6fbad.a.init(_2.class, 48);
                            _2.a = dev.krypton.l.a(-2536324081952550642L, 7501580055956616410L, MethodHandles.lookup().lookupClass()).a(183920304656861L);
                            var31 = _2.a ^ 84616159980338L;
                            _2.k = new Object[181];
                            _2.l = new String[181];
                            _2.a();
                            _2.d = new HashMap<K, V>(13);
                            _2.cfr_renamed_1(new String[5]);
                            var22_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                            v0 = SecretKeyFactory.getInstance("DES");
                            v1 = new byte[8];
                            v2 = v1;
                            v1[0] = (byte)(var31 >>> 56);
                            for (var23_2 = 1; var23_2 < 8; ++var23_2) {
                                v2 = v2;
                                v2[var23_2] = (byte)(var31 << var23_2 * 8 >>> 56);
                            }
                            var22_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                            var29_3 = new String[3];
                            var27_4 = 0;
                            var26_5 = "\u00f9\u0007\u0098\u009a\u0018\u009f\u00bf|[\u0010@\u001b\u00b8\u00cc\u0095\u00ce\u00ef\u009aL\u00d9\u000ePm\u0005\u00b8\u00c94IYIwX\u0085\u0099\u0097m\u0006\bU\u0089 \u00c8w\u0004\u0007\u00d7`\u00a5\u001b\u0016\u0019|\u0081Gtc\u0099{\u00bb\u00f8\u00e8(\u00ad\u00de\u00f6\u00b8\u0003\u008d\u00e2O&Sl\u0010i\u00b3LI\u0093\u009f{\u00bb\u00d1\u00d2\u0014Z\u00ba7\u00c7\u00d2";
                            var28_6 = "\u00f9\u0007\u0098\u009a\u0018\u009f\u00bf|[\u0010@\u001b\u00b8\u00cc\u0095\u00ce\u00ef\u009aL\u00d9\u000ePm\u0005\u00b8\u00c94IYIwX\u0085\u0099\u0097m\u0006\bU\u0089 \u00c8w\u0004\u0007\u00d7`\u00a5\u001b\u0016\u0019|\u0081Gtc\u0099{\u00bb\u00f8\u00e8(\u00ad\u00de\u00f6\u00b8\u0003\u008d\u00e2O&Sl\u0010i\u00b3LI\u0093\u009f{\u00bb\u00d1\u00d2\u0014Z\u00ba7\u00c7\u00d2".length();
                            var25_7 = 40;
                            var24_8 = -1;
lbl25:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl27:
                            // 1 sources

                            while (true) {
                                var29_3[var27_4++] = _2.a(var30_9).intern();
                                if ((var24_8 += var25_7) < var28_6) {
                                    var25_7 = var26_5.charAt(var24_8);
                                    ** continue;
                                }
                                break block20;
                                break;
                            }
                            v3 = ++var24_8;
                            var30_9 = var22_1.doFinal(var26_5.substring(v3, v3 + var25_7).getBytes("ISO-8859-1"));
                            ** while (true)
                        }
                        _2.b = var29_3;
                        _2.c = new String[3];
                        _2.g = new HashMap<K, V>(13);
                        var11_10 = Cipher.getInstance("DES/CBC/NoPadding");
                        v4 = SecretKeyFactory.getInstance("DES");
                        v5 = new byte[8];
                        v6 = v5;
                        v5[0] = (byte)(var31 >>> 56);
                        for (var12_11 = 1; var12_11 < 8; ++var12_11) {
                            v6 = v6;
                            v6[var12_11] = (byte)(var31 << var12_11 * 8 >>> 56);
                        }
                        var11_10.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                        var17_12 = new long[33];
                        var14_13 = 0;
                        var15_14 = "\u00e4n_\u00ee\u008c\u00d1\u00fa\u00d7Z7\u0007\u0099Z\u00d9,\u0018\u00a5Dg\u0092\u00b9\u00dc\u0090\u0090\\`T\u00ec\u0016\u00cdD\u00efG\u00a6\u009f\u00e3\u00aeS_\u00fc<QF\u00d4\u009a\u00ef\u0014\u00c3\u00ad\u0012\u00a1\u00b4\u0012\u00bc\u00b0\u00ed\u00fc\u0004\u00a4m4\u009b\u00a8N\\\u00ca6\u00e8Ls\u00e1>\u00c8\u00f2r\u00e4\u0015\u00cc\u009b\u001a\u00fb'\u00f4&\u0098G\u00b5:_\u00d9\u0086\u0003\u009d\u00bdt\u00d4V\u00e8\t\u009d\u0093 \u00d3\u00b9\u0010DA\u008b6\u00a2KJT\u009b\u00d5\u009e|\u00f5\u001c\u00e0|\u009e\u00a9z\u00ceJ\u00bapY\u0087\u00ba\u00a9hj\u00ae\u00f6\u00da:\u0086\u00e0)o\u00c3\u009fe\u00bd\u00f3*\tN\u0082qHD\u00117\u00c6PMb6\u0084\u0080\u00d4\u0014\u00a4\u0085\u00a6w#~\u00de\u0017\u00be\u009f\u00de\u00d4\r\u00e7t\u001b[\u0093\u00db\u00fes\u00b2\u00dc\u00a2\u0081\u00dc\u00f3/\u00a2\\\u0010m\u0089:\u00b7\u0083Vy\u0083\r$\u00d1\u008d\u00ef\u007f/q\u008e\u00de}\u0001\u00ca\u00edq\b\u009f\u00bf\u0004\u00c6\u00f4^4\u00d0\u001f2\u00e9\u00d1\u00f9\n0\u00db\u00b0\u00d4\u0019\u0087a\u00b5\tB\u0092\u0086\r8";
                        var16_15 = "\u00e4n_\u00ee\u008c\u00d1\u00fa\u00d7Z7\u0007\u0099Z\u00d9,\u0018\u00a5Dg\u0092\u00b9\u00dc\u0090\u0090\\`T\u00ec\u0016\u00cdD\u00efG\u00a6\u009f\u00e3\u00aeS_\u00fc<QF\u00d4\u009a\u00ef\u0014\u00c3\u00ad\u0012\u00a1\u00b4\u0012\u00bc\u00b0\u00ed\u00fc\u0004\u00a4m4\u009b\u00a8N\\\u00ca6\u00e8Ls\u00e1>\u00c8\u00f2r\u00e4\u0015\u00cc\u009b\u001a\u00fb'\u00f4&\u0098G\u00b5:_\u00d9\u0086\u0003\u009d\u00bdt\u00d4V\u00e8\t\u009d\u0093 \u00d3\u00b9\u0010DA\u008b6\u00a2KJT\u009b\u00d5\u009e|\u00f5\u001c\u00e0|\u009e\u00a9z\u00ceJ\u00bapY\u0087\u00ba\u00a9hj\u00ae\u00f6\u00da:\u0086\u00e0)o\u00c3\u009fe\u00bd\u00f3*\tN\u0082qHD\u00117\u00c6PMb6\u0084\u0080\u00d4\u0014\u00a4\u0085\u00a6w#~\u00de\u0017\u00be\u009f\u00de\u00d4\r\u00e7t\u001b[\u0093\u00db\u00fes\u00b2\u00dc\u00a2\u0081\u00dc\u00f3/\u00a2\\\u0010m\u0089:\u00b7\u0083Vy\u0083\r$\u00d1\u008d\u00ef\u007f/q\u008e\u00de}\u0001\u00ca\u00edq\b\u009f\u00bf\u0004\u00c6\u00f4^4\u00d0\u001f2\u00e9\u00d1\u00f9\n0\u00db\u00b0\u00d4\u0019\u0087a\u00b5\tB\u0092\u0086\r8".length();
                        var13_16 = 0;
                        while (true) {
                            var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                            v7 = var17_12;
                            v8 = var14_13++;
                            v9 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                            v10 = -1;
                            break block21;
                            break;
                        }
lbl63:
                        // 1 sources

                        while (true) {
                            v7[v8] = v11;
                            if (var13_16 < var16_15) ** continue;
                            var15_14 = "\u001d\u0099\u0090\u00db\u00cb\u007fU\u00a2$\u0091\u00bb\u009ec\u00f9[\u00af";
                            var16_15 = "\u001d\u0099\u0090\u00db\u00cb\u007fU\u00a2$\u0091\u00bb\u009ec\u00f9[\u00af".length();
                            var13_16 = 0;
                            while (true) {
                                var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                                v7 = var17_12;
                                v8 = var14_13++;
                                v9 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                                v10 = 0;
                                break block21;
                                break;
                            }
                            break;
                        }
lbl76:
                        // 1 sources

                        while (true) {
                            v7[v8] = v11;
                            if (var13_16 < var16_15) ** continue;
                            break block22;
                            break;
                        }
                    }
                    var19_18 = v9;
                    var21_19 = var11_10.doFinal(new byte[]{(byte)(var19_18 >>> 56), (byte)(var19_18 >>> 48), (byte)(var19_18 >>> 40), (byte)(var19_18 >>> 32), (byte)(var19_18 >>> 24), (byte)(var19_18 >>> 16), (byte)(var19_18 >>> 8), (byte)var19_18});
                    v11 = ((long)var21_19[0] & 255L) << 56 | ((long)var21_19[1] & 255L) << 48 | ((long)var21_19[2] & 255L) << 40 | ((long)var21_19[3] & 255L) << 32 | ((long)var21_19[4] & 255L) << 24 | ((long)var21_19[5] & 255L) << 16 | ((long)var21_19[6] & 255L) << 8 | (long)var21_19[7] & 255L;
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
                _2.e = var17_12;
                _2.f = new Integer[33];
                _2.j = new HashMap<K, V>(13);
                var0_20 = Cipher.getInstance("DES/CBC/NoPadding");
                v12 = SecretKeyFactory.getInstance("DES");
                v13 = new byte[8];
                v14 = v13;
                v13[0] = (byte)(var31 >>> 56);
                for (var1_21 = 1; var1_21 < 8; ++var1_21) {
                    v14 = v14;
                    v14[var1_21] = (byte)(var31 << var1_21 * 8 >>> 56);
                }
                var0_20.init(2, (Key)v12.generateSecret(new DESKeySpec(v14)), new IvParameterSpec(new byte[8]));
                var6_22 = new long[4];
                var3_23 = 0;
                var4_24 = "\u00f0\u0088\u00a4}\u0080\u00d5#\u00ea\rk<|!\no\u00df";
                var5_25 = "\u00f0\u0088\u00a4}\u0080\u00d5#\u00ea\rk<|!\no\u00df".length();
                var2_26 = 0;
                while (true) {
                    var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
                    v15 = var6_22;
                    v16 = var3_23++;
                    v17 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
                    v18 = -1;
                    break block23;
                    break;
                }
lbl116:
                // 1 sources

                while (true) {
                    v15[v16] = v19;
                    if (var2_26 < var5_25) ** continue;
                    var4_24 = "=\u00a1\u0086\u00ef\u00e5\u00a3<\u00e3\u0091\r^^;\u00d7\u0090\u00b1";
                    var5_25 = "=\u00a1\u0086\u00ef\u00e5\u00a3<\u00e3\u0091\r^^;\u00d7\u0090\u00b1".length();
                    var2_26 = 0;
                    while (true) {
                        var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
                        v15 = var6_22;
                        v16 = var3_23++;
                        v17 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
                        v18 = 0;
                        break block23;
                        break;
                    }
                    break;
                }
lbl129:
                // 1 sources

                while (true) {
                    v15[v16] = v19;
                    if (var2_26 < var5_25) ** continue;
                    break block24;
                    break;
                }
            }
            var8_28 = v17;
            var10_29 = var0_20.doFinal(new byte[]{(byte)(var8_28 >>> 56), (byte)(var8_28 >>> 48), (byte)(var8_28 >>> 40), (byte)(var8_28 >>> 32), (byte)(var8_28 >>> 24), (byte)(var8_28 >>> 16), (byte)(var8_28 >>> 8), (byte)var8_28});
            v19 = ((long)var10_29[0] & 255L) << 56 | ((long)var10_29[1] & 255L) << 48 | ((long)var10_29[2] & 255L) << 40 | ((long)var10_29[3] & 255L) << 32 | ((long)var10_29[4] & 255L) << 24 | ((long)var10_29[5] & 255L) << 16 | ((long)var10_29[6] & 255L) << 8 | (long)var10_29[7] & 255L;
            switch (v18) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl142:
                // 1 sources

                ** continue;
            }
        }
        _2.h = var6_22;
        _2.i = new Long[4];
        _2.cfr_renamed_1 = new class_4587();
        _2.d("\u00d3", (class_310)_2.d("\u00d4", (long)-1630391845983842745L, (long)var31), (long)-1633031223049743086L, (long)var31);
        _2.d("\u00d3", (long)_2.d("\u00d4", (long)-1630969625731648721L, (long)var31), (long)-1631414738891308188L, (long)var31);
        _2.d("\u00d3", (int)_2.b("y", (int)9919, (long)(3637648491775505147L ^ var31)), (long)-1626564478953180058L, (long)var31);
    }

    public static native void cfr_renamed_1(String[] var0);

    private static native void cfr_renamed_1(short var0, String var1, char var2, int var3, String var4);

    private native void cfr_renamed_1(long var1);

    private static native int b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

    private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

    private static native CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2);

    private static native Class b(long var0, long var2);

    private static native Field b(Class var0, String var1, Class var2);

    private static native int b(int var0, long var1);

    private static native Field c(long var0, long var2);

    private static native long c(int var0, long var1);

    private static native long c(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

    private static native CallSite c(MethodHandles.Lookup var0, String var1, MethodType var2);

    private static native Method d(long var0, long var2);

    private static native CallSite d(MethodHandles.Lookup var0, String var1, MethodType var2);

    private static native void a();

    private static native String a(byte[] var0);

    private static native CallSite a(MethodHandles.Lookup var0, String var1, MethodType var2);

    private static native Object a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

    private static native String a(int var0, long var1);

    private static native Exception a(Exception var0);

    private static native Object a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

    private static native MethodHandle a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

    private static native int a(long var0, long var2);

    private static native Field a(Class var0, String var1, Class var2);

    private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

    private native void cfr_renamed_4(long var1, String var3);

    private native void cfr_renamed_4(int var1, int var2, boolean var3, char var4, short var5, int var6);

    private native void cfr_renamed_4(int var1, char var2, int var3, String var4, String var5);

    private native void cfr_renamed_2(long var1);

    private native void cfr_renamed_3(String var1, long var2);

    private native void cfr_renamed_6(long var1, List var3);

    private static native void cfr_renamed_6(long var0, Throwable var2);

    private native void cfr_renamed_6(String var1, long var2);

    public native _02 cfr_renamed_6(Object[] var1);

    private native void cfr_renamed_6(long var1);

    private native void cfr_renamed_7(_3X var1, int var2, String var3, short var4, char var5, String var6, byte[] var7);

    private native void cfr_renamed_7(String var1, String var2, long var3);

    private static native void cfr_renamed_8(long var0);

    private native void cfr_renamed_8(String var1, int var2, long var3);

    public native _9M cfr_renamed_8(Object[] var1);

    private static native Thread cfr_renamed_8(long var0, byte var2, Runnable var3);

    private native void cfr_renamed_9(String var1, long var2);

    public static native class_2960 cfr_renamed_9(Object[] var0);

    public static native String[] cfr_renamed_9();

    private native void cfr_renamed_9(long var1);

    private native void cfr_renamed_9(int var1, char var2, char var3, int var4);

    public native _4w dev_krypton_4w_8(Object[] var1);

    private native void cfr_renamed_0(long var1);

    public native _6 dev_krypton_6_8(Object[] var1);

    private native void cfr_renamed_0(int var1, byte var2, int var3, String var4, boolean var5);
}

