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
import dev.krypton._92;
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
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_11908;
import net.minecraft.class_11909;

public class _0N
extends _0v {
    public static final double cfr_renamed_22 = 27.0;
    private static final _8B cfr_renamed_2;
    private static final _8B cfr_renamed_23;
    private static final float cfr_renamed_5 = 4.0f;
    private static final float cfr_renamed_24 = 2.0f;
    private final _92 cfr_renamed_25;
    public boolean cfr_renamed_4;
    public double cfr_renamed_1;
    public double cfr_renamed_8;
    public float cfr_renamed_9;
    private static final long a;
    private static final long[] c;
    private static final Integer[] d;
    private static final Map e;
    private static final Object[] i;
    private static final String[] j;

    private void cfr_renamed_26(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        double d = (Double)objectArray[1];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x144022363861L;
        long l5 = l3 ^ 0x16ECC93F9B70L;
        long l6 = l3 ^ 0x7221622D75DFL;
        long l7 = l3 ^ 0x1E31212243D1L;
        long l8 = l3 ^ 0x1B29EF1FE959L;
        long l9 = l3 ^ 0x377CF0C0D3FEL;
        long l10 = l3 ^ 0x535714A490A0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l6;
        double d2 = d - (double)(_0N.c("\u00db", (Object)this, (Object)objectArray2, 7524441340654317379L, (long)l2) + 5);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l9;
        CallSite callSite = _0N.c("x", (double)(d2 / (double)(_0N.c("\u00db", (Object)this, (Object)objectArray3, 7524862836172168328L, (long)l2) - _0N.a("m", 20885, (long)(0x68B5463B84787C74L ^ l2)))), 0.0, 1.0, 7524289205808640808L, (long)l2);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l4;
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l8;
        Object[] objectArray6 = new Object[1];
        objectArray6[0] = l8;
        Object[] objectArray7 = new Object[1];
        objectArray7[0] = l7;
        Object[] objectArray8 = new Object[3];
        objectArray8[2] = (double)_0N.c("\u00db", (Object)_0N.c("\u00c0", (Object)this, 7524503877003262657L, (long)l2), (Object)objectArray7, 7523865288365445927L, (long)l2);
        objectArray8[1] = (double)(callSite * (_0N.c("\u00db", (Object)_0N.c("\u00c0", (Object)this, 7524503877003262657L, (long)l2), (Object)objectArray4, 7525868622626714579L, (long)l2) - _0N.c("\u00db", (Object)_0N.c("\u00c0", (Object)this, 7524503877003262657L, (long)l2), (Object)objectArray5, 7526105085013242682L, (long)l2)) + _0N.c("\u00db", (Object)_0N.c("\u00c0", (Object)this, 7524503877003262657L, (long)l2), (Object)objectArray6, 7526105085013242682L, (long)l2));
        objectArray8[0] = l5;
        Object[] objectArray9 = new Object[2];
        objectArray9[1] = l10;
        objectArray9[0] = (double)_0N.c("x", (Object)objectArray8, 7524966563738534859L, (long)l2);
        _0N.c("\u00db", (Object)_0N.c("\u00c0", (Object)this, 7524503877003262657L, (long)l2), (Object)objectArray9, 7525035478100716397L, (long)l2);
    }

    public _0N(_4t t, _95 var2_2, long l2, int n) {
        long l3 = (l2 = a ^ l2) ^ 0x2AD88CA3A15BL;
        int n2 = (int)(l3 >>> 48);
        int n3 = (int)(l3 << 16 >>> 32);
        int n4 = (int)(l3 << 48 >>> 48);
        super((short)n2, t, var2_2, n, n3, (char)n4);
        _0N.c("\u00e6", (Object)this, 0.0, 718138967506488496L, (long)l2);
        _0N.c("\u00e6", (Object)this, 0.0f, 714261858231760859L, (long)l2);
        this.cfr_renamed_25 = (_92)var2_2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                _0N.a = l.a(-3653031000821885704L, -8981417932374193130L, MethodHandles.lookup().lookupClass()).a(102425821998323L);
                var11 = _0N.a ^ 126519716421611L;
                var13_1 = var11 ^ 139211385190530L;
                _0N.i = new Object[83];
                _0N.j = new String[83];
                _0N.b();
                _0N.e = new HashMap<K, V>(13);
                var0_2 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var1_3 = 1; var1_3 < 8; ++var1_3) {
                    v2 = v2;
                    v2[var1_3] = (byte)(var11 << var1_3 * 8 >>> 56);
                }
                var0_2.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var6_4 = new long[13];
                var3_5 = 0;
                var4_6 = "\u00f5\u00b3\u00e9\u0003\u00b7\u00a7\u00b5O/\u001d-\u00f6E\u00b6\u00cd\u0001\u008f\u00a0\u00fbu\u00fd\u00db\u00e0W6\u000f\u00a92\u0092g\u0095\u0003\u00b5\u008e}\u008c\u00ac\u00f5\u00c6\u00bc\u00ff\u00d2yE\u00c7\u0082\u00b0\u0005q\u00aem\u00eb\u00aa\u00b1\u0084\u00ba\u00f9\u000f^\u00b3\u00f0\u00e2\u00f4}\u00cf\u00a2\u0002\u00ad\u001aU\u000b\u00bb\u00fc[\u00a9'\f\u00a8\u00dc\u00d6#\u00b3%\u00a5\u00c1f\u00a2U";
                var5_7 = "\u00f5\u00b3\u00e9\u0003\u00b7\u00a7\u00b5O/\u001d-\u00f6E\u00b6\u00cd\u0001\u008f\u00a0\u00fbu\u00fd\u00db\u00e0W6\u000f\u00a92\u0092g\u0095\u0003\u00b5\u008e}\u008c\u00ac\u00f5\u00c6\u00bc\u00ff\u00d2yE\u00c7\u0082\u00b0\u0005q\u00aem\u00eb\u00aa\u00b1\u0084\u00ba\u00f9\u000f^\u00b3\u00f0\u00e2\u00f4}\u00cf\u00a2\u0002\u00ad\u001aU\u000b\u00bb\u00fc[\u00a9'\f\u00a8\u00dc\u00d6#\u00b3%\u00a5\u00c1f\u00a2U".length();
                var2_8 = 0;
                while (true) {
                    var7_9 = var4_6.substring(var2_8, var2_8 += 8).getBytes("ISO-8859-1");
                    v3 = var6_4;
                    v4 = var3_5++;
                    v5 = ((long)var7_9[0] & 255L) << 56 | ((long)var7_9[1] & 255L) << 48 | ((long)var7_9[2] & 255L) << 40 | ((long)var7_9[3] & 255L) << 32 | ((long)var7_9[4] & 255L) << 24 | ((long)var7_9[5] & 255L) << 16 | ((long)var7_9[6] & 255L) << 8 | (long)var7_9[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl31:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var2_8 < var5_7) ** continue;
                    var4_6 = "\u0080\u00af\u00dak\u0099\u00eb\u000b\u001c\u000e\u00a5\n\r\u00bb\u0004\u0006O";
                    var5_7 = "\u0080\u00af\u00dak\u0099\u00eb\u000b\u001c\u000e\u00a5\n\r\u00bb\u0004\u0006O".length();
                    var2_8 = 0;
                    while (true) {
                        var7_9 = var4_6.substring(var2_8, var2_8 += 8).getBytes("ISO-8859-1");
                        v3 = var6_4;
                        v4 = var3_5++;
                        v5 = ((long)var7_9[0] & 255L) << 56 | ((long)var7_9[1] & 255L) << 48 | ((long)var7_9[2] & 255L) << 40 | ((long)var7_9[3] & 255L) << 32 | ((long)var7_9[4] & 255L) << 24 | ((long)var7_9[5] & 255L) << 16 | ((long)var7_9[6] & 255L) << 8 | (long)var7_9[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl44:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var2_8 < var5_7) ** continue;
                    break block9;
                    break;
                }
            }
            var8_10 = v5;
            var10_11 = var0_2.doFinal(new byte[]{(byte)(var8_10 >>> 56), (byte)(var8_10 >>> 48), (byte)(var8_10 >>> 40), (byte)(var8_10 >>> 32), (byte)(var8_10 >>> 24), (byte)(var8_10 >>> 16), (byte)(var8_10 >>> 8), (byte)var8_10});
            v7 = ((long)var10_11[0] & 255L) << 56 | ((long)var10_11[1] & 255L) << 48 | ((long)var10_11[2] & 255L) << 40 | ((long)var10_11[3] & 255L) << 32 | ((long)var10_11[4] & 255L) << 24 | ((long)var10_11[5] & 255L) << 16 | ((long)var10_11[6] & 255L) << 8 | (long)var10_11[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl57:
                // 1 sources

                ** continue;
            }
        }
        _0N.c = var6_4;
        _0N.d = new Integer[13];
        _0N.cfr_renamed_2 = new _8B((int)_0N.a("m", (int)14498, (long)(1509799384580130805L ^ var11)), (int)_0N.a("m", (int)10676, (long)(104430847781148399L ^ var11)), var13_1, (int)_0N.a("m", (int)15923, (long)(5068616561664590186L ^ var11)), (int)_0N.a("m", (int)18636, (long)(7698749932935509913L ^ var11)));
        _0N.cfr_renamed_23 = new _8B((int)_0N.a("m", (int)14823, (long)(8515784507588773567L ^ var11)), (int)_0N.a("m", (int)16986, (long)(6528037209458310407L ^ var11)), var13_1, (int)_0N.a("m", (int)16986, (long)(6528037209458310407L ^ var11)), (int)_0N.a("m", (int)31130, (long)(3121385942845900491L ^ var11)));
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (j[n3] != null) {
            return n3;
        }
        Object object = i[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 15;
            case 1 -> 14;
            case 2 -> 50;
            case 3 -> 38;
            case 4 -> 27;
            case 5 -> 54;
            case 6 -> 5;
            case 7 -> 18;
            case 8 -> 19;
            case 9 -> 45;
            case 10 -> 3;
            case 11 -> 12;
            case 12 -> 36;
            case 13 -> 52;
            case 14 -> 63;
            case 15 -> 31;
            case 16 -> 13;
            case 17 -> 53;
            case 18 -> 10;
            case 19 -> 25;
            case 20 -> 61;
            case 21 -> 0;
            case 22 -> 56;
            case 23 -> 8;
            case 24 -> 59;
            case 25 -> 42;
            case 26 -> 9;
            case 27 -> 33;
            case 28 -> 44;
            case 29 -> 62;
            case 30 -> 34;
            case 31 -> 26;
            case 32 -> 30;
            case 33 -> 55;
            case 34 -> 23;
            case 35 -> 4;
            case 36 -> 7;
            case 37 -> 48;
            case 38 -> 46;
            case 39 -> 60;
            case 40 -> 43;
            case 41 -> 16;
            case 42 -> 24;
            case 43 -> 35;
            case 44 -> 21;
            case 45 -> 2;
            case 46 -> 32;
            case 47 -> 20;
            case 48 -> 37;
            case 49 -> 49;
            case 50 -> 29;
            case 51 -> 58;
            case 52 -> 57;
            case 53 -> 39;
            case 54 -> 51;
            case 55 -> 41;
            case 56 -> 40;
            case 57 -> 28;
            case 58 -> 47;
            case 59 -> 11;
            case 60 -> 17;
            case 61 -> 22;
            case 62 -> 6;
            default -> 1;
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
        _0N.j[n3] = new String(cArray);
        return n3;
    }

    @Override
    public void void_9(Object[] objectArray) {
        _0N n;
        long l2;
        class_11909 class_119092;
        block6: {
            block7: {
                class_119092 = (class_11909)objectArray[0];
                long l3 = (Long)objectArray[1];
                l2 = l3 ^ 0L;
                boolean bl = _02.cfr_renamed_3();
                try {
                    try {
                        try {
                            n = this;
                            if (!bl) break block6;
                            if (_0N.c("\u00c0", (Object)n, 9007908862241232241L, (long)l3) == false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw _0N.a(matchException);
                        }
                        if (_0N.c("\u00db", (Object)class_119092, 9008670157311135146L, (long)l3) != false) break block7;
                    }
                    catch (MatchException matchException) {
                        throw _0N.a(matchException);
                    }
                    _0N.c("\u00e6", (Object)this, (boolean)_0N.a("m", 32695, (long)(0x2CB08EB3A021C73AL ^ l3)), 9007908862241232241L, (long)l3);
                }
                catch (MatchException matchException) {
                    throw _0N.a(matchException);
                }
            }
            n = this;
        }
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = class_119092;
        super.void_9(objectArray2);
    }

    private static void b() {
        Object[] objectArray = i;
        i[0] = "\"r4@it?g6\u0001l(rc";
        objectArray[1] = Boolean.TYPE;
        _0N.j[1] = "java/lang/Boolean";
        objectArray[2] = "\u0000gg'Jq\u001drefO-]0";
        objectArray[3] = "S `77S&\u0000k8&\u001cG\u000e`3\"F3";
        objectArray[4] = Double.TYPE;
        _0N.j[4] = "java/lang/Double";
        objectArray[5] = "DZ=@}7YO?\u0001xk\u0010I";
        objectArray[6] = "f\u000e2+s\u0011{\u001b0jvM2%";
        objectArray[7] = "\u000e\u0016K\"@%\u000e\u0016\\~L*\u0014]\\`L?\u0013,\u000e=\u0014|X";
        objectArray[8] = Integer.TYPE;
        _0N.j[8] = "java/lang/Integer";
        objectArray[9] = "Lb\\L\u0014W9BWC\u0005\u0018XL\\H\u0001B,";
        objectArray[10] = Void.TYPE;
        _0N.j[10] = "java/lang/Void";
        objectArray[11] = "N\u0002=<\\{;\"63M4Z,=8In.";
        objectArray[12] = "p)b$uj\u0005\ti+d%d\u0007b `\u007f\u0010";
        objectArray[13] = "Eu9W\u0014NX`;\u0016\u0011\u0012\u0015A";
        objectArray[14] = "B\u0019\u000b6}\u000179\u00009lNV7\u000b2h\u0014\"";
        objectArray[15] = "X\u0013\u000eLW`S\u001c\u001f\u0003*x@\u001b\u0016J";
        objectArray[16] = "\u0013\u0002Z{\u001d~\u0013\u0002M'\u0011q\tIM9\u0011d\u000e8\u001d`C%";
        objectArray[17] = "aH\u001eC`s\u0014h\u0015Lq<uf\u001eGuf\u0001";
        objectArray[18] = "71Y\n1QB\u0011R\u0005 \u001e#\u001fY\u000e$DW";
        objectArray[19] = "\u0005bOp\u001a\u001cpBD\u007f\u000bS\u0011LOt\u000f\te";
        objectArray[20] = "y\u0017\bWa\f\f7\u0003XpCm9\bSt\u0019\u0019";
        objectArray[21] = "\\$oIj>)\u0004dF{qH\noM\u007f+<";
        objectArray[22] = "-m\u001e\u001b\u00160-m\tG\u001a?7&\tY\u001a*0W[\u0004Biz";
        objectArray[23] = "c|\u007fg\u0000\u0010\u0016\\th\u0011_wR\u007fc\u0015\u0005\u0003";
        objectArray[24] = ":[\u001bCdCO{\u0010Lu\f.u\u001bGqVZ";
        objectArray[25] = Float.TYPE;
        _0N.j[25] = "java/lang/Float";
        objectArray[26] = "'3@\u000fGy:&BNB%{a";
        objectArray[27] = "s_\u0000X!O\u0006\u007f\u000bW0\u0000gq\u0000\\4Z\u0013";
        objectArray[28] = "\\[dVA;ANf\u0017Dg\u0000|";
        objectArray[29] = "]ma)]\r(Mj&LBICa-H\u0018=";
        objectArray[30] = "_\fh\u0002n.*,c\r\u007faK\"h\u0006{;?";
        objectArray[31] = "L\u0010\u0012*{J90\u0019%j\u0005X>\u0012.n_,";
        objectArray[32] = "3&E<(rF\u0006N39='\bE8=gS";
        objectArray[33] = "hlM\u0000H\nuyOAMV5<";
        objectArray[34] = "(\u0010nx\u00158]0ew\u0004w<>n|\u0000-H";
        objectArray[35] = "5\rCy\nJ>\u0002R6iG+\u0004";
        objectArray[36] = ".#pKu\n[\u0003{DdE:\rpO`\u001fN";
        objectArray[37] = "\u001b\u0011q\u0001\u007f=n1z\u000enr\u000f?q\u0005j({";
        objectArray[38] = "Zd\u001c\u0006#v/D\u0017\t29NJ\u001c\u00026c:";
        objectArray[39] = "\u0018\u001bPh\u0011Wm;[g\u0000\u0018\f5Pl\u0004Bx";
        objectArray[40] = "Q\"LAc~Z-]\u000e\u0002pQ&YT";
        objectArray[41] = "+:A\u0013``y/\u0002\b\\u(<\u001c\u00100Gz|FKa\u0010x#\u0017Ff.=~\u0018\f\\";
        objectArray[42] = "N\\\u0000\"RF_Y\u0015<)YIF\u0011=Ek\u001d\u0007Jg\u0011<\u001eDA+TDNB\u000eg)\u0006Z\n\u0000'QV\\ELZ\u0013B\u0014K\f\"CD[\u0007q`W\fUG\t0QC\u0019:";
        objectArray[43] = "puE;3Uu.\u001d`T\u0014Z\u001f\u000e8+U}r\u000b';O\u0011 \u0010:e\u0012\u007f}K4(/";
        objectArray[44] = "Rycw&u\u000eizgJ'kqxj0v\u0006tgz*\u001aQu)d7b\u0001sf(J";
        objectArray[45] = "\u0001+#D\u0004\\M$ Mt\u0004=-9\u001b\u000eCZ% SK";
        objectArray[46] = "=~HaYk5:I\u000e\u0006\u0014\u0004~\u00192\u00043?<Kg\u0004";
        objectArray[47] = "i\u0002i\u00150\u007f%\rj\u001c@$U\u001ck\u0005:u8\u0019t\u0015 \u0019<\u0001s\u0002;)e\u00075\b@";
        objectArray[48] = "~Q\u007f$\u0000B,Sm7>@O\u0013b$D\u0013\"\u0016}4^\u007fu\u00173*C\u0007%\u0011|f>";
        objectArray[49] = "\u0003;5\u0013S,_+,\u0003?\u007f:3.\u000eE/W61\u001e_C\u00007\u007f\u0000B;P10L?";
        objectArray[50] = "+!jbx,\u007f'?>A|\u0010 7|;-}%(l!A-9=2{\u007fhd2xA";
        objectArray[51] = "%R\u0013r\u0003di]\u0010{s2!6\n|\fxu[\u000fc\u001cb\u0019\t\u0014~B?wTOp\u000f\u0002";
        objectArray[52] = "e]2\n~\u00061[gVGU^\\o\u0014=\u00073Yp\u0004'kcEeZ}U&\u0018j\u0010G";
        objectArray[53] = "{!Yhsh7.Za\u00032\u001dE\u0003uyl+*_e`|";
        objectArray[54] = "-iiQ\u001fapib\u0016#8}zc\bO\n/:9U\u0013]-eh^\u0019ch8g\u0014#";
        objectArray[55] = "yn\u0015D7\u00135a\u0016MGME3J\u0017y\u0016~q\u0018By";
        objectArray[56] = "%X\u00065\u001cMiW\u0005<l\u0016\u0019\u0006\u001bj\u001dVaV\u001d%Q";
        objectArray[57] = "MV\nK\r1\u0011F\u0013[adt^\u0011V\u001b2\u0019[\u000eF\u0001^NZ@X\u001c&\u001e\\\u000f\u0014a";
        objectArray[58] = "?\\:oSmm^(|mh\u000e\u001e'o\u0017<c\u001b8\u007f\rPg\u0003?h\u0016`>\u0005ybm";
        objectArray[59] = "|\u0012U7^U(\u0014\u0000kg\u0007G\u0013\b)\u001dT*\u0016\u00179\u00078z\n\u0002g]\u0006?W\r-g";
        objectArray[60] = "\u0007m\u000fFd\u0010Uo\u001dUZ\u00156/\u0012F A[*\rV:-\f+CH'U\\-\f\u0004Z";
        objectArray[61] = "!V\u000b5\u001ac}F\u0012%v=\u0018^\u0010(\f`u[\u000f8\u0016\f'@\u0012fKbz\u001b\u001c+v";
        objectArray[62] = "v\u0011\u0014{D\u001f\"\u0017A'}BMS\u0014&C\u0011v\u0011FsC";
        objectArray[63] = "S4ns\u001b]Vo6(|\u0018Q^%p\u0003]^3 o\u0013G2a;rM\u001a\\<`|\u0000'";
        objectArray[64] = ",2Q\u0019\u0003suaUH= JyM^Gq'|RN]\u001d#dUYF-zb\u0013S=";
        objectArray[65] = "a'O\"SU=7V2?\u0004X/T?EV5*K/_:b+\u00051BB2-J}?";
        objectArray[66] = "%\u001b5aa/i\u00146h\u0011x\u0019E(>`4a\u0015.q,";
        objectArray[67] = "xpUj'k4\u007fVcW2DtUd0r'kF>9";
        objectArray[68] = "\n6\u001az\u0014J\u0011:\u00152.F\u0007,~cMN\n(\u001d|^\u0014\u0003W\u001e`OH\u00124\u0001s\u0015Am";
        objectArray[69] = "\u000eN^H_P\u000b\u0015\u0006\u00138\u0016o^\u000eUBF\u0002[\u0011EX*UZ_[ER\u0005\\\u0010\u00178";
        objectArray[70] = "l4rm\u0005<82'1<kW5/sF=:00c\\Qj,%=\u0006o/q*w<";
        objectArray[71] = "ac\u0007hY,5eR4`|a\u0018YpP;#\u007fQi\u0018~";
        objectArray[72] = "\u001e\u0005+\u00127d\u000f\u0000>\fL{\u0019\u001f:\r IM^aTw\u001e\u0014\u0000;\r3}\u000b\u0013a\u0004L~\u0017\u0002=\u0015/a\u0004X4j,}\u0015\u0004%\t3nO\rZ\n/\u007f\u0013\u001c9\u0015<%\u001ac";
        objectArray[73] = "\u0006\u00010*tvR\u0007evM&=\u0000m47wP\u0005r$-\u001b\u0004F0u. F\u0014euM";
        objectArray[74] = "\u0005p\n{r*Wr\u0018hL.42\u0017{6{Y7\bk,\u0017\u000e6Fu1o^0\t9L";
        objectArray[75] = "F\u0004zx/\u000f\u0012\u0002/$\u0016Y}F\u007fty\u0001FN;u";
        objectArray[76] = "}H\t\u0013tR!X\u0010\u0003\u0018\u0004D@\u0012\u000ebQ)E\r\u001ex=~DC\u0000eE.B\fL\u0018";
        objectArray[77] = "\\D\u0019@';\u000eQZ[\u001b U[\\s't\u0003\u000e$\u001ee{CC\\Nc4\u000f>";
        objectArray[78] = "`\bO\u0014%R4\u000e\u001aH\u001c\u0003[N\u0010\u001e-\u0005e\u000bM\u0011g";
        objectArray[79] = "zn\u0010\u00132_({S\b\u000eDsqU 2\u0010%%-Mp\u001feiU\u001dvP)\u0014";
        objectArray[80] = "0\u000b\bw~,|\u0004\u000b~\u000evLo\ta>0u\b\u0001xvu";
        objectArray[81] = "j -K\"[o{u\u0010E\u0011\u000b0}V?Mf5bF%!14,X8Ya2c\u0014E";
        Object[] objectArray2 = objectArray;
        objectArray[82] = "Y\u0019,5\u001b{\r\u001fyi\",b\u0000idXo\u0005\bp,\u001d";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c0' || c == '\u00e6' || c == 'T' || c == '\u00fd') {
                field = _0N.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c0' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e6' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'T' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _0N.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00db' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'x' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _0N.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0N" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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
        int n = _0N.e(l2, l3);
        Object object = i[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = j[n];
                int n3 = string2.indexOf(8);
                clazz3 = _0N.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _0N.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _0N.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _0N.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _0N.f(2848204769767332L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _0N.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _0N.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _0N.f(2848204769767332L, 0L);
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
            int n = _0N.e(l2, l3);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                _0N.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _0N.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _0N.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _0N.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _0N.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0N" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _0N.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x4581;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])e.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/0N", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _0N.d[n2] = n3;
        }
        return d[n2];
    }

    private static Field g(long l2, long l3) {
        int n = _0N.e(l2, l3);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = _0N.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _0N.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _0N.c(clazz3, string2, clazz2)) != null) {
                    _0N.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _0N.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _0N.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _0N.f(2848204769767332L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public void void_6(Object[] objectArray) {
        class_11909 class_119092;
        _0N n;
        long l2;
        boolean bl;
        block6: {
            class_11909 class_119093;
            block7: {
                class_119093 = (class_11909)objectArray[0];
                bl = (Boolean)objectArray[1];
                long l3 = (Long)objectArray[2];
                long l4 = l3;
                long l5 = l4 ^ 0x51639D72C1DAL;
                long l6 = l4 ^ 0xA239397A5E5L;
                l2 = l4 ^ 0L;
                boolean bl2 = _02.cfr_renamed_3();
                try {
                    try {
                        try {
                            n = this;
                            class_119092 = class_119093;
                            if (!bl2) break block6;
                            Object[] objectArray2 = new Object[3];
                            objectArray2[2] = l6;
                            objectArray2[1] = (double)_0N.c("\u00db", (Object)class_119093, 5521286111918640932L, (long)l3);
                            objectArray2[0] = (double)_0N.c("\u00db", (Object)class_119092, 5521157751014740577L, (long)l3);
                            if (_0N.c("\u00db", (Object)n, (Object)objectArray2, 5520883384111103928L, (long)l3) == false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw _0N.a(matchException);
                        }
                        if (_0N.c("\u00db", (Object)class_119093, 5514150094566751273L, (long)l3) != false) break block7;
                    }
                    catch (MatchException matchException) {
                        throw _0N.a(matchException);
                    }
                    _0N.c("\u00e6", (Object)this, (boolean)_0N.a("m", 19299, (long)(0x720E381A137B4265L ^ l3)), 5512844575340520690L, (long)l3);
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = (double)_0N.c("\u00db", (Object)class_119093, 5521157751014740577L, (long)l3);
                    objectArray3[0] = l5;
                    _0N.c("\u00db", (Object)this, (Object)objectArray3, 5512555626316925980L, (long)l3);
                }
                catch (MatchException matchException) {
                    throw _0N.a(matchException);
                }
            }
            n = this;
            class_119092 = class_119093;
        }
        Object[] objectArray4 = new Object[3];
        objectArray4[2] = l2;
        objectArray4[1] = bl;
        objectArray4[0] = class_119092;
        super.void_6(objectArray4);
    }

    @Override
    public void void_4(Object[] objectArray) {
        block12: {
            _0N n;
            long l2;
            class_11908 class_119082;
            block10: {
                block11: {
                    class_119082 = (class_11908)objectArray[0];
                    long l3 = (Long)objectArray[1];
                    long l4 = l3;
                    long l5 = l4 ^ 0x763AC732B879L;
                    l2 = l4 ^ 0L;
                    long l6 = l4 ^ 0x275E9D2BA04BL;
                    boolean bl = _02.cfr_renamed_3();
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        n = this;
                                        if (!bl) break block10;
                                        if (_0N.c("\u00c0", (Object)n, 6378716309164525743L, (long)l3) == false) break block11;
                                    }
                                    catch (MatchException matchException) {
                                        throw _0N.a(matchException);
                                    }
                                    if (l3 < 0L) break block12;
                                    n = this;
                                    if (!bl) break block10;
                                }
                                catch (MatchException matchException) {
                                    throw _0N.a(matchException);
                                }
                                if (_0N.c("\u00c0", (Object)_0N.c("\u00c0", (Object)n, 6384020632406100730L, (long)l3), 6377622815343377382L, (long)l3) == false) break block11;
                            }
                            catch (MatchException matchException) {
                                throw _0N.a(matchException);
                            }
                            if (_0N.c("\u00db", (Object)class_119082, 6379308112103390591L, (long)l3) != _0N.a("m", 7753, (long)(0x62A8D463A0578345L ^ l3))) break block11;
                        }
                        catch (MatchException matchException) {
                            throw _0N.a(matchException);
                        }
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l5;
                        Object[] objectArray3 = new Object[2];
                        objectArray3[1] = l6;
                        objectArray3[0] = (double)_0N.c("\u00db", (Object)_0N.c("\u00c0", (Object)this, 6379098601512700458L, (long)l3), (Object)objectArray2, 6378825574501772938L, (long)l3);
                        _0N.c("\u00db", (Object)_0N.c("\u00c0", (Object)this, 6379098601512700458L, (long)l3), (Object)objectArray3, 6378574731895413638L, (long)l3);
                    }
                    catch (MatchException matchException) {
                        throw _0N.a(matchException);
                    }
                }
                n = this;
            }
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = l2;
            objectArray4[0] = class_119082;
            super.void_4(objectArray4);
        }
    }

    private String java_lang_String_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x2270D55100F9L;
        long l5 = l3 ^ 0x5D1940FAC4DEL;
        long l6 = l3 ^ 0x25A5D428D2B5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l6;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l5;
        Object[] objectArray4 = new Object[3];
        objectArray4[2] = (double)_0N.c("\u00db", (Object)_0N.c("\u00c0", (Object)this, -1197065518951121458L, (long)l2), (Object)objectArray3, -1196443792350997464L, (long)l2);
        objectArray4[1] = (double)_0N.c("\u00db", (Object)_0N.c("\u00c0", (Object)this, -1197065518951121458L, (long)l2), (Object)objectArray2, -1197894957286397415L, (long)l2);
        objectArray4[0] = l4;
        return _0N.c("x", (Object)objectArray4, -1197726719617457823L, (long)l2);
    }

    @Override
    public void void_7(Object[] objectArray) {
        _0N n;
        long l2;
        double d;
        double d2;
        class_11909 class_119092;
        block5: {
            block6: {
                class_119092 = (class_11909)objectArray[0];
                d2 = (Double)objectArray[1];
                d = (Double)objectArray[2];
                long l3 = (Long)objectArray[3];
                long l4 = l3;
                long l5 = l4 ^ 0x59BE011BDFB8L;
                l2 = l4 ^ 0L;
                boolean bl = _02.cfr_renamed_2();
                try {
                    try {
                        n = this;
                        if (bl) break block5;
                        if (_0N.c("\u00c0", (Object)n, 5972765085690854032L, (long)l3) != false) {
                        }
                        break block6;
                    }
                    catch (MatchException matchException) {
                        throw _0N.a(matchException);
                    }
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = (double)_0N.c("\u00db", (Object)class_119092, 5979970400988810243L, (long)l3);
                    objectArray2[0] = l5;
                    _0N.c("\u00db", (Object)this, (Object)objectArray2, 5972477889547506302L, (long)l3);
                }
                catch (MatchException matchException) {
                    throw _0N.a(matchException);
                }
            }
            n = this;
        }
        Object[] objectArray3 = new Object[4];
        objectArray3[3] = l2;
        objectArray3[2] = d;
        objectArray3[1] = d2;
        objectArray3[0] = class_119092;
        super.void_7(objectArray3);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    protected void void_8(Object[] var1_1) {
        block29: {
            block30: {
                block27: {
                    block28: {
                        block26: {
                            block25: {
                                block24: {
                                    block23: {
                                        var6_2 = (_87)var1_1[0];
                                        var4_3 = (Integer)var1_1[1];
                                        var5_4 = (Integer)var1_1[2];
                                        var2_5 = (Long)var1_1[3];
                                        var7_6 = ((Float)var1_1[4]).floatValue();
                                        v0 = var2_5;
                                        var8_7 = v0 ^ 59290728020832L;
                                        var10_8 = v0 ^ 130073120665672L;
                                        var12_9 = v0 ^ 95709668128785L;
                                        var14_10 = v0 ^ 22127149028955L;
                                        var16_11 = v0 ^ 34444778567253L;
                                        var18_12 = v0 ^ 92767652897081L;
                                        var20_13 = v0 ^ 47222545303306L;
                                        var22_14 = v0 ^ 91869129438942L;
                                        var24_15 = v0 ^ 64345050573400L;
                                        var26_16 = v0 ^ 83800344396297L;
                                        var28_17 = v0 ^ 115287338860829L;
                                        var30_18 = v0 ^ 25084223738111L;
                                        var32_19 = v0 ^ 139830812653352L;
                                        var34_20 = v0 ^ 78207681189563L;
                                        var36_21 = v0 ^ 81897494890085L;
                                        var38_22 = v0 ^ 9380807438905L;
                                        v1 = new Object[1];
                                        v1[0] = var22_14;
                                        var41_23 = _0N.c("\u00db", (Object)this, (Object)v1, (long)7740858886227815490L, (long)var2_5) + 5;
                                        v2 = new Object[1];
                                        v2[0] = var30_18;
                                        var42_24 = _0N.c("\u00db", (Object)this, (Object)v2, (long)7740719420911820681L, (long)var2_5) - _0N.a("m", (int)24005, (long)(1496524912958829350L ^ var2_5));
                                        var40_25 = _02.cfr_renamed_3();
                                        v3 = new Object[1];
                                        v3[0] = var34_20;
                                        v4 = new Object[1];
                                        v4[0] = var24_15;
                                        v5 = new Object[1];
                                        v5[0] = var8_7;
                                        v6 = new Object[1];
                                        v6[0] = var24_15;
                                        var43_26 = (_0N.c("\u00db", (Object)_0N.c("\u00c0", (Object)this, (long)7740924441943226816L, (long)var2_5), (Object)v3, (long)7741224207413997079L, (long)var2_5) - _0N.c("\u00db", (Object)_0N.c("\u00c0", (Object)this, (long)7740924441943226816L, (long)var2_5), (Object)v4, (long)7742594992749129787L, (long)var2_5)) / (_0N.c("\u00db", (Object)_0N.c("\u00c0", (Object)this, (long)7740924441943226816L, (long)var2_5), (Object)v5, (long)7741793380833849554L, (long)var2_5) - _0N.c("\u00db", (Object)_0N.c("\u00c0", (Object)this, (long)7740924441943226816L, (long)var2_5), (Object)v6, (long)7742594992749129787L, (long)var2_5));
                                        var43_26 = _0N.c("x", (double)var43_26, (double)0.0, (double)1.0, (long)7740144621782151209L, (long)var2_5);
                                        try {
                                            block22: {
                                                try {
                                                    try {
                                                        _0N.c("\u00e6", (Object)this, (double)(5.0 + var43_26 * (double)var42_24), (long)7741863418451719097L, (long)var2_5);
                                                        v7 = this;
                                                        if (var40_25 == 0) ** GOTO lbl68
                                                        if (_0N.c("\u00c0", (Object)v7, (long)7741064310810034974L, (long)var2_5) == false) break block22;
                                                    }
                                                    catch (MatchException v8) {
                                                        throw _0N.a(v8);
                                                    }
                                                    _0N.c("\u00e6", (Object)this, (double)_0N.c("\u00c0", (Object)this, (long)7741863418451719097L, (long)var2_5), (long)7741189919336197673L, (long)var2_5);
                                                    if (var40_25 != 0) break block23;
                                                }
                                                catch (MatchException v9) {
                                                    throw _0N.a(v9);
                                                }
                                            }
                                            v7 = this;
                                        }
                                        catch (MatchException v10) {
                                            throw _0N.a(v10);
                                        }
lbl68:
                                        // 2 sources

                                        v11 = new Object[4];
                                        v11[3] = (double)_0N.c("\u00c0", (Object)this, (long)7741863418451719097L, (long)var2_5);
                                        v11[2] = (double)_0N.c("\u00c0", (Object)this, (long)7741189919336197673L, (long)var2_5);
                                        v11[1] = Float.valueOf((float)(0.5 * (double)var7_6));
                                        v11[0] = var16_11;
                                        _0N.c("\u00e6", (Object)v7, (double)_0N.c("x", (Object)v11, (long)7742422438040388951L, (long)var2_5), (long)7741189919336197673L, (long)var2_5);
                                    }
                                    var45_27 = var7_6 * 0.05f;
                                    try {
                                        try {
                                            v12 = _0N.c("\u00c0", (Object)this, (long)7741064310810034974L, (long)var2_5);
                                            if (var2_5 <= 0L || var40_25 == 0) break block24;
                                            if (v12 == false) {
                                            }
                                            ** GOTO lbl102
                                        }
                                        catch (MatchException v13) {
                                            throw _0N.a(v13);
                                        }
                                        v14 = new Object[3];
                                        v14[2] = var26_16;
                                        v14[1] = (double)var5_4;
                                        v14[0] = (double)var4_3;
                                        v12 = _0N.c("\u00db", (Object)this, (Object)v14, (long)7742347719931942996L, (long)var2_5);
                                    }
                                    catch (MatchException v15) {
                                        throw _0N.a(v15);
                                    }
                                }
                                try {
                                    if (v12 == false) break block25;
lbl102:
                                    // 2 sources

                                    v16 = 1.0f;
                                    break block26;
                                }
                                catch (MatchException v17) {
                                    throw _0N.a(v17);
                                }
                            }
                            v16 = 0.0f;
                        }
                        var46_28 = v16;
                        try {
                            try {
                                v18 = new Object[5];
                                v18[4] = (double)var45_27;
                                v18[3] = var14_10;
                                v18[2] = 0.30000001192092896;
                                v18[1] = (double)var46_28;
                                v18[0] = (double)_0N.c("\u00c0", (Object)this, (long)7741966767669040450L, (long)var2_5);
                                _0N.c("\u00e6", (Object)this, (float)((float)_0N.c("x", (Object)v18, (long)7740593592698533786L, (long)var2_5)), (long)7741966767669040450L, (long)var2_5);
                                cfr_temp_0 = _0N.c("x", (float)(_0N.c("\u00c0", (Object)this, (long)7741966767669040450L, (long)var2_5) - var46_28), (long)7742019659452677836L, (long)var2_5) - 0.005f;
                                v19 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                if (var40_25 == 0) break block27;
                                if (v19 >= 0) break block28;
                            }
                            catch (MatchException v20) {
                                throw _0N.a(v20);
                            }
                            _0N.c("\u00e6", (Object)this, (float)var46_28, (long)7741966767669040450L, (long)var2_5);
                        }
                        catch (MatchException v21) {
                            throw _0N.a(v21);
                        }
                    }
                    _0N.c("\u00e6", (Object)this, (float)_0N.c("x", (float)_0N.c("\u00c0", (Object)this, (long)7741966767669040450L, (long)var2_5), (float)0.0f, (float)1.0f, (long)7742289295987594796L, (long)var2_5), (long)7741966767669040450L, (long)var2_5);
                    v22 = new Object[1];
                    v22[0] = var20_13;
                    v23 = new Object[1];
                    v23[0] = var36_21;
                    v19 = _0N.c("\u00db", (Object)this, (Object)v22, (long)7741372451734495287L, (long)var2_5) + _0N.c("\u00c0", (Object)this, (long)7742679292120989612L, (long)var2_5) + _0N.c("\u00db", (Object)this, (Object)v23, (long)7742119968617418509L, (long)var2_5);
                }
                var47_29 = (double)v19 + 27.0 - 2.0;
                v24 = new Object[1];
                v24[0] = var22_14;
                var49_30 = (double)_0N.c("\u00db", (Object)this, (Object)v24, (long)7740858886227815490L, (long)var2_5) + _0N.c("\u00c0", (Object)this, (long)7741189919336197673L, (long)var2_5);
                try {
                    try {
                        v25 = new Object[10];
                        v25[9] = 2.0;
                        v25[8] = 2.0;
                        v25[7] = 2.0;
                        v25[6] = 2.0;
                        v25[5] = var32_19;
                        v25[4] = var47_29 + 4.0;
                        v25[3] = (double)(var41_23 + var42_24);
                        v25[2] = var47_29;
                        v25[1] = (double)var41_23;
                        v25[0] = _0N.c("T", (long)7740391548824090511L, (long)var2_5);
                        _0N.c("\u00db", (Object)var6_2, (Object)v25, (long)7741667842142206082L, (long)var2_5);
                        v26 = var40_25;
                        if (var2_5 >= 0L) {
                            if (v26 == 0) break block29;
                            cfr_temp_1 = var49_30 - ((double)var41_23 + 0.5);
                            v26 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                        }
                        if (v26 <= 0) break block30;
                    }
                    catch (MatchException v27) {
                        throw _0N.a(v27);
                    }
                    v28 = new Object[10];
                    v28[9] = 2.0;
                    v28[8] = 2.0;
                    v28[7] = 2.0;
                    v28[6] = 2.0;
                    v28[5] = var32_19;
                    v28[4] = var47_29 + 4.0;
                    v28[3] = var49_30;
                    v28[2] = var47_29;
                    v28[1] = (double)var41_23;
                    v28[0] = _0N.c("\u00c0", (Object)this, (long)7742248445563890054L, (long)var2_5);
                    _0N.c("\u00db", (Object)var6_2, (Object)v28, (long)7741667842142206082L, (long)var2_5);
                }
                catch (MatchException v29) {
                    throw _0N.a(v29);
                }
            }
            v30 = new Object[11];
            v30[10] = 1.0;
            v30[9] = 2.0;
            v30[8] = var28_17;
            v30[7] = 2.0;
            v30[6] = 2.0;
            v30[5] = 2.0;
            v30[4] = var47_29 + 4.0;
            v30[3] = (double)(var41_23 + var42_24);
            v30[2] = var47_29;
            v30[1] = (double)var41_23;
            v30[0] = _0N.c("T", (long)7742822225707630086L, (long)var2_5);
            _0N.c("\u00db", (Object)var6_2, (Object)v30, (long)7740221404952708552L, (long)var2_5);
        }
        v31 = new Object[1];
        v31[0] = var18_12;
        var51_31 = _0N.c("\u00db", (Object)this, (Object)v31, (long)7740542103298053796L, (long)var2_5);
        v32 = new Object[1];
        v32[0] = var20_13;
        v33 = new Object[1];
        v33[0] = var36_21;
        var52_32 = _0N.c("\u00db", (Object)this, (Object)v32, (long)7741372451734495287L, (long)var2_5) + _0N.c("\u00db", (Object)this, (Object)v33, (long)7742119968617418509L, (long)var2_5) + _0N.c("\u00c0", (Object)this, (long)7742679292120989612L, (long)var2_5) + _0N.a("m", (int)24887, (long)(422952608079237087L ^ var2_5));
        v34 = new Object[1];
        v34[0] = var38_22;
        v35 = new Object[1];
        v35[0] = var22_14;
        v36 = new Object[5];
        v36[4] = _0N.c("T", (long)7743011022419827637L, (long)var2_5);
        v36[3] = (double)var52_32;
        v36[2] = (double)(_0N.c("\u00db", (Object)this, (Object)v35, (long)7740858886227815490L, (long)var2_5) + 5);
        v36[1] = _0N.c("\u00db", (Object)_0N.c("\u00c0", (Object)this, (long)7740924441943226816L, (long)var2_5), (Object)v34, (long)7741736907692570234L, (long)var2_5);
        v36[0] = var12_9;
        _0N.c("\u00db", (Object)var6_2, (Object)v36, (long)7742069079056352163L, (long)var2_5);
        v37 = new Object[2];
        v37[1] = var10_8;
        v37[0] = var51_31;
        var53_33 = _0N.c("\u00db", (Object)var6_2, (Object)v37, (long)7742936072823646593L, (long)var2_5);
        v38 = new Object[1];
        v38[0] = var22_14;
        v39 = new Object[1];
        v39[0] = var30_18;
        var55_34 = (int)((double)(_0N.c("\u00db", (Object)this, (Object)v38, (long)7740858886227815490L, (long)var2_5) + _0N.c("\u00db", (Object)this, (Object)v39, (long)7740719420911820681L, (long)var2_5)) - var53_33 - 5.0);
        v40 = new Object[5];
        v40[4] = _0N.c("\u00c0", (Object)this, (long)7742248445563890054L, (long)var2_5);
        v40[3] = (double)var52_32;
        v40[2] = (double)var55_34;
        v40[1] = var51_31;
        v40[0] = var12_9;
        _0N.c("\u00db", (Object)var6_2, (Object)v40, (long)7742069079056352163L, (long)var2_5);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_0N.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_0N.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

