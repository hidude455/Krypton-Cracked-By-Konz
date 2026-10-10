/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_11905
 *  net.minecraft.class_11908
 *  net.minecraft.class_11909
 *  net.minecraft.class_2248
 */
package dev.krypton;

import dev.krypton._02;
import dev.krypton._0D;
import dev.krypton._7V;
import dev.krypton._8e;
import dev.krypton._96;
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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_11905;
import net.minecraft.class_11908;
import net.minecraft.class_11909;
import net.minecraft.class_2248;

public class _8C
extends _8e {
    private final _96 cfr_renamed_4;
    private final List cfr_renamed_3;
    private final int cfr_renamed_76;
    private final int cfr_renamed_1;
    private final Set cfr_renamed_171;
    private final int cfr_renamed_8;
    private final int cfr_renamed_388;
    private final _7V cfr_renamed_9;
    private List cfr_renamed_6;
    private int cfr_renamed_419;
    private int cfr_renamed_463;
    private int cfr_renamed_464;
    private static final long b;
    private static final String[] f;
    private static final String[] g;
    private static final Map h;
    private static final long[] l;
    private static final Integer[] m;
    private static final Map n;
    private static final Object[] q;
    private static final String[] r;

    public _8C(_0D d, long l2, _96 var4_3) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x9C082A1FF0DL;
        long l5 = l3 ^ 0x7CC058FB23E7L;
        long l6 = l3 ^ 0x3BE3F8A0A62DL;
        long l7 = l3 ^ 0x5A0A29F00071L;
        int n = (int)(l7 >>> 32);
        int n2 = (int)(l7 << 32 >>> 56);
        int n3 = (int)(l7 << 40 >>> 40);
        long l8 = l3 ^ 0x1CFA656BA71AL;
        long l9 = l3 ^ 0x4ACE4F3AB7C9L;
        super((String)((Object)_8C.b("x", 17717, (long)(0xA2FA5C52A415AAL ^ l2))));
        this.cfr_renamed_76 = (int)_8C.d("t", 27851, (long)(0x6F7F1A2DAB84DD9DL ^ l2));
        this.cfr_renamed_1 = (int)_8C.d("t", 22877, (long)(0x42B5918F9F216814L ^ l2));
        this.cfr_renamed_8 = (int)_8C.d("t", 28637, (long)(0x4D4F5624D411DE82L ^ l2));
        this.cfr_renamed_388 = (int)_8C.d("t", 24135, (long)(0x684A1741280CEF17L ^ l2));
        this.cfr_renamed_9 = new _7V(l5);
        _8C.f("\u00f3", (Object)this, (int)_8C.d("t", 14885, (long)(0x27DC05CBE0AC0B63L ^ l2)), -6496601929954302713L, (long)l2);
        _8C.f("\u00f3", (Object)this, (int)_8C.d("t", 14885, (long)(0x27DC05CBE0AC0B63L ^ l2)), -6494546246344549771L, (long)l2);
        _8C.f("\u00f3", (Object)this, (int)_8C.d("t", 14885, (long)(0x27DC05CBE0AC0B63L ^ l2)), -6495372441014014706L, (long)l2);
        this.cfr_renamed_4 = var4_3;
        Object[] objectArray = new Object[1];
        objectArray[0] = l8;
        this.cfr_renamed_171 = new HashSet(_8C.f("\u00e6", (Object)var4_3, (Object)objectArray, -6496383251636784460L, (long)l2));
        this.cfr_renamed_3 = new ArrayList();
        _8C.f("\u00e6", (Object)_8C.f("P", -6497084009376964725L, (long)l2), arg_0 -> this.cfr_renamed_7(n, (byte)n2, n3, arg_0), -6491853206302335741L, (long)l2);
        _8C.f("\u00f3", (Object)this, new ArrayList(_8C.f("\u00c8", (Object)this, -6497857808305296019L, (long)l2)), -6491518687048642446L, (long)l2);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = _8C.b("x", 18252, (long)(0x201D6009F60297D0L ^ l2));
        objectArray2[0] = l4;
        _8C.f("\u00e6", (Object)_8C.f("\u00c8", (Object)this, -6494340581185047707L, (long)l2), (Object)objectArray2, -6494837304132420781L, (long)l2);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = () -> this.cfr_renamed_4(l9);
        objectArray3[0] = l6;
        _8C.f("\u00e6", (Object)_8C.f("\u00c8", (Object)this, -6494340581185047707L, (long)l2), (Object)objectArray3, -6496560180048019530L, (long)l2);
    }

    @Override
    public String java_lang_String_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 ^ 0x636E2B572E5EL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        return (String)((Object)_8C.b("x", 16254, (long)(0x52D0B472A167D20L ^ l2))) + (String)((Object)_8C.f("\u00e6", (Object)_8C.f("\u00e6", (Object)_8C.f("\u00c8", (Object)this, -5254669390964193212L, (long)l2), (Object)objectArray2, -5254496890882714404L, (long)l2), -5253175540396842316L, (long)l2)) + (String)((Object)_8C.b("x", 9923, (long)(0x79072CA44D649CL ^ l2))) + (int)_8C.f("\u00e6", (Object)_8C.f("\u00c8", (Object)this, -5249007487313844467L, (long)l2), -5252455824457019820L, (long)l2) + (String)((Object)_8C.b("x", 18817, (long)(0x7852B48E127C0BDCL ^ l2)));
    }

    @Override
    protected int int_6(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return (int)_8C.d("t", 6076, (long)(0x1B16AC440CEC7F1BL ^ l2));
    }

    @Override
    protected int int_9(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return (int)_8C.d("t", 26631, (long)(0x6EF6438B7FE6E16EL ^ l2));
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void cfr_renamed_9(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [70[WHILELOOP], 71[DOLOOP]], but top level block is 32[TRYBLOCK]
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

    public boolean method_25402(class_11909 class_119092, boolean bl) {
        reference v28;
        block68: {
            block69: {
                block75: {
                    CallSite callSite;
                    CallSite callSite2;
                    reference var33_27;
                    reference var32_26;
                    boolean bl2;
                    CallSite callSite3;
                    CallSite callSite4;
                    long l2;
                    block74: {
                        _8C c;
                        block72: {
                            block73: {
                                Object object;
                                block77: {
                                    block71: {
                                        _8C c2;
                                        block70: {
                                            reference v25;
                                            CallSite callSite5;
                                            CallSite callSite6;
                                            long l3;
                                            block67: {
                                                CallSite callSite7;
                                                block65: {
                                                    CallSite callSite8;
                                                    block66: {
                                                        CallSite callSite9;
                                                        block63: {
                                                            CallSite callSite10;
                                                            reference var20_13;
                                                            block64: {
                                                                block61: {
                                                                    reference var30_24;
                                                                    CallSite callSite11;
                                                                    CallSite callSite12;
                                                                    CallSite callSite13;
                                                                    block62: {
                                                                        block59: {
                                                                            reference var29_23;
                                                                            block60: {
                                                                                CallSite callSite14;
                                                                                long l4;
                                                                                block57: {
                                                                                    block58: {
                                                                                        block55: {
                                                                                            reference var24_17;
                                                                                            CallSite callSite15;
                                                                                            block56: {
                                                                                                long l5 = l2 = b ^ 0x583EDE5FB691L;
                                                                                                l4 = l5 ^ 0x27644A84FDC6L;
                                                                                                long l6 = l5 ^ 0x7DFB5EC2AD5FL;
                                                                                                long l7 = l5 ^ 0xBD70C10CCB6L;
                                                                                                l3 = l5 ^ 0x20FD85AEB383L;
                                                                                                long l8 = l5 ^ 0x9C138A1FEDDL;
                                                                                                Object[] objectArray = new Object[2];
                                                                                                objectArray[1] = l8;
                                                                                                objectArray[0] = (double)_8C.f("\u00e6", (Object)class_119092, 5869841815448038776L, (long)l2);
                                                                                                callSite4 = _8C.f("\u00e6", (Object)this, (Object)objectArray, 5870231338360906865L, (long)l2);
                                                                                                Object[] objectArray2 = new Object[2];
                                                                                                objectArray2[1] = l8;
                                                                                                objectArray2[0] = (double)_8C.f("\u00e6", (Object)class_119092, 5855252786873772027L, (long)l2);
                                                                                                callSite3 = _8C.f("\u00e6", (Object)this, (Object)objectArray2, 5870231338360906865L, (long)l2);
                                                                                                Object[] objectArray3 = new Object[1];
                                                                                                objectArray3[0] = l6;
                                                                                                callSite6 = _8C.f("\u00e6", (Object)this, (Object)objectArray3, 5872654913002906693L, (long)l2);
                                                                                                Object[] objectArray4 = new Object[1];
                                                                                                objectArray4[0] = l7;
                                                                                                callSite5 = _8C.f("\u00e6", (Object)this, (Object)objectArray4, 5871417828323499577L, (long)l2);
                                                                                                var20_13 = _8C.f("\u00c8", (Object)this, 5870459253452142513L, (long)l2) + _8C.d("t", 28637, (long)(0x4D4F731A5BD82A29L ^ l2));
                                                                                                callSite15 = _8C.d("t", 13408, (long)(0x4726D593E014F183L ^ l2));
                                                                                                callSite10 = _8C.d("t", 3105, (long)(0x2BED15FB6AFF49C7L ^ l2));
                                                                                                reference var23_16 = _8C.f("\u00c8", (Object)this, 5868936297124208206L, (long)l2) + _8C.d("t", 18603, (long)(0x53BD0F3A64B88D52L ^ l2));
                                                                                                var24_17 = var23_16 + callSite15 + _8C.d("t", 22058, (long)(0x33B0B9EF333F13CAL ^ l2));
                                                                                                bl2 = _02.cfr_renamed_2();
                                                                                                try {
                                                                                                    try {
                                                                                                        Object[] objectArray5 = new Object[7];
                                                                                                        objectArray5[6] = (int)callSite10;
                                                                                                        objectArray5[5] = (int)callSite15;
                                                                                                        objectArray5[4] = (int)var20_13;
                                                                                                        objectArray5[3] = (int)var23_16;
                                                                                                        objectArray5[2] = (double)callSite3;
                                                                                                        objectArray5[1] = (double)callSite4;
                                                                                                        objectArray5[0] = l3;
                                                                                                        callSite14 = _8C.f("\u00e6", (Object)this, (Object)objectArray5, 5870777938807533819L, (long)l2);
                                                                                                        if (bl2) break block55;
                                                                                                        if (callSite14 == false) break block56;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw _8C.a((Exception)((Object)matchException));
                                                                                                    }
                                                                                                    _8C.f("\u00f3", (Object)this, (int)_8C.d("t", 4269, (long)(0x333C8FDA66C7D57FL ^ l2)), 5869766634947784414L, (long)l2);
                                                                                                    return true;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw _8C.a((Exception)((Object)matchException));
                                                                                                }
                                                                                            }
                                                                                            Object[] objectArray = new Object[7];
                                                                                            objectArray[6] = (int)callSite10;
                                                                                            objectArray[5] = (int)callSite15;
                                                                                            objectArray[4] = (int)var20_13;
                                                                                            objectArray[3] = (int)var24_17;
                                                                                            objectArray[2] = (double)callSite3;
                                                                                            objectArray[1] = (double)callSite4;
                                                                                            objectArray[0] = l3;
                                                                                            callSite14 = _8C.f("\u00e6", (Object)this, (Object)objectArray, 5870777938807533819L, (long)l2);
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                if (bl2) break block57;
                                                                                                if (callSite14 == false) break block58;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw _8C.a((Exception)((Object)matchException));
                                                                                            }
                                                                                            _8C.f("\u00f3", (Object)this, (int)_8C.d("t", 18451, (long)(0x170787576BC20DEFL ^ l2)), 5869766634947784414L, (long)l2);
                                                                                            return true;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw _8C.a((Exception)((Object)matchException));
                                                                                        }
                                                                                    }
                                                                                    callSite14 = _8C.f("\u00c8", (Object)this, 5870459253452142513L, (long)l2) + callSite5 - _8C.d("t", 28637, (long)(0x4D4F731A5BD82A29L ^ l2));
                                                                                }
                                                                                callSite13 = callSite14;
                                                                                callSite12 = _8C.d("t", 11245, (long)(0x58A3E30BC7AD6E09L ^ l2));
                                                                                callSite11 = _8C.d("t", 3105, (long)(0x2BED15FB6AFF49C7L ^ l2));
                                                                                reference var28_22 = _8C.f("\u00c8", (Object)this, 5868936297124208206L, (long)l2) + callSite6 - callSite12 - _8C.d("t", 18603, (long)(0x53BD0F3A64B88D52L ^ l2));
                                                                                var29_23 = var28_22 - callSite12 - _8C.d("t", 22058, (long)(0x33B0B9EF333F13CAL ^ l2));
                                                                                var30_24 = var29_23 - callSite12 - _8C.d("t", 22058, (long)(0x33B0B9EF333F13CAL ^ l2));
                                                                                try {
                                                                                    try {
                                                                                        Object[] objectArray = new Object[7];
                                                                                        objectArray[6] = (int)callSite11;
                                                                                        objectArray[5] = (int)callSite12;
                                                                                        objectArray[4] = (int)callSite13;
                                                                                        objectArray[3] = (int)var28_22;
                                                                                        objectArray[2] = (double)callSite3;
                                                                                        objectArray[1] = (double)callSite4;
                                                                                        objectArray[0] = l3;
                                                                                        callSite9 = _8C.f("\u00e6", (Object)this, (Object)objectArray, 5870777938807533819L, (long)l2);
                                                                                        if (bl2) break block59;
                                                                                        if (callSite9 != false) {
                                                                                        }
                                                                                        break block60;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw _8C.a((Exception)((Object)matchException));
                                                                                    }
                                                                                    Object[] objectArray = new Object[2];
                                                                                    objectArray[1] = new HashSet(_8C.f("\u00c8", (Object)this, 5855795029569962345L, (long)l2));
                                                                                    objectArray[0] = l4;
                                                                                    _8C.f("\u00e6", (Object)_8C.f("\u00c8", (Object)this, 5870331108620037664L, (long)l2), (Object)objectArray, 5868224644358562337L, (long)l2);
                                                                                    _8C.f("\u00e6", (Object)_8C.f("P", 5855716202138437581L, (long)l2), (Object)_8C.f("\u00c8", (Object)_8C.f("P", 5871634743296743217L, (long)l2), 5867516466028244444L, (long)l2), 5868505611323763777L, (long)l2);
                                                                                    return true;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw _8C.a((Exception)((Object)matchException));
                                                                                }
                                                                            }
                                                                            Object[] objectArray = new Object[7];
                                                                            objectArray[6] = (int)callSite11;
                                                                            objectArray[5] = (int)callSite12;
                                                                            objectArray[4] = (int)callSite13;
                                                                            objectArray[3] = (int)var29_23;
                                                                            objectArray[2] = (double)callSite3;
                                                                            objectArray[1] = (double)callSite4;
                                                                            objectArray[0] = l3;
                                                                            callSite9 = _8C.f("\u00e6", (Object)this, (Object)objectArray, 5870777938807533819L, (long)l2);
                                                                        }
                                                                        try {
                                                                            try {
                                                                                if (bl2) break block61;
                                                                                if (callSite9 == false) break block62;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw _8C.a((Exception)((Object)matchException));
                                                                            }
                                                                            _8C.f("\u00e6", (Object)_8C.f("P", 5855716202138437581L, (long)l2), (Object)_8C.f("\u00c8", (Object)_8C.f("P", 5871634743296743217L, (long)l2), 5867516466028244444L, (long)l2), 5868505611323763777L, (long)l2);
                                                                            return true;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw _8C.a((Exception)((Object)matchException));
                                                                        }
                                                                    }
                                                                    Object[] objectArray = new Object[7];
                                                                    objectArray[6] = (int)callSite11;
                                                                    objectArray[5] = (int)callSite12;
                                                                    objectArray[4] = (int)callSite13;
                                                                    objectArray[3] = (int)var30_24;
                                                                    objectArray[2] = (double)callSite3;
                                                                    objectArray[1] = (double)callSite4;
                                                                    objectArray[0] = l3;
                                                                    callSite9 = _8C.f("\u00e6", (Object)this, (Object)objectArray, 5870777938807533819L, (long)l2);
                                                                }
                                                                try {
                                                                    try {
                                                                        if (bl2) break block63;
                                                                        if (callSite9 == false) break block64;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw _8C.a((Exception)((Object)matchException));
                                                                    }
                                                                    _8C.f("\u00e6", (Object)_8C.f("\u00c8", (Object)this, 5855795029569962345L, (long)l2), 5870397097513719482L, (long)l2);
                                                                    return true;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw _8C.a((Exception)((Object)matchException));
                                                                }
                                                            }
                                                            callSite9 = var20_13 + callSite10 + _8C.d("t", 22058, (long)(0x33B0B9EF333F13CAL ^ l2));
                                                        }
                                                        callSite8 = callSite9;
                                                        var32_26 = _8C.f("\u00c8", (Object)this, 5868936297124208206L, (long)l2) + _8C.d("t", 18603, (long)(0x53BD0F3A64B88D52L ^ l2));
                                                        try {
                                                            try {
                                                                callSite7 = _8C.f("\u00c8", (Object)this, 5869766634947784414L, (long)l2);
                                                                if (bl2) break block65;
                                                                if (callSite7 != false) break block66;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _8C.a((Exception)((Object)matchException));
                                                            }
                                                            v25 = callSite8 + _8C.d("t", 3105, (long)(0x2BED15FB6AFF49C7L ^ l2)) + _8C.d("t", 19690, (long)(0x78B3539082A8093AL ^ l2));
                                                            break block67;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _8C.a((Exception)((Object)matchException));
                                                        }
                                                    }
                                                    callSite7 = callSite8;
                                                }
                                                v25 = callSite7 + _8C.d("t", 19690, (long)(0x78B3539082A8093AL ^ l2));
                                            }
                                            var33_27 = v25;
                                            reference var34_28 = callSite6 - _8C.d("t", 28637, (long)(0x4D4F731A5BD82A29L ^ l2));
                                            reference var35_29 = callSite5 - (var33_27 - _8C.f("\u00c8", (Object)this, 5870459253452142513L, (long)l2)) - _8C.d("t", 22357, (long)(0x24754EE128A592B9L ^ l2));
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            Object[] objectArray = new Object[7];
                                                            objectArray[6] = (int)var35_29;
                                                            objectArray[5] = (int)var34_28;
                                                            objectArray[4] = (int)var33_27;
                                                            objectArray[3] = (int)var32_26;
                                                            objectArray[2] = (double)callSite3;
                                                            objectArray[1] = (double)callSite4;
                                                            objectArray[0] = l3;
                                                            v28 = _8C.f("\u00e6", (Object)this, (Object)objectArray, 5870777938807533819L, (long)l2);
                                                            if (bl2) break block68;
                                                            if (v28 == false) break block69;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _8C.a((Exception)((Object)matchException));
                                                        }
                                                        c2 = this;
                                                        if (bl2) break block70;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _8C.a((Exception)((Object)matchException));
                                                    }
                                                    if (_8C.f("\u00c8", (Object)c2, 5869766634947784414L, (long)l2) != false) break block71;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _8C.a((Exception)((Object)matchException));
                                                }
                                                c2 = this;
                                            }
                                            catch (MatchException matchException) {
                                                throw _8C.a((Exception)((Object)matchException));
                                            }
                                        }
                                        object = _8C.f("\u00c8", (Object)c2, 5855342638171825369L, (long)l2);
                                        break block77;
                                    }
                                    object = new ArrayList(_8C.f("\u00c8", (Object)this, 5855795029569962345L, (long)l2));
                                }
                                callSite2 = object;
                                try {
                                    try {
                                        c = this;
                                        if (bl2) break block72;
                                        if (_8C.f("\u00c8", (Object)c, 5869766634947784414L, (long)l2) != false) break block73;
                                    }
                                    catch (MatchException matchException) {
                                        throw _8C.a((Exception)((Object)matchException));
                                    }
                                    callSite = _8C.f("\u00c8", (Object)this, 5871651343432487340L, (long)l2);
                                    break block74;
                                }
                                catch (MatchException matchException) {
                                    throw _8C.a((Exception)((Object)matchException));
                                }
                            }
                            c = this;
                        }
                        callSite = _8C.f("\u00c8", (Object)c, 5868445483952150949L, (long)l2);
                    }
                    CallSite callSite16 = callSite;
                    CallSite callSite17 = _8C.d("t", 18458, (long)(0x3E3ABCA173FC8DF0L ^ l2));
                    reference var39_33 = callSite16 * _8C.d("t", 27851, (long)(0x6F7F3F13244D2936L ^ l2));
                    reference var40_34 = callSite4 - var32_26 - 5;
                    reference var41_35 = callSite3 - var33_27 - 5;
                    reference var42_36 = var40_34 / callSite17;
                    reference var43_37 = var41_35 / callSite17;
                    try {
                        try {
                            try {
                                v28 = var42_36;
                                if (bl2) break block68;
                                if (v28 < 0) break block69;
                            }
                            catch (MatchException matchException) {
                                throw _8C.a((Exception)((Object)matchException));
                            }
                            v28 = var42_36;
                            if (bl2) break block68;
                        }
                        catch (MatchException matchException) {
                            throw _8C.a((Exception)((Object)matchException));
                        }
                        if (v28 >= _8C.d("t", 27851, (long)(0x6F7F3F13244D2936L ^ l2))) break block69;
                    }
                    catch (MatchException matchException) {
                        throw _8C.a((Exception)((Object)matchException));
                    }
                    reference var44_38 = var39_33 + var43_37 * _8C.d("t", 27851, (long)(0x6F7F3F13244D2936L ^ l2)) + var42_36;
                    try {
                        try {
                            try {
                                v28 = var44_38;
                                if (bl2) break block68;
                                if (v28 < 0) break block69;
                            }
                            catch (MatchException matchException) {
                                throw _8C.a((Exception)((Object)matchException));
                            }
                            v28 = var44_38;
                            if (bl2) break block68;
                        }
                        catch (MatchException matchException) {
                            throw _8C.a((Exception)((Object)matchException));
                        }
                        if (v28 >= _8C.f("\u00e6", (Object)callSite2, 5872144795590231223L, (long)l2)) break block69;
                    }
                    catch (MatchException matchException) {
                        throw _8C.a((Exception)((Object)matchException));
                    }
                    class_2248 class_22482 = (class_2248)_8C.f("\u00e6", (Object)callSite2, (int)var44_38, 5869259527065374444L, (long)l2);
                    try {
                        CallSite callSite15;
                        block76: {
                            try {
                                try {
                                    callSite15 = _8C.f("\u00e6", (Object)_8C.f("\u00c8", (Object)this, 5855795029569962345L, (long)l2), (Object)class_22482, 5870190169850476144L, (long)l2);
                                    if (bl2) break block75;
                                    if (callSite15 == false) break block76;
                                }
                                catch (MatchException matchException) {
                                    throw _8C.a((Exception)((Object)matchException));
                                }
                                _8C.f("\u00e6", (Object)_8C.f("\u00c8", (Object)this, 5855795029569962345L, (long)l2), (Object)class_22482, 5870566360202029258L, (long)l2);
                                if (!bl2) break block75;
                            }
                            catch (MatchException matchException) {
                                throw _8C.a((Exception)((Object)matchException));
                            }
                        }
                        callSite15 = _8C.f("\u00e6", (Object)_8C.f("\u00c8", (Object)this, 5855795029569962345L, (long)l2), (Object)class_22482, 5871220066616313899L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw _8C.a((Exception)((Object)matchException));
                    }
                }
                return true;
            }
            v28 = (reference)super.method_25402(class_119092, bl);
        }
        return (boolean)v28;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean method_25401(double var1_1, double var3_2, double var5_3, double var7_4) {
        block42: {
            block43: {
                block50: {
                    block49: {
                        block51: {
                            block46: {
                                block47: {
                                    block53: {
                                        block45: {
                                            block44: {
                                                block41: {
                                                    block39: {
                                                        block40: {
                                                            v0 = var9_5 = _8C.b ^ 133021727968471L;
                                                            var11_6 = v0 ^ 102521008477977L;
                                                            var13_7 = v0 ^ 47357829363440L;
                                                            var15_8 = v0 ^ 244060703173L;
                                                            var17_9 = v0 ^ 45099004822683L;
                                                            v1 = new Object[2];
                                                            v1[1] = var17_9;
                                                            v1[0] = var1_1;
                                                            var1_1 = (double)_8C.f("\u00e6", (Object)this, (Object)v1, (long)3112374962218229303L, (long)var9_5);
                                                            v2 = new Object[2];
                                                            v2[1] = var17_9;
                                                            v2[0] = var3_2;
                                                            var3_2 = (double)_8C.f("\u00e6", (Object)this, (Object)v2, (long)3112374962218229303L, (long)var9_5);
                                                            v3 = new Object[1];
                                                            v3[0] = var11_6;
                                                            var20_10 = _8C.f("\u00e6", (Object)this, (Object)v3, (long)3114797977960832515L, (long)var9_5);
                                                            v4 = new Object[1];
                                                            v4[0] = var13_7;
                                                            var21_11 = _8C.f("\u00e6", (Object)this, (Object)v4, (long)3115742919757554815L, (long)var9_5);
                                                            var22_12 = _8C.f("\u00c8", (Object)this, (long)3115980029220294135L, (long)var9_5) + _8C.d("t", (int)28637, (long)(5570763481546772591L ^ var9_5));
                                                            var19_13 = _02.cfr_renamed_2();
                                                            var23_14 = var22_12 + _8C.d("t", (int)3105, (long)(3165244654530016129L ^ var9_5)) + _8C.d("t", (int)22058, (long)(3724645299209595276L ^ var9_5));
                                                            var24_15 = _8C.f("\u00c8", (Object)this, (long)3113261344870392840L, (long)var9_5) + _8C.d("t", (int)18603, (long)(6034031848851568404L ^ var9_5));
                                                            try {
                                                                try {
                                                                    v5 = _8C.f("\u00c8", (Object)this, (long)3113035601759753368L, (long)var9_5);
                                                                    if (var19_13) break block39;
                                                                    if (v5 != false) break block40;
                                                                }
                                                                catch (MatchException v6) {
                                                                    throw _8C.a((Exception)v6);
                                                                }
                                                                v7 = var23_14 + _8C.d("t", (int)3105, (long)(3165244654530016129L ^ var9_5)) + _8C.d("t", (int)19690, (long)(8697422117850870652L ^ var9_5));
                                                                break block41;
                                                            }
                                                            catch (MatchException v8) {
                                                                throw _8C.a((Exception)v8);
                                                            }
                                                        }
                                                        v5 = var23_14;
                                                    }
                                                    v7 = v5 + _8C.d("t", (int)19690, (long)(8697422117850870652L ^ var9_5));
                                                }
                                                var25_16 = v7;
                                                var26_17 = var20_10 - _8C.d("t", (int)28637, (long)(5570763481546772591L ^ var9_5));
                                                var27_18 = var21_11 - (var25_16 - _8C.f("\u00c8", (Object)this, (long)3115980029220294135L, (long)var9_5)) - _8C.d("t", (int)22357, (long)(2627127060655368447L ^ var9_5));
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                v9 = new Object[7];
                                                                v9[6] = (int)var27_18;
                                                                v9[5] = (int)var26_17;
                                                                v9[4] = (int)var25_16;
                                                                v9[3] = (int)var24_15;
                                                                v9[2] = var3_2;
                                                                v9[1] = var1_1;
                                                                v9[0] = var15_8;
                                                                v10 /* !! */  = _8C.f("\u00e6", (Object)this, (Object)v9, (long)3116228895101864637L, (long)var9_5);
                                                                if (var19_13) break block42;
                                                                if (v10 /* !! */  == false) break block43;
                                                            }
                                                            catch (MatchException v11) {
                                                                throw _8C.a((Exception)v11);
                                                            }
                                                            v12 = this;
                                                            if (var19_13) break block44;
                                                        }
                                                        catch (MatchException v13) {
                                                            throw _8C.a((Exception)v13);
                                                        }
                                                        if (_8C.f("\u00c8", (Object)v12, (long)3113035601759753368L, (long)var9_5) != false) break block45;
                                                    }
                                                    catch (MatchException v14) {
                                                        throw _8C.a((Exception)v14);
                                                    }
                                                    v12 = this;
                                                }
                                                catch (MatchException v15) {
                                                    throw _8C.a((Exception)v15);
                                                }
                                            }
                                            v16 = _8C.f("\u00c8", (Object)v12, (long)3099738637301341855L, (long)var9_5);
                                            break block53;
                                        }
                                        v16 = new ArrayList<E>(_8C.f("\u00c8", (Object)this, (long)3100119525413911343L, (long)var9_5));
                                    }
                                    var28_19 = v16;
                                    var29_20 = (int)_8C.f("\u00ce", (double)((double)_8C.f("\u00e6", (Object)var28_19, (long)3114287869608918769L, (long)var9_5) / 11.0), (long)3113213895002174647L, (long)var9_5);
                                    var30_21 = _8C.f("\u00ce", (int)0, (int)(var29_20 - _8C.d("t", (int)22877, (long)(4806911404405745401L ^ var9_5))), (long)3110341707908880890L, (long)var9_5);
                                    try {
                                        block48: {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            v17 /* !! */  = _8C.f("\u00c8", (Object)this, (long)3113035601759753368L, (long)var9_5);
                                                            if (var19_13) break block46;
                                                            if (v17 /* !! */  == false) {
                                                            }
                                                            ** GOTO lbl140
                                                        }
                                                        catch (MatchException v18) {
                                                            throw _8C.a((Exception)v18);
                                                        }
                                                        cfr_temp_0 = var7_4 - 0.0;
                                                        v17 /* !! */  = (CallSite)(cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1));
                                                        if (var19_13) break block47;
                                                    }
                                                    catch (MatchException v19) {
                                                        throw _8C.a((Exception)v19);
                                                    }
                                                    if (v17 /* !! */  <= 0) break block48;
                                                }
                                                catch (MatchException v20) {
                                                    throw _8C.a((Exception)v20);
                                                }
                                                _8C.f("\u00f3", (Object)this, (int)_8C.f("\u00ce", (int)0, (int)(_8C.f("\u00c8", (Object)this, (long)3114919794998340586L, (long)var9_5) - true), (long)3110341707908880890L, (long)var9_5), (long)3114919794998340586L, (long)var9_5);
                                                if (!var19_13) break block49;
                                            }
                                            catch (MatchException v21) {
                                                throw _8C.a((Exception)v21);
                                            }
                                        }
                                        v17 /* !! */  = (CallSite)((cfr_temp_1 = var7_4 - 0.0) == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1));
                                    }
                                    catch (MatchException v22) {
                                        throw _8C.a((Exception)v22);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            if (var19_13) break block50;
                                            if (v17 /* !! */  >= 0) break block49;
                                        }
                                        catch (MatchException v23) {
                                            throw _8C.a((Exception)v23);
                                        }
                                        _8C.f("\u00f3", (Object)this, (int)_8C.f("\u00ce", (int)var30_21, (int)(_8C.f("\u00c8", (Object)this, (long)3114919794998340586L, (long)var9_5) + true), (long)3113370217351064502L, (long)var9_5), (long)3114919794998340586L, (long)var9_5);
                                        if (!var19_13) break block49;
                                    }
                                    catch (MatchException v24) {
                                        throw _8C.a((Exception)v24);
                                    }
