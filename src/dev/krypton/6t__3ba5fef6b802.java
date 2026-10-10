/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._32;
import dev.krypton._3i_0;
import dev.krypton._4r;
import dev.krypton._6x_0;
import dev.krypton._7l;
import dev.krypton._95;
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

/*
 * Renamed from dev.krypton.6t
 */
public class _6t_0
extends _6x_0 {
    private static final _7l cfr_renamed_9;
    private final _9r cfr_renamed_4;
    private static final long b;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static final long[] j;
    private static final Integer[] k;
    private static final Map l;
    private static final long[] m;
    private static final Long[] n;
    private static final Map o;
    private static final Object[] r;
    private static final String[] s;

    @Override
    public native void cfr_renamed_5();

    public _6t_0(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x55700CA3E725L;
        long l5 = l3 ^ 0x284E49D79677L;
        long l6 = l3 ^ 0x3489BE06F4CL;
        long l7 = l3 ^ 0x1C8808C4803EL;
        super((int)_6t_0.c("e", 21759, (long)(0x139BA8C58F976821L ^ l2)), -1, (_4r)((Object)_6t_0.f("\u00ed", -4149447676379929896L, (long)l2)), l6);
        this.cfr_renamed_4 = new _9r((int)_6t_0.c("e", 30340, (long)(0x5EC428176F754A5BL ^ l2)), true, l4);
        Object[] objectArray = new Object[2];
        objectArray[1] = new _95[]{_6t_0.f("k", (Object)this, -4147937522078358987L, (long)l2)};
        objectArray[0] = l7;
        _6t_0.f("j", (Object)this, (Object)objectArray, -4148316111873141667L, (long)l2);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = -1;
        objectArray2[0] = l5;
        _6t_0.f("j", (Object)this, (Object)objectArray2, -4148003407391273790L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        block17: {
                            block16: {
                                a.init(_6t_0.class, 3);
                                _6t_0.b = dev.krypton.l.a(-6415046350385830139L, 6669969364270832960L, MethodHandles.lookup().lookupClass()).a(124768128246799L);
                                _6t_0.r = new Object[58];
                                _6t_0.s = new String[58];
                                _6t_0.b();
                                _6t_0.f = new HashMap<K, V>(13);
                                var22 = _6t_0.b ^ 86972908314499L;
                                var24_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                                v0 = SecretKeyFactory.getInstance("DES");
                                v1 = new byte[8];
                                v2 = v1;
                                v1[0] = (byte)(var22 >>> 56);
                                for (var25_2 = 1; var25_2 < 8; ++var25_2) {
                                    v2 = v2;
                                    v2[var25_2] = (byte)(var22 << var25_2 * 8 >>> 56);
                                }
                                var24_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                                var31_3 = new String[11];
                                var29_4 = 0;
                                var28_5 = "@\u00daMq\u00189\u00c3c~\"\u00c96\u00eb\u0088\u00a7{#\u00e3B5\u00ccp\u00f7\u0002 0\u009d\u0016>}\u0014\f\u00a3\u0097\u00c3\u0010<:\u0016\u00e1d\u00d1^\u001a\u0001\u00d7\u00cd\u0001)\u00ca\u00f6\u0014\u0016m<\u00c4(0\n\u00ab\u00b9\u007f\u00d6\u0088\u00ff\u008e\u00dc:\u00a3\u00d9\u009f$\u00b5m\u001epU!\u00d7\u00b9\r\u00a7\u00c1)%\u00c4O,\u00f9\u0098#\u0094DV\u00d6\u00e6\u0010\u0010\u00e0\u00ee\u009b\u00f3\u00d9x\u001ah&\u00c2\u00f3\u00a9u\u0014)`(!_$\u0092T\u00cf\u00a7\u0081Rt)\u00d6\u009a\u00dap\u008db\u00ed<]TB*\u00ea\u00cc\u00c6|\u00f4\u00b3\u0090\u00af\u0005\u0088\u00ef\u0085\u00af\u00ae\u00da\u0011\u00d8\u0010\u00d8z\u009f4\u00fay\u0000G\u00fc\u00eb\u00d9\u0005\u00cd\u00b4&\u001d\u0010u=\u0094\u0098L\u00e7#_)\u00c6\u00f1\u00f6\u00c7.\n\u00fa(\u000e\u00caq\u00d9\u00f6;S\u000bR\u00e8\u00a8\u0000\t\u00e1\u00ae\u00fd\u00d4\u009bZ\u00d6\u00bal\u00ff}t\u00c7\u00d47Pr\u001e\u0011\u00078+\r\u00b5\u00e3n7\u0018\u00d7ww\u00d2\u00b82\u008d\u00e3\u00de+\u008b\u009c\u008a6\u0000\u00b3\u0000\u00d9-\u001c\u00e2d`\u00bb8\u00c2\u00e9\u00d2Z\u0098,-\u00b5\u00e9=p\u00f9+\u0087\u00ceg62`q\u00eb\u0099%F\u0000\u008a\u00ee\u0084\u00d9\u0005\u0099T:\u00a7\u00e4M\u00bd|3\u0083\u00ec\u008f\u00f29\u00035\u00e5,\u00e1G*5\u00d4\u00b8\u00f7\u008c";
                                var30_6 = "@\u00daMq\u00189\u00c3c~\"\u00c96\u00eb\u0088\u00a7{#\u00e3B5\u00ccp\u00f7\u0002 0\u009d\u0016>}\u0014\f\u00a3\u0097\u00c3\u0010<:\u0016\u00e1d\u00d1^\u001a\u0001\u00d7\u00cd\u0001)\u00ca\u00f6\u0014\u0016m<\u00c4(0\n\u00ab\u00b9\u007f\u00d6\u0088\u00ff\u008e\u00dc:\u00a3\u00d9\u009f$\u00b5m\u001epU!\u00d7\u00b9\r\u00a7\u00c1)%\u00c4O,\u00f9\u0098#\u0094DV\u00d6\u00e6\u0010\u0010\u00e0\u00ee\u009b\u00f3\u00d9x\u001ah&\u00c2\u00f3\u00a9u\u0014)`(!_$\u0092T\u00cf\u00a7\u0081Rt)\u00d6\u009a\u00dap\u008db\u00ed<]TB*\u00ea\u00cc\u00c6|\u00f4\u00b3\u0090\u00af\u0005\u0088\u00ef\u0085\u00af\u00ae\u00da\u0011\u00d8\u0010\u00d8z\u009f4\u00fay\u0000G\u00fc\u00eb\u00d9\u0005\u00cd\u00b4&\u001d\u0010u=\u0094\u0098L\u00e7#_)\u00c6\u00f1\u00f6\u00c7.\n\u00fa(\u000e\u00caq\u00d9\u00f6;S\u000bR\u00e8\u00a8\u0000\t\u00e1\u00ae\u00fd\u00d4\u009bZ\u00d6\u00bal\u00ff}t\u00c7\u00d47Pr\u001e\u0011\u00078+\r\u00b5\u00e3n7\u0018\u00d7ww\u00d2\u00b82\u008d\u00e3\u00de+\u008b\u009c\u008a6\u0000\u00b3\u0000\u00d9-\u001c\u00e2d`\u00bb8\u00c2\u00e9\u00d2Z\u0098,-\u00b5\u00e9=p\u00f9+\u0087\u00ceg62`q\u00eb\u0099%F\u0000\u008a\u00ee\u0084\u00d9\u0005\u0099T:\u00a7\u00e4M\u00bd|3\u0083\u00ec\u008f\u00f29\u00035\u00e5,\u00e1G*5\u00d4\u00b8\u00f7\u008c".length();
                                var27_7 = 56;
                                var26_8 = -1;
lbl24:
                                // 2 sources

                                while (true) {
                                    v3 = ++var26_8;
                                    v4 = var28_5.substring(v3, v3 + var27_7);
                                    v5 = -1;
                                    break block16;
                                    break;
                                }
lbl29:
                                // 1 sources

                                while (true) {
                                    var31_3[var29_4++] = _6t_0.b(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    var28_5 = "\n6\u008b\tS\u00fb\u0019A\u0094\u00d8]Ci\u00e5\u00a0\u00f68\u0088\u0095\u0087&\u0088\r\u00c9\u00b6\u00eeW>c\u00cb\u0099\u00c8\u00a3\u0012\u0089\u009ad\u000fs\u00d3\u00da\u00cf\u0015\u00ad9\u00ceJ\u00ce\u00de\u00da\u00b8\u00f3\u00a2=\u00d9H\t\u00f1\nk\u00bd\u0016\u0080E6p\u00a2vN\u00dd5\u00db\u00cc";
                                    var30_6 = "\n6\u008b\tS\u00fb\u0019A\u0094\u00d8]Ci\u00e5\u00a0\u00f68\u0088\u0095\u0087&\u0088\r\u00c9\u00b6\u00eeW>c\u00cb\u0099\u00c8\u00a3\u0012\u0089\u009ad\u000fs\u00d3\u00da\u00cf\u0015\u00ad9\u00ceJ\u00ce\u00de\u00da\u00b8\u00f3\u00a2=\u00d9H\t\u00f1\nk\u00bd\u0016\u0080E6p\u00a2vN\u00dd5\u00db\u00cc".length();
                                    var27_7 = 16;
                                    var26_8 = -1;
lbl38:
                                    // 2 sources

                                    while (true) {
                                        v6 = ++var26_8;
                                        v4 = var28_5.substring(v6, v6 + var27_7);
                                        v5 = 0;
                                        break block16;
                                        break;
                                    }
                                    break;
                                }
lbl43:
                                // 1 sources

                                while (true) {
                                    var31_3[var29_4++] = _6t_0.b(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    break block17;
                                    break;
                                }
                            }
                            var32_9 = var24_1.doFinal(v4.getBytes("ISO-8859-1"));
                            switch (v5) {
                                default: {
                                    ** continue;
                                }
                                ** case 0:
lbl55:
                                // 1 sources

                                ** continue;
                            }
                        }
                        _6t_0.d = var31_3;
                        _6t_0.e = new String[11];
                        _6t_0.l = new HashMap<K, V>(13);
                        var11_10 = Cipher.getInstance("DES/CBC/NoPadding");
                        v7 = SecretKeyFactory.getInstance("DES");
                        v8 = new byte[8];
                        v9 = v8;
                        v8[0] = (byte)(var22 >>> 56);
                        for (var12_11 = 1; var12_11 < 8; ++var12_11) {
                            v9 = v9;
                            v9[var12_11] = (byte)(var22 << var12_11 * 8 >>> 56);
                        }
                        var11_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                        var17_12 = new long[2];
                        var14_13 = 0;
                        var15_14 = "\u009a\u00df\u00b6Xc(\u007fq)#\u00867\u00cc\u00ed\u00c0^";
                        var16_15 = "\u009a\u00df\u00b6Xc(\u007fq)#\u00867\u00cc\u00ed\u00c0^".length();
                        var13_16 = 0;
                        while (true) {
                            break block18;
                            break;
                        }
lbl77:
                        // 1 sources

                        while (true) {
                            var17_12[v10] = ((long)var21_19[0] & 255L) << 56 | ((long)var21_19[1] & 255L) << 48 | ((long)var21_19[2] & 255L) << 40 | ((long)var21_19[3] & 255L) << 32 | ((long)var21_19[4] & 255L) << 24 | ((long)var21_19[5] & 255L) << 16 | ((long)var21_19[6] & 255L) << 8 | (long)var21_19[7] & 255L;
                            if (var13_16 < var16_15) ** continue;
                            break block19;
                            break;
                        }
                    }
                    var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                    v10 = var14_13++;
                    var19_18 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                    var21_19 = var11_10.doFinal(new byte[]{(byte)(var19_18 >>> 56), (byte)(var19_18 >>> 48), (byte)(var19_18 >>> 40), (byte)(var19_18 >>> 32), (byte)(var19_18 >>> 24), (byte)(var19_18 >>> 16), (byte)(var19_18 >>> 8), (byte)var19_18});
                    ** while (true)
                }
                _6t_0.j = var17_12;
                _6t_0.k = new Integer[2];
                _6t_0.o = new HashMap<K, V>(13);
                var0_20 = Cipher.getInstance("DES/CBC/NoPadding");
                v11 = SecretKeyFactory.getInstance("DES");
                v12 = new byte[8];
                v13 = v12;
                v12[0] = (byte)(var22 >>> 56);
                for (var1_21 = 1; var1_21 < 8; ++var1_21) {
                    v13 = v13;
                    v13[var1_21] = (byte)(var22 << var1_21 * 8 >>> 56);
                }
                var0_20.init(2, (Key)v11.generateSecret(new DESKeySpec(v13)), new IvParameterSpec(new byte[8]));
                var6_22 = new long[2];
                var3_23 = 0;
                var4_24 = "\u0005\u0090h\u0097T\u00e5\u0019J\u00af\u0006\u00dep\u00f0\u00e1\u00f2\u0017";
                var5_25 = "\u0005\u0090h\u0097T\u00e5\u0019J\u00af\u0006\u00dep\u00f0\u00e1\u00f2\u0017".length();
                var2_26 = 0;
                while (true) {
                    break block20;
                    break;
                }
lbl111:
                // 1 sources

                while (true) {
                    var6_22[v14] = ((long)var10_29[0] & 255L) << 56 | ((long)var10_29[1] & 255L) << 48 | ((long)var10_29[2] & 255L) << 40 | ((long)var10_29[3] & 255L) << 32 | ((long)var10_29[4] & 255L) << 24 | ((long)var10_29[5] & 255L) << 16 | ((long)var10_29[6] & 255L) << 8 | (long)var10_29[7] & 255L;
                    if (var2_26 < var5_25) ** continue;
                    break block21;
                    break;
                }
            }
            var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
            v14 = var3_23++;
            var8_28 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
            var10_29 = var0_20.doFinal(new byte[]{(byte)(var8_28 >>> 56), (byte)(var8_28 >>> 48), (byte)(var8_28 >>> 40), (byte)(var8_28 >>> 32), (byte)(var8_28 >>> 24), (byte)(var8_28 >>> 16), (byte)(var8_28 >>> 8), (byte)var8_28});
            ** while (true)
        }
        _6t_0.m = var6_22;
        _6t_0.n = new Long[2];
        _6t_0.cfr_renamed_9 = new _7l();
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (s[n3] != null) {
            return n3;
        }
        Object object = r[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 48;
            case 1 -> 13;
            case 2 -> 10;
            case 3 -> 39;
            case 4 -> 0;
            case 5 -> 47;
            case 6 -> 32;
            case 7 -> 19;
            case 8 -> 59;
            case 9 -> 63;
            case 10 -> 17;
            case 11 -> 21;
            case 12 -> 34;
            case 13 -> 43;
            case 14 -> 16;
            case 15 -> 53;
            case 16 -> 38;
            case 17 -> 50;
            case 18 -> 8;
            case 19 -> 61;
            case 20 -> 2;
            case 21 -> 18;
            case 22 -> 22;
            case 23 -> 15;
            case 24 -> 36;
            case 25 -> 25;
            case 26 -> 62;
            case 27 -> 46;
            case 28 -> 28;
            case 29 -> 52;
            case 30 -> 57;
            case 31 -> 41;
            case 32 -> 5;
            case 33 -> 42;
            case 34 -> 37;
            case 35 -> 60;
            case 36 -> 14;
            case 37 -> 56;
            case 38 -> 27;
            case 39 -> 33;
            case 40 -> 30;
            case 41 -> 6;
            case 42 -> 1;
            case 43 -> 55;
            case 44 -> 9;
            case 45 -> 3;
            case 46 -> 54;
            case 47 -> 35;
            case 48 -> 45;
            case 49 -> 20;
            case 50 -> 7;
            case 51 -> 58;
            case 52 -> 51;
            case 53 -> 49;
            case 54 -> 24;
            case 55 -> 23;
            case 56 -> 31;
            case 57 -> 4;
            case 58 -> 29;
            case 59 -> 11;
            case 60 -> 26;
            case 61 -> 12;
            case 62 -> 44;
            default -> 40;
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
        _6t_0.s[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = r;
        r[0] = ";8+7xz07:x\u0005o\"-8;";
        objectArray[1] = Long.TYPE;
        _6t_0.s[1] = "java/lang/Long";
        objectArray[2] = "\u007f~\u0011V[Ebk\u0013\u0017^\u0019\"L";
        objectArray[3] = "\u000f6g\t\fWz\u0016l\u0006\u001d\u0018\u001b\u0018g\r\u0019Bo";
        objectArray[4] = Boolean.TYPE;
        _6t_0.s[4] = "java/lang/Boolean";
        objectArray[5] = "\rqy_0V\b>_LwQ\u0013C{L{^\n";
        objectArray[6] = "+\u0004\u0011q={ \u000b\u0000>@c3\f\tw";
        objectArray[7] = Void.TYPE;
        _6t_0.s[7] = "java/lang/Void";
        objectArray[8] = "=!\u0006\u0017\\| 4\u0004VY n(";
        objectArray[9] = "1X\u001buz~Dx\u0010zk1%v\u001bqokQ";
        objectArray[10] = "2j<\b\u0007GGJ7\u0007\u0016\b&D<\f\u0012RR";
        objectArray[11] = "\u0011\u0018\u007f\u0017_Rd8t\u0018N\u001d\u00056\u007f\u0013JGq";
        objectArray[12] = "#@8\u0017^ /H9\\\u0017(3@;\u0017s</A\u001a[S*#[";
        objectArray[13] = "\u001dZ\u000e(MShz\u0005'\\\u001c\tt\u000e,XF}";
        objectArray[14] = "=c\rB-i v\u000f\u0003(5or";
        objectArray[15] = "(gKP\u0010y]G@_\u00016<IKT\u0005lH";
        objectArray[16] = "&i-ZeA;|/\u001b`\u001dv~";
        objectArray[17] = "\f0\b\u0007)2\u0011%\nF,n^-";
        objectArray[18] = "\u001c;g?3Gi\u001bl0\"\b\b\u0015g;&R|";
        objectArray[19] = "\u0012}Z\u0015\u0010}\u000fhXT\u0015!Oj";
        objectArray[20] = "U8VM\u000eI \u0018]B\u001f\u0006A\u0016VI\u001b\\5";
        objectArray[21] = "\u0015\u001eif~5\u0015\u001e~:r:\u000fU~$r/\b$.y#";
        objectArray[22] = "[LNR6,[LY\u000e:#A\u0007Y\u0010:6Fv\fHi";
        objectArray[23] = "9=<,T6L\u001d7#Ey-\u0013<(A#Y";
        objectArray[24] = " {pc\u001cV {g?\u0010Y:0g!\u0010L=A3yG";
        objectArray[25] = "1o\t\u0018z\n1o\u001eDv\u0005+$\u001eZv\u0010,UK\u0005/";
        objectArray[26] = ">yEVh%KYNYyj*WER}0^";
        objectArray[27] = "z{!WCL\u000f[*XR\u0003nU!SVY\u001a";
        objectArray[28] = "\"1TYTXW\u0011_VE\u00176\u001fT]AMB";
        objectArray[29] = "\u0016V{\u00112Icvp\u001e#\u0006\u0002x{\u0015'\\v";
        objectArray[30] = "7\u0014PE\u0013v<\u001bA\nrx7\u0010EP";
        objectArray[31] = ",ko/;m\"-62T#\u0012673d#vil>n\u001c/l17)f\"0fiT";
        objectArray[32] = "\u0017Yy \u0017v\\G+9h\u007f.A-%XpJ\u001ev(RO\u0015\u001et'\u0010+\u001eYj+h";
        objectArray[33] = "iHmm\u0010}|\u001d3uw9\u0002\u001a<lG8fEgaM\u0007?@:h\n}2\u001cm6w";
        objectArray[34] = "=^sK\u0014\u0000~\u0015{X/\u0001\f@a\u0019\u0011\tp]}PB";
        objectArray[35] = "[=!$6\"\u0018v)7\r#j,m.=$\u000es6#7\u001bV o1lj\u0001->'\r";
        objectArray[36] = "k^\u001eG\u0016}~\u000b@_q>\u0000\fOFA8dS\u0014KK\u0007=VIB\f}0\n\u001e\u001cq";
        objectArray[37] = "\u000bQ\u00194\u001a\u0017\u0005\u0017@)uW5\fA(EYQS\u001a%Of\bVG,\b\u001c\u0005\n\u0010ru";
        objectArray[38] = "YL&!IXDPory\u001e5]e'\u0005H\u0005\u0015b%y\u001f\tK|g\u001d\u0014NUp\u001f";
        objectArray[39] = "=\\E\bIc~\u0017M\u001bre\f\u0010\t\u0004\u000e5}\u001eO]\u0013";
        objectArray[40] = "j\";iQac `4;oj$?2W]>ebe;dd!a,\\iy&&U";
        objectArray[41] = "X\u0015\"\u0011\u001b6VS{\ft}fHz\rDx\u0002\u0017!\u0000NGW\u0013yPH(^R#Qt";
        objectArray[42] = "\u000e<#BGhMis!S~Hv.GD_Si.dYgVm8!Ix\np/\u0011\u0001\u007f\b\f";
        objectArray[43] = "\\ \t@y\fU\"R\u001d\u0013\u0002\\&\r\u001b\u007f0\bf\\B\u0013\\\r=\u000f\u0004wWJ#\u0003|";
        objectArray[44] = "mk\u000f&.\"diT{D'a|\u000fv\u0013p?+W\u001a+9kq\nx53<o";
        objectArray[45] = "\fK,\u0012\u0011\rO\u001e|q\t\u001bL{w\u0016^\t\f\u000b*\u0010\u0010[";
        objectArray[46] = "nv<\u001esV3prLO^/pj\r+@U-cM0G$zn\u001c&&h(4\u00152\\etcKO";
        objectArray[47] = "\u0007_/\t+_\u000e]tTAZ\u000bH/Y\u0016\rT\u0015t5!KQKwX0V\tC";
        objectArray[48] = "tPP\u001b\r&z\u0016\t\u0006bmJ\r\b\u0007Rh.RS\nXWwW\u000e\u0003\u001f-z\u000bY]b";
        objectArray[49] = "\u0002-WJ\u0010\b\fk\u000eW\u007fI<p\u000fVOFX/T[Ey\u0001*\tR\u0002\u0003\fv^\f\u007f";
        objectArray[50] = "\u0017kS9Y\u0007\\u\u0001 &\u0001.s\u0007<\u0016\u0001J,\\1\u001c>\u0013)\u00018[D\u001euVf&";
        objectArray[51] = "L\u001f]\u001bd|BY\u0004\u0006\u000b3rB\u0005\u0007;2\u0016\u001d^\n1\rO\u0018\u0003\u0003vwBDT]\u000b";
        objectArray[52] = "C\u001930#2L\n(,\u001cIm\"\u000e\r@\u0002C\u001930#2L\n(,";
        objectArray[53] = "B<s1\n/K})06<\u0014_2vW&\u001c\u0004rc\n?\u0012u%n[)s";
        objectArray[54] = ",w)!\u0003\u00189\"w9d[G+<$X\b,\">\u007f\u0005";
        objectArray[55] = "i\u0001IUV\u0011gG\u0010H9]W\\\u0011I\t_3\u0003JD\u0003`j\u0006\u0017MD\u001agZ@\u00139";
        objectArray[56] = "MIh~*\u001d@To9S\u0014BGu,\u0004A\u001c\u0014(@o\u0015\u001fUp18\u0018NC";
        Object[] objectArray2 = objectArray;
        objectArray[57] = "0~\u0001\u0014\u0010|{`S\rou\tfU\u0011_zm9\u000e\u001cUE4<S\u0015\u0012?9`\u0004Ko";
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _6t_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static String b(byte[] byArray) {
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

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'k' || c == '\u00fc' || c == '\u00ed' || c == '\u00ee') {
                field = _6t_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'k' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fc' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ed' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _6t_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'j' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00cf' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _6t_0.c(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static int c(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x7AB8;
        if (k[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = j[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])l.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    l.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/6t", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _6t_0.k[n2] = n3;
        }
        return k[n2];
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6t" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = _6t_0.e(l2, l3);
        Object object = r[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = s[n];
                int n3 = string2.indexOf(8);
                clazz3 = _6t_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _6t_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _6t_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _6t_0.r[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _6t_0.f(2158304363634459L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _6t_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _6t_0.r[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _6t_0.f(2158304363634459L, 0L);
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
            int n = _6t_0.e(l2, l3);
            object = r[n];
            try {
                if (!(object instanceof String)) break block2;
                _6t_0.r[n] = clazz = Class.forName(s[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6t" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _6t_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _6t_0.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _6t_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _6t_0.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static long d(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x6D66;
        if (_6t_0.n[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = m[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])o.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    o.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/6t", exception);
            }
            long l5 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            _6t_0.n[n2] = l5;
        }
        return _6t_0.n[n2];
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6t" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = _6t_0.d(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return l3;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _6t_0.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_3().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6t" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x40CC;
        if (e[n2] == null) {
            Object[] objectArray;
            try {
                Long l3 = Thread.currentThread().threadId();
                objectArray = (Object[])f.get(l3);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l3, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/6t", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l2 >>> 56);
            for (int j = 1; j < 8; ++j) {
                byArray[j] = (byte)(l2 << j * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n2].getBytes("ISO-8859-1");
            _6t_0.e[n2] = _6t_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Field g(long l2, long l3) {
        int n = _6t_0.e(l2, l3);
        Object object = r[n];
        if (object instanceof String) {
            String string = s[n];
            int n2 = string.indexOf(8);
            Class clazz = _6t_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _6t_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _6t_0.c(clazz3, string2, clazz2)) != null) {
                    _6t_0.r[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _6t_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _6t_0.r[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _6t_0.f(2158304363634459L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private String java_lang_String_0(Object[] var1_1) {
        block18: {
            block16: {
                block17: {
                    block15: {
                        block13: {
                            block14: {
                                var2_2 = (Long)var1_1[0];
                                var4_3 = (var2_2 = _6t_0.b ^ var2_2) ^ 127776552027091L;
                                var6_4 = _32.cfr_renamed_2();
                                try {
                                    try {
                                        v0 = _6t_0.f("k", (Object)this, (long)5643450675363940817L, (long)var2_2);
                                        if (var6_4 == 0) break block13;
                                        if (_6t_0.f("j", (Object)v0, (long)5644976854230280574L, (long)var2_2) == false) break block14;
                                    }
                                    catch (MatchException v1) {
                                        throw _6t_0.a((Exception)v1);
                                    }
                                    return _6t_0.a("a", (int)13752, (long)(3388378902588668715L ^ var2_2));
                                }
                                catch (MatchException v2) {
                                    throw _6t_0.a((Exception)v2);
                                }
                            }
                            try {
                                v3 = this;
                                v4 = var6_4;
                                if (var2_2 >= 0L) {
                                    if (v4 == 0) break block15;
                                    v0 = _6t_0.f("k", (Object)v3, (long)5643450675363940817L, (long)var2_2);
                                }
                                ** GOTO lbl39
                            }
                            catch (MatchException v5) {
                                throw _6t_0.a((Exception)v5);
                            }
                        }
                        try {
                            if (_6t_0.f("j", (Object)v0, (long)5644724558666674126L, (long)var2_2) == null) break block16;
                            v3 = this;
                        }
                        catch (MatchException v6) {
                            throw _6t_0.a((Exception)v6);
                        }
                    }
                    try {
                        try {
                            v4 = var6_4;
lbl39:
                            // 2 sources

                            if (v4 == 0) break block17;
                            v7 /* !! */  = (int)_6t_0.f("j", (Object)_6t_0.f("k", (Object)v3, (long)5644332798218725902L, (long)var2_2), (long)var4_3, (long)5644593785413277876L, (long)var2_2);
                            if (var2_2 < 0L) break block18;
                            if (v7 /* !! */  == 0) break block16;
                        }
                        catch (MatchException v8) {
                            throw _6t_0.a((Exception)v8);
                        }
                        v3 = this;
                    }
                    catch (MatchException v9) {
                        throw _6t_0.a((Exception)v9);
                    }
                }
                var7_5 = _6t_0.f("j", (Object)_6t_0.f("k", (Object)v3, (long)5643450675363940817L, (long)var2_2), (long)5644724558666674126L, (long)var2_2);
                return _6t_0.f("k", (Object)var7_5, (long)5643632339209778126L, (long)var2_2);
            }
            v7 /* !! */  = 22863;
        }
        return _6t_0.a("a", (int)v7 /* !! */ , (long)(5425174265407231961L ^ var2_2));
    }

    @Override
    public native void cfr_renamed_2();

    /*
     * Loose catch block
     */
    @_3i_0
    public void cfr_renamed_0(_9o o) {
        long l2;
        long l3 = l2 = b ^ 0x2C81C28D79EBL;
        long l4 = l3 ^ 0x59BF4C86AD44L;
        long l5 = l3 ^ 0x7C2CF86B8A1BL;
        long l6 = l3 ^ 0x2831E40F8768L;
        long l7 = l3 ^ 0x36BF03637B7L;
        int n = _32.cfr_renamed_2();
        try {
            _6t_0 t_0;
            block12: {
                block15: {
                    block11: {
                        CallSite callSite;
                        block10: {
                            block13: {
                                callSite = _6t_0.f("k", (Object)this, 853050700186963030L, (long)l2);
                                if (n == 0) break block10;
                                if (_6t_0.f("k", (Object)callSite, 851197080018908715L, (long)l2) == null) break block11;
                                break block13;
                                catch (Exception exception) {
                                    throw _6t_0.a(exception);
                                }
                            }
                            try {
                                block14: {
                                    t_0 = this;
                                    if (n == 0) break block12;
                                    break block14;
                                    catch (Exception exception) {
                                        throw _6t_0.a(exception);
                                    }
                                }
                                callSite = _6t_0.f("k", (Object)t_0, 853050700186963030L, (long)l2);
                            }
                            catch (Exception exception) {
                                throw _6t_0.a(exception);
                            }
                        }
                        if (_6t_0.f("k", (Object)callSite, 851441958038692115L, (long)l2) != null) break block15;
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l5;
                    objectArray[0] = _6t_0.a("a", 17228, (long)(0x689F93C3DC4A085FL ^ l2));
                    _6t_0.f("j", (Object)_6t_0.f("\u00ed", 851971075871268440L, (long)l2), (Object)objectArray, 854790639473703488L, (long)l2);
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = _6t_0.a("a", 14676, (long)(0x1DEDD98FBCAD7246L ^ l2));
                    objectArray2[0] = l4;
                    _6t_0.f("j", (Object)_6t_0.f("\u00ed", 851971075871268440L, (long)l2), (Object)objectArray2, 851826284483884075L, (long)l2);
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = _6t_0.f("\u00ed", 851971075871268440L, (long)l2);
                    objectArray3[0] = l6;
                    _6t_0.f("\u00cf", (Object)objectArray3, 852709941723219546L, (long)l2);
                    return;
                }
                t_0 = this;
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l7;
            CallSite callSite = _6t_0.f("j", (Object)t_0, (Object)objectArray, 852237327337489776L, (long)l2);
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = l5;
            objectArray4[0] = callSite;
            _6t_0.f("j", (Object)_6t_0.f("\u00ed", 851971075871268440L, (long)l2), (Object)objectArray4, 854790639473703488L, (long)l2);
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = _6t_0.f("\u00ed", 851971075871268440L, (long)l2);
            objectArray5[0] = l6;
            _6t_0.f("\u00cf", (Object)objectArray5, 852709941723219546L, (long)l2);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_6t_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_6t_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_2() {
        try {
            return MethodHandles.lookup().findStatic(_6t_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_3() {
        try {
            return MethodHandles.lookup().findStatic(_6t_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

