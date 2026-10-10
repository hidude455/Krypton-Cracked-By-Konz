/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  java.lang.MatchException
 *  net.minecraft.class_1011
 *  net.minecraft.class_1043
 *  net.minecraft.class_1044
 *  net.minecraft.class_243
 *  net.minecraft.class_2960
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import dev.krypton._3C;
import dev.krypton._3i_0;
import dev.krypton._4r;
import dev.krypton._6N;
import dev.krypton._6c_0;
import dev.krypton._6x_0;
import dev.krypton._84;
import dev.krypton._8B;
import dev.krypton._92;
import dev.krypton._95;
import dev.krypton._9o;
import dev.krypton._9r;
import dev.krypton.l;
import java.awt.BasicStroke;
import java.awt.Font;
import java.awt.image.BufferedImage;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_1044;
import net.minecraft.class_243;
import net.minecraft.class_2960;

public class _5A
extends _6x_0 {
    private static final class_2960 cfr_renamed_3;
    private static boolean cfr_renamed_8;
    private final _92 cfr_renamed_9;
    private final _92 cfr_renamed_7;
    private final _92 cfr_renamed_1;
    private final _92 cfr_renamed_0;
    private final _9r cfr_renamed_2;
    private final _9r cfr_renamed_6;
    private final List cfr_renamed_4;
    private boolean cfr_renamed_268;
    private static final long b;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static final long[] j;
    private static final Integer[] k;
    private static final Map l;
    private static final Object[] m;
    private static final String[] n;

    @Override
    public native void cfr_renamed_5();

    private void cfr_renamed_40(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x4B318B358D85L;
        long l5 = l3 ^ 0x46FB2A5B0F20L;
        long l6 = l3 ^ 0x5CC2A990D788L;
        try {
            if (_5A.d("\u00ff", -4013532764342357372L, (long)l2) != false) {
                return;
            }
        }
        catch (Exception exception) {
            throw _5A.a(exception);
        }
        try {
            Object[] objectArray2 = new Object[3];
            objectArray2[2] = (int)_5A.c("x", 1819, (long)(0x3DD88E3F3B212985L ^ l2));
            objectArray2[1] = _5A.a("r", 9214, (long)(0x2B5C77D29987161BL ^ l2));
            objectArray2[0] = l4;
            CallSite callSite = _5A.d("s", (Object)objectArray2, -4001030357017032472L, (long)l2);
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l6;
            objectArray3[0] = callSite;
            CallSite callSite2 = _5A.d("s", (Object)objectArray3, -3999512210884203349L, (long)l2);
            _5A.d("b", (Object)_5A.d("b", (Object)_5A.d("L", (Object)this, -4015392383140382007L, (long)l2), -4000781672891806863L, (long)l2), (Object)_5A.d("\u00ff", -4000544665068824023L, (long)l2), (Object)new class_1043(() -> _5A.cfr_renamed_2(l5), (class_1011)callSite2), -4016724035119016033L, (long)l2);
            _5A.d("\u00db", (boolean)_5A.c("x", 6140, (long)(0x45D420D0CDD1B96FL ^ l2)), -4013532764342357372L, (long)l2);
        }
        catch (Exception exception) {
            _5A.d("b", (Object)exception, -4001274638534157625L, (long)l2);
        }
    }

    private void cfr_renamed_269(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        class_1044 class_10442 = (class_1044)objectArray[1];
        double d = (Double)objectArray[2];
        double d2 = (Double)objectArray[3];
        double d3 = (Double)objectArray[4];
        float f = ((Float)objectArray[5]).floatValue();
        float f2 = ((Float)objectArray[6]).floatValue();
        _8B b = (_8B)objectArray[7];
        long l3 = l2 = _5A.b ^ l2;
        long l4 = l3 ^ 0x32C146E541BCL;
        long l5 = l3 ^ 0x35160EB2D14DL;
        long l6 = l3 ^ 0x73DF37F6BA17L;
        long l7 = l3 ^ 0x5F7D696857EDL;
        long l8 = l3 ^ 0x698CF0E584BL;
        long l9 = l3 ^ 0x8018F4B3995L;
        long l10 = l3 ^ 0x193A962E3BC0L;
        long l11 = l3 ^ 0x32787B149609L;
        long l12 = l3 ^ 0x566AB77B41B6L;
        long l13 = l3 ^ 0x26F9F5EFCC01L;
        long l14 = l3 ^ 0x5DD9707F9583L;
        long l15 = l3 ^ 0x5CB39531F5ADL;
        long l16 = l3 ^ 0x51A78847788DL;
        long l17 = l3 ^ 0x57351277BAF3L;
        float f3 = (float)_5A.d("s", (double)f2, 7942296722994566060L, (long)l2);
        float f4 = (float)_5A.d("s", (double)f2, 7926616803187984563L, (long)l2);
        double[] dArray = new double[4];
        double[] dArray2 = new double[4];
        float[][] fArrayArray = new float[][]{{-f, -f}, {f, -f}, {f, f}, {-f, f}};
        int n = _3C.cfr_renamed_4();
        for (int j = 0; j < 4; ++j) {
            float f5 = fArrayArray[j][0];
            float f6 = fArrayArray[j][1];
            dArray[j] = d + (double)(f5 * f3) - (double)(f6 * f4);
            dArray2[j] = d3 + (double)(f5 * f4) + (double)(f6 * f3);
            if (n == 0) continue;
        }
        _6N n2 = new _6N((RenderPipeline)_5A.d("\u00ff", 7942828028790183377L, (long)l2), l12);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l9;
        _5A.d("b", (Object)n2, (Object)objectArray2, 7941623262752531450L, (long)l2);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l7;
        objectArray3[1] = (int)_5A.c("x", 6027, (long)(0x4A83D134AD3D9F61L ^ l2));
        objectArray3[0] = 4;
        _5A.d("b", (Object)n2, (Object)objectArray3, 7942696491132804390L, (long)l2);
        Object[] objectArray4 = new Object[4];
        objectArray4[3] = dArray2[0];
        objectArray4[2] = d2;
        objectArray4[1] = l4;
        objectArray4[0] = dArray[0];
        Object[] objectArray5 = new Object[3];
        objectArray5[2] = l17;
        objectArray5[1] = Float.valueOf(1.0f);
        objectArray5[0] = Float.valueOf(0.0f);
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = b;
        objectArray6[0] = l8;
        Object[] objectArray7 = new Object[1];
        objectArray7[0] = l16;
        CallSite callSite = _5A.d("b", (Object)_5A.d("b", (Object)_5A.d("b", (Object)_5A.d("b", (Object)n2, (Object)objectArray4, 7926374191242525780L, (long)l2), (Object)objectArray5, 7943529145846464037L, (long)l2), (Object)objectArray6, 7930640164044500319L, (long)l2), (Object)objectArray7, 7926873589664415814L, (long)l2);
        Object[] objectArray8 = new Object[4];
        objectArray8[3] = dArray2[1];
        objectArray8[2] = d2;
        objectArray8[1] = l4;
        objectArray8[0] = dArray[1];
        Object[] objectArray9 = new Object[3];
        objectArray9[2] = l17;
        objectArray9[1] = Float.valueOf(1.0f);
        objectArray9[0] = Float.valueOf(1.0f);
        Object[] objectArray10 = new Object[2];
        objectArray10[1] = b;
        objectArray10[0] = l8;
        Object[] objectArray11 = new Object[1];
        objectArray11[0] = l16;
        CallSite callSite2 = _5A.d("b", (Object)_5A.d("b", (Object)_5A.d("b", (Object)_5A.d("b", (Object)n2, (Object)objectArray8, 7926374191242525780L, (long)l2), (Object)objectArray9, 7943529145846464037L, (long)l2), (Object)objectArray10, 7930640164044500319L, (long)l2), (Object)objectArray11, 7926873589664415814L, (long)l2);
        Object[] objectArray12 = new Object[4];
        objectArray12[3] = dArray2[2];
        objectArray12[2] = d2;
        objectArray12[1] = l4;
        objectArray12[0] = dArray[2];
        Object[] objectArray13 = new Object[3];
        objectArray13[2] = l17;
        objectArray13[1] = Float.valueOf(0.0f);
        objectArray13[0] = Float.valueOf(1.0f);
        Object[] objectArray14 = new Object[2];
        objectArray14[1] = b;
        objectArray14[0] = l8;
        Object[] objectArray15 = new Object[1];
        objectArray15[0] = l16;
        CallSite callSite3 = _5A.d("b", (Object)_5A.d("b", (Object)_5A.d("b", (Object)_5A.d("b", (Object)n2, (Object)objectArray12, 7926374191242525780L, (long)l2), (Object)objectArray13, 7943529145846464037L, (long)l2), (Object)objectArray14, 7930640164044500319L, (long)l2), (Object)objectArray15, 7926873589664415814L, (long)l2);
        Object[] objectArray16 = new Object[4];
        objectArray16[3] = dArray2[3];
        objectArray16[2] = d2;
        objectArray16[1] = l4;
        objectArray16[0] = dArray[3];
        Object[] objectArray17 = new Object[3];
        objectArray17[2] = l17;
        objectArray17[1] = Float.valueOf(0.0f);
        objectArray17[0] = Float.valueOf(0.0f);
        Object[] objectArray18 = new Object[2];
        objectArray18[1] = b;
        objectArray18[0] = l8;
        Object[] objectArray19 = new Object[1];
        objectArray19[0] = l16;
        CallSite callSite4 = _5A.d("b", (Object)_5A.d("b", (Object)_5A.d("b", (Object)_5A.d("b", (Object)n2, (Object)objectArray16, 7926374191242525780L, (long)l2), (Object)objectArray17, 7943529145846464037L, (long)l2), (Object)objectArray18, 7930640164044500319L, (long)l2), (Object)objectArray19, 7926873589664415814L, (long)l2);
        Object[] objectArray20 = new Object[5];
        objectArray20[4] = (int)callSite4;
        objectArray20[3] = (int)callSite3;
        objectArray20[2] = (int)callSite2;
        objectArray20[1] = (int)callSite;
        objectArray20[0] = l5;
        _5A.d("b", (Object)n2, (Object)objectArray20, 7927211321435114324L, (long)l2);
        Object[] objectArray21 = new Object[1];
        objectArray21[0] = l14;
        Object[] objectArray22 = new Object[2];
        objectArray22[1] = l6;
        objectArray22[0] = _5A.d("b", (Object)_5A.d("L", (Object)this, 7941938894560828600L, (long)l2), 7929446598188093223L, (long)l2);
        Object[] objectArray23 = new Object[2];
        objectArray23[1] = l13;
        objectArray23[0] = _5A.d("\u00ff", 7942828028790183377L, (long)l2);
        Object[] objectArray24 = new Object[2];
        objectArray24[1] = l15;
        objectArray24[0] = n2;
        Object[] objectArray25 = new Object[4];
        objectArray25[3] = _5A.d("b", (Object)class_10442, 7926501612015318266L, (long)l2);
        objectArray25[2] = l10;
        objectArray25[1] = _5A.d("b", (Object)class_10442, 7927005983376974481L, (long)l2);
        objectArray25[0] = _5A.a("r", 26318, (long)(0x193C69A23D31F558L ^ l2));
        Object[] objectArray26 = new Object[1];
        objectArray26[0] = l11;
        _5A.d("b", (Object)_5A.d("b", (Object)_5A.d("b", (Object)_5A.d("b", (Object)_5A.d("b", (Object)_5A.d("s", (Object)objectArray21, 7941878593750756312L, (long)l2), (Object)objectArray22, 7927469695293613077L, (long)l2), (Object)objectArray23, 7944107909322823659L, (long)l2), (Object)objectArray24, 7928106712951200265L, (long)l2), (Object)objectArray25, 7927283403186161798L, (long)l2), (Object)objectArray26, 7942950242857116252L, (long)l2);
    }

    public _5A(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x6A284425DAFEL;
        long l5 = l3 ^ 0x7A4876ECA36DL;
        long l6 = l3 ^ 0x3C10D3665297L;
        long l7 = l3 ^ 0x23D04042BDE5L;
        super((int)_5A.c("x", 28288, (long)(0x625ADB0196C2F3CEL ^ l2)), -1, (_4r)((Object)_5A.d("\u00ff", -316574433378853965L, (long)l2)), l6);
        this.cfr_renamed_9 = new _92((int)_5A.c("x", 4707, (long)(0x3A004231F0C38F2EL ^ l2)), 0.5, l5, 1.5, 1.0, 0.1);
        this.cfr_renamed_7 = new _92(2, 10.0, l5, 150.0, 55.0, 5.0);
        this.cfr_renamed_1 = new _92((int)_5A.c("x", 26430, (long)(0x489058CDB2707A72L ^ l2)), 0.0, l5, 255.0, 150.0, 1.0);
        this.cfr_renamed_0 = new _92((int)_5A.c("x", 22060, (long)(0x7D48964263F7CB6FL ^ l2)), 0.0, l5, 200.0, 60.0, 5.0);
        this.cfr_renamed_2 = new _9r((int)_5A.c("x", 2089, (long)(0x39EAC7DE7EDC156EL ^ l2)), true, l4);
        this.cfr_renamed_6 = new _9r((int)_5A.c("x", 8880, (long)(0x547A0E7081C13FF1L ^ l2)), true, l4);
        this.cfr_renamed_4 = new ArrayList();
        _5A.d("N", (Object)this, (boolean)_5A.c("x", 15156, (long)(0x17EA113D65F52672L ^ l2)), -313800241711029162L, (long)l2);
        _95[] nullArray = new _95[_5A.c("x", 784, (long)(0x34EF936AF4E89E5BL ^ l2))];
        nullArray[0] = _5A.d("L", (Object)this, -318580647961042116L, (long)l2);
        nullArray[1] = _5A.d("L", (Object)this, -315595402119032756L, (long)l2);
        nullArray[2] = _5A.d("L", (Object)this, -313137869553065224L, (long)l2);
        nullArray[3] = _5A.d("L", (Object)this, -316274959402308979L, (long)l2);
        nullArray[4] = _5A.d("L", (Object)this, -312851692855708303L, (long)l2);
        nullArray[5] = _5A.d("L", (Object)this, -319668901939086919L, (long)l2);
        Object[] objectArray = new Object[2];
        objectArray[1] = nullArray;
        objectArray[0] = l7;
        _5A.d("b", (Object)this, (Object)objectArray, -316225152651702215L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        a.init(_5A.class, 25);
                        _5A.b = dev.krypton.l.a(-5396997497354531013L, -49784209941190367L, MethodHandles.lookup().lookupClass()).a(104578059044012L);
                        var20 = _5A.b ^ 122270078030700L;
                        _5A.m = new Object[179];
                        _5A.n = new String[179];
                        _5A.b();
                        _5A.f = new HashMap<K, V>(13);
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
                        var18_3 = new String[7];
                        var16_4 = 0;
                        var15_5 = "7\u00ee\u0011\u00b00\u00ad\u00a6|\u00b6f}h\u00fb\u0016r\u00c7 \t\u00d2%y\u0080\u00ee\u00ca~\u000f\u0003\u00cd1\u00f8\u00f1\n\u00b5G\u00ff\u0091\u00abNJ\r\bj\u0019n\b)T\nM(\u00f0\u00f1x\u00ee\u00c6\u009b\u0015s\u00ca\u0088\u0092Y4\u00c5\u0083^A^sI\u00a2h\u00c1\u00c5\u00b6\u00a1\u00f6\u00ack\u00c4\u00ad\b\u0094/\u00b9\u00ea\u00ff\u0007<E\u0018\u00cdB)\u000b\\\u00c2n\u00820Y!RP\u0005\u00caJ\b\u0010\u0080\u0019\u00a2\u00ca\u0017\u0010\u0010\u00c8\u00c7\u0012E`$r5\u00c5s\u00e6\u00dc\u00f5\"\u0082q";
                        var17_6 = "7\u00ee\u0011\u00b00\u00ad\u00a6|\u00b6f}h\u00fb\u0016r\u00c7 \t\u00d2%y\u0080\u00ee\u00ca~\u000f\u0003\u00cd1\u00f8\u00f1\n\u00b5G\u00ff\u0091\u00abNJ\r\bj\u0019n\b)T\nM(\u00f0\u00f1x\u00ee\u00c6\u009b\u0015s\u00ca\u0088\u0092Y4\u00c5\u0083^A^sI\u00a2h\u00c1\u00c5\u00b6\u00a1\u00f6\u00ack\u00c4\u00ad\b\u0094/\u00b9\u00ea\u00ff\u0007<E\u0018\u00cdB)\u000b\\\u00c2n\u00820Y!RP\u0005\u00caJ\b\u0010\u0080\u0019\u00a2\u00ca\u0017\u0010\u0010\u00c8\u00c7\u0012E`$r5\u00c5s\u00e6\u00dc\u00f5\"\u0082q".length();
                        var14_7 = 16;
                        var13_8 = -1;
lbl24:
                        // 2 sources

                        while (true) {
                            v3 = ++var13_8;
                            v4 = var15_5.substring(v3, v3 + var14_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl29:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = _5A.b(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            var15_5 = "\u00d2\u00a9\u00d8,\u00c0n\u00ac\u001f\u0015\u0013:hv\u00e9\u00a9:(\u0092r\u0001D\u008d\n\u00b5\u00c4B\u00e1\u00f4\u00eb{\u0011\u009a\u0095\u0017\\\u00a1\u00f3E\u0095a\u00b6\u00af1\u0087\u00ee\u0084\u001e\u00f6\u00ab\u00c7\u00ed*\u008f\u009f\u00df\u00cb\u00d8";
                            var17_6 = "\u00d2\u00a9\u00d8,\u00c0n\u00ac\u001f\u0015\u0013:hv\u00e9\u00a9:(\u0092r\u0001D\u008d\n\u00b5\u00c4B\u00e1\u00f4\u00eb{\u0011\u009a\u0095\u0017\\\u00a1\u00f3E\u0095a\u00b6\u00af1\u0087\u00ee\u0084\u001e\u00f6\u00ab\u00c7\u00ed*\u008f\u009f\u00df\u00cb\u00d8".length();
                            var14_7 = 16;
                            var13_8 = -1;
lbl38:
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
lbl43:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = _5A.b(var19_9).intern();
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
lbl55:
                        // 1 sources

                        ** continue;
                    }
                }
                _5A.d = var18_3;
                _5A.e = new String[7];
                _5A.l = new HashMap<K, V>(13);
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
                var6_12 = new long[14];
                var3_13 = 0;
                var4_14 = "W\u009d\u00ca\u0093\u009a\u0002\u0002\u001a\u009b\u001a\u00fd\fV6\u0097Dy\u0087\u001e@\u008b\u008b\u00f2O\u000e\u00e7\u00f3\u00ec0<o\u00a16\u00c68%\u00eb_\u00fbw\u00e1\u009b\u00fc\u00cfM\u00b6\u00bf\u00e8A-\u0003\u00e7\u009c\u00bb\u00a8\u009f\u0001\u0084\u0094&\u00fe\u0087E\u00aa\u00ed\u0089\u001e\u00f4`\u00e0\u00b3\u0087 \u00f4\u00db\u00b1\u00e7bA\u00b9\u00f2\u00ec\u0019 \u009a\u00b2\u00ee?\u008cZj\u00feY=\u00f4-";
                var5_15 = "W\u009d\u00ca\u0093\u009a\u0002\u0002\u001a\u009b\u001a\u00fd\fV6\u0097Dy\u0087\u001e@\u008b\u008b\u00f2O\u000e\u00e7\u00f3\u00ec0<o\u00a16\u00c68%\u00eb_\u00fbw\u00e1\u009b\u00fc\u00cfM\u00b6\u00bf\u00e8A-\u0003\u00e7\u009c\u00bb\u00a8\u009f\u0001\u0084\u0094&\u00fe\u0087E\u00aa\u00ed\u0089\u001e\u00f4`\u00e0\u00b3\u0087 \u00f4\u00db\u00b1\u00e7bA\u00b9\u00f2\u00ec\u0019 \u009a\u00b2\u00ee?\u008cZj\u00feY=\u00f4-".length();
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
lbl82:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u001bV\u00dc\u00a95\u008a\u009b\u00e0\u000e><\u00c8\u00d2\u00c6+\u00cd";
                    var5_15 = "\u001bV\u00dc\u00a95\u008a\u009b\u00e0\u000e><\u00c8\u00d2\u00c6+\u00cd".length();
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
lbl95:
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
lbl108:
                // 1 sources

                ** continue;
            }
        }
        _5A.j = var6_12;
        _5A.k = new Integer[14];
        _5A.cfr_renamed_3 = _5A.d("s", (Object)_5A.a("r", (int)5153, (long)(5299135783020114399L ^ var20)), (Object)_5A.a("r", (int)4709, (long)(551720032825096092L ^ var20)), (long)-2858782306499339420L, (long)var20);
        _5A.d("\u00db", (boolean)_5A.c("x", (int)4870, (long)(3070612792433257864L ^ var20)), (long)-2859215373244144997L, (long)var20);
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (_5A.n[n3] != null) {
            return n3;
        }
        Object object = m[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 52;
            case 1 -> 14;
            case 2 -> 51;
            case 3 -> 32;
            case 4 -> 13;
            case 5 -> 4;
            case 6 -> 42;
            case 7 -> 41;
            case 8 -> 61;
            case 9 -> 22;
            case 10 -> 15;
            case 11 -> 45;
            case 12 -> 56;
            case 13 -> 59;
            case 14 -> 23;
            case 15 -> 8;
            case 16 -> 10;
            case 17 -> 35;
            case 18 -> 31;
            case 19 -> 48;
            case 20 -> 28;
            case 21 -> 34;
            case 22 -> 11;
            case 23 -> 46;
            case 24 -> 57;
            case 25 -> 60;
            case 26 -> 58;
            case 27 -> 40;
            case 28 -> 53;
            case 29 -> 3;
            case 30 -> 24;
            case 31 -> 36;
            case 32 -> 39;
            case 33 -> 30;
            case 34 -> 54;
            case 35 -> 16;
            case 36 -> 5;
            case 37 -> 27;
            case 38 -> 44;
            case 39 -> 55;
            case 40 -> 63;
            case 41 -> 6;
            case 42 -> 62;
            case 43 -> 9;
            case 44 -> 20;
            case 45 -> 26;
            case 46 -> 29;
            case 47 -> 18;
            case 48 -> 19;
            case 49 -> 43;
            case 50 -> 25;
            case 51 -> 21;
            case 52 -> 50;
            case 53 -> 38;
            case 54 -> 1;
            case 55 -> 0;
            case 56 -> 12;
            case 57 -> 37;
            case 58 -> 49;
            case 59 -> 33;
            case 60 -> 17;
            case 61 -> 7;
            case 62 -> 47;
            default -> 2;
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
        _5A.n[n3] = new String(cArray);
        return n3;
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

    private static void b() {
        Object[] objectArray = m;
        m[0] = "\u001aAy`\u00062\u001aAn<\n=\u0000\nn\"\n(\u0007{<~_o";
        objectArray[1] = "Y<>U.UP2=\u001cmXV2)\u001ep^\u0014'6\u00037OH6 U\u0004JO\u00076\u00037OH6\u0005\u0012&M";
        objectArray[2] = "`}2\b3S}h0I6\u000f2V";
        objectArray[3] = "j\f&H%c\u001f,-G4,~\"&L0v\n";
        objectArray[4] = "=D[\u0006?kHdP\t.$)j[\u0002*~]";
        objectArray[5] = Void.TYPE;
        _5A.n[5] = "java/lang/Void";
        objectArray[6] = "ww\r\u0011#\u0017jb\u000fP&K'P";
        objectArray[7] = "M=ZHz}8\u001dQGk2Y\u0013ZLoh-";
        objectArray[8] = "$J\u000e\"\u0013zQj\u0005-\u000250d\u000e&\u0006oD";
        objectArray[9] = "-|\u0005ad--|\u0012=h\"77\u0012#h70F@}8wt";
        objectArray[10] = "S\r4&\u007f\u0012&-?)n]G#4\"j\u00073";
        objectArray[11] = "\u000bkhE3\u0000~KcJ\"O\u001fEhA&\u0015k";
        objectArray[12] = "\u0013\u0007)/$Ef'\" 5\n\u0007))+1Ps";
        objectArray[13] = "J\u0006\f[z\"A\t\u001d\u0014\u0019/T\u000f";
        objectArray[14] = Double.TYPE;
        _5A.n[14] = "java/lang/Double";
        objectArray[15] = "i\u0003U+t\u0001t\u0016Wjq]5^";
        objectArray[16] = "!\b+F\u000en(\u0006(\u000fMc.\u0006<\rPel\u0017/\u0018\u0006m+\t#F1d,\u0003#\u001a3h2\u0002*\u0001\rd";
        objectArray[17] = "\u0000&h3\"\u0015u\u0006c<3Z\u0014\bh77\u0000`";
        objectArray[18] = "k>\u0017~\u001c\r\u001e\u001e\u001cq\rB\u007f\u0010\u0017z\t\u0018\u000b";
        objectArray[19] = "8\u0003L>wBM#G1f\r,-L:bWX";
        objectArray[20] = "\u0007:/\u0005OZ\u001a/-DJ\u0006U'";
        objectArray[21] = "\f#D\u0007\u0004t\f#S[\b{\u0016hSE\bn\u0011\u0019\u0003\u0018Y";
        objectArray[22] = "G\\bEu12|iJd~SrbA`$'";
        objectArray[23] = "!}}.\u0005GT]v!\u0014\b5S}*\u0010RA";
        objectArray[24] = Integer.TYPE;
        _5A.n[24] = "java/lang/Integer";
        objectArray[25] = "cF:\u001a+0\u0016f1\u0015:\u007fwh:\u001e>%\u0003";
        objectArray[26] = "5\u0016 ]0?5\u00167\u0001<0/]7\u001f<%(,fDk";
        objectArray[27] = "\u0000\"\t_\u001d9\u001d7QW^9\r&Q|F>\f&\r[W\u0011\u0007\"\u0018[";
        objectArray[28] = "D\n\nL<\u0013D\n\u001d\u00100\u001c^A\u001d\u000e0\tY0OR`K";
        objectArray[29] = "\u000f-\u0019\u0000\u0001\u0019\u00128\u001bA\u0004E^\t";
        objectArray[30] = "%E\u0011]'\u007fPe\u001aR601k\u0011Y2jE";
        objectArray[31] = Boolean.TYPE;
        _5A.n[31] = "java/lang/Boolean";
        objectArray[32] = "tE\u0013y\u0019\u0010jM\t6{\fmP";
        objectArray[33] = "wc\u000b3u>jvS\u0000>1yg\u000f;58Uk\u0013&(";
        objectArray[34] = ".e\f\u0003li3pT0'f a\b\u000b,o\fm\u0014\u00161,\u000fa\u0003";
        objectArray[35] = ".t!@\u0007\u00183ayf[\u00184}>BZK\u0000";
        objectArray[36] = ",lX?#c1y\u0000\u001far.lm1`r)~G*h";
        objectArray[37] = "#\u001bp\u0007\u000eX(\u0014aHoV#\u001fe\u0012";
        objectArray[38] = "yK/:q\u0001rD>u\f\u0019aC7<";
        objectArray[39] = Float.TYPE;
        _5A.n[39] = "java/lang/Float";
        objectArray[40] = "m3ak5kp&9Itfh ";
        objectArray[41] = "\u0002\u0019\n\u0005<\u001f\u001f\fR'}\u0013\u0018\u0017\u000f\rf\u001b";
        objectArray[42] = "gLH&|pzY\u0010\u0001=\u007fy`[3 xn^";
        objectArray[43] = Character.TYPE;
        _5A.n[43] = "java/lang/Character";
        objectArray[44] = "w9|\u0000}\u0012j,$\u00066\u001cpvK\u00075\u001as=^\u00132\u001dn>e\u0013>";
        objectArray[45] = "bZz}\u0006\u001c\u007fO\"ZG\u0013|";
        objectArray[46] = "J\u0007\bxUkW\u0012PJ\u000fxO\r\u001b";
        objectArray[47] = "M\t~\u0019RCP\u001c|XW\u001f\u0011X";
        objectArray[48] = Long.TYPE;
        _5A.n[48] = "java/lang/Long";
        objectArray[49] = "k^xXk:k^o\u0004g5q\u0015o\u001ag vd>O0c";
        objectArray[50] = ",\u000e\u001dWv9%\u0000\u001e\u001e54#\u0000\n\u001c(2a\u0015\u0015\u0001o#=\u0004\u0003W\\&:5\u0015\u0001o#=\u0004";
        objectArray[51] = ";fj3\u007fc;f}osl!-}qsy&\\/-$:";
        objectArray[52] = "S#B6\u0017`&\u0003I9\u0006/G\rB2\u0002u3";
        objectArray[53] = "}=&Hba}=1\u0014nngv1\nn{`\u0007`R<";
        objectArray[54] = "$}6j\u0000)$}!6\f&>6!(\f39Gqq^r";
        objectArray[55] = "Y/%\u0013cTG'?\\\u0004UV<2\u0006\"S";
        objectArray[56] = "Xn@Ad\u000eE{B\u0000aR\u0005B";
        objectArray[57] = "\u0005Gri|wpgyfm8\u0011irmibe";
        objectArray[58] = "U*V\u0013x\nH?TR}V\t\r";
        objectArray[59] = "<vHRq3\"~R\u001d938tJZ0(xGLV;/5vJV";
        objectArray[60] = "+/Qf'\u00016:S'\"]vx";
        objectArray[61] = "Jn\u000b*t\u0019W{\tkqE\u0017y";
        objectArray[62] = "J[d\\]#?{oSLl^udXH6*";
        objectArray[63] = "\u0000\u000e^\u0013y\f\u000b\u0001O\\\u0004\u0019\u0019\u001bM\u001f";
        objectArray[64] = "l\u0018vH\u001fEl\u0018a\u0014\u0013JvSa\n\u0013_q\"5RD";
        objectArray[65] = "9Op\u000f7n9OgS;a#\u0004gM;t$u2\u0012b";
        objectArray[66] = "jX\u0001x\u007fe\u001fx\nwn*~v\u0001|jp\n";
        objectArray[67] = "\u0004`,\u0018\u0012\u0010\u0019u.Y\u0017LTw";
        objectArray[68] = "%\",]l\u0005P\u0002'R}J1\f,Yy\u0010E";
        objectArray[69] = ":=2\u00044\\:=%X8S v%F8F'\u0007u\u001am";
        objectArray[70] = "d\u0005u*Ydd\u0005bvUk~NbhU~y?25\u0001";
        objectArray[71] = "o~C~_(dqR14<fzEk\u0018+k";
        objectArray[72] = "-\u0014D&\u0012IX4O)\u0003\u00069:D\"\u0007\\M";
        objectArray[73] = "P\u0018d\t50%8o\u0006$\u007fD6d\r %0";
        objectArray[74] = "k\u0017\u00026dhc\n_3\u0002\u001a@*i\u0011O\tQ,w\u000b^\u0018D?\u007f\u0004Y\u0018K4>+z\"dF\\0{=1";
        objectArray[75] = "J\u001fo5@\u0005\u0017\th#)\u0017Q\bo9D3Q\f~%H\u0017Pea&S\u0005K\u0003j%H\f+";
        objectArray[76] = "8J8m\r?|U?o}\b:L\u001bq\u0010)@_1k\u001f#,\u001b.l\u001d";
        objectArray[77] = "=\n!\u001f\u0012_bI&\u0000t\u000e\u0004N&N\u0018^nL&\f\u001bT\u0004N5\u001b\u0019Wj\u0011v\u001c\u00061";
        objectArray[78] = "MJZz\u001fnEW\u0007\u007fy\u0001bb;L.\u0016mz'H=\u001eb}1F?_R\u0017\u00161\u0003#YE\u0000n";
        objectArray[79] = "G<S#\u000fZ\u00151\u0017y0\u0002$fG/\\RNdGm_X$=R.P\\D`E/V=";
        objectArray[80] = "&\u00198^XBz\u0018zTN<#\"?K\u0002PpH=K@Sz\"?\u0019YXrA9\u0019__\u007f\"";
        objectArray[81] = "\u0016Z`'n2DW$}Qiu\u0000t+=:\u001f\u0002ti>0uX`~!<\f\u0005vy7U";
        objectArray[82] = "wm\u0015S4\\%`Q\t\u000b\u0005\u00147Q\u000fnWmoQ\rs^";
        objectArray[83] = "\fLy`Nw\f\u0016&uT\u001c\u000fr{c\u000epZ\u0018ycLsPrswUeE\br|\\f5";
        objectArray[84] = "\u001dip\u007f\u0000\u0018Eirb\ta\u001eWls\u0012\u0000A7d\"]\u001c$2$f\f\u0007N,we\u0017a";
        objectArray[85] = ")\u001c[\u0007!\u0007n\u0003\u001e\u0004\u0010\u001e5\u0015^5q\u0019)\u001c$\u0016`\u001eo\u0006X\u0006+I$|K\u0012h\u00129\u001b\\\u000bnOU";
        objectArray[86] = ";a kmvd26\u007f\u007f\u0012zw;`aI~d1eAhkf7\u0006!+fqgi&\u007f<wZ";
        objectArray[87] = "s%\u0000Ew\u000er/\u0000\u0017F\u0005\u007f2\u0003\u0015\u0011R!e[y\u007f[n2\u0000\u001d}\u0006'9\u001d";
        objectArray[88] = "li\u0016]9A>dR\u0007\u0006\u001c\u000f{T\u0004e\u0016vs\u0011Q8";
        objectArray[89] = "+i^\u0016\r82nF\u0011vh2kG;\n\u0003=zE\u0015\u001ad*cCHv\u007f\"i\u0007\b\noi>Lr";
        objectArray[90] = "l!\u0018|KSg\"\u0003u+Yq+\u001dBU\\oB\r}SRg%\u001adU\u000f\u000b-\u001a}LYl:\u0003{\u00115d:\u001abGRs#\u001c?+Zs:\u0005iLMj<X\u0005\u0017\fo>_j\u0010X58b";
        objectArray[91] = "PB\u0010NRT[A\u000bG2]Z]6M[TLO\rMW2JY\u0013\u000b\\KR\u001b\u0005Q2";
        objectArray[92] = "R&z^\r@S,z\f<@R }\u0005Pr\u0006a'X<D\u0004\"&Y_O\u0007-!b";
        objectArray[93] = "Z/-[o\u0001[%-\t^\u0001Z)*\u000023\u000ehq^^\u0016M.)W:]Wo8g";
        objectArray[94] = "x\u000b\u001a}Zy%\u001d\u001dk3ot\r3`Roy\rsbKx~\u001d\u0014uR~#q";
        objectArray[95] = "E\f!Z\u0014NZ\u001d6b\u0003S]\u001d<\u000e1\u0000\u0011Ec^fLK\u00071\u0000\u0017\u0003L\u001f b";
        objectArray[96] = "QcXR\u0000\u000b\u00048\u000b\n|\\m<\u000b\f\u0010\u000e\u0007>\u000bN\u0013\u0004m9\u0003\r\u001e\u001d\u0007lX^Fa";
        objectArray[97] = ".N;5Kr)B/;\u001eIrH*:\u0016%@\u001cjaMIr\u001d*:\u0017#lN)!q";
        objectArray[98] = "\u0007)~ ;\r_3=z\u0005\u0019\u000e\"O=4\u0000R436f\u0016\rN*|y\u0010\u0004$4/z\u000bb";
        objectArray[99] = "gz\u0005r}C&}\u000f}D\u001c\u0017xG{tKp?Fl)^";
        objectArray[100] = "X!q\u001e\"/\n,5D\u001dv\u007fBn\u0016a(](pEb3";
        objectArray[101] = "O]p{ChM\u00009p^\f\u0013\u0000|vC`!R;/\u0014=vT8m\u0014k\u0011\u00139zI~v";
        objectArray[102] = ")\u001eX\u000fTE0\u0019@\b/\u001a=\u0013T\u0017O~?\rC\fC\u0019(\u0014EQ/";
        objectArray[103] = "\u0011v-\r&'\u001au6\u0004F-\f|(/:;\u0017s8t?*\u0015q,O&-\rvW\u000e(0\u001bj'\u0011!#\u001c\u0015-\u001a7,\te2\u0013$+v)n\u0010:|\u0019.:J<A";
        objectArray[104] = "k\u00101#,D3\nry\u0012Cc\u0012g9\u007fx`w9z,\u0002?G<;nE|we\u007fnYh\u001d{,mB\u000e";
        objectArray[105] = "3`is*if;:+V2\u000f?:-:le=:o9f\u000f:2,4\u007feoi\u007fl\u0003";
        objectArray[106] = "%\u0012\t@Hy.\u0011\u0012I(d/\r8^Lx8q\b\b\u0017m\u007f\u001c\u0002AXrBMJ]T\"-J\u001e\u0007R\u001f";
        objectArray[107] = "\u0010SEvz%IC\u0014i`HG^\u0015iv\u001f\u0010\u000e@6\u001aqBR\u00177!vNF\u0019b";
        objectArray[108] = "X`2x#\fSc)qC\u0010X\u007f!}.j\u000ey/x3\u0010\u000fr&{CV\u0006g4<,QR=2\u0001";
        objectArray[109] = "G\u0003/k)?\u001eQi4)S\u0015Nlw45\u0002owh4\u0016\u001fWrl\"S\u000eZhl<3\u0006\u000b'pY";
        objectArray[110] = "\u0010\\<G)_BQx\u001d\u0016\ts\u0006xL{D\u0018\u0006\"\u0013n^";
        objectArray[111] = "*\u0002}mnKr\u0018>7PW3\b6`,Q5eu3;M!\u0015<7n\b!e";
        objectArray[112] = ":~.m{_e=)r\u001d\t\u0003:)<q^i8)~rT\u0003::ipWmeyno1";
        objectArray[113] = "\u00105\u0002d\u0003HB8F><\u0012\u0019VA:\u0000C\u001c<C:B@\u0016VDmXSN9C9\u0002Us";
        objectArray[114] = "\fgDG\u0004W\u0013vS\u007f\u0013J\u0014vY\u0013!\u0018U*\u000eCv\u0019\bwC\u0015HB\u000f(S\u007f";
        objectArray[115] = "1`7\u00186]\u007f2;YN[aeFY4Gys<X?Nz\u0003w\u0012)Ypyv\u0019 Z\u0000";
        objectArray[116] = "<B'IXF{C0\u0014M!k\u001b1\u001dSv<Aa@?\u0010\u007f\u001d%\tE\u0011t\u0014&";
        objectArray[117] = "\tZZK4P\u0002YABTM\u0003E{N.Q\rT M4DS\bCP*\r\u00049\u001c\u000b0JSV\u001b_jLn";
        objectArray[118] = "eOwAp\u00138YpW\u0019\u0005iID~SjkMfVu\r|T`\u000b\u0019\u0005|My]~\u0012eK$1v\u0012|RrVa\u000bz\u000f\u001e";
        objectArray[119] = "\u0004?_V>([|XIXz={X\u00074)WyXE7#=-NC?*Z:WEbF";
        objectArray[120] = "\u001e#\b\u0013J\u0007\u001eyW\u0006Pl\u001a\u001d\n\u0010\n\u0000Hw\b\u0010H\u0003B\u001d\\\u0006N\u000bKzK\u001fHV'";
        objectArray[121] = "xp`i%+gawQ26`a}=\u0000d%?'`W!zh\" (k\"<\u001a";
        objectArray[122] = "Wq@mqB\u0016vJbH\u0011':Sa)HG2\u0002.5";
        objectArray[123] = "]9\u0011X\u0012j\u0016#PI\"kB?\n\\NY\u0013}S\n\"\u007f\u0017*\t\u000b[wR\u007fT;F\u007fU{\u0018KYnBC";
        objectArray[124] = "S\u001a9y(\"\fY>fNqj^>(\"#\u0000\\>j!)j[ip2q\u0005\\=*4L";
        objectArray[125] = "\"MAB_\u001aw\u0016\u0012\u001a#Oq+EN\u001f\u001cqAGN]\u001f{+@F\u001e\u0012bA\u0015\u001dMJ\u001e";
        objectArray[126] = "\u0005\f\n\u001aN\u0018X\u001b\u000b\u001c/\u001d\n\u000bW\u001dC/YN\u0006F\u0016x\b\u000fO\u001dC\u001f\u001f\u0016I@/\u0017\u001f\u000fP\u0016H\u0000\u0006\t\rz@\u0000\u001f\u0010[\u001dW\u0019\u0019M7F\u0016\u001c\u001bJXABF\u001dw";
        objectArray[127] = "V)'=l\u0007\u001f-rxlw\t~<:\u0002\u000e^c|<~\u0005\fu#F";
        objectArray[128] = "&g\u0018\u0016vZtj\\LI\u0000EaZZ)[/\u007f\tY2";
        objectArray[129] = "W\u0006_2Mf\u0005\u000b\u001bhr14\\\u001b9\u001f}_\\Af\ng";
        objectArray[130] = "\n(\u001eHK\u0001\u00141\u000e\u001d2Yfa\f\u001b^\u000f\fc\fY]\u0005fd[CN]\tc\u000f\u0019H`";
        objectArray[131] = "MuZ\u001e<4\u0003'V_D5\u001bLB\u0002% \u001am+_>.\u0005fQ^5'\u0006\u0016\u001a\u0014#0\fl\u001b\u001f*3|";
        objectArray[132] = "-JQ@\u0019vr\tV_\u007f&\u0014\u000eV\u0011\u0013w~\fVS\u0010}\u0014\u000eED\u0012~zQ\u0006C\r\u0018";
        objectArray[133] = "\u0010f)EnX\ta1B\u0015\u0018\u0014g1]o\u0002\u000fbJNm\u001b\u000ea-Yt\u001dS\r%Ym\u0004\u0005j2@kYit!Bq\u0018Rm&Zvc";
        objectArray[134] = "K\u0011&\u0010S\nCTsMc\u0016WU/\u0014\u000f$\u0004\u0011qN^sCB,\u0017\u0018HZE4\u0010c\nQJ+\bX\u0013VR,s\u0012KSJ\u007f\n\u001a\u000e\u0006\u0017O";
        objectArray[135] = "o|p7b7m!9<\u007fS3!|:b?\u0001v<j?cV)8&e5<7k%~S";
        objectArray[136] = "\"w\bK_m)t\u0013B?p(h.HVm>z\u0015HZ\u000b8l\u000b\u000eQr .\u001dT?7|p\u000e\u000fP0(*\b2";
        objectArray[137] = "^Dv,\u001b\u001e\u0019[3/*\u0017^^h'E3CHu!*\u0015IGm:\u0011\fN_jAE\u0014ZCe&R\r\\\u001e\t";
        objectArray[138] = "\u001a{jTae\u001bqj\u0006Pn\u0016li\u0004\u00079I12hi1\u001ed4\fl>Fd4";
        objectArray[139] = "w\u0019H-g\u0006%\u0014\fwX]\u0014C\f&5\u001d\u007fCVy \u0007";
        objectArray[140] = "p3\u0012'2(%hA\u007fN}LlAy\"-&nA;!'LiIx,>&<\u0012+tB";
        objectArray[141] = "5&'%Xw?oh:eE\u000eVD\u001aea\u007f(jj\bk6gu";
        objectArray[142] = "r3}/+\u001ay0f&K\u0007x,I1-\u0000\u0015.fo/\u0010i!h&t|)ic*v\u0013.=9,K";
        objectArray[143] = "\u001fR\u0010\u0017(\u001dM_TM\u0017B|T\r\u0016sD\u0001\f\u0017U)";
        objectArray[144] = "\u0015\u0014N]Sh[FB\u001c+pE\u0011?WEdI\bOHLwNwECZx[\u0007ZJI\u007f$\rQ\\FjT\u0012XOA\u0015";
        objectArray[145] = "`\u0019<\u000e\u0018,y\u001e$\tcip\u0016\"\u0007$y\u0019\u000e/\u0001Yme\u001edV\u0012\u0017`\u0019<\u000e\u0018,y\u001e$\tc";
        objectArray[146] = "n\u000eMs\u0019k \\A2a}8\u0016<2\u001bq&\u001dF3\u0010x%m\ry\u0006o/\u0017\fr\u000fl_";
        objectArray[147] = "/Wj9*?$Tq0J7)Pt\u000740,4\u007f82>$Sh!4cH[h8-5/Lq>pY'Lh'&>0UnzJ60Lw,-!)J*@v`,H-/q4vN\u0010";
        objectArray[148] = "E\n;R\u0012\u000b\u0001\u0015<Pb,Y\n6Jb\u001fP\u0003=@\u000e[O\u0004?";
        objectArray[149] = "U^-^\u0002Q^]6WbL_A\rJ\u0004[_G6A\rwS[+'\u0004OITjE\u001fNV\u0001W^SG\u0002G+U\u0001Q]=k\u001e\u0006K\u000fRlJ\\M2";
        objectArray[150] = "mq&Z!$o,oQ<@1,*W!,\u0003xf\bwpTxnLv'3?o[+2T";
        objectArray[151] = "\u001b}\u0014xBOIpP\"}\u0018=\u001eW&AD\u0017tU&\u0003G\u001d\u001eRq\u0019TEqU%CRx";
        objectArray[152] = "\\4gl9M\u0003w`s_\u0019ep`=3L\u000fr`\u007f0Feu7e#\u001e\nrc?%#";
        objectArray[153] = "7_\u00067%\u0014s\u001c\u00032w$k\u000b\u0002(zHY_Cs!\u001c\u000e\t\u00060zHi\u001e\u001f6'$a\u001e\u0006/qCv\u0007\u0000r\u001dKv\u001e\u0019$z\\o\u0018DHr\\v\u0001\u0012/eEp\\~";
        objectArray[154] = "\n\u00012M\u001b0\u001d\u0007q\u0017zp%ci@\u0018,\tS{\u0001\u0002 ";
        objectArray[155] = "3^(O4\b8]3FT\u0012.T4M0\u0007(PR\u0007.\t-M(\u0006%\u0000.=cL3\u0017$GbG:\u0014T\u0001kR(S;\u0006?\b.n";
        objectArray[156] = "A@ul\fB\u0014\u001b&4p\u0016}\u001f&2\u001cG\u0017\u001d&p\u001fM}\u001aqj\f\u0015\u0012\u001d%0\n(";
        objectArray[157] = "}\u001c\u0001g\u007f\u0002\"\u0018\u0000{+c\u001e8?QY9DL\u0010en\b%\u0013\u0014dr\\";
        objectArray[158] = "\u0000\u0002\u0015G\u0017^A\u0005\u001fH.\u0000p\b\u0015RWA\n\t\u001e[T";
        objectArray[159] = "\u00102\"i_\u0014\t5:n$U\u0004!,dX/\u0006!9jHH\u00118?7$V\u0002:%v\u001fO\u0005\"\"\r";
        objectArray[160] = "wWzg?8%Z>=\u0000`\u0014\r>lm#\u007f\rd3x9";
        objectArray[161] = "\u0004F\u0007=IB\u000fE\u001c4)_\u000eY6#L\\\u0004^\u001c8D$\u0018F\u000fxHD\u000fX\u000f))\u0018ZA\u0001yF\u001f\u000e\u001b\u0007D";
        objectArray[162] = "N/Rn9l\t.E3,\u000b\u0012zU>9g .\u0011dg7w&S9'{\r'X0$\u000b";
        objectArray[163] = "BH\u00125:&CB\u0012g\u000b-N_\u0011e\\z\u0011\u0003M\t2/\u0012I\u0015dk?CV\u000f";
        objectArray[164] = "R\u0012ux+KZ\u000f(}M$}:\u0014N\u001a&y.\u0015T\u0004<h?\u0000G\f3o)\u000eEM\u0003\u0005\u000eyy1\bW\u0018&";
        objectArray[165] = "#`\u0015\u0007>*da\u0002Z+Mt9\u0003S5\u001a#cS\rY|`?\u0017G#}k6\u0014";
        objectArray[166] = "q\u00121)\u0001\u0001,\u00046?h\u0017}\u0014\u00078\u0004\u0004ph7!\u0010\u001f|\u000f 8\u0016B\u0010";
        objectArray[167] = "XlNN\u0016\u0006\u001fmY\u0013\u0003a\u000f5X\u001a\u001d6Xo\bFqP\u001b3L\u000e\u000bQ\u0010:O";
        objectArray[168] = "\"I@ZhofVGX\u0018o7^EFu\u0003 JUUgs?CFR\u0018{7@FHt?(GD8";
        objectArray[169] = "\\h\u0006v~=\u0003+\u0001i\u0018je,\u0001't<\u000f.\u0001ew6e)V\u007fdn\n.\u0002%bS";
        objectArray[170] = "t&mrD\t\u007f%v{$\u0003r>ol_\u0002\u0013y.oXR|~z5^o";
        objectArray[171] = "f\u001a1g4\u0018/\u001ed\"4h?I!Z7\u0018# ?$&\b9J!w%\u0013_";
        objectArray[172] = "\u001cLsX'nI\u0017 \u0000[= \u0013 \u00067kJ\u0011 D4a \u0016(\u00079xJCsTa\u0004";
        objectArray[173] = ";XQBX\u0001%AA\u0017!YWEWJ\u001dQ2D]JO";
        objectArray[174] = "|\u0018_+Ig$\u0002\u001cqwq}\u0012\u00075w& \u001b\u0012r\u0018!tA\u0014O";
        objectArray[175] = "d9\u000fD\fXo:\u0014MlQn&;Z\nBF7\tG\rUxZ\t]\u0013S2(NBVP\u0003";
        objectArray[176] = "=X\u000b@ZX5EVE<*\u0016e`rz5\u001a}szu2\u001arx;Z\u0011 ]\nYA\u0010?\b";
        objectArray[177] = "\u0002dyrW\u000ePi=(hRa>=.\r\u0005\u0018f=,\u0010\f";
        Object[] objectArray2 = objectArray;
        objectArray[178] = ";^;v9XpDzg\tY$X reku\u001ay+\tMqM#%pE4\u0018~\u0015mM3\u001c2er\\$$|,m@tK{x7FI";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'L' || c == 'N' || c == '\u00ff' || c == '\u00db') {
                field = _5A.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'L' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'N' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ff' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5A.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'b' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 's' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _5A.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5A" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x66F7;
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
                throw new RuntimeException("dev/krypton/5A", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5A.k[n2] = n3;
        }
        return k[n2];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5A.c(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
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
        int n = _5A.e(l2, l3);
        Object object = m[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = _5A.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = _5A.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5A.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5A.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5A.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5A.f(2668553977175116L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5A.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5A.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5A.f(2668553977175116L, 0L);
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
            int n = _5A.e(l2, l3);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                _5A.m[n] = clazz = Class.forName(_5A.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5A.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5A.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5A.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5A.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5A" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5A" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x7D89;
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
                throw new RuntimeException("dev/krypton/5A", exception);
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
            _5A.e[n2] = _5A.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _5A.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static Field g(long l2, long l3) {
        int n = _5A.e(l2, l3);
        Object object = m[n];
        if (object instanceof String) {
            String string = _5A.n[n];
            int n2 = string.indexOf(8);
            Class clazz = _5A.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5A.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5A.c(clazz3, string2, clazz2)) != null) {
                    _5A.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5A.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5A.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5A.f(2668553977175116L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static String cfr_renamed_2(long l2) {
        l2 = b ^ l2;
        return _5A.a("r", 25031, (long)(0x3E14B39959E1501BL ^ l2));
    }

    @Override
    public native void cfr_renamed_2();

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @_3i_0
    public void cfr_renamed_6(_6c_0 c_0) {
        CallSite callSite;
        CallSite callSite2;
        float f;
        CallSite callSite3;
        float f2;
        int n;
        int n2;
        int n3;
        int n4;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        long l7;
        block28: {
            CallSite callSite4;
            int n5;
            int n6;
            int n7;
            block27: {
                long l8 = l7 = b ^ 0x76A8BD64F63DL;
                l6 = l8 ^ 0x509DCA389A72L;
                long l9 = l8 ^ 0x27612F56806FL;
                n7 = (int)(l9 >>> 56);
                n6 = (int)(l9 << 8 >>> 32);
                n5 = (int)(l9 << 40 >>> 40);
                l5 = l8 ^ 0x1B0ABE59F09CL;
                l4 = l8 ^ 0x6EFFDCF140F8L;
                l3 = l8 ^ 0x4488B21AB0ACL;
                l2 = l8 ^ 0x7D2DDF749821L;
                long l10 = l8 ^ 0xD2D6507677CL;
                n4 = (int)(l10 >>> 48);
                n3 = (int)(l10 << 16 >>> 32);
                n2 = (int)(l10 << 48 >>> 48);
                n = _3C.cfr_renamed_7();
                try {
                    try {
                        callSite4 = _5A.d("L", (Object)this, 9009586883019607943L, (long)l7);
                        if (n == 0) break block27;
                        if (_5A.d("L", (Object)callSite4, 9022621774067173162L, (long)l7) == null) return;
                    }
                    catch (MatchException matchException) {
                        throw _5A.a((Exception)((Object)matchException));
                    }
                    callSite4 = _5A.d("L", (Object)this, 9009586883019607943L, (long)l7);
                }
                catch (MatchException matchException) {
                    throw _5A.a((Exception)((Object)matchException));
                }
            }
            try {
                if (_5A.d("L", (Object)callSite4, 9007642552708581691L, (long)l7) == null) {
                    return;
                }
            }
            catch (MatchException matchException) {
                throw _5A.a((Exception)((Object)matchException));
            }
            try {
                if (_5A.d("\u00ff", 9008078145853048778L, (long)l7) == false) {
                    return;
                }
            }
            catch (MatchException matchException) {
                throw _5A.a((Exception)((Object)matchException));
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l4;
            f2 = (float)_5A.d("b", (Object)_5A.d("L", (Object)this, 9010297105624688035L, (long)l7), (Object)objectArray, 9022948824455497958L, (long)l7);
            callSite3 = _5A.d("s", 9023052436219248040L, (long)l7);
            _5A.d("b", (Object)_5A.d("L", (Object)this, 9007415855968120144L, (long)l7), arg_0 -> _5A.cfr_renamed_7((long)callSite3, f2, (byte)n7, n6, n5, arg_0), 9023281969047972890L, (long)l7);
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l4;
            f = (float)(_5A.d("b", (Object)_5A.d("L", (Object)this, 9007738338961544915L, (long)l7), (Object)objectArray2, 9022948824455497958L, (long)l7) / 100.0);
            callSite2 = _5A.d("b", (Object)_5A.d("b", (Object)_5A.d("L", (Object)this, 9009586883019607943L, (long)l7), 9021924103792672319L, (long)l7), (Object)_5A.d("\u00ff", 9022183112582475623L, (long)l7), 9024643229175863944L, (long)l7);
            try {
                callSite = callSite2;
                if (n == 0) break block28;
                if (callSite == null) return;
            }
            catch (MatchException matchException) {
                throw _5A.a((Exception)((Object)matchException));
            }
            callSite = callSite2;
        }
        try {
            if (_5A.d("b", (Object)callSite, 9022094145489143710L, (long)l7) == null) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw _5A.a((Exception)((Object)matchException));
        }
        CallSite callSite5 = _5A.d("b", (Object)_5A.d("L", (Object)this, 9007415855968120144L, (long)l7), 9023209356088283235L, (long)l7);
        while (_5A.d("b", (Object)callSite5, 9010005964693243558L, (long)l7) != false) {
            CallSite callSite6;
            CallSite callSite7;
            reference var30_23;
            float f3;
            _84 var27_20;
            block32: {
                block33: {
                    Object object;
                    float f4;
                    block31: {
                        block29: {
                            reference cfr_temp_1;
                            block30: {
                                var27_20 = (_84)((Object)_5A.d("b", (Object)callSite5, 9024365718011508264L, (long)l7));
                                f3 = (float)(callSite3 - _5A.d("L", (Object)var27_20, 9024574803915841032L, (long)l7)) / 1000.0f;
                                f4 = f3 / f2;
                                var30_23 = _5A.d("s", (float)(f4 * 3.0f), 1.0f, 9009198734150706568L, (long)l7) * f;
                                try {
                                    try {
                                        try {
                                            object = _5A.d("b", (Object)_5A.d("L", (Object)this, 9011530505897967398L, (long)l7), (long)l3, 9022430058946425150L, (long)l7);
                                            if (n == 0) break block29;
                                            if (object == false) break block30;
                                        }
                                        catch (MatchException matchException) {
                                            throw _5A.a((Exception)((Object)matchException));
                                        }
                                        float f5 = f4 - 0.7f;
                                        object = f5 == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1);
                                        if (n == 0) break block29;
                                    }
                                    catch (MatchException matchException) {
                                        throw _5A.a((Exception)((Object)matchException));
                                    }
                                    if (object <= 0) break block30;
                                }
                                catch (MatchException matchException) {
                                    throw _5A.a((Exception)((Object)matchException));
                                }
                                float f6 = (1.0f - f4) / 0.3f;
                                var30_23 *= f6;
                            }
                            object = (cfr_temp_1 = var30_23 - 0.01f) == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                        }
                        try {
                            if (n == 0) break block31;
                            if (object <= 0) {
                                continue;
                            }
                        }
                        catch (MatchException matchException) {
                            throw _5A.a((Exception)((Object)matchException));
                        }
                        Object[] objectArray = new Object[1];
                        objectArray[0] = l5;
                        object = _5A.d("b", (Object)_5A.d("L", (Object)this, 9023154441768641639L, (long)l7), (Object)objectArray, 9024423864168843442L, (long)l7);
                    }
                    reference var31_25 = object;
                    callSite7 = var31_25;
                    try {
                        callSite6 = _5A.d("b", (Object)_5A.d("L", (Object)this, 9022868286693323758L, (long)l7), (long)l3, 9022430058946425150L, (long)l7);
                        if (n == 0) break block32;
                        if (callSite6 == false) break block33;
                    }
                    catch (MatchException matchException) {
                        throw _5A.a((Exception)((Object)matchException));
                    }
                    callSite7 = (CallSite)((int)((float)var31_25 * (1.0f - f4)));
                }
                callSite6 = callSite7 = _5A.d("s", (int)callSite7, 0, (int)_5A.c("x", 8738, (long)(0xDBE91E370CEB9F4L ^ l7)), 9008711990730683029L, (long)l7);
            }
            if (callSite6 <= 0) continue;
            Object[] objectArray = new Object[3];
            objectArray[2] = 1;
            objectArray[1] = (int)callSite7;
            objectArray[0] = l6;
            _8B b = new _8B((_8B)((Object)_5A.d("s", (Object)objectArray, 9022712303539652683L, (long)l7)), (char)n4, n3, (short)n2);
            CallSite callSite8 = _5A.d("L", (Object)_5A.d("L", (Object)var27_20, 9024076566804628470L, (long)l7), 9010092866372752243L, (long)l7);
            reference var36_29 = _5A.d("L", (Object)_5A.d("L", (Object)var27_20, 9024076566804628470L, (long)l7), 9024653887830347121L, (long)l7) - _5A.d("L", (Object)var27_20, 9008504379143922024L, (long)l7);
            CallSite callSite9 = _5A.d("L", (Object)_5A.d("L", (Object)var27_20, 9024076566804628470L, (long)l7), 9010281198997123113L, (long)l7);
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l4;
            float f7 = (float)_5A.d("s", (double)_5A.d("b", (Object)_5A.d("L", (Object)this, 9008167329933290514L, (long)l7), (Object)objectArray3, 9022948824455497958L, (long)l7), 9008314675764036561L, (long)l7) * f3;
            Object[] objectArray4 = new Object[8];
            objectArray4[7] = b;
            objectArray4[6] = Float.valueOf(f7);
            objectArray4[5] = Float.valueOf((float)var30_23);
            objectArray4[4] = (double)callSite9;
            objectArray4[3] = (double)var36_29;
            objectArray4[2] = (double)callSite8;
            objectArray4[1] = callSite2;
            objectArray4[0] = l2;
            _5A.d("b", (Object)this, (Object)objectArray4, 9009156246852810338L, (long)l7);
            if (n != 0) continue;
        }
    }

    private static BufferedImage java_awt_image_BufferedImage_4(Object[] objectArray) {
        BufferedImage bufferedImage;
        block10: {
            long l2 = (Long)objectArray[0];
            String string = (String)objectArray[1];
            int n = (Integer)objectArray[2];
            l2 = b ^ l2;
            bufferedImage = new BufferedImage(n, n, 2);
            CallSite callSite = _5A.d("b", (Object)bufferedImage, -3538481962457831723L, (long)l2);
            _5A.d("b", (Object)callSite, (Object)_5A.d("\u00ff", -3541496779718396312L, (long)l2), (Object)_5A.d("\u00ff", -3538235515694186379L, (long)l2), -3543411390026778572L, (long)l2);
            _5A.d("b", (Object)callSite, (Object)_5A.d("\u00ff", -3538536653763180895L, (long)l2), (Object)_5A.d("\u00ff", -3540065956233430678L, (long)l2), -3543411390026778572L, (long)l2);
            float f = (float)n / 2.0f;
            float f2 = (float)n / 2.0f - 8.0f;
            float f3 = f2 * 0.62f;
            float f4 = (f2 + f3) / 2.0f;
            _5A.d("b", (Object)callSite, (Object)_5A.d("b", (Object)_5A.d("\u00ff", -3538373023968935438L, (long)l2), 0.2f, -3540918865976197010L, (long)l2), -3540308786363968974L, (long)l2);
            _5A.d("b", (Object)callSite, (Object)_5A.d("\u00ff", -3542788908407455692L, (long)l2), -3536252906449792573L, (long)l2);
            _5A.d("b", (Object)callSite, (int)((int)(f - f2)), (int)((int)(f - f2)), (int)((int)(f2 * 2.0f)), (int)((int)(f2 * 2.0f)), -3543535929126372096L, (long)l2);
            _5A.d("b", (Object)callSite, (Object)_5A.d("\u00ff", -3543470459679892134L, (long)l2), -3540308786363968974L, (long)l2);
            _5A.d("b", (Object)callSite, (int)((int)(f - f3)), (int)((int)(f - f3)), (int)((int)(f3 * 2.0f)), (int)((int)(f3 * 2.0f)), -3543535929126372096L, (long)l2);
            _5A.d("b", (Object)callSite, (Object)_5A.d("b", (Object)_5A.d("\u00ff", -3538373023968935438L, (long)l2), 0.6f, -3540918865976197010L, (long)l2), -3540308786363968974L, (long)l2);
            _5A.d("b", (Object)callSite, (Object)_5A.d("\u00ff", -3542788908407455692L, (long)l2), -3536252906449792573L, (long)l2);
            _5A.d("b", (Object)callSite, (Object)new BasicStroke(2.5f), -3536633093845629554L, (long)l2);
            _5A.d("b", (Object)callSite, (int)((int)(f - f2)), (int)((int)(f - f2)), (int)((int)(f2 * 2.0f)), (int)((int)(f2 * 2.0f)), -3539671685711391687L, (long)l2);
            _5A.d("b", (Object)callSite, (int)((int)(f - f3)), (int)((int)(f - f3)), (int)((int)(f3 * 2.0f)), (int)((int)(f3 * 2.0f)), -3539671685711391687L, (long)l2);
            _5A.d("b", (Object)callSite, (Object)_5A.d("\u00ff", -3538373023968935438L, (long)l2), -3540308786363968974L, (long)l2);
            int n2 = _3C.cfr_renamed_7();
            _5A.d("b", (Object)callSite, (Object)_5A.d("\u00ff", -3542788908407455692L, (long)l2), -3536252906449792573L, (long)l2);
            float f5 = (float)n * 0.09f;
            Font font = new Font((String)((Object)_5A.a("r", 9972, (long)(0x4D250140780F158BL ^ l2))), 1, (int)f5);
            _5A.d("b", (Object)callSite, (Object)font, -3542746435836106097L, (long)l2);
            CallSite callSite2 = _5A.d("b", (Object)callSite, -3540445464870502962L, (long)l2);
            CallSite callSite3 = _5A.a("r", 8914, (long)(0x7FF911F2498411A9L ^ l2));
            int n3 = n2;
            CallSite callSite4 = _5A.d("b", string + (String)((Object)callSite3), 3, -3543774076937212342L, (long)l2);
            float f6 = (float)_5A.d("b", (Object)callSite2, (Object)callSite4, -3543081294326327144L, (long)l2);
            for (int j = 0; j < _5A.d("b", (Object)callSite4, -3535461601835307418L, (long)l2); ++j) {
                Object object;
                CallSite callSite5;
                block11: {
                    callSite5 = _5A.d("b", (Object)callSite4, (int)j, -3539753311706902920L, (long)l2);
                    try {
                        try {
                            try {
                                object = n3;
                                if (l2 >= 0L) {
                                    if (object == 0) break block10;
                                    object = callSite5;
                                }
                                if (n3 == 0) break block11;
                            }
                            catch (MatchException matchException) {
                                throw _5A.a((Exception)((Object)matchException));
                            }
                            if (object == _5A.c("x", 8559, (long)(0x5BA2F66DDA8C096DL ^ l2))) {
                                continue;
                            }
                        }
                        catch (MatchException matchException) {
                            throw _5A.a((Exception)((Object)matchException));
                        }
                    }
                    catch (MatchException matchException) {
                        throw _5A.a((Exception)((Object)matchException));
                    }
                    object = _5A.d("b", (Object)callSite2, (Object)_5A.d("b", (Object)callSite4, 0, (int)j, -3542274774434664839L, (long)l2), -3543081294326327144L, (long)l2);
                }
                float f7 = (float)object + (float)_5A.d("b", (Object)callSite2, (char)callSite5, -3538852838223538838L, (long)l2) / 2.0f;
                float f8 = f7 / f6 * ((float)Math.PI * 2) - 1.5707964f;
                float f9 = f + (float)_5A.d("s", (double)f8, -3543615227890584762L, (long)l2) * f4;
                float f10 = f + (float)_5A.d("s", (double)f8, -3536795136282056615L, (long)l2) * f4;
                CallSite callSite6 = _5A.d("b", (Object)callSite, -3539560323619521517L, (long)l2);
                _5A.d("b", (Object)callSite, (double)f9, (double)f10, -3544116384216858853L, (long)l2);
                _5A.d("b", (Object)callSite, (double)((double)f8 + 1.5707963267948966), -3536165310386352661L, (long)l2);
                float f11 = (float)_5A.d("b", (Object)callSite2, (char)callSite5, -3538852838223538838L, (long)l2);
                _5A.d("b", (Object)callSite, (Object)_5A.d("s", (char)callSite5, -3543697646018879838L, (long)l2), (float)(-f11 / 2.0f), (float)(f5 * 0.35f), -3535352030464661188L, (long)l2);
                _5A.d("b", (Object)callSite, (Object)callSite6, -3543141095500760128L, (long)l2);
                if (n3 != 0) continue;
            }
            if (l2 > 0L) {
                _5A.d("b", (Object)callSite, -3540795614289888432L, (long)l2);
            }
        }
        return bufferedImage;
    }

    private static boolean cfr_renamed_7(long l2, float f, byte by, int n, int n2, _84 var6_5) {
        float f2;
        block2: {
            block3: {
                long l3 = ((long)by << 56 | (long)n << 32 >>> 8 | (long)n2 << 40 >>> 40) ^ b;
                int n3 = _3C.cfr_renamed_4();
                try {
                    float f3 = (float)(l2 - _5A.d("L", (Object)var6_5, 8524456909690180985L, (long)l3)) / 1000.0f - f;
                    f2 = f3 == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1);
                    if (n3 != 0) break block2;
                    if (f2 <= 0) break block3;
                }
                catch (MatchException matchException) {
                    throw _5A.a((Exception)((Object)matchException));
                }
                f2 = 1.0f;
                break block2;
            }
            f2 = 0.0f;
        }
        return (boolean)f2;
    }

    /*
     * Exception decompiling
     */
    private static class_1011 net_minecraft_class_1011_7(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[DOLOOP]], but top level block is 5[SIMPLE_IF_TAKEN]
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

    @_3i_0
    public void cfr_renamed_0(_9o o) {
        block16: {
            _5A a2;
            CallSite callSite;
            long l2;
            block18: {
                block17: {
                    CallSite callSite2;
                    int n;
                    long l3;
                    block14: {
                        block15: {
                            l2 = b ^ 0x13AABACE213BL;
                            l3 = l2 ^ 0x2919FEDE956L;
                            n = _3C.cfr_renamed_7();
                            try {
                                callSite2 = _5A.d("L", (Object)_5A.d("L", (Object)this, -6192978855225075583L, (long)l2), -6183249113127038932L, (long)l2);
                                if (n == 0) break block14;
                                if (callSite2 != null) break block15;
                            }
                            catch (MatchException matchException) {
                                throw _5A.a((Exception)((Object)matchException));
                            }
                            return;
                        }
                        callSite2 = _5A.d("L", (Object)_5A.d("L", (Object)this, -6192978855225075583L, (long)l2), -6183249113127038932L, (long)l2);
                    }
                    callSite = _5A.d("b", (Object)callSite2, -6195635389530917980L, (long)l2);
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (n == 0) break block16;
                                            if (callSite != false) break block17;
                                        }
                                        catch (MatchException matchException) {
                                            throw _5A.a((Exception)((Object)matchException));
                                        }
                                        a2 = this;
                                        if (n == 0) break block18;
                                    }
                                    catch (MatchException matchException) {
                                        throw _5A.a((Exception)((Object)matchException));
                                    }
                                    if (_5A.d("L", (Object)a2, -6179958238671161905L, (long)l2) == false) break block17;
                                }
                                catch (MatchException matchException) {
                                    throw _5A.a((Exception)((Object)matchException));
                                }
                                a2 = this;
                                if (n == 0) break block18;
                            }
                            catch (MatchException matchException) {
                                throw _5A.a((Exception)((Object)matchException));
                            }
                            if (_5A.d("b", (Object)_5A.d("L", (Object)_5A.d("L", (Object)_5A.d("L", (Object)a2, -6192978855225075583L, (long)l2), -6193100037771025343L, (long)l2), -6179057146922257468L, (long)l2), -6179743275755914806L, (long)l2) == false) break block17;
                        }
                        catch (MatchException matchException) {
                            throw _5A.a((Exception)((Object)matchException));
                        }
                        Object[] objectArray = new Object[1];
                        objectArray[0] = l3;
                        _5A.d("b", (Object)this, (Object)objectArray, -6180901665194539410L, (long)l2);
                        _5A.d("b", (Object)_5A.d("L", (Object)this, -6195086127782053290L, (long)l2), (Object)new _84((class_243)_5A.d("b", (Object)_5A.d("L", (Object)_5A.d("L", (Object)this, -6192978855225075583L, (long)l2), -6183249113127038932L, (long)l2), -6180048816237052510L, (long)l2), (double)_5A.d("b", (Object)_5A.d("b", (Object)_5A.d("L", (Object)_5A.d("L", (Object)this, -6192978855225075583L, (long)l2), -6183249113127038932L, (long)l2), -6196683486508202627L, (long)l2), -6193013824408743932L, (long)l2), (long)_5A.d("s", -6179440751282689362L, (long)l2)), -6179551019885195373L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw _5A.a((Exception)((Object)matchException));
                    }
                }
                a2 = this;
            }
            _5A.d("N", (Object)a2, (boolean)callSite, -6179958238671161905L, (long)l2);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5A.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_5A.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5A.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

