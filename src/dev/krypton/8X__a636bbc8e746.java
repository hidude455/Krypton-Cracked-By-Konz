/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1799
 */
package dev.krypton;

import dev.krypton._3C;
import dev.krypton._4r;
import dev.krypton._5R;
import dev.krypton._8B;
import dev.krypton._8b_0;
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
import net.minecraft.class_1799;

public class _8X {
    private final String cfr_renamed_410;
    private final boolean cfr_renamed_3;
    private final _4r cfr_renamed_0;
    private final long cfr_renamed_7;
    private final String cfr_renamed_4;
    private final String cfr_renamed_2;
    private final class_1799 cfr_renamed_1;
    private final _8B cfr_renamed_8;
    private final long cfr_renamed_56;
    private final _8b_0 cfr_renamed_5;
    private float cfr_renamed_6;
    private boolean cfr_renamed_411;
    final _5R cfr_renamed_9;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static final long[] h;
    private static final Long[] i;
    private static final Map j;
    private static final Object[] k;
    private static final String[] l;

    public String java_lang_String_1(Object[] objectArray) {
        CallSite callSite;
        block6: {
            _8X x;
            long l2;
            block4: {
                block5: {
                    l2 = (Long)objectArray[0];
                    long l3 = (l2 = a ^ l2) ^ 0x9A8A98A023DL;
                    int n = _3C.cfr_renamed_7();
                    try {
                        try {
                            x = this;
                            if (n == 0) break block4;
                            Object[] objectArray2 = new Object[1];
                            objectArray2[0] = l3;
                            if (_8X.d("l", (Object)x, (Object)objectArray2, 1255340945689625985L, (long)l2) == false) break block5;
                        }
                        catch (MatchException matchException) {
                            throw _8X.a(matchException);
                        }
                        callSite = _8X.d("\u00e3", (Object)this, 1255943064726864896L, (long)l2);
                        break block6;
                    }
                    catch (MatchException matchException) {
                        throw _8X.a(matchException);
                    }
                }
                x = this;
            }
            callSite = _8X.d("\u00e3", (Object)x, 1254350367422542310L, (long)l2);
        }
        return callSite;
    }

    public boolean boolean_1(Object[] objectArray) {
        boolean bl;
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        try {
            bl = _8X.d("\u00e3", (Object)this, -7205135547704243860L, (long)l2) != null;
        }
        catch (MatchException matchException) {
            throw _8X.a(matchException);
        }
        return bl;
    }

    private long long_1(Object[] objectArray) {
        Object object;
        block6: {
            CallSite callSite;
            block4: {
                long l2;
                long l3;
                block5: {
                    l3 = (Long)objectArray[0];
                    long l4 = l3 = a ^ l3;
                    long l5 = l4 ^ 0x7DEC824DE4B5L;
                    l2 = l4 ^ 0x19FFA02B7A52L;
                    int n = _3C.cfr_renamed_7();
                    try {
                        try {
                            Object[] objectArray2 = new Object[1];
                            objectArray2[0] = l5;
                            callSite = _8X.d("l", (Object)this, (Object)objectArray2, -584436934859644151L, (long)l3);
                            if (n == 0) break block4;
                            if (callSite == false) break block5;
                        }
                        catch (MatchException matchException) {
                            throw _8X.a(matchException);
                        }
                        object = _8X.d("\u00e3", (Object)this, -583448060756676292L, (long)l3);
                        break block6;
                    }
                    catch (MatchException matchException) {
                        throw _8X.a(matchException);
                    }
                }
                Object[] objectArray3 = new Object[1];
                objectArray3[0] = l2;
                callSite = _8X.d("l", (Object)_8X.d("\u00e3", (Object)_8X.d("\u00e3", (Object)this, -583872973700299709L, (long)l3), -582155067232388677L, (long)l3), (Object)objectArray3, -584534722591362467L, (long)l3);
            }
            object = (long)callSite;
        }
        return object;
    }

    public _8X(_5R r, String string, boolean bl, long l2, _4r r2) {
        l2 = a ^ l2;
        this.cfr_renamed_9 = r;
        _8X.d("F", (Object)this, 0.0f, -5373401994376952513L, (long)l2);
        _8X.d("F", (Object)this, (boolean)_8X.b("s", 26161, (long)(0x662AA1C4BF5713D6L ^ l2)), -5374098668913336073L, (long)l2);
        this.cfr_renamed_410 = string;
        this.cfr_renamed_3 = bl;
        this.cfr_renamed_0 = r2;
        this.cfr_renamed_7 = (long)_8X.d("O", -5374861852961591047L, (long)l2);
        this.cfr_renamed_4 = null;
        this.cfr_renamed_2 = null;
        this.cfr_renamed_1 = null;
        this.cfr_renamed_8 = null;
        this.cfr_renamed_56 = (long)_8X.c("q", 8385, (long)(0x14F8EDCE38D0196FL ^ l2));
        this.cfr_renamed_5 = null;
    }

    public _8X(_5R r, _8b_0 b_0, String string, String string2, class_1799 class_17992, long l2, long l3) {
        CallSite callSite;
        block4: {
            block3: {
                _8b_0 b_02;
                block2: {
                    l3 = a ^ l3;
                    this.cfr_renamed_9 = r;
                    int n = _3C.cfr_renamed_7();
                    int n2 = n;
                    try {
                        _8X.d("F", (Object)this, 0.0f, -8274013834233283202L, (long)l3);
                        _8X.d("F", (Object)this, (boolean)_8X.b("s", 26161, (long)(0x662ABADEE9452B97L ^ l3)), -8274723705660680010L, (long)l3);
                        this.cfr_renamed_410 = null;
                        this.cfr_renamed_3 = _8X.b("s", 28420, (long)(0x44D1F32B9E8022A1L ^ l3));
                        this.cfr_renamed_0 = null;
                        this.cfr_renamed_7 = (long)_8X.d("O", -8274875559029307208L, (long)l3);
                        this.cfr_renamed_4 = string;
                        this.cfr_renamed_2 = string2;
                        this.cfr_renamed_1 = class_17992;
                        _8X x = this;
                        b_02 = b_0;
                        if (n2 == 0) break block2;
                        if (b_02 == null) break block3;
                    }
                    catch (MatchException matchException) {
                        throw _8X.a(matchException);
                    }
                    b_02 = b_0;
                }
                callSite = _8X.d("l", (Object)((Object)b_02), -8274286128945541065L, (long)l3);
                break block4;
            }
            callSite = null;
        }
        x.cfr_renamed_8 = callSite;
        this.cfr_renamed_56 = l2;
        this.cfr_renamed_5 = b_0;
    }

