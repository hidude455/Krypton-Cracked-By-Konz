/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.krypton.0b
 *  java.lang.MatchException
 *  net.minecraft.class_11905
 *  net.minecraft.class_11908
 *  net.minecraft.class_11909
 *  net.minecraft.class_1299
 *  net.minecraft.class_1792
 *  net.minecraft.class_1826
 *  net.minecraft.class_437
 */
package dev.krypton;

import dev.krypton._02;
import dev.krypton._0b;
import dev.krypton._73;
import dev.krypton._7V;
import dev.krypton._8B;
import dev.krypton._8e;
import dev.krypton._97;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_11905;
import net.minecraft.class_11908;
import net.minecraft.class_11909;
import net.minecraft.class_1299;
import net.minecraft.class_1792;
import net.minecraft.class_1826;
import net.minecraft.class_437;

/*
 * Renamed from dev.krypton.8a
 */
public class _8a_0
extends _8e {
    private final _97 cfr_renamed_4;
    private final List cfr_renamed_468;
    private final int cfr_renamed_134;
    private final int cfr_renamed_200;
    private final Map cfr_renamed_403;
    private final int cfr_renamed_447;
    private final int cfr_renamed_3;
    private final _7V cfr_renamed_448;
    private List cfr_renamed_1;
    private int cfr_renamed_6;
    private int cfr_renamed_9;
    private int cfr_renamed_469;
    private static final long b;
    private static final String[] f;
    private static final String[] g;
    private static final Map h;
    private static final long[] l;
    private static final Integer[] m;
    private static final Map n;
    private static final Object[] q;
    private static final String[] r;

    public _8a_0(int n, int n2, char c, _97 var4_4) {
        long l2;
        long l3 = l2 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)c << 48 >>> 48) ^ b;
        long l4 = l3 ^ 0x6A71DA649C1CL;
        long l5 = l3 ^ 0x1F71003E40F6L;
        long l6 = l3 ^ 0x5852A065C53CL;
        long l7 = l3 ^ 0x2E59EBD655C8L;
        long l8 = l3 ^ 0x3CFC91BE6082L;
        long l9 = l3 ^ 0x100812B932FAL;
        long l10 = l3 ^ 0x36396849A5C6L;
        long l11 = l3 ^ 0x14EC04155F80L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        super((String)((Object)_8a_0.b("x", 31359, (long)(0x6761AC536656CB46L ^ l2))) + var4_4.java_lang_String_5(objectArray).toUpperCase());
        this.cfr_renamed_134 = (int)_8a_0.d("g", 20984, (long)(0x60711ED284919F22L ^ l2));
        this.cfr_renamed_200 = (int)_8a_0.d("g", 29792, (long)(0x709F5DD6AD3F3AA0L ^ l2));
        this.cfr_renamed_447 = (int)_8a_0.d("g", 16223, (long)(0x3132FDE53502718AL ^ l2));
        this.cfr_renamed_3 = (int)_8a_0.d("g", 458, (long)(0x685C36C8E14A4F15L ^ l2));
        this.cfr_renamed_448 = new _7V(l5);
        _8a_0.f("q", (Object)this, (int)_8a_0.d("g", 763, (long)(0x1F8E510ABC664C3DL ^ l2)), -4121943659589237777L, (long)l2);
        _8a_0.f("q", (Object)this, (int)_8a_0.d("g", 763, (long)(0x1F8E510ABC664C3DL ^ l2)), -4124682637769300195L, (long)l2);
        _8a_0.f("q", (Object)this, (int)_8a_0.d("g", 763, (long)(0x1F8E510ABC664C3DL ^ l2)), -4108723262917414750L, (long)l2);
        this.cfr_renamed_4 = var4_4;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l10;
        this.cfr_renamed_403 = new HashMap(_8a_0.f("s", (Object)var4_4, (Object)objectArray2, -4122109312900292164L, (long)l2));
        this.cfr_renamed_468 = new ArrayList();
        _8a_0.f("s", (Object)_8a_0.f("\u00dc", -4109391028641334181L, (long)l2), arg_0 -> this.cfr_renamed_7(l7, arg_0), -4108922287458346329L, (long)l2);
        _8a_0.f("s", (Object)_8a_0.f("\u00fd", (Object)this, -4121694930163878213L, (long)l2), (Object)_8a_0.f("t", arg_0 -> _8a_0.cfr_renamed_8(l9, arg_0), -4122783701159054916L, (long)l2), -4109047651678510413L, (long)l2);
        _8a_0.f("q", (Object)this, new ArrayList(_8a_0.f("\u00fd", (Object)this, -4121694930163878213L, (long)l2)), -4124627609472668014L, (long)l2);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = _8a_0.b("x", 6552, (long)(0xFB87BDB969A8A6L ^ l2));
        objectArray3[0] = l4;
        _8a_0.f("s", (Object)_8a_0.f("\u00fd", (Object)this, -4109033794217823647L, (long)l2), (Object)objectArray3, -4124792841131139366L, (long)l2);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = () -> this.cfr_renamed_2(l8);
        objectArray4[0] = l6;
        _8a_0.f("s", (Object)_8a_0.f("\u00fd", (Object)this, -4109033794217823647L, (long)l2), (Object)objectArray4, -4108477167587175152L, (long)l2);
    }

    @Override
    public String java_lang_String_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 ^ 0x636E2B572E5EL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        return (String)((Object)_8a_0.b("x", 20728, (long)(0x6027B6471CC3101DL ^ l2))) + (String)((Object)_8a_0.f("s", (Object)_8a_0.f("s", (Object)_8a_0.f("\u00fd", (Object)this, -5252032230269230774L, (long)l2), (Object)objectArray2, -5255599294039094072L, (long)l2), -5249655977297953154L, (long)l2)) + (String)((Object)_8a_0.b("x", 9132, (long)(0x3FBDA314FEC86346L ^ l2))) + (int)_8a_0.f("s", (Object)_8a_0.f("\u00fd", (Object)this, -5253195161237653608L, (long)l2), -5249787595900471696L, (long)l2) + (String)((Object)_8a_0.b("x", 9263, (long)(0x5C52D89F2E6464C0L ^ l2)));
    }

    @Override
    protected int int_6(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return (int)_8a_0.d("g", 17094, (long)(0x10A43EE31048B6F3L ^ l2));
    }

    @Override
    protected int int_9(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return (int)_8a_0.d("g", 31512, (long)(0x2EC5180242CAEEC2L ^ l2));
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void cfr_renamed_9(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [64[WHILELOOP], 65[DOLOOP]], but top level block is 31[TRYBLOCK]
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

    private List cfr_renamed_4(Object[] objectArray) {
        Object object;
        long l2 = (Long)objectArray[0];
        l2 = b ^ l2;
        ArrayList arrayList = new ArrayList();
        CallSite callSite = _8a_0.f("s", (Object)_8a_0.f("\u00fd", (Object)this, -4288913681455860723L, (long)l2), -4291719442315325514L, (long)l2);
        boolean bl = _02.cfr_renamed_3();
        block4: while (_8a_0.f("s", (Object)callSite, -4301178505524363519L, (long)l2) != false) {
            object = _8a_0.f("s", (Object)callSite, -4288179779313283220L, (long)l2);
            do {
                block6: {
                    _73 var7_6 = (_73)object;
                    try {
                        CallSite callSite2;
                        try {
                            callSite2 = _8a_0.f("s", (Object)_8a_0.f("\u00fd", (Object)this, -4291672463404858128L, (long)l2), (Object)_8a_0.f("\u00fd", (Object)var7_6, -4287769045487483840L, (long)l2), -4302380880541024242L, (long)l2);
                            if (!bl || callSite2 == false) break block6;
                        }
                        catch (MatchException matchException) {
                            throw _8a_0.a(matchException);
                        }
                        callSite2 = _8a_0.f("s", arrayList, (Object)var7_6, -4290538804554662953L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw _8a_0.a(matchException);
                    }
                }
                if (bl) continue block4;
                object = arrayList;
            } while (l2 < 0L);
        }
        return object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean method_25402(class_11909 var1_1, boolean var2_2) {
        block86: {
            block87: {
                block97: {
                    block96: {
                        block101: {
                            block100: {
                                block98: {
                                    block99: {
                                        block94: {
                                            block93: {
                                                block91: {
                                                    block92: {
                                                        block90: {
                                                            block88: {
                                                                block89: {
                                                                    block85: {
                                                                        block83: {
                                                                            block84: {
                                                                                block81: {
                                                                                    block82: {
                                                                                        block79: {
                                                                                            block80: {
                                                                                                block77: {
                                                                                                    block78: {
                                                                                                        block75: {
                                                                                                            block76: {
                                                                                                                block73: {
                                                                                                                    block74: {
                                                                                                                        v0 = var3_3 = _8a_0.b ^ 15575907229439L;
                                                                                                                        var5_4 = v0 ^ 43173521714555L;
                                                                                                                        var7_5 = v0 ^ 104668736854672L;
                                                                                                                        var9_6 = v0 ^ 89508406004882L;
                                                                                                                        var11_7 = v0 ^ 30455665471484L;
                                                                                                                        var13_8 = v0 ^ 35595243653207L;
                                                                                                                        var15_9 = v0 ^ 82300556159556L;
                                                                                                                        var17_10 = v0 ^ 13669133095502L;
                                                                                                                        var19_11 = v0 ^ 113251186383099L;
                                                                                                                        var21_12 = v0 ^ 41034836729616L;
                                                                                                                        v1 = new Object[2];
                                                                                                                        v1[1] = var21_12;
                                                                                                                        v1[0] = (double)_8a_0.f("s", (Object)var1_1, (long)8122024318648297059L, (long)var3_3);
                                                                                                                        var24_13 = _8a_0.f("s", (Object)this, (Object)v1, (long)8122794239424590715L, (long)var3_3);
                                                                                                                        v2 = new Object[2];
                                                                                                                        v2[1] = var21_12;
                                                                                                                        v2[0] = (double)_8a_0.f("s", (Object)var1_1, (long)8109294854371445123L, (long)var3_3);
                                                                                                                        var25_14 = _8a_0.f("s", (Object)this, (Object)v2, (long)8122794239424590715L, (long)var3_3);
                                                                                                                        v3 = new Object[1];
                                                                                                                        v3[0] = var9_6;
                                                                                                                        var26_15 = _8a_0.f("s", (Object)this, (Object)v3, (long)8110771408363214007L, (long)var3_3);
                                                                                                                        v4 = new Object[1];
                                                                                                                        v4[0] = var5_4;
                                                                                                                        var27_16 = _8a_0.f("s", (Object)this, (Object)v4, (long)8109536091684663576L, (long)var3_3);
                                                                                                                        var28_17 = _8a_0.f("\u00fd", (Object)this, (long)8120694648951131973L, (long)var3_3) + _8a_0.d("g", (int)18286, (long)(6332030278805012479L ^ var3_3));
                                                                                                                        var29_18 = _8a_0.d("g", (int)27776, (long)(6525859718599480367L ^ var3_3));
                                                                                                                        var30_19 = _8a_0.d("g", (int)3164, (long)(4210206503214642368L ^ var3_3));
                                                                                                                        var23_20 = _02.cfr_renamed_3();
                                                                                                                        var31_21 = _8a_0.f("\u00fd", (Object)this, (long)8122811873674283923L, (long)var3_3) + _8a_0.d("g", (int)22805, (long)(3953651706802282923L ^ var3_3));
                                                                                                                        var32_22 = var31_21 + var29_18 + _8a_0.d("g", (int)4707, (long)(6568499600626313977L ^ var3_3));
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                v5 = new Object[7];
                                                                                                                                v5[6] = (int)var30_19;
                                                                                                                                v5[5] = (int)var29_18;
                                                                                                                                v5[4] = (int)var28_17;
                                                                                                                                v5[3] = (int)var31_21;
                                                                                                                                v5[2] = (double)var25_14;
                                                                                                                                v5[1] = (double)var24_13;
                                                                                                                                v5[0] = var17_10;
                                                                                                                                v6 = _8a_0.f("s", (Object)this, (Object)v5, (long)8120652573945355918L, (long)var3_3);
                                                                                                                                if (!var23_20) break block73;
                                                                                                                                if (v6 == false) break block74;
                                                                                                                            }
                                                                                                                            catch (MatchException v7) {
                                                                                                                                throw _8a_0.a(v7);
                                                                                                                            }
                                                                                                                            _8a_0.f("q", (Object)this, (int)_8a_0.d("g", (int)763, (long)(2273819829575547466L ^ var3_3)), (long)8121473241861230954L, (long)var3_3);
                                                                                                                            return true;
                                                                                                                        }
                                                                                                                        catch (MatchException v8) {
                                                                                                                            throw _8a_0.a(v8);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    v9 = new Object[7];
                                                                                                                    v9[6] = (int)var30_19;
                                                                                                                    v9[5] = (int)var29_18;
                                                                                                                    v9[4] = (int)var28_17;
                                                                                                                    v9[3] = (int)var32_22;
                                                                                                                    v9[2] = (double)var25_14;
                                                                                                                    v9[1] = (double)var24_13;
                                                                                                                    v9[0] = var17_10;
                                                                                                                    v6 = _8a_0.f("s", (Object)this, (Object)v9, (long)8120652573945355918L, (long)var3_3);
                                                                                                                }
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (!var23_20) break block75;
                                                                                                                        if (v6 == false) break block76;
                                                                                                                    }
                                                                                                                    catch (MatchException v10) {
                                                                                                                        throw _8a_0.a(v10);
                                                                                                                    }
                                                                                                                    _8a_0.f("q", (Object)this, (int)_8a_0.d("g", (int)2059, (long)(4044065075467382927L ^ var3_3)), (long)8121473241861230954L, (long)var3_3);
                                                                                                                    return true;
                                                                                                                }
                                                                                                                catch (MatchException v11) {
                                                                                                                    throw _8a_0.a(v11);
                                                                                                                }
                                                                                                            }
                                                                                                            v6 = _8a_0.f("\u00fd", (Object)this, (long)8120694648951131973L, (long)var3_3) + var27_16 - _8a_0.d("g", (int)26760, (long)(368114294020509731L ^ var3_3));
                                                                                                        }
                                                                                                        var33_23 = v6;
                                                                                                        var34_24 = _8a_0.d("g", (int)6142, (long)(5611814772289728323L ^ var3_3));
                                                                                                        var35_25 = _8a_0.d("g", (int)18212, (long)(5262279790541520791L ^ var3_3));
                                                                                                        var36_26 = _8a_0.f("\u00fd", (Object)this, (long)8122811873674283923L, (long)var3_3) + var26_15 - var34_24 - _8a_0.d("g", (int)17256, (long)(7613642487440980958L ^ var3_3));
                                                                                                        var37_27 = var36_26 - var34_24 - _8a_0.d("g", (int)12101, (long)(3863562024804931552L ^ var3_3));
                                                                                                        var38_28 = var37_27 - var34_24 - _8a_0.d("g", (int)12101, (long)(3863562024804931552L ^ var3_3));
                                                                                                        try {
                                                                                                            try {
                                                                                                                v12 = new Object[7];
                                                                                                                v12[6] = (int)var35_25;
                                                                                                                v12[5] = (int)var34_24;
                                                                                                                v12[4] = (int)var33_23;
                                                                                                                v12[3] = (int)var36_26;
                                                                                                                v12[2] = (double)var25_14;
                                                                                                                v12[1] = (double)var24_13;
                                                                                                                v12[0] = var17_10;
                                                                                                                v13 = _8a_0.f("s", (Object)this, (Object)v12, (long)8120652573945355918L, (long)var3_3);
                                                                                                                if (!var23_20) break block77;
                                                                                                                if (v13 != false) {
                                                                                                                }
                                                                                                                break block78;
                                                                                                            }
                                                                                                            catch (MatchException v14) {
                                                                                                                throw _8a_0.a(v14);
                                                                                                            }
                                                                                                            v15 = new Object[2];
                                                                                                            v15[1] = new HashMap<K, V>(_8a_0.f("\u00fd", (Object)this, (long)8120547905696313393L, (long)var3_3));
                                                                                                            v15[0] = var15_9;
                                                                                                            _8a_0.f("s", (Object)_8a_0.f("\u00fd", (Object)this, (long)8121139245572466403L, (long)var3_3), (Object)v15, (long)8110500482418122317L, (long)var3_3);
                                                                                                            _8a_0.f("s", (Object)_8a_0.f("\u00dc", (long)8109420216876344839L, (long)var3_3), (Object)_8a_0.f("\u00fd", (Object)_8a_0.f("\u00dc", (long)8110825680479367761L, (long)var3_3), (long)8124069312034201279L, (long)var3_3), (long)8123358243404391680L, (long)var3_3);
                                                                                                            return true;
                                                                                                        }
                                                                                                        catch (MatchException v16) {
                                                                                                            throw _8a_0.a(v16);
                                                                                                        }
                                                                                                    }
                                                                                                    v17 = new Object[7];
                                                                                                    v17[6] = (int)var35_25;
                                                                                                    v17[5] = (int)var34_24;
                                                                                                    v17[4] = (int)var33_23;
                                                                                                    v17[3] = (int)var37_27;
                                                                                                    v17[2] = (double)var25_14;
                                                                                                    v17[1] = (double)var24_13;
                                                                                                    v17[0] = var17_10;
                                                                                                    v13 = _8a_0.f("s", (Object)this, (Object)v17, (long)8120652573945355918L, (long)var3_3);
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        if (!var23_20) break block79;
                                                                                                        if (v13 == false) break block80;
                                                                                                    }
                                                                                                    catch (MatchException v18) {
                                                                                                        throw _8a_0.a(v18);
                                                                                                    }
                                                                                                    _8a_0.f("s", (Object)_8a_0.f("\u00dc", (long)8109420216876344839L, (long)var3_3), (Object)_8a_0.f("\u00fd", (Object)_8a_0.f("\u00dc", (long)8110825680479367761L, (long)var3_3), (long)8124069312034201279L, (long)var3_3), (long)8123358243404391680L, (long)var3_3);
                                                                                                    return true;
                                                                                                }
                                                                                                catch (MatchException v19) {
                                                                                                    throw _8a_0.a(v19);
                                                                                                }
                                                                                            }
                                                                                            v20 = new Object[7];
                                                                                            v20[6] = (int)var35_25;
                                                                                            v20[5] = (int)var34_24;
                                                                                            v20[4] = (int)var33_23;
                                                                                            v20[3] = (int)var38_28;
                                                                                            v20[2] = (double)var25_14;
                                                                                            v20[1] = (double)var24_13;
                                                                                            v20[0] = var17_10;
                                                                                            v13 = _8a_0.f("s", (Object)this, (Object)v20, (long)8120652573945355918L, (long)var3_3);
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                if (!var23_20) break block81;
                                                                                                if (v13 == false) break block82;
                                                                                            }
                                                                                            catch (MatchException v21) {
                                                                                                throw _8a_0.a(v21);
                                                                                            }
                                                                                            _8a_0.f("s", (Object)_8a_0.f("\u00fd", (Object)this, (long)8120547905696313393L, (long)var3_3), (long)8123039607328487690L, (long)var3_3);
                                                                                            return true;
                                                                                        }
                                                                                        catch (MatchException v22) {
                                                                                            throw _8a_0.a(v22);
                                                                                        }
                                                                                    }
                                                                                    v13 = var28_17 + var30_19 + _8a_0.d("g", (int)12101, (long)(3863562024804931552L ^ var3_3));
                                                                                }
                                                                                var39_29 = v13;
                                                                                var40_30 = _8a_0.f("\u00fd", (Object)this, (long)8122811873674283923L, (long)var3_3) + _8a_0.d("g", (int)17256, (long)(7613642487440980958L ^ var3_3));
                                                                                try {
                                                                                    try {
                                                                                        v23 = _8a_0.f("\u00fd", (Object)this, (long)8121473241861230954L, (long)var3_3);
                                                                                        if (!var23_20) break block83;
                                                                                        if (v23 != false) break block84;
                                                                                    }
                                                                                    catch (MatchException v24) {
                                                                                        throw _8a_0.a(v24);
                                                                                    }
                                                                                    v25 = var39_29 + _8a_0.d("g", (int)18212, (long)(5262279790541520791L ^ var3_3)) + _8a_0.d("g", (int)5664, (long)(531612476125736603L ^ var3_3));
                                                                                    break block85;
                                                                                }
                                                                                catch (MatchException v26) {
                                                                                    throw _8a_0.a(v26);
                                                                                }
                                                                            }
                                                                            v23 = var39_29;
                                                                        }
                                                                        v25 = v23 + _8a_0.d("g", (int)9778, (long)(5365653542446980789L ^ var3_3));
                                                                    }
                                                                    var41_31 = v25;
                                                                    var42_32 = var26_15 - _8a_0.d("g", (int)16223, (long)(3545062956430706685L ^ var3_3));
                                                                    var43_33 = var27_16 - (var41_31 - _8a_0.f("\u00fd", (Object)this, (long)8120694648951131973L, (long)var3_3)) - _8a_0.d("g", (int)32475, (long)(3332733539157411439L ^ var3_3));
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    v27 = new Object[7];
                                                                                    v27[6] = (int)var43_33;
                                                                                    v27[5] = (int)var42_32;
                                                                                    v27[4] = (int)var41_31;
                                                                                    v27[3] = (int)var40_30;
                                                                                    v27[2] = (double)var25_14;
                                                                                    v27[1] = (double)var24_13;
                                                                                    v27[0] = var17_10;
                                                                                    v28 = _8a_0.f("s", (Object)this, (Object)v27, (long)8120652573945355918L, (long)var3_3);
                                                                                    if (!var23_20) break block86;
                                                                                    if (v28 == false) break block87;
                                                                                }
                                                                                catch (MatchException v29) {
                                                                                    throw _8a_0.a(v29);
                                                                                }
                                                                                v30 = this;
                                                                                if (!var23_20) break block88;
                                                                            }
                                                                            catch (MatchException v31) {
                                                                                throw _8a_0.a(v31);
                                                                            }
                                                                            if (_8a_0.f("\u00fd", (Object)v30, (long)8121473241861230954L, (long)var3_3) != false) break block89;
                                                                        }
                                                                        catch (MatchException v32) {
                                                                            throw _8a_0.a(v32);
                                                                        }
                                                                        v33 = _8a_0.f("\u00fd", (Object)this, (long)8121409692685326565L, (long)var3_3);
                                                                        break block90;
                                                                    }
                                                                    catch (MatchException v34) {
                                                                        throw _8a_0.a(v34);
                                                                    }
                                                                }
                                                                v30 = this;
                                                            }
                                                            v35 = new Object[1];
                                                            v35[0] = var7_5;
                                                            v33 = _8a_0.f("s", (Object)v30, (Object)v35, (long)8122108310582336765L, (long)var3_3);
                                                        }
                                                        var44_34 = v33;
                                                        try {
                                                            try {
                                                                v36 = this;
                                                                if (!var23_20) break block91;
                                                                if (_8a_0.f("\u00fd", (Object)v36, (long)8121473241861230954L, (long)var3_3) != false) break block92;
                                                            }
                                                            catch (MatchException v37) {
                                                                throw _8a_0.a(v37);
                                                            }
                                                            v38 = _8a_0.f("\u00fd", (Object)this, (long)8123508601453163928L, (long)var3_3);
                                                            break block93;
                                                        }
                                                        catch (MatchException v39) {
                                                            throw _8a_0.a(v39);
                                                        }
                                                    }
                                                    v36 = this;
                                                }
                                                v38 = _8a_0.f("\u00fd", (Object)v36, (long)8110292344795612885L, (long)var3_3);
                                            }
                                            var45_35 = v38;
                                            var46_36 = _8a_0.d("g", (int)1423, (long)(3699618819402956055L ^ var3_3));
                                            var47_37 = var45_35 * _8a_0.d("g", (int)13424, (long)(6184535048567639234L ^ var3_3));
                                            var48_38 = var24_13 - var40_30 - 5;
                                            var49_39 = var25_14 - var41_31 - 5;
                                            var50_40 = var48_38 / var46_36;
                                            var51_41 = var49_39 / var46_36;
                                            try {
                                                try {
                                                    try {
                                                        v28 = var50_40;
                                                        if (!var23_20) break block86;
                                                        if (v28 < 0) break block87;
                                                    }
                                                    catch (MatchException v40) {
                                                        throw _8a_0.a(v40);
                                                    }
                                                    v28 = var50_40;
                                                    if (!var23_20) break block86;
                                                }
                                                catch (MatchException v41) {
                                                    throw _8a_0.a(v41);
                                                }
                                                if (v28 >= _8a_0.d("g", (int)20984, (long)(6949464129226746197L ^ var3_3))) break block87;
                                            }
                                            catch (MatchException v42) {
                                                throw _8a_0.a(v42);
                                            }
                                            var52_42 = var47_37 + var51_41 * _8a_0.d("g", (int)20984, (long)(6949464129226746197L ^ var3_3)) + var50_40;
                                            try {
                                                try {
                                                    try {
                                                        v28 = var52_42;
                                                        if (!var23_20) break block86;
                                                        if (v28 < 0) break block87;
                                                    }
                                                    catch (MatchException v43) {
                                                        throw _8a_0.a(v43);
                                                    }
                                                    v28 = var52_42;
                                                    if (!var23_20) break block86;
                                                }
                                                catch (MatchException v44) {
                                                    throw _8a_0.a(v44);
                                                }
                                                if (v28 >= _8a_0.f("s", (Object)var44_34, (long)8120048912531128049L, (long)var3_3)) break block87;
                                            }
                                            catch (MatchException v45) {
                                                throw _8a_0.a(v45);
                                            }
                                            var53_43 = (_73)_8a_0.f("s", (Object)var44_34, (int)var52_42, (long)8123621326264132608L, (long)var3_3);
                                            try {
                                                block95: {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    v46 /* !! */  = _8a_0.f("s", (Object)var1_1, (long)8121352157119763613L, (long)var3_3);
                                                                    if (!var23_20) break block94;
                                                                    if (v46 /* !! */  == false) {
                                                                    }
                                                                    ** GOTO lbl348
                                                                }
                                                                catch (MatchException v47) {
                                                                    throw _8a_0.a(v47);
                                                                }
                                                                v48 = this;
                                                                if (!var23_20) ** GOTO lbl339
                                                            }
                                                            catch (MatchException v49) {
                                                                throw _8a_0.a(v49);
                                                            }
                                                            if (_8a_0.f("s", (Object)_8a_0.f("\u00fd", (Object)v48, (long)8120547905696313393L, (long)var3_3), (Object)_8a_0.f("\u00fd", (Object)var53_43, (long)8124451048790306945L, (long)var3_3), (long)8109802637992670415L, (long)var3_3) == false) break block95;
                                                        }
                                                        catch (MatchException v50) {
                                                            throw _8a_0.a(v50);
                                                        }
                                                        _8a_0.f("s", (Object)_8a_0.f("\u00fd", (Object)this, (long)8120547905696313393L, (long)var3_3), (Object)_8a_0.f("\u00fd", (Object)var53_43, (long)8124451048790306945L, (long)var3_3), (long)8122934334242769793L, (long)var3_3);
                                                        if (var23_20) break block96;
                                                    }
                                                    catch (MatchException v51) {
                                                        throw _8a_0.a(v51);
                                                    }
                                                }
                                                v48 = this;
                                            }
                                            catch (MatchException v52) {
                                                throw _8a_0.a(v52);
                                            }
lbl339:
                                            // 2 sources

                                            v53 = new Object[2];
                                            v53[1] = _8a_0.f("\u00fd", (Object)var53_43, (long)8124451048790306945L, (long)var3_3);
                                            v53[0] = var19_11;
                                            var54_44 = _8a_0.f("s", (Object)v48, (Object)v53, (long)8123918040923561237L, (long)var3_3);
                                            try {
                                                _8a_0.f("s", (Object)_8a_0.f("\u00fd", (Object)this, (long)8120547905696313393L, (long)var3_3), (Object)_8a_0.f("\u00fd", (Object)var53_43, (long)8124451048790306945L, (long)var3_3), (Object)var54_44, (long)8122592454368370319L, (long)var3_3);
                                                if (var23_20) break block96;
lbl348:
                                                // 2 sources

                                                v46 /* !! */  = _8a_0.f("s", (Object)var1_1, (long)8121352157119763613L, (long)var3_3);
                                            }
                                            catch (MatchException v54) {
                                                throw _8a_0.a(v54);
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (!var23_20) break block97;
                                                    if (v46 /* !! */  != true) break block96;
                                                }
                                                catch (MatchException v55) {
                                                    throw _8a_0.a(v55);
                                                }
                                                v56 = _8a_0.f("\u00fd", (Object)this, (long)8120547905696313393L, (long)var3_3);
                                                v57 = _8a_0.f("\u00fd", (Object)var53_43, (long)8124451048790306945L, (long)var3_3);
                                                if (!var23_20) break block98;
                                            }
                                            catch (MatchException v58) {
                                                throw _8a_0.a(v58);
                                            }
                                            if (_8a_0.f("s", (Object)v56, (Object)v57, (long)8109802637992670415L, (long)var3_3) == false) {
                                            }
                                            break block99;
                                        }
                                        catch (MatchException v59) {
                                            throw _8a_0.a(v59);
                                        }
                                        v60 = new Object[2];
                                        v60[1] = _8a_0.f("\u00fd", (Object)var53_43, (long)8124451048790306945L, (long)var3_3);
                                        v60[0] = var19_11;
                                        var54_44 = _8a_0.f("s", (Object)this, (Object)v60, (long)8123918040923561237L, (long)var3_3);
                                        _8a_0.f("s", (Object)_8a_0.f("\u00fd", (Object)this, (long)8120547905696313393L, (long)var3_3), (Object)_8a_0.f("\u00fd", (Object)var53_43, (long)8124451048790306945L, (long)var3_3), (Object)var54_44, (long)8122592454368370319L, (long)var3_3);
                                    }
                                    v56 = _8a_0.f("\u00fd", (Object)this, (long)8120547905696313393L, (long)var3_3);
                                    v57 = _8a_0.f("\u00fd", (Object)var53_43, (long)8124451048790306945L, (long)var3_3);
                                }
                                var54_44 = (_8B)_8a_0.f("s", (Object)v56, (Object)v57, (long)8123106128859489305L, (long)var3_3);
                                var55_45 = _8a_0.f("\u00fd", (Object)var53_43, (long)8110085068688056761L, (long)var3_3);
                                try {
                                    try {
                                        v61 = var55_45;
                                        if (!var23_20) break block100;
                                        if (_8a_0.f("s", (Object)v61, (long)8120829028708103845L, (long)var3_3) <= _8a_0.d("g", (int)17256, (long)(7613642487440980958L ^ var3_3))) break block101;
                                    }
                                    catch (MatchException v62) {
                                        throw _8a_0.a(v62);
                                    }
                                    v61 = (String)_8a_0.f("s", (Object)var55_45, (int)0, (int)_8a_0.d("g", (int)18594, (long)(699302682116927499L ^ var3_3)), (long)8122427265950015932L, (long)var3_3) + (String)_8a_0.b("x", (int)24802, (long)(8840534757810694058L ^ var3_3));
                                }
                                catch (MatchException v63) {
                                    throw _8a_0.a(v63);
                                }
                            }
                            var55_45 = v61;
                        }
                        _8a_0.f("s", (Object)_8a_0.f("\u00dc", (long)8109420216876344839L, (long)var3_3), (Object)new _0b((String)var55_45, (_8B)var54_44, (Consumer<_8B>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, 3(dev.krypton.73 long dev.krypton.8B ), (Ldev/krypton/8B;)V)((_8a_0)this, (_73)var53_43, (long)var11_7), (class_437)this, var13_8), (long)8123358243404391680L, (long)var3_3);
                    }
                    v46 /* !! */  = (CallSite)true;
                }
                return (boolean)v46 /* !! */ ;
            }
            v28 = (reference)super.method_25402(var1_1, var2_2);
        }
        return (boolean)v28;
    }

    private _8B dev_krypton_8B_6(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        class_1299 class_12992 = (class_1299)objectArray[1];
        long l3 = (l2 = b ^ l2) ^ 0x527C04E7845AL;
        CallSite callSite = _8a_0.f("s", (Object)_8a_0.f("s", (Object)_8a_0.f("\u00dc", -4173795546105913575L, (long)l2), (Object)class_12992, -4174634701566857047L, (long)l2), -4172261598827088946L, (long)l2);
        Random random = new Random((long)callSite);
        reference var9_7 = _8a_0.d("g", 4143, (long)(0x484871432D95E3FL ^ l2)) + _8a_0.f("s", (Object)random, (int)_8a_0.d("g", 7933, (long)(0x4D1C0153FDEBD0E8L ^ l2)), -4170896709726279368L, (long)l2);
        reference var10_8 = _8a_0.d("g", 4143, (long)(0x484871432D95E3FL ^ l2)) + _8a_0.f("s", (Object)random, (int)_8a_0.d("g", 2932, (long)(0x10DB8163464E455BL ^ l2)), -4170896709726279368L, (long)l2);
        reference var11_9 = _8a_0.d("g", 4143, (long)(0x484871432D95E3FL ^ l2)) + _8a_0.f("s", (Object)random, (int)_8a_0.d("g", 2932, (long)(0x10DB8163464E455BL ^ l2)), -4170896709726279368L, (long)l2);
        return new _8B((int)var9_7, (int)var10_8, l3, (int)var11_9, (int)_8a_0.d("g", 14506, (long)(0x3CC277E94069F680L ^ l2)));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean method_25401(double var1_1, double var3_2, double var5_3, double var7_4) {
        block42: {
            block43: {
                block51: {
                    block50: {
                        block52: {
                            block47: {
                                block48: {
                                    block46: {
                                        block44: {
                                            block45: {
                                                block41: {
                                                    block39: {
                                                        block40: {
                                                            v0 = var9_5 = _8a_0.b ^ 40263168374906L;
                                                            var11_6 = v0 ^ 15328434129918L;
                                                            var13_7 = v0 ^ 129222233488405L;
                                                            var15_8 = v0 ^ 136188028348951L;
                                                            var17_9 = v0 ^ 42719428834507L;
                                                            var1_1 *= (double)_8a_0.f("s", (Object)_8a_0.f("s", (Object)_8a_0.f("\u00dc", (long)-7633786033951555454L, (long)var9_5), (long)-7635139962112136451L, (long)var9_5), (long)-7633728930119215023L, (long)var9_5);
                                                            var3_2 *= (double)_8a_0.f("s", (Object)_8a_0.f("s", (Object)_8a_0.f("\u00dc", (long)-7633786033951555454L, (long)var9_5), (long)-7635139962112136451L, (long)var9_5), (long)-7633728930119215023L, (long)var9_5);
                                                            v1 = new Object[1];
                                                            v1[0] = var15_8;
                                                            var20_10 = _8a_0.f("s", (Object)this, (Object)v1, (long)-7635266941773303246L, (long)var9_5);
                                                            v2 = new Object[1];
                                                            v2[0] = var11_6;
                                                            var21_11 = _8a_0.f("s", (Object)this, (Object)v2, (long)-7633611611795548259L, (long)var9_5);
                                                            var22_12 = _8a_0.f("\u00fd", (Object)this, (long)-7622436416297489984L, (long)var9_5) + _8a_0.d("g", (int)16223, (long)(3545103995167121784L ^ var9_5));
                                                            var23_13 = var22_12 + _8a_0.d("g", (int)18212, (long)(5262303479640250642L ^ var9_5)) + _8a_0.d("g", (int)12101, (long)(3863538200410337637L ^ var9_5));
                                                            var19_14 = _02.cfr_renamed_3();
                                                            var24_15 = _8a_0.f("\u00fd", (Object)this, (long)-7620322669004739306L, (long)var9_5) + _8a_0.d("g", (int)17256, (long)(7613683938947390811L ^ var9_5));
                                                            try {
                                                                try {
                                                                    v3 = _8a_0.f("\u00fd", (Object)this, (long)-7624472850769283089L, (long)var9_5);
                                                                    if (!var19_14) break block39;
                                                                    if (v3 != false) break block40;
                                                                }
                                                                catch (MatchException v4) {
                                                                    throw _8a_0.a(v4);
                                                                }
                                                                v5 = var23_13 + _8a_0.d("g", (int)18212, (long)(5262303479640250642L ^ var9_5)) + _8a_0.d("g", (int)9778, (long)(5365629676145195056L ^ var9_5));
                                                                break block41;
                                                            }
                                                            catch (MatchException v6) {
                                                                throw _8a_0.a(v6);
                                                            }
                                                        }
                                                        v3 = var23_13;
                                                    }
                                                    v5 = v3 + _8a_0.d("g", (int)9778, (long)(5365629676145195056L ^ var9_5));
                                                }
                                                var25_16 = v5;
                                                var26_17 = var20_10 - _8a_0.d("g", (int)16223, (long)(3545103995167121784L ^ var9_5));
                                                var27_18 = var21_11 - (var25_16 - _8a_0.f("\u00fd", (Object)this, (long)-7622436416297489984L, (long)var9_5)) - _8a_0.d("g", (int)23093, (long)(6407624838223479854L ^ var9_5));
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                v7 = new Object[7];
                                                                v7[6] = (int)var27_18;
                                                                v7[5] = (int)var26_17;
                                                                v7[4] = (int)var25_16;
                                                                v7[3] = (int)var24_15;
                                                                v7[2] = var3_2;
                                                                v7[1] = var1_1;
                                                                v7[0] = var17_9;
                                                                v8 /* !! */  = _8a_0.f("s", (Object)this, (Object)v7, (long)-7622499834134775797L, (long)var9_5);
                                                                if (!var19_14) break block42;
                                                                if (v8 /* !! */  == false) break block43;
                                                            }
                                                            catch (MatchException v9) {
                                                                throw _8a_0.a(v9);
                                                            }
                                                            v10 = this;
                                                            if (!var19_14) break block44;
                                                        }
                                                        catch (MatchException v11) {
                                                            throw _8a_0.a(v11);
                                                        }
                                                        if (_8a_0.f("\u00fd", (Object)v10, (long)-7624472850769283089L, (long)var9_5) != false) break block45;
                                                    }
                                                    catch (MatchException v12) {
                                                        throw _8a_0.a(v12);
                                                    }
                                                    v13 = _8a_0.f("\u00fd", (Object)this, (long)-7624557185504133536L, (long)var9_5);
                                                    break block46;
                                                }
                                                catch (MatchException v14) {
                                                    throw _8a_0.a(v14);
                                                }
                                            }
                                            v10 = this;
                                        }
                                        v15 = new Object[1];
                                        v15[0] = var13_7;
                                        v13 = _8a_0.f("s", (Object)v10, (Object)v15, (long)-7623841221840864648L, (long)var9_5);
                                    }
                                    var28_19 = v13;
                                    var29_20 = (int)_8a_0.f("t", (double)((double)_8a_0.f("s", (Object)var28_19, (long)-7623151875138447244L, (long)var9_5) / 11.0), (long)-7622257786289724682L, (long)var9_5);
                                    var30_21 = _8a_0.f("t", (int)0, (int)(var29_20 - _8a_0.d("g", (int)29792, (long)(8115237483165018706L ^ var9_5))), (long)-7621281242603794047L, (long)var9_5);
                                    try {
                                        block49: {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            v16 /* !! */  = _8a_0.f("\u00fd", (Object)this, (long)-7624472850769283089L, (long)var9_5);
                                                            if (!var19_14) break block47;
                                                            if (v16 /* !! */  == false) {
                                                            }
                                                            ** GOTO lbl132
                                                        }
                                                        catch (MatchException v17) {
                                                            throw _8a_0.a(v17);
                                                        }
                                                        cfr_temp_0 = var7_4 - 0.0;
                                                        v16 /* !! */  = (CallSite)(cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1));
                                                        if (!var19_14) break block48;
                                                    }
                                                    catch (MatchException v18) {
                                                        throw _8a_0.a(v18);
                                                    }
                                                    if (v16 /* !! */  <= 0) break block49;
                                                }
                                                catch (MatchException v19) {
                                                    throw _8a_0.a(v19);
                                                }
                                                _8a_0.f("q", (Object)this, (int)_8a_0.f("t", (int)0, (int)(_8a_0.f("\u00fd", (Object)this, (long)-7621873167421549795L, (long)var9_5) - true), (long)-7621281242603794047L, (long)var9_5), (long)-7621873167421549795L, (long)var9_5);
                                                if (var19_14) break block50;
                                            }
                                            catch (MatchException v20) {
                                                throw _8a_0.a(v20);
                                            }
                                        }
                                        v16 /* !! */  = (CallSite)((cfr_temp_1 = var7_4 - 0.0) == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1));
                                    }
                                    catch (MatchException v21) {
                                        throw _8a_0.a(v21);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            if (!var19_14) break block51;
                                            if (v16 /* !! */  >= 0) break block50;
                                        }
                                        catch (MatchException v22) {
                                            throw _8a_0.a(v22);
                                        }
                                        _8a_0.f("q", (Object)this, (int)_8a_0.f("t", (int)var30_21, (int)(_8a_0.f("\u00fd", (Object)this, (long)-7621873167421549795L, (long)var9_5) + true), (long)-7622139201541861320L, (long)var9_5), (long)-7621873167421549795L, (long)var9_5);
                                        if (var19_14) break block50;
                                    }
                                    catch (MatchException v23) {
                                        throw _8a_0.a(v23);
                                    }
