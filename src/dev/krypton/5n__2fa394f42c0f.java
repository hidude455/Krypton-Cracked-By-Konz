/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1923
 *  net.minecraft.class_2338
 *  net.minecraft.class_243
 *  net.minecraft.class_2791
 *  net.minecraft.class_2818
 *  net.minecraft.class_2919
 *  net.minecraft.class_4587
 *  net.minecraft.class_5321
 *  net.minecraft.class_5819
 *  net.minecraft.class_638
 *  net.minecraft.class_6880
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._3i_0;
import dev.krypton._4V;
import dev.krypton._4r;
import dev.krypton._6Q;
import dev.krypton._6c_0;
import dev.krypton._6l_0;
import dev.krypton._6x_0;
import dev.krypton._8B;
import dev.krypton._8F;
import dev.krypton._92;
import dev.krypton._95;
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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1923;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2791;
import net.minecraft.class_2818;
import net.minecraft.class_2919;
import net.minecraft.class_4587;
import net.minecraft.class_5321;
import net.minecraft.class_5819;
import net.minecraft.class_638;
import net.minecraft.class_6880;

/*
 * Renamed from dev.krypton.5n
 */
public class _5n_0
extends _6x_0 {
    private static final _8B cfr_renamed_0;
    private final _92 cfr_renamed_8;
    private final _92 cfr_renamed_1;
    private final Map cfr_renamed_7;
    private Map cfr_renamed_9;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final long j;
    private static final Object[] k;
    private static final String[] l;

    private _8B dev_krypton_8B_1(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = (l2 = b ^ l2) ^ 0x1A5578BA34FAL;
        return new _8B((int)_5n_0.a("l", 4923, (long)(0x1F174A8C1EAD1367L ^ l2)), (int)_5n_0.a("l", 20957, (long)(0x1E9C814FFD67D18AL ^ l2)), l3, (int)_5n_0.a("l", 25769, (long)(0x44C3CFD6AF7BE4FCL ^ l2)), n);
    }

    private void cfr_renamed_336(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x25E5725EB59AL;
        long l5 = l3 ^ 0x37476437915EL;
        int n = _8F.cfr_renamed_8();
        try {
            if (_5n_0.c("C", (Object)_5n_0.c("C", (Object)this, -3055952840903619312L, (long)l2), -3045724624200646748L, (long)l2) == null) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw _5n_0.a(matchException);
        }
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l5;
        CallSite callSite = _5n_0.c("\u00d1", (Object)_5n_0.c("u", (Object)objectArray2, -3059505172537102664L, (long)l2), -3062413677158701413L, (long)l2);
        while (_5n_0.c("\u00d1", (Object)callSite, -3056135988328451747L, (long)l2) != false) {
            class_2818 class_28182 = (class_2818)_5n_0.c("\u00d1", (Object)callSite, -3061008171941192462L, (long)l2);
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = class_28182;
            objectArray3[0] = l4;
            _5n_0.c("\u00d1", (Object)this, (Object)objectArray3, -3061326602853683605L, (long)l2);
            if (n == 0) continue;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void cfr_renamed_416(Object[] var1_1) {
        block37: {
            var3_2 = (Long)var1_1[0];
            var2_3 = (class_2791)var1_1[1];
            v0 = var3_2 = _5n_0.b ^ var3_2;
            var5_4 = v0 ^ 95072477847954L;
            var7_5 = v0 ^ 116869434070248L;
            var9_6 = v0 ^ 46173677886174L;
            v1 = v0 ^ 88328747336198L;
            var11_7 = (int)(v1 >>> 48);
            var12_8 = (int)(v1 << 16 >>> 32);
            var13_9 = (int)(v1 << 48 >>> 48);
            var14_10 = v0 ^ 69641040898505L;
            var16_11 = _8F.cfr_renamed_7();
            try {
                if (_5n_0.c("C", (Object)this, (long)8728704085043715334L, (long)var3_2) == null) {
                    return;
                }
            }
            catch (MatchException v2) {
                throw _5n_0.a(v2);
            }
            var17_12 = _5n_0.c("\u00d1", (Object)var2_3, (long)8721229972731388621L, (long)var3_2);
            var18_13 = _5n_0.c("\u00d1", (Object)var17_12, (long)8728054523406745887L, (long)var3_2);
            var20_14 = _5n_0.c("C", (Object)_5n_0.c("C", (Object)this, (long)8721523285513838990L, (long)var3_2), (long)8725399091608185532L, (long)var3_2);
            try {
                try {
                    if (_5n_0.c("\u00d1", (Object)_5n_0.c("C", (Object)this, (long)8729756422710577095L, (long)var3_2), (Object)_5n_0.c("u", (long)var18_13, (long)8728921017031764186L, (long)var3_2), (long)8722134320710008223L, (long)var3_2) == false && var20_14 != null) break block37;
                }
                catch (MatchException v3) {
                    throw _5n_0.a(v3);
                }
                return;
            }
            catch (MatchException v4) {
                throw _5n_0.a(v4);
            }
        }
        var21_15 = new HashSet<E>();
        _5n_0.c("\u00d1", (Object)_5n_0.c("u", (Object)var17_12, (int)1, (long)8726155973641904159L, (long)var3_2), (Consumer<class_1923>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, 7(char net.minecraft.class_638 int char java.util.Set net.minecraft.class_1923 ), (Lnet/minecraft/class_1923;)V)((char)((char)var11_7), (class_638)var20_14, (int)var12_8, (char)((char)var13_9), var21_15), (long)8725137082492527838L, (long)var3_2);
        var22_16 = (Set)_5n_0.c("\u00d1", (Object)_5n_0.c("\u00d1", (Object)_5n_0.c("\u00d1", var21_15, (long)8727981268846305026L, (long)var3_2), (Function<class_5321, Stream>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, 2(long net.minecraft.class_5321 ), (Lnet/minecraft/class_5321;)Ljava/util/stream/Stream;)((_5n_0)this, (long)var9_6), (long)8724667190553260947L, (long)var3_2), (Object)_5n_0.c("u", (long)8727296852187217220L, (long)var3_2), (long)8725822442966999299L, (long)var3_2);
        var23_17 = _5n_0.c("C", (Object)var17_12, (long)8729598399397548526L, (long)var3_2) << 4;
        var24_18 = _5n_0.c("C", (Object)var17_12, (long)8725668966399867836L, (long)var3_2) << 4;
        var25_19 = new class_2919((class_5819)_5n_0.c("\u00d1", (Object)_5n_0.c("w", (long)8726930897592973271L, (long)var3_2), (long)0L, (long)8730959736941685293L, (long)var3_2));
        var26_20 = _5n_0.c("\u00d1", (Object)var25_19, (long)_5n_0.j, (int)var23_17, (int)var24_18, (long)8725208669618165895L, (long)var3_2);
        var28_21 = new HashMap<K, V>();
        var29_22 = _5n_0.c("\u00d1", (Object)var22_16, (long)8731125981812441221L, (long)var3_2);
        block26: while (_5n_0.c("\u00d1", (Object)var29_22, (long)8721340179838967235L, (long)var3_2) != false) {
            v5 = _5n_0.c("\u00d1", (Object)var29_22, (long)8726601019336765548L, (long)var3_2);
            do {
                block47: {
                    block46: {
                        block38: {
                            var30_23 = (_4V)v5;
                            var31_24 = new HashSet<E>();
                            _5n_0.c("\u00d1", (Object)var25_19, (long)var26_20, (int)_5n_0.c("C", (Object)var30_23, (long)8725255037799836294L, (long)var3_2), (int)_5n_0.c("C", (Object)var30_23, (long)8726861696746680189L, (long)var3_2), (long)8730915215015418079L, (long)var3_2);
                            var32_25 = _5n_0.c("\u00d1", (Object)_5n_0.c("C", (Object)var30_23, (long)8727951578628207473L, (long)var3_2), (Object)var25_19, (long)8727787058064026761L, (long)var3_2);
                            v6 = var16_11;
                            if (var3_2 >= 0L) {
                                if (v6 == 0) break block26;
                                v6 = var33_26 = 0;
                            }
                            while (var33_26 < var32_25) {
                                block45: {
                                    block44: {
                                        block42: {
                                            block43: {
                                                block39: {
                                                    block40: {
                                                        block41: {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            cfr_temp_0 = _5n_0.c("C", (Object)var30_23, (long)8721429375253646327L, (long)var3_2) - 1.0f;
                                                                            v7 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                                                            if (var3_2 <= 0L || var16_11 == 0) break block38;
                                                                            if (var16_11 == 0) break block39;
                                                                        }
                                                                        catch (MatchException v8) {
                                                                            throw _5n_0.a(v8);
                                                                        }
                                                                        if (var3_2 < 0L) break block40;
                                                                        if (v7 /* !! */  == false) break block41;
                                                                    }
                                                                    catch (MatchException v9) {
                                                                        throw _5n_0.a(v9);
                                                                    }
                                                                    cfr_temp_1 = _5n_0.c("\u00d1", (Object)var25_19, (long)8729891733542590014L, (long)var3_2) - 1.0f / _5n_0.c("C", (Object)var30_23, (long)8721429375253646327L, (long)var3_2);
                                                                    v10 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 > 0 ? 1 : -1);
                                                                    if (var16_11 == 0) break block39;
                                                                }
                                                                catch (MatchException v11) {
                                                                    throw _5n_0.a(v11);
                                                                }
                                                                if (v10 < 0) break block41;
                                                            }
                                                            catch (MatchException v12) {
                                                                throw _5n_0.a(v12);
                                                            }
                                                            if (var3_2 >= 0L) break block44;
                                                        }
                                                        v13 = _5n_0.c("\u00d1", (Object)var25_19, (int)_5n_0.a("l", (int)23544, (long)(1035196776169395256L ^ var3_2)), (long)8731068667755852759L, (long)var3_2);
                                                    }
                                                    v10 = v13 + var23_17;
                                                }
                                                var34_27 = v10;
                                                var35_28 = _5n_0.c("\u00d1", (Object)var25_19, (int)_5n_0.a("l", (int)6690, (long)(6802074507153610217L ^ var3_2)), (long)8731068667755852759L, (long)var3_2) + var24_18;
                                                var36_29 = _5n_0.c("\u00d1", (Object)_5n_0.c("C", (Object)var30_23, (long)8723001844142818004L, (long)var3_2), (Object)var25_19, (Object)_5n_0.c("C", (Object)var30_23, (long)8725313256242902805L, (long)var3_2), (long)8730081985209715019L, (long)var3_2);
                                                var37_30 = new class_2338((int)var34_27, (int)var36_29, (int)var35_28);
                                                var38_31 = (class_5321)_5n_0.c("\u00d1", (Object)_5n_0.c("\u00d1", (Object)_5n_0.c("\u00d1", (Object)var2_3, (int)var34_27, (int)var36_29, (int)var35_28, (long)8729986109451346076L, (long)var3_2), (long)8724102669210278313L, (long)var3_2), (long)8726320457898376876L, (long)var3_2);
                                                try {
                                                    v14 = new Object[2];
                                                    v14[1] = var38_31;
                                                    v14[0] = var5_4;
                                                    v15 = _5n_0.c("\u00d1", (Object)_5n_0.c("\u00d1", (Object)this, (Object)v14, (long)8721711988056051774L, (long)var3_2), (Object)var30_23, (long)8724403685968451641L, (long)var3_2);
                                                    v16 = var16_11;
                                                    if (var3_2 >= 0L) {
                                                        if (v16 == 0) break block42;
                                                        if (v15 != false) break block43;
                                                    }
                                                    ** GOTO lbl115
                                                }
                                                catch (MatchException v17) {
                                                    throw _5n_0.a(v17);
                                                }
                                                if (var3_2 >= 0L) break block44;
                                            }
                                            v15 = _5n_0.c("C", (Object)var30_23, (long)8723895430954553954L, (long)var3_2);
                                        }
                                        try {
                                            try {
                                                try {
                                                    v16 = var16_11;
lbl115:
                                                    // 2 sources

                                                    if (v16 == 0) break block44;
                                                    if (v15 == false) ** GOTO lbl136
                                                }
                                                catch (MatchException v18) {
                                                    throw _5n_0.a(v18);
                                                }
                                                v19 = new Object[5];
                                                v19[4] = (int)_5n_0.c("C", (Object)var30_23, (long)8730804781283417218L, (long)var3_2);
                                                v19[3] = var37_30;
                                                v19[2] = var25_19;
                                                v19[1] = var20_14;
                                                v19[0] = var7_5;
                                                _5n_0.c("\u00d1", var31_24, (Object)_5n_0.c("\u00d1", (Object)this, (Object)v19, (long)8729001762738901311L, (long)var3_2), (long)8726534138856431135L, (long)var3_2);
                                                v20 = var16_11;
                                                if (var3_2 <= 0L) break block45;
                                                if (v20 == 0) {
                                                }
                                                break block44;
                                            }
                                            catch (MatchException v21) {
                                                throw _5n_0.a(v21);
                                            }
lbl136:
                                            // 2 sources

                                            v22 = new Object[6];
                                            v22[5] = Float.valueOf((float)_5n_0.c("C", (Object)var30_23, (long)8729164466081027050L, (long)var3_2));
                                            v22[4] = (int)_5n_0.c("C", (Object)var30_23, (long)8730804781283417218L, (long)var3_2);
                                            v22[3] = var14_10;
                                            v22[2] = var37_30;
                                            v22[1] = var25_19;
                                            v22[0] = var20_14;
                                            v15 = _5n_0.c("\u00d1", var31_24, (Object)_5n_0.c("\u00d1", (Object)this, (Object)v22, (long)8726735203888689313L, (long)var3_2), (long)8726534138856431135L, (long)var3_2);
                                        }
                                        catch (MatchException v23) {
                                            throw _5n_0.a(v23);
                                        }
                                    }
                                    ++var33_26;
                                    v20 = var16_11;
                                }
                                if (v20 != 0) continue;
                            }
                            try {
                                v5 = var31_24;
                                if (var3_2 < 0L) break block26;
                                if (var16_11 == 0) break block46;
                                v7 /* !! */  = _5n_0.c("\u00d1", (Object)v5, (long)8723540033383625135L, (long)var3_2);
                            }
                            catch (MatchException v24) {
                                throw _5n_0.a(v24);
                            }
                        }
                        try {
                            if (var3_2 < 0L) break block47;
                            if (v7 /* !! */  == false) {
                                _5n_0.c("\u00d1", var28_21, (Object)var30_23, var31_24, (long)8721808631150458836L, (long)var3_2);
                            }
                        }
                        catch (MatchException v25) {
                            throw _5n_0.a(v25);
                        }
                    }
                    v7 /* !! */  = (reference)var16_11;
                }
                if (v7 /* !! */  != false) continue block26;
                v5 = _5n_0.c("\u00d1", (Object)_5n_0.c("C", (Object)this, (long)8729756422710577095L, (long)var3_2), (Object)_5n_0.c("u", (long)var18_13, (long)8728921017031764186L, (long)var3_2), var28_21, (long)8729538868778644369L, (long)var3_2);
            } while (var3_2 < 0L);
        }
    }

    private void cfr_renamed_417(Object[] objectArray) {
        block14: {
            CallSite callSite;
            CallSite callSite2;
            int n;
            long l2;
            long l3;
            long l4;
            long l5;
            _6c_0 c_0;
            long l6;
            block13: {
                int n2 = (Integer)objectArray[0];
                int n3 = (Integer)objectArray[1];
                l6 = (Long)objectArray[2];
                c_0 = (_6c_0)objectArray[3];
                long l7 = l6 = b ^ l6;
                l5 = l7 ^ 0x2C74C79C12L;
                l4 = l7 ^ 0x3B0C6E60AB9FL;
                l3 = l7 ^ 0xB9FDD57E0DL;
                l2 = l7 ^ 0x29B92D5B4376L;
                n = _8F.cfr_renamed_8();
                CallSite callSite3 = _5n_0.c("u", (int)n2, (int)n3, -888262795062566632L, (long)l6);
                try {
                    try {
                        callSite2 = _5n_0.c("C", (Object)this, -889383493315605175L, (long)l6);
                        callSite = _5n_0.c("u", (long)callSite3, -887967579965742508L, (long)l6);
                        if (n != 0) break block13;
                        if (_5n_0.c("\u00d1", (Object)callSite2, (Object)callSite, -899264541687073007L, (long)l6) == false) break block14;
                    }
                    catch (MatchException matchException) {
                        throw _5n_0.a(matchException);
                    }
                    callSite2 = _5n_0.c("C", (Object)this, -889383493315605175L, (long)l6);
                    callSite = _5n_0.c("u", (long)callSite3, -887967579965742508L, (long)l6);
                }
                catch (MatchException matchException) {
                    throw _5n_0.a(matchException);
                }
            }
            Map map = (Map)((Object)_5n_0.c("\u00d1", (Object)callSite2, (Object)callSite, -892938709235138980L, (long)l6));
            CallSite callSite4 = _5n_0.c("\u00d1", (Object)_5n_0.c("\u00d1", (Object)map, -899517211536339102L, (long)l6), -890264084357330421L, (long)l6);
            block8: while (true) {
                Object object = _5n_0.c("\u00d1", (Object)callSite4, -898896980222273715L, (long)l6);
                while (object != false) {
                    CallSite callSite5;
                    block15: {
                        Map.Entry entry = (Map.Entry)((Object)_5n_0.c("\u00d1", (Object)callSite4, -894799888000501022L, (long)l6));
                        try {
                            try {
                                callSite5 = _5n_0.c("C", (Object)((_4V)((Object)_5n_0.c("\u00d1", (Object)entry, -898624602591804615L, (long)l6))), -899375996479540116L, (long)l6);
                                if (n != 0) break block15;
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l4;
                                Object[] objectArray3 = new Object[1];
                                objectArray3[0] = l4;
                                if (_5n_0.c("\u00d1", (Object)callSite5, (Object)objectArray2, -900325243105160064L, (long)l6) != _5n_0.c("\u00d1", (Object)_5n_0.c("w", -890179080178085879L, (long)l6), (Object)objectArray3, -900325243105160064L, (long)l6)) {
                                    continue block8;
                                }
                            }
                            catch (MatchException matchException) {
                                throw _5n_0.a(matchException);
                            }
                        }
                        catch (MatchException matchException) {
                            throw _5n_0.a(matchException);
                        }
                        callSite5 = _5n_0.c("\u00d1", (Object)entry, -893529408846189396L, (long)l6);
                    }
                    CallSite callSite6 = _5n_0.c("\u00d1", (Object)((Set)((Object)callSite5)), -890264084357330421L, (long)l6);
                    block10: while (true) {
                        Object object2 = _5n_0.c("\u00d1", (Object)callSite6, -898896980222273715L, (long)l6);
                        while (object2 != false) {
                            class_243 class_2432 = (class_243)_5n_0.c("\u00d1", (Object)callSite6, -894799888000501022L, (long)l6);
                            Object[] objectArray4 = new Object[1];
                            objectArray4[0] = l3;
                            Object[] objectArray5 = new Object[2];
                            objectArray5[1] = l5;
                            objectArray5[0] = (int)_5n_0.c("\u00d1", (Object)_5n_0.c("C", (Object)this, -900409301673367535L, (long)l6), (Object)objectArray4, -894153677533039316L, (long)l6);
                            Object[] objectArray6 = new Object[1];
                            objectArray6[0] = l3;
                            Object[] objectArray7 = new Object[2];
                            objectArray7[1] = l5;
                            objectArray7[0] = (int)_5n_0.c("\u00d1", (Object)_5n_0.c("C", (Object)this, -900409301673367535L, (long)l6), (Object)objectArray6, -894153677533039316L, (long)l6);
                            Object[] objectArray8 = new Object[11];
                            objectArray8[10] = l2;
                            objectArray8[9] = 0;
                            objectArray8[8] = _5n_0.c("w", -887411104951709863L, (long)l6);
                            objectArray8[7] = _5n_0.c("\u00d1", (Object)this, (Object)objectArray7, -894461678783243231L, (long)l6);
                            objectArray8[6] = _5n_0.c("\u00d1", (Object)this, (Object)objectArray5, -894461678783243231L, (long)l6);
                            objectArray8[5] = (double)(_5n_0.c("C", (Object)class_2432, -900497378608292338L, (long)l6) + 1.0);
                            objectArray8[4] = (double)(_5n_0.c("C", (Object)class_2432, -895779651471958281L, (long)l6) + 1.0);
                            objectArray8[3] = (double)(_5n_0.c("C", (Object)class_2432, -899669477158780364L, (long)l6) + 1.0);
                            objectArray8[2] = (double)_5n_0.c("C", (Object)class_2432, -900497378608292338L, (long)l6);
                            objectArray8[1] = (double)_5n_0.c("C", (Object)class_2432, -895779651471958281L, (long)l6);
                            objectArray8[0] = (double)_5n_0.c("C", (Object)class_2432, -899669477158780364L, (long)l6);
                            _5n_0.c("\u00d1", (Object)c_0.cfr_renamed_7, (Object)objectArray8, -893229841864482144L, (long)l6);
                            if (n != 0) continue block8;
                            object2 = n;
                            if (l6 < 0L) continue;
                            if (object2 == false) continue block10;
                        }
                        break;
                    }
                    object = n;
                    if (l6 <= 0L) continue;
                    if (object != false) break block8;
                    continue block8;
                }
                break;
            }
        }
    }

    private void cfr_renamed_246(Object[] objectArray) {
        block5: {
            _5n_0 n_0;
            long l2;
            long l3;
            block4: {
                l3 = (Long)objectArray[0];
                long l4 = l3 = b ^ l3;
                l2 = l4 ^ 0x56253357452EL;
                long l5 = l4 ^ 0x6D0E6ECF1306L;
                int n = _8F.cfr_renamed_8();
                try {
                    try {
                        _5n_0.c("\u00d1", (Object)_5n_0.c("C", (Object)this, -8533722100457752717L, (long)l3), -8529652113358726461L, (long)l3);
                        n_0 = this;
                        if (n != 0) break block4;
                        if (_5n_0.c("C", (Object)_5n_0.c("C", (Object)n_0, -8521548299695533766L, (long)l3), -8529065633053435384L, (long)l3) == null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _5n_0.a(matchException);
                    }
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l5;
                    _5n_0.c("\u00f5", (Object)this, (Map)((Object)_5n_0.c("u", (Object)objectArray2, -8533037195334598490L, (long)l3)), -8532379701765608014L, (long)l3);
                    n_0 = this;
                }
                catch (MatchException matchException) {
                    throw _5n_0.a(matchException);
                }
            }
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l2;
            _5n_0.c("\u00d1", (Object)n_0, (Object)objectArray3, -8534133650130404241L, (long)l3);
        }
    }

    public _5n_0(short s, int n, char c) {
        long l2;
        long l3 = l2 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)c << 48 >>> 48) ^ b;
        long l4 = l3 ^ 0x1D9CF2C9ADAAL;
        long l5 = l3 ^ 0x5BC457435C50L;
        long l6 = l3 ^ 0x4404C467B322L;
        super((int)_5n_0.a("l", 16371, (long)(0x56CAC5E6B8E0BC78L ^ l2)), -1, (_4r)((Object)_5n_0.c("w", -770114992782641400L, (long)l2)), l5);
        this.cfr_renamed_8 = new _92((int)_5n_0.a("l", 25929, (long)(0x1D8B24A364C566C8L ^ l2)), 1.0, l4, 255.0, 125.0, 1.0);
        this.cfr_renamed_1 = new _92((int)_5n_0.a("l", 5471, (long)(0x6AB1A0F2FB7496D6L ^ l2)), 1.0, l4, 10.0, 5.0, 1.0);
        this.cfr_renamed_7 = new ConcurrentHashMap();
        Object[] objectArray = new Object[2];
        objectArray[1] = new _95[]{_5n_0.c("C", (Object)this, -772284832818516264L, (long)l2), _5n_0.c("C", (Object)this, -762073593585869708L, (long)l2)};
        objectArray[0] = l6;
        _5n_0.c("\u00d1", (Object)this, (Object)objectArray, -769444508592401393L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                block10: {
                    a.init(_5n_0.class, 28);
                    _5n_0.b = dev.krypton.l.a(-7347387722278466899L, -5108533722037021182L, MethodHandles.lookup().lookupClass()).a(152846544681485L);
                    var16 = _5n_0.b ^ 5179348844626L;
                    var18_1 = var16 ^ 136709183592089L;
                    _5n_0.k = new Object[221];
                    _5n_0.l = new String[221];
                    _5n_0.b();
                    _5n_0.f = new HashMap<K, V>(13);
                    var5_2 = Cipher.getInstance("DES/CBC/NoPadding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var16 >>> 56);
                    for (var6_3 = 1; var6_3 < 8; ++var6_3) {
                        v2 = v2;
                        v2[var6_3] = (byte)(var16 << var6_3 * 8 >>> 56);
                    }
                    var5_2.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var11_4 = new long[14];
                    var8_5 = 0;
                    var9_6 = "\u00dd\r\u008d%v\u0016[(\u00cdMXgO\u0018Qo\u00d0\u009c\u0080\u00d5\u00f3@E\u00a7%\u0004q\u00c2\u0002\u00c2\u00e9\u00e9\u0010s\u00ebK\u00d4\u00dd\u00cf`\u00a1L\u00e6\u0083\u00ccr(-\u00a9\u00fe\u00e4}\u00d41\u00c4gJ\u00b5#\u008f0\u0014\u00caAu=\u0012N\u00c5>\u00e3[\u0083\u00bf\u0091\u000e\u0086\u00f8h\u0092\u00c8rw\u0097el\u00d6(F<E\u0016O\u00d8f\u0011";
                    var10_7 = "\u00dd\r\u008d%v\u0016[(\u00cdMXgO\u0018Qo\u00d0\u009c\u0080\u00d5\u00f3@E\u00a7%\u0004q\u00c2\u0002\u00c2\u00e9\u00e9\u0010s\u00ebK\u00d4\u00dd\u00cf`\u00a1L\u00e6\u0083\u00ccr(-\u00a9\u00fe\u00e4}\u00d41\u00c4gJ\u00b5#\u008f0\u0014\u00caAu=\u0012N\u00c5>\u00e3[\u0083\u00bf\u0091\u000e\u0086\u00f8h\u0092\u00c8rw\u0097el\u00d6(F<E\u0016O\u00d8f\u0011".length();
                    var7_8 = 0;
                    while (true) {
                        var12_9 = var9_6.substring(var7_8, var7_8 += 8).getBytes("ISO-8859-1");
                        v3 = var11_4;
                        v4 = var8_5++;
                        v5 = ((long)var12_9[0] & 255L) << 56 | ((long)var12_9[1] & 255L) << 48 | ((long)var12_9[2] & 255L) << 40 | ((long)var12_9[3] & 255L) << 32 | ((long)var12_9[4] & 255L) << 24 | ((long)var12_9[5] & 255L) << 16 | ((long)var12_9[6] & 255L) << 8 | (long)var12_9[7] & 255L;
                        v6 = -1;
                        break block10;
                        break;
                    }
lbl32:
                    // 1 sources

                    while (true) {
                        v3[v4] = v7;
                        if (var7_8 < var10_7) ** continue;
                        var9_6 = "\u0081\u00f1\u00b0@\u000b\u00a1\u00aey=[\u00db\u00c5\u000b\\\u00cf\u008f";
                        var10_7 = "\u0081\u00f1\u00b0@\u000b\u00a1\u00aey=[\u00db\u00c5\u000b\\\u00cf\u008f".length();
                        var7_8 = 0;
                        while (true) {
                            var12_9 = var9_6.substring(var7_8, var7_8 += 8).getBytes("ISO-8859-1");
                            v3 = var11_4;
                            v4 = var8_5++;
                            v5 = ((long)var12_9[0] & 255L) << 56 | ((long)var12_9[1] & 255L) << 48 | ((long)var12_9[2] & 255L) << 40 | ((long)var12_9[3] & 255L) << 32 | ((long)var12_9[4] & 255L) << 24 | ((long)var12_9[5] & 255L) << 16 | ((long)var12_9[6] & 255L) << 8 | (long)var12_9[7] & 255L;
                            v6 = 0;
                            break block10;
                            break;
                        }
                        break;
                    }
lbl45:
                    // 1 sources

                    while (true) {
                        v3[v4] = v7;
                        if (var7_8 < var10_7) ** continue;
                        break block11;
                        break;
                    }
                }
                var13_10 = v5;
                var15_11 = var5_2.doFinal(new byte[]{(byte)(var13_10 >>> 56), (byte)(var13_10 >>> 48), (byte)(var13_10 >>> 40), (byte)(var13_10 >>> 32), (byte)(var13_10 >>> 24), (byte)(var13_10 >>> 16), (byte)(var13_10 >>> 8), (byte)var13_10});
                v7 = ((long)var15_11[0] & 255L) << 56 | ((long)var15_11[1] & 255L) << 48 | ((long)var15_11[2] & 255L) << 40 | ((long)var15_11[3] & 255L) << 32 | ((long)var15_11[4] & 255L) << 24 | ((long)var15_11[5] & 255L) << 16 | ((long)var15_11[6] & 255L) << 8 | (long)var15_11[7] & 255L;
                switch (v6) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl58:
                    // 1 sources

                    ** continue;
                }
            }
            _5n_0.d = var11_4;
            _5n_0.e = new Integer[14];
            var0_12 = Cipher.getInstance("DES/CBC/NoPadding");
            v8 = SecretKeyFactory.getInstance("DES");
            v9 = new byte[8];
            v10 = v9;
            v9[0] = (byte)(var16 >>> 56);
            for (var1_13 = 1; var1_13 < 8; ++var1_13) {
                v10 = v10;
                v10[var1_13] = (byte)(var16 << var1_13 * 8 >>> 56);
            }
            break block12;
