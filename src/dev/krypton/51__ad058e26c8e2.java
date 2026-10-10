/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._3Y;
import dev.krypton._3i_0;
import dev.krypton._40;
import dev.krypton._4r;
import dev.krypton._6x_0;
import dev.krypton._7C;
import dev.krypton._8B;
import dev.krypton._95;
import dev.krypton._9H;
import dev.krypton._9o;
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

public class _51
extends _6x_0 {
    private static final long cfr_renamed_4;
    private static final long cfr_renamed_1;
    private static final _8B cfr_renamed_9;
    private static final _8B cfr_renamed_0;
    private final _9H cfr_renamed_6;
    private _3Y cfr_renamed_3;
    private boolean cfr_renamed_8;
    private long cfr_renamed_2;
    private _3Y cfr_renamed_7;
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
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @_3i_0
    public void cfr_renamed_5(_40 var1_1) {
        block45: {
            block46: {
                block44: {
                    block42: {
                        block43: {
                            block41: {
                                block47: {
                                    block40: {
                                        block38: {
                                            block39: {
                                                block37: {
                                                    block36: {
                                                        v0 = var2_2 = _51.b ^ 82833858423207L;
                                                        var4_3 = v0 ^ 40340148059666L;
                                                        var6_4 = v0 ^ 75259121412272L;
                                                        var8_5 = v0 ^ 47501361119578L;
                                                        var10_6 = v0 ^ 119507764739714L;
                                                        var12_7 = v0 ^ 30172222541981L;
                                                        v1 = v0 ^ 106016199458818L;
                                                        var14_8 = (int)(v1 >>> 56);
                                                        var15_9 = v1 << 8 >>> 8;
                                                        var17_10 = v0 ^ 92034036048748L;
                                                        var19_11 = v0 ^ 73466615854598L;
                                                        var21_12 = v0 ^ 22979491546045L;
                                                        var23_13 = v0 ^ 69130923698064L;
                                                        var25_14 = v0 ^ 32057222362948L;
                                                        var27_15 = _7C.cfr_renamed_3();
                                                        try {
                                                            try {
                                                                v2 = this;
                                                                if (var27_15 != 0) break block36;
                                                                if (_51.f("S", (Object)v2, (long)-2224329360655905364L, (long)var2_2) != false) {
                                                                }
                                                                ** GOTO lbl34
                                                            }
                                                            catch (MatchException v3) {
                                                                throw _51.a(v3);
                                                            }
                                                            v2 = this;
                                                        }
                                                        catch (MatchException v4) {
                                                            throw _51.a(v4);
                                                        }
                                                    }
                                                    try {
                                                        if (_51.f("S", (Object)v2, (long)-2222655800549274636L, (long)var2_2) != null) break block37;
lbl34:
                                                        // 2 sources

                                                        return;
                                                    }
                                                    catch (MatchException v5) {
                                                        throw _51.a(v5);
                                                    }
                                                }
                                                var28_16 = _51.f("\u00c9", (long)-2224245887893392046L, (long)var2_2) - _51.f("S", (Object)this, (long)-2223721675940495857L, (long)var2_2);
                                                try {
                                                    try {
                                                        cfr_temp_0 = var28_16 - _51.d("a", (int)20946, (long)(7870643958886330010L ^ var2_2));
                                                        v6 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                                        if (var27_15 != 0) break block38;
                                                        if (v6 <= 0) break block39;
                                                    }
                                                    catch (MatchException v7) {
                                                        throw _51.a(v7);
                                                    }
                                                    _51.f("K", (Object)this, (boolean)_51.c("b", (int)27038, (long)(5933347734187558917L ^ var2_2)), (long)-2224329360655905364L, (long)var2_2);
                                                    return;
                                                }
                                                catch (MatchException v8) {
                                                    throw _51.a(v8);
                                                }
                                            }
                                            cfr_temp_1 = var28_16 - _51.d("a", (int)10996, (long)(5293376283202000312L ^ var2_2));
                                            v6 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                                        }
                                        try {
                                            if (var27_15 != 0) break block40;
                                            if (v6 < 0) {
                                            }
                                            ** GOTO lbl66
                                        }
                                        catch (MatchException v9) {
                                            throw _51.a(v9);
                                        }
                                        var30_17 = (float)var28_16 / 250.0f;
                                        try {
                                            if (var27_15 == 0) break block41;
lbl66:
                                            // 2 sources

                                            v6 = (cfr_temp_2 = var28_16 - _51.d("a", (int)20352, (long)(3458805017351286986L ^ var2_2))) == 0 ? 0 : (cfr_temp_2 < 0 ? -1 : 1);
                                        }
                                        catch (MatchException v10) {
                                            throw _51.a(v10);
                                        }
                                    }
                                    if (v6 <= 0) break block47;
                                    var30_17 = 1.0f - (float)(var28_16 - _51.d("a", (int)18309, (long)(5710094959279798476L ^ var2_2))) / 250.0f;
                                    if (var27_15 == 0) break block41;
                                }
                                var30_17 = 1.0f;
                            }
                            try {
                                if (var30_17 <= 0.0f) {
                                    return;
                                }
                            }
                            catch (MatchException v11) {
                                throw _51.a(v11);
                            }
                            var31_18 = var1_1.cfr_renamed_0;
                            var32_19 = _51.f("W", (Object)_51.f("W", (Object)_51.f("S", (Object)this, (long)-2222781396171214487L, (long)var2_2), (long)-2222562766868771301L, (long)var2_2), (long)-2216123522680983313L, (long)var2_2);
                            var33_20 = _51.c("b", (int)24305, (long)(3858640286823907180L ^ var2_2));
                            var34_21 = _51.c("b", (int)14427, (long)(1387052319501031901L ^ var2_2));
                            try {
                                try {
                                    v12 = new Object[1];
                                    v12[0] = var6_4;
                                    v13 = _51.f("W", (Object)_51.f("S", (Object)this, (long)-2224528221062835213L, (long)var2_2), (Object)v12, (long)-2223263035320549825L, (long)var2_2);
                                    if (var27_15 != 0) break block42;
                                    if (v13 == false) break block43;
                                }
                                catch (MatchException v14) {
                                    throw _51.a(v14);
                                }
                                v15 = new Object[1];
                                v15[0] = var12_7;
                                v16 = _51.f("W", (Object)_51.f("S", (Object)this, (long)-2224528221062835213L, (long)var2_2), (Object)v15, (long)-2223078997255837953L, (long)var2_2);
                                break block44;
                            }
                            catch (MatchException v17) {
                                throw _51.a(v17);
                            }
                        }
                        v13 = var32_19 - var33_20;
                    }
                    v16 = v13 / 2;
                }
                var35_22 = v16;
                try {
                    try {
                        v18 = new Object[1];
                        v18[0] = var6_4;
                        v19 = _51.f("W", (Object)_51.f("S", (Object)this, (long)-2224528221062835213L, (long)var2_2), (Object)v18, (long)-2223263035320549825L, (long)var2_2);
                        if (var27_15 != 0) break block45;
                        if (v19 == false) break block46;
                    }
                    catch (MatchException v20) {
                        throw _51.a(v20);
                    }
                    v21 = new Object[1];
                    v21[0] = var10_6;
                    v19 = _51.f("W", (Object)_51.f("S", (Object)this, (long)-2224528221062835213L, (long)var2_2), (Object)v21, (long)-2224708768785090161L, (long)var2_2);
                    break block45;
                }
                catch (MatchException v22) {
                    throw _51.a(v22);
                }
            }
            v19 = _51.c("b", (int)28423, (long)(3008688467737300627L ^ var2_2));
        }
        var36_23 = v19;
        v23 = new Object[6];
        v23[5] = var21_12;
        v23[4] = (int)var34_21;
        v23[3] = (int)var33_20;
        v23[2] = (int)var36_23;
        v23[1] = (int)var35_22;
        v23[0] = _51.a("d", (int)2445, (long)(4969412106000188846L ^ var2_2));
        _51.f("\u00c9", (Object)v23, (long)-2223725367790251817L, (long)var2_2);
        var37_24 = (int)(var30_17 * 255.0f);
        v24 = new Object[1];
        v24[0] = var23_13;
        _51.f("\u00c9", (Object)v24, (long)-2222713161661290919L, (long)var2_2);
        var38_25 = (double)_51.f("W", (Object)_51.f("W", (Object)_51.f("S", (Object)this, (long)-2222781396171214487L, (long)var2_2), (long)-2222562766868771301L, (long)var2_2), (long)-2223456664061835557L, (long)var2_2);
        var40_26 = 8.0 * var38_25;
        var42_27 = new _8B((int)_51.f("S", (Object)_51.f("Q", (long)-2223586641582982887L, (long)var2_2), (long)-2216028895762897525L, (long)var2_2), (int)_51.f("S", (Object)_51.f("Q", (long)-2223586641582982887L, (long)var2_2), (long)-2217719987216743705L, (long)var2_2), var17_10, (int)_51.f("S", (Object)_51.f("Q", (long)-2223586641582982887L, (long)var2_2), (long)-2223387105721628917L, (long)var2_2), (int)((float)_51.f("S", (Object)_51.f("Q", (long)-2223586641582982887L, (long)var2_2), (long)-2223579795115137312L, (long)var2_2) * var30_17));
        v25 = new Object[3];
        v25[2] = var8_5;
        v25[1] = Float.valueOf(9.0f);
        v25[0] = 5;
        _51.f("\u00c9", (Object)v25, (long)-2223921306039233051L, (long)var2_2);
        v26 = new Object[14];
        v26[13] = 0.0;
        v26[12] = _51.f("Q", (long)-2223992686813125827L, (long)var2_2);
        v26[11] = _51.f("Q", (long)-2223992686813125827L, (long)var2_2);
        v26[10] = var42_27;
        v26[9] = var40_26;
        v26[8] = var40_26;
        v26[7] = var40_26;
        v26[6] = var40_26;
        v26[5] = (double)(var36_23 + var34_21) * var38_25;
        v26[4] = (double)(var35_22 + var33_20) * var38_25;
        v26[3] = (double)var36_23 * var38_25;
        v26[2] = (double)var35_22 * var38_25;
        v26[1] = var15_9;
        v26[0] = (int)((byte)var14_8);
        _51.f("\u00c9", (Object)v26, (long)-2224629765662779005L, (long)var2_2);
        v27 = new Object[1];
        v27[0] = var25_14;
        _51.f("\u00c9", (Object)v27, (long)-2223852189098235060L, (long)var2_2);
        _51.f("\u00d8", (boolean)_51.c("b", (int)27038, (long)(5933347734187558917L ^ var2_2)), (long)-2216538064478559700L, (long)var2_2);
        var43_28 = var35_22 + _51.c("b", (int)14032, (long)(4869757726472083282L ^ var2_2));
        var44_29 = var36_23 + (var34_21 - _51.c("b", (int)5033, (long)(3062988151258395185L ^ var2_2))) / 2 - 4;
        _51.f("W", (Object)var31_18, (Object)_51.f("S", (Object)_51.f("S", (Object)this, (long)-2222655800549274636L, (long)var2_2), (long)-2216072010460661764L, (long)var2_2), (int)var43_28, (int)var44_29, (long)-2224086799269447700L, (long)var2_2);
        var45_30 = var43_28 + _51.c("b", (int)15311, (long)(8487263912285117000L ^ var2_2));
        v28 = new Object[1];
        v28[0] = var19_11;
        var46_31 = _51.f("W", (Object)new _8B((int)_51.c("b", (int)5980, (long)(1905828730235827907L ^ var2_2)), (int)_51.c("b", (int)9137, (long)(3484751776293552679L ^ var2_2)), var17_10, (int)_51.c("b", (int)9065, (long)(2614125050105692908L ^ var2_2)), var37_24), (Object)v28, (long)-2223011302763956729L, (long)var2_2);
        _51.f("W", (Object)var31_18, (Object)_51.f("S", (Object)_51.f("S", (Object)this, (long)-2222781396171214487L, (long)var2_2), (long)-2216853676489054590L, (long)var2_2), (Object)_51.f("S", (Object)_51.f("S", (Object)this, (long)-2222655800549274636L, (long)var2_2), (long)-2217538598073388629L, (long)var2_2), (int)var45_30, (int)(var36_23 + _51.c("b", (int)14288, (long)(5808431655516935764L ^ var2_2))), (int)var46_31, (boolean)true, (long)-2224193544178954652L, (long)var2_2);
        v29 = new Object[1];
        v29[0] = var19_11;
        var47_32 = _51.f("W", (Object)new _8B((int)_51.c("b", (int)26848, (long)(3544079851359422841L ^ var2_2)), (int)_51.c("b", (int)1254, (long)(586987908379518328L ^ var2_2)), var17_10, (int)_51.c("b", (int)1784, (long)(1937945730945951594L ^ var2_2)), (int)(220.0f * var30_17)), (Object)v29, (long)-2223011302763956729L, (long)var2_2);
        _51.f("W", (Object)var31_18, (Object)_51.f("S", (Object)_51.f("S", (Object)this, (long)-2222781396171214487L, (long)var2_2), (long)-2216853676489054590L, (long)var2_2), (Object)_51.f("S", (Object)_51.f("S", (Object)this, (long)-2222655800549274636L, (long)var2_2), (long)-2222812193384582886L, (long)var2_2), (int)var45_30, (int)(var36_23 + _51.c("b", (int)25318, (long)(2535919727263499130L ^ var2_2))), (int)var47_32, (boolean)true, (long)-2224193544178954652L, (long)var2_2);
        var48_33 = _51.c("b", (int)31293, (long)(8587924471251983276L ^ var2_2));
        var49_34 = 2;
        var50_35 = var36_23 + var34_21 - var48_33 - var49_34;
        var51_36 = var35_22 + var48_33;
        var52_37 = var35_22 + var33_20 - var48_33;
        v30 = new Object[10];
        v30[9] = 1.0;
        v30[8] = 1.0;
        v30[7] = 1.0;
        v30[6] = 1.0;
        v30[5] = var4_3;
        v30[4] = (double)(var50_35 + var49_34);
        v30[3] = (double)var52_37;
        v30[2] = (double)var50_35;
        v30[1] = (double)var51_36;
        v30[0] = new _8B((int)_51.c("b", (int)17449, (long)(3520111494637905322L ^ var2_2)), (int)_51.c("b", (int)25634, (long)(8147904967398704558L ^ var2_2)), var17_10, (int)_51.c("b", (int)25634, (long)(8147904967398704558L ^ var2_2)), (int)(40.0f * var30_17));
        _51.f("\u00c9", (Object)v30, (long)-2224653570478705411L, (long)var2_2);
        var53_38 = _51.f("\u00c9", (float)0.0f, (float)(1.0f - (float)var28_16 / 10000.0f), (long)-2215821095472992755L, (long)var2_2);
        var54_39 = (int)((float)(var52_37 - var51_36) * var53_38);
        if (var54_39 > 0) {
            var55_40 = _51.f("S", (Object)_51.f("S", (Object)this, (long)-2222655800549274636L, (long)var2_2), (long)-2216399091264575204L, (long)var2_2);
            v31 = new Object[10];
            v31[9] = 1.0;
            v31[8] = 1.0;
            v31[7] = 1.0;
            v31[6] = 1.0;
            v31[5] = var4_3;
            v31[4] = (double)(var50_35 + var49_34);
            v31[3] = (double)(var51_36 + var54_39);
            v31[2] = (double)var50_35;
            v31[1] = (double)var51_36;
            v31[0] = new _8B((int)_51.f("S", (Object)var55_40, (long)-2216028895762897525L, (long)var2_2), (int)_51.f("S", (Object)var55_40, (long)-2217719987216743705L, (long)var2_2), var17_10, (int)_51.f("S", (Object)var55_40, (long)-2223387105721628917L, (long)var2_2), var37_24);
            _51.f("\u00c9", (Object)v31, (long)-2224653570478705411L, (long)var2_2);
        }
    }

    @Override
    public native void cfr_renamed_5();

    public _51(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0xCB4E6A84952L;
        long l5 = l3 ^ 0x35E3EFD6D961L;
        long l6 = l3 ^ 0x54C80210EAF7L;
        long l7 = l6 >>> 16;
        int n = (int)(l6 << 48 >>> 48);
        long l8 = l3 ^ 0x7B1CE36300E5L;
        long l9 = l3 ^ 0x64DC7047EF97L;
        super((int)_51.c("b", 23362, (long)(0x4FA0EC0C5160B23EL ^ l2)), -1, (_4r)((Object)_51.f("Q", -6213280528325877115L, (long)l2)), l8);
        this.cfr_renamed_6 = new _9H(l7, (int)_51.c("b", 18149, (long)(0x55F7E94EA98C2F94L ^ l2)), (char)n);
        _51.f("K", (Object)this, null, -6206792139971934503L, (long)l2);
        _51.f("K", (Object)this, (boolean)_51.c("b", 27038, (long)(0x52576105BAF900F9L ^ l2)), -6206658008227429040L, (long)l2);
        _51.f("K", (Object)this, (long)_51.d("a", 17284, (long)(0x704E153C40F93435L ^ l2)), -6205997959254001933L, (long)l2);
        _51.f("K", (Object)this, null, -6207201613305887992L, (long)l2);
        Object[] objectArray = new Object[2];
        objectArray[1] = new _95[]{_51.f("S", (Object)this, -6206806875215717617L, (long)l2)};
        objectArray[0] = l9;
        _51.f("W", (Object)this, (Object)objectArray, -6213995053216601238L, (long)l2);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l4;
        objectArray2[1] = (arg_0, arg_1) -> this.cfr_renamed_3(l5, arg_0, arg_1);
        objectArray2[0] = _51.a("d", 10454, (long)(0x4748EA61900E2C08L ^ l2));
        _51.f("\u00c9", (Object)objectArray2, -6214486857137001081L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        block20: {
                            a.init(_51.class, 45);
                            _51.b = dev.krypton.l.a(-7598268951290432111L, 3671104829501592412L, MethodHandles.lookup().lookupClass()).a(223226032275530L);
                            var31 = _51.b ^ 98540308176927L;
                            var33_1 = var31 ^ 72005909146324L;
                            _51.r = new Object[93];
                            _51.s = new String[93];
                            _51.b();
                            _51.f = new HashMap<K, V>(13);
                            var22_2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                            v0 = SecretKeyFactory.getInstance("DES");
                            v1 = new byte[8];
                            v2 = v1;
                            v1[0] = (byte)(var31 >>> 56);
                            for (var23_3 = 1; var23_3 < 8; ++var23_3) {
                                v2 = v2;
                                v2[var23_3] = (byte)(var31 << var23_3 * 8 >>> 56);
                            }
                            var22_2.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                            var29_4 = new String[2];
                            var27_5 = 0;
                            var26_6 = "a\u008d\u000b\u008aYZG\u00e7\u0019\u00ad4\u00f6\u008f+\nf\u00102c\u00cc/\u0093\u00b0\u00d5V\u00fe\u001c\u00b3\u00c1 q\u00c0g";
                            var28_7 = "a\u008d\u000b\u008aYZG\u00e7\u0019\u00ad4\u00f6\u008f+\nf\u00102c\u00cc/\u0093\u00b0\u00d5V\u00fe\u001c\u00b3\u00c1 q\u00c0g".length();
                            var25_8 = 16;
                            var24_9 = -1;
lbl26:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl28:
                            // 1 sources

                            while (true) {
                                var29_4[var27_5++] = _51.b(var30_10).intern();
                                if ((var24_9 += var25_8) < var28_7) {
                                    var25_8 = var26_6.charAt(var24_9);
                                    ** continue;
                                }
                                break block20;
                                break;
                            }
                            v3 = ++var24_9;
                            var30_10 = var22_2.doFinal(var26_6.substring(v3, v3 + var25_8).getBytes("ISO-8859-1"));
                            ** while (true)
                        }
                        _51.d = var29_4;
                        _51.e = new String[2];
                        _51.l = new HashMap<K, V>(13);
                        var11_11 = Cipher.getInstance("DES/CBC/NoPadding");
                        v4 = SecretKeyFactory.getInstance("DES");
                        v5 = new byte[8];
                        v6 = v5;
                        v5[0] = (byte)(var31 >>> 56);
                        for (var12_12 = 1; var12_12 < 8; ++var12_12) {
                            v6 = v6;
                            v6[var12_12] = (byte)(var31 << var12_12 * 8 >>> 56);
                        }
                        var11_11.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                        var17_13 = new long[26];
                        var14_14 = 0;
                        var15_15 = "\u00abY\u00a6\u00e9'\u008e\u00cf\u00ba\u00bf\u0080_\u00a0,9o|\u000e\u00d3\u00f8\u0015\u00a0\u0005d!$\u00c5\u00cb\u00ael!\u00f9\u00d7F\u0005\u00fa\u00a6\u00aa\u00d1\u0011@\u009e?y\u00c9\u00d5@\u00cd\u00ba\u0003\u0094!\u00de\u00b4\u00f5^}\u000e!\u00c3\u00a6c\u0002\u00f0\u0084\u0097\u00c2\u00c7\u00f53\u00e52\u00860\u00a4\u00f2'>\u0019y%\u00e5\u0015\u00ad3\u0005U\u0016\u00dd\u0019\bn\u007fM\u00bd\u0085\u00bfO\u00be\u0089\u00d0\u008d\u00c0\u00ae\u00ec\u00ba\u00df.i\b\u009e\u00e4\u00a7e\n~<\u0015\u0093\u00db\u00e7\u00b0 \u00b9\u007f.\u0081\u007f\u0011\t\u0002L\u008e\b@>\u00df_S\u00f9\u00d3\u00dd\u00bex\u00d0\u0097\u0010\u00ba\u00b9ZF+D\u00ae\u00e5\u0094\\KQ\u008a\u00a6\u00c2\u00daPv%}R6P\u00fe\u00d7\u0011\u00e8\u00d5I,o9\u00ba\u008a\u0099\u00d3\n\"\u00ba\u00e2\u00ae\u00890\u00f3{l";
                        var16_16 = "\u00abY\u00a6\u00e9'\u008e\u00cf\u00ba\u00bf\u0080_\u00a0,9o|\u000e\u00d3\u00f8\u0015\u00a0\u0005d!$\u00c5\u00cb\u00ael!\u00f9\u00d7F\u0005\u00fa\u00a6\u00aa\u00d1\u0011@\u009e?y\u00c9\u00d5@\u00cd\u00ba\u0003\u0094!\u00de\u00b4\u00f5^}\u000e!\u00c3\u00a6c\u0002\u00f0\u0084\u0097\u00c2\u00c7\u00f53\u00e52\u00860\u00a4\u00f2'>\u0019y%\u00e5\u0015\u00ad3\u0005U\u0016\u00dd\u0019\bn\u007fM\u00bd\u0085\u00bfO\u00be\u0089\u00d0\u008d\u00c0\u00ae\u00ec\u00ba\u00df.i\b\u009e\u00e4\u00a7e\n~<\u0015\u0093\u00db\u00e7\u00b0 \u00b9\u007f.\u0081\u007f\u0011\t\u0002L\u008e\b@>\u00df_S\u00f9\u00d3\u00dd\u00bex\u00d0\u0097\u0010\u00ba\u00b9ZF+D\u00ae\u00e5\u0094\\KQ\u008a\u00a6\u00c2\u00daPv%}R6P\u00fe\u00d7\u0011\u00e8\u00d5I,o9\u00ba\u008a\u0099\u00d3\n\"\u00ba\u00e2\u00ae\u00890\u00f3{l".length();
                        var13_17 = 0;
                        while (true) {
                            var18_18 = var15_15.substring(var13_17, var13_17 += 8).getBytes("ISO-8859-1");
                            v7 = var17_13;
                            v8 = var14_14++;
                            v9 = ((long)var18_18[0] & 255L) << 56 | ((long)var18_18[1] & 255L) << 48 | ((long)var18_18[2] & 255L) << 40 | ((long)var18_18[3] & 255L) << 32 | ((long)var18_18[4] & 255L) << 24 | ((long)var18_18[5] & 255L) << 16 | ((long)var18_18[6] & 255L) << 8 | (long)var18_18[7] & 255L;
                            v10 = -1;
                            break block21;
                            break;
                        }
lbl64:
                        // 1 sources

                        while (true) {
                            v7[v8] = v11;
                            if (var13_17 < var16_16) ** continue;
                            var15_15 = "\u00c3\u0084\u00a6\u00c4\u009f-\u00a2x\u00f4\u00f2\u00d3\u00e2\u00ea\u00ee}\u00ba";
                            var16_16 = "\u00c3\u0084\u00a6\u00c4\u009f-\u00a2x\u00f4\u00f2\u00d3\u00e2\u00ea\u00ee}\u00ba".length();
                            var13_17 = 0;
                            while (true) {
                                var18_18 = var15_15.substring(var13_17, var13_17 += 8).getBytes("ISO-8859-1");
                                v7 = var17_13;
                                v8 = var14_14++;
                                v9 = ((long)var18_18[0] & 255L) << 56 | ((long)var18_18[1] & 255L) << 48 | ((long)var18_18[2] & 255L) << 40 | ((long)var18_18[3] & 255L) << 32 | ((long)var18_18[4] & 255L) << 24 | ((long)var18_18[5] & 255L) << 16 | ((long)var18_18[6] & 255L) << 8 | (long)var18_18[7] & 255L;
                                v10 = 0;
                                break block21;
                                break;
                            }
                            break;
                        }
lbl77:
                        // 1 sources

                        while (true) {
                            v7[v8] = v11;
                            if (var13_17 < var16_16) ** continue;
                            break block22;
                            break;
                        }
                    }
                    var19_19 = v9;
                    var21_20 = var11_11.doFinal(new byte[]{(byte)(var19_19 >>> 56), (byte)(var19_19 >>> 48), (byte)(var19_19 >>> 40), (byte)(var19_19 >>> 32), (byte)(var19_19 >>> 24), (byte)(var19_19 >>> 16), (byte)(var19_19 >>> 8), (byte)var19_19});
                    v11 = ((long)var21_20[0] & 255L) << 56 | ((long)var21_20[1] & 255L) << 48 | ((long)var21_20[2] & 255L) << 40 | ((long)var21_20[3] & 255L) << 32 | ((long)var21_20[4] & 255L) << 24 | ((long)var21_20[5] & 255L) << 16 | ((long)var21_20[6] & 255L) << 8 | (long)var21_20[7] & 255L;
                    switch (v10) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl90:
                        // 1 sources

                        ** continue;
                    }
                }
                _51.j = var17_13;
                _51.k = new Integer[26];
                _51.o = new HashMap<K, V>(13);
                var0_21 = Cipher.getInstance("DES/CBC/NoPadding");
                v12 = SecretKeyFactory.getInstance("DES");
                v13 = new byte[8];
                v14 = v13;
                v13[0] = (byte)(var31 >>> 56);
                for (var1_22 = 1; var1_22 < 8; ++var1_22) {
                    v14 = v14;
                    v14[var1_22] = (byte)(var31 << var1_22 * 8 >>> 56);
                }
                var0_21.init(2, (Key)v12.generateSecret(new DESKeySpec(v14)), new IvParameterSpec(new byte[8]));
                var6_23 = new long[7];
                var3_24 = 0;
                var4_25 = "\u00dd\u00fb\u0092\u001d\t\r\u00dfu\u001b\u00dd\u0098\u00f3\u00f3Hp\u00f7\r\u00e3i\u0014H\u009a\u00da\u0099\u00fc\u00c1q\u00cd[\u0080]\u00db\u0018_\u00e8d\u0082j\u00b9\u00a2";
                var5_26 = "\u00dd\u00fb\u0092\u001d\t\r\u00dfu\u001b\u00dd\u0098\u00f3\u00f3Hp\u00f7\r\u00e3i\u0014H\u009a\u00da\u0099\u00fc\u00c1q\u00cd[\u0080]\u00db\u0018_\u00e8d\u0082j\u00b9\u00a2".length();
                var2_27 = 0;
                while (true) {
                    var7_28 = var4_25.substring(var2_27, var2_27 += 8).getBytes("ISO-8859-1");
                    v15 = var6_23;
                    v16 = var3_24++;
                    v17 = ((long)var7_28[0] & 255L) << 56 | ((long)var7_28[1] & 255L) << 48 | ((long)var7_28[2] & 255L) << 40 | ((long)var7_28[3] & 255L) << 32 | ((long)var7_28[4] & 255L) << 24 | ((long)var7_28[5] & 255L) << 16 | ((long)var7_28[6] & 255L) << 8 | (long)var7_28[7] & 255L;
                    v18 = -1;
                    break block23;
                    break;
                }
