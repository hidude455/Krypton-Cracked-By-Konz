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
import java.lang.runtime.ObjectMethods;
import java.util.Set;

public class _3p
extends Record {
    private final int cfr_renamed_4;
    private final boolean cfr_renamed_8;
    private final Set cfr_renamed_6;
    private static final long a = l.a(3054184151881864191L, -5059058942059319447L, MethodHandles.lookup().lookupClass()).a(237219069371480L);
    private static final Object[] b = new Object[8];
    private static final String[] c = new String[8];

    private _3p(int n, boolean bl, Set set) {
        this.cfr_renamed_4 = n;
        this.cfr_renamed_8 = bl;
        this.cfr_renamed_6 = set;
    }

    static {
        _3p.a();
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{_3p.class, "0;5;3", "0", "5", "3"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{_3p.class, "0;5;3", "0", "5", "3"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{_3p.class, "0;5;3", "0", "5", "3"}, this);
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _3p.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _3p.b(classArray2[j], string, clazz2, n, classArray);
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
            int n = _3p.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _3p.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _3p.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _3p.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _3p.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _3p.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _3p.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _3p.a(clazz3, string2, clazz2)) != null) {
                    _3p.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _3p.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _3p.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _3p.b(309222218267298L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _3p.a(l2, l3);
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
                clazz3 = _3p.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _3p.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _3p.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _3p.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _3p.b(309222218267298L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _3p.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _3p.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _3p.b(309222218267298L, 0L);
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
            throw new RuntimeException("dev/krypton/3p" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _3p.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e7' || c == '\u00ce' || c == '\u00fd' || c == '\u00c6') {
                field = _3p.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e7' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ce' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00fd' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _3p.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'f' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "ji58Y\rw|7y\\Q=|";
        objectArray[1] = "\u001f]w\u001c_.\u0001UmS\">\u0001";
        objectArray[2] = Integer.TYPE;
        _3p.c[2] = "java/lang/Integer";
        objectArray[3] = Boolean.TYPE;
        _3p.c[3] = "java/lang/Boolean";
        objectArray[4] = "\u0006j~M\u0014\u000b\reo\u0002u\u0005\u0006nkX";
        objectArray[5] = "\u0006\u000bf\u0019+*\u0001\u0006*pkGUXm\n6{RG:\u001a";
        objectArray[6] = "7:+\u0004X\u000107gm\u001blda#\u0006\u001a\u0017e4 \u0011";
        Object[] objectArray2 = objectArray;
        objectArray[7] = "D\u007f['=TCr\u0017Nx9\u0014\u007f\u00141|EU4\u0014'";
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
            case 0 -> 39;
            case 1 -> 41;
            case 2 -> 47;
            case 3 -> 20;
            case 4 -> 8;
            case 5 -> 48;
            case 6 -> 59;
            case 7 -> 14;
            case 8 -> 38;
            case 9 -> 26;
            case 10 -> 58;
            case 11 -> 17;
            case 12 -> 53;
            case 13 -> 6;
            case 14 -> 16;
            case 15 -> 1;
            case 16 -> 13;
            case 17 -> 40;
            case 18 -> 60;
            case 19 -> 11;
            case 20 -> 34;
            case 21 -> 7;
            case 22 -> 2;
            case 23 -> 3;
            case 24 -> 57;
            case 25 -> 50;
            case 26 -> 29;
            case 27 -> 5;
            case 28 -> 46;
            case 29 -> 12;
            case 30 -> 30;
            case 31 -> 61;
            case 32 -> 56;
            case 33 -> 23;
            case 34 -> 32;
            case 35 -> 52;
            case 36 -> 36;
            case 37 -> 42;
            case 38 -> 63;
            case 39 -> 43;
            case 40 -> 37;
            case 41 -> 4;
            case 42 -> 10;
            case 43 -> 25;
            case 44 -> 22;
            case 45 -> 28;
            case 46 -> 21;
            case 47 -> 51;
            case 48 -> 9;
            case 49 -> 27;
            case 50 -> 45;
            case 51 -> 44;
            case 52 -> 15;
            case 53 -> 55;
            case 54 -> 49;
            case 55 -> 35;
            case 56 -> 54;
            case 57 -> 0;
            case 58 -> 62;
            case 59 -> 33;
            case 60 -> 24;
            case 61 -> 18;
            case 62 -> 19;
            default -> 31;
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
        _3p.c[n3] = new String(cArray);
        return n3;
    }

    public boolean cfr_renamed_4() {
        long l2 = a ^ 0x1606387E1910L;
        return (boolean)_3p.a("\u00e7", (Object)this, 1921507411430043367L, (long)l2);
    }

    public int cfr_renamed_6() {
        long l2 = a ^ 0x2A01D1F3AC16L;
        return (int)_3p.a("\u00e7", (Object)this, -5788222487690138800L, (long)l2);
    }

    public Set cfr_renamed_0() {
        long l2 = a ^ 0x30FA7DD74E02L;
        return _3p.a("\u00e7", (Object)this, 5600445715965816761L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_3p.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