    public _8X(_5R r, String string, String string2, class_1799 class_17992, _8B b, long l2, long l3) {
        l3 = a ^ l3;
        this.cfr_renamed_9 = r;
        _8X.d("F", (Object)this, 0.0f, 3844553461553153288L, (long)l3);
        _8X.d("F", (Object)this, (boolean)_8X.b("s", 1047, (long)(0x296109C4A4F9F1C5L ^ l3)), 3844970042472259776L, (long)l3);
        this.cfr_renamed_410 = null;
        this.cfr_renamed_3 = _8X.b("s", 18963, (long)(0x2EC77B2380A4BFCFL ^ l3));
        this.cfr_renamed_0 = null;
        this.cfr_renamed_7 = (long)_8X.d("O", 3846049639979266254L, (long)l3);
        this.cfr_renamed_4 = string;
        this.cfr_renamed_2 = string2;
        this.cfr_renamed_1 = class_17992;
        this.cfr_renamed_8 = b;
        this.cfr_renamed_56 = l2;
        this.cfr_renamed_5 = null;
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
                            _8X.a = dev.krypton.l.a(4765425565686179021L, 593114843564327834L, MethodHandles.lookup().lookupClass()).a(142894580053814L);
                            _8X.k = new Object[60];
                            _8X.l = new String[60];
                            _8X.a();
                            _8X.d = new HashMap<K, V>(13);
                            var22 = _8X.a ^ 48047489908257L;
                            var24_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                            v0 = SecretKeyFactory.getInstance("DES");
                            v1 = new byte[8];
                            v2 = v1;
                            v1[0] = (byte)(var22 >>> 56);
                            for (var25_2 = 1; var25_2 < 8; ++var25_2) {
                                v2 = v2;
                                v2[var25_2] = (byte)(var22 << var25_2 * 8 >>> 56);
                            }
                            var24_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                            var31_3 = new String[2];
                            var29_4 = 0;
                            var28_5 = "\u0098\u0012U\u00bd4U\u008dh\u00cfN\u00c8\u00d5-\u00e0\u00a9XG\u00e6Q\u009c\u00bc\u009d\u00cc{\u00bb\u0007\u0013\u0089s\u00f7\u0080\u00dc\u008c\u00b5\u00a4\u00c4\u00ec\u0088\u00a2Q(\u009d\u0084\u0087-\u00a4~\u00cd\u00bf\u00e4\u00ab\u00c1\u00a5\u008e\u00de\u00b5\u00cb\u0016\u00e3`\u0012w\"5\u000f\u00b6\u00e2@n\u00ea-7\u00ca\u0095<\u00f3\u009e\u00c0\u0013\u00fb?";
                            var30_6 = "\u0098\u0012U\u00bd4U\u008dh\u00cfN\u00c8\u00d5-\u00e0\u00a9XG\u00e6Q\u009c\u00bc\u009d\u00cc{\u00bb\u0007\u0013\u0089s\u00f7\u0080\u00dc\u008c\u00b5\u00a4\u00c4\u00ec\u0088\u00a2Q(\u009d\u0084\u0087-\u00a4~\u00cd\u00bf\u00e4\u00ab\u00c1\u00a5\u008e\u00de\u00b5\u00cb\u0016\u00e3`\u0012w\"5\u000f\u00b6\u00e2@n\u00ea-7\u00ca\u0095<\u00f3\u009e\u00c0\u0013\u00fb?".length();
                            var27_7 = 40;
                            var26_8 = -1;
lbl23:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl25:
                            // 1 sources

                            while (true) {
                                var31_3[var29_4++] = _8X.a(var32_9).intern();
                                if ((var26_8 += var27_7) < var30_6) {
                                    var27_7 = var28_5.charAt(var26_8);
                                    ** continue;
                                }
                                break block20;
                                break;
                            }
                            v3 = ++var26_8;
                            var32_9 = var24_1.doFinal(var28_5.substring(v3, v3 + var27_7).getBytes("ISO-8859-1"));
                            ** while (true)
                        }
                        _8X.b = var31_3;
                        _8X.c = new String[2];
                        _8X.g = new HashMap<K, V>(13);
                        var11_10 = Cipher.getInstance("DES/CBC/NoPadding");
                        v4 = SecretKeyFactory.getInstance("DES");
                        v5 = new byte[8];
                        v6 = v5;
                        v5[0] = (byte)(var22 >>> 56);
                        for (var12_11 = 1; var12_11 < 8; ++var12_11) {
                            v6 = v6;
                            v6[var12_11] = (byte)(var22 << var12_11 * 8 >>> 56);
                        }
                        var11_10.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                        var17_12 = new long[18];
                        var14_13 = 0;
                        var15_14 = "\u00cb\u00a5\u00a5\u00fb\u00e6NK\u00d0\u000f:\u008d+\u00e4\u0014\u0010z+\u008d3\u00ae3\u00e6\u00d8kH\u000e\u00ee\u0098\u0085\u00cdn\u000eB\u00fb\u00a2M\u001d\u0096\u00fb\u00a5\u0016\u00c5~\u00db\n,\u00cf\u0082\u00eb&\u00cb\u00be\u009a\u00ad\u00ad{\u00db\"\u00a2n+\u0093\u0099\u00f9\u00d6\u00c3\u00df9\u00ed\u00cb}\u00a6\u00bbc\t\u001a\u00d0\u0086\u00efaH\u0091\u008fl\u00b1\u00e5\u0088\u00cc$\u00c2\u00bc\\\u0010\u0093\u00e9\u009e\u008a\u00f3\u0003\u00a4\u0019}-\u000b\u00a3\u00f4\u0003\u00d8\u0017\u0005P\u00c6\u00a1\u0004\u00e3,/\u0092\u0004P U\u00c5@\u00c4\u008a\u00b1\u00db";
                        var16_15 = "\u00cb\u00a5\u00a5\u00fb\u00e6NK\u00d0\u000f:\u008d+\u00e4\u0014\u0010z+\u008d3\u00ae3\u00e6\u00d8kH\u000e\u00ee\u0098\u0085\u00cdn\u000eB\u00fb\u00a2M\u001d\u0096\u00fb\u00a5\u0016\u00c5~\u00db\n,\u00cf\u0082\u00eb&\u00cb\u00be\u009a\u00ad\u00ad{\u00db\"\u00a2n+\u0093\u0099\u00f9\u00d6\u00c3\u00df9\u00ed\u00cb}\u00a6\u00bbc\t\u001a\u00d0\u0086\u00efaH\u0091\u008fl\u00b1\u00e5\u0088\u00cc$\u00c2\u00bc\\\u0010\u0093\u00e9\u009e\u008a\u00f3\u0003\u00a4\u0019}-\u000b\u00a3\u00f4\u0003\u00d8\u0017\u0005P\u00c6\u00a1\u0004\u00e3,/\u0092\u0004P U\u00c5@\u00c4\u008a\u00b1\u00db".length();
                        var13_16 = 0;
                        while (true) {
                            var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                            v7 = var17_12;
                            v8 = var14_13++;
                            v9 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                            v10 = -1;
                            break block21;
                            break;
                        }
lbl61:
                        // 1 sources

