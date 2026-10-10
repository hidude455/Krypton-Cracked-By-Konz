/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.krypton.8l
 *  java.lang.MatchException
 *  net.minecraft.class_11905
 *  net.minecraft.class_11908
 *  net.minecraft.class_11909
 *  net.minecraft.class_2248
 *  net.minecraft.class_437
 */
package dev.krypton;

import dev.krypton._02;
import dev.krypton._0O;
import dev.krypton._7V;
import dev.krypton._8B;
import dev.krypton._8e;
import dev.krypton._8l;
import dev.krypton._9t_0;
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
import net.minecraft.class_2248;
import net.minecraft.class_437;

public class _8S
extends _8e {
    private final _9t_0 cfr_renamed_284;
    private final List cfr_renamed_4;
    private final int cfr_renamed_1;
    private final int cfr_renamed_6;
    private final Map cfr_renamed_467;
    private final int cfr_renamed_3;
    private final int cfr_renamed_8;
    private final _7V cfr_renamed_156;
    private List cfr_renamed_262;
    private int cfr_renamed_266;
    private int cfr_renamed_9;
    private int cfr_renamed_129;
    private static final long b;
    private static final String[] f;
    private static final String[] g;
    private static final Map h;
    private static final long[] l;
    private static final Integer[] m;
    private static final Map n;
    private static final Object[] q;
    private static final String[] r;

    /*
     * Unable to fully structure code
     */
    public _8S(long var1_1, _0O var3_2, _9t_0 var4_3) {
        block9: {
            block10: {
                block8: {
                    v0 = var1_1 = _8S.b ^ var1_1;
                    var5_4 = v0 ^ 2087467358736L;
                    var7_5 = v0 ^ 136639864826714L;
                    var9_6 = v0 ^ 128534892431098L;
                    var11_7 = v0 ^ 56923294614320L;
                    var13_8 = v0 ^ 81418531207750L;
                    v1 = v0 ^ 133474168583144L;
                    var15_9 = (int)(v1 >>> 32);
                    var16_10 = (int)(v1 << 32 >>> 32);
                    var17_11 = v0 ^ 70526160646991L;
                    super((String)_8S.b("r", (int)23608, (long)(4693247407750013383L ^ var1_1)));
                    this.cfr_renamed_1 = (int)_8S.d("t", (int)19285, (long)(5114257410158031177L ^ var1_1));
                    this.cfr_renamed_6 = (int)_8S.d("t", (int)10094, (long)(6985696776352243068L ^ var1_1));
                    this.cfr_renamed_3 = (int)_8S.d("t", (int)18377, (long)(1346074776610930167L ^ var1_1));
                    this.cfr_renamed_8 = (int)_8S.d("t", (int)13316, (long)(5801228295165185567L ^ var1_1));
                    this.cfr_renamed_156 = new _7V(var9_6);
                    v2 = _02.cfr_renamed_2();
                    _8S.f("a", (Object)this, (int)_8S.d("t", (int)24158, (long)(5130504947251962953L ^ var1_1)), (long)4667507486931207046L, (long)var1_1);
                    _8S.f("a", (Object)this, (int)_8S.d("t", (int)24158, (long)(5130504947251962953L ^ var1_1)), (long)4679629303048116408L, (long)var1_1);
                    _8S.f("a", (Object)this, (int)_8S.d("t", (int)24158, (long)(5130504947251962953L ^ var1_1)), (long)4668625732524447961L, (long)var1_1);
                    this.cfr_renamed_284 = var4_3;
                    v3 = new Object[2];
                    v3[1] = var16_10;
                    v3[0] = var15_9;
                    this.cfr_renamed_467 = new HashMap<K, V>(_8S.f("M", (Object)var4_3, (Object)v3, (long)4669615685014121764L, (long)var1_1));
                    var19_12 = v2;
                    this.cfr_renamed_4 = new ArrayList<E>();
                    v4 = new Object[1];
                    v4[0] = var13_8;
                    var20_13 = _8S.f("M", (Object)var4_3, (Object)v4, (long)4681063257518266440L, (long)var1_1);
                    try {
                        try {
                            v5 = var20_13;
                            if (var19_12) break block8;
                            if (v5 != null) {
                            }
                            ** GOTO lbl53
                        }
                        catch (MatchException v6) {
                            throw _8S.a((Exception)v6);
                        }
                        v5 = _8S.f("\u00a5", (Object)this, (long)4668482706405889024L, (long)var1_1);
                    }
                    catch (MatchException v7) {
                        throw _8S.a((Exception)v7);
                    }
                }
                try {
                    _8S.f("M", (Object)v5, (Object)var20_13, (long)4680200685784984324L, (long)var1_1);
                    if (var1_1 < 0L) break block9;
                    if (!var19_12) break block10;
lbl53:
                    // 2 sources

                    _8S.f("M", (Object)_8S.f("\u00e6", (long)4680568298001891054L, (long)var1_1), (Consumer<class_2248>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, 5(long net.minecraft.class_2248 ), (Lnet/minecraft/class_2248;)V)((_8S)this, (long)var17_11), (long)4679300434014146103L, (long)var1_1);
                }
                catch (MatchException v8) {
                    throw _8S.a((Exception)v8);
                }
            }
            _8S.f("a", (Object)this, new ArrayList<E>(_8S.f("\u00a5", (Object)this, (long)4668482706405889024L, (long)var1_1)), (long)4680002048342940421L, (long)var1_1);
            v9 = new Object[2];
            v9[1] = _8S.b("r", (int)18586, (long)(6602434485664052576L ^ var1_1));
            v9[0] = var5_4;
            _8S.f("M", (Object)_8S.f("\u00a5", (Object)this, (long)4667741957500219271L, (long)var1_1), (Object)v9, (long)4669370960817995732L, (long)var1_1);
            v10 = new Object[2];
            v10[1] = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, 6(long ), ()V)((_8S)this, (long)var7_5);
            v10[0] = var11_7;
            _8S.f("M", (Object)_8S.f("\u00a5", (Object)this, (long)4667741957500219271L, (long)var1_1), (Object)v10, (long)4679705051490448988L, (long)var1_1);
        }
    }

    @Override
    public String java_lang_String_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 ^ 0x636E2B572E5EL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        return (String)((Object)_8S.b("r", 21223, (long)(0x2431B6B02A9598CEL ^ l2))) + (String)((Object)_8S.f("M", (Object)_8S.f("M", (Object)_8S.f("\u00a5", (Object)this, -5254012672955380067L, (long)l2), (Object)objectArray2, -5255646138654590924L, (long)l2), -5250116758146782968L, (long)l2)) + (String)((Object)_8S.b("r", 4317, (long)(0x41E959A058F2DAF3L ^ l2))) + (int)_8S.f("M", (Object)_8S.f("\u00a5", (Object)this, -5251408605176954047L, (long)l2), -5250326582282252960L, (long)l2) + (String)((Object)_8S.b("r", 21510, (long)(0x53E7B257016D1E29L ^ l2)));
    }

    @Override
    protected int int_6(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return (int)_8S.d("t", 4103, (long)(0x5AC463C8677516E3L ^ l2));
    }

    @Override
    protected int int_9(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return (int)_8S.d("t", 21694, (long)(0x54A629FE5617B399L ^ l2));
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void cfr_renamed_9(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [62[WHILELOOP], 63[DOLOOP]], but top level block is 30[TRYBLOCK]
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
    public boolean method_25402(class_11909 var1_1, boolean var2_2) {
        block85: {
            block86: {
                block96: {
                    block95: {
                        block100: {
                            block99: {
                                block97: {
                                    block98: {
                                        block92: {
                                            block93: {
                                                block91: {
                                                    block89: {
                                                        block90: {
                                                            block101: {
                                                                block88: {
                                                                    block87: {
                                                                        block84: {
                                                                            block82: {
                                                                                block83: {
                                                                                    block80: {
                                                                                        block81: {
                                                                                            block78: {
                                                                                                block79: {
                                                                                                    block76: {
                                                                                                        block77: {
                                                                                                            block74: {
                                                                                                                block75: {
                                                                                                                    block72: {
                                                                                                                        block73: {
                                                                                                                            v0 = var3_3 = _8S.b ^ 97859116729069L;
                                                                                                                            var5_4 = v0 ^ 1418061634872L;
                                                                                                                            var7_5 = v0 ^ 46492476949498L;
                                                                                                                            var9_6 = v0 ^ 31712394146322L;
                                                                                                                            var11_7 = v0 ^ 117629745271803L;
                                                                                                                            var13_8 = v0 ^ 72367087873230L;
                                                                                                                            var15_9 = v0 ^ 7050512165110L;
                                                                                                                            var17_10 = v0 ^ 53386053869560L;
                                                                                                                            var19_11 = v0 ^ 115371338080656L;
                                                                                                                            var21_12 = v0 ^ 36469951824041L;
                                                                                                                            v1 = new Object[2];
                                                                                                                            v1[1] = var19_11;
                                                                                                                            v1[0] = (double)_8S.f("M", (Object)var1_1, (long)1023542850514767898L, (long)var3_3);
                                                                                                                            var24_13 = _8S.f("M", (Object)this, (Object)v1, (long)1024043107172255560L, (long)var3_3);
                                                                                                                            v2 = new Object[2];
                                                                                                                            v2[1] = var19_11;
                                                                                                                            v2[0] = (double)_8S.f("M", (Object)var1_1, (long)1011205218333682616L, (long)var3_3);
                                                                                                                            var25_14 = _8S.f("M", (Object)this, (Object)v2, (long)1024043107172255560L, (long)var3_3);
                                                                                                                            v3 = new Object[1];
                                                                                                                            v3[0] = var9_6;
                                                                                                                            var26_15 = _8S.f("M", (Object)this, (Object)v3, (long)1013166612678416526L, (long)var3_3);
                                                                                                                            v4 = new Object[1];
                                                                                                                            v4[0] = var11_7;
                                                                                                                            var27_16 = _8S.f("M", (Object)this, (Object)v4, (long)1012608583469994416L, (long)var3_3);
                                                                                                                            v5 = new Object[1];
                                                                                                                            v5[0] = var21_12;
                                                                                                                            var28_17 = _8S.f("M", (Object)this, (Object)v5, (long)1012171472896936419L, (long)var3_3);
                                                                                                                            var29_18 = _8S.f("\u00a5", (Object)this, (long)1022687800926813419L, (long)var3_3) + var28_17 + true + _8S.d("t", (int)9270, (long)(4971683969976258804L ^ var3_3));
                                                                                                                            var23_19 = _02.cfr_renamed_2();
                                                                                                                            var30_20 = _8S.d("t", (int)16311, (long)(4204224792948034388L ^ var3_3));
                                                                                                                            var31_21 = _8S.d("t", (int)28241, (long)(1238592219585780373L ^ var3_3));
                                                                                                                            var32_22 = _8S.f("\u00a5", (Object)this, (long)1025370424280418966L, (long)var3_3) + _8S.d("t", (int)16269, (long)(2842181074545036153L ^ var3_3));
                                                                                                                            var33_23 = var32_22 + var30_20 + _8S.d("t", (int)16522, (long)(2752693529088767072L ^ var3_3));
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    v6 = new Object[7];
                                                                                                                                    v6[6] = (int)var31_21;
                                                                                                                                    v6[5] = (int)var30_20;
                                                                                                                                    v6[4] = (int)var29_18;
                                                                                                                                    v6[3] = (int)var32_22;
                                                                                                                                    v6[2] = (double)var25_14;
                                                                                                                                    v6[1] = (double)var24_13;
                                                                                                                                    v6[0] = var13_8;
                                                                                                                                    v7 = _8S.f("M", (Object)this, (Object)v6, (long)1022321601674947541L, (long)var3_3);
                                                                                                                                    if (var23_19) break block72;
                                                                                                                                    if (v7 == false) break block73;
                                                                                                                                }
                                                                                                                                catch (MatchException v8) {
                                                                                                                                    throw _8S.a((Exception)v8);
                                                                                                                                }
                                                                                                                                _8S.f("a", (Object)this, (int)_8S.d("t", (int)17406, (long)(9173786852985157393L ^ var3_3)), (long)1011671894956922435L, (long)var3_3);
                                                                                                                                return true;
                                                                                                                            }
                                                                                                                            catch (MatchException v9) {
                                                                                                                                throw _8S.a((Exception)v9);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        v10 = new Object[7];
                                                                                                                        v10[6] = (int)var31_21;
                                                                                                                        v10[5] = (int)var30_20;
                                                                                                                        v10[4] = (int)var29_18;
                                                                                                                        v10[3] = (int)var33_23;
                                                                                                                        v10[2] = (double)var25_14;
                                                                                                                        v10[1] = (double)var24_13;
                                                                                                                        v10[0] = var13_8;
                                                                                                                        v7 = _8S.f("M", (Object)this, (Object)v10, (long)1022321601674947541L, (long)var3_3);
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            if (var23_19) break block74;
                                                                                                                            if (v7 == false) break block75;
                                                                                                                        }
                                                                                                                        catch (MatchException v11) {
                                                                                                                            throw _8S.a((Exception)v11);
                                                                                                                        }
                                                                                                                        _8S.f("a", (Object)this, (int)_8S.d("t", (int)13778, (long)(2118665044468351273L ^ var3_3)), (long)1011671894956922435L, (long)var3_3);
                                                                                                                        return true;
                                                                                                                    }
                                                                                                                    catch (MatchException v12) {
                                                                                                                        throw _8S.a((Exception)v12);
                                                                                                                    }
                                                                                                                }
                                                                                                                v7 = _8S.f("\u00a5", (Object)this, (long)1022687800926813419L, (long)var3_3) + var27_16 - _8S.d("t", (int)247, (long)(7624403434505204743L ^ var3_3));
                                                                                                            }
                                                                                                            var34_24 = v7;
                                                                                                            var35_25 = _8S.d("t", (int)9613, (long)(3978353641530118476L ^ var3_3));
                                                                                                            var36_26 = _8S.d("t", (int)12318, (long)(4988611050839819507L ^ var3_3));
                                                                                                            var37_27 = _8S.f("\u00a5", (Object)this, (long)1025370424280418966L, (long)var3_3) + var26_15 - var35_25 - _8S.d("t", (int)9824, (long)(8801551035896550051L ^ var3_3));
                                                                                                            var38_28 = var37_27 - var35_25 - _8S.d("t", (int)14169, (long)(5765942135547249539L ^ var3_3));
                                                                                                            var39_29 = var38_28 - var35_25 - _8S.d("t", (int)14169, (long)(5765942135547249539L ^ var3_3));
                                                                                                            try {
                                                                                                                try {
                                                                                                                    v13 = new Object[7];
                                                                                                                    v13[6] = (int)var36_26;
                                                                                                                    v13[5] = (int)var35_25;
                                                                                                                    v13[4] = (int)var34_24;
                                                                                                                    v13[3] = (int)var37_27;
                                                                                                                    v13[2] = (double)var25_14;
                                                                                                                    v13[1] = (double)var24_13;
                                                                                                                    v13[0] = var13_8;
                                                                                                                    v14 = _8S.f("M", (Object)this, (Object)v13, (long)1022321601674947541L, (long)var3_3);
                                                                                                                    if (var23_19) break block76;
                                                                                                                    if (v14 != false) {
                                                                                                                    }
                                                                                                                    break block77;
                                                                                                                }
                                                                                                                catch (MatchException v15) {
                                                                                                                    throw _8S.a((Exception)v15);
                                                                                                                }
                                                                                                                v16 = new Object[2];
                                                                                                                v16[1] = new HashMap<K, V>(_8S.f("\u00a5", (Object)this, (long)1024128644144904808L, (long)var3_3));
                                                                                                                v16[0] = var5_4;
                                                                                                                _8S.f("M", (Object)_8S.f("\u00a5", (Object)this, (long)1025887705007437748L, (long)var3_3), (Object)v16, (long)1011909660105755613L, (long)var3_3);
                                                                                                                _8S.f("M", (Object)_8S.f("\u00e6", (long)1011138423766219960L, (long)var3_3), (Object)_8S.f("\u00a5", (Object)_8S.f("\u00e6", (long)1012735624486534338L, (long)var3_3), (long)1026472996841349592L, (long)var3_3), (long)1024615158532657319L, (long)var3_3);
                                                                                                                return true;
                                                                                                            }
                                                                                                            catch (MatchException v17) {
                                                                                                                throw _8S.a((Exception)v17);
                                                                                                            }
                                                                                                        }
                                                                                                        v18 = new Object[7];
                                                                                                        v18[6] = (int)var36_26;
                                                                                                        v18[5] = (int)var35_25;
                                                                                                        v18[4] = (int)var34_24;
                                                                                                        v18[3] = (int)var38_28;
                                                                                                        v18[2] = (double)var25_14;
                                                                                                        v18[1] = (double)var24_13;
                                                                                                        v18[0] = var13_8;
                                                                                                        v14 = _8S.f("M", (Object)this, (Object)v18, (long)1022321601674947541L, (long)var3_3);
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (var23_19) break block78;
                                                                                                            if (v14 == false) break block79;
                                                                                                        }
                                                                                                        catch (MatchException v19) {
                                                                                                            throw _8S.a((Exception)v19);
                                                                                                        }
                                                                                                        _8S.f("M", (Object)_8S.f("\u00e6", (long)1011138423766219960L, (long)var3_3), (Object)_8S.f("\u00a5", (Object)_8S.f("\u00e6", (long)1012735624486534338L, (long)var3_3), (long)1026472996841349592L, (long)var3_3), (long)1024615158532657319L, (long)var3_3);
                                                                                                        return true;
                                                                                                    }
                                                                                                    catch (MatchException v20) {
                                                                                                        throw _8S.a((Exception)v20);
                                                                                                    }
                                                                                                }
                                                                                                v21 = new Object[7];
                                                                                                v21[6] = (int)var36_26;
                                                                                                v21[5] = (int)var35_25;
                                                                                                v21[4] = (int)var34_24;
                                                                                                v21[3] = (int)var39_29;
                                                                                                v21[2] = (double)var25_14;
                                                                                                v21[1] = (double)var24_13;
                                                                                                v21[0] = var13_8;
                                                                                                v14 = _8S.f("M", (Object)this, (Object)v21, (long)1022321601674947541L, (long)var3_3);
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    if (var23_19) break block80;
                                                                                                    if (v14 == false) break block81;
                                                                                                }
                                                                                                catch (MatchException v22) {
                                                                                                    throw _8S.a((Exception)v22);
                                                                                                }
                                                                                                _8S.f("M", (Object)_8S.f("\u00a5", (Object)this, (long)1024128644144904808L, (long)var3_3), (long)1025472494356941293L, (long)var3_3);
                                                                                                return true;
                                                                                            }
                                                                                            catch (MatchException v23) {
                                                                                                throw _8S.a((Exception)v23);
                                                                                            }
                                                                                        }
                                                                                        v14 = var29_18 + var31_21 + _8S.d("t", (int)14169, (long)(5765942135547249539L ^ var3_3));
                                                                                    }
                                                                                    var40_30 = v14;
                                                                                    var41_31 = _8S.f("\u00a5", (Object)this, (long)1025370424280418966L, (long)var3_3) + _8S.d("t", (int)9824, (long)(8801551035896550051L ^ var3_3));
                                                                                    try {
                                                                                        try {
                                                                                            v24 = _8S.f("\u00a5", (Object)this, (long)1011671894956922435L, (long)var3_3);
                                                                                            if (var23_19) break block82;
                                                                                            if (v24 != false) break block83;
                                                                                        }
                                                                                        catch (MatchException v25) {
                                                                                            throw _8S.a((Exception)v25);
                                                                                        }
                                                                                        v26 = var40_30 + _8S.d("t", (int)12318, (long)(4988611050839819507L ^ var3_3)) + _8S.d("t", (int)15827, (long)(5683736429866699037L ^ var3_3));
                                                                                        break block84;
                                                                                    }
                                                                                    catch (MatchException v27) {
                                                                                        throw _8S.a((Exception)v27);
                                                                                    }
                                                                                }
                                                                                v24 = var40_30;
                                                                            }
                                                                            v26 = v24 + _8S.d("t", (int)13656, (long)(6584651828918337939L ^ var3_3));
                                                                        }
                                                                        var42_32 = v26;
                                                                        var43_33 = var26_15 - _8S.d("t", (int)18377, (long)(1346149490932298508L ^ var3_3));
                                                                        var44_34 = var27_16 - (var42_32 - _8S.f("\u00a5", (Object)this, (long)1022687800926813419L, (long)var3_3)) - _8S.d("t", (int)24409, (long)(3034849670292941757L ^ var3_3));
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        v28 = new Object[7];
                                                                                        v28[6] = (int)var44_34;
                                                                                        v28[5] = (int)var43_33;
                                                                                        v28[4] = (int)var42_32;
                                                                                        v28[3] = (int)var41_31;
                                                                                        v28[2] = (double)var25_14;
                                                                                        v28[1] = (double)var24_13;
                                                                                        v28[0] = var13_8;
                                                                                        v29 = _8S.f("M", (Object)this, (Object)v28, (long)1022321601674947541L, (long)var3_3);
                                                                                        if (var23_19) break block85;
                                                                                        if (v29 == false) break block86;
                                                                                    }
                                                                                    catch (MatchException v30) {
                                                                                        throw _8S.a((Exception)v30);
                                                                                    }
                                                                                    v31 = this;
                                                                                    if (var23_19) break block87;
                                                                                }
                                                                                catch (MatchException v32) {
                                                                                    throw _8S.a((Exception)v32);
                                                                                }
                                                                                if (_8S.f("\u00a5", (Object)v31, (long)1011671894956922435L, (long)var3_3) != false) break block88;
                                                                            }
                                                                            catch (MatchException v33) {
                                                                                throw _8S.a((Exception)v33);
                                                                            }
                                                                            v31 = this;
                                                                        }
                                                                        catch (MatchException v34) {
                                                                            throw _8S.a((Exception)v34);
                                                                        }
                                                                    }
                                                                    v35 = _8S.f("\u00a5", (Object)v31, (long)1011613532908852734L, (long)var3_3);
                                                                    break block101;
                                                                }
                                                                v35 = new ArrayList<E>(_8S.f("M", (Object)_8S.f("\u00a5", (Object)this, (long)1024128644144904808L, (long)var3_3), (long)1023804425220742639L, (long)var3_3));
                                                            }
                                                            var45_35 = v35;
                                                            try {
                                                                try {
                                                                    v36 = this;
                                                                    if (var23_19) break block89;
                                                                    if (_8S.f("\u00a5", (Object)v36, (long)1011671894956922435L, (long)var3_3) != false) break block90;
                                                                }
                                                                catch (MatchException v37) {
                                                                    throw _8S.a((Exception)v37);
                                                                }
                                                                v38 = _8S.f("\u00a5", (Object)this, (long)1026008591377927549L, (long)var3_3);
                                                                break block91;
                                                            }
                                                            catch (MatchException v39) {
                                                                throw _8S.a((Exception)v39);
                                                            }
                                                        }
                                                        v36 = this;
                                                    }
                                                    v38 = _8S.f("\u00a5", (Object)v36, (long)1022605644886726178L, (long)var3_3);
                                                }
                                                var46_36 = v38;
                                                var47_37 = _8S.d("t", (int)5443, (long)(3219389652166238642L ^ var3_3));
                                                var48_38 = var46_36 * _8S.d("t", (int)4377, (long)(1794033218808604117L ^ var3_3));
                                                var49_39 = var24_13 - var41_31 - 5;
                                                var50_40 = var25_14 - var42_32 - 5;
                                                var51_41 = var49_39 / var47_37;
                                                var52_42 = var50_40 / var47_37;
                                                try {
                                                    try {
                                                        try {
                                                            v29 = var51_41;
                                                            if (var23_19) break block85;
                                                            if (v29 < 0) break block86;
                                                        }
                                                        catch (MatchException v40) {
                                                            throw _8S.a((Exception)v40);
                                                        }
                                                        v29 = var51_41;
                                                        if (var23_19) break block85;
                                                    }
                                                    catch (MatchException v41) {
                                                        throw _8S.a((Exception)v41);
                                                    }
                                                    if (v29 >= _8S.d("t", (int)19285, (long)(5114174035054739378L ^ var3_3))) break block86;
                                                }
                                                catch (MatchException v42) {
                                                    throw _8S.a((Exception)v42);
                                                }
                                                var53_43 = var48_38 + var52_42 * _8S.d("t", (int)19285, (long)(5114174035054739378L ^ var3_3)) + var51_41;
                                                try {
                                                    try {
                                                        try {
                                                            v29 = var53_43;
                                                            if (var23_19) break block85;
                                                            if (v29 < 0) break block86;
                                                        }
                                                        catch (MatchException v43) {
                                                            throw _8S.a((Exception)v43);
                                                        }
                                                        v29 = var53_43;
                                                        if (var23_19) break block85;
                                                    }
                                                    catch (MatchException v44) {
                                                        throw _8S.a((Exception)v44);
                                                    }
                                                    if (v29 >= _8S.f("M", (Object)var45_35, (long)1013042899210098511L, (long)var3_3)) break block86;
                                                }
                                                catch (MatchException v45) {
                                                    throw _8S.a((Exception)v45);
                                                }
                                                var54_44 = (class_2248)_8S.f("M", (Object)var45_35, (int)var53_43, (long)1026066161279117766L, (long)var3_3);
                                                try {
                                                    block94: {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        v46 /* !! */  = _8S.f("M", (Object)var1_1, (long)1023985616976014007L, (long)var3_3);
                                                                        if (var23_19) break block92;
                                                                        if (v46 /* !! */  == false) {
                                                                        }
                                                                        ** GOTO lbl351
                                                                    }
                                                                    catch (MatchException v47) {
                                                                        throw _8S.a((Exception)v47);
                                                                    }
                                                                    v48 = this;
                                                                    if (var23_19) break block93;
                                                                }
                                                                catch (MatchException v49) {
                                                                    throw _8S.a((Exception)v49);
                                                                }
                                                                if (_8S.f("M", (Object)_8S.f("\u00a5", (Object)v48, (long)1024128644144904808L, (long)var3_3), (Object)var54_44, (long)1011463101980971271L, (long)var3_3) == false) break block94;
                                                            }
                                                            catch (MatchException v50) {
                                                                throw _8S.a((Exception)v50);
                                                            }
                                                            _8S.f("M", (Object)_8S.f("\u00a5", (Object)this, (long)1024128644144904808L, (long)var3_3), (Object)var54_44, (long)1025303205578337201L, (long)var3_3);
                                                            if (!var23_19) break block95;
                                                        }
                                                        catch (MatchException v51) {
                                                            throw _8S.a((Exception)v51);
                                                        }
                                                    }
                                                    v48 = this;
                                                }
                                                catch (MatchException v52) {
                                                    throw _8S.a((Exception)v52);
                                                }
                                            }
                                            v53 = new Object[2];
                                            v53[1] = var7_5;
                                            v53[0] = var54_44;
                                            var55_45 = _8S.f("M", (Object)v48, (Object)v53, (long)1022512412554175345L, (long)var3_3);
                                            try {
                                                _8S.f("M", (Object)_8S.f("\u00a5", (Object)this, (long)1024128644144904808L, (long)var3_3), (Object)var54_44, (Object)var55_45, (long)1025129375569570035L, (long)var3_3);
                                                if (!var23_19) break block95;
lbl351:
                                                // 2 sources

                                                v46 /* !! */  = _8S.f("M", (Object)var1_1, (long)1023985616976014007L, (long)var3_3);
                                            }
                                            catch (MatchException v54) {
                                                throw _8S.a((Exception)v54);
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (var23_19) break block96;
                                                    if (v46 /* !! */  != true) break block95;
                                                }
                                                catch (MatchException v55) {
                                                    throw _8S.a((Exception)v55);
                                                }
                                                v56 = _8S.f("\u00a5", (Object)this, (long)1024128644144904808L, (long)var3_3);
                                                v57 = var54_44;
                                                if (var23_19) break block97;
                                            }
                                            catch (MatchException v58) {
                                                throw _8S.a((Exception)v58);
                                            }
                                            if (_8S.f("M", (Object)v56, (Object)v57, (long)1011463101980971271L, (long)var3_3) != false) break block98;
                                        }
                                        catch (MatchException v59) {
                                            throw _8S.a((Exception)v59);
                                        }
                                        v60 = new Object[2];
                                        v60[1] = var7_5;
                                        v60[0] = var54_44;
                                        var55_45 = _8S.f("M", (Object)this, (Object)v60, (long)1022512412554175345L, (long)var3_3);
                                        _8S.f("M", (Object)_8S.f("\u00a5", (Object)this, (long)1024128644144904808L, (long)var3_3), (Object)var54_44, (Object)var55_45, (long)1025129375569570035L, (long)var3_3);
                                    }
                                    v56 = _8S.f("\u00a5", (Object)this, (long)1024128644144904808L, (long)var3_3);
                                    v57 = var54_44;
                                }
                                var55_45 = (_8B)_8S.f("M", (Object)v56, (Object)v57, (long)1025640853378161383L, (long)var3_3);
                                var56_46 = _8S.f("M", (Object)_8S.f("M", (Object)var54_44, (long)1012353906436538217L, (long)var3_3), (long)1012572354666229995L, (long)var3_3);
                                try {
                                    try {
                                        v61 = var56_46;
                                        if (var23_19) break block99;
                                        if (_8S.f("M", (Object)v61, (long)1022539290622495088L, (long)var3_3) <= _8S.d("t", (int)9824, (long)(8801551035896550051L ^ var3_3))) break block100;
                                    }
                                    catch (MatchException v62) {
                                        throw _8S.a((Exception)v62);
                                    }
                                    v61 = (String)_8S.f("M", (Object)var56_46, (int)0, (int)_8S.d("t", (int)11386, (long)(4581686581192349841L ^ var3_3)), (long)1024897756186720577L, (long)var3_3) + (String)_8S.b("r", (int)8178, (long)(4745563148738161904L ^ var3_3));
                                }
                                catch (MatchException v63) {
                                    throw _8S.a((Exception)v63);
                                }
                            }
                            var56_46 = v61;
                        }
                        _8S.f("M", (Object)_8S.f("\u00e6", (long)1011138423766219960L, (long)var3_3), (Object)new _8l(var17_10, (String)var56_46, (_8B)var55_45, (Consumer<_8B>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, 7(long net.minecraft.class_2248 dev.krypton.8B ), (Ldev/krypton/8B;)V)((_8S)this, (long)var15_9, (class_2248)var54_44), (class_437)this), (long)1024615158532657319L, (long)var3_3);
                    }
                    v46 /* !! */  = (CallSite)true;
                }
                return (boolean)v46 /* !! */ ;
            }
            v29 = (reference)super.method_25402(var1_1, var2_2);
        }
        return (boolean)v29;
    }

    private _8B cfr_renamed_5(Object[] objectArray) {
        class_2248 class_22482 = (class_2248)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = (l2 = b ^ l2) ^ 0x481E96478349L;
        CallSite callSite = _8S.f("M", (Object)_8S.f("M", (Object)_8S.f("\u00e6", -4524276901534105812L, (long)l2), (Object)class_22482, -4539014524239662126L, (long)l2), -4524081033029424025L, (long)l2);
        Random random = new Random((long)callSite);
        reference var9_7 = _8S.d("t", 9142, (long)(0x3925E407D74C187DL ^ l2)) + _8S.f("M", (Object)random, (int)_8S.d("t", 32737, (long)(0x69D56E791828442BL ^ l2)), -4536119527163387653L, (long)l2);
        reference var10_8 = _8S.d("t", 9142, (long)(0x3925E407D74C187DL ^ l2)) + _8S.f("M", (Object)random, (int)_8S.d("t", 18344, (long)(0x5E7982F00E01FC58L ^ l2)), -4536119527163387653L, (long)l2);
        reference var11_9 = _8S.d("t", 9142, (long)(0x3925E407D74C187DL ^ l2)) + _8S.f("M", (Object)random, (int)_8S.d("t", 18344, (long)(0x5E7982F00E01FC58L ^ l2)), -4536119527163387653L, (long)l2);
        return new _8B((int)var9_7, (int)var10_8, l3, (int)var11_9, (int)_8S.d("t", 7215, (long)(0x368B64930F9D27D0L ^ l2)));
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
                                                            v0 = var9_5 = _8S.b ^ 19827034216837L;
                                                            var11_6 = v0 ^ 96616686823802L;
                                                            var13_7 = v0 ^ 37327587920019L;
                                                            var15_8 = v0 ^ 11929407993766L;
                                                            var17_9 = v0 ^ 39467346787064L;
                                                            var19_10 = v0 ^ 116701177240513L;
                                                            v1 = new Object[2];
                                                            v1[1] = var17_9;
                                                            v1[0] = var1_1;
                                                            var1_1 = (double)_8S.f("M", (Object)this, (Object)v1, (long)-3071900458344752096L, (long)var9_5);
                                                            v2 = new Object[2];
                                                            v2[1] = var17_9;
                                                            v2[0] = var3_2;
                                                            var3_2 = (double)_8S.f("M", (Object)this, (Object)v2, (long)-3071900458344752096L, (long)var9_5);
                                                            v3 = new Object[1];
                                                            v3[0] = var11_6;
                                                            var22_11 = _8S.f("M", (Object)this, (Object)v3, (long)-3069424550538427418L, (long)var9_5);
                                                            v4 = new Object[1];
                                                            v4[0] = var13_7;
                                                            var23_12 = _8S.f("M", (Object)this, (Object)v4, (long)-3069826377809311016L, (long)var9_5);
                                                            v5 = new Object[1];
                                                            v5[0] = var19_10;
                                                            var24_13 = _8S.f("M", (Object)this, (Object)v5, (long)-3070399830049254773L, (long)var9_5);
                                                            var25_14 = _8S.f("\u00a5", (Object)this, (long)-3073396501990414461L, (long)var9_5) + var24_13 + true + _8S.d("t", (int)7121, (long)(6110584835220649041L ^ var9_5));
                                                            var26_15 = var25_14 + _8S.d("t", (int)12318, (long)(4988669356118744987L ^ var9_5)) + _8S.d("t", (int)14169, (long)(5766004841225689323L ^ var9_5));
                                                            var27_16 = _8S.f("\u00a5", (Object)this, (long)-3075232871831711234L, (long)var9_5) + _8S.d("t", (int)9824, (long)(8801492724242254283L ^ var9_5));
                                                            var21_17 = _02.cfr_renamed_2();
                                                            try {
                                                                try {
                                                                    v6 = _8S.f("\u00a5", (Object)this, (long)-3070780727427101397L, (long)var9_5);
                                                                    if (var21_17) break block39;
                                                                    if (v6 != false) break block40;
                                                                }
                                                                catch (MatchException v7) {
                                                                    throw _8S.a((Exception)v7);
                                                                }
                                                                v8 = var26_15 + _8S.d("t", (int)12318, (long)(4988669356118744987L ^ var9_5)) + _8S.d("t", (int)13656, (long)(6584591389311179515L ^ var9_5));
                                                                break block41;
                                                            }
                                                            catch (MatchException v9) {
                                                                throw _8S.a((Exception)v9);
                                                            }
                                                        }
                                                        v6 = var26_15;
                                                    }
                                                    v8 = v6 + _8S.d("t", (int)13656, (long)(6584591389311179515L ^ var9_5));
                                                }
                                                var28_18 = v8;
                                                var29_19 = var22_11 - _8S.d("t", (int)18377, (long)(1346067062818564196L ^ var9_5));
                                                var30_20 = var23_12 - (var28_18 - _8S.f("\u00a5", (Object)this, (long)-3073396501990414461L, (long)var9_5)) - _8S.d("t", (int)27041, (long)(5345408650649978372L ^ var9_5));
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                v10 = new Object[7];
                                                                v10[6] = (int)var30_20;
                                                                v10[5] = (int)var29_19;
                                                                v10[4] = (int)var28_18;
                                                                v10[3] = (int)var27_16;
                                                                v10[2] = var3_2;
                                                                v10[1] = var1_1;
                                                                v10[0] = var15_8;
                                                                v11 /* !! */  = _8S.f("M", (Object)this, (Object)v10, (long)-3073619762849517379L, (long)var9_5);
                                                                if (var21_17) break block42;
                                                                if (v11 /* !! */  == false) break block43;
                                                            }
                                                            catch (MatchException v12) {
                                                                throw _8S.a((Exception)v12);
                                                            }
                                                            v13 = this;
                                                            if (var21_17) break block44;
                                                        }
                                                        catch (MatchException v14) {
                                                            throw _8S.a((Exception)v14);
                                                        }
                                                        if (_8S.f("\u00a5", (Object)v13, (long)-3070780727427101397L, (long)var9_5) != false) break block45;
                                                    }
                                                    catch (MatchException v15) {
                                                        throw _8S.a((Exception)v15);
                                                    }
                                                    v13 = this;
                                                }
                                                catch (MatchException v16) {
                                                    throw _8S.a((Exception)v16);
                                                }
                                            }
                                            v17 = _8S.f("\u00a5", (Object)v13, (long)-3070977563712926058L, (long)var9_5);
                                            break block53;
                                        }
                                        v17 = new ArrayList<E>(_8S.f("M", (Object)_8S.f("\u00a5", (Object)this, (long)-3071977644858810112L, (long)var9_5), (long)-3072295266914564473L, (long)var9_5));
                                    }
                                    var31_21 = v17;
                                    var32_22 = (int)_8S.f("\u00f3", (double)((double)_8S.f("M", (Object)var31_21, (long)-3069407455313753049L, (long)var9_5) / 11.0), (long)-3074278773284312009L, (long)var9_5);
                                    var33_23 = _8S.f("\u00f3", (int)0, (int)(var32_22 - _8S.d("t", (int)4318, (long)(3418376941162250105L ^ var9_5))), (long)-3073937875899733420L, (long)var9_5);
                                    try {
                                        block48: {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            v18 /* !! */  = _8S.f("\u00a5", (Object)this, (long)-3070780727427101397L, (long)var9_5);
                                                            if (var21_17) break block46;
                                                            if (v18 /* !! */  == false) {
                                                            }
                                                            ** GOTO lbl145
                                                        }
                                                        catch (MatchException v19) {
                                                            throw _8S.a((Exception)v19);
                                                        }
                                                        cfr_temp_0 = var7_4 - 0.0;
                                                        v18 /* !! */  = (CallSite)(cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1));
                                                        if (var21_17) break block47;
                                                    }
                                                    catch (MatchException v20) {
                                                        throw _8S.a((Exception)v20);
                                                    }
                                                    if (v18 /* !! */  <= 0) break block48;
                                                }
                                                catch (MatchException v21) {
                                                    throw _8S.a((Exception)v21);
                                                }
                                                _8S.f("a", (Object)this, (int)_8S.f("\u00f3", (int)0, (int)(_8S.f("\u00a5", (Object)this, (long)-3074456163935037931L, (long)var9_5) - true), (long)-3073937875899733420L, (long)var9_5), (long)-3074456163935037931L, (long)var9_5);
                                                if (!var21_17) break block49;
                                            }
                                            catch (MatchException v22) {
                                                throw _8S.a((Exception)v22);
                                            }
                                        }
                                        v18 /* !! */  = (CallSite)((cfr_temp_1 = var7_4 - 0.0) == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1));
                                    }
                                    catch (MatchException v23) {
                                        throw _8S.a((Exception)v23);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            if (var21_17) break block50;
                                            if (v18 /* !! */  >= 0) break block49;
                                        }
                                        catch (MatchException v24) {
                                            throw _8S.a((Exception)v24);
                                        }
                                        _8S.f("a", (Object)this, (int)_8S.f("\u00f3", (int)var33_23, (int)(_8S.f("\u00a5", (Object)this, (long)-3074456163935037931L, (long)var9_5) + true), (long)-3075350546178862960L, (long)var9_5), (long)-3074456163935037931L, (long)var9_5);
                                        if (!var21_17) break block49;
                                    }
                                    catch (MatchException v25) {
                                        throw _8S.a((Exception)v25);
                                    }
