/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_5498
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._3C;
import dev.krypton._3i_0;
import dev.krypton._40;
import dev.krypton._4r;
import dev.krypton._6a_0;
import dev.krypton._6x_0;
import dev.krypton._92;
import dev.krypton._95;
import dev.krypton._9E;
import dev.krypton._9c;
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
import net.minecraft.class_5498;

/*
 * Renamed from dev.krypton.5d
 */
public class _5d_0
extends _6x_0 {
    public final _9E cfr_renamed_88;
    public final _92 cfr_renamed_70;
    public final _9E cfr_renamed_1;
    public final _9r cfr_renamed_96;
    final _9r cfr_renamed_0;
    final _9r cfr_renamed_65;
    final _92 cfr_renamed_4;
    final _9r cfr_renamed_2;
    public float cfr_renamed_8;
    public float cfr_renamed_6;
    private float cfr_renamed_9;
    private float cfr_renamed_99;
    private float cfr_renamed_102;
    private float cfr_renamed_71;
    private class_5498 cfr_renamed_3;
    static final boolean cfr_renamed_7;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    @Override
    public native void cfr_renamed_5();

    public double double_1(Object[] objectArray) {
        Object object = (Double)objectArray[0];
        double d = (Double)objectArray[1];
        long l2 = (Long)objectArray[2];
        double d2 = (Double)objectArray[3];
        l2 = b ^ l2;
        object = _5d_0.c("v", 0.0, (double)_5d_0.c("v", 1.0, (double)object, -3501803079315812413L, (long)l2), -3495359593182503036L, (long)l2);
        double d3 = object * object * (3.0 - 2.0 * object);
        return d + _5d_0.c("v", (double)(d2 - d), -3503319854252483706L, (long)l2) * d3;
    }

    public _5d_0(char c, char c2, int n) {
        long l2;
        long l3 = l2 = ((long)c << 48 | (long)c2 << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        long l4 = l3 ^ 0x1F42F047D917L;
        long l5 = l3 ^ 0x5730A20E64B1L;
        long l6 = l3 ^ 0x475090C71D22L;
        long l7 = l3 ^ 0x7D4D4BDF1DE0L;
        long l8 = l7 >>> 8;
        int n2 = (int)(l7 << 56 >>> 56);
        long l9 = l3 ^ 0x108354DECD8L;
        long l10 = l3 ^ 0x1EC8A66903AAL;
        long l11 = l3 ^ 0x547C64BB887CL;
        super((int)_5d_0.a("w", 31346, (long)(0x74A947FB5FED2576L ^ l2)), -1, (_4r)((Object)_5d_0.c("z", 5035280757125642126L, (long)l2)), l9);
        this.cfr_renamed_88 = new _9E((int)_5d_0.a("w", 26328, (long)(0x32C46B1C3C4B39D5L ^ l2)), l4, (Enum)((Object)_5d_0.c("z", 5043646027186627195L, (long)l2)), _3C.class);
        this.cfr_renamed_70 = new _92((int)_5d_0.a("w", 31070, (long)(0x16B3C4D04DAC264CL ^ l2)), 1.0, l6, 10.0, 3.0, 1.0);
        this.cfr_renamed_1 = new _9E((int)_5d_0.a("w", 7867, (long)(0x3435A3386659C1ABL ^ l2)), l4, (Enum)((Object)_5d_0.c("z", 5043993003676605792L, (long)l2)), _9c.class);
        this.cfr_renamed_96 = new _9r((int)_5d_0.a("w", 28684, (long)(0x4870C9B660602F00L ^ l2)), false, l5);
        this.cfr_renamed_0 = new _9r((int)_5d_0.a("w", 28166, (long)(0x62B4EE00591CB10CL ^ l2)), true, l5);
        this.cfr_renamed_65 = new _9r((int)_5d_0.a("w", 18160, (long)(0xBC32DBFB10819F8L ^ l2)), true, l5);
        this.cfr_renamed_4 = new _92((int)_5d_0.a("w", 23921, (long)(0x184361A21C43827FL ^ l2)), 1.0, l6, 10.0, 1.0, 1.0);
        this.cfr_renamed_2 = new _9r((int)_5d_0.a("w", 24901, (long)(0x470FC5C3BD523E46L ^ l2)), false, l5);
        _5d_0.c("\u00d4", (Object)this, (class_5498)_5d_0.c("z", 5035375280839532395L, (long)l2), 5035990293837161660L, (long)l2);
        CallSite callSite = _5d_0.c("\u00c4", (Object)this, 5043312270442883879L, (long)l2);
        CallSite callSite2 = _5d_0.c("\u00c4", (Object)this, 5036797330563010806L, (long)l2);
        _5d_0.c("v", (Object)callSite2, 5036717823856117112L, (long)l2);
        Object[] objectArray = new Object[3];
        objectArray[2] = () -> ((_9r)((Object)callSite2)).cfr_renamed_3(l11);
        objectArray[1] = (int)((byte)n2);
        objectArray[0] = l8;
        _5d_0.c("D", (Object)callSite, (Object)objectArray, 5036912478776089198L, (long)l2);
        CallSite callSite3 = _5d_0.c("\u00c4", (Object)this, 5041933931855534200L, (long)l2);
        CallSite callSite4 = _5d_0.c("\u00c4", (Object)this, 5036797330563010806L, (long)l2);
        _5d_0.c("v", (Object)callSite4, 5036717823856117112L, (long)l2);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = () -> ((_9r)((Object)callSite4)).cfr_renamed_3(l11);
        objectArray2[1] = (int)((byte)n2);
        objectArray2[0] = l8;
        _5d_0.c("D", (Object)callSite3, (Object)objectArray2, 5036912478776089198L, (long)l2);
        _95[] nullArray = new _95[_5d_0.a("w", 11443, (long)(0x4068CC10072EF3B5L ^ l2))];
        nullArray[0] = _5d_0.c("\u00c4", (Object)this, 5043353599847651976L, (long)l2);
        nullArray[1] = _5d_0.c("\u00c4", (Object)this, 5042564521069605882L, (long)l2);
        nullArray[2] = _5d_0.c("\u00c4", (Object)this, 5036356641817277881L, (long)l2);
        nullArray[3] = _5d_0.c("\u00c4", (Object)this, 5036404572368929275L, (long)l2);
        nullArray[4] = _5d_0.c("\u00c4", (Object)this, 5036797330563010806L, (long)l2);
        nullArray[5] = _5d_0.c("\u00c4", (Object)this, 5043312270442883879L, (long)l2);
        nullArray[_5d_0.a("w", 3401, (long)(0x55063EA6196AD246L ^ l2))] = _5d_0.c("\u00c4", (Object)this, 5041933931855534200L, (long)l2);
        nullArray[_5d_0.a("w", 20664, (long)(0x7A99CAFE5B750FABL ^ l2))] = _5d_0.c("\u00c4", (Object)this, 5036588857106528629L, (long)l2);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = nullArray;
        objectArray3[0] = l10;
        _5d_0.c("D", (Object)this, (Object)objectArray3, 5043734185169090680L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                a.init(_5d_0.class, 26);
                _5d_0.b = l.a(-3991505721576254688L, 534758296320015954L, MethodHandles.lookup().lookupClass()).a(24356525099730L);
                var11 = _5d_0.b ^ 89577248074759L;
                _5d_0.j = new Object[96];
                _5d_0.k = new String[96];
                _5d_0.b();
                _5d_0.f = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var11 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var6_3 = new long[20];
                var3_4 = 0;
                var4_5 = "\u0091\u00fc\u008d3\u00fax\u00bc\u00eb\t\u00da\n \u00c0`\n\u0091\u00ab\u008c\u00b8@\u00f1\u009d\u0098\u00bdR\u0018\u001f#\u00df\u00a3\u0088\u00bbw\u00b3\u00c28\u00c2\u001c\u00ec8h\u0084\u00d51\u0090\u00d9e\u001a\u00ead\u009aB1`\u0081BR\u0006=\u000f\u00f6\u00af\u00dbY\\\u00aa)\u00dbv}j\u00b6\u0089@\u00dcN\u00bc\u00da\u008b\u0085=\u00af\u0083\u008f\u001e\u00cc\u00aa\u0000\u00be\u008d\u00bcP\u00f6\u00e3\u0005W\u00af\u00baW\u00f5\u009d\u00ea\u009a\u00c8V\u00fd\u00dd\u00bd^\u0081S\u00b8\u009c\u00d7\u00f9\u00e1\u00b4D\u0082\u00c5\u00e9\u0085\u0004b\u00fc\u00e3\u0017\f\"\u00fbDP\u008f\u0085\u001d=$,\u008a\u0015.]\u00e5\u00ee";
                var5_6 = "\u0091\u00fc\u008d3\u00fax\u00bc\u00eb\t\u00da\n \u00c0`\n\u0091\u00ab\u008c\u00b8@\u00f1\u009d\u0098\u00bdR\u0018\u001f#\u00df\u00a3\u0088\u00bbw\u00b3\u00c28\u00c2\u001c\u00ec8h\u0084\u00d51\u0090\u00d9e\u001a\u00ead\u009aB1`\u0081BR\u0006=\u000f\u00f6\u00af\u00dbY\\\u00aa)\u00dbv}j\u00b6\u0089@\u00dcN\u00bc\u00da\u008b\u0085=\u00af\u0083\u008f\u001e\u00cc\u00aa\u0000\u00be\u008d\u00bcP\u00f6\u00e3\u0005W\u00af\u00baW\u00f5\u009d\u00ea\u009a\u00c8V\u00fd\u00dd\u00bd^\u0081S\u00b8\u009c\u00d7\u00f9\u00e1\u00b4D\u0082\u00c5\u00e9\u0085\u0004b\u00fc\u00e3\u0017\f\"\u00fbDP\u008f\u0085\u001d=$,\u008a\u0015.]\u00e5\u00ee".length();
                var2_7 = 0;
                while (true) {
                    var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                    v3 = var6_3;
                    v4 = var3_4++;
                    v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v6 = -1;
                    break block10;
                    break;
                }
lbl30:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var2_7 < var5_6) ** continue;
                    var4_5 = "\u00cd\u00e4K\u00c6\u00f5Z\u00ee\u00b4`\u00f4\u00c9\u00bd\u0088\u000f\u0019\u0095";
                    var5_6 = "\u00cd\u00e4K\u00c6\u00f5Z\u00ee\u00b4`\u00f4\u00c9\u00bd\u0088\u000f\u0019\u0095".length();
                    var2_7 = 0;
                    while (true) {
                        var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                        v3 = var6_3;
                        v4 = var3_4++;
                        v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
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
                    if (var2_7 < var5_6) ** continue;
                    break block11;
                    break;
                }
            }
            var8_9 = v5;
            var10_10 = var0_1.doFinal(new byte[]{(byte)(var8_9 >>> 56), (byte)(var8_9 >>> 48), (byte)(var8_9 >>> 40), (byte)(var8_9 >>> 32), (byte)(var8_9 >>> 24), (byte)(var8_9 >>> 16), (byte)(var8_9 >>> 8), (byte)var8_9});
            v7 = ((long)var10_10[0] & 255L) << 56 | ((long)var10_10[1] & 255L) << 48 | ((long)var10_10[2] & 255L) << 40 | ((long)var10_10[3] & 255L) << 32 | ((long)var10_10[4] & 255L) << 24 | ((long)var10_10[5] & 255L) << 16 | ((long)var10_10[6] & 255L) << 8 | (long)var10_10[7] & 255L;
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
        _5d_0.d = var6_3;
        _5d_0.e = new Integer[20];
        try {
            v8 = _5d_0.c("D", _5d_0.class, (long)44790240586154141L, (long)var11) == false;
        }
        catch (MatchException v9) {
            throw _5d_0.a(v9);
        }
        _5d_0.cfr_renamed_7 = v8;
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
            case 0 -> 53;
            case 1 -> 6;
            case 2 -> 36;
            case 3 -> 60;
            case 4 -> 22;
            case 5 -> 34;
            case 6 -> 61;
            case 7 -> 26;
            case 8 -> 59;
            case 9 -> 15;
            case 10 -> 7;
            case 11 -> 54;
            case 12 -> 33;
            case 13 -> 40;
            case 14 -> 50;
            case 15 -> 21;
            case 16 -> 55;
            case 17 -> 47;
            case 18 -> 52;
            case 19 -> 58;
            case 20 -> 4;
            case 21 -> 62;
            case 22 -> 0;
            case 23 -> 13;
            case 24 -> 24;
            case 25 -> 23;
            case 26 -> 27;
            case 27 -> 32;
            case 28 -> 3;
            case 29 -> 49;
            case 30 -> 35;
            case 31 -> 42;
            case 32 -> 39;
            case 33 -> 19;
            case 34 -> 63;
            case 35 -> 25;
            case 36 -> 41;
            case 37 -> 38;
            case 38 -> 29;
            case 39 -> 8;
            case 40 -> 20;
            case 41 -> 37;
            case 42 -> 18;
            case 43 -> 51;
            case 44 -> 17;
            case 45 -> 30;
            case 46 -> 5;
            case 47 -> 46;
            case 48 -> 56;
            case 49 -> 28;
            case 50 -> 10;
            case 51 -> 31;
            case 52 -> 45;
            case 53 -> 14;
            case 54 -> 44;
            case 55 -> 43;
            case 56 -> 12;
            case 57 -> 16;
            case 58 -> 11;
            case 59 -> 1;
            case 60 -> 9;
            case 61 -> 57;
            case 62 -> 2;
            default -> 48;
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
        _5d_0.k[n3] = new String(cArray);
        return n3;
    }

    @_3i_0
    public void cfr_renamed_1(_6a_0 a_0) {
        long l2 = b ^ 0x390560B32905L;
        long l3 = l2 ^ 0x1A82712FC818L;
        try {
            if (_5d_0.c("D", (Object)_5d_0.c("\u00c4", (Object)this, 396503376501686687L, (long)l2), (long)l3, 403446736295784789L, (long)l2) != false) {
                a_0.void_8();
            }
        }
        catch (MatchException matchException) {
            throw _5d_0.a(matchException);
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _5d_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = "nX\u000e\u0017>qeW\u001fXSqeJ\u000b";
        objectArray[1] = Boolean.TYPE;
        _5d_0.k[1] = "java/lang/Boolean";
        objectArray[2] = "%VMqd<%VZ-h3?\u001dZ3h&8l\nj:g";
        objectArray[3] = Double.TYPE;
        _5d_0.k[3] = "java/lang/Double";
        objectArray[4] = "\u0015\u007f%\u001b$[\u001ep4TGV\u000bv";
        objectArray[5] = "twF0uwibDqp+%v";
        objectArray[6] = Float.TYPE;
        _5d_0.k[6] = "java/lang/Float";
        objectArray[7] = "1o\u001bO-\u001fDO\u0010@<P%A\u001bK8\nQ";
        objectArray[8] = "3U+\u001f09.@)^5en\u0002";
        objectArray[9] = "\u0007~`\u0002\u0006\u0002r^k\r\u0017M\u0013P`\u0006\u0013\u0017g";
        objectArray[10] = "\u0006 >\u0015\bD\u0006 )I\u0004K\u001ck)W\u0004^\u001b\u001a}\u000fS";
        objectArray[11] = Void.TYPE;
        _5d_0.k[11] = "java/lang/Void";
        objectArray[12] = "\u0007c\u001aP+A\u001av\u0018\u0011.\u001dZt";
        objectArray[13] = "1\u0012fExMD2mJi\u0002%<fAmXQ";
        objectArray[14] = "'\u0015\u0016\u000bs\u0007:\u0000\u0014Jv[z\u0013";
        objectArray[15] = Integer.TYPE;
        _5d_0.k[15] = "java/lang/Integer";
        objectArray[16] = "P\u0017\u0017\u000691%7\u001c\t(~D9\u0017\u0002,$0";
        objectArray[17] = "h^\u0003I{auK\u0001\b~=?x";
        objectArray[18] = Long.TYPE;
        _5d_0.k[18] = "java/lang/Long";
        objectArray[19] = "=_'u\u001bS J%4\u001e\u000f`\u007f";
        objectArray[20] = "[F\u0011\u0019i>[F\u0006Ee1A\r\u0006[e$F|V\u00064";
        objectArray[21] = "K%hjUx>\u0005ceD7_\u000bhn@m+";
        objectArray[22] = "\u001dBx3\u000bW\u0016Mi|`U\u0002N";
        objectArray[23] = "'13i\u0012\u000f:$1(\u0017Su,";
        objectArray[24] = " !\r>a?=4\u000f\u007fdc}\u000f";
        objectArray[25] = "oNk,9;\u001an`#(t{`k(,.\u000f";
        objectArray[26] = "\tN\u0013a\u001c\u007f\tN\u0004=\u0010p\u0013\u0005\u0004#\u0010e\u0014tV}H!";
        objectArray[27] = "\u0003p^s8`\u0003pI/4o\u0019;I14z\u001eJ\u0019l`";
        objectArray[28] = "\u0019\"\u0001~:\u0003\u0019\"\u0016\"6\f\u0003i\u0016<6\u0019\u0004\u0018@dnR";
        objectArray[29] = "G6yWI\u0018Z#{\u0016LD\u0011";
        objectArray[30] = "[\u000efw\u00113F\u001bd6\u0014o\u000fY";
        objectArray[31] = "2\u001f0\u0011':G?;\u001e6u&10\u00152/R";
        objectArray[32] = "nrkAlL\u001bR`N}\u0003z\\kEyY\u000e";
        objectArray[33] = "NH\u0018\u007fiuS]\u001a>l)\u0013\u0018";
        objectArray[34] = "^4*\u000eto+\u0014!\u0001e J\u001a*\naz>";
        objectArray[35] = "vC[g\n1kVY&\u000fm&T";
        objectArray[36] = "-\u0017m\u000e\u0003]X7f\u0001\u0012\u001299m\n\u0016HM";
        objectArray[37] = "\u001dRb&}\u0006\u0003Zxi\u001c\u0011\u001dVw3 ";
        objectArray[38] = "\r3\u0011R<K\u0006<\u0000\u001d]E\r7\u0004G";
        objectArray[39] = "\u0015?v=!U\u00146c|X_L\\,q$\u0019A<|k`\u001c";
        objectArray[40] = "w3ugh\u0001l.\u001e39\u0017n%s3\u001d\u0017t2d#5\u000bi\u0004b6(\u0011t_f&iVw:/n1l";
        objectArray[41] = "(\b\u007f\u0006\u0017o)\u0001jGne\\k$@\u0000%zPe\u0003\f3";
        objectArray[42] = "6\u000f9Ux:7\u0006,\u0014\u00017\rP%\u0006{c6\u0011f\nm";
        objectArray[43] = "\u001cUVXZ'\u001d\\C\u0019#,'N\nTIk\u001aD]\u0002\u0013\u0017\u001d\\\b\u0001IfB\u000f\u0001\u0019#";
        objectArray[44] = "m.\u0006\nE\u0018.7\u0011\u0005z\u0007?2\u001d\u0004\u00165ipA^Fbn5\u0013\u0019\u0013Y/v\u001f\u000fz";
        objectArray[45] = "VLXOHoWEM\u000e1`m\u0013D\u001cK6VR\u0007\u0010]";
        objectArray[46] = "xj0Ve\\yc%\u0017\u001cRC9)\u0012,\u0002!b*\u000bz";
        objectArray[47] = "*SN#`Q+Z[b\u0019[\u0011H\u0012/s\u001d,BEy)a-KGdpZl\bKr\u0019";
        objectArray[48] = "CYZG\u0006vBPO\u0006\u007fzxBDGE>\u001d\u000b\f\u001f";
        objectArray[49] = "VBn\u0000%o\u0007\u000bd\u0006\\5E\u001e\u007f\u001956?\u001bs\u00026m@On\u00133R";
        objectArray[50] = ")\u0014\\m/\u001c3\u0001UpRI&\u0003Zm>{pF\u00026i,)\u001cFroM,\u0012BqR\u00137\u0011Cr0G5\u0014@\n";
        objectArray[51] = "]VM\u007fuS\f\u001fGy\f(S\u001cXihn]VM\u007fuS\f\u001fGy";
        objectArray[52] = "\b<\u001e\u0003X\u001b\t5\u000bB!\u00123'B\u000fKW\u000e-\u0015Y\u0011+\t5@ZKZVfIB!";
        objectArray[53] = "]\u001cG]0z\u001e\u0005PR\u000fe\u000f\u0000\\ScWYB\u0000\t2\u0000^\u0007RNf;\u001fD^X\u000f";
        objectArray[54] = "H\\\u0005\u0002hc\u0012H\u0010V\u0014\u0016JT\u0007E}]H\\\u0005\u0002hc\u0012H\u0010V";
        objectArray[55] = "svX8>!w*K2Cj\u001cm\u000fm)/!gX;sS#iZ%;1wk_&C";
        objectArray[56] = "$D\u0005{!J\u007fG\u001c-O\u0012\u0014Q\u00053wQ+Q\u001d7p(lCAq7M%\u000b\u0019K";
        objectArray[57] = "\u0010\u001d\"QB\u0012\u0011\u00147\u0010;\u001a+C4\u0010GMK\u0013.TB";
        objectArray[58] = "H\u00049BPfI\r,\u0003)l2g2\u0014\u0013/\u0014\u001ef\u000eC5";
        objectArray[59] = "m{7S\u0013'*d-M~!>u]\u0011\u0014}3o,NGt+\u0005gAG =t8\u0012N8W?7\u0012\u001a.&`d\u001b\u0002D";
        objectArray[60] = "\n\u00021\f\u0002#\u000e^\"\u0006\u007fle\u0019fY\u0015-X\u00131\u000fOQZ\u001d3\u0011\u00073\u000e\u001f6\u0012\u007f";
        objectArray[61] = "\u0017\b\bp\fS\u0013T\u001bzq\u0010x\u0013\u001d)KY\u001dZUqq";
        objectArray[62] = "]_(;D_TAg`6T\\Su>Zf\b\u0012+a6PWHu>\\N\rU{Y";
        objectArray[63] = "m\\j+(\u0001.E}$\u0017\u001e?@q%{,i\u0002-\u007f){nG\u007f8~@/\u0004s.\u0017D.Rh:u\u0010,WkB";
        objectArray[64] = "/~q( 9&`>sR9\"c(&\u0005n|4pJm78gs0../h";
        objectArray[65] = "\u0010*\u001bN[\u000f\u0011#\u000e\u000f\"\u0005++\u001f\u000fZ\u0002J.\u0011\u000bY";
        objectArray[66] = "\bZc<\u001f\"\bP:`'w\u00076:>\u001f3\u0017D$a\u00170";
        objectArray[67] = "mJCZb\u0018lCV\u001b\u001b\u0012*)\u0018\u001cuR?\u0012Y_yD";
        objectArray[68] = "L\u0019)8zh\u000b\u00063&\u0017s\u0011\u0018Cz}2\u0012\r2%.;\ngy*.o\u001c\u0016&y'wv])ysa\u0007\u0002zpk\u000b";
        objectArray[69] = "\bTbzk\u0019PFn&\u0005D\\P~piv\b\u0011%)>!\rWpml\u001aL\u0014|{\u0005\u001dJBd~>\\\tNr\u00179Z_Vw,x\u0019S@\u001e+~OKE%j=C],";
        objectArray[70] = "[(<TK\u000fZ!)\u00152\u0005<Kg\u0012\\E\tp&QPS";
        objectArray[71] = "Kl`\u0019X\u001cU3h\u001a$S/tcUN\u0012\u0012~4\u0003\u0014n@o4\u0000Y\u001cD3'\n$";
        objectArray[72] = "\u0005q\u0011\f!\u001e\u0000\u007f\u0015\u000f\u001c\u0011\u0006\u007f\t\u0018KEY,SH\u001c\u001d\u0004n\u0015I}\u0018\nj\u0016";
        objectArray[73] = "HZaLy)\u0010Hm\u0010\u0017t\u001c^}F{FH\u001f&\u0010,\u0011MYs[~*\f\u001a\u007fM\u0017-\nLgH,lI@q!";
        objectArray[74] = ":Y{(e\u007fbKwt\u000b\"n]g\"g\u0010:\u001c<~;G9K>!a6f\u001879\u000b}i\u0018c/z\":\u0011{E";
        objectArray[75] = ".\u00045(4\u001d~\u001eq-[M\u0013\rre1\u0001.\u0007%3k}/\u000e'.2FnM+8[";
        objectArray[76] = "\u000b3\u001d_yRH*\nPFMY/\u0006Q*\u007f\u000fmZ\u000by(\b(\bL/\u0013Ik\u0004ZF\u0017H=\u001fN$CJ8\u001c6";
        objectArray[77] = "6\u0017Fh\b]7\u001eS)qV\rHZ;\u000b\u00046\t\u00197\u001d";
        objectArray[78] = "jb\r9\u007fIt8\u00107\u0018Ffx\n>tt6;Wf\u0018[r9P!}\u0012:aj";
        objectArray[79] = ".@vj1\u000e Fny\\?\u0004e]Y\u0006e.@vj1\u000e Fny";
        objectArray[80] = "}`\u001c\t*\u0015:\u007f\u0006\u0017G\u0013&xvK-O#t\u0007\u0014~F;\u001eL\u001b~\u0012-o\u0013Hw\nG$\u001cH#\u001c6{OA;v";
        objectArray[81] = "\u0016\f\u0003\u007fz-L\u0018\u0016+\u0006t\u0007\r\r$ow}\b\u0001?l,\u0002\\\u001c.i\u0013";
        objectArray[82] = "CZ/\u0019H$JD`B:$NGv\u0017ms\u0011\u001b*{X!IMoKB4@P";
        objectArray[83] = "HlHY9rV6UW^vHgKU\t%\u00184\u00179&a\u00140W\\o)L";
        objectArray[84] = "=YNk-\u000e.\u001bJaU\u0015(YPf/\u0002\u0003GKA(\u000b! Te)\n*\\J7h\u0017EYO{0\u00009G\u001d:-o";
        objectArray[85] = "w{%W\u0002vvr0\u0016{|\u0000\u0018r\u0014\u0002v\"z)\u0017\u001b ";
        objectArray[86] = "#\u00060M\ft:\u0006(\\2,E\u0011j\u0002Xlx\u001b=T\u0002\u0010#\u00060M\ft:\u0006(\\2";
        objectArray[87] = "K'1M\bd\u001f=aWo,'40\u0005\u0005a\u001a>gS_\u001dI30P\u0004#U.vSo";
        objectArray[88] = "0w?<vx*b6!\u000b-?`9<g\u001fi%ag7H0\u007f%#6)5q! \u000b";
        objectArray[89] = "3E'\u0001Ed6K#\u0002xk0K?\u0015/?o\u0018eDxg2Z#D\u0019b<^ ";
        objectArray[90] = "2\u001bc\f#g3\u0012vMZf\t\u0014o\u000b#0p@u[9";
        objectArray[91] = "dOT>V\rdE\rbnXD#\n0S\u0003?O\n:\n_";
        objectArray[92] = "ZB\u0011p\u001c*^\u001e\u0002zaa5M\r)\u0003*[D\u0013fX";
        objectArray[93] = "-=GESi\"s\u001e\\5#MuL\u0011_op\u007f\u001bG\u0005\u00135tJ\u001aMv|<\u0012 ";
        objectArray[94] = "P!K 3\u0014Q(^aJ\u0014krRdzJ\t)Q},";
        Object[] objectArray2 = objectArray;
        objectArray[95] = "\"1t+\fE#8ajuO\"R#h\fEw0xk\u0015\u0013";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c4' || c == '\u00d4' || c == 'z' || c == '\u00ec') {
                field = _5d_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c4' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d4' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'z' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5d_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'D' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'v' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            throw new RuntimeException("dev/krypton/5d" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = _5d_0.e(l2, l3);
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
                clazz3 = _5d_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5d_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5d_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5d_0.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5d_0.f(2696481428888653L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5d_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5d_0.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5d_0.f(2696481428888653L, 0L);
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
            int n = _5d_0.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _5d_0.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5d_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5d_0.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5d_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5d_0.d(classArray[j], string, clazz2);
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
            throw new RuntimeException("dev/krypton/5d" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5d_0.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x1AF0;
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
                throw new RuntimeException("dev/krypton/5d", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5d_0.e[n2] = n3;
        }
        return e[n2];
    }

    private static Field g(long l2, long l3) {
        int n = _5d_0.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _5d_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5d_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5d_0.c(clazz3, string2, clazz2)) != null) {
                    _5d_0.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5d_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5d_0.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5d_0.f(2696481428888653L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public native void cfr_renamed_2();

    @_3i_0
    public void cfr_renamed_3(_9o o) {
        block15: {
            CallSite callSite;
            long l2;
            block14: {
                int n;
                block12: {
                    block13: {
                        _5d_0 d_0;
                        block10: {
                            block11: {
                                l2 = b ^ 0x37ECAB1993D7L;
                                long l3 = l2 ^ 0x146BBA8572CAL;
                                n = _3C.cfr_renamed_4();
                                try {
                                    try {
                                        d_0 = this;
                                        if (n != 0) break block10;
                                        if (_5d_0.c("D", (Object)_5d_0.c("\u00c4", (Object)d_0, -4660478695506773171L, (long)l2), (long)l3, -4662533747531723897L, (long)l2) != false) break block11;
                                    }
                                    catch (MatchException matchException) {
                                        throw _5d_0.a(matchException);
                                    }
                                    return;
                                }
                                catch (MatchException matchException) {
                                    throw _5d_0.a(matchException);
                                }
                            }
                            d_0 = this;
                        }
                        try {
                            callSite = _5d_0.c("D", (Object)_5d_0.c("\u00c4", (Object)d_0, -4660546303992118502L, (long)l2), -4662689394289898075L, (long)l2);
                            if (n != 0) break block12;
                            if (callSite != null) break block13;
                        }
                        catch (MatchException matchException) {
                            throw _5d_0.a(matchException);
                        }
                        return;
                    }
                    callSite = _5d_0.c("D", (Object)_5d_0.c("\u00c4", (Object)this, -4660546303992118502L, (long)l2), -4662689394289898075L, (long)l2);
                }
                try {
                    try {
                        if (n != 0) break block14;
                        if (_5d_0.c("D", (Object)callSite, -4659270423314210788L, (long)l2) == false) break block15;
                    }
                    catch (MatchException matchException) {
                        throw _5d_0.a(matchException);
                    }
                    callSite = _5d_0.c("D", (Object)_5d_0.c("\u00c4", (Object)this, -4660546303992118502L, (long)l2), -4662689394289898075L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _5d_0.a(matchException);
                }
            }
            _5d_0.c("\u00d4", (Object)callSite, (boolean)true, -4660743274352585897L, (long)l2);
        }
    }

    public float float_2(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        long l2 = (Long)objectArray[1];
        float f2 = ((Float)objectArray[2]).floatValue();
        float f3 = ((Float)objectArray[3]).floatValue();
        l2 = b ^ l2;
        return f2 + _5d_0.c("v", (float)(f3 - f2), -2052163836718254671L, (long)l2) * f;
    }

    public static double double_3(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        float f = ((Float)objectArray[2]).floatValue();
        long l2 = (Long)objectArray[3];
        l2 = b ^ l2;
        double d3 = 1.70158;
        double d4 = 2.70158;
        double d5 = 1.0 - _5d_0.c("v", (double)(1.0 - (double)f), 3.0, -2672566465145911183L, (long)l2);
        return d + _5d_0.c("v", (double)(d2 - d), -2672126212132565491L, (long)l2) * (1.0 + d4 * _5d_0.c("v", (double)(d5 - 1.0), 3.0, -2672566465145911183L, (long)l2) + d3 * _5d_0.c("v", (double)(d5 - 1.0), 2.0, -2672566465145911183L, (long)l2));
    }

    /*
     * Exception decompiling
     */
    @_3i_0
    public void cfr_renamed_0(_40 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5d_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5d_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

