/*
 * Decompiled with CFR 0.152.
 */
package dev.krypton;

import dev.krypton._0t;
import dev.krypton._4w;
import dev.krypton.l;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class _0j {
    public final _0t cfr_renamed_6;
    private static _4w[] cfr_renamed_3;
    private static final long b;
    private static final Object[] f;
    private static final String[] g;

    public static void cfr_renamed_5(_4w[] wArray) {
        cfr_renamed_3 = wArray;
    }

    protected _0j(_0t t) {
        this.cfr_renamed_6 = t;
    }

    static {
        b = l.a(-7807191572136586724L, -4863215097003559061L, MethodHandles.lookup().lookupClass()).a(69503950020287L);
        f = new Object[6];
        g = new String[6];
        _0j.a();
        if (_0j.cfr_renamed_1() == null) {
            _0j.cfr_renamed_5(new _4w[1]);
        }
    }

    public String toString() {
        long l2 = b ^ 0x587C9C956886L;
        return _0j.b("\u00dd", (Object)_0j.b("\u00d1", (Object)this, -2520866864895760592L, (long)l2), -2520764326370117933L, (long)l2);
    }

    public static _4w[] cfr_renamed_1() {
        return cfr_renamed_3;
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _0j.a(l2, l3);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                _0j.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0j" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _0j.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _0j.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _0j.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _0j.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _0j.a(l2, l3);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = _0j.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _0j.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _0j.a(clazz3, string2, clazz2)) != null) {
                    _0j.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _0j.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _0j.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _0j.b(214698157520272L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _0j.a(l2, l3);
        Object object = f[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = g[n];
                int n3 = string2.indexOf(8);
                clazz3 = _0j.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _0j.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _0j.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _0j.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _0j.b(214698157520272L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _0j.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _0j.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _0j.b(214698157520272L, 0L);
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _0j.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d1' || c == '\u00c2' || c == 'Q' || c == 'M') {
                field = _0j.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d1' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c2' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'Q' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _0j.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00dd' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'w' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "\u001b\bE+x:\u0006\u001dGj}fO\u0019";
        objectArray[1] = "\u001a:\u0014j?2\u00115\u0005%B*\u00022\fl";
        objectArray[2] = "I))9vIT<+xs\u0015\u001d&";
        objectArray[3] = "'H\u0016j~\u0019,G\u0007%\u001f\u0017'L\u0003\u007f";
        objectArray[4] = "Il|g~=\u0011-y$E=p$/r<:N$\u007f,";
        Object[] objectArray2 = objectArray;
        objectArray[5] = "#\r\u0012+\u001f\u001c#]LR_EHA\u00073EM\u0013\u0004\u0016.M\u0012\"\r\u0017>B\"";
    }

    private static int a(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (g[n3] != null) {
            return n3;
        }
        Object object = f[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 26;
            case 1 -> 23;
            case 2 -> 17;
            case 3 -> 2;
            case 4 -> 46;
            case 5 -> 37;
            case 6 -> 58;
            case 7 -> 10;
            case 8 -> 19;
            case 9 -> 61;
            case 10 -> 9;
            case 11 -> 54;
            case 12 -> 36;
            case 13 -> 39;
            case 14 -> 45;
            case 15 -> 40;
            case 16 -> 31;
            case 17 -> 24;
            case 18 -> 29;
            case 19 -> 28;
            case 20 -> 44;
            case 21 -> 16;
            case 22 -> 59;
            case 23 -> 35;
            case 24 -> 1;
            case 25 -> 42;
            case 26 -> 43;
            case 27 -> 8;
            case 28 -> 49;
            case 29 -> 32;
            case 30 -> 5;
            case 31 -> 56;
            case 32 -> 50;
            case 33 -> 7;
            case 34 -> 57;
            case 35 -> 13;
            case 36 -> 20;
            case 37 -> 60;
            case 38 -> 25;
            case 39 -> 18;
            case 40 -> 11;
            case 41 -> 6;
            case 42 -> 63;
            case 43 -> 30;
            case 44 -> 34;
            case 45 -> 33;
            case 46 -> 62;
            case 47 -> 48;
            case 48 -> 27;
            case 49 -> 15;
            case 50 -> 22;
            case 51 -> 38;
            case 52 -> 41;
            case 53 -> 52;
            case 54 -> 55;
            case 55 -> 53;
            case 56 -> 12;
            case 57 -> 51;
            case 58 -> 3;
            case 59 -> 47;
            case 60 -> 21;
            case 61 -> 0;
            case 62 -> 4;
            default -> 14;
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
        _0j.g[n3] = new String(cArray);
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

    public abstract InputStream cfr_renamed_7(Object[] var1);

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_0j.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

