/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1723
 *  net.minecraft.class_490
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._3i_0;
import dev.krypton._3s;
import dev.krypton._4r;
import dev.krypton._6x_0;
import dev.krypton._92;
import dev.krypton._95;
import dev.krypton._9o;
import dev.krypton._9r;
import dev.krypton.l;
import dev.krypton.mixin._4x_0;
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
import net.minecraft.class_1723;
import net.minecraft.class_490;

public class _5S
extends _6x_0 {
    private final _92 cfr_renamed_8;
    private final _9r cfr_renamed_9;
    private final _92 cfr_renamed_3;
    private final _9r cfr_renamed_1;
    private int cfr_renamed_6;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    private void cfr_renamed_346(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        long l2 = (Long)objectArray[2];
        long l3 = (l2 = b ^ l2) ^ 0x2CAA93915BA4L;
        _5S.c("o", (Object)_5S.c("C", (Object)_5S.c("C", (Object)this, 8745719384640226880L, (long)l2), 8745931724547270703L, (long)l2), (int)n, (int)n2, (int)_5S.a("k", 24311, (long)(0x3DA7252348974398L ^ l2)), (Object)_5S.c("\u00c9", 8744567254159781077L, (long)l2), (Object)_5S.c("C", (Object)_5S.c("C", (Object)this, 8745719384640226880L, (long)l2), 8745541260572410711L, (long)l2), 8745104940321461388L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _5S.c("o", (Object)this, (Object)objectArray2, 8744461184309553234L, (long)l2);
    }

    private void cfr_renamed_296(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        long l2 = (Long)objectArray[2];
        int n3 = (Integer)objectArray[3];
        long l3 = (l2 = b ^ l2) ^ 0x4D79E2117AEBL;
        _5S.c("o", (Object)_5S.c("C", (Object)_5S.c("C", (Object)this, 6345686924173944591L, (long)l2), 6345760182285732192L, (long)l2), (int)n, (int)n2, (int)n3, (Object)_5S.c("\u00c9", 6347137876734823834L, (long)l2), (Object)_5S.c("C", (Object)_5S.c("C", (Object)this, 6345686924173944591L, (long)l2), 6345860650269467160L, (long)l2), 6346622249530815939L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _5S.c("o", (Object)this, (Object)objectArray2, 6347244019608078621L, (long)l2);
    }

    private void cfr_renamed_347(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = b ^ l2) ^ 0x45D1954C2176L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _5S.c("B", (Object)this, (int)_5S.c("o", (Object)_5S.c("C", (Object)this, -5998685052476450136L, (long)l2), (Object)objectArray2, -5996976558405237231L, (long)l2), -5998517841539796341L, (long)l2);
    }

    public _5S(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x55D10635764FL;
        long l5 = l3 ^ 0x45B134FC0FDCL;
        long l6 = l3 ^ 0x7FACEFE40F1EL;
        long l7 = l6 >>> 8;
        int n = (int)(l6 << 56 >>> 56);
        long l8 = l3 ^ 0x3E99176FE26L;
        long l9 = l3 ^ 0x1C2902521154L;
        long l10 = l3 ^ 0x569DC0809A82L;
        super((int)_5S.a("k", 12421, (long)(0x4FB1086067BB83B6L ^ l2)), -1, (_4r)((Object)_5S.c("\u00c9", 6269891341306898687L, (long)l2)), l8);
        this.cfr_renamed_8 = new _92((int)_5S.a("k", 24536, (long)(0x361ACCF0E8D1ECECL ^ l2)), 0.0, l5, 20.0, 0.0, 1.0);
        this.cfr_renamed_9 = new _9r((int)_5S.a("k", 32222, (long)(0x1714178D7E44CEEBL ^ l2)), true, l4);
        this.cfr_renamed_3 = new _92((int)_5S.a("k", 5551, (long)(0x68122F1AA78A269DL ^ l2)), 1.0, l5, 9.0, 1.0, 1.0);
        this.cfr_renamed_1 = new _9r((int)_5S.a("k", 10737, (long)(0x3280746DD99F1AC0L ^ l2)), false, l4);
        CallSite callSite = _5S.c("C", (Object)this, 6269930279091388692L, (long)l2);
        CallSite callSite2 = _5S.c("C", (Object)this, 6269532411637633124L, (long)l2);
        _5S.c("h", (Object)callSite2, 6270779174434936392L, (long)l2);
        Object[] objectArray = new Object[3];
        objectArray[2] = () -> ((_9r)((Object)callSite2)).cfr_renamed_3(l10);
        objectArray[1] = (int)((byte)n);
        objectArray[0] = l7;
        _5S.c("o", (Object)callSite, (Object)objectArray, 6270978626852197627L, (long)l2);
        CallSite callSite3 = _5S.c("C", (Object)this, 6270859292663386192L, (long)l2);
        CallSite callSite4 = _5S.c("C", (Object)this, 6269532411637633124L, (long)l2);
        _5S.c("h", (Object)callSite4, 6270779174434936392L, (long)l2);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = () -> ((_9r)((Object)callSite4)).cfr_renamed_3(l10);
        objectArray2[1] = (int)((byte)n);
        objectArray2[0] = l7;
        _5S.c("o", (Object)callSite3, (Object)objectArray2, 6270978626852197627L, (long)l2);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = new _95[]{_5S.c("C", (Object)this, 6270188758587269484L, (long)l2), _5S.c("C", (Object)this, 6269532411637633124L, (long)l2), _5S.c("C", (Object)this, 6269930279091388692L, (long)l2), _5S.c("C", (Object)this, 6270859292663386192L, (long)l2)};
        objectArray3[0] = l9;
        _5S.c("o", (Object)this, (Object)objectArray3, 6271154363137569802L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                a.init(_5S.class, 31);
                _5S.b = l.a(6474861572615376311L, 4621124929651463472L, MethodHandles.lookup().lookupClass()).a(258805948610168L);
                _5S.j = new Object[63];
                _5S.k = new String[63];
                _5S.b();
                _5S.f = new HashMap<K, V>(13);
                var0 = _5S.b ^ 87583132176998L;
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
                var8_3 = new long[7];
                var5_4 = 0;
                var6_5 = "\u00bdd|\u0098F\n\u00a1#\u00e1:\u00b2|\u00d1\u00c6i\u00bb\u00f1h\u00d1\u0091\u0002\u0099Q\u00f4\u0004\u00ba\u008c@\u001b\u00ad\u008c\u00ef\u0014\u00a0xr\u001c\u0019\u00be\r";
                var7_6 = "\u00bdd|\u0098F\n\u00a1#\u00e1:\u00b2|\u00d1\u00c6i\u00bb\u00f1h\u00d1\u0091\u0002\u0099Q\u00f4\u0004\u00ba\u008c@\u001b\u00ad\u008c\u00ef\u0014\u00a0xr\u001c\u0019\u00be\r".length();
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
                    var6_5 = "\u00bd\u00c9!&\u00b0u\t\u00ec\u00dc\u00f5\u00c8Gu\u0018\u00fd$";
                    var7_6 = "\u00bd\u00c9!&\u00b0u\t\u00ec\u00dc\u00f5\u00c8Gu\u0018\u00fd$".length();
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
        _5S.d = var8_3;
        _5S.e = new Integer[7];
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
            case 0 -> 42;
            case 1 -> 8;
            case 2 -> 53;
            case 3 -> 45;
            case 4 -> 49;
            case 5 -> 38;
            case 6 -> 48;
            case 7 -> 35;
            case 8 -> 13;
            case 9 -> 55;
            case 10 -> 44;
            case 11 -> 32;
            case 12 -> 17;
            case 13 -> 54;
            case 14 -> 62;
            case 15 -> 36;
            case 16 -> 31;
            case 17 -> 51;
            case 18 -> 60;
            case 19 -> 34;
            case 20 -> 10;
            case 21 -> 3;
            case 22 -> 52;
            case 23 -> 19;
            case 24 -> 43;
            case 25 -> 6;
            case 26 -> 7;
            case 27 -> 39;
            case 28 -> 21;
            case 29 -> 26;
            case 30 -> 46;
            case 31 -> 24;
            case 32 -> 27;
            case 33 -> 37;
            case 34 -> 11;
            case 35 -> 25;
            case 36 -> 2;
            case 37 -> 20;
            case 38 -> 41;
            case 39 -> 59;
            case 40 -> 63;
            case 41 -> 5;
            case 42 -> 29;
            case 43 -> 58;
            case 44 -> 57;
            case 45 -> 50;
            case 46 -> 18;
            case 47 -> 16;
            case 48 -> 61;
            case 49 -> 22;
            case 50 -> 40;
            case 51 -> 12;
            case 52 -> 56;
            case 53 -> 9;
            case 54 -> 30;
            case 55 -> 33;
            case 56 -> 1;
            case 57 -> 0;
            case 58 -> 4;
            case 59 -> 15;
            case 60 -> 47;
            case 61 -> 23;
            case 62 -> 14;
            default -> 28;
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
        _5S.k[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = "v?\u0004\b\u001e2v?\u0013T\u0012=lt\u0013J\u0012(k\u0005A\u0011Bh";
        objectArray[1] = "i\nO}YNi\nX!UAsAX?UTt0\bb\u0004";
        objectArray[2] = "5Z;Sqx5Z,\u000f}w/\u0011,\u0011}b(`xI*";
        objectArray[3] = "&\u0002\u000b+G\u001d;\u0017\tjBAw4";
        objectArray[4] = "J$?Yn\u0005?\u00044V\u007fJ^\n?]{\u0010*";
        objectArray[5] = Void.TYPE;
        _5S.k[5] = "java/lang/Void";
        objectArray[6] = "mBm:2cpWo{7??_";
        objectArray[7] = "9\u007fE2B79\u007fRnN8#4RpN-$E\u0007/\u0019";
        objectArray[8] = Integer.TYPE;
        _5S.k[8] = "java/lang/Integer";
        objectArray[9] = "D+f\u001d6^D+qA:Q^`q_:DY\u0011#\u0005n\u0000";
        objectArray[10] = "Wb9b\u000esWb.>\u0002|M). \u0002iJX|{P/";
        objectArray[11] = "}l5\u0005Xo}l\"YT`g'\"GTu`Vp\u001c\f?";
        objectArray[12] = "%^\u001bi\u0005\u0018%^\f5\t\u0017?\u0015\f+\t\u00028d^\u007fXC";
        objectArray[13] = "k\r\u0014Ny\u0000k\r\u0003\u0012u\u000fqF\u0003\fu\u001av7QW-[";
        objectArray[14] = "R\u00180LY-R\u0018'\u0010U\"HS'\u000eU7O\"pQ\u0003";
        objectArray[15] = "\u0019f\u0002B\u0001#\u0004s\u0000\u0003\u0004\u007fDq";
        objectArray[16] = Boolean.TYPE;
        _5S.k[16] = "java/lang/Boolean";
        objectArray[17] = "\u0013b'E)RfB,J8\u001d\u0007L'A<Gs";
        objectArray[18] = "\u001b5\b}wQ\u001b5\u001f!{^\u0001~\u001f?{K\u0006\u000fMd(\u000b";
        objectArray[19] = "R\u0002{\u0003pVR\u0002l_|YHIlA|LO8>\u001b+\u000e";
        objectArray[20] = "uX\u0011&w\u0000hM\u0013gr\\(\u000f";
        objectArray[21] = Long.TYPE;
        _5S.k[21] = "java/lang/Long";
        objectArray[22] = "?7\u001adOVJ\u0017\u0011k^\u0019+\u0019\u001a`ZC_";
        objectArray[23] = "mH\u000fY\u0019A\u0018h\u0004V\b\u000eyf\u000f]\fT\r";
        objectArray[24] = "[ui\u000f\rm[u~S\u0001bA>~M\u0001wFO)\u0018P";
        objectArray[25] = "\u0017O\u001c\u001e[\f\u0017O\u000bBW\u0003\r\u0004\u000b\\W\u0016\nuY\u0007\u0006V";
        objectArray[26] = "iR\u0011\u0017wGtG\u0013Vr\u001b4\u0002";
        objectArray[27] = "QMrz\u001e@$myu\u000f\u000fEcr~\u000bU1";
        objectArray[28] = "Cg8\u0019z1^r:X\u007fm\u0013p";
        objectArray[29] = "fz~\u001cbP\u0013Zu\u0013s\u001frT~\u0018wE\u0006";
        objectArray[30] = "<u(,:\t\"}2c[\u001e<q=9g";
        objectArray[31] = "ru]Y/HyzL\u0016NFrqHL";
        objectArray[32] = "IX#HR\u001b\u0013\u00136\u001f(D\u001aU,IDvH\u0017s\u0011(\u0011GM=C\u0017\u001a\u000f\u0018t.";
        objectArray[33] = "AJ\u001c\",\u001d\u0019SRw\u0014\u0007\u0015WM{x5F\u0013\u0012-\u0014RHO\\q+Y\u0000\u001a\u0015\u001c";
        objectArray[34] = "w]\u000e/c\u001dy\u0004\rL\u007f\u001cx\u0006\u001e\u001b.B$[r..\u0001v\u0010\u0012 w\u0002";
        objectArray[35] = "\u0012\u0011\u0017HoU\u0017K\u0015T\fQT!\u001bOmW\u0014E@X7Q(\u001a\u0018Q7\u0011GQA\tkj";
        objectArray[36] = "\u000bwU#4c\u000e-W?Wa1*\u00027<a\t$_ h";
        objectArray[37] = "`1\u0005\u000e$akyPGI;=}\u0001\u0018%\tk8\\@u^a<\u000fC+!90\u0005@I45q\u001b\u0016$o;y\u0013\u007f";
        objectArray[38] = "\u000476{A\u0007\u0001m4g\"\u0003>::`\u0019\u0002\u0007z'xR";
        objectArray[39] = "\u000b{Wv63\u0001d@&V1\u0001wMw\u0001`_$\u0012\u001bk<\u0005!\u0013\"+!\u001dj";
        objectArray[40] = "\u0012%F\t:D\u00071\t\b\u0001\u001c\u0013!V\u001em.@d\nH?yC>SB;@\u0003#K\t\u0001B\u001e:\r\u0002n\tGbQy";
        objectArray[41] = ".FI\u0003\u0005\u001f%\u000e\u001cJhEs\nM\u0015\u0004w!G\u0015Ch\u0011#\u0018\u0011\u0010\u0017I/\u0012\u0012r";
        objectArray[42] = "/\u0002h0r5c\u0004)2L4\u0013_*,q1w\u0004=vw\r(\\4v7bc\u0005l*L";
        objectArray[43] = "\raT}:M\u0016w\b$K\u000edh\u001cz*\u000f\u001ax\u001c%%4\u000e`\u001dg\"YUn\u0015oK";
        objectArray[44] = "C&\t#[yV2F\"`!B\"\u00194\f\u0013\u0012bBc`yL;BiY9Q#\tSPtK/\u0014l[<\u001efy";
        objectArray[45] = "\u0019M^\u0004%c\nHZRG`\u0017KF]=w<U]z:~\u001e2_].|\u0016IEX!~zVZU!v\u0001L_Z#\u001a";
        objectArray[46] = "t+\u001f\n8\u0015qq\u001d\u0016[\u001bNr\u0014M;[7i\u0002\u0011b";
        objectArray[47] = "\n!2h;6W;$+Psk'2ums\u000f|%/kO\n!2h;6W;$+P";
        objectArray[48] = "b\u0017.@%\u0014&\u001c4\u0015\\\u0003:\u00112B\u000bTdFj.e\fjBnQ=\u0015$\u0017";
        objectArray[49] = "]\u0013\u0001\u0019\u0018f\f\u0018\u001aKao\f\u0015\u001f\u001c61WHKpP<\u0003D\u0019\u000f\b0\tG";
        objectArray[50] = "/M\u001b<XxkF\u0001i!owK\u0007>v8)\u001b^R\u0010x'Z\u00046Xjn\\";
        objectArray[51] = "]\u0016KLnWXLIP\rWgO@\u000bm\u0019\u001eTVW4";
        objectArray[52] = ", Y\t^u)z[\u0015=tK\u0010U\u000e\\w*t\u000e\u0019\u0006q\u0016+V\u0010\u00061y`\u000fHZJ";
        objectArray[53] = " W\u001e%iClQ_'WB\u001cPN 9\u0002e\u0014E:l";
        objectArray[54] = "\u0005\u001aw^v\u0013A\u0011m\u000b\u000f\u0004]\u001ck\\XS\u0003O602TN\u0011?TuP\u0000\u001f";
        objectArray[55] = "Mj\f\u001c%1\u0017!\u0019K_n\u001eg\u0003\u001d3\\H'YDa\u000bNx\u0006Ae2\u000ee\u001e\n_";
        objectArray[56] = "|F_\u00126%p\u0001T\u0003W\u0011Y|{ \u000bZ|F_\u00126%p\u0001T\u0003";
        objectArray[57] = "U\u000f0r\u001bjPU2nxooRgf\u0013hW\\:qG";
        objectArray[58] = "ya{\u0010a0>e5\u001eQ1)#i\u0017=\u0003~n1NQi':2Jh):\"ypl7!d3I,*9/\tM21\u007fe0\r/)4_kO-76?e\u0016.Tz&oH<$)dc\u0001Qo$82\u000b>$}`np";
        objectArray[59] = "\u001e\u0018auezF\u0001/ ]`J\u00050,1R\u001c@mwm\u0005K\u0001 ;f8^\u0015o:]";
        objectArray[60] = "(zU:*\u0012&'Bn\u0017\u0017E!F0*\u0016!zQj,*x!Zj-\u00138<B!\u0017";
        objectArray[61] = "[7,H\u000bi^m.Tho6\u0007 O\tk]c{XSma<#QS-\u000ewz\t\u000fV";
        Object[] objectArray2 = objectArray;
        objectArray[62] = "G\u000bl>0\\AD7\u007f\u000fCE\toacq\u0011J290&H\u0010ib~YT\u00181>\u000f";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'C' || c == 'B' || c == '\u00c9' || c == 'm') {
                field = _5S.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'C' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'B' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c9' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5S.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'o' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'h' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _5S.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5S" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = _5S.e(l2, l3);
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
                clazz3 = _5S.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5S.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5S.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5S.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5S.f(2184373610569569L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5S.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5S.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5S.f(2184373610569569L, 0L);
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
            int n = _5S.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _5S.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5S.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5S.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5S.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5S.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x643C;
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
                throw new RuntimeException("dev/krypton/5S", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5S.e[n2] = n3;
        }
        return e[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5S" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5S.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field g(long l2, long l3) {
        int n = _5S.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _5S.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5S.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5S.c(clazz3, string2, clazz2)) != null) {
                    _5S.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5S.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5S.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5S.f(2184373610569569L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public native void cfr_renamed_2();

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @_3i_0
    public void cfr_renamed_0(_9o var1_1) {
        block56: {
            block57: {
                block55: {
                    block53: {
                        block54: {
                            block51: {
                                block52: {
                                    block58: {
                                        block50: {
                                            block48: {
                                                block49: {
                                                    block47: {
                                                        block46: {
                                                            block45: {
                                                                block43: {
                                                                    block44: {
                                                                        v0 = var2_2 = _5S.b ^ 87080435089947L;
                                                                        var4_3 = v0 ^ 16205417819858L;
                                                                        var6_4 = v0 ^ 112184760195590L;
                                                                        var8_5 = v0 ^ 121635547546011L;
                                                                        var10_6 = v0 ^ 8639281101641L;
                                                                        var12_7 = v0 ^ 54024109408683L;
                                                                        var14_8 = _3s.cfr_renamed_5();
                                                                        try {
                                                                            try {
                                                                                v1 = _5S.c("C", (Object)this, (long)876279319704892214L, (long)var2_2);
                                                                                if (var14_8 != null) break block43;
                                                                                if (_5S.c("C", (Object)v1, (long)876026437303121441L, (long)var2_2) != null) break block44;
                                                                            }
                                                                            catch (MatchException v2) {
                                                                                throw _5S.a(v2);
                                                                            }
                                                                            return;
                                                                        }
                                                                        catch (MatchException v3) {
                                                                            throw _5S.a(v3);
                                                                        }
                                                                    }
                                                                    v1 = _5S.c("C", (Object)this, (long)876279319704892214L, (long)var2_2);
                                                                }
                                                                var16_9 = _5S.c("C", (Object)v1, (long)876230958815613625L, (long)var2_2);
                                                                try {
                                                                    if (var14_8 != null) break block45;
                                                                    if (var16_9 instanceof class_490) {
                                                                    }
                                                                    ** GOTO lbl34
                                                                }
                                                                catch (MatchException v4) {
                                                                    throw _5S.a(v4);
                                                                }
                                                                var15_10 = (class_490)var16_9;
                                                                try {
                                                                    if (var14_8 == null) break block46;
lbl34:
                                                                    // 2 sources

                                                                    v5 = new Object[1];
                                                                    v5[0] = var4_3;
                                                                    _5S.c("o", (Object)this, (Object)v5, (long)877272885097078052L, (long)var2_2);
                                                                }
                                                                catch (MatchException v6) {
                                                                    throw _5S.a(v6);
                                                                }
                                                            }
                                                            return;
                                                        }
                                                        var16_9 = ((_4x_0)var15_10).getFocusedSlot();
                                                        try {
                                                            v7 = var16_9;
                                                            if (var14_8 != null) break block47;
                                                            if (v7 != null) {
                                                            }
                                                            ** GOTO lbl63
                                                        }
                                                        catch (MatchException v8) {
                                                            throw _5S.a(v8);
                                                        }
                                                        v7 = var16_9;
                                                    }
                                                    try {
                                                        try {
                                                            v9 = _5S.c("o", (Object)v7, (long)876392904589590197L, (long)var2_2);
                                                            if (var14_8 != null) break block48;
                                                            if (v9 <= _5S.a("k", (int)31554, (long)(7932724494066848604L ^ var2_2))) break block49;
                                                        }
                                                        catch (MatchException v10) {
                                                            throw _5S.a(v10);
                                                        }
lbl63:
                                                        // 2 sources

                                                        return;
                                                    }
                                                    catch (MatchException v11) {
                                                        throw _5S.a(v11);
                                                    }
                                                }
                                                try {
                                                    v12 = this;
                                                    if (var14_8 != null) break block50;
                                                    v9 = _5S.c("o", (Object)_5S.c("C", (Object)v12, (long)878191975511214969L, (long)var2_2), (long)var12_7, (long)877839728153575033L, (long)var2_2);
                                                }
                                                catch (MatchException v13) {
                                                    throw _5S.a(v13);
                                                }
                                            }
                                            if (v9 == false) break block58;
                                            v12 = this;
                                        }
                                        v14 = new Object[1];
                                        v14[0] = var8_5;
                                        _5S.c("o", (Object)_5S.c("o", (Object)_5S.c("C", (Object)_5S.c("C", (Object)v12, (long)876279319704892214L, (long)var2_2), (long)876026437303121441L, (long)var2_2), (long)876666429916391210L, (long)var2_2), (int)(_5S.c("o", (Object)_5S.c("C", (Object)this, (long)876552527773702717L, (long)var2_2), (Object)v14, (long)876898894443702012L, (long)var2_2) - true), (long)877777626211146675L, (long)var2_2);
                                    }
                                    try {
                                        if (_5S.c("o", (Object)_5S.c("o", (Object)var16_9, (long)877180839426467707L, (long)var2_2), (long)877648823941679607L, (long)var2_2) != _5S.c("\u00c9", (long)875961671277135376L, (long)var2_2)) {
                                            return;
                                        }
                                    }
                                    catch (MatchException v15) {
                                        throw _5S.a(v15);
                                    }
                                    try {
                                        try {
                                            v16 = _5S.c("C", (Object)this, (long)877587008598037094L, (long)var2_2);
                                            if (var14_8 != null) break block51;
                                            if (v16 <= 0) break block52;
                                        }
                                        catch (MatchException v17) {
                                            throw _5S.a(v17);
                                        }
                                        v18 = this;
                                        _5S.c("B", (Object)v18, (int)(_5S.c("C", (Object)v18, (long)877587008598037094L, (long)var2_2) - true), (long)877587008598037094L, (long)var2_2);
                                        return;
                                    }
                                    catch (MatchException v19) {
                                        throw _5S.a(v19);
                                    }
                                }
                                v16 = _5S.c("o", (Object)var16_9, (long)876392904589590197L, (long)var2_2);
                            }
                            var17_11 = v16;
                            var18_12 = _5S.c("C", (Object)((class_1723)_5S.c("o", (Object)var15_10, (long)877048777651117155L, (long)var2_2)), (long)877504029923785410L, (long)var2_2);
                            try {
                                try {
                                    v20 = _5S.c("o", (Object)_5S.c("o", (Object)_5S.c("C", (Object)_5S.c("C", (Object)this, (long)876279319704892214L, (long)var2_2), (long)876026437303121441L, (long)var2_2), (long)877087172410470321L, (long)var2_2), (Object)_5S.c("\u00c9", (long)875961671277135376L, (long)var2_2), (long)877357532480514169L, (long)var2_2);
                                    if (var14_8 != null) break block53;
                                    if (v20 != false) break block54;
                                }
                                catch (MatchException v21) {
                                    throw _5S.a(v21);
                                }
                                v22 = new Object[3];
                                v22[2] = var10_6;
                                v22[1] = (int)var17_11;
                                v22[0] = (int)var18_12;
                                _5S.c("o", (Object)this, (Object)v22, (long)876828519507308892L, (long)var2_2);
                                return;
                            }
                            catch (MatchException v23) {
                                throw _5S.a(v23);
                            }
                        }
                        v20 = _5S.c("o", (Object)_5S.c("C", (Object)this, (long)876158199230417741L, (long)var2_2), (long)var12_7, (long)877839728153575033L, (long)var2_2);
                    }
                    try {
                        try {
                            if (var14_8 != null) break block55;
                            if (v20 == false) break block56;
                        }
                        catch (MatchException v24) {
                            throw _5S.a(v24);
                        }
                        v25 = new Object[1];
                        v25[0] = var8_5;
                        v20 = _5S.c("o", (Object)_5S.c("C", (Object)this, (long)876552527773702717L, (long)var2_2), (Object)v25, (long)876898894443702012L, (long)var2_2) - true;
                    }
                    catch (MatchException v26) {
                        throw _5S.a(v26);
                    }
                }
                var19_13 = v20;
                try {
                    try {
                        v27 = this;
                        if (var14_8 != null) break block57;
                        if (_5S.c("o", (Object)_5S.c("o", (Object)_5S.c("o", (Object)_5S.c("C", (Object)_5S.c("C", (Object)v27, (long)876279319704892214L, (long)var2_2), (long)876026437303121441L, (long)var2_2), (long)876666429916391210L, (long)var2_2), (int)var19_13, (long)878004079057994663L, (long)var2_2), (Object)_5S.c("\u00c9", (long)875961671277135376L, (long)var2_2), (long)877357532480514169L, (long)var2_2) != false) break block56;
                    }
                    catch (MatchException v28) {
                        throw _5S.a(v28);
                    }
                    v27 = this;
                }
                catch (MatchException v29) {
                    throw _5S.a(v29);
                }
            }
            v30 = new Object[4];
            v30[3] = (int)var19_13;
            v30[2] = var6_4;
            v30[1] = (int)var17_11;
            v30[0] = (int)var18_12;
            _5S.c("o", (Object)v27, (Object)v30, (long)876360201114263617L, (long)var2_2);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5S.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5S.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

