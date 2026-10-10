/*
 * Decompiled with CFR 0.152.
 */
package dev.krypton;

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
 * Renamed from dev.krypton.0e
 */
public class _0e_0
extends Enum {
    public static final _0e_0 CMRadio;
    public static final _0e_0 BaseRadio;
    public static final _0e_0 My105DJRadio;
    public static final _0e_0 My105TodaysBestMusic;
    public static final _0e_0 My105Chill;
    public static final _0e_0 My105AllTheHits;
    public static final _0e_0 ILRadio;
    public static final _0e_0 IL2Dance;
    public static final _0e_0 ILHipHop;
    public static final _0e_0 ILHitHistory;
    public static final _0e_0 ILTheSun;
    public static final _0e_0 ILTheGreatestHits;
    public static final _0e_0 ILChillHop;
    public static final _0e_0 ILHipHophistory;
    private final String cfr_renamed_5;
    private static final _0e_0[] cfr_renamed_1;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static final Object[] e;
    private static final String[] f;

    private static _0e_0[] cfr_renamed_5() {
        long l2 = a ^ 0x287F9077953AL;
        _0e_0[] e_0Array = new _0e_0[_0e_0.a("c", 20092, (long)(0x7F30A3F53E5EC5A3L ^ l2))];
        e_0Array[0] = _0e_0.b("U", -4777412044294369063L, (long)l2);
        e_0Array[1] = _0e_0.b("U", -4776133487786079266L, (long)l2);
        e_0Array[2] = _0e_0.b("U", -4777186215757159122L, (long)l2);
        e_0Array[3] = _0e_0.b("U", -4777560667457679266L, (long)l2);
        e_0Array[4] = _0e_0.b("U", -4776702435662100056L, (long)l2);
        e_0Array[5] = _0e_0.b("U", -4777254608230485353L, (long)l2);
        e_0Array[_0e_0.a("c", 15555, (long)(0x328A58AC88C0B715L ^ l2))] = _0e_0.b("U", -4777068706248659950L, (long)l2);
        e_0Array[_0e_0.a("c", 32585, (long)(0x1B8B83B105A7F49AL ^ l2))] = _0e_0.b("U", -4778300268344787985L, (long)l2);
        e_0Array[_0e_0.a("c", 3569, (long)(0x303CD5B870DD8629L ^ l2))] = _0e_0.b("U", -4777489616865751848L, (long)l2);
        e_0Array[_0e_0.a("c", 30995, (long)(0x293A61C5BF3672CEL ^ l2))] = _0e_0.b("U", -4776816403423151808L, (long)l2);
        e_0Array[_0e_0.a("c", 8541, (long)(0x5469F1ED8921AA87L ^ l2))] = _0e_0.b("U", -4777001301041518896L, (long)l2);
        e_0Array[_0e_0.a("c", 20088, (long)(0x5D26D3BDC6E545ADL ^ l2))] = _0e_0.b("U", -4777689206204626142L, (long)l2);
        e_0Array[_0e_0.a("c", 28871, (long)(0x2B67F985DA917B13L ^ l2))] = _0e_0.b("U", -4777630715088855192L, (long)l2);
        e_0Array[_0e_0.a("c", 28341, (long)(0xD7FCFA9C2F2E564L ^ l2))] = _0e_0.b("U", -4777404340717003990L, (long)l2);
        return e_0Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _0e_0() {
        void var3_1;
        void cfr_renamed_27;
        void cfr_renamed_28;
        this.cfr_renamed_5 = var3_1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        _0e_0.a = l.a(-2339466917457485181L, -3260636403640131767L, MethodHandles.lookup().lookupClass()).a(160895986433708L);
                        var20 = _0e_0.a ^ 100680694848197L;
                        _0e_0.e = new Object[25];
                        _0e_0.f = new String[25];
                        _0e_0.a();
                        var12_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var13_2 = 1; var13_2 < 8; ++var13_2) {
                            v2 = v2;
                            v2[var13_2] = (byte)(var20 << var13_2 * 8 >>> 56);
                        }
                        var12_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var11_3 = new String[28];
                        var17_4 = 0;
                        var16_5 = "\u001bT7\n\u00e8\u00a3\u001a\u00f5\u00b2\u00deq\u00a7\u00c6\u00a8]\u00ba)\u00e1g\u0082\u00ac\u0001B\u00c1\u0010 \u00ff\u00f9\u00baz\u00be\u00d0.\u001b\u00afo\u0010]dZ\u00dc\u0018\u00b3\u00fd\u00e8!%\b\u0098\u00b30\u00b7\u0093\u008c)\u00d2=\u0005\u00f4\u008b\u0014yKb\u0015\u0091\u0018\u00ddi\u00abf\u00b8O\u00c5o.\u008c\u00a4\u00f6t\u00cf\u00fd\u00a6\u0005\u00b5\u008cVE\u00a54\u0017\u0010\u00f6\u00edi\u00c0|\u00f6\u00b1\u0083\u00b3\u0003\u000e\u008b\u00d3W\u00c8\u00af\u0018\u00e3\u00e3\rx@a\u00c6\u00aaB\u00d4p3i\u0006\u00bd\u00a8\u008e\u0082Z\u00db\u00a8^\u000fE\u0010\u00b0\u008e>\u008ei\u0084aH\u00d3\u0018\u0087\u00ba\u001f\u00e6\u008d\u0099\u0010\u00b4({\u00a7\u00e3\u00c3\u0085\u00cc\u00bc#^G\u0019\u009e\u00d7\u00c5\u0010\u00cf,8lg\u00d1\"\u009e\u001d0v/\u00d8\u00c2\u00a6\u00fd\u0010\u000f^\u00dd\u0007\u0017Dl\u008ds\u00e0\u00caK5\u00cb\u00e6\u0019\u0010>\u0093H\fg\u00a1-\u00f8\u0000\u008e\u0097\u00f0-\u00b3+(\u0010(\u00a9D~\b~]\u00de\u00b7\u0097\u0091\u0085\u00df\u00f7\u000bF\u0010Xh\u00cc\u00f8\u0086\u00dci\u0098amw|,\u0092E\u0010\u0010`N]\u00d6e\u00c9\u00a8\u00d5\u0086\u00fe\u00a4\u00b2\u00f0\u00965M\u0010\u00df\u00e1~\u00b9rCw\u00bc\u00a0pv\u00d9|\u00da\fi \u00c4m\u009d\"\u0005pW\u00da\u00b8\u00d4\u00d5t\u007fX\u009d\u00b0s\u00fa\u00a0\u001c\u00cf\u0081m(\u00a41{\u00eb[\u00f895\b\u00bd'xp\u0003\u0091\u00f1\u00a9\u0018\u00b4({\u00a7\u00e3\u00c3\u0085\u00ccy\u00df\u00e9_\u00a3\u00b1\u0016\u0018\u0015\u0013\u0087c\u001a\u00cc%\u009c\u0010\u00f0\u00a4:\u000b=|uX$\u00fc\u00d1\u00c8\u00a1\u00c8\u00e7\u0015\u0010r`\u00e56\u00e7\u00ca@\u00d2\u00b18\u00aa\u008760\"\u0004\u00102\u001c0\u00cc\u00c3ch\u00bd\u00d7\u00c5MWy\u00c2o\u0096\u0010\u00d5p[C|15\u0093\u00bfl\u00f5)\u00b5H<\u009d\u0010\u00fb\u00ea\u00a2:\u0088\u0097]?\u0016\u0098\u00a5\u00a8\u00be\u0088\u009c\u00fa\b\u00f6H4y\u00ef\u00891\u0088\u0010\u0003\u0015\u00ad+\u009c\u00c6&Z\u00c3\u0011\u00ab\u00a4Z#&\u00a1\u0010\u00f4\u0080;bD\u00b1\u008a@\u00ed\u00de\n\"cq\u0017H";
                        var18_6 = "\u001bT7\n\u00e8\u00a3\u001a\u00f5\u00b2\u00deq\u00a7\u00c6\u00a8]\u00ba)\u00e1g\u0082\u00ac\u0001B\u00c1\u0010 \u00ff\u00f9\u00baz\u00be\u00d0.\u001b\u00afo\u0010]dZ\u00dc\u0018\u00b3\u00fd\u00e8!%\b\u0098\u00b30\u00b7\u0093\u008c)\u00d2=\u0005\u00f4\u008b\u0014yKb\u0015\u0091\u0018\u00ddi\u00abf\u00b8O\u00c5o.\u008c\u00a4\u00f6t\u00cf\u00fd\u00a6\u0005\u00b5\u008cVE\u00a54\u0017\u0010\u00f6\u00edi\u00c0|\u00f6\u00b1\u0083\u00b3\u0003\u000e\u008b\u00d3W\u00c8\u00af\u0018\u00e3\u00e3\rx@a\u00c6\u00aaB\u00d4p3i\u0006\u00bd\u00a8\u008e\u0082Z\u00db\u00a8^\u000fE\u0010\u00b0\u008e>\u008ei\u0084aH\u00d3\u0018\u0087\u00ba\u001f\u00e6\u008d\u0099\u0010\u00b4({\u00a7\u00e3\u00c3\u0085\u00cc\u00bc#^G\u0019\u009e\u00d7\u00c5\u0010\u00cf,8lg\u00d1\"\u009e\u001d0v/\u00d8\u00c2\u00a6\u00fd\u0010\u000f^\u00dd\u0007\u0017Dl\u008ds\u00e0\u00caK5\u00cb\u00e6\u0019\u0010>\u0093H\fg\u00a1-\u00f8\u0000\u008e\u0097\u00f0-\u00b3+(\u0010(\u00a9D~\b~]\u00de\u00b7\u0097\u0091\u0085\u00df\u00f7\u000bF\u0010Xh\u00cc\u00f8\u0086\u00dci\u0098amw|,\u0092E\u0010\u0010`N]\u00d6e\u00c9\u00a8\u00d5\u0086\u00fe\u00a4\u00b2\u00f0\u00965M\u0010\u00df\u00e1~\u00b9rCw\u00bc\u00a0pv\u00d9|\u00da\fi \u00c4m\u009d\"\u0005pW\u00da\u00b8\u00d4\u00d5t\u007fX\u009d\u00b0s\u00fa\u00a0\u001c\u00cf\u0081m(\u00a41{\u00eb[\u00f895\b\u00bd'xp\u0003\u0091\u00f1\u00a9\u0018\u00b4({\u00a7\u00e3\u00c3\u0085\u00ccy\u00df\u00e9_\u00a3\u00b1\u0016\u0018\u0015\u0013\u0087c\u001a\u00cc%\u009c\u0010\u00f0\u00a4:\u000b=|uX$\u00fc\u00d1\u00c8\u00a1\u00c8\u00e7\u0015\u0010r`\u00e56\u00e7\u00ca@\u00d2\u00b18\u00aa\u008760\"\u0004\u00102\u001c0\u00cc\u00c3ch\u00bd\u00d7\u00c5MWy\u00c2o\u0096\u0010\u00d5p[C|15\u0093\u00bfl\u00f5)\u00b5H<\u009d\u0010\u00fb\u00ea\u00a2:\u0088\u0097]?\u0016\u0098\u00a5\u00a8\u00be\u0088\u009c\u00fa\b\u00f6H4y\u00ef\u00891\u0088\u0010\u0003\u0015\u00ad+\u009c\u00c6&Z\u00c3\u0011\u00ab\u00a4Z#&\u00a1\u0010\u00f4\u0080;bD\u00b1\u008a@\u00ed\u00de\n\"cq\u0017H".length();
                        var15_7 = 24;
                        var14_8 = -1;
lbl22:
                        // 2 sources

                        while (true) {
                            v3 = ++var14_8;
                            v4 = var16_5.substring(v3, v3 + var15_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl27:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = _0e_0.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "\u0003\u0015\u00ad+\u009c\u00c6&Z\u00ff0\u0080\u00f6\n#\f\u00db\u0010\u0084\u000e\u00aaW\u00de\u008d\u00d3\u00ab\u00b0}\u00ba\u00b9\u00b2\u00eb5\"";
                            var18_6 = "\u0003\u0015\u00ad+\u009c\u00c6&Z\u00ff0\u0080\u00f6\n#\f\u00db\u0010\u0084\u000e\u00aaW\u00de\u008d\u00d3\u00ab\u00b0}\u00ba\u00b9\u00b2\u00eb5\"".length();
                            var15_7 = 16;
                            var14_8 = -1;
lbl36:
                            // 2 sources

                            while (true) {
                                v6 = ++var14_8;
                                v4 = var16_5.substring(v6, v6 + var15_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl41:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = _0e_0.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_9 = var12_1.doFinal(v4.getBytes("ISO-8859-1"));
                    switch (v5) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl53:
                        // 1 sources

                        ** continue;
                    }
                }
                _0e_0.d = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var20 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[17];
                var3_13 = 0;
                var4_14 = "\u0014\u00ed)\u007f!v\u00e2\u0088\u001b\"W\u0012\u00fe\u009c\u00f5\u008c2e\u001f6\u00f92\u00e2\u00c0\u0085\u0083+y\u0098\u00b1)6\u00cdA\u0018\u007fU\u00beH\u00bbU\\\u00f4\u00a2D\u00fb\u009cm\u00ecz\u00ae\u00e5R\u0013\u008b\u00dd\u0018y\u00ceHS\u00ae\u00fc\u0099\u00ff.G\u00de\u001a\u007fp\u00ad\\\u0000e&\u0094(N6.\u00a4\u008e\u00a4&\u00cbq\u0080\u00c49\u00e5_\u00d8\u0091ek\u00d2\u00cb\u00eb%b\u00a6\u0083\u008f\u00c3V9\u0015k1o\u00925rRO\u00a1\u00f8\u00a0\u00c3";
                var5_15 = "\u0014\u00ed)\u007f!v\u00e2\u0088\u001b\"W\u0012\u00fe\u009c\u00f5\u008c2e\u001f6\u00f92\u00e2\u00c0\u0085\u0083+y\u0098\u00b1)6\u00cdA\u0018\u007fU\u00beH\u00bbU\\\u00f4\u00a2D\u00fb\u009cm\u00ecz\u00ae\u00e5R\u0013\u008b\u00dd\u0018y\u00ceHS\u00ae\u00fc\u0099\u00ff.G\u00de\u001a\u007fp\u00ad\\\u0000e&\u0094(N6.\u00a4\u008e\u00a4&\u00cbq\u0080\u00c49\u00e5_\u00d8\u0091ek\u00d2\u00cb\u00eb%b\u00a6\u0083\u008f\u00c3V9\u0015k1o\u00925rRO\u00a1\u00f8\u00a0\u00c3".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v10 = var6_12;
                    v11 = var3_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl78:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u00e5v4,\u00d2u6\f\u001a\u000e8\u00b9.QQ\u00ce";
                    var5_15 = "\u00e5v4,\u00d2u6\f\u001a\u000e8\u00b9.QQ\u00ce".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v10 = var6_12;
                        v11 = var3_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl91:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    break block21;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl104:
                // 1 sources

                ** continue;
            }
        }
        _0e_0.b = var6_12;
        _0e_0.c = new Integer[17];
        _0e_0.CMRadio = new _0e_0(var11_3[23], 0, var11_3[6]);
        _0e_0.BaseRadio = new _0e_0(var11_3[20], 1, var11_3[11]);
        _0e_0.My105DJRadio = new _0e_0(var11_3[18], 2, var11_3[13]);
        _0e_0.My105TodaysBestMusic = new _0e_0(var11_3[2], 3, var11_3[15]);
        _0e_0.My105Chill = new _0e_0(var11_3[9], 4, var11_3[8]);
        _0e_0.My105AllTheHits = new _0e_0(var11_3[4], 5, var11_3[5]);
        _0e_0.ILRadio = new _0e_0(var11_3[16], (int)_0e_0.a("c", (int)8418, (long)(4186473402113025222L ^ var20)), var11_3[25]);
        _0e_0.IL2Dance = new _0e_0(var11_3[21], (int)_0e_0.a("c", (int)28297, (long)(6920422017308502692L ^ var20)), var11_3[10]);
        _0e_0.ILHipHop = new _0e_0(var11_3[24], (int)_0e_0.a("c", (int)1833, (long)(7066725588397867806L ^ var20)), var11_3[7]);
        _0e_0.ILHitHistory = new _0e_0(var11_3[22], (int)_0e_0.a("c", (int)24344, (long)(8482934121598065467L ^ var20)), var11_3[19]);
        _0e_0.ILTheSun = new _0e_0(var11_3[12], (int)_0e_0.a("c", (int)8515, (long)(616753147950589285L ^ var20)), var11_3[27]);
        _0e_0.ILTheGreatestHits = new _0e_0(var11_3[0], (int)_0e_0.a("c", (int)25511, (long)(1401278267083171727L ^ var20)), var11_3[3]);
        _0e_0.ILChillHop = new _0e_0(var11_3[14], (int)_0e_0.a("c", (int)24404, (long)(147972118728547195L ^ var20)), var11_3[1]);
        _0e_0.ILHipHophistory = new _0e_0(var11_3[26], (int)_0e_0.a("c", (int)13186, (long)(6384179982777251747L ^ var20)), var11_3[17]);
        _0e_0.cfr_renamed_1 = _0e_0.b("H", (long)8235465527797744355L, (long)var20);
    }

    public String toString() {
        long l2 = a ^ 0x280952D3C416L;
        return _0e_0.b("d", (Object)((Object)this), -1397869080594771911L, (long)l2);
    }

    public static _0e_0[] values() {
        long l2 = a ^ 0x3A683C298D21L;
        return (_0e_0[])((Enum)((Object)_0e_0.b("U", -6507741008359235192L, (long)l2))).clone();
    }

    public static _0e_0 valueOf(String string) {
        long l2 = a ^ 0xEB2354C2192L;
        return (_0e_0)((Object)_0e_0.b("H", _0e_0.class, (Object)string, 656286566750847242L, (long)l2));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0e" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _0e_0.a(l2, l3);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                _0e_0.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _0e_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _0e_0.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _0e_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _0e_0.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _0e_0.a(l2, l3);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = _0e_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _0e_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _0e_0.a(clazz3, string2, clazz2)) != null) {
                    _0e_0.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _0e_0.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _0e_0.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _0e_0.b(423237153580391L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _0e_0.a(l2, l3);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = _0e_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _0e_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _0e_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _0e_0.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _0e_0.b(423237153580391L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _0e_0.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _0e_0.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _0e_0.b(423237153580391L, 0L);
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

    private static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static void a() {
        Object[] objectArray = e;
        e[0] = "\nW\u0003W:X\u0017B\u0001\u0016?\u0004^W";
        objectArray[1] = "\u0002\u001aB\u001f\u0018i\t\u0015SPsk\u001d\u0016";
        objectArray[2] = ">~}S\u0005\u00055ql\u001ch\u00055lx";
        objectArray[3] = "K O$\\o@/^k!wS(W\"";
        objectArray[4] = "r\u00001\u001a^jB>,\u000f\\+Gbe\u001a\u0013";
        objectArray[5] = "\u0001V&\u0013c;1h;\u0006az44r\u0013.";
        objectArray[6] = "\u0003T\u001br8_\b[\n=YQ\u0003P\u000eg";
        objectArray[7] = "S\u00157\bs\fUT8j\u0003\\O\b\u0007\u0003%TSe:\u001a#W\u000e\\<[,";
        objectArray[8] = "xW~\u0019Ak~\u0016q{>#&\u001f)79\bvKu\u001c{5oMvAB3.B";
        objectArray[9] = "q5q\u0010\" wt~rY]L,w\u0013\u007f\u0019q5q\u0010\" wt~";
        objectArray[10] = "{}BVI\u001a}<M42g@mEo\u000eE\u001cjX^\u0011\u0019%l\u0019Q";
        objectArray[11] = "WcQ]Z4Q\"^?Q\r\u000bkC\\[sSp\nG";
        objectArray[12] = "3t\u0018u})55\u0017\u0017~\u0010o|\nt|n7gCoG";
        objectArray[13] = "fV%+b\f`\u0017*I\u0019qAG3\t9N}A58XRqL-saT0C";
        objectArray[14] = "wk&\u007f\u0019Pq*)\u001df\u0018)#qVC\bt\u007fLzS\u0003r!u|\u0012\f";
        objectArray[15] = "c$e\u0015yDeejwz}>4r\u0007/\u00178$aH";
        objectArray[16] = "0=_9z^6|P[\u0001#\u000b-X\u0014:\n>1X <'61N['\u0017=/\u000fb!V2";
        objectArray[17] = "$\u0007+e\u0000z\"F$\u0007{\u0007\b\u0017 c^\u0003$\u000fA`J)!Mxf\u000b&";
        objectArray[18] = "M\u0011\u0018adRKP\u0017\u0003\u001b\u001a\u0013YO_9\u0007C\u0010\tI3\u0010V$\u000fx?\u0000*\u0006\u0002i<Q\u0013\u0000Cf";
        objectArray[19] = "vXmp\u0002\rp\u0019b\u0012ypQI\u007fR_L\u0011OwxZ\u000e(I6w";
        objectArray[20] = "vuq\u0004\u000b\u007fp4~fz\u0003Klw\u0007VFvuq\u0004\u000b\u007fp4~";
        objectArray[21] = "mQGJ\u00044k\u0010H(\u007fIJ@UhYuj@VTYw{!JXTo0\u0018L\u0019[";
        objectArray[22] = "\u0018Gl\u001a7b]NqD[!HJjH\u001c1!\u0017p^e1XGeT!_\u001bNjU75\u001d^y\u001a[fHU(If#AHv%";
        objectArray[23] = "\u0012hv(M3\u0014)yJ2{L !\u0003\u0013n)xq\n\u0016v\u000e\u0018{:\u001dhO!}{\u0012";
        Object[] objectArray2 = objectArray;
        objectArray[24] = "AD\fLLzG\u0005\u0003.7\u0007\u001cx\u000fH\u001d.&S\u0016D\u0014y\u001fUWK";
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'd' || c == '\u00ec' || c == 'U' || c == 'f') {
                field = _0e_0.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'd' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ec' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'U' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _0e_0.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'l' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'H' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _0e_0.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int a(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (f[n3] != null) {
            return n3;
        }
        Object object = e[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 14;
            case 1 -> 28;
            case 2 -> 53;
            case 3 -> 21;
            case 4 -> 4;
            case 5 -> 62;
            case 6 -> 38;
            case 7 -> 55;
            case 8 -> 18;
            case 9 -> 51;
            case 10 -> 33;
            case 11 -> 37;
            case 12 -> 44;
            case 13 -> 15;
            case 14 -> 0;
            case 15 -> 16;
            case 16 -> 20;
            case 17 -> 57;
            case 18 -> 11;
            case 19 -> 34;
            case 20 -> 23;
            case 21 -> 8;
            case 22 -> 58;
            case 23 -> 10;
            case 24 -> 19;
            case 25 -> 35;
            case 26 -> 63;
            case 27 -> 17;
            case 28 -> 56;
            case 29 -> 9;
            case 30 -> 25;
            case 31 -> 30;
            case 32 -> 52;
            case 33 -> 47;
            case 34 -> 36;
            case 35 -> 39;
            case 36 -> 22;
            case 37 -> 49;
            case 38 -> 42;
            case 39 -> 60;
            case 40 -> 5;
            case 41 -> 54;
            case 42 -> 6;
            case 43 -> 61;
            case 44 -> 7;
            case 45 -> 1;
            case 46 -> 2;
            case 47 -> 59;
            case 48 -> 41;
            case 49 -> 13;
            case 50 -> 24;
            case 51 -> 29;
            case 52 -> 43;
            case 53 -> 46;
            case 54 -> 31;
            case 55 -> 32;
            case 56 -> 50;
            case 57 -> 48;
            case 58 -> 26;
            case 59 -> 40;
            case 60 -> 12;
            case 61 -> 45;
            case 62 -> 3;
            default -> 27;
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
        _0e_0.f[n3] = new String(cArray);
        return n3;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0e" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _0e_0.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x366E;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])d.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/0e", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _0e_0.c[n2] = n3;
        }
        return c[n2];
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_0e_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_0e_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

