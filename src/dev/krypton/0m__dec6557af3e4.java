/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.textures.GpuTexture
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  java.lang.MatchException
 *  net.minecraft.class_12137
 */
package dev.krypton;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
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
import net.minecraft.class_12137;

public class _0m {
    private static final int cfr_renamed_6;
    private static final GpuTexture[] cfr_renamed_1;
    private static final GpuTextureView[] cfr_renamed_3;
    private static int cfr_renamed_8;
    private static int cfr_renamed_4;
    private static int cfr_renamed_9;
    private static boolean cfr_renamed_0;
    private static class_12137 cfr_renamed_7;
    private static GpuTextureView cfr_renamed_5;
    private static boolean cfr_renamed_2;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static final Object[] h;
    private static final String[] i;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void cfr_renamed_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        RenderPipeline renderPipeline = (RenderPipeline)objectArray[1];
        GpuTextureView gpuTextureView = (GpuTextureView)objectArray[2];
        GpuTextureView gpuTextureView2 = (GpuTextureView)objectArray[3];
        int n = (Integer)objectArray[4];
        int n2 = (Integer)objectArray[5];
        float f = ((Float)objectArray[6]).floatValue();
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x738FE6DB6849L;
        long l5 = l4 >>> 16;
        int n3 = (int)(l4 << 48 >>> 48);
        long l6 = l3 ^ 0x737B35789BE8L;
        long l7 = l3 ^ 0xAC787CC3CE0L;
        long l8 = l3 ^ 0x4DD43C412EBCL;
        float f2 = 0.5f / (float)n;
        float f3 = 0.5f / (float)n2;
        CallSite callSite = _0m.c("d", (Object)_0m.c("r", -4419706809953818871L, (long)l2), -4417920645445241668L, (long)l2);
        CallSite callSite2 = _0m.c("d", (Object)callSite, () -> _0m.cfr_renamed_6(l5, (char)n3), (Object)gpuTextureView2, (Object)_0m.c("r", -4419963249175584504L, (long)l2), -4417970895297921238L, (long)l2);
        try {
            _0m.c("d", (Object)callSite2, (Object)renderPipeline, -4415910915732657666L, (long)l2);
            Object[] objectArray2 = new Object[3];
            objectArray2[2] = l7;
            objectArray2[1] = _0m.c("r", -4416370612721496912L, (long)l2);
            objectArray2[0] = _0m.c("N", -4418658523732885666L, (long)l2);
            _0m.c("d", (Object)callSite2, (Object)_0m.a("i", 27410, (long)(0x52EE61C170C21AE0L ^ l2)), (Object)_0m.c("r", (Object)objectArray2, -4418390644393092225L, (long)l2), -4418167203024136153L, (long)l2);
            Object[] objectArray3 = new Object[4];
            objectArray3[3] = Float.valueOf(f);
            objectArray3[2] = l6;
            objectArray3[1] = Float.valueOf(f3);
            objectArray3[0] = Float.valueOf(f2);
            _0m.c("d", (Object)callSite2, (Object)_0m.a("i", 18947, (long)(0x2DBD88ACF9223BF0L ^ l2)), (Object)_0m.c("r", (Object)objectArray3, -4418767748767875131L, (long)l2), -4418167203024136153L, (long)l2);
            Object[] objectArray4 = new Object[1];
            objectArray4[0] = l8;
            _0m.c("d", (Object)callSite2, (Object)_0m.a("i", 18892, (long)(0x5F53092D2CDD3838L ^ l2)), (Object)gpuTextureView, (Object)_0m.c("r", (Object)objectArray4, -4419250470660845536L, (long)l2), -4420140757970082424L, (long)l2);
            _0m.c("d", (Object)callSite2, 0, (Object)_0m.c("N", -4418257059190672077L, (long)l2), -4416724026049521524L, (long)l2);
            _0m.c("d", (Object)callSite2, (Object)_0m.c("N", -4419729223432811167L, (long)l2), (Object)_0m.c("N", -4416896690440537442L, (long)l2), -4417586449047177878L, (long)l2);
            _0m.c("d", (Object)callSite2, 0, 0, (int)_0m.b("h", 16530, (long)(0x3D62DCC2DDDD0744L ^ l2)), 1, -4420147471480843162L, (long)l2);
        }
        finally {
            _0m.c("d", (Object)callSite2, -4416536678524496367L, (long)l2);
        }
    }

    public static void cfr_renamed_5(boolean bl) {
        cfr_renamed_2 = bl;
    }

    private _0m() {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        _0m.a = l.a(-6683418157771530946L, -7955860789251746350L, MethodHandles.lookup().lookupClass()).a(129163005335421L);
                        _0m.h = new Object[94];
                        _0m.i = new String[94];
                        _0m.a();
                        _0m.d = new HashMap<K, V>(13);
                        var11 = _0m.a ^ 63888101073510L;
                        _0m.cfr_renamed_5(true);
                        var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var11 >>> 56);
                        for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                            v2 = v2;
                            v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                        }
                        var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var20_3 = new String[8];
                        var18_4 = 0;
                        var17_5 = "E\u007f\u00830\u00f2\u00e6_\u000f\u00c0c\u00ab`\u00cd\u00c7l\u001a\u00b2\u00e2\u00996o\u00bb\u001a\t\u00c4\u00e2\u0007\u00b6\u0004\u0082S` \u0095\u00da\u0080\u00a2\u00a3\u0007\u00f5\u0087f\u00cab\u00f3NQ`\u0083\u001e>\u001f>\u00ab\u00e2\u00a9`\u00c0fy\u00e5\u00ad\u000b\u00d5\t \u00a6\u001f\u00d42\u00d1\u008b\u000f\u00d6|%|\rsG\u00c0_\u0007l@\u0084\u00f1\u008a\u00e4D\u00f4M\u00d6*#c\u00f6\u00de\u0018\u00a3\u00e7\u00e0\u00d3(\u00b3N\u00bfh\u0006\u0097\u00c2\u00b2j\"\u00b5&W\u00df\u00e8V\u00bb~q \u00d8\u00c0\u0015\u00f0\u00e6DX\u00ec\u0019\u0086\u00d9\u00a2\u00af\u000e\u00bc\u00d72\u0086\u00d7\u00bd\\\u0007\u0082Pfg\u00ff5Z\u00e9y\u001f(E\u0092)\u00ce\u00f4\u00ea\u00d9\r\u00dap\u00d8\u0088Q\u00d4\u0084C\u00ac8m\u008b\u008d\u00e9Tm\u00ccWeD[\u0004\u00b5\u00a9\u00f7\u00af\u00d6\u00f6\u00d3\u00bd\u00be\t";
                        var19_6 = "E\u007f\u00830\u00f2\u00e6_\u000f\u00c0c\u00ab`\u00cd\u00c7l\u001a\u00b2\u00e2\u00996o\u00bb\u001a\t\u00c4\u00e2\u0007\u00b6\u0004\u0082S` \u0095\u00da\u0080\u00a2\u00a3\u0007\u00f5\u0087f\u00cab\u00f3NQ`\u0083\u001e>\u001f>\u00ab\u00e2\u00a9`\u00c0fy\u00e5\u00ad\u000b\u00d5\t \u00a6\u001f\u00d42\u00d1\u008b\u000f\u00d6|%|\rsG\u00c0_\u0007l@\u0084\u00f1\u008a\u00e4D\u00f4M\u00d6*#c\u00f6\u00de\u0018\u00a3\u00e7\u00e0\u00d3(\u00b3N\u00bfh\u0006\u0097\u00c2\u00b2j\"\u00b5&W\u00df\u00e8V\u00bb~q \u00d8\u00c0\u0015\u00f0\u00e6DX\u00ec\u0019\u0086\u00d9\u00a2\u00af\u000e\u00bc\u00d72\u0086\u00d7\u00bd\\\u0007\u0082Pfg\u00ff5Z\u00e9y\u001f(E\u0092)\u00ce\u00f4\u00ea\u00d9\r\u00dap\u00d8\u0088Q\u00d4\u0084C\u00ac8m\u008b\u008d\u00e9Tm\u00ccWeD[\u0004\u00b5\u00a9\u00f7\u00af\u00d6\u00f6\u00d3\u00bd\u00be\t".length();
                        var16_7 = 32;
                        var15_8 = -1;
