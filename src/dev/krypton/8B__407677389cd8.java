/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_124
 *  net.minecraft.class_243
 *  net.minecraft.class_2487
 *  net.minecraft.class_2583
 *  net.minecraft.class_5251
 *  org.joml.Vector3f
 *  org.joml.Vector4f
 */
package dev.krypton;

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
import net.minecraft.class_124;
import net.minecraft.class_243;
import net.minecraft.class_2487;
import net.minecraft.class_2583;
import net.minecraft.class_5251;
import org.joml.Vector3f;
import org.joml.Vector4f;

public class _8B {
    public static final _8B cfr_renamed_36;
    public static final _8B cfr_renamed_404;
    public static final _8B cfr_renamed_2;
    public static final _8B cfr_renamed_4;
    public static final _8B cfr_renamed_8;
    public static final _8B cfr_renamed_362;
    public static final _8B cfr_renamed_405;
    public static final _8B cfr_renamed_3;
    public static final _8B cfr_renamed_7;
    public static final _8B cfr_renamed_5;
    public static final _8B cfr_renamed_1;
    public static final _8B cfr_renamed_406;
    public static final _8B cfr_renamed_238;
    public int cfr_renamed_367;
    public int cfr_renamed_9;
    public int cfr_renamed_0;
    public int cfr_renamed_6;
    private static int[] cfr_renamed_407;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static final Object[] e;
    private static final String[] f;

