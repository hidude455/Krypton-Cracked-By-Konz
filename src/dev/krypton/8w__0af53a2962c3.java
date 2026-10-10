/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_11908
 *  net.minecraft.class_11909
 */
package dev.krypton;

import dev.krypton._4t;
import dev.krypton._4w;
import dev.krypton._87;
import dev.krypton._8B;
import dev.krypton._9M;
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
import net.minecraft.class_11908;
import net.minecraft.class_11909;

/*
 * Renamed from dev.krypton.8w
 */
public abstract class _8w_0 {
    static protected final int cfr_renamed_1;
    public List cfr_renamed_8;
    public int cfr_renamed_4;
    public int cfr_renamed_2;
    public _8B cfr_renamed_95;
    public boolean cfr_renamed_84;
    public boolean cfr_renamed_5;
    public _9M cfr_renamed_81;
    protected int cfr_renamed_120;
    protected int cfr_renamed_78;
    protected int cfr_renamed_0;
    protected int cfr_renamed_6;
    protected int cfr_renamed_3;
    protected float cfr_renamed_102;
    private int cfr_renamed_7;
    private boolean cfr_renamed_9;
    private static boolean cfr_renamed_90;
    private static final long a;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;
    private static final Object[] l;
    private static final String[] m;

    public static boolean cfr_renamed_5() {
        boolean bl = _8w_0.cfr_renamed_4();
        return !bl;
    }

    public int int_1(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (int)_8w_0.d("e", (Object)this, 942325688727143865L, (long)l2);
    }

    protected abstract void void_1(Object[] var1);

