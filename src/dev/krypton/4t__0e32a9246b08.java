/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_11908
 *  net.minecraft.class_11909
 */
package dev.krypton;

import dev.krypton._0L;
import dev.krypton._0N;
import dev.krypton._0v;
import dev.krypton._4w;
import dev.krypton._6x_0;
import dev.krypton._87;
import dev.krypton._8B;
import dev.krypton._8w_0;
import dev.krypton._95;
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
import net.minecraft.class_11908;
import net.minecraft.class_11909;

public class _4t {
    private static final int cfr_renamed_218;
    private static final int cfr_renamed_6;
    private static final int cfr_renamed_157;
    private static final int cfr_renamed_219;
    private static final int cfr_renamed_220;
    private static final int cfr_renamed_221;
    private static final int cfr_renamed_8;
    private static final int cfr_renamed_222;
    private final float cfr_renamed_223;
    private final _8B cfr_renamed_9;
    private final _8B cfr_renamed_3;
    public List cfr_renamed_2;
    public _8w_0 cfr_renamed_7;
    public _6x_0 cfr_renamed_224;
    public int cfr_renamed_1;
    public boolean cfr_renamed_225;
    public int cfr_renamed_0;
    public double cfr_renamed_5;
    private float cfr_renamed_4;
    private float cfr_renamed_226;
    private boolean cfr_renamed_22;
    private float cfr_renamed_227;
    private int cfr_renamed_208;
    private static int cfr_renamed_228;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static final Object[] e;
    private static final String[] f;

    private void cfr_renamed_5(Object[] objectArray) {
        block2: {
            double d;
            long l2;
            long l3;
            long l4;
            _8B b;
            double d2;
            double d3;
            _87 var2_2;
            block3: {
                var2_2 = (_87)objectArray[0];
                d3 = (Double)objectArray[1];
                d2 = (Double)objectArray[2];
                b = (_8B)objectArray[3];
                l4 = (Long)objectArray[4];
                float f = ((Float)objectArray[5]).floatValue();
                long l5 = l4 = a ^ l4;
                l3 = l5 ^ 0x266DF60B8150L;
                long l6 = l5 ^ 0x5654315FEEDCL;
                long l7 = l5 ^ 0x74C52F82119CL;
                l2 = l5 ^ 0x21E4C15DE696L;
                long l8 = l5 ^ 0xC02A395DABBL;
                int n = _4t.cfr_renamed_9();
                d = 3.5 + 1.0 * (double)f;
                try {
                    if (n != 0) break block2;
                    if (!(f > 0.01f)) break block3;
                }
                catch (MatchException matchException) {
                    throw _4t.a(matchException);
                }
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l8;
                Object[] objectArray3 = new Object[1];
                objectArray3[0] = l6;
                Object[] objectArray4 = new Object[1];
                objectArray4[0] = l7;
                _8B b2 = new _8B((int)_4t.b("G", (Object)b, (Object)objectArray2, -6567008440763948102L, (long)l4), (int)_4t.b("G", (Object)b, (Object)objectArray3, -6568984752592044752L, (long)l4), l2, (int)_4t.b("G", (Object)b, (Object)objectArray4, -6567660932826978899L, (long)l4), (int)(70.0f * f));
                Object[] objectArray5 = new Object[5];
                objectArray5[4] = l3;
                objectArray5[3] = d + 3.5;
                objectArray5[2] = d2;
                objectArray5[1] = d3;
                objectArray5[0] = b2;
                _4t.b("G", (Object)var2_2, (Object)objectArray5, -6569256112771869211L, (long)l4);
            }
            Object[] objectArray6 = new Object[5];
            objectArray6[4] = l3;
            objectArray6[3] = d + 1.5;
            objectArray6[2] = d2;
            objectArray6[1] = d3;
            objectArray6[0] = new _8B(0, 0, l2, 0, (int)_4t.a("m", 3714, (long)(0x52DA621919E41B4AL ^ l4)));
            _4t.b("G", (Object)var2_2, (Object)objectArray6, -6569256112771869211L, (long)l4);
            Object[] objectArray7 = new Object[5];
            objectArray7[4] = l3;
            objectArray7[3] = d;
            objectArray7[2] = d2;
            objectArray7[1] = d3;
            objectArray7[0] = b;
            _4t.b("G", (Object)var2_2, (Object)objectArray7, -6569256112771869211L, (long)l4);
            Object[] objectArray8 = new Object[5];
            objectArray8[4] = l3;
            objectArray8[3] = d * 0.55;
            objectArray8[2] = d2 - d * 0.2;
            objectArray8[1] = d3;
            objectArray8[0] = new _8B((int)_4t.a("m", 10354, (long)(0x6B13E33DDD98BD9BL ^ l4)), (int)_4t.a("m", 3399, (long)(0x2F6E13CD7ECB1893L ^ l4)), l2, (int)_4t.a("m", 3399, (long)(0x2F6E13CD7ECB1893L ^ l4)), (int)_4t.a("m", 11694, (long)(0x4AA8A8574EE3B860L ^ l4)));
            _4t.b("G", (Object)var2_2, (Object)objectArray8, -6569256112771869211L, (long)l4);
        }
    }

    public void cfr_renamed_229(Object[] objectArray) {
        block9: {
            Object object;
            long l2 = (Long)objectArray[0];
            long l3 = l2 = a ^ l2;
            long l4 = l3 ^ 0x6C6CC2F0963FL;
            long l5 = l3 ^ 0x1E1B87478E8AL;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l4;
            Object object2 = _4t.b("G", (Object)_4t.b("K", (Object)this, -401908330919199773L, (long)l2), (Object)objectArray2, -405243014085341927L, (long)l2);
            CallSite callSite = _4t.b("G", (Object)_4t.b("K", (Object)this, -403511413857532526L, (long)l2), -409190928654075389L, (long)l2);
            int n = _4t.cfr_renamed_2();
            block6: while (_4t.b("G", (Object)callSite, -409303841989702590L, (long)l2) != false) {
                object = _4t.b("G", (Object)callSite, -405263934514840903L, (long)l2);
                do {
                    int n2;
                    block11: {
                        block12: {
                            Object object3;
                            block10: {
                                _0v v = (_0v)object;
                                try {
                                    try {
                                        try {
                                            object3 = n;
                                            if (l2 > 0L) {
                                                if (object3 == 0) break block9;
                                                Object[] objectArray3 = new Object[1];
                                                objectArray3[0] = l5;
                                                object3 = _4t.b("G", (Object)_4t.b("K", (Object)v, -402379484940688853L, (long)l2), (Object)objectArray3, -401306663069451306L, (long)l2);
                                            }
                                            if (n == 0) break block10;
                                        }
                                        catch (MatchException matchException) {
                                            throw _4t.a(matchException);
                                        }
                                        if (l2 <= 0L) break block11;
                                        if (object3 == 0) break block12;
                                    }
                                    catch (MatchException matchException) {
                                        throw _4t.a(matchException);
                                    }
                                    _4t.b("y", (Object)v, (int)object2, -402365598841289450L, (long)l2);
                                    Object[] objectArray4 = new Object[1];
                                    objectArray4[0] = l4;
                                    object3 = object2 + _4t.b("G", (Object)_4t.b("K", (Object)this, -401908330919199773L, (long)l2), (Object)objectArray4, -405243014085341927L, (long)l2);
                                }
                                catch (MatchException matchException) {
                                    throw _4t.a(matchException);
                                }
                            }
                            object2 = object3;
                        }
                        n2 = n;
                    }
                    if (n2 != 0) continue block6;
                    object = this;
                } while (l2 < 0L);
            }
            _4t.b("y", (Object)object, (int)object2, -408715563413082037L, (long)l2);
        }
    }

    public void cfr_renamed_230(Object[] objectArray) {
        _4t t;
        int n;
        long l2;
        long l3;
        class_11908 class_119082;
        long l4;
        block9: {
            block10: {
                l4 = (Long)objectArray[0];
                class_119082 = (class_11908)objectArray[1];
                long l5 = l4 = a ^ l4;
                l3 = l5 ^ 0x1403C55DCB5FL;
                l2 = l5 ^ 0x2BEB0F64E72CL;
                n = _4t.cfr_renamed_2();
                try {
                    try {
                        t = this;
                        if (n == 0) break block9;
                        if (_4t.b("K", (Object)t, -4646241934401450836L, (long)l4) != false) break block10;
                    }
                    catch (MatchException matchException) {
                        throw _4t.a(matchException);
                    }
                    return;
                }
                catch (MatchException matchException) {
                    throw _4t.a(matchException);
                }
            }
            t = this;
        }
        CallSite callSite = _4t.b("G", (Object)_4t.b("K", (Object)t, -4633224791800774585L, (long)l4), -4645664101868453930L, (long)l4);
        while (_4t.b("G", (Object)callSite, -4646353296735729257L, (long)l4) != false) {
            Object object;
            block12: {
                block13: {
                    _0v v;
                    block11: {
                        _0v v2 = (_0v)((Object)_4t.b("G", (Object)callSite, -4632730116849565844L, (long)l4));
                        try {
                            try {
                                v = v2;
                                if (n == 0) break block11;
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l3;
                                object = _4t.b("G", (Object)_4t.b("K", (Object)v, -4629841267081156610L, (long)l4), (Object)objectArray2, -4631020178385846781L, (long)l4);
                                if (l4 < 0L) break block12;
                                if (object == false) break block13;
                            }
                            catch (MatchException matchException) {
                                throw _4t.a(matchException);
                            }
                            v = v2;
                        }
                        catch (MatchException matchException) {
                            throw _4t.a(matchException);
                        }
                    }
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l2;
                    objectArray3[0] = class_119082;
                    _4t.b("G", (Object)v, (Object)objectArray3, -4631735584134875627L, (long)l4);
                }
                object = n;
            }
            if (object != false) continue;
        }
    }

