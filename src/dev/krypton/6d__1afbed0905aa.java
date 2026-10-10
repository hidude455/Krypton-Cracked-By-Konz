/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1297
 *  net.minecraft.class_1501
 *  net.minecraft.class_1604
 *  net.minecraft.class_1641
 *  net.minecraft.class_1646
 *  net.minecraft.class_1923
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350$class_2351
 *  net.minecraft.class_2393
 *  net.minecraft.class_2541
 *  net.minecraft.class_2680
 *  net.minecraft.class_2818
 *  net.minecraft.class_3989
 *  net.minecraft.class_4776
 *  net.minecraft.class_4777
 *  net.minecraft.class_4950
 *  net.minecraft.class_4951
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._3i_0;
import dev.krypton._3m;
import dev.krypton._4k;
import dev.krypton._4r;
import dev.krypton._6Q;
import dev.krypton._6c_0;
import dev.krypton._6l_0;
import dev.krypton._6x_0;
import dev.krypton._8B;
import dev.krypton._8h;
import dev.krypton._92;
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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1297;
import net.minecraft.class_1501;
import net.minecraft.class_1604;
import net.minecraft.class_1641;
import net.minecraft.class_1646;
import net.minecraft.class_1923;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2393;
import net.minecraft.class_2541;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import net.minecraft.class_3989;
import net.minecraft.class_4776;
import net.minecraft.class_4777;
import net.minecraft.class_4950;
import net.minecraft.class_4951;

/*
 * Renamed from dev.krypton.6d
 */
