/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  net.minecraft.class_12137
 */
package dev.krypton;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import dev.krypton._4t_0;
import dev.krypton._4w;
import dev.krypton._6N;
import dev.krypton._87;
import dev.krypton._8B;
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
import net.minecraft.class_12137;

public class _3N {
    public static _3N cfr_renamed_0;
    public static _3N cfr_renamed_4;
    public final _6N cfr_renamed_2;
    public final _6N cfr_renamed_6;
    private final boolean cfr_renamed_3;
    private boolean cfr_renamed_9;
    private static _4w[] cfr_renamed_8;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static final Object[] h;
    private static final String[] i;

    public void void_1(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = a ^ l2) ^ 0x12B38E0AA096L;
        _3N.c("\u00ed", (Object)this, (boolean)_3N.b("f", 21, (long)(0x10B897560FDD0ECAL ^ l2)), 6998030904798056054L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _3N.c("\u00e5", (Object)this, (Object)objectArray2, 6990639160975297815L, (long)l2);
    }

    private static double double_1(Object[] objectArray) {
        Object object;
        block4: {
            double d;
            double d2;
            long l2;
            block5: {
                l2 = (Long)objectArray[0];
                d2 = (Double)objectArray[1];
                d = (Double)objectArray[2];
                l2 = a ^ l2;
                int n = _87.cfr_renamed_5();
                try {
                    try {
                        object = d2;
                        if (n != 0) break block4;
                        if (_3N.c("\u00f5", (double)object, 1415754878051807173L, (long)l2) == false) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw _3N.a(illegalStateException);
                    }
                    return 0.0;
                }
                catch (IllegalStateException illegalStateException) {
                    throw _3N.a(illegalStateException);
                }
            }
            object = _3N.c("\u00f5", (double)d2, 0.0, (double)d, 1421031685588242590L, (long)l2);
        }
        return object;
    }