    private void cfr_renamed_231(Object[] objectArray) {
        block8: {
            int n;
            float f;
            int n2;
            long l2;
            long l3;
            _87 var4_2;
            block7: {
                var4_2 = (_87)objectArray[0];
                int n3 = (Integer)objectArray[1];
                l3 = (Long)objectArray[2];
                int n4 = (Integer)objectArray[3];
                int n5 = (Integer)objectArray[4];
                int n6 = (Integer)objectArray[5];
                long l4 = l3 = a ^ l3;
                long l5 = l4 ^ 0x47C6CF4C9FFEL;
                long l6 = l4 ^ 0x4EFC64CA0BEL;
                l2 = l4 ^ 0x5A00C8A8A4CL;
                long l7 = l4 ^ 0x7209498D66B7L;
                long l8 = l4 ^ 0x1AAA03A3C469L;
                long l9 = l4 ^ 0x6C6A4BB4783BL;
                int n7 = (int)(l9 >>> 48);
                int n8 = (int)(l9 << 16 >>> 32);
                int n9 = (int)(l9 << 48 >>> 48);
                long l10 = l4 ^ 0x27CA3099ED59L;
                int n10 = n6 >> 1;
                int n11 = n4 + n10 - _4t.a("m", 2300, (long)(0x64361908CACA8C2CL ^ l3));
                int n12 = (int)(255.0f * _4t.b("K", (Object)this, 3882851371778203583L, (long)l3));
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l10;
                int n13 = (int)((float)_4t.b("G", (Object)_4t.b("K", (Object)this, 3880096670670839398L, (long)l3), (Object)objectArray2, 3880906132212612399L, (long)l3) * _4t.b("K", (Object)this, 3882851371778203583L, (long)l3));
                Object[] objectArray3 = new Object[4];
                objectArray3[3] = l5;
                objectArray3[2] = Float.valueOf((float)_4t.b("K", (Object)this, 3881730742344012499L, (long)l3));
                objectArray3[1] = n12 << _4t.a("m", 23600, (long)(0x6265190189EAD8DCL ^ l3)) | _4t.a("m", 24496, (long)(0x45BBE71288D3DB55L ^ l3));
                objectArray3[0] = n13 << _4t.a("m", 23600, (long)(0x6265190189EAD8DCL ^ l3)) | _4t.a("m", 11243, (long)(0x7816D5C384F1AF22L ^ l3));
                CallSite callSite = _4t.b("I", (Object)objectArray3, 3878808434794904921L, (long)l3);
                Object[] objectArray4 = new Object[1];
                objectArray4[0] = l6;
                CallSite callSite2 = _4t.b("G", (Object)_4t.b("K", (Object)this, 3882763316170564382L, (long)l3), (Object)objectArray4, 3877664016958946240L, (long)l3);
                Object[] objectArray5 = new Object[5];
                objectArray5[4] = new _8B((int)callSite, (short)n7, n8, (short)n9);
                objectArray5[3] = (double)n11;
                objectArray5[2] = (double)(n3 + _4t.a("m", 12416, (long)(0x148FD09DA2733455L ^ l3)));
                objectArray5[1] = callSite2;
                objectArray5[0] = l7;
                _4t.b("G", (Object)var4_2, (Object)objectArray5, 3878115954269811181L, (long)l3);
                CallSite callSite3 = _4t.a("m", 30066, (long)(0x3EE7AAF11E4B7191L ^ l3));
                int n14 = n3 + n5 - _4t.a("m", 17384, (long)(0x53DB0FC61ECD4720L ^ l3));
                int n15 = _4t.cfr_renamed_2();
                n2 = n4 + n10 - _4t.a("m", 23415, (long)(0x7FF89B71A2ABDFAFL ^ l3));
                int n16 = (int)(200.0f * _4t.b("K", (Object)this, 3882851371778203583L, (long)l3));
                int n17 = (int)(100.0f * _4t.b("K", (Object)this, 3882851371778203583L, (long)l3));
                Object[] objectArray6 = new Object[4];
                objectArray6[3] = l5;
                objectArray6[2] = Float.valueOf((float)_4t.b("K", (Object)this, 3881730742344012499L, (long)l3));
                objectArray6[1] = n17 << _4t.a("m", 23600, (long)(0x6265190189EAD8DCL ^ l3)) | _4t.a("m", 4383, (long)(0x3BF0EFE9BA2C95D1L ^ l3));
                objectArray6[0] = n16 << _4t.a("m", 23600, (long)(0x6265190189EAD8DCL ^ l3)) | _4t.a("m", 5250, (long)(0x163DE03D2BDC1049L ^ l3));
                CallSite callSite4 = _4t.b("I", (Object)objectArray6, 3878808434794904921L, (long)l3);
                Object[] objectArray7 = new Object[10];
                objectArray7[9] = 6.0;
                objectArray7[8] = 6.0;
                objectArray7[7] = 6.0;
                objectArray7[6] = 6.0;
                objectArray7[5] = (double)(n2 + callSite3);
                objectArray7[4] = l8;
                objectArray7[3] = (double)(n14 + _4t.a("m", 23600, (long)(0x6265190189EAD8DCL ^ l3)));
                objectArray7[2] = (double)n2;
                objectArray7[1] = (double)n14;
                objectArray7[0] = (int)callSite4;
                _4t.b("G", (Object)var4_2, (Object)objectArray7, 3879766654272228052L, (long)l3);
                int n18 = n15;
                f = (float)(n14 + _4t.a("m", 23415, (long)(0x7FF89B71A2ABDFAFL ^ l3))) + 12.0f * _4t.b("K", (Object)this, 3881730742344012499L, (long)l3);
                Object[] objectArray8 = new Object[4];
                objectArray8[3] = l5;
                objectArray8[2] = Float.valueOf((float)_4t.b("K", (Object)this, 3881730742344012499L, (long)l3));
                objectArray8[1] = n12 << _4t.a("m", 23600, (long)(0x6265190189EAD8DCL ^ l3)) | _4t.a("m", 1447, (long)(0x63917D4EFFC18145L ^ l3));
                objectArray8[0] = n12 << _4t.a("m", 23600, (long)(0x6265190189EAD8DCL ^ l3)) | _4t.a("m", 30611, (long)(0x1444D7D03061F35EL ^ l3));
                CallSite callSite5 = _4t.b("I", (Object)objectArray8, 3878808434794904921L, (long)l3);
                try {
                    try {
                        Object[] objectArray9 = new Object[5];
                        objectArray9[4] = 5.0;
                        objectArray9[3] = (double)(n2 + _4t.a("m", 23415, (long)(0x7FF89B71A2ABDFAFL ^ l3)));
                        objectArray9[2] = l2;
                        objectArray9[1] = (double)f;
                        objectArray9[0] = (int)callSite5;
                        _4t.b("G", (Object)var4_2, (Object)objectArray9, 3878302232614473481L, (long)l3);
                        reference cfr_temp_0 = _4t.b("K", (Object)this, 3881730742344012499L, (long)l3) - 0.01f;
                        n = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                        if (n18 == 0) break block7;
                        if (n <= 0) break block8;
                    }
                    catch (MatchException matchException) {
                        throw _4t.a(matchException);
                    }
                    n = (int)(30.0f * _4t.b("K", (Object)this, 3882851371778203583L, (long)l3) * _4t.b("K", (Object)this, 3881730742344012499L, (long)l3));
                }
                catch (MatchException matchException) {
                    throw _4t.a(matchException);
                }
            }
            reference var39_32 = n;
            try {
                if (l3 >= 0L && var39_32 > 0) {
                    Object[] objectArray10 = new Object[5];
                    objectArray10[4] = 8.0;
                    objectArray10[3] = (double)(n2 + _4t.a("m", 23415, (long)(0x7FF89B71A2ABDFAFL ^ l3)));
                    objectArray10[2] = l2;
                    objectArray10[1] = (double)f;
                    objectArray10[0] = var39_32 << _4t.a("m", 23600, (long)(0x6265190189EAD8DCL ^ l3)) | _4t.a("m", 1447, (long)(0x63917D4EFFC18145L ^ l3));
                    _4t.b("G", (Object)var4_2, (Object)objectArray10, 3878302232614473481L, (long)l3);
                }
            }
            catch (MatchException matchException) {
                throw _4t.a(matchException);
            }
        }
    }

    private void cfr_renamed_223(Object[] objectArray) {
        CallSite callSite;
        float f;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        long l7;
        int n;
        int n2;
        int n3;
        _87 var7_3;
        long l8;
        block10: {
            _4t t;
            block8: {
                block9: {
                    Object object;
                    long l9;
                    block6: {
                        int n4;
                        block7: {
                            l8 = (Long)objectArray[0];
                            var7_3 = (_87)objectArray[1];
                            n3 = (Integer)objectArray[2];
                            n2 = (Integer)objectArray[3];
                            n = (Integer)objectArray[4];
                            long l10 = l8 = a ^ l8;
                            l7 = l10 ^ 0x5388608D003AL;
                            l9 = l10 ^ 0x4312FC2ABDEL;
                            l6 = l10 ^ 0x4B27D01AE016L;
                            l5 = l10 ^ 0x69B6CEC71F56L;
                            l4 = l10 ^ 0xEE4AC625BADL;
                            l3 = l10 ^ 0x117142D0D471L;
                            l2 = l10 ^ 0x33849F58729DL;
                            n4 = _4t.cfr_renamed_9();
                            f = 5.0f * _4t.b("K", (Object)this, -6189430479609836265L, (long)l8) * _4t.b("K", (Object)this, -6186049717026439045L, (long)l8);
                            try {
                                float f2 = f - 0.1f;
                                object = f2 == 0.0f ? 0 : (f2 < 0.0f ? -1 : 1);
                                if (n4 != 0) break block6;
                                if (object > 0) break block7;
                            }
                            catch (MatchException matchException) {
                                throw _4t.a(matchException);
                            }
                            return;
                        }
                        try {
                            t = this;
                            if (n4 != 0) break block8;
                            object = _4t.b("G", (Object)_4t.b("K", (Object)t, -6186172493317653286L, (long)l8), -6190320355814128001L, (long)l8);
                        }
                        catch (MatchException matchException) {
                            throw _4t.a(matchException);
                        }
                    }
                    try {
                        if (object == false) break block9;
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = (int)_4t.b("K", (Object)this, -6188404317618598916L, (long)l8);
                        objectArray2[0] = l9;
                        callSite = _4t.b("G", (Object)_4t.b("K", (Object)this, -6188676388765291630L, (long)l8), (Object)objectArray2, -6191114698270895593L, (long)l8);
                        break block10;
                    }
                    catch (MatchException matchException) {
                        throw _4t.a(matchException);
                    }
                }
                t = this;
            }
            callSite = _4t.b("K", (Object)t, -6188441600045405427L, (long)l8);
        }
        CallSite callSite2 = callSite;
        int n5 = (int)(255.0f * _4t.b("K", (Object)this, -6186049717026439045L, (long)l8));
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l2;
        int n6 = (int)((float)_4t.b("G", (Object)_4t.b("K", (Object)this, -6188848501518810718L, (long)l8), (Object)objectArray3, -6188038392628157717L, (long)l8) * _4t.b("K", (Object)this, -6186049717026439045L, (long)l8));
        int n7 = n6 << _4t.a("m", 23600, (long)(0x62650D4F262B4718L ^ l8)) | _4t.a("m", 30611, (long)(0x1444C39E9FA06C9AL ^ l8));
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l3;
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l6;
        Object[] objectArray6 = new Object[1];
        objectArray6[0] = l5;
        int n8 = n5 << _4t.a("m", 23600, (long)(0x62650D4F262B4718L ^ l8)) | _4t.b("G", (Object)callSite2, (Object)objectArray4, -6190389079180251792L, (long)l8) << _4t.a("m", 1144, (long)(0x3D5B0FBDC1A11F6BL ^ l8)) | _4t.b("G", (Object)callSite2, (Object)objectArray5, -6188972453783522310L, (long)l8) << _4t.a("m", 27638, (long)(0x7703FB80666570F0L ^ l8)) | _4t.b("G", (Object)callSite2, (Object)objectArray6, -6192196194808747161L, (long)l8);
        Object[] objectArray7 = new Object[4];
        objectArray7[3] = l7;
        objectArray7[2] = Float.valueOf((float)_4t.b("K", (Object)this, -6189430479609836265L, (long)l8));
        objectArray7[1] = n8;
        objectArray7[0] = n7;
        CallSite callSite3 = _4t.b("I", (Object)objectArray7, -6192343973902900579L, (long)l8);
        Object[] objectArray8 = new Object[10];
        objectArray8[9] = 1.5;
        objectArray8[8] = 1.5;
        objectArray8[7] = 1.5;
        objectArray8[6] = 1.5;
        objectArray8[5] = (double)(n2 + n - 2);
        objectArray8[4] = l4;
        objectArray8[3] = (double)((float)n3 + f);
        objectArray8[2] = (double)(n2 + 2);
        objectArray8[1] = (double)n3;
        objectArray8[0] = (int)callSite3;
        _4t.b("G", (Object)var7_3, (Object)objectArray8, -6191420920401439472L, (long)l8);
    }

    public void cfr_renamed_127(Object[] objectArray) {
        block16: {
            _4t t;
            int n;
            long l2;
            long l3;
            double d;
            double d2;
            class_11909 class_119092;
            long l4;
            block12: {
                CallSite callSite;
                block10: {
                    block11: {
                        l4 = (Long)objectArray[0];
                        class_119092 = (class_11909)objectArray[1];
                        d2 = (Double)objectArray[2];
                        d = (Double)objectArray[3];
                        long l5 = l4 = a ^ l4;
                        l3 = l5 ^ 0x5C9BA4B986E2L;
                        l2 = l5 ^ 0x781F31CDA0F5L;
                        n = _4t.cfr_renamed_2();
                        try {
                            callSite = _4t.b("K", (Object)this, -992917223689551599L, (long)l4);
                            if (n == 0) break block10;
                            if (callSite != false) break block11;
                        }
                        catch (MatchException matchException) {
                            throw _4t.a(matchException);
                        }
                        return;
                    }
                    try {
                        t = this;
                        if (n == 0) break block12;
                        callSite = _4t.b("K", (Object)t, -1006281457301820188L, (long)l4);
                    }
                    catch (MatchException matchException) {
                        throw _4t.a(matchException);
                    }
                }
                if (callSite == false) break block16;
                t = this;
            }
            CallSite callSite = _4t.b("G", (Object)_4t.b("K", (Object)t, -1004810683058303494L, (long)l4), -992479098888719765L, (long)l4);
            while (_4t.b("G", (Object)callSite, -992587613128997846L, (long)l4) != false) {
                Object object;
                block14: {
                    block15: {
                        _0v v;
                        block13: {
                            _0v v2 = (_0v)((Object)_4t.b("G", (Object)callSite, -1006426864299199791L, (long)l4));
                            try {
                                try {
                                    v = v2;
                                    if (n == 0) break block13;
                                    Object[] objectArray2 = new Object[1];
                                    objectArray2[0] = l3;
                                    object = _4t.b("G", (Object)_4t.b("K", (Object)v, -1008182353802384829L, (long)l4), (Object)objectArray2, -1007109531882130498L, (long)l4);
                                    if (l4 <= 0L) break block14;
                                    if (object == false) break block15;
                                }
                                catch (MatchException matchException) {
                                    throw _4t.a(matchException);
                                }
                                v = v2;
                            }
                            catch (MatchException matchException) {
                                throw _4t.a(matchException);
                            }
                        }
                        Object[] objectArray3 = new Object[4];
                        objectArray3[3] = l2;
                        objectArray3[2] = d;
                        objectArray3[1] = d2;
                        objectArray3[0] = class_119092;
                        _4t.b("G", (Object)v, (Object)objectArray3, -992783331598863785L, (long)l4);
                    }
                    object = n;
                }
                if (object != false) continue;
            }
        }
    }

