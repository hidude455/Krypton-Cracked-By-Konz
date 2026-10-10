/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  net.minecraft.class_12137
 *  net.minecraft.class_276
 *  net.minecraft.class_3545
 *  net.minecraft.class_4587
 *  org.joml.Matrix4f
 */
package dev.krypton;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import dev.krypton._6N;
import dev.krypton._8B;
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
import net.minecraft.class_276;
import net.minecraft.class_3545;
import net.minecraft.class_4587;
import org.joml.Matrix4f;

public class _4B {
    private static final _4B cfr_renamed_9;
    private static boolean cfr_renamed_3;
    private final HashMap cfr_renamed_200 = new HashMap();
    private final HashMap cfr_renamed_4 = new HashMap();
    private GpuTextureView cfr_renamed_1;
    private GpuTextureView cfr_renamed_8;
    private _8B cfr_renamed_5;
    private RenderPipeline cfr_renamed_0;
    private _6N cfr_renamed_6;
    private GpuBuffer cfr_renamed_7;
    private GpuBuffer cfr_renamed_201;
    private Matrix4f cfr_renamed_2;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Long[] f;
    private static final Map g;
    private static final Object[] h;
    private static final String[] i;

    private static String cfr_renamed_5(int n, int n2, int n3) {
        long l2 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)n3 << 48 >>> 48) ^ a;
        return _4B.a("p", 16756, (long)(0x23E69F9B6AA6C11BL ^ l2));
    }

    public static _4B cfr_renamed_5(Object[] objectArray) {
        Object object;
        long l2;
        block4: {
            block5: {
                l2 = (Long)objectArray[0];
                l2 = a ^ l2;
                String string = _6N.cfr_renamed_3();
                try {
                    try {
                        object = _4B.c("O", -6707273369276863518L, (long)l2);
                        if (string != null) break block4;
                        if (object == false) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw _4B.a(illegalStateException);
                    }
                    throw new IllegalStateException((String)((Object)_4B.a("p", 4211, (long)(0x7BF3729F7A44A84CL ^ l2))));
                }
                catch (IllegalStateException illegalStateException) {
                    throw _4B.a(illegalStateException);
                }
            }
            object = true;
        }
        _4B.c("$", (boolean)object, -6707273369276863518L, (long)l2);
        return _4B.c("O", -6702184129636971950L, (long)l2);
    }

    public _4B cfr_renamed_202(Object[] objectArray) {
        String string = (String)objectArray[0];
        GpuBufferSlice gpuBufferSlice = (GpuBufferSlice)objectArray[1];
        long l2 = (Long)objectArray[2];
        l2 = a ^ l2;
        _4B.c("Y", (Object)_4B.c("W", (Object)this, 3151443097957688593L, (long)l2), (Object)string, (Object)gpuBufferSlice, 3151689910143097161L, (long)l2);
        return this;
    }

    public _4B cfr_renamed_203(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        Matrix4f matrix4f = (Matrix4f)objectArray[1];
        l2 = a ^ l2;
        _4B.c("\u00f0", (Object)this, (Matrix4f)matrix4f, 3700424735698368406L, (long)l2);
        return this;
    }

    public _4B cfr_renamed_204(Object[] objectArray) {
        GpuBuffer gpuBuffer = (GpuBuffer)objectArray[0];
        long l2 = (Long)objectArray[1];
        GpuBuffer gpuBuffer2 = (GpuBuffer)objectArray[2];
        l2 = a ^ l2;
        _4B.c("\u00f0", (Object)this, (GpuBuffer)gpuBuffer, 1975908331048559584L, (long)l2);
        _4B.c("\u00f0", (Object)this, (GpuBuffer)gpuBuffer2, 1974558484752311802L, (long)l2);
        return this;
    }

    public _4B cfr_renamed_205(Object[] objectArray) {
        block8: {
            String string = (String)objectArray[0];
            GpuTextureView gpuTextureView = (GpuTextureView)objectArray[1];
            long l2 = (Long)objectArray[2];
            class_12137 class_121372 = (class_12137)objectArray[3];
            l2 = a ^ l2;
            String string2 = _6N.cfr_renamed_3();
            try {
                Object object;
                try {
                    try {
                        try {
                            if (string == null || gpuTextureView == null) break block8;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw _4B.a(illegalStateException);
                        }
                        object = class_121372;
                        if (string2 != null) break block8;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw _4B.a(illegalStateException);
                    }
                    if (object == null) break block8;
                }
                catch (IllegalStateException illegalStateException) {
                    throw _4B.a(illegalStateException);
                }
                object = _4B.c("Y", (Object)_4B.c("W", (Object)this, 910166743112059048L, (long)l2), (Object)string, (Object)new class_3545((Object)gpuTextureView, (Object)class_121372), 913410823156612697L, (long)l2);
            }
            catch (IllegalStateException illegalStateException) {
                throw _4B.a(illegalStateException);
            }
        }
        return this;
    }

    private _4B() {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = l.a(-1854094955928497933L, -2443233608760954479L, MethodHandles.lookup().lookupClass()).a(103420863063437L);
        h = new Object[124];
        i = new String[124];
        _4B.a();
        d = new HashMap(13);
        long l2 = a ^ 0x1A0665694C4DL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l2 >>> 56);
        for (int j = 1; j < 8; ++j) {
            byArray2 = byArray2;
            byArray2[j] = (byte)(l2 << j * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[3];
        int n = 0;
        String string = "\u0011\u00e3\u00fa\u00cd\u00a1b\u00d8\u0097&=xQ\u00d2\u001f\u001c\u0091Z\u009a\u0014\u00d3\u0083\u0089T\r\u00ee\u0011BW\u00eb@/\\\u008b\u0092Q\u00b4\u00f2\u00aa\f\u00fb 4D\u00bd>\u00dcO\u00f4e\u001ahw\u009f\u008f\u0004\u00e5\u00db\u000baf)\u000e\u00afa]\u00fc\u0003\u00f3\u0018\u00e4\u00fa\u00e2:H\u00b4[&\u00ec\u00a5|j\u00ff\u0088)\u00a5\u00e6\u0087\u0006\u00f3\u00e7\u00aa\u00dd\u00b8z\u0089\u000f\u00f5\u00a5]hRTo\u00ea\u00e8\u00ee:\u008e5\u00c2u@Q\f}\u0090=\u00d8\u00ff\u00de\u001d\u0099\u0088\u0085m5E!.\u00aa\u000f\u001d\u00f1f\u00cc\u0011\u00a6\u00bbu\u00fd^'\u0097P\u0003\u00ba";
        int n2 = "\u0011\u00e3\u00fa\u00cd\u00a1b\u00d8\u0097&=xQ\u00d2\u001f\u001c\u0091Z\u009a\u0014\u00d3\u0083\u0089T\r\u00ee\u0011BW\u00eb@/\\\u008b\u0092Q\u00b4\u00f2\u00aa\f\u00fb 4D\u00bd>\u00dcO\u00f4e\u001ahw\u009f\u008f\u0004\u00e5\u00db\u000baf)\u000e\u00afa]\u00fc\u0003\u00f3\u0018\u00e4\u00fa\u00e2:H\u00b4[&\u00ec\u00a5|j\u00ff\u0088)\u00a5\u00e6\u0087\u0006\u00f3\u00e7\u00aa\u00dd\u00b8z\u0089\u000f\u00f5\u00a5]hRTo\u00ea\u00e8\u00ee:\u008e5\u00c2u@Q\f}\u0090=\u00d8\u00ff\u00de\u001d\u0099\u0088\u0085m5E!.\u00aa\u000f\u001d\u00f1f\u00cc\u0011\u00a6\u00bbu\u00fd^'\u0097P\u0003\u00ba".length();
        int n3 = 40;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = _4B.a(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        b = stringArray;
        c = new String[3];
        g = new HashMap(13);
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l2 >>> 56);
        for (int j = 1; j < 8; ++j) {
            byArray5 = byArray5;
            byArray5[j] = (byte)(l2 << j * 8 >>> 56);
        }
        cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n6 = 0;
        String string2 = "-\u000b)\u00dd\u00bb\u00ef9\u00e0q\u000f\u008a\u0087\u007f\u0090DV";
        int n7 = "-\u000b)\u00dd\u00bb\u00ef9\u00e0q\u000f\u008a\u0087\u007f\u0090DV".length();
        int n8 = 0;
        do {
            byte[] byArray6 = string2.substring(n8, n8 += 8).getBytes("ISO-8859-1");
            int n9 = n6++;
            long l3 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
            lArray[n9] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n8 < n7);
        e = lArray;
        f = new Long[2];
        cfr_renamed_9 = new _4B();
    }

    public _4B cfr_renamed_1(Object[] objectArray) {
        _6N n = (_6N)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = a ^ l2;
        _4B.c("\u00f0", (Object)this, (_6N)n, -4412397745829060459L, (long)l2);
        return this;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _4B.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _4B.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/4B" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _4B.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _4B.b(classArray[j], string, clazz2);
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
            int n = _4B.a(l2, l3);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                _4B.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static long b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = _4B.b(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return l3;
    }

    private static long b(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x4C9F;
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
                throw new RuntimeException("dev/krypton/4B", exception);
            }
            long l5 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            _4B.f[n2] = l5;
        }
        return f[n2];
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/4B" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l2, long l3) {
        int n = _4B.a(l2, l3);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = _4B.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _4B.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _4B.a(clazz3, string2, clazz2)) != null) {
                    _4B.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _4B.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _4B.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _4B.b(1379154146819780L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _4B.a(l2, l3);
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
                clazz3 = _4B.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _4B.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _4B.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _4B.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _4B.b(1379154146819780L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _4B.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _4B.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _4B.b(1379154146819780L, 0L);
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
            case 0 -> 6;
            case 1 -> 42;
            case 2 -> 37;
            case 3 -> 15;
            case 4 -> 28;
            case 5 -> 46;
            case 6 -> 24;
            case 7 -> 49;
            case 8 -> 7;
            case 9 -> 14;
            case 10 -> 57;
            case 11 -> 40;
            case 12 -> 60;
            case 13 -> 1;
            case 14 -> 9;
            case 15 -> 29;
            case 16 -> 54;
            case 17 -> 48;
            case 18 -> 10;
            case 19 -> 56;
            case 20 -> 31;
            case 21 -> 52;
            case 22 -> 59;
            case 23 -> 23;
            case 24 -> 22;
            case 25 -> 61;
            case 26 -> 8;
            case 27 -> 38;
            case 28 -> 11;
            case 29 -> 13;
            case 30 -> 25;
            case 31 -> 36;
            case 32 -> 35;
            case 33 -> 43;
            case 34 -> 20;
            case 35 -> 0;
            case 36 -> 16;
            case 37 -> 5;
            case 38 -> 55;
            case 39 -> 44;
            case 40 -> 30;
            case 41 -> 58;
            case 42 -> 18;
            case 43 -> 33;
            case 44 -> 50;
            case 45 -> 4;
            case 46 -> 51;
            case 47 -> 17;
            case 48 -> 3;
            case 49 -> 27;
            case 50 -> 39;
            case 51 -> 32;
            case 52 -> 47;
            case 53 -> 63;
            case 54 -> 45;
            case 55 -> 34;
            case 56 -> 12;
            case 57 -> 19;
            case 58 -> 41;
            case 59 -> 26;
            case 60 -> 2;
            case 61 -> 53;
            case 62 -> 21;
            default -> 62;
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
        _4B.i[n3] = new String(cArray);
        return n3;
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
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
            if (c == 'W' || c == '\u00f0' || c == 'O' || c == '$') {
                field = _4B.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'W' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f0' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'O' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _4B.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'Y' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f8' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _4B.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x1ACE;
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
                throw new RuntimeException("dev/krypton/4B", exception);
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
            _4B.c[n2] = _4B.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/4B" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _4B.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "H\u0014-\u0004\u001a\u0011U\u0001/E\u001fM\u00183";
        objectArray[1] = Boolean.TYPE;
        _4B.i[1] = "java/lang/Boolean";
        objectArray[2] = "b2bLGZk<a\u0005\u0004Wm<u\u0007\u0019Q/.v\u0011^Pl.!0O[e8}2KFr";
        objectArray[3] = "\r[<?e-\u0004U?v& \u0002U+t;&@V$wn'\u001cG\u007fVx7,A7wm0";
        objectArray[4] = "/@qEn+&Nr\f-& Nf\u000e0 bYy\u0019w!4\u0001J\u000eq0)WZ\u0004q)-[8\bo%?\\C^6}y";
        objectArray[5] = Void.TYPE;
        _4B.i[5] = "java/lang/Void";
        objectArray[6] = "\u000fyKa\\9\u0006wH(\u001f4\u0000w\\*\u00022Be_<E3\u0001e\b\f^;\u0001wH+t8\u000fyB*C";
        objectArray[7] = "MI\u001fQ<\u0012SA\u0005\u001et\u0012IK\u001dY}\t\t{\u001c@b\u000bNM\u001b";
        objectArray[8] = "p$\u0004*\u0013&y*\u0007cP+\u007f*\u0013aM-=?\f|\n<a.\u001a*99f\u001f\f|\n<a.?m\u001b>";
        objectArray[9] = ".d)p`F0l3?\u0001C0l0\u007f/_\rk+";
        objectArray[10] = "\u0019MP@V}\u0010CS\t\u0015p\u0016CG\u000b\bvTQD\u001dOw\u0017Q\u0013)Kg>GK\u0007Xw";
        objectArray[11] = "P~a\n\u0001]P~vV\rRJ5vH\rGMD,\u001cX\f";
        objectArray[12] = Integer.TYPE;
        _4B.i[12] = "java/lang/Integer";
        objectArray[13] = "}_D=v\b`JF|sT!x";
        objectArray[14] = "r\u001c\u00052<\u0003o\t\u0007s9_ 7";
        objectArray[15] = "k :f`k\u001e\u00001iq$\u007f\u000e:bu~\u000b";
        objectArray[16] = "XfLfKhQhO/\beWh[-\u0015c\u0015yH8CkRgDftbUmD:vnKlM!Hb";
        objectArray[17] = "(|\u0001LB$6t\u001b\u0003$01u:L\u001c";
        objectArray[18] = "}#m([%c+wg<$r0z=\u001a\"";
        objectArray[19] = "]#C\u0019D]V,RV%S]'V\f";
        objectArray[20] = "b\u0017#Gr`\u00177(Hc/v9#Cgu\u0002";
        objectArray[21] = "{1\u001b:@I{1\ffLFaz\fxLSf\u000b\\!\u0019\u0015";
        objectArray[22] = Long.TYPE;
        _4B.i[22] = "java/lang/Long";
        objectArray[23] = "2\u0005\u0004bB{,\r\u001e-?k,";
        objectArray[24] = "7n\u0010[\u000b?BN\u001bT\u001ap#@\u0010_\u001e*W";
        objectArray[25] = "Cw2?e\u000eJy1v&\u0003Ly%t;\u0005\u000ek&b|\u0004MkqCm\u000fD}-Bq\u0012T}2";
        objectArray[26] = ":\u0003T\u0000\u000118\u001d\u001dc\n*'\u0018K\u001a\r\r!\u0010PE";
        objectArray[27] = "\u00051H\n,M\u001b9REMH\u001b9Q\u0005cT+?K\tn]";
        objectArray[28] = "\u0015I>\u0003\u0019]`i5\f\b\u0012\u0001g>\u0007\fHu";
        objectArray[29] = "V-$g\u0017\u0018K8&&\u0012D\u0006#";
        objectArray[30] = "{[\u0015?S\u000byE\\\\X\u0010f@\n%_\u0007";
        objectArray[31] = "W\u0011X,@ZU\u000f\u0011OKAJ\nG6L";
        objectArray[32] = "\u0018Z36\u0011Zmz89\u0000\u0015\ft32\u0004Ox";
        objectArray[33] = "H\u0015]g|qC\u001aL(\u0001iP\u001dEa";
        objectArray[34] = "u\u0001Ll&\u0012u\u0001[0*\u001doJ[.*\bh;\tpzH,";
        objectArray[35] = "aO!)b\nhA\"`!\u0007nA6b<\u0001,B9ai\u0000pSb@\u007f\u0010@U*aj\u0017QL%dj";
        objectArray[36] = "3-\u0011\\oRF\r\u001aS~\u001d'\u0003\u0011XzGS";
        objectArray[37] = "6\u0007W+Rj+\u0012UjW6j.";
        objectArray[38] = "\u0010rUgC<eR^hRs\u0004\\UcV)p";
        objectArray[39] = "gpIO>}gp^\u00132r};^\r2gzJ\u000fVe";
        objectArray[40] = "o,\\tC\u0001o,K(O\u000eugK6O\u001br\u0016\u001bk\u001e";
        objectArray[41] = "o7Di<9o7S506u|S+0#r\r\u0007rf";
        objectArray[42] = "~s6\u001e#a~s!B/nd8!\\/{cIv\u0001v<";
        objectArray[43] = "+3\u0005h/T+3\u00124#[1x\u0012*#N6\tCrq";
        objectArray[44] = Double.TYPE;
        _4B.i[44] = "java/lang/Double";
        objectArray[45] = Float.TYPE;
        _4B.i[45] = "java/lang/Float";
        objectArray[46] = "j}\u0005LeWwh\u0007\r`\u000b<";
        objectArray[47] = "5y\u001e`\b4(l\u001c!\rha,";
        objectArray[48] = ">x/Kz_KX$Dk\u0010*V/OoJ^";
        objectArray[49] = "i&&\"/\"\u001c\u0006-->m}\b&&:7\t";
        objectArray[50] = "%A\u007fJ/m%Ah\u0016#b?\nh\b#w8{?Qz3";
        objectArray[51] = "@[\u000bhF\u0013@[\u001c4J\u001cZ\u0010\u001c*J\t]aKs\u0013M\n]\u0013'X\tq\nIp\u001e";
        objectArray[52] = "\u000e\"f\u0011Q\u001b{\u0002m\u001e@T\u001a\ff\u0015D\u000en";
        objectArray[53] = "l;\u0002h*\u000539_2J\u00158&'4&\u0003%\u0010\u001b<$\u0003/Z\\c$\u000167\u0006-!WUa_h _>g\u000b1pnn+W,;\u000f,1\fiJ";
        objectArray[54] = "sQ\tk\u0017\u000b#R\u0012cvQ5F\tr\u001b`\"M\fc\fb&P\u001b\u000eJK(J\u0001n\u0019\u0004\u007fF`3\nT7\u0014Yt\u0015\u00007+^w\u0006B2PXnL\u0003O\u0012\u0001jLZ$M\u00037\u0016:";
        objectArray[55] = "{r!eab$5%5\u0006w> %)kW#()<`p\t+'2jq>Mp/oy%| ,tqD";
        objectArray[56] = "+}MTZ5<i\u000ej\u0003\f+}MTZ5<i\u000e";
        objectArray[57] = "MG\u0001\u0004FG\rMR^&\u001f\u001fCX[J-L\u0006\u0003\u0006\u001azBFA\u0004GB\u000b\u0003\bZ&J\u000bF\u0000]\u001e\u0003N\u000f^<\u0016\u0003\u000b\u0007Y\u0004_FBY8\f_\u0003J^\u0000E\u001aJ\u0014?\bE_B\u0013\u0007A\u0000\u0016\u001cr";
        objectArray[58] = "\u000bkBj\u0017VTlD/~\u000b:aB/FU\u0002(\u0007f\u0018";
        objectArray[59] = "nq\fe\u0006X`z\b`}\u001c_3It\u0000Jgh\n=\u001dT_:\buEGgsM<\u001b&";
        objectArray[60] = "7Z\t\u0005y\u000e NJ;.7g_\u0015C \u000e @AC";
        objectArray[61] = "-zvvgGrx+,\u0007WygJ-\u007fApzt!\u0007F{ws.xK(!,L<]%ec-~G~ \u0012";
        objectArray[62] = "EO3c\b\u000eC\u00130ojUJ\u001eczj\u0005_Btq\u000bGE\u00191\u0000";
        objectArray[63] = "\u00035CZ\u0019f\u0011&\u001cA\"|\u00055\u0005(Ny\u0016,\u001e\u0012H%\u0017&y";
        objectArray[64] = "bCOk2juW\fUdSeUQ46,h\u0006\u0007k";
        objectArray[65] = "qMC^$!\u007fFG[_n@\u000f\u0006O\"3xTE\u0006?-@\u000fWQ=;pR\u0000X;_";
        objectArray[66] = "(W1}YPz\u000b|rfT+\u0011!*\nf\u007fP}q\\1*\u000e?$\u0001\u000b,R>.f";
        objectArray[67] = "$dk\u0011\u000fr~*nGld\u007f'h~\u0002}}9l\u0001\\pf6\u0005";
        objectArray[68] = "q\u001eL3\u001f\u0012pB\u001bpo\u0010b\u0012\n\"\u0013\u0016d\u007f\u001b;U\u0003%\u0003\t(\n\u0018\u001e";
        objectArray[69] = "V|[\b\u0015XXw_\rn\u0017g>\u001e\u0019\u0013J_e]P\u000eTg=\u0017\u000f\u0001E\ngY\nW&";
        objectArray[70] = "\u0010RWQcnOP\n\u000b\u0003nMTH\u0006\u0003>X\u0002M\u001ab|BY\bk";
        objectArray[71] = "2(H7\u001d2%<\u000b\tC\u000b4m\u0003j\u0019;21\u0000f";
        objectArray[72] = "\u0001hJ%p,^hM`\u00013\fy3:m1\u0005[\u00170~\u0007\u001dl\u001d>\u0001=\f\u007fL\"q%\u0005tN]";
        objectArray[73] = "]s$KGKJggu\u0019\u001903n\r\\\u001e\bh-DA\u00000g/\u0007\u001f\u0014\tp;D!";
        objectArray[74] = " \u000f\fJ-\u001b&[U\u001a\u001c\u001ez[RLKJ$\r\t\u001b\u001cK\"\f\\\u0011wMvU\f";
        objectArray[75] = "$\u0006UX$C3\u0012\u0016f~zsNI\t!\u0017)\u0000L_";
        objectArray[76] = "0pL\rA\u001bowJH(EDJ\u0005HQA`rL\r\u0018\u001f";
        objectArray[77] = "}\u0011\u00008]Y-\u0012\u001b0<\u0003;\u0006\u0000!Q2,\r\u00050F0(\u0010\u0012]\u0000\u0019&\n\b=SVq\u0006i`@\u00069TP'_R9kW$L\u0010<\u0010Q=\u0006QAV\u00153DWx\u0011\ngDh \u0014R4@\u000f{U\u00043<Q \u000fS=W\u000e\"R\t]";
        objectArray[78] = "Hwi\u00139iN+j\u001f[:N:\u000b\u001d'YL*l\b+:Mv;K[";
        objectArray[79] = "`gujAWws6T\u0018n4&\u007f)KVoe64Un6o6*V\u000ftumo'";
        objectArray[80] = "cV9k\u0001M<Td1a]7K\u0003<\u001bZ7G\u0017,\u000fH7M]a\u0018_bVe(]\u0016<7g`\u000fI9Z=.\n\u001fZ\f,`\u001fW;N6;Z&";
        objectArray[81] = "0&\u0013?\u00138k5\n,yyS~\u0003(\u001b c#T!\u001d";
        objectArray[82] = "|W>HiL'\u0016hO\u0015FxPyP\u0015Jb\u0013l]r\u0011#Ek!";
        objectArray[83] = "J\u0006\"\r\np@\u0003f\bi,V\u0003|\r\u0005\u001e\u0001D#TQI\u0002G$\u0017T#\u0002\u0010s\b\u0002I";
        objectArray[84] = "r](5I@-]/p8_\u007fLX FQy]\u0014r\u0007]\"Wj-@Yr0";
        objectArray[85] = "\u001e\u001a'3Y\u0018\u0006\u0013,1&\r\u0002\u0013]j]\u001a\u001eI-3K\u0002\u0005w9o\u001eR\u0012\t8kVQ\u007f";
        objectArray[86] = "n!\u000ed16h8D%L 5 \u0002mLs)(\u0006a7u0bG\u001c";
        objectArray[87] = "!\u001fDE\n\"6\u000b\u0007{\\\u001bu^N\u0006\u0000#.\u001d\u0007\u001b\u001e\u001b!\u001fDE\n\"6\u000b\u0007{";
        objectArray[88] = "\u000b\u001dU:\u00173\u0005\u0016Q?lt:_\u0010+\u0011!\u0002\u0004Sb\f?:\\\u0019=\u0003.W\u0006W8UM";
        objectArray[89] = "V\u0003J:L8\u0014\n\n?ri)^\u000b-\u001d;D\u0004E(K";
        objectArray[90] = "B}mE\u0005^\u000e0sMt\nS<rP\u00188\u0001y+\nJoCx|\bLRR0k\u000bt";
        objectArray[91] = "J\u0015PQhf]\u0001\u0013o0_C\n\u001aUc!B\u000eRV";
        objectArray[92] = "xf\\Dd\"'d\u0001\u001e\u0004%;nG?b%,wU\u0012\u0004y8~\u0000\u001f<0}7^~408?YF}uqa8N}0yf\u0000\u00078y'\u0007\b\u0007}q ?AB4/A<IOz8 ~S\u0014?I";
        objectArray[93] = "a]Rm-^>_\u000f7M_9ZZ\u000b E$AL:MScNWi*K&CFWpI6D\tn7VbD60vL2CHk$N$<\r&|K)]O<'\u000eX";
        objectArray[94] = "@ih[\u001dPW}+eBi\u001c*cY\u0012\u000bC-e\u001c";
        objectArray[95] = "x{yB\bY`rr@wQdmc=\u001eUcwsx\u0016Dc,|\b\u000eMh.\u0003";
        objectArray[96] = "USY\"ZZMZR %VNWEcACHS#fA\u0017\u000eTFaHXP>]|\u0018\u0010^[ZuWN4@G%\u001f@QGNjA*PX\u001b\"HTQ\\S!%";
        objectArray[97] = "B\u0014Yt\u0012\tU\u0000\u001aJI0\u0012\u0011E2K\tU\u000e\u00112";
        objectArray[98] = "Er!zcT\u0007{a\u007f]\u0004:/`m2WWu.hd";
        objectArray[99] = "\u001a5\u0000<zR\u001c,J}\u0007NJL@=~\u0011Et\tx7O$r\t4\u007fT_t\u0010~>)";
        objectArray[100] = "r\r-\"f=e\u0019n\u001c;\u0004.\u000f\"u{z \u0004&p";
        objectArray[101] = "G\u00072z1`\u0018\u0005o Qp\u0013\u001a\u000b&0e\u0019\u001c3@70\f\u0007h'/u\u0001\u0016V'!4A\u001cg!4`\u001cfm1`u\u000f\u0007/+;0~";
        objectArray[102] = "Bb\u0001[!jAy\u0016FOyY}\bI\u0018.\u0007/W%4wI/U_~qV}";
        objectArray[103] = "E\u0006B\u001b\u0005[R\u0012\u0001%Yb\u0011\u0016VG\u0007RLA_A";
        objectArray[104] = "\u001c.\u0015*\u001a-\u0012%\u0011/ah-lP;\u001c?\u00157\u0013r\u0001!-n\u0019r\u001f\"L,\u0003)ZS";
        objectArray[105] = "D~\u0007\u0015b\u0000\u000ex\u0018G[\u001fRb\u0016M7-\u0006/J\u0013kzC#\tX*K\u000fn\u0017P[";
        objectArray[106] = "UAC\u0005u\u0016X\u0012\u0015Z\u0017\u0016VHS\u001f[\u0004GRO8z\u0019CSU\t\u0017PVHM\u0000'\r\u0001AKd";
        objectArray[107] = "`\u0002l`U5r\u00113{n)b\t\u0010\u007f\u001e5\u000bK?t\f-;\u0016h}\nI";
        objectArray[108] = "wrA\tQHq.B\u00053\u0017q2x\u0006P\u0006u)B\u0000\f\u0007\u007fN\u0014\tM\u0011{t\u0012UL\u001b\u001c";
        objectArray[109] = "Y\r1\u0005~\u0000MFpJ\u000eTNK*\u0012bf\u001c\u000etI61\u001eK$\r1\bYTp\r\u000e";
        objectArray[110] = "p\u0005D{\u0013xaMSx++lPN(||6\u0000\u0013DV 2C\u001a}S86Q";
        objectArray[111] = "o+\u0016+u5,mB&\u0018k\u0016)J!e;.r\thx%\u0016w\u0002f'-'q\u00172zW";
        objectArray[112] = "\u0005*1w[\u0006Wv|xd\u0002\u0006l! \b0R-}{]g\u0007s?.\u0003]\u0001/>$d";
        objectArray[113] = "]m\u0004\u001f\tJJyG!_#0\u007fJ\u0018\f\u0011\u0000y\u0016\u001b\u0000";
        objectArray[114] = "_\f\t\u0016B;G\u0005\u0002\u0014=3Y\u00196EA1_\u0011sMP1\u0004\u001e\u0003UY:\u0006a";
        objectArray[115] = "A\u001bgM+\u0019\u001e\u001ca\bB@p\u0011g\bz\u001aHX\"A$";
        objectArray[116] = "==G#5z*)\u0004\u001dn\u0006P}\re./h&N,31P)Lom%i>X,S";
        objectArray[117] = "*P\u0005}%k,\f\u0006qG#<\u0010<r$%(\u000b\u0006tx$\"lP}92&VV!88A\u0000_`.<{\u0006\u0003a$[";
        objectArray[118] = "3o=S1Nh|$@[\u000ePj\"\u001aa_.k&Rb";
        objectArray[119] = "9jyL\n\u000e9=.S\\de?=QP\bWhz\u000e\t]\u00006'\t\r\t~7#A\u000ed";
        objectArray[120] = "Q{\u001al!dFoYRw=<8Y<(>Qb\u00179~";
        objectArray[121] = "cr[VT\u0002#d\u0002B2JF\r\u0019O_\rsp\u001aTH\u0010";
        objectArray[122] = "HnA#E\u0004\u0017iGf,VydAf\u0014\u0007A-\u0004/J";
        Object[] objectArray2 = objectArray;
        objectArray[123] = ">?@?\u0014?*t\u0001pdk)y[(\bY{<\u0005tU\u000eyyU7[7>f\u00017d";
    }

    public _4B cfr_renamed_4(Object[] objectArray) {
        _6N n = (_6N)objectArray[0];
        Matrix4f matrix4f = (Matrix4f)objectArray[1];
        long l2 = (Long)objectArray[2];
        long l3 = (l2 = a ^ l2) ^ 0x4CB4AEC8C4B4L;
        _4B.c("\u00f0", (Object)this, (_6N)n, -5868941255587492644L, (long)l2);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = matrix4f;
        objectArray2[0] = l3;
        return _4B.c("Y", (Object)this, (Object)objectArray2, -5870084346188030010L, (long)l2);
    }

    public _4B dev_krypton_4B_6(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = a ^ l2) ^ 0x6A442327D122L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = _4B.c("O", -7844883614104139201L, (long)l2);
        objectArray2[1] = l3;
        objectArray2[0] = _4B.c("O", -7840850912248534291L, (long)l2);
        return _4B.c("Y", (Object)this, (Object)objectArray2, -7843759120438533243L, (long)l2);
    }

    /*
     * Exception decompiling
     */
    public void void_6(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [62[DOLOOP]], but top level block is 26[TRYBLOCK]
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

    public _4B cfr_renamed_3(Object[] objectArray) {
        _8B b = (_8B)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = a ^ l2;
        _4B.c("\u00f0", (Object)this, (_8B)b, -7972799658479346111L, (long)l2);
        return this;
    }

    public _4B cfr_renamed_6(Object[] objectArray) {
        _6N n = (_6N)objectArray[0];
        long l2 = (Long)objectArray[1];
        class_4587 class_45872 = (class_4587)objectArray[2];
        long l3 = (l2 = a ^ l2) ^ 0x326BF1F2D1CAL;
        _4B.c("\u00f0", (Object)this, (_6N)n, 337879101166790369L, (long)l2);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = class_45872;
        return _4B.c("Y", (Object)this, (Object)objectArray2, 341322476734891674L, (long)l2);
    }

    public _4B cfr_renamed_7(Object[] objectArray) {
        GpuTextureView gpuTextureView = (GpuTextureView)objectArray[0];
        GpuTextureView gpuTextureView2 = (GpuTextureView)objectArray[1];
        long l2 = (Long)objectArray[2];
        l2 = a ^ l2;
        _4B.c("\u00f0", (Object)this, (GpuTextureView)gpuTextureView, -6919103718108400114L, (long)l2);
        _4B.c("\u00f0", (Object)this, (GpuTextureView)gpuTextureView2, -6922843880851727177L, (long)l2);
        return this;
    }

    public _4B cfr_renamed_8(Object[] objectArray) {
        class_276 class_2762 = (class_276)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = a ^ l2;
        _4B.c("\u00f0", (Object)this, (GpuTextureView)_4B.c("Y", (Object)class_2762, -8252316338214807517L, (long)l2), -8257299194875255652L, (long)l2);
        _4B.c("\u00f0", (Object)this, (GpuTextureView)_4B.c("Y", (Object)class_2762, -8251602137586465631L, (long)l2), -8250779402311332315L, (long)l2);
        return this;
    }

    public _4B dev_krypton_4B_7(Object[] objectArray) {
        RenderPipeline renderPipeline = (RenderPipeline)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = a ^ l2;
        _4B.c("\u00f0", (Object)this, (RenderPipeline)renderPipeline, -332845044247407187L, (long)l2);
        return this;
    }

    private static void void_7(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        CallSite callSite = _4B.c("Y", (Object)_4B.c("Y", (Object)_4B.c("W", (Object)_4B.c("O", -8792867445626279966L, (long)l2), -8791441807271610187L, (long)l2), -8791745411327983539L, (long)l2), -8795065863216882567L, (long)l2);
        _4B.c("Y", (Object)_4B.c("\u00f8", -8794081638587968245L, (long)l2), 0.0f, (float)((float)(-_4B.c("W", (Object)callSite, -8791980570269965044L, (long)l2))), 0.0f, -8791261718054885321L, (long)l2);
    }

    public _4B cfr_renamed_0(Object[] objectArray) {
        class_4587 class_45872 = (class_4587)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = a ^ l2;
        _4B.c("\u00f0", (Object)this, (Matrix4f)_4B.c("Y", (Object)_4B.c("Y", (Object)class_45872, -8350830885269735845L, (long)l2), -8353372375361373674L, (long)l2), -8351428344458966827L, (long)l2);
        return this;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_4B.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
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
            return MethodHandles.lookup().findStatic(_4B.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_4B.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

