/*
 * Decompiled with CFR 0.152.
 */
package dev.krypton;

import dev.krypton.l;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _6U
extends Enum {
    public static final _6U HIGHEST;
    public static final _6U HIGH;
    public static final _6U NORMAL;
    public static final _6U LOW;
    public static final _6U LOWEST;
    private final int cfr_renamed_2;
    private static final _6U[] cfr_renamed_5;
    private static int[] cfr_renamed_0;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _6U() {
        void var3_1;
        void cfr_renamed_27;
        void cfr_renamed_28;
        this.cfr_renamed_2 = var3_1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                var9 = l.a(2178605711700953298L, -7778714251322236691L, MethodHandles.lookup().lookupClass()).a(36589936393740L) ^ 7466654865516L;
                if (_6U.cfr_renamed_7() != null) {
                    _6U.cfr_renamed_6(new int[5]);
                }
                var1_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var2_2 = 1; var2_2 < 8; ++var2_2) {
                    v2 = v2;
                    v2[var2_2] = (byte)(var9 << var2_2 * 8 >>> 56);
                }
                var1_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_3 = new String[5];
                var6_4 = 0;
                var5_5 = "r\u00b3\u00c83.\u000e\u00cdP\b%\u0004\u0007j`.\u009b\u00a9\b'$\u00acm?vY\t";
                var7_6 = "r\u00b3\u00c83.\u000e\u00cdP\b%\u0004\u0007j`.\u009b\u00a9\b'$\u00acm?vY\t".length();
                var4_7 = 8;
                var3_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var3_8;
                    v4 = var5_5.substring(v3, v3 + var4_7);
                    v5 = -1;
                    break block11;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = _6U.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u009e\u00fe\u00e9\u0006\u000bx8\u00cf\b\u00a7n\u00b8'I\u0011j1";
                    var7_6 = "\u009e\u00fe\u00e9\u0006\u000bx8\u00cf\b\u00a7n\u00b8'I\u0011j1".length();
                    var4_7 = 8;
                    var3_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var3_8;
                        v4 = var5_5.substring(v6, v6 + var4_7);
                        v5 = 0;
                        break block11;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = _6U.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    break block12;
                    break;
                }
            }
            var8_9 = var1_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl51:
                // 1 sources

                ** continue;
            }
        }
        _6U.HIGHEST = new _6U(var0_3[4], 0, 0);
        _6U.HIGH = new _6U(var0_3[0], 1, 1);
        _6U.NORMAL = new _6U(var0_3[2], 2, 2);
        _6U.LOW = new _6U(var0_3[1], 3, 3);
        _6U.LOWEST = new _6U(var0_3[3], 4, 4);
        _6U.cfr_renamed_5 = _6U.cfr_renamed_1();
    }

    public static _6U[] values() {
        return (_6U[])cfr_renamed_5.clone();
    }

    public static _6U valueOf(String string) {
        return Enum.valueOf(_6U.class, string);
    }

    private static _6U[] cfr_renamed_1() {
        return new _6U[]{HIGHEST, HIGH, NORMAL, LOW, LOWEST};
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

    public static void cfr_renamed_6(int[] nArray) {
        cfr_renamed_0 = nArray;
    }

    public static int[] cfr_renamed_7() {
        return cfr_renamed_0;
    }

    public int cfr_renamed_0() {
        return this.cfr_renamed_2;
    }
}