lbl24:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl29:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = _0m.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00c6\u0006\u00eb#N\u00ff\u001cF\u00f6\u0014]\u00a8Z\u00fbE\u00b6\u0098\u00f2k\u0083\u0098\u00ad\u00c7\u0014CZg\u00f4\u001b\u00b5\u00bb\u00e0 \u0005\u00cc),mK:\u00cc\u00ed\u00c5\u00a5\u0017f6\u00e3E\u0016Q\u00bbxV!g|9\u0000K\u001a\u001d\u00d9\u00f7\u00fe";
                            var19_6 = "\u00c6\u0006\u00eb#N\u00ff\u001cF\u00f6\u0014]\u00a8Z\u00fbE\u00b6\u0098\u00f2k\u0083\u0098\u00ad\u00c7\u0014CZg\u00f4\u001b\u00b5\u00bb\u00e0 \u0005\u00cc),mK:\u00cc\u00ed\u00c5\u00a5\u0017f6\u00e3E\u0016Q\u00bbxV!g|9\u0000K\u001a\u001d\u00d9\u00f7\u00fe".length();
                            var16_7 = 32;
                            var15_8 = -1;
lbl38:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl43:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = _0m.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var21_9 = var13_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                _0m.b = var20_3;
                _0m.c = new String[8];
                _0m.g = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[8];
                var3_13 = 0;
                var4_14 = "92\u00a7h\u0086\u0001hY\u00af\u00b1\u009d\u00bc\u00a1\u00a1\n\u0093(\b\u00d0\u00ad\u008bw\u0086\u00a7k\u00b5\u0087\u00c2\u00ea\u00c6i\u001bD\u00a5 D$\u00da\u0002{]\u0097\u0091<\u00a4\u00bd^\u00f7";
                var5_15 = "92\u00a7h\u0086\u0001hY\u00af\u00b1\u009d\u00bc\u00a1\u00a1\n\u0093(\b\u00d0\u00ad\u008bw\u0086\u00a7k\u00b5\u0087\u00c2\u00ea\u00c6i\u001bD\u00a5 D$\u00da\u0002{]\u0097\u0091<\u00a4\u00bd^\u00f7".length();
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
                    var4_14 = "\u0004\u00bf\u00e9`qD(C\u007fP\u000b\u0014\u009a'\u0083\u00c3";
                    var5_15 = "\u0004\u00bf\u00e9`qD(C\u007fP\u000b\u0014\u009a'\u0083\u00c3".length();
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
        _0m.e = var6_12;
        _0m.f = new Integer[8];
        _0m.cfr_renamed_6 = (int)_0m.b("h", (int)6448, (long)(var11 ^ 7000544850818431941L));
        _0m.cfr_renamed_1 = new GpuTexture[5];
        _0m.cfr_renamed_3 = new GpuTextureView[5];
    }

    public static GpuTextureView cfr_renamed_1(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return _0m.c("N", -358420769348790631L, (long)l2);
    }

    private static int b(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x569;
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
                throw new RuntimeException("dev/krypton/0m", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _0m.f[n2] = n3;
        }
        return f[n2];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0m" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _0m.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _0m.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _0m.a(l2, l3);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                _0m.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _0m.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _0m.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _0m.b(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0m" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l2, long l3) {
        int n = _0m.a(l2, l3);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = _0m.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _0m.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _0m.a(clazz3, string2, clazz2)) != null) {
                    _0m.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _0m.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _0m.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _0m.b(2900623669947688L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _0m.a(l2, l3);
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
                clazz3 = _0m.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _0m.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _0m.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _0m.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _0m.b(2900623669947688L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _0m.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _0m.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _0m.b(2900623669947688L, 0L);
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "3=\u0004l5S:3\u0007%v^<3\u0013'kX~!\u00101,Y=!G\u0010=R47\u001b\u00129O#";
        objectArray[1] = "S\tc\u001fE\"Z\u0007`V\u0006/\\\u0007tT\u001b)\u001e\u0004{WN(B\u0015 vX8r\u0013hWM?";
        objectArray[2] = "\u0000\u0015)Ib7\t\u001b*\u0000!:\u000f\u001b>\u0002<<M\f!\u0015{=\u001bT\u0012\u0002},\u0006\u0002\u0002\b}5\u0002\u000e`\u0004c9\u0010\t\u001bR:aV";
        objectArray[3] = Void.TYPE;
        _0m.i[3] = "java/lang/Void";
        objectArray[4] = "iD2W<kbK#\u0018AsqL*Q";
        objectArray[5] = "jiRs\n\ncgQ:I\u0007egE8T\u0001'dJ;\u0001\u0000{u\u0011\u001a\u0017\u0010KsY;\u0002\u0017ZjV>\u0002";
        objectArray[6] = "M\u000e*`'\u000bD\u0000))d\u0006B\u0000=+y\u0000\u0000\u0012>=>\u0001C\u0012i\r%\tC\u0000)*\u000f\nM\u000e#+8";
        objectArray[7] = "00ucIN.8o,\u0001N42wk\bUt\u0002vr\u0017W34q";
        objectArray[8] = "\nJ?gL,\u0003D<.\u000f!\u0005D(,\u0012'GQ71U6\u001b@!gf3\u001cq71U6\u001b@\u0004 D4";
        objectArray[9] = "2PooAI,Xu  L,Xv`\u000eP\u0011_m";
        objectArray[10] = "S\u0016qb\u001e\fZ\u0018r+]\u0001\\\u0018f)@\u0007\u001e\ne?\u0007\u0006]\n2\u000b\u0003\u0016t\u001cj%\u0010\u0006";
        objectArray[11] = Integer.TYPE;
        _0m.i[11] = "java/lang/Integer";
        objectArray[12] = "e0HtaSl>K=\"^j>_??X(/L*iPo1@t^Yh;@(\\Uv:I3bY";
        objectArray[13] = "\\\u000b\tnl\nA\u001e\u000b/iV\b^";
        objectArray[14] = "\u0015=YGS\u0017\u0015=N\u001b_\u0018\u000fvN\u0005_\r\b\u0007\u001c[\u000fML";
        objectArray[15] = "q\u0016W\u001e\u00147l\u0003U_\u0011k-?";
        objectArray[16] = "\u0012a\u0002b\u001c!gA\tm\rn\u0006O\u0002f\t4r";
        objectArray[17] = ",\u0004?\u001e\"\u000e1\u0011=_'RpY";
        objectArray[18] = "kP\r_6\u0006vE\u000f\u001e3Z;^";
        objectArray[19] = ",gph+v.y9\u000b m1|or'";
        objectArray[20] = "\u0003nb~9*\u001e{`?<vWf";
        objectArray[21] = "]\u0007'<s\u001a(',3bUI)'8f\u000f=";
        objectArray[22] = "\n\u0004\u0019lP\u0011\u0003\n\u001a%\u0013\u001c\u0005\n\u000e'\u000e\u001aG\u0018\r1I\u001b\u0004\u0018Z\u0010X\u0010\r\u000e\u0006\u0011D\r\u001d\u000e\u0019";
        objectArray[23] = "\u000eCp\u0005N~\f]9fEe\u0013Xo\u001fBB\u0015Pt@";
        objectArray[24] = "Wf&`$\u0002Js$!!^\u000bB";
        objectArray[25] = "fwirPH\u0013Wb}A\u0007rYivE]\u0006";
        objectArray[26] = "CF2{;eCF%'7jY\r%97\u007f^|tb`";
        objectArray[27] = "Fk7'9\tpH>):@3E8).B.Cz<1_iR&-'\tZW!\u001c1_iR&-\u0002NxPo";
        objectArray[28] = Boolean.TYPE;
        _0m.i[28] = "java/lang/Boolean";
        objectArray[29] = "oDZSuxoDM\u000fywu\u000fM\u0011ybr~\u001dL(";
        objectArray[30] = "V)DH\u007f\u0016#\tOGnYB\u0007DLj\u00036";
        objectArray[31] = "QBa\u0005/ygah\u000b,0$ln\u000b829j,\u001e'/~{p\u000f1yM~w>'/~{p\u000fy";
        objectArray[32] = "f\u001f1PQTm\u0010 \u001f2Yx\u0016";
        objectArray[33] = "W\tQ\u001cp\u001e^\u0007RU3\u0013X\u0007FW.\u0015\u001a\u0012YJi\u0004F\u0003O\u001cZ\u0001A2YJi\u0004F\u0003";
        objectArray[34] = "c\u00044[5\u0012\u0016$?T$]w*4_ \u0007\u0003";
        objectArray[35] = "\u0010Q<H\u0010/eq7G\u0001`\u0004\u007f<L\u0005:p";
        objectArray[36] = "\t\u00011\u0018yE\u0000\u000f2Q:H\u0006\u000f&S'ND\u001a9N`_\u0018\u000b/\u0018@O\u0012\u001a)Dql\u0005\u001c1W`";
        objectArray[37] = "\u0017\u0010T@GZb0_OV\u0015\u0003>TDROw";
        objectArray[38] = "Q\u0004\u0006$#HX\n\u0005m`E^\n\u0011o}C\u001c\u001f\u000er:R@\u000e\u0018$\bN^\u001f\u000ex\u0003HV\u000e";
        objectArray[39] = "Ea-Re\u0016Ea:\u000ei\u0019_*:\u0010i\fX[hN9L\u001d";
        objectArray[40] = "`%`\n\\Wi+cC\u001fZo+wA\u0002\\->h\\EMq/~\np\\g8hWBul.h";
        objectArray[41] = "Qxe<|LZwts\u001dBQ|p)";
        objectArray[42] = "\u0003q\u0003a^8Q\u007f\u0003\u001c\u0015-\u0014_\u0007p\u00030\"c\u000fr\u0003:ho\u0011r\f%V`Pgny\u0015a[d\u0017zW~\u0005\u001cT}\u000e`\u001al\u001c$W\u007fa";
        objectArray[43] = "j[0\\0Jv_4\u000eUJ\u0007\u0001s\u001fm\u001fe\u0002n\\i";
        objectArray[44] = "L[!t6\u0011\u0016Zw(F\u0007\nYwl+6\u001dRr}<4\u0019Oe\u0010z\u001c\u0014P/w6\fO]\u001e.|\u000b\u0010\bcl<\u0006H4 q7\u000fIW\u007fa9\u0012p_qr;\\\b\r\u007frF";
        objectArray[45] = "\u000f\u00029yQe\u000eMxb26K\u001el}_\u0016V\u0016`hT1|\u0015nf^0Ks9n\r9A\u000eco[e1";
        objectArray[46] = "-\u0001\"ocmv\u0018+n\u00074!\u0014O+z2+\\p*9+%dpid2p[q*}<H[2wdiwZqnjQ";
        objectArray[47] = "\bU8n-)V\u0007)tF*\b\u0007?|\u0011}UZa\u0010y9\n\tc/xz\u0013\u0007";
        objectArray[48] = "\u001c.H$1V\u0004!@4S\u0002\u0017=q;2\u0002\u001a=1i.\u000e\u0019y\u000ehm\u0017\u0017A\u000e+0\u000eB~\u000fh)\u0000z";
        objectArray[49] = "|G\u001e?`8>\u0007\u0013g\\.&\u001a\u00022\\\u007f\u007f\u001b\u0007$,7&B\u0018_";
        objectArray[50] = " A+s\u001ddrO+\u000eVq7v(v@x*H$\u000e\u001d{%\u0017(b\\\"9RI4\u0010z5U9|I#*.";
        objectArray[51] = "iv\\\u0014C<qyT\u0004!lk~^\u000b!=2\u007f[\u001dQuk&Df";
        objectArray[52] = "\u001f4M\u001aKo\u00030IH.cr5\nEMfM4I\\C";
        objectArray[53] = "F^\fa\u00050VW\u0019\u007ft;-^\u001amMaA\u001fCq\b";
        objectArray[54] = "3\u000ePn>ivV\u0000{@4$\u0011\rl,\u0006vPW:{Q3\u0016Uvp?4\tUt@+2U\u0010;.,-U\u0012\u000b908\f\u0014a/19]mr! (\u0014\u0007d !ym\u000ft0kvQTu\"`I\u0004\u0007o!#4S\u0000d Q";
        objectArray[55] = "FA6O\u001fP\u001dX?N{\tBB[\u000b\u0006\u000f@\u001cd\nE\u0016N$dI\u0018\u000f\u001b\u001be\n\u0001\u0001#\u001b&W\u0018T\u001c\u001aeN\u0016l";
        objectArray[56] = "-1\u000e\u0016n\u001015\nD\u000b\u0011@mKZ1\u001e|6JH:";
        objectArray[57] = "n'\u0018v\u001eW<)\u0018\u000bEKb3\u0017\u000b\u0014\u0012c6\u0001{\\K:)z";
        objectArray[58] = "\u001dF\u0012%b\u000e\u0001B\u0016w\u0007\u0007pGUzd\u0007OF\u0016cj";
        objectArray[59] = "O-N*%wZ>\\s\u001afL!h-vdE\u0003L'eR]4F)\u001af\u0019,\u001c7&s\u001f%HJ";
        objectArray[60] = "t\u001a|wC\u0019wXc);\u000e,\ng!lZr\\<v;Y0\u001895BZr\u0007g";
        objectArray[61] = "\u001c\u0019A\f-<\u0000\u001dE^H2q\u0018\u0006S+5N\u0019EJ%";
        objectArray[62] = "^8LP4\u007f\f6L-\u007fjI\tCWxjE\u001dSCjjOW\u0011Pgd\rh\u0010\u0013~j5&^Cfb\u000b)\u001fV\u0004=\b1PVtuQhO-";
        objectArray[63] = "ET,9)@YP(kLH(T,b,MU\u0016lot";
        objectArray[64] = "\u0003tg\u0018.G\u0002;&\u0003M\u0014Gh2\u001c #Pu'\u001d7\u0012cd6\u001fM\u0019R|)\u0002v\u0001]t9`sEZeg\u001d1\u0005W=[";
        objectArray[65] = "8%6b\u0010\u0015#q=+v \u000f\u0003\u0005*v\u0002,34|\u0019\u0019x8}";
        objectArray[66] = "j!\u0002ow)v%\u0006=\u0012$\u0007f\u0007nj(|#B./\u0018nu\\2`e9rW3\u0012";
        objectArray[67] = "?\u0015\\zD,*\u0006N#{=<\u0019ds\u001e*5\bEQ\u001291\b?`\u0018o4\u001b\u0007%@?!e";
        objectArray[68] = "&lg%'\u00013\u007fu|\u0018\u0010%`H(f\u001e#q\u0004{iC0\u007f<z&\u0002+\u001c";
        objectArray[69] = "o\u0004U:n\u0005h\u001bU8^ Q6(\u001f\t7R( \u000b\u0011&\u0015\u0005\u0016\u007f#[{\u0002\t\u007f!";
        objectArray[70] = "\u0014\u0005\u00077b'\b\u0001\u0003e\u0007*yRWofd\u0004\u0005Pdg";
        objectArray[71] = "Ge_D'}ChMBMwIyQ[!E\u001d8\u000b\u0006Ms\u001bfOW -IwU<";
        objectArray[72] = "!d\u0004v\nL~t\nk3Bz}\td3\u0011~t\u0016,PNnz\u000b\u0015";
        objectArray[73] = "9\u0013\u0011uO}%\u0017\u0015'*|TT\u0014tR|/\u0011Q4\u0017Ln\u0010M7Q<&I\u0014(*";
        objectArray[74] = "J\u000e|UXx\u0014\\mO3{J\\{Gd,\u0017\u0001&+\fhHR'\u0014\r+Q\\";
        objectArray[75] = "f\u000eB{^\u001b1O\u00061g\u0013WN\u000bn\u0005GiAJ{";
        objectArray[76] = "o!af#\ts%e4F\u0005\u0002fdg>\by#!'{88\"=$=Hp{d;F";
        objectArray[77] = "\u0019&1 /7K(1]s5\u001b6\u0012;s\"\u0002$?] 2\u0011*kb!q\b$Sbb,\u0011qlc!5\u001fIl |,Jvmce\"rv.>|wMwm'rOHt5#d?\u0000-l<\u001f";
        objectArray[78] = "^\u000e\u0010t\u000ek\f\u0000\u0010\tTrS\r.dNoH\u001b\u001f\t\u0005*J\\KcN*K\u0004r7\u0004tU]\u000fuDy\ra\u001bcZrG\u001cLdQs5[Oo@hE\u0013\u00166_\u0013";
        objectArray[79] = "\u001e|j\u001ad|\u0002xnH\u0001ts;o\u001by}\b~*[<MI\u007f6Xz=\u0001&oG\u0001";
        objectArray[80] = "#\u001dH\u000bnIt\\\fAW@\u0012]\u0001\u001e5\u0015,R@\u000b";
        objectArray[81] = "\u0018\\:\u0015\u001f\u0011\u001cQ(\u0013u\u001b\u0016@4\n\u0019)B\u0001iTu\u001d\u001bR,\u0007\u001a\u0019\u0016@*m";
        objectArray[82] = "=\f;s\u0018wo\u0002;\u000eSb*>?oFh,\u0006Y5\u0011pkZ3~\u0011q3cbmEqo\u000637JaVYdhVt&\u0011=1I\u000f";
        objectArray[83] = "\u0015w8RHT\u00148yI+\u0007QkmVF0FvxWQ\u0001+==U\u0016UAv=TNl\u0014{gI\u0013S\u00158~G+\u0014G||LD\u000f\u0013w5*\u0014\u0011He<\u0015\u0015RQk\u0004\u0015V\u000fH>;\u0014\u0015\u0016F\u0006;WH\u000f\u00139:\u0014Q\u0001+9yIHT\u00148:PFlMi}XIWUfuH+";
        objectArray[84] = "7I \u0004 .!H!UY\u0000\u000fn\u001c,\u0003D7I \u0004 .!H!U";
        objectArray[85] = "!\u0019)hdc=\u001d-:\u0001hLFl?xh,\\w3l";
        objectArray[86] = "M;~sa\"\u001c`(%\r\"$#xuu._f=50\u001e\u001f9*64{Nc%&\r";
        objectArray[87] = "`zMb\u0012_psX|cP\u000bz[nZ\u000eg;\u0002r\u001f";
        objectArray[88] = "pW\u0019\u001b@j`^\f\u00051jWgX\u001e_cz\u000b\u0019GC&";
        objectArray[89] = "kA'\u00102&w\u001c.\nHs\u000b\u0000qO0|pE4\u000fuL0\u001a#\fq)a@,\u001cH";
        objectArray[90] = "\f=fL!\b\u00142n\\C\\\u0007.@_/O\nR C PRm!\u00009^jmb] \u000bUl!D.3";
        objectArray[91] = "\\/\u0002x\u0006wEu\u0017<lz7%\u000f.\u0014$\\6^,\t";
        objectArray[92] = "OD$U>VS@ \u0007[[\"\u0003!T#WYFd\u0014fg\u0018Gx\u0017 \u0017P\u001e!\b[";
        Object[] objectArray2 = objectArray;
        objectArray[93] = "dbv<\u001c#:0g&w+h!u%\u001b\u0019:d+yFN;gr\"K3y'\u007fzw";
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0m" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f0' || c == '\u00a3' || c == 'N' || c == '$') {
                field = _0m.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f0' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00a3' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'N' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _0m.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'd' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'r' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _0m.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x334F;
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
                throw new RuntimeException("dev/krypton/0m", exception);
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
            _0m.c[n2] = _0m.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _0m.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
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
            case 0 -> 43;
            case 1 -> 56;
            case 2 -> 44;
            case 3 -> 63;
            case 4 -> 61;
            case 5 -> 54;
            case 6 -> 59;
            case 7 -> 47;
            case 8 -> 45;
            case 9 -> 16;
            case 10 -> 39;
            case 11 -> 32;
            case 12 -> 57;
            case 13 -> 12;
            case 14 -> 7;
            case 15 -> 55;
            case 16 -> 15;
            case 17 -> 28;
            case 18 -> 38;
            case 19 -> 8;
            case 20 -> 29;
            case 21 -> 25;
            case 22 -> 3;
            case 23 -> 60;
            case 24 -> 31;
            case 25 -> 2;
            case 26 -> 37;
            case 27 -> 22;
            case 28 -> 50;
            case 29 -> 58;
            case 30 -> 5;
            case 31 -> 26;
            case 32 -> 9;
            case 33 -> 30;
            case 34 -> 34;
            case 35 -> 20;
            case 36 -> 21;
            case 37 -> 24;
            case 38 -> 52;
            case 39 -> 49;
            case 40 -> 14;
            case 41 -> 42;
            case 42 -> 17;
            case 43 -> 46;
            case 44 -> 40;
            case 45 -> 35;
            case 46 -> 51;
            case 47 -> 11;
            case 48 -> 18;
            case 49 -> 27;
            case 50 -> 41;
            case 51 -> 1;
            case 52 -> 23;
            case 53 -> 33;
            case 54 -> 13;
            case 55 -> 62;
            case 56 -> 48;
            case 57 -> 4;
            case 58 -> 53;
            case 59 -> 36;
            case 60 -> 10;
            case 61 -> 19;
            case 62 -> 0;
            default -> 6;
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
        _0m.i[n3] = new String(cArray);
        return n3;
    }

    public static boolean boolean_6(Object[] objectArray) {
        boolean bl;
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        try {
            bl = _0m.c("N", 3414481046848144125L, (long)l2) != null;
        }
        catch (MatchException matchException) {
            throw _0m.a(matchException);
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static GpuTextureView com_mojang_blaze3d_textures_GpuTextureView_6(Object[] var0) {
        block15: {
            block17: {
                block16: {
                    block20: {
                        block21: {
                            block19: {
                                block18: {
                                    var1_1 = (Long)var0[0];
                                    var3_2 = (var1_1 = _0m.a ^ var1_1) ^ 86394054950550L;
                                    var5_3 = _0m.cfr_renamed_0();
                                    try {
                                        try {
                                            v0 = _0m.c("N", (long)-8168546969296163038L, (long)var1_1)[0];
                                            if (var5_3 != 0) break block15;
                                            if (v0 != null) break block16;
                                        }
                                        catch (MatchException v1) {
                                            throw _0m.a(v1);
                                        }
                                        v2 = -8162728614419999008L;
                                        v3 = var1_1;
                                        if (var1_1 < 0L) break block17;
                                        if (_0m.c("N", (long)v2, (long)v3) != false) break block16;
                                    }
                                    catch (MatchException v4) {
                                        throw _0m.a(v4);
                                    }
                                    var6_4 = _0m.c("d", (Object)_0m.c("r", (long)-8168880715943394780L, (long)var1_1), (long)-8167282835283498734L, (long)var1_1);
                                    try {
                                        v5 = var6_4;
                                        if (var1_1 < 0L || var5_3 != 0) break block18;
                                        if (v5 == null) break block16;
                                    }
                                    catch (MatchException v6) {
                                        throw _0m.a(v6);
                                    }
                                    v5 = var6_4;
                                }
                                try {
                                    try {
                                        v7 = _0m.c("\u00f0", (Object)v5, (long)-8161092727924120864L, (long)var1_1);
                                        v8 /* !! */  = var5_3;
                                        if (var1_1 >= 0L) {
                                            if (v8 /* !! */  != 0) break block19;
                                            if (v7 <= 0) break block16;
                                        }
                                        ** GOTO lbl50
                                    }
                                    catch (MatchException v9) {
                                        throw _0m.a(v9);
                                    }
                                    v7 = _0m.c("\u00f0", (Object)var6_4, (long)-8168228018728638717L, (long)var1_1);
                                }
                                catch (MatchException v10) {
                                    throw _0m.a(v10);
                                }
                            }
                            try {
                                try {
                                    v8 /* !! */  = var5_3;
lbl50:
                                    // 2 sources

                                    if (var1_1 < 0L) break block20;
                                    if (v8 /* !! */  != 0) break block21;
                                    if (v7 <= 0) break block16;
                                }
                                catch (MatchException v11) {
                                    throw _0m.a(v11);
                                }
                                v7 = _0m.c("\u00f0", (Object)var6_4, (long)-8161092727924120864L, (long)var1_1);
                            }
                            catch (MatchException v12) {
                                throw _0m.a(v12);
                            }
                        }
                        v8 /* !! */  = _0m.c("\u00f0", (Object)var6_4, (long)-8168228018728638717L, (long)var1_1);
                    }
                    v13 = new Object[3];
                    v13[2] = v8 /* !! */ ;
                    v13[1] = var3_2;
                    v13[0] = (int)v7;
                    _0m.c("r", (Object)v13, (long)-8168284202826507024L, (long)var1_1);
                }
                v2 = -8168546969296163038L;
                v3 = var1_1;
            }
            v0 = _0m.c("N", (long)v2, (long)v3)[0];
        }
        return v0;
    }

    private static String cfr_renamed_3(long l2) {
        l2 = a ^ l2;
        return _0m.a("i", 11173, (long)(0x20A98ED08AA3C6BL ^ l2));
    }

    private static String cfr_renamed_6(long l2, char c) {
        long l3 = (l2 << 16 | (long)c << 48 >>> 48) ^ a;
        return _0m.a("i", 6186, (long)(0x1D7A30F7DE17046FL ^ l3));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void void_4(Object[] objectArray) {
        GpuTextureView gpuTextureView = (GpuTextureView)objectArray[0];
        GpuTextureView gpuTextureView2 = (GpuTextureView)objectArray[1];
        int n = (Integer)objectArray[2];
        int n2 = (Integer)objectArray[3];
        long l2 = (Long)objectArray[4];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x25323B4844E6L;
        long l5 = l3 ^ 0x5552B7F31BC3L;
        long l6 = l3 ^ 0x12410C7E099FL;
        CallSite callSite = _0m.c("d", (Object)_0m.c("r", -1906901125287854038L, (long)l2), -1904113338973940833L, (long)l2);
        CallSite callSite2 = _0m.c("d", (Object)callSite, () -> _0m.cfr_renamed_3(l4), (Object)gpuTextureView2, (Object)_0m.c("r", -1906573765712247253L, (long)l2), -1904062261954111479L, (long)l2);
        try {
            _0m.c("d", (Object)callSite2, (Object)_0m.c("N", -1903561331919100651L, (long)l2), -1903659256083444003L, (long)l2);
            Object[] objectArray2 = new Object[3];
            objectArray2[2] = l5;
            objectArray2[1] = _0m.c("r", -1903129530038621293L, (long)l2);
            objectArray2[0] = _0m.c("N", -1905415241494620035L, (long)l2);
            _0m.c("d", (Object)callSite2, (Object)_0m.a("i", 6858, (long)(0xBFCA3221E4CCC1CL ^ l2)), (Object)_0m.c("r", (Object)objectArray2, -1905613580851119012L, (long)l2), -1905906909953114364L, (long)l2);
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l6;
            _0m.c("d", (Object)callSite2, (Object)_0m.a("i", 28597, (long)(0x4CFECC4760C9B961L ^ l2)), (Object)gpuTextureView, (Object)_0m.c("r", (Object)objectArray3, -1907005571820194045L, (long)l2), -1906184879993224533L, (long)l2);
            _0m.c("d", (Object)callSite2, 0, (Object)_0m.c("N", -1906028660542090736L, (long)l2), -1902775845725028433L, (long)l2);
            _0m.c("d", (Object)callSite2, (Object)_0m.c("N", -1906526615070774718L, (long)l2), (Object)_0m.c("N", -1902955244089877059L, (long)l2), -1904236411640769975L, (long)l2);
            _0m.c("d", (Object)callSite2, 0, 0, (int)_0m.b("h", 25210, (long)(0x6B86401DE2A68289L ^ l2)), 1, -1906389480895139003L, (long)l2);
        }
        finally {
            _0m.c("d", (Object)callSite2, -1903315241023868622L, (long)l2);
        }
    }

    public static boolean cfr_renamed_7() {
        return cfr_renamed_2;
    }

    public static class_12137 net_minecraft_class_12137_4(Object[] objectArray) {
        CallSite callSite;
        block4: {
            long l2;
            block5: {
                l2 = (Long)objectArray[0];
                l2 = a ^ l2;
                boolean bl = _0m.cfr_renamed_7();
                try {
                    try {
                        callSite = _0m.c("N", 7632721472398386650L, (long)l2);
                        if (!bl) break block4;
                        if (callSite != null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _0m.a(matchException);
                    }
                    _0m.c("$", (class_12137)_0m.c("d", (Object)_0m.c("r", 7632940150374977575L, (long)l2), (Object)_0m.c("N", 7632537665601668504L, (long)l2), (Object)_0m.c("N", 7632537665601668504L, (long)l2), (Object)_0m.c("N", 7631472247513279736L, (long)l2), (Object)_0m.c("N", 7631472247513279736L, (long)l2), (boolean)false, 7633845700858298655L, (long)l2), 7632721472398386650L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _0m.a(matchException);
                }
            }
            callSite = _0m.c("N", 7632721472398386650L, (long)l2);
        }
        return callSite;
    }

    /*
     * Exception decompiling
     */
    public static GpuTextureView com_mojang_blaze3d_textures_GpuTextureView_5(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[DOLOOP]], but top level block is 19[SIMPLE_IF_TAKEN]
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

    /*
     * Exception decompiling
     */
    private static void void_5(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[WHILELOOP]], but top level block is 2[TRYBLOCK]
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

    public static void cfr_renamed_9(Object[] objectArray) {
    }

    public static boolean cfr_renamed_0() {
        boolean bl = _0m.cfr_renamed_7();
        return !bl;
    }

    /*
     * Exception decompiling
     */
    private static void cfr_renamed_0(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [22[WHILELOOP], 23[DOLOOP]], but top level block is 10[TRYBLOCK]
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_0m.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_0m.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_0m.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

