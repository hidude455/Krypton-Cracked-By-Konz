/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2586
 *  net.minecraft.class_2627
 *  net.minecraft.class_2669
 *  net.minecraft.class_2818
 */
package dev.krypton;

import dev.krypton._3C;
import dev.krypton._3i_0;
import dev.krypton._4r;
import dev.krypton._6c_0;
import dev.krypton._6x_0;
import dev.krypton._8B;
import dev.krypton._92;
import dev.krypton._95;
import dev.krypton._9r;
import dev.krypton._9t_0;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2586;
import net.minecraft.class_2627;
import net.minecraft.class_2669;
import net.minecraft.class_2818;

public class _5H
extends _6x_0 {
    private static final List cfr_renamed_8;
    private final _92 cfr_renamed_4;
    private final _9r cfr_renamed_3;
    private final _9t_0 cfr_renamed_6;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void cfr_renamed_278(Object[] var1_1) {
        var2_2 = (_6c_0)var1_1[0];
        var3_3 = (Long)var1_1[1];
        v0 = var3_3 = _5H.b ^ var3_3;
        var5_4 = v0 ^ 112537351222638L;
        var7_5 = v0 ^ 134993901361026L;
        var9_6 = v0 ^ 75675301985325L;
        var11_7 = v0 ^ 98152674567083L;
        var13_8 = v0 ^ 120754480873814L;
        var15_9 = v0 ^ 30037042363421L;
        var17_10 = _3C.cfr_renamed_4();
        v1 = new Object[1];
        v1[0] = var5_4;
        var18_11 = _5H.c("T", (Object)_5H.c("\u00ee", (Object)v1, (long)-5649279472158993316L, (long)var3_3), (long)-5655135584566930610L, (long)var3_3);
        while (_5H.c("T", (Object)var18_11, (long)-5653687773588440870L, (long)var3_3) != false) {
            block23: {
                v2 = _5H.c("T", (Object)var18_11, (long)-5649553102976574411L, (long)var3_3);
                block13: while (true) {
                    var19_15 = (class_2818)v2;
                    var20_16 = _5H.c("T", (Object)_5H.c("T", (Object)var19_15, (long)-5655562009858854786L, (long)var3_3), (long)-5648051175093203793L, (long)var3_3);
                    while (_5H.c("T", (Object)var20_16, (long)-5653687773588440870L, (long)var3_3) != false) {
                        block20: {
                            block21: {
                                block22: {
                                    block19: {
                                        var21_17 = (class_2338)_5H.c("T", (Object)var20_16, (long)-5649553102976574411L, (long)var3_3);
                                        v2 = var22_18 = _5H.c("T", (Object)_5H.c("\u00db", (Object)_5H.c("\u00db", (Object)this, (long)-5653236640848425386L, (long)var3_3), (long)-5655868643165450272L, (long)var3_3), (Object)var21_17, (long)-5656170081028452986L, (long)var3_3);
                                        if (var3_3 < 0L || var17_10 != 0) continue block13;
                                        if (v2 == null) continue;
                                        v3 = new Object[1];
                                        v3[0] = var9_6;
                                        v4 = new Object[3];
                                        v4[2] = (int)_5H.c("T", (Object)_5H.c("\u00db", (Object)this, (long)-5648609558466564073L, (long)var3_3), (Object)v3, (long)-5654101767345087114L, (long)var3_3);
                                        v4[1] = var11_7;
                                        v4[0] = var22_18;
                                        var23_19 = _5H.c("T", (Object)this, (Object)v4, (long)-5655770186721163874L, (long)var3_3);
                                        try {
                                            if (var23_19 == null) {
                                                continue;
                                            }
                                        }
                                        catch (MatchException v5) {
                                            throw _5H.a(v5);
                                        }
                                        var24_20 = (double)_5H.c("T", (Object)var21_17, (long)-5654495104251775065L, (long)var3_3) + 0.1;
                                        var26_21 = (double)_5H.c("T", (Object)var21_17, (long)-5653857618918448583L, (long)var3_3) + 0.05;
                                        var28_22 = (double)_5H.c("T", (Object)var21_17, (long)-5654020475886798580L, (long)var3_3) + 0.1;
                                        var30_23 = (double)_5H.c("T", (Object)var21_17, (long)-5654495104251775065L, (long)var3_3) + 0.9;
                                        var32_12 = (double)_5H.c("T", (Object)var21_17, (long)-5653857618918448583L, (long)var3_3) + 0.85;
                                        var34_13 = (double)_5H.c("T", (Object)var21_17, (long)-5654020475886798580L, (long)var3_3) + 0.9;
                                        try {
                                            try {
                                                v6 = new Object[11];
                                                v6[10] = var13_8;
                                                v6[9] = 0;
                                                v6[8] = _5H.c("\u00d6", (long)-5656484079605447598L, (long)var3_3);
                                                v6[7] = var23_19;
                                                v6[6] = var23_19;
                                                v6[5] = var34_13;
                                                v6[4] = var32_12;
                                                v6[3] = var30_23;
                                                v6[2] = var28_22;
                                                v6[1] = var26_21;
                                                v6[0] = var24_20;
                                                _5H.c("T", (Object)var2_2.cfr_renamed_7, (Object)v6, (long)-5647919613949947037L, (long)var3_3);
                                                v7 = this;
                                                v8 = var17_10;
                                                if (var3_3 > 0L) {
                                                    if (v8 != 0) break block19;
                                                    v9 /* !! */  = (int)_5H.c("T", (Object)_5H.c("\u00db", (Object)v7, (long)-5649212693154403649L, (long)var3_3), (long)var15_9, (long)-5647637795254436304L, (long)var3_3);
                                                    if (var3_3 < 0L) break block20;
                                                    if (v9 /* !! */  == 0) break block21;
                                                }
                                                ** GOTO lbl90
                                            }
                                            catch (MatchException v10) {
                                                throw _5H.a(v10);
                                            }
                                            v7 = this;
                                        }
                                        catch (MatchException v11) {
                                            throw _5H.a(v11);
                                        }
                                    }
                                    try {
                                        try {
                                            v8 = var17_10;
lbl90:
                                            // 2 sources

                                            if (v8 != 0) break block22;
                                            if (_5H.c("\u00db", (Object)_5H.c("\u00db", (Object)v7, (long)-5653236640848425386L, (long)var3_3), (long)-5653175470334051570L, (long)var3_3) == null) break block21;
                                        }
                                        catch (MatchException v12) {
                                            throw _5H.a(v12);
                                        }
                                        v7 = this;
                                    }
                                    catch (MatchException v13) {
                                        throw _5H.a(v13);
                                    }
                                }
                                v14 = new Object[3];
                                v14[2] = (int)_5H.a("z", (int)24278, (long)(887830609362794018L ^ var3_3));
                                v14[1] = var11_7;
                                v14[0] = var22_18;
                                var36_14 = _5H.c("T", (Object)v7, (Object)v14, (long)-5655770186721163874L, (long)var3_3);
                                try {
                                    if (var3_3 >= 0L && var36_14 != null) {
                                        v15 = new Object[8];
                                        v15[7] = var36_14;
                                        v15[6] = var7_5;
                                        v15[5] = (double)_5H.c("\u00db", (Object)_5H.c("\u00d6", (long)-5655965778343044888L, (long)var3_3), (long)-5654292249975313498L, (long)var3_3);
                                        v15[4] = (double)_5H.c("\u00db", (Object)_5H.c("\u00d6", (long)-5655965778343044888L, (long)var3_3), (long)-5653395109281356932L, (long)var3_3);
                                        v15[3] = (double)_5H.c("\u00db", (Object)_5H.c("\u00d6", (long)-5655965778343044888L, (long)var3_3), (long)-5654595254394496032L, (long)var3_3);
                                        v15[2] = var28_22 + 0.4;
                                        v15[1] = var26_21 + 0.4;
                                        v15[0] = var24_20 + 0.4;
                                        _5H.c("T", (Object)var2_2.cfr_renamed_7, (Object)v15, (long)-5655188235028652861L, (long)var3_3);
                                    }
                                }
                                catch (MatchException v16) {
                                    throw _5H.a(v16);
                                }
                            }
                            v9 /* !! */  = var17_10;
                        }
                        if (var3_3 >= 0L) {
                            if (v9 /* !! */  == 0) continue;
                        }
                        break block23;
                    }
                    break;
                }
                v9 /* !! */  = var17_10;
            }
            if (v9 /* !! */  == 0) continue;
        }
    }

    public _5H(int n, short s, int n2) {
        long l2;
        long l3 = l2 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ b;
        long l4 = l3 ^ 0x3F73EB328F2CL;
        long l5 = l3 ^ 0x2F13D9FBF6BFL;
        long l6 = l3 ^ 0x694B7C710745L;
        long l7 = l3 ^ 0x6FD790FEF356L;
        long l8 = l3 ^ 0x768BEF55E837L;
        long l9 = l3 ^ 0x3F56544873E3L;
        super((int)_5H.a("z", 29891, (long)(0x4C22897427D703F9L ^ l2)), -1, (_4r)((Object)_5H.c("\u00d6", -5873363598680942201L, (long)l2)), l6);
        this.cfr_renamed_4 = new _92((int)_5H.a("z", 27449, (long)(0x2934DCFA0EB1C00L ^ l2)), 1.0, l5, 255.0, 125.0, 1.0);
        this.cfr_renamed_3 = new _9r((int)_5H.a("z", 7120, (long)(0x771AE796442EECFFL ^ l2)), false, l4);
        Object[] objectArray = new Object[1];
        objectArray[0] = l9;
        this.cfr_renamed_6 = new _9t_0(l7, (int)_5H.a("z", 23907, (long)(0x77E9047C7EF82A70L ^ l2)), (Map)((Object)_5H.c("\u00ee", (Object)objectArray, -5874865400783484621L, (long)l2)), (List)((Object)_5H.c("\u00d6", -5881388772984242453L, (long)l2)));
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = new _95[]{_5H.c("\u00db", (Object)this, -5881634153094221845L, (long)l2), _5H.c("\u00db", (Object)this, -5880063312840002237L, (long)l2), _5H.c("\u00db", (Object)this, -5874612310572101430L, (long)l2)};
        objectArray2[0] = l8;
        _5H.c("T", (Object)this, (Object)objectArray2, -5880641565367072698L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                _5H.b = l.a(720334426538299076L, -2651097665618980936L, MethodHandles.lookup().lookupClass()).a(204224139550392L);
                var11 = _5H.b ^ 124894550368453L;
                _5H.j = new Object[111];
                _5H.k = new String[111];
                _5H.b();
                _5H.f = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var11 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var6_3 = new long[51];
                var3_4 = 0;
                var4_5 = "\u007f\u00890\u0090i\u00a6\u000b\u00ee{xp2\u007fp^\u0003\u00a7\u00c0\u00e4\u00b6\u00b0\f\u00a7\u0006e)\u00b5\u00d2\u00e2\u00f7v\u00b5M\u00c3IBF)\u0082\u0089FA~\t\u0007;j\u00cf\u000e\u0018\u00d2\u00a1\u00c9fx\u00e9f\u00cb\u00c8\u00b3\u0092\u0099\u00c0+\u000b\u00f5j\u00d5\u0019\u00c7c\u0000}Q\u00e0\u00ff\u00c3d\u0016\u00b2\u0007<\u00b1[\u00bbx\u00bd\u00fb\u00d1\u008f\u00fb\u00ff\u00c5\u00b7\u0080\u0082\u00cc\u00f2'\u00f2\u0093\u00ff\u00e8`\u00c6\u0094@\u00c3$\u00b8\u00b9\u00cc\u00ae\u0013\u00f2\t\u00c1\u00d96z\u00a8\u007f\u00d7\u00b0\u007f\u00b3\u000bf\u008e\u0085V\u001dB\u00ba\u0004\u009e\u00c9^\u001f+\u0080\u00a5\u007f\u0084\u009eo_\u007f}sz>}q\u00ba8%\u00ae\u0083\u009d\u00bc\u009a\u00d9\u00c0\u00c4X\u00bcT\u00b3\u00e8T\u00ee\u00193\u00bc\u00e2\u001e;m\u009c\u00d3_\u009fmK\u009e\u00c5\u00f5\u00be\u00d8Y\u00a4G\u00daG1\u00c4 \u00bf\u00abR\u0011.\u00c0\u009a3v)\u008c\u0090x\u00b5b\u008d\u00c7\u001a\u00c9\u0088\u00b9p#\u0092\u00aeZ\u00ccT\u0018\u00af\u0090P\u001a\u0096\u00ec w\u00a5\u00bf\u007fIl?\u00d4V\u0083\u00fbN\u008aH2\u00f2\u0001\u00b3G\u00a2\u00fe\u00c6\u00e4\u00cd\u00ba\u001cpIL\u0085\u00d73\u00d5\u00af\u00eb\u00a6\u00d5\u00a4\u0000\u00daj\u0014|V<\u00f0\u00ec\u00bc[\u009b\u00c3\u00eb\u001d\u0092\u0000 \u0001\u009e\u00f4\u00b8\u009cp\u00c0v\u00a8\u00d6\u00dfx5M\u00d1\u00e5\u00ae\r\u00b3\u00b8!?\u0002\u0001\u00dc\u00f9G&{\u00ea\u00a81jQ\t\u00f0\u00122l`\u0082n\u00a2\u008d\u009b\u0089\u00c1\u009aFt\u00af\u00f8\u00a1\u0007h4~a\u00ca\u00ccv\u00c1\u00b3\u00b2~\u00ad\u001a\u00df<\u00bfR\u00fd\"\u008f7\u0002'\u00d7\u000b'\u00f7\u0016\u0094>.DK\u0000\u00f2\u00bc\u00fc\u008b\u0007\u008a\u0010\u00d4\u00c5\u00a7\u0016S\u00cd\u00df";
                var5_6 = "\u007f\u00890\u0090i\u00a6\u000b\u00ee{xp2\u007fp^\u0003\u00a7\u00c0\u00e4\u00b6\u00b0\f\u00a7\u0006e)\u00b5\u00d2\u00e2\u00f7v\u00b5M\u00c3IBF)\u0082\u0089FA~\t\u0007;j\u00cf\u000e\u0018\u00d2\u00a1\u00c9fx\u00e9f\u00cb\u00c8\u00b3\u0092\u0099\u00c0+\u000b\u00f5j\u00d5\u0019\u00c7c\u0000}Q\u00e0\u00ff\u00c3d\u0016\u00b2\u0007<\u00b1[\u00bbx\u00bd\u00fb\u00d1\u008f\u00fb\u00ff\u00c5\u00b7\u0080\u0082\u00cc\u00f2'\u00f2\u0093\u00ff\u00e8`\u00c6\u0094@\u00c3$\u00b8\u00b9\u00cc\u00ae\u0013\u00f2\t\u00c1\u00d96z\u00a8\u007f\u00d7\u00b0\u007f\u00b3\u000bf\u008e\u0085V\u001dB\u00ba\u0004\u009e\u00c9^\u001f+\u0080\u00a5\u007f\u0084\u009eo_\u007f}sz>}q\u00ba8%\u00ae\u0083\u009d\u00bc\u009a\u00d9\u00c0\u00c4X\u00bcT\u00b3\u00e8T\u00ee\u00193\u00bc\u00e2\u001e;m\u009c\u00d3_\u009fmK\u009e\u00c5\u00f5\u00be\u00d8Y\u00a4G\u00daG1\u00c4 \u00bf\u00abR\u0011.\u00c0\u009a3v)\u008c\u0090x\u00b5b\u008d\u00c7\u001a\u00c9\u0088\u00b9p#\u0092\u00aeZ\u00ccT\u0018\u00af\u0090P\u001a\u0096\u00ec w\u00a5\u00bf\u007fIl?\u00d4V\u0083\u00fbN\u008aH2\u00f2\u0001\u00b3G\u00a2\u00fe\u00c6\u00e4\u00cd\u00ba\u001cpIL\u0085\u00d73\u00d5\u00af\u00eb\u00a6\u00d5\u00a4\u0000\u00daj\u0014|V<\u00f0\u00ec\u00bc[\u009b\u00c3\u00eb\u001d\u0092\u0000 \u0001\u009e\u00f4\u00b8\u009cp\u00c0v\u00a8\u00d6\u00dfx5M\u00d1\u00e5\u00ae\r\u00b3\u00b8!?\u0002\u0001\u00dc\u00f9G&{\u00ea\u00a81jQ\t\u00f0\u00122l`\u0082n\u00a2\u008d\u009b\u0089\u00c1\u009aFt\u00af\u00f8\u00a1\u0007h4~a\u00ca\u00ccv\u00c1\u00b3\u00b2~\u00ad\u001a\u00df<\u00bfR\u00fd\"\u008f7\u0002'\u00d7\u000b'\u00f7\u0016\u0094>.DK\u0000\u00f2\u00bc\u00fc\u008b\u0007\u008a\u0010\u00d4\u00c5\u00a7\u0016S\u00cd\u00df".length();
                var2_7 = 0;
                while (true) {
                    var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                    v3 = var6_3;
                    v4 = var3_4++;
                    v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var2_7 < var5_6) ** continue;
                    var4_5 = "\u00ff-\\\u0096\u00946\u0018R5\u0086HHME\u001e\u00da";
                    var5_6 = "\u00ff-\\\u0096\u00946\u0018R5\u0086HHME\u001e\u00da".length();
                    var2_7 = 0;
                    while (true) {
                        var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                        v3 = var6_3;
                        v4 = var3_4++;
                        v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl42:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var2_7 < var5_6) ** continue;
                    break block9;
                    break;
                }
            }
            var8_9 = v5;
            var10_10 = var0_1.doFinal(new byte[]{(byte)(var8_9 >>> 56), (byte)(var8_9 >>> 48), (byte)(var8_9 >>> 40), (byte)(var8_9 >>> 32), (byte)(var8_9 >>> 24), (byte)(var8_9 >>> 16), (byte)(var8_9 >>> 8), (byte)var8_9});
            v7 = ((long)var10_10[0] & 255L) << 56 | ((long)var10_10[1] & 255L) << 48 | ((long)var10_10[2] & 255L) << 40 | ((long)var10_10[3] & 255L) << 32 | ((long)var10_10[4] & 255L) << 24 | ((long)var10_10[5] & 255L) << 16 | ((long)var10_10[6] & 255L) << 8 | (long)var10_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl55:
                // 1 sources

                ** continue;
            }
        }
        _5H.d = var6_3;
        _5H.e = new Integer[51];
        v8 = new class_2248[_5H.a("z", (int)1605, (long)(1560162672871356828L ^ var11))];
        v8[0] = _5H.c("\u00d6", (long)-1829748952134211028L, (long)var11);
        v8[1] = _5H.c("\u00d6", (long)-1829530422953027934L, (long)var11);
        v8[2] = _5H.c("\u00d6", (long)-1830532043444646641L, (long)var11);
        v8[3] = _5H.c("\u00d6", (long)-1831441940500538801L, (long)var11);
        v8[4] = _5H.c("\u00d6", (long)-1829082003418249914L, (long)var11);
        v8[5] = _5H.c("\u00d6", (long)-1836655893650313095L, (long)var11);
        v8[_5H.a("z", (int)935, (long)(1459822701751188562L ^ var11))] = _5H.c("\u00d6", (long)-1828754786846580848L, (long)var11);
        v8[_5H.a("z", (int)14285, (long)(297610990377142275L ^ var11))] = _5H.c("\u00d6", (long)-1828823351946208435L, (long)var11);
        v8[_5H.a("z", (int)20209, (long)(6748963448666091777L ^ var11))] = _5H.c("\u00d6", (long)-1828888643627044347L, (long)var11);
        v8[_5H.a("z", (int)511, (long)(1418138735196978734L ^ var11))] = _5H.c("\u00d6", (long)-1835403726807069182L, (long)var11);
        v8[_5H.a("z", (int)21436, (long)(324249399842794563L ^ var11))] = _5H.c("\u00d6", (long)-1828651547856428081L, (long)var11);
        v8[_5H.a("z", (int)4908, (long)(2719623527150726350L ^ var11))] = _5H.c("\u00d6", (long)-1831271596353274599L, (long)var11);
        v8[_5H.a("z", (int)28217, (long)(1947780924759429583L ^ var11))] = _5H.c("\u00d6", (long)-1829374781815825471L, (long)var11);
        v8[_5H.a("z", (int)16313, (long)(2047526242500673635L ^ var11))] = _5H.c("\u00d6", (long)-1837395965095118228L, (long)var11);
        v8[_5H.a("z", (int)14358, (long)(1704477244699543525L ^ var11))] = _5H.c("\u00d6", (long)-1836797214241873365L, (long)var11);
        v8[_5H.a("z", (int)15044, (long)(2033854942840390973L ^ var11))] = _5H.c("\u00d6", (long)-1836705012145736638L, (long)var11);
        v8[_5H.a("z", (int)16885, (long)(869704395530632741L ^ var11))] = _5H.c("\u00d6", (long)-1829651875463667347L, (long)var11);
        v8[_5H.a("z", (int)29529, (long)(9131442877172862087L ^ var11))] = _5H.c("\u00d6", (long)-1831138567956486626L, (long)var11);
        v8[_5H.a("z", (int)19966, (long)(8469833684751774257L ^ var11))] = _5H.c("\u00d6", (long)-1830762854168040246L, (long)var11);
        v8[_5H.a("z", (int)20059, (long)(5652650009250886067L ^ var11))] = _5H.c("\u00d6", (long)-1829158417803914747L, (long)var11);
        v8[_5H.a("z", (int)10969, (long)(8435433597708113198L ^ var11))] = _5H.c("\u00d6", (long)-1829276639510049331L, (long)var11);
        v8[_5H.a("z", (int)6530, (long)(8291328366165861972L ^ var11))] = _5H.c("\u00d6", (long)-1835631130275166477L, (long)var11);
        v8[_5H.a("z", (int)14961, (long)(738458595968124332L ^ var11))] = _5H.c("\u00d6", (long)-1830282607263111947L, (long)var11);
        v8[_5H.a("z", (int)19479, (long)(1505725284154635237L ^ var11))] = _5H.c("\u00d6", (long)-1830579349385228511L, (long)var11);
        v8[_5H.a("z", (int)8931, (long)(1929841717296209156L ^ var11))] = _5H.c("\u00d6", (long)-1837223386587882823L, (long)var11);
        v8[_5H.a("z", (int)22806, (long)(5017969070670472955L ^ var11))] = _5H.c("\u00d6", (long)-1837079296743150869L, (long)var11);
        v8[_5H.a("z", (int)19215, (long)(8525086895184606453L ^ var11))] = _5H.c("\u00d6", (long)-1831766272695557397L, (long)var11);
        v8[_5H.a("z", (int)27949, (long)(5308677208335110857L ^ var11))] = _5H.c("\u00d6", (long)-1835729546916046036L, (long)var11);
        v8[_5H.a("z", (int)9147, (long)(7031803730527788123L ^ var11))] = _5H.c("\u00d6", (long)-1836382194826998573L, (long)var11);
        v8[_5H.a("z", (int)25296, (long)(2719010874767432972L ^ var11))] = _5H.c("\u00d6", (long)-1830309727296489465L, (long)var11);
        v8[_5H.a("z", (int)14601, (long)(5627286860776507111L ^ var11))] = _5H.c("\u00d6", (long)-1831644958173697555L, (long)var11);
        v8[_5H.a("z", (int)6936, (long)(5080866308233241807L ^ var11))] = _5H.c("\u00d6", (long)-1831617259022319309L, (long)var11);
        _5H.cfr_renamed_8 = _5H.c("\u00ee", (Object)v8, (long)-1830705191032634701L, (long)var11);
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (k[n3] != null) {
            return n3;
        }
        Object object = j[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 13;
            case 1 -> 5;
            case 2 -> 41;
            case 3 -> 50;
            case 4 -> 43;
            case 5 -> 20;
            case 6 -> 60;
            case 7 -> 11;
            case 8 -> 0;
            case 9 -> 54;
            case 10 -> 6;
            case 11 -> 36;
            case 12 -> 62;
            case 13 -> 40;
            case 14 -> 1;
            case 15 -> 4;
            case 16 -> 22;
            case 17 -> 25;
            case 18 -> 35;
            case 19 -> 30;
            case 20 -> 32;
            case 21 -> 52;
            case 22 -> 51;
            case 23 -> 8;
            case 24 -> 34;
            case 25 -> 45;
            case 26 -> 56;
            case 27 -> 26;
            case 28 -> 15;
            case 29 -> 46;
            case 30 -> 23;
            case 31 -> 48;
            case 32 -> 17;
            case 33 -> 9;
            case 34 -> 2;
            case 35 -> 47;
            case 36 -> 12;
            case 37 -> 7;
            case 38 -> 61;
            case 39 -> 37;
            case 40 -> 33;
            case 41 -> 57;
            case 42 -> 58;
            case 43 -> 14;
            case 44 -> 19;
            case 45 -> 10;
            case 46 -> 63;
            case 47 -> 24;
            case 48 -> 21;
            case 49 -> 39;
            case 50 -> 44;
            case 51 -> 49;
            case 52 -> 29;
            case 53 -> 55;
            case 54 -> 16;
            case 55 -> 38;
            case 56 -> 31;
            case 57 -> 53;
            case 58 -> 27;
            case 59 -> 59;
            case 60 -> 42;
            case 61 -> 18;
            case 62 -> 3;
            default -> 28;
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
        _5H.k[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00db' || c == 'e' || c == '\u00d6' || c == 'q') {
                field = _5H.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00db' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'e' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5H.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'T' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ee' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _5H.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = "':|U]\n:/~\u0014XVz'";
        objectArray[1] = "c,qVnd}$k\u0019\tel?fC/c";
        objectArray[2] = "\u0011Ff\u000eix\u001aIwA\bv\u0011Bs\u001b";
        objectArray[3] = "J\u000b\u0010(w}J\u000b\u0007t{rP@\u0007j{gW1R5\"";
        objectArray[4] = "9^\"0TT9^5lX[#\u00155rXN$dd-\n\u0005";
        objectArray[5] = "\bA\u0013\u0000V\u0002\bA\u0004\\Z\r\u0012\n\u0004BZ\u0018\u0015{U\u001b\u0003]";
        objectArray[6] = "\u0018\u001a\"\"\u001e)\u0005\u000f c\u001buI7";
        objectArray[7] = "\u0015J:\u0013@c\b_8RE?H]";
        objectArray[8] = "r\r\u001a\u0010ldo\u0018\u0018Qi8\".";
        objectArray[9] = "R%(\u0006\u0013x'\u0005#\t\u00027F\u000b(\u0002\u0006m2";
        objectArray[10] = "X)\u0016HqlF!\f\u0007\u0013pA<";
        objectArray[11] = "?W\u000fGP|\"B\r\u0006U oY";
        objectArray[12] = "`i8\\bG`i/\u0000nHz\"/\u001en]}S~F<";
        objectArray[13] = "tC%6TBjK?y)Rj";
        objectArray[14] = "\u001c\u001bvr0\u001bi;}}!T\b5vv%\u000e|";
        objectArray[15] = Void.TYPE;
        _5H.k[15] = "java/lang/Void";
        objectArray[16] = Long.TYPE;
        _5H.k[16] = "java/lang/Long";
        objectArray[17] = Boolean.TYPE;
        _5H.k[17] = "java/lang/Boolean";
        objectArray[18] = Double.TYPE;
        _5H.k[18] = "java/lang/Double";
        objectArray[19] = ":{`bI\u0010'nb#LLg,";
        objectArray[20] = Integer.TYPE;
        _5H.k[20] = "java/lang/Integer";
        objectArray[21] = "\u0007\r\u0003>\u0017er-\b1\u0006*\u0013#\u0003:\u0002pg";
        objectArray[22] = "CcXo JCcO3,EY(O-,P^Y\u001fp}";
        objectArray[23] = "J!0#SFJ!'\u007f_IPj'a_\\W\u001bv>\u0007";
        objectArray[24] = "\u0002J/\u0012\u0013\u0017\u001f_-S\u0016KPW";
        objectArray[25] = "\u001epw]\f\u0018kP|R\u001dW\n^wY\u0019\r~";
        objectArray[26] = "w~E/x^jkGn}\u0002+Y";
        objectArray[27] = "\u0011-\u0011\u0012Gl\u0011-\u0006NKc\u000bf\u0006PKv\f\u0017W\u0004\u001b=";
        objectArray[28] = "%\tDR><P)O]/s1'DV+)E";
        objectArray[29] = "/]]AqnZ}VN`!;s]Ed{O";
        objectArray[30] = "d{\u001ayE\td{\r%I\u0006~0\r;I\u0013yA\\e\u001cV";
        objectArray[31] = "uf\u0017\"<)uf\u0000~0&o-\u0000`03h\\Q>ex";
        objectArray[32] = "\u0015\u0012s\tsk`2x\u0006b$\u0001<s\rf~u";
        objectArray[33] = "S&\u001a!VrM.\u0000n5fI";
        objectArray[34] = "=\u0000?\u0011%HH 4\u001e4\u0007).?\u00150]]";
        objectArray[35] = "%0\u001cj\bD8%\u001e+\r\u0018x!";
        objectArray[36] = ">\u001c\"<f\u001b#\t }cGn\u000b";
        objectArray[37] = "\u0006agL6\u001fsAlC'P\u0012OgH#\nf";
        objectArray[38] = "c0Ll-*c0[0!%y{[.!0~\n\ntxs";
        objectArray[39] = "%=a\u0004x\u0004P\u001dj\u000biK1\u0013a\u0000m\u0011E";
        objectArray[40] = "*r\u00066P'5tA\"*)K \u0007 \u0014f0/B!X";
        objectArray[41] = "\u000flS\u0012\f{\u000e{\u0014^ml\no\u000e@:;S<S\u0011mf\u0010s\u000eT\f<\u0005|\u0013";
        objectArray[42] = "\u001d\u0000Vi%'V\u0002S`BxI\u001c\u0013Y{pD\u001e\u00015# \u001d\u0014o";
        objectArray[43] = "b\r'GL\u0015c\u001a`\u000b-\u0002g\u000ez\u0015zU>Z.@-\b}\u0012z\u0001LRh\u001dg";
        objectArray[44] = "a\u000b\bz9|`\u001cO6Xkd\bU(\u000f<=_\u000eyXa~\u0014U<9;k\u001bH";
        objectArray[45] = "\u0004HQ[%\u007f^VF\u0002\u001a>\\'Y\u000b#1H\u001fM\t%c8N[W!n\u0001MD@x\u000e";
        objectArray[46] = "pjx\u0014\u001bZ*toM$\u0011L8g\u0002TP)kj\fN";
        objectArray[47] = "c\"n=>(,`s-@}^%)d\u007f3f1+b-Ca;i6{\u007fd>k-@";
        objectArray[48] = "\u0004N(>|M\u0005Yor\u001dZ\u0001MulJ\rX\u001d*:\u001dP\u001bQux|\n\u000e^h";
        objectArray[49] = "pt\"~%`1x'rN`=v'i2f;\u001bdlw1&\"/nr8A";
        objectArray[50] = "v4,(\fSw#kdmDs7qz:\u0013*`+.mNi+qn\f\u0014|$l";
        objectArray[51] = "\bj%\u0014!5\\&t@\u001cxw\u0017d\u0017%wG/p\u0015#%7~fK'(\u000e}y\\~H";
        objectArray[52] = "6\u001a\u000fB\u000fD7\rH\u000enS3\u0019R\u00109\u0004jH\u0006AnY)\u0005R\u0004\u000f\u0003<\nO";
        objectArray[53] = "v\u0012A4\u001f\u001f T\u00164!F \u0012H7MttW\u0010i\u0019#4\tW?AD6W\u0015/!";
        objectArray[54] = "(b9!}\u000e:~y8\u001b^G\u007f9h$\u0017\u007fk;nvg.}ej{^-br3\u001b";
        objectArray[55] = "|{\u001bl\u001d\u001c/v\u0015vfCA|\u001eq\u0017\u0015#n[q\u0006y+i\u001esW\u0000.m\u000buf";
        objectArray[56] = "\u0004u]y>\u0004\u0005b\u001a5_\u0013\u0001v\u0000+\bDX!Zw_\u0019\u001bj\u0000?>C\u000ee\u001d";
        objectArray[57] = "\u0019G\u00195g+CY\u000elXb%D\t,7kXG\u0016= ";
        objectArray[58] = "\u0016t;\u0019\u00177\u0017c|Uv \u0013wfK!wJ&:\u0018v*\tkf_\u0017p\u001cd{";
        objectArray[59] = "cKt\u0007|Ob\\3K\u001dXfH)UJ\u000f?\u001bu\u0004\u001dR|T)A|\bi[4";
        objectArray[60] = "%6\u0001FbK:0FR\u0018F\u0001\tQ\u0015aD4r^P`\b";
        objectArray[61] = "S\u001b7D=\u0017\t\u0005 \u001d\u0002[oK!Ti]SN$Vr";
        objectArray[62] = "U`l\n(=Tw+FI*Pc1X\u001e}\t5l\u000eI J\u007f1L(z_p,";
        objectArray[63] = "un\b\u0001dbb1\u001cY\t|n,u_gda>\u0019\u00077=kPL\biv}<\u0014X0|\u0013i\u001b\u0006{j\u007f1K_q\u0004";
        objectArray[64] = "w\u000f\u000f\u000e=6|\u000f\u000bYY!x\u001b\u000e\u0004\u000ev'FUhctx\u0006P\u00114>t\u0016";
        objectArray[65] = "C\u001e2t1WB\tu8P@F\u001do&\u0007\u0017\u001fK;rPJ\\\u0001o21\u0010I\u000er";
        objectArray[66] = ";u~B\u0005N:b9\u000edY>v#\u00103\u000eg }DdS$j#\u0004\u0005\t1e>";
        objectArray[67] = "\u00074\u0005\u0018z\b]*\u0012AED;!NHz\t\u00035LN(yZdJ\u001e?HEb\r\nE";
        objectArray[68] = "|;],\f\u0004d9C;u\u000bp=\\'\u00199${\u0004zLn,.C>\u001e\u000fm\"F2u";
        objectArray[69] = "\u0003=l\nAb\u0002*+F u\u0006>1Xw\"Yho\u0004 \u007f\u001c\"1LA%\t-,";
        objectArray[70] = "oBh\bg`nU/D\u0006wjA5ZQ 3\u0015`\u0007\u0006}p]5Ng'eR(";
        objectArray[71] = "\u001dn\u0010+'\u001f\u001cyWgF\b\u0018mMy\u0011_A;\u0016,F\u0002\u0002qMm'X\u0017~P";
        objectArray[72] = "al(\u0001|\u0004`{oM\u001d\u0013douSJD=<)\u0007\u001d\u0019~suG|Ck|h";
        objectArray[73] = "a.9n?sn,n\u0014\u001awa*%\u0014-\u007fj= q\"}=";
        objectArray[74] = "@gp\u0011\\.Ap7]=9Ed-Cjn\u001c1w\u0014=3_x-W\\iJw0";
        objectArray[75] = "h\u000bhC\u0002@i\u001c/\u000fcWm\b5\u00114\u00004_iFc]w\u00145\u0005\u0002\u0007b\u001b(";
        objectArray[76] = "D+&?oNE<as\u000eYA({mY\u000e\u0018}\"8\u000eS[4{yo\tN;f";
        objectArray[77] = "{Jr'z\u0015,\u0000~7@\t,\rs0,;qJ)n@W,\u0016~98\u0010y\u0015zW{\u0010(\u0015-k-V\u007f\u0015\u0013";
        objectArray[78] = "C\u001e'p&N\u0017Rv$\u001b\t|Sx. \u000b\u0018^y%r";
        objectArray[79] = "n\u0011/C\u001fSs\u0014uAd4[6Rl>nn\u0011/C\u001fSs\u0014uA";
        objectArray[80] = "\u000fo\u000btVh\u000exL87\u007f\nlV&`(U:\tv7u\u0010pV2V/\u0005\u007fK";
        objectArray[81] = "Z\u0004\u0012\u0001#3_\u0001\u0010\u001a\u0018h\u000b`\u0011S!0\u0015X\u0005Q'be_\u000f\u0013s4YZ\n\u0011h\u000f";
        objectArray[82] = "d\u000f\u007f\u0019}\u0007i\u000etKE\r5\u0006\u007fN\u0012ZoV!\".\u0019%\u000bc\u0012.\u00031\u0012";
        objectArray[83] = "F3B1B&G$\u0005}#1C0\u001fctf\u001aaG4#;Y,\u001fwBaL#\u0002";
        objectArray[84] = "N2KIY\u000fO%\f\u00058\u0018K1\u0016\u001boO\u0012fHG8\u0012Q-\u0016\u000fYHD\"\u000b";
        objectArray[85] = "\u0006^z:\u001bVA\u000by>uKPO}0\u0019y\u0004\u000b'iN.P\u000fdi\u0005U_Je%u";
        objectArray[86] = "\u0002I\u001ecJ\u0016\u000fH\u00151r\u001cS@\u001e4%K\t\u0010BX\u0019\bCM\u0002h\u0019\u0012WT";
        objectArray[87] = "sJ](\u0000/r]\u001ada8vI\u0000z6o)\u001f_-a2lU\u0000n\u0000hyZ\u001d";
        objectArray[88] = "\r; J\u001d@W%7\u0013\"\u00011.k\u001a\u001dA\t:i\u001cO1Wj/DOW@5;\u001c\"";
        objectArray[89] = "\u0010:b|\u0013\u0012\u0012d ls\u0010\u0004!}t\u001f\"Sc'+Ou\r&lw\u000b\u0014W3cjs";
        objectArray[90] = "0\u001f]M\u0004z5\u001a_V?'s\u0016^OC!u{\u001dJ\u0006vhBVH\u0003\u007f\u000f";
        objectArray[91] = "J:Ml\u000b@\u001ev\u001c86\u0005:G\fo\u000f\u0002\u0005\u007f\u0018m\tPu.\u000e3\r]L-\u0011$T=";
        objectArray[92] = "\u000eH&*eb\u000f_af\u0004u\u000bK{xS\"R\u001e$(\u0004\u007f\u0011W{le%\u0004Xf";
        objectArray[93] = "L\u001dfLmx\u0016\u0003q\u0015R2p\u0015nB(hN\u0011hO6";
        objectArray[94] = "GNN\"<VFY\tn]ABM\u0013p\n\u0016\u001b\u001bH']KXQ\u0013d<\u0011M^\u000e";
        objectArray[95] = "|!<3Itx'1-(z\u001b!bp\u0017:#5`vEJzdf&R{eb!2(";
        objectArray[96] = "\u000f\u0011eo\r2\u000e\u0006\"#l%\n\u00128=;rSBbil/\u0010\u000e8)\ru\u0005\u0001%";
        objectArray[97] = "]\u0011\u0000\u0010\u001d\u0019\u0016\u0013\u0005\u0019z@\r\u0006\u007fM\n\\d\u0017FZ\u0015\u0011\u001d\u0012BO\u0013 ";
        objectArray[98] = "Q7\u001f0\u007fwP X|\u001e`T4BbI7\rb\u001d5\u001ejN(Bv\u007f0['_";
        objectArray[99] = "Zw\u001b\\\u0011J[`\\\u0010p]_tF\u000e'\n\u0006#\u001aZpWEhF\u001a\u0011\rPg[";
        objectArray[100] = "\u000e[\u0000V\u001dO\u000fLG\u001a|X\u000bX]\u0004+\u000fR\u000b\u0001S|R\u0011D]\u0010\u001d\b\u0004K@";
        objectArray[101] = "\u0007b2fBW\nc94z]Vk21-\n\f;o]\u0011IFf.m\u0011SR\u007f";
        objectArray[102] = "O\u00071H\u0018\nD\u00075\u001f|\u001d@\u00130B+J\u001e@i.\u0013MDO(H\u0016\u001e\\\u0013";
        objectArray[103] = "<\ra2\nH.\u0011!+l\u0018S\u0004!'\nE*\u000f!#]";
        objectArray[104] = "S\u0018l`?\u0016R\u000f+,^\u0001V\u001b12\tV\u000fNhc^\u000bL\u00071&?QY\b,";
        objectArray[105] = "~\u0006r\u0017\u0016,\u007f\u00115[w;{\u0005/E l\"Qw\u0011w1a\u0019/Q\u0016kt\u00162";
        objectArray[106] = "\t\f4\u000b\u0016\rNY7\u000fx\u0010_\u001d3\u0001\u0014\"\u000bYiX@u_]*X\b\u000eP\u0018+\u0014x";
        objectArray[107] = "iF0fp!jY!qAa\u0005^y0~,=J{6,\\h\u0018971'g]8{A";
        objectArray[108] = "\u0004%y\u0004\u0019sCpz\u0000wnR4~\u000e\u001b\\\u0006p$WK\u000bRtgW\u0007p]1f\u001bw";
        objectArray[109] = "98\u0013Zor&>TN\u0015sXj\u0012L+3#eWMg";
        Object[] objectArray2 = objectArray;
        objectArray[110] = "\u0017JHd\u0015_\u0016]\u000f(tH\u0012I\u00156#\u001fK\u001cOjtB\bU\u0015\"\u0015\u0018\u001dZ\b";
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5H" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l2, long l3) {
        int n = _5H.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = k[n];
                int n3 = string2.indexOf(8);
                clazz3 = _5H.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5H.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5H.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5H.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5H.f(145285913126941L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5H.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5H.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5H.f(145285913126941L, 0L);
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
            int n = _5H.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _5H.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5H.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5H.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5H.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5H.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x5973;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])f.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/5H", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5H.e[n2] = n3;
        }
        return e[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5H" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5H.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field g(long l2, long l3) {
        int n = _5H.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _5H.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5H.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5H.c(clazz3, string2, clazz2)) != null) {
                    _5H.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5H.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5H.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5H.f(145285913126941L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Unable to fully structure code
     */
    private _8B dev_krypton_8B_5(Object[] var1_1) {
        block33: {
            block34: {
                block35: {
                    block31: {
                        block32: {
                            block29: {
                                block30: {
                                    block23: {
                                        block24: {
                                            block27: {
                                                block28: {
                                                    block25: {
                                                        block26: {
                                                            var2_2 = (class_2586)var1_1[0];
                                                            var4_3 = (Long)var1_1[1];
                                                            var3_4 = (Integer)var1_1[2];
                                                            v0 = var4_3 = _5H.b ^ var4_3;
                                                            var6_5 = v0 ^ 67579651823150L;
                                                            var8_6 = v0 ^ 27709847668408L;
                                                            var10_7 = _3C.cfr_renamed_4();
                                                            var11_8 = _5H.c("T", (Object)_5H.c("T", (Object)var2_2, (long)6088102776322717625L, (long)var4_3), (long)6081660768585652975L, (long)var4_3);
                                                            try {
                                                                v1 = var2_2 instanceof class_2627;
                                                                if (var10_7 != 0) break block23;
                                                                if (!v1) break block24;
                                                            }
                                                            catch (MatchException v2) {
                                                                throw _5H.a(v2);
                                                            }
                                                            v3 = new Object[2];
                                                            v3[1] = var8_6;
                                                            v3[0] = var11_8;
                                                            var12_9 = _5H.c("T", (Object)_5H.c("\u00db", (Object)this, (long)6081916655739431636L, (long)var4_3), (Object)v3, (long)6082076528131767943L, (long)var4_3);
                                                            try {
                                                                v4 = var12_9;
                                                                v5 = var10_7;
                                                                if (var4_3 > 0L) {
                                                                    if (v5 != 0) break block25;
                                                                    if (v4 != null) break block26;
                                                                }
                                                                ** GOTO lbl44
                                                            }
                                                            catch (MatchException v6) {
                                                                throw _5H.a(v6);
                                                            }
                                                            v7 = new Object[2];
                                                            v7[1] = var8_6;
                                                            v7[0] = _5H.c("\u00d6", (long)6082393993319819443L, (long)var4_3);
                                                            var12_9 = _5H.c("T", (Object)_5H.c("\u00db", (Object)this, (long)6081916655739431636L, (long)var4_3), (Object)v7, (long)6082076528131767943L, (long)var4_3);
                                                        }
                                                        v4 = var12_9;
                                                    }
                                                    try {
                                                        try {
                                                            v5 = var10_7;
lbl44:
                                                            // 2 sources

                                                            if (v5 != 0) break block27;
                                                            if (v4 != null) {
                                                            }
                                                            break block28;
                                                        }
                                                        catch (MatchException v8) {
                                                            throw _5H.a(v8);
                                                        }
                                                        v4 = new _8B((int)_5H.c("\u00db", (Object)var12_9, (long)6088600111454603499L, (long)var4_3), (int)_5H.c("\u00db", (Object)var12_9, (long)6087232266103894326L, (long)var4_3), var6_5, (int)_5H.c("\u00db", (Object)var12_9, (long)6083027648620056340L, (long)var4_3), var3_4);
                                                        break block27;
                                                    }
                                                    catch (MatchException v9) {
                                                        throw _5H.a(v9);
                                                    }
                                                }
                                                v4 = null;
                                            }
                                            return v4;
                                        }
                                        v1 = var2_2 instanceof class_2669;
                                    }
                                    if (!v1) break block35;
                                    v10 = new Object[2];
                                    v10[1] = var8_6;
                                    v10[0] = var11_8;
                                    var12_10 = _5H.c("T", (Object)_5H.c("\u00db", (Object)this, (long)6081916655739431636L, (long)var4_3), (Object)v10, (long)6082076528131767943L, (long)var4_3);
                                    try {
                                        v11 = var12_10;
                                        v12 = var10_7;
                                        if (var4_3 >= 0L) {
                                            if (v12 != 0) break block29;
                                            if (v11 != null) break block30;
                                        }
                                        ** GOTO lbl88
                                    }
                                    catch (MatchException v13) {
                                        throw _5H.a(v13);
                                    }
                                    v14 = new Object[2];
                                    v14[1] = var8_6;
                                    v14[0] = _5H.c("\u00d6", (long)6082157587687149591L, (long)var4_3);
                                    var12_10 = _5H.c("T", (Object)_5H.c("\u00db", (Object)this, (long)6081916655739431636L, (long)var4_3), (Object)v14, (long)6082076528131767943L, (long)var4_3);
                                }
                                v11 = var12_10;
                            }
                            try {
                                try {
                                    v12 = var10_7;
lbl88:
                                    // 2 sources

                                    if (v12 != 0) break block31;
                                    if (v11 != null) {
                                    }
                                    break block32;
                                }
                                catch (MatchException v15) {
                                    throw _5H.a(v15);
                                }
                                v11 = new _8B((int)_5H.c("\u00db", (Object)var12_10, (long)6088600111454603499L, (long)var4_3), (int)_5H.c("\u00db", (Object)var12_10, (long)6087232266103894326L, (long)var4_3), var6_5, (int)_5H.c("\u00db", (Object)var12_10, (long)6083027648620056340L, (long)var4_3), var3_4);
                                break block31;
                            }
                            catch (MatchException v16) {
                                throw _5H.a(v16);
                            }
                        }
                        v11 = null;
                    }
                    return v11;
                }
                v17 = new Object[2];
                v17[1] = var8_6;
                v17[0] = var11_8;
                var12_11 = _5H.c("T", (Object)_5H.c("\u00db", (Object)this, (long)6081916655739431636L, (long)var4_3), (Object)v17, (long)6082076528131767943L, (long)var4_3);
                try {
                    try {
                        v18 = var12_11;
                        if (var10_7 != 0) break block33;
                        if (v18 != null) {
                        }
                        break block34;
                    }
                    catch (MatchException v19) {
                        throw _5H.a(v19);
                    }
                    v18 = new _8B((int)_5H.c("\u00db", (Object)var12_11, (long)6088600111454603499L, (long)var4_3), (int)_5H.c("\u00db", (Object)var12_11, (long)6087232266103894326L, (long)var4_3), var6_5, (int)_5H.c("\u00db", (Object)var12_11, (long)6083027648620056340L, (long)var4_3), var3_4);
                    break block33;
                }
                catch (MatchException v20) {
                    throw _5H.a(v20);
                }
            }
            v18 = null;
        }
        return v18;
    }

    private static Map java_util_Map_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = b ^ l2) ^ 0x1A77E759D40BL;
        HashMap hashMap = new HashMap();
        _5H.c("T", hashMap, (Object)_5H.c("\u00d6", 2005021197567285092L, (long)l2), (Object)new _8B((int)_5H.a("z", 32468, (long)(0x28F05DB1260DBC48L ^ l2)), l3, (int)_5H.a("z", 31607, (long)(0x1DFC0E991A3939C2L ^ l2)), 0), 2002899943677269356L, (long)l2);
        _5H.c("T", hashMap, (Object)_5H.c("\u00d6", 2005257301947624426L, (long)l2), (Object)new _8B((int)_5H.a("z", 19623, (long)(0x1B30C9FF2CEE8E0EL ^ l2)), l3, (int)_5H.a("z", 29203, (long)(0x4D8DE79F9098B0A7L ^ l2)), 0), 2002899943677269356L, (long)l2);
        _5H.c("T", hashMap, (Object)_5H.c("\u00d6", 2004257880530153543L, (long)l2), (Object)new _8B((int)_5H.a("z", 15733, (long)(0x77A940515E87FDEL ^ l2)), l3, 0, (int)_5H.a("z", 32726, (long)(0x1EDA54108CE3D77L ^ l2))), 2002899943677269356L, (long)l2);
        _5H.c("T", hashMap, (Object)_5H.c("\u00d6", 2002120729422096369L, (long)l2), (Object)new _8B((int)_5H.a("z", 10981, (long)(0x46F12B9DB321E841L ^ l2)), l3, (int)_5H.a("z", 10472, (long)(0x4A2698EF94DA6A4BL ^ l2)), (int)_5H.a("z", 9024, (long)(0x7D692BC595F61DBL ^ l2))), 2002899943677269356L, (long)l2);
        _5H.c("T", hashMap, (Object)_5H.c("\u00d6", 2007831791724095239L, (long)l2), (Object)new _8B((int)_5H.a("z", 13707, (long)(0x533CA1A73D19773BL ^ l2)), l3, 0, (int)_5H.a("z", 14978, (long)(0x4C7174225E607834L ^ l2))), 2002899943677269356L, (long)l2);
        _5H.c("T", hashMap, (Object)_5H.c("\u00d6", 2003730285862665147L, (long)l2), (Object)new _8B((int)_5H.a("z", 15585, (long)(0x27600A9BA5357E4CL ^ l2)), l3, (int)_5H.a("z", 8207, (long)(0x2F6192455DEE2B3L ^ l2)), (int)_5H.a("z", 8207, (long)(0x2F6192455DEE2B3L ^ l2))), 2002899943677269356L, (long)l2);
        _5H.c("T", hashMap, (Object)_5H.c("\u00d6", 2005566060971995269L, (long)l2), (Object)new _8B((int)_5H.a("z", 24278, (long)(0xC5232ED851B1C74L ^ l2)), l3, (int)_5H.a("z", 14522, (long)(0x309322D6470BFA14L ^ l2)), (int)_5H.a("z", 31112, (long)(0x9EF265A7AC4BB3BL ^ l2))), 2002899943677269356L, (long)l2);
        _5H.c("T", hashMap, (Object)_5H.c("\u00d6", 2002214241731581859L, (long)l2), (Object)new _8B((int)_5H.a("z", 17611, (long)(0x4B8EEA7B48628651L ^ l2)), l3, (int)_5H.a("z", 26279, (long)(0x192BAB1D8D3A243AL ^ l2)), (int)_5H.a("z", 24278, (long)(0xC5232ED851B1C74L ^ l2))), 2002899943677269356L, (long)l2);
        _5H.c("T", hashMap, (Object)_5H.c("\u00d6", 2007597619525017507L, (long)l2), (Object)new _8B((int)_5H.a("z", 25824, (long)(0x1629BCAADABE2677L ^ l2)), l3, (int)_5H.a("z", 27270, (long)(0x1CEA9646BAB6A821L ^ l2)), 0), 2002899943677269356L, (long)l2);
        return hashMap;
    }

    @_3i_0
    public void cfr_renamed_0(_6c_0 c_0) {
        long l2 = b ^ 0x612083986404L;
        long l3 = l2 ^ 0x21AD71E0D596L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l3;
        objectArray[0] = c_0;
        _5H.c("T", (Object)this, (Object)objectArray, -6753672062221930685L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5H.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5H.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

