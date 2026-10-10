/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 */
package dev.krypton;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.vertex.VertexFormat;
import dev.krypton._4w;
import dev.krypton._8B;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _6N {
    private final VertexFormat cfr_renamed_5;
    private final int cfr_renamed_235;
    public double cfr_renamed_2;
    private ByteBuffer cfr_renamed_377;
    private long cfr_renamed_7;
    private long cfr_renamed_373;
    private ByteBuffer cfr_renamed_0;
    private long cfr_renamed_9;
    private int cfr_renamed_6;
    private int cfr_renamed_4;
    private boolean cfr_renamed_143;
    private double cfr_renamed_1;
    private double cfr_renamed_3;
    private static String cfr_renamed_8;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static final long[] h;
    private static final Long[] i;
    private static final Map j;
    private static final Object[] k;
    private static final String[] l;

    /*
     * Unable to fully structure code
     */
    public void void_1(Object[] var1_1) {
        block12: {
            block10: {
                block11: {
                    block8: {
                        block9: {
                            var2_2 = (Long)var1_1[0];
                            var2_2 = _6N.a ^ var2_2;
                            var4_3 = _6N.cfr_renamed_3();
                            try {
                                try {
                                    v0 = _6N.d("E", (Object)this, (long)394776125677762732L, (long)var2_2);
                                    if (var4_3 != null) break block8;
                                    if (v0 == false) break block9;
                                }
                                catch (IllegalStateException v1) {
                                    throw _6N.a(v1);
                                }
                                throw new IllegalStateException((String)_6N.a("i", (int)32765, (long)(8416229178415775803L ^ var2_2)));
                            }
                            catch (IllegalStateException v2) {
                                throw _6N.a(v2);
                            }
                        }
                        try {
                            _6N.d("\u00a5", (Object)this, (long)_6N.d("E", (Object)this, (long)394647362031507696L, (long)var2_2), (long)393802352139515756L, (long)var2_2);
                            _6N.d("\u00a5", (Object)this, (int)_6N.b("s", (int)21060, (long)(3139061145843649533L ^ var2_2)), (long)392586491791029068L, (long)var2_2);
                            _6N.d("\u00a5", (Object)this, (int)_6N.b("s", (int)21060, (long)(3139061145843649533L ^ var2_2)), (long)392609957890950766L, (long)var2_2);
                            v3 = this;
                            if (var2_2 <= 0L) break block10;
                            _6N.d("\u00a5", (Object)v3, (boolean)_6N.b("s", (int)31725, (long)(5317726934084837975L ^ var2_2)), (long)394776125677762732L, (long)var2_2);
                            if (var4_3 != null) break block11;
                            v0 = _6N.d("\u00fe", (long)392048661945694225L, (long)var2_2);
                        }
                        catch (IllegalStateException v4) {
                            throw _6N.a(v4);
                        }
                    }
                    if (v0 == false) ** GOTO lbl37
                    var5_4 = _6N.d("\u00f6", (Object)_6N.d("\u00f6", (Object)_6N.d("E", (Object)_6N.d("\u00fe", (long)392474637292766783L, (long)var2_2), (long)392214262620186126L, (long)var2_2), (long)391921765090768597L, (long)var2_2), (long)393371521286700563L, (long)var2_2);
                    try {
                        _6N.d("\u00a5", (Object)this, (double)_6N.d("E", (Object)var5_4, (long)393610580348263089L, (long)var2_2), (long)393538208990934198L, (long)var2_2);
                        _6N.d("\u00a5", (Object)this, (double)_6N.d("E", (Object)var5_4, (long)393680048970591525L, (long)var2_2), (long)392143911319667300L, (long)var2_2);
                        if (var2_2 < 0L) break block11;
                        if (var4_3 == null) break block12;
lbl37:
                        // 2 sources

                        _6N.d("\u00a5", (Object)this, (double)0.0, (long)393538208990934198L, (long)var2_2);
                    }
                    catch (IllegalStateException v5) {
                        throw _6N.a(v5);
                    }
                }
                v3 = this;
            }
            _6N.d("\u00a5", (Object)v3, (double)0.0, (long)392143911319667300L, (long)var2_2);
        }
    }

    public GpuBuffer com_mojang_blaze3d_buffers_GpuBuffer_1(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = a ^ l2) ^ 0x72A904139C08L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _6N.d("\u00f6", (Object)_6N.d("E", (Object)this, 4020067875608473621L, (long)l2), (int)_6N.d("\u00f6", (Object)this, (Object)objectArray2, 4021764521542559788L, (long)l2), 4020867162877179061L, (long)l2);
        return _6N.d("\u00f6", (Object)_6N.d("E", (Object)this, 4021145131485446219L, (long)l2), (Object)_6N.d("E", (Object)this, 4020067875608473621L, (long)l2), 4021246055028388683L, (long)l2);
    }

    public _6N dev_krypton_6N_1(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        double d = (Double)objectArray[1];
        double d2 = (Double)objectArray[2];
        l2 = a ^ l2;
        CallSite callSite = _6N.d("E", (Object)this, -9067312957154742223L, (long)l2);
        _6N.d("G", (long)callSite, (float)((float)d), -9067980766054491613L, (long)l2);
        _6N.d("G", (long)(callSite + _6N.c("f", 27592, (long)(0x3EA105B2AF61C286L ^ l2))), (float)((float)d2), -9067980766054491613L, (long)l2);
        _6N n = this;
        _6N.d("\u00a5", (Object)n, (long)(_6N.d("E", (Object)n, -9067312957154742223L, (long)l2) + _6N.c("f", 6391, (long)(0x4B7175A45167B1BAL ^ l2))), -9067312957154742223L, (long)l2);
        return this;
    }

    public _6N(RenderPipeline renderPipeline, long l2) {
        long l3 = (l2 = a ^ l2) ^ 0x6317428A37DEL;
        this(renderPipeline.getVertexFormat(), l3, renderPipeline.getVertexFormatMode());
    }

    public _6N(VertexFormat vertexFormat, long l2, VertexFormat.class_5596 class_55962) {
        l2 = a ^ l2;
        _6N.d("\u00a5", (Object)this, 1.0, 1764371946876581679L, (long)l2);
        _6N.d("\u00a5", (Object)this, null, 1764881923077447585L, (long)l2);
        _6N.d("\u00a5", (Object)this, null, 1761665676015118873L, (long)l2);
        this.cfr_renamed_5 = vertexFormat;
        this.cfr_renamed_235 = (int)_6N.d("\u00f6", (Object)vertexFormat, 1763343110182709816L, (long)l2);
    }

    public _6N(int n, VertexFormat vertexFormat, VertexFormat.class_5596 class_55962, int n2, short s, int n3, int n4) {
        long l2;
        long l3 = l2 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)n4 << 48 >>> 48) ^ a;
        long l4 = l3 ^ 0x19A379CEC44DL;
        long l5 = l3 ^ 0x234EB26C6D68L;
        this(vertexFormat, l5, class_55962);
        Object[] objectArray = new Object[3];
        objectArray[2] = l4;
        objectArray[1] = n3;
        objectArray[0] = n2;
        _6N.d("\u00f6", (Object)this, (Object)objectArray, 2873721725420619266L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        block20: {
                            _6N.a = dev.krypton.l.a(-7105819847684853844L, 7241341593776245216L, MethodHandles.lookup().lookupClass()).a(250720483669412L);
                            _6N.k = new Object[65];
                            _6N.l = new String[65];
                            _6N.a();
                            _6N.d = new HashMap<K, V>(13);
                            var22 = _6N.a ^ 137013589061611L;
                            _6N.cfr_renamed_3(null);
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
                            var31_3 = new String[2];
                            var29_4 = 0;
                            var28_5 = "V\u009a\u00db\u00af\u00d3\u00c0\u00ecz\u008a\u00b6}2\u00c7\u0093\u0083\u00d1\u00f0\u00f3+\u00d4\u00c7\u00ca\u0013\u0012\u000e\u0019/%!\u00c8\u00bb\u00b4\u00c5\u00fc\u00ebt\u00c3\u00f9\r\u00af\u0085\u0012&Q\u00bb\u0012\u0095ya,\u0093\u00fd\u00d6r<w@\u0099}#\\=\u00d0EPL\u0083'!WZY\u00b5r\u009b\u00da\u009bP>\u00bbs\u00e97\u001a\u00ccL\u0086\u00f9\u0092LQD!\u00e2\u001e9f\u00e0\u0018\u00e8\u009c\u00d9\u00d4\u00fd\u00a2\u00d6\u00bc\u0087\u00e79&\u00e2\u00c7\u008d\u00bad\u001eS\u00b9\u00ff\u009c(\u009f\u0000f_,\u00a3\u009b[\"\u00ff\u00c6\u0092\u00cd\u00a2\b\u0002|b\u0006\u009fY\u00dfK";
                            var30_6 = "V\u009a\u00db\u00af\u00d3\u00c0\u00ecz\u008a\u00b6}2\u00c7\u0093\u0083\u00d1\u00f0\u00f3+\u00d4\u00c7\u00ca\u0013\u0012\u000e\u0019/%!\u00c8\u00bb\u00b4\u00c5\u00fc\u00ebt\u00c3\u00f9\r\u00af\u0085\u0012&Q\u00bb\u0012\u0095ya,\u0093\u00fd\u00d6r<w@\u0099}#\\=\u00d0EPL\u0083'!WZY\u00b5r\u009b\u00da\u009bP>\u00bbs\u00e97\u001a\u00ccL\u0086\u00f9\u0092LQD!\u00e2\u001e9f\u00e0\u0018\u00e8\u009c\u00d9\u00d4\u00fd\u00a2\u00d6\u00bc\u0087\u00e79&\u00e2\u00c7\u008d\u00bad\u001eS\u00b9\u00ff\u009c(\u009f\u0000f_,\u00a3\u009b[\"\u00ff\u00c6\u0092\u00cd\u00a2\b\u0002|b\u0006\u009fY\u00dfK".length();
                            var27_7 = 64;
                            var26_8 = -1;
lbl24:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl26:
                            // 1 sources

                            while (true) {
                                var31_3[var29_4++] = _6N.a(var32_9).intern();
                                if ((var26_8 += var27_7) < var30_6) {
                                    var27_7 = var28_5.charAt(var26_8);
                                    ** continue;
                                }
                                break block20;
                                break;
                            }
                            v3 = ++var26_8;
                            var32_9 = var24_1.doFinal(var28_5.substring(v3, v3 + var27_7).getBytes("ISO-8859-1"));
                            ** while (true)
                        }
                        _6N.b = var31_3;
                        _6N.c = new String[2];
                        _6N.g = new HashMap<K, V>(13);
                        var11_10 = Cipher.getInstance("DES/CBC/NoPadding");
                        v4 = SecretKeyFactory.getInstance("DES");
                        v5 = new byte[8];
                        v6 = v5;
                        v5[0] = (byte)(var22 >>> 56);
                        for (var12_11 = 1; var12_11 < 8; ++var12_11) {
                            v6 = v6;
                            v6[var12_11] = (byte)(var22 << var12_11 * 8 >>> 56);
                        }
                        var11_10.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                        var17_12 = new long[7];
                        var14_13 = 0;
                        var15_14 = "\u00bc\u001f\u0005CQ\u00db\u00a2#A\u00d3\u00a9\u00a9`\u00dc7\u00ad\u0099e\u00a9\u00d7\u00ee\u00b1\u00be\u00a9\u00ae\u00e3\u00b9\t\u0011\u00ed\u00a8@4\u001a'\u00ae\u00a1\u0088\u00f0U";
                        var16_15 = "\u00bc\u001f\u0005CQ\u00db\u00a2#A\u00d3\u00a9\u00a9`\u00dc7\u00ad\u0099e\u00a9\u00d7\u00ee\u00b1\u00be\u00a9\u00ae\u00e3\u00b9\t\u0011\u00ed\u00a8@4\u001a'\u00ae\u00a1\u0088\u00f0U".length();
                        var13_16 = 0;
                        while (true) {
                            var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                            v7 = var17_12;
                            v8 = var14_13++;
                            v9 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                            v10 = -1;
                            break block21;
                            break;
                        }
lbl62:
                        // 1 sources

                        while (true) {
                            v7[v8] = v11;
                            if (var13_16 < var16_15) ** continue;
                            var15_14 = "C\u00bc\u0018\u00c9!\u0089\u0086\u00b1\u00c8\u00b8\u00e5-c\u00fb8\u0012";
                            var16_15 = "C\u00bc\u0018\u00c9!\u0089\u0086\u00b1\u00c8\u00b8\u00e5-c\u00fb8\u0012".length();
                            var13_16 = 0;
                            while (true) {
                                var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                                v7 = var17_12;
                                v8 = var14_13++;
                                v9 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                                v10 = 0;
                                break block21;
                                break;
                            }
                            break;
                        }
lbl75:
                        // 1 sources

                        while (true) {
                            v7[v8] = v11;
                            if (var13_16 < var16_15) ** continue;
                            break block22;
                            break;
                        }
                    }
                    var19_18 = v9;
                    var21_19 = var11_10.doFinal(new byte[]{(byte)(var19_18 >>> 56), (byte)(var19_18 >>> 48), (byte)(var19_18 >>> 40), (byte)(var19_18 >>> 32), (byte)(var19_18 >>> 24), (byte)(var19_18 >>> 16), (byte)(var19_18 >>> 8), (byte)var19_18});
                    v11 = ((long)var21_19[0] & 255L) << 56 | ((long)var21_19[1] & 255L) << 48 | ((long)var21_19[2] & 255L) << 40 | ((long)var21_19[3] & 255L) << 32 | ((long)var21_19[4] & 255L) << 24 | ((long)var21_19[5] & 255L) << 16 | ((long)var21_19[6] & 255L) << 8 | (long)var21_19[7] & 255L;
                    switch (v10) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl88:
                        // 1 sources

                        ** continue;
                    }
                }
                _6N.e = var17_12;
                _6N.f = new Integer[7];
                _6N.j = new HashMap<K, V>(13);
                var0_20 = Cipher.getInstance("DES/CBC/NoPadding");
                v12 = SecretKeyFactory.getInstance("DES");
                v13 = new byte[8];
                v14 = v13;
                v13[0] = (byte)(var22 >>> 56);
                for (var1_21 = 1; var1_21 < 8; ++var1_21) {
                    v14 = v14;
                    v14[var1_21] = (byte)(var22 << var1_21 * 8 >>> 56);
                }
                var0_20.init(2, (Key)v12.generateSecret(new DESKeySpec(v14)), new IvParameterSpec(new byte[8]));
                var6_22 = new long[10];
                var3_23 = 0;
                var4_24 = "M\u00ab\u00c5\u00aaC\u00fb^Q\u00ac\u0099\u0080\u0090\u00c8<\u00cb\u0096\u00e1]\u009b1-\u00c9\u00e5Q\u0093\u00ce\u00a2\u00cco\u00992\u00b9\u0096\u009aar\u00eb\u00b25\u00db\u00ca\\\u00c9\u001b/\u00baF\u00bcp\u0012S\u00d2\u00c1\u001fT\u00b38~\u00ebd\u00b8\u0099\u009d\u00c7";
                var5_25 = "M\u00ab\u00c5\u00aaC\u00fb^Q\u00ac\u0099\u0080\u0090\u00c8<\u00cb\u0096\u00e1]\u009b1-\u00c9\u00e5Q\u0093\u00ce\u00a2\u00cco\u00992\u00b9\u0096\u009aar\u00eb\u00b25\u00db\u00ca\\\u00c9\u001b/\u00baF\u00bcp\u0012S\u00d2\u00c1\u001fT\u00b38~\u00ebd\u00b8\u0099\u009d\u00c7".length();
                var2_26 = 0;
                while (true) {
                    var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
                    v15 = var6_22;
                    v16 = var3_23++;
                    v17 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
                    v18 = -1;
                    break block23;
                    break;
                }
