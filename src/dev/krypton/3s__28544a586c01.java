/*
 * Decompiled with CFR 0.152.
 */
package dev.krypton;

import dev.krypton._4w;
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

public class _3s
extends Enum {
    public static final _3s Nearest;
    public static final _3s Named;
    private final String cfr_renamed_2;
    private static final _3s[] cfr_renamed_8;
    private static _4w[] cfr_renamed_4;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    public static _4w[] cfr_renamed_5() {
        return cfr_renamed_4;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _3s() {
        void var3_1;
        void cfr_renamed_27;
        void cfr_renamed_28;
        this.cfr_renamed_2 = var3_1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                _3s.a = l.a(6426482242310755554L, 8783290327324374851L, MethodHandles.lookup().lookupClass()).a(177969778579893L);
                var9 = _3s.a ^ 69496948113794L;
                _3s.b = new Object[13];
                _3s.c = new String[13];
                _3s.a();
                if (_3s.cfr_renamed_5() != null) {
                    _3s.cfr_renamed_4(new _4w[4]);
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
                var5_5 = "\u00d1\u0080\u00a1\u00b5\u000f\u0080\u0093\u00eb\b\u00d1\u0080\u00a1\u00b5\u000f\u0080\u0093\u00eb";
                var7_6 = "\u00d1\u0080\u00a1\u00b5\u000f\u0080\u0093\u00eb\b\u00d1\u0080\u00a1\u00b5\u000f\u0080\u0093\u00eb".length();
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
                    var0_3[var6_4++] = _3s.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u00fc\u00d1\u009cxO\u000b\u00b9=\b\u00fc\u00d1\u009cxO\u000b\u00b9=";
                    var7_6 = "\u00fc\u00d1\u009cxO\u000b\u00b9=\b\u00fc\u00d1\u009cxO\u000b\u00b9=".length();
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
                    var0_3[var6_4++] = _3s.a(var8_9).intern();
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
        _3s.Nearest = new _3s(var0_3[2], 0, var0_3[3]);
        _3s.Named = new _3s(var0_3[0], 1, var0_3[1]);
        _3s.cfr_renamed_8 = _3s.a("r", (long)6329172039848219729L, (long)var9);
    }

    public String toString() {
        long l2 = a ^ 0x3F6680928C5FL;
        return _3s.a("X", (Object)((Object)this), 1876613791785623742L, (long)l2);
    }

    public static _3s[] values() {
        long l2 = a ^ 0x2C82CC551AEBL;
        return (_3s[])((Enum)((Object)_3s.a("L", -8304840222353243585L, (long)l2))).clone();
    }

    public static _3s valueOf(String string) {
        long l2 = a ^ 0x792C2D8EB721L;
        return (_3s)((Object)_3s.a("r", _3s.class, (Object)string, 2411046406740281631L, (long)l2));
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _3s.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _3s.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _3s.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _3s.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _3s.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _3s.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _3s.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _3s.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _3s.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _3s.a(clazz3, string2, clazz2)) != null) {
                    _3s.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _3s.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _3s.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _3s.b(459609348261159L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _3s.a(l2, l3);
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
                clazz3 = _3s.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _3s.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _3s.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _3s.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _3s.b(459609348261159L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _3s.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _3s.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _3s.b(459609348261159L, 0L);
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
            throw new RuntimeException("dev/krypton/3s" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _3s.a(lookup, mutableCallSite, string, methodType, l2, l3);
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
            if (c == 'X' || c == 'x' || c == 'L' || c == 'i') {
                field = _3s.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'X' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'x' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'L' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _3s.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'r' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            case 0 -> 55;
            case 1 -> 22;
            case 2 -> 49;
            case 3 -> 48;
            case 4 -> 10;
            case 5 -> 29;
            case 6 -> 17;
            case 7 -> 14;
            case 8 -> 8;
            case 9 -> 15;
            case 10 -> 50;
            case 11 -> 56;
            case 12 -> 54;
            case 13 -> 43;
            case 14 -> 47;
            case 15 -> 16;
            case 16 -> 35;
            case 17 -> 40;
            case 18 -> 37;
            case 19 -> 9;
            case 20 -> 5;
            case 21 -> 21;
            case 22 -> 0;
            case 23 -> 34;
            case 24 -> 30;
            case 25 -> 61;
            case 26 -> 13;
            case 27 -> 19;
            case 28 -> 51;
            case 29 -> 1;
            case 30 -> 58;
            case 31 -> 28;
            case 32 -> 32;
            case 33 -> 62;
            case 34 -> 25;
            case 35 -> 26;
            case 36 -> 12;
            case 37 -> 27;
            case 38 -> 52;
            case 39 -> 60;
            case 40 -> 41;
            case 41 -> 24;
            case 42 -> 11;
            case 43 -> 6;
            case 44 -> 4;
            case 45 -> 63;
            case 46 -> 44;
            case 47 -> 45;
            case 48 -> 18;
            case 49 -> 3;
            case 50 -> 53;
            case 51 -> 39;
            case 52 -> 57;
            case 53 -> 23;
            case 54 -> 42;
            case 55 -> 2;
            case 56 -> 38;
            case 57 -> 31;
            case 58 -> 59;
            case 59 -> 33;
            case 60 -> 46;
            case 61 -> 20;
            case 62 -> 7;
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
        _3s.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "\u001c@\u0002y#p\u0001U\u00008&,KV";
        objectArray[1] = ",MI8\u0019\u000f\u001csT-\u001bN\u0019/\u001e.T";
        objectArray[2] = "<[-\u0014Vk7T<[+s$S5\u0012";
        objectArray[3] = ">m>1b\t\u000eS#$`H\u000b\u000fi'/";
        objectArray[4] = "0u\u0014i1Q;z\u0005&ZS/y";
        objectArray[5] = ">6e1%m59t~Hm5$`";
        objectArray[6] = "}h\u0000yO\u0012vg\u00116.\u001c}l\u0015l";
        objectArray[7] = "\u00167\tO14L{@,nSNm\u0014L5.\u0014c\u0001\u001dU";
        objectArray[8] = "\u001bSi\"\u000b#A\u001f ARDC\tt!\u000f9\u0019\u0007ap";
        objectArray[9] = "\r\u0015Uh\u0018YWY\u001c\u000bB>V^[zLL\u0002D\u001ct";
        objectArray[10] = "&~\u001cU?\u0014|2U6\u001d\u001a!\"\u000169B5,\tQc\u000e|";
        objectArray[11] = "\u001c'/+\u0018q\u0016d(r\"4Ny<!e$'&%&A:E}~+GJ\u001eg>=\u00128J}y3\"q\u001ds&v\u0019{^t\u007fL";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "!(%Qz&{dl2X,*c9IbA!(%Qz&{dl";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static void cfr_renamed_4(_4w[] wArray) {
        cfr_renamed_4 = wArray;
    }

    private static _3s[] cfr_renamed_6() {
        long l2 = a ^ 0x2E36BDEAB623L;
        return new _3s[]{_3s.a("L", 2339154103361242996L, (long)l2), _3s.a("L", 2339619396012988001L, (long)l2)};
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_3s.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

