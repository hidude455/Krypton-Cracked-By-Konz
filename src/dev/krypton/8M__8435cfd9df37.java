/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_11905
 *  net.minecraft.class_11908
 *  net.minecraft.class_11909
 */
package dev.krypton;

import dev.krypton._02;
import dev.krypton._0_;
import dev.krypton._6z_0;
import dev.krypton._7V;
import dev.krypton._8e;
import dev.krypton._9B;
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

/*
 * Renamed from dev.krypton.8M
 */
public class _8m_0
extends _8e {
    private final _9B cfr_renamed_1;
    private final _7V cfr_renamed_3;
    private final List cfr_renamed_194;
    private final int cfr_renamed_465;
    private final int cfr_renamed_448;
    private final Set cfr_renamed_6;
    private final int cfr_renamed_402;
    private final int cfr_renamed_466;
    private List cfr_renamed_447;
    private int cfr_renamed_8;
    private int cfr_renamed_9;
    private int cfr_renamed_4;
    private static final long b;
    private static final String[] f;
    private static final String[] g;
    private static final Map h;
    private static final long[] l;
    private static final Integer[] m;
    private static final Map n;
    private static final Object[] q;
    private static final String[] r;

    public _8m_0(_0_ _, long l2, _9B b) {
        long l3 = l2 = _8m_0.b ^ l2;
        long l4 = l3 ^ 0x449D9A1D19D6L;
        long l5 = l3 ^ 0x319D4047C53CL;
        long l6 = l3 ^ 0x76BEE01C40F6L;
        long l7 = l3 ^ 0x3EA0165DCD3CL;
        long l8 = l3 ^ 0x1A4595B0A78BL;
        super((String)((Object)_8m_0.b("v", 22617, (long)(0x7C18C9A6F8BCC565L ^ l2))));
        this.cfr_renamed_3 = new _7V(l5);
        this.cfr_renamed_465 = (int)_8m_0.d("t", 1446, (long)(0x1226182EEC924279L ^ l2));
        this.cfr_renamed_448 = (int)_8m_0.d("t", 20746, (long)(0x4A5A167A8A4F16DDL ^ l2));
        this.cfr_renamed_402 = (int)_8m_0.d("t", 32213, (long)(0x5214D3A9AF4CBA0BL ^ l2));
        this.cfr_renamed_466 = (int)_8m_0.d("t", 22123, (long)(0x231BC8191CAE119FL ^ l2));
        _8m_0.f("\u00d1", (Object)this, (int)_8m_0.d("t", 10251, (long)(0x661BA558C08A6FD7L ^ l2)), 4836072544725909105L, (long)l2);
        _8m_0.f("\u00d1", (Object)this, (int)_8m_0.d("t", 10251, (long)(0x661BA558C08A6FD7L ^ l2)), 4828120056470450404L, (long)l2);
        _8m_0.f("\u00d1", (Object)this, (int)_8m_0.d("t", 10251, (long)(0x661BA558C08A6FD7L ^ l2)), 4830912325966395286L, (long)l2);
        this.cfr_renamed_1 = b;
        Object[] objectArray = new Object[1];
        objectArray[0] = l8;
        this.cfr_renamed_6 = new HashSet(_8m_0.f("\u00c1", (Object)b, (Object)objectArray, 4830569519460255522L, (long)l2));
        this.cfr_renamed_194 = new ArrayList(_8m_0.f("p", 4829966193275753656L, (long)l2));
        _8m_0.f("\u00d1", (Object)this, new ArrayList(_8m_0.f("\u00c3", (Object)this, 4836507328047381074L, (long)l2)), 4836114262559102585L, (long)l2);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = _8m_0.b("v", 7585, (long)(0x5A3292DED7D48094L ^ l2));
        objectArray2[0] = l4;
        _8m_0.f("\u00c1", (Object)_8m_0.f("\u00c3", (Object)this, 4829134217346994950L, (long)l2), (Object)objectArray2, 4828349591189314305L, (long)l2);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = () -> this.cfr_renamed_4(l7);
        objectArray3[0] = l6;
        _8m_0.f("\u00c1", (Object)_8m_0.f("\u00c3", (Object)this, 4829134217346994950L, (long)l2), (Object)objectArray3, 4830503299567652704L, (long)l2);
    }

    @Override
    protected int int_6(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return (int)_8m_0.d("t", 25493, (long)(0x2F7BFD2A8B109B7DL ^ l2));
    }

    @Override
    protected int int_9(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return (int)_8m_0.d("t", 16658, (long)(0x2D070E772379D81BL ^ l2));
    }

    @Override
    public String java_lang_String_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return (String)((Object)_8m_0.b("v", 21315, (long)(0x102238EB9BE13A63L ^ l2))) + (int)_8m_0.f("\u00c1", (Object)_8m_0.f("\u00c3", (Object)this, -5254614414424188022L, (long)l2), -5255577253589629349L, (long)l2) + (String)((Object)_8m_0.b("v", 17103, (long)(0x2516420C3B0EABE4L ^ l2)));
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void cfr_renamed_9(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [68[WHILELOOP], 69[DOLOOP]], but top level block is 33[TRYBLOCK]
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
                    reference var35_29;
                    reference var34_28;
                    boolean bl2;
                    CallSite callSite3;
                    CallSite callSite4;
                    long l2;
                    block74: {
                        _8m_0 m_0;
                        block72: {
                            block73: {
                                Object object;
                                block77: {
                                    block71: {
                                        _8m_0 m_02;
                                        block70: {
                                            reference v25;
                                            CallSite callSite5;
                                            CallSite callSite6;
                                            CallSite callSite7;
                                            long l3;
                                            block67: {
                                                CallSite callSite8;
                                                block65: {
                                                    CallSite callSite9;
                                                    block66: {
                                                        CallSite callSite10;
                                                        CallSite callSite11;
                                                        block63: {
                                                            CallSite callSite12;
                                                            reference var22_15;
                                                            block64: {
                                                                block61: {
                                                                    reference var32_26;
                                                                    CallSite callSite13;
                                                                    CallSite callSite14;
                                                                    CallSite callSite15;
                                                                    block62: {
                                                                        block59: {
                                                                            reference var31_25;
                                                                            block60: {
                                                                                CallSite callSite16;
                                                                                long l4;
                                                                                block57: {
                                                                                    block58: {
                                                                                        block55: {
                                                                                            reference var26_20;
                                                                                            CallSite callSite17;
                                                                                            block56: {
                                                                                                long l5 = l2 = b ^ 0x3BF46F59A0FL;
                                                                                                long l6 = l5 ^ 0x65368635B64DL;
                                                                                                l4 = l5 ^ 0x1FE59FFE79F4L;
                                                                                                long l7 = l5 ^ 0x131AD4E7D7A4L;
                                                                                                l3 = l5 ^ 0x38305D59A891L;
                                                                                                long l8 = l5 ^ 0x110CE056E5CFL;
                                                                                                Object[] objectArray = new Object[2];
                                                                                                objectArray[1] = l8;
                                                                                                objectArray[0] = (double)_8m_0.f("\u00c1", (Object)class_119092, 5359898513459151883L, (long)l2);
                                                                                                callSite4 = _8m_0.f("\u00c1", (Object)this, (Object)objectArray, 5359418499363110938L, (long)l2);
                                                                                                Object[] objectArray2 = new Object[2];
                                                                                                objectArray2[1] = l8;
                                                                                                objectArray2[0] = (double)_8m_0.f("\u00c1", (Object)class_119092, 5362100229019662898L, (long)l2);
                                                                                                callSite3 = _8m_0.f("\u00c1", (Object)this, (Object)objectArray2, 5359418499363110938L, (long)l2);
                                                                                                Object[] objectArray3 = new Object[1];
                                                                                                objectArray3[0] = l6;
                                                                                                callSite7 = _8m_0.f("\u00c1", (Object)this, (Object)objectArray3, 5359310692896569530L, (long)l2);
                                                                                                Object[] objectArray4 = new Object[1];
                                                                                                objectArray4[0] = l7;
                                                                                                callSite6 = _8m_0.f("\u00c1", (Object)this, (Object)objectArray4, 5361646964596596411L, (long)l2);
                                                                                                callSite11 = _8m_0.f("\u00c3", (Object)this, 5367976085676808546L, (long)l2);
                                                                                                callSite5 = _8m_0.f("\u00c3", (Object)this, 5361273380347046463L, (long)l2);
                                                                                                var22_15 = callSite5 + _8m_0.d("t", 13506, (long)(0x7090415F2E457A69L ^ l2));
                                                                                                callSite17 = _8m_0.d("t", 18685, (long)(0x607499A5585F067EL ^ l2));
                                                                                                callSite12 = _8m_0.d("t", 32665, (long)(0x342DFAF1C422B13BL ^ l2));
                                                                                                reference var25_18 = callSite11 + _8m_0.d("t", 22838, (long)(0x149E4A57018817A5L ^ l2));
                                                                                                bl2 = _02.cfr_renamed_2();
                                                                                                var26_20 = var25_18 + callSite17 + _8m_0.d("t", 30317, (long)(0x5A99D0FFFD7138C4L ^ l2));
                                                                                                try {
                                                                                                    try {
                                                                                                        Object[] objectArray5 = new Object[7];
                                                                                                        objectArray5[6] = (int)callSite12;
                                                                                                        objectArray5[5] = (int)callSite17;
                                                                                                        objectArray5[4] = (int)var22_15;
                                                                                                        objectArray5[3] = (int)var25_18;
                                                                                                        objectArray5[2] = (double)callSite3;
                                                                                                        objectArray5[1] = (double)callSite4;
                                                                                                        objectArray5[0] = l3;
                                                                                                        callSite16 = _8m_0.f("\u00c1", (Object)this, (Object)objectArray5, 5360430103554393959L, (long)l2);
                                                                                                        if (bl2) break block55;
                                                                                                        if (callSite16 == false) break block56;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw _8m_0.a(matchException);
                                                                                                    }
                                                                                                    _8m_0.f("\u00d1", (Object)this, (int)_8m_0.d("t", 28945, (long)(0x2F11D9061D4D3FB1L ^ l2)), 5360019345359387014L, (long)l2);
                                                                                                    return true;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw _8m_0.a(matchException);
                                                                                                }
                                                                                            }
                                                                                            Object[] objectArray = new Object[7];
                                                                                            objectArray[6] = (int)callSite12;
                                                                                            objectArray[5] = (int)callSite17;
                                                                                            objectArray[4] = (int)var22_15;
                                                                                            objectArray[3] = (int)var26_20;
                                                                                            objectArray[2] = (double)callSite3;
                                                                                            objectArray[1] = (double)callSite4;
                                                                                            objectArray[0] = l3;
                                                                                            callSite16 = _8m_0.f("\u00c1", (Object)this, (Object)objectArray, 5360430103554393959L, (long)l2);
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                if (bl2) break block57;
                                                                                                if (callSite16 == false) break block58;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw _8m_0.a(matchException);
                                                                                            }
                                                                                            _8m_0.f("\u00d1", (Object)this, (int)_8m_0.d("t", 27952, (long)(0x763E7C07BE432381L ^ l2)), 5360019345359387014L, (long)l2);
                                                                                            return true;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw _8m_0.a(matchException);
                                                                                        }
                                                                                    }
                                                                                    callSite16 = callSite5 + callSite6 - _8m_0.d("t", 32213, (long)(0x5214A307E0CEB369L ^ l2));
                                                                                }
                                                                                callSite15 = callSite16;
                                                                                callSite14 = _8m_0.d("t", 18572, (long)(0x6BAD6EFCEFFD8626L ^ l2));
                                                                                callSite13 = _8m_0.d("t", 10476, (long)(0x1C74E2AF76FC6675L ^ l2));
                                                                                reference var30_24 = callSite11 + callSite7 - callSite14 - _8m_0.d("t", 23834, (long)(0x5E39B6E31DBE139CL ^ l2));
                                                                                var31_25 = var30_24 - callSite14 - _8m_0.d("t", 18771, (long)(0x7AD0CC417A7987EAL ^ l2));
                                                                                var32_26 = var31_25 - callSite14 - _8m_0.d("t", 18771, (long)(0x7AD0CC417A7987EAL ^ l2));
                                                                                try {
                                                                                    try {
                                                                                        Object[] objectArray = new Object[7];
                                                                                        objectArray[6] = (int)callSite13;
                                                                                        objectArray[5] = (int)callSite14;
                                                                                        objectArray[4] = (int)callSite15;
                                                                                        objectArray[3] = (int)var30_24;
                                                                                        objectArray[2] = (double)callSite3;
                                                                                        objectArray[1] = (double)callSite4;
                                                                                        objectArray[0] = l3;
                                                                                        callSite10 = _8m_0.f("\u00c1", (Object)this, (Object)objectArray, 5360430103554393959L, (long)l2);
                                                                                        if (bl2) break block59;
                                                                                        if (callSite10 != false) {
                                                                                        }
                                                                                        break block60;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw _8m_0.a(matchException);
                                                                                    }
                                                                                    Object[] objectArray = new Object[2];
                                                                                    objectArray[1] = new HashSet(_8m_0.f("\u00c3", (Object)this, 5360961169121126140L, (long)l2));
                                                                                    objectArray[0] = l4;
                                                                                    _8m_0.f("\u00c1", (Object)_8m_0.f("\u00c3", (Object)this, 5360597052411370928L, (long)l2), (Object)objectArray, 5361585455655083109L, (long)l2);
                                                                                    _8m_0.f("\u00c1", (Object)_8m_0.f("p", 5362216723404946657L, (long)l2), (Object)_8m_0.f("\u00c3", (Object)_8m_0.f("p", 5361746812368629886L, (long)l2), 5367669603122210622L, (long)l2), 5359698380918928492L, (long)l2);
                                                                                    return true;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw _8m_0.a(matchException);
                                                                                }
                                                                            }
                                                                            Object[] objectArray = new Object[7];
                                                                            objectArray[6] = (int)callSite13;
                                                                            objectArray[5] = (int)callSite14;
                                                                            objectArray[4] = (int)callSite15;
                                                                            objectArray[3] = (int)var31_25;
                                                                            objectArray[2] = (double)callSite3;
                                                                            objectArray[1] = (double)callSite4;
                                                                            objectArray[0] = l3;
                                                                            callSite10 = _8m_0.f("\u00c1", (Object)this, (Object)objectArray, 5360430103554393959L, (long)l2);
                                                                        }
                                                                        try {
                                                                            try {
                                                                                if (bl2) break block61;
                                                                                if (callSite10 == false) break block62;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw _8m_0.a(matchException);
                                                                            }
                                                                            _8m_0.f("\u00c1", (Object)_8m_0.f("p", 5362216723404946657L, (long)l2), (Object)_8m_0.f("\u00c3", (Object)_8m_0.f("p", 5361746812368629886L, (long)l2), 5367669603122210622L, (long)l2), 5359698380918928492L, (long)l2);
                                                                            return true;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw _8m_0.a(matchException);
                                                                        }
                                                                    }
                                                                    Object[] objectArray = new Object[7];
                                                                    objectArray[6] = (int)callSite13;
                                                                    objectArray[5] = (int)callSite14;
                                                                    objectArray[4] = (int)callSite15;
                                                                    objectArray[3] = (int)var32_26;
                                                                    objectArray[2] = (double)callSite3;
                                                                    objectArray[1] = (double)callSite4;
                                                                    objectArray[0] = l3;
                                                                    callSite10 = _8m_0.f("\u00c1", (Object)this, (Object)objectArray, 5360430103554393959L, (long)l2);
                                                                }
                                                                try {
                                                                    try {
                                                                        if (bl2) break block63;
                                                                        if (callSite10 == false) break block64;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw _8m_0.a(matchException);
                                                                    }
                                                                    _8m_0.f("\u00c1", (Object)_8m_0.f("\u00c3", (Object)this, 5360961169121126140L, (long)l2), 5359433096405779440L, (long)l2);
                                                                    return true;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw _8m_0.a(matchException);
                                                                }
                                                            }
                                                            callSite10 = var22_15 + callSite12 + _8m_0.d("t", 18771, (long)(0x7AD0CC417A7987EAL ^ l2));
                                                        }
                                                        callSite9 = callSite10;
                                                        var34_28 = callSite11 + _8m_0.d("t", 23834, (long)(0x5E39B6E31DBE139CL ^ l2));
                                                        try {
                                                            try {
                                                                callSite8 = _8m_0.f("\u00c3", (Object)this, 5360019345359387014L, (long)l2);
                                                                if (bl2) break block65;
                                                                if (callSite8 != false) break block66;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _8m_0.a(matchException);
                                                            }
                                                            v25 = callSite9 + _8m_0.d("t", 10476, (long)(0x1C74E2AF76FC6675L ^ l2)) + _8m_0.d("t", 28335, (long)(0x4399BCF85D0DA009L ^ l2));
                                                            break block67;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _8m_0.a(matchException);
                                                        }
                                                    }
                                                    callSite8 = callSite9;
                                                }
                                                v25 = callSite8 + _8m_0.d("t", 11886, (long)(0x61B971E50E97E0DAL ^ l2));
                                            }
                                            var35_29 = v25;
                                            reference var36_30 = callSite7 - _8m_0.d("t", 32213, (long)(0x5214A307E0CEB369L ^ l2));
                                            reference var37_31 = callSite6 - (var35_29 - callSite5) - _8m_0.d("t", 14504, (long)(0x20622F20130AF638L ^ l2));
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            Object[] objectArray = new Object[7];
                                                            objectArray[6] = (int)var37_31;
                                                            objectArray[5] = (int)var36_30;
                                                            objectArray[4] = (int)var35_29;
                                                            objectArray[3] = (int)var34_28;
                                                            objectArray[2] = (double)callSite3;
                                                            objectArray[1] = (double)callSite4;
                                                            objectArray[0] = l3;
                                                            v28 = _8m_0.f("\u00c1", (Object)this, (Object)objectArray, 5360430103554393959L, (long)l2);
                                                            if (bl2) break block68;
                                                            if (v28 == false) break block69;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _8m_0.a(matchException);
                                                        }
                                                        m_02 = this;
                                                        if (bl2) break block70;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _8m_0.a(matchException);
                                                    }
                                                    if (_8m_0.f("\u00c3", (Object)m_02, 5360019345359387014L, (long)l2) != false) break block71;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _8m_0.a(matchException);
                                                }
                                                m_02 = this;
                                            }
                                            catch (MatchException matchException) {
                                                throw _8m_0.a(matchException);
                                            }
                                        }
                                        object = _8m_0.f("\u00c3", (Object)m_02, 5368049837261135643L, (long)l2);
                                        break block77;
                                    }
                                    object = new ArrayList(_8m_0.f("\u00c3", (Object)this, 5360961169121126140L, (long)l2));
                                }
                                callSite2 = object;
                                try {
                                    try {
                                        m_0 = this;
                                        if (bl2) break block72;
                                        if (_8m_0.f("\u00c3", (Object)m_0, 5360019345359387014L, (long)l2) != false) break block73;
                                    }
                                    catch (MatchException matchException) {
                                        throw _8m_0.a(matchException);
                                    }
                                    callSite = _8m_0.f("\u00c3", (Object)this, 5368113687610144531L, (long)l2);
                                    break block74;
                                }
                                catch (MatchException matchException) {
                                    throw _8m_0.a(matchException);
                                }
                            }
                            m_0 = this;
                        }
                        callSite = _8m_0.f("\u00c3", (Object)m_0, 5361721740882509556L, (long)l2);
                    }
                    CallSite callSite18 = callSite;
                    CallSite callSite19 = _8m_0.d("t", 3536, (long)(0x6A11B6832DA2434DL ^ l2));
                    reference var41_35 = callSite18 * _8m_0.d("t", 6456, (long)(0x37691F8DE7D5579FL ^ l2));
                    reference var42_36 = callSite4 - var34_28 - 5;
                    reference var43_37 = callSite3 - var35_29 - 5;
                    reference var44_38 = var42_36 / callSite19;
                    reference var45_39 = var43_37 / callSite19;
                    try {
                        try {
                            try {
                                v28 = var44_38;
                                if (bl2) break block68;
                                if (v28 < 0) break block69;
                            }
                            catch (MatchException matchException) {
                                throw _8m_0.a(matchException);
                            }
                            v28 = var44_38;
                            if (bl2) break block68;
                        }
                        catch (MatchException matchException) {
                            throw _8m_0.a(matchException);
                        }
                        if (v28 >= _8m_0.d("t", 1446, (long)(0x12266880A3104B1BL ^ l2))) break block69;
                    }
                    catch (MatchException matchException) {
                        throw _8m_0.a(matchException);
                    }
                    reference var46_40 = var41_35 + var45_39 * _8m_0.d("t", 1446, (long)(0x12266880A3104B1BL ^ l2)) + var44_38;
                    try {
                        try {
                            try {
                                v28 = var46_40;
                                if (bl2) break block68;
                                if (v28 < 0) break block69;
                            }
                            catch (MatchException matchException) {
                                throw _8m_0.a(matchException);
                            }
                            v28 = var46_40;
                            if (bl2) break block68;
                        }
                        catch (MatchException matchException) {
                            throw _8m_0.a(matchException);
                        }
                        if (v28 >= _8m_0.f("\u00c1", (Object)callSite2, 5361951435449111608L, (long)l2)) break block69;
                    }
                    catch (MatchException matchException) {
                        throw _8m_0.a(matchException);
                    }
                    _6z_0 z_0 = (_6z_0)((Object)_8m_0.f("\u00c1", (Object)callSite2, (int)var46_40, 5368265100628278687L, (long)l2));
                    try {
                        CallSite callSite17;
                        block76: {
                            try {
                                try {
                                    callSite17 = _8m_0.f("\u00c1", (Object)_8m_0.f("\u00c3", (Object)this, 5360961169121126140L, (long)l2), (Object)z_0, 5359525883480507295L, (long)l2);
                                    if (bl2) break block75;
                                    if (callSite17 == false) break block76;
                                }
                                catch (MatchException matchException) {
                                    throw _8m_0.a(matchException);
                                }
                                _8m_0.f("\u00c1", (Object)_8m_0.f("\u00c3", (Object)this, 5360961169121126140L, (long)l2), (Object)z_0, 5361329254833554265L, (long)l2);
                                if (!bl2) break block75;
                            }
                            catch (MatchException matchException) {
                                throw _8m_0.a(matchException);
                            }
                        }
                        callSite17 = _8m_0.f("\u00c1", (Object)_8m_0.f("\u00c3", (Object)this, 5360961169121126140L, (long)l2), (Object)z_0, 5360493425172646096L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw _8m_0.a(matchException);
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
                                                            v0 = var9_5 = _8m_0.b ^ 52404282535202L;
                                                            var11_6 = v0 ^ 80404243874144L;
                                                            var13_7 = v0 ^ 69324005400713L;
                                                            var15_8 = v0 ^ 22154666647484L;
                                                            var17_9 = v0 ^ 67185972499170L;
                                                            v1 = new Object[2];
                                                            v1[1] = var17_9;
                                                            v1[0] = var1_1;
                                                            var1_1 = (double)_8m_0.f("\u00c1", (Object)this, (Object)v1, (long)-194403908861118665L, (long)var9_5);
                                                            v2 = new Object[2];
                                                            v2[1] = var17_9;
                                                            v2[0] = var3_2;
                                                            var3_2 = (double)_8m_0.f("\u00c1", (Object)this, (Object)v2, (long)-194403908861118665L, (long)var9_5);
                                                            var19_10 = _02.cfr_renamed_3();
                                                            v3 = new Object[1];
                                                            v3[0] = var11_6;
                                                            var20_11 = _8m_0.f("\u00c1", (Object)this, (Object)v3, (long)-194441242965323881L, (long)var9_5);
                                                            v4 = new Object[1];
                                                            v4[0] = var13_7;
                                                            var21_12 = _8m_0.f("\u00c1", (Object)this, (Object)v4, (long)-196670092148971114L, (long)var9_5);
                                                            var22_13 = _8m_0.f("\u00c3", (Object)this, (long)-192584026318541233L, (long)var9_5);
                                                            var23_14 = _8m_0.f("\u00c3", (Object)this, (long)-195275816722539246L, (long)var9_5);
                                                            var24_15 = var23_14 + _8m_0.d("t", (int)32213, (long)(5914509517925516356L ^ var9_5));
                                                            var25_16 = var24_15 + _8m_0.d("t", (int)10476, (long)(2050491025980182872L ^ var9_5)) + _8m_0.d("t", (int)18771, (long)(8849819933897994439L ^ var9_5));
                                                            var26_17 = var22_13 + _8m_0.d("t", (int)23834, (long)(6789628290462033073L ^ var9_5));
                                                            try {
                                                                try {
                                                                    v5 = _8m_0.f("\u00c3", (Object)this, (long)-193741489819447637L, (long)var9_5);
                                                                    if (!var19_10) break block39;
                                                                    if (v5 != false) break block40;
                                                                }
                                                                catch (MatchException v6) {
                                                                    throw _8m_0.a(v6);
                                                                }
                                                                v7 = var25_16 + _8m_0.d("t", (int)10476, (long)(2050491025980182872L ^ var9_5)) + _8m_0.d("t", (int)11886, (long)(7041762791078189047L ^ var9_5));
                                                                break block41;
                                                            }
                                                            catch (MatchException v8) {
                                                                throw _8m_0.a(v8);
                                                            }
                                                        }
                                                        v5 = var25_16;
                                                    }
                                                    v7 = v5 + _8m_0.d("t", (int)11886, (long)(7041762791078189047L ^ var9_5));
                                                }
                                                var27_18 = v7;
                                                var28_19 = var20_11 - _8m_0.d("t", (int)32213, (long)(5914509517925516356L ^ var9_5));
                                                var29_20 = var21_12 - (var27_18 - var23_14) - _8m_0.d("t", (int)24957, (long)(4570286959669123306L ^ var9_5));
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                v9 = new Object[7];
                                                                v9[6] = (int)var29_20;
                                                                v9[5] = (int)var28_19;
                                                                v9[4] = (int)var27_18;
                                                                v9[3] = (int)var26_17;
                                                                v9[2] = var3_2;
                                                                v9[1] = var1_1;
                                                                v9[0] = var15_8;
                                                                v10 /* !! */  = _8m_0.f("\u00c1", (Object)this, (Object)v9, (long)-195556040069402550L, (long)var9_5);
                                                                if (!var19_10) break block42;
                                                                if (v10 /* !! */  == false) break block43;
                                                            }
                                                            catch (MatchException v11) {
                                                                throw _8m_0.a(v11);
                                                            }
                                                            v12 = this;
                                                            if (!var19_10) break block44;
                                                        }
                                                        catch (MatchException v13) {
                                                            throw _8m_0.a(v13);
                                                        }
                                                        if (_8m_0.f("\u00c3", (Object)v12, (long)-193741489819447637L, (long)var9_5) != false) break block45;
                                                    }
                                                    catch (MatchException v14) {
                                                        throw _8m_0.a(v14);
                                                    }
                                                    v12 = this;
                                                }
                                                catch (MatchException v15) {
                                                    throw _8m_0.a(v15);
                                                }
                                            }
                                            v16 = _8m_0.f("\u00c3", (Object)v12, (long)-193081986420856778L, (long)var9_5);
                                            break block53;
                                        }
                                        v16 = new ArrayList<E>(_8m_0.f("\u00c3", (Object)this, (long)-195667089830178351L, (long)var9_5));
                                    }
                                    var30_21 = v16;
                                    var31_22 = (int)_8m_0.f("\u00f4", (double)((double)_8m_0.f("\u00c1", (Object)var30_21, (long)-196937385059572971L, (long)var9_5) / 11.0), (long)-192726875124753244L, (long)var9_5);
                                    var32_23 = _8m_0.f("\u00f4", (int)0, (int)(var31_22 - _8m_0.d("t", (int)20746, (long)(5357676907311507602L ^ var9_5))), (long)-193249582949165316L, (long)var9_5);
                                    try {
                                        block48: {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            v17 /* !! */  = _8m_0.f("\u00c3", (Object)this, (long)-193741489819447637L, (long)var9_5);
                                                            if (!var19_10) break block46;
                                                            if (v17 /* !! */  == false) {
                                                            }
                                                            ** GOTO lbl142
                                                        }
                                                        catch (MatchException v18) {
                                                            throw _8m_0.a(v18);
                                                        }
                                                        cfr_temp_0 = var7_4 - 0.0;
                                                        v17 /* !! */  = (CallSite)(cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1));
                                                        if (!var19_10) break block47;
                                                    }
                                                    catch (MatchException v19) {
                                                        throw _8m_0.a(v19);
                                                    }
                                                    if (v17 /* !! */  <= 0) break block48;
                                                }
                                                catch (MatchException v20) {
                                                    throw _8m_0.a(v20);
                                                }
                                                _8m_0.f("\u00d1", (Object)this, (int)_8m_0.f("\u00f4", (int)0, (int)(_8m_0.f("\u00c3", (Object)this, (long)-192965514677813186L, (long)var9_5) - true), (long)-193249582949165316L, (long)var9_5), (long)-192965514677813186L, (long)var9_5);
                                                if (var19_10) break block49;
                                            }
                                            catch (MatchException v21) {
                                                throw _8m_0.a(v21);
                                            }
                                        }
                                        v17 /* !! */  = (CallSite)((cfr_temp_1 = var7_4 - 0.0) == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1));
                                    }
                                    catch (MatchException v22) {
                                        throw _8m_0.a(v22);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            if (!var19_10) break block50;
                                            if (v17 /* !! */  >= 0) break block49;
                                        }
                                        catch (MatchException v23) {
                                            throw _8m_0.a(v23);
                                        }
                                        _8m_0.f("\u00d1", (Object)this, (int)_8m_0.f("\u00f4", (int)var32_23, (int)(_8m_0.f("\u00c3", (Object)this, (long)-192965514677813186L, (long)var9_5) + true), (long)-192765599879118945L, (long)var9_5), (long)-192965514677813186L, (long)var9_5);
                                        if (var19_10) break block49;
                                    }
                                    catch (MatchException v24) {
                                        throw _8m_0.a(v24);
                                    }