    private void cfr_renamed_232(Object[] objectArray) {
        float f;
        float f2;
        float f3;
        long l2;
        long l3;
        long l4;
        block10: {
            block9: {
                CallSite callSite;
                block8: {
                    l4 = (Long)objectArray[0];
                    int n = (Integer)objectArray[1];
                    int n2 = (Integer)objectArray[2];
                    float f4 = ((Float)objectArray[3]).floatValue();
                    long l5 = l4 = a ^ l4;
                    long l6 = l5 ^ 0x275A6EB5B7FBL;
                    l3 = l5 ^ 0x59D08F696C10L;
                    l2 = l5 ^ 0x54140730AA70L;
                    int n3 = _4t.cfr_renamed_9();
                    f3 = f4 * 0.05f;
                    try {
                        try {
                            Object[] objectArray2 = new Object[3];
                            objectArray2[2] = (double)n2;
                            objectArray2[1] = (double)n;
                            objectArray2[0] = l6;
                            callSite = _4t.b("G", (Object)this, (Object)objectArray2, 6295982650211523575L, (long)l4);
                            if (n3 != 0) break block8;
                            if (callSite == false) break block9;
                        }
                        catch (MatchException matchException) {
                            throw _4t.a(matchException);
                        }
                        callSite = _4t.b("K", (Object)_4t.b("K", (Object)this, 6292679718536664795L, (long)l4), 6299086260569279604L, (long)l4);
                    }
                    catch (MatchException matchException) {
                        throw _4t.a(matchException);
                    }
                }
                try {
                    if (callSite != false) break block9;
                    f2 = 0.5f;
                    break block10;
                }
                catch (MatchException matchException) {
                    throw _4t.a(matchException);
                }
            }
            f2 = 0.0f;
        }
        float f5 = f2;
        try {
            Object[] objectArray3 = new Object[5];
            objectArray3[4] = (double)f3;
            objectArray3[3] = l2;
            objectArray3[2] = (double)0.03f;
            objectArray3[1] = (double)f5;
            objectArray3[0] = (double)_4t.b("K", (Object)this, 6291617825026803294L, (long)l4);
            _4t.b("y", (Object)this, (float)((float)_4t.b("I", (Object)objectArray3, 6295822069986527650L, (long)l4)), 6291617825026803294L, (long)l4);
            f = _4t.b("G", (Object)_4t.b("K", (Object)this, 6300322180544643475L, (long)l4), 6295716921169328950L, (long)l4) != false ? 1.0f : 0.0f;
        }
        catch (MatchException matchException) {
            throw _4t.a(matchException);
        }
        float f6 = f;
        Object[] objectArray4 = new Object[5];
        objectArray4[4] = (double)f3;
        objectArray4[3] = l2;
        objectArray4[2] = (double)0.005f;
        objectArray4[1] = (double)f6;
        objectArray4[0] = (double)_4t.b("K", (Object)this, 6292593580901118046L, (long)l4);
        _4t.b("y", (Object)this, (float)((float)_4t.b("I", (Object)objectArray4, 6295822069986527650L, (long)l4)), 6292593580901118046L, (long)l4);
        Object[] objectArray5 = new Object[4];
        objectArray5[3] = l3;
        objectArray5[2] = 1.0;
        objectArray5[1] = 0.0;
        objectArray5[0] = (double)_4t.b("K", (Object)this, 6292593580901118046L, (long)l4);
        _4t.b("y", (Object)this, (float)((float)_4t.b("I", (Object)objectArray5, 6295031317112391303L, (long)l4)), 6292593580901118046L, (long)l4);
    }