lbl132:
                                    // 2 sources

                                    v16 /* !! */  = (CallSite)((cfr_temp_2 = var7_4 - 0.0) == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1));
                                }
                                catch (MatchException v24) {
                                    throw _8a_0.a(v24);
                                }
                            }
                            try {
                                block53: {
                                    try {
                                        try {
                                            if (!var19_14) break block52;
                                            if (v16 /* !! */  <= 0) break block53;
                                        }
                                        catch (MatchException v25) {
                                            throw _8a_0.a(v25);
                                        }
                                        _8a_0.f("q", (Object)this, (int)_8a_0.f("t", (int)0, (int)(_8a_0.f("\u00fd", (Object)this, (long)-7635675742307671984L, (long)var9_5) - true), (long)-7621281242603794047L, (long)var9_5), (long)-7635675742307671984L, (long)var9_5);
                                        if (var19_14) break block50;
                                    }
                                    catch (MatchException v26) {
                                        throw _8a_0.a(v26);
                                    }
                                }
                                v16 /* !! */  = (CallSite)((cfr_temp_3 = var7_4 - 0.0) == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1));
                            }
                            catch (MatchException v27) {
                                throw _8a_0.a(v27);
                            }
                        }
                        try {
                            try {
                                if (!var19_14) break block51;
                                if (v16 /* !! */  >= 0) break block50;
                            }
                            catch (MatchException v28) {
                                throw _8a_0.a(v28);
                            }
                            _8a_0.f("q", (Object)this, (int)_8a_0.f("t", (int)var30_21, (int)(_8a_0.f("\u00fd", (Object)this, (long)-7635675742307671984L, (long)var9_5) + true), (long)-7622139201541861320L, (long)var9_5), (long)-7635675742307671984L, (long)var9_5);
                        }
                        catch (MatchException v29) {
                            throw _8a_0.a(v29);
                        }
                    }
                    v16 /* !! */  = (CallSite)true;
                }
                return (boolean)v16 /* !! */ ;
            }
            v8 /* !! */  = (CallSite)super.method_25401(var1_1, var3_2, var5_3, var7_4);
        }
        return (boolean)v8 /* !! */ ;
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
                                long l5 = l3 = b ^ 0x3CED34D775A6L;
                                l2 = l5 ^ 0x781DAFD7811DL;
                                l4 = l5 ^ 0x24044BE8146CL;
                                bl = _02.cfr_renamed_3();
                                try {
                                    try {
                                        object = _8a_0.f("s", (Object)class_119082, -2600065744782858604L, (long)l3);
                                        if (!bl) break block18;
                                        if (object == _8a_0.d("g", 19383, (long)(0x323177A26431987EL ^ l3))) {
                                        }
                                        break block19;
                                    }
                                    catch (MatchException matchException) {
                                        throw _8a_0.a(matchException);
                                    }
                                    Object[] objectArray = new Object[2];
                                    objectArray[1] = new HashMap(_8a_0.f("\u00fd", (Object)this, -2600607181469410456L, (long)l3));
                                    objectArray[0] = l2;
                                    _8a_0.f("s", (Object)_8a_0.f("\u00fd", (Object)this, -2599377592542229062L, (long)l3), (Object)objectArray, -2605477588325944044L, (long)l3);
                                    _8a_0.f("s", (Object)_8a_0.f("\u00dc", -2606668843066290850L, (long)l3), (Object)_8a_0.f("\u00fd", (Object)_8a_0.f("\u00dc", -2605822506897303288L, (long)l3), -2601023154712283674L, (long)l3), -2602300413308727719L, (long)l3);
                                    return true;
                                }
                                catch (MatchException matchException) {
                                    throw _8a_0.a(matchException);
                                }
                            }
                            object = _8a_0.f("\u00fd", (Object)this, -2599572979699992013L, (long)l3);
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (!bl) break block20;
                                        if (object != false) break block21;
                                    }
                                    catch (MatchException matchException) {
                                        throw _8a_0.a(matchException);
                                    }
                                    Object[] objectArray = new Object[2];
                                    objectArray[1] = l4;
                                    objectArray[0] = class_119082;
                                    object = _8a_0.f("s", (Object)_8a_0.f("\u00fd", (Object)this, -2605438678023065777L, (long)l3), (Object)objectArray, -2602439643662517145L, (long)l3);
                                    if (!bl) break block20;
                                }
                                catch (MatchException matchException) {
                                    throw _8a_0.a(matchException);
                                }
                                if (object == false) break block21;
                            }
                            catch (MatchException matchException) {
                                throw _8a_0.a(matchException);
                            }
                            return true;
                        }
                        catch (MatchException matchException) {
                            throw _8a_0.a(matchException);
                        }
                    }
                    object = _8a_0.f("s", (Object)class_119082, -2600065744782858604L, (long)l3);
                }
                try {
                    try {
                        if (!bl) break block22;
                        if (object == _8a_0.d("g", 23685, (long)(0x2BB1023E7530F47L ^ l3))) {
                        }
                        break block23;
                    }
                    catch (MatchException matchException) {
                        throw _8a_0.a(matchException);
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = new HashMap(_8a_0.f("\u00fd", (Object)this, -2600607181469410456L, (long)l3));
                    objectArray[0] = l2;
                    _8a_0.f("s", (Object)_8a_0.f("\u00fd", (Object)this, -2599377592542229062L, (long)l3), (Object)objectArray, -2605477588325944044L, (long)l3);
                    _8a_0.f("s", (Object)_8a_0.f("\u00dc", -2606668843066290850L, (long)l3), (Object)_8a_0.f("\u00fd", (Object)_8a_0.f("\u00dc", -2605822506897303288L, (long)l3), -2601023154712283674L, (long)l3), -2602300413308727719L, (long)l3);
                    return true;
                }
                catch (MatchException matchException) {
                    throw _8a_0.a(matchException);
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
                long l2 = b ^ 0x2EECFFCD3FD0L;
                long l3 = l2 ^ 0x52778F3A5202L;
                boolean bl = _02.cfr_renamed_3();
                try {
                    try {
                        object = _8a_0.f("\u00fd", (Object)this, -7954935685438410683L, (long)l2);
                        if (!bl) break block4;
                        if (object != false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _8a_0.a(matchException);
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = class_119052;
                    objectArray[0] = l3;
                    return (boolean)_8a_0.f("s", (Object)_8a_0.f("\u00fd", (Object)this, -7952920082235693767L, (long)l2), (Object)objectArray, -7957260342991653093L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _8a_0.a(matchException);
                }
            }
            object = true;
        }
        return (boolean)object;
    }

    private void cfr_renamed_2(long l2) {
        block9: {
            block10: {
                CallSite callSite;
                long l3;
                int n;
                block6: {
                    long l4 = l2 = b ^ l2;
                    long l5 = l4 ^ 0x7507DCD72792L;
                    long l6 = l4 ^ 0x3F8910421C7FL;
                    n = (int)(l6 >>> 56);
                    l3 = l6 << 8 >>> 8;
                    boolean bl = _02.cfr_renamed_2();
                    try {
                        CallSite callSite2;
                        long l7;
                        long l8;
                        block7: {
                            block8: {
                                try {
                                    try {
                                        Object[] objectArray = new Object[1];
                                        objectArray[0] = l5;
                                        callSite = _8a_0.f("s", (Object)_8a_0.f("\u00fd", (Object)this, 588482452338703538L, (long)l2), (Object)objectArray, 581767451786743709L, (long)l2);
                                        if (bl) break block6;
                                        l8 = 581567006683359671L;
                                        l7 = l2;
                                        if (l2 < 0L) break block7;
                                        if (_8a_0.f("s", (Object)callSite, (long)l8, (long)l7) == false) break block8;
                                    }
                                    catch (MatchException matchException) {
                                        throw _8a_0.a(matchException);
                                    }
                                    _8a_0.f("q", (Object)this, new ArrayList(_8a_0.f("\u00fd", (Object)this, 585395833599260776L, (long)l2)), 581266915586744385L, (long)l2);
                                    if (l2 < 0L) break block9;
                                    if (!bl) break block10;
                                }
                                catch (MatchException matchException) {
                                    throw _8a_0.a(matchException);
                                }
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l5;
                            callSite2 = _8a_0.f("s", (Object)_8a_0.f("\u00fd", (Object)this, 588482452338703538L, (long)l2), (Object)objectArray, 581767451786743709L, (long)l2);
                            l8 = 581937410112320264L;
                            l7 = l2;
                        }
                        callSite = _8a_0.f("s", (Object)callSite2, (long)l8, (long)l7);
                    }
                    catch (MatchException matchException) {
                        throw _8a_0.a(matchException);
                    }
                }
                CallSite callSite3 = callSite;
                _8a_0.f("q", (Object)this, (List)((List)((Object)_8a_0.f("s", (Object)_8a_0.f("s", (Object)_8a_0.f("s", (Object)_8a_0.f("\u00fd", (Object)this, 585395833599260776L, (long)l2), 583070063979893946L, (long)l2), arg_0 -> _8a_0.cfr_renamed_4((byte)n, l3, (String)((Object)callSite3), arg_0), 581134022712352981L, (long)l2), (Object)_8a_0.f("t", 582232488726657573L, (long)l2), 588246062046331385L, (long)l2))), 581266915586744385L, (long)l2);
            }
            _8a_0.f("q", (Object)this, (int)_8a_0.d("g", 3686, (long)(0x6F0B7E534FA80E7AL ^ l2)), 583383485543238972L, (long)l2);
        }
    }

    private static boolean cfr_renamed_4(byte by, long l2, String string, _73 var4_3) {
        long l3 = ((long)by << 56 | l2 << 8 >>> 8) ^ b;
        return (boolean)_8a_0.f("s", (Object)_8a_0.f("s", (Object)_8a_0.f("\u00fd", (Object)var4_3, -5042160145584018637L, (long)l3), -5026855370381999834L, (long)l3), (Object)string, -5028191046452117365L, (long)l3);
    }

    private void cfr_renamed_6(_73 var1_1, long l2, _8B b) {
        l2 = _8a_0.b ^ l2;
        _8a_0.f("s", (Object)_8a_0.f("\u00fd", (Object)this, -1072791154806509156L, (long)l2), (Object)_8a_0.f("\u00fd", (Object)var1_1, -1075643135805902548L, (long)l2), (Object)b, -1075116049941881054L, (long)l2);
    }

    private static String cfr_renamed_8(long l2, _73 var2_1) {
        l2 = b ^ l2;
        return _8a_0.f("\u00fd", (Object)var2_1, 6507978169827380069L, (long)l2);
    }

    private void cfr_renamed_7(long l2, class_1792 class_17922) {
        block8: {
            class_1792 class_17923;
            long l3;
            block7: {
                l3 = (l2 = b ^ l2) ^ 0x6D6AC3A2812DL;
                boolean bl = _02.cfr_renamed_3();
                try {
                    try {
                        class_17923 = class_17922;
                        if (!bl) break block7;
                        if (!(class_17923 instanceof class_1826)) break block8;
                    }
                    catch (MatchException matchException) {
                        throw _8a_0.a(matchException);
                    }
                    class_17923 = class_17922;
                }
                catch (MatchException matchException) {
                    throw _8a_0.a(matchException);
                }
            }
            class_1826 class_18262 = (class_1826)class_17923;
            CallSite callSite = _8a_0.f("s", (Object)class_18262, (Object)_8a_0.f("s", (Object)class_17922, 4422238484580708606L, (long)l2), 4420970502412136797L, (long)l2);
            try {
                if (l2 > 0L && callSite != null) {
                    _8a_0.f("s", (Object)_8a_0.f("\u00fd", (Object)this, 4419628609036438818L, (long)l2), (Object)new _73((class_1299)callSite, l3, class_17922), 4421385602754839288L, (long)l2);
                }
            }
            catch (MatchException matchException) {
                throw _8a_0.a(matchException);
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
                        _8a_0.b = dev.krypton.l.a(-4429517558928492263L, 4567883404892787724L, MethodHandles.lookup().lookupClass()).a(21724642341701L);
                        _8a_0.q = new Object[153];
                        _8a_0.r = new String[153];
                        _8a_0.b();
                        _8a_0.h = new HashMap<K, V>(13);
                        var11 = _8a_0.b ^ 128368725963012L;
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
                        var20_3 = new String[14];
                        var18_4 = 0;
                        var17_5 = "n\u0082\u00a3`\u00df\u008d]\u0018\n\u00aam\u001c\u0086~u\u008d\u00d3\u009b\u00d7u\u00c0\u00b9\u00aae\u00a1\u0014\u009avI\u00ff)\u00baz\u00d7\u0013\u00c1l{\u0098\u0001|J\u00e9\u009a\u00bc\u00d4>\u00df \u0095\u00a5P\u00b6\u00a6\u00d3\u00d9\u00dd\u00de\u00fam\u0001\u0080\u00a4\u00fe\u00e3\u007f\u00ff\u0010\u0099o\u00bf\u00a2\u0096\td\u00d0I\u0098\u00ff,\u0080\u0010\u001e\u0089h\u0018!\u00c0\u0089\u0019\u009a|\u00a3\u0080\u0005\u0095\u00e4x\u0018b\u00eb_R\u00c3U\u000b\u0018&\"\u0085\u0005\u00c8\u0017\u00af\u0000\u00f1p@\u0087\u001f\u000b\bA\u0010c\u00ef\u00d9\u00dfb\u009dM\u008c\u00d0\u00f1$\u00e9\u0012\u00ce\u008a\u00ff >\u00b8\u00fd`\u001b\u0017!qL}X\u00f2\f\u00d2%8~r=48a\u00e50\u0014\u009b\u0017\u00bf\u0084.\u00d9  \u00e8\u00bd\u009f\u00e2Tqf\u00cbs\fc_\u00e4\u00999\u009a\u00df\u0097f\u00e8\u00b8^\u00be\"\u0091\u00e8\u00e7F\u00cb\fL\u0003\u0010\u00f4\u008f\u008a\u00cf\"\u00ff%\u00e0\u007f+\u0012\u0088[q\t\u00e5\u0018\u00ea\u00e3\u00b5\u00cei9\u00dd=>m\u00a4\u0006i}zF\u0095\u0089u\"\u00c6\u00beS\u00c1\u0010\u00ce\u00d9)Y\u00b1@\u00a9\u00da\u00f2/T\u00deG\u00d04}\u0018|\u0086\u00f1_\u00a6\u00e7A\u0085h\u0083\u00d4G\u0084T\u00e7\u00f4\u00d8\u0017mL\u0001\u00c47A\u0018\u00c9.\u00b6\u00b7\u00ca\u0097\u00bf\u007fN&If\u000f\u0096\u0088\u0096\u00b2y\u007f\u0094\u00d3Q=\u0092";
                        var19_6 = "n\u0082\u00a3`\u00df\u008d]\u0018\n\u00aam\u001c\u0086~u\u008d\u00d3\u009b\u00d7u\u00c0\u00b9\u00aae\u00a1\u0014\u009avI\u00ff)\u00baz\u00d7\u0013\u00c1l{\u0098\u0001|J\u00e9\u009a\u00bc\u00d4>\u00df \u0095\u00a5P\u00b6\u00a6\u00d3\u00d9\u00dd\u00de\u00fam\u0001\u0080\u00a4\u00fe\u00e3\u007f\u00ff\u0010\u0099o\u00bf\u00a2\u0096\td\u00d0I\u0098\u00ff,\u0080\u0010\u001e\u0089h\u0018!\u00c0\u0089\u0019\u009a|\u00a3\u0080\u0005\u0095\u00e4x\u0018b\u00eb_R\u00c3U\u000b\u0018&\"\u0085\u0005\u00c8\u0017\u00af\u0000\u00f1p@\u0087\u001f\u000b\bA\u0010c\u00ef\u00d9\u00dfb\u009dM\u008c\u00d0\u00f1$\u00e9\u0012\u00ce\u008a\u00ff >\u00b8\u00fd`\u001b\u0017!qL}X\u00f2\f\u00d2%8~r=48a\u00e50\u0014\u009b\u0017\u00bf\u0084.\u00d9  \u00e8\u00bd\u009f\u00e2Tqf\u00cbs\fc_\u00e4\u00999\u009a\u00df\u0097f\u00e8\u00b8^\u00be\"\u0091\u00e8\u00e7F\u00cb\fL\u0003\u0010\u00f4\u008f\u008a\u00cf\"\u00ff%\u00e0\u007f+\u0012\u0088[q\t\u00e5\u0018\u00ea\u00e3\u00b5\u00cei9\u00dd=>m\u00a4\u0006i}zF\u0095\u0089u\"\u00c6\u00beS\u00c1\u0010\u00ce\u00d9)Y\u00b1@\u00a9\u00da\u00f2/T\u00deG\u00d04}\u0018|\u0086\u00f1_\u00a6\u00e7A\u0085h\u0083\u00d4G\u0084T\u00e7\u00f4\u00d8\u0017mL\u0001\u00c47A\u0018\u00c9.\u00b6\u00b7\u00ca\u0097\u00bf\u007fN&If\u000f\u0096\u0088\u0096\u00b2y\u007f\u0094\u00d3Q=\u0092".length();
                        var16_7 = 48;
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
                            var20_3[var18_4++] = _8a_0.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00fb\u00a2i;\u00c4n\u00e8\u00c7\u00d2\u00d8\u0016|\u0089\u00eeY\u00a2\u0018\u0002\u0015\u00bdp\b\u0010`u\u0082\u009f\u0012,\u00f1P\"dQ\u0082\u00cb\u00a1^{\u00d8\u0018";
                            var19_6 = "\u00fb\u00a2i;\u00c4n\u00e8\u00c7\u00d2\u00d8\u0016|\u0089\u00eeY\u00a2\u0018\u0002\u0015\u00bdp\b\u0010`u\u0082\u009f\u0012,\u00f1P\"dQ\u0082\u00cb\u00a1^{\u00d8\u0018".length();
                            var16_7 = 16;
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
                            var20_3[var18_4++] = _8a_0.b(var21_9).intern();
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
                _8a_0.f = var20_3;
                _8a_0.g = new String[14];
                _8a_0.n = new HashMap<K, V>(13);
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
                var6_12 = new long[56];
                var3_13 = 0;
                var4_14 = "\u00fe3_$\u00fcV<\u008ac\u00c9\u00ab\u0015t\u00fbt\u009b\u0092\u00d6f\u0088\u00cd5\u001a\u001b\u00a9\u0007\u00f7\u0085\u00ee\u00ff_\u00cb\u00bcl\u0003\u0092\u00aa\u00c4\u00bc'g#\u00b0\u008c[d\u00cf\u00cf9\u00c9V\u00c9\u00d1\u00cf\u001b\u00b4\u00f4\u0018\u00fe\u00b2b\u0002\u00b8Y\u00c3w\u008f\u0083N\u00a9\u0018&]\u0001\u000f\u00b7}.\u0080R\u00f6\u00a0\u0092P\u00a7\b\u00cb{\u009d\u00d26\u00a6^\u0017=\u00d9\u00cb\nNBg\u00d9\u0084\u00f7\u008b\u00efY\u00a2\u00e5\u00bb\u00c5\u0003\u00de\u00c8@H\u00eaO,\u009b\r\u000e\u008e\"X\u00eeB\u00061\u00c3\n\u00e8\u00c0z\u00c4\u008fh\u00be\u0014=_\u00fb\u008f4N\u0002\u009fW\u00dd\u001d\u00aa)\u00f9B\u00e1\u00b5\u00bb\u00bb\u00ef]-\u00ac\u0002,-\u00a5D\u00be\u00c8{\u00c8\u0082\u00c6\u00e7\u00a8\u00c4\u00a0#9\u00d0\u0082V\u0080\u0096\u00c2?\u0010\u00b3p\u0097\u00ef\u00aa\u0085\u0099\u00a3JXq\u00bd\u00ac>\u00dcZ\r1\u000b4\u00cf3f,\tZ\u0086v\u00ec\u00ea\u00a1\u00b5\u008er\\\u008a\u00b3\u0095\u0090\u000b9\u0001$\u008e\u00f7\u00be\u00e6\u0083,3\u000b\u00e3\u00b4@}xMQ\u001a\u00e2\u00160\\\u00f1\u00ac\u00ee\u0016\u0095\u00a5\u0083\u00f6\u00b0\u00bd\u00fc\u0012\u00e4\u0015\u00dat\u0007W\u00bcS\u00edK$\u0013\u00b4YX\u00d9V!av\u00a9F\u001b\u0000K\u00a5\u0090\u00d5\u00f0Re\u00f8I\u00a1\u00b8Me\u009a%G\u0092\u00b5\u0004\u00d3\u0087\u00fc\u00ebGs\u0085!\u00a7\u00e2\u0007\u00a9\u0096\u00d3\u00c3\u00d7*\u0001\u00f8}8\u00d4\u00fc\u0004M\u0090Q<\u00a96\u00fe\u0097U\u00f6\u009b\u00ba\u00b2\u00dfy\u00fc\u00b5\u0016&\u00f8\u00cde\u0095a\u0003\u0006\u0014\u00a1y\u00c5j\u00f3\u00d5XO\u00dan\u00f4\u000f\u00b8\u00a7\u00dd\u00ad\u0080\u0089\u00ddJ9\f7\u00e1\u00bcQ\u00c8eI\u0084=\u0089=\u00f8\u0018\u00fa\u0019\"\u00ae\u00a2\u00e4\u00f6'\u00a4\u001c\u00e1\u0007)\u000f\u00f0\u00c2\ng\u00b1\u00bf`\u00c5\u0005\u00d5\u009e(Z*\u00a5\u0088\u00d2\u00bb{\u0014Z\u00dfc\u008fNP\u00cc";
                var5_15 = "\u00fe3_$\u00fcV<\u008ac\u00c9\u00ab\u0015t\u00fbt\u009b\u0092\u00d6f\u0088\u00cd5\u001a\u001b\u00a9\u0007\u00f7\u0085\u00ee\u00ff_\u00cb\u00bcl\u0003\u0092\u00aa\u00c4\u00bc'g#\u00b0\u008c[d\u00cf\u00cf9\u00c9V\u00c9\u00d1\u00cf\u001b\u00b4\u00f4\u0018\u00fe\u00b2b\u0002\u00b8Y\u00c3w\u008f\u0083N\u00a9\u0018&]\u0001\u000f\u00b7}.\u0080R\u00f6\u00a0\u0092P\u00a7\b\u00cb{\u009d\u00d26\u00a6^\u0017=\u00d9\u00cb\nNBg\u00d9\u0084\u00f7\u008b\u00efY\u00a2\u00e5\u00bb\u00c5\u0003\u00de\u00c8@H\u00eaO,\u009b\r\u000e\u008e\"X\u00eeB\u00061\u00c3\n\u00e8\u00c0z\u00c4\u008fh\u00be\u0014=_\u00fb\u008f4N\u0002\u009fW\u00dd\u001d\u00aa)\u00f9B\u00e1\u00b5\u00bb\u00bb\u00ef]-\u00ac\u0002,-\u00a5D\u00be\u00c8{\u00c8\u0082\u00c6\u00e7\u00a8\u00c4\u00a0#9\u00d0\u0082V\u0080\u0096\u00c2?\u0010\u00b3p\u0097\u00ef\u00aa\u0085\u0099\u00a3JXq\u00bd\u00ac>\u00dcZ\r1\u000b4\u00cf3f,\tZ\u0086v\u00ec\u00ea\u00a1\u00b5\u008er\\\u008a\u00b3\u0095\u0090\u000b9\u0001$\u008e\u00f7\u00be\u00e6\u0083,3\u000b\u00e3\u00b4@}xMQ\u001a\u00e2\u00160\\\u00f1\u00ac\u00ee\u0016\u0095\u00a5\u0083\u00f6\u00b0\u00bd\u00fc\u0012\u00e4\u0015\u00dat\u0007W\u00bcS\u00edK$\u0013\u00b4YX\u00d9V!av\u00a9F\u001b\u0000K\u00a5\u0090\u00d5\u00f0Re\u00f8I\u00a1\u00b8Me\u009a%G\u0092\u00b5\u0004\u00d3\u0087\u00fc\u00ebGs\u0085!\u00a7\u00e2\u0007\u00a9\u0096\u00d3\u00c3\u00d7*\u0001\u00f8}8\u00d4\u00fc\u0004M\u0090Q<\u00a96\u00fe\u0097U\u00f6\u009b\u00ba\u00b2\u00dfy\u00fc\u00b5\u0016&\u00f8\u00cde\u0095a\u0003\u0006\u0014\u00a1y\u00c5j\u00f3\u00d5XO\u00dan\u00f4\u000f\u00b8\u00a7\u00dd\u00ad\u0080\u0089\u00ddJ9\f7\u00e1\u00bcQ\u00c8eI\u0084=\u0089=\u00f8\u0018\u00fa\u0019\"\u00ae\u00a2\u00e4\u00f6'\u00a4\u001c\u00e1\u0007)\u000f\u00f0\u00c2\ng\u00b1\u00bf`\u00c5\u0005\u00d5\u009e(Z*\u00a5\u0088\u00d2\u00bb{\u0014Z\u00dfc\u008fNP\u00cc".length();
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
                    var4_14 = "\u0018\u00ad\u00a9tq@\u00b2\u00b9;\u00e3i\\l\u00a0S\u0081";
                    var5_15 = "\u0018\u00ad\u00a9tq@\u00b2\u00b9;\u00e3i\\l\u00a0S\u0081".length();
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
        _8a_0.l = var6_12;
        _8a_0.m = new Integer[56];
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
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x77EA;
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
                throw new RuntimeException("dev/krypton/8a", exception);
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
            _8a_0.g[n2] = _8a_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _8a_0.b(n, l2);
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
            throw new RuntimeException("dev/krypton/8a" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int d(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x81D;
        if (m[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = l[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])_8a_0.n.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    _8a_0.n.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/8a", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _8a_0.m[n2] = n3;
        }
        return m[n2];
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _8a_0.d(n, l2);
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
            throw new RuntimeException("dev/krypton/8a" + " : " + string + " : " + methodType.toString(), exception);
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
            case 0 -> 44;
            case 1 -> 10;
            case 2 -> 57;
            case 3 -> 46;
            case 4 -> 51;
            case 5 -> 8;
            case 6 -> 56;
            case 7 -> 11;
            case 8 -> 55;
            case 9 -> 54;
            case 10 -> 7;
            case 11 -> 40;
            case 12 -> 50;
            case 13 -> 4;
            case 14 -> 23;
            case 15 -> 14;
            case 16 -> 22;
            case 17 -> 53;
            case 18 -> 2;
            case 19 -> 42;
            case 20 -> 27;
            case 21 -> 47;
            case 22 -> 34;
            case 23 -> 62;
            case 24 -> 12;
            case 25 -> 28;
            case 26 -> 39;
            case 27 -> 59;
            case 28 -> 1;
            case 29 -> 37;
            case 30 -> 38;
            case 31 -> 52;
            case 32 -> 61;
            case 33 -> 41;
            case 34 -> 18;
            case 35 -> 29;
            case 36 -> 21;
            case 37 -> 35;
            case 38 -> 13;
            case 39 -> 25;
            case 40 -> 24;
            case 41 -> 45;
            case 42 -> 63;
            case 43 -> 3;
            case 44 -> 58;
            case 45 -> 26;
            case 46 -> 60;
            case 47 -> 19;
            case 48 -> 0;
            case 49 -> 5;
            case 50 -> 36;
            case 51 -> 30;
            case 52 -> 43;
            case 53 -> 20;
            case 54 -> 17;
            case 55 -> 9;
            case 56 -> 6;
            case 57 -> 15;
            case 58 -> 48;
            case 59 -> 33;
            case 60 -> 49;
            case 61 -> 31;
            case 62 -> 32;
            default -> 16;
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
        _8a_0.r[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = q;
        q[0] = "9\u0000nR\u000e%$\u0015l\u0013\u000byo";
        objectArray[1] = "N\u0013pLDfS\u0006r\rA:\u0013;";
        objectArray[2] = "_OKe1fBZI$4:\u0003K";
        objectArray[3] = "c\u007f\u001bb\u000e=~j\u0019#\u000ba>-";
        objectArray[4] = Integer.TYPE;
        _8a_0.r[4] = "java/lang/Integer";
        objectArray[5] = "z\nM4\u001e3d\u0002W{}'`";
        objectArray[6] = "\n@\u0017U0W\u007f`\u001cZ!\u0018\u001en\u0017Q%Bj";
        objectArray[7] = Void.TYPE;
        _8a_0.r[7] = "java/lang/Void";
        objectArray[8] = "nBg\u0006\u0014^sWeG\u0011\u0002=q";
        objectArray[9] = "P\n\u001a+|hP\n\rwpgJA\riprM0_4(1\u0006";
        objectArray[10] = "N{[\u001a[ON{LFW@T0LXWUSA\u001c\u0005\u0006";
        objectArray[11] = "UU`0Yf uk?H)A{`4Ls5";
        objectArray[12] = Boolean.TYPE;
        _8a_0.r[12] = "java/lang/Boolean";
        objectArray[13] = "5\rVF\u0004\u00055\rA\u001a\b\n/FA\u0004\b\u001f(7\u0016[^";
        objectArray[14] = "|x\fUfOww\u001d\u001a\u0005Bbq";
        objectArray[15] = "G)\u0019\u0005P3Y!\u0003J2/^<";
        objectArray[16] = "\u0013z;\r\u0018m\u000eo9L\u001d1Oz";
        objectArray[17] = "u$T\u0016J\u000f\u0000\u0004_\u0019[@a\nT\u0012_\u001a\u0015";
        objectArray[18] = "\u0015E~^b\u0011`euQs^\u0001k~Zw\u0004u";
        objectArray[19] = Double.TYPE;
        _8a_0.r[19] = "java/lang/Double";
        objectArray[20] = "\u0014PD\u0007\u0013\u0018\u0014PS[\u001f\u0017\u000e\u001bSE\u001f\u0002\tj\u0001\u0019J@";
        objectArray[21] = "\u00119\r\u0018m?d\u0019\u0006\u0017|p\u0005\u0017\r\u001cx*q";
        objectArray[22] = "N1G\fp[;\u0011L\u0003a\u0014Z\u001fG\beN.";
        objectArray[23] = "Y]&.1\u0012RR7aL\nAU>(";
        objectArray[24] = "\u0013\u0017\n\u001f%\u0015\u0018\u0018\u001bPH\u0011\u0018\u0004/\u001bz\f\u001c\u0018\u001f\u001b";
        objectArray[25] = "#k;2\n7>~9s\u000fkp=";
        objectArray[26] = "\u0000#\u0005=w\u0001\u001d6\u0007|r]]s";
        objectArray[27] = "]BpD\u0019C(b{K\b\fIlp@\fV=";
        objectArray[28] = "8\u001d6Z\u0000\u001e8\u001d!\u0006\f\u0011\"V!\u0018\f\u0004%'sETGo";
        objectArray[29] = "Z\u0007\u0004~0\u000bZ\u0007\u0013\"<\u0004@L\u0013<<\u0011G=Abd[";
        objectArray[30] = ";B\f\u0016^&0M\u001dY?(;F\u0019\u0003";
        objectArray[31] = "y,`9E3\f\fk6T|m\u0002`=P&\u0019";
        objectArray[32] = ".B&KA 3W$\nD|re";
        objectArray[33] = "fW'\u0015#\u0000\u0013w,\u001a2Ory'\u00116\u0015\u0006";
        objectArray[34] = "\u0014o\u001b\u000f\u007fX\ng\u0001@\"Y\fk\f\u0003\u007f~\n|\b\u000f<";
        objectArray[35] = "v_4v:ChW.9rCr]6~{X2n0rp_\u007f_6r";
        objectArray[36] = "'\u0007\u001e\nY!R'\u0015\u0005Hn3)\u001e\u000eL4G";
        objectArray[37] = "+r[6Ql5zAy\fm3vL:QZ.\u007fA2\u001cm.a";
        objectArray[38] = "X19\u0010Q%F9#_\f$@5.\u001cQ\u0013]<#\u0014\u001c$]\"<";
        objectArray[39] = "uZ\u0013B\n\\kR\t\rm]zI\u0004WK[";
        objectArray[40] = "\u000bPD\u0015qP\u0015X^Z\u001cJ\fAS\u0006>Q\u000eC";
        objectArray[41] = "\u0015pU~\u001e\u007f\u000bxO1V\u007f\u0011rWv_dQWVqS~\u0016~M";
        objectArray[42] = "FR^q\u0019.3rU~\baR|^u\f;&";
        objectArray[43] = "!T\u001af{\u0004!T\r:w\u000b;\u001f\r$w\u001e<nYq$^";
        objectArray[44] = "yT0CqOyT'\u001f}@c\u001f'\u0001}UdnsT.\u0014";
        objectArray[45] = "G\u00021\u00047\"2\":\u000b&mS,1\u0000\"7'";
        objectArray[46] = "63@\u001eZ\u0017(;ZQ\u0012\u001721B\u0016\u001b\fr\u0011Y\u0011\u0007\u001717D";
        objectArray[47] = "4\u00017\n\u000f A!<\u0005\u001eo /7\u000e\u001a5T";
        objectArray[48] = "W7-;\u001aAW7:g\u0016NM|:y\u0016[J\rk,A\u0018";
        objectArray[49] = "[B\u000f\u0010\u000f(EJ\u0015_s<_G\u0016\u001c";
        objectArray[50] = "q\u001e\u001dTJ\u001a\u0004>\u0016[[Ue0\u001dP_\u000f\u0011";
        objectArray[51] = "Q\u0002T*\u0017E$\"_%\u0006\nE,T.\u0002P1";
        objectArray[52] = ">\u001b\u00141H*#\u000e\u0016pMvbI";
        objectArray[53] = "?@1F@\rJ`:IQB+n1BU\u0018_";
        objectArray[54] = "\bI]>\u000bu}iV1\u001a:\u001cg]:\u001e`h";
        objectArray[55] = Float.TYPE;
        _8a_0.r[55] = "java/lang/Float";
        objectArray[56] = "Y]G5jy,}L:{6MsG1\u007fl9";
        objectArray[57] = "p/w4f\u0007\u0005\u000f|;wHd\u0001w0s\u0012\u0010";
        objectArray[58] = "\u0013TU_aAft^Pp\u000e\u0007zU[tTs";
        objectArray[59] = "<c69\u0017DIC=6\u0006\u000b(M6=\u0002Q\\";
        objectArray[60] = "\u00055B:5%\u00055Uf9*\u001f~Ux9?\u0018\u000f\u0007#a~";
        objectArray[61] = "4PP\u0000,oAp[\u000f=  ~P\u00049zT";
        objectArray[62] = "du(`H{du?<Dt~>?\"DayOmy\u001c+";
        objectArray[63] = "\"\u0018LSC\u0019\"\u0018[\u000fO\u00168S[\u0011O\u0003?\"\tE\u001cF";
        objectArray[64] = "%)nl>i~yk\u0006~\u000b\"w4~\"`t%p~";
        objectArray[65] = "\u0016E0\u0003\u000b\u0012\u0004\u0005pY0S|Xl\u001eW\f@]0_Y";
        objectArray[66] = "^ukn8W\u001f?d\"\u0004J\u0006t\u0019(zLT\u007fy(x\u0010\t\u0004#lg\u0014\u0014d#n;Io>gq?T\u000f>e-b/";
        objectArray[67] = "\u001f#4[ZT\rct\u0001a\u0012ub1G\u000fGJ4w\u0000\u0013Tufe\u0006\u0018\u001d\u001e`\u007fV\u001c,";
        objectArray[68] = "\u0004%\u000bQ_^\u0016eK\u000bd\u001c/]UR\u001dA\baP\u000e\\O";
        objectArray[69] = "\u0013+\u0004PU\u000e\u0016wE^3\rvv\u0003T\bI\u0016v\u0001\bU";
        objectArray[70] = "F#LtE@[dG{{\u0013&;Lh\u0001Z\u00169C{\u0016";
        objectArray[71] = "i\t)\u001d\r\u0014i\bnKa\u0003u\u0000h\u001a\u001b\tt\n\u0010\b\u0018\u0003u\u001a(MP\u0015*ek\u001fX\u0006~\u0019k\u001e\u001fP\u0012";
        objectArray[72] = "k\u0012\b$\u000b5!_Fxb9|SD\u0018\u0001.{R\u0006(\u0010>.I8";
        objectArray[73] = "8]SpIM}I\u0019, \f\u0002\u0001]7N\\=W\u001bpRO\u0002\u0003\u001d&I\nz\b\u0013uI7";
        objectArray[74] = "CK\u0012\u001bNbMPUJtfGUh\u001f\nj\u0011R\b\u001f\b6L)\u000bT\u001ex\u0014\u0019\u001aDKc*";
        objectArray[75] = ".^B(;C+AZw\u0002\u0005\u0017\u0019Nr9Ew\u0019L.d";
        objectArray[76] = "&}\u0007[\u0007Wg7\b\u0017;Dzm\u0011'WR,q\u0019M\u000b\u0010-0uKF\u0014j`\u001f\u0017\u0004\u0015+\f";
        objectArray[77] = "\u0011X$STk\u0016\u001e4\u0015?=,\u001cc\u0013Qg\u0013J%TMt,\u0015%\u0000Cg\u0012\u001de\u001bE\f";
        objectArray[78] = "H\u0005nqpTM\u001av.I\u0017qA\"0'BN\u0017dw;Qq\u001d{1.OM\u0018'p )";
        objectArray[79] = "\u001c\u0014M\u0015U\u0018]^BYi\u0005L\u0003?S\u0017\u0003\u0016\u001e_S\u0015_Ke\u0005\u0017\n[V\u0005\u0005\u0015V\u0006-_A\nR\u001bM_CV\u000f`";
        objectArray[80] = "\u0016\u0001LAG[\u001d\u000f\u001fAzY@\u001aBV\u0017#N\u000eOYD\u0013_\u001e\u001aBz@\\\u0015T\u0016JQL@O(";
        objectArray[81] = "B[Z_rxP\u001b\u001a\u0005I>(\u0019\u001fXr{H\u0019\u001d\u0004/";
        objectArray[82] = "==\u0016gEq63Egxbb.\u0016tx4lz\u0006?\u00132v*\u0002\u000e";
        objectArray[83] = " }\u0002H]@bp\u0002AlI0f\u0005\u0017\u0000{d\"_JU,>k\u000f\u0001R\u001c/{Z\u001al\\ pTI\u0002\u0013c!\u001ap";
        objectArray[84] = "\"L#\f(c%\n3JC<\u001f\bdL-o ^\"\u000b1|\u001f\u0001\"_?o!\tbD9\u0004";
        objectArray[85] = "59\u001c\u0012;l>7O\u0012\u0006{c;u\u0018w~\u007fyE\tg+dG\u0016\nle0w\u0007\u001a9~\u000e";
        objectArray[86] = "juY\u007f!q(s\u00176\u0019y8d\u0007huKl%_0\u0019-?%Xbt-%!\u001e\u000f$vlaVd\"l<eg";
        objectArray[87] = "tb{'`&q}cxYkt\u001f`|#ewtngd4";
        objectArray[88] = "+mPit\u0010.1\u0011g\u0012\u0010\u000b\n\u0013pq\u00175j\u0013r-J";
        objectArray[89] = "\u0005EX97wD\u000fWu\u000bj]D*|10R\nC/nr[U*|10R\nC/nr[U*|10R\nC/nr[U*";
        objectArray[90] = "(i#\u0003fMii)B)1.2CGiI\u007f:|\u0011/\u000ec)CC=\bh`(E'XlQ";
        objectArray[91] = ";KP|B\u001a-\u0000Gez\u0011)\u001aGb\u0000\u000b2\u001f<$\u0004\to\u000b\\$\u0006U2p\u0006`\u0019Q/\u0010\u0006bE\fT\u001f\u0007r\u0018R$\tLe\u0001j";
        objectArray[92] = "\u0011\u001bv\u0015\u007fZ\u001a@w\u0003C\u0016p\u001fx\u0000-@OI>G1SpI}\u0014!\u0013\u0000_6\u00038+";
        objectArray[93] = " 3yp\u001d\u001d+=*p \u001df1\u0010zQ\u000fjs kAZqMshJ\u0014%}bx\u001f\u000f\u001b.asQ[+?q&Je";
        objectArray[94] = "Xs\u0015`^KJ3U:e\u000e22\u0010|\u000bX\rdV;\u0017K21Pg^HR1R;\u00033";
        objectArray[95] = "CqHfVm\u0001n\u000e|)j_q\u0012w~8\u0007%I$)yY{N*E;T{G";
        objectArray[96] = "(&Y'\u001b\u0005i&SfTy-\u001e\u0000dR\u0017z!V\"\u0015\u000bi\u001eU'\u0011\u0004}t\te\u0010E\u0011";
        objectArray[97] = "\u0001\u0005fM?q\u0017NqT\u0007`\u0015soW{pn\u000erD{jP\u00062_}\u0001";
        objectArray[98] = "\"9zk15%\u007fj-Zi\u001f}=+49 +{l(*\u001f+8?8jo=s(!R";
        objectArray[99] = "J#5.I\u0012Me%h\"EwgrnL\u001eH14)P\rwc&/[D\u001ce<\u007f_u";
        objectArray[100] = "9zS\u0007~\"/1D\u001eF.1\u0005X\u001a+(\u001d(D\bF=m-]]6+&:De";
        objectArray[101] = "\\%XdsC\u000f \u0006i\u000fDY \u001d^3\u0010\u000fueer\u0014C)\u000f90\u0015\u0002E";
        objectArray[102] = "HPQ8]v\u0003V\u000e<3wT\u001f\u0012\u001aUm9U\u00108\bjYU\u0012dU\u0011\u0003\u0011\r`Hq\u0003\u0013Q=3";
        objectArray[103] = "}Y@eb;xFX:[~D\u001d\f$5-{KJc)>DMP&e|/CKa4F";
        objectArray[104] = "bQhrbha^erb\u000e>\f}vnb\fQ9/4\u000eb^`/pq)\njdv\u000e8\u0000mly>:\u000f~{\t";
        objectArray[105] = "?24eLk:-,:u.\u0006u#lJ\u007f|07&\u0016";
        objectArray[106] = "I\u00014vQt\u001a\u0004j{-}F\u001di|AO\u0014]3'\u0010\u0018\u0011\u001fj Vx\u0011\u001d6}-";
        objectArray[107] = "=VQ\u000e=j$\u0014E\u000fY9:IDR#W<UZOc2>@CZY1 D\t[d(bP\b?";
        objectArray[108] = "I\u000bx\u0000\bOL\u0014`_1\rpLtZ\nI\u0010Lv\u0006W";
        objectArray[109] = "K?\u0000o\u007f<N \u00180Fpr+\u0010,x{\u0019%\u000bk)";
        objectArray[110] = "\u001c\u0003EtUC\u0012\u0018\u0002%oA\u0019\r?)\u001eB\u0004_\u000f8\u000e\u0017\u001fa\u000f2\u0004T\u001e_\u0007r\u001fRu";
        objectArray[111] = "\u0002j\"hc\u000eCj(),r\u0005bB,l\nU9}z*MI*B(8KBc).\"\u001bFR";
        objectArray[112] = "{O\n\u001a\u0017\u0018i\u000fJ@,Z\u0011\u000e\u000f\u0006B\u000b.XIA^\u0018\u0011\u0007I\u0015P\u000b/\u000f\t\u000eV`";
        objectArray[113] = "Slu}\n\fE'bd2\u0017[1evS\u001aGWvf^\u0019BlhqP\u0019<gatN\u0017\u0002o!oH|";
        objectArray[114] = "bF5\t`7t\r\"\u0010X#`\u001b6\u00178G7\u0003:P#'7\u0001f\rX";
        objectArray[115] = "d}q*L\u001bv=1pw_\u000e?4-L\u0018n?6q\u0011";
        objectArray[116] = "'8+A0\u001a)#l\u0010\n\n2 <\u0016oq(!8NnL1c,O\n";
        objectArray[117] = "NUmipF\u0001\u0016<'IHWSg\u0013.DS(=&*\u0013EH=$vN>";
        objectArray[118] = "z\u007f'\u0007u)h?g]Na\u0010b{\u001a)7,g'['";
        objectArray[119] = "B\u000esu\u0013j\u0012\u000fd,}3\u0011\u0016mv\u0011\u0001CV7+MVF\u0014n*\u00066F\u00162w}";
        objectArray[120] = "\u0010(\u0012Dr;\u0002hR\u001eIszi\u0017X'(E?Q\u001f;;zmC\u00190r\u0011kYI4C";
        objectArray[121] = "jv?SEYdmx\u0002\u007fIbf(mEL`/>\rEN<rE";
        objectArray[122] = "w\u000f\u001b?*z4\u0002\u0015c.\n+_\u0015f0f\u0019\rY;k\nw\r\b?.u<Y\u0002t(\n";
        objectArray[123] = "S[8;kkM\u001e:.[jN'b+'\u0016Q\u001bsi1pJY:9[";
        objectArray[124] = "f*2\u001aaTh1uK[^t\u0005-\\'N\u000fx0O'T1ppT!?";
        objectArray[125] = "q'D8|_cg\u0004bG\u001a\u001bfA$)L$0\u0007c5_\u001b:\u0018% A'?Dd.'";
        objectArray[126] = "\n/\u0011lt\u0016\u000f0\t3M[MRX+$\u0002\u000e*S%w\u0002";
        objectArray[127] = "_9n[D[Q\")\n~QJ6n\f\u0002WL[nTN\f_1$\u0019\u0000P6";
        objectArray[128] = "Ms\tuEX\bgC),\u001aw/\u00072BIHyAu^Zw+SsU\u0013\u001c-I#Q\"";
        objectArray[129] = "jZ\u0004L0+ \u0017J\u0010Y!y\u0010r\u001d)=\u0010[L\u001b%*.S\f\u0000#A";
        objectArray[130] = "\n\u001b\u0005:\u00016\u0004\u0000Bk;&\u0004\u0003\u0003\u0004@1Z\u0017\u0013x@0\u001dA\u007f9Qd\u001aH\u0014?K4\u001ey";
        objectArray[131] = ":;\u0019\u000byb?$\u0001T@/ZFVO9'h!Q\t)a";
        objectArray[132] = "y9=;#'\"i8Qb\u0006Gi751=%2g0";
        objectArray[133] = "\bTb\u0015%\u0010\rKzJ\u001cS1\u0010.Tr\u0006\u000eFh\u0013n\u00151\u0013nO'\u0016Q\u0013l\u0013zm";
        objectArray[134] = "?[h8A\"}D.\">%#[2)iw{\u000fiu>6%QntRt(Qg";
        objectArray[135] = "`>\rVC5\"8C\u001f{=2/SA\u0017\u000fei\r\u0016@X2nN^C5#+VE{";
        objectArray[136] = "\u0002{9&l;\u00140.?T7\n\u001d-<91&).)T$V,7|$2\u001d;.D";
        objectArray[137] = "g\u0003u_qIl\r&_LJ=\u000fq6vO?FgVvMc\u001b\u001c";
        objectArray[138] = "=Y\u0005a3\u0018 \u001e\u000en\rO]M_}oJ-[\u0014jv";
        objectArray[139] = "\u0001Nx4\u0014v\u0006\bhr\u007f-<\n?t\u0011z\u0003\\y3\ri<\u000ek5\u0006 W\bqe\u0002\u0011";
        objectArray[140] = "L)\u007fi\u0017\u0010\u000e$\u007f`&\u0012V4U8M\u001c10hhK\u001e]5g.L|\f$!(\u0017\u0017\n>q,&";
        objectArray[141] = "G)0\u0018\u0003KUipB8\u000e-4l\u0005_U\u001110DQ";
        objectArray[142] = "M#{-\u0006\u007fTao,b)L<vq\t>+ jl[(M;(%\u000bBH)xm\\rY9-vb";
        objectArray[143] = "\u000e)EOy\"\u000b6]\u0010@oZT\r\b#dL4\r\n\u007f9";
        objectArray[144] = "!\t;!\u000b\u001dzY>KJ$\u001fX2u\u0003Gr\u001a4;J";
        objectArray[145] = "\u0018'-\u0010(sK\"s\u001dTt\u001d\"h*h Kv\u0010\u0011)$\u0007+zMk%FG";
        objectArray[146] = "5\f`0[h0\u0013xob$\fH,q\f~3\u001ej6\u0010m\fKljYnlKn6\u0004\u0015";
        objectArray[147] = "Tf!,&\u0011E#97\u001e\u0019T'<3r+\u0005gmi\u001eFG8g/~FEd:T";
        objectArray[148] = "+*YJ\f\u0010.v\u0018Dj\u001cNw^NQW.w\\\u0012\f";
        objectArray[149] = "b3\f~0S#3\u0006?\u007f/k\u000bU=yA04\u0003{>]#\u000b\u0000~:R7a\\<;\u0013[";
        objectArray[150] = "\u0001y'\u0005^4\nwt\u0005c']a2\u0005\u0002*AD#\u001dc/Km?RS>[8$lS4Q{%R[tJ}N";
        objectArray[151] = "`$h\fA.}cc\u0003\u007f|\u0000f4\u000eF9p%9\u0000\u001a=";
        Object[] objectArray2 = objectArray;
        objectArray[152] = "\u0003N\u000b]I_\u0004\b\u001b\u001b\"\t\u007f3K[ZVU\f\u001d\u001d\u001dJF3O\u000f\u001bA\u000fXI\u0015KE>";
    }

    private static Class f(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _8a_0.e(l2, l3);
            object = q[n];
            try {
                if (!(object instanceof String)) break block2;
                _8a_0.q[n] = clazz = Class.forName(r[n]);
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
        Field field = _8a_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _8a_0.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field g(long l2, long l3) {
        int n = _8a_0.e(l2, l3);
        Object object = q[n];
        if (object instanceof String) {
            String string = r[n];
            int n2 = string.indexOf(8);
            Class clazz = _8a_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _8a_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _8a_0.c(clazz3, string2, clazz2)) != null) {
                    _8a_0.q[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _8a_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _8a_0.q[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _8a_0.f(2128053264516839L, 0L);
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
        Method method = _8a_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _8a_0.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method h(long l2, long l3) {
        int n = _8a_0.e(l2, l3);
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
                clazz3 = _8a_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _8a_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _8a_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _8a_0.q[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _8a_0.f(2128053264516839L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _8a_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _8a_0.q[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _8a_0.f(2128053264516839L, 0L);
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
            if (c == '\u00fd' || c == 'q' || c == '\u00dc' || c == '\u00e7') {
                field = _8a_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fd' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'q' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00dc' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _8a_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 's' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 't' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _8a_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8a" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_8a_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_8a_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_8a_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

