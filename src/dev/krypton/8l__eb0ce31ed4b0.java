/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.krypton.02
 *  dev.krypton.87
 *  dev.krypton.8B
 *  dev.krypton.8e
 *  dev.krypton.l
 *  java.lang.MatchException
 *  net.minecraft.class_11908
 *  net.minecraft.class_11909
 *  net.minecraft.class_437
 */
package dev.krypton;

import dev.krypton._02;
import dev.krypton._87;
import dev.krypton._8B;
import dev.krypton._8e;
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
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_11908;
import net.minecraft.class_11909;
import net.minecraft.class_437;

public class _8l
extends _8e {
    private static final _8B cfr_renamed_18;
    private final _8B cfr_renamed_16;
    private final Consumer cfr_renamed_19;
    private final class_437 cfr_renamed_20;
    private final int cfr_renamed_21;
    private final int cfr_renamed_22;
    private final int cfr_renamed_23;
    private final int cfr_renamed_15;
    private final int cfr_renamed_5;
    private final int[] cfr_renamed_6;
    private boolean cfr_renamed_3;
    private boolean cfr_renamed_1;
    private double cfr_renamed_24;
    private double cfr_renamed_13;
    private double cfr_renamed_25;
    private double cfr_renamed_26;
    private int[] cfr_renamed_9;
    private static final long b;
    private static final String[] f;
    private static final String[] g;
    private static final Map h;
    private static final long[] l;
    private static final Integer[] m;
    private static final Map n;
    private static final Object[] q;
    private static final String[] r;

    public _8l(long l2, String string, _8B b, Consumer consumer, class_437 class_4372) {
        long l3 = l2 = _8l.b ^ l2;
        long l4 = l3 ^ 0x68EBBEB802BAL;
        long l5 = l3 ^ 0x458E2D694F4BL;
        int n = (int)(l5 >>> 48);
        int n2 = (int)(l5 << 16 >>> 32);
        int n3 = (int)(l5 << 48 >>> 48);
        long l6 = l3 ^ 0x439D21F2AC9L;
        long l7 = l3 ^ 0x68753F7DAA97L;
        super((String)((Object)_8l.b("o", 14399, (long)(0x638EF94DDC9FFF16L ^ l2))) + string.toUpperCase());
        this.cfr_renamed_21 = (int)_8l.d("y", 5988, (long)(0x60AC06560A6B33D3L ^ l2));
        this.cfr_renamed_22 = (int)_8l.d("y", 19670, (long)(0x1C84036E8CDCE86BL ^ l2));
        this.cfr_renamed_23 = (int)_8l.d("y", 5988, (long)(0x60AC06560A6B33D3L ^ l2));
        this.cfr_renamed_15 = (int)_8l.d("y", 16687, (long)(0x3FA6F0F7064AE584L ^ l2));
        boolean bl = _02.cfr_renamed_15();
        this.cfr_renamed_5 = (int)_8l.d("y", 27866, (long)(0x4E7DAAABE5C0486AL ^ l2));
        _8l.f("q", (Object)((Object)this), (boolean)_8l.d("y", 32041, (long)(0x44C15787AFC2598CL ^ l2)), -4759314403955401424L, (long)l2);
        _8l.f("q", (Object)((Object)this), (boolean)_8l.d("y", 16974, (long)(0x2E91DFFCFEDB66EFL ^ l2)), -4759793071981912327L, (long)l2);
        _8l.f("q", (Object)((Object)this), -1.0, -4759569339588011854L, (long)l2);
        Object[] objectArray = new Object[3];
        objectArray[2] = (int)((short)n3);
        objectArray[1] = n2;
        objectArray[0] = (int)((short)n);
        this.cfr_renamed_16 = _8l.f("\u00db", (Object)b, (Object)objectArray, -4762522178100961343L, (long)l2);
        this.cfr_renamed_19 = consumer;
        this.cfr_renamed_20 = class_4372;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = null;
        objectArray2[3] = (int)_8l.f("\u00da", (Object)b, -4761948195784075606L, (long)l2);
        objectArray2[2] = (int)_8l.f("\u00da", (Object)b, -4760006636705312515L, (long)l2);
        objectArray2[1] = (int)_8l.f("\u00da", (Object)b, -4759197022478308850L, (long)l2);
        objectArray2[0] = l4;
        CallSite callSite = _8l.f("\u00e6", (Object)objectArray2, -4759436290769360607L, (long)l2);
        _8l.f("q", (Object)((Object)this), (double)((double)(callSite[0] * 360.0f)), -4762314777472582074L, (long)l2);
        boolean bl2 = bl;
        _8l.f("q", (Object)((Object)this), (double)((double)callSite[1]), -4760700251884423172L, (long)l2);
        _8l.f("q", (Object)((Object)this), (double)((double)callSite[2]), -4761174190692062964L, (long)l2);
        Object object = _8l.d("y", 13832, (long)(0x238DD35DEA0F12B6L ^ l2));
        this.cfr_renamed_6 = new int[object];
        for (int i = 0; i < object; ++i) {
            double d = (double)i / (double)object * 360.0;
            Object[] objectArray3 = new Object[4];
            objectArray3[3] = l7;
            objectArray3[2] = 1.0;
            objectArray3[1] = 1.0;
            objectArray3[0] = d;
            Object[] objectArray4 = new Object[1];
            objectArray4[0] = l6;
            _8l.f("\u00da", (Object)((Object)this), -4759952028239676884L, (long)l2)[i] = _8l.f("\u00db", (Object)_8l.f("\u00e6", (Object)objectArray3, -4762388790261272469L, (long)l2), (Object)objectArray4, -4762432149673240997L, (long)l2);
            if (bl2) continue;
        }
    }

    protected int cfr_renamed_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        CallSite callSite = _8l.d("y", 22799, (long)(0x4F8D5E80317F3C61L ^ l2));
        CallSite callSite2 = _8l.d("y", 20906, (long)(0x6FB8FF0F5762B4CBL ^ l2));
        reference var6_5 = callSite * 2 + callSite2;
        reference var7_6 = var6_5 + _8l.d("y", 8819, (long)(0x2182DFCED7504718L ^ l2));
        CallSite callSite3 = _8l.d("y", 22102, (long)(0x21A3E4551ED2333EL ^ l2));
        return (int)_8l.f("\u00e6", (int)var7_6, (int)callSite3, -272703332685277400L, (long)l2);
    }

    protected int int_9(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return (int)_8l.d("y", 449, (long)(0x2F7152903EBF854EL ^ l2));
    }

    private _8B dev_krypton_8B_4(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = b ^ l2) ^ 0x364CDF43DD3FL;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l3;
        objectArray2[2] = (double)_8l.f("\u00da", (Object)((Object)this), -3871768065381966172L, (long)l2);
        objectArray2[1] = (double)_8l.f("\u00da", (Object)((Object)this), -3871188705529135020L, (long)l2);
        objectArray2[0] = (double)_8l.f("\u00da", (Object)((Object)this), -3872948581403375122L, (long)l2);
        CallSite callSite = _8l.f("\u00e6", (Object)objectArray2, -3872877317997803581L, (long)l2);
        _8l.f("q", (Object)callSite, (int)_8l.d("y", 12780, (long)(0x33962C73431562E6L ^ l2)), -3872180611475535925L, (long)l2);
        return callSite;
    }

    /*
     * Exception decompiling
     */
    private void cfr_renamed_9(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[DOLOOP]], but top level block is 7[SIMPLE_IF_TAKEN]
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

    protected void cfr_renamed_5(Object[] objectArray) {
        _87 var8_2 = (_87)objectArray[0];
        int n = (Integer)objectArray[1];
        int n2 = (Integer)objectArray[2];
        int n3 = (Integer)objectArray[3];
        int n4 = (Integer)objectArray[4];
        int n5 = (Integer)objectArray[5];
        int n6 = (Integer)objectArray[6];
        float f = ((Float)objectArray[7]).floatValue();
        long l2 = (Long)objectArray[8];
        long l3 = l2;
        long l4 = l3 ^ 0x4ED41FDB2AE8L;
        long l5 = l3 ^ 0x2FCE12E65243L;
        long l6 = l3 ^ 0x4A9BD80D1143L;
        long l7 = l3 ^ 0x6DEA269317BEL;
        long l8 = l3 ^ 0x4CAB0070DFE7L;
        long l9 = l3 ^ 0x648BC15F50DEL;
        long l10 = l3 ^ 0x3CB78ADF70AAL;
        long l11 = l3 ^ 0x7E202C1A1B7EL;
        long l12 = l3 ^ 0x6C37D3461E70L;
        int n7 = (int)(l12 >>> 56);
        long l13 = l12 << 8 >>> 8;
        long l14 = l3 ^ 0x683978A514A8L;
        long l15 = l3 ^ 0x7006BDE64359L;
        long l16 = l3 ^ 0x53F54BCA58B7L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l10;
        CallSite callSite = _8l.f("\u00db", (Object)((Object)this), (Object)objectArray2, -8314911749437369834L, (long)l2);
        int n8 = n + _8l.d("y", 5988, (long)(0x60AC057101DC02B8L ^ l2));
        int n9 = n2 + _8l.d("y", 15280, (long)(0x232CFECCA76D2E76L ^ l2));
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l11;
        _8l.f("\u00db", (Object)((Object)this), (Object)objectArray3, -8321337096970370370L, (long)l2);
        Object[] objectArray4 = new Object[7];
        objectArray4[6] = l13;
        objectArray4[5] = (int)_8l.d("y", 19670, (long)(0x1C840049876BD900L ^ l2));
        objectArray4[4] = (int)_8l.d("y", 19670, (long)(0x1C840049876BD900L ^ l2));
        objectArray4[3] = n9;
        objectArray4[2] = (int)((byte)n7);
        objectArray4[1] = n8;
        objectArray4[0] = var8_2;
        _8l.f("\u00db", (Object)((Object)this), (Object)objectArray4, -8320906278555696825L, (long)l2);
        int n10 = n8 + _8l.d("y", 19670, (long)(0x1C840049876BD900L ^ l2)) + _8l.d("y", 16687, (long)(0x3FA6F3D00DFDD4EFL ^ l2));
        int n11 = n9;
        Object[] objectArray5 = new Object[6];
        objectArray5[5] = (int)_8l.d("y", 19670, (long)(0x1C840049876BD900L ^ l2));
        objectArray5[4] = l14;
        objectArray5[3] = (int)_8l.d("y", 5988, (long)(0x60AC057101DC02B8L ^ l2));
        objectArray5[2] = n11;
        objectArray5[1] = n10;
        objectArray5[0] = var8_2;
        _8l.f("\u00db", (Object)((Object)this), (Object)objectArray5, -8315125948880164362L, (long)l2);
        int n12 = n9 + _8l.d("y", 19670, (long)(0x1C840049876BD900L ^ l2)) + _8l.d("y", 16687, (long)(0x3FA6F3D00DFDD4EFL ^ l2));
        reference var43_30 = (callSite - _8l.d("y", 24590, (long)(0x5A83A92B633AF5D7L ^ l2)) - _8l.d("y", 16687, (long)(0x3FA6F3D00DFDD4EFL ^ l2))) / 2;
        CallSite callSite2 = _8l.d("y", 26488, (long)(0x165334E8E60F2B7L ^ l2));
        Object[] objectArray6 = new Object[10];
        objectArray6[9] = 4.0;
        objectArray6[8] = 4.0;
        objectArray6[7] = 4.0;
        objectArray6[6] = 4.0;
        objectArray6[5] = l9;
        objectArray6[4] = (double)(n12 + callSite2 + 1);
        objectArray6[3] = (double)(n8 + var43_30 + 1);
        objectArray6[2] = (double)(n12 - 1);
        objectArray6[1] = (double)(n8 - 1);
        objectArray6[0] = new _8B((int)_8l.d("y", 13832, (long)(0x238DD07AE1B823DDL ^ l2)), l15, (int)_8l.d("y", 13832, (long)(0x238DD07AE1B823DDL ^ l2)), (int)_8l.d("y", 7231, (long)(0x3E354B6D28E909F7L ^ l2)));
        _8l.f("\u00db", (Object)var8_2, (Object)objectArray6, -8315496354566461704L, (long)l2);
        Object[] objectArray7 = new Object[10];
        objectArray7[9] = 3.0;
        objectArray7[8] = 3.0;
        objectArray7[7] = 3.0;
        objectArray7[6] = 3.0;
        objectArray7[5] = l9;
        objectArray7[4] = (double)(n12 + callSite2);
        objectArray7[3] = (double)(n8 + var43_30);
        objectArray7[2] = (double)n12;
        objectArray7[1] = (double)n8;
        objectArray7[0] = new _8B((int)_8l.f("\u00da", (Object)_8l.f("\u00da", (Object)((Object)this), -8320830222356875264L, (long)l2), -8315636527373591707L, (long)l2), l15, (int)_8l.f("\u00da", (Object)_8l.f("\u00da", (Object)((Object)this), -8320830222356875264L, (long)l2), -8315320525146906218L, (long)l2), (int)_8l.f("\u00da", (Object)_8l.f("\u00da", (Object)((Object)this), -8320830222356875264L, (long)l2), -8322323909092481087L, (long)l2));
        _8l.f("\u00db", (Object)var8_2, (Object)objectArray7, -8315496354566461704L, (long)l2);
        Object[] objectArray8 = new Object[2];
        objectArray8[1] = l7;
        objectArray8[0] = _8l.b("o", 30781, (long)(0x229D6B732BF40E7EL ^ l2));
        CallSite callSite3 = _8l.f("\u00db", (Object)var8_2, (Object)objectArray8, -8322271790351355778L, (long)l2);
        Object[] objectArray9 = new Object[5];
        objectArray9[4] = _8l.f("\u00a4", -8321489186451526199L, (long)l2);
        objectArray9[3] = (double)(n12 + callSite2 + 5);
        objectArray9[2] = (double)(n8 + var43_30 / 2) - callSite3 / 2.0;
        objectArray9[1] = _8l.b("o", 25949, (long)(0x7AB614D52F91931AL ^ l2));
        objectArray9[0] = l8;
        _8l.f("\u00db", (Object)var8_2, (Object)objectArray9, -8320715658234326587L, (long)l2);
        Object[] objectArray10 = new Object[1];
        objectArray10[0] = l4;
        CallSite callSite4 = _8l.f("\u00db", (Object)((Object)this), (Object)objectArray10, -8320656780185012726L, (long)l2);
        int n13 = n8 + var43_30 + _8l.d("y", 16687, (long)(0x3FA6F3D00DFDD4EFL ^ l2));
        Object[] objectArray11 = new Object[10];
        objectArray11[9] = 4.0;
        objectArray11[8] = 4.0;
        objectArray11[7] = 4.0;
        objectArray11[6] = 4.0;
        objectArray11[5] = l9;
        objectArray11[4] = (double)(n12 + callSite2 + 1);
        objectArray11[3] = (double)(n13 + var43_30 + 1);
        objectArray11[2] = (double)(n12 - 1);
        objectArray11[1] = (double)(n13 - 1);
        objectArray11[0] = new _8B((int)_8l.d("y", 13832, (long)(0x238DD07AE1B823DDL ^ l2)), l15, (int)_8l.d("y", 13832, (long)(0x238DD07AE1B823DDL ^ l2)), (int)_8l.d("y", 7231, (long)(0x3E354B6D28E909F7L ^ l2)));
        _8l.f("\u00db", (Object)var8_2, (Object)objectArray11, -8315496354566461704L, (long)l2);
        Object[] objectArray12 = new Object[10];
        objectArray12[9] = 3.0;
        objectArray12[8] = 3.0;
        objectArray12[7] = 3.0;
        objectArray12[6] = 3.0;
        objectArray12[5] = l9;
        objectArray12[4] = (double)(n12 + callSite2);
        objectArray12[3] = (double)(n13 + var43_30);
        objectArray12[2] = (double)n12;
        objectArray12[1] = (double)n13;
        objectArray12[0] = new _8B((int)_8l.f("\u00da", (Object)callSite4, -8315636527373591707L, (long)l2), l15, (int)_8l.f("\u00da", (Object)callSite4, -8315320525146906218L, (long)l2), (int)_8l.f("\u00da", (Object)callSite4, -8322323909092481087L, (long)l2));
        _8l.f("\u00db", (Object)var8_2, (Object)objectArray12, -8315496354566461704L, (long)l2);
        Object[] objectArray13 = new Object[2];
        objectArray13[1] = l7;
        objectArray13[0] = _8l.b("o", 29893, (long)(0x415A36FA066F0284L ^ l2));
        CallSite callSite5 = _8l.f("\u00db", (Object)var8_2, (Object)objectArray13, -8322271790351355778L, (long)l2);
        Object[] objectArray14 = new Object[5];
        objectArray14[4] = _8l.f("\u00a4", -8321489186451526199L, (long)l2);
        objectArray14[3] = (double)(n12 + callSite2 + 5);
        objectArray14[2] = (double)(n13 + var43_30 / 2) - callSite5 / 2.0;
        objectArray14[1] = _8l.b("o", 32405, (long)(0x354DB996BC5688D5L ^ l2));
        objectArray14[0] = l8;
        _8l.f("\u00db", (Object)var8_2, (Object)objectArray14, -8320715658234326587L, (long)l2);
        CallSite callSite6 = _8l.d("y", 8420, (long)(0x7EF8CA6192A8B50AL ^ l2));
        CallSite callSite7 = _8l.d("y", 18213, (long)(0x3A9E8C01104252C8L ^ l2));
        Object[] objectArray15 = new Object[1];
        objectArray15[0] = l6;
        reference var53_38 = _8l.f("\u00da", (Object)((Object)this), -8321027221362402294L, (long)l2) + _8l.f("\u00db", (Object)((Object)this), (Object)objectArray15, -8314344974582660481L, (long)l2) - _8l.d("y", 17150, (long)(0x42C0A2071A75D72AL ^ l2));
        CallSite callSite8 = _8l.d("y", 26488, (long)(0x165334E8E60F2B7L ^ l2));
        int n14 = n + callSite - callSite6 - _8l.d("y", 5988, (long)(0x60AC057101DC02B8L ^ l2));
        int n15 = n14 - callSite6 - callSite7;
        Object[] objectArray16 = new Object[1];
        objectArray16[0] = l5;
        Object[] objectArray17 = new Object[8];
        objectArray17[7] = (int)callSite8;
        objectArray17[6] = (int)callSite6;
        objectArray17[5] = (int)var53_38;
        objectArray17[4] = n14;
        objectArray17[3] = _8l.f("\u00db", (Object)((Object)this), (Object)objectArray16, -8321860323992498972L, (long)l2);
        objectArray17[2] = _8l.b("o", 20516, (long)(0x67E36F7A417FA662L ^ l2));
        objectArray17[1] = var8_2;
        objectArray17[0] = l16;
        _8l.f("\u00db", (Object)((Object)this), (Object)objectArray17, -8321971692171483772L, (long)l2);
        Object[] objectArray18 = new Object[8];
        objectArray18[7] = (int)callSite8;
        objectArray18[6] = (int)callSite6;
        objectArray18[5] = (int)var53_38;
        objectArray18[4] = n15;
        objectArray18[3] = _8l.f("\u00a4", -8314233301956028650L, (long)l2);
        objectArray18[2] = _8l.b("o", 23644, (long)(0x4EABB09E28722A19L ^ l2));
        objectArray18[1] = var8_2;
        objectArray18[0] = l16;
        _8l.f("\u00db", (Object)((Object)this), (Object)objectArray18, -8321971692171483772L, (long)l2);
    }

    /*
     * Exception decompiling
     */
    private void cfr_renamed_3(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[DOLOOP]], but top level block is 6[SIMPLE_IF_TAKEN]
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

    private void void_4(Object[] objectArray) {
        block6: {
            _87 var7_2 = (_87)objectArray[0];
            int n = (Integer)objectArray[1];
            int n2 = (Integer)objectArray[2];
            int n3 = (Integer)objectArray[3];
            long l2 = (Long)objectArray[4];
            int n4 = (Integer)objectArray[5];
            long l3 = l2 = b ^ l2;
            long l4 = l3 ^ 0x138F741B618FL;
            long l5 = l3 ^ 0x88EC4A3DE68L;
            long l6 = l3 ^ 0x6D884AD3B64BL;
            long l7 = l3 ^ 0x1F784DA8285DL;
            long l8 = l3 ^ 0x293B8EBEB9E8L;
            int n5 = (int)(l8 >>> 48);
            int n6 = (int)(l8 << 16 >>> 32);
            int n7 = (int)(l8 << 48 >>> 48);
            long l9 = l3 ^ 0xBF531113BDAL;
            int n8 = n4 / 4;
            int n9 = 0;
            boolean bl = _02.cfr_renamed_15();
            block2: while (n9 < n8) {
                CallSite callSite = _8l.f("\u00da", (Object)((Object)this), -857592625423715388L, (long)l2)[n9];
                _8B b = new _8B((int)callSite, (short)n5, n6, (short)n7);
                try {
                    Object[] objectArray2 = new Object[6];
                    objectArray2[5] = b;
                    objectArray2[4] = 4.0;
                    objectArray2[3] = (double)n3;
                    objectArray2[2] = l4;
                    objectArray2[1] = (double)(n2 + n9 * 4);
                    objectArray2[0] = (double)n;
                    _8l.f("\u00db", (Object)var7_2, (Object)objectArray2, -857786793995618886L, (long)l2);
                    ++n9;
                    do {
                        boolean bl2 = bl;
                        if (l2 >= 0L) {
                            if (!bl2) break block6;
                            bl2 = bl;
                        }
                        if (bl2) continue block2;
                    } while (l2 < 0L);
                    break;
                }
                catch (MatchException matchException) {
                    throw _8l.a(matchException);
                }
            }
            Object[] objectArray3 = new Object[11];
            objectArray3[10] = 1.0;
            objectArray3[9] = 2.0;
            objectArray3[8] = l5;
            objectArray3[7] = 2.0;
            objectArray3[6] = 2.0;
            objectArray3[5] = 2.0;
            objectArray3[4] = (double)(n2 + n4 + 1);
            objectArray3[3] = (double)(n + n3 + 1);
            objectArray3[2] = (double)(n2 - 1);
            objectArray3[1] = (double)(n - 1);
            objectArray3[0] = new _8B((int)_8l.d("y", 13832, (long)(0x238DAB896D4F5B5EL ^ l2)), l9, (int)_8l.d("y", 13832, (long)(0x238DAB896D4F5B5EL ^ l2)), (int)_8l.d("y", 7231, (long)(0x3E35309EA41E7174L ^ l2)));
            _8l.f("\u00db", (Object)var7_2, (Object)objectArray3, -862691993469832985L, (long)l2);
            n9 = n2 + (int)(_8l.f("\u00da", (Object)((Object)this), -864511746672986194L, (long)l2) / 360.0 * (double)n4);
            Object[] objectArray4 = new Object[10];
            objectArray4[9] = 2.0;
            objectArray4[8] = 2.0;
            objectArray4[7] = 2.0;
            objectArray4[6] = 2.0;
            objectArray4[5] = l7;
            objectArray4[4] = (double)(n9 + 2);
            objectArray4[3] = (double)(n + n3 + 2);
            objectArray4[2] = (double)(n9 - 2);
            objectArray4[1] = (double)(n - 2);
            objectArray4[0] = new _8B(0, 0, l6, 0, (int)_8l.d("y", 20047, (long)(0x3C94C829D5F32309L ^ l2)));
            _8l.f("\u00db", (Object)var7_2, (Object)objectArray4, -857346472453742981L, (long)l2);
            Object[] objectArray5 = new Object[10];
            objectArray5[9] = 1.0;
            objectArray5[8] = 1.0;
            objectArray5[7] = 1.0;
            objectArray5[6] = 1.0;
            objectArray5[5] = l7;
            objectArray5[4] = (double)(n9 + 1);
            objectArray5[3] = (double)(n + n3 + 1);
            objectArray5[2] = (double)(n9 - 1);
            objectArray5[1] = (double)(n - 1);
            objectArray5[0] = new _8B((int)_8l.d("y", 12780, (long)(0x33960A9E246B5CA6L ^ l2)), l9, (int)_8l.d("y", 12780, (long)(0x33960A9E246B5CA6L ^ l2)), (int)_8l.d("y", 12780, (long)(0x33960A9E246B5CA6L ^ l2)));
            _8l.f("\u00db", (Object)var7_2, (Object)objectArray5, -857346472453742981L, (long)l2);
        }
    }

    public boolean method_25402(class_11909 class_119092, boolean bl) {
        Object object;
        block22: {
            block23: {
                boolean bl2;
                long l2;
                block20: {
                    reference var36_27;
                    CallSite callSite;
                    reference var33_24;
                    CallSite callSite2;
                    CallSite callSite3;
                    CallSite callSite4;
                    long l3;
                    block21: {
                        reference v12;
                        CallSite callSite5;
                        CallSite callSite6;
                        long l4;
                        block18: {
                            CallSite callSite7;
                            block19: {
                                reference v7;
                                reference var30_21;
                                long l5;
                                block16: {
                                    reference var29_19;
                                    block17: {
                                        long l6 = l2 = b ^ 0x79CCC8AD61E3L;
                                        l4 = l6 ^ 0x9FF3531ABB6L;
                                        l5 = l6 ^ 0x2079CCA580E9L;
                                        long l7 = l6 ^ 0xDB0F2E7901DL;
                                        l3 = l6 ^ 0x269A7B59EF28L;
                                        long l8 = l6 ^ 0x7B9CA035F1F4L;
                                        long l9 = l6 ^ 0x26ACD8B14C8EL;
                                        long l10 = l6 ^ 0xFA6C656A276L;
                                        long l11 = l6 ^ 0x46606F4F034FL;
                                        Object[] objectArray = new Object[2];
                                        objectArray[1] = l10;
                                        objectArray[0] = (double)_8l.f("\u00db", (Object)class_119092, 997878918389943430L, (long)l2);
                                        callSite4 = _8l.f("\u00db", (Object)((Object)this), (Object)objectArray, 992905128217401180L, (long)l2);
                                        Object[] objectArray2 = new Object[2];
                                        objectArray2[1] = l10;
                                        objectArray2[0] = (double)_8l.f("\u00db", (Object)class_119092, 999436511739807125L, (long)l2);
                                        callSite3 = _8l.f("\u00db", (Object)((Object)this), (Object)objectArray2, 992905128217401180L, (long)l2);
                                        callSite2 = _8l.d("y", 8420, (long)(0x7EF88D4AB8423454L ^ l2));
                                        callSite6 = _8l.d("y", 18213, (long)(0x3A9ECB2A3AA8D396L ^ l2));
                                        Object[] objectArray3 = new Object[1];
                                        objectArray3[0] = l8;
                                        callSite5 = _8l.f("\u00db", (Object)((Object)this), (Object)objectArray3, 992261940891538248L, (long)l2);
                                        Object[] objectArray4 = new Object[1];
                                        objectArray4[0] = l7;
                                        callSite7 = _8l.f("\u00db", (Object)((Object)this), (Object)objectArray4, 991852290335359777L, (long)l2);
                                        Object[] objectArray5 = new Object[1];
                                        objectArray5[0] = l11;
                                        reference var28_18 = _8l.f("\u00da", (Object)((Object)this), 998535774569504084L, (long)l2) + _8l.f("\u00db", (Object)((Object)this), (Object)objectArray5, 999269164020848286L, (long)l2) + true + _8l.d("y", 15280, (long)(0x232CB9E78D87AF28L ^ l2));
                                        var29_19 = _8l.f("\u00da", (Object)((Object)this), 992489594939819808L, (long)l2) + _8l.d("y", 5988, (long)(0x60AC425A2B3683E6L ^ l2));
                                        bl2 = _02.cfr_renamed_2();
                                        var30_21 = var28_18;
                                        try {
                                            try {
                                                Object[] objectArray6 = new Object[7];
                                                objectArray6[6] = (int)_8l.d("y", 19670, (long)(0x1C844762AD81585EL ^ l2));
                                                objectArray6[5] = (int)_8l.d("y", 19670, (long)(0x1C844762AD81585EL ^ l2));
                                                objectArray6[4] = (int)var30_21;
                                                objectArray6[3] = (int)var29_19;
                                                objectArray6[2] = (double)callSite3;
                                                objectArray6[1] = (double)callSite4;
                                                objectArray6[0] = l3;
                                                v7 = _8l.f("\u00db", (Object)((Object)this), (Object)objectArray6, 998476604142778733L, (long)l2);
                                                if (bl2) break block16;
                                                if (v7 == false) break block17;
                                            }
                                            catch (MatchException matchException) {
                                                throw _8l.a(matchException);
                                            }
                                            _8l.f("q", (Object)((Object)this), (boolean)_8l.d("y", 22842, (long)(0x1F523B652F34DB3L ^ l2)), 992082088708189900L, (long)l2);
                                            Object[] objectArray7 = new Object[7];
                                            objectArray7[6] = (int)_8l.d("y", 19670, (long)(0x1C844762AD81585EL ^ l2));
                                            objectArray7[5] = (int)_8l.d("y", 19670, (long)(0x1C844762AD81585EL ^ l2));
                                            objectArray7[4] = (int)var30_21;
                                            objectArray7[3] = (int)var29_19;
                                            objectArray7[2] = (double)callSite3;
                                            objectArray7[1] = l9;
                                            objectArray7[0] = (double)callSite4;
                                            _8l.f("\u00db", (Object)((Object)this), (Object)objectArray7, 998081587664206114L, (long)l2);
                                            return true;
                                        }
                                        catch (MatchException matchException) {
                                            throw _8l.a(matchException);
                                        }
                                    }
                                    v7 = var29_19 + _8l.d("y", 19670, (long)(0x1C844762AD81585EL ^ l2)) + _8l.d("y", 29909, (long)(0x26AE4B282B7F604CL ^ l2));
                                }
                                reference var31_22 = v7;
                                reference var32_23 = var30_21;
                                try {
                                    try {
                                        Object[] objectArray = new Object[7];
                                        objectArray[6] = (int)_8l.d("y", 19670, (long)(0x1C844762AD81585EL ^ l2));
                                        objectArray[5] = (int)_8l.d("y", 5988, (long)(0x60AC425A2B3683E6L ^ l2));
                                        objectArray[4] = (int)var32_23;
                                        objectArray[3] = (int)var31_22;
                                        objectArray[2] = (double)callSite3;
                                        objectArray[1] = (double)callSite4;
                                        objectArray[0] = l3;
                                        v12 = _8l.f("\u00db", (Object)((Object)this), (Object)objectArray, 998476604142778733L, (long)l2);
                                        if (bl2) break block18;
                                        if (v12 == false) break block19;
                                    }
                                    catch (MatchException matchException) {
                                        throw _8l.a(matchException);
                                    }
                                    _8l.f("q", (Object)((Object)this), (boolean)_8l.d("y", 14951, (long)(0x3FCF91B8AADAAEE7L ^ l2)), 992692766805536005L, (long)l2);
                                    Object[] objectArray = new Object[4];
                                    objectArray[3] = (int)_8l.d("y", 19670, (long)(0x1C844762AD81585EL ^ l2));
                                    objectArray[2] = l5;
                                    objectArray[1] = (int)var32_23;
                                    objectArray[0] = (double)callSite3;
                                    _8l.f("\u00db", (Object)((Object)this), (Object)objectArray, 998402909911165956L, (long)l2);
                                    return true;
                                }
                                catch (MatchException matchException) {
                                    throw _8l.a(matchException);
                                }
                            }
                            v12 = _8l.f("\u00da", (Object)((Object)this), 998535774569504084L, (long)l2) + callSite7 - _8l.d("y", 1900, (long)(0x39E13FF4916613EAL ^ l2));
                        }
                        var33_24 = v12;
                        callSite = _8l.d("y", 156, (long)(0x34D1D361EA751413L ^ l2));
                        reference var35_26 = _8l.f("\u00da", (Object)((Object)this), 992489594939819808L, (long)l2) + callSite5 - callSite2 - _8l.d("y", 5988, (long)(0x60AC425A2B3683E6L ^ l2));
                        var36_27 = var35_26 - callSite2 - callSite6;
                        try {
                            try {
                                Object[] objectArray = new Object[7];
                                objectArray[6] = (int)callSite;
                                objectArray[5] = (int)callSite2;
                                objectArray[4] = (int)var33_24;
                                objectArray[3] = (int)var35_26;
                                objectArray[2] = (double)callSite3;
                                objectArray[1] = (double)callSite4;
                                objectArray[0] = l3;
                                object = _8l.f("\u00db", (Object)((Object)this), (Object)objectArray, 998476604142778733L, (long)l2);
                                if (bl2) break block20;
                                if (object == false) break block21;
                            }
                            catch (MatchException matchException) {
                                throw _8l.a(matchException);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l4;
                            _8l.f("\u00db", (Object)_8l.f("\u00da", (Object)((Object)this), 998911326485594096L, (long)l2), (Object)_8l.f("\u00db", (Object)((Object)this), (Object)objectArray, 997918493196875604L, (long)l2), 992327326515356822L, (long)l2);
                            _8l.f("\u00db", (Object)_8l.f("\u00a4", 999453695511996217L, (long)l2), (Object)_8l.f("\u00da", (Object)((Object)this), 991534353428923289L, (long)l2), 992901895422660033L, (long)l2);
                            return true;
                        }
                        catch (MatchException matchException) {
                            throw _8l.a(matchException);
                        }
                    }
                    Object[] objectArray = new Object[7];
                    objectArray[6] = (int)callSite;
                    objectArray[5] = (int)callSite2;
                    objectArray[4] = (int)var33_24;
                    objectArray[3] = (int)var36_27;
                    objectArray[2] = (double)callSite3;
                    objectArray[1] = (double)callSite4;
                    objectArray[0] = l3;
                    object = _8l.f("\u00db", (Object)((Object)this), (Object)objectArray, 998476604142778733L, (long)l2);
                }
                try {
                    try {
                        if (bl2) break block22;
                        if (object == false) break block23;
                    }
                    catch (MatchException matchException) {
                        throw _8l.a(matchException);
                    }
                    _8l.f("\u00db", (Object)_8l.f("\u00a4", 999453695511996217L, (long)l2), (Object)_8l.f("\u00da", (Object)((Object)this), 991534353428923289L, (long)l2), 992901895422660033L, (long)l2);
                    return true;
                }
                catch (MatchException matchException) {
                    throw _8l.a(matchException);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    public boolean method_25406(class_11909 class_119092) {
        long l2 = b ^ 0x3E49C92087D8L;
        _8l.f("q", (Object)((Object)this), (boolean)_8l.d("y", 16974, (long)(0x2E91DC75DE0B30E1L ^ l2)), -1441847550150259906L, (long)l2);
        _8l.f("q", (Object)((Object)this), (boolean)_8l.d("y", 16974, (long)(0x2E91DC75DE0B30E1L ^ l2)), -1441201486473770761L, (long)l2);
        return false;
    }

    public boolean method_25403(class_11909 class_119092, double d, double d2) {
        Object object;
        block11: {
            block12: {
                reference var21_14;
                boolean bl;
                CallSite callSite;
                long l2;
                long l3;
                block9: {
                    block10: {
                        long l4 = l3 = b ^ 0x1D3D27708723L;
                        l2 = l4 ^ 0x448823786629L;
                        long l5 = l4 ^ 0x425D376CAA4EL;
                        long l6 = l4 ^ 0x6B57298B44B6L;
                        long l7 = l4 ^ 0x22918092E58FL;
                        Object[] objectArray = new Object[2];
                        objectArray[1] = l6;
                        objectArray[0] = (double)_8l.f("\u00db", (Object)class_119092, -1506091892764956090L, (long)l3);
                        CallSite callSite2 = _8l.f("\u00db", (Object)((Object)this), (Object)objectArray, -1510987336147390052L, (long)l3);
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l6;
                        objectArray2[0] = (double)_8l.f("\u00db", (Object)class_119092, -1504533470165900459L, (long)l3);
                        callSite = _8l.f("\u00db", (Object)((Object)this), (Object)objectArray2, -1510987336147390052L, (long)l3);
                        Object[] objectArray3 = new Object[1];
                        objectArray3[0] = l7;
                        reference var19_11 = _8l.f("\u00da", (Object)((Object)this), -1505356698504529004L, (long)l3) + _8l.f("\u00db", (Object)((Object)this), (Object)objectArray3, -1504630040130015138L, (long)l3) + true + _8l.d("y", 438, (long)(0x6A66143BB49E73C4L ^ l3));
                        reference var20_12 = _8l.f("\u00da", (Object)((Object)this), -1511400817453358624L, (long)l3) + _8l.d("y", 26250, (long)(0x76803DCCB3714C6L ^ l3));
                        bl = _02.cfr_renamed_15();
                        var21_14 = var19_11;
                        try {
                            try {
                                object = _8l.f("\u00da", (Object)((Object)this), -1511817945479165940L, (long)l3);
                                if (!bl) break block9;
                                if (object != false) {
                                }
                                break block10;
                            }
                            catch (MatchException matchException) {
                                throw _8l.a(matchException);
                            }
                            Object[] objectArray4 = new Object[7];
                            objectArray4[6] = (int)_8l.d("y", 19670, (long)(0x1C842393425CBE9EL ^ l3));
                            objectArray4[5] = (int)_8l.d("y", 19670, (long)(0x1C842393425CBE9EL ^ l3));
                            objectArray4[4] = (int)var21_14;
                            objectArray4[3] = (int)var20_12;
                            objectArray4[2] = (double)callSite;
                            objectArray4[1] = l5;
                            objectArray4[0] = (double)callSite2;
                            _8l.f("\u00db", (Object)((Object)this), (Object)objectArray4, -1506030644893261854L, (long)l3);
                            return true;
                        }
                        catch (MatchException matchException) {
                            throw _8l.a(matchException);
                        }
                    }
                    object = _8l.f("\u00da", (Object)((Object)this), -1511340037812859963L, (long)l3);
                }
                try {
                    try {
                        if (!bl) break block11;
                        if (object == false) break block12;
                    }
                    catch (MatchException matchException) {
                        throw _8l.a(matchException);
                    }
                    Object[] objectArray = new Object[4];
                    objectArray[3] = (int)_8l.d("y", 19670, (long)(0x1C842393425CBE9EL ^ l3));
                    objectArray[2] = l2;
                    objectArray[1] = (int)var21_14;
                    objectArray[0] = (double)callSite;
                    _8l.f("\u00db", (Object)((Object)this), (Object)objectArray, -1505487768713344316L, (long)l3);
                    return true;
                }
                catch (MatchException matchException) {
                    throw _8l.a(matchException);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    private void cfr_renamed_1(Object[] objectArray) {
        double d = (Double)objectArray[0];
        long l2 = (Long)objectArray[1];
        double d2 = (Double)objectArray[2];
        int n = (Integer)objectArray[3];
        int n2 = (Integer)objectArray[4];
        int n3 = (Integer)objectArray[5];
        int n4 = (Integer)objectArray[6];
        l2 = b ^ l2;
        _8l.f("q", (Object)((Object)this), (double)_8l.f("\u00e6", (double)((d - (double)n) / (double)n3), 0.0, 1.0, 3271313636664156798L, (long)l2), 3278313980030773100L, (long)l2);
        _8l.f("q", (Object)((Object)this), (double)_8l.f("\u00e6", (double)(1.0 - (d2 - (double)n2) / (double)n4), 0.0, 1.0, 3271313636664156798L, (long)l2), 3277661920742881692L, (long)l2);
    }

    private void void_9(Object[] objectArray) {
        double d = (Double)objectArray[0];
        int n = (Integer)objectArray[1];
        long l2 = (Long)objectArray[2];
        int n2 = (Integer)objectArray[3];
        l2 = b ^ l2;
        _8l.f("q", (Object)((Object)this), (double)_8l.f("\u00e6", (double)((d - (double)n) / (double)n2 * 360.0), 0.0, 359.99, -2233489927694782951L, (long)l2), -2224870239662939471L, (long)l2);
    }

    public boolean method_25404(class_11908 class_119082) {
        Object object;
        block11: {
            CallSite callSite;
            long l2;
            long l3;
            block9: {
                boolean bl;
                block10: {
                    l3 = b ^ 0x5CE440D62729L;
                    l2 = l3 ^ 0x2CD7BD4AED7CL;
                    bl = _02.cfr_renamed_15();
                    try {
                        try {
                            object = _8l.f("\u00db", (Object)class_119082, 5410602668684521872L, (long)l3);
                            callSite = _8l.d("y", 32189, (long)(0x60593CDD39A6AFF3L ^ l3));
                            if (!bl) break block9;
                            if (object != callSite) break block10;
                        }
                        catch (MatchException matchException) {
                            throw _8l.a(matchException);
                        }
                        _8l.f("\u00db", (Object)_8l.f("\u00a4", 5410196441187148275L, (long)l3), (Object)_8l.f("\u00da", (Object)((Object)this), 5406718778463552851L, (long)l3), 5408077872248228619L, (long)l3);
                        return true;
                    }
                    catch (MatchException matchException) {
                        throw _8l.a(matchException);
                    }
                }
                try {
                    object = _8l.f("\u00db", (Object)class_119082, 5410602668684521872L, (long)l3);
                    if (!bl) break block11;
                    callSite = _8l.d("y", 9259, (long)(0x76AE32506A98766CL ^ l3));
                }
                catch (MatchException matchException) {
                    throw _8l.a(matchException);
                }
            }
            try {
                if (object == callSite) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l2;
                    _8l.f("\u00db", (Object)_8l.f("\u00da", (Object)((Object)this), 5410790898469632314L, (long)l3), (Object)_8l.f("\u00db", (Object)((Object)this), (Object)objectArray, 5409795935145406878L, (long)l3), 5408631127397573212L, (long)l3);
                    _8l.f("\u00db", (Object)_8l.f("\u00a4", 5410196441187148275L, (long)l3), (Object)_8l.f("\u00da", (Object)((Object)this), 5406718778463552851L, (long)l3), 5408077872248228619L, (long)l3);
                    return true;
                }
            }
            catch (MatchException matchException) {
                throw _8l.a(matchException);
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        _8l.b = dev.krypton.l.a((long)3291525576559163932L, (long)7097540832517631316L, MethodHandles.lookup().lookupClass()).a(55497521836749L);
                        var20 = _8l.b ^ 5357141563646L;
                        var22_1 = var20 ^ 48668067903115L;
                        _8l.q = new Object[94];
                        _8l.r = new String[94];
                        _8l.b();
                        _8l.h = new HashMap<K, V>(13);
                        var11_2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var12_3 = 1; var12_3 < 8; ++var12_3) {
                            v2 = v2;
                            v2[var12_3] = (byte)(var20 << var12_3 * 8 >>> 56);
                        }
                        var11_2.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var18_4 = new String[7];
                        var16_5 = 0;
                        var15_6 = "\u00d0\u0014'\tn,-\u00c2\u00fa\f\u00bfU\u009b\u00b9\u00bd\u00e8D\u008dl\u00a9]\u0011.X\u00a6B\u0013\u0093\u00bb\u00a7]\u009e\u0010\u0084\u0089\u0006x*>x\u00ef\u000e\u008b\u001e\u008c\u00f3t\u00b9\u0093\u0010\u00ba\u00b9\u00ca*3\u00b8$\u00bc\u00e4\u00148\u00e8\u00db\u00aaF\u009c\u0010\u00e7\u00ffW\u0081\u00b0\u008d4\u0093\u00a2!\u0017OK\u00aa\u008eX \u00eb\u00d2\u00d2\u008d\u0015\u00bd<\n\u007f\u00fe\u00d6\u00dc9e\u0017\u00a9\u001a\u00e1\u009d\u00ac\u0004LO\u008d\u00d22\u00b7>\u001c\u00d1v\u00f2";
                        var17_7 = "\u00d0\u0014'\tn,-\u00c2\u00fa\f\u00bfU\u009b\u00b9\u00bd\u00e8D\u008dl\u00a9]\u0011.X\u00a6B\u0013\u0093\u00bb\u00a7]\u009e\u0010\u0084\u0089\u0006x*>x\u00ef\u000e\u008b\u001e\u008c\u00f3t\u00b9\u0093\u0010\u00ba\u00b9\u00ca*3\u00b8$\u00bc\u00e4\u00148\u00e8\u00db\u00aaF\u009c\u0010\u00e7\u00ffW\u0081\u00b0\u008d4\u0093\u00a2!\u0017OK\u00aa\u008eX \u00eb\u00d2\u00d2\u008d\u0015\u00bd<\n\u007f\u00fe\u00d6\u00dc9e\u0017\u00a9\u001a\u00e1\u009d\u00ac\u0004LO\u008d\u00d22\u00b7>\u001c\u00d1v\u00f2".length();
                        var14_8 = 32;
                        var13_9 = -1;
lbl25:
                        // 2 sources

                        while (true) {
                            v3 = ++var13_9;
                            v4 = var15_6.substring(v3, v3 + var14_8);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl30:
                        // 1 sources

                        while (true) {
                            var18_4[var16_5++] = _8l.b(var19_10).intern();
                            if ((var13_9 += var14_8) < var17_7) {
                                var14_8 = var15_6.charAt(var13_9);
                                ** continue;
                            }
                            var15_6 = "P\u001a\u00f7*I\u008f\u009a\u00e4\u00c7+SB1\u00f5v\u0018\u0010D\u00fb\u00ec\u0015\u00b1k_\\\u00b0e\u00e4\u00d0C\u001f69";
                            var17_7 = "P\u001a\u00f7*I\u008f\u009a\u00e4\u00c7+SB1\u00f5v\u0018\u0010D\u00fb\u00ec\u0015\u00b1k_\\\u00b0e\u00e4\u00d0C\u001f69".length();
                            var14_8 = 16;
                            var13_9 = -1;
lbl39:
                            // 2 sources

                            while (true) {
                                v6 = ++var13_9;
                                v4 = var15_6.substring(v6, v6 + var14_8);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl44:
                        // 1 sources

                        while (true) {
                            var18_4[var16_5++] = _8l.b(var19_10).intern();
                            if ((var13_9 += var14_8) < var17_7) {
                                var14_8 = var15_6.charAt(var13_9);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_10 = var11_2.doFinal(v4.getBytes("ISO-8859-1"));
                    switch (v5) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl56:
                        // 1 sources

                        ** continue;
                    }
                }
                _8l.f = var18_4;
                _8l.g = new String[7];
                _8l.n = new HashMap<K, V>(13);
                var0_11 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var1_12 = 1; var1_12 < 8; ++var1_12) {
                    v9 = v9;
                    v9[var1_12] = (byte)(var20 << var1_12 * 8 >>> 56);
                }
                var0_11.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_13 = new long[36];
                var3_14 = 0;
                var4_15 = "\u00bd)\u00a3GX*\u0003n\u0094b\u00c3\u00939w\u00f9\u0016\u0004J\u009a\u00a3\u00d5,\u000f\u00e7IR\u0014>\u00dd\u00be\u00f4\u00f7\u00d5\u00b3\u008d3\u00df\u0090\u0012\u00aaD[\u0018Y\u00c7_\u008d\u0001^^\u0099\u0017\u00b2\u00dcN\u00ee\u00c1I\u00ad\u00d05\u009a%'\u00f4\u00b8}{\u0004\n\u0013\u00f7A\u00ca\u00da\u0004r\u00c0 \u00d6\u0010M\u0094wn&\u00d5\u008a\u00dd\u00bb\u009f|UW\u00b2\u00df}..(9z\u0003\u00a0\u00a3\u008b\u00f4\u0018\u009bP8\\\u00b8y\u00a7\u009en\u00d4\u00eey\u0098\u008do\nx8\u0019\u00a3*!\u00b98\u00d2\u009a\u0012}\u00a2\u00c5\u007f\u0018\u00c9\u00afR\u00c7\u001e\u00a6\u00cd;\u00e0\u0003u\u00160\u0019$\f\u00df\u00f2\u0088+^\u00ef\u008d1\u00cf\u0094\u0090$[\u0011\u0096q\u0019\u0000j\u0090\u00b2$\u0096\u0080$L\u009b\u00dc\u00f6\u0017\u00bb\\\u0019\u0082\u00aa\u0006\u00de\u00e0D\u00a2\u00b6\u00b59\u007f&no\u00ec&\u0087Ar\u00e2/MS\u00e6[d\u00c2Mb\u00b3\u00ea\u007f\u0096Rg6\u009e(\u00e4\u0011\u000bSi\u009a\u00e9_\u0005a\u0082$o\u00db\u00e8\u00ac\\\u00ac\u0012G\u001c\u0012[\u0087\u00cc8\u00a5\u00d7r\u00d7[)\u0098\u007fC\u0011:\u00f4\u00ddh\u00e8\u009c\u00c9\u00fbn";
                var5_16 = "\u00bd)\u00a3GX*\u0003n\u0094b\u00c3\u00939w\u00f9\u0016\u0004J\u009a\u00a3\u00d5,\u000f\u00e7IR\u0014>\u00dd\u00be\u00f4\u00f7\u00d5\u00b3\u008d3\u00df\u0090\u0012\u00aaD[\u0018Y\u00c7_\u008d\u0001^^\u0099\u0017\u00b2\u00dcN\u00ee\u00c1I\u00ad\u00d05\u009a%'\u00f4\u00b8}{\u0004\n\u0013\u00f7A\u00ca\u00da\u0004r\u00c0 \u00d6\u0010M\u0094wn&\u00d5\u008a\u00dd\u00bb\u009f|UW\u00b2\u00df}..(9z\u0003\u00a0\u00a3\u008b\u00f4\u0018\u009bP8\\\u00b8y\u00a7\u009en\u00d4\u00eey\u0098\u008do\nx8\u0019\u00a3*!\u00b98\u00d2\u009a\u0012}\u00a2\u00c5\u007f\u0018\u00c9\u00afR\u00c7\u001e\u00a6\u00cd;\u00e0\u0003u\u00160\u0019$\f\u00df\u00f2\u0088+^\u00ef\u008d1\u00cf\u0094\u0090$[\u0011\u0096q\u0019\u0000j\u0090\u00b2$\u0096\u0080$L\u009b\u00dc\u00f6\u0017\u00bb\\\u0019\u0082\u00aa\u0006\u00de\u00e0D\u00a2\u00b6\u00b59\u007f&no\u00ec&\u0087Ar\u00e2/MS\u00e6[d\u00c2Mb\u00b3\u00ea\u007f\u0096Rg6\u009e(\u00e4\u0011\u000bSi\u009a\u00e9_\u0005a\u0082$o\u00db\u00e8\u00ac\\\u00ac\u0012G\u001c\u0012[\u0087\u00cc8\u00a5\u00d7r\u00d7[)\u0098\u007fC\u0011:\u00f4\u00ddh\u00e8\u009c\u00c9\u00fbn".length();
                var2_17 = 0;
                while (true) {
                    var7_18 = var4_15.substring(var2_17, var2_17 += 8).getBytes("ISO-8859-1");
                    v10 = var6_13;
                    v11 = var3_14++;
                    v12 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl83:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_17 < var5_16) ** continue;
                    var4_15 = "\u007f \u000f\u00e2\u00de\u00c6l\u00dbFT\u00e61\u00af\u0002\u00edc";
                    var5_16 = "\u007f \u000f\u00e2\u00de\u00c6l\u00dbFT\u00e61\u00af\u0002\u00edc".length();
                    var2_17 = 0;
                    while (true) {
                        var7_18 = var4_15.substring(var2_17, var2_17 += 8).getBytes("ISO-8859-1");
                        v10 = var6_13;
                        v11 = var3_14++;
                        v12 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl96:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_17 < var5_16) ** continue;
                    break block21;
                    break;
                }
            }
            var8_19 = v12;
            var10_20 = var0_11.doFinal(new byte[]{(byte)(var8_19 >>> 56), (byte)(var8_19 >>> 48), (byte)(var8_19 >>> 40), (byte)(var8_19 >>> 32), (byte)(var8_19 >>> 24), (byte)(var8_19 >>> 16), (byte)(var8_19 >>> 8), (byte)var8_19});
            v14 = ((long)var10_20[0] & 255L) << 56 | ((long)var10_20[1] & 255L) << 48 | ((long)var10_20[2] & 255L) << 40 | ((long)var10_20[3] & 255L) << 32 | ((long)var10_20[4] & 255L) << 24 | ((long)var10_20[5] & 255L) << 16 | ((long)var10_20[6] & 255L) << 8 | (long)var10_20[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl109:
                // 1 sources

                ** continue;
            }
        }
        _8l.l = var6_13;
        _8l.m = new Integer[36];
        _8l.cfr_renamed_18 = new _8B((int)_8l.d("y", (int)27760, (long)(5392792648260256240L ^ var20)), (int)_8l.d("y", (int)19418, (long)(8969942673873446468L ^ var20)), var22_1, (int)_8l.d("y", (int)19418, (long)(8969942673873446468L ^ var20)), (int)_8l.d("y", (int)12780, (long)(3717241370958552166L ^ var20)));
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static String b(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    private static String b(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x7AD5;
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
                throw new RuntimeException("dev/krypton/8l", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l2 >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l2 << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = f[n2].getBytes("ISO-8859-1");
            _8l.g[n2] = _8l.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _8l.b(n, l2);
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
            throw new RuntimeException("dev/krypton/8l" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int d(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x195A;
        if (m[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = l[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])_8l.n.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    _8l.n.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/8l", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _8l.m[n2] = n3;
        }
        return m[n2];
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _8l.d(n, l2);
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
            throw new RuntimeException("dev/krypton/8l" + " : " + string + " : " + methodType.toString(), exception);
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
            case 0 -> 30;
            case 1 -> 31;
            case 2 -> 6;
            case 3 -> 40;
            case 4 -> 61;
            case 5 -> 20;
            case 6 -> 48;
            case 7 -> 41;
            case 8 -> 59;
            case 9 -> 21;
            case 10 -> 12;
            case 11 -> 28;
            case 12 -> 15;
            case 13 -> 13;
            case 14 -> 39;
            case 15 -> 4;
            case 16 -> 52;
            case 17 -> 43;
            case 18 -> 45;
            case 19 -> 53;
            case 20 -> 50;
            case 21 -> 26;
            case 22 -> 37;
            case 23 -> 10;
            case 24 -> 9;
            case 25 -> 24;
            case 26 -> 47;
            case 27 -> 3;
            case 28 -> 11;
            case 29 -> 49;
            case 30 -> 36;
            case 31 -> 51;
            case 32 -> 18;
            case 33 -> 25;
            case 34 -> 23;
            case 35 -> 5;
            case 36 -> 63;
            case 37 -> 34;
            case 38 -> 60;
            case 39 -> 54;
            case 40 -> 42;
            case 41 -> 2;
            case 42 -> 0;
            case 43 -> 1;
            case 44 -> 7;
            case 45 -> 44;
            case 46 -> 14;
            case 47 -> 27;
            case 48 -> 33;
            case 49 -> 35;
            case 50 -> 57;
            case 51 -> 55;
            case 52 -> 46;
            case 53 -> 8;
            case 54 -> 29;
            case 55 -> 19;
            case 56 -> 16;
            case 57 -> 32;
            case 58 -> 17;
            case 59 -> 38;
            case 60 -> 56;
            case 61 -> 62;
            case 62 -> 22;
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
        _8l.r[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = q;
        q[0] = "\u000ebaGmW\u0005mp\b\u000eZ\u0010k";
        objectArray[1] = Integer.TYPE;
        _8l.r[1] = "java/lang/Integer";
        objectArray[2] = "y&<\n\u0000,d3>K\u0005p%\u0001";
        objectArray[3] = "\u0011\u00005vSbd >yB-\u0005.5rFwq";
        objectArray[4] = "\"`yj6j?u{+36~i";
        objectArray[5] = Double.TYPE;
        _8l.r[5] = "java/lang/Double";
        objectArray[6] = "^\u0012\u0011{e\u001f+2\u001attPJ<\u0011\u007fp\n>";
        objectArray[7] = "^M";
        objectArray[8] = "_3W\u0005\\Q*\u0013\\\nM\u001eK\u001dW\u0001ID?";
        objectArray[9] = Boolean.TYPE;
        _8l.r[9] = "java/lang/Boolean";
        objectArray[10] = "l\u001b9U!\u007f\u0019;2Z00x59Q4j\f";
        objectArray[11] = "5}";
        objectArray[12] = "\u0011Zx\u001aP=\fOz[UaM\b";
        objectArray[13] = "\u0002$-\\8Lw\u0004&S)\u0003\u0016\n-X-Yb";
        objectArray[14] = Void.TYPE;
        _8l.r[14] = "java/lang/Void";
        objectArray[15] = "$\u0010xX@\tQ0sWQF0>x\\U\u001cD";
        objectArray[16] = ".\u0011\u0018D\u000eZ[1\u0013K\u001f\u0015:?\u0018@\u001bON";
        objectArray[17] = "Z63?\u007f\u0003/\u001680nLN\u00183;j\u0016:";
        objectArray[18] = "$#";
        objectArray[19] = "\u0011\u0000O!K-d D.Zb\u0005.O%^8q";
        objectArray[20] = "-P\u0018p`\u0019-P\u000f,l\u00167\u001b\u000f2l\u00030jXm:";
        objectArray[21] = "3)6DQm-!,\u000b\u0019m7+4L\u0010vw\u000b/K\fm4-2";
        objectArray[22] = "80)Z)\rM\u0010\"U8B,\u001e)^<\u0018X";
        objectArray[23] = "Y\u000bu5P\"D\u001ewtU~\u0005\u000b";
        objectArray[24] = "\u0013%@u\u0004Jf\u0005Kz\u0015\u0005\u0007\u000b@q\u0011_s";
        objectArray[25] = "c/is9=\u0016\u000fb|(rw\u0001iw,(\u0003";
        objectArray[26] = "%4N#[\r.;_l:\u0003%0[6";
        objectArray[27] = "\u000e'\u007f.XS{\u0007t!I\u001c\u001a\t\u007f*MFn";
        objectArray[28] = "?@=PgMJ`6_v\u0002+n=TrX_";
        objectArray[29] = "$w\u0006\u001a_lQW\r\u0015N#0Y\u0006\u001eJyD";
        objectArray[30] = "1$a7M\"1$vkA-+ovuA8,\u001e$(\u0019{f";
        objectArray[31] = "\u00185>D\u001f4m\u00155K\u000e{\f\u001b>@\n!x";
        objectArray[32] = "G`\u0017#%#Zu\u0015b \u007f\u0011";
        objectArray[33] = "\u0014HS]\u001c|\u0014HD\u0001\u0010s\u000e\u0003D\u001f\u0010f\tr\u0014BA";
        objectArray[34] = "XZ\\4\u0012oXZKh\u001e`B\u0011Kv\u001euE`\u001b/L4";
        objectArray[35] = "{C\u0016vL!\u000ec\u001dy]nom\u0016rY4\u001b";
        objectArray[36] = "(\u001fL\u0011G$]?G\u001eVk<1L\u0015R1H";
        objectArray[37] = "\nzJ^\u0001h\u007fZAQ\u0010'\u001eTJZ\u0014}j";
        objectArray[38] = "L hDbO9\u0000cKs\u0000X\u000eh@wZ,";
        objectArray[39] = ">\r\rt(BK-\u0006{9\r*#\rp=W^";
        objectArray[40] = "\u001a\u0016\u0015\u001c\u0019mo6\u001e\u0013\b\"\u000e8\u0015\u0018\fxz";
        objectArray[41] = ">.f54KK\u000em:%\u0004*\u0000f1!^^";
        objectArray[42] = "}8f\u001d\u0016\u0002}8qA\u001a\rgsq_\u001a\u0018`\u0002#\u0002B[+";
        objectArray[43] = "]In&\u0007q\u001b\u001a,,k*\u0001w|kPa\u0006\u000eze\u0014!";
        objectArray[44] = "\u000fYIjH\b\u000b\u001fY\u0012B\f\u001cbG*\u0019]\\\u000bIi@e\u0013Z\u0006*\u0017\f\u001d\u0019_\u0012X]RZ\b{V\u001e\u000bb";
        objectArray[45] = "if)9e\u0015`jnf\f\u0014bj01`&6+kk4q3*1:=N})=:\fM3w<g3\u00030{<V0Mnzai~NbzPj0\u0010c'o$3\u001cc\u0016";
        objectArray[46] = "x&Idx\u0001>u\u000bn\u0014QCcTqr\u001a{}\nx/`< \b.$\t2cQ\u0016";
        objectArray[47] = "|\u001a`Jx.-\u001ctG\u001coRq'\u0014 o.\u0014p\u001f&+";
        objectArray[48] = "XtI3*(\u000f\u007fOw\u0017radM7/}\bj\u000en";
        objectArray[49] = "d\u0000\u001f\u000bh'\"S]\u0001\u0004\u007f_U\u0018G`:bQY\u001d4";
        objectArray[50] = "u0\u0014\u001eoH3cV\u0014\u0003\u0015Nu\t\u000beSvkW\u00028)\u007ft\u0017\u00002Gvq\u0005\u001c\u0003";
        objectArray[51] = "\u0001ke&h#G8',\u0004\u007f:k{h=yFk\"m;";
        objectArray[52] = "@tF\n^DGyR\n!TF{E\u0014]=L+D\u0007@\r\u0014hI\u001d!\fWlD]O\u0005R~Xl";
        objectArray[53] = "\u001e\")\u001fo'Xqk\u0015\u0003x%g4\ne<\u001dyj\u00038FZ$hU3/Tg1m";
        objectArray[54] = "[{C{\u0005/_=S\u0003\u0003(C@\u000e?\u000b.\t\u007f@<\u0007.8|\u000eb\u0006s\u00072\rn\u0006B";
        objectArray[55] = "?\u0017x\"#m5\u0006q;]3P}`):ouE~w32\u000fLa718aEd%-\t";
        objectArray[56] = "d`n\u00187X3kh\\\n\u0005]t0ElGejnL1=m43_{S<0>S\n";
        objectArray[57] = "Pd7o`,\u0001b#b\u0004i?pq`<gV~29";
        objectArray[58] = "j(T*%$,{\u0016 I~Q(Jdp~-(\u0013av";
        objectArray[59] = "!: \f;?v1&H\u0006f]Uc\u000e8b(<mMa";
        objectArray[60] = "b#\u0000h\u000b\u0016:\"]`d\u0018i5Pl\b*=t\b4d\u0010;rAk\u001d\u001656\u0001\u000bU\u0007x%\u0001e\\\u0002j90";
        objectArray[61] = "J\u0010?IVV@\u00016P(\r\u0019z'BOT\u0000B9\u001cF\tzK&\\D\u0003\u0014B#NX2";
        objectArray[62] = "ez!i'!#)ccKz=Db'*,o{,$&,";
        objectArray[63] = "\nr8\u000bHp[t,\u0006,6eb$]Jq]|zT\u0017\u000b\u001a!x\u0002\u001cb\u0014b!:";
        objectArray[64] = "\u0005\bf~\u0016AC[$tz\u001b>M{k\u001cZ\u0006S%bA \u000fLe`KN\u0006Iw|z";
        objectArray[65] = "\u00138!\u0013+\u0015Ukc\u0019GD(?1]}IMh:[9";
        objectArray[66] = "M!\u0011lca\u000brSf\u000f8vt\u0016 k|KpWz?";
        objectArray[67] = "tvcXup~gjA\u000b(DgbVmn|y<_0\u0014x a]:+6#m]\u000b";
        objectArray[68] = "x=UJ*\u001c>n\u0017@FACxH_ \u0007{f\u0016V}}zl\u0016\u0002{\u0018-g\u0010FF";
        objectArray[69] = ",\u0017~\u0011<Z Uk\u0000_@(\u000ea7c\u0014~[\u0019\\cJ#Z&\u0012`F#k";
        objectArray[70] = "K\tQY\u0000\f\rZ\u0013SlPpLLL\n\u0017HR\u0012EWmAMRG]\u0003HH@[l";
        objectArray[71] = "v~-\u0007b'0-o\r\u000e|(@nIo*|\u007f Jc*";
        objectArray[72] = "[GUA~^\u001d\u0014\u0017K\u0012\u0005\u000fy\u0013\\.\u0005]\u001cDW(A";
        objectArray[73] = "P@f\u0017\"QZQo\u000e\\\u000e+*~\u001c;S\u001a\u0012`B2\u000e`\u001b\u007f\u00020\u0004\u000e\u0012z\u0010,5";
        objectArray[74] = "r$\u001a3gf4wX9\u000b?Ia\u0007&m}q\u007fY/0\u0007x`\u0019-:iqe\u000b1\u000b";
        objectArray[75] = ">\u001c(!b\u000b4\r!8\u001cUtv0*{\ttN.trT\u000eG14p^`N4&lo";
        objectArray[76] = "7\u0013i78cf\u0015}:\\\"X\u0003ua:b`\u001d+hg\u0018f\u0019+?gdf@.9\\";
        objectArray[77] = "On\u0018o^*\t=Ze2zt+\u0005zT1L5[s\tKE*\u001bq\u0003%L/\tm2";
        objectArray[78] = "-B\u0014g\f<k\u0011Vm`l\u0016@Wt\fl)\u000eTx\f";
        objectArray[79] = "ibWB|x8dCO\u0018?\u0006v\u0011M 3oxR\u0014";
        objectArray[80] = "va\u001fz~\u0006rk\u0004?D\u0004gx\u0018%(658Bxtau<Fzt\b{\u007f\u001fB";
        objectArray[81] = "3hy\u0016K\u0014bnm\u001b/_\\xe@I\u0015df;I\u0014omy{K\u001e\u0001d|iW/";
        objectArray[82] = "y=Q)9X?n\u0013#U\u0003=\u0003C?;_=zD2/_";
        objectArray[83] = "\u0000yp\u001b*KQ\u007fd\u0016N\roilM(JWw2Du0V}2\u0010sU\u0001v4TN";
        objectArray[84] = "(*\u001cZ\u0000@\u007f!\u001a\u001e=\u0018\u0011>B\u0007[_) \u001c\u000e\u0006%(*\u001cZ\u0000@\u007f!\u001a\u001e=";
        objectArray[85] = "lO\u001d\bxq;D\u001bLE%\u0012 ZP\"r/\u0018D\u000e+/U_\u0019\f}$<QZUE";
        objectArray[86] = "\u0018\u0018d>Z\u0007O\u0013bzgS!\f:c\u0001\u0018\u0019\u0012dj\\b\u0018\u0018d>Z\u0007O\u0013bzg";
        objectArray[87] = "2Dy\"-\u0014t\u0017;(AO0z:l \u00198Eto,\u0019";
        objectArray[88] = "CU_09b\u0014^Yt\u0004<zE[4<7\u0013K\u0018m";
        objectArray[89] = "({eOiVy}qB\r\u001dGky\u0019kW\u007fu'\u00106-8(%F=D6k|~";
        objectArray[90] = "\u0014\u007fZS?\u0001\u00009V\u0001\\A*\u0007][l\u001b\u001el\u0005Z1\u0013";
        objectArray[91] = "\u0018\u00079J\u00163\u0014E,[u)\u001c\u001e&lI}JJ^\u0007I#\u0017JaIJ/\u0017{";
        objectArray[92] = "zm\u0003v\u0002U-f\u00052?\u0000C}\u0007r\u0007\u0000*sD+";
        Object[] objectArray2 = objectArray;
        objectArray[93] = "Pd\u0016o>[Zu\u001fv@\u000f`u\u0017a&EXkIh{?\\2\u0014jq\u0000\u00121\u0018j@";
    }

    private static Class f(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _8l.e(l2, l3);
            object = q[n];
            try {
                if (!(object instanceof String)) break block2;
                _8l.q[n] = clazz = Class.forName(r[n]);
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
        Field field = _8l.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = _8l.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field g(long l2, long l3) {
        int n = _8l.e(l2, l3);
        Object object = q[n];
        if (object instanceof String) {
            String string = r[n];
            int n2 = string.indexOf(8);
            Class clazz = _8l.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _8l.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _8l.c(clazz3, string2, clazz2)) != null) {
                    _8l.q[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = _8l.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        _8l.q[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _8l.f(1837588507182970L, 0L);
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
            for (int i = 0; i < n; ++i) {
                if (classArray2[i] != classArray[i]) continue block0;
            }
            return method;
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _8l.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = _8l.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method h(long l2, long l3) {
        int n = _8l.e(l2, l3);
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
                clazz3 = _8l.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                for (int i = 0; i < n5; ++i) {
                    int n7 = string2.indexOf(8, n6);
                    clazz2 = _8l.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _8l.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _8l.q[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _8l.f(1837588507182970L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = _8l.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _8l.q[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _8l.f(1837588507182970L, 0L);
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
            if (c == '\u00da' || c == 'q' || c == '\u00a4' || c == '\u00e4') {
                field = _8l.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00da' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'q' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00a4' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _8l.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00db' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e6' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _8l.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8l" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_8l.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_8l.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_8l.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

