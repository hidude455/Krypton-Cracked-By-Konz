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

public class _3m
extends Enum {
    public static final _3m DEEPSLATE;
    public static final _3m ROTATED_DEEPSLATE;
    public static final _3m VINE;
    public static final _3m AMETHYST_CLUSTER;
    private static final _3m[] cfr_renamed_6;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    public static _3m[] values() {
        long l2 = a ^ 0x524E9782D6AAL;
        return (_3m[])((Enum)((Object)_3m.a("\u00e2", 4540969275235865117L, (long)l2))).clone();
    }

    public static _3m valueOf(String string) {
        long l2 = a ^ 0x502A034E8565L;
        return (_3m)((Object)_3m.a("b", _3m.class, (Object)string, 7839134245740311864L, (long)l2));
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _3m() {
        void cfr_renamed_27;
        void cfr_renamed_28;
    }

    private static _3m[] cfr_renamed_8() {
        long l2 = a ^ 0x2B755A177D4CL;
        return new _3m[]{_3m.a("\u00e2", -7718573088157366041L, (long)l2), _3m.a("\u00e2", -7718364564352293968L, (long)l2), _3m.a("\u00e2", -7718492455330348523L, (long)l2), _3m.a("\u00e2", -7718267715308127228L, (long)l2)};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                _3m.a = l.a(-2017993729725349500L, 7291191293331015333L, MethodHandles.lookup().lookupClass()).a(238405231030072L);
                var9 = _3m.a ^ 95579887640201L;
                _3m.b = new Object[14];
                _3m.c = new String[14];
                _3m.a();
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
                var5_5 = "0\u00ee`\u008b\f\u00acF\u00e3\u00cd\u00b3E\u00c9:)\u009e\n\b\u00ef\u00ea\u00a1\u00fd,\u00fc\u00e2\u00f6";
                var7_6 = "0\u00ee`\u008b\f\u00acF\u00e3\u00cd\u00b3E\u00c9:)\u009e\n\b\u00ef\u00ea\u00a1\u00fd,\u00fc\u00e2\u00f6".length();
                var4_7 = 16;
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
                    var0_3[var6_4++] = _3m.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "Vp\u0089H\u00dc\u00a5V\u00ef\u00f6\u00cd\u00f0\u00a30C\u00c1\u00f6\u00d8\u00ce\u008fr\u008c$\u00a5z\u0018\u009fj\u00e60\u00bd\u00c4M\u0006\u008a\u00bc\u00a9E\u00aeP\u0017\u00aa1\u0006\u00ae\u00e3/2\u00af\u00ef";
                    var7_6 = "Vp\u0089H\u00dc\u00a5V\u00ef\u00f6\u00cd\u00f0\u00a30C\u00c1\u00f6\u00d8\u00ce\u008fr\u008c$\u00a5z\u0018\u009fj\u00e60\u00bd\u00c4M\u0006\u008a\u00bc\u00a9E\u00aeP\u0017\u00aa1\u0006\u00ae\u00e3/2\u00af\u00ef".length();
                    var4_7 = 24;
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
                    var0_3[var6_4++] = _3m.a(var8_9).intern();
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
        _3m.DEEPSLATE = new _3m(var0_3[0], 0);
        _3m.ROTATED_DEEPSLATE = new _3m(var0_3[2], 1);
        _3m.VINE = new _3m(var0_3[1], 2);
        _3m.AMETHYST_CLUSTER = new _3m(var0_3[3], 3);
        _3m.cfr_renamed_6 = _3m.a("b", (long)-638217002505378400L, (long)var9);
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
            case 0 -> 14;
            case 1 -> 1;
            case 2 -> 6;
            case 3 -> 5;
            case 4 -> 57;
            case 5 -> 34;
            case 6 -> 45;
            case 7 -> 48;
            case 8 -> 53;
            case 9 -> 29;
            case 10 -> 17;
            case 11 -> 52;
            case 12 -> 47;
            case 13 -> 21;
            case 14 -> 55;
            case 15 -> 58;
            case 16 -> 16;
            case 17 -> 40;
            case 18 -> 15;
            case 19 -> 41;
            case 20 -> 62;
            case 21 -> 18;
            case 22 -> 36;
            case 23 -> 43;
            case 24 -> 35;
            case 25 -> 22;
            case 26 -> 20;
            case 27 -> 4;
            case 28 -> 23;
            case 29 -> 8;
            case 30 -> 10;
            case 31 -> 61;
            case 32 -> 37;
            case 33 -> 27;
            case 34 -> 11;
            case 35 -> 63;
            case 36 -> 7;
            case 37 -> 38;
            case 38 -> 33;
            case 39 -> 50;
            case 40 -> 42;
            case 41 -> 24;
            case 42 -> 28;
            case 43 -> 60;
            case 44 -> 46;
            case 45 -> 3;
            case 46 -> 12;
            case 47 -> 59;
            case 48 -> 49;
            case 49 -> 13;
            case 50 -> 44;
            case 51 -> 9;
            case 52 -> 30;
            case 53 -> 54;
            case 54 -> 32;
            case 55 -> 19;
            case 56 -> 0;
            case 57 -> 39;
            case 58 -> 56;
            case 59 -> 2;
            case 60 -> 25;
            case 61 -> 26;
            case 62 -> 31;
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
        _3m.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "S\u001a\u001b\u001e\nNX\u0015\nQaLL\u0016";
        objectArray[1] = "\u0007-\u0018\u001c\tz\f\"\tSdz\f?\u001d";
        objectArray[2] = "\u0016\u0016\u001fQ\u0006\u0000\u001d\u0019\u000e\u001e{\u0018\u000e\u001e\u0007W";
        objectArray[3] = "y\u001fVo3*d\nT.6v.\u0017";
        objectArray[4] = "Xe\f\u0015\u0011Rh[\u0011\u0000\u0013\u0013m\u0007[\u001d\\";
        objectArray[5] = "*\u0016\u0017&qN\u001a(\n3s\u000f\u001ft@.<";
        objectArray[6] = "k\u000f!):\u0019`\u00000f[\u0017k\u000b4<";
        objectArray[7] = "PNAl\u0006n\u0011@H~vkjD[d\u0007m\b\u0014Tm\u001dV";
        objectArray[8] = "-\b\u001b\u001bpgl\u0006\u0012\t\u0000\u0013Zt8+D\u0016Kt`J1$|IX\u000b?-n";
        objectArray[9] = "4\t\u0010+aQu\u0007\u00199\u00117O~&@+XuS\u001bxjV|A";
        objectArray[10] = "t>\u0003q6?50\ncF<N4\u0019y7<,d\u0016p-";
        objectArray[11] = "O[\u0011f#\r\u000eU\u0018tSo26#Q\u001ey\"&'@\u000bn1#6@S\u000fD\u0011\u0001}kNJ\u0018\u0013";
        objectArray[12] = "34:eD\u007fr:3w4\u000eLH\u001dNe\u001cUR\nJi\u001cUH\u001b\u000e\u000evrn16Ox{|";
        Object[] objectArray2 = objectArray;
        objectArray[13] = "j-WS\u0014Vg*\u0017mR\u0003ho\u0002*Bj5-\u0017\u000fM\u0016jh\u0004\u0001,Sun\u0017\u0004M\u0004i~\u001emJU4,WQGRt\u0012";
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _3m.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _3m.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _3m.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _3m.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _3m.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _3m.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _3m.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _3m.a(clazz3, string2, clazz2)) != null) {
                    _3m.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _3m.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _3m.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _3m.b(427575240873872L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
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

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _3m.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _3m.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method d(long l2, long l3) {
        int n = _3m.a(l2, l3);
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
                clazz3 = _3m.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _3m.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _3m.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _3m.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _3m.b(427575240873872L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _3m.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _3m.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _3m.b(427575240873872L, 0L);
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
            if (c == 'v' || c == 'u' || c == '\u00e2' || c == 'E') {
                field = _3m.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'v' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'u' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _3m.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'N' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'b' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _3m.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/3m" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_3m.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

