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
import dev.krypton._0z_0;
import dev.krypton._7V;
import dev.krypton._87;
import dev.krypton._8B;
import dev.krypton._8e;
import dev.krypton._8j;
import dev.krypton._9c_0;
import dev.krypton._9i;
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

public class _8G
extends _8e {
    private final _9i cfr_renamed_1;
    private final List cfr_renamed_3;
    private final _7V cfr_renamed_8;
    private float cfr_renamed_9;
    private int cfr_renamed_6;
    private int cfr_renamed_63;
    private static final long b;
    private static final String[] f;
    private static final String[] g;
    private static final Map h;
    private static final long[] l;
    private static final Integer[] m;
    private static final Map n;
    private static final Object[] q;
    private static final String[] r;

    public _8G(_0z_0 z_0, long l2, _9i i2) {
        block6: {
            long l3 = l2 = b ^ l2;
            long l4 = l3 ^ 0x606564FD6722L;
            long l5 = l3 ^ 0x34366D48346CL;
            long l6 = l3 ^ 0xFBF401B43B2L;
            long l7 = l3 ^ 0x6B8197760859L;
            super((String)((Object)_8G.b("y", 15296, (long)(0x69DD1CCF990AF57BL ^ l2))));
            this.cfr_renamed_8 = new _7V(l4);
            _8G.f("\u00f1", (Object)this, 0.0f, -2227057093855787385L, (long)l2);
            _8G.f("\u00f1", (Object)this, (int)_8G.d("d", 24450, (long)(0x2B25D15A9A4E539EL ^ l2)), -2227616031494502882L, (long)l2);
            _8G.f("\u00f1", (Object)this, (int)_8G.d("d", 24450, (long)(0x2B25D15A9A4E539EL ^ l2)), -2225527290043492045L, (long)l2);
            this.cfr_renamed_1 = i2;
            this.cfr_renamed_3 = new ArrayList();
            boolean bl = _02.cfr_renamed_2();
            Object[] objectArray = new Object[1];
            objectArray[0] = l7;
            CallSite callSite = _8G.f("\u00c0", (Object)_8G.f("\u00c0", (Object)i2, (Object)objectArray, -2227756984867819027L, (long)l2), -2228149011233975288L, (long)l2);
            block2: while (_8G.f("\u00c0", (Object)callSite, -2227988788498575363L, (long)l2) != false) {
                _8j j = (_8j)((Object)_8G.f("\u00c0", (Object)callSite, -2232893590764068946L, (long)l2));
                try {
                    _8G.f("\u00c0", (Object)_8G.f("C", (Object)this, -2226124172921439895L, (long)l2), (Object)new _9c_0(l6, (String)((Object)_8G.f("C", (Object)j, -2227296462533065963L, (long)l2)), (int)_8G.f("C", (Object)j, -2233107252511307449L, (long)l2)), -2226931565645266334L, (long)l2);
                    do {
                        boolean bl2 = bl;
                        if (l2 >= 0L) {
                            if (bl2) break block6;
                            bl2 = bl;
                        }
                        if (!bl2) continue block2;
                    } while (l2 <= 0L);
                    break;
                }
                catch (MatchException matchException) {
                    throw _8G.a(matchException);
                }
            }
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l5;
            objectArray2[0] = false;
            _8G.f("\u00c0", (Object)_8G.f("C", (Object)this, -2226534070388848140L, (long)l2), (Object)objectArray2, -2224862853862709888L, (long)l2);
        }
    }

    @Override
    protected int int_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return (int)_8G.d("d", 28779, (long)(0x6A82EC8AD3EE93E5L ^ l2));
    }

    @Override
    protected int int_6(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return (int)_8G.d("d", 8085, (long)(0x52DCAB1BD89A8EACL ^ l2));
    }

    @Override
    protected int int_9(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return (int)_8G.d("d", 10591, (long)(0x95EDBF29527D988L ^ l2));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    protected void cfr_renamed_9(Object[] var1_1) {
        block52: {
            block53: {
                var5_2 = (_87)var1_1[0];
                var8_3 = (Integer)var1_1[1];
                var11_4 = (Integer)var1_1[2];
                var3_5 = (Integer)var1_1[3];
                var9_6 = (Integer)var1_1[4];
                var4_7 = (Integer)var1_1[5];
                var10_8 = (Integer)var1_1[6];
                var2_9 = ((Float)var1_1[7]).floatValue();
                var6_10 = (Long)var1_1[8];
                v0 = var6_10;
                var12_11 = v0 ^ 1145088352237L;
                var14_12 = v0 ^ 52562126852675L;
                var16_13 = v0 ^ 39715544357412L;
                var18_14 = v0 ^ 120852436948926L;
                var20_15 = v0 ^ 84297330515943L;
                var22_16 = v0 ^ 24720861089480L;
                var24_17 = v0 ^ 82655629639322L;
                var26_18 = v0 ^ 139188352258284L;
                var28_19 = v0 ^ 82033205121347L;
                var30_20 = v0 ^ 108731785440199L;
                var32_21 = v0 ^ 66759006580906L;
                var34_22 = v0 ^ 110551407481054L;
                var36_23 = v0 ^ 123174258099033L;
                var38_24 = v0 ^ 92313003645111L;
                v1 = new Object[1];
                v1[0] = var32_21;
                var41_25 = _8G.f("\u00c0", (Object)this, (Object)v1, (long)-8315335070298140583L, (long)var6_10);
                v2 = new Object[1];
                v2[0] = var28_19;
                var42_26 = _8G.f("\u00c0", (Object)this, (Object)v2, (long)-8318808428668492078L, (long)var6_10);
                var43_27 = _8G.f("C", (Object)this, (long)-8320825630731540670L, (long)var6_10);
                var44_28 = _8G.f("C", (Object)this, (long)-8322640266134650487L, (long)var6_10);
                var45_29 = var11_4 + _8G.d("d", (int)15659, (long)(4131821286684220603L ^ var6_10));
                v3 = _02.cfr_renamed_3();
                var46_30 = new _8B((int)_8G.d("d", (int)22983, (long)(1037410847870564446L ^ var6_10)), var36_23, (int)_8G.d("d", (int)9802, (long)(7253770040893425600L ^ var6_10)), (int)_8G.d("d", (int)25845, (long)(7824844703622104443L ^ var6_10)));
                v4 = new Object[5];
                v4[4] = var46_30;
                v4[3] = (double)var45_29;
                v4[2] = (double)(var43_27 + _8G.d("d", (int)14154, (long)(640761297562719951L ^ var6_10)));
                v4[1] = _8G.b("y", (int)21544, (long)(7057710359060281099L ^ var6_10));
                v4[0] = var20_15;
                _8G.f("\u00c0", (Object)var5_2, (Object)v4, (long)-8321195825891303488L, (long)var6_10);
                v5 = new Object[5];
                v5[4] = var46_30;
                v5[3] = (double)var45_29;
                v5[2] = (double)(var43_27 + var41_25 - _8G.d("d", (int)9802, (long)(7253770040893425600L ^ var6_10)));
                v5[1] = _8G.b("y", (int)32551, (long)(4741824465747008512L ^ var6_10));
                v5[0] = var20_15;
                _8G.f("\u00c0", (Object)var5_2, (Object)v5, (long)-8321195825891303488L, (long)var6_10);
                var47_31 = var44_28 + _8G.d("d", (int)12496, (long)(4999375945755545955L ^ var6_10));
                var48_32 = _8G.d("d", (int)26469, (long)(3601277041858774749L ^ var6_10));
                var49_33 = var44_28 + var42_26 - _8G.d("d", (int)16225, (long)(7943751604814012150L ^ var6_10));
                var50_34 = new _8B((int)_8G.d("d", (int)4015, (long)(7975558721477013007L ^ var6_10)), var36_23, (int)_8G.d("d", (int)26498, (long)(1623403681709164091L ^ var6_10)), (int)_8G.d("d", (int)26498, (long)(1623403681709164091L ^ var6_10)));
                var40_35 = v3;
                var51_36 = new _8B((int)_8G.d("d", (int)16972, (long)(5139885453037544385L ^ var6_10)), var36_23, (int)_8G.d("d", (int)16401, (long)(4241920989913162171L ^ var6_10)), (int)_8G.d("d", (int)16401, (long)(4241920989913162171L ^ var6_10)));
                var52_37 = 0;
                block42: while (var52_37 < _8G.f("\u00c0", (Object)_8G.f("C", (Object)this, (long)-8322565195993377550L, (long)var6_10), (long)-8322119270960903463L, (long)var6_10)) {
                    v6 = var47_31 + var52_37 * var48_32;
                    v7 = (int)_8G.f("C", (Object)this, (long)-8319099005096940772L, (long)var6_10);
                    do {
                        block50: {
                            block51: {
                                block54: {
                                    block80: {
                                        block78: {
                                            block79: {
                                                block77: {
                                                    block76: {
                                                        block74: {
                                                            block75: {
                                                                block70: {
                                                                    block71: {
                                                                        block82: {
                                                                            block67: {
                                                                                block68: {
                                                                                    block73: {
                                                                                        block69: {
                                                                                            block66: {
                                                                                                block64: {
                                                                                                    block65: {
                                                                                                        block81: {
                                                                                                            block63: {
                                                                                                                block61: {
                                                                                                                    block62: {
                                                                                                                        block60: {
                                                                                                                            block59: {
                                                                                                                                block58: {
                                                                                                                                    block56: {
                                                                                                                                        block57: {
                                                                                                                                            block55: {
                                                                                                                                                var53_38 = v6 - v7;
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                v8 = var40_35;
                                                                                                                                                                if (var6_10 <= 0L) break block50;
                                                                                                                                                                if (v8 == 0) break block51;
                                                                                                                                                                v9 = var53_38 + var48_32;
                                                                                                                                                                if (var6_10 <= 0L) break block52;
                                                                                                                                                                v10 = var44_28 + _8G.d("d", (int)31429, (long)(8898283519577922372L ^ var6_10));
                                                                                                                                                                if (var40_35 == 0) break block53;
                                                                                                                                                            }
                                                                                                                                                            catch (MatchException v11) {
                                                                                                                                                                throw _8G.a(v11);
                                                                                                                                                            }
                                                                                                                                                            if (v9 < v10) break block54;
                                                                                                                                                        }
                                                                                                                                                        catch (MatchException v12) {
                                                                                                                                                            throw _8G.a(v12);
                                                                                                                                                        }
                                                                                                                                                        if (var53_38 <= var49_33) break block55;
                                                                                                                                                        break block54;
                                                                                                                                                    }
                                                                                                                                                    catch (MatchException v13) {
                                                                                                                                                        throw _8G.a(v13);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                catch (MatchException v14) {
                                                                                                                                                    throw _8G.a(v14);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            var54_39 = (_9c_0)_8G.f("\u00c0", (Object)_8G.f("C", (Object)this, (long)-8322565195993377550L, (long)var6_10), (int)var52_37, (long)-8315744057557190298L, (long)var6_10);
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    v15 = var52_37;
                                                                                                                                                    v16 /* !! */  = var40_35;
                                                                                                                                                    if (var6_10 > 0L) {
                                                                                                                                                        if (v16 /* !! */  == 0) break block56;
                                                                                                                                                        v16 /* !! */  = (int)_8G.f("C", (Object)this, (long)-8318548927442031739L, (long)var6_10);
                                                                                                                                                    }
                                                                                                                                                    if (v15 != v16 /* !! */ ) break block57;
                                                                                                                                                }
                                                                                                                                                catch (MatchException v17) {
                                                                                                                                                    throw _8G.a(v17);
                                                                                                                                                }
                                                                                                                                                v15 = 1;
                                                                                                                                                break block56;
                                                                                                                                            }
                                                                                                                                            catch (MatchException v18) {
                                                                                                                                                throw _8G.a(v18);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        v15 = 0;
                                                                                                                                    }
                                                                                                                                    var55_41 = v15;
                                                                                                                                    try {
                                                                                                                                        v19 = new Object[1];
                                                                                                                                        v19[0] = var26_18;
                                                                                                                                        v20 /* !! */  = _8G.f("\u00c0", (Object)_8G.f("C", (Object)this, (long)-8321882624469932945L, (long)var6_10), (Object)v19, (long)-8318269095415412775L, (long)var6_10);
                                                                                                                                        v21 = var40_35;
                                                                                                                                        if (var6_10 >= 0L) {
                                                                                                                                            if (v21 == 0) break block58;
                                                                                                                                            if (v20 /* !! */  == false) break block59;
                                                                                                                                        }
                                                                                                                                        ** GOTO lbl136
                                                                                                                                    }
                                                                                                                                    catch (MatchException v22) {
                                                                                                                                        throw _8G.a(v22);
                                                                                                                                    }
                                                                                                                                    v20 /* !! */  = (CallSite)var55_41;
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    v21 = var40_35;
lbl136:
                                                                                                                                    // 2 sources

                                                                                                                                    if (v21 == 0) break block60;
                                                                                                                                    if (v20 /* !! */  == false) break block59;
                                                                                                                                }
                                                                                                                                catch (MatchException v23) {
                                                                                                                                    throw _8G.a(v23);
                                                                                                                                }
                                                                                                                                v20 /* !! */  = (CallSite)true;
                                                                                                                                break block60;
                                                                                                                            }
                                                                                                                            v20 /* !! */  = (CallSite)false;
                                                                                                                        }
                                                                                                                        var56_42 /* !! */  = v20 /* !! */ ;
                                                                                                                        try {
                                                                                                                            v24 /* !! */  = var55_41;
                                                                                                                            v25 = var40_35;
                                                                                                                            if (var6_10 <= 0L) break block61;
                                                                                                                            if (v25 == 0) break block62;
                                                                                                                            if (v24 /* !! */  == 0) break block63;
                                                                                                                        }
                                                                                                                        catch (MatchException v26) {
                                                                                                                            throw _8G.a(v26);
                                                                                                                        }
                                                                                                                        v24 /* !! */  = (int)_8G.d("d", (int)21237, (long)(1475151638055695179L ^ var6_10));
                                                                                                                    }
                                                                                                                    v25 = 1;
                                                                                                                }
                                                                                                                v27 = new Object[3];
                                                                                                                v27[2] = v25;
                                                                                                                v27[1] = v24 /* !! */ ;
                                                                                                                v27[0] = var30_20;
                                                                                                                v28 = _8G.f("\u00d2", (Object)v27, (long)-8315508570097375919L, (long)var6_10);
                                                                                                                break block81;
                                                                                                            }
                                                                                                            v28 = new _8B((int)_8G.d("d", (int)10563, (long)(2694717540883089654L ^ var6_10)), (int)_8G.d("d", (int)10563, (long)(2694717540883089654L ^ var6_10)), var22_16, (int)_8G.d("d", (int)5577, (long)(690020113106662527L ^ var6_10)), (int)_8G.d("d", (int)16401, (long)(4241920989913162171L ^ var6_10)));
                                                                                                        }
                                                                                                        var57_43 = v28;
                                                                                                        v29 = new Object[10];
                                                                                                        v29[9] = 4.0;
                                                                                                        v29[8] = 4.0;
                                                                                                        v29[7] = 4.0;
                                                                                                        v29[6] = 4.0;
                                                                                                        v29[5] = var34_22;
                                                                                                        v29[4] = (double)(var53_38 + var48_32 - 5);
                                                                                                        v29[3] = (double)(var43_27 + var41_25 - _8G.d("d", (int)14624, (long)(4697763148528703652L ^ var6_10)));
                                                                                                        v29[2] = (double)var53_38;
                                                                                                        v29[1] = (double)(var43_27 + _8G.d("d", (int)24223, (long)(3731516682588143414L ^ var6_10)));
                                                                                                        v29[0] = var57_43;
                                                                                                        _8G.f("\u00c0", (Object)var5_2, (Object)v29, (long)-8320521062244862229L, (long)var6_10);
                                                                                                        var58_44 = var43_27 + _8G.d("d", (int)22548, (long)(2957361877997304200L ^ var6_10));
                                                                                                        var59_45 = var41_25 - _8G.d("d", (int)3452, (long)(9106465653153361148L ^ var6_10));
                                                                                                        var60_46 = var53_38 + 3;
                                                                                                        var61_47 = var48_32 - _8G.d("d", (int)26871, (long)(6870969412984801600L ^ var6_10));
                                                                                                        try {
                                                                                                            try {
                                                                                                                v30 = new Object[10];
                                                                                                                v30[9] = 3.0;
                                                                                                                v30[8] = 3.0;
                                                                                                                v30[7] = 3.0;
                                                                                                                v30[6] = 3.0;
                                                                                                                v30[5] = var34_22;
                                                                                                                v30[4] = (double)(var60_46 + var61_47);
                                                                                                                v30[3] = (double)(var58_44 + var59_45);
                                                                                                                v30[2] = (double)var60_46;
                                                                                                                v30[1] = (double)var58_44;
                                                                                                                v30[0] = new _8B((int)_8G.d("d", (int)29870, (long)(3876917728000087350L ^ var6_10)), (int)_8G.d("d", (int)29870, (long)(3876917728000087350L ^ var6_10)), var22_16, (int)_8G.d("d", (int)10563, (long)(2694717540883089654L ^ var6_10)), (int)_8G.d("d", (int)16401, (long)(4241920989913162171L ^ var6_10)));
                                                                                                                _8G.f("\u00c0", (Object)var5_2, (Object)v30, (long)-8320521062244862229L, (long)var6_10);
                                                                                                                v31 /* !! */  = var40_35;
                                                                                                                if (var6_10 < 0L) break block64;
                                                                                                                if (v31 /* !! */  == 0) break block65;
                                                                                                                if (var56_42 /* !! */  == false) break block66;
                                                                                                            }
                                                                                                            catch (MatchException v32) {
                                                                                                                throw _8G.a(v32);
                                                                                                            }
                                                                                                            v33 = new Object[4];
                                                                                                            v33[3] = (double)(var60_46 + 5);
                                                                                                            v33[2] = (double)(var58_44 + 5);
                                                                                                            v33[1] = var5_2;
                                                                                                            v33[0] = var12_11;
                                                                                                            _8G.f("\u00c0", (Object)_8G.f("C", (Object)this, (long)-8321882624469932945L, (long)var6_10), (Object)v33, (long)-8321078531990628659L, (long)var6_10);
                                                                                                        }
                                                                                                        catch (MatchException v34) {
                                                                                                            throw _8G.a(v34);
                                                                                                        }
                                                                                                    }
                                                                                                    v31 /* !! */  = var40_35;
                                                                                                }
                                                                                                if (var6_10 < 0L) break block82;
                                                                                                if (v31 /* !! */  != 0) break block67;
                                                                                            }
                                                                                            var62_49 = _8G.f("C", (Object)var54_39, (long)-8319005059060437714L, (long)var6_10);
                                                                                            var63_50 = var59_45 - _8G.d("d", (int)3301, (long)(5105678167368002935L ^ var6_10));
                                                                                            try {
                                                                                                try {
                                                                                                    v35 = new Object[2];
                                                                                                    v35[1] = var18_14;
                                                                                                    v35[0] = var62_49;
                                                                                                    v36 = _8G.f("\u00c0", (Object)var5_2, (Object)v35, (long)-8318741410035806220L, (long)var6_10);
                                                                                                    v37 /* !! */  = var40_35;
                                                                                                    if (var6_10 >= 0L) {
                                                                                                        if (v37 /* !! */  == 0) break block67;
                                                                                                        v37 /* !! */  = (int)var63_50;
                                                                                                    }
                                                                                                    if (!(v36 > (double)v37 /* !! */ )) break block68;
                                                                                                }
                                                                                                catch (MatchException v38) {
                                                                                                    throw _8G.a(v38);
                                                                                                }
                                                                                                while (true) {
                                                                                                    v39 = new Object[2];
                                                                                                    v39[1] = var18_14;
                                                                                                    v39[0] = (String)var62_49 + (String)_8G.b("y", (int)6035, (long)(7439814526862013627L ^ var6_10));
                                                                                                    if (!(_8G.f("\u00c0", (Object)var5_2, (Object)v39, (long)-8318741410035806220L, (long)var6_10) > (double)var63_50)) break block69;
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            catch (MatchException v40) {
                                                                                                throw _8G.a(v40);
                                                                                            }
                                                                                            try {
                                                                                                block72: {
                                                                                                    try {
                                                                                                        v41 = var62_49;
                                                                                                        v42 = var40_35;
lbl275:
                                                                                                        // 2 sources

                                                                                                        while (v42 != 0) {
                                                                                                            v43 /* !! */  = (int)_8G.f("\u00c0", (Object)v41, (long)-8321627990079246675L, (long)var6_10);
                                                                                                            if (var6_10 <= 0L) break block70;
                                                                                                            v44 /* !! */  = (CallSite)true;
                                                                                                            if (var40_35 == 0) break block71;
                                                                                                            break block72;
                                                                                                        }
                                                                                                        break block73;
                                                                                                    }
                                                                                                    catch (MatchException v45) {
                                                                                                        throw _8G.a(v45);
                                                                                                    }
                                                                                                }
                                                                                                if (v43 /* !! */  <= v44 /* !! */ ) break block69;
                                                                                            }
                                                                                            catch (MatchException v46) {
                                                                                                throw _8G.a(v46);
                                                                                            }
                                                                                            var62_49 = _8G.f("\u00c0", (Object)var62_49, (int)0, (int)(_8G.f("\u00c0", (Object)var62_49, (long)-8321627990079246675L, (long)var6_10) - true), (long)-8321507651662526183L, (long)var6_10);
                                                                                            if (var40_35 != 0) ** continue;
                                                                                        }
                                                                                        v47 = var62_49;
                                                                                        v42 = 15569;
                                                                                        if (var6_10 <= 0L) ** GOTO lbl275
                                                                                        v41 = (String)v47 + (String)_8G.b("y", (int)v42, (long)(6376313670288941048L ^ var6_10));
                                                                                    }
                                                                                    var62_49 = v41;
                                                                                }
                                                                                v48 = new Object[5];
                                                                                v48[4] = var50_34;
                                                                                v48[3] = (double)(var60_46 + 5);
                                                                                v48[2] = (double)(var58_44 + 5);
                                                                                v48[1] = var62_49;
                                                                                v48[0] = var20_15;
                                                                                v36 = _8G.f("\u00c0", (Object)var5_2, (Object)v48, (long)-8321195825891303488L, (long)var6_10);
                                                                            }
                                                                            v31 /* !! */  = (int)(var43_27 + var41_25);
                                                                        }
                                                                        v44 /* !! */  = _8G.d("d", (int)28970, (long)(2928180028582760600L ^ var6_10));
                                                                    }
                                                                    v43 /* !! */  = v31 /* !! */  - v44 /* !! */ ;
                                                                }
                                                                var62_48 = v43 /* !! */ ;
                                                                var63_50 = _8G.d("d", (int)4355, (long)(3769621938283212939L ^ var6_10));
                                                                var64_51 = var53_38 + 3;
                                                                var65_52 = var48_32 - _8G.d("d", (int)29597, (long)(3855598076294599176L ^ var6_10));
                                                                try {
                                                                    try {
                                                                        v49 /* !! */  = _8G.f("C", (Object)this, (long)-8320912203203513176L, (long)var6_10);
                                                                        v50 = var40_35;
                                                                        if (var6_10 > 0L) {
                                                                            if (v50 == 0) break block74;
                                                                            v50 = var52_37;
                                                                        }
                                                                        if (v49 /* !! */  != v50) break block75;
                                                                    }
                                                                    catch (MatchException v51) {
                                                                        throw _8G.a(v51);
                                                                    }
                                                                    v49 /* !! */  = (CallSite)true;
                                                                    break block74;
                                                                }
                                                                catch (MatchException v52) {
                                                                    throw _8G.a(v52);
                                                                }
                                                            }
                                                            v49 /* !! */  = (CallSite)false;
                                                        }
                                                        var66_53 /* !! */  = v49 /* !! */ ;
                                                        try {
                                                            v53 = var66_53 /* !! */  != false ? _8G.f("\u00de", (long)-8322397672108455644L, (long)var6_10) : _8G.f("\u00de", (long)-8315108397876603524L, (long)var6_10);
                                                        }
                                                        catch (MatchException v54) {
                                                            throw _8G.a(v54);
                                                        }
                                                        var67_54 = v53;
                                                        try {
                                                            if (var66_53 /* !! */  == false) break block76;
                                                            v55 = new Object[1];
                                                            v55[0] = var14_12;
                                                            v56 = _8G.f("\u00c0", (Object)this, (Object)v55, (long)-8318392468444879181L, (long)var6_10);
                                                            break block77;
                                                        }
                                                        catch (MatchException v57) {
                                                            throw _8G.a(v57);
                                                        }
                                                    }
                                                    v56 = var50_34;
                                                }
                                                var68_55 = v56;
                                                try {
                                                    try {
                                                        v58 = new Object[8];
                                                        v58[7] = 3;
                                                        v58[6] = (int)var65_52;
                                                        v58[5] = (int)var63_50;
                                                        v58[4] = var16_13;
                                                        v58[3] = (int)var64_51;
                                                        v58[2] = var62_48;
                                                        v58[1] = var67_54;
                                                        v58[0] = var5_2;
                                                        _8G.f("\u00c0", (Object)this, (Object)v58, (long)-8314916872872871194L, (long)var6_10);
                                                        v59 /* !! */  = var66_53 /* !! */ ;
                                                        if (var40_35 == 0) break block78;
                                                        if (v59 /* !! */  == false) break block79;
                                                    }
                                                    catch (MatchException v60) {
                                                        throw _8G.a(v60);
                                                    }
                                                    v61 = _8G.b("y", (int)15569, (long)(6376313670288941048L ^ var6_10));
                                                    break block80;
                                                }
                                                catch (MatchException v62) {
                                                    throw _8G.a(v62);
                                                }
                                            }
                                            v59 /* !! */  = _8G.f("C", (Object)var54_39, (long)-8321366112020983031L, (long)var6_10);
                                        }
                                        v63 = new Object[2];
                                        v63[1] = var24_17;
                                        v63[0] = (int)v59 /* !! */ ;
                                        v61 = _8G.f("\u00d2", (Object)v63, (long)-8321568256769960639L, (long)var6_10);
                                    }
                                    var69_56 = v61;
                                    v64 = new Object[2];
                                    v64[1] = var18_14;
                                    v64[0] = var69_56;
                                    var70_57 = _8G.f("\u00c0", (Object)var5_2, (Object)v64, (long)-8318741410035806220L, (long)var6_10);
                                    v65 = new Object[5];
                                    v65[4] = var68_55;
                                    v65[3] = (double)var64_51 + (double)(var65_52 - _8G.d("d", (int)32523, (long)(6363506248247352977L ^ var6_10))) / 2.0;
                                    v65[2] = (double)var62_48 + ((double)var63_50 - var70_57) / 2.0;
                                    v65[1] = var69_56;
                                    v65[0] = var20_15;
                                    _8G.f("\u00c0", (Object)var5_2, (Object)v65, (long)-8321195825891303488L, (long)var6_10);
                                    var72_58 = var43_27 + var41_25 - _8G.d("d", (int)11398, (long)(4431728350637149444L ^ var6_10));
                                    var73_59 = var53_38 + 3;
                                    var74_60 = var48_32 - _8G.d("d", (int)29597, (long)(3855598076294599176L ^ var6_10));
                                    v66 = new Object[8];
                                    v66[7] = 3;
                                    v66[6] = (int)var74_60;
                                    v66[5] = (int)var74_60;
                                    v66[4] = var16_13;
                                    v66[3] = (int)var73_59;
                                    v66[2] = (int)var72_58;
                                    v66[1] = _8G.f("\u00de", (long)-8314810128320460469L, (long)var6_10);
                                    v66[0] = var5_2;
                                    _8G.f("\u00c0", (Object)this, (Object)v66, (long)-8314916872872871194L, (long)var6_10);
                                    v67 = new Object[2];
                                    v67[1] = var18_14;
                                    v67[0] = "X";
                                    var75_61 = _8G.f("\u00c0", (Object)var5_2, (Object)v67, (long)-8318741410035806220L, (long)var6_10);
                                    v68 = new Object[5];
                                    v68[4] = new _8B((int)_8G.d("d", (int)16401, (long)(4241920989913162171L ^ var6_10)), var36_23, (int)_8G.d("d", (int)16263, (long)(6741786225609399846L ^ var6_10)), (int)_8G.d("d", (int)21844, (long)(2885415849930929384L ^ var6_10)));
                                    v68[3] = (double)var73_59 + (double)(var74_60 - _8G.d("d", (int)27857, (long)(2934589876325092690L ^ var6_10))) / 2.0;
                                    v68[2] = (double)var72_58 + ((double)var74_60 - var75_61) / 2.0;
                                    v68[1] = "X";
                                    v68[0] = var20_15;
                                    _8G.f("\u00c0", (Object)var5_2, (Object)v68, (long)-8321195825891303488L, (long)var6_10);
                                }
                                ++var52_37;
                            }
                            v8 = var40_35;
                        }
                        if (v8 != 0) continue block42;
                        var52_37 = var44_28 + var42_26 - _8G.d("d", (int)7207, (long)(4632805122135915906L ^ var6_10));
                        v69 = new Object[3];
                        v69[2] = 1;
                        v69[1] = (int)_8G.d("d", (int)2105, (long)(593654412138047881L ^ var6_10));
                        v69[0] = var30_20;
                        v70 = new Object[8];
                        v70[7] = (int)_8G.d("d", (int)4108, (long)(3012635838195003816L ^ var6_10));
                        v70[6] = (int)_8G.d("d", (int)29759, (long)(464837751513847196L ^ var6_10));
                        v70[5] = var52_37;
                        v70[4] = (int)(var43_27 + _8G.d("d", (int)29870, (long)(3876917728000087350L ^ var6_10)));
                        v70[3] = _8G.f("\u00d2", (Object)v69, (long)-8315508570097375919L, (long)var6_10);
                        v70[2] = _8G.b("y", (int)14490, (long)(757503950995233726L ^ var6_10));
                        v70[1] = var5_2;
                        v70[0] = var38_24;
                        _8G.f("\u00c0", (Object)this, (Object)v70, (long)-8322282929648661266L, (long)var6_10);
                        var53_38 = var43_27 + var41_25 - _8G.d("d", (int)6331, (long)(5795941108633631001L ^ var6_10));
                        v71 = new Object[3];
                        v71[2] = 1;
                        v71[1] = (int)_8G.d("d", (int)10312, (long)(8383445217733298675L ^ var6_10));
                        v71[0] = var30_20;
                        v72 = new Object[8];
                        v72[7] = (int)_8G.d("d", (int)26312, (long)(1976775445774632818L ^ var6_10));
                        v72[6] = (int)_8G.d("d", (int)25998, (long)(7158403756942590978L ^ var6_10));
                        v72[5] = var52_37;
                        v72[4] = (int)var53_38;
                        v72[3] = _8G.f("\u00d2", (Object)v71, (long)-8315508570097375919L, (long)var6_10);
                        v72[2] = _8G.b("y", (int)13389, (long)(7690344301830707055L ^ var6_10));
                        v72[1] = var5_2;
                        v72[0] = var38_24;
                        _8G.f("\u00c0", (Object)this, (Object)v72, (long)-8322282929648661266L, (long)var6_10);
                        v6 = var53_38;
                        v7 = 12923;
                    } while (var6_10 < 0L);
                }
                v10 = _8G.d("d", (int)v7, (long)(3810458702228411344L ^ var6_10));
            }
            v9 = v6 - v10;
        }
        var54_40 = v9;
        v73 = new Object[8];
        v73[7] = (int)_8G.d("d", (int)26312, (long)(1976775445774632818L ^ var6_10));
        v73[6] = (int)_8G.d("d", (int)29746, (long)(5061049979334530468L ^ var6_10));
        v73[5] = var52_37;
        v73[4] = (int)var54_40;
        v73[3] = _8G.f("\u00de", (long)-8314859605513603891L, (long)var6_10);
        v73[2] = _8G.b("y", (int)17926, (long)(7310162255480874272L ^ var6_10));
        v73[1] = var5_2;
        v73[0] = var38_24;
        _8G.f("\u00c0", (Object)this, (Object)v73, (long)-8322282929648661266L, (long)var6_10);
    }

    public boolean method_25402(class_11909 class_119092, boolean bl) {
        Object object;
        block143: {
            long l2;
            block144: {
                boolean bl2;
                long l3;
                long l4;
                block115: {
                    CallSite callSite;
                    CallSite callSite2;
                    CallSite callSite3;
                    CallSite callSite4;
                    CallSite callSite5;
                    CallSite callSite6;
                    CallSite callSite7;
                    long l5;
                    long l6;
                    long l7;
                    long l8;
                    block111: {
                        CallSite callSite8;
                        CallSite callSite9;
                        block113: {
                            block112: {
                                long l9;
                                block109: {
                                    block110: {
                                        long l10;
                                        block107: {
                                            reference var36_23;
                                            block108: {
                                                block105: {
                                                    reference var38_25;
                                                    block106: {
                                                        long l11 = l2 = b ^ 0x3F80CDFA8ECDL;
                                                        l9 = l11 ^ 0x297C573000A0L;
                                                        l4 = l11 ^ 0x1C04DEB58C0BL;
                                                        l8 = l11 ^ 0x62739C983FE9L;
                                                        long l12 = l11 ^ 0x567F14DE3E46L;
                                                        l7 = l11 ^ 0x473224FAB399L;
                                                        long l13 = l11 ^ 0x65F824B20F3BL;
                                                        l3 = l11 ^ 0x5005C64976F2L;
                                                        long l14 = l11 ^ 0x2053460C5FAFL;
                                                        l10 = l11 ^ 0x6B8CEB1A012CL;
                                                        l6 = l11 ^ 0x7D559D604173L;
                                                        l5 = l11 ^ 0x7907E3AE489FL;
                                                        long l15 = l11 ^ 0x5469206F0C2DL;
                                                        Object[] objectArray = new Object[2];
                                                        objectArray[1] = l15;
                                                        objectArray[0] = (double)_8G.f("\u00c0", (Object)class_119092, -6663352603450544045L, (long)l2);
                                                        callSite7 = _8G.f("\u00c0", (Object)this, (Object)objectArray, -6664947686231654227L, (long)l2);
                                                        Object[] objectArray2 = new Object[2];
                                                        objectArray2[1] = l15;
                                                        objectArray2[0] = (double)_8G.f("\u00c0", (Object)class_119092, -6662945563070438747L, (long)l2);
                                                        callSite6 = _8G.f("\u00c0", (Object)this, (Object)objectArray2, -6664947686231654227L, (long)l2);
                                                        Object[] objectArray3 = new Object[1];
                                                        objectArray3[0] = l14;
                                                        callSite5 = _8G.f("\u00c0", (Object)this, (Object)objectArray3, -6657197471923749028L, (long)l2);
                                                        bl2 = _02.cfr_renamed_3();
                                                        Object[] objectArray4 = new Object[1];
                                                        objectArray4[0] = l12;
                                                        callSite4 = _8G.f("\u00c0", (Object)this, (Object)objectArray4, -6662869851806938665L, (long)l2);
                                                        callSite3 = _8G.f("C", (Object)this, -6664375510235822009L, (long)l2);
                                                        callSite2 = _8G.f("C", (Object)this, -6663895742039609716L, (long)l2);
                                                        var36_23 = callSite2 + callSite4 - _8G.d("d", 28779, (long)(0x6A82F1255A983EF1L ^ l2));
                                                        reference var37_24 = callSite3 + callSite5 - _8G.d("d", 13708, (long)(0x2A1CF3B33669FB18L ^ l2));
                                                        var38_25 = var37_24 - _8G.d("d", 18558, (long)(0x7187CFB6915F06C6L ^ l2));
                                                        try {
                                                            try {
                                                                Object[] objectArray5 = new Object[7];
                                                                objectArray5[6] = (int)_8G.d("d", 26312, (long)(0x1B6EF62FAACFA877L ^ l2));
                                                                objectArray5[5] = (int)_8G.d("d", 29746, (long)(0x463C6AC08C68BAA1L ^ l2));
                                                                objectArray5[4] = (int)var36_23;
                                                                objectArray5[3] = (int)var37_24;
                                                                objectArray5[2] = (double)callSite6;
                                                                objectArray5[1] = (double)callSite7;
                                                                objectArray5[0] = l6;
                                                                callSite = _8G.f("\u00c0", (Object)this, (Object)objectArray5, -6663536681490712105L, (long)l2);
                                                                if (!bl2) break block105;
                                                                if (callSite == false) break block106;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _8G.a(matchException);
                                                            }
                                                            Object[] objectArray6 = new Object[1];
                                                            objectArray6[0] = l13;
                                                            _8G.f("\u00c0", (Object)this, (Object)objectArray6, -6662003979028176046L, (long)l2);
                                                            return true;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _8G.a(matchException);
                                                        }
                                                    }
                                                    Object[] objectArray = new Object[7];
                                                    objectArray[6] = (int)_8G.d("d", 26312, (long)(0x1B6EF62FAACFA877L ^ l2));
                                                    objectArray[5] = (int)_8G.d("d", 29746, (long)(0x463C6AC08C68BAA1L ^ l2));
                                                    objectArray[4] = (int)var36_23;
                                                    objectArray[3] = (int)var38_25;
                                                    objectArray[2] = (double)callSite6;
                                                    objectArray[1] = (double)callSite7;
                                                    objectArray[0] = l6;
                                                    callSite = _8G.f("\u00c0", (Object)this, (Object)objectArray, -6663536681490712105L, (long)l2);
                                                }
                                                try {
                                                    try {
                                                        if (!bl2) break block107;
                                                        if (callSite == false) break block108;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _8G.a(matchException);
                                                    }
                                                    _8G.f("\u00c0", (Object)_8G.f("\u00de", -6663046768029632877L, (long)l2), (Object)_8G.f("C", (Object)_8G.f("\u00de", -6662782410209120803L, (long)l2), -6656412449264531845L, (long)l2), -6664634328527961776L, (long)l2);
                                                    return true;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _8G.a(matchException);
                                                }
                                            }
                                            Object[] objectArray = new Object[7];
                                            objectArray[6] = (int)_8G.d("d", 26312, (long)(0x1B6EF62FAACFA877L ^ l2));
                                            objectArray[5] = (int)_8G.d("d", 13249, (long)(0x28287FF55CD7FD5AL ^ l2));
                                            objectArray[4] = (int)var36_23;
                                            objectArray[3] = (int)(callSite3 + _8G.d("d", 29870, (long)(0x35CD88C6CC0F3A33L ^ l2)));
                                            objectArray[2] = (double)callSite6;
                                            objectArray[1] = (double)callSite7;
                                            objectArray[0] = l6;
                                            callSite = _8G.f("\u00c0", (Object)this, (Object)objectArray, -6663536681490712105L, (long)l2);
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (!bl2) break block109;
                                                        if (callSite == false) break block110;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _8G.a(matchException);
                                                    }
                                                    callSite = _8G.f("\u00c0", (Object)_8G.f("C", (Object)this, -6663827816182039561L, (long)l2), -6663928348430670372L, (long)l2);
                                                    if (!bl2) break block109;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _8G.a(matchException);
                                                }
                                                if (callSite >= _8G.d("d", 21237, (long)(0x1478D67DACF61C4EL ^ l2))) break block110;
                                            }
                                            catch (MatchException matchException) {
                                                throw _8G.a(matchException);
                                            }
                                            _8G.f("\u00c0", (Object)_8G.f("C", (Object)this, -6663827816182039561L, (long)l2), (Object)new _9c_0(l10, (String)((Object)_8G.b("y", 8082, (long)(0x43DDF414B13613B2L ^ l2))), -1), -6663570731292606212L, (long)l2);
                                            _8G.f("\u00f1", (Object)this, (int)(_8G.f("\u00c0", (Object)_8G.f("C", (Object)this, -6663827816182039561L, (long)l2), -6663928348430670372L, (long)l2) - true), -6662073760703626112L, (long)l2);
                                            Object[] objectArray = new Object[2];
                                            objectArray[1] = _8G.b("y", 13994, (long)(0x5EA22E3A6199BA8EL ^ l2));
                                            objectArray[0] = l7;
                                            _8G.f("\u00c0", (Object)_8G.f("C", (Object)this, -6663173243552511126L, (long)l2), (Object)objectArray, -6662122024783494025L, (long)l2);
                                            Object[] objectArray7 = new Object[1];
                                            objectArray7[0] = l5;
                                            _8G.f("\u00c0", (Object)_8G.f("C", (Object)this, -6663173243552511126L, (long)l2), (Object)objectArray7, -6664017140160585828L, (long)l2);
                                            Object[] objectArray8 = new Object[2];
                                            objectArray8[1] = l3;
                                            objectArray8[0] = true;
                                            _8G.f("\u00c0", (Object)_8G.f("C", (Object)this, -6663173243552511126L, (long)l2), (Object)objectArray8, -6664809346158008546L, (long)l2);
                                            _8G.f("\u00f1", (Object)this, (int)_8G.d("d", 24450, (long)(0x2B25B569314F1100L ^ l2)), -6664427449989440595L, (long)l2);
                                            return true;
                                        }
                                        catch (MatchException matchException) {
                                            throw _8G.a(matchException);
                                        }
                                    }
                                    callSite = _8G.f("C", (Object)this, -6664427449989440595L, (long)l2);
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                if (!bl2) break block111;
                                                if (callSite < 0) break block112;
                                            }
                                            catch (MatchException matchException) {
                                                throw _8G.a(matchException);
                                            }
                                            CallSite callSite8 = _8G.f("C", (Object)this, -6664427449989440595L, (long)l2);
                                            callSite8 = _8G.f("\u00c0", (Object)_8G.f("C", (Object)this, -6663827816182039561L, (long)l2), -6663928348430670372L, (long)l2);
                                            if (!bl2) break block113;
                                        }
                                        catch (MatchException matchException) {
                                            throw _8G.a(matchException);
                                        }
                                        if (callSite9 < callSite8) {
                                        }
                                        break block112;
                                    }
                                    catch (MatchException matchException) {
                                        throw _8G.a(matchException);
                                    }
                                    Object[] objectArray = new Object[3];
                                    objectArray[2] = (int)_8G.f("C", (Object)this, -6664427449989440595L, (long)l2);
                                    objectArray[1] = (int)_8G.f("\u00c0", (Object)class_119092, -6663087697099056046L, (long)l2);
                                    objectArray[0] = l9;
                                    _8G.f("\u00c0", (Object)this, (Object)objectArray, -6664312780976743973L, (long)l2);
                                    _8G.f("\u00f1", (Object)((_9c_0)((Object)_8G.f("\u00c0", (Object)_8G.f("C", (Object)this, -6663827816182039561L, (long)l2), (int)_8G.f("C", (Object)this, -6664427449989440595L, (long)l2), -6656999531299744157L, (long)l2))), (int)_8G.f("\u00c0", (Object)class_119092, -6663087697099056046L, (long)l2), -6664890423710368756L, (long)l2);
                                    _8G.f("\u00f1", (Object)this, (int)_8G.d("d", 24450, (long)(0x2B25B569314F1100L ^ l2)), -6664427449989440595L, (long)l2);
                                    return true;
                                }
                                catch (MatchException matchException) {
                                    throw _8G.a(matchException);
                                }
                            }
                            CallSite callSite8 = callSite2;
                            callSite8 = _8G.d("d", 20847, (long)(0x6ED1D0673BCE1FECL ^ l2));
                        }
                        callSite = callSite9 + callSite8;
                    }
                    CallSite callSite10 = callSite;
                    CallSite callSite11 = _8G.d("d", 16003, (long)(0x34EA30C9BF97F009L ^ l2));
                    int n = 0;
                    while (n < _8G.f("\u00c0", (Object)_8G.f("C", (Object)this, -6663827816182039561L, (long)l2), -6663928348430670372L, (long)l2)) {
                        block114: {
                            block116: {
                                Object object2;
                                block138: {
                                    block139: {
                                        CallSite callSite12;
                                        block140: {
                                            _8G g;
                                            block142: {
                                                block141: {
                                                    CallSite callSite13;
                                                    block136: {
                                                        reference v55;
                                                        reference var42_29;
                                                        block129: {
                                                            block130: {
                                                                block135: {
                                                                    _8G g2;
                                                                    block133: {
                                                                        CallSite callSite14;
                                                                        block131: {
                                                                            block132: {
                                                                                reference v36;
                                                                                block119: {
                                                                                    block120: {
                                                                                        Object object3;
                                                                                        block128: {
                                                                                            block127: {
                                                                                                int n2;
                                                                                                block125: {
                                                                                                    block124: {
                                                                                                        block123: {
                                                                                                            block121: {
                                                                                                                CallSite callSite15;
                                                                                                                reference v31;
                                                                                                                block117: {
                                                                                                                    block118: {
                                                                                                                        var42_29 = callSite10 + n * callSite11 - (int)_8G.f("C", (Object)this, -6662649670462405607L, (long)l2);
                                                                                                                        CallSite callSite16 = callSite2 + callSite4 - _8G.d("d", 21237, (long)(0x1478D67DACF61C4EL ^ l2));
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        if (!bl2) break block114;
                                                                                                                                        object = var42_29 + callSite11;
                                                                                                                                        if (!bl2) break block115;
                                                                                                                                    }
                                                                                                                                    catch (MatchException matchException) {
                                                                                                                                        throw _8G.a(matchException);
                                                                                                                                    }
                                                                                                                                    if (object < callSite2 + _8G.d("d", 10939, (long)(0x3313A6DA06E36419L ^ l2))) break block116;
                                                                                                                                }
                                                                                                                                catch (MatchException matchException) {
                                                                                                                                    throw _8G.a(matchException);
                                                                                                                                }
                                                                                                                                v31 = var42_29;
                                                                                                                                callSite15 = callSite16;
                                                                                                                                if (!bl2) break block117;
                                                                                                                            }
                                                                                                                            catch (MatchException matchException) {
                                                                                                                                throw _8G.a(matchException);
                                                                                                                            }
                                                                                                                            if (v31 <= callSite15) break block118;
                                                                                                                            break block116;
                                                                                                                        }
                                                                                                                        catch (MatchException matchException) {
                                                                                                                            throw _8G.a(matchException);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    v31 = callSite3 + callSite5;
                                                                                                                    callSite15 = _8G.d("d", 642, (long)(0x7D02CE2F1A93CC21L ^ l2));
                                                                                                                }
                                                                                                                reference var44_31 = v31 - callSite15;
                                                                                                                reference var45_32 = callSite11 - _8G.d("d", 29597, (long)(0x3581CAE10AEB3D0DL ^ l2));
                                                                                                                try {
                                                                                                                    block122: {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        Object[] objectArray = new Object[7];
                                                                                                                                        objectArray[6] = (int)var45_32;
                                                                                                                                        objectArray[5] = (int)var45_32;
                                                                                                                                        objectArray[4] = (int)(var42_29 + 3);
                                                                                                                                        objectArray[3] = (int)var44_31;
                                                                                                                                        objectArray[2] = (double)callSite6;
                                                                                                                                        objectArray[1] = (double)callSite7;
                                                                                                                                        objectArray[0] = l6;
                                                                                                                                        v36 = _8G.f("\u00c0", (Object)this, (Object)objectArray, -6663536681490712105L, (long)l2);
                                                                                                                                        if (!bl2) break block119;
                                                                                                                                        if (v36 == false) break block120;
                                                                                                                                    }
                                                                                                                                    catch (MatchException matchException) {
                                                                                                                                        throw _8G.a(matchException);
                                                                                                                                    }
                                                                                                                                    _8G.f("\u00c0", (Object)_8G.f("C", (Object)this, -6663827816182039561L, (long)l2), (int)n, -6657285787518020564L, (long)l2);
                                                                                                                                    object3 = _8G.f("C", (Object)this, -6662073760703626112L, (long)l2);
                                                                                                                                    n2 = n;
                                                                                                                                    if (!bl2) break block121;
                                                                                                                                }
                                                                                                                                catch (MatchException matchException) {
                                                                                                                                    throw _8G.a(matchException);
                                                                                                                                }
                                                                                                                                if (object3 != n2) break block122;
                                                                                                                            }
                                                                                                                            catch (MatchException matchException) {
                                                                                                                                throw _8G.a(matchException);
                                                                                                                            }
                                                                                                                            _8G.f("\u00f1", (Object)this, (int)_8G.d("d", 24450, (long)(0x2B25B569314F1100L ^ l2)), -6662073760703626112L, (long)l2);
                                                                                                                            Object[] objectArray = new Object[2];
                                                                                                                            objectArray[1] = l3;
                                                                                                                            objectArray[0] = false;
                                                                                                                            _8G.f("\u00c0", (Object)_8G.f("C", (Object)this, -6663173243552511126L, (long)l2), (Object)objectArray, -6664809346158008546L, (long)l2);
                                                                                                                            if (bl2) break block123;
                                                                                                                        }
                                                                                                                        catch (MatchException matchException) {
                                                                                                                            throw _8G.a(matchException);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    object3 = _8G.f("C", (Object)this, -6662073760703626112L, (long)l2);
                                                                                                                    n2 = n;
                                                                                                                }
                                                                                                                catch (MatchException matchException) {
                                                                                                                    throw _8G.a(matchException);
                                                                                                                }
                                                                                                            }
                                                                                                            try {
                                                                                                                try {
                                                                                                                    if (!bl2) break block124;
                                                                                                                    if (object3 <= n2) break block123;
                                                                                                                }
                                                                                                                catch (MatchException matchException) {
                                                                                                                    throw _8G.a(matchException);
                                                                                                                }
                                                                                                                _8G g3 = this;
                                                                                                                _8G.f("\u00f1", (Object)g3, (int)(_8G.f("C", (Object)g3, -6662073760703626112L, (long)l2) - true), -6662073760703626112L, (long)l2);
                                                                                                            }
                                                                                                            catch (MatchException matchException) {
                                                                                                                throw _8G.a(matchException);
                                                                                                            }
                                                                                                        }
                                                                                                        object3 = _8G.f("C", (Object)this, -6664427449989440595L, (long)l2);
                                                                                                        n2 = n;
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            block126: {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (!bl2) break block125;
                                                                                                                        if (object3 != n2) break block126;
                                                                                                                    }
                                                                                                                    catch (MatchException matchException) {
                                                                                                                        throw _8G.a(matchException);
                                                                                                                    }
                                                                                                                    _8G.f("\u00f1", (Object)this, (int)_8G.d("d", 24450, (long)(0x2B25B569314F1100L ^ l2)), -6664427449989440595L, (long)l2);
                                                                                                                    if (bl2) break block127;
                                                                                                                }
                                                                                                                catch (MatchException matchException) {
                                                                                                                    throw _8G.a(matchException);
                                                                                                                }
                                                                                                            }
                                                                                                            object3 = _8G.f("C", (Object)this, -6664427449989440595L, (long)l2);
                                                                                                            if (!bl2) break block128;
                                                                                                        }
                                                                                                        catch (MatchException matchException) {
                                                                                                            throw _8G.a(matchException);
                                                                                                        }
                                                                                                        n2 = n;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw _8G.a(matchException);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    if (object3 > n2) {
                                                                                                        _8G g4 = this;
                                                                                                        _8G.f("\u00f1", (Object)g4, (int)(_8G.f("C", (Object)g4, -6664427449989440595L, (long)l2) - true), -6664427449989440595L, (long)l2);
                                                                                                    }
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw _8G.a(matchException);
                                                                                                }
                                                                                            }
                                                                                            object3 = true;
                                                                                        }
                                                                                        return (boolean)object3;
                                                                                    }
                                                                                    v36 = callSite3 + callSite5 - _8G.d("d", 28970, (long)(0x28A2E0DC06C2BF9DL ^ l2));
                                                                                }
                                                                                reference var46_33 = v36;
                                                                                CallSite callSite17 = _8G.d("d", 30653, (long)(0x3CD0AF7363AC3931L ^ l2));
                                                                                reference var48_35 = callSite11 - _8G.d("d", 29597, (long)(0x3581CAE10AEB3D0DL ^ l2));
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        Object[] objectArray = new Object[7];
                                                                                                        objectArray[6] = (int)var48_35;
                                                                                                        objectArray[5] = (int)callSite17;
                                                                                                        objectArray[4] = (int)(var42_29 + 3);
                                                                                                        objectArray[3] = (int)var46_33;
                                                                                                        objectArray[2] = (double)callSite6;
                                                                                                        objectArray[1] = (double)callSite7;
                                                                                                        objectArray[0] = l6;
                                                                                                        v55 = _8G.f("\u00c0", (Object)this, (Object)objectArray, -6663536681490712105L, (long)l2);
                                                                                                        if (!bl2) break block129;
                                                                                                        if (v55 == false) break block130;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw _8G.a(matchException);
                                                                                                    }
                                                                                                    Object[] objectArray = new Object[1];
                                                                                                    objectArray[0] = l8;
                                                                                                    callSite14 = _8G.f("\u00c0", (Object)_8G.f("C", (Object)this, -6663173243552511126L, (long)l2), (Object)objectArray, -6662355809467062052L, (long)l2);
                                                                                                    if (!bl2) break block131;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw _8G.a(matchException);
                                                                                                }
                                                                                                if (callSite14 == false) break block132;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw _8G.a(matchException);
                                                                                            }
                                                                                            callSite14 = _8G.f("C", (Object)this, -6662073760703626112L, (long)l2);
                                                                                            if (!bl2) break block131;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw _8G.a(matchException);
                                                                                        }
                                                                                        if (callSite14 < 0) break block132;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw _8G.a(matchException);
                                                                                    }
                                                                                    Object[] objectArray = new Object[1];
                                                                                    objectArray[0] = l4;
                                                                                    _8G.f("\u00f1", (Object)((_9c_0)((Object)_8G.f("\u00c0", (Object)_8G.f("C", (Object)this, -6663827816182039561L, (long)l2), (int)_8G.f("C", (Object)this, -6662073760703626112L, (long)l2), -6656999531299744157L, (long)l2))), (String)((Object)_8G.f("\u00c0", (Object)_8G.f("\u00c0", (Object)_8G.f("C", (Object)this, -6663173243552511126L, (long)l2), (Object)objectArray, -6665108383656642677L, (long)l2), -6663256066259936320L, (long)l2)), -6662538961277861333L, (long)l2);
                                                                                    Object[] objectArray9 = new Object[2];
                                                                                    objectArray9[1] = l3;
                                                                                    objectArray9[0] = false;
                                                                                    _8G.f("\u00c0", (Object)_8G.f("C", (Object)this, -6663173243552511126L, (long)l2), (Object)objectArray9, -6664809346158008546L, (long)l2);
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw _8G.a(matchException);
                                                                                }
                                                                            }
                                                                            try {
                                                                                g2 = this;
                                                                                if (!bl2) break block133;
                                                                                callSite14 = _8G.f("C", (Object)g2, -6664427449989440595L, (long)l2);
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw _8G.a(matchException);
                                                                            }
                                                                        }
                                                                        try {
                                                                            block134: {
                                                                                try {
                                                                                    if (callSite14 != n) break block134;
                                                                                    _8G.f("\u00f1", (Object)this, (int)_8G.d("d", 24450, (long)(0x2B25B569314F1100L ^ l2)), -6664427449989440595L, (long)l2);
                                                                                    if (bl2) break block135;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw _8G.a(matchException);
                                                                                }
                                                                            }
                                                                            g2 = this;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw _8G.a(matchException);
                                                                        }
                                                                    }
                                                                    _8G.f("\u00f1", (Object)g2, (int)n, -6664427449989440595L, (long)l2);
                                                                }
                                                                return true;
                                                            }
                                                            v55 = callSite3 + _8G.d("d", 29870, (long)(0x35CD88C6CC0F3A33L ^ l2));
                                                        }
                                                        reference var49_36 = v55;
                                                        reference var50_37 = callSite5 - _8G.d("d", 13528, (long)(0x8458A4F440FA75L ^ l2));
                                                        reference var51_38 = callSite11 - _8G.d("d", 29597, (long)(0x3581CAE10AEB3D0DL ^ l2));
                                                        try {
                                                            try {
                                                                block137: {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (!bl2) break block114;
                                                                                        Object[] objectArray = new Object[7];
                                                                                        objectArray[6] = (int)var51_38;
                                                                                        objectArray[5] = (int)var50_37;
                                                                                        objectArray[4] = (int)(var42_29 + 3);
                                                                                        objectArray[3] = (int)var49_36;
                                                                                        objectArray[2] = (double)callSite6;
                                                                                        objectArray[1] = (double)callSite7;
                                                                                        objectArray[0] = l6;
                                                                                        if (_8G.f("\u00c0", (Object)this, (Object)objectArray, -6663536681490712105L, (long)l2) == false) break block116;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw _8G.a(matchException);
                                                                                    }
                                                                                    _8G.f("\u00f1", (Object)this, (int)_8G.d("d", 24450, (long)(0x2B25B569314F1100L ^ l2)), -6664427449989440595L, (long)l2);
                                                                                    callSite13 = _8G.f("C", (Object)this, -6662073760703626112L, (long)l2);
                                                                                    if (!bl2) break block136;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw _8G.a(matchException);
                                                                                }
                                                                                if (callSite13 != n) break block137;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw _8G.a(matchException);
                                                                            }
                                                                            Object[] objectArray = new Object[1];
                                                                            objectArray[0] = l8;
                                                                            object2 = _8G.f("\u00c0", (Object)_8G.f("C", (Object)this, -6663173243552511126L, (long)l2), (Object)objectArray, -6662355809467062052L, (long)l2);
                                                                            if (!bl2) break block138;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw _8G.a(matchException);
                                                                        }
                                                                        if (object2 != false) break block139;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw _8G.a(matchException);
                                                                    }
                                                                }
                                                                callSite12 = _8G.f("C", (Object)this, -6663173243552511126L, (long)l2);
                                                                if (!bl2) break block140;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _8G.a(matchException);
                                                            }
                                                            Object[] objectArray = new Object[1];
                                                            objectArray[0] = l8;
                                                            callSite13 = _8G.f("\u00c0", (Object)callSite12, (Object)objectArray, -6662355809467062052L, (long)l2);
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _8G.a(matchException);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                if (callSite13 == false) break block141;
                                                                g = this;
                                                                if (!bl2) break block142;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _8G.a(matchException);
                                                            }
                                                            if (_8G.f("C", (Object)g, -6662073760703626112L, (long)l2) < 0) break block141;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _8G.a(matchException);
                                                        }
                                                        Object[] objectArray = new Object[1];
                                                        objectArray[0] = l4;
                                                        _8G.f("\u00f1", (Object)((_9c_0)((Object)_8G.f("\u00c0", (Object)_8G.f("C", (Object)this, -6663827816182039561L, (long)l2), (int)_8G.f("C", (Object)this, -6662073760703626112L, (long)l2), -6656999531299744157L, (long)l2))), (String)((Object)_8G.f("\u00c0", (Object)_8G.f("\u00c0", (Object)_8G.f("C", (Object)this, -6663173243552511126L, (long)l2), (Object)objectArray, -6665108383656642677L, (long)l2), -6663256066259936320L, (long)l2)), -6662538961277861333L, (long)l2);
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _8G.a(matchException);
                                                    }
                                                }
                                                _8G.f("\u00f1", (Object)this, (int)n, -6662073760703626112L, (long)l2);
                                                Object[] objectArray = new Object[2];
                                                objectArray[1] = _8G.f("C", (Object)((_9c_0)((Object)_8G.f("\u00c0", (Object)_8G.f("C", (Object)this, -6663827816182039561L, (long)l2), (int)n, -6656999531299744157L, (long)l2))), -6662538961277861333L, (long)l2);
                                                objectArray[0] = l7;
                                                _8G.f("\u00c0", (Object)_8G.f("C", (Object)this, -6663173243552511126L, (long)l2), (Object)objectArray, -6662122024783494025L, (long)l2);
                                                Object[] objectArray10 = new Object[1];
                                                objectArray10[0] = l5;
                                                _8G.f("\u00c0", (Object)_8G.f("C", (Object)this, -6663173243552511126L, (long)l2), (Object)objectArray10, -6664017140160585828L, (long)l2);
                                                g = this;
                                            }
                                            callSite12 = _8G.f("C", (Object)g, -6663173243552511126L, (long)l2);
                                        }
                                        Object[] objectArray = new Object[2];
                                        objectArray[1] = l3;
                                        objectArray[0] = true;
                                        _8G.f("\u00c0", (Object)callSite12, (Object)objectArray, -6664809346158008546L, (long)l2);
                                    }
                                    object2 = true;
                                }
                                return (boolean)object2;
                            }
                            ++n;
                        }
                        if (bl2) continue;
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l8;
                    object = _8G.f("\u00c0", (Object)_8G.f("C", (Object)this, -6663173243552511126L, (long)l2), (Object)objectArray, -6662355809467062052L, (long)l2);
                }
                try {
                    try {
                        try {
                            try {
                                if (!bl2) break block143;
                                if (object == false) break block144;
                            }
                            catch (MatchException matchException) {
                                throw _8G.a(matchException);
                            }
                            object = _8G.f("C", (Object)this, -6662073760703626112L, (long)l2);
                            if (!bl2) break block143;
                        }
                        catch (MatchException matchException) {
                            throw _8G.a(matchException);
                        }
                        if (object < 0) break block144;
                    }
                    catch (MatchException matchException) {
                        throw _8G.a(matchException);
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l4;
                    _8G.f("\u00f1", (Object)((_9c_0)((Object)_8G.f("\u00c0", (Object)_8G.f("C", (Object)this, -6663827816182039561L, (long)l2), (int)_8G.f("C", (Object)this, -6662073760703626112L, (long)l2), -6656999531299744157L, (long)l2))), (String)((Object)_8G.f("\u00c0", (Object)_8G.f("\u00c0", (Object)_8G.f("C", (Object)this, -6663173243552511126L, (long)l2), (Object)objectArray, -6665108383656642677L, (long)l2), -6663256066259936320L, (long)l2)), -6662538961277861333L, (long)l2);
                    Object[] objectArray11 = new Object[2];
                    objectArray11[1] = l3;
                    objectArray11[0] = false;
                    _8G.f("\u00c0", (Object)_8G.f("C", (Object)this, -6663173243552511126L, (long)l2), (Object)objectArray11, -6664809346158008546L, (long)l2);
                    _8G.f("\u00f1", (Object)this, (int)_8G.d("d", 24450, (long)(0x2B25B569314F1100L ^ l2)), -6662073760703626112L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _8G.a(matchException);
                }
            }
            _8G.f("\u00f1", (Object)this, (int)_8G.d("d", 24450, (long)(0x2B25B569314F1100L ^ l2)), -6664427449989440595L, (long)l2);
            object = super.method_25402(class_119092, bl);
        }
        return (boolean)object;
    }

    private void void_9(Object[] objectArray) {
        block21: {
            CallSite callSite;
            boolean bl;
            int n;
            int n2;
            int n3;
            long l2;
            long l3;
            block19: {
                Object object;
                long l4;
                block20: {
                    CallSite callSite2;
                    block18: {
                        l3 = (Long)objectArray[0];
                        long l5 = l3 = b ^ l3;
                        l4 = l5 ^ 0x77B5ED3BAE6EL;
                        long l6 = l5 ^ 0x9C2AF161D8CL;
                        l2 = l5 ^ 0x7E19EAF72126L;
                        long l7 = l5 ^ 0x54788D628B08L;
                        n3 = (int)(l7 >>> 48);
                        n2 = (int)(l7 << 16 >>> 32);
                        n = (int)(l7 << 48 >>> 48);
                        bl = _02.cfr_renamed_2();
                        try {
                            try {
                                try {
                                    Object[] objectArray2 = new Object[1];
                                    objectArray2[0] = l6;
                                    callSite2 = _8G.f("\u00c0", (Object)_8G.f("C", (Object)this, -9087476188382467825L, (long)l3), (Object)objectArray2, -9083790128459380039L, (long)l3);
                                    if (bl) break block18;
                                    if (callSite2 == false) break block19;
                                }
                                catch (MatchException matchException) {
                                    throw _8G.a(matchException);
                                }
                                object = this;
                                if (bl) break block20;
                            }
                            catch (MatchException matchException) {
                                throw _8G.a(matchException);
                            }
                            callSite2 = _8G.f("C", (Object)object, -9084072129715935515L, (long)l3);
                        }
                        catch (MatchException matchException) {
                            throw _8G.a(matchException);
                        }
                    }
                    try {
                        if (callSite2 < 0) break block19;
                        object = _8G.f("\u00c0", (Object)_8G.f("C", (Object)this, -9088202091258439278L, (long)l3), (int)_8G.f("C", (Object)this, -9084072129715935515L, (long)l3), -9081229907876252666L, (long)l3);
                    }
                    catch (MatchException matchException) {
                        throw _8G.a(matchException);
                    }
                }
                Object[] objectArray3 = new Object[1];
                objectArray3[0] = l4;
                _8G.f("\u00f1", (Object)((_9c_0)object), (String)((Object)_8G.f("\u00c0", (Object)_8G.f("\u00c0", (Object)_8G.f("C", (Object)this, -9087476188382467825L, (long)l3), (Object)objectArray3, -9086666955030211090L, (long)l3), -9087647941676353115L, (long)l3)), -9084741571586596786L, (long)l3);
            }
            ArrayList arrayList = new ArrayList();
            CallSite callSite3 = _8G.f("\u00c0", (Object)_8G.f("C", (Object)this, -9088202091258439278L, (long)l3), -9084031181295602445L, (long)l3);
            block14: while (_8G.f("\u00c0", (Object)callSite3, -9083875335401754874L, (long)l3) != false) {
                callSite = _8G.f("\u00c0", (Object)callSite3, -9081468385055883435L, (long)l3);
                do {
                    boolean bl2;
                    block23: {
                        block22: {
                            _9c_0 c_0 = (_9c_0)((Object)callSite);
                            try {
                                Object object;
                                try {
                                    try {
                                        object = bl;
                                        if (l3 >= 0L) {
                                            if (object) break block21;
                                            object = _8G.f("\u00c0", (Object)_8G.f("C", (Object)c_0, -9084741571586596786L, (long)l3), -9086806752389064626L, (long)l3);
                                        }
                                        if (bl) break block22;
                                    }
                                    catch (MatchException matchException) {
                                        throw _8G.a(matchException);
                                    }
                                    if (l3 <= 0L) break block23;
                                    if (!object) {
                                    }
                                    break block22;
                                }
                                catch (MatchException matchException) {
                                    throw _8G.a(matchException);
                                }
                                object = _8G.f("\u00c0", arrayList, (Object)new _8j(l2, (String)((Object)_8G.f("C", (Object)c_0, -9084741571586596786L, (long)l3)), (int)_8G.f("C", (Object)c_0, -9086884393131630999L, (long)l3)), -9087325027890404711L, (long)l3);
                            }
                            catch (MatchException matchException) {
                                throw _8G.a(matchException);
                            }
                        }
                        bl2 = bl;
                    }
                    if (!bl2) continue block14;
                    Object[] objectArray4 = new Object[4];
                    objectArray4[3] = n;
                    objectArray4[2] = n2;
                    objectArray4[1] = (int)((short)n3);
                    objectArray4[0] = arrayList;
                    _8G.f("\u00c0", (Object)_8G.f("C", (Object)this, -9081415960580165195L, (long)l3), (Object)objectArray4, -9086104700426748767L, (long)l3);
                    callSite = _8G.f("\u00de", -9084479574136761098L, (long)l3);
                } while (l3 <= 0L);
            }
            _8G.f("\u00c0", (Object)callSite, (Object)_8G.f("C", (Object)_8G.f("\u00de", -9084779679238484040L, (long)l3), -9080726259354852322L, (long)l3), -9086260932703050955L, (long)l3);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void cfr_renamed_4(Object[] var1_1) {
        block14: {
            block15: {
                var3_2 = (Long)var1_1[0];
                var2_3 = (Integer)var1_1[1];
                var5_4 = (Integer)var1_1[2];
                var3_2 = _8G.b ^ var3_2;
                var6_5 = _02.cfr_renamed_3();
                try {
                    try {
                        v0 = var2_3;
                        if (!var6_5) break block14;
                        if (v0 != -1) break block15;
                    }
                    catch (MatchException v1) {
                        throw _8G.a(v1);
                    }
                    return;
                }
                catch (MatchException v2) {
                    throw _8G.a(v2);
                }
            }
            v0 = var7_6 = 0;
        }
        while (var7_6 < _8G.f("\u00c0", (Object)_8G.f("C", (Object)this, (long)-8179815805180570103L, (long)var3_2), (long)-8179980255131449310L, (long)var3_2)) {
            block17: {
                block18: {
                    block19: {
                        block16: {
                            try {
                                try {
                                    try {
                                        v3 /* !! */  = var7_6;
                                        v4 = var5_4;
                                        if (var3_2 < 0L || !var6_5) break block16;
                                        if (v3 /* !! */  == v4) break block17;
                                    }
                                    catch (MatchException v5) {
                                        throw _8G.a(v5);
                                    }
                                    v6 = (_9c_0)_8G.f("\u00c0", (Object)_8G.f("C", (Object)this, (long)-8179815805180570103L, (long)var3_2), (int)var7_6, (long)-8186505053689611363L, (long)var3_2);
                                    v7 = var6_5;
                                    if (var3_2 <= 0L) break block18;
                                    if (v7 == 0) break block19;
                                }
                                catch (MatchException v8) {
                                    throw _8G.a(v8);
                                }
                                v3 /* !! */  = (int)_8G.f("C", (Object)v6, (long)-8178631148380155406L, (long)var3_2);
                                v4 = var2_3;
                            }
                            catch (MatchException v9) {
                                throw _8G.a(v9);
                            }
                        }
                        try {
                            if (v3 /* !! */  != v4) break block17;
                            v6 = (_9c_0)_8G.f("\u00c0", (Object)_8G.f("C", (Object)this, (long)-8179815805180570103L, (long)var3_2), (int)var7_6, (long)-8186505053689611363L, (long)var3_2);
                        }
                        catch (MatchException v10) {
                            throw _8G.a(v10);
                        }
                    }
                    v7 = _8G.d("d", (int)24450, (long)(3109052043504073982L ^ var3_2));
                }
                _8G.f("\u00f1", (Object)v6, (int)v7, (long)-8178631148380155406L, (long)var3_2);
            }
            ++var7_6;
lbl57:
            // 2 sources

            ** while (!var6_5)
lbl58:
            // 1 sources

        }
lbl59:
        // 2 sources

        if (var3_2 <= 0L) ** GOTO lbl57
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean method_25404(class_11908 class_119082) {
        CallSite callSite;
        block57: {
            long l2;
            long l3;
            block58: {
                Object object;
                block59: {
                    long l4;
                    block60: {
                        boolean bl;
                        long l5;
                        block56: {
                            block52: {
                                long l6;
                                block53: {
                                    Object object2;
                                    block54: {
                                        long l7;
                                        block55: {
                                            CallSite callSite2;
                                            block46: {
                                                block44: {
                                                    block45: {
                                                        block49: {
                                                            Object object3;
                                                            block50: {
                                                                CallSite callSite3;
                                                                CallSite callSite4;
                                                                long l8;
                                                                block47: {
                                                                    long l9 = l3 = b ^ 0x30D4A1BD7C38L;
                                                                    l8 = l9 ^ 0x26283B77F255L;
                                                                    l5 = l9 ^ 0x1350B2F27EFEL;
                                                                    l6 = l9 ^ 0x6D27F0DFCD1CL;
                                                                    l7 = l9 ^ 0x6AAC48F5FDCEL;
                                                                    l4 = l9 ^ 0x5F51AA0E8407L;
                                                                    l2 = l9 ^ 0x68AC95A09EFDL;
                                                                    bl = _02.cfr_renamed_3();
                                                                    try {
                                                                        try {
                                                                            block48: {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        callSite = _8G.f("C", (Object)this, 5869947193657633112L, (long)l3);
                                                                                                        if (!bl) break block44;
                                                                                                        if (callSite < 0) break block45;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw _8G.a(matchException);
                                                                                                    }
                                                                                                    CallSite callSite2 = _8G.f("C", (Object)this, 5869947193657633112L, (long)l3);
                                                                                                    callSite2 = _8G.f("\u00c0", (Object)_8G.f("C", (Object)this, 5868292277798816002L, (long)l3), 5868743562948351785L, (long)l3);
                                                                                                    if (!bl) break block46;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw _8G.a(matchException);
                                                                                                }
                                                                                                if (callSite >= callSite2) break block45;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw _8G.a(matchException);
                                                                                            }
                                                                                            CallSite callSite3 = _8G.f("\u00c0", (Object)class_119082, 5868528878573051808L, (long)l3);
                                                                                            callSite3 = _8G.d("d", 338, (long)(0xC5CB0290B573D3FL ^ l3));
                                                                                            if (!bl) break block47;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw _8G.a(matchException);
                                                                                        }
                                                                                        if (callSite4 != callSite3) break block48;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw _8G.a(matchException);
                                                                                    }
                                                                                    _8G.f("\u00f1", (Object)this, (int)_8G.d("d", 18153, (long)(0x24DD45F78D3BFA82L ^ l3)), 5869947193657633112L, (long)l3);
                                                                                    if (bl) break block49;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw _8G.a(matchException);
                                                                                }
                                                                            }
                                                                            object3 = class_119082;
                                                                            if (!bl) break block50;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw _8G.a(matchException);
                                                                        }
                                                                        CallSite callSite3 = _8G.f("\u00c0", (Object)object3, 5868528878573051808L, (long)l3);
                                                                        callSite3 = _8G.d("d", 622, (long)(0x799809A04C603E2AL ^ l3));
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw _8G.a(matchException);
                                                                    }
                                                                }
                                                                try {
                                                                    block51: {
                                                                        try {
                                                                            if (callSite4 != callSite3) break block51;
                                                                            _8G.f("\u00f1", (Object)((_9c_0)((Object)_8G.f("\u00c0", (Object)_8G.f("C", (Object)this, 5868292277798816002L, (long)l3), (int)_8G.f("C", (Object)this, 5869947193657633112L, (long)l3), 5866107179066991766L, (long)l3))), (int)_8G.d("d", 24450, (long)(0x2B25BA3D5D08E3F5L ^ l3)), 5869459342806273785L, (long)l3);
                                                                            _8G.f("\u00f1", (Object)this, (int)_8G.d("d", 24450, (long)(0x2B25BA3D5D08E3F5L ^ l3)), 5869947193657633112L, (long)l3);
                                                                            if (bl) break block49;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw _8G.a(matchException);
                                                                        }
                                                                    }
                                                                    Object[] objectArray = new Object[3];
                                                                    objectArray[2] = (int)_8G.f("C", (Object)this, 5869947193657633112L, (long)l3);
                                                                    objectArray[1] = (int)_8G.f("\u00c0", (Object)class_119082, 5868528878573051808L, (long)l3);
                                                                    objectArray[0] = l8;
                                                                    _8G.f("\u00c0", (Object)this, (Object)objectArray, 5870043549324471086L, (long)l3);
                                                                    object3 = _8G.f("\u00c0", (Object)_8G.f("C", (Object)this, 5868292277798816002L, (long)l3), (int)_8G.f("C", (Object)this, 5869947193657633112L, (long)l3), 5866107179066991766L, (long)l3);
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw _8G.a(matchException);
                                                                }
                                                            }
                                                            _8G.f("\u00f1", (Object)((_9c_0)object3), (int)_8G.f("\u00c0", (Object)class_119082, 5868528878573051808L, (long)l3), 5869459342806273785L, (long)l3);
                                                            _8G.f("\u00f1", (Object)this, (int)_8G.d("d", 24450, (long)(0x2B25BA3D5D08E3F5L ^ l3)), 5869947193657633112L, (long)l3);
                                                        }
                                                        return true;
                                                    }
                                                    callSite = _8G.f("\u00c0", (Object)class_119082, 5868528878573051808L, (long)l3);
                                                }
                                                try {
                                                    if (!bl) break block52;
                                                    callSite2 = _8G.d("d", 5979, (long)(0x4523A921A329AB1AL ^ l3));
                                                }
                                                catch (MatchException matchException) {
                                                    throw _8G.a(matchException);
                                                }
                                            }
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (callSite != callSite2) break block53;
                                                                Object[] objectArray = new Object[1];
                                                                objectArray[0] = l6;
                                                                object2 = _8G.f("\u00c0", (Object)_8G.f("C", (Object)this, 5868938431218694559L, (long)l3), (Object)objectArray, 5872555258809637417L, (long)l3);
                                                                if (!bl) break block54;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _8G.a(matchException);
                                                            }
                                                            if (object2 == false) break block55;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _8G.a(matchException);
                                                        }
                                                        object2 = _8G.f("C", (Object)this, 5872272123967878773L, (long)l3);
                                                        if (!bl) break block54;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _8G.a(matchException);
                                                    }
                                                    if (object2 < 0) break block55;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _8G.a(matchException);
                                                }
                                                Object[] objectArray = new Object[1];
                                                objectArray[0] = l5;
                                                _8G.f("\u00f1", (Object)((_9c_0)((Object)_8G.f("\u00c0", (Object)_8G.f("C", (Object)this, 5868292277798816002L, (long)l3), (int)_8G.f("C", (Object)this, 5872272123967878773L, (long)l3), 5866107179066991766L, (long)l3))), (String)((Object)_8G.f("\u00c0", (Object)_8G.f("\u00c0", (Object)_8G.f("C", (Object)this, 5868938431218694559L, (long)l3), (Object)objectArray, 5869818044505458046L, (long)l3), 5868846435937282357L, (long)l3)), 5871822315617169630L, (long)l3);
                                            }
                                            catch (MatchException matchException) {
                                                throw _8G.a(matchException);
                                            }
                                        }
                                        Object[] objectArray = new Object[1];
                                        objectArray[0] = l7;
                                        _8G.f("\u00c0", (Object)this, (Object)objectArray, 5872344243180048807L, (long)l3);
                                        object2 = true;
                                    }
                                    return (boolean)object2;
                                }
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l6;
                                callSite = _8G.f("\u00c0", (Object)_8G.f("C", (Object)this, 5868938431218694559L, (long)l3), (Object)objectArray, 5872555258809637417L, (long)l3);
                            }
                            try {
                                if (!bl) break block56;
                                if (callSite == false) {
                                    return super.method_25404(class_119082);
                                }
                            }
                            catch (MatchException matchException) {
                                throw _8G.a(matchException);
                            }
                            callSite = _8G.f("\u00c0", (Object)class_119082, 5868528878573051808L, (long)l3);
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (!bl) break block57;
                                        if (callSite != _8G.d("d", 7482, (long)(0x12058D2A53DAA141L ^ l3))) break block58;
                                    }
                                    catch (MatchException matchException) {
                                        throw _8G.a(matchException);
                                    }
                                    object = _8G.f("C", (Object)this, 5872272123967878773L, (long)l3);
                                    if (!bl) break block59;
                                }
                                catch (MatchException matchException) {
                                    throw _8G.a(matchException);
                                }
                                if (object < 0) break block60;
                            }
                            catch (MatchException matchException) {
                                throw _8G.a(matchException);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l5;
                            _8G.f("\u00f1", (Object)((_9c_0)((Object)_8G.f("\u00c0", (Object)_8G.f("C", (Object)this, 5868292277798816002L, (long)l3), (int)_8G.f("C", (Object)this, 5872272123967878773L, (long)l3), 5866107179066991766L, (long)l3))), (String)((Object)_8G.f("\u00c0", (Object)_8G.f("\u00c0", (Object)_8G.f("C", (Object)this, 5868938431218694559L, (long)l3), (Object)objectArray, 5869818044505458046L, (long)l3), 5868846435937282357L, (long)l3)), 5871822315617169630L, (long)l3);
                        }
                        catch (MatchException matchException) {
                            throw _8G.a(matchException);
                        }
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l4;
                    objectArray[0] = false;
                    _8G.f("\u00c0", (Object)_8G.f("C", (Object)this, 5868938431218694559L, (long)l3), (Object)objectArray, 5869554131782047211L, (long)l3);
                    _8G.f("\u00f1", (Object)this, (int)_8G.d("d", 24450, (long)(0x2B25BA3D5D08E3F5L ^ l3)), 5872272123967878773L, (long)l3);
                    object = true;
                }
                return (boolean)object;
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = l2;
            objectArray[0] = class_119082;
            callSite = _8G.f("\u00c0", (Object)_8G.f("C", (Object)this, 5868938431218694559L, (long)l3), (Object)objectArray, 5870110406814600897L, (long)l3);
        }
        return (boolean)callSite;
    }

    public boolean method_25400(class_11905 class_119052) {
        CallSite callSite;
        block10: {
            long l2;
            long l3;
            block11: {
                boolean bl;
                block8: {
                    long l4;
                    block9: {
                        long l5 = l3 = b ^ 0x2A22C5EFC039L;
                        l4 = l5 ^ 0x77D1948D711DL;
                        l2 = l5 ^ 0x1628FE3A2EE4L;
                        bl = _02.cfr_renamed_2();
                        try {
                            try {
                                callSite = _8G.f("C", (Object)this, -1335555706571385511L, (long)l3);
                                if (bl) break block8;
                                if (callSite < 0) break block9;
                            }
                            catch (MatchException matchException) {
                                throw _8G.a(matchException);
                            }
                            return true;
                        }
                        catch (MatchException matchException) {
                            throw _8G.a(matchException);
                        }
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l4;
                    callSite = _8G.f("\u00c0", (Object)_8G.f("C", (Object)this, -1336528268878215778L, (long)l3), (Object)objectArray, -1333457935201606104L, (long)l3);
                }
                try {
                    try {
                        if (bl) break block10;
                        if (callSite != false) break block11;
                    }
                    catch (MatchException matchException) {
                        throw _8G.a(matchException);
                    }
                    return super.method_25400(class_119052);
                }
                catch (MatchException matchException) {
                    throw _8G.a(matchException);
                }
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = class_119052;
            objectArray[0] = l2;
            callSite = _8G.f("\u00c0", (Object)_8G.f("C", (Object)this, -1336528268878215778L, (long)l3), (Object)objectArray, -1339278505878415216L, (long)l3);
        }
        return (boolean)callSite;
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        long l2 = b ^ 0x1F7485D61D4L;
        CallSite callSite = _8G.f("\u00d2", 0, (int)(_8G.f("\u00c0", (Object)_8G.f("C", (Object)this, 5520407776569709806L, (long)l2), 5520786485324122821L, (long)l2) * _8G.d("d", 16003, (long)(0x34EA0EBE3A301F10L ^ l2)) - _8G.d("d", 20211, (long)(0x77DD4317E53AEF50L ^ l2))), 5514415673777034826L, (long)l2);
        _8G.f("\u00f1", (Object)this, (float)((float)_8G.f("\u00d2", 0.0, (double)_8G.f("\u00d2", (double)((double)callSite), (double)((double)_8G.f("C", (Object)this, 5517117468475190016L, (long)l2) - d4 * 20.0), 5520437481113741365L, (long)l2), 5520027045498051536L, (long)l2)), 5517117468475190016L, (long)l2);
        return true;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        _8G.b = dev.krypton.l.a(8866284793857547678L, -3490596479177101941L, MethodHandles.lookup().lookupClass()).a(67042611615414L);
                        _8G.q = new Object[112];
                        _8G.r = new String[112];
                        _8G.b();
                        _8G.h = new HashMap<K, V>(13);
                        var11 = _8G.b ^ 88117060643416L;
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
                        var20_3 = new String[10];
                        var18_4 = 0;
                        var17_5 = "\u009bh\u0090\u00c8,B F\u00d5\u00f2Y\u00c8L\u0095\u0089K\u00c7J~\u00a9\u00bc\u00b5\u00a96 )\u00ccN0V6\bo\u001e^\u00c9\u009f\u00d5!\u00a6\u0019b\u00f4\u0016\u00f5r\u000e/\u00f5U`a]\u00cbYu\u00ca\u0010\u008c&3&6\u0002s\u00a9R\\]M<\u00cf\u009c\u00de\u0010\u0011\u00bf\u0095<\u009c\u009e\u00aa\u00c8v>ybe\u00eaL\u00cc\u0018\u008bd \u00e4bJ\u00e9O\u0089\u000e\u009f\u00bcCN\u0003\u00b43\u00e3\u000b\u00dc=\u0016\u00c7\r\u0018\u009a\u00ca\u0082\u000e\u00ec\u0082\u0006\u00dd\u000b\\`\u00c1J\u00a0\u00a1\u000f\u001f\u008bz\u0086\u00c0\u00b9^d\u0010\u0092\u00a8\u00d4_%\u00f7yPf\u00a5\u00cf W\u0015ND\u0010\u00a1\u00e4w&\u0000\u001b\u00c5\u001337\u0011\u00d9Ml\u00ac\u00dc";
                        var19_6 = "\u009bh\u0090\u00c8,B F\u00d5\u00f2Y\u00c8L\u0095\u0089K\u00c7J~\u00a9\u00bc\u00b5\u00a96 )\u00ccN0V6\bo\u001e^\u00c9\u009f\u00d5!\u00a6\u0019b\u00f4\u0016\u00f5r\u000e/\u00f5U`a]\u00cbYu\u00ca\u0010\u008c&3&6\u0002s\u00a9R\\]M<\u00cf\u009c\u00de\u0010\u0011\u00bf\u0095<\u009c\u009e\u00aa\u00c8v>ybe\u00eaL\u00cc\u0018\u008bd \u00e4bJ\u00e9O\u0089\u000e\u009f\u00bcCN\u0003\u00b43\u00e3\u000b\u00dc=\u0016\u00c7\r\u0018\u009a\u00ca\u0082\u000e\u00ec\u0082\u0006\u00dd\u000b\\`\u00c1J\u00a0\u00a1\u000f\u001f\u008bz\u0086\u00c0\u00b9^d\u0010\u0092\u00a8\u00d4_%\u00f7yPf\u00a5\u00cf W\u0015ND\u0010\u00a1\u00e4w&\u0000\u001b\u00c5\u001337\u0011\u00d9Ml\u00ac\u00dc".length();
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
                            var20_3[var18_4++] = _8G.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00a0\u00b1\u00f05\u00ffA\u00b46\u00f2\u00e68m\fW\u00e0\u00cb\u0010)\u001dT\u001b\t\u00a2\u001f\u00f5\u00c42O&\u00c6\u00fa\u00b8\u00b1";
                            var19_6 = "\u00a0\u00b1\u00f05\u00ffA\u00b46\u00f2\u00e68m\fW\u00e0\u00cb\u0010)\u001dT\u001b\t\u00a2\u001f\u00f5\u00c42O&\u00c6\u00fa\u00b8\u00b1".length();
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
                            var20_3[var18_4++] = _8G.b(var21_9).intern();
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
                _8G.f = var20_3;
                _8G.g = new String[10];
                _8G.n = new HashMap<K, V>(13);
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
                var6_12 = new long[60];
                var3_13 = 0;
                var4_14 = "\u00ff\u0088Xs\u00a91\u001bip\u008f\u00bb\u00efh\u0007\u00c6\u00bade]\u00f9\u00a7\u00e9\u00de\u00c6NJ\u00a6\u00e2\u0081\u00eb\u00ddl\u00b0\u0084o\u00c4>Hk\u00f8\u0011\u0092\u0019\u0006\u009aZ\u008a\u008eJFbE2\u00ea\u00c7\u0082d\u00f7\u008f\u00deG\u0087\u00cf\u00b0\u00a82\u0010J\u008eZ\u00a3\n\u008a\u00edg\u00f1\u008a\u00b7\u00a9\u00e6\u009a\u00be\u00cd\u00e5\u00f6\u00a5\u00194\u009b'\u00b8\u00f7\u0087h\u00caq\u0011\n)\u00a9\u00f8\u0092\u00d5\u00d4\u00d9\u00cd\u00a6\u00e4\u009aMf4\u00a3\u00a4\u00db\u00c7\t\u00d5\u0018\u00a5@)\u00b5B\u00cf\u0018\u0084\u00f1\u00d8\u0003\u00d4nW\u00be\r\u00d7:\u00f7\u00aa7\u0087EG\u00c4&\u00c8\u001b\u00f8\u00c9\u00a6\u000e\u008e\u00ec\u00b1\u00e0\u00d2\u008a\u00d5\u00ed\u00947\u001e]\u00cc\u00c3a\u0019\u0002\u00cb\u00df\u00ab\u009d\u00b1\u0098$\u0089\u00cd\u00f1\u008ac\u00aa^\u008ap\u00b2\u00fb\u001b?\u00d3\u00b9g\u00c6O\u001f\u00ea\u00d2\u0085\u0095\u0095#\u000b\u00ed>t\u000f\u00d2\u0016\u0095\u00eb\u00e7\u00a4\u0000\u00a6\u00b8Xx\f\u00a5!E\u00ca\u0004\u0092r\u00a6\u00a8\u0007\u009f\u001f\u00c6\u00c6\u00cb\u00d8\u00e5f\u008c\u00f9\u00da)\u00c0\u0092\u0014\u0084!\u001f`SsQ\u0092\u0083\u009e\u00d4\u00f4\u00e5\u0002\u001eR\u00a3\u00d9\u00a3\u007f(\u00ce\u009b\u00fc\u00cd&,/\u00c3\u0089\u00e3\u00b7jJG\u008agl\u0087*\u00a4\u00den*\t\u00dbDt\u00e5\u00ab\u00e4O\u00d1\u0088\u0080:\u00dd\u00b1?\u009f*\u00dd5jw9\u00ad\u00ce\u00ec\u00b6\u00d0\u0013\u0015J\u00fe\u001e\u0010)\u000f\u00fb\u00e7\u00b8_\u00c3\u00cd\u00a7\u00c6\u00ab\u00c8@\u00b4@\u0091\u0011,\u0098\t\u00972\u00aad\b4\u009a\u00f2\u00cc\u00fa\u00b1\u00d9\u00e4\u00f2\u00a6<p\u008d\u00dd\u00a3+t\u0095B.\u0012\u00ea\u00f4\u0090\u00b4\u00c6Ku\u0018\u0012\u008a\u0004\u00f3<Wv\u00a3\u00ce\u0089\u0012>\u00c8\u0093\u00f0\u0015xp\u00ea\u00bf\u00c6\u00ec\u00bbbr\u0083\u00b6\ty\t\u001dCu\u00c7\u00d7\u0087\u0013\u0095\u009eJ\u00bcQ1\u00ef9\u0086\n\u0014B\u00e0?`v\u00cb\u001b\u00be\u00aat\u0083\u00c3/\u00e9~\u00f1\u00e8\u0085\u00a4\u00d0e7\u0014\u0083\u00d4@\u00b7\u009e\u00d77\u008a\u00a4|\u0005\u0014\u00d3\u00f8\u0080\u00e1\n\u00edn\r";
                var5_15 = "\u00ff\u0088Xs\u00a91\u001bip\u008f\u00bb\u00efh\u0007\u00c6\u00bade]\u00f9\u00a7\u00e9\u00de\u00c6NJ\u00a6\u00e2\u0081\u00eb\u00ddl\u00b0\u0084o\u00c4>Hk\u00f8\u0011\u0092\u0019\u0006\u009aZ\u008a\u008eJFbE2\u00ea\u00c7\u0082d\u00f7\u008f\u00deG\u0087\u00cf\u00b0\u00a82\u0010J\u008eZ\u00a3\n\u008a\u00edg\u00f1\u008a\u00b7\u00a9\u00e6\u009a\u00be\u00cd\u00e5\u00f6\u00a5\u00194\u009b'\u00b8\u00f7\u0087h\u00caq\u0011\n)\u00a9\u00f8\u0092\u00d5\u00d4\u00d9\u00cd\u00a6\u00e4\u009aMf4\u00a3\u00a4\u00db\u00c7\t\u00d5\u0018\u00a5@)\u00b5B\u00cf\u0018\u0084\u00f1\u00d8\u0003\u00d4nW\u00be\r\u00d7:\u00f7\u00aa7\u0087EG\u00c4&\u00c8\u001b\u00f8\u00c9\u00a6\u000e\u008e\u00ec\u00b1\u00e0\u00d2\u008a\u00d5\u00ed\u00947\u001e]\u00cc\u00c3a\u0019\u0002\u00cb\u00df\u00ab\u009d\u00b1\u0098$\u0089\u00cd\u00f1\u008ac\u00aa^\u008ap\u00b2\u00fb\u001b?\u00d3\u00b9g\u00c6O\u001f\u00ea\u00d2\u0085\u0095\u0095#\u000b\u00ed>t\u000f\u00d2\u0016\u0095\u00eb\u00e7\u00a4\u0000\u00a6\u00b8Xx\f\u00a5!E\u00ca\u0004\u0092r\u00a6\u00a8\u0007\u009f\u001f\u00c6\u00c6\u00cb\u00d8\u00e5f\u008c\u00f9\u00da)\u00c0\u0092\u0014\u0084!\u001f`SsQ\u0092\u0083\u009e\u00d4\u00f4\u00e5\u0002\u001eR\u00a3\u00d9\u00a3\u007f(\u00ce\u009b\u00fc\u00cd&,/\u00c3\u0089\u00e3\u00b7jJG\u008agl\u0087*\u00a4\u00den*\t\u00dbDt\u00e5\u00ab\u00e4O\u00d1\u0088\u0080:\u00dd\u00b1?\u009f*\u00dd5jw9\u00ad\u00ce\u00ec\u00b6\u00d0\u0013\u0015J\u00fe\u001e\u0010)\u000f\u00fb\u00e7\u00b8_\u00c3\u00cd\u00a7\u00c6\u00ab\u00c8@\u00b4@\u0091\u0011,\u0098\t\u00972\u00aad\b4\u009a\u00f2\u00cc\u00fa\u00b1\u00d9\u00e4\u00f2\u00a6<p\u008d\u00dd\u00a3+t\u0095B.\u0012\u00ea\u00f4\u0090\u00b4\u00c6Ku\u0018\u0012\u008a\u0004\u00f3<Wv\u00a3\u00ce\u0089\u0012>\u00c8\u0093\u00f0\u0015xp\u00ea\u00bf\u00c6\u00ec\u00bbbr\u0083\u00b6\ty\t\u001dCu\u00c7\u00d7\u0087\u0013\u0095\u009eJ\u00bcQ1\u00ef9\u0086\n\u0014B\u00e0?`v\u00cb\u001b\u00be\u00aat\u0083\u00c3/\u00e9~\u00f1\u00e8\u0085\u00a4\u00d0e7\u0014\u0083\u00d4@\u00b7\u009e\u00d77\u008a\u00a4|\u0005\u0014\u00d3\u00f8\u0080\u00e1\n\u00edn\r".length();
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
                    var4_14 = "\u00b3\u00c3\u00c7O\u008c\u00c7\u00df0k\u00aee\u001f+\u00e9\t\u001f";
                    var5_15 = "\u00b3\u00c3\u00c7O\u008c\u00c7\u00df0k\u00aee\u001f+\u00e9\t\u001f".length();
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
        _8G.l = var6_12;
        _8G.m = new Integer[60];
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
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x2FB6;
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
                throw new RuntimeException("dev/krypton/8G", exception);
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
            _8G.g[n2] = _8G.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _8G.b(n, l2);
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
            throw new RuntimeException("dev/krypton/8G" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int d(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x6D05;
        if (m[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = l[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])_8G.n.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    _8G.n.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/8G", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _8G.m[n2] = n3;
        }
        return m[n2];
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _8G.d(n, l2);
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
            throw new RuntimeException("dev/krypton/8G" + " : " + string + " : " + methodType.toString(), exception);
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
            case 0 -> 20;
            case 1 -> 46;
            case 2 -> 4;
            case 3 -> 34;
            case 4 -> 15;
            case 5 -> 44;
            case 6 -> 36;
            case 7 -> 47;
            case 8 -> 23;
            case 9 -> 54;
            case 10 -> 33;
            case 11 -> 48;
            case 12 -> 37;
            case 13 -> 35;
            case 14 -> 19;
            case 15 -> 32;
            case 16 -> 50;
            case 17 -> 18;
            case 18 -> 52;
            case 19 -> 10;
            case 20 -> 59;
            case 21 -> 60;
            case 22 -> 45;
            case 23 -> 12;
            case 24 -> 29;
            case 25 -> 13;
            case 26 -> 6;
            case 27 -> 3;
            case 28 -> 26;
            case 29 -> 55;
            case 30 -> 0;
            case 31 -> 8;
            case 32 -> 38;
            case 33 -> 2;
            case 34 -> 9;
            case 35 -> 49;
            case 36 -> 53;
            case 37 -> 57;
            case 38 -> 28;
            case 39 -> 30;
            case 40 -> 22;
            case 41 -> 11;
            case 42 -> 25;
            case 43 -> 14;
            case 44 -> 1;
            case 45 -> 56;
            case 46 -> 39;
            case 47 -> 21;
            case 48 -> 63;
            case 49 -> 42;
            case 50 -> 7;
            case 51 -> 17;
            case 52 -> 61;
            case 53 -> 40;
            case 54 -> 41;
            case 55 -> 27;
            case 56 -> 62;
            case 57 -> 16;
            case 58 -> 5;
            case 59 -> 51;
            case 60 -> 24;
            case 61 -> 43;
            case 62 -> 58;
            default -> 31;
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
        _8G.r[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = q;
        q[0] = "gbLQ\n8zwN\u0010\u000fd:n";
        objectArray[1] = "\u0012-9K+Pg\r2D:\u001f\u0006\u00039O>Er";
        objectArray[2] = "Cv\u000b\u001ao9]~\u0011U\r%Zc";
        objectArray[3] = "Zc\u0017R\\<Gv\u0015\u0013Y`\u0006A";
        objectArray[4] = "|\"\u00073s^a7\u0005rv\u0002/\u0011";
        objectArray[5] = Integer.TYPE;
        _8G.r[5] = "java/lang/Integer";
        objectArray[6] = "C&>p>&].$?Y'L5)e\u007f!";
        objectArray[7] = "M7Z\u0015ViF8KZ7gM3O\u0000";
        objectArray[8] = Boolean.TYPE;
        _8G.r[8] = "java/lang/Boolean";
        objectArray[9] = "}\ti\u000b^x\b)b\u0004O7i'i\u000fKm\u001d";
        objectArray[10] = Void.TYPE;
        _8G.r[10] = "java/lang/Void";
        objectArray[11] = "I]A7@\u0003THCvE_\u0015R";
        objectArray[12] = "W\u0016D\u0012U\u0013\\\u0019U](\u000bO\u001e\\\u0014";
        objectArray[13] = Float.TYPE;
        _8G.r[13] = "java/lang/Float";
        objectArray[14] = "\fl\"XTD\u0007c3\u00177I\u0012e";
        objectArray[15] = Double.TYPE;
        _8G.r[15] = "java/lang/Double";
        objectArray[16] = "Og/?\"2Rr-~'n\u0012A";
        objectArray[17] = "\u001ft;z\u000bU\u0002a9;\u000e\tI";
        objectArray[18] = "\u001b,3_M\u001a\u000691\u001eHFF\u0004";
        objectArray[19] = "O^-McD:~&Br\u000b[p-IvQ/";
        objectArray[20] = "!\u001cdWERT<oXT\u001d52dSPGA";
        objectArray[21] = "{p\u00134 ]\u000eP\u0018;1\u0012o^\u001305H\u001b";
        objectArray[22] = "'*I\u0014'4'*^H+;=a^V+.:\u0010\u000e\u000bz";
        objectArray[23] = "\u0017Bi<+Z\u0017B~`'U\r\t~~'@\nx)!q";
        objectArray[24] = "HiznwiU|x/r5\u0014i";
        objectArray[25] = "&o\u001c\b;[;z\u001eI>\u0007zH";
        objectArray[26] = "BT.\u001cl_7t%\u0013}\u0010Vz.\u0018yJ\"";
        objectArray[27] = "'\n\u0018\u001b:X:\u001f\u001aZ?\u0004z$";
        objectArray[28] = "\u001en\u001c\u0010\"MkN\u0017\u001f3\u0002\n@\u001c\u00147X~";
        objectArray[29] = "\u0018\u0004U$M\u0019\u0005\u0011WeHEE(";
        objectArray[30] = "_V\fy\u0010\r*v\u0007v\u0001BKx\f}\u0005\u0018?";
        objectArray[31] = "~k0\u0010|\u0006\u000bK;\u001fmIjE0\u0014i\u0013\u001e";
        objectArray[32] = "pg;9iQ\u0005G06x\u001edI;=|D\u0010";
        objectArray[33] = "R)'\u007fg\u0013O<%>bO\u000e{";
        objectArray[34] = "^\u0017$Z4p+7/U%?J9$^!e>";
        objectArray[35] = "\u0010D`\u0019\t-edk\u0016\u0018b\u0004j`\u001d\u001c8p";
        objectArray[36] = "\u007f#sL>x\n\u0003xC/7k\rsH+m\u001f";
        objectArray[37] = "l\tGt\u001e@\u0019)L{\u000f\u000fx'Gp\u000bU\f";
        objectArray[38] = "\u0019\u00172dF1l79kW~\r92`S$y";
        objectArray[39] = "9V9X1FLv2W \t-x9\\$SY";
        objectArray[40] = ",\u001e\u0007D.I,\u001e\u0010\u0018\"F6U\u0010\u0006\"S1$B[z\u0010{";
        objectArray[41] = "A\u0010\u0006\\\u001f\u000040\rS\u000eOU>\u0006X\n\u0015!";
        objectArray[42] = "\u007ff^:w2\nFU5f}kH^>b'\u001f";
        objectArray[43] = "5rW*Y,@R\\%Hc!\\W.L9U";
        objectArray[44] = "Cq~d\u000f\u00016Quk\u001eNW_~`\u001a\u0014#";
        objectArray[45] = "IPH {0<pC/j\u007f]~H$n%)";
        objectArray[46] = "&&dE|\u001dS\u0006oJmR2\bdAi\bF";
        objectArray[47] = "~W~N=|~Wi\u00121sd\u001ci\f1fcm;Qi%(";
        objectArray[48] = "cJ!$^s\u0016j*+O<wd! Kf\u0003";
        objectArray[49] = "}f\n>Y\\\bF\u00011H\u0013iH\n:LI\u001d";
        objectArray[50] = "|M\u0000=O9eC\u0001:%z\u0017LG(F xNT3]";
        objectArray[51] = "\u001a\u001bF.FE\b\u0002\u0016m}\u001du\u0005\\lA_\u0017_\u001a9\u0003";
        objectArray[52] = "d*^w1f?8T\"\r}<&9(n}>hHu`!oV\u0002phsk'_~4\"UmZvf&$0T*7\u0018";
        objectArray[53] = "ckyP\u0003]qr)\u00138\u0002\fduD\t[e)!J\u0007<3$$M\u0005Nln&\u00128";
        objectArray[54] = "{{#\u000by\\ibsHB\u0007U\u0005\"\bx\u0001ogxN-C";
        objectArray[55] = "m\u0000\u00040@,\u007f\u0019Ts{u\u0002\u001e\u001erG6`DX'\u0005";
        objectArray[56] = "\u0016O0\u0012\u0006KA\u0016\u007f\u00036\u0018,O?O\nC\u0010Vj\u0003";
        objectArray[57] = "`4?<\u0018n=:oe}u1'(\u0004@(07;cBw2nT";
        objectArray[58] = "EB\u0005)\u0019\u001f\u0015\u0019\u000e\"h\u0002\u0011Y>)\u000b\b\u0017\u001bOt\u0005TF%\u0003)\u0004\r\u0013B\u0001v\u0006T|";
        objectArray[59] = "/v&G\t\txs\u007f\u0011lI\u0015zt\u0010]\u001f|7 \u001eSx(sw\u001b\r\u001bw0&\u0015l";
        objectArray[60] = ">#;KGEjp H8\u001f\u000e$ NS\u001c\u007fy.\u0012\u0002";
        objectArray[61] = "\u0010o\u0018<*\\\ni\u001e8A\ts#N,pR\u001an\u001a\"~5\u0013)\u0019|:WIoL>A";
        objectArray[62] = "]\u0019^R S\rBUYQ[\t\u001b\u0002\u0017<!_\u001d\u0000\u0002oP\u0002\u0013\\SQ\u001c_\u0012\u0005\u00066\u001e\u0000\u0010\\i";
        objectArray[63] = "\r\u0000_RDxZY\u0010Ct$7\u0013\u0002]E}^^VSK\u001a\f\u0001\nZJkQ\u000fV\u000bt";
        objectArray[64] = "fp\u001a\u001cd@1)U\rT\u0018\u001e\u0012\u0011\u001c1IbcL\u0012m\u0018";
        objectArray[65] = "\"\u0016N~/p0\u000f\u001e=\u0014/MSLc\u007f/<\u000eB?.";
        objectArray[66] = "xG\u0007NcE/\u001eH_S\u001fBTZAb@+\u0019\u000eOl'}\u0014\u000bHnU\"^\t\u0017S";
        objectArray[67] = "T^zia\r\u0003[#?\u0004DnR(>5\u001b\u0007\u001f|0;|S[+5e\u001f\f\u0018z;\u0004";
        objectArray[68] = "T?\u000eOK]\u000f-\u0004\u001awF\f3iAM\u001b\u0002sXJ\u0015\u001d\u0000C\u0003\u0011ODUr\bIIFe)S\u0013\u0010\u0013T\"\u000b\u0015\u0012#";
        objectArray[69] = "\u0005u^DFZ\reGS;\\\u0006f]]WnR'\u0005\u0005;V\u0002gF\u0006K\u0001\u000ewE:\u0004\bW\u007f\u0000H[BU =";
        objectArray[70] = "%A a*P;Db;W_ |)h;Q$\u0015d<5_CCi92]1\u001c#;m`";
        objectArray[71] = "p%L7\u0000\u000bip\u0000\u000bS7cw\u001e:\r^.#\u00104j\b#&\u00176\u0018Wi$H\u000b";
        objectArray[72] = "!L/\t\u0006\u001eaA+\u0000c\u001clG4\u0015\u0019\u0006wBOR\u0000\u0002z\u0013>\u000f\u000e^+-t\n\u0006\f/\\)\u0004Z]\u0011\u001d.\t\u0003\u0002h]#\r\ng";
        objectArray[73] = "h%m\u0007sQz<=DH\r\u0007*a\u0013yWng5\u001dw0<8i\u0014vAa65EH";
        objectArray[74] = "c\u0015QU\u001drg\rQP\"8\tOX\\I<x\u0012V\u0000\u0018";
        objectArray[75] = "}\u0019E(\u0014\u0004*\u001c\u001c~qMG\u0015\u0017\u007f@\u0012.XCqNuxUFvL\u0007'\u001fD)q";
        objectArray[76] = "xnf2gzfk$h\u001av\u001e\"s:+-wo'4%Jti&1*{\u007f1 3\u001a";
        objectArray[77] = "\u0014!Dy\u0011pT,@pth_\rAa\bx$}\\w\u0013hG\"\u001f&\u001d\t";
        objectArray[78] = "+W:Y`M|Rc\u000f\u0005\u0007\u0011[h\u000e4[x\u0016<\u0000:<.\u001b9\u00078NqQ;X\u0005";
        objectArray[79] = "\u0001W/5\u0010\u0014VRvcu^;[}bD\u0002R\u0016)lJe\u000bKpn\u0010\u001cKFtgu";
        objectArray[80] = "eNR\u0016mvtGB\u0015\f~xZT=0*.\u000f,\u00006-x\u000f\u001d\u000bn+z?";
        objectArray[81] = "\u0006j \f\u0007<Fg$\u0005b9Lj%lR$Vk%\u0015\u0012)Rb@";
        objectArray[82] = "\u0017p>\u0011 *@)q\u0000\u0010u-(sM+-\\\u007fv\u0014}";
        objectArray[83] = "\u001c~S\u0012<|\rwC\u0011]z\u000bsM\t1HY3\u0017R`\u001f]lH\u0005cn\u0000b\u0014T]";
        objectArray[84] = "]\rK~]7\rV@u,,\b\u0006px\u0017)\u0004\u0005\u0017zH+]jM=B\"\u0005\t\u0012~\u0013,d";
        objectArray[85] = "K~O:\u0002(Yg\u001fy9s$qC.\b.M<\u0017 \u0006I\u0019x@%X*F;\u0011+9";
        objectArray[86] = "/b\u001aL~{oo\u001eE\u001bfre\u0015P{\u0002$`\u001fG%synC\u0016\u001b";
        objectArray[87] = "\u0018ygudAG<\u007f%\u0000\u001ez4h$1C\u0013y<*?$J$e(e]\n)a!\u0000";
        objectArray[88] = " /~FW\u000026.\u0005l]Oj|[\u0007_>7r\u0007V";
        objectArray[89] = "\u0015\u0011!>+-BHn/\u001bu/Jvf >]\u001a-m+";
        objectArray[90] = "X,BrsK\u0003>H'OP\b6%|u\r\u000e`\u0014w-\u000b\fPO,wRYaDtqPi:\u001f.(\u0005X1G(*5";
        objectArray[91] = "&Hu\u007f7B4Q%<\f\u0013IVo=0X+\f)hr";
        objectArray[92] = "{\u00150QLU`\u001f1ZsIi\f5W\u001f{;Lo\nC,?\u00130[M]b\u001dl\ns";
        objectArray[93] = "'\tK\u007fP25\u0010\u001b<kcH\u0006GkZ4!K\u0013eTSwF\u0016bV!(\f\u0014=k";
        objectArray[94] = "$_F\u0006R/sZ\u001fP7`\u001eS\u0014Q\u00069w\u001e@_\b^!\u0013EX\n,~YG\u00077";
        objectArray[95] = "\u001en\u001b?|2N5\u00104\r;F{M\u00046#Bb\u001euk-\u001e3 ";
        objectArray[96] = "/D`0ct6\u0011,\f0H<\u00162=n!qB<3\tq*@e}{!qKn\f";
        objectArray[97] = "* ]wyP}%\u0004!\u001c\u001b\u0010,\u000f -Fya[.#!/l^)!Sp&\\v\u001c";
        objectArray[98] = "x\u0003;y\u0001\u0014/Zth1MBZh\u007fZH3\u0007f#\u000b";
        objectArray[99] = "\u007fLAKZH(\u0015\u000eZj\u001bE_\u001cD[M,\u0012HJU*z\u001fMMWX%UO\u0012j";
        objectArray[100] = "#s';\u0001j1jwx:6L|+/\u000bl%1\u007f!\u0005\u000b,v|\u007fAiv0)=:";
        objectArray[101] = "\rK\u000ejV0]\u0010\u0005a'#HAO8[%N,\t2LzQQT<\u001c#4";
        objectArray[102] = "hw\u007f\u0000lC?r&V\t\u000bR{-W8U;6yY62or.\\hQ01\u007fR\t";
        objectArray[103] = "\u001az\u0013i!*GtC0D7Ob><4+&$\u0000?#6E{Cn-W";
        objectArray[104] = "?BebkH&Lde\u0001\n\u0017(6c9X>S/m8_";
        objectArray[105] = "e^\n,`\u00041\r\u0011/\u001fXUR\u0013,\u007f\u0006,\u0012\u001e(v";
        objectArray[106] = "a:&.vc6ci?F>[iq(|xbel,:";
        objectArray[107] = "sIUB-wwQUG\u00128\u0019\u0018^Nrb`XSJ{";
        objectArray[108] = "3Z'\u0005k,*T&\u0002\u0001n\u00030q\u0001b)%Sy\u0011{>";
        objectArray[109] = ",(\rW\u0019O=!\u001dTxG1<\u000b|D\u0013ghsAB\u00141iBJ\u001a\u00123Y";
        objectArray[110] = "a}\u0004esQ6$KtC\u0002[nYjrT2#\rd|3`|Qm}B=r\r<C";
        Object[] objectArray2 = objectArray;
        objectArray[111] = "Xl<^\ncFi~\u0004wc> )VF4Wm}XHSTk|]Gb_3z_w";
    }

    private static Class f(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _8G.e(l2, l3);
            object = q[n];
            try {
                if (!(object instanceof String)) break block2;
                _8G.q[n] = clazz = Class.forName(r[n]);
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
        Field field = _8G.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _8G.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field g(long l2, long l3) {
        int n = _8G.e(l2, l3);
        Object object = q[n];
        if (object instanceof String) {
            String string = r[n];
            int n2 = string.indexOf(8);
            Class clazz = _8G.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _8G.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _8G.c(clazz3, string2, clazz2)) != null) {
                    _8G.q[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _8G.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _8G.q[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _8G.f(517319860621357L, 0L);
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
        Method method = _8G.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _8G.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method h(long l2, long l3) {
        int n = _8G.e(l2, l3);
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
                clazz3 = _8G.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _8G.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _8G.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _8G.q[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _8G.f(517319860621357L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _8G.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _8G.q[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _8G.f(517319860621357L, 0L);
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
            if (c == 'C' || c == '\u00f1' || c == '\u00de' || c == '\u00d5') {
                field = _8G.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'C' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f1' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00de' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _8G.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c0' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _8G.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8G" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_8G.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_8G.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_8G.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

