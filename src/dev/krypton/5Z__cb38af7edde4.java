/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1923
 *  net.minecraft.class_2338$class_2339
 *  net.minecraft.class_2680
 *  net.minecraft.class_2818
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._3i_0;
import dev.krypton._4r;
import dev.krypton._6Q;
import dev.krypton._6c_0;
import dev.krypton._6x_0;
import dev.krypton._7J;
import dev.krypton._8B;
import dev.krypton._8F;
import dev.krypton._9o;
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
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1923;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2818;

public class _5Z
extends _6x_0 {
    private static final int cfr_renamed_6;
    private static final int cfr_renamed_7;
    private static final int cfr_renamed_2;
    private static final int cfr_renamed_3;
    private static final int cfr_renamed_8;
    private final Set cfr_renamed_4;
    private final Set cfr_renamed_0;
    private final Set cfr_renamed_9;
    private final Queue cfr_renamed_1;
    private static final long b;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static final long[] j;
    private static final Integer[] k;
    private static final Map l;
    private static final Object[] m;
    private static final String[] n;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean boolean_1(Object[] objectArray) {
        Object object;
        class_1923 class_19232 = (class_1923)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = (l2 = b ^ l2) ^ 0x58B91A795BEAL;
        int n = _8F.cfr_renamed_7();
        int n2 = -1;
        block9: do {
            object = n2;
            block10: while (object <= 1) {
                int n3 = -1;
                block11: while (true) {
                    if (n == 0) return n3 != 0;
                    int n4 = n3;
                    while (n4 <= 1) {
                        int n5;
                        block21: {
                            block22: {
                                block23: {
                                    int n6;
                                    Object object2;
                                    block24: {
                                        block25: {
                                            CallSite callSite;
                                            block26: {
                                                _5Z z;
                                                class_1923 class_19233;
                                                block20: {
                                                    class_19233 = new class_1923((int)(_5Z.d("y", (Object)class_19232, -7142851993219385890L, (long)l2) + n2), (int)(_5Z.d("y", (Object)class_19232, -7143254478037510878L, (long)l2) + n4));
                                                    try {
                                                        z = this;
                                                        if (n == 0) break block20;
                                                        object = _5Z.d("\u00ce", (Object)_5Z.d("y", (Object)z, -7145920954480848257L, (long)l2), (Object)class_19233, -7143678057133654020L, (long)l2);
                                                        if (n == 0) continue block10;
                                                        if (l2 <= 0L) continue block11;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _5Z.a(matchException);
                                                    }
                                                    if (l2 < 0L) boolean bl;
                                                    return bl;
                                                    if (object != 0) {
                                                        return true;
                                                    }
                                                    z = this;
                                                }
                                                callSite = _5Z.d("\u00ce", (Object)_5Z.d("\u00ce", (Object)_5Z.d("y", (Object)_5Z.d("y", (Object)z, -7146745842814203702L, (long)l2), -7142940451552181587L, (long)l2), -7144075952254067111L, (long)l2), (int)_5Z.d("y", (Object)class_19233, -7142851993219385890L, (long)l2), (int)_5Z.d("y", (Object)class_19233, -7143254478037510878L, (long)l2), -7143859285624756153L, (long)l2);
                                                try {
                                                    try {
                                                        n5 = n;
                                                        if (l2 <= 0L) break block21;
                                                        if (n5 == 0) break block22;
                                                        if (callSite == null) break block23;
                                                        object2 = _5Z.d("\u00ce", (Object)callSite, -7151376611152714403L, (long)l2);
                                                        n6 = n;
                                                        if (l2 <= 0L) break block24;
                                                        if (n6 == 0) break block25;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _5Z.a(matchException);
                                                    }
                                                    if (object2 == false) break block26;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _5Z.a(matchException);
                                                }
                                                if (l2 > 0L) break block23;
                                            }
                                            Object[] objectArray2 = new Object[2];
                                            objectArray2[1] = callSite;
                                            objectArray2[0] = l3;
                                            object2 = _5Z.d("\u00ce", (Object)this, (Object)objectArray2, -7144350960209597860L, (long)l2);
                                        }
                                        n6 = n;
                                    }
                                    if (n6 == 0) return (boolean)object2;
                                    if (object2 != false) {
                                        object2 = true;
                                        return (boolean)object2;
                                    }
                                }
                                ++n4;
                            }
                            n5 = n;
                        }
                        if (n5 != 0) continue;
                    }
                    break;
                }
                ++n2;
                object = n;
                if (l2 <= 0L) {
                    continue;
                }
                continue block9;
            }
            return 0 != 0;
        } while (object != 0);
        return 0 != 0;
    }

    @Override
    public native void cfr_renamed_5();

    /*
     * Exception decompiling
     */
    private int int_1(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [8[WHILELOOP]], but top level block is 9[WHILELOOP]
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
     * Exception decompiling
     */
    private void cfr_renamed_353(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [41[DOLOOP]], but top level block is 61[SIMPLE_IF_TAKEN]
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void cfr_renamed_93(Object[] var1_1) {
        block68: {
            block69: {
                block58: {
                    block59: {
                        block60: {
                            block61: {
                                block62: {
                                    block57: {
                                        block55: {
                                            block54: {
                                                var3_2 = (Long)var1_1[0];
                                                var2_3 = (class_2818)var1_1[1];
                                                v0 = var3_2 = _5Z.b ^ var3_2;
                                                var5_4 = v0 ^ 42536864736269L;
                                                var7_5 = v0 ^ 97436863462563L;
                                                var9_6 = v0 ^ 58882106091689L;
                                                var11_7 = v0 ^ 63394026612072L;
                                                var13_8 = v0 ^ 44403642713877L;
                                                var15_9 = v0 ^ 135905123246968L;
                                                var17_10 = _8F.cfr_renamed_8();
                                                var18_11 = _5Z.d("\u00ce", (Object)var2_3, (long)-6684199306211552259L, (long)var3_2);
                                                try {
                                                    v1 = _5Z.d("\u00ce", (Object)_5Z.d("y", (Object)this, (long)-6685732685685432977L, (long)var3_2), (Object)var18_11, (long)-6684484578397880293L, (long)var3_2);
                                                    if (var17_10 != 0) break block54;
                                                    if (v1 != false) {
                                                        return;
                                                    }
                                                }
                                                catch (MatchException v2) {
                                                    throw _5Z.a(v2);
                                                }
                                                v1 = _5Z.d("y", (Object)_5Z.d("\u00ce", (Object)_5Z.d("y", (Object)_5Z.d("y", (Object)this, (long)-6685920667323304147L, (long)var3_2), (long)-6684589769452883908L, (long)var3_2), (long)-6690980192547398873L, (long)var3_2), (long)-6685589377160541639L, (long)var3_2);
                                            }
                                            var19_12 = v1;
                                            var20_13 = _5Z.d("y", (Object)_5Z.d("\u00ce", (Object)_5Z.d("y", (Object)_5Z.d("y", (Object)this, (long)-6685920667323304147L, (long)var3_2), (long)-6684589769452883908L, (long)var3_2), (long)-6690980192547398873L, (long)var3_2), (long)-6685186892480894267L, (long)var3_2);
                                            try {
                                                try {
                                                    if (var3_2 < 0L) break block55;
                                                    v3 = _5Z.d("\u00e8", (int)_5Z.d("\u00e8", (int)(_5Z.d("y", (Object)var18_11, (long)-6685589377160541639L, (long)var3_2) - var19_12), (long)-6685948817874510008L, (long)var3_2), (int)_5Z.d("\u00e8", (int)(_5Z.d("y", (Object)var18_11, (long)-6685186892480894267L, (long)var3_2) - var20_13), (long)-6685948817874510008L, (long)var3_2), (long)-6690485204205093527L, (long)var3_2);
                                                    if (var17_10 != 0) break block55;
                                                    if (v3 <= _5Z.c("i", (int)20523, (long)(218946662121247224L ^ var3_2))) {
                                                        return;
                                                    }
                                                }
                                                catch (MatchException v4) {
                                                    throw _5Z.a(v4);
                                                }
                                            }
                                            catch (MatchException v5) {
                                                throw _5Z.a(v5);
                                            }
                                            v3 = _5Z.d("\u00ce", (Object)_5Z.d("y", (Object)this, (long)-6685732685685432977L, (long)var3_2), (Object)var18_11, (long)-6684020603398528439L, (long)var3_2);
                                        }
                                        v6 = new Object[2];
                                        v6[1] = var15_9;
                                        v6[0] = var2_3;
                                        var21_14 = _5Z.d("\u00ce", (Object)this, (Object)v6, (long)-6685010653698037309L, (long)var3_2);
                                        try {
                                            v7 /* !! */  = _5Z.d("\u00ce", (Object)var21_14, (long)-6686839367926311917L, (long)var3_2);
                                            v8 = var17_10;
                                            if (var3_2 >= 0L) {
                                                if (v8 != 0) break block57;
                                                if (v7 /* !! */  != false) {
                                                    return;
                                                }
                                            }
                                            ** GOTO lbl66
                                        }
                                        catch (MatchException v9) {
                                            throw _5Z.a(v9);
                                        }
                                        v10 = new Object[2];
                                        v10[1] = var2_3;
                                        v10[0] = var5_4;
                                        v7 /* !! */  = _5Z.d("\u00ce", (Object)this, (Object)v10, (long)-6684093150460160581L, (long)var3_2);
                                    }
                                    try {
                                        try {
                                            v8 = var17_10;
lbl66:
                                            // 2 sources

                                            if (var3_2 < 0L) break block58;
                                            if (v8 != 0) break block59;
                                            if (v7 /* !! */  != false) {
                                                v11 = _5Z.d("\u00ce", (Object)_5Z.d("y", (Object)this, (long)-6686745014486618728L, (long)var3_2), (Object)var18_11, (long)-6684020603398528439L, (long)var3_2);
                                                if (var17_10 != 0) break block60;
                                            }
                                            ** GOTO lbl156
                                        }
                                        catch (MatchException v12) {
                                            throw _5Z.a(v12);
                                        }
                                        if (v11 == false) break block61;
                                    }
                                    catch (MatchException v13) {
                                        throw _5Z.a(v13);
                                    }
                                    var22_15 = _5Z.c("i", (int)29892, (long)(3854479046330070303L ^ var3_2));
                                    var23_16 = false;
                                    var24_18 = _5Z.d("\u00ce", (Object)_5Z.d("y", (Object)this, (long)-6686745014486618728L, (long)var3_2), (long)-6690697547449056392L, (long)var3_2);
                                    block35: while (true) {
                                        v14 /* !! */  = _5Z.d("\u00ce", (Object)var24_18, (long)-6687296549543222134L, (long)var3_2);
                                        while (v14 /* !! */  != false) {
                                            block73: {
                                                block67: {
                                                    block65: {
                                                        block66: {
                                                            block63: {
                                                                block64: {
                                                                    var25_20 = (class_1923)_5Z.d("\u00ce", (Object)var24_18, (long)-6691211500028670137L, (long)var3_2);
                                                                    try {
                                                                        try {
                                                                            v7 /* !! */  = _5Z.d("\u00ce", (Object)var25_20, (Object)var18_11, (long)-6686659729225973777L, (long)var3_2);
                                                                            v15 = var17_10;
                                                                            if (var3_2 < 0L || var3_2 < 0L) ** GOTO lbl135
                                                                            if (v15 != 0) break block62;
                                                                            v16 = var17_10;
                                                                            if (var3_2 >= 0L) {
                                                                                if (v16 != 0) break block63;
                                                                            }
                                                                            ** GOTO lbl110
                                                                        }
                                                                        catch (MatchException v17) {
                                                                            throw _5Z.a(v17);
                                                                        }
                                                                        if (v7 /* !! */  == false) break block64;
                                                                    }
                                                                    catch (MatchException v18) {
                                                                        throw _5Z.a(v18);
                                                                    }
                                                                    if (var3_2 >= 0L) continue block35;
                                                                }
                                                                v14 /* !! */  = _5Z.d("\u00e8", (int)_5Z.d("\u00e8", (int)(_5Z.d("y", (Object)var25_20, (long)-6685589377160541639L, (long)var3_2) - _5Z.d("y", (Object)var18_11, (long)-6685589377160541639L, (long)var3_2)), (long)-6685948817874510008L, (long)var3_2), (int)_5Z.d("\u00e8", (int)(_5Z.d("y", (Object)var25_20, (long)-6685186892480894267L, (long)var3_2) - _5Z.d("y", (Object)var18_11, (long)-6685186892480894267L, (long)var3_2)), (long)-6685948817874510008L, (long)var3_2), (long)-6690485204205093527L, (long)var3_2);
                                                            }
                                                            try {
                                                                if (var3_2 <= 0L) break block65;
                                                                v16 = var17_10;
lbl110:
                                                                // 2 sources

                                                                if (v16 != 0) break block66;
                                                                if (v14 /* !! */  > var22_15) break block67;
                                                                v19 = true;
                                                            }
                                                            catch (MatchException v20) {
                                                                throw _5Z.a(v20);
                                                            }
                                                        }
                                                        var23_16 = v19;
                                                        v14 /* !! */  = (CallSite)var17_10;
                                                    }
                                                    if (var3_2 > 0L) {
                                                        if (v14 /* !! */  == false) break block35;
                                                    }
                                                    break block73;
                                                }
                                                v14 /* !! */  = (CallSite)var17_10;
                                            }
                                            if (var3_2 < 0L) continue;
                                            if (v14 /* !! */  != false) break block35;
                                            continue block35;
                                        }
                                        break;
                                    }
                                    v7 /* !! */  = (CallSite)var23_16;
                                }
                                try {
                                    if (var3_2 <= 0L) ** GOTO lbl154
                                    v15 = var17_10;
lbl135:
                                    // 2 sources

                                    if (v15 != 0) break block60;
                                    if (v7 /* !! */  == false) {
                                        v21 = new Object[3];
                                        v21[2] = (String)_5Z.a("q", (int)2934, (long)(5244908376783267253L ^ var3_2)) + (int)(_5Z.d("y", (Object)var18_11, (long)-6685589377160541639L, (long)var3_2) * _5Z.c("i", (int)2942, (long)(8916492615584565934L ^ var3_2)) + _5Z.c("i", (int)15275, (long)(4641523932688808569L ^ var3_2))) + (String)_5Z.a("q", (int)20756, (long)(3825410934951837652L ^ var3_2)) + (int)(_5Z.d("y", (Object)var18_11, (long)-6685186892480894267L, (long)var3_2) * _5Z.c("i", (int)2942, (long)(8916492615584565934L ^ var3_2)) + _5Z.c("i", (int)19971, (long)(4831792961917358042L ^ var3_2)));
                                        v21[1] = var13_8;
                                        v21[0] = _5Z.a("q", (int)8872, (long)(4993722150697733226L ^ var3_2));
                                        _5Z.d("\u00e8", (Object)v21, (long)-6690810121106476408L, (long)var3_2);
                                    }
                                }
                                catch (MatchException v22) {
                                    throw _5Z.a(v22);
                                }
                            }
                            v11 = _5Z.d("\u00ce", (Object)_5Z.d("y", (Object)this, (long)-6690438765912500797L, (long)var3_2), (Predicate<class_1923>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, 2(long net.minecraft.class_1923 net.minecraft.class_1923 ), (Lnet/minecraft/class_1923;)Z)((long)var11_7, (class_1923)var18_11), (long)-6683906057289512401L, (long)var3_2);
                        }
                        try {
                            v7 /* !! */  = (CallSite)var17_10;
lbl154:
                            // 2 sources

                            if (var3_2 < 0L) break block59;
                            if (v7 /* !! */  == false) return;
lbl156:
                            // 2 sources

                            v23 = new Object[2];
                            v23[1] = var7_5;
                            v23[0] = var18_11;
                            v7 /* !! */  = _5Z.d("\u00ce", (Object)this, (Object)v23, (long)-6685383518251758240L, (long)var3_2);
                        }
                        catch (MatchException v24) {
                            throw _5Z.a(v24);
                        }
                    }
                    v8 = var17_10;
                }
                if (v8 == 0) {
                    if (v7 /* !! */  != false) {
                        return;
                    }
                    v7 /* !! */  = (CallSite)false;
                }
                var22_15 = v7 /* !! */ ;
                var23_17 = _5Z.d("\u00ce", (Object)var21_14, (long)-6687657122345362992L, (long)var3_2);
                block37: while (_5Z.d("\u00ce", (Object)var23_17, (long)-6687296549543222134L, (long)var3_2) != false) {
                    var24_19 = _5Z.d("\u00ce", (Object)((Integer)_5Z.d("\u00ce", (Object)var23_17, (long)-6691211500028670137L, (long)var3_2)), (long)-6690253575014137620L, (long)var3_2);
                    do {
                        block71: {
                            block72: {
                                block70: {
                                    try {
                                        try {
                                            try {
                                                v25 = new Object[3];
                                                v25[2] = (int)var24_19;
                                                v25[1] = var9_6;
                                                v25[0] = var2_3;
                                                v26 = _5Z.d("\u00ce", (Object)this, (Object)v25, (long)-6685632680496814460L, (long)var3_2);
                                                v27 = var17_10;
                                                if (var3_2 <= 0L) break block68;
                                                if (v27 != 0) break block69;
                                                if (var17_10 != 0) break block70;
                                            }
                                            catch (MatchException v28) {
                                                throw _5Z.a(v28);
                                            }
                                            if (var3_2 <= 0L) break block71;
                                            if (v26 < _5Z.c("i", (int)11091, (long)(5775691624611375751L ^ var3_2))) break block72;
                                        }
                                        catch (MatchException v29) {
                                            throw _5Z.a(v29);
                                        }
                                        v30 = true;
                                    }
                                    catch (MatchException v31) {
                                        throw _5Z.a(v31);
                                    }
                                }
                                var22_15 = v30;
                                v32 = var17_10;
                                if (var3_2 > 0L) {
                                    if (v32 == 0) break block37;
                                }
                                break block71;
                            }
                            v32 = var17_10;
                        }
                        if (v32 == 0) continue block37;
                    } while (var3_2 <= 0L);
                }
                v26 = var22_15;
            }
            v27 = var17_10;
        }
        if (v27 != 0) return;
        if (v26 == false) {
            return;
        }
        v26 = _5Z.d("\u00ce", (Object)_5Z.d("y", (Object)this, (long)-6690438765912500797L, (long)var3_2), (Object)var18_11, (long)-6684020603398528439L, (long)var3_2);
    }

    public _5Z(long l2) {
        long l3 = (l2 = b ^ l2) ^ 0x56465362FFE9L;
        super((int)_5Z.c("i", 4869, (long)(0x664506AD6535273AL ^ l2)), -1, (_4r)((Object)_5Z.d("z", 6255667335234308276L, (long)l2)), l3);
        this.cfr_renamed_4 = _5Z.d("\u00e8", 6258486821434062978L, (long)l2);
        this.cfr_renamed_0 = _5Z.d("\u00e8", 6258486821434062978L, (long)l2);
        this.cfr_renamed_9 = _5Z.d("\u00e8", 6258486821434062978L, (long)l2);
        this.cfr_renamed_1 = new ConcurrentLinkedQueue();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    a.init(_5Z.class, 61);
                    _5Z.b = dev.krypton.l.a(2464319181882639569L, 7298190509071715004L, MethodHandles.lookup().lookupClass()).a(183705454034295L);
                    _5Z.m = new Object[123];
                    _5Z.n = new String[123];
                    _5Z.b();
                    _5Z.f = new HashMap<K, V>(13);
                    var11 = _5Z.b ^ 38097918339156L;
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
                    var20_3 = new String[3];
                    var18_4 = 0;
                    var17_5 = "\u00fa[\u0094\n\u00df\u00cf\u00eaw\u0092P\u008eB\u00dfSC\u0099t-j\u00132fpC\u0081\u00a5\u009b\u00ab\u0090T\u00bc\u00f8.Lo\u0087\u009d\u0097\u008af\u0010\u00bf\u0086\u00c9>\u00a6\u0081H\u00ce0\u009c\u00cb\u00fa\u00a9\u0085\u00196\u0010\u001b\u00ec}\u001f\u0086\u00fbUD\f\u00afP'\u001e\t\u00e7\u0014";
                    var19_6 = "\u00fa[\u0094\n\u00df\u00cf\u00eaw\u0092P\u008eB\u00dfSC\u0099t-j\u00132fpC\u0081\u00a5\u009b\u00ab\u0090T\u00bc\u00f8.Lo\u0087\u009d\u0097\u008af\u0010\u00bf\u0086\u00c9>\u00a6\u0081H\u00ce0\u009c\u00cb\u00fa\u00a9\u0085\u00196\u0010\u001b\u00ec}\u001f\u0086\u00fbUD\f\u00afP'\u001e\t\u00e7\u0014".length();
                    var16_7 = 40;
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
                        var20_3[var18_4++] = _5Z.b(var21_9).intern();
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
                _5Z.d = var20_3;
                _5Z.e = new String[3];
                _5Z.l = new HashMap<K, V>(13);
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
                var6_12 = new long[23];
                var3_13 = 0;
                var4_14 = "\u00f9\u008f\u008bK\u00ae\u00ea\u00a1\u001b\u0094y\u00b3\u00b8\u0080x\u00fa\u0007O\u0097\u00f6i\u008b\u00a2\u00b5\u00cb$wZ\u0002\u0013\u00b6~+\u00ad\u00aa\u0001\u0015\u0089`\u00b4[\u00f0l\u00d7\u008ci\u00be]\u00a2Z1\u000f\u008a9Z\u00fcT8\u0019\u00a9\u00f0\u00a5\u00c8&G\u0088TLP\u00d4\u0003\u00fft\u000b\u00bf\u0086\u00f0\u00d6\u00fd\u00a5\u0015\u00b4\u00c1\u0093\u00f3\u00864\u001a)\u00d3\u009e\u000f\tX\u00156MF%\u00d4\u0015\u00d9\u008a\u00bf\u00c0gC\u00f4\u00cb;\u00e3\u0019s\u00dd\u001a(\u009a6Y\u00d6\rd\u00d8i\u00f1\u00da\u000f\u00c1! \u00c9et\u00d6b5\u009a\u00d2\u0001\u00dfd=(\u00c9\rC\u0095\u00ff\u008f\u00e5\u0090\u00cd\u00d8B\u00f4@Y\u0019\u0004\u00d9\u0004\u00da\u001cQA\u00ae\u00e5\u00e5\u0084";
                var5_15 = "\u00f9\u008f\u008bK\u00ae\u00ea\u00a1\u001b\u0094y\u00b3\u00b8\u0080x\u00fa\u0007O\u0097\u00f6i\u008b\u00a2\u00b5\u00cb$wZ\u0002\u0013\u00b6~+\u00ad\u00aa\u0001\u0015\u0089`\u00b4[\u00f0l\u00d7\u008ci\u00be]\u00a2Z1\u000f\u008a9Z\u00fcT8\u0019\u00a9\u00f0\u00a5\u00c8&G\u0088TLP\u00d4\u0003\u00fft\u000b\u00bf\u0086\u00f0\u00d6\u00fd\u00a5\u0015\u00b4\u00c1\u0093\u00f3\u00864\u001a)\u00d3\u009e\u000f\tX\u00156MF%\u00d4\u0015\u00d9\u008a\u00bf\u00c0gC\u00f4\u00cb;\u00e3\u0019s\u00dd\u001a(\u009a6Y\u00d6\rd\u00d8i\u00f1\u00da\u000f\u00c1! \u00c9et\u00d6b5\u009a\u00d2\u0001\u00dfd=(\u00c9\rC\u0095\u00ff\u008f\u00e5\u0090\u00cd\u00d8B\u00f4@Y\u0019\u0004\u00d9\u0004\u00da\u001cQA\u00ae\u00e5\u00e5\u0084".length();
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
                    var4_14 = "\u00f49[vA^\u00ee\u00fb\u00c7\u00eb\u00c7~$QH\u00d0";
                    var5_15 = "\u00f49[vA^\u00ee\u00fb\u00c7\u00eb\u00c7~$QH\u00d0".length();
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
        _5Z.j = var6_12;
        _5Z.k = new Integer[23];
        _5Z.cfr_renamed_2 = (int)_5Z.c("i", (int)5386, (long)(var11 ^ 2950864094772567282L));
        _5Z.cfr_renamed_6 = (int)_5Z.c("i", (int)256, (long)(var11 ^ 4573242504841988324L));
        _5Z.cfr_renamed_7 = (int)_5Z.c("i", (int)13283, (long)(var11 ^ 4436802784936212993L));
        _5Z.cfr_renamed_8 = (int)_5Z.c("i", (int)23724, (long)(var11 ^ 1473682306813089095L));
        _5Z.cfr_renamed_3 = (int)_5Z.c("i", (int)12805, (long)(var11 ^ 5125948025100876794L));
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (_5Z.n[n3] != null) {
            return n3;
        }
        Object object = m[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 32;
            case 1 -> 24;
            case 2 -> 53;
            case 3 -> 40;
            case 4 -> 45;
            case 5 -> 34;
            case 6 -> 35;
            case 7 -> 60;
            case 8 -> 15;
            case 9 -> 63;
            case 10 -> 50;
            case 11 -> 38;
            case 12 -> 39;
            case 13 -> 57;
            case 14 -> 47;
            case 15 -> 21;
            case 16 -> 8;
            case 17 -> 28;
            case 18 -> 49;
            case 19 -> 33;
            case 20 -> 22;
            case 21 -> 27;
            case 22 -> 3;
            case 23 -> 52;
            case 24 -> 30;
            case 25 -> 62;
            case 26 -> 16;
            case 27 -> 2;
            case 28 -> 37;
            case 29 -> 43;
            case 30 -> 58;
            case 31 -> 0;
            case 32 -> 31;
            case 33 -> 13;
            case 34 -> 7;
            case 35 -> 59;
            case 36 -> 55;
            case 37 -> 29;
            case 38 -> 41;
            case 39 -> 17;
            case 40 -> 46;
            case 41 -> 26;
            case 42 -> 56;
            case 43 -> 10;
            case 44 -> 11;
            case 45 -> 44;
            case 46 -> 36;
            case 47 -> 9;
            case 48 -> 25;
            case 49 -> 18;
            case 50 -> 6;
            case 51 -> 5;
            case 52 -> 51;
            case 53 -> 19;
            case 54 -> 48;
            case 55 -> 12;
            case 56 -> 1;
            case 57 -> 54;
            case 58 -> 42;
            case 59 -> 61;
            case 60 -> 4;
            case 61 -> 23;
            case 62 -> 20;
            default -> 14;
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
        _5Z.n[n3] = new String(cArray);
        return n3;
    }

    private static String b(byte[] byArray) {
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

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'y' || c == '\u00dd' || c == 'z' || c == 'h') {
                field = _5Z.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'y' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00dd' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'z' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5Z.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ce' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e8' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        Object[] objectArray = m;
        m[0] = "JT$g\u001e\u000eJT3;\u0012\u0001P\u001f3%\u0012\u0014Wnb\u007fDU";
        objectArray[1] = Integer.TYPE;
        _5Z.n[1] = "java/lang/Integer";
        objectArray[2] = "\u001dv{sws\u0003~a<\bs\u0012bh";
        objectArray[3] = "yD]9qQrKLv\u0010_y@H,";
        objectArray[4] = Boolean.TYPE;
        _5Z.n[4] = "java/lang/Boolean";
        objectArray[5] = "9a\u007fv\u0010~$t}7\u0015\"h^";
        objectArray[6] = "R#RR\u0006\u0010Y,C\u001de\u001dL*";
        objectArray[7] = "7U\u0000}4f)]\u001a2Iv)";
        objectArray[8] = "sx%\u0002\u001d\u001cxw4Mz\u001em|4\u0006A";
        objectArray[9] = "H\u0012zE\u0006\fH\u0012m\u0019\n\u0003RYm\u0007\n\u0016U(<SZ]";
        objectArray[10] = "%\u0012/S\u001eW%\u00128\u000f\u0012X?Y8\u0011\u0012M8(jDA\r";
        objectArray[11] = "bAVUt<\u0017a]ZesvoVQa)\u0002";
        objectArray[12] = "n\b.\u0018\u0014>p\u00004Ws?a\u001b9\rU9";
        objectArray[13] = "YWq\u0003\u0015\u0005G_kL]\u0005]Us\u000bT\u001e\u001dfu\u0007_\u0019PWs\u0007";
        objectArray[14] = "mi\u0016\u00056Zmi\u0001Y:Uw\"\u0001G:@pSU\u001fm";
        objectArray[15] = "))Ls3^4<N26\u0002~x";
        objectArray[16] = "\u007frI\u0013Kk\nRB\u001cZ$k\\I\u0017^~\u001f";
        objectArray[17] = Void.TYPE;
        _5Z.n[17] = "java/lang/Void";
        objectArray[18] = "d[G\u001d\u001d^\u0011{L\u0012\f\u0011puG\u0019\bK\u0004";
        objectArray[19] = "\r6BG92\u0013>X\b[.\u0014#";
        objectArray[20] = " w>+0j w)w<e:<)i<p=My4m";
        objectArray[21] = "Wf\u0012l\u0001\u0014\"F\u0019c\u0010[CH\u0012h\u0014\u00017";
        objectArray[22] = "\u001bA\u0019NbL\u0006T\u001b\u000fg\u0010I\\";
        objectArray[23] = "\u0016d\u00040\u000b]cD\u000f?\u001a\u0012\u0002J\u00044\u001eHv";
        objectArray[24] = "E\u000bOB0\u0012E\u000bX\u001e<\u001d_@X\u0000<\bX1\tToM";
        objectArray[25] = "B\u0001\u0000\u0006(1t$\u0000\u0006?mx+\u001aM?sx>\u001d<n'+{U";
        objectArray[26] = "[[W:,-[[@f \"A\u0010@x 7Fa\u0011\"yt";
        objectArray[27] = "GqV\u0016{+GqAJw$]:ATw1ZK\u0010\n\"z";
        objectArray[28] = "\u0012oaF}$\u0012ov\u001aq+\b$v\u0004q>\u000fU'Z${";
        objectArray[29] = "=[J\u0007X\u0004=[][T\u000b'\u0010]ET\u001e a\b\u001a\r";
        objectArray[30] = "\\lk\u00117Z\\l|M;UF'|S;@AV)\fk";
        objectArray[31] = "a\u0011mx)ya\u0011z$%v{Zz:%c|++ew(+\u0017u77cPF*e}";
        objectArray[32] = "1srN>\u00131se\u00122\u001c+8e\f2\t,I4S`B";
        objectArray[33] = "\u001e%hy}9k\u0005cvlv\n\u000bh}h,~";
        objectArray[34] = "T:s\u0014\u0003o!\u001ax\u001b\u0012 @\u0014s\u0010\u0016z4";
        objectArray[35] = "U<F)\u0011` \u001cM&\u0000/A\u0012F-\u0004u5";
        objectArray[36] = "f(k\"\u0017\u0014{=ic\u0012H:\u000f";
        objectArray[37] = ".\u0014\u0000{A\u000f3\u0001\u0002:DS~\u001a";
        objectArray[38] = "Z=rP\u001eT/\u001dy_\u000f\u001bN\u0013rT\u000bA:";
        objectArray[39] = "\u001e\tu~LG\u0000\u0001o16@\u0011\rPz\u0016";
        objectArray[40] = "5\u0019n&Z-(\flg_qh\u0004";
        objectArray[41] = "~%\u0004x?\u0006c0\u00069:Z.2";
        objectArray[42] = "3b\u0018)r$-j\u0002f?>7`\u001b:.47w@\u000b3?:v\u001c:9?-K\u000f;4\u001c8s";
        objectArray[43] = "ObXgvOQjB(;UK`[t*_Kw\u0000E7TFv\\t=TQKOu0wDs\nM=CvfZP1_R";
        objectArray[44] = "H\u007f\u0001'Q>=_\n(@q\\Q\u0001#D+(";
        objectArray[45] = "<l\u0017y\u0014\"!y\u00158\u0011~lO";
        objectArray[46] = "\u000e8<b\u0005\u007f{\u00187m\u00140\u001a\u0016<f\u0010jn";
        objectArray[47] = Double.TYPE;
        _5Z.n[47] = "java/lang/Double";
        objectArray[48] = "\u001dgN4\u0016\u0003\u0003oT{|\u0013\u0006s]";
        objectArray[49] = "U4<hZy\u0010b(fce\u0006&3k\u000fWR`i6X\u0000Pg!<\u001cy\t5)}c";
        objectArray[50] = "\rQ`\u000b/VL\u000eb\u000b\u0017KX\u001f\u0019\u001chQPVe\u0018y_1\u0012f\u001ev\u0017M\u0016w\u0010\u0017SN\u0010xXkW_\u001e\u0019";
        objectArray[51] = "1\u0015Q\\9g3PPO\\h\r\u0012\u001d\u0012b;bJOX;";
        objectArray[52] = "p(H\u0006\u0014*rmI\u0015q.LmZ\u0011\u0016*1+E\u001a\r\u00154-O\u0011\u000fj-pWIq";
        objectArray[53] = "{^0i{i4X/o\u0005e \\\u000f>ay+ ,(ze\u007f\\(9t\u0004";
        objectArray[54] = "n\u007f5q(\u0000w\"-)V@\u0016=1g7Fj9 i";
        objectArray[55] = ">\u0019cl'tf\u0019aR}h'\u0004k>O<bY6i\u0018x$\u001bmkd|5\u0015\f";
        objectArray[56] = "x\u0010y\u0012Q/4TbV0#%\u001df+\n=t\u001d|\u0010S+$\u0001\u001a";
        objectArray[57] = "Q+K,?,[o\u001fw\u0007xP+z1xh\\n\u00065if=m\u0002pwq\u00064\u0014 k\u0017";
        objectArray[58] = "\u001f\u0006\u0018`DO\u001dC\u0019s!J^<\u001bpH\u0017\u001cA]oC\f#V\u0015.S\u0011\u001bX\\cKp";
        objectArray[59] = "x\u0019\bC'\f(\u0010L^U\u0017|\u000e\u0011^9%*KM\u0006kr.\u0016\fTo\u0015l\rL[U";
        objectArray[60] = "~;89\u007f\\;*,,\u0000N+(]nx\u001b7\"f7nK+Dfir\u00178=?;zVG";
        objectArray[61] = "'D\u0005vLV.]\u0006$+\u0014NETsL\u00153\u0003KxW*$K\nhJ\u0012*\u0002Gp+";
        objectArray[62] = "\u001a\u001eB\u0005\u0019>\u0004\u0017\u0018\u0002idd\u000fJ\u0011\u000ee\u0019IU\u001a\u0015Z\b\f\u0015\u0018Qa\u0002HACi";
        objectArray[63] = "jINXFX2\u001b\u0004\u0001%V+\u0014\u0004\u000fYP-yN\u001bF\u000e6\u0013\u0002_]JW";
        objectArray[64] = "f\u0001\u00026\u001fqdD\u0003%zrZD\u0010!\u001dq'\u0002\u000f*\u0006N6GO(Bu<\u0003\u001bsz";
        objectArray[65] = "\u0016XCJ\u0018vS\u000eWD!jEJLIMX\u0011\f\u0014\u0016\u001f\u000fHZW\\\\kA]WD!";
        objectArray[66] = "M>\u0012m*xW-\r7Z3uD\u000f<3d\n9I#8\u007f5.\u0001b(b\r H/0\u0003";
        objectArray[67] = "\u0018j)\u001cSK\u0002tqV,\u001d\u000ea\u0016TTH\u0012k-\rB\u0018\u000e\r-S^D\u001dtt\u0001V\u0005b";
        objectArray[68] = "_2\u001cTp\u000f\u001em\u001eTH\u0012\n|eNq\n\u001d2\u001e\u0005'\u000b\r\f\u0015\u00075\t]w^Q4\u0019c|\\C6I\u00187\nB&w";
        objectArray[69] = "S*\u007f\u001aEPJwgB;\u0013n\u0015y\fDN\u0012i}\u001dJ";
        objectArray[70] = "\f9\u0007I\rU^g\bQu\u000b\u0000d\u0003L\"\\^3[ \u001c\u000e\u0018s\u0015^L\u0007\\n";
        objectArray[71] = "%a\u0010jYz}3Z3:~\u007f7\\=[scQ\u001a,\u0006e~jC:Vy\u0018j\u001d&\nja3O.K\u0015";
        objectArray[72] = ".D\r./1l_M!\u00158pM\u0014/Bg(\u0010ICh)nAI?l8`";
        objectArray[73] = "XGvcIe\n\u0019y{1;T\u001arffl\u000bG)\nR1VO*`\u000fh[L";
        objectArray[74] = "\u0011?~)])\u0013z\u007f:8/-zl>_)P<s5D\u0016\u00168pgGoOjx&8";
        objectArray[75] = "\u000f>? \u00117Lk0y+\u00194B\u000f\u0015+)Ii;sIj\u001cfb";
        objectArray[76] = "\u001903\b\u0011IAbyQrM@mjLrLU0qWJB\u001c}i6";
        objectArray[77] = "eT{\u001dkZ'O;\u0012QS;]b\u001c\u0006\fc\u0000>p,B%Q?\f(S+";
        objectArray[78] = "&vPi/'nhL=V=+kB\fl=j`D75+:|\"f'u$q\u001ahn8<\u0010";
        objectArray[79] = "\u0011G7Doj\u001d\u0003=E\u0013>\u001c\u0007,\u0013\u007f\fHJqN([@\u0015+\u0013x)\r\u00191J\u0013`L\t|\u000bj9\u001e\u0001=t";
        objectArray[80] = "tHUS\u0016h;NJUh{ RI\u0000/kIKK\u0012\t<5OZ\u001ch87W\n\u0013\u0005w1H\fm";
        objectArray[81] = "q:\u007f\u000e\u001b\u001c0e}\u000e#\u001c*{\u0006\u0014\u001a\u00193:}_L\u0018#\u0004v]^\u001as\u007f=\u000b_\nMt?\u0019]Z6?i\u0018Md";
        objectArray[82] = "0\u0004\u000e\"\u001aPx\u001a\u0012vcJ'\u001a|}\u001b\u000e0\u0004G$\r^,b";
        objectArray[83] = "Q$\u000e| #Sa\u000foE-m'\rg(c\u0016b\u001cs=";
        objectArray[84] = "[iQ\t8y\u001exE\u001cGi\u0006{]\u001eGh\u0013&F\u0005\u007ffZk^d";
        objectArray[85] = "\u0014;\u0016>P\u0007I9\u000e\u007f \u0002\u00173\u0016iwVIgL= \u000eOg\u001chL\u000b\t#\u0017";
        objectArray[86] = "J?C?Y\u0006\u000fiW1`\u001a\u0019-L<\f(Oh\u0012c_\u007f\t.S:Y\u0003\r?][";
        objectArray[87] = "\u0007ke_d\u007fZ2h\\Xp\tsf\u00004B_68_g\u0015\u0019py\u0006ai\u001dawg";
        objectArray[88] = "\n`(uAw\n>8*y[\u0016':K\u0002*\u0003eb-\u0002t\u0013:";
        objectArray[89] = "9^@)[\u001cd\u0007M*g\u00137FCv\u000b!`\u000b\u0018,g\u0015&SX/\u0016\u00124B^\u0011";
        objectArray[90] = "R1-\u000bn\u0000U#<\rP\u0014\\1$\u0017<&\u000bt{KhqL2;\u0011i\rH#5p-\u000eN,}\f)\u001f@Mz\u001e?\u0015\b4?H+\u001b1";
        objectArray[91] = "\u001eG\u001f\u0014b8[\u0011\u000b\u001a[$MU\u0010\u00177\u0016\u0019\u0013HHgA\u001fM\r\u001da&]VM\u0012[";
        objectArray[92] = "xe\u00170rAr!CkJ\u0013xu&j2Fd\u007f\u001d3$\u0016x\u0019\u001dm8Jk`D?0\u000b\u0014";
        objectArray[93] = "D\u0002%\rTjFG$\u001e1hxG7\u001aVj\u0005\u0001(\u0011MUC\u0005+CN,\u001aW#\u00021";
        objectArray[94] = "c\u001e[\u0002\u001a5;L\u0011[y32Bk\u0006\u0001f.HP_\u001762.P\u0001\u000bj!W\tS\u0003+^";
        objectArray[95] = "g\u0005&vP\t?Wl/3\u001c7Pq6^'45'&T\u00011Gj*NXZ\u000e+:\u0003\u0019#Wy2Bf";
        objectArray[96] = "4&h\u0003?zi$pBO\u007f7.hT\u0018+iz1\tOsozbU#v)>i";
        objectArray[97] = "b)\u0013V[x`l\u0012E>~\u0000\u0013\u0010FW anVY\\;^y\u001e\u0018L&fwWUTG";
        objectArray[98] = "\u001b_autx\u0011\u001b5.L8\u0016Q=\u00151<\bBii5-\u0006#";
        objectArray[99] = "\bD#4~\u001fN@z/B@\u0019@_?3}\u0019C\u001c.=\u0019\nCd+3^\u000f?";
        objectArray[100] = "AW\u0007[\bA\u0003LGT2C\u0013O\u001aQ^qN\b@\u00062[\u0001L\u001b\u000fN_\u0010Bz";
        objectArray[101] = "HT'x\u0006S\r\u00023v?O\u001bF({S}F\u0001r$?O\u001d^r$G\u0015FY.\u001c^N\u0004C1rES\u000eQH";
        objectArray[102] = "M\u000ey;u#GJ-`MyZ?-#1i!Iu)}gX\u0010'!<\u0018";
        objectArray[103] = "\u0013*&3q\u0006\u0011o' \u0014\u0001/-j}*Z@u87s";
        objectArray[104] = "\u001f\u0010/\\=^\u0004\r%NDU\u0013\b=B(gDJg\u001dx0\u001cMdK)\\\u0019\u000b @D";
        objectArray[105] = "W\u0010^\fn\u001c\u0012\u0001J\u0019\u0011\u001c\u000f\u001dVal\u0018\u0011\u000e\u0002\u001dh\t\u001fo";
        objectArray[106] = "H,T\u0005w\u007fBh\u0000^O%X=\u001f\f3#^PU\u0018,}E:\u0019\\79$";
        objectArray[107] = ">Z)\u0003e{c\u0003$\u0000Yt0B*\\5Ff\u0007t\u0003a\u0011 A5Z`m$P;;";
        objectArray[108] = "OQ\u00027lqM\u0014\u0003$\tus\u0014\u0010 nq\u000eR\u000f+uN\u001f\u0017O)1u\u0015S\u001br\t";
        objectArray[109] = "G/i)\u00103In0 o0N,5*\u0003\u0002\u001ahluTU^/*,V)Z>$M\u0012*\\1l1\u0016;RP(2\u00104\u001a,,#\u001eUG/i)\u00103In0 o";
        objectArray[110] = "\u0006J]\b1'C[I\u001dN$XQ\\et$\u0003E^^-2SY8";
        objectArray[111] = "y\u001c]X\u0012n5XF\u001csd \u001ax\f\u0003xIZ\u0003\u0013C{0\u0003Q\u001b\u0002\u0004";
        objectArray[112] = "NB3b?\u0015\fYsm\u0005\u0017\u001cZ.hi%A\u001dt1\u0005\u000f\u000eY/6y\u000b\u001fWN";
        objectArray[113] = "F\u001aLXGU\u000e\u0004P\f>VM1[EBF6G\u0003O\u000eHO\u001eQGO7";
        objectArray[114] = "5\np*|FtUr*DWcO\t=;Ah\ru9*O\tIv?%\u0007uMg1D";
        objectArray[115] = "2N>!{\rb^w!\u0014J\\\\>?}\u000bl\u000e`0e";
        objectArray[116] = "7Y-t!\u0017oY/J{\u000b.D%&I_k\u0019xv\u001e\u001b-[#sb\u001f<UB";
        objectArray[117] = "nJ@M\t?w\u0017X\u0015w{\u0016\bD[\u0016yj\fUU";
        objectArray[118] = "HvE*\u0018\tJ3D9}\ttq\tdCU\u001b)[.\u001a";
        objectArray[119] = "\u001e_.s\u0015,\u001c\u001a/`p*\"\u001a<d\u0017,_\\#o\f\u0013_\u001a-lIo[\u000b#\r";
        objectArray[120] = "^\u0018\u001e\u007f\u0016_\u001c\u0003^p,U\u0018\u0001\nvW8[\u0004_bJ\u0003\u0002\u0012\u000f~,\u0003\\\u000eSmUZ\u000e\u0006\u0012\u0012";
        objectArray[121] = "C\t8'B\u0013ZT \u007f<\\;K<1]UGO-?";
        Object[] objectArray2 = objectArray;
        objectArray[122] = "v\u0011rqojzUxp\u0013>{Qi&\u007f\f-\u001d3p)[-\u0010{ql\"tBs0\u0013";
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _5Z.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5Z" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5Z.c(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static int c(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x62FC;
        if (k[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = j[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])l.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    l.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/5Z", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5Z.k[n2] = n3;
        }
        return k[n2];
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
        int n = _5Z.e(l2, l3);
        Object object = m[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = _5Z.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = _5Z.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5Z.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5Z.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5Z.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5Z.f(274034348210641L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5Z.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5Z.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5Z.f(274034348210641L, 0L);
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
            int n = _5Z.e(l2, l3);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                _5Z.m[n] = clazz = Class.forName(_5Z.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5Z.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5Z.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5Z.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5Z.d(classArray2[j], string, clazz2, n, classArray);
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
            throw new RuntimeException("dev/krypton/5Z" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5Z" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0xDE8;
        if (e[n2] == null) {
            Object[] objectArray;
            try {
                Long l3 = Thread.currentThread().threadId();
                objectArray = (Object[])f.get(l3);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l3, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/5Z", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l2 >>> 56);
            for (int j = 1; j < 8; ++j) {
                byArray[j] = (byte)(l2 << j * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n2].getBytes("ISO-8859-1");
            _5Z.e[n2] = _5Z.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _5Z.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static Field g(long l2, long l3) {
        int n = _5Z.e(l2, l3);
        Object object = m[n];
        if (object instanceof String) {
            String string = _5Z.n[n];
            int n2 = string.indexOf(8);
            Class clazz = _5Z.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5Z.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5Z.c(clazz3, string2, clazz2)) != null) {
                    _5Z.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5Z.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5Z.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5Z.f(274034348210641L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @_3i_0
    public void cfr_renamed_4(_6c_0 c_0) {
        CallSite callSite;
        int n;
        long l2;
        long l3;
        long l4;
        block8: {
            long l5 = l4 = b ^ 0x15AA36A2CDA4L;
            l3 = l5 ^ 0x47636A65E33DL;
            l2 = l5 ^ 0x54CCF79A58CEL;
            n = _8F.cfr_renamed_7();
            try {
                try {
                    callSite = _5Z.d("y", (Object)this, -8143374374656320793L, (long)l4);
                    if (n == 0) break block8;
                    if (_5Z.d("y", (Object)callSite, -8146333178459664256L, (long)l4) == null) return;
                }
                catch (MatchException matchException) {
                    throw _5Z.a(matchException);
                }
                callSite = _5Z.d("y", (Object)this, -8143374374656320793L, (long)l4);
            }
            catch (MatchException matchException) {
                throw _5Z.a(matchException);
            }
        }
        try {
            if (_5Z.d("y", (Object)callSite, -8146541477915533834L, (long)l4) == null) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw _5Z.a(matchException);
        }
        ArrayList arrayList = new ArrayList(_5Z.d("y", (Object)this, -8144247127980244910L, (long)l4));
        ArrayList arrayList2 = new ArrayList(_5Z.d("y", (Object)this, -8147869523221972983L, (long)l4));
        Object[] objectArray = new Object[3];
        objectArray[2] = (int)_5Z.c("i", 19777, (long)(0x137AF33FC261214BL ^ l4));
        objectArray[1] = arrayList;
        objectArray[0] = l2;
        CallSite callSite2 = _5Z.d("\u00ce", (Object)_5Z.d("\u00ce", (Object)this, (Object)objectArray, -8143854215373405634L, (long)l4), -8144036503741696998L, (long)l4);
        while (_5Z.d("\u00ce", (Object)callSite2, -8143693892155291328L, (long)l4) != false) {
            List list = (List)((Object)_5Z.d("\u00ce", (Object)callSite2, -8147521749762743667L, (long)l4));
            Object[] objectArray2 = new Object[6];
            objectArray2[5] = (int)_5Z.c("i", 10039, (long)(0xBF481958C2FCB20L ^ l4));
            objectArray2[4] = (int)_5Z.c("i", 19777, (long)(0x137AF33FC261214BL ^ l4));
            objectArray2[3] = l3;
            objectArray2[2] = arrayList2;
            objectArray2[1] = list;
            objectArray2[0] = c_0;
            _5Z.d("\u00ce", (Object)this, (Object)objectArray2, -8144631618387007605L, (long)l4);
            if (n != 0) continue;
        }
    }

    @Override
    public native void cfr_renamed_2();

    private static boolean cfr_renamed_3(long l2, class_1923 class_19232, class_1923 class_19233) {
        Object object;
        block4: {
            block5: {
                l2 = b ^ l2;
                int n = _8F.cfr_renamed_7();
                try {
                    try {
                        object = _5Z.d("\u00e8", (int)_5Z.d("\u00e8", (int)(_5Z.d("y", (Object)class_19233, 365949092481346581L, (long)l2) - _5Z.d("y", (Object)class_19232, 365949092481346581L, (long)l2)), 367786475999672676L, (long)l2), (int)_5Z.d("\u00e8", (int)(_5Z.d("y", (Object)class_19233, 366320785466756329L, (long)l2) - _5Z.d("y", (Object)class_19232, 366320785466756329L, (long)l2)), 367786475999672676L, (long)l2), 363243488304405317L, (long)l2);
                        if (n == 0) break block4;
                        if (object > true) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _5Z.a(matchException);
                    }
                    object = true;
                    break block4;
                }
                catch (MatchException matchException) {
                    throw _5Z.a(matchException);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    private static boolean cfr_renamed_3(short s, int n, short s2, class_2680 class_26802) {
        boolean bl;
        long l2 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)s2 << 48 >>> 48) ^ b;
        try {
            bl = _5Z.d("\u00ce", (Object)class_26802, -5220734200960006714L, (long)l2) == _5Z.d("z", -5223225562634724978L, (long)l2);
        }
        catch (MatchException matchException) {
            throw _5Z.a(matchException);
        }
        return bl;
    }

    @_3i_0
    public void cfr_renamed_6(_6Q q) {
        long l2 = b ^ 0x40CB815BF619L;
        _5Z.d("\u00ce", (Object)_5Z.d("y", (Object)this, -5383625153541025208L, (long)l2), (Object)new long[]{(long)_5Z.d("\u00ce", (Object)q.cfr_renamed_5, -5381645791981492118L, (long)l2), (long)_5Z.d("\u00ce", (Object)q.cfr_renamed_5, -5386197576202575269L, (long)l2), 0L}, -5381135574919516541L, (long)l2);
    }

    private _8B dev_krypton_8B_3(Object[] objectArray) {
        _8B b = (_8B)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n = (Integer)objectArray[2];
        long l3 = (l2 = _5Z.b ^ l2) ^ 0x587864AF9E3CL;
        try {
            if (n <= 0) {
                return b;
            }
        }
        catch (MatchException matchException) {
            throw _5Z.a(matchException);
        }
        CallSite callSite = _5Z.d("\u00e8", 0.6, (double)n, -2560827424539031154L, (long)l2);
        int n2 = (int)_5Z.d("\u00e8", 0.0, (double)((double)_5Z.d("y", (Object)b, -2561665877571403315L, (long)l2) * callSite), -2561609147593973542L, (long)l2);
        int n3 = (int)_5Z.d("\u00e8", 0.0, (double)((double)_5Z.d("y", (Object)b, -2562564125336070452L, (long)l2) * callSite), -2561609147593973542L, (long)l2);
        int n4 = (int)_5Z.d("\u00e8", 0.0, (double)((double)_5Z.d("y", (Object)b, -2559150797799280405L, (long)l2) * callSite), -2561609147593973542L, (long)l2);
        return new _8B(n2, n3, l3, n4, (int)_5Z.d("y", (Object)b, -2558307145610523121L, (long)l2));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private List java_util_List_3(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        var5_3 = (List)var1_1[1];
        var4_4 = (Integer)var1_1[2];
        var2_2 = _5Z.b ^ var2_2;
        var7_5 = 2 * var4_4;
        var8_6 = new boolean[_5Z.d("\u00ce", (Object)var5_3, (long)-7677857788146336334L, (long)var2_2)];
        var6_7 = _8F.cfr_renamed_7();
        var9_8 = new ArrayList<E>();
        block12: for (var10_9 = 0; var10_9 < _5Z.d("\u00ce", (Object)var5_3, (long)-7677857788146336334L, (long)var2_2); ++var10_9) {
            try {
                if (var8_6[var10_9]) {
                    continue;
                }
            }
            catch (MatchException v0) {
                throw _5Z.a(v0);
            }
            v1 = new ArrayList<E>();
            do {
                var11_10 = v1;
                var12_11 = new ArrayDeque<E>();
                _5Z.d("\u00ce", var12_11, (Object)_5Z.d("\u00e8", (int)var10_9, (long)-7674614449203961944L, (long)var2_2), (long)-7675867980058531712L, (long)var2_2);
                block14: while (true) {
                    v2 /* !! */  = _5Z.d("\u00ce", var12_11, (long)-7676881919057473963L, (long)var2_2);
                    block15: while (v2 /* !! */  == false) {
                        v3 = _5Z.d("\u00ce", (Object)((Integer)_5Z.d("\u00ce", var12_11, (long)-7674465143973411813L, (long)var2_2)), (long)-7681107826040703316L, (long)var2_2);
                        block16: while (true) {
                            block23: {
                                block24: {
                                    block25: {
                                        var13_12 = v3;
                                        try {
                                            try {
                                                v4 = var8_6;
                                                v5 = var13_12;
                                                v6 = var6_7;
                                                if (var2_2 < 0L) break block23;
                                                if (v6 == 0) break block24;
                                                v7 /* !! */  = (CallSite)v4[v5];
                                                if (var6_7 == 0) continue block12;
                                            }
                                            catch (MatchException v8) {
                                                throw _5Z.a(v8);
                                            }
                                            if (v7 /* !! */  == false) break block25;
                                        }
                                        catch (MatchException v9) {
                                            throw _5Z.a(v9);
                                        }
                                        if (var2_2 >= 0L) continue block14;
                                    }
                                    v4 = var8_6;
                                    v5 = var13_12;
                                }
                                v6 = 1;
                            }
                            v4[v5] = v6;
                            var14_13 = (class_1923)_5Z.d("\u00ce", (Object)var5_3, (int)var13_12, (long)-7682014477076947251L, (long)var2_2);
                            _5Z.d("\u00ce", var11_10, (Object)var14_13, (long)-7674846478659163967L, (long)var2_2);
                            var15_14 = 0;
                            while (var15_14 < _5Z.d("\u00ce", (Object)var5_3, (long)-7677857788146336334L, (long)var2_2)) {
                                block27: {
                                    block28: {
                                        block29: {
                                            block26: {
                                                try {
                                                    v10 /* !! */  = var8_6;
                                                    v11 = var6_7;
                                                    if (var2_2 >= 0L) {
                                                        if (v11 == 0) break block26;
                                                        v11 = var15_14;
                                                    }
                                                    v2 /* !! */  = (CallSite)v10 /* !! */ [v11];
                                                    if (var6_7 == 0) continue block15;
                                                    if (var2_2 <= 0L) continue block16;
                                                }
                                                catch (MatchException v12) {
                                                    throw _5Z.a(v12);
                                                }
                                                if (v2 /* !! */  != false) break block29;
                                                v10 /* !! */  = (boolean[])_5Z.d("\u00ce", (Object)var5_3, (int)var15_14, (long)-7682014477076947251L, (long)var2_2);
                                            }
                                            var16_15 = (class_1923)v10 /* !! */ ;
                                            try {
                                                try {
                                                    v13 = var6_7;
                                                    if (var2_2 <= 0L) break block27;
                                                    if (v13 == 0) break block28;
                                                    if (_5Z.d("\u00e8", (int)_5Z.d("\u00e8", (int)(_5Z.d("y", (Object)var14_13, (long)-7676303019530994567L, (long)var2_2) - _5Z.d("y", (Object)var16_15, (long)-7676303019530994567L, (long)var2_2)), (long)-7676680198459905784L, (long)var2_2), (int)_5Z.d("\u00e8", (int)(_5Z.d("y", (Object)var14_13, (long)-7676041409522819963L, (long)var2_2) - _5Z.d("y", (Object)var16_15, (long)-7676041409522819963L, (long)var2_2)), (long)-7676680198459905784L, (long)var2_2), (long)-7681214798079915223L, (long)var2_2) > var7_5) break block29;
                                                }
                                                catch (MatchException v14) {
                                                    throw _5Z.a(v14);
                                                }
                                                _5Z.d("\u00ce", var12_11, (Object)_5Z.d("\u00e8", (int)var15_14, (long)-7674614449203961944L, (long)var2_2), (long)-7675867980058531712L, (long)var2_2);
                                            }
                                            catch (MatchException v15) {
                                                throw _5Z.a(v15);
                                            }
                                        }
                                        ++var15_14;
                                    }
                                    v13 = var6_7;
                                }
lbl91:
                                // 2 sources

                                ** while (v13 == 0)
lbl92:
                                // 1 sources

                            }
                            break;
                        }
lbl93:
                        // 2 sources

                        v13 = var6_7;
                        if (var2_2 <= 0L) ** GOTO lbl91
                        if (v13 == 0) break block14;
                        continue block14;
                    }
                    break;
                }
                v7 /* !! */  = _5Z.d("\u00ce", var9_8, var11_10, (long)-7674846478659163967L, (long)var2_2);
                if (var6_7 != 0) continue block12;
                v1 = var9_8;
            } while (var2_2 <= 0L);
        }
        return v1;
    }

    @_3i_0
    public void cfr_renamed_7(_7J j) {
        long l2 = b ^ 0x5E971D27D1D9L;
        _5Z.d("\u00ce", (Object)_5Z.d("y", (Object)this, -7889012017330447313L, (long)l2), -7886261152536736144L, (long)l2);
        _5Z.d("\u00ce", (Object)_5Z.d("y", (Object)this, -7885318150213180300L, (long)l2), -7886261152536736144L, (long)l2);
        _5Z.d("\u00ce", (Object)_5Z.d("y", (Object)this, -7890042651019154216L, (long)l2), -7886261152536736144L, (long)l2);
        _5Z.d("\u00ce", (Object)_5Z.d("y", (Object)this, -7887602646949268088L, (long)l2), -7887939697758114646L, (long)l2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private List java_util_List_4(Object[] var1_1) {
        var2_2 = (class_2818)var1_1[0];
        var3_3 = (Long)var1_1[1];
        v0 = (var3_3 = _5Z.b ^ var3_3) ^ 87530388731844L;
        var5_4 = (int)(v0 >>> 48);
        var6_5 = (int)(v0 << 16 >>> 32);
        var7_6 = (int)(v0 << 48 >>> 48);
        var9_7 = new ArrayList<E>();
        var10_8 = _5Z.d("\u00ce", (Object)var2_2, (long)-4393786062433310428L, (long)var3_3);
        var8_9 = _8F.cfr_renamed_8();
        var11_10 = 0;
        while (var11_10 < ((CallSite)var10_8).length) {
            block16: {
                block17: {
                    block18: {
                        block21: {
                            block22: {
                                block19: {
                                    block20: {
                                        var12_11 = var10_8[var11_10];
                                        try {
                                            try {
                                                try {
                                                    v1 = var8_9;
                                                    if (var3_3 < 0L) break block16;
                                                    if (v1 != 0) break block17;
                                                    if (var12_11 == null) break block18;
                                                }
                                                catch (MatchException v2) {
                                                    throw _5Z.a(v2);
                                                }
                                                v3 = _5Z.d("\u00ce", (Object)var12_11, (long)-4393034140435259030L, (long)var3_3);
                                                if (var8_9 != 0) break block19;
                                            }
                                            catch (MatchException v4) {
                                                throw _5Z.a(v4);
                                            }
                                            if (v3 == false) break block20;
                                        }
                                        catch (MatchException v5) {
                                            throw _5Z.a(v5);
                                        }
                                        if (var3_3 >= 0L) break block18;
                                    }
                                    v3 = _5Z.d("\u00ce", (Object)var2_2, (long)-4394404710896467449L, (long)var3_3) + var11_10 * _5Z.c("i", (int)27869, (long)(5634490837093043515L ^ var3_3));
                                }
                                var13_12 = v3;
                                try {
                                    try {
                                        v6 = var13_12 + _5Z.c("i", (int)25745, (long)(7063880456208106866L ^ var3_3));
                                        v7 = var8_9;
                                        if (var3_3 > 0L) {
                                            if (v7 != 0) break block21;
                                            if (v6 >= _5Z.c("i", (int)2942, (long)(8916533356325939858L ^ var3_3))) break block22;
                                            break block18;
                                        }
                                        ** GOTO lbl59
                                    }
                                    catch (MatchException v8) {
                                        throw _5Z.a(v8);
                                    }
                                }
                                catch (MatchException v9) {
                                    throw _5Z.a(v9);
                                }
                            }
                            v6 = _5Z.d("\u00ce", (Object)var12_11, (Predicate<class_2680>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, 2(short int short net.minecraft.class_2680 ), (Lnet/minecraft/class_2680;)Z)((short)((short)var5_4), (int)var6_5, (short)((short)var7_6)), (long)-4393930515075476529L, (long)var3_3);
                        }
                        try {
                            try {
                                v7 = var8_9;
lbl59:
                                // 2 sources

                                if (v7 != 0 || v6 == false) break block18;
                            }
                            catch (MatchException v10) {
                                throw _5Z.a(v10);
                            }
                            v6 = _5Z.d("\u00ce", var9_7, (Object)_5Z.d("\u00e8", (int)var11_10, (long)-4394845615217227308L, (long)var3_3), (long)-4395123832222269763L, (long)var3_3);
                        }
                        catch (MatchException v11) {
                            throw _5Z.a(v11);
                        }
                    }
                    ++var11_10;
                }
                v1 = var8_9;
            }
            if (v1 == 0) continue;
        }
        return var9_7;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean boolean_5(Object[] objectArray) {
        int n;
        long l2 = (Long)objectArray[0];
        class_2818 class_28182 = (class_2818)objectArray[1];
        l2 = b ^ l2;
        CallSite callSite = _5Z.d("\u00ce", (Object)_5Z.d("\u00ce", (Object)class_28182, -8901940797213887308L, (long)l2), -8899367378544060092L, (long)l2);
        CallSite callSite2 = _5Z.d("\u00ce", (Object)_5Z.d("\u00ce", (Object)class_28182, -8901940797213887308L, (long)l2), -8900774577509402696L, (long)l2);
        reference var8_6 = _5Z.d("\u00e8", (int)_5Z.d("\u00ce", (Object)_5Z.d("y", (Object)_5Z.d("y", (Object)this, -8899158266721120156L, (long)l2), -8903242969761261053L, (long)l2), -8901661870167722414L, (long)l2), (int)_5Z.c("i", 2942, (long)(0x7BBDBEED8194EDE7L ^ l2)), -8903723112189519328L, (long)l2);
        CallSite callSite3 = _5Z.d("\u00ce", (Object)_5Z.d("y", (Object)_5Z.d("y", (Object)this, -8899158266721120156L, (long)l2), -8903242969761261053L, (long)l2), -8900806681973330178L, (long)l2);
        int n2 = _8F.cfr_renamed_8();
        class_2338.class_2339 class_23392 = new class_2338.class_2339();
        reference var11_10 = var8_6;
        do {
            Object object = var11_10;
            block7: while (true) {
                if (object > callSite3) return 0 != 0;
                int n3 = 0;
                if (n2 != 0) return n3 != 0;
                int n4 = n3;
                block8: while (n4 < _5Z.c("i", 2942, (long)(0x7BBDBEED8194EDE7L ^ l2))) {
                    object = false;
                    do {
                        int n5;
                        block17: {
                            block18: {
                                if (n2 != 0) continue block7;
                                reference var13_12 = object;
                                block10: while (var13_12 < _5Z.c("i", 2942, (long)(0x7BBDBEED8194EDE7L ^ l2))) {
                                    try {
                                        try {
                                            try {
                                                _5Z.d("\u00ce", (Object)class_23392, (int)(callSite + n4), (int)var11_10, (int)(callSite2 + var13_12), -8901268695263884814L, (long)l2);
                                            }
                                            catch (MatchException matchException) {
                                                throw _5Z.a(matchException);
                                            }
                                        }
                                        catch (MatchException matchException) {
                                            throw _5Z.a(matchException);
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw _5Z.a(matchException);
                                    }
                                    do {
                                        n5 = n2;
                                        if (l2 < 0L) break block17;
                                        if (n5 == 0) {
                                            int n6 = n2;
                                            if (l2 > 0L) {
                                                if (n6 == 0) {
                                                    if (_5Z.d("\u00ce", (Object)_5Z.d("\u00ce", (Object)class_28182, (Object)class_23392, -8900720885694686263L, (long)l2), -8901068062318201293L, (long)l2) == _5Z.d("z", -8901835115968861573L, (long)l2)) {
                                                        return true;
                                                    }
                                                    ++var13_12;
                                                }
                                                n6 = n2;
                                            }
                                            if (n6 == 0) continue block10;
                                        }
                                        break block18;
                                    } while (l2 <= 0L);
                                }
                                ++n4;
                            }
                            n5 = n2;
                        }
                        if (n5 == 0) continue block8;
                        ++var11_10;
                        n = n2;
                    } while (l2 < 0L);
                }
                break;
            }
        } while (n == 0);
        return 0 != 0;
    }

    private boolean cfr_renamed_8(long l2, class_1923 class_19232) {
        Object object;
        block6: {
            block7: {
                block5: {
                    CallSite callSite;
                    int n;
                    block4: {
                        l2 = b ^ l2;
                        n = _8F.cfr_renamed_8();
                        CallSite callSite2 = _5Z.d("\u00ce", (Object)_5Z.d("\u00ce", (Object)_5Z.d("y", (Object)_5Z.d("y", (Object)this, -1595473184499417664L, (long)l2), -1597308284740978777L, (long)l2), -1598441591654896813L, (long)l2), (int)_5Z.d("y", (Object)class_19232, -1597255155735543596L, (long)l2), (int)_5Z.d("y", (Object)class_19232, -1597622328272592856L, (long)l2), -1598218462239744691L, (long)l2);
                        try {
                            callSite = callSite2;
                            if (n != 0) break block4;
                            if (callSite == null) break block5;
                        }
                        catch (MatchException matchException) {
                            throw _5Z.a(matchException);
                        }
                        callSite = callSite2;
                    }
                    try {
                        object = _5Z.d("\u00ce", (Object)callSite, -1600148071881387945L, (long)l2);
                        if (n != 0) break block6;
                        if (!object) break block7;
                    }
                    catch (MatchException matchException) {
                        throw _5Z.a(matchException);
                    }
                }
                object = true;
                break block6;
            }
            object = 0;
        }
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @_3i_0
    public void cfr_renamed_8(_9o o) {
        _5Z z;
        long l2;
        long l3;
        block17: {
            CallSite callSite;
            int n;
            long l4;
            block16: {
                long l5 = l3 = b ^ 0x4D98E85D316AL;
                l4 = l5 ^ 0x440F21C59240L;
                l2 = l5 ^ 0x2F0B3F45D8ADL;
                n = _8F.cfr_renamed_8();
                try {
                    try {
                        callSite = _5Z.d("y", (Object)this, 8228837467343070761L, (long)l3);
                        if (n != 0) break block16;
                        if (_5Z.d("y", (Object)callSite, 8231508165813939278L, (long)l3) == null) return;
                    }
                    catch (MatchException matchException) {
                        throw _5Z.a(matchException);
                    }
                    callSite = _5Z.d("y", (Object)this, 8228837467343070761L, (long)l3);
                }
                catch (MatchException matchException) {
                    throw _5Z.a(matchException);
                }
            }
            try {
                if (_5Z.d("y", (Object)callSite, 8232566387724525880L, (long)l3) == null) {
                    return;
                }
            }
            catch (MatchException matchException) {
                throw _5Z.a(matchException);
            }
            int n2 = 0;
            CallSite callSite2 = _5Z.d("\u00ce", (Object)_5Z.d("y", (Object)this, 8231040944931247419L, (long)l3), 8229224573347446465L, (long)l3);
            while (n2++ < callSite2) {
                CallSite callSite3;
                block21: {
                    block22: {
                        Object object;
                        int n3;
                        int n4;
                        int n5;
                        block20: {
                            block19: {
                                CallSite callSite4;
                                block18: {
                                    try {
                                        z = this;
                                        if (n != 0 || n != 0) break block17;
                                    }
                                    catch (MatchException matchException) {
                                        throw _5Z.a(matchException);
                                    }
                                    long[] lArray = (long[])_5Z.d("\u00ce", (Object)_5Z.d("y", (Object)z, 8231040944931247419L, (long)l3), 8229753638186113483L, (long)l3);
                                    if (lArray == null) break;
                                    n5 = (int)lArray[0];
                                    n4 = (int)lArray[1];
                                    n3 = (int)lArray[2];
                                    callSite3 = _5Z.d("\u00ce", (Object)_5Z.d("\u00ce", (Object)_5Z.d("y", (Object)_5Z.d("y", (Object)this, 8228837467343070761L, (long)l3), 8231508165813939278L, (long)l3), 8230390255956242618L, (long)l3), (int)n5, (int)n4, 8230597996569560740L, (long)l3);
                                    try {
                                        callSite4 = callSite3;
                                        if (n != 0) break block18;
                                        if (callSite4 == null) break block19;
                                    }
                                    catch (MatchException matchException) {
                                        throw _5Z.a(matchException);
                                    }
                                    callSite4 = callSite3;
                                }
                                try {
                                    object = _5Z.d("\u00ce", (Object)callSite4, 8224180184825416638L, (long)l3);
                                    if (n != 0) break block20;
                                    if (object == 0) break block21;
                                }
                                catch (MatchException matchException) {
                                    throw _5Z.a(matchException);
                                }
                            }
                            object = n3;
                        }
                        try {
                            if (n != 0) break block22;
                            if (object >= _5Z.c("i", 12865, (long)(0x26C4A50F882D2290L ^ l3))) continue;
                        }
                        catch (MatchException matchException) {
                            throw _5Z.a(matchException);
                        }
                        object = _5Z.d("\u00ce", (Object)_5Z.d("y", (Object)this, 8231040944931247419L, (long)l3), (Object)new long[]{n5, n4, n3 + 1}, 8223943351543704048L, (long)l3);
                    }
                    if (n == 0) continue;
                }
                Object[] objectArray = new Object[2];
                objectArray[1] = callSite3;
                objectArray[0] = l4;
                _5Z.d("\u00ce", (Object)this, (Object)objectArray, 8223791429126220716L, (long)l3);
                if (n == 0) continue;
            }
            _5Z.d("\u00ce", (Object)_5Z.d("y", (Object)this, 8230198927815736476L, (long)l3), arg_0 -> this.cfr_renamed_8(l2, arg_0), 8230781717771033387L, (long)l3);
            _5Z.d("\u00ce", (Object)_5Z.d("y", (Object)this, 8224324866864612551L, (long)l3), arg_0 -> this.cfr_renamed_8(l2, arg_0), 8230781717771033387L, (long)l3);
            z = this;
        }
        _5Z.d("\u00ce", (Object)_5Z.d("y", (Object)z, 8229170588810775659L, (long)l3), arg_0 -> this.cfr_renamed_8(l2, arg_0), 8230781717771033387L, (long)l3);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5Z.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_5Z.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5Z.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

