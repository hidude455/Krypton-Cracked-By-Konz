/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1792
 *  net.minecraft.class_243
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_3966
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._0R;
import dev.krypton._3i_0;
import dev.krypton._3s;
import dev.krypton._40;
import dev.krypton._4r;
import dev.krypton._4w;
import dev.krypton._6x_0;
import dev.krypton._92;
import dev.krypton._95;
import dev.krypton._9E;
import dev.krypton._9k_0;
import dev.krypton._9m_0;
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
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_243;
import net.minecraft.class_3959;
import net.minecraft.class_3966;

public class _64
extends _6x_0 {
    private final _9r cfr_renamed_325;
    private final _92 cfr_renamed_323;
    private final _9r cfr_renamed_9;
    private final _9m_0 cfr_renamed_6;
    private final _9r cfr_renamed_8;
    private final _9E cfr_renamed_320;
    private final _9r cfr_renamed_159;
    private final _9r cfr_renamed_1;
    private final _92 cfr_renamed_2;
    private final _92 cfr_renamed_0;
    private final _9k_0 cfr_renamed_298;
    private final _9k_0 cfr_renamed_4;
    private final _9r cfr_renamed_318;
    private final _9r cfr_renamed_3;
    private final _9r cfr_renamed_7;
    private final _9r cfr_renamed_312;
    private float cfr_renamed_310;
    private float cfr_renamed_334;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    public _64(long l2, byte by) {
        long l3;
        long l4 = l3 = (l2 << 8 | (long)by << 56 >>> 56) ^ b;
        long l5 = l4 ^ 0x1B15331D6F48L;
        long l6 = l4 ^ 0x53676154D2EEL;
        long l7 = l4 ^ 0x1E06C6341259L;
        long l8 = l4 ^ 0x4307539DAB7DL;
        long l9 = l4 ^ 0x791A8885ABBFL;
        long l10 = l9 >>> 8;
        int n = (int)(l9 << 56 >>> 56);
        long l11 = l4 ^ 0x55FF6175A87L;
        long l12 = l4 ^ 0x5E74337CBF2BL;
        long l13 = l4 ^ 0x1A9F6533B5F5L;
        long l14 = l4 ^ 0x502BA7E13E23L;
        super((int)_64.a("g", 7912, (long)(0x506BB95840FAB8B0L ^ l3)), -1, (_4r)((Object)_64.c("\u00f0", -896879722763814784L, (long)l3)), l11);
        this.cfr_renamed_325 = new _9r((int)_64.a("g", 18104, (long)(0x7F04F034F76460F4L ^ l3)), false, l6);
        this.cfr_renamed_323 = new _92((int)_64.a("g", 6779, (long)(0x6F8CA5115B02BC32L ^ l3)), 1.0, l8, 9.0, 1.0, 1.0);
        this.cfr_renamed_9 = new _9r((int)_64.a("g", 14737, (long)(0x6B18235BFAF41FCFL ^ l3)), false, l6);
        this.cfr_renamed_6 = new _9m_0((int)_64.a("g", 20133, (long)(0x51F015E9BCDC68F1L ^ l3)), l7, (class_1792)_64.c("\u00f0", -883711612513692657L, (long)l3));
        _4w[] wArray = _3s.cfr_renamed_5();
        this.cfr_renamed_8 = new _9r((int)_64.a("g", 1674, (long)(0x708F0D69CB7A0CCL ^ l3)), false, l6);
        this.cfr_renamed_320 = new _9E((int)_64.a("g", 5665, (long)(0x5715D8219B8DB064L ^ l3)), l5, (Enum)((Object)_64.c("\u00f0", -886237835335240480L, (long)l3)), _0R.class);
        this.cfr_renamed_159 = new _9r((int)_64.a("g", 19240, (long)(0x8792D1675CAED69L ^ l3)), true, l6);
        this.cfr_renamed_1 = new _9r((int)_64.a("g", 612, (long)(0x1A33E05D3E1EA420L ^ l3)), false, l6);
        this.cfr_renamed_2 = new _92((int)_64.a("g", 19912, (long)(0x235184E07A58EB82L ^ l3)), 0.1, l8, 64.0, 32.0, 0.1);
        this.cfr_renamed_0 = new _92((int)_64.a("g", 28638, (long)(0x5B5AC6B8CA6F4995L ^ l3)), 5.0, l8, 360.0, 180.0, 1.0);
        this.cfr_renamed_298 = new _9k_0((int)_64.a("g", 18394, (long)(0x389C36CCEFEE18FL ^ l3)), 0.0, 10.0, 0.1, 2.0, l12, 4.0);
        this.cfr_renamed_4 = new _9k_0((int)_64.a("g", 28030, (long)(0x3CFDCC5CC9F94B21L ^ l3)), 0.0, 10.0, 0.1, 2.0, l12, 4.0);
        this.cfr_renamed_318 = new _9r((int)_64.a("g", 12858, (long)(0x1EE8E8BFA770147AL ^ l3)), false, l6);
        this.cfr_renamed_3 = new _9r((int)_64.a("g", 15556, (long)(0x352C43EE62AA1A9FL ^ l3)), false, l6);
        this.cfr_renamed_7 = new _9r((int)_64.a("g", 3036, (long)(0x6E1E852D717A2D8AL ^ l3)), true, l6);
        this.cfr_renamed_312 = new _9r((int)_64.a("g", 10601, (long)(0x283863FB61950F2EL ^ l3)), true, l6);
        CallSite callSite = _64.c("u", (Object)this, -883855732273202485L, (long)l3);
        CallSite callSite2 = _64.c("u", (Object)this, -897015158624244470L, (long)l3);
        _64.c("G", (Object)callSite2, -885075405976505367L, (long)l3);
        Object[] objectArray = new Object[3];
        objectArray[2] = () -> ((_9r)((Object)callSite2)).cfr_renamed_3(l14);
        objectArray[1] = (int)((byte)n);
        objectArray[0] = l10;
        _64.c("N", (Object)callSite, (Object)objectArray, -886866862840660192L, (long)l3);
        _4w[] wArray2 = wArray;
        try {
            CallSite callSite3 = _64.c("u", (Object)this, -883643724439820298L, (long)l3);
            CallSite callSite4 = _64.c("u", (Object)this, -885483453864070633L, (long)l3);
            _64.c("G", (Object)callSite4, -885075405976505367L, (long)l3);
            Object[] objectArray2 = new Object[3];
            objectArray2[2] = () -> ((_9r)((Object)callSite4)).cfr_renamed_3(l14);
            objectArray2[1] = (int)((byte)n);
            objectArray2[0] = l10;
            _64.c("N", (Object)callSite3, (Object)objectArray2, -886866862840660192L, (long)l3);
            _95[] nullArray = new _95[_64.a("g", 17496, (long)(0x497CDDB704F2621BL ^ l3))];
            nullArray[0] = _64.c("u", (Object)this, -897015158624244470L, (long)l3);
            nullArray[1] = _64.c("u", (Object)this, -883855732273202485L, (long)l3);
            nullArray[2] = _64.c("u", (Object)this, -885483453864070633L, (long)l3);
            nullArray[3] = _64.c("u", (Object)this, -883643724439820298L, (long)l3);
            nullArray[4] = _64.c("u", (Object)this, -882739609363128570L, (long)l3);
            nullArray[5] = _64.c("u", (Object)this, -886689666136079475L, (long)l3);
            nullArray[_64.a("g", 22836, (long)(0x59EEBC86D3AF7F6DL ^ l3))] = _64.c("u", (Object)this, -883152722988499736L, (long)l3);
            nullArray[_64.a("g", 16568, (long)(0x349FA0DF993A66F7L ^ l3))] = _64.c("u", (Object)this, -885445161226527720L, (long)l3);
            nullArray[_64.a("g", 1608, (long)(0x6D5289B8B30BA00AL ^ l3))] = _64.c("u", (Object)this, -886319928916375063L, (long)l3);
            nullArray[_64.a("g", 18890, (long)(0x3DEEF9A31FBB6F9DL ^ l3))] = _64.c("u", (Object)this, -884977163473421340L, (long)l3);
            nullArray[_64.a("g", 16466, (long)(0x365664E47577661AL ^ l3))] = _64.c("u", (Object)this, -890694788297703920L, (long)l3);
            nullArray[_64.a("g", 26218, (long)(0x73BA908DC0E14024L ^ l3))] = _64.c("u", (Object)this, -890845562970107870L, (long)l3);
            nullArray[_64.a("g", 5562, (long)(0x7DD879BDDDA6B3F7L ^ l3))] = _64.c("u", (Object)this, -885556939706588167L, (long)l3);
            nullArray[_64.a("g", 2020, (long)(0x1440E4009661A1BEL ^ l3))] = _64.c("u", (Object)this, -896957265790699221L, (long)l3);
            nullArray[_64.a("g", 6558, (long)(0xF1ED93BA8B3BFC2L ^ l3))] = _64.c("u", (Object)this, -882892201779787445L, (long)l3);
            nullArray[_64.a("g", 29532, (long)(0x1E0129830644D501L ^ l3))] = _64.c("u", (Object)this, -885671109701990544L, (long)l3);
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = nullArray;
            objectArray3[0] = l13;
            _64.c("N", (Object)this, (Object)objectArray3, -883018014302883764L, (long)l3);
            if (wArray2 != null) {
                _4w.cfr_renamed_8(new String[2]);
            }
        }
        catch (MatchException matchException) {
            throw _64.a(matchException);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                a.init(_64.class, 35);
                _64.b = l.a(3608547244409504847L, -8441120284006448735L, MethodHandles.lookup().lookupClass()).a(102747172516300L);
                _64.j = new Object[137];
                _64.k = new String[137];
                _64.b();
                _64.f = new HashMap<K, V>(13);
                var0 = _64.b ^ 119239083009442L;
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
                var8_3 = new long[28];
                var5_4 = 0;
                var6_5 = "\u00f1\u00c93Y\u0015\u0099\u000f\u009cV\u0093:S\u00a2\u00fa\u00e0Mz\u00f5r\u0019\u00b6\u00ac\u00bfhE\"\u00dd\u0091\u000f\u00cd\u00ea\u0002\u0098\u0084\u00a4\u00ec\u00fe2\u00b8\u0017\u00b4S\u00e3B\u00b8v\u009c\u0002\u008dM<#\u0007\u00d7\u00caa\u00dc\u00f9\u00ba\u008c\u00ff\u0002'H$\f=\u00fb\u0081}\u00a97r\u00edJy'\u001c\u0011\u00b9\u00923sEy\u0092\u001fe6:,\u00ba&\u00c3B\u0095\u0093aQ\u0015\u00c6\u00fa\u00a1\u00cc\u0090\u00eb\u00df\u0016\u00ca\u00a3\u00c3e\u0086Ixn\u00d6\u00af\u00a0~M\u00b7!\u00abN4\u000e7\u00a3o^\u0090M\u00a8R\u001c-:L\u0015\u0006\u00a5\u0094\u0099\ff\u00aaU\u00f2\u00b7f\u008aYn\u00d1\u00b9\u008c*4\u00d6\u00eb\u00ca\u00c7\u00b4\u0003\u00cc\u00a6\u0096'\u00e4\u0001\u00cf\u00c4raF<ur\u00d8\u00fe\u00f4\bN\u00d2\u0007g\u00f2\u000b'\u0005o2\u00c1\u00b1*\u00dekrFE\u00f4J\u00bf2\u0080VR";
                var7_6 = "\u00f1\u00c93Y\u0015\u0099\u000f\u009cV\u0093:S\u00a2\u00fa\u00e0Mz\u00f5r\u0019\u00b6\u00ac\u00bfhE\"\u00dd\u0091\u000f\u00cd\u00ea\u0002\u0098\u0084\u00a4\u00ec\u00fe2\u00b8\u0017\u00b4S\u00e3B\u00b8v\u009c\u0002\u008dM<#\u0007\u00d7\u00caa\u00dc\u00f9\u00ba\u008c\u00ff\u0002'H$\f=\u00fb\u0081}\u00a97r\u00edJy'\u001c\u0011\u00b9\u00923sEy\u0092\u001fe6:,\u00ba&\u00c3B\u0095\u0093aQ\u0015\u00c6\u00fa\u00a1\u00cc\u0090\u00eb\u00df\u0016\u00ca\u00a3\u00c3e\u0086Ixn\u00d6\u00af\u00a0~M\u00b7!\u00abN4\u000e7\u00a3o^\u0090M\u00a8R\u001c-:L\u0015\u0006\u00a5\u0094\u0099\ff\u00aaU\u00f2\u00b7f\u008aYn\u00d1\u00b9\u008c*4\u00d6\u00eb\u00ca\u00c7\u00b4\u0003\u00cc\u00a6\u0096'\u00e4\u0001\u00cf\u00c4raF<ur\u00d8\u00fe\u00f4\bN\u00d2\u0007g\u00f2\u000b'\u0005o2\u00c1\u00b1*\u00dekrFE\u00f4J\u00bf2\u0080VR".length();
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
                    var6_5 = "C\u00a7\"\u008c\u00c1\u00d4\u00c5\u00eb%\u00f4\u00f9V\u000e@ \u00ee";
                    var7_6 = "C\u00a7\"\u008c\u00c1\u00d4\u00c5\u00eb%\u00f4\u00f9V\u000e@ \u00ee".length();
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
        _64.d = var8_3;
        _64.e = new Integer[28];
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
            case 0 -> 41;
            case 1 -> 43;
            case 2 -> 13;
            case 3 -> 17;
            case 4 -> 1;
            case 5 -> 36;
            case 6 -> 62;
            case 7 -> 50;
            case 8 -> 28;
            case 9 -> 40;
            case 10 -> 11;
            case 11 -> 51;
            case 12 -> 16;
            case 13 -> 30;
            case 14 -> 54;
            case 15 -> 4;
            case 16 -> 60;
            case 17 -> 10;
            case 18 -> 44;
            case 19 -> 61;
            case 20 -> 14;
            case 21 -> 37;
            case 22 -> 15;
            case 23 -> 8;
            case 24 -> 7;
            case 25 -> 58;
            case 26 -> 49;
            case 27 -> 21;
            case 28 -> 23;
            case 29 -> 25;
            case 30 -> 57;
            case 31 -> 53;
            case 32 -> 52;
            case 33 -> 26;
            case 34 -> 27;
            case 35 -> 45;
            case 36 -> 33;
            case 37 -> 35;
            case 38 -> 31;
            case 39 -> 29;
            case 40 -> 63;
            case 41 -> 18;
            case 42 -> 12;
            case 43 -> 55;
            case 44 -> 5;
            case 45 -> 56;
            case 46 -> 32;
            case 47 -> 59;
            case 48 -> 34;
            case 49 -> 24;
            case 50 -> 22;
            case 51 -> 6;
            case 52 -> 19;
            case 53 -> 38;
            case 54 -> 47;
            case 55 -> 46;
            case 56 -> 3;
            case 57 -> 39;
            case 58 -> 0;
            case 59 -> 9;
            case 60 -> 20;
            case 61 -> 48;
            case 62 -> 2;
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
        _64.k[n3] = new String(cArray);
        return n3;
    }

    private boolean boolean_9(Object[] objectArray) {
        boolean bl;
        block4: {
            block5: {
                boolean bl2;
                class_1657 class_16572 = (class_1657)objectArray[0];
                long l2 = (Long)objectArray[1];
                l2 = b ^ l2;
                _4w[] wArray = _3s.cfr_renamed_5();
                CallSite callSite = _64.c("u", (Object)_64.c("u", (Object)this, -8541960913265396360L, (long)l2), -8553725775267106864L, (long)l2);
                try {
                    bl = callSite instanceof class_3966;
                    if (wArray != null) break block4;
                    if (!bl) break block5;
                }
                catch (MatchException matchException) {
                    throw _64.a(matchException);
                }
                class_3966 class_39662 = (class_3966)callSite;
                try {
                    bl2 = _64.c("N", (Object)class_39662, -8539535268390152442L, (long)l2) == class_16572;
                }
                catch (MatchException matchException) {
                    throw _64.a(matchException);
                }
                return bl2;
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_1657 net_minecraft_class_1657_9(Object[] var1_1) {
        block35: {
            var4_2 = (Integer)var1_1[0];
            var2_3 = (Long)var1_1[1];
            v0 = var5_4 = ((long)var4_2 << 32 | var2_3 << 32 >>> 32) ^ _64.b;
            var7_5 = v0 ^ 112069098139125L;
            var9_6 = v0 ^ 33905311740351L;
            var11_7 = v0 ^ 9266168555697L;
            var13_8 = v0 ^ 139981414027979L;
            var15_9 = v0 ^ 99516214431206L;
            var17_10 = v0 ^ 5499183369686L;
            var20_11 = null;
            v1 = new Object[1];
            v1[0] = var13_8;
            var21_12 = (double)_64.c("N", (Object)_64.c("u", (Object)this, (long)-4591844696780096996L, (long)var5_4), (Object)v1, (long)-4593370107825599787L, (long)var5_4);
            var19_13 = _3s.cfr_renamed_5();
            var23_14 = _64.c("N", (Object)_64.c("N", (Object)_64.c("u", (Object)_64.c("u", (Object)this, (long)-4591822133191754678L, (long)var5_4), (long)-4589838728553058991L, (long)var5_4), (long)-4592258784064715037L, (long)var5_4), (long)-4592122908110679865L, (long)var5_4);
            while (_64.c("N", (Object)var23_14, (long)-4591536562183434110L, (long)var5_4) != false) {
                block48: {
                    block46: {
                        block47: {
                            block44: {
                                block45: {
                                    block42: {
                                        block43: {
                                            block40: {
                                                block41: {
                                                    block39: {
                                                        block38: {
                                                            block36: {
                                                                var24_15 = (class_1657)_64.c("N", (Object)var23_14, (long)-4591214564950948667L, (long)var5_4);
                                                                try {
                                                                    try {
                                                                        try {
                                                                            v2 = var24_15;
                                                                            if (var4_2 <= 0) break block35;
                                                                            v3 = var19_13;
                                                                            if (var2_3 >= 0L) {
                                                                                if (v3 != null) break block35;
                                                                                v3 = var19_13;
                                                                            }
                                                                            if (v3 != null) break block36;
                                                                        }
                                                                        catch (MatchException v4) {
                                                                            throw _64.a(v4);
                                                                        }
                                                                        if (v2 == _64.c("u", (Object)_64.c("u", (Object)this, (long)-4591822133191754678L, (long)var5_4), (long)-4589989272257563186L, (long)var5_4)) {
                                                                            continue;
                                                                        }
                                                                    }
                                                                    catch (MatchException v5) {
                                                                        throw _64.a(v5);
                                                                    }
                                                                }
                                                                catch (MatchException v6) {
                                                                    throw _64.a(v6);
                                                                }
                                                                v7 = var24_15;
                                                            }
                                                            try {
                                                                v8 = _64.c("N", (Object)v7, (long)-4590047837239711741L, (long)var5_4);
                                                                if (var19_13 != null) break block38;
                                                                if (v8 != false) continue;
                                                            }
                                                            catch (MatchException v9) {
                                                                throw _64.a(v9);
                                                            }
                                                            try {
                                                                v10 = _64.c("N", (Object)var24_15, (long)-4592515272757657874L, (long)var5_4);
                                                                if (var19_13 != null) break block39;
                                                                cfr_temp_0 = v10 - 0.0f;
                                                                v8 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                                            }
                                                            catch (MatchException v11) {
                                                                throw _64.a(v11);
                                                            }
                                                        }
                                                        if (v8 <= 0) continue;
                                                        v10 = _64.c("N", (Object)_64.c("u", (Object)_64.c("u", (Object)this, (long)-4591822133191754678L, (long)var5_4), (long)-4589989272257563186L, (long)var5_4), (Object)var24_15, (long)-4589293220477526693L, (long)var5_4);
                                                    }
                                                    var25_16 = (double)v10;
                                                    try {
                                                        v12 = new Object[1];
                                                        v12[0] = var13_8;
                                                        cfr_temp_1 = var25_16 - (double)_64.c("N", (Object)_64.c("u", (Object)this, (long)-4591844696780096996L, (long)var5_4), (Object)v12, (long)-4593370107825599787L, (long)var5_4);
                                                        v13 /* !! */  = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                                                        v14 = var19_13;
                                                        if (var2_3 > 0L) {
                                                            if (v14 != null) break block40;
                                                            if (v13 /* !! */  <= 0) break block41;
                                                        }
                                                        ** GOTO lbl84
                                                    }
                                                    catch (MatchException v15) {
                                                        throw _64.a(v15);
                                                    }
                                                    if (var4_2 >= 0) continue;
                                                }
                                                v13 /* !! */  = (double)_64.c("N", (Object)_64.c("u", (Object)this, (long)-4587258285043282459L, (long)var5_4), (long)var17_10, (long)-4590779656822998417L, (long)var5_4);
                                            }
                                            try {
                                                v14 = var19_13;
lbl84:
                                                // 2 sources

                                                if (v14 != null) break block42;
                                                if (v13 /* !! */  == false) break block43;
                                            }
                                            catch (MatchException v16) {
                                                throw _64.a(v16);
                                            }
                                            var27_17 = _64.c("N", (Object)_64.c("N", (Object)var24_15, (long)-4590191182824737947L, (long)var5_4), (double)0.0, (double)1.0, (double)0.0, (long)-4590946405191021577L, (long)var5_4);
                                            v17 = new Object[2];
                                            v17[1] = var11_7;
                                            v17[0] = var27_17;
                                            var28_18 = _64.c("N", (Object)this, (Object)v17, (long)-4591192291281023797L, (long)var5_4);
                                            v18 = new Object[3];
                                            v18[2] = Float.valueOf((float)var28_18[1]);
                                            v18[1] = Float.valueOf((float)var28_18[0]);
                                            v18[0] = var7_5;
                                            var29_19 = _64.c("N", (Object)this, (Object)v18, (long)-4593448376448965521L, (long)var5_4);
                                            try {
                                                v19 = new Object[1];
                                                v19[0] = var15_9;
                                                cfr_temp_2 = var29_19 - (double)_64.c("N", (Object)_64.c("u", (Object)this, (long)-4592905403390801903L, (long)var5_4), (Object)v19, (long)-4577746495867466053L, (long)var5_4) / 2.0;
                                                v13 /* !! */  = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 > 0 ? 1 : -1);
                                                v20 = var19_13;
                                                if (var2_3 > 0L) {
                                                    if (v20 != null) break block42;
                                                    if (v13 /* !! */  <= 0) break block43;
                                                }
                                                ** GOTO lbl124
                                            }
                                            catch (MatchException v21) {
                                                throw _64.a(v21);
                                            }
                                            if (var2_3 >= 0L) continue;
                                        }
                                        v13 /* !! */  = (double)_64.c("N", (Object)_64.c("u", (Object)this, (long)-4587407127012629545L, (long)var5_4), (long)var17_10, (long)-4590779656822998417L, (long)var5_4);
                                    }
                                    try {
                                        try {
                                            try {
                                                v20 = var19_13;
lbl124:
                                                // 2 sources

                                                if (v20 != null) break block44;
                                                if (v13 /* !! */  == false) break block45;
                                            }
                                            catch (MatchException v22) {
                                                throw _64.a(v22);
                                            }
                                            v23 = new Object[2];
                                            v23[1] = var24_15;
                                            v23[0] = var9_6;
                                            v13 /* !! */  = (double)_64.c("N", (Object)this, (Object)v23, (long)-4589499682890297069L, (long)var5_4);
                                            if (var19_13 != null) break block44;
                                        }
                                        catch (MatchException v24) {
                                            throw _64.a(v24);
                                        }
                                        if (v13 /* !! */  != false) break block45;
                                    }
                                    catch (MatchException v25) {
                                        throw _64.a(v25);
                                    }
                                    if (var2_3 >= 0L) continue;
                                }
                                try {
                                    if (var4_2 <= 0) break block46;
                                    v26 = var25_16;
                                    if (var19_13 != null) break block47;
                                    cfr_temp_3 = v26 - var21_12;
                                    v13 /* !! */  = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                                }
                                catch (MatchException v27) {
                                    throw _64.a(v27);
                                }
                            }
                            if (v13 /* !! */  >= 0) break block48;
                            v26 = var25_16;
                        }
                        var21_12 = v26;
                    }
                    var20_11 = var24_15;
                }
                if (var19_13 == null) continue;
            }
            v2 = var20_11;
        }
        return v2;
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = "\\s\u001dh\b\u001f\\s\n4\u0004\u0010F8\n*\u0004\u0005AIZsVD";
        objectArray[1] = Float.TYPE;
        _64.k[1] = "java/lang/Float";
        objectArray[2] = "4h\u0003\u000f$=4h\u0014S(2.#\u0014M(')RD\u0010y";
        objectArray[3] = "uX\u0004\u007fGQuX\u0013#K^o\u0013\u0013=KKhbGe\u001c";
        objectArray[4] = "(!B\u0016\\\u001854@WYDz<";
        objectArray[5] = "\u001dVNc\rw\u0016Y_,nz\u0003_";
        objectArray[6] = Double.TYPE;
        _64.k[6] = "java/lang/Double";
        objectArray[7] = ".m\u0013leD.m\u00040iK4&\u0004.i^3WUq1";
        objectArray[8] = "F^\u0007\u001a\u000f7F^\u0010F\u00038\\\u0015\u0010X\u0003-[d@\rTh";
        objectArray[9] = "\f1A\u0003[\u0012\f1V_W\u001d\u0016zVAW\b\u0011\u000b\u0004\u001f\u000fL";
        objectArray[10] = "\u0000s\u0007FNB\u0000s\u0010\u001aBM\u001a8\u0010\u0004BX\u001dI@Q\u0016\u0012Ju\u001f\tPX1$GZ";
        objectArray[11] = "\u0016bF-\\\u0016\u0016bQqP\u0019\f)QoP\f\u000bX\u00040\t";
        objectArray[12] = "<\u0005\u0004l\rK<\u0005\u00130\u0001D&N\u0013.\u0001Q!?C{U\u001b";
        objectArray[13] = "3\u0014\u00100\u0005a3\u0014\u0007l\tn)_\u0007r\t{..W'^=";
        objectArray[14] = "DfT\u0013I\u0015DfCOE\u001a^-CQE\u000fY\\\u0012\u000e\u001dXIoANW#\u00187\u0010";
        objectArray[15] = "\rw_P\r\u0006\rwH\f\u0001\t\u0017<H\u0012\u0001\u001c\u0010M\u0018GUVGqG\u001f\u0013\u001c<!\u0012HP";
        objectArray[16] = "T\u0017`b8TJ\u001fz-ZHM\u0002";
        objectArray[17] = "Mt=ARfPa?\u0000W:\u001f%";
        objectArray[18] = " w-\\2A=b/\u001d7\u001d}`";
        objectArray[19] = "\u0001\"\u0019\u0002 \\\u001f*\u0003MG]\u000e1\u000e\u0017a[";
        objectArray[20] = "-\u0000'2c#-\u00000no,7K0po90:b*;}";
        objectArray[21] = "PaQ\u0019MQ%AZ\u0016\\\u001eDOQ\u001dXD0";
        objectArray[22] = Boolean.TYPE;
        _64.k[22] = "java/lang/Boolean";
        objectArray[23] = "p\u0012CP\u000f\u0014p\u0012T\f\u0003\u001bjYT\u0012\u0003\u000em(\u0005JQ";
        objectArray[24] = "Lp0\u007f!0Qe2>$l\u0011'";
        objectArray[25] = "QKq\u007f(w$kzp98Eeq{=b1";
        objectArray[26] = "-B8Q\u0018fXb3^\t)9l8U\rsM";
        objectArray[27] = "\u0016'";
        objectArray[28] = "yWtu}\rrXe:\u001c\u0003ySa`";
        objectArray[29] = "n*J\u001cUl\u001b\nA\u0013D#z\u0004J\u0018@y\u000e";
        objectArray[30] = Long.TYPE;
        _64.k[30] = "java/lang/Long";
        objectArray[31] = "R!nJ\u0014('\u0001eE\u0005gF\u000fnN\u0001=2";
        objectArray[32] = Integer.TYPE;
        _64.k[32] = "java/lang/Integer";
        objectArray[33] = "*Vkg\\\u001f7Ci&YCw\u0006";
        objectArray[34] = "p\u001fg+wn\u0005?l$f!d1g/b{\u0010";
        objectArray[35] = "|`\u0010pD\u0006|`\u0007,H\tf+\u00072H\u001caZUf\u0019]";
        objectArray[36] = "K@\u001a\u0005|5K@\rYp:Q\u000b\rGp/Vz_\u001c(n";
        objectArray[37] = "{!tM_:f4v\fZf&\u0001";
        objectArray[38] = "\u0014\u0016?\u0007K2\t\u0003=FNnI\u001e";
        objectArray[39] = "\u0019z3A{G\u0004o1\u0000~\u001bMM";
        objectArray[40] = "'\t\u0011z=K:\u001c\u0013;8\u0017z\u0007";
        objectArray[41] = "\u0019gF\u0003\b\u0018\u0004rDB\rDIp";
        objectArray[42] = "9\u0018Q:|'L8Z5mh-6Q>i2Y";
        objectArray[43] = Void.TYPE;
        _64.k[43] = "java/lang/Void";
        objectArray[44] = "a`p`3s\u007fhj/Rdadeun";
        objectArray[45] = "pm~\u000e&\u0007uxu\u000e-\u001cyh7g\u00066H";
        objectArray[46] = "U\u001f}NkR ?vAz\u001dA1}J~G5";
        objectArray[47] = "7\u0019;\u000b[\f7\u0019,WW\u0003-R,IW\u0016*#~\u0013\u0000T";
        objectArray[48] = "zLeQ?EzLr\r3J`\u0007r\u00133_gv Hk\u0015";
        objectArray[49] = "\f_|\\8Qy\u007fwS)\u001e\u0018q|X-Dl";
        objectArray[50] = "\u0000z@\u0001\fn\u000buQNgl\u001fv";
        objectArray[51] = "\u0002\foMj\u0018w,dB{W\u0016\"oI\u007f\rb";
        objectArray[52] = "|7JX\u001a\u0015|7]\u0004\u0016\u001af|]\u001a\u0016\u000fa\r\nE@";
        objectArray[53] = "c~v\u0011=\u0011c~aM1\u001ey5aS1\u000b~D3\u000fdI";
        objectArray[54] = "M}m88+8]f7)dYSm<->-";
        objectArray[55] = "xSaW\u0016_\rsjX\u0007\u0010l}aS\u0003J\u0018";
        objectArray[56] = "9%\r9_;L\u0005\u00066Nt-\u000b\r=J.Y";
        objectArray[57] = "=o0tX>HO;{Iq)A0pM+]";
        objectArray[58] = "j/\u000b\u000fsc:1\u0015\u001e\u001d{6\u001c\u001d\u0012gj<+pAqe!9N\u0000scnPL\u0011\u007fw8n\r\u0013y8Q";
        objectArray[59] = "Y'\u001fzQjL#C=65Cv\u0003J[&b\u007f\u0001~[\u0010Zd\u0000bPZCt\u0000wI`\\'\u001d}6?A Ai\u000e=\u0019wB\u0005S<\u001f%\u0010=QdH&|";
        objectArray[60] = "[\u0015\u0015\u000b\"nZ\u001d\u001d\r\u001dn1\tY\u0005,*^]\u001fI`";
        objectArray[61] = "\u0000D:5\u0000\u0003QC;}m\u0006^C1(:Q\u0004\u0012eDR\u0002P_8/\u0003\u0005Q\u0017";
        objectArray[62] = "F\u0014H\"O+G\u001c@$p/|dUa\u0000 R\u000b\u0001'Ll";
        objectArray[63] = "\u0019djgj%\u0018lbaU!=\u0014g!2vCob!8";
        objectArray[64] = "K\u001dn^\u0011ZJ\u0015fX.Q!T$]\u0017\u0004\u001f\u0004$YJ\u0002!\u0001oZR\u0010Y\u0012o\u001eB`";
        objectArray[65] = "H3-u{\fEs.q\u001d\u000fN%v&JQ\u001fp(Je\u000b\u001f.l.e\u001b\u0010#";
        objectArray[66] = "\u000b,M/^)\n$E)a(a%C4_v\u000f$V8\u001e";
        objectArray[67] = "\u0012#qFep\u00133{E\u000bw\u00106u\u001egEDr.@\u000b.\u0011(e\u00105o\u0013.*y7~\u001f:|Gv|\u0019u\u0015Egp\r#+\u0004evBJz\u0010o-\u0013({\u0000e.}";
        objectArray[68] = ";HqW(!-^.\fSeA\u0003v\u0017j>\u007fSv\u001378AFu\r:j:Cu\u0007S";
        objectArray[69] = "9(+{e+z-&+\u0003rn7%uo@8uy/?\u0017\u007fs\"{3lzs(\u0012";
        objectArray[70] = "\u0007baYOC\u0006ji_pEm++ZI\u001dS{+^\u0014\u001bmp)XJ\u0010\u000eyz^\by";
        objectArray[71] = "\u0003\u0007\u001bZ\u0006\u0011\u000f\u001cG\u000fj\u001b\u0002\u000b\\e\b\u0018\u0010K\u001fX\rE\u0010F ";
        objectArray[72] = ".(.zA<m-#*'ey7 tKW*s|,'psq)m\u001a9+*;\u0013";
        objectArray[73] = "-~}\u001b \u000f,vu\u001d\u001f\u000bz\u000e`Xo\u00049a4\u001e#H";
        objectArray[74] = "f\n\u007f\u00034 %\u000frSRy1\u0015q\r>KgW-Wo\u001c Qv\u0003bg%Q|j";
        objectArray[75] = "4,a6j\u0004j-46\u000fQ\u000fy?46\f1)?0k\n\u000f=ot5Ts,|&fh";
        objectArray[76] = ":(uv@\u001fnn9:>JVqi;L\u000fln:&Fp8\u007f<wY\u0019jww7>";
        objectArray[77] = "S\u000b\u000bMZmR\u0003\u0003Kek9\u0017GCT)VC\u0001\u000f\u0018";
        objectArray[78] = "RH9\fbk\u0002V'\u001d\ff\u0015^$D\f3\u0005U2\u00172r\u0007S}~0c\u000bG+@qa\r\bBB`m\u0019^|\u0003bkV7";
        objectArray[79] = "<\f\u0019\u001cn\u0018=\u0004\u0011\u001aQ\u001fV\u0010U\u0012`\\9D\u0013^,";
        objectArray[80] = "\u007f\f\\g^U<\tQ78\f(\u0013RiT>~Q\u000e3\u0006i9WUg\b\u0012<W_\u000eE\u0002xU\u000erT\u0011*\u00062";
        objectArray[81] = "|\"G5U]>rS27\r$.M<`Zzy\u0015P\r\u0000+*OlN\u0005&z";
        objectArray[82] = "`\u0007o.\u001e3\"\u0002y(_U<Ri3\u00029\u000e\u0003)b]U=Si!\u001ao\"\u0000t+e";
        objectArray[83] = "soJ.RP1?^)0\u0000+c@'gWt>\u001bK\u000f\tv~H4]\r0d";
        objectArray[84] = "(f-\u0017Ec;fi\u00075~)j7\fYL{-n[\u0004\u001b+\u007f3T[y*o9W5";
        objectArray[85] = ">3j=|\u0003-3.-\f\u001e??p&`,ix-~5{=*t~b\u0019<:~}\f";
        objectArray[86] = "\n\u007f0HdV\u0019\u007ftX\u0014K\u000bs*Sxy\\>w\f(.\bes\u0004sGZm8D\u0014";
        objectArray[87] = "uK#FiC6N.\u0016\u000f\u001a\"T-Hc(t\u0011p\u0013?\u007f0N$Cm\u001f%KvO\u000f";
        objectArray[88] = "W#$[sm\u001ahfX\rk\u000bo\u007f\u0002aY_, U6\u000e\u000fyo\u001br1\u001c(z\u0006\r";
        objectArray[89] = "rp1qU\"%mm}/5\"r2yC\u0007v1m.\u0015Pqd>|Ao)47r/";
        objectArray[90] = "q(O\"\n^p G$5U\u001ba\u0005!\f\u0000%1\u0005%Q\u0006\u001b6Te\u0005\u0003rd\\.Ed";
        objectArray[91] = ">-EII[}(H\u0019/\u0002i2KGC09q\u0010\u0011/Yn\"IN\u0010\u0001>+G S_c'\u001b[V_iN";
        objectArray[92] = "9\u001d6'\u0007fy\u0011g*e\u001e.O,@\u001fg\"G5|_ksJ";
        objectArray[93] = "\u0007\n\u0014in\u0005T\bW\u00047Q\u0014\u0001Hh\u0005\u0005UZ\u001e?R@P\u0006F4)EP\f/xj[\u0001QT}jQh";
        objectArray[94] = "\u00018\"SB/\u00000*U}-kqhPDqU!hT\u0019wk&9\u0014Mr\u0002t1_\r\u0015";
        objectArray[95] = "]W D8V\\_(B\u0007R]'1\u0003a\u0014\u0007\u00187V9V";
        objectArray[96] = "{\u0012@\u0005cPz\u001aH\u0003\\V\u0011[\n\u0006e\u000e/\u000b\n\u00028\b\u0011\f[Bl\rx^S\t,j";
        objectArray[97] = "7)f}`x1|>?PwW);xi#iy;|4%Wl8b9w,i8hP";
        objectArray[98] = "h\"C[\u0003c}'\u0011Wafz8JP\rT){\u0017\f[\u0003r\"\u0012\n\r;pzE\ta";
        objectArray[99] = "\u001a|V/\u0010\"Yy[\u007fv{McX!\u001aI\u001b!\u0004{I\u001e\\'_/FeY'UF\u000bu\u001d%\u0004:\u001afOv8";
        objectArray[100] = "I${T\u000b\u001a\u001b =Ng\u0000\u001b?'C\u000b2O|x\u0018]eF\"$Z\nX\u001a<}^gTFxyZ\u0004\u0019\r:z$";
        objectArray[101] = "\rMh\u001c\u0003\u0015\fE`\u001a<\u0011\u000e=u_L\u001e\u0019R!\u0019\u0000R";
        objectArray[102] = "uD\u0017V\u0012!tL\u001fP-$\u001f\r]U\u0014\u007f!]]QIy\u001f\b\nJ]r!I\bL\u0012\u001b";
        objectArray[103] = "f\u0018\t{M\u001dg\u0010\u0001}r\u0019Th\u0002wN\u001aw\u0013\u0014a\u0011A";
        objectArray[104] = "$gv&O\u0002%o~ p\u0007N{:(AF!/|d\r";
        objectArray[105] = "UI9,\u0015ETA1**N?Uu\"\u001b\u0001P\u00013nW";
        objectArray[106] = "H\u0004\u0006\u0006oH\u000b\u0001\u000bV\t\u0011\u001f\u001b\b\be#I\\UP0t\u001d\u000e\fPg\u0016\u001c\u001e\u0006S\t";
        objectArray[107] = "\u0013sL\u0019ttZ+\u0017\u000b\n,\u000eh\u0016\u0017f\u001e\\%NA\n1\t$\u0010\u000en1\u0019+\u001dp";
        objectArray[108] = "@h`&b,\u0010v~7\f3\u0002mgT0$\u0019grjq&\u001f(\u001bh`*\u000b~%)b,D\u0017";
        objectArray[109] = "v[\t)\u007fZwK\u0003*\u0011Vx_\tzF\u0001\"\u000fW\u0016-T{B\u0004(lV}\r";
        objectArray[110] = "&\u0018y\u0014\t\u001biQ\u007fRkZ5YgN\u0011M\u001eG|i\u0016D< xJ\u0014\u0010g\u001d}\u0017\u0014\u001dXB\u007fP[\u001feG\"PV ";
        objectArray[111] = "{|ui^\u0013zt}oa\u0019\u0011l=q\u0019\u0019.jh)[";
        objectArray[112] = "5KAEYduG\u0010H;\u0018\"\u001fL\"Ae.\u0011B\u001e\u0001i\u007f\u001c";
        objectArray[113] = "\u0001H2\u001d\u001a\\SLt\u0007vFSSn\n\u001at\u0007\u001f2PH#T\u001fw\u000e\u0019]^H0\u0014v";
        objectArray[114] = "V6mm{7W&gn\u0015;X2m>Bl\u0002b1R)9[/`lh;]`";
        objectArray[115] = "~rf*\u0014\u0006t%!0{\u0019h/e \u0007\u001fnBs5@Gx.\u007f.\u001c\u0012\u0014";
        objectArray[116] = "}Q('vjjV(j\u001d<\u001bW(&$d%\u0007(\"yb\u001b\b,`akq\u001f+`,\u0000";
        objectArray[117] = "G?eq\u000b]T?!a{@F3\u007fj\u0017r\u0015w$7{Y\u0013(v=\u0000\\\u0013\"\u001f";
        objectArray[118] = "F\u0011\u00158\u0007uG\u0019\u001d>8qBa\u0018~_&\u001c\u001a\u001d~U";
        objectArray[119] = "?>\u000e:z<>6\u0006<E8\nN\u0006z,kh2D6{`";
        objectArray[120] = "YH[\u0012\u007f/\u001b\u0004\f\u0019Bb O\t\u0002{7\u001e\u001f\t\u0006&1 \u0007T\u001d0oOK\b\u0013xS";
        objectArray[121] = "%8D9\u000bp$-Hxn\"\\~\u001azWzb.\u001a~\n|\\?K7\b`8?[8\u0005\u001e";
        objectArray[122] = ",9\\(\"lniH/@<t5V!\u0017k*e\u000fMyj~$\f+,)h)\f";
        objectArray[123] = "/\"?,o!#9cy\u0003-*%B~s1C0n*3**bfasM";
        objectArray[124] = "/&TEo\u001b..\\CP\u001fE6\u001c](\u0011z0I\u0005j";
        objectArray[125] = "+*'h?'k&ve]P1z=s]alv!ma!`',";
        objectArray[126] = "(*F-\u0014s):L.z\u007f&.F~-(|~\u001b\u0012F}%3K,\u0007\u007f#|";
        objectArray[127] = "!)]B\u001fi\u007f(\bBz<\u001a|YS\u001fg$>\tG\u0018";
        objectArray[128] = "i>2^eK+n&Y\u0007\u001b128WPLoaa;;\u0005`:lZ7O>n";
        objectArray[129] = "\u001b-|j4dY}hmV?O0rh:\r\u0018v,?mZ\u001bthr-<Yq~tlZ";
        objectArray[130] = "B]\u001fKM\u0002CU\u0017Mr\u0003(\u0014UHK\\\u0016DUL\u0016Z(QVR\u001b\bSTVXr";
        objectArray[131] = "\u001aW\u0018;K\u0015\t\u0006\r&4D\u0012P\f)c\u0013H\u0006SE]@\u0003C\u0017zN\u0011\u0016^";
        objectArray[132] = "V\u0015 g\u00168W\u001d(a)<\u0006e=$Y3B\nib\u0015\u007f";
        objectArray[133] = "z\roUGP{\u0005gSxR\u0010\u0007l\u0017E\u0011k\u0011zH\u001e";
        objectArray[134] = "@\u00148\u0018(DR\u001d%\u0015W6|4\r>\u000b}@\u00148\u0018(DR\u001d%\u0015";
        objectArray[135] = "sx8\u001e/ku-`\\\u001fi\u0013xe\u001b&0-(e\u001f{6\u0013$8^\"8+&`\t!T";
        Object[] objectArray2 = objectArray;
        objectArray[136] = "Pba[H`Xoi\u000f.iX~o\\y>\u0006.6\u0000.nHy`VIfEq4";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'u' || c == '\u00e6' || c == '\u00f0' || c == 'E') {
                field = _64.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'u' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e6' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _64.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'N' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'G' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _64.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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
            throw new RuntimeException("dev/krypton/64" + " : " + string + " : " + methodType.toString(), exception);
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

    private static Method h(long l2, long l3) {
        int n = _64.e(l2, l3);
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
                clazz3 = _64.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _64.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _64.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _64.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _64.f(1994229094955909L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _64.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _64.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _64.f(1994229094955909L, 0L);
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
            int n = _64.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _64.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _64.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _64.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _64.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _64.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _64.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x55E2;
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
                throw new RuntimeException("dev/krypton/64", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _64.e[n2] = n3;
        }
        return e[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/64" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field g(long l2, long l3) {
        int n = _64.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _64.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _64.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _64.c(clazz3, string2, clazz2)) != null) {
                    _64.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _64.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _64.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _64.f(1994229094955909L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private boolean boolean_0(Object[] objectArray) {
        Object object;
        block10: {
            block12: {
                block11: {
                    long l2 = (Long)objectArray[0];
                    class_1657 class_16572 = (class_1657)objectArray[1];
                    long l3 = (l2 = b ^ l2) ^ 0xCB01CF7B5EFL;
                    CallSite callSite = _64.c("N", (Object)_64.c("u", (Object)_64.c("u", (Object)this, -8726347888796599575L, (long)l2), -8723947613224455315L, (long)l2), -8727825269820780077L, (long)l2);
                    CallSite callSite2 = _64.c("N", (Object)class_16572, -8723657930880626693L, (long)l2);
                    _4w[] wArray = _3s.cfr_renamed_5();
                    CallSite callSite3 = _64.c("N", (Object)_64.c("N", (Object)class_16572, -8723745444695263802L, (long)l2), 0.0, 1.0, 0.0, -8724892651613860524L, (long)l2);
                    CallSite callSite4 = _64.c("N", (Object)class_16572, -8723745444695263802L, (long)l2);
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        Object[] objectArray2 = new Object[3];
                                        objectArray2[2] = l3;
                                        objectArray2[1] = callSite2;
                                        objectArray2[0] = callSite;
                                        object = _64.c("N", (Object)this, (Object)objectArray2, -8727379403976290342L, (long)l2);
                                        if (wArray != null) break block10;
                                        if (object != false) break block11;
                                    }
                                    catch (MatchException matchException) {
                                        throw _64.a(matchException);
                                    }
                                    Object[] objectArray3 = new Object[3];
                                    objectArray3[2] = l3;
                                    objectArray3[1] = callSite3;
                                    objectArray3[0] = callSite;
                                    object = _64.c("N", (Object)this, (Object)objectArray3, -8727379403976290342L, (long)l2);
                                    if (wArray != null) break block10;
                                }
                                catch (MatchException matchException) {
                                    throw _64.a(matchException);
                                }
                                if (object != false) break block11;
                            }
                            catch (MatchException matchException) {
                                throw _64.a(matchException);
                            }
                            Object[] objectArray4 = new Object[3];
                            objectArray4[2] = l3;
                            objectArray4[1] = callSite4;
                            objectArray4[0] = callSite;
                            object = _64.c("N", (Object)this, (Object)objectArray4, -8727379403976290342L, (long)l2);
                            if (wArray != null) break block10;
                        }
                        catch (MatchException matchException) {
                            throw _64.a(matchException);
                        }
                        if (object == false) break block12;
                    }
                    catch (MatchException matchException) {
                        throw _64.a(matchException);
                    }
                }
                object = true;
                break block10;
            }
            object = false;
        }
        return (boolean)object;
    }

    @Override
    public native void cfr_renamed_2();

    public float float_3(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        long l2 = (Long)objectArray[1];
        float f2 = ((Float)objectArray[2]).floatValue();
        float f3 = ((Float)objectArray[3]).floatValue();
        l2 = b ^ l2;
        return f2 + _64.c("G", (float)(f3 - f2), -168815006928599692L, (long)l2) * f;
    }

    private boolean boolean_4(Object[] objectArray) {
        boolean bl;
        class_243 class_2432 = (class_243)objectArray[0];
        class_243 class_2433 = (class_243)objectArray[1];
        long l2 = (Long)objectArray[2];
        l2 = b ^ l2;
        CallSite callSite = _64.c("N", (Object)_64.c("u", (Object)_64.c("u", (Object)this, -8928807928238147558L, (long)l2), -8926821000180668159L, (long)l2), (Object)new class_3959(class_2432, class_2433, (class_3959.class_3960)_64.c("\u00f0", -8922926806618448749L, (long)l2), (class_3959.class_242)_64.c("\u00f0", -8933436163209784171L, (long)l2), (class_1297)_64.c("u", (Object)_64.c("u", (Object)this, -8928807928238147558L, (long)l2), -8926970685964439138L, (long)l2)), -8930556742979860207L, (long)l2);
        try {
            bl = _64.c("N", (Object)callSite, -8926296187351280469L, (long)l2) == _64.c("\u00f0", -8923396796051492261L, (long)l2);
        }
        catch (MatchException matchException) {
            throw _64.a(matchException);
        }
        return bl;
    }

    private float[] float_arr_4(Object[] objectArray) {
        class_243 class_2432 = (class_243)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = b ^ l2;
        CallSite callSite = _64.c("N", (Object)_64.c("u", (Object)_64.c("u", (Object)this, 2300176603250746343L, (long)l2), 2296934101393025635L, (long)l2), 2300951917536676061L, (long)l2);
        reference var6_5 = _64.c("u", (Object)class_2432, 2301177355251939473L, (long)l2) - _64.c("u", (Object)callSite, 2301177355251939473L, (long)l2);
        reference var8_6 = _64.c("u", (Object)class_2432, 2300124424928971040L, (long)l2) - _64.c("u", (Object)callSite, 2300124424928971040L, (long)l2);
        reference var10_7 = _64.c("u", (Object)class_2432, 2299278697634952172L, (long)l2) - _64.c("u", (Object)callSite, 2299278697634952172L, (long)l2);
        CallSite callSite2 = _64.c("G", (double)(var6_5 * var6_5 + var10_7 * var10_7), 2301075007691916422L, (long)l2);
        float f = (float)_64.c("G", (double)_64.c("G", (double)var10_7, (double)var6_5, 2299010397021312999L, (long)l2), 2304305261827261914L, (long)l2) - 90.0f;
        float f2 = (float)(-_64.c("G", (double)_64.c("G", (double)var8_6, (double)callSite2, 2299010397021312999L, (long)l2), 2304305261827261914L, (long)l2));
        return new float[]{f, f2};
    }

    private double double_7(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f2 = ((Float)objectArray[2]).floatValue();
        l2 = b ^ l2;
        CallSite callSite = _64.c("G", (float)(f - _64.c("N", (Object)_64.c("u", (Object)_64.c("u", (Object)this, -7300418630237591901L, (long)l2), -7303654536757596377L, (long)l2), -7304497108500610693L, (long)l2)), -7302854448210156933L, (long)l2);
        float f3 = f2 - _64.c("N", (Object)_64.c("u", (Object)_64.c("u", (Object)this, -7300418630237591901L, (long)l2), -7303654536757596377L, (long)l2), -7304008315082221199L, (long)l2);
        return (double)_64.c("G", (double)((double)(callSite * callSite + f3 * f3)), -7301634587314748990L, (long)l2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @_3i_0
    public void cfr_renamed_0(_40 var1_1) {
        block96: {
            block97: {
                block95: {
                    block91: {
                        block92: {
                            block93: {
                                block94: {
                                    block90: {
                                        block88: {
                                            block89: {
                                                block87: {
                                                    block85: {
                                                        block86: {
                                                            block83: {
                                                                block84: {
                                                                    block80: {
                                                                        block82: {
                                                                            block81: {
                                                                                block78: {
                                                                                    block79: {
                                                                                        block76: {
                                                                                            block77: {
                                                                                                block75: {
                                                                                                    v0 = var2_2 = _64.b ^ 38353005539994L;
                                                                                                    var4_3 = v0 ^ 103128984774698L;
                                                                                                    var6_4 = v0 ^ 122030788284197L;
                                                                                                    var8_5 = v0 ^ 125636501919404L;
                                                                                                    v1 = v0 ^ 136605073388227L;
                                                                                                    var10_6 = (int)(v1 >>> 32);
                                                                                                    var11_7 = v1 << 32 >>> 32;
                                                                                                    var13_8 = v0 ^ 53102890151278L;
                                                                                                    var15_9 = v0 ^ 108460353275961L;
                                                                                                    var17_10 = v0 ^ 67237320263689L;
                                                                                                    var19_11 = v0 ^ 61408166837240L;
                                                                                                    var21_12 = v0 ^ 59281420385265L;
                                                                                                    var23_13 = _3s.cfr_renamed_5();
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                v2 = _64.c("u", (Object)this, (long)-4208145186437711467L, (long)var2_2);
                                                                                                                if (var23_13 != null) break block75;
                                                                                                                if (_64.c("u", (Object)v2, (long)-4210252992081563631L, (long)var2_2) != null) {
                                                                                                                }
                                                                                                                ** GOTO lbl38
                                                                                                            }
                                                                                                            catch (MatchException v3) {
                                                                                                                throw _64.a(v3);
                                                                                                            }
                                                                                                            v4 = this;
                                                                                                            if (var23_13 != null) break block76;
                                                                                                        }
                                                                                                        catch (MatchException v5) {
                                                                                                            throw _64.a(v5);
                                                                                                        }
                                                                                                        v2 = _64.c("u", (Object)v4, (long)-4208145186437711467L, (long)var2_2);
                                                                                                    }
                                                                                                    catch (MatchException v6) {
                                                                                                        throw _64.a(v6);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    if (_64.c("u", (Object)v2, (long)-4208362669808501880L, (long)var2_2) == null) break block77;
lbl38:
                                                                                                    // 2 sources

                                                                                                    return;
                                                                                                }
                                                                                                catch (MatchException v7) {
                                                                                                    throw _64.a(v7);
                                                                                                }
                                                                                            }
                                                                                            v4 = this;
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        v8 = _64.c("N", (Object)_64.c("u", (Object)v4, (long)-4204316436090741984L, (long)var2_2), (long)var17_10, (long)-4209319604416036944L, (long)var2_2);
                                                                                                        if (var23_13 != null) break block78;
                                                                                                        if (v8 == false) break block79;
                                                                                                    }
                                                                                                    catch (MatchException v9) {
                                                                                                        throw _64.a(v9);
                                                                                                    }
                                                                                                    v8 = _64.c("N", (Object)_64.c("N", (Object)_64.c("u", (Object)_64.c("u", (Object)this, (long)-4208145186437711467L, (long)var2_2), (long)-4210252992081563631L, (long)var2_2), (long)-4209848943825616513L, (long)var2_2), (long)-4206704778896517692L, (long)var2_2);
                                                                                                    if (var23_13 != null) break block78;
                                                                                                }
                                                                                                catch (MatchException v10) {
                                                                                                    throw _64.a(v10);
                                                                                                }
                                                                                                v11 = new Object[1];
                                                                                                v11[0] = var15_9;
                                                                                                if (v8 == _64.c("N", (Object)_64.c("u", (Object)this, (long)-4210438037225632543L, (long)var2_2), (Object)v11, (long)-4204202652293149852L, (long)var2_2) - true) break block79;
                                                                                            }
                                                                                            catch (MatchException v12) {
                                                                                                throw _64.a(v12);
                                                                                            }
                                                                                            return;
                                                                                        }
                                                                                        catch (MatchException v13) {
                                                                                            throw _64.a(v13);
                                                                                        }
                                                                                    }
                                                                                    v8 = _64.c("N", (Object)_64.c("u", (Object)this, (long)-4207403907103325123L, (long)var2_2), (long)var17_10, (long)-4209319604416036944L, (long)var2_2);
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                if (var23_13 != null) break block80;
                                                                                                if (v8 == false) break block81;
                                                                                            }
                                                                                            catch (MatchException v14) {
                                                                                                throw _64.a(v14);
                                                                                            }
                                                                                            v15 = this;
                                                                                            if (var23_13 != null) break block82;
                                                                                        }
                                                                                        catch (MatchException v16) {
                                                                                            throw _64.a(v16);
                                                                                        }
                                                                                        v17 = new Object[1];
                                                                                        v17[0] = var19_11;
                                                                                        if (_64.c("N", (Object)_64.c("N", (Object)_64.c("u", (Object)_64.c("u", (Object)v15, (long)-4208145186437711467L, (long)var2_2), (long)-4210252992081563631L, (long)var2_2), (long)-4209661413941108702L, (long)var2_2), (long)-4207295598752085551L, (long)var2_2) == _64.c("N", (Object)_64.c("u", (Object)this, (long)-4208957192810475044L, (long)var2_2), (Object)v17, (long)-4208571545588591404L, (long)var2_2)) break block81;
                                                                                    }
                                                                                    catch (MatchException v18) {
                                                                                        throw _64.a(v18);
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                catch (MatchException v19) {
                                                                                    throw _64.a(v19);
                                                                                }
                                                                            }
                                                                            v15 = this;
                                                                        }
                                                                        try {
                                                                            if (var23_13 != null) break block83;
                                                                            v8 = _64.c("N", (Object)_64.c("u", (Object)v15, (long)-4209304285524498132L, (long)var2_2), (long)var17_10, (long)-4209319604416036944L, (long)var2_2);
                                                                        }
                                                                        catch (MatchException v20) {
                                                                            throw _64.a(v20);
                                                                        }
                                                                    }
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (v8 == false) break block84;
                                                                                v15 = this;
                                                                                if (var23_13 != null) break block83;
                                                                            }
                                                                            catch (MatchException v21) {
                                                                                throw _64.a(v21);
                                                                            }
                                                                            if (_64.c("G", (long)_64.c("N", (Object)_64.c("N", (Object)_64.c("u", (Object)v15, (long)-4208145186437711467L, (long)var2_2), (long)-4204671151336420982L, (long)var2_2), (long)-4210089507981510039L, (long)var2_2), (int)0, (long)-4212929074163210274L, (long)var2_2) == true) break block84;
                                                                        }
                                                                        catch (MatchException v22) {
                                                                            throw _64.a(v22);
                                                                        }
                                                                        return;
                                                                    }
                                                                    catch (MatchException v23) {
                                                                        throw _64.a(v23);
                                                                    }
                                                                }
                                                                v15 = this;
                                                            }
                                                            v24 = new Object[2];
                                                            v24[1] = var11_7;
                                                            v24[0] = var10_6;
                                                            var24_14 = _64.c("N", (Object)v15, (Object)v24, (long)-4209075633098757224L, (long)var2_2);
                                                            try {
                                                                v25 = var24_14;
                                                                if (var23_13 != null) break block85;
                                                                if (v25 != null) break block86;
                                                            }
                                                            catch (MatchException v26) {
                                                                throw _64.a(v26);
                                                            }
                                                            return;
                                                        }
                                                        v25 = var24_14;
                                                    }
                                                    var25_15 = _64.c("N", (Object)v25, (long)-4209909802847832390L, (long)var2_2);
                                                    try {
                                                        v27 = new Object[1];
                                                        v27[0] = var8_5;
                                                        v28 = _64.c("N", (Object)_64.c("u", (Object)this, (long)-4207569869773392473L, (long)var2_2), (Object)v27, (long)-4208517943135098643L, (long)var2_2);
                                                        v29 = _64.c("\u00f0", (long)-4207970459055704443L, (long)var2_2);
                                                        if (var23_13 != null) break block87;
                                                        if (v28 == v29) {
                                                        }
                                                        ** GOTO lbl157
                                                    }
                                                    catch (MatchException v30) {
                                                        throw _64.a(v30);
                                                    }
                                                    var25_15 = _64.c("N", (Object)var25_15, (double)0.0, (double)1.62, (double)0.0, (long)-4209011084848034264L, (long)var2_2);
                                                    try {
                                                        if (var23_13 == null) break block88;
lbl157:
                                                        // 2 sources

                                                        v31 = new Object[1];
                                                        v31[0] = var8_5;
                                                        v28 = _64.c("N", (Object)_64.c("u", (Object)this, (long)-4207569869773392473L, (long)var2_2), (Object)v31, (long)-4208517943135098643L, (long)var2_2);
                                                        v29 = _64.c("\u00f0", (long)-4208298914423323958L, (long)var2_2);
                                                    }
                                                    catch (MatchException v32) {
                                                        throw _64.a(v32);
                                                    }
                                                }
                                                try {
                                                    if (var23_13 != null) break block89;
                                                    if (v28 == v29) {
                                                    }
                                                    ** GOTO lbl177
                                                }
                                                catch (MatchException v33) {
                                                    throw _64.a(v33);
                                                }
                                                var25_15 = _64.c("N", (Object)var25_15, (double)0.0, (double)1.0, (double)0.0, (long)-4209011084848034264L, (long)var2_2);
                                                try {
                                                    try {
                                                        if (var23_13 == null) break block88;
lbl177:
                                                        // 2 sources

                                                        v34 = this;
                                                        if (var23_13 != null) break block90;
                                                    }
                                                    catch (MatchException v35) {
                                                        throw _64.a(v35);
                                                    }
                                                    v36 = new Object[1];
                                                    v36[0] = var8_5;
                                                    v28 = _64.c("N", (Object)_64.c("u", (Object)v34, (long)-4207569869773392473L, (long)var2_2), (Object)v36, (long)-4208517943135098643L, (long)var2_2);
                                                    v29 = _64.c("\u00f0", (long)-4210469719766680859L, (long)var2_2);
                                                }
                                                catch (MatchException v37) {
                                                    throw _64.a(v37);
                                                }
                                            }
                                            if (v28 == v29) {
                                                var25_15 = _64.c("N", (Object)var25_15, (double)0.0, (double)0.5, (double)0.0, (long)-4209011084848034264L, (long)var2_2);
                                            }
                                        }
                                        v34 = this;
                                    }
                                    v38 = new Object[2];
                                    v38[1] = var13_8;
                                    v38[0] = var25_15;
                                    var26_16 = _64.c("N", (Object)v34, (Object)v38, (long)-4208623982952920812L, (long)var2_2);
                                    v39 = new Object[3];
                                    v39[2] = Float.valueOf((float)var26_16[1]);
                                    v39[1] = Float.valueOf((float)var26_16[0]);
                                    v39[0] = var4_3;
                                    var27_17 = _64.c("N", (Object)this, (Object)v39, (long)-4206376142075977296L, (long)var2_2);
                                    try {
                                        v40 = new Object[1];
                                        v40[0] = var15_9;
                                        if (var27_17 > (double)_64.c("N", (Object)_64.c("u", (Object)this, (long)-4207064673588916786L, (long)var2_2), (Object)v40, (long)-4204202652293149852L, (long)var2_2) / 2.0) {
                                            return;
                                        }
                                    }
                                    catch (MatchException v41) {
                                        throw _64.a(v41);
                                    }
                                    var29_18 = _64.c("u", (Object)this, (long)-4207551860637060608L, (long)var2_2) / 50.0f;
                                    var30_19 = _64.c("u", (Object)this, (long)-4212629585097064381L, (long)var2_2) / 50.0f;
                                    v42 = new Object[4];
                                    v42[3] = Float.valueOf((float)var26_16[0]);
                                    v42[2] = Float.valueOf((float)_64.c("N", (Object)_64.c("u", (Object)_64.c("u", (Object)this, (long)-4208145186437711467L, (long)var2_2), (long)-4210252992081563631L, (long)var2_2), (long)-4208843355789762995L, (long)var2_2));
                                    v42[1] = var6_4;
                                    v42[0] = Float.valueOf((float)var29_18);
                                    var31_20 = _64.c("N", (Object)this, (Object)v42, (long)-4204392797355783863L, (long)var2_2);
                                    v43 = new Object[4];
                                    v43[3] = Float.valueOf((float)var26_16[1]);
                                    v43[2] = Float.valueOf((float)_64.c("N", (Object)_64.c("u", (Object)_64.c("u", (Object)this, (long)-4208145186437711467L, (long)var2_2), (long)-4210252992081563631L, (long)var2_2), (long)-4209481424550427065L, (long)var2_2));
                                    v43[1] = var6_4;
                                    v43[0] = Float.valueOf((float)var30_19);
                                    var32_21 = _64.c("N", (Object)this, (Object)v43, (long)-4204392797355783863L, (long)var2_2);
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        v44 = _64.c("N", (Object)_64.c("u", (Object)this, (long)-4209393177108267167L, (long)var2_2), (long)var17_10, (long)-4209319604416036944L, (long)var2_2);
                                                        if (var23_13 != null) break block91;
                                                        if (v44 == false) break block92;
                                                    }
                                                    catch (MatchException v45) {
                                                        throw _64.a(v45);
                                                    }
                                                    v46 = this;
                                                    if (var23_13 != null) break block93;
                                                }
                                                catch (MatchException v47) {
                                                    throw _64.a(v47);
                                                }
                                                if (_64.c("N", (Object)_64.c("u", (Object)v46, (long)-4207442474635417038L, (long)var2_2), (long)var17_10, (long)-4209319604416036944L, (long)var2_2) == false) break block94;
                                            }
                                            catch (MatchException v48) {
                                                throw _64.a(v48);
                                            }
                                            v49 = new Object[2];
                                            v49[1] = var21_12;
                                            v49[0] = var24_14;
                                            v44 = _64.c("N", (Object)this, (Object)v49, (long)-4210614126016135898L, (long)var2_2);
                                            if (var23_13 != null) break block91;
                                        }
                                        catch (MatchException v50) {
                                            throw _64.a(v50);
                                        }
                                        if (v44 != false) break block92;
                                    }
                                    catch (MatchException v51) {
                                        throw _64.a(v51);
                                    }
                                }
                                v46 = this;
                            }
                            _64.c("N", (Object)_64.c("u", (Object)_64.c("u", (Object)v46, (long)-4208145186437711467L, (long)var2_2), (long)-4210252992081563631L, (long)var2_2), (float)var31_20, (long)-4210198371247458671L, (long)var2_2);
                        }
                        v44 = _64.c("N", (Object)_64.c("u", (Object)this, (long)-4206612894276308646L, (long)var2_2), (long)var17_10, (long)-4209319604416036944L, (long)var2_2);
                    }
                    try {
                        try {
                            try {
                                if (var23_13 != null) break block95;
                                if (v44 == false) break block96;
                            }
                            catch (MatchException v52) {
                                throw _64.a(v52);
                            }
                            v53 = this;
                            if (var23_13 != null) break block97;
                        }
                        catch (MatchException v54) {
                            throw _64.a(v54);
                        }
                        v44 = _64.c("N", (Object)_64.c("u", (Object)v53, (long)-4209735034725217598L, (long)var2_2), (long)var17_10, (long)-4209319604416036944L, (long)var2_2);
                    }
                    catch (MatchException v55) {
                        throw _64.a(v55);
                    }
                }
                try {
                    block98: {
                        try {
                            try {
                                if (v44 == false) break block98;
                                v53 = this;
                                if (var23_13 != null) break block97;
                            }
                            catch (MatchException v56) {
                                throw _64.a(v56);
                            }
                            v57 = new Object[2];
                            v57[1] = var21_12;
                            v57[0] = var24_14;
                            if (_64.c("N", (Object)v53, (Object)v57, (long)-4210614126016135898L, (long)var2_2) != false) break block96;
                        }
                        catch (MatchException v58) {
                            throw _64.a(v58);
                        }
                    }
                    v53 = this;
                }
                catch (MatchException v59) {
                    throw _64.a(v59);
                }
            }
            _64.c("N", (Object)_64.c("u", (Object)_64.c("u", (Object)v53, (long)-4208145186437711467L, (long)var2_2), (long)-4210252992081563631L, (long)var2_2), (float)var32_21, (long)-4206766964707591536L, (long)var2_2);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_64.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_64.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

