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
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _3C
extends Enum {
    public static final _3C Player;
    public static final _3C Camera;
    private final String cfr_renamed_8;
    private static final _3C[] cfr_renamed_2;
    private static int cfr_renamed_7;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _3C() {
        void var3_1;
        void cfr_renamed_27;
        void cfr_renamed_28;
        this.cfr_renamed_8 = var3_1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                _3C.a = l.a(1130492513484820291L, -4653793918381343732L, MethodHandles.lookup().lookupClass()).a(194027153465786L);
                var9 = _3C.a ^ 125963860698240L;
                _3C.b = new Object[13];
                _3C.c = new String[13];
                _3C.a();
                if (_3C.cfr_renamed_4() != 0) {
                    _3C.cfr_renamed_7(83);
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
                var0_3 = new String[4];
                var6_4 = 0;
                var5_5 = "\u001a\b\u00ea\u001a\u00a1)\u00de\u00c0\b\u001a\b\u00ea\u001a\u00a1)\u00de\u00c0";
                var7_6 = "\u001a\b\u00ea\u001a\u00a1)\u00de\u00c0\b\u001a\b\u00ea\u001a\u00a1)\u00de\u00c0".length();
                var4_7 = 8;
                var3_8 = -1;
lbl24:
                // 2 sources

                while (true) {
                    v3 = ++var3_8;
                    v4 = var5_5.substring(v3, v3 + var4_7);
                    v5 = -1;
                    break block11;
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = _3C.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "W+%ON\u001d\u00ad\u00e4\bW+%ON\u001d\u00ad\u00e4";
                    var7_6 = "W+%ON\u001d\u00ad\u00e4\bW+%ON\u001d\u00ad\u00e4".length();
                    var4_7 = 8;
                    var3_8 = -1;
lbl38:
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
lbl43:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = _3C.a(var8_9).intern();
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
lbl55:
                // 1 sources

                ** continue;
            }
        }
        _3C.Player = new _3C(var0_3[0], 0, var0_3[1]);
        _3C.Camera = new _3C(var0_3[2], 1, var0_3[3]);
        _3C.cfr_renamed_2 = _3C.a("\u00e8", (long)-4907522838407327078L, (long)var9);
    }

    public String toString() {
        long l2 = a ^ 0x698CC230E7D1L;
        return _3C.a("O", (Object)((Object)this), -5136999263939160066L, (long)l2);
    }

    public static _3C[] values() {
        long l2 = a ^ 0x6F7B1C640602L;
        return (_3C[])((Enum)((Object)_3C.a("\u00d0", 6441850786743004538L, (long)l2))).clone();
    }

    public static _3C valueOf(String string) {
        long l2 = a ^ 0x4CFCB2621268L;
        return (_3C)((Object)_3C.a("\u00e8", _3C.class, (Object)string, 5552145257449346071L, (long)l2));
    }

    private static _3C[] cfr_renamed_1() {
        long l2 = a ^ 0xFD2E40F21B0L;
        return new _3C[]{_3C.a("\u00d0", 9138930160265177260L, (long)l2), _3C.a("\u00d0", 9139922561326586377L, (long)l2)};
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _3C.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _3C.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _3C.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _3C.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _3C.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _3C.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _3C.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _3C.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _3C.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _3C.a(clazz3, string2, clazz2)) != null) {
                    _3C.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _3C.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _3C.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _3C.b(483477364054312L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _3C.a(l2, l3);
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
                clazz3 = _3C.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _3C.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _3C.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _3C.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _3C.b(483477364054312L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _3C.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _3C.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _3C.b(483477364054312L, 0L);
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
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/3C" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _3C.a(lookup, mutableCallSite, string, methodType, l2, l3);
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'O' || c == 'v' || c == '\u00d0' || c == 'k') {
                field = _3C.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'O' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'v' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _3C.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'S' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e8' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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
            case 0 -> 28;
            case 1 -> 57;
            case 2 -> 6;
            case 3 -> 13;
            case 4 -> 31;
            case 5 -> 27;
            case 6 -> 15;
            case 7 -> 43;
            case 8 -> 21;
            case 9 -> 22;
            case 10 -> 55;
            case 11 -> 36;
            case 12 -> 5;
            case 13 -> 37;
            case 14 -> 23;
            case 15 -> 26;
            case 16 -> 63;
            case 17 -> 47;
            case 18 -> 62;
            case 19 -> 50;
            case 20 -> 40;
            case 21 -> 7;
            case 22 -> 10;
            case 23 -> 53;
            case 24 -> 8;
            case 25 -> 35;
            case 26 -> 42;
            case 27 -> 24;
            case 28 -> 25;
            case 29 -> 2;
            case 30 -> 30;
            case 31 -> 4;
            case 32 -> 3;
            case 33 -> 46;
            case 34 -> 16;
            case 35 -> 41;
            case 36 -> 9;
            case 37 -> 17;
            case 38 -> 18;
            case 39 -> 32;
            case 40 -> 58;
            case 41 -> 29;
            case 42 -> 56;
            case 43 -> 20;
            case 44 -> 54;
            case 45 -> 33;
            case 46 -> 14;
            case 47 -> 48;
            case 48 -> 19;
            case 49 -> 49;
            case 50 -> 39;
            case 51 -> 44;
            case 52 -> 59;
            case 53 -> 45;
            case 54 -> 34;
            case 55 -> 61;
            case 56 -> 11;
            case 57 -> 12;
            case 58 -> 60;
            case 59 -> 38;
            case 60 -> 1;
            case 61 -> 0;
            case 62 -> 52;
            default -> 51;
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
        _3C.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "S\u0003wCKeX\ff\f gL\u000f";
        objectArray[1] = "P7=W%1[8,\u0018H1[%8";
        objectArray[2] = "+!Y\n2\" .HEO:3)A\f";
        objectArray[3] = "n\u0000\u0019q9+s\u0015\u001b0<w9&";
        objectArray[4] = "K\u001f\u0005Y*?{!\u0018L(~~}R\u007fg";
        objectArray[5] = ">}Nf J\u000eCSs\"\u000b\u000b\u001f\u0019@m";
        objectArray[6] = "<\u0005Uh?k7\nD'^e<\u0001@}";
        objectArray[7] = "\u000b4\n0gMI9\tr\u001eoX`\u00180w$\u000b4\n0gMI9\tr";
        objectArray[8] = "/:S\f<bm7PNE5\u00150LH}{s1\u0014\u0013/";
        objectArray[9] = "Iag#\u007f=\u000blda\u0006\f\u00179i4|TIag#\u007f=\u000blda";
        objectArray[10] = "e3V\u0016Wp'>UT.$_;S\u0012G ;~S\u0010\u0012";
        objectArray[11] = "^e\u0014^n(\u001ch\u0017\u001c\u0017pdo\u000b\u001a/1\u0002nSA}A";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "J1\"\u000e{IZ4$ma\u001fL,w*qvU!cV`\u001bB7hm&\fV8#\tc\fTm\u001a\u000f\u007fNK5%\u001fzH(";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static int cfr_renamed_4() {
        return cfr_renamed_7;
    }

    public static void cfr_renamed_7(int n) {
        cfr_renamed_7 = n;
    }

    public static int cfr_renamed_7() {
        int n = _3C.cfr_renamed_4();
        if (n == 0) {
            return 91;
        }
        return 0;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_3C.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

