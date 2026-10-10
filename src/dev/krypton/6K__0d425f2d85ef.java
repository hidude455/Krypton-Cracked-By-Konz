/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_2680
 *  net.minecraft.class_2818
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._3c_0;
import dev.krypton._3i_0;
import dev.krypton._4f;
import dev.krypton._4r;
import dev.krypton._6Q;
import dev.krypton._6c_0;
import dev.krypton._6x_0;
import dev.krypton._7J;
import dev.krypton._8B;
import dev.krypton._8h;
import dev.krypton._92;
import dev.krypton._95;
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
import java.util.concurrent.ExecutorService;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2680;
import net.minecraft.class_2818;

public class _6K
extends _6x_0 {
    private final _92 cfr_renamed_3;
    private final _9r cfr_renamed_2;
    private final _9r cfr_renamed_8;
    private final _92 cfr_renamed_4;
    private final Set cfr_renamed_6;
    private final Set cfr_renamed_1;
    private final Set cfr_renamed_0;
    private ExecutorService cfr_renamed_7;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    @Override
    public native void cfr_renamed_5();

    private boolean boolean_1(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        class_2680 class_26802 = (class_2680)objectArray[1];
        l2 = b ^ l2;
        return (boolean)_6K.c("C", (Object)_6K.c("C", (Object)class_26802, (Object)_6K.c("\u00ee", (Object)_6K.c("\u00ee", (Object)this, 1749447116958284481L, (long)l2), 1750785040186453940L, (long)l2), (Object)_6K.c("\u00d9", 1752493214493114285L, (long)l2), 1752909570059466314L, (long)l2), 1751997852902346276L, (long)l2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void cfr_renamed_376(long var1_1, class_2818 var3_2) {
        block25: {
            block26: {
                block24: {
                    block23: {
                        v0 = var1_1 = _6K.b ^ var1_1;
                        var4_3 = v0 ^ 24698635163820L;
                        var6_4 = v0 ^ 43975025410315L;
                        var8_5 = v0 ^ 21342753051141L;
                        var10_6 = v0 ^ 59554061382709L;
                        var12_7 = v0 ^ 84573064368693L;
                        var14_8 = v0 ^ 32998195545768L;
                        var16_9 = _8h.cfr_renamed_4();
                        try {
                            try {
                                v1 = this;
                                if (var16_9 != null) break block23;
                                if (_6K.c("\u00ee", (Object)_6K.c("\u00ee", (Object)v1, (long)6890518505669623078L, (long)var1_1), (long)6893686424033421395L, (long)var1_1) != null) {
                                }
                                ** GOTO lbl26
                            }
                            catch (MatchException v2) {
                                throw _6K.a(v2);
                            }
                            v1 = this;
                        }
                        catch (MatchException v3) {
                            throw _6K.a(v3);
                        }
                    }
                    try {
                        if (_6K.c("C", (Object)v1, (long)6893367530042803813L, (long)var1_1) != false) break block24;
lbl26:
                        // 2 sources

                        return;
                    }
                    catch (MatchException v4) {
                        throw _6K.a(v4);
                    }
                }
                var17_10 = _6K.c("C", (Object)var3_2, (long)6894930106205254767L, (long)var1_1);
                try {
                    v5 = _6K.c("C", (Object)_6K.c("\u00ee", (Object)this, (long)6893041063013757116L, (long)var1_1), (Object)var17_10, (long)6893777076180301654L, (long)var1_1);
                    if (var16_9 != null) break block25;
                    if (v5 == false) break block26;
                }
                catch (MatchException v6) {
                    throw _6K.a(v6);
                }
                return;
            }
            _6K.c("C", (Object)_6K.c("\u00ee", (Object)this, (long)6893041063013757116L, (long)var1_1), (Object)var17_10, (long)6894969279251257115L, (long)var1_1);
            v5 = _6K.c("C", (Object)var17_10, (long)6891522603920544689L, (long)var1_1);
        }
        var18_11 = v5;
        var19_12 = _6K.c("C", (Object)var17_10, (long)6891129132667303472L, (long)var1_1);
        var20_13 = _6K.c("C", (Object)_6K.c("\u00ee", (Object)_6K.c("\u00ee", (Object)this, (long)6890518505669623078L, (long)var1_1), (long)6893686424033421395L, (long)var1_1), (long)6893283798025613033L, (long)var1_1);
        var21_14 = _6K.c("C", (Object)_6K.c("\u00ee", (Object)_6K.c("\u00ee", (Object)this, (long)6890518505669623078L, (long)var1_1), (long)6893686424033421395L, (long)var1_1), (long)6893962748145646654L, (long)var1_1);
        var22_15 = new _3c_0(var10_6);
        v7 = new Object[1];
        v7[0] = var8_5;
        var23_16 = _6K.c("C", (Object)_6K.c("\u00ee", (Object)this, (long)6894059713809786218L, (long)var1_1), (Object)v7, (long)6890820886013946666L, (long)var1_1);
        var24_17 = var18_11;
        block16: while (true) {
            v8 = var24_17;
            block17: while (v8 < var18_11 + _6K.a("v", (int)26850, (long)(2507433606993533061L ^ var1_1))) {
                var25_18 = var19_12;
                block18: while (var25_18 < var19_12 + _6K.a("v", (int)24809, (long)(4965840154064867464L ^ var1_1))) {
                    v8 = _6K.c("C", (Object)_6K.c("\u00ee", (Object)this, (long)6890993030740372242L, (long)var1_1), (long)var12_7, (long)6896693719118759584L, (long)var1_1);
                    v9 = var16_9;
                    while (v9 == null) {
                        block30: {
                            block29: {
                                block27: {
                                    block28: {
                                        try {
                                            try {
                                                v9 = var16_9;
                                                if (var1_1 <= 0L) continue;
                                                if (v9 != null) break block27;
                                                if (v8 == false) break block28;
                                            }
                                            catch (MatchException v10) {
                                                throw _6K.a(v10);
                                            }
                                            v11 = new Object[7];
                                            v11[6] = (int)var23_16;
                                            v11[5] = (int)var21_14;
                                            v11[4] = (int)var20_13;
                                            v11[3] = (int)var25_18;
                                            v11[2] = (int)var24_17;
                                            v11[1] = var14_8;
                                            v11[0] = var22_15;
                                            _6K.c("C", (Object)this, (Object)v11, (long)6893624461713967261L, (long)var1_1);
                                        }
                                        catch (MatchException v12) {
                                            throw _6K.a(v12);
                                        }
                                    }
                                    try {
                                        v13 = this;
                                        if (var16_9 != null) break block29;
                                        v14 = _6K.c("C", (Object)_6K.c("\u00ee", (Object)v13, (long)6894858157451788724L, (long)var1_1), (long)var12_7, (long)6896693719118759584L, (long)var1_1);
                                    }
                                    catch (MatchException v15) {
                                        throw _6K.a(v15);
                                    }
                                }
                                try {
                                    if (v14 == false) break block30;
                                    v16 = new Object[7];
                                    v16[6] = (int)var23_16;
                                    v16[5] = (int)var21_14;
                                    v16[4] = var6_4;
                                    v16[3] = (int)var20_13;
                                    v16[2] = (int)var25_18;
                                    v16[1] = (int)var24_17;
                                    v16[0] = var22_15;
                                    _6K.c("C", (Object)this, (Object)v16, (long)6893447897288588886L, (long)var1_1);
                                    v13 = this;
                                }
                                catch (MatchException v17) {
                                    throw _6K.a(v17);
                                }
                            }
                            v18 = new Object[7];
                            v18[6] = (int)var23_16;
                            v18[5] = var4_3;
                            v18[4] = (int)var21_14;
                            v18[3] = (int)var20_13;
                            v18[2] = (int)var25_18;
                            v18[1] = (int)var24_17;
                            v18[0] = var22_15;
                            _6K.c("C", (Object)v13, (Object)v18, (long)6894590995197957461L, (long)var1_1);
                        }
                        ++var25_18;
                        v19 = var16_9;
lbl123:
                        // 2 sources

                        ** while (v19 != null)
                    }
                    {
                        continue block17;
lbl125:
                        // 1 sources

                    }
                }
lbl-1000:
                // 2 sources

                {
                    ++var24_17;
                    v19 = var16_9;
                    if (var1_1 <= 0L) ** GOTO lbl123
                    if (v19 == null) continue block16;
                    break;
                }
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void cfr_renamed_317(Object[] var1_1) {
        block31: {
            block24: {
                var3_2 = (_3c_0)var1_1[0];
                var2_3 = (Integer)var1_1[1];
                var7_4 = (Integer)var1_1[2];
                var6_5 = (Integer)var1_1[3];
                var4_6 = (Long)var1_1[4];
                var8_7 = (Integer)var1_1[5];
                var9_8 = (Integer)var1_1[6];
                var10_9 = (var4_6 = _6K.b ^ var4_6) ^ 18612821699370L;
                var13_10 = 0;
                var14_11 = 0;
                var12_12 = _8h.cfr_renamed_4();
                var15_13 = var6_5;
                while (var15_13 < var8_7) {
                    block26: {
                        block27: {
                            block28: {
                                block29: {
                                    block30: {
                                        block25: {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            v0 = new Object[5];
                                                            v0[4] = var7_4;
                                                            v0[3] = var15_13;
                                                            v0[2] = var2_3;
                                                            v0[1] = var3_2;
                                                            v0[0] = var10_9;
                                                            v1 /* !! */  = (int)_6K.c("C", (Object)this, (Object)v0, (long)-8133670130315192296L, (long)var4_6);
                                                            v2 = var12_12;
                                                            if (var4_6 <= 0L) ** GOTO lbl95
                                                            if (v2 != null) break block24;
                                                            v3 = var12_12;
                                                            if (var4_6 > 0L) {
                                                                if (v3 != null) break block25;
                                                            }
                                                            ** GOTO lbl68
                                                        }
                                                        catch (MatchException v4) {
                                                            throw _6K.a(v4);
                                                        }
                                                        if (var4_6 < 0L) break block25;
                                                        if (v1 /* !! */  != 0) {
                                                        }
                                                        ** GOTO lbl60
                                                    }
                                                    catch (MatchException v5) {
                                                        throw _6K.a(v5);
                                                    }
                                                    ++var13_10;
                                                    v6 = var12_12;
                                                    if (var4_6 < 0L) break block26;
                                                    if (v6 != null) break block27;
                                                }
                                                catch (MatchException v7) {
                                                    throw _6K.a(v7);
                                                }
                                                if (var14_11 != 0) break block28;
                                            }
                                            catch (MatchException v8) {
                                                throw _6K.a(v8);
                                            }
                                            v9 = var15_13;
                                            if (var4_6 < 0L) break block25;
                                            var14_11 = v9;
                                            try {
                                                if (var12_12 == null) break block28;
lbl60:
                                                // 2 sources

                                                v9 = var13_10;
                                            }
                                            catch (MatchException v10) {
                                                throw _6K.a(v10);
                                            }
                                        }
                                        try {
                                            try {
                                                v3 = var12_12;
lbl68:
                                                // 2 sources

                                                if (v3 != null) break block29;
                                                if (v9 < var9_8) break block30;
                                            }
                                            catch (MatchException v11) {
                                                throw _6K.a(v11);
                                            }
                                            _6K.c("C", (Object)_6K.c("\u00ee", (Object)this, (long)-8136965069334126332L, (long)var4_6), (Object)new _4f(var2_3, var7_4, var14_11, var14_11 + var13_10, 3, 1), (long)-8134421704639363160L, (long)var4_6);
                                        }
                                        catch (MatchException v12) {
                                            throw _6K.a(v12);
                                        }
                                    }
                                    var13_10 = 0;
                                    v9 = 0;
                                }
                                var14_11 = v9;
                            }
                            ++var15_13;
                        }
                        v6 = var12_12;
                    }
                    if (v6 == null) continue;
                }
                if (var4_6 <= 0L) break block31;
                v1 /* !! */  = var13_10;
            }
            try {
                try {
                    v2 = var12_12;
lbl95:
                    // 2 sources

                    if (v2 != null || v1 /* !! */  < var9_8) break block31;
                }
                catch (MatchException v13) {
                    throw _6K.a(v13);
                }
                v1 /* !! */  = (int)_6K.c("C", (Object)_6K.c("\u00ee", (Object)this, (long)-8136965069334126332L, (long)var4_6), (Object)new _4f(var2_3, var7_4, var14_11, var14_11 + var13_10, 3, 1), (long)-8134421704639363160L, (long)var4_6);
            }
            catch (MatchException v14) {
                throw _6K.a(v14);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void cfr_renamed_310(Object[] var1_1) {
        block31: {
            block24: {
                var2_2 = (_3c_0)var1_1[0];
                var5_3 = (Long)var1_1[1];
                var7_4 = (Integer)var1_1[2];
                var9_5 = (Integer)var1_1[3];
                var4_6 = (Integer)var1_1[4];
                var8_7 = (Integer)var1_1[5];
                var3_8 = (Integer)var1_1[6];
                var10_9 = (var5_3 = _6K.b ^ var5_3) ^ 97335031577064L;
                var13_10 = 0;
                var14_11 = 0;
                var12_12 = _8h.cfr_renamed_4();
                var15_13 = var4_6;
                while (var15_13 < var8_7) {
                    block26: {
                        block27: {
                            block28: {
                                block29: {
                                    block30: {
                                        block25: {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            v0 = new Object[5];
                                                            v0[4] = var9_5;
                                                            v0[3] = var15_13;
                                                            v0[2] = var7_4;
                                                            v0[1] = var2_2;
                                                            v0[0] = var10_9;
                                                            v1 /* !! */  = (int)_6K.c("C", (Object)this, (Object)v0, (long)628549783334995397L, (long)var5_3);
                                                            v2 = var12_12;
                                                            if (var5_3 < 0L) ** GOTO lbl95
                                                            if (v2 != null) break block24;
                                                            v3 = var12_12;
                                                            if (var5_3 >= 0L) {
                                                                if (v3 != null) break block25;
                                                            }
                                                            ** GOTO lbl68
                                                        }
                                                        catch (MatchException v4) {
                                                            throw _6K.a(v4);
                                                        }
                                                        if (var5_3 < 0L) break block25;
                                                        if (v1 /* !! */  != 0) {
                                                        }
                                                        ** GOTO lbl60
                                                    }
                                                    catch (MatchException v5) {
                                                        throw _6K.a(v5);
                                                    }
                                                    ++var13_10;
                                                    v6 = var12_12;
                                                    if (var5_3 < 0L) break block26;
                                                    if (v6 != null) break block27;
                                                }
                                                catch (MatchException v7) {
                                                    throw _6K.a(v7);
                                                }
                                                if (var14_11 != 0) break block28;
                                            }
                                            catch (MatchException v8) {
                                                throw _6K.a(v8);
                                            }
                                            v9 = var15_13;
                                            if (var5_3 <= 0L) break block25;
                                            var14_11 = v9;
                                            try {
                                                if (var12_12 == null) break block28;
lbl60:
                                                // 2 sources

                                                v9 = var13_10;
                                            }
                                            catch (MatchException v10) {
                                                throw _6K.a(v10);
                                            }
                                        }
                                        try {
                                            try {
                                                v3 = var12_12;
lbl68:
                                                // 2 sources

                                                if (v3 != null) break block29;
                                                if (v9 < var3_8) break block30;
                                            }
                                            catch (MatchException v11) {
                                                throw _6K.a(v11);
                                            }
                                            _6K.c("C", (Object)_6K.c("\u00ee", (Object)this, (long)626947099524689966L, (long)var5_3), (Object)new _4f(var7_4, var9_5, var14_11, var14_11 + var13_10, 1, 1), (long)630367000782422027L, (long)var5_3);
                                        }
                                        catch (MatchException v12) {
                                            throw _6K.a(v12);
                                        }
                                    }
                                    var13_10 = 0;
                                    v9 = 0;
                                }
                                var14_11 = v9;
                            }
                            ++var15_13;
                        }
                        v6 = var12_12;
                    }
                    if (v6 == null) continue;
                }
                if (var5_3 <= 0L) break block31;
                v1 /* !! */  = var13_10;
            }
            try {
                try {
                    v2 = var12_12;
lbl95:
                    // 2 sources

                    if (v2 != null || v1 /* !! */  < var3_8) break block31;
                }
                catch (MatchException v13) {
                    throw _6K.a(v13);
                }
                v1 /* !! */  = (int)_6K.c("C", (Object)_6K.c("\u00ee", (Object)this, (long)626947099524689966L, (long)var5_3), (Object)new _4f(var7_4, var9_5, var14_11, var14_11 + var13_10, 1, 1), (long)630367000782422027L, (long)var5_3);
            }
            catch (MatchException v14) {
                throw _6K.a(v14);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void cfr_renamed_159(Object[] var1_1) {
        block31: {
            block24: {
                var4_2 = (_3c_0)var1_1[0];
                var7_3 = (Integer)var1_1[1];
                var8_4 = (Integer)var1_1[2];
                var6_5 = (Integer)var1_1[3];
                var9_6 = (Integer)var1_1[4];
                var2_7 = (Long)var1_1[5];
                var5_8 = (Integer)var1_1[6];
                var10_9 = (var2_7 = _6K.b ^ var2_7) ^ 14766004502630L;
                var13_10 = 0;
                var14_11 = 0;
                var12_12 = _8h.cfr_renamed_4();
                var15_13 = var6_5;
                while (var15_13 < var9_6) {
                    block26: {
                        block27: {
                            block28: {
                                block29: {
                                    block30: {
                                        block25: {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            v0 = new Object[5];
                                                            v0[4] = var8_4;
                                                            v0[3] = var15_13;
                                                            v0[2] = var10_9;
                                                            v0[1] = var7_3;
                                                            v0[0] = var4_2;
                                                            v1 /* !! */  = (int)_6K.c("C", (Object)this, (Object)v0, (long)6250678302112721146L, (long)var2_7);
                                                            v2 = var12_12;
                                                            if (var2_7 < 0L) ** GOTO lbl95
                                                            if (v2 != null) break block24;
                                                            v3 = var12_12;
                                                            if (var2_7 >= 0L) {
                                                                if (v3 != null) break block25;
                                                            }
                                                            ** GOTO lbl68
                                                        }
                                                        catch (MatchException v4) {
                                                            throw _6K.a(v4);
                                                        }
                                                        if (var2_7 < 0L) break block25;
                                                        if (v1 /* !! */  != 0) {
                                                        }
                                                        ** GOTO lbl60
                                                    }
                                                    catch (MatchException v5) {
                                                        throw _6K.a(v5);
                                                    }
                                                    ++var13_10;
                                                    v6 = var12_12;
                                                    if (var2_7 <= 0L) break block26;
                                                    if (v6 != null) break block27;
                                                }
                                                catch (MatchException v7) {
                                                    throw _6K.a(v7);
                                                }
                                                if (var14_11 != 0) break block28;
                                            }
                                            catch (MatchException v8) {
                                                throw _6K.a(v8);
                                            }
                                            v9 = var15_13;
                                            if (var2_7 <= 0L) break block25;
                                            var14_11 = v9;
                                            try {
                                                if (var12_12 == null) break block28;
lbl60:
                                                // 2 sources

                                                v9 = var13_10;
                                            }
                                            catch (MatchException v10) {
                                                throw _6K.a(v10);
                                            }
                                        }
                                        try {
                                            try {
                                                v3 = var12_12;
lbl68:
                                                // 2 sources

                                                if (v3 != null) break block29;
                                                if (v9 < var5_8) break block30;
                                            }
                                            catch (MatchException v11) {
                                                throw _6K.a(v11);
                                            }
                                            _6K.c("C", (Object)_6K.c("\u00ee", (Object)this, (long)6247760324074092707L, (long)var2_7), (Object)new _4f(var7_3, var8_4, var14_11, var14_11 + var13_10, 1, 3), (long)6249741769602932239L, (long)var2_7);
                                        }
                                        catch (MatchException v12) {
                                            throw _6K.a(v12);
                                        }
                                    }
                                    var13_10 = 0;
                                    v9 = 0;
                                }
                                var14_11 = v9;
                            }
                            ++var15_13;
                        }
                        v6 = var12_12;
                    }
                    if (v6 == null) continue;
                }
                if (var2_7 < 0L) break block31;
                v1 /* !! */  = var13_10;
            }
            try {
                try {
                    v2 = var12_12;
lbl95:
                    // 2 sources

                    if (v2 != null || v1 /* !! */  < var5_8) break block31;
                }
                catch (MatchException v13) {
                    throw _6K.a(v13);
                }
                v1 /* !! */  = (int)_6K.c("C", (Object)_6K.c("\u00ee", (Object)this, (long)6247760324074092707L, (long)var2_7), (Object)new _4f(var7_3, var8_4, var14_11, var14_11 + var13_10, 1, 3), (long)6249741769602932239L, (long)var2_7);
            }
            catch (MatchException v14) {
                throw _6K.a(v14);
            }
        }
    }

    public _6K(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x36725757A64CL;
        long l5 = l3 ^ 0x2612659EDFDFL;
        long l6 = l3 ^ 0x604AC0142E25L;
        long l7 = l3 ^ 0x7F8A5330C157L;
        super((int)_6K.a("v", 7687, (long)(0x6A7841C20FB2F6D5L ^ l2)), -1, (_4r)((Object)_6K.c("\u00d9", -8711035584453774534L, (long)l2)), l6);
        this.cfr_renamed_3 = new _92((int)_6K.a("v", 22921, (long)(0x272D74164C28B159L ^ l2)), 1.0, l5, 20.0, 4.0, 1.0);
        this.cfr_renamed_2 = new _9r((int)_6K.a("v", 1817, (long)(0x2B275643A13FEFC7L ^ l2)), true, l4);
        this.cfr_renamed_8 = new _9r((int)_6K.a("v", 29975, (long)(0x5C05AEF76BB21DC6L ^ l2)), true, l4);
        this.cfr_renamed_4 = new _92((int)_6K.a("v", 1896, (long)(0x15FE8FEE33BD6FB7L ^ l2)), 1.0, l5, 255.0, 120.0, 1.0);
        this.cfr_renamed_6 = _6K.c("\u00d4", -8711715659676745094L, (long)l2);
        this.cfr_renamed_1 = _6K.c("\u00d4", -8711715659676745094L, (long)l2);
        this.cfr_renamed_0 = _6K.c("\u00d4", -8711715659676745094L, (long)l2);
        Object[] objectArray = new Object[2];
        objectArray[1] = new _95[]{_6K.c("\u00ee", (Object)this, -8711959366613238306L, (long)l2), _6K.c("\u00ee", (Object)this, -8712846302306683994L, (long)l2), _6K.c("\u00ee", (Object)this, -8711354609957234432L, (long)l2), _6K.c("\u00ee", (Object)this, -8712616128832540338L, (long)l2)};
        objectArray[0] = l7;
        _6K.c("C", (Object)this, (Object)objectArray, -8718442949678182878L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                a.init(_6K.class, 33);
                _6K.b = l.a(-5836395657348145801L, 1803921302889232823L, MethodHandles.lookup().lookupClass()).a(127445151057134L);
                _6K.j = new Object[111];
                _6K.k = new String[111];
                _6K.b();
                _6K.f = new HashMap<K, V>(13);
                var0 = _6K.b ^ 7192495891168L;
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
                var8_3 = new long[10];
                var5_4 = 0;
                var6_5 = "C\u00e8g\u00cb7\u00fe\u00f64q\u0006\u00d1 ;?\u00e4a\u0012d\u00d6\u00e7\u00a4\u009b\u00f8\u00f8Pe\u00c2:\u00c7\u00ff\u000b\u00b1[\u00b4\u00ac\u0084m\u008d\u00cc\u001c\u00c6daD\u00fc\u0084\u00e6\u00bdH\u0012G\u008e_\u00a6\u00eb&\u0093/Y\u000b\u0096\u00d1\u001e\u00eb";
                var7_6 = "C\u00e8g\u00cb7\u00fe\u00f64q\u0006\u00d1 ;?\u00e4a\u0012d\u00d6\u00e7\u00a4\u009b\u00f8\u00f8Pe\u00c2:\u00c7\u00ff\u000b\u00b1[\u00b4\u00ac\u0084m\u008d\u00cc\u001c\u00c6daD\u00fc\u0084\u00e6\u00bdH\u0012G\u008e_\u00a6\u00eb&\u0093/Y\u000b\u0096\u00d1\u001e\u00eb".length();
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
                    var6_5 = "i\"\u00bdU\u00b2\u0096~\u00fa;4eddU\u00d8\u0096";
                    var7_6 = "i\"\u00bdU\u00b2\u0096~\u00fa;4eddU\u00d8\u0096".length();
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
        _6K.d = var8_3;
        _6K.e = new Integer[10];
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (k[n3] != null) {
            return n3;
        }
        Object object = j[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 39;
            case 1 -> 2;
            case 2 -> 12;
            case 3 -> 13;
            case 4 -> 51;
            case 5 -> 59;
            case 6 -> 44;
            case 7 -> 18;
            case 8 -> 32;
            case 9 -> 33;
            case 10 -> 5;
            case 11 -> 43;
            case 12 -> 37;
            case 13 -> 34;
            case 14 -> 46;
            case 15 -> 19;
            case 16 -> 11;
            case 17 -> 3;
            case 18 -> 9;
            case 19 -> 60;
            case 20 -> 47;
            case 21 -> 50;
            case 22 -> 24;
            case 23 -> 53;
            case 24 -> 10;
            case 25 -> 38;
            case 26 -> 27;
            case 27 -> 29;
            case 28 -> 25;
            case 29 -> 15;
            case 30 -> 63;
            case 31 -> 57;
            case 32 -> 14;
            case 33 -> 20;
            case 34 -> 4;
            case 35 -> 48;
            case 36 -> 40;
            case 37 -> 49;
            case 38 -> 56;
            case 39 -> 54;
            case 40 -> 41;
            case 41 -> 42;
            case 42 -> 45;
            case 43 -> 31;
            case 44 -> 26;
            case 45 -> 52;
            case 46 -> 28;
            case 47 -> 55;
            case 48 -> 0;
            case 49 -> 62;
            case 50 -> 61;
            case 51 -> 21;
            case 52 -> 8;
            case 53 -> 7;
            case 54 -> 58;
            case 55 -> 22;
            case 56 -> 30;
            case 57 -> 17;
            case 58 -> 6;
            case 59 -> 16;
            case 60 -> 35;
            case 61 -> 23;
            case 62 -> 36;
            default -> 1;
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
        _6K.k[n3] = new String(cArray);
        return n3;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _6K.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ee' || c == 'Q' || c == '\u00d9' || c == '\u00fb') {
                field = _6K.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ee' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'Q' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d9' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _6K.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'C' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = "\u0019?\u000eYX\u001f\u0019?\u0019\u0005T\u0010\u0003t\u0019\u001bT\u0005\u0004\u0005IF\u0005";
        objectArray[1] = "{\u0017\u001e\"%\u0016{\u0017\t~)\u0019a\\\t`)\ff-\\?p";
        objectArray[2] = "<#\fw\u001f\t<#\u001b+\u0013\u0006&h\u001b5\u0013\u0013!\u0019JoG";
        objectArray[3] = Boolean.TYPE;
        _6K.k[3] = "java/lang/Boolean";
        objectArray[4] = "n\u0001\u0000\u007fmZs\u0014\u0002>h\u0006<\u001c";
        objectArray[5] = "\u0001zqUXb\u0001zf\tTm\u001b1f\u0017Tx\u001c@7M\r;";
        objectArray[6] = "g\u001cn\u001fl\u0007g\u001cyC`\b}Wy]`\u001dz&+\b3\\";
        objectArray[7] = "V\u0019\u000e32nV\u0019\u0019o>aLR\u0019q>tK#H.l?";
        objectArray[8] = "hbyQ\b\buw{\u0010\rT:L";
        objectArray[9] = ":yB\u0010Y>$qX_$.$";
        objectArray[10] = "i\u0011\u0010&Dxb\u001e\u0001i%vi\u0015\u00053";
        objectArray[11] = "cx0Ac\"\u0016X;NrmwV0Ev7\u0003";
        objectArray[12] = "+f0=25^F;2#z?H09' K";
        objectArray[13] = "-YJrN\u00143QP=,\b4L";
        objectArray[14] = "R~zI\u000f\u0016Lv`\u0006h\u0017]mm\\N\u0011";
        objectArray[15] = "D\u0010\u001d\u00037xD\u0010\n_;w^[\nA;bY*^\u0019l";
        objectArray[16] = Void.TYPE;
        _6K.k[16] = "java/lang/Void";
        objectArray[17] = "\u007f~U0y\"bkWq|~/]";
        objectArray[18] = "\u0005s\u001fP4\u0006pS\u0014_%I\u0011]\u001fT!\u0013e";
        objectArray[19] = ";\u0006Hm\u001bt%\u000eR\"Vn?\u0004K~Gd?\u0013\u0010IMd2\u0012JcGR4\u0015HeVd";
        objectArray[20] = "\u001dx.B\t,hX%M\u0018c\tV.F\u001c9}";
        objectArray[21] = "tE2\u000b)fjM(Dd|pG1\u0018uvpPj/\u007fv}Q0\u0005u`";
        objectArray[22] = "*\u001c;<=\u000b_<03,D>2;8(\u001eJ";
        objectArray[23] = "j7\u0000\u0001\n!w\"\u0002@\u000f}=1";
        objectArray[24] = "v`xGzH\u0003@sHk\u0007bNxCo]\u0016";
        objectArray[25] = "\u0011\u007f\r ,od_\u0006/= \u0005Q\r$9zq";
        objectArray[26] = "7\\\u0010db\u00187\\\u00078n\u0017-\u0017\u0007&n\u0002*fV|8C";
        objectArray[27] = Integer.TYPE;
        _6K.k[27] = "java/lang/Integer";
        objectArray[28] = "\u007fR\u0017Cj|\u007fR\u0000\u001ffse\u0019\u0000\u0001ffbhQU6-";
        objectArray[29] = "~%_RVJu*N\u001d*Sz*HQ\u0014C";
        objectArray[30] = "f>\u0004^a~x6\u001e\u0011,db<\u0007M=nb+\\y:\u007fy-\u0017";
        objectArray[31] = "\u0004\u0018o<'o\u0019\rm}\"3YO";
        objectArray[32] = ".Sy\u001ayv3F{[|*sD";
        objectArray[33] = "?<8= \u0012\"):|%No+";
        objectArray[34] = " YT#\u00011Uy_,\u0010~4wT'\u0014$@";
        objectArray[35] = "%gYf0A;oC)}[!eZulQ!r\u0001DqZ,s]u{Z;NNtvy.v";
        objectArray[36] = "\u007f\u0000z\u0010sVa\b`_>L{\u0002y\u0003/F{\u0015\"22Mv\u0014~\u00038Ma)m\u00025nt\u0011(:8ZF\u0004x'4Fb";
        objectArray[37] = "#sv/Y0VS} H\u007f7]v+L%C";
        objectArray[38] = "=\u000b\\\u001e}\bH+W\u0011lG)%\\\u001ah\u001d]";
        objectArray[39] = "lkD\u0017j\u0011lkSKf\u001ev SUf\u000bqQ\u0001\u00005K";
        objectArray[40] = Long.TYPE;
        _6K.k[40] = "java/lang/Long";
        objectArray[41] = "'g$l<\u0000RG/c-O3I$h)\u0015G";
        objectArray[42] = "\"h\u000b7\u0019\u001fWH\u00008\bP6F\u000b3\f\nB";
        objectArray[43] = "-(\u0017LS 0=\u0015\rV|}+";
        objectArray[44] = "TCw,b*IVumgv\t^";
        objectArray[45] = "\u0007qJK\u001ec\u001adH\n\u001b?W\u007f";
        objectArray[46] = "D\"fYR$1\u0002mVCkP\ff]G1$";
        objectArray[47] = "\u00105K\u0010@J\u00105\\LLE\n~\\RLP\r\u000f\f\u000f\u0018";
        objectArray[48] = "]\u001akCxmV\u0015z\f\u001b`C\u0013";
        objectArray[49] = "\u0010\u0013^A _\u0007\u0010N@F\u0004\u0014\u0015_\u0018*6BP\u0003@ya\u001bPT\u0019;\u001f\u0004\u0005\u0005AF";
        objectArray[50] = "\t1\u001a7\u001b\u001e\u000e\"G<{It>\u001b'\u001d\t\n!NvE";
        objectArray[51] = "$_$A\u001e\u0010#Sg^!O(E?EM}|\u0000b\u0018\u001a*'\u00004D\\T8Ue\u001c!";
        objectArray[52] = "\"A\u0003RrUxU\u0005\u0006\u0017\u0001vG\u001d\u0005{3\"\u0002DZ\u0017^*X\f\u0010{\u000efD\u0010b";
        objectArray[53] = "F\u0003\u0010FU8K\u000f\u0007\u0005'8BC\u001cy\u0018:M\u000f\r\bX:QM`";
        objectArray[54] = "*\u0000k7{\u0019-\u00136<\u001bLW\u000fj'}\u000e)\u0010?v%";
        objectArray[55] = ")O]\u007f\u0015H{RFai\tCOI}TQ.J\u0002e\r7r\u0000[\u007f\u0011Y{NBki";
        objectArray[56] = "\u0019AWY.fN\u0017^LV('\u0012D\t*lMOD\u0001n";
        objectArray[57] = "\u0013PG\u001c\u0004QU\fO\u0000\u007f\nQQW\u0013\u0003\fW<DJ\u000fT_ZIF\u0018\u0017-";
        objectArray[58] = "a\u0017qe\r|6Axpu5g(e|\u001139E`7\tj_B~uEu`C|`\u000b\u000e";
        objectArray[59] = "5qu*k.q`fhTzc\u007fwt8H4=-)l\u001f2`}}mq|<ixT\"o{-|1x1?'\u0013mep3r\"7qvg\u0017";
        objectArray[60] = "q9OH4J7?\u0005E\n\bORARn\u0005i?D\u0019v\\\u000f8Z[:C09XNt8";
        objectArray[61] = " {\u0014etYz%Po\u001bR|w\b3L\u0005%+\\g\u001b\u0001|bV0~[\"&\\";
        objectArray[62] = "Of{'H&Mi{ap#t'hyM|\u0019\"#a\u0014\u001a\u001e<a-\u000b%\u001f>tcp";
        objectArray[63] = "wk\fT\u0014x#qWK*8\u0012lQ_\u0015ijjTUC\u0002(&\u000f_Xnxj\u0013C*";
        objectArray[64] = "\u001d?$a\u0010x\u001f0$'(u&:v8Y6Jj:$ED";
        objectArray[65] = "0C\u0005,m<g\u0015\f9\u0015p\\|\u00115qsh\u0011\u0014~i*\u000e\u0016\n<%51\u0017\b)kN";
        objectArray[66] = "QD..4f\u0006\u0012';L*o\u00054#qr\u0002\u0000\u007f;(\u0014UJ'6>x\u0005\u0006;*L";
        objectArray[67] = " \b\u0006/S8#\u0003\u0004_G7 \u0007S\b\u0010iw_?6S7s\u0005\u0001!P'r";
        objectArray[68] = "\u000f\r\n<\\_X[\u0003)$\u0013\u007f2\u001e%@\u0010W_\u001bnXI1X\u0005,\u0014V\u000eY\u00079Z-";
        objectArray[69] = "<(\u0014)HR?#\u0016Y\\]<'A\u000e\u000b\u0002a|-`XG)z\u0013)_C,";
        objectArray[70] = "{\u0001\u001c\u007f>Z=]\u0014cE\u000b\"\u000b\np$\u0006>mI}'\\(\u001c\t};\u001eEWGz4\u0012)\u0007\u000bf(`";
        objectArray[71] = "Q\u0016)!\u00058\u0013Tzf\u007f:C\u0011v?\u0013\b\u0015]+bF_LT}>\u0002!S\u0001,f\u007f";
        objectArray[72] = "+j/W\nym6'Kq(qk,Kq)p\u007fuJN(rj;1";
        objectArray[73] = "DNiL$]FT|\u0006UkkuM2\u0014gnoF3UGBG0\r)EXRz";
        objectArray[74] = "$ s\bo'3#c\t\t| &rQeNvc.\t8\u0019/cyPtg06(\b\t";
        objectArray[75] = "\u0002Tw\u0012\u0006\u0011_T\u007fV~\u001a\u0015v.\u0013\u0002\u0017\tR(nDJ\r\\<\u0002\u0014\u0006\u0011@N";
        objectArray[76] = "\u00070\f\u001dS1Pf\u0005\b+s91\n\u001eM8\u0003wV\u0016Q";
        objectArray[77] = "%A`u\u007f\u001er\u0017i`\u0007P\u001b\u0000zx:\nv\u00051`cl!Oimu\u0000q\u0003uq\u0007";
        objectArray[78] = "C\u0004ZLk?D\u0017\u0007G\u000bo>\u000b[\\m(@\u0014\u000e\r5";
        objectArray[79] = "62Mj\u0014 \u007f5Io-{b$VuAI4a\b*\u0012\u001ema]tP`r4\f,-";
        objectArray[80] = "rFj}[.uU7v;u\u000fIkm]9qV><\u0005";
        objectArray[81] = "i\u001e $\u001c_4\u001e(`dNe\u001ae4\u0003Jc!~'d\u00044\u0005\u007f \n\rz\u001ckX";
        objectArray[82] = "\u001e\"#w\u0014DIt*bl\b\u001d\u001d7n\b\u000bFp2%\u0010R w,g\\M\u001fv.r\u00126";
        objectArray[83] = "rr]`Zp/rU$\"aca\u0001}^\u001a}5\u0019p_glz\u001e'\"~sn\u0018uZu d[\u001c";
        objectArray[84] = "\u0019 ,\u0007%x_gk\u0001TE\u00057yFTc\u001fc.L2%X$(";
        objectArray[85] = "X\"!OB~\u000ft(Z:1fx7F@2\u001c,-\u001d_";
        objectArray[86] = "k\u000eFEJ^b\u0016HH&Ad\u0000LMJs0F\u0014\u0012\u001a$s\u001a\u0017DJ[{\u0010^U&";
        objectArray[87] = "'\u000fV@\u000f>aS^\\tmu\u000f<\u0019\u0010f%\u000eMY\u0010zgc\u0006\u0017\u0017uk\u000fV[\u000bi\u0019";
        objectArray[88] = "7B\u0001@\u000b$`\u0014\bUsl\t\u0003\u001bMN0d\u0006PU\u0017V3L\bX\u0001:c\u0000\u0014Ds";
        objectArray[89] = "4>\u001c~)c}9\u0018{\u00108`(\u0007a|\n6mY>-]om\f`m#p8]8\u0010";
        objectArray[90] = "\rOXv\u00016Z\u0019Qcy~3\u0014Tt\u00055C\u0000\u000f'\b";
        objectArray[91] = ".a\u001e\u000e\u0010\u0018)rC\u0005pBSn\u001f\u001e\u0016\u000f-qJON";
        objectArray[92] = "\u00117\u001aX}U\u0016u\u001d\u0019\u0011K\u0012t$FwB\u001bf#Gk@\u0016g2W|F\u0002w\u0018]\u0011A\u00062\u0003_{\u001c\u0006:G'";
        objectArray[93] = "Q4k\u001cx*R?ill%Q;>;;z\rgR\u0013y{E%5Q;(\u0002";
        objectArray[94] = "x\b.^7>#Q~VU)r\u0010]\u0002$\u0014r\u0013\u001e\u001740x\u000brVew\"o";
        objectArray[95] = "Y\tw\u0019R\u0002\u0010\u000es\u001ckY\r\u001fl\u0006\u0007kP_=^k^Y\bj\u001c\u0015A\fY2a\t\u0005\u000b\u0005q\u001f\u0016PZ]\f\u0003\u0019V\u000f\u000fv\n\u0001X\u0002c";
        objectArray[96] = "Y\rmlW\u001dQ\u0007$};\u0007N\u00176eW5\u0013Pl2;\u0000\u001a\u00000\u007fE\u001fOQh\u0002";
        objectArray[97] = "\u0000j!\u0001)3\t$8\u0015Q<M69\u000e-:K[*W!bC='[6!1";
        objectArray[98] = "L#Q#-1\u001buX6UzrbK.h%\u001fg\u000061CH-X;'/\u0018aD'U";
        objectArray[99] = "R5\"\u001d\u001bE\u0005c+\bc\u000fln.\u001f\u001fF\u001czuL\u0012";
        objectArray[100] = "\u0001GawN+V\u0011hb6b?FgtP\"\u0005\u0000;|L";
        objectArray[101] = "\u001d\u001f6f-\u001c\u0010\u0013!%_\u001a\u001dT\u00004/\u0006t\u0015w:.\b\u0018E;&2z";
        objectArray[102] = "-p\u0010~\f,%zYo`6:jKw\f\u0004g-\u0011.`1n}Mm\u001e.;,\u0015\u0010";
        objectArray[103] = "\u000f\u0001|hA$P\u001as6%\u007f`\u001be5\u0018'\r\u001e.-AA[\u0017wh\u001ap\u001f\u0006d*%";
        objectArray[104] = "!qi@\u0003>#~i\u0006;;\u001a#aCKxt jA";
        objectArray[105] = "b(\n\f|^,\u007f\u0006\u0007\u0001Xx:d\u001e8Zt<\u001a\u0001m\u000b,A\u0006EjWo?\u0019\u0010;\u000f\u0012";
        objectArray[106] = "Fpd\u0007\u007f\u0001A|'\u0018@^Jj\u007f\u0003,l\u001e/\"^|;E/t\u0002=EZz%Z@";
        objectArray[107] = "+\u0001@Vn5|WIC\u0016v\u0015\u0000FUp</F\u001a]l";
        objectArray[108] = "Te3q$|@>`|U10}(ihj]xcq1\fR:3k(rMob3U";
        objectArray[109] = "`\r\u0001\u001fWog\u001e\\\u00147;\u001d\u0002\u0000\u000fQxc\u001dU^\t";
        Object[] objectArray2 = objectArray;
        objectArray[110] = "\u0005NEb:sR\u0018LwB?;\u0014Sk8?A@I0'";
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6K" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
        int n = _6K.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = k[n];
                int n3 = string2.indexOf(8);
                clazz3 = _6K.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _6K.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _6K.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _6K.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _6K.f(771661536137419L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _6K.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _6K.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _6K.f(771661536137419L, 0L);
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
            int n = _6K.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _6K.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _6K.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _6K.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _6K.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _6K.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6K" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _6K.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x6FD9;
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
                throw new RuntimeException("dev/krypton/6K", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _6K.e[n2] = n3;
        }
        return e[n2];
    }

    private static Field g(long l2, long l3) {
        int n = _6K.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _6K.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _6K.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _6K.c(clazz3, string2, clazz2)) != null) {
                    _6K.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _6K.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _6K.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _6K.f(771661536137419L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @_3i_0
    public void cfr_renamed_4(_7J j) {
        long l2 = b ^ 0x7618919F0922L;
        _6K.c("C", (Object)_6K.c("\u00ee", (Object)this, 1766293126902145054L, (long)l2), 1767719259388840168L, (long)l2);
        _6K.c("C", (Object)_6K.c("\u00ee", (Object)this, 1765683393057027735L, (long)l2), 1767719259388840168L, (long)l2);
        _6K.c("C", (Object)_6K.c("\u00ee", (Object)this, 1767986159784884124L, (long)l2), 1767719259388840168L, (long)l2);
    }

    @Override
    public native void cfr_renamed_2();

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean boolean_6(Object[] var1_1) {
        block70: {
            block63: {
                block69: {
                    block68: {
                        block67: {
                            block66: {
                                block65: {
                                    block64: {
                                        block62: {
                                            block60: {
                                                block61: {
                                                    block58: {
                                                        block59: {
                                                            block56: {
                                                                block57: {
                                                                    var2_2 = (_3c_0)var1_1[0];
                                                                    var5_3 = (Integer)var1_1[1];
                                                                    var6_4 = (Long)var1_1[2];
                                                                    var4_5 = (Integer)var1_1[3];
                                                                    var3_6 = (Integer)var1_1[4];
                                                                    v0 = var6_4 = _6K.b ^ var6_4;
                                                                    var8_7 = v0 ^ 33658945556117L;
                                                                    var10_8 = v0 ^ 139570243866131L;
                                                                    var12_9 = _8h.cfr_renamed_4();
                                                                    try {
                                                                        try {
                                                                            v1 = new Object[4];
                                                                            v1[3] = var3_6;
                                                                            v1[2] = var10_8;
                                                                            v1[1] = var4_5;
                                                                            v1[0] = var5_3;
                                                                            v2 = new Object[2];
                                                                            v2[1] = _6K.c("C", (Object)var2_2, (Object)v1, (long)5145903656907416215L, (long)var6_4);
                                                                            v2[0] = var8_7;
                                                                            v3 /* !! */  = _6K.c("C", (Object)this, (Object)v2, (long)5145511960478349247L, (long)var6_4);
                                                                            if (var12_9 != null) break block56;
                                                                            if (v3 /* !! */  != false) break block57;
                                                                        }
                                                                        catch (MatchException v4) {
                                                                            throw _6K.a(v4);
                                                                        }
                                                                        return false;
                                                                    }
                                                                    catch (MatchException v5) {
                                                                        throw _6K.a(v5);
                                                                    }
                                                                }
                                                                v6 = new Object[4];
                                                                v6[3] = var3_6 + 1;
                                                                v6[2] = var10_8;
                                                                v6[1] = var4_5;
                                                                v6[0] = var5_3;
                                                                v7 = new Object[2];
                                                                v7[1] = _6K.c("C", (Object)var2_2, (Object)v6, (long)5145903656907416215L, (long)var6_4);
                                                                v7[0] = var8_7;
                                                                v3 /* !! */  = _6K.c("C", (Object)this, (Object)v7, (long)5145511960478349247L, (long)var6_4);
                                                            }
                                                            try {
                                                                try {
                                                                    v8 = var12_9;
                                                                    if (var6_4 >= 0L) {
                                                                        if (v8 != null) break block58;
                                                                        if (v3 /* !! */  != false) break block59;
                                                                    }
                                                                    ** GOTO lbl78
                                                                }
                                                                catch (MatchException v9) {
                                                                    throw _6K.a(v9);
                                                                }
                                                                return false;
                                                            }
                                                            catch (MatchException v10) {
                                                                throw _6K.a(v10);
                                                            }
                                                        }
                                                        v11 = new Object[4];
                                                        v11[3] = var3_6 + 2;
                                                        v11[2] = var10_8;
                                                        v11[1] = var4_5;
                                                        v11[0] = var5_3;
                                                        v12 = new Object[2];
                                                        v12[1] = _6K.c("C", (Object)var2_2, (Object)v11, (long)5145903656907416215L, (long)var6_4);
                                                        v12[0] = var8_7;
                                                        v3 /* !! */  = _6K.c("C", (Object)this, (Object)v12, (long)5145511960478349247L, (long)var6_4);
                                                    }
                                                    try {
                                                        try {
                                                            v8 = var12_9;
lbl78:
                                                            // 2 sources

                                                            if (var6_4 >= 0L) {
                                                                if (v8 != null) break block60;
                                                                if (v3 /* !! */  != false) break block61;
                                                            }
                                                            ** GOTO lbl105
                                                        }
                                                        catch (MatchException v13) {
                                                            throw _6K.a(v13);
                                                        }
                                                        return false;
                                                    }
                                                    catch (MatchException v14) {
                                                        throw _6K.a(v14);
                                                    }
                                                }
                                                v15 = new Object[4];
                                                v15[3] = var3_6 - 1;
                                                v15[2] = var10_8;
                                                v15[1] = var4_5;
                                                v15[0] = var5_3;
                                                v16 = new Object[2];
                                                v16[1] = _6K.c("C", (Object)var2_2, (Object)v15, (long)5145903656907416215L, (long)var6_4);
                                                v16[0] = var8_7;
                                                v3 /* !! */  = _6K.c("C", (Object)this, (Object)v16, (long)5145511960478349247L, (long)var6_4);
                                            }
                                            try {
                                                try {
                                                    v8 = var12_9;
lbl105:
                                                    // 2 sources

                                                    if (var6_4 > 0L) {
                                                        if (v8 != null) break block62;
                                                        if (v3 /* !! */  == false) {
                                                        }
                                                        break block63;
                                                    }
                                                    ** GOTO lbl132
                                                }
                                                catch (MatchException v17) {
                                                    throw _6K.a(v17);
                                                }
                                                v18 = new Object[4];
                                                v18[3] = var3_6 + 3;
                                                v18[2] = var10_8;
                                                v18[1] = var4_5;
                                                v18[0] = var5_3;
                                                v19 = new Object[2];
                                                v19[1] = _6K.c("C", (Object)var2_2, (Object)v18, (long)5145903656907416215L, (long)var6_4);
                                                v19[0] = var8_7;
                                                v3 /* !! */  = _6K.c("C", (Object)this, (Object)v19, (long)5145511960478349247L, (long)var6_4);
                                            }
                                            catch (MatchException v20) {
                                                throw _6K.a(v20);
                                            }
                                        }
                                        try {
                                            try {
                                                v8 = var12_9;
lbl132:
                                                // 2 sources

                                                if (var6_4 > 0L) {
                                                    if (v8 != null) break block64;
                                                    if (v3 /* !! */  != false) break block63;
                                                }
                                                ** GOTO lbl158
                                            }
                                            catch (MatchException v21) {
                                                throw _6K.a(v21);
                                            }
                                            v22 = new Object[4];
                                            v22[3] = var3_6;
                                            v22[2] = var10_8;
                                            v22[1] = var4_5;
                                            v22[0] = var5_3 - 1;
                                            v23 = new Object[2];
                                            v23[1] = _6K.c("C", (Object)var2_2, (Object)v22, (long)5145903656907416215L, (long)var6_4);
                                            v23[0] = var8_7;
                                            v3 /* !! */  = _6K.c("C", (Object)this, (Object)v23, (long)5145511960478349247L, (long)var6_4);
                                        }
                                        catch (MatchException v24) {
                                            throw _6K.a(v24);
                                        }
                                    }
                                    try {
                                        try {
                                            v8 = var12_9;
lbl158:
                                            // 2 sources

                                            if (var6_4 > 0L) {
                                                if (v8 != null) break block65;
                                                if (v3 /* !! */  != false) break block63;
                                            }
                                            ** GOTO lbl184
                                        }
                                        catch (MatchException v25) {
                                            throw _6K.a(v25);
                                        }
                                        v26 = new Object[4];
                                        v26[3] = var3_6;
                                        v26[2] = var10_8;
                                        v26[1] = var4_5;
                                        v26[0] = var5_3 + 1;
                                        v27 = new Object[2];
                                        v27[1] = _6K.c("C", (Object)var2_2, (Object)v26, (long)5145903656907416215L, (long)var6_4);
                                        v27[0] = var8_7;
                                        v3 /* !! */  = _6K.c("C", (Object)this, (Object)v27, (long)5145511960478349247L, (long)var6_4);
                                    }
                                    catch (MatchException v28) {
                                        throw _6K.a(v28);
                                    }
                                }
                                try {
                                    try {
                                        v8 = var12_9;
lbl184:
                                        // 2 sources

                                        if (var6_4 > 0L) {
                                            if (v8 != null) break block66;
                                            if (v3 /* !! */  == false) {
                                            }
                                            break block63;
                                        }
                                        ** GOTO lbl211
                                    }
                                    catch (MatchException v29) {
                                        throw _6K.a(v29);
                                    }
                                    v30 = new Object[4];
                                    v30[3] = var3_6 + 1;
                                    v30[2] = var10_8;
                                    v30[1] = var4_5;
                                    v30[0] = var5_3 - 1;
                                    v31 = new Object[2];
                                    v31[1] = _6K.c("C", (Object)var2_2, (Object)v30, (long)5145903656907416215L, (long)var6_4);
                                    v31[0] = var8_7;
                                    v3 /* !! */  = _6K.c("C", (Object)this, (Object)v31, (long)5145511960478349247L, (long)var6_4);
                                }
                                catch (MatchException v32) {
                                    throw _6K.a(v32);
                                }
                            }
                            try {
                                try {
                                    v8 = var12_9;
lbl211:
                                    // 2 sources

                                    if (var6_4 >= 0L) {
                                        if (v8 != null) break block67;
                                        if (v3 /* !! */  == false) {
                                        }
                                        break block63;
                                    }
                                    ** GOTO lbl238
                                }
                                catch (MatchException v33) {
                                    throw _6K.a(v33);
                                }
                                v34 = new Object[4];
                                v34[3] = var3_6 + 1;
                                v34[2] = var10_8;
                                v34[1] = var4_5;
                                v34[0] = var5_3 + 1;
                                v35 = new Object[2];
                                v35[1] = _6K.c("C", (Object)var2_2, (Object)v34, (long)5145903656907416215L, (long)var6_4);
                                v35[0] = var8_7;
                                v3 /* !! */  = _6K.c("C", (Object)this, (Object)v35, (long)5145511960478349247L, (long)var6_4);
                            }
                            catch (MatchException v36) {
                                throw _6K.a(v36);
                            }
                        }
                        try {
                            try {
                                v8 = var12_9;
lbl238:
                                // 2 sources

                                if (var6_4 >= 0L) {
                                    if (v8 != null) break block68;
                                    if (v3 /* !! */  == false) {
                                    }
                                    break block63;
                                }
                                ** GOTO lbl265
                            }
                            catch (MatchException v37) {
                                throw _6K.a(v37);
                            }
                            v38 = new Object[4];
                            v38[3] = var3_6 + 2;
                            v38[2] = var10_8;
                            v38[1] = var4_5;
                            v38[0] = var5_3 - 1;
                            v39 = new Object[2];
                            v39[1] = _6K.c("C", (Object)var2_2, (Object)v38, (long)5145903656907416215L, (long)var6_4);
                            v39[0] = var8_7;
                            v3 /* !! */  = _6K.c("C", (Object)this, (Object)v39, (long)5145511960478349247L, (long)var6_4);
                        }
                        catch (MatchException v40) {
                            throw _6K.a(v40);
                        }
                    }
                    try {
                        try {
                            v8 = var12_9;
lbl265:
                            // 2 sources

                            if (var6_4 >= 0L) {
                                if (v8 != null) break block69;
                                if (v3 /* !! */  == false) {
                                }
                                break block63;
                            }
                            ** GOTO lbl291
                        }
                        catch (MatchException v41) {
                            throw _6K.a(v41);
                        }
                        v42 = new Object[4];
                        v42[3] = var3_6 + 2;
                        v42[2] = var10_8;
                        v42[1] = var4_5;
                        v42[0] = var5_3 + 1;
                        v43 = new Object[2];
                        v43[1] = _6K.c("C", (Object)var2_2, (Object)v42, (long)5145903656907416215L, (long)var6_4);
                        v43[0] = var8_7;
                        v3 /* !! */  = _6K.c("C", (Object)this, (Object)v43, (long)5145511960478349247L, (long)var6_4);
                    }
                    catch (MatchException v44) {
                        throw _6K.a(v44);
                    }
                }
                try {
                    v8 = var12_9;
lbl291:
                    // 2 sources

                    if (v8 != null) break block70;
                    if (v3 /* !! */  != false) break block63;
                }
                catch (MatchException v45) {
                    throw _6K.a(v45);
                }
                v3 /* !! */  = (CallSite)true;
                break block70;
            }
            v3 /* !! */  = (CallSite)false;
        }
        return (boolean)v3 /* !! */ ;
    }

    private void cfr_renamed_262(Object[] objectArray) {
        class_2818 class_28182 = (class_2818)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = (l2 = b ^ l2) ^ 0x520242FB4AFL;
        _6K.c("C", (Object)_6K.c("\u00ee", (Object)this, -386392354980284806L, (long)l2), () -> this.cfr_renamed_376(l3, class_28182), -380130268242828748L, (long)l2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean boolean_2(Object[] var1_1) {
        block71: {
            block64: {
                block70: {
                    block69: {
                        block68: {
                            block67: {
                                block66: {
                                    block65: {
                                        block63: {
                                            block61: {
                                                block62: {
                                                    block59: {
                                                        block60: {
                                                            block57: {
                                                                block58: {
                                                                    var5_2 = (Long)var1_1[0];
                                                                    var7_3 = (_3c_0)var1_1[1];
                                                                    var4_4 = (Integer)var1_1[2];
                                                                    var3_5 = (Integer)var1_1[3];
                                                                    var2_6 = (Integer)var1_1[4];
                                                                    v0 = var5_2 = _6K.b ^ var5_2;
                                                                    var8_7 = v0 ^ 55614173527166L;
                                                                    var10_8 = v0 ^ 91226191592696L;
                                                                    var12_9 = _8h.cfr_renamed_4();
                                                                    try {
                                                                        try {
                                                                            v1 = new Object[4];
                                                                            v1[3] = var2_6;
                                                                            v1[2] = var10_8;
                                                                            v1[1] = var3_5;
                                                                            v1[0] = var4_4;
                                                                            v2 = new Object[2];
                                                                            v2[1] = _6K.c("C", (Object)var7_3, (Object)v1, (long)-5367516609912418180L, (long)var5_2);
                                                                            v2[0] = var8_7;
                                                                            v3 /* !! */  = _6K.c("C", (Object)this, (Object)v2, (long)-5367257395994753708L, (long)var5_2);
                                                                            if (var12_9 != null) break block57;
                                                                            if (v3 /* !! */  != false) break block58;
                                                                        }
                                                                        catch (MatchException v4) {
                                                                            throw _6K.a(v4);
                                                                        }
                                                                        return false;
                                                                    }
                                                                    catch (MatchException v5) {
                                                                        throw _6K.a(v5);
                                                                    }
                                                                }
                                                                v6 = new Object[4];
                                                                v6[3] = var2_6;
                                                                v6[2] = var10_8;
                                                                v6[1] = var3_5;
                                                                v6[0] = var4_4 + 1;
                                                                v7 = new Object[2];
                                                                v7[1] = _6K.c("C", (Object)var7_3, (Object)v6, (long)-5367516609912418180L, (long)var5_2);
                                                                v7[0] = var8_7;
                                                                v3 /* !! */  = _6K.c("C", (Object)this, (Object)v7, (long)-5367257395994753708L, (long)var5_2);
                                                            }
                                                            try {
                                                                try {
                                                                    v8 = var12_9;
                                                                    if (var5_2 > 0L) {
                                                                        if (v8 != null) break block59;
                                                                        if (v3 /* !! */  != false) break block60;
                                                                    }
                                                                    ** GOTO lbl78
                                                                }
                                                                catch (MatchException v9) {
                                                                    throw _6K.a(v9);
                                                                }
                                                                return false;
                                                            }
                                                            catch (MatchException v10) {
                                                                throw _6K.a(v10);
                                                            }
                                                        }
                                                        v11 = new Object[4];
                                                        v11[3] = var2_6;
                                                        v11[2] = var10_8;
                                                        v11[1] = var3_5;
                                                        v11[0] = var4_4 + 2;
                                                        v12 = new Object[2];
                                                        v12[1] = _6K.c("C", (Object)var7_3, (Object)v11, (long)-5367516609912418180L, (long)var5_2);
                                                        v12[0] = var8_7;
                                                        v3 /* !! */  = _6K.c("C", (Object)this, (Object)v12, (long)-5367257395994753708L, (long)var5_2);
                                                    }
                                                    try {
                                                        try {
                                                            v8 = var12_9;
lbl78:
                                                            // 2 sources

                                                            if (var5_2 >= 0L) {
                                                                if (v8 != null) break block61;
                                                                if (v3 /* !! */  != false) break block62;
                                                            }
                                                            ** GOTO lbl105
                                                        }
                                                        catch (MatchException v13) {
                                                            throw _6K.a(v13);
                                                        }
                                                        return false;
                                                    }
                                                    catch (MatchException v14) {
                                                        throw _6K.a(v14);
                                                    }
                                                }
                                                v15 = new Object[4];
                                                v15[3] = var2_6;
                                                v15[2] = var10_8;
                                                v15[1] = var3_5;
                                                v15[0] = var4_4 - 1;
                                                v16 = new Object[2];
                                                v16[1] = _6K.c("C", (Object)var7_3, (Object)v15, (long)-5367516609912418180L, (long)var5_2);
                                                v16[0] = var8_7;
                                                v3 /* !! */  = _6K.c("C", (Object)this, (Object)v16, (long)-5367257395994753708L, (long)var5_2);
                                            }
                                            try {
                                                try {
                                                    v8 = var12_9;
lbl105:
                                                    // 2 sources

                                                    if (var5_2 >= 0L) {
                                                        if (v8 != null) break block63;
                                                        if (v3 /* !! */  != false) break block64;
                                                    }
                                                    ** GOTO lbl131
                                                }
                                                catch (MatchException v17) {
                                                    throw _6K.a(v17);
                                                }
                                                v18 = new Object[4];
                                                v18[3] = var2_6;
                                                v18[2] = var10_8;
                                                v18[1] = var3_5;
                                                v18[0] = var4_4 + 3;
                                                v19 = new Object[2];
                                                v19[1] = _6K.c("C", (Object)var7_3, (Object)v18, (long)-5367516609912418180L, (long)var5_2);
                                                v19[0] = var8_7;
                                                v3 /* !! */  = _6K.c("C", (Object)this, (Object)v19, (long)-5367257395994753708L, (long)var5_2);
                                            }
                                            catch (MatchException v20) {
                                                throw _6K.a(v20);
                                            }
                                        }
                                        try {
                                            try {
                                                v8 = var12_9;
lbl131:
                                                // 2 sources

                                                if (var5_2 > 0L) {
                                                    if (v8 != null) break block65;
                                                    if (v3 /* !! */  == false) {
                                                    }
                                                    break block64;
                                                }
                                                ** GOTO lbl158
                                            }
                                            catch (MatchException v21) {
                                                throw _6K.a(v21);
                                            }
                                            v22 = new Object[4];
                                            v22[3] = var2_6 - 1;
                                            v22[2] = var10_8;
                                            v22[1] = var3_5;
                                            v22[0] = var4_4;
                                            v23 = new Object[2];
                                            v23[1] = _6K.c("C", (Object)var7_3, (Object)v22, (long)-5367516609912418180L, (long)var5_2);
                                            v23[0] = var8_7;
                                            v3 /* !! */  = _6K.c("C", (Object)this, (Object)v23, (long)-5367257395994753708L, (long)var5_2);
                                        }
                                        catch (MatchException v24) {
                                            throw _6K.a(v24);
                                        }
                                    }
                                    try {
                                        try {
                                            v8 = var12_9;
lbl158:
                                            // 2 sources

                                            if (var5_2 >= 0L) {
                                                if (v8 != null) break block66;
                                                if (v3 /* !! */  == false) {
                                                }
                                                break block64;
                                            }
                                            ** GOTO lbl185
                                        }
                                        catch (MatchException v25) {
                                            throw _6K.a(v25);
                                        }
                                        v26 = new Object[4];
                                        v26[3] = var2_6 + 1;
                                        v26[2] = var10_8;
                                        v26[1] = var3_5;
                                        v26[0] = var4_4;
                                        v27 = new Object[2];
                                        v27[1] = _6K.c("C", (Object)var7_3, (Object)v26, (long)-5367516609912418180L, (long)var5_2);
                                        v27[0] = var8_7;
                                        v3 /* !! */  = _6K.c("C", (Object)this, (Object)v27, (long)-5367257395994753708L, (long)var5_2);
                                    }
                                    catch (MatchException v28) {
                                        throw _6K.a(v28);
                                    }
                                }
                                try {
                                    try {
                                        v8 = var12_9;
lbl185:
                                        // 2 sources

                                        if (var5_2 >= 0L) {
                                            if (v8 != null) break block67;
                                            if (v3 /* !! */  == false) {
                                            }
                                            break block64;
                                        }
                                        ** GOTO lbl212
                                    }
                                    catch (MatchException v29) {
                                        throw _6K.a(v29);
                                    }
                                    v30 = new Object[4];
                                    v30[3] = var2_6 - 1;
                                    v30[2] = var10_8;
                                    v30[1] = var3_5;
                                    v30[0] = var4_4 + 1;
                                    v31 = new Object[2];
                                    v31[1] = _6K.c("C", (Object)var7_3, (Object)v30, (long)-5367516609912418180L, (long)var5_2);
                                    v31[0] = var8_7;
                                    v3 /* !! */  = _6K.c("C", (Object)this, (Object)v31, (long)-5367257395994753708L, (long)var5_2);
                                }
                                catch (MatchException v32) {
                                    throw _6K.a(v32);
                                }
                            }
                            try {
                                try {
                                    v8 = var12_9;
lbl212:
                                    // 2 sources

                                    if (var5_2 > 0L) {
                                        if (v8 != null) break block68;
                                        if (v3 /* !! */  == false) {
                                        }
                                        break block64;
                                    }
                                    ** GOTO lbl239
                                }
                                catch (MatchException v33) {
                                    throw _6K.a(v33);
                                }
                                v34 = new Object[4];
                                v34[3] = var2_6 + 1;
                                v34[2] = var10_8;
                                v34[1] = var3_5;
                                v34[0] = var4_4 + 1;
                                v35 = new Object[2];
                                v35[1] = _6K.c("C", (Object)var7_3, (Object)v34, (long)-5367516609912418180L, (long)var5_2);
                                v35[0] = var8_7;
                                v3 /* !! */  = _6K.c("C", (Object)this, (Object)v35, (long)-5367257395994753708L, (long)var5_2);
                            }
                            catch (MatchException v36) {
                                throw _6K.a(v36);
                            }
                        }
                        try {
                            try {
                                v8 = var12_9;
lbl239:
                                // 2 sources

                                if (var5_2 >= 0L) {
                                    if (v8 != null) break block69;
                                    if (v3 /* !! */  == false) {
                                    }
                                    break block64;
                                }
                                ** GOTO lbl266
                            }
                            catch (MatchException v37) {
                                throw _6K.a(v37);
                            }
                            v38 = new Object[4];
                            v38[3] = var2_6 - 1;
                            v38[2] = var10_8;
                            v38[1] = var3_5;
                            v38[0] = var4_4 + 2;
                            v39 = new Object[2];
                            v39[1] = _6K.c("C", (Object)var7_3, (Object)v38, (long)-5367516609912418180L, (long)var5_2);
                            v39[0] = var8_7;
                            v3 /* !! */  = _6K.c("C", (Object)this, (Object)v39, (long)-5367257395994753708L, (long)var5_2);
                        }
                        catch (MatchException v40) {
                            throw _6K.a(v40);
                        }
                    }
                    try {
                        try {
                            v8 = var12_9;
lbl266:
                            // 2 sources

                            if (var5_2 >= 0L) {
                                if (v8 != null) break block70;
                                if (v3 /* !! */  == false) {
                                }
                                break block64;
                            }
                            ** GOTO lbl292
                        }
                        catch (MatchException v41) {
                            throw _6K.a(v41);
                        }
                        v42 = new Object[4];
                        v42[3] = var2_6 + 1;
                        v42[2] = var10_8;
                        v42[1] = var3_5;
                        v42[0] = var4_4 + 2;
                        v43 = new Object[2];
                        v43[1] = _6K.c("C", (Object)var7_3, (Object)v42, (long)-5367516609912418180L, (long)var5_2);
                        v43[0] = var8_7;
                        v3 /* !! */  = _6K.c("C", (Object)this, (Object)v43, (long)-5367257395994753708L, (long)var5_2);
                    }
                    catch (MatchException v44) {
                        throw _6K.a(v44);
                    }
                }
                try {
                    v8 = var12_9;
lbl292:
                    // 2 sources

                    if (v8 != null) break block71;
                    if (v3 /* !! */  != false) break block64;
                }
                catch (MatchException v45) {
                    throw _6K.a(v45);
                }
                v3 /* !! */  = (CallSite)true;
                break block71;
            }
            v3 /* !! */  = (CallSite)false;
        }
        return (boolean)v3 /* !! */ ;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean boolean_4(Object[] var1_1) {
        block29: {
            block26: {
                block28: {
                    block27: {
                        block25: {
                            block23: {
                                block24: {
                                    var3_2 = (Long)var1_1[0];
                                    var2_3 = (_3c_0)var1_1[1];
                                    var5_4 = (Integer)var1_1[2];
                                    var7_5 = (Integer)var1_1[3];
                                    var6_6 = (Integer)var1_1[4];
                                    v0 = var3_2 = _6K.b ^ var3_2;
                                    var8_7 = v0 ^ 73683790473503L;
                                    var10_8 = v0 ^ 38960581110169L;
                                    var12_9 = _8h.cfr_renamed_4();
                                    v1 = new Object[4];
                                    v1[3] = var6_6;
                                    v1[2] = var10_8;
                                    v1[1] = var7_5;
                                    v1[0] = var5_4;
                                    var13_10 = _6K.c("C", (Object)var2_3, (Object)v1, (long)2369933007593129245L, (long)var3_2);
                                    try {
                                        try {
                                            v2 = new Object[2];
                                            v2[1] = var13_10;
                                            v2[0] = var8_7;
                                            v3 /* !! */  = _6K.c("C", (Object)this, (Object)v2, (long)2369696333679530037L, (long)var3_2);
                                            if (var12_9 != null) break block23;
                                            if (v3 /* !! */  != false) break block24;
                                        }
                                        catch (MatchException v4) {
                                            throw _6K.a(v4);
                                        }
                                        return false;
                                    }
                                    catch (MatchException v5) {
                                        throw _6K.a(v5);
                                    }
                                }
                                v6 = new Object[4];
                                v6[3] = var6_6;
                                v6[2] = var10_8;
                                v6[1] = var7_5;
                                v6[0] = var5_4 - 1;
                                v7 = new Object[2];
                                v7[1] = _6K.c("C", (Object)var2_3, (Object)v6, (long)2369933007593129245L, (long)var3_2);
                                v7[0] = var8_7;
                                v3 /* !! */  = _6K.c("C", (Object)this, (Object)v7, (long)2369696333679530037L, (long)var3_2);
                            }
                            try {
                                try {
                                    v8 = var12_9;
                                    if (var3_2 >= 0L) {
                                        if (v8 != null) break block25;
                                        if (v3 /* !! */  != false) break block26;
                                    }
                                    ** GOTO lbl77
                                }
                                catch (MatchException v9) {
                                    throw _6K.a(v9);
                                }
                                v10 = new Object[4];
                                v10[3] = var6_6;
                                v10[2] = var10_8;
                                v10[1] = var7_5;
                                v10[0] = var5_4 + 1;
                                v11 = new Object[2];
                                v11[1] = _6K.c("C", (Object)var2_3, (Object)v10, (long)2369933007593129245L, (long)var3_2);
                                v11[0] = var8_7;
                                v3 /* !! */  = _6K.c("C", (Object)this, (Object)v11, (long)2369696333679530037L, (long)var3_2);
                            }
                            catch (MatchException v12) {
                                throw _6K.a(v12);
                            }
                        }
                        try {
                            try {
                                v8 = var12_9;
lbl77:
                                // 2 sources

                                if (var3_2 >= 0L) {
                                    if (v8 != null) break block27;
                                    if (v3 /* !! */  == false) {
                                    }
                                    break block26;
                                }
                                ** GOTO lbl104
                            }
                            catch (MatchException v13) {
                                throw _6K.a(v13);
                            }
                            v14 = new Object[4];
                            v14[3] = var6_6 - 1;
                            v14[2] = var10_8;
                            v14[1] = var7_5;
                            v14[0] = var5_4;
                            v15 = new Object[2];
                            v15[1] = _6K.c("C", (Object)var2_3, (Object)v14, (long)2369933007593129245L, (long)var3_2);
                            v15[0] = var8_7;
                            v3 /* !! */  = _6K.c("C", (Object)this, (Object)v15, (long)2369696333679530037L, (long)var3_2);
                        }
                        catch (MatchException v16) {
                            throw _6K.a(v16);
                        }
                    }
                    try {
                        try {
                            v8 = var12_9;
lbl104:
                            // 2 sources

                            if (var3_2 > 0L) {
                                if (v8 != null) break block28;
                                if (v3 /* !! */  == false) {
                                }
                                break block26;
                            }
                            ** GOTO lbl130
                        }
                        catch (MatchException v17) {
                            throw _6K.a(v17);
                        }
                        v18 = new Object[4];
                        v18[3] = var6_6 + 1;
                        v18[2] = var10_8;
                        v18[1] = var7_5;
                        v18[0] = var5_4;
                        v19 = new Object[2];
                        v19[1] = _6K.c("C", (Object)var2_3, (Object)v18, (long)2369933007593129245L, (long)var3_2);
                        v19[0] = var8_7;
                        v3 /* !! */  = _6K.c("C", (Object)this, (Object)v19, (long)2369696333679530037L, (long)var3_2);
                    }
                    catch (MatchException v20) {
                        throw _6K.a(v20);
                    }
                }
                try {
                    v8 = var12_9;
lbl130:
                    // 2 sources

                    if (v8 != null) break block29;
                    if (v3 /* !! */  != false) break block26;
                }
                catch (MatchException v21) {
                    throw _6K.a(v21);
                }
                v3 /* !! */  = (CallSite)true;
                break block29;
            }
            v3 /* !! */  = (CallSite)false;
        }
        return (boolean)v3 /* !! */ ;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @_3i_0
    public void cfr_renamed_8(_6c_0 var1_1) {
        block34: {
            block32: {
                block29: {
                    block30: {
                        block27: {
                            block28: {
                                block26: {
                                    v0 = var2_2 = _6K.b ^ 11239376316833L;
                                    var4_3 = v0 ^ 80339837187494L;
                                    var6_4 = v0 ^ 129850656635463L;
                                    var8_5 = v0 ^ 105627271219421L;
                                    var10_6 = v0 ^ 24823287231894L;
                                    var12_7 = _8h.cfr_renamed_4();
                                    try {
                                        try {
                                            try {
                                                v1 = _6K.c("\u00ee", (Object)this, (long)8647844127371909765L, (long)var2_2);
                                                if (var12_7 != null) break block26;
                                                if (_6K.c("\u00ee", (Object)v1, (long)8649182050625245168L, (long)var2_2) != null) {
                                                }
                                                ** GOTO lbl30
                                            }
                                            catch (MatchException v2) {
                                                throw _6K.a(v2);
                                            }
                                            v3 = this;
                                            if (var12_7 != null) break block27;
                                        }
                                        catch (MatchException v4) {
                                            throw _6K.a(v4);
                                        }
                                        v1 = _6K.c("\u00ee", (Object)v3, (long)8647844127371909765L, (long)var2_2);
                                    }
                                    catch (MatchException v5) {
                                        throw _6K.a(v5);
                                    }
                                }
                                try {
                                    if (_6K.c("\u00ee", (Object)v1, (long)8649636250121086949L, (long)var2_2) != null) break block28;
lbl30:
                                    // 2 sources

                                    return;
                                }
                                catch (MatchException v6) {
                                    throw _6K.a(v6);
                                }
                            }
                            v3 = this;
                        }
                        v7 = new Object[1];
                        v7[0] = var4_3;
                        var13_8 = _6K.c("C", (Object)_6K.c("\u00ee", (Object)v3, (long)8647388918709030489L, (long)var2_2), (Object)v7, (long)8647552774926896265L, (long)var2_2);
                        var14_9 = new _8B((int)_6K.a("v", (int)12570, (long)(7719949206132205274L ^ var2_2)), 0, var6_4, 0, (int)var13_8);
                        var15_10 = new _8B((int)_6K.a("v", (int)19831, (long)(9097657803091073716L ^ var2_2)), (int)_6K.a("v", (int)12031, (long)(6869254053051709758L ^ var2_2)), var6_4, 0, (int)var13_8);
                        var16_11 = _6K.c("C", (Object)_6K.c("\u00ee", (Object)_6K.c("\u00ee", (Object)this, (long)8647844127371909765L, (long)var2_2), (long)8650901111515509327L, (long)var2_2), (long)8649328346610589832L, (long)var2_2);
                        var17_12 = _6K.c("C", (Object)_6K.c("\u00ee", (Object)_6K.c("\u00ee", (Object)this, (long)8647844127371909765L, (long)var2_2), (long)8649636250121086949L, (long)var2_2), (long)8652863113532984477L, (long)var2_2) >> 4;
                        var18_13 = _6K.c("C", (Object)_6K.c("\u00ee", (Object)_6K.c("\u00ee", (Object)this, (long)8647844127371909765L, (long)var2_2), (long)8649636250121086949L, (long)var2_2), (long)8650239057096303582L, (long)var2_2) >> 4;
                        try {
                            v8 = _6K.c("C", (Object)_6K.c("\u00ee", (Object)this, (long)8647724778984754353L, (long)var2_2), (long)var10_6, (long)8653279780872904963L, (long)var2_2);
                            if (var12_7 != null) break block29;
                            if (v8 == false) break block30;
                        }
                        catch (MatchException v9) {
                            throw _6K.a(v9);
                        }
                        var19_14 = _6K.c("C", (Object)_6K.c("\u00ee", (Object)this, (long)8647014766698561693L, (long)var2_2), (long)8653424082734395929L, (long)var2_2);
                        while (_6K.c("C", (Object)var19_14, (long)8646917215574345826L, (long)var2_2) != false) {
                            block31: {
                                var20_15 = (_4f)_6K.c("C", (Object)var19_14, (long)8652610373936012406L, (long)var2_2);
                                var21_16 = _6K.c("\u00ee", (Object)var20_15, (long)8647478382031291856L, (long)var2_2) >> 4;
                                var22_17 = _6K.c("\u00ee", (Object)var20_15, (long)8653047769564903571L, (long)var2_2) >> 4;
                                try {
                                    try {
                                        v10 = _6K.c("\u00d4", (int)(var21_16 - var17_12), (long)8647760106244430572L, (long)var2_2);
                                        v11 = var16_11;
                                        if (var12_7 == null) {
                                            if (var12_7 != null) break block31;
                                        }
                                        ** GOTO lbl115
                                    }
                                    catch (MatchException v12) {
                                        throw _6K.a(v12);
                                    }
                                    if (v10 > v11) continue;
                                }
                                catch (MatchException v13) {
                                    throw _6K.a(v13);
                                }
                                v14 = _6K.c("\u00d4", (int)(var22_17 - var18_13), (long)8647760106244430572L, (long)var2_2);
                                v15 = var16_11;
                            }
                            if (v14 > v15) continue;
                            v16 = new Object[11];
                            v16[10] = var8_5;
                            v16[9] = 0;
                            v16[8] = _6K.c("\u00d9", (long)8650415091012882352L, (long)var2_2);
                            v16[7] = var14_9;
                            v16[6] = var14_9;
                            v16[5] = (double)(_6K.c("\u00ee", (Object)var20_15, (long)8653047769564903571L, (long)var2_2) + true);
                            v16[4] = (double)_6K.c("\u00ee", (Object)var20_15, (long)8652767424598698128L, (long)var2_2);
                            v16[3] = (double)(_6K.c("\u00ee", (Object)var20_15, (long)8647478382031291856L, (long)var2_2) + true);
                            v16[2] = (double)_6K.c("\u00ee", (Object)var20_15, (long)8653047769564903571L, (long)var2_2);
                            v16[1] = (double)_6K.c("\u00ee", (Object)var20_15, (long)8651280245461934766L, (long)var2_2);
                            v16[0] = (double)_6K.c("\u00ee", (Object)var20_15, (long)8647478382031291856L, (long)var2_2);
                            _6K.c("C", (Object)var1_1.cfr_renamed_7, (Object)v16, (long)8653205573000831738L, (long)var2_2);
                            if (var12_7 == null) continue;
                        }
                    }
                    try {
                        v17 = this;
                        if (var12_7 != null) break block32;
                        v8 = _6K.c("C", (Object)_6K.c("\u00ee", (Object)v17, (long)8650340172226651671L, (long)var2_2), (long)var10_6, (long)8653279780872904963L, (long)var2_2);
                    }
                    catch (MatchException v18) {
                        throw _6K.a(v18);
                    }
                }
                if (v8 == false) break block34;
                v17 = this;
            }
            var19_14 = _6K.c("C", (Object)_6K.c("\u00ee", (Object)v17, (long)8647909162932442644L, (long)var2_2), (long)8653424082734395929L, (long)var2_2);
            while (_6K.c("C", (Object)var19_14, (long)8646917215574345826L, (long)var2_2) != false) {
                block33: {
                    var20_15 = (_4f)_6K.c("C", (Object)var19_14, (long)8652610373936012406L, (long)var2_2);
                    var21_16 = _6K.c("\u00ee", (Object)var20_15, (long)8647478382031291856L, (long)var2_2) >> 4;
                    var22_17 = _6K.c("\u00ee", (Object)var20_15, (long)8653047769564903571L, (long)var2_2) >> 4;
                    v10 = _6K.c("\u00d4", (int)(var21_16 - var17_12), (long)8647760106244430572L, (long)var2_2);
                    v11 = var16_11;
lbl115:
                    // 2 sources

                    try {
                        if (var12_7 != null) break block33;
                        if (v10 > v11) continue;
                    }
                    catch (MatchException v19) {
                        throw _6K.a(v19);
                    }
                    v10 = _6K.c("\u00d4", (int)(var22_17 - var18_13), (long)8647760106244430572L, (long)var2_2);
                    v11 = var16_11;
                }
                if (v10 > v11) continue;
                v20 = new Object[11];
                v20[10] = var8_5;
                v20[9] = 0;
                v20[8] = _6K.c("\u00d9", (long)8650415091012882352L, (long)var2_2);
                v20[7] = var15_10;
                v20[6] = var15_10;
                v20[5] = (double)(_6K.c("\u00ee", (Object)var20_15, (long)8653047769564903571L, (long)var2_2) + _6K.c("\u00ee", (Object)var20_15, (long)8649961598010500492L, (long)var2_2));
                v20[4] = (double)_6K.c("\u00ee", (Object)var20_15, (long)8652767424598698128L, (long)var2_2);
                v20[3] = (double)(_6K.c("\u00ee", (Object)var20_15, (long)8647478382031291856L, (long)var2_2) + _6K.c("\u00ee", (Object)var20_15, (long)8650706985146029160L, (long)var2_2));
                v20[2] = (double)_6K.c("\u00ee", (Object)var20_15, (long)8653047769564903571L, (long)var2_2);
                v20[1] = (double)_6K.c("\u00ee", (Object)var20_15, (long)8651280245461934766L, (long)var2_2);
                v20[0] = (double)_6K.c("\u00ee", (Object)var20_15, (long)8647478382031291856L, (long)var2_2);
                _6K.c("C", (Object)var1_1.cfr_renamed_7, (Object)v20, (long)8653205573000831738L, (long)var2_2);
                if (var12_7 == null) continue;
            }
        }
    }

    @_3i_0
    public void cfr_renamed_8(_6Q q) {
        CallSite callSite;
        long l2;
        long l3;
        block2: {
            block3: {
                l3 = b ^ 0x27AA3D2142C4L;
                l2 = l3 ^ 0x72CA6A44B869L;
                String string = _8h.cfr_renamed_4();
                try {
                    callSite = _6K.c("\u00ee", (Object)_6K.c("\u00ee", (Object)this, 6009629259140329952L, (long)l3), 6011527791589909653L, (long)l3);
                    if (string != null) break block2;
                    if (callSite != null) break block3;
                }
                catch (MatchException matchException) {
                    throw _6K.a(matchException);
                }
                return;
            }
            callSite = _6K.c("\u00ee", (Object)_6K.c("\u00ee", (Object)this, 6009629259140329952L, (long)l3), 6011527791589909653L, (long)l3);
        }
        CallSite callSite2 = _6K.c("C", (Object)callSite, (int)_6K.c("C", (Object)q.cfr_renamed_5, 6012457537938867412L, (long)l3), (int)_6K.c("C", (Object)q.cfr_renamed_5, 6009708531446376993L, (long)l3), 6011073584668205385L, (long)l3);
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = callSite2;
        _6K.c("C", (Object)this, (Object)objectArray, 6013096527907757401L, (long)l3);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_6K.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_6K.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