lbl142:
                                    // 2 sources

                                    v17 /* !! */  = (CallSite)((cfr_temp_2 = var7_4 - 0.0) == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1));
                                }
                                catch (MatchException v25) {
                                    throw _8m_0.a(v25);
                                }
                            }
                            try {
                                block52: {
                                    try {
                                        try {
                                            if (!var19_10) break block51;
                                            if (v17 /* !! */  <= 0) break block52;
                                        }
                                        catch (MatchException v26) {
                                            throw _8m_0.a(v26);
                                        }
                                        _8m_0.f("\u00d1", (Object)this, (int)_8m_0.f("\u00f4", (int)0, (int)(_8m_0.f("\u00c3", (Object)this, (long)-196604146313672231L, (long)var9_5) - true), (long)-193249582949165316L, (long)var9_5), (long)-196604146313672231L, (long)var9_5);
                                        if (var19_10) break block49;
                                    }
                                    catch (MatchException v27) {
                                        throw _8m_0.a(v27);
                                    }
                                }
                                v17 /* !! */  = (CallSite)((cfr_temp_3 = var7_4 - 0.0) == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1));
                            }
                            catch (MatchException v28) {
                                throw _8m_0.a(v28);
                            }
                        }
                        try {
                            try {
                                if (!var19_10) break block50;
                                if (v17 /* !! */  >= 0) break block49;
                            }
                            catch (MatchException v29) {
                                throw _8m_0.a(v29);
                            }
                            _8m_0.f("\u00d1", (Object)this, (int)_8m_0.f("\u00f4", (int)var32_23, (int)(_8m_0.f("\u00c3", (Object)this, (long)-196604146313672231L, (long)var9_5) + true), (long)-192765599879118945L, (long)var9_5), (long)-196604146313672231L, (long)var9_5);
                        }
                        catch (MatchException v30) {
                            throw _8m_0.a(v30);
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
                                long l5 = l3 = b ^ 0x90DCF8F472EL;
                                l2 = l5 ^ 0x15571684A4D5L;
                                l4 = l5 ^ 0x282FB0A458CBL;
                                bl = _02.cfr_renamed_2();
                                try {
                                    try {
                                        object = _8m_0.f("\u00c1", (Object)class_119082, -7546057622090878830L, (long)l3);
                                        if (bl) break block18;
                                        if (object == _8m_0.d("t", 20245, (long)(0x33DCBA88D47A5CB5L ^ l3))) {
                                        }
                                        break block19;
                                    }
                                    catch (MatchException matchException) {
                                        throw _8m_0.a(matchException);
                                    }
                                    Object[] objectArray = new Object[2];
                                    objectArray[1] = new HashSet(_8m_0.f("\u00c3", (Object)this, -7546626197231600675L, (long)l3));
                                    objectArray[0] = l2;
                                    _8m_0.f("\u00c1", (Object)_8m_0.f("\u00c3", (Object)this, -7546449487107555183L, (long)l3), (Object)objectArray, -7545456672957660860L, (long)l3);
                                    _8m_0.f("\u00c1", (Object)_8m_0.f("p", -7544830091284504128L, (long)l3), (Object)_8m_0.f("\u00c3", (Object)_8m_0.f("p", -7545276620489462433L, (long)l3), -7539938774248572385L, (long)l3), -7547905477882779315L, (long)l3);
                                    return true;
                                }
                                catch (MatchException matchException) {
                                    throw _8m_0.a(matchException);
                                }
                            }
                            object = _8m_0.f("\u00c3", (Object)this, -7547021971777330009L, (long)l3);
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (bl) break block20;
                                        if (object != false) break block21;
                                    }
                                    catch (MatchException matchException) {
                                        throw _8m_0.a(matchException);
                                    }
                                    Object[] objectArray = new Object[2];
                                    objectArray[1] = l4;
                                    objectArray[0] = class_119082;
                                    object = _8m_0.f("\u00c1", (Object)_8m_0.f("\u00c3", (Object)this, -7545783508441102523L, (long)l3), (Object)objectArray, -7539114601587496565L, (long)l3);
                                    if (bl) break block20;
                                }
                                catch (MatchException matchException) {
                                    throw _8m_0.a(matchException);
                                }
                                if (object == false) break block21;
                            }
                            catch (MatchException matchException) {
                                throw _8m_0.a(matchException);
                            }
                            return true;
                        }
                        catch (MatchException matchException) {
                            throw _8m_0.a(matchException);
                        }
                    }
                    object = _8m_0.f("\u00c1", (Object)class_119082, -7546057622090878830L, (long)l3);
                }
                try {
                    try {
                        if (bl) break block22;
                        if (object == _8m_0.d("t", 17833, (long)(0x43DCA765BF25637L ^ l3))) {
                        }
                        break block23;
                    }
                    catch (MatchException matchException) {
                        throw _8m_0.a(matchException);
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = new HashSet(_8m_0.f("\u00c3", (Object)this, -7546626197231600675L, (long)l3));
                    objectArray[0] = l2;
                    _8m_0.f("\u00c1", (Object)_8m_0.f("\u00c3", (Object)this, -7546449487107555183L, (long)l3), (Object)objectArray, -7545456672957660860L, (long)l3);
                    _8m_0.f("\u00c1", (Object)_8m_0.f("p", -7544830091284504128L, (long)l3), (Object)_8m_0.f("\u00c3", (Object)_8m_0.f("p", -7545276620489462433L, (long)l3), -7539938774248572385L, (long)l3), -7547905477882779315L, (long)l3);
                    return true;
                }
                catch (MatchException matchException) {
                    throw _8m_0.a(matchException);
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
                long l2 = b ^ 0x7D15BFC8B7EL;
                long l3 = l2 ^ 0x42812B1F9883L;
                boolean bl = _02.cfr_renamed_3();
                try {
                    try {
                        object = _8m_0.f("\u00c3", (Object)this, 6562757703236004087L, (long)l2);
                        if (!bl) break block4;
                        if (object != false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _8m_0.a(matchException);
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = class_119052;
                    objectArray[0] = l3;
                    return (boolean)_8m_0.f("\u00c1", (Object)_8m_0.f("\u00c3", (Object)this, 6563982422267775765L, (long)l2), (Object)objectArray, 6561337900832009555L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _8m_0.a(matchException);
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
                    l3 = l4 ^ 0x2D048A4526DL;
                    long l5 = l4 ^ 0x607C1B5971C9L;
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
                                        callSite = _8m_0.f("\u00c1", (Object)_8m_0.f("\u00c3", (Object)this, 6793343928108174916L, (long)l2), (Object)objectArray, 6792454374297887430L, (long)l2);
                                        if (bl) break block6;
                                        l7 = 6792311897363456143L;
                                        l6 = l2;
                                        if (l2 < 0L) break block7;
                                        if (_8m_0.f("\u00c1", (Object)callSite, (long)l7, (long)l6) == false) break block8;
                                    }
                                    catch (MatchException matchException) {
                                        throw _8m_0.a(matchException);
                                    }
                                    _8m_0.f("\u00d1", (Object)this, new ArrayList(_8m_0.f("\u00c3", (Object)this, 6799573941842175760L, (long)l2)), 6800186946684324667L, (long)l2);
                                    if (l2 <= 0L) break block9;
                                    if (!bl) break block10;
                                }
                                catch (MatchException matchException) {
                                    throw _8m_0.a(matchException);
                                }
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l5;
                            callSite2 = _8m_0.f("\u00c1", (Object)_8m_0.f("\u00c3", (Object)this, 6793343928108174916L, (long)l2), (Object)objectArray, 6792454374297887430L, (long)l2);
                            l7 = 6792088148840262786L;
                            l6 = l2;
                        }
                        callSite = _8m_0.f("\u00c1", (Object)callSite2, (long)l7, (long)l6);
                    }
                    catch (MatchException matchException) {
                        throw _8m_0.a(matchException);
                    }
                }
                CallSite callSite3 = callSite;
                _8m_0.f("\u00d1", (Object)this, (List)((List)((Object)_8m_0.f("\u00c1", (Object)_8m_0.f("\u00c1", (Object)_8m_0.f("\u00c1", (Object)_8m_0.f("\u00c3", (Object)this, 6799573941842175760L, (long)l2), 6793579009135168814L, (long)l2), arg_0 -> _8m_0.cfr_renamed_0(l3, (String)((Object)callSite3), arg_0), 6792970666675884822L, (long)l2), (Object)_8m_0.f("\u00f4", 6794212848215528421L, (long)l2), 6794693482635114004L, (long)l2))), 6800186946684324667L, (long)l2);
            }
            _8m_0.f("\u00d1", (Object)this, (int)_8m_0.d("t", 10251, (long)(0x661BECEB8ADD7295L ^ l2)), 6800268208788939571L, (long)l2);
        }
    }

    private static boolean cfr_renamed_0(long l2, String string, _6z_0 z_0) {
        l2 = b ^ l2;
        return (boolean)_8m_0.f("\u00c1", (Object)_8m_0.f("\u00c1", (Object)_8m_0.f("\u00c1", (Object)z_0, -2569274258564434758L, (long)l2), -2571223418897879407L, (long)l2), (Object)string, -2569397379095492210L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        _8m_0.b = dev.krypton.l.a(-8980053535843212571L, 3071071173173021297L, MethodHandles.lookup().lookupClass()).a(62491321835895L);
                        _8m_0.q = new Object[112];
                        _8m_0.r = new String[112];
                        _8m_0.b();
                        _8m_0.h = new HashMap<K, V>(13);
                        var11 = _8m_0.b ^ 114660275982476L;
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
                        var20_3 = new String[12];
                        var18_4 = 0;
                        var17_5 = "\u00a1<\u00d5\u00bcw\u0086\u00aat\u00c9\u00da\u00bd\u0080w\u001cU\u00f9\u0002\bF]\u00b8g\u0017\u00c1\u00e1\u00e1\u0019\u0012\u00e2\u00c2\u00ba\u0088\u0018\u00c6%xu\u000b\u0099\u00fd\u00fb\u00a7\u0018c\u0086\u00c8\u00ebBo\u001a\u001e\u0001\u001b\u0090\u008e\u0091p\u0018\u00f8\u00bb\u00d6\u00b6?x\u00e1\u00fd\u0091\u0016gF\u00c9\u0092\u00d6\u00dfJ@\u0014\u00b8/\u00db,\u001c \u00d1\u00f7\u00a2\u00b1\u00f4\u00e9\"\u0096wq\u00f9n\u00aew\u00b2\u00e8\u00a7l8x\u00ea\u0085\t9^Ha\u00d7\u00ac\u00ab\u009b\u00af\u0010\u0090\u00cdND\"\u00ec\u00cd\u00e0\u00fe\u00fcU\u00c8\u00c1U\u00d6!\u0018\u00c3pz\u00c4+\u0010$\u00af\u0082.\u00a7\u0082*@(,a\u008a\u00f0\u0000\b\u00e5H<\u0010\u00839D\u0096\u00c9\u0091T\u00fa\u000b+\u00e1\u0016\u0084\u008ekT(\u00ef\u00ceY\u00f2\u0094\u00f0\u00e0n\u0095\u00c8;\u00fc\u00a9\u00c9\u00bd)\u00dbT\u00c4I\u00ce\u00e7\u009d\u00bfX\u0080\u00ce\u009dJ\u00d1\u0087\u00f1\u00ef\u0099-\u00fd\u00d4G\u001d\u0086 \u00f6\u009e\u00fb\u0013k\u00896 \u0080\u00df\u00ed\u00f3\u0089\u00b2\u00ecP^\u008a\u00c5\u00bdC8\u00f8\u001b \u0004+\u00dc\u00b5R3\u00d6\u0018S\u0099B6\u0014\u00d6\u0001\u00a7\u00e2\u00e1N\t\u00ce\u00d92\u0001F\u001c\u00e96(\u0001\u009aQ";
                        var19_6 = "\u00a1<\u00d5\u00bcw\u0086\u00aat\u00c9\u00da\u00bd\u0080w\u001cU\u00f9\u0002\bF]\u00b8g\u0017\u00c1\u00e1\u00e1\u0019\u0012\u00e2\u00c2\u00ba\u0088\u0018\u00c6%xu\u000b\u0099\u00fd\u00fb\u00a7\u0018c\u0086\u00c8\u00ebBo\u001a\u001e\u0001\u001b\u0090\u008e\u0091p\u0018\u00f8\u00bb\u00d6\u00b6?x\u00e1\u00fd\u0091\u0016gF\u00c9\u0092\u00d6\u00dfJ@\u0014\u00b8/\u00db,\u001c \u00d1\u00f7\u00a2\u00b1\u00f4\u00e9\"\u0096wq\u00f9n\u00aew\u00b2\u00e8\u00a7l8x\u00ea\u0085\t9^Ha\u00d7\u00ac\u00ab\u009b\u00af\u0010\u0090\u00cdND\"\u00ec\u00cd\u00e0\u00fe\u00fcU\u00c8\u00c1U\u00d6!\u0018\u00c3pz\u00c4+\u0010$\u00af\u0082.\u00a7\u0082*@(,a\u008a\u00f0\u0000\b\u00e5H<\u0010\u00839D\u0096\u00c9\u0091T\u00fa\u000b+\u00e1\u0016\u0084\u008ekT(\u00ef\u00ceY\u00f2\u0094\u00f0\u00e0n\u0095\u00c8;\u00fc\u00a9\u00c9\u00bd)\u00dbT\u00c4I\u00ce\u00e7\u009d\u00bfX\u0080\u00ce\u009dJ\u00d1\u0087\u00f1\u00ef\u0099-\u00fd\u00d4G\u001d\u0086 \u00f6\u009e\u00fb\u0013k\u00896 \u0080\u00df\u00ed\u00f3\u0089\u00b2\u00ecP^\u008a\u00c5\u00bdC8\u00f8\u001b \u0004+\u00dc\u00b5R3\u00d6\u0018S\u0099B6\u0014\u00d6\u0001\u00a7\u00e2\u00e1N\t\u00ce\u00d92\u0001F\u001c\u00e96(\u0001\u009aQ".length();
                        var16_7 = 32;
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
                            var20_3[var18_4++] = _8m_0.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00d6\u00e1f\u00e7\u0002P\u00cd~\u00ec1\u0086H\u00dbJn|\u00e5\u009dEW\u0099\u00a4H\u0087 \u00a7\u0012($\u00d6\u00c7Ym\u00ec\u00ca?\u00e0\u0002S\u0003<\u00ad4x\u00a4\u0089\u0091\u00ef\u00a8U\u0092\u00b9\u00cbhY\u00ec\u00b8";
                            var19_6 = "\u00d6\u00e1f\u00e7\u0002P\u00cd~\u00ec1\u0086H\u00dbJn|\u00e5\u009dEW\u0099\u00a4H\u0087 \u00a7\u0012($\u00d6\u00c7Ym\u00ec\u00ca?\u00e0\u0002S\u0003<\u00ad4x\u00a4\u0089\u0091\u00ef\u00a8U\u0092\u00b9\u00cbhY\u00ec\u00b8".length();
                            var16_7 = 24;
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
                            var20_3[var18_4++] = _8m_0.b(var21_9).intern();
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
                _8m_0.f = var20_3;
                _8m_0.g = new String[12];
                _8m_0.n = new HashMap<K, V>(13);
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
                var6_12 = new long[53];
                var3_13 = 0;
                var4_14 = "\u00d4K\u00b7Hy\u0006\u00a5\u001a#(t\u00e3*\u00fcz\u0001Z\u00fe\u00d6\u00a1<\u0014b\u0014\fR\u00bb\u0007@\u0086\u00f4\u00ad\u00d0\u00c4\u00f8\u009f\u008d\u00ca/v\u000f\u0088\u00c8\u00b6yp\u00deCO\u0006\u00df\u00acW`\u00b9\u00b0\u00da\u0089\u0010\u001fFU\u00d4\u00b3a\u00b9$0\u00f2\u00eeF\u009ccV]s\u0005H\u00e06\u00cc\u00fd\u00d1\u00da\u00d1\u00f3\u00e9beK_\u00d0\u00bf\u00a0\u0017r\u00b2}\u00f9\u00b9Qc\u00c3(\u00e7vQ~\\\u00059\u00d9\u00beh\u00f5?(\u000f\u00f1\r\u009b\u00ec\u0090\u008aY\u008e1~2\u001ee\u00a9CZ\\L\u00e6s)&_\u0087v\u0007\u0081\u00dc<\u00f6;\u00c6\u0014vf \u00ed\u001f\u00ed\u00c9\u00e9\u0081\u00edA\u0007\u00dfB\u0098\u0006\u00e9\u001f&\u0010\u001f\u0002?G\u008d\u00f3M.\u00e6\u00a1\u0092\u009a\u00c9\u00cc\u00a6\u0013\u00d0`\u00fc-J\u001e\u00ea\u00d2\u00b7\u00f7\u0011P\u00d9e\u0083\u001b\u00cd\u00fd]Z\u001cKv\u0085\u00ac\u00b6c\u009dca\u000b\u001b#\u0093\u00d2&\u0016\u0014\u00d5\u00c8\u0018\u00dfC\u001c-*\u00c5\u0089\u00b3\u00ce\u001f0\u00a0s\u00c41\u00e6(\u00be\u00d1\u001e\u001c\u000e\u00a2\u0010!\u0099\u00edV\f\u00ee\u0007\u00a7K\u00b5z\u00b7?\u00deZ\u00f3\u00f2.0\u00e0\u0007V\u00a2\u00a1<\u00b6A\u0085X!^\u00d535\u00b3\u00a9\u00c3\u0011\u0084X\u000b\u00b6;_\u00a5\u00da\u00cd\u00db#\u009e\u00e0@\u00fa_\u00e1\u00bf\u0016\u00b3##n\f\u0019{\u0013\u00e2X\u009c\u00eeZ\u00d3\u00a4\b\u00af\u00e8m\u00e9!B\u008el,M\u00baa)U\u00e2\u00bdfe\u00f7\u00e4\u00cb%#\u00d0\u00b5Xs`\u00d8{h\u00c3\u0017*\u00e9\u00ac\u00d2TJ\u0015\u009d63\u00ed\u00a7\u00e6\u00b7\u00ddCx\u0018_\u009b\"a\u00be{\u0012\u00ab6\u00d3v\u0095\u00c2\u0081-\u00c7\u0018#d\u00c4\u00ea\u0006m\u000e\u00c3\u00cfH'\u00fb<\u00ad\u0088";
                var5_15 = "\u00d4K\u00b7Hy\u0006\u00a5\u001a#(t\u00e3*\u00fcz\u0001Z\u00fe\u00d6\u00a1<\u0014b\u0014\fR\u00bb\u0007@\u0086\u00f4\u00ad\u00d0\u00c4\u00f8\u009f\u008d\u00ca/v\u000f\u0088\u00c8\u00b6yp\u00deCO\u0006\u00df\u00acW`\u00b9\u00b0\u00da\u0089\u0010\u001fFU\u00d4\u00b3a\u00b9$0\u00f2\u00eeF\u009ccV]s\u0005H\u00e06\u00cc\u00fd\u00d1\u00da\u00d1\u00f3\u00e9beK_\u00d0\u00bf\u00a0\u0017r\u00b2}\u00f9\u00b9Qc\u00c3(\u00e7vQ~\\\u00059\u00d9\u00beh\u00f5?(\u000f\u00f1\r\u009b\u00ec\u0090\u008aY\u008e1~2\u001ee\u00a9CZ\\L\u00e6s)&_\u0087v\u0007\u0081\u00dc<\u00f6;\u00c6\u0014vf \u00ed\u001f\u00ed\u00c9\u00e9\u0081\u00edA\u0007\u00dfB\u0098\u0006\u00e9\u001f&\u0010\u001f\u0002?G\u008d\u00f3M.\u00e6\u00a1\u0092\u009a\u00c9\u00cc\u00a6\u0013\u00d0`\u00fc-J\u001e\u00ea\u00d2\u00b7\u00f7\u0011P\u00d9e\u0083\u001b\u00cd\u00fd]Z\u001cKv\u0085\u00ac\u00b6c\u009dca\u000b\u001b#\u0093\u00d2&\u0016\u0014\u00d5\u00c8\u0018\u00dfC\u001c-*\u00c5\u0089\u00b3\u00ce\u001f0\u00a0s\u00c41\u00e6(\u00be\u00d1\u001e\u001c\u000e\u00a2\u0010!\u0099\u00edV\f\u00ee\u0007\u00a7K\u00b5z\u00b7?\u00deZ\u00f3\u00f2.0\u00e0\u0007V\u00a2\u00a1<\u00b6A\u0085X!^\u00d535\u00b3\u00a9\u00c3\u0011\u0084X\u000b\u00b6;_\u00a5\u00da\u00cd\u00db#\u009e\u00e0@\u00fa_\u00e1\u00bf\u0016\u00b3##n\f\u0019{\u0013\u00e2X\u009c\u00eeZ\u00d3\u00a4\b\u00af\u00e8m\u00e9!B\u008el,M\u00baa)U\u00e2\u00bdfe\u00f7\u00e4\u00cb%#\u00d0\u00b5Xs`\u00d8{h\u00c3\u0017*\u00e9\u00ac\u00d2TJ\u0015\u009d63\u00ed\u00a7\u00e6\u00b7\u00ddCx\u0018_\u009b\"a\u00be{\u0012\u00ab6\u00d3v\u0095\u00c2\u0081-\u00c7\u0018#d\u00c4\u00ea\u0006m\u000e\u00c3\u00cfH'\u00fb<\u00ad\u0088".length();
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
                    var4_14 = "j\u0005\\^\u00f8\u00b4\u00a3A\u009a\u00d4\u00c6\u0084\u00b4\u00c6\u0090z";
                    var5_15 = "j\u0005\\^\u00f8\u00b4\u00a3A\u009a\u00d4\u00c6\u0084\u00b4\u00c6\u0090z".length();
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
        _8m_0.l = var6_12;
        _8m_0.m = new Integer[53];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
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
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x5E2C;
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
                throw new RuntimeException("dev/krypton/8M", exception);
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
            _8m_0.g[n2] = _8m_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _8m_0.b(n, l2);
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
            throw new RuntimeException("dev/krypton/8M" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int d(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x4C3;
        if (m[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = l[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])_8m_0.n.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    _8m_0.n.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/8M", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _8m_0.m[n2] = n3;
        }
        return m[n2];
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _8m_0.d(n, l2);
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
            throw new RuntimeException("dev/krypton/8M" + " : " + string + " : " + methodType.toString(), exception);
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
            case 0 -> 16;
            case 1 -> 45;
            case 2 -> 51;
            case 3 -> 32;
            case 4 -> 17;
            case 5 -> 18;
            case 6 -> 5;
            case 7 -> 50;
            case 8 -> 10;
            case 9 -> 23;
            case 10 -> 63;
            case 11 -> 20;
            case 12 -> 31;
            case 13 -> 49;
            case 14 -> 12;
            case 15 -> 8;
            case 16 -> 0;
            case 17 -> 6;
            case 18 -> 19;
            case 19 -> 47;
            case 20 -> 57;
            case 21 -> 48;
            case 22 -> 21;
            case 23 -> 14;
            case 24 -> 2;
            case 25 -> 27;
            case 26 -> 61;
            case 27 -> 41;
            case 28 -> 11;
            case 29 -> 60;
            case 30 -> 15;
            case 31 -> 9;
            case 32 -> 25;
            case 33 -> 7;
            case 34 -> 35;
            case 35 -> 4;
            case 36 -> 37;
            case 37 -> 36;
            case 38 -> 38;
            case 39 -> 33;
            case 40 -> 59;
            case 41 -> 13;
            case 42 -> 58;
            case 43 -> 30;
            case 44 -> 52;
            case 45 -> 1;
            case 46 -> 55;
            case 47 -> 3;
            case 48 -> 62;
            case 49 -> 54;
            case 50 -> 28;
            case 51 -> 42;
            case 52 -> 39;
            case 53 -> 34;
            case 54 -> 46;
            case 55 -> 26;
            case 56 -> 40;
            case 57 -> 53;
            case 58 -> 29;
            case 59 -> 43;
            case 60 -> 22;
            case 61 -> 56;
            case 62 -> 44;
            default -> 24;
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
        _8m_0.r[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = q;
        q[0] = "{t^>1[fa\\\u007f4\u0007'\\";
        objectArray[1] = ".|}\u001flp0tgP\u0011`0";
        objectArray[2] = Integer.TYPE;
        _8m_0.r[2] = "java/lang/Integer";
        objectArray[3] = "T-:+\u0013\tI88j\u0016U\u0007\u001e";
        objectArray[4] = "qwi\u000f\u0016*\u0004Wb\u0000\u0007eeYi\u000b\u0003?\u0011";
        objectArray[5] = Boolean.TYPE;
        _8m_0.r[5] = "java/lang/Boolean";
        objectArray[6] = "\bA@A;|\u0015TB\u0000> ^";
        objectArray[7] = "fA\u0017r\u000e#{T\u00153\u000b\u007f;i";
        objectArray[8] = "\u001aP\u0012LL#\u0007E\u0010\rI\u007fGw";
        objectArray[9] = "x|q,f+\r\\z#wdlRq(s>\u0018";
        objectArray[10] = Void.TYPE;
        _8m_0.r[10] = "java/lang/Void";
        objectArray[11] = "AOx\u0005`cAOoYll[\u0004oGly\\u=\u001a4:\u0017";
        objectArray[12] = "?Hj^\t_?H}\u0002\u0005P%\u0003}\u001c\u0005E\"r-AT";
        objectArray[13] = "K.\u0006\u00194;>\u000e\r\u0016%t_\u0000\u0006\u001d!.+";
        objectArray[14] = "yKc`D,yKt<H#c\u0000t\"H6dq#}\u001e";
        objectArray[15] = "g%o@2'z0m\u00017{;%";
        objectArray[16] = "l\u001doHQ\u000bq\bm\tTW0:";
        objectArray[17] = "`f\fvlNki\u001d9\u000fC~o";
        objectArray[18] = "s.nD2Y\u0006\u000eeK#\u0016g\u0000n@'L\u0013";
        objectArray[19] = "\u001e\\zK{I\u0000T`\u0004\u0019U\u0007I";
        objectArray[20] = "*CD2\u0017\u00117VFs\u0012Mv\u0011";
        objectArray[21] = "\u001c\\W.5mi|\\!$\"\brW* x|";
        objectArray[22] = "k\u001b\u001a\u0003U8`\u0014\u000bL46k\u001f\u000f\u0016";
        objectArray[23] = Double.TYPE;
        _8m_0.r[23] = "java/lang/Double";
        objectArray[24] = "2[\u0016P\u0017\u0006G{\u001d_\u0006I&u\u0016T\u0002\u0013R";
        objectArray[25] = Float.TYPE;
        _8m_0.r[25] = "java/lang/Float";
        objectArray[26] = "-N%$BlXn.+S#9`% WyM";
        objectArray[27] = "w%Hy!nj0J8$2%:";
        objectArray[28] = "f!Yp\u00068f!N,\n7|jN2\n\"{\u001b\u001fl_i";
        objectArray[29] = "#\u0013JLT\u001cV3ACES7=JHA\tC";
        objectArray[30] = "g47\u0017E*\u0012\u0014<\u0018Tes\u001a7\u0013P?\u0007";
        objectArray[31] = "u\ri\u0000o/\u0000-b\u000f~`a#i\u0004z:\u0015";
        objectArray[32] = "\u0018\u0005,{t\u0006m%'teI\f+,\u007fa\u0013x";
        objectArray[33] = "$VJm\u0011L$V]1\u001dC>\u001d]/\u001dV9l\u000ftE\u0017";
        objectArray[34] = "\u0018)p#/$m\t{,>k\f\u0007p':1x";
        objectArray[35] = "\u007fXld~\u0012\nxgko]kvl`k\u0007\u001f";
        objectArray[36] = "-4r\u007fINX\u0014ypX\u00019\u001ar{\\[M";
        objectArray[37] = "B \rJ0Q7\u0000\u0006E!\u001eV\u000e\rN%D\"";
        objectArray[38] = "\u0010\u001d,\u0002]Y\u0010\u001d;^QV\nV;@QC\r'i\u001d\t\u0000G";
        objectArray[39] = "9qYG\ff2~H\bq~!yAA";
        objectArray[40] = "\u001bkn\f\u0014`\u0010d\u007fCyd\u0010xK\bKy\u0014d{\b";
        objectArray[41] = "\u000f\u0007!\u001b+\u0006\u0012\u0012#Z.Z_4";
        objectArray[42] = "uEn\u0011n4\u0000ee\u001e\u007f{akn\u0015{!\u0015";
        objectArray[43] = ":s\"\u0000V>OS)\u000fGq.]\"\u0004C+Z";
        objectArray[44] = "\bQG_NN}qLP_\u0001\u001c\u007fG[[[h";
        objectArray[45] = "6:(\u0002\u000f_(22MR^.>?\u000e\u000fy();\u0002L";
        objectArray[46] = "y#@r*\u0016g+Z=b\u0016}!Bzk\r=\u0012Dv`\np#Bv";
        objectArray[47] = "\u0000\fb\u0004\u00004u,i\u000b\u0011{\u0014\"b\u0000\u0015!`";
        objectArray[48] = "w~~`eJivd/8Kozile|rsdd(Krm";
        objectArray[49] = "QFONo+ONU\u00012*IBXBo\u001dTKUJ\"*TUJ";
        objectArray[50] = "@7\u000f\u0010>8C._D_||p\u000f\u00115=\fvQB.";
        objectArray[51] = "\u00065\u0006j\u001c\u001c\t`T+'Uo0\u000fk\u0016\u0017U<\u00072^";
        objectArray[52] = "+$zGi\npleW\u0010\f)l\u0018\u0007nP#,'A!\u0013%\u001c!@)\np#g\u000fj\f@%f\u0007sY\u007fc)Dui";
        objectArray[53] = "sE8v]r|\u0010j7f<\u001aZj0\u0014k~O4w\u0002\u0002$Z)?\tmvM= f";
        objectArray[54] = "[`\rNVY]5\u0016!W_>g\u000eX\tGD:\u000bEZ";
        objectArray[55] = "2\")7QF=w{vj\f\u001aM-kP\u0007 w!c\tO";
        objectArray[56] = "a2Fq\u0002Dgg]\u001e\u000e+='\u0018}\u0003\u0014{h[{";
        objectArray[57] = "=WE\u007fHV;\u0002^\u0010IIXPFi\u0017H\"\rCtD";
        objectArray[58] = ";&\u007fv7?f#b%F*:>\u0006!8|4r9gw?2Bht'.)$}sy>W";
        objectArray[59] = "s\u0006\u0002\u001c,Y'T]\u0018\\\u0002IJ\u0000\\.Z-_^\u001b83rEWYmA4\u0004B\u001c\\";
        objectArray[60] = ":XbmC\fa\u0010}}:\u0004<\u0001d\u0014U\u0002;\u001e`(D\u001f4\u0006\u0000{W\u0005/\u0000<jJ\n7`";
        objectArray[61] = "\u0015Y\u0016}\u000bSN\u0011\tmrU\u001f\u0007t=\f\t\u001dQK{CJ\u001baMzKSN^\u000b5\bU~X\n=\u0011\u0000A\u001eE~\u00170";
        objectArray[62] = "ih1\u00111\u0017f=cP\nY\u0000>!\u0013iW?xnPo";
        objectArray[63] = "Lo\u0016 .V\u0018=I$^\u0004v#\u0014`,U\u00126J':<M,CeoN\u000bmV ^";
        objectArray[64] = "%sONi\fe.\u000e\u0007T\u0010xhPP8\",)\b\bT\u001c~d\b\\(\fje\b7j\u0005jf_X8\u0012~y0";
        objectArray[65] = "t\"\bi\u000fB/j\u0017yvDvjjp\u0004Qg~\flK\u001c.\u001a\nb\u0006Y{|\u0016-K\u0010\u001fz\u0018`\u000eEyfW-G!";
        objectArray[66] = "\n%\n]z\u0000\u0019wD@\u0014U\u0004H\u0005\u0011i\u0018\u000e,\u0010O.\u000egv\u0005Rf\u0005\b$\u0012Fyj";
        objectArray[67] = "/\u00018~!Hv\u0004.a\u001c\u001eN\u00191=b^!\u0001-kn.";
        objectArray[68] = "C+X&G3L~\ng|~*4\n`\u000e*N!T'\u0018C\u0013:\u000f~L|UuLx|";
        objectArray[69] = ":\u0019\tx\u0005E<L\u0012\u0017\n*/N\u0013e]N:\u0010Ts4\u0013!K\r'\u000bUn\b\u000b\u0017";
        objectArray[70] = "nm\u00173:Y17U QW07W*0Z,QE/0W)7P(nGWjT()\r%,\u0015=l<";
        objectArray[71] = "L\nn\t\u0018\u0004\u0013P,\u001as\n\u0011[;\u0003s_\u0005I \u0016\u001c\r\u0012]?y";
        objectArray[72] = "$@\u000e\u0003hy7\u0012@\u001e\u0006/I]M\u000etz-H\u0013Ib\u0013&@\u001b\rf/7]\u0014\u0015\u0006";
        objectArray[73] = "h4\u0016A0\u0000bcI\u001f\\\\i\u0010M\b L\u0012fW\u001b$\f` \u0016\u000ea=";
        objectArray[74] = "&)u~\u00019r{*zqc\u001cew>\u0003:xp)y\u0015S\"e41\u001e<pr .q";
        objectArray[75] = "3%\u0002p$\u0018gw]tTI\ti\u00000&\u001bm|^w0rsp\u0002|8Oy']\"T";
        objectArray[76] = "S5k,7tYb4r[5N\u00182b63b5.p[3@bdqf9\u0017=:\u001d";
        objectArray[77] = "\u0016\u001cc\u0004bP\u0012\u0002n\f\u000f\u0006\b\u0015{53R^@\u0003\rb\u0007\u0011\u0010?\u001c\u007f\b\tp";
        objectArray[78] = "\u0005B\u0010RB@\u001d^F^2J\nGIK^xW\u0000\u0019\u001d2I\u000bC\u0015]M\u0012ZUX,";
        objectArray[79] = "{%O\u000fs=}pT`}R'0\u0011\u0003rma\u007fR\u0005";
        objectArray[80] = "MX\u001e\\\u000b#_ECNapRFZN\u001b\u001eL\u001aJH\u0010|LIV\u0018a`I\u001aYI\\rTGK#";
        objectArray[81] = "r\u001e\nqZ-s\u001f\u0005s(+\u000eI\u000evFet\u0014\u000bk\u0015";
        objectArray[82] = "y|r\u0001y\u0013\u007f)ins|%+)\u001e#\u0019zqk\r";
        objectArray[83] = "j=C@)Kyo\r]G\u001f7PL\f:Sn4YR}E\u0007nLO5Nh<[[*!";
        objectArray[84] = "#.\u001e\u007f\u001ax|t\\lqtv~\"a\u001d|qlDt\u001a\"a\u0012\u0019p\u001ae+`_1\u000f \u001a";
        objectArray[85] = "S}9\u000bL\u0003\\(kJwI:bkM\u0005\u001a^w5\n\u0013s\u0001m<HF\u0001G,)\rw";
        objectArray[86] = "A\u0000.\tb\u0012KWqW\u000eD\\\u000flQoI@ijEkS\u0001\u0006\u007fZ1\u0017;RoSv\u001eI\u0014.F3/";
        objectArray[87] = "Ae9\u0015,@G0\"z,/\u0019ho\u0007fPNm:\u0015";
        objectArray[88] = "TG2,\u0010d\u000b\u001dp?{{\u0000\u001ei\"\u0016\u0001\u0003\u0017o7\u0005g\u0016\u00101'{:\u0012\u0010vm\t|S\u00053\\";
        objectArray[89] = "f\u0004T4\u0016KiQ\u0006u-\u0007\u000fRD6N\u000b0\u0014\u000buH";
        objectArray[90] = "fq\u000b\u000en\u0000i$YOU@\u000ft\u0002\u000fd\u000b5x\nV,";
        objectArray[91] = "|Fe\u0019p\u0010!CxJ\u0001\u0011lXq\u001edjnX$\bkW|Ey\u001a\u0001";
        objectArray[92] = "\"7{e-%}m9vF;zy*\u0015\u007f>\"hw*9qanG";
        objectArray[93] = "z\u000f\b\u001a.U)\\\u001d@H^'B\u0002\u0019$lu\u0002XDx;s@[\u001dx\u00045\u000f\u0018\u001bH";
        objectArray[94] = "\u000b(B2>\u001b\r}Y]5tT\u007f\u001b`\u007f\u001e\u0000-Dd";
        objectArray[95] = ")\u001b=\u0004\u0005\u0003&NoE>C@\u0004oBL\u001a$\u00111\u0005Zs~\u0004,MQ\u001c,\u00138R>";
        objectArray[96] = "\\2 ge[\u00017=4\u0014ZQ$4\t-_\t5i6k\u0010J3Y";
        objectArray[97] = "}\u001ez\u0012ST \u001bgA\"Oj7f\u0004^_\u0011A|\u0017Z\u001fc\u0007=\u0002\u001f.";
        objectArray[98] = "\u0013SV*\u000fM[RU|i\u000e\u0005rX<\u0015r\u0012T\u0003+\n\u001d\r\n\u0001{i";
        objectArray[99] = "ORikZ\b@\u0007;*aE&M;-\u0013\u0011BXej\u0005xLZ=a\u001aB@Rd)a";
        objectArray[100] = "y/wz!^\u007fzl\u0015!1lxmgyUy&*q\u0010\bb}s%/N->u\u0015";
        objectArray[101] = "'XP|d\bp]\u0005n\u001fF\u001aN]|m\u001e~[\u0003;{w$N\u001esp\u0018vY\nl\u001f";
        objectArray[102] = "*$\u0019]\u001az)=I\t{?U^\u0014LJmw\"\u0017U\u001a9";
        objectArray[103] = "f\u00040]v\f`Q+2\u007fc:\u0011nQw\\|^-W";
        objectArray[104] = "8\u0012/3r\u0000a\u00179,O]Y\u00126w~\nd\u0018a( f";
        objectArray[105] = "\u0011\u0015W*n\u0013EG\b.\u001eE+YUjl\u0010OL\u000b-zy\u0015Y\u0016eq\u0016GN\u0002z\u001e";
        objectArray[106] = "*\u0018u\u0005\bS}\u001d \u0017s\u0010\u0017\u000ex\u0005\u0001Es\u001b&B\u0017,.Bx\b\u0018Iq\u0018:\u001bs";
        objectArray[107] = ")\u000eV~L\u0016;\u0013\u000bl&@0\u0010\nlMWW\u0004\f;JH8\u001bR9\u001a+9\u0018\u000fjXM,\u001fQz&";
        objectArray[108] = "\u0005LE\u001bR*\u0006U\u0015O3ob6D\u0017L/\u0004O\u0004J\rf";
        objectArray[109] = "\u0017\u001b=PA2\u0013\u00050X,d\t\u0012%a\u00100_F]YAe\u0010\u0017aH\\j\bw";
        objectArray[110] = "6\u0013,\u007fOu%Abb!/[\u000eorSv?\u001b15E\u001f4\u00139qA#%\u000e6i!";
        Object[] objectArray2 = objectArray;
        objectArray[111] = "uk\u0001%?6!9^!Om\u000eWO$2.&3Zzu8OiOg=3 ;Xs\"\\";
    }

    private static Class f(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _8m_0.e(l2, l3);
            object = q[n];
            try {
                if (!(object instanceof String)) break block2;
                _8m_0.q[n] = clazz = Class.forName(r[n]);
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
        Field field = _8m_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _8m_0.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field g(long l2, long l3) {
        int n = _8m_0.e(l2, l3);
        Object object = q[n];
        if (object instanceof String) {
            String string = r[n];
            int n2 = string.indexOf(8);
            Class clazz = _8m_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _8m_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _8m_0.c(clazz3, string2, clazz2)) != null) {
                    _8m_0.q[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _8m_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _8m_0.q[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _8m_0.f(1561512369569752L, 0L);
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
        Method method = _8m_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _8m_0.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method h(long l2, long l3) {
        int n = _8m_0.e(l2, l3);
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
                clazz3 = _8m_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _8m_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _8m_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _8m_0.q[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _8m_0.f(1561512369569752L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _8m_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _8m_0.q[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _8m_0.f(1561512369569752L, 0L);
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
            if (c == '\u00c3' || c == '\u00d1' || c == 'p' || c == '\u00e2') {
                field = _8m_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c3' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d1' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'p' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _8m_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _8m_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8M" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_8m_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_8m_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_8m_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

