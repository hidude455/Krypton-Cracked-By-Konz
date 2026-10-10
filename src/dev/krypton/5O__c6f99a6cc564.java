/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1811
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._3i_0;
import dev.krypton._4r;
import dev.krypton._6x_0;
import dev.krypton._7C;
import dev.krypton._7v_0;
import dev.krypton._92;
import dev.krypton._95;
import dev.krypton._9E;
import dev.krypton._9o;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1811;

public class _5O
extends _6x_0 {
    private final _9r cfr_renamed_4;
    private final _92 cfr_renamed_8;
    private final _92 cfr_renamed_9;
    private final _9E cfr_renamed_6;
    private long cfr_renamed_0;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final long j;
    private static final Object[] k;
    private static final String[] l;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void cfr_renamed_284(Object[] var1_1) {
        block28: {
            block30: {
                block29: {
                    block26: {
                        block27: {
                            block25: {
                                block24: {
                                    block22: {
                                        block23: {
                                            block20: {
                                                block21: {
                                                    var2_2 = (Long)var1_1[0];
                                                    var4_3 = (var2_2 = _5O.b ^ var2_2) ^ 8342003868618L;
                                                    var7_4 = _5O.c("\u00a3", (Object)_5O.c("\u00a3", (Object)_5O.c("\u00aa", (Object)_5O.c("\u00aa", (Object)this, (long)-5884734831160025044L, (long)var2_2), (long)-5887351043492932776L, (long)var2_2), (long)-5886726593014691209L, (long)var2_2), (long)-5888000529510576961L, (long)var2_2);
                                                    var8_5 = _5O.c("\u00a3", (Object)_5O.c("\u00a3", (Object)_5O.c("\u00aa", (Object)_5O.c("\u00aa", (Object)this, (long)-5884734831160025044L, (long)var2_2), (long)-5887351043492932776L, (long)var2_2), (long)-5886418347029926598L, (long)var2_2), (long)-5888000529510576961L, (long)var2_2);
                                                    var6_6 = _7C.cfr_renamed_3();
                                                    try {
                                                        v0 /* !! */  = _5O.c("\u00a3", (Object)_5O.c("\u00a3", (Object)var7_4, (long)-5888379132519820929L, (long)var2_2), (Object)_5O.c("\u00f8", (long)-5884874923826500862L, (long)var2_2), (long)-5886407234422236410L, (long)var2_2);
                                                        if (var6_6 != 0) break block20;
                                                        if (v0 /* !! */  == false) break block21;
                                                    }
                                                    catch (MatchException v1) {
                                                        throw _5O.a(v1);
                                                    }
                                                    return;
                                                }
                                                v0 /* !! */  = _5O.c("\u00a3", (Object)_5O.c("\u00a3", (Object)var8_5, (long)-5888379132519820929L, (long)var2_2), (Object)_5O.c("\u00f8", (long)-5884874923826500862L, (long)var2_2), (long)-5886407234422236410L, (long)var2_2);
                                            }
                                            try {
                                                v2 = var6_6;
                                                if (var2_2 >= 0L) {
                                                    if (v2 != 0) break block22;
                                                    if (v0 /* !! */  == false) break block23;
                                                }
                                                ** GOTO lbl35
                                            }
                                            catch (MatchException v3) {
                                                throw _5O.a(v3);
                                            }
                                            return;
                                        }
                                        v0 /* !! */  = (CallSite)(var7_4 instanceof class_1811);
                                    }
                                    try {
                                        try {
                                            v2 = var6_6;
lbl35:
                                            // 2 sources

                                            if (var2_2 > 0L) {
                                                if (v2 != 0) break block24;
                                                if (v0 /* !! */  != false) break block25;
                                            }
                                            ** GOTO lbl50
                                        }
                                        catch (MatchException v4) {
                                            throw _5O.a(v4);
                                        }
                                        v0 /* !! */  = (CallSite)(var8_5 instanceof class_1811);
                                    }
                                    catch (MatchException v5) {
                                        throw _5O.a(v5);
                                    }
                                }
                                try {
                                    if (var2_2 < 0L) break block26;
                                    v2 = var6_6;
lbl50:
                                    // 2 sources

                                    if (v2 != 0) break block26;
                                    if (v0 /* !! */  == false) break block27;
                                }
                                catch (MatchException v6) {
                                    throw _5O.a(v6);
                                }
                            }
                            return;
                        }
                        try {
                            v7 = this;
                            if (var6_6 != 0) break block28;
                            v0 /* !! */  = _5O.c("\u00a3", (Object)_5O.c("\u00aa", (Object)v7, (long)-5887668909687925877L, (long)var2_2), (long)var4_3, (long)-5888175681618348296L, (long)var2_2);
                        }
                        catch (MatchException v8) {
                            throw _5O.a(v8);
                        }
                    }
                    try {
                        try {
                            try {
                                if (v0 /* !! */  == false) break block29;
                                v7 = this;
                                if (var6_6 != 0) break block28;
                            }
                            catch (MatchException v9) {
                                throw _5O.a(v9);
                            }
                            v10 /* !! */  = (long)_5O.c("\u00a3", (Object)_5O.c("\u00a3", (Object)_5O.c("\u00aa", (Object)v7, (long)-5884734831160025044L, (long)var2_2), (long)-5884655237261788079L, (long)var2_2), (long)-5887434672165364020L, (long)var2_2);
                            if (var2_2 <= 0L) break block30;
                            if (_5O.c("\u00e6", (long)v10 /* !! */ , (int)1, (long)-5887177284283296244L, (long)var2_2) == true) break block29;
                        }
                        catch (MatchException v11) {
                            throw _5O.a(v11);
                        }
                        return;
                    }
                    catch (MatchException v12) {
                        throw _5O.a(v12);
                    }
                }
                v10 /* !! */  = -5884711003208285689L;
            }
            _5O.c("\u00e6", (Object)_5O.c("\u00a3", (Object)_5O.c("\u00f8", (long)v10 /* !! */ , (long)var2_2), (int)1, (long)-5886617025777996254L, (long)var2_2), (long)-5883996335529560289L, (long)var2_2);
            v7 = this;
        }
        _5O.c("\u00cf", (Object)v7, (long)_5O.c("\u00e6", (long)-5887510566767965000L, (long)var2_2), (long)-5888110386884030565L, (long)var2_2);
    }

    /*
     * Unable to fully structure code
     */
    private void cfr_renamed_285(Object[] var1_1) {
        block20: {
            block19: {
                block17: {
                    block18: {
                        block15: {
                            block16: {
                                var2_2 = (Long)var1_1[0];
                                var4_3 = (var2_2 = _5O.b ^ var2_2) ^ 48113373745014L;
                                var6_4 = _7C.cfr_renamed_9();
                                try {
                                    try {
                                        v0 = _5O.c("\u00aa", (Object)this, (long)-4401964562707460976L, (long)var2_2);
                                        if (var6_4 == 0) break block15;
                                        if (_5O.c("\u00a3", (Object)_5O.c("\u00aa", (Object)v0, (long)-4401714991387720797L, (long)var2_2), (long)-4398283356092247227L, (long)var2_2) != _5O.c("\u00f8", (long)-4398690196103629078L, (long)var2_2)) break block16;
                                    }
                                    catch (MatchException v1) {
                                        throw _5O.a(v1);
                                    }
                                    return;
                                }
                                catch (MatchException v2) {
                                    throw _5O.a(v2);
                                }
                            }
                            v0 = _5O.c("\u00aa", (Object)this, (long)-4401964562707460976L, (long)var2_2);
                        }
                        try {
                            v3 = _5O.c("\u00a3", (Object)_5O.c("\u00aa", (Object)v0, (long)-4397834034203033628L, (long)var2_2), (long)-4398533478550781550L, (long)var2_2);
                            v4 = var6_4;
                            if (var2_2 >= 0L) {
                                if (v4 == 0) break block17;
                                if (v3 == false) break block18;
                            }
                            ** GOTO lbl37
                        }
                        catch (MatchException v5) {
                            throw _5O.a(v5);
                        }
                        return;
                    }
                    v3 = _5O.c("\u00a3", (Object)_5O.c("\u00aa", (Object)this, (long)-4398081669164105929L, (long)var2_2), (long)var4_3, (long)-4398658672378832316L, (long)var2_2);
                }
                try {
                    try {
                        v4 = var6_4;
lbl37:
                        // 2 sources

                        if (var2_2 >= 0L) {
                            if (v4 == 0) break block19;
                            if (v3 == false) break block20;
                        }
                        ** GOTO lbl51
                    }
                    catch (MatchException v6) {
                        throw _5O.a(v6);
                    }
                    v3 = _5O.c("\u00e6", (long)_5O.c("\u00a3", (Object)_5O.c("\u00a3", (Object)_5O.c("\u00aa", (Object)this, (long)-4401964562707460976L, (long)var2_2), (long)-4401796492415856403L, (long)var2_2), (long)-4397891412085722512L, (long)var2_2), (int)0, (long)-4399833047408837968L, (long)var2_2);
                }
                catch (MatchException v7) {
                    throw _5O.a(v7);
                }
            }
            try {
                v4 = 1;
lbl51:
                // 2 sources

                if (v3 != v4) {
                    return;
                }
            }
            catch (MatchException v8) {
                throw _5O.a(v8);
            }
        }
        _5O.c("\u00e6", (Object)_5O.c("\u00a3", (Object)_5O.c("\u00f8", (long)-4401878509290492229L, (long)var2_2), (int)0, (long)-4399272101713018210L, (long)var2_2), (long)-4401155011070977117L, (long)var2_2);
    }

    public _5O(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x235D3ED5AFF4L;
        long l5 = l3 ^ 0x6B2F6C9C1252L;
        long l6 = l3 ^ 0x7B4F5E556BC1L;
        long l7 = l3 ^ 0x3D17FBDF9A3BL;
        long l8 = l3 ^ 0x22D768FB7549L;
        super((int)_5O.a("v", 21382, (long)(0x2B7C20FD20DCFE06L ^ l2)), -1, (_4r)((Object)_5O.c("\u00f8", 3682509313501688728L, (long)l2)), l7);
        this.cfr_renamed_4 = new _9r((int)_5O.a("v", 13464, (long)(0x4512AD2EA0A4191AL ^ l2)), true, l5);
        this.cfr_renamed_8 = new _92((int)_5O.a("v", 4982, (long)(0xA4DDE88F706BEF0L ^ l2)), 0.0, l6, 1000.0, 0.0, 1.0);
        this.cfr_renamed_9 = new _92((int)_5O.a("v", 30317, (long)(0x308223DE659B5BECL ^ l2)), 0.0, l6, 100.0, 100.0, 1.0);
        this.cfr_renamed_6 = new _9E((int)_5O.a("v", 20393, (long)(0x322F3AC1801F622EL ^ l2)), l4, (Enum)((Object)_5O.c("\u00f8", 3675367940304209100L, (long)l2)), _7v_0.class);
        _5O.c("\u00cf", (Object)this, (long)j, 3682912300118430414L, (long)l2);
        Object[] objectArray = new Object[2];
        objectArray[1] = new _95[]{_5O.c("\u00aa", (Object)this, 3683842961339322078L, (long)l2), _5O.c("\u00aa", (Object)this, 3683911826691837996L, (long)l2), _5O.c("\u00aa", (Object)this, 3675522368489839992L, (long)l2), _5O.c("\u00aa", (Object)this, 3675228291257588610L, (long)l2)};
        objectArray[0] = l8;
        _5O.c("\u00a3", (Object)this, (Object)objectArray, 3683203225884810423L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                block10: {
                    a.init(_5O.class, 55);
                    _5O.b = dev.krypton.l.a(-3942584949651546127L, -3731628712591167030L, MethodHandles.lookup().lookupClass()).a(119493163299154L);
                    _5O.k = new Object[75];
                    _5O.l = new String[75];
                    _5O.b();
                    _5O.f = new HashMap<K, V>(13);
                    var5 = _5O.b ^ 48601494911333L;
                    var7_1 = Cipher.getInstance("DES/CBC/NoPadding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var5 >>> 56);
                    for (var8_2 = 1; var8_2 < 8; ++var8_2) {
                        v2 = v2;
                        v2[var8_2] = (byte)(var5 << var8_2 * 8 >>> 56);
                    }
                    var7_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var13_3 = new long[6];
                    var10_4 = 0;
                    var11_5 = "\u000e<\u00e4\u0089\u008c\u00d6\u0018 w`jS[\u00d8\u00d2YL\u0012F\u0086@\u0094\u00a0=n\u00f9H\u0094\u008d\u0000\u00abK";
                    var12_6 = "\u000e<\u00e4\u0089\u008c\u00d6\u0018 w`jS[\u00d8\u00d2YL\u0012F\u0086@\u0094\u00a0=n\u00f9H\u0094\u008d\u0000\u00abK".length();
                    var9_7 = 0;
                    while (true) {
                        var14_9 = var11_5.substring(var9_7, var9_7 += 8).getBytes("ISO-8859-1");
                        v3 = var13_3;
                        v4 = var10_4++;
                        v5 = ((long)var14_9[0] & 255L) << 56 | ((long)var14_9[1] & 255L) << 48 | ((long)var14_9[2] & 255L) << 40 | ((long)var14_9[3] & 255L) << 32 | ((long)var14_9[4] & 255L) << 24 | ((long)var14_9[5] & 255L) << 16 | ((long)var14_9[6] & 255L) << 8 | (long)var14_9[7] & 255L;
                        v6 = -1;
                        break block10;
                        break;
                    }
lbl30:
                    // 1 sources

                    while (true) {
                        v3[v4] = v7;
                        if (var9_7 < var12_6) ** continue;
                        var11_5 = "M\u00d0H,m\u00b3\u00bc\u009a\u00e5\u00d0\u0084:\u00fe8X\u00c5";
                        var12_6 = "M\u00d0H,m\u00b3\u00bc\u009a\u00e5\u00d0\u0084:\u00fe8X\u00c5".length();
                        var9_7 = 0;
                        while (true) {
                            var14_9 = var11_5.substring(var9_7, var9_7 += 8).getBytes("ISO-8859-1");
                            v3 = var13_3;
                            v4 = var10_4++;
                            v5 = ((long)var14_9[0] & 255L) << 56 | ((long)var14_9[1] & 255L) << 48 | ((long)var14_9[2] & 255L) << 40 | ((long)var14_9[3] & 255L) << 32 | ((long)var14_9[4] & 255L) << 24 | ((long)var14_9[5] & 255L) << 16 | ((long)var14_9[6] & 255L) << 8 | (long)var14_9[7] & 255L;
                            v6 = 0;
                            break block10;
                            break;
                        }
                        break;
                    }
lbl43:
                    // 1 sources

                    while (true) {
                        v3[v4] = v7;
                        if (var9_7 < var12_6) ** continue;
                        break block11;
                        break;
                    }
                }
                var15_10 = v5;
                var17_8 = var7_1.doFinal(new byte[]{(byte)(var15_10 >>> 56), (byte)(var15_10 >>> 48), (byte)(var15_10 >>> 40), (byte)(var15_10 >>> 32), (byte)(var15_10 >>> 24), (byte)(var15_10 >>> 16), (byte)(var15_10 >>> 8), (byte)var15_10});
                v7 = ((long)var17_8[0] & 255L) << 56 | ((long)var17_8[1] & 255L) << 48 | ((long)var17_8[2] & 255L) << 40 | ((long)var17_8[3] & 255L) << 32 | ((long)var17_8[4] & 255L) << 24 | ((long)var17_8[5] & 255L) << 16 | ((long)var17_8[6] & 255L) << 8 | (long)var17_8[7] & 255L;
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
            _5O.d = var13_3;
            _5O.e = new Integer[6];
            var0_11 = Cipher.getInstance("DES/CBC/NoPadding");
            v8 = SecretKeyFactory.getInstance("DES");
            v9 = new byte[8];
            v10 = v9;
            v9[0] = (byte)(var5 >>> 56);
            for (var1_12 = 1; var1_12 < 8; ++var1_12) {
                v10 = v10;
                v10[var1_12] = (byte)(var5 << var1_12 * 8 >>> 56);
            }
            break block12;
lbl70:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_11.init(2, (Key)v8.generateSecret(new DESKeySpec(v10)), new IvParameterSpec(new byte[8]));
        var2_13 = 6471592643208914598L;
        var4_14 = var0_11.doFinal(new byte[]{(byte)(var2_13 >>> 56), (byte)(var2_13 >>> 48), (byte)(var2_13 >>> 40), (byte)(var2_13 >>> 32), (byte)(var2_13 >>> 24), (byte)(var2_13 >>> 16), (byte)(var2_13 >>> 8), (byte)var2_13});
        ** while (true)
        _5O.j = ((long)var4_14[0] & 255L) << 56 | ((long)var4_14[1] & 255L) << 48 | ((long)var4_14[2] & 255L) << 40 | ((long)var4_14[3] & 255L) << 32 | ((long)var4_14[4] & 255L) << 24 | ((long)var4_14[5] & 255L) << 16 | ((long)var4_14[6] & 255L) << 8 | (long)var4_14[7] & 255L;
    }

    private static int e(long l2, long l3) {
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
            case 0 -> 38;
            case 1 -> 25;
            case 2 -> 18;
            case 3 -> 14;
            case 4 -> 21;
            case 5 -> 32;
            case 6 -> 13;
            case 7 -> 36;
            case 8 -> 55;
            case 9 -> 61;
            case 10 -> 42;
            case 11 -> 2;
            case 12 -> 41;
            case 13 -> 0;
            case 14 -> 11;
            case 15 -> 50;
            case 16 -> 60;
            case 17 -> 26;
            case 18 -> 37;
            case 19 -> 10;
            case 20 -> 51;
            case 21 -> 6;
            case 22 -> 39;
            case 23 -> 7;
            case 24 -> 15;
            case 25 -> 45;
            case 26 -> 49;
            case 27 -> 16;
            case 28 -> 58;
            case 29 -> 34;
            case 30 -> 63;
            case 31 -> 53;
            case 32 -> 8;
            case 33 -> 24;
            case 34 -> 9;
            case 35 -> 57;
            case 36 -> 5;
            case 37 -> 12;
            case 38 -> 17;
            case 39 -> 23;
            case 40 -> 59;
            case 41 -> 3;
            case 42 -> 30;
            case 43 -> 27;
            case 44 -> 19;
            case 45 -> 44;
            case 46 -> 47;
            case 47 -> 22;
            case 48 -> 62;
            case 49 -> 43;
            case 50 -> 48;
            case 51 -> 28;
            case 52 -> 54;
            case 53 -> 20;
            case 54 -> 4;
            case 55 -> 31;
            case 56 -> 35;
            case 57 -> 1;
            case 58 -> 29;
            case 59 -> 52;
            case 60 -> 33;
            case 61 -> 40;
            case 62 -> 46;
            default -> 56;
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
        _5O.l[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = k;
        k[0] = ">J\u0007\u0018\u0019G5E\u0016WdR'_\u0014\u0014";
        objectArray[1] = Long.TYPE;
        _5O.l[1] = "java/lang/Long";
        objectArray[2] = "5IGy\t50\\Ly\u0002.<L\u000e\u0010)\u0004\r";
        objectArray[3] = Integer.TYPE;
        _5O.l[3] = "java/lang/Integer";
        objectArray[4] = "\u007f\b\u007f@F]\u007f\bh\u001cJReCh\u0002JGb22]\u0019\u0007";
        objectArray[5] = "B\u0018U4IgB\u0018BhEhXSBvE}_\"\u0018)\u0017?";
        objectArray[6] = Boolean.TYPE;
        _5O.l[6] = "java/lang/Boolean";
        objectArray[7] = "\u001d\u0017\bR<B\u001d\u0017\u001f\u000e0M\u0007\\\u001f\u00100X\u0000-KHg";
        objectArray[8] = "65R\u007f{\u001165E#w\u001e,~E=w\u000b+\u000f\u0017f/A";
        objectArray[9] = "Lz\u001c5\u0014\u0010Lz\u000bi\u0018\u001fV1\u000bw\u0018\nQ@[*I";
        objectArray[10] = "\u001ax\u001axSG\u001ax\r$_H\u00003\r:_]\u0007B_f\n\u001f";
        objectArray[11] = ":\\{\u0010v&'IyQszkv";
        objectArray[12] = "\u00137ORas\u000e\"M\u0013d/N ";
        objectArray[13] = "Y#(\u0012>IY#?N2FCh?P2SD\u0019o\nd\u0015\u0013%0] Shul\u000b";
        objectArray[14] = "\u0007q!\u007f\u0016_\u001ad#>\u0013\u0003Ul";
        objectArray[15] = "Z*q}P9Z*f!\\6@af?\\#G\u00106e\ne\u0010,i2N#k|5e";
        objectArray[16] = "\u001c\t'\f\u0004 \u001c\t0P\b/\u0006B0N\b:\u00013b\u0015P{";
        objectArray[17] = "C%ro_1C%e3S>Yne-S+^\u001f?r\u0001l";
        objectArray[18] = "}\u0015\r2\u0015\u0011}\u0015\u001an\u0019\u001eg^\u001ap\u0019\u000b`/J,L";
        objectArray[19] = Void.TYPE;
        _5O.l[19] = "java/lang/Void";
        objectArray[20] = "1?b`{K:0s/\u0018F/6";
        objectArray[21] = Double.TYPE;
        _5O.l[21] = "java/lang/Double";
        objectArray[22] = "\u000ecK](\u0015\u0013vI\u001c-I^t";
        objectArray[23] = "1,f\u0004ii,9dEl5l{";
        objectArray[24] = "si\u001aO6In|\u0018\u000e3\u0015.I";
        objectArray[25] = "n\u0019{;\u00061s\fyz\u0003m=\n";
        objectArray[26] = "\u0000P,\u0003u}up'\fd2\u0014~,\u0007`h`";
        objectArray[27] = "CF\u000b~u#6f\u0000qdlWh\u000bz`6#";
        objectArray[28] = "9ZN\u0002sL9ZY^\u007fC#\u0011Y@\u007fV$`\u000e\u001f)";
        objectArray[29] = "\u000b\u007f\b Tc~_\u0003/E,\u001fQ\b$Avk";
        objectArray[30] = Float.TYPE;
        _5O.l[30] = "java/lang/Float";
        objectArray[31] = "e\u0005wbS\u001b\u0010%|mBTq+wfF\u000e\u0005";
        objectArray[32] = "H(RW>GH(E\u000b2HRcE\u00152]U\u0012\u0014Jj";
        objectArray[33] = "c\u0016Hxho\u00166Cwy w8H|}z\u0003";
        objectArray[34] = "!l\u0014lJbTL\u001fc[-5B\u0014h_wA";
        objectArray[35] = "}N/#\"R\bn$,3\u001di`/'7G\u001d";
        objectArray[36] = " d\u0001 \u001bR d\u0016|\u0017]:/\u0016b\u0017H=^G=O\u001f-m\u0014}\u0005d|5E";
        objectArray[37] = "m\u0015\u0006\u0019<Rf\u001a\u0017V]\\m\u0011\u0013\f";
        objectArray[38] = "\u000b0Z-,F\u0000l\u0003$GL\u000fiU&\"6\u000btAx9\u000b\u0005bBpG";
        objectArray[39] = "a4EN?[#j\u0019HTR?`\\?9A\u001ei^\u000b9w&r_\u00172=b7LH.R=p\u001b\u000bT\u000711@\n7X7s]pnWdmY\u00131Q&p#";
        objectArray[40] = "Q;g\b3Q\u001586UU[\u00066gV9iVu7\no>P(;KmL\n7~NU\u0002\u0017#g\n9C\u0002'b1";
        objectArray[41] = "\u0005a\u000eg\u000e\u0000\u0002lQ'\u007f\u001dUq\r;\u0013/\u00065Rm\u007fEG2\u0006!A\u0018C1\u0013\\";
        objectArray[42] = "(h(\u000eBq3g:U+J)c*\u0017+p,n/\u0002Jk#|t";
        objectArray[43] = "ku^8T\u00119|G4e9DA~[\u000b\u0013ny\u00046Y\u001awu";
        objectArray[44] = "p[\u0001\byzc[\u0010\n\u0017&\u001f\u0007\u001a\u0013*m~_ETq\u0016{\rD]g&#\u001e\u0011P\u0017";
        objectArray[45] = "V#s^p\u0003Q.,\u001e\u0001\u001e\u00063p\u0002m,Uw,Z\u0001F\u0014p{\u0018?\u001b\u0010sne";
        objectArray[46] = "s_R\u0002#\u001dyXLY]GC\u0006JM`\u0007\"^\u0015\n;|y\u000b\u0014Q'\u001f&\rVL]";
        objectArray[47] = ",-\u0013M\u00038yl\u0015Nd>pl\nP\b\f$,V\bdaw/\tM\u0007>qm\u00147\u000eb#w\u0010S\n6'uj";
        objectArray[48] = "\u00157wU\u007f\u001b\u0012:(\u0015\u000e\u0006E't\tb4\u0016b-S\u000e_T2tUb\u001eA6qn";
        objectArray[49] = "\u001b\rb\u0012`X\u0011\n|I\u001e\t+\n\"M&CDUe\u001ae";
        objectArray[50] = "\u0003\u0016\u0003zu%\t\u0011\u001d!\u000b\u007fx(\u001d+tyHIEt3\"3D\u0019&f)VO\bwpD";
        objectArray[51] = "\u0014x\u0003Tr\nI|\u0000A\u000fQD{\\Xcc\u00166\u0004\u000e\u000f^K>\u0000Qb\bD?^?";
        objectArray[52] = "Z}E^\u0017H\frD\u0000y@]c\u001c\u0005\u0015r\r G^F%\nn\u001c[\u001fJNmM\u0006y";
        objectArray[53] = "\\fO\u001c7\"\raV\u001cG&5>Q\bzdTf\u000eO!\u001fY:\\\u001a*zR+\r\fG";
        objectArray[54] = "\u0011%\u001f'EmOp\u001cg~0!vA3FpN)\u0006d\u0005\n\u001d3\u0011<Ef\\&\u00159~";
        objectArray[55] = "Vs0C\u000b\\IcgZ5\u000eO\u007fhUbY\u0015)69M\u0001\u0012h2\u0005R\u0011Eq";
        objectArray[56] = "4}%\u000f)!$3'\u007f|\"/8w\u0019k\u00034'w:v;1#a\u007f.f:z`\u0010q!m9\u001a";
        objectArray[57] = "n\fF\u001eu>j\u0005ZF\u0016\u007f\u0001\f\\\u0005+5`T\u0003BpN=\u0017T\u001a-\"|\u0002P\u001f\u0016";
        objectArray[58] = "'\u0018\u001e,Rsu\u001d\n8olx\u001b\u0000;8;&LXWRnzM\u0015/Uc%\r";
        objectArray[59] = "]\u0003pDK`R\u0017|M!<\u000f\u0013!\u001aM\u000e^SpE!`[\u0000y\u0007N?\u001cW:}";
        objectArray[60] = "%D9X\u000bhwA-L6wzG'Oa $\u0017~#U kF(_\th|L";
        objectArray[61] = "\u0007\u000e%M\u001ed\u001e]&\u0012tx\u000f\u001d{J\u0018J[^$\u001dO\u001d\u001a\u0000'WJ!\u0005\u0010pNt";
        objectArray[62] = "FJ\u0016c\u0000 LM\b8~yvD\u00054\u0005z\u0011\u001aP7E";
        objectArray[63] = "0\u001d\u000eqfo:\u001a\u0010*\u00183\u0000LL;|`l_L*~";
        objectArray[64] = "}U^?,F(\u0014X<KK-\u0005C)\u001c\u001crW\u001dEz\u00185\u0012@&/Y3\u0011";
        objectArray[65] = "\u00049c(\u0017\tU>z(g\rm8r9\u001c\t\u001cjw-\b";
        objectArray[66] = "l8\n#_;>=\u001e7b$3;\u001445smhMX\u0007%l6\u001a!\u001evoi";
        objectArray[67] = "90\u0000O0\fk5\u0014[\r\u0018j\"\u001aSa*=dD\u00046}82K\rgD7&G\u0004\r";
        objectArray[68] = "oZc|0ne]}'N4_\u000b}7*l/\u000ft+r";
        objectArray[69] = "Z\\f?skP[xd\r1\rbxnr7\u0011\u0003 15lj\u000e|c`g\u000f\u0005m2v\n";
        objectArray[70] = ">Nx%\"Y%Aj~K|3Df@+\\<Os!0S.\u0014";
        objectArray[71] = "A,W\u0002suZkCC\u0001 J=Y\u001fVs\u0013h\u0002N\u0001uIlGKs/V)B";
        objectArray[72] = "\u000fe)\u0016iB\u0005b7M\u0017\u001c?4k\\sMS'kMq";
        objectArray[73] = "\\zyvG\u001bOzht)J3&bm\u0014\fR~=*Ow\t+<qS\u0014V-~l)";
        Object[] objectArray2 = objectArray;
        objectArray[74] = "bI7e\"utU2>\u0012/dP3h~\u001d0\u0010i7\u0012 0\u00124uv$d\u00166\u000f~)eA>ju84WS";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00aa' || c == '\u00cf' || c == '\u00f8' || c == '\u00fa') {
                field = _5O.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00aa' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00cf' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5O.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00a3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e6' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _5O.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5O" + " : " + string + " : " + methodType.toString(), exception);
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

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method h(long l2, long l3) {
        int n = _5O.e(l2, l3);
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
                clazz3 = _5O.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5O.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5O.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5O.k[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5O.f(2639584892670157L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5O.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5O.k[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5O.f(2639584892670157L, 0L);
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
            int n = _5O.e(l2, l3);
            object = k[n];
            try {
                if (!(object instanceof String)) break block2;
                _5O.k[n] = clazz = Class.forName(l[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5O.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5O.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5O.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5O.d(classArray[j], string, clazz2);
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
            throw new RuntimeException("dev/krypton/5O" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x1E92;
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
                throw new RuntimeException("dev/krypton/5O", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5O.e[n2] = n3;
        }
        return e[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5O.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field g(long l2, long l3) {
        int n = _5O.e(l2, l3);
        Object object = k[n];
        if (object instanceof String) {
            String string = l[n];
            int n2 = string.indexOf(8);
            Class clazz = _5O.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5O.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5O.c(clazz3, string2, clazz2)) != null) {
                    _5O.k[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5O.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5O.k[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5O.f(2639584892670157L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public native void cfr_renamed_2();

    private int int_3(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        long l2 = (Long)objectArray[2];
        l2 = b ^ l2;
        return n + (int)(_5O.c("\u00e6", -3644336720884766938L, (long)l2) * (double)(n2 - n + 1));
    }

    @_3i_0
    public void cfr_renamed_0(_9o o) {
        block38: {
            _5O o2;
            long l2;
            long l3;
            block37: {
                Object object;
                block35: {
                    int n;
                    long l4;
                    block36: {
                        long l5;
                        block33: {
                            block34: {
                                long l6;
                                block31: {
                                    long l7;
                                    block32: {
                                        CallSite callSite;
                                        long l8;
                                        block29: {
                                            block30: {
                                                block27: {
                                                    block28: {
                                                        long l9 = l3 = b ^ 0x3EA03E524411L;
                                                        l4 = l9 ^ 0x731A79763D5EL;
                                                        l2 = l9 ^ 0x62EA013AEA54L;
                                                        l5 = l9 ^ 0x4EBE039A86E8L;
                                                        l8 = l9 ^ 0x72D89933F824L;
                                                        l7 = l9 ^ 0x571503DAE709L;
                                                        l6 = l9 ^ 0x1A376D418974L;
                                                        n = _7C.cfr_renamed_3();
                                                        try {
                                                            try {
                                                                callSite = _5O.c("\u00aa", (Object)this, 7684891218477737183L, (long)l3);
                                                                if (n != 0) break block27;
                                                                if (_5O.c("\u00aa", (Object)callSite, 7690145310393292715L, (long)l3) != null) break block28;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _5O.a(matchException);
                                                            }
                                                            return;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _5O.a(matchException);
                                                        }
                                                    }
                                                    callSite = _5O.c("\u00aa", (Object)this, 7684891218477737183L, (long)l3);
                                                }
                                                try {
                                                    try {
                                                        if (n != 0) break block29;
                                                        if (_5O.c("\u00aa", (Object)callSite, 7690307368613468024L, (long)l3) == null) break block30;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _5O.a(matchException);
                                                    }
                                                    return;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _5O.a(matchException);
                                                }
                                            }
                                            callSite = _5O.c("\u00aa", (Object)this, 7684891218477737183L, (long)l3);
                                        }
                                        try {
                                            if (_5O.c("\u00aa", (Object)callSite, 7685063855860771820L, (long)l3) == null) {
                                                return;
                                            }
                                        }
                                        catch (MatchException matchException) {
                                            throw _5O.a(matchException);
                                        }
                                        CallSite callSite2 = _5O.c("\u00e6", 7689987985887660107L, (long)l3);
                                        try {
                                            Object[] objectArray = new Object[1];
                                            objectArray[0] = l8;
                                            float f = (float)(callSite2 - _5O.c("\u00aa", (Object)this, 7690518472547732328L, (long)l3)) - _5O.c("\u00a3", (Object)_5O.c("\u00aa", (Object)this, 7690321588589398410L, (long)l3), (Object)objectArray, 7691420683213455263L, (long)l3);
                                            object = f == 0.0f ? 0 : (f < 0.0f ? -1 : 1);
                                            if (n != 0) break block31;
                                            if (object >= 0) break block32;
                                        }
                                        catch (MatchException matchException) {
                                            throw _5O.a(matchException);
                                        }
                                        return;
                                    }
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l7;
                                    object = _5O.c("\u00a3", (Object)_5O.c("\u00aa", (Object)this, 7684395414524953822L, (long)l3), (Object)objectArray, 7684281563534868144L, (long)l3);
                                }
                                try {
                                    try {
                                        if (n != 0) break block33;
                                        Object[] objectArray = new Object[3];
                                        objectArray[2] = l6;
                                        objectArray[1] = (int)_5O.a("v", 12474, (long)(0x663D4C682AFCC49FL ^ l3));
                                        objectArray[0] = 1;
                                        if (object >= _5O.c("\u00a3", (Object)this, (Object)objectArray, 7691573383948076737L, (long)l3)) break block34;
                                    }
                                    catch (MatchException matchException) {
                                        throw _5O.a(matchException);
                                    }
                                    return;
                                }
                                catch (MatchException matchException) {
                                    throw _5O.a(matchException);
                                }
                            }
                            Object[] objectArray = new Object[2];
                            objectArray[1] = l4;
                            objectArray[0] = _5O.c("\u00f8", 7685365686771735914L, (long)l3);
                            object = _5O.c("\u00a3", (Object)_5O.c("\u00aa", (Object)this, 7685226033568514596L, (long)l3), (Object)objectArray, 7689920916708357846L, (long)l3);
                        }
                        try {
                            try {
                                if (n != 0) break block35;
                                if (object == false) break block36;
                            }
                            catch (MatchException matchException) {
                                throw _5O.a(matchException);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l5;
                            _5O.c("\u00a3", (Object)this, (Object)objectArray, 7685150498909598986L, (long)l3);
                        }
                        catch (MatchException matchException) {
                            throw _5O.a(matchException);
                        }
                    }
                    try {
                        o2 = this;
                        if (n != 0) break block37;
                        Object[] objectArray = new Object[2];
                        objectArray[1] = l4;
                        objectArray[0] = _5O.c("\u00f8", 7691277557722301425L, (long)l3);
                        object = _5O.c("\u00a3", (Object)_5O.c("\u00aa", (Object)o2, 7685226033568514596L, (long)l3), (Object)objectArray, 7689920916708357846L, (long)l3);
                    }
                    catch (MatchException matchException) {
                        throw _5O.a(matchException);
                    }
                }
                if (object == false) break block38;
                o2 = this;
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l2;
            _5O.c("\u00a3", (Object)o2, (Object)objectArray, 7690680489046745323L, (long)l3);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5O.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5O.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

