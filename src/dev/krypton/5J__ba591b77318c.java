/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1642
 *  net.minecraft.class_1657
 *  net.minecraft.class_1792
 *  net.minecraft.class_1819
 *  net.minecraft.class_3966
 */
package dev.krypton;

import dev.krypton._3i_0;
import dev.krypton._3s;
import dev.krypton._4r;
import dev.krypton._4w;
import dev.krypton._66;
import dev.krypton._6C;
import dev.krypton._6x_0;
import dev.krypton._95;
import dev.krypton._9k_0;
import dev.krypton._9m_0;
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
import net.minecraft.class_1642;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1819;
import net.minecraft.class_3966;

public class _5J
extends _6x_0 {
    private final _9r cfr_renamed_2;
    private final _9k_0 cfr_renamed_9;
    private final _9r cfr_renamed_3;
    private final _9r cfr_renamed_116;
    private final _9r cfr_renamed_4;
    private final _9r cfr_renamed_1;
    private final _9r cfr_renamed_7;
    private final _9r cfr_renamed_0;
    private final _9m_0 cfr_renamed_8;
    private int cfr_renamed_6;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    private boolean boolean_1(Object[] objectArray) {
        Object object;
        block6: {
            block7: {
                boolean bl;
                block9: {
                    block8: {
                        long l2 = (Long)objectArray[0];
                        long l3 = l2 = b ^ l2;
                        long l4 = l3 ^ 0x483DCBB9F5B0L;
                        long l5 = l3 ^ 0x42C290D68641L;
                        _4w[] wArray = _3s.cfr_renamed_5();
                        try {
                            try {
                                try {
                                    object = _5J.c("T", (Object)_5J.c("\u00e5", (Object)this, 4047790280058149701L, (long)l2), (long)l4, 4049428687756337334L, (long)l2);
                                    if (wArray != null) break block6;
                                    if (object == false) break block7;
                                }
                                catch (MatchException matchException) {
                                    throw _5J.a(matchException);
                                }
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l5;
                                if (_5J.c("T", (Object)_5J.c("T", (Object)_5J.c("\u00e5", (Object)_5J.c("\u00e5", (Object)this, 4046259533913036890L, (long)l2), 4049111863934620551L, (long)l2), 4049771741852758600L, (long)l2), 4047348148910361061L, (long)l2) != _5J.c("T", (Object)_5J.c("\u00e5", (Object)this, 4047259669685942041L, (long)l2), (Object)objectArray2, 4047035761727227570L, (long)l2)) break block8;
                            }
                            catch (MatchException matchException) {
                                throw _5J.a(matchException);
                            }
                            bl = true;
                            break block9;
                        }
                        catch (MatchException matchException) {
                            throw _5J.a(matchException);
                        }
                    }
                    bl = false;
                }
                return bl;
            }
            object = true;
        }
        return (boolean)object;
    }

    public _5J(int n, char c, char c2) {
        long l2;
        long l3 = l2 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)c2 << 48 >>> 48) ^ b;
        long l4 = l3 ^ 0x618E0E3B44F8L;
        long l5 = l3 ^ 0x2CEFA95B844FL;
        long l6 = l3 ^ 0x4BF3E7EA3DA9L;
        long l7 = l6 >>> 8;
        int n2 = (int)(l6 << 56 >>> 56);
        long l8 = l3 ^ 0x37B69978CC91L;
        long l9 = l3 ^ 0x6C9D5C13293DL;
        long l10 = l3 ^ 0x28760A5C23E3L;
        long l11 = l3 ^ 0x62C2C88EA835L;
        super((int)_5J.a("z", 26140, (long)(0x786B09608D2295D2L ^ l2)), -1, (_4r)((Object)_5J.c("\u00c5", 7323647796563015853L, (long)l2)), l8);
        this.cfr_renamed_2 = new _9r((int)_5J.a("z", 6956, (long)(0x166E8C65C9AC68E6L ^ l2)), false, l4);
        this.cfr_renamed_9 = new _9k_0(0, 0.0, 20.0, 1.0, 9.0, l9, 11.0);
        this.cfr_renamed_3 = new _9r((int)_5J.a("z", 2414, (long)(0x451A4BD91FDC7AAAL ^ l2)), false, l4);
        _4w[] wArray = _3s.cfr_renamed_5();
        this.cfr_renamed_116 = new _9r((int)_5J.a("z", 26271, (long)(0x60939DB7A9C6155CL ^ l2)), false, l4);
        this.cfr_renamed_4 = new _9r((int)_5J.a("z", 16048, (long)(0x4A8C78A01644D78L ^ l2)), false, l4);
        this.cfr_renamed_1 = new _9r((int)_5J.a("z", 2766, (long)(0x783A4ECE295AF90EL ^ l2)), false, l4);
        this.cfr_renamed_7 = new _9r((int)_5J.a("z", 12355, (long)(0x274DF660A09AC381L ^ l2)), false, l4);
        this.cfr_renamed_0 = new _9r((int)_5J.a("z", 10895, (long)(0x463F6C3FC561D94EL ^ l2)), false, l4);
        this.cfr_renamed_8 = new _9m_0((int)_5J.a("z", 11481, (long)(0x233BF263EB2C5F12L ^ l2)), l5, (class_1792)_5J.c("\u00c5", 7325824524780030863L, (long)l2));
        CallSite callSite = _5J.c("\u00e5", (Object)this, 7327334358389516956L, (long)l2);
        CallSite callSite2 = _5J.c("\u00e5", (Object)this, 7325537105110779584L, (long)l2);
        _5J.c("\u00c1", (Object)callSite2, 7327102925863012461L, (long)l2);
        Object[] objectArray = new Object[3];
        objectArray[2] = () -> ((_9r)((Object)callSite2)).cfr_renamed_3(l11);
        objectArray[1] = (int)((byte)n2);
        objectArray[0] = l7;
        _5J.c("T", (Object)callSite, (Object)objectArray, 7326332855615008158L, (long)l2);
        _4w[] wArray2 = wArray;
        try {
            _95[] nullArray = new _95[_5J.a("z", 25315, (long)(0x572D538DC2BE1126L ^ l2))];
            nullArray[0] = _5J.c("\u00e5", (Object)this, 7325678122309967766L, (long)l2);
            nullArray[1] = _5J.c("\u00e5", (Object)this, 7325750547216208910L, (long)l2);
            nullArray[2] = _5J.c("\u00e5", (Object)this, 7323564438221948368L, (long)l2);
            nullArray[3] = _5J.c("\u00e5", (Object)this, 7326590942067666709L, (long)l2);
            nullArray[4] = _5J.c("\u00e5", (Object)this, 7328746753179956939L, (long)l2);
            nullArray[5] = _5J.c("\u00e5", (Object)this, 7325630744687858670L, (long)l2);
            nullArray[_5J.a("z", 9200, (long)(0x91AB58AABCAD039L ^ l2))] = _5J.c("\u00e5", (Object)this, 7326186187113664209L, (long)l2);
            nullArray[_5J.a("z", 16878, (long)(0x18F2718968233228L ^ l2))] = _5J.c("\u00e5", (Object)this, 7325537105110779584L, (long)l2);
            nullArray[_5J.a("z", 30301, (long)(0x78D8C3396ECF859AL ^ l2))] = _5J.c("\u00e5", (Object)this, 7327334358389516956L, (long)l2);
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = nullArray;
            objectArray2[0] = l10;
            _5J.c("T", (Object)this, (Object)objectArray2, 7329394341729359082L, (long)l2);
            if (_4w.cfr_renamed_8() == null) {
                _3s.cfr_renamed_4(new _4w[4]);
            }
        }
        catch (MatchException matchException) {
            throw _5J.a(matchException);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                _5J.b = l.a(1726945550595784470L, -2608250128716075879L, MethodHandles.lookup().lookupClass()).a(123997676194356L);
                _5J.j = new Object[101];
                _5J.k = new String[101];
                _5J.b();
                _5J.f = new HashMap<K, V>(13);
                var0 = _5J.b ^ 59670141659208L;
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
                var8_3 = new long[13];
                var5_4 = 0;
                var6_5 = "\u00b5>\u00a9 a\u00f9\u0006\u0010\u0007\u0099z\u00edwFlu\u00e3\u00a2af\u00a2\u00ed\u001e\u0095\u00b1\u0011v\u009b\u00f4Y\u00ecW\u00e3\u0082\u00d0\u00a3P\u0001\u00d9\u0002\u00ff@\u00d8\u00e91\u00d3u\u00bb\u00baej'{<\u000b\u00b7F\u00bb_\u00bd\u0018\u00cf\u00f0c\u00ccL\u00c2\u00d5\u0089gm\u00f5\u00b0\u00be\u009bP\u00da\u0014J\u00bav\u0080\u0096\u001a\u00c2I\u0018k";
                var7_6 = "\u00b5>\u00a9 a\u00f9\u0006\u0010\u0007\u0099z\u00edwFlu\u00e3\u00a2af\u00a2\u00ed\u001e\u0095\u00b1\u0011v\u009b\u00f4Y\u00ecW\u00e3\u0082\u00d0\u00a3P\u0001\u00d9\u0002\u00ff@\u00d8\u00e91\u00d3u\u00bb\u00baej'{<\u000b\u00b7F\u00bb_\u00bd\u0018\u00cf\u00f0c\u00ccL\u00c2\u00d5\u0089gm\u00f5\u00b0\u00be\u009bP\u00da\u0014J\u00bav\u0080\u0096\u001a\u00c2I\u0018k".length();
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
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00e6\u00e8\u001dL\u009bz\n\u0016\b\u0090mPr\u00df\u00a8\u00d4";
                    var7_6 = "\u00e6\u00e8\u001dL\u009bz\n\u0016\b\u0090mPr\u00df\u00a8\u00d4".length();
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
lbl42:
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
lbl55:
                // 1 sources

                ** continue;
            }
        }
        _5J.d = var8_3;
        _5J.e = new Integer[13];
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
            case 0 -> 3;
            case 1 -> 10;
            case 2 -> 57;
            case 3 -> 53;
            case 4 -> 1;
            case 5 -> 32;
            case 6 -> 56;
            case 7 -> 20;
            case 8 -> 19;
            case 9 -> 23;
            case 10 -> 55;
            case 11 -> 12;
            case 12 -> 7;
            case 13 -> 16;
            case 14 -> 36;
            case 15 -> 33;
            case 16 -> 61;
            case 17 -> 6;
            case 18 -> 17;
            case 19 -> 60;
            case 20 -> 58;
            case 21 -> 13;
            case 22 -> 18;
            case 23 -> 48;
            case 24 -> 47;
            case 25 -> 63;
            case 26 -> 41;
            case 27 -> 11;
            case 28 -> 54;
            case 29 -> 31;
            case 30 -> 28;
            case 31 -> 34;
            case 32 -> 44;
            case 33 -> 25;
            case 34 -> 2;
            case 35 -> 0;
            case 36 -> 4;
            case 37 -> 49;
            case 38 -> 40;
            case 39 -> 21;
            case 40 -> 15;
            case 41 -> 35;
            case 42 -> 42;
            case 43 -> 51;
            case 44 -> 14;
            case 45 -> 50;
            case 46 -> 5;
            case 47 -> 59;
            case 48 -> 8;
            case 49 -> 9;
            case 50 -> 22;
            case 51 -> 43;
            case 52 -> 37;
            case 53 -> 24;
            case 54 -> 45;
            case 55 -> 38;
            case 56 -> 52;
            case 57 -> 26;
            case 58 -> 27;
            case 59 -> 39;
            case 60 -> 29;
            case 61 -> 30;
            case 62 -> 46;
            default -> 62;
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
        _5J.k[n3] = new String(cArray);
        return n3;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _5J.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = "\"6X-3''#S-8<+3\u0011D\u0013\u0016\u001a";
        objectArray[1] = Long.TYPE;
        _5J.k[1] = "java/lang/Long";
        objectArray[2] = Integer.TYPE;
        _5J.k[2] = "java/lang/Integer";
        objectArray[3] = "T\u0012pIB$I\u0007r\bGx\u00041";
        objectArray[4] = "yS\u0019\u0017?1\fs\u0012\u0018.~m}\u0019\u0013*$\u0019";
        objectArray[5] = Void.TYPE;
        _5J.k[5] = "java/lang/Void";
        objectArray[6] = "\rcd)\u0004\u0010\rcsu\b\u001f\u0017(sk\b\n\u0010Y)4[J";
        objectArray[7] = "@.\u001d (z@.\n|$uZe\nb$`]\u0014P=v\"";
        objectArray[8] = Boolean.TYPE;
        _5J.k[8] = "java/lang/Boolean";
        objectArray[9] = "\u007f\u0010\u001cIX!\u007f\u0010\u000b\u0015T.e[\u000b\u000bT;b*_S\u0003";
        objectArray[10] = "\u0018K#\u0016/#\u0018K4J#,\u0002\u00004T#9\u0005qf\u000f{s";
        objectArray[11] = "\u0005\u001d>UKT\u0005\u001d)\tG[\u001fV)\u0017GN\u0018'xO\u0015";
        objectArray[12] = "\u0016.2b94\u0016.%>5;\fe% 5.\u000b\u0014t\u007fmy\u001b''?'\u0002J\u007fv";
        objectArray[13] = "\u001eyE\fHC\u0003lGMM\u001fCw";
        objectArray[14] = "pQR1{`\u0005qY>j/d\u007fR5nu\u0010";
        objectArray[15] = "j\u0007,p\u0013Cw\u0012.1\u0016\u001f;(";
        objectArray[16] = "6{Ck%\u0001+nA* ]kl";
        objectArray[17] = "=-J%%N=-]y)A'f]g)T \u0017\u000f<q\u0015";
        objectArray[18] = "+!6\"\u0005&+!!~\t)1j!`\t<6\u001bs?Xv";
        objectArray[19] = "\u001d\f\u001a\u0012^\u000e\u0016\u0003\u000b]?\u0000\u001d\b\u000f\u0007";
        objectArray[20] = "J`gLJMWue\rO\u0011\u00183";
        objectArray[21] = "G/K4I]2\u000f@;X\u0012S\u0001K0\\H'";
        objectArray[22] = "{v[o[g{vL3Wha=L-W}fL\u001ds\u00028";
        objectArray[23] = "\u001fU+fo2\u001fU<:c=\u0005\u001e<$c(\u0002omz6c";
        objectArray[24] = "Xf$u\u007fL-F/zn\u0003LH$qjY8";
        objectArray[25] = "\nx\u0007#r&\nx\u0010\u007f~)\u00103\u0010a~<\u0017BA;'\u007f";
        objectArray[26] = "bV=h$>bV*4(1x\u001d**($\u007flzwy";
        objectArray[27] = "4b;6GY4b,jKV.),tKC)X{+\u001d";
        objectArray[28] = "=]1n\u007ff=]&2si'\u0016&,s| gtp&>";
        objectArray[29] = "M\b7e\u001d*M\b 9\u0011%WC '\u00110P2qxI";
        objectArray[30] = "x\u0006fnj\u001bx\u0006q2f\u0014bMq,f\u0001e<#v2E";
        objectArray[31] = "4m#ov\u001e)x!.sBb";
        objectArray[32] = "J@ =p%WU\"|uy\u001e\u0017";
        objectArray[33] = Double.TYPE;
        _5J.k[33] = "java/lang/Double";
        objectArray[34] = "h(@FY3u=B\u0007\\o:5";
        objectArray[35] = "\u001f\u0005Dhv`\u001f\u0005S4zo\u0005NS*zz\u0002?\u0003\u007f-?";
        objectArray[36] = "hNrA.MhNe\u001d\"Br\u0005e\u0003\"Wut7]z\u0013";
        objectArray[37] = "\u001cpk\u0014-_\u001cp|H!P\u0006;|V!E\u0001J&\ts\u0002";
        objectArray[38] = ",\u00047yNlY$<v_#8*7}[yL";
        objectArray[39] = "\u000eQ6\t\r\f{q=\u0006\u001cC\u001a\u007f6\r\u0018\u0019n";
        objectArray[40] = ";c8\u00059^&v:D<\u0002fk";
        objectArray[41] = "G Dcfe2\u0000Olw*S\u000eDgsp'";
        objectArray[42] = "{lX=2#fyZ|7\u007f&<";
        objectArray[43] = "cW%_Y\u000f\u0016w.PH@wy%[L\u001a\u0003";
        objectArray[44] = "s-P\u0001DKs-G]HDifGCHQn\u0017\u0015\u0017\u0019\u0010";
        objectArray[45] = "&\fbh~;;\u0019`){gv\u001b";
        objectArray[46] = "uZ\r(}A\u0000z\u0006'l\u000eat\r,hT\u0015";
        objectArray[47] = "GR\u001a\u007f]qYZ\u00000<fGV\u000fj\u0000";
        objectArray[48] = "x\u007fXR\u000fE1*^i\u001eQ-?}\u0004\rp$=I\u0004;H?<U\u000fq\f/}C\u001b\rP'/^iK\u000f$x\b\u0013\u001bD(y2SKR{zH\u0003\u0000^z@";
        objectArray[49] = "*&;\u001ckYy=6\u0012\u0004Ry\")\u0017h`)dtK97)=rLv\u000fp#/\u0011\u0004";
        objectArray[50] = "1$Rb>Zb?_lQQb @i=c1d\u001c1Q\u000bagLa#J31\u001d\u000e";
        objectArray[51] = "f?j8]a2?,1c6Wq-?\tlld\u007f|\b\u000bm4w{Yq=\u007f{zc";
        objectArray[52] = "\u0011T*\u0004>u\u001c^2\u0006PwwHm\n:)L]?I;NK\u000b?\u000f-(\u000eF7\u0012P";
        objectArray[53] = "`IR#B&`DC&zx\n\u0019U|\u000b0vE].\u0016B7C\u0002}\bzn]_ z";
        objectArray[54] = "tds9p\u0018b<!?J\u0012\u001d:q1r\u0013gj:=s";
        objectArray[55] = "Z\f\u000eeAV\u0000ZQ==W`CVpW\u000e[V\u00043Vi]_P0OQ\u0004A\rm=";
        objectArray[56] = "=534x(n.>:\u0017#n1!?{\u00119qqb'F>.zde~g0'9\u0017";
        objectArray[57] = "V\u0011\u007f8!\u0006R\u001fa$YTV\u0018x8\u000e\u0003\bO TgBE\u0019s:4YH\u0017";
        objectArray[58] = "GmW(:?@t^jE?HwGs)\r\u00197\u0016,EcI6Vf9?AdK\u0014";
        objectArray[59] = "r\u0016\b\u0006\"bdNZ\u0000\u0018o\u001b\u0018Y\u0002zk\u007f\u0018T\u0013\u007f";
        objectArray[60] = "6\u0006p\u0011hB3\t4\u001b\u001a\u00168E,\u0013v$l\u0006sD!seA.\u0013p\u0019$C'\u0017\u001a";
        objectArray[61] = "\u0012_\u0003HqM\u001a\u0002\u001eW\u0017H\u007f\u0004\u0013]uO\u001b\u0004\u001eLp";
        objectArray[62] = "-tA)\u0004*2nD{e\u007f#y_\"\tMp=\u0004te'->\u00037]~3c^E";
        objectArray[63] = "\u0013(\u000e\u000b\u0003eM(LHh#\u001a\u0012\u0015]Ps\u0006o\u0002I\fy";
        objectArray[64] = "g\n`x_\u001cqR2~e\u0013\u000e\u00041|\u0007\u0015j\u0004<m\u0002";
        objectArray[65] = "u\u000fKH\u001fGcW\u0019N%I\u001cZB]^Hv\u000eB\u001bW";
        objectArray[66] = "J\u0004>}Hp\bXl~\"eV\u000eftu;\u000e]8\u0018Ie\u0007S~h@wN\t";
        objectArray[67] = "\u0017\u0018f\u001e{sD\u0003k\u0010\u0014sH\rp\u001eC#\u0011Y+rqb\u0010\u0007y\u001ep}G\u0004";
        objectArray[68] = "7D4\u00125\u001boE`BSN=Fd\u001e?|i\u0005;Ii+(To\u0014iW7^k\u0006S";
        objectArray[69] = "eL3!gm$\u000el,\u000bs|^f&\\ %\u000b=w\u000b p\u0003c)ve}\r2";
        objectArray[70] = "Bt\u0019\u0019jrT,K\u001fPz+o\u001c\n:$\u0010zNI;C\u0016s\u001aJ\"{OmG\u0017P";
        objectArray[71] = "My-\u000f\u001d}[!\u007f\t'}$w|\u000bEt@wq\u001a@";
        objectArray[72] = "=#`\u00056+*7<\u000fFkX0e\u0010,1c%7S-V>,\"\u001e(m3&:\u001cF";
        objectArray[73] = "<\u001e\u0015^>{fHJ\u0006Bu\u0006QMK(#=D\u001f\b)D:\u0012\u001fN?\"\u007f_\u0017SB";
        objectArray[74] = "kfsCz\u001b=11A\u0007\u0018:s+Hk*j0{\u0014=}jb{Nd\u0000/ou\u001f\u0007@44w]?\u0019*i*/";
        objectArray[75] = "MX[(>\u0017\u001eCV&Q\u001c\u001e\\I#=.M\u0018\u0016uQF\u001d\u001bE+#\u0007OM\u0014D";
        objectArray[76] = "\u0017\u001dZ,:=D\u0006W\"U6D\u0019H'9\u0004\u0010U\u0017qeS\u0019\f\u0019'(!D\u001dA{U";
        objectArray[77] = "=O\u001fd4D|M\u0016`^@lZ\u0019o\t\u00176\fD\u0003nVoP\u0017i/TfT";
        objectArray[78] = "\u0019}x1\nU\u000f%*70Tps)5R\\\u0014s$$W";
        objectArray[79] = "/\u000e>c`\u00039VleZ\b\u000bjle1P~\u000elh U";
        objectArray[80] = "pIp\u001d\u0007-1\u001b&Lh:\"[+\u0016\u0004\bp\u0016s@h4!\u0017{\r\u0018=3^!q";
        objectArray[81] = "b\\6VNv1G;X!}1X$]MOb\u001cy\u0000!tg\\;WD{lB#:";
        objectArray[82] = "46VZpH=$\u001f\u0000\f]2$\u0006\r`obg]V38c1^\u0006q^5f\u001c\u0004\f";
        objectArray[83] = "\t/\\v\u001bJ\u0000+Y *J\u001c1\u000b+Q'\t/\\v\u001bJ\u0000+Y *\u001a\u0006w^=\u0012C\u0018*\u0003O";
        objectArray[84] = "\u0000HO\u0003.<\u0011\t\u0000I@6\u0012J@\u0018:!9T[?=(\u001b3Q\u001a~uN^X\u001e{#\u007f_^Gy}\u0012VZB/L";
        objectArray[85] = "uC\\d\u0003G}\u001eA{eC\u0018\r\u0018f\u000f\u001a#\u0018J%\u000e}%\u0011\u001e&\u0017E|\u000fC{e";
        objectArray[86] = ";7\u001a\u007fJ\\e#\u0014:zL44\u0017l-\u001bmbO;zMh<N>\u0006]7`\r";
        objectArray[87] = "W\fgXK8AT5^q4>\u0012$SK3[TcSK";
        objectArray[88] = "s_\u0017Pqb,V\u0012F\u000e}~N\u0019EbO)\fC\u001a2\u0018|\u000f\u001c\u001f0dlP@\\\u000e";
        objectArray[89] = "\u000bm\r/0\rM~^1YQwy]43\nLl\u000fw2m\u000bm\r/0\rM~^1Y";
        objectArray[90] = "n\u001f\u0000cRSj\u0011\u001e\u007f*\u0001n\u0016\u0007c}V0F^\u000fK\u0014?\u0000\u0012f\u0011\r~B";
        objectArray[91] = "FFY\u001fQ\u001e\u0000\u0001Y\u001fkG<B\u0000Y\u0001\u001c\u0007WR\u001a\u0000{WS\r\u0015\u0017\u000b^ADOk";
        objectArray[92] = "\u0001*\u000e7zB_*Lt\u0011\u0004'\u0010\u00157o\u0007\u000foK7-D";
        objectArray[93] = "Th8\u000eA4B0j\b{==fi\n\u0019=Yfd\u001b\u001c";
        objectArray[94] = "\u0018)k>A0E83b<,I->5k{\u0013}cYY=\u0011'75X\"F$";
        objectArray[95] = "c;\u0018vjcg5\u0006j\u00121c2\u001fvEf=aF\u001aq`>:\t+toz0";
        objectArray[96] = "\u0012eGUKa\u001fo_W%ctgYDI\"HcWZU";
        objectArray[97] = "w_H`WisQV|/0{GKkC\u0002,\u0001\u0015<\u0014Ut][0P0sDRr/";
        objectArray[98] = "f\u0015\u0016\u00117\u0016pMD\u0017\r\u001d\u000f\u001bG\u0015o\u001fk\u001bJ\u0004j";
        objectArray[99] = "+\u0010\u000b9m\u000b4\u001c\f'\u0017?\u0012>&\u001eKt+\u0010\u000b9m\u000b4\u001c\f'";
        Object[] objectArray2 = objectArray;
        objectArray[100] = "\u0018a?G5\u001aKz2IZ\u0011Ke-L6#\u001b$s\u0015etFt#Y%\u000e\u0019}&OZ";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e5' || c == 'v' || c == '\u00c5' || c == 'G') {
                field = _5J.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e5' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'v' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5J.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'T' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            throw new RuntimeException("dev/krypton/5J" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l2, long l3) {
        int n = _5J.e(l2, l3);
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
                clazz3 = _5J.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5J.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5J.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5J.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5J.f(1377174565373308L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5J.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5J.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5J.f(1377174565373308L, 0L);
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
            int n = _5J.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _5J.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5J.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5J.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5J.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5J.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5J.a(n, l2);
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
            throw new RuntimeException("dev/krypton/5J" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x1678;
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
                throw new RuntimeException("dev/krypton/5J", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5J.e[n2] = n3;
        }
        return e[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field g(long l2, long l3) {
        int n = _5J.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _5J.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5J.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5J.c(clazz3, string2, clazz2)) != null) {
                    _5J.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5J.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5J.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5J.f(1377174565373308L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @_3i_0
    public void cfr_renamed_8(_6C c) {
        long l2 = b ^ 0x57CEFF32D264L;
        try {
            if (_5J.c("\u00c1", (long)_5J.c("T", (Object)_5J.c("T", (Object)_5J.c("\u00e5", (Object)this, 5752324536995737513L, (long)l2), 5752238485211373919L, (long)l2), 5747413605572620495L, (long)l2), 0, 5746711411786253073L, (long)l2) != true) {
                c.void_8();
            }
        }
        catch (MatchException matchException) {
            throw _5J.a(matchException);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @_3i_0
    public void cfr_renamed_0(_9o o) {
        _5J j;
        long l2;
        long l3;
        block154: {
            CallSite callSite;
            int n;
            int n2;
            int n3;
            block156: {
                CallSite callSite2;
                block155: {
                    Object object;
                    _4w[] wArray;
                    block150: {
                        long l4;
                        block151: {
                            class_1657 class_16572;
                            long l5;
                            block152: {
                                block153: {
                                    long l6;
                                    long l7;
                                    block147: {
                                        CallSite callSite3;
                                        block149: {
                                            block148: {
                                                block146: {
                                                    CallSite callSite4;
                                                    block144: {
                                                        block145: {
                                                            CallSite callSite5;
                                                            block143: {
                                                                CallSite callSite6;
                                                                block142: {
                                                                    _5J j2;
                                                                    block138: {
                                                                        block139: {
                                                                            CallSite callSite7;
                                                                            block140: {
                                                                                Object object2;
                                                                                block136: {
                                                                                    block137: {
                                                                                        block134: {
                                                                                            block132: {
                                                                                                block133: {
                                                                                                    block130: {
                                                                                                        block131: {
                                                                                                            _5J j3;
                                                                                                            long l8;
                                                                                                            block129: {
                                                                                                                CallSite callSite8;
                                                                                                                block127: {
                                                                                                                    block128: {
                                                                                                                        _5J j4;
                                                                                                                        block125: {
                                                                                                                            block126: {
                                                                                                                                long l9 = l3 = b ^ 0x21E071C1BBFL;
                                                                                                                                l2 = l9 ^ 0x60835C2B8253L;
                                                                                                                                l5 = l9 ^ 0x2B7FF446D1C4L;
                                                                                                                                long l10 = l9 ^ 0x41F70C830E20L;
                                                                                                                                n3 = (int)(l10 >>> 48);
                                                                                                                                n2 = (int)(l10 << 16 >>> 32);
                                                                                                                                n = (int)(l10 << 48 >>> 48);
                                                                                                                                l7 = l9 ^ 0x4C542B2C42C7L;
                                                                                                                                l8 = l9 ^ 0x11FFB5E02380L;
                                                                                                                                l6 = l9 ^ 0x329E245A6914L;
                                                                                                                                l4 = l9 ^ 0x72C6EC1F4B98L;
                                                                                                                                wArray = _3s.cfr_renamed_5();
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        j4 = this;
                                                                                                                                        if (wArray != null) break block125;
                                                                                                                                        if (_5J.c("\u00e5", (Object)j4, -8783530405037693900L, (long)l3) <= 0) break block126;
                                                                                                                                    }
                                                                                                                                    catch (MatchException matchException) {
                                                                                                                                        throw _5J.a(matchException);
                                                                                                                                    }
                                                                                                                                    _5J j5 = this;
                                                                                                                                    _5J.c("v", (Object)j5, (int)(_5J.c("\u00e5", (Object)j5, -8783530405037693900L, (long)l3) - true), -8783530405037693900L, (long)l3);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                catch (MatchException matchException) {
                                                                                                                                    throw _5J.a(matchException);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            j4 = this;
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                callSite8 = _5J.c("\u00e5", (Object)j4, -8786794037701368206L, (long)l3);
                                                                                                                                if (wArray != null) break block127;
                                                                                                                                if (_5J.c("\u00e5", (Object)callSite8, -8790559715316309756L, (long)l3) == null) break block128;
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            catch (MatchException matchException) {
                                                                                                                                throw _5J.a(matchException);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        catch (MatchException matchException) {
                                                                                                                            throw _5J.a(matchException);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        j3 = this;
                                                                                                                        if (wArray != null) break block129;
                                                                                                                        callSite8 = _5J.c("\u00e5", (Object)j3, -8786794037701368206L, (long)l3);
                                                                                                                    }
                                                                                                                    catch (MatchException matchException) {
                                                                                                                        throw _5J.a(matchException);
                                                                                                                    }
                                                                                                                }
                                                                                                                try {
                                                                                                                    if (_5J.c("\u00e5", (Object)callSite8, -8783867334885233233L, (long)l3) == null) {
                                                                                                                        return;
                                                                                                                    }
                                                                                                                }
                                                                                                                catch (MatchException matchException) {
                                                                                                                    throw _5J.a(matchException);
                                                                                                                }
                                                                                                                j3 = this;
                                                                                                            }
                                                                                                            try {
                                                                                                                Object[] objectArray = new Object[1];
                                                                                                                objectArray[0] = l8;
                                                                                                                object2 = _5J.c("T", (Object)j3, (Object)objectArray, -8789188440587058199L, (long)l3);
                                                                                                                if (wArray != null) break block130;
                                                                                                                if (object2 != false) break block131;
                                                                                                                return;
                                                                                                            }
                                                                                                            catch (MatchException matchException) {
                                                                                                                throw _5J.a(matchException);
                                                                                                            }
                                                                                                        }
                                                                                                        object2 = _5J.c("T", (Object)_5J.c("\u00e5", (Object)this, -8789028160446186437L, (long)l3), (long)l4, -8783621171966337378L, (long)l3);
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    if (wArray != null) break block132;
                                                                                                                    if (object2 == false) break block133;
                                                                                                                }
                                                                                                                catch (MatchException matchException) {
                                                                                                                    throw _5J.a(matchException);
                                                                                                                }
                                                                                                                object2 = _5J.c("\u00c1", (long)_5J.c("T", (Object)_5J.c("T", (Object)_5J.c("\u00e5", (Object)this, -8786794037701368206L, (long)l3), -8786703484722075516L, (long)l3), -8783778587115652844L, (long)l3), 0, -8783358185972249910L, (long)l3);
                                                                                                                if (wArray != null) break block132;
                                                                                                            }
                                                                                                            catch (MatchException matchException) {
                                                                                                                throw _5J.a(matchException);
                                                                                                            }
                                                                                                            if (object2 == true) break block133;
                                                                                                            return;
                                                                                                        }
                                                                                                        catch (MatchException matchException) {
                                                                                                            throw _5J.a(matchException);
                                                                                                        }
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw _5J.a(matchException);
                                                                                                    }
                                                                                                }
                                                                                                object2 = _5J.c("T", (Object)_5J.c("T", (Object)_5J.c("T", (Object)_5J.c("T", (Object)_5J.c("\u00e5", (Object)_5J.c("\u00e5", (Object)this, -8786794037701368206L, (long)l3), -8783867334885233233L, (long)l3), -8789390021424315000L, (long)l3), -8790134451984812083L, (long)l3), -8789985350683979697L, (long)l3), (Object)_5J.c("\u00c5", -8789219368935004603L, (long)l3), -8789476910553965944L, (long)l3);
                                                                                            }
                                                                                            try {
                                                                                                block135: {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                if (wArray != null) break block134;
                                                                                                                                if (object2 != false) break block135;
                                                                                                                            }
                                                                                                                            catch (MatchException matchException) {
                                                                                                                                throw _5J.a(matchException);
                                                                                                                            }
                                                                                                                            object2 = _5J.c("T", (Object)_5J.c("T", (Object)_5J.c("T", (Object)_5J.c("T", (Object)_5J.c("\u00e5", (Object)_5J.c("\u00e5", (Object)this, -8786794037701368206L, (long)l3), -8783867334885233233L, (long)l3), -8783260577286140832L, (long)l3), -8790134451984812083L, (long)l3), -8789985350683979697L, (long)l3), (Object)_5J.c("\u00c5", -8789219368935004603L, (long)l3), -8789476910553965944L, (long)l3);
                                                                                                                            if (wArray != null) break block134;
                                                                                                                        }
                                                                                                                        catch (MatchException matchException) {
                                                                                                                            throw _5J.a(matchException);
                                                                                                                        }
                                                                                                                        if (object2 != false) break block135;
                                                                                                                    }
                                                                                                                    catch (MatchException matchException) {
                                                                                                                        throw _5J.a(matchException);
                                                                                                                    }
                                                                                                                    object2 = _5J.c("T", (Object)_5J.c("T", (Object)_5J.c("\u00e5", (Object)_5J.c("\u00e5", (Object)this, -8786794037701368206L, (long)l3), -8783867334885233233L, (long)l3), -8789390021424315000L, (long)l3), -8790134451984812083L, (long)l3) instanceof class_1819;
                                                                                                                    if (wArray != null) break block134;
                                                                                                                }
                                                                                                                catch (MatchException matchException) {
                                                                                                                    throw _5J.a(matchException);
                                                                                                                }
                                                                                                                if (object2 != false) break block135;
                                                                                                            }
                                                                                                            catch (MatchException matchException) {
                                                                                                                throw _5J.a(matchException);
                                                                                                            }
                                                                                                            object2 = _5J.c("T", (Object)_5J.c("T", (Object)_5J.c("\u00e5", (Object)_5J.c("\u00e5", (Object)this, -8786794037701368206L, (long)l3), -8783867334885233233L, (long)l3), -8783260577286140832L, (long)l3), -8790134451984812083L, (long)l3) instanceof class_1819;
                                                                                                            if (wArray != null) break block136;
                                                                                                        }
                                                                                                        catch (MatchException matchException) {
                                                                                                            throw _5J.a(matchException);
                                                                                                        }
                                                                                                        if (object2 == false) break block137;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw _5J.a(matchException);
                                                                                                    }
                                                                                                }
                                                                                                object2 = _5J.c("\u00c1", (long)_5J.c("T", (Object)_5J.c("T", (Object)_5J.c("\u00e5", (Object)this, -8786794037701368206L, (long)l3), -8786703484722075516L, (long)l3), -8783778587115652844L, (long)l3), 1, -8783358185972249910L, (long)l3);
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw _5J.a(matchException);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                if (wArray != null) break block136;
                                                                                                if (object2 != true) break block137;
                                                                                                return;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw _5J.a(matchException);
                                                                                            }
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw _5J.a(matchException);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        j2 = this;
                                                                                        if (wArray != null) break block138;
                                                                                        object2 = _5J.c("T", (Object)_5J.c("\u00e5", (Object)j2, -8790930123892699976L, (long)l3), (long)l4, -8783621171966337378L, (long)l3);
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw _5J.a(matchException);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        block141: {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            if (object2 != false) break block139;
                                                                                                                            callSite7 = _5J.c("T", (Object)_5J.c("\u00e5", (Object)_5J.c("\u00e5", (Object)this, -8786794037701368206L, (long)l3), -8783867334885233233L, (long)l3), -8783930331705925643L, (long)l3);
                                                                                                                            if (wArray != null) break block140;
                                                                                                                        }
                                                                                                                        catch (MatchException matchException) {
                                                                                                                            throw _5J.a(matchException);
                                                                                                                        }
                                                                                                                        if (callSite7 != false) break block141;
                                                                                                                    }
                                                                                                                    catch (MatchException matchException) {
                                                                                                                        throw _5J.a(matchException);
                                                                                                                    }
                                                                                                                    reference cfr_temp_0 = _5J.c("\u00e5", (Object)_5J.c("T", (Object)_5J.c("\u00e5", (Object)_5J.c("\u00e5", (Object)this, -8786794037701368206L, (long)l3), -8783867334885233233L, (long)l3), -8789890975294259591L, (long)l3), -8790846023350166435L, (long)l3) - 0.0;
                                                                                                                    callSite7 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                                                                                                    if (wArray != null) break block140;
                                                                                                                }
                                                                                                                catch (MatchException matchException) {
                                                                                                                    throw _5J.a(matchException);
                                                                                                                }
                                                                                                                if (callSite7 <= 0) break block141;
                                                                                                            }
                                                                                                            catch (MatchException matchException) {
                                                                                                                throw _5J.a(matchException);
                                                                                                            }
                                                                                                            callSite7 = _5J.c("T", (Object)_5J.c("\u00e5", (Object)_5J.c("\u00e5", (Object)this, -8786794037701368206L, (long)l3), -8783867334885233233L, (long)l3), -8783289945141032229L, (long)l3);
                                                                                                            if (wArray != null) break block140;
                                                                                                        }
                                                                                                        catch (MatchException matchException) {
                                                                                                            throw _5J.a(matchException);
                                                                                                        }
                                                                                                        if (callSite7 != false) break block141;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw _5J.a(matchException);
                                                                                                    }
                                                                                                    callSite7 = _5J.c("T", (Object)_5J.c("T", (Object)_5J.c("T", (Object)_5J.c("\u00e5", (Object)_5J.c("\u00e5", (Object)this, -8786794037701368206L, (long)l3), -8783867334885233233L, (long)l3), -8787016100435296501L, (long)l3), -8790687382980195533L, (long)l3), (Object)_5J.c("\u00c5", -8790278841056051395L, (long)l3), -8789969432221706019L, (long)l3);
                                                                                                    if (wArray != null) break block140;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw _5J.a(matchException);
                                                                                                }
                                                                                                if (callSite7 == false) return;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw _5J.a(matchException);
                                                                                            }
                                                                                        }
                                                                                        callSite6 = _5J.c("\u00e5", (Object)this, -8786794037701368206L, (long)l3);
                                                                                        if (wArray != null) break block142;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw _5J.a(matchException);
                                                                                    }
                                                                                    callSite7 = _5J.c("T", (Object)_5J.c("\u00e5", (Object)callSite6, -8783867334885233233L, (long)l3), -8783930331705925643L, (long)l3);
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw _5J.a(matchException);
                                                                                }
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (callSite7 != false) break block139;
                                                                                        callSite6 = _5J.c("\u00e5", (Object)this, -8786794037701368206L, (long)l3);
                                                                                        if (wArray != null) break block142;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw _5J.a(matchException);
                                                                                    }
                                                                                    if (!(_5J.c("\u00e5", (Object)_5J.c("\u00e5", (Object)callSite6, -8783867334885233233L, (long)l3), -8788796330152930167L, (long)l3) <= 0.0)) break block139;
                                                                                    return;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw _5J.a(matchException);
                                                                                }
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw _5J.a(matchException);
                                                                            }
                                                                        }
                                                                        j2 = this;
                                                                    }
                                                                    callSite6 = _5J.c("\u00e5", (Object)j2, -8786794037701368206L, (long)l3);
                                                                }
                                                                callSite2 = _5J.c("\u00e5", (Object)callSite6, -8790765318837610505L, (long)l3);
                                                                try {
                                                                    try {
                                                                        callSite5 = callSite2;
                                                                        if (wArray != null) break block143;
                                                                        if (!(callSite5 instanceof class_3966)) return;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw _5J.a(matchException);
                                                                    }
                                                                    callSite5 = callSite2;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw _5J.a(matchException);
                                                                }
                                                            }
                                                            class_3966 class_39662 = (class_3966)callSite5;
                                                            if (_5J.c("T", (Object)_5J.c("\u00e5", (Object)_5J.c("\u00e5", (Object)this, -8786794037701368206L, (long)l3), -8790765318837610505L, (long)l3), -8784205198086778901L, (long)l3) != _5J.c("\u00c5", -8789767647766262153L, (long)l3)) return;
                                                            callSite2 = _5J.c("T", (Object)class_39662, -8789321791496995027L, (long)l3);
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    callSite4 = _5J.c("T", (Object)_5J.c("\u00e5", (Object)_5J.c("\u00e5", (Object)this, -8786794037701368206L, (long)l3), -8783867334885233233L, (long)l3), -8790096817759522216L, (long)l3);
                                                                                    if (wArray != null) break block144;
                                                                                    if (callSite4 == null) break block145;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw _5J.a(matchException);
                                                                                }
                                                                                object = _5J.c("T", (Object)_5J.c("\u00e5", (Object)this, -8783742948496419482L, (long)l3), (long)l4, -8783621171966337378L, (long)l3);
                                                                                if (wArray != null) break block146;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw _5J.a(matchException);
                                                                            }
                                                                            if (!object) break block145;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw _5J.a(matchException);
                                                                        }
                                                                        callSite4 = callSite2;
                                                                        if (wArray != null) break block144;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw _5J.a(matchException);
                                                                    }
                                                                    if (callSite4 == _5J.c("T", (Object)_5J.c("\u00e5", (Object)_5J.c("\u00e5", (Object)this, -8786794037701368206L, (long)l3), -8783867334885233233L, (long)l3), -8790096817759522216L, (long)l3)) break block145;
                                                                    return;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw _5J.a(matchException);
                                                                }
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _5J.a(matchException);
                                                            }
                                                        }
                                                        callSite4 = callSite2;
                                                    }
                                                    object = callSite4 instanceof class_1657;
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (wArray != null) break block147;
                                                                        if (object) break block148;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw _5J.a(matchException);
                                                                    }
                                                                    object = callSite2 instanceof class_1642;
                                                                    if (wArray != null) break block147;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw _5J.a(matchException);
                                                                }
                                                                if (object) break block148;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _5J.a(matchException);
                                                            }
                                                            if (_5J.c("T", (Object)_5J.c("\u00e5", (Object)this, -8789118264327705220L, (long)l3), (long)l4, -8783621171966337378L, (long)l3) == false) return;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _5J.a(matchException);
                                                        }
                                                        callSite3 = callSite2;
                                                        if (wArray != null) break block149;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _5J.a(matchException);
                                                    }
                                                    if (callSite3 == null) return;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _5J.a(matchException);
                                                }
                                            }
                                            callSite3 = callSite2;
                                        }
                                        object = callSite3 instanceof class_1657;
                                    }
                                    try {
                                        if (wArray != null) break block150;
                                        if (!object) break block151;
                                    }
                                    catch (MatchException matchException) {
                                        throw _5J.a(matchException);
                                    }
                                    class_16572 = (class_1657)callSite2;
                                    Object[] objectArray = new Object[2];
                                    objectArray[1] = _66.class;
                                    objectArray[0] = l6;
                                    _66 var25_16 = (_66)((Object)_5J.c("T", (Object)_5J.c("\u00e5", (Object)_5J.c("\u00c5", -8790986794629586563L, (long)l3), -8784055334720076370L, (long)l3), (Object)objectArray, -8789550254059179671L, (long)l3));
                                    try {
                                        try {
                                            try {
                                                object = _5J.c("T", (Object)_5J.c("\u00e5", (Object)var25_16, -8784138510886720850L, (long)l3), (long)l4, -8783621171966337378L, (long)l3);
                                                if (wArray != null) break block152;
                                                if (!object) break block153;
                                            }
                                            catch (MatchException matchException) {
                                                throw _5J.a(matchException);
                                            }
                                            Object[] objectArray2 = new Object[2];
                                            objectArray2[1] = l7;
                                            objectArray2[0] = class_16572;
                                            object = _5J.c("T", (Object)var25_16, (Object)objectArray2, -8790386819886876137L, (long)l3);
                                            if (wArray != null) break block152;
                                        }
                                        catch (MatchException matchException) {
                                            throw _5J.a(matchException);
                                        }
                                        if (!object) break block153;
                                        return;
                                    }
                                    catch (MatchException matchException) {
                                        throw _5J.a(matchException);
                                    }
                                }
                                object = _5J.c("T", (Object)_5J.c("\u00e5", (Object)this, -8786638279417600387L, (long)l3), (long)l4, -8783621171966337378L, (long)l3);
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (wArray != null) break block150;
                                                if (!object) break block151;
                                            }
                                            catch (MatchException matchException) {
                                                throw _5J.a(matchException);
                                            }
                                            object = _5J.c("T", (Object)class_16572, -8784117470701176778L, (long)l3);
                                            if (wArray != null) break block150;
                                        }
                                        catch (MatchException matchException) {
                                            throw _5J.a(matchException);
                                        }
                                        if (!object) break block151;
                                    }
                                    catch (MatchException matchException) {
                                        throw _5J.a(matchException);
                                    }
                                    Object[] objectArray = new Object[2];
                                    objectArray[1] = l5;
                                    objectArray[0] = class_16572;
                                    object = _5J.c("\u00c1", (Object)objectArray, -8783433833663894767L, (long)l3);
                                    if (wArray != null) break block150;
                                }
                                catch (MatchException matchException) {
                                    throw _5J.a(matchException);
                                }
                                if (object) break block151;
                                return;
                            }
                            catch (MatchException matchException) {
                                throw _5J.a(matchException);
                            }
                        }
                        try {
                            j = this;
                            if (wArray != null) break block154;
                            object = _5J.c("T", (Object)_5J.c("\u00e5", (Object)j, -8789673672544800701L, (long)l3), (long)l4, -8783621171966337378L, (long)l3);
                        }
                        catch (MatchException matchException) {
                            throw _5J.a(matchException);
                        }
                    }
                    try {
                        try {
                            try {
                                if (!object) break block155;
                                callSite = _5J.c("\u00e5", (Object)_5J.c("\u00e5", (Object)this, -8786794037701368206L, (long)l3), -8783867334885233233L, (long)l3);
                                if (wArray != null) break block156;
                            }
                            catch (MatchException matchException) {
                                throw _5J.a(matchException);
                            }
                            if (!(_5J.c("\u00e5", (Object)callSite, -8788796330152930167L, (long)l3) <= 0.0)) break block155;
                            return;
                        }
                        catch (MatchException matchException) {
                            throw _5J.a(matchException);
                        }
                    }
                    catch (MatchException matchException) {
                        throw _5J.a(matchException);
                    }
                }
                callSite = callSite2;
            }
            boolean bl = true;
            CallSite callSite9 = callSite;
            Object[] objectArray = new Object[5];
            objectArray[4] = n;
            objectArray[3] = n2;
            objectArray[2] = bl;
            objectArray[1] = callSite9;
            objectArray[0] = (int)((short)n3);
            _5J.c("\u00c1", (Object)objectArray, -8789501155191978594L, (long)l3);
            j = this;
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        _5J.c("v", (Object)j, (int)_5J.c("T", (Object)_5J.c("\u00e5", (Object)this, -8788955770052675677L, (long)l3), (Object)objectArray, -8783152628757000641L, (long)l3), -8783530405037693900L, (long)l3);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5J.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5J.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