lbl117:
                // 1 sources

                while (true) {
                    v15[v16] = v19;
                    if (var2_27 < var5_26) ** continue;
                    var4_25 = "\u001c\u009e\u00bf\u0081\u001f>\u00b6\u00d9!\u00d2/9\u0091\u00e8.`";
                    var5_26 = "\u001c\u009e\u00bf\u0081\u001f>\u00b6\u00d9!\u00d2/9\u0091\u00e8.`".length();
                    var2_27 = 0;
                    while (true) {
                        var7_28 = var4_25.substring(var2_27, var2_27 += 8).getBytes("ISO-8859-1");
                        v15 = var6_23;
                        v16 = var3_24++;
                        v17 = ((long)var7_28[0] & 255L) << 56 | ((long)var7_28[1] & 255L) << 48 | ((long)var7_28[2] & 255L) << 40 | ((long)var7_28[3] & 255L) << 32 | ((long)var7_28[4] & 255L) << 24 | ((long)var7_28[5] & 255L) << 16 | ((long)var7_28[6] & 255L) << 8 | (long)var7_28[7] & 255L;
                        v18 = 0;
                        break block23;
                        break;
                    }
                    break;
                }
lbl130:
                // 1 sources

                while (true) {
                    v15[v16] = v19;
                    if (var2_27 < var5_26) ** continue;
                    break block24;
                    break;
                }
            }
            var8_29 = v17;
            var10_30 = var0_21.doFinal(new byte[]{(byte)(var8_29 >>> 56), (byte)(var8_29 >>> 48), (byte)(var8_29 >>> 40), (byte)(var8_29 >>> 32), (byte)(var8_29 >>> 24), (byte)(var8_29 >>> 16), (byte)(var8_29 >>> 8), (byte)var8_29});
            v19 = ((long)var10_30[0] & 255L) << 56 | ((long)var10_30[1] & 255L) << 48 | ((long)var10_30[2] & 255L) << 40 | ((long)var10_30[3] & 255L) << 32 | ((long)var10_30[4] & 255L) << 24 | ((long)var10_30[5] & 255L) << 16 | ((long)var10_30[6] & 255L) << 8 | (long)var10_30[7] & 255L;
            switch (v18) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl143:
                // 1 sources

                ** continue;
            }
        }
        _51.m = var6_23;
        _51.n = new Long[7];
        _51.cfr_renamed_1 = (long)_51.d("a", (int)5763, (long)(var31 ^ 7323279334979887221L));
        _51.cfr_renamed_4 = (long)_51.d("a", (int)24395, (long)(var31 ^ 7730193459381250492L));
        _51.cfr_renamed_9 = new _8B((int)_51.c("b", (int)20104, (long)(7866297998227351207L ^ var31)), (int)_51.c("b", (int)9543, (long)(4275939550301965676L ^ var31)), var33_1, (int)_51.c("b", (int)10199, (long)(7424795191546204142L ^ var31)), (int)_51.c("b", (int)6691, (long)(8778803557447692801L ^ var31)));
        _51.cfr_renamed_0 = new _8B(0, 0, var33_1, 0, 0);
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
            case 0 -> 14;
            case 1 -> 10;
            case 2 -> 43;
            case 3 -> 46;
            case 4 -> 32;
            case 5 -> 13;
            case 6 -> 57;
            case 7 -> 9;
            case 8 -> 63;
            case 9 -> 59;
            case 10 -> 17;
            case 11 -> 39;
            case 12 -> 38;
            case 13 -> 26;
            case 14 -> 3;
            case 15 -> 21;
            case 16 -> 28;
            case 17 -> 18;
            case 18 -> 27;
            case 19 -> 16;
            case 20 -> 22;
            case 21 -> 41;
            case 22 -> 33;
            case 23 -> 48;
            case 24 -> 19;
            case 25 -> 11;
            case 26 -> 24;
            case 27 -> 29;
            case 28 -> 20;
            case 29 -> 58;
            case 30 -> 44;
            case 31 -> 2;
            case 32 -> 23;
            case 33 -> 36;
            case 34 -> 47;
            case 35 -> 30;
            case 36 -> 1;
            case 37 -> 0;
            case 38 -> 37;
            case 39 -> 34;
            case 40 -> 56;
            case 41 -> 53;
            case 42 -> 12;
            case 43 -> 50;
            case 44 -> 51;
            case 45 -> 15;
            case 46 -> 54;
            case 47 -> 52;
            case 48 -> 60;
            case 49 -> 5;
            case 50 -> 62;
            case 51 -> 31;
            case 52 -> 49;
            case 53 -> 61;
            case 54 -> 7;
            case 55 -> 40;
            case 56 -> 4;
            case 57 -> 55;
            case 58 -> 6;
            case 59 -> 25;
            case 60 -> 35;
            case 61 -> 45;
            case 62 -> 8;
            default -> 42;
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
        _51.s[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = r;
        r[0] = "Er\tM\u001dBXg\u000b\f\u0018\u001e\u0014&";
        objectArray[1] = "DAn\u0001&+YTl@#w\u0018f";
        objectArray[2] = Integer.TYPE;
        _51.s[2] = "java/lang/Integer";
        objectArray[3] = ">|)\u001e\u007f\u007f#i+_z#nr";
        objectArray[4] = "\u0018e\bgoNmE\u0003h~\u0001\fK\bcz[x";
        objectArray[5] = Void.TYPE;
        _51.s[5] = "java/lang/Void";
        objectArray[6] = "rO\u0012\u000eEqoZ\u0010O@-%s";
        objectArray[7] = ")Lw/*W\"Cf`WO1Do)";
        objectArray[8] = "|&\u000f}Gpa3\r<B,(.";
        objectArray[9] = "r\"53Sv\u0007\u0002><B9f\f57Fc\u0012";
        objectArray[10] = "O\u0004_0.IF\n\\ymD@\nH{pB\u0002\u001fWf7S^\u000eA0\u0004VY?Wf7S^\u000edw&Q";
        objectArray[11] = Long.TYPE;
        _51.s[11] = "java/lang/Long";
        objectArray[12] = "}.\u000f$*O`;\re/\u0013-1";
        objectArray[13] = "\u0006|bu<is\\iz-&\u0012Rbq)|f";
        objectArray[14] = "\u0019%V#qQ\u00040Tbt\rN\u000e";
        objectArray[15] = ")S\u0016x\u0001\u0000\\s\u001dw\u0010O=}\u0016|\u0014\u0015I";
        objectArray[16] = "2sxP\fh2so\f\u0000g(8o\u0012\u0000r/I=IX8";
        objectArray[17] = "?\u001edm['?\u001es1W(%Us/W=\"$!s\u0002\u007f";
        objectArray[18] = "_>a!I&B+c`Lz\u0002\u0013";
        objectArray[19] = "'\u007fq\u0019y9R_z\u0016hv3Qq\u001dl,G";
        objectArray[20] = ">\u0001o \u0015\u001c#\u0014ma\u0010@c\\";
        objectArray[21] = "\u0013\u0001\u0007Y\u001c'f!\fV\rh\u0007/\u0007]\t2s";
        objectArray[22] = "ue\u001c~\t9~j\r1j4kl";
        objectArray[23] = Float.TYPE;
        _51.s[23] = "java/lang/Float";
        objectArray[24] = "\u001d\u0016H\u007f\u00005\u0016\u0019Y0} \u0004\u0003[s";
        objectArray[25] = Boolean.TYPE;
        _51.s[25] = "java/lang/Boolean";
        objectArray[26] = "\"\u0007m]\nO\"\u0007z\u0001\u0006@8Lz\u001f\u0006U?=*BW";
        objectArray[27] = "yY RN]yY7\u000eBRc\u00127\u0010BGdcgN\u0014";
        objectArray[28] = "J|_D\u007fc?\\TKn,^R_@jv*";
        objectArray[29] = "F%.\u001bOH3\u0005%\u0014^\u0007R\u000b.\u001fZ]&";
        objectArray[30] = "\u0018i^,O;mIU#^t\fG^(Z.x";
        objectArray[31] = "\u000b\u0018L{\u0010`\u0016\rN:\u0015<Y\u0005";
        objectArray[32] = "\f3\u0017,/\"\f3\u0000p#-\u0016x\u0000n#8\u0011\tP1p";
        objectArray[33] = "H7\u0003x){=\u0017\bw84\\\u0019\u0003|<n(";
        objectArray[34] = "N\u000f!ujJN\u000f6)fETD67fPS5bo1";
        objectArray[35] = "X4^Uh>X4I\td1B\u007fI\u0017d$E\u000e\u001cH=";
        objectArray[36] = "ff.:\u001c\u0019ff9f\u0010\u0016|-9x\u0010\u0003{\\i @G";
        objectArray[37] = "jpRwPvjpE+\\yp;E5\\lwJ\u0015m\f+";
        objectArray[38] = "3!VW\u001ch.4T\u0016\u00194c6";
        objectArray[39] = "\u00155Q$(;`\u0015Z+9t\u0001\u001bQ =.u";
        objectArray[40] = "a\u007f\u0006b\u0014\u001c\u0014_\rm\u0005SuQ\u0006f\u0001\t\u0001";
        objectArray[41] = "?[2^`Q4T#\u0011\u0007S!_#Z<";
        objectArray[42] = "86\u0006\u001e\u0006;M\u0016\r\u0011\u0017t,\u0018\u0006\u001a\u0013.X";
        objectArray[43] = "B'\nP;`I(\u001b\u001fZnB#\u001fE";
        objectArray[44] = "\u0005KS\u0005\u001a\bFK[\u0013b\u0002\u001f\u000fo\u0006\u0006\u001e\u0014s\b\u0010\t_\u000b\u0015\fT\u0012^y";
        objectArray[45] = "t\ty8m\u001dr\u0012r;\u0013\u001eM[\u007f./S+_;5.";
        objectArray[46] = ">nmPS}*yeSoQ\u0006XV:\u0016y7i!S\u0002n?j";
        objectArray[47] = "kYOC\u0019\u001anA\u0017ExZW\u0000C\u0000\u0001\niQIEH";
        objectArray[48] = "44\u001c\u000b>v3h\u001c\u000b\u000f#>$\u001fQc\u0011ceC\b\u000f&7i\rO>4>i@6";
        objectArray[49] = "8\u0006I\u001cB\u001fgR\u001a\u00060\u00132B\u0016\u000b\\!b\u0001FW0\u000f`N\u0004\u0003T\u0019-T\nl_\u001c<S\u0006\b^\u000b2\u0006v\u0003Z\u00152N\u0012\u0002M\u001bg>JV\u0001\u0007>\u0004\u0016\u0003A\u0006_";
        objectArray[50] = "\u0003V\u0014w`X\u0006NLq\u0001\u001c?X\u0010#lPQ\u000eB+n";
        objectArray[51] = "P\u0002\u0012-\u001eMDCS!nMVC\u000b&\u0002\u007f\u0007\u0003[\u007fn\u0011DTW3\b\u0015\u0000OVA";
        objectArray[52] = "A\ty\u0018\u0002}\u001d\u0010zQ\u007f'%\u000b>HEg^N2CE\u001e\u0019M2P\u001e$E\u0018rQ\u007f";
        objectArray[53] = "\u0001\u0010\u000e\u001cq\u0003\u0007\u000b\u0005\u001f\u000f\u0003}{N\u001ed\u0003J\u001dJZ\u007f\u0002";
        objectArray[54] = "zT\u0007v[clFJ+`d}Kw}\nbyK\u0013|\u001dl,;\u0018x\u0003ld_\u0019o\r9\u0014T\u001dq\rqpU\n\u007fX\u0001";
        objectArray[55] = "TN\u001a\u001b]5\u0005\u001a\u000f]=cT\u001a\u0004Mj4\nM\\!Z5\n\u0007\u0012H\u0005aY\u001d";
        objectArray[56] = "<)L]0f91\u0014[Q@@\u0010m,\u001cF\u0000qO\u0007l}ztW_j";
        objectArray[57] = "\u000f0m\u001a\u0017\u0010^dx\\wF\u000fdsL \u0011Q6- \u0015\u0018\u0011f|\u001a\u001d\u0015\bc";
        objectArray[58] = "\u007f\u0005\u0005\u0002:d.Q\u0010DZ2\u007fQ\u001bT\re \f@8=0}\u0001N\b:l}\u0001";
        objectArray[59] = "Asci1yMw`iO?*m&guxQ(*lu\u0001\u0016+*\u007f.;J~j~O";
        objectArray[60] = "\u0002E\u0004\boD^@F\rWB8EZC%\u0006\tWSCh";
        objectArray[61] = "\nN\u007fZl|\u000fV'\\\rMrgQ=\r:RM%\u0006w?J\u0015#";
        objectArray[62] = "fY\u001d\f7\u000ecAE\nVKZ\u0004\u0011H+\nf\u0002\nC(";
        objectArray[63] = "nEht95>\u0019f{D8^U?p~|%\u00103{~\u0005b\u00133h%?>FsiD";
        objectArray[64] = "\u0010\u0007'\u0002Km\u000b\\l\u0000,8\u0018J}\u001b@\nH\u000f!F\u0013]\u001fUt\u0011^3I\u0007|\u0013,d\n]!\u000eJ`NF |\u0015\"\u001e\no\u001a\u0011f\u0005\u000b\u001d@\u0016l\u0004W'\u001cC,\u00056";
        objectArray[65] = "U*<\u0001]\u0012Nqw\u0003:G]gf\u0018Vu\r\":D\u0001\"R+y\u0010Q\u0018Z&`\u0015:\u001f[e\u007f\u0015\u0004NQ 6\u007f\u0003]['t\u0019\u0007\u0019@&\u0006FEI\fi`B\u0001R\r\u001b?\u0000Q\u001eB};DJ\u001f0{bNH[\u0001ikN\u0005\"\f!7\u000e[\u0018Ptw\u000f:";
        objectArray[66] = "-\u0012qG&#l\u00165 t_(@s]:c.[x^";
        objectArray[67] = ".vV_WV)*V_f\u0003$fU\u0005\n1y&\fSf\u0006-+G\u001bW\u0014$+\nb";
        objectArray[68] = ")wR&e\fur\u0010#]\np\u0017\u0014a4\rjlQm?\r\u0013+Rm,V)w\u0007--7";
        objectArray[69] = "Q\u0001Ek&6\u0007\u0004\u0005g^ql\u0007\u0003|d5\u0017B\u000fwdLSDE-$4\u000f\t\u0001k^";
        objectArray[70] = "AK7GXE\u0000Os \u00049MKvM]W\u0019\bt[";
        objectArray[71] = "H{\u0018,S\u0010\u0018'\u0016#.\u0019xkO(\u0014Y\u0003.C#\u0014 D-C0O\u001a\u0018x\u00031.";
        objectArray[72] = "G3%I\u0007tH -Vz!;K6\u0012\u0013$\u000f0s\u001e\u0018$vwp\u001e\u000b\u007fL+%^\n\u001e";
        objectArray[73] = "3\u007f\u0006\u0011~d?{\u0005\u0011\u0000!XaC\u001f:e#$O\u0014:\u001cab\u0015Jrze&\u000eK\u0000";
        objectArray[74] = "|\u00116>\\f=\u0015rY\u0005\u001a+J5>@b'N6>";
        objectArray[75] = "\u0006Bx\u0016=)\u0002\n,\u001bP)k\u000fx\u0002ji\u0010Jt\tj\u0010WIt\u001a1*\u000b\u001c4\u001bP";
        objectArray[76] = "k-v\u0010$;n5.\u0016E\u001b\u001e\bW-y%0tpW|=hr";
        objectArray[77] = "m\u000b\u0019\n6a,\u000f]mn\u001dmV\u0005P5ghN]V";
        objectArray[78] = "\u0012\u0019lm9vHF<m\u0002!\u000f\\*nd6.G5nG+\u0016B1x\u0002zK\u001c=dl.\b\u001e+\u0003";
        objectArray[79] = "LHB[\\\u000f\rL\u0006<\u0003s\u0010\u0015\bNGB\u0002\u001c\b\u0003";
        objectArray[80] = "-J#\u001eq:+Q(\u001d\u000f7S!&^f<mZcRm<\u0014\u0018%\b3tr\u001ca\u00132\u0006";
        objectArray[81] = "}]c?\nJqY`?t\r\u0016C&1NKm\u0006*:N2/@pd\u0006T+\u0004ket";
        objectArray[82] = "* ytIZ/8!r(\u0010\u0016yu7QJ((\u007fr\u0018";
        objectArray[83] = "cT ]UL!M/_8\u001bzX\"RoL'\u000b|\u00018\f$E4Q\\\u001ai_:";
        objectArray[84] = "q)J\u0019Ie-,\b\u001cqc\u001aI\f^\u0018d22IR\u0013dKuJR\u0000?q)\u001f\u0012\u0001^";
        objectArray[85] = "gg9\"y,;~:k\u0004v\u0003xza>/;).tx";
        objectArray[86] = "Z.R\u0006'*\u000bzG@GwVkH[+E\u0001-\u0016\f|\u0012P*QP7wDk\u0010\\G";
        objectArray[87] = "f(\u001c\u0006;6',XaeJfu\u0000\\80cmXZ";
        objectArray[88] = " \u000b\u0010/\bu&\u0010\u001b,vr\u0019Y\u00169J;\u007f]R\"K";
        objectArray[89] = "a3!Wpa 7e0-\u001dda#Ml!bz(N";
        objectArray[90] = "$77hQ \",<k/,\u001de1~\u0013n{aue\u0012";
        objectArray[91] = "x\u0018\u0013z0\u000flYRv@\u000f~Y\nq,=/\u0019[+@SlNVd&W(UW\u0016";
        Object[] objectArray2 = objectArray;
        objectArray[92] = "Q./3e\u0012]*,3\u001bZ:0j=!\u0013Auf6!jZ(f&b[H!fk\u001b";
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _51.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'S' || c == 'K' || c == 'Q' || c == '\u00d8') {
                field = _51.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'S' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'K' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'Q' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _51.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'W' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _51.c(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static int c(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x40A6;
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
                throw new RuntimeException("dev/krypton/51", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _51.k[n2] = n3;
        }
        return k[n2];
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/51" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = _51.e(l2, l3);
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
                clazz3 = _51.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _51.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _51.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _51.r[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _51.f(3059420709150388L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _51.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _51.r[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _51.f(3059420709150388L, 0L);
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
            int n = _51.e(l2, l3);
            object = r[n];
            try {
                if (!(object instanceof String)) break block2;
                _51.r[n] = clazz = Class.forName(s[n]);
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
            throw new RuntimeException("dev/krypton/51" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _51.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _51.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _51.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _51.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static long d(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x5E7E;
        if (_51.n[n2] == null) {
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
                throw new RuntimeException("dev/krypton/51", exception);
            }
            long l5 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            _51.n[n2] = l5;
        }
        return _51.n[n2];
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/51" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = _51.d(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return l3;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _51.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_3().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/51" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x2D10;
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
                throw new RuntimeException("dev/krypton/51", exception);
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
            _51.e[n2] = _51.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Field g(long l2, long l3) {
        int n = _51.e(l2, l3);
        Object object = r[n];
        if (object instanceof String) {
            String string = s[n];
            int n2 = string.indexOf(8);
            Class clazz = _51.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _51.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _51.c(clazz3, string2, clazz2)) != null) {
                    _51.r[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _51.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _51.r[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _51.f(3059420709150388L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public native void cfr_renamed_2();

    /*
     * Unable to fully structure code
     */
    @_3i_0
    public void cfr_renamed_2(_9o var1_1) {
        block27: {
            block28: {
                block29: {
                    block25: {
                        block26: {
                            block24: {
                                block30: {
                                    block23: {
                                        block21: {
                                            block22: {
                                                var2_2 = _51.b ^ 49894873553737L;
                                                var4_3 = _7C.cfr_renamed_3();
                                                try {
                                                    v0 = _51.f("S", (Object)_51.f("S", (Object)this, (long)-3185876518385745017L, (long)var2_2), (long)-3183307788701287927L, (long)var2_2);
                                                    if (var4_3 != 0) break block21;
                                                    if (v0 != null) break block22;
                                                }
                                                catch (MatchException v1) {
                                                    throw _51.a(v1);
                                                }
                                                return;
                                            }
                                            v0 = _51.f("S", (Object)_51.f("S", (Object)this, (long)-3185876518385745017L, (long)var2_2), (long)-3183307788701287927L, (long)var2_2);
                                        }
                                        try {
                                            v2 = _51.f("W", (Object)v0, (long)-3184033974107776252L, (long)var2_2);
                                            if (var4_3 != 0) break block23;
                                            if (v2 != false) {
                                            }
                                            ** GOTO lbl25
                                        }
                                        catch (MatchException v3) {
                                            throw _51.a(v3);
                                        }
                                        var5_4 = _51.f("Q", (long)-3183416289920718222L, (long)var2_2);
                                        try {
                                            if (var4_3 == 0) break block24;
lbl25:
                                            // 2 sources

                                            v2 = _51.f("W", (Object)_51.f("S", (Object)_51.f("S", (Object)this, (long)-3185876518385745017L, (long)var2_2), (long)-3183307788701287927L, (long)var2_2), (long)-3184927561030099901L, (long)var2_2);
                                        }
                                        catch (MatchException v4) {
                                            throw _51.a(v4);
                                        }
                                    }
                                    if (v2 == false) break block30;
                                    var5_4 = _51.f("Q", (long)-3184275671594773036L, (long)var2_2);
                                    if (var4_3 == 0) break block24;
                                }
                                var5_4 = _51.f("Q", (long)-3183081358208180227L, (long)var2_2);
                            }
                            try {
                                try {
                                    v5 = _51.f("S", (Object)this, (long)-3184203205941904181L, (long)var2_2);
                                    if (var4_3 != 0) break block25;
                                    if (v5 != null) break block26;
                                }
                                catch (MatchException v6) {
                                    throw _51.a(v6);
                                }
                                _51.f("K", (Object)this, (_3Y)var5_4, (long)-3184203205941904181L, (long)var2_2);
                                return;
                            }
                            catch (MatchException v7) {
                                throw _51.a(v7);
                            }
                        }
                        v5 = var5_4;
                    }
                    try {
                        try {
                            try {
                                if (v5 == _51.f("S", (Object)this, (long)-3184203205941904181L, (long)var2_2)) break block27;
                                _51.f("K", (Object)this, (_3Y)var5_4, (long)-3185755346697275110L, (long)var2_2);
                                _51.f("K", (Object)this, (boolean)_51.c("b", (int)941, (long)(2446204957825536211L ^ var2_2)), (long)-3184047083797594302L, (long)var2_2);
                                _51.f("K", (Object)this, (long)_51.f("\u00c9", (long)-3184183401825466436L, (long)var2_2), (long)-3184705890431742751L, (long)var2_2);
                                v8 = this;
                                if (var4_3 != 0) break block28;
                            }
                            catch (MatchException v9) {
                                throw _51.a(v9);
                            }
                            if (_51.f("S", (Object)_51.f("S", (Object)v8, (long)-3185876518385745017L, (long)var2_2), (long)-3183511889879626153L, (long)var2_2) == null) break block29;
                        }
                        catch (MatchException v10) {
                            throw _51.a(v10);
                        }
                        _51.f("W", (Object)_51.f("S", (Object)_51.f("S", (Object)this, (long)-3185876518385745017L, (long)var2_2), (long)-3183511889879626153L, (long)var2_2), (Object)_51.f("Q", (long)-3186046388487702710L, (long)var2_2), (float)1.0f, (float)1.0f, (long)-3183937798728730297L, (long)var2_2);
                    }
                    catch (MatchException v11) {
                        throw _51.a(v11);
                    }
                }
                v8 = this;
            }
            _51.f("K", (Object)v8, (_3Y)var5_4, (long)-3184203205941904181L, (long)var2_2);
        }
    }

    private void cfr_renamed_3(long l2, Integer n, Integer n2) {
        long l3 = (l2 = b ^ l2) ^ 0x5C72CF97F349L;
        Object[] objectArray = new Object[3];
        objectArray[2] = (int)_51.f("W", (Object)n2, 8660838457440823710L, (long)l2);
        objectArray[1] = (int)_51.f("W", (Object)n, 8660838457440823710L, (long)l2);
        objectArray[0] = l3;
        _51.f("W", (Object)_51.f("S", (Object)this, 8658425778608098043L, (long)l2), (Object)objectArray, 8661694419844073338L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_51.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_51.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_51.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
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
            return MethodHandles.lookup().findStatic(_51.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

