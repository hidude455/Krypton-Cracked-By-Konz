/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_2561
 *  net.minecraft.class_332
 *  net.minecraft.class_437
 */
package dev.krypton;

import dev.krypton._87;
import dev.krypton._8B;
import dev.krypton._9M;
import dev.krypton._9Z;
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
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_437;

public abstract class _8e
extends class_437
implements _9Z {
    static protected final _8B cfr_renamed_1;
    static protected final _8B cfr_renamed_103;
    static protected final _8B cfr_renamed_8;
    static protected final _8B cfr_renamed_9;
    static protected final _8B cfr_renamed_88;
    static protected final _8B cfr_renamed_5;
    static protected final _8B cfr_renamed_0;
    static protected final _8B cfr_renamed_4;
    static protected final _8B cfr_renamed_6;
    static protected final _8B cfr_renamed_84;
    private final String cfr_renamed_3;
    protected int cfr_renamed_2;
    protected int cfr_renamed_7;
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long[] i;
    private static final Integer[] j;
    private static final Map k;
    private static final Object[] o;
    private static final String[] p;

    public void method_25420(class_332 class_3322, int n, int n2, float f) {
    }

    public final void method_25394(class_332 class_3322, int object, int object2, float f) {
        Object object3;
        int n;
        int n2;
        int n3;
        _8B b;
        _8B b2;
        double d;
        double d2;
        double d3;
        double d4;
        CallSite callSite;
        long l2;
        long l3 = l2 = a ^ 0x6EE5C8E07AE7L;
        long l4 = l3 ^ 0x35A023EE6C4CL;
        long l5 = l3 ^ 0x73DBC5887A38L;
        long l6 = l3 ^ 0x36B65E9E970CL;
        long l7 = l3 ^ 0x17F7787D5F55L;
        long l8 = l3 ^ 0x4D27BE294E7AL;
        long l9 = l3 ^ 0x71FA6C8B196EL;
        long l10 = l3 ^ 0x399D89F07129L;
        long l11 = l3 ^ 0x11C7A00091F1L;
        long l12 = l3 ^ 0x39B86F7FEB75L;
        long l13 = l3 ^ 0x247784C37610L;
        long l14 = l3 ^ 0x3FD7B952D06CL;
        long l15 = l3 ^ 0x2B1D545EBB23L;
        long l16 = l3 ^ 0x69B99DE7F97BL;
        long l17 = l3 ^ 0x624DFB607461L;
        long l18 = l3 ^ 0x2DAD175DC1ABL;
        long l19 = l3 ^ 0x18EF1ECBAB18L;
        long l20 = l3 ^ 0x180650F6B970L;
        long l21 = l3 ^ 0x75AF5354BFCL;
        long l22 = l3 ^ 0x5B5C780D80B2L;
        long l23 = l3 ^ 0x13D194B1A39AL;
        long l24 = l3 ^ 0x3A974E2B4630L;
        long l25 = l3 ^ 0x67EBF2D2F018L;
        long l26 = l3 ^ 0x6DE50E642082L;
        long l27 = l3 ^ 0x60C1DCE17257L;
        long l28 = l3 ^ 0x5A173DA802A3L;
        CallSite callSite2 = _8e.e("\u00e4", 878476716808131808L, (long)l2);
        Object[] objectArray = new Object[2];
        objectArray[1] = l26;
        objectArray[0] = class_3322;
        _8e.e("H", (Object)callSite2, (Object)objectArray, 876110689025012695L, (long)l2);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l23;
        objectArray2[0] = (double)object;
        object = _8e.e("H", (Object)this, (Object)objectArray2, 879888147465094321L, (long)l2);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l23;
        objectArray3[0] = (double)object2;
        object2 = _8e.e("H", (Object)this, (Object)objectArray3, 879888147465094321L, (long)l2);
        CallSite callSite3 = _8e.e("H", (Object)_8e.e("H", (Object)_8e.e("\u00e4", 881625522325573286L, (long)l2), 878787491505951539L, (long)l2), 876965677716642886L, (long)l2);
        CallSite callSite4 = _8e.e("H", (Object)_8e.e("H", (Object)_8e.e("\u00e4", 881625522325573286L, (long)l2), 878787491505951539L, (long)l2), 879675588391619580L, (long)l2);
        try {
            _8B b3;
            callSite = callSite2;
            d4 = 0.0;
            d3 = 0.0;
            d2 = (double)callSite3;
            d = (double)callSite4;
            b2 = b3;
            b = b3;
            n3 = 0;
            n2 = 0;
            n = 0;
            object3 = _8e.e("H", (Object)_8e.e("\u00e4", 878665288279866999L, (long)l2), (long)l18, 877038029256022188L, (long)l2) != false ? _8e.c("f", 28782, (long)(0x5FFB3693C07E751AL ^ l2)) : 0;
        }
        catch (MatchException matchException) {
            throw _8e.b(matchException);
        }
        b2(n3, n2, l8, n, (int)object3);
        _8B b4 = b;
        double d5 = d;
        double d6 = d2;
        double d7 = d3;
        Object[] objectArray4 = new Object[6];
        objectArray4[5] = b4;
        objectArray4[4] = d5;
        objectArray4[3] = d6;
        objectArray4[2] = d7;
        objectArray4[1] = l21;
        objectArray4[0] = d4;
        _8e.e("H", (Object)callSite, (Object)objectArray4, 876378093440564918L, (long)l2);
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l25;
        CallSite callSite5 = _8e.e("H", (Object)this, (Object)objectArray5, 880164693322410213L, (long)l2);
        Object[] objectArray6 = new Object[1];
        objectArray6[0] = l11;
        CallSite callSite6 = _8e.e("H", (Object)this, (Object)objectArray6, 876584936560363529L, (long)l2);
        _8e.e("s", (Object)this, (int)((callSite3 - callSite5) / 2), 876707548774859996L, (long)l2);
        _8e.e("s", (Object)this, (int)((callSite4 - callSite6) / 2), 878378189887899696L, (long)l2);
        Object[] objectArray7 = new Object[1];
        objectArray7[0] = l28;
        CallSite callSite7 = _8e.e("H", (Object)this, (Object)objectArray7, 879235046324695987L, (long)l2);
        Object[] objectArray8 = new Object[10];
        objectArray8[9] = 8.0;
        objectArray8[8] = 8.0;
        objectArray8[7] = 8.0;
        objectArray8[6] = 8.0;
        objectArray8[5] = l14;
        objectArray8[4] = (double)(_8e.e("o", (Object)this, 878378189887899696L, (long)l2) + callSite6);
        objectArray8[3] = (double)(_8e.e("o", (Object)this, 876707548774859996L, (long)l2) + callSite5);
        objectArray8[2] = (double)_8e.e("o", (Object)this, 878378189887899696L, (long)l2);
        objectArray8[1] = (double)_8e.e("o", (Object)this, 876707548774859996L, (long)l2);
        objectArray8[0] = _8e.e("\u00e4", 879713811816669568L, (long)l2);
        _8e.e("H", (Object)callSite2, (Object)objectArray8, 879497229495406088L, (long)l2);
        Object[] objectArray9 = new Object[10];
        objectArray9[9] = 0.0;
        objectArray9[8] = 0.0;
        objectArray9[7] = 8.0;
        objectArray9[6] = 8.0;
        objectArray9[5] = l14;
        objectArray9[4] = (double)(_8e.e("o", (Object)this, 878378189887899696L, (long)l2) + callSite7);
        objectArray9[3] = (double)(_8e.e("o", (Object)this, 876707548774859996L, (long)l2) + callSite5);
        objectArray9[2] = (double)_8e.e("o", (Object)this, 878378189887899696L, (long)l2);
        objectArray9[1] = (double)_8e.e("o", (Object)this, 876707548774859996L, (long)l2);
        objectArray9[0] = _8e.e("\u00e4", 878967791029208807L, (long)l2);
        _8e.e("H", (Object)callSite2, (Object)objectArray9, 879497229495406088L, (long)l2);
        Object[] objectArray10 = new Object[3];
        objectArray10[2] = 1;
        objectArray10[1] = (int)_8e.c("f", 24048, (long)(0x3BA77C172BD2D8B3L ^ l2));
        objectArray10[0] = l12;
        CallSite callSite8 = _8e.e("Y", (Object)objectArray10, 876522486111861373L, (long)l2);
        Object[] objectArray11 = new Object[1];
        objectArray11[0] = l27;
        Object[] objectArray12 = new Object[1];
        objectArray12[0] = l24;
        Object[] objectArray13 = new Object[1];
        objectArray13[0] = l20;
        _8B b5 = new _8B((int)_8e.e("H", (Object)callSite8, (Object)objectArray11, 879364812477617473L, (long)l2), (int)_8e.e("H", (Object)callSite8, (Object)objectArray12, 878248996863473921L, (long)l2), l8, (int)_8e.e("H", (Object)callSite8, (Object)objectArray13, 876481655158270279L, (long)l2), 0);
        reference var72_43 = _8e.e("o", (Object)this, 876707548774859996L, (long)l2) + callSite5 / 2;
        reference var73_44 = _8e.e("o", (Object)this, 878378189887899696L, (long)l2) + callSite7;
        Object[] objectArray14 = new Object[9];
        objectArray14[8] = b5;
        objectArray14[7] = callSite8;
        objectArray14[6] = callSite8;
        objectArray14[5] = b5;
        objectArray14[4] = 1.0;
        objectArray14[3] = l13;
        objectArray14[2] = (double)(var72_43 - _8e.e("o", (Object)this, 876707548774859996L, (long)l2));
        objectArray14[1] = (double)var73_44;
        objectArray14[0] = (double)_8e.e("o", (Object)this, 876707548774859996L, (long)l2);
        _8e.e("H", (Object)_8e.e("\u00e4", 880220927498380128L, (long)l2), (Object)objectArray14, 879985070899991559L, (long)l2);
        Object[] objectArray15 = new Object[9];
        objectArray15[8] = callSite8;
        objectArray15[7] = b5;
        objectArray15[6] = b5;
        objectArray15[5] = callSite8;
        objectArray15[4] = 1.0;
        objectArray15[3] = l13;
        objectArray15[2] = (double)(_8e.e("o", (Object)this, 876707548774859996L, (long)l2) + callSite5 - var72_43);
        objectArray15[1] = (double)var73_44;
        objectArray15[0] = (double)var72_43;
        _8e.e("H", (Object)_8e.e("\u00e4", 880220927498380128L, (long)l2), (Object)objectArray15, 879985070899991559L, (long)l2);
        Object[] objectArray16 = new Object[1];
        objectArray16[0] = l16;
        _8e.e("H", (Object)_8e.e("\u00e4", 880220927498380128L, (long)l2), (Object)objectArray16, 881699700701843683L, (long)l2);
        Object[] objectArray17 = new Object[1];
        objectArray17[0] = l9;
        Object[] objectArray18 = new Object[1];
        objectArray18[0] = l5;
        _8e.e("H", (Object)_8e.e("Y", (Object)objectArray17, 879913156517210152L, (long)l2), (Object)objectArray18, 878987204746462415L, (long)l2);
        Object[] objectArray19 = new Object[3];
        objectArray19[2] = l4;
        objectArray19[1] = Float.valueOf(7.0f);
        objectArray19[0] = 4;
        _8e.e("Y", (Object)objectArray19, 880340780286302884L, (long)l2);
        Object[] objectArray20 = new Object[1];
        objectArray20[0] = l9;
        Object[] objectArray21 = new Object[1];
        objectArray21[0] = l19;
        _8e.e("H", (Object)_8e.e("Y", (Object)objectArray20, 879913156517210152L, (long)l2), (Object)objectArray21, 878337971349844399L, (long)l2);
        Object[] objectArray22 = new Object[1];
        objectArray22[0] = l17;
        _8e.e("H", (Object)_8e.e("\u00e4", 880220927498380128L, (long)l2), (Object)objectArray22, 880071600899274105L, (long)l2);
        Object[] objectArray23 = new Object[1];
        objectArray23[0] = l15;
        CallSite callSite9 = _8e.e("H", (Object)this, (Object)objectArray23, 879428635707380824L, (long)l2);
        Object[] objectArray24 = new Object[2];
        objectArray24[1] = l6;
        objectArray24[0] = callSite9;
        CallSite callSite10 = _8e.e("H", (Object)callSite2, (Object)objectArray24, 881970561602723085L, (long)l2);
        Object[] objectArray25 = new Object[5];
        objectArray25[4] = _8e.e("\u00e4", 879270195869384505L, (long)l2);
        objectArray25[3] = (double)(_8e.e("o", (Object)this, 878378189887899696L, (long)l2) + (callSite7 - _8e.c("f", 8281, (long)(0x5375D4E666D6252CL ^ l2))) / 2);
        objectArray25[2] = (double)(_8e.e("o", (Object)this, 876707548774859996L, (long)l2) + callSite5 / 2) - callSite10 / 2.0;
        objectArray25[1] = callSite9;
        objectArray25[0] = l7;
        _8e.e("H", (Object)callSite2, (Object)objectArray25, 879782079375300227L, (long)l2);
        reference var77_47 = _8e.e("o", (Object)this, 878378189887899696L, (long)l2) + callSite7 + true;
        reference var78_48 = callSite6 - callSite7 - true;
        Object[] objectArray26 = new Object[9];
        objectArray26[8] = l22;
        objectArray26[7] = Float.valueOf(f);
        objectArray26[6] = (int)object2;
        objectArray26[5] = (int)object;
        objectArray26[4] = (int)var78_48;
        objectArray26[3] = (int)callSite5;
        objectArray26[2] = (int)var77_47;
        objectArray26[1] = (int)_8e.e("o", (Object)this, 876707548774859996L, (long)l2);
        objectArray26[0] = callSite2;
        _8e.e("H", (Object)this, (Object)objectArray26, 878876463446777001L, (long)l2);
        Object[] objectArray27 = new Object[1];
        objectArray27[0] = l10;
        _8e.e("H", (Object)callSite2, (Object)objectArray27, 879186427939575225L, (long)l2);
    }

    public boolean method_25422() {
        return false;
    }

    protected _8e(String string) {
        super((class_2561)class_2561.method_43473());
        this.cfr_renamed_3 = string;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    _8e.a = l.a(1789552733838566178L, -3208429784847990818L, MethodHandles.lookup().lookupClass()).a(156931972280556L);
                    v0 = var20 = _8e.a ^ 28845999082210L;
                    var22_1 = v0 ^ 63764381466239L;
                    var24_2 = v0 ^ 105017160561646L;
                    _8e.o = new Object[101];
                    _8e.p = new String[101];
                    _8e.a();
                    _8e.e = new HashMap<K, V>(13);
                    var11_3 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v1 = SecretKeyFactory.getInstance("DES");
                    v2 = new byte[8];
                    v3 = v2;
                    v2[0] = (byte)(var20 >>> 56);
                    for (var12_4 = 1; var12_4 < 8; ++var12_4) {
                        v3 = v3;
                        v3[var12_4] = (byte)(var20 << var12_4 * 8 >>> 56);
                    }
                    var11_3.init(2, (Key)v1.generateSecret(new DESKeySpec(v3)), new IvParameterSpec(new byte[8]));
                    var18_5 = new String[2];
                    var16_6 = 0;
                    var15_7 = "c>\u00e8\u001a\u00e9\u00dc\u00bd\u00f3$; \u00e4n\u0090\u009d\u00ec\u0010p\u0002\u0081\u00b3[;;IJ\u00fa\u00a1oc\u0010fG";
                    var17_8 = "c>\u00e8\u001a\u00e9\u00dc\u00bd\u00f3$; \u00e4n\u0090\u009d\u00ec\u0010p\u0002\u0081\u00b3[;;IJ\u00fa\u00a1oc\u0010fG".length();
                    var14_9 = 16;
                    var13_10 = -1;
lbl26:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl28:
                    // 1 sources

                    while (true) {
                        var18_5[var16_6++] = _8e.a(var19_11).intern();
                        if ((var13_10 += var14_9) < var17_8) {
                            var14_9 = var15_7.charAt(var13_10);
                            ** continue;
                        }
                        break block12;
                        break;
                    }
                    v4 = ++var13_10;
                    var19_11 = var11_3.doFinal(var15_7.substring(v4, v4 + var14_9).getBytes("ISO-8859-1"));
                    ** while (true)
                }
                _8e.c = var18_5;
                _8e.d = new String[2];
                _8e.k = new HashMap<K, V>(13);
                var0_12 = Cipher.getInstance("DES/CBC/NoPadding");
                v5 = SecretKeyFactory.getInstance("DES");
                v6 = new byte[8];
                v7 = v6;
                v6[0] = (byte)(var20 >>> 56);
                for (var1_13 = 1; var1_13 < 8; ++var1_13) {
                    v7 = v7;
                    v7[var1_13] = (byte)(var20 << var1_13 * 8 >>> 56);
                }
                var0_12.init(2, (Key)v5.generateSecret(new DESKeySpec(v7)), new IvParameterSpec(new byte[8]));
                var6_14 = new long[36];
                var3_15 = 0;
                var4_16 = "\u00ce/-1\u008a\u0091\u00fa/\u0099\u00cf\u0093\u0085P\u0007\u00058iH\u00f9\u0012\u00b5\u00c5\u00aa\u00b0\u00a3\u00b0\u000e\u0095\u00e0\u008bd=\u001e\u0080\u00ed~O\u0088\u00c5P\u00bf\u00d5\u008c\u00b6hq@\u00f3\u0010\u008a\u00ecHR\u00d7\u001f\beDw\u0083\u00824!\u00fd\u00ab\u00a8(\u00d0\u0088\u00d3\u009c\u009f\u0017e\u00dcG\rD\u00c7I\u0005\u00f2-\u0098\u00d5\u00d8c\\\u00ba\u008c\u001f\u00f08\u0085\u00c1\u00b5\u00b2H\u00f4\u008a%>\u000f\u0018\u00f7g\u00ce\u0013x\by\f6J\u00ee\u0098\u00b6j\u0093#a\u00b4u\u00ce\u0004E)\u00b8\u00ba)Dl\u00d8\u0084\u0001\u00af\u00cb\u00c2\u0001K\u001bab\u00c8\flN\u008b@\b\u008f\u0001\u008b\u0016\u008e\u00d7ULF\u00dc29\u00a3\u0099\u0090\u00bbF\u0019\u009b!\u00f5\u00af\u00ff'\u00d2\u00f6`\u00b8\u00dd'\u00d1\u0084\u0007\u00c72_\u0000\u0011\u0088\u00ac&l\u0013K=Yj\u00b0\u000e\")\u009c\u0007a\u00fe\u00a2,\u00d2\u00fc7\u00ec\u00e2\u0091*x\u00b1@l\u00d3\u00fft\u0014G'\u0082+\u00bd\u00faX\u0007]C\u0017g'\u00df\u00d3Z\u00e5\u008e\u0097\u0007\u00e1\u0086\u0098p@\u0094\u00fbL@\u0098\u00db\tPg\u0015f[e\u00b5\u00e1\u00c3\n\u001d \u000b\u00b1\u009eo\u00fb*";
                var5_17 = "\u00ce/-1\u008a\u0091\u00fa/\u0099\u00cf\u0093\u0085P\u0007\u00058iH\u00f9\u0012\u00b5\u00c5\u00aa\u00b0\u00a3\u00b0\u000e\u0095\u00e0\u008bd=\u001e\u0080\u00ed~O\u0088\u00c5P\u00bf\u00d5\u008c\u00b6hq@\u00f3\u0010\u008a\u00ecHR\u00d7\u001f\beDw\u0083\u00824!\u00fd\u00ab\u00a8(\u00d0\u0088\u00d3\u009c\u009f\u0017e\u00dcG\rD\u00c7I\u0005\u00f2-\u0098\u00d5\u00d8c\\\u00ba\u008c\u001f\u00f08\u0085\u00c1\u00b5\u00b2H\u00f4\u008a%>\u000f\u0018\u00f7g\u00ce\u0013x\by\f6J\u00ee\u0098\u00b6j\u0093#a\u00b4u\u00ce\u0004E)\u00b8\u00ba)Dl\u00d8\u0084\u0001\u00af\u00cb\u00c2\u0001K\u001bab\u00c8\flN\u008b@\b\u008f\u0001\u008b\u0016\u008e\u00d7ULF\u00dc29\u00a3\u0099\u0090\u00bbF\u0019\u009b!\u00f5\u00af\u00ff'\u00d2\u00f6`\u00b8\u00dd'\u00d1\u0084\u0007\u00c72_\u0000\u0011\u0088\u00ac&l\u0013K=Yj\u00b0\u000e\")\u009c\u0007a\u00fe\u00a2,\u00d2\u00fc7\u00ec\u00e2\u0091*x\u00b1@l\u00d3\u00fft\u0014G'\u0082+\u00bd\u00faX\u0007]C\u0017g'\u00df\u00d3Z\u00e5\u008e\u0097\u0007\u00e1\u0086\u0098p@\u0094\u00fbL@\u0098\u00db\tPg\u0015f[e\u00b5\u00e1\u00c3\n\u001d \u000b\u00b1\u009eo\u00fb*".length();
                var2_18 = 0;
                while (true) {
                    var7_19 = var4_16.substring(var2_18, var2_18 += 8).getBytes("ISO-8859-1");
                    v8 = var6_14;
                    v9 = var3_15++;
                    v10 = ((long)var7_19[0] & 255L) << 56 | ((long)var7_19[1] & 255L) << 48 | ((long)var7_19[2] & 255L) << 40 | ((long)var7_19[3] & 255L) << 32 | ((long)var7_19[4] & 255L) << 24 | ((long)var7_19[5] & 255L) << 16 | ((long)var7_19[6] & 255L) << 8 | (long)var7_19[7] & 255L;
                    v11 = -1;
                    break block13;
                    break;
                }
lbl64:
                // 1 sources

                while (true) {
                    v8[v9] = v12;
                    if (var2_18 < var5_17) ** continue;
                    var4_16 = "\u0088\u00c3\u0010'\u001f\u001f>S\u0093h\u001e~\u00bdL\u0010=";
                    var5_17 = "\u0088\u00c3\u0010'\u001f\u001f>S\u0093h\u001e~\u00bdL\u0010=".length();
                    var2_18 = 0;
                    while (true) {
                        var7_19 = var4_16.substring(var2_18, var2_18 += 8).getBytes("ISO-8859-1");
                        v8 = var6_14;
                        v9 = var3_15++;
                        v10 = ((long)var7_19[0] & 255L) << 56 | ((long)var7_19[1] & 255L) << 48 | ((long)var7_19[2] & 255L) << 40 | ((long)var7_19[3] & 255L) << 32 | ((long)var7_19[4] & 255L) << 24 | ((long)var7_19[5] & 255L) << 16 | ((long)var7_19[6] & 255L) << 8 | (long)var7_19[7] & 255L;
                        v11 = 0;
                        break block13;
                        break;
                    }
                    break;
                }
lbl77:
                // 1 sources

                while (true) {
                    v8[v9] = v12;
                    if (var2_18 < var5_17) ** continue;
                    break block14;
                    break;
                }
            }
            var8_20 = v10;
            var10_21 = var0_12.doFinal(new byte[]{(byte)(var8_20 >>> 56), (byte)(var8_20 >>> 48), (byte)(var8_20 >>> 40), (byte)(var8_20 >>> 32), (byte)(var8_20 >>> 24), (byte)(var8_20 >>> 16), (byte)(var8_20 >>> 8), (byte)var8_20});
            v12 = ((long)var10_21[0] & 255L) << 56 | ((long)var10_21[1] & 255L) << 48 | ((long)var10_21[2] & 255L) << 40 | ((long)var10_21[3] & 255L) << 32 | ((long)var10_21[4] & 255L) << 24 | ((long)var10_21[5] & 255L) << 16 | ((long)var10_21[6] & 255L) << 8 | (long)var10_21[7] & 255L;
            switch (v11) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl90:
                // 1 sources

                ** continue;
            }
        }
        _8e.i = var6_14;
        _8e.j = new Integer[36];
        _8e.cfr_renamed_1 = new _8B((int)_8e.c("f", (int)26943, (long)(4095382433242340476L ^ var20)), (int)_8e.c("f", (int)7881, (long)(7150191166726450055L ^ var20)), var22_1, (int)_8e.c("f", (int)7350, (long)(6050079712045378019L ^ var20)), (int)_8e.c("f", (int)31711, (long)(4349952967502712450L ^ var20)));
        _8e.cfr_renamed_103 = new _8B((int)_8e.c("f", (int)23687, (long)(438388579916704214L ^ var20)), (int)_8e.c("f", (int)2980, (long)(4830228956841885422L ^ var20)), var22_1, (int)_8e.c("f", (int)4491, (long)(4469797794960712913L ^ var20)), (int)_8e.c("f", (int)30455, (long)(8782368489021293475L ^ var20)));
        _8e.cfr_renamed_8 = new _8B((int)_8e.c("f", (int)5997, (long)(3644458802545730085L ^ var20)), var24_2, (int)_8e.c("f", (int)3980, (long)(1155182135215733440L ^ var20)), (int)_8e.c("f", (int)3980, (long)(1155182135215733440L ^ var20)));
        _8e.cfr_renamed_9 = new _8B((int)_8e.c("f", (int)3980, (long)(1155182135215733440L ^ var20)), var24_2, (int)_8e.c("f", (int)3980, (long)(1155182135215733440L ^ var20)), (int)_8e.c("f", (int)3980, (long)(1155182135215733440L ^ var20)));
        _8e.cfr_renamed_88 = new _8B((int)_8e.c("f", (int)16523, (long)(8643784864000275960L ^ var20)), (int)_8e.c("f", (int)13539, (long)(5763500021935276475L ^ var20)), var22_1, (int)_8e.c("f", (int)9228, (long)(1833281702584783195L ^ var20)), (int)_8e.c("f", (int)24048, (long)(4298414053840513206L ^ var20)));
        _8e.cfr_renamed_5 = new _8B((int)_8e.c("f", (int)7731, (long)(3195907316961454949L ^ var20)), (int)_8e.c("f", (int)24654, (long)(5584883247273071886L ^ var20)), var22_1, (int)_8e.c("f", (int)15689, (long)(6509390051030435840L ^ var20)), (int)_8e.c("f", (int)19348, (long)(7129671518751850195L ^ var20)));
        _8e.cfr_renamed_0 = new _8B((int)_8e.c("f", (int)25893, (long)(663485419395993696L ^ var20)), (int)_8e.c("f", (int)340, (long)(4994726090598233099L ^ var20)), var22_1, (int)_8e.c("f", (int)26167, (long)(5069860496094352236L ^ var20)), (int)_8e.c("f", (int)4660, (long)(6811168192334767981L ^ var20)));
        _8e.cfr_renamed_4 = new _8B((int)_8e.c("f", (int)6450, (long)(826999601204735040L ^ var20)), (int)_8e.c("f", (int)19169, (long)(7560790837782937504L ^ var20)), var22_1, (int)_8e.c("f", (int)20727, (long)(1572444102330934716L ^ var20)), (int)_8e.c("f", (int)29648, (long)(4488960126845306508L ^ var20)));
        _8e.cfr_renamed_6 = new _8B((int)_8e.c("f", (int)31070, (long)(5257545550288309267L ^ var20)), var24_2, (int)_8e.c("f", (int)21813, (long)(4355457252486897766L ^ var20)), (int)_8e.c("f", (int)20687, (long)(3922531452800263569L ^ var20)));
        _8e.cfr_renamed_84 = new _8B((int)_8e.c("f", (int)14474, (long)(6529233068972903880L ^ var20)), var24_2, (int)_8e.c("f", (int)29628, (long)(7175693952536430323L ^ var20)), (int)_8e.c("f", (int)6692, (long)(6758085999671684982L ^ var20)));
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8e" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    protected abstract int int_9(Object[] var1);

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _8e.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _8e.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static MatchException b(MatchException matchException) {
        return matchException;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _8e.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _8e.b(classArray[j], string, clazz2);
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
            int n = _8e.a(l2, l3);
            object = o[n];
            try {
                if (!(object instanceof String)) break block2;
                _8e.o[n] = clazz = Class.forName(p[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int c(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x972;
        if (j[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = i[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])k.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    k.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/8e", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _8e.j[n2] = n3;
        }
        return j[n2];
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8e" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _8e.c(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field c(long l2, long l3) {
        int n = _8e.a(l2, l3);
        Object object = o[n];
        if (object instanceof String) {
            String string = p[n];
            int n2 = string.indexOf(8);
            Class clazz = _8e.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _8e.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _8e.a(clazz3, string2, clazz2)) != null) {
                    _8e.o[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _8e.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _8e.o[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _8e.b(1647283383317058L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _8e.a(l2, l3);
        Object object = o[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = p[n];
                int n3 = string2.indexOf(8);
                clazz3 = _8e.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _8e.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _8e.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _8e.o[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _8e.b(1647283383317058L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _8e.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _8e.o[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _8e.b(1647283383317058L, 0L);
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

    private static int a(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (p[n3] != null) {
            return n3;
        }
        Object object = o[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 21;
            case 1 -> 58;
            case 2 -> 62;
            case 3 -> 3;
            case 4 -> 26;
            case 5 -> 25;
            case 6 -> 29;
            case 7 -> 2;
            case 8 -> 53;
            case 9 -> 49;
            case 10 -> 38;
            case 11 -> 1;
            case 12 -> 5;
            case 13 -> 48;
            case 14 -> 13;
            case 15 -> 54;
            case 16 -> 63;
            case 17 -> 4;
            case 18 -> 59;
            case 19 -> 52;
            case 20 -> 27;
            case 21 -> 23;
            case 22 -> 31;
            case 23 -> 17;
            case 24 -> 30;
            case 25 -> 7;
            case 26 -> 15;
            case 27 -> 39;
            case 28 -> 43;
            case 29 -> 19;
            case 30 -> 28;
            case 31 -> 0;
            case 32 -> 24;
            case 33 -> 6;
            case 34 -> 40;
            case 35 -> 8;
            case 36 -> 16;
            case 37 -> 44;
            case 38 -> 37;
            case 39 -> 22;
            case 40 -> 18;
            case 41 -> 33;
            case 42 -> 45;
            case 43 -> 50;
            case 44 -> 42;
            case 45 -> 12;
            case 46 -> 55;
            case 47 -> 11;
            case 48 -> 51;
            case 49 -> 32;
            case 50 -> 9;
            case 51 -> 41;
            case 52 -> 36;
            case 53 -> 61;
            case 54 -> 46;
            case 55 -> 14;
            case 56 -> 47;
            case 57 -> 56;
            case 58 -> 34;
            case 59 -> 20;
            case 60 -> 60;
            case 61 -> 10;
            case 62 -> 57;
            default -> 35;
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
        _8e.p[n3] = new String(cArray);
        return n3;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _8e.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'o' || c == 's' || c == '\u00e4' || c == '\u00ff') {
                field = _8e.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'o' ? lookup.findGetter(clazz, string2, clazz2) : (c == 's' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e4' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _8e.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'H' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'Y' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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

    private static void a() {
        Object[] objectArray = o;
        o[0] = "@+\u000f'K&]>\rfNz\u001c\f";
        objectArray[1] = Integer.TYPE;
        _8e.p[1] = "java/lang/Integer";
        objectArray[2] = "I#\u0004\u000b\u0016lT6\u0006J\u00130\u001e\b";
        objectArray[3] = "0Pr+\u001c:-Epj\u0019fdp";
        objectArray[4] = "U<@;}@ \u001cK4l\u000fA\u0012@?hU5";
        objectArray[5] = Void.TYPE;
        _8e.p[5] = "java/lang/Void";
        objectArray[6] = "\u0010aZ\u0006^ueAQ\tO:\u0004OZ\u0002K`p";
        objectArray[7] = "n|\u001f+z_\u001b\\\u0014$k\u0010zR\u001f/oJ\u000e";
        objectArray[8] = "0K&B\u001e\u0000Ek-M\u000fO$e&F\u000b\u0015P";
        objectArray[9] = "rS\u0001\n\u001a+oF\u0003K\u001fw/\u000e";
        objectArray[10] = "\u0019lLp|llLG\u007fm#\rBLtiyy";
        objectArray[11] = "}\u0010S~\u0001'\b0Xq\u0010hi>Sz\u00142\u001d";
        objectArray[12] = "\u0017\ryFB\u0017\n\u0018{\u0007GKK\r";
        objectArray[13] = "8\u001d4}\u0005\u0011M=?r\u0014^,34y\u0010\u0004X";
        objectArray[14] = "*5^\rTa!:OB)y2=F\u000b";
        objectArray[15] = "%zG/\t\u001cPZL \u0018S1TG+\u001c\tE";
        objectArray[16] = "e\u0005\u007f{p\u0012x\u0010}:uN9W";
        objectArray[17] = "3CX,OwFcS#^8'mX(ZbS";
        objectArray[18] = Double.TYPE;
        _8e.p[18] = "java/lang/Double";
        objectArray[19] = "Wx2\\rH\"X9Sc\u0007CV2Xg]7";
        objectArray[20] = Boolean.TYPE;
        _8e.p[20] = "java/lang/Boolean";
        objectArray[21] = "O5\u00183\u0004k:\u0015\u0013<\u0015$[\u001b\u00187\u0011~/";
        objectArray[22] = "\u0011[\u00148\f%d{\u001f7\u001dj\u0005u\u0014<\u00190q";
        objectArray[23] = "r\u0013O\u0013\u0018xy\u001c^\\yvr\u0017Z\u0006";
        objectArray[24] = "G\rqs-JZ\u0018s2(\u0016\u001a!";
        objectArray[25] = "\u000fpD.fDzPO!w\u000b\u001b^D*sQo";
        objectArray[26] = "\"P#|P~Wp(sA16~#xEkB";
        objectArray[27] = "AiO\bM\u00044ID\u0007\\KUGO\fX\u0011!";
        objectArray[28] = "i \u0018\u0017m\u0013t5\u001aVhO=(";
        objectArray[29] = "_^J62\u001f*~A9#PKpJ2'\n?";
        objectArray[30] = "d/4Z\u0005=m!7\u0013F0k!#\u0011[6)4<\f\u001c'u%*Z/\"r\u0014<\f\u001c'u%\u000f\u001d\r%";
        objectArray[31] = "`?<6_V\u0015\u001f79N\u0019t\u0011<2JC\u0000";
        objectArray[32] = "eK5\u0005F\u0006\u0010k>\nWIqe5\u0001S\u0013\u0005";
        objectArray[33] = "hX\u0014Ce_\u001dx\u001fLt\u0010|v\u0014GpJ\b";
        objectArray[34] = "H^\u001b\u001a`\u0017UK\u0019[eK\u0015I";
        objectArray[35] = Long.TYPE;
        _8e.p[35] = "java/lang/Long";
        objectArray[36] = "VDN\u001b4\u000fVDYG8\u0000L\u000fYY8\u0015K~\u000b\u0005mW";
        objectArray[37] = "w~\u0016\u0002\u0019\u000b\u0002^\u001d\r\bDcP\u0016\u0006\f\u001e\u0017";
        objectArray[38] = ":l\u00025=%OL\t:,j.B\u00021(0Z";
        objectArray[39] = "~[WEM\u001c\u000b{\\J\\SjuWAX\t\u001e";
        objectArray[40] = "e^*Sx&\u0010~!\\iiqp*Wm3\u0005";
        objectArray[41] = "\u0004\u001dmKPS\u0019\bo\nU\u000fVM";
        objectArray[42] = "\u000f~^,tzz^U#e5\u001bP^(aoo";
        objectArray[43] = "*4\u00022H{*4\u0015nDt0\u007f\u0015pDa7\u000eE-\u0015";
        objectArray[44] = ":=6M\u0004<O\u001d=B\u0015s.\u00136I\u0011)Z";
        objectArray[45] = "A}IrL^4]B}]\u0011USIvYK!";
        objectArray[46] = "s\u0004yY\u0004$\u0006$rV\u0015kg*y]\u00111\u0013";
        objectArray[47] = "H:x|FxU/z=C$\u001e";
        objectArray[48] = "8Od07*Moo?&e,ad4\"?X";
        objectArray[49] = "\u0004\u0017]GSUUU\u0015P7\u00054\u0001XDKF\b\u0017\u0017\u001d";
        objectArray[50] = "\u000e>4\u001dAf_||\n%1>1m\u001cJaRy3\u001e\u0019\u000f\u0002xi\u001c\u001dnR/5\u0003%";
        objectArray[51] = "4\u0007V[=M \u0001Z\u0001O\t\u0006<JY)\\0P\u0002\u0007+\u000f^\u0000\u0003])\u000b?PT\u000163";
        objectArray[52] = "D=\u001e\u00102rRrGlwN\u00141\u0005\u0017v<Iq\u0017\u001d";
        objectArray[53] = "<\u001c\u000e\u001e-)m^F\tIx\f\n\u000b\u001d5:0\u001cDD";
        objectArray[54] = "\u0016In+l\u0003\u0000\u00067W,?\u000f\u0015l8xSGKnk\u0016\u0006N\u000bqid[\u000e\u0019{W";
        objectArray[55] = "O@s\u0012S [F\u007fH!d^{o\u0010G1K\u0017'NEb%G&\u0014GfD\u0017qHX^";
        objectArray[56] = "\r~iQ4\u001c\\<!FPD=q0P?\u001bQ9nRlu\u00040.Mn\u0007Yp<GP";
        objectArray[57] = "8\u000faY\u0007*;\u0015n^dmW\u0007kU\u000b?;O5WXQ>JnO\u001em(\u000573";
        objectArray[58] = "A a4#\u0005\u0010b)#GSq6d7;\u0016M +n";
        objectArray[59] = "\r/e+\u001d9\\m-<yn=il3\u0002nO4,!\b";
        objectArray[60] = "\u0013ufX]!B7.O9rL\n7\u0002]4Y6!M\u0004";
        objectArray[61] = ",c~`ax}!6w\u0005/\u001cl'aj\u007fp$yc9\u0011q-vdlnu-66\u0005";
        objectArray[62] = "]\u0003\\\u0015EcJ\u0016\\\u001ati;\u0001\u0012\u0013\u00167J]\u001f\u001e\u0016SVW]\u001f\u001d,RW\u001dMt";
        objectArray[63] = "V!82`/L\u007fsb\u0004#Ce(9h\u0011\u0012%xo\u0004\u007f\u001ff3`v\"_t9^";
        objectArray[64] = "\u0002\u0016$\u001cC\u001aSTl\u000b'I2\u0019}\u001dH\u001d^Q#\u001f\u001bs[S{\u0005[\u0011T\u0018z@'";
        objectArray[65] = "\u0002>zhiz\u0014q#\u0014#F\u001bbx{}*S<z(\u0013\u007fZ|e*a\"\u001ano\u0014";
        objectArray[66] = "|[\"\u0013AOj\u0014{o\u00076\u0015_w\u0010@Mg\u00027\u0002J";
        objectArray[67] = "\u001a\u0011@1\nn\u000e\u0017Lkx/\u0013*\\3\u001e\u007f\u001eF\u0014m\u001c,p\u0016\u00157\u001e(\u0011FBk\u0001\u0010";
        objectArray[68] = "1W$|Y\u001f`\u0015lk=G\u0001A!\u007fA\f=Wn&";
        objectArray[69] = "|vJj8|f(\u0001:\\pi2Za0B8s\u00028\\,51A8.qu#K\u0006";
        objectArray[70] = "mr\u0015\b\u0005\f<0]\u001faX]}L\t\u000e\u000b15\u0012\u000b]ed<R\u0014_\u00179|@\u001ea";
        objectArray[71] = "*:1@is><=\u001a\u001b1@q<Etc,9bG'\r+d,@dj |#J\u001b";
        objectArray[72] = "p\u000e$N\u0014\f8\u0017{LsV thR\u0015\t'\u0018 \f\u0017ZIH!V\u0015^(\u0018v\n\nf";
        objectArray[73] = "\u0015GN7\u0018\u001cTWZk\"]/YD2M\bC\u0011\u001a0\u001ef\u0015GN7\u0018\u001cTWZk\"";
        objectArray[74] = "ZxBM-X\u000b:\nZI\u000fjw\u001bL&_\u0006?ENu1S6\u0005QwC\u000ev\u0017[I";
        objectArray[75] = "-lD3![eu\u001b1F\b\u0014f\u0019()_x.G*z1(/\u001d(~PxxA7F";
        objectArray[76] = "\u0011\u000bLA\u0011L@I\u0004Vu\u001f!\u001dNA\u000bYC\u0012\u0005@N";
        objectArray[77] = "\u0016Z8\u0015PG^Cg\u00177\u001d/\u0019~TJJEQg\u000bH";
        objectArray[78] = "5e}\bV)d'5\u001f2{\u0005sx\u000bN:9e7R";
        objectArray[79] = "8\u0005/>|Z4]$(\u0011YZ\u0012'?~\n6Zy=-d>\\;e)\u001e>\u001e<?\u0011";
        objectArray[80] = "\u0004D&!JzET2}p<>Z,$\u001fnR\u0012r&L\u0000\u0002\u0013($HaRDt;p";
        objectArray[81] = "ga~*+ q.'V`\u001c~=|9?p6c~jQ%?#ah#x\u007f1kV";
        objectArray[82] = "\t+J SJ\u001d-Fz!\u000bcz\u001d/BF\u001dn\u001b#\u0018";
        objectArray[83] = "2Q\u0018,'6c\u0013P;Cc\u0002\u0017\u001148apJQ&2";
        objectArray[84] = "(I\npBAq\u0014\u00132=\u001a\u0016\\\u0015lRMz\u0014Kn\u0001#*\u0015\u0011l\u0005BzBMs=";
        objectArray[85] = "p(@\\6q\u007fcA\u0019J~`oNF1\u0013v-X\\(~em\u0018\u001cJ~(\"DK5z(b\u0016\"";
        objectArray[86] = "\u0004<52FxU~}%\",43l3M\u007fX{21\u001e\u0011]~i)X-K10U";
        objectArray[87] = "LI5qp\u0016N\u0000)%H\u001a7V\"q!\u0016\u0007A7q.";
        objectArray[88] = "\u007f5O`k\u0012.w\u0007w\u000fDO:\u0016a`\u0015#rHc3{ss\u0012a7\u001a#$N~\u000f";
        objectArray[89] = "KWv\"TO[\u0011&:(\u0014[\u0010|:D&\fV\"m\u0013qNTl1L\u0018T\n'a(";
        objectArray[90] = "O7.\u001b4\u0012\u000e':G\u000eXu)$\u001ea\u0006\u0019az\u001c2hI` \u001e6\t\u00197|\u0001\u000e";
        objectArray[91] = "\u000eB!_\u0000{_\u0000iHd(S=p\u0005\u0000nD\u0001fJY";
        objectArray[92] = "\u00069\u0013v\u000f)\u0012?\u001f,}j4\u0002\u000ft\u001b8\u0002nG*\u0019kl>Fp\u001bo\rn\u0011,\u0004W";
        objectArray[93] = "\u0007\u0010L\u0001:oVR\u0004\u0016^:7\u001f\u0015\u00001h[WK\u0002b\u0006Z^D\u00057y^^\u0004W^";
        objectArray[94] = "\t6\b37sXt@$S'9 \r0/`\u00056Bi";
        objectArray[95] = "\u0017Kd6\u001dhF\t,!y1'D=7\u0016oK\fc5E\u0001\u001e\u0005#*GsCE1 y";
        objectArray[96] = "zL~+sH2U!)\u0014\u001d8627rM-Zzip\u001eC\n{3r\u001a\"Z,om\"";
        objectArray[97] = "\u0010\u000e:,G\u0016X\u0002i!|@;2-k\u0016\u0006\u001c\f=-F\u001e";
        objectArray[98] = "7\fBkkh!C\u001b\u0017!Tg\u0000Yl/&:@Kf";
        objectArray[99] = "f'Eg\u0011}|y\u000e7uqscUl\u0019C\"#\u00046u-/`N5\u0007porD\u000b";
        Object[] objectArray2 = objectArray;
        objectArray[100] = "D\u0006h*sfP\u0000dp\u0001(.Me/nvB\u0005;-=\u0018EXu*~\u007fN@z \u0001";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8e" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x5DA1;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l3 = Thread.currentThread().threadId();
                objectArray = (Object[])e.get(l3);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l3, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/8e", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l2 >>> 56);
            for (int j = 1; j < 8; ++j) {
                byArray[j] = (byte)(l2 << j * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            _8e.d[n2] = _8e.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _8e.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    protected void void_6(Object[] objectArray) {
        _87 var9_2 = (_87)objectArray[0];
        _8B b = (_8B)objectArray[1];
        int n = (Integer)objectArray[2];
        int n2 = (Integer)objectArray[3];
        long l2 = (Long)objectArray[4];
        int n3 = (Integer)objectArray[5];
        int n4 = (Integer)objectArray[6];
        int n5 = (Integer)objectArray[7];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x7F393ED7874DL;
        long l5 = l3 ^ 0x192E17DB0141L;
        int n6 = (int)(l5 >>> 56);
        long l6 = l5 << 8 >>> 8;
        long l7 = l3 ^ 0x140DE594566DL;
        long l8 = l3 ^ 0x2AF19E35622FL;
        long l9 = l3 ^ 0xE6FBDFBD52EL;
        long l10 = l3 ^ 0x59BDB7C5834L;
        long l11 = l3 ^ 0x162C4C97353BL;
        _8B b2 = new _8B(0, 0, l8, 0, 0);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l9;
        _8e.e("H", (Object)_8e.e("\u00e4", 2333510652661583669L, (long)l2), (Object)objectArray2, 2335409851623734454L, (long)l2);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l11;
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l7;
        _8e.e("H", (Object)_8e.e("Y", (Object)objectArray3, 2333836080118924413L, (long)l2), (Object)objectArray4, 2335026120222238874L, (long)l2);
        Object[] objectArray5 = new Object[14];
        objectArray5[13] = 0.0;
        objectArray5[12] = b2;
        objectArray5[11] = b2;
        objectArray5[10] = b;
        objectArray5[9] = (double)n5;
        objectArray5[8] = (double)n5;
        objectArray5[7] = (double)n5;
        objectArray5[6] = (double)n5;
        objectArray5[5] = (double)(n2 + n4);
        objectArray5[4] = (double)(n + n3);
        objectArray5[3] = (double)n2;
        objectArray5[2] = (double)n;
        objectArray5[1] = l6;
        objectArray5[0] = (int)((byte)n6);
        _8e.e("Y", (Object)objectArray5, 2333990939279951796L, (long)l2);
        Object[] objectArray6 = new Object[1];
        objectArray6[0] = l11;
        Object[] objectArray7 = new Object[1];
        objectArray7[0] = l4;
        _8e.e("H", (Object)_8e.e("Y", (Object)objectArray6, 2333836080118924413L, (long)l2), (Object)objectArray7, 2334303236725890554L, (long)l2);
        Object[] objectArray8 = new Object[1];
        objectArray8[0] = l10;
        _8e.e("H", (Object)_8e.e("\u00e4", 2333510652661583669L, (long)l2), (Object)objectArray8, 2333924138577467692L, (long)l2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean boolean_6(Object[] objectArray) {
        Object object;
        block11: {
            CallSite callSite;
            block12: {
                CallSite callSite2;
                int n;
                _8B b;
                long l2;
                block10: {
                    l2 = (Long)objectArray[0];
                    b = (_8B)objectArray[1];
                    long l3 = (l2 = a ^ l2) ^ 0x2F44B29644F6L;
                    n = _9M.cfr_renamed_0();
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l3;
                    callSite2 = _8e.e("H", (Object)this, (Object)objectArray2, -7334531111642041240L, (long)l2);
                    try {
                        try {
                            object = _8e.e("o", (Object)b, -7335330183962263632L, (long)l2);
                            callSite = _8e.e("o", (Object)callSite2, -7335330183962263632L, (long)l2);
                            if (n == 0) break block10;
                            if (object != callSite) break block11;
                        }
                        catch (MatchException matchException) {
                            throw _8e.b(matchException);
                        }
                        object = _8e.e("o", (Object)b, -7336904516859986704L, (long)l2);
                        callSite = _8e.e("o", (Object)callSite2, -7336904516859986704L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw _8e.b(matchException);
                    }
                }
                try {
                    try {
                        if (n == 0) break block12;
                        if (object != callSite) break block11;
                        object = _8e.e("o", (Object)b, -7333058029108179249L, (long)l2);
                        if (n == 0) return (boolean)object;
                    }
                    catch (MatchException matchException) {
                        throw _8e.b(matchException);
                    }
                    callSite = _8e.e("o", (Object)callSite2, -7333058029108179249L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _8e.b(matchException);
                }
            }
            if (object == callSite) {
                object = true;
                return (boolean)object;
            }
        }
        object = false;
        return (boolean)object;
    }

    protected abstract int int_6(Object[] var1);

    /*
     * Unable to fully structure code
     */
    protected boolean boolean_2(Object[] var1_1) {
        block20: {
            block17: {
                block19: {
                    block18: {
                        block16: {
                            var2_2 = (Long)var1_1[0];
                            var4_3 = (Double)var1_1[1];
                            var6_4 = (Double)var1_1[2];
                            var9_5 = (Integer)var1_1[3];
                            var11_6 = (Integer)var1_1[4];
                            var10_7 = (Integer)var1_1[5];
                            var8_8 = (Integer)var1_1[6];
                            var2_2 = _8e.a ^ var2_2;
                            var12_9 = _9M.cfr_renamed_0();
                            try {
                                try {
                                    cfr_temp_0 = var4_3 - (double)var9_5;
                                    v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                    if (var12_9 == 0) break block16;
                                    if (v0 < 0) break block17;
                                }
                                catch (MatchException v1) {
                                    throw _8e.b(v1);
                                }
                                cfr_temp_1 = var4_3 - (double)(var9_5 + var10_7);
                                v0 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                            }
                            catch (MatchException v2) {
                                throw _8e.b(v2);
                            }
                        }
                        try {
                            try {
                                v3 = var12_9;
                                if (var2_2 > 0L) {
                                    if (v3 == 0) break block18;
                                    if (v0 > 0) break block17;
                                }
                                ** GOTO lbl45
                            }
                            catch (MatchException v4) {
                                throw _8e.b(v4);
                            }
                            cfr_temp_2 = var6_4 - (double)var11_6;
                            v0 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                        }
                        catch (MatchException v5) {
                            throw _8e.b(v5);
                        }
                    }
                    try {
                        try {
                            v3 = var12_9;
lbl45:
                            // 2 sources

                            if (var2_2 > 0L) {
                                if (v3 == 0) break block19;
                                if (v0 < 0) break block17;
                            }
                            ** GOTO lbl60
                        }
                        catch (MatchException v6) {
                            throw _8e.b(v6);
                        }
                        cfr_temp_3 = var6_4 - (double)(var11_6 + var8_8);
                        v0 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                    }
                    catch (MatchException v7) {
                        throw _8e.b(v7);
                    }
                }
                try {
                    v3 = var12_9;
lbl60:
                    // 2 sources

                    if (v3 == 0) break block20;
                    if (v0 > 0) break block17;
                }
                catch (MatchException v8) {
                    throw _8e.b(v8);
                }
                v0 = (double)true;
                break block20;
            }
            v0 = (double)false;
        }
        return (boolean)v0;
    }

    public String java_lang_String_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return _8e.e("o", (Object)this, -5254486853743347913L, (long)l2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean cfr_renamed_7(Object[] objectArray) {
        Object object;
        block11: {
            reference v1;
            block12: {
                int n;
                long l2;
                _8B b;
                block10: {
                    b = (_8B)objectArray[0];
                    l2 = (Long)objectArray[1];
                    l2 = a ^ l2;
                    n = _9M.cfr_renamed_3();
                    try {
                        try {
                            object = _8e.e("o", (Object)b, 9054659497215694891L, (long)l2);
                            v1 = _8e.c("f", 24639, (long)(0x4C4CFA5E54A714F6L ^ l2));
                            if (n != 0) break block10;
                            if (object <= v1) break block11;
                        }
                        catch (MatchException matchException) {
                            throw _8e.b(matchException);
                        }
                        object = _8e.e("o", (Object)b, 9054659497215694891L, (long)l2);
                        v1 = _8e.e("o", (Object)b, 9058186838711933803L, (long)l2) + _8e.c("f", 7881, (long)(0x633A8B2DA4D5EA1EL ^ l2));
                    }
                    catch (MatchException matchException) {
                        throw _8e.b(matchException);
                    }
                }
                try {
                    try {
                        if (n != 0) break block12;
                        if (object <= v1) break block11;
                        object = _8e.e("o", (Object)b, 9054659497215694891L, (long)l2);
                        if (n != 0) return (boolean)object;
                    }
                    catch (MatchException matchException) {
                        throw _8e.b(matchException);
                    }
                    v1 = _8e.e("o", (Object)b, 9052391700411754836L, (long)l2) + _8e.c("f", 7881, (long)(0x633A8B2DA4D5EA1EL ^ l2));
                }
                catch (MatchException matchException) {
                    throw _8e.b(matchException);
                }
            }
            if (object > v1) {
                object = true;
                return (boolean)object;
            }
        }
        object = false;
        return (boolean)object;
    }

    protected int int_5(Object[] objectArray) {
        double d = (Double)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = a ^ l2;
        return (int)(d * (double)_8e.e("H", (Object)_8e.e("H", (Object)_8e.e("\u00e4", -2781778742502253569L, (long)l2), -2780093347529947542L, (long)l2), -2781633507649286985L, (long)l2));
    }

    protected _8B dev_krypton_8B_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = a ^ l2) ^ 0x55BEA36C4F47L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = 1;
        objectArray2[1] = (int)_8e.c("f", 24048, (long)(0x3BA71011E7C17C81L ^ l2));
        objectArray2[0] = l3;
        return _8e.e("Y", (Object)objectArray2, -6334202339237994929L, (long)l2);
    }

    protected abstract void cfr_renamed_9(Object[] var1);

    protected int int_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return (int)_8e.c("f", 7881, (long)(0x633ABA3556129921L ^ l2));
    }

    /*
     * Unable to fully structure code
     */
    protected void void_8(Object[] var1_1) {
        block22: {
            block23: {
                block27: {
                    block26: {
                        block25: {
                            block24: {
                                block21: {
                                    var9_2 = (Long)var1_1[0];
                                    var4_3 = (_87)var1_1[1];
                                    var3_4 = (String)var1_1[2];
                                    var6_5 = (_8B)var1_1[3];
                                    var5_6 = (Integer)var1_1[4];
                                    var2_7 = (Integer)var1_1[5];
                                    var7_8 = (Integer)var1_1[6];
                                    var8_9 = (Integer)var1_1[7];
                                    v0 = var9_2 = _8e.a ^ var9_2;
                                    var11_10 = v0 ^ 109568854632857L;
                                    var13_11 = v0 ^ 110707074169911L;
                                    var15_12 = v0 ^ 122591584711760L;
                                    var17_13 = v0 ^ 42381858650570L;
                                    var19_14 = v0 ^ 8568145375635L;
                                    var21_15 = v0 ^ 91808880807426L;
                                    var23_16 = _9M.cfr_renamed_0();
                                    try {
                                        v1 = _8e.e("H", (Object)_8e.a("c", (int)952, (long)(7421682176893320442L ^ var9_2)), (Object)var3_4, (long)-6703881585590693157L, (long)var9_2);
                                        if (var23_16 == 0) break block21;
                                        if (v1 != false) {
                                        }
                                        ** GOTO lbl32
                                    }
                                    catch (MatchException v2) {
                                        throw _8e.b(v2);
                                    }
                                    var24_17 = _8e.e("\u00e4", (long)-6706606106548055788L, (long)var9_2);
                                    var25_18 = _8e.e("\u00e4", (long)-6706409523580877407L, (long)var9_2);
                                    try {
                                        if (var9_2 <= 0L) break block22;
                                        if (var23_16 != 0) break block23;
lbl32:
                                        // 2 sources

                                        v1 = _8e.e("H", (Object)_8e.a("c", (int)6288, (long)(8306401871640422355L ^ var9_2)), (Object)var3_4, (long)-6703881585590693157L, (long)var9_2);
                                    }
                                    catch (MatchException v3) {
                                        throw _8e.b(v3);
                                    }
                                }
                                try {
                                    v4 = var23_16;
                                    if (var9_2 <= 0L) ** GOTO lbl62
                                    if (v4 == 0) break block24;
                                    if (v1 != false) {
                                    }
                                    ** GOTO lbl51
                                }
                                catch (MatchException v5) {
                                    throw _8e.b(v5);
                                }
                                var24_17 = _8e.e("\u00e4", (long)-6705307173853182022L, (long)var9_2);
                                var25_18 = _8e.e("\u00e4", (long)-6706409523580877407L, (long)var9_2);
                                try {
                                    if (var9_2 < 0L) break block22;
                                    if (var23_16 != 0) break block23;
lbl51:
                                    // 2 sources

                                    v6 = new Object[2];
                                    v6[1] = var11_10;
                                    v6[0] = var6_5;
                                    v1 = _8e.e("H", (Object)this, (Object)v6, (long)-6704421044932502584L, (long)var9_2);
                                }
                                catch (MatchException v7) {
                                    throw _8e.b(v7);
                                }
                            }
                            try {
                                v4 = var23_16;
lbl62:
                                // 2 sources

                                if (v4 == 0) break block25;
                                if (v1 != false) {
                                }
                                ** GOTO lbl74
                            }
                            catch (MatchException v8) {
                                throw _8e.b(v8);
                            }
                            var24_17 = _8e.e("\u00e4", (long)-6706771772114953497L, (long)var9_2);
                            var25_18 = _8e.e("\u00e4", (long)-6706076572647486533L, (long)var9_2);
                            try {
                                try {
                                    if (var9_2 < 0L) break block22;
                                    if (var23_16 != 0) break block23;
lbl74:
                                    // 2 sources

                                    v9 = this;
                                    if (var23_16 == 0) break block26;
                                }
                                catch (MatchException v10) {
                                    throw _8e.b(v10);
                                }
                                v11 = new Object[2];
                                v11[1] = var6_5;
                                v11[0] = var21_15;
                                v1 = _8e.e("H", (Object)v9, (Object)v11, (long)-6706648099302002478L, (long)var9_2);
                            }
                            catch (MatchException v12) {
                                throw _8e.b(v12);
                            }
                        }
                        if (v1 == false) break block27;
                        v9 = this;
                    }
                    v13 = new Object[1];
                    v13[0] = var13_11;
                    var24_17 = _8e.e("H", (Object)v9, (Object)v13, (long)-6703668264309601111L, (long)var9_2);
                    var25_18 = _8e.e("\u00e4", (long)-6706409523580877407L, (long)var9_2);
                    if (var9_2 < 0L) break block22;
                    if (var23_16 != 0) break block23;
                }
                var24_17 = _8e.e("\u00e4", (long)-6706771772114953497L, (long)var9_2);
                var25_18 = _8e.e("\u00e4", (long)-6706409523580877407L, (long)var9_2);
            }
            v14 = new Object[8];
            v14[7] = 5;
            v14[6] = var8_9;
            v14[5] = var7_8;
            v14[4] = var15_12;
            v14[3] = var2_7;
            v14[2] = var5_6;
            v14[1] = var25_18;
            v14[0] = var4_3;
            _8e.e("H", (Object)this, (Object)v14, (long)-6706172484238328977L, (long)var9_2);
        }
        v15 = new Object[2];
        v15[1] = var17_13;
        v15[0] = var3_4;
        var26_19 = _8e.e("H", (Object)var4_3, (Object)v15, (long)-6702636420129803317L, (long)var9_2);
        v16 = new Object[5];
        v16[4] = var24_17;
        v16[3] = (double)var2_7 + (double)(var8_9 - _8e.c("f", (int)17838, (long)(5696953419445431849L ^ var9_2))) / 2.0;
        v16[2] = (double)var5_6 + (double)var7_8 / 2.0 - var26_19 / 2.0;
        v16[1] = var3_4;
        v16[0] = var19_14;
        _8e.e("H", (Object)var4_3, (Object)v16, (long)-6704860259064416187L, (long)var9_2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_8e.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_8e.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_8e.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

