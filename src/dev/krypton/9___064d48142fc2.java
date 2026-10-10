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

public class _9_
extends Record {
    private final int cfr_renamed_3;
    private final String cfr_renamed_0;
    private final String cfr_renamed_2;
    private final int cfr_renamed_1;
    private final boolean cfr_renamed_8;
    private static final long a = l.a(-7596272017069062771L, -1590130343568781253L, MethodHandles.lookup().lookupClass()).a(199193383448405L);
    private static final Object[] b = new Object[10];
    private static final String[] c = new String[10];

    public _9_(int n, String string, String string2, int n2, boolean bl) {
        this.cfr_renamed_3 = n;
        this.cfr_renamed_0 = string;
        this.cfr_renamed_2 = string2;
        this.cfr_renamed_1 = n2;
        this.cfr_renamed_8 = bl;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{_9_.class, "2;8;6;9;5", "2", "8", "6", "9", "5"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{_9_.class, "2;8;6;9;5", "2", "8", "6", "9", "5"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{_9_.class, "2;8;6;9;5", "2", "8", "6", "9", "5"}, this, object);
    }

    public int int_4() {
        long l2 = a ^ 0x56AD7AA7DC26L;
        return (int)_9_.a("\u00da", (Object)this, -2089370513070262803L, (long)l2);
    }

    public String cfr_renamed_2() {
        long l2 = a ^ 0x428C5DD17255L;
        return _9_.a("\u00da", (Object)this, 5580283357996393533L, (long)l2);
    }

    public String cfr_renamed_4() {
        long l2 = a ^ 0x1DE9E92BBD9CL;
        return _9_.a("\u00da", (Object)this, -9026617254114785523L, (long)l2);
    }

    public int cfr_renamed_3() {
        long l2 = a ^ 0x4FD53FE75445L;
        return (int)_9_.a("\u00da", (Object)this, 7737724318995848580L, (long)l2);
    }

    public boolean boolean_4() {
        long l2 = a ^ 0x423C423D32B3L;
        return (boolean)_9_.a("\u00da", (Object)this, 979396726646550164L, (long)l2);
    }

    static {
        _9_.a();
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
            case 0 -> 10;
            case 1 -> 34;
            case 2 -> 42;
            case 3 -> 37;
            case 4 -> 61;
            case 5 -> 11;
            case 6 -> 35;
            case 7 -> 3;
            case 8 -> 46;
            case 9 -> 31;
            case 10 -> 28;
            case 11 -> 36;
            case 12 -> 4;
            case 13 -> 44;
            case 14 -> 27;
            case 15 -> 55;
            case 16 -> 6;
            case 17 -> 32;
            case 18 -> 41;
            case 19 -> 20;
            case 20 -> 16;
            case 21 -> 54;
            case 22 -> 0;
            case 23 -> 48;
            case 24 -> 8;
            case 25 -> 24;
            case 26 -> 2;
            case 27 -> 29;
            case 28 -> 59;
            case 29 -> 19;
            case 30 -> 40;
            case 31 -> 33;
            case 32 -> 56;
            case 33 -> 45;
            case 34 -> 17;
            case 35 -> 39;
            case 36 -> 5;
            case 37 -> 15;
            case 38 -> 50;
            case 39 -> 12;
            case 40 -> 38;
            case 41 -> 58;
            case 42 -> 43;
            case 43 -> 63;
            case 44 -> 25;
            case 45 -> 57;
            case 46 -> 13;
            case 47 -> 51;
            case 48 -> 22;
            case 49 -> 1;
            case 50 -> 30;
            case 51 -> 60;
            case 52 -> 26;
            case 53 -> 9;
            case 54 -> 7;
            case 55 -> 14;
            case 56 -> 52;
            case 57 -> 47;
            case 58 -> 21;
            case 59 -> 49;
            case 60 -> 23;
            case 61 -> 18;
            case 62 -> 53;
            default -> 62;
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
        _9_.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "!E%\u000eM#<P'OH\u007f|\u007f";
        objectArray[1] = Boolean.TYPE;
        _9_.c[1] = "java/lang/Boolean";
        objectArray[2] = "\u0003\"W,#U\b-Fc^M\u001b*O*";
        objectArray[3] = Integer.TYPE;
        _9_.c[3] = "java/lang/Integer";
        objectArray[4] = "U\u001dm\u0002X\u0004^\u0012|M9\nU\u0019x\u0017";
        objectArray[5] = "\u001a\u001ch\u0010\rD\bL1!\u0002=MS7\\_OD\u0010o\u001d";
        objectArray[6] = "?aQf\u0004[-1\bW\n\"k<\u0005m\\P(mQg";
        objectArray[7] = "'N*\u0018rp5\u001es)p\t5\u0005l\u0016 {0\u000e$";
        objectArray[8] = "(Si@?@:\u00030q>9\u007f\u001c6\fmKv_nM";
        Object[] objectArray2 = objectArray;
        objectArray[9] = "@?\"O:?Ro{~?F\u0014bvDb4W3\"N";
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _9_.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _9_.b[n] = clazz = Class.forName(c[n]);
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
        Field field = _9_.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _9_.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _9_.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _9_.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _9_.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _9_.a(clazz3, string2, clazz2)) != null) {
                    _9_.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _9_.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _9_.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _9_.b(328588737890564L, 0L);
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
        Method method = _9_.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _9_.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method d(long l2, long l3) {
        int n = _9_.a(l2, l3);
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
                clazz3 = _9_.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _9_.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _9_.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _9_.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _9_.b(328588737890564L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _9_.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _9_.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _9_.b(328588737890564L, 0L);
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
            if (c == '\u00da' || c == '\u00df' || c == '\u00e2' || c == 'N') {
                field = _9_.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00da' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00df' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _9_.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'c' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ff' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _9_.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/9_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_9_.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