lbl140:
                                    // 2 sources

                                    v17 /* !! */  = (CallSite)((cfr_temp_2 = var7_4 - 0.0) == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1));
                                }
                                catch (MatchException v25) {
                                    throw _8C.a((Exception)v25);
                                }
                            }
                            try {
                                block52: {
                                    try {
                                        try {
                                            if (var19_13) break block51;
                                            if (v17 /* !! */  <= 0) break block52;
                                        }
                                        catch (MatchException v26) {
                                            throw _8C.a((Exception)v26);
                                        }
                                        _8C.f("\u00f3", (Object)this, (int)_8C.f("\u00ce", (int)0, (int)(_8C.f("\u00c8", (Object)this, (long)3113897014094390243L, (long)var9_5) - true), (long)3110341707908880890L, (long)var9_5), (long)3113897014094390243L, (long)var9_5);
                                        if (!var19_13) break block49;
                                    }
                                    catch (MatchException v27) {
                                        throw _8C.a((Exception)v27);
                                    }
                                }
                                v17 /* !! */  = (CallSite)((cfr_temp_3 = var7_4 - 0.0) == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1));
                            }
                            catch (MatchException v28) {
                                throw _8C.a((Exception)v28);
                            }
                        }
                        try {
                            try {
                                if (var19_13) break block50;
                                if (v17 /* !! */  >= 0) break block49;
                            }
                            catch (MatchException v29) {
                                throw _8C.a((Exception)v29);
                            }
                            _8C.f("\u00f3", (Object)this, (int)_8C.f("\u00ce", (int)var30_21, (int)(_8C.f("\u00c8", (Object)this, (long)3113897014094390243L, (long)var9_5) + true), (long)3113370217351064502L, (long)var9_5), (long)3113897014094390243L, (long)var9_5);
                        }
                        catch (MatchException v30) {
                            throw _8C.a((Exception)v30);
                        }
                    }
                    v17 /* !! */  = (CallSite)true;
                }
                return (boolean)v17 /* !! */ ;
            }
            v10 /* !! */  = (CallSite)super.method_25401(var1_1, var3_2, var5_3, var7_4);
        }
        return (boolean)v10 /* !! */ ;
    }

    public boolean method_25404(class_11908 class_119082) {
        Object object;
        block22: {
            block23: {
                boolean bl;
                long l2;
                long l3;
                block20: {
                    block21: {
                        long l4;
                        block18: {
                            block19: {
                                long l5 = l3 = b ^ 0x51FB505C0971L;
                                l2 = l5 ^ 0x2EA1C4874226L;
                                l4 = l5 ^ 0x33956F2A2118L;
                                bl = _02.cfr_renamed_2();
                                try {
                                    try {
                                        object = _8C.f("\u00e6", (Object)class_119082, -1252248766623569917L, (long)l3);
                                        if (bl) break block18;
                                        if (object == _8C.d("t", 25496, (long)(0x1F34ED69C68D9996L ^ l3))) {
                                        }
                                        break block19;
                                    }
                                    catch (MatchException matchException) {
                                        throw _8C.a((Exception)((Object)matchException));
                                    }
                                    Object[] objectArray = new Object[2];
                                    objectArray[1] = new HashSet(_8C.f("\u00c8", (Object)this, -1250875585282457975L, (long)l3));
                                    objectArray[0] = l2;
                                    _8C.f("\u00e6", (Object)_8C.f("\u00c8", (Object)this, -1254372549329202752L, (long)l3), (Object)objectArray, -1256479022248043071L, (long)l3);
                                    _8C.f("\u00e6", (Object)_8C.f("P", -1250972541704095699L, (long)l3), (Object)_8C.f("\u00c8", (Object)_8C.f("P", -1253067819234826031L, (long)l3), -1257187200645344708L, (long)l3), -1256197500963564639L, (long)l3);
                                    return true;
                                }
                                catch (MatchException matchException) {
                                    throw _8C.a((Exception)((Object)matchException));
                                }
                            }
                            object = _8C.f("\u00c8", (Object)this, -1254938169623506626L, (long)l3);
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (bl) break block20;
                                        if (object != false) break block21;
                                    }
                                    catch (MatchException matchException) {
                                        throw _8C.a((Exception)((Object)matchException));
                                    }
                                    Object[] objectArray = new Object[2];
                                    objectArray[1] = l4;
                                    objectArray[0] = class_119082;
                                    object = _8C.f("\u00e6", (Object)_8C.f("\u00c8", (Object)this, -1255277939499075538L, (long)l3), (Object)objectArray, -1256131262341255116L, (long)l3);
                                    if (bl) break block20;
                                }
                                catch (MatchException matchException) {
                                    throw _8C.a((Exception)((Object)matchException));
                                }
                                if (object == false) break block21;
                            }
                            catch (MatchException matchException) {
                                throw _8C.a((Exception)((Object)matchException));
                            }
                            return true;
                        }
                        catch (MatchException matchException) {
                            throw _8C.a((Exception)((Object)matchException));
                        }
                    }
                    object = _8C.f("\u00e6", (Object)class_119082, -1252248766623569917L, (long)l3);
                }
                try {
                    try {
                        if (bl) break block22;
                        if (object == _8C.d("t", 29965, (long)(0x3EE260AA30620F34L ^ l3))) {
                        }
                        break block23;
                    }
                    catch (MatchException matchException) {
                        throw _8C.a((Exception)((Object)matchException));
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = new HashSet(_8C.f("\u00c8", (Object)this, -1250875585282457975L, (long)l3));
                    objectArray[0] = l2;
                    _8C.f("\u00e6", (Object)_8C.f("\u00c8", (Object)this, -1254372549329202752L, (long)l3), (Object)objectArray, -1256479022248043071L, (long)l3);
                    _8C.f("\u00e6", (Object)_8C.f("P", -1250972541704095699L, (long)l3), (Object)_8C.f("\u00c8", (Object)_8C.f("P", -1253067819234826031L, (long)l3), -1257187200645344708L, (long)l3), -1256197500963564639L, (long)l3);
                    return true;
                }
                catch (MatchException matchException) {
                    throw _8C.a((Exception)((Object)matchException));
                }
            }
            object = super.method_25404(class_119082);
        }
        return (boolean)object;
    }

    public boolean method_25400(class_11905 class_119052) {
        Object object;
        block4: {
            block5: {
                long l2 = b ^ 0x1229AB9FA6B3L;
                long l3 = l2 ^ 0x14359B2182C2L;
                boolean bl = _02.cfr_renamed_2();
                try {
                    try {
                        object = _8C.f("\u00c8", (Object)this, 4708464691582648060L, (long)l2);
                        if (bl) break block4;
                        if (object != false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _8C.a((Exception)((Object)matchException));
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = class_119052;
                    objectArray[0] = l3;
                    return (boolean)_8C.f("\u00e6", (Object)_8C.f("\u00c8", (Object)this, 4707977465505929196L, (long)l2), (Object)objectArray, 4706756956438594855L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _8C.a((Exception)((Object)matchException));
                }
            }
            object = true;
        }
        return (boolean)object;
    }

    private void cfr_renamed_4(long l2) {
        block9: {
            block10: {
                CallSite callSite;
                long l3;
                block6: {
                    long l4 = l2 = b ^ l2;
                    long l5 = l4 ^ 0x1A031ADFDA6BL;
                    l3 = l4 ^ 0x2109889DA51CL;
                    boolean bl = _02.cfr_renamed_2();
                    try {
                        CallSite callSite2;
                        long l6;
                        long l7;
                        block7: {
                            block8: {
                                try {
                                    try {
                                        Object[] objectArray = new Object[1];
                                        objectArray[0] = l5;
                                        callSite = _8C.f("\u00e6", (Object)_8C.f("\u00c8", (Object)this, -728447107037207714L, (long)l2), (Object)objectArray, -728109437138225661L, (long)l2);
                                        if (bl) break block6;
                                        l7 = -727715179884075491L;
                                        l6 = l2;
                                        if (l2 <= 0L) break block7;
                                        if (_8C.f("\u00e6", (Object)callSite, (long)l7, (long)l6) == false) break block8;
                                    }
                                    catch (MatchException matchException) {
                                        throw _8C.a((Exception)((Object)matchException));
                                    }
                                    _8C.f("\u00f3", (Object)this, new ArrayList(_8C.f("\u00c8", (Object)this, -726902181091099306L, (long)l2)), -733523013549785015L, (long)l2);
                                    if (l2 < 0L) break block9;
                                    if (!bl) break block10;
                                }
                                catch (MatchException matchException) {
                                    throw _8C.a((Exception)((Object)matchException));
                                }
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l5;
                            callSite2 = _8C.f("\u00e6", (Object)_8C.f("\u00c8", (Object)this, -728447107037207714L, (long)l2), (Object)objectArray, -728109437138225661L, (long)l2);
                            l7 = -728093851296230716L;
                            l6 = l2;
                        }
                        callSite = _8C.f("\u00e6", (Object)callSite2, (long)l7, (long)l6);
                    }
                    catch (MatchException matchException) {
                        throw _8C.a((Exception)((Object)matchException));
                    }
                }
                CallSite callSite3 = callSite;
                _8C.f("\u00f3", (Object)this, (List)((List)((Object)_8C.f("\u00e6", (Object)_8C.f("\u00e6", (Object)_8C.f("\u00e6", (Object)_8C.f("\u00c8", (Object)this, -726902181091099306L, (long)l2), -725360749645944760L, (long)l2), arg_0 -> _8C.cfr_renamed_7((String)((Object)callSite3), l3, arg_0), -726312007278392515L, (long)l2), (Object)_8C.f("\u00ce", -725799179289158742L, (long)l2), -733109373903039441L, (long)l2))), -733523013549785015L, (long)l2);
            }
            _8C.f("\u00f3", (Object)this, (int)_8C.d("t", 14885, (long)(0x27DC7B5AB3C15B58L ^ l2)), -726187408456305348L, (long)l2);
        }
    }

    private static boolean cfr_renamed_7(String string, long l2, class_2248 class_22482) {
        l2 = b ^ l2;
        return (boolean)_8C.f("\u00e6", (Object)_8C.f("\u00e6", (Object)_8C.f("\u00e6", (Object)_8C.f("\u00e6", (Object)class_22482, -5259177571641966204L, (long)l2), -5259087332169097098L, (long)l2), -5257003508672114646L, (long)l2), (Object)string, -5258228319827030037L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    private void cfr_renamed_7(int var1_1, byte var2_2, int var3_3, class_2248 var4_4) {
        block36: {
            block41: {
                block40: {
                    block47: {
                        block39: {
                            block38: {
                                block37: {
                                    block35: {
                                        var5_5 = ((long)var1_1 << 32 | (long)var2_2 << 56 >>> 32 | (long)var3_3 << 40 >>> 40) ^ _8C.b;
                                        var7_6 = _02.cfr_renamed_2();
                                        v0 = var4_4;
                                        v1 = _8C.f("P", (long)4778840515007143676L, (long)var5_5);
                                        if (var7_6) break block35;
                                        try {
                                            block43: {
                                                if (v0 == v1) break block36;
                                                break block43;
                                                catch (Exception v2) {
                                                    throw _8C.a(v2);
                                                }
                                            }
                                            v0 = var4_4;
                                            v1 = _8C.f("P", (long)4781865274133503833L, (long)var5_5);
                                        }
                                        catch (Exception v3) {
                                            throw _8C.a(v3);
                                        }
                                    }
                                    v4 = var7_6;
                                    if (var2_2 < 0) ** GOTO lbl37
                                    if (v4) break block37;
                                    try {
                                        block44: {
                                            if (v0 == v1) break block36;
                                            break block44;
                                            catch (Exception v5) {
                                                throw _8C.a(v5);
                                            }
                                        }
                                        v0 = var4_4;
                                        v1 = _8C.f("P", (long)4775116509952181979L, (long)var5_5);
                                    }
                                    catch (Exception v6) {
                                        throw _8C.a(v6);
                                    }
                                }
                                v4 = var7_6;
lbl37:
                                // 2 sources

                                if (var3_3 < 0) ** GOTO lbl53
                                if (v4) break block38;
                                try {
                                    block45: {
                                        if (v0 == v1) break block36;
                                        break block45;
                                        catch (Exception v7) {
                                            throw _8C.a(v7);
                                        }
                                    }
                                    v0 = var4_4;
                                    v1 = _8C.f("P", (long)4779258922679270557L, (long)var5_5);
                                }
                                catch (Exception v8) {
                                    throw _8C.a(v8);
                                }
                            }
                            v4 = var7_6;
lbl53:
                            // 2 sources

                            if (var1_1 < 0) ** GOTO lbl69
                            if (v4) break block39;
                            try {
                                block46: {
                                    if (v0 == v1) break block36;
                                    break block46;
                                    catch (Exception v9) {
                                        throw _8C.a(v9);
                                    }
                                }
                                v0 = var4_4;
                                v1 = _8C.f("P", (long)4780826441056959584L, (long)var5_5);
                            }
                            catch (Exception v10) {
                                throw _8C.a(v10);
                            }
                        }
                        v4 = var7_6;
lbl69:
                        // 2 sources

                        if (v4) break block40;
                        if (v0 == v1) break block36;
                        break block47;
                        catch (Exception v11) {
                            throw _8C.a(v11);
                        }
                    }
                    try {
                        block48: {
                            v0 = var4_4;
                            v12 = var7_6;
                            if (var1_1 < 0) ** GOTO lbl96
                            if (v12) break block41;
                            break block48;
                            catch (Exception v13) {
                                throw _8C.a(v13);
                            }
                        }
                        v1 = _8C.f("P", (long)4778951973032765765L, (long)var5_5);
                    }
                    catch (Exception v14) {
                        throw _8C.a(v14);
                    }
                }
                if (v0 == v1) break block36;
                v0 = var4_4;
            }
            try {
                if (var2_2 <= 0) ** GOTO lbl106
                v12 = var7_6;
lbl96:
                // 2 sources

                if (!v12) {
                    if (_8C.f("\u00e6", (Object)_8C.f("\u00e6", (Object)v0, (long)4779389023247666318L, (long)var5_5), (long)4781960572868938907L, (long)var5_5) != false) break block36;
                }
                ** GOTO lbl106
            }
            catch (Exception v15) {
                throw _8C.a(v15);
            }
            try {
                block42: {
                    v0 = var4_4;
lbl106:
                    // 4 sources

                    v16 = _8C.f("\u00e6", (Object)v0, (long)4781801439202934159L, (long)var5_5);
                    if (var2_2 <= 0 || var7_6) break block42;
                    try {
                        block49: {
                            if (v16 == null) break block36;
                            break block49;
                            catch (Exception v17) {
                                throw _8C.a(v17);
                            }
                        }
                        v16 = _8C.f("\u00e6", (Object)_8C.f("\u00e6", (Object)_8C.f("\u00e6", (Object)var4_4, (long)4781801439202934159L, (long)var5_5), (long)4780162971583422050L, (long)var5_5), (long)4778516968626610230L, (long)var5_5);
                    }
                    catch (Exception v18) {
                        throw _8C.a(v18);
                    }
                }
                try {
                    if (v16 != _8C.f("P", (long)4782349355176201965L, (long)var5_5)) {
                        _8C.f("\u00e6", (Object)_8C.f("\u00c8", (Object)this, (long)4778766247037831918L, (long)var5_5), (Object)var4_4, (long)4778981785382699843L, (long)var5_5);
                    }
                }
                catch (Exception v19) {
                    throw _8C.a(v19);
                }
            }
            catch (Exception var8_7) {
                // empty catch block
            }
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
                        _8C.b = dev.krypton.l.a(3027393379901781726L, -8448944649857278719L, MethodHandles.lookup().lookupClass()).a(6290516299089L);
                        _8C.q = new Object[136];
                        _8C.r = new String[136];
                        _8C.b();
                        _8C.h = new HashMap<K, V>(13);
                        var11 = _8C.b ^ 60245715976101L;
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
                        var20_3 = new String[13];
                        var18_4 = 0;
                        var17_5 = "\u00b2\u00d2'\u00e1\u001d\u000e\u00d2{\u00a1\u0087\r+\u00d6\u009aA\u0005\u00e0\u00de\u0099p\u0085\u00af\u00f8\u0090\u00edM\u001aH\u00f4\u00aef`-E\u00dd^\u0084>\u00fd\u0095 \u00bb\u00f6\t\u00f1\u00bch\u0092B\u00cc\u00bfWJ\u00a0\u00ca\u00a5\u00b4\u0019G\u0096\u00c4\u00b4/)=V`\u00e2\u009a\u00b1!.+ \u00f8\u00b4\u00d7\u00de`\u00cf\u00c0*\u00a7\u00e6\u00b5\u008d\u0013Z\u009b\u00b7-\u00ddM\u00c5\u00ddp(\u00f1\u00c4/>\u001f\u00f7\u00d9O\u00b8 \u0000\u00daT\u0010\u0090\u00d6\u001b\u0090\u00d6\u00bc\u00d1)\u00a1\u00c9\u00ad\u00f2\u00ca\u00fa\u0004\u0087!e\u00ce\u00c9\u00078-i\u00bc.\u0096= (\u00b0;\u0016-\u0080P\u00d1C\u00e0\u00b3\u0093\u0087\u0007\u0093\u0011\u00ac\u00fe\u007f\u00d1\b<\u00ef\u0090\u0092\u009a\u008c\u001c*\u0088\u0018\u0011\u0010@\u00b57\u00e3\u0084\u0099\u001c\\u\u00eb\u00e1$\u00ab\u00dd<\u00a0\u00185\u00d7\u00c8\u00fb+\u000b\u00dfT2.\u000f'\u0001\u0005|\u00fb\u008d\u0012\u0000P\u0092\u00bcI\u00a2 \u008bl>@\u0003bjC\u008a\u00a9\u00ad\u00fdv\u0080\u00af\u00bcIM\u00d5\u00d6\u00de\u00baA~\u0090\b\u00b4qy\u0083l\u00b2\u0010\u00b4\u00dd\u00bd!\u0005N\u00fc\u00e5\u00e6X\u009dB<=\u00a5\u00fd TwN\"\u00f5\u0083\\rB3\u0001&\u00a3/\u0018\u00bf\u0085o\u00a5\u00d5/\u0003\u000ba\u00efe\u00e7x\u00af\u0087\u0096\u0096\u0018M\u0082\u0014\u0019lB\u00b6\u0018\u0093G9OGg\u00cdC\u0018Oc\u000ex\u00cd\u00efD";
                        var19_6 = "\u00b2\u00d2'\u00e1\u001d\u000e\u00d2{\u00a1\u0087\r+\u00d6\u009aA\u0005\u00e0\u00de\u0099p\u0085\u00af\u00f8\u0090\u00edM\u001aH\u00f4\u00aef`-E\u00dd^\u0084>\u00fd\u0095 \u00bb\u00f6\t\u00f1\u00bch\u0092B\u00cc\u00bfWJ\u00a0\u00ca\u00a5\u00b4\u0019G\u0096\u00c4\u00b4/)=V`\u00e2\u009a\u00b1!.+ \u00f8\u00b4\u00d7\u00de`\u00cf\u00c0*\u00a7\u00e6\u00b5\u008d\u0013Z\u009b\u00b7-\u00ddM\u00c5\u00ddp(\u00f1\u00c4/>\u001f\u00f7\u00d9O\u00b8 \u0000\u00daT\u0010\u0090\u00d6\u001b\u0090\u00d6\u00bc\u00d1)\u00a1\u00c9\u00ad\u00f2\u00ca\u00fa\u0004\u0087!e\u00ce\u00c9\u00078-i\u00bc.\u0096= (\u00b0;\u0016-\u0080P\u00d1C\u00e0\u00b3\u0093\u0087\u0007\u0093\u0011\u00ac\u00fe\u007f\u00d1\b<\u00ef\u0090\u0092\u009a\u008c\u001c*\u0088\u0018\u0011\u0010@\u00b57\u00e3\u0084\u0099\u001c\\u\u00eb\u00e1$\u00ab\u00dd<\u00a0\u00185\u00d7\u00c8\u00fb+\u000b\u00dfT2.\u000f'\u0001\u0005|\u00fb\u008d\u0012\u0000P\u0092\u00bcI\u00a2 \u008bl>@\u0003bjC\u008a\u00a9\u00ad\u00fdv\u0080\u00af\u00bcIM\u00d5\u00d6\u00de\u00baA~\u0090\b\u00b4qy\u0083l\u00b2\u0010\u00b4\u00dd\u00bd!\u0005N\u00fc\u00e5\u00e6X\u009dB<=\u00a5\u00fd TwN\"\u00f5\u0083\\rB3\u0001&\u00a3/\u0018\u00bf\u0085o\u00a5\u00d5/\u0003\u000ba\u00efe\u00e7x\u00af\u0087\u0096\u0096\u0018M\u0082\u0014\u0019lB\u00b6\u0018\u0093G9OGg\u00cdC\u0018Oc\u000ex\u00cd\u00efD".length();
                        var16_7 = 40;
                        var15_8 = -1;
lbl23:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = _8C.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "9\\Nx\u00d4\u00b0\r\u00c7\u00d9\u00c2\u0088\u00df\u00c0\u0000C\u00a4\u00bd9-C\u0012\u00ca\u0016G\u00a7\u00da\u00f2\u00c40-\u0016]\u0010z-SDo\u00cdr\u0001\u0087\u00b7\u00a3#\u008c\u00d2\u00e4\u0004";
                            var19_6 = "9\\Nx\u00d4\u00b0\r\u00c7\u00d9\u00c2\u0088\u00df\u00c0\u0000C\u00a4\u00bd9-C\u0012\u00ca\u0016G\u00a7\u00da\u00f2\u00c40-\u0016]\u0010z-SDo\u00cdr\u0001\u0087\u00b7\u00a3#\u008c\u00d2\u00e4\u0004".length();
                            var16_7 = 32;
                            var15_8 = -1;
lbl37:
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
lbl42:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = _8C.b(var21_9).intern();
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
lbl54:
                        // 1 sources

                        ** continue;
                    }
                }
                _8C.f = var20_3;
                _8C.g = new String[13];
                _8C.n = new HashMap<K, V>(13);
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
                var6_12 = new long[54];
                var3_13 = 0;
                var4_14 = "sT\u00aa\u00fe(\u0088\u00c3\u0001\u00e1l\u00fb\\Q\u00ba\u001d\u0014!5\u0019\u00c4\u00e5\tbdY\u00caOP$\u00b1\u00e8\u00ab\u00c5\u00b9\u0004\u0015\u008c\u00dei\u000f^\u00b1\u00d6\u00ebW\u00ac\u00b1\n\u0092,\u00ff\u0080\u0096\u00cb\u00dc\u00cf0\u00a0\u00dc\u00cf\u00ed\u00e9\u00bbN\u00bc\u0089\u00ed\u00e6\u00b7\u00e3\u00d7%.\u000e=\u001d\u00fe\u0014\u001b.\u00f01\u00f2}<\u00e4\u007fLZA\u00e3\b\u00b8\u0082\u0004\u0099\u00baOi\u00a4\u009b\u0004\u00c3\u0082\u00c8\u00e7m\u0084\u00e2x\u0011!Y\b\u0010\u00810\u00f1\u00f8\u00f1\u0095\u00ead\u0019\u00c6E\u00de\u00f5O\u00c6\u00f7\\\u00dfJ]U\u00b1\u00a1\u00a2\u00cfH\u0012\u00e1ToM\u00cd\u00b6=\u0010EJLfQ \u00c8r\u0004\u00fcq\u00eb\u00f1\u00aaz! \u00c2\n\u0084L\\jk\u00c9d\u00f9\f\u00e0\u001d\u00d1\u00e7<<\u009b\u00ebw\u000b\u0092\u00d6\u00de\u00f9\u0000\u00a6\u0080RP\u00aa\u0089\u0084m\u00b7\n>\u00f1\u001b\u00ac$\u0091WDn@\u00de'\u00c8\u00d7g\u0089h+\u00b1\u0084:-\u00ff\u00f1\u0014\u00a2|\u00bcP\u00e9\u00d6\u00e0[#\u00e9\u00f3\u00e4\u00f3p\u00b8\u0096\u001by\u00c30m\u00ee+\u008e\b\u00ef\u00917#b\u00bf\u00b6v\u00bc\u00d5t\u00afe\u00cd^\u00ba\u00b8\u00f1\u008a.\u00e7\u00ed\u00cd\u00ea\u00d6\u00c0\u0082\u008b\u0005\u0093g\u00dd\u00e0\u00c3\u00d1\u00fad^\u0083\u0090'\u00f2\u0017\u00e2\u00db\u00fe4\u0085\u00f0\u0085\u0014JIY\u009b\u00fa\u00c8\u009b3\u0097\u00ee\u00f2\\Z\u000b4a9{\u008f\u00ba&5\u009c\u00a8\u00ef\u00b0\u00dc\u009d>}\u00bd\u00eeAq\u00c0\b\u0017k\\\u00f0\u0093\u0005\u0017\u00fd\u00d3\u00b5'\u0085\u00b8$\u00b5>\u009f\u00d4\u0001F\u001eFX<\u0091`\u00adV\u009d\n\u00afX\u008e\b\u00b1\u00d6Q\u0004\u0001A\f\u0004'8\u00c2m\u009f\u00b0u\u00f5\u0000\u00e4\u00ab\u00a7@\u00f4\u001f\u00de7\u0007\u0017\bn\u00d7.\u0010\u00c9yg#\u00e9\u00f3%#\u00bc\u00d5";
                var5_15 = "sT\u00aa\u00fe(\u0088\u00c3\u0001\u00e1l\u00fb\\Q\u00ba\u001d\u0014!5\u0019\u00c4\u00e5\tbdY\u00caOP$\u00b1\u00e8\u00ab\u00c5\u00b9\u0004\u0015\u008c\u00dei\u000f^\u00b1\u00d6\u00ebW\u00ac\u00b1\n\u0092,\u00ff\u0080\u0096\u00cb\u00dc\u00cf0\u00a0\u00dc\u00cf\u00ed\u00e9\u00bbN\u00bc\u0089\u00ed\u00e6\u00b7\u00e3\u00d7%.\u000e=\u001d\u00fe\u0014\u001b.\u00f01\u00f2}<\u00e4\u007fLZA\u00e3\b\u00b8\u0082\u0004\u0099\u00baOi\u00a4\u009b\u0004\u00c3\u0082\u00c8\u00e7m\u0084\u00e2x\u0011!Y\b\u0010\u00810\u00f1\u00f8\u00f1\u0095\u00ead\u0019\u00c6E\u00de\u00f5O\u00c6\u00f7\\\u00dfJ]U\u00b1\u00a1\u00a2\u00cfH\u0012\u00e1ToM\u00cd\u00b6=\u0010EJLfQ \u00c8r\u0004\u00fcq\u00eb\u00f1\u00aaz! \u00c2\n\u0084L\\jk\u00c9d\u00f9\f\u00e0\u001d\u00d1\u00e7<<\u009b\u00ebw\u000b\u0092\u00d6\u00de\u00f9\u0000\u00a6\u0080RP\u00aa\u0089\u0084m\u00b7\n>\u00f1\u001b\u00ac$\u0091WDn@\u00de'\u00c8\u00d7g\u0089h+\u00b1\u0084:-\u00ff\u00f1\u0014\u00a2|\u00bcP\u00e9\u00d6\u00e0[#\u00e9\u00f3\u00e4\u00f3p\u00b8\u0096\u001by\u00c30m\u00ee+\u008e\b\u00ef\u00917#b\u00bf\u00b6v\u00bc\u00d5t\u00afe\u00cd^\u00ba\u00b8\u00f1\u008a.\u00e7\u00ed\u00cd\u00ea\u00d6\u00c0\u0082\u008b\u0005\u0093g\u00dd\u00e0\u00c3\u00d1\u00fad^\u0083\u0090'\u00f2\u0017\u00e2\u00db\u00fe4\u0085\u00f0\u0085\u0014JIY\u009b\u00fa\u00c8\u009b3\u0097\u00ee\u00f2\\Z\u000b4a9{\u008f\u00ba&5\u009c\u00a8\u00ef\u00b0\u00dc\u009d>}\u00bd\u00eeAq\u00c0\b\u0017k\\\u00f0\u0093\u0005\u0017\u00fd\u00d3\u00b5'\u0085\u00b8$\u00b5>\u009f\u00d4\u0001F\u001eFX<\u0091`\u00adV\u009d\n\u00afX\u008e\b\u00b1\u00d6Q\u0004\u0001A\f\u0004'8\u00c2m\u009f\u00b0u\u00f5\u0000\u00e4\u00ab\u00a7@\u00f4\u001f\u00de7\u0007\u0017\bn\u00d7.\u0010\u00c9yg#\u00e9\u00f3%#\u00bc\u00d5".length();
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
lbl81:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "|(:\u0085j+\u00b2\u00d1E\u00a0h$\u000e8\u00a5A";
                    var5_15 = "|(:\u0085j+\u00b2\u00d1E\u00a0h$\u000e8\u00a5A".length();
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
lbl94:
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
lbl107:
                // 1 sources

                ** continue;
            }
        }
        _8C.l = var6_12;
        _8C.m = new Integer[54];
    }

    private static Exception a(Exception exception) {
        return exception;
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

    private static String b(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x7550;
        if (g[n2] == null) {
            Object[] objectArray;
            try {
                Long l3 = Thread.currentThread().threadId();
                objectArray = (Object[])h.get(l3);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l3, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/8C", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l2 >>> 56);
            for (int j = 1; j < 8; ++j) {
                byArray[j] = (byte)(l2 << j * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = f[n2].getBytes("ISO-8859-1");
            _8C.g[n2] = _8C.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _8C.b(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8C" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int d(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x1498;
        if (m[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = l[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])_8C.n.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    _8C.n.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/8C", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _8C.m[n2] = n3;
        }
        return m[n2];
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _8C.d(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8C" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (r[n3] != null) {
            return n3;
        }
        Object object = q[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 24;
            case 1 -> 25;
            case 2 -> 18;
            case 3 -> 17;
            case 4 -> 46;
            case 5 -> 4;
            case 6 -> 33;
            case 7 -> 49;
            case 8 -> 20;
            case 9 -> 54;
            case 10 -> 34;
            case 11 -> 3;
            case 12 -> 42;
            case 13 -> 15;
            case 14 -> 32;
            case 15 -> 1;
            case 16 -> 16;
            case 17 -> 58;
            case 18 -> 13;
            case 19 -> 5;
            case 20 -> 39;
            case 21 -> 14;
            case 22 -> 26;
            case 23 -> 29;
            case 24 -> 56;
            case 25 -> 0;
            case 26 -> 60;
            case 27 -> 6;
            case 28 -> 59;
            case 29 -> 61;
            case 30 -> 21;
            case 31 -> 41;
            case 32 -> 27;
            case 33 -> 2;
            case 34 -> 8;
            case 35 -> 43;
            case 36 -> 12;
            case 37 -> 57;
            case 38 -> 47;
            case 39 -> 38;
            case 40 -> 19;
            case 41 -> 7;
            case 42 -> 50;
            case 43 -> 22;
            case 44 -> 23;
            case 45 -> 36;
            case 46 -> 63;
            case 47 -> 37;
            case 48 -> 9;
            case 49 -> 48;
            case 50 -> 31;
            case 51 -> 51;
            case 52 -> 53;
            case 53 -> 40;
            case 54 -> 10;
            case 55 -> 35;
            case 56 -> 55;
            case 57 -> 44;
            case 58 -> 45;
            case 59 -> 28;
            case 60 -> 52;
            case 61 -> 30;
            case 62 -> 11;
            default -> 62;
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
        _8C.r[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = q;
        q[0] = ";mm#x5&xob}im";
        objectArray[1] = "4a\u0018w\fa)t\u001a6\t=iI";
        objectArray[2] = "\u001fNie\u0002\u0017\u0002[k$\u0007KB\u001d";
        objectArray[3] = "?1-@\u0004?J\u0011&O\u0015p+\u001f-D\u0011*_";
        objectArray[4] = Void.TYPE;
        _8C.r[4] = "java/lang/Void";
        objectArray[5] = "\u0019\u001f\u0006\u000e\u00043\u0004\n\u0004O\u0001oE9";
        objectArray[6] = "X\u000b@;+&X\u000bWg')B@Wy'<E1\u0005$\u007f\u007f\u000e";
        objectArray[7] = Integer.TYPE;
        _8C.r[7] = "java/lang/Integer";
        objectArray[8] = "V0\u00027n\fK%\u0000vkP\u0005\u0003";
        objectArray[9] = "\u0004RBw9\b\u001aZX8D\u0018\u001a";
        objectArray[10] = "U8Hu3CU8_)?LOs_7?YH\u0002\u000fjn";
        objectArray[11] = "lM$\\`o\u0019m/Sq xc$Xuz\f";
        objectArray[12] = Boolean.TYPE;
        _8C.r[12] = "java/lang/Boolean";
        objectArray[13] = "(=(\u001aj%(=?Ff*2v?Xf?5\u0007h\u00070";
        objectArray[14] = "-HW(D2-H@tH=7\u0003@jH(0r\u00114\u001dc";
        objectArray[15] = "adL/\u0015Jad[s\u0019E{/[m\u0019P|^\r3M\u0013";
        objectArray[16] = "TKoO\u0003[_D~\u0000~CLCwI";
        objectArray[17] = "Vf1^)u]i \u0011Dq]u\u0014ZvlYi$Z";
        objectArray[18] = "W\u00167\u000f$>\"6<\u00005qC87\u000b1+7";
        objectArray[19] = "`p&gGQ~x<(%Mye";
        objectArray[20] = "\u001c\u0011:JE\u0017i11ETX\b?:NP\u0002|";
        objectArray[21] = "\u0017mNN00\u0017mY\u0012<?\r&Y\f<*\nW\rYok";
        objectArray[22] = "d1i?o@z9sp'@`3k7.[ \u0013p02@c5m";
        objectArray[23] = "l!9\u001c5z\u0019\u00012\u0013$5x\u000f9\u0018 o\f";
        objectArray[24] = "\u0012-\u00192\u001dl\u0012-\u000en\u0011c\bf\u000ep\u0011v\u000f\u0017Z%B6";
        objectArray[25] = "\nV\u0013\u001dB:\u007fv\u0018\u0012Su\u001ex\u0013\u0019W/j";
        objectArray[26] = "\u0013$P\u0016o\u0013\u0018+AY\u000e\u001d\u0013 E\u0003";
        objectArray[27] = "8\u000exo/Z%\u001bz.*\u0006d\u000e";
        objectArray[28] = "}Z\u001bD\u0002\f\bz\u0010K\u0013Cit\u001b@\u0017\u0019\u001d";
        objectArray[29] = "QJ\u000bdk)$j\u0000kzfEd\u000b`~<1";
        objectArray[30] = "0Ty*\u0018REtr%\t\u001d$zy.\rGP";
        objectArray[31] = "]_FtCG]_Q(OHG\u0014Q6O]@e\u0003k\u0017\u001e\n";
        objectArray[32] = Double.TYPE;
        _8C.r[32] = "java/lang/Double";
        objectArray[33] = "{\u0012\n\u0011\u0017U\u000e2\u0001\u001e\u0006\u001ao<\n\u0015\u0002@\u001b";
        objectArray[34] = "2y4lp\"2y#0|-(2#.|8/Crp)}";
        objectArray[35] = "\u000e|\u0006s).\u000e|\u0011/%!\u00147\u00111%4\u0013F@k|w";
        objectArray[36] = "^;\u0011N\\e^;\u0006\u0012PjDp\u0006\fP\u007fC\u0001TX\u0001>";
        objectArray[37] = "\u001e?<\"\u001c=\u001e?+~\u00102\u0004t+`\u0010'\u0003\u0005y;Hf";
        objectArray[38] = "i5\u0010hK=i5\u00074G2s~\u0007*G't\u000fUq\u001fm";
        objectArray[39] = "?Uy\u0015j\t\"@{ToUb\u0005";
        objectArray[40] = "\u0016t\u00152)\bcT\u001e=8G\u0002Z\u00156<\u001dv";
        objectArray[41] = "%X\u000bf0\u00108M\t'5Ly\u007f";
        objectArray[42] = "\u0015](S*\u0011\u001eR9\u001cI\u001c\u000bT";
        objectArray[43] = "So]WN;&OVX_tGA]S[.3";
        objectArray[44] = "k\u000b\r2%wv\u001e\u000fs +7Y";
        objectArray[45] = "3\u001bZF\u0012RF;QI\u0003\u001d'5ZB\u0007GS";
        objectArray[46] = "\u001bYYIj\u0005\u0006L[\boYFu";
        objectArray[47] = "G\u0014mX,x24fW=7S:m\\9m'";
        objectArray[48] = "]\n(y\u0002x(*#v\u00137I$(}\u0017m=";
        objectArray[49] = Float.TYPE;
        _8C.r[49] = "java/lang/Float";
        objectArray[50] = "V=\u0001\u0016\u001bN#\u001d\n\u0019\n\u0001B\u0013\u0001\u0012\u000e[6";
        objectArray[51] = "Jr\u0012}+n?R\u0019r:!^\\\u0012y>{*";
        objectArray[52] = "\rE\u0006U\t|xe\rZ\u00183\u0019k\u0006Q\u001cim";
        objectArray[53] = "Q\bh1ni$(c>\u007f&E&h5{|1";
        objectArray[54] = "\u007fiV\u0010\f\baaL_Q\tgmA\u001c\f.azE\u0010O";
        objectArray[55] = "Z;\u001b&p<D3\u0001i8<^9\u0019.1'\u001e\n\u001f\": S;\u0019\"";
        objectArray[56] = "Y\b%4VH,(.;G\u0007M&%0C]9";
        objectArray[57] = "CVM,|1]^Wc!0[RZ |\u0007F[W(10FE";
        objectArray[58] = "-.\u001f\b#S3&\u0005G~R5*\b\u0004#e(#\u0005\fnR(=\u001a";
        objectArray[59] = ",`8^9Bz:$2k)0`-\\\"O:z}";
        objectArray[60] = "4=o6wOo'$*\u0019\fU<o4yZ9;(=k";
        objectArray[61] = "5)w\u000e\u0018\u0016v1+\u0002!N  G\u000f\u001dHx-7_NP-Pz\u000eB\u001a4 *]ZOIm{Q\u0010V9=(IE+";
        objectArray[62] = "*d%\u0005y!3bv\u0016B7,5*\u0014\u0015`ubrCB0'b-\u0016$)s&3";
        objectArray[63] = "vf&/\u0017l-|m3y(\u0017\"'=G-}qazDj\u0017 s~\u0005))b#<\u0007\u0016";
        objectArray[64] = "\u0016S\u0017.I#MI\\2'c6.P{K9\u0018BW<B+";
        objectArray[65] = "U\u001d\u0013]b+\u0005\u001cEX\rdo\u001dN\u001a3`\u0005N\b]0'o\u001a\u000e\u001en=\u000fM\u0015\u0007b[";
        objectArray[66] = "\u000b\tHx\u001e\n\u0004\u001eU<$\u001b\n\f/?\u0018\u0017V\r_oK\u000f\u0003pNmB\r\u0000MUc\u0019\bg";
        objectArray[67] = "D\u0013e\b+\fDOd[T\u0003z\u0015<Ej\t\u0010Fz\u0002iNz\u001cl\\=XAA7Po2";
        objectArray[68] = "\u0015\u0004\u0013\u0010\n;V\u001cO\u001c3m\u0004\u001cG,Vm\u0019F\u0018W\u000exTM#IXvRFX\u0011M;Y}";
        objectArray[69] = "\u001fd'\u0010\u001d1\u000b\"iK~<`fb\\@;\n5$\u001bC|`#cL\u001eo\f$$E\f\u0000";
        objectArray[70] = "o]\u0000[K9,E\\WrarB0ZNg\"Y@\n\u001d\u007fw$\r[\u00115nT]\b\t`\u0013\u0019\f\u0004CycI_\u001c\u0016\u0004";
        objectArray[71] = "J3\u007fT\u0019|\u0011)4Hw8+sxYF{[#+A\u0013";
        objectArray[72] = "{8\u0013,Y\u001e{d\u0012\u007f&\u0018E>Ja\u0018\u001b/m\f&\u001b\\E7\u001axOJ~jAt\u001d ";
        objectArray[73] = ".\u0016\u001e\fQQ A\u000bK7\n|\u0001\u0017P[8(@O\b7^wB\u0012X\u0006\u0006.\u001a\u00177\f\u0001.\u0001H\tNQl\u0003w";
        objectArray[74] = "\u00198bJ\u0013rZ >F**\f1R\u0007A~\u0014(kKKqZA#\u001d\u001b>\fxo\u0017\u0014pe09G[&\\|3H\u0015O";
        objectArray[75] = "63\u001fG3\u0012s5\r\u0002QP(LKB-Qp&\u0018\u0004jR7LI\u0016n\u0013tr\u000bF,\u0011K";
        objectArray[76] = "=xXyKX8*I9.\u000fG|\u000f{\u0010\t-/I<\u0013NG/\b~\u0017[-+Zm\u00122";
        objectArray[77] = "\u0002`QRL\u007fRa\u0007W#18`\f\u0015\u001d4R3JR\u001es8bXV_0\u0006 \b\u0014]\u000f";
        objectArray[78] = "8\u0014Q\u0010zr?EZ\u001c\u0007}I.\u0016Md}y^F\u001e|(";
        objectArray[79] = "WI*Ez\bNOyVA\u001eQ\u0018%T\u0016I\bN\u007f\tA\u0019ZO\"V'\u0000\u000e\u000b<";
        objectArray[80] = "k:|0\u0001}0 7,o:\n~}\"Q<`-;eR{\nz{=^zz*(%\u000b\u0007";
        objectArray[81] = ",\u001a2<\u007f>{\u0001+0\u00195u\u000666x8i`+0\u007f'u]0>$\"\u0012P :p4)\r{6\"^";
        objectArray[82] = "\u0018J\u001f!>rOQ\u0006-XyB]\u000e8X)H\u000f\u001b}fk\u0018M\u0019B";
        objectArray[83] = "{/YM\u0015\u0013|~RAh\u0015G/\u001aKSB7\u007f\u001b\u001dV";
        objectArray[84] = "#Sl^\u0016 fU~\u001bta^\u0015;\u001dJf4F}ZI!^Ij\u0011Of%\u0011\u007f\\D]";
        objectArray[85] = "`xnUl\ru};DT\u000fyw2Z\u0003Q!$l6,\u001b{ql\t5\n}+";
        objectArray[86] = "\u000eyW-\u000fW\n+D(f\\\u001f\tKl\u001aLdtDq\u000fW_)\u001f}]=";
        objectArray[87] = "z~\u0017fE&z\"\u00165:(DxN+\u0004#.+\bl\u0007dDz\u001ahF'z8J*D\u0018";
        objectArray[88] = "W\tB(\u0002hWUC{}mi\u000f\u001beCm\u0003\\]\"@*i\\\u001c`D?\u0003XNsAV";
        objectArray[89] = "o@ouDlk\u0012|p-zb9q3@|N\u0014m!-l8\u0004/%Ghj\u0017*L";
        objectArray[90] = "Ztpa\u0002lT1|qigYh5GU3\u000f=Mu\u0002|\u000566-\u00171\u000e\r";
        objectArray[91] = ".{tl\u0014))*\u007f`i&`A31\n&o1cb\u0012s";
        objectArray[92] = "j#\u001f^Y\u001amr\u0014R$\u001bV'Z\\\u0015[h'\u0006]F";
        objectArray[93] = "\u000f\u0016O\u0018\fA\u0016B\u000b\u0006bB\u000b\u0000\u0015\u001c\u000epVGEJb_\u001c\u001f\u001eA]F\r\u0019D{";
        objectArray[94] = "O,!\u0000&\u001dV*r\u0013\u001d\u000bI}.\u0011J\\\u0010-vF\u001d\fB*)\u0013{\u0015\u0016n7";
        objectArray[95] = "\u0016R\u000bS\u000fU\u000bM\u0011\u000fv\\\u001cS\u0016\f\u001anK\u0011LRK9AE\u0013\u0002\u001c\u0002\u001c\u001e\u001fPv";
        objectArray[96] = "tO\u0005Q\b\u000fs\u001e\u000e]u\u0000HLELK\n\"\u001f\u0003\u000bHMHHCSDL8\u0018\u0010K\u00111";
        objectArray[97] = "\u0016n\"vqk\u000fhqeJ}\u0010?-g\u001d*Inx:Jz\u001bh*e,cO,4";
        objectArray[98] = "X\u001b\t1}z\nO\u0004+'\u0014\u000fC\u001f=.na\u001bA*9qY\u001e\u0007&\u007fda\u001bB33*\u000fI\u0016>)pa";
        objectArray[99] = "0@4w\u0016v)\u0014pixu4Vns\u0014Gh\u00170(xw$W6m\u0014j;Mj\u0014";
        objectArray[100] = "\u0002\r{\u0019\u0006\u001d\u001b\u000b(\n=\u000b\u0004\\t\bj^\\\t+[=\f\u000f\u000bs\n[\u0015[Om";
        objectArray[101] = "m<\u000b\rk)b+\u0016IQ>m)l\u0016>1x\"Q\r0j}E\\\u001d4>k~\u0001F8l\u0001";
        objectArray[102] = "QjPbrZ\u0006qIn\u0014S\u0003|(`{\\\u0016w\u0015{u\u0007\u0013\u0010\u0018kqS\u0005+E0}\u0001o";
        objectArray[103] = "9E\rhxe|C\u001f-\u001a&t:Ymf&\u007fP\n+!%8:[9%d{\u0004\u0019igfD";
        objectArray[104] = "]Jn_Z\"Y\u0018}Z3#P\u0011k\u000fR.Lw|\u000bN5Z\u0006y\u0019M)7G}\u0003Z\"\f\u001a&\u000f\bH";
        objectArray[105] = "m\u0017R(@\t6\r\u00194.I\fSS:\u0010Hf\u0000\u0015}\u0013\u000f\fZ\u0003#G\u00197\u0007X/\u0015s";
        objectArray[106] = "(lp/\u000f8/={#r<\u0014:s)\b<j5d4L";
        objectArray[107] = "\bM_QH\t\u0011K\fBs\u001f\u000e\u001cP@$HWH\u000e\u0010s\u0018\u0005KWB\u0015\u0001Q\u000fI";
        objectArray[108] = "M\u0015 W,\u0010\u001a\u000e9[J\n\u001e\n?J'p\u0012\u0000>M-M\t\u000eeHJ@\u0019\n1^q\u001dB\u0006c4";
        objectArray[109] = "/IX2shtS\u0013.\u001d.N\t_?,o>Y\f'y";
        objectArray[110] = "\u00105\u001cCf!\u0014*\u0018\u001e\u0003)\u00042A\u0018o\u001bV\u007f\u0019N\u00034\u0013-JE<-\u0002+\u0010\u007f";
        objectArray[111] = "eX\n=[\u000e>BA!5D\u0004Y\n?U\u001bh^M6G";
        objectArray[112] = "\u000b_/,\u001eZ\u0004H2h$_\u001b\\%?A$^\u001f:&\u001aJ\fK7<@$";
        objectArray[113] = "W!2\u001d\u0011\fW}zBp\u0006\u0006=*A\u001c4T}p\u001c@cV})\u0017\r\u0013\u0006.1Bp";
        objectArray[114] = "1`:)&9611%[9\rcz4e<g0<sf{\rg|+jz}7/3?\u0007";
        objectArray[115] = "\r=:|\u0006!Z&#p`:R5/\u001f]}Pv?o\r.H#B";
        objectArray[116] = "\u0005;I'+z^!\u0002;E0d\u007fH5{;\u000e,\u000erx|d}\u001cv9?Z?L4;\u0000";
        objectArray[117] = "\u0002S!YAj\rD<\u001d{o\u000fX+#F(\r\u001b;S\u0016{\u0015NF";
        objectArray[118] = ";Lwz4@\"]q \u000e\u001a.Jtvb(|\u0006)-\u000e\u00068\u000b(tc\u0002'\u000fu\u0011";
        objectArray[119] = "`t\u0017\u0012xaf0\u0000\u0010Hinf\u001fB\u001f;62D\u0013Hjm{\u0015\u0013w?ka\u0017";
        objectArray[120] = "\u0016 Vh\"0\u00197K,\u0018/\u0001\u0014Tjd?zi[wq$A4\u0000{#N";
        objectArray[121] = "-1;1K-qm }W\u0017hj\u0016,Qk\u00144ntS-%}+,T,\u0014";
        objectArray[122] = "\u0007&_\"\ry\u001er\u001b<cz\u00030\u0005&\u000fH_q\\qcv\u0003#Y.]u\rp\u001eA";
        objectArray[123] = "g3\u00061aud=Uv\u000e$c\"2qt*h1ig3277\u0003ca!2^";
        objectArray[124] = "\u000b}yv>/\f,rzC hG>+  J7nx8u";
        objectArray[125] = "\u0015\u0002e\u0001\u0007HCXymT`{\b}\u0011\u0001I\u0010^'\r";
        objectArray[126] = "S$7\"ENWv$',X^D6cA^rp5v,N\u0004`wrFJVsr\u001b";
        objectArray[127] = "%[\u00122fm%\u0007\u0013a\u0019o\u001b]K\u007f'hq\u000e\r8$/\u001b_\u001f<el%\u001dO~gS";
        objectArray[128] = "\u001b\u0000k\u0000m\u0005N\u0006q\u0002PT\u0011\u0018V\u0007;Zv\f\u007f\bm_\nSeV7:M\f$\u0012o\u0004\u000f\\f\u0010P";
        objectArray[129] = "nRRV\b1<\u0006_LR_<\fDB[4+k\u0019\u001a\u000f&mZP_W!lkAIP&0VZG\u000b#W";
        objectArray[130] = "\u001a \u000bk\u0004m\u001dq\u0000gyba\u001aOp\u00010@z\u0018k\u0018<";
        objectArray[131] = "(=B\u0014FF~g^x\u0015vFfU\u0011\u0017Kxh\u0002\u0004P";
        objectArray[132] = "T+\u0006c)\u001dSz\roT\u0018h}\u0005e.\u0019\u0016r\u0012xj";
        objectArray[133] = "L\\X0\u000epB\u0019T e{O@\u001d\u0016Y/\u0019\u0014e$\u000e`\u0013\u001e\u001e|\u001b-\u0018%";
        objectArray[134] = "W\u000b\tK\u001c\u0003\u0012\r\u001b\u000e~N*M^\b@E@\u001e\u0018OC\u0002*\u0011\u000f\u0004EEQI\u001aIN~";
        Object[] objectArray2 = objectArray;
        objectArray[135] = "DZfE\u001dMD\u0006g\u0016bB;e<N\u001eMA\u000fo\bYN\u0006e>\u001a]\u000fE[|J\u001f\rz";
    }

    private static Class f(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _8C.e(l2, l3);
            object = q[n];
            try {
                if (!(object instanceof String)) break block2;
                _8C.q[n] = clazz = Class.forName(r[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _8C.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _8C.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field g(long l2, long l3) {
        int n = _8C.e(l2, l3);
        Object object = q[n];
        if (object instanceof String) {
            String string = r[n];
            int n2 = string.indexOf(8);
            Class clazz = _8C.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _8C.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _8C.c(clazz3, string2, clazz2)) != null) {
                    _8C.q[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _8C.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _8C.q[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _8C.f(1875077411535281L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
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

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _8C.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _8C.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method h(long l2, long l3) {
        int n = _8C.e(l2, l3);
        Object object = q[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = r[n];
                int n3 = string2.indexOf(8);
                clazz3 = _8C.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _8C.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _8C.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _8C.q[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _8C.f(1875077411535281L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _8C.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _8C.q[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _8C.f(1875077411535281L, 0L);
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

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c8' || c == '\u00f3' || c == 'P' || c == 'e') {
                field = _8C.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c8' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f3' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'P' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _8C.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e6' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ce' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _8C.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8C" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_8C.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_8C.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_8C.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

