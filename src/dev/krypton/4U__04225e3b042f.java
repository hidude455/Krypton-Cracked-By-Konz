/*
 * Decompiled with CFR 0.152.
 */
package dev.krypton;

import dev.krypton._04;
import dev.krypton._06;
import dev.krypton._4;
import dev.krypton._4w;
import dev.krypton._8o;
import dev.krypton._9n;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _4U {
    private static final Pattern cfr_renamed_8;
    private static final Pattern cfr_renamed_2;
    private static final Pattern cfr_renamed_0;
    private static final Pattern cfr_renamed_206;
    private static final Pattern cfr_renamed_4;
    private static final Pattern cfr_renamed_7;
    private static final Pattern cfr_renamed_1;
    private static final Pattern cfr_renamed_5;
    private static final Pattern cfr_renamed_9;
    private static final Pattern cfr_renamed_156;
    private static final int cfr_renamed_6;
    private static final int cfr_renamed_3;
    private static final double cfr_renamed_207 = 0.5522847498307933;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static final Object[] h;
    private static final String[] i;

    private _4U() {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        _4U.a = l.a(3664348712073381916L, -641934880816277587L, MethodHandles.lookup().lookupClass()).a(62421317346097L);
                        var20 = _4U.a ^ 33063624501582L;
                        _4U.h = new Object[95];
                        _4U.i = new String[95];
                        _4U.a();
                        _4U.d = new HashMap<K, V>(13);
                        var11_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var12_2 = 1; var12_2 < 8; ++var12_2) {
                            v2 = v2;
                            v2[var12_2] = (byte)(var20 << var12_2 * 8 >>> 56);
                        }
                        var11_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var18_3 = new String[36];
                        var16_4 = 0;
                        var15_5 = "\u00a0\u001a\u0013=_\u00cc\u0017\u0097\u001d\u00c6u4\u00ab\u00bcb+8d7G\tZ\u0095\u00fe\u00a1\u001e\u00e6;\u008e\u00b6|\u00c9\u0082\r\u00e5\u0004\u00df\u0002\u009e\u009b\u00f5\u007fN\u00af}J\u00a4\u00f0\u00a6ROB\u0092\u00bc\u0004\u0098\u001c\u0094\u00dd\u000f\u00f8\u00f31\u00a6->\u0086\u00d2\bB\u00e7;>\u0010N\u001d\u0012\u00d9B*=2AW!\u00e4\u00bdg0\u00be\u0010\u009a@b'}\u009d\u0082o\u00e1\u00cf\u00f30\u0018}[\u0085\u0010\u0087\u00f3\u0003\u00d0\u001f\u00e2\u007f\u0014\u0015G\u0082i\u0000\u00db>d(\u00ce\u008c;\u0094&\u00d8K\u00db&=+\u00a7\u0010-\u0016/\u00ba\u00eaf\u0005\u008f\u00d3[\t\u00bb]e\u00c0\u00d2\u00f4.K\u008e\u0010V\u00d3\u0006\u001b^\u00e2\u0018\u0012\u00f7\u009b56\u0094@\u00f1:\u008e\u0088\u00ae\u00ce\u0003\u00d4Aj\u00d0\u0000%\u000e@\u00d1\u00b2 \u00ca\u0016G\u00f2E+3 \u00c0\u00d5\u00d4\u0005DP\u00f0S\u00a0\u0086\u00b8+\u001b2f\u0090e\u00b7\u0085qou\u0005s\u0010\u00b2\u0000\u008f\u0085P\u00ce\u00cf\u00bb\u00e5#\u00eb\u00c4\u00abh-\u00d6(\u00bc\u0093~\u00f2\u007fE\u0011U\u008bQT!HI\u00a2?\u0089^\u00dcG3\u009e\u00b8\u00d8\u0096\u00d7$\u00a6\u00a9|\u00fa\u00f5\u0017\u0095\u00fe\u00b6L\u00f7\u008f\u00d8\u0018?\u00a6\u0004L;Y\u00a7<\u001f\u0093\u009b-\u000bn\u0086I\\\u00b5\\r**\u00bf\n\u0010\u0085\u00d9/\u00a6\u001b\u0012\u0010\u00f1\u00a4\u00ba^\u0082\u009e\u00af|\u000f\u0010\u0099^b\u00862\b5\u0013\u00bd&\u00c4\\\u0012_Z\u00f1\u0010h\u00b7\u00e8\u00ea\u00d9\u00c3%B#\u00a7\u00dd\u00e1wy\u00bdR\u0010\u00f5\u0011-\u000e\u00e2\u00aa\u00fc\u0091\t\u00feg4\t\u00ba\u00e6\u00d3(\u00a4\u00a9\u00f1\u00ba\u00e0]2\u00fc\u0083\u00faD2\u0083\u001c\u00c4\u009e'\u00b5\u0095\u00c1\u009cln\u00c9~l\u00dbU\u008e\u0017Nr\u00e5\u009e?a\u0096\u0080\u00b2\u00c5\u00106e\u0010\u0090\u000e4R\u0098\u00bbf\u00f80\u00b1\u009b\u00e7^\u0010\u00b2\u00e9\u00f94\u00c01u\u00ab\u00f5\u007f\u00be\u00c4F)D\u00fc\u00108\u000f\u00f8mO,\u00ac\u00e0V\u00bcf3\u00ce\u00e0{\u00e4\u0010\u00d5\u0013\u00c3\u00c7-\u00c2a\u00e1\u001fl\u00fc\u00d0\u00b0\u00d1N$0E]\n\u0089\u00d0\u00a9\u0001L:}\u0090\u00f0\u00eb\u00f7\u00c7\u008d\u00ad\u00f5\u0083'\u0099c\u00c8\b\u00c0\u000e\u00ed\u0018Z|\u00a5\u007f\u00d1.\u00c7\u00c7\u0018\u0000K\u008c\u0098\u00ef\u000f*\u00c77\u0088Q\u0010\u00e6$\u00cd\u00f1.\u0005{\u00a5\u00bb\u00a7&\u00d0\u00dd\u00cc\u00c6Y(\u009f\u00fd|\u00ca\u00b4\u00f9\u0093\u00cc\u00fe\u00b4\u0080#A\u0083eE\u00c2\u000bK\u008b\u008d\u00c9*\u00e1\u008b\u00d6\u00bd\u00beV\u00aal;d[\u00d7`CG\u00b1%(`\u00e4i\u00d2X\u00b5\u008d\u009b\u00ed)%\u0001\u00ffN\u00b0\"\u009d5\u001b\u00d6\u00cfh8|\u00c6]\u0019\u00e1\u00bb\n\u00e1O\u00cc'\u00c6\u00a5U\u001d8\u0007H*!\u00c2\f\u00c2\u00e9\u00c3#I\u0000E- \u001e'\u00faK\u0012\u0012\u0092L\n\u0002\u00caG\u0091\u00e8_4\u001c\f\u00db\u0096\u00b7\u0084\u00e7\u00a5\u00a61)2\nB\u00dc\u00d7Y\u0099?J\u00864Y}\u0099\u00afC\u00c3\u0012\u00d5\u0015h\u00c8IF\u0018\u00c3\u0085\u00cc\u00c5\u0082#\u00ae\u0018I\u0014M\u00ac\u0089l5\u00faP\u00e2+\u00cc/\u009c\u008c+\u0001\u00c0\n\u00be\u00a3\u00c6\u0089B\u0010k#\u0000\u00e2\u00b0\u00b8=\u0096P\u00b5\u00ee&\u00b1Mn=\u0010\u00b8\u00ed\u00fbl-65\u00c0\u000bF\u0018\u0019\u0001B\u00ef\u00ca([\u0097Td@\u0010\u00bb\u00fd\u009b?\u00b9{\u00a7[\u00eb\u0080\t\u0014t\u00807\u00dc\u0098\u00c0WB:\u0080KW\r\u009b~\u00e1\u0015\u00d55\u00cf\u00a2}\u0010>\u00d6\u00a9\u0014\u00c1\u00ce\u00bdx\u0013\u00b6\u0090 \u00e8K\u00c0t\u0010`\r\u00b3\u00aa\u00b6\u00ac\u00a7\u0001\u00d3\u00ca&\u001c\u00ddn%1H\u0015\u00f4\u00f1\u00f8\u0099\u009d\r\u009f\u00fdq\u00f6@\to\u00e6\u00cfu\u001a^\u00bf\rh\u00fab\u0002\u00e9D!\u0001p\u0015E\u00d3\u001b\u00c6\u007f~\u0012z\u0014^\u00bc\u00c5\u00ee\u00f0\t0\u00b8\"\u001c)e,>\u00e0'\u0086\u00ce\u0097\f\u00cb\u00c4\u0019\u00b9\u00af\u00ef\u00a4F\u00e0j\u00ca@\u0010\u0084\u00b5\u00af\u0002t\u0096\u0080uT\u00d9\u00c0k\u00aa\u00fa\u00f6\u00e8(\u00b2\u001f\u00c1\u00dd\u00b4\u00d9\u008b\u0093\u0084\u00ad\u00a8\u00cc\u00ab\u00ba\u00ac\u00d3\u00be\u00fc\u00a3\u0002\u00ce\u00cf\u00da\u0097\u00b3\u0010\u00ddd%\u0007f\u00c0w\u0083i\u00bd\u001c\u0016\u0093Z";
                        var17_6 = "\u00a0\u001a\u0013=_\u00cc\u0017\u0097\u001d\u00c6u4\u00ab\u00bcb+8d7G\tZ\u0095\u00fe\u00a1\u001e\u00e6;\u008e\u00b6|\u00c9\u0082\r\u00e5\u0004\u00df\u0002\u009e\u009b\u00f5\u007fN\u00af}J\u00a4\u00f0\u00a6ROB\u0092\u00bc\u0004\u0098\u001c\u0094\u00dd\u000f\u00f8\u00f31\u00a6->\u0086\u00d2\bB\u00e7;>\u0010N\u001d\u0012\u00d9B*=2AW!\u00e4\u00bdg0\u00be\u0010\u009a@b'}\u009d\u0082o\u00e1\u00cf\u00f30\u0018}[\u0085\u0010\u0087\u00f3\u0003\u00d0\u001f\u00e2\u007f\u0014\u0015G\u0082i\u0000\u00db>d(\u00ce\u008c;\u0094&\u00d8K\u00db&=+\u00a7\u0010-\u0016/\u00ba\u00eaf\u0005\u008f\u00d3[\t\u00bb]e\u00c0\u00d2\u00f4.K\u008e\u0010V\u00d3\u0006\u001b^\u00e2\u0018\u0012\u00f7\u009b56\u0094@\u00f1:\u008e\u0088\u00ae\u00ce\u0003\u00d4Aj\u00d0\u0000%\u000e@\u00d1\u00b2 \u00ca\u0016G\u00f2E+3 \u00c0\u00d5\u00d4\u0005DP\u00f0S\u00a0\u0086\u00b8+\u001b2f\u0090e\u00b7\u0085qou\u0005s\u0010\u00b2\u0000\u008f\u0085P\u00ce\u00cf\u00bb\u00e5#\u00eb\u00c4\u00abh-\u00d6(\u00bc\u0093~\u00f2\u007fE\u0011U\u008bQT!HI\u00a2?\u0089^\u00dcG3\u009e\u00b8\u00d8\u0096\u00d7$\u00a6\u00a9|\u00fa\u00f5\u0017\u0095\u00fe\u00b6L\u00f7\u008f\u00d8\u0018?\u00a6\u0004L;Y\u00a7<\u001f\u0093\u009b-\u000bn\u0086I\\\u00b5\\r**\u00bf\n\u0010\u0085\u00d9/\u00a6\u001b\u0012\u0010\u00f1\u00a4\u00ba^\u0082\u009e\u00af|\u000f\u0010\u0099^b\u00862\b5\u0013\u00bd&\u00c4\\\u0012_Z\u00f1\u0010h\u00b7\u00e8\u00ea\u00d9\u00c3%B#\u00a7\u00dd\u00e1wy\u00bdR\u0010\u00f5\u0011-\u000e\u00e2\u00aa\u00fc\u0091\t\u00feg4\t\u00ba\u00e6\u00d3(\u00a4\u00a9\u00f1\u00ba\u00e0]2\u00fc\u0083\u00faD2\u0083\u001c\u00c4\u009e'\u00b5\u0095\u00c1\u009cln\u00c9~l\u00dbU\u008e\u0017Nr\u00e5\u009e?a\u0096\u0080\u00b2\u00c5\u00106e\u0010\u0090\u000e4R\u0098\u00bbf\u00f80\u00b1\u009b\u00e7^\u0010\u00b2\u00e9\u00f94\u00c01u\u00ab\u00f5\u007f\u00be\u00c4F)D\u00fc\u00108\u000f\u00f8mO,\u00ac\u00e0V\u00bcf3\u00ce\u00e0{\u00e4\u0010\u00d5\u0013\u00c3\u00c7-\u00c2a\u00e1\u001fl\u00fc\u00d0\u00b0\u00d1N$0E]\n\u0089\u00d0\u00a9\u0001L:}\u0090\u00f0\u00eb\u00f7\u00c7\u008d\u00ad\u00f5\u0083'\u0099c\u00c8\b\u00c0\u000e\u00ed\u0018Z|\u00a5\u007f\u00d1.\u00c7\u00c7\u0018\u0000K\u008c\u0098\u00ef\u000f*\u00c77\u0088Q\u0010\u00e6$\u00cd\u00f1.\u0005{\u00a5\u00bb\u00a7&\u00d0\u00dd\u00cc\u00c6Y(\u009f\u00fd|\u00ca\u00b4\u00f9\u0093\u00cc\u00fe\u00b4\u0080#A\u0083eE\u00c2\u000bK\u008b\u008d\u00c9*\u00e1\u008b\u00d6\u00bd\u00beV\u00aal;d[\u00d7`CG\u00b1%(`\u00e4i\u00d2X\u00b5\u008d\u009b\u00ed)%\u0001\u00ffN\u00b0\"\u009d5\u001b\u00d6\u00cfh8|\u00c6]\u0019\u00e1\u00bb\n\u00e1O\u00cc'\u00c6\u00a5U\u001d8\u0007H*!\u00c2\f\u00c2\u00e9\u00c3#I\u0000E- \u001e'\u00faK\u0012\u0012\u0092L\n\u0002\u00caG\u0091\u00e8_4\u001c\f\u00db\u0096\u00b7\u0084\u00e7\u00a5\u00a61)2\nB\u00dc\u00d7Y\u0099?J\u00864Y}\u0099\u00afC\u00c3\u0012\u00d5\u0015h\u00c8IF\u0018\u00c3\u0085\u00cc\u00c5\u0082#\u00ae\u0018I\u0014M\u00ac\u0089l5\u00faP\u00e2+\u00cc/\u009c\u008c+\u0001\u00c0\n\u00be\u00a3\u00c6\u0089B\u0010k#\u0000\u00e2\u00b0\u00b8=\u0096P\u00b5\u00ee&\u00b1Mn=\u0010\u00b8\u00ed\u00fbl-65\u00c0\u000bF\u0018\u0019\u0001B\u00ef\u00ca([\u0097Td@\u0010\u00bb\u00fd\u009b?\u00b9{\u00a7[\u00eb\u0080\t\u0014t\u00807\u00dc\u0098\u00c0WB:\u0080KW\r\u009b~\u00e1\u0015\u00d55\u00cf\u00a2}\u0010>\u00d6\u00a9\u0014\u00c1\u00ce\u00bdx\u0013\u00b6\u0090 \u00e8K\u00c0t\u0010`\r\u00b3\u00aa\u00b6\u00ac\u00a7\u0001\u00d3\u00ca&\u001c\u00ddn%1H\u0015\u00f4\u00f1\u00f8\u0099\u009d\r\u009f\u00fdq\u00f6@\to\u00e6\u00cfu\u001a^\u00bf\rh\u00fab\u0002\u00e9D!\u0001p\u0015E\u00d3\u001b\u00c6\u007f~\u0012z\u0014^\u00bc\u00c5\u00ee\u00f0\t0\u00b8\"\u001c)e,>\u00e0'\u0086\u00ce\u0097\f\u00cb\u00c4\u0019\u00b9\u00af\u00ef\u00a4F\u00e0j\u00ca@\u0010\u0084\u00b5\u00af\u0002t\u0096\u0080uT\u00d9\u00c0k\u00aa\u00fa\u00f6\u00e8(\u00b2\u001f\u00c1\u00dd\u00b4\u00d9\u008b\u0093\u0084\u00ad\u00a8\u00cc\u00ab\u00ba\u00ac\u00d3\u00be\u00fc\u00a3\u0002\u00ce\u00cf\u00da\u0097\u00b3\u0010\u00ddd%\u0007f\u00c0w\u0083i\u00bd\u001c\u0016\u0093Z".length();
                        var14_7 = 16;
                        var13_8 = -1;
lbl23:
                        // 2 sources

                        while (true) {
                            v3 = ++var13_8;
                            v4 = var15_5.substring(v3, v3 + var14_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = _4U.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            var15_5 = "\u00a0\u00a5<\u0081<\u008f\u00dcu;\u00cd\u0084\u00a6[C\u00e4#\u0010B\u00ebC1\u00dc\u00a0\u00f63\u00d2\u00acC\u00c96\u000bgO";
                            var17_6 = "\u00a0\u00a5<\u0081<\u008f\u00dcu;\u00cd\u0084\u00a6[C\u00e4#\u0010B\u00ebC1\u00dc\u00a0\u00f63\u00d2\u00acC\u00c96\u000bgO".length();
                            var14_7 = 16;
                            var13_8 = -1;
lbl37:
                            // 2 sources

                            while (true) {
                                v6 = ++var13_8;
                                v4 = var15_5.substring(v6, v6 + var14_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl42:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = _4U.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_9 = var11_1.doFinal(v4.getBytes("ISO-8859-1"));
                    switch (v5) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl54:
                        // 1 sources

                        ** continue;
                    }
                }
                _4U.b = var18_3;
                _4U.c = new String[36];
                _4U.g = new HashMap<K, V>(13);
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
                var6_12 = new long[11];
                var3_13 = 0;
                var4_14 = "\u00b6c\u0011\u00ded\u008ba\u00ac\u00ff\u0003[k\u00a4\u00cd\u00c4 \u00bd\u00b6\u001c\u0005{\u00e4\u00fb\u00e8r\u00d2\u00ba\u00d9\u0085\u00afb8\u00ab\u00a4\u00d1\u00d7b\u00cb]A\u00db\u000f-d\u00d8\u0004\u0086\u009e\u00d5\u00c0\u0091\u0088=k\u0014Y#7'\u0082>\u00e6\u00a62\"\u0004\u00d0s\u0098\u0014o%";
                var5_15 = "\u00b6c\u0011\u00ded\u008ba\u00ac\u00ff\u0003[k\u00a4\u00cd\u00c4 \u00bd\u00b6\u001c\u0005{\u00e4\u00fb\u00e8r\u00d2\u00ba\u00d9\u0085\u00afb8\u00ab\u00a4\u00d1\u00d7b\u00cb]A\u00db\u000f-d\u00d8\u0004\u0086\u009e\u00d5\u00c0\u0091\u0088=k\u0014Y#7'\u0082>\u00e6\u00a62\"\u0004\u00d0s\u0098\u0014o%".length();
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
lbl81:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "[\u00d1;\f\u00cc\u008a+\u00f7\u00c8\u00dd!\"| =W";
                    var5_15 = "[\u00d1;\f\u00cc\u008a+\u00f7\u00c8\u00dd!\"| =W".length();
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
lbl94:
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
lbl107:
                // 1 sources

                ** continue;
            }
        }
        _4U.e = var6_12;
        _4U.f = new Integer[11];
        _4U.cfr_renamed_3 = (int)_4U.b("r", (int)15647, (long)(var20 ^ 1821965323432465184L));
        _4U.cfr_renamed_6 = (int)_4U.b("r", (int)9397, (long)(var20 ^ 3153865188182297221L));
        _4U.cfr_renamed_8 = _4U.c("t", (Object)_4U.a("q", (int)21533, (long)(3659048632946959467L ^ var20)), (long)-2301415010167539866L, (long)var20);
        _4U.cfr_renamed_2 = _4U.c("t", (Object)_4U.a("q", (int)32751, (long)(481316388547104663L ^ var20)), (int)_4U.b("r", (int)21046, (long)(2741712412867787784L ^ var20)), (long)-2299093870824793160L, (long)var20);
        _4U.cfr_renamed_0 = _4U.c("t", (Object)_4U.a("q", (int)11017, (long)(5565645747215686496L ^ var20)), (int)_4U.b("r", (int)21162, (long)(8779337091639508126L ^ var20)), (long)-2299093870824793160L, (long)var20);
        _4U.cfr_renamed_206 = _4U.c("t", (Object)_4U.a("q", (int)31882, (long)(5538485641652178132L ^ var20)), (int)_4U.b("r", (int)21162, (long)(8779337091639508126L ^ var20)), (long)-2299093870824793160L, (long)var20);
        _4U.cfr_renamed_4 = _4U.c("t", (Object)_4U.a("q", (int)26414, (long)(8864341726644868933L ^ var20)), (int)_4U.b("r", (int)21162, (long)(8779337091639508126L ^ var20)), (long)-2299093870824793160L, (long)var20);
        _4U.cfr_renamed_7 = _4U.c("t", (Object)_4U.a("q", (int)14513, (long)(9911607040788697L ^ var20)), (int)_4U.b("r", (int)21162, (long)(8779337091639508126L ^ var20)), (long)-2299093870824793160L, (long)var20);
        _4U.cfr_renamed_1 = _4U.c("t", (Object)_4U.a("q", (int)29183, (long)(7040324181996011932L ^ var20)), (int)_4U.b("r", (int)21162, (long)(8779337091639508126L ^ var20)), (long)-2299093870824793160L, (long)var20);
        _4U.cfr_renamed_5 = _4U.c("t", (Object)_4U.a("q", (int)11342, (long)(5879421132111404094L ^ var20)), (int)_4U.b("r", (int)21162, (long)(8779337091639508126L ^ var20)), (long)-2299093870824793160L, (long)var20);
        _4U.cfr_renamed_9 = _4U.c("t", (Object)_4U.a("q", (int)30318, (long)(1552260561069147668L ^ var20)), (int)_4U.b("r", (int)21162, (long)(8779337091639508126L ^ var20)), (long)-2299093870824793160L, (long)var20);
        _4U.cfr_renamed_156 = _4U.c("t", (Object)_4U.a("q", (int)31801, (long)(4348893220787752030L ^ var20)), (long)-2301415010167539866L, (long)var20);
    }

    private static int b(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x4E35;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])g.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/4U", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _4U.f[n2] = n3;
        }
        return f[n2];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/4U" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _4U.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _4U.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _4U.b(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _4U.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _4U.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _4U.a(l2, l3);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                _4U.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/4U" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l2, long l3) {
        int n = _4U.a(l2, l3);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = _4U.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _4U.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _4U.a(clazz3, string2, clazz2)) != null) {
                    _4U.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _4U.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _4U.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _4U.b(2438073054210664L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _4U.a(l2, l3);
        Object object = h[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = i[n];
                int n3 = string2.indexOf(8);
                clazz3 = _4U.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _4U.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _4U.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _4U.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _4U.b(2438073054210664L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _4U.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _4U.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _4U.b(2438073054210664L, 0L);
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/4U" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _4U.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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

    private static int a(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (i[n3] != null) {
            return n3;
        }
        Object object = h[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 39;
            case 1 -> 38;
            case 2 -> 53;
            case 3 -> 17;
            case 4 -> 12;
            case 5 -> 54;
            case 6 -> 35;
            case 7 -> 6;
            case 8 -> 8;
            case 9 -> 0;
            case 10 -> 9;
            case 11 -> 61;
            case 12 -> 5;
            case 13 -> 46;
            case 14 -> 57;
            case 15 -> 50;
            case 16 -> 27;
            case 17 -> 43;
            case 18 -> 40;
            case 19 -> 13;
            case 20 -> 59;
            case 21 -> 1;
            case 22 -> 11;
            case 23 -> 51;
            case 24 -> 20;
            case 25 -> 56;
            case 26 -> 16;
            case 27 -> 48;
            case 28 -> 22;
            case 29 -> 14;
            case 30 -> 25;
            case 31 -> 55;
            case 32 -> 44;
            case 33 -> 23;
            case 34 -> 32;
            case 35 -> 42;
            case 36 -> 41;
            case 37 -> 19;
            case 38 -> 18;
            case 39 -> 15;
            case 40 -> 29;
            case 41 -> 45;
            case 42 -> 3;
            case 43 -> 34;
            case 44 -> 7;
            case 45 -> 47;
            case 46 -> 28;
            case 47 -> 49;
            case 48 -> 62;
            case 49 -> 52;
            case 50 -> 10;
            case 51 -> 63;
            case 52 -> 21;
            case 53 -> 24;
            case 54 -> 4;
            case 55 -> 33;
            case 56 -> 37;
            case 57 -> 58;
            case 58 -> 26;
            case 59 -> 2;
            case 60 -> 30;
            case 61 -> 36;
            case 62 -> 60;
            default -> 31;
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
        _4U.i[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "\u0004~b+L\u0018\u0019k`jIDYu";
        objectArray[1] = "o\u007f\u0016{%-\u001a_\u001dt4b{Q\u0016\u007f08\u000f";
        objectArray[2] = Void.TYPE;
        _4U.i[2] = "java/lang/Void";
        objectArray[3] = "WRDV-_IZ^\u0019qOZVJ\u0019NKIPZRq";
        objectArray[4] = Integer.TYPE;
        _4U.i[4] = "java/lang/Integer";
        objectArray[5] = ".2\u001dE $%=\f\n]<6:\u0005C";
        objectArray[6] = ">7s^p$#\"q\u001fuxn\u0007";
        objectArray[7] = "}\u0018V_1\u007fc\u0010L\u0010mop\u001cX\u0010Okc\rELq";
        objectArray[8] = "?\u0003odKIJ#dkZ\u0006+-o`^\\_";
        objectArray[9] = "\u0006\u0005;y\u0004vs%0v\u00159\u0012+;}\u0011cf";
        objectArray[10] = Double.TYPE;
        _4U.i[10] = "java/lang/Double";
        objectArray[11] = "1\u0018j;@4:\u0017{t*7.\u001bp?";
        objectArray[12] = "\u001aI;\u0019}H\u0004A!V\u001fT\u0003\\";
        objectArray[13] = "-X\u0011\u0004\u0019\u0010Xx\u001a\u000b\b_9v\u0011\u0000\f\u0005M";
        objectArray[14] = "]a\u001c|\r\u0014(A\u0017s\u001c[IO\u001cx\u0018\u0001=";
        objectArray[15] = Boolean.TYPE;
        _4U.i[15] = "java/lang/Boolean";
        objectArray[16] = "X*\nv+&-\n\u0001y:iL\u0004\nr>38";
        objectArray[17] = "T\u0016\bq\u0003P!6\u0003~\u0012\u001f@8\bu\u0016E4";
        objectArray[18] = "`m_Dl\u001f\u0015MTK}PtC_@y\n\u0000";
        objectArray[19] = "K7g(J[>\u0017l'[\u0014C\u000f\u007f R]+";
        objectArray[20] = " \u000f0!k\u001cU/;.zS4!0%~\t@";
        objectArray[21] = "!zy\u000bQ3*uhD<7*i\\\u000f\u000e*.ul\u000f";
        objectArray[22] = "v\u0005hGOr\u0003%cH^=b+hCZg\u0016";
        objectArray[23] = "\u001aP\u0011&|\u001e\u0007E\u0013gyBFA";
        objectArray[24] = "L+&\u0017\u001e.9\u000b-\u0018\u000faX\u0005&\u0013\u000b;,";
        objectArray[25] = "nf>\u001d<+\u001bF5\u0012-dzH>\u0019)>\u000e";
        objectArray[26] = Character.TYPE;
        _4U.i[26] = "java/lang/Character";
        objectArray[27] = "#&w\u001a\u0004\u000bV\u0006|\u0015\u0015D7\bw\u001e\u0011\u001eC";
        objectArray[28] = "GDBG\u0012C2dIH\u0003\fSjBC\u0007V'";
        objectArray[29] = "i\u0006\u000f\u0015AK\u001c&\u0004\u001aP\u0004}(\u000f\u0011T^\t";
        objectArray[30] = "H\t\u000b`POC\u0006\u001a/=KC\u001a\u001cb\nFP";
        objectArray[31] = "tf;\u001eFh\u0001F0\u0011W'`H;\u001aS}\u0014";
        objectArray[32] = "l+\b*;v\u0019\u000b\u0003%*9x\u0005\b..c\f";
        objectArray[33] = "F\u0007(]2|[\u0012*\u001c7 \u001a\r";
        objectArray[34] = "@\u007f\u00190\u007f\tKp\b\u007f\u001e\u0007@{\f%";
        objectArray[35] = "^?U@\t\u0014+\u001f^O\u0018[J\u0011UD\u001c\u0001>";
        objectArray[36] = "y},jm9\f]'e|vmS,nx,\u0019";
        objectArray[37] = "{u7SY\\\u000eU<\\H\u0013o[7WLI\u001b";
        objectArray[38] = "\u000f)";
        objectArray[39] = "+\u000eNhs  \u0001_'\u0010-5\u0007";
        objectArray[40] = "L\\3 $?9|8/5pXr3$1*,";
        objectArray[41] = "U\u0010%|RD\u0010Y.m)\u0004i[};\u0012\u000b\nI;oH4U\u001d%f\u0013P\u000b\u001e\u007f>)";
        objectArray[42] = "\u0018\u00148:iw]]3+\u0012=$_`})8GM&)s\u0007\u001dK:=.cA\u00192~\u0012";
        objectArray[43] = "\u0007\u001aRT y]\u001fT^QM <r&7a\u0005\nG\\md\u0003\u0000";
        objectArray[44] = "VUmiC\u0011\u0013\u001cfx8Zj\u001e5.\u0003^\t\fszYaUX`/T\n\u0017\u0017o)8";
        objectArray[45] = "@=L\u007f7r\u0013iN\u007f\u00065\u0019wWuJ*\rgHu\u0006qMiK\"b/N3\u0013\u00189p\u00196@s{?\u00160,";
        objectArray[46] = "\u000b\u0012\u0006[LF\u0010\t\u000f\\/O\u001b\fo\u0018\u0012OJ\u001b\u0004Z]@LwP\u001aF\u001d\u001d\u001c\u0012UI\u001bq";
        objectArray[47] = "!GZ!\u007f7:\\S&\u001c<6CW]#j2\u0019_6a%=\u001f3b!>`NX n1f\"";
        objectArray[48] = "=NRp<Vx\u0007YaG\u001d\u0001\u0005\n7|\u0019b\u0017Lc&&8\u0011Pw{BdCX4G";
        objectArray[49] = "n5\u0007WlV+|\fF\u0017\u0017R8\b\u0010uOl<\u0004Hh";
        objectArray[50] = "i\f\u00116JTm\u0000I+#\u00013\u0002S5G\u0007T[\u00160DP0\u0005\u0015j\u001cji\f\u00116JTm\u0000I+#";
        objectArray[51] = "(>!D}\u0017mw*U\u0006]\u0014uy\u0003=Xwg?Wgg+3,\u0002j\fi|#\u0004\u0006";
        objectArray[52] = "\u0011!`\u001c\u0017\u0016I0xLn\u001e\u000e\td\t\u0003\u0005>$x\u001bn\u001eE4<\f\u0003A\u0017#rv\u0007\u000eI49FP\u0012M)\u0003";
        objectArray[53] = "tp{3 Aokr4C]iO{#\"Hhn\u0012p~H5yy21G3\u0015-r*\u001ab~o=%\u001c\u000e";
        objectArray[54] = "\u000fFnM0\u000e\u000bJ6PYU[Q?O4J2@-\u0013%\u000e\u0003T.\u001180\bG3\u0015`@\f\u00152\u0011Y";
        objectArray[55] = ".R8S\u000et'H{l[\u001f3\u000b:W^|!Mn\ra&'QzP\u0005zuY9l";
        objectArray[56] = "o5\u001d:2/kg\u001c>\u000b0/8\u0007x\u000bdm0@dd%6$\u0010\u00007b18@diak`z";
        objectArray[57] = "H.{Y`cFr}\u0015\u0004;'1(]?8D#n\te\u0007N;(\u001e>7\u0019',\u0003\u0004";
        objectArray[58] = "\u0006+YDT\u0011\bw_\b0Mi4\n@\u000bJ\n&L\u0014Qu\b\u007fOEJ\u0018W-X\u000b0";
        objectArray[59] = "\u0003G2?\u0002:]Dhg83F\u0007?<C\u001fP\u001c1\"U\u0015V\u0001;X\u0004c[\u001dl<Z`\u0001EV1IbF@ffUf[z";
        objectArray[60] = "\u00010jdK(L2qr'8V\u0007afN515'&\u001c{R'arFDJr!'\u0018'X4u}'";
        objectArray[61] = "{/\u0019\u000e<T>f\u0012\u001fG\u001aG\"\u0016I%My&\u001a\u00118";
        objectArray[62] = "\u000e\n;\u0004\u0012p\u0015\u00112\u0003qy\u001f\b)xN-\u001dT>\u0013\fb\u0012RRGLyO\u00039\u0005\u0003vIo";
        objectArray[63] = "T4\u0011=rU\f%\tm\u000b@W\u0005\n/fF{1\t:\u000b]\u0000!M-f\u0002R6\u0003Wj\fIg\b:5^^)r";
        objectArray[64] = "\u0019\u0015Z\u0018%>\\\\Q\t^v%^\u0002_eqFLD\u000b?N\u0019\u0018Z\u0002d*G\u001b\u0000Z^";
        objectArray[65] = "=\u001aj\u0003\u0015sc\u00190[/vzjk\u001cSf\u0001N\u007fXV-1\u0019c\\K\u0017";
        objectArray[66] = "\u0000-\u0013FoK^.I\u001eUTDt\u0016]U\u0013\u0001t\u0010\u001b1M\u0002.H!9T[w\u000fG8U\r*w";
        objectArray[67] = "I\u0011:'-;\fX16VvuZb`mt\u0016H$47KLN8 j/\u0010\u001c0cV";
        objectArray[68] = "BTt6YZ\u0007\u001d\u007f'\"\u0011\u0012d- \u0018H\u0017Z),@U";
        objectArray[69] = "JK\nd$^\u0014HP<\u001eF\f\u0017\u000b\u0003\"\u0007\u0012\u0011Tg|\u0004HIn";
        objectArray[70] = "\tyLb'}\u0012bEeDv\u0014g%!ytHpNc6{N\u001c\u001a#-&\u001fwXl\" s";
        objectArray[71] = "g}\u0002\u0012r\u0013\"4\t\u0003\t^[p\rUk\net\u0001\rv";
        objectArray[72] = "; @![\u007f~iK0 7\u0007-OfBf9)C>_";
        objectArray[73] = "XW\u0010^\u001e/\u0015U\u000bHr*\u0004EaAJsS@\u001bO\u0014=\u0013)\bWN:R\u0019_KJ'h";
        objectArray[74] = ":a\u0003T;g4=\u0005\u0018_8U~PPd<6l\u0016\u0004>\u0003<tP\u0013e3khT\u000e_";
        objectArray[75] = ".In`Hsk\u0000eq3?\u0012\u00026'\b<q\u0010psR\u0003+\u0016lg\u000fgwDd$3";
        objectArray[76] = "\u000e&b\u007f\t!T#dux\u00004\u001eAN5[\u000e&b\u007f\t!T#du";
        objectArray[77] = "S\u0012*\u0013#\u000b]N,_G^<\ry\u0017|P_\u001f?C&o\u0003K,\u0016+\u0004A\u0004#\u0010G";
        objectArray[78] = "N/jh45\u000bfayOur\"e/-,L&iw0";
        objectArray[79] = "6Ap!/\u0004s\b{0TOZq)7n\u0016cO-;6\u000b";
        objectArray[80] = "<):))\u0015b*`q\u0013\u0010{^:'u\u0012\u0000}/rjK0*3vwq";
        objectArray[81] = "\u001e\u0005\u0000\u0016S.\u0005\u001e\t\u001105\u001d\u001a\u0015j\u000fs\r[\u0005\u0001M<\u0002]iU\r'_\f\u0002\u0017B(Y`";
        objectArray[82] = "\u000e,\b\u0012I9P/RJs0Kl\u0005\u0011\b]U)\\N\u001a'[w\u0012\u000es4C-\u0015OCc_)\bu";
        objectArray[83] = "bQ.\\<\u0017f]vAUB8_l_1D_\u0006)Z2\u0013;X*\u0000j)d\u0002{\u00041F%YoTU\u00144\u0000vWk\u00108Xk>";
        objectArray[84] = "R\u0001V\b\u0001&I\u001a_\u000fb=I\u0002?K_/\u0013\bT\t\u0010 \u0015d\u0000I\u000b}D\u000fB\u0006\u0004{(";
        objectArray[85] = ".\u001aPHVa'\u0000\u0013w\t\n3CRL\u0006i!\u0005\u0006\u001691p\u0010R\u0013Vp+\u0004\u0002w";
        objectArray[86] = "\u0012F* @`\u0016\u0014+$y~IJ!\u001a\u0010a\u0014Uw*G}\u0010HM";
        objectArray[87] = "WX\f&_.\u0012\u0011\u00077$ak\u0013Ta\u001fa\b\u0001\u00125E^R\u0007\u000e!\u0018:\u000eU\u0006b$";
        objectArray[88] = "Nup3nn\u000b<{\"\u0015&r>(t.!\u0011,n t\u001eK*r4)z\u0017xzw\u0015";
        objectArray[89] = "5\u0006r-XzpOy<#4\tM*j\u00185j_l>B\n0Yp*\u001fnl\u000bxi#";
        objectArray[90] = "\u0017L%d\u001c+R\u0005.ugd+A*#\u00052\u0015E&{\u0018";
        objectArray[91] = "5/$\u00125Wpf/\u0003N\u001b\t\"+U,N7&'\r1";
        objectArray[92] = "-q\u0017\u0000'\u0019$kT?sr0(\u0015\u0004w\u0011\"nA^H\u000b0uIE.\f;wR?";
        objectArray[93] = "f\u000b i\"+#B+xYbZ\u0006/.;2d\u0002#v&";
        Object[] objectArray2 = objectArray;
        objectArray[94] = "*H%zS\u0014o\u0001.k(T\u0016\u0003}=\u0013[u\u0011;iId/\u0017'}\u0014\u0000sE/>(";
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _4U.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f9' || c == '\u00c9' || c == 'j' || c == '\u00df') {
                field = _4U.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f9' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c9' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'j' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _4U.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ff' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 't' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x107C;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l3 = Thread.currentThread().threadId();
                objectArray = (Object[])d.get(l3);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/4U", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l2 >>> 56);
            for (int j = 1; j < 8; ++j) {
                byArray[j] = (byte)(l2 << j * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            _4U.c[n2] = _4U.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
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

    private static void void_0(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        double d3 = (Double)objectArray[2];
        double d4 = (Double)objectArray[3];
        double d5 = (Double)objectArray[4];
        long l2 = (Long)objectArray[5];
        double d6 = (Double)objectArray[6];
        _9n n = (_9n)objectArray[7];
        long l3 = (l2 = a ^ l2) ^ 0x54AD2792F9D8L;
        double d7 = d;
        double d8 = d2;
        String string = _4.cfr_renamed_3();
        for (int j = 1; j <= _4U.b("r", 1356, (long)(0x5026B30BC0F54383L ^ l2)); ++j) {
            double d9 = (double)j / 20.0;
            double d10 = 1.0 - d9;
            double d11 = d10 * d10 * d + 2.0 * d10 * d9 * d3 + d9 * d9 * d5;
            double d12 = d10 * d10 * d2 + 2.0 * d10 * d9 * d4 + d9 * d9 * d6;
            Object[] objectArray2 = new Object[6];
            objectArray2[5] = d12;
            objectArray2[4] = l3;
            objectArray2[3] = d11;
            objectArray2[2] = d8;
            objectArray2[1] = d7;
            objectArray2[0] = n;
            _4U.c("t", (Object)objectArray2, 642643420027180274L, (long)l2);
            d7 = d11;
            d8 = d12;
            if (string != null) continue;
        }
    }

    private static String java_lang_String_0(Object[] objectArray) {
        String string;
        block2: {
            String string2;
            block3: {
                String string3 = (String)objectArray[0];
                long l2 = (Long)objectArray[1];
                string2 = (String)objectArray[2];
                l2 = a ^ l2;
                String string4 = _4.cfr_renamed_3();
                try {
                    string = string3;
                    if (string4 == null) break block2;
                    if (string == null) break block3;
                }
                catch (NumberFormatException numberFormatException) {
                    throw _4U.a(numberFormatException);
                }
                string = string3;
                break block2;
            }
            string = string2;
        }
        return string;
    }

    private static void void_6(Object[] objectArray) {
        long l2;
        double d;
        long l3;
        double d2;
        double d3;
        double d4;
        _9n n;
        block6: {
            double d5;
            block5: {
                n = (_9n)objectArray[0];
                d4 = (Double)objectArray[1];
                d3 = (Double)objectArray[2];
                d2 = (Double)objectArray[3];
                l3 = (Long)objectArray[4];
                d = (Double)objectArray[5];
                l2 = (l3 = a ^ l3) ^ 0x27D2A1ADAC1AL;
                String string = _4.cfr_renamed_3();
                try {
                    try {
                        d5 = d4 == d2 ? 0 : (d4 > d2 ? 1 : -1);
                        if (string == null) break block5;
                        if (d5 != false) break block6;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw _4U.a(numberFormatException);
                    }
                    d5 = d3 == d ? 0 : (d3 > d ? 1 : -1);
                }
                catch (NumberFormatException numberFormatException) {
                    throw _4U.a(numberFormatException);
                }
            }
            if (d5 == false) {
                return;
            }
        }
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = d4;
        _4U.c("\u00ff", (Object)n, (Object)objectArray2, -547819683501703469L, (long)l3);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l2;
        objectArray3[0] = d3;
        _4U.c("\u00ff", (Object)n, (Object)objectArray3, -547819683501703469L, (long)l3);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l2;
        objectArray4[0] = d2;
        _4U.c("\u00ff", (Object)n, (Object)objectArray4, -547819683501703469L, (long)l3);
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l2;
        objectArray5[0] = d;
        _4U.c("\u00ff", (Object)n, (Object)objectArray5, -547819683501703469L, (long)l3);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static _06 dev_krypton_06_6(Object[] var0) {
        block66: {
            block65: {
                block63: {
                    block62: {
                        block60: {
                            block59: {
                                block53: {
                                    block58: {
                                        block57: {
                                            block56: {
                                                block54: {
                                                    block55: {
                                                        block52: {
                                                            block69: {
                                                                block50: {
                                                                    block51: {
                                                                        block68: {
                                                                            block49: {
                                                                                var2_1 = (Long)var0[0];
                                                                                var1_2 = (String)var0[1];
                                                                                v0 = var2_1 = _4U.a ^ var2_1;
                                                                                v1 = v0 ^ 27700113212821L;
                                                                                var4_3 = (int)(v1 >>> 48);
                                                                                var5_4 = (int)(v1 << 16 >>> 48);
                                                                                var6_5 = (int)(v1 << 32 >>> 32);
                                                                                var7_6 = v0 ^ 74477563037868L;
                                                                                var9_7 = v0 ^ 58116061969664L;
                                                                                var11_8 = v0 ^ 32361625820106L;
                                                                                var13_9 = v0 ^ 127412778336583L;
                                                                                var15_10 = v0 ^ 136681580883823L;
                                                                                var17_11 = v0 ^ 33920119174327L;
                                                                                var19_12 = v0 ^ 128454523084541L;
                                                                                var22_13 /* !! */  = 0.0;
                                                                                var24_14 /* !! */  = 0.0;
                                                                                var26_15 /* !! */  = 24.0;
                                                                                var28_16 /* !! */  = 24.0;
                                                                                var21_17 = _4.cfr_renamed_3();
                                                                                var30_18 = _4U.c("\u00ff", (Object)_4U.c("j", (long)8102969006623871048L, (long)var2_1), (Object)var1_2, (long)8101963276210893067L, (long)var2_1);
                                                                                try {
                                                                                    try {
                                                                                        v2 = var30_18;
                                                                                        if (var21_17 == null) break block49;
                                                                                        v3 /* !! */  = _4U.c("\u00ff", (Object)v2, (long)8104177374948520392L, (long)var2_1);
                                                                                        if (var2_1 < 0L) break block50;
                                                                                        if (v3 /* !! */  == false) break block51;
                                                                                    }
                                                                                    catch (NumberFormatException v4) {
                                                                                        throw _4U.a(v4);
                                                                                    }
                                                                                    v2 = var30_18;
                                                                                }
                                                                                catch (NumberFormatException v5) {
                                                                                    throw _4U.a(v5);
                                                                                }
                                                                            }
                                                                            v6 = _4U.c("\u00ff", (Object)_4U.c("\u00ff", (Object)v2, (int)1, (long)8100982754048095294L, (long)var2_1), (long)8102879915949020811L, (long)var2_1);
                                                                            v7 = var21_17;
                                                                            if (var2_1 < 0L) break block68;
                                                                            if (v7 == null) break block69;
                                                                            v7 = _4U.a("q", (int)31414, (long)(2813611632949205676L ^ var2_1));
                                                                        }
                                                                        var31_19 = _4U.c("\u00ff", (Object)v6, (Object)v7, (long)8102773886593484372L, (long)var2_1);
                                                                        v3 /* !! */  = (CallSite)((CallSite)var31_19).length;
                                                                        if (var2_1 < 0L) break block50;
                                                                        if (v3 /* !! */  >= 4) {
                                                                            var22_13 /* !! */  = (double)_4U.c("t", (Object)var31_19[0], (long)8100053304483012923L, (long)var2_1);
                                                                            var24_14 /* !! */  = (double)_4U.c("t", (Object)var31_19[1], (long)8100053304483012923L, (long)var2_1);
                                                                            var26_15 /* !! */  = (double)_4U.c("t", (Object)var31_19[2], (long)8100053304483012923L, (long)var2_1);
                                                                            var28_16 /* !! */  = (double)_4U.c("t", (Object)var31_19[3], (long)8100053304483012923L, (long)var2_1);
                                                                        }
                                                                    }
                                                                    v3 /* !! */  = (CallSite)21836;
                                                                }
                                                                v6 = _4U.a("q", (int)v3 /* !! */ , (long)(4722979401494639967L ^ var2_1));
                                                            }
                                                            var31_19 = v6;
                                                            var32_20 = null;
                                                            var33_21 = "1";
                                                            var34_22 = _4U.c("\u00ff", (Object)_4U.c("j", (long)8101193821265396384L, (long)var2_1), (Object)var1_2, (long)8101963276210893067L, (long)var2_1);
                                                            try {
                                                                try {
                                                                    v8 = var34_22;
                                                                    if (var21_17 == null) break block52;
                                                                    if (_4U.c("\u00ff", (Object)v8, (long)8104177374948520392L, (long)var2_1) == false) break block53;
                                                                }
                                                                catch (NumberFormatException v9) {
                                                                    throw _4U.a(v9);
                                                                }
                                                                v8 = var34_22;
                                                            }
                                                            catch (NumberFormatException v10) {
                                                                throw _4U.a(v10);
                                                            }
                                                        }
                                                        var35_23 = _4U.c("\u00ff", (Object)v8, (int)1, (long)8100982754048095294L, (long)var2_1);
                                                        v11 = new Object[3];
                                                        v11[2] = var15_10;
                                                        v11[1] = _4U.a("q", (int)30897, (long)(1935406194637510842L ^ var2_1));
                                                        v11[0] = var35_23;
                                                        var36_24 = _4U.c("t", (Object)v11, (long)8099742149865399845L, (long)var2_1);
                                                        try {
                                                            v12 = var36_24;
                                                            if (var21_17 == null) break block54;
                                                            if (v12 == null) break block55;
                                                        }
                                                        catch (NumberFormatException v13) {
                                                            throw _4U.a(v13);
                                                        }
                                                        var31_19 = var36_24;
                                                    }
                                                    v14 = new Object[3];
                                                    v14[2] = var15_10;
                                                    v14[1] = _4U.a("q", (int)25211, (long)(4826673422624653931L ^ var2_1));
                                                    v14[0] = var35_23;
                                                    v12 = _4U.c("t", (Object)v14, (long)8099742149865399845L, (long)var2_1);
                                                }
                                                var37_25 = v12;
                                                try {
                                                    v15 = var37_25;
                                                    if (var21_17 == null) break block56;
                                                    if (v15 == null) break block57;
                                                }
                                                catch (NumberFormatException v16) {
                                                    throw _4U.a(v16);
                                                }
                                                v15 = var37_25;
                                            }
                                            var32_20 = v15;
                                        }
                                        v17 = new Object[3];
                                        v17[2] = var15_10;
                                        v17[1] = _4U.a("q", (int)16383, (long)(2335336116253188075L ^ var2_1));
                                        v17[0] = var35_23;
                                        var38_26 = _4U.c("t", (Object)v17, (long)8099742149865399845L, (long)var2_1);
                                        try {
                                            v18 = var38_26;
                                            if (var21_17 == null) break block58;
                                            if (v18 == null) break block53;
                                        }
                                        catch (NumberFormatException v19) {
                                            throw _4U.a(v19);
                                        }
                                        v18 = var38_26;
                                    }
                                    var33_21 = v18;
                                }
                                var35_23 = new ArrayList<E>();
                                var36_24 = _4U.c("\u00ff", (Object)_4U.c("j", (long)8102485335962050310L, (long)var2_1), (Object)var1_2, (long)8101963276210893067L, (long)var2_1);
                                while (true) {
                                    block61: {
                                        try {
                                            if (_4U.c("\u00ff", (Object)var36_24, (long)8104177374948520392L, (long)var2_1) == false) break block59;
                                            v20 = var36_24;
                                            if (var2_1 < 0L || var21_17 == null) break block60;
                                        }
                                        catch (NumberFormatException v21) {
                                            throw _4U.a(v21);
                                        }
                                        var37_25 = _4U.c("\u00ff", (Object)v20, (int)1, (long)8100982754048095294L, (long)var2_1);
                                        v22 = new Object[3];
                                        v22[2] = var15_10;
                                        v22[1] = "d";
                                        v22[0] = var37_25;
                                        var38_26 = _4U.c("t", (Object)v22, (long)8099742149865399845L, (long)var2_1);
                                        try {
                                            v23 = var38_26;
                                            if (var2_1 < 0L || var21_17 == null) break block61;
                                            if (v23 == null) continue;
                                        }
                                        catch (NumberFormatException v24) {
                                            throw _4U.a(v24);
                                        }
                                        v23 = var38_26;
                                    }
                                    try {
                                        if (_4U.c("\u00ff", (Object)v23, (long)8102567093960999224L, (long)var2_1) != false) {
                                            continue;
                                        }
                                    }
                                    catch (NumberFormatException v25) {
                                        throw _4U.a(v25);
                                    }
                                    var39_27 = new _9n(var7_6);
                                    v26 = new Object[3];
                                    v26[2] = var39_27;
                                    v26[1] = var17_11;
                                    v26[0] = var38_26;
                                    _4U.c("t", (Object)v26, (long)8102683583877891119L, (long)var2_1);
                                    v27 = new Object[7];
                                    v27[6] = var39_27;
                                    v27[5] = var33_21;
                                    v27[4] = var11_8;
                                    v27[3] = var32_20;
                                    v27[2] = var31_19;
                                    v27[1] = var37_25;
                                    v27[0] = var35_23;
                                    _4U.c("t", (Object)v27, (long)8101490988584583261L, (long)var2_1);
                                    if (var2_1 > 0L && var21_17 == null) break;
                                }
                                _4w.cfr_renamed_8(new String[2]);
                            }
                            v20 = _4U.c("\u00ff", (Object)_4U.c("j", (long)8102893457007665077L, (long)var2_1), (Object)var1_2, (long)8101963276210893067L, (long)var2_1);
                        }
                        var37_25 = v20;
                        while (true) {
                            try {
                                if (_4U.c("\u00ff", (Object)var37_25, (long)8104177374948520392L, (long)var2_1) == false) break;
                                v28 = var37_25;
                                if (var2_1 < 0L || var21_17 == null) break block62;
                            }
                            catch (NumberFormatException v29) {
                                throw _4U.a(v29);
                            }
                            var38_26 = _4U.c("\u00ff", (Object)v28, (int)1, (long)8100982754048095294L, (long)var2_1);
                            v30 = new Object[3];
                            v30[2] = var15_10;
                            v30[1] = _4U.a("q", (int)1925, (long)(7177793213163562891L ^ var2_1));
                            v30[0] = var38_26;
                            v31 = new Object[3];
                            v31[2] = var19_12;
                            v31[1] = 0.0;
                            v31[0] = _4U.c("t", (Object)v30, (long)8099742149865399845L, (long)var2_1);
                            var39_28 = _4U.c("t", (Object)v31, (long)8100120468139306003L, (long)var2_1);
                            v32 = new Object[3];
                            v32[2] = var15_10;
                            v32[1] = _4U.a("q", (int)25830, (long)(8590833288816624865L ^ var2_1));
                            v32[0] = var38_26;
                            v33 = new Object[3];
                            v33[2] = var19_12;
                            v33[1] = 0.0;
                            v33[0] = _4U.c("t", (Object)v32, (long)8099742149865399845L, (long)var2_1);
                            var41_29 = _4U.c("t", (Object)v33, (long)8100120468139306003L, (long)var2_1);
                            v34 = new Object[3];
                            v34[2] = var15_10;
                            v34[1] = "r";
                            v34[0] = var38_26;
                            v35 = new Object[3];
                            v35[2] = var19_12;
                            v35[1] = 0.0;
                            v35[0] = _4U.c("t", (Object)v34, (long)8099742149865399845L, (long)var2_1);
                            var43_32 = _4U.c("t", (Object)v35, (long)8100120468139306003L, (long)var2_1);
                            try {
                                if (var43_32 <= 0.0) {
                                    continue;
                                }
                            }
                            catch (NumberFormatException v36) {
                                throw _4U.a(v36);
                            }
                            var45_33 = new _9n(var7_6);
                            v37 = new Object[6];
                            v37[5] = var45_33;
                            v37[4] = (double)var43_32;
                            v37[3] = (double)var43_32;
                            v37[2] = (double)var41_29;
                            v37[1] = var9_7;
                            v37[0] = (double)var39_28;
                            _4U.c("t", (Object)v37, (long)8104117778465919500L, (long)var2_1);
                            v38 = new Object[7];
                            v38[6] = var45_33;
                            v38[5] = var33_21;
                            v38[4] = var11_8;
                            v38[3] = var32_20;
                            v38[2] = var31_19;
                            v38[1] = var38_26;
                            v38[0] = var35_23;
                            _4U.c("t", (Object)v38, (long)8101490988584583261L, (long)var2_1);
                            if (var2_1 >= 0L && var21_17 == null) break;
                        }
                        v28 = _4U.c("\u00ff", (Object)_4U.c("j", (long)8102057380961294284L, (long)var2_1), (Object)var1_2, (long)8101963276210893067L, (long)var2_1);
                    }
                    var38_26 = v28;
                    while (true) {
                        block64: {
                            try {
                                if (_4U.c("\u00ff", (Object)var38_26, (long)8104177374948520392L, (long)var2_1) == false) break;
                                v39 = var38_26;
                                if (var2_1 <= 0L || var21_17 == null) break block63;
                            }
                            catch (NumberFormatException v40) {
                                throw _4U.a(v40);
                            }
                            var39_27 = _4U.c("\u00ff", (Object)v39, (int)1, (long)8100982754048095294L, (long)var2_1);
                            v41 = new Object[3];
                            v41[2] = var15_10;
                            v41[1] = _4U.a("q", (int)4306, (long)(635423656615080151L ^ var2_1));
                            v41[0] = var39_27;
                            v42 = new Object[3];
                            v42[2] = var19_12;
                            v42[1] = 0.0;
                            v42[0] = _4U.c("t", (Object)v41, (long)8099742149865399845L, (long)var2_1);
                            var40_35 = _4U.c("t", (Object)v42, (long)8100120468139306003L, (long)var2_1);
                            v43 = new Object[3];
                            v43[2] = var15_10;
                            v43[1] = _4U.a("q", (int)15116, (long)(132216700193528625L ^ var2_1));
                            v43[0] = var39_27;
                            v44 = new Object[3];
                            v44[2] = var19_12;
                            v44[1] = 0.0;
                            v44[0] = _4U.c("t", (Object)v43, (long)8099742149865399845L, (long)var2_1);
                            var42_38 = _4U.c("t", (Object)v44, (long)8100120468139306003L, (long)var2_1);
                            v45 = new Object[3];
                            v45[2] = var15_10;
                            v45[1] = _4U.a("q", (int)23832, (long)(76546935304928536L ^ var2_1));
                            v45[0] = var39_27;
                            v46 = new Object[3];
                            v46[2] = var19_12;
                            v46[1] = 0.0;
                            v46[0] = _4U.c("t", (Object)v45, (long)8099742149865399845L, (long)var2_1);
                            var44_40 = _4U.c("t", (Object)v46, (long)8100120468139306003L, (long)var2_1);
                            v47 = new Object[3];
                            v47[2] = var15_10;
                            v47[1] = _4U.a("q", (int)23803, (long)(5247744322253831398L ^ var2_1));
                            v47[0] = var39_27;
                            v48 = new Object[3];
                            v48[2] = var19_12;
                            v48[1] = 0.0;
                            v48[0] = _4U.c("t", (Object)v47, (long)8099742149865399845L, (long)var2_1);
                            var46_41 = _4U.c("t", (Object)v48, (long)8100120468139306003L, (long)var2_1);
                            try {
                                cfr_temp_0 = var44_40 - 0.0;
                                v49 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                if (var21_17 == null) break block64;
                                if (v49 <= 0) continue;
                            }
                            catch (NumberFormatException v50) {
                                throw _4U.a(v50);
                            }
                            cfr_temp_1 = var46_41 - 0.0;
                            v49 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                        }
                        if (v49 <= 0) continue;
                        var48_42 = new _9n(var7_6);
                        v51 = new Object[6];
                        v51[5] = var48_42;
                        v51[4] = (double)var46_41;
                        v51[3] = (double)var44_40;
                        v51[2] = (double)var42_38;
                        v51[1] = var9_7;
                        v51[0] = (double)var40_35;
                        _4U.c("t", (Object)v51, (long)8104117778465919500L, (long)var2_1);
                        v52 = new Object[7];
                        v52[6] = var48_42;
                        v52[5] = var33_21;
                        v52[4] = var11_8;
                        v52[3] = var32_20;
                        v52[2] = var31_19;
                        v52[1] = var39_27;
                        v52[0] = var35_23;
                        _4U.c("t", (Object)v52, (long)8101490988584583261L, (long)var2_1);
                        if (var2_1 > 0L && var21_17 == null) break;
                    }
                    v39 = var39_27 = _4U.c("\u00ff", (Object)_4U.c("j", (long)8103281030468272171L, (long)var2_1), (Object)var1_2, (long)8101963276210893067L, (long)var2_1);
                }
                while (_4U.c("\u00ff", (Object)var39_27, (long)8104177374948520392L, (long)var2_1) != false) {
                    v53 = var39_27;
                    if (var21_17 != null) {
                        var40_36 = _4U.c("\u00ff", (Object)v53, (int)1, (long)8100982754048095294L, (long)var2_1);
                        v54 = new Object[3];
                        v54[2] = var15_10;
                        v54[1] = _4U.a("q", (int)5451, (long)(6973252132115510613L ^ var2_1));
                        v54[0] = var40_36;
                        v55 = new Object[3];
                        v55[2] = var19_12;
                        v55[1] = 0.0;
                        v55[0] = _4U.c("t", (Object)v54, (long)8099742149865399845L, (long)var2_1);
                        var41_29 = _4U.c("t", (Object)v55, (long)8100120468139306003L, (long)var2_1);
                        v56 = new Object[3];
                        v56[2] = var15_10;
                        v56[1] = _4U.a("q", (int)6600, (long)(4183648331411323339L ^ var2_1));
                        v56[0] = var40_36;
                        v57 = new Object[3];
                        v57[2] = var19_12;
                        v57[1] = 0.0;
                        v57[0] = _4U.c("t", (Object)v56, (long)8099742149865399845L, (long)var2_1);
                        var43_32 = _4U.c("t", (Object)v57, (long)8100120468139306003L, (long)var2_1);
                        v58 = new Object[3];
                        v58[2] = var15_10;
                        v58[1] = _4U.a("q", (int)24811, (long)(2163564360547401956L ^ var2_1));
                        v58[0] = var40_36;
                        v59 = new Object[3];
                        v59[2] = var19_12;
                        v59[1] = 0.0;
                        v59[0] = _4U.c("t", (Object)v58, (long)8099742149865399845L, (long)var2_1);
                        var45_34 = _4U.c("t", (Object)v59, (long)8100120468139306003L, (long)var2_1);
                        v60 = new Object[3];
                        v60[2] = var15_10;
                        v60[1] = _4U.a("q", (int)5416, (long)(6708724677768770836L ^ var2_1));
                        v60[0] = var40_36;
                        v61 = new Object[3];
                        v61[2] = var19_12;
                        v61[1] = 0.0;
                        v61[0] = _4U.c("t", (Object)v60, (long)8099742149865399845L, (long)var2_1);
                        var47_44 = _4U.c("t", (Object)v61, (long)8100120468139306003L, (long)var2_1);
                        var49_45 = new _9n(var7_6);
                        v62 = new Object[6];
                        v62[5] = (double)var47_44;
                        v62[4] = var13_9;
                        v62[3] = (double)var45_34;
                        v62[2] = (double)var43_32;
                        v62[1] = (double)var41_29;
                        v62[0] = var49_45;
                        _4U.c("t", (Object)v62, (long)8103109900059552877L, (long)var2_1);
                        v63 = new Object[7];
                        v63[6] = var49_45;
                        v63[5] = var33_21;
                        v63[4] = var11_8;
                        v63[3] = var32_20;
                        v63[2] = var31_19;
                        v63[1] = var40_36;
                        v63[0] = var35_23;
                        _4U.c("t", (Object)v63, (long)8101490988584583261L, (long)var2_1);
                        if (var21_17 != null) continue;
                    }
                    break block65;
                }
                v53 = _4U.c("\u00ff", (Object)_4U.c("j", (long)8101448654660167644L, (long)var2_1), (Object)var1_2, (long)8101963276210893067L, (long)var2_1);
            }
            var40_37 = v53;
            while (true) {
                block67: {
                    try {
                        if (_4U.c("\u00ff", (Object)var40_37, (long)8104177374948520392L, (long)var2_1) == false) break;
                        v64 = var40_37;
                        if (var2_1 < 0L || var21_17 == null) break block66;
                    }
                    catch (NumberFormatException v65) {
                        throw _4U.a(v65);
                    }
                    var41_30 = _4U.c("\u00ff", (Object)v64, (int)1, (long)8100982754048095294L, (long)var2_1);
                    v66 = new Object[3];
                    v66[2] = var15_10;
                    v66[1] = "x";
                    v66[0] = var41_30;
                    v67 = new Object[3];
                    v67[2] = var19_12;
                    v67[1] = 0.0;
                    v67[0] = _4U.c("t", (Object)v66, (long)8099742149865399845L, (long)var2_1);
                    var42_38 = _4U.c("t", (Object)v67, (long)8100120468139306003L, (long)var2_1);
                    v68 = new Object[3];
                    v68[2] = var15_10;
                    v68[1] = "y";
                    v68[0] = var41_30;
                    v69 = new Object[3];
                    v69[2] = var19_12;
                    v69[1] = 0.0;
                    v69[0] = _4U.c("t", (Object)v68, (long)8099742149865399845L, (long)var2_1);
                    var44_40 = _4U.c("t", (Object)v69, (long)8100120468139306003L, (long)var2_1);
                    v70 = new Object[3];
                    v70[2] = var15_10;
                    v70[1] = _4U.a("q", (int)27814, (long)(6213898878915153067L ^ var2_1));
                    v70[0] = var41_30;
                    v71 = new Object[3];
                    v71[2] = var19_12;
                    v71[1] = 0.0;
                    v71[0] = _4U.c("t", (Object)v70, (long)8099742149865399845L, (long)var2_1);
                    var46_41 = _4U.c("t", (Object)v71, (long)8100120468139306003L, (long)var2_1);
                    v72 = new Object[3];
                    v72[2] = var15_10;
                    v72[1] = _4U.a("q", (int)22377, (long)(2740343390798034805L ^ var2_1));
                    v72[0] = var41_30;
                    v73 = new Object[3];
                    v73[2] = var19_12;
                    v73[1] = 0.0;
                    v73[0] = _4U.c("t", (Object)v72, (long)8099742149865399845L, (long)var2_1);
                    var48_43 = _4U.c("t", (Object)v73, (long)8100120468139306003L, (long)var2_1);
                    try {
                        cfr_temp_2 = var46_41 - 0.0;
                        v74 = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 < 0 ? -1 : 1);
                        if (var21_17 == null) break block67;
                        if (v74 <= 0) continue;
                    }
                    catch (NumberFormatException v75) {
                        throw _4U.a(v75);
                    }
                    cfr_temp_3 = var48_43 - 0.0;
                    v74 = cfr_temp_3 == 0 ? 0 : (cfr_temp_3 < 0 ? -1 : 1);
                }
                if (v74 <= 0) continue;
                var50_46 = new _9n(var7_6);
                v76 = new Object[6];
                v76[5] = (double)var44_40;
                v76[4] = var13_9;
                v76[3] = (double)(var42_38 + var46_41);
                v76[2] = (double)var44_40;
                v76[1] = (double)var42_38;
                v76[0] = var50_46;
                _4U.c("t", (Object)v76, (long)8103109900059552877L, (long)var2_1);
                v77 = new Object[6];
                v77[5] = (double)(var44_40 + var48_43);
                v77[4] = var13_9;
                v77[3] = (double)(var42_38 + var46_41);
                v77[2] = (double)var44_40;
                v77[1] = (double)(var42_38 + var46_41);
                v77[0] = var50_46;
                _4U.c("t", (Object)v77, (long)8103109900059552877L, (long)var2_1);
                v78 = new Object[6];
                v78[5] = (double)(var44_40 + var48_43);
                v78[4] = var13_9;
                v78[3] = (double)var42_38;
                v78[2] = (double)(var44_40 + var48_43);
                v78[1] = (double)(var42_38 + var46_41);
                v78[0] = var50_46;
                _4U.c("t", (Object)v78, (long)8103109900059552877L, (long)var2_1);
                v79 = new Object[6];
                v79[5] = (double)var44_40;
                v79[4] = var13_9;
                v79[3] = (double)var42_38;
                v79[2] = (double)(var44_40 + var48_43);
                v79[1] = (double)var42_38;
                v79[0] = var50_46;
                _4U.c("t", (Object)v79, (long)8103109900059552877L, (long)var2_1);
                v80 = new Object[7];
                v80[6] = var50_46;
                v80[5] = var33_21;
                v80[4] = var11_8;
                v80[3] = var32_20;
                v80[2] = var31_19;
                v80[1] = var41_30;
                v80[0] = var35_23;
                _4U.c("t", (Object)v80, (long)8101490988584583261L, (long)var2_1);
                if (var2_1 > 0L && var21_17 == null) break;
            }
            v64 = var41_31 = _4U.c("\u00ff", (Object)_4U.c("j", (long)8103419273247080577L, (long)var2_1), (Object)var1_2, (long)8101963276210893067L, (long)var2_1);
        }
        while (_4U.c("\u00ff", (Object)var41_31, (long)8104177374948520392L, (long)var2_1) != false) {
            v81 = new Object[9];
            v81[8] = var6_5;
            v81[7] = var33_21;
            v81[6] = var32_20;
            v81[5] = var31_19;
            v81[4] = (int)((short)var5_4);
            v81[3] = false;
            v81[2] = _4U.c("\u00ff", (Object)var41_31, (int)1, (long)8100982754048095294L, (long)var2_1);
            v81[1] = var35_23;
            v81[0] = (int)((char)var4_3);
            _4U.c("t", (Object)v81, (long)8103644413734311675L, (long)var2_1);
lbl591:
            // 2 sources

            ** while (var21_17 == null)
lbl592:
            // 1 sources

        }
lbl593:
        // 2 sources

        if (var2_1 <= 0L) ** GOTO lbl591
        var42_39 = _4U.c("\u00ff", (Object)_4U.c("j", (long)8103318890367925407L, (long)var2_1), (Object)var1_2, (long)8101963276210893067L, (long)var2_1);
        while (_4U.c("\u00ff", (Object)var42_39, (long)8104177374948520392L, (long)var2_1) != false) {
            v82 = new Object[9];
            v82[8] = var6_5;
            v82[7] = var33_21;
            v82[6] = var32_20;
            v82[5] = var31_19;
            v82[4] = (int)((short)var5_4);
            v82[3] = true;
            v82[2] = _4U.c("\u00ff", (Object)var42_39, (int)1, (long)8100982754048095294L, (long)var2_1);
            v82[1] = var35_23;
            v82[0] = (int)((char)var4_3);
            _4U.c("t", (Object)v82, (long)8103644413734311675L, (long)var2_1);
lbl607:
            // 2 sources

            ** while (var21_17 == null)
lbl608:
            // 1 sources

        }
lbl609:
        // 2 sources

        if (var2_1 < 0L) ** GOTO lbl607
        return new _06(var22_13 /* !! */ , var24_14 /* !! */ , var26_15 /* !! */ , var28_16 /* !! */ , (_04[])_4U.c("\u00ff", (Object)var35_23, (Object)new _04[0], (long)8101225922157341360L, (long)var2_1));
    }

    private static void void_2(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        long l2 = (Long)objectArray[2];
        double d3 = (Double)objectArray[3];
        double d4 = (Double)objectArray[4];
        double d5 = (Double)objectArray[5];
        double d6 = (Double)objectArray[6];
        double d7 = (Double)objectArray[7];
        double d8 = (Double)objectArray[8];
        _9n n = (_9n)objectArray[9];
        long l3 = (l2 = a ^ l2) ^ 0x2EA961B4041CL;
        double d9 = d;
        double d10 = d2;
        String string = _4.cfr_renamed_3();
        for (int j = 1; j <= _4U.b("r", 21162, (long)(0x79D67FEAF0DD69A4L ^ l2)); ++j) {
            double d11 = (double)j / 32.0;
            double d12 = 1.0 - d11;
            double d13 = d12 * d12;
            double d14 = d11 * d11;
            double d15 = d13 * d12 * d + 3.0 * d13 * d11 * d3 + 3.0 * d12 * d14 * d5 + d14 * d11 * d7;
            double d16 = d13 * d12 * d2 + 3.0 * d13 * d11 * d4 + 3.0 * d12 * d14 * d6 + d14 * d11 * d8;
            Object[] objectArray2 = new Object[6];
            objectArray2[5] = d16;
            objectArray2[4] = l3;
            objectArray2[3] = d15;
            objectArray2[2] = d10;
            objectArray2[1] = d9;
            objectArray2[0] = n;
            _4U.c("t", (Object)objectArray2, -779304372490163914L, (long)l2);
            d9 = d15;
            d10 = d16;
            if (string != null) continue;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static double double_2(Object[] var0) {
        block22: {
            block23: {
                block21: {
                    block24: {
                        block20: {
                            block19: {
                                block17: {
                                    block18: {
                                        var1_1 = (Double)var0[0];
                                        var3_2 = (Double)var0[1];
                                        var5_3 = (Double)var0[2];
                                        var7_4 = (Long)var0[3];
                                        var9_5 = (Double)var0[4];
                                        var7_4 = _4U.a ^ var7_4;
                                        var12_6 = var1_1 * var5_3 + var3_2 * var9_5;
                                        var14_7 = _4U.c("t", (double)((var1_1 * var1_1 + var3_2 * var3_2) * (var5_3 * var5_3 + var9_5 * var9_5)), (long)3262054078288562701L, (long)var7_4);
                                        var11_8 = _4.cfr_renamed_3();
                                        try {
                                            try {
                                                v0 /* !! */  = var14_7;
                                                v1 /* !! */  = 1.0E-12;
                                                if (var11_8 == null) break block17;
                                                if (!(v0 /* !! */  < v1 /* !! */ )) break block18;
                                            }
                                            catch (NumberFormatException v2) {
                                                throw _4U.a(v2);
                                            }
                                            return 0.0;
                                        }
                                        catch (NumberFormatException v3) {
                                            throw _4U.a(v3);
                                        }
                                    }
                                    v0 /* !! */  = (CallSite)var12_6;
                                    v1 /* !! */  = (double)var14_7;
                                }
                                var16_9 = v0 /* !! */  / v1 /* !! */ ;
                                try {
                                    cfr_temp_0 = var16_9 - -1.0;
                                    v4 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                    if (var11_8 == null) break block19;
                                    if (v4 < 0) {
                                    }
                                    ** GOTO lbl43
                                }
                                catch (NumberFormatException v5) {
                                    throw _4U.a(v5);
                                }
                                v6 /* !! */  = (reference)-1.0;
                                if (var7_4 <= 0L) break block24;
                                var16_9 = v6 /* !! */ ;
                                try {
                                    try {
                                        if (var11_8 != null) break block20;
lbl43:
                                        // 2 sources

                                        v7 = var16_9;
                                        if (var11_8 == null) break block21;
                                    }
                                    catch (NumberFormatException v8) {
                                        throw _4U.a(v8);
                                    }
                                    cfr_temp_1 = v7 - 1.0;
                                    v4 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 > 0 ? 1 : -1);
                                }
                                catch (NumberFormatException v9) {
                                    throw _4U.a(v9);
                                }
                            }
                            if (v4 > 0) {
                                var16_9 = (reference)1.0;
                            }
                        }
                        v6 /* !! */  = var16_9;
                    }
                    v7 = _4U.c("t", (double)v6 /* !! */ , (long)3269271029926652278L, (long)var7_4);
                }
                var18_10 = v7;
                try {
                    try {
                        v10 /* !! */  = var1_1 * var9_5;
                        v11 = var3_2 * var5_3;
                        if (var7_4 > 0L) {
                            v10 /* !! */  = v10 /* !! */  - v11;
                            if (var11_8 == null) break block22;
                            v11 = 0.0;
                        }
                        if (!(v10 /* !! */  < v11)) break block23;
                    }
                    catch (NumberFormatException v12) {
                        throw _4U.a(v12);
                    }
                    v10 /* !! */  = (double)(-var18_10);
                    break block22;
                }
                catch (NumberFormatException v13) {
                    throw _4U.a(v13);
                }
            }
            v10 /* !! */  = (double)var18_10;
        }
        return v10 /* !! */ ;
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static double double_3(Object[] objectArray) {
        Object object;
        long l2;
        double d;
        String string;
        block6: {
            string = (String)objectArray[0];
            d = (Double)objectArray[1];
            l2 = (Long)objectArray[2];
            l2 = a ^ l2;
            String string2 = _4.cfr_renamed_3();
            object = string;
            if (string2 == null) return (double)_4U.c("t", (Object)object, -6351957201129458037L, (long)l2);
            try {
                if (object != null) break block6;
                return d;
                catch (NumberFormatException numberFormatException) {
                    throw _4U.a(numberFormatException);
                }
            }
            catch (NumberFormatException numberFormatException) {
                throw _4U.a(numberFormatException);
            }
        }
        try {
            object = _4U.c("\u00ff", string, -6358153180067921605L, (long)l2);
            return (double)_4U.c("t", (Object)object, -6351957201129458037L, (long)l2);
        }
        catch (NumberFormatException numberFormatException) {
            return d;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void void_3(Object[] var0) {
        block44: {
            block45: {
                block42: {
                    block43: {
                        block41: {
                            block40: {
                                block38: {
                                    block39: {
                                        block37: {
                                            block36: {
                                                block34: {
                                                    block35: {
                                                        block33: {
                                                            var3_1 = (List)var0[0];
                                                            var1_2 = (String)var0[1];
                                                            var5_3 = (String)var0[2];
                                                            var8_4 = (String)var0[3];
                                                            var6_5 = (Long)var0[4];
                                                            var4_6 = (String)var0[5];
                                                            var2_7 = (_9n)var0[6];
                                                            v0 = var6_5 = _4U.a ^ var6_5;
                                                            var9_8 = v0 ^ 20874749436654L;
                                                            var11_9 = v0 ^ 53893700632476L;
                                                            var13_10 = v0 ^ 88497012877042L;
                                                            var15_11 = v0 ^ 121984274103784L;
                                                            var17_12 = v0 ^ 112606030843002L;
                                                            var19_13 = _4.cfr_renamed_3();
                                                            try {
                                                                v1 = new Object[1];
                                                                v1[0] = var13_10;
                                                                if (_4U.c("\u00ff", (Object)var2_7, (Object)v1, (long)7129223667969064426L, (long)var6_5) == false) {
                                                                    return;
                                                                }
                                                            }
                                                            catch (NumberFormatException v2) {
                                                                throw _4U.a(v2);
                                                            }
                                                            v3 = new Object[3];
                                                            v3[2] = var15_11;
                                                            v3[1] = _4U.a("q", (int)19236, (long)(1569167996854417846L ^ var6_5));
                                                            v3[0] = var1_2;
                                                            v4 = new Object[3];
                                                            v4[2] = var5_3;
                                                            v4[1] = var9_8;
                                                            v4[0] = _4U.c("t", (Object)v3, (long)7128919123869594786L, (long)var6_5);
                                                            var20_14 = _4U.c("t", (Object)v4, (long)7130735437950479206L, (long)var6_5);
                                                            v5 = new Object[3];
                                                            v5[2] = var15_11;
                                                            v5[1] = _4U.a("q", (int)9591, (long)(8868441271238940660L ^ var6_5));
                                                            v5[0] = var1_2;
                                                            v6 = new Object[3];
                                                            v6[2] = var8_4;
                                                            v6[1] = var9_8;
                                                            v6[0] = _4U.c("t", (Object)v5, (long)7128919123869594786L, (long)var6_5);
                                                            var21_15 = _4U.c("t", (Object)v6, (long)7130735437950479206L, (long)var6_5);
                                                            v7 = new Object[3];
                                                            v7[2] = var15_11;
                                                            v7[1] = _4U.a("q", (int)22805, (long)(6963868596128951178L ^ var6_5));
                                                            v7[0] = var1_2;
                                                            v8 = new Object[3];
                                                            v8[2] = var4_6;
                                                            v8[1] = var9_8;
                                                            v8[0] = _4U.c("t", (Object)v7, (long)7128919123869594786L, (long)var6_5);
                                                            var22_16 = _4U.c("t", (Object)v8, (long)7130735437950479206L, (long)var6_5);
                                                            try {
                                                                v9 = var20_14;
                                                                v10 = var19_13;
                                                                if (var6_5 >= 0L) {
                                                                    if (v10 == null) break block33;
                                                                    if (v9 == null) break block34;
                                                                }
                                                                ** GOTO lbl74
                                                            }
                                                            catch (NumberFormatException v11) {
                                                                throw _4U.a(v11);
                                                            }
                                                            v9 = var20_14;
                                                        }
                                                        try {
                                                            try {
                                                                v10 = _4U.a("q", (int)11912, (long)(6252712056960769073L ^ var6_5));
lbl74:
                                                                // 2 sources

                                                                v12 /* !! */  = _4U.c("\u00ff", (Object)v9, (Object)v10, (long)7129702143766884507L, (long)var6_5);
                                                                v13 = var19_13;
                                                                if (var6_5 > 0L) {
                                                                    if (v13 == null) break block35;
                                                                    if (v12 /* !! */ ) break block34;
                                                                }
                                                                ** GOTO lbl90
                                                            }
                                                            catch (NumberFormatException v14) {
                                                                throw _4U.a(v14);
                                                            }
                                                            v12 /* !! */  = _4U.c("\u00ff", (Object)var20_14, (long)7129576661967832005L, (long)var6_5);
                                                        }
                                                        catch (NumberFormatException v15) {
                                                            throw _4U.a(v15);
                                                        }
                                                    }
                                                    try {
                                                        v13 = var19_13;
lbl90:
                                                        // 2 sources

                                                        if (v13 == null) break block36;
                                                        if (v12 /* !! */ ) break block34;
                                                    }
                                                    catch (NumberFormatException v16) {
                                                        throw _4U.a(v16);
                                                    }
                                                    v12 /* !! */  = true;
                                                    break block36;
                                                }
                                                v12 /* !! */  = false;
                                            }
                                            var23_17 /* !! */  = v12 /* !! */ ;
                                            try {
                                                v17 = var21_15;
                                                v18 = var19_13;
                                                if (var6_5 > 0L) {
                                                    if (v18 == null) break block37;
                                                    if (v17 == null) break block38;
                                                }
                                                ** GOTO lbl116
                                            }
                                            catch (NumberFormatException v19) {
                                                throw _4U.a(v19);
                                            }
                                            v17 = var21_15;
                                        }
                                        try {
                                            try {
                                                v18 = _4U.a("q", (int)11067, (long)(4320391185449998762L ^ var6_5));
lbl116:
                                                // 2 sources

                                                v20 /* !! */  = _4U.c("\u00ff", (Object)v17, (Object)v18, (long)7129702143766884507L, (long)var6_5);
                                                v21 = var19_13;
                                                if (var6_5 > 0L) {
                                                    if (v21 == null) break block39;
                                                    if (v20 /* !! */ ) break block38;
                                                }
                                                ** GOTO lbl132
                                            }
                                            catch (NumberFormatException v22) {
                                                throw _4U.a(v22);
                                            }
                                            v20 /* !! */  = _4U.c("\u00ff", (Object)var21_15, (long)7129576661967832005L, (long)var6_5);
                                        }
                                        catch (NumberFormatException v23) {
                                            throw _4U.a(v23);
                                        }
                                    }
                                    try {
                                        v21 = var19_13;
lbl132:
                                        // 2 sources

                                        if (v21 == null) break block40;
                                        if (v20 /* !! */ ) break block38;
                                    }
                                    catch (NumberFormatException v24) {
                                        throw _4U.a(v24);
                                    }
                                    v20 /* !! */  = true;
                                    break block40;
                                }
                                v20 /* !! */  = false;
                            }
                            var24_18 /* !! */  = v20 /* !! */ ;
                            try {
                                v25 /* !! */  = var23_17 /* !! */ ;
                                v26 = var19_13;
                                if (var6_5 >= 0L) {
                                    if (v26 == null) break block41;
                                    if (v25 /* !! */ ) break block42;
                                }
                                ** GOTO lbl157
                            }
                            catch (NumberFormatException v27) {
                                throw _4U.a(v27);
                            }
                            v25 /* !! */  = var24_18 /* !! */ ;
                        }
                        try {
                            v26 = var19_13;
lbl157:
                            // 2 sources

                            if (v26 == null) break block43;
                            if (v25 /* !! */ ) break block42;
                        }
                        catch (NumberFormatException v28) {
                            throw _4U.a(v28);
                        }
                        v25 /* !! */  = true;
                    }
                    var23_17 /* !! */  = v25 /* !! */ ;
                }
                v29 = new Object[1];
                v29[0] = var11_9;
                var25_19 = _4U.c("\u00ff", (Object)var2_7, (Object)v29, (long)7129869643642396246L, (long)var6_5);
                v30 = new Object[1];
                v30[0] = var13_10;
                var26_20 = _4U.c("\u00ff", (Object)var2_7, (Object)v30, (long)7129223667969064426L, (long)var6_5) / 4;
                try {
                    try {
                        v31 /* !! */  = var23_17 /* !! */ ;
                        if (var19_13 == null) break block44;
                        if (!v31 /* !! */ ) break block45;
                    }
                    catch (NumberFormatException v32) {
                        throw _4U.a(v32);
                    }
                    _4U.c("\u00ff", (Object)var3_1, (Object)new _04((_8o)_4U.c("j", (long)7129111725511236416L, (long)var6_5), 0.0, (double[])var25_19, (int)var26_20), (long)7131219378499380924L, (long)var6_5);
                }
                catch (NumberFormatException v33) {
                    throw _4U.a(v33);
                }
            }
            v31 /* !! */  = var24_18 /* !! */ ;
        }
        if (v31 /* !! */ ) {
            v34 = new Object[3];
            v34[2] = var17_12;
            v34[1] = 1.0;
            v34[0] = var22_16;
            var27_21 = _4U.c("t", (Object)v34, (long)7128769504763477652L, (long)var6_5);
            _4U.c("\u00ff", (Object)var3_1, (Object)new _04((_8o)_4U.c("j", (long)7130994293658285673L, (long)var6_5), (double)var27_21, (double[])var25_19, (int)var26_20), (long)7131219378499380924L, (long)var6_5);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void cfr_renamed_7(Object[] var0) {
        block56: {
            block55: {
                block53: {
                    block54: {
                        block51: {
                            block52: {
                                block48: {
                                    block49: {
                                        block50: {
                                            block46: {
                                                block47: {
                                                    block44: {
                                                        block45: {
                                                            block43: {
                                                                block41: {
                                                                    block42: {
                                                                        var1_1 = (Double)var0[0];
                                                                        var3_2 = (Double)var0[1];
                                                                        var5_3 = (Double)var0[2];
                                                                        var7_4 = (Double)var0[3];
                                                                        var9_5 = (Double)var0[4];
                                                                        var19_6 = (Boolean)var0[5];
                                                                        var17_7 = (Boolean)var0[6];
                                                                        var11_8 = (Long)var0[7];
                                                                        var13_9 = (Double)var0[8];
                                                                        var15_10 = (Double)var0[9];
                                                                        var18_11 = (_9n)var0[10];
                                                                        v0 = var11_8 = _4U.a ^ var11_8;
                                                                        var20_12 = v0 ^ 47766051237318L;
                                                                        var22_13 = v0 ^ 79441469438207L;
                                                                        var24_14 = v0 ^ 115696928486830L;
                                                                        var26_15 = _4.cfr_renamed_3();
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    v1 = var1_1 == var13_9 ? 0 : (var1_1 > var13_9 ? 1 : -1);
                                                                                    if (var26_15 == null) break block41;
                                                                                    if (v1 != false) break block42;
                                                                                }
                                                                                catch (NumberFormatException v2) {
                                                                                    throw _4U.a(v2);
                                                                                }
                                                                                v1 = var3_2 == var15_10 ? 0 : (var3_2 > var15_10 ? 1 : -1);
                                                                                v3 = var26_15;
                                                                                if (var11_8 > 0L) {
                                                                                    if (v3 == null) break block41;
                                                                                }
                                                                                ** GOTO lbl49
                                                                            }
                                                                            catch (NumberFormatException v4) {
                                                                                throw _4U.a(v4);
                                                                            }
                                                                            if (v1 != false) break block42;
                                                                        }
                                                                        catch (NumberFormatException v5) {
                                                                            throw _4U.a(v5);
                                                                        }
                                                                        return;
                                                                    }
                                                                    v1 = (cfr_temp_0 = var5_3 - 0.0) == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (var11_8 < 0L) break block43;
                                                                            v3 = var26_15;
lbl49:
                                                                            // 2 sources

                                                                            if (v3 == null) break block43;
                                                                            if (v1 != false) {
                                                                            }
                                                                            ** GOTO lbl68
                                                                        }
                                                                        catch (NumberFormatException v6) {
                                                                            throw _4U.a(v6);
                                                                        }
                                                                        v7 = var7_4;
                                                                        if (var26_15 == null) break block44;
                                                                    }
                                                                    catch (NumberFormatException v8) {
                                                                        throw _4U.a(v8);
                                                                    }
                                                                    cfr_temp_1 = v7 - 0.0;
                                                                    v1 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                                                                }
                                                                catch (NumberFormatException v9) {
                                                                    throw _4U.a(v9);
                                                                }
                                                            }
                                                            try {
                                                                if (v1 != false) break block45;
lbl68:
                                                                // 2 sources

                                                                v10 = new Object[6];
                                                                v10[5] = var15_10;
                                                                v10[4] = var22_13;
                                                                v10[3] = var13_9;
                                                                v10[2] = var3_2;
                                                                v10[1] = var1_1;
                                                                v10[0] = var18_11;
                                                                _4U.c("t", (Object)v10, (long)706005368265004501L, (long)var11_8);
                                                                return;
                                                            }
                                                            catch (NumberFormatException v11) {
                                                                throw _4U.a(v11);
                                                            }
                                                        }
                                                        var5_3 = (double)_4U.c("t", (double)var5_3, (long)707588168802737387L, (long)var11_8);
                                                        var7_4 = (double)_4U.c("t", (double)var7_4, (long)707588168802737387L, (long)var11_8);
                                                        v7 = (double)_4U.c("t", (double)var9_5, (long)709085622630069894L, (long)var11_8);
                                                    }
                                                    var27_16 = v7;
                                                    var29_17 = _4U.c("t", (double)var27_16, (long)705883393029371676L, (long)var11_8);
                                                    var31_18 = _4U.c("t", (double)var27_16, (long)706900524507254571L, (long)var11_8);
                                                    var33_19 = (var1_1 - var13_9) / 2.0;
                                                    var35_20 = (var3_2 - var15_10) / 2.0;
                                                    var37_21 = var29_17 * var33_19 + var31_18 * var35_20;
                                                    var39_22 = -var31_18 * var33_19 + var29_17 * var35_20;
                                                    var41_23 = var5_3 * var5_3;
                                                    var43_24 = var7_4 * var7_4;
                                                    var45_25 = var37_21 * var37_21;
                                                    var47_26 = var39_22 * var39_22;
                                                    var49_27 = var45_25 / var41_23 + var47_26 / var43_24;
                                                    try {
                                                        cfr_temp_2 = var49_27 - 1.0;
                                                        v12 /* !! */  = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 > 0 ? 1 : -1);
                                                        if (var11_8 <= 0L || var26_15 == null) break block46;
                                                        if (v12 /* !! */  <= 0) break block47;
                                                    }
                                                    catch (NumberFormatException v13) {
                                                        throw _4U.a(v13);
                                                    }
                                                    var51_28 /* !! */  = (double)_4U.c("t", (double)var49_27, (long)706502496678522502L, (long)var11_8);
                                                    var41_23 = (var5_3 *= var51_28 /* !! */ ) * var5_3;
                                                    var43_24 = (var7_4 *= var51_28 /* !! */ ) * var7_4;
                                                }
                                                v12 /* !! */  = (reference)var19_6;
                                            }
                                            try {
                                                v14 = v12 /* !! */  == var17_7 ? -1.0 : 1.0;
                                            }
                                            catch (NumberFormatException v15) {
                                                throw _4U.a(v15);
                                            }
                                            var51_28 /* !! */  = v14;
                                            var53_29 = (var41_23 * var43_24 - var41_23 * var47_26 - var43_24 * var45_25) / (var41_23 * var47_26 + var43_24 * var45_25);
                                            try {
                                                v16 = var53_29;
                                                if (var11_8 <= 0L) break block48;
                                                v17 /* !! */  = 0.0;
                                                if (var26_15 == null) break block49;
                                                if (!(v16 < v17 /* !! */ )) break block50;
                                            }
                                            catch (NumberFormatException v18) {
                                                throw _4U.a(v18);
                                            }
                                            var53_29 = 0.0;
                                        }
                                        v19 /* !! */  = var51_28 /* !! */ ;
                                        v17 /* !! */  = (double)_4U.c("t", (double)var53_29, (long)706502496678522502L, (long)var11_8);
                                    }
                                    v16 = v19 /* !! */  * v17 /* !! */ ;
                                }
                                var55_30 = v16;
                                var57_31 = var55_30 * (var5_3 * var39_22) / var7_4;
                                var59_32 = var55_30 * (-var7_4 * var37_21) / var5_3;
                                var61_33 = var29_17 * var57_31 - var31_18 * var59_32 + (var1_1 + var13_9) / 2.0;
                                var63_34 = var31_18 * var57_31 + var29_17 * var59_32 + (var3_2 + var15_10) / 2.0;
                                var65_35 = (var37_21 - var57_31) / var5_3;
                                var67_36 = (var39_22 - var59_32) / var7_4;
                                var69_37 = (-var37_21 - var57_31) / var5_3;
                                var71_38 = (-var39_22 - var59_32) / var7_4;
                                v20 = new Object[5];
                                v20[4] = (double)var67_36;
                                v20[3] = var20_12;
                                v20[2] = (double)var65_35;
                                v20[1] = 0.0;
                                v20[0] = 1.0;
                                var73_39 = _4U.c("t", (Object)v20, (long)708940153755812009L, (long)var11_8);
                                v21 = new Object[5];
                                v21[4] = (double)var71_38;
                                v21[3] = var20_12;
                                v21[2] = (double)var69_37;
                                v21[1] = (double)var67_36;
                                v21[0] = (double)var65_35;
                                var75_40 = _4U.c("t", (Object)v21, (long)708940153755812009L, (long)var11_8);
                                try {
                                    try {
                                        try {
                                            v22 = var17_7;
                                            if (var26_15 == null) break block51;
                                            if (v22 != false) break block52;
                                        }
                                        catch (NumberFormatException v23) {
                                            throw _4U.a(v23);
                                        }
                                        cfr_temp_3 = var75_40 - 0.0;
                                        v22 = cfr_temp_3 == 0 ? 0 : (cfr_temp_3 > 0 ? 1 : -1);
                                        v24 = var26_15;
                                        if (var11_8 >= 0L) {
                                            if (v24 == null) break block51;
                                        }
                                        ** GOTO lbl200
                                    }
                                    catch (NumberFormatException v25) {
                                        throw _4U.a(v25);
                                    }
                                    if (v22 <= 0) break block52;
                                }
                                catch (NumberFormatException v26) {
                                    throw _4U.a(v26);
                                }
                                var75_40 -= 6.283185307179586;
                            }
                            v22 = var17_7;
                        }
                        try {
                            try {
                                try {
                                    v24 = var26_15;
lbl200:
                                    // 2 sources

                                    if (v24 == null) break block53;
                                    if (v22 == 0) break block54;
                                }
                                catch (NumberFormatException v27) {
                                    throw _4U.a(v27);
                                }
                                cfr_temp_4 = var75_40 - 0.0;
                                v22 = cfr_temp_4 == 0 ? 0 : (cfr_temp_4 < 0 ? -1 : 1);
                                if (var26_15 == null) break block53;
                            }
                            catch (NumberFormatException v28) {
                                throw _4U.a(v28);
                            }
                            if (v22 >= 0) break block54;
                        }
                        catch (NumberFormatException v29) {
                            throw _4U.a(v29);
                        }
                        var75_40 += 6.283185307179586;
                    }
                    v22 = (int)_4U.c("t", (double)(_4U.c("t", (double)var75_40, (long)707588168802737387L, (long)var11_8) / 1.5707963267948966), (long)707541085792624839L, (long)var11_8);
                }
                var77_41 = v22;
                try {
                    try {
                        v30 = var77_41;
                        if (var26_15 == null) break block55;
                        if (v30 >= 1) break block56;
                    }
                    catch (NumberFormatException v31) {
                        throw _4U.a(v31);
                    }
                    v30 = 1;
                }
                catch (NumberFormatException v32) {
                    throw _4U.a(v32);
                }
            }
            var77_41 = v30;
        }
        var78_42 = var75_40 / (double)var77_41;
        var80_43 = 2.6666666666666665 * _4U.c("t", (double)(var78_42 / 4.0), (long)706900524507254571L, (long)var11_8) * _4U.c("t", (double)(var78_42 / 4.0), (long)706900524507254571L, (long)var11_8) / _4U.c("t", (double)(var78_42 / 2.0), (long)706900524507254571L, (long)var11_8);
        var82_44 = var73_39;
        var84_45 /* !! */  = var1_1;
        var86_46 /* !! */  = var3_2;
        for (var88_47 = 0; var88_47 < var77_41; ++var88_47) {
            var89_49 = var82_44 + var78_42;
            var91_50 = _4U.c("t", (double)var82_44, (long)705883393029371676L, (long)var11_8);
            var93_51 = _4U.c("t", (double)var82_44, (long)706900524507254571L, (long)var11_8);
            var95_52 = _4U.c("t", (double)var89_49, (long)705883393029371676L, (long)var11_8);
            var97_53 = _4U.c("t", (double)var89_49, (long)706900524507254571L, (long)var11_8);
            var99_54 = var5_3 * var91_50;
            var101_55 = var7_4 * var93_51;
            var103_56 = var5_3 * var95_52;
            var105_57 = var7_4 * var97_53;
            var107_58 = var99_54 - var80_43 * var5_3 * var93_51;
            var109_59 = var101_55 + var80_43 * var7_4 * var91_50;
            var111_60 = var103_56 + var80_43 * var5_3 * var97_53;
            var113_61 = var105_57 - var80_43 * var7_4 * var95_52;
            var115_62 = var29_17 * var99_54 - var31_18 * var101_55 + var61_33;
            var117_63 = var31_18 * var99_54 + var29_17 * var101_55 + var63_34;
            var119_64 = var29_17 * var107_58 - var31_18 * var109_59 + var61_33;
            var121_65 = var31_18 * var107_58 + var29_17 * var109_59 + var63_34;
            var123_66 = var29_17 * var111_60 - var31_18 * var113_61 + var61_33;
            var125_67 = var31_18 * var111_60 + var29_17 * var113_61 + var63_34;
            var127_68 = var29_17 * var103_56 - var31_18 * var105_57 + var61_33;
            var129_48 = var31_18 * var103_56 + var29_17 * var105_57 + var63_34;
            v33 = new Object[10];
            v33[9] = var18_11;
            v33[8] = (double)var129_48;
            v33[7] = (double)var127_68;
            v33[6] = (double)var125_67;
            v33[5] = (double)var123_66;
            v33[4] = (double)var121_65;
            v33[3] = (double)var119_64;
            v33[2] = var24_14;
            v33[1] = var86_46 /* !! */ ;
            v33[0] = var84_45 /* !! */ ;
            _4U.c("t", (Object)v33, (long)707335951415021948L, (long)var11_8);
            var84_45 /* !! */  = (double)var127_68;
            var86_46 /* !! */  = (double)var129_48;
            var82_44 = var89_49;
            if (var26_15 != null) continue;
        }
    }

    /*
     * Exception decompiling
     */
    private static void cfr_renamed_8(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[TRYBLOCK]], but top level block is 44[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    private static void cfr_renamed_9(Object[] objectArray) {
        double d = (Double)objectArray[0];
        long l2 = (Long)objectArray[1];
        double d2 = (Double)objectArray[2];
        double d3 = (Double)objectArray[3];
        double d4 = (Double)objectArray[4];
        _9n n = (_9n)objectArray[5];
        long l3 = (l2 = a ^ l2) ^ 0x6993CBEA385BL;
        double d5 = d3 * 0.5522847498307933;
        double d6 = d4 * 0.5522847498307933;
        Object[] objectArray2 = new Object[10];
        objectArray2[9] = n;
        objectArray2[8] = d2 + d4;
        objectArray2[7] = d;
        objectArray2[6] = d2 + d4;
        objectArray2[5] = d + d5;
        objectArray2[4] = d2 + d6;
        objectArray2[3] = d + d3;
        objectArray2[2] = l3;
        objectArray2[1] = d2;
        objectArray2[0] = d + d3;
        _4U.c("t", (Object)objectArray2, -4312769596788810615L, (long)l2);
        Object[] objectArray3 = new Object[10];
        objectArray3[9] = n;
        objectArray3[8] = d2;
        objectArray3[7] = d - d3;
        objectArray3[6] = d2 + d6;
        objectArray3[5] = d - d3;
        objectArray3[4] = d2 + d4;
        objectArray3[3] = d - d5;
        objectArray3[2] = l3;
        objectArray3[1] = d2 + d4;
        objectArray3[0] = d;
        _4U.c("t", (Object)objectArray3, -4312769596788810615L, (long)l2);
        Object[] objectArray4 = new Object[10];
        objectArray4[9] = n;
        objectArray4[8] = d2 - d4;
        objectArray4[7] = d;
        objectArray4[6] = d2 - d4;
        objectArray4[5] = d - d5;
        objectArray4[4] = d2 - d6;
        objectArray4[3] = d - d3;
        objectArray4[2] = l3;
        objectArray4[1] = d2;
        objectArray4[0] = d - d3;
        _4U.c("t", (Object)objectArray4, -4312769596788810615L, (long)l2);
        Object[] objectArray5 = new Object[10];
        objectArray5[9] = n;
        objectArray5[8] = d2;
        objectArray5[7] = d + d3;
        objectArray5[6] = d2 - d6;
        objectArray5[5] = d + d3;
        objectArray5[4] = d2 - d4;
        objectArray5[3] = d + d5;
        objectArray5[2] = l3;
        objectArray5[1] = d2 - d4;
        objectArray5[0] = d;
        _4U.c("t", (Object)objectArray5, -4312769596788810615L, (long)l2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void void_8(Object[] var0) {
        block27: {
            block24: {
                block21: {
                    block22: {
                        var2_1 = (Integer)var0[0];
                        var4_2 = (List)var0[1];
                        var6_3 = (String)var0[2];
                        var1_4 = ((Boolean)var0[3]).booleanValue();
                        var5_5 = (Integer)var0[4];
                        var3_6 = (String)var0[5];
                        var7_7 = (String)var0[6];
                        var9_8 = (String)var0[7];
                        var8_9 = (Integer)var0[8];
                        v0 = var10_10 = ((long)var2_1 << 48 | (long)var5_5 << 48 >>> 16 | (long)var8_9 << 32 >>> 32) ^ _4U.a;
                        var12_11 = v0 ^ 93857998881908L;
                        var14_12 = v0 ^ 12710606051090L;
                        var16_13 = v0 ^ 111051571596703L;
                        var18_14 = v0 ^ 117295641650103L;
                        var20_15 = v0 ^ 107982090752549L;
                        var22_16 = _4.cfr_renamed_3();
                        v1 = new Object[3];
                        v1[2] = var18_14;
                        v1[1] = _4U.a("q", (int)5859, (long)(3480785000943417897L ^ var10_10));
                        v1[0] = var6_3;
                        var23_17 = _4U.c("t", (Object)v1, (long)-238683687063721219L, (long)var10_10);
                        try {
                            v2 = var23_17;
                            if (var22_16 == null) break block21;
                            if (v2 != null) break block22;
                        }
                        catch (NumberFormatException v3) {
                            throw _4U.a(v3);
                        }
                        return;
                    }
                    v2 = _4U.c("\u00ff", (Object)var23_17, (long)-240062163646457261L, (long)var10_10);
                }
                var24_18 = _4U.c("\u00ff", (Object)v2, (Object)_4U.a("q", (int)4976, (long)(6614874517883977636L ^ var10_10)), (long)-240165179010463092L, (long)var10_10);
                try {
                    if (((CallSite)var24_18).length < 4) {
                        return;
                    }
                }
                catch (NumberFormatException v4) {
                    throw _4U.a(v4);
                }
                var25_19 = new _9n(var12_11);
                var26_20 /* !! */  = 0.0;
                var28_21 /* !! */  = 0.0;
                var30_22 /* !! */  = 0.0;
                var32_23 /* !! */  = 0.0;
                var34_24 = 0;
                while (var34_24 + 1 < ((CallSite)var24_18).length) {
                    block25: {
                        block26: {
                            block23: {
                                v5 = new Object[3];
                                v5[2] = var20_15;
                                v5[1] = 0.0;
                                v5[0] = var24_18[var34_24];
                                var35_25 = _4U.c("t", (Object)v5, (long)-238270457951887157L, (long)var10_10);
                                v6 = new Object[3];
                                v6[2] = var20_15;
                                v6[1] = 0.0;
                                v6[0] = var24_18[var34_24 + 1];
                                var37_26 = _4U.c("t", (Object)v6, (long)-238270457951887157L, (long)var10_10);
                                try {
                                    try {
                                        v7 = var22_16;
                                        if (var8_9 > 0) {
                                            if (v7 == null) break block23;
                                            v8 = var34_24;
                                            if (var8_9 < 0 || var22_16 == null) break block24;
                                        }
                                        ** GOTO lbl85
                                    }
                                    catch (NumberFormatException v9) {
                                        throw _4U.a(v9);
                                    }
                                    if (v8 == 0) {
                                    }
                                    ** GOTO lbl87
                                }
                                catch (NumberFormatException v10) {
                                    throw _4U.a(v10);
                                }
                                var26_20 /* !! */  = (double)var35_25;
                                var28_21 /* !! */  = (double)var37_26;
                            }
                            try {
                                v7 = var22_16;
lbl85:
                                // 2 sources

                                if (var2_1 < 0) break block25;
                                if (v7 != null) break block26;
lbl87:
                                // 2 sources

                                v11 = new Object[6];
                                v11[5] = (double)var37_26;
                                v11[4] = var16_13;
                                v11[3] = (double)var35_25;
                                v11[2] = var32_23 /* !! */ ;
                                v11[1] = var30_22 /* !! */ ;
                                v11[0] = var25_19;
                                _4U.c("t", (Object)v11, (long)-239797558742966091L, (long)var10_10);
                            }
                            catch (NumberFormatException v12) {
                                throw _4U.a(v12);
                            }
                        }
                        var30_22 /* !! */  = (double)var35_25;
                        var32_23 /* !! */  = (double)var37_26;
                        var34_24 += 2;
                        v7 = var22_16;
                    }
                    if (v7 != null) continue;
                }
                if (var2_1 < 0) break block27;
                v8 = var1_4;
            }
            try {
                if (v8 != 0) {
                    v13 = new Object[6];
                    v13[5] = var28_21 /* !! */ ;
                    v13[4] = var16_13;
                    v13[3] = var26_20 /* !! */ ;
                    v13[2] = var32_23 /* !! */ ;
                    v13[1] = var30_22 /* !! */ ;
                    v13[0] = var25_19;
                    _4U.c("t", (Object)v13, (long)-239797558742966091L, (long)var10_10);
                }
            }
            catch (NumberFormatException v14) {
                throw _4U.a(v14);
            }
            v15 = new Object[7];
            v15[6] = var25_19;
            v15[5] = var9_8;
            v15[4] = var14_12;
            v15[3] = var7_7;
            v15[2] = var3_6;
            v15[1] = var6_3;
            v15[0] = var4_2;
            _4U.c("t", (Object)v15, (long)-236912042068259707L, (long)var10_10);
        }
    }

    private static String java_lang_String_8(Object[] objectArray) {
        String string = (String)objectArray[0];
        String string2 = (String)objectArray[1];
        long l2 = (Long)objectArray[2];
        l2 = a ^ l2;
        String string3 = _4.cfr_renamed_3();
        CallSite callSite = _4U.c("\u00ff", (Object)_4U.c("j", 1608858805721345366L, (long)l2), (Object)string, 1607089295685457705L, (long)l2);
        block0: while (_4U.c("\u00ff", (Object)callSite, 1609370550205224938L, (long)l2) != false) {
            CallSite callSite2 = _4U.c("\u00ff", (Object)callSite, 1, 1607234742896251420L, (long)l2);
            block1: while (true) {
                String string4 = string2;
                while (_4U.c("\u00ff", (Object)callSite2, (Object)string4, 1607445074969866548L, (long)l2) != false) {
                    callSite2 = _4U.c("\u00ff", (Object)callSite, 2, 1607234742896251420L, (long)l2);
                    string4 = string3;
                    if (l2 < 0L) continue;
                    if (string4 == null) continue block1;
                }
                continue block0;
                break;
            }
            {
                return callSite2;
                break;
            }
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_4U.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_4U.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_4U.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

