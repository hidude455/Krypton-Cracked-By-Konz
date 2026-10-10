/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1923
 *  net.minecraft.class_2596
 *  net.minecraft.class_2676
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._3i_0;
import dev.krypton._4r;
import dev.krypton._6c_0;
import dev.krypton._6p_0;
import dev.krypton._6x_0;
import dev.krypton._8B;
import dev.krypton._8h;
import dev.krypton._95;
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
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1923;
import net.minecraft.class_2596;
import net.minecraft.class_2676;

public class _61
extends _6x_0 {
    private static final int cfr_renamed_7;
    private static final long cfr_renamed_8;
    private static final int cfr_renamed_9;
    private final _9r cfr_renamed_4;
    private final ConcurrentHashMap cfr_renamed_2;
    private final ConcurrentHashMap cfr_renamed_3;
    private final Set cfr_renamed_1;
    private final Set cfr_renamed_0;
    private static final long b;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static final long[] j;
    private static final Integer[] k;
    private static final Map l;
    private static final long[] m;
    private static final Long[] n;
    private static final Map o;
    private static final Object[] r;
    private static final String[] s;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @_3i_0
    public void cfr_renamed_5(_6p_0 p_0) {
        CallSite callSite;
        class_2596 class_25962;
        long l2;
        block12: {
            block13: {
                class_2596 class_25963;
                String string;
                block11: {
                    l2 = b ^ 0x1F095E84A7A8L;
                    string = _8h.cfr_renamed_4();
                    class_25962 = p_0.cfr_renamed_0;
                    try {
                        try {
                            class_25963 = class_25962;
                            if (string != null) break block11;
                            if (!(class_25963 instanceof class_2676)) return;
                        }
                        catch (MatchException matchException) {
                            throw _61.a(matchException);
                        }
                        class_25963 = class_25962;
                    }
                    catch (MatchException matchException) {
                        throw _61.a(matchException);
                    }
                }
                class_2676 class_26762 = (class_2676)class_25963;
                try {
                    if (string != null) {
                        return;
                    }
                }
                catch (MatchException matchException) {
                    throw _61.a(matchException);
                }
                class_25962 = new class_1923((int)_61.f("q", (Object)class_26762, 2720799962469862976L, (long)l2), (int)_61.f("q", (Object)class_26762, 2727209884994781476L, (long)l2));
                try {
                    callSite = _61.f("q", (Object)_61.f("\u00dd", (Object)this, 2721943572967277125L, (long)l2), (Object)class_25962, 2728053671703953975L, (long)l2);
                    if (string != null) break block12;
                    if (callSite == false) break block13;
                    return;
                }
                catch (MatchException matchException) {
                    throw _61.a(matchException);
                }
            }
            callSite = _61.f("q", (Object)((Integer)((Object)_61.f("q", (Object)_61.f("\u00dd", (Object)this, 2727981901108571697L, (long)l2), (Object)class_25962, (Object)_61.f("v", 1, 2721783627968609503L, (long)l2), Integer::sum, 2721418870845589324L, (long)l2))), 2729114934198919436L, (long)l2);
        }
        CallSite callSite2 = callSite;
        try {
            if (callSite2 < 5) return;
            _61.f("q", (Object)_61.f("\u00dd", (Object)this, 2722374988411416480L, (long)l2), (Object)class_25962, (Object)_61.f("v", (long)_61.f("v", 2720186874564614074L, (long)l2), 2720562957487906479L, (long)l2), 2723967045960544503L, (long)l2);
            return;
        }
        catch (MatchException matchException) {
            throw _61.a(matchException);
        }
    }

    @Override
    public native void cfr_renamed_5();

    /*
     * Exception decompiling
     */
    private void cfr_renamed_133(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[DOLOOP]], but top level block is 5[SIMPLE_IF_TAKEN]
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

    public _61(int n, int n2) {
        long l2;
        long l3 = l2 = ((long)n << 32 | (long)n2 << 32 >>> 32) ^ b;
        long l4 = l3 ^ 0x5DD84B27E82BL;
        long l5 = l3 ^ 0xBE0DC646042L;
        long l6 = l3 ^ 0x14204F408F30L;
        super((int)_61.c("w", 31518, (long)(0x6FF5F124FA885E12L ^ l2)), -1, (_4r)((Object)_61.f("\u00fc", -3929079363620010769L, (long)l2)), l5);
        this.cfr_renamed_4 = new _9r((int)_61.c("w", 23235, (long)(0x6EDCACBFEDFFFFCAL ^ l2)), true, l4);
        this.cfr_renamed_2 = new ConcurrentHashMap();
        this.cfr_renamed_3 = new ConcurrentHashMap();
        this.cfr_renamed_1 = _61.f("v", -3927755805842079280L, (long)l2);
        this.cfr_renamed_0 = _61.f("v", -3927755805842079280L, (long)l2);
        Object[] objectArray = new Object[2];
        objectArray[1] = new _95[]{_61.f("\u00dd", (Object)this, -3934533782823642185L, (long)l2)};
        objectArray[0] = l6;
        _61.f("q", (Object)this, (Object)objectArray, -3935016186037079569L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block26: {
            block25: {
                block24: {
                    block23: {
                        block22: {
                            block21: {
                                a.init(_61.class, 57);
                                _61.b = dev.krypton.l.a(7604407676282977331L, -3473474450778500826L, MethodHandles.lookup().lookupClass()).a(278676046866658L);
                                _61.r = new Object[102];
                                _61.s = new String[102];
                                _61.b();
                                _61.f = new HashMap<K, V>(13);
                                var22 = _61.b ^ 39717211646114L;
                                var24_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                                v0 = SecretKeyFactory.getInstance("DES");
                                v1 = new byte[8];
                                v2 = v1;
                                v1[0] = (byte)(var22 >>> 56);
                                for (var25_2 = 1; var25_2 < 8; ++var25_2) {
                                    v2 = v2;
                                    v2[var25_2] = (byte)(var22 << var25_2 * 8 >>> 56);
                                }
                                var24_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                                var31_3 = new String[5];
                                var29_4 = 0;
                                var28_5 = "\n\u00b6f!\u0017\u00a8\u00f9\u0018\u00da\u00aca\u001a\u0091\"-\u008d\u00ae\u00ae\u00b4\u00e9\u00e3V\u00ba\u00bcB\u00cc\u00e6\b\u0081\u000e\u00d8N[\u0011^\u00b9Y\u0015C4\u0010\u00d8o\u00e6\u0095#\u0004q Y\u0099\u00d8\u00fc\u0014\u00ffB\u00b0(\u00f5\u00ff\u00b4\u0081\u00fc/[\u00d2w\u00f3!tf\u00cf\u00bc\u00b0>\u009b\u009e/9\u0090@\u00dcj\u00a2p\u0095\u00d5HU\u00a4\u00cc\u009at\u00ef\u001f\u0092\u0082R";
                                var30_6 = "\n\u00b6f!\u0017\u00a8\u00f9\u0018\u00da\u00aca\u001a\u0091\"-\u008d\u00ae\u00ae\u00b4\u00e9\u00e3V\u00ba\u00bcB\u00cc\u00e6\b\u0081\u000e\u00d8N[\u0011^\u00b9Y\u0015C4\u0010\u00d8o\u00e6\u0095#\u0004q Y\u0099\u00d8\u00fc\u0014\u00ffB\u00b0(\u00f5\u00ff\u00b4\u0081\u00fc/[\u00d2w\u00f3!tf\u00cf\u00bc\u00b0>\u009b\u009e/9\u0090@\u00dcj\u00a2p\u0095\u00d5HU\u00a4\u00cc\u009at\u00ef\u001f\u0092\u0082R".length();
                                var27_7 = 40;
                                var26_8 = -1;
lbl24:
                                // 2 sources

                                while (true) {
                                    v3 = ++var26_8;
                                    v4 = var28_5.substring(v3, v3 + var27_7);
                                    v5 = -1;
                                    break block21;
                                    break;
                                }
lbl29:
                                // 1 sources

                                while (true) {
                                    var31_3[var29_4++] = _61.b(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    var28_5 = "\u00f0\u0098&\u00c4\u00dd8\u00cd\u009aa\u00da\u0084\u00d4\u0001\u00e4\u001d\u000f\u0018`}f\u00a0\u00d1p\u00fa\u00e0\u0005\u00e9\u008c\u00a5\u0002\u008e\u00a4@\u00cc\u00f4\u00aa\u0015\u0015\u0003\u0099\u001c";
                                    var30_6 = "\u00f0\u0098&\u00c4\u00dd8\u00cd\u009aa\u00da\u0084\u00d4\u0001\u00e4\u001d\u000f\u0018`}f\u00a0\u00d1p\u00fa\u00e0\u0005\u00e9\u008c\u00a5\u0002\u008e\u00a4@\u00cc\u00f4\u00aa\u0015\u0015\u0003\u0099\u001c".length();
                                    var27_7 = 16;
                                    var26_8 = -1;
lbl38:
                                    // 2 sources

                                    while (true) {
                                        v6 = ++var26_8;
                                        v4 = var28_5.substring(v6, v6 + var27_7);
                                        v5 = 0;
                                        break block21;
                                        break;
                                    }
                                    break;
                                }
lbl43:
                                // 1 sources

                                while (true) {
                                    var31_3[var29_4++] = _61.b(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    break block22;
                                    break;
                                }
                            }
                            var32_9 = var24_1.doFinal(v4.getBytes("ISO-8859-1"));
                            switch (v5) {
                                default: {
                                    ** continue;
                                }
                                ** case 0:
lbl55:
                                // 1 sources

                                ** continue;
                            }
                        }
                        _61.d = var31_3;
                        _61.e = new String[5];
                        _61.l = new HashMap<K, V>(13);
                        var11_10 = Cipher.getInstance("DES/CBC/NoPadding");
                        v7 = SecretKeyFactory.getInstance("DES");
                        v8 = new byte[8];
                        v9 = v8;
                        v8[0] = (byte)(var22 >>> 56);
                        for (var12_11 = 1; var12_11 < 8; ++var12_11) {
                            v9 = v9;
                            v9[var12_11] = (byte)(var22 << var12_11 * 8 >>> 56);
                        }
                        var11_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                        var17_12 = new long[17];
                        var14_13 = 0;
                        var15_14 = "\u0090 \u00d6\u00f8\u0016\u0012\u00af\u00f5\u00f60\u00c8\u0083}\u00e2\u00c7\u00e7 US\u00bdM\u00a8\u00ab\u0099\u00b1\u00feI\u001c\u00c1N\u00db\u00b4\u0004n\u00dd\u00d5j{X\u00b9\u00c3\u00e4d\u00d2({\u00b7I\u0007h\u00b9\u00f1D\u009d\u00e3\u00efm\u00f3g$\u0094\u00ff\u00db\u0086\u001dv\u00fd\u0015P\u00c0Y\u00eb\u00f1\u007f\u00c3r+\u00b3WQ\u00a4\u0006\u0092\f3\u0098kcDE\u00bf\u0081\u0006}\u0098\u00ea\u00e2o\u00c6\u00b5\u00c8\u00ac\u0013gLn\u001d \\\u0017\u008b\u001c%\u00e5\u0003\u00c6\u00ff\u000b\u00b1\u00b2";
                        var16_15 = "\u0090 \u00d6\u00f8\u0016\u0012\u00af\u00f5\u00f60\u00c8\u0083}\u00e2\u00c7\u00e7 US\u00bdM\u00a8\u00ab\u0099\u00b1\u00feI\u001c\u00c1N\u00db\u00b4\u0004n\u00dd\u00d5j{X\u00b9\u00c3\u00e4d\u00d2({\u00b7I\u0007h\u00b9\u00f1D\u009d\u00e3\u00efm\u00f3g$\u0094\u00ff\u00db\u0086\u001dv\u00fd\u0015P\u00c0Y\u00eb\u00f1\u007f\u00c3r+\u00b3WQ\u00a4\u0006\u0092\f3\u0098kcDE\u00bf\u0081\u0006}\u0098\u00ea\u00e2o\u00c6\u00b5\u00c8\u00ac\u0013gLn\u001d \\\u0017\u008b\u001c%\u00e5\u0003\u00c6\u00ff\u000b\u00b1\u00b2".length();
                        var13_16 = 0;
                        while (true) {
                            var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                            v10 = var17_12;
                            v11 = var14_13++;
                            v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                            v13 = -1;
                            break block23;
                            break;
                        }
lbl82:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            var15_14 = "\u00da\u00f3>\u00e1\u00a6\u001aG\u0010)<\u000b\u00ec\u008e\u00b2O\u00ac";
                            var16_15 = "\u00da\u00f3>\u00e1\u00a6\u001aG\u0010)<\u000b\u00ec\u008e\u00b2O\u00ac".length();
                            var13_16 = 0;
                            while (true) {
                                var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                                v10 = var17_12;
                                v11 = var14_13++;
                                v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                                v13 = 0;
                                break block23;
                                break;
                            }
                            break;
                        }
lbl95:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            break block24;
                            break;
                        }
                    }
                    var19_18 = v12;
                    var21_19 = var11_10.doFinal(new byte[]{(byte)(var19_18 >>> 56), (byte)(var19_18 >>> 48), (byte)(var19_18 >>> 40), (byte)(var19_18 >>> 32), (byte)(var19_18 >>> 24), (byte)(var19_18 >>> 16), (byte)(var19_18 >>> 8), (byte)var19_18});
                    v14 = ((long)var21_19[0] & 255L) << 56 | ((long)var21_19[1] & 255L) << 48 | ((long)var21_19[2] & 255L) << 40 | ((long)var21_19[3] & 255L) << 32 | ((long)var21_19[4] & 255L) << 24 | ((long)var21_19[5] & 255L) << 16 | ((long)var21_19[6] & 255L) << 8 | (long)var21_19[7] & 255L;
                    switch (v13) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl108:
                        // 1 sources

                        ** continue;
                    }
                }
                _61.j = var17_12;
                _61.k = new Integer[17];
                _61.cfr_renamed_9 = (int)_61.c("w", (int)11124, (long)(var22 ^ 3175581847344213448L));
                _61.cfr_renamed_7 = (int)_61.c("w", (int)29092, (long)(var22 ^ 298106147956209418L));
                _61.o = new HashMap<K, V>(13);
                var0_20 = Cipher.getInstance("DES/CBC/NoPadding");
                v15 = SecretKeyFactory.getInstance("DES");
                v16 = new byte[8];
                v17 = v16;
                v16[0] = (byte)(var22 >>> 56);
                for (var1_21 = 1; var1_21 < 8; ++var1_21) {
                    v17 = v17;
                    v17[var1_21] = (byte)(var22 << var1_21 * 8 >>> 56);
                }
                var0_20.init(2, (Key)v15.generateSecret(new DESKeySpec(v17)), new IvParameterSpec(new byte[8]));
                var6_22 = new long[2];
                var3_23 = 0;
                var4_24 = "B\u008a]\u00ffW\u00ccB\u0012h\u00b9/\u0019}$\u00a6\u00b2";
                var5_25 = "B\u008a]\u00ffW\u00ccB\u0012h\u00b9/\u0019}$\u00a6\u00b2".length();
                var2_26 = 0;
                while (true) {
                    break block25;
                    break;
                }
lbl132:
                // 1 sources

                while (true) {
                    var6_22[v18] = ((long)var10_29[0] & 255L) << 56 | ((long)var10_29[1] & 255L) << 48 | ((long)var10_29[2] & 255L) << 40 | ((long)var10_29[3] & 255L) << 32 | ((long)var10_29[4] & 255L) << 24 | ((long)var10_29[5] & 255L) << 16 | ((long)var10_29[6] & 255L) << 8 | (long)var10_29[7] & 255L;
                    if (var2_26 < var5_25) ** continue;
                    break block26;
                    break;
                }
            }
            var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
            v18 = var3_23++;
            var8_28 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
            var10_29 = var0_20.doFinal(new byte[]{(byte)(var8_28 >>> 56), (byte)(var8_28 >>> 48), (byte)(var8_28 >>> 40), (byte)(var8_28 >>> 32), (byte)(var8_28 >>> 24), (byte)(var8_28 >>> 16), (byte)(var8_28 >>> 8), (byte)var8_28});
            ** while (true)
        }
        _61.m = var6_22;
        _61.n = new Long[2];
        _61.cfr_renamed_8 = (long)_61.d("i", (int)11878, (long)(var22 ^ 213470897357543571L));
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (s[n3] != null) {
            return n3;
        }
        Object object = r[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 33;
            case 1 -> 31;
            case 2 -> 43;
            case 3 -> 6;
            case 4 -> 20;
            case 5 -> 18;
            case 6 -> 29;
            case 7 -> 51;
            case 8 -> 28;
            case 9 -> 62;
            case 10 -> 32;
            case 11 -> 14;
            case 12 -> 52;
            case 13 -> 50;
            case 14 -> 46;
            case 15 -> 24;
            case 16 -> 37;
            case 17 -> 58;
            case 18 -> 5;
            case 19 -> 16;
            case 20 -> 17;
            case 21 -> 39;
            case 22 -> 44;
            case 23 -> 61;
            case 24 -> 63;
            case 25 -> 56;
            case 26 -> 0;
            case 27 -> 42;
            case 28 -> 12;
            case 29 -> 25;
            case 30 -> 2;
            case 31 -> 30;
            case 32 -> 19;
            case 33 -> 36;
            case 34 -> 53;
            case 35 -> 10;
            case 36 -> 26;
            case 37 -> 34;
            case 38 -> 9;
            case 39 -> 55;
            case 40 -> 15;
            case 41 -> 49;
            case 42 -> 35;
            case 43 -> 59;
            case 44 -> 27;
            case 45 -> 4;
            case 46 -> 41;
            case 47 -> 11;
            case 48 -> 38;
            case 49 -> 22;
            case 50 -> 7;
            case 51 -> 23;
            case 52 -> 57;
            case 53 -> 40;
            case 54 -> 21;
            case 55 -> 47;
            case 56 -> 8;
            case 57 -> 3;
            case 58 -> 54;
            case 59 -> 60;
            case 60 -> 45;
            case 61 -> 1;
            case 62 -> 48;
            default -> 13;
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
        _61.s[n3] = new String(cArray);
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

    private static void b() {
        Object[] objectArray = r;
        r[0] = "\u00150gVzC\u00150p\nvL\u000f{p\u0014vY\b\n!L$";
        objectArray[1] = Double.TYPE;
        _61.s[1] = "java/lang/Double";
        objectArray[2] = "a_rNL?a_e\u0012@0{\u0014e\f@%|e1T\u0017";
        objectArray[3] = Integer.TYPE;
        _61.s[3] = "java/lang/Integer";
        objectArray[4] = "\u000eUBp7a\u0013@@12=^[";
        objectArray[5] = "G\u0002sG\u0017R2\"xH\u0006\u001dS,sC\u0002G'";
        objectArray[6] = Void.TYPE;
        _61.s[6] = "java/lang/Void";
        objectArray[7] = "N\u0006\"e|\u0018S\u0013 $yD\u001cR";
        objectArray[8] = "WJ)(1E\"j\"' \nCd),$P7";
        objectArray[9] = "fg\u0002 ^Zfg\u0015|RU|,\u0015bR@{]E?\u0003";
        objectArray[10] = "\u001a\u0014)L\\o\u001a\u0014>\u0010P`\u0000_>\u000ePu\u0007.kQ\t";
        objectArray[11] = "+o5\u0005&J+o\"Y*E1$\"G*P6Up\u0012y\u0010";
        objectArray[12] = "iXBv\u0015;wPX9r:fKUcT<";
        objectArray[13] = "9?Fv[B20W9:L9;Sc";
        objectArray[14] = Boolean.TYPE;
        _61.s[14] = "java/lang/Boolean";
        objectArray[15] = "K t\rU:U(nB(*U";
        objectArray[16] = "\n\nB\nWn\u0001\u0005SE4c\u0014\u0003";
        objectArray[17] = "Mn\u007f\u00007HP{}A2\u0014\u001fs";
        objectArray[18] = "\u000bp\u0013J%#~P\u0018E4l\u001f^\u0013N06k";
        objectArray[19] = "l\u001c70T|q\t5qQ 1\u000b";
        objectArray[20] = "Cv[Heb6VPGt-WX[Lpw#";
        objectArray[21] = Long.TYPE;
        _61.s[21] = "java/lang/Long";
        objectArray[22] = "w+\u0000zf>j>\u0002;cb*6";
        objectArray[23] = "a\u0007>\fTgj\b/C)rx\u0012-\u0000";
        objectArray[24] = ".\"fX8\u0004%-w\u0017_\u00060&w\\d";
        objectArray[25] = "\u0004\u001a2P\u0010G\u0004\u001a%\f\u001cH\u001eQ%\u0012\u001c]\u0019 tHJ\u0018";
        objectArray[26] = "'\u0011c_\u0007g9\u0019y\u0010J}#\u0013`L[w#\u0004;}F|.\u0005gLL|98tMA_,\u0000";
        objectArray[27] = "\u0012%\u0002\u001e=\u0012\f-\u0018Qu\u0012\u0016'\u0000\u0016|\tV\u0006\u001d9f\t\u001b0\u001d\u0010}";
        objectArray[28] = "\u0018@\u001cqy8\u0013O\r>\u001b;\u001cF";
        objectArray[29] = "\u000e.I?\"^\u000e.^c.Q\u0014e^}.D\u0013\u0014\u000f$y\u0006";
        objectArray[30] = "P\u0010LA =[\u001f]\u000eJ>O\u0013VE";
        objectArray[31] = "I=ZX\u00130T(X\u0019\u0016l\u001el";
        objectArray[32] = "O\u001d>v\u0004}:=5y\u00152[3>r\u0011h/";
        objectArray[33] = "[}t\u007froEun0?u_\u007fwl.\u007f_h,J4hT}fR3yPpP\u007f2~^q";
        objectArray[34] = "Og}\u00020\u0015DhlMM\rWoe\u0004";
        objectArray[35] = "]wS\u000f\"F]wDS.IG<DM.\\@M\u0012\u0013z\u001f";
        objectArray[36] = "\u0011E~\u0012x@deu\u001di\u000f\u0005k~\u0016mUq";
        objectArray[37] = "\u0003Y}\u0019x\u007f\u001dQgV\u001bk\u0019\u001cN\u0016\"x\u0010";
        objectArray[38] = "6vK>c#CV@1rl\"XK:v6V";
        objectArray[39] = "CsY7\n\u001f^f[v\u000fC\u0013d";
        objectArray[40] = "PT0<p\u000e%t;3aADz08e\u001b0";
        objectArray[41] = "K/D\u0006x\u0013U'^I5\tO-G\u0015$\u0003O:\u001c$9\bB;@\u00153\bU\u0006S\u0014>+@>\u0016,3\u001fr+F1?\u0003V";
        objectArray[42] = "9$c-\u0005\u00062>78o^0#\r(\u000bB;_i9\u0003\u0006kn0#\u000bCV";
        objectArray[43] = "\u001f\u0014*A)\"\u001dW=\u001e@,K\u00132F,\u001e\u001dVn\u001e\u007fI\u001c\u0017>\u0018}xE\r6]@";
        objectArray[44] = "P1\u0016 ??Rr\u0001\u007fV1\u00046\u000e':\u0003VqS{V7\nv\u0017'm.\u0007rQ@?9R)\u0010+m3\u001b:n|2/X.\u000e *8\u0018J";
        objectArray[45] = "\u00166\u001d,9\u0011M-WhB\u001cK6\u001b\u0013s\u0010\u0018|\u0015j&\u001cC'g";
        objectArray[46] = "x\u007fC(\u000fT`l\u001f8jLrg\u000e:-\\\u001br\u0017&\u0018Sqo\u001e*jQg3\f2\fIto\u001cW";
        objectArray[47] = "\u001aNIOfM\u000f\u0012\t\u0011^\u001e~QNM$E\u001aF\\\u0016\" BOH\u0019:@\u001eW_Y^";
        objectArray[48] = ",z\u000e/C\u001d\";\u00045 \u001d:-O;\\\u001b<@\u0005\"ZC=+^9\u0010\u0007F";
        objectArray[49] = "}^\u0014{:\u0003-^UiQMA[\u0018s+\u0017%L\n(-r{Y\t/lC\"C\u0001jQ";
        objectArray[50] = "c 2Xy*3 sJ\u0012c_3:_\u007f*9c|Jl";
        objectArray[51] = "\u007f\\{\u001a\t9%\u0005#\trh\u0004bh\u0018\u0017\"!\u0006\u007f\nL$D^v\u001eC<$\u0002n\t\u0003X";
        objectArray[52] = "]\u0000Hp9W\b\u0002\u001fjZV6\u0015\\p \nR\u0002N+&o\n\u000bZ$>\u000fV\u0013MdZ";
        objectArray[53] = "\u007fL\u00027\u0010q/\n\u0017$a-\u0013X\rj\nry\f\u0007=\u001b\u0017zXS9\u001f|(R\u001a*a";
        objectArray[54] = "aC3CEve]4\n.#lMi]B\u00118\b4\u0007\u0012F;Ie\u0003\u0013wbSmF.";
        objectArray[55] = "K\u00126I|5\rQg\u0013\u0003k\u0014\u00009NT<JWa\":~\r\r4I8=\u001aR";
        objectArray[56] = "yu`JMh?61\u001026&goMeay:4!\r:\":oECc|h";
        objectArray[57] = "\n\u0017{aNQ\\Ad&2[[A}ue\u0004\u0003\u001c \u0019\bMV\u0015$(QW^P";
        objectArray[58] = "tAz\u001bGVz\u0000p\u0001$\\y\u001d=\u000fEQe{p\f\u001a\rl\u0002%\u0000AV\u001e\u0012,]GIu@&\u0014T7";
        objectArray[59] = ".!Y^\u0002W~!\u0018Li\u0018\u0012?\u0011K\u0002E/?U\u000e\t";
        objectArray[60] = "HJ4t%\u001bO\u0005riN\u000bI@oc2eHJ4t%\u001bO\u0005riN\u001fS_po*\bA\u0004v\n(\u0015\u0010Dat/ZVY\n";
        objectArray[61] = "h\u0007\u001eH$\u001ajD\t\u0017M\u0014<\u0000\u0006O!&jEZ\u0017|qk\u0004\n\u0011p@2\u001e\u0002TM";
        objectArray[62] = "K0/kOpY*w-(y^=\u0018\u007fLk^Aw|\u0016,A8\"pMw3";
        objectArray[63] = "9\bs(C\u000b7Iy2 \u00017_!/ V7Iy1@\n/^9U";
        objectArray[64] = "hAj\u000f\\$pHn\b`\u0011[#^<!\u001d^9U=`!+\u0001nN\u001f9\"\u0005i";
        objectArray[65] = "F\u0000+$\r,\u0010V4cq&\u0017V-0&yO\u000bq\\K0\u001a\u0002tm\u0012*\u0012G";
        objectArray[66] = "/\u0004\u0017]q\u0011\u007f\u0004VO\u001aP\u0013\u0011\\\u000bg\u0003r\u001f\u001d\u0001}";
        objectArray[67] = "d6H#H3o,\u001c6\"tb)\u0005\"ed\u000bw\u0000#\u001b7:.\u001a+^\nd6H#H3o,\u001c6\"";
        objectArray[68] = ",\bT~|^,L\u0011u\u001f\u0006 KCx\u001fR'\u000f\u0016gf\u0007+TM\u0015.\ts\u000b^l{\u0005(P,t`\t(_\u001des\\.1\u001d\u007f!Y?HHsz\u0002M";
        objectArray[69] = "rpB-\u0004^r4\u0007&g\bw$S<g_w2\u000b\"\u0007\u0003o%KF";
        objectArray[70] = "32W\u001b\u001c116\u001bA,<6)\b'E<,\"g\u0014Ih:*\r@C?+O";
        objectArray[71] = "~DHt0Vw\b\u0013u@xwDB\u001e.NzRRz'\u0002!S";
        objectArray[72] = "b~j\ttob:/\u0002\u0017?e;h\u0013L?\u007fGxX,/`&v\u0019&5\u0003";
        objectArray[73] = "W70o\fdUt'0ej\u00030(h\tXW|w>U\u000f\b)*p\u0019c\r1!\u000f";
        objectArray[74] = "\u0016L\u0014C\u0013(FLUQxc*R\\V\u0013:\u0017R\u0018\u0013\u0018";
        objectArray[75] = "{@\b\u0001!Tu\u0001\u0002\u001bB\\}\u00163M(\u000b+\bJ\u0018$PpzZ\u0011yVo\u0011\b\u001b0E\u0011";
        objectArray[76] = "\u00137z\u0003\u007f$C7;\u0011\u0014d/\"1Ui6N,p_s";
        objectArray[77] = "\u0011\u0010/sz\u001b\u0011Tjx\u0019G\u000bd2`eWp@:#zX\u001b\u00120ji&";
        objectArray[78] = ":E]ET8`\u001c\u0005V/c\u0001\u001dQXP%m\u0018IS";
        objectArray[79] = "98\u0016buS%7Ba\u0016\\19ROpF\\sVb/\u0007m*Ljj:f1B7+\u000b?+Jr\u0016\u0000$%\u00173'Y>-R\u000e";
        objectArray[80] = "eV\u0003,|)gROvL>nON#\u000b.\u0007FV~'%m\u0012\\)6@eV\u0003,|)gROvL";
        objectArray[81] = "l\"-\u0001i#i:&~{.g##),t7}O\u000fq>x&%\u0012x2";
        objectArray[82] = "UU|G}\u001eDS:A\u000f\u0003FO:8~\u001cNG'Rc\u0015B57\\~\n^_*Urx";
        objectArray[83] = "\u0007^M\u0003a\u0007\u0007\u001a\b\b\u0002\\\u000b\u0018v\u0005sa\u000b\u001b5\u0013}@\t\u0001K\u00128T\u0005g";
        objectArray[84] = "\u000f3;<\u00108\rp,cy6[4#;\u0015\u0004\fsxeISG,2.\u00189Z%>\\";
        objectArray[85] = "!\u0003Qa]^-\u0015\u0000?/Q3\u0010E4IF\u0012\u000bZ4j[*\u000e^\"/W+ZT<E\u0003!\rEY";
        objectArray[86] = "6:\rF[`3\"\u00069Im=;\u0003n\u001e7mgoHC}\">\u0005UJq";
        objectArray[87] = "$+\u0011-e\\~rI>\u001e\u0005P\u0015\u0002/{Gzq\u0015= A\u001f)\u001c)/Y\u007fu\u0004>o=";
        objectArray[88] = ">1kZbD'<o\u001c\u0005\u001a0.7Di(aik\u001c=\u007f;\"i]n\u0001<m/@\u0005\u001806'\\j\u0003,>6#";
        objectArray[89] = "4T~\fd?oO4H\u001f.iAcMrT8@\u007f\u0002{4dXhB\u001f";
        objectArray[90] = "\u001bls\u0012\u001c\u0011Kl2\u0000wX'i\u007f\u001a\r\u0005C~mA\u000b`\u001dknFJQDqf\u0003w";
        objectArray[91] = "*:#VfNq!i\u0012\u001dEs1\u001f\u0004mY\u001a#4R~[qq>\u001bm%";
        objectArray[92] = "-\u0017~\u0003\u0007.-S;\bdi!Ka\u0016\t\u0013}D8R\u0016j(Hc\td\"&\u0010<\u001a\u001dw*Kgh";
        objectArray[93] = "DjkiNS@tl %\u0006Id1wI4\u001d!l-\u0015c\u001e`=)\u0018RGz5l%";
        objectArray[94] = "\u007f.@\u001eR\u0001z6Ka@\ft/N6\u0017V$r\"\u0010J\u001ck*H\rC\u0010";
        objectArray[95] = "W\u001cIjd\u0014Y]Cp\u0007\u0014Fk\u0017o{\u0004=O\u001f,d\u000bV\u001d\u0015ewu";
        objectArray[96] = "Z|0\u0011w!Z8u\u001a\u0014dF9\t\u0014]v@(.\u0006\u0014-Q{r\bmx] )z%v\u0005\u007f:\u0003pz^$HK~\"\u000171\u001eryZE";
        objectArray[97] = "m\u0018iz\b\u0003|\u001e/|z\fm\u0003S?\u0002\t>Ebf\u0018\u0001{xi}\u0016\\:I0g\u001e\u0019\u0007";
        objectArray[98] = "*v~\u0013}\u001b\u007ft)\t\u001e\u001aA'h\u001du\\qa+L/";
        objectArray[99] = "\u0002\u0019D\u0012K\u001d\u0010\u0003\u001cT,\u0014\u0017\u0014n\u0002]{K\u0002\u0013U^\u0002\u001e\u000eH\u000e,";
        objectArray[100] = "R\u0005CU\"hN\n\u0017VAjJ\u000e\u0001T'}7\u0011\n\u0001-b^\r\u0005U.\u0001";
        Object[] objectArray2 = objectArray;
        objectArray[101] = "U#\u00140U<\u0005#U\">}.\\\u001f [7\f8\b2\u00001i`\u0001&\u000f)\t<\u00191OM";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00dd' || c == 'Y' || c == '\u00fc' || c == 'h') {
                field = _61.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00dd' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'Y' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00fc' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _61.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'q' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'v' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _61.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/61" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _61.c(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static int c(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x6C61;
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
                throw new RuntimeException("dev/krypton/61", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _61.k[n2] = n3;
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
        int n = _61.e(l2, l3);
        Object object = r[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = s[n];
                int n3 = string2.indexOf(8);
                clazz3 = _61.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _61.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _61.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _61.r[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _61.f(945548518543578L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _61.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _61.r[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _61.f(945548518543578L, 0L);
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
            int n = _61.e(l2, l3);
            object = r[n];
            try {
                if (!(object instanceof String)) break block2;
                _61.r[n] = clazz = Class.forName(s[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/61" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _61.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _61.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _61.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _61.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static long d(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x5C2B;
        if (_61.n[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = m[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])o.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    o.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/61", exception);
            }
            long l5 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            _61.n[n2] = l5;
        }
        return _61.n[n2];
    }

    private static long d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = _61.d(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return l3;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/61" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_3().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/61" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _61.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x54FF;
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
                throw new RuntimeException("dev/krypton/61", exception);
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
            _61.e[n2] = _61.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field g(long l2, long l3) {
        int n = _61.e(l2, l3);
        Object object = r[n];
        if (object instanceof String) {
            String string = s[n];
            int n2 = string.indexOf(8);
            Class clazz = _61.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _61.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _61.c(clazz3, string2, clazz2)) != null) {
                    _61.r[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _61.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _61.r[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _61.f(945548518543578L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private int int_0(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        class_1923 class_19232 = (class_1923)objectArray[1];
        l2 = b ^ l2;
        return (int)(_61.f("\u00dd", (Object)class_19232, 4404858470991187784L, (long)l2) * _61.c("w", 5632, (long)(0x73F6BBBC13034743L ^ l2)) + _61.c("w", 21866, (long)(0x3406BE07A5C2042EL ^ l2)));
    }

    @_3i_0
    public void cfr_renamed_7(_9o o) {
        reference v3;
        String string;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        block21: {
            block22: {
                block19: {
                    block20: {
                        CallSite callSite;
                        block17: {
                            block18: {
                                long l7 = l6 = b ^ 0x43FCAC615003L;
                                l5 = l7 ^ 0x1E694A436D2CL;
                                l4 = l7 ^ 0x1A548C297E2BL;
                                l3 = l7 ^ 0x7BCBA16CC9C5L;
                                l2 = l7 ^ 0x2A959FBDB641L;
                                string = _8h.cfr_renamed_4();
                                try {
                                    callSite = _61.f("\u00dd", (Object)_61.f("\u00dd", (Object)this, -3285767096988545485L, (long)l6), -3282007883579842972L, (long)l6);
                                    if (string != null) break block17;
                                    if (callSite != null) break block18;
                                }
                                catch (MatchException matchException) {
                                    throw _61.a(matchException);
                                }
                                return;
                            }
                            callSite = _61.f("\u00dd", (Object)_61.f("\u00dd", (Object)this, -3285767096988545485L, (long)l6), -3282007883579842972L, (long)l6);
                        }
                        CallSite callSite2 = _61.f("q", (Object)callSite, -3284154951394277574L, (long)l6);
                        reference var14_9 = _61.f("v", (double)(_61.f("\u00dd", (Object)callSite2, -3284672522624235234L, (long)l6) * _61.f("\u00dd", (Object)callSite2, -3284672522624235234L, (long)l6) + _61.f("\u00dd", (Object)callSite2, -3284338915520781749L, (long)l6) * _61.f("\u00dd", (Object)callSite2, -3284338915520781749L, (long)l6)), -3284635171411196051L, (long)l6) * 20.0;
                        try {
                            reference v3 = var14_9 - 10.0;
                            v3 = v3 == 0 ? 0 : (v3 > 0 ? 1 : -1);
                            if (string != null) break block19;
                            if (v3 <= 0) break block20;
                        }
                        catch (MatchException matchException) {
                            throw _61.a(matchException);
                        }
                        CallSite callSite3 = _61.f("v", (Object)_61.a("p", 5181, (long)(0x3DB435E7715812B8L ^ l6)), (Object)new Object[]{_61.f("v", (double)var14_9, -3281512163983594325L, (long)l6)}, -3282797074332294281L, (long)l6);
                        if (var14_9 > 18.0) {
                            callSite3 = (String)((Object)callSite3) + (String)((Object)_61.a("p", 26109, (long)(0x62BA2F9E9B09637CL ^ l6)));
                        }
                        _61.f("q", (Object)_61.f("\u00dd", (Object)_61.f("\u00dd", (Object)this, -3285767096988545485L, (long)l6), -3282007883579842972L, (long)l6), (Object)_61.f("v", (Object)callSite3, -3285349341261004043L, (long)l6), (boolean)true, -3281660541677775756L, (long)l6);
                    }
                    v3 = _61.f("q", (Object)_61.f("\u00dd", (Object)this, -3284094631455860725L, (long)l6), -3283863428293128661L, (long)l6);
                }
                try {
                    if (string != null) break block21;
                    if (v3 == false) break block22;
                }
                catch (MatchException matchException) {
                    throw _61.a(matchException);
                }
                return;
            }
            reference v3 = _61.f("q", (Object)_61.f("\u00dd", (Object)_61.f("\u00dd", (Object)this, -3285767096988545485L, (long)l6), -3282007883579842972L, (long)l6), -3284520925589824766L, (long)l6) - 30.0;
            v3 = v3 == 0 ? 0 : (v3 < 0 ? -1 : 1);
        }
        if (v3 <= 0) {
            return;
        }
        CallSite callSite = _61.f("v", -3284435325228720111L, (long)l6);
        CallSite callSite4 = _61.f("q", (Object)_61.f("q", (Object)_61.f("\u00dd", (Object)this, -3284094631455860725L, (long)l6), -3284203443304181880L, (long)l6), -3282560422812730399L, (long)l6);
        while (_61.f("q", (Object)callSite4, -3285128369177806947L, (long)l6) != false) {
            block24: {
                CallSite callSite2;
                class_1923 class_19232;
                block25: {
                    Map.Entry entry;
                    block23: {
                        entry = (Map.Entry)((Object)_61.f("q", (Object)callSite4, -3281633051732766638L, (long)l6));
                        try {
                            try {
                                if (string != null) break block23;
                                if (callSite - _61.f("q", (Object)((Long)((Object)_61.f("q", (Object)entry, -3282648830099769671L, (long)l6))), -3283251060153928182L, (long)l6) < _61.d("i", 28072, (long)(0x3AA750F78A85E3FDL ^ l6))) break block24;
                            }
                            catch (MatchException matchException) {
                                throw _61.a(matchException);
                            }
                            _61.f("q", (Object)callSite4, -3285293543055897473L, (long)l6);
                        }
                        catch (MatchException matchException) {
                            throw _61.a(matchException);
                        }
                    }
                    class_19232 = (class_1923)_61.f("q", (Object)entry, -3285660706952265590L, (long)l6);
                    try {
                        try {
                            callSite2 = _61.f("q", (Object)_61.f("\u00dd", (Object)this, -3283944673672251922L, (long)l6), (Object)class_19232, -3284027268214920675L, (long)l6);
                            if (string != null) break block25;
                            if (callSite2 == false) break block24;
                        }
                        catch (MatchException matchException) {
                            throw _61.a(matchException);
                        }
                        callSite2 = _61.f("q", (Object)_61.f("v", -3285620461810440489L, (long)l6), -1, 2, -3283726083979513564L, (long)l6);
                    }
                    catch (MatchException matchException) {
                        throw _61.a(matchException);
                    }
                }
                CallSite callSite6 = callSite2;
                CallSite callSite7 = _61.f("q", (Object)_61.f("v", -3285620461810440489L, (long)l6), -1, 2, -3283726083979513564L, (long)l6);
                class_1923 class_19233 = new class_1923((int)(_61.f("\u00dd", (Object)class_19232, -3283012509835845607L, (long)l6) + callSite6), (int)(_61.f("\u00dd", (Object)class_19232, -3283591696231134973L, (long)l6) + callSite7));
                _61.f("q", (Object)_61.f("\u00dd", (Object)this, -3283492185248067601L, (long)l6), (Object)class_19233, -3284027268214920675L, (long)l6);
                Object[] objectArray = new Object[2];
                objectArray[1] = class_19233;
                objectArray[0] = l5;
                CallSite callSite8 = _61.f("q", (Object)this, (Object)objectArray, -3285165950963149934L, (long)l6);
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l4;
                objectArray2[0] = class_19233;
                CallSite callSite9 = _61.f("q", (Object)this, (Object)objectArray2, -3282472334814981928L, (long)l6);
                Object[] objectArray3 = new Object[3];
                objectArray3[2] = (String)((Object)_61.a("p", 19112, (long)(0x2EBB13ACDA65CC28L ^ l6))) + (int)callSite8 + (String)((Object)_61.a("p", 13409, (long)(0x56C06D37C0E032E3L ^ l6))) + (int)callSite9;
                objectArray3[1] = l2;
                objectArray3[0] = _61.a("p", 6961, (long)(0x421F7AEA0DB51DB2L ^ l6));
                _61.f("v", (Object)objectArray3, -3281476934845164129L, (long)l6);
                Object[] objectArray4 = new Object[2];
                objectArray4[1] = class_19232;
                objectArray4[0] = l3;
                _61.f("q", (Object)this, (Object)objectArray4, -3285534635431320317L, (long)l6);
            }
            if (string == null) continue;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @_3i_0
    public void cfr_renamed_8(_6c_0 c_0) {
        _61 v1;
        String string;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        long l7;
        long l8;
        block17: {
            long l9 = l8 = b ^ 0x1A8910956F4AL;
            l7 = l9 ^ 0x471CF6B75265L;
            l6 = l9 ^ 0x432130DD4162L;
            l5 = l9 ^ 0x685E2879CB27L;
            l4 = l9 ^ 0x6943BDB9AF69L;
            l3 = l9 ^ 0x7F4BC8005DF3L;
            l2 = l9 ^ 0x9C914CD20B8L;
            string = _8h.cfr_renamed_4();
            try {
                try {
                    v1 = this;
                    if (string != null) break block17;
                    if (_61.f("\u00dd", (Object)_61.f("\u00dd", (Object)v1, -1355648022580498054L, (long)l8), -1352916694158639033L, (long)l8) == null) return;
                }
                catch (MatchException matchException) {
                    throw _61.a(matchException);
                }
                v1 = this;
            }
            catch (MatchException matchException) {
                throw _61.a(matchException);
            }
        }
        try {
            if (_61.f("q", (Object)_61.f("\u00dd", (Object)v1, -1357861449649573722L, (long)l8), -1359915077252841949L, (long)l8) != false) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw _61.a(matchException);
        }
        _8B b = new _8B(0, (int)_61.c("w", 5761, (long)(0x4242DB9B41C997D4L ^ l8)), l4, 0, (int)_61.c("w", 50, (long)(0x4898FAD903428163L ^ l8)));
        _8B b2 = new _8B(0, (int)_61.c("w", 19710, (long)(0x44284D487B034DA7L ^ l8)), l4, 0, (int)_61.c("w", 31764, (long)(0x16EA84898BDAFD47L ^ l8)));
        _8B b3 = new _8B(0, (int)_61.c("w", 19710, (long)(0x44284D487B034DA7L ^ l8)), l4, 0, (int)_61.c("w", 5762, (long)(0x714E26C6EB3B17D8L ^ l8)));
        reference var20_13 = _61.f("q", (Object)_61.f("\u00dd", (Object)_61.f("\u00dd", (Object)this, -1355648022580498054L, (long)l8), -1352577138476900051L, (long)l8), -1351738615450922682L, (long)l8) >> 4;
        reference var21_14 = _61.f("q", (Object)_61.f("\u00dd", (Object)_61.f("\u00dd", (Object)this, -1355648022580498054L, (long)l8), -1352577138476900051L, (long)l8), -1353275791839908081L, (long)l8) >> 4;
        CallSite callSite = _61.f("q", (Object)_61.f("\u00dd", (Object)this, -1357861449649573722L, (long)l8), -1352388468905769816L, (long)l8);
        while (_61.f("q", (Object)callSite, -1359602946179004204L, (long)l8) != false) {
            block20: {
                CallSite callSite2;
                CallSite callSite3;
                class_1923 class_19232;
                block19: {
                    block18: {
                        class_19232 = (class_1923)_61.f("q", (Object)callSite, -1352182329396842725L, (long)l8);
                        try {
                            callSite3 = _61.f("v", (int)(_61.f("\u00dd", (Object)class_19232, -1352983204933001392L, (long)l8) - var20_13), -1355818120724670632L, (long)l8);
                            callSite2 = _61.c("w", 6969, (long)(0x4A8D6109F1F61A67L ^ l8));
                            if (string != null) break block18;
                            if (callSite3 > callSite2) continue;
                        }
                        catch (MatchException matchException) {
                            throw _61.a(matchException);
                        }
                        callSite3 = _61.f("v", (int)(_61.f("\u00dd", (Object)class_19232, -1358099400721910198L, (long)l8) - var21_14), -1355818120724670632L, (long)l8);
                        callSite2 = _61.c("w", 9359, (long)(0x76E6E15522F25DFL ^ l8));
                    }
                    try {
                        if (string != null) break block19;
                        if (callSite3 > callSite2) {
                            continue;
                        }
                    }
                    catch (MatchException matchException) {
                        throw _61.a(matchException);
                    }
                    callSite3 = _61.f("\u00dd", (Object)class_19232, -1352983204933001392L, (long)l8) - true;
                    callSite2 = _61.c("w", 2976, (long)(0x195BAB339D9C0AF8L ^ l8));
                }
                double d = (double)(callSite3 * callSite2);
                double d2 = (double)((_61.f("\u00dd", (Object)class_19232, -1358099400721910198L, (long)l8) - true) * _61.c("w", 5632, (long)(0x73F6B43C98A9975BL ^ l8)));
                double d3 = d + 48.0;
                double d4 = d2 + 48.0;
                try {
                    try {
                        Object[] objectArray = new Object[11];
                        objectArray[10] = l3;
                        objectArray[9] = 0;
                        objectArray[8] = _61.f("\u00fc", -1358222072148912176L, (long)l8);
                        objectArray[7] = b2;
                        objectArray[6] = b;
                        objectArray[5] = d4;
                        objectArray[4] = 63.1;
                        objectArray[3] = d3;
                        objectArray[2] = d2;
                        objectArray[1] = 63.0;
                        objectArray[0] = d;
                        _61.f("q", (Object)c_0.cfr_renamed_7, (Object)objectArray, -1352292983305294737L, (long)l8);
                        if (_61.f("q", (Object)_61.f("\u00dd", (Object)this, -1352226664756871191L, (long)l8), (long)l2, -1352702513486764802L, (long)l8) == false || _61.f("\u00fc", -1358698737049291669L, (long)l8) == null) break block20;
                    }
                    catch (MatchException matchException) {
                        throw _61.a(matchException);
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = class_19232;
                    objectArray[0] = l7;
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = l6;
                    objectArray2[0] = class_19232;
                    Object[] objectArray3 = new Object[8];
                    objectArray3[7] = b3;
                    objectArray3[6] = l5;
                    objectArray3[5] = (double)_61.f("q", (Object)this, (Object)objectArray2, -1352476576163663983L, (long)l8);
                    objectArray3[4] = 63.05;
                    objectArray3[3] = (double)_61.f("q", (Object)this, (Object)objectArray, -1359551021384848165L, (long)l8);
                    objectArray3[2] = (double)_61.f("\u00dd", (Object)_61.f("\u00fc", -1358698737049291669L, (long)l8), -1359253254217638654L, (long)l8);
                    objectArray3[1] = (double)_61.f("\u00dd", (Object)_61.f("\u00fc", -1358698737049291669L, (long)l8), -1359842129457433256L, (long)l8);
                    objectArray3[0] = (double)_61.f("\u00dd", (Object)_61.f("\u00fc", -1358698737049291669L, (long)l8), -1359200005431544233L, (long)l8);
                    _61.f("q", (Object)c_0.cfr_renamed_7, (Object)objectArray3, -1359357568524944516L, (long)l8);
                }
                catch (MatchException matchException) {
                    throw _61.a(matchException);
                }
            }
            if (string == null) continue;
        }
    }

    private int int_7(Object[] objectArray) {
        class_1923 class_19232 = (class_1923)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = b ^ l2;
        return (int)(_61.f("\u00dd", (Object)class_19232, 3330416834385835349L, (long)l2) * _61.c("w", 5632, (long)(0x73F6BF81D5695444L ^ l2)) + _61.c("w", 10142, (long)(0x2BCEE3581A0E65DCL ^ l2)));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_61.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_61.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_61.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_3() {
        try {
            return MethodHandles.lookup().findStatic(_61.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

