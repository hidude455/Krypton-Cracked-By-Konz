/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.krypton.02
 *  dev.krypton.4w
 *  dev.krypton.8B
 *  dev.krypton.9Z
 *  dev.krypton.l
 *  java.lang.MatchException
 *  net.minecraft.class_11908
 *  net.minecraft.class_11909
 *  net.minecraft.class_2561
 *  net.minecraft.class_332
 *  net.minecraft.class_437
 */
package dev.krypton;

import dev.krypton._02;
import dev.krypton._4w;
import dev.krypton._8B;
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
import java.util.function.Consumer;
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

public class _0b
extends class_437
implements _9Z {
    private static final _8B cfr_renamed_0;
    private final String cfr_renamed_1;
    private final _8B cfr_renamed_2;
    private final Consumer cfr_renamed_3;
    private final class_437 cfr_renamed_4;
    private final int cfr_renamed_5;
    private final int cfr_renamed_6;
    private final int cfr_renamed_7;
    private final int cfr_renamed_8;
    private final int cfr_renamed_9;
    private final int[] cfr_renamed_10;
    private boolean cfr_renamed_11;
    private boolean cfr_renamed_12;
    private double cfr_renamed_13;
    private double cfr_renamed_14;
    private double cfr_renamed_15;
    private double cfr_renamed_16;
    private int[] cfr_renamed_17;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static final Object[] h;
    private static final String[] i;

    public _0b(String string, _8B b, Consumer consumer, class_437 class_4372, long l) {
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x15CEE31BC112L;
        long l4 = l2 ^ 0x38AB70CA8CE3L;
        int n = (int)(l4 >>> 48);
        int n2 = (int)(l4 << 16 >>> 32);
        int n3 = (int)(l4 << 48 >>> 48);
        long l5 = l2 ^ 0x791C8FBCE961L;
        long l6 = l2 ^ 0x155062DE693FL;
        super((class_2561)class_2561.method_43473());
        this.cfr_renamed_5 = (int)_0b.b("i", 5026, (long)(0x338D5F719DA5B128L ^ l));
        this.cfr_renamed_6 = (int)_0b.b("i", 8378, (long)(0x61D9DEF0F7E8822EL ^ l));
        this.cfr_renamed_7 = (int)_0b.b("i", 5026, (long)(0x338D5F719DA5B128L ^ l));
        this.cfr_renamed_8 = (int)_0b.b("i", 31946, (long)(0xC265053292B5E50L ^ l));
        this.cfr_renamed_9 = (int)_0b.b("i", 14715, (long)(0x3636A7464D711BECL ^ l));
        boolean bl = _02.cfr_renamed_2();
        _0b.c("\u00a2", (Object)((Object)this), (boolean)_0b.b("i", 27475, (long)(0x4B8F44905D5CC9C8L ^ l)), 9101713301583166639L, (long)l);
        boolean bl2 = bl;
        _0b.c("\u00a2", (Object)((Object)this), (boolean)_0b.b("i", 27475, (long)(0x4B8F44905D5CC9C8L ^ l)), 9099132774857615295L, (long)l);
        _0b.c("\u00a2", (Object)((Object)this), -1.0, 9099462104328118077L, (long)l);
        this.cfr_renamed_1 = string;
        Object[] objectArray = new Object[3];
        objectArray[2] = (int)((short)n3);
        objectArray[1] = n2;
        objectArray[0] = (int)((short)n);
        this.cfr_renamed_2 = _0b.c("U", (Object)b, (Object)objectArray, 9100954536291453061L, (long)l);
        this.cfr_renamed_3 = consumer;
        this.cfr_renamed_4 = class_4372;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = null;
        objectArray2[3] = (int)_0b.c("W", (Object)b, 9101413707571097878L, (long)l);
        objectArray2[2] = (int)_0b.c("W", (Object)b, 9105079126572175725L, (long)l);
        objectArray2[1] = (int)_0b.c("W", (Object)b, 9098434079825503805L, (long)l);
        objectArray2[0] = l3;
        CallSite callSite = _0b.c("\u00c1", (Object)objectArray2, 9098934651200268734L, (long)l);
        _0b.c("\u00a2", (Object)((Object)this), (double)((double)(callSite[0] * 360.0f)), 9099255847249076583L, (long)l);
        _0b.c("\u00a2", (Object)((Object)this), (double)((double)callSite[1]), 9100868500558043083L, (long)l);
        _0b.c("\u00a2", (Object)((Object)this), (double)((double)callSite[2]), 9098373535489192686L, (long)l);
        Object object = _0b.b("i", 5855, (long)(0x5C45E147AAA3344CL ^ l));
        this.cfr_renamed_10 = new int[object];
        for (int i = 0; i < object; ++i) {
            double d = (double)i / (double)object * 360.0;
            Object[] objectArray3 = new Object[4];
            objectArray3[3] = l6;
            objectArray3[2] = 1.0;
            objectArray3[1] = 1.0;
            objectArray3[0] = d;
            Object[] objectArray4 = new Object[1];
            objectArray4[0] = l5;
            _0b.c("W", (Object)((Object)this), 9098263034619811828L, (long)l)[i] = _0b.c("U", (Object)_0b.c("\u00c1", (Object)objectArray3, 9100729474418792326L, (long)l), (Object)objectArray4, 9101099786889167877L, (long)l);
            if (!bl2) continue;
        }
    }

    private _8B dev_krypton_8B_0(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x75F9BC60C551L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l2;
        objectArray2[2] = (double)_0b.c("W", (Object)((Object)this), -3301831014537798016L, (long)l);
        objectArray2[1] = (double)_0b.c("W", (Object)((Object)this), -3304895527661634651L, (long)l);
        objectArray2[0] = (double)_0b.c("W", (Object)((Object)this), -3302989750359306999L, (long)l);
        CallSite callSite = _0b.c("\u00c1", (Object)objectArray2, -3305033457128277016L, (long)l);
        _0b.c("\u00a2", (Object)callSite, (int)_0b.b("i", 21084, (long)(0x6E487F3058FCDC99L ^ l)), -3305221848222371660L, (long)l);
        return callSite;
    }

    /*
     * Exception decompiling
     */
    private void cfr_renamed_1(Object[] var1_1) {
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

    public void method_25394(class_332 class_3322, int n, int n2, float f) {
        Object object;
        int n3;
        int n4;
        int n5;
        _8B b;
        _8B b2;
        double d;
        double d2;
        double d3;
        double d4;
        long l;
        long l2 = l = a ^ 0x476B12F4E20CL;
        long l3 = l2 ^ 0x115E6410BB5L;
        long l4 = l2 ^ 0x68568AE184D7L;
        long l5 = l2 ^ 0x6DDEAB18D949L;
        long l6 = l2 ^ 0x74ED8C4B3037L;
        long l7 = l2 ^ 0x4B02CDE83C8DL;
        long l8 = l2 ^ 0x769FC75DE735L;
        long l9 = l2 ^ 0x4FBFFB6A26FEL;
        long l10 = l2 ^ 0x6257289A9B7FL;
        long l11 = l2 ^ 0x22D46F4AE202L;
        long l12 = l2 ^ 0x736229C871EAL;
        long l13 = l2 ^ 0x12C443572D6L;
        long l14 = l2 ^ 0x3B202A3C83F1L;
        long l15 = l2 ^ 0x2A9D62EB8B7FL;
        long l16 = l2 ^ 0x2E062A271D04L;
        long l17 = l2 ^ 0x2F35521EA92FL;
        long l18 = l2 ^ 0x29C280A8AB6FL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        _0b.c("\u00c1", (Object)objectArray, 7257863938384720303L, (long)l);
        n *= _0b.c("U", (Object)_0b.c("U", (Object)_0b.c("c", 7258510716774882265L, (long)l), 7258005901883955265L, (long)l), 7258766364074042741L, (long)l);
        boolean bl = _02.cfr_renamed_15();
        n2 *= _0b.c("U", (Object)_0b.c("U", (Object)_0b.c("c", 7258510716774882265L, (long)l), 7258005901883955265L, (long)l), 7258766364074042741L, (long)l);
        try {
            _8B b3;
            super.method_25394(class_3322, n, n2, f);
            d4 = 0.0;
            d3 = 0.0;
            d2 = (double)_0b.c("U", (Object)_0b.c("U", (Object)_0b.c("c", 7258510716774882265L, (long)l), 7258005901883955265L, (long)l), 7255667221488974823L, (long)l);
            d = (double)_0b.c("U", (Object)_0b.c("U", (Object)_0b.c("c", 7258510716774882265L, (long)l), 7258005901883955265L, (long)l), 7255724532725997805L, (long)l);
            b2 = b3;
            b = b3;
            n5 = 0;
            n4 = 0;
            n3 = 0;
            object = _0b.c("U", (Object)_0b.c("c", 7257784950183602582L, (long)l), (long)l17, 7255467607506388051L, (long)l) != false ? _0b.b("i", 16787, (long)(0x3DA2F11B651F9CBL ^ l)) : 0;
        }
        catch (MatchException matchException) {
            throw _0b.a(matchException);
        }
        b2(n5, n4, l9, n3, object);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l7;
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = (int)_0b.c("U", (Object)b, (Object)objectArray2, 7257390747489741773L, (long)l);
        objectArray3[4] = l3;
        objectArray3[3] = d;
        objectArray3[2] = d2;
        objectArray3[1] = d3;
        objectArray3[0] = d4;
        _0b.c("\u00c1", (Object)objectArray3, 7254866540997744079L, (long)l);
        CallSite callSite = _0b.c("U", (Object)_0b.c("U", (Object)_0b.c("c", 7258510716774882265L, (long)l), 7258005901883955265L, (long)l), 7255667221488974823L, (long)l);
        CallSite callSite2 = _0b.c("U", (Object)_0b.c("U", (Object)_0b.c("c", 7258510716774882265L, (long)l), 7258005901883955265L, (long)l), 7255724532725997805L, (long)l);
        CallSite callSite3 = _0b.b("i", 12792, (long)(0x47BA02B581A189A7L ^ l));
        CallSite callSite4 = _0b.b("i", 9249, (long)(0x48C259C6E8C59C45L ^ l));
        reference var44_27 = callSite3 * 2 + callSite4;
        reference var45_28 = var44_27 + _0b.b("i", 4849, (long)(0x7B0425B2323CAA80L ^ l));
        CallSite callSite5 = _0b.b("i", 13366, (long)(0x2308C733880F0C63L ^ l));
        CallSite callSite6 = _0b.c("\u00c1", (int)var45_28, (int)callSite5, 7254691736974622585L, (long)l);
        CallSite callSite7 = _0b.b("i", 9592, (long)(0x37741EC6367B9D02L ^ l));
        reference var49_32 = (callSite - callSite6) / 2;
        reference var50_33 = (callSite2 - callSite7) / 2;
        Object[] objectArray4 = new Object[14];
        objectArray4[13] = false;
        objectArray4[12] = 0.0;
        objectArray4[11] = l16;
        objectArray4[10] = _0b.c("c", 7256845166558875611L, (long)l);
        objectArray4[9] = _0b.c("c", 7256845166558875611L, (long)l);
        objectArray4[8] = new _8B((int)_0b.b("i", 10490, (long)(0x4B2DBB6B108F909AL ^ l)), (int)_0b.b("i", 15941, (long)(0x6A2A025AC1AC061EL ^ l)), l9, (int)_0b.b("i", 5549, (long)(0x6906E95CFCCCADD3L ^ l)), (int)_0b.b("i", 6851, (long)(0xD3ABEB60AEF229EL ^ l)));
        objectArray4[7] = 8.0;
        objectArray4[6] = 8.0;
        objectArray4[5] = 0.0;
        objectArray4[4] = 0.0;
        objectArray4[3] = (double)(var50_33 + callSite7);
        objectArray4[2] = (double)(var49_32 + callSite6);
        objectArray4[1] = (double)var50_33;
        objectArray4[0] = (double)var49_32;
        _0b.c("\u00c1", (Object)objectArray4, 7257621707924532523L, (long)l);
        Object[] objectArray5 = new Object[14];
        objectArray5[13] = false;
        objectArray5[12] = 0.0;
        objectArray5[11] = l16;
        objectArray5[10] = _0b.c("c", 7256845166558875611L, (long)l);
        objectArray5[9] = _0b.c("c", 7256845166558875611L, (long)l);
        objectArray5[8] = new _8B((int)_0b.b("i", 29448, (long)(0x290DED94A4DECB62L ^ l)), (int)_0b.b("i", 29448, (long)(0x290DED94A4DECB62L ^ l)), l9, (int)_0b.b("i", 3935, (long)(0x5EC856B6555E3727L ^ l)), (int)_0b.b("i", 22323, (long)(0x5D045B4F288C6F44L ^ l)));
        objectArray5[7] = 0.0;
        objectArray5[6] = 0.0;
        objectArray5[5] = 0.0;
        objectArray5[4] = 0.0;
        objectArray5[3] = (double)(var50_33 + _0b.b("i", 15941, (long)(0x6A2A025AC1AC061EL ^ l)));
        objectArray5[2] = (double)(var49_32 + callSite6);
        objectArray5[1] = (double)var50_33;
        objectArray5[0] = (double)var49_32;
        _0b.c("\u00c1", (Object)objectArray5, 7257621707924532523L, (long)l);
        Object[] objectArray6 = new Object[3];
        objectArray6[2] = 1;
        objectArray6[1] = (int)_0b.b("i", 22323, (long)(0x5D045B4F288C6F44L ^ l));
        objectArray6[0] = l14;
        Object[] objectArray7 = new Object[1];
        objectArray7[0] = l7;
        Object[] objectArray8 = new Object[6];
        objectArray8[5] = (int)_0b.c("U", (Object)_0b.c("\u00c1", (Object)objectArray6, 7255422764912365555L, (long)l), (Object)objectArray7, 7257390747489741773L, (long)l);
        objectArray8[4] = l3;
        objectArray8[3] = (double)(var50_33 + _0b.b("i", 3404, (long)(0x63886D12CAD43510L ^ l)));
        objectArray8[2] = (double)(var49_32 + callSite6);
        objectArray8[1] = (double)(var50_33 + _0b.b("i", 15941, (long)(0x6A2A025AC1AC061EL ^ l)));
        objectArray8[0] = (double)var49_32;
        _0b.c("\u00c1", (Object)objectArray8, 7254866540997744079L, (long)l);
        Object[] objectArray9 = new Object[1];
        objectArray9[0] = l12;
        Object[] objectArray10 = new Object[1];
        objectArray10[0] = l12;
        Object[] objectArray11 = new Object[2];
        objectArray11[1] = l10;
        objectArray11[0] = (String)((Object)_0b.a("a", 1689, (long)(0x658F8E0ECADA2453L ^ l))) + (String)((Object)_0b.c("U", (Object)_0b.c("W", (Object)((Object)this), 7256699555732865006L, (long)l), 7258206481001088536L, (long)l));
        Object[] objectArray12 = new Object[6];
        objectArray12[5] = false;
        objectArray12[4] = new _8B((int)_0b.b("i", 25510, (long)(0x3B25201296925BD2L ^ l)), (int)_0b.b("i", 8382, (long)(0x1781CA6F4BC118CCL ^ l)), l9, (int)_0b.b("i", 8382, (long)(0x1781CA6F4BC118CCL ^ l)), (int)_0b.b("i", 22323, (long)(0x5D045B4F288C6F44L ^ l)));
        objectArray12[3] = (double)(var50_33 + _0b.b("i", 1531, (long)(0x12449C6D8FDF3DA2L ^ l)));
        objectArray12[2] = (double)(var49_32 + callSite6 / 2) - _0b.c("U", (Object)_0b.c("\u00c1", (Object)objectArray10, 7256177596405853717L, (long)l), (Object)objectArray11, 7258708077741613734L, (long)l) / 2.0;
        objectArray12[1] = (String)((Object)_0b.a("a", 9621, (long)(0x210E5446BE71875CL ^ l))) + (String)((Object)_0b.c("U", (Object)_0b.c("W", (Object)((Object)this), 7256699555732865006L, (long)l), 7258206481001088536L, (long)l));
        objectArray12[0] = l8;
        _0b.c("U", (Object)_0b.c("\u00c1", (Object)objectArray9, 7256177596405853717L, (long)l), (Object)objectArray12, 7255311044140621160L, (long)l);
        reference var51_34 = var50_33 + _0b.b("i", 26663, (long)(0x1116D0C448BD5054L ^ l));
        reference var52_35 = var49_32 + _0b.b("i", 20750, (long)(0x200751DCB3EF695EL ^ l));
        reference var53_36 = var51_34;
        Object[] objectArray13 = new Object[1];
        objectArray13[0] = l4;
        _0b.c("U", (Object)((Object)this), (Object)objectArray13, 7254989701739671253L, (long)l);
        Object[] objectArray14 = new Object[5];
        objectArray14[4] = (int)_0b.b("i", 8378, (long)(0x61D9F9369CB298DBL ^ l));
        objectArray14[3] = (int)_0b.b("i", 28370, (long)(0x7A60C13ECDD256A4L ^ l));
        objectArray14[2] = (int)var53_36;
        objectArray14[1] = l15;
        objectArray14[0] = (int)var52_35;
        _0b.c("U", (Object)((Object)this), (Object)objectArray14, 7256528618797171301L, (long)l);
        reference var54_37 = var52_35 + _0b.b("i", 8378, (long)(0x61D9F9369CB298DBL ^ l)) + _0b.b("i", 23764, (long)(0x6886B622F35AE4A8L ^ l));
        reference var55_38 = var53_36;
        Object[] objectArray15 = new Object[5];
        objectArray15[4] = (int)_0b.b("i", 8378, (long)(0x61D9F9369CB298DBL ^ l));
        objectArray15[3] = (int)_0b.b("i", 5026, (long)(0x338D78B7F6FFABDDL ^ l));
        objectArray15[2] = (int)var55_38;
        objectArray15[1] = l5;
        objectArray15[0] = (int)var54_37;
        _0b.c("U", (Object)((Object)this), (Object)objectArray15, 7257289285581025104L, (long)l);
        reference var56_39 = var53_36 + _0b.b("i", 8378, (long)(0x61D9F9369CB298DBL ^ l)) + _0b.b("i", 31946, (long)(0xC267795427144A5L ^ l));
        reference var57_40 = (callSite6 - _0b.b("i", 29448, (long)(0x290DED94A4DECB62L ^ l)) - _0b.b("i", 31946, (long)(0xC267795427144A5L ^ l))) / 2;
        CallSite callSite8 = _0b.b("i", 15941, (long)(0x6A2A025AC1AC061EL ^ l));
        Object[] objectArray16 = new Object[14];
        objectArray16[13] = false;
        objectArray16[12] = 0.0;
        objectArray16[11] = l16;
        objectArray16[10] = _0b.c("c", 7256845166558875611L, (long)l);
        objectArray16[9] = _0b.c("c", 7256845166558875611L, (long)l);
        objectArray16[8] = new _8B((int)_0b.c("W", (Object)_0b.c("W", (Object)((Object)this), 7256706635843999364L, (long)l), 7255587421362109640L, (long)l), l18, (int)_0b.c("W", (Object)_0b.c("W", (Object)((Object)this), 7256706635843999364L, (long)l), 7254906473580497816L, (long)l), (int)_0b.c("W", (Object)_0b.c("W", (Object)((Object)this), 7256706635843999364L, (long)l), 7258553888498740195L, (long)l));
        objectArray16[7] = 4.0;
        objectArray16[6] = 4.0;
        objectArray16[5] = 4.0;
        objectArray16[4] = 4.0;
        objectArray16[3] = (double)(var56_39 + callSite8);
        objectArray16[2] = (double)(var52_35 + var57_40);
        objectArray16[1] = (double)var56_39;
        objectArray16[0] = (double)var52_35;
        _0b.c("\u00c1", (Object)objectArray16, 7257621707924532523L, (long)l);
        Object[] objectArray17 = new Object[1];
        objectArray17[0] = l12;
        Object[] objectArray18 = new Object[1];
        objectArray18[0] = l12;
        Object[] objectArray19 = new Object[2];
        objectArray19[1] = l10;
        objectArray19[0] = _0b.a("a", 25565, (long)(0x608F6BCF6694C111L ^ l));
        Object[] objectArray20 = new Object[6];
        objectArray20[5] = false;
        objectArray20[4] = new _8B((int)_0b.b("i", 27703, (long)(0x5B898087057C545AL ^ l)), (int)_0b.b("i", 22437, (long)(0x5B1BD0B64E8C6FD0L ^ l)), l9, (int)_0b.b("i", 22437, (long)(0x5B1BD0B64E8C6FD0L ^ l)), (int)_0b.b("i", 22323, (long)(0x5D045B4F288C6F44L ^ l)));
        objectArray20[3] = (double)(var56_39 + callSite8 + 5);
        objectArray20[2] = (double)(var52_35 + var57_40 / 2) - _0b.c("U", (Object)_0b.c("\u00c1", (Object)objectArray18, 7256177596405853717L, (long)l), (Object)objectArray19, 7258708077741613734L, (long)l) / 2.0;
        objectArray20[1] = _0b.a("a", 16316, (long)(0x618B923EF2DA9D78L ^ l));
        objectArray20[0] = l8;
        _0b.c("U", (Object)_0b.c("\u00c1", (Object)objectArray17, 7256177596405853717L, (long)l), (Object)objectArray20, 7255311044140621160L, (long)l);
        Object[] objectArray21 = new Object[1];
        objectArray21[0] = l6;
        CallSite callSite9 = _0b.c("U", (Object)((Object)this), (Object)objectArray21, 7256618795635999545L, (long)l);
        reference var60_43 = var52_35 + var57_40 + _0b.b("i", 31946, (long)(0xC267795427144A5L ^ l));
        Object[] objectArray22 = new Object[14];
        objectArray22[13] = false;
        objectArray22[12] = 0.0;
        objectArray22[11] = l16;
        objectArray22[10] = _0b.c("c", 7256845166558875611L, (long)l);
        objectArray22[9] = _0b.c("c", 7256845166558875611L, (long)l);
        objectArray22[8] = new _8B((int)_0b.c("W", (Object)callSite9, 7255587421362109640L, (long)l), l18, (int)_0b.c("W", (Object)callSite9, 7254906473580497816L, (long)l), (int)_0b.c("W", (Object)callSite9, 7258553888498740195L, (long)l));
        objectArray22[7] = 4.0;
        objectArray22[6] = 4.0;
        objectArray22[5] = 4.0;
        objectArray22[4] = 4.0;
        objectArray22[3] = (double)(var56_39 + callSite8);
        objectArray22[2] = (double)(var60_43 + var57_40);
        objectArray22[1] = (double)var56_39;
        objectArray22[0] = (double)var60_43;
        _0b.c("\u00c1", (Object)objectArray22, 7257621707924532523L, (long)l);
        Object[] objectArray23 = new Object[1];
        objectArray23[0] = l12;
        Object[] objectArray24 = new Object[1];
        objectArray24[0] = l12;
        Object[] objectArray25 = new Object[2];
        objectArray25[1] = l10;
        objectArray25[0] = _0b.a("a", 26100, (long)(0x51D5E688B3ECC73AL ^ l));
        Object[] objectArray26 = new Object[6];
        objectArray26[5] = false;
        objectArray26[4] = new _8B((int)_0b.b("i", 22437, (long)(0x5B1BD0B64E8C6FD0L ^ l)), (int)_0b.b("i", 22437, (long)(0x5B1BD0B64E8C6FD0L ^ l)), l9, (int)_0b.b("i", 22437, (long)(0x5B1BD0B64E8C6FD0L ^ l)), (int)_0b.b("i", 22323, (long)(0x5D045B4F288C6F44L ^ l)));
        objectArray26[3] = (double)(var56_39 + callSite8 + 5);
        objectArray26[2] = (double)(var60_43 + var57_40 / 2) - _0b.c("U", (Object)_0b.c("\u00c1", (Object)objectArray24, 7256177596405853717L, (long)l), (Object)objectArray25, 7258708077741613734L, (long)l) / 2.0;
        objectArray26[1] = _0b.a("a", 723, (long)(0x7D53516397BCA01CL ^ l));
        objectArray26[0] = l8;
        _0b.c("U", (Object)_0b.c("\u00c1", (Object)objectArray23, 7256177596405853717L, (long)l), (Object)objectArray26, 7255311044140621160L, (long)l);
        reference var61_44 = var50_33 + callSite7 - _0b.b("i", 26663, (long)(0x1116D0C448BD5054L ^ l));
        CallSite callSite10 = _0b.b("i", 15941, (long)(0x6A2A025AC1AC061EL ^ l));
        reference var63_46 = var49_32 + callSite6 - callSite3 - _0b.b("i", 5026, (long)(0x338D78B7F6FFABDDL ^ l));
        reference var64_47 = var63_46 - callSite3 - callSite4;
        try {
            Object[] objectArray27 = new Object[3];
            objectArray27[2] = 1;
            objectArray27[1] = (int)_0b.b("i", 22323, (long)(0x5D045B4F288C6F44L ^ l));
            objectArray27[0] = l14;
            Object[] objectArray28 = new Object[14];
            objectArray28[13] = false;
            objectArray28[12] = 0.0;
            objectArray28[11] = l16;
            objectArray28[10] = _0b.c("c", 7256845166558875611L, (long)l);
            objectArray28[9] = _0b.c("c", 7256845166558875611L, (long)l);
            objectArray28[8] = _0b.c("\u00c1", (Object)objectArray27, 7255422764912365555L, (long)l);
            objectArray28[7] = 5.0;
            objectArray28[6] = 5.0;
            objectArray28[5] = 5.0;
            objectArray28[4] = 5.0;
            objectArray28[3] = (double)(var61_44 + callSite10);
            objectArray28[2] = (double)(var63_46 + callSite3);
            objectArray28[1] = (double)var61_44;
            objectArray28[0] = (double)var63_46;
            _0b.c("\u00c1", (Object)objectArray28, 7257621707924532523L, (long)l);
            Object[] objectArray29 = new Object[1];
            objectArray29[0] = l12;
            Object[] objectArray30 = new Object[1];
            objectArray30[0] = l12;
            Object[] objectArray31 = new Object[2];
            objectArray31[1] = l10;
            objectArray31[0] = _0b.a("a", 22450, (long)(0x74DC4CE5F5BF757AL ^ l));
            Object[] objectArray32 = new Object[6];
            objectArray32[5] = false;
            objectArray32[4] = new _8B((int)_0b.b("i", 8382, (long)(0x1781CA6F4BC118CCL ^ l)), (int)_0b.b("i", 8382, (long)(0x1781CA6F4BC118CCL ^ l)), l9, (int)_0b.b("i", 8382, (long)(0x1781CA6F4BC118CCL ^ l)), (int)_0b.b("i", 22323, (long)(0x5D045B4F288C6F44L ^ l)));
            objectArray32[3] = (double)(var61_44 + _0b.b("i", 1531, (long)(0x12449C6D8FDF3DA2L ^ l)));
            objectArray32[2] = (double)(var63_46 + callSite3 / 2) - _0b.c("U", (Object)_0b.c("\u00c1", (Object)objectArray30, 7256177596405853717L, (long)l), (Object)objectArray31, 7258708077741613734L, (long)l) / 2.0;
            objectArray32[1] = _0b.a("a", 22584, (long)(0x33574A9D96A77AF5L ^ l));
            objectArray32[0] = l8;
            _0b.c("U", (Object)_0b.c("\u00c1", (Object)objectArray29, 7256177596405853717L, (long)l), (Object)objectArray32, 7255311044140621160L, (long)l);
            Object[] objectArray33 = new Object[14];
            objectArray33[13] = false;
            objectArray33[12] = 0.0;
            objectArray33[11] = l16;
            objectArray33[10] = _0b.c("c", 7256845166558875611L, (long)l);
            objectArray33[9] = _0b.c("c", 7256845166558875611L, (long)l);
            objectArray33[8] = new _8B((int)_0b.b("i", 4984, (long)(0x6F6271E2C5B2AB2EL ^ l)), (int)_0b.b("i", 9954, (long)(0x1C0B97E0BEE39E81L ^ l)), l9, (int)_0b.b("i", 19325, (long)(0x29C79F965E23F316L ^ l)), (int)_0b.b("i", 22323, (long)(0x5D045B4F288C6F44L ^ l)));
            objectArray33[7] = 5.0;
            objectArray33[6] = 5.0;
            objectArray33[5] = 5.0;
            objectArray33[4] = 5.0;
            objectArray33[3] = (double)(var61_44 + callSite10);
            objectArray33[2] = (double)(var64_47 + callSite3);
            objectArray33[1] = (double)var61_44;
            objectArray33[0] = (double)var64_47;
            _0b.c("\u00c1", (Object)objectArray33, 7257621707924532523L, (long)l);
            Object[] objectArray34 = new Object[1];
            objectArray34[0] = l12;
            Object[] objectArray35 = new Object[1];
            objectArray35[0] = l12;
            Object[] objectArray36 = new Object[2];
            objectArray36[1] = l10;
            objectArray36[0] = _0b.a("a", 3238, (long)(0x6AA81E3AC3EFAE63L ^ l));
            Object[] objectArray37 = new Object[6];
            objectArray37[5] = false;
            objectArray37[4] = new _8B((int)_0b.b("i", 8382, (long)(0x1781CA6F4BC118CCL ^ l)), (int)_0b.b("i", 8382, (long)(0x1781CA6F4BC118CCL ^ l)), l9, (int)_0b.b("i", 8382, (long)(0x1781CA6F4BC118CCL ^ l)), (int)_0b.b("i", 22323, (long)(0x5D045B4F288C6F44L ^ l)));
            objectArray37[3] = (double)(var61_44 + _0b.b("i", 1531, (long)(0x12449C6D8FDF3DA2L ^ l)));
            objectArray37[2] = (double)(var64_47 + callSite3 / 2) - _0b.c("U", (Object)_0b.c("\u00c1", (Object)objectArray35, 7256177596405853717L, (long)l), (Object)objectArray36, 7258708077741613734L, (long)l) / 2.0;
            objectArray37[1] = _0b.a("a", 28551, (long)(0x5AB710D813C8CD4CL ^ l));
            objectArray37[0] = l8;
            _0b.c("U", (Object)_0b.c("\u00c1", (Object)objectArray34, 7256177596405853717L, (long)l), (Object)objectArray37, 7255311044140621160L, (long)l);
            Object[] objectArray38 = new Object[1];
            objectArray38[0] = l13;
            _0b.c("\u00c1", (Object)objectArray38, 7256921285373871180L, (long)l);
            if (!bl) {
                _4w.cfr_renamed_1((String[])new String[1]);
            }
        }
        catch (MatchException matchException) {
            throw _0b.a(matchException);
        }
    }

    /*
     * Exception decompiling
     */
    private void void_7(Object[] var1_1) {
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

    private void void_0(Object[] objectArray) {
        block6: {
            int n = (Integer)objectArray[0];
            long l = (Long)objectArray[1];
            int n2 = (Integer)objectArray[2];
            int n3 = (Integer)objectArray[3];
            int n4 = (Integer)objectArray[4];
            long l2 = l = a ^ l;
            long l3 = l2 ^ 0x66E75DEA2465L;
            long l4 = l2 ^ 0x94B786A38DAL;
            long l5 = l2 ^ 0x3D8D4A6494F4L;
            long l6 = l2 ^ 0x11E369DD791BL;
            long l7 = l2 ^ 0x357D4A13CE1AL;
            long l8 = l2 ^ 0x3E892C944300L;
            long l9 = l2 ^ 0x5550ADB076B8L;
            int n5 = (int)(l9 >>> 48);
            int n6 = (int)(l9 << 16 >>> 32);
            int n7 = (int)(l9 << 48 >>> 48);
            long l10 = l2 ^ 0x779E121FF48AL;
            int n8 = n4 / 4;
            boolean bl = _02.cfr_renamed_15();
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l8;
            _0b.c("U", (Object)_0b.c("c", 4274336848027591776L, (long)l), (Object)objectArray2, 4275771431555384450L, (long)l);
            int n9 = 0;
            boolean bl2 = bl;
            block2: while (n9 < n8) {
                CallSite callSite = _0b.c("W", (Object)((Object)this), 4275041518973719268L, (long)l)[n9];
                _8B b = new _8B((int)callSite, (short)n5, n6, (short)n7);
                try {
                    Object[] objectArray3 = new Object[6];
                    objectArray3[5] = b;
                    objectArray3[4] = l5;
                    objectArray3[3] = 4.0;
                    objectArray3[2] = (double)n3;
                    objectArray3[1] = (double)(n2 + n9 * 4);
                    objectArray3[0] = (double)n;
                    _0b.c("U", (Object)_0b.c("c", 4274336848027591776L, (long)l), (Object)objectArray3, 4276100743970468208L, (long)l);
                    ++n9;
                    do {
                        boolean bl3 = bl2;
                        if (l > 0L) {
                            if (!bl3) break block6;
                            bl3 = bl2;
                        }
                        if (bl3) continue block2;
                    } while (l <= 0L);
                    break;
                }
                catch (MatchException matchException) {
                    throw _0b.a(matchException);
                }
            }
            Object[] objectArray4 = new Object[1];
            objectArray4[0] = l7;
            _0b.c("U", (Object)_0b.c("c", 4274336848027591776L, (long)l), (Object)objectArray4, 4278388881352620218L, (long)l);
            Object[] objectArray5 = new Object[11];
            objectArray5[10] = 1.0;
            objectArray5[9] = 2.0;
            objectArray5[8] = 2.0;
            objectArray5[7] = 2.0;
            objectArray5[6] = 2.0;
            objectArray5[5] = (double)(n2 + n4 + 1);
            objectArray5[4] = (double)(n + n3 + 1);
            objectArray5[3] = l4;
            objectArray5[2] = (double)(n2 - 1);
            objectArray5[1] = (double)(n - 1);
            objectArray5[0] = new _8B((int)_0b.b("i", 17084, (long)(0x45DBE0BC813A2520L ^ l)), l10, (int)_0b.b("i", 5855, (long)(0x5C4598DD534E715CL ^ l)), (int)_0b.b("i", 30095, (long)(0x4B0D7BBD54F01206L ^ l)));
            _0b.c("\u00c1", (Object)objectArray5, 4274664537717629294L, (long)l);
            n9 = n2 + (int)(_0b.c("W", (Object)((Object)this), 4276015432130897015L, (long)l) / 360.0 * (double)n4);
            Object[] objectArray6 = new Object[10];
            objectArray6[9] = 2.0;
            objectArray6[8] = 2.0;
            objectArray6[7] = 2.0;
            objectArray6[6] = 2.0;
            objectArray6[5] = l3;
            objectArray6[4] = (double)(n9 + 2);
            objectArray6[3] = (double)(n + n3 + 2);
            objectArray6[2] = (double)(n9 - 2);
            objectArray6[1] = (double)(n - 2);
            objectArray6[0] = new _8B(0, 0, l6, 0, (int)_0b.b("i", 8210, (long)(0x27A3A119CCDC478AL ^ l)));
            _0b.c("\u00c1", (Object)objectArray6, 4274178162280009740L, (long)l);
            Object[] objectArray7 = new Object[10];
            objectArray7[9] = 1.0;
            objectArray7[8] = 1.0;
            objectArray7[7] = 1.0;
            objectArray7[6] = 1.0;
            objectArray7[5] = l3;
            objectArray7[4] = (double)(n9 + 1);
            objectArray7[3] = (double)(n + n3 + 1);
            objectArray7[2] = (double)(n9 - 1);
            objectArray7[1] = (double)(n - 1);
            objectArray7[0] = new _8B((int)_0b.b("i", 22323, (long)(0x5D040513BA3B30A1L ^ l)), l10, (int)_0b.b("i", 22323, (long)(0x5D040513BA3B30A1L ^ l)), (int)_0b.b("i", 22323, (long)(0x5D040513BA3B30A1L ^ l)));
            _0b.c("\u00c1", (Object)objectArray7, 4274178162280009740L, (long)l);
        }
    }

    public boolean method_25402(class_11909 class_119092, boolean bl) {
        Object object;
        block22: {
            block23: {
                boolean bl2;
                long l;
                block20: {
                    reference var35_30;
                    CallSite callSite;
                    reference var32_27;
                    CallSite callSite2;
                    int n;
                    int n2;
                    long l2;
                    block21: {
                        reference v7;
                        reference var25_20;
                        CallSite callSite3;
                        CallSite callSite4;
                        long l3;
                        block18: {
                            reference var26_21;
                            CallSite callSite5;
                            block19: {
                                reference v2;
                                reference var29_24;
                                long l4;
                                block16: {
                                    reference var28_23;
                                    block17: {
                                        long l5 = l = a ^ 0x59656A615216L;
                                        l2 = l5 ^ 0xBE7D122DC25L;
                                        l3 = l5 ^ 0x6AE3F4DE802DL;
                                        l4 = l5 ^ 0x21B640C63278L;
                                        long l6 = l5 ^ 0x62EEBCAE3CF1L;
                                        n2 = (int)(_0b.c("U", (Object)class_119092, -3122857900193586443L, (long)l) * (double)_0b.c("U", (Object)_0b.c("U", (Object)_0b.c("c", -3125085805757977661L, (long)l), -3124508685084202917L, (long)l), -3123721868167981713L, (long)l));
                                        n = (int)(_0b.c("U", (Object)class_119092, -3125149117587921708L, (long)l) * (double)_0b.c("U", (Object)_0b.c("U", (Object)_0b.c("c", -3125085805757977661L, (long)l), -3124508685084202917L, (long)l), -3123721868167981713L, (long)l));
                                        CallSite callSite6 = _0b.c("U", (Object)_0b.c("U", (Object)_0b.c("c", -3125085805757977661L, (long)l), -3124508685084202917L, (long)l), -3122312945701352451L, (long)l);
                                        CallSite callSite7 = _0b.c("U", (Object)_0b.c("U", (Object)_0b.c("c", -3125085805757977661L, (long)l), -3124508685084202917L, (long)l), -3122229244576542473L, (long)l);
                                        callSite2 = _0b.b("i", 7347, (long)(0x485B39AC99D694C1L ^ l));
                                        callSite4 = _0b.b("i", 1531, (long)(0x12448263F74A8DB8L ^ l));
                                        bl2 = _02.cfr_renamed_2();
                                        reference var20_15 = callSite2 * 2 + callSite4;
                                        reference var21_16 = var20_15 + _0b.b("i", 29448, (long)(0x290DF39ADC4B7B78L ^ l));
                                        CallSite callSite8 = _0b.b("i", 27660, (long)(0x5317193DFD0CE441L ^ l));
                                        callSite3 = _0b.c("\u00c1", (int)var21_16, (int)callSite8, -3118802403986452637L, (long)l);
                                        callSite5 = _0b.b("i", 18187, (long)(0x2791D94C51414F45L ^ l));
                                        var25_20 = (callSite6 - callSite3) / 2;
                                        var26_21 = (callSite7 - callSite5) / 2;
                                        reference var27_22 = var26_21 + _0b.b("i", 26663, (long)(0x1116CECA3028E04EL ^ l));
                                        var28_23 = var25_20 + _0b.b("i", 5026, (long)(0x338D66B98E6A1BC7L ^ l));
                                        var29_24 = var27_22;
                                        try {
                                            try {
                                                Object[] objectArray = new Object[7];
                                                objectArray[6] = l2;
                                                objectArray[5] = (int)_0b.b("i", 8378, (long)(0x61D9E738E42728C1L ^ l));
                                                objectArray[4] = (int)_0b.b("i", 8378, (long)(0x61D9E738E42728C1L ^ l));
                                                objectArray[3] = (int)var29_24;
                                                objectArray[2] = (int)var28_23;
                                                objectArray[1] = (double)n;
                                                objectArray[0] = (double)n2;
                                                v2 = _0b.c("U", (Object)((Object)this), (Object)objectArray, -3123144842259392439L, (long)l);
                                                if (bl2) break block16;
                                                if (v2 == false) break block17;
                                            }
                                            catch (MatchException matchException) {
                                                throw _0b.a(matchException);
                                            }
                                            _0b.c("\u00a2", (Object)((Object)this), (boolean)_0b.b("i", 8190, (long)(0x3A5A4ACC25D89794L ^ l)), -3122783701758440112L, (long)l);
                                            Object[] objectArray = new Object[7];
                                            objectArray[6] = (int)_0b.b("i", 8378, (long)(0x61D9E738E42728C1L ^ l));
                                            objectArray[5] = (int)_0b.b("i", 8378, (long)(0x61D9E738E42728C1L ^ l));
                                            objectArray[4] = (int)var29_24;
                                            objectArray[3] = (int)var28_23;
                                            objectArray[2] = l6;
                                            objectArray[1] = (double)n;
                                            objectArray[0] = (double)n2;
                                            _0b.c("U", (Object)((Object)this), (Object)objectArray, -3119502986449603022L, (long)l);
                                            return true;
                                        }
                                        catch (MatchException matchException) {
                                            throw _0b.a(matchException);
                                        }
                                    }
                                    v2 = var28_23 + _0b.b("i", 8378, (long)(0x61D9E738E42728C1L ^ l)) + _0b.b("i", 31946, (long)(0xC26699B3AE4F4BFL ^ l));
                                }
                                reference var30_25 = v2;
                                reference var31_26 = var29_24;
                                try {
                                    try {
                                        Object[] objectArray = new Object[7];
                                        objectArray[6] = l2;
                                        objectArray[5] = (int)_0b.b("i", 8378, (long)(0x61D9E738E42728C1L ^ l));
                                        objectArray[4] = (int)_0b.b("i", 5026, (long)(0x338D66B98E6A1BC7L ^ l));
                                        objectArray[3] = (int)var31_26;
                                        objectArray[2] = (int)var30_25;
                                        objectArray[1] = (double)n;
                                        objectArray[0] = (double)n2;
                                        v7 = _0b.c("U", (Object)((Object)this), (Object)objectArray, -3123144842259392439L, (long)l);
                                        if (bl2) break block18;
                                        if (v7 == false) break block19;
                                    }
                                    catch (MatchException matchException) {
                                        throw _0b.a(matchException);
                                    }
                                    _0b.c("\u00a2", (Object)((Object)this), (boolean)_0b.b("i", 6324, (long)(0x7D60FBE109C510D5L ^ l)), -3125232272995756480L, (long)l);
                                    Object[] objectArray = new Object[4];
                                    objectArray[3] = (int)_0b.b("i", 8378, (long)(0x61D9E738E42728C1L ^ l));
                                    objectArray[2] = (int)var31_26;
                                    objectArray[1] = l4;
                                    objectArray[0] = (double)n;
                                    _0b.c("U", (Object)((Object)this), (Object)objectArray, -3119808555009290509L, (long)l);
                                    return true;
                                }
                                catch (MatchException matchException) {
                                    throw _0b.a(matchException);
                                }
                            }
                            v7 = var26_21 + callSite5 - _0b.b("i", 26663, (long)(0x1116CECA3028E04EL ^ l));
                        }
                        var32_27 = v7;
                        callSite = _0b.b("i", 15941, (long)(0x6A2A1C54B939B604L ^ l));
                        reference var34_29 = var25_20 + callSite3 - callSite2 - _0b.b("i", 5026, (long)(0x338D66B98E6A1BC7L ^ l));
                        var35_30 = var34_29 - callSite2 - callSite4;
                        try {
                            try {
                                Object[] objectArray = new Object[7];
                                objectArray[6] = l2;
                                objectArray[5] = (int)callSite;
                                objectArray[4] = (int)callSite2;
                                objectArray[3] = (int)var32_27;
                                objectArray[2] = (int)var34_29;
                                objectArray[1] = (double)n;
                                objectArray[0] = (double)n2;
                                object = _0b.c("U", (Object)((Object)this), (Object)objectArray, -3123144842259392439L, (long)l);
                                if (bl2) break block20;
                                if (object == false) break block21;
                            }
                            catch (MatchException matchException) {
                                throw _0b.a(matchException);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l3;
                            _0b.c("U", (Object)_0b.c("W", (Object)((Object)this), -3121658908026882837L, (long)l), (Object)_0b.c("U", (Object)((Object)this), (Object)objectArray, -3121365805034687709L, (long)l), -3119330123195325796L, (long)l);
                            _0b.c("U", (Object)_0b.c("c", -3125085805757977661L, (long)l), (Object)_0b.c("W", (Object)((Object)this), -3119441590459213951L, (long)l), -3122138134652807981L, (long)l);
                            return true;
                        }
                        catch (MatchException matchException) {
                            throw _0b.a(matchException);
                        }
                    }
                    Object[] objectArray = new Object[7];
                    objectArray[6] = l2;
                    objectArray[5] = (int)callSite;
                    objectArray[4] = (int)callSite2;
                    objectArray[3] = (int)var32_27;
                    objectArray[2] = (int)var35_30;
                    objectArray[1] = (double)n;
                    objectArray[0] = (double)n2;
                    object = _0b.c("U", (Object)((Object)this), (Object)objectArray, -3123144842259392439L, (long)l);
                }
                try {
                    try {
                        if (bl2) break block22;
                        if (object == false) break block23;
                    }
                    catch (MatchException matchException) {
                        throw _0b.a(matchException);
                    }
                    _0b.c("U", (Object)_0b.c("c", -3125085805757977661L, (long)l), (Object)_0b.c("W", (Object)((Object)this), -3119441590459213951L, (long)l), -3122138134652807981L, (long)l);
                    return true;
                }
                catch (MatchException matchException) {
                    throw _0b.a(matchException);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    public boolean method_25406(class_11909 class_119092) {
        long l = a ^ 0x32850141067L;
        _0b.c("\u00a2", (Object)((Object)this), (boolean)_0b.b("i", 18973, (long)(0x1914B36BB1400011L ^ l)), -7579088116779772879L, (long)l);
        _0b.c("\u00a2", (Object)((Object)this), (boolean)_0b.b("i", 27475, (long)(0x4B8F271574E62156L ^ l)), -7577026506535579871L, (long)l);
        return false;
    }

    public boolean method_25403(class_11909 class_119092, double d, double d2) {
        Object object;
        block10: {
            block11: {
                reference var28_23;
                boolean bl;
                int n;
                long l;
                long l2;
                block8: {
                    block9: {
                        long l3 = l2 = a ^ 0x69C9C01BBB72L;
                        l = l3 ^ 0x111AEABCDB1CL;
                        long l4 = l3 ^ 0x524216D4D595L;
                        int n2 = (int)(_0b.c("U", (Object)class_119092, 4453305653289192337L, (long)l2) * (double)_0b.c("U", (Object)_0b.c("U", (Object)_0b.c("c", 4451042597721653927L, (long)l2), 4451723891744964927L, (long)l2), 4450259219433700363L, (long)l2));
                        n = (int)(_0b.c("U", (Object)class_119092, 4450978941560229296L, (long)l2) * (double)_0b.c("U", (Object)_0b.c("U", (Object)_0b.c("c", 4451042597721653927L, (long)l2), 4451723891744964927L, (long)l2), 4450259219433700363L, (long)l2));
                        CallSite callSite = _0b.c("U", (Object)_0b.c("U", (Object)_0b.c("c", 4451042597721653927L, (long)l2), 4451723891744964927L, (long)l2), 4453884416760275609L, (long)l2);
                        CallSite callSite2 = _0b.c("U", (Object)_0b.c("U", (Object)_0b.c("c", 4451042597721653927L, (long)l2), 4451723891744964927L, (long)l2), 4453969493354822035L, (long)l2);
                        CallSite callSite3 = _0b.b("i", 7347, (long)(0x485B090033AC7DA5L ^ l2));
                        CallSite callSite4 = _0b.b("i", 1531, (long)(0x1244B2CF5D3064DCL ^ l2));
                        reference var19_13 = callSite3 * 2 + callSite4;
                        bl = _02.cfr_renamed_15();
                        reference var20_15 = var19_13 + _0b.b("i", 29448, (long)(0x290DC3367631921CL ^ l2));
                        CallSite callSite5 = _0b.b("i", 27660, (long)(0x5317299157760D25L ^ l2));
                        CallSite callSite6 = _0b.c("\u00c1", (int)var20_15, (int)callSite5, 4455178305455924743L, (long)l2);
                        CallSite callSite7 = _0b.b("i", 18187, (long)(0x2791E9E0FB3BA621L ^ l2));
                        reference var24_19 = (callSite - callSite6) / 2;
                        reference var25_20 = (callSite2 - callSite7) / 2;
                        reference var26_21 = var25_20 + _0b.b("i", 26663, (long)(0x1116FE669A52092AL ^ l2));
                        reference var27_22 = var24_19 + _0b.b("i", 5026, (long)(0x338D56152410F2A3L ^ l2));
                        var28_23 = var26_21;
                        try {
                            try {
                                object = _0b.c("W", (Object)((Object)this), 4453378781208765492L, (long)l2);
                                if (!bl) break block8;
                                if (object == false) break block9;
                            }
                            catch (MatchException matchException) {
                                throw _0b.a(matchException);
                            }
                            Object[] objectArray = new Object[7];
                            objectArray[6] = (int)_0b.b("i", 8378, (long)(0x61D9D7944E5DC1A5L ^ l2));
                            objectArray[5] = (int)_0b.b("i", 8378, (long)(0x61D9D7944E5DC1A5L ^ l2));
                            objectArray[4] = (int)var28_23;
                            objectArray[3] = (int)var27_22;
                            objectArray[2] = l4;
                            objectArray[1] = (double)n;
                            objectArray[0] = (double)n2;
                            _0b.c("U", (Object)((Object)this), (Object)objectArray, 4454477997866245974L, (long)l2);
                            return true;
                        }
                        catch (MatchException matchException) {
                            throw _0b.a(matchException);
                        }
                    }
                    object = _0b.c("W", (Object)((Object)this), 4450894962258263844L, (long)l2);
                }
                try {
                    try {
                        if (!bl) break block10;
                        if (object == false) break block11;
                    }
                    catch (MatchException matchException) {
                        throw _0b.a(matchException);
                    }
                    Object[] objectArray = new Object[4];
                    objectArray[3] = (int)_0b.b("i", 8378, (long)(0x61D9D7944E5DC1A5L ^ l2));
                    objectArray[2] = (int)var28_23;
                    objectArray[1] = l;
                    objectArray[0] = (double)n;
                    _0b.c("U", (Object)((Object)this), (Object)objectArray, 4454066674257667991L, (long)l2);
                    return true;
                }
                catch (MatchException matchException) {
                    throw _0b.a(matchException);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    private void cfr_renamed_13(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        long l = (Long)objectArray[2];
        int n = (Integer)objectArray[3];
        int n2 = (Integer)objectArray[4];
        int n3 = (Integer)objectArray[5];
        int n4 = (Integer)objectArray[6];
        l = a ^ l;
        _0b.c("\u00a2", (Object)((Object)this), (double)_0b.c("\u00c1", (double)((d - (double)n) / (double)n3), 0.0, 1.0, 7992446166665560032L, (long)l), 7998022447310030713L, (long)l);
        _0b.c("\u00a2", (Object)((Object)this), (double)_0b.c("\u00c1", (double)(1.0 - (d2 - (double)n2) / (double)n4), 0.0, 1.0, 7992446166665560032L, (long)l), 7994313900099887708L, (long)l);
    }

    private void cfr_renamed_3(Object[] objectArray) {
        double d = (Double)objectArray[0];
        long l = (Long)objectArray[1];
        int n = (Integer)objectArray[2];
        int n2 = (Integer)objectArray[3];
        l = a ^ l;
        _0b.c("\u00a2", (Object)((Object)this), (double)_0b.c("\u00c1", (double)((d - (double)n) / (double)n2 * 360.0), 0.0, 359.99, 6945566753042755945L, (long)l), 6952474839077322588L, (long)l);
    }

    public boolean method_25404(class_11908 class_119082) {
        Object object;
        block11: {
            CallSite callSite;
            long l;
            long l2;
            block9: {
                boolean bl;
                block10: {
                    l2 = a ^ 0x29E48EB5F24BL;
                    l = l2 ^ 0x1A62100A2070L;
                    bl = _02.cfr_renamed_2();
                    try {
                        try {
                            object = _0b.c("U", (Object)class_119082, 8426654070300234899L, (long)l2);
                            callSite = _0b.b("i", 22884, (long)(0x27693A191F89F179L ^ l2));
                            if (bl) break block9;
                            if (object != callSite) break block10;
                        }
                        catch (MatchException matchException) {
                            throw _0b.a(matchException);
                        }
                        _0b.c("U", (Object)_0b.c("c", 8429620873496529822L, (long)l2), (Object)_0b.c("W", (Object)((Object)this), 8424252377108707292L, (long)l2), 8428099027811513486L, (long)l2);
                        return true;
                    }
                    catch (MatchException matchException) {
                        throw _0b.a(matchException);
                    }
                }
                try {
                    object = _0b.c("U", (Object)class_119082, 8426654070300234899L, (long)l2);
                    if (bl) break block11;
                    callSite = _0b.b("i", 800, (long)(0x6A0C9CDD654AAB0EL ^ l2));
                }
                catch (MatchException matchException) {
                    throw _0b.a(matchException);
                }
            }
            try {
                if (object == callSite) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l;
                    _0b.c("U", (Object)_0b.c("W", (Object)((Object)this), 8426467186617029814L, (long)l2), (Object)_0b.c("U", (Object)((Object)this), (Object)objectArray, 8427324344552625022L, (long)l2), 8424151630014890689L, (long)l2);
                    _0b.c("U", (Object)_0b.c("c", 8429620873496529822L, (long)l2), (Object)_0b.c("W", (Object)((Object)this), 8424252377108707292L, (long)l2), 8428099027811513486L, (long)l2);
                    return true;
                }
            }
            catch (MatchException matchException) {
                throw _0b.a(matchException);
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Unable to fully structure code
     */
    private boolean boolean_7(Object[] var1_1) {
        block20: {
            block17: {
                block19: {
                    block18: {
                        block16: {
                            var3_2 = (Double)var1_1[0];
                            var5_3 = (Double)var1_1[1];
                            var9_4 = (Integer)var1_1[2];
                            var10_5 = (Integer)var1_1[3];
                            var2_6 = (Integer)var1_1[4];
                            var11_7 = (Integer)var1_1[5];
                            var7_8 = (Long)var1_1[6];
                            var7_8 = _0b.a ^ var7_8;
                            var12_9 = _02.cfr_renamed_15();
                            try {
                                try {
                                    cfr_temp_0 = var3_2 - (double)var9_4;
                                    v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                    if (!var12_9) break block16;
                                    if (v0 < 0) break block17;
                                }
                                catch (MatchException v1) {
                                    throw _0b.a(v1);
                                }
                                cfr_temp_1 = var3_2 - (double)(var9_4 + var2_6);
                                v0 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                            }
                            catch (MatchException v2) {
                                throw _0b.a(v2);
                            }
                        }
                        try {
                            try {
                                v3 = var12_9;
                                if (var7_8 > 0L) {
                                    if (!v3) break block18;
                                    if (v0 > 0) break block17;
                                }
                                ** GOTO lbl45
                            }
                            catch (MatchException v4) {
                                throw _0b.a(v4);
                            }
                            cfr_temp_2 = var5_3 - (double)var10_5;
                            v0 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                        }
                        catch (MatchException v5) {
                            throw _0b.a(v5);
                        }
                    }
                    try {
                        try {
                            v3 = var12_9;
lbl45:
                            // 2 sources

                            if (var7_8 > 0L) {
                                if (!v3) break block19;
                                if (v0 < 0) break block17;
                            }
                            ** GOTO lbl60
                        }
                        catch (MatchException v6) {
                            throw _0b.a(v6);
                        }
                        cfr_temp_3 = var5_3 - (double)(var10_5 + var11_7);
                        v0 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                    }
                    catch (MatchException v7) {
                        throw _0b.a(v7);
                    }
                }
                try {
                    v3 = var12_9;
lbl60:
                    // 2 sources

                    if (!v3) break block20;
                    if (v0 > 0) break block17;
                }
                catch (MatchException v8) {
                    throw _0b.a(v8);
                }
                v0 = (double)true;
                break block20;
            }
            v0 = (double)false;
        }
        return (boolean)v0;
    }

    public void method_25420(class_332 class_3322, int n, int n2, float f) {
    }

    public boolean method_25422() {
        return false;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        _0b.a = l.a((long)6251539074874999084L, (long)8589778109233954052L, MethodHandles.lookup().lookupClass()).a(268940500201275L);
                        var20 = _0b.a ^ 15914234543381L;
                        var22_1 = var20 ^ 7343250422247L;
                        _0b.h = new Object[114];
                        _0b.i = new String[114];
                        _0b.a();
                        _0b.d = new HashMap<K, V>(13);
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
                        var18_4 = new String[10];
                        var16_5 = 0;
                        var15_6 = "b\u00fax\u00f0\u000f-\u00c9D7\u00a4\u00c5+\u0091n\u008ey\u0018\u0094\u00eagv\\\u00c9\u00b1s\u00af\u009e\u0091Mp\u0001 \u00e4\u000b\u009a\u0087\u00b8h\u00cd~\f\u0010K\u00bc\u009d\u00ef0\u00d4\u00d9\u00c2\u0083\u001eZO]f\u0096\u001a\u0010\u0014\u0090|\u00ca\u0099(u\u0091u\u0096Yv0\u00ddc\u00fc\u0010\u00df\u00ea\u00f030\u009b\u008e\u00a5\u001b76r\u00ae\ba7\u0018\u007f\u00ac0N\u00f9:F\u00e9-\u00c1F\bM8\u0014%\u000f+\u00aaE;\u00db8\u00e3\u0010hP\u009a\u0006\u00f4/\\\u0003W\u00be\u00b9N\u008f\u00fb\u00a2\u0099\u0010\u00d2\u00cc\u00dc\u0099\u00ee\u00c1 \u00cbux\\&\u00d8\u00ffTh";
                        var17_7 = "b\u00fax\u00f0\u000f-\u00c9D7\u00a4\u00c5+\u0091n\u008ey\u0018\u0094\u00eagv\\\u00c9\u00b1s\u00af\u009e\u0091Mp\u0001 \u00e4\u000b\u009a\u0087\u00b8h\u00cd~\f\u0010K\u00bc\u009d\u00ef0\u00d4\u00d9\u00c2\u0083\u001eZO]f\u0096\u001a\u0010\u0014\u0090|\u00ca\u0099(u\u0091u\u0096Yv0\u00ddc\u00fc\u0010\u00df\u00ea\u00f030\u009b\u008e\u00a5\u001b76r\u00ae\ba7\u0018\u007f\u00ac0N\u00f9:F\u00e9-\u00c1F\bM8\u0014%\u000f+\u00aaE;\u00db8\u00e3\u0010hP\u009a\u0006\u00f4/\\\u0003W\u00be\u00b9N\u008f\u00fb\u00a2\u0099\u0010\u00d2\u00cc\u00dc\u0099\u00ee\u00c1 \u00cbux\\&\u00d8\u00ffTh".length();
                        var14_8 = 16;
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
                            var18_4[var16_5++] = _0b.a(var19_10).intern();
                            if ((var13_9 += var14_8) < var17_7) {
                                var14_8 = var15_6.charAt(var13_9);
                                ** continue;
                            }
                            var15_6 = "I\u009b|\u001b\u00a2\u009bU\u00db#d\u00f5\u00bfs\u00ae\u00e5. v\u008d\u00e3g\u00db\u00b2\u00a7\u00c3\u00a9/\u00e3#\u00d5\u00b0\u00e1\u00f6L\u00d0\u00dcw\u000fe\u0099(T\u00b0;\u0006\u008er\u00fb\u00f3";
                            var17_7 = "I\u009b|\u001b\u00a2\u009bU\u00db#d\u00f5\u00bfs\u00ae\u00e5. v\u008d\u00e3g\u00db\u00b2\u00a7\u00c3\u00a9/\u00e3#\u00d5\u00b0\u00e1\u00f6L\u00d0\u00dcw\u000fe\u0099(T\u00b0;\u0006\u008er\u00fb\u00f3".length();
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
                            var18_4[var16_5++] = _0b.a(var19_10).intern();
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
                _0b.b = var18_4;
                _0b.c = new String[10];
                _0b.g = new HashMap<K, V>(13);
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
                var6_13 = new long[45];
                var3_14 = 0;
                var4_15 = "l\u0011\u0090n\u00affo\u00bf\u00bf\u0010\"\u00cb\u0088\u00fc:X\u008d\u009f\u00edP6\u0000\u00b6\u00bc#\u0090\u00bfo\u00ec\u000fKU\u00d2~\u0016l>\u00a0\u00fa\u0001\u0081\u00ca\u0085\u00a6\u00cb\u00e5f\u007fQ\u00af\u00d3\u0001\f\u0000\u0000;X\u00e9\u00bd4\u0001@\u00ee\u00ae\u0016\u0007\u008c\u00ff\u00de\u00ee|\u00ae\u00aa\u0082\u001b\u00c9\u00ba\u0006\u00be\u0099\u0000D\r[ttT\u00c7\u00ae\u00a9o!SD\u0000\u00ff\u00c0[\u00bf/48\u00fd[\u00ef\u00c5`\u0019{\u0085\u0098\u00b9\u0017\u008f\u00af\u00fd4\u001a\u00f6ML7H\u0089\u001b\u00fevE'\u00ca\u001f;\u000b$\u001f\u00fb\u00ad!U\u00e8\u0082\u0085i\u00af\u00bb[m(\\\u00e3|\u008d\u0016\u0007l[\u0005\u00da2#\nA\f\u00a2[\u00d8zo\u00aa\u00c3s\u009d\u00b8\u00e6i\u001b=d8\u008aG\u00fb}0\u00eb\u00b6\u00d4e\u000fXX\u009f\\\\\u00d3\u00b6\u0001\r\u0001\u00d6x ,\u00a2\u00ce\u0087::\u00a9z\u0080/D#\u00aa\u0094\u00f8\u00b7g\u00c32\u00e7\u0001\u00f4\u00d4\u00af\u00f7\u00f8j\u0004w#\u0080\u00ca\u0002\u00dd#4\u000eI\u0004a\u00a0\u00bf\u00f8V\u00f1s\u008c\n/k\u00da\u00e9\u0000\u00acK\u00a6\u008a\u00ee\u0093\u00a5\u00a0l\u0099#?\u00bfD\u0086t\u00a9A\u001e\u0086h2\u0086\u0092f\u0007\u00d0\u00c8\u00b1\u0082Hs3.HJU\u008e\u0085\u00d6:x\u00e6J\u0007y\u00ae\u0094\u00fd\b\u000f \u00d2g\u0000O#\u009d\u0084P\u000f~\u00e0\u001d\u00fb\u008dC\u0011\u00da^\u00b1\u00e6\f\u0011\u00de\u001e6\u0012\u00f81=r:\u00baC\u00a77\u00cd\u0097";
                var5_16 = "l\u0011\u0090n\u00affo\u00bf\u00bf\u0010\"\u00cb\u0088\u00fc:X\u008d\u009f\u00edP6\u0000\u00b6\u00bc#\u0090\u00bfo\u00ec\u000fKU\u00d2~\u0016l>\u00a0\u00fa\u0001\u0081\u00ca\u0085\u00a6\u00cb\u00e5f\u007fQ\u00af\u00d3\u0001\f\u0000\u0000;X\u00e9\u00bd4\u0001@\u00ee\u00ae\u0016\u0007\u008c\u00ff\u00de\u00ee|\u00ae\u00aa\u0082\u001b\u00c9\u00ba\u0006\u00be\u0099\u0000D\r[ttT\u00c7\u00ae\u00a9o!SD\u0000\u00ff\u00c0[\u00bf/48\u00fd[\u00ef\u00c5`\u0019{\u0085\u0098\u00b9\u0017\u008f\u00af\u00fd4\u001a\u00f6ML7H\u0089\u001b\u00fevE'\u00ca\u001f;\u000b$\u001f\u00fb\u00ad!U\u00e8\u0082\u0085i\u00af\u00bb[m(\\\u00e3|\u008d\u0016\u0007l[\u0005\u00da2#\nA\f\u00a2[\u00d8zo\u00aa\u00c3s\u009d\u00b8\u00e6i\u001b=d8\u008aG\u00fb}0\u00eb\u00b6\u00d4e\u000fXX\u009f\\\\\u00d3\u00b6\u0001\r\u0001\u00d6x ,\u00a2\u00ce\u0087::\u00a9z\u0080/D#\u00aa\u0094\u00f8\u00b7g\u00c32\u00e7\u0001\u00f4\u00d4\u00af\u00f7\u00f8j\u0004w#\u0080\u00ca\u0002\u00dd#4\u000eI\u0004a\u00a0\u00bf\u00f8V\u00f1s\u008c\n/k\u00da\u00e9\u0000\u00acK\u00a6\u008a\u00ee\u0093\u00a5\u00a0l\u0099#?\u00bfD\u0086t\u00a9A\u001e\u0086h2\u0086\u0092f\u0007\u00d0\u00c8\u00b1\u0082Hs3.HJU\u008e\u0085\u00d6:x\u00e6J\u0007y\u00ae\u0094\u00fd\b\u000f \u00d2g\u0000O#\u009d\u0084P\u000f~\u00e0\u001d\u00fb\u008dC\u0011\u00da^\u00b1\u00e6\f\u0011\u00de\u001e6\u0012\u00f81=r:\u00baC\u00a77\u00cd\u0097".length();
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
                    var4_15 = ")xr\u0011\u009c\u00aeE\u00bfc\u0005D\u0097\u001dL?\u00dd";
                    var5_16 = ")xr\u0011\u009c\u00aeE\u00bfc\u0005D\u0097\u001dL?\u00dd".length();
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
        _0b.e = var6_13;
        _0b.f = new Integer[45];
        _0b.cfr_renamed_0 = new _8B(0, 0, var22_1, 0, 0);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static String a(byte[] byArray) {
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

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x466D;
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
                throw new RuntimeException("dev/krypton/0b", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l2 >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l2 << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            _0b.c[n2] = _0b.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _0b.a(n, l2);
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
            throw new RuntimeException("dev/krypton/0b" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x5CDC;
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
                throw new RuntimeException("dev/krypton/0b", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _0b.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _0b.b(n, l2);
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
            throw new RuntimeException("dev/krypton/0b" + " : " + string + " : " + methodType.toString(), exception);
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
            case 0 -> 1;
            case 1 -> 39;
            case 2 -> 14;
            case 3 -> 56;
            case 4 -> 62;
            case 5 -> 41;
            case 6 -> 35;
            case 7 -> 27;
            case 8 -> 52;
            case 9 -> 61;
            case 10 -> 11;
            case 11 -> 22;
            case 12 -> 18;
            case 13 -> 9;
            case 14 -> 8;
            case 15 -> 46;
            case 16 -> 44;
            case 17 -> 16;
            case 18 -> 60;
            case 19 -> 45;
            case 20 -> 33;
            case 21 -> 19;
            case 22 -> 40;
            case 23 -> 24;
            case 24 -> 36;
            case 25 -> 4;
            case 26 -> 48;
            case 27 -> 50;
            case 28 -> 12;
            case 29 -> 31;
            case 30 -> 30;
            case 31 -> 55;
            case 32 -> 54;
            case 33 -> 32;
            case 34 -> 23;
            case 35 -> 20;
            case 36 -> 10;
            case 37 -> 6;
            case 38 -> 57;
            case 39 -> 47;
            case 40 -> 29;
            case 41 -> 2;
            case 42 -> 5;
            case 43 -> 51;
            case 44 -> 38;
            case 45 -> 59;
            case 46 -> 17;
            case 47 -> 13;
            case 48 -> 42;
            case 49 -> 37;
            case 50 -> 0;
            case 51 -> 43;
            case 52 -> 34;
            case 53 -> 3;
            case 54 -> 49;
            case 55 -> 21;
            case 56 -> 63;
            case 57 -> 53;
            case 58 -> 26;
            case 59 -> 28;
            case 60 -> 58;
            case 61 -> 15;
            case 62 -> 25;
            default -> 7;
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
        _0b.i[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "\u007f\u0004QL\u0000V\u007f\u0004F\u0010\fYeOF\u000e\fLb>\u0016W^\r";
        objectArray[1] = Double.TYPE;
        _0b.i[1] = "java/lang/Double";
        objectArray[2] = "h.\u0016\u0004@\u0011u;\u0014EEM<)";
        objectArray[3] = "DJg:OJY_e{J\u0016\u0013a";
        objectArray[4] = "B \u0013\u0010\u0013\u00067\u0000\u0018\u001f\u0002IV\u000e\u0013\u0014\u0006\u0013\"";
        objectArray[5] = "Vz\u0014~J\u0014Ko\u0016?OH\n]";
        objectArray[6] = Integer.TYPE;
        _0b.i[6] = "java/lang/Integer";
        objectArray[7] = "xf\u00149P<\rF\u001f6AslH\u0014=E)\u0018";
        objectArray[8] = Void.TYPE;
        _0b.i[8] = "java/lang/Void";
        objectArray[9] = "]I\u0013%[5(i\u0018*JzIg\u0013!N =";
        objectArray[10] = "\u0010]";
        objectArray[11] = "51I$|(@\u0011B+mg!\u001fI i=U";
        objectArray[12] = "kA\r@\u001f\u001f\u001ea\u0006O\u000eP\u007fo\rD\n\n\u000b";
        objectArray[13] = "`:Z\u0003c\u0007\u0015\u001aQ\frHt\u0014Z\u0007v\u0012\u0000";
        objectArray[14] = "\u001c\u0004\u0004}a\u000fi$\u000frp@\b*\u0004yt\u001a|";
        objectArray[15] = "s}B\t\u0018X\u0006]I\u0006\t\u0017gSB\r\rM\u0013";
        objectArray[16] = "\u001f$";
        objectArray[17] = "MeCA[\fFjR\u000e8\u0001Sl";
        objectArray[18] = "\u0011/;\"Z\u0015\u001a *m'\r\t'#$";
        objectArray[19] = "J\u0017i\u001f\u0016\u0000?7b\u0010\u0007O^9i\u001b\u0003\u0015*";
        objectArray[20] = "U,_tR~ \fT{C1A\u0002_pGk5";
        objectArray[21] = "\u007f|3JE9bi1\u000b@e/r";
        objectArray[22] = "Yzp\u0011@`,Z{\u001eQ/MTp\u0015Uu9";
        objectArray[23] = "PsiK\t\u0017Mfk\n\fK\r_";
        objectArray[24] = "3 >JZ\u0016F\u00005EKY'\u000e>NO\u0003S";
        objectArray[25] = "E.Z\u0012\u001dgX;XS\u0018;\u0011\u000e";
        objectArray[26] = "}\b\u0006G{2\b(\rHj}i&\u0006Cn'\u001d";
        objectArray[27] = "\u0019;%?>|\u0004.'~; D,";
        objectArray[28] = Long.TYPE;
        _0b.i[28] = "java/lang/Long";
        objectArray[29] = Boolean.TYPE;
        _0b.i[29] = "java/lang/Boolean";
        objectArray[30] = "\u000e\n|tQ3\u000e\nk(]<\u0014Ak6])\u001309j\bk";
        objectArray[31] = "v\u000e\u0018<@i\u0003.\u00133Q&b \u00188U|\u0016";
        objectArray[32] = "/;\u0001]9\u0016Z\u001b\nR(Y;\u0015\u0001Y,\u0003O";
        objectArray[33] = "\u001f8#b$\u0013\u0002-!#!OBe";
        objectArray[34] = "\u0013/Nmn&f\u000fEb\u007fi\u0007\u0001Ni{3s";
        objectArray[35] = "\u0003\u0019_\u0002\u0003*\u001e\f]C\u0006vQI";
        objectArray[36] = "bUNE\u007f*\u0017uEJnev{NAj?\u0002";
        objectArray[37] = "lGXr\t2lGO.\u0005=v\fO0\u0005(q}\u001fmT";
        objectArray[38] = "\u0007\u001a\u0015%_=r:\u001e*Nr\u00134\u0015!J(g";
        objectArray[39] = "\\u\u001foP_A`\u001d.U\u0003\n";
        objectArray[40] = "\u000f~#Ir\u001fz^(FcP\u001bP#Mg\no";
        objectArray[41] = "DO/\u0015Q\u00061o$\u001a@IPa/\u0011D\u0013$";
        objectArray[42] = ":DuN\\\u001eOd~AMQ.juJI\u000bZ";
        objectArray[43] = "qrJ6\u0000K\u0004RA9\u0011\u0004e\\J2\u0015^\u0011";
        objectArray[44] = "\\[G\u0013(k){L\u001c9$HuG\u0017=~<";
        objectArray[45] = "&~";
        objectArray[46] = "<60Yu+I\u0016;Vdd(\u00180]`>\\";
        objectArray[47] = "\u0004\"\u0007S\b\u001fq\u0002\f\\\u0019P\u0010\f\u0007W\u001d\nd";
        objectArray[48] = "W\u00075\r2\u0004W\u0007\"Q>\u000bML\"O>\u001eJ=p\u0012f]\u0000";
        objectArray[49] = "$\u0000*\u0011PZ:\b0^\u0018Z \u0002(\u0019\u0011A`\"3\u001e\rZ#\u0004.";
        objectArray[50] = "`^nh)K\u0015~eg8\u0004tpnl<^\u0000";
        objectArray[51] = "/[c\b]\u0016$TrG<\u0018/_v\u001d";
        objectArray[52] = "W08Mp%W0/\u0011|*M{/\u000f|?J\nxP*";
        objectArray[53] = "H\u0015\u007f=C\u001dH\u0015haO\u0012R^h\u007fO\u0007U/:\"\u0017D\u001e";
        objectArray[54] = ",n\noyN4rVt\u0012Q/c;/nY%h\u0004u~Y\u007f\u0013\u0007o\u007fW=,]\u007f\u007f\rF/G~qOyuW~+4";
        objectArray[55] = "\u0002\u001e[SXjR\u0014Ao\u00007\u001e\u001bB\u00032c_@\u0018We+\u000fBT\b\u001d`[\t%\u001e\bc\u0013\u001c]U\\(b\nHV\u0014=\u001aA\u001c\u001de+\u000fBT\b\u001d`[\t%";
        objectArray[56] = "u\u0007A{\u000e_>\u0010D$i_)~H?X\u000btDH'\nZOCF \u0011\u001f6\u0010D)Xf";
        objectArray[57] = "A\u0018\",iP\u001a\u001f|o\u0014\u0002x\u00048cy\u0002B\u0004 1(9E\n'*m@\u0016\b.c\u0014";
        objectArray[58] = "pf\t0\u007f\n+aWs\u0002^Iz\u0013\u007foXsz\u000b->ctt\f6{\u001a'v\u0005\u007f\u0002";
        objectArray[59] = "\u0012c4}wv\\e+dJ+.d)n)o\u0011>9ns";
        objectArray[60] = "!)s\u0012}*z.-Q\u0000r\u00185i]mx\"5q\u000f<C%;v\u0014y:v9\u007f]\u0000";
        objectArray[61] = "!`\u001b\u001eFo9|G\u0005-|!f*\u0013@,:zRX\u0014gKlG[\\r3'\u0013\u0010-";
        objectArray[62] = "V#\u000b@\u0002\u0016\u0016.\u001d\u0006>\u0011M:\u001f\u0004BxT<\u0000\u0013\u0004\u001dF-M\u001e>EY3\n\u0005G\u0016[:C|";
        objectArray[63] = "\u0005fe4\u001f~^a;wb(S\u000b;r]+S;>'\fsC";
        objectArray[64] = "\u000f@-RDE\u000f\u001f=L'\u0018`\t;\u0004J\u001fZ\t#V\u001b$\\C'K\u001aF\u0012E8R'";
        objectArray[65] = "dTT2]'x\u0010\u001174'\u0004YSlY\">YK>\b\u0019uE\u0017,Sa>\u0011\\]";
        objectArray[66] = "Y\u0002@c+0\u0017\u0004_z\u0016jeH\\,{i_HD~*R\u001bDAd,b\u0005Z^g\u0016";
        objectArray[67] = "s\u00179<M<v\u0000/0-e\u0012\r.oJ9+Q9lT_q\n:6\u0016={\u0003yf-";
        objectArray[68] = "UY!^P\f[^{M>R\\K TR`\r\u000bp\u0002>\u000bMZ#H\u0001Q]Zy3";
        objectArray[69] = "\u007fK?E\u001161M \\,h\u0006pbGA78O8WAm";
        objectArray[70] = "q.\nk\u0003|pnXih$d)T2\u0004\u00160h\fjhx1j\b:X}d;P*h|v7L,\u0011/t>\u0005U";
        objectArray[71] = "\u0002W-\u0018\u001f\r\fPw\u000bqS\u000bE,\u0012\u001daZ\u0004tKq\n\u001aT/\u000eNP\nTuu";
        objectArray[72] = "|\u000br`e\u000b'\f,#\u0018]E\u0017h/uY\u007f\u0017p}$b&\u0003g\u007f#\u0000,\n$/\u0018";
        objectArray[73] = "SS\nnS{\bTT-.#jO\u0000)_u\u0012\u0004Tb";
        objectArray[74] = "\u000f@lF|NTG2\u0005\u0001\u00176\\f\u0001p@N\u00172J";
        objectArray[75] = "]Hd9\u0015*\u0016_afr/g@a1\u001f(]@ycN\u0013ZN~x\u000bj\tLw1r";
        objectArray[76] = "\u001f;c\u001d?#\u001e#1\u000fV\"\b:+3jv^oS\u0015;p\u001e8+^o;o";
        objectArray[77] = "'U\u007fv\u00043;\u0011:sm6GXx(\u00006}X`zQ\r'U\u007fv\u00043;\u0011:sm";
        objectArray[78] = "\u0019W\u001eq\u001d\u000bR@\u001b.z\u000b#_\u001by\u0017\t\u0019_\u0003+F2\u001eQ\u00040\u0003KMS\ryz";
        objectArray[79] = "(vN*}^sq\u0010i\u0000\bl\u001bJ1rV*y@81\u0006";
        objectArray[80] = "}R&b7[&Ux!J\rDN<-'\t~N$\u007fv2y@#d3K*B*-J";
        objectArray[81] = "_a$\\D#\u0014v!\u0003#*e\"%\u001d\u001a}\\i2\u0018E";
        objectArray[82] = "!&pcW[z!. *\u000f\u0018'+}\u0017[z*{xW";
        objectArray[83] = "@\u001d\\D_\u0015\u001b\u001a\u0002\u0007\"Dy\u0001F\u000bOGC\u0001^Y\u001e|EKZD\u001f\u001e\u000bME]\"";
        objectArray[84] = "}q1\u0017=\f&voT@Z\u001d\u001cjR!\u001by~$T>\u0002";
        objectArray[85] = "J%\u000fr0d\u0011\"Q1M3stSm30\u0011:Ur*";
        objectArray[86] = "^,+~qP\\#n/\u000e\u0004S\u001cel?T\u000b&etm\u00050!ksv@Iriz?9";
        objectArray[87] = "G\u001c\u000fT^\u0015\f\u000b\n\u000b9\u00130e\u0006\u0010\bAF_\u0006\bZ\u0010}X\b\u000fAU\u0004\u000b\n\u0006\b,";
        objectArray[88] = "!g_\u001c\u0005\u001cz`\u0001_xI\u0018`T\u001a\u0018\u0012heI\u000e\u0017";
        objectArray[89] = "Vf\u000bn\u000b\t\u001ff\nfZx\n2\u001alS\u00148`Z6\u000eHoc\u001aaW\u0003P9\na\rx";
        objectArray[90] = "\u0015g[w}KN`\u00054\u0000\u0018,{Q0qET0\u0005{";
        objectArray[91] = "\u0013u6%%\u007fHrhfX)d\u0018;7 vMh>*4y";
        objectArray[92] = "\u0019i|`N Wocysy%#`/\u001ey\u001f#x}OB\u0019.p}\b}C>p's";
        objectArray[93] = "d\u0003\u0013'f\r?\u0004Md\u001b\\]\u001f\thv_g\u001f\u0011:'d`\u0011\u0016!b\u001d3\u0013\u001fh\u001b";
        objectArray[94] = "9\u001b%\"\u0011Dr\f }vL\u0003\u0013 *\u001bF9\u00138xJ}>\u001d?c\u000f\u0004m\u001f6*v";
        objectArray[95] = "\u0015\"\u0019350N%GpHb,?\f4teB\u007f\u0001\"2";
        objectArray[96] = "g\t82pp?Gk'\u00025\u0001F,fo1;F44>\n<H3/{soJ:f\u0002";
        objectArray[97] = "|?<\u0004h*29#\u001dUu@u K8szu8\u0019iH|?<\u0004h*29#\u001dU";
        objectArray[98] = "\tY\u0010\u000b\u0016o\u000fXQBu,nAW\u0003\u001eq\rD@\u0015\u0012";
        objectArray[99] = "\u0010R^UA:^TAL|ikiNVM5\u0017SNN\u001fd,UCF\u001f#\u0013\u000fSFEX";
        objectArray[100] = "+73u\u0005Ze1,l8\t\u0017}/:U\u0003-}7h\u00048+73u\u0005Ze1,l8";
        objectArray[101] = "2\u001f!}\r>0\u0010d,rj\r/ooC:g\u0015ow\u0011k\\\u0012ap\n.%AcyCW";
        objectArray[102] = ";w;Z8y`pe\u0019E/r\u001a-I|aebf\u001d7";
        objectArray[103] = "v\u0007qP<rwG#RW*c\u0000/\t;\u00184Fq^lOj\u0012.\u00039td\u0015t\u0010W";
        objectArray[104] = "\u0007q\u0012\u0004pn\n!\u0017D\u0019p\f\u0010\nAtv $\tT\u0019`W-OP{m\u0007(\u000f9";
        objectArray[105] = ">5o\u0007-\bp3p\u001e\u0010Q\u00022r\u0014s\u0011=hb\u0014)";
        objectArray[106] = "\u001d=Fw9 F:\u00184Dv\u0015PBl6(\u001f2Heux";
        objectArray[107] = "\u0019\u0011t93eR\u0006qfTcXh}}e1\u0018R}e7`#Usb,%Z\u0006qke\\";
        objectArray[108] = "S-x\u0012\u0011,Et>\u0012kor\u001d<\u001bUhB =[\u0007j";
        objectArray[109] = "&\u00033p,9'\u001babE81\u0002{^ylgV\u0003x(j'\u0000{3|!V";
        objectArray[110] = "R#mDH\u0002\u00194h\u001b/\n:Zd\u0000\u001eVS`d\u0018L\u0007hgj\u001fWB\u00114h\u0016\u001e;";
        objectArray[111] = "k)1-\\d%/.4a6W.,>\u0002}ht<>X";
        objectArray[112] = "\u0003}\u0007p +\rz]cNu\no\u0006z\"G[/W N,\u001b~\u0005fqv\u000b~_\u001d";
        Object[] objectArray2 = objectArray;
        objectArray[113] = "4+HJ=`(o\rOTbT&O\u00149en&WFh^%:\u000bT3&nn@%";
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _0b.a(l2, l3);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                _0b.h[n] = clazz = Class.forName(i[n]);
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
        Field field = _0b.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = _0b.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _0b.a(l2, l3);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = _0b.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _0b.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _0b.a(clazz3, string2, clazz2)) != null) {
                    _0b.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = _0b.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        _0b.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _0b.b(3596871755074591L, 0L);
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
            for (int i = 0; i < n; ++i) {
                if (classArray2[i] != classArray[i]) continue block0;
            }
            return method;
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _0b.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = _0b.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method d(long l2, long l3) {
        int n = _0b.a(l2, l3);
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
                clazz3 = _0b.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _0b.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _0b.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _0b.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _0b.b(3596871755074591L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = _0b.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _0b.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _0b.b(3596871755074591L, 0L);
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
            if (c == 'W' || c == '\u00a2' || c == 'c' || c == 'z') {
                field = _0b.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'W' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00a2' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'c' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _0b.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'U' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _0b.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0b" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_0b.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_0b.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_0b.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