    public static int int_1(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        l2 = a ^ l2;
        return n >> _8B.a("r", 21714, (long)(0x6EE47838608100E6L ^ l2)) & _8B.a("r", 28568, (long)(0x2110E0763247BBA8L ^ l2));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public _8B dev_krypton_8B_1(Object[] var1_1) {
        block41: {
            block42: {
                block40: {
                    block38: {
                        block39: {
                            block36: {
                                block37: {
                                    block34: {
                                        block35: {
                                            var2_2 = (Long)var1_1[0];
                                            var4_3 = (var2_2 = _8B.a ^ var2_2) ^ 113369926189995L;
                                            var7_4 = 3;
                                            var8_5 /* !! */  = _8B.b("V", (Object)this, (long)-9080110295025223290L, (long)var2_2);
                                            var6_6 = _8B.cfr_renamed_0();
                                            var9_7 /* !! */  = _8B.b("V", (Object)this, (long)-9082688544565505592L, (long)var2_2);
                                            var10_8 = _8B.b("V", (Object)this, (long)-9080979926564307298L, (long)var2_2);
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    v0 /* !! */  = var8_5 /* !! */ ;
                                                                    if (var6_6 != null) break block34;
                                                                    if (v0 /* !! */  != false) break block35;
                                                                }
                                                                catch (NumberFormatException v1) {
                                                                    throw _8B.a(v1);
                                                                }
                                                                v0 /* !! */  = var9_7 /* !! */ ;
                                                                if (var6_6 != null) break block34;
                                                            }
                                                            catch (NumberFormatException v2) {
                                                                throw _8B.a(v2);
                                                            }
                                                            if (v0 /* !! */  != false) break block35;
                                                        }
                                                        catch (NumberFormatException v3) {
                                                            throw _8B.a(v3);
                                                        }
                                                        v0 /* !! */  = var10_8;
                                                        v4 = var6_6;
                                                        if (var2_2 >= 0L) {
                                                            if (v4 != null) break block34;
                                                        }
                                                        ** GOTO lbl53
                                                    }
                                                    catch (NumberFormatException v5) {
                                                        throw _8B.a(v5);
                                                    }
                                                    if (v0 /* !! */  != false) break block35;
                                                }
                                                catch (NumberFormatException v6) {
                                                    throw _8B.a(v6);
                                                }
                                                return new _8B(var7_4, var7_4, var4_3, var7_4, (int)_8B.b("V", (Object)this, (long)-9079564240025697767L, (long)var2_2));
                                            }
                                            catch (NumberFormatException v7) {
                                                throw _8B.a(v7);
                                            }
                                        }
                                        v0 /* !! */  = var8_5 /* !! */ ;
                                    }
                                    try {
                                        try {
                                            try {
                                                v4 = var6_6;
lbl53:
                                                // 2 sources

                                                if (v4 != null) break block36;
                                                if (v0 /* !! */  <= 0) break block37;
                                            }
                                            catch (NumberFormatException v8) {
                                                throw _8B.a(v8);
                                            }
                                            v0 /* !! */  = var8_5 /* !! */ ;
                                            v9 = var6_6;
                                            if (var2_2 > 0L) {
                                                if (v9 != null) break block36;
                                            }
                                            ** GOTO lbl78
                                        }
                                        catch (NumberFormatException v10) {
                                            throw _8B.a(v10);
                                        }
                                        if (v0 /* !! */  >= var7_4) break block37;
                                    }
                                    catch (NumberFormatException v11) {
                                        throw _8B.a(v11);
                                    }
                                    var8_5 /* !! */  = (CallSite)var7_4;
                                }
                                v0 /* !! */  = var9_7 /* !! */ ;
                            }
                            try {
                                try {
                                    try {
                                        v9 = var6_6;
lbl78:
                                        // 2 sources

                                        if (v9 != null) break block38;
                                        if (v0 /* !! */  <= 0) break block39;
                                    }
                                    catch (NumberFormatException v12) {
                                        throw _8B.a(v12);
                                    }
                                    v0 /* !! */  = var9_7 /* !! */ ;
                                    v13 = var6_6;
                                    if (var2_2 > 0L) {
                                        if (v13 != null) break block38;
                                    }
                                    ** GOTO lbl101
                                }
                                catch (NumberFormatException v14) {
                                    throw _8B.a(v14);
                                }
                                if (v0 /* !! */  >= var7_4) break block39;
                            }
                            catch (NumberFormatException v15) {
                                throw _8B.a(v15);
                            }
                            var9_7 /* !! */  = (CallSite)var7_4;
                        }
                        v0 /* !! */  = var10_8;
                    }
                    try {
                        v13 = var6_6;
lbl101:
                        // 2 sources

                        if (var2_2 >= 0L) {
                            if (v13 != null) break block40;
                            if (v0 /* !! */  <= 0) break block41;
                        }
                        ** GOTO lbl113
                    }
                    catch (NumberFormatException v16) {
                        throw _8B.a(v16);
                    }
                    v0 /* !! */  = var10_8;
                }
                try {
                    try {
                        v13 = var6_6;
lbl113:
                        // 2 sources

                        if (v13 != null) break block42;
                        if (v0 /* !! */  >= var7_4) break block41;
                    }
                    catch (NumberFormatException v17) {
                        throw _8B.a(v17);
                    }
                    v0 /* !! */  = (CallSite)var7_4;
                }
                catch (NumberFormatException v18) {
                    throw _8B.a(v18);
                }
            }
            var10_8 = v0 /* !! */ ;
        }
        return new _8B((int)_8B.b("\u00c2", (int)((int)((double)var8_5 /* !! */  / 0.7)), (int)_8B.a("r", (int)28568, (long)(2382605605555084996L ^ var2_2)), (long)-9079838580788290881L, (long)var2_2), (int)_8B.b("\u00c2", (int)((int)((double)var9_7 /* !! */  / 0.7)), (int)_8B.a("r", (int)28568, (long)(2382605605555084996L ^ var2_2)), (long)-9079838580788290881L, (long)var2_2), var4_3, (int)_8B.b("\u00c2", (int)((int)((double)var10_8 / 0.7)), (int)_8B.a("r", (int)28568, (long)(2382605605555084996L ^ var2_2)), (long)-9079838580788290881L, (long)var2_2), (int)_8B.b("V", (Object)this, (long)-9079564240025697767L, (long)var2_2));
    }

    public static int cfr_renamed_408(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = a ^ l2;
        return n & _8B.a("r", 2266, (long)(0x5F06AB024DA3859CL ^ l2));
    }

    public _8B cfr_renamed_330(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        long l3 = (l2 = a ^ l2) ^ 0x6A46222FA192L;
        _8B.b("\u00f6", (Object)this, (int)n, -6044461945795710982L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _8B.b("\u00cc", (Object)this, (Object)objectArray2, -6044235806208972416L, (long)l2);
        return this;
    }

    public _8B cfr_renamed_291(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = (l2 = a ^ l2) ^ 0x4B599056AE59L;
        _8B.b("\u00f6", (Object)this, (int)n, -6641402782978319442L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _8B.b("\u00cc", (Object)this, (Object)objectArray2, -6641210135910898101L, (long)l2);
        return this;
    }

    public int cfr_renamed_171(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = a ^ l2) ^ 0x1E2F9F9729AL;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = (int)_8B.b("V", (Object)this, 2852054469354153075L, (long)l2);
        objectArray2[3] = (int)_8B.b("V", (Object)this, 2851764682185300212L, (long)l2);
        objectArray2[2] = (int)_8B.b("V", (Object)this, 2853504134260160418L, (long)l2);
        objectArray2[1] = l3;
        objectArray2[0] = (int)_8B.b("V", (Object)this, 2852634315335000044L, (long)l2);
        return (int)_8B.b("\u00c2", (Object)objectArray2, 2852291459654753263L, (long)l2);
    }

    public _8B(long l2) {
        long l3 = (l2 = a ^ l2) ^ 0x6846F273A85DL;
        this((int)_8B.a("r", 28568, (long)(0x2110B871BAA97532L ^ l2)), (int)_8B.a("r", 28568, (long)(0x2110B871BAA97532L ^ l2)), l3, (int)_8B.a("r", 28568, (long)(0x2110B871BAA97532L ^ l2)), (int)_8B.a("r", 28568, (long)(0x2110B871BAA97532L ^ l2)));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public _8B(class_2583 class_25832, long l2) {
        block7: {
            CallSite callSite;
            long l3;
            block5: {
                long l4 = l2 = a ^ l2;
                long l5 = l4 ^ 0x59669C413DF6L;
                long l6 = l4 ^ 0x215C2CD0CB92L;
                l3 = l4 ^ 0x78252C61E48DL;
                long l7 = l4 ^ 0xA75EC4066FDL;
                int[] nArray = _8B.cfr_renamed_0();
                callSite = _8B.b("\u00cc", (Object)class_25832, 8122494049876673632L, (long)l2);
                try {
                    block6: {
                        try {
                            if (nArray != null) break block5;
                            if (callSite != null) break block6;
                            _8B.b("\u00f6", (Object)this, (int)_8B.a("r", 28568, (long)(0x21108E2DCF81EF8EL ^ l2)), 8121906349128911052L, (long)l2);
                            _8B.b("\u00f6", (Object)this, (int)_8B.a("r", 28568, (long)(0x21108E2DCF81EF8EL ^ l2)), 8122795967853305986L, (long)l2);
                            _8B.b("\u00f6", (Object)this, (int)_8B.a("r", 28568, (long)(0x21108E2DCF81EF8EL ^ l2)), 8121074108266483668L, (long)l2);
                            _8B.b("\u00f6", (Object)this, (int)_8B.a("r", 28568, (long)(0x21108E2DCF81EF8EL ^ l2)), 8121346292469936979L, (long)l2);
                            if (nArray == null) break block7;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw _8B.a(numberFormatException);
                        }
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = (int)_8B.b("\u00cc", (Object)callSite, 8121770492877594822L, (long)l2);
                    objectArray[0] = l6;
                    _8B.b("\u00f6", (Object)this, (int)_8B.b("\u00c2", (Object)objectArray, 8121561320051390937L, (long)l2), 8121906349128911052L, (long)l2);
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = l7;
                    objectArray2[0] = (int)_8B.b("\u00cc", (Object)callSite, 8121770492877594822L, (long)l2);
                    _8B.b("\u00f6", (Object)this, (int)_8B.b("\u00c2", (Object)objectArray2, 8122062287237410926L, (long)l2), 8122795967853305986L, (long)l2);
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l5;
                    objectArray3[0] = (int)_8B.b("\u00cc", (Object)callSite, 8121770492877594822L, (long)l2);
                    _8B.b("\u00f6", (Object)this, (int)_8B.b("\u00c2", (Object)objectArray3, 8121510997086648908L, (long)l2), 8121074108266483668L, (long)l2);
                }
                catch (NumberFormatException numberFormatException) {
                    throw _8B.a(numberFormatException);
                }
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = (int)_8B.b("\u00cc", (Object)callSite, 8121770492877594822L, (long)l2);
            objectArray[0] = l3;
            _8B.b("\u00f6", (Object)this, (int)_8B.b("\u00c2", (Object)objectArray, 8122423650717211331L, (long)l2), 8121346292469936979L, (long)l2);
        }
    }

    public _8B(long l2, float f, float f2, float f3, float f4) {
        long l3 = (l2 = a ^ l2) ^ 0x76956BD34E2L;
        _8B.b("\u00f6", (Object)this, (int)((int)(f * 255.0f)), 4138723856877797653L, (long)l2);
        _8B.b("\u00f6", (Object)this, (int)((int)(f2 * 255.0f)), 4134456482599823707L, (long)l2);
        _8B.b("\u00f6", (Object)this, (int)((int)(f3 * 255.0f)), 4137300071981762061L, (long)l2);
        _8B.b("\u00f6", (Object)this, (int)((int)(f4 * 255.0f)), 4138153633032731274L, (long)l2);
        Object[] objectArray = new Object[1];
        objectArray[0] = l3;
        _8B.b("\u00cc", (Object)this, (Object)objectArray, 4138494291614186736L, (long)l2);
    }

    public _8B(int n, class_124 class_1242, short s, short s2) {
        block6: {
            long l2;
            long l3 = l2 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)s2 << 48 >>> 48) ^ a;
            long l4 = l3 ^ 0xF5F2E74640L;
            long l5 = l3 ^ 0x78CF4276B024L;
            long l6 = l3 ^ 0x21B642C79F3BL;
            long l7 = l3 ^ 0x53E682E61D4BL;
            int[] nArray = _8B.cfr_renamed_0();
            if (nArray == null) {
                try {
                    block5: {
                        try {
                            if (_8B.b("\u00cc", (Object)class_1242, 792735464504092431L, (long)l2) == false) break block5;
                            Object[] objectArray = new Object[2];
                            objectArray[1] = (int)_8B.b("\u00cc", (Object)_8B.b("\u00cc", (Object)class_1242, 796597188530105996L, (long)l2), 796903588209584995L, (long)l2);
                            objectArray[0] = l5;
                            _8B.b("\u00f6", (Object)this, (int)_8B.b("\u00c2", (Object)objectArray, 793703835730264687L, (long)l2), 792799945483088762L, (long)l2);
                            Object[] objectArray2 = new Object[2];
                            objectArray2[1] = l7;
                            objectArray2[0] = (int)_8B.b("\u00cc", (Object)_8B.b("\u00cc", (Object)class_1242, 796597188530105996L, (long)l2), 796903588209584995L, (long)l2);
                            _8B.b("\u00f6", (Object)this, (int)_8B.b("\u00c2", (Object)objectArray2, 792920564074777560L, (long)l2), 797047481307847476L, (long)l2);
                            Object[] objectArray3 = new Object[2];
                            objectArray3[1] = l4;
                            objectArray3[0] = (int)_8B.b("\u00cc", (Object)_8B.b("\u00cc", (Object)class_1242, 796597188530105996L, (long)l2), 796903588209584995L, (long)l2);
                            _8B.b("\u00f6", (Object)this, (int)_8B.b("\u00c2", (Object)objectArray3, 793546865829298682L, (long)l2), 794181976016745570L, (long)l2);
                            Object[] objectArray4 = new Object[2];
                            objectArray4[1] = (int)_8B.b("\u00cc", (Object)_8B.b("\u00cc", (Object)class_1242, 796597188530105996L, (long)l2), 796903588209584995L, (long)l2);
                            objectArray4[0] = l6;
                            _8B.b("\u00f6", (Object)this, (int)_8B.b("\u00c2", (Object)objectArray4, 796852179315810677L, (long)l2), 793347117232769253L, (long)l2);
                            if (nArray == null) break block6;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw _8B.a(numberFormatException);
                        }
                    }
                    _8B.b("\u00f6", (Object)this, (int)_8B.a("r", 28568, (long)(0x2110D7BEA1279438L ^ l2)), 792799945483088762L, (long)l2);
                    _8B.b("\u00f6", (Object)this, (int)_8B.a("r", 28568, (long)(0x2110D7BEA1279438L ^ l2)), 797047481307847476L, (long)l2);
                    _8B.b("\u00f6", (Object)this, (int)_8B.a("r", 28568, (long)(0x2110D7BEA1279438L ^ l2)), 794181976016745570L, (long)l2);
                }
                catch (NumberFormatException numberFormatException) {
                    throw _8B.a(numberFormatException);
                }
            }
            _8B.b("\u00f6", (Object)this, (int)_8B.a("r", 28568, (long)(0x2110D7BEA1279438L ^ l2)), 793347117232769253L, (long)l2);
        }
    }

    public _8B(_8B b, char c, int n, short s) {
        long l2 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48) ^ a;
        _8B.b("\u00f6", (Object)this, (int)_8B.b("V", (Object)b, -6125546945839345017L, (long)l2), -6125546945839345017L, (long)l2);
        _8B.b("\u00f6", (Object)this, (int)_8B.b("V", (Object)b, -6128670467247375671L, (long)l2), -6128670467247375671L, (long)l2);
        _8B.b("\u00f6", (Object)this, (int)_8B.b("V", (Object)b, -6126944343462947425L, (long)l2), -6126944343462947425L, (long)l2);
        _8B.b("\u00f6", (Object)this, (int)_8B.b("V", (Object)b, -6124983283629496040L, (long)l2), -6124983283629496040L, (long)l2);
    }

    public _8B(int n, short s, int n2, short s2) {
        long l2;
        long l3 = l2 = ((long)s << 48 | (long)n2 << 32 >>> 16 | (long)s2 << 48 >>> 48) ^ a;
        long l4 = l3 ^ 0x55B10ED0B01FL;
        long l5 = l3 ^ 0x2D8BBE41467BL;
        long l6 = l3 ^ 0x74F2BEF06964L;
        long l7 = l3 ^ 0x6A27ED1EB14L;
        Object[] objectArray = new Object[2];
        objectArray[1] = n;
        objectArray[0] = l5;
        _8B.b("\u00f6", (Object)this, (int)_8B.b("\u00c2", (Object)objectArray, -190109777871326160L, (long)l2), -189219227834514139L, (long)l2);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l7;
        objectArray2[0] = n;
        _8B.b("\u00f6", (Object)this, (int)_8B.b("\u00c2", (Object)objectArray2, -189625856871596665L, (long)l2), -193378587979633301L, (long)l2);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = n;
        _8B.b("\u00f6", (Object)this, (int)_8B.b("\u00c2", (Object)objectArray3, -190158408029653083L, (long)l2), -190605802341858755L, (long)l2);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = n;
        objectArray4[0] = l6;
        _8B.b("\u00f6", (Object)this, (int)_8B.b("\u00c2", (Object)objectArray4, -193186867914827990L, (long)l2), -189751813815484742L, (long)l2);
    }

    public _8B(long l2, class_5251 class_52512) {
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x7D0871FCF031L;
        long l5 = l3 ^ 0x532C16D0655L;
        long l6 = l3 ^ 0x5C4BC1DC294AL;
        long l7 = l3 ^ 0x2E1B01FDAB3AL;
        Object[] objectArray = new Object[2];
        objectArray[1] = (int)_8B.b("\u00cc", (Object)class_52512, -4795920918624195327L, (long)l2);
        objectArray[0] = l5;
        _8B.b("\u00f6", (Object)this, (int)_8B.b("\u00c2", (Object)objectArray, -4795576505867766754L, (long)l2), -4795794137617251061L, (long)l2);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l7;
        objectArray2[0] = (int)_8B.b("\u00cc", (Object)class_52512, -4795920918624195327L, (long)l2);
        _8B.b("\u00f6", (Object)this, (int)_8B.b("\u00c2", (Object)objectArray2, -4796200627474776663L, (long)l2), -4792160356914762427L, (long)l2);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = (int)_8B.b("\u00cc", (Object)class_52512, -4795920918624195327L, (long)l2);
        _8B.b("\u00f6", (Object)this, (int)_8B.b("\u00c2", (Object)objectArray3, -4795696616390854773L, (long)l2), -4794928765981081069L, (long)l2);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = (int)_8B.b("\u00cc", (Object)class_52512, -4795920918624195327L, (long)l2);
        objectArray4[0] = l6;
        _8B.b("\u00f6", (Object)this, (int)_8B.b("\u00c2", (Object)objectArray4, -4791969468399560956L, (long)l2), -4795219787382325612L, (long)l2);
    }

    public _8B(int n, long l2, int n2, int n3) {
        long l3 = (l2 = a ^ l2) ^ 0x54D10DF072E0L;
        _8B.b("\u00f6", (Object)this, (int)n, 9182242415810938647L, (long)l2);
        _8B.b("\u00f6", (Object)this, (int)n2, 9179138668430962521L, (long)l2);
        _8B.b("\u00f6", (Object)this, (int)n3, 9180860274010652687L, (long)l2);
        _8B.b("\u00f6", (Object)this, (int)_8B.a("r", 28568, (long)(0x2110A034E2BFE055L ^ l2)), 9182839046188383368L, (long)l2);
        Object[] objectArray = new Object[1];
        objectArray[0] = l3;
        _8B.b("\u00cc", (Object)this, (Object)objectArray, 9181908465393105650L, (long)l2);
    }

    public _8B(int n, int n2, long l2, int n3, int n4) {
        long l3 = (l2 = a ^ l2) ^ 0x32AC7632FF71L;
        _8B.b("\u00f6", (Object)this, (int)n, -937726537830167930L, (long)l2);
        _8B.b("\u00f6", (Object)this, (int)n2, -940197335879408952L, (long)l2);
        _8B.b("\u00f6", (Object)this, (int)n3, -938558812315185762L, (long)l2);
        _8B.b("\u00f6", (Object)this, (int)n4, -937143409411903207L, (long)l2);
        Object[] objectArray = new Object[1];
        objectArray[0] = l3;
        _8B.b("\u00cc", (Object)this, (Object)objectArray, -937356320574867613L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                _8B.a = l.a(-8764848666940224229L, -8171681614763145143L, MethodHandles.lookup().lookupClass()).a(273597347387068L);
                var11 = _8B.a ^ 30398172892144L;
                var13_1 = var11 ^ 88995381408916L;
                _8B.e = new Object[51];
                _8B.f = new String[51];
                _8B.a();
                _8B.d = new HashMap<K, V>(13);
                _8B.cfr_renamed_6(null);
                var0_2 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var1_3 = 1; var1_3 < 8; ++var1_3) {
                    v2 = v2;
                    v2[var1_3] = (byte)(var11 << var1_3 * 8 >>> 56);
                }
                var0_2.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var6_4 = new long[22];
                var3_5 = 0;
                var4_6 = "D\u0011p9\u00b8\u0099\u009b8\u00de\u001f\u00f0]|\u00f9:\u00fbl\u00a7\u00fa=G\u00ec@F\u0095\u00b1\u00b4\u00f8|\u00ec\u00ef\u00fa\u00e3\u00df\u00c9CP\u008d\u00a6\u009a*\u00c1\u0012\u00b3\u0082\u00ffp3\u00f9\u00ec\u00b5^\u00fb\u00d8\u0081\u00fc\u001d\u00d6\u00af\u00d3\u00b19\u0016;\u0014\u00c3.kw5\u0098\u00e3&K!\u00ff#\u00c3\u0005\u0087?m\u00fb\u00b3 \u001d\u0089\u0001\u0016d5)\u0086\u00cd\u00d5\u0081\u0085\u00cf\u008e\u00ce\u0091\u00d6\u00a5\u00de\u00a8\u00a6k\u00b4\u00e1\u0096K\u00e3i\u0002\u0096\u0092\u00e9\u00e0]\u0012\u00fbPi\u00acUd\u00e13\u00f1\u00f7?\u00d4\u00a5k\u00b0\u000bst\u00b4\u0085M)j\u00c2!\u00e5fx\u00c0n\u00c2\u00a85\u00df\u00ca\u00b2Rq\u00ad/";
                var5_7 = "D\u0011p9\u00b8\u0099\u009b8\u00de\u001f\u00f0]|\u00f9:\u00fbl\u00a7\u00fa=G\u00ec@F\u0095\u00b1\u00b4\u00f8|\u00ec\u00ef\u00fa\u00e3\u00df\u00c9CP\u008d\u00a6\u009a*\u00c1\u0012\u00b3\u0082\u00ffp3\u00f9\u00ec\u00b5^\u00fb\u00d8\u0081\u00fc\u001d\u00d6\u00af\u00d3\u00b19\u0016;\u0014\u00c3.kw5\u0098\u00e3&K!\u00ff#\u00c3\u0005\u0087?m\u00fb\u00b3 \u001d\u0089\u0001\u0016d5)\u0086\u00cd\u00d5\u0081\u0085\u00cf\u008e\u00ce\u0091\u00d6\u00a5\u00de\u00a8\u00a6k\u00b4\u00e1\u0096K\u00e3i\u0002\u0096\u0092\u00e9\u00e0]\u0012\u00fbPi\u00acUd\u00e13\u00f1\u00f7?\u00d4\u00a5k\u00b0\u000bst\u00b4\u0085M)j\u00c2!\u00e5fx\u00c0n\u00c2\u00a85\u00df\u00ca\u00b2Rq\u00ad/".length();
                var2_8 = 0;
                while (true) {
                    var7_9 = var4_6.substring(var2_8, var2_8 += 8).getBytes("ISO-8859-1");
                    v3 = var6_4;
                    v4 = var3_5++;
                    v5 = ((long)var7_9[0] & 255L) << 56 | ((long)var7_9[1] & 255L) << 48 | ((long)var7_9[2] & 255L) << 40 | ((long)var7_9[3] & 255L) << 32 | ((long)var7_9[4] & 255L) << 24 | ((long)var7_9[5] & 255L) << 16 | ((long)var7_9[6] & 255L) << 8 | (long)var7_9[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl32:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var2_8 < var5_7) ** continue;
                    var4_6 = "\u0092k'N\u0017\u00bf\u00a9\u00fe=\u0084\b|\u0000\u0098q\u00cf";
                    var5_7 = "\u0092k'N\u0017\u00bf\u00a9\u00fe=\u0084\b|\u0000\u0098q\u00cf".length();
                    var2_8 = 0;
                    while (true) {
                        var7_9 = var4_6.substring(var2_8, var2_8 += 8).getBytes("ISO-8859-1");
                        v3 = var6_4;
                        v4 = var3_5++;
                        v5 = ((long)var7_9[0] & 255L) << 56 | ((long)var7_9[1] & 255L) << 48 | ((long)var7_9[2] & 255L) << 40 | ((long)var7_9[3] & 255L) << 32 | ((long)var7_9[4] & 255L) << 24 | ((long)var7_9[5] & 255L) << 16 | ((long)var7_9[6] & 255L) << 8 | (long)var7_9[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl45:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var2_8 < var5_7) ** continue;
                    break block9;
                    break;
                }
            }
            var8_10 = v5;
            var10_11 = var0_2.doFinal(new byte[]{(byte)(var8_10 >>> 56), (byte)(var8_10 >>> 48), (byte)(var8_10 >>> 40), (byte)(var8_10 >>> 32), (byte)(var8_10 >>> 24), (byte)(var8_10 >>> 16), (byte)(var8_10 >>> 8), (byte)var8_10});
            v7 = ((long)var10_11[0] & 255L) << 56 | ((long)var10_11[1] & 255L) << 48 | ((long)var10_11[2] & 255L) << 40 | ((long)var10_11[3] & 255L) << 32 | ((long)var10_11[4] & 255L) << 24 | ((long)var10_11[5] & 255L) << 16 | ((long)var10_11[6] & 255L) << 8 | (long)var10_11[7] & 255L;
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
        _8B.b = var6_4;
        _8B.c = new Integer[22];
        _8B.cfr_renamed_36 = new _8B((int)_8B.a("r", (int)28568, (long)(2382657893326398570L ^ var11)), var13_1, (int)_8B.a("r", (int)28568, (long)(2382657893326398570L ^ var11)), (int)_8B.a("r", (int)28568, (long)(2382657893326398570L ^ var11)));
        _8B.cfr_renamed_404 = new _8B((int)_8B.a("r", (int)4665, (long)(7076987931829459406L ^ var11)), var13_1, (int)_8B.a("r", (int)25161, (long)(4980965419497564595L ^ var11)), (int)_8B.a("r", (int)25161, (long)(4980965419497564595L ^ var11)));
        _8B.cfr_renamed_2 = new _8B((int)_8B.a("r", (int)29600, (long)(693273591763187796L ^ var11)), var13_1, (int)_8B.a("r", (int)28281, (long)(2682637968497059229L ^ var11)), (int)_8B.a("r", (int)28281, (long)(2682637968497059229L ^ var11)));
        _8B.cfr_renamed_4 = new _8B((int)_8B.a("r", (int)12739, (long)(4939227263913032243L ^ var11)), var13_1, (int)_8B.a("r", (int)5634, (long)(9183152383372189178L ^ var11)), (int)_8B.a("r", (int)5634, (long)(9183152383372189178L ^ var11)));
        _8B.cfr_renamed_8 = new _8B(0, var13_1, 0, 0);
        _8B.cfr_renamed_362 = new _8B((int)_8B.a("r", (int)28568, (long)(2382657893326398570L ^ var11)), var13_1, 0, 0);
        _8B.cfr_renamed_405 = new _8B((int)_8B.a("r", (int)28568, (long)(2382657893326398570L ^ var11)), var13_1, (int)_8B.a("r", (int)18589, (long)(2258768938385408878L ^ var11)), (int)_8B.a("r", (int)11887, (long)(3153617945834743190L ^ var11)));
        _8B.cfr_renamed_3 = new _8B((int)_8B.a("r", (int)28568, (long)(2382657893326398570L ^ var11)), var13_1, (int)_8B.a("r", (int)27376, (long)(5933440576935305485L ^ var11)), 0);
        _8B.cfr_renamed_7 = new _8B((int)_8B.a("r", (int)28568, (long)(2382657893326398570L ^ var11)), var13_1, (int)_8B.a("r", (int)28568, (long)(2382657893326398570L ^ var11)), 0);
        _8B.cfr_renamed_5 = new _8B(0, var13_1, (int)_8B.a("r", (int)28568, (long)(2382657893326398570L ^ var11)), 0);
        _8B.cfr_renamed_1 = new _8B((int)_8B.a("r", (int)28568, (long)(2382657893326398570L ^ var11)), var13_1, 0, (int)_8B.a("r", (int)28568, (long)(2382657893326398570L ^ var11)));
        _8B.cfr_renamed_406 = new _8B(0, var13_1, (int)_8B.a("r", (int)28568, (long)(2382657893326398570L ^ var11)), (int)_8B.a("r", (int)28568, (long)(2382657893326398570L ^ var11)));
        _8B.cfr_renamed_238 = new _8B(0, var13_1, 0, (int)_8B.a("r", (int)28568, (long)(2382657893326398570L ^ var11)));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean equals(Object object) {
        Object object2;
        block30: {
            CallSite callSite;
            block32: {
                _8B b;
                int[] nArray;
                long l2;
                block31: {
                    block29: {
                        Object object3;
                        block27: {
                            Object object4;
                            block25: {
                                l2 = a ^ 0x5AF2B3A20ADFL;
                                nArray = _8B.cfr_renamed_0();
                                try {
                                    try {
                                        object4 = this;
                                        if (nArray != null) break block25;
                                        if (object4 == object) {
                                            return true;
                                        }
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw _8B.a(numberFormatException);
                                    }
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw _8B.a(numberFormatException);
                                }
                                object4 = object;
                            }
                            try {
                                try {
                                    try {
                                        if (object4 == null) return false;
                                        object3 = this.getClass();
                                        if (nArray != null) break block27;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw _8B.a(numberFormatException);
                                    }
                                    if (object3 != object.getClass()) {
                                        return false;
                                    }
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw _8B.a(numberFormatException);
                                }
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw _8B.a(numberFormatException);
                            }
                            object3 = object;
                        }
                        b = (_8B)object3;
                        try {
                            try {
                                object2 = _8B.b("V", (Object)this, -5008593177146408441L, (long)l2);
                                callSite = _8B.b("V", (Object)b, -5008593177146408441L, (long)l2);
                                if (nArray != null) break block29;
                                if (object2 != callSite) break block30;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw _8B.a(numberFormatException);
                            }
                            object2 = _8B.b("V", (Object)this, -5011699183679116727L, (long)l2);
                            callSite = _8B.b("V", (Object)b, -5011699183679116727L, (long)l2);
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw _8B.a(numberFormatException);
                        }
                    }
                    try {
                        if (nArray != null) break block31;
                        if (object2 != callSite) break block30;
                        object2 = _8B.b("V", (Object)this, -5009990565275155169L, (long)l2);
                        callSite = _8B.b("V", (Object)b, -5009990565275155169L, (long)l2);
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw _8B.a(numberFormatException);
                    }
                }
                try {
                    try {
                        if (nArray != null) break block32;
                        if (object2 != callSite) break block30;
                        object2 = _8B.b("V", (Object)this, -5008010840143234664L, (long)l2);
                        if (nArray != null) return (boolean)object2;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw _8B.a(numberFormatException);
                    }
                    callSite = _8B.b("V", (Object)b, -5008010840143234664L, (long)l2);
                }
                catch (NumberFormatException numberFormatException) {
                    throw _8B.a(numberFormatException);
                }
            }
            if (object2 == callSite) {
                object2 = true;
                return (boolean)object2;
            }
        }
        object2 = false;
        return (boolean)object2;
    }

    public String toString() {
        long l2 = a ^ 0x673DF382DB09L;
        return (int)_8B.b("V", (Object)this, 7758535324927431633L, (long)l2) + " " + (int)_8B.b("V", (Object)this, 7756575052460473247L, (long)l2) + " " + (int)_8B.b("V", (Object)this, 7759365504406885577L, (long)l2) + " " + (int)_8B.b("V", (Object)this, 7757948866037819470L, (long)l2);
    }

    public int hashCode() {
        long l2 = a ^ 0x4EBDBA46E1B7L;
        CallSite callSite = _8B.b("V", (Object)this, 5842843572656318831L, (long)l2);
        reference var3_5 = _8B.a("r", 2176, (long)(0x35762ADF6E8F2922L ^ l2)) * callSite + _8B.b("V", (Object)this, 5844206024329003297L, (long)l2);
        var3_5 = _8B.a("r", 19059, (long)(0x2F9481DBF4266BC5L ^ l2)) * var3_5 + _8B.b("V", (Object)this, 5841419753063951991L, (long)l2);
        var3_5 = _8B.a("r", 19059, (long)(0x2F9481DBF4266BC5L ^ l2)) * var3_5 + _8B.b("V", (Object)this, 5843399503923647216L, (long)l2);
        return (int)var3_5;
    }

    public class_243 net_minecraft_class_243_9(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return new class_243((double)_8B.b("V", (Object)this, -2277988782733912040L, (long)l2) / 255.0, (double)_8B.b("V", (Object)this, -2274937476904865706L, (long)l2) / 255.0, (double)_8B.b("V", (Object)this, -2276602252215247104L, (long)l2) / 255.0);
    }

    public int int_9(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (int)_8B.b("V", (Object)this, -380052577265276286L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    public static _8B dev_krypton_8B_9(Object[] var0) {
        block17: {
            block18: {
                block15: {
                    block16: {
                        block13: {
                            block14: {
                                var1_1 = (Double)var0[0];
                                var3_2 = (Double)var0[1];
                                var5_3 = (Double)var0[2];
                                var7_4 = (Long)var0[3];
                                var9_5 = (var7_4 = _8B.a ^ var7_4) ^ 118021998372255L;
                                var11_6 = _8B.cfr_renamed_0();
                                try {
                                    v0 = var3_2;
                                    if (var11_6 != null) break block13;
                                    if (!(v0 <= 0.0)) break block14;
                                }
                                catch (NumberFormatException v1) {
                                    throw _8B.a(v1);
                                }
                                var23_7 = var5_3;
                                var25_9 = var5_3;
                                var27_11 = var5_3;
                                return new _8B((int)(var23_7 * 255.0), (int)(var25_9 * 255.0), var9_5, (int)(var27_11 * 255.0), (int)_8B.a("r", (int)28568, (long)(2382610225675057392L ^ var7_4)));
                            }
                            v0 = var1_1;
                        }
                        var12_13 = v0;
                        try {
                            cfr_temp_0 = var12_13 - 360.0;
                            v2 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                            if (var11_6 != null) break block15;
                            if (v2 < 0) break block16;
                        }
                        catch (NumberFormatException v3) {
                            throw _8B.a(v3);
                        }
                        var12_13 = 0.0;
                    }
                    v2 = (int)(var12_13 /= 60.0);
                }
                var22_14 = v2;
                var20_15 = var12_13 - (double)var22_14;
                var14_16 = var5_3 * (1.0 - var3_2);
                var16_17 = var5_3 * (1.0 - var3_2 * var20_15);
                var18_18 = var5_3 * (1.0 - var3_2 * (1.0 - var20_15));
                switch (var22_14) {
                    case 0: {
                        var23_8 = var5_3;
                        var25_10 = var18_18;
                        var27_12 = var14_16;
                        v4 = var11_6;
                        if (var7_4 < 0L) ** GOTO lbl55
                        if (v4 == null) break block17;
                    }
                    case 1: {
                        var23_8 = var16_17;
                        var25_10 = var5_3;
                        var27_12 = var14_16;
                        v4 = var11_6;
lbl55:
                        // 2 sources

                        if (var7_4 < 0L) ** GOTO lbl62
                        if (v4 == null) break block17;
                    }
                    case 2: {
                        var23_8 = var14_16;
                        var25_10 = var5_3;
                        var27_12 = var18_18;
                        v4 = var11_6;
lbl62:
                        // 2 sources

                        if (var7_4 <= 0L) ** GOTO lbl69
                        if (v4 == null) break block17;
                    }
                    case 3: {
                        var23_8 = var14_16;
                        var25_10 = var16_17;
                        var27_12 = var5_3;
                        v4 = var11_6;
lbl69:
                        // 2 sources

                        if (var7_4 < 0L) ** GOTO lbl77
                        if (v4 == null) break block17;
                    }
                    case 4: {
                        var23_8 = var18_18;
                        var25_10 = var14_16;
                        var27_12 = var5_3;
                        if (var7_4 <= 0L) break block18;
                        v4 = var11_6;
lbl77:
                        // 2 sources

                        if (v4 == null) ** break;
                    }
                }
                var23_8 = var5_3;
                var25_10 = var14_16;
            }
            var27_12 = var16_17;
        }
        return new _8B((int)(var23_8 * 255.0), (int)(var25_10 * 255.0), var9_5, (int)(var27_12 * 255.0), (int)_8B.a("r", (int)28568, (long)(2382610225675057392L ^ var7_4)));
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _8B.a(l2, l3);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                _8B.e[n] = clazz = Class.forName(f[n]);
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
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8B" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _8B.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _8B.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _8B.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _8B.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _8B.a(l2, l3);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = _8B.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _8B.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _8B.a(clazz3, string2, clazz2)) != null) {
                    _8B.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _8B.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _8B.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _8B.b(1606489037323124L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _8B.a(l2, l3);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = _8B.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _8B.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _8B.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _8B.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _8B.b(1606489037323124L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _8B.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _8B.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _8B.b(1606489037323124L, 0L);
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8B" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (f[n3] != null) {
            return n3;
        }
        Object object = e[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 58;
            case 1 -> 21;
            case 2 -> 53;
            case 3 -> 20;
            case 4 -> 36;
            case 5 -> 47;
            case 6 -> 56;
            case 7 -> 19;
            case 8 -> 37;
            case 9 -> 11;
            case 10 -> 16;
            case 11 -> 54;
            case 12 -> 8;
            case 13 -> 39;
            case 14 -> 14;
            case 15 -> 2;
            case 16 -> 4;
            case 17 -> 29;
            case 18 -> 46;
            case 19 -> 9;
            case 20 -> 43;
            case 21 -> 12;
            case 22 -> 35;
            case 23 -> 38;
            case 24 -> 33;
            case 25 -> 13;
            case 26 -> 25;
            case 27 -> 52;
            case 28 -> 55;
            case 29 -> 63;
            case 30 -> 3;
            case 31 -> 62;
            case 32 -> 18;
            case 33 -> 0;
            case 34 -> 34;
            case 35 -> 40;
            case 36 -> 48;
            case 37 -> 59;
            case 38 -> 27;
            case 39 -> 17;
            case 40 -> 60;
            case 41 -> 30;
            case 42 -> 24;
            case 43 -> 41;
            case 44 -> 44;
            case 45 -> 23;
            case 46 -> 6;
            case 47 -> 51;
            case 48 -> 15;
            case 49 -> 10;
            case 50 -> 49;
            case 51 -> 45;
            case 52 -> 26;
            case 53 -> 57;
            case 54 -> 28;
            case 55 -> 22;
            case 56 -> 61;
            case 57 -> 32;
            case 58 -> 50;
            case 59 -> 7;
            case 60 -> 42;
            case 61 -> 1;
            case 62 -> 31;
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
        _8B.f[n3] = new String(cArray);
        return n3;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _8B.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x70AA;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])d.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/8B", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _8B.c[n2] = n3;
        }
        return c[n2];
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _8B.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'V' || c == '\u00f6' || c == '\u00f4' || c == '\u00da') {
                field = _8B.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'V' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f6' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f4' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _8B.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00cc' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "r2T\u000e7'o'VO2{.\u0015";
        objectArray[1] = Integer.TYPE;
        _8B.f[1] = "java/lang/Integer";
        objectArray[2] = "\"{(D cW[#K1,6U(@5vB";
        objectArray[3] = Void.TYPE;
        _8B.f[3] = "java/lang/Void";
        objectArray[4] = "\u0012&\u001a\u0010aqg\u0006\u0011\u001fp>\u0006\b\u001a\u0014tdr";
        objectArray[5] = "JR46,\u0003?r?9=L^|429\u0016*";
        objectArray[6] = "+S\nczV^s\u0001lk\u0019?}\ngoCK";
        objectArray[7] = "J>@7~N?\u001eK8o\u0001^\u0010@3k[*";
        objectArray[8] = "DAoX WDAx\u0004,X^\nx\u001a,MY{.Dx\u000f";
        objectArray[9] = "_\fe!f(*,n.wgK\"e%s=?";
        objectArray[10] = ";y0w]I0v!8>D%p";
        objectArray[11] = "4_l%\f.4_{y\u0000!.\u0014{g\u00004)e*>Yt";
        objectArray[12] = "\u000fy\"s\u0001\u0017zY)|\u0010X\u001bW\"w\u0014\u0002o";
        objectArray[13] = "*g?4\u0019h_G4;\b'>I?0\f}J";
        objectArray[14] = "@5SUY\u001a@5D\tU\u0015Z~D\u0017U\u0000]\u000f\u0015O\fD";
        objectArray[15] = "'A)\u00077G,N8HJ_?I1\u0001";
        objectArray[16] = Double.TYPE;
        _8B.f[16] = "java/lang/Double";
        objectArray[17] = "<C)T;[Ic\"[*\u0014(m)P.N\\";
        objectArray[18] = "zT\u0002'a{q[\u0013h\u0006ydP\u0013#=";
        objectArray[19] = "c<\nPA4\u0016\u001c\u0001_P{k\u0004\u0012XY2\u0003";
        objectArray[20] = "UhF\u001ay!UhQFu.O#QXu;HR\u0003\u0006 ";
        objectArray[21] = Boolean.TYPE;
        _8B.f[21] = "java/lang/Boolean";
        objectArray[22] = "a\u0006\u001afq1j\t\u000b)\u0010?a\u0002\u000fs";
        objectArray[23] = "\u00143n9v+Fa\u007f(\t-Bz\u001f\"7xNdag52+r!jl&U7# \t0\u0015:z4wu\u0017p\u001f";
        objectArray[24] = "Y/4WwXB;k\t\u0019RT#P_}N__v\b)V\\!3\nc3";
        objectArray[25] = ":*c\b\u000b6u/c4NQap|W\u0016 64c\u000bq)4\u007fyZ\u000fl65\u001c";
        objectArray[26] = "\u001d\u000f*\u0011\u0002bR\n*-G\u0005UTeH\u0016{\u0010V/";
        objectArray[27] = "eN\rcY)~ZR=7:gDLov$r>^p[\"e\u0003Jl\nr\u000eF\t2R,p\u0003\u000bx7";
        objectArray[28] = "\u0013\u0019,j\u000e\u0010FI<i3\u0018\u0013U-j_*C\u0012w\rX\rDH#fC\u0019\u001b\u0016M";
        objectArray[29] = "/g/jvJ~$~x\nM}crsf\u007f* -,1(-{lliX/#(~\n\u0017h\"lhhF+s~\u0014";
        objectArray[30] = "Y|43#'\b?e!_ \u000bxi*3\u0012_<8rdE[`w5<5Y83'_";
        objectArray[31] = "JM\\\u00027\u0002\u0005H\\>te\u0011\u0017C]*\u0014FS\\\u0001M\u001dD\u0018FP3XFR#";
        objectArray[32] = "\u0014tm\u0014\u0001,[qm(FKO.rK\u001c:\u0018jm\u0017{3\u001a!wF\u0005v\u0018k\u0012";
        objectArray[33] = "BmH=(!F}BxXxFxB!4J\u0012<\u001fxi\u001dBvN&3 Vj\u001fvXe\u00154G(& \u0017~\"|7fSiO=!t\u0012\u0004";
        objectArray[34] = "\u001f`l\u0005}uM2}\u0014\u0002sA?\u001d\u001e<&E7c[>l !#Vgx^d!\u001c\u0002n\u001eix\b|+\u001c#\u001d";
        objectArray[35] = "\u0012D9e\u001e\u0018]A9YX\u007fI\u001e&:\u0003\u000e\u001eZ9fdEMZ>4\t\u0004[H\u007fY";
        objectArray[36] = "\u0012'-?\u0012*\u0010\u007fi-q?B?3 \u001d\r\u0015|l~OZW}c\"\u001f$\u0012\u007f)G";
        objectArray[37] = "\t+PE\u0002\u0000\\{@F?\b\tgQES:Y'\n\"Q]Y&W\u001cM\u0011\u0004+1";
        objectArray[38] = "`?\u0002c*4/:\u0002_l\u0016P\"Co5=.gA%";
        objectArray[39] = "J2C6tuN\"Is\u0004,N'I*h\u001e\u001dk\u0011}?IJ)E-ot^5\u0014}\u00041\u001dkL#zt\u001f!)5:yF5Wp83#";
        objectArray[40] = ",|\u0014O)Vcy\u0014so\u000f\u001crT\u00130Vm%\u0010\fl1d'[\u0016=O!%\u0011s";
        objectArray[41] = "mX$k% \"]$WaG6\u0002;486aF$h_?c\r>9!zaG[";
        objectArray[42] = "goP\u000f\u0004S(jP3OsWa\u0010S\u001dS&6TLA4/4\u001fV\u0010Jj6U3";
        objectArray[43] = "4\u001fo\u007f\u001aS{\u001aoC\\4oEp \u0007E8\u0001o|`L:Ju-\u001e\t8\u0000\u0010";
        objectArray[44] = "\u000fJd\u001c9;@Od {\\T\u0010{C$-\u0003Td\u001fCa[QcC3c\u0003\u0015q ";
        objectArray[45] = "f\u00034\u0004s\u0002d[p\u0016\u0010\u00176\u001b*\u001b|%aXuE/r#Yz\u0019~\ff[0|-\u0016%\u001f)\f/Na\rJ";
        objectArray[46] = "U\u0018?\u001a\u0002:\u001a\u001d?&C]\u001dCpC\u0016#XA:";
        objectArray[47] = ">H\u001cAXm*TM\u00113+/^\u0011]39%V\u0010J\u000e-9\u0007@!_?=\u0000AJ\n)oZp";
        objectArray[48] = "\u007f.\u001eBz\t-|\u000fS\u0005\u0004$p\b[\u0005\u0000.~\f\u001aa\u0011x.\t!o\u0004)tTE~Ryqo";
        objectArray[49] = ".Ix\u0004V_\u007f\n)\u0016*Sp\\!\u0016}\u0007-\n{B*\u0002i\f;\u0006HS*])";
        Object[] objectArray2 = objectArray;
        objectArray[50] = "gk5,9W(n5\u0010s0/0zu-Nj20";
    }

    public int int_0(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (int)_8B.b("V", (Object)this, 7511887748151061464L, (long)l2);
    }

    public _8B dev_krypton_8B_0(Object[] objectArray) {
        class_2487 class_24872 = (class_2487)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = (l2 = a ^ l2) ^ 0x779D80DB1E62L;
        _8B.b("\u00f6", (Object)this, (int)_8B.b("\u00cc", (Object)class_24872, (Object)"r", 0, 1436571552077889725L, (long)l2), 1436581895277439893L, (long)l2);
        _8B.b("\u00f6", (Object)this, (int)_8B.b("\u00cc", (Object)class_24872, (Object)"g", 0, 1436571552077889725L, (long)l2), 1432420318928585691L, (long)l2);
        _8B.b("\u00f6", (Object)this, (int)_8B.b("\u00cc", (Object)class_24872, (Object)"b", 0, 1436571552077889725L, (long)l2), 1435193122216602765L, (long)l2);
        _8B.b("\u00f6", (Object)this, (int)_8B.b("\u00cc", (Object)class_24872, (Object)"a", 0, 1436571552077889725L, (long)l2), 1436045994588262410L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _8B.b("\u00cc", (Object)this, (Object)objectArray2, 1436246227007247984L, (long)l2);
        return this;
    }

    public static float[] float_arr_0(Object[] objectArray) {
        float[] fArray;
        block21: {
            float f;
            float f2;
            float f3;
            block16: {
                long l2;
                block19: {
                    float f4;
                    float f5;
                    block20: {
                        reference v3;
                        int n;
                        float f6;
                        block17: {
                            reference var7_6;
                            int n2;
                            block18: {
                                Object object;
                                CallSite callSite;
                                int n3;
                                int n4;
                                block14: {
                                    block15: {
                                        float f7;
                                        block13: {
                                            block12: {
                                                reference v0;
                                                block11: {
                                                    l2 = (Long)objectArray[0];
                                                    n4 = (Integer)objectArray[1];
                                                    n2 = (Integer)objectArray[2];
                                                    n3 = (Integer)objectArray[3];
                                                    fArray = (float[])objectArray[4];
                                                    l2 = a ^ l2;
                                                    if (fArray == null) {
                                                        fArray = new float[3];
                                                    }
                                                    var7_6 = _8B.b("\u00c2", (int)n4, (int)_8B.b("\u00c2", (int)n2, (int)n3, 1146612471294462502L, (long)l2), 1146612471294462502L, (long)l2);
                                                    callSite = _8B.b("\u00c2", (int)n4, (int)_8B.b("\u00c2", (int)n2, (int)n3, 1145288938267317414L, (long)l2), 1145288938267317414L, (long)l2);
                                                    f3 = (float)var7_6 / 255.0f;
                                                    v0 = var7_6;
                                                    if (l2 <= 0L) break block11;
                                                    if (v0 == false) break block12;
                                                    v0 = var7_6 - callSite;
                                                }
                                                f2 = (float)v0 / (float)var7_6;
                                                if (l2 >= 0L) break block13;
                                            }
                                            f2 = 0.0f;
                                        }
                                        object = (f7 = f2 - 0.0f) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
                                        if (l2 < 0L) break block14;
                                        if (object != false) break block15;
                                        f = 0.0f;
                                        if (l2 >= 0L) break block16;
                                    }
                                    object = var7_6 - n4;
                                }
                                f5 = (float)object / (float)(var7_6 - callSite);
                                f4 = (float)(var7_6 - n2) / (float)(var7_6 - callSite);
                                f6 = (float)(var7_6 - n3) / (float)(var7_6 - callSite);
                                n = n4;
                                v3 = var7_6;
                                if (l2 <= 0L) break block17;
                                if (n != v3) break block18;
                                f = f6 - f4;
                                if (l2 > 0L) break block19;
                            }
                            n = n2;
                            v3 = var7_6;
                        }
                        if (n != v3) break block20;
                        f = 2.0f + f5 - f6;
                        if (l2 >= 0L) break block19;
                    }
                    f = 4.0f + f4 - f5;
                }
                f /= 6.0f;
                if (l2 < 0L) break block21;
                if (f < 0.0f) {
                    f += 1.0f;
                }
            }
            fArray[0] = f;
            fArray[1] = f2;
            fArray[2] = f3;
        }
        return fArray;
    }

    public class_5251 net_minecraft_class_5251_0(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = a ^ l2) ^ 0x2B76127A114L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        return _8B.b("\u00c2", (int)_8B.b("\u00cc", (Object)this, (Object)objectArray2, 3903078013352491461L, (long)l2), 3903326078103807651L, (long)l2);
    }

    public _8B dev_krypton_8B_6(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        long l3 = (l2 = a ^ l2) ^ 0x5C3EFC4422A3L;
        _8B.b("\u00f6", (Object)this, (int)n, 3399090895697662028L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _8B.b("\u00cc", (Object)this, (Object)objectArray2, 3400140710007810737L, (long)l2);
        return this;
    }

    public static int int_6(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = (Integer)objectArray[2];
        int n3 = (Integer)objectArray[3];
        int n4 = (Integer)objectArray[4];
        l2 = a ^ l2;
        return (n << _8B.a("r", 3258, (long)(0x62570672552319ACL ^ l2))) + (n2 << _8B.a("r", 16792, (long)(0x6A76C9731F6E5493L ^ l2))) + n3 + (n4 << _8B.a("r", 3793, (long)(0xDF91549C3571BC5L ^ l2)));
    }

    public _8B dev_krypton_8B_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        _8B b = (_8B)objectArray[1];
        long l3 = (l2 = a ^ l2) ^ 0x53E75B9E2F6L;
        _8B.b("\u00f6", (Object)this, (int)_8B.b("V", (Object)b, -1190162802507639039L, (long)l2), -1190162802507639039L, (long)l2);
        _8B.b("\u00f6", (Object)this, (int)_8B.b("V", (Object)b, -1192178385562321073L, (long)l2), -1192178385562321073L, (long)l2);
        _8B.b("\u00f6", (Object)this, (int)_8B.b("V", (Object)b, -1189330553926643687L, (long)l2), -1189330553926643687L, (long)l2);
        _8B.b("\u00f6", (Object)this, (int)_8B.b("V", (Object)b, -1190728646626857826L, (long)l2), -1190728646626857826L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _8B.b("\u00cc", (Object)this, (Object)objectArray2, -1190391801909744924L, (long)l2);
        return this;
    }

    public Vector4f org_joml_Vector4f_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return new Vector4f((float)_8B.b("V", (Object)this, 4406656352482542941L, (long)l2) / 255.0f, (float)_8B.b("V", (Object)this, 4406965429067476243L, (long)l2) / 255.0f, (float)_8B.b("V", (Object)this, 4405225840325542469L, (long)l2) / 255.0f, (float)_8B.b("V", (Object)this, 4406078703436201666L, (long)l2) / 255.0f);
    }

    public int int_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (int)_8B.b("V", (Object)this, 428902557146675860L, (long)l2);
    }

    public int int_3(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = a ^ l2) ^ 0x3A6F8A97FB2L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        return (int)_8B.b("\u00cc", (Object)this, (Object)objectArray2, -1689828599339817117L, (long)l2);
    }

    public static _8B dev_krypton_8B_3(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        long l2 = (Long)objectArray[1];
        float f2 = ((Float)objectArray[2]).floatValue();
        float f3 = ((Float)objectArray[3]).floatValue();
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x49C44CA43360L;
        long l5 = l3 ^ 0x6C17DE7CC7A5L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = Float.valueOf(f3);
        objectArray2[2] = l4;
        objectArray2[1] = Float.valueOf(f2);
        objectArray2[0] = Float.valueOf(f);
        CallSite callSite = _8B.b("\u00c2", (Object)objectArray2, -8791828502351356437L, (long)l2);
        return new _8B(callSite >> _8B.a("r", 30176, (long)(0x68BD6B30E2C100BBL ^ l2)) & _8B.a("r", 28568, (long)(0x2110BC2096A61ACAL ^ l2)), callSite >> _8B.a("r", 10130, (long)(0x7AB50F0AAED0D2D0L ^ l2)) & _8B.a("r", 28568, (long)(0x2110BC2096A61ACAL ^ l2)), l5, callSite & _8B.a("r", 28568, (long)(0x2110BC2096A61ACAL ^ l2)), (int)_8B.a("r", 28568, (long)(0x2110BC2096A61ACAL ^ l2)));
    }

    public Vector3f org_joml_Vector3f_3(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return new Vector3f((float)_8B.b("V", (Object)this, 2559656165997730815L, (long)l2) / 255.0f, (float)_8B.b("V", (Object)this, 2561000724836152241L, (long)l2) / 255.0f, (float)_8B.b("V", (Object)this, 2558236648922406119L, (long)l2) / 255.0f);
    }

    public static void cfr_renamed_6(int[] nArray) {
        cfr_renamed_407 = nArray;
    }

    public class_2487 net_minecraft_class_2487_3(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        class_2487 class_24872 = new class_2487();
        _8B.b("\u00cc", (Object)class_24872, (Object)"r", (int)_8B.b("V", (Object)this, 2204678878099465954L, (long)l2), 2204879875665714525L, (long)l2);
        _8B.b("\u00cc", (Object)class_24872, (Object)"g", (int)_8B.b("V", (Object)this, 2204422878720577196L, (long)l2), 2204879875665714525L, (long)l2);
        _8B.b("\u00cc", (Object)class_24872, (Object)"b", (int)_8B.b("V", (Object)this, 2206061053453132282L, (long)l2), 2204879875665714525L, (long)l2);
        _8B.b("\u00cc", (Object)class_24872, (Object)"a", (int)_8B.b("V", (Object)this, 2205224932083129725L, (long)l2), 2204879875665714525L, (long)l2);
        return class_24872;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean boolean_4(Object[] var1_1) {
        block14: {
            block18: {
                block17: {
                    var3_2 = (Long)var1_1[0];
                    var2_3 = (String)var1_1[1];
                    var3_2 = _8B.a ^ var3_2;
                    var5_4 = _8B.cfr_renamed_0();
                    var6_5 = _8B.b("\u00cc", var2_3, (Object)",", (long)-4797208329839771278L, (long)var3_2);
                    v0 /* !! */  = ((CallSite)var6_5).length;
                    if (var5_4 != null) ** GOTO lbl35
                    if (v0 /* !! */  == 3) break block14;
                    break block17;
                    catch (NumberFormatException v1) {
                        throw _8B.a(v1);
                    }
                }
                v0 /* !! */  = ((CallSite)var6_5).length;
                if (var5_4 != null) ** GOTO lbl35
                break block18;
                catch (NumberFormatException v2) {
                    throw _8B.a(v2);
                }
            }
            try {
                block19: {
                    if (v0 /* !! */  == 4) break block14;
                    break block19;
                    catch (NumberFormatException v3) {
                        throw _8B.a(v3);
                    }
                }
                return false;
            }
            catch (NumberFormatException v4) {
                throw _8B.a(v4);
            }
        }
        try {
            block15: {
                block16: {
                    v0 /* !! */  = (int)_8B.b("\u00c2", (Object)var6_5[0], (long)-4800325479503347356L, (long)var3_2);
lbl35:
                    // 3 sources

                    var7_6 = v0 /* !! */ ;
                    var8_8 = _8B.b("\u00c2", (Object)var6_5[1], (long)-4800325479503347356L, (long)var3_2);
                    var9_9 = _8B.b("\u00c2", (Object)var6_5[2], (long)-4800325479503347356L, (long)var3_2);
                    v5 /* !! */  = ((CallSite)var6_5).length;
                    if (var5_4 != null) break block15;
                    try {
                        block20: {
                            if (v5 /* !! */  != 4) break block16;
                            break block20;
                            catch (NumberFormatException v6) {
                                throw _8B.a(v6);
                            }
                        }
                        v5 /* !! */  = (int)_8B.b("\u00c2", (Object)var6_5[3], (long)-4800325479503347356L, (long)var3_2);
                        break block15;
                    }
                    catch (NumberFormatException v7) {
                        throw _8B.a(v7);
                    }
                }
                v5 /* !! */  = (int)_8B.b("V", (Object)this, (long)-4797265203314819445L, (long)var3_2);
            }
            var10_10 = v5 /* !! */ ;
            _8B.b("\u00f6", (Object)this, (int)var7_6, (long)-4796704067611441900L, (long)var3_2);
            _8B.b("\u00f6", (Object)this, (int)var8_8, (long)-4800390530383483558L, (long)var3_2);
            _8B.b("\u00f6", (Object)this, (int)var9_9, (long)-4797538643292962292L, (long)var3_2);
            _8B.b("\u00f6", (Object)this, (int)var10_10, (long)-4797265203314819445L, (long)var3_2);
            return true;
        }
        catch (NumberFormatException var7_7) {
            return false;
        }
    }

    public static int int_4(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        l2 = a ^ l2;
        return n >> _8B.a("r", 30176, (long)(0x68BD6E1F46918EC6L ^ l2)) & _8B.a("r", 28568, (long)(0x2110B90F32F694B7L ^ l2));
    }

    public _8B dev_krypton_8B_4(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        long l3 = (l2 = a ^ l2) ^ 0x27AF577644C7L;
        _8B.b("\u00f6", (Object)this, (int)n, 5279813613507778942L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _8B.b("\u00cc", (Object)this, (Object)objectArray2, 5281528738569145557L, (long)l2);
        return this;
    }

    /*
     * Unable to fully structure code
     */
    public void void_4(Object[] var1_1) {
        block36: {
            block35: {
                block34: {
                    block33: {
                        block32: {
                            block31: {
                                block30: {
                                    block29: {
                                        var2_2 = (Long)var1_1[0];
                                        var2_2 = _8B.a ^ var2_2;
                                        try {
                                            if (_8B.b("V", (Object)this, (long)-4816984097837005476L, (long)var2_2) >= 0) break block29;
                                            _8B.b("\u00f6", (Object)this, (int)_8B.a("r", (int)1613, (long)(1611427928355425228L ^ var2_2)), (long)-4816984097837005476L, (long)var2_2);
                                            break block30;
                                        }
                                        catch (NumberFormatException v0) {
                                            throw _8B.a(v0);
                                        }
                                    }
                                    try {
                                        v1 = _8B.b("V", (Object)this, (long)-4816984097837005476L, (long)var2_2);
                                        if (var2_2 > 0L) {
                                            if (v1 > _8B.a("r", (int)28568, (long)(2382653359282201118L ^ var2_2))) {
                                                _8B.b("\u00f6", (Object)this, (int)_8B.a("r", (int)28568, (long)(2382653359282201118L ^ var2_2)), (long)-4816984097837005476L, (long)var2_2);
                                            }
                                        }
                                        ** GOTO lbl23
                                    }
                                    catch (NumberFormatException v2) {
                                        throw _8B.a(v2);
                                    }
                                }
                                try {
                                    v1 = _8B.b("V", (Object)this, (long)-4816147543434531566L, (long)var2_2);
lbl23:
                                    // 2 sources

                                    if (var2_2 >= 0L) {
                                        if (v1 >= 0) break block31;
                                        _8B.b("\u00f6", (Object)this, (int)_8B.a("r", (int)5258, (long)(4791308913711536414L ^ var2_2)), (long)-4816147543434531566L, (long)var2_2);
                                        break block32;
                                    }
                                    ** GOTO lbl33
                                }
                                catch (NumberFormatException v3) {
                                    throw _8B.a(v3);
                                }
                            }
                            try {
                                v1 = _8B.b("V", (Object)this, (long)-4816147543434531566L, (long)var2_2);
lbl33:
                                // 2 sources

                                if (var2_2 > 0L) {
                                    if (v1 > _8B.a("r", (int)28568, (long)(2382653359282201118L ^ var2_2))) {
                                        _8B.b("\u00f6", (Object)this, (int)_8B.a("r", (int)28568, (long)(2382653359282201118L ^ var2_2)), (long)-4816147543434531566L, (long)var2_2);
                                    }
                                }
                                ** GOTO lbl43
                            }
                            catch (NumberFormatException v4) {
                                throw _8B.a(v4);
                            }
                        }
                        try {
                            v1 = _8B.b("V", (Object)this, (long)-4817807712828964284L, (long)var2_2);
lbl43:
                            // 2 sources

                            if (var2_2 > 0L) {
                                if (v1 >= 0) break block33;
                                _8B.b("\u00f6", (Object)this, (int)_8B.a("r", (int)5258, (long)(4791308913711536414L ^ var2_2)), (long)-4817807712828964284L, (long)var2_2);
                                break block34;
                            }
                            ** GOTO lbl53
                        }
                        catch (NumberFormatException v5) {
                            throw _8B.a(v5);
                        }
                    }
                    try {
                        v1 = _8B.b("V", (Object)this, (long)-4817807712828964284L, (long)var2_2);
lbl53:
                        // 2 sources

                        if (var2_2 > 0L) {
                            if (v1 > _8B.a("r", (int)28568, (long)(2382653359282201118L ^ var2_2))) {
                                _8B.b("\u00f6", (Object)this, (int)_8B.a("r", (int)28568, (long)(2382653359282201118L ^ var2_2)), (long)-4817807712828964284L, (long)var2_2);
                            }
                        }
                        ** GOTO lbl63
                    }
                    catch (NumberFormatException v6) {
                        throw _8B.a(v6);
                    }
                }
                try {
                    v1 = _8B.b("V", (Object)this, (long)-4817516955534426429L, (long)var2_2);
lbl63:
                    // 2 sources

                    if (var2_2 > 0L) {
                        if (v1 >= 0) break block35;
                        _8B.b("\u00f6", (Object)this, (int)_8B.a("r", (int)5258, (long)(4791308913711536414L ^ var2_2)), (long)-4817516955534426429L, (long)var2_2);
                        break block36;
                    }
                    ** GOTO lbl75
                }
                catch (NumberFormatException v7) {
                    throw _8B.a(v7);
                }
            }
            try {
                block37: {
                    v8 = this;
                    if (var2_2 <= 0L) break block37;
                    v1 = _8B.b("V", (Object)v8, (long)-4817516955534426429L, (long)var2_2);
lbl75:
                    // 2 sources

                    if (v1 <= _8B.a("r", (int)28568, (long)(2382653359282201118L ^ var2_2))) break block36;
                    v8 = this;
                }
                _8B.b("\u00f6", (Object)v8, (int)_8B.a("r", (int)28568, (long)(2382653359282201118L ^ var2_2)), (long)-4817516955534426429L, (long)var2_2);
            }
            catch (NumberFormatException v9) {
                throw _8B.a(v9);
            }
        }
    }

    public class_2583 net_minecraft_class_2583_4(Object[] objectArray) {
        class_2583 class_25832 = (class_2583)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = (l2 = a ^ l2) ^ 0x1637A866DBCBL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        return _8B.b("\u00cc", (Object)class_25832, (Object)_8B.b("\u00cc", (Object)this, (Object)objectArray2, 6722494593402107036L, (long)l2), 6721469878278801670L, (long)l2);
    }

    public _8B dev_krypton_8B_5(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        int n3 = (Integer)objectArray[2];
        long l2 = ((long)n << 48 | (long)n2 << 32 >>> 16 | (long)n3 << 48 >>> 48) ^ a;
        long l3 = l2 ^ 0x46AC315D0043L;
        return new _8B((int)_8B.b("V", (Object)this, 4761666535189625454L, (long)l2), (int)_8B.b("V", (Object)this, 4763664173871206944L, (long)l2), l3, (int)_8B.b("V", (Object)this, 4760798939968355702L, (long)l2), (int)_8B.b("V", (Object)this, 4762215594845864433L, (long)l2));
    }

    public static int int_5(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = a ^ l2;
        return n >> _8B.a("r", 10130, (long)(0x7AB5210CCA10F1C2L ^ l2)) & _8B.a("r", 28568, (long)(0x21109226F26639D8L ^ l2));
    }

    public _8B dev_krypton_8B_7(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = (Integer)objectArray[2];
        int n3 = (Integer)objectArray[3];
        int n4 = (Integer)objectArray[4];
        long l3 = (l2 = a ^ l2) ^ 0x3FD92B62A8FAL;
        _8B.b("\u00f6", (Object)this, (int)n, -6523591758255923955L, (long)l2);
        _8B.b("\u00f6", (Object)this, (int)n2, -6523267297099647677L, (long)l2);
        _8B.b("\u00f6", (Object)this, (int)n3, -6524980498266826219L, (long)l2);
        _8B.b("\u00f6", (Object)this, (int)n4, -6524145218047449454L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _8B.b("\u00cc", (Object)this, (Object)objectArray2, -6523787240135810840L, (long)l2);
        return this;
    }

    /*
     * Unable to fully structure code
     */
    public static int int_7(Object[] var0) {
        block18: {
            block19: {
                block17: {
                    var1_1 = ((Float)var0[0]).floatValue();
                    var3_2 = ((Float)var0[1]).floatValue();
                    var4_3 = (Long)var0[2];
                    var2_4 = ((Float)var0[3]).floatValue();
                    var4_3 = _8B.a ^ var4_3;
                    var7_5 = 0;
                    var8_6 = 0;
                    var9_7 = 0;
                    var6_8 = _8B.cfr_renamed_0();
                    try {
                        v0 = var3_2;
                        v1 = 0.0f;
                        if (var6_8 != null) break block17;
                        if (v0 == v1) {
                        }
                        ** GOTO lbl25
                    }
                    catch (NumberFormatException v2) {
                        throw _8B.a(v2);
                    }
                    v3 = var8_6 = (var9_7 = (int)(var2_4 * 255.0f + 0.5f));
                    if (var4_3 < 0L) break block19;
                    var7_5 = v3;
                    try {
                        if (var6_8 == null) ** GOTO lbl-1000
lbl25:
                        // 2 sources

                        v0 = var1_1 - (float)_8B.b("\u00c2", (double)var1_1, (long)449285058000521821L, (long)var4_3);
                        v1 = 6.0f;
                    }
                    catch (NumberFormatException v4) {
                        throw _8B.a(v4);
                    }
                }
                var10_9 = v0 * v1;
                var11_10 = var10_9 - (float)_8B.b("\u00c2", (double)var10_9, (long)449285058000521821L, (long)var4_3);
                var12_11 = var2_4 * (1.0f - var3_2);
                var13_12 = var2_4 * (1.0f - var3_2 * var11_10);
                var14_13 = var2_4 * (1.0f - var3_2 * (1.0f - var11_10));
                try {
                    v5 = (int)var10_9;
                    if (var6_8 != null) break block18;
                }
                catch (NumberFormatException v6) {
                    throw _8B.a(v6);
                }
                {
                    ** switch (v5)
                }
lbl-1000:
                // 1 sources

                {
                    case 0: {
                        var7_5 = (int)(var2_4 * 255.0f + 0.5f);
                        var8_6 = (int)(var14_13 * 255.0f + 0.5f);
                        v3 = (int)(var12_11 * 255.0f + 0.5f);
                        if (var4_3 <= 0L) break;
                        var9_7 = v3;
                        if (var6_8 == null) ** GOTO lbl83
                    }
lbl51:
                    // 2 sources

                    case 1: {
                        var7_5 = (int)(var13_12 * 255.0f + 0.5f);
                        var8_6 = (int)(var2_4 * 255.0f + 0.5f);
                        v3 = (int)(var12_11 * 255.0f + 0.5f);
                        if (var4_3 < 0L) break;
                        var9_7 = v3;
                        if (var6_8 == null) ** GOTO lbl83
                    }
lbl58:
                    // 2 sources

                    case 2: {
                        var7_5 = (int)(var12_11 * 255.0f + 0.5f);
                        var8_6 = (int)(var2_4 * 255.0f + 0.5f);
                        v3 = (int)(var14_13 * 255.0f + 0.5f);
                        if (var4_3 < 0L) break;
                        var9_7 = v3;
                        if (var6_8 == null) ** GOTO lbl83
                    }
lbl65:
                    // 2 sources

                    case 3: {
                        var7_5 = (int)(var12_11 * 255.0f + 0.5f);
                        var8_6 = (int)(var13_12 * 255.0f + 0.5f);
                        v3 = (int)(var2_4 * 255.0f + 0.5f);
                        if (var4_3 <= 0L) break;
                        var9_7 = v3;
                        if (var6_8 == null) ** GOTO lbl83
                    }
lbl72:
                    // 2 sources

                    case 4: {
                        var7_5 = (int)(var14_13 * 255.0f + 0.5f);
                        var8_6 = (int)(var12_11 * 255.0f + 0.5f);
                        v3 = (int)(var2_4 * 255.0f + 0.5f);
                        if (var4_3 < 0L) break;
                        var9_7 = v3;
                        if (var6_8 == null) ** GOTO lbl83
                    }
lbl79:
                    // 2 sources

                    case 5: {
                        var7_5 = (int)(var2_4 * 255.0f + 0.5f);
                        var8_6 = (int)(var12_11 * 255.0f + 0.5f);
                        var9_7 = (int)(var13_12 * 255.0f + 0.5f);
                    }
lbl83:
                    // 7 sources

                    default: lbl-1000:
                    // 2 sources

                    {
                        v3 = _8B.a("r", (int)26513, (long)(3513572445297676550L ^ var4_3)) | var7_5 << _8B.a("r", (int)30176, (long)(7547246319996404592L ^ var4_3)) | var8_6 << _8B.a("r", (int)10130, (long)(8842062161125789979L ^ var4_3));
                    }
                }
            }
            v5 = v3 | var9_7;
        }
        return v5;
    }

    public class_2583 net_minecraft_class_2583_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = a ^ l2) ^ 0x28BD89E6C69AL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        return _8B.b("\u00cc", (Object)_8B.b("\u00f4", 4619980263229727175L, (long)l2), (Object)_8B.b("\u00cc", (Object)this, (Object)objectArray2, 4619048060620073421L, (long)l2), 4617961705166328919L, (long)l2);
    }

    public static int[] cfr_renamed_0() {
        return cfr_renamed_407;
    }

    public _8B dev_krypton_8B_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = a ^ l2) ^ 0x970A7A13B9FL;
        return new _8B((int)_8B.b("\u00c2", (int)((int)((double)_8B.b("V", (Object)this, 8775432789998404018L, (long)l2) * 0.7)), 0, 8774409891418176523L, (long)l2), (int)_8B.b("\u00c2", (int)((int)((double)_8B.b("V", (Object)this, 8775158936440744444L, (long)l2) * 0.7)), 0, 8774409891418176523L, (long)l2), l3, (int)_8B.b("\u00c2", (int)((int)((double)_8B.b("V", (Object)this, 8776828160766543530L, (long)l2) * 0.7)), 0, 8774409891418176523L, (long)l2), (int)_8B.b("V", (Object)this, 8775974187373247021L, (long)l2));
    }

    public int int_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (int)_8B.b("V", (Object)this, -3543863102768073045L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_8B.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_8B.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