                        while (true) {
                            v7[v8] = v11;
                            if (var13_16 < var16_15) ** continue;
                            var15_14 = "\u001bM\u00a6\u009b0\u0090\u0082\u00c3\u00dd\u00c1\u0015\u0018 1\u00db\u00ff";
                            var16_15 = "\u001bM\u00a6\u009b0\u0090\u0082\u00c3\u00dd\u00c1\u0015\u0018 1\u00db\u00ff".length();
                            var13_16 = 0;
                            while (true) {
                                var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                                v7 = var17_12;
                                v8 = var14_13++;
                                v9 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                                v10 = 0;
                                break block21;
                                break;
                            }
                            break;
                        }
lbl74:
                        // 1 sources

                        while (true) {
                            v7[v8] = v11;
                            if (var13_16 < var16_15) ** continue;
                            break block22;
                            break;
                        }
                    }
                    var19_18 = v9;
                    var21_19 = var11_10.doFinal(new byte[]{(byte)(var19_18 >>> 56), (byte)(var19_18 >>> 48), (byte)(var19_18 >>> 40), (byte)(var19_18 >>> 32), (byte)(var19_18 >>> 24), (byte)(var19_18 >>> 16), (byte)(var19_18 >>> 8), (byte)var19_18});
                    v11 = ((long)var21_19[0] & 255L) << 56 | ((long)var21_19[1] & 255L) << 48 | ((long)var21_19[2] & 255L) << 40 | ((long)var21_19[3] & 255L) << 32 | ((long)var21_19[4] & 255L) << 24 | ((long)var21_19[5] & 255L) << 16 | ((long)var21_19[6] & 255L) << 8 | (long)var21_19[7] & 255L;
                    switch (v10) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl87:
                        // 1 sources

                        ** continue;
                    }
                }
                _8X.e = var17_12;
                _8X.f = new Integer[18];
                _8X.j = new HashMap<K, V>(13);
                var0_20 = Cipher.getInstance("DES/CBC/NoPadding");
                v12 = SecretKeyFactory.getInstance("DES");
                v13 = new byte[8];
                v14 = v13;
                v13[0] = (byte)(var22 >>> 56);
                for (var1_21 = 1; var1_21 < 8; ++var1_21) {
                    v14 = v14;
                    v14[var1_21] = (byte)(var22 << var1_21 * 8 >>> 56);
                }
                var0_20.init(2, (Key)v12.generateSecret(new DESKeySpec(v14)), new IvParameterSpec(new byte[8]));
                var6_22 = new long[5];
                var3_23 = 0;
                var4_24 = "\u001f\u0090\u0080\u0013\u00d4\u00f0\u00d2\u0007\u0011\u00e3G\u001a\u00a4^c\u00ce\u0017\u001d\u0093\"\u00a4\u0084\u0010M";
                var5_25 = "\u001f\u0090\u0080\u0013\u00d4\u00f0\u00d2\u0007\u0011\u00e3G\u001a\u00a4^c\u00ce\u0017\u001d\u0093\"\u00a4\u0084\u0010M".length();
                var2_26 = 0;
                while (true) {
                    var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
                    v15 = var6_22;
                    v16 = var3_23++;
                    v17 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
                    v18 = -1;
                    break block23;
                    break;
                }
lbl114:
                // 1 sources

                while (true) {
                    v15[v16] = v19;
                    if (var2_26 < var5_25) ** continue;
                    var4_24 = "m\u00ed\u00ff\u00c3\u00cd\u00e9ucp*~\u00bc\u00b6\u000e4A";
                    var5_25 = "m\u00ed\u00ff\u00c3\u00cd\u00e9ucp*~\u00bc\u00b6\u000e4A".length();
                    var2_26 = 0;
                    while (true) {
                        var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
                        v15 = var6_22;
                        v16 = var3_23++;
                        v17 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
                        v18 = 0;
                        break block23;
                        break;
                    }
                    break;
                }
