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
import dev.krypton._0U;
import dev.krypton._6X;
import dev.krypton._7V;
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

/*
 * Renamed from dev.krypton.8J
 */
public class _8j_0
extends _8e {
    private final _6X cfr_renamed_5;
    private final List cfr_renamed_0;
    private final _7V cfr_renamed_6;
    private float cfr_renamed_3;
    private int cfr_renamed_8;
    private static final long b;
    private static final String[] f;
    private static final String[] g;
    private static final Map h;
    private static final long[] l;
    private static final Integer[] m;
    private static final Map n;
    private static final Object[] q;
    private static final String[] r;

    public _8j_0(_0U u, _6X x, long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x5BC361647050L;
        long l5 = l3 ^ 0xF9068D1231EL;
        long l6 = l3 ^ 0x7B11E2EC1D8L;
        long l7 = l3 ^ 0x505E654F6F26L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l7;
        super(x.java_lang_String_5(objectArray) + (String)((Object)_8j_0.b("r", 30483, (long)(0x625B2F3378795F97L ^ l2))));
        this.cfr_renamed_6 = new _7V(l4);
        _8j_0.f("g", (Object)this, 0.0f, -689388061201387468L, (long)l2);
        _8j_0.f("g", (Object)this, (int)_8j_0.d("v", 24044, (long)(0x516271CD21560F68L ^ l2)), -688745475889278589L, (long)l2);
        this.cfr_renamed_5 = x;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l6;
        this.cfr_renamed_0 = new ArrayList(_8j_0.f("d", (Object)x, (Object)objectArray2, -687683136208049551L, (long)l2));
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l5;
        objectArray3[0] = false;
        _8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -688546159815281929L, (long)l2), (Object)objectArray3, -689676856988100919L, (long)l2);
    }

    @Override
    protected int int_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return (int)_8j_0.d("v", 24608, (long)(0x2AE1A8EB623A4A49L ^ l2));
    }

    @Override
    protected int int_6(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return (int)_8j_0.d("v", 971, (long)(0x7BE4D5055B89DB1DL ^ l2));
    }

    @Override
    protected int int_9(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return (int)_8j_0.d("v", 27758, (long)(0x1825674AB948D54FL ^ l2));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    protected void cfr_renamed_9(Object[] var1_1) {
        block30: {
            block31: {
                var3_2 = (_87)var1_1[0];
                var2_3 = (Integer)var1_1[1];
                var10_4 = (Integer)var1_1[2];
                var7_5 = (Integer)var1_1[3];
                var6_6 = (Integer)var1_1[4];
                var8_7 = (Integer)var1_1[5];
                var11_8 = (Integer)var1_1[6];
                var9_9 = ((Float)var1_1[7]).floatValue();
                var4_10 = (Long)var1_1[8];
                v0 = var4_10;
                var12_11 = v0 ^ 82033205121347L;
                var14_12 = v0 ^ 139188352258284L;
                var16_13 = v0 ^ 66759006580906L;
                var18_14 = v0 ^ 1145088352237L;
                var20_15 = v0 ^ 39715544357412L;
                var22_16 = v0 ^ 108731785440199L;
                var24_17 = v0 ^ 120852436948926L;
                var26_18 = v0 ^ 84297330515943L;
                var28_19 = v0 ^ 24720861089480L;
                var30_20 = v0 ^ 110551407481054L;
                var32_21 = v0 ^ 123174258099033L;
                var34_22 = v0 ^ 92313003645111L;
                var43_23 = var10_4 + _8j_0.d("v", (int)29536, (long)(3865127836179913488L ^ var4_10));
                var44_24 = _8j_0.d("v", (int)15183, (long)(4329648499591680804L ^ var4_10));
                var42_25 = _02.cfr_renamed_2();
                var45_26 = 0;
                block22: while (var45_26 < _8j_0.f("d", (Object)_8j_0.f("m", (Object)this, (long)-8321234076342523194L, (long)var4_10), (long)-8315439837143845051L, (long)var4_10)) {
                    v1 /* !! */  = var43_23 + var45_26 * var44_24;
                    v2 = (int)_8j_0.f("m", (Object)this, (long)-8320525361251530019L, (long)var4_10);
                    do {
                        block28: {
                            block29: {
                                block32: {
                                    block44: {
                                        block45: {
                                            block42: {
                                                block46: {
                                                    block41: {
                                                        block39: {
                                                            block40: {
                                                                block38: {
                                                                    block37: {
                                                                        block36: {
                                                                            block35: {
                                                                                block33: {
                                                                                    block34: {
                                                                                        var46_31 /* !! */  = v1 /* !! */  - v2;
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        v3 = var42_25;
                                                                                                        if (var4_10 < 0L) break block28;
                                                                                                        if (v3 != 0) break block29;
                                                                                                        v4 /* !! */  = var46_31 /* !! */ ;
                                                                                                        if (var4_10 < 0L) break block30;
                                                                                                        v5 = _8j_0.f("m", (Object)this, (long)-8314830877649720336L, (long)var4_10) + _8j_0.d("v", (int)8290, (long)(7876205549451708433L ^ var4_10));
                                                                                                        if (var42_25 != 0) break block31;
                                                                                                    }
                                                                                                    catch (MatchException v6) {
                                                                                                        throw _8j_0.a(v6);
                                                                                                    }
                                                                                                    if (v4 /* !! */  < v5) break block32;
                                                                                                }
                                                                                                catch (MatchException v7) {
                                                                                                    throw _8j_0.a(v7);
                                                                                                }
                                                                                                v8 /* !! */  = var46_31 /* !! */ ;
                                                                                                v9 = new Object[1];
                                                                                                v9[0] = var12_11;
                                                                                                v10 /* !! */  = _8j_0.f("m", (Object)this, (long)-8314830877649720336L, (long)var4_10) + _8j_0.f("d", (Object)this, (Object)v9, (long)-8322053597463166636L, (long)var4_10) - _8j_0.d("v", (int)12646, (long)(5939704599865268497L ^ var4_10));
                                                                                                if (var42_25 != 0) break block33;
                                                                                            }
                                                                                            catch (MatchException v11) {
                                                                                                throw _8j_0.a(v11);
                                                                                            }
                                                                                            if (v8 /* !! */  <= v10 /* !! */ ) break block34;
                                                                                        }
                                                                                        catch (MatchException v12) {
                                                                                            throw _8j_0.a(v12);
                                                                                        }
                                                                                        if (var4_10 >= 0L) break block32;
                                                                                    }
                                                                                    try {
                                                                                        v8 /* !! */  = var45_26;
                                                                                        v10 /* !! */  = (reference)var42_25;
                                                                                        if (var4_10 <= 0L) break block33;
                                                                                        if (v10 /* !! */  != false) break block35;
                                                                                        v10 /* !! */  = _8j_0.f("m", (Object)this, (long)-8315801248058234006L, (long)var4_10);
                                                                                    }
                                                                                    catch (MatchException v13) {
                                                                                        throw _8j_0.a(v13);
                                                                                    }
                                                                                }
                                                                                v8 /* !! */  = v8 /* !! */  == v10 /* !! */  ? 1 : 0;
                                                                            }
                                                                            var47_32 = v8 /* !! */ ;
                                                                            try {
                                                                                v14 = new Object[1];
                                                                                v14[0] = var14_12;
                                                                                v15 /* !! */  = _8j_0.f("d", (Object)_8j_0.f("m", (Object)this, (long)-8315745412882675682L, (long)var4_10), (Object)v14, (long)-8320586061141673319L, (long)var4_10);
                                                                                v16 = var42_25;
                                                                                if (var4_10 >= 0L) {
                                                                                    if (v16 != 0) break block36;
                                                                                    if (v15 /* !! */  == false) break block37;
                                                                                }
                                                                                ** GOTO lbl98
                                                                            }
                                                                            catch (MatchException v17) {
                                                                                throw _8j_0.a(v17);
                                                                            }
                                                                            v15 /* !! */  = (CallSite)var47_32;
                                                                        }
                                                                        try {
                                                                            v16 = var42_25;
lbl98:
                                                                            // 2 sources

                                                                            if (v16 != 0) break block38;
                                                                            if (v15 /* !! */  == false) break block37;
                                                                        }
                                                                        catch (MatchException v18) {
                                                                            throw _8j_0.a(v18);
                                                                        }
                                                                        v15 /* !! */  = (CallSite)true;
                                                                        break block38;
                                                                    }
                                                                    v15 /* !! */  = (CallSite)false;
                                                                }
                                                                var48_33 = v15 /* !! */ ;
                                                                try {
                                                                    v19 /* !! */  = var47_32;
                                                                    v20 = var42_25;
                                                                    if (var4_10 <= 0L) break block39;
                                                                    if (v20 != 0) break block40;
                                                                    if (v19 /* !! */  == 0) break block41;
                                                                }
                                                                catch (MatchException v21) {
                                                                    throw _8j_0.a(v21);
                                                                }
                                                                v19 /* !! */  = (int)_8j_0.d("v", (int)8290, (long)(7876205549451708433L ^ var4_10));
                                                            }
                                                            v20 = 1;
                                                        }
                                                        v22 = new Object[3];
                                                        v22[2] = v20;
                                                        v22[1] = v19 /* !! */ ;
                                                        v22[0] = var22_16;
                                                        v23 = _8j_0.f("\u00ea", (Object)v22, (long)-8314866585412761336L, (long)var4_10);
                                                        break block46;
                                                    }
                                                    v23 = new _8B((int)_8j_0.d("v", (int)22845, (long)(6900932205715943804L ^ var4_10)), (int)_8j_0.d("v", (int)22845, (long)(6900932205715943804L ^ var4_10)), var28_19, (int)_8j_0.d("v", (int)15183, (long)(4329648499591680804L ^ var4_10)), (int)_8j_0.d("v", (int)24894, (long)(7778854339360475479L ^ var4_10)));
                                                }
                                                var49_34 = v23;
                                                try {
                                                    block43: {
                                                        try {
                                                            try {
                                                                v24 = var3_2;
                                                                v25 /* !! */  = var49_34;
                                                                v26 /* !! */  = var42_25;
                                                                if (var4_10 >= 0L) {
                                                                    if (v26 /* !! */  != 0) break block42;
                                                                    v26 /* !! */  = (int)(_8j_0.f("m", (Object)this, (long)-8315863547466792666L, (long)var4_10) + _8j_0.d("v", (int)30395, (long)(3023150063286542026L ^ var4_10)));
                                                                }
                                                                v27 = new Object[1];
                                                                v27[0] = var16_13;
                                                                v28 = new Object[10];
                                                                v28[9] = 4.0;
                                                                v28[8] = 4.0;
                                                                v28[7] = 4.0;
                                                                v28[6] = 4.0;
                                                                v28[5] = var30_20;
                                                                v28[4] = (double)(var46_31 /* !! */  + var44_24 - 5);
                                                                v28[3] = (double)(_8j_0.f("m", (Object)this, (long)-8315863547466792666L, (long)var4_10) + _8j_0.f("d", (Object)this, (Object)v27, (long)-8321983359522213198L, (long)var4_10) - _8j_0.d("v", (int)19939, (long)(9149404997537555842L ^ var4_10)));
                                                                v28[2] = (double)var46_31 /* !! */ ;
                                                                v28[1] = (double)v26 /* !! */ ;
                                                                v25 /* !! */  = v28[0] = v28;
                                                                if (var4_10 <= 0L) break block42;
                                                                _8j_0.f("d", (Object)v24, (Object)v25 /* !! */ , (long)-8320728621171015315L, (long)var4_10);
                                                                if (var48_33 == false) break block43;
                                                            }
                                                            catch (MatchException v29) {
                                                                throw _8j_0.a(v29);
                                                            }
                                                            v30 = new Object[4];
                                                            v30[3] = (double)(var46_31 /* !! */  + 5);
                                                            v30[2] = (double)(_8j_0.f("m", (Object)this, (long)-8315863547466792666L, (long)var4_10) + _8j_0.d("v", (int)29673, (long)(3081210312949324691L ^ var4_10)));
                                                            v30[1] = var3_2;
                                                            v30[0] = var18_14;
                                                            _8j_0.f("d", (Object)_8j_0.f("m", (Object)this, (long)-8315745412882675682L, (long)var4_10), (Object)v30, (long)-8321102872827258033L, (long)var4_10);
                                                            v31 /* !! */  = (reference)var42_25;
                                                            if (var4_10 < 0L) break block44;
                                                            if (v31 /* !! */  == false) break block45;
                                                        }
                                                        catch (MatchException v32) {
                                                            throw _8j_0.a(v32);
                                                        }
                                                    }
                                                    v24 = var3_2;
                                                    v25 /* !! */  = _8j_0.f("d", (Object)_8j_0.f("m", (Object)this, (long)-8321234076342523194L, (long)var4_10), (int)var45_26, (long)-8315100842242323065L, (long)var4_10);
                                                }
                                                catch (MatchException v33) {
                                                    throw _8j_0.a(v33);
                                                }
                                            }
                                            var36_27 = new _8B((int)_8j_0.d("v", (int)13611, (long)(1222164734246395241L ^ var4_10)), var32_21, (int)_8j_0.d("v", (int)15505, (long)(3472060624652211429L ^ var4_10)), (int)_8j_0.d("v", (int)15505, (long)(3472060624652211429L ^ var4_10)));
                                            var37_28 = var46_31 /* !! */  + 5;
                                            var39_29 = (double)(_8j_0.f("m", (Object)this, (long)-8315863547466792666L, (long)var4_10) + _8j_0.d("v", (int)17286, (long)(5693489875407727611L ^ var4_10)));
                                            var41_30 = (String)v25 /* !! */ ;
                                            v34 = new Object[5];
                                            v34[4] = var36_27;
                                            v34[3] = var37_28;
                                            v34[2] = var39_29;
                                            v34[1] = var41_30;
                                            v34[0] = var26_18;
                                            _8j_0.f("d", (Object)v24, (Object)v34, (long)-8321276953267153044L, (long)var4_10);
                                        }
                                        v35 = new Object[1];
                                        v35[0] = var16_13;
                                        v31 /* !! */  = _8j_0.f("m", (Object)this, (long)-8315863547466792666L, (long)var4_10) + _8j_0.f("d", (Object)this, (Object)v35, (long)-8321983359522213198L, (long)var4_10) - _8j_0.d("v", (int)31476, (long)(9107913081243259536L ^ var4_10));
                                    }
                                    var50_36 = v31 /* !! */ ;
                                    var51_37 = _8j_0.d("v", (int)22845, (long)(6900932205715943804L ^ var4_10));
                                    v36 = new Object[8];
                                    v36[7] = 3;
                                    v36[6] = (int)var51_37;
                                    v36[5] = (int)var51_37;
                                    v36[4] = var20_15;
                                    v36[3] = var46_31 /* !! */ ;
                                    v36[2] = (int)var50_36;
                                    v36[1] = _8j_0.f("\u00d3", (long)-8315285238946743325L, (long)var4_10);
                                    v36[0] = var3_2;
                                    _8j_0.f("d", (Object)this, (Object)v36, (long)-8314457556173459662L, (long)var4_10);
                                    v37 = new Object[2];
                                    v37[1] = var24_17;
                                    v37[0] = "X";
                                    var52_38 = _8j_0.f("d", (Object)var3_2, (Object)v37, (long)-8321670422043592978L, (long)var4_10);
                                    v38 = new Object[5];
                                    v38[4] = new _8B((int)_8j_0.d("v", (int)21291, (long)(2356080825102367572L ^ var4_10)), var32_21, (int)_8j_0.d("v", (int)24078, (long)(8942866322532922997L ^ var4_10)), (int)_8j_0.d("v", (int)28589, (long)(5633955050728966081L ^ var4_10)));
                                    v38[3] = (double)var46_31 /* !! */  + (double)(var51_37 - _8j_0.d("v", (int)17088, (long)(3781186949875329721L ^ var4_10))) / 2.0;
                                    v38[2] = (double)var50_36 + ((double)var51_37 - var52_38) / 2.0 + 1.0;
                                    v38[1] = "X";
                                    v38[0] = var26_18;
                                    _8j_0.f("d", (Object)var3_2, (Object)v38, (long)-8321276953267153044L, (long)var4_10);
                                }
                                ++var45_26;
                            }
                            v3 = var42_25;
                        }
                        if (v3 == 0) continue block22;
                        v39 = new Object[1];
                        v39[0] = var12_11;
                        v1 /* !! */  = (int)(_8j_0.f("m", (Object)this, (long)-8314830877649720336L, (long)var4_10) + _8j_0.f("d", (Object)this, (Object)v39, (long)-8322053597463166636L, (long)var4_10));
                        v2 = 31476;
                    } while (var4_10 < 0L);
                }
                v5 = _8j_0.d("v", (int)v2, (long)(9107913081243259536L ^ var4_10));
            }
            var45_26 = v1 /* !! */  - v5;
            var46_31 /* !! */  = (int)_8j_0.d("v", (int)12646, (long)(5939704599865268497L ^ var4_10));
            v4 /* !! */  = (int)_8j_0.d("v", (int)22845, (long)(6900932205715943804L ^ var4_10));
        }
        var47_32 = v4 /* !! */ ;
        v40 = new Object[3];
        v40[2] = 1;
        v40[1] = (int)_8j_0.d("v", (int)18982, (long)(7288817831978394209L ^ var4_10));
        v40[0] = var22_16;
        v41 = new Object[8];
        v41[7] = var47_32;
        v41[6] = var46_31 /* !! */ ;
        v41[5] = var45_26;
        v41[4] = (int)(_8j_0.f("m", (Object)this, (long)-8315863547466792666L, (long)var4_10) + _8j_0.d("v", (int)30395, (long)(3023150063286542026L ^ var4_10)));
        v41[3] = _8j_0.f("\u00ea", (Object)v40, (long)-8314866585412761336L, (long)var4_10);
        v41[2] = _8j_0.b("r", (int)2663, (long)(6529818236941981710L ^ var4_10));
        v41[1] = var3_2;
        v41[0] = var34_22;
        _8j_0.f("d", (Object)this, (Object)v41, (long)-8315521155199990336L, (long)var4_10);
        v42 = new Object[1];
        v42[0] = var12_11;
        var48_33 = _8j_0.f("m", (Object)this, (long)-8314830877649720336L, (long)var4_10) + _8j_0.f("d", (Object)this, (Object)v42, (long)-8322053597463166636L, (long)var4_10) - _8j_0.d("v", (int)31476, (long)(9107913081243259536L ^ var4_10));
        var49_35 = _8j_0.d("v", (int)26530, (long)(2836960536789176266L ^ var4_10));
        var50_36 = _8j_0.d("v", (int)22845, (long)(6900932205715943804L ^ var4_10));
        v43 = new Object[1];
        v43[0] = var16_13;
        var51_37 = _8j_0.f("m", (Object)this, (long)-8315863547466792666L, (long)var4_10) + _8j_0.f("d", (Object)this, (Object)v43, (long)-8321983359522213198L, (long)var4_10) - var49_35 - _8j_0.d("v", (int)30395, (long)(3023150063286542026L ^ var4_10));
        var52_39 = var51_37 - var49_35 - _8j_0.d("v", (int)22771, (long)(1529195651943723190L ^ var4_10));
        v44 = new Object[3];
        v44[2] = 1;
        v44[1] = (int)_8j_0.d("v", (int)25180, (long)(5511487404721883699L ^ var4_10));
        v44[0] = var22_16;
        v45 = new Object[8];
        v45[7] = (int)var50_36;
        v45[6] = (int)var49_35;
        v45[5] = (int)var48_33;
        v45[4] = (int)var51_37;
        v45[3] = _8j_0.f("\u00ea", (Object)v44, (long)-8314866585412761336L, (long)var4_10);
        v45[2] = _8j_0.b("r", (int)27825, (long)(3291598476530892510L ^ var4_10));
        v45[1] = var3_2;
        v45[0] = var34_22;
        _8j_0.f("d", (Object)this, (Object)v45, (long)-8315521155199990336L, (long)var4_10);
        v46 = new Object[8];
        v46[7] = (int)var50_36;
        v46[6] = (int)var49_35;
        v46[5] = (int)var48_33;
        v46[4] = (int)var52_39;
        v46[3] = _8j_0.f("\u00d3", (long)-8314252189039644439L, (long)var4_10);
        v46[2] = _8j_0.b("r", (int)18048, (long)(8391168302479643886L ^ var4_10));
        v46[1] = var3_2;
        v46[0] = var34_22;
        _8j_0.f("d", (Object)this, (Object)v46, (long)-8315521155199990336L, (long)var4_10);
    }

    public boolean method_25402(class_11909 class_119092, boolean bl) {
        Object object;
        block102: {
            block103: {
                boolean bl2;
                long l2;
                long l3;
                long l4;
                block84: {
                    reference v21;
                    CallSite callSite;
                    CallSite callSite2;
                    CallSite callSite3;
                    CallSite callSite4;
                    long l5;
                    long l6;
                    long l7;
                    long l8;
                    block80: {
                        CallSite callSite5;
                        CallSite callSite6;
                        block82: {
                            block81: {
                                CallSite callSite7;
                                block78: {
                                    block79: {
                                        block74: {
                                            reference var34_23;
                                            CallSite callSite8;
                                            CallSite callSite9;
                                            reference var30_18;
                                            block75: {
                                                Object object2;
                                                block76: {
                                                    long l9;
                                                    block77: {
                                                        long l10 = l4 = b ^ 0x6FF77795D817L;
                                                        l3 = l10 ^ 0x77799FFCFA7DL;
                                                        long l11 = l10 ^ 0x4B2E074529D9L;
                                                        long l12 = l10 ^ 0x3D0255974830L;
                                                        l8 = l10 ^ 0x90EDDD1499FL;
                                                        l7 = l10 ^ 0x2C4F65B3C5EFL;
                                                        l2 = l10 ^ 0x3B7887000084L;
                                                        l6 = l10 ^ 0x1628DC293705L;
                                                        l9 = l10 ^ 0x23FDBC73748AL;
                                                        l5 = l10 ^ 0x127AA2E73EE9L;
                                                        long l13 = l10 ^ 0x3F1461267A5BL;
                                                        Object[] objectArray = new Object[2];
                                                        objectArray[1] = l13;
                                                        objectArray[0] = (double)_8j_0.f("d", (Object)class_119092, -3030361704276639484L, (long)l4);
                                                        callSite4 = _8j_0.f("d", (Object)this, (Object)objectArray, -3029622457497513493L, (long)l4);
                                                        Object[] objectArray2 = new Object[2];
                                                        objectArray2[1] = l13;
                                                        objectArray2[0] = (double)_8j_0.f("d", (Object)class_119092, -3030809961379740426L, (long)l4);
                                                        callSite3 = _8j_0.f("d", (Object)this, (Object)objectArray2, -3029622457497513493L, (long)l4);
                                                        Object[] objectArray3 = new Object[1];
                                                        objectArray3[0] = l11;
                                                        callSite2 = _8j_0.f("d", (Object)this, (Object)objectArray3, -3030615096646882367L, (long)l4);
                                                        Object[] objectArray4 = new Object[1];
                                                        objectArray4[0] = l12;
                                                        callSite = _8j_0.f("d", (Object)this, (Object)objectArray4, -3030544583828695001L, (long)l4);
                                                        var30_18 = _8j_0.f("m", (Object)this, -3032964585253014909L, (long)l4) + callSite - _8j_0.d("v", 2274, (long)(0x5A4FB2EC83AB79E3L ^ l4));
                                                        callSite9 = _8j_0.d("v", 21499, (long)(0x29E01F8B60B1A2EEL ^ l4));
                                                        bl2 = _02.cfr_renamed_3();
                                                        callSite8 = _8j_0.d("v", 11817, (long)(0x8161421609BDF24L ^ l4));
                                                        reference var33_22 = _8j_0.f("m", (Object)this, -3032213718512101291L, (long)l4) + callSite2 - callSite9 - _8j_0.d("v", 13022, (long)(0x5A2AFF5AB9A143C3L ^ l4));
                                                        var34_23 = var33_22 - callSite9 - _8j_0.d("v", 23846, (long)(0xBACB506E2722C20L ^ l4));
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                Object[] objectArray5 = new Object[7];
                                                                                objectArray5[6] = (int)callSite8;
                                                                                objectArray5[5] = (int)callSite9;
                                                                                objectArray5[4] = (int)var30_18;
                                                                                objectArray5[3] = (int)var33_22;
                                                                                objectArray5[2] = (double)callSite3;
                                                                                objectArray5[1] = (double)callSite4;
                                                                                objectArray5[0] = l6;
                                                                                callSite7 = _8j_0.f("d", (Object)this, (Object)objectArray5, -3032654040685130295L, (long)l4);
                                                                                if (!bl2) break block74;
                                                                                if (callSite7 == false) break block75;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw _8j_0.a(matchException);
                                                                            }
                                                                            Object[] objectArray6 = new Object[1];
                                                                            objectArray6[0] = l8;
                                                                            object2 = _8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -3032050637361573523L, (long)l4), (Object)objectArray6, -3029760819571252246L, (long)l4);
                                                                            if (!bl2) break block76;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw _8j_0.a(matchException);
                                                                        }
                                                                        if (object2 == false) break block77;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw _8j_0.a(matchException);
                                                                    }
                                                                    object2 = _8j_0.f("m", (Object)this, -3032293316366994919L, (long)l4);
                                                                    if (!bl2) break block76;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw _8j_0.a(matchException);
                                                                }
                                                                if (object2 < 0) break block77;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _8j_0.a(matchException);
                                                            }
                                                            Object[] objectArray7 = new Object[1];
                                                            objectArray7[0] = l3;
                                                            _8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -3029094973810134091L, (long)l4), (int)_8j_0.f("m", (Object)this, -3032293316366994919L, (long)l4), (Object)_8j_0.f("d", (Object)_8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -3032050637361573523L, (long)l4), (Object)objectArray7, -3029027913274732746L, (long)l4), -3030708487175744355L, (long)l4), -3029685147853890956L, (long)l4);
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _8j_0.a(matchException);
                                                        }
                                                    }
                                                    Object[] objectArray = new Object[2];
                                                    objectArray[1] = l9;
                                                    objectArray[0] = _8j_0.f("m", (Object)this, -3029094973810134091L, (long)l4);
                                                    _8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -3028875004092768344L, (long)l4), (Object)objectArray, -3031477291585016881L, (long)l4);
                                                    _8j_0.f("d", (Object)_8j_0.f("\u00d3", -3030432604105776892L, (long)l4), (Object)_8j_0.f("m", (Object)_8j_0.f("\u00d3", -3028941535297870013L, (long)l4), -3030978192511509390L, (long)l4), -3029394005423324318L, (long)l4);
                                                    object2 = true;
                                                }
                                                return (boolean)object2;
                                            }
                                            Object[] objectArray = new Object[7];
                                            objectArray[6] = (int)callSite8;
                                            objectArray[5] = (int)callSite9;
                                            objectArray[4] = (int)var30_18;
                                            objectArray[3] = (int)var34_23;
                                            objectArray[2] = (double)callSite3;
                                            objectArray[1] = (double)callSite4;
                                            objectArray[0] = l6;
                                            callSite7 = _8j_0.f("d", (Object)this, (Object)objectArray, -3032654040685130295L, (long)l4);
                                        }
                                        try {
                                            try {
                                                if (!bl2) break block78;
                                                if (callSite7 == false) break block79;
                                            }
                                            catch (MatchException matchException) {
                                                throw _8j_0.a(matchException);
                                            }
                                            _8j_0.f("d", (Object)_8j_0.f("\u00d3", -3030432604105776892L, (long)l4), (Object)_8j_0.f("m", (Object)_8j_0.f("\u00d3", -3028941535297870013L, (long)l4), -3030978192511509390L, (long)l4), -3029394005423324318L, (long)l4);
                                            return true;
                                        }
                                        catch (MatchException matchException) {
                                            throw _8j_0.a(matchException);
                                        }
                                    }
                                    callSite7 = _8j_0.f("m", (Object)this, -3032964585253014909L, (long)l4) + callSite - _8j_0.d("v", 31476, (long)(0x7E65B92881390BE3L ^ l4));
                                }
                                CallSite callSite10 = callSite7;
                                try {
                                    try {
                                        try {
                                            Object[] objectArray = new Object[7];
                                            objectArray[6] = (int)_8j_0.d("v", 22845, (long)(0x5FC57EDEC95A280FL ^ l4));
                                            objectArray[5] = (int)_8j_0.d("v", 23351, (long)(0x30CC7D47DE00AA27L ^ l4));
                                            objectArray[4] = (int)callSite10;
                                            objectArray[3] = (int)(_8j_0.f("m", (Object)this, -3032213718512101291L, (long)l4) + _8j_0.d("v", 30395, (long)(0x29F4156E957E87B9L ^ l4)));
                                            objectArray[2] = (double)callSite3;
                                            objectArray[1] = (double)callSite4;
                                            objectArray[0] = l6;
                                            v21 = _8j_0.f("d", (Object)this, (Object)objectArray, -3032654040685130295L, (long)l4);
                                            if (!bl2) break block80;
                                            if (v21 == false) break block81;
                                        }
                                        catch (MatchException matchException) {
                                            throw _8j_0.a(matchException);
                                        }
                                        CallSite callSite5 = _8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -3029094973810134091L, (long)l4), -3032356174970032586L, (long)l4);
                                        callSite5 = _8j_0.d("v", 13405, (long)(0x63E91ED5F996C568L ^ l4));
                                        if (!bl2) break block82;
                                    }
                                    catch (MatchException matchException) {
                                        throw _8j_0.a(matchException);
                                    }
                                    if (callSite6 >= callSite5) break block81;
                                }
                                catch (MatchException matchException) {
                                    throw _8j_0.a(matchException);
                                }
                                _8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -3029094973810134091L, (long)l4), (Object)_8j_0.b("r", 9044, (long)(0x38376C74FC8D284FL ^ l4)), -3032838255836043563L, (long)l4);
                                _8j_0.f("g", (Object)this, (int)(_8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -3029094973810134091L, (long)l4), -3032356174970032586L, (long)l4) - true), -3032293316366994919L, (long)l4);
                                Object[] objectArray = new Object[2];
                                objectArray[1] = _8j_0.b("r", 16287, (long)(0x70A4F02E4AAD3480L ^ l4));
                                objectArray[0] = l7;
                                _8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -3032050637361573523L, (long)l4), (Object)objectArray, -3029449777332179082L, (long)l4);
                                Object[] objectArray8 = new Object[1];
                                objectArray8[0] = l5;
                                _8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -3032050637361573523L, (long)l4), (Object)objectArray8, -3032505618525195480L, (long)l4);
                                Object[] objectArray9 = new Object[2];
                                objectArray9[1] = l2;
                                objectArray9[0] = true;
                                _8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -3032050637361573523L, (long)l4), (Object)objectArray9, -3028685706248866477L, (long)l4);
                                CallSite callSite11 = _8j_0.f("\u00ea", 0, (int)(_8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -3029094973810134091L, (long)l4), -3032356174970032586L, (long)l4) * _8j_0.d("v", 19039, (long)(0x173A2DFA4460BB49L ^ l4)) - _8j_0.d("v", 22930, (long)(0x53F2B364F80928A1L ^ l4))), -3031043292509287889L, (long)l4);
                                _8j_0.f("g", (Object)this, (float)((float)callSite11), -3029521921388375122L, (long)l4);
                                return true;
                            }
                            CallSite callSite5 = _8j_0.f("m", (Object)this, -3032964585253014909L, (long)l4);
                            callSite5 = _8j_0.d("v", 19462, (long)(0x41F1513C49463D15L ^ l4));
                        }
                        v21 = callSite6 + callSite5;
                    }
                    reference var36_26 = v21;
                    CallSite callSite12 = _8j_0.d("v", 15183, (long)(0x3C1677C779ED4A57L ^ l4));
                    int n = 0;
                    while (n < _8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -3029094973810134091L, (long)l4), -3032356174970032586L, (long)l4)) {
                        block83: {
                            block85: {
                                Object object3;
                                block97: {
                                    block98: {
                                        CallSite callSite8;
                                        block99: {
                                            _8j_0 j_0;
                                            block101: {
                                                block100: {
                                                    CallSite callSite9;
                                                    block95: {
                                                        block94: {
                                                            block88: {
                                                                reference var39_29;
                                                                block89: {
                                                                    Object object4;
                                                                    block93: {
                                                                        block92: {
                                                                            int n2;
                                                                            block90: {
                                                                                CallSite callSite10;
                                                                                reference v33;
                                                                                block86: {
                                                                                    block87: {
                                                                                        var39_29 = var36_26 + n * callSite12 - (int)_8j_0.f("m", (Object)this, -3029521921388375122L, (long)l4);
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        if (!bl2) break block83;
                                                                                                        object = var39_29;
                                                                                                        if (!bl2) break block84;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw _8j_0.a(matchException);
                                                                                                    }
                                                                                                    if (object < _8j_0.f("m", (Object)this, -3032964585253014909L, (long)l4) + _8j_0.d("v", 8290, (long)(0x6D4D90AE2C9DD162L ^ l4))) break block85;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw _8j_0.a(matchException);
                                                                                                }
                                                                                                v33 = var39_29;
                                                                                                callSite10 = _8j_0.f("m", (Object)this, -3032964585253014909L, (long)l4) + callSite - _8j_0.d("v", 12646, (long)(0x526E664494234062L ^ l4));
                                                                                                if (!bl2) break block86;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw _8j_0.a(matchException);
                                                                                            }
                                                                                            if (v33 <= callSite10) break block87;
                                                                                            break block85;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw _8j_0.a(matchException);
                                                                                        }
                                                                                    }
                                                                                    v33 = _8j_0.f("m", (Object)this, -3032213718512101291L, (long)l4) + callSite2;
                                                                                    callSite10 = _8j_0.d("v", 31476, (long)(0x7E65B92881390BE3L ^ l4));
                                                                                }
                                                                                reference var40_30 = v33 - callSite10;
                                                                                reference var41_31 = var39_29 + 5;
                                                                                CallSite callSite16 = _8j_0.d("v", 30395, (long)(0x29F4156E957E87B9L ^ l4));
                                                                                try {
                                                                                    try {
                                                                                        block91: {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            Object[] objectArray = new Object[7];
                                                                                                            objectArray[6] = (int)callSite16;
                                                                                                            objectArray[5] = (int)callSite16;
                                                                                                            objectArray[4] = (int)var41_31;
                                                                                                            objectArray[3] = (int)var40_30;
                                                                                                            objectArray[2] = (double)callSite3;
                                                                                                            objectArray[1] = (double)callSite4;
                                                                                                            objectArray[0] = l6;
                                                                                                            callSite9 = _8j_0.f("d", (Object)this, (Object)objectArray, -3032654040685130295L, (long)l4);
                                                                                                            if (!bl2) break block88;
                                                                                                            if (callSite9 == false) break block89;
                                                                                                        }
                                                                                                        catch (MatchException matchException) {
                                                                                                            throw _8j_0.a(matchException);
                                                                                                        }
                                                                                                        _8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -3029094973810134091L, (long)l4), (int)n, -3033104665513934136L, (long)l4);
                                                                                                        object4 = _8j_0.f("m", (Object)this, -3032293316366994919L, (long)l4);
                                                                                                        n2 = n;
                                                                                                        if (!bl2) break block90;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw _8j_0.a(matchException);
                                                                                                    }
                                                                                                    if (object4 != n2) break block91;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw _8j_0.a(matchException);
                                                                                                }
                                                                                                _8j_0.f("g", (Object)this, (int)_8j_0.d("v", 23855, (long)(0x1B17D11B1E7C2C3BL ^ l4)), -3032293316366994919L, (long)l4);
                                                                                                Object[] objectArray = new Object[2];
                                                                                                objectArray[1] = l2;
                                                                                                objectArray[0] = false;
                                                                                                _8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -3032050637361573523L, (long)l4), (Object)objectArray, -3028685706248866477L, (long)l4);
                                                                                                if (bl2) break block92;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw _8j_0.a(matchException);
                                                                                            }
                                                                                        }
                                                                                        object4 = _8j_0.f("m", (Object)this, -3032293316366994919L, (long)l4);
                                                                                        if (!bl2) break block93;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw _8j_0.a(matchException);
                                                                                    }
                                                                                    n2 = n;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw _8j_0.a(matchException);
                                                                                }
                                                                            }
                                                                            try {
                                                                                if (object4 > n2) {
                                                                                    _8j_0 j_02 = this;
                                                                                    _8j_0.f("g", (Object)j_02, (int)(_8j_0.f("m", (Object)j_02, -3032293316366994919L, (long)l4) - true), -3032293316366994919L, (long)l4);
                                                                                }
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw _8j_0.a(matchException);
                                                                            }
                                                                        }
                                                                        object4 = true;
                                                                    }
                                                                    return (boolean)object4;
                                                                }
                                                                Object[] objectArray = new Object[7];
                                                                objectArray[6] = (int)(callSite12 - 5);
                                                                objectArray[5] = (int)(callSite2 - _8j_0.d("v", 10479, (long)(0x4A535E19DF4959F6L ^ l4)));
                                                                objectArray[4] = (int)var39_29;
                                                                objectArray[3] = (int)(_8j_0.f("m", (Object)this, -3032213718512101291L, (long)l4) + _8j_0.d("v", 30395, (long)(0x29F4156E957E87B9L ^ l4)));
                                                                objectArray[2] = (double)callSite3;
                                                                objectArray[1] = (double)callSite4;
                                                                objectArray[0] = l6;
                                                                callSite9 = _8j_0.f("d", (Object)this, (Object)objectArray, -3032654040685130295L, (long)l4);
                                                            }
                                                            try {
                                                                try {
                                                                    if (!bl2) break block94;
                                                                    if (callSite9 == false) break block85;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw _8j_0.a(matchException);
                                                                }
                                                                callSite9 = _8j_0.f("m", (Object)this, -3032293316366994919L, (long)l4);
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _8j_0.a(matchException);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                block96: {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (!bl2) break block95;
                                                                                if (callSite9 != n) break block96;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw _8j_0.a(matchException);
                                                                            }
                                                                            Object[] objectArray = new Object[1];
                                                                            objectArray[0] = l8;
                                                                            object3 = _8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -3032050637361573523L, (long)l4), (Object)objectArray, -3029760819571252246L, (long)l4);
                                                                            if (!bl2) break block97;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw _8j_0.a(matchException);
                                                                        }
                                                                        if (object3 != false) break block98;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw _8j_0.a(matchException);
                                                                    }
                                                                }
                                                                callSite8 = _8j_0.f("m", (Object)this, -3032050637361573523L, (long)l4);
                                                                if (!bl2) break block99;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _8j_0.a(matchException);
                                                            }
                                                            Object[] objectArray = new Object[1];
                                                            objectArray[0] = l8;
                                                            callSite9 = _8j_0.f("d", (Object)callSite8, (Object)objectArray, -3029760819571252246L, (long)l4);
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _8j_0.a(matchException);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                if (callSite9 == false) break block100;
                                                                j_0 = this;
                                                                if (!bl2) break block101;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _8j_0.a(matchException);
                                                            }
                                                            if (_8j_0.f("m", (Object)j_0, -3032293316366994919L, (long)l4) < 0) break block100;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _8j_0.a(matchException);
                                                        }
                                                        Object[] objectArray = new Object[1];
                                                        objectArray[0] = l3;
                                                        _8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -3029094973810134091L, (long)l4), (int)_8j_0.f("m", (Object)this, -3032293316366994919L, (long)l4), (Object)_8j_0.f("d", (Object)_8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -3032050637361573523L, (long)l4), (Object)objectArray, -3029027913274732746L, (long)l4), -3030708487175744355L, (long)l4), -3029685147853890956L, (long)l4);
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _8j_0.a(matchException);
                                                    }
                                                }
                                                _8j_0.f("g", (Object)this, (int)n, -3032293316366994919L, (long)l4);
                                                Object[] objectArray = new Object[2];
                                                objectArray[1] = (String)((Object)_8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -3029094973810134091L, (long)l4), (int)n, -3032712213388192524L, (long)l4));
                                                objectArray[0] = l7;
                                                _8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -3032050637361573523L, (long)l4), (Object)objectArray, -3029449777332179082L, (long)l4);
                                                Object[] objectArray10 = new Object[1];
                                                objectArray10[0] = l5;
                                                _8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -3032050637361573523L, (long)l4), (Object)objectArray10, -3032505618525195480L, (long)l4);
                                                j_0 = this;
                                            }
                                            callSite8 = _8j_0.f("m", (Object)j_0, -3032050637361573523L, (long)l4);
                                        }
                                        Object[] objectArray = new Object[2];
                                        objectArray[1] = l2;
                                        objectArray[0] = true;
                                        _8j_0.f("d", (Object)callSite8, (Object)objectArray, -3028685706248866477L, (long)l4);
                                    }
                                    object3 = true;
                                }
                                return (boolean)object3;
                            }
                            ++n;
                        }
                        if (bl2) continue;
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l8;
                    object = _8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -3032050637361573523L, (long)l4), (Object)objectArray, -3029760819571252246L, (long)l4);
                }
                try {
                    try {
                        try {
                            try {
                                if (!bl2) break block102;
                                if (object == false) break block103;
                            }
                            catch (MatchException matchException) {
                                throw _8j_0.a(matchException);
                            }
                            object = _8j_0.f("m", (Object)this, -3032293316366994919L, (long)l4);
                            if (!bl2) break block102;
                        }
                        catch (MatchException matchException) {
                            throw _8j_0.a(matchException);
                        }
                        if (object < 0) break block103;
                    }
                    catch (MatchException matchException) {
                        throw _8j_0.a(matchException);
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l3;
                    _8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -3029094973810134091L, (long)l4), (int)_8j_0.f("m", (Object)this, -3032293316366994919L, (long)l4), (Object)_8j_0.f("d", (Object)_8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -3032050637361573523L, (long)l4), (Object)objectArray, -3029027913274732746L, (long)l4), -3030708487175744355L, (long)l4), -3029685147853890956L, (long)l4);
                    Object[] objectArray11 = new Object[2];
                    objectArray11[1] = l2;
                    objectArray11[0] = false;
                    _8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -3032050637361573523L, (long)l4), (Object)objectArray11, -3028685706248866477L, (long)l4);
                    _8j_0.f("g", (Object)this, (int)_8j_0.d("v", 24044, (long)(0x51624525CE872CF2L ^ l4)), -3032293316366994919L, (long)l4);
                }
                catch (MatchException matchException) {
                    throw _8j_0.a(matchException);
                }
            }
            object = super.method_25402(class_119092, bl);
        }
        return (boolean)object;
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        long l2 = b ^ 0x169096DDFC96L;
        CallSite callSite = _8j_0.d("v", 15183, (long)(0x3C160EA098A56ED6L ^ l2));
        CallSite callSite2 = _8j_0.d("v", 6, (long)(0x7AF1BA1A53BD55B0L ^ l2));
        CallSite callSite3 = _8j_0.f("\u00ea", 0, (int)(_8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -1047360363489126604L, (long)l2), -1050586142954829129L, (long)l2) * callSite - callSite2), -1049642965935362386L, (long)l2);
        _8j_0.f("g", (Object)this, (float)_8j_0.f("\u00ea", 0.0f, (float)_8j_0.f("\u00ea", (float)((float)callSite3), (float)(_8j_0.f("m", (Object)this, -1047789797828249809L, (long)l2) - (float)(d4 * (double)callSite)), -1047288663559961943L, (long)l2), -1048059489804134999L, (long)l2), -1047789797828249809L, (long)l2);
        return true;
    }

    public boolean method_25404(class_11908 class_119082) {
        CallSite callSite;
        block30: {
            long l2;
            long l3;
            block31: {
                Object object;
                block32: {
                    long l4;
                    block33: {
                        boolean bl;
                        long l5;
                        block28: {
                            block29: {
                                block24: {
                                    long l6;
                                    block25: {
                                        Object object2;
                                        block26: {
                                            long l7;
                                            block27: {
                                                long l8 = l3 = b ^ 0x43646BE8BCC2L;
                                                l5 = l8 ^ 0x5BEA83819EA8L;
                                                l6 = l8 ^ 0x259DC1AC2D4AL;
                                                l4 = l8 ^ 0x17EB9B7D6451L;
                                                l2 = l8 ^ 0x2016A4D37EABL;
                                                l7 = l8 ^ 0xF6EA00E105FL;
                                                bl = _02.cfr_renamed_2();
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        callSite = _8j_0.f("d", (Object)class_119082, -5674915371350116050L, (long)l3);
                                                                        if (bl) break block24;
                                                                        if (callSite != _8j_0.d("v", 6536, (long)(0x6006016A24B8C6DL ^ l3))) break block25;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw _8j_0.a(matchException);
                                                                    }
                                                                    Object[] objectArray = new Object[1];
                                                                    objectArray[0] = l6;
                                                                    object2 = _8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -5674866957553470024L, (long)l3), (Object)objectArray, -5683248037549160641L, (long)l3);
                                                                    if (bl) break block26;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw _8j_0.a(matchException);
                                                                }
                                                                if (object2 == false) break block27;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _8j_0.a(matchException);
                                                            }
                                                            object2 = _8j_0.f("m", (Object)this, -5675083257006647604L, (long)l3);
                                                            if (bl) break block26;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _8j_0.a(matchException);
                                                        }
                                                        if (object2 < 0) break block27;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _8j_0.a(matchException);
                                                    }
                                                    Object[] objectArray = new Object[1];
                                                    objectArray[0] = l5;
                                                    _8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -5682607352111605920L, (long)l3), (int)_8j_0.f("m", (Object)this, -5675083257006647604L, (long)l3), (Object)_8j_0.f("d", (Object)_8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -5674866957553470024L, (long)l3), (Object)objectArray, -5682531478299661341L, (long)l3), -5681873520089518008L, (long)l3), -5683179908476879199L, (long)l3);
                                                }
                                                catch (MatchException matchException) {
                                                    throw _8j_0.a(matchException);
                                                }
                                            }
                                            Object[] objectArray = new Object[2];
                                            objectArray[1] = l7;
                                            objectArray[0] = _8j_0.f("m", (Object)this, -5682607352111605920L, (long)l3);
                                            _8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -5682862509405439107L, (long)l3), (Object)objectArray, -5675894638962798822L, (long)l3);
                                            _8j_0.f("d", (Object)_8j_0.f("\u00d3", -5682257361440471599L, (long)l3), (Object)_8j_0.f("m", (Object)_8j_0.f("\u00d3", -5682938910433770602L, (long)l3), -5675975926872524633L, (long)l3), -5683469471382575177L, (long)l3);
                                            object2 = true;
                                        }
                                        return (boolean)object2;
                                    }
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l6;
                                    callSite = _8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -5674866957553470024L, (long)l3), (Object)objectArray, -5683248037549160641L, (long)l3);
                                }
                                try {
                                    try {
                                        if (bl) break block28;
                                        if (callSite != false) break block29;
                                    }
                                    catch (MatchException matchException) {
                                        throw _8j_0.a(matchException);
                                    }
                                    return super.method_25404(class_119082);
                                }
                                catch (MatchException matchException) {
                                    throw _8j_0.a(matchException);
                                }
                            }
                            callSite = _8j_0.f("d", (Object)class_119082, -5674915371350116050L, (long)l3);
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (bl) break block30;
                                        if (callSite != _8j_0.d("v", 8609, (long)(0x2097F6CA4D76B471L ^ l3))) break block31;
                                    }
                                    catch (MatchException matchException) {
                                        throw _8j_0.a(matchException);
                                    }
                                    object = _8j_0.f("m", (Object)this, -5675083257006647604L, (long)l3);
                                    if (bl) break block32;
                                }
                                catch (MatchException matchException) {
                                    throw _8j_0.a(matchException);
                                }
                                if (object < 0) break block33;
                            }
                            catch (MatchException matchException) {
                                throw _8j_0.a(matchException);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l5;
                            _8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -5682607352111605920L, (long)l3), (int)_8j_0.f("m", (Object)this, -5675083257006647604L, (long)l3), (Object)_8j_0.f("d", (Object)_8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -5674866957553470024L, (long)l3), (Object)objectArray, -5682531478299661341L, (long)l3), -5681873520089518008L, (long)l3), -5683179908476879199L, (long)l3);
                        }
                        catch (MatchException matchException) {
                            throw _8j_0.a(matchException);
                        }
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l4;
                    objectArray[0] = false;
                    _8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -5674866957553470024L, (long)l3), (Object)objectArray, -5682734629316537978L, (long)l3);
                    _8j_0.f("g", (Object)this, (int)_8j_0.d("v", 24044, (long)(0x516269B6D2FA4827L ^ l3)), -5675083257006647604L, (long)l3);
                    object = true;
                }
                return (boolean)object;
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = l2;
            objectArray[0] = class_119082;
            callSite = _8j_0.f("d", (Object)_8j_0.f("m", (Object)this, -5674866957553470024L, (long)l3), (Object)objectArray, -5674626256483498072L, (long)l3);
        }
        return (boolean)callSite;
    }

    public boolean method_25400(class_11905 class_119052) {
        CallSite callSite;
        block4: {
            long l2;
            long l3;
            block5: {
                long l4 = l3 = b ^ 0x2A040FF97797L;
                long l5 = l4 ^ 0x4CFDA5BDE61FL;
                l2 = l4 ^ 0x2D04CF0AB9E6L;
                boolean bl = _02.cfr_renamed_3();
                try {
                    try {
                        Object[] objectArray = new Object[1];
                        objectArray[0] = l5;
                        callSite = _8j_0.f("d", (Object)_8j_0.f("m", (Object)this, 8821350943116082925L, (long)l3), (Object)objectArray, 8823789055388126314L, (long)l3);
                        if (!bl) break block4;
                        if (callSite != false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _8j_0.a(matchException);
                    }
                    return super.method_25400(class_119052);
                }
                catch (MatchException matchException) {
                    throw _8j_0.a(matchException);
                }
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = class_119052;
            objectArray[0] = l2;
            callSite = _8j_0.f("d", (Object)_8j_0.f("m", (Object)this, 8821350943116082925L, (long)l3), (Object)objectArray, 8820340992212545136L, (long)l3);
        }
        return (boolean)callSite;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        _8j_0.b = dev.krypton.l.a(6681156790174893464L, 6565327523311357321L, MethodHandles.lookup().lookupClass()).a(84623977393265L);
                        _8j_0.q = new Object[87];
                        _8j_0.r = new String[87];
                        _8j_0.b();
                        _8j_0.h = new HashMap<K, V>(13);
                        var11 = _8j_0.b ^ 95130715706932L;
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
                        var20_3 = new String[6];
                        var18_4 = 0;
                        var17_5 = "a\u00df6\u00c7\u00d8%\u00c4R\u00e9&>s\u00ab<\u00b9\u00d5\u0018\u0091\u00e9\u00c6\u00b5{E\u00e9\u00f0a%\u00a1a\"\u00e7\u00a7:u<9C\u00aaW\u00f6\u00bf\u0010\u0084~B\u00ffd\u0013\u0003\u008dw\u00a5z\u00ab<\u00fa0\u00ab\u0010U%\u00f0@ \u00ea\u00ae\t)a,\u009f\u00e7!\u0093\u00ab";
                        var19_6 = "a\u00df6\u00c7\u00d8%\u00c4R\u00e9&>s\u00ab<\u00b9\u00d5\u0018\u0091\u00e9\u00c6\u00b5{E\u00e9\u00f0a%\u00a1a\"\u00e7\u00a7:u<9C\u00aaW\u00f6\u00bf\u0010\u0084~B\u00ffd\u0013\u0003\u008dw\u00a5z\u00ab<\u00fa0\u00ab\u0010U%\u00f0@ \u00ea\u00ae\t)a,\u009f\u00e7!\u0093\u00ab".length();
                        var16_7 = 16;
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
                            var20_3[var18_4++] = _8j_0.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u000e\u001b\u00e0\u0099@\u00d7/K\u0011N<w\u00e64\u00cf\u00f6\\R<N\u0013MC\u00fb\u00a1\u00a4_\u0098e\u00f4\u0081\u0095 \u0092\u00d5\u00b7\u0081\u00b2~e\u00b2\u00a9x\u00e0._\u008c\u00fe\u008b-\u00b3[%\u0083\u00eb\u0005\u00d32\u00ae\u00ff*n\u0094l\\";
                            var19_6 = "\u000e\u001b\u00e0\u0099@\u00d7/K\u0011N<w\u00e64\u00cf\u00f6\\R<N\u0013MC\u00fb\u00a1\u00a4_\u0098e\u00f4\u0081\u0095 \u0092\u00d5\u00b7\u0081\u00b2~e\u00b2\u00a9x\u00e0._\u008c\u00fe\u008b-\u00b3[%\u0083\u00eb\u0005\u00d32\u00ae\u00ff*n\u0094l\\".length();
                            var16_7 = 32;
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
                            var20_3[var18_4++] = _8j_0.b(var21_9).intern();
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
                _8j_0.f = var20_3;
                _8j_0.g = new String[6];
                _8j_0.n = new HashMap<K, V>(13);
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
                var6_12 = new long[40];
                var3_13 = 0;
                var4_14 = "\f\u0096\u0084\u00eap\u00bc-\u00f4\u00d3\u00b44*\u0012\u00d3\u009d<\u0017\u0012 \u00c2\u00cc<\u0095\u0018\u0015rG\u00dd\u00dbV2\u0096A\u00fa\u00c4\u00c6rS\u00ffI\u00f4ab\u001b\u0081\u00a1\u00d9\u00cd+\u00c0\u00c4\u0002v]\u00a0\u00a3g\u00cbh\u00ab\u008cX\u00df\u00fa99@\u00c8\u00d3TXOr\u00f2}\u0000\u00bb[Qa\u0099+\u00e8\u00f5\u00fd\u00f1H{\u00c0p\u008d\u00ae\u00d7\u00ca9\u000e\u00d3ZY\u00d3\"\r\u0086F\u00f6\u00ca\u00a3]\u0095\u0015g\u001ep\u00ea\u0002\u00a1\u0091U\u00bd\u00b2V\u00dejU#}$\u008f\u00ac\u001a\u0087k\u00e1h\u00be\u00d3$\u00d2\u00fenj\u00a7\u0098\u000f\u00e1\u00d1\u00cf|\u00da]N\u0016*\u0004\u00d0\u00eb\u00c7D\u001b$\u0013\\\u0082\u000e\u00c2~Y\u00ae\u00cc#Oy\u008f\u000b\u00a6\u00b6\u0082\u00bd{\u00d1\u00a4\u00b2Lr\u00f4\u009c\u00f6\u001b\u008beY\u00a8\u00d9\u0015@Wm\u00da\u00ab\\\u00c0\u00ed\u0080_.QJ6\u008d+\u00d4c1vN[&\u0095\u0082H\u00e1\u0095\u0093`\u00c4\u0091\u0015\u00c5;*\u00ba\u0099e\u00e9\u00c8\u00882h74b\u00f3\u00d4\u009e\u0086\u0016^\u0088?e\u008d5\u009b\u0004\u001f\u00a6\u00f2#\u00cb=\u0003>\u0084:@\u00ce\u008d,\u00d9MXk\u00a2\u00a8\u00cf\u00f1\u00f4Y^\u000e\u00a0\u000e\u00fd\u00f9\"\u008cK\u00d4\u00bc\u00c3#L\u00fc\u008f\u00cdB3r3\u00b5\u0006u\b\u0011";
                var5_15 = "\f\u0096\u0084\u00eap\u00bc-\u00f4\u00d3\u00b44*\u0012\u00d3\u009d<\u0017\u0012 \u00c2\u00cc<\u0095\u0018\u0015rG\u00dd\u00dbV2\u0096A\u00fa\u00c4\u00c6rS\u00ffI\u00f4ab\u001b\u0081\u00a1\u00d9\u00cd+\u00c0\u00c4\u0002v]\u00a0\u00a3g\u00cbh\u00ab\u008cX\u00df\u00fa99@\u00c8\u00d3TXOr\u00f2}\u0000\u00bb[Qa\u0099+\u00e8\u00f5\u00fd\u00f1H{\u00c0p\u008d\u00ae\u00d7\u00ca9\u000e\u00d3ZY\u00d3\"\r\u0086F\u00f6\u00ca\u00a3]\u0095\u0015g\u001ep\u00ea\u0002\u00a1\u0091U\u00bd\u00b2V\u00dejU#}$\u008f\u00ac\u001a\u0087k\u00e1h\u00be\u00d3$\u00d2\u00fenj\u00a7\u0098\u000f\u00e1\u00d1\u00cf|\u00da]N\u0016*\u0004\u00d0\u00eb\u00c7D\u001b$\u0013\\\u0082\u000e\u00c2~Y\u00ae\u00cc#Oy\u008f\u000b\u00a6\u00b6\u0082\u00bd{\u00d1\u00a4\u00b2Lr\u00f4\u009c\u00f6\u001b\u008beY\u00a8\u00d9\u0015@Wm\u00da\u00ab\\\u00c0\u00ed\u0080_.QJ6\u008d+\u00d4c1vN[&\u0095\u0082H\u00e1\u0095\u0093`\u00c4\u0091\u0015\u00c5;*\u00ba\u0099e\u00e9\u00c8\u00882h74b\u00f3\u00d4\u009e\u0086\u0016^\u0088?e\u008d5\u009b\u0004\u001f\u00a6\u00f2#\u00cb=\u0003>\u0084:@\u00ce\u008d,\u00d9MXk\u00a2\u00a8\u00cf\u00f1\u00f4Y^\u000e\u00a0\u000e\u00fd\u00f9\"\u008cK\u00d4\u00bc\u00c3#L\u00fc\u008f\u00cdB3r3\u00b5\u0006u\b\u0011".length();
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
                    var4_14 = "\u00ae4\u00ddJ.\u0019Lp\u0013x\u00a7\u00ac{*>\u009e";
                    var5_15 = "\u00ae4\u00ddJ.\u0019Lp\u0013x\u00a7\u00ac{*>\u009e".length();
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
        _8j_0.l = var6_12;
        _8j_0.m = new Integer[40];
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
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x5EFB;
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
                throw new RuntimeException("dev/krypton/8J", exception);
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
            _8j_0.g[n2] = _8j_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _8j_0.b(n, l2);
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
            throw new RuntimeException("dev/krypton/8J" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int d(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x24F1;
        if (m[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = l[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])_8j_0.n.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    _8j_0.n.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/8J", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _8j_0.m[n2] = n3;
        }
        return m[n2];
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _8j_0.d(n, l2);
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
            throw new RuntimeException("dev/krypton/8J" + " : " + string + " : " + methodType.toString(), exception);
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
            case 0 -> 2;
            case 1 -> 39;
            case 2 -> 1;
            case 3 -> 63;
            case 4 -> 32;
            case 5 -> 9;
            case 6 -> 24;
            case 7 -> 49;
            case 8 -> 45;
            case 9 -> 21;
            case 10 -> 34;
            case 11 -> 54;
            case 12 -> 6;
            case 13 -> 27;
            case 14 -> 14;
            case 15 -> 29;
            case 16 -> 10;
            case 17 -> 42;
            case 18 -> 7;
            case 19 -> 18;
            case 20 -> 35;
            case 21 -> 51;
            case 22 -> 40;
            case 23 -> 16;
            case 24 -> 60;
            case 25 -> 30;
            case 26 -> 36;
            case 27 -> 4;
            case 28 -> 47;
            case 29 -> 13;
            case 30 -> 28;
            case 31 -> 22;
            case 32 -> 15;
            case 33 -> 5;
            case 34 -> 56;
            case 35 -> 23;
            case 36 -> 43;
            case 37 -> 61;
            case 38 -> 3;
            case 39 -> 31;
            case 40 -> 25;
            case 41 -> 46;
            case 42 -> 52;
            case 43 -> 48;
            case 44 -> 38;
            case 45 -> 55;
            case 46 -> 11;
            case 47 -> 53;
            case 48 -> 57;
            case 49 -> 58;
            case 50 -> 17;
            case 51 -> 20;
            case 52 -> 12;
            case 53 -> 37;
            case 54 -> 50;
            case 55 -> 0;
            case 56 -> 62;
            case 57 -> 19;
            case 58 -> 41;
            case 59 -> 8;
            case 60 -> 59;
            case 61 -> 33;
            case 62 -> 44;
            default -> 26;
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
        _8j_0.r[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = q;
        q[0] = "9\u0010Ac2($\u0005C\"7to";
        objectArray[1] = "^{\u0005xE\fCn\u00079@P\u0003S";
        objectArray[2] = "\f\u0011\u007f\u0004v\u0000\u0007\u001enK\u0015\r\u0012\u0018";
        objectArray[3] = Integer.TYPE;
        _8j_0.r[3] = "java/lang/Integer";
        objectArray[4] = "Yqr\u0018\u001dLDdpY\u0018\u0010\u000bL";
        objectArray[5] = "_9_!\b]*\u0019T.\u0019\u0012K\u0017_%\u001dH?";
        objectArray[6] = Void.TYPE;
        _8j_0.r[6] = "java/lang/Void";
        objectArray[7] = "1;,X-k/36\u0017Ow(.";
        objectArray[8] = "\u0019\r\bS'=\u0012\u0002\u0019\u001cF3\u0019\t\u001dF";
        objectArray[9] = Boolean.TYPE;
        _8j_0.r[9] = "java/lang/Boolean";
        objectArray[10] = "@d\u000ffKL]q\r'N\u0010\u001cd";
        objectArray[11] = "Zk7uUv/K<zD9NE7q@c:";
        objectArray[12] = "r-`\u0011blo8bPg0.\u0002";
        objectArray[13] = "\u0002-|\u0005@L\u001f8~DE\u0010Q\u001e";
        objectArray[14] = "UH\u001aG0u h\u0011H!:Af\u001aC%`5";
        objectArray[15] = "gC_w\u001a?gCH+\u00160}\bH5\u0016%zy\u0018hG";
        objectArray[16] = "\u0011E\n%\u0011\u0002\u0011E\u001dy\u001d\r\u000b\u000e\u001dg\u001d\u0018\f\u007fJ8K";
        objectArray[17] = "_\u007f\u0011\u0011\u0015(*_\u001a\u001e\u0004gKQ\u0011\u0015\u0000=?";
        objectArray[18] = "\r\u0012\n\u0005\u0006\u0019x2\u0001\n\u0017V\u0019<\n\u0001\u0013\fm";
        objectArray[19] = Float.TYPE;
        _8j_0.r[19] = "java/lang/Float";
        objectArray[20] = "{04;\fI\u000e\u0010?4\u001d\u0006o\u001e4?\u0019\\\u001b";
        objectArray[21] = "&\u0005\fNG\u007fS%\u0007AV02+\fJRjF";
        objectArray[22] = ",\u0007~.!\u0006Y'u!0I8)~*4\u0013L";
        objectArray[23] = "#A{2\u001dn(Nj}`v;Ic4";
        objectArray[24] = "Jz}?ys?Zv0h<^T};lf*";
        objectArray[25] = "olu\",h\u001aL~-='{Bu&9}\u000f";
        objectArray[26] = "iMADNSiMV\u0018B\\s\u0006V\u0006BItw\u0004[\u001a\n>";
        objectArray[27] = Double.TYPE;
        _8j_0.r[27] = "java/lang/Double";
        objectArray[28] = "\u0004H/\u001cFG\u0019]-]C\u001bX\u001a";
        objectArray[29] = "3\"?\u00079\u0016F\u00024\b(Y'\f?\u0003,\u0003S";
        objectArray[30] = "c1< D\u0011\u0016\u00117/U^w\u001f<$Q\u0004\u0003";
        objectArray[31] = "\u0006T \u0017[t\u001bA\"V^(Zs";
        objectArray[32] = "SFse\u0010\b&fxj\u0001GGhsa\u0005\u001d3";
        objectArray[33] = "k9\n}L\u0017v,\b<IK6\u0015";
        objectArray[34] = "f\u0015psrG\u00135{|c\br;pwgR\u0006";
        objectArray[35] = "\u0003=*\u001c\u000efv\u001d!\u0013\u001f)\u0017\u0013*\u0018\u001bsc";
        objectArray[36] = "@lS}O<5LXr^sTBSyZ) ";
        objectArray[37] = "O\u0005g\t!^:%l\u00060\u0011[+g\r4K/";
        objectArray[38] = "o_#3T\u0019\u001a\u007f(<EV{q#7A\f\u000f";
        objectArray[39] = "\u000b\u0012VL\u0018p~2]C\t?\u001f<VH\rek";
        objectArray[40] = "\u0006k\u0004N#G\u0006k\u0013\u0012/H\u001c \u0013\f/]\u001bQAQw\u001eP";
        objectArray[41] = "@\u0011AD9i51JK(&T?A@,| ";
        objectArray[42] = "\u0004u(\u0019d7Yt0efR\fr/\u00009\"^v1\u0004";
        objectArray[43] = "3JV~KZe\u001eP&&TcT<#\u0016Lj\u001a\u0005!AKt$\u0006)[Q4\u001d\u0004~\\O\n\u001e\fdF\u000f3\u001c[cX1";
        objectArray[44] = "\u0004G\u0018s(k\\KEnI(;QX;p,X\u0015Bh*\u0016\u0007W\u001aixsW\u0016H;I";
        objectArray[45] = "\u001alJh\u0016-\u0010\"\u00198d* e\f2](C!\u0016a\u0007\u0012\u001ccN`UwL\"\u001c2d";
        objectArray[46] = "H.|{{`B`/+\t`r':!0e\u0011c rj_Oc-ms3\u0003b3~\t";
        objectArray[47] = "\u0013\u001dMn%&K\u0011\u0010sDamp\u0012i<\"W\r\u0007}+#";
        objectArray[48] = "(,16\u0005\u0006p l+dC\u0017%u6\u001d\u0000j0a!\u001c";
        objectArray[49] = "\nV9\u00120hFW'\u0001Jm[\u0005UPu8Q\u00146\t2gZik\u0004;eYU%\u00123y7";
        objectArray[50] = "VFL\u0003Hh\u000eJ\u0011\u001e)/iP\fK\u0010/\n\u0014\u0016\u0018J\u0015WA\u0006\u001aG)\u0019W\u000e\u0006)";
        objectArray[51] = "p\u0015.i\u001a\u0013<\u00140z`\u0010 VB/P\u0002-\u0014{-\u0007\u00053*|*\\\u00190I%m\u0003\u0012M";
        objectArray[52] = "\u000f9->scU~p`\u0012>>xo3+5]<u`q\u000f\u0000ieb|3N\u007fm~\u0012";
        objectArray[53] = ")\u0007=<bke\u0006#/\u0018}y]6>u\u0007.\b, &>,_+>\u00189+\u00047={`l[<@";
        objectArray[54] = "ZEi\u001cujB\u000br\u0013\u000e-<\u000fkE7+_Kq\u0016m\u0011X\u000bh\fulM\u001f\u007f\r\u000e";
        objectArray[55] = "LI=\u007fR&\u0014E`b3gs\u001e6zSeJ\u001ca}M";
        objectArray[56] = "m!=U|_5-`H\u001d\u001cRv6P}\u001cktaWc";
        objectArray[57] = "[\u0013?~^\u0002\n\u000fpp;UkQqs[VRS&tE";
        objectArray[58] = "PC`568\u0001_/;Si`\n$|n3\fPc!0";
        objectArray[59] = "{\u001b\tb~t=\n\u0013\"\f\u007fl\u0016\u0019?`M>VCb<\u001a;Z\u000482#9\r\u0003&\f";
        objectArray[60] = "{J@OV[!\r\u001d\u00117\tJ\u000b\u0002B\u000e\r)O\u0018\u0011T7v\r@\u0010\u0006R&L\u0012B7";
        objectArray[61] = "LA\u0017>\u001fO\u0014MJ#~\u0002sWWvG\b\u0010\u0013M%\u001d2OQ\u0015$OW\u001f\u0010Gv~";
        objectArray[62] = "\u001a'm:#IV&s)Y^FjlFc\u0015Zx?\u007faB]f\u0001";
        objectArray[63] = "\u0000;UdR\u0002Z|\b:3V1z\u0017i\nTR>\r:Pn\u000fk\u001d8]RA}\u0015$3";
        objectArray[64] = "\u0014,2\fc^\u0017/(A\u001a\u0001\u0010-9\u0019v3DlaA\u001a\u000eM37F&\r\u0010,8~&\u0019D3h\u001bvX\u0016aY";
        objectArray[65] = "D\u0001H,P3\u001eF\u0015r1eu@\n!\be\u0016\u0004\u0010rR_IFHs\u0000:\u0019\u0007\u001a!1";
        objectArray[66] = "Q;MApz\u0007oK\u0019\u001dt\u0001%'JwzS,^Mxv\u0013UKLv*\u0011,LCzjh9MM&h\u0011>BAf\u0011";
        objectArray[67] = "7\u001dkY_=m\u0016#Agx6r*EW~o\u0011n_\u0004$UN,\u0007\u0005v0\u001emUWG";
        objectArray[68] = "k\u001e:ep\u0010'\u001f$v\n\u0007;]V#:\u00016\u001fo!m\u0006(!h&6\u001a+B1ai\u0011V\u001fi%l\u00015F.zg|";
        objectArray[69] = "\u0011#\u0019R9\u0017KdD\fXB b[_aAC&A\f;{\u001esQ\u000e6GPeY\u0012X";
        objectArray[70] = "l\u000f\u0010b\u001eP=\u0013_l{\u0000\\\u001b\u0004y@C%\u001c\u000bu\u0000";
        objectArray[71] = "V\u0005/3'!\u000e\tr.Fai\u0013o{\u007ff\nWu(%\\SXi+xeQ\u000fn5F";
        objectArray[72] = "X9\u0004`\u000e~\t%Knk-h{\b-\u0001fWqF~Q";
        objectArray[73] = "\u0007.p}pnZ/h\u0001sH6&3{61S{2c";
        objectArray[74] = "_n\u0004(df\u0005)Yv\u00052n/F%<0\rk\\vf\nR)\u0004w4o\u0002hV%\u0005";
        objectArray[75] = "5\r b\u0013\u0014o\u0006hz+RW\u0019a5\u0012T4]{fHn6\u0019j=WR2\u0019dk+";
        objectArray[76] = "F,fRZY\u00170)\\?\u0003vi'NCI\u001a%&PP";
        objectArray[77] = "w\bip&J!\\o(KD/\u0000\u0003{!Ju\u001fz|.F5fo} \u001a7\u001fhr,ZN\ni|pX7\rfp0!";
        objectArray[78] = "l0\\+\u0016M6w\u0001uw\u001a]q\u001e&N\u001b>5\u0004u\u0014!aw\\tFD16\u000e&w";
        objectArray[79] = "L-[E\u001eq\u0016j\u0006\u001b\u007f&}l\u0019HF'\u001e(\u0003\u001b\u001c\u001d\u0012r\u000b\u0003\u0014{@r]@\u007f";
        objectArray[80] = "Wh\n\u00181a\u0006tE\u0016T:gk\u000fXm1\u0004/\u0015\u000b7\u000b] \t\bj2_w\u000e\u0016T";
        objectArray[81] = "(M3\u0001\u0007pyQ|\u000fb$\u0018N6A[ {\n,\u0012\u0001\u001a\"\u00050\u0011\\# R7\u000fb";
        objectArray[82] = "\u000f\u000f$\tKF\u001f\u0001!\u0019sP\t\u0004c!O\u0004_Q\u001b\u0017\bKV\u001d'\u0013\bE\u0000a";
        objectArray[83] = "kfWkd#6gO\u0017g\u001dZ6P|,?`5Sfa";
        objectArray[84] = "\u0014\u001cgP5\u0003\u0004\u0012b@\r\u0015\u0012\u0017 x1ADCXNv\u000eM\u000edJv\u0000\u001br";
        objectArray[85] = "vf\u001c\u0007a',mT\u001fYm\u0014r]P`gw6G\u0003:]urVX%aqrX\u000eY";
        Object[] objectArray2 = objectArray;
        objectArray[86] = "\u001a*\u001bJ\u001c\u001bH*M\tw\u0001\u000f.\u00171\u0018\u0018\u001c4\u0019WJ\u0018Jwr";
    }

    private static Class f(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _8j_0.e(l2, l3);
            object = q[n];
            try {
                if (!(object instanceof String)) break block2;
                _8j_0.q[n] = clazz = Class.forName(r[n]);
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
        Field field = _8j_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _8j_0.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field g(long l2, long l3) {
        int n = _8j_0.e(l2, l3);
        Object object = q[n];
        if (object instanceof String) {
            String string = r[n];
            int n2 = string.indexOf(8);
            Class clazz = _8j_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _8j_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _8j_0.c(clazz3, string2, clazz2)) != null) {
                    _8j_0.q[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _8j_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _8j_0.q[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _8j_0.f(629472880743278L, 0L);
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
        Method method = _8j_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _8j_0.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method h(long l2, long l3) {
        int n = _8j_0.e(l2, l3);
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
                clazz3 = _8j_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _8j_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _8j_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _8j_0.q[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _8j_0.f(629472880743278L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _8j_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _8j_0.q[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _8j_0.f(629472880743278L, 0L);
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
            if (c == 'm' || c == 'g' || c == '\u00d3' || c == '\u00cf') {
                field = _8j_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'm' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'g' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _8j_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'd' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ea' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _8j_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8J" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_8j_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_8j_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_8j_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