    public _4t(_8w_0 w_0, _6x_0 x_0, long l2, int n) {
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x56B6466311F6L;
        long l5 = l3 ^ 0x53D2B76E4AFDL;
        long l6 = l3 ^ 0x2534295EB1E9L;
        long l7 = l3 ^ 0x252D49CFB275L;
        this.cfr_renamed_223 = 6.0f;
        this.cfr_renamed_9 = new _8B((int)_4t.a("m", 5200, (long)(0x7819942C06D58F7L ^ l2)), l7, (int)_4t.a("m", 25857, (long)(0x2C38A3CBDE7EA9A3L ^ l2)), (int)_4t.a("m", 4548, (long)(0x2F0939A57B03DD7DL ^ l2)));
        this.cfr_renamed_3 = new _8B((int)_4t.a("m", 26194, (long)(0x7F9C57DBB4BE2AE2L ^ l2)), l7, (int)_4t.a("m", 6164, (long)(0x478FA7F0B45B54BBL ^ l2)), (int)_4t.a("m", 6164, (long)(0x478FA7F0B45B54BBL ^ l2)));
        _4t.b("y", (Object)this, new ArrayList(), 9056539131687420507L, (long)l2);
        int n2 = _4t.cfr_renamed_9();
        _4t.b("y", (Object)this, 0.0, 9050848622440394242L, (long)l2);
        _4t.b("y", (Object)this, 0.0f, 9052621819081272495L, (long)l2);
        _4t.b("y", (Object)this, 0.0f, 9053015915124529839L, (long)l2);
        _4t.b("y", (Object)this, (boolean)_4t.a("m", 21017, (long)(0x743A0F7C4A989EAFL ^ l2)), 9050277368999153328L, (long)l2);
        _4t.b("y", (Object)this, 1.0f, 9051887022174508995L, (long)l2);
        int n3 = n2;
        _4t.b("y", (Object)this, (int)_4t.a("m", 18265, (long)(0x42A0010858D08BF1L ^ l2)), 9053960146854370372L, (long)l2);
        _4t.b("y", (Object)this, (_8w_0)w_0, 9053669401191644202L, (long)l2);
        _4t.b("y", (Object)this, (_6x_0)x_0, 9051728529474448226L, (long)l2);
        _4t.b("y", (Object)this, (int)n, 9052459299504616533L, (long)l2);
        _4t.b("y", (Object)this, (boolean)_4t.a("m", 28809, (long)(0x506DBC41D8A0BC28L ^ l2)), 9054909272925397829L, (long)l2);
        Object[] objectArray = new Object[1];
        objectArray[0] = l4;
        _4t.b("y", (Object)this, (int)_4t.b("G", (Object)w_0, (Object)objectArray, 9054895496668089040L, (long)l2), 9050767981873035138L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l5;
        CallSite callSite = _4t.b("G", (Object)_4t.b("G", (Object)x_0, (Object)objectArray2, 9052659513021425492L, (long)l2), 9050961871339879882L, (long)l2);
        block4: while (_4t.b("G", (Object)callSite, 9050236929459866507L, (long)l2) != false) {
            _95 var16_11 = (_95)((Object)_4t.b("G", (Object)callSite, 9054782010968817008L, (long)l2));
            Object[] objectArray3 = new Object[4];
            objectArray3[3] = l6;
            objectArray3[2] = (int)_4t.b("K", (Object)this, 9050767981873035138L, (long)l2);
            objectArray3[1] = var16_11;
            Object[] objectArray4 = objectArray3;
            objectArray3[0] = this;
            do {
                int n4;
                block6: {
                    block7: {
                        block8: {
                            CallSite callSite2 = _4t.b("I", (Object)objectArray4, 9054758425396484927L, (long)l2);
                            try {
                                try {
                                    n4 = n3;
                                    if (l2 <= 0L) break block6;
                                    if (n4 != 0) break block7;
                                    if (callSite2 == null) break block8;
                                }
                                catch (MatchException matchException) {
                                    throw _4t.a(matchException);
                                }
                                _4t.b("G", (Object)_4t.b("K", (Object)this, 9056539131687420507L, (long)l2), (Object)callSite2, 9054084593867007383L, (long)l2);
                            }
                            catch (MatchException matchException) {
                                throw _4t.a(matchException);
                            }
                        }
                        _4t t = this;
                        Object[] objectArray5 = new Object[1];
                        objectArray5[0] = l4;
                        _4t.b("y", (Object)t, (int)(_4t.b("K", (Object)t, 9050767981873035138L, (long)l2) + _4t.b("G", (Object)w_0, (Object)objectArray5, 9054895496668089040L, (long)l2)), 9050767981873035138L, (long)l2);
                    }
                    n4 = n3;
                }
                if (n4 == 0) continue block4;
                objectArray4 = new String[5];
            } while (l2 <= 0L);
            _4w.cfr_renamed_8((String[])objectArray4);
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                _4t.a = l.a(6930030028955629622L, -8570220780284449389L, MethodHandles.lookup().lookupClass()).a(82493333944719L);
                _4t.e = new Object[151];
                _4t.f = new String[151];
                _4t.a();
                _4t.d = new HashMap<K, V>(13);
                _4t.cfr_renamed_2(0);
                var0 = _4t.a ^ 34873817531716L;
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
                var8_3 = new long[42];
                var5_4 = 0;
                var6_5 = "\u00aep\u00bfVS\u00bcf\u00b4\u00f7c*\u00a42M_\u00fd6\u00ac\u0000\u00e8p\u00be\u009f\r\u00df%\u00b0gR\u00e71\u00e1W-\u000fz\u00b9\u00c0=v\u00e99\u00ab\u00acm\u009e^G\u00be\u00a0\u00fa\u0005\u00eai<T\u00fd\u00f9X\t_\u00f1\u00f8\u00b7\u0094C^\u00ec\u00f3\u00e0\u00d0V\u00a0\u001d_\u00ad\u00ee\u00d9\u00cf\u0098\u0003E \u0012\u00c5\u00b4\u009e\u0093\u009e`+\u0013tZh\u00d5\u00b2\u0000\u00b8:\u00c6q\u00dcr<:\u00c2f\u007f\u00cfs1K\u00c3pr\u0017\u001ec\u008b/\u00b74\u007f\u00f3\u000bl\u00ca\u00cb\u00e7\u000f\u0080\u00cf\u009aP\u000b\u008bs\u00e2\u00ab\u00bb\u0097\u009fu\u008f\u00d36eQ-\u00f7\u0010\u00feS]\u00dd\u00b7\u00ae&\u0090\u00b4l\u00c9\u00bf*~`\u009e\u0007^\u00de\u001d\u00a4\u0081\u0086t\u00a5\u0080\u0019\u00eaJ\u00f0\u00a5u\u00f7M\u00f8S\u001dd\u00ac\u008b\u00bb\u0013\u00d6\u0006\u00cd\u00dcf\u00d1\b \u00e2>f<(8\u00f3e;\u007f#\u001f\u00c6\u00e2fq\u00ef\u00fb\u0099j\nM2\u00f0\u00a6\u0084g\u00af\u0095\u001dp\u0014\u009ce\u001a\u0016\u001cv\u00aeU\u0092H\u008fZ,vi\u00ce\u00b0u\u001bw\u00c2\u00fd\u00db\u00da?#\u00ad\u0090,\u001a\u0094\u0014f\u001dP\u009a9!f\u00e3\u001e\u001f\u0096Q\u00e9\u000e\u00b0\u00d5qq\u00acw3g\u00bb\u00ef\u00a9\u00d3o5\u00eeV\r\b?\u00c9\u00be\u00c8\u00b9\u00eeW\u0080n8\u008f\u00c8\u008c0\u00bf\u00b9}pW\u0090\u00b62";
                var7_6 = "\u00aep\u00bfVS\u00bcf\u00b4\u00f7c*\u00a42M_\u00fd6\u00ac\u0000\u00e8p\u00be\u009f\r\u00df%\u00b0gR\u00e71\u00e1W-\u000fz\u00b9\u00c0=v\u00e99\u00ab\u00acm\u009e^G\u00be\u00a0\u00fa\u0005\u00eai<T\u00fd\u00f9X\t_\u00f1\u00f8\u00b7\u0094C^\u00ec\u00f3\u00e0\u00d0V\u00a0\u001d_\u00ad\u00ee\u00d9\u00cf\u0098\u0003E \u0012\u00c5\u00b4\u009e\u0093\u009e`+\u0013tZh\u00d5\u00b2\u0000\u00b8:\u00c6q\u00dcr<:\u00c2f\u007f\u00cfs1K\u00c3pr\u0017\u001ec\u008b/\u00b74\u007f\u00f3\u000bl\u00ca\u00cb\u00e7\u000f\u0080\u00cf\u009aP\u000b\u008bs\u00e2\u00ab\u00bb\u0097\u009fu\u008f\u00d36eQ-\u00f7\u0010\u00feS]\u00dd\u00b7\u00ae&\u0090\u00b4l\u00c9\u00bf*~`\u009e\u0007^\u00de\u001d\u00a4\u0081\u0086t\u00a5\u0080\u0019\u00eaJ\u00f0\u00a5u\u00f7M\u00f8S\u001dd\u00ac\u008b\u00bb\u0013\u00d6\u0006\u00cd\u00dcf\u00d1\b \u00e2>f<(8\u00f3e;\u007f#\u001f\u00c6\u00e2fq\u00ef\u00fb\u0099j\nM2\u00f0\u00a6\u0084g\u00af\u0095\u001dp\u0014\u009ce\u001a\u0016\u001cv\u00aeU\u0092H\u008fZ,vi\u00ce\u00b0u\u001bw\u00c2\u00fd\u00db\u00da?#\u00ad\u0090,\u001a\u0094\u0014f\u001dP\u009a9!f\u00e3\u001e\u001f\u0096Q\u00e9\u000e\u00b0\u00d5qq\u00acw3g\u00bb\u00ef\u00a9\u00d3o5\u00eeV\r\b?\u00c9\u00be\u00c8\u00b9\u00eeW\u0080n8\u008f\u00c8\u008c0\u00bf\u00b9}pW\u0090\u00b62".length();
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
                    var6_5 = "\u00f2\u0016\u00d5\u00d9\u0093\u001c?\u009cs\u009eN7D\u009e\u00de'";
                    var7_6 = "\u00f2\u0016\u00d5\u00d9\u0093\u001c?\u009cs\u009eN7D\u009e\u00de'".length();
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
        _4t.b = var8_3;
        _4t.c = new Integer[42];
        _4t.cfr_renamed_6 = (int)_4t.a("m", (int)22751, (long)(var0 ^ 1484047072979517672L));
        _4t.cfr_renamed_219 = (int)_4t.a("m", (int)13176, (long)(var0 ^ 847780920880229195L));
        _4t.cfr_renamed_8 = (int)_4t.a("m", (int)12629, (long)(var0 ^ 3060585783607585128L));
        _4t.cfr_renamed_157 = (int)_4t.a("m", (int)25851, (long)(var0 ^ 558576809022995708L));
        _4t.cfr_renamed_220 = (int)_4t.a("m", (int)29267, (long)(var0 ^ 5179668382335773279L));
        _4t.cfr_renamed_221 = (int)_4t.a("m", (int)25851, (long)(var0 ^ 558576809022995708L));
        _4t.cfr_renamed_218 = (int)_4t.a("m", (int)2013, (long)(var0 ^ 8070152883016228859L));
        _4t.cfr_renamed_222 = (int)_4t.a("m", (int)13176, (long)(var0 ^ 847780920880229195L));
    }

    /*
     * Exception decompiling
     */
    public void cfr_renamed_1(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [21[DOLOOP]], but top level block is 24[SIMPLE_IF_TAKEN]
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

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _4t.a(l2, l3);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                _4t.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _4t.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _4t.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _4t.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _4t.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/4t" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l2, long l3) {
        int n = _4t.a(l2, l3);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = _4t.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _4t.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _4t.a(clazz3, string2, clazz2)) != null) {
                    _4t.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _4t.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _4t.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _4t.b(392196937856656L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _4t.a(l2, l3);
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
                clazz3 = _4t.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _4t.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _4t.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _4t.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _4t.b(392196937856656L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _4t.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _4t.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _4t.b(392196937856656L, 0L);
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x3103;
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
                throw new RuntimeException("dev/krypton/4t", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _4t.c[n2] = n3;
        }
        return c[n2];
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
            case 0 -> 26;
            case 1 -> 50;
            case 2 -> 12;
            case 3 -> 55;
            case 4 -> 54;
            case 5 -> 0;
            case 6 -> 43;
            case 7 -> 20;
            case 8 -> 61;
            case 9 -> 24;
            case 10 -> 16;
            case 11 -> 49;
            case 12 -> 34;
            case 13 -> 18;
            case 14 -> 13;
            case 15 -> 7;
            case 16 -> 2;
            case 17 -> 11;
            case 18 -> 30;
            case 19 -> 3;
            case 20 -> 23;
            case 21 -> 38;
            case 22 -> 45;
            case 23 -> 28;
            case 24 -> 32;
            case 25 -> 60;
            case 26 -> 5;
            case 27 -> 47;
            case 28 -> 22;
            case 29 -> 63;
            case 30 -> 40;
            case 31 -> 9;
            case 32 -> 25;
            case 33 -> 53;
            case 34 -> 46;
            case 35 -> 33;
            case 36 -> 31;
            case 37 -> 35;
            case 38 -> 48;
            case 39 -> 4;
            case 40 -> 41;
            case 41 -> 56;
            case 42 -> 29;
            case 43 -> 6;
            case 44 -> 14;
            case 45 -> 59;
            case 46 -> 19;
            case 47 -> 15;
            case 48 -> 10;
            case 49 -> 39;
            case 50 -> 51;
            case 51 -> 27;
            case 52 -> 58;
            case 53 -> 52;
            case 54 -> 8;
            case 55 -> 21;
            case 56 -> 1;
            case 57 -> 57;
            case 58 -> 17;
            case 59 -> 36;
            case 60 -> 62;
            case 61 -> 42;
            case 62 -> 37;
            default -> 44;
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
        _4t.f[n3] = new String(cArray);
        return n3;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _4t.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "6\u001bp~WF(\u0013j15Z/\u000e";
        objectArray[1] = ".TI]eH0\\S\u0012\u0002I!G^H$O";
        objectArray[2] = "2r\u001f\u0010)o/g\u001dQ,3o\"";
        objectArray[3] = "}(=UPG\b\b6ZA\bi\u0006=QER\u001d";
        objectArray[4] = Boolean.TYPE;
        _4t.f[4] = "java/lang/Boolean";
        objectArray[5] = "0\u001a\u000b\u000b\u001f8;\u0015\u001aD~60\u001e\u001e\u001e";
        objectArray[6] = "EEU_\"oXPW\u001e'3\u0015T";
        objectArray[7] = "\u0007tC`Op\u001aaA!J,Sg";
        objectArray[8] = "\u001bh#V\u000b\u000enH(Y\u001aA\u000fF#R\u001e\u001b{";
        objectArray[9] = Void.TYPE;
        _4t.f[9] = "java/lang/Void";
        objectArray[10] = "msm\tp!pfoHu}1T";
        objectArray[11] = "lH\u007fV\b.\u0019htY\u0019axf\u007fR\u001d;\f";
        objectArray[12] = Integer.TYPE;
        _4t.f[12] = "java/lang/Integer";
        objectArray[13] = ",;@Tl|1.B\u0015i pi";
        objectArray[14] = "'\u007f%\u0000;#R_.\u000f*l3Q%\u0004.6G";
        objectArray[15] = "n9\u0018V\u000b\n\u001b\u0019\u0013Y\u001aEz\u0017\u0018R\u001e\u001f\u000e";
        objectArray[16] = "G2`\u0016/K2\u0012k\u0019>\u0004S\u001c`\u0012:^'";
        objectArray[17] = "\f1w\u0014\u0011Uy\u0011|\u001b\u0000\u001a\u0018\u001fw\u0010\u0004@l";
        objectArray[18] = "\u0010{\u001e3R\u0011\rn\u001crWMF";
        objectArray[19] = "@EHY\u0017&]PJ\u0018\u0012z\u001dm";
        objectArray[20] = "0O\u001ck\u0002PEo\u0017d\u0013\u001f$a\u001co\u0017EP";
        objectArray[21] = ".\u0007=uZB3\u0012?4_\u001er\u0015";
        objectArray[22] = "o'h%1@\u001a\u0007c* \u000f{\th!$U\u000f";
        objectArray[23] = "EN<Hp_0n7Ga\u0010Q`<LeJ%";
        objectArray[24] = "m`l6)/\u0018@g98`yNl2<:\r";
        objectArray[25] = "H! L#U=\u0001+C2\u001a\\\u000f H6@(";
        objectArray[26] = "V,\b@.d#\f\u0003O?+B\u0002\bD;q6";
        objectArray[27] = "a\f\u0017J\t\u0017\u0014,\u001cE\u0018Xu\"\u0017N\u001c\u0002\u0001";
        objectArray[28] = "&\u0000_G,~;\u0015]\u0006)\"t\u001d";
        objectArray[29] = "\\\u0005\u000fP:K)%\u0004_+\u0004H+\u000fT/^<";
        objectArray[30] = "9c\u000eS\u0005.2l\u001f\u001cx6!k\u0016U";
        objectArray[31] = "<9\u0015#Za!,\u0017b_=l\r";
        objectArray[32] = "\u000f9/\u0004\u001b@z\u0019$\u000b\n\u000f\u001b\u0017/\u0000\u000eUo";
        objectArray[33] = Double.TYPE;
        _4t.f[33] = "java/lang/Double";
        objectArray[34] = "/\u001b~\u001d\u001e\u0013Z;u\u0012\u000f\\;5~\u0019\u000b\u0006O";
        objectArray[35] = Float.TYPE;
        _4t.f[35] = "java/lang/Float";
        objectArray[36] = "\r\u000f:>{-x/11jb\u0019!::n8m";
        objectArray[37] = "Y:M2\f\r,\u001aF=\u001dBM\u0014M6\u0019\u00189";
        objectArray[38] = "wfc\u000f3\"\u0002Fh\u0000\"mcHc\u000b&7\u0017";
        objectArray[39] = "\u0014W=\u0010#gaw6\u001f2(\u0000y=\u00146rt";
        objectArray[40] = ":\" pD\rO\u0002+\u007fUB.\f tQ\u0018Z";
        objectArray[41] = "I#\u001e\u001c\"-I#\t@.\"Sh\t^.7T\u0019[\u0003vt\u001e";
        objectArray[42] = "\u001dylxl\u0001hYgw}N\tWl|y\u0014}";
        objectArray[43] = "\u0013i6\u001dd\u000ffI=\u0012u@\u0007G6\u0019q\u001as";
        objectArray[44] = "4VF{I\u000bAvMtXD xF\u007f\\\u001eT";
        objectArray[45] = "`A\u007f[Xm\u0015atTI\"to\u007f_Mx\u0000";
        objectArray[46] = "d\u0018\u0014\u007fV\u0016\u00118\u001fpGYp6\u0014{C\u0003\u0004";
        objectArray[47] = "sMb\fg0nX`Mbl.a";
        objectArray[48] = "Z^\u000f1BU/~\u0004>S\u001aNp\u000f5W@:";
        objectArray[49] = "=h\u0000O\u001bLHH\u000b@\n\u0003)F\u0000K\u000eY]";
        objectArray[50] = "\u0010\\\u001a\u001a$Ie|\u0011\u00155\u0006\u0004r\u001a\u001e1\\p";
        objectArray[51] = ",O|,EPYow#T\u001f8a|(PEL";
        objectArray[52] = "0&\bluf-3\n-p:d\u000f";
        objectArray[53] = "|D%o3vaQ'.6*(o";
        objectArray[54] = "t\u0016i/0 \u00016b !o`8i+%5\u0014";
        objectArray[55] = "+8E.)l^\u0018N!8#?\u0016E*<yK";
        objectArray[56] = "coTr:c\u0016O_}+,wATv/v\u0003";
        objectArray[57] = "\u0013[=\u0019K\nf{6\u0016ZE\u0007u=\u001d^\u001fs";
        objectArray[58] = "\u0015\u001d`)lP\u001e\u0012qf\u000f]\u000b\u0014";
        objectArray[59] = "Rd9\u001c\u0015H'D2\u0013\u0004\u0007FJ9\u0018\u0000]2";
        objectArray[60] = "U|\tlx< \\\u0002cisAR\thm)5";
        objectArray[61] = "\\\u000bi\\\u000f>)+bS\u001eqH%iX\u001a+<";
        objectArray[62] = "\fuwWD\u0000yU|XUO\u0018[wSQ\u0015l";
        objectArray[63] = "=!w1B\u0013H\u0001|>S\\)\u000fw5W\u0006]";
        objectArray[64] = "LQ\u0011K1P9q\u001aD \u001fX\u007f\u0011O$E,";
        objectArray[65] = "#\feF_AV,nIN\u000e7\"eBJTC";
        objectArray[66] = "_6\u00002H\b*\u0016\u000b=YGK\u0018\u00006]\u001d?";
        objectArray[67] = "\u000b\u0011\r\u000b\u001eI~1\u0006\u0004\u000f\u0006\u001f?\r\u000f\u000b\\k";
        objectArray[68] = "\u0007\u000e\u007f\u0007=\u0011r.t\b,^\u0013 \u007f\u0003(\u0004g";
        objectArray[69] = "X\u0006Opg \tW\u0012,Y%3\n\u001fg)aB\u0007Ju&";
        objectArray[70] = "Wei\u0004/\f\u001d${\u001c][^_-\u000e2\u000e\u000f?h\u000b'\r^_*\u0004:\u0019Y&t\u000fgPf";
        objectArray[71] = "0\u0014/U*7qIs\u0001N>\rL{T!nm\t~A\"?\rKq\\68t\u0015z\u0001\u007f\u0007";
        objectArray[72] = "\u0011\u0015R\u007fvRO]G( 0\u0010\u0012=wz\fZCMw|\tT";
        objectArray[73] = ".1G@\u0006J#s\u001bVl@Qt\u0017@\u0003\u001311\u0012U\u0000BQ}\u0011\u0010T\u000b?(\u0002DTz";
        objectArray[74] = "\f#E\u0018@\\M~\u0019L$]1{\u0011\u0019K\u0005Q>\u0014\fHT1\u007f\u001aHJ\b\u0001>G\u0014\u001el";
        objectArray[75] = "\u0005\u001cWLmTH\nPE\tV:HGZf\u0005Z\rBOeT:AA\n1\u001dT\u0014R^1l";
        objectArray[76] = "\u0006LA \u0018)TRK7jmk\bN$\u0005?\u000bMK1\u0006nk\u0001HtR'\u0005T[ RV";
        objectArray[77] = ">r.N433~ ,,n1gK\u00174;:`\"O2<}\u001b";
        objectArray[78] = "SCPhkK[QKc\u0000\u00151\u000bQeoGQNTpl\u00161\f[mx\u0011HRP01.";
        objectArray[79] = "o\u0011M\u0003yo*JK\u000b\u0010n\u0017 \u000fIk#<K\u0004\u001d`<";
        objectArray[80] = "Ts_tR\"\u000f9K?#`00N*L6PuK?Og0o\u0019yQ1@o\u001f|__";
        objectArray[81] = "UG\t%<E\u001f\u0006\u001b=N\u0017<}M/!G\r\u001d\b*4D\\}J%)P[\u0004\u0014.t\u0019d";
        objectArray[82] = "g\"\u001c\n\u00001\"y\u001a\u0002i1[*\u000f\u0017\u0006e;o\n\u0002\u00054[(]\u0003\u0018c0#\t\b\u0007\f";
        objectArray[83] = "\u0010&R3_IQ{\u000eg;F-~\u00062T\u0010M;\u0003'WA-w\u0000b\u0003\bC\"\u00136\u0003y";
        objectArray[84] = "\u001d\u000130<\nXZ58U\t!\u0001$2-SB^qx";
        objectArray[85] = "(3Y\u000e\u0004|e%^\u0007`t\u0017gI\u0018\u000f-w\"L\r\f|\u0017nOHX5y;\\\u001cXD";
        objectArray[86] = "83\u000f>V70!\u00145=cZy\\'L=1r\b,SR";
        objectArray[87] = "Krrg\u001aq\u00021n2\u000b@\u0017'\u007f\u000e\u0017}N<a~\u0017{K2\u000fhL|\u0000 \u007fhJy\u000eNi3M2\u001c>i5H<r";
        objectArray[88] = "w\u0013\u0005Ao\u001b\u007f\u0001\u001eJ\u0004O\u0015[\u0004Lk\u0017u\u001e\u0001YhF\u0015\u0006PJa\u0004.S\u000bZv~";
        objectArray[89] = "CXFJg~\u0006\u0003@B\u000e\u007f0i\u0006Ra,\u0016\tCWt/Gi\u0001Xi;@\u0010_S4r\u007f";
        objectArray[90] = "Qz1\\'u\u0003d;KU0<>>X:c\\{;M92<89M,n\u0004u/J%\n";
        objectArray[91] = "q\u000b\u0011q\u0000\u0016/\u000fQxA.w3\r9JA4\u000f\u0014t^C";
        objectArray[92] = "^+t\u0000\bo\u0005a`Ky#:he^\u0016{Z-`K\u0015*:72\r\u000b|J74\b\u0005\u0012";
        objectArray[93] = "E\nVKqH\u000fKDS\u0003\u0015\u00120\u0012AlJ\u001dPWDyIL0\u0015Kd]KIK@9\u0014t";
        objectArray[94] = "\u0004]$'RnE\u0000xs6d9\u0005p&Y7Y@u3Zf9\fvv\u000e/WYe\"\u000e^";
        objectArray[95] = "\u001cp\r|\u001baV1\u001fdi0-s\u001as\u0006eM6\u001ff\u00054-,M \u001bb],K%\u0015\f";
        objectArray[96] = "p\u00030\\;'1^l\b_*vb1_%n)Z|I\"g";
        objectArray[97] = "}S\u0015j@-&\u0019\u0001!1i\u0019\u0010\u00044^9yU\u0001!]h\u0019OSgC>iOUbMP";
        objectArray[98] = "\u0005\u000efn^3@U`f72I?xlFaE\u0003a!Rc";
        objectArray[99] = ".\u001bmL,Xk@kDE\\\u0012\u0013~Q*\frV{D)]\u0012\u0014tY=ZkJ\u007f\u0004te";
        objectArray[100] = "geL=r~&8\u0010i\u0016s6\u0004K7t>fm\b(/)";
        objectArray[101] = "Q\u0003,|Zo\\V>s&%=W=cIw]\u00128vJ&=P7k^!D\u000e<6\u0017\u001e";
        objectArray[102] = "5\u000esl\u007fI)\r9z\u0001K)\u00131A=\u001f\u007fFIp<\u001c<\u00189p:\u00192v";
        objectArray[103] = "KK\u0014*\u0018c\n\u0016H~|ov\u001aF{D\"\u0018OU/D";
        objectArray[104] = "rI\u0003xi( W\to\u001bm\u001f\r\f|t>\u007fH\tiwo\u001f\u0004\n,#&qQ\u0019x#W";
        objectArray[105] = "&~5\u0018gzc%3\u0010\u000e{dOu\u0000a(s/0\u0005t+\"Or\ni?%6,\u00014v\u001a";
        objectArray[106] = "^\u0014G$dT\u001bOA,\rXb\u0015Ri5\u0018\f@A=5";
        objectArray[107] = "m4zb6!q70tH-{0 \u007f$\u001f)pz$uH& \u007f 9&s3+ H";
        objectArray[108] = "n1j;kH+jl3\u0002MRgc8m\tn~.,o";
        objectArray[109] = "4P\u0002ty6k\u0005H\f|3iS\u0002KsU>@Jwf<fFM0\u001dei\u0001J}s0zUJ\f";
        objectArray[110] = "V@Qp\u001e*\u0017\u001d\r$z$k\u0018\u0005q\u0015s\u000b]\u0000d\u0016\"k\u001f\u000fy\u0002%\u0012A\u0004$K\u001a";
        objectArray[111] = "|a8ss$ts#x\u0018|\u001e)9~w(~l<kty\u001e!=a`%}~h+\u0018";
        objectArray[112] = "{[%\u0007\u00147>\u0000#\u000f}5GU1\u000f\u0004n\u007f\u0018'\b\r";
        objectArray[113] = "X\u0003Siwd\u001dXUa\u001ee\u000e2\u001aw!a\u0015\\Odua";
        objectArray[114] = "E3\u0002\"5\u001e\u0000h\u0004*\\\u001c'\u0002B:3L\u0010b\u0007?&OA\u0002E0;[F{\u001b;f\u0012y";
        objectArray[115] = "\u0014e&.swK0lV~xI\u000bm(/o^b5.((%0n-f{N;:&y\u0014";
        objectArray[116] = "\nm\fhe\u0012IrW\u007fYD30\u0004w6\u0012Su\u0001b5C32Vc(\u0014X9\u0002h7{";
        objectArray[117] = "\u0006\u0003-i>jLB?qL=M9ic#h^Y,f6k\u000f9ni+\u007f\b@0bv67";
        objectArray[118] = "J\u001dBtgS\u0007\u000bE}\u0003SuIRbl\u0002\u0015\fWwoSu@T2;\u001a\u001b\u0015Gf;k";
        objectArray[119] = "\u0015r&=iDT/zi\rE(*r<b\u001dHow)aL(-x4uKQssi<t";
        objectArray[120] = "\u0001E\u0012fPKD\u001e\u0014n9K=M\u0001{V\u001f]\b\u0004nUN=J\u000bsAID\u0014\u0000.\bv";
        objectArray[121] = " fSs{lmpTz\u001fe\u001f2Cep=\u007fwFpsl\u001f;E5'%qnVa'T";
        objectArray[122] = "\"aB}\u001e*c<\u001e)z&\u001f9\u0016|\u0015s\u007f|\u0013i\u0016\"\u001f>\u001ct\u0002%f`\u0017)K\u001a";
        objectArray[123] = "K?Ij]0\u000edOb47w1]bMiO|KeD";
        objectArray[124] = "\u0015Bu$|3T\u001f)p\u0018=(\u001a!%wjH_$0t;(\u0013'u rFF4! \u0003";
        objectArray[125] = "_\u0016^\f\u0002E\u001aMX\u0004kDcJZ\u001b\u0000\n\u001c\u0018D\u0011\u0017";
        objectArray[126] = "\u0004<8\u000ffCZ8x\u0006'{\u0000\u0004%\na\tSt%\fd\u0007";
        objectArray[127] = "kJ*\u0004mr4\u001f`|rp(IZLe.bU4\u0019vzb$";
        objectArray[128] = "f\r}?#(#V{7J*Z\u0005n\"%|:@k7&-Z\u0002d*2*#\\ow{\u0015";
        objectArray[129] = "h {AT\u00027u19Q\u001a\u0014+sEAabvpH_\ni\"{W0";
        objectArray[130] = "\u0016M2,g\u001fS\u00164$\u000e\u0012*L'a6SD\u0019456";
        objectArray[131] = "rI4\u001b067\u00122\u0013Y5NA'\u00066b.\u0004\"\u001353NF-\u000e!47\u0018&Sh\u000b";
        objectArray[132] = "\u0018\u0015\u0005j\n=G@O\u0012\u000f\"D\u0001\u001cn\t$)\u0004\u001cw\f \u0019\t\u0010yn";
        objectArray[133] = "b:|$C\u0006'az,*\u0002^m8jXU.m>oV";
        objectArray[134] = "9!\u001bRJNk?\u0011E8\u000b;\\E\u0001C@;7NUH_";
        objectArray[135] = "-xHg\u001dzl%\u00143yw\u0010 \u001cf\u0016#pe\u0019s\u0015r\u0010'\u0016n\u0001uiy\u001d3HJ";
        objectArray[136] = "n3]\rr\u0010+h[\u0005\u001b\u001dR;N\u0010tD2~K\u0005w\u0015R<D\u0018c\u0012+bOE*-";
        objectArray[137] = "i1'>Pq;/-)\"7\u0004u(:Mgd0-/N6\u0004|.j\u001a\u007fj)=>\u001a\u000e";
        objectArray[138] = ":\u0013tP\u001e\u00157\u001fz2\u0000L><|B\u001c%~BjC\u000fNu\u0016a\\`";
        objectArray[139] = "*o\u0003\u0010=u\"}\u0018\u001bV,H'\u0002\u001d9y(b\u0007\b:(HzV\u001b3js/\r\u000b$\u0010";
        objectArray[140] = "l@\u0004vc>=\u0011Y*]:D Rz`o9\u001d\u0003+=3";
        objectArray[141] = "`PyS1A%\u000b\u007f[X@7a;\u0019#\r3\n0M(\u0012";
        objectArray[142] = "Yg\u0007s*W\u000by\rdX\u00154+\fh LWtY\"";
        objectArray[143] = "X_h~0\u0010\u0019\u00024*T\u001fe\u0007<\u007f;I\u0005B9j8\u0018e\u00006w,\u001f\u001c^=*e ";
        objectArray[144] = "\\i\u0013g06\u0002!\u00060fT[Q\u001a4=&\u000b!\u001a28(";
        objectArray[145] = "r\u000e\u0016jn\u000f7U\u0010b\u0007\u000e2?\rilP%Z\u0005{w[";
        objectArray[146] = "bXhL S'\u0003nDIRcivN8\u0001\"Uo\u0003,\u0003";
        objectArray[147] = "iL-\u0011H3uOg\u000761uQo<\ne#\u0005\u0017\r\u000bf`Zg\r\rcn4";
        objectArray[148] = "\u001a6mj\u0017\u000b[k1>s\u0001'n9k\u001cRG+<~\u001f\u0003'i3c\u000b\u0004^78>B;";
        objectArray[149] = "5\rL\n|$g\u0013F\u001d\u000efXIC\u000ea28\fF\u001bbcX@E^6*6\u0015V\n6[";
        Object[] objectArray2 = objectArray;
        objectArray[150] = "\u0005-\u0019\u001c/L@v\u001f\u0014FLp\u001cY\u0004)\u001eP|\u001c\u0001<\u001d\u0001\u001c^\u000e!\t\u0006e\u0000\u0005|@9";
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'K' || c == 'y' || c == '\u00a2' || c == 'q') {
                field = _4t.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'K' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'y' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00a2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _4t.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'G' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'I' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _4t.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/4t" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    public void void_0(Object[] objectArray) {
        _4t t;
        int n;
        long l2;
        long l3;
        long l4;
        class_11909 class_119092;
        block9: {
            block10: {
                class_119092 = (class_11909)objectArray[0];
                l4 = (Long)objectArray[1];
                long l5 = l4 = a ^ l4;
                l3 = l5 ^ 0x2AD4632128C8L;
                l2 = l5 ^ 0xD01E3DB213EL;
                n = _4t.cfr_renamed_9();
                try {
                    try {
                        t = this;
                        if (n != 0) break block9;
                        if (_4t.b("K", (Object)t, 6634370992582340411L, (long)l4) != false) break block10;
                    }
                    catch (MatchException matchException) {
                        throw _4t.a(matchException);
                    }
                    return;
                }
                catch (MatchException matchException) {
                    throw _4t.a(matchException);
                }
            }
            t = this;
        }
        CallSite callSite = _4t.b("G", (Object)_4t.b("K", (Object)t, 6639506853226243024L, (long)l4), 6633933966223367233L, (long)l4);
        while (_4t.b("G", (Object)callSite, 6634902436541032960L, (long)l4) != false) {
            Object object;
            block12: {
                block13: {
                    _0v v;
                    block11: {
                        _0v v2 = (_0v)((Object)_4t.b("G", (Object)callSite, 6638871371815427323L, (long)l4));
                        try {
                            try {
                                v = v2;
                                if (n != 0) break block11;
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l3;
                                object = _4t.b("G", (Object)_4t.b("K", (Object)v, 6640629335228286057L, (long)l4), (Object)objectArray2, 6641808313658498452L, (long)l4);
                                if (l4 < 0L) break block12;
                                if (object == false) break block13;
                            }
                            catch (MatchException matchException) {
                                throw _4t.a(matchException);
                            }
                            v = v2;
                        }
                        catch (MatchException matchException) {
                            throw _4t.a(matchException);
                        }
                    }
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l2;
                    objectArray3[0] = class_119092;
                    _4t.b("G", (Object)v, (Object)objectArray3, 6641824596478135191L, (long)l4);
                }
                object = n;
            }
            if (object == false) continue;
        }
    }

    public boolean boolean_0(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (boolean)_4t.b("K", (Object)this, 1202565975838679961L, (long)l2);
    }

    public static int cfr_renamed_2() {
        int n = _4t.cfr_renamed_9();
        if (n == 0) {
            return 73;
        }
        return 0;
    }

    private void cfr_renamed_2(Object[] objectArray) {
        block9: {
            long l2 = (Long)objectArray[0];
            _87 var2_3 = (_87)objectArray[1];
            int n = (Integer)objectArray[2];
            int n2 = (Integer)objectArray[3];
            float f = ((Float)objectArray[4]).floatValue();
            long l3 = l2 = a ^ l2;
            long l4 = l3 ^ 0x1E604748DF9DL;
            long l5 = l3 ^ 0x44C1C23FFA4EL;
            long l6 = l3 ^ 0x6804C5FD34E3L;
            int n3 = _4t.cfr_renamed_9();
            CallSite callSite = _4t.b("G", (Object)_4t.b("K", (Object)this, -6092964601639758715L, (long)l2), -6105399505139684588L, (long)l2);
            block6: while (true) {
                Object object = _4t.b("G", (Object)callSite, -6104950177191223979L, (long)l2);
                while (object != false) {
                    _0v v;
                    block10: {
                        _0v v2 = (_0v)((Object)_4t.b("G", (Object)callSite, -6091339624440370258L, (long)l2));
                        try {
                            try {
                                try {
                                    if (l2 <= 0L || n3 != 0) break block9;
                                    v = v2;
                                    if (n3 != 0) break block10;
                                }
                                catch (MatchException matchException) {
                                    throw _4t.a(matchException);
                                }
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l4;
                                if (_4t.b("G", (Object)_4t.b("K", (Object)v, -6089581901553863876L, (long)l2), (Object)objectArray2, -6090760276054889791L, (long)l2) == false) {
                                    continue block6;
                                }
                            }
                            catch (MatchException matchException) {
                                throw _4t.a(matchException);
                            }
                        }
                        catch (MatchException matchException) {
                            throw _4t.a(matchException);
                        }
                        v = v2;
                    }
                    Object[] objectArray3 = new Object[5];
                    objectArray3[4] = Float.valueOf(f);
                    objectArray3[3] = n2;
                    objectArray3[2] = l5;
                    objectArray3[1] = n;
                    objectArray3[0] = var2_3;
                    _4t.b("G", (Object)v, (Object)objectArray3, -6105310150549177966L, (long)l2);
                    object = n3;
                    if (l2 <= 0L) continue;
                    if (object != false) break block6;
                    continue block6;
                }
                break;
            }
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = var2_3;
            objectArray4[0] = l6;
            _4t.b("G", (Object)this, (Object)objectArray4, -6105664068234881225L, (long)l2);
        }
    }

    public static void cfr_renamed_2(int n) {
        cfr_renamed_228 = n;
    }

    public void cfr_renamed_3(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        boolean bl = (Boolean)objectArray[1];
        l2 = a ^ l2;
        _4t.b("y", (Object)this, (boolean)bl, -3087372076017048050L, (long)l2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void cfr_renamed_6(Object[] var1_1) {
        block101: {
            block96: {
                block80: {
                    block81: {
                        block94: {
                            block95: {
                                block93: {
                                    block91: {
                                        block92: {
                                            block82: {
                                                block85: {
                                                    block86: {
                                                        block89: {
                                                            block90: {
                                                                block88: {
                                                                    block87: {
                                                                        block83: {
                                                                            block78: {
                                                                                block79: {
                                                                                    var4_2 = (Long)var1_1[0];
                                                                                    var2_3 = (class_11909)var1_1[1];
                                                                                    var3_4 = (Boolean)var1_1[2];
                                                                                    v0 = var4_2 = _4t.a ^ var4_2;
                                                                                    var6_5 = v0 ^ 74823339479269L;
                                                                                    var8_6 = v0 ^ 65310165277721L;
                                                                                    var10_7 = v0 ^ 28564345095129L;
                                                                                    var12_8 = v0 ^ 76621312670212L;
                                                                                    var14_9 = v0 ^ 30307943343121L;
                                                                                    var16_10 = v0 ^ 138294232551316L;
                                                                                    var18_11 = v0 ^ 45697381319834L;
                                                                                    var20_12 = v0 ^ 71922912021486L;
                                                                                    var22_13 = v0 ^ 59899478607952L;
                                                                                    var24_14 = v0 ^ 28739341135909L;
                                                                                    var26_15 = _4t.cfr_renamed_9();
                                                                                    try {
                                                                                        v1 = _4t.b("K", (Object)this, (long)8974013702399496099L, (long)var4_2);
                                                                                        if (var26_15 != 0) break block78;
                                                                                        if (v1 != false) break block79;
                                                                                    }
                                                                                    catch (MatchException v2) {
                                                                                        throw _4t.a(v2);
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                v3 = new Object[3];
                                                                                v3[2] = (double)_4t.b("G", (Object)var2_3, (long)8975001825844267221L, (long)var4_2);
                                                                                v3[1] = (double)_4t.b("G", (Object)var2_3, (long)8984946304958259313L, (long)var4_2);
                                                                                v3[0] = var8_6;
                                                                                v1 = _4t.b("G", (Object)this, (Object)v3, (long)8988567895896715285L, (long)var4_2);
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (var26_15 != 0) break block80;
                                                                                        if (v1 == false) break block81;
                                                                                    }
                                                                                    catch (MatchException v4) {
                                                                                        throw _4t.a(v4);
                                                                                    }
                                                                                    v1 = _4t.b("G", (Object)var2_3, (long)8985701822198809946L, (long)var4_2);
                                                                                    v5 = var26_15;
                                                                                    if (var4_2 >= 0L) {
                                                                                        if (v5 != 0) break block82;
                                                                                    }
                                                                                    ** GOTO lbl233
                                                                                }
                                                                                catch (MatchException v6) {
                                                                                    throw _4t.a(v6);
                                                                                }
                                                                                if (v1 == false) {
                                                                                }
                                                                                ** GOTO lbl224
                                                                            }
                                                                            catch (MatchException v7) {
                                                                                throw _4t.a(v7);
                                                                            }
                                                                            v8 = new Object[1];
                                                                            v8[0] = var10_7;
                                                                            v9 = new Object[1];
                                                                            v9[0] = var16_10;
                                                                            var27_16 = _4t.b("G", (Object)_4t.b("K", (Object)this, (long)8986382069947497785L, (long)var4_2), (Object)v8, (long)8985643539459222096L, (long)var4_2) + _4t.b("G", (Object)_4t.b("K", (Object)this, (long)8986382069947497785L, (long)var4_2), (Object)v9, (long)8974548236263422321L, (long)var4_2) - _4t.a("m", (int)17910, (long)(6481244069076699224L ^ var4_2));
                                                                            v10 = new Object[1];
                                                                            v10[0] = var14_9;
                                                                            v11 = new Object[1];
                                                                            v11[0] = var6_5;
                                                                            var28_18 = _4t.b("G", (Object)_4t.b("K", (Object)this, (long)8986382069947497785L, (long)var4_2), (Object)v10, (long)8974336136932332677L, (long)var4_2) + _4t.b("K", (Object)this, (long)8985764817635013958L, (long)var4_2) + _4t.b("G", (Object)_4t.b("K", (Object)this, (long)8986382069947497785L, (long)var4_2), (Object)v11, (long)8987603491583069123L, (long)var4_2) / 2 - 3;
                                                                            try {
                                                                                try {
                                                                                    block84: {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        cfr_temp_0 = _4t.b("G", (Object)var2_3, (long)8984946304958259313L, (long)var4_2) - (double)var27_16;
                                                                                                                        v12 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                                                                                                        if (var26_15 != 0) break block83;
                                                                                                                        if (v12 < 0) break block84;
                                                                                                                    }
                                                                                                                    catch (MatchException v13) {
                                                                                                                        throw _4t.a(v13);
                                                                                                                    }
                                                                                                                    cfr_temp_1 = _4t.b("G", (Object)var2_3, (long)8984946304958259313L, (long)var4_2) - (double)(var27_16 + _4t.a("m", (int)2698, (long)(9221865126286051105L ^ var4_2)));
                                                                                                                    v12 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                                                                                                                    if (var26_15 != 0) break block83;
                                                                                                                }
                                                                                                                catch (MatchException v14) {
                                                                                                                    throw _4t.a(v14);
                                                                                                                }
                                                                                                                if (v12 > 0) break block84;
                                                                                                            }
                                                                                                            catch (MatchException v15) {
                                                                                                                throw _4t.a(v15);
                                                                                                            }
                                                                                                            cfr_temp_2 = _4t.b("G", (Object)var2_3, (long)8975001825844267221L, (long)var4_2) - (double)var28_18;
                                                                                                            v12 = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 > 0 ? 1 : -1);
                                                                                                            if (var26_15 != 0) break block83;
                                                                                                        }
                                                                                                        catch (MatchException v16) {
                                                                                                            throw _4t.a(v16);
                                                                                                        }
                                                                                                        if (v12 < 0) break block84;
                                                                                                    }
                                                                                                    catch (MatchException v17) {
                                                                                                        throw _4t.a(v17);
                                                                                                    }
                                                                                                    cfr_temp_3 = _4t.b("G", (Object)var2_3, (long)8975001825844267221L, (long)var4_2) - (double)(var28_18 + _4t.a("m", (int)23415, (long)(9221369016370501312L ^ var4_2)));
                                                                                                    v12 = cfr_temp_3 == 0 ? 0 : (cfr_temp_3 < 0 ? -1 : 1);
                                                                                                    if (var4_2 <= 0L || var26_15 != 0) break block83;
                                                                                                }
                                                                                                catch (MatchException v18) {
                                                                                                    throw _4t.a(v18);
                                                                                                }
                                                                                                if (v12 > 0) break block84;
                                                                                            }
                                                                                            catch (MatchException v19) {
                                                                                                throw _4t.a(v19);
                                                                                            }
                                                                                            v20 = new Object[1];
                                                                                            v20[0] = var18_11;
                                                                                            _4t.b("G", (Object)_4t.b("K", (Object)this, (long)8974866572869298801L, (long)var4_2), (Object)v20, (long)8987717745689207910L, (long)var4_2);
                                                                                            v21 = var26_15;
                                                                                            if (var4_2 > 0L) {
                                                                                                if (v21 == 0) break block85;
                                                                                            }
                                                                                            ** GOTO lbl223
                                                                                        }
                                                                                        catch (MatchException v22) {
                                                                                            throw _4t.a(v22);
                                                                                        }
                                                                                    }
                                                                                    v23 = _4t.b("K", (Object)this, (long)8974866572869298801L, (long)var4_2);
                                                                                    if (var26_15 != 0) break block86;
                                                                                }
                                                                                catch (MatchException v24) {
                                                                                    throw _4t.a(v24);
                                                                                }
                                                                                v25 = new Object[1];
                                                                                v25[0] = var20_12;
                                                                                v12 = _4t.b("G", (Object)_4t.b("G", (Object)v23, (Object)v25, (long)8985406274443339335L, (long)var4_2), (long)8973736983454107393L, (long)var4_2);
                                                                            }
                                                                            catch (MatchException v26) {
                                                                                throw _4t.a(v26);
                                                                            }
                                                                        }
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        block100: {
                                                                                            if (var4_2 < 0L) break block100;
                                                                                            if (v12 != false) ** GOTO lbl210
                                                                                            v27 = new Object[1];
                                                                                            v27[0] = var10_7;
                                                                                            v28 = new Object[1];
                                                                                            v28[0] = var16_10;
                                                                                            cfr_temp_4 = _4t.b("G", (Object)var2_3, (long)8984946304958259313L, (long)var4_2) - (double)(_4t.b("G", (Object)_4t.b("K", (Object)this, (long)8986382069947497785L, (long)var4_2), (Object)v27, (long)8985643539459222096L, (long)var4_2) + _4t.b("G", (Object)_4t.b("K", (Object)this, (long)8986382069947497785L, (long)var4_2), (Object)v28, (long)8974548236263422321L, (long)var4_2) - _4t.a("m", (int)6761, (long)(178138991541278694L ^ var4_2)));
                                                                                            v12 = cfr_temp_4 == 0 ? 0 : (cfr_temp_4 > 0 ? 1 : -1);
                                                                                        }
                                                                                        if (var4_2 < 0L || var26_15 != 0) break block87;
                                                                                    }
                                                                                    catch (MatchException v29) {
                                                                                        throw _4t.a(v29);
                                                                                    }
                                                                                    if (v12 > 0) {
                                                                                    }
                                                                                    ** GOTO lbl210
                                                                                }
                                                                                catch (MatchException v30) {
                                                                                    throw _4t.a(v30);
                                                                                }
                                                                                v31 = this;
                                                                                v32 = var26_15;
                                                                                if (var4_2 > 0L) {
                                                                                    if (v32) break block88;
                                                                                }
                                                                                ** GOTO lbl194
                                                                            }
                                                                            catch (MatchException v33) {
                                                                                throw _4t.a(v33);
                                                                            }
                                                                            v12 = _4t.b("K", (Object)v31, (long)8987657331028976214L, (long)var4_2);
                                                                        }
                                                                        catch (MatchException v34) {
                                                                            throw _4t.a(v34);
                                                                        }
                                                                    }
                                                                    try {
                                                                        if (v12 == false) {
                                                                            v35 = new Object[1];
                                                                            v35[0] = var12_8;
                                                                            _4t.b("G", (Object)this, (Object)v35, (long)8974379045565684213L, (long)var4_2);
                                                                        }
                                                                    }
                                                                    catch (MatchException v36) {
                                                                        throw _4t.a(v36);
                                                                    }
                                                                    v31 = this;
                                                                }
                                                                try {
                                                                    v32 = (boolean)_4t.b("K", (Object)this, (long)8987657331028976214L, (long)var4_2);
lbl194:
                                                                    // 2 sources

                                                                    if (var26_15 != 0) break block89;
                                                                    if (v32) break block90;
                                                                }
                                                                catch (MatchException v37) {
                                                                    throw _4t.a(v37);
                                                                }
                                                                v32 = true;
                                                                break block89;
                                                            }
                                                            v32 = false;
                                                        }
                                                        try {
                                                            _4t.b("y", (Object)v31, (boolean)v32, (long)8987657331028976214L, (long)var4_2);
                                                            v21 = var26_15;
                                                            if (var4_2 >= 0L) {
                                                                if (v21 == 0) break block85;
                                                            }
                                                            ** GOTO lbl223
lbl210:
                                                            // 3 sources

                                                            v23 = _4t.b("K", (Object)this, (long)8974866572869298801L, (long)var4_2);
                                                        }
                                                        catch (MatchException v38) {
                                                            throw _4t.a(v38);
                                                        }
                                                    }
                                                    v39 = new Object[1];
                                                    v39[0] = var18_11;
                                                    _4t.b("G", (Object)v23, (Object)v39, (long)8987717745689207910L, (long)var4_2);
                                                }
                                                try {
                                                    if (var4_2 <= 0L) break block81;
                                                    v21 = var26_15;
lbl223:
                                                    // 3 sources

                                                    if (v21 == 0) break block81;
lbl224:
                                                    // 2 sources

                                                    v1 = _4t.b("G", (Object)var2_3, (long)8985701822198809946L, (long)var4_2);
                                                }
                                                catch (MatchException v40) {
                                                    throw _4t.a(v40);
                                                }
                                            }
                                            try {
                                                try {
                                                    try {
                                                        v5 = var26_15;
lbl233:
                                                        // 2 sources

                                                        if (var4_2 >= 0L) {
                                                            if (v5 != 0) break block80;
                                                            v5 = 1;
                                                        }
                                                        if (v1 != v5) break block81;
                                                    }
                                                    catch (MatchException v41) {
                                                        throw _4t.a(v41);
                                                    }
                                                    v42 = new Object[1];
                                                    v42[0] = var20_12;
                                                    v43 = _4t.b("G", (Object)_4t.b("G", (Object)_4t.b("K", (Object)this, (long)8974866572869298801L, (long)var4_2), (Object)v42, (long)8985406274443339335L, (long)var4_2), (long)8973736983454107393L, (long)var4_2);
                                                    if (var4_2 < 0L || var26_15 != 0) break block91;
                                                }
                                                catch (MatchException v44) {
                                                    throw _4t.a(v44);
                                                }
                                                if (v43 == false) break block92;
                                            }
                                            catch (MatchException v45) {
                                                throw _4t.a(v45);
                                            }
                                            return;
                                        }
                                        try {
                                            v46 = this;
                                            v47 = var26_15;
                                            if (var4_2 >= 0L) {
                                                if (v47) break block93;
                                                v43 = _4t.b("K", (Object)v46, (long)8987657331028976214L, (long)var4_2);
                                            }
                                            ** GOTO lbl278
                                        }
                                        catch (MatchException v48) {
                                            throw _4t.a(v48);
                                        }
                                    }
                                    try {
                                        if (v43 == false) {
                                            v49 = new Object[1];
                                            v49[0] = var12_8;
                                            _4t.b("G", (Object)this, (Object)v49, (long)8974379045565684213L, (long)var4_2);
                                        }
                                    }
                                    catch (MatchException v50) {
                                        throw _4t.a(v50);
                                    }
                                    v46 = this;
                                }
                                try {
                                    v47 = (boolean)_4t.b("K", (Object)this, (long)8987657331028976214L, (long)var4_2);
lbl278:
                                    // 2 sources

                                    if (var26_15 != 0) break block94;
                                    if (v47) break block95;
                                }
                                catch (MatchException v51) {
                                    throw _4t.a(v51);
                                }
                                v47 = true;
                                break block94;
                            }
                            v47 = false;
                        }
                        _4t.b("y", (Object)v46, (boolean)v47, (long)8987657331028976214L, (long)var4_2);
                    }
                    try {
                        v52 = this;
                        if (var26_15 != 0) break block96;
                        v1 = _4t.b("K", (Object)v52, (long)8987657331028976214L, (long)var4_2);
                    }
                    catch (MatchException v53) {
                        throw _4t.a(v53);
                    }
                }
                if (v1 == false) break block101;
                v52 = this;
            }
            var27_17 = _4t.b("G", (Object)_4t.b("K", (Object)v52, (long)8988156675996664648L, (long)var4_2), (long)8973540340617215193L, (long)var4_2);
            while (_4t.b("G", (Object)var27_17, (long)8974535182034061976L, (long)var4_2) != false) {
                block98: {
                    block99: {
                        block97: {
                            var28_19 = (_0v)_4t.b("G", (Object)var27_17, (long)8987530059801017443L, (long)var4_2);
                            try {
                                try {
                                    v54 = var28_19;
                                    if (var26_15 != 0) break block97;
                                    v55 = new Object[1];
                                    v55[0] = var22_13;
                                    v56 /* !! */  = _4t.b("G", (Object)_4t.b("K", (Object)v54, (long)8984784183068337393L, (long)var4_2), (Object)v55, (long)8985927925586853132L, (long)var4_2);
                                    if (var4_2 < 0L) break block98;
                                    if (v56 /* !! */  == false) break block99;
                                }
                                catch (MatchException v57) {
                                    throw _4t.a(v57);
                                }
                                v54 = var28_19;
                            }
                            catch (MatchException v58) {
                                throw _4t.a(v58);
                            }
                        }
                        v59 = new Object[3];
                        v59[2] = var24_14;
                        v59[1] = var3_4;
                        v59[0] = var2_3;
                        _4t.b("G", (Object)v54, (Object)v59, (long)8985467238517747986L, (long)var4_2);
                    }
                    v56 /* !! */  = (CallSite)var26_15;
                }
                if (v56 /* !! */  == false) continue;
            }
        }
    }

    public void cfr_renamed_7(Object[] objectArray) {
        float f;
        _4t t;
        int n;
        long l2;
        long l3;
        block5: {
            block6: {
                l3 = (Long)objectArray[0];
                l2 = (l3 = a ^ l3) ^ 0x3D89BAEA1CCAL;
                n = _4t.cfr_renamed_2();
                try {
                    try {
                        t = this;
                        f = 0.0f;
                        if (n == 0) break block5;
                        _4t.b("y", (Object)t, (float)f, -2146445526326267080L, (long)l3);
                        t = this;
                        if (_4t.b("G", (Object)_4t.b("K", (Object)this, -2159150987338222347L, (long)l3), -2145689148955881904L, (long)l3) == false) break block6;
                    }
                    catch (MatchException matchException) {
                        throw _4t.a(matchException);
                    }
                    f = 1.0f;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw _4t.a(matchException);
                }
            }
            f = 0.0f;
        }
        _4t.b("y", (Object)t, (float)f, -2146577938531351240L, (long)l3);
        CallSite callSite = _4t.b("G", (Object)_4t.b("K", (Object)this, -2145860884206592564L, (long)l3), -2158229860772486563L, (long)l3);
        while (_4t.b("G", (Object)callSite, -2157239374486350820L, (long)l3) != false) {
            _0v v = (_0v)((Object)_4t.b("G", (Object)callSite, -2144248894728035609L, (long)l3));
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l2;
            _4t.b("G", (Object)v, (Object)objectArray2, -2144694150849640051L, (long)l3);
            if (n != 0) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    public boolean boolean_5(Object[] var1_1) {
        block20: {
            block17: {
                block19: {
                    block18: {
                        block16: {
                            var2_2 = (Long)var1_1[0];
                            var4_3 = (Double)var1_1[1];
                            var6_4 = (Double)var1_1[2];
                            v0 = var2_2 = _4t.a ^ var2_2;
                            var8_5 = v0 ^ 36527833637023L;
                            var10_6 = v0 ^ 137229602845603L;
                            var12_7 = v0 ^ 139249150858347L;
                            var14_8 = v0 ^ 27430958235630L;
                            var16_9 = _4t.cfr_renamed_2();
                            try {
                                try {
                                    v1 = new Object[1];
                                    v1[0] = var10_6;
                                    cfr_temp_0 = var4_3 - (double)_4t.b("G", (Object)_4t.b("K", (Object)this, (long)922234982464130371L, (long)var2_2), (Object)v1, (long)921283013577169450L, (long)var2_2);
                                    v2 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                    if (var16_9 == 0) break block16;
                                    if (v2 <= 0) break block17;
                                }
                                catch (MatchException v3) {
                                    throw _4t.a(v3);
                                }
                                v4 = new Object[1];
                                v4[0] = var10_6;
                                v5 = new Object[1];
                                v5[0] = var14_8;
                                cfr_temp_1 = var4_3 - (double)(_4t.b("G", (Object)_4t.b("K", (Object)this, (long)922234982464130371L, (long)var2_2), (Object)v4, (long)921283013577169450L, (long)var2_2) + _4t.b("G", (Object)_4t.b("K", (Object)this, (long)922234982464130371L, (long)var2_2), (Object)v5, (long)934045194058762507L, (long)var2_2));
                                v2 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                            }
                            catch (MatchException v6) {
                                throw _4t.a(v6);
                            }
                        }
                        try {
                            try {
                                v7 = var16_9;
                                if (var2_2 >= 0L) {
                                    if (v7 == 0) break block18;
                                    if (v2 >= 0) break block17;
                                }
                                ** GOTO lbl58
                            }
                            catch (MatchException v8) {
                                throw _4t.a(v8);
                            }
                            v9 = new Object[1];
                            v9[0] = var12_7;
                            cfr_temp_2 = var6_4 - (double)(_4t.b("G", (Object)_4t.b("K", (Object)this, (long)922234982464130371L, (long)var2_2), (Object)v9, (long)932625686073697535L, (long)var2_2) + _4t.b("K", (Object)this, (long)921474632576927036L, (long)var2_2));
                            v2 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                        }
                        catch (MatchException v10) {
                            throw _4t.a(v10);
                        }
                    }
                    try {
                        try {
                            v7 = var16_9;
lbl58:
                            // 2 sources

                            if (var2_2 >= 0L) {
                                if (v7 == 0) break block19;
                                if (v2 <= 0) break block17;
                            }
                            ** GOTO lbl79
                        }
                        catch (MatchException v11) {
                            throw _4t.a(v11);
                        }
                        v12 = new Object[1];
                        v12[0] = var12_7;
                        v13 = new Object[1];
                        v13[0] = var8_5;
                        cfr_temp_3 = var6_4 - (double)(_4t.b("G", (Object)_4t.b("K", (Object)this, (long)922234982464130371L, (long)var2_2), (Object)v12, (long)932625686073697535L, (long)var2_2) + _4t.b("K", (Object)this, (long)921474632576927036L, (long)var2_2) + _4t.b("G", (Object)_4t.b("K", (Object)this, (long)922234982464130371L, (long)var2_2), (Object)v13, (long)918739771071724473L, (long)var2_2));
                        v2 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                    }
                    catch (MatchException v14) {
                        throw _4t.a(v14);
                    }
                }
                try {
                    v7 = var16_9;
lbl79:
                    // 2 sources

                    if (v7 == 0) break block20;
                    if (v2 >= 0) break block17;
                }
                catch (MatchException v15) {
                    throw _4t.a(v15);
                }
                v2 = (double)true;
                break block20;
            }
            v2 = (double)false;
        }
        return (boolean)v2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void void_5(Object[] var1_1) {
        block49: {
            block48: {
                block45: {
                    block46: {
                        block43: {
                            block41: {
                                block42: {
                                    block40: {
                                        block39: {
                                            var2_2 = (_87)var1_1[0];
                                            var7_3 = (Integer)var1_1[1];
                                            var6_4 = (Integer)var1_1[2];
                                            var3_5 = (Integer)var1_1[3];
                                            var8_6 = (Integer)var1_1[4];
                                            var4_7 = (Long)var1_1[5];
                                            v0 = var4_7 = _4t.a ^ var4_7;
                                            var9_8 = v0 ^ 73201902073206L;
                                            var11_9 = v0 ^ 35181850390241L;
                                            var13_10 = v0 ^ 44188205216647L;
                                            var16_11 = (int)(230.0f * _4t.b("K", (Object)this, (long)2263812620054721847L, (long)var4_7));
                                            var17_12 = var16_11 << _4t.a("m", (int)11485, (long)(112137751678943921L ^ var4_7)) | _4t.a("m", (int)21357, (long)(5216625854864358714L ^ var4_7));
                                            var15_13 = _4t.cfr_renamed_2();
                                            try {
                                                cfr_temp_0 = _4t.b("K", (Object)this, (long)2257764974368411227L, (long)var4_7) - 0.01f;
                                                v1 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                                if (var15_13 == 0) break block39;
                                                if (v1 /* !! */  > 0) {
                                                }
                                                ** GOTO lbl39
                                            }
                                            catch (MatchException v2) {
                                                throw _4t.a(v2);
                                            }
                                            var19_14 /* !! */  = (int)(20.0f * _4t.b("K", (Object)this, (long)2263812620054721847L, (long)var4_7));
                                            var20_15 = var19_14 /* !! */  << _4t.a("m", (int)23600, (long)(7090104339292287572L ^ var4_7)) | _4t.a("m", (int)21907, (long)(1510229112728746964L ^ var4_7));
                                            v3 = new Object[4];
                                            v3[3] = var9_8;
                                            v3[2] = Float.valueOf((float)_4t.b("K", (Object)this, (long)2257764974368411227L, (long)var4_7));
                                            v3[1] = var20_15;
                                            v3[0] = var17_12;
                                            var18_16 = _4t.b("I", (Object)v3, (long)2259767893144049617L, (long)var4_7);
                                            try {
                                                v4 /* !! */  = (CallSite)var15_13;
                                                if (var4_7 > 0L) {
                                                    if (v4 /* !! */  != false) break block40;
                                                }
                                                ** GOTO lbl49
lbl39:
                                                // 2 sources

                                                v1 /* !! */  = (CallSite)var17_12;
                                            }
                                            catch (MatchException v5) {
                                                throw _4t.a(v5);
                                            }
                                        }
                                        var18_16 = v1 /* !! */ ;
                                    }
                                    try {
                                        try {
                                            v4 /* !! */  = _4t.b("K", (Object)this, (long)2256952212348092080L, (long)var4_7);
lbl49:
                                            // 2 sources

                                            v6 /* !! */  = var15_13;
                                            if (var4_7 > 0L) {
                                                if (v6 /* !! */  == 0) break block41;
                                                v6 /* !! */  = (int)(_4t.b("G", (Object)_4t.b("K", (Object)_4t.b("K", (Object)this, (long)2256715209611648734L, (long)var4_7), (long)2264616663296980330L, (long)var4_7), (long)2256859144419806707L, (long)var4_7) - true);
                                            }
                                            if (v4 /* !! */  != v6 /* !! */ ) break block42;
                                        }
                                        catch (MatchException v7) {
                                            throw _4t.a(v7);
                                        }
                                        v4 /* !! */  = (CallSite)true;
                                        break block41;
                                    }
                                    catch (MatchException v8) {
                                        throw _4t.a(v8);
                                    }
                                }
                                v4 /* !! */  = (CallSite)false;
                            }
                            var19_14 /* !! */  = (int)v4 /* !! */ ;
                            try {
                                block44: {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    v9 = var19_14 /* !! */ ;
                                                    if (var15_13 == 0) break block43;
                                                    if (v9 == 0) break block44;
                                                }
                                                catch (MatchException v10) {
                                                    throw _4t.a(v10);
                                                }
                                                v9 = (int)_4t.b("K", (Object)this, (long)2260225229183615409L, (long)var4_7);
                                                v11 = var15_13;
                                                if (var4_7 > 0L) {
                                                    if (v11 == 0) break block43;
                                                }
                                                ** GOTO lbl128
                                            }
                                            catch (MatchException v12) {
                                                throw _4t.a(v12);
                                            }
                                            if (var4_7 <= 0L) break block43;
                                            if (v9 == 0) {
                                            }
                                            break block44;
                                        }
                                        catch (MatchException v13) {
                                            throw _4t.a(v13);
                                        }
                                        v14 = new Object[10];
                                        v14[9] = 6.0;
                                        v14[8] = 6.0;
                                        v14[7] = 0.0;
                                        v14[6] = 0.0;
                                        v14[5] = (double)(var6_4 + var8_6);
                                        v14[4] = var11_9;
                                        v14[3] = (double)(var7_3 + var3_5);
                                        v14[2] = (double)var6_4;
                                        v14[1] = (double)var7_3;
                                        v14[0] = (int)var18_16;
                                        _4t.b("G", (Object)var2_2, (Object)v14, (long)2260726071015989340L, (long)var4_7);
                                        v9 = var15_13;
                                        if (var4_7 > 0L) {
                                            if (v9 != 0) break block45;
                                        }
                                        ** GOTO lbl193
                                    }
                                    catch (MatchException v15) {
                                        throw _4t.a(v15);
                                    }
                                }
                                v9 = var19_14 /* !! */ ;
                            }
                            catch (MatchException v16) {
                                throw _4t.a(v16);
                            }
                        }
                        try {
                            try {
                                if (var4_7 <= 0L) break block46;
                                v11 = var15_13;
lbl128:
                                // 2 sources

                                if (v11 == 0) break block46;
                                if (v9 != 0) {
                                }
                                ** GOTO lbl172
                            }
                            catch (MatchException v17) {
                                throw _4t.a(v17);
                            }
                            v9 = (int)_4t.b("K", (Object)this, (long)2260225229183615409L, (long)var4_7);
                        }
                        catch (MatchException v18) {
                            throw _4t.a(v18);
                        }
                    }
                    try {
                        block47: {
                            try {
                                if (var4_7 > 0L) {
                                    if (v9 == 0) break block47;
                                    v19 = new Object[10];
                                    v19[9] = 0.0;
                                    v19[8] = 0.0;
                                    v19[7] = 0.0;
                                    v19[6] = 0.0;
                                    v19[5] = (double)(var6_4 + var8_6);
                                    v19[4] = var11_9;
                                    v19[3] = (double)(var7_3 + var3_5);
                                    v19[2] = (double)var6_4;
                                    v19[1] = (double)var7_3;
                                    v19[0] = (int)var18_16;
                                    _4t.b("G", (Object)var2_2, (Object)v19, (long)2260726071015989340L, (long)var4_7);
                                    v9 = var15_13;
                                }
                                if (var4_7 > 0L) {
                                    if (v9 != 0) break block45;
                                }
                                ** GOTO lbl193
                            }
                            catch (MatchException v20) {
                                throw _4t.a(v20);
                            }
                        }
                        v21 = new Object[6];
                        v21[5] = (int)var18_16;
                        v21[4] = var13_10;
                        v21[3] = (double)(var6_4 + var8_6);
                        v21[2] = (double)(var7_3 + var3_5);
                        v21[1] = (double)var6_4;
                        v21[0] = (double)var7_3;
                        _4t.b("G", (Object)var2_2, (Object)v21, (long)2258945562464401954L, (long)var4_7);
                    }
                    catch (MatchException v22) {
                        throw _4t.a(v22);
                    }
                }
                try {
                    try {
                        v9 = (int)_4t.b("K", (Object)this, (long)2256952212348092080L, (long)var4_7);
lbl193:
                        // 3 sources

                        if (var15_13 == 0) break block48;
                        if (v9 <= 0) break block49;
                    }
                    catch (MatchException v23) {
                        throw _4t.a(v23);
                    }
                    v9 = (int)(100.0f * _4t.b("K", (Object)this, (long)2263812620054721847L, (long)var4_7));
                }
                catch (MatchException v24) {
                    throw _4t.a(v24);
                }
            }
            var20_15 = v9;
            v25 = new Object[6];
            v25[5] = var20_15 << _4t.a("m", (int)23600, (long)(7090104339292287572L ^ var4_7)) | _4t.a("m", (int)26569, (long)(4573960894455662992L ^ var4_7));
            v25[4] = var13_10;
            v25[3] = (double)(var6_4 + 1);
            v25[2] = (double)(var7_3 + var3_5 - 4);
            v25[1] = (double)var6_4;
            v25[0] = (double)(var7_3 + 4);
            _4t.b("G", (Object)var2_2, (Object)v25, (long)2258945562464401954L, (long)var4_7);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void cfr_renamed_9(Object[] var1_1) {
        var3_2 = (Long)var1_1[0];
        var2_3 = (_87)var1_1[1];
        v0 = var3_2 = _4t.a ^ var3_2;
        var5_4 = v0 ^ 114934832291726L;
        var7_5 = v0 ^ 44218057230109L;
        var9_6 = v0 ^ 19754433867354L;
        var11_7 = v0 ^ 52851488406351L;
        var13_8 = v0 ^ 8825046785761L;
        var15_9 = _4t.cfr_renamed_9();
        var16_10 = _4t.b("G", (Object)_4t.b("K", (Object)this, (long)8354536493077449733L, (long)var3_2), (long)8342202701087339412L, (long)var3_2);
        block8: while (true) {
            v1 /* !! */  = _4t.b("G", (Object)var16_10, (long)8342613194486826453L, (long)var3_2);
            while (v1 /* !! */  != false) {
                block19: {
                    block20: {
                        block21: {
                            block18: {
                                block16: {
                                    block17: {
                                        var17_11 = (_0v)_4t.b("G", (Object)var16_10, (long)8356148413416911662L, (long)var3_2);
                                        try {
                                            v2 = new Object[1];
                                            v2[0] = var7_5;
                                            v3 /* !! */  = _4t.b("G", (Object)_4t.b("K", (Object)var17_11, (long)8357911049771101116L, (long)var3_2), (Object)v2, (long)8356837695323959873L, (long)var3_2);
                                            v4 = var15_9;
                                            if (var3_2 > 0L) {
                                                if (v4 != 0) break block16;
                                                if (v3 /* !! */  != false) break block17;
                                            }
                                            ** GOTO lbl36
                                        }
                                        catch (MatchException v5) {
                                            throw _4t.a(v5);
                                        }
                                        if (var3_2 >= 0L) continue block8;
                                    }
                                    v3 /* !! */  = (CallSite)(var17_11 instanceof _0N);
                                }
                                try {
                                    v4 = var15_9;
lbl36:
                                    // 2 sources

                                    if (v4 != 0) break block18;
                                    if (v3 /* !! */  != false) {
                                    }
                                    ** GOTO lbl70
                                }
                                catch (MatchException v6) {
                                    throw _4t.a(v6);
                                }
                                var18_12 = (_0N)var17_11;
                                v7 = new Object[1];
                                v7[0] = var5_4;
                                v8 = new Object[1];
                                v8[0] = var13_8;
                                var20_14 = (double)(_4t.b("G", (Object)var18_12, (Object)v7, (long)8354376926733249823L, (long)var3_2) + _4t.b("K", (Object)var18_12, (long)8358035162044681345L, (long)var3_2) + _4t.b("G", (Object)var18_12, (Object)v8, (long)8355254548732709098L, (long)var3_2)) + 27.0;
                                try {
                                    try {
                                        v9 = new Object[1];
                                        v9[0] = var9_6;
                                        v10 = new Object[6];
                                        v10[5] = Float.valueOf((float)_4t.b("K", (Object)var18_12, (long)8354927578330814431L, (long)var3_2));
                                        v10[4] = var11_7;
                                        v10[3] = _4t.b("K", (Object)var18_12, (long)8357633934781533989L, (long)var3_2);
                                        v10[2] = var20_14;
                                        v10[1] = (double)_4t.b("G", (Object)var18_12, (Object)v9, (long)8357408011612721190L, (long)var3_2) + _4t.b("K", (Object)var18_12, (long)8357508845897665784L, (long)var3_2);
                                        v10[0] = var2_3;
                                        _4t.b("G", (Object)this, (Object)v10, (long)8357758810705889260L, (long)var3_2);
                                        v1 /* !! */  = (CallSite)var15_9;
                                        if (var3_2 <= 0L) break block19;
                                        if (v1 /* !! */  == false) break block20;
lbl70:
                                        // 2 sources

                                        v11 = var17_11;
                                        if (var15_9 != 0) break block21;
                                    }
                                    catch (MatchException v12) {
                                        throw _4t.a(v12);
                                    }
                                    v3 /* !! */  = (CallSite)(v11 instanceof _0L);
                                }
                                catch (MatchException v13) {
                                    throw _4t.a(v13);
                                }
                            }
                            if (v3 /* !! */  == false) break block20;
                            v11 = var17_11;
                        }
                        var19_13 = (_0L)v11;
                        v14 = new Object[1];
                        v14[0] = var5_4;
                        v15 = new Object[1];
                        v15[0] = var13_8;
                        var20_14 = (double)(_4t.b("G", (Object)var19_13, (Object)v14, (long)8354376926733249823L, (long)var3_2) + _4t.b("K", (Object)var19_13, (long)8358035162044681345L, (long)var3_2) + _4t.b("G", (Object)var19_13, (Object)v15, (long)8355254548732709098L, (long)var3_2)) + 27.5;
                        v16 = new Object[1];
                        v16[0] = var9_6;
                        v17 = new Object[6];
                        v17[5] = Float.valueOf(0.0f);
                        v17[4] = var11_7;
                        v17[3] = _4t.b("K", (Object)var19_13, (long)8357633934781533989L, (long)var3_2);
                        v17[2] = var20_14;
                        v17[1] = (double)_4t.b("G", (Object)var19_13, (Object)v16, (long)8357408011612721190L, (long)var3_2) + _4t.b("I", (double)_4t.b("K", (Object)var19_13, (long)8355991940180914958L, (long)var3_2), (double)2.5, (long)8354661500370565511L, (long)var3_2);
                        v17[0] = var2_3;
                        _4t.b("G", (Object)this, (Object)v17, (long)8357758810705889260L, (long)var3_2);
                        v18 = new Object[1];
                        v18[0] = var9_6;
                        v19 = new Object[6];
                        v19[5] = Float.valueOf(0.0f);
                        v19[4] = var11_7;
                        v19[3] = _4t.b("K", (Object)var19_13, (long)8357633934781533989L, (long)var3_2);
                        v19[2] = var20_14;
                        v19[1] = (double)_4t.b("G", (Object)var19_13, (Object)v18, (long)8357408011612721190L, (long)var3_2) + _4t.b("I", (double)_4t.b("K", (Object)var19_13, (long)8340794944473440786L, (long)var3_2), (double)2.5, (long)8354661500370565511L, (long)var3_2);
                        v19[0] = var2_3;
                        _4t.b("G", (Object)this, (Object)v19, (long)8357758810705889260L, (long)var3_2);
                    }
                    v1 /* !! */  = (CallSite)var15_9;
                }
                if (var3_2 <= 0L) continue;
                if (v1 /* !! */  != false) break block8;
                continue block8;
            }
            break;
        }
    }

    public static int cfr_renamed_9() {
        return cfr_renamed_228;
    }

    public void cfr_renamed_0(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        int n = _4t.cfr_renamed_9();
        CallSite callSite = _4t.b("G", (Object)_4t.b("K", (Object)_4t.b("K", (Object)this, 3085266037824465758L, (long)l2), 3093391581428449514L, (long)l2), 3093815272617945790L, (long)l2);
        while (_4t.b("G", (Object)callSite, 3093110716237913343L, (long)l2) != false) {
            _4t t = (_4t)((Object)_4t.b("G", (Object)callSite, 3088630437265271300L, (long)l2));
            _4t.b("y", (Object)t, (boolean)_4t.a("m", 1507, (long)(0x212AAEE6EE9F9E28L ^ l2)), 3088775850164270129L, (long)l2);
            if (n == 0) continue;
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_4t.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_4t.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

