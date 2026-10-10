/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_11905
 *  net.minecraft.class_11908
 *  net.minecraft.class_11909
 *  net.minecraft.class_2561
 *  net.minecraft.class_332
 *  net.minecraft.class_437
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._4J;
import dev.krypton._4r;
import dev.krypton._8B;
import dev.krypton._8Q;
import dev.krypton._8q_0;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_11905;
import net.minecraft.class_11908;
import net.minecraft.class_11909;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_437;

public class _9M
extends class_437
implements _4J {
    public List cfr_renamed_4;
    public _8q_0 cfr_renamed_9;
    public _8B cfr_renamed_3;
    private String cfr_renamed_6;
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private double cfr_renamed_5;
    private String cfr_renamed_0;
    private static int cfr_renamed_8;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static final Object[] h;
    private static final String[] i;

    public static native void cfr_renamed_5(int var0);

    public native boolean method_25404(class_11908 var1);

    protected native void method_56131();

    public native void method_25420(class_332 var1, int var2, int var3, float var4);

    public native void method_25419();

    public native void method_25394(class_332 var1, int var2, int var3, float var4);

    public native boolean method_25421();

    public native boolean method_25400(class_11905 var1);

    public native boolean method_25406(class_11909 var1);

    public native boolean method_25401(double var1, double var3, double var5, double var7);

    public native boolean method_25403(class_11909 var1, double var2, double var4);

    public native boolean method_25402(class_11909 var1, boolean var2);

    /*
     * WARNING - void declaration
     */
    public _9M(long l2) {
        block6: {
            void var8_6;
            long l3 = l2 = a ^ l2;
            long l4 = l3 ^ 0x434D5173403FL;
            long l5 = l3 ^ 0x284D66571BF1L;
            super((class_2561)class_2561.method_43473());
            _9M.c("\u00dc", (Object)this, new ArrayList(), 7993982993687846522L, (long)l2);
            _9M.c("\u00dc", (Object)this, null, 7984027696419991603L, (long)l2);
            int n = _9M.cfr_renamed_3();
            _9M.c("\u00dc", (Object)this, -1.0, 7984671099647341034L, (long)l2);
            _9M.c("\u00dc", (Object)this, null, 7995207667166864232L, (long)l2);
            int n2 = n;
            CallSite callSite = _9M.b("w", 21992, (long)(0x7E2C6CEE83E8C597L ^ l2));
            CallSite callSite2 = _9M.c("\u00ca", 7983297492752220699L, (long)l2);
            int n3 = ((CallSite)callSite2).length;
            int n4 = 0;
            block2: while (n4 < n3) {
                CallSite callSite3 = callSite2[n4];
                try {
                    _9M.c("\u00e9", (Object)_9M.c("V", (Object)this, 7993982993687846522L, (long)l2), (Object)new _8Q((int)var8_6, (int)_9M.b("w", 22056, (long)(0x4DD51020BDCE4644L ^ l2)), (int)_9M.b("w", 20161, (long)(0x4855E5B0E3D05EA1L ^ l2)), l5, (int)_9M.b("w", 7849, (long)(0x54BE56A3AA770EDDL ^ l2)), (_4r)((Object)callSite3), this), 7982841835744080315L, (long)l2);
                    var8_6 += 250;
                    ++n4;
                    do {
                        int n5 = n2;
                        if (l2 > 0L) {
                            if (n5 != 0) break block6;
                            n5 = n2;
                        }
                        if (n5 == 0) continue block2;
                    } while (l2 <= 0L);
                    break;
                }
                catch (MatchException matchException) {
                    throw _9M.a(matchException);
                }
            }
            _9M.c("\u00dc", (Object)this, (_8q_0)new _8q_0((int)var8_6, l4, (int)_9M.b("w", 22056, (long)(0x4DD51020BDCE4644L ^ l2)), (int)_9M.b("w", 26302, (long)(0x560A0583DC4076C2L ^ l2)), this), 7995235620112757430L, (long)l2);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        a.b3478b03966d6fbad.a.init(_9M.class, 63);
                        _9M.a = l.a(-6493371548712068535L, 2000484989407860433L, MethodHandles.lookup().lookupClass()).a(157367807322452L);
                        _9M.h = new Object[155];
                        _9M.i = new String[155];
                        _9M.a();
                        _9M.d = new HashMap<K, V>(13);
                        _9M.cfr_renamed_5(0);
                        var11 = _9M.a ^ 43983699233829L;
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
                        var17_5 = " \u0097\u00ab\u00dc\u0095\u00e89\u009e\u00d8\u00e9\u0082\u00ccj\u00c5d.\u0010\u007fw:\u00e4G\u0086#U\u00c1;\u00ae\u00ae_\u00f8[I\u0010\u00e8\u0089\u00e0\u00dbi\u00e2\u0086\u000e\u00b3\u00aa\u00bb\u009a+(\u00e6Y\u0010b\u0003\u008e\u00ee\u00a3\u00ae>D-J\u00b5\u009c\u0084\u00d4*\u00af";
                        var19_6 = " \u0097\u00ab\u00dc\u0095\u00e89\u009e\u00d8\u00e9\u0082\u00ccj\u00c5d.\u0010\u007fw:\u00e4G\u0086#U\u00c1;\u00ae\u00ae_\u00f8[I\u0010\u00e8\u0089\u00e0\u00dbi\u00e2\u0086\u000e\u00b3\u00aa\u00bb\u009a+(\u00e6Y\u0010b\u0003\u008e\u00ee\u00a3\u00ae>D-J\u00b5\u009c\u0084\u00d4*\u00af".length();
                        var16_7 = 16;
                        var15_8 = -1;
lbl25:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl30:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = _9M.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u0005~\u00ed\u0082\u00de\u00f3\u0011;\u0089\u00f8ZA\u001aQ\u0012\b\u0010s\u00eb\u00ac+\u0015b\u00a1^=N\u0019l\u00ff[\u00a8\u0092";
                            var19_6 = "\u0005~\u00ed\u0082\u00de\u00f3\u0011;\u0089\u00f8ZA\u001aQ\u0012\b\u0010s\u00eb\u00ac+\u0015b\u00a1^=N\u0019l\u00ff[\u00a8\u0092".length();
                            var16_7 = 16;
                            var15_8 = -1;
lbl39:
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
lbl44:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = _9M.a(var21_9).intern();
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
lbl56:
                        // 1 sources

                        ** continue;
                    }
                }
                _9M.b = var20_3;
                _9M.c = new String[6];
                _9M.g = new HashMap<K, V>(13);
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
                var6_12 = new long[32];
                var3_13 = 0;
                var4_14 = "G\u00ee\r\u00b0\\\u00bf\b\u0088W\u008fIWR\u00843U\u00bc\u0015%\u00cf\u000e\n\u00b4\u001f]\u00f7\u00b9Jx\u00a8\u00b2Q\u0085\u001c*\n\u0017G\u00a7\b ]\u00ae\u00be\u00c5\u009b\u00cd\u0093\u00c6\u00d8r\u00a3\u0007\u00d4~\n\u00f7\u00f0\u0005\u0096\r\u000f\u00cd\u009f\u00aea_\u00ca\u009f\u0007\u00cb\u000f]\\`D\u00b8E\u00d3\u00b3q\u00d9\u00da\u0088\u00e1\u00195n\u00fc}L\u0016j'\u008b\u00ec\u00f34\u0014\u00f3`\u00d4\u00134\u00e2Wq\u00df\u0091.\u0000v\u008a\u008a\u00e3\u00d1/`\u00f3cS$aR\u00e3L\u0017n{\u008a\u0007(\u00f9\u00f3\u00f9\u00c5K\u00e8h\u00bf\u001cN\u00d2b\u00ca%\u0015\u00d4\u0002\u00bfE\u00aapD\u00e77\u00b7@~e\u00b2%\u000e\u001e\u008c\u00eb\u00b3Sl\u009e\u00ca\u00bfb\u00ba\u00b1\u008a\u00b7\u00e51O\u00db]e`\u00c7\u0085\u00ee\u00b3n\u00fb\u0083\u0088v)\u0086_\u009f_5\u00b2\u00a6\u00f3so\u00cf\u0015\u00fbv\u00b0PK\u00b4\u001a\u0019\n\u00b1\u0080\u00b6\u00d8tz\u00e3\u0002\u00a2. \u00a5>\u00b0B^\u00b8\u00acg\u00f3d\u001d\u00b176";
                var5_15 = "G\u00ee\r\u00b0\\\u00bf\b\u0088W\u008fIWR\u00843U\u00bc\u0015%\u00cf\u000e\n\u00b4\u001f]\u00f7\u00b9Jx\u00a8\u00b2Q\u0085\u001c*\n\u0017G\u00a7\b ]\u00ae\u00be\u00c5\u009b\u00cd\u0093\u00c6\u00d8r\u00a3\u0007\u00d4~\n\u00f7\u00f0\u0005\u0096\r\u000f\u00cd\u009f\u00aea_\u00ca\u009f\u0007\u00cb\u000f]\\`D\u00b8E\u00d3\u00b3q\u00d9\u00da\u0088\u00e1\u00195n\u00fc}L\u0016j'\u008b\u00ec\u00f34\u0014\u00f3`\u00d4\u00134\u00e2Wq\u00df\u0091.\u0000v\u008a\u008a\u00e3\u00d1/`\u00f3cS$aR\u00e3L\u0017n{\u008a\u0007(\u00f9\u00f3\u00f9\u00c5K\u00e8h\u00bf\u001cN\u00d2b\u00ca%\u0015\u00d4\u0002\u00bfE\u00aapD\u00e77\u00b7@~e\u00b2%\u000e\u001e\u008c\u00eb\u00b3Sl\u009e\u00ca\u00bfb\u00ba\u00b1\u008a\u00b7\u00e51O\u00db]e`\u00c7\u0085\u00ee\u00b3n\u00fb\u0083\u0088v)\u0086_\u009f_5\u00b2\u00a6\u00f3so\u00cf\u0015\u00fbv\u00b0PK\u00b4\u001a\u0019\n\u00b1\u0080\u00b6\u00d8tz\u00e3\u0002\u00a2. \u00a5>\u00b0B^\u00b8\u00acg\u00f3d\u001d\u00b176".length();
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
                    var4_14 = "\u00f7\u00a6\u00bco\u00df\u00a9\u009f\u00a5\u00b9e\u008ax\u00c5\u00df\u0097v";
                    var5_15 = "\u00f7\u00a6\u00bco\u00df\u00a9\u009f\u00a5\u00b9e\u008ax\u00c5\u00df\u0097v".length();
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
        _9M.e = var6_12;
        _9M.f = new Integer[32];
    }

    private native int[] cfr_renamed_1(Object[] var1);

    private static native int b(int var0, long var1);

    private static native int b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

    private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

    private static native Class b(long var0, long var2);

    private static native Field b(Class var0, String var1, Class var2);

    private static native CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2);

    private static native Field c(long var0, long var2);

    private static native CallSite c(MethodHandles.Lookup var0, String var1, MethodType var2);

    private static native Method d(long var0, long var2);

    private static native Field a(Class var0, String var1, Class var2);

    private static native void a();

    private static native int a(long var0, long var2);

    private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

    private static native MethodHandle a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

    private static native Object a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

    private static native String a(int var0, long var1);

    private static native CallSite a(MethodHandles.Lookup var0, String var1, MethodType var2);

    private static native MatchException a(MatchException var0);

    private static native Object a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

    private static native String a(byte[] var0);

    private native void cfr_renamed_3(Object[] var1);

    public static native int cfr_renamed_3();

    public native void cfr_renamed_6(Object[] var1);

    @Override
    public native void void_4(Object[] var1);

    private native int[] cfr_renamed_9(Object[] var1);

    public static native int cfr_renamed_0();

    public native boolean boolean_8(Object[] var1);

    public native void void_8(Object[] var1);
}

