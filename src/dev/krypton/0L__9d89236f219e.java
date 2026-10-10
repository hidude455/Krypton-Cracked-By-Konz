/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_11908
 *  net.minecraft.class_11909
 */
package dev.krypton;

import dev.krypton._02;
import dev.krypton._0v;
import dev.krypton._4t;
import dev.krypton._87;
import dev.krypton._8B;
import dev.krypton._95;
import dev.krypton._9k_0;
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
import net.minecraft.class_11908;
import net.minecraft.class_11909;

public class _0L
extends _0v {
    private static final _8B cfr_renamed_13;
    private static final _8B cfr_renamed_8;
    private static final float cfr_renamed_5 = 4.0f;
    private static final float cfr_renamed_14 = 2.0f;
    private static final float cfr_renamed_15 = 8.0f;
    private final _9k_0 cfr_renamed_1;
    public double cfr_renamed_16;
    public double cfr_renamed_2;
    public _8B cfr_renamed_9;
    private boolean cfr_renamed_17;
    private boolean cfr_renamed_18;
    private double cfr_renamed_4;
    private double cfr_renamed_19;
    private static final long a;
    private static final String c;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map i;
    private static final Object[] j;
    private static final String[] k;

    @Override
    public void cfr_renamed_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 ^ 0L;
        _0L.c("I", (Object)this, null, -74941343931039131L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        super.cfr_renamed_5(objectArray2);
    }

    private void cfr_renamed_20(Object[] objectArray) {
        double d = (Double)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x5B5CC42A6DC7L;
        long l5 = l3 ^ 0x71C3E368F05FL;
        long l6 = l3 ^ 0x150E487A1EF0L;
        long l7 = l3 ^ 0x3ACD10190329L;
        long l8 = l3 ^ 0x5053DA97B8D1L;
        long l9 = l3 ^ 0x255CCC607FEEL;
        long l10 = l3 ^ 0x1A857C30AFF0L;
        long l11 = l3 ^ 0x38064020E062L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l6;
        double d2 = d - (double)(_0L.c("\u00c3", (Object)this, (Object)objectArray2, 240980700456350359L, (long)l2) + 5);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l8;
        CallSite callSite = _0L.c("H", (double)(d2 / (double)(_0L.c("\u00c3", (Object)this, (Object)objectArray3, 234513491106500927L, (long)l2) - _0L.a("u", 3591, (long)(0xEB17DC2909C20EFL ^ l2)))), 0.0, 1.0, 235295066570955723L, (long)l2);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l9;
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l10;
        Object[] objectArray6 = new Object[1];
        objectArray6[0] = l10;
        Object[] objectArray7 = new Object[1];
        objectArray7[0] = l4;
        Object[] objectArray8 = new Object[3];
        objectArray8[2] = (double)_0L.c("\u00c3", (Object)_0L.c("w", (Object)this, 241786052065854168L, (long)l2), (Object)objectArray7, 235053160830358997L, (long)l2);
        objectArray8[1] = (double)(callSite * (_0L.c("\u00c3", (Object)_0L.c("w", (Object)this, 241786052065854168L, (long)l2), (Object)objectArray4, 240920653773239521L, (long)l2) - _0L.c("\u00c3", (Object)_0L.c("w", (Object)this, 241786052065854168L, (long)l2), (Object)objectArray5, 242093656769488826L, (long)l2)) + _0L.c("\u00c3", (Object)_0L.c("w", (Object)this, 241786052065854168L, (long)l2), (Object)objectArray6, 242093656769488826L, (long)l2));
        objectArray8[0] = l5;
        CallSite callSite2 = _0L.c("H", (Object)objectArray8, 241334976254167859L, (long)l2);
        Object[] objectArray9 = new Object[1];
        objectArray9[0] = l7;
        Object[] objectArray10 = new Object[2];
        objectArray10[1] = l11;
        objectArray10[0] = (double)_0L.c("H", (double)callSite2, (double)_0L.c("\u00c3", (Object)_0L.c("w", (Object)this, 241786052065854168L, (long)l2), (Object)objectArray9, 240579918392160343L, (long)l2), 242831836094666496L, (long)l2);
        _0L.c("\u00c3", (Object)_0L.c("w", (Object)this, 241786052065854168L, (long)l2), (Object)objectArray10, 234407458779788874L, (long)l2);
    }

    public _0L(int n, _4t t, char c, _95 var4_4, short s, int n2) {
        long l2;
        long l3 = l2 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)s << 48 >>> 48) ^ a;
        long l4 = l3 ^ 0x599B37B04257L;
        int n3 = (int)(l4 >>> 48);
        int n4 = (int)(l4 << 16 >>> 32);
        int n5 = (int)(l4 << 48 >>> 48);
        long l5 = l3 ^ 0x4C6FD089F74BL;
        long l6 = l3 ^ 0x9324264516AL;
        super((short)n3, t, var4_4, n2, n4, (char)n5);
        this.cfr_renamed_1 = (_9k_0)var4_4;
        Object[] objectArray = new Object[1];
        objectArray[0] = l5;
        _0L.c("I", (Object)this, (double)((double)_0L.c("\u00c3", (Object)this, (Object)objectArray, -1521236141597058260L, (long)l2)), -1515215068103189798L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l5;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l6;
        _0L.c("I", (Object)this, (double)((double)(_0L.c("\u00c3", (Object)this, (Object)objectArray2, -1521236141597058260L, (long)l2) + _0L.c("\u00c3", (Object)this, (Object)objectArray3, -1514773364520814460L, (long)l2))), -1518595304140513706L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                block12: {
                    _0L.a = l.a(-869024762344074298L, -4235746928006928134L, MethodHandles.lookup().lookupClass()).a(186913318523851L);
                    var14 = _0L.a ^ 120087733393878L;
                    var16_1 = var14 ^ 116047499516593L;
                    _0L.j = new Object[110];
                    _0L.k = new String[110];
                    _0L.b();
                    var11_2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var14 >>> 56);
                    for (var12_3 = 1; var12_3 < 8; ++var12_3) {
                        v2 = v2;
                        v2[var12_3] = (byte)(var14 << var12_3 * 8 >>> 56);
                    }
                    break block12;
lbl18:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var11_2.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var13_4 = var11_2.doFinal("\u00c7\u00d9\u0097\u007f\u000e\u00cf8~".getBytes("ISO-8859-1"));
                ** while (true)
                _0L.c = _0L.a(var13_4).intern();
                _0L.i = new HashMap<K, V>(13);
                var0_5 = Cipher.getInstance("DES/CBC/NoPadding");
                v3 = SecretKeyFactory.getInstance("DES");
                v4 = new byte[8];
                v5 = v4;
                v4[0] = (byte)(var14 >>> 56);
                for (var1_6 = 1; var1_6 < 8; ++var1_6) {
                    v5 = v5;
                    v5[var1_6] = (byte)(var14 << var1_6 * 8 >>> 56);
                }
                var0_5.init(2, (Key)v3.generateSecret(new DESKeySpec(v5)), new IvParameterSpec(new byte[8]));
                var6_7 = new long[16];
                var3_8 = 0;
                var4_9 = "rk\f\u00b46\u00f7\u00a8#\u0097\u00ef\u0007\u00d8\u00d3\u00c5\u00d5`\u00df\u00b2\u00c9\u00f39\tu\u00e6\u00ad\u00ab4\u00e8\u00c3\u00ea'\u009b\u00ca\u00fe\u0090\u00a0\u00c8\u00b3G\u00f9\u00c1\u0091\u00ca\u008cq`\u0010n\u00b4v^\u0002\u00ef\u001d;\u00ff\u00af\u00f6\u00e8\u00a1t\u00ba\u00c7@-\u00cc4y\u00bdo\u00fdZ\u00a9\u00e4\u0087wxC3\u0085\u0006\u00ba\td%\u00c6\u0003fl\u00dcq\u00d0H\u00c4\u000b\u008dY\u00fe\u00b3\u0094l\u0092\u000f\u00a4FU\u00dd^h\u00c6k%";
                var5_10 = "rk\f\u00b46\u00f7\u00a8#\u0097\u00ef\u0007\u00d8\u00d3\u00c5\u00d5`\u00df\u00b2\u00c9\u00f39\tu\u00e6\u00ad\u00ab4\u00e8\u00c3\u00ea'\u009b\u00ca\u00fe\u0090\u00a0\u00c8\u00b3G\u00f9\u00c1\u0091\u00ca\u008cq`\u0010n\u00b4v^\u0002\u00ef\u001d;\u00ff\u00af\u00f6\u00e8\u00a1t\u00ba\u00c7@-\u00cc4y\u00bdo\u00fdZ\u00a9\u00e4\u0087wxC3\u0085\u0006\u00ba\td%\u00c6\u0003fl\u00dcq\u00d0H\u00c4\u000b\u008dY\u00fe\u00b3\u0094l\u0092\u000f\u00a4FU\u00dd^h\u00c6k%".length();
                var2_11 = 0;
                while (true) {
                    var7_12 = var4_9.substring(var2_11, var2_11 += 8).getBytes("ISO-8859-1");
                    v6 = var6_7;
                    v7 = var3_8++;
                    v8 = ((long)var7_12[0] & 255L) << 56 | ((long)var7_12[1] & 255L) << 48 | ((long)var7_12[2] & 255L) << 40 | ((long)var7_12[3] & 255L) << 32 | ((long)var7_12[4] & 255L) << 24 | ((long)var7_12[5] & 255L) << 16 | ((long)var7_12[6] & 255L) << 8 | (long)var7_12[7] & 255L;
                    v9 = -1;
                    break block10;
                    break;
                }
lbl49:
                // 1 sources

                while (true) {
                    v6[v7] = v10;
                    if (var2_11 < var5_10) ** continue;
                    var4_9 = "\u00ffL;1\u008a\u0016\u00c0b\u00bc\u000ed\u00da\u00a7\u0003\u00c4\u00e9";
                    var5_10 = "\u00ffL;1\u008a\u0016\u00c0b\u00bc\u000ed\u00da\u00a7\u0003\u00c4\u00e9".length();
                    var2_11 = 0;
                    while (true) {
                        var7_12 = var4_9.substring(var2_11, var2_11 += 8).getBytes("ISO-8859-1");
                        v6 = var6_7;
                        v7 = var3_8++;
                        v8 = ((long)var7_12[0] & 255L) << 56 | ((long)var7_12[1] & 255L) << 48 | ((long)var7_12[2] & 255L) << 40 | ((long)var7_12[3] & 255L) << 32 | ((long)var7_12[4] & 255L) << 24 | ((long)var7_12[5] & 255L) << 16 | ((long)var7_12[6] & 255L) << 8 | (long)var7_12[7] & 255L;
                        v9 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl62:
                // 1 sources

                while (true) {
                    v6[v7] = v10;
                    if (var2_11 < var5_10) ** continue;
                    break block11;
                    break;
                }
            }
            var8_13 = v8;
            var10_14 = var0_5.doFinal(new byte[]{(byte)(var8_13 >>> 56), (byte)(var8_13 >>> 48), (byte)(var8_13 >>> 40), (byte)(var8_13 >>> 32), (byte)(var8_13 >>> 24), (byte)(var8_13 >>> 16), (byte)(var8_13 >>> 8), (byte)var8_13});
            v10 = ((long)var10_14[0] & 255L) << 56 | ((long)var10_14[1] & 255L) << 48 | ((long)var10_14[2] & 255L) << 40 | ((long)var10_14[3] & 255L) << 32 | ((long)var10_14[4] & 255L) << 24 | ((long)var10_14[5] & 255L) << 16 | ((long)var10_14[6] & 255L) << 8 | (long)var10_14[7] & 255L;
            switch (v9) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl75:
                // 1 sources

                ** continue;
            }
        }
        _0L.d = var6_7;
        _0L.e = new Integer[16];
        _0L.cfr_renamed_13 = new _8B((int)_0L.a("u", (int)9568, (long)(3089475251922410942L ^ var14)), var16_1, (int)_0L.a("u", (int)17988, (long)(6053524635188887191L ^ var14)), (int)_0L.a("u", (int)8737, (long)(5915101957018622705L ^ var14)));
        _0L.cfr_renamed_8 = new _8B((int)_0L.a("u", (int)18301, (long)(7189794035380354987L ^ var14)), var16_1, (int)_0L.a("u", (int)1853, (long)(8137751926070951906L ^ var14)), (int)_0L.a("u", (int)1853, (long)(8137751926070951906L ^ var14)));
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
            case 0 -> 34;
            case 1 -> 1;
            case 2 -> 24;
            case 3 -> 6;
            case 4 -> 30;
            case 5 -> 8;
            case 6 -> 17;
            case 7 -> 62;
            case 8 -> 20;
            case 9 -> 25;
            case 10 -> 35;
            case 11 -> 13;
            case 12 -> 58;
            case 13 -> 27;
            case 14 -> 5;
            case 15 -> 43;
            case 16 -> 39;
            case 17 -> 16;
            case 18 -> 54;
            case 19 -> 50;
            case 20 -> 41;
            case 21 -> 19;
            case 22 -> 0;
            case 23 -> 52;
            case 24 -> 36;
            case 25 -> 56;
            case 26 -> 11;
            case 27 -> 42;
            case 28 -> 38;
            case 29 -> 7;
            case 30 -> 12;
            case 31 -> 48;
            case 32 -> 28;
            case 33 -> 3;
            case 34 -> 37;
            case 35 -> 26;
            case 36 -> 49;
            case 37 -> 14;
            case 38 -> 61;
            case 39 -> 46;
            case 40 -> 23;
            case 41 -> 40;
            case 42 -> 2;
            case 43 -> 59;
            case 44 -> 10;
            case 45 -> 57;
            case 46 -> 47;
            case 47 -> 21;
            case 48 -> 31;
            case 49 -> 44;
            case 50 -> 45;
            case 51 -> 4;
            case 52 -> 29;
            case 53 -> 32;
            case 54 -> 22;
            case 55 -> 9;
            case 56 -> 63;
            case 57 -> 60;
            case 58 -> 18;
            case 59 -> 51;
            case 60 -> 15;
            case 61 -> 53;
            case 62 -> 33;
            default -> 55;
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
        _0L.k[n3] = new String(cArray);
        return n3;
    }

    private String java_lang_String_9(Object[] objectArray) {
        _0L l2;
        long l3;
        long l4;
        long l5;
        long l6;
        block4: {
            block5: {
                l6 = (Long)objectArray[0];
                long l7 = l6 = a ^ l6;
                l5 = l7 ^ 0x5FF3A071C69AL;
                l4 = l7 ^ 0x7FBA221EDB18L;
                l3 = l7 ^ 0x12B95B4A331CL;
                boolean bl = _02.cfr_renamed_2();
                try {
                    try {
                        l2 = this;
                        if (bl) break block4;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l4;
                        Object[] objectArray3 = new Object[1];
                        objectArray3[0] = l5;
                        if (_0L.c("\u00c3", (Object)_0L.c("w", (Object)l2, -2635808282341516567L, (long)l6), (Object)objectArray2, -2636871471517095834L, (long)l6) != _0L.c("\u00c3", (Object)_0L.c("w", (Object)this, -2635808282341516567L, (long)l6), (Object)objectArray3, -2636178811355183800L, (long)l6)) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _0L.a(matchException);
                    }
                    Object[] objectArray4 = new Object[1];
                    objectArray4[0] = l4;
                    Object[] objectArray5 = new Object[2];
                    objectArray5[1] = (double)_0L.c("\u00c3", (Object)_0L.c("w", (Object)this, -2635808282341516567L, (long)l6), (Object)objectArray4, -2636871471517095834L, (long)l6);
                    objectArray5[0] = l3;
                    return _0L.c("\u00c3", (Object)this, (Object)objectArray5, -2635433807004157980L, (long)l6);
                }
                catch (MatchException matchException) {
                    throw _0L.a(matchException);
                }
            }
            l2 = this;
        }
        Object[] objectArray6 = new Object[1];
        objectArray6[0] = l4;
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = (double)_0L.c("\u00c3", (Object)_0L.c("w", (Object)this, -2635808282341516567L, (long)l6), (Object)objectArray6, -2636871471517095834L, (long)l6);
        objectArray7[0] = l3;
        Object[] objectArray8 = new Object[1];
        objectArray8[0] = l5;
        Object[] objectArray9 = new Object[2];
        objectArray9[1] = (double)_0L.c("\u00c3", (Object)_0L.c("w", (Object)this, -2635808282341516567L, (long)l6), (Object)objectArray8, -2636178811355183800L, (long)l6);
        objectArray9[0] = l3;
        return (String)((Object)_0L.c("\u00c3", (Object)l2, (Object)objectArray7, -2635433807004157980L, (long)l6)) + c + (String)((Object)_0L.c("\u00c3", (Object)this, (Object)objectArray9, -2635433807004157980L, (long)l6));
    }

    @Override
    public void void_9(Object[] objectArray) {
        class_11909 class_119092 = (class_11909)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = l2 ^ 0L;
        try {
            if (_0L.c("\u00c3", (Object)class_119092, 9014992811302188503L, (long)l2) == false) {
                _0L.c("I", (Object)this, (boolean)_0L.a("u", 9582, (long)(0xDB9855B02DDF5C6L ^ l2)), 9015807114361351545L, (long)l2);
                _0L.c("I", (Object)this, (boolean)_0L.a("u", 4489, (long)(0x28BF9225B3DA412CL ^ l2)), 9007685603914434908L, (long)l2);
            }
        }
        catch (MatchException matchException) {
            throw _0L.a(matchException);
        }
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = class_119092;
        super.void_9(objectArray2);
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = "\u0010\u000e=]\u0007\u0001\r\u001b?\u001c\u0002]M\u0000";
        objectArray[1] = "Mmx\u001d+T8Ms\u0012:\u001bYCx\u0019>A-";
        objectArray[2] = Void.TYPE;
        _0L.k[2] = "java/lang/Void";
        objectArray[3] = "D7l,'V1\u0017g#6\u0019P\u0019l(2C$";
        objectArray[4] = Double.TYPE;
        _0L.k[4] = "java/lang/Double";
        objectArray[5] = "\u0011a\u0000\nP-dA\u000b\u0005Ab\u0005O\u0000\u000eE8q";
        objectArray[6] = "}OcmS\u0003\bohbBLiaciF\u0016\u001d";
        objectArray[7] = "J2R\nHBJ2EVDMPyEHDXW\b\u0017\u0015\u001c\u001b\u001c";
        objectArray[8] = Integer.TYPE;
        _0L.k[8] = "java/lang/Integer";
        objectArray[9] = "\tzl\bRs\u0014onIW/]S";
        objectArray[10] = "\u0017D`TI\u0014\nQb\u0015LHCW";
        objectArray[11] = Boolean.TYPE;
        _0L.k[11] = "java/lang/Boolean";
        objectArray[12] = "q\u001c#]7fl\t!\u001c2:-N";
        objectArray[13] = "S%Bi\t\u0019&\u0005If\u0018VG\u000bBm\u001c\f3";
        objectArray[14] = "%FIv\u0006\nPfBy\u0017E1hIr\u0013\u001fE";
        objectArray[15] = "l.m~\u0019Vg!|1dNt&ux";
        objectArray[16] = "YNa\u0018\u0004\u007fD[cY\u0001#\u0004\u001e";
        objectArray[17] = "\u0010q\u0018{s*eQ\u0013tbe\u0004_\u0018\u007ff?p";
        objectArray[18] = "`a\u001a\u0016s\u0006\u0015A\u0011\u0019bItO\u001a\u0012f\u0013\u0000";
        objectArray[19] = "ks\"\u001f\u0017+\u001eS)\u0010\u0006d\u007f]\"\u001b\u0002>\u000b";
        objectArray[20] = "8\t=Thm%\u001c?\u0015m1d.";
        objectArray[21] = "\u0011-\u001c=O\u0011d\r\u00172^^\u0005\u0003\u001c9Z\u0004q";
        objectArray[22] = "\u0019\u0019\u0005J\u000fXl9\u000eE\u001e\u0017\r7\u0005N\u001aMy";
        objectArray[23] = "'>\u001b<\r@R\u001e\u00103\u001c\u000f3\u0010\u001b8\u0018UG";
        objectArray[24] = "{|g~\bR\u000e\\lq\u0019\u001doRgz\u001dG\u001b";
        objectArray[25] = "V'<O\u0010E#\u00077@\u0001\nB\t<K\u0005P6";
        objectArray[26] = "`f\u0006z\t3}s\u0004;\fo0R";
        objectArray[27] = "v1g7T?\u0003\u0011l8Epb\u001fg3A*\u0016";
        objectArray[28] = "\u0000\u0015[3o^u5P<~\u0011\u0014;[7zK`";
        objectArray[29] = "{C\u000e\u0010$4\u000ec\u0005\u001f5{om\u000e\u00141!\u001b";
        objectArray[30] = "r;\u0018KM\r\u0007\u001b\u0013D\\Bf\u0015\u0018OX\u0018\u0012";
        objectArray[31] = "3?I{\u0016rF\u001fBt\u0007='\u0011I\u007f\u0003gS";
        objectArray[32] = ",k\u0002D]Y,k\u0015\u0018QV6 \u0015\u0006QC1QE_\u0003\u0002";
        objectArray[33] = "\u0015\u0005I3\u0019+`%B<\bd\u0001+I7\f>u";
        objectArray[34] = "QWc\u0010\n\u0014ZXr_i\u0019O^";
        objectArray[35] = "a\f@\u0005M\"\u0014,K\n\\mu\"@\u0001X7\u0001";
        objectArray[36] = "koO=\u000bckoXa\u0007lq$X\u007f\u0007yvU\n\"_:<";
        objectArray[37] = "\na\u0000}bV\u007fA\u000brs\u0019\u001eO\u0000ywCj";
        objectArray[38] = "V2!O4PK'#\u000e1\f\u000b\u001e";
        objectArray[39] = "U\u0001\u0007Bo\u001b !\fM~TA/\u0007Fz\u000e5";
        objectArray[40] = "\u000f\t\u001df\u001f#\u0011\u0001\u0007)}?\u0016\u001c";
        objectArray[41] = "{T\r|D~p[\u001c3%p{P\u0018i";
        objectArray[42] = "?t7\u0004SdJT<\u000bB++Z7\u0000Fq_";
        objectArray[43] = "\u000eU\u001e3\r]{u\u0015<\u001c\u0012\u001a{\u001e7\u0018Hn";
        objectArray[44] = "q$6IKW\u0004\u0004=FZ\u0018e\n6M^B\u0011";
        objectArray[45] = "hX\u0003c\u001b2\u001dx\bl\n}|v\u0003g\u000e'\b";
        objectArray[46] = "F=+\u0015m\"[()Th~\u0016,";
        objectArray[47] = "1\u001d^nkxD=Uaz7%3^j~mQ";
        objectArray[48] = "D}Zp\u0014O1]Q\u007f\u0005\u0000PSZt\u0001Z$";
        objectArray[49] = "\u000el\u001b\u0013b\u0003{L\u0010\u001csL\u001aB\u001b\u0017w\u0016n";
        objectArray[50] = "J}g\u0019n}?]l\u0016\u007f2^Sg\u001d{h*";
        objectArray[51] = "g_z,6O\u0012\u007fq#'\u0000sqz(#Z\u0007";
        objectArray[52] = "^y-u\u007f$+Y&znkJW-qj1>";
        objectArray[53] = ",f\tb1\u0006<jH\t;\u007f\u007f?\u001f1z\u0003|=\u0015m?\u007f}6\u001e00\u001fzi\u00159\u0001";
        objectArray[54] = ")z\u0017\u0015l/w/\u001bR\u000b:!b\u001cMg\bu#G\u00173_w/\u001b\u0013:?pp\u0010\u001a\u000bd}yE\u001bkc\"rL*0n+'MJ71 .|\u0011:8u/\u001c\u0016e3|\u001e";
        objectArray[55] = "-e\u001fDD\u0010ceF\u0016#J,\u001a\u0014\u0016DK\"z\u0013IOB";
        objectArray[56] = "\tXjh*_\u0014AlvK\u001bd\b8ssZ\u0018\u000b:y/\u001fd\u000f9{rO\u0014Aqm1!";
        objectArray[57] = "%,=~0zk,d,W eS`t=ez-}m;{";
        objectArray[58] = ">Xca\u0003$.T\"\n\n]m\u0001u2H!n\u0003\u007fn\r]m[va\b9;\u0003rg3";
        objectArray[59] = "?=~b&^q='0A\u0004pBqf%^9,~d>\u0000";
        objectArray[60] = "d\u000e\u0001[\u00190|\r\u0007\u0019)6\u001dFG\u0003\u0011qaEE\tM4\u001d\u0012\u0016\u000fTkc\u000f\u000f\tJ\n";
        objectArray[61] = ".\u000fV\fQ\u0019|\\\u001a_,D\u0011XS\b\u0014\u0002m[Q\u0002HG\u0011_R\u0000\u0015\u0017a\u0011\u001a\u0016Vy";
        objectArray[62] = "oo\u0001\u0015\u0010)!oXGwsj\u0010\nG\u0010r`p\r\u0018\u001b{";
        objectArray[63] = "\fT*dHrBTs6/-2FsmRqL[jkL";
        objectArray[64] = "\u0012-G?Zk@~\u000bl'4-zB;\u001fpQy@1C5-}C3\u001ee]3\u000b%]\u000b";
        objectArray[65] = "GpoKC\u001f\tp6\u0019$DH\u000ff\u0010BE\u0002se\u0012H\u0019G\u000ffJA\u0016Bk0\u0012E\u0010y";
        objectArray[66] = "28?&.]vj+)Q\u0003M+*`0\u0001.>=)*";
        objectArray[67] = "sPIq\u001dE,_Z)tO|_ {EM,\u001e@|\u001aF%/\u001bq\u0013\u0013$O\u001c.\u0018\u001a\u0015\u0014\u0011'M\u001bu\u0013N,D*";
        objectArray[68] = "9\\;1G+$E=/&eT\fi*\u001e.(\u000fk BkT\u000bh\"\u001f;$E 4\\U";
        objectArray[69] = "\u001e.iq9\u0018Hio}C\u001eMU.9%\u0019U)-;/E\u0010U.c&J\u00151x;\"L.";
        objectArray[70] = "w\u000f\u0013\u0002,ZpZ\u0019\u001f@\u000e\u001d\n\u001a\u000bxHa\t\u0018\u0001$\r\u001dZX\u0002=I!LN\u0007<3";
        objectArray[71] = "~It;\u0002)0I-ies$6{?\u0001)xXt=\u001aw";
        objectArray[72] = "[?65;|\u0015?og\\.ey>0de\u0019z<:8 e)|9!dY?j< \u001e";
        objectArray[73] = "Gg\u0000D)MWkA/$4\u0014>\u0016\u0017bH\u0017<\u001cK'4\u00167\u0017\u0016(T\u0011h\u001c\u001f\u0019";
        objectArray[74] = "f?\u000f\t';(?V[@fX-V\u0000=8&0O\u0006#";
        objectArray[75] = ">|Y=\u0019\u0003h;_1c\u0006\u000e>\u001f+[Ar=\u001d!\u0007\u0004\u000e<\u0016*Z\u000bn;I!S:";
        objectArray[76] = "f$I\u001eQS4w\u0005M,\tYsL\u001a\u0014H%pN\u0010H\rYtM\u0012\u0015]):\u0005\u0004V3";
        objectArray[77] = "Xn,=q\u001eHbmV~g\u000b7:n:\u001b\b502\u007fg\t>;op\u0007\u000ea0fA";
        objectArray[78] = "\u001c;$W}\u0011Nhh\u0004\u0000L\u0018Ut\\j\fB+iEl\u0012";
        objectArray[79] = "~\u0007\u001eD=j/_B\u0006Q8\u001fWAZizcTCP5?\u001fUH[h0\u007fR\u0017Pa\u0001";
        objectArray[80] = "\u0004fo-Tl\u0004dsxjz\u001bgfCV.M2\u001e/[vE3~(\u0004}L\u0002";
        objectArray[81] = "*\r\u000e~]ux^B- )\u0015]\nr\u0019{e\u0013BdZ";
        objectArray[82] = "}W\u0016K\u0006\u00163WO\u0019aECBGX\nD:RK\u0019";
        objectArray[83] = "G1T R^G3HulFR)E~\u0000t\u0000i\u001f%Q#\u0001lK \u0002SO$]cl";
        objectArray[84] = "hgzL--}p3V\u0011/tun]V \u0012bf]~!q$~U(N, m\u0014\u007f>bh{W\u0011";
        objectArray[85] = "3'Za0r#+\u001b\n0\u000b`~L2{wc|Fn>\u000bbwM31ke(F:\u0000";
        objectArray[86] = "\u000fF2j~\u0000\u0012_4t\u001fFb\u0016`q'\u0005\u001e\u0015b{{@b\u0011ay&\u0010\u0012_)oe~";
        objectArray[87] = ")(UeG\u001041S{&_Dx\u0007~\u001e\u00158{\u0005tBPD\u007f\u0006v\u001f\u000041N`\\n";
        objectArray[88] = ">9@\t1La6SQXF9 )\u0003iDawI\u00046OhF\u0012\t?\u001ai&\u0015V4\u0013X}\u0018_a\u00128zGTh#";
        objectArray[89] = "\u001c\u001eo\u0004OXNM#W2\u0006#Ij\u0000\nC_Jh\nV\u0006#Nk\b\u000bVS\u0000#\u001eH8";
        objectArray[90] = "X9Y\u001adu\u0018=\u0018\u001a\u001dp\b+H\u0012qBZk\u0012O-\u0015[nFLse\u0015&P\u000f\u001d";
        objectArray[91] = "X\bJ\u00046i\tP\u0016FZ:9X\u0015\u001abyE[\u0017\u0010><9\bW\u0013'x\u0005\u001eA\u0016&\u0002";
        objectArray[92] = "|\u001c{kl\u0016-D')\u0000E\u001dL$u8\u0006aO&\u007fdC\u001dN-t9L}Ir\u007f0}";
        objectArray[93] = "R\u0001?~\t\u001c\u0000Rs-tLmPex\u0016D\u0003_gcH";
        objectArray[94] = "N,&e;\u0012V/ '\u000b\u00127d`=3SKgb7o\u00167011vII-(7h(";
        objectArray[95] = "%@mfUik@442:\u001b\u0006ec\npg\u0005giV5\u001bV'jOq'@1oN\u000b";
        objectArray[96] = "f9*\u007f}6(9s-\u001am6F#$|l#: &v0fF#~\u007f?c\"u&{9X";
        objectArray[97] = "D4?bH^\n4f0/\u0000zr7g\u0017G\u0006q5mK\u0002ztheM\u0004\u0014{j~\u0013<";
        objectArray[98] = "\u0015\u001d@\u0002f\u0001[\u001d\u0019P\u0001[+YA\u00068RK^\u001e\r1";
        objectArray[99] = "z6j~\u0002\u001cj:+\u0015\ne)o|-I\u0019*mvq\fe+f},\u0003\u0005,9v%2";
        objectArray[100] = "\u007f\b.r\u001a\ro\u0004o\u0019\u0012t,Q8!Q\b/S2}\u0014t,\u000b;r\u0011\u0010zS?t*";
        objectArray[101] = "z\u0017*q\bpj\u001bk\u001a\t\t)N<\"Cu*L6~\u0006\t+G=#\ti,\u00186*8";
        objectArray[102] = "0!S yp -\u0012Kr\tcxEs2u`zO/w\taqDrxif.O{I";
        objectArray[103] = "_]QX[\u0004\u0011]\b\n<Xa\u0019P\\\u0005W\u0001\u001e\u000fW\f";
        objectArray[104] = "\u001e\u000f<Cl\u0000P\u000fe\u0011\u000bR I4F3\u0019\\J6Lo\\ OkDiZN@i_7b";
        objectArray[105] = "@$\u0017g%^\u0012w[4X\u0003\u007fs\u0012c`E\u0003p\u0010i<\u0000\u007fuMa:\u0006\u0011zOzd>";
        objectArray[106] = "*Z\f\u0016\u001e\u0007x\t@Ec\\\u0015KX\u001f\\\u0018u\u000f\n\u000bS";
        objectArray[107] = "{r%\u000ef3{p9[X%ds,`dq2'T\fi):'4\u000b6\"3\u0016";
        objectArray[108] = "Xo*@\u0018b\u000e(,Lbkh-lVZ \u0014.n\\\u0006eh/eW[j\b(:\\R[";
        Object[] objectArray2 = objectArray;
        objectArray[109] = "\u0004!ApBtVr\r#?.;\"\u0015xBuE?\f~\\";
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _0L.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'w' || c == 'I' || c == 'x' || c == '\u00fc') {
                field = _0L.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'w' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'I' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'x' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _0L.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'H' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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
            throw new RuntimeException("dev/krypton/0L" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l2, long l3) {
        int n = _0L.e(l2, l3);
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
                clazz3 = _0L.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _0L.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _0L.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _0L.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _0L.f(2908365051936421L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _0L.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _0L.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _0L.f(2908365051936421L, 0L);
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
            int n = _0L.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _0L.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _0L.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _0L.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _0L.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _0L.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0L" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x2DA4;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])i.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/0L", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _0L.e[n2] = n3;
        }
        return e[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _0L.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field g(long l2, long l3) {
        int n = _0L.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _0L.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _0L.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _0L.c(clazz3, string2, clazz2)) != null) {
                    _0L.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _0L.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _0L.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _0L.f(2908365051936421L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void cfr_renamed_21(Object[] objectArray) {
        double d = (Double)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x422291AB8201L;
        long l5 = l3 ^ 0x68BDB6E91F99L;
        long l6 = l3 ^ 0xC701DFBF136L;
        long l7 = l3 ^ 0x3FAC7F7F16DL;
        long l8 = l3 ^ 0x492D8F165717L;
        long l9 = l3 ^ 0xB5963FDB11FL;
        long l10 = l3 ^ 0x3C2299E19028L;
        long l11 = l3 ^ 0x3FB29B14036L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l6;
        double d2 = d - (double)(_0L.c("\u00c3", (Object)this, (Object)objectArray2, -1396613044969333423L, (long)l2) + 5);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l8;
        CallSite callSite = _0L.c("H", (double)(d2 / (double)(_0L.c("\u00c3", (Object)this, (Object)objectArray3, -1403098087157563655L, (long)l2) - _0L.a("u", 1661, (long)(0xD170C1DDE2CC756L ^ l2)))), 0.0, 1.0, -1403444251456637939L, (long)l2);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l10;
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l11;
        Object[] objectArray6 = new Object[1];
        objectArray6[0] = l11;
        Object[] objectArray7 = new Object[1];
        objectArray7[0] = l4;
        Object[] objectArray8 = new Object[3];
        objectArray8[2] = (double)_0L.c("\u00c3", (Object)_0L.c("w", (Object)this, -1396988499625349858L, (long)l2), (Object)objectArray7, -1403703730475255277L, (long)l2);
        objectArray8[1] = (double)(callSite * (_0L.c("\u00c3", (Object)_0L.c("w", (Object)this, -1396988499625349858L, (long)l2), (Object)objectArray4, -1400068144685081817L, (long)l2) - _0L.c("\u00c3", (Object)_0L.c("w", (Object)this, -1396988499625349858L, (long)l2), (Object)objectArray5, -1397787572803008388L, (long)l2)) + _0L.c("\u00c3", (Object)_0L.c("w", (Object)this, -1396988499625349858L, (long)l2), (Object)objectArray6, -1397787572803008388L, (long)l2));
        objectArray8[0] = l5;
        CallSite callSite2 = _0L.c("H", (Object)objectArray8, -1396259235225918219L, (long)l2);
        Object[] objectArray9 = new Object[1];
        objectArray9[0] = l7;
        Object[] objectArray10 = new Object[2];
        objectArray10[1] = (double)_0L.c("H", (double)callSite2, (double)_0L.c("\u00c3", (Object)_0L.c("w", (Object)this, -1396988499625349858L, (long)l2), (Object)objectArray9, -1396901623128296769L, (long)l2), -1396555709910055900L, (long)l2);
        objectArray10[0] = l9;
        _0L.c("\u00c3", (Object)_0L.c("w", (Object)this, -1396988499625349858L, (long)l2), (Object)objectArray10, -1400242114903160273L, (long)l2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void void_6(Object[] var1_1) {
        block44: {
            block45: {
                block47: {
                    block43: {
                        block52: {
                            block50: {
                                block48: {
                                    block46: {
                                        block42: {
                                            var3_2 = (class_11909)var1_1[0];
                                            var2_3 = (Boolean)var1_1[1];
                                            var4_4 = (Long)var1_1[2];
                                            v0 = var4_4;
                                            var6_5 = v0 ^ 22893989549168L;
                                            var8_6 = v0 ^ 87105781137247L;
                                            var10_7 = v0 ^ 97924050781034L;
                                            var12_8 = v0 ^ 23747554070834L;
                                            var14_9 = v0 ^ 11147916322277L;
                                            var16_10 = v0 ^ 70858064456876L;
                                            var18_11 = v0 ^ 0L;
                                            var20_12 = _02.cfr_renamed_2();
                                            try {
                                                try {
                                                    try {
                                                        v1 = _0L.c("\u00c3", (Object)var3_2, (long)5519367769197036628L, (long)var4_4);
                                                        if (var20_12) break block42;
                                                        if (v1 != false) break block43;
                                                    }
                                                    catch (MatchException v2) {
                                                        throw _0L.a(v2);
                                                    }
                                                    v3 = this;
                                                    v4 = var3_2;
                                                    v5 = var20_12;
                                                    if (var4_4 < 0L) break block44;
                                                    if (v5) break block45;
                                                }
                                                catch (MatchException v6) {
                                                    throw _0L.a(v6);
                                                }
                                                v7 = new Object[3];
                                                v7[2] = var14_9;
                                                v7[1] = (double)_0L.c("\u00c3", (Object)var3_2, (long)5518750113499804779L, (long)var4_4);
                                                v7[0] = (double)_0L.c("\u00c3", (Object)v4, (long)5519258256055897648L, (long)var4_4);
                                                v1 = _0L.c("\u00c3", (Object)v3, (Object)v7, (long)5518635331476844627L, (long)var4_4);
                                            }
                                            catch (MatchException v8) {
                                                throw _0L.a(v8);
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (var4_4 >= 0L) {
                                                            if (v1 == false) break block43;
                                                            v9 = new Object[3];
                                                            v9[2] = (double)_0L.c("\u00c3", (Object)var3_2, (long)5518750113499804779L, (long)var4_4);
                                                            v9[1] = (double)_0L.c("\u00c3", (Object)var3_2, (long)5519258256055897648L, (long)var4_4);
                                                            v9[0] = var6_5;
                                                            v1 = _0L.c("\u00c3", (Object)this, (Object)v9, (long)5518684176183827353L, (long)var4_4);
                                                        }
                                                        v10 = var20_12;
                                                        if (var4_4 > 0L) {
                                                            if (v10) break block46;
                                                        }
                                                        ** GOTO lbl101
                                                    }
                                                    catch (MatchException v11) {
                                                        throw _0L.a(v11);
                                                    }
                                                    if (var4_4 <= 0L) break block46;
                                                    if (v1 == false) ** GOTO lbl85
                                                }
                                                catch (MatchException v12) {
                                                    throw _0L.a(v12);
                                                }
                                                _0L.c("I", (Object)this, (boolean)_0L.a("u", (int)468, (long)(1811942565347057914L ^ var4_4)), (long)5520743823893175546L, (long)var4_4);
                                                v3 = this;
                                                if (var4_4 <= 0L) break block47;
                                                v13 = new Object[2];
                                                v13[1] = var16_10;
                                                v13[0] = (double)_0L.c("\u00c3", (Object)var3_2, (long)5519258256055897648L, (long)var4_4);
                                                _0L.c("\u00c3", (Object)v3, (Object)v13, (long)5520350625042333095L, (long)var4_4);
                                                if (var20_12) {
                                                }
                                                break block43;
                                            }
                                            catch (MatchException v14) {
                                                throw _0L.a(v14);
                                            }
lbl85:
                                            // 2 sources

                                            v15 = new Object[3];
                                            v15[2] = (double)_0L.c("\u00c3", (Object)var3_2, (long)5518750113499804779L, (long)var4_4);
                                            v15[1] = (double)_0L.c("\u00c3", (Object)var3_2, (long)5519258256055897648L, (long)var4_4);
                                            v15[0] = var8_6;
                                            v1 = _0L.c("\u00c3", (Object)this, (Object)v15, (long)5518065620055250355L, (long)var4_4);
                                        }
                                        catch (MatchException v16) {
                                            throw _0L.a(v16);
                                        }
                                    }
                                    try {
                                        block49: {
                                            try {
                                                try {
                                                    v10 = var20_12;
lbl101:
                                                    // 2 sources

                                                    if (var4_4 > 0L) {
                                                        if (v10) break block48;
                                                        if (v1 == false) break block49;
                                                    }
                                                    ** GOTO lbl135
                                                }
                                                catch (MatchException v17) {
                                                    throw _0L.a(v17);
                                                }
                                                _0L.c("I", (Object)this, (boolean)_0L.a("u", (int)7141, (long)(7130953925502728901L ^ var4_4)), (long)5513164437078374623L, (long)var4_4);
                                                v3 = this;
                                                if (var4_4 <= 0L) break block47;
                                                v18 = new Object[2];
                                                v18[1] = var10_7;
                                                v18[0] = (double)_0L.c("\u00c3", (Object)var3_2, (long)5519258256055897648L, (long)var4_4);
                                                _0L.c("\u00c3", (Object)v3, (Object)v18, (long)5518171613456914936L, (long)var4_4);
                                                if (!var20_12) break block43;
                                            }
                                            catch (MatchException v19) {
                                                throw _0L.a(v19);
                                            }
                                        }
                                        v20 = new Object[1];
                                        v20[0] = var12_8;
                                        cfr_temp_0 = _0L.c("\u00c3", (Object)var3_2, (long)5519258256055897648L, (long)var4_4) - ((double)_0L.c("\u00c3", (Object)this, (Object)v20, (long)5519761938559581525L, (long)var4_4) + _0L.c("w", (Object)this, (long)5518280002071457450L, (long)var4_4));
                                        v1 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                    }
                                    catch (MatchException v21) {
                                        throw _0L.a(v21);
                                    }
                                }
                                try {
                                    block51: {
                                        try {
                                            try {
                                                v10 = var20_12;
lbl135:
                                                // 2 sources

                                                if (var4_4 > 0L) {
                                                    if (v10) break block50;
                                                    if (v1 >= 0) break block51;
                                                }
                                                ** GOTO lbl170
                                            }
                                            catch (MatchException v22) {
                                                throw _0L.a(v22);
                                            }
                                            _0L.c("I", (Object)this, (boolean)_0L.a("u", (int)7141, (long)(7130953925502728901L ^ var4_4)), (long)5520743823893175546L, (long)var4_4);
                                            v3 = this;
                                            if (var4_4 <= 0L) break block47;
                                            v23 = new Object[2];
                                            v23[1] = var16_10;
                                            v23[0] = (double)_0L.c("\u00c3", (Object)var3_2, (long)5519258256055897648L, (long)var4_4);
                                            _0L.c("\u00c3", (Object)v3, (Object)v23, (long)5520350625042333095L, (long)var4_4);
                                            if (!var20_12) break block43;
                                        }
                                        catch (MatchException v24) {
                                            throw _0L.a(v24);
                                        }
                                    }
                                    v25 = new Object[1];
                                    v25[0] = var12_8;
                                    cfr_temp_1 = _0L.c("\u00c3", (Object)var3_2, (long)5519258256055897648L, (long)var4_4) - ((double)_0L.c("\u00c3", (Object)this, (Object)v25, (long)5519761938559581525L, (long)var4_4) + _0L.c("w", (Object)this, (long)5513521395754405322L, (long)var4_4));
                                    v1 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 > 0 ? 1 : -1);
                                }
                                catch (MatchException v26) {
                                    throw _0L.a(v26);
                                }
                            }
                            try {
                                block53: {
                                    try {
                                        try {
                                            if (var4_4 < 0L) break block52;
                                            v10 = var20_12;
lbl170:
                                            // 2 sources

                                            if (v10) break block52;
                                            if (v1 <= 0) break block53;
                                        }
                                        catch (MatchException v27) {
                                            throw _0L.a(v27);
                                        }
                                        _0L.c("I", (Object)this, (boolean)_0L.a("u", (int)7141, (long)(7130953925502728901L ^ var4_4)), (long)5513164437078374623L, (long)var4_4);
                                        v3 = this;
                                        if (var4_4 < 0L) break block47;
                                        v28 = new Object[2];
                                        v28[1] = var10_7;
                                        v28[0] = (double)_0L.c("\u00c3", (Object)var3_2, (long)5519258256055897648L, (long)var4_4);
                                        _0L.c("\u00c3", (Object)v3, (Object)v28, (long)5518171613456914936L, (long)var4_4);
                                        if (!var20_12) break block43;
                                    }
                                    catch (MatchException v29) {
                                        throw _0L.a(v29);
                                    }
                                }
                                v30 = new Object[1];
                                v30[0] = var12_8;
                                v31 = new Object[1];
                                v31[0] = var12_8;
                                cfr_temp_2 = _0L.c("\u00c3", (Object)var3_2, (long)5519258256055897648L, (long)var4_4) - ((double)_0L.c("\u00c3", (Object)this, (Object)v30, (long)5519761938559581525L, (long)var4_4) + _0L.c("w", (Object)this, (long)5518280002071457450L, (long)var4_4)) - ((double)_0L.c("\u00c3", (Object)this, (Object)v31, (long)5519761938559581525L, (long)var4_4) + _0L.c("w", (Object)this, (long)5513521395754405322L, (long)var4_4) - _0L.c("\u00c3", (Object)var3_2, (long)5519258256055897648L, (long)var4_4));
                                v1 = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 < 0 ? -1 : 1);
                            }
                            catch (MatchException v32) {
                                throw _0L.a(v32);
                            }
                        }
                        try {
                            block54: {
                                try {
                                    if (var4_4 > 0L) {
                                        if (v1 >= 0) break block54;
                                        _0L.c("I", (Object)this, (boolean)_0L.a("u", (int)7141, (long)(7130953925502728901L ^ var4_4)), (long)5520743823893175546L, (long)var4_4);
                                        v3 = this;
                                        if (var4_4 < 0L) break block47;
                                        v33 = new Object[2];
                                        v33[1] = var16_10;
                                        v33[0] = (double)_0L.c("\u00c3", (Object)var3_2, (long)5519258256055897648L, (long)var4_4);
                                        _0L.c("\u00c3", (Object)v3, (Object)v33, (long)5520350625042333095L, (long)var4_4);
                                        v1 = (reference)var20_12;
                                    }
                                    if (v1 == false) break block43;
                                }
                                catch (MatchException v34) {
                                    throw _0L.a(v34);
                                }
                            }
                            _0L.c("I", (Object)this, (boolean)_0L.a("u", (int)7141, (long)(7130953925502728901L ^ var4_4)), (long)5513164437078374623L, (long)var4_4);
                            v35 = new Object[2];
                            v35[1] = var10_7;
                            v35[0] = (double)_0L.c("\u00c3", (Object)var3_2, (long)5519258256055897648L, (long)var4_4);
                            _0L.c("\u00c3", (Object)this, (Object)v35, (long)5518171613456914936L, (long)var4_4);
                        }
                        catch (MatchException v36) {
                            throw _0L.a(v36);
                        }
                    }
                    v3 = this;
                }
                v4 = var3_2;
            }
            v5 = var2_3;
        }
        v37 = new Object[3];
        v37[2] = var18_11;
        v37[1] = v5;
        v37[0] = v4;
        super.void_6(v37);
    }

    @Override
    public void void_2(Object[] objectArray) {
        block15: {
            _0L l2;
            int n;
            long l3;
            long l4;
            block14: {
                Object object;
                int n2;
                long l5;
                block12: {
                    block13: {
                        _0L l6;
                        CallSite callSite;
                        long l7;
                        long l8;
                        long l9;
                        long l10;
                        block10: {
                            l4 = (Long)objectArray[0];
                            long l11 = l4;
                            long l12 = l11 ^ 0L;
                            l10 = l11 ^ 0x8A8E91FC721L;
                            l3 = l11 ^ 0x352CBBD04635L;
                            long l13 = l11 ^ 0xB87C84B6A64L;
                            l9 = l11 ^ 0x2A39F7C23861L;
                            l8 = l11 ^ 0x7F18191DCF6BL;
                            l7 = l11 ^ 0x52FE7BD5F346L;
                            l5 = l11 ^ 0x700BA65D55AAL;
                            Object[] objectArray2 = new Object[1];
                            objectArray2[0] = l12;
                            super.void_2(objectArray2);
                            Object[] objectArray3 = new Object[3];
                            objectArray3[2] = (int)(_0L.c("\u00c3", (Object)_0L.c("w", (Object)_0L.c("w", (Object)this, -8273176822891770178L, (long)l4), -8275966436789254585L, (long)l4), (Object)this, -8277516565548341583L, (long)l4) + true);
                            objectArray3[1] = (int)_0L.a("u", 4491, (long)(0x6F942875E97CB117L ^ l4));
                            objectArray3[0] = l13;
                            callSite = _0L.c("H", (Object)objectArray3, -8270212939155385937L, (long)l4);
                            n2 = _02.cfr_renamed_2();
                            try {
                                block11: {
                                    try {
                                        try {
                                            l6 = this;
                                            if (n2 != 0) break block10;
                                            if (_0L.c("w", (Object)l6, -8275412413220097609L, (long)l4) != null) break block11;
                                        }
                                        catch (MatchException matchException) {
                                            throw _0L.a(matchException);
                                        }
                                        Object[] objectArray4 = new Object[1];
                                        objectArray4[0] = l7;
                                        Object[] objectArray5 = new Object[1];
                                        objectArray5[0] = l10;
                                        Object[] objectArray6 = new Object[1];
                                        objectArray6[0] = l9;
                                        _0L.c("I", (Object)this, (_8B)new _8B((int)_0L.c("\u00c3", (Object)callSite, (Object)objectArray4, -8276398497966614960L, (long)l4), (int)_0L.c("\u00c3", (Object)callSite, (Object)objectArray5, -8277440901102096567L, (long)l4), l8, (int)_0L.c("\u00c3", (Object)callSite, (Object)objectArray6, -8269932264580587276L, (long)l4), 0), -8275412413220097609L, (long)l4);
                                        object = n2;
                                        if (l4 <= 0L) break block12;
                                        if (object == 0) break block13;
                                    }
                                    catch (MatchException matchException) {
                                        throw _0L.a(matchException);
                                    }
                                }
                                l6 = this;
                            }
                            catch (MatchException matchException) {
                                throw _0L.a(matchException);
                            }
                        }
                        Object[] objectArray7 = new Object[1];
                        objectArray7[0] = l7;
                        Object[] objectArray8 = new Object[1];
                        objectArray8[0] = l10;
                        Object[] objectArray9 = new Object[1];
                        objectArray9[0] = l9;
                        Object[] objectArray10 = new Object[1];
                        objectArray10[0] = l5;
                        _0L.c("I", (Object)l6, (_8B)new _8B((int)_0L.c("\u00c3", (Object)callSite, (Object)objectArray7, -8276398497966614960L, (long)l4), (int)_0L.c("\u00c3", (Object)callSite, (Object)objectArray8, -8277440901102096567L, (long)l4), l8, (int)_0L.c("\u00c3", (Object)callSite, (Object)objectArray9, -8269932264580587276L, (long)l4), (int)_0L.c("\u00c3", (Object)_0L.c("w", (Object)this, -8275412413220097609L, (long)l4), (Object)objectArray10, -8277353141450260019L, (long)l4)), -8275412413220097609L, (long)l4);
                    }
                    object = _0L.a("u", 5195, (long)(0x6A8E7D52EF1CB4D1L ^ l4));
                }
                n = object;
                try {
                    try {
                        l2 = this;
                        if (n2 != 0) break block14;
                        Object[] objectArray11 = new Object[1];
                        objectArray11[0] = l5;
                        if (_0L.c("\u00c3", (Object)_0L.c("w", (Object)l2, -8275412413220097609L, (long)l4), (Object)objectArray11, -8277353141450260019L, (long)l4) == n) break block15;
                    }
                    catch (MatchException matchException) {
                        throw _0L.a(matchException);
                    }
                    l2 = this;
                }
                catch (MatchException matchException) {
                    throw _0L.a(matchException);
                }
            }
            Object[] objectArray12 = new Object[4];
            objectArray12[3] = _0L.c("w", (Object)this, -8275412413220097609L, (long)l4);
            objectArray12[2] = n;
            objectArray12[1] = Float.valueOf(0.05f);
            objectArray12[0] = l3;
            _0L.c("I", (Object)l2, (_8B)((Object)_0L.c("H", (Object)objectArray12, -8276812204755593733L, (long)l4)), -8275412413220097609L, (long)l4);
        }
    }

    @Override
    public void void_4(Object[] objectArray) {
        _0L l2;
        long l3;
        class_11908 class_119082;
        block6: {
            block7: {
                class_119082 = (class_11908)objectArray[0];
                long l4 = (Long)objectArray[1];
                long l5 = l4;
                long l6 = l5 ^ 0x3EF482FFAC93L;
                l3 = l5 ^ 0L;
                long l7 = l5 ^ 0x10195A4051DL;
                long l8 = l5 ^ 0x2B20E3F8BBA6L;
                long l9 = l5 ^ 0x205E7F7F6B18L;
                boolean bl = _02.cfr_renamed_3();
                try {
                    try {
                        try {
                            l2 = this;
                            if (!bl) break block6;
                            if (_0L.c("w", (Object)l2, 6385299980342025870L, (long)l4) == false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw _0L.a(matchException);
                        }
                        if (_0L.c("\u00c3", (Object)class_119082, 6385246507082906564L, (long)l4) != _0L.a("u", 19496, (long)(0x13FAE0E670853909L ^ l4))) break block7;
                    }
                    catch (MatchException matchException) {
                        throw _0L.a(matchException);
                    }
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l6;
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l8;
                    objectArray3[0] = (double)_0L.c("\u00c3", (Object)_0L.c("w", (Object)this, 6385800825777674524L, (long)l4), (Object)objectArray2, 6384175171335025781L, (long)l4);
                    _0L.c("\u00c3", (Object)_0L.c("w", (Object)this, 6385800825777674524L, (long)l4), (Object)objectArray3, 6378464251221978510L, (long)l4);
                    Object[] objectArray4 = new Object[1];
                    objectArray4[0] = l9;
                    Object[] objectArray5 = new Object[2];
                    objectArray5[1] = (double)_0L.c("\u00c3", (Object)_0L.c("w", (Object)this, 6385800825777674524L, (long)l4), (Object)objectArray4, 6382477454317054139L, (long)l4);
                    objectArray5[0] = l7;
                    _0L.c("\u00c3", (Object)_0L.c("w", (Object)this, 6385800825777674524L, (long)l4), (Object)objectArray5, 6382547832196202029L, (long)l4);
                }
                catch (MatchException matchException) {
                    throw _0L.a(matchException);
                }
            }
            l2 = this;
        }
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = l3;
        objectArray6[0] = class_119082;
        super.void_4(objectArray6);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean boolean_4(Object[] objectArray) {
        Object object;
        block10: {
            boolean bl;
            block11: {
                boolean bl2;
                block12: {
                    long l2;
                    double d;
                    long l3;
                    block9: {
                        l3 = (Long)objectArray[0];
                        d = (Double)objectArray[1];
                        double d2 = (Double)objectArray[2];
                        long l4 = l3 = a ^ l3;
                        l2 = l4 ^ 0x339151D62C5L;
                        long l5 = l4 ^ 0x1C83AE0C9612L;
                        bl2 = _02.cfr_renamed_3();
                        try {
                            try {
                                Object[] objectArray2 = new Object[3];
                                objectArray2[2] = l5;
                                objectArray2[1] = d2;
                                objectArray2[0] = d;
                                object = _0L.c("\u00c3", (Object)this, (Object)objectArray2, 9178678231027663780L, (long)l3);
                                if (!bl2) break block9;
                                if (object == false) break block10;
                            }
                            catch (MatchException matchException) {
                                throw _0L.a(matchException);
                            }
                            Object[] objectArray3 = new Object[1];
                            objectArray3[0] = l2;
                            double d3 = d - ((double)_0L.c("\u00c3", (Object)this, (Object)objectArray3, 9182053063203720866L, (long)l3) + _0L.c("w", (Object)this, 9184212790157393469L, (long)l3) - 8.0);
                            object = d3 == 0.0 ? 0 : (d3 > 0.0 ? 1 : -1);
                        }
                        catch (MatchException matchException) {
                            throw _0L.a(matchException);
                        }
                    }
                    try {
                        bl = bl2;
                        if (l3 < 0L) break block11;
                        if (!bl) break block12;
                        if (object <= 0) break block10;
                        Object[] objectArray4 = new Object[1];
                        objectArray4[0] = l2;
                        double d4 = d - ((double)_0L.c("\u00c3", (Object)this, (Object)objectArray4, 9182053063203720866L, (long)l3) + _0L.c("w", (Object)this, 9184212790157393469L, (long)l3) + 8.0);
                        object = d4 == 0.0 ? 0 : (d4 < 0.0 ? -1 : 1);
                    }
                    catch (MatchException matchException) {
                        throw _0L.a(matchException);
                    }
                }
                bl = bl2;
            }
            if (!bl) return (boolean)object;
            if (object < 0) {
                object = true;
                return (boolean)object;
            }
        }
        object = false;
        return (boolean)object;
    }

    @Override
    public void void_7(Object[] objectArray) {
        block11: {
            _0L l2;
            long l3;
            double d;
            double d2;
            class_11909 class_119092;
            block12: {
                CallSite callSite;
                long l4;
                long l5;
                block9: {
                    boolean bl;
                    block10: {
                        class_119092 = (class_11909)objectArray[0];
                        d2 = (Double)objectArray[1];
                        d = (Double)objectArray[2];
                        l5 = (Long)objectArray[3];
                        long l6 = l5;
                        l4 = l6 ^ 0x51D2242A1D08L;
                        long l7 = l6 ^ 0x48AC71ABF2CEL;
                        l3 = l6 ^ 0L;
                        bl = _02.cfr_renamed_2();
                        try {
                            try {
                                callSite = _0L.c("w", (Object)this, 5980665528245322392L, (long)l5);
                                if (bl) break block9;
                                if (callSite == false) break block10;
                            }
                            catch (MatchException matchException) {
                                throw _0L.a(matchException);
                            }
                            Object[] objectArray2 = new Object[2];
                            objectArray2[1] = l7;
                            objectArray2[0] = (double)_0L.c("\u00c3", (Object)class_119092, 5979180488411287634L, (long)l5);
                            _0L.c("\u00c3", (Object)this, (Object)objectArray2, 5980271749431419845L, (long)l5);
                        }
                        catch (MatchException matchException) {
                            throw _0L.a(matchException);
                        }
                    }
                    try {
                        if (l5 < 0L) break block11;
                        l2 = this;
                        if (bl) break block12;
                        callSite = _0L.c("w", (Object)l2, 5971976540915132093L, (long)l5);
                    }
                    catch (MatchException matchException) {
                        throw _0L.a(matchException);
                    }
                }
                try {
                    if (callSite != false) {
                        Object[] objectArray3 = new Object[2];
                        objectArray3[1] = l4;
                        objectArray3[0] = (double)_0L.c("\u00c3", (Object)class_119092, 5979180488411287634L, (long)l5);
                        _0L.c("\u00c3", (Object)this, (Object)objectArray3, 5978092020992264090L, (long)l5);
                    }
                }
                catch (MatchException matchException) {
                    throw _0L.a(matchException);
                }
                l2 = this;
            }
            Object[] objectArray4 = new Object[4];
            objectArray4[3] = l3;
            objectArray4[2] = d;
            objectArray4[1] = d2;
            objectArray4[0] = class_119092;
            super.void_7(objectArray4);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean boolean_8(Object[] objectArray) {
        Object object;
        block10: {
            boolean bl;
            block11: {
                boolean bl2;
                block12: {
                    long l2;
                    double d;
                    long l3;
                    block9: {
                        l3 = (Long)objectArray[0];
                        d = (Double)objectArray[1];
                        double d2 = (Double)objectArray[2];
                        long l4 = l3 = a ^ l3;
                        l2 = l4 ^ 0x58D39C2449EAL;
                        long l5 = l4 ^ 0x47692735BD3DL;
                        bl2 = _02.cfr_renamed_2();
                        try {
                            try {
                                Object[] objectArray2 = new Object[3];
                                objectArray2[2] = l5;
                                objectArray2[1] = d2;
                                objectArray2[0] = d;
                                object = _0L.c("\u00c3", (Object)this, (Object)objectArray2, 6074912600414152843L, (long)l3);
                                if (bl2) break block9;
                                if (object == false) break block10;
                            }
                            catch (MatchException matchException) {
                                throw _0L.a(matchException);
                            }
                            Object[] objectArray3 = new Object[1];
                            objectArray3[0] = l2;
                            double d3 = d - ((double)_0L.c("\u00c3", (Object)this, (Object)objectArray3, 6071537801524061581L, (long)l3) + _0L.c("w", (Object)this, 6074391789005862514L, (long)l3) - 8.0);
                            object = d3 == 0.0 ? 0 : (d3 > 0.0 ? 1 : -1);
                        }
                        catch (MatchException matchException) {
                            throw _0L.a(matchException);
                        }
                    }
                    try {
                        bl = bl2;
                        if (l3 < 0L) break block11;
                        if (bl) break block12;
                        if (object <= 0) break block10;
                        Object[] objectArray4 = new Object[1];
                        objectArray4[0] = l2;
                        double d4 = d - ((double)_0L.c("\u00c3", (Object)this, (Object)objectArray4, 6071537801524061581L, (long)l3) + _0L.c("w", (Object)this, 6074391789005862514L, (long)l3) + 8.0);
                        object = d4 == 0.0 ? 0 : (d4 < 0.0 ? -1 : 1);
                    }
                    catch (MatchException matchException) {
                        throw _0L.a(matchException);
                    }
                }
                bl = bl2;
            }
            if (bl) return (boolean)object;
            if (object < 0) {
                object = true;
                return (boolean)object;
            }
        }
        object = false;
        return (boolean)object;
    }

    @Override
    protected void void_8(Object[] objectArray) {
        _0L l2;
        reference var38_22;
        reference var37_21;
        long l3;
        long l4;
        long l5;
        long l6;
        long l7;
        long l8;
        long l9;
        long l10;
        long l11;
        long l12;
        _87 var7_2;
        block4: {
            block5: {
                var7_2 = (_87)objectArray[0];
                int n = (Integer)objectArray[1];
                int n2 = (Integer)objectArray[2];
                l12 = (Long)objectArray[3];
                float f = ((Float)objectArray[4]).floatValue();
                long l13 = l12;
                l11 = l13 ^ 0x764D0226F048L;
                l10 = l13 ^ 0x570C24C53811L;
                long l14 = l13 ^ 0x1F53CCCA7655L;
                l9 = l13 ^ 0x2AF2DB09C70AL;
                l8 = l13 ^ 0x5A6C5011FCB7L;
                long l15 = l13 ^ 0x5C0728DF7685L;
                l7 = l13 ^ 0x538DF2D376DEL;
                long l16 = l13 ^ 0x7C4EAAB06B07L;
                l6 = l13 ^ 0x16D0603ED0FFL;
                l5 = l13 ^ 0x7F2CE5EAB728L;
                l4 = l13 ^ 0x4A7C3F174665L;
                long l17 = l13 ^ 0x5C06C699C7DEL;
                long l18 = l13 ^ 0x63DF76C917C0L;
                l3 = l13 ^ 0x88823B1F239L;
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l16;
                Object[] objectArray3 = new Object[1];
                objectArray3[0] = l17;
                Object[] objectArray4 = new Object[1];
                objectArray4[0] = l18;
                Object[] objectArray5 = new Object[1];
                objectArray5[0] = l17;
                Object[] objectArray6 = new Object[1];
                objectArray6[0] = l6;
                _0L.c("I", (Object)this, (double)((_0L.c("\u00c3", (Object)_0L.c("w", (Object)this, 7743017763109530358L, (long)l12), (Object)objectArray2, 7744204174437521529L, (long)l12) - _0L.c("\u00c3", (Object)_0L.c("w", (Object)this, 7743017763109530358L, (long)l12), (Object)objectArray3, 7742339109841506196L, (long)l12)) / (_0L.c("\u00c3", (Object)_0L.c("w", (Object)this, 7743017763109530358L, (long)l12), (Object)objectArray4, 7744408558310792399L, (long)l12) - _0L.c("\u00c3", (Object)_0L.c("w", (Object)this, 7743017763109530358L, (long)l12), (Object)objectArray5, 7742339109841506196L, (long)l12)) * (double)(_0L.c("\u00c3", (Object)this, (Object)objectArray6, 7741527525743524113L, (long)l12) - _0L.a("u", 3591, (long)(0xEB13B412A3548C1L ^ l12))) + 5.0), 7744107202117978438L, (long)l12);
                boolean bl = _02.cfr_renamed_3();
                Object[] objectArray7 = new Object[1];
                objectArray7[0] = l15;
                Object[] objectArray8 = new Object[1];
                objectArray8[0] = l17;
                Object[] objectArray9 = new Object[1];
                objectArray9[0] = l18;
                Object[] objectArray10 = new Object[1];
                objectArray10[0] = l17;
                Object[] objectArray11 = new Object[1];
                objectArray11[0] = l6;
                _0L.c("I", (Object)this, (double)((_0L.c("\u00c3", (Object)_0L.c("w", (Object)this, 7743017763109530358L, (long)l12), (Object)objectArray7, 7743212378760541527L, (long)l12) - _0L.c("\u00c3", (Object)_0L.c("w", (Object)this, 7743017763109530358L, (long)l12), (Object)objectArray8, 7742339109841506196L, (long)l12)) / (_0L.c("\u00c3", (Object)_0L.c("w", (Object)this, 7743017763109530358L, (long)l12), (Object)objectArray9, 7744408558310792399L, (long)l12) - _0L.c("\u00c3", (Object)_0L.c("w", (Object)this, 7743017763109530358L, (long)l12), (Object)objectArray10, 7742339109841506196L, (long)l12)) * (double)(_0L.c("\u00c3", (Object)this, (Object)objectArray11, 7741527525743524113L, (long)l12) - _0L.a("u", 3591, (long)(0xEB13B412A3548C1L ^ l12))) + 5.0), 7741600260314638886L, (long)l12);
                Object[] objectArray12 = new Object[4];
                objectArray12[3] = (double)_0L.c("w", (Object)this, 7744107202117978438L, (long)l12);
                objectArray12[2] = (double)_0L.c("w", (Object)this, 7741054502110321487L, (long)l12);
                objectArray12[1] = Float.valueOf((float)(0.5 * (double)f));
                objectArray12[0] = l14;
                _0L.c("I", (Object)this, (double)_0L.c("H", (Object)objectArray12, 7742804014482626376L, (long)l12), 7741054502110321487L, (long)l12);
                Object[] objectArray13 = new Object[4];
                objectArray13[3] = (double)_0L.c("w", (Object)this, 7741600260314638886L, (long)l12);
                objectArray13[2] = (double)_0L.c("w", (Object)this, 7744434888202936259L, (long)l12);
                objectArray13[1] = Float.valueOf((float)(0.5 * (double)f));
                objectArray13[0] = l14;
                _0L.c("I", (Object)this, (double)_0L.c("H", (Object)objectArray13, 7742804014482626376L, (long)l12), 7744434888202936259L, (long)l12);
                Object[] objectArray14 = new Object[1];
                objectArray14[0] = l9;
                Object[] objectArray15 = new Object[1];
                objectArray15[0] = l4;
                var37_21 = _0L.c("\u00c3", (Object)this, (Object)objectArray14, 7741705210914337128L, (long)l12) + _0L.c("w", (Object)this, 7742906580056558881L, (long)l12) + _0L.c("\u00c3", (Object)this, (Object)objectArray15, 7742600111706043699L, (long)l12) + _0L.a("u", 32219, (long)(0x7BC98BCC5C38BB1EL ^ l12));
                Object[] objectArray16 = new Object[1];
                objectArray16[0] = l7;
                var38_22 = _0L.c("\u00c3", (Object)this, (Object)objectArray16, 7743486732854991545L, (long)l12) + 5;
                Object[] objectArray17 = new Object[1];
                objectArray17[0] = l6;
                reference var39_23 = _0L.c("\u00c3", (Object)this, (Object)objectArray17, 7741527525743524113L, (long)l12) - _0L.a("u", 3591, (long)(0xEB13B412A3548C1L ^ l12));
                boolean bl2 = bl;
                try {
                    try {
                        Object[] objectArray18 = new Object[10];
                        objectArray18[9] = 2.0;
                        objectArray18[8] = 2.0;
                        objectArray18[7] = 2.0;
                        objectArray18[6] = 2.0;
                        objectArray18[5] = l5;
                        objectArray18[4] = (double)((float)var37_21 + 4.0f);
                        objectArray18[3] = (double)(var38_22 + var39_23);
                        objectArray18[2] = (double)var37_21;
                        objectArray18[1] = (double)var38_22;
                        objectArray18[0] = _0L.c("x", 7741234472119063107L, (long)l12);
                        _0L.c("\u00c3", (Object)var7_2, (Object)objectArray18, 7742045006408160175L, (long)l12);
                        l2 = this;
                        if (!bl2) break block4;
                        if (!(_0L.c("w", (Object)l2, 7744434888202936259L, (long)l12) > _0L.c("w", (Object)this, 7741054502110321487L, (long)l12))) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _0L.a(matchException);
                    }
                    Object[] objectArray19 = new Object[10];
                    objectArray19[9] = 2.0;
                    objectArray19[8] = 2.0;
                    objectArray19[7] = 2.0;
                    objectArray19[6] = 2.0;
                    objectArray19[5] = l5;
                    objectArray19[4] = (double)((float)var37_21 + 4.0f);
                    objectArray19[3] = (double)var38_22 + _0L.c("w", (Object)this, 7744434888202936259L, (long)l12) - 5.0;
                    objectArray19[2] = (double)var37_21;
                    objectArray19[1] = (double)var38_22 + _0L.c("w", (Object)this, 7741054502110321487L, (long)l12) - 5.0;
                    objectArray19[0] = _0L.c("w", (Object)this, 7742738935859183102L, (long)l12);
                    _0L.c("\u00c3", (Object)var7_2, (Object)objectArray19, 7742045006408160175L, (long)l12);
                }
                catch (MatchException matchException) {
                    throw _0L.a(matchException);
                }
            }
            l2 = this;
        }
        Object[] objectArray20 = new Object[1];
        objectArray20[0] = l8;
        CallSite callSite = _0L.c("\u00c3", (Object)l2, (Object)objectArray20, 7743907773486401091L, (long)l12);
        Object[] objectArray21 = new Object[1];
        objectArray21[0] = l9;
        Object[] objectArray22 = new Object[1];
        objectArray22[0] = l4;
        reference var41_26 = _0L.c("\u00c3", (Object)this, (Object)objectArray21, 7741705210914337128L, (long)l12) + _0L.c("\u00c3", (Object)this, (Object)objectArray22, 7742600111706043699L, (long)l12) + _0L.c("w", (Object)this, 7742906580056558881L, (long)l12) + _0L.a("u", 24202, (long)(0x21DA57E69C49984EL ^ l12));
        Object[] objectArray23 = new Object[1];
        objectArray23[0] = l3;
        Object[] objectArray24 = new Object[1];
        objectArray24[0] = l7;
        Object[] objectArray25 = new Object[5];
        objectArray25[4] = _0L.c("x", 7744859046832784802L, (long)l12);
        objectArray25[3] = (double)var41_26;
        objectArray25[2] = (double)(_0L.c("\u00c3", (Object)this, (Object)objectArray24, 7743486732854991545L, (long)l12) + 5);
        objectArray25[1] = _0L.c("\u00c3", (Object)_0L.c("w", (Object)this, 7743017763109530358L, (long)l12), (Object)objectArray23, 7742149101847609385L, (long)l12);
        objectArray25[0] = l10;
        _0L.c("\u00c3", (Object)var7_2, (Object)objectArray25, 7742491803617485829L, (long)l12);
        Object[] objectArray26 = new Object[2];
        objectArray26[1] = l11;
        objectArray26[0] = callSite;
        CallSite callSite2 = _0L.c("\u00c3", (Object)var7_2, (Object)objectArray26, 7744795899546083742L, (long)l12);
        Object[] objectArray27 = new Object[1];
        objectArray27[0] = l7;
        Object[] objectArray28 = new Object[1];
        objectArray28[0] = l6;
        int n = (int)((double)(_0L.c("\u00c3", (Object)this, (Object)objectArray27, 7743486732854991545L, (long)l12) + _0L.c("\u00c3", (Object)this, (Object)objectArray28, 7741527525743524113L, (long)l12)) - callSite2 - 5.0);
        Object[] objectArray29 = new Object[5];
        objectArray29[4] = _0L.c("w", (Object)this, 7742738935859183102L, (long)l12);
        objectArray29[3] = (double)var41_26;
        objectArray29[2] = (double)n;
        objectArray29[1] = callSite;
        objectArray29[0] = l10;
        _0L.c("\u00c3", (Object)var7_2, (Object)objectArray29, 7742491803617485829L, (long)l12);
        float f = (float)var37_21 + 2.0f - 4.0f;
        Object[] objectArray30 = new Object[10];
        objectArray30[9] = 4.0;
        objectArray30[8] = 4.0;
        objectArray30[7] = 4.0;
        objectArray30[6] = 4.0;
        objectArray30[5] = l5;
        objectArray30[4] = (double)(f + 8.0f);
        objectArray30[3] = (double)((float)((double)var38_22 + _0L.c("w", (Object)this, 7741054502110321487L, (long)l12) - 5.0 + 4.0));
        objectArray30[2] = (double)f;
        objectArray30[1] = (double)((float)((double)var38_22 + _0L.c("w", (Object)this, 7741054502110321487L, (long)l12) - 5.0 - 4.0));
        objectArray30[0] = _0L.c("x", 7741627318985147439L, (long)l12);
        _0L.c("\u00c3", (Object)var7_2, (Object)objectArray30, 7742045006408160175L, (long)l12);
        Object[] objectArray31 = new Object[10];
        objectArray31[9] = 4.0;
        objectArray31[8] = 4.0;
        objectArray31[7] = 4.0;
        objectArray31[6] = 4.0;
        objectArray31[5] = l5;
        objectArray31[4] = (double)(f + 8.0f);
        objectArray31[3] = (double)((float)((double)var38_22 + _0L.c("w", (Object)this, 7744434888202936259L, (long)l12) - 5.0 + 4.0));
        objectArray31[2] = (double)f;
        objectArray31[1] = (double)((float)((double)var38_22 + _0L.c("w", (Object)this, 7744434888202936259L, (long)l12) - 5.0 - 4.0));
        objectArray31[0] = _0L.c("x", 7741627318985147439L, (long)l12);
        _0L.c("\u00c3", (Object)var7_2, (Object)objectArray31, 7742045006408160175L, (long)l12);
    }

    private String java_lang_String_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        double d = (Double)objectArray[1];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x550A75D8CA42L;
        long l5 = l3 ^ 0x8212F2C4B5CL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = (double)_0L.c("\u00c3", (Object)_0L.c("w", (Object)this, -6566264248732408483L, (long)l2), (Object)objectArray2, -6573533843900140976L, (long)l2);
        objectArray3[1] = d;
        objectArray3[0] = l5;
        return _0L.c("H", (Object)objectArray3, -6566889588137944067L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_0L.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_0L.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

