/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_2338
 *  net.minecraft.class_2487
 *  net.minecraft.class_2591
 *  net.minecraft.class_2596
 *  net.minecraft.class_2622
 *  net.minecraft.class_2672
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
import dev.krypton._9r;
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
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2338;
import net.minecraft.class_2487;
import net.minecraft.class_2591;
import net.minecraft.class_2596;
import net.minecraft.class_2622;
import net.minecraft.class_2672;

public class _6o
extends _6x_0 {
    private final _9r cfr_renamed_6;
    private final _9r cfr_renamed_0;
    private final _9r cfr_renamed_8;
    private final Map cfr_renamed_2;
    private static final long b;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static final long[] j;
    private static final Integer[] k;
    private static final Map l;
    private static final Object[] m;
    private static final String[] n;

    @Override
    public native void cfr_renamed_5();

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void cfr_renamed_379(Object[] var1_1) {
        block57: {
            block53: {
                block55: {
                    block56: {
                        block54: {
                            block63: {
                                block52: {
                                    block51: {
                                        block48: {
                                            block49: {
                                                block50: {
                                                    block47: {
                                                        block41: {
                                                            block42: {
                                                                var3_2 = var1_1[0];
                                                                var4_3 = (Integer)var1_1[1];
                                                                var2_4 = (Integer)var1_1[2];
                                                                var5_5 = (Long)var1_1[3];
                                                                v0 = var5_5 = _6o.b ^ var5_5;
                                                                var7_6 = v0 ^ 48680922277493L;
                                                                var9_7 = v0 ^ 99204546147971L;
                                                                var11_8 = v0 ^ 91604436723284L;
                                                                var14_9 = new ArrayList<E>(2);
                                                                var15_10 = null;
                                                                var16_11 = null;
                                                                var13_12 = _8h.cfr_renamed_4();
                                                                v1 = new Object[2];
                                                                v1[1] = var3_2.getClass();
                                                                v1[0] = var7_6;
                                                                var17_13 = _6o.d("\u00a2", (Object)_6o.d("c", (Object)v1, (long)-1456653484804260746L, (long)var5_5), (long)-1458845077240334324L, (long)var5_5);
                                                                while (_6o.d("\u00a2", (Object)var17_13, (long)-1459124506673032926L, (long)var5_5) != false) {
                                                                    block44: {
                                                                        var18_15 = (Field)_6o.d("\u00a2", (Object)var17_13, (long)-1453209518412384608L, (long)var5_5);
                                                                        try {
                                                                            _6o.d("\u00a2", (Object)var18_15, (boolean)true, (long)-1457190194770706337L, (long)var5_5);
                                                                            v2 = var13_12;
                                                                            if (var5_5 <= 0L) break block41;
                                                                        }
                                                                        catch (Exception var19_18) {
                                                                            if (var5_5 > 0L && var13_12 == null) continue;
                                                                        }
                                                                        if (v2 != null) break block42;
                                                                        try {
                                                                            block46: {
                                                                                block45: {
                                                                                    block43: {
                                                                                        block60: {
                                                                                            block59: {
                                                                                                v3 = _6o.d("\u00a2", (Object)var18_15, (long)-1452751151914118793L, (long)var5_5);
                                                                                                v4 = _6o.d("\u00db", (long)-1454855394961665342L, (long)var5_5);
                                                                                                if (var13_12 != null) break block43;
                                                                                                if (v3 != v4) ** GOTO lbl50
                                                                                                break block59;
                                                                                                catch (Exception v5) {
                                                                                                    throw _6o.a(v5);
                                                                                                }
                                                                                            }
                                                                                            _6o.d("\u00a2", var14_9, (Object)_6o.d("c", (int)_6o.d("\u00a2", (Object)var18_15, (Object)var3_2, (long)-1457739391170685732L, (long)var5_5), (long)-1454898213704392267L, (long)var5_5), (long)-1455003813497203875L, (long)var5_5);
                                                                                            if (var13_12 == null) break block44;
                                                                                            break block60;
                                                                                            catch (Exception v6) {
                                                                                                throw _6o.a(v6);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            block61: {
                                                                                                v3 = class_2591.class;
                                                                                                if (var13_12 != null) break block45;
                                                                                                break block61;
                                                                                                catch (Exception v7) {
                                                                                                    throw _6o.a(v7);
                                                                                                }
                                                                                            }
                                                                                            v4 = _6o.d("\u00a2", (Object)var18_15, (long)-1452751151914118793L, (long)var5_5);
                                                                                        }
                                                                                        catch (Exception v8) {
                                                                                            throw _6o.a(v8);
                                                                                        }
                                                                                    }
                                                                                    if (_6o.d("\u00a2", (Object)v3, (Object)v4, (long)-1453064471453519211L, (long)var5_5) == false) ** GOTO lbl69
                                                                                    var15_10 = (class_2591)_6o.d("\u00a2", (Object)var18_15, (Object)var3_2, (long)-1452619589988792463L, (long)var5_5);
                                                                                    try {
                                                                                        v3 = var13_12;
                                                                                        if (var5_5 < 0L) break block45;
                                                                                        if (v3 == null) break block44;
lbl69:
                                                                                        // 2 sources

                                                                                        v3 = _6o.d("\u00a2", (Object)var18_15, (Object)var3_2, (long)-1452619589988792463L, (long)var5_5);
                                                                                    }
                                                                                    catch (Exception v9) {
                                                                                        throw _6o.a(v9);
                                                                                    }
                                                                                }
                                                                                var20_21 = v3;
                                                                                v10 = var20_21;
                                                                                if (var13_12 != null) break block46;
                                                                                try {
                                                                                    block62: {
                                                                                        if (!(v10 instanceof class_2487)) break block44;
                                                                                        break block62;
                                                                                        catch (Exception v11) {
                                                                                            throw _6o.a(v11);
                                                                                        }
                                                                                    }
                                                                                    v10 = var20_21;
                                                                                }
                                                                                catch (Exception v12) {
                                                                                    throw _6o.a(v12);
                                                                                }
                                                                            }
                                                                            var16_11 = var19_17 = (class_2487)v10;
                                                                        }
                                                                        catch (Exception var19_19) {
                                                                            // empty catch block
                                                                        }
                                                                    }
                                                                    if (var13_12 == null) continue;
                                                                }
                                                                try {
                                                                    try {
                                                                        v13 = _6o.d("\u00a2", var14_9, (long)-1455618358536658980L, (long)var5_5);
                                                                        if (var5_5 <= 0L || var13_12 != null) break block47;
                                                                        if (v13 >= 2) break block42;
                                                                    }
                                                                    catch (Exception v14) {
                                                                        throw _6o.a(v14);
                                                                    }
                                                                    return;
                                                                }
                                                                catch (Exception v15) {
                                                                    throw _6o.a(v15);
                                                                }
                                                            }
                                                            v2 = _6o.d("\u00a2", var14_9, (int)0, (long)-1453031896293904699L, (long)var5_5);
                                                        }
                                                        v13 = _6o.d("\u00a2", (Object)((Integer)v2), (long)-1452489602073338034L, (long)var5_5);
                                                    }
                                                    var17_14 = v13;
                                                    var18_16 = _6o.d("\u00a2", (Object)((Integer)_6o.d("\u00a2", var14_9, (int)1, (long)-1453031896293904699L, (long)var5_5)), (long)-1452489602073338034L, (long)var5_5);
                                                    try {
                                                        v16 = var18_16;
                                                        if (var5_5 <= 0L) break block48;
                                                        v17 /* !! */  = _6o.c("k", (int)31688, (long)(8217282579839611397L ^ var5_5));
                                                        if (var13_12 != null) break block49;
                                                        if (v16 < v17 /* !! */ ) break block50;
                                                    }
                                                    catch (Exception v18) {
                                                        throw _6o.a(v18);
                                                    }
                                                    return;
                                                }
                                                v19 = var4_3 * _6o.c("k", (int)30619, (long)(572463686199836245L ^ var5_5));
                                                v17 /* !! */  = (CallSite)(var17_14 >> 4 & _6o.c("k", (int)27378, (long)(5209066414698488630L ^ var5_5)));
                                            }
                                            v16 = v19 + v17 /* !! */ ;
                                        }
                                        var19_20 = v16;
                                        var20_22 = var2_4 * _6o.c("k", (int)5953, (long)(4597749740625403531L ^ var5_5)) + (var17_14 & _6o.c("k", (int)16626, (long)(4581690997068908832L ^ var5_5)));
                                        var21_23 = new class_2338((int)var19_20, (int)var18_16, var20_22);
                                        try {
                                            v20 = var15_10 != null ? _6o.d("\u00a2", (Object)_6o.d("\u00db", (long)-1455187416828550891L, (long)var5_5), (Object)var15_10, (long)-1456078072623371812L, (long)var5_5) : null;
                                        }
                                        catch (Exception v21) {
                                            throw _6o.a(v21);
                                        }
                                        var22_24 = v20;
                                        try {
                                            v22 = var22_24;
                                            if (var13_12 != null) break block51;
                                            if (v22 == null) break block52;
                                        }
                                        catch (Exception v23) {
                                            throw _6o.a(v23);
                                        }
                                        v22 = var22_24;
                                    }
                                    v24 = _6o.d("\u00a2", (Object)v22, (long)-1457438013929082614L, (long)var5_5);
                                    break block63;
                                }
                                v24 = _6o.a("w", (int)3165, (long)(7205127361206703799L ^ var5_5));
                            }
                            var23_25 = v24;
                            try {
                                try {
                                    try {
                                        try {
                                            if (var5_5 <= 0L) break block53;
                                            v25 = _6o.d("\u00d1", (Object)this, (long)-1458081238247396714L, (long)var5_5);
                                            if (var13_12 != null) break block53;
                                            if (_6o.d("\u00a2", (Object)v25, (long)var11_8, (long)-1455849361083990385L, (long)var5_5) == false) break block54;
                                        }
                                        catch (Exception v26) {
                                            throw _6o.a(v26);
                                        }
                                        v27 = _6o.d("\u00d1", (Object)this, (long)-1456064103549142611L, (long)var5_5);
                                        v28 = var21_23;
                                        v29 = var13_12;
                                        if (var5_5 < 0L) break block55;
                                        if (v29 != null) break block56;
                                    }
                                    catch (Exception v30) {
                                        throw _6o.a(v30);
                                    }
                                    if (_6o.d("\u00a2", (Object)v27, (Object)v28, (long)-1457546008170590027L, (long)var5_5) == false) break block54;
                                }
                                catch (Exception v31) {
                                    throw _6o.a(v31);
                                }
                                return;
                            }
                            catch (Exception v32) {
                                throw _6o.a(v32);
                            }
                        }
                        v27 = _6o.d("\u00d1", (Object)this, (long)-1456064103549142611L, (long)var5_5);
                        v28 = var21_23;
                    }
                    v29 = var23_25;
                }
                v25 = _6o.d("\u00a2", (Object)v27, (Object)v28, (Object)v29, (long)-1456482628445644103L, (long)var5_5);
            }
            var24_26 = _6o.d("\u00a2", (Object)_6o.d("\u00a2", (Object)_6o.d("\u00a2", (Object)_6o.d("\u00a2", (Object)_6o.d("\u00a2", (Object)_6o.d("\u00a2", (Object)_6o.d("\u00a2", (Object)_6o.d("\u00a2", (Object)new StringBuilder((String)_6o.a("w", (int)5057, (long)(6782947021889358120L ^ var5_5))), (Object)var23_25, (long)-1458244832341901163L, (long)var5_5), (Object)_6o.a("w", (int)31238, (long)(4711794448857276654L ^ var5_5)), (long)-1458244832341901163L, (long)var5_5), (int)var19_20, (long)-1457985702089454629L, (long)var5_5), (Object)_6o.a("w", (int)8024, (long)(4544601630704944552L ^ var5_5)), (long)-1458244832341901163L, (long)var5_5), (int)var18_16, (long)-1457985702089454629L, (long)var5_5), (Object)_6o.a("w", (int)8024, (long)(4544601630704944552L ^ var5_5)), (long)-1458244832341901163L, (long)var5_5), (int)var20_22, (long)-1457985702089454629L, (long)var5_5), (Object)")", (long)-1458244832341901163L, (long)var5_5);
            try {
                try {
                    if (_6o.d("\u00a2", (Object)_6o.d("\u00d1", (Object)this, (long)-1456587720697558636L, (long)var5_5), (long)var11_8, (long)-1455849361083990385L, (long)var5_5) == false || var16_11 == null) break block57;
                }
                catch (Exception v33) {
                    throw _6o.a(v33);
                }
                _6o.d("\u00a2", (Object)_6o.d("\u00a2", (Object)var24_26, (Object)_6o.a("w", (int)31150, (long)(9004025116478808901L ^ var5_5)), (long)-1458244832341901163L, (long)var5_5), (Object)var16_11, (long)-1455313570315120392L, (long)var5_5);
            }
            catch (Exception v34) {
                throw _6o.a(v34);
            }
        }
        var25_27 = _6o.d("\u00a2", (Object)var24_26, (long)-1455573022934454137L, (long)var5_5);
        _6o.d("\u00a2", (Object)_6o.d("\u00d1", (Object)this, (long)-1458888753647564057L, (long)var5_5), (Object)(Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, 6(java.lang.String long ), ()V)((_6o)this, (String)var25_27, (long)var9_7), (long)-1453438628318485098L, (long)var5_5);
    }

    private void cfr_renamed_380(Object[] objectArray) {
        CallSite callSite;
        int n;
        int n2;
        int n3;
        long l2;
        block23: {
            CallSite callSite2;
            CallSite callSite3;
            long l3;
            class_2622 class_26222;
            block19: {
                Object object;
                CallSite callSite4;
                CallSite callSite5;
                CallSite callSite6;
                block21: {
                    block22: {
                        block20: {
                            CallSite callSite7;
                            String string;
                            block24: {
                                block18: {
                                    CallSite callSite8;
                                    block17: {
                                        l2 = (Long)objectArray[0];
                                        class_26222 = (class_2622)objectArray[1];
                                        long l4 = l2 = b ^ l2;
                                        l3 = l4 ^ 0x2E3659CE097CL;
                                        long l5 = l4 ^ 0x44784039D46CL;
                                        n3 = (int)(l5 >>> 48);
                                        n2 = (int)(l5 << 16 >>> 32);
                                        n = (int)(l5 << 48 >>> 48);
                                        string = _8h.cfr_renamed_4();
                                        callSite3 = _6o.d("\u00a2", (Object)class_26222, -4256411424148926878L, (long)l2);
                                        try {
                                            if (_6o.d("\u00a2", (Object)callSite3, -4256468779771043863L, (long)l2) >= _6o.c("k", 741, (long)(0x67A78C87B1052419L ^ l2))) {
                                                return;
                                            }
                                        }
                                        catch (MatchException matchException) {
                                            throw _6o.a((Exception)((Object)matchException));
                                        }
                                        CallSite callSite9 = _6o.d("\u00a2", (Object)class_26222, -4257706248751556084L, (long)l2);
                                        CallSite callSite10 = _6o.d("\u00a2", (Object)_6o.d("\u00db", -4258611226458206659L, (long)l2), (Object)callSite9, -4259695155513440524L, (long)l2);
                                        try {
                                            callSite8 = callSite10;
                                            if (string != null) break block17;
                                            if (callSite8 == null) break block18;
                                        }
                                        catch (MatchException matchException) {
                                            throw _6o.a((Exception)((Object)matchException));
                                        }
                                        callSite8 = callSite10;
                                    }
                                    callSite7 = _6o.d("\u00a2", (Object)callSite8, -4256360422686581214L, (long)l2);
                                    break block24;
                                }
                                callSite7 = _6o.a("w", 20491, (long)(0x2704B0226E57A5C2L ^ l2));
                            }
                            callSite2 = callSite7;
                            try {
                                try {
                                    try {
                                        try {
                                            if (l2 < 0L) break block19;
                                            callSite6 = _6o.d("\u00d1", (Object)this, -4257124645091867202L, (long)l2);
                                            if (string != null) break block19;
                                            if (_6o.d("\u00a2", (Object)callSite6, (long)l3, -4259360856497925721L, (long)l2) == false) break block20;
                                        }
                                        catch (MatchException matchException) {
                                            throw _6o.a((Exception)((Object)matchException));
                                        }
                                        callSite5 = _6o.d("\u00d1", (Object)this, -4259428814160505211L, (long)l2);
                                        callSite4 = callSite3;
                                        object = string;
                                        if (l2 < 0L) break block21;
                                        if (object != null) break block22;
                                    }
                                    catch (MatchException matchException) {
                                        throw _6o.a((Exception)((Object)matchException));
                                    }
                                    if (_6o.d("\u00a2", (Object)callSite5, (Object)callSite4, -4256538510798667875L, (long)l2) == false) break block20;
                                }
                                catch (MatchException matchException) {
                                    throw _6o.a((Exception)((Object)matchException));
                                }
                                return;
                            }
                            catch (MatchException matchException) {
                                throw _6o.a((Exception)((Object)matchException));
                            }
                        }
                        callSite5 = _6o.d("\u00d1", (Object)this, -4259428814160505211L, (long)l2);
                        callSite4 = callSite3;
                    }
                    object = callSite2;
                }
                callSite6 = _6o.d("\u00a2", (Object)callSite5, (Object)callSite4, (Object)object, -4259853695612652143L, (long)l2);
            }
            callSite = _6o.d("\u00a2", (Object)_6o.d("\u00a2", (Object)_6o.d("\u00a2", (Object)_6o.d("\u00a2", (Object)_6o.d("\u00a2", (Object)_6o.d("\u00a2", (Object)_6o.d("\u00a2", (Object)_6o.d("\u00a2", (Object)new StringBuilder((String)((Object)_6o.a("w", 9860, (long)(0x32F2623A0985341L ^ l2)))), (Object)callSite2, -4257243691521839171L, (long)l2), (Object)_6o.a("w", 4036, (long)(0xF6C15BC32FA7A0EL ^ l2)), -4257243691521839171L, (long)l2), (int)_6o.d("\u00a2", (Object)callSite3, -4257567614837781665L, (long)l2), -4256943037789559565L, (long)l2), (Object)_6o.a("w", 4773, (long)(0x18809E922CDFE76DL ^ l2)), -4257243691521839171L, (long)l2), (int)_6o.d("\u00a2", (Object)callSite3, -4256468779771043863L, (long)l2), -4256943037789559565L, (long)l2), (Object)_6o.a("w", 8024, (long)(0x3F11D67CDBF36A80L ^ l2)), -4257243691521839171L, (long)l2), (int)_6o.d("\u00a2", (Object)callSite3, -4256299194596932810L, (long)l2), -4256943037789559565L, (long)l2), (Object)")", -4257243691521839171L, (long)l2);
            try {
                try {
                    if (_6o.d("\u00a2", (Object)_6o.d("\u00d1", (Object)this, -4260031097933961540L, (long)l2), (long)l3, -4259360856497925721L, (long)l2) == false || _6o.d("\u00a2", (Object)class_26222, -4257211323110969178L, (long)l2) == null) break block23;
                }
                catch (MatchException matchException) {
                    throw _6o.a((Exception)((Object)matchException));
                }
                _6o.d("\u00a2", (Object)_6o.d("\u00a2", (Object)callSite, (Object)_6o.a("w", 28838, (long)(0x73AB89080831056AL ^ l2)), -4257243691521839171L, (long)l2), (Object)_6o.d("\u00a2", (Object)class_26222, -4257211323110969178L, (long)l2), -4258772048653254704L, (long)l2);
            }
            catch (MatchException matchException) {
                throw _6o.a((Exception)((Object)matchException));
            }
        }
        CallSite callSite11 = _6o.d("\u00a2", (Object)callSite, -4259075482005364817L, (long)l2);
        _6o.d("\u00a2", (Object)_6o.d("\u00d1", (Object)this, -4258011548668041777L, (long)l2), () -> this.cfr_renamed_4((String)((Object)callSite11), (char)n3, n2, (short)n), -4252484217011057986L, (long)l2);
    }

    /*
     * Exception decompiling
     */
    private void cfr_renamed_381(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [25[DOLOOP], 27[DOLOOP]], but top level block is 5[TRYBLOCK]
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

    public _6o(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x536FB55EEFFEL;
        long l5 = l3 ^ 0x557221D6797L;
        long l6 = l3 ^ 0x1A97B13988E5L;
        super((int)_6o.c("k", 11644, (long)(0x43D38716723501C3L ^ l2)), -1, (_4r)((Object)_6o.d("\u00db", -3553424408201478702L, (long)l2)), l5);
        this.cfr_renamed_6 = new _9r((int)_6o.c("k", 26444, (long)(0x70DFD17A1CCACBFEL ^ l2)), true, l4);
        this.cfr_renamed_0 = new _9r((int)_6o.c("k", 20191, (long)(0x2B7E9C56D84A6267L ^ l2)), true, l4);
        this.cfr_renamed_8 = new _9r((int)_6o.c("k", 4090, (long)(0x43A5EC899827234AL ^ l2)), true, l4);
        this.cfr_renamed_2 = new ConcurrentHashMap();
        Object[] objectArray = new Object[2];
        objectArray[1] = new _95[]{_6o.d("\u00d1", (Object)this, -3553856479953785613L, (long)l2), _6o.d("\u00d1", (Object)this, -3556478499020075023L, (long)l2), _6o.d("\u00d1", (Object)this, -3552679137728134461L, (long)l2)};
        objectArray[0] = l6;
        _6o.d("\u00a2", (Object)this, (Object)objectArray, -3554379078590324081L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        a.init(_6o.class, 53);
                        _6o.b = dev.krypton.l.a(-4771885463249971120L, 5535844030840154738L, MethodHandles.lookup().lookupClass()).a(222978319171994L);
                        _6o.m = new Object[125];
                        _6o.n = new String[125];
                        _6o.b();
                        _6o.f = new HashMap<K, V>(13);
                        var11 = _6o.b ^ 62735402435212L;
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
                        var20_3 = new String[19];
                        var18_4 = 0;
                        var17_5 = "\u00cb2k,\f\u009cqf\u00e37\u008e\rf\u0085\u00f9\u00f2(\r$\u00cb\u001f\u00d2\u00de\u00ad\u00e2\u00a3\u00e2x\u0015\u0018\u00d8\u0010\u008f\u00b6f\u00ff\u00f3\u0090f\u0085\u0006\u00ec\u00be\u008f\u0080\u000bK;\u00f1\u009f\u008fa_\u00e5\u0086\u0015\u00d8\u0010\u00a5C\u001f`r2\u0090\u0014\u0097\u00c2\u00aa!\u0014\u0084tX\u0010\u00fb\u00de\u00e0Tq\u00a0\u00bc\u00bfY\u00a6\u001d\u00ef.\u00bf]\u00b4(o4\u00e1/\u00f2\u00dex\u0096\u00ae\u00c5\u0007\u0016\u00adc\u00f2)7\u00b3\u00d7\u000b\u0091\u00b7\u00a3M/\u00e9\u00cd\u00f7\u00d0pl\u00d6\u0014\u0017\u00b0~\u0084\t\f\u00c6(.\u00b2u\u00d5\u00e5B\u00d8\u00d4>\u0091\u00bf\u009bY\u001a\u00f7^Gqb\u0088\u0098mx\u00c5\u00bd\u0090\u00a1\u000f\u00a08\u00b7;\u008di\u0094\u0019\u00cb\u00a5:\u00b4\u0010%VdG\u0003E\u0001\u00ffj\u00cd\u00a6\u008a\u009b\u00e4\u0012;(\u00a8\u00e5\u0013\\0\u00e5*\u00e5\u0011\u008b\u00dfFB7\u00ff-\u00fe\u00c5\u00d0\u0001J\u00c7_G\u00f9\u00d2\u0086\u0092R\u00c7S\u0091\u0084P\u00cb\u00b0\u009c\u000e\u00ceH\u0010EW\u00a5U\u000brTD3\u00b2sXB9\u00ba\u0090\u0010\u00bdX\u00d1\u007f\u000fr\u00fc?\u0004\u00e1\u00c2\u0006\u0089wS\u0096\u0010\u00ca{ o\f\u00f4g\u00f3=\u0099\u00cf\u001a\u009d\u0003x\u00ec \u0015i\u008e8\u001b\u00e4\u009e\u00c0x\u00f9rY\u00de\u00db\u00c5\u0000>z\u008a\u00d9\u00ecf\u0014\u00fb\u00c0P\u007f\u00b0m\u0089 \u00108D\u008fUQ\u00ec7\u00be\u000ey\u001c\u00fe\u0097Z\f9\u00dc\u0099\u008fE\u0018Zb\u00a6\u0081\u00f1C8'\u00be\u001a\u00bb\n\u0093\u00ab]\u00a5\u00d4+W\u00d8\u00de+dT\u00f7\u00cbK\u001d\u001a\u00a9\u0018\u00f3\u00bf7\u00ba,(\u001c\u009e\u0092LU\u00c8\u00b0VR5\u001a8\u0092\u008e\t\u00ed\u0002i\u00da\u0089fn\u000f439\u0013^\u00ed\u0084F\u001f9(L\u008d4'\u0011Q(\u00c0\u00d7\u0013a\u00ee.Rg^\u009bYnb\u0017\u0002\u00c3\u00a1\u0088s\u0087\u00ad\u001f5'\u00bb\u00f5\u00f1\u000e\u00a2\u0086\u00ad4\u00b2Ap\u00b9\u00c0\u009a\u0085\u001d \u008d\u0001\u00eb-\u00d8\u0099q\u00c2\u00df\u0099Pb\u00bf$\u00f2\u00e8[\u00bb\u00cf\u00bb\u0011\u00d02\u00f2gs\u0085\u0006v\u001d\"\u0006(\u00ba1_\u00a0\u00831n-\u0004\u00b0Fe\u008b\u00e3(\u0090m\u00c7\u00d1\u00c0\u00bd#\u00ab_5\u0015&\u00f4\"P\u00c9^\n\u00b1\u00f0L\u00a7-\u00f6\u00c4";
                        var19_6 = "\u00cb2k,\f\u009cqf\u00e37\u008e\rf\u0085\u00f9\u00f2(\r$\u00cb\u001f\u00d2\u00de\u00ad\u00e2\u00a3\u00e2x\u0015\u0018\u00d8\u0010\u008f\u00b6f\u00ff\u00f3\u0090f\u0085\u0006\u00ec\u00be\u008f\u0080\u000bK;\u00f1\u009f\u008fa_\u00e5\u0086\u0015\u00d8\u0010\u00a5C\u001f`r2\u0090\u0014\u0097\u00c2\u00aa!\u0014\u0084tX\u0010\u00fb\u00de\u00e0Tq\u00a0\u00bc\u00bfY\u00a6\u001d\u00ef.\u00bf]\u00b4(o4\u00e1/\u00f2\u00dex\u0096\u00ae\u00c5\u0007\u0016\u00adc\u00f2)7\u00b3\u00d7\u000b\u0091\u00b7\u00a3M/\u00e9\u00cd\u00f7\u00d0pl\u00d6\u0014\u0017\u00b0~\u0084\t\f\u00c6(.\u00b2u\u00d5\u00e5B\u00d8\u00d4>\u0091\u00bf\u009bY\u001a\u00f7^Gqb\u0088\u0098mx\u00c5\u00bd\u0090\u00a1\u000f\u00a08\u00b7;\u008di\u0094\u0019\u00cb\u00a5:\u00b4\u0010%VdG\u0003E\u0001\u00ffj\u00cd\u00a6\u008a\u009b\u00e4\u0012;(\u00a8\u00e5\u0013\\0\u00e5*\u00e5\u0011\u008b\u00dfFB7\u00ff-\u00fe\u00c5\u00d0\u0001J\u00c7_G\u00f9\u00d2\u0086\u0092R\u00c7S\u0091\u0084P\u00cb\u00b0\u009c\u000e\u00ceH\u0010EW\u00a5U\u000brTD3\u00b2sXB9\u00ba\u0090\u0010\u00bdX\u00d1\u007f\u000fr\u00fc?\u0004\u00e1\u00c2\u0006\u0089wS\u0096\u0010\u00ca{ o\f\u00f4g\u00f3=\u0099\u00cf\u001a\u009d\u0003x\u00ec \u0015i\u008e8\u001b\u00e4\u009e\u00c0x\u00f9rY\u00de\u00db\u00c5\u0000>z\u008a\u00d9\u00ecf\u0014\u00fb\u00c0P\u007f\u00b0m\u0089 \u00108D\u008fUQ\u00ec7\u00be\u000ey\u001c\u00fe\u0097Z\f9\u00dc\u0099\u008fE\u0018Zb\u00a6\u0081\u00f1C8'\u00be\u001a\u00bb\n\u0093\u00ab]\u00a5\u00d4+W\u00d8\u00de+dT\u00f7\u00cbK\u001d\u001a\u00a9\u0018\u00f3\u00bf7\u00ba,(\u001c\u009e\u0092LU\u00c8\u00b0VR5\u001a8\u0092\u008e\t\u00ed\u0002i\u00da\u0089fn\u000f439\u0013^\u00ed\u0084F\u001f9(L\u008d4'\u0011Q(\u00c0\u00d7\u0013a\u00ee.Rg^\u009bYnb\u0017\u0002\u00c3\u00a1\u0088s\u0087\u00ad\u001f5'\u00bb\u00f5\u00f1\u000e\u00a2\u0086\u00ad4\u00b2Ap\u00b9\u00c0\u009a\u0085\u001d \u008d\u0001\u00eb-\u00d8\u0099q\u00c2\u00df\u0099Pb\u00bf$\u00f2\u00e8[\u00bb\u00cf\u00bb\u0011\u00d02\u00f2gs\u0085\u0006v\u001d\"\u0006(\u00ba1_\u00a0\u00831n-\u0004\u00b0Fe\u008b\u00e3(\u0090m\u00c7\u00d1\u00c0\u00bd#\u00ab_5\u0015&\u00f4\"P\u00c9^\n\u00b1\u00f0L\u00a7-\u00f6\u00c4".length();
                        var16_7 = 16;
                        var15_8 = -1;
lbl24:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl29:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = _6o.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u001a_\u00f608}U\u0095\u00b7Rc\u0082,\u00a7\u00cc\u00fd\u0097W\u000b\u00b3\u008f\u00f7\bZ\u0010>\u00abon8}\u00b1V39j*\u001e0\u00e3\u00fa";
                            var19_6 = "\u001a_\u00f608}U\u0095\u00b7Rc\u0082,\u00a7\u00cc\u00fd\u0097W\u000b\u00b3\u008f\u00f7\bZ\u0010>\u00abon8}\u00b1V39j*\u001e0\u00e3\u00fa".length();
                            var16_7 = 24;
                            var15_8 = -1;
lbl38:
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
lbl43:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = _6o.b(var21_9).intern();
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
lbl55:
                        // 1 sources

                        ** continue;
                    }
                }
                _6o.d = var20_3;
                _6o.e = new String[19];
                _6o.l = new HashMap<K, V>(13);
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
                var6_12 = new long[33];
                var3_13 = 0;
                var4_14 = "\u009dyH\u00b9:\u00c5HQ\u00c6\u00e5\u0088~\u00ab\u0098Qt\u00e0L\u00a0\u00e4\u00f3~\u000e\u009bS\u0007\u009a\u0000-\u00b4i\u00ac7\u00028\u00fe\u00c2F*\u00e0\u0093VS\u0082\u000b6\u00f3\u00e8rP'\u0083r\u001e\u000bL\u0099\u0017\u001d\u0085\u009d\n\u00bf\u009c\u00ad\u00f6\u0081\u0011@u\u00fed\u00e0\u00e5\t\u00b0\u0005\u00c7\u00c9z\u00f2Z\u00bb.Y\u00c0V\u00e5\u00a0|\u0094\u00dd\u00f8<\u008b\u00a0\u00deUG\u00e8\u00ad\u00d9\u001aS\u007f\u00baw\u00cbo\u00a6\u00f3E\r\f\u00ea0V\u00b4\u008b\u0003\u00db\u0010(\u008bK\u0097\u0019\u00b7av/\u0014\u00cb\u00aa\u00ec;\u00d3 \u00fb\u0087\u00ac\f\u0014Z\u009b\u000f5\u00e1\u00c0tC\u0090\u00a1\u00c1(%/\u00f5\u009d\u008d\u00f0{\u0017H\u00c6\u008b4I\u00b1fH\u0017\u00a7\u00f7\u00e8^`\u00c7^}\u00e1\u008c\u001e\u00d7t\u00ea\u00c4a\u00aa\u001f+\u009f\u00d3'\u00fc7A\u0016{\u00889\u008a\u0083R-\r\u001b;-\u001c7\u00ba\u008eK\u00c3Z\u00d99\u00c2N\u00da\u00c4\u00e8\u00fa\u00acg\u00d60D\\\u00b1t \u0018\u0018\u00c8o!}\u000f\u00d9\u00fb\u009d\\\u00cb\u00eaz\u00ac";
                var5_15 = "\u009dyH\u00b9:\u00c5HQ\u00c6\u00e5\u0088~\u00ab\u0098Qt\u00e0L\u00a0\u00e4\u00f3~\u000e\u009bS\u0007\u009a\u0000-\u00b4i\u00ac7\u00028\u00fe\u00c2F*\u00e0\u0093VS\u0082\u000b6\u00f3\u00e8rP'\u0083r\u001e\u000bL\u0099\u0017\u001d\u0085\u009d\n\u00bf\u009c\u00ad\u00f6\u0081\u0011@u\u00fed\u00e0\u00e5\t\u00b0\u0005\u00c7\u00c9z\u00f2Z\u00bb.Y\u00c0V\u00e5\u00a0|\u0094\u00dd\u00f8<\u008b\u00a0\u00deUG\u00e8\u00ad\u00d9\u001aS\u007f\u00baw\u00cbo\u00a6\u00f3E\r\f\u00ea0V\u00b4\u008b\u0003\u00db\u0010(\u008bK\u0097\u0019\u00b7av/\u0014\u00cb\u00aa\u00ec;\u00d3 \u00fb\u0087\u00ac\f\u0014Z\u009b\u000f5\u00e1\u00c0tC\u0090\u00a1\u00c1(%/\u00f5\u009d\u008d\u00f0{\u0017H\u00c6\u008b4I\u00b1fH\u0017\u00a7\u00f7\u00e8^`\u00c7^}\u00e1\u008c\u001e\u00d7t\u00ea\u00c4a\u00aa\u001f+\u009f\u00d3'\u00fc7A\u0016{\u00889\u008a\u0083R-\r\u001b;-\u001c7\u00ba\u008eK\u00c3Z\u00d99\u00c2N\u00da\u00c4\u00e8\u00fa\u00acg\u00d60D\\\u00b1t \u0018\u0018\u00c8o!}\u000f\u00d9\u00fb\u009d\\\u00cb\u00eaz\u00ac".length();
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
lbl82:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u00d2G\u00baY\u00d5\u0099\u007f\u00db\u009a\u009a\u00bd=8\u00d9i(";
                    var5_15 = "\u00d2G\u00baY\u00d5\u0099\u007f\u00db\u009a\u009a\u00bd=8\u00d9i(".length();
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
lbl95:
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
lbl108:
                // 1 sources

                ** continue;
            }
        }
        _6o.j = var6_12;
        _6o.k = new Integer[33];
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (_6o.n[n3] != null) {
            return n3;
        }
        Object object = m[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 41;
            case 1 -> 55;
            case 2 -> 11;
            case 3 -> 3;
            case 4 -> 5;
            case 5 -> 28;
            case 6 -> 44;
            case 7 -> 59;
            case 8 -> 38;
            case 9 -> 57;
            case 10 -> 8;
            case 11 -> 26;
            case 12 -> 30;
            case 13 -> 37;
            case 14 -> 51;
            case 15 -> 18;
            case 16 -> 1;
            case 17 -> 56;
            case 18 -> 20;
            case 19 -> 9;
            case 20 -> 0;
            case 21 -> 2;
            case 22 -> 21;
            case 23 -> 49;
            case 24 -> 46;
            case 25 -> 47;
            case 26 -> 23;
            case 27 -> 36;
            case 28 -> 42;
            case 29 -> 63;
            case 30 -> 40;
            case 31 -> 4;
            case 32 -> 39;
            case 33 -> 10;
            case 34 -> 60;
            case 35 -> 7;
            case 36 -> 53;
            case 37 -> 6;
            case 38 -> 35;
            case 39 -> 29;
            case 40 -> 58;
            case 41 -> 14;
            case 42 -> 12;
            case 43 -> 54;
            case 44 -> 45;
            case 45 -> 32;
            case 46 -> 15;
            case 47 -> 24;
            case 48 -> 43;
            case 49 -> 48;
            case 50 -> 50;
            case 51 -> 19;
            case 52 -> 17;
            case 53 -> 13;
            case 54 -> 52;
            case 55 -> 27;
            case 56 -> 16;
            case 57 -> 25;
            case 58 -> 34;
            case 59 -> 62;
            case 60 -> 61;
            case 61 -> 22;
            case 62 -> 33;
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
        _6o.n[n3] = new String(cArray);
        return n3;
    }

    /*
     * Exception decompiling
     */
    private static _8B dev_krypton_8B_9(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 20[SWITCH]
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

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _6o.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void b() {
        Object[] objectArray = m;
        m[0] = "5c\u00074Er5c\u0010hI}/(\u0010vIh(YA,\u001f)";
        objectArray[1] = Integer.TYPE;
        _6o.n[1] = "java/lang/Integer";
        objectArray[2] = "O\u0002)\u000bfAR\u0017+Jc\u001d\u001d\b";
        objectArray[3] = "&T)Y\u001e_St\"V\u000f\u00102z)]\u000bJF";
        objectArray[4] = Void.TYPE;
        _6o.n[4] = "java/lang/Void";
        objectArray[5] = "\u00052U@\u001a2p\u0012^O\u000b}\u0011\u001cUD\u000f'e";
        objectArray[6] = "LsM@c*9SFOreX]MDv?,";
        objectArray[7] = "'8l\u0012RR:-nSW\u000e{\u001f";
        objectArray[8] = "]\u001f\u0001\r\u0019?]\u001f\u0016Q\u00150GT\u0016O\u0015%@%B\u0017B";
        objectArray[9] = "uP)y(,hE+8-p(M";
        objectArray[10] = "ApM)\n\u001b_xWfm\u001aNcZ<K\u001c";
        objectArray[11] = "P\u000fTX=Z[\u0000E\u0017\\TP\u000bAM";
        objectArray[12] = "g6\u0016Z\u000b\u0019z#\u0014\u001b\u000eE:!";
        objectArray[13] = "YK\u001f6Z[D^\u001dw_\u0007\tE";
        objectArray[14] = "`\"Eba\u001f`\"R>m\u0010ziR m\u0005}\u0018\u0003x?";
        objectArray[15] = "3#H1}=-+R~\u0000--";
        objectArray[16] = "y\u0003\u0010S\u007f`\f#\u001b\\n/m-\u0010Wju\u0019";
        objectArray[17] = "8GI`[-&OS/89\"";
        objectArray[18] = "*5\"%\u001fJ*55y\u0013E0~5g\u0013P7\u000fe:B";
        objectArray[19] = "3\\[v\r\r3\\L*\u0001\u0002)\u0017L4\u0001\u0017.f\u001ciU";
        objectArray[20] = Long.TYPE;
        _6o.n[20] = "java/lang/Long";
        objectArray[21] = Boolean.TYPE;
        _6o.n[21] = "java/lang/Boolean";
        objectArray[22] = Double.TYPE;
        _6o.n[22] = "java/lang/Double";
        objectArray[23] = "\nF\u0015hs%\nF\u00024\u007f*\u0010\r\u0002*\u007f?\u0017|Su-t";
        objectArray[24] = "l\u0004\u0011\u0013n,\u0019$\u001a\u001c\u007fcx*\u0011\u0017{9\f";
        objectArray[25] = "g(Hm[\u0004y R\"8\u0010}m{b\u0001\u0003t";
        objectArray[26] = "(z\u0011\u0001>L#u\u0000N]A6s";
        objectArray[27] = "2~l0@\u001b/knqEG`c";
        objectArray[28] = "x\u0011;) 1x\u0011,u,>bZ,k,+e+}2{i";
        objectArray[29] = "~\u0000z*Q!u\u000fke,9f\bb,";
        objectArray[30] = "{7UB\u00103{7B\u001e\u001c<a|B\u0000\u001c)f\r\u0014^Hj";
        objectArray[31] = "^)_R\u0004!U&N\u001dX(R$LP^cr!L_N";
        objectArray[32] = "Fmj\t#\u001aFm}U/\u0015\\&}K/\u0000[W)\u001e|@";
        objectArray[33] = "\u0000\u0014h\u001arB\u0000\u0014\u007fF~M\u001a_\u007fX~X\u001d..\u0007(\u0013";
        objectArray[34] = "\u0004f \u000eN0\u000fi1A)2\u001ab1\n\u0012";
        objectArray[35] = "o*AIxZd%P\u0006\u0015Zd8D";
        objectArray[36] = ";rGt\"{%z];@g\"g";
        objectArray[37] = "x\twvy s\u0006f9\u00048`\u0001op\u00159{\u0004er%";
        objectArray[38] = "Z\"\u0019\u000f$HQ-\b@XQ^-\u000e\ffA";
        objectArray[39] = ".^\u007f-R^.^hq^Q4\u0015ho^D3d9:\t\u0007";
        objectArray[40] = "g.`%\r]\u0012\u000ek*\u001c\u0012s\u0000`!\u0018H\u0007";
        objectArray[41] = "m2\u0014\u0003\u0002zp'\u0016B\u0007&=%";
        objectArray[42] = "(`\b\fQS]@\u0003\u0003@\u001c<N\b\bDFH";
        objectArray[43] = "KquGY(Kqb\u001bU'Q:b\u0005U2VK3_\u0006s";
        objectArray[44] = "%) \u0014s\u007f%)7H\u007fp?b7V\u007fe8\u0013f\u000f''";
        objectArray[45] = "\u001fkN!\u001f\u007f\u001fkY}\u0013p\u0005 Yc\u0013e\u0002Q\b;J!";
        objectArray[46] = "#Ntr\u0002wVn\u007f}\u001387`tv\u0017bC";
        objectArray[47] = "SRUN0CX]D\u0001lJ__FLj\u0001t\\GFxF\\A";
        objectArray[48] = "#27sCDV\u0012<|R\u000b\n\u001b;~PF\fP\u001b{PI\u001cE";
        objectArray[49] = ",pY\u0005.\u007ftzD\nMq%|&X|t#\u007fCU$~*\u0000\u0016Y'u7e\u001b\u0001-|H";
        objectArray[50] = "\u001esMQS\u0019\u001eb\f\u00144\u0001\u001eq/DP\u001d\u0015\rH\u0014\r\u000e\u001aj\u001b]N\u0002x";
        objectArray[51] = ":\u00122r\u0006]9\u000bsm}Z>7wz\u0001Z.l2*DU'\u000bac\u0007YE\u0001oh\u0002E&\rg/\u0014;";
        objectArray[52] = "O\u0012,wj&J\u0019!p\f*\u001f\u001c1n`\u0018IYm63OKYhgn(\u0018\u0010+k\f";
        objectArray[53] = "|ImW4\ryB`PR\u0001,GpN>3~\u0000-\u0012R\u0006/\u0005oT\"\u00041\u0007`)?\u0000:DnJ3\b}R\u0010\u0013,\u0001-ZrE=\u0018%;";
        objectArray[54] = "\u0001KG\u0018<T\tWYz=\u0005\u001cHZ\u0016\u000fQY\u0015\u0007AXQY\u0011S\u0018?\u0002\u0010R_z";
        objectArray[55] = "z\u000e\u0005{!h\"\u0004\u0018tBfs\u0002&g:d\u001e\u0019\u001el\"o`\f\u0011+#\t";
        objectArray[56] = "I%#xm'\u001c=.\"\u001c;\u001a'9E,l\u001d<: !4\u00175E";
        objectArray[57] = "jYnD*\t*\u001av\u001a\u0010JS\u0012pV+\u0015,Di\u0014h";
        objectArray[58] = "}]\u0003\u007fJ6hRD~,)ap\u0002dM'|P\u0013{A\u0006`^\u001c\u001fK,`Y\u001fa^#'XyrH3eG\u001a~@ts9";
        objectArray[59] = "<v%U3\u001e',)\u000eW\u0014)hB\fnB*v%_'\u0001&\u0014r\u0004=\u0010;q\u007f\\7\u0019D";
        objectArray[60] = "\b\u001d\u0004]YV\n\u0011DL)Y\u001d\u0013CWU_\u001b~\u0007LO\u0005\u0010\u0004RTB_a";
        objectArray[61] = "Zzh:k9\r8|1\u0014(Amg=h(1yo*z5A?j$*E\u000b~i,u']op$\u0014";
        objectArray[62] = "dbd\"9+$!||\u0003e2\u0019~':-c)j4j,]#\u007f(o4?un1gU";
        objectArray[63] = "ot'}v+$\"p-Gv\u001eOiz~>`\u007f}i.?^uhu+'<#yl#F";
        objectArray[64] = "\b+%T\u0013\u0005Hh=\n)E1;~\u0000B\u001aU1xD\u0016";
        objectArray[65] = "\fuW=UBT,B2(Jn:SnPM^.@>QsT;\\;I\u0011\u0002*E3(";
        objectArray[66] = "\u0005#iATu\u000f%-\u00155z\np;P5+\u0010x>KW}\u0001a6*";
        objectArray[67] = "ce_\u0002\u0015^5|\u001dAw\u001bSs\u0012\u0002\f\u00181/\u001f]\u001a!>zYF\tB2r\u001ePw";
        objectArray[68] = "\u0010\u0019A>\u0015;\u001a\u001f\u0005jt>\u0000j\u001f-\b.{J\u001e.\u000b!\u0018F\u0016i\u001d_";
        objectArray[69] = "0\u000b;^<\u0001h\u0001&Q_\u000f9\u0007\u0001T3\u0001:\u001a)I$`mB}]=\u0007>\u000b>Q_";
        objectArray[70] = "2\u001fY.iW0\u0001[!\u0014B=\r\u00076xpkI^o/'3\u001f[:)H)\n\u001ao\u0014E>O\u0018,dG M\u0017Q";
        objectArray[71] = "$gJp5>&c^-O'/'@*#\u0015{c\u001awvBrjJ&0'\u007f2@/O8\u007f1@wv$#)\\M";
        objectArray[72] = "?|_k,_\u007f?G5\u0016\u001a\u00067Ay-CyaX;n";
        objectArray[73] = "R\u000e=\u0015\u001eI\u0005L)\u001ea[X\u0019=\u00036\f\u0006Neo\\GD\n?\u0006YLI\r";
        objectArray[74] = "\u0001opHRW\u000bi4\u001c3K\u0017-K\u0013\u0002Y\u0001..\u001eZS\bQ{\u0012YX\u00154vJSQjazIXL\u000fl\"CQ3";
        objectArray[75] = "\u0001\u00106\b83\b\bm\u0002V-\u0000\nl\b:\u001fVF1UoHTO5\u00014/\u0007\u0006v\rV";
        objectArray[76] = "I\u0006\u007f#b`FB~r\u0007qD\u0006J*ccDz$rmuV\u001f)*g|)";
        objectArray[77] = "\u000fLY72\u0016\nGT0T\u001a_BD.8(\t\u0007\u0018ve\u007f\u000b\u0007\u001d'6\u0018XN^+T";
        objectArray[78] = "uTO\u0007>32\u000eO\u0016_\u001dGmf$\u001e\u0011Bwm%_,lRF\u000b;k6RW";
        objectArray[79] = "\u0010Rx\u001d$bP\u0011`C\u001e,)VwKf\"\u0019Bd\u001bg\u001cQKz\u0012zyJ\u0011vI\u001e";
        objectArray[80] = "li\u0001/\u00019lx@jf>cs@>!.\n.\u0004j\b\"m}M)\u0004@li\u0001/\u00019lx@jf";
        objectArray[81] = "\u001f>WC2u\u001f/\u0016\u0006UP(\u0018&?2h\u0003 \rA'gD!";
        objectArray[82] = "l.cUQ\u0010,m{\u000bkV9UyPR\u0016kemC\u0002\u0017Uox_\u0007\u000f79iF\u000fn";
        objectArray[83] = "R<Z*nx\u0012\u007fBtT7k8U|,8[,F,-\u0006W5\u0002(==\u0002wE{T";
        objectArray[84] = ",>n\u000exu&;g\u0000\u0005 (.c\fRrpz7Y\u0005(u):\u001ay*q=g";
        objectArray[85] = "br+X\u001f\u00166xgKv7=s6]vR1o%O\f\u0006;#6";
        objectArray[86] = "\t\b\u001bEy-\u001c\u0007\\D\u001f<\u0003\u0010-Ht7\u0007\u0016\fIQ2\u0003\b\r^\u001f#\u0011\u0017\u001e\u0014mo\u0017T\u0007%";
        objectArray[87] = "\u000b\u001aR\u0004*6\u0010@^_N:\u001f\u00145T\u007f9\u0018\u0007PY'3\u0011xX\u00005,\r\u001bT\br:s";
        objectArray[88] = "_\u0019G7?N\u0014O\u0010g\u000e\u0019n\u0013\u000e$1G\u0017[\u0016>v";
        objectArray[89] = "`<=a\u0019~ \u007f%?#;\"G'd\u001axgw3wJyY}&kOa;+7rG\u0000";
        objectArray[90] = "sBdK\u0002ykH:Jour\n7\u0013\u0003\u001c:C0\u001e\u0010y7\u001b:\u0017oe:Ld\u0018\n}0\u0012eu";
        objectArray[91] = "q\u0007F?t]&ER4\u000bO{\u0010F)\\\u0018$L\u001aEgG \u001aL>n_{\u0010";
        objectArray[92] = "]\t2k\u001c1G\u001cs>!>W\u001cnKF2Sg79\u00180\\\u0000dp[<>";
        objectArray[93] = "%MH,\u001f\u0016mURk{\u0001uXR\u007f,V/\b\f\u0013\u0015\u0013+E\u000fh\u0003T~R";
        objectArray[94] = "fy2l_?}#>7;!\u007fi8\f\u0002c'u7kQ*dyU";
        objectArray[95] = "\fU\u001atF$\u0014_Du+=\u0012>X0J'\u001aeG$\u0017*H\n]1V\u007fu";
        objectArray[96] = "y\u0018C!yHj\f\u0013<FVi\u000fC&*d=J\u0019p~3z\u000bB~*Yj\u0016M}F";
        objectArray[97] = "62aW((.8?VE$7z2\u000f)M,lc\u0002x\"6y\"WE4\u007f<a\u0004 ,ub`i";
        objectArray[98] = "w\u0004;->0m\u0011zx\u00032m\u0017n\"x_$[m-|:)\u0003g$\u00032p\u0011x8`>xVnF";
        objectArray[99] = "\u000bn}-CJK-esy\u00042%c?BVMsz}\u0001";
        objectArray[100] = "\fO_q^t\u0017\u0015S*:p\u000f`]iF`t@\\jEo\u0017LT-S\u0011";
        objectArray[101] = "\u0011Se\u0016\u0004\r\u001cSsEy\u0013\u0013Ea\u001a\u0015!G\u0001;CBvG\u00008\u0013\u001b\u0011\u0014I{\u001fy";
        objectArray[102] = "\u0003q\u00156T?\u0016~R72.\ti4+J,\u001e~\u000b?I:dr\u000b,R'\u001ag\u0004kSA";
        objectArray[103] = "U>n\u001aQ\u0017\u001d&t]5\u0000\u0005+tIbW_{(%[\u0012[6)^MU\u000e!";
        objectArray[104] = "\u000bTfMaP\u0010\u000ej\u0016\u0005T\u000f[{DyR\t6?_c\b\u0002LjGnRs";
        objectArray[105] = "$\u0000\u0013s!2oVD#\u0010gZ;]t)'+\u000bIgy&\u0015\u0001\\{|>wWMbt_";
        objectArray[106] = "G1~0f\u000bE/|?\u001b\u001eH# (w,\u0019d|p#{F1|$&\u0014\\$=q\u001b\u001f\u00155}.bC\u001e&-O";
        objectArray[107] = "/H58\u001a\u001c<\\e%%\u0002?_5?I0k\u001aoi\u001cg,\u0018h$A\nc\u001c.\"%";
        objectArray[108] = "\"yHG\"-waE\u001dS7uph\u0017#+\u001cfJ\u0001,)\u007fjBF:W";
        objectArray[109] = "SJ>\u007fC:\u001bR$8'-\u0003_$,pzY\u000fy@I?]By;_x\bU";
        objectArray[110] = "}%'\u007fXT!-}p$@vn\u0017x\u001d\u0010rwp+TS~\u0015.x\u001dG~r}1^K\u001c";
        objectArray[111] = "l\u0017\tvY\u001f4N\u001cy$\u0017\u000eL\u001dx^Qr\u001b_lU";
        objectArray[112] = "_w\u0019S?h\u0007}\u0004\\\\rV{/U7d@|\u0007T8d;j\u0002E#wXf\n\u00025\t\u0001y\u0003R=kWh\u001aZ\\";
        objectArray[113] = "gfXa3,h\"Y0V=jfpl'R7+Yj)7:sScV";
        objectArray[114] = ";\u0003\u0000\u000f}9c\t\u001d\u0000\u001e9$(\u000e\u0004b82\u000f\u001e\t\u001e5;\b\u0000\u001c}93O\u0016b";
        objectArray[115] = "FEY\u0002\u001cGNYG`\u001d\u0016[FD\f/B\u001e\u001b\u0019\\xB\u001e\u001fM\u0002\u001f\u0011W\\A`";
        objectArray[116] = "\u0010}#?\u001fx\f!;#%=\r\u001b5%D'\u0005@*1\u0019*W/0$X\u007fj";
        objectArray[117] = "\u000bN\u0019^j*\u0018ZICU4\u001bY\u0019Y9\u0006O\u001cC\u000fnQ\u0019O\u001dU(*\u0014O\u000b\u0006U";
        objectArray[118] = "r%\u0019\u0003P7x#]W1>\u007fgX\u0019j>e\u001bK\u000b\f0iuI\u0007L!\u0019";
        objectArray[119] = "\u0007_\u001aO\nF\n_\f\u001cwX\u0005I\u001eC\u001bjQ\rD\u001aO=Q\fGJ\u0015Z\u0002E\u0004Fw";
        objectArray[120] = "\u0016r??92Nx\"0Z<\u001f~\u00014&SB3*9%6Ok 0ZjK;.0=9\u0002x\"R";
        objectArray[121] = "\u0015&cT9@\u0000)$U__\t\u001acU:_\u000e#gY_S\u00169fJ<_\u001e~p4";
        objectArray[122] = "\u0018)%#\u000f-\u0015)3pr3\u001a?!/\u001e\u0001N{{vNVNzx&\u00101\u001d3;*r";
        objectArray[123] = "\u0010*\u0019R-P\u001a,]\u0006L_\u001cr^P-R\u0000WOHL\u0004J~IF)\t\u0012t@9!P\u0000k\\Z-XG}\"";
        Object[] objectArray2 = objectArray;
        objectArray[124] = "\u0002\u000fZ&h \u001a\u0005\u0004'\u0005,\u0003G\t~iEB\u0006]vg\"\u0011O\u001ez\u0005<K\u0001Zu`$A_[\u0018";
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
            if (c == '\u00d1' || c == '\u00de' || c == '\u00db' || c == '\u00cf') {
                field = _6o.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d1' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00de' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00db' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _6o.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00a2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'c' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6o" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _6o.c(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static int c(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x6200;
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
                throw new RuntimeException("dev/krypton/6o", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _6o.k[n2] = n3;
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
        int n = _6o.e(l2, l3);
        Object object = m[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = _6o.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = _6o.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _6o.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _6o.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _6o.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _6o.f(838759741823575L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _6o.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _6o.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _6o.f(838759741823575L, 0L);
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
            int n = _6o.e(l2, l3);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                _6o.m[n] = clazz = Class.forName(_6o.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _6o.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _6o.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _6o.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _6o.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6o" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6o" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _6o.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x3139;
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
                throw new RuntimeException("dev/krypton/6o", exception);
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
            _6o.e[n2] = _6o.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Field g(long l2, long l3) {
        int n = _6o.e(l2, l3);
        Object object = m[n];
        if (object instanceof String) {
            String string = _6o.n[n];
            int n2 = string.indexOf(8);
            Class clazz = _6o.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _6o.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _6o.c(clazz3, string2, clazz2)) != null) {
                    _6o.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _6o.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _6o.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _6o.f(838759741823575L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void cfr_renamed_4(String string, char c, int n, short s) {
        block5: {
            CallSite callSite;
            long l2;
            block4: {
                l2 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48) ^ b;
                String string2 = _8h.cfr_renamed_4();
                try {
                    try {
                        callSite = _6o.d("\u00d1", (Object)_6o.d("\u00d1", (Object)this, 8248787948213818206L, (long)l2), 8246145363981731551L, (long)l2);
                        if (string2 != null) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _6o.a((Exception)((Object)matchException));
                    }
                    callSite = _6o.d("\u00d1", (Object)_6o.d("\u00d1", (Object)this, 8248787948213818206L, (long)l2), 8246145363981731551L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _6o.a((Exception)((Object)matchException));
                }
            }
            _6o.d("\u00a2", (Object)callSite, (Object)_6o.d("c", string, 8247212225400106416L, (long)l2), (boolean)false, 8245860676536288151L, (long)l2);
        }
    }

    private void cfr_renamed_2(String string, long l2) {
        block5: {
            CallSite callSite;
            block4: {
                l2 = b ^ l2;
                String string2 = _8h.cfr_renamed_4();
                try {
                    try {
                        callSite = _6o.d("\u00d1", (Object)_6o.d("\u00d1", (Object)this, 4593381111742832281L, (long)l2), 4591229206535916312L, (long)l2);
                        if (string2 != null) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _6o.a((Exception)((Object)matchException));
                    }
                    callSite = _6o.d("\u00d1", (Object)_6o.d("\u00d1", (Object)this, 4593381111742832281L, (long)l2), 4591229206535916312L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _6o.a((Exception)((Object)matchException));
                }
            }
            _6o.d("\u00a2", (Object)callSite, (Object)_6o.d("c", string, 4593532580925186751L, (long)l2), (boolean)false, 4587001704820215376L, (long)l2);
        }
    }

    @_3i_0
    public void cfr_renamed_8(_6c_0 c_0) {
        CallSite callSite;
        String string;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        block15: {
            block16: {
                block14: {
                    _6o o;
                    block13: {
                        long l7 = l6 = b ^ 0x60F6FCB9535L;
                        l5 = l7 ^ 0x747D523CAA6AL;
                        l4 = l7 ^ 0x6DDD42ECD1D8L;
                        l3 = l7 ^ 0x7AC8A295470CL;
                        l2 = l7 ^ 0xC4A7E583A47L;
                        string = _8h.cfr_renamed_4();
                        try {
                            try {
                                o = this;
                                if (string != null) break block13;
                                if (_6o.d("\u00d1", (Object)_6o.d("\u00d1", (Object)o, -588947414762170636L, (long)l6), -587150093532789899L, (long)l6) == null) break block14;
                            }
                            catch (MatchException matchException) {
                                throw _6o.a((Exception)((Object)matchException));
                            }
                            o = this;
                        }
                        catch (MatchException matchException) {
                            throw _6o.a((Exception)((Object)matchException));
                        }
                    }
                    try {
                        callSite = _6o.d("\u00a2", (Object)_6o.d("\u00d1", (Object)o, -587620298209073730L, (long)l6), -587347290160042426L, (long)l6);
                        if (string != null) break block15;
                        if (callSite == false) break block16;
                    }
                    catch (MatchException matchException) {
                        throw _6o.a((Exception)((Object)matchException));
                    }
                }
                return;
            }
            callSite = _6o.d("\u00a2", (Object)_6o.d("\u00d1", (Object)_6o.d("\u00d1", (Object)this, -588947414762170636L, (long)l6), -585875163365659627L, (long)l6), -587003318262478061L, (long)l6);
        }
        CallSite callSite2 = callSite;
        reference var14_9 = _6o.d("\u00a2", (Object)_6o.d("\u00d1", (Object)_6o.d("\u00d1", (Object)this, -588947414762170636L, (long)l6), -587150093532789899L, (long)l6), -592942379706390200L, (long)l6) >> 4;
        reference var15_10 = _6o.d("\u00a2", (Object)_6o.d("\u00d1", (Object)_6o.d("\u00d1", (Object)this, -588947414762170636L, (long)l6), -587150093532789899L, (long)l6), -586808140814889402L, (long)l6) >> 4;
        CallSite callSite3 = _6o.d("\u00a2", (Object)_6o.d("\u00a2", (Object)_6o.d("\u00d1", (Object)this, -587620298209073730L, (long)l6), -588289665160167335L, (long)l6), -592430337575261948L, (long)l6);
        while (_6o.d("\u00a2", (Object)callSite3, -588991989956031183L, (long)l6) != false) {
            block18: {
                CallSite callSite4;
                CallSite callSite5;
                class_2338 class_23382;
                Map.Entry entry;
                block17: {
                    entry = (Map.Entry)((Object)_6o.d("\u00a2", (Object)callSite3, -592655741037237581L, (long)l6));
                    class_23382 = (class_2338)_6o.d("\u00a2", (Object)entry, -588829482922914265L, (long)l6);
                    reference var19_14 = _6o.d("\u00a2", (Object)class_23382, -589629929722398620L, (long)l6) >> 4;
                    reference var20_15 = _6o.d("\u00a2", (Object)class_23382, -588366183278645235L, (long)l6) >> 4;
                    try {
                        callSite5 = _6o.d("c", (int)(var19_14 - var14_9), -588894697889911581L, (long)l6);
                        callSite4 = callSite2;
                        if (string != null) break block17;
                        if (callSite5 > callSite4) continue;
                    }
                    catch (MatchException matchException) {
                        throw _6o.a((Exception)((Object)matchException));
                    }
                    callSite5 = _6o.d("c", (int)(var20_15 - var15_10), -588894697889911581L, (long)l6);
                    callSite4 = callSite2;
                }
                if (callSite5 > callSite4) continue;
                Object[] objectArray = new Object[3];
                objectArray[2] = l5;
                objectArray[1] = (int)_6o.c("k", 9818, (long)(0x6BA553CFF5E23386L ^ l6));
                objectArray[0] = (String)((Object)_6o.d("\u00a2", (Object)entry, -586767954421355021L, (long)l6));
                CallSite callSite6 = _6o.d("c", (Object)objectArray, -586417550059565332L, (long)l6);
                Object[] objectArray2 = new Object[3];
                objectArray2[2] = l5;
                objectArray2[1] = (int)_6o.c("k", 691, (long)(0x67C6B94981699770L ^ l6));
                objectArray2[0] = (String)((Object)_6o.d("\u00a2", (Object)entry, -586767954421355021L, (long)l6));
                CallSite callSite7 = _6o.d("c", (Object)objectArray2, -586417550059565332L, (long)l6);
                try {
                    try {
                        Object[] objectArray3 = new Object[11];
                        objectArray3[10] = l3;
                        objectArray3[9] = 0;
                        objectArray3[8] = _6o.d("\u00db", -586280676476748112L, (long)l6);
                        objectArray3[7] = callSite6;
                        objectArray3[6] = callSite6;
                        objectArray3[5] = (double)(_6o.d("\u00a2", (Object)class_23382, -588366183278645235L, (long)l6) + true);
                        objectArray3[4] = (double)(_6o.d("\u00a2", (Object)class_23382, -588038272729289518L, (long)l6) + true);
                        objectArray3[3] = (double)(_6o.d("\u00a2", (Object)class_23382, -589629929722398620L, (long)l6) + true);
                        objectArray3[2] = (double)_6o.d("\u00a2", (Object)class_23382, -588366183278645235L, (long)l6);
                        objectArray3[1] = (double)_6o.d("\u00a2", (Object)class_23382, -588038272729289518L, (long)l6);
                        objectArray3[0] = (double)_6o.d("\u00a2", (Object)class_23382, -589629929722398620L, (long)l6);
                        _6o.d("\u00a2", (Object)c_0.cfr_renamed_7, (Object)objectArray3, -592298983820857020L, (long)l6);
                        if (_6o.d("\u00a2", (Object)_6o.d("\u00d1", (Object)this, -592780474167510089L, (long)l6), (long)l2, -587553028833615204L, (long)l6) == false || _6o.d("\u00db", -585933195985767578L, (long)l6) == null) break block18;
                    }
                    catch (MatchException matchException) {
                        throw _6o.a((Exception)((Object)matchException));
                    }
                    Object[] objectArray4 = new Object[8];
                    objectArray4[7] = callSite7;
                    objectArray4[6] = l4;
                    objectArray4[5] = (double)_6o.d("\u00a2", (Object)class_23382, -588366183278645235L, (long)l6) + 0.5;
                    objectArray4[4] = (double)_6o.d("\u00a2", (Object)class_23382, -588038272729289518L, (long)l6) + 0.5;
                    objectArray4[3] = (double)_6o.d("\u00a2", (Object)class_23382, -589629929722398620L, (long)l6) + 0.5;
                    objectArray4[2] = (double)_6o.d("\u00d1", (Object)_6o.d("\u00db", -585933195985767578L, (long)l6), -589479103115159488L, (long)l6);
                    objectArray4[1] = (double)_6o.d("\u00d1", (Object)_6o.d("\u00db", -585933195985767578L, (long)l6), -589070670623663950L, (long)l6);
                    objectArray4[0] = (double)_6o.d("\u00d1", (Object)_6o.d("\u00db", -585933195985767578L, (long)l6), -585712825751867666L, (long)l6);
                    _6o.d("\u00a2", (Object)c_0.cfr_renamed_7, (Object)objectArray4, -589375502320967261L, (long)l6);
                }
                catch (MatchException matchException) {
                    throw _6o.a((Exception)((Object)matchException));
                }
            }
            if (string == null) continue;
        }
    }

    @_3i_0
    public void cfr_renamed_9(_6p_0 p_0) {
        block11: {
            class_2596 class_25962;
            long l2;
            long l3;
            block10: {
                boolean bl;
                class_2596 class_25963;
                block8: {
                    String string;
                    block9: {
                        long l4 = l3 = b ^ 0x3306EA32A9DDL;
                        long l5 = l4 ^ 0x46ECCAB96D2EL;
                        l2 = l4 ^ 0x291FF069239AL;
                        string = _8h.cfr_renamed_4();
                        class_25963 = p_0.cfr_renamed_0;
                        try {
                            bl = class_25963 instanceof class_2622;
                            if (string != null) break block8;
                            if (!bl) break block9;
                        }
                        catch (MatchException matchException) {
                            throw _6o.a((Exception)((Object)matchException));
                        }
                        class_2622 class_26222 = (class_2622)class_25963;
                        Object[] objectArray = new Object[2];
                        objectArray[1] = class_26222;
                        objectArray[0] = l5;
                        _6o.d("\u00a2", (Object)this, (Object)objectArray, -3803851321876289642L, (long)l3);
                        if (string == null) break block11;
                    }
                    class_25963 = p_0.cfr_renamed_0;
                    try {
                        class_25962 = class_25963;
                        if (string != null) break block10;
                        bl = class_25962 instanceof class_2672;
                    }
                    catch (MatchException matchException) {
                        throw _6o.a((Exception)((Object)matchException));
                    }
                }
                if (!bl) break block11;
                class_25962 = class_25963;
            }
            class_2672 class_26722 = (class_2672)class_25962;
            Object[] objectArray = new Object[4];
            objectArray[3] = l2;
            objectArray[2] = (int)_6o.d("\u00a2", (Object)class_26722, -3801969799375189084L, (long)l3);
            objectArray[1] = (int)_6o.d("\u00a2", (Object)class_26722, -3806147355067767601L, (long)l3);
            objectArray[0] = class_26722;
            _6o.d("\u00a2", (Object)this, (Object)objectArray, -3804149640415344837L, (long)l3);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static List java_util_List_8(Object[] var0) {
        var2_1 = (Long)var0[0];
        var1_2 = (Class)var0[1];
        var2_1 = _6o.b ^ var2_1;
        var5_3 = new ArrayList<E>();
        var6_4 = var1_2;
        var4_5 = _8h.cfr_renamed_4();
        while (var6_4 != null) {
            block18: {
                try {
                    try {
                        v0 = var6_4;
                        if (var4_5 != null) break block18;
                        if (v0 == Object.class) break;
                    }
                    catch (MatchException v1) {
                        throw _6o.a((Exception)v1);
                    }
lbl17:
                    // 2 sources

                    while (true) {
                        v0 = var6_4;
                        break;
                    }
                }
                catch (MatchException v2) {
                    throw _6o.a((Exception)v2);
                }
            }
            var7_6 = _6o.d("\u00a2", (Object)v0, (long)-1205053040636217184L, (long)var2_1);
            var8_7 = ((CallSite)var7_6).length;
            v3 /* !! */  = 0;
            block14: while (true) {
                var9_8 = v3 /* !! */ ;
                block15: while (true) {
                    v4 = var9_8;
                    while (v4 < var8_7) {
                        block19: {
                            block20: {
                                block21: {
                                    var10_9 = var7_6[var9_8];
                                    try {
                                        v5 = var4_5;
                                        if (var2_1 < 0L) break block19;
                                        if (v5 != null) break block20;
                                        v3 /* !! */  = (int)_6o.d("c", (int)_6o.d("\u00a2", (Object)var10_9, (long)-1206346836442208013L, (long)var2_1), (long)-1198048370852283468L, (long)var2_1);
                                        if (var4_5 != null) continue block14;
                                        if (var2_1 <= 0L) continue;
                                    }
                                    catch (MatchException v6) {
                                        throw _6o.a((Exception)v6);
                                    }
                                    try {
                                        try {
                                            try {
                                                if (var2_1 > 0L) {
                                                    if (v3 /* !! */  != 0) break block21;
                                                    v7 = _6o.d("\u00a2", (Object)var10_9, (long)-1202525483444793682L, (long)var2_1);
                                                }
                                                if (var4_5 != null) break block21;
                                            }
                                            catch (MatchException v8) {
                                                throw _6o.a((Exception)v8);
                                            }
                                            if (v7 != false) break block21;
                                        }
                                        catch (MatchException v9) {
                                            throw _6o.a((Exception)v9);
                                        }
                                        v7 = _6o.d("\u00a2", var5_3, (Object)var10_9, (long)-1205077514785187883L, (long)var2_1);
                                    }
                                    catch (MatchException v10) {
                                        throw _6o.a((Exception)v10);
                                    }
                                }
                                ++var9_8;
                            }
                            v5 = var4_5;
                        }
                        if (v5 == null) continue block15;
                    }
                    var6_4 = _6o.d("\u00a2", (Object)var6_4, (long)-1203932661330207579L, (long)var2_1);
                    if (var2_1 >= 0L) break block14;
                }
                break;
            }
            if (var4_5 == null) continue;
        }
        ** while (var2_1 < 0L)
lbl71:
        // 1 sources

        return var5_3;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_6o.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_6o.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_6o.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