    protected void cfr_renamed_457(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = a ^ l2) ^ 0x10FAD46EE408L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _8w_0.d("\u00d3", (Object)this, (Object)objectArray2, 2868690333109080788L, (long)l2);
    }

    /*
     * Exception decompiling
     */
    public void cfr_renamed_456(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [11[TRYBLOCK]], but top level block is 23[SWITCH]
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
    public void cfr_renamed_112(Object[] var1_1) {
        var4_2 = ((Float)var1_1[0]).floatValue();
        var2_3 = (Long)var1_1[1];
        v0 = var2_3 = _8w_0.a ^ var2_3;
        var5_4 = v0 ^ 45612176752480L;
        var7_5 = v0 ^ 43543492199620L;
        var9_6 = v0 ^ 129387466797020L;
        var11_7 = v0 ^ 118799866418052L;
        var13_8 = v0 ^ 50657858080281L;
        v1 = new Object[1];
        v1[0] = var11_7;
        var16_9 = _8w_0.d("\u00d3", (Object)this, (Object)v1, (long)-3233393019317403328L, (long)var2_3);
        var17_10 = _8w_0.d("\u00d3", (Object)_8w_0.d("e", (Object)this, (long)-3227609187892082877L, (long)var2_3), (long)-3226247684466093737L, (long)var2_3);
        var15_11 = _8w_0.cfr_renamed_4();
        while (_8w_0.d("\u00d3", (Object)var17_10, (long)-3225815056412794275L, (long)var2_3) != false) {
            block19: {
                block24: {
                    block23: {
                        block22: {
                            block20: {
                                block21: {
                                    block18: {
                                        var18_12 = (_4t)_8w_0.d("\u00d3", (Object)var17_10, (long)-3233090988817561329L, (long)var2_3);
                                        try {
                                            try {
                                                v2 = new Object[1];
                                                v2[0] = var9_6;
                                                v3 = _8w_0.d("\u00d3", (Object)var18_12, (Object)v2, (long)-3232854427549826859L, (long)var2_3);
                                                v4 = var15_11;
                                                if (var2_3 >= 0L) {
                                                    if (v4) break block18;
                                                    if (v3 == false) break block19;
                                                }
                                                ** GOTO lbl41
                                            }
                                            catch (MatchException v5) {
                                                throw _8w_0.b(v5);
                                            }
                                            v3 = _8w_0.d("e", (Object)var18_12, (long)-3232709463076881682L, (long)var2_3);
                                        }
                                        catch (MatchException v6) {
                                            throw _8w_0.b(v6);
                                        }
                                    }
                                    try {
                                        try {
                                            v4 = var15_11;
lbl41:
                                            // 2 sources

                                            if (v4) break block20;
                                            if (v3 == false) break block21;
                                        }
                                        catch (MatchException v7) {
                                            throw _8w_0.b(v7);
                                        }
                                        v8 = (double)_8w_0.d("e", (Object)var18_12, (long)-3226375325623235695L, (long)var2_3);
                                        break block22;
                                    }
                                    catch (MatchException v9) {
                                        throw _8w_0.b(v9);
                                    }
                                }
                                v10 = new Object[1];
                                v10[0] = var5_4;
                                v3 = _8w_0.d("\u00d3", (Object)this, (Object)v10, (long)-3233175497126504759L, (long)var2_3);
                            }
                            v8 = (double)v3;
                        }
                        var19_13 = v8;
                        try {
                            try {
                                v11 = var15_11;
                                if (var2_3 < 0L) ** GOTO lbl81
                                if (v11) break block23;
                                v12 = new Object[2];
                                v12[1] = var7_5;
                                v12[0] = _8w_0.d("x", (long)-3232949475090238511L, (long)var2_3);
                                if (_8w_0.d("\u00d3", (Object)_8w_0.d("x", (long)-3224950213246186881L, (long)var2_3), (Object)v12, (long)-3226270355033283766L, (long)var2_3) != false) {
                                }
                                ** GOTO lbl83
                            }
                            catch (MatchException v13) {
                                throw _8w_0.b(v13);
                            }
                            _8w_0.d("L", (Object)var18_12, (double)var19_13, (long)-3226060952458109832L, (long)var2_3);
                        }
                        catch (MatchException v14) {
                            throw _8w_0.b(v14);
                        }
                    }
                    try {
                        if (var2_3 <= 0L) break block24;
                        v11 = var15_11;
lbl81:
                        // 2 sources

                        if (!v11) break block24;
lbl83:
                        // 2 sources

                        v15 = new Object[4];
                        v15[3] = var19_13;
                        v15[2] = (double)_8w_0.d("e", (Object)var18_12, (long)-3226060952458109832L, (long)var2_3);
                        v15[1] = Float.valueOf((float)(0.5 * (double)var4_2));
                        v15[0] = var13_8;
                        _8w_0.d("L", (Object)var18_12, (double)_8w_0.d("\u00f3", (Object)v15, (long)-3225160702133388386L, (long)var2_3), (long)-3226060952458109832L, (long)var2_3);
                    }
                    catch (MatchException v16) {
                        throw _8w_0.b(v16);
                    }
                }
                var21_14 = _8w_0.d("e", (Object)var18_12, (long)-3226060952458109832L, (long)var2_3);
                _8w_0.d("L", (Object)var18_12, (int)var16_9, (long)-3224813016187861202L, (long)var2_3);
                var16_9 += (int)var21_14;
            }
            if (!var15_11) continue;
        }
    }

    public void cfr_renamed_165(Object[] objectArray) {
        _8w_0 w_0;
        boolean bl;
        long l2;
        long l3;
        double d;
        double d2;
        class_11909 class_119092;
        long l4;
        block9: {
            block10: {
                l4 = (Long)objectArray[0];
                class_119092 = (class_11909)objectArray[1];
                d2 = (Double)objectArray[2];
                d = (Double)objectArray[3];
                long l5 = l4 = a ^ l4;
                l3 = l5 ^ 0x4E3FFD010C8EL;
                l2 = l5 ^ 0x62567B4AEE06L;
                bl = _8w_0.cfr_renamed_5();
                try {
                    try {
                        w_0 = this;
                        if (!bl) break block9;
                        if (_8w_0.d("e", (Object)w_0, -1121824826602533961L, (long)l4) != false) break block10;
                    }
                    catch (MatchException matchException) {
                        throw _8w_0.b(matchException);
                    }
                    return;
                }
                catch (MatchException matchException) {
                    throw _8w_0.b(matchException);
                }
            }
            w_0 = this;
        }
        CallSite callSite = _8w_0.d("\u00d3", (Object)_8w_0.d("e", (Object)w_0, -1123928371074833391L, (long)l4), -1123600546020265467L, (long)l4);
        while (_8w_0.d("\u00d3", (Object)callSite, -1123188654050213617L, (long)l4) != false) {
            Object object;
            block12: {
                block13: {
                    _4t t;
                    block11: {
                        _4t t2 = (_4t)((Object)_8w_0.d("\u00d3", (Object)callSite, -1120275412186994083L, (long)l4));
                        try {
                            try {
                                t = t2;
                                if (!bl) break block11;
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l3;
                                object = _8w_0.d("\u00d3", (Object)t, (Object)objectArray2, -1121216449358716025L, (long)l4);
                                if (l4 <= 0L) break block12;
                                if (object == false) break block13;
                            }
                            catch (MatchException matchException) {
                                throw _8w_0.b(matchException);
                            }
                            t = t2;
                        }
                        catch (MatchException matchException) {
                            throw _8w_0.b(matchException);
                        }
                    }
                    Object[] objectArray3 = new Object[4];
                    objectArray3[3] = d;
                    objectArray3[2] = d2;
                    objectArray3[1] = class_119092;
                    objectArray3[0] = l2;
                    _8w_0.d("\u00d3", (Object)t, (Object)objectArray3, -1122062153138533989L, (long)l4);
                }
                object = bl;
            }
            if (object != false) continue;
        }
    }

    public _8w_0(long l2, int n, int n2, int n3, _9M m) {
        l2 = a ^ l2;
        _8w_0.d("L", (Object)this, new ArrayList(), -7927660428400032371L, (long)l2);
        _8w_0.d("L", (Object)this, 0.0f, -7931007149872810220L, (long)l2);
        _8w_0.d("L", (Object)this, (int)_8w_0.b("k", 17703, (long)(0x80293AE1854B6B3L ^ l2)), -7931259790659363698L, (long)l2);
        _8w_0.d("L", (Object)this, (boolean)_8w_0.b("k", 19936, (long)(0x5209CDC20C86BE73L ^ l2)), -7930744086318818013L, (long)l2);
        _8w_0.d("L", (Object)this, (int)n, -7927734837081049496L, (long)l2);
        _8w_0.d("L", (Object)this, (int)n2, -7929692567535435540L, (long)l2);
        _8w_0.d("L", (Object)this, (int)n3, -7929239370169092909L, (long)l2);
        _8w_0.d("L", (Object)this, (boolean)_8w_0.b("k", 9654, (long)(0x30E0C1E49E98562AL ^ l2)), -7929528227280640292L, (long)l2);
        _8w_0.d("L", (Object)this, (boolean)_8w_0.b("k", 19936, (long)(0x5209CDC20C86BE73L ^ l2)), -7930221509124675029L, (long)l2);
        _8w_0.d("L", (Object)this, (_9M)m, -7930016482797806185L, (long)l2);
        _8w_0.d("L", (Object)this, (int)n, -7927520190900154595L, (long)l2);
        _8w_0.d("L", (Object)this, (int)n2, -7928927755023804068L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                _8w_0.a = dev.krypton.l.a(-3954652349841278150L, 5024079732901209256L, MethodHandles.lookup().lookupClass()).a(26484347696720L);
                _8w_0.l = new Object[106];
                _8w_0.m = new String[106];
                _8w_0.a();
                _8w_0.h = new HashMap<K, V>(13);
                var0 = _8w_0.a ^ 27087039542288L;
                _8w_0.cfr_renamed_0(false);
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
                var8_3 = new long[16];
                var5_4 = 0;
                var6_5 = "E\u00030\u009b\u007f[\u00f4\u00b5&\u00caf/\u00e4\u00d5\u00d7\u00d4\u0097\u00e1\u00f8h\u00c3\u00a9\u0086K\u0081a\u00d3\u00f7$\u00a0!\u00c3\u00cf~\u00d3\u00b9mg\u000bXD%\u00f8\u008f\u00fcF5cR\u00a2\u00e71\u00a1\u00b6*\u00ff\u00b8\u00d6\u0094\u0096\u00c4\u0004=\u00e9\u00fd\u001a\u00b5\u00e1\u0082=;\u0083\u00a7\u00f0JQ\u00a6\u00c7r#\u0091^qsQ^\u00b6\u001fd\u00e9,\u00c1\u00c0*%\u00ff\u0010\u00d9\u00d5x\u00f0\u00ed\u0080&\u008b\u00e8x\u00c9\u0015\u00de\u0016\u00ef";
                var7_6 = "E\u00030\u009b\u007f[\u00f4\u00b5&\u00caf/\u00e4\u00d5\u00d7\u00d4\u0097\u00e1\u00f8h\u00c3\u00a9\u0086K\u0081a\u00d3\u00f7$\u00a0!\u00c3\u00cf~\u00d3\u00b9mg\u000bXD%\u00f8\u008f\u00fcF5cR\u00a2\u00e71\u00a1\u00b6*\u00ff\u00b8\u00d6\u0094\u0096\u00c4\u0004=\u00e9\u00fd\u001a\u00b5\u00e1\u0082=;\u0083\u00a7\u00f0JQ\u00a6\u00c7r#\u0091^qsQ^\u00b6\u001fd\u00e9,\u00c1\u00c0*%\u00ff\u0010\u00d9\u00d5x\u00f0\u00ed\u0080&\u008b\u00e8x\u00c9\u0015\u00de\u0016\u00ef".length();
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
                    var6_5 = "\u00ae{\u009f\u0080EA\u0097h\u00d8L\u00cd\u0010\u00f7\u0012/u";
                    var7_6 = "\u00ae{\u009f\u0080EA\u0097h\u00d8L\u00cd\u0010\u00f7\u0012/u".length();
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
        _8w_0.f = var8_3;
        _8w_0.g = new Integer[16];
        _8w_0.cfr_renamed_1 = (int)_8w_0.b("k", (int)30485, (long)(var0 ^ 1237252309188916423L));
    }

    /*
     * Unable to fully structure code
     */
    public boolean boolean_9(Object[] var1_1) {
        block20: {
            block17: {
                block19: {
                    block18: {
                        block16: {
                            var2_2 = (Double)var1_1[0];
                            var4_3 = (Double)var1_1[1];
                            var6_4 = (Long)var1_1[2];
                            var8_5 = (var6_4 = _8w_0.a ^ var6_4) ^ 133267571206694L;
                            var10_6 = _8w_0.cfr_renamed_5();
                            try {
                                try {
                                    cfr_temp_0 = var2_2 - (double)_8w_0.d("e", (Object)this, (long)-8758399079644473195L, (long)var6_4);
                                    v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                    if (!var10_6) break block16;
                                    if (v0 <= 0) break block17;
                                }
                                catch (MatchException v1) {
                                    throw _8w_0.b(v1);
                                }
                                cfr_temp_1 = var2_2 - (double)(_8w_0.d("e", (Object)this, (long)-8758399079644473195L, (long)var6_4) + _8w_0.d("e", (Object)this, (long)-8755685014441467045L, (long)var6_4));
                                v0 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                            }
                            catch (MatchException v2) {
                                throw _8w_0.b(v2);
                            }
                        }
                        try {
                            try {
                                v3 = var10_6;
                                if (var6_4 > 0L) {
                                    if (!v3) break block18;
                                    if (v0 >= 0) break block17;
                                }
                                ** GOTO lbl42
                            }
                            catch (MatchException v4) {
                                throw _8w_0.b(v4);
                            }
                            cfr_temp_2 = var4_3 - (double)_8w_0.d("e", (Object)this, (long)-8755303181345091884L, (long)var6_4);
                            v0 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                        }
                        catch (MatchException v5) {
                            throw _8w_0.b(v5);
                        }
                    }
                    try {
                        try {
                            v3 = var10_6;
lbl42:
                            // 2 sources

                            if (var6_4 > 0L) {
                                if (!v3) break block19;
                                if (v0 <= 0) break block17;
                            }
                            ** GOTO lbl60
                        }
                        catch (MatchException v6) {
                            throw _8w_0.b(v6);
                        }
                        v7 = new Object[1];
                        v7[0] = var8_5;
                        cfr_temp_3 = var4_3 - (double)(_8w_0.d("e", (Object)this, (long)-8755303181345091884L, (long)var6_4) + _8w_0.d("\u00d3", (Object)this, (Object)v7, (long)-8761994637516913777L, (long)var6_4));
                        v0 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                    }
                    catch (MatchException v8) {
                        throw _8w_0.b(v8);
                    }
                }
                try {
                    v3 = var10_6;
lbl60:
                    // 2 sources

                    if (!v3) break block20;
                    if (v0 >= 0) break block17;
                }
                catch (MatchException v9) {
                    throw _8w_0.b(v9);
                }
                v0 = (double)true;
                break block20;
            }
            v0 = (double)false;
        }
        return (boolean)v0;
    }

    /*
     * Unable to fully structure code
     */
    public void void_9(Object[] var1_1) {
        block43: {
            block41: {
                block42: {
                    block40: {
                        block39: {
                            block38: {
                                block33: {
                                    block37: {
                                        block34: {
                                            block35: {
                                                block36: {
                                                    block31: {
                                                        block32: {
                                                            var2_2 = (_87)var1_1[0];
                                                            var3_3 = (Integer)var1_1[1];
                                                            var6_4 = (Long)var1_1[2];
                                                            var5_5 = (Integer)var1_1[3];
                                                            var4_6 = ((Float)var1_1[4]).floatValue();
                                                            v0 = var6_4;
                                                            var8_7 = v0 ^ 13818038371301L;
                                                            var10_8 = v0 ^ 104453502291998L;
                                                            var12_9 = v0 ^ 108308712224014L;
                                                            v1 = v0 ^ 62014728657555L;
                                                            var14_10 = (int)(v1 >>> 32);
                                                            var15_11 = (int)(v1 << 32 >>> 48);
                                                            var16_12 = (int)(v1 << 48 >>> 48);
                                                            var17_13 = v0 ^ 24997501914123L;
                                                            var19_14 = v0 ^ 125519031156597L;
                                                            var21_15 = v0 ^ 42329354084886L;
                                                            var23_16 = v0 ^ 27999817362935L;
                                                            var25_17 = v0 ^ 118228375401441L;
                                                            var27_18 = v0 ^ 63082803259706L;
                                                            var29_19 = v0 ^ 24621041219382L;
                                                            var31_20 = v0 ^ 13160206676636L;
                                                            var36_21 = _8w_0.cfr_renamed_4();
                                                            v2 = new Object[1];
                                                            v2[0] = var21_15;
                                                            var37_22 = _8w_0.d("\u00d3", (Object)_8w_0.d("x", (long)-5790311982160530321L, (long)var6_4), (Object)v2, (long)-5786271119687807944L, (long)var6_4);
                                                            try {
                                                                try {
                                                                    v3 = var37_22;
                                                                    if (var36_21) break block31;
                                                                    if (v3 == _8w_0.d("e", (Object)this, (long)-5789988049125907771L, (long)var6_4)) break block32;
                                                                }
                                                                catch (MatchException v4) {
                                                                    throw _8w_0.b(v4);
                                                                }
                                                                _8w_0.d("L", (Object)this, (boolean)_8w_0.b("k", (int)19936, (long)(5911423610940653624L ^ var6_4)), (long)-5784024951932525720L, (long)var6_4);
                                                                _8w_0.d("L", (Object)this, (int)var37_22, (long)-5789988049125907771L, (long)var6_4);
                                                            }
                                                            catch (MatchException v5) {
                                                                throw _8w_0.b(v5);
                                                            }
                                                        }
                                                        v3 = _8w_0.d("e", (Object)this, (long)-5784024951932525720L, (long)var6_4);
                                                    }
                                                    try {
                                                        if (var36_21) break block33;
                                                        if (v3 == false) break block34;
                                                    }
                                                    catch (MatchException v6) {
                                                        throw _8w_0.b(v6);
                                                    }
                                                    var38_23 = new _8B((int)_8w_0.b("k", (int)4545, (long)(4822601209649290257L ^ var6_4)), (int)_8w_0.b("k", (int)8499, (long)(3684677066014223598L ^ var6_4)), var23_16, (int)_8w_0.b("k", (int)8324, (long)(6440199475764718936L ^ var6_4)), (int)var37_22);
                                                    try {
                                                        try {
                                                            try {
                                                                v7 = _8w_0.d("e", (Object)this, (long)-5784359047865070541L, (long)var6_4);
                                                                if (var6_4 < 0L || var36_21) break block35;
                                                                if (v7 != null) break block36;
                                                            }
                                                            catch (MatchException v8) {
                                                                throw _8w_0.b(v8);
                                                            }
                                                            v9 = this;
                                                            if (var6_4 <= 0L) break block37;
                                                            _8w_0.d("L", (Object)v9, (_8B)new _8B((int)_8w_0.b("k", (int)8499, (long)(3684677066014223598L ^ var6_4)), (int)_8w_0.b("k", (int)8499, (long)(3684677066014223598L ^ var6_4)), var23_16, (int)_8w_0.b("k", (int)17933, (long)(3520364253517351894L ^ var6_4)), 0), (long)-5784359047865070541L, (long)var6_4);
                                                            if (!var36_21) break block34;
                                                        }
                                                        catch (MatchException v10) {
                                                            throw _8w_0.b(v10);
                                                        }
                                                        _4w.cfr_renamed_8(new String[3]);
                                                    }
                                                    catch (MatchException v11) {
                                                        throw _8w_0.b(v11);
                                                    }
                                                }
                                                v12 = new Object[4];
                                                v12[3] = _8w_0.d("e", (Object)this, (long)-5784359047865070541L, (long)var6_4);
                                                v12[2] = var38_23;
                                                v12[1] = Float.valueOf(0.05f);
                                                v12[0] = var10_8;
                                                _8w_0.d("L", (Object)this, (_8B)_8w_0.d("\u00f3", (Object)v12, (long)-5784051452161361843L, (long)var6_4), (long)-5784359047865070541L, (long)var6_4);
                                                v7 = _8w_0.d("e", (Object)this, (long)-5784359047865070541L, (long)var6_4);
                                            }
                                            try {
                                                try {
                                                    v13 = new Object[1];
                                                    v13[0] = var29_19;
                                                    v3 = _8w_0.d("\u00f3", (int)(_8w_0.d("\u00d3", (Object)v7, (Object)v13, (long)-5783731031406230877L, (long)var6_4) - var37_22), (long)-5786703351231443155L, (long)var6_4);
                                                    v14 = var36_21;
                                                    if (var6_4 >= 0L) {
                                                        if (v14) break block33;
                                                        if (v3 >= 2) break block34;
                                                    }
                                                    ** GOTO lbl119
                                                }
                                                catch (MatchException v15) {
                                                    throw _8w_0.b(v15);
                                                }
                                                _8w_0.d("L", (Object)this, (_8B)var38_23, (long)-5784359047865070541L, (long)var6_4);
                                                _8w_0.d("L", (Object)this, (boolean)_8w_0.b("k", (int)9654, (long)(3521977991412803681L ^ var6_4)), (long)-5784024951932525720L, (long)var6_4);
                                            }
                                            catch (MatchException v16) {
                                                throw _8w_0.b(v16);
                                            }
                                        }
                                        v9 = this;
                                    }
                                    v17 = new Object[3];
                                    v17[2] = (double)var5_5;
                                    v17[1] = var17_13;
                                    v17[0] = (double)var3_3;
                                    v3 = _8w_0.d("\u00d3", (Object)v9, (Object)v17, (long)-5783180444931605562L, (long)var6_4);
                                }
                                try {
                                    try {
                                        if (var6_4 <= 0L) break block38;
                                        v14 = var36_21;
lbl119:
                                        // 2 sources

                                        if (v14) break block38;
                                        if (v3 == false) break block39;
                                    }
                                    catch (MatchException v18) {
                                        throw _8w_0.b(v18);
                                    }
                                    v3 = _8w_0.d("e", (Object)this, (long)-5782624529478182761L, (long)var6_4);
                                }
                                catch (MatchException v19) {
                                    throw _8w_0.b(v19);
                                }
                            }
                            try {
                                if (v3 != false) break block39;
                                v20 = 1.0f;
                                break block40;
                            }
                            catch (MatchException v21) {
                                throw _8w_0.b(v21);
                            }
                        }
                        v20 = 0.0f;
                    }
                    var38_24 = v20;
                    v22 = new Object[4];
                    v22[3] = (double)var38_24;
                    v22[2] = (double)_8w_0.d("e", (Object)this, (long)-5790447479551932065L, (long)var6_4);
                    v22[1] = Float.valueOf(var4_6 * 0.1f);
                    v22[0] = var31_20;
                    _8w_0.d("L", (Object)this, (float)((float)_8w_0.d("\u00f3", (Object)v22, (long)-5784653237078898917L, (long)var6_4)), (long)-5790447479551932065L, (long)var6_4);
                    v23 = new Object[1];
                    v23[0] = var29_19;
                    var33_25 = _8w_0.d("e", (Object)this, (long)-5790447479551932065L, (long)var6_4);
                    var34_26 = new _8B((int)_8w_0.b("k", (int)24314, (long)(2397389132854858528L ^ var6_4)), (int)_8w_0.b("k", (int)18638, (long)(2048604435074581789L ^ var6_4)), var23_16, (int)_8w_0.b("k", (int)18638, (long)(2048604435074581789L ^ var6_4)), (int)_8w_0.b("k", (int)8971, (long)(6484670330269429465L ^ var6_4)));
                    var35_27 = new _8B((int)_8w_0.b("k", (int)8499, (long)(3684677066014223598L ^ var6_4)), (int)_8w_0.b("k", (int)8499, (long)(3684677066014223598L ^ var6_4)), var23_16, (int)_8w_0.b("k", (int)17933, (long)(3520364253517351894L ^ var6_4)), (int)_8w_0.d("\u00d3", (Object)_8w_0.d("e", (Object)this, (long)-5784359047865070541L, (long)var6_4), (Object)v23, (long)-5783731031406230877L, (long)var6_4));
                    v24 = new Object[4];
                    v24[3] = Float.valueOf((float)var33_25);
                    v24[2] = var34_26;
                    v24[1] = var35_27;
                    v24[0] = var19_14;
                    var39_28 = _8w_0.d("\u00f3", (Object)v24, (long)-5784690462483491160L, (long)var6_4);
                    try {
                        v25 = _8w_0.d("e", (Object)this, (long)-5784482039599655840L, (long)var6_4) != false ? 0.0f : 6.0f;
                    }
                    catch (MatchException v26) {
                        throw _8w_0.b(v26);
                    }
                    var40_29 = v25;
                    try {
                        v27 = _8w_0.d("e", (Object)this, (long)-5784482039599655840L, (long)var6_4) != false ? 0.0f : 6.0f;
                    }
                    catch (MatchException v28) {
                        throw _8w_0.b(v28);
                    }
                    var41_30 = v27;
                    try {
                        try {
                            v29 = new Object[1];
                            v29[0] = var8_7;
                            v30 = new Object[10];
                            v30[9] = (double)var41_30;
                            v30[8] = (double)var40_29;
                            v30[7] = 6.0;
                            v30[6] = 6.0;
                            v30[5] = var25_17;
                            v30[4] = (double)(_8w_0.d("e", (Object)this, (long)-5783290968422930665L, (long)var6_4) + _8w_0.d("\u00d3", (Object)this, (Object)v29, (long)-5790413158118823348L, (long)var6_4));
                            v30[3] = (double)(_8w_0.d("e", (Object)this, (long)-5786949782151368362L, (long)var6_4) + _8w_0.d("e", (Object)this, (long)-5782908361763173736L, (long)var6_4));
                            v30[2] = (double)_8w_0.d("e", (Object)this, (long)-5783290968422930665L, (long)var6_4);
                            v30[1] = (double)_8w_0.d("e", (Object)this, (long)-5786949782151368362L, (long)var6_4);
                            v30[0] = var39_28;
                            _8w_0.d("\u00d3", (Object)var2_2, (Object)v30, (long)-5789725281851500270L, (long)var6_4);
                            v31 = this;
                            v32 = new Object[7];
                            v32[6] = Float.valueOf(var4_6);
                            v32[5] = var5_5;
                            v32[4] = (int)((short)var16_12);
                            v32[3] = var15_11;
                            v32[2] = var3_3;
                            v32[1] = var2_2;
                            v33 = v32;
                            v32[0] = var14_10;
                            v34 = -5789590628506005768L;
                            v35 = var6_4;
                            if (var6_4 < 0L) break block41;
                            _8w_0.d("\u00d3", (Object)v31, (Object)v33, (long)v34, (long)v35);
                            v31 = this;
                            if (var36_21) break block42;
                            if (_8w_0.d("e", (Object)v31, (long)-5784482039599655840L, (long)var6_4) == false) break block43;
                        }
                        catch (MatchException v36) {
                            throw _8w_0.b(v36);
                        }
                        v37 = new Object[2];
                        v37[1] = var27_18;
                        v37[0] = Float.valueOf(var4_6);
                        _8w_0.d("\u00d3", (Object)this, (Object)v37, (long)-5789823528373749527L, (long)var6_4);
                        v31 = this;
                    }
                    catch (MatchException v38) {
                        throw _8w_0.b(v38);
                    }
                }
                v39 = new Object[5];
                v39[4] = var12_9;
                v39[3] = Float.valueOf(var4_6);
                v39[2] = var5_5;
                v39[1] = var3_3;
                v33 = v39;
                v39[0] = var2_2;
                v34 = -5789786934781277551L;
                v35 = var6_4;
            }
            _8w_0.d("\u00d3", (Object)v31, (Object)v33, (long)v34, (long)v35);
        }
    }

    private static MatchException b(MatchException matchException) {
        return matchException;
    }

    private static int b(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x6275;
        if (g[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = f[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])h.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/8w", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _8w_0.g[n2] = n3;
        }
        return g[n2];
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _8w_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _8w_0.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _8w_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _8w_0.b(classArray[j], string, clazz2);
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
            int n = _8w_0.a(l2, l3);
            object = l[n];
            try {
                if (!(object instanceof String)) break block2;
                _8w_0.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8w" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _8w_0.b(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field c(long l2, long l3) {
        int n = _8w_0.a(l2, l3);
        Object object = l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = _8w_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _8w_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _8w_0.a(clazz3, string2, clazz2)) != null) {
                    _8w_0.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _8w_0.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _8w_0.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _8w_0.b(798880177505923L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _8w_0.a(l2, l3);
        Object object = l[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = m[n];
                int n3 = string2.indexOf(8);
                clazz3 = _8w_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _8w_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _8w_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _8w_0.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _8w_0.b(798880177505923L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _8w_0.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _8w_0.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _8w_0.b(798880177505923L, 0L);
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

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8w" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void a() {
        Object[] objectArray = l;
        l[0] = "1 w\u00169\",5uW<~a1";
        objectArray[1] = Integer.TYPE;
        _8w_0.m[1] = "java/lang/Integer";
        objectArray[2] = ">\bRq\u0007]#\u001dP0\u0002\u0001b\u001a";
        objectArray[3] = "a\u001aBi6&\u0014:If'iu4Bm#3\u0001";
        objectArray[4] = "\u0019g&PS/\u0004r$\u0011VsDG";
        objectArray[5] = "b7M<w \u0017\u0017F3fov\u0019M8b5\u0002";
        objectArray[6] = Boolean.TYPE;
        _8w_0.m[6] = "java/lang/Boolean";
        objectArray[7] = "&>M5tB86Wz\u0016^?+";
        objectArray[8] = "hD8\u0002d\rvL\"M\u0003\fgW/\u0017%\n";
        objectArray[9] = Double.TYPE;
        _8w_0.m[9] = "java/lang/Double";
        objectArray[10] = "\u0013\u0007\u001ck\u0015Ef'\u0017d\u0004\n\u0007)\u001co\u0000Ps";
        objectArray[11] = "#R6#*\u0016(]'lK\u0018#V#6";
        objectArray[12] = "\u0016\u0019\u0005L0D\u000b\f\u0007\r5\u0018D8";
        objectArray[13] = "fH&X2\u000e\u0013h-W#Arf&\\'\u001b\u0006";
        objectArray[14] = "&-B\u0011&t;8@P#(v\u0019";
        objectArray[15] = ")O4J\fP\\o?E\u001d\u001f=a4N\u0019EI";
        objectArray[16] = "$FQ\u001bS\u00069SSZVZv\u0016";
        objectArray[17] = "\u0016iK+\n\u001a\u0016i\\w\u0006\u0015\f\"\\i\u0006\u0000\u000bS\u000e4^CA";
        objectArray[18] = "nq\bfm\u0010sd\n'hL3Y";
        objectArray[19] = "\u0001CV\u0014\\Jtc]\u001bM\u0005\u0015mV\u0010I_a";
        objectArray[20] = "+{an=P^[ja,\u001f?Uaj(EK";
        objectArray[21] = Void.TYPE;
        _8w_0.m[21] = "java/lang/Void";
        objectArray[22] = "A\u001bs\u0000C*4;x\u000fReU5s\u0004V?!";
        objectArray[23] = "Nf\u00068x\u0003;F\r7iLZH\u0006<m\u0016.";
        objectArray[24] = Float.TYPE;
        _8w_0.m[24] = "java/lang/Float";
        objectArray[25] = "MK^\u0005,v8kU\n=9Ye^\u00019c-";
        objectArray[26] = "5Qd\u000eL\u0001(DfOI]i\u0003";
        objectArray[27] = "a\u0000BK5u\u0014 ID$:u.BO `\u0001";
        objectArray[28] = "\u0012Nt#E1\u000f[vb@mOb";
        objectArray[29] = "\u0003P\u000e\u001aM7vp\u0005\u0015\\x\u0017~\u000e\u001eX\"c";
        objectArray[30] = "3cVP\u00000.vT\u0011\u0005loD";
        objectArray[31] = "S\u0001X\u0006\bsN\u0014ZG\r/\u000eV";
        objectArray[32] = "7BV=\u0012@Bb]2\u0003\u000f#lV9\u0007UW";
        objectArray[33] = "BX3i\u000fPIW\"&l]\\Q";
        objectArray[34] = "\u001c}O\u007fp7i]Dpax\bSO{e\"|";
        objectArray[35] = "<0\u001f2x.I\u0010\u0014=ia(\u001e\u001f6m;\\";
        objectArray[36] = "e,h'yb\u0010\fc(h-q\u0002h#lw\u0005";
        objectArray[37] = "=<cPM\u0002H\u001ch_\\M)\u0012cTX\u0017]";
        objectArray[38] = "#&`l\u007fxV\u0006kcn77\b`hjmC";
        objectArray[39] = "#U:g\u0013HVu1h\u0002\u00077{:c\u0006]C";
        objectArray[40] = "]KE+F7(kN$WxIeE/S\"=";
        objectArray[41] = "\u0015FL\u001aL^`fG\u0015]\u0011\u0001hL\u001eYKu";
        objectArray[42] = "G$ci\u0007f2\u0004hf\u0016)S\ncm\u0012s'";
        objectArray[43] = "!m|\u0018\u0007z!mkD\u000bu;&kZ\u000b`<W9\u0006^\"";
        objectArray[44] = "\u0018)3\u001c\u007fAm\t8\u0013n\u000e\f\u00073\u0018jTx";
        objectArray[45] = "CmV(;76M]'*xWCV,.\"#";
        objectArray[46] = "\u007f\u0014\u0015el\u0001\n4\u001ej}Nk:\u0015ay\u0014\u001f";
        objectArray[47] = "5#_\u0000]$5#H\\Q+/hHBQ>(\u0019\u0018\u001f\u0000";
        objectArray[48] = "\u007f`\u0007@HMbu\u0005\u0001M\u0011)";
        objectArray[49] = "\u001c\u0018jp*u@\u000en+J'%\u0012wyt,G_m~";
        objectArray[50] = "\n'\u0007&K\nV1\u0003}+S3\"\ny[\u0003\tb\u0001$TcC$\u000f}\u001b\u0001\u000e>\bC";
        objectArray[51] = "\u001b\u00051k\u0007 G\u001350gu\"\u000f,bYy@B6e";
        objectArray[52] = "g\f^^y[;\u001aZ\u0005\u0019\b\"vUJd\be\u000bTR`X";
        objectArray[53] = "Hy(Rc\u0004\u0014o,\t\u0003Vq|%\rs\rK<.P|m\u0001z \t3\u000fL`'7";
        objectArray[54] = "()Y\u0002j\u007fz$T\u0003\u0000#B#\u001dB|\u007f :EDx";
        objectArray[55] = "v&\u0011e6K&dVx\u0007\u0010%hU\u00018\bvwIc8\u00136')";
        objectArray[56] = "](\u001c\u0012[#\u0001>\u0018I;sd-\u0011MK*^m\u001a\u0010DJ\t1@K^7\r>\u0000\u0012;";
        objectArray[57] = "\u0019=!x#4[:$~\u001f\u001cG)Kre1\u0013{$0b4\u0015";
        objectArray[58] = "\u000e}D=\u0001\u000e\u0003)}4`M[+\rlZ\rPv\u0002\f\\QV}\u001fw\u0010\u000bKl}";
        objectArray[59] = "o\ne@*\f3\u001ca\u001bJ\\kp~Lp\u00156J>G-\u001aV\u001db\u001dv\u0000+\u0019m]/e";
        objectArray[60] = "G(t%-\u0007J|M(\b;G')x.@\u000b}4i";
        objectArray[61] = "\\K@JrM\u0000]D\u0011\u0012\u001e?1[F(T\u0005\u000b\u001bMu[e\\G\u0017.A\u0018XHWw$";
        objectArray[62] = "\u00188\f(!VD.\bsA\u0005!=\u0001w1_\u001b}\n*>?L!Pq$BH.\u0010(A";
        objectArray[63] = "\u0014UL=\u0000a\u0010VC/=4\u0016nV%\u0007{\u0015T\u0016.Ztu\u0003Jt\u0001n\b\u0007E4X\u000b";
        objectArray[64] = "\u0012`r,vr\u0011<!\"\u0006-\u0002|/tj\u001fS=w-\u00068\u0016lq#du\fkO";
        objectArray[65] = "(\u000e\u0002M%~t\u0018\u0006\u0016E.\u0011H\u0005L)uj\u0004_Q8";
        objectArray[66] = "Py(\fo\u0005\fo,W\u000fV\u000f\u0003'\nc\fX}-\u0016u\u001d";
        objectArray[67] = "*EnHt\u000evSj\u0013\u0014]V?iQdYp@qC}\u0001";
        objectArray[68] = "Q\u000e@UB8\\ZyU#{\u0004X\t\u0004\u0019;\u000f\u0005\u0006dNgU^\u001c\u0019Jh\u0015\u0007y";
        objectArray[69] = "x[&%/>u\u000f\u001f/N}-\rott=&P`\u0014#a|\u000bzi'n<R\u001f";
        objectArray[70] = "\u000eAri\" \bZ%#MelZ*\"=<V\u001a!\u007f2\\\u000fY3&.#\u0017K*~M";
        objectArray[71] = ",[]k\"\u001b>\u000eKrB\u001aE\u0015X62C\u007fUSk=#{\u0003IoyB%\u0017_vB";
        objectArray[72] = "?\b l\u0005tc\u001e$7e\"\u0006N'm\t\u007f}\u0002}p\u0018";
        objectArray[73] = "\"}\"X\nw\"o3\u00131}.v(u\r)x#P\u001cXn*(1BLx3\u0013";
        objectArray[74] = "\u00033Q\u0007S:Q>\\\u00069j4\\\u0015QU$\fc\u001e\u0000\u0007f";
        objectArray[75] = "i0+[\u00136dd\u0012Rru<fb\nH57;mj\u001fim`w\u0017\u001bf-9\u0012";
        objectArray[76] = "\u001b.\tpcP\u0016z0p\u0002\u001c^.\u000eq`QD)";
        objectArray[77] = "M>SK PM,B\u0000\u001bTK,AVwf\u0019l\u001b\r&1V)M\u000f+S\u001b3J1";
        objectArray[78] = "3\u0011M3]\u0012>Et8|.p\u0014Nr\\\u00140\u001f\u0013}<ClEHgAGc\u0005\u0011\u0002";
        objectArray[79] = "F\u001aV[{%@\u0001\u0001\u0011\u0014g$\u0001\u000e\u0010d9\u001eA\u0005MkYG\u0002\u0017\u0014w&_\u0010\u000eL\u0014";
        objectArray[80] = ",10Z&Ep'4\u0001F\u0011\u00154=\u00056L/t6X9,x(l\u0003#Q|',ZF";
        objectArray[81] = "'>i7\f\u0012#=f%1AFze|A\u0018|:n!Nx+f4zT\u0005/it#1";
        objectArray[82] = "&\u0019bP\u001c@z\u000ff\u000b|\u0019\u001f\u0013\u007fYB\u0019}^e^";
        objectArray[83] = "*B9Djl.A6VW7uy#\\mv+CcW0yK\u0014?\rkc6\u00100M2\u0006";
        objectArray[84] = "e[GyW\u001b}I^!4\\\u0006X^}D\u0004<\u0018U Kdv^[y\u0004\u0006;D\\G";
        objectArray[85] = "Ki\u0007\tbkAu\u0011\u0018S% u\u0002S#u\u001a5\t\u000e,\u0015\u001ci\u000f\u00051nP3\u0012\u0014S";
        objectArray[86] = "i;\u000f\u0018I\u0018do6\u0019(T,;\b\u0019J\u00196<";
        objectArray[87] = "D\u0015\u0014%5iODFgPg\u007f\u0001\u0011a 6EA\u001a</VC\u001d\u001c72-\u000fG\u0001&P";
        objectArray[88] = "\u001c1\fm-\"M'\u001c5A)\\,\u0014d=/ZAP3y,\u0011|\u0000q>1 ";
        objectArray[89] = "9\u001e\u0007=a\u0014e\b\u0003f\u0001C\u0000\u0014\u001a4?MbY\u00003";
        objectArray[90] = "$J=\u001eh\u0003)\u001e\u0004\u0016\t\u0001q^g\u0014h_eH~";
        objectArray[91] = "e\u0004?\u0017:C9\u0012;LZ\u00103~g\u0011>F>\u0005+K#W";
        objectArray[92] = "\u000b\u0018pcv\u0004W\u000et8\u0016Q2\u001d}<f\r\b]vaim\u000e\u0001pjt\u0016B[m{\u0016";
        objectArray[93] = "\u00019?X\u0016k\fm\u0006Uw(Tov\tMh_2yi\u001a4\u0005ic\u0014\u001e;E0\u0006";
        objectArray[94] = "G\u0000F.\u001a\u0007\u0017B\u00013+Z\u0010E8'[Fy\u0002\u001d.GX\u0002NG3V:";
        objectArray[95] = "2\u000b\u007f\nJhn\u001d{Q*;4qk\u0016F?;\u0013&\fA";
        objectArray[96] = "L+Dm4MA\u007f}e\u0012q\u000f.G,5KO%\u001a#U\u001c\u0013\u007fA9(\u0018\u001c?\u0018\\";
        objectArray[97] = "t:1\u0011\u0016\u0001i:d\u001c)\u0005x,ZPP\u0000,g8\u001dJ\u0007\u0012'#L\u0017\\pj9K)";
        objectArray[98] = "\u000epm3\u0001cRfiha07zp:_:U7j=";
        objectArray[99] = "q\u001atvsCg\u0018v/\u0010Tc\u0002d-|f4D:z+1s\u001e9u`\u000bpBj{\u0010";
        objectArray[100] = "\u0012\u000e0ZK\u000bN\u00184\u0001+_+H$]K\u000eA\u00192M\u0013";
        objectArray[101] = "&=\u0015R'kz+\u0011\tG:\u001f7\b[y2}z\u0012\\";
        objectArray[102] = "\u0010YUyH\u0003LOQ\"(PI#AeDT\u0019A\f\u007fC";
        objectArray[103] = "6\\4\u001evK6N%UMA:W>3q\u0015l\u0003FZ$R>\t'\u00040D'2";
        objectArray[104] = "U6$Tq\tLn\"P\u0011V0r0\u0012a\u000b\n2;Onk@t5\u0016!\t\rn2(";
        Object[] objectArray2 = objectArray;
        objectArray[105] = "n\u0010=6gKs\b=6\u0019\bEys<i\r}\u000be>kT";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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

    private static int a(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (m[n3] != null) {
            return n3;
        }
        Object object = l[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 52;
            case 1 -> 14;
            case 2 -> 39;
            case 3 -> 33;
            case 4 -> 60;
            case 5 -> 59;
            case 6 -> 55;
            case 7 -> 15;
            case 8 -> 44;
            case 9 -> 10;
            case 10 -> 46;
            case 11 -> 30;
            case 12 -> 49;
            case 13 -> 31;
            case 14 -> 50;
            case 15 -> 5;
            case 16 -> 22;
            case 17 -> 42;
            case 18 -> 20;
            case 19 -> 51;
            case 20 -> 57;
            case 21 -> 61;
            case 22 -> 36;
            case 23 -> 32;
            case 24 -> 21;
            case 25 -> 25;
            case 26 -> 3;
            case 27 -> 35;
            case 28 -> 0;
            case 29 -> 4;
            case 30 -> 13;
            case 31 -> 54;
            case 32 -> 6;
            case 33 -> 45;
            case 34 -> 12;
            case 35 -> 47;
            case 36 -> 41;
            case 37 -> 27;
            case 38 -> 17;
            case 39 -> 63;
            case 40 -> 11;
            case 41 -> 16;
            case 42 -> 1;
            case 43 -> 2;
            case 44 -> 53;
            case 45 -> 23;
            case 46 -> 62;
            case 47 -> 29;
            case 48 -> 38;
            case 49 -> 37;
            case 50 -> 19;
            case 51 -> 48;
            case 52 -> 26;
            case 53 -> 9;
            case 54 -> 40;
            case 55 -> 28;
            case 56 -> 56;
            case 57 -> 58;
            case 58 -> 7;
            case 59 -> 34;
            case 60 -> 24;
            case 61 -> 43;
            case 62 -> 8;
            default -> 18;
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
        _8w_0.m[n3] = new String(cArray);
        return n3;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _8w_0.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'e' || c == 'L' || c == 'x' || c == 'q') {
                field = _8w_0.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'e' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'L' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'x' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _8w_0.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public int int_0(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = a ^ l2) ^ 0x3E28D453F117L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        return (int)_8w_0.d("\u00d3", (Object)this, (Object)objectArray2, -7109385763145164610L, (long)l2);
    }

    public void void_0(Object[] objectArray) {
        block13: {
            double d;
            float f;
            _8w_0 w_0;
            float f2;
            double d2;
            double d3;
            long l2;
            long l3;
            double d4;
            block19: {
                CallSite callSite;
                block17: {
                    block18: {
                        double d5;
                        float f3;
                        _8w_0 w_02;
                        boolean bl;
                        long l4;
                        float f4;
                        double d6;
                        block16: {
                            CallSite callSite2;
                            block14: {
                                block15: {
                                    block12: {
                                        d6 = (Double)objectArray[0];
                                        d4 = (Double)objectArray[1];
                                        f4 = ((Float)objectArray[2]).floatValue();
                                        l3 = (Long)objectArray[3];
                                        long l5 = l3 = a ^ l3;
                                        l4 = l5 ^ 0x612E1B66B29L;
                                        l2 = l5 ^ 0x1B56D7FF15BEL;
                                        _8w_0.d("L", (Object)this, (int)_8w_0.d("e", (Object)this, 617628889316519681L, (long)l3), 617713860087469684L, (long)l3);
                                        boolean bl2 = _8w_0.cfr_renamed_5();
                                        _8w_0.d("L", (Object)this, (int)_8w_0.d("e", (Object)this, 620748563010247045L, (long)l3), 621372708527243317L, (long)l3);
                                        bl = bl2;
                                        try {
                                            try {
                                                w_02 = this;
                                                if (!bl) break block12;
                                                if (_8w_0.d("e", (Object)w_02, 620912968106819509L, (long)l3) == false) break block13;
                                            }
                                            catch (MatchException matchException) {
                                                throw _8w_0.b(matchException);
                                            }
                                            w_02 = this;
                                        }
                                        catch (MatchException matchException) {
                                            throw _8w_0.b(matchException);
                                        }
                                    }
                                    try {
                                        try {
                                            f3 = 0.3f * f4;
                                            Object[] objectArray2 = new Object[3];
                                            objectArray2[2] = d4;
                                            objectArray2[1] = l4;
                                            objectArray2[0] = d6;
                                            callSite2 = _8w_0.d("\u00d3", (Object)this, (Object)objectArray2, 620393562291510500L, (long)l3);
                                            if (!bl) break block14;
                                            if (callSite2 == false) break block15;
                                        }
                                        catch (MatchException matchException) {
                                            throw _8w_0.b(matchException);
                                        }
                                        d5 = (double)_8w_0.d("e", (Object)this, 617628889316519681L, (long)l3);
                                        break block16;
                                    }
                                    catch (MatchException matchException) {
                                        throw _8w_0.b(matchException);
                                    }
                                }
                                callSite2 = _8w_0.d("e", (Object)this, 617713860087469684L, (long)l3);
                            }
                            d5 = (double)callSite2;
                        }
                        d3 = d6 - (double)_8w_0.d("e", (Object)this, 614583668708074657L, (long)l3);
                        d2 = d5;
                        f2 = f3;
                        try {
                            try {
                                Object[] objectArray3 = new Object[4];
                                objectArray3[3] = d3;
                                objectArray3[2] = d2;
                                objectArray3[1] = Float.valueOf(f2);
                                objectArray3[0] = l2;
                                _8w_0.d("L", (Object)w_02, (int)((int)_8w_0.d("\u00f3", (Object)objectArray3, 620045572301643833L, (long)l3)), 617628889316519681L, (long)l3);
                                w_0 = this;
                                f = 0.3f * f4;
                                Object[] objectArray4 = new Object[3];
                                objectArray4[2] = d4;
                                objectArray4[1] = l4;
                                objectArray4[0] = d6;
                                callSite = _8w_0.d("\u00d3", (Object)this, (Object)objectArray4, 620393562291510500L, (long)l3);
                                if (!bl) break block17;
                                if (callSite == false) break block18;
                            }
                            catch (MatchException matchException) {
                                throw _8w_0.b(matchException);
                            }
                            d = (double)_8w_0.d("e", (Object)this, 620748563010247045L, (long)l3);
                            break block19;
                        }
                        catch (MatchException matchException) {
                            throw _8w_0.b(matchException);
                        }
                    }
                    callSite = _8w_0.d("e", (Object)this, 621372708527243317L, (long)l3);
                }
                d = (double)callSite;
            }
            d3 = d4 - (double)_8w_0.d("e", (Object)this, 618031808028360451L, (long)l3);
            d2 = d;
            f2 = f;
            Object[] objectArray5 = new Object[4];
            objectArray5[3] = d3;
            objectArray5[2] = d2;
            objectArray5[1] = Float.valueOf(f2);
            objectArray5[0] = l2;
            _8w_0.d("L", (Object)w_0, (int)((int)_8w_0.d("\u00f3", (Object)objectArray5, 620045572301643833L, (long)l3)), 620748563010247045L, (long)l3);
        }
    }

    public static boolean cfr_renamed_4() {
        return cfr_renamed_90;
    }

    public void cfr_renamed_2(Object[] objectArray) {
        _8w_0 w_0;
        boolean bl;
        long l2;
        long l3;
        class_11909 class_119092;
        long l4;
        block16: {
            block15: {
                CallSite callSite;
                block14: {
                    l4 = (Long)objectArray[0];
                    class_119092 = (class_11909)objectArray[1];
                    long l5 = l4 = a ^ l4;
                    l3 = l5 ^ 0x15B16DAA7651L;
                    l2 = l5 ^ 0x4F972C793AF3L;
                    bl = _8w_0.cfr_renamed_4();
                    try {
                        try {
                            try {
                                callSite = _8w_0.d("\u00d3", (Object)class_119092, -4174731370517671347L, (long)l4);
                                if (bl) break block14;
                                if (callSite != false) break block15;
                            }
                            catch (MatchException matchException) {
                                throw _8w_0.b(matchException);
                            }
                            w_0 = this;
                            if (bl) break block16;
                        }
                        catch (MatchException matchException) {
                            throw _8w_0.b(matchException);
                        }
                        callSite = _8w_0.d("e", (Object)w_0, -4173180508728233667L, (long)l4);
                    }
                    catch (MatchException matchException) {
                        throw _8w_0.b(matchException);
                    }
                }
                try {
                    if (callSite != false) {
                        _8w_0.d("L", (Object)this, (boolean)_8w_0.b("k", 9654, (long)(0x30E08B8277B201CBL ^ l4)), -4173180508728233667L, (long)l4);
                    }
                }
                catch (MatchException matchException) {
                    throw _8w_0.b(matchException);
                }
            }
            w_0 = this;
        }
        CallSite callSite = _8w_0.d("\u00d3", (Object)_8w_0.d("e", (Object)w_0, -4172021344052850068L, (long)l4), -4173382297451576200L, (long)l4);
        while (_8w_0.d("\u00d3", (Object)callSite, -4173534524204992654L, (long)l4) != false) {
            Object object;
            block18: {
                block19: {
                    _4t t;
                    block17: {
                        _4t t2 = (_4t)((Object)_8w_0.d("\u00d3", (Object)callSite, -4175123988629595104L, (long)l4));
                        try {
                            try {
                                t = t2;
                                if (bl) break block17;
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l2;
                                object = _8w_0.d("\u00d3", (Object)t, (Object)objectArray2, -4175502897785727494L, (long)l4);
                                if (l4 <= 0L) break block18;
                                if (object == false) break block19;
                            }
                            catch (MatchException matchException) {
                                throw _8w_0.b(matchException);
                            }
                            t = t2;
                        }
                        catch (MatchException matchException) {
                            throw _8w_0.b(matchException);
                        }
                    }
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l3;
                    objectArray3[0] = class_119092;
                    _8w_0.d("\u00d3", (Object)t, (Object)objectArray3, -4174284387393503082L, (long)l4);
                }
                object = bl;
            }
            if (object == false) continue;
        }
    }

    public abstract _8B dev_krypton_8B_2(Object[] var1);

    public int int_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (int)_8w_0.d("e", (Object)this, -1524800498100423632L, (long)l2);
    }

    protected void void_2(Object[] objectArray) {
        block14: {
            Object object;
            boolean bl;
            long l2;
            long l3;
            long l4;
            long l5;
            float f;
            int n;
            int n2;
            _87 var7_2;
            block12: {
                reference var22_16;
                CallSite callSite;
                reference var20_13;
                CallSite callSite2;
                long l6;
                block13: {
                    var7_2 = (_87)objectArray[0];
                    n2 = (Integer)objectArray[1];
                    n = (Integer)objectArray[2];
                    f = ((Float)objectArray[3]).floatValue();
                    l5 = (Long)objectArray[4];
                    long l7 = l5 = a ^ l5;
                    long l8 = l7 ^ 0x72A5E3D2A354L;
                    l4 = l7 ^ 0x66E438C0519BL;
                    l6 = l7 ^ 0x7BC482129F38L;
                    l3 = l7 ^ 0x2E7357BA33E8L;
                    l2 = l7 ^ 0x22E7BECF843DL;
                    callSite2 = _8w_0.d("e", (Object)this, -3530292272954240537L, (long)l5);
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l8;
                    var20_13 = _8w_0.d("e", (Object)this, -3527196237361363034L, (long)l5) + _8w_0.d("\u00d3", (Object)this, (Object)objectArray2, -3524858502834943235L, (long)l5);
                    bl = _8w_0.cfr_renamed_4();
                    callSite = _8w_0.d("e", (Object)this, -3526453407501112791L, (long)l5);
                    var22_16 = _8w_0.d("\u00d3", (Object)_8w_0.d("\u00d3", (Object)_8w_0.d("x", -3530214343837170267L, (long)l5), -3530672115969744934L, (long)l5), -3528477503559739905L, (long)l5) - var20_13;
                    try {
                        try {
                            if (bl) break block12;
                            if (var22_16 > 0) break block13;
                        }
                        catch (MatchException matchException) {
                            throw _8w_0.b(matchException);
                        }
                        return;
                    }
                    catch (MatchException matchException) {
                        throw _8w_0.b(matchException);
                    }
                }
                Object[] objectArray3 = new Object[5];
                objectArray3[4] = l6;
                objectArray3[3] = (double)var22_16;
                objectArray3[2] = (double)callSite;
                objectArray3[1] = (double)var20_13;
                objectArray3[0] = (double)callSite2;
                _8w_0.d("\u00d3", (Object)var7_2, (Object)objectArray3, -3527265473435650120L, (long)l5);
            }
            CallSite callSite = _8w_0.d("\u00d3", (Object)_8w_0.d("e", (Object)this, -3530433613644244105L, (long)l5), -3526798938915091101L, (long)l5);
            block10: while (_8w_0.d("\u00d3", (Object)callSite, -3526387150110212503L, (long)l5) != false) {
                object = _8w_0.d("\u00d3", (Object)callSite, -3524740442232564421L, (long)l5);
                do {
                    Object object2;
                    block16: {
                        block17: {
                            _4t t;
                            block15: {
                                _4t t2 = (_4t)object;
                                try {
                                    try {
                                        try {
                                            if (bl) break block14;
                                            t = t2;
                                            if (bl) break block15;
                                        }
                                        catch (MatchException matchException) {
                                            throw _8w_0.b(matchException);
                                        }
                                        Object[] objectArray4 = new Object[1];
                                        objectArray4[0] = l3;
                                        object2 = _8w_0.d("\u00d3", (Object)t, (Object)objectArray4, -3524414322650571551L, (long)l5);
                                        if (l5 <= 0L) break block16;
                                        if (object2 == false) break block17;
                                    }
                                    catch (MatchException matchException) {
                                        throw _8w_0.b(matchException);
                                    }
                                    t = t2;
                                }
                                catch (MatchException matchException) {
                                    throw _8w_0.b(matchException);
                                }
                            }
                            Object[] objectArray5 = new Object[5];
                            objectArray5[4] = Float.valueOf(f);
                            objectArray5[3] = l4;
                            objectArray5[2] = n;
                            objectArray5[1] = n2;
                            objectArray5[0] = var7_2;
                            _8w_0.d("\u00d3", (Object)t, (Object)objectArray5, -3528208469632730017L, (long)l5);
                        }
                        object2 = bl;
                    }
                    if (object2 == false) continue block10;
                    object = var7_2;
                } while (l5 < 0L);
            }
            Object[] objectArray6 = new Object[1];
            objectArray6[0] = l2;
            _8w_0.d("\u00d3", (Object)object, (Object)objectArray6, -3527397660261002772L, (long)l5);
        }
    }

    protected abstract void cfr_renamed_409(Object[] var1);

    public abstract int int_3(Object[] var1);

    public void void_3(Object[] objectArray) {
        block6: {
            long l2 = (Long)objectArray[0];
            long l3 = l2 ^ 0x4EFD50ED34DCL;
            _8w_0.d("L", (Object)this, null, 4216084071913756936L, (long)l2);
            boolean bl = _8w_0.cfr_renamed_5();
            _8w_0.d("L", (Object)this, (boolean)_8w_0.b("k", 19204, (long)(0x3506389A65E513E6L ^ l2)), 4215472349277156947L, (long)l2);
            boolean bl2 = bl;
            _8w_0.d("L", (Object)this, (int)_8w_0.b("k", 19041, (long)(0x5E63E3BACF59928FL ^ l2)), 4223966041335822334L, (long)l2);
            CallSite callSite = _8w_0.d("\u00d3", (Object)_8w_0.d("e", (Object)this, 4218537313854107389L, (long)l2), 4216612860209281257L, (long)l2);
            block2: while (_8w_0.d("\u00d3", (Object)callSite, 4217024640508120035L, (long)l2) != false) {
                _4t t = (_4t)((Object)_8w_0.d("\u00d3", (Object)callSite, 4224300847588548785L, (long)l2));
                try {
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l3;
                    _8w_0.d("\u00d3", (Object)t, (Object)objectArray2, 4216800609436122096L, (long)l2);
                    do {
                        boolean bl3 = bl2;
                        if (l2 >= 0L) {
                            if (!bl3) break block6;
                            bl3 = bl2;
                        }
                        if (bl3) continue block2;
                    } while (l2 < 0L);
                    break;
                }
                catch (MatchException matchException) {
                    throw _8w_0.b(matchException);
                }
            }
            _8w_0.d("L", (Object)this, (boolean)_8w_0.b("k", 2027, (long)(0xF17231023685F06L ^ l2)), 4216675020628004268L, (long)l2);
        }
    }

    public void void_4(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        long l2 = (Long)objectArray[2];
        double d3 = (Double)objectArray[3];
        double d4 = (Double)objectArray[4];
        long l3 = (l2 = a ^ l2) ^ 0x11B3402D7AF1L;
        _8w_0.d("L", (Object)this, (int)_8w_0.d("e", (Object)this, -716530321790398051L, (long)l2), -716474489025550104L, (long)l2);
        _8w_0.d("L", (Object)this, (int)_8w_0.d("e", (Object)this, -720212262591748327L, (long)l2), -719570525030285655L, (long)l2);
        _8w_0.d("L", (Object)this, (int)((int)((double)_8w_0.d("e", (Object)this, -719570525030285655L, (long)l2) + d4 * 20.0)), -719570525030285655L, (long)l2);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = (int)((double)_8w_0.d("e", (Object)this, -720212262591748327L, (long)l2) + d4 * 20.0);
        objectArray2[0] = l3;
        _8w_0.d("\u00d3", (Object)this, (Object)objectArray2, -719707651200076223L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    public boolean boolean_4(Object[] var1_1) {
        block20: {
            block17: {
                block19: {
                    block18: {
                        block16: {
                            var2_2 = (Double)var1_1[0];
                            var4_3 = (Long)var1_1[1];
                            var6_4 = (Double)var1_1[2];
                            var8_5 = (var4_3 = _8w_0.a ^ var4_3) ^ 7251427007057L;
                            var10_6 = _8w_0.cfr_renamed_4();
                            try {
                                try {
                                    cfr_temp_0 = var2_2 - (double)_8w_0.d("e", (Object)this, (long)8504086770456471778L, (long)var4_3);
                                    v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                    if (var10_6) break block16;
                                    if (v0 <= 0) break block17;
                                }
                                catch (MatchException v1) {
                                    throw _8w_0.b(v1);
                                }
                                cfr_temp_1 = var2_2 - (double)(_8w_0.d("e", (Object)this, (long)8504086770456471778L, (long)var4_3) + _8w_0.d("e", (Object)this, (long)8505876322089145132L, (long)var4_3));
                                v0 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                            }
                            catch (MatchException v2) {
                                throw _8w_0.b(v2);
                            }
                        }
                        try {
                            try {
                                v3 = var10_6;
                                if (var4_3 > 0L) {
                                    if (v3) break block18;
                                    if (v0 >= 0) break block17;
                                }
                                ** GOTO lbl42
                            }
                            catch (MatchException v4) {
                                throw _8w_0.b(v4);
                            }
                            cfr_temp_2 = var6_4 - (double)_8w_0.d("e", (Object)this, (long)8505493784687214243L, (long)var4_3);
                            v0 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                        }
                        catch (MatchException v5) {
                            throw _8w_0.b(v5);
                        }
                    }
                    try {
                        try {
                            v3 = var10_6;
lbl42:
                            // 2 sources

                            if (var4_3 >= 0L) {
                                if (v3) break block19;
                                if (v0 <= 0) break block17;
                            }
                            ** GOTO lbl60
                        }
                        catch (MatchException v6) {
                            throw _8w_0.b(v6);
                        }
                        v7 = new Object[1];
                        v7[0] = var8_5;
                        cfr_temp_3 = var6_4 - (double)(_8w_0.d("e", (Object)this, (long)8505493784687214243L, (long)var4_3) + _8w_0.d("\u00d3", (Object)this, (Object)v7, (long)8507400714915132408L, (long)var4_3));
                        v0 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                    }
                    catch (MatchException v8) {
                        throw _8w_0.b(v8);
                    }
                }
                try {
                    v3 = var10_6;
lbl60:
                    // 2 sources

                    if (v3) break block20;
                    if (v0 >= 0) break block17;
                }
                catch (MatchException v9) {
                    throw _8w_0.b(v9);
                }
                v0 = (double)true;
                break block20;
            }
            v0 = (double)false;
        }
        return (boolean)v0;
    }

    public void void_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        l2 = a ^ l2;
        _8w_0.d("L", (Object)this, (int)n, -7399616750712731561L, (long)l2);
    }

    public int int_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (int)_8w_0.d("e", (Object)this, 7392045903171978163L, (long)l2);
    }

    public void cfr_renamed_9(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        class_11908 class_119082 = (class_11908)objectArray[1];
        long l3 = l2;
        long l4 = l3 ^ 0x6A077D19307EL;
        long l5 = l3 ^ 0xEF69AB69F4BL;
        boolean bl = _8w_0.cfr_renamed_5();
        CallSite callSite = _8w_0.d("\u00d3", (Object)_8w_0.d("e", (Object)this, 7179373120119011284L, (long)l2), 7182515216053264832L, (long)l2);
        while (_8w_0.d("\u00d3", (Object)callSite, 7182362998342750922L, (long)l2) != false) {
            Object object;
            block6: {
                block7: {
                    _4t t;
                    block5: {
                        _4t t2 = (_4t)((Object)_8w_0.d("\u00d3", (Object)callSite, 7185136670877612440L, (long)l2));
                        try {
                            try {
                                t = t2;
                                if (!bl) break block5;
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l5;
                                object = _8w_0.d("\u00d3", (Object)t, (Object)objectArray2, 7184898769313443906L, (long)l2);
                                if (l2 <= 0L) break block6;
                                if (object == false) break block7;
                            }
                            catch (MatchException matchException) {
                                throw _8w_0.b(matchException);
                            }
                            t = t2;
                        }
                        catch (MatchException matchException) {
                            throw _8w_0.b(matchException);
                        }
                    }
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = class_119082;
                    objectArray3[0] = l4;
                    _8w_0.d("\u00d3", (Object)t, (Object)objectArray3, 7179656438427882181L, (long)l2);
                }
                object = bl;
            }
            if (object != false) continue;
        }
    }

    protected abstract int int_8(Object[] var1);

    public static void cfr_renamed_0(boolean bl) {
        cfr_renamed_90 = bl;
    }

    public void void_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        l2 = a ^ l2;
        _8w_0.d("L", (Object)this, (int)n, 2890315672969858959L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_8w_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_8w_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

