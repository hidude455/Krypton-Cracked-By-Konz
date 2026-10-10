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

public class _4f
extends Record {
    private final int cfr_renamed_2;
    private final int cfr_renamed_8;
    private final int cfr_renamed_0;
    private final int cfr_renamed_9;
    private final int cfr_renamed_1;
    private final int cfr_renamed_3;
    private static final long a = l.a(-8541129981936669056L, -6637971501093314854L, MethodHandles.lookup().lookupClass()).a(202196874011809L);
    private static final Object[] b = new Object[9];
    private static final String[] c = new String[9];

    private _4f(int n, int n2, int n3, int n4, int n5, int n6) {
        this.cfr_renamed_2 = n;
        this.cfr_renamed_8 = n2;
        this.cfr_renamed_0 = n3;
        this.cfr_renamed_9 = n4;
        this.cfr_renamed_1 = n5;
        this.cfr_renamed_3 = n6;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{_4f.class, "6;5;8;7;9;2", "6", "5", "8", "7", "9", "2"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{_4f.class, "6;5;8;7;9;2", "6", "5", "8", "7", "9", "2"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{_4f.class, "6;5;8;7;9;2", "6", "5", "8", "7", "9", "2"}, this, object);
    }

    public int cfr_renamed_5() {
        long l2 = a ^ 0xCE67EB0739FL;
        return (int)_4f.a("\u00ef", (Object)this, -849504476097733255L, (long)l2);
    }

    public int cfr_renamed_6() {
        long l2 = a ^ 0x75C3C6CCE3BCL;
        return (int)_4f.a("\u00ef", (Object)this, 7212072420844052152L, (long)l2);
    }

    public int cfr_renamed_0() {
        long l2 = a ^ 0x6E61A2D73109L;
        return (int)_4f.a("\u00ef", (Object)this, -5286315551123399130L, (long)l2);
    }

    public int cfr_renamed_4() {
        long l2 = a ^ 0x8D036DB8EBDL;
        return (int)_4f.a("\u00ef", (Object)this, 654176707302622885L, (long)l2);
    }

    public int cfr_renamed_2() {
        long l2 = a ^ 0xA426E56014BL;
        return (int)_4f.a("\u00ef", (Object)this, -8727727829827043735L, (long)l2);
    }

    public int cfr_renamed_1() {
        long l2 = a ^ 0x750FE7F5D8EEL;
        return (int)_4f.a("\u00ef", (Object)this, 6864857602070141114L, (long)l2);
    }

    static {
        _4f.a();
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
            case 0 -> 8;
            case 1 -> 2;
            case 2 -> 46;
            case 3 -> 5;
            case 4 -> 45;
            case 5 -> 31;
            case 6 -> 37;
            case 7 -> 40;
            case 8 -> 20;
            case 9 -> 15;
            case 10 -> 13;
            case 11 -> 39;
            case 12 -> 55;
            case 13 -> 10;
            case 14 -> 33;
            case 15 -> 9;
            case 16 -> 12;
            case 17 -> 59;
            case 18 -> 16;
            case 19 -> 52;
            case 20 -> 34;
            case 21 -> 29;
            case 22 -> 26;
            case 23 -> 30;
            case 24 -> 48;
            case 25 -> 23;
            case 26 -> 61;
            case 27 -> 1;
            case 28 -> 63;
            case 29 -> 49;
            case 30 -> 25;
            case 31 -> 36;
            case 32 -> 51;
            case 33 -> 60;
            case 34 -> 6;
            case 35 -> 43;
            case 36 -> 44;
            case 37 -> 18;
            case 38 -> 57;
            case 39 -> 47;
            case 40 -> 41;
            case 41 -> 54;
            case 42 -> 56;
            case 43 -> 17;
            case 44 -> 22;
            case 45 -> 62;
            case 46 -> 24;
            case 47 -> 0;
            case 48 -> 35;
            case 49 -> 19;
            case 50 -> 58;
            case 51 -> 3;
            case 52 -> 21;
            case 53 -> 4;
            case 54 -> 50;
            case 55 -> 7;
            case 56 -> 27;
            case 57 -> 32;
            case 58 -> 14;
            case 59 -> 28;
            case 60 -> 11;
            case 61 -> 38;
            case 62 -> 53;
            default -> 42;
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
        _4f.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = ",\u000f#{=u1\u001a!:8)|\f";
        objectArray[1] = Integer.TYPE;
        _4f.c[1] = "java/lang/Integer";
        objectArray[2] = "\u0007u;,4\b\fz*cU\u0006\u0007q.9";
        objectArray[3] = "Y\u0014_l\u0016\u000b\u0015B\u001dS_vQ\u0014_!\u001e\u0010PKY2";
        objectArray[4] = "6\u0015~\u000e\u001dRzC<1X/>\u0015~C\u0015I?JxP";
        objectArray[5] = "~\fE\u00171\u00012Z\u0007(y|v\fEZ9\u001awSCI";
        objectArray[6] = "\nm{O\t\u001cF;9pKa\u0002m{\u0002\u0001\u0007\u00032}\u0011";
        objectArray[7] = "^~pwGG\u0012(2H\u0001:V~p:O\\W!v)";
        Object[] objectArray2 = objectArray;
        objectArray[8] = "!T\u001a/\u0001pm\u0002X\u0010F\r)T\u001ab\tk(\u000b\u001cq";
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _4f.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _4f.b[n] = clazz = Class.forName(c[n]);
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
        Field field = _4f.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _4f.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _4f.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _4f.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _4f.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _4f.a(clazz3, string2, clazz2)) != null) {
                    _4f.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _4f.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _4f.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _4f.b(172504133870739L, 0L);
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
        Method method = _4f.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _4f.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method d(long l2, long l3) {
        int n = _4f.a(l2, l3);
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
                clazz3 = _4f.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _4f.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _4f.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _4f.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _4f.b(172504133870739L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _4f.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _4f.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _4f.b(172504133870739L, 0L);
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
            if (c == '\u00ef' || c == '\u00d8' || c == '\u00e5' || c == '\u00fe') {
                field = _4f.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ef' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d8' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _4f.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c0' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e6' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _4f.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/4f" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_4f.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