lbl127:
                // 1 sources

                while (true) {
                    v15[v16] = v19;
                    if (var2_26 < var5_25) ** continue;
                    break block24;
                    break;
                }
            }
            var8_28 = v17;
            var10_29 = var0_20.doFinal(new byte[]{(byte)(var8_28 >>> 56), (byte)(var8_28 >>> 48), (byte)(var8_28 >>> 40), (byte)(var8_28 >>> 32), (byte)(var8_28 >>> 24), (byte)(var8_28 >>> 16), (byte)(var8_28 >>> 8), (byte)var8_28});
            v19 = ((long)var10_29[0] & 255L) << 56 | ((long)var10_29[1] & 255L) << 48 | ((long)var10_29[2] & 255L) << 40 | ((long)var10_29[3] & 255L) << 32 | ((long)var10_29[4] & 255L) << 24 | ((long)var10_29[5] & 255L) << 16 | ((long)var10_29[6] & 255L) << 8 | (long)var10_29[7] & 255L;
            switch (v18) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl140:
                // 1 sources

                ** continue;
            }
        }
        _8X.h = var6_22;
        _8X.i = new Long[5];
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _8X.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _8X.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8X" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _8X.b(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static int b(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x4085;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])g.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/8X", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _8X.f[n2] = n3;
        }
        return f[n2];
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _8X.a(l2, l3);
            object = k[n];
            try {
                if (!(object instanceof String)) break block2;
                _8X.k[n] = clazz = Class.forName(l[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _8X.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _8X.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _8X.a(l2, l3);
        Object object = k[n];
        if (object instanceof String) {
            String string = l[n];
            int n2 = string.indexOf(8);
            Class clazz = _8X.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _8X.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _8X.a(clazz3, string2, clazz2)) != null) {
                    _8X.k[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _8X.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _8X.k[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _8X.b(1897867434839157L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static long c(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0xCCC;
        if (i[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = h[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])j.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/8X", exception);
            }
            long l5 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            _8X.i[n2] = l5;
        }
        return i[n2];
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8X" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = _8X.c(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return l3;
    }

    private static Method d(long l2, long l3) {
        int n = _8X.a(l2, l3);
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
                clazz3 = _8X.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _8X.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _8X.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _8X.k[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _8X.b(1897867434839157L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _8X.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _8X.k[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _8X.b(1897867434839157L, 0L);
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

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8X" + " : " + string + " : " + methodType.toString(), exception);
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = k;
        k[0] = "w6\b\u001dxRj#\n\\}\u000e&\u0001";
        objectArray[1] = "_\u001d\u0000X4=B\b\u0002\u00191a\u0002J";
        objectArray[2] = ";}\u0018GR\u001f&h\u001a\u0006WCg@";
        objectArray[3] = Long.TYPE;
        _8X.l[3] = "java/lang/Long";
        objectArray[4] = "d\u000e\u001c\u0016 [\u0011.\u0017\u00191\u0014p \u001c\u00125N\u0004";
        objectArray[5] = Integer.TYPE;
        _8X.l[5] = "java/lang/Integer";
        objectArray[6] = "Z].P\u001bG/}%_\n\bNs.T\u000eR:";
        objectArray[7] = Boolean.TYPE;
        _8X.l[7] = "java/lang/Boolean";
        objectArray[8] = "-~!cZZ&q0,'O4k2o";
        objectArray[9] = "C{;dN)6[0k_fWU;`[<#";
        objectArray[10] = Float.TYPE;
        _8X.l[10] = "java/lang/Float";
        objectArray[11] = "\u001bgT[\u0016O\u0006rV\u001a\u0013\u0013G@";
        objectArray[12] = "_N RLK*n+]]\u0004K` VY^?";
        objectArray[13] = "$pcbZ|QPhmK30^cfOiD";
        objectArray[14] = "kB7$7k\u001eb<+&$\u007fl7 \"~\u000b";
        objectArray[15] = "zJ!}p*qE02\u0013'dC";
        objectArray[16] = "A\u0010HY[WJ\u001fY\u0016&OY\u0018P_";
        objectArray[17] = "\u000e\u001a\u0006\u001ax{\u0013\u000f\u0004[}'^.";
        objectArray[18] = "J;\u001fF\u007f\f?\u001b\u0014InC^\u0015\u001fBj\u0019*";
        objectArray[19] = "RpS\u0006b\u0019OeQGgE\u000ew";
        objectArray[20] = "/r8odU/r/3hZ59/-hO2H}y9\u000e";
        objectArray[21] = "m\u0000xu<7m\u0000o)08wKo70-p:=lhl";
        objectArray[22] = "\"ik\u000b-x\"i|W!w8\"|I!b?S.\u0012y(";
        objectArray[23] = "ZiS@8\u001cG|Q\u0001=@\n~";
        objectArray[24] = "7<9!<\u0005*);`9Y`\u001f";
        objectArray[25] = "\u0007>";
        objectArray[26] = "*yyA;\u001e!vh\u000eZ\u0010*}lT";
        objectArray[27] = "k\"\u000fq{<d|\f\u001b#\f\u0006=\nwqy7)^d";
        objectArray[28] = "\u0005B~br\tWR)1\u0018\b:^$kyQ\u0007Nv7c2\u0001N#1b[\u0006Qbj\u0018";
        objectArray[29] = "F<\u0015\u007f@\u000e\u00128\u0018::\r\u007f,\njDK\u0014*\u0014n\u0002";
        objectArray[30] = "/=\u0011Y8H{9\u001c\u001cBN\u0016{\u001aH2\u001b)8\u0011U|";
        objectArray[31] = "'cyP\u001a\u001eus.\u0003p\u0014\u0018\u007f#Y\u0011F%oq\u0005\u000b%#o$\u0003\nL$peXp";
        objectArray[32] = "\b~hW\\5\\ze\u0012&11hfEK2\u000b`jPZ";
        objectArray[33] = "\"f\u007f`\u0019Rpv(3sY\u001dz%i\u0012\n jw5\bi&j\"3\t\u0000!uchs";
        objectArray[34] = "\u007f9<z<'+=1?F\"F(:8,{='d;";
        objectArray[35] = "n\u000e\u0018gm\u00165E\u0005+P\u0005-O\u0005v6\u0012\fT\u001av\u0015\u000f4Q\u001e`PT<Z\u000fro\u00177GA\u001b";
        objectArray[36] = "n?J)\u000f\u001ejd_&u\u0012n*5\u007f\u001c\u001bz G$K\fwZ\n)\u0019\n}(Q~\u000e\u0007\u0007e\\,\b\ru>\u000b;\u0005w";
        objectArray[37] = "c\u0018j#gX7\u001cgf\u001dXZYmmy]g\u00047gm";
        objectArray[38] = "\u001bm\u000eMc^\b?O\u0004\u001c\u000e\u0017j\u0013\u0019KYI:LO\u001c\r\u0007:\u0019\u000bp\u0018G;\u0015";
        objectArray[39] = "5\u000f,\n\\\u0014a\u000b!O&\u001f\f\u001d2\u0005G\u0016tIuD\\";
        objectArray[40] = "YXYC-\u0011\r\\T\u0006W\u00121$\u0004Q8[\t\u001bGZ%\u0015";
        objectArray[41] = "SBZ6l\u0015@\u0010\u001b\u007f\u0013E_EGbD\u0011\u0004\u0010\u00194\u0013FO\u0015Mp\u007fS\u000f\u0014A";
        objectArray[42] = "\r\u001cGbl\u0014\u000b\u0002C$\u0013Fa[\\z\u007f\u0015Z\tL-,\u007f";
        objectArray[43] = "\u001dm\u0010b\r:Ii\u001d'w=$.\u0007z\u001bj\u001f|\u0017-H";
        objectArray[44] = "\u001ejr1yEJn\u007ft\u0003FZ\u0016(/3\u001b\u0018+uu9\u000f";
        objectArray[45] = "@4^\u0019\u007fz\u00140S\\\u0005xy\"P\u000bh}C*\\\u001ey";
        objectArray[46] = "\u0012\u001c6d7r\u0001Nw-H\"\u001e\u001b+0\u001f|FNq\\%=B\u0018100}C\u0014";
        objectArray[47] = "1\u001fp;#\fg\u00174%\\\b$\u001dh'5\u000b^Juzc\u00157Mj;8o";
        objectArray[48] = "vOP;%Ae\u001d\u0011rZ\u0011zHMo\rO'\u0019\u0018\u00037\u000e&KWo\"N'G";
        objectArray[49] = "o\u0003+%3Z|QjlL\nc\u00046q\u001bT;Rm\u001d!\u0015?\u0007,q4U>\u000b";
        objectArray[50] = "Xv<RX]\fr1\u0017\"Wae5UX\u0018\u00023=\u0011F";
        objectArray[51] = "s|YQDOs4\u0005Q4N\u0013,\u0005\u0005\r\fi2\u0007\u000e\n";
        objectArray[52] = "_O\u0016Wag\u000bK\u001b\u0012\u001bd\u00163\u001b@w0[\t\u0013Lb!";
        objectArray[53] = ";(8-\u0013_?s-\"iS3+G{\u0000Z/75 WM\"Mx-\u0005K(?#z\u0012FRr.(\u0014L )y?\u00196";
        objectArray[54] = "d\u0001\u001eoP\u00130\u0005\u0013**\u0012]B\u0010}WS/\u0019GjZ";
        objectArray[55] = "\\vK@e\u0000\brF\u0005\u001f\u0003ef\u0010[~YXvB\u0007d:_fCNv\u0005\u001cm^\u0000\u001f";
        objectArray[56] = "]I\u0004X\b=DM\u0000\u0001b~6\u001fG\r\u0003&\u000b\u000f\u0015Q\u0019E\t\u001a\u0017\u0015\u00187RM\u0000\u0018b";
        objectArray[57] = "\u0005\u0011l5dN\u0011E\u007fYg\u007f\u0017\u0014e89B\u0007F9\"ZD\u0007\u0013?#3C\u0018RdY";
        objectArray[58] = "X4?\u0012by\f02W\u0018za$d\ty \\46UcC\\(h\b'~\u0001rb\u001c\u0018";
        Object[] objectArray2 = objectArray;
        objectArray[59] = ":f&r1W)4g;N\u00076a;&\u0019Yi5nJ#\u0018jb!&6Xkn";
    }

    private static int a(long l2, long l3) {
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
            case 0 -> 16;
            case 1 -> 0;
            case 2 -> 35;
            case 3 -> 58;
            case 4 -> 42;
            case 5 -> 48;
            case 6 -> 9;
            case 7 -> 32;
            case 8 -> 47;
            case 9 -> 19;
            case 10 -> 38;
            case 11 -> 27;
            case 12 -> 46;
            case 13 -> 20;
            case 14 -> 55;
            case 15 -> 24;
            case 16 -> 28;
            case 17 -> 4;
            case 18 -> 15;
            case 19 -> 57;
            case 20 -> 8;
            case 21 -> 43;
            case 22 -> 17;
            case 23 -> 23;
            case 24 -> 26;
            case 25 -> 21;
            case 26 -> 29;
            case 27 -> 13;
            case 28 -> 56;
            case 29 -> 54;
            case 30 -> 1;
            case 31 -> 12;
            case 32 -> 37;
            case 33 -> 14;
            case 34 -> 60;
            case 35 -> 31;
            case 36 -> 33;
            case 37 -> 62;
            case 38 -> 18;
            case 39 -> 39;
            case 40 -> 63;
            case 41 -> 40;
            case 42 -> 50;
            case 43 -> 10;
            case 44 -> 22;
            case 45 -> 25;
            case 46 -> 53;
            case 47 -> 3;
            case 48 -> 34;
            case 49 -> 36;
            case 50 -> 52;
            case 51 -> 45;
            case 52 -> 49;
            case 53 -> 61;
            case 54 -> 7;
            case 55 -> 30;
            case 56 -> 59;
            case 57 -> 51;
            case 58 -> 44;
            case 59 -> 11;
            case 60 -> 5;
            case 61 -> 6;
            case 62 -> 2;
            default -> 41;
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
        _8X.l[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e3' || c == 'F' || c == 'Q' || c == '\u00f6') {
                field = _8X.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e3' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'F' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'Q' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _8X.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'l' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'O' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _8X.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x4403;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l3 = Thread.currentThread().threadId();
                objectArray = (Object[])d.get(l3);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/8X", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l2 >>> 56);
            for (int j = 1; j < 8; ++j) {
                byArray[j] = (byte)(l2 << j * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            _8X.c[n2] = _8X.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_3().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8X" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _8X.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_4(Object[] objectArray) {
        Object object;
        int n;
        long l2;
        long l3;
        block12: {
            l3 = (Long)objectArray[0];
            long l4 = l3 = a ^ l3;
            l2 = l4 ^ 0x12DE71D853B5L;
            long l5 = l4 ^ 0xA73312FF538L;
            reference var9_5 = _8X.d("O", -8246991616389412835L, (long)l3) - _8X.d("\u00e3", (Object)this, -8249593164257004378L, (long)l3);
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l5;
            CallSite callSite = _8X.d("l", (Object)this, (Object)objectArray2, -8247828184760614608L, (long)l3);
            n = _3C.cfr_renamed_7();
            try {
                reference cfr_temp_1;
                block13: {
                    try {
                        try {
                            reference cfr_temp_0 = var9_5 - _8X.c("q", 24011, (long)(0x1A98FD749423DC83L ^ l3));
                            object = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                            if (n == 0) break block12;
                            if (object >= 0) break block13;
                        }
                        catch (MatchException matchException) {
                            throw _8X.a(matchException);
                        }
                        Object[] objectArray3 = new Object[4];
                        objectArray3[3] = Float.valueOf(20.0f);
                        objectArray3[2] = Float.valueOf(1.0f);
                        objectArray3[1] = Float.valueOf((float)_8X.d("\u00e3", (Object)this, -8247854441758687781L, (long)l3));
                        objectArray3[0] = l2;
                        _8X.d("F", (Object)this, (float)_8X.d("O", (Object)objectArray3, -8247749066376740353L, (long)l3), -8247854441758687781L, (long)l3);
                        if (n != 0) return;
                    }
                    catch (MatchException matchException) {
                        throw _8X.a(matchException);
                    }
                }
                object = (cfr_temp_1 = var9_5 - (callSite - _8X.c("q", 5833, (long)(0x2641313114E41782L ^ l3)))) == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
            }
            catch (MatchException matchException) {
                throw _8X.a(matchException);
            }
        }
        try {
            block14: {
                try {
                    if (l3 >= 0L) {
                        if (object >= 0) break block14;
                        _8X.d("F", (Object)this, 1.0f, -8247854441758687781L, (long)l3);
                        object = n;
                    }
                    if (object != false) return;
                }
                catch (MatchException matchException) {
                    throw _8X.a(matchException);
                }
            }
            Object[] objectArray4 = new Object[4];
            objectArray4[3] = Float.valueOf(20.0f);
            objectArray4[2] = Float.valueOf(0.0f);
            objectArray4[1] = Float.valueOf((float)_8X.d("\u00e3", (Object)this, -8247854441758687781L, (long)l3));
            objectArray4[0] = l2;
            _8X.d("F", (Object)this, (float)_8X.d("O", (Object)objectArray4, -8247749066376740353L, (long)l3), -8247854441758687781L, (long)l3);
            return;
        }
        catch (MatchException matchException) {
            throw _8X.a(matchException);
        }
    }

    public _8b_0 cfr_renamed_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return _8X.d("\u00e3", (Object)this, -7980363730759862892L, (long)l2);
    }

    public float float_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (float)_8X.d("\u00e3", (Object)this, 4039871463366182978L, (long)l2);
    }

    public String java_lang_String_2(Object[] objectArray) {
        CallSite callSite;
        block8: {
            Object object;
            long l2;
            block9: {
                block10: {
                    block6: {
                        block7: {
                            l2 = (Long)objectArray[0];
                            long l3 = (l2 = a ^ l2) ^ 0x44BEEFBEB05BL;
                            int n = _3C.cfr_renamed_4();
                            try {
                                try {
                                    Object[] objectArray2 = new Object[1];
                                    objectArray2[0] = l3;
                                    object = _8X.d("l", (Object)this, (Object)objectArray2, -6697537752677615641L, (long)l2);
                                    if (n != 0) break block6;
                                    if (object == false) break block7;
                                }
                                catch (MatchException matchException) {
                                    throw _8X.a(matchException);
                                }
                                callSite = _8X.d("\u00e3", (Object)this, -6698248673805891679L, (long)l2);
                                break block8;
                            }
                            catch (MatchException matchException) {
                                throw _8X.a(matchException);
                            }
                        }
                        object = _8X.d("\u00e3", (Object)this, -6698418367465279110L, (long)l2);
                    }
                    try {
                        if (l2 <= 0L) break block9;
                        if (object == false) break block10;
                        callSite = _8X.a("l", 27984, (long)(0x375473C29B180A50L ^ l2));
                        break block8;
                    }
                    catch (MatchException matchException) {
                        throw _8X.a(matchException);
                    }
                }
                object = 31197;
            }
            callSite = _8X.a("l", (int)object, (long)(0x7C3C0349E8791EDCL ^ l2));
        }
        return callSite;
    }

    public boolean boolean_2(Object[] objectArray) {
        Object object;
        block6: {
            block8: {
                block7: {
                    long l2 = (Long)objectArray[0];
                    long l3 = (l2 = a ^ l2) ^ 0x1DAE2E932B3L;
                    int n = _3C.cfr_renamed_4();
                    try {
                        try {
                            try {
                                object = _8X.d("\u00e3", (Object)this, 5333455326447574936L, (long)l2);
                                if (n != 0) break block6;
                                if (object != false) break block7;
                            }
                            catch (MatchException matchException) {
                                throw _8X.a(matchException);
                            }
                            Object[] objectArray2 = new Object[1];
                            objectArray2[0] = l3;
                            reference cfr_temp_0 = _8X.d("O", 5334451603677826966L, (long)l2) - _8X.d("\u00e3", (Object)this, 5334660064487584557L, (long)l2) - _8X.d("l", (Object)this, (Object)objectArray2, 5333062812050998971L, (long)l2);
                            object = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                            if (n != 0) break block6;
                        }
                        catch (MatchException matchException) {
                            throw _8X.a(matchException);
                        }
                        if (object <= 0) break block8;
                    }
                    catch (MatchException matchException) {
                        throw _8X.a(matchException);
                    }
                }
                object = true;
                break block6;
            }
            object = false;
        }
        return (boolean)object;
    }

    public float float_3(Object[] objectArray) {
        reference v1;
        CallSite callSite;
        reference var7_4;
        long l2;
        block7: {
            block8: {
                l2 = (Long)objectArray[0];
                long l3 = (l2 = a ^ l2) ^ 0x593765B7978DL;
                var7_4 = _8X.d("O", -1208759558715708760L, (long)l2) - _8X.d("\u00e3", (Object)this, -1209535367005333997L, (long)l2);
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l3;
                callSite = _8X.d("l", (Object)this, (Object)objectArray2, -1207949095189355643L, (long)l2);
                int n = _3C.cfr_renamed_4();
                try {
                    try {
                        reference v1 = var7_4 - _8X.c("q", 2692, (long)(0x72BA7830F8BCE978L ^ l2));
                        v1 = v1 == 0 ? 0 : (v1 < 0 ? -1 : 1);
                        if (n != 0) break block7;
                        if (v1 >= 0) break block8;
                    }
                    catch (MatchException matchException) {
                        throw _8X.a(matchException);
                    }
                    return (float)var7_4 / 200.0f;
                }
                catch (MatchException matchException) {
                    throw _8X.a(matchException);
                }
            }
            reference v1 = var7_4 - (callSite - _8X.c("q", 18622, (long)(0x2D022A788E0EAB47L ^ l2)));
            v1 = v1 == 0 ? 0 : (v1 < 0 ? -1 : 1);
        }
        try {
            if (v1 > 0) {
                return 1.0f - (float)(var7_4 - (callSite - _8X.c("q", 18622, (long)(0x2D022A788E0EAB47L ^ l2)))) / 200.0f;
            }
        }
        catch (MatchException matchException) {
            throw _8X.a(matchException);
        }
        return 1.0f;
    }

    /*
     * Exception decompiling
     */
    public class_1799 net_minecraft_class_1799_3(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 3[SWITCH]
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

    public void cfr_renamed_7(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        _8X.d("F", (Object)this, (boolean)_8X.b("s", 28420, (long)(0x44D1B5B3CC179E40L ^ l2)), 3587961776685245527L, (long)l2);
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
                            var9_2 = ((Float)var1_1[0]).floatValue();
                            var4_3 = ((Float)var1_1[1]).floatValue();
                            var5_4 = ((Float)var1_1[2]).floatValue();
                            var6_5 = (Long)var1_1[3];
                            var3_6 = ((Float)var1_1[4]).floatValue();
                            var2_7 = ((Float)var1_1[5]).floatValue();
                            var8_8 = ((Float)var1_1[6]).floatValue();
                            var6_5 = _8X.a ^ var6_5;
                            var10_9 = _3C.cfr_renamed_4();
                            try {
                                try {
                                    v0 = var9_2 == var5_4 ? 0 : (var9_2 > var5_4 ? 1 : -1);
                                    if (var10_9 != 0) break block16;
                                    if (v0 < 0) break block17;
                                }
                                catch (MatchException v1) {
                                    throw _8X.a(v1);
                                }
                                cfr_temp_0 = var9_2 - (var5_4 + var2_7);
                                v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                            }
                            catch (MatchException v2) {
                                throw _8X.a(v2);
                            }
                        }
                        try {
                            try {
                                v3 = var10_9;
                                if (var6_5 > 0L) {
                                    if (v3 != 0) break block18;
                                    if (v0 > 0) break block17;
                                }
                                ** GOTO lbl43
                            }
                            catch (MatchException v4) {
                                throw _8X.a(v4);
                            }
                            v0 = var4_3 == var3_6 ? 0 : (var4_3 > var3_6 ? 1 : -1);
                        }
                        catch (MatchException v5) {
                            throw _8X.a(v5);
                        }
                    }
                    try {
                        try {
                            v3 = var10_9;
lbl43:
                            // 2 sources

                            if (var6_5 >= 0L) {
                                if (v3 != 0) break block19;
                                if (v0 < 0) break block17;
                            }
                            ** GOTO lbl58
                        }
                        catch (MatchException v6) {
                            throw _8X.a(v6);
                        }
                        cfr_temp_1 = var4_3 - (var3_6 + var8_8);
                        v0 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
                    }
                    catch (MatchException v7) {
                        throw _8X.a(v7);
                    }
                }
                try {
                    v3 = var10_9;
lbl58:
                    // 2 sources

                    if (v3 != 0) break block20;
                    if (v0 > 0) break block17;
                }
                catch (MatchException v8) {
                    throw _8X.a(v8);
                }
                v0 = (float)true;
                break block20;
            }
            v0 = (float)false;
        }
        return (boolean)v0;
    }

    public _8B dev_krypton_8B_5(Object[] objectArray) {
        _8B b;
        CallSite callSite;
        long l2;
        float f;
        long l3;
        block6: {
            block7: {
                l3 = (Long)objectArray[0];
                f = ((Float)objectArray[1]).floatValue();
                long l4 = l3 = a ^ l3;
                long l5 = l4 ^ 0x26C573CE4190L;
                l2 = l4 ^ 0x7DDEF49F1096L;
                int n = _3C.cfr_renamed_7();
                try {
                    try {
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l5;
                        callSite = _8X.d("l", (Object)this, (Object)objectArray2, 5964721515735877164L, (long)l3);
                        if (n == 0) break block6;
                        if (callSite == false) break block7;
                    }
                    catch (MatchException matchException) {
                        throw _8X.a(matchException);
                    }
                    return new _8B((int)_8X.b("s", 23981, (long)(0x3C5843333CD94FE4L ^ l3)), (int)_8X.b("s", 19388, (long)(0x796BCF0908E59E1L ^ l3)), l2, (int)_8X.b("s", 5952, (long)(0xC114AEB25B80507L ^ l3)), (int)(220.0f * f));
                }
                catch (MatchException matchException) {
                    throw _8X.a(matchException);
                }
            }
            callSite = _8X.d("\u00e3", (Object)this, 5963062257607196849L, (long)l3);
        }
        try {
            b = callSite != false ? new _8B((int)_8X.b("s", 16404, (long)(0x356EDC431593D25EL ^ l3)), (int)_8X.b("s", 9087, (long)(0x768D250AB269B13AL ^ l3)), l2, (int)_8X.b("s", 24578, (long)(0x2056F1269994F240L ^ l3)), (int)(220.0f * f)) : new _8B((int)_8X.b("s", 9087, (long)(0x768D250AB269B13AL ^ l3)), (int)_8X.b("s", 9567, (long)(0x117A23226CF9B719L ^ l3)), l2, (int)_8X.b("s", 17162, (long)(0xEBFA6A79A945141L ^ l3)), (int)(220.0f * f));
        }
        catch (MatchException matchException) {
            throw _8X.a(matchException);
        }
        return b;
    }

    public float float_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = a ^ l2) ^ 0x5CF5C252FC02L;
        reference var6_4 = _8X.d("O", -8883743515213758169L, (long)l2) - _8X.d("\u00e3", (Object)this, -8882831023348023908L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        CallSite callSite = _8X.d("l", (Object)this, (Object)objectArray2, -8884610923560531958L, (long)l2);
        return (float)_8X.d("O", 0.0f, (float)_8X.d("O", 1.0f, (float)(1.0f - (float)var6_4 / (float)callSite), -8884738718883712011L, (long)l2), -8883513059735334383L, (long)l2);
    }

    public _8B cfr_renamed_0(Object[] objectArray) {
        _8B b;
        CallSite callSite;
        long l2;
        float f;
        long l3;
        block6: {
            block7: {
                l3 = (Long)objectArray[0];
                f = ((Float)objectArray[1]).floatValue();
                long l4 = l3 = a ^ l3;
                long l5 = l4 ^ 0x1F0AC1592B02L;
                long l6 = l4 ^ 0x33A1B60A724EL;
                long l7 = l4 ^ 0x1130A8D78D0EL;
                l2 = l4 ^ 0x441146087A04L;
                long l8 = l4 ^ 0x69F724C04629L;
                int n = _3C.cfr_renamed_4();
                try {
                    try {
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l5;
                        callSite = _8X.d("l", (Object)this, (Object)objectArray2, 4059092717400386750L, (long)l3);
                        if (n != 0) break block6;
                        if (callSite == false) break block7;
                    }
                    catch (MatchException matchException) {
                        throw _8X.a(matchException);
                    }
                    Object[] objectArray3 = new Object[1];
                    objectArray3[0] = l8;
                    Object[] objectArray4 = new Object[1];
                    objectArray4[0] = l6;
                    Object[] objectArray5 = new Object[1];
                    objectArray5[0] = l7;
                    return new _8B((int)_8X.d("l", (Object)_8X.d("\u00e3", (Object)this, 4057941465195291110L, (long)l3), (Object)objectArray3, 4058343755504152866L, (long)l3), (int)_8X.d("l", (Object)_8X.d("\u00e3", (Object)this, 4057941465195291110L, (long)l3), (Object)objectArray4, 4061612257791751445L, (long)l3), l2, (int)_8X.d("l", (Object)_8X.d("\u00e3", (Object)this, 4057941465195291110L, (long)l3), (Object)objectArray5, 4061496453928985402L, (long)l3), (int)(255.0f * f));
                }
                catch (MatchException matchException) {
                    throw _8X.a(matchException);
                }
            }
            callSite = _8X.d("\u00e3", (Object)this, 4058645173647714851L, (long)l3);
        }
        try {
            b = callSite != false ? new _8B((int)_8X.b("s", 13596, (long)(0x47FA30C3ED7F4DCFL ^ l3)), (int)_8X.b("s", 1900, (long)(0xDD2F7FB3CC3FFBEL ^ l3)), l2, (int)_8X.b("s", 26443, (long)(0x3D8306EF35A61F85L ^ l3)), (int)(255.0f * f)) : new _8B((int)_8X.b("s", 4983, (long)(0x5D9CBCD8385C6BA1L ^ l3)), (int)_8X.b("s", 25545, (long)(0x65FDB96C78891B13L ^ l3)), l2, (int)_8X.b("s", 16765, (long)(0x32EBA2C8CDA939A1L ^ l3)), (int)(255.0f * f));
        }
        catch (MatchException matchException) {
            throw _8X.a(matchException);
        }
        return b;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_8X.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_8X.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
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
            return MethodHandles.lookup().findStatic(_8X.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_8X.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

