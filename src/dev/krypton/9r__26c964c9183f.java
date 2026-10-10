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

public class _9r
extends _95 {
    private final boolean cfr_renamed_9;
    private boolean cfr_renamed_6;
    private static final long a = l.a(-2435208894610396726L, -6082147359476080222L, MethodHandles.lookup().lookupClass()).a(228337099852467L);
    private static final Object[] c = new Object[16];
    private static final String[] d = new String[16];

    public _9r(int n, boolean bl, long l2) {
        long l3 = (l2 = a ^ l2) ^ 0x32203895C873L;
        int n2 = (int)(l3 >>> 48);
        int n3 = (int)(l3 << 16 >>> 32);
        int n4 = (int)(l3 << 48 >>> 48);
        super((short)n2, n, n3, n4);
        _9r.a("\u00e2", (Object)this, (boolean)bl, -8429302967629223980L, (long)l2);
        this.cfr_renamed_9 = bl;
    }

    static {
        _9r.b();
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
            case 0 -> 49;
            case 1 -> 52;
            case 2 -> 19;
            case 3 -> 25;
            case 4 -> 62;
            case 5 -> 51;
            case 6 -> 45;
            case 7 -> 27;
            case 8 -> 20;
            case 9 -> 11;
            case 10 -> 9;
            case 11 -> 47;
            case 12 -> 40;
            case 13 -> 46;
            case 14 -> 33;
            case 15 -> 17;
            case 16 -> 26;
            case 17 -> 4;
            case 18 -> 2;
            case 19 -> 34;
            case 20 -> 14;
            case 21 -> 29;
            case 22 -> 54;
            case 23 -> 3;
            case 24 -> 55;
            case 25 -> 5;
            case 26 -> 28;
            case 27 -> 44;
            case 28 -> 15;
            case 29 -> 37;
            case 30 -> 22;
            case 31 -> 56;
            case 32 -> 48;
            case 33 -> 57;
            case 34 -> 16;
            case 35 -> 31;
            case 36 -> 43;
            case 37 -> 12;
            case 38 -> 61;
            case 39 -> 53;
            case 40 -> 38;
            case 41 -> 39;
            case 42 -> 60;
            case 43 -> 10;
            case 44 -> 0;
            case 45 -> 58;
            case 46 -> 23;
            case 47 -> 36;
            case 48 -> 13;
            case 49 -> 63;
            case 50 -> 50;
            case 51 -> 24;
            case 52 -> 7;
            case 53 -> 18;
            case 54 -> 41;
            case 55 -> 35;
            case 56 -> 30;
            case 57 -> 8;
            case 58 -> 42;
            case 59 -> 59;
            case 60 -> 6;
            case 61 -> 21;
            case 62 -> 32;
            default -> 1;
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
        _9r.d[n3] = new String(cArray);
        return n3;
    }

    public boolean boolean_9(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (boolean)_9r.a("C", (Object)this, 3461225033500472577L, (long)l2);
    }

    private static void b() {
        Object[] objectArray = c;
        c[0] = "?FPZxb\"SR\u001b}>bQ";
        objectArray[1] = Boolean.TYPE;
        _9r.d[1] = "java/lang/Boolean";
        objectArray[2] = "\rPaLOC\u0010Ec\rJ\u001fP\u0000";
        objectArray[3] = "\u0017\u0019&=\u0017\u001fb9-2\u0006P\u00037&9\u0002\nw";
        objectArray[4] = Void.TYPE;
        _9r.d[4] = "java/lang/Void";
        objectArray[5] = "\u0000\u0000\u001eX\n[\f\b\u001f\u0013CS\u0010\u0000\u001dX'G\f\u00016\u001a\bY\u0006\u0001\u0007";
        objectArray[6] = "Fj\u001aBdl3J\u0011Mu#RD\u001aFqy&";
        objectArray[7] = "q\f5reXz\u0003$=\t[t\u0001&r%";
        objectArray[8] = "IU\u000e\u0013 <BZ\u001f\\A2IQ\u001b\u0006";
        objectArray[9] = "{:\u000fT7\\i#\t9p5fz\u0003IzXw-\u0000";
        objectArray[10] = "0L\u0002{\u0010\u0004\"U\u0004\u0016Sm-\f\u000ef]\u0000<[\r";
        objectArray[11] = "a#R\u0003%q>f\u0004\u0015Au!\u0018E\u0003'L ;[\u0005=u$7>\u0015}e*kS\u0004*fZ";
        objectArray[12] = "0a%I\b\u0010d)gHkRd4bB,B\r!#^\u001b\u001d`0t]k\u0011<jyLWEt(x/";
        objectArray[13] = "_gTr\u0000@\r:Ry\u007f\u0014f:S*\u000eC\rk\u00030\u0006/\\v\u000bu\u0004\u001e]yO \u007f";
        objectArray[14] = "|&j\u000f[d#c<\u0019?n*#O\u0013uf ;k\u0001Y\u00016cw\u0018\u000el'4th";
        Object[] objectArray2 = objectArray;
        objectArray[15] = "{\u0010Tj>Gi\tR\u0007\u007f.+\fJv.Ez\\P~B\u0014gT\u0015|s\u0015h\u0010@\u0007";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'C' || c == '\u00e2' || c == '\u00d8' || c == 'H') {
                field = _9r.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'C' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e2' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _9r.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00aa' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ed' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _9r.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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

    private static Method h(long l2, long l3) {
        int n = _9r.e(l2, l3);
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
                clazz3 = _9r.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _9r.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _9r.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _9r.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _9r.f(622934083772030L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _9r.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _9r.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _9r.f(622934083772030L, 0L);
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
            int n = _9r.e(l2, l3);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                _9r.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _9r.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _9r.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _9r.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _9r.d(classArray[j], string, clazz2);
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
            throw new RuntimeException("dev/krypton/9r" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field g(long l2, long l3) {
        int n = _9r.e(l2, l3);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = _9r.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _9r.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _9r.c(clazz3, string2, clazz2)) != null) {
                    _9r.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _9r.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _9r.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _9r.f(622934083772030L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void void_0(Object[] objectArray) {
        Object object;
        _9r r;
        long l2;
        long l3;
        block2: {
            block3: {
                l3 = (Long)objectArray[0];
                l2 = (l3 = a ^ l3) ^ 0x72D252363CABL;
                String string = _8j.cfr_renamed_3();
                try {
                    r = this;
                    object = _9r.a("C", (Object)this, 4382660737285672963L, (long)l3);
                    if (string != null) break block2;
                    if (object != false) break block3;
                }
                catch (MatchException matchException) {
                    throw _9r.a(matchException);
                }
                object = true;
                break block2;
            }
            object = false;
        }
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = (boolean)object;
        objectArray2[0] = l2;
        _9r.a("\u00aa", (Object)r, (Object)objectArray2, 4383111871950719513L, (long)l3);
    }

    public boolean cfr_renamed_3(long l2) {
        l2 = a ^ l2;
        return (boolean)_9r.a("C", (Object)this, 7478256665006279449L, (long)l2);
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
                        object = _9r.a("C", (Object)this, 6337468501103065890L, (long)l2);
                        if (string != null) break block4;
                        if (object != _9r.a("C", (Object)this, 6337669124920529658L, (long)l2)) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _9r.a(matchException);
                    }
                    object = true;
                    break block4;
                }
                catch (MatchException matchException) {
                    throw _9r.a(matchException);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    public void void_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        boolean bl = (Boolean)objectArray[1];
        long l3 = (l2 = a ^ l2) ^ 0x36E47593BA5FL;
        _9r.a("\u00e2", (Object)this, (boolean)bl, -6180032940363135251L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _9r.a("\u00aa", (Object)this, (Object)objectArray2, -6179744665863858283L, (long)l2);
    }

    @Override
    public void void_7(Object[] objectArray) {
        JsonElement jsonElement = (JsonElement)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = l2 ^ 0x7E589179EBD9L;
        try {
            if (_9r.a("\u00aa", (Object)jsonElement, -1467953047149915548L, (long)l2) != false) {
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = (boolean)_9r.a("\u00aa", (Object)jsonElement, -1467701876012679030L, (long)l2);
                objectArray2[0] = l3;
                _9r.a("\u00aa", (Object)this, (Object)objectArray2, -1467613223239525013L, (long)l2);
            }
        }
        catch (MatchException matchException) {
            throw _9r.a(matchException);
        }
    }

    @Override
    public JsonElement com_google_gson_JsonElement_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return new JsonPrimitive((Boolean)((Object)_9r.a("\u00ed", (boolean)_9r.a("C", (Object)this, -4042729337723475148L, (long)l2), -4043090662641484705L, (long)l2)));
    }

    @Override
    public void void_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 ^ 0xAFE34C8246AL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = (boolean)_9r.a("C", (Object)this, 2599690720070082842L, (long)l2);
        objectArray2[0] = l3;
        _9r.a("\u00aa", (Object)this, (Object)objectArray2, 2599290749444264664L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_9r.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

