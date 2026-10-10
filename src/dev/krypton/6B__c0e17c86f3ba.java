/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_3965
 */
package dev.krypton;

import dev.krypton._3i_0;
import dev.krypton._3s;
import dev.krypton._4r;
import dev.krypton._4w;
import dev.krypton._6x_0;
import dev.krypton._92;
import dev.krypton._95;
import dev.krypton._9j_0;
import dev.krypton._9o;
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
import net.minecraft.class_3965;

public class _6B
extends _6x_0 {
    private final _9j_0 cfr_renamed_2;
    private final _92 cfr_renamed_0;
    private final _92 cfr_renamed_1;
    private int cfr_renamed_6;
    private int cfr_renamed_8;
    private boolean cfr_renamed_9;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    private void cfr_renamed_371(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = b ^ l2;
        _6B.c("\u00ec", (Object)this, (int)_6B.a("h", 12805, (long)(0x413FD1DE399E903BL ^ l2)), 996475319282771105L, (long)l2);
    }

    public _6B(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x1BAD18DE9A10L;
        long l5 = l3 ^ 0x5DF5BD546BEAL;
        long l6 = l3 ^ 0x42352E708498L;
        long l7 = l3 ^ 0x6D05FB6114B7L;
        int n = (int)(l7 >>> 32);
        int n2 = (int)(l7 << 32 >>> 56);
        int n3 = (int)(l7 << 40 >>> 40);
        super((int)_6B.a("h", 3366, (long)(0x363D283C943B6004L ^ l2)), -1, (_4r)((Object)_6B.c("E", -4409304504648887234L, (long)l2)), l5);
        this.cfr_renamed_2 = new _9j_0((int)_6B.a("h", 30331, (long)(0x6C199A2047091B56L ^ l2)), n, (byte)n2, (int)_6B.a("h", 5761, (long)(0xCC8B976A08FFBA5L ^ l2)), n3, false);
        this.cfr_renamed_0 = new _92((int)_6B.a("h", 608, (long)(0x25BD72B9A341EF4BL ^ l2)), 0.0, l4, 20.0, 0.0, 1.0);
        this.cfr_renamed_1 = new _92((int)_6B.a("h", 2723, (long)(0x11C506727232E78BL ^ l2)), 1.0, l4, 9.0, 1.0, 1.0);
        _6B.c("\u00ec", (Object)this, (int)_6B.a("h", 2957, (long)(0x31818A58D75566A7L ^ l2)), -4410689820439352385L, (long)l2);
        _6B.c("\u00ec", (Object)this, (int)_6B.a("h", 12805, (long)(0x413FF421E6925F25L ^ l2)), -4409787503881695063L, (long)l2);
        _6B.c("\u00ec", (Object)this, (boolean)_6B.a("h", 12805, (long)(0x413FF421E6925F25L ^ l2)), -4409574607730995993L, (long)l2);
        Object[] objectArray = new Object[2];
        objectArray[1] = new _95[]{_6B.c("D", (Object)this, -4410125123612765241L, (long)l2), _6B.c("D", (Object)this, -4410845265528143717L, (long)l2), _6B.c("D", (Object)this, -4410634183998641667L, (long)l2)};
        objectArray[0] = l6;
        _6B.c("\u00fd", (Object)this, (Object)objectArray, -4410404852225028638L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                _6B.b = l.a(901610769005257750L, 7529216209217193020L, MethodHandles.lookup().lookupClass()).a(128783433251715L);
                _6B.j = new Object[65];
                _6B.k = new String[65];
                _6B.b();
                _6B.f = new HashMap<K, V>(13);
                var0 = _6B.b ^ 77461260246858L;
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
                var8_3 = new long[14];
                var5_4 = 0;
                var6_5 = "\u00a6\u00c4\u00df\u00a8\u001d\u00f2\u00a0\u0093<)B7i\u009a\u0006\u0088\u0090\u00b6\u00f5\u008a\u00c5\r\u00ff\u00dc\u00da\u008a\u0088,te\u00ec\u009b\u00daI2Xw\u009b\u00be&\u009dl\u00a8%Y9\u00fb\u00c9\u00b7T \u00db#\u0091~b\u001c\u00e8\u00d2\u00e1DB7\u00a1a\u0010\u007f\u00b8iS`\u0016\u00da\u009d<F_\u00fd:\u00c1\u00fb\u0099\u0001\u00fc\u00c9\u0085\u00a2\u00a3pL\u00a2\u00faL.\u0011\u00e3";
                var7_6 = "\u00a6\u00c4\u00df\u00a8\u001d\u00f2\u00a0\u0093<)B7i\u009a\u0006\u0088\u0090\u00b6\u00f5\u008a\u00c5\r\u00ff\u00dc\u00da\u008a\u0088,te\u00ec\u009b\u00daI2Xw\u009b\u00be&\u009dl\u00a8%Y9\u00fb\u00c9\u00b7T \u00db#\u0091~b\u001c\u00e8\u00d2\u00e1DB7\u00a1a\u0010\u007f\u00b8iS`\u0016\u00da\u009d<F_\u00fd:\u00c1\u00fb\u0099\u0001\u00fc\u00c9\u0085\u00a2\u00a3pL\u00a2\u00faL.\u0011\u00e3".length();
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
                    var6_5 = "\u00be:/\u00f4\u00d3\u00fc\u00b2U\u00f39\u00ea^\u00deJ\u00e9\u00ac";
                    var7_6 = "\u00be:/\u00f4\u00d3\u00fc\u00b2U\u00f39\u00ea^\u00deJ\u00e9\u00ac".length();
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
        _6B.d = var8_3;
        _6B.e = new Integer[14];
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
            case 0 -> 60;
            case 1 -> 32;
            case 2 -> 52;
            case 3 -> 54;
            case 4 -> 23;
            case 5 -> 41;
            case 6 -> 17;
            case 7 -> 11;
            case 8 -> 53;
            case 9 -> 22;
            case 10 -> 62;
            case 11 -> 4;
            case 12 -> 10;
            case 13 -> 36;
            case 14 -> 56;
            case 15 -> 45;
            case 16 -> 39;
            case 17 -> 49;
            case 18 -> 63;
            case 19 -> 25;
            case 20 -> 27;
            case 21 -> 6;
            case 22 -> 16;
            case 23 -> 7;
            case 24 -> 19;
            case 25 -> 59;
            case 26 -> 43;
            case 27 -> 51;
            case 28 -> 5;
            case 29 -> 14;
            case 30 -> 0;
            case 31 -> 48;
            case 32 -> 12;
            case 33 -> 26;
            case 34 -> 37;
            case 35 -> 3;
            case 36 -> 9;
            case 37 -> 30;
            case 38 -> 57;
            case 39 -> 29;
            case 40 -> 50;
            case 41 -> 18;
            case 42 -> 55;
            case 43 -> 20;
            case 44 -> 35;
            case 45 -> 1;
            case 46 -> 34;
            case 47 -> 15;
            case 48 -> 2;
            case 49 -> 24;
            case 50 -> 13;
            case 51 -> 46;
            case 52 -> 40;
            case 53 -> 31;
            case 54 -> 8;
            case 55 -> 38;
            case 56 -> 58;
            case 57 -> 28;
            case 58 -> 33;
            case 59 -> 47;
            case 60 -> 61;
            case 61 -> 42;
            case 62 -> 44;
            default -> 21;
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
        _6B.k[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'D' || c == '\u00ec' || c == 'E' || c == '\u00db') {
                field = _6B.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'D' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ec' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'E' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _6B.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fd' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _6B.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = "#5l;c.> nzfr~:";
        objectArray[1] = "\u001ex<\"_\tkX7-NF\nV<&J\u001c~";
        objectArray[2] = Integer.TYPE;
        _6B.k[2] = "java/lang/Integer";
        objectArray[3] = "\u007fJPfhGb_R'm\u001b-m";
        objectArray[4] = "\u0007Q\u000f\u001dh9rq\u0004\u0012yv\u0013\u007f\u000f\u0019},g";
        objectArray[5] = Void.TYPE;
        _6B.k[5] = "java/lang/Void";
        objectArray[6] = "\u0003\nf\"7\u0004\u001e\u001fdc2X^$";
        objectArray[7] = "|\u001bmw\tY\t;fx\u0018\u0016h5ms\u001cL\u001c";
        objectArray[8] = Boolean.TYPE;
        _6B.k[8] = "java/lang/Boolean";
        objectArray[9] = "x\u0004\u0007'f\u0012e\u0011\u0005fcN%S";
        objectArray[10] = "5)E\u001fo+(<G^jwe>";
        objectArray[11] = "ig\u0001!Cstr\u0003`F/;z";
        objectArray[12] = "\nd{Cti\u007fDpLe&\u001eJ{Ga|j";
        objectArray[13] = "\u001dQNF7I\u001dQY\u001a;F\u0007\u001aY\u0004;S\u0000k\u000bPj\u0012";
        objectArray[14] = "o|-,7Zo|:p;Uu7:n;@rFh5c\u0001";
        objectArray[15] = "Zm\u001dmtYZm\n1xV@&\n/xCGWZr)";
        objectArray[16] = "NB\u001d%;WNB\ny7XT\t\ng7MSx^?`";
        objectArray[17] = "+\fn`nJ+\fy<bE1Gy\"bP66+y:\u001a";
        objectArray[18] = "BR\u000bP~bBR\u001c\frmX\u0019\u001c\u0012rx_hNH%:";
        objectArray[19] = "\bN\u0000\nnr\u0003A\u0011E\u000f|\bJ\u0015\u001f";
        objectArray[20] = "/c\u0006\u001fVF/c\u0011CZI5(\u0011]Z\\2YF\u0002\f";
        objectArray[21] = "jZa>!9wOc\u007f$e6E";
        objectArray[22] = "\u0012\u0005;xrIg%0wc\u0006\u0006+;|g\\r";
        objectArray[23] = "o2\u00169%U\u001a\u0012\u001d64\u001a{\u001c\u0016=0@\u000f";
        objectArray[24] = "wMV\n>qwMAV2~m\u0006AH2kjw\u0010\u0017j";
        objectArray[25] = "i\u001fmW;8i\u001fz\u000b77sTz\u00157\"t%+Kbg";
        objectArray[26] = "\u0015L->\u00045\u0015L:b\b:\u000f\u0007:|\b/\bvk\"]d";
        objectArray[27] = "\u000e}\u0018*\u007fX{]\u0013%n\u0017\u001aS\u0018.jMn";
        objectArray[28] = "41h hw41\u007f|dx.z\u007fbdm)\u000b/73+";
        objectArray[29] = "0*TQfx0*C\rjw*aC\u0013jb-\u0010\u0012L8)";
        objectArray[30] = "\u0007KR/P\frkY AC\u0013eR+E\u0019g";
        objectArray[31] = "\u0002;o29^\u001f.ms<\u0002R\u0018";
        objectArray[32] = "\b\u001dJcC\u0002}=AlRM\u001c3JgV\u0017h";
        objectArray[33] = "\u0015\u0007-\u0017e\u0015`'&\u0018tZ\u0001)-\u0013p\u0000u";
        objectArray[34] = "Mgg\u007fsB8Glpb\rYIg{fW-";
        objectArray[35] = "KW\u001db\rU\u000fU\n\"m\u0002q\u0010\b)\nKL\u001e\u0018`P";
        objectArray[36] = ":%U\u0006.gw<Y\u001c\u00119j.Q\u001bFm0z\tN\u0011fu QGt54)\r";
        objectArray[37] = "\\\u0019@)\u0004\u001fE\u001b@;t\u001a]\u0015\u0014<#M\u0004AJlt\u0015Q\u0001A:\u0018\n^\u001c\u0019";
        objectArray[38] = "r!\u007fg*8+4{[\u007fF.%\":{%//&&A|rdt<&<,<y[";
        objectArray[39] = "Yah#1\u001a^cmvA\u0001W$w\u007f-3\u0003g('~dY!g{1\u0000\u0005al!A";
        objectArray[40] = "sA\"X'riE!LE(tC{P)\u001a&\u000e#\u0006E|g\\\u007f\u0007 /&U#7";
        objectArray[41] = "\b[\fh9\u001c[\u0015\u0006jWU8\u0001E36V[\u0000O7*l\u0004_\u0000v;\u0010T\u0007XpW";
        objectArray[42] = "h~B\u001f(\u0019ce^XF\u0014}~Q\u0003=yh~B\u001f(\u0019ce^XFDxdXXw\u001ek:_g";
        objectArray[43] = "p\f{\u0011pD#\u001a~\u0001\u0000Dv\b|\nlv&H']\u0000\u001b!Mp\ng[\u007f\u0015}mj_\"\u001b~Rp[!\u000f\u001c";
        objectArray[44] = "B\u0001\u0016\u0002E}\u0006\u0003\u0001B%%xB\u0016\\\u0019p\u0006\u001b\u0003X";
        objectArray[45] = "q;\u0018~I#59\u000f>)~Kx^~E\",8\u0000&H";
        objectArray[46] = "\u0019k+m\u0014\u0003\u0005+d`)\\}r#*H]\u001es).Tg@h<p\u0016V\u001a{bw)";
        objectArray[47] = "3 ~\u0018_\u000b/`1\u0015bRW9v_\u0003U48|[\u001fokg3\u001a\u000e\u0013;?k\u001cb";
        objectArray[48] = "|F)*{98D>j\u001bbF\u0005o*w8!E1rz";
        objectArray[49] = "\u001e\u0010EJi\u0002\u000b\u001e\u001b\u0017\u0016\u0005\u0016\u001c\u001bJARHKC&|TG\u0001\u0015\u001fx\u000b\b\u0000";
        objectArray[50] = "\u0013]\u000fbPR\u0006SQ?/U\u001bQQbx\u0002E\u0001\b\u000eCK\u001f\u0003^`OW\u0018^";
        objectArray[51] = "A\u001a\u00129VG\u0017W\\{f\u0016,\u0001\u0018{\u0007\u0011O\u0000\u0012\u007f\u001b+\u0011\u001b\u0007!Y\u001aK\bY&f";
        objectArray[52] = "\u0016r,3ABRp;s!\u0018,m(0@\u001eOl\"4\\$\u0011w7j\u001e\u0015Kdim!";
        objectArray[53] = ":W\n;\u0019;~U\u001d{ym\u0000\u0010\u001fp\u001e%=\u001e\u000f9D";
        objectArray[54] = "nzK%\u001d\u0014=4A's]^/\u001b~\u001f\u001b7:\u0015 B";
        objectArray[55] = "=\u0017\u0019\u001f\u001fM(\u0019GB`J5\u001bG\u001f7\u001dkH\u001es\u000f],\u0013F\u000b\u0007C2\u0019";
        objectArray[56] = "'x\u000bw\f>cz\u001c7lf\u001dg\u000ft\rb~f\u0005p\u0011X }\u0010.SiznN)l";
        objectArray[57] = "lkQ3cVm.\u001f#\u001a'\u0014\u0010d\u0007FllkQ3cVm.\u001f#";
        objectArray[58] = "KkI\u00108(\u000fi^PXq\u0016\u0012SQb/KqR[f3q.\r\u0014'\"\r~UL!N";
        objectArray[59] = "\\I\r\u0019\u0018\u0000\u001fI\t\u0013vT`@\u0010C\u0017^\u0003A\u001aG\u000bd]Z\u000f\u0019IU\u0007IQ\u001ev";
        objectArray[60] = "F\u001a\u001dp>PBERqT\fAYMg8>\u0017\u001c\u0010<diG]J|$\f\u0014KOlT";
        objectArray[61] = "AEwldx\u0005G`,\u0004!{\u0001w2d!J[dlc";
        objectArray[62] = "neh7!w`u!mYwPjbj8p3khn$Jj6#<>-*h{1Y";
        objectArray[63] = "+OM\u001dWr}\u0002\u0003_g&FTG_\u0006$%UM[\u001a\u001ez\n\u0002\u001a\u000bb*RZ\u001cg";
        Object[] objectArray2 = objectArray;
        objectArray[64] = "XxwL#\u001c\u0015a{V\u001cB\bssQK\u001cY&.=-R\nz'X~\u0013\u0003&";
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6B" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l2, long l3) {
        int n = _6B.e(l2, l3);
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
                clazz3 = _6B.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _6B.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _6B.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _6B.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _6B.f(1407083922598579L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _6B.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _6B.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _6B.f(1407083922598579L, 0L);
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
            int n = _6B.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _6B.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _6B.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _6B.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _6B.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _6B.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x2FE8;
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
                throw new RuntimeException("dev/krypton/6B", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _6B.e[n2] = n3;
        }
        return e[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6B" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _6B.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field g(long l2, long l3) {
        int n = _6B.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _6B.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _6B.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _6B.c(clazz3, string2, clazz2)) != null) {
                    _6B.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _6B.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _6B.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _6B.f(1407083922598579L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private boolean boolean_6(Object[] objectArray) {
        Object object;
        block10: {
            long l2;
            block11: {
                Object object2;
                block8: {
                    int n = (Integer)objectArray[0];
                    long l3 = (Long)objectArray[1];
                    long l4 = l2 = ((long)n << 56 | l3 << 8 >>> 8) ^ b;
                    long l5 = l4 ^ 0x598245DCB1FDL;
                    long l6 = l4 ^ 0x1E768766D27CL;
                    long l7 = l4 ^ 0x5C66975C9AD4L;
                    _4w[] wArray = _3s.cfr_renamed_5();
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l5;
                    CallSite callSite = _6B.c("\u00fd", (Object)_6B.c("D", (Object)this, -7707317302295478723L, (long)l2), (Object)objectArray2, -7707755661654458405L, (long)l2);
                    try {
                        block9: {
                            try {
                                try {
                                    try {
                                        object2 = callSite;
                                        if (wArray != null) break block8;
                                        if (object2 == -1) break block9;
                                    }
                                    catch (MatchException matchException) {
                                        throw _6B.a(matchException);
                                    }
                                    Object[] objectArray3 = new Object[2];
                                    objectArray3[1] = l6;
                                    objectArray3[0] = (int)callSite;
                                    object = _6B.c("\u00e3", (Object)objectArray3, -7705699322642850934L, (long)l2);
                                    if (wArray != null) break block10;
                                }
                                catch (MatchException matchException) {
                                    throw _6B.a(matchException);
                                }
                                if (object != false) break block11;
                            }
                            catch (MatchException matchException) {
                                throw _6B.a(matchException);
                            }
                        }
                        Object[] objectArray4 = new Object[1];
                        objectArray4[0] = l7;
                        _6B.c("\u00fd", (Object)this, (Object)objectArray4, -7705737407596118586L, (long)l2);
                        object2 = false;
                    }
                    catch (MatchException matchException) {
                        throw _6B.a(matchException);
                    }
                }
                return (boolean)object2;
            }
            _6B.c("\u00ec", (Object)this, (boolean)_6B.a("h", 13636, (long)(0x352C5D8139EF8FA7L ^ l2)), -7706125797551449305L, (long)l2);
            object = true;
        }
        return (boolean)object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @_3i_0
    public void cfr_renamed_3(_9o var1_1) {
        block128: {
            block109: {
                block126: {
                    block124: {
                        block122: {
                            block120: {
                                block118: {
                                    block116: {
                                        block114: {
                                            block112: {
                                                block110: {
                                                    block107: {
                                                        block105: {
                                                            block106: {
                                                                block103: {
                                                                    block104: {
                                                                        block102: {
                                                                            block100: {
                                                                                block101: {
                                                                                    block98: {
                                                                                        block99: {
                                                                                            block97: {
                                                                                                block95: {
                                                                                                    block96: {
                                                                                                        v0 = var2_2 = _6B.b ^ 13976846756877L;
                                                                                                        var4_3 = v0 ^ 80357271533327L;
                                                                                                        v1 = v0 ^ 4123252488460L;
                                                                                                        var6_4 = (int)(v1 >>> 56);
                                                                                                        var7_5 = v1 << 8 >>> 8;
                                                                                                        var9_6 = v0 ^ 51922670957459L;
                                                                                                        var11_7 = v0 ^ 44387891957777L;
                                                                                                        var13_8 = v0 ^ 49867461157816L;
                                                                                                        var15_9 = v0 ^ 40515242999632L;
                                                                                                        var17_10 = v0 ^ 134228299178450L;
                                                                                                        var19_11 = v0 ^ 9438011738045L;
                                                                                                        var21_12 = _3s.cfr_renamed_5();
                                                                                                        try {
                                                                                                            try {
                                                                                                                v2 = _6B.c("D", (Object)this, (long)7929359697391575693L, (long)var2_2);
                                                                                                                if (var21_12 != null) break block95;
                                                                                                                if (_6B.c("D", (Object)v2, (long)7929614842171374385L, (long)var2_2) == null) break block96;
                                                                                                            }
                                                                                                            catch (MatchException v3) {
                                                                                                                throw _6B.a(v3);
                                                                                                            }
                                                                                                            return;
                                                                                                        }
                                                                                                        catch (MatchException v4) {
                                                                                                            throw _6B.a(v4);
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        v5 = this;
                                                                                                        if (var21_12 != null) break block97;
                                                                                                        v2 = _6B.c("D", (Object)v5, (long)7929359697391575693L, (long)var2_2);
                                                                                                    }
                                                                                                    catch (MatchException v6) {
                                                                                                        throw _6B.a(v6);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    if (_6B.c("D", (Object)v2, (long)7929556347541518708L, (long)var2_2) == null) {
                                                                                                        return;
                                                                                                    }
                                                                                                }
                                                                                                catch (MatchException v7) {
                                                                                                    throw _6B.a(v7);
                                                                                                }
                                                                                                v5 = this;
                                                                                            }
                                                                                            try {
                                                                                                v8 = new Object[1];
                                                                                                v8[0] = var4_3;
                                                                                                v9 = _6B.c("\u00fd", (Object)v5, (Object)v8, (long)7929184482245069015L, (long)var2_2);
                                                                                                if (var21_12 != null) break block98;
                                                                                                if (v9 != false) break block99;
                                                                                            }
                                                                                            catch (MatchException v10) {
                                                                                                throw _6B.a(v10);
                                                                                            }
                                                                                            return;
                                                                                        }
                                                                                        try {
                                                                                            v11 = this;
                                                                                            if (var21_12 != null) break block100;
                                                                                            v9 = _6B.c("D", (Object)v11, (long)7928711494482731041L, (long)var2_2);
                                                                                        }
                                                                                        catch (MatchException v12) {
                                                                                            throw _6B.a(v12);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                if (v9 != false) break block101;
                                                                                                v11 = this;
                                                                                                if (var21_12 != null) break block100;
                                                                                            }
                                                                                            catch (MatchException v13) {
                                                                                                throw _6B.a(v13);
                                                                                            }
                                                                                            v14 = new Object[2];
                                                                                            v14[1] = var7_5;
                                                                                            v14[0] = (int)((byte)var6_4);
                                                                                            if (_6B.c("\u00fd", (Object)v11, (Object)v14, (long)7928935654750398718L, (long)var2_2) != false) break block101;
                                                                                        }
                                                                                        catch (MatchException v15) {
                                                                                            throw _6B.a(v15);
                                                                                        }
                                                                                        return;
                                                                                    }
                                                                                    catch (MatchException v16) {
                                                                                        throw _6B.a(v16);
                                                                                    }
                                                                                }
                                                                                v11 = this;
                                                                            }
                                                                            var23_13 = _6B.c("D", (Object)_6B.c("D", (Object)v11, (long)7929359697391575693L, (long)var2_2), (long)7929398911834936510L, (long)var2_2);
                                                                            try {
                                                                                if (var21_12 != null) break block102;
                                                                                if (var23_13 instanceof class_3965) {
                                                                                }
                                                                                ** GOTO lbl109
                                                                            }
                                                                            catch (MatchException v17) {
                                                                                throw _6B.a(v17);
                                                                            }
                                                                            var22_14 = (class_3965)var23_13;
                                                                            try {
                                                                                try {
                                                                                    v18 = new Object[3];
                                                                                    v18[2] = _6B.c("E", (long)7930353229910161832L, (long)var2_2);
                                                                                    v18[1] = _6B.c("\u00fd", (Object)var22_14, (long)7930548413721336213L, (long)var2_2);
                                                                                    v18[0] = var15_9;
                                                                                    v19 = _6B.c("\u00e3", (Object)v18, (long)7929877036028507769L, (long)var2_2);
                                                                                    if (var21_12 != null) break block103;
                                                                                    if (v19 == false) break block104;
                                                                                }
                                                                                catch (MatchException v20) {
                                                                                    throw _6B.a(v20);
                                                                                }
lbl109:
                                                                                // 2 sources

                                                                                _6B.c("\u00ec", (Object)this, (boolean)_6B.a("h", (int)12805, (long)(4701633184901493731L ^ var2_2)), (long)7928711494482731041L, (long)var2_2);
                                                                                v21 = new Object[1];
                                                                                v21[0] = var17_10;
                                                                                _6B.c("\u00fd", (Object)this, (Object)v21, (long)7929043258481624768L, (long)var2_2);
                                                                            }
                                                                            catch (MatchException v22) {
                                                                                throw _6B.a(v22);
                                                                            }
                                                                        }
                                                                        return;
                                                                    }
                                                                    v19 = _6B.c("D", (Object)this, (long)7929834692044932985L, (long)var2_2);
                                                                }
                                                                try {
                                                                    try {
                                                                        if (var21_12 != null) break block105;
                                                                        v23 = new Object[1];
                                                                        v23[0] = var13_8;
                                                                        if (v19 >= _6B.c("\u00fd", (Object)_6B.c("D", (Object)this, (long)7929269707380014849L, (long)var2_2), (Object)v23, (long)7928788005860743512L, (long)var2_2)) break block106;
                                                                    }
                                                                    catch (MatchException v24) {
                                                                        throw _6B.a(v24);
                                                                    }
                                                                    v25 = this;
                                                                    _6B.c("\u00ec", (Object)v25, (int)(_6B.c("D", (Object)v25, (long)7929834692044932985L, (long)var2_2) + true), (long)7929834692044932985L, (long)var2_2);
                                                                    return;
                                                                }
                                                                catch (MatchException v26) {
                                                                    throw _6B.a(v26);
                                                                }
                                                            }
                                                            v19 = _6B.c("D", (Object)this, (long)7929488710578699375L, (long)var2_2);
                                                        }
                                                        try {
                                                            block108: {
                                                                try {
                                                                    try {
                                                                        if (var21_12 != null) break block107;
                                                                        if (v19 != false) break block108;
                                                                    }
                                                                    catch (MatchException v27) {
                                                                        throw _6B.a(v27);
                                                                    }
                                                                    v28 = new Object[2];
                                                                    v28[1] = _6B.c("E", (long)7930281732482834660L, (long)var2_2);
                                                                    v28[0] = var19_11;
                                                                    _6B.c("\u00e3", (Object)v28, (long)7929707983000577356L, (long)var2_2);
                                                                    if (var21_12 == null) break block109;
                                                                }
                                                                catch (MatchException v29) {
                                                                    throw _6B.a(v29);
                                                                }
                                                            }
                                                            v19 = _6B.c("D", (Object)this, (long)7929488710578699375L, (long)var2_2);
                                                        }
                                                        catch (MatchException v30) {
                                                            throw _6B.a(v30);
                                                        }
                                                    }
                                                    try {
                                                        block111: {
                                                            try {
                                                                try {
                                                                    v31 /* !! */  = 1;
                                                                    if (var21_12 != null) break block110;
                                                                    if (v19 != v31 /* !! */ ) break block111;
                                                                }
                                                                catch (MatchException v32) {
                                                                    throw _6B.a(v32);
                                                                }
                                                                v33 = new Object[3];
                                                                v33[2] = true;
                                                                v33[1] = var22_14;
                                                                v33[0] = var9_6;
                                                                _6B.c("\u00e3", (Object)v33, (long)7929949035604529659L, (long)var2_2);
                                                                if (var21_12 == null) break block109;
                                                            }
                                                            catch (MatchException v34) {
                                                                throw _6B.a(v34);
                                                            }
                                                        }
                                                        v19 = _6B.c("D", (Object)this, (long)7929488710578699375L, (long)var2_2);
                                                        v31 /* !! */  = 2;
                                                    }
                                                    catch (MatchException v35) {
                                                        throw _6B.a(v35);
                                                    }
                                                }
                                                try {
                                                    block113: {
                                                        try {
                                                            try {
                                                                if (var21_12 != null) break block112;
                                                                if (v19 != v31 /* !! */ ) break block113;
                                                            }
                                                            catch (MatchException v36) {
                                                                throw _6B.a(v36);
                                                            }
                                                            v37 = new Object[2];
                                                            v37[1] = _6B.c("E", (long)7932873890976201660L, (long)var2_2);
                                                            v37[0] = var19_11;
                                                            _6B.c("\u00e3", (Object)v37, (long)7929707983000577356L, (long)var2_2);
                                                            if (var21_12 == null) break block109;
                                                        }
                                                        catch (MatchException v38) {
                                                            throw _6B.a(v38);
                                                        }
                                                    }
                                                    v19 = _6B.c("D", (Object)this, (long)7929488710578699375L, (long)var2_2);
                                                    v31 /* !! */  = 3;
                                                }
                                                catch (MatchException v39) {
                                                    throw _6B.a(v39);
                                                }
                                            }
                                            try {
                                                block115: {
                                                    try {
                                                        try {
                                                            if (var21_12 != null) break block114;
                                                            if (v19 != v31 /* !! */ ) break block115;
                                                        }
                                                        catch (MatchException v40) {
                                                            throw _6B.a(v40);
                                                        }
                                                        v41 = new Object[3];
                                                        v41[2] = true;
                                                        v41[1] = var22_14;
                                                        v41[0] = var9_6;
                                                        _6B.c("\u00e3", (Object)v41, (long)7929949035604529659L, (long)var2_2);
                                                        if (var21_12 == null) break block109;
                                                    }
                                                    catch (MatchException v42) {
                                                        throw _6B.a(v42);
                                                    }
                                                }
                                                v19 = _6B.c("D", (Object)this, (long)7929488710578699375L, (long)var2_2);
                                                v31 /* !! */  = 4;
                                            }
                                            catch (MatchException v43) {
                                                throw _6B.a(v43);
                                            }
                                        }
                                        try {
                                            block117: {
                                                try {
                                                    try {
                                                        if (var21_12 != null) break block116;
                                                        if (v19 != v31 /* !! */ ) break block117;
                                                    }
                                                    catch (MatchException v44) {
                                                        throw _6B.a(v44);
                                                    }
                                                    v45 = new Object[2];
                                                    v45[1] = _6B.c("E", (long)7930281732482834660L, (long)var2_2);
                                                    v45[0] = var19_11;
                                                    _6B.c("\u00e3", (Object)v45, (long)7929707983000577356L, (long)var2_2);
                                                    if (var21_12 == null) break block109;
                                                }
                                                catch (MatchException v46) {
                                                    throw _6B.a(v46);
                                                }
                                            }
                                            v19 = _6B.c("D", (Object)this, (long)7929488710578699375L, (long)var2_2);
                                            v31 /* !! */  = 5;
                                        }
                                        catch (MatchException v47) {
                                            throw _6B.a(v47);
                                        }
                                    }
                                    try {
                                        block119: {
                                            try {
                                                try {
                                                    if (var21_12 != null) break block118;
                                                    if (v19 != v31 /* !! */ ) break block119;
                                                }
                                                catch (MatchException v48) {
                                                    throw _6B.a(v48);
                                                }
                                                v49 = new Object[3];
                                                v49[2] = true;
                                                v49[1] = var22_14;
                                                v49[0] = var9_6;
                                                _6B.c("\u00e3", (Object)v49, (long)7929949035604529659L, (long)var2_2);
                                                v50 = new Object[3];
                                                v50[2] = true;
                                                v50[1] = var22_14;
                                                v50[0] = var9_6;
                                                _6B.c("\u00e3", (Object)v50, (long)7929949035604529659L, (long)var2_2);
                                                if (var21_12 == null) break block109;
                                            }
                                            catch (MatchException v51) {
                                                throw _6B.a(v51);
                                            }
                                        }
                                        v19 = _6B.c("D", (Object)this, (long)7929488710578699375L, (long)var2_2);
                                        v31 /* !! */  = (int)_6B.a("h", (int)3060, (long)(6535243675430832669L ^ var2_2));
                                    }
                                    catch (MatchException v52) {
                                        throw _6B.a(v52);
                                    }
                                }
                                try {
                                    block121: {
                                        try {
                                            try {
                                                if (var21_12 != null) break block120;
                                                if (v19 != v31 /* !! */ ) break block121;
                                            }
                                            catch (MatchException v53) {
                                                throw _6B.a(v53);
                                            }
                                            v54 = new Object[2];
                                            v54[1] = _6B.c("E", (long)7932873890976201660L, (long)var2_2);
                                            v54[0] = var19_11;
                                            _6B.c("\u00e3", (Object)v54, (long)7929707983000577356L, (long)var2_2);
                                            if (var21_12 == null) break block109;
                                        }
                                        catch (MatchException v55) {
                                            throw _6B.a(v55);
                                        }
                                    }
                                    v19 = _6B.c("D", (Object)this, (long)7929488710578699375L, (long)var2_2);
                                    v31 /* !! */  = (int)_6B.a("h", (int)11405, (long)(6531881707101547882L ^ var2_2));
                                }
                                catch (MatchException v56) {
                                    throw _6B.a(v56);
                                }
                            }
                            try {
                                block123: {
                                    try {
                                        try {
                                            if (var21_12 != null) break block122;
                                            if (v19 != v31 /* !! */ ) break block123;
                                        }
                                        catch (MatchException v57) {
                                            throw _6B.a(v57);
                                        }
                                        v58 = new Object[3];
                                        v58[2] = true;
                                        v58[1] = var22_14;
                                        v58[0] = var9_6;
                                        _6B.c("\u00e3", (Object)v58, (long)7929949035604529659L, (long)var2_2);
                                        if (var21_12 == null) break block109;
                                    }
                                    catch (MatchException v59) {
                                        throw _6B.a(v59);
                                    }
                                }
                                v19 = _6B.c("D", (Object)this, (long)7929488710578699375L, (long)var2_2);
                                v31 /* !! */  = (int)_6B.a("h", (int)14966, (long)(2134864009681140633L ^ var2_2));
                            }
                            catch (MatchException v60) {
                                throw _6B.a(v60);
                            }
                        }
                        try {
                            block125: {
                                try {
                                    try {
                                        if (var21_12 != null) break block124;
                                        if (v19 != v31 /* !! */ ) break block125;
                                    }
                                    catch (MatchException v61) {
                                        throw _6B.a(v61);
                                    }
                                    v62 = new Object[1];
                                    v62[0] = var13_8;
                                    v63 = new Object[2];
                                    v63[1] = var11_7;
                                    v63[0] = (int)(_6B.c("\u00fd", (Object)_6B.c("D", (Object)this, (long)7930836472185547869L, (long)var2_2), (Object)v62, (long)7928788005860743512L, (long)var2_2) - true);
                                    _6B.c("\u00e3", (Object)v63, (long)7928818946410423237L, (long)var2_2);
                                    if (var21_12 == null) break block109;
                                }
                                catch (MatchException v64) {
                                    throw _6B.a(v64);
                                }
                            }
                            v19 = _6B.c("D", (Object)this, (long)7929488710578699375L, (long)var2_2);
                            v31 /* !! */  = (int)_6B.a("h", (int)2399, (long)(2985021002648733877L ^ var2_2));
                        }
                        catch (MatchException v65) {
                            throw _6B.a(v65);
                        }
                    }
                    try {
                        try {
                            block127: {
                                try {
                                    try {
                                        if (var21_12 != null) break block126;
                                        if (v19 != v31 /* !! */ ) break block127;
                                    }
                                    catch (MatchException v66) {
                                        throw _6B.a(v66);
                                    }
                                    v67 = new Object[3];
                                    v67[2] = true;
                                    v67[1] = var22_14;
                                    v67[0] = var9_6;
                                    _6B.c("\u00e3", (Object)v67, (long)7929949035604529659L, (long)var2_2);
                                    if (var21_12 == null) break block109;
                                }
                                catch (MatchException v68) {
                                    throw _6B.a(v68);
                                }
                            }
                            v69 = this;
                            if (var21_12 != null) break block128;
                        }
                        catch (MatchException v70) {
                            throw _6B.a(v70);
                        }
                        v19 = _6B.c("D", (Object)v69, (long)7929488710578699375L, (long)var2_2);
                        v31 /* !! */  = (int)_6B.a("h", (int)15471, (long)(8356318136584994188L ^ var2_2));
                    }
                    catch (MatchException v71) {
                        throw _6B.a(v71);
                    }
                }
                try {
                    if (v19 == v31 /* !! */ ) {
                        _6B.c("\u00ec", (Object)this, (boolean)_6B.a("h", (int)12805, (long)(4701633184901493731L ^ var2_2)), (long)7928711494482731041L, (long)var2_2);
                        _6B.c("\u00ec", (Object)this, (int)_6B.a("h", (int)12805, (long)(4701633184901493731L ^ var2_2)), (long)7929488710578699375L, (long)var2_2);
                        v72 = new Object[1];
                        v72[0] = var17_10;
                        _6B.c("\u00fd", (Object)this, (Object)v72, (long)7929043258481624768L, (long)var2_2);
                        return;
                    }
                }
                catch (MatchException v73) {
                    throw _6B.a(v73);
                }
            }
            v69 = this;
        }
        _6B.c("\u00ec", (Object)v69, (int)(_6B.c("D", (Object)v69, (long)7929488710578699375L, (long)var2_2) + true), (long)7929488710578699375L, (long)var2_2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean boolean_4(Object[] objectArray) {
        _4w[] wArray;
        Object object;
        _4w[] wArray2;
        boolean bl;
        long l2;
        block11: {
            block12: {
                l2 = (Long)objectArray[0];
                l2 = b ^ l2;
                CallSite callSite = _6B.c("\u00fd", (Object)_6B.c("D", (Object)_6B.c("D", (Object)this, -7273363952711952504L, (long)l2), -7273843521477669775L, (long)l2), -7274042509515248793L, (long)l2);
                boolean bl2 = false;
                bl = false;
                wArray2 = _3s.cfr_renamed_5();
                for (int j = 0; j < _6B.a("h", 19172, (long)(0x46B336F14120FE09L ^ l2)); ++j) {
                    Object object2;
                    _4w[] wArray3;
                    block13: {
                        block14: {
                            CallSite callSite2;
                            block15: {
                                callSite2 = _6B.c("\u00fd", (Object)callSite, (int)j, -7275376420681514790L, (long)l2);
                                try {
                                    try {
                                        object = _6B.c("\u00fd", (Object)_6B.c("\u00fd", (Object)callSite2, -7275482059137688839L, (long)l2), (Object)_6B.c("E", -7274604639750498847L, (long)l2), -7275290894669171326L, (long)l2);
                                        wArray = wArray2;
                                        if (l2 <= 0L) break block11;
                                        if (wArray != null) break block12;
                                        wArray3 = wArray2;
                                        if (l2 < 0L) break block13;
                                        if (wArray3 != null) break block14;
                                    }
                                    catch (MatchException matchException) {
                                        throw _6B.a(matchException);
                                    }
                                    if (!object) break block15;
                                }
                                catch (MatchException matchException) {
                                    throw _6B.a(matchException);
                                }
                                bl2 = true;
                            }
                            object2 = _6B.c("\u00fd", (Object)_6B.c("\u00fd", (Object)callSite2, -7275482059137688839L, (long)l2), (Object)_6B.c("E", -7272655472418582855L, (long)l2), -7275290894669171326L, (long)l2);
                        }
                        wArray3 = wArray2;
                    }
                    if (wArray3 == null) {
                        if (!object2) continue;
                        object2 = true;
                    }
                    bl = object2;
                    if (wArray2 == null) continue;
                }
                if (l2 <= 0L) return false;
                object = bl2;
            }
            wArray = wArray2;
        }
        if (l2 > 0L) {
            if (wArray == null) {
                if (!object) return false;
                object = bl;
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
            return MethodHandles.lookup().findStatic(_6B.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_6B.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

