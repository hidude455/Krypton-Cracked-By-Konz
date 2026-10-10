/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 */
package dev.krypton;

import dev.krypton._4p;
import dev.krypton._4w;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class _7M {
    public _4p cfr_renamed_0;
    public _7M cfr_renamed_3;
    public int cfr_renamed_8;
    public int cfr_renamed_9;
    public int cfr_renamed_7;
    private static final long a = l.a(-485696704597492950L, 5802860696258520892L, MethodHandles.lookup().lookupClass()).a(280317922662697L);
    private static final Object[] b = new Object[9];
    private static final String[] c = new String[9];

    public _7M(int n, _4p p, char c, int n2, _7M m, int n3, int n4) {
        long l2 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ a;
        _7M.a("T", (Object)this, (_4p)p, -8777396847998714266L, (long)l2);
        int n5 = _4p.cfr_renamed_2();
        _7M.a("T", (Object)this, (_7M)m, -8776558139297768033L, (long)l2);
        _7M.a("T", (Object)this, (int)n3, -8776494510865935698L, (long)l2);
        _7M.a("T", (Object)this, (int)n4, -8776394449482329686L, (long)l2);
        int n6 = n5;
        try {
            _7M.a("T", (Object)this, (int)(n3 + n4), -8776615477631290835L, (long)l2);
            if (n6 == 0) {
                _4w.cfr_renamed_8(new String[5]);
            }
        }
        catch (MatchException matchException) {
            throw _7M.a(matchException);
        }
    }

    static {
        _7M.a();
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
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
            case 0 -> 52;
            case 1 -> 10;
            case 2 -> 21;
            case 3 -> 35;
            case 4 -> 53;
            case 5 -> 6;
            case 6 -> 34;
            case 7 -> 3;
            case 8 -> 24;
            case 9 -> 9;
            case 10 -> 23;
            case 11 -> 16;
            case 12 -> 26;
            case 13 -> 36;
            case 14 -> 51;
            case 15 -> 22;
            case 16 -> 58;
            case 17 -> 25;
            case 18 -> 59;
            case 19 -> 17;
            case 20 -> 48;
            case 21 -> 61;
            case 22 -> 57;
            case 23 -> 11;
            case 24 -> 50;
            case 25 -> 55;
            case 26 -> 13;
            case 27 -> 41;
            case 28 -> 60;
            case 29 -> 14;
            case 30 -> 4;
            case 31 -> 19;
            case 32 -> 28;
            case 33 -> 7;
            case 34 -> 49;
            case 35 -> 63;
            case 36 -> 5;
            case 37 -> 2;
            case 38 -> 43;
            case 39 -> 1;
            case 40 -> 40;
            case 41 -> 54;
            case 42 -> 46;
            case 43 -> 8;
            case 44 -> 15;
            case 45 -> 39;
            case 46 -> 20;
            case 47 -> 12;
            case 48 -> 44;
            case 49 -> 37;
            case 50 -> 31;
            case 51 -> 29;
            case 52 -> 33;
            case 53 -> 47;
            case 54 -> 38;
            case 55 -> 32;
            case 56 -> 45;
            case 57 -> 56;
            case 58 -> 0;
            case 59 -> 27;
            case 60 -> 30;
            case 61 -> 42;
            case 62 -> 18;
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
        _7M.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = ")\u001e?X2|4\u000b=\u00197 z6";
        objectArray[1] = Integer.TYPE;
        _7M.c[1] = "java/lang/Integer";
        objectArray[2] = "Jpqp\u001b\u001fWes1\u001eC\u001ae";
        objectArray[3] = "&]U\u001ftC-RDP\u0015M&Y@\n";
        objectArray[4] = "J\u0002zCix\u000bX9?/\u001bJ\u0002zCix\u000bX9";
        objectArray[5] = "i\u0007'hE\u0003(]d\u0014\u0005`lR-m\b\u000f'R&p";
        objectArray[6] = "\u0018\u0010wgS{YJ4\u001b\u0010\u0018\u001dE}b\u001ewVEv\u007f";
        objectArray[7] = "\u001e';\u0002\u000b\u0019_}x~Jz\u001br1\u0007F\u0015Pr:\u001a";
        Object[] objectArray2 = objectArray;
        objectArray[8] = ":\u001an+IJ{@-W\u0005)?\u0011al\r\u0019d\u000b#>";
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _7M.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _7M.b[n] = clazz = Class.forName(c[n]);
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
        Field field = _7M.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _7M.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _7M.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _7M.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _7M.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _7M.a(clazz3, string2, clazz2)) != null) {
                    _7M.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _7M.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _7M.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _7M.b(241437982130261L, 0L);
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
        Method method = _7M.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _7M.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method d(long l2, long l3) {
        int n = _7M.a(l2, l3);
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
                clazz3 = _7M.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _7M.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _7M.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _7M.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _7M.b(241437982130261L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _7M.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _7M.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _7M.b(241437982130261L, 0L);
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
            if (c == 'o' || c == 'T' || c == '\u00ec' || c == '\u00c3') {
                field = _7M.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'o' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'T' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ec' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _7M.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ee' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00de' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _7M.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/7M" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_7M.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

