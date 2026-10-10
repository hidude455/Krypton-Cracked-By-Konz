/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_11280$class_11281
 *  org.joml.Matrix4f
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
import java.nio.ByteBuffer;
import net.minecraft.class_11280;
import org.joml.Matrix4f;

public class _8I
implements class_11280.class_11281 {
    private Matrix4f cfr_renamed_4;
    private Matrix4f cfr_renamed_8;
    private static final long a = l.a(8972125991350577234L, 2560794332806839991L, MethodHandles.lookup().lookupClass()).a(247813873447711L);
    private static final Object[] b = new Object[10];
    private static final String[] c = new String[10];

    public void method_71104(ByteBuffer byteBuffer) {
        long l2 = a ^ 0x1BBA9777F4B0L;
        _8I.a("\u00f0", (Object)_8I.a("\u00f0", (Object)_8I.a("\u00c0", (Object)byteBuffer, -7517066328915302091L, (long)l2), (Object)_8I.a("H", (Object)this, -7516980197145537090L, (long)l2), -7517157607447715379L, (long)l2), (Object)_8I.a("H", (Object)this, -7517131815018908776L, (long)l2), -7517157607447715379L, (long)l2);
    }

    private _8I() {
    }

    static {
        _8I.a();
    }

    public boolean equals(Object object) {
        return false;
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _8I.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _8I.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _8I.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _8I.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _8I.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _8I.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _8I.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _8I.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _8I.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _8I.a(clazz3, string2, clazz2)) != null) {
                    _8I.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _8I.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _8I.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _8I.b(372944350499799L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _8I.a(l2, l3);
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
                clazz3 = _8I.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _8I.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _8I.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _8I.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _8I.b(372944350499799L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _8I.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _8I.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _8I.b(372944350499799L, 0L);
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _8I.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'H' || c == 'U' || c == '\u00f4' || c == 'A') {
                field = _8I.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'H' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'U' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f4' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _8I.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f0' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c0' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8I" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
        b[0] = ",3f}\u001bj1&d<\u001e6p\u001f";
        objectArray[1] = "h<muuvj\"$\u0016~mu'roy";
        objectArray[2] = "dK\u00015\u000e;mE\u0002|M6kE\u0016~P0)F\u0019}\u00051uWBH\u001706\u0010\\Y\u0016=k@\ti";
        objectArray[3] = "|&\\dYL\u007f(\u0004G\u000eVs\u0005_c\u0011Gd";
        objectArray[4] = "O\u0007 6\u001cLM\u0019iU\u0017WR\u001c?,\u0010@";
        objectArray[5] = "+\t!\u001d,^ \u00060RMP+\r4\b";
        objectArray[6] = "3U#?,mdN>\u0001 \t!T)8 0a\u0007l";
        objectArray[7] = "jL,YEA4Lw\u0014;X.WSLG\u001c=+,TAE5B-NK\\S\u0012q\u001fG^2LqD\n ";
        objectArray[8] = "T\u0012AvAj\u0003\t\\HH\u000eF\u0013KqM7\u0006@\u000e";
        Object[] objectArray2 = objectArray;
        objectArray[9] = "WQ\u001c5.\u001d\tQGxP\u001d\bJA\u0003-\u0012\u0000[\\Ij\u0011\u0005\u000bB(3\u001a_\u0006&p7F\u0012HG.7\u001d_6";
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
            case 1 -> 12;
            case 2 -> 1;
            case 3 -> 20;
            case 4 -> 30;
            case 5 -> 62;
            case 6 -> 28;
            case 7 -> 58;
            case 8 -> 5;
            case 9 -> 43;
            case 10 -> 6;
            case 11 -> 42;
            case 12 -> 18;
            case 13 -> 29;
            case 14 -> 56;
            case 15 -> 39;
            case 16 -> 17;
            case 17 -> 16;
            case 18 -> 32;
            case 19 -> 53;
            case 20 -> 37;
            case 21 -> 24;
            case 22 -> 14;
            case 23 -> 40;
            case 24 -> 34;
            case 25 -> 15;
            case 26 -> 35;
            case 27 -> 49;
            case 28 -> 63;
            case 29 -> 38;
            case 30 -> 3;
            case 31 -> 4;
            case 32 -> 54;
            case 33 -> 46;
            case 34 -> 44;
            case 35 -> 60;
            case 36 -> 52;
            case 37 -> 55;
            case 38 -> 61;
            case 39 -> 51;
            case 40 -> 25;
            case 41 -> 9;
            case 42 -> 21;
            case 43 -> 22;
            case 44 -> 47;
            case 45 -> 36;
            case 46 -> 33;
            case 47 -> 23;
            case 48 -> 50;
            case 49 -> 11;
            case 50 -> 8;
            case 51 -> 45;
            case 52 -> 41;
            case 53 -> 0;
            case 54 -> 27;
            case 55 -> 26;
            case 56 -> 10;
            case 57 -> 57;
            case 58 -> 31;
            case 59 -> 7;
            case 60 -> 13;
            case 61 -> 59;
            case 62 -> 19;
            default -> 2;
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
        _8I.c[n3] = new String(cArray);
        return n3;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_8I.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

