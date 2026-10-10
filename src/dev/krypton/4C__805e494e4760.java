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

public class _4C
extends Enum {
    public static final _4C Left;
    public static final _4C Right;
    public static final _4C Top;
    public static final _4C Off;
    private static final _4C[] cfr_renamed_9;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _4C() {
        void cfr_renamed_27;
        void cfr_renamed_28;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                _4C.a = l.a(-489459257662356625L, 6331555937977462094L, MethodHandles.lookup().lookupClass()).a(6497364019369L);
                var9 = _4C.a ^ 68112216292271L;
                _4C.b = new Object[14];
                _4C.c = new String[14];
                _4C.a();
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
                var5_5 = "'@\u00f7y\u0005\u00c9\u00db\u00dd\b\u00ba\u00fe\u00d0\u00ccJ3\u00bb\u0006";
                var7_6 = "'@\u00f7y\u0005\u00c9\u00db\u00dd\b\u00ba\u00fe\u00d0\u00ccJ3\u00bb\u0006".length();
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
                    var0_3[var6_4++] = _4C.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u0011\u00bd\u00d7\\}[\u00a1p\b(+\u00cb\u00f0\u00ce\u00a5\u0099\u00b5";
                    var7_6 = "\u0011\u00bd\u00d7\\}[\u00a1p\b(+\u00cb\u00f0\u00ce\u00a5\u0099\u00b5".length();
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
                    var0_3[var6_4++] = _4C.a(var8_9).intern();
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
        _4C.Left = new _4C(var0_3[1], 0);
        _4C.Right = new _4C(var0_3[2], 1);
        _4C.Top = new _4C(var0_3[3], 2);
        _4C.Off = new _4C(var0_3[0], 3);
        _4C.cfr_renamed_9 = _4C.a("$", (long)8743879280354500641L, (long)var9);
    }

    public static _4C[] values() {
        long l2 = a ^ 0x3B5936E133CBL;
        return (_4C[])((Enum)((Object)_4C.a("Y", -5675173155629341110L, (long)l2))).clone();
    }

    public static _4C valueOf(String string) {
        long l2 = a ^ 0x5BC249B5BFDDL;
        return (_4C)((Object)_4C.a("$", _4C.class, (Object)string, 4407424739378571691L, (long)l2));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _4C.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _4C.b(classArray[j], string, clazz2);
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
            int n = _4C.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _4C.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _4C.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _4C.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _4C.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _4C.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _4C.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _4C.a(clazz3, string2, clazz2)) != null) {
                    _4C.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _4C.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _4C.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _4C.b(454837443239754L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _4C.a(l2, l3);
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
                clazz3 = _4C.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _4C.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _4C.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _4C.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _4C.b(454837443239754L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _4C.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _4C.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _4C.b(454837443239754L, 0L);
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e4' || c == 'm' || c == 'Y' || c == 'b') {
                field = _4C.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e4' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'm' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'Y' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _4C.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'i' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '$' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _4C.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/4C" + " : " + string + " : " + methodType.toString(), exception);
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
            case 0 -> 24;
            case 1 -> 46;
            case 2 -> 10;
            case 3 -> 41;
            case 4 -> 55;
            case 5 -> 3;
            case 6 -> 58;
            case 7 -> 44;
            case 8 -> 40;
            case 9 -> 26;
            case 10 -> 42;
            case 11 -> 13;
            case 12 -> 51;
            case 13 -> 0;
            case 14 -> 39;
            case 15 -> 61;
            case 16 -> 63;
            case 17 -> 9;
            case 18 -> 47;
            case 19 -> 7;
            case 20 -> 18;
            case 21 -> 32;
            case 22 -> 15;
            case 23 -> 36;
            case 24 -> 52;
            case 25 -> 56;
            case 26 -> 12;
            case 27 -> 37;
            case 28 -> 16;
            case 29 -> 28;
            case 30 -> 54;
            case 31 -> 59;
            case 32 -> 5;
            case 33 -> 53;
            case 34 -> 2;
            case 35 -> 22;
            case 36 -> 34;
            case 37 -> 33;
            case 38 -> 29;
            case 39 -> 45;
            case 40 -> 38;
            case 41 -> 62;
            case 42 -> 14;
            case 43 -> 21;
            case 44 -> 27;
            case 45 -> 8;
            case 46 -> 35;
            case 47 -> 6;
            case 48 -> 49;
            case 49 -> 50;
            case 50 -> 4;
            case 51 -> 43;
            case 52 -> 20;
            case 53 -> 60;
            case 54 -> 19;
            case 55 -> 23;
            case 56 -> 11;
            case 57 -> 48;
            case 58 -> 57;
            case 59 -> 31;
            case 60 -> 17;
            case 61 -> 1;
            case 62 -> 25;
            default -> 30;
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
        _4C.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "W!!n\u001cvJ4#/\u0019*\u0007\u0007";
        objectArray[1] = "\u0006;\u00000Ol6\u0005\u001d%M-3YP\u0016\u0002";
        objectArray[2] = "\t\u0011\u007f_u\u00009/bJwA<s/y8";
        objectArray[3] = "$\u0017\u0002,\u001b5/\u0018\u0013cp7;\u001b";
        objectArray[4] = "&\t8A\u0006&-\u0006)\u000ek&-\u001b=";
        objectArray[5] = "V-\u000b \u0017b]\"\u001aojzN%\u0013&";
        objectArray[6] = "bub\"?qizsm^\u007fbqw7";
        objectArray[7] = "!3\u0010\\\u000b89(\td($+#\u000fd\u00175'{\n\u0019\u000f.>";
        objectArray[8] = "TZ`\"F\u0011LAy\u001ax\u0002_*fj\\THW~qE";
        objectArray[9] = "q\u0006n\u000ft\u0002i\u001dw7I\u0012z\n\rR}\u001c,\u000fpJf\u0005";
        objectArray[10] = "dez\u000bQ<|~c3t&y\u0015|CKyxhdXR";
        objectArray[11] = ",N\u001c>d)4U\u0005\u0006\"TpG\u0014gb00F\u0010l";
        objectArray[12] = "Y\tp6\u0004HA\u0012i\u000eB5\u0005\u0000xo\u0002QE\u0001|d}";
        Object[] objectArray2 = objectArray;
        objectArray[13] = "{\n\u0006\u0018e\b=\u0003OG\u0005\u0010(\u000b\u0003OB\u0000AU\u000f\u001b~\u0017'_@\u001aun}R\u001c]aTp\u000e@B\u0005T$\u0017DBc\u0012-^\u001b\"";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static _4C[] cfr_renamed_9() {
        long l2 = a ^ 0x7FBA9D8F4C77L;
        return new _4C[]{_4C.a("Y", -3566432430869418319L, (long)l2), _4C.a("Y", -3566074865238566019L, (long)l2), _4C.a("Y", -3566417164839051320L, (long)l2), _4C.a("Y", -3566563798968501231L, (long)l2)};
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_4C.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