    public void cfr_renamed_185(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = a ^ l2) ^ 0x50BF6298F5AL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _3N.c("\u00e5", (Object)_3N.c("v", (Object)this, -2819308244933872017L, (long)l2), (Object)objectArray2, -2825274279813165560L, (long)l2);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        _3N.c("\u00e5", (Object)_3N.c("v", (Object)this, -2826448346111427384L, (long)l2), (Object)objectArray3, -2825274279813165560L, (long)l2);
    }

    public static void cfr_renamed_186(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        double d3 = (Double)objectArray[2];
        double d4 = (Double)objectArray[3];
        long l2 = (Long)objectArray[4];
        _8B b = (_8B)objectArray[5];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x471AF68572EDL;
        long l5 = l3 ^ 0xD0DDD2C45D5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l5;
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = (int)_3N.c("\u00e5", (Object)b, (Object)objectArray2, 2153127916633744309L, (long)l2);
        objectArray3[4] = l4;
        objectArray3[3] = d4;
        objectArray3[2] = d3;
        objectArray3[1] = d2;
        objectArray3[0] = d;
        _3N.c("\u00f5", (Object)objectArray3, 2158646045311188812L, (long)l2);
    }

    public void cfr_renamed_187(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        double d3 = (Double)objectArray[2];
        double d4 = (Double)objectArray[3];
        double d5 = (Double)objectArray[4];
        _4t_0 t_0 = (_4t_0)objectArray[5];
        long l2 = (Long)objectArray[6];
        _8B b = (_8B)objectArray[7];
        long l3 = (l2 = a ^ l2) ^ 0x69AA8AB6B9F5L;
        Object[] objectArray2 = new Object[11];
        objectArray2[10] = b;
        objectArray2[9] = (double)_3N.c("v", (Object)t_0, 4667625181084102466L, (long)l2);
        objectArray2[8] = l3;
        objectArray2[7] = (double)_3N.c("v", (Object)t_0, 4667190998131489327L, (long)l2);
        objectArray2[6] = (double)_3N.c("v", (Object)t_0, 4668119066787576214L, (long)l2);
        objectArray2[5] = (double)_3N.c("v", (Object)t_0, 4674358386694596824L, (long)l2);
        objectArray2[4] = d5;
        objectArray2[3] = d4;
        objectArray2[2] = d3;
        objectArray2[1] = d2;
        objectArray2[0] = d;
        _3N.c("\u00e5", (Object)this, (Object)objectArray2, 4668477648734273437L, (long)l2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void cfr_renamed_49(Object[] var0) {
        block53: {
            block46: {
                block43: {
                    block44: {
                        block41: {
                            block42: {
                                block39: {
                                    block40: {
                                        var8_1 = (Long)var0[0];
                                        var1_2 = (Integer)var0[1];
                                        var2_3 = (Double)var0[2];
                                        var4_4 = (Double)var0[3];
                                        var6_5 = (Double)var0[4];
                                        v0 = var8_1 = _3N.a ^ var8_1;
                                        var10_6 = v0 ^ 117952642112719L;
                                        var12_7 = v0 ^ 117048923476300L;
                                        var14_8 = v0 ^ 78240864317728L;
                                        var16_9 = v0 ^ 89753665549049L;
                                        var18_10 = v0 ^ 100593032211601L;
                                        var20_11 = _87.cfr_renamed_5();
                                        var21_12 = var1_2 >> _3N.b("f", (int)14839, (long)(8563189625531082056L ^ var8_1)) & _3N.b("f", (int)12125, (long)(6536597919731200992L ^ var8_1));
                                        try {
                                            v1 = var21_12;
                                            if (var20_11 != 0) break block39;
                                            if (v1 != 0) break block40;
                                        }
                                        catch (IllegalStateException v2) {
                                            throw _3N.a(v2);
                                        }
                                        return;
                                    }
                                    cfr_temp_0 = var6_5 - 0.0;
                                    v1 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                                }
                                try {
                                    if (var20_11 != 0) break block41;
                                    if (v1 > 0) break block42;
                                }
                                catch (IllegalStateException v3) {
                                    throw _3N.a(v3);
                                }
                                return;
                            }
                            v1 = var1_2 >> _3N.b("f", (int)23897, (long)(8604987496761278956L ^ var8_1)) & _3N.b("f", (int)12125, (long)(6536597919731200992L ^ var8_1));
                        }
                        var22_13 = v1;
                        var23_14 = var1_2 >> _3N.b("f", (int)18114, (long)(350494341275441781L ^ var8_1)) & _3N.b("f", (int)12125, (long)(6536597919731200992L ^ var8_1));
                        var24_15 = var1_2 & _3N.b("f", (int)12125, (long)(6536597919731200992L ^ var8_1));
                        var25_16 = new _8B(var22_13, var23_14, var14_8, var24_15, var21_12);
                        var26_17 = new _8B(var22_13, var23_14, var14_8, var24_15, var21_12);
                        var27_18 = (int)_3N.c("\u00f5", (double)(var4_4 - var6_5), (long)-904705159240543876L, (long)var8_1);
                        var28_19 = (int)_3N.c("\u00f5", (double)(var4_4 + var6_5), (long)-905876062036428603L, (long)var8_1);
                        var29_20 = var6_5 * var6_5;
                        v4 = new Object[1];
                        v4[0] = var18_10;
                        var31_21 = _3N.c("\u00e5", (Object)_3N.c("c", (long)-906522726585769854L, (long)var8_1), (Object)v4, (long)-909027055611703152L, (long)var8_1);
                        try {
                            try {
                                v5 = var31_21;
                                if (var20_11 != 0) break block43;
                                if (v5 != false) break block44;
                            }
                            catch (IllegalStateException v6) {
                                throw _3N.a(v6);
                            }
                            v7 = new Object[1];
                            v7[0] = var16_9;
                            _3N.c("\u00e5", (Object)_3N.c("c", (long)-906522726585769854L, (long)var8_1), (Object)v7, (long)-906069781574148232L, (long)var8_1);
                        }
                        catch (IllegalStateException v8) {
                            throw _3N.a(v8);
                        }
                    }
                    v5 = var32_22 = (reference)var27_18;
                }
                while (var32_22 < var28_19) {
                    block50: {
                        block51: {
                            block52: {
                                block48: {
                                    block49: {
                                        block45: {
                                            block47: {
                                                var33_23 = (double)var32_22 + 0.5 - var4_4;
                                                var35_24 = var29_20 - var33_23 * var33_23;
                                                try {
                                                    try {
                                                        v9 = var35_24;
                                                        if (var20_11 != 0) break block45;
                                                        cfr_temp_1 = v9 - 0.0;
                                                        v10 /* !! */  = (reference)(cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1));
                                                        if (var8_1 <= 0L || var20_11 != 0) break block46;
                                                    }
                                                    catch (IllegalStateException v11) {
                                                        throw _3N.a(v11);
                                                    }
                                                    if (v10 /* !! */  > 0) break block47;
                                                }
                                                catch (IllegalStateException v12) {
                                                    throw _3N.a(v12);
                                                }
                                                if (var8_1 > 0L) break block52;
                                            }
                                            v9 = (double)_3N.c("\u00f5", (double)var35_24, (long)-908036327416058074L, (long)var8_1);
                                        }
                                        var37_25 = v9;
                                        var39_26 = var2_3 - var37_25;
                                        var41_27 = var2_3 + var37_25;
                                        var43_28 = (int)_3N.c("\u00f5", (double)var39_26, (long)-904705159240543876L, (long)var8_1);
                                        var44_29 = (int)_3N.c("\u00f5", (double)var41_27, (long)-905876062036428603L, (long)var8_1);
                                        var45_30 = (double)var43_28 - var39_26;
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        cfr_temp_2 = var45_30 - 0.01;
                                                        v13 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                                                        if (var20_11 != 0) break block48;
                                                        if (v13 <= 0) break block49;
                                                    }
                                                    catch (IllegalStateException v14) {
                                                        throw _3N.a(v14);
                                                    }
                                                    cfr_temp_3 = var45_30 - 0.99;
                                                    v13 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                                                    v15 = var20_11;
                                                    if (var8_1 > 0L) {
                                                        if (v15 != 0) break block48;
                                                    }
                                                    ** GOTO lbl141
                                                }
                                                catch (IllegalStateException v16) {
                                                    throw _3N.a(v16);
                                                }
                                                if (v13 >= 0) break block49;
                                            }
                                            catch (IllegalStateException v17) {
                                                throw _3N.a(v17);
                                            }
                                            _3N.c("\u00ed", (Object)var26_17, (int)((int)((double)var21_12 * var45_30)), (long)-908452784621817874L, (long)var8_1);
                                            v18 = new Object[6];
                                            v18[5] = var26_17;
                                            v18[4] = var10_6;
                                            v18[3] = 1.0;
                                            v18[2] = 1.0;
                                            v18[1] = (double)var32_22;
                                            v18[0] = (double)(var43_28 - 1);
                                            _3N.c("\u00e5", (Object)_3N.c("c", (long)-906522726585769854L, (long)var8_1), (Object)v18, (long)-906060499246442131L, (long)var8_1);
                                        }
                                        catch (IllegalStateException v19) {
                                            throw _3N.a(v19);
                                        }
                                    }
                                    v13 = var44_29;
                                }
                                try {
                                    v15 = var43_28;
lbl141:
                                    // 2 sources

                                    if (v13 > v15) {
                                        v20 = new Object[6];
                                        v20[5] = var25_16;
                                        v20[4] = var10_6;
                                        v20[3] = 1.0;
                                        v20[2] = (double)(var44_29 - var43_28);
                                        v20[1] = (double)var32_22;
                                        v20[0] = (double)var43_28;
                                        _3N.c("\u00e5", (Object)_3N.c("c", (long)-906522726585769854L, (long)var8_1), (Object)v20, (long)-906060499246442131L, (long)var8_1);
                                    }
                                }
                                catch (IllegalStateException v21) {
                                    throw _3N.a(v21);
                                }
                                var47_31 = var41_27 - (double)var44_29;
                                try {
                                    try {
                                        try {
                                            v22 = var20_11;
                                            if (var8_1 <= 0L) break block50;
                                            if (v22 != 0) break block51;
                                            if (!(var47_31 > 0.01)) break block52;
                                        }
                                        catch (IllegalStateException v23) {
                                            throw _3N.a(v23);
                                        }
                                        if (!(var47_31 < 0.99)) break block52;
                                    }
                                    catch (IllegalStateException v24) {
                                        throw _3N.a(v24);
                                    }
                                    _3N.c("\u00ed", (Object)var26_17, (int)((int)((double)var21_12 * var47_31)), (long)-908452784621817874L, (long)var8_1);
                                    v25 = new Object[6];
                                    v25[5] = var26_17;
                                    v25[4] = var10_6;
                                    v25[3] = 1.0;
                                    v25[2] = 1.0;
                                    v25[1] = (double)var32_22;
                                    v25[0] = (double)var44_29;
                                    _3N.c("\u00e5", (Object)_3N.c("c", (long)-906522726585769854L, (long)var8_1), (Object)v25, (long)-906060499246442131L, (long)var8_1);
                                }
                                catch (IllegalStateException v26) {
                                    throw _3N.a(v26);
                                }
                            }
                            ++var32_22;
                        }
                        v22 = var20_11;
                    }
                    if (v22 == 0) continue;
                }
                if (var8_1 <= 0L) break block53;
                v10 /* !! */  = var31_21;
            }
            try {
                if (v10 /* !! */  == false) {
                    v27 = new Object[1];
                    v27[0] = var12_7;
                    _3N.c("\u00e5", (Object)_3N.c("c", (long)-906522726585769854L, (long)var8_1), (Object)v27, (long)-906218547189524588L, (long)var8_1);
                }
            }
            catch (IllegalStateException v28) {
                throw _3N.a(v28);
            }
        }
    }

    public void cfr_renamed_188(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = a ^ l2) ^ 0x4EBF8B069896L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = null;
        objectArray2[2] = null;
        objectArray2[1] = null;
        objectArray2[0] = l3;
        _3N.c("\u00e5", (Object)this, (Object)objectArray2, -4936520183025588723L, (long)l2);
    }

    public static void cfr_renamed_189(Object[] objectArray) {
        block17: {
            CallSite callSite;
            long l2;
            long l3;
            block16: {
                CallSite callSite2;
                block14: {
                    CallSite callSite3;
                    _8B b;
                    int n;
                    long l4;
                    double d;
                    double d2;
                    double d3;
                    double d4;
                    block15: {
                        CallSite callSite4;
                        long l5;
                        block12: {
                            long l6;
                            block13: {
                                d4 = (Double)objectArray[0];
                                d3 = (Double)objectArray[1];
                                d2 = (Double)objectArray[2];
                                d = (Double)objectArray[3];
                                l3 = (Long)objectArray[4];
                                int n2 = (Integer)objectArray[5];
                                long l7 = l3 = a ^ l3;
                                l4 = l7 ^ 0x49944C67D9F0L;
                                l2 = l7 ^ 0x48A622B3D473L;
                                l5 = l7 ^ 0x7373D668B7C6L;
                                long l8 = l7 ^ 0x2149ABB33BBCL;
                                int n3 = (int)(l8 >>> 48);
                                int n4 = (int)(l8 << 16 >>> 32);
                                int n5 = (int)(l8 << 48 >>> 48);
                                l6 = l7 ^ 0x79AF92C129AEL;
                                n = _87.cfr_renamed_7();
                                b = new _8B(n2, (short)n3, n4, (short)n5);
                                try {
                                    callSite4 = _3N.c("v", (Object)b, 8528592648709368529L, (long)l3);
                                    if (n == 0) break block12;
                                    if (callSite4 != false) break block13;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw _3N.a(illegalStateException);
                                }
                                return;
                            }
                            Object[] objectArray2 = new Object[1];
                            objectArray2[0] = l6;
                            callSite4 = _3N.c("\u00e5", (Object)_3N.c("c", 8526511121933002173L, (long)l3), (Object)objectArray2, 8529077066761049519L, (long)l3);
                        }
                        callSite3 = callSite4;
                        try {
                            try {
                                callSite2 = callSite3;
                                if (n == 0) break block14;
                                if (callSite2 != false) break block15;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw _3N.a(illegalStateException);
                            }
                            Object[] objectArray3 = new Object[1];
                            objectArray3[0] = l5;
                            _3N.c("\u00e5", (Object)_3N.c("c", 8526511121933002173L, (long)l3), (Object)objectArray3, 8526400992973691463L, (long)l3);
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw _3N.a(illegalStateException);
                        }
                    }
                    try {
                        if (l3 >= 0L) {
                            callSite = _3N.c("c", 8526511121933002173L, (long)l3);
                            if (n == 0) break block16;
                            Object[] objectArray4 = new Object[6];
                            objectArray4[5] = b;
                            objectArray4[4] = l4;
                            objectArray4[3] = d - d3;
                            objectArray4[2] = d2 - d4;
                            objectArray4[1] = d3;
                            objectArray4[0] = d4;
                            _3N.c("\u00e5", (Object)callSite, (Object)objectArray4, 8525916714835483730L, (long)l3);
                        }
                        callSite2 = callSite3;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw _3N.a(illegalStateException);
                    }
                }
                if (callSite2 != false) break block17;
                callSite = _3N.c("c", 8526511121933002173L, (long)l3);
            }
            Object[] objectArray5 = new Object[1];
            objectArray5[0] = l2;
            _3N.c("\u00e5", (Object)callSite, (Object)objectArray5, 8526252918307246763L, (long)l3);
        }
    }

    public static void cfr_renamed_190(Object[] objectArray) {
        _8B b = (_8B)objectArray[0];
        double d = (Double)objectArray[1];
        long l2 = (Long)objectArray[2];
        double d2 = (Double)objectArray[3];
        double d3 = (Double)objectArray[4];
        double d4 = (Double)objectArray[5];
        double d5 = (Double)objectArray[6];
        long l3 = (l2 = a ^ l2) ^ 0xAFB0AF58777L;
        Object[] objectArray2 = new Object[10];
        objectArray2[9] = d5;
        objectArray2[8] = d5;
        objectArray2[7] = d5;
        objectArray2[6] = d5;
        objectArray2[5] = l3;
        objectArray2[4] = d4;
        objectArray2[3] = d3;
        objectArray2[2] = d2;
        objectArray2[1] = d;
        objectArray2[0] = b;
        _3N.c("\u00f5", (Object)objectArray2, -7475841591925505951L, (long)l2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void cfr_renamed_191(Object[] var0) {
        block50: {
            block43: {
                block40: {
                    block41: {
                        block38: {
                            block39: {
                                var7_1 = (Long)var0[0];
                                var9_2 = (_8B)var0[1];
                                var1_3 = (Double)var0[2];
                                var3_4 = (Double)var0[3];
                                var5_5 = (Double)var0[4];
                                v0 = var7_1 = _3N.a ^ var7_1;
                                var10_6 = v0 ^ 34472870029782L;
                                var12_7 = v0 ^ 33432997995605L;
                                var14_8 = v0 ^ 56300387288121L;
                                var16_9 = v0 ^ 41497120688096L;
                                var18_10 = v0 ^ 52095965911432L;
                                var20_11 = _87.cfr_renamed_7();
                                try {
                                    v1 /* !! */  = _3N.c("v", (Object)var9_2, (long)-8755574791318037769L, (long)var7_1);
                                    if (var20_11 == 0) break block38;
                                    if (v1 /* !! */  != false) break block39;
                                }
                                catch (IllegalStateException v2) {
                                    throw _3N.a(v2);
                                }
                                return;
                            }
                            cfr_temp_0 = var5_5 - 0.0;
                            v1 /* !! */  = (CallSite)(cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1));
                        }
                        if (v1 /* !! */  <= 0) {
                            return;
                        }
                        var21_12 = new _8B((int)_3N.c("v", (Object)var9_2, (long)-8757726105359747926L, (long)var7_1), (int)_3N.c("v", (Object)var9_2, (long)-8760928882898624199L, (long)var7_1), var14_8, (int)_3N.c("v", (Object)var9_2, (long)-8755956229501235073L, (long)var7_1), (int)_3N.c("v", (Object)var9_2, (long)-8755574791318037769L, (long)var7_1));
                        var22_13 = new _8B((int)_3N.c("v", (Object)var9_2, (long)-8757726105359747926L, (long)var7_1), (int)_3N.c("v", (Object)var9_2, (long)-8760928882898624199L, (long)var7_1), var14_8, (int)_3N.c("v", (Object)var9_2, (long)-8755956229501235073L, (long)var7_1), (int)_3N.c("v", (Object)var9_2, (long)-8755574791318037769L, (long)var7_1));
                        var23_14 = (int)_3N.c("\u00f5", (double)(var3_4 - var5_5), (long)-8761573374163393435L, (long)var7_1);
                        var24_15 = (int)_3N.c("\u00f5", (double)(var3_4 + var5_5), (long)-8758135021213020708L, (long)var7_1);
                        var25_16 = var5_5 * var5_5;
                        v3 = new Object[1];
                        v3[0] = var18_10;
                        var27_17 = _3N.c("\u00e5", (Object)_3N.c("c", (long)-8758913591648709221L, (long)var7_1), (Object)v3, (long)-8756395527988124279L, (long)var7_1);
                        try {
                            try {
                                v4 = var27_17;
                                if (var20_11 == 0) break block40;
                                if (v4 != false) break block41;
                            }
                            catch (IllegalStateException v5) {
                                throw _3N.a(v5);
                            }
                            v6 = new Object[1];
                            v6[0] = var16_9;
                            _3N.c("\u00e5", (Object)_3N.c("c", (long)-8758913591648709221L, (long)var7_1), (Object)v6, (long)-8757941853577811359L, (long)var7_1);
                        }
                        catch (IllegalStateException v7) {
                            throw _3N.a(v7);
                        }
                    }
                    v4 = var28_18 = (reference)var23_14;
                }
                while (var28_18 < var24_15) {
                    block47: {
                        block48: {
                            block49: {
                                block45: {
                                    block46: {
                                        block42: {
                                            block44: {
                                                var29_19 = (double)var28_18 + 0.5 - var3_4;
                                                var31_20 = var25_16 - var29_19 * var29_19;
                                                try {
                                                    try {
                                                        v8 = var31_20;
                                                        if (var20_11 == 0) break block42;
                                                        cfr_temp_1 = v8 - 0.0;
                                                        v9 /* !! */  = (reference)(cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1));
                                                        if (var7_1 <= 0L || var20_11 == 0) break block43;
                                                    }
                                                    catch (IllegalStateException v10) {
                                                        throw _3N.a(v10);
                                                    }
                                                    if (v9 /* !! */  > 0) break block44;
                                                }
                                                catch (IllegalStateException v11) {
                                                    throw _3N.a(v11);
                                                }
                                                if (var7_1 >= 0L) break block49;
                                            }
                                            v8 = (double)_3N.c("\u00f5", (double)var31_20, (long)-8755149572372800961L, (long)var7_1);
                                        }
                                        var33_21 = v8;
                                        var35_22 = var1_3 - var33_21;
                                        var37_23 = var1_3 + var33_21;
                                        var39_24 = (int)_3N.c("\u00f5", (double)var35_22, (long)-8761573374163393435L, (long)var7_1);
                                        var40_25 = (int)_3N.c("\u00f5", (double)var37_23, (long)-8758135021213020708L, (long)var7_1);
                                        var41_26 = (double)var39_24 - var35_22;
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        cfr_temp_2 = var41_26 - 0.01;
                                                        v12 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                                                        if (var20_11 == 0) break block45;
                                                        if (v12 <= 0) break block46;
                                                    }
                                                    catch (IllegalStateException v13) {
                                                        throw _3N.a(v13);
                                                    }
                                                    cfr_temp_3 = var41_26 - 0.99;
                                                    v12 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                                                    v14 = var20_11;
                                                    if (var7_1 > 0L) {
                                                        if (v14 == 0) break block45;
                                                    }
                                                    ** GOTO lbl130
                                                }
                                                catch (IllegalStateException v15) {
                                                    throw _3N.a(v15);
                                                }
                                                if (v12 >= 0) break block46;
                                            }
                                            catch (IllegalStateException v16) {
                                                throw _3N.a(v16);
                                            }
                                            _3N.c("\u00ed", (Object)var22_13, (int)((int)((double)_3N.c("v", (Object)var9_2, (long)-8755574791318037769L, (long)var7_1) * var41_26)), (long)-8755574791318037769L, (long)var7_1);
                                            v17 = new Object[6];
                                            v17[5] = var22_13;
                                            v17[4] = var10_6;
                                            v17[3] = 1.0;
                                            v17[2] = 1.0;
                                            v17[1] = (double)var28_18;
                                            v17[0] = (double)(var39_24 - 1);
                                            _3N.c("\u00e5", (Object)_3N.c("c", (long)-8758913591648709221L, (long)var7_1), (Object)v17, (long)-8758249092836070284L, (long)var7_1);
                                        }
                                        catch (IllegalStateException v18) {
                                            throw _3N.a(v18);
                                        }
                                    }
                                    v12 = var40_25;
                                }
                                try {
                                    v14 = var39_24;
lbl130:
                                    // 2 sources

                                    if (v12 > v14) {
                                        v19 = new Object[6];
                                        v19[5] = var21_12;
                                        v19[4] = var10_6;
                                        v19[3] = 1.0;
                                        v19[2] = (double)(var40_25 - var39_24);
                                        v19[1] = (double)var28_18;
                                        v19[0] = (double)var39_24;
                                        _3N.c("\u00e5", (Object)_3N.c("c", (long)-8758913591648709221L, (long)var7_1), (Object)v19, (long)-8758249092836070284L, (long)var7_1);
                                    }
                                }
                                catch (IllegalStateException v20) {
                                    throw _3N.a(v20);
                                }
                                var43_27 = var37_23 - (double)var40_25;
                                try {
                                    try {
                                        try {
                                            v21 = var20_11;
                                            if (var7_1 < 0L) break block47;
                                            if (v21 == 0) break block48;
                                            if (!(var43_27 > 0.01)) break block49;
                                        }
                                        catch (IllegalStateException v22) {
                                            throw _3N.a(v22);
                                        }
                                        if (!(var43_27 < 0.99)) break block49;
                                    }
                                    catch (IllegalStateException v23) {
                                        throw _3N.a(v23);
                                    }
                                    _3N.c("\u00ed", (Object)var22_13, (int)((int)((double)_3N.c("v", (Object)var9_2, (long)-8755574791318037769L, (long)var7_1) * var43_27)), (long)-8755574791318037769L, (long)var7_1);
                                    v24 = new Object[6];
                                    v24[5] = var22_13;
                                    v24[4] = var10_6;
                                    v24[3] = 1.0;
                                    v24[2] = 1.0;
                                    v24[1] = (double)var28_18;
                                    v24[0] = (double)var40_25;
                                    _3N.c("\u00e5", (Object)_3N.c("c", (long)-8758913591648709221L, (long)var7_1), (Object)v24, (long)-8758249092836070284L, (long)var7_1);
                                }
                                catch (IllegalStateException v25) {
                                    throw _3N.a(v25);
                                }
                            }
                            ++var28_18;
                        }
                        v21 = var20_11;
                    }
                    if (v21 != 0) continue;
                }
                if (var7_1 <= 0L) break block50;
                v9 /* !! */  = var27_17;
            }
            try {
                if (v9 /* !! */  == false) {
                    v26 = new Object[1];
                    v26[0] = var12_7;
                    _3N.c("\u00e5", (Object)_3N.c("c", (long)-8758913591648709221L, (long)var7_1), (Object)v26, (long)-8758090511763594611L, (long)var7_1);
                }
            }
            catch (IllegalStateException v27) {
                throw _3N.a(v27);
            }
        }
    }

    public void cfr_renamed_50(Object[] objectArray) {
        double d = (Double)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = a ^ l2;
        _3N.c("\u00ed", (Object)_3N.c("v", (Object)this, 267082686204095748L, (long)l2), (double)d, 267473165552272692L, (long)l2);
    }

    public void cfr_renamed_192(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = a ^ l2) ^ 0x22921C564E39L;
        _3N.c("\u00ed", (Object)this, (boolean)_3N.b("f", 17203, (long)(0x231E813F0A7640F5L ^ l2)), -1440012839439432852L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _3N.c("\u00e5", (Object)this, (Object)objectArray2, -1434044711379482399L, (long)l2);
    }

    public void cfr_renamed_193(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        double d = (Double)objectArray[1];
        double d2 = (Double)objectArray[2];
        double d3 = (Double)objectArray[3];
        double d4 = (Double)objectArray[4];
        _8B b = (_8B)objectArray[5];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x3BAFE9C57182L;
        long l5 = l3 ^ 0x6E81FCAB4A8EL;
        long l6 = l3 ^ 0x4AF64E039701L;
        long l7 = l3 ^ 0x1DC9094AB7C7L;
        long l8 = l3 ^ 0x750A08FB6A59L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l5;
        _3N.c("\u00e5", (Object)_3N.c("v", (Object)this, -6826558387637533363L, (long)l2), (Object)objectArray2, -6825785039772154822L, (long)l2);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = d2;
        objectArray3[1] = d;
        objectArray3[0] = l4;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = b;
        objectArray4[0] = l6;
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l7;
        Object[] objectArray6 = new Object[3];
        objectArray6[2] = d4;
        objectArray6[1] = d3;
        objectArray6[0] = l4;
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = b;
        objectArray7[0] = l6;
        Object[] objectArray8 = new Object[1];
        objectArray8[0] = l7;
        Object[] objectArray9 = new Object[3];
        objectArray9[2] = l8;
        objectArray9[1] = (int)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("v", (Object)this, -6826558387637533363L, (long)l2), (Object)objectArray6, -6819639995895639563L, (long)l2), (Object)objectArray7, -6820528916796030056L, (long)l2), (Object)objectArray8, -6823747561063134777L, (long)l2);
        objectArray9[0] = (int)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("v", (Object)this, -6826558387637533363L, (long)l2), (Object)objectArray3, -6819639995895639563L, (long)l2), (Object)objectArray4, -6820528916796030056L, (long)l2), (Object)objectArray5, -6823747561063134777L, (long)l2);
        _3N.c("\u00e5", (Object)_3N.c("v", (Object)this, -6826558387637533363L, (long)l2), (Object)objectArray9, -6827245035085724659L, (long)l2);
    }

    public void cfr_renamed_194(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        double d3 = (Double)objectArray[2];
        long l2 = (Long)objectArray[3];
        double d4 = (Double)objectArray[4];
        _8B b = (_8B)objectArray[5];
        _8B b2 = (_8B)objectArray[6];
        _8B b3 = (_8B)objectArray[7];
        _8B b4 = (_8B)objectArray[8];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x51292F6B3B4L;
        long l5 = l3 ^ 0x47C5F48CDC31L;
        long l6 = l3 ^ 0x39F182CAF1A5L;
        long l7 = l3 ^ 0x744B35305537L;
        long l8 = l3 ^ 0x2374727975F1L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l6;
        _3N.c("\u00e5", (Object)_3N.c("v", (Object)this, 7164296610648575452L, (long)l2), (Object)objectArray2, 7168454198689279382L, (long)l2);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = d2;
        objectArray3[1] = d;
        objectArray3[0] = l4;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = b;
        objectArray4[0] = l7;
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l8;
        Object[] objectArray6 = new Object[3];
        objectArray6[2] = d2 + d4;
        objectArray6[1] = d;
        objectArray6[0] = l4;
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = b4;
        objectArray7[0] = l7;
        Object[] objectArray8 = new Object[1];
        objectArray8[0] = l8;
        Object[] objectArray9 = new Object[3];
        objectArray9[2] = d2 + d4;
        objectArray9[1] = d + d3;
        objectArray9[0] = l4;
        Object[] objectArray10 = new Object[2];
        objectArray10[1] = b3;
        objectArray10[0] = l7;
        Object[] objectArray11 = new Object[1];
        objectArray11[0] = l8;
        Object[] objectArray12 = new Object[3];
        objectArray12[2] = d2;
        objectArray12[1] = d + d3;
        objectArray12[0] = l4;
        Object[] objectArray13 = new Object[2];
        objectArray13[1] = b2;
        objectArray13[0] = l7;
        Object[] objectArray14 = new Object[1];
        objectArray14[0] = l8;
        Object[] objectArray15 = new Object[5];
        objectArray15[4] = (int)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("v", (Object)this, 7164296610648575452L, (long)l2), (Object)objectArray12, 7164658779746456515L, (long)l2), (Object)objectArray13, 7164844013187760558L, (long)l2), (Object)objectArray14, 7168344132322528241L, (long)l2);
        objectArray15[3] = (int)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("v", (Object)this, 7164296610648575452L, (long)l2), (Object)objectArray9, 7164658779746456515L, (long)l2), (Object)objectArray10, 7164844013187760558L, (long)l2), (Object)objectArray11, 7168344132322528241L, (long)l2);
        objectArray15[2] = (int)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("v", (Object)this, 7164296610648575452L, (long)l2), (Object)objectArray6, 7164658779746456515L, (long)l2), (Object)objectArray7, 7164844013187760558L, (long)l2), (Object)objectArray8, 7168344132322528241L, (long)l2);
        objectArray15[1] = (int)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("v", (Object)this, 7164296610648575452L, (long)l2), (Object)objectArray3, 7164658779746456515L, (long)l2), (Object)objectArray4, 7164844013187760558L, (long)l2), (Object)objectArray5, 7168344132322528241L, (long)l2);
        objectArray15[0] = l5;
        _3N.c("\u00e5", (Object)_3N.c("v", (Object)this, 7164296610648575452L, (long)l2), (Object)objectArray15, 7164793739595892345L, (long)l2);
    }

    public void cfr_renamed_195(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        long l2 = (Long)objectArray[2];
        double d3 = (Double)objectArray[3];
        double d4 = (Double)objectArray[4];
        double d5 = (Double)objectArray[5];
        double d6 = (Double)objectArray[6];
        _8B b = (_8B)objectArray[7];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x3EFFC0AB0365L;
        long l5 = l3 ^ 0x4FA6676DE5E6L;
        long l6 = l3 ^ 0x18992024C520L;
        long l7 = l3 ^ 0x68B007DA4B6FL;
        long l8 = l3 ^ 0x7F54C7CD4CAAL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l7;
        _3N.c("\u00e5", (Object)_3N.c("v", (Object)this, -3189241080371217139L, (long)l2), (Object)objectArray2, -3196223365457153821L, (long)l2);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = d2;
        objectArray3[1] = d;
        objectArray3[0] = l4;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = b;
        objectArray4[0] = l5;
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l6;
        Object[] objectArray6 = new Object[3];
        objectArray6[2] = d4;
        objectArray6[1] = d3;
        objectArray6[0] = l4;
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = b;
        objectArray7[0] = l5;
        Object[] objectArray8 = new Object[1];
        objectArray8[0] = l6;
        Object[] objectArray9 = new Object[3];
        objectArray9[2] = d6;
        objectArray9[1] = d5;
        objectArray9[0] = l4;
        Object[] objectArray10 = new Object[2];
        objectArray10[1] = b;
        objectArray10[0] = l5;
        Object[] objectArray11 = new Object[1];
        objectArray11[0] = l6;
        Object[] objectArray12 = new Object[4];
        objectArray12[3] = l8;
        objectArray12[2] = (int)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("v", (Object)this, -3189241080371217139L, (long)l2), (Object)objectArray9, -3189462374525017326L, (long)l2), (Object)objectArray10, -3188662584346037889L, (long)l2), (Object)objectArray11, -3194695978426123488L, (long)l2);
        objectArray12[1] = (int)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("v", (Object)this, -3189241080371217139L, (long)l2), (Object)objectArray6, -3189462374525017326L, (long)l2), (Object)objectArray7, -3188662584346037889L, (long)l2), (Object)objectArray8, -3194695978426123488L, (long)l2);
        objectArray12[0] = (int)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("v", (Object)this, -3189241080371217139L, (long)l2), (Object)objectArray3, -3189462374525017326L, (long)l2), (Object)objectArray4, -3188662584346037889L, (long)l2), (Object)objectArray5, -3194695978426123488L, (long)l2);
        _3N.c("\u00e5", (Object)_3N.c("v", (Object)this, -3189241080371217139L, (long)l2), (Object)objectArray12, -3189046391152915862L, (long)l2);
    }

    public void cfr_renamed_196(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = a ^ l2) ^ 0x3C8F6546E983L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _3N.c("\u00e5", (Object)_3N.c("v", (Object)this, -6451493843652278073L, (long)l2), (Object)objectArray2, -6457141056121980503L, (long)l2);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        _3N.c("\u00e5", (Object)_3N.c("v", (Object)this, -6454205113537412512L, (long)l2), (Object)objectArray3, -6457141056121980503L, (long)l2);
    }

    public void cfr_renamed_197(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        double d3 = (Double)objectArray[2];
        double d4 = (Double)objectArray[3];
        double d5 = (Double)objectArray[4];
        double d6 = (Double)objectArray[5];
        double d7 = (Double)objectArray[6];
        double d8 = (Double)objectArray[7];
        long l2 = (Long)objectArray[8];
        double d9 = (Double)objectArray[9];
        _8B b = (_8B)objectArray[10];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x472C79A130A4L;
        long l5 = l3 ^ 0x5FB1FDB5F21L;
        long l6 = l3 ^ 0x7BCF699D72B5L;
        long l7 = l3 ^ 0x3675DE67D627L;
        long l8 = l3 ^ 0x614A992EF6E1L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l6;
        _3N.c("\u00e5", (Object)_3N.c("v", (Object)this, -2270671892393636148L, (long)l2), (Object)objectArray2, -2275666757989454202L, (long)l2);
        CallSite callSite = _3N.c("\u00f5", (double)d5, -2278606805213487431L, (long)l2);
        CallSite callSite2 = _3N.c("\u00f5", (double)callSite, -2277462611696754130L, (long)l2);
        int n = _87.cfr_renamed_7();
        CallSite callSite3 = _3N.c("\u00f5", (double)callSite, -2275942374515523378L, (long)l2);
        double d10 = d + d3 / 2.0;
        double d11 = d2 + d4 / 2.0;
        double d12 = (d - d10) * callSite2 - (d2 - d11) * callSite3 + d10;
        double d13 = (d2 - d11) * callSite2 + (d - d10) * callSite3 + d11;
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = d13;
        objectArray3[1] = d12;
        objectArray3[0] = l4;
        Object[] objectArray4 = new Object[3];
        objectArray4[2] = d7;
        objectArray4[1] = d6;
        objectArray4[0] = l4;
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = b;
        objectArray5[0] = l7;
        Object[] objectArray6 = new Object[1];
        objectArray6[0] = l8;
        CallSite callSite4 = _3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("v", (Object)this, -2270671892393636148L, (long)l2), (Object)objectArray3, -2270455168065842989L, (long)l2), (Object)objectArray4, -2270455168065842989L, (long)l2), (Object)objectArray5, -2270129129154968898L, (long)l2), (Object)objectArray6, -2275635865721992991L, (long)l2);
        double d14 = (d - d10) * callSite2 - (d2 + d4 - d11) * callSite3 + d10;
        double d15 = (d2 + d4 - d11) * callSite2 + (d - d10) * callSite3 + d11;
        Object[] objectArray7 = new Object[3];
        objectArray7[2] = d15;
        objectArray7[1] = d14;
        objectArray7[0] = l4;
        Object[] objectArray8 = new Object[3];
        objectArray8[2] = d9;
        objectArray8[1] = d6;
        objectArray8[0] = l4;
        Object[] objectArray9 = new Object[2];
        objectArray9[1] = b;
        objectArray9[0] = l7;
        Object[] objectArray10 = new Object[1];
        objectArray10[0] = l8;
        CallSite callSite5 = _3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("v", (Object)this, -2270671892393636148L, (long)l2), (Object)objectArray7, -2270455168065842989L, (long)l2), (Object)objectArray8, -2270455168065842989L, (long)l2), (Object)objectArray9, -2270129129154968898L, (long)l2), (Object)objectArray10, -2275635865721992991L, (long)l2);
        double d16 = (d + d3 - d10) * callSite2 - (d2 + d4 - d11) * callSite3 + d10;
        double d17 = (d2 + d4 - d11) * callSite2 + (d + d3 - d10) * callSite3 + d11;
        Object[] objectArray11 = new Object[3];
        objectArray11[2] = d17;
        objectArray11[1] = d16;
        objectArray11[0] = l4;
        Object[] objectArray12 = new Object[3];
        objectArray12[2] = d9;
        objectArray12[1] = d8;
        objectArray12[0] = l4;
        Object[] objectArray13 = new Object[2];
        objectArray13[1] = b;
        objectArray13[0] = l7;
        Object[] objectArray14 = new Object[1];
        objectArray14[0] = l8;
        CallSite callSite6 = _3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("v", (Object)this, -2270671892393636148L, (long)l2), (Object)objectArray11, -2270455168065842989L, (long)l2), (Object)objectArray12, -2270455168065842989L, (long)l2), (Object)objectArray13, -2270129129154968898L, (long)l2), (Object)objectArray14, -2275635865721992991L, (long)l2);
        double d18 = (d + d3 - d10) * callSite2 - (d2 - d11) * callSite3 + d10;
        double d19 = (d2 - d11) * callSite2 + (d + d3 - d10) * callSite3 + d11;
        Object[] objectArray15 = new Object[3];
        objectArray15[2] = d19;
        objectArray15[1] = d18;
        objectArray15[0] = l4;
        Object[] objectArray16 = new Object[3];
        objectArray16[2] = d7;
        objectArray16[1] = d8;
        objectArray16[0] = l4;
        Object[] objectArray17 = new Object[2];
        objectArray17[1] = b;
        objectArray17[0] = l7;
        Object[] objectArray18 = new Object[1];
        objectArray18[0] = l8;
        CallSite callSite7 = _3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("v", (Object)this, -2270671892393636148L, (long)l2), (Object)objectArray15, -2270455168065842989L, (long)l2), (Object)objectArray16, -2270455168065842989L, (long)l2), (Object)objectArray17, -2270129129154968898L, (long)l2), (Object)objectArray18, -2275635865721992991L, (long)l2);
        try {
            Object[] objectArray19 = new Object[5];
            objectArray19[4] = (int)callSite7;
            objectArray19[3] = (int)callSite6;
            objectArray19[2] = (int)callSite5;
            objectArray19[1] = (int)callSite4;
            objectArray19[0] = l5;
            _3N.c("\u00e5", (Object)_3N.c("v", (Object)this, -2270671892393636148L, (long)l2), (Object)objectArray19, -2270315809029372567L, (long)l2);
            if (n == 0) {
                _4w.cfr_renamed_8(new String[5]);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw _3N.a(illegalStateException);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void cfr_renamed_198(Object[] var0) {
        block75: {
            block66: {
                block64: {
                    block65: {
                        block62: {
                            block63: {
                                block74: {
                                    block61: {
                                        block60: {
                                            block58: {
                                                block59: {
                                                    block56: {
                                                        block57: {
                                                            block54: {
                                                                block55: {
                                                                    var1_1 = (_8B)var0[0];
                                                                    var2_2 = (Double)var0[1];
                                                                    var4_3 = (Double)var0[2];
                                                                    var6_4 = (Double)var0[3];
                                                                    var8_5 = (Double)var0[4];
                                                                    var10_6 = (Long)var0[5];
                                                                    var12_7 /* !! */  = (Double)var0[6];
                                                                    var14_8 /* !! */  = (Double)var0[7];
                                                                    var16_9 /* !! */  = (Double)var0[8];
                                                                    var18_10 /* !! */  = (Double)var0[9];
                                                                    v0 = var10_6 = _3N.a ^ var10_6;
                                                                    var20_11 = v0 ^ 95241141096165L;
                                                                    var22_12 = v0 ^ 79570205150356L;
                                                                    var24_13 = v0 ^ 123396113017285L;
                                                                    var26_14 = v0 ^ 124279369737286L;
                                                                    var28_15 = v0 ^ 101517034144810L;
                                                                    var30_16 = v0 ^ 82317334071283L;
                                                                    var32_17 = v0 ^ 70376190990747L;
                                                                    var34_18 = v0 ^ 99667146175275L;
                                                                    var36_19 = _87.cfr_renamed_5();
                                                                    try {
                                                                        v1 /* !! */  = _3N.c("v", (Object)var1_1, (long)463479876465728228L, (long)var10_6);
                                                                        if (var36_19 != 0) break block54;
                                                                        if (v1 /* !! */  != false) break block55;
                                                                    }
                                                                    catch (IllegalStateException v2) {
                                                                        throw _3N.a(v2);
                                                                    }
                                                                    return;
                                                                }
                                                                v1 /* !! */  = (CallSite)(var6_4 == var2_2 ? 0 : (var6_4 < var2_2 ? -1 : 1));
                                                            }
                                                            try {
                                                                if (var36_19 != 0) break block56;
                                                                if (v1 /* !! */  >= 0) break block57;
                                                            }
                                                            catch (IllegalStateException v3) {
                                                                throw _3N.a(v3);
                                                            }
                                                            var37_20 = var2_2;
                                                            var2_2 = var6_4;
                                                            var6_4 = var37_20;
                                                        }
                                                        try {
                                                            v4 = var8_5;
                                                            if (var10_6 < 0L) break block58;
                                                            v5 = var4_3;
                                                            if (var36_19 != 0) break block59;
                                                            cfr_temp_0 = v4 - v5;
                                                            v1 /* !! */  = (CallSite)(cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1));
                                                        }
                                                        catch (IllegalStateException v6) {
                                                            throw _3N.a(v6);
                                                        }
                                                    }
                                                    if (v1 /* !! */  < 0) {
                                                        var37_20 = var4_3;
                                                        var4_3 = var8_5;
                                                        var8_5 = var37_20;
                                                    }
                                                    v7 = var6_4;
                                                    v5 = var2_2;
                                                }
                                                v4 = v7 - v5;
                                            }
                                            var37_20 = v4;
                                            var39_21 = var8_5 - var4_3;
                                            try {
                                                try {
                                                    try {
                                                        cfr_temp_1 = var37_20 - 0.0;
                                                        v8 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                                                        if (var36_19 != 0) break block60;
                                                        if (v8 <= 0) break block61;
                                                    }
                                                    catch (IllegalStateException v9) {
                                                        throw _3N.a(v9);
                                                    }
                                                    v10 = var39_21;
                                                    if (var10_6 < 0L) break block62;
                                                    v11 = 0.0;
                                                    if (var36_19 != 0) break block63;
                                                }
                                                catch (IllegalStateException v12) {
                                                    throw _3N.a(v12);
                                                }
                                                cfr_temp_2 = v10 - v11;
                                                v8 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 < 0.0 ? -1 : 1);
                                            }
                                            catch (IllegalStateException v13) {
                                                throw _3N.a(v13);
                                            }
                                        }
                                        if (v8 > 0) break block74;
                                    }
                                    return;
                                }
                                v14 = _3N.c("\u00f5", (double)var37_20, (double)var39_21, (long)460249174807478545L, (long)var10_6);
                                v11 = 2.0;
                            }
                            v10 = (double)(v14 / v11);
                        }
                        var41_22 = v10;
                        v15 = new Object[3];
                        v15[2] = var41_22;
                        v15[1] = var12_7 /* !! */ ;
                        v15[0] = var22_12;
                        var12_7 /* !! */  = (double)_3N.c("\u00f5", (Object)v15, (long)461468183903697207L, (long)var10_6);
                        v16 = new Object[3];
                        v16[2] = var41_22;
                        v16[1] = var14_8 /* !! */ ;
                        v16[0] = var22_12;
                        var14_8 /* !! */  = (double)_3N.c("\u00f5", (Object)v16, (long)461468183903697207L, (long)var10_6);
                        v17 = new Object[3];
                        v17[2] = var41_22;
                        v17[1] = var16_9 /* !! */ ;
                        v17[0] = var22_12;
                        var16_9 /* !! */  = (double)_3N.c("\u00f5", (Object)v17, (long)461468183903697207L, (long)var10_6);
                        v18 = new Object[3];
                        v18[2] = var41_22;
                        v18[1] = var18_10 /* !! */ ;
                        v18[0] = var22_12;
                        var18_10 /* !! */  = (double)_3N.c("\u00f5", (Object)v18, (long)461468183903697207L, (long)var10_6);
                        var43_23 = new _8B((int)_3N.c("v", (Object)var1_1, (long)460811790407333049L, (long)var10_6), (int)_3N.c("v", (Object)var1_1, (long)466548042402210090L, (long)var10_6), var28_15, (int)_3N.c("v", (Object)var1_1, (long)463861224474562668L, (long)var10_6), (int)_3N.c("v", (Object)var1_1, (long)463479876465728228L, (long)var10_6));
                        var44_24 = new _8B((int)_3N.c("v", (Object)var1_1, (long)460811790407333049L, (long)var10_6), (int)_3N.c("v", (Object)var1_1, (long)466548042402210090L, (long)var10_6), var28_15, (int)_3N.c("v", (Object)var1_1, (long)463861224474562668L, (long)var10_6), (int)_3N.c("v", (Object)var1_1, (long)463479876465728228L, (long)var10_6));
                        var45_25 = (int)_3N.c("\u00f5", (double)var4_3, (long)467191355138892918L, (long)var10_6);
                        var46_26 = (int)_3N.c("\u00f5", (double)var8_5, (long)461537572173581775L, (long)var10_6);
                        v19 = new Object[1];
                        v19[0] = var32_17;
                        var47_27 = _3N.c("\u00e5", (Object)_3N.c("c", (long)459781809092662664L, (long)var10_6), (Object)v19, (long)461733075112781210L, (long)var10_6);
                        try {
                            try {
                                v20 = var47_27;
                                if (var36_19 != 0) break block64;
                                if (v20 != false) break block65;
                            }
                            catch (IllegalStateException v21) {
                                throw _3N.a(v21);
                            }
                            v22 = new Object[1];
                            v22[0] = var30_16;
                            _3N.c("\u00e5", (Object)_3N.c("c", (long)459781809092662664L, (long)var10_6), (Object)v22, (long)461307976504863346L, (long)var10_6);
                        }
                        catch (IllegalStateException v23) {
                            throw _3N.a(v23);
                        }
                    }
                    v20 = var48_28 = (reference)var45_25;
                }
                while (var48_28 < var46_26) {
                    block71: {
                        block72: {
                            block73: {
                                block69: {
                                    block70: {
                                        block67: {
                                            block68: {
                                                var49_29 = (double)var48_28 + 0.5;
                                                v24 = new Object[7];
                                                v24[6] = var16_9 /* !! */ ;
                                                v24[5] = var12_7 /* !! */ ;
                                                v24[4] = var49_29;
                                                v24[3] = var34_18;
                                                v24[2] = var8_5;
                                                v24[1] = var4_3;
                                                v24[0] = var2_2;
                                                var51_30 = _3N.c("\u00f5", (Object)v24, (long)459941418639794847L, (long)var10_6);
                                                v25 = new Object[7];
                                                v25[6] = var18_10 /* !! */ ;
                                                v25[5] = var20_11;
                                                v25[4] = var14_8 /* !! */ ;
                                                v25[3] = var49_29;
                                                v25[2] = var8_5;
                                                v25[1] = var4_3;
                                                v25[0] = var6_4;
                                                var53_31 = _3N.c("\u00f5", (Object)v25, (long)463543711372852964L, (long)var10_6);
                                                try {
                                                    try {
                                                        v26 = var53_31 == var51_30 ? 0 : (var53_31 < var51_30 ? -1 : 1);
                                                        if (var10_6 <= 0L || var36_19 != 0) break block66;
                                                        if (var36_19 != 0) break block67;
                                                    }
                                                    catch (IllegalStateException v27) {
                                                        throw _3N.a(v27);
                                                    }
                                                    if (v26 > 0) break block68;
                                                }
                                                catch (IllegalStateException v28) {
                                                    throw _3N.a(v28);
                                                }
                                                if (var10_6 >= 0L) break block73;
                                            }
                                            v29 = (int)_3N.c("\u00f5", (double)var51_30, (long)467191355138892918L, (long)var10_6);
                                        }
                                        var55_32 = v29;
                                        var56_33 = (int)_3N.c("\u00f5", (double)var53_31, (long)461537572173581775L, (long)var10_6);
                                        var57_34 = (double)var55_32 - var51_30;
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        cfr_temp_3 = var57_34 - 0.01;
                                                        v30 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 > 0.0 ? 1 : -1);
                                                        if (var36_19 != 0) break block69;
                                                        if (v30 <= 0) break block70;
                                                    }
                                                    catch (IllegalStateException v31) {
                                                        throw _3N.a(v31);
                                                    }
                                                    cfr_temp_4 = var57_34 - 0.99;
                                                    v30 = cfr_temp_4 == 0.0 ? 0 : (cfr_temp_4 < 0.0 ? -1 : 1);
                                                    v32 = var36_19;
                                                    if (var10_6 >= 0L) {
                                                        if (v32 != 0) break block69;
                                                    }
                                                    ** GOTO lbl258
                                                }
                                                catch (IllegalStateException v33) {
                                                    throw _3N.a(v33);
                                                }
                                                if (v30 >= 0) break block70;
                                            }
                                            catch (IllegalStateException v34) {
                                                throw _3N.a(v34);
                                            }
                                            _3N.c("\u00ed", (Object)var44_24, (int)((int)((double)_3N.c("v", (Object)var1_1, (long)463479876465728228L, (long)var10_6) * var57_34)), (long)463479876465728228L, (long)var10_6);
                                            v35 = new Object[6];
                                            v35[5] = var44_24;
                                            v35[4] = var24_13;
                                            v35[3] = 1.0;
                                            v35[2] = 1.0;
                                            v35[1] = (double)var48_28;
                                            v35[0] = (double)(var55_32 - true);
                                            _3N.c("\u00e5", (Object)_3N.c("c", (long)459781809092662664L, (long)var10_6), (Object)v35, (long)461370173095013479L, (long)var10_6);
                                        }
                                        catch (IllegalStateException v36) {
                                            throw _3N.a(v36);
                                        }
                                    }
                                    v30 = var56_33;
                                }
                                try {
                                    v32 = var55_32;
lbl258:
                                    // 2 sources

                                    if (v30 > v32) {
                                        v37 = new Object[6];
                                        v37[5] = var43_23;
                                        v37[4] = var24_13;
                                        v37[3] = 1.0;
                                        v37[2] = (double)(var56_33 - var55_32);
                                        v37[1] = (double)var48_28;
                                        v37[0] = (double)var55_32;
                                        _3N.c("\u00e5", (Object)_3N.c("c", (long)459781809092662664L, (long)var10_6), (Object)v37, (long)461370173095013479L, (long)var10_6);
                                    }
                                }
                                catch (IllegalStateException v38) {
                                    throw _3N.a(v38);
                                }
                                var59_35 = var53_31 - (double)var56_33;
                                try {
                                    try {
                                        try {
                                            v39 = var36_19;
                                            if (var10_6 <= 0L) break block71;
                                            if (v39 != 0) break block72;
                                            if (!(var59_35 > 0.01)) break block73;
                                        }
                                        catch (IllegalStateException v40) {
                                            throw _3N.a(v40);
                                        }
                                        if (!(var59_35 < 0.99)) break block73;
                                    }
                                    catch (IllegalStateException v41) {
                                        throw _3N.a(v41);
                                    }
                                    _3N.c("\u00ed", (Object)var44_24, (int)((int)((double)_3N.c("v", (Object)var1_1, (long)463479876465728228L, (long)var10_6) * var59_35)), (long)463479876465728228L, (long)var10_6);
                                    v42 = new Object[6];
                                    v42[5] = var44_24;
                                    v42[4] = var24_13;
                                    v42[3] = 1.0;
                                    v42[2] = 1.0;
                                    v42[1] = (double)var48_28;
                                    v42[0] = (double)var56_33;
                                    _3N.c("\u00e5", (Object)_3N.c("c", (long)459781809092662664L, (long)var10_6), (Object)v42, (long)461370173095013479L, (long)var10_6);
                                }
                                catch (IllegalStateException v43) {
                                    throw _3N.a(v43);
                                }
                            }
                            ++var48_28;
                        }
                        v39 = var36_19;
                    }
                    if (v39 == 0) continue;
                }
                if (var10_6 <= 0L) break block75;
                v26 = var47_27;
            }
            try {
                if (v26 == false) {
                    v44 = new Object[1];
                    v44[0] = var26_14;
                    _3N.c("\u00e5", (Object)_3N.c("c", (long)459781809092662664L, (long)var10_6), (Object)v44, (long)461175260642484894L, (long)var10_6);
                }
            }
            catch (IllegalStateException v45) {
                throw _3N.a(v45);
            }
        }
    }

    public _3N(boolean bl, long l2) {
        long l3 = (l2 = a ^ l2) ^ 0x45EB90B44E55L;
        _3N.c("\u00ed", (Object)this, (boolean)_3N.b("f", 22277, (long)(0x2D137B4263ED5936L ^ l2)), 7057183975896485528L, (long)l2);
        this.cfr_renamed_3 = bl;
        this.cfr_renamed_2 = new _6N((RenderPipeline)(bl ? _3N.c("c", 7055795282928707498L, (long)l2) : _3N.c("c", 7054572010671283704L, (long)l2)), l3);
        this.cfr_renamed_6 = new _6N((RenderPipeline)_3N.c("c", 7056780465753048966L, (long)l2), l3);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    _3N.a = l.a(-8085634443166678887L, 5851487469062185320L, MethodHandles.lookup().lookupClass()).a(242699103194154L);
                    _3N.h = new Object[113];
                    _3N.i = new String[113];
                    _3N.a();
                    _3N.d = new HashMap<K, V>(13);
                    _3N.cfr_renamed_3(null);
                    var11 = _3N.a ^ 129687755560425L;
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
                    var20_3 = new String[2];
                    var18_4 = 0;
                    var17_5 = "\u00d5\u00bccBb<\u0094\u0098%\u0007\u0098\u00e4\u0018S\u00f5Im\u00eboa\u00ac\u0092{\u00fe[\u0088\u009b\u00c0\u0016\u007f(%h`\u0012\u00e2\u00974:\u00e1d\u00fc\u00e1\u00e4h\u00e0\u00fd\u008eR\u009b\u0086\u008fO\f`\u00f1\u00a4Tl\u00ad&r\u0095\u00c7\u00ec\u0003U\u0012.\u00f1X0\u008d\u00a3\u00f7\u00e1\u00d2\u00f1n/)\u00e0u\u000f\f\u00f7\u00ff\u00d3\u008co1'=]\u00c8\u00e7\u0080w_\u0004P\u00b6(\u00e1\u00d6\u00ef\u00eeL\u001f\u0088\u00ac\u00c8\u00f4\u009f\u009a\u00c8\u00ac\u00e0\u0087\u00c2\bF\n\u00b3r\u000f~\u00db2K\u00b1u7\u00cf\u00cb\u00be\u0007";
                    var19_6 = "\u00d5\u00bccBb<\u0094\u0098%\u0007\u0098\u00e4\u0018S\u00f5Im\u00eboa\u00ac\u0092{\u00fe[\u0088\u009b\u00c0\u0016\u007f(%h`\u0012\u00e2\u00974:\u00e1d\u00fc\u00e1\u00e4h\u00e0\u00fd\u008eR\u009b\u0086\u008fO\f`\u00f1\u00a4Tl\u00ad&r\u0095\u00c7\u00ec\u0003U\u0012.\u00f1X0\u008d\u00a3\u00f7\u00e1\u00d2\u00f1n/)\u00e0u\u000f\f\u00f7\u00ff\u00d3\u008co1'=]\u00c8\u00e7\u0080w_\u0004P\u00b6(\u00e1\u00d6\u00ef\u00eeL\u001f\u0088\u00ac\u00c8\u00f4\u009f\u009a\u00c8\u00ac\u00e0\u0087\u00c2\bF\n\u00b3r\u000f~\u00db2K\u00b1u7\u00cf\u00cb\u00be\u0007".length();
                    var16_7 = 32;
                    var15_8 = -1;
lbl24:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl26:
                    // 1 sources

                    while (true) {
                        var20_3[var18_4++] = _3N.a(var21_9).intern();
                        if ((var15_8 += var16_7) < var19_6) {
                            var16_7 = var17_5.charAt(var15_8);
                            ** continue;
                        }
                        break block12;
                        break;
                    }
                    v3 = ++var15_8;
                    var21_9 = var13_1.doFinal(var17_5.substring(v3, v3 + var16_7).getBytes("ISO-8859-1"));
                    ** while (true)
                }
                _3N.b = var20_3;
                _3N.c = new String[2];
                _3N.g = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v4 = SecretKeyFactory.getInstance("DES");
                v5 = new byte[8];
                v6 = v5;
                v5[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v6 = v6;
                    v6[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[11];
                var3_13 = 0;
                var4_14 = "]!=\u00cf\u0004\\?\u00af0\u00c0]\u00c2-\u00c4F\u00d8q\u0018\u0018j\u008f\u0092)\u00fb\u0088V\u00f2\u00cee6\u00e0\u00bc.<\u00fa\u0015\n\u008f\u00f2\u0013\u00bcoE\u00df\u00e6\u00ec\fLUb\u0095\u009fQ\u00bd\u00f5\u00c3\nb1\u00192^\u0007\u00f2c\u00ab\u00d8\u00cdX\u0090\u00f5\u00e0";
                var5_15 = "]!=\u00cf\u0004\\?\u00af0\u00c0]\u00c2-\u00c4F\u00d8q\u0018\u0018j\u008f\u0092)\u00fb\u0088V\u00f2\u00cee6\u00e0\u00bc.<\u00fa\u0015\n\u008f\u00f2\u0013\u00bcoE\u00df\u00e6\u00ec\fLUb\u0095\u009fQ\u00bd\u00f5\u00c3\nb1\u00192^\u0007\u00f2c\u00ab\u00d8\u00cdX\u0090\u00f5\u00e0".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v7 = var6_12;
                    v8 = var3_13++;
                    v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v10 = -1;
                    break block13;
                    break;
                }
lbl62:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u0098\u00de\u008c0\u00876\u00ae\u00d4\u00be\u00cd\u001b\f\u00b0\u0002\u0093\u00ac";
                    var5_15 = "\u0098\u00de\u008c0\u00876\u00ae\u00d4\u00be\u00cd\u001b\f\u00b0\u0002\u0093\u00ac".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v7 = var6_12;
                        v8 = var3_13++;
                        v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v10 = 0;
                        break block13;
                        break;
                    }
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    break block14;
                    break;
                }
            }
            var8_18 = v9;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v11 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v10) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl88:
                // 1 sources

                ** continue;
            }
        }
        _3N.e = var6_12;
        _3N.f = new Integer[11];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void cfr_renamed_1(Object[] var0) {
        block184: {
            block156: {
                block154: {
                    block155: {
                        block150: {
                            block151: {
                                block152: {
                                    block153: {
                                        block148: {
                                            block146: {
                                                block147: {
                                                    block183: {
                                                        block145: {
                                                            block144: {
                                                                block142: {
                                                                    block143: {
                                                                        block140: {
                                                                            block141: {
                                                                                block138: {
                                                                                    block139: {
                                                                                        block136: {
                                                                                            block137: {
                                                                                                var21_1 = (_8B)var0[0];
                                                                                                var1_2 = (Double)var0[1];
                                                                                                var3_3 = (Double)var0[2];
                                                                                                var5_4 = (Long)var0[3];
                                                                                                var7_5 = (Double)var0[4];
                                                                                                var9_6 = (Double)var0[5];
                                                                                                var11_7 /* !! */  = (Double)var0[6];
                                                                                                var13_8 /* !! */  = (Double)var0[7];
                                                                                                var15_9 /* !! */  = (Double)var0[8];
                                                                                                var17_10 /* !! */  = (Double)var0[9];
                                                                                                var19_11 = (Double)var0[10];
                                                                                                v0 = var5_4 = _3N.a ^ var5_4;
                                                                                                var22_12 = v0 ^ 75850589734379L;
                                                                                                var24_13 = v0 ^ 62891942351450L;
                                                                                                var26_14 = v0 ^ 43921481666603L;
                                                                                                var28_15 = v0 ^ 34730195793274L;
                                                                                                var30_16 = v0 ^ 33690498349305L;
                                                                                                var32_17 = v0 ^ 57141910198421L;
                                                                                                var34_18 = v0 ^ 41170935012172L;
                                                                                                var36_19 = v0 ^ 52422732760356L;
                                                                                                var38_20 = v0 ^ 58315813416852L;
                                                                                                var40_21 = _87.cfr_renamed_7();
                                                                                                try {
                                                                                                    v1 /* !! */  = _3N.c("v", (Object)var21_1, (long)1932593797595137627L, (long)var5_4);
                                                                                                    if (var40_21 == 0) break block136;
                                                                                                    if (v1 /* !! */  != false) break block137;
                                                                                                }
                                                                                                catch (IllegalStateException v2) {
                                                                                                    throw _3N.a(v2);
                                                                                                }
                                                                                                return;
                                                                                            }
                                                                                            cfr_temp_0 = var19_11 - 0.0;
                                                                                            v1 /* !! */  = (CallSite)(cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1));
                                                                                        }
                                                                                        try {
                                                                                            v3 = var40_21;
                                                                                            if (var5_4 >= 0L) {
                                                                                                if (v3 == 0) break block138;
                                                                                                if (v1 /* !! */  > 0) break block139;
                                                                                            }
                                                                                            ** GOTO lbl52
                                                                                        }
                                                                                        catch (IllegalStateException v4) {
                                                                                            throw _3N.a(v4);
                                                                                        }
                                                                                        return;
                                                                                    }
                                                                                    v1 /* !! */  = (CallSite)(var7_5 == var1_2 ? 0 : (var7_5 < var1_2 ? -1 : 1));
                                                                                }
                                                                                try {
                                                                                    v3 = var40_21;
lbl52:
                                                                                    // 2 sources

                                                                                    if (v3 == 0) break block140;
                                                                                    if (v1 /* !! */  >= 0) break block141;
                                                                                }
                                                                                catch (IllegalStateException v5) {
                                                                                    throw _3N.a(v5);
                                                                                }
                                                                                var41_22 = var1_2;
                                                                                var1_2 = var7_5;
                                                                                var7_5 = var41_22;
                                                                            }
                                                                            try {
                                                                                v6 = var9_6;
                                                                                if (var5_4 < 0L) break block142;
                                                                                v7 = var3_3;
                                                                                if (var40_21 == 0) break block143;
                                                                                cfr_temp_1 = v6 - v7;
                                                                                v1 /* !! */  = (CallSite)(cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1));
                                                                            }
                                                                            catch (IllegalStateException v8) {
                                                                                throw _3N.a(v8);
                                                                            }
                                                                        }
                                                                        if (v1 /* !! */  < 0) {
                                                                            var41_22 = var3_3;
                                                                            var3_3 = var9_6;
                                                                            var9_6 = var41_22;
                                                                        }
                                                                        v9 = var7_5;
                                                                        v7 = var1_2;
                                                                    }
                                                                    v6 = v9 - v7;
                                                                }
                                                                var41_22 = v6;
                                                                var43_23 = var9_6 - var3_3;
                                                                try {
                                                                    try {
                                                                        try {
                                                                            cfr_temp_2 = var41_22 - 0.0;
                                                                            v10 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 < 0.0 ? -1 : 1);
                                                                            if (var40_21 == 0) break block144;
                                                                            if (v10 <= 0) break block145;
                                                                        }
                                                                        catch (IllegalStateException v11) {
                                                                            throw _3N.a(v11);
                                                                        }
                                                                        v12 = var43_23;
                                                                        if (var5_4 <= 0L) break block146;
                                                                        v13 = 0.0;
                                                                        if (var40_21 == 0) break block147;
                                                                    }
                                                                    catch (IllegalStateException v14) {
                                                                        throw _3N.a(v14);
                                                                    }
                                                                    cfr_temp_3 = v12 - v13;
                                                                    v10 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                                                                }
                                                                catch (IllegalStateException v15) {
                                                                    throw _3N.a(v15);
                                                                }
                                                            }
                                                            if (v10 > 0) break block183;
                                                        }
                                                        return;
                                                    }
                                                    var19_11 = (double)_3N.c("\u00f5", (double)var19_11, (double)(_3N.c("\u00f5", (double)var41_22, (double)var43_23, (long)1935507168003431854L, (long)var5_4) / 2.0), (long)1935507168003431854L, (long)var5_4);
                                                    v16 = _3N.c("\u00f5", (double)var41_22, (double)var43_23, (long)1935507168003431854L, (long)var5_4);
                                                    v13 = 2.0;
                                                }
                                                v12 = v16 / v13;
                                            }
                                            var45_24 = v12;
                                            v17 = new Object[3];
                                            v17[2] = var45_24;
                                            v17[1] = var11_7 /* !! */ ;
                                            v17[0] = var26_14;
                                            var11_7 /* !! */  = (double)_3N.c("\u00f5", (Object)v17, (long)1934324019205072264L, (long)var5_4);
                                            v18 = new Object[3];
                                            v18[2] = var45_24;
                                            v18[1] = var13_8 /* !! */ ;
                                            v18[0] = var26_14;
                                            var13_8 /* !! */  = (double)_3N.c("\u00f5", (Object)v18, (long)1934324019205072264L, (long)var5_4);
                                            v19 = new Object[3];
                                            v19[2] = var45_24;
                                            v19[1] = var15_9 /* !! */ ;
                                            v19[0] = var26_14;
                                            var15_9 /* !! */  = (double)_3N.c("\u00f5", (Object)v19, (long)1934324019205072264L, (long)var5_4);
                                            v20 = new Object[3];
                                            v20[2] = var45_24;
                                            v20[1] = var17_10 /* !! */ ;
                                            v20[0] = var26_14;
                                            var17_10 /* !! */  = (double)_3N.c("\u00f5", (Object)v20, (long)1934324019205072264L, (long)var5_4);
                                            var47_25 = var1_2 + var19_11;
                                            var49_26 = var3_3 + var19_11;
                                            var51_27 = var7_5 - var19_11;
                                            var53_28 = var9_6 - var19_11;
                                            try {
                                                block149: {
                                                    try {
                                                        try {
                                                            try {
                                                                v21 = var40_21;
                                                                if (var5_4 > 0L) {
                                                                    if (v21 == 0) break block148;
                                                                    v21 = var51_27 == var47_25 ? 0 : (var51_27 < var47_25 ? -1 : 1);
                                                                }
                                                                if (v21 <= 0) break block149;
                                                            }
                                                            catch (IllegalStateException v22) {
                                                                throw _3N.a(v22);
                                                            }
                                                            v23 /* !! */  = var53_28;
                                                            if (var5_4 < 0L) break block150;
                                                            v24 = var49_26;
                                                            if (var40_21 == 0) break block151;
                                                        }
                                                        catch (IllegalStateException v25) {
                                                            throw _3N.a(v25);
                                                        }
                                                        if (var5_4 <= 0L) break block152;
                                                        if (!(v23 /* !! */  <= v24)) break block153;
                                                    }
                                                    catch (IllegalStateException v26) {
                                                        throw _3N.a(v26);
                                                    }
                                                }
                                                v27 = new Object[10];
                                                v27[9] = var17_10 /* !! */ ;
                                                v27[8] = var15_9 /* !! */ ;
                                                v27[7] = var13_8 /* !! */ ;
                                                v27[6] = var11_7 /* !! */ ;
                                                v27[5] = var22_12;
                                                v27[4] = var9_6;
                                                v27[3] = var7_5;
                                                v27[2] = var3_3;
                                                v27[1] = var1_2;
                                                v27[0] = var21_1;
                                                _3N.c("\u00f5", (Object)v27, (long)1935483139148219133L, (long)var5_4);
                                            }
                                            catch (IllegalStateException v28) {
                                                throw _3N.a(v28);
                                            }
                                        }
                                        return;
                                    }
                                    v29 = 0.0;
                                    v30 /* !! */  = var11_7 /* !! */ ;
                                }
                                v24 = v30 /* !! */  - var19_11;
                            }
                            v23 /* !! */  = (double)_3N.c("\u00f5", (double)v29, (double)v24, (long)1934881591015494545L, (long)var5_4);
                        }
                        var55_29 = v23 /* !! */ ;
                        var57_30 = _3N.c("\u00f5", (double)0.0, (double)(var13_8 /* !! */  - var19_11), (long)1934881591015494545L, (long)var5_4);
                        var59_31 = _3N.c("\u00f5", (double)0.0, (double)(var15_9 /* !! */  - var19_11), (long)1934881591015494545L, (long)var5_4);
                        var61_32 = _3N.c("\u00f5", (double)0.0, (double)(var17_10 /* !! */  - var19_11), (long)1934881591015494545L, (long)var5_4);
                        var63_33 = new _8B((int)_3N.c("v", (Object)var21_1, (long)1934945086387939334L, (long)var5_4), (int)_3N.c("v", (Object)var21_1, (long)1929490440366177685L, (long)var5_4), var32_17, (int)_3N.c("v", (Object)var21_1, (long)1932212462474644691L, (long)var5_4), (int)_3N.c("v", (Object)var21_1, (long)1932593797595137627L, (long)var5_4));
                        var64_34 = new _8B((int)_3N.c("v", (Object)var21_1, (long)1934945086387939334L, (long)var5_4), (int)_3N.c("v", (Object)var21_1, (long)1929490440366177685L, (long)var5_4), var32_17, (int)_3N.c("v", (Object)var21_1, (long)1932212462474644691L, (long)var5_4), (int)_3N.c("v", (Object)var21_1, (long)1932593797595137627L, (long)var5_4));
                        var65_35 = (int)_3N.c("\u00f5", (double)var3_3, (long)1928846464263387337L, (long)var5_4);
                        var66_36 = (int)_3N.c("\u00f5", (double)var9_6, (long)1934536102226891120L, (long)var5_4);
                        var67_37 = (int)_3N.c("\u00f5", (double)var49_26, (long)1928846464263387337L, (long)var5_4);
                        var68_38 = (int)_3N.c("\u00f5", (double)var53_28, (long)1934536102226891120L, (long)var5_4);
                        v31 = new Object[1];
                        v31[0] = var36_19;
                        var69_39 = _3N.c("\u00e5", (Object)_3N.c("c", (long)1936009846405433655L, (long)var5_4), (Object)v31, (long)1934023795780450597L, (long)var5_4);
                        try {
                            try {
                                v32 = var69_39;
                                if (var40_21 == 0) break block154;
                                if (v32 != false) break block155;
                            }
                            catch (IllegalStateException v33) {
                                throw _3N.a(v33);
                            }
                            v34 = new Object[1];
                            v34[0] = var34_18;
                            _3N.c("\u00e5", (Object)_3N.c("c", (long)1936009846405433655L, (long)var5_4), (Object)v34, (long)1934729819608610509L, (long)var5_4);
                        }
                        catch (IllegalStateException v35) {
                            throw _3N.a(v35);
                        }
                    }
                    v32 = var70_40 = (reference)var65_35;
                }
                while (var70_40 < var66_36) {
                    block168: {
                        block167: {
                            block182: {
                                block180: {
                                    block181: {
                                        block176: {
                                            block179: {
                                                block178: {
                                                    block177: {
                                                        block174: {
                                                            block175: {
                                                                block172: {
                                                                    block173: {
                                                                        block169: {
                                                                            block171: {
                                                                                block170: {
                                                                                    block161: {
                                                                                        block166: {
                                                                                            block164: {
                                                                                                block165: {
                                                                                                    block162: {
                                                                                                        block163: {
                                                                                                            block159: {
                                                                                                                block157: {
                                                                                                                    block158: {
                                                                                                                        var71_41 = (double)var70_40 + 0.5;
                                                                                                                        v36 = new Object[7];
                                                                                                                        v36[6] = var15_9 /* !! */ ;
                                                                                                                        v36[5] = var11_7 /* !! */ ;
                                                                                                                        v36[4] = var71_41;
                                                                                                                        v36[3] = var38_20;
                                                                                                                        v36[2] = var9_6;
                                                                                                                        v36[1] = var3_3;
                                                                                                                        v36[0] = var1_2;
                                                                                                                        var73_42 = _3N.c("\u00f5", (Object)v36, (long)1935815447685611040L, (long)var5_4);
                                                                                                                        v37 = new Object[7];
                                                                                                                        v37[6] = var17_10 /* !! */ ;
                                                                                                                        v37[5] = var24_13;
                                                                                                                        v37[4] = var13_8 /* !! */ ;
                                                                                                                        v37[3] = var71_41;
                                                                                                                        v37[2] = var9_6;
                                                                                                                        v37[1] = var3_3;
                                                                                                                        v37[0] = var7_5;
                                                                                                                        var75_43 = _3N.c("\u00f5", (Object)v37, (long)1932529264553271899L, (long)var5_4);
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                v38 = var75_43 == var73_42 ? 0 : (var75_43 < var73_42 ? -1 : 1);
                                                                                                                                if (var5_4 < 0L || var40_21 == 0) break block156;
                                                                                                                                if (var40_21 == 0) break block157;
                                                                                                                            }
                                                                                                                            catch (IllegalStateException v39) {
                                                                                                                                throw _3N.a(v39);
                                                                                                                            }
                                                                                                                            if (v38 > 0) break block158;
                                                                                                                        }
                                                                                                                        catch (IllegalStateException v40) {
                                                                                                                            throw _3N.a(v40);
                                                                                                                        }
                                                                                                                        if (var5_4 >= 0L) break block167;
                                                                                                                    }
                                                                                                                    v41 = (int)_3N.c("\u00f5", (double)var73_42, (long)1928846464263387337L, (long)var5_4);
                                                                                                                }
                                                                                                                var77_44 = v41;
                                                                                                                var78_45 = (int)_3N.c("\u00f5", (double)var75_43, (long)1934536102226891120L, (long)var5_4);
                                                                                                                var79_46 = (double)var77_44 - var73_42;
                                                                                                                var81_47 = var75_43 - (double)var78_45;
                                                                                                                try {
                                                                                                                    block160: {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    v42 /* !! */  = (int)var70_40;
                                                                                                                                    v43 = var40_21;
                                                                                                                                    if (var5_4 > 0L) {
                                                                                                                                        if (v43 == 0) break block159;
                                                                                                                                        v43 = var67_37;
                                                                                                                                    }
                                                                                                                                    if (v42 /* !! */  < v43) break block160;
                                                                                                                                }
                                                                                                                                catch (IllegalStateException v44) {
                                                                                                                                    throw _3N.a(v44);
                                                                                                                                }
                                                                                                                                v42 /* !! */  = (int)var70_40;
                                                                                                                                v45 = var40_21;
                                                                                                                                if (var5_4 > 0L) {
                                                                                                                                    if (v45 == 0) break block159;
                                                                                                                                }
                                                                                                                                ** GOTO lbl336
                                                                                                                            }
                                                                                                                            catch (IllegalStateException v46) {
                                                                                                                                throw _3N.a(v46);
                                                                                                                            }
                                                                                                                            if (v42 /* !! */  < var68_38) break block161;
                                                                                                                        }
                                                                                                                        catch (IllegalStateException v47) {
                                                                                                                            throw _3N.a(v47);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    v42 /* !! */  = (cfr_temp_4 = var79_46 - 0.01) == 0.0 ? 0 : (cfr_temp_4 > 0.0 ? 1 : -1);
                                                                                                                }
                                                                                                                catch (IllegalStateException v48) {
                                                                                                                    throw _3N.a(v48);
                                                                                                                }
                                                                                                            }
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            v45 = var40_21;
lbl336:
                                                                                                                            // 2 sources

                                                                                                                            if (v45 == 0) break block162;
                                                                                                                            if (v42 /* !! */  <= 0) break block163;
                                                                                                                        }
                                                                                                                        catch (IllegalStateException v49) {
                                                                                                                            throw _3N.a(v49);
                                                                                                                        }
                                                                                                                        cfr_temp_5 = var79_46 - 0.99;
                                                                                                                        v42 /* !! */  = cfr_temp_5 == 0.0 ? 0 : (cfr_temp_5 < 0.0 ? -1 : 1);
                                                                                                                        v50 = var40_21;
                                                                                                                        if (var5_4 >= 0L) {
                                                                                                                            if (v50 == 0) break block162;
                                                                                                                        }
                                                                                                                        ** GOTO lbl377
                                                                                                                    }
                                                                                                                    catch (IllegalStateException v51) {
                                                                                                                        throw _3N.a(v51);
                                                                                                                    }
                                                                                                                    if (v42 /* !! */  >= 0) break block163;
                                                                                                                }
                                                                                                                catch (IllegalStateException v52) {
                                                                                                                    throw _3N.a(v52);
                                                                                                                }
                                                                                                                _3N.c("\u00ed", (Object)var64_34, (int)((int)((double)_3N.c("v", (Object)var21_1, (long)1932593797595137627L, (long)var5_4) * var79_46)), (long)1932593797595137627L, (long)var5_4);
                                                                                                                v53 = new Object[6];
                                                                                                                v53[5] = var64_34;
                                                                                                                v53[4] = var28_15;
                                                                                                                v53[3] = 1.0;
                                                                                                                v53[2] = 1.0;
                                                                                                                v53[1] = (double)var70_40;
                                                                                                                v53[0] = (double)(var77_44 - true);
                                                                                                                _3N.c("\u00e5", (Object)_3N.c("c", (long)1936009846405433655L, (long)var5_4), (Object)v53, (long)1934421480796975320L, (long)var5_4);
                                                                                                            }
                                                                                                            catch (IllegalStateException v54) {
                                                                                                                throw _3N.a(v54);
                                                                                                            }
                                                                                                        }
                                                                                                        v42 /* !! */  = var78_45;
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            v50 = var40_21;
lbl377:
                                                                                                            // 2 sources

                                                                                                            if (var5_4 >= 0L) {
                                                                                                                if (v50 == 0) break block164;
                                                                                                                if (v42 /* !! */  <= var77_44) break block165;
                                                                                                            }
                                                                                                            ** GOTO lbl407
                                                                                                        }
                                                                                                        catch (IllegalStateException v55) {
                                                                                                            throw _3N.a(v55);
                                                                                                        }
                                                                                                        v56 = new Object[6];
                                                                                                        v56[5] = var63_33;
                                                                                                        v56[4] = var28_15;
                                                                                                        v56[3] = 1.0;
                                                                                                        v56[2] = (double)(var78_45 - var77_44);
                                                                                                        v56[1] = (double)var70_40;
                                                                                                        v56[0] = (double)var77_44;
                                                                                                        _3N.c("\u00e5", (Object)_3N.c("c", (long)1936009846405433655L, (long)var5_4), (Object)v56, (long)1934421480796975320L, (long)var5_4);
                                                                                                    }
                                                                                                    catch (IllegalStateException v57) {
                                                                                                        throw _3N.a(v57);
                                                                                                    }
                                                                                                }
                                                                                                v42 /* !! */  = (cfr_temp_6 = var81_47 - 0.01) == 0 ? 0 : (cfr_temp_6 > 0 ? 1 : -1);
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    if (var5_4 < 0L) break block166;
                                                                                                    v50 = var40_21;
lbl407:
                                                                                                    // 2 sources

                                                                                                    if (v50 == 0) break block166;
                                                                                                    if (v42 /* !! */  <= 0) break block167;
                                                                                                }
                                                                                                catch (IllegalStateException v58) {
                                                                                                    throw _3N.a(v58);
                                                                                                }
                                                                                                cfr_temp_7 = var81_47 - 0.99;
                                                                                                v42 /* !! */  = cfr_temp_7 == 0 ? 0 : (cfr_temp_7 < 0 ? -1 : 1);
                                                                                            }
                                                                                            catch (IllegalStateException v59) {
                                                                                                throw _3N.a(v59);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            if (var5_4 < 0L) break block168;
                                                                                            if (v42 /* !! */  >= 0) break block167;
                                                                                            _3N.c("\u00ed", (Object)var64_34, (int)((int)((double)_3N.c("v", (Object)var21_1, (long)1932593797595137627L, (long)var5_4) * var81_47)), (long)1932593797595137627L, (long)var5_4);
                                                                                            v60 = new Object[6];
                                                                                            v60[5] = var64_34;
                                                                                            v60[4] = var28_15;
                                                                                            v60[3] = 1.0;
                                                                                            v60[2] = 1.0;
                                                                                            v60[1] = (double)var70_40;
                                                                                            v60[0] = (double)var78_45;
                                                                                            _3N.c("\u00e5", (Object)_3N.c("c", (long)1936009846405433655L, (long)var5_4), (Object)v60, (long)1934421480796975320L, (long)var5_4);
                                                                                            v42 /* !! */  = var40_21;
                                                                                            if (var5_4 < 0L) break block168;
                                                                                            if (v42 /* !! */  != 0) break block167;
                                                                                        }
                                                                                        catch (IllegalStateException v61) {
                                                                                            throw _3N.a(v61);
                                                                                        }
                                                                                    }
                                                                                    v62 = new Object[7];
                                                                                    v62[6] = (double)var59_31;
                                                                                    v62[5] = var55_29;
                                                                                    v62[4] = var71_41;
                                                                                    v62[3] = var38_20;
                                                                                    v62[2] = var53_28;
                                                                                    v62[1] = var49_26;
                                                                                    v62[0] = var47_25;
                                                                                    var83_48 = _3N.c("\u00f5", (Object)v62, (long)1935815447685611040L, (long)var5_4);
                                                                                    v63 = new Object[7];
                                                                                    v63[6] = (double)var61_32;
                                                                                    v63[5] = var24_13;
                                                                                    v63[4] = (double)var57_30;
                                                                                    v63[3] = var71_41;
                                                                                    v63[2] = var53_28;
                                                                                    v63[1] = var49_26;
                                                                                    v63[0] = var51_27;
                                                                                    var85_49 = _3N.c("\u00f5", (Object)v63, (long)1932529264553271899L, (long)var5_4);
                                                                                    var87_50 = (int)_3N.c("\u00f5", (double)var83_48, (long)1934536102226891120L, (long)var5_4);
                                                                                    var88_51 = (int)_3N.c("\u00f5", (double)var85_49, (long)1928846464263387337L, (long)var5_4);
                                                                                    var89_52 = var83_48 - (double)var87_50;
                                                                                    var91_53 = (double)var88_51 - var85_49;
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    cfr_temp_8 = var79_46 - 0.01;
                                                                                                    v64 /* !! */  = cfr_temp_8 == 0.0 ? 0 : (cfr_temp_8 > 0.0 ? 1 : -1);
                                                                                                    if (var40_21 == 0) break block169;
                                                                                                    if (v64 /* !! */  <= 0) break block170;
                                                                                                }
                                                                                                catch (IllegalStateException v65) {
                                                                                                    throw _3N.a(v65);
                                                                                                }
                                                                                                cfr_temp_9 = var79_46 - 0.99;
                                                                                                v64 /* !! */  = cfr_temp_9 == 0.0 ? 0 : (cfr_temp_9 < 0.0 ? -1 : 1);
                                                                                                if (var40_21 == 0) break block169;
                                                                                            }
                                                                                            catch (IllegalStateException v66) {
                                                                                                throw _3N.a(v66);
                                                                                            }
                                                                                            if (var5_4 <= 0L) break block171;
                                                                                            if (v64 /* !! */  >= 0) break block170;
                                                                                        }
                                                                                        catch (IllegalStateException v67) {
                                                                                            throw _3N.a(v67);
                                                                                        }
                                                                                        _3N.c("\u00ed", (Object)var64_34, (int)((int)((double)_3N.c("v", (Object)var21_1, (long)1932593797595137627L, (long)var5_4) * var79_46)), (long)1932593797595137627L, (long)var5_4);
                                                                                        v68 = new Object[6];
                                                                                        v68[5] = var64_34;
                                                                                        v68[4] = var28_15;
                                                                                        v68[3] = 1.0;
                                                                                        v68[2] = 1.0;
                                                                                        v68[1] = (double)var70_40;
                                                                                        v68[0] = (double)(var77_44 - true);
                                                                                        _3N.c("\u00e5", (Object)_3N.c("c", (long)1936009846405433655L, (long)var5_4), (Object)v68, (long)1934421480796975320L, (long)var5_4);
                                                                                    }
                                                                                    catch (IllegalStateException v69) {
                                                                                        throw _3N.a(v69);
                                                                                    }
                                                                                }
                                                                                v70 = var87_50;
                                                                            }
                                                                            v64 /* !! */  = (double)_3N.c("\u00f5", (int)v70, (int)var78_45, (long)1935311530599750352L, (long)var5_4);
                                                                        }
                                                                        var93_54 = v64 /* !! */ ;
                                                                        try {
                                                                            try {
                                                                                v71 /* !! */  = var93_54;
                                                                                v72 = var40_21;
                                                                                if (var5_4 >= 0L) {
                                                                                    if (v72 == 0) break block172;
                                                                                    if (v71 /* !! */  <= var77_44) break block173;
                                                                                }
                                                                                ** GOTO lbl562
                                                                            }
                                                                            catch (IllegalStateException v73) {
                                                                                throw _3N.a(v73);
                                                                            }
                                                                            v74 = new Object[6];
                                                                            v74[5] = var63_33;
                                                                            v74[4] = var28_15;
                                                                            v74[3] = 1.0;
                                                                            v74[2] = var93_54 - var77_44;
                                                                            v74[1] = (double)var70_40;
                                                                            v74[0] = (double)var77_44;
                                                                            _3N.c("\u00e5", (Object)_3N.c("c", (long)1936009846405433655L, (long)var5_4), (Object)v74, (long)1934421480796975320L, (long)var5_4);
                                                                        }
                                                                        catch (IllegalStateException v75) {
                                                                            throw _3N.a(v75);
                                                                        }
                                                                    }
                                                                    v71 /* !! */  = (cfr_temp_10 = var89_52 - 0.01) == 0 ? 0 : (cfr_temp_10 > 0 ? 1 : -1);
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                v72 = var40_21;
lbl562:
                                                                                                // 2 sources

                                                                                                if (v72 == 0) break block174;
                                                                                                if (v71 /* !! */  <= 0) break block175;
                                                                                            }
                                                                                            catch (IllegalStateException v76) {
                                                                                                throw _3N.a(v76);
                                                                                            }
                                                                                            cfr_temp_11 = var89_52 - 0.99;
                                                                                            v71 /* !! */  = cfr_temp_11 == 0 ? 0 : (cfr_temp_11 < 0 ? -1 : 1);
                                                                                            if (var40_21 == 0) break block174;
                                                                                        }
                                                                                        catch (IllegalStateException v77) {
                                                                                            throw _3N.a(v77);
                                                                                        }
                                                                                        if (v71 /* !! */  >= 0) break block175;
                                                                                    }
                                                                                    catch (IllegalStateException v78) {
                                                                                        throw _3N.a(v78);
                                                                                    }
                                                                                    v71 /* !! */  = var87_50;
                                                                                    if (var40_21 == 0) break block174;
                                                                                }
                                                                                catch (IllegalStateException v79) {
                                                                                    throw _3N.a(v79);
                                                                                }
                                                                                if (v71 /* !! */  < var77_44) break block175;
                                                                            }
                                                                            catch (IllegalStateException v80) {
                                                                                throw _3N.a(v80);
                                                                            }
                                                                            v71 /* !! */  = var87_50;
                                                                            v81 = var40_21;
                                                                            if (var5_4 >= 0L) {
                                                                                if (v81 == 0) break block174;
                                                                            }
                                                                            ** GOTO lbl627
                                                                        }
                                                                        catch (IllegalStateException v82) {
                                                                            throw _3N.a(v82);
                                                                        }
                                                                        if (v71 /* !! */  >= var78_45) break block175;
                                                                    }
                                                                    catch (IllegalStateException v83) {
                                                                        throw _3N.a(v83);
                                                                    }
                                                                    _3N.c("\u00ed", (Object)var64_34, (int)((int)((double)_3N.c("v", (Object)var21_1, (long)1932593797595137627L, (long)var5_4) * var89_52)), (long)1932593797595137627L, (long)var5_4);
                                                                    v84 = new Object[6];
                                                                    v84[5] = var64_34;
                                                                    v84[4] = var28_15;
                                                                    v84[3] = 1.0;
                                                                    v84[2] = 1.0;
                                                                    v84[1] = (double)var70_40;
                                                                    v84[0] = (double)var87_50;
                                                                    _3N.c("\u00e5", (Object)_3N.c("c", (long)1936009846405433655L, (long)var5_4), (Object)v84, (long)1934421480796975320L, (long)var5_4);
                                                                }
                                                                catch (IllegalStateException v85) {
                                                                    throw _3N.a(v85);
                                                                }
                                                            }
                                                            v71 /* !! */  = (cfr_temp_12 = var91_53 - 0.01) == 0.0 ? 0 : (cfr_temp_12 > 0.0 ? 1 : -1);
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        v81 = var40_21;
lbl627:
                                                                                        // 2 sources

                                                                                        if (v81 == 0) break block176;
                                                                                        if (v71 /* !! */  <= 0) break block177;
                                                                                    }
                                                                                    catch (IllegalStateException v86) {
                                                                                        throw _3N.a(v86);
                                                                                    }
                                                                                    cfr_temp_13 = var91_53 - 0.99;
                                                                                    v71 /* !! */  = cfr_temp_13 == 0.0 ? 0 : (cfr_temp_13 < 0.0 ? -1 : 1);
                                                                                    if (var40_21 == 0) break block176;
                                                                                }
                                                                                catch (IllegalStateException v87) {
                                                                                    throw _3N.a(v87);
                                                                                }
                                                                                if (var5_4 < 0L) break block178;
                                                                                if (v71 /* !! */  >= 0) break block177;
                                                                            }
                                                                            catch (IllegalStateException v88) {
                                                                                throw _3N.a(v88);
                                                                            }
                                                                            v89 = var88_51 - 1;
                                                                            v90 = var77_44;
                                                                            if (var40_21 == 0) break block179;
                                                                        }
                                                                        catch (IllegalStateException v91) {
                                                                            throw _3N.a(v91);
                                                                        }
                                                                        if (v89 < v90) break block177;
                                                                    }
                                                                    catch (IllegalStateException v92) {
                                                                        throw _3N.a(v92);
                                                                    }
                                                                    v89 = var88_51 - 1;
                                                                    v90 = var78_45;
                                                                    if (var40_21 == 0) break block179;
                                                                }
                                                                catch (IllegalStateException v93) {
                                                                    throw _3N.a(v93);
                                                                }
                                                                if (v89 >= v90) break block177;
                                                            }
                                                            catch (IllegalStateException v94) {
                                                                throw _3N.a(v94);
                                                            }
                                                            _3N.c("\u00ed", (Object)var64_34, (int)((int)((double)_3N.c("v", (Object)var21_1, (long)1932593797595137627L, (long)var5_4) * var91_53)), (long)1932593797595137627L, (long)var5_4);
                                                            v95 = new Object[6];
                                                            v95[5] = var64_34;
                                                            v95[4] = var28_15;
                                                            v95[3] = 1.0;
                                                            v95[2] = 1.0;
                                                            v95[1] = (double)var70_40;
                                                            v95[0] = (double)(var88_51 - 1);
                                                            _3N.c("\u00e5", (Object)_3N.c("c", (long)1936009846405433655L, (long)var5_4), (Object)v95, (long)1934421480796975320L, (long)var5_4);
                                                        }
                                                        catch (IllegalStateException v96) {
                                                            throw _3N.a(v96);
                                                        }
                                                    }
                                                    v89 = var88_51;
                                                }
                                                v90 = var77_44;
                                            }
                                            v71 /* !! */  = (double)_3N.c("\u00f5", (int)v89, (int)v90, (long)1929626663220404045L, (long)var5_4);
                                        }
                                        var94_55 /* !! */  = v71 /* !! */ ;
                                        try {
                                            try {
                                                v42 /* !! */  = var78_45;
                                                v97 = var40_21;
                                                if (var5_4 > 0L) {
                                                    if (v97 == 0) break block180;
                                                    if (v42 /* !! */  <= var94_55 /* !! */ ) break block181;
                                                }
                                                ** GOTO lbl722
                                            }
                                            catch (IllegalStateException v98) {
                                                throw _3N.a(v98);
                                            }
                                            v99 = new Object[6];
                                            v99[5] = var63_33;
                                            v99[4] = var28_15;
                                            v99[3] = 1.0;
                                            v99[2] = (double)(var78_45 - var94_55 /* !! */ );
                                            v99[1] = (double)var70_40;
                                            v99[0] = var94_55 /* !! */ ;
                                            _3N.c("\u00e5", (Object)_3N.c("c", (long)1936009846405433655L, (long)var5_4), (Object)v99, (long)1934421480796975320L, (long)var5_4);
                                        }
                                        catch (IllegalStateException v100) {
                                            throw _3N.a(v100);
                                        }
                                    }
                                    v42 /* !! */  = (cfr_temp_14 = var81_47 - 0.01) == 0 ? 0 : (cfr_temp_14 > 0 ? 1 : -1);
                                }
                                try {
                                    try {
                                        if (var5_4 <= 0L) break block182;
                                        v97 = var40_21;
lbl722:
                                        // 2 sources

                                        if (v97 == 0) break block182;
                                        if (v42 /* !! */  <= 0) break block167;
                                    }
                                    catch (IllegalStateException v101) {
                                        throw _3N.a(v101);
                                    }
                                    cfr_temp_15 = var81_47 - 0.99;
                                    v42 /* !! */  = cfr_temp_15 == 0 ? 0 : (cfr_temp_15 < 0 ? -1 : 1);
                                }
                                catch (IllegalStateException v102) {
                                    throw _3N.a(v102);
                                }
                            }
                            try {
                                if (var5_4 < 0L) break block168;
                                if (v42 /* !! */  < 0) {
                                    _3N.c("\u00ed", (Object)var64_34, (int)((int)((double)_3N.c("v", (Object)var21_1, (long)1932593797595137627L, (long)var5_4) * var81_47)), (long)1932593797595137627L, (long)var5_4);
                                    v103 = new Object[6];
                                    v103[5] = var64_34;
                                    v103[4] = var28_15;
                                    v103[3] = 1.0;
                                    v103[2] = 1.0;
                                    v103[1] = (double)var70_40;
                                    v103[0] = (double)var78_45;
                                    _3N.c("\u00e5", (Object)_3N.c("c", (long)1936009846405433655L, (long)var5_4), (Object)v103, (long)1934421480796975320L, (long)var5_4);
                                }
                            }
                            catch (IllegalStateException v104) {
                                throw _3N.a(v104);
                            }
                        }
                        ++var70_40;
                        v42 /* !! */  = var40_21;
                    }
                    if (v42 /* !! */  != 0) continue;
                }
                if (var5_4 <= 0L) break block184;
                v38 = var69_39;
            }
            try {
                if (v38 == false) {
                    v105 = new Object[1];
                    v105[0] = var30_16;
                    _3N.c("\u00e5", (Object)_3N.c("c", (long)1936009846405433655L, (long)var5_4), (Object)v105, (long)1934581744943185441L, (long)var5_4);
                }
            }
            catch (IllegalStateException v106) {
                throw _3N.a(v106);
            }
        }
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _3N.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _3N.b(classArray[j], string, clazz2);
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
            int n = _3N.a(l2, l3);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                _3N.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _3N.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _3N.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _3N.b(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static int b(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x6FC9;
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
                throw new RuntimeException("dev/krypton/3N", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _3N.f[n2] = n3;
        }
        return f[n2];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/3N" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l2, long l3) {
        int n = _3N.a(l2, l3);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = _3N.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _3N.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _3N.a(clazz3, string2, clazz2)) != null) {
                    _3N.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _3N.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _3N.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _3N.b(3436929519507176L, 0L);
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
            throw new RuntimeException("dev/krypton/3N" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method d(long l2, long l3) {
        int n = _3N.a(l2, l3);
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
                clazz3 = _3N.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _3N.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _3N.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _3N.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _3N.b(3436929519507176L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _3N.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _3N.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _3N.b(3436929519507176L, 0L);
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/3N" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x7A35;
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
                throw new RuntimeException("dev/krypton/3N", exception);
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
            _3N.c[n2] = _3N.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _3N.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "\u001bip>/A\u0006|r\u007f*\u001dLB";
        objectArray[1] = Boolean.TYPE;
        _3N.i[1] = "java/lang/Boolean";
        objectArray[2] = "\u000espx;6{S{w*y\u001a]p|.#n";
        objectArray[3] = Void.TYPE;
        _3N.i[3] = "java/lang/Void";
        objectArray[4] = "Y3?z[\bD&=;^T\u000b\u0018";
        objectArray[5] = "0Iw\u00049sEi|\u000b(<$gw\u0000,fP";
        objectArray[6] = "\u001dBYc.JhbRl?\u0005\tlYg;_}";
        objectArray[7] = "CD\u0012,4.6d\u0019#%aWj\u0012(!;#";
        objectArray[8] = "\u0007T_\nw*rtT\u0005fe\u0013z_\u000eb?g";
        objectArray[9] = "\u001b$8\u000ej\u0014n\u00043\u0001{[\u000f\n8\n\u007f\u0001{";
        objectArray[10] = Integer.TYPE;
        _3N.i[10] = "java/lang/Integer";
        objectArray[11] = ".\u001f)Ps\u00133\n+\u0011vOr8";
        objectArray[12] = "\u001a`)9J\u0010o@\"6[_\u000eN)=_\u0005z";
        objectArray[13] = "?X\u0007\u0012\u001b\u0012Jx\f\u001d\n]+v\u0007\u0016\u000e\u0007_";
        objectArray[14] = " \u001d\u001d9sd+\u0012\fv\u0010i>\u0014";
        objectArray[15] = Double.TYPE;
        _3N.i[15] = "java/lang/Double";
        objectArray[16] = "F\u00147C.H34<L?\u0007R:7G;]&";
        objectArray[17] = "\u001aO)vlioo\"y}&\u000ea)ry|z";
        objectArray[18] = "\u0016\u0005q\u0006%gc%z\t4(\u0002+q\u00020rv";
        objectArray[19] = "E\u0001g\u0007c!0!l\brnQ/g\u0003v4%";
        objectArray[20] = "A&F\u0019|S4\u0006M\u0016m\u001cU\bF\u001diF!";
        objectArray[21] = "uzv\rW\u0012\u0000Z}\u0002F]aTv\tB\u0007\u0015";
        objectArray[22] = "\u0007s<X%\u007frS7W40\u0013]<\\0jg";
        objectArray[23] = "9\u0017\u0005wA)L7\u000exPf-9\u0005sT<Y";
        objectArray[24] = "}uE5\u007fd\bUN:n+i[E1jq\u001d";
        objectArray[25] = "q C2y-l5As|q!\u0011";
        objectArray[26] = "S\u00120(\u000fS&2;'\u001e\u001cG<0,\u001aF3";
        objectArray[27] = "Sl\u0012\"6'&L\u0019-'hGB\u0012&#23";
        objectArray[28] = "\u0014k\u00006O:\t~\u0002wJfH6";
        objectArray[29] = "\u0011coZ\rY\u0018ml\u0013NT\u001emx\u0011SR\\|k\u0004\u0005Z\u001bbgZ2S\u001chg\u00060_\u0002in\u001d\u000eS";
        objectArray[30] = "\u001cFQ\b1R\u001cFFT=]\u0006\rFJ=H\u0001|\u0016\u0013o\t";
        objectArray[31] = "]=V)yPV2Gf\u0013SB>L-";
        objectArray[32] = "ozl\u0007@h\u001aZg\bQ'{Tl\u0003U}\u000f";
        objectArray[33] = "J /)W\u000e?\u0000$&FA^\u000e/-B\u001b*";
        objectArray[34] = "n\u0018$\bms\u001b8/\u0007|<z6$\fxf\u000e";
        objectArray[35] = "]\u00006-\u001a%( =\"\u000bjI.6)\u000f0=";
        objectArray[36] = "F\u0011P\u001f.\u001831[\u0010?WR?P\u001b;\r&";
        objectArray[37] = "!&l\"(e<3nc-9q\u0001";
        objectArray[38] = "\u0018!T$s\u001bm\u0001_+bT\f\u000fT f\u000ex";
        objectArray[39] = "%=2\u0000J\bP\u001d9\u000f[G1\u00132\u0004_\u001dE";
        objectArray[40] = "hs*D\u001bA\u001dS!K\n\u000e|]*@\u000eT\b";
        objectArray[41] = "@n\u0006\u00043`5N\r\u000b\"/T@\u0006\u0000&u ";
        objectArray[42] = "\u0006\u001e|#?Ys>w,.\u0016\u00120|'*Lf";
        objectArray[43] = "|\fnl\u0012?\t,ec\u0003ph\"nh\u0007*\u001c";
        objectArray[44] = "\u0005i<>C&pI71Ri\u0011G<:V3e";
        objectArray[45] = "Q\be\u0003^EQ\br_RJKCrAR_L2\"\u001c\u0003";
        objectArray[46] = "C\\[\u0018qYC\\LD}VY\u0017LZ}C^f\u001d\u0001*";
        objectArray[47] = "\u000bfCu\u0006\u0017~FHz\u0017X\u001fHCq\u0013\u0002k";
        objectArray[48] = "kO)(]B`@8g<LkK<=";
        objectArray[49] = "J':Op\u0018\u0018>h\u0018\f\u0012J<\n\u001b1\u0014@-dCeN\u001eL5\u0019o\u0014B\"mM5J#s7Go\u0016M+c\u001d1w";
        objectArray[50] = "\u0014-'!\u0011y\u001cpi-ng\u001d<v(\u0002UI}-rV\u0002\u00192&3\u0004m\u0014=k?nk\u0002pj%\u0001f\r=fO\u0007p@<| \n\u007f\r0\u0016&\u001c2\f*y+\u0013\u007f\u0000@";
        objectArray[51] = "n{\\J.OdbH2a>>\"\u0005M4G=-\nR";
        objectArray[52] = "\ry0VBS\u0007`$.\nDf`2J\u000fS\r'2S\b\"\\}(U_\u001aWq&H3";
        objectArray[53] = "N\u0013[\u0005S\u001dD\nO}\u001alN\u0013[\u0005S\u001dD\nO";
        objectArray[54] = "\u001f\r+\u0001\"r\u001c\u0002$\u001eI2$Mp\u001auzO\np\u0003r\u000b\u001f\r+\u0001\"r\u001c\u0002$\u001eI";
        objectArray[55] = ".#N/\u0013\u0002$~\u00161-\u0002\u001e'K*N\\p\u007f\u001fp\u0010";
        objectArray[56] = "h'c0r\u0011k(l/\u0019USg8+%\u00198 82\"hiz\"4uPbv,)\u0019";
        objectArray[57] = "y\u0010a7\u0003.z\u001fn(hiBF,x\u0014=-K#5\u0018";
        objectArray[58] = "Tx\r\b |M)W\u001e\u001c!BH\u0016\u0017x\"\\#Q\u0017a%-1Y\u0017g\"O(\bMq\u001e";
        objectArray[59] = "lj_^&?oePAMyW*\u0004Eq7<m\u0004\\vFlj_^&?oePAM";
        objectArray[60] = "\u0000GY\u0019-$\n^MacU\u0011\u001a@\u000369V]V";
        objectArray[61] = ">nP\u0007lF=a_\u0018\u0007\u000f\u0005.\u000b\u001c;Nni\u000b\u0005<??3\u0011\u0003k\u00074?\u001f\u001e\u0007";
        objectArray[62] = "'_{;]\u0000uF)l!\u0004#U/PH\u001d~H!?E\u00123DK9S_2^$4\\\u0012>4";
        objectArray[63] = "\u0013mF) :K*@w\u001c~sxQ'`/\u001cu^jl";
        objectArray[64] = "\u0011\u001fCO5\\\u0012\u0010LP^\u0014*_\u0018TbTA\u0018\u0018Me%P\u001b\u0003R4I\u0017\\\u00150";
        objectArray[65] = "\u001a\t?<T\u0011\u0010\u0010+D\u001f`\u000bT&&O\fL\u00130";
        objectArray[66] = "\u0004_\u0019[\n~VFK\fvt\fR)\u000fKr\u000eUGW\u001f(P4\u0016\r\u0015r\fZNYO,m\u000b\u0014S\u0015p\u0003S@\tK\u0011";
        objectArray[67] = "\u000b(\u0002C+LY1P\u0014W_\u0005\u0019[D6J\u000482A%\u0013\u001e)]L*^\u0012C[Zg_\b,VU*Sb";
        objectArray[68] = ".0/M)B|)}\u001aUH.+\u001fO'\u001d;1pB(P7[vTeQ-4{[(]G2m\u0016)G(?b[%-";
        objectArray[69] = "\n81U\r\u0014\u0000eiK3\u0017\u007f\u00036\u000ePH[mnZ\n\u0016";
        objectArray[70] = "\f@\u00179W%\u0005G\u0002:,iV;\u0004$C>\u001cB\u0001=E8";
        objectArray[71] = "wthi\u000e>|vo1k5hU~\u0014k=a#k8\u00040nngR\u0011olq}>V(z\u0013";
        objectArray[72] = "1'\u00134T7;>\u0007L\u001a\u0006Z>\u0011(\u001971y\u00111\u001eF`#\u000b7I~k/\u0005*%";
        objectArray[73] = "\u007fC\u000ewk\u0007f\u0012TaWZ\u0006\f\u000ehk\u0014mK\u000eqle\u007fC\u000ewk\u0007f\u0012TaW";
        objectArray[74] = "Fv\u0004]A\u001fLo\u0010%\u000f2-o\u0006A\f\u001fF(\u0006X\u000bn\u0017r\u001c^\\V\u001c~\u0012C0";
        objectArray[75] = "^U\u0000R?%TL\u0014*~=5L\u0002Nr%^\u000b\u0002WuT\u000fQ\u0018Q\"l\u0004]\u0016LN";
        objectArray[76] = "lO(\r+nfV<uc\u001fxM*I+t?M3NZvu\u00192\u001f5{zT>u";
        objectArray[77] = "P\u0006W7I\u0016Z\u001fCO\u0004gD\u0004UsI\f\u0003\u0004Lt8]Y\u001eJ#\u0000VU\u0010WO";
        objectArray[78] = "hOc`^.k@l\u007f5fS\u000f8{\t&8H8b\u000eWi\u0012\"dYob\u001e,y5";
        objectArray[79] = "B\u00194w/\u0018\u0010\u0000f S\u0019O\u0015cfS\u001eYBxv<\u0013V\u000ft\u001c:\u0005\u001b\u000ens7\nV\u0002\u0004";
        objectArray[80] = "\u0017tp~\u000f1\u001ese}t|ulxt\u0013?\fiar\u0015";
        objectArray[81] = "g(2QS\u0007?o4\u000foH\u0007=%_\u0013\u0012h0*\u0012\u001f";
        objectArray[82] = "K;9^\u000ek\r/lA`\u007fX<c\\\fM\f}9\u0001`e\u000e=zB\u0012'_z;;";
        objectArray[83] = "j{kK\f58b9\u001cp1dk[I\u0002j\u007fz4D\r's\u00102R@&i\u007f?]\r*\u0003";
        objectArray[84] = "mbGm\u000b>g{S\u0015JOmbGm\u000b>g{S";
        objectArray[85] = "KkrN`\u0015Arf6*d\u001b2+Iz\u001d\u0018=$V";
        objectArray[86] = "\b^d\u0002\u0013\u001d\u0011\u000f>\u0014/Bq\u0011d\u001d\u0013\u000e\u001aVd\u0004\u0014\u007f\b^d\u0002\u0013\u001d\u0011\u000f>\u0014/";
        objectArray[87] = "#!:cKE .5| \u0003\u0018aax\u001cMs&aa\u001b<\"|{gL\u0004)puz ";
        objectArray[88] = "\u007fpL3\u001fN|\u007fC,t\rD0\u0017(HF/w\u00171O7~-\r7\u0018\u000fu!\u0003*t";
        objectArray[89] = "\u0014\u0001W`n@\u001e\u0018C\u0018!1\u0000\u0003U$nZG\u0003L#\u001fX\rWMrpU\u0002\u001aA\u0018";
        objectArray[90] = "e\u0019w<Z;f\u0016x#1z^Y,'\r35\u001e,>\nBdD68]zoH8%1";
        objectArray[91] = "J\u0011#L#US@yZ\u001f\t3^#S#FX\u0019#J$7\tC9Ls\u000f\u0002O7Q\u001f";
        objectArray[92] = "5\u001ebr_U?\u0007v\n\u0011i^\u0007`n\u0012U5@`w\u0015$d\u001azqB\u001co\u0016tl.";
        objectArray[93] = "\u001aE\u0011=\u0010\\H\\CjlV\u0012H!?\u001e\u0003\u000fDN2\u0011N\u0003.H$\\O\u0019AE+\u0011CsGSf\u0010Y\u001cJ\\+\u001c3";
        objectArray[94] = "ac\u0004\u000f\u0001Ox2^\u0019=\u001c\u0018,\u0004\u0010\u0001\\sk\u0004\t\u0006-ac\u0004\u000f\u0001Ox2^\u0019=";
        objectArray[95] = "{A\u0017\u0007\r\u001a#\u0006\u0011Y1\\\u001bT\u0000\tM\u000ftY\u000fDA";
        objectArray[96] = "Co34N}\u0005{f+ iPhi6L[\u0004)4h rF.l?Q4R{sQ";
        objectArray[97] = "|\u007f=rjY.fo%\u0016Mlnq\u0019\u007fD%hgvrKhd\rpd\u0006i~b}kKe\u0014";
        objectArray[98] = "LS:A\u001fMFJ.9RX'J8]RML\r8DU<\u001dW\"B\u0002\u0004\u0016[,_n";
        objectArray[99] = "=j6M\\#>e9R7a\u0006*mV\u000b+mmmO\fZ<7wI[b7;yT7";
        objectArray[100] = "\u001cLoIWOD\u000bi\u0017k\f|YxG\u0017Z\u0013Tw\n\u001b";
        objectArray[101] = "Yk+{z*S6seD.i/wyxd\u0002hw`\u007f\u0015Vmp~%{\u000e9* D";
        objectArray[102] = "\u007fm\u001erK'|b\u0011m gD-Ei\u001c//jEp\u001b^~0_vLfu<Qk ";
        objectArray[103] = "?\u0006o\u0018!\u00156\u0001z\u001bZY\u001a}|\u00055\u000e/\u0004y\u001c3\b";
        objectArray[104] = "\u001e\u0007+\u0018j|L\u001eyO\u0016h\u0016\n\u001b\u001ad#\u000b\u0006t\u0017kn\u0007lr\u0001&o\u001d\u0003\u007f\u000ekcw";
        objectArray[105] = "6J5N\u001bs/\u001boX'(O\u00055Q\u001b`$B5H\u001c\u00116J5N\u001bs/\u001boX'";
        objectArray[106] = "`[vx:\u001bjBb\u0000vjtYt<:\u00013Ym;K\u0003y\rlj$\u000ev@`\u0000";
        objectArray[107] = "ikO -Ec6\u0017>\u0013AYoJ%p\u001b77\u001e\u007f.";
        objectArray[108] = "#H\u0003\u0017\u0007L G\f\bl\t\u0018\bX\fPDsOX\u0015W5\"\u0015B\u0013\u0000\r)\u0019L\u000el";
        objectArray[109] = "\u0007\u0000v8X\n\u0004\u000fy'3O<@-#\u000f\u0002W\u0007-:\bs\u0003\u0002*$R\u001d[Vpz3";
        objectArray[110] = "0/&-\u001c!:r~3\".\u0000+#(A\u007fnswr\u001f";
        objectArray[111] = "g\f\u0018\u0006M\u001cm\u0015\f~\u0006ms\u000e\u001aBM\u00064\u000e\u0003E<Wn\u0014\u0005\u0012\u0004\\b\u001a\u0018~";
        Object[] objectArray2 = objectArray;
        objectArray[112] = "\u0015{eF]2\u001fbq>\u0011C\u0001yg\u0002](Fy~\u0005,9EbaT@~\u0002t\u0003";
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
            case 0 -> 35;
            case 1 -> 15;
            case 2 -> 28;
            case 3 -> 57;
            case 4 -> 44;
            case 5 -> 20;
            case 6 -> 54;
            case 7 -> 53;
            case 8 -> 16;
            case 9 -> 55;
            case 10 -> 31;
            case 11 -> 63;
            case 12 -> 37;
            case 13 -> 58;
            case 14 -> 51;
            case 15 -> 10;
            case 16 -> 48;
            case 17 -> 42;
            case 18 -> 14;
            case 19 -> 23;
            case 20 -> 9;
            case 21 -> 45;
            case 22 -> 49;
            case 23 -> 59;
            case 24 -> 7;
            case 25 -> 18;
            case 26 -> 22;
            case 27 -> 50;
            case 28 -> 33;
            case 29 -> 47;
            case 30 -> 36;
            case 31 -> 26;
            case 32 -> 32;
            case 33 -> 17;
            case 34 -> 3;
            case 35 -> 62;
            case 36 -> 2;
            case 37 -> 8;
            case 38 -> 5;
            case 39 -> 56;
            case 40 -> 40;
            case 41 -> 4;
            case 42 -> 27;
            case 43 -> 1;
            case 44 -> 46;
            case 45 -> 13;
            case 46 -> 24;
            case 47 -> 11;
            case 48 -> 21;
            case 49 -> 38;
            case 50 -> 6;
            case 51 -> 25;
            case 52 -> 60;
            case 53 -> 19;
            case 54 -> 0;
            case 55 -> 29;
            case 56 -> 61;
            case 57 -> 41;
            case 58 -> 12;
            case 59 -> 43;
            case 60 -> 39;
            case 61 -> 52;
            case 62 -> 30;
            default -> 34;
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
        _3N.i[n3] = new String(cArray);
        return n3;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _3N.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'v' || c == '\u00ed' || c == 'c' || c == 'P') {
                field = _3N.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'v' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ed' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'c' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _3N.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
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

    public void cfr_renamed_4(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        long l2 = (Long)objectArray[2];
        double d3 = (Double)objectArray[3];
        double d4 = (Double)objectArray[4];
        _8B b = (_8B)objectArray[5];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x1609A4A18A4DL;
        long l5 = l3 ^ 0x3EB5A5016368L;
        long l6 = l3 ^ 0x675003676CCEL;
        long l7 = l3 ^ 0x306F442E4C08L;
        long l8 = l3 ^ 0x58AC459F9196L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l5;
        objectArray2[1] = (int)_3N.b("f", 18114, (long)(0x4DD228CB3257392L ^ l2));
        objectArray2[0] = 4;
        _3N.c("\u00e5", (Object)_3N.c("v", (Object)this, 6524621806916222594L, (long)l2), (Object)objectArray2, 6525572133803741898L, (long)l2);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = d2;
        objectArray3[1] = d;
        objectArray3[0] = l4;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = b;
        objectArray4[0] = l6;
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l7;
        CallSite callSite = _3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("v", (Object)this, 6524621806916222594L, (long)l2), (Object)objectArray3, 6527097018630597178L, (long)l2), (Object)objectArray4, 6527880456794486871L, (long)l2), (Object)objectArray5, 6521775319714640392L, (long)l2);
        Object[] objectArray6 = new Object[3];
        objectArray6[2] = d2 + d4;
        objectArray6[1] = d;
        objectArray6[0] = l4;
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = b;
        objectArray7[0] = l6;
        Object[] objectArray8 = new Object[1];
        objectArray8[0] = l7;
        CallSite callSite2 = _3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("v", (Object)this, 6524621806916222594L, (long)l2), (Object)objectArray6, 6527097018630597178L, (long)l2), (Object)objectArray7, 6527880456794486871L, (long)l2), (Object)objectArray8, 6521775319714640392L, (long)l2);
        Object[] objectArray9 = new Object[3];
        objectArray9[2] = d2 + d4;
        objectArray9[1] = d + d3;
        objectArray9[0] = l4;
        Object[] objectArray10 = new Object[2];
        objectArray10[1] = b;
        objectArray10[0] = l6;
        Object[] objectArray11 = new Object[1];
        objectArray11[0] = l7;
        CallSite callSite3 = _3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("v", (Object)this, 6524621806916222594L, (long)l2), (Object)objectArray9, 6527097018630597178L, (long)l2), (Object)objectArray10, 6527880456794486871L, (long)l2), (Object)objectArray11, 6521775319714640392L, (long)l2);
        Object[] objectArray12 = new Object[3];
        objectArray12[2] = d2;
        objectArray12[1] = d + d3;
        objectArray12[0] = l4;
        Object[] objectArray13 = new Object[2];
        objectArray13[1] = b;
        objectArray13[0] = l6;
        Object[] objectArray14 = new Object[1];
        objectArray14[0] = l7;
        CallSite callSite4 = _3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("v", (Object)this, 6524621806916222594L, (long)l2), (Object)objectArray12, 6527097018630597178L, (long)l2), (Object)objectArray13, 6527880456794486871L, (long)l2), (Object)objectArray14, 6521775319714640392L, (long)l2);
        Object[] objectArray15 = new Object[3];
        objectArray15[2] = l8;
        objectArray15[1] = (int)callSite2;
        objectArray15[0] = (int)callSite;
        _3N.c("\u00e5", (Object)_3N.c("v", (Object)this, 6524621806916222594L, (long)l2), (Object)objectArray15, 6525695477559492546L, (long)l2);
        Object[] objectArray16 = new Object[3];
        objectArray16[2] = l8;
        objectArray16[1] = (int)callSite3;
        objectArray16[0] = (int)callSite2;
        _3N.c("\u00e5", (Object)_3N.c("v", (Object)this, 6524621806916222594L, (long)l2), (Object)objectArray16, 6525695477559492546L, (long)l2);
        Object[] objectArray17 = new Object[3];
        objectArray17[2] = l8;
        objectArray17[1] = (int)callSite4;
        objectArray17[0] = (int)callSite3;
        _3N.c("\u00e5", (Object)_3N.c("v", (Object)this, 6524621806916222594L, (long)l2), (Object)objectArray17, 6525695477559492546L, (long)l2);
        Object[] objectArray18 = new Object[3];
        objectArray18[2] = l8;
        objectArray18[1] = (int)callSite;
        objectArray18[0] = (int)callSite4;
        _3N.c("\u00e5", (Object)_3N.c("v", (Object)this, 6524621806916222594L, (long)l2), (Object)objectArray18, 6525695477559492546L, (long)l2);
    }

    private static double double_6(Object[] objectArray) {
        double d;
        block14: {
            double d2;
            block15: {
                double d3;
                int n;
                double d4;
                double d5;
                long l2;
                double d6;
                block12: {
                    block13: {
                        d2 = (Double)objectArray[0];
                        double d7 = (Double)objectArray[1];
                        d6 = (Double)objectArray[2];
                        l2 = (Long)objectArray[3];
                        d5 = (Double)objectArray[4];
                        double d8 = (Double)objectArray[5];
                        d4 = (Double)objectArray[6];
                        l2 = a ^ l2;
                        n = _87.cfr_renamed_7();
                        try {
                            try {
                                try {
                                    double d9 = d8 - 0.0;
                                    d3 = d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
                                    if (n == 0) break block12;
                                    if (d3 <= 0) break block13;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw _3N.a(illegalStateException);
                                }
                                double d10 = d5 - (d7 + d8);
                                d3 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
                                if (l2 < 0L || n == 0) break block12;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw _3N.a(illegalStateException);
                            }
                            if (d3 >= 0) break block13;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw _3N.a(illegalStateException);
                        }
                        double d11 = d2 + d8;
                        double d12 = d7 + d8;
                        double d13 = d5 - d12;
                        CallSite callSite = _3N.c("\u00f5", (double)_3N.c("\u00f5", 0.0, (double)(d8 * d8 - d13 * d13), -1433821608580405935L, (long)l2), -1435685881649614765L, (long)l2);
                        return d11 - callSite;
                    }
                    try {
                        d = d4;
                        if (n == 0) break block14;
                        double d14 = d - 0.0;
                        d3 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw _3N.a(illegalStateException);
                    }
                }
                try {
                    try {
                        if (d3 <= 0) break block15;
                        d = d5;
                        if (n == 0) break block14;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw _3N.a(illegalStateException);
                    }
                    if (!(d > d6 - d4)) break block15;
                }
                catch (IllegalStateException illegalStateException) {
                    throw _3N.a(illegalStateException);
                }
                double d15 = d2 + d4;
                double d16 = d6 - d4;
                double d17 = d5 - d16;
                CallSite callSite = _3N.c("\u00f5", (double)_3N.c("\u00f5", 0.0, (double)(d4 * d4 - d17 * d17), -1433821608580405935L, (long)l2), -1435685881649614765L, (long)l2);
                return d15 - callSite;
            }
            d = d2;
        }
        return d;
    }

    public static void void_6(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = a ^ l2) ^ 0x4A04B0041224L;
        _3N.c("P", (_3N)new _3N(false, l3), 7681565693182671219L, (long)l2);
        _3N.c("P", (_3N)new _3N(true, l3), 7674728225017148665L, (long)l2);
    }

    public void cfr_renamed_3(Object[] objectArray) {
        CallSite callSite;
        CallSite callSite2;
        long l2;
        long l3;
        long l4;
        long l5;
        class_12137 class_121372;
        GpuTextureView gpuTextureView;
        String string;
        long l6;
        block17: {
            long l7;
            long l8;
            block18: {
                block19: {
                    int n;
                    long l9;
                    long l10;
                    block16: {
                        CallSite callSite3;
                        long l11;
                        block15: {
                            CallSite callSite4;
                            block13: {
                                long l12;
                                block14: {
                                    l6 = (Long)objectArray[0];
                                    string = (String)objectArray[1];
                                    gpuTextureView = (GpuTextureView)objectArray[2];
                                    class_121372 = (class_12137)objectArray[3];
                                    long l13 = l6 = a ^ l6;
                                    l11 = l13 ^ 0x1C241E70755CL;
                                    l12 = l13 ^ 0x28E44D888B02L;
                                    l10 = l13 ^ 0x20EF43BCEEAFL;
                                    l5 = l13 ^ 0xF83E17BA115L;
                                    l4 = l13 ^ 0x4A0AE2646F78L;
                                    l3 = l13 ^ 0x61480F5EC2B1L;
                                    l2 = l13 ^ 0x75C981A598B9L;
                                    l9 = l13 ^ 0xEE90435C13BL;
                                    n = _87.cfr_renamed_7();
                                    try {
                                        try {
                                            Object[] objectArray2 = new Object[1];
                                            objectArray2[0] = l12;
                                            callSite4 = _3N.c("\u00e5", (Object)_3N.c("v", (Object)this, 4229212164338048703L, (long)l6), (Object)objectArray2, 4230113807954935364L, (long)l6);
                                            if (n == 0) break block13;
                                            if (callSite4 == false) break block14;
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            throw _3N.a(illegalStateException);
                                        }
                                        Object[] objectArray3 = new Object[1];
                                        objectArray3[0] = l11;
                                        _3N.c("\u00e5", (Object)_3N.c("v", (Object)this, 4229212164338048703L, (long)l6), (Object)objectArray3, 4232399315273033078L, (long)l6);
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        throw _3N.a(illegalStateException);
                                    }
                                }
                                try {
                                    callSite3 = _3N.c("v", (Object)this, 4226786771646157848L, (long)l6);
                                    if (n == 0) break block15;
                                    Object[] objectArray4 = new Object[1];
                                    objectArray4[0] = l12;
                                    callSite4 = _3N.c("\u00e5", (Object)callSite3, (Object)objectArray4, 4230113807954935364L, (long)l6);
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw _3N.a(illegalStateException);
                                }
                            }
                            try {
                                if (callSite4 == false) break block16;
                                callSite3 = _3N.c("v", (Object)this, 4226786771646157848L, (long)l6);
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw _3N.a(illegalStateException);
                            }
                        }
                        Object[] objectArray5 = new Object[1];
                        objectArray5[0] = l11;
                        _3N.c("\u00e5", (Object)callSite3, (Object)objectArray5, 4232399315273033078L, (long)l6);
                    }
                    try {
                        try {
                            Object[] objectArray6 = new Object[1];
                            objectArray6[0] = l9;
                            Object[] objectArray7 = new Object[2];
                            objectArray7[1] = l10;
                            objectArray7[0] = _3N.c("\u00e5", (Object)_3N.c("\u00f5", 4232369141797020586L, (long)l6), 4229111710563667761L, (long)l6);
                            callSite2 = _3N.c("\u00e5", (Object)_3N.c("\u00f5", (Object)objectArray6, 4232860198338974489L, (long)l6), (Object)objectArray7, 4229386632706682203L, (long)l6);
                            l8 = 4230560931264142557L;
                            l7 = l6;
                            if (l6 >= 0L) {
                                callSite = _3N.c("c", (long)l8, (long)l7);
                                if (n == 0) break block17;
                                Object[] objectArray8 = new Object[2];
                                objectArray8[1] = l2;
                                objectArray8[0] = callSite;
                                Object[] objectArray9 = new Object[2];
                                objectArray9[1] = l5;
                                objectArray9[0] = _3N.c("v", (Object)this, 4229212164338048703L, (long)l6);
                                Object[] objectArray10 = new Object[1];
                                objectArray10[0] = l3;
                                _3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)callSite2, (Object)objectArray8, 4230592660684718496L, (long)l6), (Object)objectArray9, 4229944518201680131L, (long)l6), (Object)objectArray10, 4229636276907073367L, (long)l6);
                                Object[] objectArray11 = new Object[1];
                                objectArray11[0] = l9;
                                callSite2 = _3N.c("\u00f5", (Object)objectArray11, 4232860198338974489L, (long)l6);
                                l8 = 4232369141797020586L;
                                l7 = l6;
                            }
                            if (l6 < 0L) break block18;
                            Object[] objectArray12 = new Object[2];
                            objectArray12[1] = l10;
                            objectArray12[0] = _3N.c("\u00e5", (Object)_3N.c("\u00f5", (long)l8, (long)l7), 4229111710563667761L, (long)l6);
                            callSite2 = _3N.c("\u00e5", (Object)callSite2, (Object)objectArray12, 4229386632706682203L, (long)l6);
                            if (_3N.c("v", (Object)this, 4230028159204120795L, (long)l6) == false) break block19;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw _3N.a(illegalStateException);
                        }
                        callSite = _3N.c("c", 4229012938088971505L, (long)l6);
                        break block17;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw _3N.a(illegalStateException);
                    }
                }
                l8 = 4232714513721116323L;
                l7 = l6;
            }
            callSite = _3N.c("c", (long)l8, (long)l7);
        }
        Object[] objectArray13 = new Object[2];
        objectArray13[1] = l2;
        objectArray13[0] = callSite;
        Object[] objectArray14 = new Object[2];
        objectArray14[1] = l5;
        objectArray14[0] = _3N.c("v", (Object)this, 4226786771646157848L, (long)l6);
        Object[] objectArray15 = new Object[4];
        objectArray15[3] = class_121372;
        objectArray15[2] = l4;
        objectArray15[1] = gpuTextureView;
        objectArray15[0] = string;
        Object[] objectArray16 = new Object[1];
        objectArray16[0] = l3;
        _3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)callSite2, (Object)objectArray13, 4230592660684718496L, (long)l6), (Object)objectArray14, 4229944518201680131L, (long)l6), (Object)objectArray15, 4227417534740755642L, (long)l6), (Object)objectArray16, 4229636276907073367L, (long)l6);
    }

    public static void cfr_renamed_3(_4w[] wArray) {
        cfr_renamed_8 = wArray;
    }

    public void cfr_renamed_6(Object[] objectArray) {
        _3N n;
        long l2;
        long l3;
        class_12137 class_121372;
        GpuTextureView gpuTextureView;
        block4: {
            block5: {
                gpuTextureView = (GpuTextureView)objectArray[0];
                class_121372 = (class_12137)objectArray[1];
                l3 = (Long)objectArray[2];
                l2 = (l3 = a ^ l3) ^ 0x6365EECE08C5L;
                int n2 = _87.cfr_renamed_5();
                try {
                    try {
                        n = this;
                        if (n2 != 0) break block4;
                        if (_3N.c("v", (Object)n, 3108992304639756618L, (long)l3) != false) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw _3N.a(illegalStateException);
                    }
                    throw new IllegalStateException((String)((Object)_3N.a("g", 22277, (long)(0x6FF7EC3182548604L ^ l3))));
                }
                catch (IllegalStateException illegalStateException) {
                    throw _3N.a(illegalStateException);
                }
            }
            n = this;
        }
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = class_121372;
        objectArray2[2] = gpuTextureView;
        objectArray2[1] = _3N.a("g", 14320, (long)(0x39333475BDA66F0L ^ l3));
        objectArray2[0] = l2;
        _3N.c("\u00e5", (Object)n, (Object)objectArray2, 3111662806294738526L, (long)l3);
    }

    public void cfr_renamed_7(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        double d3 = (Double)objectArray[2];
        double d4 = (Double)objectArray[3];
        long l2 = (Long)objectArray[4];
        _8B b = (_8B)objectArray[5];
        long l3 = (l2 = a ^ l2) ^ 0x6E6E6BA6CCD1L;
        Object[] objectArray2 = new Object[9];
        objectArray2[8] = b;
        objectArray2[7] = b;
        objectArray2[6] = b;
        objectArray2[5] = b;
        objectArray2[4] = d4;
        objectArray2[3] = l3;
        objectArray2[2] = d3;
        objectArray2[1] = d2;
        objectArray2[0] = d;
        _3N.c("\u00e5", (Object)this, (Object)objectArray2, -5262470605309781744L, (long)l2);
    }

    public void void_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        double d = (Double)objectArray[1];
        double d2 = (Double)objectArray[2];
        double d3 = (Double)objectArray[3];
        double d4 = (Double)objectArray[4];
        _8B b = (_8B)objectArray[5];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x251E32823220L;
        long l5 = l3 ^ 0x67C954F85DA5L;
        long l6 = l3 ^ 0x19FD22BE7031L;
        long l7 = l3 ^ 0x54479544D4A3L;
        long l8 = l3 ^ 0x378D20DF465L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l6;
        _3N.c("\u00e5", (Object)_3N.c("v", (Object)this, -2091761757804901304L, (long)l2), (Object)objectArray2, -2094359568124695550L, (long)l2);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = d2;
        objectArray3[1] = d;
        objectArray3[0] = l4;
        Object[] objectArray4 = new Object[3];
        objectArray4[2] = 0.0;
        objectArray4[1] = 0.0;
        objectArray4[0] = l4;
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = b;
        objectArray5[0] = l7;
        Object[] objectArray6 = new Object[1];
        objectArray6[0] = l8;
        Object[] objectArray7 = new Object[3];
        objectArray7[2] = d2 + d4;
        objectArray7[1] = d;
        objectArray7[0] = l4;
        Object[] objectArray8 = new Object[3];
        objectArray8[2] = 1.0;
        objectArray8[1] = 0.0;
        objectArray8[0] = l4;
        Object[] objectArray9 = new Object[2];
        objectArray9[1] = b;
        objectArray9[0] = l7;
        Object[] objectArray10 = new Object[1];
        objectArray10[0] = l8;
        Object[] objectArray11 = new Object[3];
        objectArray11[2] = d2 + d4;
        objectArray11[1] = d + d3;
        objectArray11[0] = l4;
        Object[] objectArray12 = new Object[3];
        objectArray12[2] = 1.0;
        objectArray12[1] = 1.0;
        objectArray12[0] = l4;
        Object[] objectArray13 = new Object[2];
        objectArray13[1] = b;
        objectArray13[0] = l7;
        Object[] objectArray14 = new Object[1];
        objectArray14[0] = l8;
        Object[] objectArray15 = new Object[3];
        objectArray15[2] = d2;
        objectArray15[1] = d + d3;
        objectArray15[0] = l4;
        Object[] objectArray16 = new Object[3];
        objectArray16[2] = 0.0;
        objectArray16[1] = 1.0;
        objectArray16[0] = l4;
        Object[] objectArray17 = new Object[2];
        objectArray17[1] = b;
        objectArray17[0] = l7;
        Object[] objectArray18 = new Object[1];
        objectArray18[0] = l8;
        Object[] objectArray19 = new Object[5];
        objectArray19[4] = (int)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("v", (Object)this, -2091761757804901304L, (long)l2), (Object)objectArray15, -2091399485625249193L, (long)l2), (Object)objectArray16, -2091399485625249193L, (long)l2), (Object)objectArray17, -2091214319830138822L, (long)l2), (Object)objectArray18, -2094399162679063963L, (long)l2);
        objectArray19[3] = (int)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("v", (Object)this, -2091761757804901304L, (long)l2), (Object)objectArray11, -2091399485625249193L, (long)l2), (Object)objectArray12, -2091399485625249193L, (long)l2), (Object)objectArray13, -2091214319830138822L, (long)l2), (Object)objectArray14, -2094399162679063963L, (long)l2);
        objectArray19[2] = (int)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("v", (Object)this, -2091761757804901304L, (long)l2), (Object)objectArray7, -2091399485625249193L, (long)l2), (Object)objectArray8, -2091399485625249193L, (long)l2), (Object)objectArray9, -2091214319830138822L, (long)l2), (Object)objectArray10, -2094399162679063963L, (long)l2);
        objectArray19[1] = (int)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("v", (Object)this, -2091761757804901304L, (long)l2), (Object)objectArray3, -2091399485625249193L, (long)l2), (Object)objectArray4, -2091399485625249193L, (long)l2), (Object)objectArray5, -2091214319830138822L, (long)l2), (Object)objectArray6, -2094399162679063963L, (long)l2);
        objectArray19[0] = l5;
        _3N.c("\u00e5", (Object)_3N.c("v", (Object)this, -2091761757804901304L, (long)l2), (Object)objectArray19, -2091264524698335251L, (long)l2);
    }

    private static double double_5(Object[] objectArray) {
        double d;
        block14: {
            double d2;
            block15: {
                double d3;
                int n;
                double d4;
                long l2;
                double d5;
                double d6;
                block12: {
                    block13: {
                        d2 = (Double)objectArray[0];
                        double d7 = (Double)objectArray[1];
                        d6 = (Double)objectArray[2];
                        d5 = (Double)objectArray[3];
                        double d8 = (Double)objectArray[4];
                        l2 = (Long)objectArray[5];
                        d4 = (Double)objectArray[6];
                        l2 = a ^ l2;
                        n = _87.cfr_renamed_7();
                        try {
                            try {
                                try {
                                    double d9 = d8 - 0.0;
                                    d3 = d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
                                    if (n == 0) break block12;
                                    if (d3 <= 0) break block13;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw _3N.a(illegalStateException);
                                }
                                double d10 = d5 - (d7 + d8);
                                d3 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
                                if (l2 <= 0L || n == 0) break block12;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw _3N.a(illegalStateException);
                            }
                            if (d3 >= 0) break block13;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw _3N.a(illegalStateException);
                        }
                        double d11 = d2 - d8;
                        double d12 = d7 + d8;
                        double d13 = d5 - d12;
                        CallSite callSite = _3N.c("\u00f5", (double)_3N.c("\u00f5", 0.0, (double)(d8 * d8 - d13 * d13), 1284659410361964703L, (long)l2), 1287298827309469085L, (long)l2);
                        return d11 + callSite;
                    }
                    try {
                        d = d4;
                        if (n == 0) break block14;
                        double d14 = d - 0.0;
                        d3 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw _3N.a(illegalStateException);
                    }
                }
                try {
                    try {
                        if (d3 <= 0) break block15;
                        d = d5;
                        if (n == 0) break block14;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw _3N.a(illegalStateException);
                    }
                    if (!(d > d6 - d4)) break block15;
                }
                catch (IllegalStateException illegalStateException) {
                    throw _3N.a(illegalStateException);
                }
                double d15 = d2 - d4;
                double d16 = d6 - d4;
                double d17 = d5 - d16;
                CallSite callSite = _3N.c("\u00f5", (double)_3N.c("\u00f5", 0.0, (double)(d4 * d4 - d17 * d17), 1284659410361964703L, (long)l2), 1287298827309469085L, (long)l2);
                return d15 + callSite;
            }
            d = d2;
        }
        return d;
    }

    public boolean boolean_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (boolean)_3N.c("v", (Object)this, 5094753395817294300L, (long)l2);
    }

    public static _4w[] cfr_renamed_9() {
        return cfr_renamed_8;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void cfr_renamed_9(Object[] var0) {
        block75: {
            block66: {
                block64: {
                    block65: {
                        block62: {
                            block63: {
                                block74: {
                                    block61: {
                                        block60: {
                                            block58: {
                                                block59: {
                                                    block56: {
                                                        block57: {
                                                            block54: {
                                                                block55: {
                                                                    var19_1 = (Integer)var0[0];
                                                                    var1_2 = (Double)var0[1];
                                                                    var3_3 = (Long)var0[2];
                                                                    var5_4 = (Double)var0[3];
                                                                    var7_5 = (Double)var0[4];
                                                                    var9_6 = (Double)var0[5];
                                                                    var11_7 /* !! */  = (Double)var0[6];
                                                                    var13_8 /* !! */  = (Double)var0[7];
                                                                    var15_9 /* !! */  = (Double)var0[8];
                                                                    var17_10 /* !! */  = (Double)var0[9];
                                                                    v0 = var3_3 = _3N.a ^ var3_3;
                                                                    var20_11 = v0 ^ 82088385334843L;
                                                                    var22_12 = v0 ^ 92813685312586L;
                                                                    var24_13 = v0 ^ 118806749243675L;
                                                                    var26_14 = v0 ^ 120120382973080L;
                                                                    var28_15 = v0 ^ 70798134740212L;
                                                                    var30_16 = v0 ^ 95564097816365L;
                                                                    var32_17 = v0 ^ 101387076835653L;
                                                                    var34_18 = v0 ^ 77593679868917L;
                                                                    var36_19 = _87.cfr_renamed_5();
                                                                    var37_20 = var19_1 >> _3N.b("f", (int)6924, (long)(3916432036146164334L ^ var3_3)) & _3N.b("f", (int)5641, (long)(451171042293661545L ^ var3_3));
                                                                    try {
                                                                        v1 = var37_20;
                                                                        if (var36_19 != 0) break block54;
                                                                        if (v1 != 0) break block55;
                                                                    }
                                                                    catch (IllegalStateException v2) {
                                                                        throw _3N.a(v2);
                                                                    }
                                                                    return;
                                                                }
                                                                v1 = var7_5 == var1_2 ? 0 : (var7_5 < var1_2 ? -1 : 1);
                                                            }
                                                            try {
                                                                if (var36_19 != 0) break block56;
                                                                if (v1 >= 0) break block57;
                                                            }
                                                            catch (IllegalStateException v3) {
                                                                throw _3N.a(v3);
                                                            }
                                                            var38_21 = var1_2;
                                                            var1_2 = var7_5;
                                                            var7_5 = var38_21;
                                                        }
                                                        try {
                                                            v4 = var9_6;
                                                            if (var3_3 < 0L) break block58;
                                                            v5 = var5_4;
                                                            if (var36_19 != 0) break block59;
                                                            cfr_temp_0 = v4 - v5;
                                                            v1 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                                                        }
                                                        catch (IllegalStateException v6) {
                                                            throw _3N.a(v6);
                                                        }
                                                    }
                                                    if (v1 < 0) {
                                                        var38_21 = var5_4;
                                                        var5_4 = var9_6;
                                                        var9_6 = var38_21;
                                                    }
                                                    v7 = var7_5;
                                                    v5 = var1_2;
                                                }
                                                v4 = v7 - v5;
                                            }
                                            var38_21 = v4;
                                            var40_22 = var9_6 - var5_4;
                                            try {
                                                try {
                                                    try {
                                                        cfr_temp_1 = var38_21 - 0.0;
                                                        v8 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                                                        if (var36_19 != 0) break block60;
                                                        if (v8 <= 0) break block61;
                                                    }
                                                    catch (IllegalStateException v9) {
                                                        throw _3N.a(v9);
                                                    }
                                                    v10 = var40_22;
                                                    if (var3_3 <= 0L) break block62;
                                                    v11 = 0.0;
                                                    if (var36_19 != 0) break block63;
                                                }
                                                catch (IllegalStateException v12) {
                                                    throw _3N.a(v12);
                                                }
                                                cfr_temp_2 = v10 - v11;
                                                v8 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 < 0.0 ? -1 : 1);
                                            }
                                            catch (IllegalStateException v13) {
                                                throw _3N.a(v13);
                                            }
                                        }
                                        if (v8 > 0) break block74;
                                    }
                                    return;
                                }
                                v14 = _3N.c("\u00f5", (double)var38_21, (double)var40_22, (long)5097298626657337807L, (long)var3_3);
                                v11 = 2.0;
                            }
                            v10 = (double)(v14 / v11);
                        }
                        var42_23 = v10;
                        v15 = new Object[3];
                        v15[2] = var42_23;
                        v15[1] = var11_7 /* !! */ ;
                        v15[0] = var22_12;
                        var11_7 /* !! */  = (double)_3N.c("\u00f5", (Object)v15, (long)5096222006464428521L, (long)var3_3);
                        v16 = new Object[3];
                        v16[2] = var42_23;
                        v16[1] = var13_8 /* !! */ ;
                        v16[0] = var22_12;
                        var13_8 /* !! */  = (double)_3N.c("\u00f5", (Object)v16, (long)5096222006464428521L, (long)var3_3);
                        v17 = new Object[3];
                        v17[2] = var42_23;
                        v17[1] = var15_9 /* !! */ ;
                        v17[0] = var22_12;
                        var15_9 /* !! */  = (double)_3N.c("\u00f5", (Object)v17, (long)5096222006464428521L, (long)var3_3);
                        v18 = new Object[3];
                        v18[2] = var42_23;
                        v18[1] = var17_10 /* !! */ ;
                        v18[0] = var22_12;
                        var17_10 /* !! */  = (double)_3N.c("\u00f5", (Object)v18, (long)5096222006464428521L, (long)var3_3);
                        var44_24 = var19_1 >> _3N.b("f", (int)7160, (long)(5285975323242345117L ^ var3_3)) & _3N.b("f", (int)12125, (long)(6536603670109357620L ^ var3_3));
                        var45_25 = var19_1 >> _3N.b("f", (int)25608, (long)(3470195812625861986L ^ var3_3)) & _3N.b("f", (int)12125, (long)(6536603670109357620L ^ var3_3));
                        var46_26 = var19_1 & _3N.b("f", (int)12125, (long)(6536603670109357620L ^ var3_3));
                        var47_27 = new _8B(var44_24, var45_25, var28_15, var46_26, var37_20);
                        var48_28 = new _8B(var44_24, var45_25, var28_15, var46_26, var37_20);
                        var49_29 = (int)_3N.c("\u00f5", (double)var5_4, (long)5090703894128993448L, (long)var3_3);
                        var50_30 = (int)_3N.c("\u00f5", (double)var9_6, (long)5096291156657523985L, (long)var3_3);
                        v19 = new Object[1];
                        v19[0] = var32_17;
                        var51_31 = _3N.c("\u00e5", (Object)_3N.c("c", (long)5097904530818454870L, (long)var3_3), (Object)v19, (long)5095396362158810436L, (long)var3_3);
                        try {
                            try {
                                v20 = var51_31;
                                if (var36_19 != 0) break block64;
                                if (v20 != false) break block65;
                            }
                            catch (IllegalStateException v21) {
                                throw _3N.a(v21);
                            }
                            v22 = new Object[1];
                            v22[0] = var30_16;
                            _3N.c("\u00e5", (Object)_3N.c("c", (long)5097904530818454870L, (long)var3_3), (Object)v22, (long)5096096888446134956L, (long)var3_3);
                        }
                        catch (IllegalStateException v23) {
                            throw _3N.a(v23);
                        }
                    }
                    v20 = var52_32 = (reference)var49_29;
                }
                while (var52_32 < var50_30) {
                    block71: {
                        block72: {
                            block73: {
                                block69: {
                                    block70: {
                                        block67: {
                                            block68: {
                                                var53_33 = (double)var52_32 + 0.5;
                                                v24 = new Object[7];
                                                v24[6] = var15_9 /* !! */ ;
                                                v24[5] = var11_7 /* !! */ ;
                                                v24[4] = var53_33;
                                                v24[3] = var34_18;
                                                v24[2] = var9_6;
                                                v24[1] = var5_4;
                                                v24[0] = var1_2;
                                                var55_34 = _3N.c("\u00f5", (Object)v24, (long)5096973613881221697L, (long)var3_3);
                                                v25 = new Object[7];
                                                v25[6] = var17_10 /* !! */ ;
                                                v25[5] = var20_11;
                                                v25[4] = var13_8 /* !! */ ;
                                                v25[3] = var53_33;
                                                v25[2] = var9_6;
                                                v25[1] = var5_4;
                                                v25[0] = var7_5;
                                                var57_35 = _3N.c("\u00f5", (Object)v25, (long)5093794083354246714L, (long)var3_3);
                                                try {
                                                    try {
                                                        v26 = var57_35 == var55_34 ? 0 : (var57_35 < var55_34 ? -1 : 1);
                                                        if (var3_3 < 0L || var36_19 != 0) break block66;
                                                        if (var36_19 != 0) break block67;
                                                    }
                                                    catch (IllegalStateException v27) {
                                                        throw _3N.a(v27);
                                                    }
                                                    if (v26 > 0) break block68;
                                                }
                                                catch (IllegalStateException v28) {
                                                    throw _3N.a(v28);
                                                }
                                                if (var3_3 >= 0L) break block73;
                                            }
                                            v29 = (int)_3N.c("\u00f5", (double)var55_34, (long)5090703894128993448L, (long)var3_3);
                                        }
                                        var59_36 = v29;
                                        var60_37 = (int)_3N.c("\u00f5", (double)var57_35, (long)5096291156657523985L, (long)var3_3);
                                        var61_38 = (double)var59_36 - var55_34;
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        cfr_temp_3 = var61_38 - 0.01;
                                                        v30 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 > 0.0 ? 1 : -1);
                                                        if (var36_19 != 0) break block69;
                                                        if (v30 <= 0) break block70;
                                                    }
                                                    catch (IllegalStateException v31) {
                                                        throw _3N.a(v31);
                                                    }
                                                    cfr_temp_4 = var61_38 - 0.99;
                                                    v30 = cfr_temp_4 == 0.0 ? 0 : (cfr_temp_4 < 0.0 ? -1 : 1);
                                                    v32 = var36_19;
                                                    if (var3_3 > 0L) {
                                                        if (v32 != 0) break block69;
                                                    }
                                                    ** GOTO lbl260
                                                }
                                                catch (IllegalStateException v33) {
                                                    throw _3N.a(v33);
                                                }
                                                if (v30 >= 0) break block70;
                                            }
                                            catch (IllegalStateException v34) {
                                                throw _3N.a(v34);
                                            }
                                            _3N.c("\u00ed", (Object)var48_28, (int)((int)((double)var37_20 * var61_38)), (long)5093712235115993658L, (long)var3_3);
                                            v35 = new Object[6];
                                            v35[5] = var48_28;
                                            v35[4] = var24_13;
                                            v35[3] = 1.0;
                                            v35[2] = 1.0;
                                            v35[1] = (double)var52_32;
                                            v35[0] = (double)(var59_36 - true);
                                            _3N.c("\u00e5", (Object)_3N.c("c", (long)5097904530818454870L, (long)var3_3), (Object)v35, (long)5096106162242694329L, (long)var3_3);
                                        }
                                        catch (IllegalStateException v36) {
                                            throw _3N.a(v36);
                                        }
                                    }
                                    v30 = var60_37;
                                }
                                try {
                                    v32 = var59_36;
lbl260:
                                    // 2 sources

                                    if (v30 > v32) {
                                        v37 = new Object[6];
                                        v37[5] = var47_27;
                                        v37[4] = var24_13;
                                        v37[3] = 1.0;
                                        v37[2] = (double)(var60_37 - var59_36);
                                        v37[1] = (double)var52_32;
                                        v37[0] = (double)var59_36;
                                        _3N.c("\u00e5", (Object)_3N.c("c", (long)5097904530818454870L, (long)var3_3), (Object)v37, (long)5096106162242694329L, (long)var3_3);
                                    }
                                }
                                catch (IllegalStateException v38) {
                                    throw _3N.a(v38);
                                }
                                var63_39 = var57_35 - (double)var60_37;
                                try {
                                    try {
                                        try {
                                            v39 = var36_19;
                                            if (var3_3 < 0L) break block71;
                                            if (v39 != 0) break block72;
                                            if (!(var63_39 > 0.01)) break block73;
                                        }
                                        catch (IllegalStateException v40) {
                                            throw _3N.a(v40);
                                        }
                                        if (!(var63_39 < 0.99)) break block73;
                                    }
                                    catch (IllegalStateException v41) {
                                        throw _3N.a(v41);
                                    }
                                    _3N.c("\u00ed", (Object)var48_28, (int)((int)((double)var37_20 * var63_39)), (long)5093712235115993658L, (long)var3_3);
                                    v42 = new Object[6];
                                    v42[5] = var48_28;
                                    v42[4] = var24_13;
                                    v42[3] = 1.0;
                                    v42[2] = 1.0;
                                    v42[1] = (double)var52_32;
                                    v42[0] = (double)var60_37;
                                    _3N.c("\u00e5", (Object)_3N.c("c", (long)5097904530818454870L, (long)var3_3), (Object)v42, (long)5096106162242694329L, (long)var3_3);
                                }
                                catch (IllegalStateException v43) {
                                    throw _3N.a(v43);
                                }
                            }
                            ++var52_32;
                        }
                        v39 = var36_19;
                    }
                    if (v39 == 0) continue;
                }
                if (var3_3 < 0L) break block75;
                v26 = var51_31;
            }
            try {
                if (v26 == false) {
                    v44 = new Object[1];
                    v44[0] = var26_14;
                    _3N.c("\u00e5", (Object)_3N.c("c", (long)5097904530818454870L, (long)var3_3), (Object)v44, (long)5095946413492494912L, (long)var3_3);
                }
            }
            catch (IllegalStateException v45) {
                throw _3N.a(v45);
            }
        }
    }

    public void cfr_renamed_0(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        long l2 = (Long)objectArray[2];
        double d3 = (Double)objectArray[3];
        double d4 = (Double)objectArray[4];
        _4t_0 t_0 = (_4t_0)objectArray[5];
        _8B b = (_8B)objectArray[6];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x24E2977161BCL;
        long l5 = l3 ^ 0x6635F10B0E39L;
        long l6 = l3 ^ 0x1801874D23ADL;
        long l7 = l3 ^ 0x55BB30B7873FL;
        long l8 = l3 ^ 0x28477FEA7F9L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l6;
        _3N.c("\u00e5", (Object)_3N.c("v", (Object)this, -5664243830351093804L, (long)l2), (Object)objectArray2, -5660084730497859682L, (long)l2);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = d2;
        objectArray3[1] = d;
        objectArray3[0] = l4;
        Object[] objectArray4 = new Object[3];
        objectArray4[2] = (double)_3N.c("v", (Object)t_0, -5660641298675529681L, (long)l2);
        objectArray4[1] = (double)_3N.c("v", (Object)t_0, -5663407254093735583L, (long)l2);
        objectArray4[0] = l4;
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = b;
        objectArray5[0] = l7;
        Object[] objectArray6 = new Object[1];
        objectArray6[0] = l8;
        Object[] objectArray7 = new Object[3];
        objectArray7[2] = d2 + d4;
        objectArray7[1] = d;
        objectArray7[0] = l4;
        Object[] objectArray8 = new Object[3];
        objectArray8[2] = (double)_3N.c("v", (Object)t_0, -5656629523366781189L, (long)l2);
        objectArray8[1] = (double)_3N.c("v", (Object)t_0, -5663407254093735583L, (long)l2);
        objectArray8[0] = l4;
        Object[] objectArray9 = new Object[2];
        objectArray9[1] = b;
        objectArray9[0] = l7;
        Object[] objectArray10 = new Object[1];
        objectArray10[0] = l8;
        Object[] objectArray11 = new Object[3];
        objectArray11[2] = d2 + d4;
        objectArray11[1] = d + d3;
        objectArray11[0] = l4;
        Object[] objectArray12 = new Object[3];
        objectArray12[2] = (double)_3N.c("v", (Object)t_0, -5656629523366781189L, (long)l2);
        objectArray12[1] = (double)_3N.c("v", (Object)t_0, -5657629129653826666L, (long)l2);
        objectArray12[0] = l4;
        Object[] objectArray13 = new Object[2];
        objectArray13[1] = b;
        objectArray13[0] = l7;
        Object[] objectArray14 = new Object[1];
        objectArray14[0] = l8;
        Object[] objectArray15 = new Object[3];
        objectArray15[2] = d2;
        objectArray15[1] = d + d3;
        objectArray15[0] = l4;
        Object[] objectArray16 = new Object[3];
        objectArray16[2] = (double)_3N.c("v", (Object)t_0, -5660641298675529681L, (long)l2);
        objectArray16[1] = (double)_3N.c("v", (Object)t_0, -5657629129653826666L, (long)l2);
        objectArray16[0] = l4;
        Object[] objectArray17 = new Object[2];
        objectArray17[1] = b;
        objectArray17[0] = l7;
        Object[] objectArray18 = new Object[1];
        objectArray18[0] = l8;
        Object[] objectArray19 = new Object[5];
        objectArray19[4] = (int)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("v", (Object)this, -5664243830351093804L, (long)l2), (Object)objectArray15, -5663880424319090229L, (long)l2), (Object)objectArray16, -5663880424319090229L, (long)l2), (Object)objectArray17, -5663696152933706842L, (long)l2), (Object)objectArray18, -5660124290514626055L, (long)l2);
        objectArray19[3] = (int)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("v", (Object)this, -5664243830351093804L, (long)l2), (Object)objectArray11, -5663880424319090229L, (long)l2), (Object)objectArray12, -5663880424319090229L, (long)l2), (Object)objectArray13, -5663696152933706842L, (long)l2), (Object)objectArray14, -5660124290514626055L, (long)l2);
        objectArray19[2] = (int)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("v", (Object)this, -5664243830351093804L, (long)l2), (Object)objectArray7, -5663880424319090229L, (long)l2), (Object)objectArray8, -5663880424319090229L, (long)l2), (Object)objectArray9, -5663696152933706842L, (long)l2), (Object)objectArray10, -5660124290514626055L, (long)l2);
        objectArray19[1] = (int)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("\u00e5", (Object)_3N.c("v", (Object)this, -5664243830351093804L, (long)l2), (Object)objectArray3, -5663880424319090229L, (long)l2), (Object)objectArray4, -5663880424319090229L, (long)l2), (Object)objectArray5, -5663696152933706842L, (long)l2), (Object)objectArray6, -5660124290514626055L, (long)l2);
        objectArray19[0] = l5;
        _3N.c("\u00e5", (Object)_3N.c("v", (Object)this, -5664243830351093804L, (long)l2), (Object)objectArray19, -5663747113603197839L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_3N.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_3N.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_3N.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

