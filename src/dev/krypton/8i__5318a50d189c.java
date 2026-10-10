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

/*
 * Renamed from dev.krypton.8i
 */
public class _8i_0
extends Enum {
    public static final _8i_0 Forward;
    public static final _8i_0 Backward;
    public static final _8i_0 Left;
    public static final _8i_0 Right;
    private final String cfr_renamed_9;
    private static final _8i_0[] cfr_renamed_3;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _8i_0() {
        void var3_1;
        void cfr_renamed_27;
        void cfr_renamed_28;
        this.cfr_renamed_9 = var3_1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                _8i_0.a = l.a(334446007251249505L, 6292098576287955431L, MethodHandles.lookup().lookupClass()).a(191463466217398L);
                var9 = _8i_0.a ^ 76199076205938L;
                _8i_0.b = new Object[15];
                _8i_0.c = new String[15];
                _8i_0.a();
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
                var0_3 = new String[8];
                var6_4 = 0;
                var5_5 = "[\u00c9\u00fdY0\u00b2\u00ac\u00f1\u0018\u00c8v\u00abX\u00e6\u00e4\u00b5\bb\u0015\u0005\u00ca\u0004\u00b0\u008dU\bm\t6\u00ef!s\u00ea\u00e0\b\u009cvv\u00a86\u00a7\u00a1\u00d6\bb\u0015\u0005\u00ca\u0004\u00b0\u008dU\u0010[\u00c9\u00fdY0\u00b2\u00ac\u00f1\u0018\u00c8v\u00abX\u00e6\u00e4\u00b5";
                var7_6 = "[\u00c9\u00fdY0\u00b2\u00ac\u00f1\u0018\u00c8v\u00abX\u00e6\u00e4\u00b5\bb\u0015\u0005\u00ca\u0004\u00b0\u008dU\bm\t6\u00ef!s\u00ea\u00e0\b\u009cvv\u00a86\u00a7\u00a1\u00d6\bb\u0015\u0005\u00ca\u0004\u00b0\u008dU\u0010[\u00c9\u00fdY0\u00b2\u00ac\u00f1\u0018\u00c8v\u00abX\u00e6\u00e4\u00b5".length();
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
                    var0_3[var6_4++] = _8i_0.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u009cvv\u00a86\u00a7\u00a1\u00d6\bm\t6\u00ef!s\u00ea\u00e0";
                    var7_6 = "\u009cvv\u00a86\u00a7\u00a1\u00d6\bm\t6\u00ef!s\u00ea\u00e0".length();
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
                    var0_3[var6_4++] = _8i_0.a(var8_9).intern();
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
        _8i_0.Forward = new _8i_0(var0_3[3], 0, var0_3[6]);
        _8i_0.Backward = new _8i_0(var0_3[5], 1, var0_3[0]);
        _8i_0.Left = new _8i_0(var0_3[1], 2, var0_3[4]);
        _8i_0.Right = new _8i_0(var0_3[7], 3, var0_3[2]);
        _8i_0.cfr_renamed_3 = _8i_0.a("I", (long)-3467883634476826221L, (long)var9);
    }

    public String toString() {
        long l2 = a ^ 0xF9EA47B8BAAL;
        return _8i_0.a("b", (Object)((Object)this), -3384538331492095963L, (long)l2);
    }

    public static _8i_0[] values() {
        long l2 = a ^ 0x30B6B71A36C8L;
        return (_8i_0[])((Enum)((Object)_8i_0.a("\u00ec", 7810414471022138975L, (long)l2))).clone();
    }

    public static _8i_0 valueOf(String string) {
        long l2 = a ^ 0x77AA9DAF58B3L;
        return (_8i_0)((Object)_8i_0.a("I", _8i_0.class, (Object)string, 153088642305604915L, (long)l2));
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _8i_0.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _8i_0.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _8i_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _8i_0.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _8i_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _8i_0.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _8i_0.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _8i_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _8i_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _8i_0.a(clazz3, string2, clazz2)) != null) {
                    _8i_0.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _8i_0.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _8i_0.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _8i_0.b(435999078647320L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _8i_0.a(l2, l3);
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
                clazz3 = _8i_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _8i_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _8i_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _8i_0.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _8i_0.b(435999078647320L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _8i_0.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _8i_0.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _8i_0.b(435999078647320L, 0L);
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
            throw new RuntimeException("dev/krypton/8i" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'b' || c == '\u00cf' || c == '\u00ec' || c == 'Q') {
                field = _8i_0.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'b' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00cf' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ec' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _8i_0.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00a4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'I' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _8i_0.a(lookup, mutableCallSite, string, methodType, l2, l3);
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
            case 0 -> 4;
            case 1 -> 3;
            case 2 -> 56;
            case 3 -> 2;
            case 4 -> 61;
            case 5 -> 1;
            case 6 -> 32;
            case 7 -> 19;
            case 8 -> 59;
            case 9 -> 38;
            case 10 -> 55;
            case 11 -> 7;
            case 12 -> 41;
            case 13 -> 54;
            case 14 -> 43;
            case 15 -> 48;
            case 16 -> 52;
            case 17 -> 37;
            case 18 -> 18;
            case 19 -> 34;
            case 20 -> 53;
            case 21 -> 14;
            case 22 -> 51;
            case 23 -> 29;
            case 24 -> 13;
            case 25 -> 63;
            case 26 -> 8;
            case 27 -> 40;
            case 28 -> 15;
            case 29 -> 16;
            case 30 -> 17;
            case 31 -> 21;
            case 32 -> 28;
            case 33 -> 5;
            case 34 -> 12;
            case 35 -> 9;
            case 36 -> 24;
            case 37 -> 33;
            case 38 -> 11;
            case 39 -> 62;
            case 40 -> 42;
            case 41 -> 50;
            case 42 -> 44;
            case 43 -> 27;
            case 44 -> 25;
            case 45 -> 35;
            case 46 -> 6;
            case 47 -> 47;
            case 48 -> 46;
            case 49 -> 23;
            case 50 -> 20;
            case 51 -> 39;
            case 52 -> 45;
            case 53 -> 49;
            case 54 -> 36;
            case 55 -> 31;
            case 56 -> 57;
            case 57 -> 58;
            case 58 -> 30;
            case 59 -> 26;
            case 60 -> 10;
            case 61 -> 0;
            case 62 -> 60;
            default -> 22;
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
        _8i_0.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "\u0016o`\u0006\n5\u000bzbG\u000fiJc";
        objectArray[1] = "\u001eN#\u00169#\u0015A2YR!\u0001B";
        objectArray[2] = "G6\u0018>N\u0007L9\tq#\u0007L$\u001d";
        objectArray[3] = "Dk\u0016[-\tOd\u0007\u0014P\u0011\\c\u000e]";
        objectArray[4] = "|h\u0007\u000fX\bLV\u001a\u001aZII\n[\u0003\u0015";
        objectArray[5] = "CrK^Z#sLVKXbv\u0010\u0017R\u0017";
        objectArray[6] = "bw~(-cixogLmbsk=";
        objectArray[7] = "~t<T\u0015R&u:)=Wtr,@\rR\u001fp6F\n\\s(7@";
        objectArray[8] = "*T0\u0003~\u0003rU6~X\u0002%M_\u001fy\u00006S3Gx\u0006";
        objectArray[9] = "\u001dKe\b\u000e\u0014EJcu6\u0019\u0013Nvu\r\u001d\u0013Sh\u0019U\u001c\u0015";
        objectArray[10] = "Bd\u00142\rq\u001ae\u0012OP\u001d\u0019k\u0000#\u0011p\u001d<Ju";
        objectArray[11] = "c&#=l\\;'%@209%3!1R:==)\u000e";
        objectArray[12] = "\tN4\\#iQO2!{\u0005SM$@~gPU*H";
        objectArray[13] = "FJ~0$\u0010\u001eKxM\b\u001b]Px7*|FJ~0$\u0010\u001eKx";
        Object[] objectArray2 = objectArray;
        objectArray[14] = "\u0003\"*=:k\u0002qt[-m\u001cb}\u001c=\u0004Ao\u007f;-n\u001fqh4S>\u0012d|%>:E.*[(9Byy4)j\u001c\u001f";
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

    private static _8i_0[] cfr_renamed_7() {
        long l2 = a ^ 0x83C67B52CAAL;
        return new _8i_0[]{_8i_0.a("\u00ec", 8504569832767975606L, (long)l2), _8i_0.a("\u00ec", 8504189837477357535L, (long)l2), _8i_0.a("\u00ec", 8504790459477644306L, (long)l2), _8i_0.a("\u00ec", 8504887981608989328L, (long)l2)};
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_8i_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

