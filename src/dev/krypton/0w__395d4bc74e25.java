/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_11909
 */
package dev.krypton;

import dev.krypton._02;
import dev.krypton._0v;
import dev.krypton._3H;
import dev.krypton._4t;
import dev.krypton._87;
import dev.krypton._8B;
import dev.krypton._94;
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
import net.minecraft.class_11909;

public class _0w
extends _0v {
    private static final _8B cfr_renamed_2;
    private static final _8B cfr_renamed_6;
    private static final _8B cfr_renamed_8;
    private static final int cfr_renamed_0;
    private final _94 cfr_renamed_4;
    private static final long a;
    private static final long[] c;
    private static final Integer[] d;
    private static final Map e;
    private static final Object[] i;
    private static final String[] j;

    public _0w(_4t t, long l2, _95 var4_3, int n) {
        long l3 = (l2 = a ^ l2) ^ 0x5E6449E427F8L;
        int n2 = (int)(l3 >>> 48);
        int n3 = (int)(l3 << 16 >>> 32);
        int n4 = (int)(l3 << 48 >>> 48);
        super((short)n2, t, var4_3, n, n3, (char)n4);
        this.cfr_renamed_4 = (_94)var4_3;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                _0w.a = l.a(-770795899918780123L, -2715435324449655866L, MethodHandles.lookup().lookupClass()).a(86181216965092L);
                var11 = _0w.a ^ 135108659417958L;
                var13_1 = var11 ^ 51290870170876L;
                _0w.i = new Object[66];
                _0w.j = new String[66];
                _0w.b();
                _0w.e = new HashMap<K, V>(13);
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
                var6_4 = new long[12];
                var3_5 = 0;
                var4_6 = "\u00dc\u00ebx\u00ce\u00f5\u00d6\n/C|ze\u00f3\\\u00d1\u0088\u0017|O\u0006b\u00f9\u0013A\u00ff\u00d8\u0086<\u001a0\u00a4#M\u00cc\u00fd\u00b11\u0092f\u00cay\"\u00feN\u0097u\u0084\u001c\u00a7G\u000e!?\u00c7\u00c9\u00ce\u001fa(\u0083P%y<\u009e>\u00adz\u00da@;B\u009d\u00cf\u00d9` o}\u0098";
                var5_7 = "\u00dc\u00ebx\u00ce\u00f5\u00d6\n/C|ze\u00f3\\\u00d1\u0088\u0017|O\u0006b\u00f9\u0013A\u00ff\u00d8\u0086<\u001a0\u00a4#M\u00cc\u00fd\u00b11\u0092f\u00cay\"\u00feN\u0097u\u0084\u001c\u00a7G\u000e!?\u00c7\u00c9\u00ce\u001fa(\u0083P%y<\u009e>\u00adz\u00da@;B\u009d\u00cf\u00d9` o}\u0098".length();
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
                    var4_6 = "o\u0087\u00ba\u00c3\u00f1\u00c5}0j\u00e5\u00eft\u0096\u0094\u00bb\u00c8";
                    var5_7 = "o\u0087\u00ba\u00c3\u00f1\u00c5}0j\u00e5\u00eft\u0096\u0094\u00bb\u00c8".length();
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
        _0w.c = var6_4;
        _0w.d = new Integer[12];
        _0w.cfr_renamed_0 = (int)_0w.a("p", (int)7115, (long)(var11 ^ 6883380647089519967L));
        _0w.cfr_renamed_2 = new _8B((int)_0w.a("p", (int)22517, (long)(8430347453157372266L ^ var11)), (int)_0w.a("p", (int)27783, (long)(2147587923286968861L ^ var11)), var13_1, (int)_0w.a("p", (int)9477, (long)(3378970136543691675L ^ var11)), (int)_0w.a("p", (int)24237, (long)(6593342368706492475L ^ var11)));
        _0w.cfr_renamed_6 = new _8B((int)_0w.a("p", (int)5072, (long)(5838766349940897093L ^ var11)), (int)_0w.a("p", (int)4164, (long)(3933285529131300573L ^ var11)), var13_1, (int)_0w.a("p", (int)4164, (long)(3933285529131300573L ^ var11)), (int)_0w.a("p", (int)13692, (long)(2379122498110329824L ^ var11)));
        _0w.cfr_renamed_8 = new _8B((int)_0w.a("p", (int)4164, (long)(3933285529131300573L ^ var11)), (int)_0w.a("p", (int)4164, (long)(3933285529131300573L ^ var11)), var13_1, (int)_0w.a("p", (int)4164, (long)(3933285529131300573L ^ var11)), (int)_0w.a("p", (int)23220, (long)(7982077183736151084L ^ var11)));
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
            case 0 -> 53;
            case 1 -> 47;
            case 2 -> 22;
            case 3 -> 37;
            case 4 -> 55;
            case 5 -> 49;
            case 6 -> 45;
            case 7 -> 51;
            case 8 -> 41;
            case 9 -> 4;
            case 10 -> 48;
            case 11 -> 27;
            case 12 -> 34;
            case 13 -> 40;
            case 14 -> 18;
            case 15 -> 63;
            case 16 -> 59;
            case 17 -> 57;
            case 18 -> 38;
            case 19 -> 50;
            case 20 -> 29;
            case 21 -> 9;
            case 22 -> 25;
            case 23 -> 52;
            case 24 -> 31;
            case 25 -> 12;
            case 26 -> 23;
            case 27 -> 26;
            case 28 -> 20;
            case 29 -> 58;
            case 30 -> 1;
            case 31 -> 32;
            case 32 -> 21;
            case 33 -> 15;
            case 34 -> 2;
            case 35 -> 35;
            case 36 -> 14;
            case 37 -> 44;
            case 38 -> 62;
            case 39 -> 36;
            case 40 -> 6;
            case 41 -> 17;
            case 42 -> 5;
            case 43 -> 24;
            case 44 -> 56;
            case 45 -> 54;
            case 46 -> 39;
            case 47 -> 60;
            case 48 -> 43;
            case 49 -> 30;
            case 50 -> 19;
            case 51 -> 7;
            case 52 -> 3;
            case 53 -> 13;
            case 54 -> 28;
            case 55 -> 11;
            case 56 -> 33;
            case 57 -> 10;
            case 58 -> 16;
            case 59 -> 42;
            case 60 -> 8;
            case 61 -> 0;
            case 62 -> 46;
            default -> 61;
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
        _0w.j[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = i;
        i[0] = "%\u001aeP~\u00048\u000fg\u0011{Xq\b";
        objectArray[1] = "\\?\b>|YA*\n\u007fy\u0005\u0000\u0018";
        objectArray[2] = "KtR\u0011\u0015\u0012VaPP\u0010N\u001c_";
        objectArray[3] = "'\u0011'{>>:\u0004%:;bs\u0002";
        objectArray[4] = "\u0013~<\u001b/nf^7\u0014>!\u0007P<\u001f:{s";
        objectArray[5] = Integer.TYPE;
        _0w.j[5] = "java/lang/Integer";
        objectArray[6] = "\b\f\u0000Y}%\u0015\u0019\u0002\u0018xyU]";
        objectArray[7] = "\u001d3kU\u0010P\u0000&i\u0014\u0015\fI\u0013";
        objectArray[8] = "`\u000e$t\u0018^\u0015./{\t\u0011t $p\rK\u0000";
        objectArray[9] = Void.TYPE;
        _0w.j[9] = "java/lang/Void";
        objectArray[10] = "1\u0007\u00106WLD'\u001b9F\u0003%)\u00102BYQ";
        objectArray[11] = "UJw7lx j|8}7Adw3ym5";
        objectArray[12] = "\u0006N\u0005^\u001aYsn\u000eQ\u000b\u0016\u0012`\u0005Z\u000fLf";
        objectArray[13] = "\u0019\u0006\u0002p,H\u0004\u0013\u00001)\u0014ET";
        objectArray[14] = "d\f|\u001a?g\u0011,w\u0015.(p\"|\u001e*r\u0004";
        objectArray[15] = " q\u0017\r]&=d\u0015LXz}!";
        objectArray[16] = "zykn\u000f^\u000fY`a\u001e\u0011nWkj\u001aK\u001a";
        objectArray[17] = ")\u007f\u001bZ'[\"p\n\u0015ZC1w\u0003\\";
        objectArray[18] = "<]Y\u0012\u000b5I}R\u001d\u001az(sY\u0016\u001e \\";
        objectArray[19] = "gR;9SGzG9xV\u001b:\u000f";
        objectArray[20] = "kt3O*\u000f\u001eT8@;@\u007fZ3K?\u001a\u000b";
        objectArray[21] = "1\u0006\u0006P 6D&\r_1y%(\u0006T5#Q";
        objectArray[22] = Double.TYPE;
        _0w.j[22] = "java/lang/Double";
        objectArray[23] = " \u0014\"m\u007f9U4)bnv4:\"ij,@";
        objectArray[24] = "2\u001fBwS{G?IxB4&1BsFnR";
        objectArray[25] = "Mp$\u0011>\u00008P/\u001e/OY^$\u0015+\u0015-";
        objectArray[26] = ";\u001f\u0004\u001c[jN?\u000f\u0013J%/1\u0004\u0018N\u007f[";
        objectArray[27] = "Szi\\<\u007f&ZbS-0GTiX)j3";
        objectArray[28] = "$\u0019]8!R$\u0019Jd-]>RJz-H9#\u0018'u\u000bs";
        objectArray[29] = "\u0011,@\u000b>td\fK\u0004/;\u0005\u0002@\u000f+aq";
        objectArray[30] = Boolean.TYPE;
        _0w.j[30] = "java/lang/Boolean";
        objectArray[31] = "'.\u001e<\u0001b:;\u001c}\u0004>q";
        objectArray[32] = "RT\u0007g\"6RT\u0010;.9H\u001f\u0010%.,On@x\u007f";
        objectArray[33] = "xh'5\u0010lxh0i\u001ccb#0w\u001cveRg(J";
        objectArray[34] = "#A_\u0017Sb(NNX2l#EJ\u0002";
        objectArray[35] = "(td6k!u7`R)\u001dc4f=$\u007ft(y";
        objectArray[36] = "Kkz :w\u0016(~D~K\u0000+x+u)\u00177g";
        objectArray[37] = "T\u00154EUh\\\u00018Wn3[\u0012=[\u0002\u0001\tRg\u0000SV\r\f?\u0005QjF_;\u0007n";
        objectArray[38] = "l=bNTqe4j\blpUiwI\u0013xd`~AU";
        objectArray[39] = "$hQAv=dx\fA\u0017<\u001ed[\u0003v\u007f\u007fjL\u0007)\r%eR\u0004(1n6V\u0006\u0017";
        objectArray[40] = "\u001eF\u0014pEiC\u0005\u0010\u0014\u0002U\u0013\u001d\u000bfT<ID\u0014{";
        objectArray[41] = "TLL6/\nCPSY h\u0015PV` T^\u0003Rb";
        objectArray[42] = "6d\fW-06+\u0006\u0006Mk\nu\u000e\t,%k{\u0019\rsW4q\u000e\tp=ri]\u000bM";
        objectArray[43] = "l8I\u0013~*,(\u0014\u0013\u001f'V4CQ~h7:TU!\u001am5JV &&fNT\u001f";
        objectArray[44] = "OwT\u0012\u000f>\u000fg\t\u0012n0u{^P\u000f|\u0014uITP\u000eNzWWQ2\u0005)SUn";
        objectArray[45] = "\r\u0012Q7`!M\u0002\f7\u0001.7\u001e[u`cV\u0010Lq?\u0011\f\u001fRr>-GLVp\u0001";
        objectArray[46] = "\u0005\u0017,jL*\u0012\u000b3\u0005@\r\u007fR6gEwC\u0019ecG";
        objectArray[47] = "l\u000b\u0004O\r\u00165[\u0013\u001e3Cd\u0018\u0019\u0016_q0YAN3Cy\u0003@\u0012THo[\u0018q\rAbZD\u001bKY1Xy";
        objectArray[48] = "H\u001af\u0006uQ\u0018NuI\u000b\b\u001a!y]5V\u000b@wJ1\ty\u001f}]5\n\u0013Ye\u000e77";
        objectArray[49] = "P.ED_P\b3C\u0017&Q9=U\u0015G\u001eX3B\u0011\u0018lS,QBE\u001d\\\"LL&";
        objectArray[50] = "!8\u001ff4\u001a{a\u0000{ZO\u001d>\u0011*;\u0001|0\u0006.dsg#\u0002{j\u0011p?\u001d\u0014";
        objectArray[51] = "x\u000bT\u0013e/k\u0000V\u0013\u000f+\u0014\u000eZSnfu\u0000MW1\u0014*\nZS2~l\u0012\tQ\u000f";
        objectArray[52] = "&\u0003Ky8={@O\u001dy\u0001mCIrwcz_V";
        objectArray[53] = "U~\u0015\u0011o\u0017\u0005*\u0006^\u0011Md&\u0002\u001fp\u0003\u0005(\u0015\u001b/q\n*\u0019\u001fz\u000f['\u0007E\u0011";
        objectArray[54] = "\u000b/jAl1K?7A\r;1#`\u0003lsP-w\u00073\u0001\n\"i\u00042=Aqm\u0006\r";
        objectArray[55] = ")\u0010r\u001b+\u0012)_xJKE\u0015\u0001pE*\u0007t\u000fgAuu+\u0005pEv\u001fm\u001d#GK";
        objectArray[56] = "#\u00050/BHc\u0015m/#E\u0019\t:mB\nx\u0007-i\u001dx}U82\u001f\u0004iR >#";
        objectArray[57] = "x\u0006\u0017a}-q\u000f\u001f'E#:k\fu{}3\n\u0002b\u007f\"AU\bu{!+\u0013\u0010&y\u001c";
        objectArray[58] = "\u001ey\u001dRFK\u0016m\u0011@}\u001e\u001bg\f|AJM2tE\u0012\u0005Bi\n\u0014\u001f\u001b\u0018\u0002";
        objectArray[59] = "Q\u001bK\u0018Q;\u0011\u000b\u0016\u001807kOH\u0006\t4W\u0004\u001b\u0002\u000b";
        objectArray[60] = "b7\u0005K5\u0011bx\u000f\u001aUM^&\u0007\u00154\u0004?(\u0010\u0011kvb7\u0005K5\u0011bx\u000f\u001aU";
        objectArray[61] = "9\t\u0006~P%;\u0001\u0019kh,\u00071\u001dk\u0015+b\u0001D;\u0002z";
        objectArray[62] = "lpiKJ*ddeYq\u007finxeM+?:\u0000\\\u001ed0`~\r\u0013zj\u000b";
        objectArray[63] = "SW\u0004xj\u0006DK\u001b\u0017jd\u0012K\u001e.eXY\u0018\u001a,";
        objectArray[64] = "\u007fh\u001d\u000fY\u0019?x@\u000f8\u0013E}\u0002\u000bW\u0019'j\u001e\u0014";
        Object[] objectArray2 = objectArray;
        objectArray[65] = "\u0002\u001a\u0000/\u0016=\u000b\u0013\bi.5;\u0014\u0013nO~Z\u001a\u0004j\u0010\f\u0005\u0010\u0013n\u0013fC\b@l.";
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _0w.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'x' || c == 'D' || c == '\u00ef' || c == '\u00e0') {
                field = _0w.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'x' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'D' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ef' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _0w.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'B' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d0' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0w" + " : " + string + " : " + methodType.toString(), exception);
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

    private static Method h(long l2, long l3) {
        int n = _0w.e(l2, l3);
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
                clazz3 = _0w.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _0w.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _0w.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _0w.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _0w.f(2458704707099850L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _0w.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _0w.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _0w.f(2458704707099850L, 0L);
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
            int n = _0w.e(l2, l3);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                _0w.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _0w.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _0w.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _0w.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _0w.d(classArray[j], string, clazz2);
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
            throw new RuntimeException("dev/krypton/0w" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _0w.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x203F;
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
                throw new RuntimeException("dev/krypton/0w", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _0w.d[n2] = n3;
        }
        return d[n2];
    }

    private static Field g(long l2, long l3) {
        int n = _0w.e(l2, l3);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = _0w.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _0w.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _0w.c(clazz3, string2, clazz2)) != null) {
                    _0w.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _0w.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _0w.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _0w.f(2458704707099850L, 0L);
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
        _0w w;
        long l2;
        boolean bl;
        block7: {
            class_11909 class_119093;
            block8: {
                class_119093 = (class_11909)objectArray[0];
                bl = (Boolean)objectArray[1];
                long l3 = (Long)objectArray[2];
                long l4 = l3;
                long l5 = l4 ^ 0xA239397A5E5L;
                long l6 = l4 ^ 0x2CD80FC61484L;
                l2 = l4 ^ 0L;
                boolean bl2 = _02.cfr_renamed_2();
                try {
                    try {
                        try {
                            w = this;
                            class_119092 = class_119093;
                            if (bl2) break block7;
                            Object[] objectArray2 = new Object[3];
                            objectArray2[2] = l5;
                            objectArray2[1] = (double)_0w.c("B", (Object)class_119093, 5513483635682412961L, (long)l3);
                            objectArray2[0] = (double)_0w.c("B", (Object)class_119092, 5513225124887467319L, (long)l3);
                            if (_0w.c("B", (Object)w, (Object)objectArray2, 5513049715032068622L, (long)l3) == false) break block8;
                        }
                        catch (MatchException matchException) {
                            throw _0w.a(matchException);
                        }
                        if (_0w.c("B", (Object)class_119093, 5513829186646593522L, (long)l3) == false) {
                        }
                        break block8;
                    }
                    catch (MatchException matchException) {
                        throw _0w.a(matchException);
                    }
                    _0w.c("B", (Object)_0w.c("\u00ef", 5513261592769608722L, (long)l3), (Object)new _3H(l6, (_94)((Object)_0w.c("x", (Object)this, 5514220673809071902L, (long)l3))), 5514571980121866197L, (long)l3);
                }
                catch (MatchException matchException) {
                    throw _0w.a(matchException);
                }
            }
            w = this;
            class_119092 = class_119093;
        }
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l2;
        objectArray3[1] = bl;
        objectArray3[0] = class_119092;
        super.void_6(objectArray3);
    }

    @Override
    protected void void_8(Object[] objectArray) {
        _87 var2_2 = (_87)objectArray[0];
        int n = (Integer)objectArray[1];
        int n2 = (Integer)objectArray[2];
        long l2 = (Long)objectArray[3];
        float f = ((Float)objectArray[4]).floatValue();
        long l3 = l2;
        long l4 = l3 ^ 0x58144273CC5CL;
        long l5 = l3 ^ 0x1E5F221F15BCL;
        long l6 = l3 ^ 0x332099301D7CL;
        long l7 = l3 ^ 0x570C24C53811L;
        long l8 = l3 ^ 0x7238D2000367L;
        long l9 = l3 ^ 0x310130337E2AL;
        long l10 = l3 ^ 0x2AF2DB09C70AL;
        long l11 = l3 ^ 0x538DF2D376DEL;
        long l12 = l3 ^ 0x16D0603ED0FFL;
        long l13 = l3 ^ 0x7F2CE5EAB728L;
        long l14 = l3 ^ 0x2942C15F9E3FL;
        long l15 = l3 ^ 0x6C6533DC12C4L;
        long l16 = l3 ^ 0x22B6A7D81325L;
        long l17 = l3 ^ 0x4A7C3F174665L;
        long l18 = l3 ^ 0x6BA19953A4AFL;
        long l19 = l3 ^ 0x88823B1F239L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l10;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l17;
        reference var40_23 = _0w.c("B", (Object)this, (Object)objectArray2, 7740413426815284907L, (long)l2) + _0w.c("B", (Object)this, (Object)objectArray3, 7741024441757377271L, (long)l2) + _0w.c("x", (Object)this, 7741365466633198157L, (long)l2);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l8;
        reference var41_24 = var40_23 + _0w.c("B", (Object)this, (Object)objectArray4, 7739998635178488440L, (long)l2) / 2;
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l19;
        Object[] objectArray6 = new Object[1];
        objectArray6[0] = l11;
        Object[] objectArray7 = new Object[5];
        objectArray7[4] = _0w.c("\u00ef", 7741711096977377194L, (long)l2);
        objectArray7[3] = (double)(var41_24 - 4);
        objectArray7[2] = (double)(_0w.c("B", (Object)this, (Object)objectArray6, 7740327723908081625L, (long)l2) + 5);
        objectArray7[1] = _0w.c("B", (Object)_0w.c("x", (Object)this, 7740056532512151794L, (long)l2), (Object)objectArray5, 7740637333324401176L, (long)l2);
        objectArray7[0] = l7;
        _0w.c("B", (Object)var2_2, (Object)objectArray7, 7740974943880954196L, (long)l2);
        Object[] objectArray8 = new Object[1];
        objectArray8[0] = l5;
        CallSite callSite = _0w.c("B", (Object)_0w.c("x", (Object)this, 7740056532512151794L, (long)l2), (Object)objectArray8, 7740724296595217132L, (long)l2);
        Object[] objectArray9 = new Object[1];
        objectArray9[0] = l11;
        Object[] objectArray10 = new Object[1];
        objectArray10[0] = l12;
        reference var43_26 = _0w.c("B", (Object)this, (Object)objectArray9, 7740327723908081625L, (long)l2) + _0w.c("B", (Object)this, (Object)objectArray10, 7740226417956555168L, (long)l2) - _0w.a("p", 7767, (long)(0x27CB2C9CA533D50EL ^ l2)) - _0w.a("p", 31528, (long)(0x772AAE3AEB9D3077L ^ l2));
        reference var44_27 = var41_24 - _0w.a("p", 31528, (long)(0x772AAE3AEB9D3077L ^ l2));
        Object[] objectArray11 = new Object[1];
        objectArray11[0] = l14;
        _0w.c("B", (Object)_0w.c("\u00ef", 7739877948929528249L, (long)l2), (Object)objectArray11, 7741245334645086285L, (long)l2);
        Object[] objectArray12 = new Object[1];
        objectArray12[0] = l9;
        Object[] objectArray13 = new Object[1];
        objectArray13[0] = l6;
        _0w.c("B", (Object)_0w.c("\u00d0", (Object)objectArray12, 7741421470612266224L, (long)l2), (Object)objectArray13, 7741110871061175291L, (long)l2);
        Object[] objectArray14 = new Object[14];
        objectArray14[13] = false;
        objectArray14[12] = 0.8;
        objectArray14[11] = l15;
        objectArray14[10] = _0w.c("\u00ef", 7739677117664807007L, (long)l2);
        objectArray14[9] = _0w.c("\u00ef", 7739741977475616780L, (long)l2);
        objectArray14[8] = _0w.c("\u00ef", 7740866217550796626L, (long)l2);
        objectArray14[7] = 5.0;
        objectArray14[6] = 5.0;
        objectArray14[5] = 5.0;
        objectArray14[4] = 5.0;
        objectArray14[3] = (double)(var44_27 + _0w.a("p", 19475, (long)(0x72D490DF82320746L ^ l2)) + 2);
        objectArray14[2] = (double)(var43_26 + _0w.a("p", 19475, (long)(0x72D490DF82320746L ^ l2)) + 2);
        objectArray14[1] = (double)(var44_27 - 2);
        objectArray14[0] = (double)(var43_26 - 2);
        _0w.c("\u00d0", (Object)objectArray14, 7740843290416539215L, (long)l2);
        Object[] objectArray15 = new Object[1];
        objectArray15[0] = l9;
        Object[] objectArray16 = new Object[1];
        objectArray16[0] = l4;
        _0w.c("B", (Object)_0w.c("\u00d0", (Object)objectArray15, 7741421470612266224L, (long)l2), (Object)objectArray16, 7740179223349466091L, (long)l2);
        Object[] objectArray17 = new Object[1];
        objectArray17[0] = l16;
        _0w.c("B", (Object)_0w.c("\u00ef", 7739877948929528249L, (long)l2), (Object)objectArray17, 7741763295077168760L, (long)l2);
        Object[] objectArray18 = new Object[10];
        objectArray18[9] = 3.0;
        objectArray18[8] = 3.0;
        objectArray18[7] = 3.0;
        objectArray18[6] = 3.0;
        objectArray18[5] = l13;
        objectArray18[4] = (double)(var44_27 + _0w.a("p", 19475, (long)(0x72D490DF82320746L ^ l2)));
        objectArray18[3] = (double)(var43_26 + _0w.a("p", 19475, (long)(0x72D490DF82320746L ^ l2)));
        objectArray18[2] = (double)var44_27;
        objectArray18[1] = (double)var43_26;
        objectArray18[0] = new _8B((int)_0w.c("x", (Object)callSite, 7740472952678953502L, (long)l2), l18, (int)_0w.c("x", (Object)callSite, 7740108817972001545L, (long)l2), (int)_0w.c("x", (Object)callSite, 7741639177152365846L, (long)l2));
        _0w.c("B", (Object)var2_2, (Object)objectArray18, 7740623156684830484L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_0w.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_0w.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

