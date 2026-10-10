/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexFormat
 */
package dev.krypton;

import com.mojang.blaze3d.vertex.VertexFormat;
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

/*
 * Renamed from dev.krypton.0n
 */
public abstract class _0n_0 {
    public static final VertexFormat cfr_renamed_5;
    public static final VertexFormat cfr_renamed_7;
    public static final VertexFormat cfr_renamed_9;
    public static final VertexFormat cfr_renamed_6;
    private static final Object[] a;
    private static final String[] b;

    private _0n_0() {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                var9 = l.a(-1237621172332726628L, -2935956433410590117L, MethodHandles.lookup().lookupClass()).a(178143203002222L) ^ 26632957049085L;
                _0n_0.a = new Object[13];
                _0n_0.b = new String[13];
                _0n_0.a();
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
                var0_3 = new String[6];
                var6_4 = 0;
                var5_5 = "\u00ec\u000e^9\u008f\u00e1\u00cfr\t_\u00cb\u00bfM\u00b1\u00c1?\b\u00d1\u00ba\u00839\u00b9\u00b3\u0093\u000b\b\u00d1\u00ba\u00839\u00b9\u00b3\u0093\u000b\b\u00d1\u0010\u00b0\u00fe\u0083\u0001\u00d3n";
                var7_6 = "\u00ec\u000e^9\u008f\u00e1\u00cfr\t_\u00cb\u00bfM\u00b1\u00c1?\b\u00d1\u00ba\u00839\u00b9\u00b3\u0093\u000b\b\u00d1\u00ba\u00839\u00b9\u00b3\u0093\u000b\b\u00d1\u0010\u00b0\u00fe\u0083\u0001\u00d3n".length();
                var4_7 = 16;
                var3_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var3_8;
                    v4 = var5_5.substring(v3, v3 + var4_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = _0n_0.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u00d1\u0010\u00b0\u00fe\u0083\u0001\u00d3n\u0010\u00ec\u000e^9\u008f\u00e1\u00cfr\t_\u00cb\u00bfM\u00b1\u00c1?";
                    var7_6 = "\u00d1\u0010\u00b0\u00fe\u0083\u0001\u00d3n\u0010\u00ec\u000e^9\u008f\u00e1\u00cfr\t_\u00cb\u00bfM\u00b1\u00c1?".length();
                    var4_7 = 8;
                    var3_8 = -1;
lbl35:
                    // 2 sources

                    while (true) {
                        v6 = ++var3_8;
                        v4 = var5_5.substring(v6, v6 + var4_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = _0n_0.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_9 = var1_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl52:
                // 1 sources

                ** continue;
            }
        }
        _0n_0.cfr_renamed_5 = _0n_0.a("I", (Object)_0n_0.a("I", (Object)_0n_0.a("\u00d4", (long)1668499650125969051L, (long)var9), (Object)var0_3[5], (Object)_0n_0.a("\u00d0", (long)1668379541915312025L, (long)var9), (long)1667715576314999938L, (long)var9), (long)1668561494464356749L, (long)var9);
        _0n_0.cfr_renamed_7 = _0n_0.a("I", (Object)_0n_0.a("I", (Object)_0n_0.a("I", (Object)_0n_0.a("\u00d4", (long)1668499650125969051L, (long)var9), (Object)var0_3[0], (Object)_0n_0.a("\u00d0", (long)1668379541915312025L, (long)var9), (long)1667715576314999938L, (long)var9), (Object)var0_3[2], (Object)_0n_0.a("\u00d0", (long)1668038713046056497L, (long)var9), (long)1667715576314999938L, (long)var9), (long)1668561494464356749L, (long)var9);
        _0n_0.cfr_renamed_9 = _0n_0.a("I", (Object)_0n_0.a("I", (Object)_0n_0.a("I", (Object)_0n_0.a("I", (Object)_0n_0.a("\u00d4", (long)1668499650125969051L, (long)var9), (Object)var0_3[0], (Object)_0n_0.a("\u00d0", (long)1668379541915312025L, (long)var9), (long)1667715576314999938L, (long)var9), (Object)var0_3[3], (Object)_0n_0.a("\u00d0", (long)1667647590262600600L, (long)var9), (long)1667715576314999938L, (long)var9), (Object)var0_3[1], (Object)_0n_0.a("\u00d0", (long)1668038713046056497L, (long)var9), (long)1667715576314999938L, (long)var9), (long)1668561494464356749L, (long)var9);
        _0n_0.cfr_renamed_6 = _0n_0.a("I", (Object)_0n_0.a("I", (Object)_0n_0.a("I", (Object)_0n_0.a("I", (Object)_0n_0.a("\u00d4", (long)1668499650125969051L, (long)var9), (Object)var0_3[0], (Object)_0n_0.a("\u00d0", (long)1668316908592655549L, (long)var9), (long)1667715576314999938L, (long)var9), (Object)var0_3[4], (Object)_0n_0.a("\u00d0", (long)1667647590262600600L, (long)var9), (long)1667715576314999938L, (long)var9), (Object)var0_3[1], (Object)_0n_0.a("\u00d0", (long)1668038713046056497L, (long)var9), (long)1667715576314999938L, (long)var9), (long)1668561494464356749L, (long)var9);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _0n_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _0n_0.b(classArray[j], string, clazz2);
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
            int n = _0n_0.a(l2, l3);
            object = a[n];
            try {
                if (!(object instanceof String)) break block2;
                _0n_0.a[n] = clazz = Class.forName(b[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _0n_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _0n_0.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _0n_0.a(l2, l3);
        Object object = a[n];
        if (object instanceof String) {
            String string = b[n];
            int n2 = string.indexOf(8);
            Class clazz = _0n_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _0n_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _0n_0.a(clazz3, string2, clazz2)) != null) {
                    _0n_0.a[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _0n_0.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _0n_0.a[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _0n_0.b(359428397644155L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _0n_0.a(l2, l3);
        Object object = a[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = b[n];
                int n3 = string2.indexOf(8);
                clazz3 = _0n_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _0n_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _0n_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _0n_0.a[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _0n_0.b(359428397644155L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _0n_0.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _0n_0.a[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _0n_0.b(359428397644155L, 0L);
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
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0n" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f8' || c == '\u00eb' || c == '\u00d0' || c == '\u00d5') {
                field = _0n_0.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f8' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00eb' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _0n_0.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'I' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _0n_0.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = a;
        a[0] = "wX~\u0003]d~V}J\u001eixViH\u0003o:Av_Dnl\u0019EHB\u007fqOUBBfuCVAUfqYg";
        objectArray[1] = "w\u001ep z:~\u0010si97x\u0010gk$1:\u0007x|c0l_Kke!q\t[ae8u\u00059Lb<x\u0015x|";
        objectArray[2] = "=vKq4*6yZ>I2%~Sw";
        objectArray[3] = "f'\nRWRo)\t\u001b\u0014_i)\u001d\u0019\tY+>\u0002\u000eNX}f1\u0019HI`0!\u0013HPd<";
        objectArray[4] = "J5>\u000fj;W <Nog\u001a\u001d";
        objectArray[5] = "CM*F\u0011$HB;\tp*CI?S";
        objectArray[6] = "\u00017*6,w\u0018&h_NYg/k`z8\u00176z\"";
        objectArray[7] = ":*P2:\u000bg8\fn\u0004\ro,<lc\u000f3-^9:\u0018g@Z+;\r<0C:yd:*P2:\u000bg8\fn\u0004";
        objectArray[8] = "\u0010\u0017-Gg\t\t\u0006o.\u0000>-(No\u001f?v\u000fl\u00111F\u0006\u0016}S";
        objectArray[9] = "<\u000e\u007f\u000e3pd\u001c5\u0012V1\u0007\u0006pR?>w\u001fa\u0010";
        objectArray[10] = "l\u0011>/P\u00164M8g.C+Ae3CSV\u0019k3I\u00179Dyo\u0015)";
        objectArray[11] = "\t|\u0012}\u0004\nTnN!:\u000fMw\u001av:_\u0001)\u000ed\u0005\u0007]/F\u001a";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "\bST#\u0001\u0000\u0011B\u0016Ju7*j1JX\u000eQDT:A\u001f\u0013";
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
        if (b[n3] != null) {
            return n3;
        }
        Object object = a[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 1;
            case 1 -> 9;
            case 2 -> 11;
            case 3 -> 39;
            case 4 -> 28;
            case 5 -> 15;
            case 6 -> 45;
            case 7 -> 47;
            case 8 -> 21;
            case 9 -> 50;
            case 10 -> 41;
            case 11 -> 22;
            case 12 -> 52;
            case 13 -> 2;
            case 14 -> 40;
            case 15 -> 19;
            case 16 -> 5;
            case 17 -> 51;
            case 18 -> 53;
            case 19 -> 43;
            case 20 -> 60;
            case 21 -> 6;
            case 22 -> 25;
            case 23 -> 10;
            case 24 -> 23;
            case 25 -> 17;
            case 26 -> 4;
            case 27 -> 44;
            case 28 -> 8;
            case 29 -> 58;
            case 30 -> 30;
            case 31 -> 0;
            case 32 -> 35;
            case 33 -> 63;
            case 34 -> 49;
            case 35 -> 48;
            case 36 -> 62;
            case 37 -> 27;
            case 38 -> 3;
            case 39 -> 38;
            case 40 -> 33;
            case 41 -> 12;
            case 42 -> 18;
            case 43 -> 46;
            case 44 -> 29;
            case 45 -> 55;
            case 46 -> 32;
            case 47 -> 57;
            case 48 -> 14;
            case 49 -> 61;
            case 50 -> 13;
            case 51 -> 31;
            case 52 -> 7;
            case 53 -> 20;
            case 54 -> 26;
            case 55 -> 36;
            case 56 -> 54;
            case 57 -> 42;
            case 58 -> 59;
            case 59 -> 56;
            case 60 -> 34;
            case 61 -> 16;
            case 62 -> 24;
            default -> 37;
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
        _0n_0.b[n3] = new String(cArray);
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_0n_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

