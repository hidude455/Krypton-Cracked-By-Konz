/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_11908
 *  net.minecraft.class_11909
 *  net.minecraft.class_2561
 *  net.minecraft.class_332
 *  net.minecraft.class_437
 */
package dev.krypton;

import dev.krypton._4J;
import dev.krypton._87;
import dev.krypton._8B;
import dev.krypton._94;
import dev.krypton._9M;
import dev.krypton._9Z;
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
import net.minecraft.class_11908;
import net.minecraft.class_11909;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_437;

public class _3H
extends class_437
implements _4J,
_9Z {
    private static final int cfr_renamed_7;
    private static final int cfr_renamed_75;
    private static final int cfr_renamed_118;
    private static final int cfr_renamed_0;
    private static final int cfr_renamed_116;
    private static final int cfr_renamed_114;
    private static final int cfr_renamed_9;
    private static final int cfr_renamed_89;
    private static final int cfr_renamed_79;
    private static final int cfr_renamed_95;
    private static final int cfr_renamed_66;
    private static final _8B cfr_renamed_105;
    private static final _8B cfr_renamed_1;
    private static final _8B cfr_renamed_85;
    private static final _8B cfr_renamed_111;
    private static final _8B cfr_renamed_82;
    private static final _8B cfr_renamed_92;
    private static final _8B cfr_renamed_104;
    private static final _8B cfr_renamed_6;
    private static final _8B cfr_renamed_97;
    private static final _8B cfr_renamed_107;
    private static final _8B cfr_renamed_4;
    private static final _8B cfr_renamed_5;
    private static final _8B cfr_renamed_3;
    private static final _8B cfr_renamed_2;
    private final _94 cfr_renamed_77;
    private final _8B cfr_renamed_108;
    private final int[] cfr_renamed_110;
    private double cfr_renamed_128;
    private double cfr_renamed_78;
    private double cfr_renamed_109;
    private boolean cfr_renamed_65;
    private boolean cfr_renamed_103;
    private double cfr_renamed_81;
    private int[] cfr_renamed_8;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static final Object[] h;
    private static final String[] i;

    public _3H(long l2, _94 var3_2) {
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x2BC8F26BD3B3L;
        long l5 = l3 ^ 0x45FC41CE1228L;
        long l6 = l3 ^ 0x6899D21F5FD9L;
        int n = (int)(l6 >>> 48);
        int n2 = (int)(l6 << 16 >>> 32);
        int n3 = (int)(l6 << 48 >>> 48);
        long l7 = l3 ^ 0x292E2D693A5BL;
        long l8 = l3 ^ 0x202662520D70L;
        long l9 = l3 ^ 0x4562C00BBA05L;
        super((class_2561)class_2561.method_43473());
        _3H.c("\u00f2", (Object)this, -1.0, -5946876918093335900L, (long)l2);
        this.cfr_renamed_77 = var3_2;
        Object[] objectArray = new Object[1];
        objectArray[0] = l4;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = (int)((short)n3);
        objectArray2[1] = n2;
        objectArray2[0] = (int)((short)n);
        this.cfr_renamed_108 = _3H.c("\u00ba", (Object)_3H.c("\u00ba", (Object)var3_2, (Object)objectArray, -5946408124177792429L, (long)l2), (Object)objectArray2, -5948263021785137400L, (long)l2);
        Object[] objectArray3 = new Object[5];
        objectArray3[4] = null;
        objectArray3[3] = (int)_3H.c("\u00ed", (Object)_3H.c("\u00ed", (Object)this, -5946668347420732116L, (long)l2), -5958303075090401628L, (long)l2);
        objectArray3[2] = (int)_3H.c("\u00ed", (Object)_3H.c("\u00ed", (Object)this, -5946668347420732116L, (long)l2), -5944938027226760770L, (long)l2);
        objectArray3[1] = (int)_3H.c("\u00ed", (Object)_3H.c("\u00ed", (Object)this, -5946668347420732116L, (long)l2), -5945671627659891075L, (long)l2);
        objectArray3[0] = l5;
        CallSite callSite = _3H.c("\u00e4", (Object)objectArray3, -5945324472853055959L, (long)l2);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l8;
        _3H.c("\u00f2", (Object)this, (double)_3H.c("\u00ba", (Object)var3_2, (Object)objectArray4, -5947272834508923741L, (long)l2), -5946235770195564477L, (long)l2);
        int n4 = _9M.cfr_renamed_0();
        _3H.c("\u00f2", (Object)this, (double)((double)callSite[1]), -5947080110641471286L, (long)l2);
        _3H.c("\u00f2", (Object)this, (double)((double)callSite[2]), -5946118211601408837L, (long)l2);
        Object object = _3H.b("x", 23469, (long)(0x10BA6AD4BB8CCE51L ^ l2));
        int n5 = n4;
        this.cfr_renamed_110 = new int[object];
        for (int j = 0; j < object; ++j) {
            double d = (double)j / (double)object * 360.0;
            Object[] objectArray5 = new Object[4];
            objectArray5[3] = l9;
            objectArray5[2] = 1.0;
            objectArray5[1] = 1.0;
            objectArray5[0] = d;
            Object[] objectArray6 = new Object[1];
            objectArray6[0] = l7;
            _3H.c("\u00ed", (Object)this, -5944777263571539470L, (long)l2)[j] = _3H.c("\u00ba", (Object)_3H.c("\u00e4", (Object)objectArray5, -5948529538650641796L, (long)l2), (Object)objectArray6, -5948649531589095771L, (long)l2);
            if (n5 != 0) continue;
        }
    }

    protected void method_56131() {
        block5: {
            _3H h;
            block4: {
                long l2 = a ^ 0x368733098E67L;
                int n = _9M.cfr_renamed_3();
                try {
                    try {
                        h = this;
                        if (n != 0) break block4;
                        if (_3H.c("\u00ed", (Object)h, 8867220271966869927L, (long)l2) == null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _3H.a(matchException);
                    }
                    h = this;
                }
                catch (MatchException matchException) {
                    throw _3H.a(matchException);
                }
            }
            super.method_56131();
        }
    }

    public void method_25420(class_332 class_3322, int n, int n2, float f) {
    }

    public boolean method_25421() {
        return false;
    }

    public void method_25394(class_332 class_3322, int n, int n2, float f) {
        block9: {
            block11: {
                CallSite callSite;
                long l2;
                block10: {
                    int n3;
                    block8: {
                        l2 = a ^ 0xB81F054855EL;
                        n3 = _9M.cfr_renamed_3();
                        try {
                            try {
                                callSite = _3H.c("\u00ed", (Object)_3H.c("\u00db", 8077552702831789540L, (long)l2), 8081073246233838139L, (long)l2);
                                if (n3 != 0) break block8;
                                if (callSite != this) break block9;
                            }
                            catch (MatchException matchException) {
                                throw _3H.a(matchException);
                            }
                            callSite = _3H.c("\u00ed", (Object)_3H.c("\u00db", 8080629571045896986L, (long)l2), 8082772779381366814L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw _3H.a(matchException);
                        }
                    }
                    try {
                        try {
                            if (n3 != 0) break block10;
                            if (callSite == null) break block11;
                        }
                        catch (MatchException matchException) {
                            throw _3H.a(matchException);
                        }
                        callSite = _3H.c("\u00ed", (Object)_3H.c("\u00db", 8080629571045896986L, (long)l2), 8082772779381366814L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw _3H.a(matchException);
                    }
                }
                _3H.c("\u00ba", (Object)callSite, (Object)class_3322, 0, 0, (float)f, 8081831807395773651L, (long)l2);
            }
            super.method_25394(class_3322, n, n2, f);
        }
    }

    public void method_25419() {
        long l2 = a ^ 0x34AFEC521D6CL;
        long l3 = l2 ^ 0x3DD12F6A1E9BL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l3;
        objectArray[0] = _3H.c("\u00ed", (Object)this, -1721122398716243896L, (long)l2);
        _3H.c("\u00ba", (Object)_3H.c("\u00ed", (Object)this, -1721214600134898045L, (long)l2), (Object)objectArray, -1721351611128191619L, (long)l2);
        _3H.c("\u00ba", (Object)_3H.c("\u00db", -1717274104441102890L, (long)l2), (Object)_3H.c("\u00ed", (Object)_3H.c("\u00db", -1723164629322716376L, (long)l2), -1727747575783951158L, (long)l2), -1722470799119246493L, (long)l2);
    }

    private _8B dev_krypton_8B_6(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        int n3 = (Integer)objectArray[2];
        long l2 = ((long)n << 48 | (long)n2 << 32 >>> 16 | (long)n3 << 48 >>> 48) ^ a;
        long l3 = l2 ^ 0x63795FAE004FL;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l3;
        objectArray2[2] = (double)_3H.c("\u00ed", (Object)this, 1671120123909498609L, (long)l2);
        objectArray2[1] = (double)_3H.c("\u00ed", (Object)this, 1674666428261276288L, (long)l2);
        objectArray2[0] = (double)_3H.c("\u00ed", (Object)this, 1671007027735826953L, (long)l2);
        CallSite callSite = _3H.c("\u00e4", (Object)objectArray2, 1673287360460804150L, (long)l2);
        _3H.c("\u00f2", (Object)callSite, (int)_3H.b("x", 15743, (long)(0x7A68C7E642A092A5L ^ l2)), 1673756648245093054L, (long)l2);
        return callSite;
    }

    private void cfr_renamed_6(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x32A31945DE7BL;
        long l5 = l3 ^ 0x41DB1A34ADA8L;
        long l6 = l3 ^ 0x6DA3A47DB97AL;
        int n = (int)(l6 >>> 48);
        int n2 = (int)(l6 << 16 >>> 32);
        int n3 = (int)(l6 << 48 >>> 48);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = (int)((short)n3);
        objectArray2[1] = n2;
        objectArray2[0] = (int)((char)n);
        CallSite callSite = _3H.c("\u00ba", (Object)this, (Object)objectArray2, 6567972367128308625L, (long)l2);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l5;
        objectArray3[0] = callSite;
        _3H.c("\u00ba", (Object)_3H.c("\u00ed", (Object)this, 6570321376020856240L, (long)l2), (Object)objectArray3, 6570747313742337614L, (long)l2);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l4;
        objectArray4[0] = (double)_3H.c("\u00ed", (Object)this, 6570099783409229332L, (long)l2);
        _3H.c("\u00ba", (Object)_3H.c("\u00ed", (Object)this, 6570321376020856240L, (long)l2), (Object)objectArray4, 6568097846577530180L, (long)l2);
    }

    /*
     * Exception decompiling
     */
    private void void_2(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [10[DOLOOP]], but top level block is 11[SIMPLE_IF_TAKEN]
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
    @Override
    public void void_4(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [10[WHILELOOP]], but top level block is 11[WHILELOOP]
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

    private void cfr_renamed_1(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        _87 var3_3 = (_87)objectArray[1];
        String string = (String)objectArray[2];
        int n = (Integer)objectArray[3];
        int n2 = (Integer)objectArray[4];
        int n3 = (Integer)objectArray[5];
        int n4 = (Integer)objectArray[6];
        double d = (Double)objectArray[7];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x713E481FD5FFL;
        long l5 = l3 ^ 0x507F6EFC1DA6L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l4;
        objectArray2[0] = string;
        CallSite callSite = _3H.c("\u00ba", (Object)var3_3, (Object)objectArray2, 5689858308351766754L, (long)l2);
        Object[] objectArray3 = new Object[5];
        objectArray3[4] = _3H.c("\u00db", 5675026568326383571L, (long)l2);
        objectArray3[3] = (double)n2 + ((double)n4 - d) / 2.0 + 1.0;
        objectArray3[2] = (double)n + ((double)n3 - callSite) / 2.0;
        objectArray3[1] = string;
        objectArray3[0] = l5;
        _3H.c("\u00ba", (Object)var3_3, (Object)objectArray3, 5675032116518045765L, (long)l2);
    }

    public boolean method_25402(class_11909 class_119092, boolean bl) {
        Object object;
        block32: {
            block33: {
                int n;
                long l2;
                long l3;
                long l4;
                long l5;
                long l6;
                block30: {
                    reference var35_26;
                    reference var32_23;
                    int n2;
                    int n3;
                    long l7;
                    block31: {
                        block28: {
                            reference var34_25;
                            block29: {
                                long l8;
                                block26: {
                                    reference var33_24;
                                    block27: {
                                        reference var30_21;
                                        long l9;
                                        block24: {
                                            reference var31_22;
                                            block25: {
                                                CallSite callSite;
                                                long l10;
                                                block22: {
                                                    block23: {
                                                        long l11 = l6 = a ^ 0x52E11E7DBEB7L;
                                                        l5 = l11 ^ 0x28E7DE34CE93L;
                                                        l8 = l11 ^ 0x451FC296E58FL;
                                                        l4 = l11 ^ 0x4B5BB880F497L;
                                                        l7 = l11 ^ 0x18A0CCAA9B1FL;
                                                        l3 = l11 ^ 0x5B9FDD45BD40L;
                                                        l2 = l11 ^ 0x5F9EA5ED96D3L;
                                                        l10 = l11 ^ 0x14DBDA505753L;
                                                        l9 = l11 ^ 0x3CDFEB75A030L;
                                                        n = _9M.cfr_renamed_3();
                                                        try {
                                                            try {
                                                                callSite = _3H.c("\u00ba", (Object)class_119092, 5460895402246174680L, (long)l6);
                                                                if (n != 0) break block22;
                                                                if (callSite == false) break block23;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _3H.a(matchException);
                                                            }
                                                            return super.method_25402(class_119092, bl);
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _3H.a(matchException);
                                                        }
                                                    }
                                                    callSite = _3H.c("\u00ba", (Object)_3H.c("\u00ba", (Object)_3H.c("\u00db", 5471981308469067277L, (long)l6), 5462374677790446894L, (long)l6), 5472171585813987339L, (long)l6);
                                                }
                                                CallSite callSite2 = callSite;
                                                n3 = (int)(_3H.c("\u00ba", (Object)class_119092, 5460487503066979645L, (long)l6) * (double)callSite2);
                                                n2 = (int)(_3H.c("\u00ba", (Object)class_119092, 5472074083659780130L, (long)l6) * (double)callSite2);
                                                CallSite callSite3 = _3H.c("\u00ba", (Object)_3H.c("\u00ba", (Object)_3H.c("\u00db", 5471981308469067277L, (long)l6), 5462374677790446894L, (long)l6), 5459217975945699916L, (long)l6);
                                                CallSite callSite4 = _3H.c("\u00ba", (Object)_3H.c("\u00ba", (Object)_3H.c("\u00db", 5471981308469067277L, (long)l6), 5462374677790446894L, (long)l6), 5459679227592761643L, (long)l6);
                                                reference var27_18 = (callSite3 - _3H.b("x", 15437, (long)(0x4051DA0F6F824F01L ^ l6))) / 2;
                                                reference var28_19 = (callSite4 - _3H.b("x", 2601, (long)(0x18FFF744373F900L ^ l6))) / 2;
                                                reference var29_20 = var27_18 + _3H.b("x", 4501, (long)(0x6C4D813DA4A062D0L ^ l6));
                                                var30_21 = var28_19 + _3H.b("x", 21858, (long)(0x17646250E71D2607L ^ l6));
                                                var31_22 = var29_20 + _3H.b("x", 11515, (long)(0x49D3ACD0CCEBDF99L ^ l6)) + _3H.b("x", 18257, (long)(0x695537C102AD343FL ^ l6));
                                                var32_23 = var28_19 + _3H.b("x", 532, (long)(0x6C40DFAE5409F164L ^ l6)) - _3H.b("x", 14950, (long)(0x79150552A554494EL ^ l6)) - _3H.b("x", 12663, (long)(0x6A23A632099420DL ^ l6));
                                                var33_24 = var27_18 + _3H.b("x", 5797, (long)(0x4A1B17FA5EB3E5EDL ^ l6)) - _3H.b("x", 14950, (long)(0x79150552A554494EL ^ l6)) - _3H.b("x", 22356, (long)(0x6D180D847ED72479L ^ l6));
                                                var34_25 = var33_24 - _3H.b("x", 21380, (long)(0x6BF38F0F94EC20F0L ^ l6)) - _3H.b("x", 22, (long)(0x785E4EA8EBAF733CL ^ l6));
                                                var35_26 = var34_25 - _3H.b("x", 21380, (long)(0x6BF38F0F94EC20F0L ^ l6)) - _3H.b("x", 12580, (long)(0x3C2C37BA4DA34275L ^ l6));
                                                try {
                                                    try {
                                                        Object[] objectArray = new Object[7];
                                                        objectArray[6] = (int)_3H.b("x", 1979, (long)(0x489A12E91B2EF4F4L ^ l6));
                                                        objectArray[5] = (int)_3H.b("x", 1979, (long)(0x489A12E91B2EF4F4L ^ l6));
                                                        objectArray[4] = l7;
                                                        objectArray[3] = (int)var30_21;
                                                        objectArray[2] = (int)var29_20;
                                                        objectArray[1] = n2;
                                                        objectArray[0] = n3;
                                                        object = _3H.c("\u00ba", (Object)this, (Object)objectArray, 5458409756647356646L, (long)l6);
                                                        if (n != 0) break block24;
                                                        if (object == false) break block25;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _3H.a(matchException);
                                                    }
                                                    _3H.c("\u00f2", (Object)this, (boolean)_3H.b("x", 1359, (long)(0x4F51658441217623L ^ l6)), 5460347478421047364L, (long)l6);
                                                    Object[] objectArray = new Object[5];
                                                    objectArray[4] = (int)var30_21;
                                                    objectArray[3] = l10;
                                                    objectArray[2] = (int)var29_20;
                                                    objectArray[1] = n2;
                                                    objectArray[0] = n3;
                                                    _3H.c("\u00ba", (Object)this, (Object)objectArray, 5460685693025037270L, (long)l6);
                                                    return true;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _3H.a(matchException);
                                                }
                                            }
                                            Object[] objectArray = new Object[7];
                                            objectArray[6] = (int)_3H.b("x", 1979, (long)(0x489A12E91B2EF4F4L ^ l6));
                                            objectArray[5] = (int)_3H.b("x", 15988, (long)(0xE2B696E3073CD36L ^ l6));
                                            objectArray[4] = l7;
                                            objectArray[3] = (int)var30_21;
                                            objectArray[2] = (int)var31_22;
                                            objectArray[1] = n2;
                                            objectArray[0] = n3;
                                            object = _3H.c("\u00ba", (Object)this, (Object)objectArray, 5458409756647356646L, (long)l6);
                                        }
                                        try {
                                            try {
                                                if (n != 0) break block26;
                                                if (object == false) break block27;
                                            }
                                            catch (MatchException matchException) {
                                                throw _3H.a(matchException);
                                            }
                                            _3H.c("\u00f2", (Object)this, (boolean)_3H.b("x", 28735, (long)(0x312E3F1C8950368L ^ l6)), 5461340816925104460L, (long)l6);
                                            Object[] objectArray = new Object[3];
                                            objectArray[2] = (int)var30_21;
                                            objectArray[1] = l9;
                                            objectArray[0] = n2;
                                            _3H.c("\u00ba", (Object)this, (Object)objectArray, 5459279595364107343L, (long)l6);
                                            return true;
                                        }
                                        catch (MatchException matchException) {
                                            throw _3H.a(matchException);
                                        }
                                    }
                                    Object[] objectArray = new Object[7];
                                    objectArray[6] = (int)_3H.b("x", 14950, (long)(0x79150552A554494EL ^ l6));
                                    objectArray[5] = (int)_3H.b("x", 21380, (long)(0x6BF38F0F94EC20F0L ^ l6));
                                    objectArray[4] = l7;
                                    objectArray[3] = (int)var32_23;
                                    objectArray[2] = (int)var33_24;
                                    objectArray[1] = n2;
                                    objectArray[0] = n3;
                                    object = _3H.c("\u00ba", (Object)this, (Object)objectArray, 5458409756647356646L, (long)l6);
                                }
                                try {
                                    try {
                                        if (n != 0) break block28;
                                        if (object == false) break block29;
                                    }
                                    catch (MatchException matchException) {
                                        throw _3H.a(matchException);
                                    }
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l8;
                                    _3H.c("\u00ba", (Object)this, (Object)objectArray, 5462567843595192136L, (long)l6);
                                    _3H.c("\u00ba", (Object)_3H.c("\u00db", 5471981308469067277L, (long)l6), (Object)_3H.c("\u00ed", (Object)_3H.c("\u00db", 5462145793309542643L, (long)l6), 5466992768598759185L, (long)l6), 5459466253660600504L, (long)l6);
                                    return true;
                                }
                                catch (MatchException matchException) {
                                    throw _3H.a(matchException);
                                }
                            }
                            Object[] objectArray = new Object[7];
                            objectArray[6] = (int)_3H.b("x", 14950, (long)(0x79150552A554494EL ^ l6));
                            objectArray[5] = (int)_3H.b("x", 21380, (long)(0x6BF38F0F94EC20F0L ^ l6));
                            objectArray[4] = l7;
                            objectArray[3] = (int)var32_23;
                            objectArray[2] = (int)var34_25;
                            objectArray[1] = n2;
                            objectArray[0] = n3;
                            object = _3H.c("\u00ba", (Object)this, (Object)objectArray, 5458409756647356646L, (long)l6);
                        }
                        try {
                            try {
                                if (n != 0) break block30;
                                if (object == false) break block31;
                            }
                            catch (MatchException matchException) {
                                throw _3H.a(matchException);
                            }
                            Object[] objectArray = new Object[2];
                            objectArray[1] = l3;
                            objectArray[0] = _3H.c("\u00ed", (Object)this, 5460119780497519507L, (long)l6);
                            _3H.c("\u00ba", (Object)_3H.c("\u00ed", (Object)this, 5460159617643441496L, (long)l6), (Object)objectArray, 5460581127419315878L, (long)l6);
                            _3H.c("\u00ba", (Object)_3H.c("\u00db", 5471981308469067277L, (long)l6), (Object)_3H.c("\u00ed", (Object)_3H.c("\u00db", 5462145793309542643L, (long)l6), 5466992768598759185L, (long)l6), 5459466253660600504L, (long)l6);
                            return true;
                        }
                        catch (MatchException matchException) {
                            throw _3H.a(matchException);
                        }
                    }
                    Object[] objectArray = new Object[7];
                    objectArray[6] = (int)_3H.b("x", 14950, (long)(0x79150552A554494EL ^ l6));
                    objectArray[5] = (int)_3H.b("x", 21380, (long)(0x6BF38F0F94EC20F0L ^ l6));
                    objectArray[4] = l7;
                    objectArray[3] = (int)var32_23;
                    objectArray[2] = (int)var35_26;
                    objectArray[1] = n2;
                    objectArray[0] = n3;
                    object = _3H.c("\u00ba", (Object)this, (Object)objectArray, 5458409756647356646L, (long)l6);
                }
                try {
                    if (n != 0) break block32;
                    if (object == false) break block33;
                }
                catch (MatchException matchException) {
                    throw _3H.a(matchException);
                }
                Object[] objectArray = new Object[1];
                objectArray[0] = l2;
                CallSite callSite = _3H.c("\u00ba", (Object)_3H.c("\u00ed", (Object)this, 5460159617643441496L, (long)l6), (Object)objectArray, 5460964262105744602L, (long)l6);
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l3;
                objectArray2[0] = callSite;
                _3H.c("\u00ba", (Object)_3H.c("\u00ed", (Object)this, 5460159617643441496L, (long)l6), (Object)objectArray2, 5460581127419315878L, (long)l6);
                Object[] objectArray3 = new Object[5];
                objectArray3[4] = null;
                objectArray3[3] = (int)_3H.c("\u00ed", (Object)callSite, 5472106970277253147L, (long)l6);
                objectArray3[2] = (int)_3H.c("\u00ed", (Object)callSite, 5458460584945196801L, (long)l6);
                objectArray3[1] = (int)_3H.c("\u00ed", (Object)callSite, 5459406734721829058L, (long)l6);
                objectArray3[0] = l4;
                CallSite callSite5 = _3H.c("\u00e4", (Object)objectArray3, 5459198668066705558L, (long)l6);
                _3H.c("\u00f2", (Object)this, (double)((double)(callSite5[0] * 360.0f)), 5459968815818034940L, (long)l6);
                _3H.c("\u00f2", (Object)this, (double)((double)callSite5[1]), 5460813018678052469L, (long)l6);
                _3H.c("\u00f2", (Object)this, (double)((double)callSite5[2]), 5459535216266361348L, (long)l6);
                Object[] objectArray4 = new Object[2];
                objectArray4[1] = l5;
                objectArray4[0] = (double)_3H.c("\u00ed", (Object)this, 5459968815818034940L, (long)l6);
                _3H.c("\u00ba", (Object)_3H.c("\u00ed", (Object)this, 5460159617643441496L, (long)l6), (Object)objectArray4, 5462453438236464556L, (long)l6);
                _3H.c("\u00f2", (Object)this, -1.0, 5460469775968588827L, (long)l6);
                return true;
            }
            object = super.method_25402(class_119092, bl);
        }
        return (boolean)object;
    }

    public boolean method_25406(class_11909 class_119092) {
        long l2 = a ^ 0x72B2480063A4L;
        _3H.c("\u00f2", (Object)this, (boolean)_3H.b("x", 9501, (long)(0x7A5589E8107D8B70L ^ l2)), -7578382474170772137L, (long)l2);
        _3H.c("\u00f2", (Object)this, (boolean)_3H.b("x", 357, (long)(0x1274548823B7AF16L ^ l2)), -7576826046317312929L, (long)l2);
        return super.method_25406(class_119092);
    }

    public boolean method_25403(class_11909 class_119092, double d, double d2) {
        Object object;
        block10: {
            block11: {
                reference var20_15;
                int n;
                int n2;
                long l2;
                long l3;
                block8: {
                    block9: {
                        long l4 = l3 = a ^ 0xD62F2F23C1DL;
                        long l5 = l4 ^ 0x4B5836DFD5F9L;
                        l2 = l4 ^ 0x635C07FA229AL;
                        CallSite callSite = _3H.c("\u00ba", (Object)_3H.c("\u00ba", (Object)_3H.c("\u00db", -3937767295888147289L, (long)l3), -3934985711743772796L, (long)l3), -3937464855054630239L, (long)l3);
                        int n3 = (int)(_3H.c("\u00ba", (Object)class_119092, -3932253837849796713L, (long)l3) * (double)callSite);
                        n2 = (int)(_3H.c("\u00ba", (Object)class_119092, -3937577771980156280L, (long)l3) * (double)callSite);
                        CallSite callSite2 = _3H.c("\u00ba", (Object)_3H.c("\u00ba", (Object)_3H.c("\u00db", -3937767295888147289L, (long)l3), -3934985711743772796L, (long)l3), -3933517894660120346L, (long)l3);
                        CallSite callSite3 = _3H.c("\u00ba", (Object)_3H.c("\u00ba", (Object)_3H.c("\u00db", -3937767295888147289L, (long)l3), -3934985711743772796L, (long)l3), -3931938417927953535L, (long)l3);
                        reference var18_12 = (callSite2 - _3H.b("x", 5797, (long)(0x4A1B4879B23C6747L ^ l3))) / 2;
                        reference var19_13 = var18_12 + _3H.b("x", 14950, (long)(0x79155AD149DBCBE4L ^ l3));
                        n = _9M.cfr_renamed_0();
                        var20_15 = (callSite3 - _3H.b("x", 532, (long)(0x6C40802DB88673CEL ^ l3))) / 2 + _3H.b("x", 23536, (long)(0x1F3840F93A43AA27L ^ l3));
                        try {
                            try {
                                object = _3H.c("\u00ed", (Object)this, -3932396077877884178L, (long)l3);
                                if (n == 0) break block8;
                                if (object == false) break block9;
                            }
                            catch (MatchException matchException) {
                                throw _3H.a(matchException);
                            }
                            Object[] objectArray = new Object[5];
                            objectArray[4] = (int)var20_15;
                            objectArray[3] = l5;
                            objectArray[2] = (int)var19_13;
                            objectArray[1] = n2;
                            objectArray[0] = n3;
                            _3H.c("\u00ba", (Object)this, (Object)objectArray, -3935548801701435012L, (long)l3);
                            return true;
                        }
                        catch (MatchException matchException) {
                            throw _3H.a(matchException);
                        }
                    }
                    object = _3H.c("\u00ed", (Object)this, -3935922828588213274L, (long)l3);
                }
                try {
                    try {
                        if (n == 0) break block10;
                        if (object == false) break block11;
                    }
                    catch (MatchException matchException) {
                        throw _3H.a(matchException);
                    }
                    Object[] objectArray = new Object[3];
                    objectArray[2] = (int)var20_15;
                    objectArray[1] = l2;
                    objectArray[0] = n2;
                    _3H.c("\u00ba", (Object)this, (Object)objectArray, -3933579410460326171L, (long)l3);
                    return true;
                }
                catch (MatchException matchException) {
                    throw _3H.a(matchException);
                }
            }
            object = super.method_25403(class_119092, d, d2);
        }
        return (boolean)object;
    }

    public boolean method_25404(class_11908 class_119082) {
        Object object;
        block17: {
            CallSite callSite;
            long l2;
            long l3;
            block15: {
                int n;
                block16: {
                    Object object2;
                    block13: {
                        long l4 = l3 = a ^ 0x60D8830CD75BL;
                        long l5 = l4 ^ 0x77265FE78C63L;
                        l2 = l4 ^ 0x69A64034D4ACL;
                        n = _9M.cfr_renamed_0();
                        try {
                            block14: {
                                try {
                                    try {
                                        try {
                                            object2 = _3H.c("\u00ba", (Object)class_119082, 2460087621284200487L, (long)l3);
                                            if (n == 0) break block13;
                                            if (object2 == _3H.b("x", 5670, (long)(0x29959D89C2108C80L ^ l3))) break block14;
                                        }
                                        catch (MatchException matchException) {
                                            throw _3H.a(matchException);
                                        }
                                        object = _3H.c("\u00ba", (Object)class_119082, 2460087621284200487L, (long)l3);
                                        callSite = _3H.b("x", 29689, (long)(0x74CD9C012B5A694FL ^ l3));
                                        if (n == 0) break block15;
                                    }
                                    catch (MatchException matchException) {
                                        throw _3H.a(matchException);
                                    }
                                    if (object != callSite) break block16;
                                }
                                catch (MatchException matchException) {
                                    throw _3H.a(matchException);
                                }
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l5;
                            _3H.c("\u00ba", (Object)this, (Object)objectArray, 2459742453226794660L, (long)l3);
                            _3H.c("\u00ba", (Object)_3H.c("\u00db", 2457927713144526817L, (long)l3), (Object)_3H.c("\u00ed", (Object)_3H.c("\u00db", 2459320063483535647L, (long)l3), 2464202150117654269L, (long)l3), 2463426769225339220L, (long)l3);
                            object2 = true;
                        }
                        catch (MatchException matchException) {
                            throw _3H.a(matchException);
                        }
                    }
                    return (boolean)object2;
                }
                try {
                    object = _3H.c("\u00ba", (Object)class_119082, 2460087621284200487L, (long)l3);
                    if (n == 0) break block17;
                    callSite = _3H.b("x", 11516, (long)(0x44915A5F6800B64DL ^ l3));
                }
                catch (MatchException matchException) {
                    throw _3H.a(matchException);
                }
            }
            try {
                if (object == callSite) {
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l2;
                    objectArray[0] = _3H.c("\u00ed", (Object)this, 2461793595847481983L, (long)l3);
                    _3H.c("\u00ba", (Object)_3H.c("\u00ed", (Object)this, 2461868140122899636L, (long)l3), (Object)objectArray, 2462294318362570570L, (long)l3);
                    _3H.c("\u00ba", (Object)_3H.c("\u00db", 2457927713144526817L, (long)l3), (Object)_3H.c("\u00ed", (Object)_3H.c("\u00db", 2459320063483535647L, (long)l3), 2464202150117654269L, (long)l3), 2463426769225339220L, (long)l3);
                    return true;
                }
            }
            catch (MatchException matchException) {
                throw _3H.a(matchException);
            }
            object = super.method_25404(class_119082);
        }
        return (boolean)object;
    }

    private void void_6(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        int n3 = (Integer)objectArray[2];
        long l2 = (Long)objectArray[3];
        int n4 = (Integer)objectArray[4];
        long l3 = (l2 = a ^ l2) ^ 0xE9F1D2147BBL;
        _3H.c("\u00f2", (Object)this, (double)_3H.c("\u00e4", (double)((double)(n - n3) / 200.0), 0.0, 1.0, -1591093690726379029L, (long)l2), -1586112580985428927L, (long)l2);
        _3H.c("\u00f2", (Object)this, (double)_3H.c("\u00e4", (double)(1.0 - (double)(n2 - n4) / 200.0), 0.0, 1.0, -1591093690726379029L, (long)l2), -1589663076645529552L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _3H.c("\u00ba", (Object)this, (Object)objectArray2, -1586750293490457220L, (long)l2);
    }

    private void cfr_renamed_0(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = (Integer)objectArray[2];
        long l3 = (l2 = a ^ l2) ^ 0x269B2C04B0D8L;
        _3H.c("\u00f2", (Object)this, (double)_3H.c("\u00e4", (double)((double)(n - n2) / 200.0 * 360.0), 0.0, 359.99, 2200119141938390664L, (long)l2), 2203059774685780907L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _3H.c("\u00ba", (Object)this, (Object)objectArray2, 2204955154747544095L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    private boolean boolean_2(Object[] var1_1) {
        block22: {
            block21: {
                block20: {
                    block19: {
                        var5_2 = (Integer)var1_1[0];
                        var6_3 = (Integer)var1_1[1];
                        var3_4 = (Integer)var1_1[2];
                        var9_5 = (Integer)var1_1[3];
                        var7_6 = (Long)var1_1[4];
                        var2_7 = (Integer)var1_1[5];
                        var4_8 = (Integer)var1_1[6];
                        var7_6 = _3H.a ^ var7_6;
                        var10_9 = _9M.cfr_renamed_3();
                        try {
                            try {
                                v0 = var5_2;
                                v1 = var3_4;
                                if (var10_9 != 0) break block19;
                                if (v0 >= v1) {
                                }
                                ** GOTO lbl-1000
                            }
                            catch (MatchException v2) {
                                throw _3H.a(v2);
                            }
                            v0 = var5_2;
                            v1 = var3_4 + var2_7;
                        }
                        catch (MatchException v3) {
                            throw _3H.a(v3);
                        }
                    }
                    try {
                        try {
                            v4 = var10_9;
                            if (var7_6 < 0L) ** GOTO lbl47
                            if (v4 != 0) break block20;
                            if (v0 < v1) {
                            }
                            ** GOTO lbl-1000
                        }
                        catch (MatchException v5) {
                            throw _3H.a(v5);
                        }
                        v0 = var6_3;
                        v1 = var9_5;
                    }
                    catch (MatchException v6) {
                        throw _3H.a(v6);
                    }
                }
                try {
                    try {
                        try {
                            v4 = var10_9;
lbl47:
                            // 2 sources

                            if (v4 != 0) break block21;
                            if (v0 >= v1) {
                            }
                            ** GOTO lbl-1000
                        }
                        catch (MatchException v7) {
                            throw _3H.a(v7);
                        }
                        v0 = var6_3;
                        if (var10_9 != 0) break block22;
                    }
                    catch (MatchException v8) {
                        throw _3H.a(v8);
                    }
                    v1 = var9_5 + var4_8;
                }
                catch (MatchException v9) {
                    throw _3H.a(v9);
                }
            }
            if (v0 < v1) {
                v0 = 1;
            } else lbl-1000:
            // 4 sources

            {
                v0 = 0;
            }
        }
        return (boolean)v0;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        _3H.a = l.a(-2822257385237553823L, 6086940599511002183L, MethodHandles.lookup().lookupClass()).a(50469405491239L);
                        v0 = var20 = _3H.a ^ 90281696258990L;
                        var22_1 = v0 ^ 59449020112023L;
                        var24_2 = v0 ^ 88428921966854L;
                        _3H.h = new Object[135];
                        _3H.i = new String[135];
                        _3H.a();
                        _3H.d = new HashMap<K, V>(13);
                        var11_3 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v1 = SecretKeyFactory.getInstance("DES");
                        v2 = new byte[8];
                        v3 = v2;
                        v2[0] = (byte)(var20 >>> 56);
                        for (var12_4 = 1; var12_4 < 8; ++var12_4) {
                            v3 = v3;
                            v3[var12_4] = (byte)(var20 << var12_4 * 8 >>> 56);
                        }
                        var11_3.init(2, (Key)v1.generateSecret(new DESKeySpec(v3)), new IvParameterSpec(new byte[8]));
                        var18_5 = new String[7];
                        var16_6 = 0;
                        var15_7 = "\u00cd\u0019\u0085\u0012o@M\u0088\u001a`l\u00fe\u0011\u00e8\u00f2\u0018\u0010\u00f0^\u0090\u001f\u00d4`\u0001\u00f2*\u00b3Qd\u00d7\u00d4\u00af} L=6\u00ed\u00b6\u009e\u00de\u00bb\u0015\u00cc\u00fbg>\u00ef\u0088\u00bd\u00c8\u00f6j\u0092KB\u00df\u00e3\u00fa\u0094G&\u00a6\u00ba\r\u00a5\u0010{6D?\u009a`\r\u0099\u00b5\"'\u001d3\u009a\u00a6\u00c2 \u0017\u0000\u00ddM\u001e'\u009c\u0016<\u00ef\u00a1\u00bfW,8!\u00b5o\u00b4~4\tj\u000e\u00c0\u0006]\u00d0\u00bb\u000b\u00c84";
                        var17_8 = "\u00cd\u0019\u0085\u0012o@M\u0088\u001a`l\u00fe\u0011\u00e8\u00f2\u0018\u0010\u00f0^\u0090\u001f\u00d4`\u0001\u00f2*\u00b3Qd\u00d7\u00d4\u00af} L=6\u00ed\u00b6\u009e\u00de\u00bb\u0015\u00cc\u00fbg>\u00ef\u0088\u00bd\u00c8\u00f6j\u0092KB\u00df\u00e3\u00fa\u0094G&\u00a6\u00ba\r\u00a5\u0010{6D?\u009a`\r\u0099\u00b5\"'\u001d3\u009a\u00a6\u00c2 \u0017\u0000\u00ddM\u001e'\u009c\u0016<\u00ef\u00a1\u00bfW,8!\u00b5o\u00b4~4\tj\u000e\u00c0\u0006]\u00d0\u00bb\u000b\u00c84".length();
                        var14_9 = 16;
                        var13_10 = -1;
lbl26:
                        // 2 sources

                        while (true) {
                            v4 = ++var13_10;
                            v5 = var15_7.substring(v4, v4 + var14_9);
                            v6 = -1;
                            break block18;
                            break;
                        }
lbl31:
                        // 1 sources

                        while (true) {
                            var18_5[var16_6++] = _3H.a(var19_11).intern();
                            if ((var13_10 += var14_9) < var17_8) {
                                var14_9 = var15_7.charAt(var13_10);
                                ** continue;
                            }
                            var15_7 = "\u0097\u00c6\u00a5\u00fb\u00807}\u00b8E\u00e1}}\u000bS\u00dd\u00c4\u0010&R\u00c1\b\u00fcj\u0098\u007f\u007f\u00ff\u0016\u0087_\u008c\u0097{";
                            var17_8 = "\u0097\u00c6\u00a5\u00fb\u00807}\u00b8E\u00e1}}\u000bS\u00dd\u00c4\u0010&R\u00c1\b\u00fcj\u0098\u007f\u007f\u00ff\u0016\u0087_\u008c\u0097{".length();
                            var14_9 = 16;
                            var13_10 = -1;
lbl40:
                            // 2 sources

                            while (true) {
                                v7 = ++var13_10;
                                v5 = var15_7.substring(v7, v7 + var14_9);
                                v6 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl45:
                        // 1 sources

                        while (true) {
                            var18_5[var16_6++] = _3H.a(var19_11).intern();
                            if ((var13_10 += var14_9) < var17_8) {
                                var14_9 = var15_7.charAt(var13_10);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_11 = var11_3.doFinal(v5.getBytes("ISO-8859-1"));
                    switch (v6) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl57:
                        // 1 sources

                        ** continue;
                    }
                }
                _3H.b = var18_5;
                _3H.c = new String[7];
                _3H.g = new HashMap<K, V>(13);
                var0_12 = Cipher.getInstance("DES/CBC/NoPadding");
                v8 = SecretKeyFactory.getInstance("DES");
                v9 = new byte[8];
                v10 = v9;
                v9[0] = (byte)(var20 >>> 56);
                for (var1_13 = 1; var1_13 < 8; ++var1_13) {
                    v10 = v10;
                    v10[var1_13] = (byte)(var20 << var1_13 * 8 >>> 56);
                }
                var0_12.init(2, (Key)v8.generateSecret(new DESKeySpec(v10)), new IvParameterSpec(new byte[8]));
                var6_14 = new long[72];
                var3_15 = 0;
                var4_16 = "yfR\u0097AK \u00e2\u00ff\u0002\u00ba\u0088\u00aa\u00bb\u00f5z\u00d0\u00e8U\u00f5\u0000\u00b8\u00b4a\u007f\u00d8\r\u008d\u00a7\u00ed~\u00b2od\u001c?\u00eeo\u000e\u00d1\u00ee\u0093\u00bd\u00c3\u00bf\u00a5UA\u00aa\u00ba\u00d3\u0089\u0016\u00ba\u0016,_\u00fcD\u0017\u008d\u00888H\u0090x1\u0086^\u00c1\u00e95Lj&Z\u00c4\\+\u0003`\u00d5\u0004\u007f\u0018\u00a0>6\u00f0n\u009e\u001e.\u0088?\u009d\u0016\u00c3\u00e54\u00b4'?c\u00edk\u0095\u009c\u00fa\u00c5\u000eU\u00cf\u00a1\u00bb\u00b5}\u00fb\u00cb\u00cf\u00e3\u00cb\u0095\u00b2\u00f2.\u00045\u00a3a\u00ac\u00c4\u000e\u0087-\u00a9\n\u00bb\u00cb\u00a2/\u00c0\u00a1SN\u008d\u00b5b\u001e\u0014=@\u008c\u008bt\u00ae\u00d0m\u00fd7A\u00a2\u0001\u00bb\u00f4\u00aa\u00b1\u001c\u00c7\u009b\u00d2L\u0001G\u0088\u00df%}4\u00b3%N{\u008c\u00b7\u0003\u0000p\u00e3\u008a\u00db\u009e\u008f\u00f7\u00a1\u00cd^\u0095\u00a6\u00e3J,\u008d\u0000(!j\u0089\u001c\u00d4\u0095_\u00dd\u00f5\u00e6[$a\u00f7\u00ab\u0017\u00e9\u0096|\u00e3L\u00db\u00a7v\u00e2\u0098\u0002u\u00ad7h\u0082\u00d6<\u0086\u00be\u00eb\u00e7V\u00ab\u00b8\u0088wH\u00d4e\u0092\u0085\u0004\"\u008fr\u00ac\u0095\u00c5\u00e0F\u00f1S$h]\u0084\u00d6\u00bdqj\u0085r4\u00b5\\\u0085\u00aa\u00f1\u00ddA\u00d8\u00ca\u00b0;\f\u0092\u00ad\u0084\u00a5hh\u00003\u008f\u0010%p/\u00bd)c\u0012\u00c8\u0014+\u00e7\u00c57\u00c9e\u0010*\u0088[\u0086\u00d9\u00bb\u00f06v\u00810\u008b`\\\u00e4\u001cm\u00f2\u00ec\u00b4\u00a0v\u00fc\u00d89\u00fb\u00ce\u00b8\u00fb;\u00e9\u008d\u0084\u00d0\u00f6H\u0083>\u00a7\u0007\b\u000f\u0019h\u000e\u00a3\u0000\rI)WW\u0018P\u00c7\u00e1B\t\u00aa\u009d_Y\u00fd\u00e4\u00f4\u001e\u00f1\\r\u00b5{A\u00c4U\u0093\u00c3\u0000\u00d6\u0085\u0015B\u00a1R\u00fe^a\u00e16\u00d8Xk\u00d4\u00df\u0011\u00ef\u00bdY\u0096\u0083\u00d3\u00ce\u00d8.\u00deF$7*Y\u00a01uc\u0099Q\u00fb\u00e6\u00d5`\u0088\u00fc\u00c7*\r\u0014P{\u00ad\u00e0[\u00b4F1\u00c07J)L\u00ab\u0097t1\u00a0 oR\f\u0099u\u00bc\u00e9\u00f2zm\u008e\u00902x\u00f9\u00e2\u00f6y\b\u00f1\u0017 yU\u00c0(\u0019I6\u00eb(-\u0082\u00a0\u009f;Z\u00c2\u008aD.\u00c0\u00eb\u0001\u00b7-\u0019\u00f0\u00b3\u00ccc\u008f\u00d4\u001e\u00cf\fGF+\u0007\u00adb\u00c3\u00b2\u009d\u0081\u0086\u0012\\\u00af9\u00fd\u00e5`Q\u00a1*\u00f9\u00f4\u00e5\u00b5\u00fcq)@N\u00aewIbw'\u00f9\u0080\u00a7\u0090\u00dbk)\u00c3(\u00e87";
                var5_17 = "yfR\u0097AK \u00e2\u00ff\u0002\u00ba\u0088\u00aa\u00bb\u00f5z\u00d0\u00e8U\u00f5\u0000\u00b8\u00b4a\u007f\u00d8\r\u008d\u00a7\u00ed~\u00b2od\u001c?\u00eeo\u000e\u00d1\u00ee\u0093\u00bd\u00c3\u00bf\u00a5UA\u00aa\u00ba\u00d3\u0089\u0016\u00ba\u0016,_\u00fcD\u0017\u008d\u00888H\u0090x1\u0086^\u00c1\u00e95Lj&Z\u00c4\\+\u0003`\u00d5\u0004\u007f\u0018\u00a0>6\u00f0n\u009e\u001e.\u0088?\u009d\u0016\u00c3\u00e54\u00b4'?c\u00edk\u0095\u009c\u00fa\u00c5\u000eU\u00cf\u00a1\u00bb\u00b5}\u00fb\u00cb\u00cf\u00e3\u00cb\u0095\u00b2\u00f2.\u00045\u00a3a\u00ac\u00c4\u000e\u0087-\u00a9\n\u00bb\u00cb\u00a2/\u00c0\u00a1SN\u008d\u00b5b\u001e\u0014=@\u008c\u008bt\u00ae\u00d0m\u00fd7A\u00a2\u0001\u00bb\u00f4\u00aa\u00b1\u001c\u00c7\u009b\u00d2L\u0001G\u0088\u00df%}4\u00b3%N{\u008c\u00b7\u0003\u0000p\u00e3\u008a\u00db\u009e\u008f\u00f7\u00a1\u00cd^\u0095\u00a6\u00e3J,\u008d\u0000(!j\u0089\u001c\u00d4\u0095_\u00dd\u00f5\u00e6[$a\u00f7\u00ab\u0017\u00e9\u0096|\u00e3L\u00db\u00a7v\u00e2\u0098\u0002u\u00ad7h\u0082\u00d6<\u0086\u00be\u00eb\u00e7V\u00ab\u00b8\u0088wH\u00d4e\u0092\u0085\u0004\"\u008fr\u00ac\u0095\u00c5\u00e0F\u00f1S$h]\u0084\u00d6\u00bdqj\u0085r4\u00b5\\\u0085\u00aa\u00f1\u00ddA\u00d8\u00ca\u00b0;\f\u0092\u00ad\u0084\u00a5hh\u00003\u008f\u0010%p/\u00bd)c\u0012\u00c8\u0014+\u00e7\u00c57\u00c9e\u0010*\u0088[\u0086\u00d9\u00bb\u00f06v\u00810\u008b`\\\u00e4\u001cm\u00f2\u00ec\u00b4\u00a0v\u00fc\u00d89\u00fb\u00ce\u00b8\u00fb;\u00e9\u008d\u0084\u00d0\u00f6H\u0083>\u00a7\u0007\b\u000f\u0019h\u000e\u00a3\u0000\rI)WW\u0018P\u00c7\u00e1B\t\u00aa\u009d_Y\u00fd\u00e4\u00f4\u001e\u00f1\\r\u00b5{A\u00c4U\u0093\u00c3\u0000\u00d6\u0085\u0015B\u00a1R\u00fe^a\u00e16\u00d8Xk\u00d4\u00df\u0011\u00ef\u00bdY\u0096\u0083\u00d3\u00ce\u00d8.\u00deF$7*Y\u00a01uc\u0099Q\u00fb\u00e6\u00d5`\u0088\u00fc\u00c7*\r\u0014P{\u00ad\u00e0[\u00b4F1\u00c07J)L\u00ab\u0097t1\u00a0 oR\f\u0099u\u00bc\u00e9\u00f2zm\u008e\u00902x\u00f9\u00e2\u00f6y\b\u00f1\u0017 yU\u00c0(\u0019I6\u00eb(-\u0082\u00a0\u009f;Z\u00c2\u008aD.\u00c0\u00eb\u0001\u00b7-\u0019\u00f0\u00b3\u00ccc\u008f\u00d4\u001e\u00cf\fGF+\u0007\u00adb\u00c3\u00b2\u009d\u0081\u0086\u0012\\\u00af9\u00fd\u00e5`Q\u00a1*\u00f9\u00f4\u00e5\u00b5\u00fcq)@N\u00aewIbw'\u00f9\u0080\u00a7\u0090\u00dbk)\u00c3(\u00e87".length();
                var2_18 = 0;
                while (true) {
                    var7_19 = var4_16.substring(var2_18, var2_18 += 8).getBytes("ISO-8859-1");
                    v11 = var6_14;
                    v12 = var3_15++;
                    v13 = ((long)var7_19[0] & 255L) << 56 | ((long)var7_19[1] & 255L) << 48 | ((long)var7_19[2] & 255L) << 40 | ((long)var7_19[3] & 255L) << 32 | ((long)var7_19[4] & 255L) << 24 | ((long)var7_19[5] & 255L) << 16 | ((long)var7_19[6] & 255L) << 8 | (long)var7_19[7] & 255L;
                    v14 = -1;
                    break block20;
                    break;
                }
lbl84:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_18 < var5_17) ** continue;
                    var4_16 = "\u007f\u00cc\u00fb\u00af\u00d4\u00cb\u00b5\f\u00b0.\u0018\u00f2*`\u0089\u0007";
                    var5_17 = "\u007f\u00cc\u00fb\u00af\u00d4\u00cb\u00b5\f\u00b0.\u0018\u00f2*`\u0089\u0007".length();
                    var2_18 = 0;
                    while (true) {
                        var7_19 = var4_16.substring(var2_18, var2_18 += 8).getBytes("ISO-8859-1");
                        v11 = var6_14;
                        v12 = var3_15++;
                        v13 = ((long)var7_19[0] & 255L) << 56 | ((long)var7_19[1] & 255L) << 48 | ((long)var7_19[2] & 255L) << 40 | ((long)var7_19[3] & 255L) << 32 | ((long)var7_19[4] & 255L) << 24 | ((long)var7_19[5] & 255L) << 16 | ((long)var7_19[6] & 255L) << 8 | (long)var7_19[7] & 255L;
                        v14 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl97:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_18 < var5_17) ** continue;
                    break block21;
                    break;
                }
            }
            var8_20 = v13;
            var10_21 = var0_12.doFinal(new byte[]{(byte)(var8_20 >>> 56), (byte)(var8_20 >>> 48), (byte)(var8_20 >>> 40), (byte)(var8_20 >>> 32), (byte)(var8_20 >>> 24), (byte)(var8_20 >>> 16), (byte)(var8_20 >>> 8), (byte)var8_20});
            v15 = ((long)var10_21[0] & 255L) << 56 | ((long)var10_21[1] & 255L) << 48 | ((long)var10_21[2] & 255L) << 40 | ((long)var10_21[3] & 255L) << 32 | ((long)var10_21[4] & 255L) << 24 | ((long)var10_21[5] & 255L) << 16 | ((long)var10_21[6] & 255L) << 8 | (long)var10_21[7] & 255L;
            switch (v14) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl110:
                // 1 sources

                ** continue;
            }
        }
        _3H.e = var6_14;
        _3H.f = new Integer[72];
        _3H.cfr_renamed_7 = (int)_3H.b("x", (int)16424, (long)(var20 ^ 7050701797339784814L));
        _3H.cfr_renamed_66 = (int)_3H.b("x", (int)22677, (long)(var20 ^ 967113426901892813L));
        _3H.cfr_renamed_79 = (int)_3H.b("x", (int)11187, (long)(var20 ^ 8344139582227058137L));
        _3H.cfr_renamed_89 = (int)_3H.b("x", (int)13897, (long)(var20 ^ 4128012616300171297L));
        _3H.cfr_renamed_116 = (int)_3H.b("x", (int)6276, (long)(var20 ^ 8127140729900842717L));
        _3H.cfr_renamed_75 = (int)_3H.b("x", (int)16976, (long)(var20 ^ 3264424331985871899L));
        _3H.cfr_renamed_95 = (int)_3H.b("x", (int)1279, (long)(var20 ^ 7643810726591242885L));
        _3H.cfr_renamed_0 = (int)_3H.b("x", (int)18381, (long)(var20 ^ 6859797322492338619L));
        _3H.cfr_renamed_114 = (int)_3H.b("x", (int)29832, (long)(var20 ^ 1754044439779267286L));
        _3H.cfr_renamed_118 = (int)_3H.b("x", (int)11187, (long)(var20 ^ 8344139582227058137L));
        _3H.cfr_renamed_9 = (int)_3H.b("x", (int)8425, (long)(var20 ^ 6905170521546131133L));
        _3H.cfr_renamed_105 = new _8B(0, 0, var22_1, 0, (int)_3H.b("x", (int)21432, (long)(2942131445350856175L ^ var20)));
        _3H.cfr_renamed_1 = new _8B((int)_3H.b("x", (int)25354, (long)(2320301615140291909L ^ var20)), (int)_3H.b("x", (int)8259, (long)(4624363619576907294L ^ var20)), var22_1, (int)_3H.b("x", (int)24689, (long)(406986755045082657L ^ var20)), (int)_3H.b("x", (int)1979, (long)(5231513795817120237L ^ var20)));
        _3H.cfr_renamed_85 = new _8B(0, 0, var22_1, 0, (int)_3H.b("x", (int)22892, (long)(8504668859455471389L ^ var20)));
        _3H.cfr_renamed_111 = new _8B((int)_3H.b("x", (int)13958, (long)(3101874019697496309L ^ var20)), (int)_3H.b("x", (int)13958, (long)(3101874019697496309L ^ var20)), var22_1, (int)_3H.b("x", (int)13958, (long)(3101874019697496309L ^ var20)), (int)_3H.b("x", (int)11072, (long)(3831899704966253856L ^ var20)));
        _3H.cfr_renamed_82 = new _8B((int)_3H.b("x", (int)13958, (long)(3101874019697496309L ^ var20)), (int)_3H.b("x", (int)13958, (long)(3101874019697496309L ^ var20)), var22_1, (int)_3H.b("x", (int)13958, (long)(3101874019697496309L ^ var20)), 5);
        _3H.cfr_renamed_92 = new _8B(0, 0, var22_1, 0, 0);
        _3H.cfr_renamed_104 = new _8B((int)_3H.b("x", (int)8099, (long)(5641303485820549574L ^ var20)), (int)_3H.b("x", (int)22708, (long)(7533748352706346714L ^ var20)), var22_1, (int)_3H.b("x", (int)31547, (long)(4573844444055264521L ^ var20)), (int)_3H.b("x", (int)19878, (long)(7345487894477335497L ^ var20)));
        _3H.cfr_renamed_6 = new _8B((int)_3H.b("x", (int)22663, (long)(8128729653528592075L ^ var20)), (int)_3H.b("x", (int)10157, (long)(5831169884076311008L ^ var20)), var22_1, (int)_3H.b("x", (int)5500, (long)(2060808536560612099L ^ var20)), (int)_3H.b("x", (int)8599, (long)(3090827207847741423L ^ var20)));
        _3H.cfr_renamed_97 = new _8B((int)_3H.b("x", (int)17579, (long)(7305991865510748897L ^ var20)), (int)_3H.b("x", (int)5549, (long)(4803742000893670380L ^ var20)), var22_1, (int)_3H.b("x", (int)23536, (long)(2249582680983141780L ^ var20)), (int)_3H.b("x", (int)9602, (long)(2308117087373263849L ^ var20)));
        _3H.cfr_renamed_107 = new _8B((int)_3H.b("x", (int)1979, (long)(5231513795817120237L ^ var20)), (int)_3H.b("x", (int)11155, (long)(2075187904956534253L ^ var20)), var22_1, (int)_3H.b("x", (int)21380, (long)(7778719254483760617L ^ var20)), (int)_3H.b("x", (int)8599, (long)(3090827207847741423L ^ var20)));
        _3H.cfr_renamed_4 = new _8B((int)_3H.b("x", (int)9826, (long)(6097919260470378518L ^ var20)), (int)_3H.b("x", (int)5638, (long)(1576784449510256689L ^ var20)), var22_1, (int)_3H.b("x", (int)14079, (long)(726233705757380810L ^ var20)), (int)_3H.b("x", (int)7220, (long)(6972533914575551092L ^ var20)));
        _3H.cfr_renamed_5 = new _8B((int)_3H.b("x", (int)2025, (long)(1950666013425738132L ^ var20)), (int)_3H.b("x", (int)2025, (long)(1950666013425738132L ^ var20)), var22_1, (int)_3H.b("x", (int)26792, (long)(4183107516071825097L ^ var20)), (int)_3H.b("x", (int)14422, (long)(9029742926627642899L ^ var20)));
        _3H.cfr_renamed_3 = _3H.c("\u00db", (long)-6996168621110494033L, (long)var20);
        _3H.cfr_renamed_2 = new _8B((int)_3H.b("x", (int)17179, (long)(3966318006834292060L ^ var20)), var24_2, (int)_3H.b("x", (int)14843, (long)(4222943293270564772L ^ var20)), (int)_3H.b("x", (int)15453, (long)(4340056739956791867L ^ var20)));
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
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

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x3DB3;
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
                throw new RuntimeException("dev/krypton/3H", exception);
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
            _3H.c[n2] = _3H.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _3H.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/3H" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x38BD;
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
                throw new RuntimeException("dev/krypton/3H", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _3H.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _3H.b(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/3H" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
            case 0 -> 40;
            case 1 -> 12;
            case 2 -> 54;
            case 3 -> 10;
            case 4 -> 25;
            case 5 -> 45;
            case 6 -> 7;
            case 7 -> 52;
            case 8 -> 34;
            case 9 -> 22;
            case 10 -> 24;
            case 11 -> 47;
            case 12 -> 62;
            case 13 -> 4;
            case 14 -> 39;
            case 15 -> 43;
            case 16 -> 0;
            case 17 -> 44;
            case 18 -> 59;
            case 19 -> 32;
            case 20 -> 48;
            case 21 -> 30;
            case 22 -> 41;
            case 23 -> 17;
            case 24 -> 57;
            case 25 -> 16;
            case 26 -> 46;
            case 27 -> 51;
            case 28 -> 36;
            case 29 -> 28;
            case 30 -> 31;
            case 31 -> 11;
            case 32 -> 15;
            case 33 -> 55;
            case 34 -> 20;
            case 35 -> 6;
            case 36 -> 21;
            case 37 -> 29;
            case 38 -> 13;
            case 39 -> 49;
            case 40 -> 33;
            case 41 -> 23;
            case 42 -> 18;
            case 43 -> 35;
            case 44 -> 5;
            case 45 -> 38;
            case 46 -> 2;
            case 47 -> 9;
            case 48 -> 56;
            case 49 -> 63;
            case 50 -> 50;
            case 51 -> 3;
            case 52 -> 61;
            case 53 -> 8;
            case 54 -> 27;
            case 55 -> 53;
            case 56 -> 1;
            case 57 -> 14;
            case 58 -> 26;
            case 59 -> 19;
            case 60 -> 60;
            case 61 -> 37;
            case 62 -> 42;
            default -> 58;
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
        _3H.i[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "yA*4TQdT(uQ\r/";
        objectArray[1] = "\u0017q{A\u0011.\ndy\u0000\u0014rJY";
        objectArray[2] = "\"\u0014_\u000bM3?\u0001]JHou9";
        objectArray[3] = Double.TYPE;
        _3H.i[3] = "java/lang/Double";
        objectArray[4] = "\\\n1\rT>\\\n&QX1FA&OX$A0t\u0012\u0000g\u000b";
        objectArray[5] = Integer.TYPE;
        _3H.i[5] = "java/lang/Integer";
        objectArray[6] = "\\qBmZV)QIbK\u0019H_BiOC<";
        objectArray[7] = Boolean.TYPE;
        _3H.i[7] = "java/lang/Boolean";
        objectArray[8] = "\u0013\bs\u0004vB\u000e\u001dqEs\u001eO/";
        objectArray[9] = "{\u0011Z{56f\u0004X:0j&@";
        objectArray[10] = "G9rkGu2\u0019ydV:S\u0017roR`'";
        objectArray[11] = ">\u001cL+\u007fLK<G$n\u0003*2L/jY^";
        objectArray[12] = "$\u0016";
        objectArray[13] = "\u0013s._\rt\u0013s9\u0003\u0001{\t89\u001d\u0001n\u000eIkAT,";
        objectArray[14] = "6@\u000fc<\u0001C`\u0004l-N\"n\u000fg)\u0014V";
        objectArray[15] = Void.TYPE;
        _3H.i[15] = "java/lang/Void";
        objectArray[16] = "$!Z<-/$!M`! >jM~!59\u001b\u001d#p";
        objectArray[17] = "\u0001\u000fb\u0013<a\u0001\u000fuO0n\u001bDuQ0{\u001c5\"\u000ef";
        objectArray[18] = "\u0006*@,fZs\nK#w\u0015\u0012\u0004@(sOf";
        objectArray[19] = "'']\u0004 |R\u0007V\u000b133\t]\u00005iG";
        objectArray[20] = "@\u0010,,K&50'#ZiT>,(^3 ";
        objectArray[21] = "Mux\u000f<?8Us\u0000-pY[x\u000b)*-";
        objectArray[22] = "Pp\u00048J(%P\u000f7[gD^\u0004<_=0";
        objectArray[23] = "\u0000\u0006\u0013#?ju&\u0018,.%\u0014(\u0013'*\u007f`";
        objectArray[24] = " \t";
        objectArray[25] = "e\u0004y\u0019T{\u0010$r\u0016E4q*y\u001dAn\u0005";
        objectArray[26] = "\u001f\u0000A.\u0015\\j J!\u0004\u0013\u000b.A*\u0000I\u007f";
        objectArray[27] = "7g[-%}BGP\"42#I[)0hW";
        objectArray[28] = "9q\t)_\u001e9q\u001euS\u0011#:\u001ekS\u0004$KL6\u000bGo";
        objectArray[29] = "\u0018IO(N%\u0013F^g-(\u0006@";
        objectArray[30] = "\t&";
        objectArray[31] = "3\u0015\u007f\u001cLh3\u0015h@@g)^h^@r./8\u0007\u00123";
        objectArray[32] = "gF`\u0011LPzSbPI\f;\u0014";
        objectArray[33] = "F6M-?A3\u0016F\".\u000eR\u0018M)*T&";
        objectArray[34] = "\u0003m\u000b}YevM\u0000rH*\u0017C\u000byLpc";
        objectArray[35] = "J\u0001;u\u0003H?!0z\u0012\u0007^/;q\u0016]*";
        objectArray[36] = "6it\tLYCI\u007f\u0006]\u0016\"Gt\rYLV";
        objectArray[37] = "M9\u0011,\u00020P,\u0013m\u0007l\u001d7";
        objectArray[38] = "\u000fx^w\u001c\u001bzXUx\rT\u001bV^s\t\u000eo";
        objectArray[39] = "VF\b\u000fY5#f\u0003\u0000HzBh\b\u000bL 6";
        objectArray[40] = "b\u0006a\r$\u001d\u007f\u0013cL!A6\u000e";
        objectArray[41] = "&\u00160bC\u0007S6;mRH280fV\u0012F";
        objectArray[42] = "$r'\u001d[h-|$T\u0018e+|0V\u0005cii/KBr5x9\u001dqw2I/KBr5x\u001cZSp";
        objectArray[43] = "!\u001fEIr3<\nG\bwo|B";
        objectArray[44] = "p0\u0006\b-;\u0005\u0010\r\u0007<td\u001e\u0006\f8.\u0010";
        objectArray[45] = ";I\u000b\u0013HVNi\u0000\u001cY\u0019/g\u000b\u0017]C[";
        objectArray[46] = "@?\u007f'j^]*}fo\u0002\u001do";
        objectArray[47] = "E74]wY0\u0017?Rf\u0016Q\u00194YbL%";
        objectArray[48] = "*\u001f?Ti\u0016!\u0010.\u001b\u0014\u000e2\u0017'R";
        objectArray[49] = "\r\u0012(l)\u0016x2#c8Y\u0019<(h<\u0003m";
        objectArray[50] = "!M*\u001b\u0010\u0010Tm!\u0014\u0001_5c*\u001f\u0005\u0005A";
        objectArray[51] = "=0[>6LH\u0010P1'\u0003)\u001e[:#Y]";
        objectArray[52] = "rwsY!B\u0007WxV0\rfYs]4W\u0012";
        objectArray[53] = "y\u0000b\u0019(_\f i\u00169\u0010m.b\u001d=J\u0019";
        objectArray[54] = "df\u001e \u0001\"\u0011F\u0015/\u0010mpH\u001e$\u00147\u0004";
        objectArray[55] = "~\u0002C8d~~\u0002TdhqdITzhdc8\u0004%;";
        objectArray[56] = Float.TYPE;
        _3H.i[56] = "java/lang/Float";
        objectArray[57] = "\u000e3\fc\u0010\u001c\u0005<\u001d,q\u0012\u000e7\u0019v";
        objectArray[58] = "x(\fT\u001bZuh\u0014-\u0012\"c*\u000bKQA}+D";
        objectArray[59] = "T4V\\\u0012i\u0011,\u0018P\"j\f>\u0003Qu>WlW\u0002\"n\f9^ZM5\u0015,\f";
        objectArray[60] = "wu\\6Y/qc@b24~o@l^\u0006*.\u001b6\nQ)xImHnw+\u001ev2kxzFq\r5+-]\u000b\b:zuZ4Vi-n 1Y8ui\u001fo\non\u0013";
        objectArray[61] = "\u001bG4\u0006tNDAq\u0000\u0016\u0000~\u001ev\u000bhT\u0019W\"\u0002(\u0001~\u001d$\u0004pKACwSk1";
        objectArray[62] = "F\u000fuGx>\u0003\u0017;KHi\u007fQ}@66\u0018\u0018)Ivc\u007f\u0001>\u0017:,O\u0004uDqS";
        objectArray[63] = "|[ 6(M#]e0J\bA;bd,L|\\+0%\f);2'{@f\u000b7l(\u000b\u0019";
        objectArray[64] = "hwhahE-o&mX\u0012Q)`f&M6`4of\u0018Q,)j8Yo\u007f8zd(";
        objectArray[65] = "?\u0001\r=fQk\u0005[}\u0003\u0004\u0002E\u00186?C8\u001aV58";
        objectArray[66] = "q2l_1\u00164*\"S\u0001A9U`Ak\u0001-?4E=A";
        objectArray[67] = "f>6zWf#&xvg1\u000eYc*[49=ax\u001c:";
        objectArray[68] = "48OB\u001e\"cz]]z.3;PE\u0016\u001cdz\u000b\u0013FKg}^D\u001fzc6NS\u0019Ke8A\u001e\u0002q:vB\u0019zp!6\fZ@/o5\u000b\"Cpo>W@\u001f(.<A\"\u00131o5O\u0012\u0016z<~0";
        objectArray[69] = "Z\u000b\u00032\u000et\u001f\u0013M>> cQM9D|\t\u0005Io\u0004";
        objectArray[70] = "\u0001=a,ZU\f1g*?[\b#\ntT[\u0004\"5*\u0007\f\u001fX0%VT\u0018gnv\u0001Ob";
        objectArray[71] = "!p~h1\u001c~v;nSY\u001b\u0010<:5\u001d!wun<]t\u0010lyb\u0011; i21ZD";
        objectArray[72] = "2/\u000fc(7w7Ao\u0018`qH\u0003}r n\"Wy$`";
        objectArray[73] = "\u001dQK+\u0002\u0006XI\u0005'2Z$\u000b\u0005 H\u000eN_\u0001v\b";
        objectArray[74] = "\f;/e2b\u0001{7\u001c:\\n-(cc~\u0007zjq|";
        objectArray[75] = "/\u0002\u0018?|C{\u0006N\u007f\u0019\u0011\u0012DK#gLu\r\u001f*'\u0019\u0012M\u0010#kM.\u0007\u0012{()";
        objectArray[76] = "8l`X>yrf|SO}ds}T#O53-\u0002O#v~!Ku|8}&3";
        objectArray[77] = "]O\u001c}G\u001a\u0018WRqwGd\u0011\u0014z\t\u0012\u0003X@sIGdAW-\u0005\bTD\u001c~Nw";
        objectArray[78] = "0h'tirdlq4\f$H\u0017vq}$u-)?~#";
        objectArray[79] = "WGiz7=\f^|(P7PZc$<\u0005\u0004\u001b;|P8BYc'9o\u0000K|C9(\fT|s<c_\u001f\u0003";
        objectArray[80] = "W\u001fQDu[\u0012\u0007\u001fHE\f\u0015xZN,P\u0014G\u0004\u001d{K";
        objectArray[81] = "\u0004\u0017{b\u0010\u001d[\u0011>dr]\u0002w90\u0014\u001c\u0004\u0010pd\u001d\\QwisC\u0010\u001eGl8\u0010[a";
        objectArray[82] = "E\")\u0012M3\u000f(5\u0019<7\u0019=4\u001eP\u0005H|lG<i\u000b0h\u0001\u00066E3oy";
        objectArray[83] = "\u000f\\k5}7\u0013\u0002{k\u000f6p\u000790qn\u0017Nm91;pNa82zKPolq\u000b";
        objectArray[84] = "#jMPGpf,ML\"<\u001d+LK\\ezb\u0018B\u001c0\u001d/\nGXew{\u000e\u0011\u0018\u0000";
        objectArray[85] = ">\u001cT\u0001\u00121{\u0004\u001a\r\"m\u0007B\\\u0006\\9`\u000b\b\u000f\u001cl\u0007\u0012\u001fQP#7\u0017T\u0002\u001b\\";
        objectArray[86] = ".\u0017g+0Ok\u000f)'\u0000\u0018Ppl!iDmO2r>_";
        objectArray[87] = "C.&qkk\u00066h}[<\nI*o1|\u001f#~kg<";
        objectArray[88] = "\b>zO\n`M&4C:7_YvQPwT3\"U\u00067";
        objectArray[89] = "\f`l\u0012\"0Ix\"\u001e\u0012ge\u0007c\u000b* Pw&M*<";
        objectArray[90] = "WxL|4\u001b\u0012`\u0002p\u0004Ln\"\u0002w~\u0013\u0004v\u0006!>";
        objectArray[91] = "b||5;!=z93Yb\u0007%>8';`lj1gn\u0007&l7?$8x?`$^";
        objectArray[92] = "]yV\u001ag\t\u0018a\u0018\u0016W^(\u001e[\u000b=\u0004\u0015 \b\u001a-X";
        objectArray[93] = "(+{\u0011#Bm35\u001d\u0013\u0015wLp\u001bzIks.H-R";
        objectArray[94] = "\u0018'x\u0004+=\u0013'!\u0007\u0016=E?;6*i\u0013jC[}?D |\u0005.h_Z";
        objectArray[95] = "G\u0005!\u0016j\u001b\u0002C!\n\u000fRyD \rq\u000e\u001e\rt\u00041[y\u0014cZ}\u0014I\u0011(\t6k";
        objectArray[96] = "4;JR@nq}JN%&\nzKI[{m3\u001f@\u001b.\ny\u0019FCd5'J\u0011X\u001e";
        objectArray[97] = "0%\u0013b\u0018\u0003u=]n(P\t{\u001beV\u000bn2Ol\u0016^\t+X2Z\u00119.\u0013a\u0011n";
        objectArray[98] = "\u0014\u0010z7!FQ\b4;\u0011\u0011Mwq=xMWH/n/V";
        objectArray[99] = ",n@\t\t/'n\u0019\n4!{o\u001b\u000bX\u0013)/AP\tD-l\nPL~r\"\tW4";
        objectArray[100] = "\u0001\u0012Ep\r4DTElh|?SDk\u0016!X\u001a\u0010bVt?W\u0002g\u0012!U\u0003\u00061RD";
        objectArray[101] = "5\u0017xn^5j\u0011=h<p*w:<Z45\u0010shSt`wj\u007f\r8/Go4^sP";
        objectArray[102] = "h)\u0005\u0001\u0017Y-1K\r'\u000e\u0017N\t\u001fMN4$]\u001b\u001b\u000e";
        objectArray[103] = "B/hk{\u0015\u0000hrm\u0014NYW09r\r_0ym{M\nW`z%\u0001Ege1vJ:";
        objectArray[104] = "Ai@\r\u000f3\u0004q\u000e\u0001?fx3\u000e\u0006E;\u0012g\nP\u0005";
        objectArray[105] = "\u001d*\u0019\u001dyF\u001b\u007fEB@\u0016f/\u001c\u001d>N\u0001fH\u0014~\u001bfj_\t=\u0016\u001c.K\u0004?+";
        objectArray[106] = "(D\u0019+ jm\\W'\u0010=|#\u0014:zg`\u001dG+j;";
        objectArray[107] = ";8\u0006E\u0014<d>CCv|^=\u001dU\u001d!!b\u001b\u0010\u001b";
        objectArray[108] = "7V\u001b\u000eV.rNU\u0002fyb1\u0017\u0010\f9k[C\u0014Zy";
        objectArray[109] = ">\u0014RR\u000fb{\f\u001c^?2\u0007\u0017R\u000f\u0000ic\u0015\u0000H\u000e";
        objectArray[110] = "\u00155\u000eci|P-@oY*,o@h#tF;D>c";
        objectArray[111] = "9\u001d#\b3\u00059Gj@KND\u0018h_5\u0012#Q<VuGDH+\b9\btM`[rw";
        objectArray[112] = "hw\u0017u[\u0006-oYykQ\t\u0010\u001bk\u0001\u00114zOoWQ";
        objectArray[113] = ".^\u0012JsrkF\\FC%@9\u001eT)erSJP\u007f%";
        objectArray[114] = "F\u00100g\u0000R\u0012\u0014f'e\u0005{Vc{\u001b]\u001c\u001f7r[\b{R%w\u001f]\u0011\u0006!!_8";
        objectArray[115] = "z\t\u0004k%\u000f!\u0010\u00119B\u000eq\u0005\n>\u0015Y/USR(\u001fo\b\n;\u007f]}\u0017";
        objectArray[116] = "\u0010\b\u001c\u0000\\VD\fJ@9\rjwOC_BH\u0010\u0006\u0017V\u0002\u001dwM\u0005H\u0000UM\u0012KK\u0007-";
        objectArray[117] = "}Vu\u007fBhp\u0016m\u0006JS\u001fHq~\n!gE1f";
        objectArray[118] = "?WY(\u0014\u001ckS\u000fhqG\u0002\u0011\n4\u000f\u0013eX^=OF\u0002\u0015L8\u000b\u0013hAHnKv";
        objectArray[119] = "KH)pZ\u001a\t\u000f3v5Ab0q\"S\u0002VW8vZB\u00030!a\u0004\u000eL\u0000$*WE3";
        objectArray[120] = "H\u001d0ve@\r\u0005~zU\u0013qC8q+H\u0016\nlxk\u001dqG~}/H\u001b\u0013z+o-";
        objectArray[121] = "o)\u0000\u001fr940\u0015M\u00153h4\nAy\u0001?rT\u0016.V4+\u0017Md7~!\u000bF\u0015";
        objectArray[122] = "47v\u001fh=qqv\u0003\ru\nvw\u0004s(m?#\r3}\n&4S\u007f2:#\u007f\u00004M";
        objectArray[123] = "\\8\b\u0010g;\u0019 F\u001cWmef\u0000\u0017)3\u0002/T\u001eife6C@%)U3\b\u0013nV";
        objectArray[124] = ":}?5no\u007feq9^8;\u001a3+4xfpg/b8";
        objectArray[125] = "8ge\tR\rlc3I7\\\u0005#p\u0002\u000b\u001f?|>\u0001\f";
        objectArray[126] = ",=@eJYs;\u0005c(\u001b\u0011]\u00027NX,:KcG\u0018y]Rt\u0019T6mW?J\u001fI";
        objectArray[127] = "Gwlmy\u0000_bi9\u0004\u0000BixW8T\u00141\u0000;{\u001a\u0019t:d5\u0019\u001e\f";
        objectArray[128] = "Z\tj\"'R\u001f\u0011$.\u0017\u0001cS$)mZ\t\u0007 \u007f-";
        objectArray[129] = ".9xG\u0001Z#y`>\tyL/aT\tE#txA[";
        objectArray[130] = "Kz@ \u0000\u0013@z\u0019#=\u0013\u0016b\u0003\u0012\u0001G@6{\u007fV\u0011\u0017}D!\u0005F\f\u0007";
        objectArray[131] = "\u00161abqRB57\"\u0014\b+uti(@\u0011*:j/";
        objectArray[132] = "\u0014jRU\u0016Z^`N^g^HuOY\u000bl\u00195\u001e\u0003g\u0000Zx\u0013F]_\u0014{\u0014>";
        objectArray[133] = "B+te\u0001S\u001d-1cc\u001c'r6h\u001dI@;ba]\u001c'qdg\u0005V\u0018/70\u001e,";
        Object[] objectArray2 = objectArray;
        objectArray[134] = "<TL@B3hP\u001a\u0000'eH+\u001bEM#dAOA\u001bc";
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _3H.a(l2, l3);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                _3H.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _3H.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _3H.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _3H.a(l2, l3);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = _3H.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _3H.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _3H.a(clazz3, string2, clazz2)) != null) {
                    _3H.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _3H.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _3H.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _3H.b(4024380653350672L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
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

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _3H.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _3H.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method d(long l2, long l3) {
        int n = _3H.a(l2, l3);
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
                clazz3 = _3H.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _3H.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _3H.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _3H.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _3H.b(4024380653350672L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _3H.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _3H.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _3H.b(4024380653350672L, 0L);
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ed' || c == '\u00f2' || c == '\u00db' || c == 'u') {
                field = _3H.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ed' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f2' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00db' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _3H.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ba' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _3H.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/3H" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_3H.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_3H.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_3H.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

