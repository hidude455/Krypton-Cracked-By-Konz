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
import dev.krypton._0Q;
import dev.krypton._6_;
import dev.krypton._7V;
import dev.krypton._8e;
import dev.krypton._90;
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
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_11905;
import net.minecraft.class_11908;
import net.minecraft.class_11909;

public class _8u
extends _8e {
    private final _90 cfr_renamed_54;
    private final int cfr_renamed_6;
    private final int cfr_renamed_9;
    private final int cfr_renamed_3;
    private final int cfr_renamed_56;
    private final int cfr_renamed_1;
    private final _7V cfr_renamed_8;
    private List cfr_renamed_4;
    private int cfr_renamed_482;
    private static final long b;
    private static final String[] f;
    private static final String[] g;
    private static final Map h;
    private static final long[] l;
    private static final Integer[] m;
    private static final Map n;
    private static final Object[] q;
    private static final String[] r;

    public _8u(int n, int n2, _0Q q, char c, _90 var5_5) {
        long l2;
        long l3 = l2 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)c << 48 >>> 48) ^ b;
        long l4 = l3 ^ 0x4888C6F8AEF3L;
        long l5 = l3 ^ 0x3D881CA27219L;
        long l6 = l3 ^ 0x7AABBCF9F7D3L;
        long l7 = l3 ^ 0x66FAD9278C11L;
        super((String)((Object)_8u.b("c", 31267, (long)(0x2261CF3671393111L ^ l2))));
        this.cfr_renamed_6 = (int)_8u.d("q", 8062, (long)(0x7EA37FA2EB82212FL ^ l2));
        this.cfr_renamed_9 = (int)_8u.d("q", 16341, (long)(0x70B95369B31101AEL ^ l2));
        this.cfr_renamed_3 = (int)_8u.d("q", 29220, (long)(0x72FB11E46A34C65L ^ l2));
        this.cfr_renamed_56 = (int)_8u.d("q", 13606, (long)(0x60CFC1A695E88B5CL ^ l2));
        this.cfr_renamed_1 = (int)_8u.d("q", 16341, (long)(0x70B95369B31101AEL ^ l2));
        this.cfr_renamed_8 = new _7V(l5);
        _8u.f("\u00d2", (Object)this, (int)_8u.d("q", 9394, (long)(0x1CEB57D0F7BE9AF2L ^ l2)), -853996519659481305L, (long)l2);
        this.cfr_renamed_54 = var5_5;
        _8u.f("\u00d2", (Object)this, new ArrayList(_8u.f("\u00db", -847812786399953459L, (long)l2)), -855198442633744698L, (long)l2);
        Object[] objectArray = new Object[2];
        objectArray[1] = _8u.b("c", 21776, (long)(0x76008516EB41E23L ^ l2));
        objectArray[0] = l4;
        _8u.f("\u00e4", (Object)_8u.f("c", (Object)this, -853569028135623318L, (long)l2), (Object)objectArray, -854259831057075492L, (long)l2);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = () -> this.cfr_renamed_1(l7);
        objectArray2[0] = l6;
        _8u.f("\u00e4", (Object)_8u.f("c", (Object)this, -853569028135623318L, (long)l2), (Object)objectArray2, -855122057204238100L, (long)l2);
    }

    @Override
    protected int int_6(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return (int)_8u.d("q", 18706, (long)(0x1F2FDF4FF6E97F69L ^ l2));
    }

    @Override
    protected int int_9(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return (int)_8u.d("q", 11789, (long)(0x49F5FF927FC8799EL ^ l2));
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void cfr_renamed_9(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [33[DOLOOP], 32[FORLOOP]], but top level block is 15[TRYBLOCK]
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
        reference v22;
        block54: {
            block55: {
                CallSite callSite;
                boolean bl2;
                reference var28_18;
                reference var27_17;
                CallSite callSite2;
                CallSite callSite3;
                CallSite callSite4;
                long l2;
                long l3;
                long l4;
                block52: {
                    block53: {
                        long l5;
                        block50: {
                            reference var35_26;
                            CallSite callSite5;
                            CallSite callSite6;
                            reference var29_19;
                            block51: {
                                long l6;
                                block48: {
                                    reference var34_25;
                                    block49: {
                                        block46: {
                                            reference var33_24;
                                            block47: {
                                                long l7 = l4 = b ^ 0x1738FCA3F517L;
                                                l3 = l7 ^ 0x159C5336DBDBL;
                                                long l8 = l7 ^ 0x35493B75040L;
                                                l5 = l7 ^ 0x13E14AE5F776L;
                                                long l9 = l7 ^ 0x7578C16531A9L;
                                                l2 = l7 ^ 0x5E5248DB4E9CL;
                                                l6 = l7 ^ 0x45F44B64886DL;
                                                long l10 = l7 ^ 0x776EF5D403C2L;
                                                long l11 = l7 ^ 0x3EA85CCDA2FBL;
                                                Object[] objectArray = new Object[2];
                                                objectArray[1] = l10;
                                                objectArray[0] = (double)_8u.f("\u00e4", (Object)class_119092, -6021427613700863308L, (long)l4);
                                                callSite4 = _8u.f("\u00e4", (Object)this, (Object)objectArray, -6022057399645862733L, (long)l4);
                                                Object[] objectArray2 = new Object[2];
                                                objectArray2[1] = l10;
                                                objectArray2[0] = (double)_8u.f("\u00e4", (Object)class_119092, -6024311236047268886L, (long)l4);
                                                callSite3 = _8u.f("\u00e4", (Object)this, (Object)objectArray2, -6022057399645862733L, (long)l4);
                                                Object[] objectArray3 = new Object[1];
                                                objectArray3[0] = l8;
                                                callSite2 = _8u.f("\u00e4", (Object)this, (Object)objectArray3, -6022410580605980839L, (long)l4);
                                                Object[] objectArray4 = new Object[1];
                                                objectArray4[0] = l9;
                                                CallSite callSite7 = _8u.f("\u00e4", (Object)this, (Object)objectArray4, -6022220211763094513L, (long)l4);
                                                Object[] objectArray5 = new Object[1];
                                                objectArray5[0] = l11;
                                                CallSite callSite8 = _8u.f("\u00e4", (Object)this, (Object)objectArray5, -6024556769487110499L, (long)l4);
                                                var27_17 = _8u.f("c", (Object)this, -6023299895508749395L, (long)l4) + callSite8 + true;
                                                var28_18 = callSite7 - callSite8 - true;
                                                var29_19 = var27_17 + var28_18 - _8u.d("q", 26474, (long)(0x4A553FD61F5B8145L ^ l4));
                                                bl2 = _02.cfr_renamed_3();
                                                callSite6 = _8u.d("q", 25425, (long)(0x7BE8C6504B008546L ^ l4));
                                                callSite5 = _8u.d("q", 13606, (long)(0x60CFDB7F930DD316L ^ l4));
                                                reference var32_23 = _8u.f("c", (Object)this, -6020336015127169581L, (long)l4) + callSite2 - callSite6 - _8u.d("q", 27075, (long)(0x5B30C31B67810FD3L ^ l4));
                                                var33_24 = var32_23 - callSite6 - _8u.d("q", 16341, (long)(0x70B949B0B5F459E4L ^ l4));
                                                var34_25 = var33_24 - callSite6 - _8u.d("q", 16341, (long)(0x70B949B0B5F459E4L ^ l4));
                                                var35_26 = var34_25 - callSite6 - _8u.d("q", 16341, (long)(0x70B949B0B5F459E4L ^ l4));
                                                try {
                                                    try {
                                                        Object[] objectArray6 = new Object[7];
                                                        objectArray6[6] = (int)callSite5;
                                                        objectArray6[5] = (int)callSite6;
                                                        objectArray6[4] = (int)var29_19;
                                                        objectArray6[3] = (int)var32_23;
                                                        objectArray6[2] = (double)callSite3;
                                                        objectArray6[1] = (double)callSite4;
                                                        objectArray6[0] = l2;
                                                        callSite = _8u.f("\u00e4", (Object)this, (Object)objectArray6, -6023451251394565080L, (long)l4);
                                                        if (!bl2) break block46;
                                                        if (callSite == false) break block47;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _8u.a(matchException);
                                                    }
                                                    _8u.f("\u00e4", (Object)_8u.f("\u00db", -6024427083976449259L, (long)l4), (Object)_8u.f("c", (Object)_8u.f("\u00db", -6022600708328538384L, (long)l4), -6021133794571211845L, (long)l4), -6020249276419438187L, (long)l4);
                                                    return true;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _8u.a(matchException);
                                                }
                                            }
                                            Object[] objectArray = new Object[7];
                                            objectArray[6] = (int)callSite5;
                                            objectArray[5] = (int)callSite6;
                                            objectArray[4] = (int)var29_19;
                                            objectArray[3] = (int)var33_24;
                                            objectArray[2] = (double)callSite3;
                                            objectArray[1] = (double)callSite4;
                                            objectArray[0] = l2;
                                            callSite = _8u.f("\u00e4", (Object)this, (Object)objectArray, -6023451251394565080L, (long)l4);
                                        }
                                        try {
                                            try {
                                                if (!bl2) break block48;
                                                if (callSite == false) break block49;
                                            }
                                            catch (MatchException matchException) {
                                                throw _8u.a(matchException);
                                            }
                                            _8u.f("\u00e4", (Object)_8u.f("\u00db", -6024427083976449259L, (long)l4), (Object)_8u.f("c", (Object)_8u.f("\u00db", -6022600708328538384L, (long)l4), -6021133794571211845L, (long)l4), -6020249276419438187L, (long)l4);
                                            return true;
                                        }
                                        catch (MatchException matchException) {
                                            throw _8u.a(matchException);
                                        }
                                    }
                                    Object[] objectArray = new Object[7];
                                    objectArray[6] = (int)callSite5;
                                    objectArray[5] = (int)callSite6;
                                    objectArray[4] = (int)var29_19;
                                    objectArray[3] = (int)var34_25;
                                    objectArray[2] = (double)callSite3;
                                    objectArray[1] = (double)callSite4;
                                    objectArray[0] = l2;
                                    callSite = _8u.f("\u00e4", (Object)this, (Object)objectArray, -6023451251394565080L, (long)l4);
                                }
                                try {
                                    try {
                                        if (!bl2) break block50;
                                        if (callSite == false) break block51;
                                    }
                                    catch (MatchException matchException) {
                                        throw _8u.a(matchException);
                                    }
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l6;
                                    _8u.f("\u00e4", (Object)_8u.f("c", (Object)this, -6022665360217957489L, (long)l4), (Object)objectArray, -6024402079738988445L, (long)l4);
                                    return true;
                                }
                                catch (MatchException matchException) {
                                    throw _8u.a(matchException);
                                }
                            }
                            Object[] objectArray = new Object[7];
                            objectArray[6] = (int)callSite5;
                            objectArray[5] = (int)callSite6;
                            objectArray[4] = (int)var29_19;
                            objectArray[3] = (int)var35_26;
                            objectArray[2] = (double)callSite3;
                            objectArray[1] = (double)callSite4;
                            objectArray[0] = l2;
                            callSite = _8u.f("\u00e4", (Object)this, (Object)objectArray, -6023451251394565080L, (long)l4);
                        }
                        try {
                            try {
                                if (!bl2) break block52;
                                if (callSite == false) break block53;
                            }
                            catch (MatchException matchException) {
                                throw _8u.a(matchException);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l5;
                            _8u.f("\u00e4", (Object)_8u.f("\u00e4", (Object)_8u.f("c", (Object)this, -6022665360217957489L, (long)l4), (Object)objectArray, -6020414728847897395L, (long)l4), -6021941365092958002L, (long)l4);
                            return true;
                        }
                        catch (MatchException matchException) {
                            throw _8u.a(matchException);
                        }
                    }
                    callSite = _8u.f("c", (Object)this, -6020336015127169581L, (long)l4) + _8u.d("q", 27075, (long)(0x5B30C31B67810FD3L ^ l4));
                }
                CallSite callSite9 = callSite;
                reference var37_28 = var27_17 + _8u.d("q", 17333, (long)(0x5ADB076716C225B6L ^ l4));
                reference var38_29 = var37_28 + _8u.d("q", 13606, (long)(0x60CFDB7F930DD316L ^ l4)) + _8u.d("q", 15841, (long)(0x6979B452607A5BFCL ^ l4));
                reference var39_30 = callSite2 - _8u.d("q", 22189, (long)(0x5F6C3460ADD030AAL ^ l4));
                reference var40_31 = var28_18 - (var38_29 - var27_17) - _8u.d("q", 15799, (long)(0x5D336D4DD6445BB3L ^ l4));
                try {
                    Object[] objectArray = new Object[7];
                    objectArray[6] = (int)var40_31;
                    objectArray[5] = (int)var39_30;
                    objectArray[4] = (int)var38_29;
                    objectArray[3] = (int)callSite9;
                    objectArray[2] = (double)callSite3;
                    objectArray[1] = (double)callSite4;
                    objectArray[0] = l2;
                    v22 = _8u.f("\u00e4", (Object)this, (Object)objectArray, -6023451251394565080L, (long)l4);
                    if (!bl2) break block54;
                    if (v22 == false) break block55;
                }
                catch (MatchException matchException) {
                    throw _8u.a(matchException);
                }
                reference var41_32 = _8u.f("c", (Object)this, -6021343034453291155L, (long)l4) * 3;
                reference var42_33 = callSite4 - callSite9 - 5;
                reference var43_34 = callSite3 - var38_29 - 5;
                reference var44_35 = var42_33 / _8u.d("q", 12065, (long)(0x35BFAC197139C917L ^ l4));
                reference var45_36 = var43_34 / _8u.d("q", 22189, (long)(0x5F6C3460ADD030AAL ^ l4));
                try {
                    try {
                        try {
                            v22 = var44_35;
                            if (!bl2) break block54;
                            if (v22 < 0) break block55;
                        }
                        catch (MatchException matchException) {
                            throw _8u.a(matchException);
                        }
                        v22 = var44_35;
                        if (!bl2) break block54;
                    }
                    catch (MatchException matchException) {
                        throw _8u.a(matchException);
                    }
                    if (v22 >= 3) break block55;
                }
                catch (MatchException matchException) {
                    throw _8u.a(matchException);
                }
                reference var46_37 = var41_32 + var45_36 * 3 + var44_35;
                try {
                    try {
                        try {
                            v22 = var46_37;
                            if (!bl2) break block54;
                            if (v22 < 0) break block55;
                        }
                        catch (MatchException matchException) {
                            throw _8u.a(matchException);
                        }
                        v22 = var46_37;
                        if (!bl2) break block54;
                    }
                    catch (MatchException matchException) {
                        throw _8u.a(matchException);
                    }
                    if (v22 >= _8u.f("\u00e4", (Object)_8u.f("c", (Object)this, -6022540490661136756L, (long)l4), -6022955819323683804L, (long)l4)) break block55;
                }
                catch (MatchException matchException) {
                    throw _8u.a(matchException);
                }
                reference var47_38 = var44_35 * _8u.d("q", 12065, (long)(0x35BFAC197139C917L ^ l4));
                reference var48_39 = var45_36 * _8u.d("q", 22189, (long)(0x5F6C3460ADD030AAL ^ l4));
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                v22 = var42_33;
                                                if (!bl2) break block54;
                                                if (v22 < var47_38) break block55;
                                            }
                                            catch (MatchException matchException) {
                                                throw _8u.a(matchException);
                                            }
                                            v22 = var42_33;
                                            if (!bl2) break block54;
                                        }
                                        catch (MatchException matchException) {
                                            throw _8u.a(matchException);
                                        }
                                        if (v22 > var47_38 + _8u.d("q", 29220, (long)(0x72FABC74046142FL ^ l4))) break block55;
                                    }
                                    catch (MatchException matchException) {
                                        throw _8u.a(matchException);
                                    }
                                    v22 = var43_34;
                                    if (!bl2) break block54;
                                }
                                catch (MatchException matchException) {
                                    throw _8u.a(matchException);
                                }
                                if (v22 < var48_39) break block55;
                            }
                            catch (MatchException matchException) {
                                throw _8u.a(matchException);
                            }
                            v22 = var43_34;
                            if (!bl2) break block54;
                        }
                        catch (MatchException matchException) {
                            throw _8u.a(matchException);
                        }
                        if (v22 > var48_39 + _8u.d("q", 13606, (long)(0x60CFDB7F930DD316L ^ l4))) break block55;
                    }
                    catch (MatchException matchException) {
                        throw _8u.a(matchException);
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l3;
                    objectArray[0] = (_6_)((Object)_8u.f("\u00e4", (Object)_8u.f("c", (Object)this, -6022540490661136756L, (long)l4), (int)var46_37, -6020739409902867665L, (long)l4));
                    _8u.f("\u00e4", (Object)_8u.f("c", (Object)this, -6022665360217957489L, (long)l4), (Object)objectArray, -6021730921840135454L, (long)l4);
                    return true;
                }
                catch (MatchException matchException) {
                    throw _8u.a(matchException);
                }
            }
            v22 = (reference)super.method_25402(class_119092, bl);
        }
        return (boolean)v22;
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        Object object;
        block12: {
            block13: {
                double d5;
                block17: {
                    block16: {
                        CallSite callSite;
                        boolean bl;
                        long l2;
                        block14: {
                            long l3 = l2 = b ^ 0x29AA75E4BFC3L;
                            long l4 = l3 ^ 0x3DC61AF01A94L;
                            long l5 = l3 ^ 0x4BEA48227B7DL;
                            long l6 = l3 ^ 0x60C0C19C0448L;
                            long l7 = l3 ^ 0x49FC7C934916L;
                            long l8 = l3 ^ 0x3AD58AE82FL;
                            Object[] objectArray = new Object[2];
                            objectArray[1] = l7;
                            objectArray[0] = d;
                            d = (double)_8u.f("\u00e4", (Object)this, (Object)objectArray, -1821314481190351257L, (long)l2);
                            Object[] objectArray2 = new Object[2];
                            objectArray2[1] = l7;
                            objectArray2[0] = d2;
                            d2 = (double)_8u.f("\u00e4", (Object)this, (Object)objectArray2, -1821314481190351257L, (long)l2);
                            Object[] objectArray3 = new Object[1];
                            objectArray3[0] = l4;
                            CallSite callSite2 = _8u.f("\u00e4", (Object)this, (Object)objectArray3, -1821662143394978419L, (long)l2);
                            Object[] objectArray4 = new Object[1];
                            objectArray4[0] = l5;
                            CallSite callSite3 = _8u.f("\u00e4", (Object)this, (Object)objectArray4, -1821433313078176037L, (long)l2);
                            Object[] objectArray5 = new Object[1];
                            objectArray5[0] = l8;
                            CallSite callSite4 = _8u.f("\u00e4", (Object)this, (Object)objectArray5, -1823879667110841271L, (long)l2);
                            reference var25_14 = _8u.f("c", (Object)this, -1820353397072922247L, (long)l2) + callSite4 + true;
                            reference var26_15 = callSite3 - callSite4 - true;
                            reference var27_16 = var25_14 + _8u.d("q", 17333, (long)(0x5ADB39F59F856F62L ^ l2));
                            reference var28_17 = _8u.f("c", (Object)this, -1826413229868450041L, (long)l2) + _8u.d("q", 27075, (long)(0x5B30FD89EEC64507L ^ l2));
                            reference var29_18 = var27_16 + _8u.d("q", 13606, (long)(0x60CFE5ED1A4A99C2L ^ l2)) + _8u.d("q", 15841, (long)(0x69798AC0E93D1128L ^ l2));
                            reference var30_19 = callSite2 - _8u.d("q", 22189, (long)(0x5F6C0AF224977A7EL ^ l2));
                            reference var31_20 = var26_15 - (var29_18 - var25_14) - _8u.d("q", 15799, (long)(0x5D3353DF5F031167L ^ l2));
                            bl = _02.cfr_renamed_2();
                            try {
                                Object[] objectArray6 = new Object[7];
                                objectArray6[6] = (int)var31_20;
                                objectArray6[5] = (int)var30_19;
                                objectArray6[4] = (int)var29_18;
                                objectArray6[3] = (int)var28_17;
                                objectArray6[2] = d2;
                                objectArray6[1] = d;
                                objectArray6[0] = l6;
                                object = _8u.f("\u00e4", (Object)this, (Object)objectArray6, -1820481663214688516L, (long)l2);
                                if (bl) break block12;
                                if (object == false) break block13;
                            }
                            catch (MatchException matchException) {
                                throw _8u.a(matchException);
                            }
                            int n = (int)_8u.f("\u00c2", (double)((double)_8u.f("\u00e4", (Object)_8u.f("c", (Object)this, -1819562243558523816L, (long)l2), -1819991887389374736L, (long)l2) / 3.0), -1826682025943037096L, (long)l2);
                            callSite = _8u.f("\u00c2", 0, (int)(n - _8u.d("q", 16341, (long)(0x70B977223CB31330L ^ l2))), -1827015744808248116L, (long)l2);
                            try {
                                double d6;
                                block15: {
                                    try {
                                        try {
                                            double d7 = d4 - 0.0;
                                            d5 = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
                                            if (bl) break block14;
                                            if (d5 <= 0) break block15;
                                        }
                                        catch (MatchException matchException) {
                                            throw _8u.a(matchException);
                                        }
                                        _8u.f("\u00d2", (Object)this, (int)_8u.f("\u00c2", 0, (int)(_8u.f("c", (Object)this, -1820620852066728519L, (long)l2) - true), -1827015744808248116L, (long)l2), -1820620852066728519L, (long)l2);
                                        if (!bl) break block16;
                                    }
                                    catch (MatchException matchException) {
                                        throw _8u.a(matchException);
                                    }
                                }
                                d5 = (d6 = d4 - 0.0) == 0.0 ? 0 : (d6 < 0.0 ? -1 : 1);
                            }
                            catch (MatchException matchException) {
                                throw _8u.a(matchException);
                            }
                        }
                        try {
                            try {
                                if (bl) break block17;
                                if (d5 >= 0) break block16;
                            }
                            catch (MatchException matchException) {
                                throw _8u.a(matchException);
                            }
                            _8u.f("\u00d2", (Object)this, (int)_8u.f("\u00c2", (int)callSite, (int)(_8u.f("c", (Object)this, -1820620852066728519L, (long)l2) + true), -1826547772954649581L, (long)l2), -1820620852066728519L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw _8u.a(matchException);
                        }
                    }
                    d5 = 1.0;
                }
                return (boolean)d5;
            }
            object = super.method_25401(d, d2, d3, d4);
        }
        return (boolean)object;
    }

    public boolean method_25404(class_11908 class_119082) {
        Object object;
        block16: {
            block17: {
                boolean bl;
                long l2;
                block14: {
                    block15: {
                        block12: {
                            long l3;
                            block13: {
                                l2 = b ^ 0x44C62C4D677EL;
                                l3 = l2 ^ 0x1701FCB2F18EL;
                                bl = _02.cfr_renamed_3();
                                try {
                                    try {
                                        object = _8u.f("\u00e4", (Object)class_119082, 4467852057771844481L, (long)l2);
                                        if (!bl) break block12;
                                        if (object != _8u.d("q", 3675, (long)(0x3573CB5725327A30L ^ l2))) break block13;
                                    }
                                    catch (MatchException matchException) {
                                        throw _8u.a(matchException);
                                    }
                                    _8u.f("\u00e4", (Object)_8u.f("\u00db", 4471437274612625788L, (long)l2), (Object)_8u.f("c", (Object)_8u.f("\u00db", 4468203523273731225L, (long)l2), 4474873003919096274L, (long)l2), 4475052804365949948L, (long)l2);
                                    return true;
                                }
                                catch (MatchException matchException) {
                                    throw _8u.a(matchException);
                                }
                            }
                            Object[] objectArray = new Object[2];
                            objectArray[1] = l3;
                            objectArray[0] = class_119082;
                            object = _8u.f("\u00e4", (Object)_8u.f("c", (Object)this, 4468919218434781001L, (long)l2), (Object)objectArray, 4475103332741129470L, (long)l2);
                        }
                        try {
                            try {
                                if (!bl) break block14;
                                if (object == false) break block15;
                            }
                            catch (MatchException matchException) {
                                throw _8u.a(matchException);
                            }
                            return true;
                        }
                        catch (MatchException matchException) {
                            throw _8u.a(matchException);
                        }
                    }
                    object = _8u.f("\u00e4", (Object)class_119082, 4467852057771844481L, (long)l2);
                }
                try {
                    try {
                        if (!bl) break block16;
                        if (object != _8u.d("q", 6044, (long)(0x50302409B6E3D9L ^ l2))) break block17;
                    }
                    catch (MatchException matchException) {
                        throw _8u.a(matchException);
                    }
                    _8u.f("\u00e4", (Object)_8u.f("\u00db", 4471437274612625788L, (long)l2), (Object)_8u.f("c", (Object)_8u.f("\u00db", 4468203523273731225L, (long)l2), 4474873003919096274L, (long)l2), 4475052804365949948L, (long)l2);
                    return true;
                }
                catch (MatchException matchException) {
                    throw _8u.a(matchException);
                }
            }
            object = super.method_25404(class_119082);
        }
        return (boolean)object;
    }

    public boolean method_25400(class_11905 class_119052) {
        long l2 = b ^ 0xA22BD8798C3L;
        long l3 = l2 ^ 0x3D9762B0022BL;
        Object[] objectArray = new Object[2];
        objectArray[1] = class_119052;
        objectArray[0] = l3;
        return (boolean)_8u.f("\u00e4", (Object)_8u.f("c", (Object)this, -4487409599947583244L, (long)l2), (Object)objectArray, -4492721580905284131L, (long)l2);
    }

    private void cfr_renamed_1(long l2) {
        block9: {
            block10: {
                CallSite callSite;
                long l3;
                block6: {
                    long l4 = l2 = b ^ l2;
                    long l5 = l4 ^ 0x46D627120ED4L;
                    l3 = l4 ^ 0xE82DC179BF7L;
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
                                        callSite = _8u.f("\u00e4", (Object)_8u.f("c", (Object)this, 2404324555985956880L, (long)l2), (Object)objectArray, 2404518706283415863L, (long)l2);
                                        if (bl) break block6;
                                        l7 = 2404363324851465620L;
                                        l6 = l2;
                                        if (l2 < 0L) break block7;
                                        if (_8u.f("\u00e4", (Object)callSite, (long)l7, (long)l6) == false) break block8;
                                    }
                                    catch (MatchException matchException) {
                                        throw _8u.a(matchException);
                                    }
                                    _8u.f("\u00d2", (Object)this, new ArrayList(_8u.f("\u00db", 2396361193370511543L, (long)l2)), 2403755069634837436L, (long)l2);
                                    if (l2 <= 0L) break block9;
                                    if (!bl) break block10;
                                }
                                catch (MatchException matchException) {
                                    throw _8u.a(matchException);
                                }
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l5;
                            callSite2 = _8u.f("\u00e4", (Object)_8u.f("c", (Object)this, 2404324555985956880L, (long)l2), (Object)objectArray, 2404518706283415863L, (long)l2);
                            l7 = 2404676119269463567L;
                            l6 = l2;
                        }
                        callSite = _8u.f("\u00e4", (Object)callSite2, (long)l7, (long)l6);
                    }
                    catch (MatchException matchException) {
                        throw _8u.a(matchException);
                    }
                }
                CallSite callSite3 = callSite;
                _8u.f("\u00d2", (Object)this, (List)((List)((Object)_8u.f("\u00e4", (Object)_8u.f("\u00e4", (Object)_8u.f("\u00e4", (Object)_8u.f("\u00db", 2396361193370511543L, (long)l2), 2403045126327756054L, (long)l2), arg_0 -> _8u.cfr_renamed_7(l3, (String)((Object)callSite3), arg_0), 2402801577414103122L, (long)l2), (Object)_8u.f("\u00c2", 2403259263656475972L, (long)l2), 2401667312051197100L, (long)l2))), 2403755069634837436L, (long)l2);
            }
            _8u.f("\u00d2", (Object)this, (int)_8u.d("q", 31382, (long)(0x10DBB786668C11B4L ^ l2)), 2404814159179874909L, (long)l2);
        }
    }

    private static boolean cfr_renamed_7(long l2, String string, _6_ _) {
        l2 = b ^ l2;
        return (boolean)_8u.f("\u00e4", (Object)_8u.f("\u00e4", (Object)_8u.f("\u00e4", (Object)_, -2035222794342187334L, (long)l2), -2034735033182186349L, (long)l2), (Object)string, -2034278603601196583L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        _8u.b = dev.krypton.l.a(-3123956378844139929L, -242765666393641935L, MethodHandles.lookup().lookupClass()).a(241270078820682L);
                        _8u.q = new Object[104];
                        _8u.r = new String[104];
                        _8u.b();
                        _8u.h = new HashMap<K, V>(13);
                        var11 = _8u.b ^ 35149811033376L;
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
                        var20_3 = new String[8];
                        var18_4 = 0;
                        var17_5 = "\r\u009d\u00a7\u00e8\u0090 \u00e8rp\u009f.y\u0083n\u00e3\u00b5\u009d\u00e8,\u00b5\u00917\u008b?\u001f\u00ac\u0006\u00e1iWHQ\u00ab\r\u00fd\u00d7\u00cb\u001f\u00eaZ\u0010\u00c2t\u00f1\u00d6R\u00bb\u00ef\u00b2\u00b4\u0019t\u009a\u00cf\u008c\u00b4D(\u00ac\r\u0000HG<\u0019\u0006\u0012\u00d2J\u00ba\u00ccB\u001c}\u00eb\u00df\u008a\"\u00f6\u00e2\\\u00fd\u00e8\u00e2\u0013\u00d0\u0086\u0000\u0015\u00c9\u009e\u00ab\u00d4\u00b1\u00ad\u00df\u00fb\u00d1\u0010wj\u00e8-\u00d2\u009a\u00de\u00bbU\"\u00b5\u00d1\u00a0\u00ac\u00ab2\u0010\u0086\u00bc\u0016u\u00d5\u0003\u00f6Hz\u00bfg{\u00e4&\u007f\u0005\u0010<P\u00a1\u00ea\u0084\bs\u0095\u0005(\u00034f\u0088o\u0007";
                        var19_6 = "\r\u009d\u00a7\u00e8\u0090 \u00e8rp\u009f.y\u0083n\u00e3\u00b5\u009d\u00e8,\u00b5\u00917\u008b?\u001f\u00ac\u0006\u00e1iWHQ\u00ab\r\u00fd\u00d7\u00cb\u001f\u00eaZ\u0010\u00c2t\u00f1\u00d6R\u00bb\u00ef\u00b2\u00b4\u0019t\u009a\u00cf\u008c\u00b4D(\u00ac\r\u0000HG<\u0019\u0006\u0012\u00d2J\u00ba\u00ccB\u001c}\u00eb\u00df\u008a\"\u00f6\u00e2\\\u00fd\u00e8\u00e2\u0013\u00d0\u0086\u0000\u0015\u00c9\u009e\u00ab\u00d4\u00b1\u00ad\u00df\u00fb\u00d1\u0010wj\u00e8-\u00d2\u009a\u00de\u00bbU\"\u00b5\u00d1\u00a0\u00ac\u00ab2\u0010\u0086\u00bc\u0016u\u00d5\u0003\u00f6Hz\u00bfg{\u00e4&\u007f\u0005\u0010<P\u00a1\u00ea\u0084\bs\u0095\u0005(\u00034f\u0088o\u0007".length();
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
                            var20_3[var18_4++] = _8u.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "KW\u008c\u00a9\u00f8*QX0N\u00cf\n!\u001d\u00cb\u00f8\\\u0005\u00d5\u00e4o\u000e\u008e\u00ed\u00bb\u001b\u00e3\u00d7\u00863\u0090\u00a8\u0082hXWy\u00e5\u0004\u0084\u0018\u00fa\u001ao=\u00f3\u00bdO\u00b6\u00bcd\u00a6\u00e0<\u00a4\u00f3\u00f8\u00da\u00c6\u00f3\u0006\u00f2\u00ca\u00b90";
                            var19_6 = "KW\u008c\u00a9\u00f8*QX0N\u00cf\n!\u001d\u00cb\u00f8\\\u0005\u00d5\u00e4o\u000e\u008e\u00ed\u00bb\u001b\u00e3\u00d7\u00863\u0090\u00a8\u0082hXWy\u00e5\u0004\u0084\u0018\u00fa\u001ao=\u00f3\u00bdO\u00b6\u00bcd\u00a6\u00e0<\u00a4\u00f3\u00f8\u00da\u00c6\u00f3\u0006\u00f2\u00ca\u00b90".length();
                            var16_7 = 40;
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
                            var20_3[var18_4++] = _8u.b(var21_9).intern();
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
                _8u.f = var20_3;
                _8u.g = new String[8];
                _8u.n = new HashMap<K, V>(13);
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
                var4_14 = "\u00bd+O\u0090$\u0007<\u0016\u00b0|\u009b}\u008a\u00ee\u000b\u0002:\u00d2s\u00e7F\u00c0\u008c\u00eb\u00fd\u0088\u00ee\u00baI\u00e9zK\u00a7\u00ad\u0017\u00b0\u00fb\u00f9\u008b,\u00e7\u001fgs0_\u00f6\u00f1A\u0000\u0005\u00f4\u001ffrhB\u0015z\u0095DQ\u009e\u00e6C\u00c3\u00d2\u00cd\u00e1l\u009f\u00c8\u00ca\u0004\u008a\u0010\"<\u00c0\u00d1\u00a8eG\u009a\b\u00f3\u0094\u00c0\"\u0090r\u00fe#I\u009a\u00a3\u001b\u00b97\f9G,\u00d3\u0080\u00aa\u0082\u00e76\u009f\u0086\u00b9\u00a8\u009d\u0092U\u00ee\u0086\u00f5\u007f_\u001d\u00aadM\u0010\u00ee\u008f3O0\u0090\u0083\u00e8\u0017\u00c9\u0012s\u00e4\u00f7\u00fe\u00bcX:\u000b\u00c7{!\u007f\u00ebK\u00ed\u00b5\u00aao\u00e5\u00eb\u00c5\u0087S\u00cfMI\u009f\u0099\u00a2:GF\u0095\u008e\u001a\u00d3\u00ba\u00e5=\u009f[\u0018\u00e1UP\u0091\u00d6\u0082B\u0081\u00f5\u00e9\u00f9\u00c3\u00c6\u00b4\u00b4\u001e\u00d92\u0015U\u0001\u0099\u00bf\u0001pv\u008a\u00f3\ft)\u00b0\u0007\u00b5\u00d73\b\u00f3\u0081T\u000eF!Y\u00c7\u00c6\u00ac[2\u0080-\u00fe\u00e0\u0086\u00f6\u00c4\u00a4d\u00b9e}[\u00a7{Rv,w@\u00fb\u00e7\u0097\u001a\u00e3\u00fb\u00e7\u00a8\u0000.\u00d9V\u0094\u00c3\u00860n\u0081\u0098\u0014\u007f\u00a0IU|1s\u00b1\u009d\u00c3g\u00c3\u0080\u00ee\u00a54/\u0001pI\u00d57\u00cba\n\u00bd\u0081\u00ee\u00de\u0004\u00fa\u00b2\u00f3\u00e9\u008fST\u00e0\u001d2iz\u0001\u0013z\u0018\u00b5\u0098\u00c5\b\u001b\u000f\u0087\u0087l\u0086`&\u00977\u0014\u00f9\u00f5\u00a2\u001d\u00ca#\u00a5eb\u00ed\f\u0089P\u00b8\u00d5\u0005\u00b0\u0015*\u00d2\u009a\u0006mMQs:\u00ee\u0000\u00efh\u0015s\u00ae\u00e5\u00a3M\u0084\u00c8#\u00d0\u0004\u00a9\u0081\u00fde_q&\u00ea\u009fD\u0095\u00c8\u00c1\u00ac\u0099~d\u0093\u00d2\u00c6\u008e\u0085^\u00eb\u00b9\u0097\u00856\u00ae\u00aaQd\u00e3=m\u00bd\u0094";
                var5_15 = "\u00bd+O\u0090$\u0007<\u0016\u00b0|\u009b}\u008a\u00ee\u000b\u0002:\u00d2s\u00e7F\u00c0\u008c\u00eb\u00fd\u0088\u00ee\u00baI\u00e9zK\u00a7\u00ad\u0017\u00b0\u00fb\u00f9\u008b,\u00e7\u001fgs0_\u00f6\u00f1A\u0000\u0005\u00f4\u001ffrhB\u0015z\u0095DQ\u009e\u00e6C\u00c3\u00d2\u00cd\u00e1l\u009f\u00c8\u00ca\u0004\u008a\u0010\"<\u00c0\u00d1\u00a8eG\u009a\b\u00f3\u0094\u00c0\"\u0090r\u00fe#I\u009a\u00a3\u001b\u00b97\f9G,\u00d3\u0080\u00aa\u0082\u00e76\u009f\u0086\u00b9\u00a8\u009d\u0092U\u00ee\u0086\u00f5\u007f_\u001d\u00aadM\u0010\u00ee\u008f3O0\u0090\u0083\u00e8\u0017\u00c9\u0012s\u00e4\u00f7\u00fe\u00bcX:\u000b\u00c7{!\u007f\u00ebK\u00ed\u00b5\u00aao\u00e5\u00eb\u00c5\u0087S\u00cfMI\u009f\u0099\u00a2:GF\u0095\u008e\u001a\u00d3\u00ba\u00e5=\u009f[\u0018\u00e1UP\u0091\u00d6\u0082B\u0081\u00f5\u00e9\u00f9\u00c3\u00c6\u00b4\u00b4\u001e\u00d92\u0015U\u0001\u0099\u00bf\u0001pv\u008a\u00f3\ft)\u00b0\u0007\u00b5\u00d73\b\u00f3\u0081T\u000eF!Y\u00c7\u00c6\u00ac[2\u0080-\u00fe\u00e0\u0086\u00f6\u00c4\u00a4d\u00b9e}[\u00a7{Rv,w@\u00fb\u00e7\u0097\u001a\u00e3\u00fb\u00e7\u00a8\u0000.\u00d9V\u0094\u00c3\u00860n\u0081\u0098\u0014\u007f\u00a0IU|1s\u00b1\u009d\u00c3g\u00c3\u0080\u00ee\u00a54/\u0001pI\u00d57\u00cba\n\u00bd\u0081\u00ee\u00de\u0004\u00fa\u00b2\u00f3\u00e9\u008fST\u00e0\u001d2iz\u0001\u0013z\u0018\u00b5\u0098\u00c5\b\u001b\u000f\u0087\u0087l\u0086`&\u00977\u0014\u00f9\u00f5\u00a2\u001d\u00ca#\u00a5eb\u00ed\f\u0089P\u00b8\u00d5\u0005\u00b0\u0015*\u00d2\u009a\u0006mMQs:\u00ee\u0000\u00efh\u0015s\u00ae\u00e5\u00a3M\u0084\u00c8#\u00d0\u0004\u00a9\u0081\u00fde_q&\u00ea\u009fD\u0095\u00c8\u00c1\u00ac\u0099~d\u0093\u00d2\u00c6\u008e\u0085^\u00eb\u00b9\u0097\u00856\u00ae\u00aaQd\u00e3=m\u00bd\u0094".length();
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
                    var4_14 = "L\u008d\u00b38Qa\u0097NX\u00cb\u00ae\u001ft\u0007\f\u000f";
                    var5_15 = "L\u008d\u00b38Qa\u0097NX\u00cb\u00ae\u001ft\u0007\f\u000f".length();
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
        _8u.l = var6_12;
        _8u.m = new Integer[53];
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
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x3F02;
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
                throw new RuntimeException("dev/krypton/8u", exception);
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
            _8u.g[n2] = _8u.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _8u.b(n, l2);
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
            throw new RuntimeException("dev/krypton/8u" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int d(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x4A63;
        if (m[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = l[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])_8u.n.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    _8u.n.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/8u", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _8u.m[n2] = n3;
        }
        return m[n2];
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _8u.d(n, l2);
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
            throw new RuntimeException("dev/krypton/8u" + " : " + string + " : " + methodType.toString(), exception);
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
            case 0 -> 19;
            case 1 -> 3;
            case 2 -> 33;
            case 3 -> 63;
            case 4 -> 54;
            case 5 -> 53;
            case 6 -> 23;
            case 7 -> 58;
            case 8 -> 24;
            case 9 -> 9;
            case 10 -> 59;
            case 11 -> 11;
            case 12 -> 47;
            case 13 -> 30;
            case 14 -> 60;
            case 15 -> 42;
            case 16 -> 57;
            case 17 -> 13;
            case 18 -> 16;
            case 19 -> 27;
            case 20 -> 37;
            case 21 -> 35;
            case 22 -> 32;
            case 23 -> 8;
            case 24 -> 29;
            case 25 -> 55;
            case 26 -> 4;
            case 27 -> 6;
            case 28 -> 10;
            case 29 -> 5;
            case 30 -> 39;
            case 31 -> 15;
            case 32 -> 14;
            case 33 -> 61;
            case 34 -> 26;
            case 35 -> 7;
            case 36 -> 36;
            case 37 -> 31;
            case 38 -> 41;
            case 39 -> 48;
            case 40 -> 12;
            case 41 -> 56;
            case 42 -> 1;
            case 43 -> 50;
            case 44 -> 25;
            case 45 -> 0;
            case 46 -> 49;
            case 47 -> 2;
            case 48 -> 38;
            case 49 -> 18;
            case 50 -> 40;
            case 51 -> 28;
            case 52 -> 62;
            case 53 -> 22;
            case 54 -> 46;
            case 55 -> 20;
            case 56 -> 45;
            case 57 -> 21;
            case 58 -> 51;
            case 59 -> 52;
            case 60 -> 17;
            case 61 -> 34;
            case 62 -> 43;
            default -> 44;
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
        _8u.r[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = q;
        q[0] = "#\u001f)e\u0013N=\u00173*NO;\u001b>i\u0013h=\f:eP";
        objectArray[1] = "\u0001pXIR/\u001fxB\u0006\u001a/\u0005rZA\u00134EA\\M\u00183\bpZM";
        objectArray[2] = "\u001c\u0015Q\u001a\u0018\u0010\u0001\u0000S[\u001dLL>";
        objectArray[3] = "ue*g\u007f^km0(\u001dBlp";
        objectArray[4] = "E.IG\u0003\u000bX;K\u0006\u0006W\u0019>";
        objectArray[5] = "\u0016sE\u0001q*\u000bfG@tvE@";
        objectArray[6] = "A~\u000eGT?Jq\u001f\b)'Yv\u0016A";
        objectArray[7] = Boolean.TYPE;
        _8u.r[7] = "java/lang/Boolean";
        objectArray[8] = "\u00004;e\b\u0006u\u00140j\u0019I\u0014\u001a;a\u001d\u0013`";
        objectArray[9] = "Z\u001d\u0005ci]D\u0015\u001f,4\\B\u0019\u0012oik_\u0010\u001fg$\\_\u000e";
        objectArray[10] = "\u0007\u0000R\u001fIw\f\u000fCP(y\u0007\u0004G\n";
        objectArray[11] = Integer.TYPE;
        _8u.r[11] = "java/lang/Integer";
        objectArray[12] = "[u D\"\u0014E}:\u000b\u007f\u0015Cq7H\"\"^x:@o\u0015^f%";
        objectArray[13] = "\u0000ETe\ny\u001dPV$\u000f%V";
        objectArray[14] = "\u0001;~|:\u0019\u001c.|=?E\\\u0013";
        objectArray[15] = "2E\u001b\u0012\u000fb2E\fN\u0003m(\u000e\fP\u0003x/\u007f^\r[;d";
        objectArray[16] = "A\u0001#y[]A\u00014%WR[J4;WG\\;df\u0006";
        objectArray[17] = "\u001aXE\u0014s\foxN\u001bbC\u000evE\u0010f\u0019z";
        objectArray[18] = "uV\u0014aCguV\u0003=Oho\u001d\u0003#O}hlT|\u0019";
        objectArray[19] = Void.TYPE;
        _8u.r[19] = "java/lang/Void";
        objectArray[20] = "9H\u0010\u001c#B2G\u0001S@O'A";
        objectArray[21] = "\u001f+Wq\u001byj\u000b\\~\n6\u000b\u0005Wu\u000el\u007f";
        objectArray[22] = "kc\\yy!vv^8|}7c";
        objectArray[23] = "g6&~GC\u0012\u0016-qV\fs\u0018&zRV\u0007";
        objectArray[24] = "&&Ohh6S\u0006Dgyy2\bOl}#F";
        objectArray[25] = Double.TYPE;
        _8u.r[25] = "java/lang/Double";
        objectArray[26] = "djP8g~\u0011J[7v1pDP<rk\u0004";
        objectArray[27] = "\u00062\u0010WE$s\u0012\u001bXTk\u0012\u001c\u0010SP1f";
        objectArray[28] = ".i;P\u0003B[I0_\u0012\r:G;T\u0016WN";
        objectArray[29] = "|nA\u001fjN\tNJ\u0010{\u0001h@A\u001b\u007f[\u001c";
        objectArray[30] = "MgwX\"n8G|W3!YIw\\7{-";
        objectArray[31] = Float.TYPE;
        _8u.r[31] = "java/lang/Float";
        objectArray[32] = "\u001bHkT\u007fo\u0006]i\u0015z3G\u001a";
        objectArray[33] = "<aX`]BIASoL\r(OXdHW\\";
        objectArray[34] = "_\roa\u0017\u0007B\u0018m \u0012[\u0003*";
        objectArray[35] = "\u001d<p|3Ih\u001c{s\"\u0006\t\u0012px&\\}";
        objectArray[36] = "K\b;\u001bQVV\u001d9ZT\n\u00192";
        objectArray[37] = "\u001e\"w\u0018((k\u0002|\u00179g\n\fw\u001c==~";
        objectArray[38] = "<6x2fy!#zsc%ac";
        objectArray[39] = "+{Z\u001a\u000b\u0003^[Q\u0015\u001aL?UZ\u001e\u001e\u0016K";
        objectArray[40] = "?'nzdkJ\u0007euu$+\tn~q~_";
        objectArray[41] = "\u000bYy$y\u0005~yr+hJ\u001fwy l\u0010k";
        objectArray[42] = "\fH/(\b\ryh$'\u0019B\u0018f/,\u001d\u0018l";
        objectArray[43] = "S\u007fd,,\f&_o#=CGQd(9\u00193";
        objectArray[44] = "%O/\u00163I.@>Y^M.\\\n\u0012lP*@:\u0012";
        objectArray[45] = "E1c\u0018 ![9yW]1[";
        objectArray[46] = "\u0000\u0017QS3uu7Z\\\":\u00149QW&``";
        objectArray[47] = "G2\u001d\n\b12\u0012\u0016\u0005\u0019~S\u001c\u001d\u000e\u001d$'";
        objectArray[48] = "\t\u000b\\\u000e}\r\t\u000bKRq\u0002\u0013@KLq\u0017\u00141\u0019\u0011)T^";
        objectArray[49] = "kD\u0004P A\u001ed\u000f_1\u000e\u007fj\u0004T5T\u000b";
        objectArray[50] = "OK\u0000\u0018EXFJRO~\u001e~AN\u000e\u001eX\u0012\u0014Z\u001e\u0015";
        objectArray[51] = "cYT\u0014\n=g\u001cA\u0015q;\rG\u0011C\f3<P^\u0014\u001d";
        objectArray[52] = "t!^iL\u0011w}\\m=Hp3%2\u0004A~{U9QLuC\u0015;QJ!3\u001en\\A\u0019s\u001cnZ\u0015ixIcQ-";
        objectArray[53] = "wdZ4\u001e's!O5e&\u0019mP8\u0018('%NaT\u0018ut\u0013h\u001cxac\u0013be";
        objectArray[54] = "z\u0019-Tu ~\\8U\u000e%U`2\u00044b%Q%Kcs";
        objectArray[55] = "\u001f{u%V?\\!u%ov&%b\"R-^$<0\u000b";
        objectArray[56] = "ligq\u0015Lm7u(\u007f[;s\u0018|FX17hw\u0013U:\u000f'&\u000f\b0pv5\u001fZV";
        objectArray[57] = "]Q\u0001{5U^\r\u0003\u007fD\u0002]R\u001e\u0010$\u0011SN\bu-\u000fW_zp<\nMA\u001fy\"\u000e\\3";
        objectArray[58] = "zGcw\u0012\u0015z\u001a0w\u007fMASr-\u0002L\u007f\u001bltN|}]`r\u000eMy\u001da>\u007f";
        objectArray[59] = "2*1\\1:1v3X@c>.J\u0007yj8p:\f,g3Hz\u000e,ag8q[!j_xs['>/s&V,\u0006";
        objectArray[60] = "F%\u001f\b\u0011wG+\u0014]!,?9\n\u0000\\!\u0001q\u0014Y\u0010\u0011A'I\u0007YkEx\u0000\u0013!";
        objectArray[61] = "*4!}\\\u001c.q4|'\u001dD}`|@\u001b4v5qK";
        objectArray[62] = "C!\fGB<C|_G/mx5\u001d\u001dReF}\u0003D\u001eUD;\u000fB^d@{\u000e\u000e/";
        objectArray[63] = "D\u000b;w]6V^\"g=>C\u001e8}Q\f\u0017_`%=0T\\3{\u0003?^\u0005g\u001aQ2\u001fS!zE%\u001fYX";
        objectArray[64] = "f7\u001dQQ130KXm2]y\u0005H\u0010<c1\u001b\u0011\\\fm0\u001bNU|fe\u0016Em";
        objectArray[65] = "{m\r\u0018\u0011,x1\u000f\u001c`u\u007f\u007fv\u0017\u001ey'7\u001c\u0015]!s\u000f\u0012\r\t!.e\u0010NQu\u0016k\b\u001aQ(|iKB\u0005\u0010";
        objectArray[66] = "9,\u0014jx%el\u001a/\u001d$?\u0012\n&|fl,B8%*\\~\u0013e,b<j\u0004e&\u001b";
        objectArray[67] = "G1\u001aG~h\u00126LNBd|\u007f\u0002^?eB7\u001c\u0007sUL6\u001cXz%Gc\u0011SB";
        objectArray[68] = "J6SC\u0003\u0019Sk]\\s\u001d2jVU\u001e\u0019\tgB_\t#";
        objectArray[69] = "\u001993a2\b\u001d|&`I\nw09m4\u0007Ix'4x7Gy'kqGL,*`I";
        objectArray[70] = "`$=d<w5#km\u0000w[!3\u007f;'2!n,;";
        objectArray[71] = ">.3;3n:qz/K\u007f$-k'Kx)q3$+l>q9]";
        objectArray[72] = "\u0019Y2s\u0001cE\u0019<6da|\u0017.,\u0019mB_0uU]\u001c\u001f?0\u00168\u0015\u0001;!d";
        objectArray[73] = "%\u0007}\u0013'g(\u0013w\u0004\u001d=b3w\u0006a-\u0019Bl\u001e#-(F,\u001fo\\";
        objectArray[74] = "x0\u0005\u0015!\u0014y>\u000e@\u0011J\u0001,\u0010\u001dlB?d\u000eD rm5SMh\u0012y\"SG\u0011";
        objectArray[75] = "+KQ\"@1+\u0016\u0002\"-c\u0010_@xPh.\u0017^!\u001cX,V]t\u0017c!BWc-";
        objectArray[76] = "RK[\u0007o\u0006R\u0016\b\u0007\u0002_i_J]\u007f_W\u0017T\u00043o\u0005F\t\r{\u000f\u0011Q\t\u0007\u0002";
        objectArray[77] = "aYk~l\u0000lMaiVG:dcl;A\u0016I\u007f~V\u0007$Oi)m\n0E~\u0013";
        objectArray[78] = "\u0001\u0019\f\u0006cgMC\u0004Y\u0018h\u0016\u001f\u0011k$<@Ji\\``\f\b\fU~d\u001dz";
        objectArray[79] = "\u0001n>&\u0010ZTih/,^[Pdg@\u0000\u0002 o2M\u000b";
        objectArray[80] = "a\u0001\b?\u001e\u00017V\u0018RN\r<A\b( U4A\u000bmO\u0007 \u0007\u0005R\u0019P5P[?O\u0007%=";
        objectArray[81] = "R-yb\bxVhlcs}<$sn\u000ew\u0002lm7BG\u0000*a1\u0002v\u0004j`}s";
        objectArray[82] = "t5Tta;y!^c[k/*Gp:f3LFk!y*%Bs oHpEyeqyt\u0005x)\u0000";
        objectArray[83] = "yHbva\u0013}\rww\u001a\u0010\u0017\u0001#w}\u0014g\nvzv";
        objectArray[84] = "bu=d<@c+/=VC$i/038a//4hU7x?Y";
        objectArray[85] = "@]PgA\u001cD\u0018Ef:\u0013.C\u00150G\u0012\u001fTZgV";
        objectArray[86] = "=\u000e/\u0005\u0001u,TlZ1\u007f9\u0012uY]MkR/\u0004\u0001\u001adWyY\tjo\u0002tR1";
        objectArray[87] = "\u001b\u000f1\u0014v:\u001fJ$\u0015\r5u\u0006;\u0018p5KN%A<\u0005\u0019\u001fxHte\r\bxB\r";
        objectArray[88] = "\u001d\fR[fl\u001cR@\u0002\foF\u0018@f<-K\r\u0015\u00167xF\u0006-";
        objectArray[89] = ":~*\"P\fvf3b!\rm^(b]q4z dX\u0010j\"vw!";
        objectArray[90] = "GXe\u0002weF\u0006w[\u001d|\u0006s\u007fGal}\u0002d_#lL\u0006$^o\u001d";
        objectArray[91] = "b4\u0000\"\u0002Ufq\u0015#yW\f=\n.\u0004Z2u\u0014wHjkpB2H[|?\u0015#y";
        objectArray[92] = "zthLcn/s>E_j\u0002J{X8:q,zV3o";
        objectArray[93] = "\u0005i;^%\u000b\fhi\t\u001eLwR5\n!\u001a\u000f,<\u000bsM";
        objectArray[94] = ")/\u0007\u001e(b|(Q\u0017\u0014g\u0012+\u000b\u0019)5j*U\u000bp";
        objectArray[95] = "s\u0012,G\u0012YsO\u007fG\u007f\fH\u0006=\u001d\u0002\u0000vN#DN0$\u001f~M\u0006P0\b~G\u007f";
        objectArray[96] = "#$X\u000e^8usHc\u000b2~|X\b\u001cU$x\\\u001e\u00194z \n\r`jph\t\u0005\u001f;cx[c";
        objectArray[97] = "\u0002\u0007\u00031Rj\u0006B\u00160)el\u000e\t=TeRF\u0017d\u0018U\\G\u0017;\u0011%W\u0012\u001a0)";
        objectArray[98] = "JUJqs#K[A$C}3I_y>u\r\u0001A rE\u000fGM&2t\u000b\u0007LjC";
        objectArray[99] = "3I\u001a\u0018AK:HHOz\fYrO\u001e\u0019Xb\u001f]K\u0000H";
        objectArray[100] = "\u0018iqCK\u0004\u0019gz\u0016{RaudK\u0006R_=z\u0012Jb\rl'\u001b\u0002\u0002\u0019{'\u0011{";
        objectArray[101] = "J\u000e^\\\u001cj\u0006TV\u0003ge]\bC1[1\u000b\\;\u0006\u001fmG\u001f^\u000f\u0001iVm";
        objectArray[102] = "nd\u0019\u000e\u0007U2$\u0017Kb[\u000b*\u0005Q\u001f[5b\u001b\bSkk\"\u0014M\u0010\u000eb<\u0010\\b";
        Object[] objectArray2 = objectArray;
        objectArray[103] = "\u0016\u0010t\u0016/!\u0016M'\u0016Byltg_#5\u001dJ/Azy-\u0018~\u001cs1M\fi\u001cyH";
    }

    private static Class f(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _8u.e(l2, l3);
            object = q[n];
            try {
                if (!(object instanceof String)) break block2;
                _8u.q[n] = clazz = Class.forName(r[n]);
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
        Field field = _8u.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _8u.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field g(long l2, long l3) {
        int n = _8u.e(l2, l3);
        Object object = q[n];
        if (object instanceof String) {
            String string = r[n];
            int n2 = string.indexOf(8);
            Class clazz = _8u.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _8u.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _8u.c(clazz3, string2, clazz2)) != null) {
                    _8u.q[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _8u.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _8u.q[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _8u.f(744548075409363L, 0L);
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
        Method method = _8u.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _8u.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method h(long l2, long l3) {
        int n = _8u.e(l2, l3);
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
                clazz3 = _8u.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _8u.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _8u.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _8u.q[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _8u.f(744548075409363L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _8u.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _8u.q[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _8u.f(744548075409363L, 0L);
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
            if (c == 'c' || c == '\u00d2' || c == '\u00db' || c == '\u00ea') {
                field = _8u.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'c' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d2' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00db' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _8u.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _8u.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8u" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_8u.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_8u.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_8u.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

