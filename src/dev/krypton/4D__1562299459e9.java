/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_11905
 *  net.minecraft.class_11908
 *  net.minecraft.class_11909
 *  net.minecraft.class_2561
 *  net.minecraft.class_332
 *  net.minecraft.class_437
 */
package dev.krypton;

import dev.krypton._4J;
import dev.krypton._6e_0;
import dev.krypton._7V;
import dev.krypton._8B;
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
import net.minecraft.class_11905;
import net.minecraft.class_11908;
import net.minecraft.class_11909;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_437;

public class _4D
extends class_437
implements _4J,
_9Z {
    private static final int cfr_renamed_1;
    private static final int cfr_renamed_455;
    private static final int cfr_renamed_458;
    private static final int cfr_renamed_459;
    private static final int cfr_renamed_3;
    private static final int cfr_renamed_460;
    private static final _8B cfr_renamed_9;
    private static final _8B cfr_renamed_0;
    private static final _8B cfr_renamed_166;
    private static final _8B cfr_renamed_181;
    private static final _8B cfr_renamed_4;
    private static final _8B cfr_renamed_8;
    private static final _8B cfr_renamed_176;
    private static final _8B cfr_renamed_5;
    private static final _8B cfr_renamed_69;
    private static final _8B cfr_renamed_461;
    private static final _8B cfr_renamed_168;
    private static final _8B cfr_renamed_2;
    private static final _8B cfr_renamed_6;
    private static final _8B cfr_renamed_7;
    private final _6e_0 cfr_renamed_178;
    private final _7V cfr_renamed_462;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static final Object[] h;
    private static final String[] i;

    public _4D(_6e_0 e_0, long l2) {
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x6096289F1420L;
        long l5 = l3 ^ 0x36D652A14B0AL;
        int n = (int)(l5 >>> 32);
        int n2 = (int)(l5 << 32 >>> 40);
        int n3 = (int)(l5 << 56 >>> 56);
        super((class_2561)class_2561.method_43473());
        this.cfr_renamed_178 = e_0;
        Object[] objectArray = new Object[1];
        objectArray[0] = l4;
        this.cfr_renamed_462 = new _7V((String)((Object)_4D.c("\u00c0", (Object)e_0, (Object)objectArray, 3776804557635532780L, (long)l2)), n, n2, (byte)n3, (int)_4D.b("v", 28252, (long)(0x2C83683371231791L ^ l2)));
    }

    protected void method_56131() {
        block5: {
            _4D d;
            block4: {
                long l2 = a ^ 0x18648E0D0C24L;
                int n = _9M.cfr_renamed_3();
                try {
                    try {
                        d = this;
                        if (n != 0) break block4;
                        if (_4D.c("\u00ee", (Object)d, 3090038438702627188L, (long)l2) == null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _4D.a(matchException);
                    }
                    d = this;
                }
                catch (MatchException matchException) {
                    throw _4D.a(matchException);
                }
            }
            super.method_56131();
        }
    }

    public void method_25420(class_332 class_3322, int n, int n2, float f) {
    }

    public void method_25394(class_332 class_3322, int n, int n2, float f) {
        block9: {
            block11: {
                CallSite callSite;
                long l2;
                block10: {
                    int n3;
                    block8: {
                        l2 = a ^ 0x7294A7FB9EE5L;
                        n3 = _9M.cfr_renamed_3();
                        try {
                            try {
                                callSite = _4D.c("\u00ee", (Object)_4D.c("\u00f3", -5177602847466941567L, (long)l2), -5177271746683194836L, (long)l2);
                                if (n3 != 0) break block8;
                                if (callSite != this) break block9;
                            }
                            catch (MatchException matchException) {
                                throw _4D.a(matchException);
                            }
                            callSite = _4D.c("\u00ee", (Object)_4D.c("\u00f3", -5177142135829341467L, (long)l2), -5171142664447088172L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw _4D.a(matchException);
                        }
                    }
                    try {
                        try {
                            if (n3 != 0) break block10;
                            if (callSite == null) break block11;
                        }
                        catch (MatchException matchException) {
                            throw _4D.a(matchException);
                        }
                        callSite = _4D.c("\u00ee", (Object)_4D.c("\u00f3", -5177142135829341467L, (long)l2), -5171142664447088172L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw _4D.a(matchException);
                    }
                }
                _4D.c("\u00c0", (Object)callSite, (Object)class_3322, 0, 0, (float)f, -5170532228470569569L, (long)l2);
            }
            super.method_25394(class_3322, n, n2, f);
        }
    }

    public void method_25419() {
        long l2 = a ^ 0x240341B6DE7CL;
        long l3 = l2 ^ 0x5D8E05416FA8L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l3;
        _4D.c("\u00c0", (Object)this, (Object)objectArray, -529903339407781247L, (long)l2);
    }

    public boolean method_25421() {
        return false;
    }

    private void cfr_renamed_1(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x544040849E4CL;
        long l5 = l3 ^ 0x1337B5AAE228L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = _4D.c("\u00c0", (Object)_4D.c("\u00c0", (Object)_4D.c("\u00ee", (Object)this, -5637690215031967349L, (long)l2), (Object)objectArray2, -5636962118088787956L, (long)l2), -5636936911929847075L, (long)l2);
        objectArray3[0] = l5;
        _4D.c("\u00c0", (Object)_4D.c("\u00ee", (Object)this, -5637911203368495410L, (long)l2), (Object)objectArray3, -5636719699821199097L, (long)l2);
        _4D.c("\u00c0", (Object)_4D.c("\u00f3", -5637628841134155161L, (long)l2), (Object)_4D.c("\u00ee", (Object)_4D.c("\u00f3", -5638098280095001853L, (long)l2), -5629627160823863287L, (long)l2), -5630796379183275527L, (long)l2);
    }

    private void cfr_renamed_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        _4D.c("\u00c0", (Object)_4D.c("\u00f3", -3722984909189158927L, (long)l2), (Object)_4D.c("\u00ee", (Object)_4D.c("\u00f3", -3722469187677704555L, (long)l2), -3726208142046685793L, (long)l2), -3725261918522712977L, (long)l2);
    }

    @Override
    public void void_4(Object[] objectArray) {
        CallSite callSite;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        CallSite callSite2;
        double d9;
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        double d15;
        double d16;
        class_332 class_3322 = (class_332)objectArray[0];
        int n = (Integer)objectArray[1];
        int n2 = (Integer)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        long l2 = (Long)objectArray[4];
        long l3 = l2;
        long l4 = l3 ^ 0x9051E818052L;
        long l5 = l3 ^ 0x6DDE96BE1462L;
        long l6 = l3 ^ 0x425D0AA8C10AL;
        int n3 = (int)(l6 >>> 56);
        long l7 = l6 << 8 >>> 8;
        long l8 = l3 ^ 0x700DC6A7D055L;
        long l9 = l3 ^ 0xA1363F17B12L;
        long l10 = l3 ^ 0x2B524512B34BL;
        long l11 = l3 ^ 0x539B9DE20B0BL;
        long l12 = l3 ^ 0x1CE917666698L;
        long l13 = l3 ^ 0x3F113C19F64CL;
        long l14 = l3 ^ 0x538B49F9D37L;
        long l15 = l3 ^ 0x53CAC0D53B48L;
        long l16 = l3 ^ 0x5140330BCC9CL;
        long l17 = l3 ^ 0x74D642667963L;
        CallSite callSite3 = _4D.c("\u00f3", -2294068915059882869L, (long)l2);
        CallSite callSite4 = _4D.c("\u00c0", (Object)_4D.c("\u00c0", (Object)_4D.c("\u00f3", -2293126980419990647L, (long)l2), -2292408186451431012L, (long)l2), -2293007003338386530L, (long)l2);
        n *= callSite4;
        n2 *= callSite4;
        CallSite callSite5 = _4D.c("\u00c0", (Object)_4D.c("\u00c0", (Object)_4D.c("\u00f3", -2293126980419990647L, (long)l2), -2292408186451431012L, (long)l2), -2290967708365297031L, (long)l2);
        CallSite callSite6 = _4D.c("\u00c0", (Object)_4D.c("\u00c0", (Object)_4D.c("\u00f3", -2293126980419990647L, (long)l2), -2292408186451431012L, (long)l2), -2290688183037711554L, (long)l2);
        reference var60_25 = (callSite5 - _4D.b("v", 2618, (long)(0xEFA605B0155A786L ^ l2))) / 2;
        reference var61_26 = (callSite6 - _4D.b("v", 29966, (long)(0x2AF6E61DBB7A58BEL ^ l2))) / 2;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l8;
        CallSite callSite7 = _4D.c("\u00c0", (Object)_4D.c("\u00f3", -2290227682394608664L, (long)l2), (Object)objectArray2, -2290738233271133175L, (long)l2);
        reference var63_28 = var60_25 + _4D.b("v", 32050, (long)(0x1152BF610995D085L ^ l2));
        reference var64_29 = var61_26 + _4D.b("v", 8606, (long)(0x77031A7B9A498C11L ^ l2));
        CallSite callSite8 = _4D.b("v", 21100, (long)(0x31720E295146FFE2L ^ l2));
        reference var66_31 = var61_26 + _4D.b("v", 5642, (long)(0x30FED538E194BB8CL ^ l2)) - _4D.b("v", 12246, (long)(0x4133F0DA10FB025EL ^ l2)) - _4D.b("v", 14169, (long)(0x454065F1FE11AEAL ^ l2));
        reference var67_32 = var60_25 + _4D.b("v", 16182, (long)(0x7A1304F1B95C929AL ^ l2)) - _4D.b("v", 23201, (long)(0x301DD9D6446B7701L ^ l2)) - _4D.b("v", 2140, (long)(0x73110792981D25CEL ^ l2));
        reference var68_33 = var67_32 - _4D.b("v", 2140, (long)(0x73110792981D25CEL ^ l2)) - _4D.b("v", 11414, (long)(0x6B38ED48B2168114L ^ l2));
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l12;
        _4D.c("K", (Object)objectArray3, -2292350407478378693L, (long)l2);
        Object[] objectArray4 = new Object[3];
        objectArray4[2] = l4;
        objectArray4[1] = Float.valueOf(7.0f);
        objectArray4[0] = 4;
        _4D.c("K", (Object)objectArray4, -2294223798780702857L, (long)l2);
        Object[] objectArray5 = new Object[14];
        objectArray5[13] = 0.0;
        objectArray5[12] = _4D.c("\u00f3", -2292575087698741188L, (long)l2);
        objectArray5[11] = _4D.c("\u00f3", -2292575087698741188L, (long)l2);
        objectArray5[10] = _4D.c("\u00f3", -2293838866077015916L, (long)l2);
        objectArray5[9] = 0.0;
        objectArray5[8] = 0.0;
        objectArray5[7] = 0.0;
        objectArray5[6] = 0.0;
        objectArray5[5] = (double)callSite6;
        objectArray5[4] = (double)callSite5;
        objectArray5[3] = 0.0;
        objectArray5[2] = 0.0;
        objectArray5[1] = l7;
        objectArray5[0] = (int)((byte)n3);
        _4D.c("K", (Object)objectArray5, -2292802231246164549L, (long)l2);
        Object[] objectArray6 = new Object[14];
        objectArray6[13] = 1.5;
        objectArray6[12] = _4D.c("\u00f3", -2296270325704677154L, (long)l2);
        objectArray6[11] = _4D.c("\u00f3", -2293983343573419430L, (long)l2);
        objectArray6[10] = _4D.c("\u00f3", -2290176027609867638L, (long)l2);
        objectArray6[9] = 12.0;
        objectArray6[8] = 12.0;
        objectArray6[7] = 12.0;
        objectArray6[6] = 12.0;
        objectArray6[5] = (double)(var61_26 + _4D.b("v", 5642, (long)(0x30FED538E194BB8CL ^ l2)));
        objectArray6[4] = (double)(var60_25 + _4D.b("v", 16182, (long)(0x7A1304F1B95C929AL ^ l2)));
        objectArray6[3] = (double)var61_26;
        objectArray6[2] = (double)var60_25;
        objectArray6[1] = l7;
        objectArray6[0] = (int)((byte)n3);
        _4D.c("K", (Object)objectArray6, -2292802231246164549L, (long)l2);
        Object[] objectArray7 = new Object[14];
        objectArray7[13] = 0.0;
        objectArray7[12] = _4D.c("\u00f3", -2292575087698741188L, (long)l2);
        objectArray7[11] = _4D.c("\u00f3", -2292575087698741188L, (long)l2);
        objectArray7[10] = _4D.c("\u00f3", -2294101576733279619L, (long)l2);
        objectArray7[9] = 7.0;
        objectArray7[8] = 7.0;
        objectArray7[7] = 7.0;
        objectArray7[6] = 7.0;
        objectArray7[5] = (double)(var64_29 + _4D.b("v", 30682, (long)(0x434F01BDC5135A5DL ^ l2)));
        objectArray7[4] = (double)(var63_28 + callSite8);
        objectArray7[3] = (double)var64_29;
        objectArray7[2] = (double)var63_28;
        objectArray7[1] = l7;
        objectArray7[0] = (int)((byte)n3);
        _4D.c("K", (Object)objectArray7, -2292802231246164549L, (long)l2);
        Object[] objectArray8 = new Object[7];
        objectArray8[6] = (int)_4D.b("v", 12756, (long)(0x6306B1597CFA1C4CL ^ l2));
        objectArray8[5] = (int)_4D.b("v", 2140, (long)(0x73110792981D25CEL ^ l2));
        objectArray8[4] = l5;
        objectArray8[3] = (int)var66_31;
        objectArray8[2] = (int)var67_32;
        objectArray8[1] = n2;
        objectArray8[0] = n;
        CallSite callSite9 = _4D.c("\u00c0", (Object)this, (Object)objectArray8, -2293903006690439616L, (long)l2);
        Object[] objectArray9 = new Object[7];
        objectArray9[6] = (int)_4D.b("v", 12756, (long)(0x6306B1597CFA1C4CL ^ l2));
        objectArray9[5] = (int)_4D.b("v", 2140, (long)(0x73110792981D25CEL ^ l2));
        objectArray9[4] = l5;
        objectArray9[3] = (int)var66_31;
        objectArray9[2] = (int)var68_33;
        objectArray9[1] = n2;
        objectArray9[0] = n;
        CallSite callSite10 = _4D.c("\u00c0", (Object)this, (Object)objectArray9, -2293903006690439616L, (long)l2);
        try {
            d16 = (double)var67_32;
            d15 = (double)var66_31;
            d14 = (double)(var67_32 + _4D.b("v", 2140, (long)(0x73110792981D25CEL ^ l2)));
            d13 = (double)(var66_31 + _4D.b("v", 12756, (long)(0x6306B1597CFA1C4CL ^ l2)));
            d12 = 6.0;
            d11 = 6.0;
            d10 = 6.0;
            d9 = 6.0;
            callSite2 = callSite9 != false ? _4D.c("\u00f3", -2292835976785305188L, (long)l2) : _4D.c("\u00f3", -2294315092837561392L, (long)l2);
        }
        catch (MatchException matchException) {
            throw _4D.a(matchException);
        }
        double d17 = 1.0;
        CallSite callSite11 = _4D.c("\u00f3", -2296270325704677154L, (long)l2);
        CallSite callSite12 = _4D.c("\u00f3", -2293983343573419430L, (long)l2);
        CallSite callSite13 = callSite2;
        double d18 = d9;
        double d19 = d10;
        double d20 = d11;
        double d21 = d12;
        double d22 = d13;
        double d23 = d14;
        double d24 = d15;
        double d25 = d16;
        try {
            Object[] objectArray10 = new Object[14];
            objectArray10[13] = d17;
            objectArray10[12] = callSite11;
            objectArray10[11] = callSite12;
            objectArray10[10] = callSite13;
            objectArray10[9] = d18;
            objectArray10[8] = d19;
            objectArray10[7] = d20;
            objectArray10[6] = d21;
            objectArray10[5] = d22;
            objectArray10[4] = d23;
            objectArray10[3] = d24;
            objectArray10[2] = d25;
            objectArray10[1] = l7;
            objectArray10[0] = (int)((byte)n3);
            _4D.c("K", (Object)objectArray10, -2292802231246164549L, (long)l2);
            d8 = (double)var68_33;
            d7 = (double)var66_31;
            d6 = (double)(var68_33 + _4D.b("v", 2140, (long)(0x73110792981D25CEL ^ l2)));
            d5 = (double)(var66_31 + _4D.b("v", 12756, (long)(0x6306B1597CFA1C4CL ^ l2)));
            d4 = 6.0;
            d3 = 6.0;
            d2 = 6.0;
            d = 6.0;
            callSite = callSite10 != false ? _4D.c("\u00f3", -2294301367028278109L, (long)l2) : _4D.c("\u00f3", -2290343058562977501L, (long)l2);
        }
        catch (MatchException matchException) {
            throw _4D.a(matchException);
        }
        d17 = 1.0;
        callSite11 = _4D.c("\u00f3", -2296270325704677154L, (long)l2);
        callSite12 = _4D.c("\u00f3", -2293983343573419430L, (long)l2);
        callSite13 = callSite;
        d18 = d;
        d19 = d2;
        d20 = d3;
        d21 = d4;
        d22 = d5;
        d23 = d6;
        d24 = d7;
        d25 = d8;
        Object[] objectArray11 = new Object[14];
        objectArray11[13] = d17;
        objectArray11[12] = callSite11;
        objectArray11[11] = callSite12;
        objectArray11[10] = callSite13;
        objectArray11[9] = d18;
        objectArray11[8] = d19;
        objectArray11[7] = d20;
        objectArray11[6] = d21;
        objectArray11[5] = d22;
        objectArray11[4] = d23;
        objectArray11[3] = d24;
        objectArray11[2] = d25;
        objectArray11[1] = l7;
        objectArray11[0] = (int)((byte)n3);
        _4D.c("K", (Object)objectArray11, -2292802231246164549L, (long)l2);
        Object[] objectArray12 = new Object[1];
        objectArray12[0] = l13;
        _4D.c("K", (Object)objectArray12, -2294395691678403842L, (long)l2);
        Object[] objectArray13 = new Object[2];
        objectArray13[1] = l16;
        objectArray13[0] = class_3322;
        _4D.c("\u00c0", (Object)callSite3, (Object)objectArray13, -2290611585790710258L, (long)l2);
        Object[] objectArray14 = new Object[1];
        objectArray14[0] = l15;
        CallSite callSite14 = _4D.c("\u00c0", (Object)callSite3, (Object)objectArray14, -2290512589711394426L, (long)l2);
        Object[] objectArray15 = new Object[1];
        objectArray15[0] = l17;
        CallSite callSite15 = _4D.c("\u00c0", (Object)_4D.c("\u00ee", (Object)this, -2293406464338376928L, (long)l2), (Object)objectArray15, -2290877351564215113L, (long)l2);
        Object[] objectArray16 = new Object[2];
        objectArray16[1] = l9;
        objectArray16[0] = callSite15;
        CallSite callSite16 = _4D.c("\u00c0", (Object)callSite3, (Object)objectArray16, -2296189735027112348L, (long)l2);
        Object[] objectArray17 = new Object[5];
        objectArray17[4] = _4D.c("\u00f3", -2293274421928546794L, (long)l2);
        objectArray17[3] = (double)var61_26 + (36.0 - callSite14) / 2.0 + 4.0;
        objectArray17[2] = (double)var60_25 + (520.0 - callSite16) / 2.0;
        objectArray17[1] = callSite15;
        objectArray17[0] = l10;
        _4D.c("\u00c0", (Object)callSite3, (Object)objectArray17, -2293794182570525272L, (long)l2);
        Object[] objectArray18 = new Object[6];
        objectArray18[5] = 32.0;
        objectArray18[4] = (double)callSite8;
        objectArray18[3] = (double)var64_29;
        objectArray18[2] = l11;
        objectArray18[1] = (double)var63_28;
        objectArray18[0] = callSite3;
        _4D.c("\u00c0", (Object)_4D.c("\u00ee", (Object)this, -2293223057066385307L, (long)l2), (Object)objectArray18, -2296086961503569166L, (long)l2);
        Object[] objectArray19 = new Object[2];
        objectArray19[1] = l9;
        objectArray19[0] = _4D.a("u", 29606, (long)(0x7356B24C7CD2F6D0L ^ l2));
        CallSite callSite17 = _4D.c("\u00c0", (Object)callSite3, (Object)objectArray19, -2296189735027112348L, (long)l2);
        Object[] objectArray20 = new Object[5];
        objectArray20[4] = _4D.c("\u00f3", -2293274421928546794L, (long)l2);
        objectArray20[3] = (double)var66_31 + (24.0 - callSite14) / 2.0 + 1.0;
        objectArray20[2] = (double)var67_32 + (80.0 - callSite17) / 2.0;
        objectArray20[1] = _4D.a("u", 16323, (long)(0x55086DD1524C3AB7L ^ l2));
        objectArray20[0] = l10;
        _4D.c("\u00c0", (Object)callSite3, (Object)objectArray20, -2293794182570525272L, (long)l2);
        Object[] objectArray21 = new Object[2];
        objectArray21[1] = l9;
        objectArray21[0] = _4D.a("u", 4993, (long)(0x59A5E35550C496F4L ^ l2));
        CallSite callSite18 = _4D.c("\u00c0", (Object)callSite3, (Object)objectArray21, -2296189735027112348L, (long)l2);
        Object[] objectArray22 = new Object[5];
        objectArray22[4] = _4D.c("\u00f3", -2293274421928546794L, (long)l2);
        objectArray22[3] = (double)var66_31 + (24.0 - callSite14) / 2.0 + 1.0;
        objectArray22[2] = (double)var68_33 + (80.0 - callSite18) / 2.0;
        objectArray22[1] = _4D.a("u", 14816, (long)(0x52812D3D5DE4BC97L ^ l2));
        objectArray22[0] = l10;
        _4D.c("\u00c0", (Object)callSite3, (Object)objectArray22, -2293794182570525272L, (long)l2);
        Object[] objectArray23 = new Object[1];
        objectArray23[0] = l14;
        _4D.c("\u00c0", (Object)callSite3, (Object)objectArray23, -2293328535888802672L, (long)l2);
    }

    public boolean method_25402(class_11909 class_119092, boolean bl) {
        Object object;
        block16: {
            block17: {
                int n;
                long l2;
                long l3;
                block14: {
                    reference var21_17;
                    reference var19_15;
                    int n2;
                    int n3;
                    long l4;
                    block15: {
                        CallSite callSite;
                        long l5;
                        block12: {
                            block13: {
                                long l6 = l3 = a ^ 0x4CF11E780D1DL;
                                l2 = l6 ^ 0x67FF219FC15FL;
                                l4 = l6 ^ 0xB3674A0DF92L;
                                l5 = l6 ^ 0x357C5A8FBCC9L;
                                n = _9M.cfr_renamed_3();
                                try {
                                    try {
                                        callSite = _4D.c("\u00c0", (Object)class_119092, 3159371236297997791L, (long)l3);
                                        if (n != 0) break block12;
                                        if (callSite == false) break block13;
                                    }
                                    catch (MatchException matchException) {
                                        throw _4D.a(matchException);
                                    }
                                    return super.method_25402(class_119092, bl);
                                }
                                catch (MatchException matchException) {
                                    throw _4D.a(matchException);
                                }
                            }
                            callSite = _4D.c("\u00c0", (Object)_4D.c("\u00c0", (Object)_4D.c("\u00f3", 3160765809159897209L, (long)l3), 3161487418478279276L, (long)l3), 3160960343653914734L, (long)l3);
                        }
                        CallSite callSite2 = callSite;
                        n3 = (int)(_4D.c("\u00c0", (Object)class_119092, 3160300277819062417L, (long)l3) * (double)callSite2);
                        n2 = (int)(_4D.c("\u00c0", (Object)class_119092, 3160862058991794137L, (long)l3) * (double)callSite2);
                        CallSite callSite3 = _4D.c("\u00c0", (Object)_4D.c("\u00c0", (Object)_4D.c("\u00f3", 3160765809159897209L, (long)l3), 3161487418478279276L, (long)l3), 3153856647535796617L, (long)l3);
                        CallSite callSite4 = _4D.c("\u00c0", (Object)_4D.c("\u00c0", (Object)_4D.c("\u00f3", 3160765809159897209L, (long)l3), 3161487418478279276L, (long)l3), 3154122634053345486L, (long)l3);
                        reference var17_13 = (callSite3 - _4D.b("v", 16182, (long)(0x7A1362195B42596AL ^ l3))) / 2;
                        reference var18_14 = (callSite4 - _4D.b("v", 5642, (long)(0x30FEB3D0038A707CL ^ l3))) / 2;
                        var19_15 = var18_14 + _4D.b("v", 5642, (long)(0x30FEB3D0038A707CL ^ l3)) - _4D.b("v", 12756, (long)(0x6306D7B19EE4D7BCL ^ l3)) - _4D.b("v", 27095, (long)(0x7E6D5AB2D1F70FB9L ^ l3));
                        reference var20_16 = var17_13 + _4D.b("v", 16182, (long)(0x7A1362195B42596AL ^ l3)) - _4D.b("v", 23201, (long)(0x301DBF3EA675BCF1L ^ l3)) - _4D.b("v", 2140, (long)(0x7311617A7A03EE3EL ^ l3));
                        var21_17 = var20_16 - _4D.b("v", 2140, (long)(0x7311617A7A03EE3EL ^ l3)) - _4D.b("v", 19565, (long)(0x5F33DE53DE64AA23L ^ l3));
                        try {
                            try {
                                Object[] objectArray = new Object[7];
                                objectArray[6] = (int)_4D.b("v", 12756, (long)(0x6306D7B19EE4D7BCL ^ l3));
                                objectArray[5] = (int)_4D.b("v", 2140, (long)(0x7311617A7A03EE3EL ^ l3));
                                objectArray[4] = l4;
                                objectArray[3] = (int)var19_15;
                                objectArray[2] = (int)var20_16;
                                objectArray[1] = n2;
                                objectArray[0] = n3;
                                object = _4D.c("\u00c0", (Object)this, (Object)objectArray, 3159853166491256240L, (long)l3);
                                if (n != 0) break block14;
                                if (object == false) break block15;
                            }
                            catch (MatchException matchException) {
                                throw _4D.a(matchException);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l5;
                            _4D.c("\u00c0", (Object)this, (Object)objectArray, 3153662450482577888L, (long)l3);
                            return true;
                        }
                        catch (MatchException matchException) {
                            throw _4D.a(matchException);
                        }
                    }
                    Object[] objectArray = new Object[7];
                    objectArray[6] = (int)_4D.b("v", 12756, (long)(0x6306D7B19EE4D7BCL ^ l3));
                    objectArray[5] = (int)_4D.b("v", 2140, (long)(0x7311617A7A03EE3EL ^ l3));
                    objectArray[4] = l4;
                    objectArray[3] = (int)var19_15;
                    objectArray[2] = (int)var21_17;
                    objectArray[1] = n2;
                    objectArray[0] = n3;
                    object = _4D.c("\u00c0", (Object)this, (Object)objectArray, 3159853166491256240L, (long)l3);
                }
                try {
                    try {
                        if (n != 0) break block16;
                        if (object == false) break block17;
                    }
                    catch (MatchException matchException) {
                        throw _4D.a(matchException);
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l2;
                    _4D.c("\u00c0", (Object)this, (Object)objectArray, 3154475478384894544L, (long)l3);
                    return true;
                }
                catch (MatchException matchException) {
                    throw _4D.a(matchException);
                }
            }
            object = super.method_25402(class_119092, bl);
        }
        return (boolean)object;
    }

    public boolean method_25404(class_11908 class_119082) {
        CallSite callSite;
        block14: {
            long l2;
            long l3;
            block15: {
                Object object;
                block12: {
                    long l4 = l3 = a ^ 0x3930CC9AC3B5L;
                    long l5 = l4 ^ 0x40BD886D7261L;
                    l2 = l4 ^ 0xFCC40AA2AF9L;
                    int n = _9M.cfr_renamed_3();
                    CallSite callSite2 = _4D.c("\u00c0", (Object)class_119082, -1912492085409364663L, (long)l3);
                    try {
                        block13: {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                object = callSite2;
                                                if (n != 0) break block12;
                                                if (object == _4D.b("v", 10461, (long)(0x45194CD919498004L ^ l3))) break block13;
                                            }
                                            catch (MatchException matchException) {
                                                throw _4D.a(matchException);
                                            }
                                            object = callSite2;
                                            if (n != 0) break block12;
                                        }
                                        catch (MatchException matchException) {
                                            throw _4D.a(matchException);
                                        }
                                        if (object == _4D.b("v", 20893, (long)(0x4C08BDD074537966L ^ l3))) break block13;
                                    }
                                    catch (MatchException matchException) {
                                        throw _4D.a(matchException);
                                    }
                                    callSite = callSite2;
                                    if (n != 0) break block14;
                                }
                                catch (MatchException matchException) {
                                    throw _4D.a(matchException);
                                }
                                if (callSite != _4D.b("v", 16555, (long)(0x24B0C8264D99E852L ^ l3))) break block15;
                            }
                            catch (MatchException matchException) {
                                throw _4D.a(matchException);
                            }
                        }
                        Object[] objectArray = new Object[1];
                        objectArray[0] = l5;
                        _4D.c("\u00c0", (Object)this, (Object)objectArray, -1915021000288612536L, (long)l3);
                        object = true;
                    }
                    catch (MatchException matchException) {
                        throw _4D.a(matchException);
                    }
                }
                return (boolean)object;
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = l2;
            objectArray[0] = class_119082;
            callSite = _4D.c("\u00c0", (Object)_4D.c("\u00ee", (Object)this, -1912685213466581699L, (long)l3), (Object)objectArray, -1914967743135212403L, (long)l3);
        }
        return (boolean)callSite;
    }

    public boolean method_25400(class_11905 class_119052) {
        long l2 = a ^ 0x5F0736B68C60L;
        long l3 = l2 ^ 0xD89B54E6934L;
        Object[] objectArray = new Object[2];
        objectArray[1] = class_119052;
        objectArray[0] = l3;
        return (boolean)_4D.c("\u00c0", (Object)_4D.c("\u00ee", (Object)this, -6151458760565789976L, (long)l2), (Object)objectArray, -6144391040220789926L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    private boolean cfr_renamed_4(Object[] var1_1) {
        block22: {
            block21: {
                block20: {
                    block19: {
                        var4_2 = (Integer)var1_1[0];
                        var6_3 = (Integer)var1_1[1];
                        var8_4 = (Integer)var1_1[2];
                        var9_5 = (Integer)var1_1[3];
                        var2_6 = (Long)var1_1[4];
                        var5_7 = (Integer)var1_1[5];
                        var7_8 = (Integer)var1_1[6];
                        var2_6 = _4D.a ^ var2_6;
                        var10_9 = _9M.cfr_renamed_0();
                        try {
                            try {
                                v0 = var4_2;
                                v1 = var8_4;
                                if (var10_9 == 0) break block19;
                                if (v0 >= v1) {
                                }
                                ** GOTO lbl-1000
                            }
                            catch (MatchException v2) {
                                throw _4D.a(v2);
                            }
                            v0 = var4_2;
                            v1 = var8_4 + var5_7;
                        }
                        catch (MatchException v3) {
                            throw _4D.a(v3);
                        }
                    }
                    try {
                        try {
                            v4 = var10_9;
                            if (var2_6 < 0L) ** GOTO lbl47
                            if (v4 == 0) break block20;
                            if (v0 < v1) {
                            }
                            ** GOTO lbl-1000
                        }
                        catch (MatchException v5) {
                            throw _4D.a(v5);
                        }
                        v0 = var6_3;
                        v1 = var9_5;
                    }
                    catch (MatchException v6) {
                        throw _4D.a(v6);
                    }
                }
                try {
                    try {
                        try {
                            v4 = var10_9;
lbl47:
                            // 2 sources

                            if (v4 == 0) break block21;
                            if (v0 >= v1) {
                            }
                            ** GOTO lbl-1000
                        }
                        catch (MatchException v7) {
                            throw _4D.a(v7);
                        }
                        v0 = var6_3;
                        if (var10_9 == 0) break block22;
                    }
                    catch (MatchException v8) {
                        throw _4D.a(v8);
                    }
                    v1 = var9_5 + var7_8;
                }
                catch (MatchException v9) {
                    throw _4D.a(v9);
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
                        _4D.a = l.a(-9213344982601127789L, -8705806947218519462L, MethodHandles.lookup().lookupClass()).a(123318825883329L);
                        var20 = _4D.a ^ 132864168711908L;
                        var22_1 = var20 ^ 38816416281197L;
                        _4D.h = new Object[100];
                        _4D.i = new String[100];
                        _4D.a();
                        _4D.d = new HashMap<K, V>(13);
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
                        var18_4 = new String[4];
                        var16_5 = 0;
                        var15_6 = "\r\u0096\u0014\u00c6\u0092\u00c5u\u00c7\u00b6\u00b6\u009ed?\u00fb b\u0010\u00a2\u0000\u00e8\u009f\u0081\u00b4\u00be\u0018\u00ae\u00dd\u0017p\u00cc\u00dc\u009f\u00b1";
                        var17_7 = "\r\u0096\u0014\u00c6\u0092\u00c5u\u00c7\u00b6\u00b6\u009ed?\u00fb b\u0010\u00a2\u0000\u00e8\u009f\u0081\u00b4\u00be\u0018\u00ae\u00dd\u0017p\u00cc\u00dc\u009f\u00b1".length();
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
                            var18_4[var16_5++] = _4D.a(var19_10).intern();
                            if ((var13_9 += var14_8) < var17_7) {
                                var14_8 = var15_6.charAt(var13_9);
                                ** continue;
                            }
                            var15_6 = "\u0016\u0015\u008d\u00a5\u0001\u00e8J\u00b1H\u0084\u00d0\u00c5\u00cf\u008b\"\u001c\u0010\u0090\u00a6n\u00dc\u00d6\n\u00e2:\u00bc\u001e\u00f9^\u00ab\u00ad\u00dc\u0083";
                            var17_7 = "\u0016\u0015\u008d\u00a5\u0001\u00e8J\u00b1H\u0084\u00d0\u00c5\u00cf\u008b\"\u001c\u0010\u0090\u00a6n\u00dc\u00d6\n\u00e2:\u00bc\u001e\u00f9^\u00ab\u00ad\u00dc\u0083".length();
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
                            var18_4[var16_5++] = _4D.a(var19_10).intern();
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
                _4D.b = var18_4;
                _4D.c = new String[4];
                _4D.g = new HashMap<K, V>(13);
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
                var6_13 = new long[60];
                var3_14 = 0;
                var4_15 = "\u00a1\u0086AM\u009bp\u00a1b\u0007\u00bd\u00ebR\u00fe0K\u00e7\u001cj\u0097\u00ed\u0088\u00f5nI\u00aa\u00ab\u00b4\u007f\u0080\u00f4dHN\u00e4\u0006\u00d3\u00e1\u001b\u00e2Q\u00f6\u001c\u00d0cS\u0097D\u00aa\u00f7\u0096,\u00be\u00ce~e\u0089\r^\u00fe\u00ac/\u009doX\u00ccG\u0016gr7\u00d0Q\u00a4\u00eb\u00c7k\u00e4zT\u0089\u00e2(\u00d3\u00b0\u00b0\u00a8\u00ffL\u00de\u00f7\u00bcf\u00b9\u00c0B\u0094\u009aCr.y{\u00cd\u00d10\u00d2f\u00e2\\A,.\u00f9\u0082\u00e8h\u00dc\u0082s\u0082\u009d\u00e5\u00d3\u00c8\u00e6\u00a91X\u001c\u00d1\u00cfV\u00a9\u00be\u0013\u00b6n\u0087u=\u00a3\u00b8\u00f3\u000ei \u00a9\u0004\u00aa\u00fb\u00e1\u0085\u00adu\u0094\u0083Q\u00e5\u00d8\u0015\u0012g\u00fbB\u00f6\u00eb\u0081^\u0001\u00e2r\u00cb$\u00bd$\u00ac\u0000!\u00f7\u00a6k\u0083\u00b7\u00eeKE\u00de\u00d6\u00cd\u00c2M\u00bb^0c\u0087\u00aea\u00a6R\u00c0x\u00f2\u001c_p\u00f6)m\u000f\u00dd\u0086\u00d4Q?\u00a4U\u0010\u000b\u00a8bvZa\rn.\u00a2\u0010\u00ecd\u00e6\u001f\u0099^d\u00b4\u0016\u009e\u0016{:\u00cb\u0089\u00d8\u0001\u00f7\u00ff\u00a7y\u00b6\u009f\u00ab:\u0084\u0097\u0012d.w\u00acFzC\n\u00ba\u0007fh\u00d8b\u00fa\u00db\u00d1\u00c9\u0083\u00f31\u00a4\u00a5\u00f6\u00b4\u0094\u0005O\u00bfY\u00f6\u0001\f`GS\u00a2\u00c3\u00dd\u0014Qi\u0086\u009f\u0003\u00ac\"\u0080\u00bf\u00f9nH\u00cd\u00ad\u0086JY\u0010\u0091\u00cf\u0098\f\u0012\u0000\u001f\u00d9\u00c8`\u001ae\u00da\u0094N\u001c\u001e\u00f0?W\u00a9p8\u009c\u0010\u00bb\u00adh\u00d8f\u00c6\u0086C\u00daB\u00cf\u0019!;h\u0089\u0099{r_\"}\u00db\u0084\u00c5\u0081\u00c1\u0001j\u001b7+\u00fa\u0005\u00be\u00b9o@\u00eaL\u0005\u0094\u00bal\u00b8:\u0088\u00a3xG}p\u00ad\u0086\u008b\u0003\u00d3\u00fe$b\u00fe\u00fd\u00a8\u00b9\u00a5\u009c\u0090\u0082\u001c\u0090\u00df%\u0001\u0095+\u00ad}i/\u0086%\u00d00\u0081\u0016\u00f3\u00fef\u00dbpR\u00ee[yO\u00d3\u00b3\u0083R=\u0093a\u00f9\u00c5\u008d\u00c2\u009a\u00ad\u0081\u00ab\t\u008c\u0003\u009aQ:\u008d\u0084\u00d8&\u009eT\u00eb\u00cf";
                var5_16 = "\u00a1\u0086AM\u009bp\u00a1b\u0007\u00bd\u00ebR\u00fe0K\u00e7\u001cj\u0097\u00ed\u0088\u00f5nI\u00aa\u00ab\u00b4\u007f\u0080\u00f4dHN\u00e4\u0006\u00d3\u00e1\u001b\u00e2Q\u00f6\u001c\u00d0cS\u0097D\u00aa\u00f7\u0096,\u00be\u00ce~e\u0089\r^\u00fe\u00ac/\u009doX\u00ccG\u0016gr7\u00d0Q\u00a4\u00eb\u00c7k\u00e4zT\u0089\u00e2(\u00d3\u00b0\u00b0\u00a8\u00ffL\u00de\u00f7\u00bcf\u00b9\u00c0B\u0094\u009aCr.y{\u00cd\u00d10\u00d2f\u00e2\\A,.\u00f9\u0082\u00e8h\u00dc\u0082s\u0082\u009d\u00e5\u00d3\u00c8\u00e6\u00a91X\u001c\u00d1\u00cfV\u00a9\u00be\u0013\u00b6n\u0087u=\u00a3\u00b8\u00f3\u000ei \u00a9\u0004\u00aa\u00fb\u00e1\u0085\u00adu\u0094\u0083Q\u00e5\u00d8\u0015\u0012g\u00fbB\u00f6\u00eb\u0081^\u0001\u00e2r\u00cb$\u00bd$\u00ac\u0000!\u00f7\u00a6k\u0083\u00b7\u00eeKE\u00de\u00d6\u00cd\u00c2M\u00bb^0c\u0087\u00aea\u00a6R\u00c0x\u00f2\u001c_p\u00f6)m\u000f\u00dd\u0086\u00d4Q?\u00a4U\u0010\u000b\u00a8bvZa\rn.\u00a2\u0010\u00ecd\u00e6\u001f\u0099^d\u00b4\u0016\u009e\u0016{:\u00cb\u0089\u00d8\u0001\u00f7\u00ff\u00a7y\u00b6\u009f\u00ab:\u0084\u0097\u0012d.w\u00acFzC\n\u00ba\u0007fh\u00d8b\u00fa\u00db\u00d1\u00c9\u0083\u00f31\u00a4\u00a5\u00f6\u00b4\u0094\u0005O\u00bfY\u00f6\u0001\f`GS\u00a2\u00c3\u00dd\u0014Qi\u0086\u009f\u0003\u00ac\"\u0080\u00bf\u00f9nH\u00cd\u00ad\u0086JY\u0010\u0091\u00cf\u0098\f\u0012\u0000\u001f\u00d9\u00c8`\u001ae\u00da\u0094N\u001c\u001e\u00f0?W\u00a9p8\u009c\u0010\u00bb\u00adh\u00d8f\u00c6\u0086C\u00daB\u00cf\u0019!;h\u0089\u0099{r_\"}\u00db\u0084\u00c5\u0081\u00c1\u0001j\u001b7+\u00fa\u0005\u00be\u00b9o@\u00eaL\u0005\u0094\u00bal\u00b8:\u0088\u00a3xG}p\u00ad\u0086\u008b\u0003\u00d3\u00fe$b\u00fe\u00fd\u00a8\u00b9\u00a5\u009c\u0090\u0082\u001c\u0090\u00df%\u0001\u0095+\u00ad}i/\u0086%\u00d00\u0081\u0016\u00f3\u00fef\u00dbpR\u00ee[yO\u00d3\u00b3\u0083R=\u0093a\u00f9\u00c5\u008d\u00c2\u009a\u00ad\u0081\u00ab\t\u008c\u0003\u009aQ:\u008d\u0084\u00d8&\u009eT\u00eb\u00cf".length();
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
                    var4_15 = "\tW\u0094\u0004+.OC\u00fb\u000f\u0019\u009c\u0012\u007f\u0000\u00f7";
                    var5_16 = "\tW\u0094\u0004+.OC\u00fb\u000f\u0019\u009c\u0012\u007f\u0000\u00f7".length();
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
        _4D.e = var6_13;
        _4D.f = new Integer[60];
        _4D.cfr_renamed_458 = (int)_4D.b("v", (int)24255, (long)(var20 ^ 1062176007287071546L));
        _4D.cfr_renamed_460 = (int)_4D.b("v", (int)20062, (long)(var20 ^ 1189379138648568796L));
        _4D.cfr_renamed_455 = (int)_4D.b("v", (int)23148, (long)(var20 ^ 2877892565946820552L));
        _4D.cfr_renamed_3 = (int)_4D.b("v", (int)6144, (long)(var20 ^ 4975810610888091017L));
        _4D.cfr_renamed_1 = (int)_4D.b("v", (int)15414, (long)(var20 ^ 7155673542219563408L));
        _4D.cfr_renamed_459 = (int)_4D.b("v", (int)1251, (long)(var20 ^ 6655652893177198960L));
        _4D.cfr_renamed_9 = new _8B(0, 0, var22_1, 0, (int)_4D.b("v", (int)23685, (long)(804381507200868634L ^ var20)));
        _4D.cfr_renamed_0 = new _8B((int)_4D.b("v", (int)15246, (long)(2560138204915533353L ^ var20)), (int)_4D.b("v", (int)1558, (long)(4857213803587287978L ^ var20)), var22_1, (int)_4D.b("v", (int)30676, (long)(5879857776352021072L ^ var20)), (int)_4D.b("v", (int)17223, (long)(5850143226355023603L ^ var20)));
        _4D.cfr_renamed_166 = new _8B((int)_4D.b("v", (int)10799, (long)(4003658253314791355L ^ var20)), (int)_4D.b("v", (int)21532, (long)(5796172915033860529L ^ var20)), var22_1, (int)_4D.b("v", (int)21532, (long)(5796172915033860529L ^ var20)), (int)_4D.b("v", (int)24619, (long)(3931975272091311526L ^ var20)));
        _4D.cfr_renamed_181 = new _8B((int)_4D.b("v", (int)21532, (long)(5796172915033860529L ^ var20)), (int)_4D.b("v", (int)21532, (long)(5796172915033860529L ^ var20)), var22_1, (int)_4D.b("v", (int)21532, (long)(5796172915033860529L ^ var20)), 5);
        _4D.cfr_renamed_4 = new _8B(0, 0, var22_1, 0, 0);
        _4D.cfr_renamed_8 = new _8B(0, 0, var22_1, 0, (int)_4D.b("v", (int)14373, (long)(3847456100591338909L ^ var20)));
        _4D.cfr_renamed_176 = new _8B((int)_4D.b("v", (int)20598, (long)(452599347164212707L ^ var20)), (int)_4D.b("v", (int)13486, (long)(2788828717474842926L ^ var20)), var22_1, (int)_4D.b("v", (int)19771, (long)(407156304382750854L ^ var20)), (int)_4D.b("v", (int)25904, (long)(5017136681136281760L ^ var20)));
        _4D.cfr_renamed_5 = new _8B((int)_4D.b("v", (int)32746, (long)(474444371630342776L ^ var20)), (int)_4D.b("v", (int)14221, (long)(5201635440054372880L ^ var20)), var22_1, (int)_4D.b("v", (int)28116, (long)(5581643963757154380L ^ var20)), (int)_4D.b("v", (int)27371, (long)(6689985743801341810L ^ var20)));
        _4D.cfr_renamed_69 = new _8B((int)_4D.b("v", (int)8444, (long)(6661226276223884638L ^ var20)), (int)_4D.b("v", (int)4022, (long)(3051581262470820392L ^ var20)), var22_1, (int)_4D.b("v", (int)4832, (long)(5456387500993720128L ^ var20)), (int)_4D.b("v", (int)18677, (long)(8004924699919218004L ^ var20)));
        _4D.cfr_renamed_461 = new _8B((int)_4D.b("v", (int)22758, (long)(8363384029560006012L ^ var20)), (int)_4D.b("v", (int)4457, (long)(3464807719511960831L ^ var20)), var22_1, (int)_4D.b("v", (int)16354, (long)(7491122987081204334L ^ var20)), (int)_4D.b("v", (int)13052, (long)(1485254714557271904L ^ var20)));
        _4D.cfr_renamed_168 = new _8B((int)_4D.b("v", (int)3049, (long)(6692208334652454495L ^ var20)), (int)_4D.b("v", (int)14221, (long)(5201635440054372880L ^ var20)), var22_1, (int)_4D.b("v", (int)20591, (long)(1543510457241890260L ^ var20)), (int)_4D.b("v", (int)3406, (long)(1568985231690150117L ^ var20)));
        _4D.cfr_renamed_2 = new _8B((int)_4D.b("v", (int)30113, (long)(5606109879303063566L ^ var20)), (int)_4D.b("v", (int)23388, (long)(6588098385560659670L ^ var20)), var22_1, (int)_4D.b("v", (int)15206, (long)(5210273251674556106L ^ var20)), (int)_4D.b("v", (int)13052, (long)(1485254714557271904L ^ var20)));
        _4D.cfr_renamed_6 = _4D.c("\u00f3", (long)8082699986064308210L, (long)var20);
        _4D.cfr_renamed_7 = new _8B((int)_4D.b("v", (int)8421, (long)(4307106303932407115L ^ var20)), (int)_4D.b("v", (int)20280, (long)(5013249808615404167L ^ var20)), var22_1, (int)_4D.b("v", (int)2100, (long)(8884257037235533207L ^ var20)), (int)_4D.b("v", (int)21532, (long)(5796172915033860529L ^ var20)));
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
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x654E;
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
                throw new RuntimeException("dev/krypton/4D", exception);
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
            _4D.c[n2] = _4D.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _4D.a(n, l2);
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
            throw new RuntimeException("dev/krypton/4D" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x4DBD;
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
                throw new RuntimeException("dev/krypton/4D", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _4D.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _4D.b(n, l2);
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
            throw new RuntimeException("dev/krypton/4D" + " : " + string + " : " + methodType.toString(), exception);
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
            case 0 -> 49;
            case 1 -> 29;
            case 2 -> 44;
            case 3 -> 10;
            case 4 -> 25;
            case 5 -> 23;
            case 6 -> 28;
            case 7 -> 19;
            case 8 -> 43;
            case 9 -> 13;
            case 10 -> 9;
            case 11 -> 40;
            case 12 -> 53;
            case 13 -> 35;
            case 14 -> 4;
            case 15 -> 36;
            case 16 -> 39;
            case 17 -> 62;
            case 18 -> 46;
            case 19 -> 0;
            case 20 -> 42;
            case 21 -> 11;
            case 22 -> 51;
            case 23 -> 61;
            case 24 -> 26;
            case 25 -> 59;
            case 26 -> 22;
            case 27 -> 33;
            case 28 -> 60;
            case 29 -> 52;
            case 30 -> 2;
            case 31 -> 17;
            case 32 -> 54;
            case 33 -> 63;
            case 34 -> 34;
            case 35 -> 37;
            case 36 -> 38;
            case 37 -> 30;
            case 38 -> 32;
            case 39 -> 24;
            case 40 -> 16;
            case 41 -> 20;
            case 42 -> 18;
            case 43 -> 14;
            case 44 -> 27;
            case 45 -> 48;
            case 46 -> 50;
            case 47 -> 3;
            case 48 -> 12;
            case 49 -> 21;
            case 50 -> 56;
            case 51 -> 45;
            case 52 -> 8;
            case 53 -> 6;
            case 54 -> 55;
            case 55 -> 58;
            case 56 -> 15;
            case 57 -> 1;
            case 58 -> 7;
            case 59 -> 41;
            case 60 -> 31;
            case 61 -> 57;
            case 62 -> 47;
            default -> 5;
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
        _4D.i[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "6N\u000f\f&K+[\rM#\u0017ji";
        objectArray[1] = "\u001aPy\u0018\u0010d\u001aPnD\u001ck\u0000\u001bnZ\u001c~\u0007j9\u0005J";
        objectArray[2] = "\u0013.7:1\u0002\u0013. f=\r\te x=\u0018\u000e\u0014p'n";
        objectArray[3] = Integer.TYPE;
        _4D.i[3] = "java/lang/Integer";
        objectArray[4] = Float.TYPE;
        _4D.i[4] = "java/lang/Float";
        objectArray[5] = Void.TYPE;
        _4D.i[5] = "java/lang/Void";
        objectArray[6] = "\u0010\u000fO+@G\u0010\u000fXwLH\nDXiL]\r5\b4\u001d";
        objectArray[7] = "H`o\u0015}HUumTx\u0014\u001e";
        objectArray[8] = "\u0006\u001cJne_\u001b\tH/`\u0003T\u001c";
        objectArray[9] = "*~E<k)_^N3zf>PE8~<J";
        objectArray[10] = "\u0000Q\"\\i\n\u000b^3\u0013\u0014\u0012\u0018Y:Z";
        objectArray[11] = "\u0013ZO8`\"\u000eOMye~O\b";
        objectArray[12] = "/Z+7\u0017\u0003Zz 8\u0006L;t+3\u0002\u0016O";
        objectArray[13] = Double.TYPE;
        _4D.i[13] = "java/lang/Double";
        objectArray[14] = "\u0015q\u0004{3;`Q\u000ft\"t\u0001_\u0004\u007f&.u";
        objectArray[15] = "\u0006#FIK\u0014\u001b6D\bNHV\u0002";
        objectArray[16] = "fR*\u001bH\u001f{G(ZMC6\\";
        objectArray[17] = "{y\t\u001amv\u000eY\u0002\u0015|9oW\t\u001exc\u001b";
        objectArray[18] = "\u001f>\u007fy|+\u0002+}8ywMn";
        objectArray[19] = "u\bm\u0006\u0007Xh\u001doG\u0002\u0004(Y";
        objectArray[20] = "fM:R=o{X8\u0013832E";
        objectArray[21] = "2Na[BJGnjTS\u0005&`a_W_R";
        objectArray[22] = "\u000fW#7\u0012\u0001\u0006Y ~Q\f\u0000Y4|L\nBL+a\u000b\u001b\u001e]=78\u001e\u0019l+a\u000b\u001b\u001e]\u0018p\u001a\u0019";
        objectArray[23] = "<a\u0001H}\b<a\u0016\u0014q\u0007&*\u0016\nq\u0012![DV$P";
        objectArray[24] = "SqQ 0\nNdSa5V\u000e,";
        objectArray[25] = "Q{\u0010}<\u0006$[\u001br-IEU\u0010y)\u00131";
        objectArray[26] = "\u0001z\u001c\u0017E|\u001co\u001eV@ \\*";
        objectArray[27] = "heQW@k\u001dEZXQ$|KQSU~\b";
        objectArray[28] = "|!w\n/\u0018\t\u0001|\u0005>Wh\u000fw\u000e:\r\u001c";
        objectArray[29] = "\u0019\u0013\u0017\u0015;\u0018l3\u001c\u001a*W\r=\u0017\u0011.\ry";
        objectArray[30] = Boolean.TYPE;
        _4D.i[30] = "java/lang/Boolean";
        objectArray[31] = "xkV\u00190\u0017\rK]\u0016!XlEV\u001d%\u0002\u0018";
        objectArray[32] = "4DH\u0003\u0010>AdC\f\u0001q jH\u0007\u0005+T";
        objectArray[33] = ",X\u0018KA\tYx\u0013DPF8v\u0018OT\u001cL";
        objectArray[34] = "^o7(@\u0007Cz5iE[\r\\";
        objectArray[35] = "EH%B&s0h.M7<Qf%F3f%";
        objectArray[36] = "=\u0015|S\u0003(H5w\\\u0012g);|W\u0016=]";
        objectArray[37] = "\u001f7\u007fUwC\u0002\"}\u0014r\u001fB\u001f";
        objectArray[38] = "E\u000e\u007f8t\t0.t7eFQ \u007f<a\u001c%";
        objectArray[39] = "\u001d&\u001e\u0013P\u0005h\u0006\u0015\u001cAJ\t\b\u001e\u0017E\u0010}";
        objectArray[40] = ".\u0013{\u000bA\n.\u0013lWM\u00054XlIM\u00103)>\u0014\u0015Sx";
        objectArray[41] = ";K~\faqNku\u0003p>/e~\btd[";
        objectArray[42] = "E\u0003\u00159{T0#\u001e6j\u001bQ-\u0015=nA%";
        objectArray[43] = "L\u001f\u000e^G\u00129?\u0005QV]X1\u000eZR\u0007,";
        objectArray[44] = "\u0016fT\u007fyd\u0016fC#uk\f-C=u~\u000b\\\u0011`-=A";
        objectArray[45] = "r[/Z\" \u0007{$U3ofu/^75\u0012";
        objectArray[46] = "Vh\u00109\u0002f]g\u0001vchVl\u0005,";
        objectArray[47] = "\u0018G\u0019\u001c{\nEK[\u001c\u001c\u000e%\u000f\u0019\u0013\u007fV\\HW\u0016-";
        objectArray[48] = "Tw\u0002\u001ckr\u0015`K\u0015\u0007!kx\u001d\u000e>(W9\u0017\u000el\u0010Zf\u0014@9`\u000bf\u0013\u0002\u0007";
        objectArray[49] = "\f`\u001c\nuCMwU\u0003\u0019\u001bk\u0011\u0012\u0006h\u0018\u000b-S\fhJ3-W\u001brJVxW\u0003'!";
        objectArray[50] = "3=F5\fZ1s\u0006l4\u0003gp^2X101\u0005d\bf3i\u0006/^Xkh\u000714\\6|\\k\u0005\u0001lpTU\u000eZzn\u0000dS\u0000vf>nZ\u001fctBnV\u0002j\f\u0002nF\raiWn^X\n";
        objectArray[51] = "w?SP0\u0015ph\rQQQ\u001e'\f\u0018hP\"f\u0006\u0018:h\"b\u0011\u0002:\rwb\tWQ";
        objectArray[52] = "\u0005\u0000WrU$\b\u0004N6j-n\u0013Or\u0015/SE\u00114\u000e";
        objectArray[53] = "'\u0011tR\u0006\u0013 F*Sg_%w-\u0013X\u0016wIyTV";
        objectArray[54] = "@\u0013;\u0019nCFWlO\u0015\u000e'Rd\u0001,\u0007\u001b\u0013n\u0001~?D\\o\u0013/D\u0017Kp\u001e\u0015";
        objectArray[55] = "\r*{4\u000fT\n}%5n\u0019d%32\u0016\u0010Zqt<";
        objectArray[56] = "\"S,J@\n%\u0004rK!FKKs\u0002\u0018Ow\ny\u0002Jww\u000en\u0018J\u0012\"\u000evM!";
        objectArray[57] = "X\u0007yLNP\u0005\u000b;L)U#6~\u001bQ\f]\n|U\u0011U";
        objectArray[58] = "3\u0001>\u0014\u0014p C7Hfp1F.\u0011\nB`\u0006~Gf/`J,HWr:F$v";
        objectArray[59] = ".|\u0015Q'$(8B\u0007\\`I=JIe`u|@I7X*3A[f#y$^V\\";
        objectArray[60] = ":BfFn`7\u0014{L\u0005wkQ{JiE?\u0010#\u0012\u0005+7U{\u00159)y\u0015\"-9)tFpHl)l\u0013\u001b";
        objectArray[61] = "L\u0014WNv\u0006PRS\u0012\u0017F-RFS.C\u0011\u0013LS|{\u0012\u0017WCt\u0011UWC\u001a\u0017";
        objectArray[62] = "BP-u\u0004\u0001Q\u0012$)v\u0001@\u0017=p\u001a3\u0011Ve)v^\u0011\u001b?)G\u0003K\u00177\u0017";
        objectArray[63] = "9vZ\u0006[\u0011o(\u001c\u001da\u0013UiN\bX\u0014i(D\b\n,<o\u001e\u0001X\u0012h(\u0010y";
        objectArray[64] = "g\u0019\u0010\u0015X:`NN\u00149\u007f\u000e\u0001O]\u0000\u007f2@E]RGm\u000fDO\u0003<>\u0018[B9";
        objectArray[65] = "\u001ch\u0018\u0006w?\u001b?F\u0007\u0016s\u0005\u000eAG):L0\u0015\u0000'";
        objectArray[66] = "e|$m\u00189$kmdtgZs;\u007fMcf21\u007f\u001f[km21J+:m5st";
        objectArray[67] = "\"9\u000fM1p%nQLP2K6GK(4ub\u0000E";
        objectArray[68] = "a\u001cku\u0005OgX<#~\b\u0006]4mG\u000b:\u001c>m\u001539\u0018%}\u001dY~X1$~";
        objectArray[69] = "w\u0004\b\u001e\u007f\u0003pSV\u001f\u001e\u0010\u007f\u000f\\KID$]\b\u0018\u001eBq\u001fSLlO'\u0002Y";
        objectArray[70] = "\u001f,NxjL\u00035\u001b{\fZ\u00059\nA0\u000eSlr'lW]b\u0002vlP\u001f\\";
        objectArray[71] = "\b\u0006!9T`OF5`7vM\\:X\b1I\\<2Oq]\u0005_";
        objectArray[72] = "X\u0015\u00070QOZ\u001c\u0010:>\u001de\u001a\u0018\"\u0007\u0018Y[\u0012\"U Y_\u00058UE\f_\u001dm>";
        objectArray[73] = "\u001cRTCDf\u0000K\u0001@\"~\f^\bJNL^\u001eR\u0011\u001f\u001b[\u001e\u0018O\u001c*\u0006D\u0014G\"";
        objectArray[74] = "$m$\u0007=\u0012#:z\u0006\\^!\u000b}Fc\u0017t5)\u0001m";
        objectArray[75] = "Ac+dc\u0006Ez*s\u001e\u0000H\u001a$`o\u0004\u0013&ejoV+&a}uVNsae =";
        objectArray[76] = "z\u001a27`6y\f6=\\v\u0017\n9'es+K3'7Ky\u001b10%$nKj=\\";
        objectArray[77] = ",b\u0019h\"\u001e+5GiC]EmQn;Z{9\u0016`";
        objectArray[78] = "\n:W\u0000UsK-\u001e\t9.5tV\u0013Z}W5AZS";
        objectArray[79] = "\u001cbmsF7\u001b53r'wum%u_sK9b{";
        objectArray[80] = "_\u0019\u0003\u001f|\u000b\u0004\u0014\u000fH\u0000_?\rQ^9^\u0003L[^kf\u0003HLDk\u0003VHT\u0011\u0000";
        objectArray[81] = ".\u0003\u0017\u0016\u001b`)TI\u0017z,(eNWEe~[\u001a\u0010K";
        objectArray[82] = "L\u0005\u0007\f\u001ayAS\u001a\u0006qe\u0011\u0007\u001e\u000b&2OWGgH:\b\nB[JtHS";
        objectArray[83] = "Gg@|=\u0003EnWvRPzh_nkTF)Un9lE-N~1\u0006\u0002mZ'R";
        objectArray[84] = "\u0007^\\\u0005v\u001fZR\u001e\u0005\u0011\u001ayo_R/E]S\u0002^mE";
        objectArray[85] = "B6\u001fas\u0005EaA`\u0012@+9WgjA\u0015m\u0010i";
        objectArray[86] = "B\u0012ZM_^F\u000b[Z\"XykUIS\\\u0010W\u0014CS\u000e(W\u0010TI\u000eM\u0002\u0010L\u001ce";
        objectArray[87] = "Sc?hg}^5\"b\fj\u0002p\"d`XU6|37\u000f\u000072a~j\u0013u;=\f";
        objectArray[88] = "\n^\u0017\u0003QlKI^\n=3m/\u0019\u000fL7\r\u0013X\u0005Le5\u0013\\\u0012VePF\\\n\u0003\u000e";
        objectArray[89] = "+}\u00148z*,*J9\u001bf\u001b\u001b\u0019pk4-t\u001by|>";
        objectArray[90] = "+J\u001dL\u00012,\u001dCM`~<,JJP&9PL\u000e\u0007p";
        objectArray[91] = "nv7Q\u001avi!iP{0\u0007y\u007fW\u000329-8Y";
        objectArray[92] = "7\u00079\u001b)t<\bh\u0006\u0010`*\u001f\u007f/,4|G\u0007B,{/D6\u001fvw'z";
        objectArray[93] = "q%1;sL,)s;\u0014I\u0017\u001432i\u001b'f>dt\u0011";
        objectArray[94] = "<3A5}\u001b *\u00146\u001b\r&&\u0005\f'Ypr}j{\u0000~}\r;{\u0007<C";
        objectArray[95] = "m\u0006\u007f\u001c%q~Dv@WqoAo\u0019;C>\u0001>CW.>Mm@fsdAe~";
        objectArray[96] = "OMd[\u007fG\u000eZ-R\u0013\u0015pB{I*\u001dL\u0003qIx%A\\r\u0007-U\u0010\\uE\u0013";
        objectArray[97] = "\u0004\u0018U8\nC\u0003O\u000b9k\u000f<~\fyTFT@X>Z";
        objectArray[98] = "`l@VF\u001f4+N.Ch\t}\u0007\u0011\u0007\u00187)@\u001f";
        Object[] objectArray2 = objectArray;
        objectArray[99] = "\u0006nc>UM\u0000*4h.\u0000 Q-8_\bYml2_Zamh%EZ\u00048h=\u00101";
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _4D.a(l2, l3);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                _4D.h[n] = clazz = Class.forName(i[n]);
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
        Field field = _4D.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _4D.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _4D.a(l2, l3);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = _4D.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _4D.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _4D.a(clazz3, string2, clazz2)) != null) {
                    _4D.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _4D.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _4D.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _4D.b(3279301472100382L, 0L);
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
        Method method = _4D.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _4D.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method d(long l2, long l3) {
        int n = _4D.a(l2, l3);
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
                clazz3 = _4D.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _4D.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _4D.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _4D.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _4D.b(3279301472100382L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _4D.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _4D.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _4D.b(3279301472100382L, 0L);
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
            if (c == '\u00ee' || c == '\u00c7' || c == '\u00f3' || c == 'q') {
                field = _4D.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ee' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c7' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _4D.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c0' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'K' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _4D.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/4D" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_4D.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_4D.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_4D.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

