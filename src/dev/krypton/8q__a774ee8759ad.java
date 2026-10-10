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

import dev.krypton._4t;
import dev.krypton._7V;
import dev.krypton._87;
import dev.krypton._8B;
import dev.krypton._8w_0;
import dev.krypton._9M;
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

/*
 * Renamed from dev.krypton.8q
 */
public class _8q_0
extends _8w_0 {
    private static final int cfr_renamed_1;
    private static final int cfr_renamed_4;
    private static final int cfr_renamed_3;
    private final _7V cfr_renamed_9;
    private float cfr_renamed_102;
    private static final long b;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long[] i;
    private static final Integer[] j;
    private static final Map k;
    private static final Object[] n;
    private static final String[] o;

    @Override
    protected void void_1(Object[] objectArray) {
        String string;
        CallSite callSite;
        CallSite callSite2;
        long l2;
        long l3;
        long l4;
        _87 var4_3;
        block7: {
            block6: {
                int n = (Integer)objectArray[0];
                var4_3 = (_87)objectArray[1];
                int n2 = (Integer)objectArray[2];
                int n3 = (Integer)objectArray[3];
                int n4 = (Integer)objectArray[4];
                int n5 = (Integer)objectArray[5];
                float f = ((Float)objectArray[6]).floatValue();
                long l5 = l4 = (long)n << 32 | (long)n3 << 48 >>> 32 | (long)n4 << 48 >>> 48;
                long l6 = l5 ^ 0x159D131BAEEL;
                l3 = l5 ^ 0x901D5C84E10L;
                l2 = l5 ^ 0x6664CBA7CDA8L;
                long l7 = l5 ^ 0x558E0BA3126BL;
                long l8 = l5 ^ 0x419B738138B5L;
                Object[] objectArray2 = new Object[3];
                objectArray2[2] = 1;
                objectArray2[1] = (int)_8q_0.c("l", 24637, (long)(0x79543A3B8ED98B2AL ^ l4));
                objectArray2[0] = l7;
                callSite2 = _8q_0.e("R", (Object)objectArray2, -780309118466986619L, (long)l4);
                CallSite callSite3 = _8q_0.c("l", 11291, (long)(0x3C091014B7D24720L ^ l4));
                reference var24_17 = _8q_0.e("Y", (Object)this, -781387462728014432L, (long)l4) + _8q_0.c("l", 25344, (long)(0x63C4E1AE3FA6083CL ^ l4));
                boolean bl = _8w_0.cfr_renamed_4();
                reference var25_19 = _8q_0.e("Y", (Object)this, -779713750145762603L, (long)l4) + 3;
                try {
                    try {
                        Object[] objectArray3 = new Object[6];
                        objectArray3[5] = callSite2;
                        objectArray3[4] = (double)callSite3;
                        objectArray3[3] = (double)(var25_19 + 3);
                        objectArray3[2] = (double)(var24_17 + true);
                        objectArray3[1] = _8q_0.a("p", 3746, (long)(0x69FDAE68895327FDL ^ l4));
                        objectArray3[0] = l6;
                        _8q_0.e("\u00d0", (Object)var4_3, (Object)objectArray3, -783054103401062320L, (long)l4);
                        if (_8q_0.e("\u00d0", (Object)_8q_0.e("t", -783547378142481526L, (long)l4), (long)l8, -781374396544556812L, (long)l4) == false) break block6;
                        callSite = _8q_0.e("t", -783083360802256275L, (long)l4);
                        if (bl) break block7;
                    }
                    catch (MatchException matchException) {
                        throw _8q_0.a(matchException);
                    }
                    if (callSite == null) break block6;
                }
                catch (MatchException matchException) {
                    throw _8q_0.a(matchException);
                }
                callSite = _8q_0.e("t", -783083360802256275L, (long)l4);
                break block7;
            }
            callSite = _8q_0.e("t", -781588330594616708L, (long)l4);
        }
        CallSite callSite4 = callSite;
        CallSite callSite5 = _8q_0.a("p", 9214, (long)(0x68FE59C2A8D18AA3L ^ l4));
        reference var28_22 = _8q_0.e("Y", (Object)this, -781387462728014432L, (long)l4) + _8q_0.c("l", 28609, (long)(0x3DFBC6A6307784D7L ^ l4));
        reference var29_23 = _8q_0.e("Y", (Object)this, -779713750145762603L, (long)l4) + _8q_0.c("l", 25344, (long)(0x63C4E1AE3FA6083CL ^ l4));
        try {
            string = _8q_0.e("Y", (Object)this, -780942111854707460L, (long)l4) != false ? "-" : "+";
        }
        catch (MatchException matchException) {
            throw _8q_0.a(matchException);
        }
        String string2 = string;
        reference var31_25 = _8q_0.e("Y", (Object)this, -781387462728014432L, (long)l4) + _8q_0.e("Y", (Object)this, -783262767475468625L, (long)l4) - _8q_0.c("l", 28790, (long)(0x138DED2992B99B77L ^ l4));
        Object[] objectArray4 = new Object[3];
        objectArray4[2] = () -> _8q_0.cfr_renamed_7(var4_3, l3, (String)((Object)callSite5), (int)var28_22, (int)var29_23, (_8B)((Object)callSite2), string2, (int)var31_25);
        objectArray4[1] = callSite4;
        objectArray4[0] = l2;
        _8q_0.e("\u00d0", (Object)var4_3, (Object)objectArray4, -782681569664320206L, (long)l4);
    }

    /*
     * WARNING - void declaration
     */
    private void cfr_renamed_5(long l2) {
        Object object;
        CallSite callSite;
        boolean bl;
        long l3;
        long l4;
        block12: {
            block13: {
                long l5 = l2 = b ^ l2;
                long l6 = l5 ^ 0x230AF2CA0532L;
                l4 = l5 ^ 0x19A76F1DBFD2L;
                l3 = l5 ^ 0x50B781D013CDL;
                bl = _8w_0.cfr_renamed_4();
                Object[] objectArray = new Object[1];
                objectArray[0] = l6;
                callSite = _8q_0.e("\u00d0", (Object)_8q_0.e("\u00d0", (Object)_8q_0.e("\u00d0", (Object)_8q_0.e("Y", (Object)this, 3079432504226311778L, (long)l2), (Object)objectArray, 3080305720967719582L, (long)l2), 3080418708981629254L, (long)l2), (Object)" ", (Object)"", 3077830335805227592L, (long)l2);
                try {
                    object = _8q_0.e("\u00d0", (Object)callSite, 3080155216694046600L, (long)l2);
                    if (bl) break block12;
                    if (object == false) break block13;
                }
                catch (MatchException matchException) {
                    throw _8q_0.a(matchException);
                }
                CallSite callSite2 = _8q_0.e("\u00d0", (Object)_8q_0.e("Y", (Object)this, 3077729177399591898L, (long)l2), 3077035959602721902L, (long)l2);
                while (_8q_0.e("\u00d0", (Object)callSite2, 3076262135970321457L, (long)l2) != false) {
                    _4t callSite3 = (_4t)((Object)_8q_0.e("\u00d0", (Object)callSite2, 3079069825350715102L, (long)l2));
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = false;
                    objectArray2[0] = l3;
                    _8q_0.e("\u00d0", (Object)callSite3, (Object)objectArray2, 3078607616262392401L, (long)l2);
                    if (!bl) continue;
                }
                return;
            }
            object = false;
        }
        CallSite callSite2 = object;
        CallSite callSite3 = _8q_0.e("\u00d0", (Object)_8q_0.e("Y", (Object)this, 3077729177399591898L, (long)l2), 3077035959602721902L, (long)l2);
        block9: while (true) {
            Object object2 = _8q_0.e("\u00d0", (Object)callSite3, 3076262135970321457L, (long)l2);
            while (object2 != false) {
                Object object3;
                block17: {
                    void var11_9;
                    _4t t;
                    block16: {
                        block14: {
                            block15: {
                                t = (_4t)((Object)_8q_0.e("\u00d0", (Object)callSite3, 3079069825350715102L, (long)l2));
                                try {
                                    try {
                                        object2 = bl;
                                        if (l2 <= 0L) break block14;
                                        if (object2 != false) break block15;
                                        if (var11_9 < _8q_0.c("l", 20307, (long)(0x566E9C09EC6AFBDDL ^ l2))) break block16;
                                    }
                                    catch (MatchException matchException) {
                                        throw _8q_0.a(matchException);
                                    }
                                    Object[] objectArray = new Object[2];
                                    objectArray[1] = false;
                                    objectArray[0] = l3;
                                    _8q_0.e("\u00d0", (Object)t, (Object)objectArray, 3078607616262392401L, (long)l2);
                                }
                                catch (MatchException matchException) {
                                    throw _8q_0.a(matchException);
                                }
                            }
                            object2 = bl;
                        }
                        if (l2 < 0L) continue;
                        if (object2 == false) continue block9;
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l4;
                    CallSite callSite4 = _8q_0.e("\u00d0", (Object)_8q_0.e("\u00d0", (Object)_8q_0.e("\u00d0", (Object)_8q_0.e("Y", (Object)t, 3078013793886468942L, (long)l2), (Object)objectArray, 3078742566606001457L, (long)l2), 3080418708981629254L, (long)l2), (Object)" ", (Object)"", 3077830335805227592L, (long)l2);
                    CallSite callSite5 = _8q_0.e("\u00d0", (Object)callSite4, (Object)callSite, 3076718543567632593L, (long)l2);
                    try {
                        Object[] objectArray3 = new Object[2];
                        objectArray3[1] = (boolean)callSite5;
                        objectArray3[0] = l3;
                        _8q_0.e("\u00d0", (Object)t, (Object)objectArray3, 3078607616262392401L, (long)l2);
                        object3 = callSite5;
                        if (l2 < 0L) break block17;
                        if (object3 != false) {
                            ++var11_9;
                        }
                    }
                    catch (MatchException matchException) {
                        throw _8q_0.a(matchException);
                    }
                    object3 = bl;
                }
                if (object3 == false) continue block9;
            }
            if (l2 >= 0L) break;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void cfr_renamed_456(Object[] var1_1) {
        block33: {
            block34: {
                block35: {
                    block32: {
                        block37: {
                            block39: {
                                block38: {
                                    block36: {
                                        var3_2 = (class_11909)var1_1[0];
                                        var2_3 = (Boolean)var1_1[1];
                                        var4_4 = (Long)var1_1[2];
                                        v0 = var4_4;
                                        var6_5 = v0 ^ 6002468997594L;
                                        var8_6 = v0 ^ 0L;
                                        var10_7 = v0 ^ 60020336613426L;
                                        var12_8 = v0 ^ 38244742994164L;
                                        var14_9 = v0 ^ 80765114430243L;
                                        var16_10 = _8w_0.cfr_renamed_4();
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            v1 = this;
                                                            if (var16_10) break block32;
                                                            if (_8q_0.e("Y", (Object)v1, (long)7372880459392233348L, (long)var4_4) != false) {
                                                            }
                                                            ** GOTO lbl133
                                                        }
                                                        catch (MatchException v2) {
                                                            throw _8q_0.a(v2);
                                                        }
                                                        v1 = this;
                                                        if (var16_10) break block32;
                                                    }
                                                    catch (MatchException v3) {
                                                        throw _8q_0.a(v3);
                                                    }
                                                    if (var4_4 < 0L) break block32;
                                                    v4 = new Object[3];
                                                    v4[2] = (double)_8q_0.e("\u00d0", (Object)var3_2, (long)7375886929746300203L, (long)var4_4);
                                                    v4[1] = (double)_8q_0.e("\u00d0", (Object)var3_2, (long)7373582165463142238L, (long)var4_4);
                                                    v4[0] = var10_7;
                                                    if (_8q_0.e("\u00d0", (Object)v1, (Object)v4, (long)7372635770385793532L, (long)var4_4) != false) {
                                                    }
                                                    ** GOTO lbl133
                                                }
                                                catch (MatchException v5) {
                                                    throw _8q_0.a(v5);
                                                }
                                                v6 = new Object[2];
                                                v6[1] = var14_9;
                                                v6[0] = true;
                                                _8q_0.e("\u00d0", (Object)_8q_0.e("Y", (Object)this, (long)7373643780314964618L, (long)var4_4), (Object)v6, (long)7374122151273580329L, (long)var4_4);
                                                if (var4_4 <= 0L) break block33;
                                                v7 = this;
                                                if (var16_10) break block34;
                                            }
                                            catch (MatchException v8) {
                                                throw _8q_0.a(v8);
                                            }
                                            v9 = new Object[1];
                                            v9[0] = var6_5;
                                            if (_8q_0.e("\u00d0", (Object)_8q_0.e("\u00d0", (Object)_8q_0.e("Y", (Object)v7, (long)7373643780314964618L, (long)var4_4), (Object)v9, (long)7374459417726559862L, (long)var4_4), (long)7374308655813829472L, (long)var4_4) != false) break block35;
                                        }
                                        catch (MatchException v10) {
                                            throw _8q_0.a(v10);
                                        }
                                        var17_11 = _8q_0.e("Y", (Object)this, (long)7376833249531180760L, (long)var4_4) + _8q_0.e("Y", (Object)this, (long)7375058176421021143L, (long)var4_4);
                                        var18_12 = _8q_0.e("Y", (Object)this, (long)7374033637713209773L, (long)var4_4) + _8q_0.c("l", (int)27182, (long)(1202169643667526214L ^ var4_4)) + 4;
                                        var19_13 = _8q_0.e("Y", (Object)this, (long)7374033637713209773L, (long)var4_4) + _8q_0.c("l", (int)27182, (long)(1202169643667526214L ^ var4_4)) + _8q_0.c("l", (int)16013, (long)(5101251738148095739L ^ var4_4)) - 4;
                                        var20_14 = _8q_0.c("l", (int)26790, (long)(8440415547127107812L ^ var4_4));
                                        var21_15 = var17_11 - var20_14 - _8q_0.c("l", (int)6061, (long)(4072810852090867679L ^ var4_4));
                                        var22_16 = var18_12 + (var19_13 - var18_12) / 2 - var20_14 / 2;
                                        try {
                                            try {
                                                cfr_temp_0 = _8q_0.e("\u00d0", (Object)var3_2, (long)7373582165463142238L, (long)var4_4) - (double)var21_15;
                                                v11 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                                v12 = var16_10;
                                                if (var4_4 > 0L) {
                                                    if (v12) break block36;
                                                    if (v11 < 0) break block37;
                                                }
                                                ** GOTO lbl89
                                            }
                                            catch (MatchException v13) {
                                                throw _8q_0.a(v13);
                                            }
                                            cfr_temp_1 = _8q_0.e("\u00d0", (Object)var3_2, (long)7373582165463142238L, (long)var4_4) - (double)(var21_15 + var20_14);
                                            v11 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                                        }
                                        catch (MatchException v14) {
                                            throw _8q_0.a(v14);
                                        }
                                    }
                                    try {
                                        try {
                                            v12 = var16_10;
lbl89:
                                            // 2 sources

                                            if (var4_4 > 0L) {
                                                if (v12) break block38;
                                                if (v11 > 0) break block37;
                                            }
                                            ** GOTO lbl106
                                        }
                                        catch (MatchException v15) {
                                            throw _8q_0.a(v15);
                                        }
                                        cfr_temp_2 = _8q_0.e("\u00d0", (Object)var3_2, (long)7375886929746300203L, (long)var4_4) - (double)var22_16;
                                        v11 = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 > 0 ? 1 : -1);
                                    }
                                    catch (MatchException v16) {
                                        throw _8q_0.a(v16);
                                    }
                                }
                                try {
                                    try {
                                        if (var4_4 < 0L) break block39;
                                        v12 = var16_10;
lbl106:
                                        // 2 sources

                                        if (v12) break block39;
                                        if (v11 < 0) break block37;
                                    }
                                    catch (MatchException v17) {
                                        throw _8q_0.a(v17);
                                    }
                                    cfr_temp_3 = _8q_0.e("\u00d0", (Object)var3_2, (long)7375886929746300203L, (long)var4_4) - (double)(var22_16 + var20_14);
                                    v11 = cfr_temp_3 == 0 ? 0 : (cfr_temp_3 < 0 ? -1 : 1);
                                }
                                catch (MatchException v18) {
                                    throw _8q_0.a(v18);
                                }
                            }
                            try {
                                if (var4_4 > 0L) {
                                    if (v11 <= 0) {
                                        v19 = new Object[1];
                                        v19[0] = var12_8;
                                        _8q_0.e("\u00d0", (Object)_8q_0.e("Y", (Object)this, (long)7373643780314964618L, (long)var4_4), (Object)v19, (long)7375656213223519568L, (long)var4_4);
                                        return;
                                    }
                                }
                                ** GOTO lbl132
                            }
                            catch (MatchException v20) {
                                throw _8q_0.a(v20);
                            }
                        }
                        try {
                            v11 = (reference)var16_10;
lbl132:
                            // 2 sources

                            if (v11 == false) break block35;
lbl133:
                            // 3 sources

                            v1 = this;
                        }
                        catch (MatchException v21) {
                            throw _8q_0.a(v21);
                        }
                    }
                    v22 = new Object[2];
                    v22[1] = var14_9;
                    v22[0] = false;
                    _8q_0.e("\u00d0", (Object)_8q_0.e("Y", (Object)v1, (long)7373643780314964618L, (long)var4_4), (Object)v22, (long)7374122151273580329L, (long)var4_4);
                }
                v7 = this;
            }
            v23 = new Object[3];
            v23[2] = var8_6;
            v23[1] = var2_3;
            v23[0] = var3_2;
            super.cfr_renamed_456(v23);
        }
    }

    public void cfr_renamed_341(Object[] objectArray) {
        block21: {
            char c;
            boolean bl;
            long l2;
            long l3;
            class_11905 class_119052;
            block20: {
                class_119052 = (class_11905)objectArray[0];
                l3 = (Long)objectArray[1];
                long l4 = l3 = b ^ l3;
                long l5 = l4 ^ 0x619FBD554205L;
                l2 = l4 ^ 0x66D7E21DFCL;
                bl = _8w_0.cfr_renamed_4();
                try {
                    try {
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l5;
                        c = _8q_0.e("\u00d0", (Object)_8q_0.e("Y", (Object)this, -2420285204519085385L, (long)l3), (Object)objectArray2, -2421478896769129069L, (long)l3);
                        if (bl) break block20;
                        if (c == false) break block21;
                    }
                    catch (MatchException matchException) {
                        throw _8q_0.a(matchException);
                    }
                    c = (char)_8q_0.e("\u00d0", (Object)class_119052, -2418792055213599876L, (long)l3);
                }
                catch (MatchException matchException) {
                    throw _8q_0.a(matchException);
                }
            }
            CallSite callSite = c;
            try {
                CallSite callSite2;
                block22: {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                callSite2 = _8q_0.e("R", (char)callSite, -2419765830345280593L, (long)l3);
                                                if (bl) break block21;
                                                if (callSite2 != false) break block22;
                                            }
                                            catch (MatchException matchException) {
                                                throw _8q_0.a(matchException);
                                            }
                                            callSite2 = callSite;
                                            if (bl) break block21;
                                        }
                                        catch (MatchException matchException) {
                                            throw _8q_0.a(matchException);
                                        }
                                        if (l3 <= 0L) break block21;
                                        if (callSite2 == _8q_0.c("l", 28626, (long)(0x1A5098EB10A7AF97L ^ l3))) break block22;
                                    }
                                    catch (MatchException matchException) {
                                        throw _8q_0.a(matchException);
                                    }
                                    callSite2 = callSite;
                                    if (bl) break block21;
                                }
                                catch (MatchException matchException) {
                                    throw _8q_0.a(matchException);
                                }
                                if (l3 <= 0L) break block21;
                                if (callSite2 == _8q_0.c("l", 3091, (long)(0x7C42C645F6CC4C45L ^ l3))) break block22;
                            }
                            catch (MatchException matchException) {
                                throw _8q_0.a(matchException);
                            }
                            callSite2 = callSite;
                            if (bl) break block21;
                        }
                        catch (MatchException matchException) {
                            throw _8q_0.a(matchException);
                        }
                        if (callSite2 != _8q_0.c("l", 21997, (long)(0x3A17A7EF805B15BCL ^ l3))) break block21;
                    }
                    catch (MatchException matchException) {
                        throw _8q_0.a(matchException);
                    }
                }
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = class_119052;
                objectArray3[0] = l2;
                callSite2 = _8q_0.e("\u00d0", (Object)_8q_0.e("Y", (Object)this, -2420285204519085385L, (long)l3), (Object)objectArray3, -2418861172187091997L, (long)l3);
            }
            catch (MatchException matchException) {
                throw _8q_0.a(matchException);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void cfr_renamed_388(Object[] var1_1) {
        block56: {
            block61: {
                block62: {
                    block60: {
                        block59: {
                            block58: {
                                block57: {
                                    block55: {
                                        block54: {
                                            block52: {
                                                block51: {
                                                    block50: {
                                                        block49: {
                                                            block48: {
                                                                block47: {
                                                                    block46: {
                                                                        var2_2 = (_87)var1_1[0];
                                                                        var7_3 = (Integer)var1_1[1];
                                                                        var3_4 = (Integer)var1_1[2];
                                                                        var5_5 = (Long)var1_1[3];
                                                                        var4_6 = ((Float)var1_1[4]).floatValue();
                                                                        v0 = var5_5 = _8q_0.b ^ var5_5;
                                                                        var8_7 = v0 ^ 98344429968870L;
                                                                        var10_8 = v0 ^ 97423114592517L;
                                                                        var12_9 = v0 ^ 28737298027842L;
                                                                        var14_10 = v0 ^ 124340229309538L;
                                                                        var16_11 = v0 ^ 57705773787478L;
                                                                        var18_12 = v0 ^ 29461903689514L;
                                                                        var20_13 = v0 ^ 23341180526863L;
                                                                        var22_14 = v0 ^ 87867725590560L;
                                                                        var24_15 = v0 ^ 102690030448459L;
                                                                        var26_16 = v0 ^ 126682714367796L;
                                                                        var28_17 = v0 ^ 42910397361668L;
                                                                        var30_18 = v0 ^ 122742772219306L;
                                                                        var32_19 = v0 ^ 61962361780330L;
                                                                        var34_20 = v0 ^ 65376344118575L;
                                                                        var36_21 = v0 ^ 67183152049718L;
                                                                        var38_22 = v0 ^ 118147828713249L;
                                                                        var40_23 = v0 ^ 50936665803738L;
                                                                        var42_24 = v0 ^ 106103037430331L;
                                                                        var44_25 = v0 ^ 45729444838833L;
                                                                        var46_26 = v0 ^ 107804456782861L;
                                                                        var49_27 = _8q_0.e("Y", (Object)this, (long)8244270685450763665L, (long)var5_5) + _8q_0.c("l", (int)31602, (long)(4882816514660341523L ^ var5_5));
                                                                        v1 = new Object[1];
                                                                        v1[0] = var28_17;
                                                                        var50_28 = _8q_0.e("\u00d0", (Object)_8q_0.e("Y", (Object)this, (long)8243889658495841974L, (long)var5_5), (Object)v1, (long)8242831263985043858L, (long)var5_5);
                                                                        var48_29 = _8w_0.cfr_renamed_4();
                                                                        v2 = new Object[1];
                                                                        v2[0] = var8_7;
                                                                        var51_30 = _8q_0.e("\u00d0", (Object)_8q_0.e("Y", (Object)this, (long)8243889658495841974L, (long)var5_5), (Object)v2, (long)8244696465381274186L, (long)var5_5);
                                                                        try {
                                                                            v3 = var50_28 != false ? 1.0f : 0.0f;
                                                                        }
                                                                        catch (MatchException v4) {
                                                                            throw _8q_0.a(v4);
                                                                        }
                                                                        var52_31 = v3;
                                                                        v5 = new Object[4];
                                                                        v5[3] = (double)var52_31;
                                                                        v5[2] = (double)_8q_0.e("Y", (Object)this, (long)8245771217405833627L, (long)var5_5);
                                                                        v5[1] = Float.valueOf(var4_6 * 0.2f);
                                                                        v5[0] = var24_15;
                                                                        _8q_0.e("\u00dd", (Object)this, (float)((float)_8q_0.e("R", (Object)v5, (long)8244939038374662015L, (long)var5_5)), (long)8245771217405833627L, (long)var5_5);
                                                                        v6 = new Object[3];
                                                                        v6[2] = 1;
                                                                        v6[1] = (int)_8q_0.c("l", (int)24637, (long)(8742705960658537582L ^ var5_5));
                                                                        v6[0] = var34_20;
                                                                        var53_32 = _8q_0.e("R", (Object)v6, (long)8245991988053240513L, (long)var5_5);
                                                                        var54_33 = _8q_0.e("Y", (Object)this, (long)8242601916236866276L, (long)var5_5);
                                                                        var55_34 = var49_27 + 4;
                                                                        var56_35 = _8q_0.e("Y", (Object)this, (long)8242601916236866276L, (long)var5_5) + _8q_0.e("Y", (Object)this, (long)8243034628193145323L, (long)var5_5);
                                                                        var57_36 = var49_27 + _8q_0.c("l", (int)11787, (long)(6080007758525579863L ^ var5_5)) - 4;
                                                                        try {
                                                                            v7 = var50_28 != false ? new _8B((int)_8q_0.c("l", (int)15319, (long)(8675317245638530983L ^ var5_5)), (int)_8q_0.c("l", (int)29689, (long)(8398322093692985242L ^ var5_5)), var22_14, (int)_8q_0.c("l", (int)27182, (long)(1202086098278778490L ^ var5_5)), (int)_8q_0.c("l", (int)2053, (long)(4067730555896816713L ^ var5_5))) : new _8B((int)_8q_0.c("l", (int)19560, (long)(110363918454824995L ^ var5_5)), (int)_8q_0.c("l", (int)18522, (long)(4597738353017725993L ^ var5_5)), var22_14, (int)_8q_0.c("l", (int)9559, (long)(4118559058026514710L ^ var5_5)), (int)_8q_0.c("l", (int)179, (long)(4499780520469327093L ^ var5_5)));
                                                                        }
                                                                        catch (MatchException v8) {
                                                                            throw _8q_0.a(v8);
                                                                        }
                                                                        var58_37 = v7;
                                                                        try {
                                                                            if (var50_28 == false) break block46;
                                                                            v9 = new Object[1];
                                                                            v9[0] = var46_26;
                                                                            v10 = new Object[1];
                                                                            v10[0] = var32_19;
                                                                            v11 = new Object[1];
                                                                            v11[0] = var18_12;
                                                                            v12 = new _8B((int)_8q_0.e("\u00d0", (Object)var53_32, (Object)v9, (long)8245195235470774397L, (long)var5_5), (int)_8q_0.e("\u00d0", (Object)var53_32, (Object)v10, (long)8243630758825007003L, (long)var5_5), var22_14, (int)_8q_0.e("\u00d0", (Object)var53_32, (Object)v11, (long)8245676057290637041L, (long)var5_5), (int)_8q_0.c("l", (int)22586, (long)(6723998275977655384L ^ var5_5)));
                                                                            break block47;
                                                                        }
                                                                        catch (MatchException v13) {
                                                                            throw _8q_0.a(v13);
                                                                        }
                                                                    }
                                                                    v12 = new _8B((int)_8q_0.c("l", (int)24637, (long)(8742705960658537582L ^ var5_5)), (int)_8q_0.c("l", (int)24637, (long)(8742705960658537582L ^ var5_5)), var22_14, (int)_8q_0.c("l", (int)24637, (long)(8742705960658537582L ^ var5_5)), (int)_8q_0.c("l", (int)19839, (long)(5388968038748987702L ^ var5_5)));
                                                                }
                                                                var59_38 = v12;
                                                                try {
                                                                    if (var50_28 == false) break block48;
                                                                    v14 = new Object[1];
                                                                    v14[0] = var46_26;
                                                                    v15 = new Object[1];
                                                                    v15[0] = var32_19;
                                                                    v16 = new Object[1];
                                                                    v16[0] = var18_12;
                                                                    v17 = new _8B((int)_8q_0.e("\u00d0", (Object)var53_32, (Object)v14, (long)8245195235470774397L, (long)var5_5), (int)_8q_0.e("\u00d0", (Object)var53_32, (Object)v15, (long)8243630758825007003L, (long)var5_5), var22_14, (int)_8q_0.e("\u00d0", (Object)var53_32, (Object)v16, (long)8245676057290637041L, (long)var5_5), (int)_8q_0.c("l", (int)7285, (long)(6224554296734511148L ^ var5_5)));
                                                                    break block49;
                                                                }
                                                                catch (MatchException v18) {
                                                                    throw _8q_0.a(v18);
                                                                }
                                                            }
                                                            v17 = new _8B((int)_8q_0.c("l", (int)24637, (long)(8742705960658537582L ^ var5_5)), (int)_8q_0.c("l", (int)24637, (long)(8742705960658537582L ^ var5_5)), var22_14, (int)_8q_0.c("l", (int)24637, (long)(8742705960658537582L ^ var5_5)), (int)_8q_0.c("l", (int)30092, (long)(5816584019740727799L ^ var5_5)));
                                                        }
                                                        var60_39 = v17;
                                                        v19 = new Object[1];
                                                        v19[0] = var38_22;
                                                        _8q_0.e("\u00d0", (Object)_8q_0.e("t", (long)8244186054099516027L, (long)var5_5), (Object)v19, (long)8242668415078421201L, (long)var5_5);
                                                        v20 = new Object[1];
                                                        v20[0] = var26_16;
                                                        v21 = new Object[1];
                                                        v21[0] = var14_10;
                                                        _8q_0.e("\u00d0", (Object)_8q_0.e("R", (Object)v20, (long)8244054484800491384L, (long)var5_5), (Object)v21, (long)8242249972256331811L, (long)var5_5);
                                                        v22 = new Object[14];
                                                        v22[13] = false;
                                                        v22[12] = 1.5;
                                                        v22[11] = var40_23;
                                                        v22[10] = var60_39;
                                                        v22[9] = var59_38;
                                                        v22[8] = var58_37;
                                                        v22[7] = 6.0;
                                                        v22[6] = 6.0;
                                                        v22[5] = 6.0;
                                                        v22[4] = 6.0;
                                                        v22[3] = (double)var57_36;
                                                        v22[2] = (double)var56_35;
                                                        v22[1] = (double)var55_34;
                                                        v22[0] = (double)var54_33;
                                                        _8q_0.e("R", (Object)v22, (long)8242963787558072611L, (long)var5_5);
                                                        v23 = new Object[1];
                                                        v23[0] = var26_16;
                                                        v24 = new Object[1];
                                                        v24[0] = var12_9;
                                                        _8q_0.e("\u00d0", (Object)_8q_0.e("R", (Object)v23, (long)8244054484800491384L, (long)var5_5), (Object)v24, (long)8243420907925136031L, (long)var5_5);
                                                        v25 = new Object[1];
                                                        v25[0] = var42_24;
                                                        _8q_0.e("\u00d0", (Object)_8q_0.e("t", (long)8244186054099516027L, (long)var5_5), (Object)v25, (long)8244028385956962544L, (long)var5_5);
                                                        var61_40 = _8q_0.c("l", (int)18522, (long)(4597738353017725993L ^ var5_5));
                                                        var62_41 = var54_33 + _8q_0.c("l", (int)13604, (long)(5973286847110961516L ^ var5_5));
                                                        var63_42 = var55_34 + (var57_36 - var55_34) / 2 - var61_40 / 2;
                                                        try {
                                                            if (var50_28 == false) break block50;
                                                            v26 = new Object[1];
                                                            v26[0] = var46_26;
                                                            v27 = new Object[1];
                                                            v27[0] = var32_19;
                                                            v28 = new Object[1];
                                                            v28[0] = var18_12;
                                                            v29 = new _8B((int)_8q_0.e("\u00d0", (Object)var53_32, (Object)v26, (long)8245195235470774397L, (long)var5_5), (int)_8q_0.e("\u00d0", (Object)var53_32, (Object)v27, (long)8243630758825007003L, (long)var5_5), var22_14, (int)_8q_0.e("\u00d0", (Object)var53_32, (Object)v28, (long)8245676057290637041L, (long)var5_5), (int)_8q_0.c("l", (int)16022, (long)(4403208207294091968L ^ var5_5)));
                                                            break block51;
                                                        }
                                                        catch (MatchException v30) {
                                                            throw _8q_0.a(v30);
                                                        }
                                                    }
                                                    v29 = new _8B((int)_8q_0.c("l", (int)14536, (long)(123242296776676541L ^ var5_5)), (int)_8q_0.c("l", (int)6296, (long)(78660938696881368L ^ var5_5)), var22_14, (int)_8q_0.c("l", (int)25952, (long)(3442360361327167769L ^ var5_5)), (int)_8q_0.c("l", (int)4919, (long)(5920967906191343437L ^ var5_5)));
                                                }
                                                var64_43 = v29;
                                                v31 = new Object[6];
                                                v31[5] = var64_43;
                                                v31[4] = (double)var61_40;
                                                v31[3] = (double)var63_42;
                                                v31[2] = (double)var62_41;
                                                v31[1] = _8q_0.a("p", (int)8287, (long)(2822264661124910663L ^ var5_5));
                                                v31[0] = var30_18;
                                                _8q_0.e("\u00d0", (Object)var2_2, (Object)v31, (long)8243388912999442196L, (long)var5_5);
                                                var65_44 = var62_41 + var61_40 + _8q_0.c("l", (int)22473, (long)(401263618481404862L ^ var5_5));
                                                var66_45 = var55_34 + (var57_36 - var55_34) / 2 - _8q_0.c("l", (int)28740, (long)(482376808099683356L ^ var5_5));
                                                try {
                                                    v32 /* !! */  = _8q_0.e("\u00d0", (Object)var51_30, (long)8244563295592724316L, (long)var5_5);
                                                    if (var5_5 < 0L || var48_29) break block52;
                                                    if (v32 /* !! */  != false) {
                                                    }
                                                    ** GOTO lbl226
                                                }
                                                catch (MatchException v33) {
                                                    throw _8q_0.a(v33);
                                                }
                                                v32 /* !! */  = var50_28;
                                            }
                                            try {
                                                block53: {
                                                    try {
                                                        if (var5_5 > 0L) {
                                                            if (v32 /* !! */  != false) break block53;
                                                            v34 = new Object[5];
                                                            v34[4] = new _8B((int)_8q_0.c("l", (int)1966, (long)(2196047843229297633L ^ var5_5)), (int)_8q_0.c("l", (int)3872, (long)(2687759562350224214L ^ var5_5)), var22_14, (int)_8q_0.c("l", (int)8344, (long)(7505103804346846442L ^ var5_5)), (int)_8q_0.c("l", (int)20136, (long)(3326124318966260471L ^ var5_5)));
                                                            v34[3] = (double)var66_45;
                                                            v34[2] = (double)var65_44;
                                                            v34[1] = _8q_0.a("p", (int)12722, (long)(6540443381762793384L ^ var5_5));
                                                            v34[0] = var20_13;
                                                            _8q_0.e("\u00d0", (Object)var2_2, (Object)v34, (long)8244677192932925446L, (long)var5_5);
                                                            v32 /* !! */  = (CallSite)var48_29;
                                                        }
                                                        if (var5_5 > 0L) {
                                                            if (v32 /* !! */  == false) break block54;
                                                        }
                                                        ** GOTO lbl242
                                                    }
                                                    catch (MatchException v35) {
                                                        throw _8q_0.a(v35);
                                                    }
                                                }
                                                v36 = new Object[4];
                                                v36[3] = (double)var66_45;
                                                v36[2] = (double)var65_44;
                                                v36[1] = var2_2;
                                                v36[0] = var10_8;
                                                _8q_0.e("\u00d0", (Object)_8q_0.e("Y", (Object)this, (long)8243889658495841974L, (long)var5_5), (Object)v36, (long)8244801430621636709L, (long)var5_5);
                                            }
                                            catch (MatchException v37) {
                                                throw _8q_0.a(v37);
                                            }
                                        }
                                        try {
                                            v32 /* !! */  = _8q_0.e("\u00d0", (Object)var51_30, (long)8244563295592724316L, (long)var5_5);
lbl242:
                                            // 2 sources

                                            if (var48_29) break block55;
                                            if (v32 /* !! */  != false) break block56;
                                        }
                                        catch (MatchException v38) {
                                            throw _8q_0.a(v38);
                                        }
                                        v32 /* !! */  = _8q_0.c("l", (int)19296, (long)(8337822340450985790L ^ var5_5));
                                    }
                                    var67_46 = v32 /* !! */ ;
                                    var68_47 = var56_35 - var67_46 - _8q_0.c("l", (int)6061, (long)(4072903194150403043L ^ var5_5));
                                    var69_48 = var55_34 + (var57_36 - var55_34) / 2 - var67_46 / 2;
                                    try {
                                        try {
                                            v39 = var7_3;
                                            v40 = var68_47;
                                            v41 = var48_29;
                                            if (var5_5 < 0L) ** GOTO lbl273
                                            if (v41) break block57;
                                            if (v39 >= v40) {
                                            }
                                            ** GOTO lbl-1000
                                        }
                                        catch (MatchException v42) {
                                            throw _8q_0.a(v42);
                                        }
                                        v39 = var7_3;
                                        v40 = var68_47 + var67_46;
                                    }
                                    catch (MatchException v43) {
                                        throw _8q_0.a(v43);
                                    }
                                }
                                try {
                                    try {
                                        v41 = var48_29;
lbl273:
                                        // 2 sources

                                        if (var5_5 <= 0L) ** GOTO lbl290
                                        if (v41) break block58;
                                        if (v39 <= v40) {
                                        }
                                        ** GOTO lbl-1000
                                    }
                                    catch (MatchException v44) {
                                        throw _8q_0.a(v44);
                                    }
                                    v39 = var3_4;
                                    v40 = var69_48;
                                }
                                catch (MatchException v45) {
                                    throw _8q_0.a(v45);
                                }
                            }
                            try {
                                try {
                                    try {
                                        v41 = var48_29;
lbl290:
                                        // 2 sources

                                        if (v41) break block59;
                                        if (v39 >= v40) {
                                        }
                                        ** GOTO lbl-1000
                                    }
                                    catch (MatchException v46) {
                                        throw _8q_0.a(v46);
                                    }
                                    v39 = var3_4;
                                    if (var48_29) break block60;
                                }
                                catch (MatchException v47) {
                                    throw _8q_0.a(v47);
                                }
                                v40 = var69_48 + var67_46;
                            }
                            catch (MatchException v48) {
                                throw _8q_0.a(v48);
                            }
                        }
                        if (v39 <= v40) {
                            v39 = 1;
                        } else lbl-1000:
                        // 4 sources

                        {
                            v39 = 0;
                        }
                    }
                    var70_49 = v39;
                    try {
                        try {
                            v49 = var70_49;
                            if (var5_5 < 0L || var48_29) break block61;
                            if (v49 == 0) break block62;
                        }
                        catch (MatchException v50) {
                            throw _8q_0.a(v50);
                        }
                        v51 = new Object[10];
                        v51[9] = 4.0;
                        v51[8] = 4.0;
                        v51[7] = 4.0;
                        v51[6] = 4.0;
                        v51[5] = var36_21;
                        v51[4] = (double)(var69_48 + var67_46 + 2);
                        v51[3] = (double)(var68_47 + var67_46 + 2);
                        v51[2] = (double)(var69_48 - 2);
                        v51[1] = (double)(var68_47 - 2);
                        v51[0] = new _8B((int)_8q_0.c("l", (int)24637, (long)(8742705960658537582L ^ var5_5)), (int)_8q_0.c("l", (int)3872, (long)(2687759562350224214L ^ var5_5)), var22_14, (int)_8q_0.c("l", (int)3872, (long)(2687759562350224214L ^ var5_5)), (int)_8q_0.c("l", (int)13488, (long)(6263482665382631671L ^ var5_5)));
                        _8q_0.e("\u00d0", (Object)var2_2, (Object)v51, (long)8245330164931600345L, (long)var5_5);
                    }
                    catch (MatchException v52) {
                        throw _8q_0.a(v52);
                    }
                }
                v49 = var70_49;
            }
            try {
                v53 = v49 != 0 ? new _8B((int)_8q_0.c("l", (int)24637, (long)(8742705960658537582L ^ var5_5)), var44_25, (int)_8q_0.c("l", (int)6296, (long)(78660938696881368L ^ var5_5)), (int)_8q_0.c("l", (int)6296, (long)(78660938696881368L ^ var5_5))) : new _8B((int)_8q_0.c("l", (int)27075, (long)(7935197924818781592L ^ var5_5)), (int)_8q_0.c("l", (int)23313, (long)(2510467059321517888L ^ var5_5)), var22_14, (int)_8q_0.c("l", (int)7415, (long)(4425500699716153478L ^ var5_5)), (int)_8q_0.c("l", (int)30854, (long)(6138161443303593210L ^ var5_5)));
            }
            catch (MatchException v54) {
                throw _8q_0.a(v54);
            }
            var71_50 = v53;
            v55 = new Object[2];
            v55[1] = var16_11;
            v55[0] = "x";
            var72_51 = _8q_0.e("\u00d0", (Object)var2_2, (Object)v55, (long)8241862814267376893L, (long)var5_5);
            v56 = new Object[5];
            v56[4] = var71_50;
            v56[3] = (double)var69_48;
            v56[2] = (double)var68_47 + (double)var67_46 / 2.0 - var72_51 / 2.0;
            v56[1] = "x";
            v56[0] = var20_13;
            _8q_0.e("\u00d0", (Object)var2_2, (Object)v56, (long)8244677192932925446L, (long)var5_5);
        }
    }

    public _8q_0(int n, long l2, int n2, int n3, _9M m) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x2FEA8FFD886CL;
        long l5 = l3 ^ 0x3674D93F0FD4L;
        long l6 = l3 ^ 0x40C0CF7DF4FEL;
        int n4 = (int)(l6 >>> 32);
        int n5 = (int)(l6 << 32 >>> 40);
        int n6 = (int)(l6 << 56 >>> 56);
        long l7 = l3 ^ 0x60D9CB880440L;
        long l8 = l3 ^ 0x3B79B9FEB9F7L;
        super(l5, n, n2, n3, m);
        this.cfr_renamed_9 = new _7V("", n4, n5, (byte)n6, (int)_8q_0.c("l", 1475, (long)(0x1548D54564619061L ^ l2)));
        _8q_0.e("\u00dd", (Object)this, 0.0f, -8387403650927785876L, (long)l2);
        Object[] objectArray = new Object[2];
        objectArray[1] = () -> this.cfr_renamed_5(l7);
        objectArray[0] = l4;
        _8q_0.e("\u00d0", (Object)_8q_0.e("Y", (Object)this, -8385979455317291199L, (long)l2), (Object)objectArray, -8388631304662716667L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l8;
        _8q_0.e("\u00d0", (Object)this, (Object)objectArray2, -8385991094837583260L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        _8q_0.b = l.a(4517240427915976747L, 6789135219068267132L, MethodHandles.lookup().lookupClass()).a(167149589274265L);
                        _8q_0.n = new Object[124];
                        _8q_0.o = new String[124];
                        _8q_0.b();
                        _8q_0.e = new HashMap<K, V>(13);
                        var11 = _8q_0.b ^ 110524637450448L;
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
                        var20_3 = new String[4];
                        var18_4 = 0;
                        var17_5 = "\u00a6\u00f1\u001e\u0090\u00daT\u00f6\u00bd\u00d2y?\u00fak\u009aL\u00f5([\u0017\u00a0\u00e30\u00f8>\u0093\u00bf\u00bf\u00dfUTK\u009c\u00ce\u00ca\u00b7\u00d2\u00dc\u00c4\u00c1}\u009e<^\u00af\u00d5\u00da\u0086}a\u0007\u00fa\u009bT\u00be\u00eb\u001d\u00ec";
                        var19_6 = "\u00a6\u00f1\u001e\u0090\u00daT\u00f6\u00bd\u00d2y?\u00fak\u009aL\u00f5([\u0017\u00a0\u00e30\u00f8>\u0093\u00bf\u00bf\u00dfUTK\u009c\u00ce\u00ca\u00b7\u00d2\u00dc\u00c4\u00c1}\u009e<^\u00af\u00d5\u00da\u0086}a\u0007\u00fa\u009bT\u00be\u00eb\u001d\u00ec".length();
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
                            var20_3[var18_4++] = _8q_0.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00d3\u00bdwB\u00ec\u00f3P&\u001cU\u0000\r\u00b9\u00e0\b\u00f1(\u00db\u000f\u00f6\u009c;\u00b9\u009c\rH\u00e4\u00aeh2\u00e7\u00fb\rn\u00e6!\u00a5\u00b9\u0000\u00f4\u00f2\u009e\u0005\u0095RA\u00e5Y\u00ba\u00e6\u00ce\nz;Z\u0088\u00e0";
                            var19_6 = "\u00d3\u00bdwB\u00ec\u00f3P&\u001cU\u0000\r\u00b9\u00e0\b\u00f1(\u00db\u000f\u00f6\u009c;\u00b9\u009c\rH\u00e4\u00aeh2\u00e7\u00fb\rn\u00e6!\u00a5\u00b9\u0000\u00f4\u00f2\u009e\u0005\u0095RA\u00e5Y\u00ba\u00e6\u00ce\nz;Z\u0088\u00e0".length();
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
                            var20_3[var18_4++] = _8q_0.a(var21_9).intern();
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
                _8q_0.c = var20_3;
                _8q_0.d = new String[4];
                _8q_0.k = new HashMap<K, V>(13);
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
                var6_12 = new long[51];
                var3_13 = 0;
                var4_14 = "\u00bfUe\u00c0\u00b3\u00e1/\u00a5\u000b\u0017Ta3\u0084\u00e5\u00d8\u00b9;$\u00a0\f\u00b3\u00a8\u0014p\u00a7hd\u00bf\u009b,\u00fch\u00a4\u009a\u00ee\u0007\u00c9\u00ed\u00d0\u0091\u00ea\u00f2\u00b4\u000bk\u00cd\u0015\u00ce\u007f\u00c9k\u0087\u00d7\u00de\u00cf\u00a2\u00fd^\u009c\u0083\u0091jwY\u0014\u009f\u00c3\rT\u00d7\u00a8\u00ae\u0006[\u00926\u0095\u0004=!\u00cc;\u001e\u00e8y\u0093\u0081S\u00f1\u0083D\u0012\u00baOR\u00d8CF\u00ech\u00da\u009dH\u00d4\u00e0l\u001d\u00b3\n`[j\u008f6\u009d\u00c2\u00d9+\u00d6\u00f2\u00c7#\u00a4J\u00e6\u0084\u00b5c\u00bbT|\u0097Wa\u00b9\u00dfs\u0014\u000e\u0016\u00c0\u00e5\u00e1>\u00f0\u00d4h\u00dc\u00a6\u00a2\u00a9\u00dd\u00ef\u00a5\u0001\u0003!8\u00b7\u008a\u001c\u001a\u0087y\b\u00fc\u00c2\u0000\u00ba\u00cd@ZM\u0000\u0016\u0097wM\u00eb\u0096\u00ba\u0017\u001b\u00f6+\u00b7\u00e7u\u00b8e\\%E\tZ\u00bd\u00a7\u00cbXPe\u00ba\u00c50q\u00b3C\u00eb\u00c6\u0096\u0002\u000b\u00f0\u0019\u00f1o\u009d[\u00cb,\u00e8j\u00b2T\u000f)\u00f5w\u00f6\u0017I\u0092\u00f7\u0001H\u00c0Uc\u00ed\u00cf\u0087\u00bc\u00c8/\u00af\u009e\u00c2\n*F\u00d7\u0080\u0099/G8\u008d\u00c0M\u0001\u0088,\u008f\u0087\u008aLL\u00f5Q6h\u00ba^>\u00a8\u00bd\\p\u00efG\u00bd\u0089\bs\u0010\u009d\r\u00a0\u0082\u00fa\u00cc'\u00c2\u0004j\u008f\u009f\u00e4N\u00c20M\u0019!e\u009c\u00a2\u0003\u00f6c\u00e7\u00b4\u00be\u00c6V\u00ac\u00d5\u001ba\u00a8\u00b4\u00b6Q\u00e7\u00e8\u00ce\u00c66r\u00be\u00a9)\r\u009b.\u00b8\u00a5\u0092\u009en\u0099\u00c6\u00be`\u00eb}\"Qba\u00bfC\u00e55\rG\u00a9\u0016\u0095P\u0080\u00a5\u00c8{\u00de\\\u00f8!*\u0006\u0091\u008b\u00bd\u001f`>\u00acJp\u00eesDT,8\u0098\u008d\u0091\u001f\u0018\u00e8";
                var5_15 = "\u00bfUe\u00c0\u00b3\u00e1/\u00a5\u000b\u0017Ta3\u0084\u00e5\u00d8\u00b9;$\u00a0\f\u00b3\u00a8\u0014p\u00a7hd\u00bf\u009b,\u00fch\u00a4\u009a\u00ee\u0007\u00c9\u00ed\u00d0\u0091\u00ea\u00f2\u00b4\u000bk\u00cd\u0015\u00ce\u007f\u00c9k\u0087\u00d7\u00de\u00cf\u00a2\u00fd^\u009c\u0083\u0091jwY\u0014\u009f\u00c3\rT\u00d7\u00a8\u00ae\u0006[\u00926\u0095\u0004=!\u00cc;\u001e\u00e8y\u0093\u0081S\u00f1\u0083D\u0012\u00baOR\u00d8CF\u00ech\u00da\u009dH\u00d4\u00e0l\u001d\u00b3\n`[j\u008f6\u009d\u00c2\u00d9+\u00d6\u00f2\u00c7#\u00a4J\u00e6\u0084\u00b5c\u00bbT|\u0097Wa\u00b9\u00dfs\u0014\u000e\u0016\u00c0\u00e5\u00e1>\u00f0\u00d4h\u00dc\u00a6\u00a2\u00a9\u00dd\u00ef\u00a5\u0001\u0003!8\u00b7\u008a\u001c\u001a\u0087y\b\u00fc\u00c2\u0000\u00ba\u00cd@ZM\u0000\u0016\u0097wM\u00eb\u0096\u00ba\u0017\u001b\u00f6+\u00b7\u00e7u\u00b8e\\%E\tZ\u00bd\u00a7\u00cbXPe\u00ba\u00c50q\u00b3C\u00eb\u00c6\u0096\u0002\u000b\u00f0\u0019\u00f1o\u009d[\u00cb,\u00e8j\u00b2T\u000f)\u00f5w\u00f6\u0017I\u0092\u00f7\u0001H\u00c0Uc\u00ed\u00cf\u0087\u00bc\u00c8/\u00af\u009e\u00c2\n*F\u00d7\u0080\u0099/G8\u008d\u00c0M\u0001\u0088,\u008f\u0087\u008aLL\u00f5Q6h\u00ba^>\u00a8\u00bd\\p\u00efG\u00bd\u0089\bs\u0010\u009d\r\u00a0\u0082\u00fa\u00cc'\u00c2\u0004j\u008f\u009f\u00e4N\u00c20M\u0019!e\u009c\u00a2\u0003\u00f6c\u00e7\u00b4\u00be\u00c6V\u00ac\u00d5\u001ba\u00a8\u00b4\u00b6Q\u00e7\u00e8\u00ce\u00c66r\u00be\u00a9)\r\u009b.\u00b8\u00a5\u0092\u009en\u0099\u00c6\u00be`\u00eb}\"Qba\u00bfC\u00e55\rG\u00a9\u0016\u0095P\u0080\u00a5\u00c8{\u00de\\\u00f8!*\u0006\u0091\u008b\u00bd\u001f`>\u00acJp\u00eesDT,8\u0098\u008d\u0091\u001f\u0018\u00e8".length();
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
                    var4_14 = "\u0003\u00ec\u000b\"\u0096\r\\\u0003S\u0093\u009c\u00c2\f\u00d2Vq";
                    var5_15 = "\u0003\u00ec\u000b\"\u0096\r\\\u0003S\u0093\u009c\u00c2\f\u00d2Vq".length();
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
        _8q_0.i = var6_12;
        _8q_0.j = new Integer[51];
        _8q_0.cfr_renamed_1 = (int)_8q_0.c("l", (int)13249, (long)(var11 ^ 4075661241965975633L));
        _8q_0.cfr_renamed_3 = (int)_8q_0.c("l", (int)18225, (long)(var11 ^ 2422900776953539713L));
        _8q_0.cfr_renamed_4 = (int)_8q_0.c("l", (int)14753, (long)(var11 ^ 4770365207798911534L));
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8q" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (o[n3] != null) {
            return n3;
        }
        Object object = _8q_0.n[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 31;
            case 1 -> 8;
            case 2 -> 40;
            case 3 -> 7;
            case 4 -> 6;
            case 5 -> 36;
            case 6 -> 33;
            case 7 -> 49;
            case 8 -> 12;
            case 9 -> 27;
            case 10 -> 41;
            case 11 -> 35;
            case 12 -> 63;
            case 13 -> 29;
            case 14 -> 45;
            case 15 -> 11;
            case 16 -> 30;
            case 17 -> 60;
            case 18 -> 13;
            case 19 -> 25;
            case 20 -> 54;
            case 21 -> 43;
            case 22 -> 52;
            case 23 -> 4;
            case 24 -> 61;
            case 25 -> 42;
            case 26 -> 39;
            case 27 -> 17;
            case 28 -> 1;
            case 29 -> 47;
            case 30 -> 28;
            case 31 -> 18;
            case 32 -> 34;
            case 33 -> 9;
            case 34 -> 24;
            case 35 -> 37;
            case 36 -> 55;
            case 37 -> 0;
            case 38 -> 21;
            case 39 -> 15;
            case 40 -> 50;
            case 41 -> 53;
            case 42 -> 32;
            case 43 -> 59;
            case 44 -> 22;
            case 45 -> 20;
            case 46 -> 51;
            case 47 -> 58;
            case 48 -> 23;
            case 49 -> 48;
            case 50 -> 46;
            case 51 -> 19;
            case 52 -> 2;
            case 53 -> 38;
            case 54 -> 44;
            case 55 -> 56;
            case 56 -> 3;
            case 57 -> 14;
            case 58 -> 26;
            case 59 -> 62;
            case 60 -> 57;
            case 61 -> 16;
            case 62 -> 10;
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
        _8q_0.o[n3] = new String(cArray);
        return n3;
    }

    @Override
    public void void_9(Object[] objectArray) {
        block5: {
            _8q_0 q_0;
            long l2;
            float f;
            int n;
            long l3;
            int n2;
            _87 var2_2;
            block4: {
                var2_2 = (_87)objectArray[0];
                n2 = (Integer)objectArray[1];
                l3 = (Long)objectArray[2];
                n = (Integer)objectArray[3];
                f = ((Float)objectArray[4]).floatValue();
                long l4 = l3;
                l2 = l4 ^ 0x65D57C1578B4L;
                long l5 = l4 ^ 0L;
                boolean bl = _8w_0.cfr_renamed_5();
                try {
                    try {
                        Object[] objectArray2 = new Object[5];
                        objectArray2[4] = Float.valueOf(f);
                        objectArray2[3] = n;
                        objectArray2[2] = l5;
                        objectArray2[1] = n2;
                        objectArray2[0] = var2_2;
                        super.void_9(objectArray2);
                        q_0 = this;
                        if (!bl) break block4;
                        if (_8q_0.e("Y", (Object)q_0, -5784115953346353553L, (long)l3) == false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _8q_0.a(matchException);
                    }
                    q_0 = this;
                }
                catch (MatchException matchException) {
                    throw _8q_0.a(matchException);
                }
            }
            Object[] objectArray3 = new Object[5];
            objectArray3[4] = Float.valueOf(f);
            objectArray3[3] = l2;
            objectArray3[2] = n;
            objectArray3[1] = n2;
            objectArray3[0] = var2_2;
            _8q_0.e("\u00d0", (Object)q_0, (Object)objectArray3, -5785121095320388651L, (long)l3);
        }
    }

    private static void b() {
        Object[] objectArray = n;
        n[0] = "\fwmnWh\u0011bo/R4Q[";
        objectArray[1] = ",=\u001eIn(Y\u001d\u0015F\u007fg8\u0013\u001eM{=L";
        objectArray[2] = "\u0017\u0014XJUL\n\u0001Z\u000bP\u0010K3";
        objectArray[3] = "\u001a\u0004[cc1\u0007\u0011Y\"fmM/";
        objectArray[4] = "*Pc\u001a}]7Ea[x\u0001vD";
        objectArray[5] = Float.TYPE;
        _8q_0.o[5] = "java/lang/Float";
        objectArray[6] = "=\u0018d^$VH8oQ5\u0019)6dZ1C]";
        objectArray[7] = Integer.TYPE;
        _8q_0.o[7] = "java/lang/Integer";
        objectArray[8] = "\u0012*%z\u001eg\u000f?';\u001b;N8";
        objectArray[9] = "\u0011\u00036C0g\f\u00164\u00025;MQ";
        objectArray[10] = "\u001f(HB\\Aj\bCMM\u000e\u000b\u0006HFIT\u007f";
        objectArray[11] = Void.TYPE;
        _8q_0.o[11] = "java/lang/Void";
        objectArray[12] = "+#\u0005I?O66\u0007\b:\u0013\u007f\u0003";
        objectArray[13] = "<p>\u001b\u001c\u000eIP5\u0014\rA(^>\u001f\t\u001b\\";
        objectArray[14] = "vqPF\n.\u0003Q[I\u001bab_PB\u001f;\u0016";
        objectArray[15] = "GGI\t\u0017I2gB\u0006\u0006\u0006SiI\r\u0002\\'";
        objectArray[16] = "lvL\f\\\"\u0019VG\u0003MmxXL\bI7\f";
        objectArray[17] = "]\b ;\"^@\u001d\"z'\u0002\u000e;";
        objectArray[18] = "jD\u0017\u001aDR\u001fd\u001c\u0015U\u001d~j\u0017\u001eQG\n";
        objectArray[19] = Boolean.TYPE;
        _8q_0.o[19] = "java/lang/Boolean";
        objectArray[20] = "\u001f\r#\u0015zh\u0002\u0018!T\u007f4BP";
        objectArray[21] = "R[x\u00020d'{s\r!+Fux\u0006%q2";
        objectArray[22] = "nt_2\u001c\u0011\u001bTT=\r^zZ_6\t\u0004\u000e";
        objectArray[23] = Double.TYPE;
        _8q_0.o[23] = "java/lang/Double";
        objectArray[24] = "\u0000C>\u001d_&uc5\u0012Ni\u0014m>\u0019J3`";
        objectArray[25] = "cO_*\u0015\u0011h@Neh\t{GG,";
        objectArray[26] = "fU\u0012\rz\u0017\u0013u\u0019\u0002kXr{\u0012\to\u0002\u0006";
        objectArray[27] = "4RDSNyArO\\_6 |DW[lT";
        objectArray[28] = "*g\\$,x7r^e)$zS";
        objectArray[29] = "6o8|6\u0005CO3s'J\"A8x#\u0010V";
        objectArray[30] = "An.\u0014:<4N%\u001b+sU@.\u0010/)!";
        objectArray[31] = "p}T\u00075w\u0005]_\b$8dST\u0003 b\u0010";
        objectArray[32] = "@kf3\u001f;5Km<\u000etTEf7\n. ";
        objectArray[33] = "\u007fH\fC\u0011$\nh\u0007L\u0000kkf\fG\u00041\u001f";
        objectArray[34] = "\u0007q={pa\u001ad?:u=W`";
        objectArray[35] = "\u0005\u0004O?9\u0007p$D0(H\u0011*O;,\u0012e";
        objectArray[36] = "q`^>\u0018}ohDqzahu";
        objectArray[37] = "\u0019%?:\u0013\u0002\u0007-%ut\u0003\u00166(/R\u0005";
        objectArray[38] = "\u0012f05rV\u000fs2tw\nF1";
        objectArray[39] = "a;,\u0011|^\u0014\u001b'\u001em\u0011u\u0015,\u0015iK\u0001";
        objectArray[40] = "\u0003\u0007\u0007]&?\b\b\u0016\u0012G1\u0003\u0003\u0012H";
        objectArray[41] = "H3\u00020@-U&\u0000qEq\u001e";
        objectArray[42] = "R(H\u0004p\u0010'\bC\u000ba_F\u0006H\u0000e\u00052";
        objectArray[43] = "\\B\b9\u0001cAW\nx\u0004?\u000e\u0012";
        objectArray[44] = "Vi\u001c-<sK|\u001el9/\u000b~";
        objectArray[45] = "H\u0010pV\n1U\u0005r\u0017\u000fm\u001c=";
        objectArray[46] = "1hq4#I,}su&\u0015eL";
        objectArray[47] = "z\t]6.,g\u001c_w+p-=";
        objectArray[48] = Long.TYPE;
        _8q_0.o[48] = "java/lang/Long";
        objectArray[49] = "6\u0001\u007flO7C!tc^x\"/\u007fhZ\"V";
        objectArray[50] = "\u0013\f\u007f@!\u0013f,tO0\\\u0007\"\u007fD4\u0006s";
        objectArray[51] = "(~:\r\u000bx]^1\u0002\u001a7<P:\t\u001emH";
        objectArray[52] = ">\u0014g\rbpK4l\u0002s?*:g\twe^";
        objectArray[53] = "uc\u0011bg\"hv\u0013#b~'~";
        objectArray[54] = "H+\u0015;\u001de=\u000b\u001e4\f*\\\u0005\u0015?\bp(";
        objectArray[55] = "'jeq\u0007h,et>jl,y@uXq(epu";
        objectArray[56] = "xuFor\t\rUM`cFl[Fkg\u001c\u0018";
        objectArray[57] = "$Dz&\foQdq)\u001d 0jz\"\u0019zD";
        objectArray[58] = "|\u001c$e'@|\u001c39+OfW3'+Za&azs\u0019+";
        objectArray[59] = "ao)]kR\u0014O\"Rz\u001duA)Y~G\u0001";
        objectArray[60] = "xGH\u0011a[\rgC\u001ep\u0014liH\u0015tN\u0018";
        objectArray[61] = "382\u0011\u007f\u0015F\u00189\u001enZ'\u00162\u0015j\u0000S";
        objectArray[62] = "\u0010\u001fJI\u007f)e?AFnf\u00041JMj<p";
        objectArray[63] = "A`*\u0005ikA`=Yed[+=Geq\\Zo\u001a=2\u001a";
        objectArray[64] = "\u0002!8\\\u0015{\t.)\u0013x\u007f\t2/^Or\u001a";
        objectArray[65] = Character.TYPE;
        _8q_0.o[65] = "java/lang/Character";
        objectArray[66] = "#nu5Q3~gr7owd^2)\u00032~n4o\u0003$";
        objectArray[67] = "8\u0012\u00117\u0001&?D\u0013\"hd\u0001M\u0015jQ39\u001dA;\u0015:\u0001IK8\u000en\u007fJU`\u0004^";
        objectArray[68] = "?>0,U/6\u007fs51;*45RJf!%/=C8:{I";
        objectArray[69] = "jiJ\u007f&u8{GjV6\u0001<\u00165oj9lBd+c\u0001iRi0?~{N9&\u0007";
        objectArray[70] = "c\u000e\u001aR6\u00047C[\u0005cc1V\u0006\u0014]_e\u0000Xl7\u00029WS\u00124\u001ca]c";
        objectArray[71] = "?\u001fKq\u0019\n<\u001fF\u000e\u001b5d\u001e\u00077J\r4JVsC5dG\rbNMc\u0011\u000fw'";
        objectArray[72] = "^>O\u0012`\u0019Y0F\u0015\u0002\u001f#,Q@:I\u0019cPE<%O'Y\u001f:Z];\t\t\u0002";
        objectArray[73] = "\n\u0010e`\u00060X\u0002huvzaE9*O/Y\u0015m{\u000b&a\u0010}v\u0010z\u001e\u0002a&\u0006B";
        objectArray[74] = "7sFVn>0%DC\u0007v\u000e,B\u000b>+6|\u0016Zz\"\u000e(\u001cYavp+\u0002\u0001kF";
        objectArray[75] = "\u0011\u001d~,\tXL\u0014y.7\u001c*\u0014=x\u000eK\u0012Di)JB*Ay$Q\u001eUSetG&";
        objectArray[76] = "QV[a\u001c\nVW\u0004a&M\f9\u00051\u0017K\u0002\u0001UeF\u000f\u000b9\u0003\u007fYL\t]Xc[\u0013o";
        objectArray[77] = "'yVJ}d*y\tP\u001fc@y\r\u0000&4x)YQb=@\u007fCN!?$$_L~Y";
        objectArray[78] = "\u001fG(&&vSI|gT>\"Tj;2?]Fvk$";
        objectArray[79] = "\u000e?=W\u000fy\u000fbr\r\u0017\t\u0006\u0007u\n\\0Z?%^\rtS\u0007,T\tpX~p\n\u000227";
        objectArray[80] = "S:G\u0016C\u001e\u0001(J\u00033T8o\u001b\\\n\u0001\u0000?O\rN\b8iU\u0012\r\n\\2I\u0010Rl";
        objectArray[81] = "\r#eX<,Yux\r#GUh@[.;YiCL\u001e&[rx6kvZux\u000b6)U(v6><Yu<I, \tc\u0004";
        objectArray[82] = "\u001dK3oM#\u001aJlowg#\u001dk1N6\u001bM?`\n?#K68\u00156OM>m\u001e[";
        objectArray[83] = "]>\u000br\u001be\u0001`\u00000t}F\u0012\ns\bm=3\u0014f\u0012$B!\b6\u0004\u001c";
        objectArray[84] = "#b!Z;\u0010qp,OKYH7}\u0010r\u000fpg)A6\u0006H13^u\u0004,j/\\*b";
        objectArray[85] = ">W\u0003(\u0016XlE\u000e=f\u0011U\u0002_b_GmR\u000b3\u001bNU[\u00017\u001fE,\u0007_<]*";
        objectArray[86] = "gE2@_\u0013?\u001dkIcC\u0005\u001ai\u0001Z\u0017=J=P\u001e\u001e\u0005L4\b\u0001\u0017iJ<]\nz";
        objectArray[87] = "Y\u0007]\nV7\u0005YVH92^\"^\fT4r\u000fB\u001e9.X\u0002@\u001c@r\u0006\t\u0002s";
        objectArray[88] = "\u0015?_\u001e\"bS:\u001eW*\u001eGdD_\u0013\"\u00132\u0011'+|\u0014aLK-tAj!";
        objectArray[89] = "F3T\u0018cb\u001b:S\u001a]#}hD\u001e&l\u000f:V\u00133";
        objectArray[90] = "oZ\u001d*\r\u001f;D\u0005gnA_\u0004]gW\u0017gT\t6\u0013\u001e_\r\u0005)\u0012\u0019:Y\u001b1_z";
        objectArray[91] = "U0@#MZTe\tuqSob\u0007.H\u0007W2S\u007f\f\u000eodI`O\f\u000b?Ub\u0010j";
        objectArray[92] = "\u0014\u000b/]g_\u0003K&L\u0006\u0004oBa\u0006?RW\u00125W{[o\u00029KbD\u0017\u001f4[g?";
        objectArray[93] = "\u007f%:rCT~ps$\u007fTEt)6CXuu|\u007f\u0015";
        objectArray[94] = "P\u0014\u001a(dA\u001c\u001aNi\u0016\t(k\u001ag'\t\u0000SJ3vM\tk\u001c)i\u000e\u000b\u000fG5kQm";
        objectArray[95] = "7\u0011`+`\u0013{\u001f4j\u0012R\nS88tRtP&`~";
        objectArray[96] = "v<5\u0002\u0016\u0014q=j\u0002,\\Hjm\\\u0015\u0001p:9\rQ\bHl#\u0012\u0012\n,7?\u0010Ml";
        objectArray[97] = "Cg4kbBFx'hROWoHqi@Ze'x7[\u0004\u0003$q?@\u0003|6moV;";
        objectArray[98] = "l1>\r\r00o5Ob\"k6&\u001d\u0003/wPcN\u001a r1bD\u0007,wP6\u000f\u000f/4/$\u0013_9\f";
        objectArray[99] = "k\b5vz<?\u0016-;\u0019e[Vu; 4c\u0006!jd=[P;u'??\u000b'wxY";
        objectArray[100] = "\n}L2O8\r+N'&q3\"Ho\u001f-\u000br\u001c>[$3&\u0016=@pM%\beJ@";
        objectArray[101] = "4P\u0004p@\u001a3Q[pz[2?Z K[g\u0007\nt\u001a\u001fn?\\n\u0005\\l[\u0007r\u0007\u0003\n";
        objectArray[102] = "\u0019\rrhh\u0006K\u001f\u007f}\u0018D\na(,)M\u001fYxxx\t\u0016a.bgJ\u0014\u0005u~e\u0015r";
        objectArray[103] = "\u001c;\u0010!=`\u0019$\u0003\"\re\u00182\u0016)qc\u001e_\u0014:tz\u0000-\u001d{7cd";
        objectArray[104] = "(5\u0015o>Az'\u0018zN\nC`I%w^{0\u001dt3WC5\ry(\u000b<'\u0011)>3";
        objectArray[105] = "X1M=x[\u0015tJ=\u0001\u001a%pQ\u007fjF\u0019w_vm";
        objectArray[106] = "\u000ed(Vj7\u0007y|G\u000ejc<|\u000e78[l(_s1c:2@03\u0007a.BoU";
        objectArray[107] = "Z\u0012\u001a_NxG\u001f\nZ58#LY\n\fm\u001b\u001c\r[Hd#\r\u0002GT0G\b\u001dTW\u0000";
        objectArray[108] = "J~4\b0\u0000C?w\u0011T\u0012[\u007f\u000b\u001b$\u000e2h6\u001b2JMz*K$r";
        objectArray[109] = "RB;vk&\u001eLo7\u0019mP=?gz1_C<y\";";
        objectArray[110] = "Q?R\u0016Z_F\u007f[\u0007;\u0006iOX\fJUK/OLCD";
        objectArray[111] = "\u0014()<]>\u0017e\"cfujf|h\u0002\"\u0006\"z7\u001c";
        objectArray[112] = "'h#{ZWsv;69\u0002\u00176c6\u0000_/f7gDV\u00170-x\u0007Tsk1zX2";
        objectArray[113] = "mY.HlM!Wz\t\u001e\u0001P^sD\u007f\f4[lW|";
        objectArray[114] = "\u001cT\u001dkV3@\n\u0016)90\u0011M\u001d{R'|\fCjP4\u001d\rIw\\1|\fCjP4\u001d\rIw\\1|U\u0018v@%\u0005\tF}\u0002J";
        objectArray[115] = "\u0011h!\u001ca&Cz,\t\u0011hz=}V(9Bm)\u0007l0z;3\u0018/2\u001e`/\u001apT";
        objectArray[116] = ")|\f]l\u001f+{\u001a_\u000b\u0019Vd\u0006YbDjf\u0001O`";
        objectArray[117] = "\u000e$E\u0002os\u0003$\u001a\u0018\rr\u0015\u001d\u0018A|,\u000bm\u0019\u001c3v\u0013";
        objectArray[118] = "\u007fl3\u0018;E~9zN\u0007J>\u0007r\u001b6L(?\"Og\b!\u0007tUxK#c/Iz\u0014E";
        objectArray[119] = "$$H)\u0019%h*\u001chkny[L8\b2)%O&P8";
        objectArray[120] = "*/W*+\u0007w&P(\u0015HP\u001f\u0012p$@|'B$u\u0004u\u001f\u0014>jGw{O\"h\u0018\u0011";
        objectArray[121] = "\u0006\u000bx\\V?@\u000e9\u0015^CTPc\u001dg\u007f\u0000\u00067e_!\u0007Uk\tY)R^\u0006";
        objectArray[122] = "\u0017v:mz.\u0010wem@f) b3y;\u0011p6b=2)v?:\";Ep7o)V";
        Object[] objectArray2 = objectArray;
        objectArray[123] = "\u007fTPn\u001a^x\u0002R{s\u001fF\u000bT3JK~[\u0000b\u000eBF\u000b\r9\u001fO>\f[;\n&";
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _8q_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'Y' || c == '\u00dd' || c == 't' || c == '\u00e4') {
                field = _8q_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'Y' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00dd' ? lookup.findSetter(clazz, string2, clazz2) : (c == 't' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _8q_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d0' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'R' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8q" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x1E2D;
        if (j[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = i[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])k.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    k.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/8q", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _8q_0.j[n2] = n3;
        }
        return j[n2];
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

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _8q_0.c(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Method h(long l2, long l3) {
        int n = _8q_0.e(l2, l3);
        Object object = _8q_0.n[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = o[n];
                int n3 = string2.indexOf(8);
                clazz3 = _8q_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _8q_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _8q_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _8q_0.n[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _8q_0.f(2853985093552735L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _8q_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _8q_0.n[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _8q_0.f(2853985093552735L, 0L);
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
            int n = _8q_0.e(l2, l3);
            object = _8q_0.n[n];
            try {
                if (!(object instanceof String)) break block2;
                _8q_0.n[n] = clazz = Class.forName(o[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _8q_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _8q_0.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _8q_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _8q_0.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x5C67;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l3 = Thread.currentThread().threadId();
                objectArray = (Object[])e.get(l3);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l3, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/8q", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l2 >>> 56);
            for (int j = 1; j < 8; ++j) {
                byArray[j] = (byte)(l2 << j * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            _8q_0.d[n2] = _8q_0.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _8q_0.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8q" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field g(long l2, long l3) {
        int n = _8q_0.e(l2, l3);
        Object object = _8q_0.n[n];
        if (object instanceof String) {
            String string = o[n];
            int n2 = string.indexOf(8);
            Class clazz = _8q_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _8q_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _8q_0.c(clazz3, string2, clazz2)) != null) {
                    _8q_0.n[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _8q_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _8q_0.n[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _8q_0.f(2853985093552735L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean boolean_2(Object[] var1_1) {
        block20: {
            block17: {
                block19: {
                    block18: {
                        block16: {
                            var2_2 = (Long)var1_1[0];
                            var4_3 = (Double)var1_1[1];
                            var6_4 = (Double)var1_1[2];
                            var2_2 = _8q_0.b ^ var2_2;
                            var8_5 = _8w_0.cfr_renamed_5();
                            var9_6 = _8q_0.e("Y", (Object)this, (long)1946911117583783164L, (long)var2_2) + _8q_0.c("l", (int)27182, (long)(1202165561660141335L ^ var2_2));
                            try {
                                try {
                                    cfr_temp_0 = var4_3 - (double)_8q_0.e("Y", (Object)this, (long)1949710226758486921L, (long)var2_2);
                                    v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                    if (!var8_5) break block16;
                                    if (v0 <= 0) break block17;
                                }
                                catch (MatchException v1) {
                                    throw _8q_0.a(v1);
                                }
                                cfr_temp_1 = var4_3 - (double)(_8q_0.e("Y", (Object)this, (long)1949710226758486921L, (long)var2_2) + _8q_0.e("Y", (Object)this, (long)1947944864692844678L, (long)var2_2));
                                v0 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                            }
                            catch (MatchException v2) {
                                throw _8q_0.a(v2);
                            }
                        }
                        try {
                            try {
                                v3 = var8_5;
                                if (var2_2 > 0L) {
                                    if (!v3) break block18;
                                    if (v0 >= 0) break block17;
                                }
                                ** GOTO lbl42
                            }
                            catch (MatchException v4) {
                                throw _8q_0.a(v4);
                            }
                            cfr_temp_2 = var6_4 - (double)var9_6;
                            v0 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                        }
                        catch (MatchException v5) {
                            throw _8q_0.a(v5);
                        }
                    }
                    try {
                        try {
                            v3 = var8_5;
lbl42:
                            // 2 sources

                            if (var2_2 >= 0L) {
                                if (!v3) break block19;
                                if (v0 <= 0) break block17;
                            }
                            ** GOTO lbl57
                        }
                        catch (MatchException v6) {
                            throw _8q_0.a(v6);
                        }
                        cfr_temp_3 = var6_4 - (double)(var9_6 + _8q_0.c("l", (int)16013, (long)(5101255335538277290L ^ var2_2)));
                        v0 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                    }
                    catch (MatchException v7) {
                        throw _8q_0.a(v7);
                    }
                }
                try {
                    v3 = var8_5;
lbl57:
                    // 2 sources

                    if (!v3) break block20;
                    if (v0 >= 0) break block17;
                }
                catch (MatchException v8) {
                    throw _8q_0.a(v8);
                }
                v0 = (double)true;
                break block20;
            }
            v0 = (double)false;
        }
        return (boolean)v0;
    }

    @Override
    public _8B dev_krypton_8B_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        long l3 = l2 ^ 0x4C39DE8CE68DL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = n;
        objectArray2[1] = (int)_8q_0.c("l", 17659, (long)(0x7F781780398A5B2DL ^ l2));
        objectArray2[0] = l3;
        return _8q_0.e("R", (Object)objectArray2, 129990081764727139L, (long)l2);
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void cfr_renamed_409(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[DOLOOP]], but top level block is 7[SIMPLE_IF_TAKEN]
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

    @Override
    public void void_3(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2;
        long l4 = l3 ^ 0L;
        long l5 = l3 ^ 0x1DDA10A1EFF3L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        super.void_3(objectArray2);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l5;
        objectArray3[0] = true;
        _8q_0.e("\u00d0", (Object)_8q_0.e("Y", (Object)this, 4216536236625788506L, (long)l2), (Object)objectArray3, 4217183068963019769L, (long)l2);
    }

    @Override
    public int int_3(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return (int)_8q_0.c("l", 27182, (long)(0x10AEF0E3C5AB9848L ^ l2));
    }

    private static void cfr_renamed_7(_87 var0, long l2, String string, int n, int n2, _8B b, String string2, int n3) {
        long l3 = l2 = _8q_0.b ^ l2;
        long l4 = l3 ^ 0x4188CEC44D38L;
        long l5 = l3 ^ 0x1B5808905C17L;
        long l6 = l3 ^ 0x6A3D271A2F17L;
        Object[] objectArray = new Object[5];
        objectArray[4] = new _8B(0, 0, l5, 0, (int)_8q_0.c("l", 6296, (long)(0x1172106B8BB98EFL ^ l2)));
        objectArray[3] = (double)(n2 + 1);
        objectArray[2] = (double)(n + 1);
        objectArray[1] = string;
        objectArray[0] = l4;
        _8q_0.e("\u00d0", (Object)var0, (Object)objectArray, 2188096909360122929L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l6;
        Object[] objectArray3 = new Object[5];
        objectArray3[4] = _8q_0.e("\u00d0", (Object)b, (Object)objectArray2, 2186475527295928981L, (long)l2);
        objectArray3[3] = (double)n2;
        objectArray3[2] = (double)n;
        objectArray3[1] = string;
        objectArray3[0] = l4;
        _8q_0.e("\u00d0", (Object)var0, (Object)objectArray3, 2188096909360122929L, (long)l2);
        Object[] objectArray4 = new Object[5];
        objectArray4[4] = new _8B((int)_8q_0.c("l", 1475, (long)(0x1548A81D865C05A1L ^ l2)), (int)_8q_0.c("l", 1475, (long)(0x1548A81D865C05A1L ^ l2)), l5, (int)_8q_0.c("l", 1475, (long)(0x1548A81D865C05A1L ^ l2)), (int)_8q_0.c("l", 24637, (long)(0x795400725CBC6059L ^ l2)));
        objectArray4[3] = (double)n2;
        objectArray4[2] = (double)n3;
        objectArray4[1] = string2;
        objectArray4[0] = l4;
        _8q_0.e("\u00d0", (Object)var0, (Object)objectArray4, 2188096909360122929L, (long)l2);
    }

    @Override
    public void cfr_renamed_9(Object[] objectArray) {
        _8q_0 q_0;
        long l2;
        class_11908 class_119082;
        block4: {
            block5: {
                long l3 = (Long)objectArray[0];
                class_119082 = (class_11908)objectArray[1];
                long l4 = l3;
                l2 = l4 ^ 0L;
                long l5 = l4 ^ 0x2F2ACCDFFFC1L;
                long l6 = l4 ^ 0x2AA1A9A0AC20L;
                boolean bl = _8w_0.cfr_renamed_4();
                try {
                    try {
                        q_0 = this;
                        if (bl) break block4;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l5;
                        if (_8q_0.e("\u00d0", (Object)_8q_0.e("Y", (Object)q_0, 7182438605133653875L, (long)l3), (Object)objectArray2, 7179128616636258391L, (long)l3) == false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _8q_0.a(matchException);
                    }
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l6;
                    objectArray3[0] = class_119082;
                    _8q_0.e("\u00d0", (Object)_8q_0.e("Y", (Object)this, 7182438605133653875L, (long)l3), (Object)objectArray3, 7181297509590775759L, (long)l3);
                }
                catch (MatchException matchException) {
                    throw _8q_0.a(matchException);
                }
            }
            q_0 = this;
        }
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = class_119082;
        objectArray4[0] = l2;
        super.cfr_renamed_9(objectArray4);
    }

    @Override
    protected int int_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return (int)_8q_0.c("l", 13251, (long)(0x5B30913FCFE42D58L ^ l2));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_8q_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_8q_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_8q_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