public class _6d_0
extends _6x_0 {
    private static final int cfr_renamed_441;
    private final _9r cfr_renamed_1;
    private final _9r cfr_renamed_267;
    private final _9r cfr_renamed_447;
    private final _9r cfr_renamed_6;
    private final _9r cfr_renamed_8;
    private final _9r cfr_renamed_7;
    private final _9r cfr_renamed_3;
    private final _9r cfr_renamed_212;
    private final _9r cfr_renamed_0;
    private final _92 cfr_renamed_9;
    private final _9r cfr_renamed_149;
    private final _92 cfr_renamed_448;
    private final _92 cfr_renamed_4;
    private final Map cfr_renamed_2;
    private final Set cfr_renamed_394;
    private final Set cfr_renamed_269;
    private final ExecutorService cfr_renamed_449;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    @Override
    public native void cfr_renamed_5();

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void cfr_renamed_248(Object[] var1_1) {
        block100: {
            block84: {
                block99: {
                    block82: {
                        block83: {
                            block81: {
                                var3_2 = (Long)var1_1[0];
                                var2_3 = (class_2818)var1_1[1];
                                v0 = var3_2 = _6d_0.b ^ var3_2;
                                var5_4 = v0 ^ 136288396701227L;
                                var7_5 = v0 ^ 102797842587372L;
                                var9_6 = v0 ^ 130248196410300L;
                                var11_7 = v0 ^ 99900459046686L;
                                var13_8 = v0 ^ 46144209652620L;
                                var15_9 = _8h.cfr_renamed_4();
                                try {
                                    try {
                                        if (_6d_0.c("q", (Object)_6d_0.c("q", (Object)this, (long)5056766870917152267L, (long)var3_2), (long)5054269351098671339L, (long)var3_2) == null) break block81;
                                        v1 = var2_3;
                                        if (var15_9 != null) break block82;
                                    }
                                    catch (MatchException v2) {
                                        throw _6d_0.a(v2);
                                    }
                                    if (v1 != null) break block83;
                                }
                                catch (MatchException v3) {
                                    throw _6d_0.a(v3);
                                }
                            }
                            return;
                        }
                        v1 = var2_3;
                    }
                    var16_10 = _6d_0.c("W", (Object)v1, (long)5050549169808808678L, (long)var3_2);
                    var17_11 = _6d_0.c("W", (Object)var2_3, (long)5052255366496583811L, (long)var3_2);
                    var18_12 = _6d_0.c("W", (Object)_6d_0.c("W", (Object)var2_3, (long)5056102362923286394L, (long)var3_2), (long)5053980483942020262L, (long)var3_2);
                    var19_13 = _6d_0.c("W", (Object)_6d_0.c("W", (Object)var2_3, (long)5056102362923286394L, (long)var3_2), (long)5052624611717594440L, (long)var3_2);
                    var20_14 = _6d_0.c("W", (Object)var2_3, (long)5056102362923286394L, (long)var3_2);
                    var21_15 = new HashMap<K, V>();
                    var22_16 = 0;
                    var23_17 = 0;
                    block68: while (true) {
                        v4 = var23_17;
                        block69: while (v4 < ((CallSite)var16_10).length) {
                            block85: {
                                block86: {
                                    block87: {
                                        block88: {
                                            var24_18 = var16_10[var23_17];
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (var3_2 <= 0L || var15_9 != null) break block84;
                                                            v5 = var15_9;
                                                            if (var3_2 < 0L) continue block68;
                                                            if (v5 != null) break block85;
                                                        }
                                                        catch (MatchException v6) {
                                                            throw _6d_0.a(v6);
                                                        }
                                                        if (var24_18 == null) break block86;
                                                    }
                                                    catch (MatchException v7) {
                                                        throw _6d_0.a(v7);
                                                    }
                                                    v8 = _6d_0.c("W", (Object)var24_18, (long)5053152896872061593L, (long)var3_2);
                                                    if (var15_9 != null) break block87;
                                                }
                                                catch (MatchException v9) {
                                                    throw _6d_0.a(v9);
                                                }
                                                if (v8 == false) break block88;
                                            }
                                            catch (MatchException v10) {
                                                throw _6d_0.a(v10);
                                            }
                                            if (var3_2 >= 0L) break block86;
                                        }
                                        v8 = var17_11 + var23_17 << 4;
                                    }
                                    var25_19 = v8;
                                    var26_20 = 0;
                                    block70: while (true) {
                                        v11 = var26_20;
                                        block71: while (v11 < _6d_0.a("a", (int)31072, (long)(1678326667274261406L ^ var3_2))) {
                                            v4 = 0;
                                            if (var15_9 != null) continue block69;
                                            var27_21 = v4;
                                            block72: while (true) {
                                                v12 /* !! */  = var27_21;
                                                block73: while (v12 /* !! */  < _6d_0.a("a", (int)31072, (long)(1678326667274261406L ^ var3_2))) {
                                                    v11 = 0;
                                                    v13 = var15_9;
                                                    block74: while (v13 == null) {
                                                        for (var28_22 = v2473256; var28_22 < _6d_0.a("a", (int)31072, (long)(1678326667274261406L ^ var3_2)); ++var28_22) {
                                                            block98: {
                                                                block97: {
                                                                    block95: {
                                                                        block96: {
                                                                            block93: {
                                                                                block94: {
                                                                                    block91: {
                                                                                        block92: {
                                                                                            block89: {
                                                                                                block90: {
                                                                                                    var29_23 = _6d_0.c("W", (Object)var24_18, (int)var26_20, (int)var28_22, (int)var27_21, (long)5054555504069096765L, (long)var3_2);
                                                                                                    var30_24 = _6d_0.c("W", (Object)var29_23, (long)5052438341240110893L, (long)var3_2);
                                                                                                    var31_25 = new class_2338((int)(var18_12 + var26_20), (int)(var25_19 + var28_22), (int)(var19_13 + var27_21));
                                                                                                    v12 /* !! */  = (int)_6d_0.c("W", (Object)_6d_0.c("q", (Object)this, (long)5052579877043853436L, (long)var3_2), (long)var13_8, (long)5050694638899283062L, (long)var3_2);
                                                                                                    if (var15_9 != null) continue block73;
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    v13 = var15_9;
                                                                                                                    if (var3_2 <= 0L) continue block74;
                                                                                                                    if (var3_2 >= 0L) {
                                                                                                                        if (v13 != null) break block89;
                                                                                                                        if (v12 /* !! */  == 0) break block90;
                                                                                                                    }
                                                                                                                    ** GOTO lbl121
                                                                                                                }
                                                                                                                catch (MatchException v14) {
                                                                                                                    throw _6d_0.a(v14);
                                                                                                                }
                                                                                                                v15 = var30_24;
                                                                                                                if (var15_9 != null) break block90;
                                                                                                            }
                                                                                                            catch (MatchException v16) {
                                                                                                                throw _6d_0.a(v16);
                                                                                                            }
                                                                                                            if (v15 != _6d_0.c("g", (long)5052043594431377048L, (long)var3_2)) break block90;
                                                                                                        }
                                                                                                        catch (MatchException v17) {
                                                                                                            throw _6d_0.a(v17);
                                                                                                        }
                                                                                                        v15 = _6d_0.c("W", var21_15, (Object)var31_25, (Object)_6d_0.c("g", (long)5051050430704393372L, (long)var3_2), (long)5050208325920106858L, (long)var3_2);
                                                                                                    }
                                                                                                    catch (MatchException v18) {
                                                                                                        throw _6d_0.a(v18);
                                                                                                    }
                                                                                                }
                                                                                                v19 /* !! */  = _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, (long)5055962687343461612L, (long)var3_2), (long)var13_8, (long)5050694638899283062L, (long)var3_2);
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    v20 = var15_9;
lbl121:
                                                                                                    // 2 sources

                                                                                                    if (v20 != null) break block91;
                                                                                                    if (v19 /* !! */  == false) break block92;
                                                                                                }
                                                                                                catch (MatchException v21) {
                                                                                                    throw _6d_0.a(v21);
                                                                                                }
                                                                                                if (var30_24 != _6d_0.c("g", (long)5052107748839626206L, (long)var3_2)) break block92;
                                                                                            }
                                                                                            catch (MatchException v22) {
                                                                                                throw _6d_0.a(v22);
                                                                                            }
                                                                                            var32_26 = _6d_0.c("W", (Object)var31_25, (long)5053479953218946450L, (long)var3_2);
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            v19 /* !! */  = var32_26;
                                                                                                            if (var15_9 != null) break block91;
                                                                                                            v23 = new Object[1];
                                                                                                            v23[0] = var9_6;
                                                                                                            if (v19 /* !! */  < _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, (long)5051186764087489608L, (long)var3_2), (Object)v23, (long)5053532252280739028L, (long)var3_2)) break block92;
                                                                                                        }
                                                                                                        catch (MatchException v24) {
                                                                                                            throw _6d_0.a(v24);
                                                                                                        }
                                                                                                        v19 /* !! */  = var32_26;
                                                                                                        v25 = var15_9;
                                                                                                        if (var3_2 >= 0L) {
                                                                                                            if (v25 != null) break block91;
                                                                                                        }
                                                                                                        ** GOTO lbl172
                                                                                                    }
                                                                                                    catch (MatchException v26) {
                                                                                                        throw _6d_0.a(v26);
                                                                                                    }
                                                                                                    v27 = new Object[1];
                                                                                                    v27[0] = var9_6;
                                                                                                    if (v19 /* !! */  > _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, (long)5054725771463701377L, (long)var3_2), (Object)v27, (long)5053532252280739028L, (long)var3_2)) break block92;
                                                                                                }
                                                                                                catch (MatchException v28) {
                                                                                                    throw _6d_0.a(v28);
                                                                                                }
                                                                                                _6d_0.c("W", var21_15, (Object)var31_25, (Object)_6d_0.c("g", (long)5051097511191001228L, (long)var3_2), (long)5050208325920106858L, (long)var3_2);
                                                                                            }
                                                                                            catch (MatchException v29) {
                                                                                                throw _6d_0.a(v29);
                                                                                            }
                                                                                        }
                                                                                        v19 /* !! */  = _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, (long)5051854771481524172L, (long)var3_2), (long)var13_8, (long)5050694638899283062L, (long)var3_2);
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    v25 = var15_9;
lbl172:
                                                                                                    // 2 sources

                                                                                                    if (v25 != null) break block93;
                                                                                                    if (v19 /* !! */  == false) break block94;
                                                                                                }
                                                                                                catch (MatchException v30) {
                                                                                                    throw _6d_0.a(v30);
                                                                                                }
                                                                                                v31 = new Object[3];
                                                                                                v31[2] = var5_4;
                                                                                                v31[1] = (int)_6d_0.c("W", (Object)var31_25, (long)5053479953218946450L, (long)var3_2);
                                                                                                v31[0] = var29_23;
                                                                                                v19 /* !! */  = _6d_0.c("W", (Object)this, (Object)v31, (long)5053196245259730869L, (long)var3_2);
                                                                                                v32 = var15_9;
                                                                                                if (var3_2 > 0L) {
                                                                                                    if (v32 != null) break block93;
                                                                                                }
                                                                                                ** GOTO lbl207
                                                                                            }
                                                                                            catch (MatchException v33) {
                                                                                                throw _6d_0.a(v33);
                                                                                            }
                                                                                            if (v19 /* !! */  == false) break block94;
                                                                                        }
                                                                                        catch (MatchException v34) {
                                                                                            throw _6d_0.a(v34);
                                                                                        }
                                                                                        _6d_0.c("W", var21_15, (Object)var31_25, (Object)_6d_0.c("g", (long)5056988787484146355L, (long)var3_2), (long)5050208325920106858L, (long)var3_2);
                                                                                    }
                                                                                    catch (MatchException v35) {
                                                                                        throw _6d_0.a(v35);
                                                                                    }
                                                                                }
                                                                                v19 /* !! */  = _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, (long)5055145811451994957L, (long)var3_2), (long)var13_8, (long)5050694638899283062L, (long)var3_2);
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            v32 = var15_9;
lbl207:
                                                                                            // 2 sources

                                                                                            if (v32 != null) break block95;
                                                                                            if (v19 /* !! */  == false) break block96;
                                                                                        }
                                                                                        catch (MatchException v36) {
                                                                                            throw _6d_0.a(v36);
                                                                                        }
                                                                                        v37 = new Object[2];
                                                                                        v37[1] = var30_24;
                                                                                        v37[0] = var7_5;
                                                                                        v19 /* !! */  = _6d_0.c("W", (Object)this, (Object)v37, (long)5049735268735904050L, (long)var3_2);
                                                                                        v38 = var15_9;
                                                                                        if (var3_2 > 0L) {
                                                                                            if (v38 != null) break block95;
                                                                                        }
                                                                                        ** GOTO lbl239
                                                                                    }
                                                                                    catch (MatchException v39) {
                                                                                        throw _6d_0.a(v39);
                                                                                    }
                                                                                    if (v19 /* !! */  == false) break block96;
                                                                                }
                                                                                catch (MatchException v40) {
                                                                                    throw _6d_0.a(v40);
                                                                                }
                                                                                _6d_0.c("W", var21_15, (Object)var31_25, (Object)_6d_0.c("g", (long)5050125849928653806L, (long)var3_2), (long)5050208325920106858L, (long)var3_2);
                                                                            }
                                                                            catch (MatchException v41) {
                                                                                throw _6d_0.a(v41);
                                                                            }
                                                                        }
                                                                        v19 /* !! */  = _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, (long)5051428396227559417L, (long)var3_2), (long)var13_8, (long)5050694638899283062L, (long)var3_2);
                                                                    }
                                                                    try {
                                                                        try {
                                                                            v38 = var15_9;
lbl239:
                                                                            // 2 sources

                                                                            if (var3_2 > 0L) {
                                                                                if (v38 != null) break block97;
                                                                                if (v19 /* !! */  == false) continue;
                                                                            }
                                                                            ** GOTO lbl255
                                                                        }
                                                                        catch (MatchException v42) {
                                                                            throw _6d_0.a(v42);
                                                                        }
                                                                        v19 /* !! */  = (CallSite)(var30_24 instanceof class_2393);
                                                                    }
                                                                    catch (MatchException v43) {
                                                                        throw _6d_0.a(v43);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        if (var3_2 < 0L) break block98;
                                                                        v38 = var15_9;
lbl255:
                                                                        // 2 sources

                                                                        if (v38 != null) break block98;
                                                                        if (v19 /* !! */  == false) continue;
                                                                    }
                                                                    catch (MatchException v44) {
                                                                        throw _6d_0.a(v44);
                                                                    }
                                                                    v19 /* !! */  = _6d_0.c("W", (Object)((Integer)_6d_0.c("W", (Object)var29_23, (Object)_6d_0.c("g", (long)5051492554478891542L, (long)var3_2), (long)5055871119653075977L, (long)var3_2)), (long)5048924085942518856L, (long)var3_2);
                                                                }
                                                                catch (MatchException v45) {
                                                                    throw _6d_0.a(v45);
                                                                }
                                                            }
                                                            try {
                                                                if (v19 /* !! */  != _6d_0.a("a", (int)114, (long)(2719227080952998559L ^ var3_2))) continue;
                                                                ++var22_16;
                                                                continue;
                                                            }
                                                            catch (MatchException v46) {
                                                                throw _6d_0.a(v46);
                                                            }
                                                        }
                                                        ++var27_21;
                                                        v5 = var15_9;
                                                        if (var3_2 < 0L) continue block70;
                                                        if (v5 == null) continue block72;
                                                    }
                                                    continue block71;
                                                }
                                                break;
                                            }
                                            {
                                                ++var26_20;
                                                v5 = var15_9;
                                                if (var3_2 < 0L) continue block68;
                                                if (v5 == null) continue block70;
                                                break;
                                            }
                                        }
                                        break;
                                    }
                                }
                                if (var3_2 <= 0L) break block99;
                                ++var23_17;
                            }
                            v5 = var15_9;
                            if (v5 == null) continue block68;
                        }
                        break;
                    }
                    _6d_0.c("W", (Object)_6d_0.c("W", (Object)_6d_0.c("q", (Object)this, (long)5051383333890686304L, (long)var3_2), (long)5056430661892217611L, (long)var3_2), (Predicate<Map.Entry>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, 0(net.minecraft.class_1923 long java.util.Map java.util.Map$Entry ), (Ljava/util/Map$Entry;)Z)((class_1923)var20_14, (long)var11_7, var21_15), (long)5055573137871380069L, (long)var3_2);
                }
                v47 = this;
                v48 = 5051383333890686304L;
                v49 = var3_2;
                if (var3_2 < 0L) ** GOTO lbl304
                _6d_0.c("W", (Object)_6d_0.c("q", (Object)v47, (long)v48, (long)v49), var21_15, (long)5055245602700594094L, (long)var3_2);
            }
            try {
                block101: {
                    try {
                        try {
                            try {
                                try {
                                    v47 = this;
                                    v48 = 5051428396227559417L;
                                    v49 = var3_2;
lbl304:
                                    // 2 sources

                                    v50 /* !! */  = _6d_0.c("W", (Object)_6d_0.c("q", (Object)v47, (long)v48, (long)v49), (long)var13_8, (long)5050694638899283062L, (long)var3_2);
                                    if (var15_9 != null) break block100;
                                    if (v50 /* !! */  == false) break block101;
                                }
                                catch (MatchException v51) {
                                    throw _6d_0.a(v51);
                                }
                                v50 /* !! */  = (CallSite)var22_16;
                                if (var15_9 != null) break block100;
                            }
                            catch (MatchException v52) {
                                throw _6d_0.a(v52);
                            }
                            if (var3_2 < 0L) break block100;
                            if (v50 /* !! */  < _6d_0.a("a", (int)4019, (long)(1816524759745193304L ^ var3_2))) break block101;
                        }
                        catch (MatchException v53) {
                            throw _6d_0.a(v53);
                        }
                        _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, (long)5053748167832118306L, (long)var3_2), (Object)var20_14, (long)5056032411902493817L, (long)var3_2);
                        if (var15_9 == null) break block100;
                    }
                    catch (MatchException v54) {
                        throw _6d_0.a(v54);
                    }
                }
                v50 /* !! */  = _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, (long)5053748167832118306L, (long)var3_2), (Object)var20_14, (long)5052986254963715874L, (long)var3_2);
            }
            catch (MatchException v55) {
                throw _6d_0.a(v55);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void cfr_renamed_450(Object[] objectArray) {
        CallSite callSite;
        class_2338 class_23382;
        Object object;
        Object object2;
        CallSite callSite2;
        reference var27_12;
        CallSite callSite3;
        String string;
        long l2;
        long l3;
        long l4;
        _6c_0 c_0;
        long l5;
        block33: {
            CallSite callSite4;
            long l6;
            long l7;
            long l8;
            block31: {
                block32: {
                    _6d_0 d_0;
                    block30: {
                        CallSite callSite5;
                        block29: {
                            l5 = (Long)objectArray[0];
                            c_0 = (_6c_0)objectArray[1];
                            long l9 = l5 = b ^ l5;
                            l4 = l9 ^ 0x39DAF6EE8C13L;
                            l3 = l9 ^ 0x10DA2660B168L;
                            l2 = l9 ^ 0x6D253D943F2L;
                            l8 = l9 ^ 0x9D1624CE9E8L;
                            l7 = l9 ^ 0x6658FAADCC23L;
                            l6 = l9 ^ 0x102E11341F5CL;
                            string = _8h.cfr_renamed_4();
                            try {
                                try {
                                    try {
                                        callSite5 = _6d_0.c("q", (Object)this, 108773596283713956L, (long)l5);
                                        if (string != null) break block29;
                                        if (_6d_0.c("q", (Object)callSite5, 111200882379794244L, (long)l5) == null) return;
                                    }
                                    catch (MatchException matchException) {
                                        throw _6d_0.a(matchException);
                                    }
                                    d_0 = this;
                                    if (l5 <= 0L || string != null) break block30;
                                }
                                catch (MatchException matchException) {
                                    throw _6d_0.a(matchException);
                                }
                                callSite5 = _6d_0.c("q", (Object)d_0, 108773596283713956L, (long)l5);
                            }
                            catch (MatchException matchException) {
                                throw _6d_0.a(matchException);
                            }
                        }
                        try {
                            if (_6d_0.c("q", (Object)callSite5, 124499387462360764L, (long)l5) == null) {
                                return;
                            }
                        }
                        catch (MatchException matchException) {
                            throw _6d_0.a(matchException);
                        }
                        d_0 = this;
                    }
                    try {
                        try {
                            try {
                                callSite4 = _6d_0.c("W", (Object)_6d_0.c("q", (Object)d_0, 123094517736127183L, (long)l5), 110808787776390606L, (long)l5);
                                if (string != null) break block31;
                                if (callSite4 == false) break block32;
                            }
                            catch (MatchException matchException) {
                                throw _6d_0.a(matchException);
                            }
                            callSite4 = _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, 111968225255646093L, (long)l5), 111623201508222997L, (long)l5);
                            if (string != null) break block31;
                        }
                        catch (MatchException matchException) {
                            throw _6d_0.a(matchException);
                        }
                        if (callSite4 == false) break block32;
                        return;
                    }
                    catch (MatchException matchException) {
                        throw _6d_0.a(matchException);
                    }
                }
                callSite4 = _6d_0.c("W", (Object)_6d_0.c("q", (Object)_6d_0.c("q", (Object)this, 108773596283713956L, (long)l5), 124499387462360764L, (long)l5), 125672198361727733L, (long)l5) >> 4;
            }
            callSite3 = callSite4;
            var27_12 = _6d_0.c("W", (Object)_6d_0.c("q", (Object)_6d_0.c("q", (Object)this, 108773596283713956L, (long)l5), 124499387462360764L, (long)l5), 109318821195929069L, (long)l5) >> 4;
            callSite2 = _6d_0.c("W", (Object)_6d_0.c("q", (Object)_6d_0.c("q", (Object)this, 108773596283713956L, (long)l5), 110045976825496380L, (long)l5), 111280042050310438L, (long)l5);
            object2 = _6d_0.c("W", (Object)_6d_0.c("W", (Object)_6d_0.c("q", (Object)this, 123094517736127183L, (long)l5), 109004803961445540L, (long)l5), 126087956202092217L, (long)l5);
            while (_6d_0.c("W", (Object)object2, 108624372247387064L, (long)l5) != false) {
                block36: {
                    CallSite callSite6;
                    CallSite callSite7;
                    double d;
                    double d2;
                    double d3;
                    Object object3;
                    Object object4;
                    Object object5;
                    _4k k;
                    block35: {
                        CallSite callSite8;
                        CallSite callSite9;
                        block34: {
                            object = (Map.Entry)((Object)_6d_0.c("W", (Object)object2, 112453301704157926L, (long)l5));
                            class_23382 = (class_2338)_6d_0.c("W", (Object)object, 108860541546006445L, (long)l5);
                            CallSite callSite10 = _6d_0.c("W", (Object)class_23382, 108205506357467051L, (long)l5) >> 4;
                            reference var33_23 = _6d_0.c("W", (Object)class_23382, 112106747293081111L, (long)l5) >> 4;
                            try {
                                try {
                                    CallSite callSite9 = callSite10;
                                    callSite9 = callSite3;
                                    if (l5 > 0L) {
                                        callSite = _6d_0.c("E", (int)(callSite - callSite9), 111716483190671652L, (long)l5);
                                        if (l5 <= 0L || string != null) break block33;
                                        callSite9 = callSite2;
                                    }
                                    if (string != null) break block34;
                                }
                                catch (MatchException matchException) {
                                    throw _6d_0.a(matchException);
                                }
                                if (callSite > callSite9) continue;
                            }
                            catch (MatchException matchException) {
                                throw _6d_0.a(matchException);
                            }
                            CallSite callSite9 = _6d_0.c("E", (int)(var33_23 - var27_12), 111716483190671652L, (long)l5);
                            callSite9 = callSite2;
                        }
                        if (callSite8 > callSite9) continue;
                        _3m m = (_3m)((Object)_6d_0.c("W", (Object)object, 109243057771039418L, (long)l5));
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l4;
                        Object[] objectArray3 = new Object[3];
                        objectArray3[2] = (int)_6d_0.c("W", (Object)_6d_0.c("q", (Object)this, 109828078511621781L, (long)l5), (Object)objectArray2, 112184684111729531L, (long)l5);
                        objectArray3[1] = m;
                        objectArray3[0] = l8;
                        CallSite callSite11 = _6d_0.c("W", (Object)this, (Object)objectArray3, 111781894551726605L, (long)l5);
                        try {
                            try {
                                if (l5 >= 0L) {
                                    k = c_0.cfr_renamed_7;
                                    Object object3 = (float)_6d_0.c("W", (Object)class_23382, 108205506357467051L, (long)l5);
                                    object3 = (float)_6d_0.c("W", (Object)class_23382, 112271755094524477L, (long)l5);
                                    object3 = (float)_6d_0.c("W", (Object)class_23382, 112106747293081111L, (long)l5);
                                    double d = (float)_6d_0.c("W", (Object)class_23382, 108205506357467051L, (long)l5) + 1.0f;
                                    d = (float)_6d_0.c("W", (Object)class_23382, 112271755094524477L, (long)l5) + 1.0f;
                                    d = (float)_6d_0.c("W", (Object)class_23382, 112106747293081111L, (long)l5) + 1.0f;
                                    CallSite callSite6 = callSite11;
                                    callSite6 = callSite11;
                                    if (string != null) break block35;
                                    Object[] objectArray4 = new Object[11];
                                    objectArray4[10] = l3;
                                    objectArray4[9] = 0;
                                    objectArray4[8] = _6d_0.c("g", 123574223183016812L, (long)l5);
                                    objectArray4[7] = callSite6;
                                    objectArray4[6] = callSite7;
                                    objectArray4[5] = d;
                                    objectArray4[4] = d2;
                                    objectArray4[3] = d3;
                                    objectArray4[2] = object3;
                                    objectArray4[1] = object4;
                                    objectArray4[0] = object5;
                                    _6d_0.c("W", (Object)k, (Object)objectArray4, 110599369216830804L, (long)l5);
                                }
                                if (_6d_0.c("W", (Object)_6d_0.c("q", (Object)this, 122200229773785664L, (long)l5), (long)l7, 124099320295949273L, (long)l5) == false) break block36;
                            }
                            catch (MatchException matchException) {
                                throw _6d_0.a(matchException);
                            }
                            k = c_0.cfr_renamed_7;
                            Object object3 = _6d_0.c("q", (Object)_6d_0.c("g", 121710646360765276L, (long)l5), 110113107349230078L, (long)l5);
                            object3 = _6d_0.c("q", (Object)_6d_0.c("g", 121710646360765276L, (long)l5), 111569645977319181L, (long)l5);
                            object3 = _6d_0.c("q", (Object)_6d_0.c("g", 121710646360765276L, (long)l5), 108289227075156161L, (long)l5);
                            double d = (float)((double)_6d_0.c("W", (Object)class_23382, 108205506357467051L, (long)l5) + 0.5);
                            d = (float)((double)_6d_0.c("W", (Object)class_23382, 112271755094524477L, (long)l5) + 0.5);
                            d = (float)((double)_6d_0.c("W", (Object)class_23382, 112106747293081111L, (long)l5) + 0.5);
                            Object[] objectArray5 = new Object[3];
                            objectArray5[2] = (int)_6d_0.a("a", 30430, (long)(0x17C2C7A6AB0C5B88L ^ l5));
                            objectArray5[1] = m;
                            objectArray5[0] = l8;
                            callSite7 = _6d_0.c("W", (Object)this, (Object)objectArray5, 111781894551726605L, (long)l5);
                            Object[] objectArray6 = new Object[3];
                            objectArray6[2] = (int)_6d_0.a("a", 26977, (long)(0x7CA296979653C422L ^ l5));
                            objectArray6[1] = m;
                            objectArray6[0] = l8;
                            callSite6 = _6d_0.c("W", (Object)this, (Object)objectArray6, 111781894551726605L, (long)l5);
                        }
                        catch (MatchException matchException) {
                            throw _6d_0.a(matchException);
                        }
                    }
                    CallSite callSite12 = callSite6;
                    CallSite callSite13 = callSite7;
                    double d4 = d;
                    double d5 = d2;
                    double d6 = d3;
                    Object[] objectArray7 = new Object[9];
                    objectArray7[8] = callSite12;
                    objectArray7[7] = callSite13;
                    objectArray7[6] = d4;
                    objectArray7[5] = d5;
                    objectArray7[4] = d6;
                    objectArray7[3] = l6;
                    objectArray7[2] = object3;
                    objectArray7[1] = object4;
                    objectArray7[0] = object5;
                    _6d_0.c("W", (Object)k, (Object)objectArray7, 124974021796203060L, (long)l5);
                }
                if (string == null) continue;
            }
            callSite = _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, 123014408600467542L, (long)l5), (long)l7, 124099320295949273L, (long)l5);
        }
        if (callSite == false) return;
        Object[] objectArray8 = new Object[1];
        objectArray8[0] = l4;
        object2 = new _8B(0, (int)_6d_0.a("a", 26977, (long)(0x7CA296979653C422L ^ l5)), l2, (int)_6d_0.a("a", 26977, (long)(0x7CA296979653C422L ^ l5)), (int)_6d_0.c("W", (Object)_6d_0.c("q", (Object)this, 109828078511621781L, (long)l5), (Object)objectArray8, 112184684111729531L, (long)l5));
        object = _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, 111968225255646093L, (long)l5), 126087956202092217L, (long)l5);
        while (_6d_0.c("W", (Object)object, 108624372247387064L, (long)l5) != false) {
            CallSite callSite14;
            CallSite callSite15;
            block37: {
                class_23382 = (class_1923)_6d_0.c("W", (Object)object, 112453301704157926L, (long)l5);
                try {
                    CallSite callSite14 = _6d_0.c("E", (int)(_6d_0.c("q", (Object)class_23382, 124841796273343041L, (long)l5) - callSite3), 111716483190671652L, (long)l5);
                    callSite14 = callSite2;
                    if (string != null) break block37;
                    if (callSite15 > callSite14) continue;
                }
                catch (MatchException matchException) {
                    throw _6d_0.a(matchException);
                }
                CallSite callSite14 = _6d_0.c("E", (int)(_6d_0.c("q", (Object)class_23382, 109369195787652517L, (long)l5) - var27_12), 111716483190671652L, (long)l5);
                callSite14 = callSite2;
            }
            if (callSite15 > callSite14) continue;
            Object[] objectArray9 = new Object[11];
            objectArray9[10] = l3;
            objectArray9[9] = 0;
            objectArray9[8] = _6d_0.c("g", 123574223183016812L, (long)l5);
            objectArray9[7] = object2;
            objectArray9[6] = object2;
            objectArray9[5] = (double)(_6d_0.c("W", (Object)class_23382, 122099663787981543L, (long)l5) + _6d_0.a("a", 31072, (long)(0x174AD2990066D431L ^ l5)));
            objectArray9[4] = 63.0;
            objectArray9[3] = (double)(_6d_0.c("W", (Object)class_23382, 111490299280929545L, (long)l5) + _6d_0.a("a", 22857, (long)(0x796339972F27416L ^ l5)));
            objectArray9[2] = (double)_6d_0.c("W", (Object)class_23382, 122099663787981543L, (long)l5);
            objectArray9[1] = 63.0;
            objectArray9[0] = (double)_6d_0.c("W", (Object)class_23382, 111490299280929545L, (long)l5);
            _6d_0.c("W", (Object)c_0.cfr_renamed_7, (Object)objectArray9, 110599369216830804L, (long)l5);
            if (string == null) continue;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void cfr_renamed_451(Object[] var1_1) {
        block46: {
            block47: {
                block45: {
                    var4_2 = (_6c_0)var1_1[0];
                    var2_3 = (Long)var1_1[1];
                    v0 = var2_3 = _6d_0.b ^ var2_3;
                    var5_4 = v0 ^ 17254171723694L;
                    var7_5 = v0 ^ 48854603948984L;
                    var9_6 = v0 ^ 20323410364439L;
                    var11_7 = v0 ^ 65400426067308L;
                    var13_8 = v0 ^ 85735699154983L;
                    var15_9 = _8h.cfr_renamed_4();
                    try {
                        try {
                            v1 = _6d_0.c("q", (Object)this, (long)5009791293504093600L, (long)var2_3);
                            if (var15_9 != null) break block45;
                            if (_6d_0.c("q", (Object)v1, (long)5012290039636058944L, (long)var2_3) != null) {
                            }
                            ** GOTO lbl33
                        }
                        catch (MatchException v2) {
                            throw _6d_0.a(v2);
                        }
                        v1 = _6d_0.c("q", (Object)this, (long)5009791293504093600L, (long)var2_3);
                    }
                    catch (MatchException v3) {
                        throw _6d_0.a(v3);
                    }
                }
                try {
                    try {
                        if (var15_9 != null) break block46;
                        if (_6d_0.c("q", (Object)v1, (long)5025564364052880056L, (long)var2_3) != null) break block47;
                    }
                    catch (MatchException v4) {
                        throw _6d_0.a(v4);
                    }
lbl33:
                    // 2 sources

                    return;
                }
                catch (MatchException v5) {
                    throw _6d_0.a(v5);
                }
            }
            _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, (long)5024651887249999452L, (long)var2_3), (long)5012432176000390672L, (long)var2_3);
            v1 = _6d_0.c("q", (Object)this, (long)5009791293504093600L, (long)var2_3);
        }
        var16_10 = _6d_0.c("W", (Object)_6d_0.c("W", (Object)_6d_0.c("q", (Object)v1, (long)5012290039636058944L, (long)var2_3), (long)5008958364684195461L, (long)var2_3), (long)5022235079487155502L, (long)var2_3);
        while (_6d_0.c("W", (Object)var16_10, (long)5009624477752369084L, (long)var2_3) != false) {
            block57: {
                block56: {
                    block54: {
                        block55: {
                            block52: {
                                block53: {
                                    block50: {
                                        block51: {
                                            block48: {
                                                block49: {
                                                    var17_11 = (class_1297)_6d_0.c("W", (Object)var16_10, (long)5011283794950106850L, (long)var2_3);
                                                    var18_12 = null;
                                                    try {
                                                        try {
                                                            try {
                                                                v6 /* !! */  = _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, (long)5009563735682769838L, (long)var2_3), (long)var13_8, (long)5025111244551669725L, (long)var2_3);
                                                                if (var15_9 != null) break block48;
                                                                if (v6 /* !! */  == false) break block49;
                                                            }
                                                            catch (MatchException v7) {
                                                                throw _6d_0.a(v7);
                                                            }
                                                            v6 /* !! */  = (CallSite)(var17_11 instanceof class_3989);
                                                            v8 = var15_9;
                                                            if (var2_3 > 0L) {
                                                                if (v8 != null) break block48;
                                                            }
                                                            ** GOTO lbl74
                                                        }
                                                        catch (MatchException v9) {
                                                            throw _6d_0.a(v9);
                                                        }
                                                        if (v6 /* !! */  == false) break block49;
                                                    }
                                                    catch (MatchException v10) {
                                                        throw _6d_0.a(v10);
                                                    }
                                                    var18_12 = _6d_0.c("g", (long)5010215423456332005L, (long)var2_3);
                                                    break block57;
                                                }
                                                v6 /* !! */  = _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, (long)5011928163867833951L, (long)var2_3), (long)var13_8, (long)5025111244551669725L, (long)var2_3);
                                            }
                                            try {
                                                try {
                                                    try {
                                                        v8 = var15_9;
lbl74:
                                                        // 2 sources

                                                        if (v8 != null) break block50;
                                                        if (v6 /* !! */  == false) break block51;
                                                    }
                                                    catch (MatchException v11) {
                                                        throw _6d_0.a(v11);
                                                    }
                                                    v6 /* !! */  = (CallSite)(var17_11 instanceof class_1646);
                                                    v12 = var15_9;
                                                    if (var2_3 >= 0L) {
                                                        if (v12 != null) break block50;
                                                    }
                                                    ** GOTO lbl100
                                                }
                                                catch (MatchException v13) {
                                                    throw _6d_0.a(v13);
                                                }
                                                if (v6 /* !! */  == false) break block51;
                                            }
                                            catch (MatchException v14) {
                                                throw _6d_0.a(v14);
                                            }
                                            var18_12 = _6d_0.c("g", (long)5010130084580530509L, (long)var2_3);
                                            break block57;
                                        }
                                        v6 /* !! */  = _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, (long)5011928163867833951L, (long)var2_3), (long)var13_8, (long)5025111244551669725L, (long)var2_3);
                                    }
                                    try {
                                        try {
                                            try {
                                                v12 = var15_9;
lbl100:
                                                // 2 sources

                                                if (v12 != null) break block52;
                                                if (v6 /* !! */  == false) break block53;
                                            }
                                            catch (MatchException v15) {
                                                throw _6d_0.a(v15);
                                            }
                                            v6 /* !! */  = (CallSite)(var17_11 instanceof class_1641);
                                            v16 = var15_9;
                                            if (var2_3 > 0L) {
                                                if (v16 != null) break block52;
                                            }
                                            ** GOTO lbl126
                                        }
                                        catch (MatchException v17) {
                                            throw _6d_0.a(v17);
                                        }
                                        if (v6 /* !! */  == false) break block53;
                                    }
                                    catch (MatchException v18) {
                                        throw _6d_0.a(v18);
                                    }
                                    var18_12 = _6d_0.c("g", (long)5025497412487645000L, (long)var2_3);
                                    break block57;
                                }
                                v6 /* !! */  = _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, (long)5025447393351396798L, (long)var2_3), (long)var13_8, (long)5025111244551669725L, (long)var2_3);
                            }
                            try {
                                try {
                                    try {
                                        v16 = var15_9;
lbl126:
                                        // 2 sources

                                        if (v16 != null) break block54;
                                        if (v6 /* !! */  == false) break block55;
                                    }
                                    catch (MatchException v19) {
                                        throw _6d_0.a(v19);
                                    }
                                    v6 /* !! */  = (CallSite)(var17_11 instanceof class_1501);
                                    v20 = var15_9;
                                    if (var2_3 >= 0L) {
                                        if (v20 != null) break block54;
                                    }
                                    ** GOTO lbl151
                                }
                                catch (MatchException v21) {
                                    throw _6d_0.a(v21);
                                }
                                if (v6 /* !! */  == false) break block55;
                            }
                            catch (MatchException v22) {
                                throw _6d_0.a(v22);
                            }
                            var18_12 = _6d_0.c("g", (long)5009340842239536636L, (long)var2_3);
                            break block57;
                        }
                        v6 /* !! */  = _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, (long)5012051647026443968L, (long)var2_3), (long)var13_8, (long)5025111244551669725L, (long)var2_3);
                    }
                    try {
                        try {
                            v20 = var15_9;
lbl151:
                            // 2 sources

                            if (v20 != null) break block56;
                            if (v6 /* !! */  == false) break block57;
                        }
                        catch (MatchException v23) {
                            throw _6d_0.a(v23);
                        }
                        v6 /* !! */  = (CallSite)(var17_11 instanceof class_1604);
                    }
                    catch (MatchException v24) {
                        throw _6d_0.a(v24);
                    }
                }
                if (v6 /* !! */  != false) {
                    var18_12 = _6d_0.c("g", (long)5025193027811834144L, (long)var2_3);
                }
            }
            if (var18_12 != null) {
                _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, (long)5024651887249999452L, (long)var2_3), (Object)_6d_0.c("E", (int)_6d_0.c("W", (Object)var17_11, (long)5021631640713842802L, (long)var2_3), (long)5008271240395242832L, (long)var2_3), (long)5008502783726471122L, (long)var2_3);
                var19_13 = _6d_0.c("W", (Object)var17_11, (long)5022902385899124084L, (long)var2_3);
                v25 = new Object[1];
                v25[0] = var9_6;
                v26 = new Object[3];
                v26[2] = var5_4;
                v26[1] = (int)_6d_0.c("W", (Object)_6d_0.c("q", (Object)this, (long)5008596174715077265L, (long)var2_3), (Object)v25, (long)5010998684959201151L, (long)var2_3);
                v26[0] = var18_12;
                var20_14 = _6d_0.c("W", (Object)this, (Object)v26, (long)5023003341215012865L, (long)var2_3);
                v27 = new Object[11];
                v27[10] = var11_7;
                v27[9] = 0;
                v27[8] = _6d_0.c("g", (long)5022408281830635368L, (long)var2_3);
                v27[7] = var20_14;
                v27[6] = var20_14;
                v27[5] = (double)_6d_0.c("q", (Object)var19_13, (long)5022003001762158074L, (long)var2_3);
                v27[4] = (double)_6d_0.c("q", (Object)var19_13, (long)5010697385187108437L, (long)var2_3);
                v27[3] = (double)_6d_0.c("q", (Object)var19_13, (long)5009104481208774932L, (long)var2_3);
                v27[2] = (double)_6d_0.c("q", (Object)var19_13, (long)5025860827241258023L, (long)var2_3);
                v27[1] = (double)_6d_0.c("q", (Object)var19_13, (long)5010661649809003751L, (long)var2_3);
                v27[0] = (double)_6d_0.c("q", (Object)var19_13, (long)5024502783304352391L, (long)var2_3);
                _6d_0.c("W", (Object)var4_2.cfr_renamed_7, (Object)v27, (long)5011598374647130448L, (long)var2_3);
                if (_6d_0.c("W", (Object)_6d_0.c("q", (Object)this, (long)5023219851417255492L, (long)var2_3), (long)var13_8, (long)5025111244551669725L, (long)var2_3) != false) {
                    var21_15 = _6d_0.c("W", (Object)_6d_0.c("W", (Object)var17_11, (long)5008767672325728740L, (long)var2_3), (double)0.0, (double)((double)(_6d_0.c("W", (Object)var17_11, (long)5009898130751173759L, (long)var2_3) / 2.0f)), (double)0.0, (long)5024585572573761015L, (long)var2_3);
                    v28 = new Object[3];
                    v28[2] = var5_4;
                    v28[1] = (int)_6d_0.a("a", (int)26977, (long)(8980948648856289318L ^ var2_3));
                    v28[0] = var18_12;
                    v29 = new Object[8];
                    v29[7] = _6d_0.c("W", (Object)this, (Object)v28, (long)5023003341215012865L, (long)var2_3);
                    v29[6] = var7_5;
                    v29[5] = (double)_6d_0.c("q", (Object)var21_15, (long)5009291256222301381L, (long)var2_3);
                    v29[4] = (double)_6d_0.c("q", (Object)var21_15, (long)5010337741980365577L, (long)var2_3);
                    v29[3] = (double)_6d_0.c("q", (Object)var21_15, (long)5008874598362715642L, (long)var2_3);
                    v29[2] = (double)_6d_0.c("q", (Object)_6d_0.c("g", (long)5022723671135762264L, (long)var2_3), (long)5009291256222301381L, (long)var2_3);
                    v29[1] = (double)_6d_0.c("q", (Object)_6d_0.c("g", (long)5022723671135762264L, (long)var2_3), (long)5010337741980365577L, (long)var2_3);
                    v29[0] = (double)_6d_0.c("q", (Object)_6d_0.c("g", (long)5022723671135762264L, (long)var2_3), (long)5008874598362715642L, (long)var2_3);
                    _6d_0.c("W", (Object)var4_2.cfr_renamed_7, (Object)v29, (long)5023608917338864922L, (long)var2_3);
                }
            }
            if (var15_9 == null) continue;
        }
    }

    @_3i_0
    public void cfr_renamed_354(_6c_0 c_0) {
        long l2;
        long l3 = l2 = b ^ 0x2047570935B6L;
        long l4 = l3 ^ 0x1DC3D4E1341AL;
        long l5 = l3 ^ 0x3662CBA8701EL;
        Object[] objectArray = new Object[2];
        objectArray[1] = c_0;
        objectArray[0] = l4;
        _6d_0.c("W", (Object)this, (Object)objectArray, -3959825719242174254L, (long)l2);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l5;
        objectArray2[0] = c_0;
        _6d_0.c("W", (Object)this, (Object)objectArray2, -3946949962519930515L, (long)l2);
    }

    public _6d_0(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x4AC03C396DECL;
        long l5 = l3 ^ 0x5AA00EF0147FL;
        long l6 = l3 ^ 0x60BDD5E814BDL;
        long l7 = l6 >>> 8;
        int n = (int)(l6 << 56 >>> 56);
        long l8 = l3 ^ 0x3A7A719E5F5AL;
        long l9 = l3 ^ 0x1CF8AB7AE585L;
        long l10 = l3 ^ 0x338385E0AF7L;
        super((int)_6d_0.a("a", 19283, (long)(0x1538D274E7AAAB09L ^ l2)), -1, (_4r)((Object)_6d_0.c("g", 5527613745295157347L, (long)l2)), l9);
        this.cfr_renamed_1 = new _9r((int)_6d_0.a("a", 19354, (long)(0x3D044C6621B12BD4L ^ l2)), true, l4);
        this.cfr_renamed_267 = new _9r((int)_6d_0.a("a", 1088, (long)(0x29AFF9004E68E417L ^ l2)), true, l4);
        this.cfr_renamed_447 = new _9r((int)_6d_0.a("a", 9328, (long)(0x38F7DD71A1924425L ^ l2)), true, l4);
        this.cfr_renamed_6 = new _9r((int)_6d_0.a("a", 10106, (long)(0x14EB83794747C737L ^ l2)), true, l4);
        this.cfr_renamed_8 = new _9r((int)_6d_0.a("a", 718, (long)(0x3988986A9823628BL ^ l2)), true, l4);
        this.cfr_renamed_7 = new _9r((int)_6d_0.a("a", 10774, (long)(0x67659DE9F81FCA5DL ^ l2)), true, l4);
        this.cfr_renamed_3 = new _9r((int)_6d_0.a("a", 20511, (long)(0x56DDF5063682B05DL ^ l2)), true, l4);
        this.cfr_renamed_212 = new _9r((int)_6d_0.a("a", 4190, (long)(0x2034BDAA7E66F012L ^ l2)), true, l4);
        this.cfr_renamed_0 = new _9r((int)_6d_0.a("a", 12546, (long)(0x266152727C40515CL ^ l2)), true, l4);
        this.cfr_renamed_9 = new _92((int)_6d_0.a("a", 30017, (long)(0x34D1826927731517L ^ l2)), 1.0, l5, 255.0, 100.0, 1.0);
        this.cfr_renamed_149 = new _9r((int)_6d_0.a("a", 31892, (long)(0x1FF2BF5BE8041CDDL ^ l2)), false, l4);
        this.cfr_renamed_448 = new _92((int)_6d_0.a("a", 19030, (long)(0x5F27262E8F2A2A09L ^ l2)), -64.0, l5, 128.0, 16.0, 1.0);
        this.cfr_renamed_4 = new _92((int)_6d_0.a("a", 31072, (long)(0x174AFD4D00479933L ^ l2)), -64.0, l5, 320.0, 128.0, 1.0);
        this.cfr_renamed_2 = new ConcurrentHashMap();
        this.cfr_renamed_394 = _6d_0.c("E", 5526963011715680135L, (long)l2);
        this.cfr_renamed_269 = _6d_0.c("E", 5526963011715680135L, (long)l2);
        this.cfr_renamed_449 = _6d_0.c("E", 2, 5527598628948821666L, (long)l2);
        Object[] objectArray = new Object[3];
        objectArray[2] = () -> this.cfr_renamed_6(l8);
        objectArray[1] = (int)((byte)n);
        objectArray[0] = l7;
        _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, 5527055709258383077L, (long)l2), (Object)objectArray, 5513292761267344249L, (long)l2);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = () -> this.cfr_renamed_6(l8);
        objectArray2[1] = (int)((byte)n);
        objectArray2[0] = l7;
        _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, 5514831698190022956L, (long)l2), (Object)objectArray2, 5513292761267344249L, (long)l2);
        _95[] nullArray = new _95[_6d_0.a("a", 8609, (long)(0x388F44E5CD15C1F1L ^ l2))];
        nullArray[0] = _6d_0.c("q", (Object)this, 5513408527217257128L, (long)l2);
        nullArray[1] = _6d_0.c("q", (Object)this, 5515773100693012313L, (long)l2);
        nullArray[2] = _6d_0.c("q", (Object)this, 5529291909034894520L, (long)l2);
        nullArray[3] = _6d_0.c("q", (Object)this, 5514770023278985158L, (long)l2);
        nullArray[4] = _6d_0.c("q", (Object)this, 5514379833478057537L, (long)l2);
        nullArray[5] = _6d_0.c("q", (Object)this, 5527794009179798881L, (long)l2);
        nullArray[_6d_0.a("a", 10459, (long)(0x9BA0D2230C8C893L ^ l2))] = _6d_0.c("q", (Object)this, 5515251678516046304L, (long)l2);
        nullArray[_6d_0.a("a", 29833, (long)(0x21600D266C7B94C6L ^ l2))] = _6d_0.c("q", (Object)this, 5527930120083600724L, (long)l2);
        nullArray[_6d_0.a("a", 29488, (long)(0xA149ED07AC69373L ^ l2))] = _6d_0.c("q", (Object)this, 5526830281552122577L, (long)l2);
        nullArray[_6d_0.a("a", 15748, (long)(0x66CFBEA8382EDDDDL ^ l2))] = _6d_0.c("q", (Object)this, 5513566865880632215L, (long)l2);
        nullArray[_6d_0.a("a", 28390, (long)(0x733BBDBEB30E8EACL ^ l2))] = _6d_0.c("q", (Object)this, 5525929533850679106L, (long)l2);
        nullArray[_6d_0.a("a", 24034, (long)(0x6EE1AC4DA91A3DB0L ^ l2))] = _6d_0.c("q", (Object)this, 5527055709258383077L, (long)l2);
        nullArray[_6d_0.a("a", 13129, (long)(0x47D848C426F0D315L ^ l2))] = _6d_0.c("q", (Object)this, 5514831698190022956L, (long)l2);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = nullArray;
        objectArray3[0] = l10;
        _6d_0.c("W", (Object)this, (Object)objectArray3, 5515615392547737492L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                a.init(_6d_0.class, 67);
                _6d_0.b = l.a(-5513045638124847044L, -4954805156566617062L, MethodHandles.lookup().lookupClass()).a(166010983557963L);
                _6d_0.j = new Object[195];
                _6d_0.k = new String[195];
                _6d_0.b();
                _6d_0.f = new HashMap<K, V>(13);
                var0 = _6d_0.b ^ 19084341002507L;
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
                var8_3 = new long[31];
                var5_4 = 0;
                var6_5 = "f\u009a\u00d7U!\u00fb=r\u000e\u00f7\u00e6\u00c3;\u00e5oj\u00fa\u00a6\u00a0\u001c\u00dce\u00d2\u00a38\u00e0|\u00914$N\u00c7\u00f3F\u00aa\u00e5\u00c7^\u00a07i\u00e4\u00cf\u00e8\u00a4\u00108\u00aaX\u00b3\u0087\u00027~\u00fa\u00bdyISn\u00ef\u00b4\u00ed]\u00ac\u00e3?\r1\u00a3e\u0083G\u0091\u00aa\u00ecr\u0098)\u00df\u00cb\u001c#6\u0016#\u0004|\u00cb\u000e\u00a3\u0084w`(D\u00a3\u00a1\u00c0%`\u00de)\u00d0BZ\u0007[)\u000fwj@~\u00fd\u00dd\u00feQU\u001at8/'\u00efj\u00c4`I'@q\\\u0082\u009ajhq\u0090\u00f0\u00d3\u00f1\u00e4\u0001Ml+^\f\u00bd\u001f\u008a\u008e\u00ef\u00cf\u00ef\u0082CqY\u0005\u00c9\u0093fQ\u00c7\\\u0080\u0091\u0088CK\u00dc\u000b%W\u008d\u0011\u0006\\n\u0080\u00dc\u009e\u00b5l\u00a4R\u00dc%\u00e4\u0088p\u00d9\u00c5\u0096v\u008c~J\u00cbW\u008cWc\u00bd\u0080z\f\u001b)\u00b3\u00b1\f\u0007it*\u00f1A\u0005\u00d0\u0015@kg\u00a8\u00f9\u00a3sT\u00a0";
                var7_6 = "f\u009a\u00d7U!\u00fb=r\u000e\u00f7\u00e6\u00c3;\u00e5oj\u00fa\u00a6\u00a0\u001c\u00dce\u00d2\u00a38\u00e0|\u00914$N\u00c7\u00f3F\u00aa\u00e5\u00c7^\u00a07i\u00e4\u00cf\u00e8\u00a4\u00108\u00aaX\u00b3\u0087\u00027~\u00fa\u00bdyISn\u00ef\u00b4\u00ed]\u00ac\u00e3?\r1\u00a3e\u0083G\u0091\u00aa\u00ecr\u0098)\u00df\u00cb\u001c#6\u0016#\u0004|\u00cb\u000e\u00a3\u0084w`(D\u00a3\u00a1\u00c0%`\u00de)\u00d0BZ\u0007[)\u000fwj@~\u00fd\u00dd\u00feQU\u001at8/'\u00efj\u00c4`I'@q\\\u0082\u009ajhq\u0090\u00f0\u00d3\u00f1\u00e4\u0001Ml+^\f\u00bd\u001f\u008a\u008e\u00ef\u00cf\u00ef\u0082CqY\u0005\u00c9\u0093fQ\u00c7\\\u0080\u0091\u0088CK\u00dc\u000b%W\u008d\u0011\u0006\\n\u0080\u00dc\u009e\u00b5l\u00a4R\u00dc%\u00e4\u0088p\u00d9\u00c5\u0096v\u008c~J\u00cbW\u008cWc\u00bd\u0080z\f\u001b)\u00b3\u00b1\f\u0007it*\u00f1A\u0005\u00d0\u0015@kg\u00a8\u00f9\u00a3sT\u00a0".length();
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
                    var6_5 = "E\u00a7\u0099\u009aXj\u00cd\u00d5\u001e\u00f2 t\u0011\u00c4va";
                    var7_6 = "E\u00a7\u0099\u009aXj\u00cd\u00d5\u001e\u00f2 t\u0011\u00c4va".length();
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
        _6d_0.d = var8_3;
        _6d_0.e = new Integer[31];
        _6d_0.cfr_renamed_441 = (int)_6d_0.a("a", (int)30582, (long)(var0 ^ 3061460534441469459L));
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
            case 0 -> 54;
            case 1 -> 4;
            case 2 -> 44;
            case 3 -> 15;
            case 4 -> 37;
            case 5 -> 8;
            case 6 -> 2;
            case 7 -> 46;
            case 8 -> 59;
            case 9 -> 55;
            case 10 -> 57;
            case 11 -> 41;
            case 12 -> 45;
            case 13 -> 33;
            case 14 -> 3;
            case 15 -> 48;
            case 16 -> 49;
            case 17 -> 31;
            case 18 -> 23;
            case 19 -> 18;
            case 20 -> 35;
            case 21 -> 34;
            case 22 -> 52;
            case 23 -> 5;
            case 24 -> 17;
            case 25 -> 11;
            case 26 -> 32;
            case 27 -> 28;
            case 28 -> 43;
            case 29 -> 50;
            case 30 -> 38;
            case 31 -> 53;
            case 32 -> 20;
            case 33 -> 16;
            case 34 -> 60;
            case 35 -> 19;
            case 36 -> 36;
            case 37 -> 58;
            case 38 -> 9;
            case 39 -> 1;
            case 40 -> 24;
            case 41 -> 42;
            case 42 -> 0;
            case 43 -> 6;
            case 44 -> 27;
            case 45 -> 30;
            case 46 -> 62;
            case 47 -> 40;
            case 48 -> 63;
            case 49 -> 21;
            case 50 -> 7;
            case 51 -> 29;
            case 52 -> 14;
            case 53 -> 61;
            case 54 -> 10;
            case 55 -> 22;
            case 56 -> 47;
            case 57 -> 26;
            case 58 -> 56;
            case 59 -> 39;
            case 60 -> 12;
            case 61 -> 25;
            case 62 -> 51;
            default -> 13;
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
        _6d_0.k[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = ",\u0017jz\nj1\u0002h;\u000f6~\u0016";
        objectArray[1] = "\u000bsZ\u0019>\u001d~SQ\u0016/R\u001f]Z\u001d+\bk";
        objectArray[2] = Void.TYPE;
        _6d_0.k[2] = "java/lang/Void";
        objectArray[3] = "O*\u0006\t(\u0000:\n\r\u00069O[\u0004\u0006\r=\u0015/";
        objectArray[4] = "-~6\t+ 3v,FV03";
        objectArray[5] = "\f\u0001I\u0000L'\u0012\tSO/3\u0016";
        objectArray[6] = "\u0014(\u001fZ<{\u0014(\b\u00060t\u000ec\b\u00180a\t\u0012YBi\"";
        objectArray[7] = ">u\b\u0014,J>u\u001fH E$>\u001fV P#ON\rw\u001a";
        objectArray[8] = "lq(!9kg~9nThk`?2veju";
        objectArray[9] = Boolean.TYPE;
        _6d_0.k[9] = "java/lang/Boolean";
        objectArray[10] = "E\u0018WyIlE\u0018@%Ec_S@;EvX\"\u0011e\u0010=";
        objectArray[11] = ";ql\u007f~Q&dn>{\rf&";
        objectArray[12] = "\u001f)`p\u001a\u000f\u001f)w,\u0016\u0000\u0005bw2\u0016\u0015\u0002\u0013&lCP";
        objectArray[13] = "\u000f`07d3\u000f`'kh<\u0015+'uh)\u0012Zv.=k";
        objectArray[14] = "NY\u0001K,ENY\u0016\u0017 JT\u0012\u0016\t _ScGRt\u0018";
        objectArray[15] = "\u0004Qv=\u0019\u0019\u0004Qaa\u0015\u0016\u001e\u001aa\u007f\u0015\u0003\u0019k0 A@NWnr\u0007\u00035\u00061&E";
        objectArray[16] = "jU$Yx*\u001fu/Vie~{$]m?\n";
        objectArray[17] = Integer.TYPE;
        _6d_0.k[17] = "java/lang/Integer";
        objectArray[18] = "\u0007\u00100\u000f\"<\u0019\u0018*@o&\u0003\u00123\u001c~,\u0003\u0005h+t,\u000e\u00042\u0001~\u001a\b\u00030\u0007o,";
        objectArray[19] = "\u001bed\\\u0005Z\u0005m~\u0013gF\u0002p";
        objectArray[20] = "8\u001ba+5#&\u0013{dR\"7\bv>t$";
        objectArray[21] = "/?KcI)/?\\?E&5t\\!E32\u0005\f|\u0014";
        objectArray[22] = "E\u001d#\u001eH+E\u001d4BD$_V4\\D1X'`\u0004\u0013";
        objectArray[23] = "mD\u0007z^\u001efK\u00165\"\u0007iK\u0010y\u001c\u0017";
        objectArray[24] = "s\r4\u000bThm\u0005.D\u0019rw\u000f7\u0018\bxw\u0018l,\u000fil\u001e'";
        objectArray[25] = "e\\\u0001\u001a#\u0011e\\\u0016F/\u001e\u007f\u0017\u0016X/\u000bxfC\u0007v";
        objectArray[26] = "veO\u0019\u0013{}j^VruvaZ\f";
        objectArray[27] = "^!k1q\u0019C4iptE\f<";
        objectArray[28] = "F\u0015(#\u0007u[\u0000*b\u0002)\u00166";
        objectArray[29] = "\u0010i\u00034A]eI\b;P\u0012\u0004G\u00030THp";
        objectArray[30] = "-3+h\b83;1'k,7v\u0018gR?>";
        objectArray[31] = "2ID)\u0001}2ISu\rr(\u0002Sk\rg/s\u0001>^'";
        objectArray[32] = "\u0010@21KY\u001bO#~,[\u000eD#5\u0017";
        objectArray[33] = "l_V\u0000b\u0013l_A\\n\u001cv\u0014ABn\tqe\u0010\u001d6I";
        objectArray[34] = "(\u001fo\u001b\u0002P(\u001fxG\u000e_2TxY\u000eJ5%)\u0002Z\u0001";
        objectArray[35] = "L[7B5kQN5\u000307\u001bS";
        objectArray[36] = "igQ\u0013dcigFOhls,FQhyt]\u0017\u000582";
        objectArray[37] = "X,\u0015\bA9-\f\u001e\u0007PvL\u0002\u0015\fT,8";
        objectArray[38] = "\n<\u0002Cy6\u00144\u0018\f16\u000e>\u0000K8-N\r\u0006G3*\u0003<\u0000G";
        objectArray[39] = "Oi.\u001a8\u0014R|,[=H\u0012~";
        objectArray[40] = "\"o_N\u0014j\u0014J_N\u00036\u0018EE\u0005\u0003(\u0018PBtR|K\u0015\n";
        objectArray[41] = Long.TYPE;
        _6d_0.k[41] = "java/lang/Long";
        objectArray[42] = "\u0000Ix</T\u0000Io`#[\u001a\u0002o~#N\u001ds>*p\u000b";
        objectArray[43] = "\u000f\u0007$o\u0014Cz'/`\u0005\f\u001b)$k\u0001Vo";
        objectArray[44] = "?-paxB?-g=tM%fg#tX\"\u00176|&\u0013";
        objectArray[45] = "I0s\u000bzBI0dWvMS{dIvXT\n5\u0013 \u0019";
        objectArray[46] = "<0ifi/!%k'lsa\u001a";
        objectArray[47] = "')a\u001fB*R\tj\u0010Se3\u0007a\u001bW?G";
        objectArray[48] = "I\u000f\u001b\u001ciOI\u000f\f@e@SD\f^eUT5]\u0001<";
        objectArray[49] = Double.TYPE;
        _6d_0.k[49] = "java/lang/Double";
        objectArray[50] = "\u001eK|n\u0012\u0010\u0015Dm!u\b\u0011XkmP\u0019";
        objectArray[51] = ":RS^\u001f\u0018'GQ\u001f\u001aDgO";
        objectArray[52] = "L3A\u000e>\u001eL3VR2\u0011VxVL2\u0004Q\t\u0007\u0014`";
        objectArray[53] = "#\u0000?n*@#\u0000(2&O9K(,&Z>:zr~\u001e";
        objectArray[54] = "#r\u0002Y/$>g\u0000\u0018*xs|";
        objectArray[55] = "\u007f&XIP\u0001\n\u0006SFANk\bXME\u0014\u001f";
        objectArray[56] = ";<p\u0001\u000f\u001a&)r@\nFg\u001b";
        objectArray[57] = ":\fa\r3/O,j\u0002\"`.\"a\t&:Z";
        objectArray[58] = "\u0014! \u0014t:a\u0001+\u001beu\u0000\u000f \u0010a/t";
        objectArray[59] = Float.TYPE;
        _6d_0.k[59] = "java/lang/Float";
        objectArray[60] = "H\"J8=\u0019H\"]d1\u0016Ri]z1\u0003U\u0018\r'e";
        objectArray[61] = ":.,QNtO\u000e'^_;.\u0000,U[aZ";
        objectArray[62] = "\u0002\u0015\u001c1YI\t\u001a\r~:D\u001c\u001c";
        objectArray[63] = ")0(YSf\\\u0010#VB)=\u001e(]FsI";
        objectArray[64] = "m\u0003_T3\u0012p\u0016]\u00156N0S";
        objectArray[65] = "P\u001a`\u0015PG%:k\u001aA\bD4`\u0011ER0";
        objectArray[66] = "Mb(\u001fJ\u001fPw*^OC\u001du";
        objectArray[67] = "\u0015S\u001b:*2\u000b[\u0001ug(\u0011Q\u0018)v\"\u0011FC\u001e|\"\u001cG\u00194v4";
        objectArray[68] = "]T$E\u001cc(t/J\r,Iz$A\tv=";
        objectArray[69] = "W\u0001\u0016+2.I\t\fd\u007f4S\u0003\u00158n>S\u0014N\ts5^\u0015\u00128y5I(\u00019t\u0016\\\u0010";
        objectArray[70] = "DZr\u0015qQZRhZ<K@Xq\u0006-A@O*70JMNv\u0006:JZse\u00077iOK ?:]}^p\"6AY";
        objectArray[71] = "Rc],s{YlLc\u001fxWnN,3";
        objectArray[72] = "#>QSkH);[VWO ?4_3S+C\u0001Z+\u001e}!\u0003I(NF";
        objectArray[73] = "1.f\\\n\nd7w]oW22}U\u0003edw!\rP24\"a\u0002TP61bRo";
        objectArray[74] = "-kXl`\u0018-`\u000ejZ\u0015<iS`\rBf>\f\f+\u0014-=Hb:\u00161;";
        objectArray[75] = "\\9]\\n0\u000bnFD`Z\u0000lBEl628\u0006\u001e2Z\u0014nN\u001ct4\u0005lR\u001a\u000b+\nq\u0007Ze:\bm\u0001%z5\u00158AKk7\t>>\u001c39\u001cdTKd\"\u0004j>";
        objectArray[76] = "g/8G-*g5c\u007fb\nWok\u001al,g/a\u00032";
        objectArray[77] = "\u0017rOv~e\u00197\u000ex\u001ep\u00046\u0012`rBPrJ9$\u0015\u0017rOv~e\u00197\u000ex\u001e";
        objectArray[78] = "\u001f#+&\u0010\u0014Ojr& EN<s'w\u0011\u001f`/w \u0014\u0011>l6K\u001bE;,";
        objectArray[79] = "\u0000\u00174(\f6@\u001d-vogG\u0015+\u007f\u0013aAx<-\u0015g\u0006\b`y\u0017\u007f;";
        objectArray[80] = "TitEV!\u000fg|@&g\u0002s\u007fCK\u001d\u000etgL\u001dy\u001f&fX&|\rii\u0006Bm_h}=";
        objectArray[81] = "aS\u0001An(t^\u001bB\u001f.tM\u0011\u001cs\u001c \u000bIC!Kb\bLAos \u000b\u0015\u0006\u001f";
        objectArray[82] = "d[;i\u0001{dA`QBoT\u0019m1\u0010e2M}*\u0010nT\u0019wl\u000fr9Rf<N\u001e";
        objectArray[83] = "]R'[_=\\\u000e?\u000ffm'\u001f`_Y2\u0016\u001b8@\u000fW\u0019\u000e5\t\u000ff\u001a\f4\rf";
        objectArray[84] = "r\u00167\u001aG41HaL}TLk\u001e92AW/%I\u0010f7\u0017f\u0017F0";
        objectArray[85] = "k\u00100YM\ffOtQ6\u0010:Q-WZ\"m\u001dq\u0001\u0006ujD$K\u0006\u00174\u001d0B6K:AtY\u0007H8@p0";
        objectArray[86] = "Y=\u00129\t7\u001acDo3h\\h\u001e5Zk&o\u0013/\u00034Dm\u0000,S\u000f";
        objectArray[87] = "mpZa^\u0002mj\u0001Y\u0011\u0017]qW'J^7p\u000b?\u001e";
        objectArray[88] = "\bl`Xj\u0003K26\u000ePi0\u0010Gs\u001dl)\u0014Iv\u0019t:\u000f\rMiV\u001do5\u000e7\u0000K";
        objectArray[89] = "sz!Si\u000fy}{M\u001b\u0003\u007fp}[LT!'%7u\res|\u000f \u0014tr";
        objectArray[90] = "lA*m2a7O\"hB%*BFt \"&\u0005\"er#2>'w=,lZ6%<8W_$j3f3Nvk']";
        objectArray[91] = "9LU1\fR:[\u0016)vf\u001frcI\u0011@%LT#\u0012WfT";
        objectArray[92] = "E{<aFiEagY\u0001\fLj`7Bj\u0018z{7I\fKml`P=Homd9";
        objectArray[93] = "\n\u0006\u000bb\u001ao\n\r]d b\u001b\u0004\u0000nw5AS]\u0002Qc\nP\u001bl@a\u0016V";
        objectArray[94] = "\\Y\u0011%)UH]\u000bmQIYS\u000ex\u0006\u0016\u0001\u000eS\u0014:KD\u000eQv8XG^";
        objectArray[95] = "&f^\u00126>v LN3Q\"$.\u0012:1q$HF**q/.\u0012 ln3CY1</_";
        objectArray[96] = ".\u001b+\u00149'vI KpM]c\na\u0007\fQf\u0010j\u0006M.\u001b+\u00149'vI Kp";
        objectArray[97] = "KBGQDMB\u0006\u0010T\u0007-\u0017\u0016\u0000W\u0019A%FB\rN-\u0019\u0017\u0000\u0007EO\u001b\u0004\u0003W~";
        objectArray[98] = "[oI\u0015R|[u\u0012-\u0011\u0019\u0011%\u000bF\u0014s\u0010y\u0013\u0012";
        objectArray[99] = "\u00018xG$0Qq!G\u0014aP' FC5\u0001zu\u0014\u00140\u000f%?W\u007f?[ \u007f";
        objectArray[100] = "5&s9%45<(\u0001j\u0011\u0005'~\u007f1ho&\"ge";
        objectArray[101] = "Uk\u001cj-*UqGRlO^oL*\"s\u0005aD/";
        objectArray[102] = "\u001fK%\u0007\u00129\u001f@s\u0001(4\u000eI.\u000b\u007fcT\u001evgY5\u001f\u001d5\tH7\u0003\u001b";
        objectArray[103] = "\ts\rLj1\u0014,\u000b\u000bTo\u000e/\u0002\u001b\u0003;U\u007f^FTg\u001f:W\u0006/x\u0015=\u0016";
        objectArray[104] = "\fYI\u0018\u0015$\fC\u0012 Z\u0018<\u001d\tQP3N\\\u0004Q[";
        objectArray[105] = "\u0007 \u00139/\r\u00047P!U+-\u00150\u001a\u0011.<\u0015h&-\u001c\u0018\"\u0002%:_\u0000";
        objectArray[106] = "K\u001f\u001f8;G\\\u0006\u001c+I\u001fF\u000e\u001d-5\u0019@c\n\u007f3\u001f\u0007\u0013V+1\u0007:";
        objectArray[107] = "A}S\n~.OxG\u0007\u001fhWmM\u0007c\u0013EfDXsrO;\u0015\u0000\u001fs\u0012:\u0019VshDdOf";
        objectArray[108] = "\n<\u001c\u0015\u0000\u000e\t0\u0003\u000fjn\u00197\u001e\u000fjG\u001f4\u0012\u001eQD\u0013+\b";
        objectArray[109] = " p(\fn%p9q\f^tqop\r\t  3,Y^%.mo\u001c5*zh/";
        objectArray[110] = "Zd6`F|Ysux<_xQ\u0011XmMaK\u0006\\aMaQ\u0017\u0018[nFd7rXy\u0005|";
        objectArray[111] = "v\u000b&\\%.?\u0000.V/\\)\u000f:\"5,\"\u000e\u0019\f.1&\u000e\u001d\u000b38O\t)\u0010dg-\u000b:\u00134\\$\u0018>\u00005a*\u001d*\rT";
        objectArray[112] = "?\u001c\u0019S\u0018\u0017<\u000bZKb\u001a\"\b\u0003M\u000b\u0019X\u000f\u000eWRF:\r\u001dT\u0002}";
        objectArray[113] = "\u0013'&x_[Ca4$Z4\u0010\u001eoyZMOt8.AUA";
        objectArray[114] = "\u0019e6sQ1Yo/-2{Oo43_\u0001Ch,<\teR:-(2?Ofj$\u0003<MgnM";
        objectArray[115] = "E\u001f<R\u001cAL[kW_!\u0019K{TAM+\u001b7\u000e\u0017!\fIhT\u001cB\fB>R&";
        objectArray[116] = "P\u007fSgd;Pe\b_+^\u001a5\u00114\"4\u001bi\t`";
        objectArray[117] = ",w_RAI,m\u0004j\u0003,%f\u0003\u0004EJqv\u0018\u0004N,%6\u0012\u0014T\\sm\u000f\u0012L,";
        objectArray[118] = "?v\fg]\u0013=gY.\u0015w`pC\u001d\t\u0006]p@^]\u001b=,\u0003b\u0000\u0013f&\u0002^";
        objectArray[119] = "zL?\u001b-HnH%SU_sW$M9m.\u0010~\u001aUQrWt\u00117SaT$*";
        objectArray[120] = "\u0004[\u0010\u001a\u0002\u0007\u0004AK\"M\u001f4Z\u001d\\\u0016[^[ADB";
        objectArray[121] = "{<\u0000<\u0017\nn1\u001a?f\fn\"\u0010a\n>8d@7_ih2\f6]\u000bj!\u000fff";
        objectArray[122] = "Gpa\"\u001fYJ/%*dE\u00161|,\bwAs&sX Dss0\u0019KK'vpd";
        objectArray[123] = "\u000e,62(f\u0004'1l\u0014>\u001e' ;h8\u0018J7in>_:k=l&b";
        objectArray[124] = "-Xmbu }\u00114bEq|G5c\u0012%\"\u0013o6E #E*r./w@j";
        objectArray[125] = "V\u0006#a\b@\u0006@1=\r/WpSa\u0004O\u0001D55\u0014T\u0001OSa\u001e\u0012\u001eS>*\u000fB_?";
        objectArray[126] = "}\u0012\u000bZ\u001bP'G\u001c\u0010@a:\u0017\tV\u0016&*~SF\u0017X-OPD\u0016\\DG\u0001M\n\u0001u\u001dTZ@ZD";
        objectArray[127] = "\u001b/<\rP)Kfe\r`xJ0d\f7,\u001bm0P`)\u00152{\u001d\u000b&A7;";
        objectArray[128] = "}\u001eqh\\\u0016i\u001ak $\u0001t\u0005j>H3)B0g$\u000fu\u0005:bF\rf\u0006jY";
        objectArray[129] = "\u001az\u0012\u0010\u0005~M-\t\b\u000b\u0014M#\u001c\r\fC\u001ayLP`eL2H\u0016\u000etN.N";
        objectArray[130] = "\u0013h(C&\u000bSb1\u001dEZSJ(\u00059J(9 \u0011|R\u0019:\"\u0010x;";
        objectArray[131] = "FNwSf\u0007\u0016\r{\u0011av\u0016\u001bg)d\u001a\u0003A'Kf\t\u0000\u0011\u001cBc\nOJ~@p\t\u001fq";
        objectArray[132] = "[2=\u000f^\u001e[(f7\u0019{R#aYZ\u001d\u00063zYQ{RspIK\u000b\u0004(mOS{";
        objectArray[133] = "\u0000Ya\u007f%/\u0000R7y\u001f\"\u0011[jsHuK\f4\u001fn#\u0000\u000fqq\u007f!\u001c\t";
        objectArray[134] = "{[zD\u0005\u0006{P,B?\u000bjYqHh\\0\u000e($N\n{\rjJ_\bg\u000b";
        objectArray[135] = "\u007fM\u0017p\\e\u007fWLH\u0013fO\rD-\u001dc\u007fMN4C";
        objectArray[136] = "\u0002hkX \u001dWt~C\u001b\u0018\n`aSLOR58\u0005\u001b\u001f\u000ecb\u0004pJ\u0012vy";
        objectArray[137] = "{HVGequ\r\u0017I\u0005dh\f\u000bQiV<HQ\b=\u0001n\u001c\u0017\u0006>cl\u000f\u0014V\u0005";
        objectArray[138] = "vDn\u0017pF7In\u001c\u0002\tI\u0001uMlO/UeVlDISsQ2\u000f+Q`Rb4";
        objectArray[139] = "E\u0019^h0\u001aK\\\u001ffP\u000fV]\u0003~<=\u0002\u0019Y'ljPM\u001f)k\bR^\u001cyP";
        objectArray[140] = "@ON2\u0006!\u0003O\u001d#9\u007fQPM8UM\u0007\u001c\u0017n\u0003\u001a\u0002AAfP+\u0001C@b9";
        objectArray[141] = "34\u0017xuE?2\u0017x\u0007O *\u0012|k}toO!<*&:\u000e+<H$)\r{\u0007";
        objectArray[142] = "xJ:d\u001bZ$\u001e8|&Lx\u0001<\u0005GHj\u0000{aV\u001ak\u0014@";
        objectArray[143] = ".!z`\u0011D.;!XU!'0&6\u0015Gs =6\u001e! 7*a\u0007\u0010#5+en";
        objectArray[144] = "x/}iLRx5&Q\t72e?:\n]39'n";
        objectArray[145] = "J|`\u0019d-Pxp\u0013\u000bx(:j\u0018e=Nnz\u0003e6(of\u0014kz\u0011em\u00135F";
        objectArray[146] = "Nn;c\t7\u0015`3fys\bm\u001e\u007f\u001d\u000bNn;c\t7\u0015`3fy2\u0005,&w\u0014y\u0014|g\u001b";
        objectArray[147] = "Bn\u00057%\r\u0012(\u0017k bK\u0017u7)\u0002\u0015,\u0013c9\u0019\u0015'u73_\n;\u0018|\"\u000fKW";
        objectArray[148] = "wb#xa\u0001,l+}\u0011V(p&z\u0011\u0004< >l|O-p\u007f\u0000";
        objectArray[149] = "\n\u0014BBba\n\u0016MF\\9kTYK2{\r\u0000IP2pkTC\u0016-l\u0006\u001fRFl\u0000";
        objectArray[150] = "?M\u0014i\u001c\ndC\u001cllW\u007f\u007f\u001di\u0010G\u0004\f\u0015}U_5\u000f\u0017|Q6";
        objectArray[151] = "UqwS:0Uk,ku\u001aepz\u0015.l\u000fq&\rz";
        objectArray[152] = "r\u0003aKv*1\u00032ZItc\u001cbA%F7Z8\u001bu\u0011e\f~\u0016rsg\u001f}FIzb\u001c2\u001d+xq\u001fb&\"}rP9D nq\u0000\u0002\u001atlg\u001b{\u0017+(o`";
        objectArray[153] = "oD\u00043C[o^_\u000b\u0007>%\u000eF`\u0005T$R^4";
        objectArray[154] = "A0l:/\u0002A*7\u0002hgN7!8\"\u0015\u000f:!3";
        objectArray[155] = "\u0002WiTn\b\u0002M2l-\r2\u0015?\f\u007f\u0016TA/\u0017\u007f\u001d2\u0015%Q`\u0001_^4\u0001!m";
        objectArray[156] = "\u001f\u0000?'^U\u0015\u0007e9,Y\u0013\nc/{\u000eLW8CLR\n\u000b7*S\b\r\u000b";
        objectArray[157] = ")_x3e\u001c\u007fZu3owu\u000fy<y\u001bGY5a$N\u0010\ti .Lr\u000bz#~w";
        objectArray[158] = "g\"qDL\u0000'(h\u001a/[8 }\u0000/\t,pe\u0016BB= $z";
        objectArray[159] = "G\u001c=\b<\u001bIC.IR\f\u0017\u0010)\u001b\u0005[LA|IR\u000b\u001fM*\fl\u0007MB0";
        objectArray[160] = "tpvV(7!-iHW8}<RE3*}@mN(&+$|\u001c)2\u0010";
        objectArray[161] = "A\u0003fTN\f\u0014\u001awU+QB\u001f}]Gc\u0014Z!\u0005\u001a4D\u000fa\n\u0010VF\u001cbZ+";
        objectArray[162] = "'\u001eqH\r\u00143\u001ak\u0000u\b\"\u0014n\u0015\"WzI2y\u001e\n?I1\u001b\u001c\u0019<\u0019";
        objectArray[163] = "\u007fZQ{v'u_[~J?sC\u0017s\r/\u001aL\u0006bzzxN\u0015a*A\u007fZQ{v'u_[~J";
        objectArray[164] = "0A\u0015n\u0017'0[NVUBz\u000bW=Q({WOi";
        objectArray[165] = "1#\u0003hL$<|G`78`b\u001ef[\n4'@<\u000b]0w\u0017z\u0007?n.\u0003s7`i.\u0015a]fl\"\u0004\u0001";
        objectArray[166] = "\u0018uW\u00177>\rxM\u0014F8\rkGJ*\nY-\u001f\u0015z]\u0004p\\\u001c>/\u0010tFTF";
        objectArray[167] = "6N>\b\u001dTvD'V~\raM[W\u001c\u001b|\u001a?FN\u001ah!e[\u0012]d\u0010fY\u0013Y\r";
        objectArray[168] = "\u001ao\u00143\bG\u001auO\u000bH\"\u0015hY1\u0005PTeY:";
        objectArray[169] = "\u001c2GNn\u0003\\8^\u0010\rIJ8E\u000e`rI][\bvLL#\u0019\u00133\b'cO\u001c4Z\u0016`M\u001d03";
        objectArray[170] = "(\u00005Nr\\!DbK1<tTrH/PF\u00065\u0011x\r\u0011\u00006K1Y{WaP)W\u0011";
        objectArray[171] = "\u0015\u0005[A\u0004c\u001f\u0002\u0001_vo\u0019\u000f\u0007I!8FS[%O<\u0005\r\u0018N\u00199\b\r\u0012";
        objectArray[172] = "{s \u000b|!,$;\u0013rK,*.\u0016u\u001c{p~H\u0019:-;z\rw+/'|";
        objectArray[173] = "T@mRCcK\u001ajRsoYYuY\u001f]\r\u0015,\u0007I\nEYmB\u00013R@nQs";
        objectArray[174] = "tG[U\u0016{k\u001d\\U&wy^C^JE$\u001e\u0012\u0006&yx^\u0013\u0002D{k]C9M~h\u0012\u0018[OmkB#ADb.S@TIx-\"";
        objectArray[175] = "\u0016ve`nD\u0016}3fTI\u0007tnl\u0003\u001e]#2\u0000%H\u0016 un4J\n&";
        objectArray[176] = "j^%\tb\u0018jD~1-%ZNcJq\u001cg@f^|";
        objectArray[177] = "a@F\na\u001co\u0005\u0007\u0004\u0001\tr\u0004\u001b\u001cm;&@AE:lt\u0014\u0007K:\u000ev\u0007\u0004\u001b\u0001";
        objectArray[178] = "\u001eob\"\u000f?I8y:\u0001UI6l?\u0006\u0002\u001el<cj$H'8$\u00045J;>";
        objectArray[179] = "jba\u000e!')<7X\u001b[Q\u0012I-\u001b`,6f^##r`0";
        objectArray[180] = "Ks\t{h\u0005K-\u00188o>NC\\,vP\t%\b<mP\u0002C\\vz\u0003\fx\\(k@\u000bC";
        objectArray[181] = "@\bg;!hC\u001f$#[X`,U\u001f\u0016Np<Q\u000e\u0003Yc9@\u000e[e_\u000bd91fHH|";
        objectArray[182] = "\b{X\u0005<h\ba\u0003=r\rB1\u001aVzgCm\u0002\u0002";
        objectArray[183] = "9\u0010&\u0001B/eD$\u0019\u007f?=P\u001a\r\u000f#T\u00151\fF6e\u00163\rB_";
        objectArray[184] = ")7\u0015X\u0018ty~LX(%x(MY\u007fq)u\u0018\u000f(t'*RHC{s/\u0012";
        objectArray[185] = "\u0017-+ih\u001f\u0017/$mVGv9=82\f\u00143:b,";
        objectArray[186] = "\u0006\b2Uo9\u000fLeP,YZ\\uS25h\b6\rec?\b4_%=F\u000ew\u000f20?";
        objectArray[187] = "I2Y\u0001\b\u001c\u001coF\u001fw\u0013@~`\u0016\u0006|L`\\\nL\u0018]2]\u001ew";
        objectArray[188] = "g{scI\u0010k}sc;\u001atevgW(  +:\u0007\u007fruj0\u0000\u001dpfi`;";
        objectArray[189] = "\u0017Zw\u0016}gLT\u007f\u0013\r6JYa\u001fV6P% \u0001heO\u0015`\u000bq;,";
        objectArray[190] = "d'\u0004@\u0002l'yR\u00168\nZZ-cw\u0019A\u001e\u0016\u0013U>!&UM\u0003h";
        objectArray[191] = "6q\u001dO!vu/K\u0019\u001b\u0011\u0000\u000e<hA\u000f\u000f\u0007'yA\u0007\u0005\u0005*%dw$\"J\u001d')rt";
        objectArray[192] = "\u001eMX#^'\nIBk&8\u0003WJv]U\u001bH\\c\u001d1\n\u001a]w&k\u0017F\u001a{\u0017h\u0015G\u001e\u0012";
        objectArray[193] = "jdD7]\"j~\u001f\u000f\u001f\u0007Z&\u0012oL<<r\u0002tL7Z&\b2S+7m\u0019b\u0012G";
        Object[] objectArray2 = objectArray;
        objectArray[194] = "o32\u000b<D4=:\u000eL\u00133*\"\u001a-\u001e/\u000f3\u0002L\u001963/H(\bd2;sr\u00158u7Bq\u00179q^";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'q' || c == 'Q' || c == 'g' || c == '\u00da') {
                field = _6d_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'q' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'Q' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'g' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _6d_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'W' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'E' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _6d_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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
            throw new RuntimeException("dev/krypton/6d" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l2, long l3) {
        int n = _6d_0.e(l2, l3);
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
                clazz3 = _6d_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _6d_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _6d_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _6d_0.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _6d_0.f(1884262190345266L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _6d_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _6d_0.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _6d_0.f(1884262190345266L, 0L);
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
            int n = _6d_0.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _6d_0.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _6d_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _6d_0.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _6d_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _6d_0.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _6d_0.a(n, l2);
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
            throw new RuntimeException("dev/krypton/6d" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x2CF5;
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
                throw new RuntimeException("dev/krypton/6d", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _6d_0.e[n2] = n3;
        }
        return e[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field g(long l2, long l3) {
        int n = _6d_0.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _6d_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _6d_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _6d_0.c(clazz3, string2, clazz2)) != null) {
                    _6d_0.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _6d_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _6d_0.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _6d_0.f(1884262190345266L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private boolean boolean_0(Object[] objectArray) {
        boolean bl;
        block18: {
            block20: {
                block19: {
                    long l2 = (Long)objectArray[0];
                    class_2248 class_22482 = (class_2248)objectArray[1];
                    l2 = b ^ l2;
                    String string = _8h.cfr_renamed_4();
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        bl = class_22482 instanceof class_2541;
                                                        if (string != null) break block18;
                                                        if (bl) break block19;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _6d_0.a(matchException);
                                                    }
                                                    bl = class_22482 instanceof class_4777;
                                                    if (string != null) break block18;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _6d_0.a(matchException);
                                                }
                                                if (bl) break block19;
                                            }
                                            catch (MatchException matchException) {
                                                throw _6d_0.a(matchException);
                                            }
                                            bl = class_22482 instanceof class_4950;
                                            if (string != null) break block18;
                                        }
                                        catch (MatchException matchException) {
                                            throw _6d_0.a(matchException);
                                        }
                                        if (bl) break block19;
                                    }
                                    catch (MatchException matchException) {
                                        throw _6d_0.a(matchException);
                                    }
                                    bl = class_22482 instanceof class_4776;
                                    if (string != null) break block18;
                                }
                                catch (MatchException matchException) {
                                    throw _6d_0.a(matchException);
                                }
                                if (bl) break block19;
                            }
                            catch (MatchException matchException) {
                                throw _6d_0.a(matchException);
                            }
                            bl = class_22482 instanceof class_4951;
                            if (string != null) break block18;
                        }
                        catch (MatchException matchException) {
                            throw _6d_0.a(matchException);
                        }
                        if (!bl) break block20;
                    }
                    catch (MatchException matchException) {
                        throw _6d_0.a(matchException);
                    }
                }
                bl = true;
                break block18;
            }
            bl = false;
        }
        return bl;
    }

    @_3i_0
    public void cfr_renamed_4(_6Q q) {
        CallSite callSite;
        int n;
        int n2;
        int n3;
        long l2;
        block2: {
            block3: {
                l2 = b ^ 0x22C37D2D9ABFL;
                long l3 = l2 ^ 0x489056557260L;
                n3 = (int)(l3 >>> 56);
                n2 = (int)(l3 << 8 >>> 32);
                n = (int)(l3 << 40 >>> 40);
                String string = _8h.cfr_renamed_4();
                try {
                    callSite = _6d_0.c("q", (Object)_6d_0.c("q", (Object)this, 7352821128953388588L, (long)l2), 7350743495090061516L, (long)l2);
                    if (string != null) break block2;
                    if (callSite != null) break block3;
                }
                catch (MatchException matchException) {
                    throw _6d_0.a(matchException);
                }
                return;
            }
            callSite = _6d_0.c("q", (Object)_6d_0.c("q", (Object)this, 7352821128953388588L, (long)l2), 7350743495090061516L, (long)l2);
        }
        CallSite callSite2 = _6d_0.c("W", (Object)callSite, (int)_6d_0.c("W", (Object)q.cfr_renamed_5, 7351937642600969114L, (long)l2), (int)_6d_0.c("W", (Object)q.cfr_renamed_5, 7353033929920205449L, (long)l2), 7354287947798844016L, (long)l2);
        _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, 7352171368211938110L, (long)l2), () -> this.cfr_renamed_8((byte)n3, n2, n, (class_2818)callSite2), 7367570923815468689L, (long)l2);
    }

    /*
     * Exception decompiling
     */
    private _8B dev_krypton_8B_0(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
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

    @_3i_0
    public void cfr_renamed_4(_6l_0 l_0) {
        block46: {
            Object object;
            CallSite callSite;
            long l2;
            block47: {
                CallSite callSite2;
                CallSite callSite3;
                String string;
                long l3;
                block44: {
                    long l4;
                    block45: {
                        class_2680 class_26802;
                        long l5;
                        block42: {
                            block43: {
                                long l6;
                                block39: {
                                    block40: {
                                        block41: {
                                            long l7 = l2 = b ^ 0x7695480337D0L;
                                            l5 = l7 ^ 0x66D354EC6363L;
                                            l3 = l7 ^ 0x4059357093A4L;
                                            l6 = l7 ^ 0x6B528CEE46F4L;
                                            l4 = l7 ^ 0x34D080AD06C4L;
                                            string = _8h.cfr_renamed_4();
                                            try {
                                                if (_6d_0.c("q", (Object)_6d_0.c("q", (Object)this, -3790584435390385341L, (long)l2), -3788580526433636957L, (long)l2) == null) {
                                                    return;
                                                }
                                            }
                                            catch (MatchException matchException) {
                                                throw _6d_0.a(matchException);
                                            }
                                            callSite = _6d_0.c("W", (Object)l_0.cfr_renamed_8, -3794260989829321063L, (long)l2);
                                            class_26802 = l_0.cfr_renamed_2;
                                            callSite3 = _6d_0.c("W", (Object)class_26802, -3794915178869771675L, (long)l2);
                                            try {
                                                CallSite callSite4;
                                                try {
                                                    try {
                                                        try {
                                                            callSite2 = _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, -3794771386029255372L, (long)l2), (long)l4, -3792117589201958594L, (long)l2);
                                                            if (string != null) break block39;
                                                            if (callSite2 == false) break block40;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _6d_0.a(matchException);
                                                        }
                                                        callSite4 = callSite3;
                                                        if (string != null) break block41;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _6d_0.a(matchException);
                                                    }
                                                    if (callSite4 != _6d_0.c("g", -3795290085364456496L, (long)l2)) break block40;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _6d_0.a(matchException);
                                                }
                                                callSite4 = _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, -3795967929465081816L, (long)l2), (Object)callSite, (Object)_6d_0.c("g", -3796267589606534700L, (long)l2), -3792615206519790558L, (long)l2);
                                            }
                                            catch (MatchException matchException) {
                                                throw _6d_0.a(matchException);
                                            }
                                        }
                                        return;
                                    }
                                    callSite2 = _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, -3791328979048724060L, (long)l2), (long)l4, -3792117589201958594L, (long)l2);
                                }
                                try {
                                    try {
                                        if (string != null) break block42;
                                        if (callSite2 == false) break block43;
                                    }
                                    catch (MatchException matchException) {
                                        throw _6d_0.a(matchException);
                                    }
                                    if (callSite3 != _6d_0.c("g", -3795219342442817386L, (long)l2)) break block43;
                                }
                                catch (MatchException matchException) {
                                    throw _6d_0.a(matchException);
                                }
                                CallSite callSite5 = _6d_0.c("W", (Object)callSite, -3789343570394560294L, (long)l2);
                                try {
                                    try {
                                        try {
                                            try {
                                                callSite2 = callSite5;
                                                if (string != null) break block42;
                                                Object[] objectArray = new Object[1];
                                                objectArray[0] = l6;
                                                if (callSite2 < _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, -3796122451574621952L, (long)l2), (Object)objectArray, -3789253621615896164L, (long)l2)) break block43;
                                            }
                                            catch (MatchException matchException) {
                                                throw _6d_0.a(matchException);
                                            }
                                            callSite2 = callSite5;
                                            if (string != null) break block42;
                                        }
                                        catch (MatchException matchException) {
                                            throw _6d_0.a(matchException);
                                        }
                                        Object[] objectArray = new Object[1];
                                        objectArray[0] = l6;
                                        if (callSite2 > _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, -3788121668945199415L, (long)l2), (Object)objectArray, -3789253621615896164L, (long)l2)) break block43;
                                    }
                                    catch (MatchException matchException) {
                                        throw _6d_0.a(matchException);
                                    }
                                    _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, -3795967929465081816L, (long)l2), (Object)callSite, (Object)_6d_0.c("g", -3796244987999242812L, (long)l2), -3792615206519790558L, (long)l2);
                                    return;
                                }
                                catch (MatchException matchException) {
                                    throw _6d_0.a(matchException);
                                }
                            }
                            callSite2 = _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, -3795454759573374332L, (long)l2), (long)l4, -3792117589201958594L, (long)l2);
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (string != null) break block44;
                                        if (callSite2 == false) break block45;
                                    }
                                    catch (MatchException matchException) {
                                        throw _6d_0.a(matchException);
                                    }
                                    Object[] objectArray = new Object[3];
                                    objectArray[2] = l5;
                                    objectArray[1] = (int)_6d_0.c("W", (Object)callSite, -3789343570394560294L, (long)l2);
                                    objectArray[0] = class_26802;
                                    callSite2 = _6d_0.c("W", (Object)this, (Object)objectArray, -3789618484676152579L, (long)l2);
                                    if (string != null) break block44;
                                }
                                catch (MatchException matchException) {
                                    throw _6d_0.a(matchException);
                                }
                                if (callSite2 == false) break block45;
                            }
                            catch (MatchException matchException) {
                                throw _6d_0.a(matchException);
                            }
                            _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, -3795967929465081816L, (long)l2), (Object)callSite, (Object)_6d_0.c("g", -3790318237456746501L, (long)l2), -3792615206519790558L, (long)l2);
                            return;
                        }
                        catch (MatchException matchException) {
                            throw _6d_0.a(matchException);
                        }
                    }
                    try {
                        object = _6d_0.c("q", (Object)this, -3787701618217914875L, (long)l2);
                        if (string != null) break block46;
                        callSite2 = _6d_0.c("W", (Object)object, (long)l4, -3792117589201958594L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw _6d_0.a(matchException);
                    }
                }
                try {
                    try {
                        try {
                            if (callSite2 == false) break block47;
                            object = this;
                            if (string != null) break block46;
                        }
                        catch (MatchException matchException) {
                            throw _6d_0.a(matchException);
                        }
                        Object[] objectArray = new Object[2];
                        objectArray[1] = callSite3;
                        objectArray[0] = l3;
                        if (_6d_0.c("W", (Object)object, (Object)objectArray, -3793053021096156038L, (long)l2) == false) break block47;
                    }
                    catch (MatchException matchException) {
                        throw _6d_0.a(matchException);
                    }
                    _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, -3795967929465081816L, (long)l2), (Object)callSite, (Object)_6d_0.c("g", -3792669069437086042L, (long)l2), -3792615206519790558L, (long)l2);
                    return;
                }
                catch (MatchException matchException) {
                    throw _6d_0.a(matchException);
                }
            }
            object = _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, -3795967929465081816L, (long)l2), (Object)callSite, -3792219594567527469L, (long)l2);
        }
    }

    private static boolean cfr_renamed_4(class_1923 class_19232, long l2, Map map, Map.Entry entry) {
        Object object;
        block6: {
            block5: {
                l2 = b ^ l2;
                String string = _8h.cfr_renamed_4();
                object = _6d_0.c("W", (Object)new class_1923((class_2338)_6d_0.c("W", (Object)entry, 7901790914258430855L, (long)l2)), (Object)class_19232, 7905538860603966976L, (long)l2);
                if (string == null) {
                    try {
                        if (object == false) break block5;
                        object = _6d_0.c("W", (Object)map, (Object)_6d_0.c("W", (Object)entry, 7901790914258430855L, (long)l2), 7905680456833042672L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw _6d_0.a(matchException);
                    }
                }
                try {
                    if (string != null) break block6;
                    if (object != false) break block5;
                }
                catch (MatchException matchException) {
                    throw _6d_0.a(matchException);
                }
                object = true;
                break block6;
            }
            object = false;
        }
        return (boolean)object;
    }

    @Override
    public native void cfr_renamed_2();

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean boolean_3(Object[] var1_1) {
        block51: {
            block50: {
                block49: {
                    block48: {
                        block47: {
                            block46: {
                                block44: {
                                    block45: {
                                        block42: {
                                            block43: {
                                                block40: {
                                                    var2_2 = (class_2680)var1_1[0];
                                                    var3_3 = ((Integer)var1_1[1]).intValue();
                                                    var4_4 = (Long)var1_1[2];
                                                    var6_5 = (var4_4 = _6d_0.b ^ var4_4) ^ 22095088703756L;
                                                    var8_6 = _8h.cfr_renamed_4();
                                                    try {
                                                        block41: {
                                                            try {
                                                                try {
                                                                    try {
                                                                        v0 = var3_3;
                                                                        if (var8_6 != null) break block40;
                                                                        v1 = new Object[1];
                                                                        v1[0] = var6_5;
                                                                        if (v0 < _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, (long)6100418117367097080L, (long)var4_4), (Object)v1, (long)6093830590342055524L, (long)var4_4)) break block41;
                                                                    }
                                                                    catch (MatchException v2) {
                                                                        throw _6d_0.a(v2);
                                                                    }
                                                                    v3 /* !! */  = var3_3;
                                                                    if (var4_4 < 0L || var8_6 != null) break block42;
                                                                }
                                                                catch (MatchException v4) {
                                                                    throw _6d_0.a(v4);
                                                                }
                                                                v5 = new Object[1];
                                                                v5[0] = var6_5;
                                                                if (v3 /* !! */  <= _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, (long)6094949346758369585L, (long)var4_4), (Object)v5, (long)6093830590342055524L, (long)var4_4)) break block43;
                                                            }
                                                            catch (MatchException v6) {
                                                                throw _6d_0.a(v6);
                                                            }
                                                        }
                                                        v0 = false;
                                                    }
                                                    catch (MatchException v7) {
                                                        throw _6d_0.a(v7);
                                                    }
                                                }
                                                return v0;
                                            }
                                            try {
                                                v8 = var2_2;
                                                v9 = _6d_0.c("g", (long)6094734144803103810L, (long)var4_4);
                                                if (var8_6 != null) break block44;
                                                v3 /* !! */  = _6d_0.c("W", (Object)v8, (Object)v9, (long)6099703044735924650L, (long)var4_4);
                                            }
                                            catch (MatchException v10) {
                                                throw _6d_0.a(v10);
                                            }
                                        }
                                        try {
                                            if (var4_4 >= 0L) {
                                                if (v3 /* !! */ ) break block45;
                                                v3 /* !! */  = false;
                                            }
                                            return v3 /* !! */ ;
                                        }
                                        catch (MatchException v11) {
                                            throw _6d_0.a(v11);
                                        }
                                    }
                                    v8 = var2_2;
                                    v9 = _6d_0.c("g", (long)6094734144803103810L, (long)var4_4);
                                }
                                var9_7 = (class_2350.class_2351)_6d_0.c("W", (Object)v8, (Object)v9, (long)6096305522275839673L, (long)var4_4);
                                try {
                                    if (var9_7 == _6d_0.c("g", (long)6093699559280730034L, (long)var4_4)) {
                                        return false;
                                    }
                                }
                                catch (MatchException v12) {
                                    throw _6d_0.a(v12);
                                }
                                var10_8 = _6d_0.c("W", (Object)var2_2, (long)6101743672531692957L, (long)var4_4);
                                try {
                                    try {
                                        v13 = var10_8;
                                        v14 = _6d_0.c("g", (long)6101483967205508974L, (long)var4_4);
                                        v15 = var8_6;
                                        if (var4_4 <= 0L) ** GOTO lbl90
                                        if (v15 != null) break block46;
                                        if (v13 != v14) {
                                        }
                                        ** GOTO lbl137
                                    }
                                    catch (MatchException v16) {
                                        throw _6d_0.a(v16);
                                    }
                                    v13 = var10_8;
                                    v14 = _6d_0.c("g", (long)6097084611860461901L, (long)var4_4);
                                }
                                catch (MatchException v17) {
                                    throw _6d_0.a(v17);
                                }
                            }
                            try {
                                try {
                                    v15 = var8_6;
lbl90:
                                    // 2 sources

                                    if (var4_4 < 0L) ** GOTO lbl106
                                    if (v15 != null) break block47;
                                    if (v13 != v14) {
                                    }
                                    ** GOTO lbl137
                                }
                                catch (MatchException v18) {
                                    throw _6d_0.a(v18);
                                }
                                v13 = var10_8;
                                v14 = _6d_0.c("g", (long)6100264115558559133L, (long)var4_4);
                            }
                            catch (MatchException v19) {
                                throw _6d_0.a(v19);
                            }
                        }
                        try {
                            try {
                                v15 = var8_6;
lbl106:
                                // 2 sources

                                if (var4_4 <= 0L) ** GOTO lbl123
                                if (v15 != null) break block48;
                                if (v13 != v14) {
                                }
                                ** GOTO lbl137
                            }
                            catch (MatchException v20) {
                                throw _6d_0.a(v20);
                            }
                            v13 = var10_8;
                            v14 = _6d_0.c("g", (long)6101223916804607507L, (long)var4_4);
                        }
                        catch (MatchException v21) {
                            throw _6d_0.a(v21);
                        }
                    }
                    try {
                        try {
                            if (var4_4 <= 0L) break block49;
                            v15 = var8_6;
lbl123:
                            // 2 sources

                            if (v15 != null) break block49;
                            if (v13 != v14) {
                            }
                            ** GOTO lbl137
                        }
                        catch (MatchException v22) {
                            throw _6d_0.a(v22);
                        }
                        v13 = var10_8;
                        v14 = _6d_0.c("g", (long)6098044728984512236L, (long)var4_4);
                    }
                    catch (MatchException v23) {
                        throw _6d_0.a(v23);
                    }
                }
                try {
                    if (v13 != v14) break block50;
lbl137:
                    // 5 sources

                    v24 = true;
                    break block51;
                }
                catch (MatchException v25) {
                    throw _6d_0.a(v25);
                }
            }
            v24 = false;
        }
        return v24;
    }

    private Boolean cfr_renamed_6(long l2) {
        Object object;
        block6: {
            block8: {
                block7: {
                    long l3 = (l2 = b ^ l2) ^ 0x6A6F3AF922E0L;
                    String string = _8h.cfr_renamed_4();
                    try {
                        try {
                            try {
                                object = _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, -1205239711422206592L, (long)l2), (long)l3, -1190094225911354086L, (long)l2);
                                if (string != null) break block6;
                                if (object != false) break block7;
                            }
                            catch (MatchException matchException) {
                                throw _6d_0.a(matchException);
                            }
                            object = _6d_0.c("W", (Object)_6d_0.c("q", (Object)this, -1191333222952984928L, (long)l2), (long)l3, -1190094225911354086L, (long)l2);
                            if (string != null) break block6;
                        }
                        catch (MatchException matchException) {
                            throw _6d_0.a(matchException);
                        }
                        if (object == false) break block8;
                    }
                    catch (MatchException matchException) {
                        throw _6d_0.a(matchException);
                    }
                }
                object = true;
                break block6;
            }
            object = false;
        }
        return _6d_0.c("E", (boolean)object, -1193310370631817109L, (long)l2);
    }

    /*
     * Exception decompiling
     */
    private _8B dev_krypton_8B_5(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
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

    private void cfr_renamed_8(byte by, int n, int n2, class_2818 class_28182) {
        long l2 = ((long)by << 56 | (long)n << 32 >>> 8 | (long)n2 << 40 >>> 40) ^ b;
        long l3 = l2 ^ 0x1E12AEF5247L;
        Object[] objectArray = new Object[2];
        objectArray[1] = class_28182;
        objectArray[0] = l3;
        _6d_0.c("W", (Object)this, (Object)objectArray, -1662051553993031925L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_6d_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_6d_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

