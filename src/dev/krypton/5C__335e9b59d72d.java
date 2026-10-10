/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1657
 *  net.minecraft.class_243
 *  net.minecraft.class_742
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._3i_0;
import dev.krypton._3s;
import dev.krypton._40;
import dev.krypton._4r;
import dev.krypton._4w;
import dev.krypton._66;
import dev.krypton._6e_0;
import dev.krypton._6x_0;
import dev.krypton._82;
import dev.krypton._95;
import dev.krypton._9E;
import dev.krypton._9o;
import dev.krypton._9r;
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
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_742;

public class _5C
extends _6x_0 {
    private final _9E cfr_renamed_71;
    private final _6e_0 cfr_renamed_1;
    private final _9r cfr_renamed_9;
    private _82 cfr_renamed_105;
    private class_1657 cfr_renamed_3;
    private class_243 cfr_renamed_96;
    private class_243 cfr_renamed_0;
    private int cfr_renamed_6;
    private float cfr_renamed_7;
    private float cfr_renamed_2;
    private float cfr_renamed_4;
    private boolean cfr_renamed_8;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    @Override
    public native void cfr_renamed_5();

    private static boolean cfr_renamed_5(int n, int n2, short s, class_742 class_7422) {
        Object object;
        block8: {
            block7: {
                _4w[] wArray;
                block6: {
                    long l2 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)s << 48 >>> 48) ^ b;
                    wArray = _3s.cfr_renamed_5();
                    try {
                        try {
                            object = _5C.c("\u00d0", (Object)class_7422, 4679427548571722381L, (long)l2);
                            if (wArray != null) break block6;
                            if (object != false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw _5C.a(matchException);
                        }
                        object = _5C.c("\u00d0", (Object)class_7422, 4682246908188812275L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw _5C.a(matchException);
                    }
                }
                try {
                    if (wArray != null) break block8;
                    if (object != false) break block7;
                }
                catch (MatchException matchException) {
                    throw _5C.a(matchException);
                }
                object = true;
                break block8;
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Exception decompiling
     */
    private class_1657 net_minecraft_class_1657_1(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[TRYBLOCK]], but top level block is 5[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void cfr_renamed_187(Object[] var1_1) {
        block124: {
            block122: {
                block123: {
                    block120: {
                        block121: {
                            block118: {
                                block126: {
                                    block119: {
                                        block117: {
                                            block109: {
                                                block114: {
                                                    block115: {
                                                        block125: {
                                                            block116: {
                                                                block113: {
                                                                    block110: {
                                                                        block112: {
                                                                            block111: {
                                                                                block108: {
                                                                                    block104: {
                                                                                        block107: {
                                                                                            block105: {
                                                                                                block106: {
                                                                                                    block102: {
                                                                                                        block103: {
                                                                                                            block100: {
                                                                                                                block101: {
                                                                                                                    block99: {
                                                                                                                        block98: {
                                                                                                                            block97: {
                                                                                                                                block96: {
                                                                                                                                    block95: {
                                                                                                                                        block93: {
                                                                                                                                            block94: {
                                                                                                                                                var2_2 = (Long)var1_1[0];
                                                                                                                                                v0 = var2_2 = _5C.b ^ var2_2;
                                                                                                                                                var4_3 = v0 ^ 80947735859534L;
                                                                                                                                                var6_4 = v0 ^ 100326799953442L;
                                                                                                                                                var8_5 = v0 ^ 78800747797588L;
                                                                                                                                                var10_6 = v0 ^ 45162811046471L;
                                                                                                                                                var12_7 = v0 ^ 10654528011804L;
                                                                                                                                                var14_8 = v0 ^ 91709018410451L;
                                                                                                                                                var16_9 = v0 ^ 92270577584264L;
                                                                                                                                                var18_10 = _3s.cfr_renamed_5();
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        v1 = _5C.c("\u00d0", (Object)_5C.c("\u00f4", (Object)_5C.c("\u00f4", (Object)this, (long)5089070718891530584L, (long)var2_2), (long)5087005634397906278L, (long)var2_2), (long)5092152955243109024L, (long)var2_2);
                                                                                                                                                        if (var18_10 != null) break block93;
                                                                                                                                                        if (v1 == false) break block94;
                                                                                                                                                    }
                                                                                                                                                    catch (MatchException v2) {
                                                                                                                                                        throw _5C.a(v2);
                                                                                                                                                    }
                                                                                                                                                    v3 = new Object[1];
                                                                                                                                                    v3[0] = var10_6;
                                                                                                                                                    _5C.c("\u00d0", (Object)this, (Object)v3, (long)5089153314521713420L, (long)var2_2);
                                                                                                                                                    return;
                                                                                                                                                }
                                                                                                                                                catch (MatchException v4) {
                                                                                                                                                    throw _5C.a(v4);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            try {
                                                                                                                                                v5 = _5C.c("\u00f4", (Object)_5C.c("\u00f4", (Object)this, (long)5089070718891530584L, (long)var2_2), (long)5087005634397906278L, (long)var2_2);
                                                                                                                                                if (var2_2 <= 0L || var18_10 != null) break block95;
                                                                                                                                                v1 = _5C.c("\u00d0", (Object)v5, (long)5087873982722616358L, (long)var2_2);
                                                                                                                                            }
                                                                                                                                            catch (MatchException v6) {
                                                                                                                                                throw _5C.a(v6);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            if (v1 == false) {
                                                                                                                                                v7 = new Object[2];
                                                                                                                                                v7[1] = _5C.c("G", (long)5084871662392546701L, (long)var2_2);
                                                                                                                                                v7[0] = var12_7;
                                                                                                                                                _5C.c("\u00d0", (Object)this, (Object)v7, (long)5084746906863305521L, (long)var2_2);
                                                                                                                                                return;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        catch (MatchException v8) {
                                                                                                                                            throw _5C.a(v8);
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            v9 = new Object[1];
                                                                                                                                            v9[0] = var4_3;
                                                                                                                                            _5C.c("L", (Object)this, (class_1657)_5C.c("\u00d0", (Object)this, (Object)v9, (long)5086657790461866457L, (long)var2_2), (long)5089286649311825415L, (long)var2_2);
                                                                                                                                            v10 = this;
                                                                                                                                            if (var18_10 != null) break block96;
                                                                                                                                            v5 = _5C.c("\u00f4", (Object)v10, (long)5089286649311825415L, (long)var2_2);
                                                                                                                                        }
                                                                                                                                        catch (MatchException v11) {
                                                                                                                                            throw _5C.a(v11);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        if (v5 == null) {
                                                                                                                                            v12 = new Object[2];
                                                                                                                                            v12[1] = _5C.c("G", (long)5090063824273199918L, (long)var2_2);
                                                                                                                                            v12[0] = var12_7;
                                                                                                                                            _5C.c("\u00d0", (Object)this, (Object)v12, (long)5084746906863305521L, (long)var2_2);
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    catch (MatchException v13) {
                                                                                                                                        throw _5C.a(v13);
                                                                                                                                    }
                                                                                                                                    v14 = new Object[1];
                                                                                                                                    v14[0] = var6_4;
                                                                                                                                    _5C.c("\u00d0", (Object)this, (Object)v14, (long)5089874841657402190L, (long)var2_2);
                                                                                                                                    v10 = this;
                                                                                                                                }
                                                                                                                                var19_11 = _5C.c("\u00d0", (Object)_5C.c("\u00f4", (Object)_5C.c("\u00f4", (Object)v10, (long)5089070718891530584L, (long)var2_2), (long)5087005634397906278L, (long)var2_2), (long)5086168537415952339L, (long)var2_2);
                                                                                                                                var20_12 = _5C.c("\u00d0", (Object)_5C.c("\u00f4", (Object)this, (long)5089286649311825415L, (long)var2_2), (long)5092244425086846976L, (long)var2_2);
                                                                                                                                var21_13 = _5C.c("\u00d0", (Object)_5C.c("\u00f4", (Object)_5C.c("\u00f4", (Object)this, (long)5089070718891530584L, (long)var2_2), (long)5087005634397906278L, (long)var2_2), (long)5090888676422511085L, (long)var2_2);
                                                                                                                                var22_14 = _5C.c("\u00f4", (Object)var19_11, (long)5093158911132204507L, (long)var2_2) - _5C.c("\u00f4", (Object)var20_12, (long)5093158911132204507L, (long)var2_2);
                                                                                                                                v15 = new Object[3];
                                                                                                                                v15[2] = var14_8;
                                                                                                                                v15[1] = var20_12;
                                                                                                                                v15[0] = var19_11;
                                                                                                                                var24_15 = _5C.c("\u00d0", (Object)this, (Object)v15, (long)5090716097932577623L, (long)var2_2);
                                                                                                                                var26_16 = _5C.c("\u00d0", (Object)var21_13, (long)5085375310978699568L, (long)var2_2);
                                                                                                                                var28_17 = _5C.c("\u00e1", (double)(2.0 * _5C.c("\u00e1", (double)var22_14, (double)1.0, (long)5092032277617989920L, (long)var2_2) / 0.08), (long)5091129882264856026L, (long)var2_2);
                                                                                                                                var30_18 = new class_243((double)(_5C.c("\u00f4", (Object)var19_11, (long)5091245800670064482L, (long)var2_2) + _5C.c("\u00f4", (Object)var21_13, (long)5091245800670064482L, (long)var2_2) * var28_17 * 0.7), (double)_5C.c("\u00f4", (Object)var20_12, (long)5093158911132204507L, (long)var2_2), (double)(_5C.c("\u00f4", (Object)var19_11, (long)5090642337651453194L, (long)var2_2) + _5C.c("\u00f4", (Object)var21_13, (long)5090642337651453194L, (long)var2_2) * var28_17 * 0.7));
                                                                                                                                var31_19 = _5C.c("\u00d0", (Object)var20_12, (double)(_5C.c("\u00f4", (Object)_5C.c("\u00f4", (Object)this, (long)5085965490378487014L, (long)var2_2), (long)5091245800670064482L, (long)var2_2) * var28_17), (double)0.0, (double)(_5C.c("\u00f4", (Object)_5C.c("\u00f4", (Object)this, (long)5085965490378487014L, (long)var2_2), (long)5090642337651453194L, (long)var2_2) * var28_17), (long)5088335501871850864L, (long)var2_2);
                                                                                                                                v16 = new Object[3];
                                                                                                                                v16[2] = var14_8;
                                                                                                                                v16[1] = var31_19;
                                                                                                                                v16[0] = var30_18;
                                                                                                                                var32_20 = _5C.c("\u00d0", (Object)this, (Object)v16, (long)5090716097932577623L, (long)var2_2);
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        cfr_temp_0 = var22_14 - 5.0;
                                                                                                                                        v17 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                                                                                                                        v18 = var18_10;
                                                                                                                                        if (var2_2 >= 0L) {
                                                                                                                                            if (v18 != null) break block97;
                                                                                                                                            if (v17 <= 0) break block98;
                                                                                                                                        }
                                                                                                                                        ** GOTO lbl117
                                                                                                                                    }
                                                                                                                                    catch (MatchException v19) {
                                                                                                                                        throw _5C.a(v19);
                                                                                                                                    }
                                                                                                                                    cfr_temp_1 = var22_14 - 14.0;
                                                                                                                                    v17 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                                                                                                                                }
                                                                                                                                catch (MatchException v20) {
                                                                                                                                    throw _5C.a(v20);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                v18 = var18_10;
lbl117:
                                                                                                                                // 2 sources

                                                                                                                                if (v18 != null) break block99;
                                                                                                                                if (v17 >= 0) break block98;
                                                                                                                            }
                                                                                                                            catch (MatchException v21) {
                                                                                                                                throw _5C.a(v21);
                                                                                                                            }
                                                                                                                            v17 = (reference)true;
                                                                                                                            break block99;
                                                                                                                        }
                                                                                                                        v17 = (reference)false;
                                                                                                                    }
                                                                                                                    var34_21 /* !! */  = v17;
                                                                                                                    try {
                                                                                                                        cfr_temp_2 = var32_20 - 2.5;
                                                                                                                        v22 /* !! */  = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 < 0 ? -1 : 1);
                                                                                                                        if (var18_10 != null) break block100;
                                                                                                                        if (v22 /* !! */  >= 0) break block101;
                                                                                                                    }
                                                                                                                    catch (MatchException v23) {
                                                                                                                        throw _5C.a(v23);
                                                                                                                    }
                                                                                                                    v22 /* !! */  = (reference)true;
                                                                                                                    break block100;
                                                                                                                }
                                                                                                                v22 /* !! */  = (reference)false;
                                                                                                            }
                                                                                                            var35_22 /* !! */  = v22 /* !! */ ;
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            v24 = var35_22 /* !! */ ;
                                                                                                                            if (var18_10 != null) break block102;
                                                                                                                            if (v24 == false) break block103;
                                                                                                                        }
                                                                                                                        catch (MatchException v25) {
                                                                                                                            throw _5C.a(v25);
                                                                                                                        }
                                                                                                                        v24 = var34_21 /* !! */ ;
                                                                                                                        v26 = var18_10;
                                                                                                                        if (var2_2 > 0L) {
                                                                                                                            if (v26 != null) break block102;
                                                                                                                        }
                                                                                                                        ** GOTO lbl189
                                                                                                                    }
                                                                                                                    catch (MatchException v27) {
                                                                                                                        throw _5C.a(v27);
                                                                                                                    }
                                                                                                                    if (v24 == false) break block103;
                                                                                                                }
                                                                                                                catch (MatchException v28) {
                                                                                                                    throw _5C.a(v28);
                                                                                                                }
                                                                                                                v29 = new Object[1];
                                                                                                                v29[0] = var8_5;
                                                                                                                _5C.c("\u00d0", (Object)this, (Object)v29, (long)5089559066542231999L, (long)var2_2);
                                                                                                                v30 = new Object[1];
                                                                                                                v30[0] = var16_9;
                                                                                                                _5C.c("\u00d0", (Object)this, (Object)v30, (long)5092539874123377434L, (long)var2_2);
                                                                                                                v31 = new Object[2];
                                                                                                                v31[1] = _5C.c("G", (long)5084871662392546701L, (long)var2_2);
                                                                                                                v31[0] = var12_7;
                                                                                                                _5C.c("\u00d0", (Object)this, (Object)v31, (long)5084746906863305521L, (long)var2_2);
                                                                                                                return;
                                                                                                            }
                                                                                                            catch (MatchException v32) {
                                                                                                                throw _5C.a(v32);
                                                                                                            }
                                                                                                        }
                                                                                                        v24 = (cfr_temp_3 = var24_15 - 15.0) == 0 ? 0 : (cfr_temp_3 > 0 ? 1 : -1);
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    v26 = var18_10;
lbl189:
                                                                                                                    // 2 sources

                                                                                                                    if (v26 != null) break block104;
                                                                                                                    if (v24 > 0) break block105;
                                                                                                                }
                                                                                                                catch (MatchException v33) {
                                                                                                                    throw _5C.a(v33);
                                                                                                                }
                                                                                                                cfr_temp_4 = var24_15 - 8.0;
                                                                                                                v24 = cfr_temp_4 == 0 ? 0 : (cfr_temp_4 > 0 ? 1 : -1);
                                                                                                                v34 = var18_10;
                                                                                                                if (var2_2 > 0L) {
                                                                                                                    if (v34 != null) break block106;
                                                                                                                }
                                                                                                                ** GOTO lbl215
                                                                                                            }
                                                                                                            catch (MatchException v35) {
                                                                                                                throw _5C.a(v35);
                                                                                                            }
                                                                                                            if (v24 <= 0) break block107;
                                                                                                        }
                                                                                                        catch (MatchException v36) {
                                                                                                            throw _5C.a(v36);
                                                                                                        }
                                                                                                        cfr_temp_5 = var26_16 - 0.5;
                                                                                                        v24 = cfr_temp_5 == 0 ? 0 : (cfr_temp_5 < 0 ? -1 : 1);
                                                                                                    }
                                                                                                    catch (MatchException v37) {
                                                                                                        throw _5C.a(v37);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    v34 = var18_10;
lbl215:
                                                                                                    // 2 sources

                                                                                                    if (v34 != null) break block104;
                                                                                                    if (v24 >= 0) break block107;
                                                                                                }
                                                                                                catch (MatchException v38) {
                                                                                                    throw _5C.a(v38);
                                                                                                }
                                                                                            }
                                                                                            v24 = (reference)true;
                                                                                            break block104;
                                                                                        }
                                                                                        v24 = (reference)false;
                                                                                    }
                                                                                    var36_23 /* !! */  = v24;
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                v39 /* !! */  = var36_23 /* !! */ ;
                                                                                                if (var2_2 < 0L || var18_10 != null) break block108;
                                                                                                if (v39 /* !! */  == false) break block109;
                                                                                            }
                                                                                            catch (MatchException v40) {
                                                                                                throw _5C.a(v40);
                                                                                            }
                                                                                            v41 = (double)var26_16;
                                                                                            if (var2_2 < 0L) break block110;
                                                                                            v42 /* !! */  = (reference)0.2;
                                                                                            if (var18_10 != null) break block111;
                                                                                        }
                                                                                        catch (MatchException v43) {
                                                                                            throw _5C.a(v43);
                                                                                        }
                                                                                        cfr_temp_6 = v41 - v42 /* !! */ ;
                                                                                        v39 /* !! */  = (reference)(cfr_temp_6 == 0.0 ? 0 : (cfr_temp_6 > 0.0 ? 1 : -1));
                                                                                    }
                                                                                    catch (MatchException v44) {
                                                                                        throw _5C.a(v44);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    if (v39 /* !! */  <= 0) break block112;
                                                                                    v45 = var24_15;
                                                                                    v42 /* !! */  = var26_16;
                                                                                }
                                                                                catch (MatchException v46) {
                                                                                    throw _5C.a(v46);
                                                                                }
                                                                            }
                                                                            v41 = (double)(v45 / v42 /* !! */ );
                                                                            break block110;
                                                                        }
                                                                        v41 = 40.0;
                                                                    }
                                                                    var39_24 /* !! */  = v41;
                                                                    var39_24 /* !! */  = (double)_5C.c("\u00e1", (double)var39_24 /* !! */ , (double)50.0, (long)5085502285632117339L, (long)var2_2);
                                                                    var41_25 = _5C.c("\u00d0", (Object)var20_12, (double)(_5C.c("\u00f4", (Object)_5C.c("\u00f4", (Object)this, (long)5085965490378487014L, (long)var2_2), (long)5091245800670064482L, (long)var2_2) * var39_24 /* !! */ ), (double)0.0, (double)(_5C.c("\u00f4", (Object)_5C.c("\u00f4", (Object)this, (long)5085965490378487014L, (long)var2_2), (long)5090642337651453194L, (long)var2_2) * var39_24 /* !! */ ), (long)5088335501871850864L, (long)var2_2);
                                                                    var42_27 = _5C.c("\u00f4", (Object)var41_25, (long)5091245800670064482L, (long)var2_2) - _5C.c("\u00f4", (Object)var19_11, (long)5091245800670064482L, (long)var2_2);
                                                                    var44_28 = _5C.c("\u00f4", (Object)var41_25, (long)5090642337651453194L, (long)var2_2) - _5C.c("\u00f4", (Object)var19_11, (long)5090642337651453194L, (long)var2_2);
                                                                    var37_29 = (float)_5C.c("\u00e1", (double)_5C.c("\u00e1", (double)var44_28, (double)var42_27, (long)5087794965357227661L, (long)var2_2), (long)5088163318653251713L, (long)var2_2) - 90.0f;
                                                                    v47 = new Object[3];
                                                                    v47[2] = var14_8;
                                                                    v47[1] = var41_25;
                                                                    v47[0] = var19_11;
                                                                    var46_30 = _5C.c("\u00d0", (Object)this, (Object)v47, (long)5090716097932577623L, (long)var2_2);
                                                                    try {
                                                                        cfr_temp_7 = var46_30 - 40.0;
                                                                        v48 = cfr_temp_7 == 0 ? 0 : (cfr_temp_7 > 0 ? 1 : -1);
                                                                        v49 = var18_10;
                                                                        if (var2_2 < 0L) ** GOTO lbl297
                                                                        if (v49 != null) break block113;
                                                                        if (v48 > 0) {
                                                                        }
                                                                        ** GOTO lbl290
                                                                    }
                                                                    catch (MatchException v50) {
                                                                        throw _5C.a(v50);
                                                                    }
                                                                    var38_31 = 20.0f;
                                                                    try {
                                                                        v51 = var18_10;
                                                                        if (var2_2 < 0L) break block114;
                                                                        if (v51 == null) break block115;
lbl290:
                                                                        // 2 sources

                                                                        v48 = (cfr_temp_8 = var46_30 - 25.0) == 0 ? 0 : (cfr_temp_8 > 0 ? 1 : -1);
                                                                    }
                                                                    catch (MatchException v52) {
                                                                        throw _5C.a(v52);
                                                                    }
                                                                }
                                                                try {
                                                                    v49 = var18_10;
lbl297:
                                                                    // 2 sources

                                                                    if (v49 != null) break block116;
                                                                    if (v48 > 0) {
                                                                    }
                                                                    ** GOTO lbl308
                                                                }
                                                                catch (MatchException v53) {
                                                                    throw _5C.a(v53);
                                                                }
                                                                var38_31 = 30.0f;
                                                                try {
                                                                    v51 = var18_10;
                                                                    if (var2_2 < 0L) break block114;
                                                                    if (v51 == null) break block115;
lbl308:
                                                                    // 2 sources

                                                                    v48 = (cfr_temp_9 = var46_30 - 15.0) == 0 ? 0 : (cfr_temp_9 > 0 ? 1 : -1);
                                                                }
                                                                catch (MatchException v54) {
                                                                    throw _5C.a(v54);
                                                                }
                                                            }
                                                            if (v48 <= 0) break block125;
                                                            var38_31 = 40.0f;
                                                            v51 = var18_10;
                                                            if (var2_2 < 0L) break block114;
                                                            if (v51 == null) break block115;
                                                        }
                                                        var38_31 = 50.0f;
                                                    }
                                                    v51 = var18_10;
                                                }
                                                if (v51 == null) break block121;
                                            }
                                            var39_24 /* !! */  = (double)(_5C.c("\u00f4", (Object)var31_19, (long)5091245800670064482L, (long)var2_2) - _5C.c("\u00f4", (Object)var30_18, (long)5091245800670064482L, (long)var2_2));
                                            var41_26 = _5C.c("\u00f4", (Object)var31_19, (long)5090642337651453194L, (long)var2_2) - _5C.c("\u00f4", (Object)var30_18, (long)5090642337651453194L, (long)var2_2);
                                            var37_29 = (float)_5C.c("\u00e1", (double)_5C.c("\u00e1", (double)var41_26, (double)var39_24 /* !! */ , (long)5087794965357227661L, (long)var2_2), (long)5088163318653251713L, (long)var2_2) - 90.0f;
                                            try {
                                                cfr_temp_10 = var26_16 - 1.0;
                                                v55 = cfr_temp_10 == 0 ? 0 : (cfr_temp_10 > 0 ? 1 : -1);
                                                v56 = var18_10;
                                                if (var2_2 < 0L) ** GOTO lbl349
                                                if (v56 != null) break block117;
                                                if (v55 > 0) {
                                                }
                                                ** GOTO lbl342
                                            }
                                            catch (MatchException v57) {
                                                throw _5C.a(v57);
                                            }
                                            var38_31 = 75.0f;
                                            try {
                                                if (var2_2 <= 0L || var18_10 == null) break block118;
lbl342:
                                                // 2 sources

                                                v55 = (cfr_temp_11 = var26_16 - 0.6) == 0 ? 0 : (cfr_temp_11 > 0 ? 1 : -1);
                                            }
                                            catch (MatchException v58) {
                                                throw _5C.a(v58);
                                            }
                                        }
                                        try {
                                            v56 = var18_10;
lbl349:
                                            // 2 sources

                                            if (v56 != null) break block119;
                                            if (v55 > 0) {
                                            }
                                            ** GOTO lbl358
                                        }
                                        catch (MatchException v59) {
                                            throw _5C.a(v59);
                                        }
                                        var38_31 = 65.0f;
                                        try {
                                            if (var2_2 <= 0L || var18_10 == null) break block118;
lbl358:
                                            // 2 sources

                                            v55 = (cfr_temp_12 = var26_16 - 0.3) == 0 ? 0 : (cfr_temp_12 > 0 ? 1 : -1);
                                        }
                                        catch (MatchException v60) {
                                            throw _5C.a(v60);
                                        }
                                    }
                                    if (v55 <= 0) break block126;
                                    var38_31 = 55.0f;
                                    if (var2_2 <= 0L || var18_10 == null) break block118;
                                }
                                var38_31 = 45.0f;
                            }
                            try {
                                try {
                                    try {
                                        cfr_temp_13 = var32_20 - 8.0;
                                        v61 = cfr_temp_13 == 0 ? 0 : (cfr_temp_13 > 0 ? 1 : -1);
                                        if (var18_10 != null) break block120;
                                        if (v61 <= 0) break block121;
                                    }
                                    catch (MatchException v62) {
                                        throw _5C.a(v62);
                                    }
                                    cfr_temp_14 = var26_16 - 0.4;
                                    v61 = cfr_temp_14 == 0 ? 0 : (cfr_temp_14 < 0 ? -1 : 1);
                                    if (var2_2 < 0L || var18_10 != null) break block120;
                                }
                                catch (MatchException v63) {
                                    throw _5C.a(v63);
                                }
                                if (v61 >= 0) break block121;
                            }
                            catch (MatchException v64) {
                                throw _5C.a(v64);
                            }
                            var38_31 = 35.0f;
                        }
                        try {
                            _5C.c("L", (Object)this, (float)((float)_5C.c("\u00e1", (double)(0.3 + var26_16 * 0.2), (double)0.3, (double)0.6, (long)5088264507515806615L, (long)var2_2)), (long)5085656240242939909L, (long)var2_2);
                            _5C.c("L", (Object)this, (float)var37_29, (long)5087565066228489198L, (long)var2_2);
                            _5C.c("L", (Object)this, (float)var38_31, (long)5087276555493898270L, (long)var2_2);
                            _5C.c("L", (Object)this, (boolean)_5C.a("i", (int)21693, (long)(3621306839151240465L ^ var2_2)), (long)5093022368302870412L, (long)var2_2);
                            v65 = this;
                            v66 = var18_10;
                            if (var2_2 < 0L) break block122;
                            if (v66 != null) break block123;
                            v61 = _5C.c("\u00f4", (Object)v65, (long)5092379029824372755L, (long)var2_2);
                        }
                        catch (MatchException v67) {
                            throw _5C.a(v67);
                        }
                    }
                    try {
                        if (v61 <= _5C.a("i", (int)7686, (long)(8880871927002574761L ^ var2_2))) break block124;
                        v68 = new Object[1];
                        v68[0] = var8_5;
                        _5C.c("\u00d0", (Object)this, (Object)v68, (long)5089559066542231999L, (long)var2_2);
                        v65 = this;
                    }
                    catch (MatchException v69) {
                        throw _5C.a(v69);
                    }
                }
                v70 = new Object[2];
                v70[1] = _5C.c("G", (long)5084871662392546701L, (long)var2_2);
                v66 = v70;
                v70[0] = var12_7;
            }
            _5C.c("\u00d0", (Object)v65, (Object)v66, (long)5084746906863305521L, (long)var2_2);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void cfr_renamed_270(Object[] var1_1) {
        block33: {
            block31: {
                block32: {
                    block27: {
                        block25: {
                            block26: {
                                block28: {
                                    block29: {
                                        block30: {
                                            block23: {
                                                block24: {
                                                    var2_2 = (Long)var1_1[0];
                                                    v0 = var2_2 = _5C.b ^ var2_2;
                                                    var4_3 = v0 ^ 76031436417039L;
                                                    var6_4 = v0 ^ 96234254448483L;
                                                    var8_5 = v0 ^ 82542113613077L;
                                                    var10_6 = v0 ^ 41412721099526L;
                                                    var12_7 = v0 ^ 98647394320284L;
                                                    var14_8 = v0 ^ 104805872234953L;
                                                    var16_9 = _3s.cfr_renamed_5();
                                                    try {
                                                        try {
                                                            v1 = _5C.c("\u00d0", (Object)_5C.c("\u00f4", (Object)_5C.c("\u00f4", (Object)this, (long)-4620395926562283495L, (long)var2_2), (long)-4622487529130927065L, (long)var2_2), (long)-4622154643287648921L, (long)var2_2);
                                                            if (var16_9 != null) break block23;
                                                            if (v1 == false) break block24;
                                                        }
                                                        catch (MatchException v2) {
                                                            throw _5C.a(v2);
                                                        }
                                                        v3 = new Object[1];
                                                        v3[0] = var8_5;
                                                        _5C.c("\u00d0", (Object)this, (Object)v3, (long)-4620495614569436930L, (long)var2_2);
                                                    }
                                                    catch (MatchException v4) {
                                                        throw _5C.a(v4);
                                                    }
                                                }
                                                v5 = new Object[1];
                                                v5[0] = var4_3;
                                                _5C.c("L", (Object)this, (class_1657)_5C.c("\u00d0", (Object)this, (Object)v5, (long)-4623370571282184040L, (long)var2_2), (long)-4620187961427331258L, (long)var2_2);
                                                v6 = new Object[1];
                                                v6[0] = var14_8;
                                                v1 = _5C.c("\u00d0", (Object)this, (Object)v6, (long)-4616934323131903397L, (long)var2_2);
                                            }
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                v7 = new Object[1];
                                                                v7[0] = var6_4;
                                                                _5C.c("\u00d0", (Object)this, (Object)v7, (long)-4619617298579777009L, (long)var2_2);
                                                                v8 = this;
                                                                v9 = var16_9;
                                                                if (var2_2 >= 0L) {
                                                                    if (v9 != null) break block25;
                                                                    if (_5C.c("\u00f4", (Object)v8, (long)-4620187961427331258L, (long)var2_2) == null) break block26;
                                                                }
                                                                ** GOTO lbl109
                                                            }
                                                            catch (MatchException v10) {
                                                                throw _5C.a(v10);
                                                            }
                                                            v11 = _5C.c("\u00d0", (Object)_5C.c("\u00f4", (Object)this, (long)-4620187961427331258L, (long)var2_2), (long)-4618016332453821396L, (long)var2_2);
                                                            if (var16_9 != null) break block27;
                                                        }
                                                        catch (MatchException v12) {
                                                            throw _5C.a(v12);
                                                        }
                                                        if (v11 != false) break block26;
                                                    }
                                                    catch (MatchException v13) {
                                                        throw _5C.a(v13);
                                                    }
                                                    v11 = _5C.c("\u00d0", (Object)_5C.c("\u00f4", (Object)this, (long)-4620187961427331258L, (long)var2_2), (long)-4619865224957546521L, (long)var2_2);
                                                    if (var16_9 != null) break block27;
                                                }
                                                catch (MatchException v14) {
                                                    throw _5C.a(v14);
                                                }
                                                if (v11 != false) break block26;
                                            }
                                            catch (MatchException v15) {
                                                throw _5C.a(v15);
                                            }
                                            var17_10 = _5C.c("\u00d0", (Object)_5C.c("\u00f4", (Object)_5C.c("\u00f4", (Object)this, (long)-4620395926562283495L, (long)var2_2), (long)-4622487529130927065L, (long)var2_2), (long)-4623859883585118574L, (long)var2_2);
                                            var18_11 = _5C.c("\u00d0", (Object)_5C.c("\u00f4", (Object)this, (long)-4620187961427331258L, (long)var2_2), (long)-4617801595297779391L, (long)var2_2);
                                            var19_12 = _5C.c("\u00d0", (Object)_5C.c("\u00f4", (Object)_5C.c("\u00f4", (Object)this, (long)-4620395926562283495L, (long)var2_2), (long)-4622487529130927065L, (long)var2_2), (long)-4618594257988480852L, (long)var2_2);
                                            var20_13 = _5C.c("\u00f4", (Object)var17_10, (long)-4616324089497353062L, (long)var2_2) - _5C.c("\u00f4", (Object)var18_11, (long)-4616324089497353062L, (long)var2_2);
                                            var22_14 /* !! */  = _5C.c("\u00e1", (double)_5C.c("\u00f4", (Object)var19_12, (long)-4616324089497353062L, (long)var2_2), (long)-4622000985623421420L, (long)var2_2);
                                            try {
                                                v16 = var22_14 /* !! */ ;
                                                if (var2_2 < 0L) break block28;
                                                v17 /* !! */  = 0.5;
                                                if (var16_9 != null) break block29;
                                                if (!(v16 < v17 /* !! */ )) break block30;
                                            }
                                            catch (MatchException v18) {
                                                throw _5C.a(v18);
                                            }
                                            var22_14 /* !! */  = (CallSite)0.5;
                                        }
                                        v19 = var20_13;
                                        v17 /* !! */  = (double)var22_14 /* !! */ ;
                                    }
                                    v16 = v19 / v17 /* !! */ ;
                                }
                                var24_15 = v16;
                                var24_15 = _5C.c("\u00e1", (double)var24_15, (double)20.0, (long)-4624535069816331494L, (long)var2_2);
                                var26_16 = _5C.c("\u00d0", (Object)var18_11, (double)(_5C.c("\u00f4", (Object)_5C.c("\u00f4", (Object)this, (long)-4623518877367710297L, (long)var2_2), (long)-4618809008366840285L, (long)var2_2) * var24_15), (double)0.0, (double)(_5C.c("\u00f4", (Object)_5C.c("\u00f4", (Object)this, (long)-4623518877367710297L, (long)var2_2), (long)-4619404016784272309L, (long)var2_2) * var24_15), (long)-4621701919057093583L, (long)var2_2);
                                var27_17 = _5C.c("\u00d0", (Object)var26_16, (double)0.0, (double)((double)(_5C.c("\u00d0", (Object)_5C.c("\u00f4", (Object)this, (long)-4620187961427331258L, (long)var2_2), (long)-4617170743857526819L, (long)var2_2) / 2.0f)), (double)0.0, (long)-4621701919057093583L, (long)var2_2);
                                v20 = new Object[2];
                                v20[1] = var12_7;
                                v20[0] = var27_17;
                                _5C.c("\u00d0", (Object)this, (Object)v20, (long)-4623611554421777952L, (long)var2_2);
                            }
                            _5C.c("\u00e1", (Object)_5C.c("\u00d0", (Object)_5C.c("G", (long)-4616221268832626601L, (long)var2_2), (int)0, (long)-4617265529560493964L, (long)var2_2), (long)-4620562607221337151L, (long)var2_2);
                            v8 = this;
                        }
                        try {
                            v9 = var16_9;
lbl109:
                            // 2 sources

                            if (var2_2 < 0L) break block31;
                            if (v9 != null) break block32;
                            v11 = _5C.c("\u00d0", (Object)_5C.c("\u00f4", (Object)_5C.c("\u00f4", (Object)v8, (long)-4620395926562283495L, (long)var2_2), (long)-4622487529130927065L, (long)var2_2), (long)-4617321448087723039L, (long)var2_2);
                        }
                        catch (MatchException v21) {
                            throw _5C.a(v21);
                        }
                    }
                    if (v11 == false) break block33;
                    v8 = this;
                }
                v22 = new Object[1];
                v9 = v22;
                v22[0] = var10_6;
            }
            _5C.c("\u00d0", (Object)v8, (Object)v9, (long)-4620339996613053875L, (long)var2_2);
        }
    }

    private void cfr_renamed_271(Object[] objectArray) {
        float f;
        _5C c;
        class_243 class_2432 = (class_243)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = b ^ l2;
        CallSite callSite = _5C.c("\u00d0", (Object)class_2432, (Object)_5C.c("\u00d0", (Object)_5C.c("\u00f4", (Object)_5C.c("\u00f4", (Object)this, -7474796206595061828L, (long)l2), -7458913146076693630L, (long)l2), -7460618066515317124L, (long)l2), -7472038333983649488L, (long)l2);
        CallSite callSite2 = _5C.c("\u00e1", (double)(_5C.c("\u00f4", (Object)callSite, -7474972919558655610L, (long)l2) * _5C.c("\u00f4", (Object)callSite, -7474972919558655610L, (long)l2) + _5C.c("\u00f4", (Object)callSite, -7475506357929593874L, (long)l2) * _5C.c("\u00f4", (Object)callSite, -7475506357929593874L, (long)l2)), -7475024267555620034L, (long)l2);
        CallSite callSite3 = _5C.c("\u00d0", (Object)callSite, -7458040380652053355L, (long)l2);
        float f2 = (float)_5C.c("\u00e1", (double)_5C.c("\u00e1", (double)_5C.c("\u00f4", (Object)callSite, -7475506357929593874L, (long)l2), (double)_5C.c("\u00f4", (Object)callSite, -7474972919558655610L, (long)l2), -7458163020115824535L, (long)l2), -7459936550267769243L, (long)l2) - 90.0f;
        Object object = (float)(-_5C.c("\u00e1", (double)_5C.c("\u00e1", (double)_5C.c("\u00f4", (Object)callSite, -7472954315941895361L, (long)l2), (double)callSite2, -7458163020115824535L, (long)l2), -7459936550267769243L, (long)l2));
        object = _5C.c("\u00e1", (float)object, -90.0f, 90.0f, -7461727194166354395L, (long)l2);
        try {
            c = this;
            f = callSite3 < 5.0 ? 0.7f : 0.5f;
        }
        catch (MatchException matchException) {
            throw _5C.a(matchException);
        }
        _5C.c("L", (Object)c, (float)f, -7460261398342007071L, (long)l2);
        _5C.c("L", (Object)this, (float)f2, -7458352588965706486L, (long)l2);
        _5C.c("L", (Object)this, (float)object, -7458645163677899014L, (long)l2);
        _5C.c("L", (Object)this, (boolean)_5C.a("i", 58, (long)(0x50DF333CC129EF70L ^ l2)), -7473091967037574808L, (long)l2);
    }

    private void cfr_renamed_272(Object[] objectArray) {
        block9: {
            CallSite callSite;
            CallSite callSite2;
            long l2;
            block8: {
                CallSite callSite3;
                _4w[] wArray;
                block6: {
                    long l3;
                    block7: {
                        l2 = (Long)objectArray[0];
                        long l4 = l2 = b ^ l2;
                        long l5 = l4 ^ 0x75EC6EB9D28FL;
                        l3 = l4 ^ 0x6A6F27922AF8L;
                        wArray = _3s.cfr_renamed_5();
                        try {
                            Object[] objectArray2 = new Object[1];
                            objectArray2[0] = l5;
                            callSite3 = _5C.c("\u00d0", (Object)this, (Object)objectArray2, -9022148600698793577L, (long)l2);
                            if (wArray != null) break block6;
                            if (callSite3 != false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw _5C.a(matchException);
                        }
                        return;
                    }
                    Object[] objectArray3 = new Object[1];
                    objectArray3[0] = l3;
                    callSite3 = _5C.c("\u00d0", (Object)this, (Object)objectArray3, -9023167534227055337L, (long)l2);
                }
                callSite2 = callSite3;
                try {
                    try {
                        callSite = callSite2;
                        if (wArray != null) break block8;
                        if (callSite == -1) break block9;
                    }
                    catch (MatchException matchException) {
                        throw _5C.a(matchException);
                    }
                    callSite = _5C.c("\u00d0", (Object)_5C.c("\u00d0", (Object)_5C.c("\u00f4", (Object)_5C.c("\u00f4", (Object)this, -9021516139547599563L, (long)l2), -9010140820763680501L, (long)l2), -9008828353612901343L, (long)l2), -9009411810367480793L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _5C.a(matchException);
                }
            }
            CallSite callSite4 = callSite;
            _5C.c("\u00d0", (Object)_5C.c("\u00d0", (Object)_5C.c("\u00f4", (Object)_5C.c("\u00f4", (Object)this, -9021516139547599563L, (long)l2), -9010140820763680501L, (long)l2), -9008828353612901343L, (long)l2), (int)callSite2, -9025130265383302752L, (long)l2);
            _5C.c("\u00d0", (Object)_5C.c("\u00f4", (Object)_5C.c("\u00f4", (Object)this, -9021516139547599563L, (long)l2), -9023692166071784384L, (long)l2), (Object)_5C.c("\u00f4", (Object)_5C.c("\u00f4", (Object)this, -9021516139547599563L, (long)l2), -9010140820763680501L, (long)l2), (Object)_5C.c("G", -9024597137229112173L, (long)l2), -9008619360230690146L, (long)l2);
            _5C.c("\u00d0", (Object)_5C.c("\u00d0", (Object)_5C.c("\u00f4", (Object)_5C.c("\u00f4", (Object)this, -9021516139547599563L, (long)l2), -9010140820763680501L, (long)l2), -9008828353612901343L, (long)l2), (int)callSite4, -9025130265383302752L, (long)l2);
        }
    }

    private void cfr_renamed_273(Object[] objectArray) {
        block8: {
            _5C c;
            CallSite callSite;
            long l2;
            block9: {
                block10: {
                    CallSite callSite2;
                    _4w[] wArray;
                    block6: {
                        block7: {
                            l2 = (Long)objectArray[0];
                            l2 = b ^ l2;
                            wArray = _3s.cfr_renamed_5();
                            try {
                                callSite2 = _5C.c("\u00f4", (Object)this, -3405851963145906148L, (long)l2);
                                if (wArray != null) break block6;
                                if (callSite2 != null) break block7;
                            }
                            catch (MatchException matchException) {
                                throw _5C.a(matchException);
                            }
                            return;
                        }
                        callSite2 = _5C.c("\u00f4", (Object)this, -3405851963145906148L, (long)l2);
                    }
                    callSite = _5C.c("\u00d0", (Object)callSite2, -3409095440400753125L, (long)l2);
                    try {
                        try {
                            if (l2 < 0L) break block8;
                            c = this;
                            if (wArray != null) break block9;
                            if (_5C.c("\u00f4", (Object)c, -3407849563464127731L, (long)l2) == null) break block10;
                        }
                        catch (MatchException matchException) {
                            throw _5C.a(matchException);
                        }
                        _5C.c("L", (Object)this, (class_243)_5C.c("\u00d0", (Object)callSite, (Object)_5C.c("\u00f4", (Object)this, -3407849563464127731L, (long)l2), -3408395305783797297L, (long)l2), -3418295631978552579L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw _5C.a(matchException);
                    }
                }
                c = this;
            }
            _5C.c("L", (Object)c, (class_243)callSite, -3407849563464127731L, (long)l2);
        }
    }

    private void cfr_renamed_274(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = b ^ l2;
        _5C.c("L", (Object)this, (_82)((Object)_5C.c("G", 2656495587101618512L, (long)l2)), 2660630385149436736L, (long)l2);
        _5C.c("L", (Object)this, null, 2656712027356392569L, (long)l2);
        _5C.c("L", (Object)this, null, 2653060864697622376L, (long)l2);
        _5C.c("L", (Object)this, (class_243)_5C.c("G", 2659191573108086565L, (long)l2), 2660136543488628376L, (long)l2);
        _5C.c("L", (Object)this, (int)_5C.a("i", 26313, (long)(0x72DD07CAB43EB51AL ^ l2)), 2654182595790627437L, (long)l2);
        _5C.c("L", (Object)this, (boolean)_5C.a("i", 26313, (long)(0x72DD07CAB43EB51AL ^ l2)), 2652693165949373938L, (long)l2);
    }

    private void cfr_renamed_118(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        _82 var2_3 = (_82)((Object)objectArray[1]);
        l2 = b ^ l2;
        _5C.c("L", (Object)this, (_82)var2_3, 6969133089287382811L, (long)l2);
        _5C.c("L", (Object)this, (int)_5C.a("i", 16303, (long)(0x2D3115006F29A820L ^ l2)), 6957689385043863094L, (long)l2);
    }

    private void cfr_renamed_199(Object[] objectArray) {
        block15: {
            Object[] objectArray2;
            _5C c;
            long l2;
            block13: {
                long l3;
                block14: {
                    CallSite callSite;
                    block12: {
                        CallSite callSite2;
                        _4w[] wArray;
                        long l4;
                        block10: {
                            block11: {
                                l2 = (Long)objectArray[0];
                                long l5 = l2 = b ^ l2;
                                l4 = l5 ^ 0x7751211082B7L;
                                l3 = l5 ^ 0x377E8F416DE5L;
                                wArray = _3s.cfr_renamed_5();
                                try {
                                    _5C.c("L", (Object)this, (boolean)_5C.a("i", 26313, (long)(0x72DD77B9916FC49DL ^ l2)), 6149438869555494005L, (long)l2);
                                    callSite2 = _5C.c("\u00d0", (Object)_5C.c("\u00f4", (Object)_5C.c("\u00f4", (Object)this, 6150012827718716065L, (long)l2), 6152359516050077343L, (long)l2), 6148478832683944281L, (long)l2);
                                    if (wArray != null) break block10;
                                    if (callSite2 == false) break block11;
                                }
                                catch (MatchException matchException) {
                                    throw _5C.a(matchException);
                                }
                                return;
                            }
                            try {
                                callSite = _5C.c("\u00f4", (Object)_5C.c("\u00f4", (Object)this, 6150012827718716065L, (long)l2), 6152359516050077343L, (long)l2);
                                if (wArray != null) break block12;
                                callSite2 = _5C.c("\u00d0", (Object)callSite, 6152757805170835423L, (long)l2);
                            }
                            catch (MatchException matchException) {
                                throw _5C.a(matchException);
                            }
                        }
                        if (callSite2 == false) {
                            return;
                        }
                        try {
                            Object[] objectArray3 = new Object[1];
                            objectArray3[0] = l4;
                            _5C.c("L", (Object)this, (class_1657)_5C.c("\u00d0", (Object)this, (Object)objectArray3, 6155944058136683040L, (long)l2), 6150221577222135294L, (long)l2);
                            c = this;
                            objectArray2 = wArray;
                            if (l2 < 0L) break block13;
                            if (objectArray2 != null) break block14;
                            callSite = _5C.c("\u00f4", (Object)c, 6150221577222135294L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw _5C.a(matchException);
                        }
                    }
                    if (callSite == null) break block15;
                    c = this;
                }
                Object[] objectArray4 = new Object[2];
                objectArray4[1] = _5C.c("G", 6149703750940332410L, (long)l2);
                objectArray2 = objectArray4;
                objectArray4[0] = l3;
            }
            _5C.c("\u00d0", (Object)c, (Object)objectArray2, 6154618114723057864L, (long)l2);
        }
    }

    public _5C(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0xE48924E35A7L;
        long l5 = l3 ^ 0x463AC0078801L;
        long l6 = l3 ^ 0x100257440068L;
        long l7 = l3 ^ 0xFC2C460EF1AL;
        long l8 = l3 ^ 0x5056A5A2DD5EL;
        super(1, -1, (_4r)((Object)_5C.c("G", -6238164222516435106L, (long)l2)), l6);
        this.cfr_renamed_71 = new _9E(3, l4, (Enum)((Object)_5C.c("G", -6240656287409618402L, (long)l2)), _3s.class);
        this.cfr_renamed_1 = new _6e_0((int)_5C.a("i", 29330, (long)(0x6167EA285702ACF4L ^ l2)), l8, "");
        this.cfr_renamed_9 = new _9r((int)_5C.a("i", 1262, (long)(0x6D490284C73ADA8AL ^ l2)), true, l5);
        _5C.c("L", (Object)this, (_82)((Object)_5C.c("G", -6237853536716899101L, (long)l2)), -6242269637393256717L, (long)l2);
        _5C.c("L", (Object)this, null, -6238052384248733238L, (long)l2);
        _5C.c("L", (Object)this, null, -6241174175092026661L, (long)l2);
        _5C.c("L", (Object)this, (class_243)_5C.c("G", -6245316965941421418L, (long)l2), -6243746116820903125L, (long)l2);
        _5C.c("L", (Object)this, (int)_5C.a("i", 26313, (long)(0x72DD7221DBB838A9L ^ l2)), -6240026552846159906L, (long)l2);
        _5C.c("L", (Object)this, 0.0f, -6244361625769233373L, (long)l2);
        _5C.c("L", (Object)this, 0.0f, -6245199362567235629L, (long)l2);
        _5C.c("L", (Object)this, 0.5f, -6242312126688380984L, (long)l2);
        _5C.c("L", (Object)this, (boolean)_5C.a("i", 26313, (long)(0x72DD7221DBB838A9L ^ l2)), -6241083591401258943L, (long)l2);
        Object[] objectArray = new Object[2];
        objectArray[1] = new _95[]{_5C.c("\u00f4", (Object)this, -6244861468148117699L, (long)l2), _5C.c("\u00f4", (Object)this, -6245147120813777922L, (long)l2), _5C.c("\u00f4", (Object)this, -6242189430919291695L, (long)l2)};
        objectArray[0] = l7;
        _5C.c("\u00d0", (Object)this, (Object)objectArray, -6239992859502614607L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                a.init(_5C.class, 41);
                _5C.b = l.a(-2798285407421376839L, 4598332260676630248L, MethodHandles.lookup().lookupClass()).a(152077425055759L);
                _5C.j = new Object[191];
                _5C.k = new String[191];
                _5C.b();
                _5C.f = new HashMap<K, V>(13);
                var0 = _5C.b ^ 8901564251719L;
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[8];
                var5_4 = 0;
                var6_5 = "\u00b6=\u00c3\u00bc9~\u000f\u00cdR\u00d4\u0095\u00c0\u00e7\u00f5\u00ae\u0000\u0011_\u0003\u00b2\u00d3\u009dB\u00f4.\u00e4\u0085\u001ah\u0011\u00b0j*:\u00f5H\u00f9\u009f\u00c9\u00b0\u001aq\u00a2\u0017\u0016\u0096\u00ed?";
                var7_6 = "\u00b6=\u00c3\u00bc9~\u000f\u00cdR\u00d4\u0095\u00c0\u00e7\u00f5\u00ae\u0000\u0011_\u0003\u00b2\u00d3\u009dB\u00f4.\u00e4\u0085\u001ah\u0011\u00b0j*:\u00f5H\u00f9\u009f\u00c9\u00b0\u001aq\u00a2\u0017\u0016\u0096\u00ed?".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl30:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = ".\u00d3\u00ce\u001a\u009clq\u00fdq\u00d6i\u00ac:\u0017\u00d8\u00e2";
                    var7_6 = ".\u00d3\u00ce\u001a\u009clq\u00fdq\u00d6i\u00ac:\u0017\u00d8\u00e2".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl43:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
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
        _5C.d = var8_3;
        _5C.e = new Integer[8];
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
            case 0 -> 44;
            case 1 -> 60;
            case 2 -> 10;
            case 3 -> 61;
            case 4 -> 6;
            case 5 -> 34;
            case 6 -> 16;
            case 7 -> 35;
            case 8 -> 49;
            case 9 -> 20;
            case 10 -> 9;
            case 11 -> 42;
            case 12 -> 46;
            case 13 -> 56;
            case 14 -> 59;
            case 15 -> 5;
            case 16 -> 52;
            case 17 -> 45;
            case 18 -> 12;
            case 19 -> 57;
            case 20 -> 29;
            case 21 -> 14;
            case 22 -> 41;
            case 23 -> 30;
            case 24 -> 50;
            case 25 -> 0;
            case 26 -> 37;
            case 27 -> 48;
            case 28 -> 27;
            case 29 -> 2;
            case 30 -> 21;
            case 31 -> 58;
            case 32 -> 33;
            case 33 -> 36;
            case 34 -> 22;
            case 35 -> 26;
            case 36 -> 18;
            case 37 -> 54;
            case 38 -> 25;
            case 39 -> 47;
            case 40 -> 7;
            case 41 -> 38;
            case 42 -> 13;
            case 43 -> 17;
            case 44 -> 55;
            case 45 -> 3;
            case 46 -> 43;
            case 47 -> 32;
            case 48 -> 11;
            case 49 -> 31;
            case 50 -> 19;
            case 51 -> 51;
            case 52 -> 40;
            case 53 -> 1;
            case 54 -> 39;
            case 55 -> 23;
            case 56 -> 4;
            case 57 -> 15;
            case 58 -> 24;
            case 59 -> 63;
            case 60 -> 62;
            case 61 -> 8;
            case 62 -> 28;
            default -> 53;
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
        _5C.k[n3] = new String(cArray);
        return n3;
    }

    private boolean boolean_9(Object[] objectArray) {
        Object object;
        block14: {
            block13: {
                _66 v5;
                _66 var12_8;
                _4w[] wArray;
                long l2;
                long l3;
                long l4;
                class_1657 class_16572;
                block12: {
                    Object object2;
                    block10: {
                        long l5;
                        block11: {
                            class_16572 = (class_1657)objectArray[0];
                            l4 = (Long)objectArray[1];
                            long l6 = l4 = b ^ l4;
                            l3 = l6 ^ 0x2F0E7F520338L;
                            l5 = l6 ^ 0x51C4702428EBL;
                            l2 = l6 ^ 0x119CB8610A67L;
                            wArray = _3s.cfr_renamed_5();
                            try {
                                try {
                                    object2 = this;
                                    if (wArray != null) break block10;
                                    if (_5C.c("\u00d0", (Object)_5C.c("\u00f4", (Object)object2, -4038570932845350278L, (long)l4), (long)l2, -4035963869556928112L, (long)l4) != false) break block11;
                                }
                                catch (MatchException matchException) {
                                    throw _5C.a(matchException);
                                }
                                return false;
                            }
                            catch (MatchException matchException) {
                                throw _5C.a(matchException);
                            }
                        }
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = _66.class;
                        objectArray2[0] = l5;
                        object2 = _5C.c("\u00d0", (Object)_5C.c("\u00f4", (Object)_5C.c("G", -4050949294811810056L, (long)l4), -4049196456890069897L, (long)l4), (Object)objectArray2, -4039073513724247728L, (long)l4);
                    }
                    var12_8 = (_66)object2;
                    try {
                        v5 = var12_8;
                        if (l4 < 0L || wArray != null) break block12;
                        if (v5 == null) break block13;
                    }
                    catch (MatchException matchException) {
                        throw _5C.a(matchException);
                    }
                    v5 = var12_8;
                }
                try {
                    try {
                        object = _5C.c("\u00d0", (Object)_5C.c("\u00f4", (Object)v5, -4049346042398206361L, (long)l4), (long)l2, -4035963869556928112L, (long)l4);
                        if (wArray != null) break block14;
                        if (!object) break block13;
                    }
                    catch (MatchException matchException) {
                        throw _5C.a(matchException);
                    }
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l3;
                    objectArray3[0] = class_16572;
                    return (boolean)_5C.c("\u00d0", (Object)var12_8, (Object)objectArray3, -4052675821371947760L, (long)l4);
                }
                catch (MatchException matchException) {
                    throw _5C.a(matchException);
                }
            }
            object = false;
        }
        return object;
    }

    /*
     * Exception decompiling
     */
    @_3i_0
    public void cfr_renamed_1(_9o var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[TRYBLOCK]], but top level block is 10[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _5C.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f4' || c == 'L' || c == 'G' || c == 'W') {
                field = _5C.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f4' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'L' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'G' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5C.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d0' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        Object[] objectArray = j;
        j[0] = "0fak&\u001f0fv7*\u0010*-v)*\u0005-\\#vs";
        objectArray[1] = "\u0003]\tt;E\u001dU\u0013;YY\u001aH";
        objectArray[2] = "B\u00011![|_\u00143`^ \u0013'";
        objectArray[3] = "kGv\u0004\u0005k\u001eg}\u000b\u0014$\u007fiv\u0000\u0010~\u000b";
        objectArray[4] = "\u001bi\u0016Ge7\u001bi\u0001\u001bi8\u0001\"\u0001\u0005i-\u0006SS_=i";
        objectArray[5] = "|e\u001f3b\u0004bm\u0005|?\u0005da\b?b\"bv\f3!";
        objectArray[6] = "#VOFFK=^U\t\u000eK'TMN\u0007PggKB\fW*VMB";
        objectArray[7] = "}\rWh>sc\u0005M'_vc\u0005Ngqj";
        objectArray[8] = "1\u00014^\u0016::\u000e%\u0011w41\u0005!K";
        objectArray[9] = "8\u001eoE5/%\u000bm\u00040se>";
        objectArray[10] = "PM<py2%m7\u007fh}Dc<tl'0";
        objectArray[11] = Boolean.TYPE;
        _5C.k[11] = "java/lang/Boolean";
        objectArray[12] = "|TM\u0001\u0011b|TZ]\u001dmf\u001fZC\u001dxan\n\u001eL";
        objectArray[13] = "\u0018_~%J\n\u0018_iyF\u0005\u0002\u0014igF\u0010\u0005e=?\u0011";
        objectArray[14] = "\u0015+T]1_`\u000b_R \u0010\u0001\u0005TY$Ju";
        objectArray[15] = "\u000e\n/Rx\u001d\u0005\u0005>\u001d\u0013\u001f\u0011\u0006";
        objectArray[16] = "Q')J{]L2+\u000b~\u0001\u00061";
        objectArray[17] = Integer.TYPE;
        _5C.k[17] = "java/lang/Integer";
        objectArray[18] = "#k\u000e\u001a\u0007\u0010>~\f[\u0002Lqv";
        objectArray[19] = "-\u0007GP\rd3\u000f]\u001f`~*\u0016PCBe(\u0014";
        objectArray[20] = "5\u000e\r.\u001a,+\u0006\u0017aG--\n\u001a\"\u001a\u001a0\u0003\u0017*W-0\u001d";
        objectArray[21] = "+\u0002G\u0010p\u001e5\n]_8\u001e/\u0000E\u00181\u0005o7^51\u001e#\u000fT7+\u0005\"\u0017X\u001e0";
        objectArray[22] = "!f\"73>?n8xR)!b7\"n";
        objectArray[23] = "w\u000e1DqJi\u0006+\u000b,Ko\n&Hq|r\u0003+@<Kr\u001d4";
        objectArray[24] = "0!\n\u001a\t10!\u001dF\u0005>*j\u001dX\u0005+-\u001bM\u0001Wj";
        objectArray[25] = Float.TYPE;
        _5C.k[25] = "java/lang/Float";
        objectArray[26] = "\u001ekZ\u0007S,kKQ\bBc\nEZ\u0003F9~";
        objectArray[27] = Void.TYPE;
        _5C.k[27] = "java/lang/Void";
        objectArray[28] = "`H\u0002:f\"}]\u0000{c~2H";
        objectArray[29] = "Nh\u0012\u0004d];H\u0019\u000bu\u0012ZF\u0012\u0000qH.";
        objectArray[30] = "\u0019\\\u0002O \u0016\u0012S\u0013\u0000]\u000e\u0001T\u001aI";
        objectArray[31] = "%,\u0002\u000f&\u0011%,\u0015S*\u001e?g\u0015M*\u000b8\u0016D\u0015x";
        objectArray[32] = Double.TYPE;
        _5C.k[32] = "java/lang/Double";
        objectArray[33] = "\u0011k>q\u001fg\u001ad/>|j\u000fb";
        objectArray[34] = "\u007f`j\u001c&t\u007f`}@*{e+}^*nbZ/\u0005r$";
        objectArray[35] = "\u0005qLD&s\u0005q[\u0018*|\u001f:[\u0006*i\u0018K\t]r(";
        objectArray[36] = "HX\u0018\u001f\u0000DHX\u000fC\fKR\u0013\u000f]\f^Ub]\u0007[\u001c";
        objectArray[37] = "\bw]lJg\u0015b_-O;X ";
        objectArray[38] = Long.TYPE;
        _5C.k[38] = "java/lang/Long";
        objectArray[39] = "\u0012*'kf~g\n,dw1\u0006\u0004'oskr";
        objectArray[40] = "\u001c$\u000b\r\u0013>i\u0004\u0000\u0002\u0002q\b\n\u000b\t\u0006+|";
        objectArray[41] = "T\u0007V\u0014LOI\u0012TUI\u0013\bP";
        objectArray[42] = "IAyc{\u001b<arljT]oygn\u000e)";
        objectArray[43] = "\\5I8uO)\u0015B7d\u0000H\u001bI<`Z<";
        objectArray[44] = "-J=H54Xj6G${9d=L !M";
        objectArray[45] = "\u0013S$TH6fs/[Yy\u0007}$P]#s";
        objectArray[46] = "3\u007f!\u0001 F3\u007f6],I)46C,\\.Ed\u001d{\u0017";
        objectArray[47] = "\u0017FUl2V\u0017FB0>Y\r\rB.>L\n|\u0017qi";
        objectArray[48] = "\"\u001d\b!Y\\W=\u0003.H\u001363\b%LIB";
        objectArray[49] = "v?m>\u0004!\u0003\u001ff1\u0015nb\u0011m:\u00114\u0016";
        objectArray[50] = "hnn\u0001XXhny]TWr%yCTBuT+\u001d\u0003\b";
        objectArray[51] = "=j}\tJ6HJv\u0006[y)D}\r_#]";
        objectArray[52] = ">\u0016\u0016,~q#\u0003\u0014m{-lE";
        objectArray[53] = "ys\u0014`?udf\u0016!:)$d";
        objectArray[54] = "@\u001bd~5>]\u000ef?0b\u0016";
        objectArray[55] = "%or\u0007\u0003_8zpF\u0006\u0003q8";
        objectArray[56] = "ATp\u0011\r\u00114t{\u001e\u001c^Uzp\u0015\u0018\u0004!";
        objectArray[57] = "UIqr+\u0017 iz}:XAgqv>\u00025";
        objectArray[58] = "6v9\u0014/\u00036v.H#\f,=.V#\u0019+Lz\u000ep";
        objectArray[59] = "@qA\u0001I=]dC@La\u0010f";
        objectArray[60] = "\u000f8BD\u001aiz\u0018IK\u000b&\u001b\u0016B@\u000f|o";
        objectArray[61] = "&9iia\nS\u0019bfpE2\u0017imt\u001fF";
        objectArray[62] = "\n}%5\u0011Q\n}2i\u001d^\u001062w\u001dK\u0017Ge(K";
        objectArray[63] = " Zr\u0006\u001c\"Uzy\t\rm4tr\u0002\t7@";
        objectArray[64] = "b|$Y3w\u0017\\/V\"8vR$]&b\u0002";
        objectArray[65] = "G9@;+HG9Wg'G]rWy'RZ\u0003\u0006 p\u0010";
        objectArray[66] = "\u001ea|h}1kAwgl~\nO|lh$~";
        objectArray[67] = "\u0004\u000fT\u001bB<\u0004\u000fCGN3\u001eDCYN&\u00195\u0013\u0003\u0018`N\tLT\\&5Y\u0010\u0002";
        objectArray[68] = "a`hMT%a`\u007f\u0011X*{+\u007f\u000fX?|Z/U\u000ey+fp\u0002J?P6,U";
        objectArray[69] = "\u0006\u0002.ISU\u0006\u00029\u0015_Z\u001cI9\u000b_O\u001b8iW\n";
        objectArray[70] = "C\u0012EF \u000362NI1LW<EB5\u0016#";
        objectArray[71] = "!cnYr+<vl\u0018ww}|";
        objectArray[72] = "-K\u001eH}0Xk\u0015Gl\u007f9e\u001eLh%M";
        objectArray[73] = "tTz_J3tTm\u0003F<n\u001fm\u001dF)in?I\u0017h";
        objectArray[74] = "\u000e+(X7\u0017\u000e+?\u0004;\u0018\u0014`?\u001a;\r\u0013\u0011mEjJ";
        objectArray[75] = " ~\u0017g\u001aev|A/%$!\f\u00160_5+;{:]h>8\u0017'W$\"@\u001e'\u0015 >,\u0003-Y<F";
        objectArray[76] = "\u0007+Iw.\u0004\u00175\u0014d\u0016\u0000\u0005-\u0010~z2QlK$.e\r)@an\t\u0010#\f}\u0016\u0000\u0010a\baz\u001d\u001a-\u0014\u0019s\u001dX)\bun\u0017\u00145p|nU\u0010)\u001cad\u0019\fQ";
        objectArray[77] = "*\u001f\r0{<\"[\\0\u001b'#\u0018Uhw\u0015w\\\u000e6\u001b'6TMww:<\u0018Q\u000f~:~\u001cMcc02\u00005jcr6\u001cYwi>*dQt#}.\u001aY0r}N";
        objectArray[78] = "\u001fg\u0012\u0018\u001ff]p\u000eZo0Ep\u0007l\u000e$_jk\u001fU&N+\u0015\u001eU>\u001f\u0016";
        objectArray[79] = "H4<\u0007Pb\u0005,c\u000e/i\u0014-l\u000eC[Bo0T\u0013\f\u00190nU@g\u0016-w\u0013/";
        objectArray[80] = "Uzxz<G\u0018b'sCL\tc(s/~Z't+CNT%(-3Y\b#4\u0014";
        objectArray[81] = "1%]c\u001fug'\u000b+ !=`1>Xx/c]#R43\u001bT#\u00100/wI)\\,W";
        objectArray[82] = "D\u0004\u001a\u0016Yr\u0015\u0006\u0016\u001b(r~^G\u0014\u0014!\u0015QZ\rR";
        objectArray[83] = " 53?e>q7?2\u0014<\u001a6bok<`lt;do\u001aon=(mq`s$n\u0002";
        objectArray[84] = "wS\u0002\nR\u00020\u0012\b\r\u0012gtj\u0012\u000e\u0012\u00156\f\u001b\u0014E[NU\r\u000eQ\u0001p\u0015\u000e\u001dAg";
        objectArray[85] = "!\u001dNv\u0005Pw\u001f\u0018>:\u0004;JDt:\b?\u0013Z6V\u00155_FN_\u0015w[Z\"B\u001f;G\"+B]?[N6H\u0011##";
        objectArray[86] = "`U><j\u000eh\u0011o<\n\u0015iRfdf'=\u0016=8\n\u0015|\u001e~{f\bvRb\u0003";
        objectArray[87] = "Zy141\u007f\u0017an=Nt\u0006`a=\"FU%;jN.\r~{<pn\u000emkZ";
        objectArray[88] = "[\u0012\u0013$P$\u0016\nL-//\u0007\u000bC-C\u001dQI\u001fw\u0011J\n\u0016Av@!\u0005\u000bX0/(\u0007KHu\u0016(\u0015\u001aYJ";
        objectArray[89] = "Z\u00188AB(^JfL/ G[7GT\fQ@9YB\u0006W]3#KsXD3FO!\u0006I^\u001cI/D@`\\J<T&";
        objectArray[90] = ",\tEi\\+s\u0018Q894}\tZinc#^\u0002\u0005\b?,\nAkE's\u0003";
        objectArray[91] = "\u0014[v02IEYz=COaat;=\u0011_\u001bz5|\u0019";
        objectArray[92] = "\"igbQQ*-6b1A'\u007f;1f\u0016}/d]UT~-?#]\u0010/-";
        objectArray[93] = "M\u00046G1H\u001c\u0006:J@I<>3Jp\u000bIDi\\$\u0004\u001a>hJ|\u001fH\u0007hX-\u000ew";
        objectArray[94] = "\u000b{2V XZy>[QZ1!oTm\u000bZ.rM+";
        objectArray[95] = "7L\u001e4G\"fN\u001296/\r\u0014R-Ipw\u0019\u001c+K";
        objectArray[96] = "5/3.\fP1}m#aT*\\04\u001dDQ.3.\u001bSon0=\u000b5";
        objectArray[97] = "m8l2\u0019N~lgl\"JkmakKI\u0011jjtB\u001c(=?jL-";
        objectArray[98] = "O0\u0001\u001cFP_.\\\u000f~TM6X\u0015\u0012f\u0019w\u0003LE1@+ZN\u0011ZO6C\b~QA(\u0004\u001d\u0015^\\1Br\u001ePBvW\u0019\u0011M[08\u0012\u001fS\u001c%S\u001d\u0002JZJ";
        objectArray[99] = "P.I\u000b\u0007-QnUR7y[0@\u0006MsZ:t\bJxX88\u0001\u000bmD.\u0000TYyPUT\u0014Fv\fjUTZ/<";
        objectArray[100] = "~Ph\u0000\br3H7\twy\"I8\t\u001bKt\feRG\u001c7\u000b>\u0001\rd7\\\"\u001cw";
        objectArray[101] = "\u001a\u001aXp\u0019}K\u0018T}hx \u0019\t \u0017\u007fZC\u001ft\u0018, \u001bTo\u00068\u001bA\u000f,\u000eA";
        objectArray[102] = "6\u00170<jcg\u0015<1\u001bn\f\u0014aldavNw8k2\f\u0012j>a92Ri-q_";
        objectArray[103] = "\u0003\u0013Rr\u001bE\u001d\u0013K\"*R\u0011\u001eR{F`FS\u000b-*\fL\u001d\\e\u0011V\u0017^T\u001cU[\u0003\u000f_l\u0015J\u001d\u00052mR\u0006L\u0010RePGEb";
        objectArray[104] = "\u0017;\u001a\u0001\u0018q\u0012xB\u0015\u0001\u001d\u0013\u0001\u001d\tRb\u0010{G\u001f\u0006mC\u0001O\u001d\b!Pm\u001c\u001d\u001cf.";
        objectArray[105] = "\u001dH\u000b9\u0017\u0012__\u0017{gDG]\u000en\u001d*\u001aS\u0010}\u001c\u0017JS\u00153g\u0011W@Hs_S@\\\n\u0003";
        objectArray[106] = "I\u0006C\rO-\u0018\u0004O\u0000>)*<F\u0000\u000enMF\u001c\u0016Za\u001e<\u001d\u0000\u0002zL\u0005\u001d\u0012Sks";
        objectArray[107] = "af[\b4e0dW\u0005Ei[8\u001cPz9%0X\u0001z";
        objectArray[108] = "EG!8[@E\u0010=%!]P\u0005'0Mo\u0003Fzl\u001b8V\u0013>7\u0010\u0001\u0001F 9!";
        objectArray[109] = "\u000en\u001bR\fk\u00192\u001dN5~\u0004\"AUYLRg\u001c\r\t\u001b\u000e#Y\tIt\n>@[5$\u000f<[T\u000bd\f/K2";
        objectArray[110] = "&\u0003L\r{Ak\u001b\u0013\u0004\u0004Jz\u001a\u001c\u0004hx(]ES5/s\u001dD\\dQ{Y\u0015\\\u0004";
        objectArray[111] = "\"A,\u0001\u0007\u001cdR2\u0011P~uN:\u0019\u0005)%\u0016hAiGuT+\u0013\u000b\u0001fJ;D";
        objectArray[112] = "\u001e/\u00116\u00159O-\u001d;d?U\u0015Qo\b:\u001fvB;\u0003d";
        objectArray[113] = "l(3J$0=*?GU3V+6C3u3lwI45";
        objectArray[114] = "T=R{$\u001b\u0019%\rr[\u0010\b$\u0002r7\"^c_*bu\u0001#Z*;\u000b\tg\u000b*[";
        objectArray[115] = "\b|\u001b\nxi\u00008J\n\u0018r\u0001{CRt@W8\u0019\u000b'\u0017\t\u007f\u0013M`{\u0014u_Q\u0018";
        objectArray[116] = "3\u000b6\u001d;\u0015$W0\u0001\u0002\u00009Gl\u001an2k\n4L\u0002\u0002)C7\u0001m\u00064Ze}";
        objectArray[117] = "\u0016z>\u0016)\u000f@xh^\u0016W\u0011\"RKn\u0002\b<>VdN\u0014D7V&J\b(*\\jVp!*\u001enJ\u001c< Rr2";
        objectArray[118] = "\u000fV\u0017$\u0005K\u000f\u0001\u000b9\u007fV\u001a\u0014\u0011,\u0013dJTJ{\u007fX\u001d\u0011\u0011zF\u000fH\u000f\u001fK\u0018\u0003M\bH;\u000f_K\u0014q";
        objectArray[119] = "F,\u0017WgX\u0017.\u001bZ\u0016\\|vJU*\u000b\u0017yWLl";
        objectArray[120] = "*&\u0003\u0011'Doj\\Xp?|z\u0019:6Erq\na.\u0001uu\b\u0004*S+xe";
        objectArray[121] = "G\"|\nyvIaq\u001b\u0010pN\u0014o\rl\fD>`Fvl\u0017hv\u001a\u0010";
        objectArray[122] = "a#~\n\u0013*0!r\u0007b,g\u0019{\u0007Riec!\u0011\u0006f6\u0019 \u0007^}d  \u0015\u000fl[";
        objectArray[123] = "vrz\fem~3$\trU*#`\u000es9\u0018s Q+Uv\u007fz\u001ey.33%W.U";
        objectArray[124] = "cC\u0011nK>p\u0017\u001a0p\u0006C <\u00121\u001bPz\u0001h\u001cb$\u0019\u0012<\u0017<";
        objectArray[125] = "Xi\u0002& tVgC.Q?f;\u0011r.0\u001ca\u0007&!cf=\u001a +hX}\u00193;\u000e";
        objectArray[126] = "\u000fG\u001d3\u00066PV\tbc)^G\u000234~\u0000\u0017[_Zx\u000eF\u0016f_'YV\n";
        objectArray[127] = "E1\\Zx\u001e@0@\u0018'xA]\u0007\u000ex\u0007B']\u0018,\b\u0011]\u0001\u0005*\u0002\u001acA\u00069\u0012|";
        objectArray[128] = ")KZ&0MxIV+AL\u0013N\u0000$;\u0017-\u000e\u00037+";
        objectArray[129] = "4\u0012v:N\u0000iVy<Qc4h\u0018x\f\rvP{%H\u0002pO";
        objectArray[130] = "a\u0014{h\r2iP*hm\"d\u0002';:u>RzW\b45\u0017;;\u0015>y\u000b";
        objectArray[131] = "\nK TEgNLyPM\r]C*ZXZ\n\u001cx\u000444ZE-O^p]\u001c)G";
        objectArray[132] = "\u0006W!Ia@FF?C\f^\u0018V:H[\rI\u0003n$s\\\u0006V3T3M\u0018\\";
        objectArray[133] = "9J\u00136<d{]\u000ftL7e_\u000ea' \u0002V\u0004b|:b\u0005Rt \\<\u000bV6t6:\u0000\u001a3L";
        objectArray[134] = "\u0005?3Da?H'lM\u001e4Y&cMr\u0006\nc:\u001a\u001ehZ!\u007fD|.I?o\u0013\u001e6\u0004`c\u0013n!Xf\u007f*";
        objectArray[135] = "gs\u0015;\"H6q\u00196SNfIM kK=7Ed:K";
        objectArray[136] = "M\u000bI\u0012\\yL\u000bQCa`\n|U\u0003\f\u0007N\u0001\rBYmH\nAGa9@\r\u000b@\u000b?KA\u000ex";
        objectArray[137] = "Q\u0002]/9M\u0000\u0000Q\"HLk\u0001\f\u007f7O\u0011[\u001a+8\u001ck\u0007\u0007-2\u0017UG\u0004>\"q";
        objectArray[138] = "}^\\y\u0014\foW\\gf\u0004m]Az\u000f\u0007\u0017ZJe\u0006R.\r\u001f{\bc";
        objectArray[139] = "+AIZ9k#\u0000\u0017_.Sw\u0010SX/?EG\u001e\u0005po\u0012BIZ25,\u0002JI\"S";
        objectArray[140] = "{\u001e;|Z\u001d?\u0019bxRw'\u001a vL\u001b\u0015N`*\u0014w)\u001d%v\u001aN~H;x+N(H8\u007fB\r(\u001a9k+";
        objectArray[141] = "|\u001f\rL/z|H\u0011QUgi]\u000bD9U:\u0018W\u0012k\u0002oK\u0012Cd;8\u001e\fMU`i\u001d\u0000\u001cl`{L\u0011#";
        objectArray[142] = "cf\u0005>\u001269=F6kh5*\u001a7\u0007ZaiD`Q\r87\u0018l\u0004f7*\u0001*k";
        objectArray[143] = "H\u0019a{\u001eJ\u0005\u0001>raA\u0014\u00001r\rsBBm(\\$\u0019\u001d3)\u000eO\u0016\u0000*oa";
        objectArray[144] = "yJ\u0011-e\f*J\u0005j\u001bY\u0012\n\u0016!d^hP\u0000uk\r\u0012Q\u0016-p_+Q\u0004|a`";
        objectArray[145] = "\\\u0003I\nrt\r\u0001E\u0007\u0003rf\u0000\u0018Z|v\u001cZ\u000e\u000es%fR\u001f\u0013cy_\u0005J\rmH";
        objectArray[146] = "L\f3O\u0019(\u001a\u000ee\u0007&pCB_\u0012^%RJ3\u000fTiN2:\u000f\u0016mR^'\u0005Zq*W'G^mFJ-\u000bB\u0015";
        objectArray[147] = "jWp\u0005g`'O/\f\u0018k6N \ftYa\u000epQ(\u000edT\"\u0011~0$W1\u0001\u0018";
        objectArray[148] = "LN0W\u0011\u0019\u0013_$\u0006t\u0006\u001dN/W#QB\u0013t;\u001f\u000e\u0005ZtV\u0014\u0002\u0016";
        objectArray[149] = "VzXP\u001cm\f!\u001bXe3\u00006GY\t\u0001Rq\u001e\u000eTV\t1\u001f\u0001\u0005(\u0001uN\u0001e";
        objectArray[150] = "qF_sG\u0019t\u001c\u001e5Dhw~Xs\u0015\u000e1\u001b\u001f2\u001f\tq";
        objectArray[151] = "\u000b\u0016\u0018D\u0007:Z\u0014\u0014Iv=1GN]\u00167\b\u0010\u001bC\u0018";
        objectArray[152] = "\u000fuGr\u0006\u0016R1Ht\u0019u\u000f )0GKS6E5\u0004\u0013G/";
        objectArray[153] = ",\f\nSF\bs\u001d\u001e\u0002#\u0017}\f\u0015St@#_H?\\\b|\u000f@MB\be_";
        objectArray[154] = "]3\u0006\\\u001be\u0007hETb;\u000b\u007f\u0019U\u000e\t\\2D\n^^Ye\u001bH\u0004`\u0019f\bXb";
        objectArray[155] = ":hgFwDx\u007f{\u0004\u0007\u0019`\u007f\u001e\u0010|\re)!\u0011<\u0011<\u0019#F\u007f\u0016<g\"FgG\u0001";
        objectArray[156] = "5[\u0014a\u007f\u0006$L\u0012 G]MYO#5\u0015+PUt{m*]U!;\u0002.@LsGR+BW|y\u0012(QG\u001a";
        objectArray[157] = "!8?w\f[p:3z}ZW\u0002:zM\u0018%x`l\u0019\u0017v\u0002azA\f$;ah\u0010\u001d\u001b";
        objectArray[158] = "+sO%519zO;G\u0018,uI-<\"Av\\<\",.dU<<";
        objectArray[159] = "\t~nW\u00124\u0001:?Wr/\u0000y6\u000f\u001e\u001dT=lPr.\u0016=i\b\f&Rlih\u00161U:6\u0016\u001eu\u0004:V";
        objectArray[160] = "W8P*/\u0001G&\r9\u0017\u0005U>\t#{7\u0001\u007fRu,`X#\u000bxx\u000bW>\u0012>\u0017\u0000Y U+|\u000fD9\u0013D";
        objectArray[161] = " {:\n7#mce\u0003H(|bj\u0003$\u001a(.5UxMue2[(3}!c[H";
        objectArray[162] = "2<5Z+Q\u007f$jSTZn%eS8h8g9\tk?c8g\b;Tl%~NT]nen\u000bm]|4\u007f4";
        objectArray[163] = "4kvmN\"<*(hY\u001ah:loXvZl)3\u000f#\rhvmE|3(u~U\u001a";
        objectArray[164] = "\u0005g^Mm\u0006^7\n@\u0015\u0006@#^Bp}\u0007(J\u0011eEE?VS\u0015";
        objectArray[165] = "'\u0002aLsgq\u00007\u0004L!8Fqt)\"qDu\u00184(=X\r\u00114j9Da\f>&%<";
        objectArray[166] = "h\u0000w|R%`D&|25m\u0016+/eb7FuCW#<\u00037/J)p\u001f";
        objectArray[167] = "\u000eW~mnQ_Ur`\u001fR4T/=`SN\u000e9io\u00004R$oe\u000b\n\u0012'|um";
        objectArray[168] = "\u0018$m(I \rsr;86\u001b7w B!0)l\u0007E(\u0012N4q\u0004vN$2zHsvp:}\u0002t\u001cv11\u0007L";
        objectArray[169] = "tWa\u0010J\u0015q\r VIdsofDA\u001bs\u0015<R\u0015\u0014 o`O\u0013\u001e+Q L\u0000\u000eM";
        objectArray[170] = "zvZv\t\u0005!&\u000e{q\u001f8\u0005Rh\r\u000fCwQr\u000b\u0018}7Ra\u001b~";
        objectArray[171] = "k\u0000L2q_`\f_K+_|\u0006R'\u0019\u000b0Z\buN\u000b>\u000bS35Pn_^K";
        objectArray[172] = "{h\u001b2\u0001\u0000*j\u0017?p\u0003AkJb\u000f\u0002;1\\6\u0000QAi\u0017-\u001eEz3Ln\u0016<";
        objectArray[173] = "\u001b(:\u0000*bJ*6\r[c}\u0012?\rk!\u001fhe\u001b?.L\u0012d\rg5\u001e+d\u001f6$!";
        objectArray[174] = "t\u0012kc_\u0012|V:c?\u0002q\u000470hU+Tk\\Z\u0014 \u0011+0G\u001el\r";
        objectArray[175] = "\u0012\u0014[C\u001f\u0010C\u0016WNn\u0011(\u0017\n\u0013\u0011\u0012RM\u001cG\u001eA(K\u001f\u0013\u0016TDV\u0015_\n,";
        objectArray[176] = "\u0000_J6-/\u000eQ\u000b>\\d>\rYb#kDWO6,8>]Z(e:]\b_o'U";
        objectArray[177] = "R>\u001aPp+_p\u001cR\u001em0w\u000e\u001faoJ-\u0018Kn<0*]I|<U.\u000f\u0017qQ";
        objectArray[178] = " \u0004E&oL2\rE8\u001de#\u000eT/\u001dI%\u0017\\1r[,\u0017B";
        objectArray[179] = "on\u0018RV\u0010>l\u0014_'\u0011\u0016T\u001d_\u0017Sk.GIC\\8TF_\u001bGjmFMJVU";
        objectArray[180] = "\u001bnz\u0003AD\u001c:rGQuLbm\u001cW\"\u001e20A\u0007uE~xCG\u001aAca\u0011";
        objectArray[181] = "\u000eDXQqw\t\u0010P\u0015aFYHONg\u0011\u0007\u0019\u0019\u0011\u000b!JQ\u0019Vd%WHK";
        objectArray[182] = "\u0018GR6)d\u000b\u0013Yh\u0012F(:s\tn>\bA\u0005j}j\u0003\u001f";
        objectArray[183] = "Q(\u0018c\b2\u000bs[kql\u0007d\u0007j\u001d^Q![=H\tU~\u0005w\u00177\u0015}\u0016gq";
        objectArray[184] = "3,55]&`,!r#sXe2rO/):#f\u001e";
        objectArray[185] = "i\n$b\u000fi8\b(o~h80!oN*mJ{y\u001a%>0zoB>l\tz}\u0013/S";
        objectArray[186] = "\\!ug|>\bq}l`\u000f.[Z_GSe%\"\u007f|}Tqrwwa";
        objectArray[187] = "f\u0012\u0013gt17\u0010\u001fj\u00057\\\u0013\u001fxktgID;c";
        objectArray[188] = "\n~u3~9\u0019*~mE\u00117\u001dRH\u0004\u001c9Ge5)eM$va\";";
        objectArray[189] = "b:\u001ce]\u0005\"2QuOx><]zU\u0014\fh\u001d \nxb;\u001e~[\u0011!;L\u007fOx9<\u001dq\rA9.L`2";
        Object[] objectArray2 = objectArray;
        objectArray[190] = "t\u000f\u0000\u001fl,%\r\f\u0012\u001d-\u00175\u0005\u0012-opO_\u0004y`#5^\u0012!{q\f^\u0000pjN";
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5C" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
        int n = _5C.e(l2, l3);
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
                clazz3 = _5C.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5C.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5C.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5C.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5C.f(632246447972059L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5C.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5C.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5C.f(632246447972059L, 0L);
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
            int n = _5C.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _5C.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5C.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5C.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5C.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5C.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5C" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5C.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x7720;
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
                throw new RuntimeException("dev/krypton/5C", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5C.e[n2] = n3;
        }
        return e[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field g(long l2, long l3) {
        int n = _5C.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _5C.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5C.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5C.c(clazz3, string2, clazz2)) != null) {
                    _5C.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5C.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5C.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5C.f(632246447972059L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private float float_6(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f2 = ((Float)objectArray[2]).floatValue();
        float f3 = ((Float)objectArray[3]).floatValue();
        l2 = b ^ l2;
        return f2 + _5C.c("\u00e1", (float)(f3 - f2), 3329613819403257348L, (long)l2) * f;
    }

    @Override
    public native void cfr_renamed_2();

    private int int_2(Object[] objectArray) {
        Object object;
        block9: {
            long l2 = (Long)objectArray[0];
            long l3 = (l2 = b ^ l2) ^ 0x11AB012AB2A4L;
            _4w[] wArray = _3s.cfr_renamed_5();
            int n = 0;
            while (n < _5C.a("i", 30480, (long)(0x6E012B7362527014L ^ l2))) {
                _4w[] wArray2;
                block7: {
                    block8: {
                        block10: {
                            CallSite callSite = _5C.c("\u00d0", (Object)_5C.c("\u00d0", (Object)_5C.c("\u00f4", (Object)_5C.c("\u00f4", (Object)this, -1149491994538954764L, (long)l2), -1138142521106099254L, (long)l2), -1136248962664503584L, (long)l2), (int)n, -1134984581365995696L, (long)l2);
                            try {
                                try {
                                    try {
                                        wArray2 = wArray;
                                        if (l2 < 0L) break block7;
                                        if (wArray2 != null) break block8;
                                        object = _5C.c("\u00e1", (long)l3, (Object)_5C.c("\u00d0", (Object)callSite, -1135167294566187681L, (long)l2), -1151466242735067084L, (long)l2);
                                        if (wArray != null) break block9;
                                    }
                                    catch (MatchException matchException) {
                                        throw _5C.a(matchException);
                                    }
                                    if (object == 0) break block10;
                                }
                                catch (MatchException matchException) {
                                    throw _5C.a(matchException);
                                }
                                return n;
                            }
                            catch (MatchException matchException) {
                                throw _5C.a(matchException);
                            }
                        }
                        ++n;
                    }
                    wArray2 = wArray;
                }
                if (wArray2 == null) continue;
            }
            object = -1;
        }
        return object;
    }

    private boolean cfr_renamed_3(long l2, class_742 class_7422) {
        Object object;
        block2: {
            block3: {
                long l3 = (l2 = b ^ l2) ^ 0x689ECC62A489L;
                _4w[] wArray = _3s.cfr_renamed_5();
                try {
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l3;
                    objectArray[0] = class_7422;
                    object = _5C.c("\u00d0", (Object)this, (Object)objectArray, 4269955586155244348L, (long)l2);
                    if (wArray != null) break block2;
                    if (object != false) break block3;
                }
                catch (MatchException matchException) {
                    throw _5C.a(matchException);
                }
                object = true;
                break block2;
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @_3i_0
    public void cfr_renamed_6(_40 var1_1) {
        _5C c;
        long l2;
        long l3;
        block15: {
            block16: {
                _4w[] wArray;
                block14: {
                    CallSite callSite;
                    block13: {
                        l3 = b ^ 0x285EBE3D07AEL;
                        l2 = l3 ^ 0x2171BCA129B3L;
                        wArray = _3s.cfr_renamed_5();
                        try {
                            try {
                                try {
                                    callSite = _5C.c("\u00f4", (Object)this, 6897659581004775489L, (long)l3);
                                    if (wArray != null) break block13;
                                    if (_5C.c("\u00f4", (Object)callSite, 6882000099446209663L, (long)l3) == null) return;
                                }
                                catch (MatchException matchException) {
                                    throw _5C.a(matchException);
                                }
                                c = this;
                                if (wArray != null) break block14;
                            }
                            catch (MatchException matchException) {
                                throw _5C.a(matchException);
                            }
                            callSite = _5C.c("\u00f4", (Object)c, 6897659581004775489L, (long)l3);
                        }
                        catch (MatchException matchException) {
                            throw _5C.a(matchException);
                        }
                    }
                    try {
                        if (_5C.c("\u00f4", (Object)callSite, 6895665565389344788L, (long)l3) == null) {
                            return;
                        }
                    }
                    catch (MatchException matchException) {
                        throw _5C.a(matchException);
                    }
                    c = this;
                }
                try {
                    try {
                        if (wArray != null) break block15;
                        if (_5C.c("\u00f4", (Object)c, 6897094401115076245L, (long)l3) != false) break block16;
                        return;
                    }
                    catch (MatchException matchException) {
                        throw _5C.a(matchException);
                    }
                }
                catch (MatchException matchException) {
                    throw _5C.a(matchException);
                }
            }
            Object[] objectArray = new Object[4];
            objectArray[3] = Float.valueOf((float)_5C.c("\u00f4", (Object)this, 6882559566710522615L, (long)l3));
            objectArray[2] = Float.valueOf((float)_5C.c("\u00d0", (Object)_5C.c("\u00f4", (Object)_5C.c("\u00f4", (Object)this, 6897659581004775489L, (long)l3), 6882000099446209663L, (long)l3), 6882822668385317294L, (long)l3));
            objectArray[1] = Float.valueOf((float)_5C.c("\u00f4", (Object)this, 6884468272980214044L, (long)l3));
            objectArray[0] = l2;
            _5C.c("\u00d0", (Object)_5C.c("\u00f4", (Object)_5C.c("\u00f4", (Object)this, 6897659581004775489L, (long)l3), 6882000099446209663L, (long)l3), (float)_5C.c("\u00d0", (Object)this, (Object)objectArray, 6882492923416659978L, (long)l3), 6881904214803854308L, (long)l3);
            c = this;
        }
        Object[] objectArray = new Object[4];
        objectArray[3] = Float.valueOf((float)_5C.c("\u00f4", (Object)this, 6881721362304590087L, (long)l3));
        objectArray[2] = Float.valueOf((float)_5C.c("\u00d0", (Object)_5C.c("\u00f4", (Object)_5C.c("\u00f4", (Object)this, 6897659581004775489L, (long)l3), 6882000099446209663L, (long)l3), 6896326455136954663L, (long)l3));
        objectArray[1] = Float.valueOf((float)_5C.c("\u00f4", (Object)this, 6884468272980214044L, (long)l3));
        objectArray[0] = l2;
        _5C.c("\u00d0", (Object)_5C.c("\u00f4", (Object)_5C.c("\u00f4", (Object)c, 6897659581004775489L, (long)l3), 6882000099446209663L, (long)l3), (float)_5C.c("\u00d0", (Object)this, (Object)objectArray, 6882492923416659978L, (long)l3), 6899482841238350175L, (long)l3);
    }

    private static boolean cfr_renamed_6(String string, long l2, class_742 class_7422) {
        l2 = b ^ l2;
        return (boolean)_5C.c("\u00d0", (Object)_5C.c("\u00d0", (Object)_5C.c("\u00d0", (Object)class_7422, -8700739049478233906L, (long)l2), -8700885805365100741L, (long)l2), (Object)string, -8698593774386123605L, (long)l2);
    }

    private double double_5(Object[] objectArray) {
        class_243 class_2432 = (class_243)objectArray[0];
        class_243 class_2433 = (class_243)objectArray[1];
        long l2 = (Long)objectArray[2];
        l2 = b ^ l2;
        reference var6_5 = _5C.c("\u00f4", (Object)class_2432, 1390919396008934024L, (long)l2) - _5C.c("\u00f4", (Object)class_2433, 1390919396008934024L, (long)l2);
        reference var8_6 = _5C.c("\u00f4", (Object)class_2432, 1391521003602196704L, (long)l2) - _5C.c("\u00f4", (Object)class_2433, 1391521003602196704L, (long)l2);
        return (double)_5C.c("\u00e1", (double)(var6_5 * var6_5 + var8_6 * var8_6), 1390881528698286128L, (long)l2);
    }

    private boolean boolean_5(Object[] objectArray) {
        CallSite callSite;
        block4: {
            long l2;
            long l3;
            block5: {
                l3 = (Long)objectArray[0];
                l2 = (l3 = b ^ l3) ^ 0x30289E203F85L;
                _4w[] wArray = _3s.cfr_renamed_5();
                try {
                    try {
                        callSite = _5C.c("\u00d0", (Object)_5C.c("\u00d0", (Object)_5C.c("\u00f4", (Object)_5C.c("\u00f4", (Object)this, 1590112196465740265L, (long)l3), 1596975669839328727L, (long)l3), 1597434347103157269L, (long)l3), (Object)_5C.c("G", 1590367178125045253L, (long)l3), 1595500047805428384L, (long)l3);
                        if (wArray != null) break block4;
                        if (callSite == false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _5C.a(matchException);
                    }
                    return true;
                }
                catch (MatchException matchException) {
                    throw _5C.a(matchException);
                }
            }
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = _5C.c("G", 1590367178125045253L, (long)l3);
            objectArray2[0] = l2;
            callSite = _5C.c("\u00e1", (Object)objectArray2, 1594544367752753600L, (long)l3);
        }
        return (boolean)callSite;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private class_1657 net_minecraft_class_1657_7(Object[] objectArray) {
        CallSite callSite;
        CallSite callSite2;
        int n;
        int n2;
        int n3;
        long l2;
        long l3;
        long l4;
        long l5;
        block7: {
            _4w[] wArray;
            block6: {
                l5 = (Long)objectArray[0];
                long l6 = l5 = b ^ l5;
                l4 = l6 ^ 0x5411BC3AEFFAL;
                long l7 = l6 ^ 0x3D193EA3ACC6L;
                l3 = l6 ^ 0x1D58A1E453FCL;
                l2 = l6 ^ 0x2F8AF721AC84L;
                long l8 = l6 ^ 0x5B0664DE9470L;
                n3 = (int)(l8 >>> 32);
                n2 = (int)(l8 << 32 >>> 48);
                n = (int)(l8 << 48 >>> 48);
                wArray = _3s.cfr_renamed_5();
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l7;
                callSite2 = _5C.c("\u00d0", (Object)_5C.c("\u00f4", (Object)this, -8319081250147238362L, (long)l5), (Object)objectArray2, -8307104009264538114L, (long)l5);
                try {
                    callSite = callSite2;
                    if (wArray != null) break block6;
                    if (callSite == null) return null;
                }
                catch (MatchException matchException) {
                    throw _5C.a(matchException);
                }
                callSite = callSite2;
            }
            try {
                try {
                    if (wArray != null) return (class_1657)callSite;
                    if (_5C.c("\u00d0", (Object)callSite, -8321707821992835716L, (long)l5) == false) break block7;
                    return null;
                }
                catch (MatchException matchException) {
                    throw _5C.a(matchException);
                }
            }
            catch (MatchException matchException) {
                throw _5C.a(matchException);
            }
        }
        callSite = _5C.c("\u00d0", (Object)_5C.c("\u00d0", (Object)_5C.c("\u00d0", (Object)_5C.c("\u00d0", (Object)_5C.c("\u00d0", (Object)_5C.c("\u00d0", (Object)_5C.c("\u00d0", (Object)_5C.c("\u00d0", (Object)_5C.c("\u00f4", (Object)_5C.c("\u00f4", (Object)this, -8307643877853375667L, (long)l5), -8305083619099475176L, (long)l5), -8308654135710764938L, (long)l5), -8308445015111851607L, (long)l5), arg_0 -> this.cfr_renamed_9(l2, arg_0), -8322325920384365989L, (long)l5), arg_0 -> _5C.cfr_renamed_5(n3, n2, (short)n, arg_0), -8322325920384365989L, (long)l5), arg_0 -> _5C.cfr_renamed_6((String)((Object)callSite2), l3, arg_0), -8322325920384365989L, (long)l5), arg_0 -> this.cfr_renamed_3(l4, arg_0), -8322325920384365989L, (long)l5), -8320175516725688934L, (long)l5), null, -8306468556346608382L, (long)l5);
        return (class_1657)callSite;
    }

    private boolean cfr_renamed_9(long l2, class_742 class_7422) {
        boolean bl;
        l2 = b ^ l2;
        try {
            bl = class_7422 != _5C.c("\u00f4", (Object)_5C.c("\u00f4", (Object)this, 8649191448517552112L, (long)l2), 8660624098290932686L, (long)l2);
        }
        catch (MatchException matchException) {
            throw _5C.a(matchException);
        }
        return bl;
    }

    private boolean boolean_7(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = b ^ l2;
        return (boolean)_5C.c("\u00d0", (Object)_5C.c("\u00d0", (Object)_5C.c("\u00f4", (Object)_5C.c("\u00f4", (Object)this, 611135622093100931L, (long)l2), 595494309854178237L, (long)l2), (Object)_5C.c("G", 598667816530069473L, (long)l2), 609298064223998764L, (long)l2), (Object)_5C.c("G", 610357700344857654L, (long)l2), 598517872459164874L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5C.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5C.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

