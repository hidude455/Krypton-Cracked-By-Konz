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

public class _8r
extends Record {
    private final int cfr_renamed_4;
    private final String cfr_renamed_1;
    private final long cfr_renamed_8;
    private static final long a = l.a(5914415887461442011L, -5941944064268968949L, MethodHandles.lookup().lookupClass()).a(33698374351443L);
    private static final Object[] b = new Object[8];
    private static final String[] c = new String[8];

    public _8r(int n, String string, long l2) {
        this.cfr_renamed_4 = n;
        this.cfr_renamed_1 = string;
        this.cfr_renamed_8 = l2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{_8r.class, "0;9;5", "0", "9", "5"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{_8r.class, "0;9;5", "0", "9", "5"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{_8r.class, "0;9;5", "0", "9", "5"}, this, object);
    }

    public int cfr_renamed_7() {
        long l2 = a ^ 0x63F65109618L;
        return (int)_8r.a("\u00e5", (Object)this, -3179924894669944785L, (long)l2);
    }

    public String cfr_renamed_6() {
        long l2 = a ^ 0x7B9CDE9FF6E7L;
        return _8r.a("\u00e5", (Object)this, -5539082350108912229L, (long)l2);
    }

    public long cfr_renamed_0() {
        long l2 = a ^ 0x665EAAD37087L;
        return (long)_8r.a("\u00e5", (Object)this, 3837514697546448255L, (long)l2);
    }

    static {
        _8r.a();
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
            case 0 -> 51;
            case 1 -> 26;
            case 2 -> 46;
            case 3 -> 62;
            case 4 -> 4;
            case 5 -> 1;
            case 6 -> 12;
            case 7 -> 43;
            case 8 -> 21;
            case 9 -> 22;
            case 10 -> 49;
            case 11 -> 55;
            case 12 -> 33;
            case 13 -> 6;
            case 14 -> 50;
            case 15 -> 24;
            case 16 -> 61;
            case 17 -> 16;
            case 18 -> 27;
            case 19 -> 39;
            case 20 -> 53;
            case 21 -> 29;
            case 22 -> 23;
            case 23 -> 13;
            case 24 -> 47;
            case 25 -> 19;
            case 26 -> 8;
            case 27 -> 28;
            case 28 -> 38;
            case 29 -> 9;
            case 30 -> 35;
            case 31 -> 7;
            case 32 -> 42;
            case 33 -> 54;
            case 34 -> 57;
            case 35 -> 10;
            case 36 -> 48;
            case 37 -> 14;
            case 38 -> 37;
            case 39 -> 32;
            case 40 -> 5;
            case 41 -> 20;
            case 42 -> 45;
            case 43 -> 41;
            case 44 -> 52;
            case 45 -> 31;
            case 46 -> 58;
            case 47 -> 2;
            case 48 -> 17;
            case 49 -> 60;
            case 50 -> 56;
            case 51 -> 15;
            case 52 -> 18;
            case 53 -> 11;
            case 54 -> 30;
            case 55 -> 59;
            case 56 -> 40;
            case 57 -> 0;
            case 58 -> 3;
            case 59 -> 34;
            case 60 -> 25;
            case 61 -> 63;
            case 62 -> 44;
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
        _8r.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "5gFn#/(rD/&sip";
        objectArray[1] = Long.TYPE;
        _8r.c[1] = "java/lang/Long";
        objectArray[2] = "I6s^~\rB9b\u0011\u0003\u0015Q>kX";
        objectArray[3] = Integer.TYPE;
        _8r.c[3] = "java/lang/Integer";
        objectArray[4] = "r?\u001eJJ\u000ey0\u000f\u0005+\u0000r;\u000b_";
        objectArray[5] = "T\\\u000b*\u007f~DL\u001aP'\u0004\u0003Q\\-q\u007fKD\u00070";
        objectArray[6] = ">N\u0014T`H.^\u0005.12jGE\u0012vS`[\u001bG";
        Object[] objectArray2 = objectArray;
        objectArray[7] = "\u001a6tj\u001f_\n&e\u0010K%\n9}a\u001cX\u00129d";
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _8r.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _8r.b[n] = clazz = Class.forName(c[n]);
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
        Field field = _8r.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _8r.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _8r.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _8r.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _8r.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _8r.a(clazz3, string2, clazz2)) != null) {
                    _8r.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _8r.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _8r.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _8r.b(332573611429273L, 0L);
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
        Method method = _8r.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _8r.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method d(long l2, long l3) {
        int n = _8r.a(l2, l3);
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
                clazz3 = _8r.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _8r.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _8r.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _8r.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _8r.b(332573611429273L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _8r.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _8r.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _8r.b(332573611429273L, 0L);
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
            if (c == '\u00e5' || c == '\u00ff' || c == 'M' || c == '\u00c9') {
                field = _8r.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e5' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ff' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'M' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _8r.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f6' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ca' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _8r.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8r" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_8r.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

