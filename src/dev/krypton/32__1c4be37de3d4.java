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

public class _32
extends Enum {
    public static final _32 SOCKS4;
    public static final _32 SOCKS5;
    private final String cfr_renamed_4;
    private static final _32[] cfr_renamed_2;
    private static int cfr_renamed_6;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _32() {
        void var3_1;
        void cfr_renamed_27;
        void cfr_renamed_28;
        this.cfr_renamed_4 = var3_1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                _32.a = l.a(2533049736128312983L, -1824074542548356600L, MethodHandles.lookup().lookupClass()).a(70055917293024L);
                var9 = _32.a ^ 25803319856301L;
                _32.b = new Object[13];
                _32.c = new String[13];
                _32.a();
                if (_32.cfr_renamed_4() != 0) {
                    _32.cfr_renamed_6(22);
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
                var5_5 = "T$\u0090eV\u009f\u00d5\u0081\bT$\u0090eV\u009f\u00d5\u0081";
                var7_6 = "T$\u0090eV\u009f\u00d5\u0081\bT$\u0090eV\u009f\u00d5\u0081".length();
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
                    var0_3[var6_4++] = _32.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u00f6\u00ce\u00d2M\u00ac\u00a2%\u00bb\b\u00f6\u00ce\u00d2M\u00ac\u00a2%\u00bb";
                    var7_6 = "\u00f6\u00ce\u00d2M\u00ac\u00a2%\u00bb\b\u00f6\u00ce\u00d2M\u00ac\u00a2%\u00bb".length();
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
                    var0_3[var6_4++] = _32.a(var8_9).intern();
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
        _32.SOCKS4 = new _32(var0_3[2], 0, var0_3[3]);
        _32.SOCKS5 = new _32(var0_3[1], 1, var0_3[0]);
        _32.cfr_renamed_2 = _32.a("L", (long)8210112970381817613L, (long)var9);
    }

    public String toString() {
        long l2 = a ^ 0x1193B516032EL;
        return _32.a("S", (Object)((Object)this), -4723194248788091985L, (long)l2);
    }

    public static _32[] values() {
        long l2 = a ^ 0x571D77E6E295L;
        return (_32[])((Enum)((Object)_32.a("\u00cd", 6902779409224298045L, (long)l2))).clone();
    }

    public static _32 valueOf(String string) {
        long l2 = a ^ 0x2B1F17DE330L;
        return (_32)((Object)_32.a("L", _32.class, (Object)string, 6803861037873079480L, (long)l2));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _32.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _32.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _32.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _32.b(classArray2[j], string, clazz2, n, classArray);
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
            int n = _32.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _32.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(long l2, long l3) {
        int n = _32.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _32.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _32.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _32.a(clazz3, string2, clazz2)) != null) {
                    _32.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _32.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _32.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _32.b(423383746369705L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _32.a(l2, l3);
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
                clazz3 = _32.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _32.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _32.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _32.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _32.b(423383746369705L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _32.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _32.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _32.b(423383746369705L, 0L);
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
            if (c == 'S' || c == 'A' || c == '\u00cd' || c == 'i') {
                field = _32.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'S' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'A' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00cd' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _32.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ff' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'L' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            throw new RuntimeException("dev/krypton/32" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _32.a(lookup, mutableCallSite, string, methodType, l2, l3);
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
            case 0 -> 47;
            case 1 -> 30;
            case 2 -> 10;
            case 3 -> 62;
            case 4 -> 22;
            case 5 -> 23;
            case 6 -> 34;
            case 7 -> 59;
            case 8 -> 6;
            case 9 -> 55;
            case 10 -> 52;
            case 11 -> 9;
            case 12 -> 44;
            case 13 -> 15;
            case 14 -> 3;
            case 15 -> 13;
            case 16 -> 14;
            case 17 -> 35;
            case 18 -> 28;
            case 19 -> 5;
            case 20 -> 25;
            case 21 -> 37;
            case 22 -> 11;
            case 23 -> 42;
            case 24 -> 20;
            case 25 -> 31;
            case 26 -> 4;
            case 27 -> 1;
            case 28 -> 12;
            case 29 -> 51;
            case 30 -> 40;
            case 31 -> 38;
            case 32 -> 33;
            case 33 -> 19;
            case 34 -> 21;
            case 35 -> 29;
            case 36 -> 2;
            case 37 -> 58;
            case 38 -> 49;
            case 39 -> 46;
            case 40 -> 50;
            case 41 -> 43;
            case 42 -> 0;
            case 43 -> 39;
            case 44 -> 24;
            case 45 -> 16;
            case 46 -> 27;
            case 47 -> 53;
            case 48 -> 17;
            case 49 -> 54;
            case 50 -> 32;
            case 51 -> 26;
            case 52 -> 41;
            case 53 -> 7;
            case 54 -> 57;
            case 55 -> 56;
            case 56 -> 48;
            case 57 -> 60;
            case 58 -> 61;
            case 59 -> 63;
            case 60 -> 45;
            case 61 -> 8;
            case 62 -> 18;
            default -> 36;
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
        _32.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "\u001dTXx!Y\u0016[I7J[\u0002X";
        objectArray[1] = " \u0011\u007f\f=\r+\u001enCP\r+\u0003z";
        objectArray[2] = "/\u000b\u000eK\u000fw$\u0004\u001f\u0004ro7\u0003\u0016M";
        objectArray[3] = "OMz!RxRXx`W$\u0018\u001a";
        objectArray[4] = "R1X\t\u001f+b\u000fE\u001c\u001djgS\u000f^R";
        objectArray[5] = "%5t0\u0017\u000e\u0015\u000bi%\u0015O\u0010W#gZ";
        objectArray[6] = "k\u000b{y>d`\u0004j6_jk\u000fnl";
        objectArray[7] = "\u0017\u0004:(@ \u001d\u00109';q-Ek0\u0006u_D5/^";
        objectArray[8] = "-l\u0007[\u0005\u000f'x\u0004T~_\u0017-VCCZe,\b\\\u001b`";
        objectArray[9] = "D3Yca>N'Zl\u001a\n9\u0002$^&QD3Yca>N'Zl";
        objectArray[10] = "b}9\u0004\u00192hi:\u000bb\u0006\u001fLD9_]b}9\u0004\u00192hi:\u000b";
        objectArray[11] = "+\u0019\r\u0014}F!\r\u000e\u001b\u0006\u0011\u0011Y\t\bk\u0011l\u000f\u0003\nm";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "x}53aNxxo]!Xqd>\u001a11gr>2fCw~(]e\u000botk 3\u0001mrS0;W{',0>\r\u0015";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static int cfr_renamed_4() {
        int n = _32.cfr_renamed_2();
        if (n == 0) {
            return 79;
        }
        return 0;
    }

    public static int cfr_renamed_2() {
        return cfr_renamed_6;
    }

    public static void cfr_renamed_6(int n) {
        cfr_renamed_6 = n;
    }

    private static _32[] cfr_renamed_9() {
        long l2 = a ^ 0x5749D3D6286L;
        return new _32[]{_32.a("\u00cd", -2316163673248562266L, (long)l2), _32.a("\u00cd", -2316065626488528591L, (long)l2)};
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_32.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

