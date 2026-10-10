/*
 * Decompiled with CFR 0.152.
 */
package dev.krypton;

import dev.krypton._8o;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.runtime.ObjectMethods;

public class _9d
extends Record {
    private final _8o cfr_renamed_5;
    private final double cfr_renamed_0;
    private final double[] cfr_renamed_8;
    private final int cfr_renamed_3;
    private static final long a = l.a(-2070357713028601251L, -3395666086413025429L, MethodHandles.lookup().lookupClass()).a(18979843130533L);
    private static final Object[] b = new Object[10];
    private static final String[] c = new String[10];

    private _9d(_8o o, double d, double[] dArray, int n) {
        this.cfr_renamed_5 = o;
        this.cfr_renamed_0 = d;
        this.cfr_renamed_8 = dArray;
        this.cfr_renamed_3 = n;
    }

    static {
        _9d.a();
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{_9d.class, "1;8;5;2", "1", "8", "5", "2"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{_9d.class, "1;8;5;2", "1", "8", "5", "2"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{_9d.class, "1;8;5;2", "1", "8", "5", "2"}, this);
    }

    public _8o cfr_renamed_1() {
        long l2 = a ^ 0x749B73B55ADBL;
        return _9d.a("r", (Object)this, -2557191028846156278L, (long)l2);
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _9d.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _9d.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _9d.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _9d.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _9d.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _9d.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _9d.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _9d.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _9d.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _9d.a(clazz3, string2, clazz2)) != null) {
                    _9d.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _9d.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _9d.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _9d.b(378126567775679L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _9d.a(l2, l3);
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
                clazz3 = _9d.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _9d.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _9d.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _9d.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _9d.b(378126567775679L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _9d.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _9d.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _9d.b(378126567775679L, 0L);
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
            throw new RuntimeException("dev/krypton/9d" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'r' || c == 'p' || c == '\u00f4' || c == 'Q') {
                field = _9d.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'r' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'p' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f4' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _9d.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'i' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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
        MethodHandle methodHandle = _9d.a(lookup, mutableCallSite, string, methodType, l2, l3);
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
            case 0 -> 48;
            case 1 -> 37;
            case 2 -> 46;
            case 3 -> 1;
            case 4 -> 47;
            case 5 -> 28;
            case 6 -> 61;
            case 7 -> 13;
            case 8 -> 18;
            case 9 -> 41;
            case 10 -> 15;
            case 11 -> 58;
            case 12 -> 33;
            case 13 -> 16;
            case 14 -> 49;
            case 15 -> 25;
            case 16 -> 53;
            case 17 -> 59;
            case 18 -> 8;
            case 19 -> 56;
            case 20 -> 29;
            case 21 -> 44;
            case 22 -> 27;
            case 23 -> 26;
            case 24 -> 23;
            case 25 -> 0;
            case 26 -> 55;
            case 27 -> 24;
            case 28 -> 36;
            case 29 -> 4;
            case 30 -> 39;
            case 31 -> 2;
            case 32 -> 45;
            case 33 -> 60;
            case 34 -> 5;
            case 35 -> 63;
            case 36 -> 11;
            case 37 -> 9;
            case 38 -> 22;
            case 39 -> 35;
            case 40 -> 12;
            case 41 -> 43;
            case 42 -> 40;
            case 43 -> 32;
            case 44 -> 38;
            case 45 -> 54;
            case 46 -> 52;
            case 47 -> 51;
            case 48 -> 19;
            case 49 -> 30;
            case 50 -> 42;
            case 51 -> 50;
            case 52 -> 3;
            case 53 -> 7;
            case 54 -> 17;
            case 55 -> 14;
            case 56 -> 62;
            case 57 -> 57;
            case 58 -> 21;
            case 59 -> 10;
            case 60 -> 20;
            case 61 -> 31;
            case 62 -> 6;
            default -> 34;
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
        _9d.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "kXD\u0003R\nvMFBWV6Y";
        objectArray[1] = Integer.TYPE;
        _9d.c[1] = "java/lang/Integer";
        objectArray[2] = Double.TYPE;
        _9d.c[2] = "java/lang/Double";
        objectArray[3] = "QBw9l\u000bLWuxiW\rH";
        objectArray[4] = "R\u000b";
        objectArray[5] = ":*\u00047!\u007f1%\u0015x@q:.\u0011\"";
        objectArray[6] = "un\bS\u0014\u0004\"l^kT?w(T\nS\u0002.*\u0019\u0017";
        objectArray[7] = "l\u0015\f\u0018Eg;\u0017Z \u0002\\m\u0014\u0003_OahZ\u0001_";
        objectArray[8] = "dCp2J}3A&\n\tFe_vqH\u007f3M!c";
        Object[] objectArray2 = objectArray;
        objectArray[9] = "[\u001aXp5\u001d\f\u0018\u000eH\u007f&Y\u0019E(?T\n\u0004\u0004r";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public double[] cfr_renamed_8() {
        long l2 = a ^ 0x11B410511B5DL;
        return _9d.a("r", (Object)this, -7131829543678099376L, (long)l2);
    }

    public double cfr_renamed_9() {
        long l2 = a ^ 0x6125F738545EL;
        return (double)_9d.a("r", (Object)this, -3312834923647404106L, (long)l2);
    }

    public int cfr_renamed_0() {
        long l2 = a ^ 0x5CB0988F70BFL;
        return (int)_9d.a("r", (Object)this, -656192012829251690L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_9d.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

