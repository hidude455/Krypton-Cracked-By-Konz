/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonPrimitive
 *  java.lang.MatchException
 */
package dev.krypton;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import dev.krypton._8j;
import dev.krypton._95;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * Renamed from dev.krypton.9j
 */
public class _9j_0
extends _95 {
    private final boolean cfr_renamed_4;
    private final int cfr_renamed_9;
    private int cfr_renamed_3;
    private boolean cfr_renamed_1;
    private static final long a = l.a(816516773680036949L, -3127641861156885728L, MethodHandles.lookup().lookupClass()).a(227808523966992L);
    private static final Object[] c = new Object[19];
    private static final String[] d = new String[19];

    public int int_1(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (int)_9j_0.a("\u00e6", (Object)this, 6090319397052053286L, (long)l2);
    }

    public _9j_0(int n, int n2, byte by, int n3, int n4, boolean bl) {
        long l2 = ((long)n2 << 32 | (long)by << 56 >>> 32 | (long)n4 << 40 >>> 40) ^ a;
        long l3 = l2 ^ 0x56850DA02599L;
        int n5 = (int)(l3 >>> 48);
        int n6 = (int)(l3 << 16 >>> 32);
        int n7 = (int)(l3 << 48 >>> 48);
        super((short)n5, n, n6, n7);
        _9j_0.a("j", (Object)this, (int)n3, 7415566400816560655L, (long)l2);
        this.cfr_renamed_9 = n3;
        this.cfr_renamed_4 = bl;
    }

    static {
        _9j_0.b();
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (d[n3] != null) {
            return n3;
        }
        Object object = c[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 40;
            case 1 -> 33;
            case 2 -> 17;
            case 3 -> 55;
            case 4 -> 16;
            case 5 -> 59;
            case 6 -> 53;
            case 7 -> 0;
            case 8 -> 9;
            case 9 -> 27;
            case 10 -> 44;
            case 11 -> 14;
            case 12 -> 58;
            case 13 -> 56;
            case 14 -> 49;
            case 15 -> 15;
            case 16 -> 62;
            case 17 -> 24;
            case 18 -> 18;
            case 19 -> 63;
            case 20 -> 28;
            case 21 -> 46;
            case 22 -> 31;
            case 23 -> 1;
            case 24 -> 48;
            case 25 -> 34;
            case 26 -> 10;
            case 27 -> 23;
            case 28 -> 8;
            case 29 -> 35;
            case 30 -> 21;
            case 31 -> 57;
            case 32 -> 54;
            case 33 -> 39;
            case 34 -> 32;
            case 35 -> 11;
            case 36 -> 5;
            case 37 -> 60;
            case 38 -> 22;
            case 39 -> 43;
            case 40 -> 50;
            case 41 -> 61;
            case 42 -> 42;
            case 43 -> 4;
            case 44 -> 38;
            case 45 -> 52;
            case 46 -> 29;
            case 47 -> 7;
            case 48 -> 36;
            case 49 -> 41;
            case 50 -> 12;
            case 51 -> 47;
            case 52 -> 30;
            case 53 -> 45;
            case 54 -> 3;
            case 55 -> 25;
            case 56 -> 6;
            case 57 -> 20;
            case 58 -> 26;
            case 59 -> 2;
            case 60 -> 13;
            case 61 -> 19;
            case 62 -> 51;
            default -> 37;
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
        _9j_0.d[n3] = new String(cArray);
        return n3;
    }

    public void void_9(Object[] objectArray) {
        Object object;
        _9j_0 j_0;
        long l2;
        block2: {
            block3: {
                l2 = (Long)objectArray[0];
                l2 = a ^ l2;
                String string = _8j.cfr_renamed_3();
                try {
                    j_0 = this;
                    object = _9j_0.a("\u00e6", (Object)this, -7724927494761151845L, (long)l2);
                    if (string != null) break block2;
                    if (object != false) break block3;
                }
                catch (MatchException matchException) {
                    throw _9j_0.a(matchException);
                }
                object = true;
                break block2;
            }
            object = false;
        }
        _9j_0.a("j", (Object)j_0, (boolean)object, -7724927494761151845L, (long)l2);
    }

    public boolean boolean_9(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (boolean)_9j_0.a("\u00e6", (Object)this, 7101813611459119868L, (long)l2);
    }

    private static void b() {
        Object[] objectArray = c;
        c[0] = "V\u0003I\u007fd]K\u0016K>a\u0001\u000b\f";
        objectArray[1] = Boolean.TYPE;
        _9j_0.d[1] = "java/lang/Boolean";
        objectArray[2] = Integer.TYPE;
        _9j_0.d[2] = "java/lang/Integer";
        objectArray[3] = ">X:QD%5W+\u001e#' \\+U\u0018";
        objectArray[4] = "4\b&\u0004;\u0019A(-\u000b*V &&\u0000.\fT";
        objectArray[5] = Void.TYPE;
        _9j_0.d[5] = "java/lang/Void";
        objectArray[6] = "\u00139%9\t&\u001f1$r@.\u00039&9$:\u001f8\r{\u000b$\u00158<";
        objectArray[7] = "l(\u0010T+vq=\u0012\u0015.*1x";
        objectArray[8] = "\u0004B+:\u000b\u000fqb 5\u001a@\u0010l+>\u001e\u001ad";
        objectArray[9] = "(8Z%\u0011\t#7Kjp\u0007(<O0";
        objectArray[10] = "Iu\rF%|Km\u0005]^{\u001av\u001b[\u0019ks+\u0007F?t\u0003/\u0002\\2\u0005Iu\rF%|Km\u0005]^";
        objectArray[11] = "4^q\u0002}xi\u000fv:3\u0006m]hC0`0\u001b:@\r=7\u0006o\u000b3;bP1:";
        objectArray[12] = "w\u0014\u001a~vhtA\u001bj\u000fk&W2jNb7+Bp\u007fe:[FuehK";
        objectArray[13] = "\u000eCZfLU\r\u0016[r5XI>@nSaH\u001d^hIXL\u0011;0\u0005H\r\u0017KsW\u0007S|";
        objectArray[14] = "$\u0001\b2\bayP\u000f\nI\u001fz\u000f\u00035\u0013o9]Lk";
        objectArray[15] = "c\u0011Hh\u001b[<B\u0017y{[^AJh\u0002]8\u001c\f:\u0001`e\u001b\u0011oJ^cNG1{";
        objectArray[16] = "\u0001T\u00112u\u001b\\\u0005\u0016\n:e_\u000b\u001bkt\u0015[\u000e\u0001f";
        objectArray[17] = "X\u0006\u00187o6\u0005W\u001f\u000f%H\u0006Y\u0012nn8\u0002\\\bc";
        Object[] objectArray2 = objectArray;
        objectArray[18] = "\u0019&j\u0013B\u0016Dwm+\nhG(a\u0014Y\u0018\u0004z.J";
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _9j_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e6' || c == 'j' || c == 'a' || c == '\u00f6') {
                field = _9j_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e6' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'j' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'a' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _9j_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c0' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'y' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method h(long l2, long l3) {
        int n = _9j_0.e(l2, l3);
        Object object = c[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = d[n];
                int n3 = string2.indexOf(8);
                clazz3 = _9j_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _9j_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _9j_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _9j_0.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _9j_0.f(684785432718204L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _9j_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _9j_0.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _9j_0.f(684785432718204L, 0L);
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

    private static Class f(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _9j_0.e(l2, l3);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                _9j_0.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _9j_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _9j_0.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _9j_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _9j_0.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/9j" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field g(long l2, long l3) {
        int n = _9j_0.e(l2, l3);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = _9j_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _9j_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _9j_0.c(clazz3, string2, clazz2)) != null) {
                    _9j_0.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _9j_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _9j_0.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _9j_0.f(684785432718204L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void void_0(Object[] objectArray) {
        boolean bl = (Boolean)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = a ^ l2;
        _9j_0.a("j", (Object)this, (boolean)bl, -1832699154739007296L, (long)l2);
    }

    public boolean boolean_6(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (boolean)_9j_0.a("\u00e6", (Object)this, 6684176433299180178L, (long)l2);
    }

    public void void_6(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = (l2 = a ^ l2) ^ 0x38D819BF3E8AL;
        _9j_0.a("j", (Object)this, (int)n, 3381936790570430985L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _9j_0.a("\u00c0", (Object)this, (Object)objectArray2, 3380161805610401534L, (long)l2);
    }

    public int int_6(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (int)_9j_0.a("\u00e6", (Object)this, -7754342080722777979L, (long)l2);
    }

    @Override
    public boolean boolean_5(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l2 = (Long)objectArray[0];
                String string = _8j.cfr_renamed_3();
                try {
                    try {
                        object = _9j_0.a("\u00e6", (Object)this, 6338017565920594707L, (long)l2);
                        if (string != null) break block4;
                        if (object != _9j_0.a("\u00e6", (Object)this, 6338111592987063382L, (long)l2)) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _9j_0.a(matchException);
                    }
                    object = true;
                    break block4;
                }
                catch (MatchException matchException) {
                    throw _9j_0.a(matchException);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    @Override
    public void void_7(Object[] objectArray) {
        JsonElement jsonElement = (JsonElement)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = l2 ^ 0x7209191675D2L;
        try {
            if (_9j_0.a("\u00c0", (Object)jsonElement, -1467793165734034716L, (long)l2) != false) {
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l3;
                objectArray2[0] = (int)_9j_0.a("\u00c0", (Object)jsonElement, -1467869732716891034L, (long)l2);
                _9j_0.a("\u00c0", (Object)this, (Object)objectArray2, -1467961745216180682L, (long)l2);
            }
        }
        catch (MatchException matchException) {
            throw _9j_0.a(matchException);
        }
    }

    @Override
    public JsonElement com_google_gson_JsonElement_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return new JsonPrimitive((Number)((Object)_9j_0.a("y", (int)_9j_0.a("\u00e6", (Object)this, -4043308371784590587L, (long)l2), -4042682972146472202L, (long)l2)));
    }

    @Override
    public void void_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 ^ 0x6AFBCA7BA61L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = (int)_9j_0.a("\u00e6", (Object)this, 2600097040620193718L, (long)l2);
        _9j_0.a("\u00c0", (Object)this, (Object)objectArray2, 2599619548126060933L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_9j_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