lbl115:
                // 1 sources

                while (true) {
                    v15[v16] = v19;
                    if (var2_26 < var5_25) ** continue;
                    var4_24 = "\u0082T\u00d5\u00eb\u00b4f\u00b0\u0098V\u0097b\u00d6\u00bd9\n\u0001";
                    var5_25 = "\u0082T\u00d5\u00eb\u00b4f\u00b0\u0098V\u0097b\u00d6\u00bd9\n\u0001".length();
                    var2_26 = 0;
                    while (true) {
                        var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
                        v15 = var6_22;
                        v16 = var3_23++;
                        v17 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
                        v18 = 0;
                        break block23;
                        break;
                    }
                    break;
                }
lbl128:
                // 1 sources

                while (true) {
                    v15[v16] = v19;
                    if (var2_26 < var5_25) ** continue;
                    break block24;
                    break;
                }
            }
            var8_28 = v17;
            var10_29 = var0_20.doFinal(new byte[]{(byte)(var8_28 >>> 56), (byte)(var8_28 >>> 48), (byte)(var8_28 >>> 40), (byte)(var8_28 >>> 32), (byte)(var8_28 >>> 24), (byte)(var8_28 >>> 16), (byte)(var8_28 >>> 8), (byte)var8_28});
            v19 = ((long)var10_29[0] & 255L) << 56 | ((long)var10_29[1] & 255L) << 48 | ((long)var10_29[2] & 255L) << 40 | ((long)var10_29[3] & 255L) << 32 | ((long)var10_29[4] & 255L) << 24 | ((long)var10_29[5] & 255L) << 16 | ((long)var10_29[6] & 255L) << 8 | (long)var10_29[7] & 255L;
            switch (v18) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl141:
                // 1 sources

                ** continue;
            }
        }
        _6N.h = var6_22;
        _6N.i = new Long[10];
    }

    public void void_9(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = a ^ l2) ^ 0x1953878A80DDL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l3;
        objectArray2[1] = 2;
        objectArray2[0] = 2;
        _6N.d("\u00f6", (Object)this, (Object)objectArray2, -5105691237523139200L, (long)l2);
    }

    public boolean boolean_9(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (boolean)_6N.d("E", (Object)this, -2065475341553885565L, (long)l2);
    }

    public GpuBuffer com_mojang_blaze3d_buffers_GpuBuffer_9(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        _6N.d("\u00f6", (Object)_6N.d("E", (Object)this, 7094282690798637080L, (long)l2), (int)(_6N.d("E", (Object)this, 7096204120163443046L, (long)l2) * 4), 7095844321422991616L, (long)l2);
        return _6N.d("\u00f6", (Object)_6N.d("E", (Object)this, 7095570197750945278L, (long)l2), (Object)_6N.d("E", (Object)this, 7094282690798637080L, (long)l2), 7096765456092908238L, (long)l2);
    }

    private static int b(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x1CC2;
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
                throw new RuntimeException("dev/krypton/6N", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _6N.f[n2] = n3;
        }
        return f[n2];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6N" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _6N.b(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _6N.a(l2, l3);
            object = k[n];
            try {
                if (!(object instanceof String)) break block2;
                _6N.k[n] = clazz = Class.forName(l[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _6N.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _6N.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _6N.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _6N.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _6N.a(l2, l3);
        Object object = k[n];
        if (object instanceof String) {
            String string = l[n];
            int n2 = string.indexOf(8);
            Class clazz = _6N.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _6N.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _6N.a(clazz3, string2, clazz2)) != null) {
                    _6N.k[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _6N.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _6N.k[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _6N.b(1793663950651561L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6N" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = _6N.c(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return l3;
    }

    private static long c(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x2B69;
        if (i[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = h[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])j.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/6N", exception);
            }
            long l5 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            _6N.i[n2] = l5;
        }
        return i[n2];
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6N" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method d(long l2, long l3) {
        int n = _6N.a(l2, l3);
        Object object = k[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = l[n];
                int n3 = string2.indexOf(8);
                clazz3 = _6N.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _6N.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _6N.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _6N.k[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _6N.b(1793663950651561L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _6N.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _6N.k[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _6N.b(1793663950651561L, 0L);
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

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x7ABA;
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
                throw new RuntimeException("dev/krypton/6N", exception);
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
            _6N.c[n2] = _6N.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _6N.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static int a(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (l[n3] != null) {
            return n3;
        }
        Object object = k[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 20;
            case 1 -> 61;
            case 2 -> 25;
            case 3 -> 10;
            case 4 -> 24;
            case 5 -> 36;
            case 6 -> 45;
            case 7 -> 57;
            case 8 -> 38;
            case 9 -> 40;
            case 10 -> 9;
            case 11 -> 39;
            case 12 -> 30;
            case 13 -> 12;
            case 14 -> 17;
            case 15 -> 32;
            case 16 -> 3;
            case 17 -> 42;
            case 18 -> 15;
            case 19 -> 62;
            case 20 -> 44;
            case 21 -> 28;
            case 22 -> 50;
            case 23 -> 22;
            case 24 -> 26;
            case 25 -> 29;
            case 26 -> 53;
            case 27 -> 27;
            case 28 -> 18;
            case 29 -> 55;
            case 30 -> 59;
            case 31 -> 2;
            case 32 -> 46;
            case 33 -> 35;
            case 34 -> 58;
            case 35 -> 5;
            case 36 -> 0;
            case 37 -> 63;
            case 38 -> 1;
            case 39 -> 34;
            case 40 -> 13;
            case 41 -> 54;
            case 42 -> 33;
            case 43 -> 56;
            case 44 -> 7;
            case 45 -> 60;
            case 46 -> 37;
            case 47 -> 31;
            case 48 -> 43;
            case 49 -> 8;
            case 50 -> 16;
            case 51 -> 6;
            case 52 -> 19;
            case 53 -> 48;
            case 54 -> 11;
            case 55 -> 51;
            case 56 -> 41;
            case 57 -> 21;
            case 58 -> 49;
            case 59 -> 23;
            case 60 -> 52;
            case 61 -> 4;
            case 62 -> 14;
            default -> 47;
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
        _6N.l[n3] = new String(cArray);
        return n3;
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = k;
        k[0] = "a_EC\n^|JG\u0002\u000f\u0002=x";
        objectArray[1] = Integer.TYPE;
        _6N.l[1] = "java/lang/Integer";
        objectArray[2] = "$\u0011d:ns9\u0004f{k/v:";
        objectArray[3] = Double.TYPE;
        _6N.l[3] = "java/lang/Double";
        objectArray[4] = Long.TYPE;
        _6N.l[4] = "java/lang/Long";
        objectArray[5] = "\"%8\u0012?K'03\u0012 E>#:Q}q(:0N*i9>3";
        objectArray[6] = Byte.TYPE;
        _6N.l[6] = "java/lang/Byte";
        objectArray[7] = Void.TYPE;
        _6N.l[7] = "java/lang/Void";
        objectArray[8] = "jYd|COjYs O@p\u0012s>OUwc\"f\u001d";
        objectArray[9] = "\u0012.M\u00198\u0007\u0012.ZE4\b\beZ[4\u001d\u000f\u0014\n\u0006e";
        objectArray[10] = "rGYj\u0017\trGN6\u001b\u0006h\fN(\u001b\u0013o}\u001aqM";
        objectArray[11] = Boolean.TYPE;
        _6N.l[11] = "java/lang/Boolean";
        objectArray[12] = "\n2%;\n\u0006\n22g\u0006\t\u0010y2y\u0006\u001c\u0017\be$_[";
        objectArray[13] = "=]\u007fu\r\u0002 H}4\b^mS";
        objectArray[14] = "\tJx\u001dQ}\u0014_z\\T!_";
        objectArray[15] = "K\u0001c\u0011RU>!h\u001eC\u001a_/c\u0015G@+";
        objectArray[16] = "rod\u0019n^\u0007Oo\u0016\u007f\u0011fAd\u001d{K\u0012";
        objectArray[17] = "x&cA\u00075{(;bP/w\u0005`FO>`";
        objectArray[18] = "\u007f\u0005\\\u0002\b\t|\u000b\u0004!S\u0001s\u0001X";
        objectArray[19] = ">q\u000b/cQ;d\u0000/MS7e\tsZR8o\u001f";
        objectArray[20] = "k\u001b!9k\tb\u0015\"p(\u0004d\u00156r5\u0002&\u0002)er\u0003pZ\u001art\u0012m\f\nxt\u000bi\u0000";
        objectArray[21] = Float.TYPE;
        _6N.l[21] = "java/lang/Float";
        objectArray[22] = "I4\u0002\u0019Y#@:\u0001P\u001a.F:\u0015R\u0007(\u00049\u001aQR)X(ApD9h.\tQQ>";
        objectArray[23] = "A\u0002k\u000fNG4\"`\u0000_\bU,k\u000b[R!";
        objectArray[24] = "MkOv\u001aWFd^9yZSb";
        objectArray[25] = ">I)\u000bE\u007f5F8D$q>M<\u001e";
        objectArray[26] = "VgZ\u0014&\u0000\u0015aM\u0002WPov^\u000foZSxY\u0002*";
        objectArray[27] = "6zV\u0018+S&\u007f\u0012\u001dAF?0*\u00061A,![\u001d-\u001aV8Z\u001c;B'#FGA[&\"P\u001f0@:y*";
        objectArray[28] = " Ki\u0019~!.Ld\\Dv\"^|J%a:&mQ&g*WvM}\u001d";
        objectArray[29] = "\u0017\u0019%\u007f}>T\u001f2i\fb.Y2w|1U\u0013\"\u007fe";
        objectArray[30] = "7\u000e<\u007fJ07\u001d$\u0019\u0015B!\u0004:cK3:\u0018a";
        objectArray[31] = "9E,e+@zC;sZ\u0018=?zs<\u0018:\u000f*;3\u0018";
        objectArray[32] = "\t.\u000f^h-Xq\u0003\t\u00042Xq1\u001ex\u0019Qs\u0000\u001f\u0004mK{\u0019\f\u007f'[s\u0000cjm\u000fd\u0012\u0018e=\noi^8h\tk\u001b\f\u007f1^\u0014";
        objectArray[33] = "^\u0005\u0005\u00055!\u001d\u0003\u0012\u0013D\u007fgE\u0006]<?[\u0011\f\u00066";
        objectArray[34] = ">D\u0015iCe}B\u0002\u007f2?\u0007QMlCajS\u001d>J\u0005:\u0002C2MwhE\u001ae2";
        objectArray[35] = "\u0013N\bF>5\\_\u001dXW:NM\u0019Y;\b\u001c\b@\u0003i_\u001eM\u0018U/nQ\r\u0012LW";
        objectArray[36] = "w\u0000\u007f\u0019@W4\u0006h\u000f1\bN@h\u0011AX5\nx\u0019X";
        objectArray[37] = "p.0&D\u0014!q<q(\u000b!q\u001d|P\u001fL.(tX\u00017d8|Anvj9kG\u0015<z1r(T2{&tS\u001e\"s?\u001b\u0015Rs()iG\u0015*\u007fV";
        objectArray[38] = "k\u0000\u0015+Y(v\u0001C.:i\u007f\u0015\u001f|VUb\u0014\u0015y[}{\u001c9sVyw;\u0005{Ty}q\u0013xF,=M\u001d\u007fKi\u0007\u001f\u0016t^->K\u0018wU\u0014";
        objectArray[39] = "\\\u000fAFL4\u001f\tVP=je\u001a\u0019CL0\b\u0018I\u0011ETXI\u0017\u001dB&\n\u000eNJ=";
        objectArray[40] = "Pp|i\u0010G\u0013vk\u007fa\u001f\u0013\n~c\u001d\u001fS6pd\u0010Z";
        objectArray[41] = "$\u001d1>T2g\u001b&(%jfgb'J\"r\u001c(7B;";
        objectArray[42] = "JK\u001aL\u000bK\tM\rZz\u001391\u000b[\u0018Q\u0012@\u0010GC";
        objectArray[43] = "\u001a4\u001f7Y-Ok\r0b+\f>\u000e!\u000f\n\u0007/\n\u0017\u001f.\u0018>\u001d]\u001a0\u0014)\u0006,\u0001,OS\f0\u001exLo\u00027\u0013=v";
        objectArray[44] = "7*w+r6xj}2\nik;r,]>1k,@0m5.h|dgn$";
        objectArray[45] = "z'(c@I9!?u1\u0018Cg+;IW\u007f3!`C";
        objectArray[46] = "\u0005Sgb+^\u0005@\u007f\u0004wikQsf1M\u001aJo=";
        objectArray[47] = "x(1$8i7h;=@6$94#\u0017a~ihOz2z,.s.8!&";
        objectArray[48] = "n9UONih}W\u0014%<1.]Drko|\u0002(\u001a=3$R\u0010\u001d)5-";
        objectArray[49] = "SfX(\u0006b\u0010`O>w8j&[p\u000f|VrQ+\u0005";
        objectArray[50] = "\\\u0002G{\b\u007fA\u0003\u0011~k,]\u000ft(\u0011?]\u0003q$\u0019.0\u000bZ'\u0011\"A\u0010F|k";
        objectArray[51] = ";V\u0013LJS5Q\u001e\tp\u000b1^\u000e\bp\u0017 Y\u0015\u0015\u0001\f<\u0002o\u001f\u001d\u0013h\u0001S\u0011\u001a\u001e-;";
        objectArray[52] = "D:Y6I[C._?\"\u0006\u0016)Z6N4Bd\u0006h\u0012cK*K)K\t\u0004;^7\"";
        objectArray[53] = "\u0012^Q\u0019\u001dxC\u0001]NqgC\u0001~H\u001dxC\u001fL\u001cqiV\u0018\u000eC\u000b:\u0017\u0005Z$K|A\u0014X_\u0001lI\r7";
        objectArray[54] = "\u001fOrQDRLFl\u0005{P.\u001baYCW\u001eK)VC";
        objectArray[55] = "lnD\u001594/hS\u0003HmUx\\\u001fv7ie]Is";
        objectArray[56] = "D^e?DkDM}Y\u001f\u0019RTc#EhIH8";
        objectArray[57] = "-9\r\u000f6k08[\nU*9,\u0007X9\u0016$-\r]4>=%>\\/+,8*L;9,2`Z8+yr\\T?&<H\u000e_43xqZQ78A";
        objectArray[58] = "\u0007\u001c~jq@VCr=\u001d_VC@*a{]Z\u0018mcUKIc's]R&`'\u007f@ZW{;$:\u0006\u001a'kbHT]~<\u001d";
        objectArray[59] = "\u0014c\u000e\u001bW\u000bE<\u0002L;\u0014E<0[G;Y%\u0005&\u0001\u000fG)\u0007]K\u001fO0h\u001aU\u0018F#\u0017\u001a\n\u0011EYU\u001a\u0004MW+\u0007]]\u001a(";
        objectArray[60] = "\u0002'h\u0016\fT\\7q\u0012n\u0013hY?P\u0002MXb9\u0014\u0000\u0016";
        objectArray[61] = "yQ/\u0003:\u000byB7ejyo[)\u001f;\btGr";
        objectArray[62] = "G\u000f\u0002\u0016\u0006d\u0004\t\u0015\u0000w<~\r\u001b\u0013\re\u000f\u0016\u0007H";
        objectArray[63] = "Fq:F\u0018N\u0005w-Pi\u0015\u007fs#C\u0013O\u000eh?\u0018";
        Object[] objectArray2 = objectArray;
        objectArray[64] = "@CI\u0014O\u000b\u0003E^\u0002>SyV\u0011\u0011O\u000f\u0014TACFk\u0001IB\t_\u001a\u001aU\u0019s";
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_3().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6N" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _6N.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'E' || c == '\u00a5' || c == '\u00fe' || c == 'T') {
                field = _6N.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'E' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00a5' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00fe' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _6N.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f6' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'G' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
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

    private int int_0(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (int)(_6N.d("E", (Object)this, -489090949213533395L, (long)l2) - _6N.d("E", (Object)this, -487683060182604623L, (long)l2));
    }

    public void void_0(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        long l2 = (Long)objectArray[2];
        l2 = a ^ l2;
        reference var6_5 = _6N.d("E", (Object)this, -7353678490650183501L, (long)l2) + (long)_6N.d("E", (Object)this, -7352999643528914200L, (long)l2) * _6N.c("f", 27592, (long)(0x3EA14B174E5FD95DL ^ l2));
        _6N.d("G", (long)var6_5, (int)n, -7352702382043985724L, (long)l2);
        _6N.d("G", (long)(var6_5 + _6N.c("f", 27592, (long)(0x3EA14B174E5FD95DL ^ l2))), (int)n2, -7352702382043985724L, (long)l2);
        _6N n3 = this;
        _6N.d("\u00a5", (Object)n3, (int)(_6N.d("E", (Object)n3, -7352999643528914200L, (long)l2) + 2), -7352999643528914200L, (long)l2);
    }

    public _6N dev_krypton_6N_0(Object[] objectArray) {
        double d = (Double)objectArray[0];
        long l2 = (Long)objectArray[1];
        double d2 = (Double)objectArray[2];
        double d3 = (Double)objectArray[3];
        l2 = a ^ l2;
        CallSite callSite = _6N.d("E", (Object)this, 9033706177301794629L, (long)l2);
        _6N.d("G", (long)callSite, (float)((float)(d - _6N.d("E", (Object)this, 9033968146458659999L, (long)l2))), 9033176907940799831L, (long)l2);
        _6N.d("G", (long)(callSite + _6N.c("f", 8007, (long)(0x5B565A9BB544C97BL ^ l2))), (float)((float)d2), 9033176907940799831L, (long)l2);
        _6N.d("G", (long)(callSite + _6N.c("f", 3916, (long)(0x77B3DF6F7C585973L ^ l2))), (float)((float)(d3 - _6N.d("E", (Object)this, 9031993308765026893L, (long)l2))), 9033176907940799831L, (long)l2);
        _6N n = this;
        _6N.d("\u00a5", (Object)n, (long)(_6N.d("E", (Object)n, 9033706177301794629L, (long)l2) + _6N.c("f", 5361, (long)(0x58447C767BC6C2CAL ^ l2))), 9033706177301794629L, (long)l2);
        return this;
    }

    public _6N dev_krypton_6N_6(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f2 = ((Float)objectArray[1]).floatValue();
        long l2 = (Long)objectArray[2];
        l2 = a ^ l2;
        CallSite callSite = _6N.d("E", (Object)this, -8786155552301272054L, (long)l2);
        _6N.d("G", (long)callSite, (float)f, -8785626230335447528L, (long)l2);
        _6N.d("G", (long)(callSite + _6N.c("f", 27592, (long)(0x3EA12546D5DEC6BDL ^ l2))), (float)f2, -8785626230335447528L, (long)l2);
        _6N n = this;
        _6N.d("\u00a5", (Object)n, (long)(_6N.d("E", (Object)n, -8786155552301272054L, (long)l2) + _6N.c("f", 6391, (long)(0x4B7155502BD8B581L ^ l2))), -8786155552301272054L, (long)l2);
        return this;
    }

    private void void_6(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        long l2 = (Long)objectArray[2];
        l2 = a ^ l2;
        _6N.d("\u00a5", (Object)this, (ByteBuffer)((Object)_6N.d("G", (int)(_6N.d("E", (Object)this, -5666749294700043254L, (long)l2) * n), -5666683724153210720L, (long)l2)), -5666895918274136444L, (long)l2);
        CallSite callSite = _6N.d("G", (Object)_6N.d("E", (Object)this, -5666895918274136444L, (long)l2), -5666541989828347659L, (long)l2);
        _6N.d("\u00a5", (Object)this, (long)callSite, -5668216639524279076L, (long)l2);
        _6N.d("\u00a5", (Object)this, (long)callSite, -5666809849671744704L, (long)l2);
        _6N.d("\u00a5", (Object)this, (ByteBuffer)((Object)_6N.d("G", (int)(n2 * 4), -5666683724153210720L, (long)l2)), -5667908271591947460L, (long)l2);
        _6N.d("\u00a5", (Object)this, (long)_6N.d("G", (Object)_6N.d("E", (Object)this, -5667908271591947460L, (long)l2), -5666541989828347659L, (long)l2), -5667729094339702759L, (long)l2);
    }

    public int int_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (int)_6N.d("E", (Object)this, -4784345314438168954L, (long)l2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void void_2(Object[] var1_1) {
        block22: {
            block21: {
                block19: {
                    block20: {
                        block17: {
                            block18: {
                                block15: {
                                    var2_2 = (Integer)var1_1[0];
                                    var3_3 = (Integer)var1_1[1];
                                    var4_4 = (Long)var1_1[2];
                                    v0 = var4_4 = _6N.a ^ var4_4;
                                    var6_5 = v0 ^ 88980300990624L;
                                    var8_6 = v0 ^ 75613282943181L;
                                    var10_7 = _6N.cfr_renamed_3();
                                    try {
                                        block16: {
                                            try {
                                                try {
                                                    try {
                                                        v1 = this;
                                                        if (var10_7 != null) break block15;
                                                        if (_6N.d("E", (Object)v1, (long)7714402292054060240L, (long)var4_4) == null) break block16;
                                                    }
                                                    catch (IllegalStateException v2) {
                                                        throw _6N.a(v2);
                                                    }
                                                    v3 = this;
                                                    if (var4_4 < 0L || var10_7 != null) break block17;
                                                }
                                                catch (IllegalStateException v4) {
                                                    throw _6N.a(v4);
                                                }
                                                if (_6N.d("E", (Object)v3, (long)7711217372475709800L, (long)var4_4) != null) break block18;
                                            }
                                            catch (IllegalStateException v5) {
                                                throw _6N.a(v5);
                                            }
                                        }
                                        v1 = this;
                                    }
                                    catch (IllegalStateException v6) {
                                        throw _6N.a(v6);
                                    }
                                }
                                v7 = new Object[3];
                                v7[2] = var6_5;
                                v7[1] = (int)_6N.b("s", (int)27046, (long)(3945580783790169701L ^ var4_4));
                                v7[0] = (int)_6N.b("s", (int)28990, (long)(2900526195281757945L ^ var4_4));
                                _6N.d("\u00f6", (Object)v1, (Object)v7, (long)7713764429777701615L, (long)var4_4);
                                return;
                            }
                            v3 = this;
                        }
                        try {
                            v8 = (_6N.d("E", (Object)v3, (long)7713232576578673972L, (long)var4_4) + var2_2) * _6N.d("E", (Object)this, (long)7714558025386344030L, (long)var4_4);
                            v9 = _6N.d("\u00f6", (Object)_6N.d("E", (Object)this, (long)7714402292054060240L, (long)var4_4), (long)7710773599026141127L, (long)var4_4);
                            v10 = var10_7;
                            if (var4_4 >= 0L) {
                                if (v10 != null) break block19;
                                if (v8 < v9) break block20;
                            }
                            ** GOTO lbl73
                        }
                        catch (IllegalStateException v11) {
                            throw _6N.a(v11);
                        }
                        v12 = new Object[1];
                        v12[0] = var8_6;
                        var11_8 = _6N.d("\u00f6", (Object)this, (Object)v12, (long)7716104229447628009L, (long)var4_4);
                        var12_9 = _6N.d("G", (int)(_6N.d("\u00f6", (Object)_6N.d("E", (Object)this, (long)7714402292054060240L, (long)var4_4), (long)7710773599026141127L, (long)var4_4) * 2), (int)(_6N.d("\u00f6", (Object)_6N.d("E", (Object)this, (long)7714402292054060240L, (long)var4_4), (long)7710773599026141127L, (long)var4_4) + var2_2 * _6N.d("E", (Object)this, (long)7714558025386344030L, (long)var4_4)), (long)7711235713347064401L, (long)var4_4);
                        var13_11 = _6N.d("G", (int)var12_9, (long)7714614492610683636L, (long)var4_4);
                        _6N.d("G", (long)_6N.d("G", (Object)_6N.d("E", (Object)this, (long)7714402292054060240L, (long)var4_4), (long)7712504770716361377L, (long)var4_4), (long)_6N.d("G", (Object)var13_11, (long)7712504770716361377L, (long)var4_4), (long)((long)var11_8), (long)7713649925605788951L, (long)var4_4);
                        _6N.d("\u00a5", (Object)this, (ByteBuffer)var13_11, (long)7714402292054060240L, (long)var4_4);
                        _6N.d("\u00a5", (Object)this, (long)_6N.d("G", (Object)_6N.d("E", (Object)this, (long)7714402292054060240L, (long)var4_4), (long)7712504770716361377L, (long)var4_4), (long)7710803387139077768L, (long)var4_4);
                        _6N.d("\u00a5", (Object)this, (long)(_6N.d("E", (Object)this, (long)7710803387139077768L, (long)var4_4) + (long)var11_8), (long)7714462047540238612L, (long)var4_4);
                    }
                    v8 = (_6N.d("E", (Object)this, (long)7713122249078499350L, (long)var4_4) + var3_3) * 4;
                    v9 = _6N.d("\u00f6", (Object)_6N.d("E", (Object)this, (long)7711217372475709800L, (long)var4_4), (long)7710773599026141127L, (long)var4_4);
                }
                try {
                    try {
                        v10 = var10_7;
lbl73:
                        // 2 sources

                        if (v10 != null) break block21;
                        if (v8 < v9) break block22;
                    }
                    catch (IllegalStateException v13) {
                        throw _6N.a(v13);
                    }
                    v8 = _6N.d("\u00f6", (Object)_6N.d("E", (Object)this, (long)7711217372475709800L, (long)var4_4), (long)7710773599026141127L, (long)var4_4) * 2;
                    v9 = _6N.d("\u00f6", (Object)_6N.d("E", (Object)this, (long)7711217372475709800L, (long)var4_4), (long)7710773599026141127L, (long)var4_4) + var3_3 * 4;
                }
                catch (IllegalStateException v14) {
                    throw _6N.a(v14);
                }
            }
            var11_8 = _6N.d("G", (int)v8, (int)v9, (long)7711235713347064401L, (long)var4_4);
            var12_10 = _6N.d("G", (int)var11_8, (long)7714614492610683636L, (long)var4_4);
            _6N.d("G", (long)_6N.d("G", (Object)_6N.d("E", (Object)this, (long)7711217372475709800L, (long)var4_4), (long)7712504770716361377L, (long)var4_4), (long)_6N.d("G", (Object)var12_10, (long)7712504770716361377L, (long)var4_4), (long)((long)_6N.d("E", (Object)this, (long)7713122249078499350L, (long)var4_4) * _6N.c("f", (int)27592, (long)(4512937842686634915L ^ var4_4))), (long)7713649925605788951L, (long)var4_4);
            _6N.d("\u00a5", (Object)this, (ByteBuffer)var12_10, (long)7711217372475709800L, (long)var4_4);
            _6N.d("\u00a5", (Object)this, (long)_6N.d("G", (Object)_6N.d("E", (Object)this, (long)7711217372475709800L, (long)var4_4), (long)7712504770716361377L, (long)var4_4), (long)7713569150479862349L, (long)var4_4);
        }
    }

    public static String cfr_renamed_3() {
        return cfr_renamed_8;
    }

    public static void cfr_renamed_3(String string) {
        cfr_renamed_8 = string;
    }

    public void cfr_renamed_6(Object[] objectArray) {
        _6N n;
        long l2;
        block4: {
            block5: {
                l2 = (Long)objectArray[0];
                l2 = a ^ l2;
                String string = _6N.cfr_renamed_3();
                try {
                    try {
                        n = this;
                        if (string != null) break block4;
                        if (_6N.d("E", (Object)n, 2092979613581107421L, (long)l2) != false) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw _6N.a(illegalStateException);
                    }
                    throw new IllegalStateException((String)((Object)_6N.a("i", 19619, (long)(0x656E329D26E5AB15L ^ l2))));
                }
                catch (IllegalStateException illegalStateException) {
                    throw _6N.a(illegalStateException);
                }
            }
            n = this;
        }
        _6N.d("\u00a5", (Object)n, (boolean)_6N.b("s", 12206, (long)(0xA808FE00806AE63L ^ l2)), 2092979613581107421L, (long)l2);
    }

    public int int_4(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        _6N n = this;
        CallSite callSite = _6N.d("E", (Object)n, 4930006675976254036L, (long)l2);
        _6N.d("\u00a5", (Object)n, (int)(callSite + true), 4930006675976254036L, (long)l2);
        return (int)callSite;
    }

    public void void_4(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = a ^ l2) ^ 0x709E82D8F9C0L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l3;
        objectArray2[1] = (int)_6N.b("s", 28733, (long)(0x6A80E1A878FE2CCFL ^ l2));
        objectArray2[0] = 4;
        _6N.d("\u00f6", (Object)this, (Object)objectArray2, -4595473634184024931L, (long)l2);
    }

    public void cfr_renamed_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        int n2 = (Integer)objectArray[2];
        int n3 = (Integer)objectArray[3];
        int n4 = (Integer)objectArray[4];
        l2 = a ^ l2;
        reference var9_7 = _6N.d("E", (Object)this, -1320557250890625811L, (long)l2) + (long)_6N.d("E", (Object)this, -1320986552609345866L, (long)l2) * _6N.c("f", 27592, (long)(0x3EA14765C91BAD03L ^ l2));
        _6N.d("G", (long)var9_7, (int)n, -1320689037645841254L, (long)l2);
        _6N.d("G", (long)(var9_7 + _6N.c("f", 27592, (long)(0x3EA14765C91BAD03L ^ l2))), (int)n2, -1320689037645841254L, (long)l2);
        _6N.d("G", (long)(var9_7 + _6N.c("f", 6391, (long)(0x4B713773371DDE3FL ^ l2))), (int)n3, -1320689037645841254L, (long)l2);
        String string = _6N.cfr_renamed_3();
        _6N.d("G", (long)(var9_7 + _6N.c("f", 17912, (long)(0x2F5423FDCF228334L ^ l2))), (int)n3, -1320689037645841254L, (long)l2);
        String string2 = string;
        try {
            _6N.d("G", (long)(var9_7 + _6N.c("f", 1, (long)(0x605BFBA6DFACC6C8L ^ l2))), (int)n4, -1320689037645841254L, (long)l2);
            _6N.d("G", (long)(var9_7 + _6N.c("f", 12233, (long)(0xB4F451D6ABE690DL ^ l2))), (int)n, -1320689037645841254L, (long)l2);
            _6N n5 = this;
            _6N.d("\u00a5", (Object)n5, (int)(_6N.d("E", (Object)n5, -1320986552609345866L, (long)l2) + _6N.b("s", 20563, (long)(0x556E100C5F8FA136L ^ l2))), -1320986552609345866L, (long)l2);
            if (_4w.cfr_renamed_8() == null) {
                _6N.cfr_renamed_3("koMzC");
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw _6N.a(illegalStateException);
        }
    }

    public void void_7(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = a ^ l2) ^ 0x1A325595F3DBL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l3;
        objectArray2[1] = 3;
        objectArray2[0] = 3;
        _6N.d("\u00f6", (Object)this, (Object)objectArray2, -3881271926965623162L, (long)l2);
    }

    public _6N dev_krypton_6N_7(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        _8B b = (_8B)objectArray[1];
        l2 = a ^ l2;
        CallSite callSite = _6N.d("E", (Object)this, 7253363577350280882L, (long)l2);
        _6N.d("G", (long)callSite, (byte)((byte)_6N.d("E", (Object)b, 7253300767709069450L, (long)l2)), 7254627169682784094L, (long)l2);
        _6N.d("G", (long)(callSite + 1L), (byte)((byte)_6N.d("E", (Object)b, 7252165081239718821L, (long)l2)), 7254627169682784094L, (long)l2);
        _6N.d("G", (long)(callSite + _6N.c("f", 17097, (long)(0x4191A6CD33230D0AL ^ l2))), (byte)((byte)_6N.d("E", (Object)b, 7254199863421015712L, (long)l2)), 7254627169682784094L, (long)l2);
        _6N.d("G", (long)(callSite + _6N.c("f", 11043, (long)(0x750F6E303EF8E4EAL ^ l2))), (byte)((byte)((float)_6N.d("E", (Object)b, 7254537695729782164L, (long)l2) * (float)_6N.d("E", (Object)this, 7253920025827167224L, (long)l2))), 7254627169682784094L, (long)l2);
        _6N n = this;
        _6N.d("\u00a5", (Object)n, (long)(_6N.d("E", (Object)n, 7253363577350280882L, (long)l2) + _6N.c("f", 27592, (long)(0x3EA174EB08A72405L ^ l2))), 7253363577350280882L, (long)l2);
        return this;
    }

    public void cfr_renamed_0(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        int n3 = (Integer)objectArray[2];
        long l2 = (Long)objectArray[3];
        l2 = a ^ l2;
        reference var7_6 = _6N.d("E", (Object)this, -3610071258856346457L, (long)l2) + (long)_6N.d("E", (Object)this, -3611628761474478340L, (long)l2) * _6N.c("f", 27592, (long)(0x3EA14419A8078D49L ^ l2));
        _6N.d("G", (long)var7_6, (int)n, -3611329254723035952L, (long)l2);
        _6N.d("G", (long)(var7_6 + _6N.c("f", 27592, (long)(0x3EA14419A8078D49L ^ l2))), (int)n2, -3611329254723035952L, (long)l2);
        _6N.d("G", (long)(var7_6 + _6N.c("f", 6391, (long)(0x4B71340F5601FE75L ^ l2))), (int)n3, -3611329254723035952L, (long)l2);
        _6N n4 = this;
        _6N.d("\u00a5", (Object)n4, (int)(_6N.d("E", (Object)n4, -3611628761474478340L, (long)l2) + 3), -3611628761474478340L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_6N.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_6N.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
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
            return MethodHandles.lookup().findStatic(_6N.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_6N.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

