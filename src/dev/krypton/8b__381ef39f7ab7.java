/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1935
 *  net.minecraft.class_3414
 */
package dev.krypton;

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
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1935;
import net.minecraft.class_3414;

/*
 * Renamed from dev.krypton.8b
 */
public class _8b_0
extends Enum {
    public static final _8b_0 INFO;
    public static final _8b_0 SUCCESS;
    public static final _8b_0 WARN;
    public static final _8b_0 ERROR;
    private final String cfr_renamed_0;
    private final _8B cfr_renamed_4;
    private final class_1792 cfr_renamed_7;
    private final class_3414 cfr_renamed_2;
    private static final _8b_0[] cfr_renamed_9;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    public _8B cfr_renamed_5() {
        long l2 = a ^ 0x515E685A2134L;
        long l3 = l2 ^ 0x7607CAFC8403L;
        return new _8B((int)_8b_0.a("\u00fc", (Object)_8b_0.a("\u00fc", (Object)((Object)this), -4155597660246032501L, (long)l2), -4155235390914926261L, (long)l2), (int)_8b_0.a("\u00fc", (Object)_8b_0.a("\u00fc", (Object)((Object)this), -4155597660246032501L, (long)l2), -4154210958144975342L, (long)l2), l3, (int)_8b_0.a("\u00fc", (Object)_8b_0.a("\u00fc", (Object)((Object)this), -4155597660246032501L, (long)l2), -4153822241539478682L, (long)l2), (int)_8b_0.a("\u00fc", (Object)_8b_0.a("\u00fc", (Object)((Object)this), -4155597660246032501L, (long)l2), -4153670628275084720L, (long)l2));
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _8b_0(class_1792 class_17922, class_3414 class_34142) {
        void var6_4;
        void var5_3;
        void cfr_renamed_27;
        void cfr_renamed_28;
        this.cfr_renamed_0 = class_17922;
        this.cfr_renamed_4 = class_34142;
        this.cfr_renamed_7 = var5_3;
        this.cfr_renamed_2 = var6_4;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        _8b_0.a = l.a(6705413648185053197L, 6102225366249743148L, MethodHandles.lookup().lookupClass()).a(104926311822201L);
                        var20 = _8b_0.a ^ 35307790930838L;
                        var22_1 = var20 ^ 7993453229729L;
                        _8b_0.b = new Object[38];
                        _8b_0.c = new String[38];
                        _8b_0.a();
                        var12_2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var13_3 = 1; var13_3 < 8; ++var13_3) {
                            v2 = v2;
                            v2[var13_3] = (byte)(var20 << var13_3 * 8 >>> 56);
                        }
                        var12_2.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var11_4 = new String[8];
                        var17_5 = 0;
                        var16_6 = "?\u0090\u0093\u00f1\u00f5m\u00a1\u00c4\bi87\u0016\u00dcnp\u00c1\br\u0015\u001a\u0090w\u00dc\u00c8\u00ea\b\u001c\u0005\u00b2\u00b0\u001c\u00fc\u000f)\b\u00fe\u009d\t+\\\u0003\u0002\u00d7\b\u008f=\n77\u000f\u00a9t";
                        var18_7 = "?\u0090\u0093\u00f1\u00f5m\u00a1\u00c4\bi87\u0016\u00dcnp\u00c1\br\u0015\u001a\u0090w\u00dc\u00c8\u00ea\b\u001c\u0005\u00b2\u00b0\u001c\u00fc\u000f)\b\u00fe\u009d\t+\\\u0003\u0002\u00d7\b\u008f=\n77\u000f\u00a9t".length();
                        var15_8 = 8;
                        var14_9 = -1;
lbl24:
                        // 2 sources

                        while (true) {
                            v3 = ++var14_9;
                            v4 = var16_6.substring(v3, v3 + var15_8);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl29:
                        // 1 sources

                        while (true) {
                            var11_4[var17_5++] = _8b_0.a(var19_10).intern();
                            if ((var14_9 += var15_8) < var18_7) {
                                var15_8 = var16_6.charAt(var14_9);
                                ** continue;
                            }
                            var16_6 = "\u008d\u00d6\u0006\u00f5\u00a4\u00ff\u0013 \b6\u0083i\u00a0\u0006\u0000\u000eF";
                            var18_7 = "\u008d\u00d6\u0006\u00f5\u00a4\u00ff\u0013 \b6\u0083i\u00a0\u0006\u0000\u000eF".length();
                            var15_8 = 8;
                            var14_9 = -1;
lbl38:
                            // 2 sources

                            while (true) {
                                v6 = ++var14_9;
                                v4 = var16_6.substring(v6, v6 + var15_8);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl43:
                        // 1 sources

                        while (true) {
                            var11_4[var17_5++] = _8b_0.a(var19_10).intern();
                            if ((var14_9 += var15_8) < var18_7) {
                                var15_8 = var16_6.charAt(var14_9);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_10 = var12_2.doFinal(v4.getBytes("ISO-8859-1"));
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
                var1_11 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var2_12 = 1; var2_12 < 8; ++var2_12) {
                    v9 = v9;
                    v9[var2_12] = (byte)(var20 << var2_12 * 8 >>> 56);
                }
                var1_11.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var0_13 = new long[12];
                var4_14 = 0;
                var5_15 = "W1\u00e6\u0095y\u008c\u00a5?\u001e\u00eaJo\u001a\u00d0q\"V\u0080\u00c8^\u00a1\u0000[}\u00a5\u00d1\u00d5\u0098\u00bf\u00b5\u00d0p\n\u008b\u001fi\u00d2\u00e1\u00b5\u00c6N\u00c7\u0099\u00ed\u009cu\u00ff}\b\u00a6\b\u009f\u00dfQ<\u0003^.\u00b8Q\u00a1\u00c5\u00f8\u00e9<gC\u00ed\bA\u00f8\u000eU\u0013>\u0005\u00c5(In";
                var6_16 = "W1\u00e6\u0095y\u008c\u00a5?\u001e\u00eaJo\u001a\u00d0q\"V\u0080\u00c8^\u00a1\u0000[}\u00a5\u00d1\u00d5\u0098\u00bf\u00b5\u00d0p\n\u008b\u001fi\u00d2\u00e1\u00b5\u00c6N\u00c7\u0099\u00ed\u009cu\u00ff}\b\u00a6\b\u009f\u00dfQ<\u0003^.\u00b8Q\u00a1\u00c5\u00f8\u00e9<gC\u00ed\bA\u00f8\u000eU\u0013>\u0005\u00c5(In".length();
                var3_17 = 0;
                while (true) {
                    var7_18 = var5_15.substring(var3_17, var3_17 += 8).getBytes("ISO-8859-1");
                    v10 = var0_13;
                    v11 = var4_14++;
                    v12 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl79:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var3_17 < var6_16) ** continue;
                    var5_15 = "\u0092m\u00a8l\u00985\u00f7$\u00cd\u0004B-\u00c5\u009b\u001c\u00dc";
                    var6_16 = "\u0092m\u00a8l\u00985\u00f7$\u00cd\u0004B-\u00c5\u009b\u001c\u00dc".length();
                    var3_17 = 0;
                    while (true) {
                        var7_18 = var5_15.substring(var3_17, var3_17 += 8).getBytes("ISO-8859-1");
                        v10 = var0_13;
                        v11 = var4_14++;
                        v12 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl92:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var3_17 < var6_16) ** continue;
                    break block21;
                    break;
                }
            }
            var8_19 = v12;
            var10_20 = var1_11.doFinal(new byte[]{(byte)(var8_19 >>> 56), (byte)(var8_19 >>> 48), (byte)(var8_19 >>> 40), (byte)(var8_19 >>> 32), (byte)(var8_19 >>> 24), (byte)(var8_19 >>> 16), (byte)(var8_19 >>> 8), (byte)var8_19});
            v14 = ((long)var10_20[0] & 255L) << 56 | ((long)var10_20[1] & 255L) << 48 | ((long)var10_20[2] & 255L) << 40 | ((long)var10_20[3] & 255L) << 32 | ((long)var10_20[4] & 255L) << 24 | ((long)var10_20[5] & 255L) << 16 | ((long)var10_20[6] & 255L) << 8 | (long)var10_20[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl105:
                // 1 sources

                ** continue;
            }
        }
        _8b_0.INFO = new _8b_0(var11_4[4], 0, var11_4[7], new _8B((int)var0_13[1], (int)var0_13[10], var22_1, (int)var0_13[2], (int)var0_13[11]), (class_1792)_8b_0.a("g", (long)-793800606190979152L, (long)var20), (class_3414)_8b_0.a("y", (Object)_8b_0.a("g", (long)-794047700069054393L, (long)var20), (long)-793857293810156861L, (long)var20));
        _8b_0.SUCCESS = new _8b_0(var11_4[0], 1, var11_4[1], new _8B((int)var0_13[8], (int)var0_13[0], var22_1, (int)var0_13[9], (int)var0_13[11]), (class_1792)_8b_0.a("g", (long)-795342329327557559L, (long)var20), (class_3414)_8b_0.a("y", (Object)_8b_0.a("g", (long)-794428408824085759L, (long)var20), (long)-793857293810156861L, (long)var20));
        _8b_0.WARN = new _8b_0(var11_4[2], 2, var11_4[5], new _8B((int)var0_13[4], (int)var0_13[6], var22_1, (int)var0_13[7], (int)var0_13[11]), (class_1792)_8b_0.a("g", (long)-793966270751279876L, (long)var20), (class_3414)_8b_0.a("y", (Object)_8b_0.a("g", (long)-794593589798498010L, (long)var20), (long)-793857293810156861L, (long)var20));
        _8b_0.ERROR = new _8b_0(var11_4[3], 3, var11_4[6], new _8B((int)var0_13[5], (int)var0_13[3], var22_1, (int)var0_13[3], (int)var0_13[11]), (class_1792)_8b_0.a("g", (long)-794760073602154671L, (long)var20), (class_3414)_8b_0.a("g", (long)-794682676058466936L, (long)var20));
        _8b_0.cfr_renamed_9 = _8b_0.a("\u00d8", (long)-794983153142234710L, (long)var20);
    }

    public static _8b_0[] values() {
        long l2 = a ^ 0x327F1D2395A0L;
        return (_8b_0[])((Enum)((Object)_8b_0.a("g", 8273112490908912180L, (long)l2))).clone();
    }

    public static _8b_0 valueOf(String string) {
        long l2 = a ^ 0x36057ADAA194L;
        return (_8b_0)((Object)_8b_0.a("\u00d8", _8b_0.class, (Object)string, 5113028791382770215L, (long)l2));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _8b_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _8b_0.b(classArray[j], string, clazz2);
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
            int n = _8b_0.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _8b_0.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _8b_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _8b_0.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _8b_0.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _8b_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _8b_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _8b_0.a(clazz3, string2, clazz2)) != null) {
                    _8b_0.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _8b_0.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _8b_0.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _8b_0.b(704138036038173L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _8b_0.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = c[n];
                int n3 = string2.indexOf(8);
                clazz3 = _8b_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _8b_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _8b_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _8b_0.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _8b_0.b(704138036038173L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _8b_0.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _8b_0.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _8b_0.b(704138036038173L, 0L);
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fc' || c == '\u00d3' || c == 'g' || c == '\u00d2') {
                field = _8b_0.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fc' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d3' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'g' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _8b_0.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'y' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d8' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8b" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _8b_0.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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

    private static int a(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (c[n3] != null) {
            return n3;
        }
        Object object = b[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 56;
            case 1 -> 32;
            case 2 -> 42;
            case 3 -> 17;
            case 4 -> 51;
            case 5 -> 24;
            case 6 -> 6;
            case 7 -> 36;
            case 8 -> 13;
            case 9 -> 58;
            case 10 -> 5;
            case 11 -> 31;
            case 12 -> 7;
            case 13 -> 41;
            case 14 -> 22;
            case 15 -> 11;
            case 16 -> 54;
            case 17 -> 9;
            case 18 -> 61;
            case 19 -> 27;
            case 20 -> 8;
            case 21 -> 15;
            case 22 -> 16;
            case 23 -> 60;
            case 24 -> 25;
            case 25 -> 62;
            case 26 -> 59;
            case 27 -> 4;
            case 28 -> 26;
            case 29 -> 57;
            case 30 -> 14;
            case 31 -> 46;
            case 32 -> 28;
            case 33 -> 19;
            case 34 -> 55;
            case 35 -> 39;
            case 36 -> 50;
            case 37 -> 49;
            case 38 -> 21;
            case 39 -> 1;
            case 40 -> 52;
            case 41 -> 37;
            case 42 -> 44;
            case 43 -> 0;
            case 44 -> 2;
            case 45 -> 48;
            case 46 -> 33;
            case 47 -> 45;
            case 48 -> 20;
            case 49 -> 35;
            case 50 -> 29;
            case 51 -> 3;
            case 52 -> 38;
            case 53 -> 43;
            case 54 -> 47;
            case 55 -> 40;
            case 56 -> 63;
            case 57 -> 34;
            case 58 -> 23;
            case 59 -> 30;
            case 60 -> 18;
            case 61 -> 10;
            case 62 -> 53;
            default -> 12;
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
        _8b_0.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "1T\u0015:An,A\u0017{D2ms";
        objectArray[1] = Integer.TYPE;
        _8b_0.c[1] = "java/lang/Integer";
        objectArray[2] = "\n\u0011H\u0002d\u0019\u0017\u0004JCaEV\u0016";
        objectArray[3] = "dyQ\u0017j2dyFKf=~2FUf(yC\u0016\r6o";
        objectArray[4] = "&\u0004\u001fY'|-\u000b\u000e\u0016L~9\b";
        objectArray[5] = "a-f\u0007KFj\"wH&Fj?c";
        objectArray[6] = "\u0010D\u0002)Fk\u001bK\u0013f;s\bL\u001a/";
        objectArray[7] = "_MYAl\u0016_MN\u001d`\u0019E\u0006N\u0003`\fBw\u001cW1M";
        objectArray[8] = "Afk5e\fAf|ii\u0003[-|wi\u0016\\\\.,1W";
        objectArray[9] = "@_]\u007f\t{@_J#\u0005tZ\u0014J=\u0005a]e\u001fi\\\"\nYE0\u0017aq\f\u0011iW";
        objectArray[10] = "\u001b\u0013F\u000eVm\u0010\u001cWA7c\u001b\u0017S\u001b";
        objectArray[11] = "\u0017m\u001a\u0005\nW\u0017m\rY\u0006X\r&\rG\u0006M\nW]\u001fV\t";
        objectArray[12] = "\u00059e\n\u0001[5\u0007x\u001f\u0003\u001a0[9\rL";
        objectArray[13] = "\u001c\u0013\u000e\u0018[k,-\u0013\rY*)qR\u001f\u0016";
        objectArray[14] = "\u001c\u0016ia@@[\u001fr(%vl<^\u0011\u001cYT\u0016}x[PO_";
        objectArray[15] = "{z*v\u0017\u0019<s1?r1\u0004D\u001c\u0006K\u00003z>o\f\t(3";
        objectArray[16] = "C_g_TP\u0012Aa&Q-TT`T\u0010UE\u0005'";
        objectArray[17] = "eFE9;l5\u0016\u0018*Z39\u0015E$\rmf@\u0018Hg&g\u001c^+3&a\u0000";
        objectArray[18] = "~BSthR}L\u0018|\u000fD'Y\u0011\u001b4\u0013q<W<k@\"E\u0002*\u007f\u001e@";
        objectArray[19] = "\u0004v\u0017 \r\u0014T&J3lKX%\u0017=;\u0015\u0005pLQQ^\u0006,\f2\u0005^\u00000";
        objectArray[20] = "\u0003t$<\u0018VD}?u}\u0003:9.s\u0019@Ym.u\u0005";
        objectArray[21] = "0$\u0000\u0002G:w-\u001bK\"m\tn\u0015\f^)x2@\u0018B";
        objectArray[22] = "Eh\f\u001fp\u000b\u0002a\u0017V\u00159!S6\"N9|!\r\u001ee\u0007\u0015f\u0004\u0005,";
        objectArray[23] = "\"\u0000A0n#q\u0006Ll^s|\nLl\t$ ]\u0010<^#c]\u0010g# m\u0016\u0018";
        objectArray[24] = "HLb^\u001a\u0006\u001bJo\u0002*V\u0016Fo\u0002}\u0001K\u00151R*\u0006\t\u00113\tW\u0005\u0007Z;";
        objectArray[25] = "-mK6(*|sMO)W:fL=l/+7\u000b";
        objectArray[26] = "\u000b\u0004?<\u0003|X\u00022`3,U\u000e2`d{\b\\g73|JYnkN\u007fD\u0012f";
        objectArray[27] = ":\u0004Yw&6}\rB>C`\u0003E\u0017gx.=\u000e\u0017;/";
        objectArray[28] = "\r^H(\u0000<JWSae\u0018nt~\u0002elD_I=\f+MD\u0000";
        objectArray[29] = "\u0011o=\u0007\u0015*A?`\u0014tuM<=\u001a#+\u0014nfvI`\u00135&\u0015\u001d`\u0015)";
        objectArray[30] = "BvCI\u0017R\u0011pN\u0015'\u0002\u001c|N\u0015pUA!\u0011B'V\u0019oV\u0003V\nL{J";
        objectArray[31] = "zBY\u0014\nl+\\_m\u0000\u0011mI^\u001fNi|\u0018\u0019";
        objectArray[32] = "\u001bF^E(U]\u0012S\u0006WFI\u0012HZ\u0010V MNW)\\\u001cIQTi8\u001c\u001d[H-QN\f\bSW\u0003\u0010\u001dGH:ED\u0010\u00047";
        objectArray[33] = "\u001cN8\tk\u007f[G#@\u000e&%\u0002\"\u0017qlLP3Dj";
        objectArray[34] = "\u007fc4t8!8j/=]rF\"zdf9xiz81H";
        objectArray[35] = "NF1Qr\r\u001fX7(t5!Y#Q:\u000eYHr\u0016";
        objectArray[36] = "M\u000ek+6_\n\u0007pbS\u000et\u0011}%*\f\t@c#";
        Object[] objectArray2 = objectArray;
        objectArray[37] = "x\u001e\u0012_\fC(NOLm\u001c$M\u0012B:B{\u0010I.P\tzD\tM\u0004\t|X";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public class_1799 cfr_renamed_4() {
        long l2 = a ^ 0x5D5D749BA74AL;
        return new class_1799((class_1935)_8b_0.a("\u00fc", (Object)((Object)this), 4622487487618895096L, (long)l2));
    }

    public class_3414 cfr_renamed_2() {
        long l2 = a ^ 0x286961678A4FL;
        return _8b_0.a("\u00fc", (Object)((Object)this), 7864213043286274383L, (long)l2);
    }

    private static _8b_0[] cfr_renamed_3() {
        long l2 = a ^ 0x34C968C1ED93L;
        return new _8b_0[]{_8b_0.a("g", 790878505672852085L, (long)l2), _8b_0.a("g", 792537073083405948L, (long)l2), _8b_0.a("g", 790843410346031266L, (long)l2), _8b_0.a("g", 791814385600362130L, (long)l2)};
    }

    public String cfr_renamed_9() {
        long l2 = a ^ 0x7DCF68439FCBL;
        return _8b_0.a("\u00fc", (Object)((Object)this), 8694788540525687438L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_8b_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

