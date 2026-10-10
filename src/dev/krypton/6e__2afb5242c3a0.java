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
 * Renamed from dev.krypton.6e
 */
public class _6e_0
extends _95 {
    private final String cfr_renamed_5;
    public String cfr_renamed_4;
    private static final long a = l.a(-2227582702632574060L, 4044735131268866837L, MethodHandles.lookup().lookupClass()).a(216204218030830L);
    private static final Object[] c = new Object[18];
    private static final String[] d = new String[18];

    public _6e_0 dev_krypton_6e_0_1(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = a ^ l2) ^ 0x2DD19FF409FDL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        super.dev_krypton_95_0(objectArray2);
        return this;
    }

    public _6e_0(int n, long l2, String string) {
        long l3 = (l2 = a ^ l2) ^ 0x77C25EEF3B6EL;
        int n2 = (int)(l3 >>> 48);
        int n3 = (int)(l3 << 16 >>> 32);
        int n4 = (int)(l3 << 48 >>> 48);
        super((short)n2, n, n3, n4);
        this.cfr_renamed_5 = string;
        _6e_0.a("\u00fa", (Object)this, (String)string, 8653995621320327670L, (long)l2);
    }

    static {
        _6e_0.b();
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
            case 0 -> 53;
            case 1 -> 59;
            case 2 -> 3;
            case 3 -> 48;
            case 4 -> 13;
            case 5 -> 16;
            case 6 -> 5;
            case 7 -> 40;
            case 8 -> 28;
            case 9 -> 43;
            case 10 -> 44;
            case 11 -> 50;
            case 12 -> 54;
            case 13 -> 0;
            case 14 -> 52;
            case 15 -> 1;
            case 16 -> 61;
            case 17 -> 23;
            case 18 -> 9;
            case 19 -> 4;
            case 20 -> 29;
            case 21 -> 46;
            case 22 -> 2;
            case 23 -> 31;
            case 24 -> 63;
            case 25 -> 18;
            case 26 -> 36;
            case 27 -> 22;
            case 28 -> 39;
            case 29 -> 33;
            case 30 -> 41;
            case 31 -> 49;
            case 32 -> 37;
            case 33 -> 17;
            case 34 -> 62;
            case 35 -> 38;
            case 36 -> 56;
            case 37 -> 27;
            case 38 -> 21;
            case 39 -> 45;
            case 40 -> 51;
            case 41 -> 7;
            case 42 -> 34;
            case 43 -> 30;
            case 44 -> 14;
            case 45 -> 35;
            case 46 -> 15;
            case 47 -> 57;
            case 48 -> 19;
            case 49 -> 60;
            case 50 -> 32;
            case 51 -> 47;
            case 52 -> 42;
            case 53 -> 12;
            case 54 -> 11;
            case 55 -> 26;
            case 56 -> 20;
            case 57 -> 24;
            case 58 -> 8;
            case 59 -> 58;
            case 60 -> 10;
            case 61 -> 6;
            case 62 -> 25;
            default -> 55;
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
        _6e_0.d[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'i' || c == '\u00fa' || c == '\u00a5' || c == '\u00dc') {
                field = _6e_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'i' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fa' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00a5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _6e_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00da' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _6e_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void b() {
        Object[] objectArray = c;
        c[0] = ".tI\u0003'63aKB\"j|t";
        objectArray[1] = "[#\u0019oN~P,\b 3fC+\u0001i";
        objectArray[2] = "!=\u0013N\b\fT\u001d\u0018A\u0019C5\u0013\u0013J\u001d\u0019A";
        objectArray[3] = Void.TYPE;
        _6e_0.d[3] = "java/lang/Void";
        objectArray[4] = "\u0010gah\u0013U\rrc)\u0016\tM7";
        objectArray[5] = "*\u0004\u0019j#\u0018_$\u0012e2W>*\u0019n6\rJ";
        objectArray[6] = "XUpJv\fT]q\u0001?\u0004HUsJ[\u0010TTX\bt\u000e^Ti";
        objectArray[7] = Boolean.TYPE;
        _6e_0.d[7] = "java/lang/Boolean";
        objectArray[8] = "d\u000eRgq\u001f\u0011.Yh`Pp Rcd\n\u0004";
        objectArray[9] = "\u001e\u000eD_\u001cp\u0015\u0001U\u0010}~\u001e\nQJ";
        objectArray[10] = "P2\u0003\u000e\u001e\rI6EkO=\u0006;HR\u001cG\u0001b\u0006Pr\u0007]%B\u0010M[\u00079Uk";
        objectArray[11] = "y\u0010B;8O.\u001c\u0018y\u0001I>8[fgp?\u001bE`}I;\u0017 <;T{\u0007G1kHtz";
        objectArray[12] = "L\u001c\u0014f'\u0004U\u0018R\u0003s4\u001e\u001f\u0012}u\t\u0016\u0006S<";
        objectArray[13] = "<\u0007^}aq%\u0003\u0018\u00184An\u0004Xf3|f\u001d\u0019'";
        objectArray[14] = "jt.PRYh .@5YQws[\f\f+p*\u0015\u000ebk,mQN]7vqF5";
        objectArray[15] = "8X#\u000b\f]oTyI5UiN\bJnF~S'^5\u0003m\r?\u000f\b\u000btL~1";
        objectArray[16] = "w\u001bEX\u00041n\u001f\u0003=Q\u0001!\u0012\u000e\u0004\u0006{&K@\u0006hjvH\u0019QXsr\u000e|";
        Object[] objectArray2 = objectArray;
        objectArray[17] = "{mQEr#st\u0010\u0004Ls;y\u0007_7\u001e|i\u001eB| 9mVCL#xxPF+.(d_;";
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
        int n = _6e_0.e(l2, l3);
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
                clazz3 = _6e_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _6e_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _6e_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _6e_0.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _6e_0.f(651498387597241L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _6e_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _6e_0.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _6e_0.f(651498387597241L, 0L);
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
            int n = _6e_0.e(l2, l3);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                _6e_0.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _6e_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _6e_0.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _6e_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _6e_0.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
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
            throw new RuntimeException("dev/krypton/6e" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field g(long l2, long l3) {
        int n = _6e_0.e(l2, l3);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = _6e_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _6e_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _6e_0.c(clazz3, string2, clazz2)) != null) {
                    _6e_0.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _6e_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _6e_0.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _6e_0.f(651498387597241L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public String java_lang_String_0(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return _6e_0.a("i", (Object)this, -4752885487262568593L, (long)l2);
    }

    @Override
    public _95 dev_krypton_95_0(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 ^ 0x46FD1F9A05FAL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        return _6e_0.a("\u00f9", (Object)this, (Object)objectArray2, 2219182373194672222L, (long)l2);
    }

    public String java_lang_String_4(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return _6e_0.a("i", (Object)this, 3195635991975024054L, (long)l2);
    }

    @Override
    public boolean boolean_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return (boolean)_6e_0.a("\u00f9", (Object)_6e_0.a("i", (Object)this, 6337199448653213213L, (long)l2), (Object)_6e_0.a("i", (Object)this, 6337158722785314455L, (long)l2), 6337990616896300612L, (long)l2);
    }

    public void void_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        long l3 = (l2 = a ^ l2) ^ 0x5214F7C04F9AL;
        _6e_0.a("\u00fa", (Object)this, (String)string, 6915294186969081367L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _6e_0.a("\u00f9", (Object)this, (Object)objectArray2, 6915450540654652140L, (long)l2);
    }

    @Override
    public void void_7(Object[] objectArray) {
        JsonElement jsonElement = (JsonElement)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = l2 ^ 0x492610F5B85EL;
        try {
            if (_6e_0.a("\u00f9", (Object)jsonElement, -1467899308349202039L, (long)l2) != false) {
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = _6e_0.a("\u00f9", (Object)jsonElement, -1467633647092857488L, (long)l2);
                objectArray2[0] = l3;
                _6e_0.a("\u00f9", (Object)this, (Object)objectArray2, -1468022622977939979L, (long)l2);
            }
        }
        catch (MatchException matchException) {
            throw _6e_0.a(matchException);
        }
    }

    @Override
    public void void_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 ^ 0x3D80B54477EDL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = _6e_0.a("i", (Object)this, 2599145270999676279L, (long)l2);
        objectArray2[0] = l3;
        _6e_0.a("\u00f9", (Object)this, (Object)objectArray2, 2599700228170345030L, (long)l2);
    }

    @Override
    public JsonElement com_google_gson_JsonElement_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return new JsonPrimitive((String)((Object)_6e_0.a("i", (Object)this, -4043071095395434997L, (long)l2)));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_6e_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

