/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.krypton.4F
 *  java.lang.MatchException
 *  net.minecraft.class_2248
 */
package dev.krypton;

import dev.krypton._4F;
import dev.krypton._8B;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.class_2248;

/*
 * Renamed from dev.krypton.6z
 */
public class _6z_0
extends Record {
    private final String cfr_renamed_1;
    private final _8B cfr_renamed_5;
    private final class_2248 cfr_renamed_6;
    private static final long a = l.a(5982138739634285719L, -6719459489910013661L, MethodHandles.lookup().lookupClass()).a(95098330198896L);
    private static final Object[] b = new Object[12];
    private static final String[] c = new String[12];

    public _6z_0(String string, _8B b, class_2248 class_22482) {
        this.cfr_renamed_1 = string;
        this.cfr_renamed_5 = b;
        this.cfr_renamed_6 = class_22482;
    }

    @Override
    public String toString() {
        long l2 = a ^ 0x182158B9D374L;
        return _6z_0.a("H", (Object)this, 1243055329418143494L, (long)l2);
    }

    @Override
    public boolean equals(Object object) {
        Object object2;
        block4: {
            long l2;
            block5: {
                l2 = a ^ 0x75DDAA23FA21L;
                int[] nArray = _4F.cfr_renamed_8();
                try {
                    try {
                        object2 = object instanceof _6z_0;
                        if (nArray != null) break block4;
                        if (object2) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _6z_0.a(matchException);
                    }
                    return false;
                }
                catch (MatchException matchException) {
                    throw _6z_0.a(matchException);
                }
            }
            object2 = _6z_0.a("\u00f3", (Object)_6z_0.a("H", (Object)((_6z_0)object), 4041230525913222739L, (long)l2), (Object)_6z_0.a("H", (Object)this, 4041230525913222739L, (long)l2), 4041289590961118662L, (long)l2);
        }
        return object2;
    }

    @Override
    public int hashCode() {
        long l2 = a ^ 0x6571CBE439D7L;
        return (int)_6z_0.a("\u00f3", (Object)_6z_0.a("H", (Object)this, -296316816538333787L, (long)l2), -296134064780854703L, (long)l2);
    }

    public String cfr_renamed_6() {
        long l2 = a ^ 0x54928C270F8CL;
        return _6z_0.a("H", (Object)this, -3623017739896931330L, (long)l2);
    }

    public _8B cfr_renamed_2() {
        long l2 = a ^ 0x2F964997D341L;
        return _6z_0.a("H", (Object)this, 1258048357298229393L, (long)l2);
    }

    public class_2248 cfr_renamed_0() {
        long l2 = a ^ 0x11FA5C2B3787L;
        return _6z_0.a("H", (Object)this, -742831215140592567L, (long)l2);
    }

    static {
        _6z_0.a();
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
            case 0 -> 54;
            case 1 -> 16;
            case 2 -> 8;
            case 3 -> 0;
            case 4 -> 19;
            case 5 -> 62;
            case 6 -> 33;
            case 7 -> 46;
            case 8 -> 39;
            case 9 -> 22;
            case 10 -> 57;
            case 11 -> 43;
            case 12 -> 59;
            case 13 -> 35;
            case 14 -> 44;
            case 15 -> 52;
            case 16 -> 41;
            case 17 -> 50;
            case 18 -> 34;
            case 19 -> 4;
            case 20 -> 18;
            case 21 -> 5;
            case 22 -> 42;
            case 23 -> 28;
            case 24 -> 1;
            case 25 -> 63;
            case 26 -> 37;
            case 27 -> 9;
            case 28 -> 24;
            case 29 -> 32;
            case 30 -> 53;
            case 31 -> 40;
            case 32 -> 45;
            case 33 -> 2;
            case 34 -> 21;
            case 35 -> 27;
            case 36 -> 11;
            case 37 -> 13;
            case 38 -> 29;
            case 39 -> 55;
            case 40 -> 36;
            case 41 -> 17;
            case 42 -> 10;
            case 43 -> 6;
            case 44 -> 56;
            case 45 -> 3;
            case 46 -> 26;
            case 47 -> 31;
            case 48 -> 25;
            case 49 -> 48;
            case 50 -> 14;
            case 51 -> 47;
            case 52 -> 20;
            case 53 -> 58;
            case 54 -> 51;
            case 55 -> 60;
            case 56 -> 15;
            case 57 -> 49;
            case 58 -> 23;
            case 59 -> 38;
            case 60 -> 61;
            case 61 -> 7;
            case 62 -> 30;
            default -> 12;
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
        _6z_0.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "\u001d\u0003n9S\b\u0000\u0016lxVTO\u001c";
        objectArray[1] = "\u0010\u0016Y\u001c*\u0000\u001b\u0019HSW\u0018\b\u001eA\u001a";
        objectArray[2] = "YT\u0003-\tRR[\u0012bh\\YP\u00168";
        objectArray[3] = Boolean.TYPE;
        _6z_0.c[3] = "java/lang/Boolean";
        objectArray[4] = " \u001e!\u000eY\u001d \u001e6RU\u0012:U6LU\u0007=$g\u0012\u0000L";
        objectArray[5] = Integer.TYPE;
        _6z_0.c[5] = "java/lang/Integer";
        objectArray[6] = "F]:m\u0013H[H8,\u0016\u0014\u001az";
        objectArray[7] = "\u001c)\b;\u0006N\u000bq\u0002[T4H,Y6T\u0004\u0016g\u0007'";
        objectArray[8] = "x`EAW|o8O!\u000f\u0006f&\u0010PDhk'N";
        objectArray[9] = "q(B\u0001\n<fpHaZF\"lC\\X?dpL\u0006";
        objectArray[10] = "\u007f\u001ddH\u000fLr\u001c:9\u0015Ku\u0004K^\u0019O\u000e_z\t\u0017Aa\u00181Y\t\"";
        Object[] objectArray2 = objectArray;
        objectArray[11] = "?\"#\u0017}s2#}fjd32#\u001d\u0007$!`'\u001a{v-<8f=~v5 Y;x(:G";
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _6z_0.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _6z_0.b[n] = clazz = Class.forName(c[n]);
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
        Field field = _6z_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _6z_0.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _6z_0.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _6z_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _6z_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _6z_0.a(clazz3, string2, clazz2)) != null) {
                    _6z_0.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _6z_0.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _6z_0.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _6z_0.b(146971615794368L, 0L);
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
        Method method = _6z_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _6z_0.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method d(long l2, long l3) {
        int n = _6z_0.a(l2, l3);
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
                clazz3 = _6z_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _6z_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _6z_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _6z_0.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _6z_0.b(146971615794368L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _6z_0.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _6z_0.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _6z_0.b(146971615794368L, 0L);
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
            if (c == 'H' || c == 'j' || c == '\u00c3' || c == '\u00d4') {
                field = _6z_0.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'H' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'j' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _6z_0.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d8' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _6z_0.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6z" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_6z_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

