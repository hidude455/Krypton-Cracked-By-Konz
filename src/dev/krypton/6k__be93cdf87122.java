/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1657
 *  net.minecraft.class_1723
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_490
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._3O;
import dev.krypton._3i_0;
import dev.krypton._3s;
import dev.krypton._3x;
import dev.krypton._4A;
import dev.krypton._4r;
import dev.krypton._4w;
import dev.krypton._6x_0;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1657;
import net.minecraft.class_1723;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_490;

/*
 * Renamed from dev.krypton.6k
 */
public class _6k_0
extends _6x_0 {
    private final _9E cfr_renamed_452;
    private final _92 cfr_renamed_0;
    private final _9r cfr_renamed_1;
    private final _92 cfr_renamed_3;
    private final _9r cfr_renamed_7;
    private final _9r cfr_renamed_2;
    private final _9r cfr_renamed_8;
    private final _92 cfr_renamed_4;
    int cfr_renamed_453;
    int cfr_renamed_6;
    private boolean cfr_renamed_9;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    @_3i_0
    public void cfr_renamed_5(_3O o) {
        _6k_0 k_0;
        long l2;
        long l3;
        block10: {
            block11: {
                _4w[] wArray;
                block8: {
                    block9: {
                        long l4 = l3 = b ^ 0x5C4665A42FEDL;
                        long l5 = l4 ^ 0x7C85559420A5L;
                        l2 = l4 ^ 0x588A2F38FAF2L;
                        wArray = _3s.cfr_renamed_5();
                        try {
                            try {
                                k_0 = this;
                                if (wArray != null) break block8;
                                Object[] objectArray = new Object[2];
                                objectArray[1] = l5;
                                objectArray[0] = _6k_0.c("k", 8599830963697982478L, (long)l3);
                                if (_6k_0.c("\u00ff", (Object)_6k_0.c("\u00e7", (Object)k_0, 8594708074255428478L, (long)l3), (Object)objectArray, 8601470612757572907L, (long)l3) != false) break block9;
                            }
                            catch (MatchException matchException) {
                                throw _6k_0.a(matchException);
                            }
                            return;
                        }
                        catch (MatchException matchException) {
                            throw _6k_0.a(matchException);
                        }
                    }
                    k_0 = this;
                }
                try {
                    try {
                        if (wArray != null) break block10;
                        if (_6k_0.c("\u00e7", (Object)_6k_0.c("\u00e7", (Object)k_0, 8600169413949287337L, (long)l3), 8592873439336392131L, (long)l3) != null) break block11;
                    }
                    catch (MatchException matchException) {
                        throw _6k_0.a(matchException);
                    }
                    return;
                }
                catch (MatchException matchException) {
                    throw _6k_0.a(matchException);
                }
            }
            _6k_0.c("\u00ee", (Object)this, (boolean)_6k_0.a("t", 29302, (long)(0x41C80D8F02B19AF9L ^ l3)), 8593835895715960859L, (long)l3);
            k_0 = this;
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        _6k_0.c("\u00ee", (Object)k_0, (int)_6k_0.c("\u00ff", (Object)_6k_0.c("\u00e7", (Object)this, 8601647939274259689L, (long)l3), (Object)objectArray, 8599842901559446702L, (long)l3), 8593999698764336966L, (long)l3);
    }

    @Override
    public native void cfr_renamed_5();

    public _6k_0(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x78389FCFADA6L;
        long l5 = l3 ^ 0x304ACD861000L;
        long l6 = l3 ^ 0x202AFF4F6993L;
        long l7 = l3 ^ 0x66725AC59869L;
        long l8 = l3 ^ 0x79B2C9E1771BL;
        super((int)_6k_0.a("t", 17827, (long)(0x67D43EC3789DEB28L ^ l2)), -1, (_4r)((Object)_6k_0.c("k", 3555409235867006417L, (long)l2)), l7);
        this.cfr_renamed_452 = new _9E((int)_6k_0.a("t", 8087, (long)(0x3FE0A23C9FA83104L ^ l2)), l4, (Enum)((Object)_6k_0.c("k", 3552136091133676897L, (long)l2)), _4A.class);
        this.cfr_renamed_0 = new _92((int)_6k_0.a("t", 12925, (long)(0x77F6CF458BC09CF4L ^ l2)), 0.0, l6, 20.0, 0.0, 1.0);
        this.cfr_renamed_1 = new _9r((int)_6k_0.a("t", 32482, (long)(0x526B18BEFAD0D067L ^ l2)), true, l5);
        this.cfr_renamed_3 = new _92((int)_6k_0.a("t", 11327, (long)(0x1F22CBA4FD9F02BCL ^ l2)), 1.0, l6, 9.0, 1.0, 1.0);
        this.cfr_renamed_7 = new _9r((int)_6k_0.a("t", 6901, (long)(0x2D3B2AA5F1213467L ^ l2)), false, l5);
        this.cfr_renamed_2 = new _9r((int)_6k_0.a("t", 30523, (long)(0x644E11CF34C559B5L ^ l2)), false, l5);
        this.cfr_renamed_8 = new _9r((int)_6k_0.a("t", 13682, (long)(0x3A1D80EA30B21BFDL ^ l2)), false, l5);
        this.cfr_renamed_4 = new _92((int)_6k_0.a("t", 30822, (long)(0x63BEF4D042FD6F1L ^ l2)), 0.0, l6, 20.0, 0.0, 1.0);
        _6k_0.c("\u00ee", (Object)this, (int)_6k_0.a("t", 23818, (long)(0x4F2F24EBB4C5738BL ^ l2)), 3551986878920116553L, (long)l2);
        _6k_0.c("\u00ee", (Object)this, (int)_6k_0.a("t", 23818, (long)(0x4F2F24EBB4C5738BL ^ l2)), 3551595140665153585L, (long)l2);
        _95[] nullArray = new _95[_6k_0.a("t", 13164, (long)(0x463E59CCFF5F9DFCL ^ l2))];
        nullArray[0] = _6k_0.c("\u00e7", (Object)this, 3551578116506086769L, (long)l2);
        nullArray[1] = _6k_0.c("\u00e7", (Object)this, 3553345827011427046L, (long)l2);
        nullArray[2] = _6k_0.c("\u00e7", (Object)this, 3554192810959781897L, (long)l2);
        nullArray[3] = _6k_0.c("\u00e7", (Object)this, 3553218403183729279L, (long)l2);
        nullArray[4] = _6k_0.c("\u00e7", (Object)this, 3551121541361873606L, (long)l2);
        nullArray[5] = _6k_0.c("\u00e7", (Object)this, 3553935001362397591L, (long)l2);
        nullArray[_6k_0.a("t", 24695, (long)(0x478F719D31274EE1L ^ l2))] = _6k_0.c("\u00e7", (Object)this, 3555324461055108484L, (long)l2);
        nullArray[_6k_0.a("t", 17017, (long)(0xFE46461D15A6CE8L ^ l2))] = _6k_0.c("\u00e7", (Object)this, 3552252112701351363L, (long)l2);
        Object[] objectArray = new Object[2];
        objectArray[1] = nullArray;
        objectArray[0] = l8;
        _6k_0.c("\u00ff", (Object)this, (Object)objectArray, 3552873003639093204L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                a.init(_6k_0.class, 24);
                _6k_0.b = l.a(1787263529208590925L, -8334094257896735127L, MethodHandles.lookup().lookupClass()).a(207470673656138L);
                _6k_0.j = new Object[89];
                _6k_0.k = new String[89];
                _6k_0.b();
                _6k_0.f = new HashMap<K, V>(13);
                var0 = _6k_0.b ^ 61794172234168L;
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
                var8_3 = new long[22];
                var5_4 = 0;
                var6_5 = "\u0085\u0095\u00a6\u00e9Q\u00e5\u00e7\u00b1\u0014j\u0084\u00db\u008c\u00a6\u0012\u00b0\u008dd\u0095\u00fb\u008c\u00e1\u00f7\u0088m\u00038v\u0011\u00f7\u00e5\u00c5\u00casG\u00c5\u001a\u00f84\u00e0\u00e2f1\u0099\u00e6\u00f1\u0016\u00ef\u009dX\u0083\u00dbq\r\u00df\u00f8\u0005|\u001f\u00ad\u00d49\u00ad\\qJ\u0011\u00c2TY\u0093z\u00e6\u00c0\u00996wj\u00af1\u0097\u009c\u0097Y\u0004\u00cc\u00b5\\\u00c0\u00ba\u00e2\u00f5o\u00c5\u00c0[\u00e0\u008aw\u00c4\u0002I\u00f16\u001cF\u00ad\u0096\u0018\u0092\u00cf\u00e5\u00bc\u00d0\u00abu*=\u00b7\u00847\u00daB\u00a7I\u00d2\u0083\u0096\u0007q\u0092\u0099n\u00c0\u0093\u00b6\u00cc\u0002\u008f\u00ba~\u00ff\u0004\u00bd\u00afJW:\b\u00db4k\u0004\u00fdv\u00f5J5\u00f4\u00c8";
                var7_6 = "\u0085\u0095\u00a6\u00e9Q\u00e5\u00e7\u00b1\u0014j\u0084\u00db\u008c\u00a6\u0012\u00b0\u008dd\u0095\u00fb\u008c\u00e1\u00f7\u0088m\u00038v\u0011\u00f7\u00e5\u00c5\u00casG\u00c5\u001a\u00f84\u00e0\u00e2f1\u0099\u00e6\u00f1\u0016\u00ef\u009dX\u0083\u00dbq\r\u00df\u00f8\u0005|\u001f\u00ad\u00d49\u00ad\\qJ\u0011\u00c2TY\u0093z\u00e6\u00c0\u00996wj\u00af1\u0097\u009c\u0097Y\u0004\u00cc\u00b5\\\u00c0\u00ba\u00e2\u00f5o\u00c5\u00c0[\u00e0\u008aw\u00c4\u0002I\u00f16\u001cF\u00ad\u0096\u0018\u0092\u00cf\u00e5\u00bc\u00d0\u00abu*=\u00b7\u00847\u00daB\u00a7I\u00d2\u0083\u0096\u0007q\u0092\u0099n\u00c0\u0093\u00b6\u00cc\u0002\u008f\u00ba~\u00ff\u0004\u00bd\u00afJW:\b\u00db4k\u0004\u00fdv\u00f5J5\u00f4\u00c8".length();
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
                    var6_5 = "\u008a>\u00cc\u00cd\f;\u00e8\u00f6+YhAi\u0002w\u00d2";
                    var7_6 = "\u008a>\u00cc\u00cd\f;\u00e8\u00f6+YhAi\u0002w\u00d2".length();
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
        _6k_0.d = var8_3;
        _6k_0.e = new Integer[22];
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
            case 0 -> 59;
            case 1 -> 56;
            case 2 -> 33;
            case 3 -> 52;
            case 4 -> 60;
            case 5 -> 61;
            case 6 -> 58;
            case 7 -> 28;
            case 8 -> 31;
            case 9 -> 55;
            case 10 -> 15;
            case 11 -> 63;
            case 12 -> 0;
            case 13 -> 10;
            case 14 -> 32;
            case 15 -> 53;
            case 16 -> 6;
            case 17 -> 41;
            case 18 -> 13;
            case 19 -> 20;
            case 20 -> 42;
            case 21 -> 62;
            case 22 -> 3;
            case 23 -> 34;
            case 24 -> 57;
            case 25 -> 50;
            case 26 -> 38;
            case 27 -> 16;
            case 28 -> 43;
            case 29 -> 30;
            case 30 -> 37;
            case 31 -> 2;
            case 32 -> 35;
            case 33 -> 36;
            case 34 -> 17;
            case 35 -> 29;
            case 36 -> 44;
            case 37 -> 24;
            case 38 -> 7;
            case 39 -> 19;
            case 40 -> 26;
            case 41 -> 12;
            case 42 -> 4;
            case 43 -> 1;
            case 44 -> 22;
            case 45 -> 23;
            case 46 -> 9;
            case 47 -> 46;
            case 48 -> 18;
            case 49 -> 51;
            case 50 -> 45;
            case 51 -> 27;
            case 52 -> 49;
            case 53 -> 54;
            case 54 -> 14;
            case 55 -> 5;
            case 56 -> 48;
            case 57 -> 21;
            case 58 -> 40;
            case 59 -> 47;
            case 60 -> 25;
            case 61 -> 39;
            case 62 -> 11;
            default -> 8;
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
        _6k_0.k[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = "\u000b\u0015gU@=\u000b\u0015p\tL2\u0011^p\u0017L'\u0016/$O\u001b";
        objectArray[1] = "*4C2\u00111*4Tn\u001d>0\u007fTp\u001d+7\u000e\u0006+Ea";
        objectArray[2] = "z|\u0017\u0018({z|\u0000D$t`7\u0000Z$agFP\u0007u";
        objectArray[3] = "[\u0014A?&a[\u0014Vc*nA_V}*{F.\u0004){:";
        objectArray[4] = "`&^?E\u0010`&IcI\u001fzmI}I\n}\u001c\u001b&\u0011K";
        objectArray[5] = "v`-k -ku/*%q$n";
        objectArray[6] = ".PDdG=3EF%BasG";
        objectArray[7] = "\u0003\u0000\u0007zc\\\u0003\u0000\u0010&oS\u0019K\u00108oF\u001e:Gg9";
        objectArray[8] = "Ht\u0006\u0015?\u001bUa\u0004T:G\u0015#";
        objectArray[9] = ",sh\u0019\u0014&1fjX\u0011z~n";
        objectArray[10] = "/1C }\r/1T|q\u00025zTbq\u00172\u000b\u00068&U";
        objectArray[11] = Long.TYPE;
        _6k_0.k[11] = "java/lang/Long";
        objectArray[12] = Boolean.TYPE;
        _6k_0.k[12] = "java/lang/Boolean";
        objectArray[13] = Integer.TYPE;
        _6k_0.k[13] = "java/lang/Integer";
        objectArray[14] = "IQk\u001dsw<q`\u0012b8]\u007fk\u0019fb)";
        objectArray[15] = "6idF\u0013h+|f\u0007\u00164kI";
        objectArray[16] = "de\u000f~:7\u0011E\u0004q+xpK\u000fz/\"\u0004";
        objectArray[17] = "\u0012\u001cq\"DF\u000f\tscA\u001aB8";
        objectArray[18] = "j!033Zj!'o?Upj'q?@w\u001bu*o\u0000";
        objectArray[19] = "}XU\u0006(N}XBZ$Ag\u0013BD$T`b\u0010\u001fw\u0014";
        objectArray[20] = Void.TYPE;
        _6k_0.k[20] = "java/lang/Void";
        objectArray[21] = "\u0002m<YaLwM7Vp\u0003\u0016C<]tYb";
        objectArray[22] = "\r'\u0007q\u0016cx\u0007\f~\u0007,\u0019\t\u0007u\u0003vm";
        objectArray[23] = "g)$e.,\u0012\t/j?cs\u0007$a;9\u0007";
        objectArray[24] = "TC}\u0004!oTCjX-`N\bjF-uIy?\u0019z";
        objectArray[25] = "+\\SY\u0018M+\\D\u0005\u0014B1\u0017D\u001b\u0014W6f\u0016A@\u0013";
        objectArray[26] = "A+I\u007fV!A+^#Z.[`^=Z;\\\u0011\th\u000b";
        objectArray[27] = ".`\u0005*J\u0010.`\u0012vF\u001f4+\u0012hF\n3Z@3\u0017J";
        objectArray[28] = "D/I\u0015>DY:KT;\u0018\u00148";
        objectArray[29] = "\nG~.)_\u007fgu!8\u0010\u001ei~*<Jj";
        objectArray[30] = "?\u0001Gy\u000fM4\u000eV6hO!\u0005V}S";
        objectArray[31] = ":\nE7\n\u0018$\u0002_xh\u0004#\u001f";
        objectArray[32] = "_L\u0000Gn\u0000TC\u0011\b\u000f\u000e_H\u0015R";
        objectArray[33] = "(g[b\u0017z(gL>\u001bu2,L \u001b`5]\u001d\u007fM\"";
        objectArray[34] = "&]\u0000:n\u00138U\u001au\u0012\u0007\"X\u00196";
        objectArray[35] = "}\u001f@p2(c\u0017Z?z(y\u001dBxs39.Dtx4t\u001fBt";
        objectArray[36] = "#D$O\u0003}Vd/@\u001227j$K\u0016hC";
        objectArray[37] = "\n>^(\b=Z Bee8zX\b=\u0014<];Y4\u000eb";
        objectArray[38] = " R_n\u0001K(RV.>L\"\u0017ovZP)k\u0000vO\u0011(\bQ\u007fUOD";
        objectArray[39] = "6V\u0003Z!\n:Y\u0001\u0002O3\u0018x-6\u0014z6V\u0003Z!\n:Y\u0001\u0002";
        objectArray[40] = "\"\u000e\u000b./yr]H4\u0014i/_\u001d$C8q\u0003@Hx;<TB6(h\u007fN";
        objectArray[41] = "\r\tBx\fS]\u0017^5aR6S\u001bv\u0011PKV\u0015a\u0018";
        objectArray[42] = "T\u000fmaFCZ\u001fm\n[\u0016A\u001fafiE\u0005C9\nD\u0006WFvjAKM\u007f";
        objectArray[43] = "\u001b\b\u001d%g!\u0000\u0012\u0012{\u001b0\u0012\u000b|tr.C\u001b\u001f%{4\u001dw\u0019+vf\u0016\u000eM)z?\u007f";
        objectArray[44] = "8rR/\u000fz|(\u0004qj\u007fj5\u0003/\u0006M9v^sQ\u001aa+\u000e(Pswt\u001cuj";
        objectArray[45] = "6&\u0006#.Ur|P}KPdaW#'b7$\u000buu58tFx'Vi}\\&KXh-P|v\u000ew`YD";
        objectArray[46] = "J,\"F#R\u001a2>\u000bNTq{,Kr\u0003\u0012*%Q,";
        objectArray[47] = "M:ecgH\u001d$y.\nM\u0013\\ka:\u001a\bgx#w\u001c";
        objectArray[48] = "\u007fL\u0001l2U}B_ePPA^\u000bv)\u0010~L\u00005ii,G_nhTzX\u0012gP";
        objectArray[49] = "T^=?abQP*6_%h_=s>$XY!3:\u001fX\r,+`/\u0012\u00073\u007f_";
        objectArray[50] = "Z&;29]\n8'\u007fT_a881-\u0019^*3rm`Q-?*kP\u001b' ~T";
        objectArray[51] = "$~gF*\u001a!3}\u007f?\u0017\"cj\u0013\rEo=5\u007fj\u0017=g2O \u001d\"3\r";
        objectArray[52] = "\bUJ\u0010A\u0014VY\u0017I;\u0016\\L\u001aOW$\b\rB\u0017;N_\fEJ\u0005\u000e\fK\u0001(V\u0012\u0001WB\u0015\u0000\rL^z";
        objectArray[53] = "OvRgPd\u0011z\u000f>*m\u0017~\u00063}:I)^_Cs\u001dx\u001agMc\u001d";
        objectArray[54] = "2{.vyrbe2;\u0014w\te-um66w&6-O8t86x,i}\"h\u0014";
        objectArray[55] = "\u0014!P7.\u0007D?LzC\u0000/y\t\"1W^$E'~";
        objectArray[56] = "n\u0018\u000ePz\">\u0006\u0012\u001d\u0017 UN\u0004Os e\u0004\u000eP'";
        objectArray[57] = "tC\u001afyA$]\u0006+\u0014DO\u001bCsf\u0011>F\u000fv)";
        objectArray[58] = "n\u0007\u0017gx60\u000bJ>\u0002?6\u000fC3Uhh\\\u001e_m)3\u001bH3=;<\u001f";
        objectArray[59] = "1fpgYB'9b:cD:x\u001d6\nZkh~g\u0003@5\u0004xi\u000e\u0012>},k\u0002KW";
        objectArray[60] = "lB|`yh,\u0011;$\u001b3<P 8w\u0001k\u0011|f*V<Mp8#kjR=1\u001b";
        objectArray[61] = "!t\n_\b\u0017)t\u0003\u001f7\u000f,)\u0019Cp\u001fE|\r_\u000b\u001d&-\u0004EUq!t\n_\b\u0017)t\u0003\u001f7";
        objectArray[62] = "\u0012.@x7]\u0017cZA\"P\u00143M-\u0010\u0002Yo\u0015AvT\u0019oF\"']\u00031*";
        objectArray[63] = "b/|<k6l?|Wvcw?p;D52b+g\u001310np2suj8.W";
        objectArray[64] = "\u0015/U7\u001c5E=Z3s<\u0017+Q)\u001f\u000e@f\tpsh\u0013&\r\"\u00109\u001a<SNB0\u000bk]-\u00139\u001151\u007f\u001a(F;R.\u00132\u0018W]r\u0001?A)\r!B%z7Q%\u0003:G7N)\u0014Y\u00176\u0001)KdA)L s";
        objectArray[65] = "/2\"/\u0016\u0002\u007f,>b{\u0001\u0014h{!\u000b\u0001imu6\u0002";
        objectArray[66] = "%pW[\u007fe34RW\u001c}.}DvzgC<QF w mX\\~\u001brdI\u000bpx#mSU\u001c";
        objectArray[67] = "\t+WoEw\u0014k\u0004r.r\u0003.\u001a\tK`\u0003l\u000fp\u001fb\u000f5f9Cm\njVsIr^U";
        objectArray[68] = "6 >u\u0006a80>\u001e\u001b4#02r)ggod\u001e\u0004$5i%~\u0001i/P";
        objectArray[69] = "h$(97\u000e8:4tZ\u0002S~q7*\r.{\u007f #";
        objectArray[70] = "k'\rC\nQp=\u0002\u001dvFc4lF\u0018B61\u0015\u0012\u001aNoX\\N\u0015K0h\u0016D\n\u001f\u000f";
        objectArray[71] = "2 P6(\u000bvz\u0006hM\u000e`g\u00016!<3$\\jwk<r\u0010m!\bm{\n3M";
        objectArray[72] = "\u0002\u001cRd0)\u001fK\u0013`N \u000f\u001d\u000e4\u0019qQNQX\u007f'\u001fL\u0006;..\u0005\u0012";
        objectArray[73] = "\u001e9u;b!N'iv\u000f,%a,.}qT<`+2";
        objectArray[74] = "\u001c\fnAal\u0019Atxta\u001a\u0011c\u0014F3WI5x+r\u0006Ku\tj<\u0003K\u0004";
        objectArray[75] = "V\t-\u001eb[\u0006\u00171S\u000fXm\u0017.\u001dv\u001fR\u0005%^6f]\u0002)\u00060V\u0017\b6R\u000f";
        objectArray[76] = ")S+\f rm\t}REw{\u0014z\f)E+T![E#\u007f\u0019&\u0007&rv\u0003xk?o|Qj\u000b:\"fh";
        objectArray[77] = "\u0014kVM[A\u000fqY\u0013'D\u0011fZ-\u0016V\u0001([NG_\u001bv7";
        objectArray[78] = "\u001d\u0015'-Ji\u0006\u000f(s6v\u0002'#5JfyZ+.R(I\u0010!1\u0006\u0017";
        objectArray[79] = "R0! u\u0006Arl&\u000b\f;6u0rD\u0004$~s2=\u000b#r+4\rA)m\u007f\u000b";
        objectArray[80] = "BA\u0012\u001aq\u0007\u0002@\u0014\u0010\u000b\u0000\u0019C\u0014\u001f\\^B\u001e@s1\u0010\u0018\u0014\u0001\u0002p^\u001d\u0014";
        objectArray[81] = ";{(\u0013evewuJ\u001f\u007fcs|GH(=#%+\"\u007f>!z\u0015b,ye";
        objectArray[82] = "?dE\u001aRW=j\u001b\u00130R\u00017NO\b\u0011fiB\u0012Q";
        objectArray[83] = "##\u001a5]\u007fs=\u0006x0x\u0018=\u00196I;'/\u0012u\tB),\fu\\!x%\u0016+0";
        objectArray[84] = "J\u001dU\u001bhvV\u000e\u0012G\u0001Po'fb]\u001bJ\u001dU\u001bhvV\u000e\u0012G";
        objectArray[85] = "b5a+\u0012!2+}f\u007f!Yo8%\u000f\"$j62\u0006";
        objectArray[86] = "R+\u0007r\u0015%\u000fg\u0002=xilm\n\u007f\u0001-S\u007f\u0001<AT]|\u001f<\u00147\fu\u0005bx";
        objectArray[87] = ">ERb@k2JP:.\\\u0012cm\u0018v\u001b>ERb@k2JP:";
        Object[] objectArray2 = objectArray;
        objectArray[88] = "zjX?Ict,X%pbv(\u00052\u001cP\"kXjO\u0007z-\u0005e\u0001ek+Tjp";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e7' || c == '\u00ee' || c == 'k' || c == 'V') {
                field = _6k_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e7' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ee' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'k' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _6k_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ff' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00cc' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _6k_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6k" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = _6k_0.e(l2, l3);
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
                clazz3 = _6k_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _6k_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _6k_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _6k_0.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _6k_0.f(2277735619165865L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _6k_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _6k_0.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _6k_0.f(2277735619165865L, 0L);
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
            int n = _6k_0.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _6k_0.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _6k_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _6k_0.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _6k_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _6k_0.d(classArray2[j], string, clazz2, n, classArray);
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
        int n2 = _6k_0.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x1FC1;
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
                throw new RuntimeException("dev/krypton/6k", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _6k_0.e[n2] = n3;
        }
        return e[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6k" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field g(long l2, long l3) {
        int n = _6k_0.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _6k_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _6k_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _6k_0.c(clazz3, string2, clazz2)) != null) {
                    _6k_0.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _6k_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _6k_0.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _6k_0.f(2277735619165865L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * WARNING - void declaration
     */
    private int int_0(Object[] objectArray) {
        int n;
        block12: {
            block13: {
                CallSite callSite;
                block11: {
                    CallSite callSite2;
                    long l2;
                    block9: {
                        void var8_8;
                        l2 = (Long)objectArray[0];
                        l2 = b ^ l2;
                        CallSite callSite3 = _6k_0.c("\u00ff", (Object)_6k_0.c("\u00e7", (Object)_6k_0.c("\u00e7", (Object)this, -207241754585800209L, (long)l2), -214397201925771387L, (long)l2), -214819941462988385L, (long)l2);
                        Random random = new Random();
                        ArrayList arrayList = new ArrayList();
                        _4w[] wArray = _3s.cfr_renamed_5();
                        CallSite callSite4 = _6k_0.a("t", 18950, (long)(0x2327F3DBDE9E28C7L ^ l2));
                        while (var8_8 < _6k_0.a("t", 7591, (long)(0xE0C770601017F6CL ^ l2))) {
                            block10: {
                                try {
                                    try {
                                        callSite2 = _6k_0.c("\u00ff", (Object)((class_1799)_6k_0.c("\u00ff", (Object)_6k_0.c("\u00ff", (Object)callSite3, -216172166007639356L, (long)l2), (int)var8_8, -214547243040574625L, (long)l2)), -208927553366527101L, (long)l2);
                                        if (wArray != null) break block9;
                                        if (callSite2 != _6k_0.c("k", -207443181066199768L, (long)l2)) break block10;
                                    }
                                    catch (MatchException matchException) {
                                        throw _6k_0.a(matchException);
                                    }
                                    _6k_0.c("\u00ff", arrayList, (Object)_6k_0.c("\u00cc", (int)var8_8, -214916180121419463L, (long)l2), -208705486109595560L, (long)l2);
                                }
                                catch (MatchException matchException) {
                                    throw _6k_0.a(matchException);
                                }
                            }
                            ++var8_8;
                            if (wArray == null) continue;
                        }
                        try {
                            try {
                                callSite = _6k_0.c("\u00ff", arrayList, -209216484054855374L, (long)l2);
                                if (l2 <= 0L) break block11;
                                if (wArray != null) break block12;
                                if (callSite != false) break block13;
                            }
                            catch (MatchException matchException) {
                                throw _6k_0.a(matchException);
                            }
                            callSite2 = _6k_0.c("\u00ff", arrayList, (int)_6k_0.c("\u00ff", (Object)random, (int)_6k_0.c("\u00ff", arrayList, -209313195115257009L, (long)l2), -208370059429087329L, (long)l2), -215618824156111732L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw _6k_0.a(matchException);
                        }
                    }
                    callSite = _6k_0.c("\u00ff", (Object)((Integer)((Object)callSite2)), -215416118674842566L, (long)l2);
                }
                return (int)callSite;
            }
            n = -1;
        }
        return n;
    }

    public boolean boolean_6(Object[] objectArray) {
        boolean bl;
        block28: {
            block27: {
                CallSite callSite;
                _4w[] wArray;
                long l2;
                block26: {
                    _6k_0 k_0;
                    block20: {
                        block21: {
                            boolean bl2;
                            block25: {
                                block23: {
                                    CallSite callSite2;
                                    block24: {
                                        CallSite callSite3;
                                        CallSite callSite4;
                                        block22: {
                                            l2 = (Long)objectArray[0];
                                            long l3 = l2 = b ^ l2;
                                            long l4 = l3 ^ 0x640C3A65D1C8L;
                                            long l5 = l3 ^ 0x3B8E362691F8L;
                                            wArray = _3s.cfr_renamed_5();
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                k_0 = this;
                                                                if (wArray != null) break block20;
                                                                if (_6k_0.c("\u00ff", (Object)_6k_0.c("\u00e7", (Object)k_0, 6658025660064476476L, (long)l2), (long)l5, 6663967614986251859L, (long)l2) == false) break block21;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _6k_0.a(matchException);
                                                            }
                                                            Object[] objectArray2 = new Object[1];
                                                            objectArray2[0] = l4;
                                                            callSite4 = _6k_0.c("\u00ff", (Object)_6k_0.c("\u00ff", (Object)_6k_0.c("\u00ff", (Object)_6k_0.c("\u00e7", (Object)_6k_0.c("\u00e7", (Object)this, 6657388984152178835L, (long)l2), 6663700564873170681L, (long)l2), 6663278904177330403L, (long)l2), (int)(_6k_0.c("\u00ff", (Object)_6k_0.c("\u00e7", (Object)this, 6663807682487580490L, (long)l2), (Object)objectArray2, 6657159211031504788L, (long)l2) - true), 6657550375526423864L, (long)l2), 6657951673748443903L, (long)l2);
                                                            callSite3 = _6k_0.c("k", 6657293576785722452L, (long)l2);
                                                            if (l2 < 0L || wArray != null) break block22;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _6k_0.a(matchException);
                                                        }
                                                        if (callSite4 != callSite3) break block23;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _6k_0.a(matchException);
                                                    }
                                                    callSite2 = _6k_0.c("\u00e7", (Object)this, 6657388984152178835L, (long)l2);
                                                    if (l2 < 0L || wArray != null) break block24;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _6k_0.a(matchException);
                                                }
                                                callSite4 = _6k_0.c("\u00ff", (Object)_6k_0.c("\u00ff", (Object)_6k_0.c("\u00e7", (Object)callSite2, 6663700564873170681L, (long)l2), 6658127891690277234L, (long)l2), 6657951673748443903L, (long)l2);
                                                callSite3 = _6k_0.c("k", 6657293576785722452L, (long)l2);
                                            }
                                            catch (MatchException matchException) {
                                                throw _6k_0.a(matchException);
                                            }
                                        }
                                        try {
                                            if (callSite4 != callSite3) break block23;
                                            callSite2 = _6k_0.c("\u00e7", (Object)this, 6657388984152178835L, (long)l2);
                                        }
                                        catch (MatchException matchException) {
                                            throw _6k_0.a(matchException);
                                        }
                                    }
                                    try {
                                        bl2 = _6k_0.c("\u00e7", (Object)callSite2, 6657192342259319369L, (long)l2) instanceof _3x;
                                        if (wArray != null) break block25;
                                        if (!bl2) break block23;
                                    }
                                    catch (MatchException matchException) {
                                        throw _6k_0.a(matchException);
                                    }
                                    bl2 = true;
                                    break block25;
                                }
                                bl2 = false;
                            }
                            return bl2;
                        }
                        k_0 = this;
                    }
                    try {
                        try {
                            callSite = _6k_0.c("\u00e7", (Object)k_0, 6657388984152178835L, (long)l2);
                            if (l2 <= 0L || wArray != null) break block26;
                            if (_6k_0.c("\u00ff", (Object)_6k_0.c("\u00ff", (Object)_6k_0.c("\u00e7", (Object)callSite, 6663700564873170681L, (long)l2), 6658127891690277234L, (long)l2), 6657951673748443903L, (long)l2) != _6k_0.c("k", 6657293576785722452L, (long)l2)) break block27;
                        }
                        catch (MatchException matchException) {
                            throw _6k_0.a(matchException);
                        }
                        callSite = _6k_0.c("\u00e7", (Object)this, 6657388984152178835L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw _6k_0.a(matchException);
                    }
                }
                try {
                    bl = _6k_0.c("\u00e7", (Object)callSite, 6657192342259319369L, (long)l2) instanceof _3x;
                    if (wArray != null) break block28;
                    if (!bl) break block27;
                }
                catch (MatchException matchException) {
                    throw _6k_0.a(matchException);
                }
                bl = true;
                break block28;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public native void cfr_renamed_2();

    @_3i_0
    public void cfr_renamed_3(_9o o) {
        block99: {
            _6k_0 k_0;
            long l2;
            long l3;
            block101: {
                CallSite callSite;
                block100: {
                    _4w[] wArray;
                    block98: {
                        long l4;
                        block94: {
                            long l5;
                            block95: {
                                CallSite callSite2;
                                CallSite callSite3;
                                block96: {
                                    long l6;
                                    block93: {
                                        _6k_0 k_02;
                                        block91: {
                                            block92: {
                                                block90: {
                                                    CallSite callSite4;
                                                    block88: {
                                                        block89: {
                                                            _6k_0 k_03;
                                                            block87: {
                                                                Object object;
                                                                block86: {
                                                                    int n;
                                                                    block84: {
                                                                        block85: {
                                                                            block82: {
                                                                                block83: {
                                                                                    block80: {
                                                                                        block81: {
                                                                                            block78: {
                                                                                                long l7;
                                                                                                block79: {
                                                                                                    long l8 = l3 = b ^ 0x7694DBD3C1E7L;
                                                                                                    l6 = l8 ^ 0x607C4C053CECL;
                                                                                                    long l9 = l8 ^ 0x5657EBE3CEAFL;
                                                                                                    l2 = l8 ^ 0x7258914F14F8L;
                                                                                                    l5 = l8 ^ 0x16C694B09D90L;
                                                                                                    l4 = l8 ^ 0x2DDA9D0C54C8L;
                                                                                                    l7 = l8 ^ 0x6C847D18772CL;
                                                                                                    wArray = _3s.cfr_renamed_5();
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                Object[] objectArray = new Object[2];
                                                                                                                objectArray[1] = l9;
                                                                                                                objectArray[0] = _6k_0.c("k", -7398685898052177404L, (long)l3);
                                                                                                                object = _6k_0.c("\u00ff", (Object)_6k_0.c("\u00e7", (Object)this, -7400360153035651724L, (long)l3), (Object)objectArray, -7398106724074814687L, (long)l3);
                                                                                                                if (wArray != null) break block78;
                                                                                                                if (object == false) break block79;
                                                                                                            }
                                                                                                            catch (MatchException matchException) {
                                                                                                                throw _6k_0.a(matchException);
                                                                                                            }
                                                                                                            object = _6k_0.c("\u00e7", (Object)this, -7401284570054560239L, (long)l3);
                                                                                                            if (wArray != null) break block78;
                                                                                                        }
                                                                                                        catch (MatchException matchException) {
                                                                                                            throw _6k_0.a(matchException);
                                                                                                        }
                                                                                                        if (object != false) break block79;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw _6k_0.a(matchException);
                                                                                                    }
                                                                                                    return;
                                                                                                }
                                                                                                Object[] objectArray = new Object[1];
                                                                                                objectArray[0] = l7;
                                                                                                object = _6k_0.c("\u00ff", (Object)this, (Object)objectArray, -7400603880672812999L, (long)l3);
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (wArray != null) break block80;
                                                                                                            if (object == false) break block81;
                                                                                                        }
                                                                                                        catch (MatchException matchException) {
                                                                                                            throw _6k_0.a(matchException);
                                                                                                        }
                                                                                                        object = _6k_0.c("\u00ff", (Object)_6k_0.c("\u00e7", (Object)this, -7398831316746252927L, (long)l3), (long)l4, -7400754038270284957L, (long)l3);
                                                                                                        if (wArray != null) break block80;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw _6k_0.a(matchException);
                                                                                                    }
                                                                                                    if (object == false) break block81;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw _6k_0.a(matchException);
                                                                                                }
                                                                                                _6k_0.c("\u00ff", (Object)_6k_0.c("\u00e7", (Object)this, -7398329697507506781L, (long)l3), (Object)((Object)new _3x((class_1657)_6k_0.c("\u00e7", (Object)_6k_0.c("\u00e7", (Object)this, -7398329697507506781L, (long)l3), -7401052395502892087L, (long)l3))), -7400978200628581132L, (long)l3);
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw _6k_0.a(matchException);
                                                                                            }
                                                                                        }
                                                                                        object = _6k_0.c("\u00e7", (Object)_6k_0.c("\u00e7", (Object)this, -7398329697507506781L, (long)l3), -7398552731902048391L, (long)l3) instanceof class_490;
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    if (wArray != null) break block82;
                                                                                                    if (object != false) break block83;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw _6k_0.a(matchException);
                                                                                                }
                                                                                                object = _6k_0.c("\u00e7", (Object)_6k_0.c("\u00e7", (Object)this, -7398329697507506781L, (long)l3), -7398552731902048391L, (long)l3) instanceof _3x;
                                                                                                if (wArray != null) break block82;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw _6k_0.a(matchException);
                                                                                            }
                                                                                            if (object != false) break block83;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw _6k_0.a(matchException);
                                                                                        }
                                                                                        _6k_0.c("\u00ee", (Object)this, (int)_6k_0.a("t", 23818, (long)(0x4F2F3A3722FADB8EL ^ l3)), -7399924482181275316L, (long)l3);
                                                                                        _6k_0.c("\u00ee", (Object)this, (int)_6k_0.a("t", 23818, (long)(0x4F2F3A3722FADB8EL ^ l3)), -7400309009587752908L, (long)l3);
                                                                                        return;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw _6k_0.a(matchException);
                                                                                    }
                                                                                }
                                                                                object = _6k_0.c("\u00e7", (Object)this, -7399924482181275316L, (long)l3);
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    n = -1;
                                                                                    if (wArray != null) break block84;
                                                                                    if (object != n) break block85;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw _6k_0.a(matchException);
                                                                                }
                                                                                Object[] objectArray = new Object[1];
                                                                                objectArray[0] = l2;
                                                                                _6k_0.c("\u00ee", (Object)this, (int)_6k_0.c("\u00ff", (Object)_6k_0.c("\u00e7", (Object)this, -7397976127205125405L, (long)l3), (Object)objectArray, -7398590255572819292L, (long)l3), -7399924482181275316L, (long)l3);
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw _6k_0.a(matchException);
                                                                            }
                                                                        }
                                                                        try {
                                                                            object = _6k_0.c("\u00e7", (Object)this, -7400309009587752908L, (long)l3);
                                                                            if (wArray != null) break block86;
                                                                            n = -1;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw _6k_0.a(matchException);
                                                                        }
                                                                    }
                                                                    try {
                                                                        if (object == n) {
                                                                            Object[] objectArray = new Object[1];
                                                                            objectArray[0] = l2;
                                                                            _6k_0.c("\u00ee", (Object)this, (int)_6k_0.c("\u00ff", (Object)_6k_0.c("\u00e7", (Object)this, -7401317832097641018L, (long)l3), (Object)objectArray, -7398590255572819292L, (long)l3), -7400309009587752908L, (long)l3);
                                                                        }
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw _6k_0.a(matchException);
                                                                    }
                                                                    try {
                                                                        k_03 = this;
                                                                        if (wArray != null) break block87;
                                                                        object = _6k_0.c("\u00e7", (Object)k_03, -7399924482181275316L, (long)l3);
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw _6k_0.a(matchException);
                                                                    }
                                                                }
                                                                try {
                                                                    if (object > 0) {
                                                                        _6k_0 k_04 = this;
                                                                        _6k_0.c("\u00ee", (Object)k_04, (int)(_6k_0.c("\u00e7", (Object)k_04, -7399924482181275316L, (long)l3) - true), -7399924482181275316L, (long)l3);
                                                                    }
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw _6k_0.a(matchException);
                                                                }
                                                                k_03 = this;
                                                            }
                                                            callSite3 = _6k_0.c("\u00ff", (Object)_6k_0.c("\u00e7", (Object)_6k_0.c("\u00e7", (Object)k_03, -7398329697507506781L, (long)l3), -7401052395502892087L, (long)l3), -7401474085459145261L, (long)l3);
                                                            try {
                                                                try {
                                                                    callSite4 = _6k_0.c("\u00ff", (Object)_6k_0.c("\u00e7", (Object)this, -7400257621684184381L, (long)l3), (long)l4, -7400754038270284957L, (long)l3);
                                                                    if (wArray != null) break block88;
                                                                    if (callSite4 == false) break block89;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw _6k_0.a(matchException);
                                                                }
                                                                Object[] objectArray = new Object[1];
                                                                objectArray[0] = l2;
                                                                _6k_0.c("\u00ff", (Object)callSite3, (int)(_6k_0.c("\u00ff", (Object)_6k_0.c("\u00e7", (Object)this, -7400945174813461894L, (long)l3), (Object)objectArray, -7398590255572819292L, (long)l3) - true), -7400531966277947857L, (long)l3);
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _6k_0.a(matchException);
                                                            }
                                                        }
                                                        try {
                                                            k_02 = this;
                                                            if (wArray != null) break block90;
                                                            callSite4 = _6k_0.c("\u00e7", (Object)k_02, -7399924482181275316L, (long)l3);
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _6k_0.a(matchException);
                                                        }
                                                    }
                                                    if (callSite4 > 0) break block99;
                                                    k_02 = this;
                                                }
                                                try {
                                                    if (wArray != null) break block91;
                                                    if (_6k_0.c("\u00ff", (Object)_6k_0.c("\u00ff", (Object)_6k_0.c("\u00e7", (Object)_6k_0.c("\u00e7", (Object)k_02, -7398329697507506781L, (long)l3), -7401052395502892087L, (long)l3), -7397590793118348222L, (long)l3), -7397763197134661681L, (long)l3) == _6k_0.c("k", -7398460460973442716L, (long)l3)) break block92;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _6k_0.a(matchException);
                                                }
                                                Object[] objectArray = new Object[1];
                                                objectArray[0] = l6;
                                                CallSite callSite5 = _6k_0.c("\u00ff", (Object)this, (Object)objectArray, -7400871672071713516L, (long)l3);
                                                try {
                                                    try {
                                                        callSite = callSite5;
                                                        if (wArray != null) break block93;
                                                        if (callSite == -1) break block92;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _6k_0.a(matchException);
                                                    }
                                                    _6k_0.c("\u00ff", (Object)_6k_0.c("\u00e7", (Object)_6k_0.c("\u00e7", (Object)this, -7398329697507506781L, (long)l3), -7401161932638993088L, (long)l3), (int)_6k_0.c("\u00e7", (Object)((class_1723)_6k_0.c("\u00ff", (Object)((class_490)_6k_0.c("\u00e7", (Object)_6k_0.c("\u00e7", (Object)this, -7398329697507506781L, (long)l3), -7398552731902048391L, (long)l3)), -7399035305857219959L, (long)l3)), -7397930734383678975L, (long)l3), (int)callSite5, (int)_6k_0.a("t", 3518, (long)(0x75936D02FC868B31L ^ l3)), (Object)_6k_0.c("k", -7400177420359896701L, (long)l3), (Object)_6k_0.c("\u00e7", (Object)_6k_0.c("\u00e7", (Object)this, -7398329697507506781L, (long)l3), -7401052395502892087L, (long)l3), -7397348716265286601L, (long)l3);
                                                    _6k_0.c("\u00ee", (Object)this, (boolean)_6k_0.a("t", 4794, (long)(0x126F9276C7281439L ^ l3)), -7401284570054560239L, (long)l3);
                                                    return;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _6k_0.a(matchException);
                                                }
                                            }
                                            k_02 = this;
                                        }
                                        callSite = _6k_0.c("\u00ff", (Object)_6k_0.c("\u00e7", (Object)k_02, -7397697457955608564L, (long)l3), (long)l4, -7400754038270284957L, (long)l3);
                                    }
                                    try {
                                        if (wArray != null) break block94;
                                        if (callSite == false) break block95;
                                    }
                                    catch (MatchException matchException) {
                                        throw _6k_0.a(matchException);
                                    }
                                    CallSite callSite6 = _6k_0.c("\u00ff", (Object)_6k_0.c("\u00e7", (Object)_6k_0.c("\u00e7", (Object)this, -7398329697507506781L, (long)l3), -7401052395502892087L, (long)l3), -7399989476050537007L, (long)l3);
                                    try {
                                        block97: {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            callSite2 = _6k_0.c("\u00ff", (Object)callSite6, -7400678704494533154L, (long)l3);
                                                            if (wArray != null) break block96;
                                                            if (callSite2 != false) break block97;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _6k_0.a(matchException);
                                                        }
                                                        callSite = _6k_0.c("\u00ff", (Object)_6k_0.c("\u00e7", (Object)this, -7397439665521307246L, (long)l3), (long)l4, -7400754038270284957L, (long)l3);
                                                        if (wArray != null) break block94;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _6k_0.a(matchException);
                                                    }
                                                    if (callSite == false) break block95;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _6k_0.a(matchException);
                                                }
                                                if (_6k_0.c("\u00ff", (Object)callSite6, -7397763197134661681L, (long)l3) == _6k_0.c("k", -7398460460973442716L, (long)l3)) break block95;
                                            }
                                            catch (MatchException matchException) {
                                                throw _6k_0.a(matchException);
                                            }
                                        }
                                        Object[] objectArray = new Object[1];
                                        objectArray[0] = l6;
                                        callSite2 = _6k_0.c("\u00ff", (Object)this, (Object)objectArray, -7400871672071713516L, (long)l3);
                                    }
                                    catch (MatchException matchException) {
                                        throw _6k_0.a(matchException);
                                    }
                                }
                                CallSite callSite7 = callSite2;
                                try {
                                    try {
                                        callSite = callSite7;
                                        if (wArray != null) break block94;
                                        if (callSite == -1) break block95;
                                    }
                                    catch (MatchException matchException) {
                                        throw _6k_0.a(matchException);
                                    }
                                    _6k_0.c("\u00ff", (Object)_6k_0.c("\u00e7", (Object)_6k_0.c("\u00e7", (Object)this, -7398329697507506781L, (long)l3), -7401161932638993088L, (long)l3), (int)_6k_0.c("\u00e7", (Object)((class_1723)_6k_0.c("\u00ff", (Object)((class_490)_6k_0.c("\u00e7", (Object)_6k_0.c("\u00e7", (Object)this, -7398329697507506781L, (long)l3), -7398552731902048391L, (long)l3)), -7399035305857219959L, (long)l3)), -7397930734383678975L, (long)l3), (int)callSite7, (int)_6k_0.c("\u00ff", (Object)callSite3, -7397514700255649705L, (long)l3), (Object)_6k_0.c("k", -7400177420359896701L, (long)l3), (Object)_6k_0.c("\u00e7", (Object)_6k_0.c("\u00e7", (Object)this, -7398329697507506781L, (long)l3), -7401052395502892087L, (long)l3), -7397348716265286601L, (long)l3);
                                    return;
                                }
                                catch (MatchException matchException) {
                                    throw _6k_0.a(matchException);
                                }
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l5;
                            callSite = _6k_0.c("\u00ff", (Object)this, (Object)objectArray, -7397823506195462824L, (long)l3);
                        }
                        try {
                            try {
                                if (wArray != null) break block98;
                                if (callSite == false) break block99;
                            }
                            catch (MatchException matchException) {
                                throw _6k_0.a(matchException);
                            }
                            callSite = _6k_0.c("\u00ff", (Object)_6k_0.c("\u00e7", (Object)this, -7398831316746252927L, (long)l3), (long)l4, -7400754038270284957L, (long)l3);
                        }
                        catch (MatchException matchException) {
                            throw _6k_0.a(matchException);
                        }
                    }
                    try {
                        try {
                            try {
                                if (wArray != null) break block100;
                                if (callSite == false) break block99;
                            }
                            catch (MatchException matchException) {
                                throw _6k_0.a(matchException);
                            }
                            k_0 = this;
                            if (wArray != null) break block101;
                        }
                        catch (MatchException matchException) {
                            throw _6k_0.a(matchException);
                        }
                        callSite = _6k_0.c("\u00e7", (Object)k_0, -7400309009587752908L, (long)l3);
                    }
                    catch (MatchException matchException) {
                        throw _6k_0.a(matchException);
                    }
                }
                try {
                    if (callSite != false) {
                        _6k_0 k_05 = this;
                        _6k_0.c("\u00ee", (Object)k_05, (int)(_6k_0.c("\u00e7", (Object)k_05, -7400309009587752908L, (long)l3) - true), -7400309009587752908L, (long)l3);
                        return;
                    }
                }
                catch (MatchException matchException) {
                    throw _6k_0.a(matchException);
                }
                _6k_0.c("\u00ff", (Object)_6k_0.c("\u00e7", (Object)_6k_0.c("\u00e7", (Object)this, -7398329697507506781L, (long)l3), -7398552731902048391L, (long)l3), -7401549804811759939L, (long)l3);
                k_0 = this;
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l2;
            _6k_0.c("\u00ee", (Object)k_0, (int)_6k_0.c("\u00ff", (Object)_6k_0.c("\u00e7", (Object)this, -7401317832097641018L, (long)l3), (Object)objectArray, -7398590255572819292L, (long)l3), -7400309009587752908L, (long)l3);
        }
    }

    /*
     * WARNING - void declaration
     */
    private int int_2(Object[] objectArray) {
        Object object;
        block7: {
            void var8_8;
            Predicate predicate = (Predicate)objectArray[0];
            long l2 = (Long)objectArray[1];
            l2 = b ^ l2;
            CallSite callSite = _6k_0.c("\u00ff", (Object)_6k_0.c("\u00e7", (Object)_6k_0.c("\u00e7", (Object)this, 3841840636195711392L, (long)l2), 3839602277903214538L, (long)l2), 3840305399617970640L, (long)l2);
            int n = 0;
            _4w[] wArray = _3s.cfr_renamed_5();
            CallSite callSite2 = _6k_0.a("t", 3307, (long)(0x16C395D2CCF2A669L ^ l2));
            while (var8_8 < _6k_0.a("t", 22175, (long)(0x3311DD440DD07C14L ^ l2))) {
                _4w[] wArray2;
                block5: {
                    block6: {
                        block8: {
                            CallSite callSite3 = _6k_0.c("\u00ff", (Object)callSite, (int)var8_8, 3843654593693299723L, (long)l2);
                            try {
                                try {
                                    wArray2 = wArray;
                                    if (l2 <= 0L) break block5;
                                    if (wArray2 != null) break block6;
                                    object = _6k_0.c("\u00ff", (Object)predicate, (Object)_6k_0.c("\u00ff", (Object)callSite3, 3843525909933472716L, (long)l2), 3842891631305904746L, (long)l2);
                                    if (wArray != null) break block7;
                                }
                                catch (MatchException matchException) {
                                    throw _6k_0.a(matchException);
                                }
                                if (object == 0) break block8;
                            }
                            catch (MatchException matchException) {
                                throw _6k_0.a(matchException);
                            }
                            n += _6k_0.c("\u00ff", (Object)callSite3, 3840434590350548338L, (long)l2);
                        }
                        ++var8_8;
                    }
                    wArray2 = wArray;
                }
                if (wArray2 == null) continue;
            }
            object = n;
        }
        return object;
    }

    private static boolean cfr_renamed_9(long l2, class_1792 class_17922) {
        boolean bl;
        l2 = b ^ l2;
        try {
            bl = class_17922 == _6k_0.c("k", -1416606924721173408L, (long)l2);
        }
        catch (MatchException matchException) {
            throw _6k_0.a(matchException);
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean boolean_7(Object[] objectArray) {
        _4w[] wArray;
        Object object;
        block33: {
            _4w[] wArray2;
            block34: {
                CallSite callSite;
                long l2;
                long l3;
                long l4;
                block32: {
                    _6k_0 k_0;
                    block26: {
                        block27: {
                            _4w[] wArray3;
                            Object object2;
                            block30: {
                                block31: {
                                    CallSite callSite2;
                                    block28: {
                                        l4 = (Long)objectArray[0];
                                        long l5 = l4 = b ^ l4;
                                        long l6 = l5 ^ 0x1E4ED3CD3B74L;
                                        l3 = l5 ^ 0x3C6D465D0228L;
                                        l2 = l5 ^ 0x4366C9D4DB2FL;
                                        long l7 = l5 ^ 0x41CCDF8E7B44L;
                                        wArray2 = _3s.cfr_renamed_5();
                                        try {
                                            block29: {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    k_0 = this;
                                                                    if (wArray2 != null) break block26;
                                                                    if (_6k_0.c("\u00ff", (Object)_6k_0.c("\u00e7", (Object)k_0, -5270771440105502848L, (long)l4), (long)l7, -5276158828304497425L, (long)l4) == false) break block27;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw _6k_0.a(matchException);
                                                                }
                                                                callSite2 = _6k_0.c("\u00e7", (Object)this, -5269292649477199313L, (long)l4);
                                                                if (wArray2 != null) break block28;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _6k_0.a(matchException);
                                                            }
                                                            if (l4 <= 0L) break block28;
                                                            if (_6k_0.c("\u00ff", (Object)_6k_0.c("\u00ff", (Object)_6k_0.c("\u00e7", (Object)callSite2, -5276457237009849275L, (long)l4), -5270875913696238642L, (long)l4), -5270986693521524669L, (long)l4) != _6k_0.c("k", -5269476002737318168L, (long)l4)) break block29;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _6k_0.a(matchException);
                                                        }
                                                        callSite2 = _6k_0.c("\u00e7", (Object)this, -5269292649477199313L, (long)l4);
                                                        if (l4 <= 0L || wArray2 != null) break block28;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _6k_0.a(matchException);
                                                    }
                                                    Object[] objectArray2 = new Object[1];
                                                    objectArray2[0] = l6;
                                                    if (_6k_0.c("\u00ff", (Object)_6k_0.c("\u00ff", (Object)_6k_0.c("\u00ff", (Object)_6k_0.c("\u00e7", (Object)callSite2, -5276457237009849275L, (long)l4), -5276878875426495905L, (long)l4), (int)(_6k_0.c("\u00ff", (Object)_6k_0.c("\u00e7", (Object)this, -5276279752786174474L, (long)l4), (Object)objectArray2, -5269632355199857368L, (long)l4) - true), -5271423188743637116L, (long)l4), -5270986693521524669L, (long)l4) == _6k_0.c("k", -5269476002737318168L, (long)l4)) return false;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _6k_0.a(matchException);
                                                }
                                            }
                                            callSite2 = _6k_0.c("\u00e7", (Object)this, -5269292649477199313L, (long)l4);
                                        }
                                        catch (MatchException matchException) {
                                            throw _6k_0.a(matchException);
                                        }
                                    }
                                    try {
                                        try {
                                            object2 = _6k_0.c("\u00e7", (Object)callSite2, -5269383727511131915L, (long)l4) instanceof _3x;
                                            wArray3 = wArray2;
                                            if (l4 <= 0L) break block30;
                                            if (wArray3 != null) break block31;
                                            if (object2) return false;
                                        }
                                        catch (MatchException matchException) {
                                            throw _6k_0.a(matchException);
                                        }
                                        Object[] objectArray3 = new Object[2];
                                        objectArray3[1] = l2;
                                        objectArray3[0] = arg_0 -> _6k_0.cfr_renamed_9(l3, arg_0);
                                        object2 = _6k_0.c("\u00ff", (Object)this, (Object)objectArray3, -5269274521640491004L, (long)l4);
                                    }
                                    catch (MatchException matchException) {
                                        throw _6k_0.a(matchException);
                                    }
                                }
                                wArray3 = wArray2;
                            }
                            if (wArray3 != null) return object2;
                            if (!object2) return false;
                            return true;
                        }
                        k_0 = this;
                    }
                    try {
                        try {
                            callSite = _6k_0.c("\u00e7", (Object)k_0, -5269292649477199313L, (long)l4);
                            if (l4 <= 0L || wArray2 != null) break block32;
                            if (_6k_0.c("\u00ff", (Object)_6k_0.c("\u00ff", (Object)_6k_0.c("\u00e7", (Object)callSite, -5276457237009849275L, (long)l4), -5270875913696238642L, (long)l4), -5270986693521524669L, (long)l4) == _6k_0.c("k", -5269476002737318168L, (long)l4)) return false;
                        }
                        catch (MatchException matchException) {
                            throw _6k_0.a(matchException);
                        }
                        callSite = _6k_0.c("\u00e7", (Object)this, -5269292649477199313L, (long)l4);
                    }
                    catch (MatchException matchException) {
                        throw _6k_0.a(matchException);
                    }
                }
                try {
                    try {
                        object = _6k_0.c("\u00e7", (Object)callSite, -5269383727511131915L, (long)l4) instanceof _3x;
                        wArray = wArray2;
                        if (l4 < 0L) break block33;
                        if (wArray != null) break block34;
                        if (object) return false;
                    }
                    catch (MatchException matchException) {
                        throw _6k_0.a(matchException);
                    }
                    Object[] objectArray4 = new Object[2];
                    objectArray4[1] = l2;
                    objectArray4[0] = arg_0 -> _6k_0.cfr_renamed_9(l3, arg_0);
                    object = _6k_0.c("\u00ff", (Object)this, (Object)objectArray4, -5269274521640491004L, (long)l4);
                }
                catch (MatchException matchException) {
                    throw _6k_0.a(matchException);
                }
            }
            wArray = wArray2;
        }
        if (wArray != null) return object;
        if (!object) return false;
        return true;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_6k_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_6k_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