lbl145:
                                    // 2 sources

                                    v18 /* !! */  = (CallSite)((cfr_temp_2 = var7_4 - 0.0) == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1));
                                }
                                catch (MatchException v26) {
                                    throw _8S.a((Exception)v26);
                                }
                            }
                            try {
                                block52: {
                                    try {
                                        try {
                                            if (var21_17) break block51;
                                            if (v18 /* !! */  <= 0) break block52;
                                        }
                                        catch (MatchException v27) {
                                            throw _8S.a((Exception)v27);
                                        }
                                        _8S.f("a", (Object)this, (int)_8S.f("\u00f3", (int)0, (int)(_8S.f("\u00a5", (Object)this, (long)-3073340186084995766L, (long)var9_5) - true), (long)-3073937875899733420L, (long)var9_5), (long)-3073340186084995766L, (long)var9_5);
                                        if (!var21_17) break block49;
                                    }
                                    catch (MatchException v28) {
                                        throw _8S.a((Exception)v28);
                                    }
                                }
                                v18 /* !! */  = (CallSite)((cfr_temp_3 = var7_4 - 0.0) == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1));
                            }
                            catch (MatchException v29) {
                                throw _8S.a((Exception)v29);
                            }
                        }
                        try {
                            try {
                                if (var21_17) break block50;
                                if (v18 /* !! */  >= 0) break block49;
                            }
                            catch (MatchException v30) {
                                throw _8S.a((Exception)v30);
                            }
                            _8S.f("a", (Object)this, (int)_8S.f("\u00f3", (int)var33_23, (int)(_8S.f("\u00a5", (Object)this, (long)-3073340186084995766L, (long)var9_5) + true), (long)-3075350546178862960L, (long)var9_5), (long)-3073340186084995766L, (long)var9_5);
                        }
                        catch (MatchException v31) {
                            throw _8S.a((Exception)v31);
                        }
                    }
                    v18 /* !! */  = (CallSite)true;
                }
                return (boolean)v18 /* !! */ ;
            }
            v11 /* !! */  = (CallSite)super.method_25401(var1_1, var3_2, var5_3, var7_4);
        }
        return (boolean)v11 /* !! */ ;
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
                                long l5 = l3 = b ^ 0x2EB0D2DBE650L;
                                l2 = l5 ^ 0x76FA6030B985L;
                                l4 = l5 ^ 0x2CCC69282508L;
                                bl = _02.cfr_renamed_2();
                                try {
                                    try {
                                        object = _8S.f("M", (Object)class_119082, -1534633342582222087L, (long)l3);
                                        if (bl) break block18;
                                        if (object == _8S.d("t", 16634, (long)(0x7AAD44A7D184D094L ^ l3))) {
                                        }
                                        break block19;
                                    }
                                    catch (MatchException matchException) {
                                        throw _8S.a((Exception)((Object)matchException));
                                    }
                                    Object[] objectArray = new Object[2];
                                    objectArray[1] = new HashMap(_8S.f("\u00a5", (Object)this, -1546115507702145323L, (long)l3));
                                    objectArray[0] = l2;
                                    _8S.f("M", (Object)_8S.f("\u00a5", (Object)this, -1548718344963140855L, (long)l3), (Object)objectArray, -1533913514159362208L, (long)l3);
                                    _8S.f("M", (Object)_8S.f("\u00e6", -1534251128182892539L, (long)l3), (Object)_8S.f("\u00a5", (Object)_8S.f("\u00e6", -1535584403146090369L, (long)l3), -1548195450409089691L, (long)l3), -1547727823875197926L, (long)l3);
                                    return true;
                                }
                                catch (MatchException matchException) {
                                    throw _8S.a((Exception)((Object)matchException));
                                }
                            }
                            object = _8S.f("\u00a5", (Object)this, -1533658697998748930L, (long)l3);
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (bl) break block20;
                                        if (object != false) break block21;
                                    }
                                    catch (MatchException matchException) {
                                        throw _8S.a((Exception)((Object)matchException));
                                    }
                                    Object[] objectArray = new Object[2];
                                    objectArray[1] = l4;
                                    objectArray[0] = class_119082;
                                    object = _8S.f("M", (Object)_8S.f("\u00a5", (Object)this, -1548924838585498175L, (long)l3), (Object)objectArray, -1547316523643440437L, (long)l3);
                                    if (bl) break block20;
                                }
                                catch (MatchException matchException) {
                                    throw _8S.a((Exception)((Object)matchException));
                                }
                                if (object == false) break block21;
                            }
                            catch (MatchException matchException) {
                                throw _8S.a((Exception)((Object)matchException));
                            }
                            return true;
                        }
                        catch (MatchException matchException) {
                            throw _8S.a((Exception)((Object)matchException));
                        }
                    }
                    object = _8S.f("M", (Object)class_119082, -1534633342582222087L, (long)l3);
                }
                try {
                    try {
                        if (bl) break block22;
                        if (object == _8S.d("t", 2281, (long)(0xE4F6A5264C18BAL ^ l3))) {
                        }
                        break block23;
                    }
                    catch (MatchException matchException) {
                        throw _8S.a((Exception)((Object)matchException));
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = new HashMap(_8S.f("\u00a5", (Object)this, -1546115507702145323L, (long)l3));
                    objectArray[0] = l2;
                    _8S.f("M", (Object)_8S.f("\u00a5", (Object)this, -1548718344963140855L, (long)l3), (Object)objectArray, -1533913514159362208L, (long)l3);
                    _8S.f("M", (Object)_8S.f("\u00e6", -1534251128182892539L, (long)l3), (Object)_8S.f("\u00a5", (Object)_8S.f("\u00e6", -1535584403146090369L, (long)l3), -1548195450409089691L, (long)l3), -1547727823875197926L, (long)l3);
                    return true;
                }
                catch (MatchException matchException) {
                    throw _8S.a((Exception)((Object)matchException));
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
                long l2 = b ^ 0x1B550C059073L;
                long l3 = l2 ^ 0x7D5BB83E5F33L;
                boolean bl = _02.cfr_renamed_3();
                try {
                    try {
                        object = _8S.f("\u00a5", (Object)this, -7163981879253220131L, (long)l2);
                        if (!bl) break block4;
                        if (object != false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _8S.a((Exception)((Object)matchException));
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = class_119052;
                    objectArray[0] = l3;
                    return (boolean)_8S.f("M", (Object)_8S.f("\u00a5", (Object)this, -7160115424790875166L, (long)l2), (Object)objectArray, -7159672136759938260L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _8S.a((Exception)((Object)matchException));
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
                int n;
                int n2;
                int n3;
                block6: {
                    long l3 = l2 = b ^ l2;
                    long l4 = l3 ^ 0x44BCA79B88D4L;
                    long l5 = l3 ^ 0x50BA943A12CL;
                    n3 = (int)(l5 >>> 32);
                    n2 = (int)(l5 << 32 >>> 48);
                    n = (int)(l5 << 48 >>> 48);
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
                                        objectArray[0] = l4;
                                        callSite = _8S.f("M", (Object)_8S.f("\u00a5", (Object)this, -6386651157486090210L, (long)l2), (Object)objectArray, -6389000479211892883L, (long)l2);
                                        if (bl) break block6;
                                        l7 = -6389121729186864234L;
                                        l6 = l2;
                                        if (l2 <= 0L) break block7;
                                        if (_8S.f("M", (Object)callSite, (long)l7, (long)l6) == false) break block8;
                                    }
                                    catch (MatchException matchException) {
                                        throw _8S.a((Exception)((Object)matchException));
                                    }
                                    _8S.f("a", (Object)this, new ArrayList(_8S.f("\u00a5", (Object)this, -6390361301441809511L, (long)l2)), -6382835314593088356L, (long)l2);
                                    if (l2 < 0L) break block9;
                                    if (!bl) break block10;
                                }
                                catch (MatchException matchException) {
                                    throw _8S.a((Exception)((Object)matchException));
                                }
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l4;
                            callSite2 = _8S.f("M", (Object)_8S.f("\u00a5", (Object)this, -6386651157486090210L, (long)l2), (Object)objectArray, -6389000479211892883L, (long)l2);
                            l7 = -6388804920060157163L;
                            l6 = l2;
                        }
                        callSite = _8S.f("M", (Object)callSite2, (long)l7, (long)l6);
                    }
                    catch (MatchException matchException) {
                        throw _8S.a((Exception)((Object)matchException));
                    }
                }
                CallSite callSite3 = callSite;
                _8S.f("a", (Object)this, (List)((List)((Object)_8S.f("M", (Object)_8S.f("M", (Object)_8S.f("M", (Object)_8S.f("\u00a5", (Object)this, -6390361301441809511L, (long)l2), -6382651598746271609L, (long)l2), arg_0 -> _8S.cfr_renamed_9(n3, (String)((Object)callSite3), (short)n2, (short)n, arg_0), -6390529121212881622L, (long)l2), (Object)_8S.f("\u00f3", -6382102848899068957L, (long)l2), -6383322386604940928L, (long)l2))), -6382835314593088356L, (long)l2);
            }
            _8S.f("a", (Object)this, (int)_8S.d("t", 24158, (long)(0x47331F19491E83D0L ^ l2)), -6386252310086278113L, (long)l2);
        }
    }

    private static boolean cfr_renamed_9(int n, String string, short s, short s2, class_2248 class_22482) {
        long l2 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)s2 << 48 >>> 48) ^ b;
        return (boolean)_8S.f("M", (Object)_8S.f("M", (Object)_8S.f("M", (Object)_8S.f("M", (Object)class_22482, 757079697286757348L, (long)l2), 756697420746585190L, (long)l2), 772708736486231802L, (long)l2), (Object)string, 774319660645544231L, (long)l2);
    }

    private void cfr_renamed_9(long l2, class_2248 class_22482, _8B b) {
        l2 = _8S.b ^ l2;
        _8S.f("M", (Object)_8S.f("\u00a5", (Object)this, -1584354785885626787L, (long)l2), (Object)class_22482, (Object)b, -1581696300197114682L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    private void cfr_renamed_8(long var1_1, class_2248 var3_2) {
        block36: {
            block41: {
                block40: {
                    block47: {
                        block39: {
                            block38: {
                                block37: {
                                    block35: {
                                        var1_1 = _8S.b ^ var1_1;
                                        var4_3 = _02.cfr_renamed_2();
                                        v0 = var3_2;
                                        v1 = _8S.f("\u00e6", (long)-52053960638468863L, (long)var1_1);
                                        if (var4_3) break block35;
                                        try {
                                            block43: {
                                                if (v0 == v1) break block36;
                                                break block43;
                                                catch (Exception v2) {
                                                    throw _8S.a(v2);
                                                }
                                            }
                                            v0 = var3_2;
                                            v1 = _8S.f("\u00e6", (long)-53005016429551696L, (long)var1_1);
                                        }
                                        catch (Exception v3) {
                                            throw _8S.a(v3);
                                        }
                                    }
                                    v4 = var4_3;
                                    if (var1_1 <= 0L) ** GOTO lbl37
                                    if (v4) break block37;
                                    try {
                                        block44: {
                                            if (v0 == v1) break block36;
                                            break block44;
                                            catch (Exception v5) {
                                                throw _8S.a(v5);
                                            }
                                        }
                                        v0 = var3_2;
                                        v1 = _8S.f("\u00e6", (long)-51627143736505357L, (long)var1_1);
                                    }
                                    catch (Exception v6) {
                                        throw _8S.a(v6);
                                    }
                                }
                                v4 = var4_3;
lbl37:
                                // 2 sources

                                if (var1_1 <= 0L) ** GOTO lbl53
                                if (v4) break block38;
                                try {
                                    block45: {
                                        if (v0 == v1) break block36;
                                        break block45;
                                        catch (Exception v7) {
                                            throw _8S.a(v7);
                                        }
                                    }
                                    v0 = var3_2;
                                    v1 = _8S.f("\u00e6", (long)-52613147253462192L, (long)var1_1);
                                }
                                catch (Exception v8) {
                                    throw _8S.a(v8);
                                }
                            }
                            v4 = var4_3;
lbl53:
                            // 2 sources

                            if (var1_1 <= 0L) ** GOTO lbl69
                            if (v4) break block39;
                            try {
                                block46: {
                                    if (v0 == v1) break block36;
                                    break block46;
                                    catch (Exception v9) {
                                        throw _8S.a(v9);
                                    }
                                }
                                v0 = var3_2;
                                v1 = _8S.f("\u00e6", (long)-49883895056935671L, (long)var1_1);
                            }
                            catch (Exception v10) {
                                throw _8S.a(v10);
                            }
                        }
                        v4 = var4_3;
lbl69:
                        // 2 sources

                        if (v4) break block40;
                        if (v0 == v1) break block36;
                        break block47;
                        catch (Exception v11) {
                            throw _8S.a(v11);
                        }
                    }
                    try {
                        block48: {
                            v0 = var3_2;
                            v12 = var4_3;
                            if (var1_1 <= 0L) ** GOTO lbl96
                            if (v12) break block41;
                            break block48;
                            catch (Exception v13) {
                                throw _8S.a(v13);
                            }
                        }
                        v1 = _8S.f("\u00e6", (long)-52807218201575140L, (long)var1_1);
                    }
                    catch (Exception v14) {
                        throw _8S.a(v14);
                    }
                }
                if (v0 == v1) break block36;
                v0 = var3_2;
            }
            try {
                if (var1_1 <= 0L) ** GOTO lbl106
                v12 = var4_3;
lbl96:
                // 2 sources

                if (!v12) {
                    if (_8S.f("M", (Object)_8S.f("M", (Object)v0, (long)-52475513030065483L, (long)var1_1), (long)-53237443794033929L, (long)var1_1) != false) break block36;
                }
                ** GOTO lbl106
            }
            catch (Exception v15) {
                throw _8S.a(v15);
            }
            try {
                block42: {
                    v0 = var3_2;
lbl106:
                    // 4 sources

                    v16 = _8S.f("M", (Object)v0, (long)-52959845152234328L, (long)var1_1);
                    if (var1_1 < 0L || var4_3) break block42;
                    try {
                        block49: {
                            if (v16 == null) break block36;
                            break block49;
                            catch (Exception v17) {
                                throw _8S.a(v17);
                            }
                        }
                        v16 = _8S.f("M", (Object)_8S.f("M", (Object)_8S.f("M", (Object)var3_2, (long)-52959845152234328L, (long)var1_1), (long)-38011130855766703L, (long)var1_1), (long)-52087919316369334L, (long)var1_1);
                    }
                    catch (Exception v18) {
                        throw _8S.a(v18);
                    }
                }
                try {
                    if (v16 != _8S.f("\u00e6", (long)-54004947712419987L, (long)var1_1)) {
                        _8S.f("M", (Object)_8S.f("\u00a5", (Object)this, (long)-52393789214282868L, (long)var1_1), (Object)var3_2, (long)-52862077108928292L, (long)var1_1);
                    }
                }
                catch (Exception v19) {
                    throw _8S.a(v19);
                }
            }
            catch (Exception var5_4) {
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
                        _8S.b = dev.krypton.l.a(-6135965586540723792L, 5435251851150329169L, MethodHandles.lookup().lookupClass()).a(209201696311451L);
                        _8S.q = new Object[160];
                        _8S.r = new String[160];
                        _8S.b();
                        _8S.h = new HashMap<K, V>(13);
                        var11 = _8S.b ^ 71616942105564L;
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
                        var17_5 = "\u00ea\u000fM\u0010\u00bb\u0013\u0095\u0091\u00ca\u00d2(\u0015\u00e5\u0093x_v\u00b3\u0089\u008b!]\u00d6F K\u00e2\u00a1o\\\u001f\u0086\u0010\u008a\u0000\u00e0\u00aa\u00b3\u00baB\u00ba%\u00fd\u00fa\u000f{X\u00a2\u00c8.\u00cfFIL]\u00e9x\u0010z\u00a31\u0016M\u0002L8\u00c6\u0080\u00cb\u00f1t\u00935\u00f2 \u00f4\u001e?\u00edMco\u00d1\u0000=\u00ff\u00cf\u001e\u0099\u00c6\u0098\u0093\u0098y\u00bf$*^7\u00e2\u00e6\u009f{_\u001cY\u00c6 \u008ec\u008fk?\u0081\u0094\u00d6\u001d\u0089IQ\u0083\u0011\u00d0q\u00db\u00e7x\u00a5\u00f6\u00b2=\u00fb\u00f8\u00d7\u00b8\\C?\u00d2\u00a4\u0018X\u0005f\u00f7\u00d2\u00d4\u009f\u00a5.\u00e8\u00d1\u00bf\u0089\u00a5\u00db\u00ba%\u00a4\u00fe\u00d5\u00f1*\u00a6I 6\u0001\u00db3K\u00cb \u00a7\u0090\ti\u0084\u00eau\u00e6+b\u0091\u0098\u00f67\u0096\u00a6%Y\u00d3P\u00a6\u00ef\u007f\u008fy\u0010\u00ab\u00fap<\u00f1\u00b1M{\u0001\u00dc|x\u0012ME\u0099\u0018\u00eb\u00c2\u00d1\u00b1]\u0080@\u00aeQ\u00cb\u00f19\u00a6i\u00ee\u0000f>\u008d\u00c3\u00d7(\u00f3\u00940J\u0083=)}\u00bc\u00d8\u000122\u00cfH]:\u00ee\u0015b\u00beR\u00eb\u00d3 \u00f5\u00f3-\u00966\u0000cJ\u00bd\u00f0\u00ae\u0083c\u0003\u008d\u0000\\\nDdK)>\rA\u0018\u0010\u00cf\u00b4M3\u00f9h\u00f8\u0017\u00dc\u00ac\u0016\u00a7\u00fe4fW\u0018\u008cI\u0010\u00acBa\u0001\u00b0\u0095\u00f9^\u00be\u00ab\u00a3\r/\f\u00c1{\u0017\u00fa\u00cd\u00afJ";
                        var19_6 = "\u00ea\u000fM\u0010\u00bb\u0013\u0095\u0091\u00ca\u00d2(\u0015\u00e5\u0093x_v\u00b3\u0089\u008b!]\u00d6F K\u00e2\u00a1o\\\u001f\u0086\u0010\u008a\u0000\u00e0\u00aa\u00b3\u00baB\u00ba%\u00fd\u00fa\u000f{X\u00a2\u00c8.\u00cfFIL]\u00e9x\u0010z\u00a31\u0016M\u0002L8\u00c6\u0080\u00cb\u00f1t\u00935\u00f2 \u00f4\u001e?\u00edMco\u00d1\u0000=\u00ff\u00cf\u001e\u0099\u00c6\u0098\u0093\u0098y\u00bf$*^7\u00e2\u00e6\u009f{_\u001cY\u00c6 \u008ec\u008fk?\u0081\u0094\u00d6\u001d\u0089IQ\u0083\u0011\u00d0q\u00db\u00e7x\u00a5\u00f6\u00b2=\u00fb\u00f8\u00d7\u00b8\\C?\u00d2\u00a4\u0018X\u0005f\u00f7\u00d2\u00d4\u009f\u00a5.\u00e8\u00d1\u00bf\u0089\u00a5\u00db\u00ba%\u00a4\u00fe\u00d5\u00f1*\u00a6I 6\u0001\u00db3K\u00cb \u00a7\u0090\ti\u0084\u00eau\u00e6+b\u0091\u0098\u00f67\u0096\u00a6%Y\u00d3P\u00a6\u00ef\u007f\u008fy\u0010\u00ab\u00fap<\u00f1\u00b1M{\u0001\u00dc|x\u0012ME\u0099\u0018\u00eb\u00c2\u00d1\u00b1]\u0080@\u00aeQ\u00cb\u00f19\u00a6i\u00ee\u0000f>\u008d\u00c3\u00d7(\u00f3\u00940J\u0083=)}\u00bc\u00d8\u000122\u00cfH]:\u00ee\u0015b\u00beR\u00eb\u00d3 \u00f5\u00f3-\u00966\u0000cJ\u00bd\u00f0\u00ae\u0083c\u0003\u008d\u0000\\\nDdK)>\rA\u0018\u0010\u00cf\u00b4M3\u00f9h\u00f8\u0017\u00dc\u00ac\u0016\u00a7\u00fe4fW\u0018\u008cI\u0010\u00acBa\u0001\u00b0\u0095\u00f9^\u00be\u00ab\u00a3\r/\f\u00c1{\u0017\u00fa\u00cd\u00afJ".length();
                        var16_7 = 24;
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
                            var20_3[var18_4++] = _8S.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "5\u00ca\u00c2\u0087R;\u0082\u0001\u001e\u008c\u0006r\u0089\u00b9S\u00fc\u0080\u00cc\u00cc-\u00e8\u00d9\u0090\u00af\u0010A\u0098\u00f1 \u00e8]\u008dR\u00e8\u0006\u00c6bf\u00b0\u00a7\u00af";
                            var19_6 = "5\u00ca\u00c2\u0087R;\u0082\u0001\u001e\u008c\u0006r\u0089\u00b9S\u00fc\u0080\u00cc\u00cc-\u00e8\u00d9\u0090\u00af\u0010A\u0098\u00f1 \u00e8]\u008dR\u00e8\u0006\u00c6bf\u00b0\u00a7\u00af".length();
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
                            var20_3[var18_4++] = _8S.b(var21_9).intern();
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
                _8S.f = var20_3;
                _8S.g = new String[14];
                _8S.n = new HashMap<K, V>(13);
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
                var6_12 = new long[58];
                var3_13 = 0;
                var4_14 = "\u0014\u0011\u00ff\u00c6\u00c1\b\u0010\r|\u009f$\u0087\u00e3\u00e2\u00ee\u00af\u00fd\u0082]e\u001a\u00d0wUX\u008b\u00cbD\u00a2\u008e\u008c\u00075\u0003\u00e5\u00a0\u00c6fd\u0095]z^\u0095\u00af\u00da<)\u00e9\u0090\u00c4\\\u008d\u00e3\u00cev\\C.O\u0098\u00c6\u00b1\u00eb_\"Qd\u00fei\u00d53\u00dci<\u00deO\u00f4\u00ae\t\u00a0\u00ee\u0099J\u0013\u00b3+:\u0005\u00ef\u001a\u00e1\u008at\u00b4\u00b3I)\u00c0Y\u00cc\u00ea\u0005\u0089\u00f1\u00e3!\u0088w\u0082*\u00c7\u00ab\u00d8\u0010\u0001c\u007fa]y\u00fb\u001b\u007f\u00ca\u00c7L\u0010M\u00e1\u00bc\u00e5\u00ab\u00b8\u009c\u008d\u009e\u00cc\u009f\u00ba Y}\u008e\u00bc\u009d\u00e5r4SL\u009a\u0092\u009f<r\u0090\u0090-\u0007\u00aa\u00c2 P\u00f2\u009b\u00b1\u00e9\u0082\u00bav\u00c4z\u0006\u00e1q\u00d8$\u0095\u0017\u0089\u0011\u00c5a!\u0006I\u00e5\u00197\u00e2g\u001b!}\u00c7\u008d\u00c7\u00e8\u0084\u00c7R\u001d\u00f6\u00e6\ne\b\u00b2\u00ae\u0086\u00d7h\u00c7\u00c7\u0014\u00879\u00b7\u00ee\u00b6.\u0088\u00bd\u00ef\u00da\u00f9cs#\u00ae\u00c1\u00a0)f\u0093\u00f6{\u0092X^\u009f0\u00cb\u008a\u00dd_\u0018\u00e64\u00a2\u00ae\u00d7~D\u008c\u00d1\u00d1\u00f8\u00dc\u00e4\u00ca;g\u00a3\u0016\u0000\u0091\u0003Oj\u007fgq\"\u00f3s\u00b2uq\u00eahY\u00ea$V\u00d8*R\u0011\u00db\u009f\r\u00daw\u00c8`F\u0090^\u00f6\u00df\u00c0C\u0099,[\u00cd\u0098\u00ef\u00cc\u00a9\u009e\u00cb\tmT4\u00f2BC\t\u00f1%k\u008d\u008aP=\"2\u00c6f\u009a\u0007=%\u00ef'\u0097\u00b66\u0080\n\u009er\u008b~\u00acQ\u00e3\u0082t\u00d6\u0010\u00e0\u00ca+\u00fb\u0090\u00b3u\u00b4\u00e7\u0082\u00c9\u00a2\u008by\u00f19O\u008bm\u00fa\u00cenKB\u00af\u00a4\u00bd\u0015\u00c3\u00d6i\u001d\u0097\u001d\u0005bB\u009fI\b\u00a9\u00ae\u0002\u00e5\u0081v\u00da\u001c\u008ep\u009e\u00bf\u001d\u00d5\u009c\u00c3\u00f1\u009alG\u00e0i\u00f2\u0010*\u00d1\u00c5H\u0013\f\r\u0090]\u00e9\u001f\u00d2\u00e7\u00ac\u0006u\u00c0\u0096\t\u00c5\u00e9\u00b6\u00cc\u00be\u0098\u0003\u00b0\u00c0\u00b5";
                var5_15 = "\u0014\u0011\u00ff\u00c6\u00c1\b\u0010\r|\u009f$\u0087\u00e3\u00e2\u00ee\u00af\u00fd\u0082]e\u001a\u00d0wUX\u008b\u00cbD\u00a2\u008e\u008c\u00075\u0003\u00e5\u00a0\u00c6fd\u0095]z^\u0095\u00af\u00da<)\u00e9\u0090\u00c4\\\u008d\u00e3\u00cev\\C.O\u0098\u00c6\u00b1\u00eb_\"Qd\u00fei\u00d53\u00dci<\u00deO\u00f4\u00ae\t\u00a0\u00ee\u0099J\u0013\u00b3+:\u0005\u00ef\u001a\u00e1\u008at\u00b4\u00b3I)\u00c0Y\u00cc\u00ea\u0005\u0089\u00f1\u00e3!\u0088w\u0082*\u00c7\u00ab\u00d8\u0010\u0001c\u007fa]y\u00fb\u001b\u007f\u00ca\u00c7L\u0010M\u00e1\u00bc\u00e5\u00ab\u00b8\u009c\u008d\u009e\u00cc\u009f\u00ba Y}\u008e\u00bc\u009d\u00e5r4SL\u009a\u0092\u009f<r\u0090\u0090-\u0007\u00aa\u00c2 P\u00f2\u009b\u00b1\u00e9\u0082\u00bav\u00c4z\u0006\u00e1q\u00d8$\u0095\u0017\u0089\u0011\u00c5a!\u0006I\u00e5\u00197\u00e2g\u001b!}\u00c7\u008d\u00c7\u00e8\u0084\u00c7R\u001d\u00f6\u00e6\ne\b\u00b2\u00ae\u0086\u00d7h\u00c7\u00c7\u0014\u00879\u00b7\u00ee\u00b6.\u0088\u00bd\u00ef\u00da\u00f9cs#\u00ae\u00c1\u00a0)f\u0093\u00f6{\u0092X^\u009f0\u00cb\u008a\u00dd_\u0018\u00e64\u00a2\u00ae\u00d7~D\u008c\u00d1\u00d1\u00f8\u00dc\u00e4\u00ca;g\u00a3\u0016\u0000\u0091\u0003Oj\u007fgq\"\u00f3s\u00b2uq\u00eahY\u00ea$V\u00d8*R\u0011\u00db\u009f\r\u00daw\u00c8`F\u0090^\u00f6\u00df\u00c0C\u0099,[\u00cd\u0098\u00ef\u00cc\u00a9\u009e\u00cb\tmT4\u00f2BC\t\u00f1%k\u008d\u008aP=\"2\u00c6f\u009a\u0007=%\u00ef'\u0097\u00b66\u0080\n\u009er\u008b~\u00acQ\u00e3\u0082t\u00d6\u0010\u00e0\u00ca+\u00fb\u0090\u00b3u\u00b4\u00e7\u0082\u00c9\u00a2\u008by\u00f19O\u008bm\u00fa\u00cenKB\u00af\u00a4\u00bd\u0015\u00c3\u00d6i\u001d\u0097\u001d\u0005bB\u009fI\b\u00a9\u00ae\u0002\u00e5\u0081v\u00da\u001c\u008ep\u009e\u00bf\u001d\u00d5\u009c\u00c3\u00f1\u009alG\u00e0i\u00f2\u0010*\u00d1\u00c5H\u0013\f\r\u0090]\u00e9\u001f\u00d2\u00e7\u00ac\u0006u\u00c0\u0096\t\u00c5\u00e9\u00b6\u00cc\u00be\u0098\u0003\u00b0\u00c0\u00b5".length();
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
                    var4_14 = "l\u00f9\u00a8\r4\u00f0g\u00cf\u00b6\u00ec\u00af\u00c5a\u00af\u00d6\u0096";
                    var5_15 = "l\u00f9\u00a8\r4\u00f0g\u00cf\u00b6\u00ec\u00af\u00c5a\u00af\u00d6\u0096".length();
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
        _8S.l = var6_12;
        _8S.m = new Integer[58];
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
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x7D2E;
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
                throw new RuntimeException("dev/krypton/8S", exception);
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
            _8S.g[n2] = _8S.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _8S.b(n, l2);
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
            throw new RuntimeException("dev/krypton/8S" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int d(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x7AEC;
        if (m[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = l[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])_8S.n.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    _8S.n.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/8S", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _8S.m[n2] = n3;
        }
        return m[n2];
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _8S.d(n, l2);
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
            throw new RuntimeException("dev/krypton/8S" + " : " + string + " : " + methodType.toString(), exception);
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
            case 0 -> 59;
            case 1 -> 5;
            case 2 -> 7;
            case 3 -> 34;
            case 4 -> 28;
            case 5 -> 44;
            case 6 -> 8;
            case 7 -> 15;
            case 8 -> 50;
            case 9 -> 57;
            case 10 -> 36;
            case 11 -> 13;
            case 12 -> 35;
            case 13 -> 54;
            case 14 -> 61;
            case 15 -> 27;
            case 16 -> 11;
            case 17 -> 9;
            case 18 -> 20;
            case 19 -> 10;
            case 20 -> 41;
            case 21 -> 43;
            case 22 -> 52;
            case 23 -> 46;
            case 24 -> 37;
            case 25 -> 29;
            case 26 -> 6;
            case 27 -> 38;
            case 28 -> 40;
            case 29 -> 23;
            case 30 -> 48;
            case 31 -> 3;
            case 32 -> 55;
            case 33 -> 42;
            case 34 -> 2;
            case 35 -> 31;
            case 36 -> 60;
            case 37 -> 63;
            case 38 -> 26;
            case 39 -> 25;
            case 40 -> 39;
            case 41 -> 22;
            case 42 -> 53;
            case 43 -> 17;
            case 44 -> 45;
            case 45 -> 58;
            case 46 -> 47;
            case 47 -> 19;
            case 48 -> 49;
            case 49 -> 1;
            case 50 -> 4;
            case 51 -> 12;
            case 52 -> 33;
            case 53 -> 51;
            case 54 -> 14;
            case 55 -> 21;
            case 56 -> 30;
            case 57 -> 18;
            case 58 -> 56;
            case 59 -> 0;
            case 60 -> 62;
            case 61 -> 24;
            case 62 -> 16;
            default -> 32;
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
        _8S.r[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = q;
        q[0] = "Q\u000bV/\u0015#L\u001eTn\u0010\u007f\u0007";
        objectArray[1] = "Q\u0007\u0014vCEL\u0012\u00167F\u0019\f/";
        objectArray[2] = "J\bj(\u0004UW\u001dhi\u0001\t\u0016>";
        objectArray[3] = ".(\u000f\u0000&B3=\rA#\u001e}\u001b";
        objectArray[4] = "D_Xr\u0011lYJZ3\u00140\u0019N";
        objectArray[5] = "\u0002\b_+hs\u001c\u0000Ed\u000bg\u0018";
        objectArray[6] = Integer.TYPE;
        _8S.r[6] = "java/lang/Integer";
        objectArray[7] = ";\u001es.\u0011VN>x!\u0000\u0019/0s*\u0004C[";
        objectArray[8] = Void.TYPE;
        _8S.r[8] = "java/lang/Void";
        objectArray[9] = "\u0010\u0013/I\u0014\u000e\u0010\u00138\u0015\u0018\u0001\nX8\u000b\u0018\u0014\r)jV@WF";
        objectArray[10] = "\fB1\u0006{\t\fB&Zw\u0006\u0016\t&Dw\u0013\u0011xv\u0019&";
        objectArray[11] = "\u001d9w m\rh\u0019|/|B\t\u0017w$x\u0018}";
        objectArray[12] = Boolean.TYPE;
        _8S.r[12] = "java/lang/Boolean";
        objectArray[13] = "AyK0\f8Ay\\l\u00007[2\\r\u0000\"\\C\u000b-V";
        objectArray[14] = "7\u0002q\fMG7\u0002fPAH-IfNA]*87\u0010\u0014\u0016";
        objectArray[15] = "FEPL\n.FEG\u0010\u0006!\\\u000eG\u000e\u00064[\u007f\u0011PRw";
        objectArray[16] = "\u0006)upIA\r&d?4Y\u001e!mv";
        objectArray[17] = "eJ[BB\u0017nEJ\r/\u0013nY~F\u001d\u000ejENF";
        objectArray[18] = "_+\u0013E\u001b3B>\u0011\u0004\u001eo\u0003+";
        objectArray[19] = "+](L&c6H*\r#?wz";
        objectArray[20] = "K\u0004+P\u0011x@\u000b:\u001fruU\r";
        objectArray[21] = "\b[Jw\u0005$}{Ax\u0014k\u001cuJs\u00101h";
        objectArray[22] = "Q8Dn\u001e^L-F/\u001b\u0002\rj";
        objectArray[23] = "\nK\nqY\u000f\u007fk\u0001~H@\u001ee\nuL\u001aj";
        objectArray[24] = "lK\u007fxDlrCe7&pu^";
        objectArray[25] = "?l,xrE4c=7\u0013K?h9m";
        objectArray[26] = Double.TYPE;
        _8S.r[26] = "java/lang/Double";
        objectArray[27] = "9\u007f/}\u0002$$j-<\u0007xdS";
        objectArray[28] = "4i][\u0017tAIVT\u0006; G]_\u0002aT";
        objectArray[29] = "\u001bh\u000e|gOnH\u0005sv\u0000\u000fF\u000exrZ{";
        objectArray[30] = Float.TYPE;
        _8S.r[30] = "java/lang/Float";
        objectArray[31] = "x\u0004I8hZ\r$B7y\u0015l*I<}O\u0018";
        objectArray[32] = "j~,\u001bK!\u001f^'\u0014Zn~P,\u001f^4\n";
        objectArray[33] = "\u0007S\u0004\u00180\u0011rs\u000f\u0017!^\u0013}\u0004\u001c%\u0004g";
        objectArray[34] = "u$\u0007pT(\u0000\u0004\f\u007fEga\n\u0007tA=\u0015";
        objectArray[35] = "y\u000bRne\u0005y\u000bE2i\nc@E,i\u001fd1\u0017w1^";
        objectArray[36] = "+{7B8Z^[<M)\u0015?U7F-OK";
        objectArray[37] = "}xWlqbcpM#\frc";
        objectArray[38] = "H\u0014[\u0005\u0018X=4P\n\t\u0017\\:[\u0001\rM(";
        objectArray[39] = "2q\u0001|/\u001b2q\u0016 #\u0014(:\u0016>#\u0001/KDc{Be";
        objectArray[40] = "OjE\u0007\u0002):JN\b\u0013f[DE\u0003\u0017</";
        objectArray[41] = ":W\tka}Ow\u0002dp2.y\tothZ";
        objectArray[42] = "2/gpJhG\u000fl\u007f['&\u0001gt_}R";
        objectArray[43] = ")\u0017THEC\\7_GT\f=9TLPVI";
        objectArray[44] = "y>8\u001d\u0007X\f\u001e3\u0012\u0016\u0017m\u00108\u0019\u0012M\u0019";
        objectArray[45] = "\\H\u007f\u0010\u001bw)ht\u001f\n8Hf\u007f\u0014\u000eb<";
        objectArray[46] = "\u0017+\nx\"\u0018b\u000b\u0001w3W\u0003\u0005\n|7\rw";
        objectArray[47] = "\u0012.\r4\\9g\u000e\u0006;Mv\u0006\u0000\r0I,r";
        objectArray[48] = "f\u0006e7Z~f\u0006rkVq|MruVd{<& \u0005%";
        objectArray[49] = "\u0015%\t\nL\u0018\u000b-\u0013E\u0004\u0018\u0011'\u000b\u0002\r\u0003Q\u0007\u0010\u0005\u0011\u0018\u0012!\r";
        objectArray[50] = "=\b@T;\u000eH(K[*A)&@P.\u001b]";
        objectArray[51] = "R`\u0002d vLh\u0018+MlTm\u0011fzjWo";
        objectArray[52] = "3\u0003\u0007[@\u00103\u0003\u0010\u0007L\u001f)H\u0010\u0019L\n.9DL\u001fJ";
        objectArray[53] = "V\rb``@H\u0005x/=AN\tul`fH\u001eq`#";
        objectArray[54] = "i{\u0001\u0013Mqws\u001b\\\u0005qmy\u0003\u001b\fj-J\u0005\u0017\u0007m`{\u0003\u0017";
        objectArray[55] = "Z@vbX</`}mIsNnvfM):";
        objectArray[56] = "hur\u0006T\u001cv}hI\t\u001dpqe\nT*mxh\u0002\u0019\u001dmf";
        objectArray[57] = "O\u0018i6M Q\u0010sy\u0010!W\u001c~:M\u0016J\u0015s2\u0000!J\u000bl";
        objectArray[58] = ".skmL*[S`b]e:]kiY?N";
        objectArray[59] = "\u001f\u0005.zmd\u0002\u0010,;h8BU";
        objectArray[60] = "\"Eu\u0019X<We~\u0016Is6ku\u001dM)B";
        objectArray[61] = "S9\u000b'g\u001aS9\u001c{k\u0015Ir\u001cek\u0000N\u0003M0<C";
        objectArray[62] = "e6\u000bs\u000eW{>\u0011<rCa3\u0012\u007f";
        objectArray[63] = "T{Bnb7T{U2n8N0U,n-IA\u0004r;h";
        objectArray[64] = "/l\u001b*.g/l\fv\"h5'\fh\"}2V]2{>";
        objectArray[65] = "\u0000\u0018\u0001/1P\u0000\u0018\u0016s=_\u001aS\u0016m=J\u001d\"D9l\u000b";
        objectArray[66] = "/i3]kK/i$\u0001gD5\"$\u001fgQ2SvD?\u001b";
        objectArray[67] = "}6g.2\u001b+;;Mcb?'+*=\u0005()5";
        objectArray[68] = "=\u000f\u0017\u001d\u001epj\n\u001a\u0007grV\u001aA\u0004^w)\u0010Y\u0003\u0019";
        objectArray[69] = "\u000e[! \u001be\u0000\\(cpa\nB\u0019'\u0011`\t^%i\to\f2%z\u0014n\u000f\u000ekb\u001bkc\u000ex\u007f\u001ah_@`p\u001f\u0004";
        objectArray[70] = "XIO}\u001a\u0013\u000fLBgc\u00163\tCh\u0006AN@\u0015\"\u000fR3\r\u001dg\u001bES\f\u0000)Z(";
        objectArray[71] = "lH]0S\u00038\u0006\u001f1\u0000q;\u0019\u000f1\\&l@Xi\u000bq<D\u0010o\u000f\u0010l\u0001\u0006;";
        objectArray[72] = "|W>\u001dCT+R3\u0007:UV.c\u001fFV+Qi\u0007A\u0011";
        objectArray[73] = "QR%?uRSR$?I\u000684'9 A\u0016N{n1\u0001";
        objectArray[74] = ",}s:x\u0014.}r:D@^\u001bpc%E|t5+$\u001e";
        objectArray[75] = "H$5BnJB<2\u0005R\n$\u007f(\u001f8Y\u001810\u0010=";
        objectArray[76] = "XQ\u0019\u0007^PZQ\u0018\u0007b\u0004\u00197\u001d\u0007\u0006U\r\u000bS\u001f\tP";
        objectArray[77] = "\u0017\u001e\u001b0\u0010P\u0005Z\u00075)]\u0015\u001akbHV\u0012\nW,PY\u0017f\u000b<E\rD\u0019\u001b!H[x";
        objectArray[78] = "wour&-yh|1M'wg)I,qvdv)12*yM(p x=-53|e\u0006";
        objectArray[79] = "\u001b$hIW,Gsy\t)g!z<EL?\\3j\u000fE,!sfK@5\u001dsg_SV";
        objectArray[80] = " NFF73!@W\u001a\u000fnA\u0007\u001b\nj;<NM@c(ARA\u00066n>XY\u0001qR";
        objectArray[81] = "TJo\u0010\u0006YZMfSm]XEW\u0017\f\\SOkY\u0014SV#kJ\tRU\u001f%R\u0006W9\u001f6O\u0007T\u0005Q.@\u00028";
        objectArray[82] = "'4s&<\u000fs6y-\u0004\u0012q(y*ih|/rk8\u0017l2\u007f=\u0004\b~!!h{\u0018c,wT";
        objectArray[83] = "g\u000b~T'60\u000esN^3\fN.U4a0\u00006Z1";
        objectArray[84] = "`\u0010a6bi4\u0012k=Ze?\u0004e>Z38\u0016t):2%X5D";
        objectArray[85] = "\rI\np\\eM\tTl?z\u0010N\u000bfSHD\nQ;\u0006\u001f\u001dP\u0007>\u0003`\rM\nh?&CV\u00108^gFQ\u000e0?";
        objectArray[86] = "B{e\u0007\rQ\u001e,tGs\u0013x%1\u000b\u0016B\u0005lgA\u001fQx,k\u0005\u001aHD,j\u0011\t+";
        objectArray[87] = "p.^|Hw$,Twp\u007f&+3n\u0012|tkL~\u000fq\"WSl\u001c/w(Cq\u0011yK";
        objectArray[88] = "\u0018m/\u001e=d[h-\u0013\f=Jpv\t`\u000f\u001e1.Q\fiI<'TucWton1;Xt{\u000e0&\u00165\u0016";
        objectArray[89] = "m\u0012(d\u0013\bg\n/#/KDuh<K\u001dmI&$D\u0018";
        objectArray[90] = "\"\u001c]\u0002V\u0012,\u001bTA=\u0016&\u0005e]WBvJYF\u0003\u0019#u\u0001S\fJpI\u001a\u0007W\u001fO\u0011\u000f\b\u0004Ls\n[SQs";
        objectArray[91] = "\u0016bf779\u001egx-Mj\u001b\u0002.z=0\u0011\u007fg,w9\u0002\u0002*$2-\u0015b+9|lx";
        objectArray[92] = "p7.\u0000]Ed/a\u001a=Eg9'\rG_|<\\M\\Zp?`\u0003DUuS`\u0010YTvo.\bVQ\u001a98\u0003L^a- LV>";
        objectArray[93] = "C7\f)\rw\u00065\u001c/\u0013\u0005G\n[.\u0000`\u0013w\u0012xJi\u0000\n\bw\u0002t\u001aq\u001coMnz";
        objectArray[94] = "\f2\u001e\u001bsnX|\\\u001a \u001c[cL\u001a|K\f:\u001a@!\u001c\\>SD/}\f{E\u0010";
        objectArray[95] = "S&\u0013q?p\u0007$\u0019z\u0007o\u0015#~ce{Wc\u0001sxv\u0001_\u001eak(T \u000e|f~h?\u001co8+\u0017/\u0001bn\u0017";
        objectArray[96] = "gn.`tj0k#z\rl\f.\"uh8qgt?a+\f+~ag=0efnbQ";
        objectArray[97] = "\u0007/(VwF\u0005/)VK\u0012qI+N&[\u0006.\u007fL,P";
        objectArray[98] = "jUuy]5/\u001dt\"4aQT)7Q3,\u001d\u007f}X QVm*Fb6\u0002o MZ";
        objectArray[99] = "vpMa\u00076~uS{}f\u0018)\u0001a\u00183e`W+\u0011 \u0018q\u0001}\u001faxlB!\u0002Z";
        objectArray[100] = "/s0\u0017\u0014>;k\u007f\rt$>Z'\u001e\b4E'%\u0018\u001d&y'$\f\u000eE";
        objectArray[101] = "U=;IXq\u0017|>[Q\u0015\u0002mjM]B\\59\u00131r\u0007lhJU.\u0012gh";
        objectArray[102] = "L$!R'&\u0010s0\u0012Ylvzu^<5\u000b3#\u00145&v~+Q!1\u0016\u007f6\u001f`\\";
        objectArray[103] = "LI5RM~\u0010\u001e$\u00123?v\u0017a^Vm\u000b^7\u0014_~vD8\\Bd\rP \u0013X\u0004";
        objectArray[104] = "V0C\u0012\u000eDB(\f\bnC[\u0010V\u001c\u0003Ew=J\u000enUX&@\u0003\u0015A@iZc";
        objectArray[105] = "7\u0000(QycuA\"\u0005\u0019j*\u001d(7%>|HP\u0001$m/C0\u001cg12x";
        objectArray[106] = "\r\n*E/;]O<\u0011\u0010?\tJ8\u0018|\rT\rhN\u0010=\u000fV7\u001cta\u001a]7\u007f";
        objectArray[107] = "#g[(D-w)\u0019)\u0017_t6\t)K\b#oYq\u001c_sk\u0016w\u0018>#.\u0000#";
        objectArray[108] = "O\u0014i\u0018_\u001f\u0012I8\u001bMo\u0010F)\bw\t\n+e\u0015R\u0005\u001a\u0017+\r]\u0000v\u00178\u0010\\\u0003JY \u001fYo";
        objectArray[109] = "\u0005*\u0003..WQ(\t%\u0016SS\"51j0Gj\ndl\\Si\u00163\u0016";
        objectArray[110] = "\u0007\nE\u0001KT\u000e]Q\u0006K$[WD\u0001VHi\u0000\u0006[\b\u0019>\n_\u001fXG\u0002\n^\u000bK$";
        objectArray[111] = "\u001af0\\C\u0011X':\b#\u0016\rb(\nO$_\"rQ\u001es\\\u007f,\u0007OO\u0012g#\u0002#";
        objectArray[112] = "aoI.Gi?:\r*GQ66T-\u0012+Xn\t-\u00166`0H1\u00108Xn\b(\u0000i`0]l\u0004iX";
        objectArray[113] = "\u0017L\fiv\u0004C\u0002Nh%v@\u001d^hy!\u0017D\u000f=$vG@A6*\u0017\u0017\u0005Wb";
        objectArray[114] = "\u0015f$h\u00134\u0017f%h/c,odyAbN} eD";
        objectArray[115] = "{rwAM\u0002+7a\u0015r\u0006\u007f2e\u001c\u001e4#s;GrZ\"3e\u0001\u0002Su'b\u0001r";
        objectArray[116] = "O\u000eYX2X\u001b@\u001bYa*\u0018_\u000bY=}M\u0007^\u0006n*\u001f\u0002\u0014\u0007nKOG\u0002S";
        objectArray[117] = "/\u001a^gS\u0002=^Bbj\t,\u000e.i\b\f\u007f^Qy\u0015\u0001)b\u001en\u0014\t#^\u001eo\u0000\u001a@";
        objectArray[118] = ";F~D;\u00063C`^ATe&6\t1\u000f<[\u007f_{\u0006/&2W>\u00128F3JpSU";
        objectArray[119] = "]/oM,\"I7 WL2P-aU-?LKv\u0001q:X&t]se7{zB%:\u000b{{V6Y";
        objectArray[120] = "G`k\u00005G\u0010ef\u001aLF, g\u0015)\u0015Qi1_ \u0006,)=\u001b%\u001f\u0010)<\u000f6|";
        objectArray[121] = "J!6^p5\u001eot_#G\u001dpd_\u007f\u0010J)0\u0001/G\u001a-{\u0001,&JhmU";
        objectArray[122] = "6a\tLs+4a\bLO}\u000f>\f]*-rwZ\u0017#>\u000fkVQvxpaNV1D";
        objectArray[123] = "\b.c\u001ae.\u001c6,\u0000\u00051\u000f,~\u0017eU^+u\u0001ii\u00103z\u0004\u0005";
        objectArray[124] = "l\u001f8\u001b\u001dbn\u001f9\u001b!6ly<\u001bEg9Er\u0003Jb";
        objectArray[125] = "< T\u001fF$k%Y\u0005?#We\u0004\u001eUsk+\u001c\u0011P";
        objectArray[126] = "cO\u0013T\nK1\u0003\u001f\u0002\u000bu?\u0013\u0013\t\u0007\u0019\rA^QQu=\u0015\u000f\u0006\u0003\u0011a\u0000\u0004\u0006`";
        objectArray[127] = "\u0002\u0013\r*_JU\u0016\u00000&Ai\u0006[3\u001fM\u0016\fC4X";
        objectArray[128] = "|}MHsTn9QMJMo\u007fPO/6*=DYr\u000eth\u0000]r6";
        objectArray[129] = "fzLua\u000f'\u007fKkin?-Sn\u0013\t3)(29\n5(\u0014|!\u00050D";
        objectArray[130] = "\u0014&X\u0001c4I(\u001c\u0004^=G?E\u001c2\u000f\u0015\u007f\u001fAnX\u0016\"A\u00112dX:N\u0014^";
        objectArray[131] = "\u0019\u0010P\u0013IpN\u0015]\t0{rP\\\u0006U\"\u000f\u0019\nL\\1rT\u0002\tH&\u0012U\u001fG\tK";
        objectArray[132] = "5\t\u0011`FL'M\re\u007fU;\u0003\f\u000eCO>\u001b\r2\rW1\u001ea";
        objectArray[133] = "E>fg1\u001fG>gg\rN|acvh\u0019\u0001(5<a\n|d?bg\u001c@*'mbp";
        objectArray[134] = "6it\u0016&\rj|\u007f\u0016E\f<~t\u001e)>n2)EEP`~)\u0013{\u0002,r\u007f\u0012E";
        objectArray[135] = ",Ks-X\\)Op>\u001a#{\u0012r0\bt)J&kY#e\b~%\u0007Y%H 9";
        objectArray[136] = "\u0013 ]U\u0001\u0003\u0001dAP8\u0000\u0007\u0015HCD\u0010|hJEQ\u0002@hKQBa";
        objectArray[137] = ")-ePI7~maI\\\tlv\u001bJXu\u0010(d\u0016Rd~s UMg\u0010";
        objectArray[138] = "[\u001f\u0013.\u0014a\u000bZ\u0005z+e__\u0001sGW\u0003\u001eX$+iLX\u0002{Z=^\u001eZ\u0014";
        objectArray[139] = "ywet+\b.rhnR\u000e\u00127ia7Zo~?+>I\u0012b3mk\u000fmh+j,3";
        objectArray[140] = "\u0018B=}\u0015\u0007]\n<&|R#Ca3\u0019\u0001^\n7y\u0010\u0012#\u0015$3\u0012QA\u0007`/\u0017h";
        objectArray[141] = "\bm\u000eF0f\\\u007fH\u001e_x\fo.Y%v\u0007|uO;e\u0010s\u000e[#*\n\u0013";
        objectArray[142] = "\u007f\u001bIf\u0014\u0018}\u001bHf(FFDLwM\u001e;\r\u001a=D\rFA\u0010cB\u001bz\u000f\blGw";
        objectArray[143] = "4nf_4-bc:<d\u0017\u0004,$\f>=}z)P";
        objectArray[144] = "\r+&zJ\\\u000f+'zv\f4q\u007f\u007f\u001c_\b?gp\u0019";
        objectArray[145] = "s!9\u0016P<'#3\u001dh )*9dT:,28X\u001a\"#7T";
        objectArray[146] = "\u001eV,2R~\nNc(2y\u0013o&;_\u007f?[%.2o\u0010@/#I{\b\u000f5C";
        objectArray[147] = "mr\u007fZ-\u00051%n\u001aSCW,+V6\u0016*e}\u001c?\u0005W(uY+\u00127)h\u0017j\u007f";
        objectArray[148] = "lp\"fe\u000b)8#=\f\\Wq~(i\r*8(b`\u001eWu 't\t7t=i5d";
        objectArray[149] = "\"x\b\u001dm9b8V\u0001\u000e-5y$\u0005e#Rr\r\nl&):\t\riCo`\u0016\u0014c#n}XU\u000e";
        objectArray[150] = "Zip#;z\u0004<4';B\b6m8n)\u001fQ0g>3\u000e?k#},\rQi>o}_.y#b+c";
        objectArray[151] = "Hi.<\u000e\u000e\u001fl#&w\u0005#)\")\u0012\\^`tc\u001bO#,~=\u001dY\u001fbf2\u00185";
        objectArray[152] = "\u0013i'8\u0002G\u0001-;=;L\u0010}\u001e2_%\u000e}:/R\u0015\u001ekn);\u0015\u001bo>5\u0007\u0015\u001a{-V";
        objectArray[153] = "G\u001d\u0012o=|\u0011\u0010N\fm^wPC5$4K\u0013F7)";
        objectArray[154] = "|;5P!~>z?\u0004Awa&56}#7rM\u0000|pdx-\u001d?,yC";
        objectArray[155] = "\u0013Y4NT/\u0019A3\th`\u007f\u0002)\u0013\u0002<CL1\u001c\u0007";
        objectArray[156] = "\u0006\u0012qr\u001d\u0000\u000e\u0017ohg\\hK=r\u0002\u0005\u0015\u0002k8\u000b\u0016h\u0013=n\u0005W\b\u000e~2\u0018l";
        objectArray[157] = "\u0013\u000fnQ\u000bIG\rdZ3EO\u0010\u007fJRHS5nR3NJ\u001a<\u001fL^W\u0017j#\u0003IV\u001f`\u001f\u0003HB\f\u0003";
        objectArray[158] = ",pz{ =p'k;^vW\u0017*:.\"\u007fjcld+l\u0017.d!?{w/yo~\u0016";
        Object[] objectArray2 = objectArray;
        objectArray[159] = "D\u0019iS+_F\u0019hS\u0017\u000bE\u007f>Jg^D\u001d,\u000e{[";
    }

    private static Class f(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _8S.e(l2, l3);
            object = q[n];
            try {
                if (!(object instanceof String)) break block2;
                _8S.q[n] = clazz = Class.forName(r[n]);
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
        Field field = _8S.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _8S.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field g(long l2, long l3) {
        int n = _8S.e(l2, l3);
        Object object = q[n];
        if (object instanceof String) {
            String string = r[n];
            int n2 = string.indexOf(8);
            Class clazz = _8S.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _8S.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _8S.c(clazz3, string2, clazz2)) != null) {
                    _8S.q[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _8S.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _8S.q[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _8S.f(1781154620408530L, 0L);
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
        Method method = _8S.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _8S.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method h(long l2, long l3) {
        int n = _8S.e(l2, l3);
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
                clazz3 = _8S.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _8S.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _8S.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _8S.q[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _8S.f(1781154620408530L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _8S.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _8S.q[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _8S.f(1781154620408530L, 0L);
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
            if (c == '\u00a5' || c == 'a' || c == '\u00e6' || c == 'C') {
                field = _8S.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a5' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'a' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _8S.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'M' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _8S.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8S" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_8S.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_8S.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_8S.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

