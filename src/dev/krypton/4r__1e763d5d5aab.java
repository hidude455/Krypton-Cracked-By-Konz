/*
 * Decompiled with CFR 0.152.
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._4w;
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

public class _4r
extends Enum {
    public static final _4r COMBAT;
    public static final _4r MISC;
    public static final _4r DONUT;
    public static final _4r BASEFINDING;
    public static final _4r RENDER;
    public static final _4r CLIENT;
    public final String name;
    public final String icon;
    private static final _4r[] cfr_renamed_7;
    private static _4w[] cfr_renamed_1;
    private static final long a;
    private static final long b;
    private static final Object[] c;
    private static final String[] d;

    /*
     * WARNING - void declaration
     */
    private _4r() {
        void var4_2;
        void var3_1;
        void cfr_renamed_27;
        void cfr_renamed_28;
        this.name = var3_1;
        this.icon = var4_2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block15: {
            block14: {
                block13: {
                    a.b3478b03966d6fbad.a.init(_4r.class, 52);
                    _4r.a = l.a(4357139588027504163L, 2730333594237144105L, MethodHandles.lookup().lookupClass()).a(18539533006694L);
                    var14 = _4r.a ^ 11006930733386L;
                    _4r.c = new Object[17];
                    _4r.d = new String[17];
                    _4r.a();
                    if (_4r.cfr_renamed_2() != null) {
                        _4r.cfr_renamed_4(new _4w[2]);
                    }
                    var6_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var14 >>> 56);
                    for (var7_2 = 1; var7_2 < 8; ++var7_2) {
                        v2 = v2;
                        v2[var7_2] = (byte)(var14 << var7_2 * 8 >>> 56);
                    }
                    var6_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var5_3 = new String[18];
                    var11_4 = 0;
                    var10_5 = "\u00e0\u0091\u001d\u00b3\u00d8\u0011\u0093t\b\u009es\u0014\u0098\u00c0+L\u00ba\u0010M:&\t\u00dbM\u00e92\u00e8\u00cd\u00aa\u00f2HFi\u00d9\b\u00c4\u00cc\u00ce\u00de\u00b7\u00fe\u001f\u008a\u0010\u0001#u\u00c4\u001f\u00af/\u00ce\u0007\u0015\u00b3B\u00f26W\u00a6\b\u00f7\u00f3\u00ef2\u00fc\u00f2.)\b9\u00bd)\u00e5\u00cb\u0015(\u00c1\u0010\u0019A\u00f0e\u009a.\u0088\u001b6[\u00ae\u00d9,\u009cv\u00b7\bm\u00c3\u0005\u00e0\u00da\u001e\u00a6~\bx\u0097\u0097\u00b8.2dp\b\u00cc\u0003\u00f7\u0005b\u00d9 \u00af\b\u009dsO\u0088k\u0007\u00ea\u00c9\b\u00f7\u00c8\u001fM\u00f5\u00dcV\u00cf\b\u00bd\u00ce\u00d42\u007f\u000e\u0005\u00bc\bH\u00f8\u00f1\u0089\t,\u00a6\u00ea\b\u00c9t(\u008e\u0004\u00a4\u00b2P";
                    var12_6 = "\u00e0\u0091\u001d\u00b3\u00d8\u0011\u0093t\b\u009es\u0014\u0098\u00c0+L\u00ba\u0010M:&\t\u00dbM\u00e92\u00e8\u00cd\u00aa\u00f2HFi\u00d9\b\u00c4\u00cc\u00ce\u00de\u00b7\u00fe\u001f\u008a\u0010\u0001#u\u00c4\u001f\u00af/\u00ce\u0007\u0015\u00b3B\u00f26W\u00a6\b\u00f7\u00f3\u00ef2\u00fc\u00f2.)\b9\u00bd)\u00e5\u00cb\u0015(\u00c1\u0010\u0019A\u00f0e\u009a.\u0088\u001b6[\u00ae\u00d9,\u009cv\u00b7\bm\u00c3\u0005\u00e0\u00da\u001e\u00a6~\bx\u0097\u0097\u00b8.2dp\b\u00cc\u0003\u00f7\u0005b\u00d9 \u00af\b\u009dsO\u0088k\u0007\u00ea\u00c9\b\u00f7\u00c8\u001fM\u00f5\u00dcV\u00cf\b\u00bd\u00ce\u00d42\u007f\u000e\u0005\u00bc\bH\u00f8\u00f1\u0089\t,\u00a6\u00ea\b\u00c9t(\u008e\u0004\u00a4\u00b2P".length();
                    var9_7 = 8;
                    var8_8 = -1;
lbl25:
                    // 2 sources

                    while (true) {
                        v3 = ++var8_8;
                        v4 = var10_5.substring(v3, v3 + var9_7);
                        v5 = -1;
                        break block13;
                        break;
                    }
lbl30:
                    // 1 sources

                    while (true) {
                        var5_3[var11_4++] = _4r.a(var13_9).intern();
                        if ((var8_8 += var9_7) < var12_6) {
                            var9_7 = var10_5.charAt(var8_8);
                            ** continue;
                        }
                        var10_5 = ")\u00c9\u0006\u0093\u00b27R\u0006\b\u0014\"\u00bbJW\u0002\u0084\u009f";
                        var12_6 = ")\u00c9\u0006\u0093\u00b27R\u0006\b\u0014\"\u00bbJW\u0002\u0084\u009f".length();
                        var9_7 = 8;
                        var8_8 = -1;
lbl39:
                        // 2 sources

                        while (true) {
                            v6 = ++var8_8;
                            v4 = var10_5.substring(v6, v6 + var9_7);
                            v5 = 0;
                            break block13;
                            break;
                        }
                        break;
                    }
lbl44:
                    // 1 sources

                    while (true) {
                        var5_3[var11_4++] = _4r.a(var13_9).intern();
                        if ((var8_8 += var9_7) < var12_6) {
                            var9_7 = var10_5.charAt(var8_8);
                            ** continue;
                        }
                        break block14;
                        break;
                    }
                }
                var13_9 = var6_1.doFinal(v4.getBytes("ISO-8859-1"));
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
            var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
            v7 = SecretKeyFactory.getInstance("DES");
            v8 = new byte[8];
            v9 = v8;
            v8[0] = (byte)(var14 >>> 56);
            for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                v9 = v9;
                v9[var1_11] = (byte)(var14 << var1_11 * 8 >>> 56);
            }
            break block15;
lbl68:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
        var2_12 = -4871089999509751934L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        _4r.b = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
        _4r.COMBAT = new _4r(var5_3[8], 0, var5_3[3], var5_3[13]);
        _4r.MISC = new _4r(var5_3[10], 1, var5_3[12], var5_3[16]);
        _4r.DONUT = new _4r(var5_3[1], 2, var5_3[0], var5_3[6]);
        _4r.BASEFINDING = new _4r(var5_3[4], 3, var5_3[7], var5_3[2]);
        _4r.RENDER = new _4r(var5_3[11], 4, var5_3[9], var5_3[14]);
        _4r.CLIENT = new _4r(var5_3[5], 5, var5_3[17], var5_3[15]);
        _4r.cfr_renamed_7 = _4r.a("\u00f1", (long)4097880381067195505L, (long)var14);
    }

    public native String toString();

    public static native _4r[] values();

    public static native _4r valueOf(String var0);

    private static native Field b(Class var0, String var1, Class var2);

    private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

    private static native Class b(long var0, long var2);

    private static native Field c(long var0, long var2);

    private static native Method d(long var0, long var2);

    private static native MethodHandle a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

    private static native CallSite a(MethodHandles.Lookup var0, String var1, MethodType var2);

    private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

    private static native Object a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

    private static native String a(byte[] var0);

    private static native int a(long var0, long var2);

    private static native void a();

    private static native Field a(Class var0, String var1, Class var2);

    public static native void cfr_renamed_4(_4w[] var0);

    public static native _4w[] cfr_renamed_2();

    private static native _4r[] cfr_renamed_6();
}

