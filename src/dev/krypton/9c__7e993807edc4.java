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

public class _9c
extends Enum {
    public static final _9c Normal;
    public static final _9c Smoothstep;
    public static final _9c EaseOut;
    private final String cfr_renamed_6;
    private static final _9c[] cfr_renamed_7;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _9c() {
        void var3_1;
        void cfr_renamed_27;
        void cfr_renamed_28;
        this.cfr_renamed_6 = var3_1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                _9c.a = l.a(7528869603295425987L, -5292497896327691971L, MethodHandles.lookup().lookupClass()).a(107160299533042L);
                var9 = _9c.a ^ 2063835977571L;
                _9c.b = new Object[14];
                _9c.c = new String[14];
                _9c.a();
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
                var5_5 = "\u0015Mdg6p\u009c\u00fd\u0010q\u00b1U\u00e3\u00f2\u00fe\u0018\u0000 \u00c2\u008b\u00c5\u000e\u00b7\u0085M\b\u00e7\u00e6\u009d\u00bb\u009d\u00a4t\u00e2\u0010b\u0086M\u00df\u009d0\u00d1\u00c5\u0080\u00eb\u00d4\u0085\u00b2\u00d7Z\u00f3";
                var7_6 = "\u0015Mdg6p\u009c\u00fd\u0010q\u00b1U\u00e3\u00f2\u00fe\u0018\u0000 \u00c2\u008b\u00c5\u000e\u00b7\u0085M\b\u00e7\u00e6\u009d\u00bb\u009d\u00a4t\u00e2\u0010b\u0086M\u00df\u009d0\u00d1\u00c5\u0080\u00eb\u00d4\u0085\u00b2\u00d7Z\u00f3".length();
                var4_7 = 8;
                var3_8 = -1;
lbl22:
                // 2 sources

                while (true) {
                    v3 = ++var3_8;
                    v4 = var5_5.substring(v3, v3 + var4_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = _9c.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u0015Mdg6p\u009c\u00fd\u0010b\u0086M\u00df\u009d0\u00d1\u00c5\u0080\u00eb\u00d4\u0085\u00b2\u00d7Z\u00f3";
                    var7_6 = "\u0015Mdg6p\u009c\u00fd\u0010b\u0086M\u00df\u009d0\u00d1\u00c5\u0080\u00eb\u00d4\u0085\u00b2\u00d7Z\u00f3".length();
                    var4_7 = 8;
                    var3_8 = -1;
lbl36:
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
lbl41:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = _9c.a(var8_9).intern();
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
lbl53:
                // 1 sources

                ** continue;
            }
        }
        _9c.Normal = new _9c(var0_3[0], 0, var0_3[4]);
        _9c.Smoothstep = new _9c(var0_3[3], 1, var0_3[5]);
        _9c.EaseOut = new _9c(var0_3[2], 2, var0_3[1]);
        _9c.cfr_renamed_7 = _9c.a("W", (long)-2608751406761033979L, (long)var9);
    }

    public String toString() {
        long l2 = a ^ 0x44960E745E3L;
        return _9c.a("\u00c0", (Object)((Object)this), 5280672836528561215L, (long)l2);
    }

    public static _9c[] values() {
        long l2 = a ^ 0xCAF10385E4BL;
        return (_9c[])((Enum)((Object)_9c.a("o", 5972668960608328278L, (long)l2))).clone();
    }

    public static _9c valueOf(String string) {
        long l2 = a ^ 0x14B398C25D09L;
        return (_9c)((Object)_9c.a("W", _9c.class, (Object)string, 5881841775984570961L, (long)l2));
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _9c.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _9c.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _9c.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _9c.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _9c.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _9c.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _9c.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _9c.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _9c.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _9c.a(clazz3, string2, clazz2)) != null) {
                    _9c.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _9c.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _9c.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _9c.b(433334280639487L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _9c.a(l2, l3);
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
                clazz3 = _9c.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _9c.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _9c.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _9c.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _9c.b(433334280639487L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _9c.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _9c.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _9c.b(433334280639487L, 0L);
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/9c" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c0' || c == 'f' || c == 'o' || c == 'D') {
                field = _9c.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c0' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'f' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'o' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _9c.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'W' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _9c.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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
            case 0 -> 13;
            case 1 -> 42;
            case 2 -> 31;
            case 3 -> 9;
            case 4 -> 35;
            case 5 -> 47;
            case 6 -> 51;
            case 7 -> 18;
            case 8 -> 44;
            case 9 -> 14;
            case 10 -> 17;
            case 11 -> 62;
            case 12 -> 8;
            case 13 -> 6;
            case 14 -> 58;
            case 15 -> 48;
            case 16 -> 40;
            case 17 -> 29;
            case 18 -> 23;
            case 19 -> 34;
            case 20 -> 52;
            case 21 -> 25;
            case 22 -> 53;
            case 23 -> 56;
            case 24 -> 39;
            case 25 -> 32;
            case 26 -> 30;
            case 27 -> 38;
            case 28 -> 57;
            case 29 -> 4;
            case 30 -> 22;
            case 31 -> 11;
            case 32 -> 2;
            case 33 -> 7;
            case 34 -> 41;
            case 35 -> 21;
            case 36 -> 59;
            case 37 -> 1;
            case 38 -> 16;
            case 39 -> 55;
            case 40 -> 10;
            case 41 -> 37;
            case 42 -> 60;
            case 43 -> 36;
            case 44 -> 46;
            case 45 -> 50;
            case 46 -> 3;
            case 47 -> 20;
            case 48 -> 5;
            case 49 -> 49;
            case 50 -> 24;
            case 51 -> 33;
            case 52 -> 28;
            case 53 -> 43;
            case 54 -> 61;
            case 55 -> 63;
            case 56 -> 26;
            case 57 -> 45;
            case 58 -> 54;
            case 59 -> 19;
            case 60 -> 12;
            case 61 -> 27;
            case 62 -> 0;
            default -> 15;
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
        _9c.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "VZ}\u0002TiKO\u007fCQ5\u000b\\";
        objectArray[1] = "P;\t\u0012}z[4\u0018]\u0000bH3\u0011\u0014";
        objectArray[2] = "t)M#yuD\u0017P6{4AK\u0010%4";
        objectArray[3] = "\u0000 h0$\u000f\u000b/y\u007fO\r\u001f,";
        objectArray[4] = "\r.{{>3\u0006!j4S3\u0006<~";
        objectArray[5] = "\u0012c\"\u0016\u0016V\"]?\u0003\u0014\u0017'\u0001\u007f\u0010[";
        objectArray[6] = "pO#/P:{@2`14pK6:";
        objectArray[7] = "n^5rd\u001bcV5O$k0\u000bxub\blFl\"";
        objectArray[8] = "I8\u0017\u0010BED0\u0017-\u007fRT9AI9RJc\u0015VI_Bc";
        objectArray[9] = "LD\u0001\ruTAL\u000102$\u0010Z[\u000ev\u0018HC\u0005\t";
        objectArray[10] = "d\u0016*-1=i\u001e*\u0010pM8\bp.2q`\u0011.)J";
        objectArray[11] = "VI5fa5[A5[A VJv;a9\\U\n<~z\fVz1vz";
        objectArray[12] = "0\u0007(\fs\u001c{[eUI\u001ac\u0002)\u0005\u000e\n\n]hVu\u001fl\u001ei\u00191d3W&R4\u0007o\u001a2\u0005I^k\u001a0R1\u00157Wih";
        Object[] objectArray2 = objectArray;
        objectArray[13] = ")\u001b\u001e~O]$\u0013\u001eCyD5\u0012f>H-)\u001b\u001e~O]$\u0013\u001e";
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static _9c[] cfr_renamed_3() {
        long l2 = a ^ 0x9BAABCE6945L;
        return new _9c[]{_9c.a("o", 7344622495278168741L, (long)l2), _9c.a("o", 7344735325719822828L, (long)l2), _9c.a("o", 7344273548450597544L, (long)l2)};
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_9c.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

