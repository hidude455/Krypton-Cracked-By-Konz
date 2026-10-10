/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1799
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._3i_0;
import dev.krypton._3s;
import dev.krypton._4r;
import dev.krypton._4w;
import dev.krypton._6C;
import dev.krypton._6x_0;
import dev.krypton._92;
import dev.krypton._95;
import dev.krypton._9o;
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
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1799;

public class _5G
extends _6x_0 {
    private final _9r cfr_renamed_1;
    private final _9r cfr_renamed_6;
    private final _9r cfr_renamed_9;
    private final _9r cfr_renamed_2;
    private final _9r cfr_renamed_7;
    private final _92 cfr_renamed_4;
    private boolean cfr_renamed_8;
    private int cfr_renamed_3;
    private int cfr_renamed_0;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    private void cfr_renamed_276(Object[] objectArray) {
        CallSite callSite;
        long l2;
        long l3;
        long l4;
        block4: {
            block5: {
                l4 = (Long)objectArray[0];
                long l5 = l4 = b ^ l4;
                l3 = l5 ^ 0x100843D210C5L;
                long l6 = l5 ^ 0x150C3314A36CL;
                l2 = l5 ^ 0x1AFC7234CFB0L;
                _4w[] wArray = _3s.cfr_renamed_5();
                try {
                    try {
                        callSite = _5G.c("\u00a5", (Object)this, 3377269945096934188L, (long)l4);
                        if (wArray != null) break block4;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l6;
                        if (callSite >= _5G.c("\u00aa", (Object)_5G.c("\u00a5", (Object)this, 3377509567498705896L, (long)l4), (Object)objectArray2, 3369700251965338940L, (long)l4)) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _5G.a(matchException);
                    }
                    _5G g = this;
                    _5G.c("\u00ff", (Object)g, (int)(_5G.c("\u00a5", (Object)g, 3377269945096934188L, (long)l4) + true), 3377269945096934188L, (long)l4);
                    return;
                }
                catch (MatchException matchException) {
                    throw _5G.a(matchException);
                }
            }
            callSite = _5G.c("\u00a5", (Object)this, 3376526575203712786L, (long)l4);
        }
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = (int)callSite;
        _5G.c("\u00de", (Object)objectArray3, 3369809043112380246L, (long)l4);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l2;
        _5G.c("\u00aa", (Object)this, (Object)objectArray4, 3376084482545126004L, (long)l4);
    }

    private void cfr_renamed_277(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = b ^ l2;
        _5G.c("\u00ff", (Object)this, (int)_5G.a("b", 3635, (long)(0x4438FD6F470FBC72L ^ l2)), 6262457445558224673L, (long)l2);
        _5G.c("\u00ff", (Object)this, (int)_5G.a("b", 11734, (long)(0x56BA822E86F71F9CL ^ l2)), 6263693190382643999L, (long)l2);
        _5G.c("\u00ff", (Object)this, (boolean)_5G.a("b", 7349, (long)(0xFDAAEA283C2AEF7L ^ l2)), 6262934601990894861L, (long)l2);
    }

    public _5G(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x4244454912A6L;
        long l5 = l3 ^ 0x522477806B35L;
        long l6 = l3 ^ 0x6839AC986BF7L;
        long l7 = l6 >>> 8;
        int n = (int)(l6 << 56 >>> 56);
        long l8 = l3 ^ 0x147CD20A9ACFL;
        long l9 = l3 ^ 0xBBC412E75BDL;
        long l10 = l3 ^ 0x410883FCFE6BL;
        super((int)_5G.a("b", 13926, (long)(0x397CE3D90E8B6129L ^ l2)), -1, (_4r)((Object)_5G.c("\u00df", 3741327192197487160L, (long)l2)), l8);
        this.cfr_renamed_1 = new _9r((int)_5G.a("b", 11275, (long)(0x4FD9F1060DECFB42L ^ l2)), true, l4);
        this.cfr_renamed_6 = new _9r((int)_5G.a("b", 4736, (long)(0x74DC85311AD45CDL ^ l2)), true, l4);
        this.cfr_renamed_9 = new _9r((int)_5G.a("b", 20929, (long)(0x760F8C529E770689L ^ l2)), false, l4);
        this.cfr_renamed_2 = new _9r((int)_5G.a("b", 10539, (long)(0x43B4B34A8EAB7E6FL ^ l2)), false, l4);
        this.cfr_renamed_7 = new _9r((int)_5G.a("b", 13694, (long)(0xFFA4870CD82E232L ^ l2)), true, l4);
        this.cfr_renamed_4 = new _92((int)_5G.a("b", 29467, (long)(0x1104140B85FAA45CL ^ l2)), 0.0, l5, 20.0, 0.0, 1.0);
        CallSite callSite = _5G.c("\u00a5", (Object)this, 3740336832485082847L, (long)l2);
        CallSite callSite2 = _5G.c("\u00a5", (Object)this, 3741655322952114619L, (long)l2);
        _5G.c("\u00de", (Object)callSite2, 3740449415114299713L, (long)l2);
        Object[] objectArray = new Object[3];
        objectArray[2] = () -> ((_9r)((Object)callSite2)).cfr_renamed_3(l10);
        objectArray[1] = (int)((byte)n);
        objectArray[0] = l7;
        _5G.c("\u00aa", (Object)callSite, (Object)objectArray, 3740703055699608451L, (long)l2);
        _95[] nullArray = new _95[_5G.a("b", 21510, (long)(0x2D2214E22F4E834DL ^ l2))];
        nullArray[0] = _5G.c("\u00a5", (Object)this, 3743731417486363167L, (long)l2);
        nullArray[1] = _5G.c("\u00a5", (Object)this, 3741204815978894009L, (long)l2);
        nullArray[2] = _5G.c("\u00a5", (Object)this, 3740495141505710315L, (long)l2);
        nullArray[3] = _5G.c("\u00a5", (Object)this, 3743912755665876868L, (long)l2);
        nullArray[4] = _5G.c("\u00a5", (Object)this, 3741655322952114619L, (long)l2);
        nullArray[5] = _5G.c("\u00a5", (Object)this, 3740336832485082847L, (long)l2);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = nullArray;
        objectArray2[0] = l9;
        _5G.c("\u00aa", (Object)this, (Object)objectArray2, 3742428689615011711L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                a.init(_5G.class, 7);
                _5G.b = l.a(1273219447110252452L, -4916224211060359625L, MethodHandles.lookup().lookupClass()).a(144078487145561L);
                _5G.j = new Object[69];
                _5G.k = new String[69];
                _5G.b();
                _5G.f = new HashMap<K, V>(13);
                var0 = _5G.b ^ 37348619695439L;
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
                var8_3 = new long[12];
                var5_4 = 0;
                var6_5 = "\u001eS\u0095\u008f3 \u00f6\u00d5\u000f\u00d8r\u00b8\u00d8\u0017\u00ba\u0016\u0087\u00ac\u008f\"\u00c9\u0081\u00ee\u00d2^\u00bb\u001dD!\u009e\u00d4\u00f7G(\rA\u0085\u00d0s\u008e\u0085\u00f2B\u00a8\u001a\u0015\u0090\u00ca\u0005\t\u00e8\u00fb&\u00f7\u00ce\"#\u00a2\u00da\u0019o\u0099\u0094v\u0081\u00d7m\u00d72\u0016\u0005\u00e3]\u00a3\b\u00a3\u008f(:U";
                var7_6 = "\u001eS\u0095\u008f3 \u00f6\u00d5\u000f\u00d8r\u00b8\u00d8\u0017\u00ba\u0016\u0087\u00ac\u008f\"\u00c9\u0081\u00ee\u00d2^\u00bb\u001dD!\u009e\u00d4\u00f7G(\rA\u0085\u00d0s\u008e\u0085\u00f2B\u00a8\u001a\u0015\u0090\u00ca\u0005\t\u00e8\u00fb&\u00f7\u00ce\"#\u00a2\u00da\u0019o\u0099\u0094v\u0081\u00d7m\u00d72\u0016\u0005\u00e3]\u00a3\b\u00a3\u008f(:U".length();
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
                    var6_5 = "\u00d99-\u0097\f\u0016\u00c3z\u00f6\u00f02\u00f2\u00b9\u0093\u0087f";
                    var7_6 = "\u00d99-\u0097\f\u0016\u00c3z\u00f6\u00f02\u00f2\u00b9\u0093\u0087f".length();
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
        _5G.d = var8_3;
        _5G.e = new Integer[12];
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
            case 0 -> 58;
            case 1 -> 54;
            case 2 -> 59;
            case 3 -> 7;
            case 4 -> 41;
            case 5 -> 42;
            case 6 -> 5;
            case 7 -> 22;
            case 8 -> 55;
            case 9 -> 13;
            case 10 -> 63;
            case 11 -> 0;
            case 12 -> 8;
            case 13 -> 35;
            case 14 -> 45;
            case 15 -> 25;
            case 16 -> 4;
            case 17 -> 3;
            case 18 -> 23;
            case 19 -> 21;
            case 20 -> 36;
            case 21 -> 51;
            case 22 -> 16;
            case 23 -> 39;
            case 24 -> 29;
            case 25 -> 24;
            case 26 -> 40;
            case 27 -> 26;
            case 28 -> 32;
            case 29 -> 17;
            case 30 -> 10;
            case 31 -> 9;
            case 32 -> 18;
            case 33 -> 15;
            case 34 -> 48;
            case 35 -> 43;
            case 36 -> 57;
            case 37 -> 6;
            case 38 -> 12;
            case 39 -> 49;
            case 40 -> 31;
            case 41 -> 2;
            case 42 -> 38;
            case 43 -> 27;
            case 44 -> 20;
            case 45 -> 52;
            case 46 -> 53;
            case 47 -> 47;
            case 48 -> 30;
            case 49 -> 34;
            case 50 -> 33;
            case 51 -> 46;
            case 52 -> 50;
            case 53 -> 62;
            case 54 -> 44;
            case 55 -> 1;
            case 56 -> 61;
            case 57 -> 14;
            case 58 -> 28;
            case 59 -> 11;
            case 60 -> 60;
            case 61 -> 19;
            case 62 -> 56;
            default -> 37;
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
        _5G.k[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = "*\tB_)'7\u001c@\u001e,{{+";
        objectArray[1] = "ogZ]\te\u001aGQR\u0018*{IZY\u001cp\u000f";
        objectArray[2] = Void.TYPE;
        _5G.k[2] = "java/lang/Void";
        objectArray[3] = Integer.TYPE;
        _5G.k[3] = "java/lang/Integer";
        objectArray[4] = "~&\u0007\u0015&3c3\u0005T#o#q";
        objectArray[5] = "j\u0003\u000f6\u0004\u0017\u001f#\u00049\u0015X~-\u000f2\u0011\u0002\n";
        objectArray[6] = ":\u0002D#l.'\u0017Fbirf\u001d";
        objectArray[7] = "L\u0011\u0006g6[91\rh'\u0014X?\u0006c#N,";
        objectArray[8] = "T1~\f\u0019LI$|M\u001c\u0010\u0004f";
        objectArray[9] = "\u0006\u001a/\u001deks:$\u0012t$\u00124/\u0019p~f";
        objectArray[10] = Boolean.TYPE;
        _5G.k[10] = "java/lang/Boolean";
        objectArray[11] = "S.:i\u0000#S.-5\f,Ie-+\f9N\u0014\u007f\u007fTy";
        objectArray[12] = "o\u0017QyiOo\u0017F%e@u\\F;eUr-\u0010d6\u0017";
        objectArray[13] = "Q\u0012IU5{Q\u0012^\t9tKY^\u00179aL(\u000eJh";
        objectArray[14] = "J\n\u0002|i]J\n\u0015 eRPA\u0015>eGW0Af2";
        objectArray[15] = "B\u0017\u0006s+<77\r|:sV9\u0006w>)\"";
        objectArray[16] = ",0#V\u000e\u0006,04\n\u0002\t6{4\u0014\u0002\u001c1\nfNU^";
        objectArray[17] = "LPl>:\u0017LP{b6\u0018V\u001b{|6\rQj)(gL";
        objectArray[18] = "\b\u0003n$F\u0003\b\u0003yxJ\f\u0012HyfJ\u0019\u00159+=\u0012X";
        objectArray[19] = "\u0014hqGQZ\t}s\u0006T\u0006Fu";
        objectArray[20] = "\u0019\u00162nq>l69a`q\r82jd+y";
        objectArray[21] = "mI\n_XHp\\\b\u001e]\u00140^";
        objectArray[22] = "l\u0016s2^p\u00196x=O?x8s6Ke\f";
        objectArray[23] = Long.TYPE;
        _5G.k[23] = "java/lang/Long";
        objectArray[24] = "\u0002\u0011\u0017\u0007g\u0000\u0002\u0011\u0000[k\u000f\u0018Z\u0000Ek\u001a\u001f+R\u001e3P";
        objectArray[25] = "4`.C\u0015}4`9\u001f\u0019r.+9\u0001\u0019g)ZlUN&";
        objectArray[26] = "\u0012U-QeK\u0012U:\riD\b\u001e:\u0013iQ\u000fojK0\u001b";
        objectArray[27] = "?4C`0R?4T<<]%\u007fT\"<H\"\u000e\u0003}j";
        objectArray[28] = "\u0002`\u0005<0<w@\u000e3!s\u0016N\u00058%)b";
        objectArray[29] = "l;H0]cq.JqX?1k";
        objectArray[30] = "s\u001bQ\u000fJI\u0006;Z\u0000[\u0006g5Q\u000b_\\\u0013";
        objectArray[31] = "\u0017\u0017\u001b7\u001e\u0012\n\u0002\u0019v\u001bNG\u0000";
        objectArray[32] = "o0D\u00156\u0014\u001a\u0010O\u001a'[{\u001eD\u0011#\u0001\u000f";
        objectArray[33] = "vjZ\u0018LJhb@W-]vnO\r\u0011";
        objectArray[34] = "r\nd1s;y\u0005u~\u00125r\u000eq$";
        objectArray[35] = "\u000b\u0003k%qs]\\yY3\u0017ZSaeux\u0010\u0001lg";
        objectArray[36] = "usk,~%#,yP:As1y4>1t6h0";
        objectArray[37] = "3E*&Uoe\u001a8Z\u0011fX\u001c0(\u0010g8\u0003#1V\u000ba\u001ck:Whc\u001f5$-";
        objectArray[38] = "\u001c\u0016}qh\u0003\u0017\u0004(9\u0013X\u001b\u0006wn\u007fjHE*2)=L\u0016e5oR\u0006Dh7\u0013";
        objectArray[39] = "Z3B,cV\u0004t[&\u001a\tX4[*v;\u000eq\u0006r!lU*Y6'\u0011\u0004uU7\u001aS\\/@-z\\S3TM";
        objectArray[40] = "%^*o2\u0004s\u00018\u0013w`q\u000b5h*\u0000~\u0004)|";
        objectArray[41] = "\u001cPY%z7\u0017XU.Ab\u001c_S;\u00160G\f\u000emAl\u001fPLj<=@\\M";
        objectArray[42] = "HKup\b4CCy{3aHD\u007fnd3\u0013\u0017\";3oKK`?N>\u0014Ga";
        objectArray[43] = "$\u0015\u0019ErQ1\u0013\u001eC\u000eD VEFbvs\u0012\u0019\u001e\u000eN6SDX4\u0010qJN!";
        objectArray[44] = "Bn0Q\u000f4\u0002'7\u0017u<\u001321E\"oJfh\u0018ub\u000fb5U\u0012c\u001048";
        objectArray[45] = "\u001a~9Eq>E>\"G@z&a#E}-F~0\\;A\u0019m&L !\u0016b:X@";
        objectArray[46] = "U&\rXb.\u0003y\u001f$ J[x\u0007\u0019v*Dk\u001e_\u001auW}\u000eDzzXa\u001a$";
        objectArray[47] = "S\":gkjE2/9\u0010+?)=s-~_6.jk\u0012\u0006)fajq\u0004*8\u007f\u0010";
        objectArray[48] = "xNm;9\u0005\u007fI|?\u0001O\u0015_k$|IrVi28u*Y`$a\u0015%V|0\u0001";
        objectArray[49] = "$|=Y\u0016[r#/%V?u=/E\u001c_v>.C";
        objectArray[50] = "kO4\u0004jLc\u00128\f[Q`\u000e']!FK\u0010<z&Oiw<F1\u0016<\u000f#V!H\r\u0011 Vf\u001au\u000e0F8+";
        objectArray[51] = "m\tmB*?;V\u007f>m[kK\u007fZj+lLn^";
        objectArray[52] = "+\u000bo\u007fl;pDa$\u0012`\u0015Pl</<uO\u007f%iP*\\i5r0%Su!\u0012";
        objectArray[53] = "\u0002\u0019X\b#;TFJtk_SIRH'0\u0019\u001b_J";
        objectArray[54] = "Q?9\nPSKlz\u001f9\f23g\t\u0004\\R,t\u0010B0Q?9\nPSKlz\u001f9";
        objectArray[55] = "I\u0013\u0000_.8\u001d\u0016Y\u001a_n\u0019\u0017\u0000\u000b\b9G@Xg6?D\u001e\u0018\u0017#9C\u0018";
        objectArray[56] = "p\biA,%$\r0\u0004]s \fi\u0015\n$~\\0y<f.\\u\u0002:w/\u0001";
        objectArray[57] = "3@b!\u0000\u001cl\u0000y#1^\u000f_x!\f\u000fo@k8Jc0S}(Q\u0003?\\a<1";
        objectArray[58] = "Q8|?]UE;ow/D[mf*x\u0016\u000b0;z/AXrk9\u0013N\u000303";
        objectArray[59] = "\u0002 i\u0000)=BinFS5S|h\u0014\u0004f\n(1HSkO,l\u00044jPza";
        objectArray[60] = "aQ\u000eP~FwA\u001b\u000e\u0005\u0007\r\u000e\u0002R=O5Z\u0007\u000bx";
        objectArray[61] = "0=u\u0013A fbgo\u0002D6\u007fg\u000b\u000141xv\u000f";
        objectArray[62] = "KfMAb4\u001d9_=&\u0017 ?WO'<@ DVaP\u0019?\f]`3\u001b<RC\u001a";
        objectArray[63] = "<?-kTM$}\u007f79y\u001f\u0004\u000eDe2<?-kTM$}\u007f7";
        objectArray[64] = "\u0001m\u000b\u007f&!\u0014k\fyZ4\u0005.W|6\u0006Sk\n'jQ\u0002>]c!o\t,\b+Z";
        objectArray[65] = "~Y\u007fa\u001a\u001e(\u0006m\u001dSzx\u001bmyZ\n\u007f\u001c|}";
        objectArray[66] = "\u0019Kr\u0011R\b\u001aHs\u0017 U#Sz\u0003\u001d\u0004CLi\u001a[h\u0019ZjM\\\u0007S\bgO ";
        objectArray[67] = "\u0003gNW|\u0000\\'UUMG?xTWp\u0013_gGN6\u007f\u0006x\u000fE7\u001c\u0004{Q[M";
        Object[] objectArray2 = objectArray;
        objectArray[68] = "u/\u000f8.Z#p\u001dDh>sm\u001d nNtj\f$";
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _5G.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00a5' || c == '\u00ff' || c == '\u00df' || c == 'S') {
                field = _5G.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a5' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ff' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00df' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5G.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00aa' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00de' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5G" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = _5G.e(l2, l3);
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
                clazz3 = _5G.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5G.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5G.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5G.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5G.f(2412922448005904L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5G.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5G.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5G.f(2412922448005904L, 0L);
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
            int n = _5G.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _5G.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5G.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5G.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5G.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5G.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x64AA;
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
                throw new RuntimeException("dev/krypton/5G", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5G.e[n2] = n3;
        }
        return e[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5G" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5G.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field g(long l2, long l3) {
        int n = _5G.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _5G.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5G.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5G.c(clazz3, string2, clazz2)) != null) {
                    _5G.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5G.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5G.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5G.f(2412922448005904L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static boolean cfr_renamed_4(long l2, int n, class_1799 class_17992) {
        long l3 = (l2 << 32 | (long)n << 32 >>> 32) ^ b;
        long l4 = l3 ^ 0x5761BDBC5C54L;
        Object[] objectArray = new Object[3];
        objectArray[2] = l4;
        objectArray[1] = _5G.c("\u00df", 2188784154538773864L, (long)l3);
        objectArray[0] = class_17992;
        return (boolean)_5G.c("\u00de", (Object)objectArray, 2190508241636069131L, (long)l3);
    }

    @Override
    public native void cfr_renamed_2();

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean boolean_2(Object[] var1_1) {
        block37: {
            block39: {
                block38: {
                    block35: {
                        block36: {
                            block30: {
                                block31: {
                                    block32: {
                                        block34: {
                                            block33: {
                                                var2_2 = (Long)var1_1[0];
                                                var4_3 = (var2_2 = _5G.b ^ var2_2) ^ 35604184123640L;
                                                var6_4 = _3s.cfr_renamed_5();
                                                var7_5 = _5G.c("\u00aa", (Object)_5G.c("\u00a5", (Object)_5G.c("\u00a5", (Object)this, (long)-8829185282067620201L, (long)var2_2), (long)-8828564503353604925L, (long)var2_2), (long)-8827717656914164003L, (long)var2_2);
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            v0 /* !! */  = _5G.c("\u00aa", (Object)_5G.c("\u00a5", (Object)this, (long)-8828311004857889160L, (long)var2_2), (long)var4_3, (long)-8828350352018257180L, (long)var2_2);
                                                                            if (var6_4 != null) break block30;
                                                                            if (v0 /* !! */  == false) break block31;
                                                                        }
                                                                        catch (MatchException v1) {
                                                                            throw _5G.a(v1);
                                                                        }
                                                                        v0 /* !! */  = _5G.c("\u00aa", (Object)_5G.c("\u00a5", (Object)this, (long)-8834252975241756393L, (long)var2_2), (long)var4_3, (long)-8828350352018257180L, (long)var2_2);
                                                                        v2 = var6_4;
                                                                        if (var2_2 > 0L) {
                                                                            if (v2 != null) break block30;
                                                                        }
                                                                        ** GOTO lbl65
                                                                    }
                                                                    catch (MatchException v3) {
                                                                        throw _5G.a(v3);
                                                                    }
                                                                    if (v0 /* !! */  == false) break block31;
                                                                }
                                                                catch (MatchException v4) {
                                                                    throw _5G.a(v4);
                                                                }
                                                                v5 /* !! */  = _5G.c("\u00aa", (Object)var7_5, (Object)_5G.c("\u00df", (long)-8827624649377602578L, (long)var2_2), (long)-8827435383623316334L, (long)var2_2);
                                                                if (var6_4 != null) break block32;
                                                            }
                                                            catch (MatchException v6) {
                                                                throw _5G.a(v6);
                                                            }
                                                            if (v5 /* !! */  != false) break block33;
                                                        }
                                                        catch (MatchException v7) {
                                                            throw _5G.a(v7);
                                                        }
                                                        v5 /* !! */  = _5G.c("\u00aa", (Object)var7_5, (Object)_5G.c("\u00df", (long)-8827842688060017300L, (long)var2_2), (long)-8827435383623316334L, (long)var2_2);
                                                        if (var6_4 != null) break block32;
                                                    }
                                                    catch (MatchException v8) {
                                                        throw _5G.a(v8);
                                                    }
                                                    if (v5 /* !! */  == false) break block34;
                                                }
                                                catch (MatchException v9) {
                                                    throw _5G.a(v9);
                                                }
                                            }
                                            v5 /* !! */  = (CallSite)true;
                                            break block32;
                                        }
                                        v5 /* !! */  = (CallSite)false;
                                    }
                                    return (boolean)v5 /* !! */ ;
                                }
                                v0 /* !! */  = _5G.c("\u00aa", (Object)_5G.c("\u00a5", (Object)this, (long)-8828311004857889160L, (long)var2_2), (long)var4_3, (long)-8828350352018257180L, (long)var2_2);
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            v2 = var6_4;
lbl65:
                                            // 2 sources

                                            if (v2 != null) break block35;
                                            if (v0 /* !! */  == false) break block36;
                                        }
                                        catch (MatchException v10) {
                                            throw _5G.a(v10);
                                        }
                                        v0 /* !! */  = _5G.c("\u00aa", (Object)var7_5, (Object)_5G.c("\u00df", (long)-8827624649377602578L, (long)var2_2), (long)-8827435383623316334L, (long)var2_2);
                                        v11 = var6_4;
                                        if (var2_2 >= 0L) {
                                            if (v11 != null) break block35;
                                        }
                                        ** GOTO lbl92
                                    }
                                    catch (MatchException v12) {
                                        throw _5G.a(v12);
                                    }
                                    if (v0 /* !! */  != false) break block36;
                                }
                                catch (MatchException v13) {
                                    throw _5G.a(v13);
                                }
                                return false;
                            }
                            catch (MatchException v14) {
                                throw _5G.a(v14);
                            }
                        }
                        v0 /* !! */  = _5G.c("\u00aa", (Object)_5G.c("\u00a5", (Object)this, (long)-8834252975241756393L, (long)var2_2), (long)var4_3, (long)-8828350352018257180L, (long)var2_2);
                    }
                    try {
                        try {
                            try {
                                v11 = var6_4;
lbl92:
                                // 2 sources

                                if (v11 != null) break block37;
                                if (v0 /* !! */  == false) break block38;
                            }
                            catch (MatchException v15) {
                                throw _5G.a(v15);
                            }
                            v0 /* !! */  = _5G.c("\u00aa", (Object)var7_5, (Object)_5G.c("\u00df", (long)-8827842688060017300L, (long)var2_2), (long)-8827435383623316334L, (long)var2_2);
                            if (var6_4 != null) break block37;
                        }
                        catch (MatchException v16) {
                            throw _5G.a(v16);
                        }
                        if (v0 /* !! */  == false) break block39;
                    }
                    catch (MatchException v17) {
                        throw _5G.a(v17);
                    }
                }
                v0 /* !! */  = (CallSite)true;
                break block37;
            }
            v0 /* !! */  = (CallSite)false;
        }
        return (boolean)v0 /* !! */ ;
    }

    /*
     * Unable to fully structure code
     */
    @_3i_0
    public void cfr_renamed_6(_6C var1_1) {
        block53: {
            block50: {
                block51: {
                    block52: {
                        block49: {
                            block48: {
                                block46: {
                                    block44: {
                                        block45: {
                                            block42: {
                                                block43: {
                                                    block40: {
                                                        block41: {
                                                            v0 = var2_2 = _5G.b ^ 126482326835954L;
                                                            v1 = v0 ^ 138020715121817L;
                                                            var4_3 = v1 >>> 32;
                                                            var6_4 = (int)(v1 << 32 >>> 32);
                                                            var7_5 = v0 ^ 65045370817889L;
                                                            var9_6 = v0 ^ 9574318069637L;
                                                            var11_7 = v0 ^ 40593805011663L;
                                                            var13_8 = v0 ^ 89003727071486L;
                                                            var15_9 = v0 ^ 47000344251595L;
                                                            var17_10 = _3s.cfr_renamed_5();
                                                            try {
                                                                try {
                                                                    v2 = this;
                                                                    if (var17_10 != null) break block40;
                                                                    if (_5G.c("\u00a5", (Object)_5G.c("\u00a5", (Object)v2, (long)-1910055860269810031L, (long)var2_2), (long)-1910419254528039739L, (long)var2_2) != null) break block41;
                                                                }
                                                                catch (MatchException v3) {
                                                                    throw _5G.a(v3);
                                                                }
                                                                return;
                                                            }
                                                            catch (MatchException v4) {
                                                                throw _5G.a(v4);
                                                            }
                                                        }
                                                        v2 = this;
                                                    }
                                                    try {
                                                        v5 = new Object[1];
                                                        v5[0] = var9_6;
                                                        v6 = _5G.c("\u00aa", (Object)v2, (Object)v5, (long)-1911028700462301808L, (long)var2_2);
                                                        if (var17_10 != null) break block42;
                                                        if (v6 != false) break block43;
                                                    }
                                                    catch (MatchException v7) {
                                                        throw _5G.a(v7);
                                                    }
                                                    return;
                                                }
                                                v6 = _5G.c("\u00a5", (Object)this, (long)-1911268439026027344L, (long)var2_2);
                                            }
                                            try {
                                                try {
                                                    if (var17_10 != null) break block44;
                                                    if (v6 != -1) break block45;
                                                }
                                                catch (MatchException v8) {
                                                    throw _5G.a(v8);
                                                }
                                                _5G.c("\u00ff", (Object)this, (int)_5G.c("\u00aa", (Object)_5G.c("\u00aa", (Object)_5G.c("\u00a5", (Object)_5G.c("\u00a5", (Object)this, (long)-1910055860269810031L, (long)var2_2), (long)-1910419254528039739L, (long)var2_2), (long)-1918204035855392287L, (long)var2_2), (long)-1911620508205912011L, (long)var2_2), (long)-1911268439026027344L, (long)var2_2);
                                            }
                                            catch (MatchException v9) {
                                                throw _5G.a(v9);
                                            }
                                        }
                                        v6 = _5G.c("\u00aa", (Object)_5G.c("\u00a5", (Object)this, (long)-1918122113017095030L, (long)var2_2), (long)var13_8, (long)-1910345711724549406L, (long)var2_2);
                                    }
                                    try {
                                        block47: {
                                            try {
                                                try {
                                                    try {
                                                        if (var17_10 != null) break block46;
                                                        if (v6 == false) break block47;
                                                    }
                                                    catch (MatchException v10) {
                                                        throw _5G.a(v10);
                                                    }
                                                    v11 = _5G.c("\u00aa", (Object)_5G.c("\u00a5", (Object)this, (long)-1909952787822492628L, (long)var2_2), (long)var13_8, (long)-1910345711724549406L, (long)var2_2);
                                                    if (var17_10 != null) break block48;
                                                }
                                                catch (MatchException v12) {
                                                    throw _5G.a(v12);
                                                }
                                                if (v11 == false) {
                                                }
                                                ** GOTO lbl100
                                            }
                                            catch (MatchException v13) {
                                                throw _5G.a(v13);
                                            }
                                        }
                                        v6 = _5G.c("\u00aa", (Object)_5G.c("\u00a5", (Object)this, (long)-1918122113017095030L, (long)var2_2), (long)var13_8, (long)-1910345711724549406L, (long)var2_2);
                                    }
                                    catch (MatchException v14) {
                                        throw _5G.a(v14);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                if (var17_10 != null) break block49;
                                                if (v6 == false) {
                                                }
                                                ** GOTO lbl111
                                            }
                                            catch (MatchException v15) {
                                                throw _5G.a(v15);
                                            }
                                            v6 = _5G.c("\u00aa", (Object)_5G.c("\u00a5", (Object)this, (long)-1909952787822492628L, (long)var2_2), (long)var13_8, (long)-1910345711724549406L, (long)var2_2);
                                            if (var17_10 != null) break block49;
                                        }
                                        catch (MatchException v16) {
                                            throw _5G.a(v16);
                                        }
                                        if (v6 == false) {
                                        }
                                        ** GOTO lbl111
                                    }
                                    catch (MatchException v17) {
                                        throw _5G.a(v17);
                                    }
lbl100:
                                    // 2 sources

                                    v18 = new Object[2];
                                    v18[1] = _5G.c("\u00df", (long)-1909621191787182544L, (long)var2_2);
                                    v18[0] = var15_9;
                                    v11 = _5G.c("\u00de", (Object)v18, (long)-1909667071722536947L, (long)var2_2);
                                }
                                catch (MatchException v19) {
                                    throw _5G.a(v19);
                                }
                            }
                            try {
                                if (var17_10 == null) break block50;
lbl111:
                                // 3 sources

                                v6 = _5G.c("\u00aa", (Object)_5G.c("\u00a5", (Object)this, (long)-1918122113017095030L, (long)var2_2), (long)var13_8, (long)-1910345711724549406L, (long)var2_2);
                            }
                            catch (MatchException v20) {
                                throw _5G.a(v20);
                            }
                        }
                        try {
                            try {
                                if (var17_10 != null) break block51;
                                if (v6 == false) break block52;
                            }
                            catch (MatchException v21) {
                                throw _5G.a(v21);
                            }
                            v22 = new Object[2];
                            v22[1] = var11_7;
                            v22[0] = (Predicate<class_1799>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, 0(long int net.minecraft.class_1799 ), (Lnet/minecraft/class_1799;)Z)((long)var4_3, (int)var6_4);
                            _5G.c("\u00de", (Object)v22, (long)-1911121059783552383L, (long)var2_2);
                        }
                        catch (MatchException v23) {
                            throw _5G.a(v23);
                        }
                    }
                    try {
                        v24 = this;
                        if (var17_10 != null) break block53;
                        v6 = _5G.c("\u00aa", (Object)_5G.c("\u00a5", (Object)v24, (long)-1909952787822492628L, (long)var2_2), (long)var13_8, (long)-1910345711724549406L, (long)var2_2);
                    }
                    catch (MatchException v25) {
                        throw _5G.a(v25);
                    }
                }
                try {
                    if (v6 != false) {
                        v26 = new Object[2];
                        v26[1] = var11_7;
                        v26[0] = (Predicate<class_1799>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, 3(long net.minecraft.class_1799 ), (Lnet/minecraft/class_1799;)Z)((long)var7_5);
                        _5G.c("\u00de", (Object)v26, (long)-1911121059783552383L, (long)var2_2);
                    }
                }
                catch (MatchException v27) {
                    throw _5G.a(v27);
                }
            }
            v24 = this;
        }
        _5G.c("\u00ff", (Object)v24, (boolean)_5G.a("b", (int)18369, (long)(2858780178402756126L ^ var2_2)), (long)-1910914442927487332L, (long)var2_2);
    }

    private static boolean cfr_renamed_6(long l2, class_1799 class_17992) {
        long l3 = (l2 = b ^ l2) ^ 0x11CE4036DDACL;
        Object[] objectArray = new Object[3];
        objectArray[2] = l3;
        objectArray[1] = _5G.c("\u00df", -6945224330505021162L, (long)l2);
        objectArray[0] = class_17992;
        return (boolean)_5G.c("\u00de", (Object)objectArray, -6944980482211574029L, (long)l2);
    }

    @_3i_0
    public void cfr_renamed_8(_9o o) {
        block23: {
            _5G g;
            long l2;
            long l3;
            block24: {
                CallSite callSite;
                _4w[] wArray;
                long l4;
                block22: {
                    _5G g2;
                    long l5;
                    block21: {
                        CallSite callSite2;
                        block19: {
                            block20: {
                                long l6 = l3 = b ^ 0x2A22DBF1C916L;
                                l4 = l6 ^ 0x3B709DE3E7C5L;
                                l5 = l6 ^ 0x9D8E651B31AL;
                                l2 = l6 ^ 0x59AAAB329FF6L;
                                wArray = _3s.cfr_renamed_5();
                                try {
                                    try {
                                        callSite2 = _5G.c("\u00a5", (Object)this, 9122682586897737077L, (long)l3);
                                        if (wArray != null) break block19;
                                        if (_5G.c("\u00a5", (Object)callSite2, 9123001700462100439L, (long)l3) == null) break block20;
                                    }
                                    catch (MatchException matchException) {
                                        throw _5G.a(matchException);
                                    }
                                    return;
                                }
                                catch (MatchException matchException) {
                                    throw _5G.a(matchException);
                                }
                            }
                            try {
                                g2 = this;
                                if (wArray != null) break block21;
                                callSite2 = _5G.c("\u00a5", (Object)g2, 9122682586897737077L, (long)l3);
                            }
                            catch (MatchException matchException) {
                                throw _5G.a(matchException);
                            }
                        }
                        try {
                            if (_5G.c("\u00a5", (Object)callSite2, 9122193763472686881L, (long)l3) == null) {
                                return;
                            }
                        }
                        catch (MatchException matchException) {
                            throw _5G.a(matchException);
                        }
                        g2 = this;
                    }
                    try {
                        try {
                            try {
                                callSite = _5G.c("\u00a5", (Object)g2, 9124090923154431352L, (long)l3);
                                if (wArray != null) break block22;
                                if (callSite == false) break block23;
                            }
                            catch (MatchException matchException) {
                                throw _5G.a(matchException);
                            }
                            g = this;
                            if (wArray != null) break block24;
                        }
                        catch (MatchException matchException) {
                            throw _5G.a(matchException);
                        }
                        callSite = _5G.c("\u00aa", (Object)_5G.c("\u00a5", (Object)g, 9123254224404081866L, (long)l3), (long)l5, 9122410036544352518L, (long)l3);
                    }
                    catch (MatchException matchException) {
                        throw _5G.a(matchException);
                    }
                }
                try {
                    block25: {
                        try {
                            if (callSite == false) break block25;
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l4;
                            _5G.c("\u00aa", (Object)this, (Object)objectArray, 9122868133609170530L, (long)l3);
                            if (wArray == null) break block23;
                        }
                        catch (MatchException matchException) {
                            throw _5G.a(matchException);
                        }
                    }
                    g = this;
                }
                catch (MatchException matchException) {
                    throw _5G.a(matchException);
                }
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l2;
            _5G.c("\u00aa", (Object)g, (Object)objectArray, 9123168756561467954L, (long)l3);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5G.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5G.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