lbl72:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_12.init(2, (Key)v8.generateSecret(new DESKeySpec(v10)), new IvParameterSpec(new byte[8]));
        var2_14 = -4097410807828813242L;
        var4_15 = var0_12.doFinal(new byte[]{(byte)(var2_14 >>> 56), (byte)(var2_14 >>> 48), (byte)(var2_14 >>> 40), (byte)(var2_14 >>> 32), (byte)(var2_14 >>> 24), (byte)(var2_14 >>> 16), (byte)(var2_14 >>> 8), (byte)var2_14});
        ** while (true)
        _5n_0.j = ((long)var4_15[0] & 255L) << 56 | ((long)var4_15[1] & 255L) << 48 | ((long)var4_15[2] & 255L) << 40 | ((long)var4_15[3] & 255L) << 32 | ((long)var4_15[4] & 255L) << 24 | ((long)var4_15[5] & 255L) << 16 | ((long)var4_15[6] & 255L) << 8 | (long)var4_15[7] & 255L;
        _5n_0.cfr_renamed_0 = new _8B((int)_5n_0.a("l", (int)6394, (long)(5807584174057813843L ^ var16)), var18_1, (int)_5n_0.a("l", (int)7245, (long)(1950686757971751917L ^ var16)), (int)_5n_0.a("l", (int)13780, (long)(929628377948609148L ^ var16)));
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (l[n3] != null) {
            return n3;
        }
        Object object = k[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 47;
            case 1 -> 6;
            case 2 -> 50;
            case 3 -> 19;
            case 4 -> 34;
            case 5 -> 28;
            case 6 -> 16;
            case 7 -> 30;
            case 8 -> 42;
            case 9 -> 9;
            case 10 -> 26;
            case 11 -> 45;
            case 12 -> 24;
            case 13 -> 12;
            case 14 -> 27;
            case 15 -> 8;
            case 16 -> 58;
            case 17 -> 29;
            case 18 -> 32;
            case 19 -> 35;
            case 20 -> 31;
            case 21 -> 36;
            case 22 -> 43;
            case 23 -> 7;
            case 24 -> 1;
            case 25 -> 60;
            case 26 -> 54;
            case 27 -> 39;
            case 28 -> 13;
            case 29 -> 15;
            case 30 -> 49;
            case 31 -> 20;
            case 32 -> 5;
            case 33 -> 18;
            case 34 -> 59;
            case 35 -> 3;
            case 36 -> 40;
            case 37 -> 21;
            case 38 -> 14;
            case 39 -> 17;
            case 40 -> 56;
            case 41 -> 62;
            case 42 -> 57;
            case 43 -> 46;
            case 44 -> 44;
            case 45 -> 38;
            case 46 -> 4;
            case 47 -> 41;
            case 48 -> 33;
            case 49 -> 48;
            case 50 -> 37;
            case 51 -> 51;
            case 52 -> 2;
            case 53 -> 52;
            case 54 -> 11;
            case 55 -> 61;
            case 56 -> 10;
            case 57 -> 0;
            case 58 -> 63;
            case 59 -> 53;
            case 60 -> 55;
            case 61 -> 22;
            case 62 -> 25;
            default -> 23;
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
        _5n_0.l[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = k;
        k[0] = "\r$j?\u0014b\r$}c\u0018m\u0017o}}\u0018x\u0010\u001e()A;";
        objectArray[1] = "\u0013V)=\u0014<\r^3ru9\r^02[%";
        objectArray[2] = "\u001c\rZ\bO?\u0002\u0005@G2/\u0002";
        objectArray[3] = "c\u0000\u001cv\u0010t}\b\u00069Mu{\u0004\u000bz\u0010R}\u0013\u000fvS";
        objectArray[4] = "\r\u0015\t\u000fZ?\r\u0015\u001eSV0\u0017^\u001eMV%\u0010/L\u0018\u0005e";
        objectArray[5] = Long.TYPE;
        _5n_0.l[5] = "java/lang/Long";
        objectArray[6] = "n\u00033`\u00060s\u00161!\u0003l>0";
        objectArray[7] = Integer.TYPE;
        _5n_0.l[7] = "java/lang/Integer";
        objectArray[8] = "14\u001aD\u00111:;\u000b\u000bp?10\u000fQ";
        objectArray[9] = "*)w`\bi4!m/n}3 RdR";
        objectArray[10] = "\u001b\u0005h\n|6\u0005\rrE\u0011,\u001d\b{\b&*\u001e\n";
        objectArray[11] = Boolean.TYPE;
        _5n_0.l[11] = "java/lang/Boolean";
        objectArray[12] = "\"\u0007\u001a\u001dJt<\u000f\u0000R-u-\u0014\r\b\u000bs";
        objectArray[13] = "o\u0005~\u000bviq\rdD\u0014uv\u0010";
        objectArray[14] = "\nZ\u0014d#R\u0017O\u0016%&\u000e[Q";
        objectArray[15] = "]'\u0002\"8!(\u0007\t-)nI\t\u0002&-4=";
        objectArray[16] = "\\i\u000fJ$\tBa\u0015\u0005K\u000eDi\u0000gc\u000fB";
        objectArray[17] = "\u000485({r\u00048\"tw}\u001es\"jwh\u0019\u0002s?'\"";
        objectArray[18] = Void.TYPE;
        _5n_0.l[18] = "java/lang/Void";
        objectArray[19] = "t\r\u000f1\u001b\u001et\r\u0018m\u0017\u0011nF\u0018s\u0017\u0004i7I&GN>\u000b\u0017~\u0005\u0004E^M(C";
        objectArray[20] = "\u0015+<H[\u0017\u0015++\u0014W\u0018\u000f`+\nW\r\b\u0011}^\u0007G";
        objectArray[21] = "D\u001enQVmZ\u0016t\u001e\u001em@\u001clY\u0017v\u00009m^\u001blG\u0010v";
        objectArray[22] = "e/\u0010'\n\u0019{'\nhi\r\u007f";
        objectArray[23] = "F{(R9\u0001Mt9\u001d[\u0002B}";
        objectArray[24] = "^\tV%g/+)]*v`J'V!r:>";
        objectArray[25] = Float.TYPE;
        _5n_0.l[25] = "java/lang/Float";
        objectArray[26] = "\u000f!;;MN\u000f!,gAA\u0015j,yAT\u0012\u001by$\u0012\u0015";
        objectArray[27] = "l}\u001a\u000e\u001f4ru\u0000AW4h\u007f\u0018\u0006^/(_\u0003\u0001B4ky\u001e";
        objectArray[28] = "e@0\u0003\u000b\u001c{H*LV\u001d}D'\u000f\u000b*`M*\u0007F\u001d`S5";
        objectArray[29] = "|\u001cnrG6b\u0014t=\u001a7d\u0018y~G\u0000y\u0011tv\n7y\u000f";
        objectArray[30] = "*Qo@\u001bc*Qx\u001c\u0017l0\u001ax\u0002\u0017y7k.V@2";
        objectArray[31] = "\t/GB#\u001f\t/P\u001e/\u0010\u0013dP\u0000/\u0005\u0014\u0015\u0000]~";
        objectArray[32] = "?:3\u000eC\u0018?:$RO\u0017%q$LO\u0002\"\u0000q\u0013\u0016";
        objectArray[33] = "83\"V8P835\n4_\"x5\u00144J%\tdOl\b";
        objectArray[34] = "W+VMBdW+A\u0011NkM`A\u000fN~J\u0011\u0014S\u001e:";
        objectArray[35] = "x\u001f@\u0019p e\nBXu|*\u0002";
        objectArray[36] = "8~No\n\nM^E`\u001bE,PNk\u001f\u001fX";
        objectArray[37] = "\u001f\u001b\fMN\u001a\u0001\u0013\u0016\u0002(\u000e\u0006\u00127M\u0010";
        objectArray[38] = "om$\u000b\u001b+om3W\u0017$u&3I\u00171rWb\u001dDt";
        objectArray[39] = "M\u0016,q\u001bgM\u0016;-\u0017hW];3\u0017}P,ojD<";
        objectArray[40] = ":\u001cChBd:\u001cT4Nk WT*N~'&\u0005~\u001f;";
        objectArray[41] = "KC\u001bp\u0006o}f\u001bp\u00113qi\u0001;\u0011-q|\u0006J@y\"9N";
        objectArray[42] = "L\u00029=\u0005WG\r(rfZR\u000b";
        objectArray[43] = "/\bSTL\n1\u0000I\u001b \u00161:@A";
        objectArray[44] = "I^k\u0018\nAI^|D\u0006NS\u0015|Z\u0006[Td-\u0005T\u0010\u0003XsW\u0014[x\t,\u0005^";
        objectArray[45] = "\u0005*n[\n\\\u0005*y\u0007\u0006S\u001fay\u0019\u0006F\u0018\u0010)@T\u0007";
        objectArray[46] = Double.TYPE;
        _5n_0.l[46] = "java/lang/Double";
        objectArray[47] = "|\u0018A jl\t8J/{#h6A$\u007fy\u001c";
        objectArray[48] = "l\u0018\u0007zq[l\u0018\u0010&}TvS\u00108}Aq\"Ag/\n";
        objectArray[49] = "\\j\u0016^##\\j\u0001\u0002/,F!\u0001\u001c/9APPFvz";
        objectArray[50] = ":\u000f~lq\u0002O/uc`M.!~hd\u0017Z";
        objectArray[51] = "&\u0004|tLc&\u0004k(@l<Ok6@y;>:c\u00118l\u0002d;Ry\u0017S1j\u0012";
        objectArray[52] = "\u0017Tm$)t\u0017Tzx%{\r\u001fzf%n\nn-?|*";
        objectArray[53] = "!W!1\u000e\u0004!W6m\u0002\u000b;\u001c6s\u0002\u001e<mg+P";
        objectArray[54] = "\u0019\\s Z\u001d\u0019\\d|V\u0012\u0003\u0017dbV\u0007\u0004f0;\u0000";
        objectArray[55] = "9YrwJ\u00049Ye+F\u000b#\u0012e5F\u001e$c1m\u0011";
        objectArray[56] = "k\u0005<a`nk\u0005+=laqN+#ltv?|~53";
        objectArray[57] = "\u001cD\"\u0015\u0003x\u001cD5I\u000fw\u0006\u000f5W\u000fb\u0001~a\u0003]\"";
        objectArray[58] = "\u0017\u0016$W\u0011Gb6/X\u0000\b\u00038$S\u0004Rw";
        objectArray[59] = "07\u0001h\u0014E2)H\u0017\u000bK+ \u0014(\u0017E1#\u0005";
        objectArray[60] = "ic-(Jhk}dWUfrt8hIhhw";
        objectArray[61] = ",C\r_Q\u007f1V\u000f\u001eT#q\u0014";
        objectArray[62] = "5\u0001F\u0006s`@!M\tb/!/F\u0002fuU";
        objectArray[63] = "hHo|>U\u001dhds/\u001a|fox+@\b";
        objectArray[64] = "Fd\u0016[by[q\u0014\u001ag%\u001aC";
        objectArray[65] = ")OVQf9\\o]^wv=aVUs,I";
        objectArray[66] = "x_Yfr$eJ['wx%B";
        objectArray[67] = "{ /!p0e(5n\u0013$ae\u001c.*7h";
        objectArray[68] = "9\u0012o(\tbL2d'\u0018--<o,\u001cwY";
        objectArray[69] = "\u001c\u0019+v\u0000I\u0001\f)7\u0005\u0015L\u0017";
        objectArray[70] = "\u0018*@4O0m\nK;^\u007f\f\u0004@0Z%x";
        objectArray[71] = "{?\u001e'/i\u000e\u001f\u0015(>&o\u0011\u001e#:|\u001b";
        objectArray[72] = "\nDiZ\b\u001f\u007fdbU\u0019P\u001eji^\u001d\nj";
        objectArray[73] = "C\u0004\u001e{N~^\u0011\u001c:K\"\u0013\u0013";
        objectArray[74] = "P.P<\u0013\u0012%\u000e[3\u0002]D\u0000P8\u0006\u00070";
        objectArray[75] = "<D\u001bLpiId\u0010Ca&(j\u001bHe|\\";
        objectArray[76] = "3p\u001b5&\u001e.e\u0019t#BcS";
        objectArray[77] = "@].|\u001c%5}%s\rjTs.x\t0 ";
        objectArray[78] = "!NT?r\u001b!NCc~\u0014;\u0005C}~\u0001<t\u0012\"*B";
        objectArray[79] = "+\u0007ebh?+\u0007r>d01Lr d%6=#\u007f=d";
        objectArray[80] = ")CyHcB\u001ffyHt\u001e\u0013ic\u0003t\u0000\u0013|dr%_G?,";
        objectArray[81] = "\u0015pty>U`P\u007fv/\u001a\u0001^t}+@u";
        objectArray[82] = "opAVilopV\necu;V\u0014evrJ\u0007J0=";
        objectArray[83] = "}\\Q\"\r4}\\F~\u0001;g\u0017F`\u0001.`f\u0017>Tk";
        objectArray[84] = "TDi4LhTD~h@gN\u000f~v@rI~/,\u00163";
        objectArray[85] = "bM\u00066\"{bM\u0011j.tx\u0006\u0011t.a\u007fw@ ~*";
        objectArray[86] = "0)X\u0013MO'}G\u000e}D%i$NE\u001d&`\u001d\u001c\u0016\u0010>\u0019\u0019KAK5 K\u0018LSL$\u001cO\u0017XuvOB\u000f!";
        objectArray[87] = "ltH['lh/I\u0010Y2\u0005u\u0011Lak:q\b[46\u0005&\u001bG#<|sHD(\r";
        objectArray[88] = "7XiK\u001c\u0010uS8\\%\u0019\u000b\u00031\u000bOQ2Qb\u0006W";
        objectArray[89] = "qq\t!wZ#.U J\u000fw=Q;&=#{\u000fbvj!\"W`)\u0018\"zKfJW\"}[%s\u0005qpC\\wR&+He%\u0001+317:\u0007%;^ '\u0012eA";
        objectArray[90] = "-\u0017#\\[=+\u0007;Zc;,\u0006$W\u000f\tzK|\b]^z\u0019\"\f\u0000,yA>\nc3~\u0006}Q\u0003a1\u0007;0";
        objectArray[91] = "\u000f56^U\u000e]jj_h[\tynD\u0004iX>6\u001fX>Y=2I\u0011\u0007\u000bn?Qh\u0003\\9dZQQ\u000f4|#";
        objectArray[92] = "2?1\u0013;n24(\rAfw4\"\u0007=`qYh\u001c&ve2f\u001e(g\u000b";
        objectArray[93] = "VE9FNER\u001e8\r0\u0014?D3R[Z\u0002\u0012aLL\u001b";
        objectArray[94] = "#\u0015k\u0004-`4At\u0019\u001dk>C\u0017Y%25\\.\u000bv?-%*\\!d&\u001cx\u000f,|_\u0018/XwwfJ|Uo\u000e";
        objectArray[95] = "_\fq\u0005T6[WpN*f6\ru\u000f\u00106P^;\u0010\u001ak";
        objectArray[96] = "'\u001eu\u0018\n\fe\u0015$\u000f3\u000e\u001b\u0018t\u0005SO'\u0018y\u001dZ";
        objectArray[97] = "RX=(^J\r\u0003|j$AZGcwHs\u0007\u00009($TVEj.\u001e@GW~\u0010UN]Ihr[\u001eVI\u0003";
        objectArray[98] = "X\rw\u001a\u0007\b\\VvQyY1\f.\rA\u000f\u000e\b7\u001a\u0014R1\buW\u0013\u0010\bZ&Z\u000bi";
        objectArray[99] = "\u0014\u0019AU0+\u0010B@\u001eNwD!BG(r\u001b\u001eF^?'F!\u0010T#u\u0007N\u0007I65}";
        objectArray[100] = "w0hG*{3cwLK#c\"pG'\u00115n*\u0011wFtguZu,|o*FK";
        objectArray[101] = "#=u\u0018O3|?{\u0007+3&(}\u0006|dx\u007f%j\u0012g-8)TL y<a";
        objectArray[102] = "mF-PpmoD?\u0001\fl~[MQs/o_?\u0012ae}'p\u00137x{U3\u0001}j\u0003\u001a2W`lqY \u001dr\u0014";
        objectArray[103] = "d@I)>28\fM#G6?\\\u0017 \u0010ig\u0001JLz`b[\nu(3oC";
        objectArray[104] = "=/mCV\u0006}>*^)\u001a&3vJ~M}a#\u001a)\u000e6!wY[N'fj";
        objectArray[105] = "vJl?5(r\u0011mtKu\u001f\u001c7.w5f\u001e5<&";
        objectArray[106] = "S\u0014%!3v\u0013\nwu\th@\u000bt,eZ\u0014J/t5\rR\u001d}3y=@\u001e-u\tmL\u0016t05mA\u000e}K";
        objectArray[107] = "!W\u001cl\u0014}s\b@m)('\u001bDvE\u001av\\\u001c,\u0016M*\u0006EqRq*\u000b]x)";
        objectArray[108] = "F`EdC|GhW$/yM~YzCK\u0019<\u0002 \u001e\u001c\u001d:\u0005wV%Oi\bo/!\u0018>Sd\u0016sK3K\u001d\u0012$\u001ch@$@w\u0011p9}DeR;[|Rc ";
        objectArray[109] = "A\u0007=m@;\u0010^r7\",M\u001b#iN\u001e\u001bZx?\u001bIMX?7C)\u001f\u0017>q\"-L\u0019\"kG(E]s\u000e\u001fq\u001c\r:7M\"\u0011\u0015C";
        objectArray[110] = "@\u001c:u>QA\u0014(5RTK\u0002&k>f\u001fD~4l1ZD'obUY\u001dytR";
        objectArray[111] = "Ir v\f\u0007G\"+vg\u0000Ud*c\u000b2\u0002&p>Ze\b$-5^\u0014I %xg";
        objectArray[112] = "5Z!\u001fBC5Q8\u00018QpF%\u000b]*6S:\u000bGJlUx[8";
        objectArray[113] = "\nTK6=\u001dV\u0018O<D\u0012]Y\u00114( \u0000\u001eKoDLSCM06O\u000b_KS";
        objectArray[114] = "n9#R&jjm-Np[2l=@&7\u0000;{\u0011yjWj1M~!8},X>[";
        objectArray[115] = "J{p`lI\bp!wUOv$szm\u0017I jm8Jvsq|i\r\u000fqsn8q";
        objectArray[116] = "Xd?z\u0001\u001e\\8>kP&\u0004h'f\tJ6;a8Q\u001ba<98PZ[;+?SFa";
        objectArray[117] = "Ci!b,+Jcss,@!asp%@Ci!b,+Jcss,";
        objectArray[118] = "WmRk6;\u00074@$9D\u00007Oq7\u0013Rn\u001d,gDWmRk6;\u00074@$9";
        objectArray[119] = "!\fWBK*gP\u0012K\rV}[TGW:O\t\u0011\u001e\rh\u0018\u000f\u0010^\f,jDA\u001c\\$\u0018";
        objectArray[120] = "e]]TRh-]X\rS\u00102XU\fFGe\u0001\u0001R\u0016\u0010eZHXE/%B\u0005\u0001\u001a";
        objectArray[121] = "??\u0003ayocs\u0007k\u0000`h2YclR5u\u0002=\u00008=rS}9jn\u007fK\u0004==9$@=on4<9?cc9-K<;\u007f?N";
        objectArray[122] = "\u0003\u001d\u0016J@A\u0007F\u0017\u0001>\u001fjKM[\u0002\\\u0013IOIS";
        objectArray[123] = "W=Kr kW6RlZx\u0003>Eq7\u0002S$\u0019c\"p\u00106SqZ2R<\u00136+sV4^\u000f";
        objectArray[124] = "ue>*fv/c|z\u0019x.l \n\u007fgOzw&\"h,i\"#\u0019";
        objectArray[125] = "]dR\u001d66RbIM\u000b0[9S\u001aL 2fM\u00117-@e\u0015\r1N]dR\u001d66RbIM\u000b";
        objectArray[126] = "g~\u0004L\\4c%\u0005\u0007\"m\u000e\u007f][\u001a31{DLOn\u000e,WPXdwy\u0004SSU";
        objectArray[127] = "([`JX`kI*X \u007flY2B[\u0012([`JX`kI*X \")Cj\u001fQc-K'&";
        objectArray[128] = "\\Y.0-\u0001\u001eR\u007f'\u0014\t`\u0002vp~@YP%}f";
        objectArray[129] = "\u000b+i\u007fB+\r;qyz&\u0006+j\u007f-sZ\u007f2(z$\n!b+\u0019\"\u001a9d";
        objectArray[130] = "G*g \u001a)S;u4$vZ7y.HD\u000es!y\u001d\u0013\u000e)'wX)\t; tD\u0013G*g \u001a)S;u4$";
        objectArray[131] = "6\u0004\u0016%x|i\u0006\u0018:\u001c|3\u0011\u001e;K+mCAW%+6@\u001a%m#n\u0018A";
        objectArray[132] = "\u0007\n4\nL\u0007L[vZDu[_1VQ\u0019i\bq\u0007\u000bI>\u000b/\b\b\t\u0004\f=\u000f\u000b\u0015>\u000buO\n\u000fL@$\rZ\u0007>";
        objectArray[133] = "\u00079l%\u001av\tig%qq\u001b/f0\u001dCLm<oM\u0014O0vg\u001e+\u000f(;>A\u0014";
        objectArray[134] = "4u\u0013c\u000f\u0000'z\u0004:~\u00121O\u0015 ~\r:u\u001a5\u0019\u0016-/B\\";
        objectArray[135] = "i3\u0002\u0014Ncmh\u0003_0?D\u000b\u0001\u0006V:f4\u0005\u001fAo;\u000bS\u0015]=zdD\bH}\u0000";
        objectArray[136] = "c\u000f Dc\u001fk\fvY[O._4N'I(2~U<_<YpW2NR";
        objectArray[137] = "T\\6wUT\u0014Lg 7PDYk([b\u0010\u001d2w\f5\u0014\u001d7%N\fFN:=7\b\u0011\u0019a6\u000eZB\u0014yO\n\r\u0015OrvX^\u0018W\u000b2N\b\u0011Gjr^YF%";
        objectArray[138] = "U\u001f=\u0018R/\u0000L>\u0013c?S\u001aP_\u001cmS\u000e\"\u001c\u000e'Av`^\u0004g\u0006\u0007!Z\f*?";
        objectArray[139] = "\u0006hz\f\u000e4\u0011<e\u0011>!\u001b>\u0006\u0013T3\u0002(6\u0001WcDXy\u0006W\"\nhk\u0005\u0007dz";
        objectArray[140] = "3W\u0011G{,a\bMFFy5\u001bI]*Kd\\\u0011\u0007v\u001c'\r@B6,5\u000e\u0010\u0004F";
        objectArray[141] = "vQ\u000b\u0011=v,\u0013IJ\u0006u}V\u0016HjG+\u0017N\u00176\u0010}\u0015\n\u0016gp/Z\u000bP\u0006-(\u0016\u001cV?\u007f{\u001b\u0004/";
        objectArray[142] = "L\u007f\u0017Jmp\u0007.U\u001ae\u0002\u001b&\u0003\u0012{UL|SO\u0017}\u001f.\u0016\u0006'o\u001c~P";
        objectArray[143] = "\\e\u0004~J\u0004\u001enUis\r\u0003\u0003\u0002y\u000e\u0002[eX;LY";
        objectArray[144] = "?I;\r!b;\u0012:F_:VHb\u001ageiL{\r28VH1\u00194}k\u001ec\u0007#<V";
        objectArray[145] = "MbISgw\u0017d\u000b\u0003\u0018|\u0010i_WskwnW[z~\u0010u@\u0001\"\u0017Jr\u0000V`e\t`JD\u0018";
        objectArray[146] = "bel~V^vt~jh\u0001\u007fxrp\u00043+<()Pd/<.}\u0011]}o#eh";
        objectArray[147] = "uZ<\\y{q\u0001=\u0017\u0007$\u001c[eK?|#_|\\j!\u001cR:J6#m\u0013>B{\u001a";
        objectArray[148] = "^5/\b\u0011!J$=\u001c/~C(1\u0006CL\u0017lk_\u0013\u001b\u0013lm\u000bV\"A?`\u0013/";
        objectArray[149] = "\u000fiq{\u0000\u0014\\'nq]r\u000bW3\"\u0007JPh7;\u0010\u001f\rW7y]\u0018One*P\u00006";
        objectArray[150] = "$a\"JUwx-&@,xslxH@J'!\"\u001f\u0014\u001d$a\"JUwx-&@, &,rV\u0015ru!j/\u0016rlygOLt.)\u0018";
        objectArray[151] = "\u001a\u0002vuF\u000eEY77<\u0005\u0012\u001d(*P7O_rq<\u0012\u001e\b7t\u0003Q\u0019\u0000uM\u0001XC\u000b1tS\u000bN\u0013Hp\u0004\\\u0015\u0018q\"WQ\rauu\u0000\n\u0006X'&\r\u0012\u007f";
        objectArray[152] = "%pxc\n\u00166%}X\u001b\u0018)K 'O\u0019-9c5\u0005\u000bU";
        objectArray[153] = "<\u001c\u001d|\u0014\u00118@\u001cmE){\u0014\u001d}\u0016R\u0005D\u001bd\t\u0012z\u0003\u0003r\u0003P\u0005";
        objectArray[154] = "\u000e`Hwg\u0018Qc\\uw|RhJx`\u0010`<\u000f%=G78\u000e$m\u0005\u000ej])u|";
        objectArray[155] = "X@T:{^\u0003LNa\u001f\r\nL|={dYCMbv\u0002]G\rf\u001fTZG\u0004`n\u0015^OIY";
        objectArray[156] = "0}/7\u0019^>\u007f!&wSm\u007f4FJJ;c04\tXqqH";
        objectArray[157] = "S%[{\u0003[WqUgUj\u000fpEi\u0003\u0006='\u00038\\Uj$\u0005x\u0019\f\u0004,Yq\u001f\u0004jvId[\u0010\u0005aTq\u001bj";
        objectArray[158] = ")/G3wb-tFx\t>@.\u001e$1e\u007f*\u00073d8@}\u0014/s29(G,x\u0003";
        objectArray[159] = "%#$\b7W{dp\f\u007fiyt2\u0015`\u0005K\"wI8W\u001c#?Ob\u0010v\u007fsKhi";
        objectArray[160] = "\n1.S\u001fjP7l\u0003`dT7 \u007f\tr039S\u0000w\u000e<5\\\u0018\n\n1.S\u001fjP7l\u0003`";
        objectArray[161] = "O\t<\u0006\t8\u0017\u0002n\u001cIVHi:\u001eTn\u0010V>\u0007C;Mi2@\\5NX:C\n(v";
        objectArray[162] = "=\nqEd<iYpRc\f4!\u001b\u0002\u007fj<\u0007$\u0006f}iZ\u001bPla;\u001btGqt{a";
        objectArray[163] = "`*X3dDb(Jb\u0018Vj&Qu\u0018V~&\u0007uwAc3G\u000f";
        objectArray[164] = "7V\u000emFYm\u0007\b\u007f>YP^\u0017w\u0006\u0006oZ\u000e`S[P\f\u0004|\u0001\u001a?\u001b\u0019iA`";
        objectArray[165] = "Glp`2\u0000Od/|\f\u000fP)u}`=\u0006d*+7j_eec0\u000fQeey\f\u0001M8*`c\u0016P-j\u001a";
        objectArray[166] = "-@Xl\u0017G/BJ=kQ.]8m\u0014\u0005/YJ.\u0006O=!\u0005/PR;SF=\u001a@C";
        objectArray[167] = "B9g%U!\u0018?%u*/\u001f,X%A!x4%<S}\u001d:%<IA\u0013&xsP.\u0004;m3*";
        objectArray[168] = "X.t\n\u001d\u0018\nq(\u000b M^b,\u0010L\u007f\n$rI\u0019(\b}*KCZ\u000b%6M \u0015\u000b\"&\u000e\u0019GX/>w\u001d\u0010\u000ft5NOC\u0002lLLCN\u000f}>O\u001bR\t\u001e";
        objectArray[169] = "G\u000fR\b;-\u0005\u0004\u0003\u001f\u0002({T\nHhlB\u0006YEp";
        objectArray[170] = "P\u001d:v?+\u0012\u0016ka\u0006(l\u001f6tgv\t\u001a?06";
        objectArray[171] = "g~k}n=8|eb\n=bkcc]j=68\u000fo0=>}a0k||";
        objectArray[172] = "\fIw)-cLW%}\u0017}\u001fV&${OK\u0014zx)\u0018\r@/;g(\u001fC\u007f}\u0017g\u0018C>3'u\u001b\u0013xChr\u001bR6szqK\u0014F<}q\nZv.~!L*";
        objectArray[173] = "Onp`\u0005,\u0013sg}XG:DJY4GOnp`\u0005,\u0013sg}X";
        objectArray[174] = "YOPjRs\u001eLH*X\u0013\u000fK]HZw\u001dK!+L(\f^Sh^b\u001e&";
        objectArray[175] = "vqBh9!*=Fb@%-m\u001ca\u0017zu0@\r}spj\u00014/ }r";
        objectArray[176] = "ZB+\n\bT\u0001N1Ql\u000f\u001fo/\u0011\u0010\u001fd\u0012v\u000e]W\u0015Sr\u0006\u0010n";
        objectArray[177] = "gE\u001e@*k7\u001c\f\u000f%\u00140\u001f\u0003Z+CbFQ\u0007y\u0014gE\u001e@*k7\u001c\f\u000f%";
        objectArray[178] = "\t,o0w \rxa,!\u0011Uyq\"w}g.7s(*0\u007f}//k_h`:o\u0011";
        objectArray[179] = "d\u000fHw;o8CL}B`3\u0002\u0012u.ReAH)x\u0005.\u001f\f{|?:\u000e\u001eoB>=\u0018Nq0=e\u0004H\u0012";
        objectArray[180] = "J\u001dn@\u0004H\fA+IB4\u0016JmE\u0018X$\u001e \u001eE\u0005sGpD\u001fOOG}\\\u00164";
        objectArray[181] = "\u0019N\u0002v i\u0006\u001a\u0000u]+\t\u000b\u007f*el\u000e\u000eFx6a\u0016w\u0014g0o\u001e\u0018\u0003z%/d";
        objectArray[182] = "N\u001a?u\u001f\u0006\f\u0011nb&\u0007rLcn\u0017\u0007\u0003\rgfZ";
        objectArray[183] = "Et\u001a^_^R \u0005Co[^?fA\u0005YA4VS\u0006\t\u0007D\u0019T\u0006HIt\u000bWV\u000e9";
        objectArray[184] = "\u000e\u001b\u0012\u0003%\u0002\u000f\r\u0014qy\r\u0012\u0010\f\u001dK\\VJPI\u001c\u0010U\u0015P\u000f\u007f\u0003\u0000\u0010k";
        objectArray[185] = "\n#\u001bxrl\u0015w\u0019{\u000f:\u001aff$7i\u001dc_vdd\u0005\u001aV%hdNk\u0017!`)w";
        objectArray[186] = "{0^\u0006\u0019Ry2LWeU|5CW\u001e+*2F\u0001\fM.6\u0006\u0005e";
        objectArray[187] = "v\u0015l'(Br\u0011,#AE5\u001bnu=C3v$n&U'\u001d*l(DI";
        objectArray[188] = "\u0017_&{qwH\u0004g9\u000b|\u001f@x$gNB\u0000 y\u000b$J\u0000r:2v\u0019\rjC6!NVazdrCN\u00189zf\u0017Cjyk!\n<(\u007fl(KMi{derZz?ru\u0012[r-2\u0019";
        objectArray[189] = "ZNW\r\u000bGRM\u0001\u00103\u001d\f\u0015E\u0007R\u0010\u0010s\u0004\u0011\b\u001a\u0013\u0001G\u0003B\bkC\u0005\t\u0002O\u001a\u0002\u0001\u0001Ov";
        objectArray[190] = "\u0003z}\u0003\u001aj\u0007!|Hd4\u0013B~\u0011\u00023\f}z\b\u0015fQB,\u0002\t4\u0010-;\u001f\u001ctj";
        objectArray[191] = "\\\u00168NL\u0011\\\u001d!P6\u0011\t\u001cQ\u000eIC\t\b#M[\t\u001bpa\u000fQI\\\u0001 \u000bY\u0004e";
        objectArray[192] = "j|\bK\u0000\u0002}(\u0017V0\u0016q1\u0012G0\fw-\u0014P\f\fz5\u001d+\rT*&\r\u0012_\u0007'>t";
        objectArray[193] = "uFANdxqB\u0001J\re6_T\u001ch\u001epJK\u001cr~*L\tL\r";
        objectArray[194] = "R\"'\u0019BiZ!q\u0004z#\u001fe$\u0013\u001fXYp;\u0013\u00058\u0003vyCz";
        objectArray[195] = "\u0018y~x@\u0016H l7Oi[%roQ\bF$BkB\u0013L/u\u0006M\b@\"u:M\u0005X+\u000e?\u0013QE%3:I\u001b\u001d2\u000e";
        objectArray[196] = "|\\\u007f\n/&<B-^\u00158oC.\u0007y\n;\u0002u]*]}U'\u0018emoVw^\u0015`:\u0003$\u0019,2i\u000e<`";
        objectArray[197] = "aW*/1:e\u0003$3g\u000b=\u00024=1g\u000fUrln7X\u0010\"4.{h\u0002!dh\u000b'\u0005!%&;5\u0006qcVt2\u00060-ff1Vv]={5P22*f \u0010H";
        objectArray[198] = "vw{PH'=&9\u0000@U!.o\b^\u0002vt?V2*%&z\u001c\u00028&v<";
        objectArray[199] = "2WEPT_m\f\u0004\u0012.T:H\u001b\u000fBfg\bJW.\fo\b\u0011\u0011\u0017^<\u0005\th\u0013\tk^\u0002QAZfF{QH]%U\u0002PH\n*T{";
        objectArray[200] = "[JK~i%\u0018MC<PtHFFm\u0007#\u0012\u0012\u0013>PhHB]8o+OJ\u001f";
        objectArray[201] = ";\"\t\f\f\u001ey)X\u001b5\u001e\u0007%\t\u000eVDutPA\f";
        objectArray[202] = "#r\u0001\u001c\u0017L7c\u0013\b)\u0013>o\u001f\u0012E!j+EK\u0012vn+C\u001fPO<xN\u0007)";
        objectArray[203] = ",`/!Zsg1mqR\u0001{9;yLV,ck% ~\u007f1.m\u0010l|ah";
        objectArray[204] = "O\u0005<$olK^=o\u00110&\u00048.+l@Wv1!1";
        objectArray[205] = "p!\u00196;\u0004&s\u0007!z9r\u0011E>#\u0001/.A'4Tr\u0011AeyS0(\u00136tKI";
        objectArray[206] = "R\u0005k{(rV^j0V.]=hi0+]\u0002lp'~\u0000=:z;,AR-g.l;";
        objectArray[207] = "\u001dM_U\u001bhUE\u0007\r@\u001aA\u0019G\t\u001cvsM\nUB*$M\u0001\u0016\u001eaX\u000b]S\u0017'$";
        objectArray[208] = "Gco\u0017C\tFk}W/\fL}s\tC>\u0018;+V\u0013i\u001bp)\u000bV\u0003G<-\u0001/";
        objectArray[209] = "6v<\u001aS\b8t2\u000b=\u0003o\u007f\u001d\u0006M\u001f\u00064g\f\fZwuc\u0004Ac";
        objectArray[210] = "T\u0015\t%\u0006-\u0016\u001eX2?+h\u0013\b8_nT\u0013\u0005 V";
        objectArray[211] = "\tCYI8zI]\u000b\u001d\u0002d\u001a\\\bDnVN\u001dS\u0013<\u0001\u0017A\tCy=\u0017L\u0011J\u0002<O\u001c\u0002Z;n\u001c\u0011\u001a#";
        objectArray[212] = "N\u0012+ r2\u0014C-2\n2)G)0xoG\u0018+>g";
        objectArray[213] = "+\u001eNq;\u0014l\u001dV11t}\u001aCN7\u0005\u0012J@66\f`\tR|$t";
        objectArray[214] = "^HH!R=Z\u0013Ij,`7I\u00116\u0014:\bM\b!Ag7AO>Od\u0006ILhR\\";
        objectArray[215] = "(\u001dp_%[w\u001ed]5?t\u0015rP\"SFA7\r\u007f\u0003\u0011E6\f/F(\u0017e\u00017?";
        objectArray[216] = "*{\u00079%\u0004)l\t$\u001f\u0012/}yt`Q>y\u000b7r\u001b,\u0001D6$\u0006*s\u0007$n\u0014R<\u0006rs\u0012 \u007f\u00148aj";
        objectArray[217] = "\u000b\u0011<.Kg\t\u0013.\u007f7s\u0003\f&cls\u0019pet^c\u001f\u0019e\u007fG}e";
        objectArray[218] = "ms~!1F+/;(w:1$}$-V\u0003p0\u007fq\u0002T)`%*Ah)m=#:";
        objectArray[219] = "\u0000J\u001b\u0017_\rBAJ\u0000f\t<\u0015K\u000e\rK\u0001C\u0019\u0010\u001a\n";
        Object[] objectArray2 = objectArray;
        objectArray[220] = "ZSv\"(\u0007XQdsT\u0015STjw5\u0018Oq{oTCK\tzf&\u0000YCh\u001edBS\u0003/o%F[N\u0016";
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _5n_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'C' || c == '\u00f5' || c == 'w' || c == 'c') {
                field = _5n_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'C' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f5' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'w' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5n_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'u' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5n" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
        int n = _5n_0.e(l2, l3);
        Object object = k[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = l[n];
                int n3 = string2.indexOf(8);
                clazz3 = _5n_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5n_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5n_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5n_0.k[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5n_0.f(598340262950023L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5n_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5n_0.k[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5n_0.f(598340262950023L, 0L);
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
            int n = _5n_0.e(l2, l3);
            object = k[n];
            try {
                if (!(object instanceof String)) break block2;
                _5n_0.k[n] = clazz = Class.forName(l[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5n_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5n_0.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5n_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5n_0.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5n_0.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5n" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x76FB;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])f.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/5n", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5n_0.e[n2] = n3;
        }
        return e[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field g(long l2, long l3) {
        int n = _5n_0.e(l2, l3);
        Object object = k[n];
        if (object instanceof String) {
            String string = l[n];
            int n2 = string.indexOf(8);
            Class clazz = _5n_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5n_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5n_0.c(clazz3, string2, clazz2)) != null) {
                    _5n_0.k[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5n_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5n_0.k[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5n_0.f(598340262950023L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private ArrayList java_util_ArrayList_0(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        class_638 class_6382 = (class_638)objectArray[1];
        class_2919 class_29192 = (class_2919)objectArray[2];
        class_2338 class_23382 = (class_2338)objectArray[3];
        Object object = (Integer)objectArray[4];
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x3C521277512DL;
        long l5 = l3 ^ 0x5B241BA32863L;
        ArrayList arrayList = new ArrayList();
        CallSite callSite = _5n_0.c("\u00d1", (Object)class_29192, (int)(object + 1), 3802923967768182331L, (long)l2);
        int n = _8F.cfr_renamed_7();
        int n2 = 0;
        block6: while (n2 < callSite) {
            object = _5n_0.c("u", (int)n2, (int)_5n_0.a("l", 12801, (long)(0x23EC70D12456702CL ^ l2)), 3803260078738389082L, (long)l2);
            do {
                int n3;
                block8: {
                    block9: {
                        block10: {
                            Object[] objectArray2 = new Object[3];
                            objectArray2[2] = object;
                            objectArray2[1] = l4;
                            objectArray2[0] = class_29192;
                            reference var19_16 = _5n_0.c("\u00d1", (Object)this, (Object)objectArray2, 3803568819121348681L, (long)l2) + _5n_0.c("\u00d1", (Object)class_23382, 3810834885404610678L, (long)l2);
                            Object[] objectArray3 = new Object[3];
                            objectArray3[2] = object;
                            objectArray3[1] = l4;
                            objectArray3[0] = class_29192;
                            reference var20_17 = _5n_0.c("\u00d1", (Object)this, (Object)objectArray3, 3803568819121348681L, (long)l2) + _5n_0.c("\u00d1", (Object)class_23382, 3816080124396805776L, (long)l2);
                            Object[] objectArray4 = new Object[3];
                            objectArray4[2] = object;
                            objectArray4[1] = l4;
                            objectArray4[0] = class_29192;
                            reference var21_18 = _5n_0.c("\u00d1", (Object)this, (Object)objectArray4, 3803568819121348681L, (long)l2) + _5n_0.c("\u00d1", (Object)class_23382, 3815948543941377018L, (long)l2);
                            try {
                                n3 = n;
                                if (l2 < 0L) break block8;
                                if (n3 == 0) break block9;
                                if (_5n_0.c("\u00d1", (Object)_5n_0.c("\u00d1", (Object)class_6382, (Object)new class_2338((int)var19_16, (int)var20_17, (int)var21_18), 3803338654849788009L, (long)l2), 3804292288291507263L, (long)l2) == false) break block10;
                            }
                            catch (MatchException matchException) {
                                throw _5n_0.a(matchException);
                            }
                            class_2919 class_29193 = class_29192;
                            float f = 1.0f;
                            class_2338 class_23383 = new class_2338((int)var19_16, (int)var20_17, (int)var21_18);
                            try {
                                CallSite callSite2;
                                try {
                                    Object[] objectArray5 = new Object[5];
                                    objectArray5[4] = class_29193;
                                    objectArray5[3] = Float.valueOf(f);
                                    objectArray5[2] = class_23383;
                                    objectArray5[1] = l5;
                                    objectArray5[0] = class_6382;
                                    callSite2 = _5n_0.c("\u00d1", (Object)this, (Object)objectArray5, 3815884551748057164L, (long)l2);
                                    if (n == 0 || callSite2 == false) break block10;
                                }
                                catch (MatchException matchException) {
                                    throw _5n_0.a(matchException);
                                }
                                callSite2 = _5n_0.c("\u00d1", arrayList, (Object)new class_243((double)var19_16, (double)var20_17, (double)var21_18), 3815332141267678371L, (long)l2);
                            }
                            catch (MatchException matchException) {
                                throw _5n_0.a(matchException);
                            }
                        }
                        ++n2;
                    }
                    n3 = n;
                }
                if (n3 != 0) continue block6;
            } while (l2 <= 0L);
        }
        return arrayList;
    }

    @Override
    public native void cfr_renamed_2();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean boolean_6(Object[] objectArray) {
        int n;
        int n2;
        float f;
        class_2338 class_23382;
        long l2;
        class_638 class_6382;
        block23: {
            Object object;
            block20: {
                int n3;
                block21: {
                    block22: {
                        class_6382 = (class_638)objectArray[0];
                        l2 = (Long)objectArray[1];
                        class_23382 = (class_2338)objectArray[2];
                        f = ((Float)objectArray[3]).floatValue();
                        class_2919 class_29192 = (class_2919)objectArray[4];
                        l2 = b ^ l2;
                        n2 = _8F.cfr_renamed_7();
                        try {
                            try {
                                try {
                                    try {
                                        float f2 = f - 0.0f;
                                        object = f2 == 0.0f ? 0 : (f2 > 0.0f ? 1 : -1);
                                        if (n2 == 0) return (boolean)object;
                                        if (object == false) break block20;
                                    }
                                    catch (MatchException matchException) {
                                        throw _5n_0.a(matchException);
                                    }
                                    float f3 = f - 1.0f;
                                    object = f3 == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1);
                                    n3 = n2;
                                    if (l2 < 0L) break block21;
                                    if (n3 == 0) break block22;
                                }
                                catch (MatchException matchException) {
                                    throw _5n_0.a(matchException);
                                }
                                if (object == false) break block23;
                            }
                            catch (MatchException matchException) {
                                throw _5n_0.a(matchException);
                            }
                            reference cfr_temp_2 = _5n_0.c("\u00d1", (Object)class_29192, 409263695065361077L, (long)l2) - f;
                            object = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 > 0 ? 1 : -1);
                        }
                        catch (MatchException matchException) {
                            throw _5n_0.a(matchException);
                        }
                    }
                    n3 = n2;
                }
                if (n3 == 0) return (boolean)object;
                if (object < 0) break block23;
            }
            object = true;
            return (boolean)object;
        }
        CallSite callSite = _5n_0.c("u", 401238681784154271L, (long)l2);
        int n4 = ((CallSite)callSite).length;
        int n5 = 0;
        do {
            block24: {
                block25: {
                    float f4;
                    if (n5 >= n4) return true;
                    CallSite callSite2 = callSite[n5];
                    try {
                        try {
                            try {
                                Object object;
                                try {
                                    n = n2;
                                    if (l2 < 0L) continue;
                                    if (n == 0) break block24;
                                    object = _5n_0.c("\u00d1", (Object)_5n_0.c("\u00d1", (Object)class_6382, (Object)_5n_0.c("\u00d1", (Object)class_23382, (Object)_5n_0.c("\u00d1", (Object)callSite2, 408182734113999319L, (long)l2), 402973614641830554L, (long)l2), 409637038219417870L, (long)l2), 408966933806038360L, (long)l2);
                                    if (n2 == 0) return object;
                                }
                                catch (MatchException matchException) {
                                    throw _5n_0.a(matchException);
                                }
                                if (object) break block25;
                            }
                            catch (MatchException matchException) {
                                throw _5n_0.a(matchException);
                            }
                            float f4 = f - 1.0f;
                            f4 = f4 == 0.0f ? 0 : (f4 > 0.0f ? 1 : -1);
                            if (n2 == 0) return (boolean)f4;
                        }
                        catch (MatchException matchException) {
                            throw _5n_0.a(matchException);
                        }
                        if (f4 == false) break block25;
                    }
                    catch (MatchException matchException) {
                        throw _5n_0.a(matchException);
                    }
                    f4 = 0.0f;
                    return (boolean)f4;
                }
                ++n5;
            }
            n = n2;
        } while (n != 0);
        return true;
    }

    @_3i_0
    public void cfr_renamed_2(_6Q q) {
        CallSite callSite;
        long l2;
        long l3;
        block10: {
            _5n_0 n_0;
            block8: {
                block9: {
                    long l4 = l3 = b ^ 0x4E7248C5229DL;
                    l2 = l4 ^ 0x5FCFDC9C5BA1L;
                    long l5 = l4 ^ 0x64C9A7C5A117L;
                    int n = _8F.cfr_renamed_8();
                    try {
                        try {
                            try {
                                try {
                                    n_0 = this;
                                    if (n != 0) break block8;
                                    if (_5n_0.c("C", (Object)n_0, 4289656766147026851L, (long)l3) != null) break block9;
                                }
                                catch (MatchException matchException) {
                                    throw _5n_0.a(matchException);
                                }
                                callSite = _5n_0.c("C", (Object)_5n_0.c("C", (Object)this, 4299927466712687403L, (long)l3), 4301960435484141593L, (long)l3);
                                if (n != 0) break block10;
                            }
                            catch (MatchException matchException) {
                                throw _5n_0.a(matchException);
                            }
                            if (callSite == null) break block9;
                        }
                        catch (MatchException matchException) {
                            throw _5n_0.a(matchException);
                        }
                        Object[] objectArray = new Object[1];
                        objectArray[0] = l5;
                        _5n_0.c("\u00f5", (Object)this, (Map)((Object)_5n_0.c("u", (Object)objectArray, 4288981720959054519L, (long)l3)), 4289656766147026851L, (long)l3);
                    }
                    catch (MatchException matchException) {
                        throw _5n_0.a(matchException);
                    }
                }
                n_0 = this;
            }
            callSite = _5n_0.c("C", (Object)_5n_0.c("C", (Object)n_0, 4299927466712687403L, (long)l3), 4301960435484141593L, (long)l3);
        }
        CallSite callSite2 = _5n_0.c("\u00d1", (Object)callSite, (int)_5n_0.c("\u00d1", (Object)q.cfr_renamed_5, 4305393936592299908L, (long)l3), (int)_5n_0.c("\u00d1", (Object)q.cfr_renamed_5, 4299964188698775640L, (long)l3), 4298887456706349679L, (long)l3);
        Object[] objectArray = new Object[2];
        objectArray[1] = callSite2;
        objectArray[0] = l2;
        _5n_0.c("\u00d1", (Object)this, (Object)objectArray, 4303331857311793232L, (long)l3);
    }

    private Stream cfr_renamed_3(long l2, class_5321 class_53212) {
        long l3 = (l2 = b ^ l2) ^ 0x5A4138712248L;
        Object[] objectArray = new Object[2];
        objectArray[1] = class_53212;
        objectArray[0] = l3;
        return _5n_0.c("\u00d1", (Object)_5n_0.c("\u00d1", (Object)this, (Object)objectArray, 8850614372157674468L, (long)l2), 8851405509139217159L, (long)l2);
    }

    @_3i_0
    public void cfr_renamed_6(_6l_0 l_0) {
        _6l_0 l_02;
        int n;
        long l2;
        block6: {
            block7: {
                l2 = b ^ 0x53F2BD594577L;
                n = _8F.cfr_renamed_8();
                try {
                    try {
                        l_02 = l_0;
                        if (n != 0) break block6;
                        if (_5n_0.c("\u00d1", (Object)_5n_0.c("\u00d1", (Object)l_02.cfr_renamed_2, 6652431768649780788L, (long)l2), (Object)_5n_0.c("w", 6660086893433668423L, (long)l2), 6659890885650023894L, (long)l2) != false) break block7;
                    }
                    catch (MatchException matchException) {
                        throw _5n_0.a(matchException);
                    }
                    return;
                }
                catch (MatchException matchException) {
                    throw _5n_0.a(matchException);
                }
            }
            l_02 = l_0;
        }
        CallSite callSite = _5n_0.c("u", (Object)l_02.cfr_renamed_8, 6656234524064932174L, (long)l2);
        if (_5n_0.c("\u00d1", (Object)_5n_0.c("C", (Object)this, 6658911461722972808L, (long)l2), (Object)_5n_0.c("u", (long)callSite, 6659764940548705685L, (long)l2), 6648537307084658896L, (long)l2) != false) {
            CallSite callSite2 = _5n_0.c("u", (Object)l_0.cfr_renamed_8, 6652477613276965337L, (long)l2);
            CallSite callSite3 = _5n_0.c("\u00d1", (Object)_5n_0.c("\u00d1", (Object)((Map)((Object)_5n_0.c("\u00d1", (Object)_5n_0.c("C", (Object)this, 6658911461722972808L, (long)l2), (Object)_5n_0.c("u", (long)callSite, 6659764940548705685L, (long)l2), 6654866853606871453L, (long)l2))), 6655695772856653631L, (long)l2), 6655644641569022738L, (long)l2);
            while (_5n_0.c("\u00d1", (Object)callSite3, 6649295645108320396L, (long)l2) != false) {
                Set set = (Set)((Object)_5n_0.c("\u00d1", (Object)callSite3, 6653077666045760803L, (long)l2));
                _5n_0.c("\u00d1", (Object)set, (Object)callSite2, 6660167594608647092L, (long)l2);
                if (n == 0) continue;
            }
        }
    }

    private List java_util_List_4(Object[] objectArray) {
        CallSite callSite;
        block10: {
            long l2;
            block11: {
                int n;
                class_5321 class_53212;
                block8: {
                    block9: {
                        l2 = (Long)objectArray[0];
                        class_53212 = (class_5321)objectArray[1];
                        long l3 = (l2 = b ^ l2) ^ 0x6D71B21CDB24L;
                        n = _8F.cfr_renamed_8();
                        try {
                            try {
                                callSite = _5n_0.c("C", (Object)this, 4734661592209302928L, (long)l2);
                                if (n != 0) break block8;
                                if (callSite != null) break block9;
                            }
                            catch (MatchException matchException) {
                                throw _5n_0.a(matchException);
                            }
                            Object[] objectArray2 = new Object[1];
                            objectArray2[0] = l3;
                            _5n_0.c("\u00f5", (Object)this, (Map)((Object)_5n_0.c("u", (Object)objectArray2, 4735129969681827972L, (long)l2)), 4734661592209302928L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw _5n_0.a(matchException);
                        }
                    }
                    callSite = _5n_0.c("C", (Object)this, 4734661592209302928L, (long)l2);
                }
                try {
                    try {
                        if (n != 0) break block10;
                        if (_5n_0.c("\u00d1", (Object)callSite, (Object)class_53212, 4728020174516749577L, (long)l2) == false) break block11;
                    }
                    catch (MatchException matchException) {
                        throw _5n_0.a(matchException);
                    }
                    return (List)((Object)_5n_0.c("\u00d1", (Object)_5n_0.c("C", (Object)this, 4734661592209302928L, (long)l2), (Object)class_53212, 4720830260273695812L, (long)l2));
                }
                catch (MatchException matchException) {
                    throw _5n_0.a(matchException);
                }
            }
            callSite = _5n_0.c("\u00d1", (Object)_5n_0.c("\u00d1", (Object)_5n_0.c("\u00d1", (Object)_5n_0.c("\u00d1", (Object)_5n_0.c("C", (Object)this, 4734661592209302928L, (long)l2), 4721140417275726566L, (long)l2), 4727153909964560875L, (long)l2), 4734797996489564647L, (long)l2), 4723270537614951994L, (long)l2);
        }
        return (List)((Object)callSite);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @_3i_0
    public void cfr_renamed_8(_6c_0 c_0) {
        CallSite callSite;
        _5n_0 n_0;
        int n;
        long l2;
        long l3;
        long l4;
        block21: {
            block22: {
                block20: {
                    long l5 = l4 = b ^ 0x1A989E504FDAL;
                    l3 = l5 ^ 0x3B0EBFC9DB61L;
                    l2 = l5 ^ 0x1E7F1683BC68L;
                    n = _8F.cfr_renamed_7();
                    try {
                        try {
                            n_0 = this;
                            if (n == 0) break block20;
                            if (_5n_0.c("C", (Object)_5n_0.c("C", (Object)n_0, 6263167693634899564L, (long)l4), 6253045047194533080L, (long)l4) == null) return;
                        }
                        catch (MatchException matchException) {
                            throw _5n_0.a(matchException);
                        }
                        n_0 = this;
                    }
                    catch (MatchException matchException) {
                        throw _5n_0.a(matchException);
                    }
                }
                try {
                    try {
                        if (n == 0) break block21;
                        if (_5n_0.c("C", (Object)n_0, 6251199637615424228L, (long)l4) != null) break block22;
                        return;
                    }
                    catch (MatchException matchException) {
                        throw _5n_0.a(matchException);
                    }
                }
                catch (MatchException matchException) {
                    throw _5n_0.a(matchException);
                }
            }
            n_0 = this;
        }
        if ((callSite = _5n_0.c("\u00d1", (Object)_5n_0.c("C", (Object)_5n_0.c("C", (Object)n_0, 6263167693634899564L, (long)l4), 6268709104338279874L, (long)l4), 6263916544021260739L, (long)l4)) != null) {
            class_4587 class_45872 = c_0.cfr_renamed_2;
            _5n_0.c("\u00d1", (Object)class_45872, 6265221373114927585L, (long)l4);
            CallSite callSite2 = _5n_0.c("\u00d1", (Object)callSite, 6252066586764960075L, (long)l4);
            _5n_0.c("\u00d1", (Object)class_45872, (Object)_5n_0.c("\u00d1", (Object)_5n_0.c("w", 6252010517974064724L, (long)l4), (float)_5n_0.c("\u00d1", (Object)callSite, 6265368878621004042L, (long)l4), 6264174647944657864L, (long)l4), 6267141124303880896L, (long)l4);
            _5n_0.c("\u00d1", (Object)class_45872, (Object)_5n_0.c("\u00d1", (Object)_5n_0.c("w", 6265198544196133218L, (long)l4), (float)(_5n_0.c("\u00d1", (Object)callSite, 6262450636489274475L, (long)l4) + 180.0f), 6264174647944657864L, (long)l4), 6267141124303880896L, (long)l4);
            _5n_0.c("\u00d1", (Object)class_45872, (double)(-_5n_0.c("C", (Object)callSite2, 6264367271035807576L, (long)l4)), (double)(-_5n_0.c("C", (Object)callSite2, 6268366987821398939L, (long)l4)), (double)(-_5n_0.c("C", (Object)callSite2, 6263647061598370658L, (long)l4)), 6264306625402003532L, (long)l4);
        }
        CallSite callSite3 = _5n_0.c("C", (Object)_5n_0.c("\u00d1", (Object)_5n_0.c("C", (Object)_5n_0.c("C", (Object)this, 6263167693634899564L, (long)l4), 6253045047194533080L, (long)l4), 6267262469376017449L, (long)l4), 6253227825214455308L, (long)l4);
        CallSite callSite4 = _5n_0.c("C", (Object)_5n_0.c("\u00d1", (Object)_5n_0.c("C", (Object)_5n_0.c("C", (Object)this, 6263167693634899564L, (long)l4), 6253045047194533080L, (long)l4), 6267262469376017449L, (long)l4), 6266164443508364382L, (long)l4);
        Object[] objectArray = new Object[1];
        objectArray[0] = l3;
        CallSite callSite5 = _5n_0.c("\u00d1", (Object)_5n_0.c("C", (Object)this, 6253802399750979537L, (long)l4), (Object)objectArray, 6267717934766100544L, (long)l4);
        int n2 = 0;
        while (n2 <= callSite5) {
            block25: {
                int n3;
                block23: {
                    for (n3 = -n2 + callSite3; n3 <= n2 + callSite3; ++n3) {
                        try {
                            Object[] objectArray2 = new Object[4];
                            objectArray2[3] = c_0;
                            objectArray2[2] = l2;
                            objectArray2[1] = (int)(callSite4 + n2 - callSite5);
                            objectArray2[0] = n3;
                            _5n_0.c("\u00d1", (Object)this, (Object)objectArray2, 6264958226301797279L, (long)l4);
                            if (n != 0) {
                                if (n != 0) continue;
                                break;
                            }
                            break block23;
                        }
                        catch (MatchException matchException) {
                            throw _5n_0.a(matchException);
                        }
                    }
                    n3 = -n2 + 1 + callSite3;
                }
                try {
                    do {
                        try {
                            if (n3 >= n2 + callSite3) break;
                            Object[] objectArray3 = new Object[4];
                            objectArray3[3] = c_0;
                            objectArray3[2] = l2;
                            objectArray3[1] = (int)(callSite4 - n2 + callSite5 + true);
                            objectArray3[0] = n3;
                            _5n_0.c("\u00d1", (Object)this, (Object)objectArray3, 6264958226301797279L, (long)l4);
                            ++n3;
                            if (n != 0) {
                                continue;
                            }
                            break block25;
                        }
                        catch (MatchException matchException) {
                            throw _5n_0.a(matchException);
                        }
                    } while (n != 0);
                }
                catch (MatchException matchException) {
                    throw _5n_0.a(matchException);
                }
                ++n2;
            }
            if (n != 0) continue;
        }
        class_4587 class_45873 = c_0.cfr_renamed_2;
        _5n_0.c("\u00d1", (Object)class_45873, 6251752110413278757L, (long)l4);
    }

    private static void cfr_renamed_8(char c, int n, int n2, Set set, class_6880 class_68802) {
        long l2 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ b;
        _5n_0.c("\u00d1", (Object)set, (Object)((class_5321)_5n_0.c("\u00d1", (Object)_5n_0.c("\u00d1", (Object)class_68802, 302908045932930191L, (long)l2), 305125869014336394L, (long)l2)), 303370275459574667L, (long)l2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    private ArrayList java_util_ArrayList_5(Object[] objectArray) {
        class_638 class_6382 = (class_638)objectArray[0];
        class_2919 class_29192 = (class_2919)objectArray[1];
        class_2338 class_23382 = (class_2338)objectArray[2];
        long l2 = (Long)objectArray[3];
        int n = (Integer)objectArray[4];
        float f = ((Float)objectArray[5]).floatValue();
        long l3 = (l2 = b ^ l2) ^ 0x2913615E5667L;
        reference var12_9 = _5n_0.c("\u00d1", (Object)class_29192, 5326585015393511155L, (long)l2) * (float)Math.PI;
        float f2 = (float)n / 8.0f;
        CallSite callSite = _5n_0.c("u", (float)(((float)n / 16.0f * 2.0f + 1.0f) / 2.0f), 5315927135976151377L, (long)l2);
        double d = (double)_5n_0.c("\u00d1", (Object)class_23382, 5315262681768144215L, (long)l2) + _5n_0.c("u", (double)((double)var12_9), 5319848588646366326L, (long)l2) * (double)f2;
        double d2 = (double)_5n_0.c("\u00d1", (Object)class_23382, 5315262681768144215L, (long)l2) - _5n_0.c("u", (double)((double)var12_9), 5319848588646366326L, (long)l2) * (double)f2;
        double d3 = (double)_5n_0.c("\u00d1", (Object)class_23382, 5320349746656708315L, (long)l2) + _5n_0.c("u", (double)((double)var12_9), 5322407162550712127L, (long)l2) * (double)f2;
        int n2 = _8F.cfr_renamed_7();
        double d4 = (double)_5n_0.c("\u00d1", (Object)class_23382, 5320349746656708315L, (long)l2) - _5n_0.c("u", (double)((double)var12_9), 5322407162550712127L, (long)l2) * (double)f2;
        double d5 = (double)(_5n_0.c("\u00d1", (Object)class_23382, 5319918548167091121L, (long)l2) + _5n_0.c("\u00d1", (Object)class_29192, 3, 5325478175910609690L, (long)l2) - 2);
        double d6 = (double)(_5n_0.c("\u00d1", (Object)class_23382, 5319918548167091121L, (long)l2) + _5n_0.c("\u00d1", (Object)class_29192, 3, 5325478175910609690L, (long)l2) - 2);
        reference var27_19 = _5n_0.c("\u00d1", (Object)class_23382, 5315262681768144215L, (long)l2) - _5n_0.c("u", (float)f2, 5315927135976151377L, (long)l2) - callSite;
        reference var28_20 = _5n_0.c("\u00d1", (Object)class_23382, 5319918548167091121L, (long)l2) - 2 - callSite;
        reference var29_21 = _5n_0.c("\u00d1", (Object)class_23382, 5320349746656708315L, (long)l2) - _5n_0.c("u", (float)f2, 5315927135976151377L, (long)l2) - callSite;
        int n3 = 2 * (_5n_0.c("u", (float)f2, 5315927135976151377L, (long)l2) + callSite);
        int n4 = 2 * (2 + callSite);
        reference var32_24 = var27_19;
        block2: while (true) {
            void var32_25;
            reference v0 = var32_25;
            CallSite callSite2 = var27_19 + n3;
            block3: while (v0 <= callSite2) {
                int n5;
                reference var33_26 = var29_21;
                block4: while (true) {
                    reference v3 = var33_26;
                    v3 = var29_21 + n3;
                    block5: while (v2 <= v3) {
                        v0 = var28_20;
                        do {
                            callSite2 = _5n_0.c("\u00d1", (Object)class_6382, (Object)_5n_0.c("w", 5315107489107453673L, (long)l2), (int)var32_25, (int)var33_26, 5320144943290838896L, (long)l2);
                            if (n2 == 0) continue block3;
                            try {
                                if (l2 < 0L) continue block5;
                                if (v0 <= callSite2) {
                                    Object[] objectArray2 = new Object[16];
                                    objectArray2[15] = Float.valueOf(f);
                                    objectArray2[14] = n4;
                                    objectArray2[13] = n3;
                                    objectArray2[12] = (int)var29_21;
                                    objectArray2[11] = (int)var28_20;
                                    objectArray2[10] = (int)var27_19;
                                    objectArray2[9] = l3;
                                    objectArray2[8] = d6;
                                    objectArray2[7] = d5;
                                    objectArray2[6] = d4;
                                    objectArray2[5] = d3;
                                    objectArray2[4] = d2;
                                    objectArray2[3] = d;
                                    objectArray2[2] = n;
                                    objectArray2[1] = class_29192;
                                    objectArray2[0] = class_6382;
                                    return _5n_0.c("\u00d1", (Object)this, (Object)objectArray2, 5324639730574058622L, (long)l2);
                                }
                            }
                            catch (MatchException matchException) {
                                throw _5n_0.a(matchException);
                            }
                            ++var33_26;
                            if (n2 != 0) continue block4;
                            ++var32_25;
                            n5 = n2;
                        } while (l2 < 0L);
                    }
                    break;
                }
                if (n5 != 0) continue block2;
            }
            break;
        }
        return new ArrayList();
    }

    private static void cfr_renamed_9(char c, class_638 class_6382, int n, char c2, Set set, class_1923 class_19232) {
        CallSite callSite;
        int n2;
        int n3;
        int n4;
        int n5;
        long l2;
        block3: {
            CallSite callSite2;
            block4: {
                l2 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)c2 << 48 >>> 48) ^ b;
                long l3 = l2 ^ 0x483128BBBF20L;
                n5 = (int)(l3 >>> 48);
                n4 = (int)(l3 << 16 >>> 32);
                n3 = (int)(l3 << 48 >>> 48);
                n2 = _8F.cfr_renamed_7();
                callSite2 = _5n_0.c("\u00d1", (Object)class_6382, (int)_5n_0.c("C", (Object)class_19232, -6762235225693222164L, (long)l2), (int)_5n_0.c("C", (Object)class_19232, -6767300365014720322L, (long)l2), (Object)_5n_0.c("w", -6763201676837156968L, (long)l2), (boolean)false, -6768500375419424627L, (long)l2);
                try {
                    callSite = callSite2;
                    if (n2 == 0) break block3;
                    if (callSite != null) break block4;
                }
                catch (MatchException matchException) {
                    throw _5n_0.a(matchException);
                }
                return;
            }
            callSite = callSite2;
        }
        for (CallSite callSite3 : _5n_0.c("\u00d1", (Object)callSite, -6762767811017760159L, (long)l2)) {
            _5n_0.c("\u00d1", (Object)_5n_0.c("\u00d1", (Object)callSite3, -6762324679682663613L, (long)l2), arg_0 -> _5n_0.cfr_renamed_8((char)n5, n4, n3, set, arg_0), -6766933775435079459L, (long)l2);
            if (n2 != 0) continue;
        }
    }

    /*
     * Exception decompiling
     */
    private ArrayList java_util_ArrayList_7(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.UnsupportedOperationException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.considerAsDoLoopStart(LoopIdentifier.java:383)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.identifyLoops1(LoopIdentifier.java:65)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
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

    private int int_8(Object[] objectArray) {
        class_2919 class_29192 = (class_2919)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n = (Integer)objectArray[2];
        l2 = b ^ l2;
        return (int)_5n_0.c("u", (float)((_5n_0.c("\u00d1", (Object)class_29192, 8999204016386855931L, (long)l2) - _5n_0.c("\u00d1", (Object)class_29192, 8999204016386855931L, (long)l2)) * (float)n), 8991817376649713659L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5n_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5n_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

