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

public class _92
extends _95 {
    private final double cfr_renamed_6;
    private final double cfr_renamed_8;
    private final double cfr_renamed_9;
    private final double cfr_renamed_0;
    private double cfr_renamed_4;
    private static final long a = l.a(-9138492214216988693L, -3289566507795675152L, MethodHandles.lookup().lookupClass()).a(5747144500497L);
    private static final Object[] c = new Object[25];
    private static final String[] d = new String[25];

    public double double_1(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (double)_92.a("J", (Object)this, 4830923681778176290L, (long)l2);
    }

    public long long_1(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (long)_92.a("J", (Object)this, -646767012542828147L, (long)l2);
    }

    public _92(int n, double d, long l2, double d2, double d3, double d4) {
        long l3 = (l2 = a ^ l2) ^ 0x46A3E69BD994L;
        int n2 = (int)(l3 >>> 48);
        int n3 = (int)(l3 << 16 >>> 32);
        int n4 = (int)(l3 << 48 >>> 48);
        super((short)n2, n, n3, n4);
        this.cfr_renamed_6 = d;
        this.cfr_renamed_8 = d2;
        _92.a("\u00da", (Object)this, (double)d3, -7285686284986885009L, (long)l2);
        this.cfr_renamed_9 = d4;
        this.cfr_renamed_0 = d3;
    }

    static {
        _92.b();
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
            case 0 -> 51;
            case 1 -> 33;
            case 2 -> 37;
            case 3 -> 0;
            case 4 -> 54;
            case 5 -> 24;
            case 6 -> 14;
            case 7 -> 19;
            case 8 -> 10;
            case 9 -> 35;
            case 10 -> 61;
            case 11 -> 43;
            case 12 -> 36;
            case 13 -> 11;
            case 14 -> 50;
            case 15 -> 34;
            case 16 -> 49;
            case 17 -> 18;
            case 18 -> 39;
            case 19 -> 16;
            case 20 -> 46;
            case 21 -> 6;
            case 22 -> 53;
            case 23 -> 3;
            case 24 -> 30;
            case 25 -> 58;
            case 26 -> 42;
            case 27 -> 41;
            case 28 -> 45;
            case 29 -> 62;
            case 30 -> 63;
            case 31 -> 29;
            case 32 -> 32;
            case 33 -> 38;
            case 34 -> 57;
            case 35 -> 55;
            case 36 -> 1;
            case 37 -> 48;
            case 38 -> 26;
            case 39 -> 27;
            case 40 -> 7;
            case 41 -> 21;
            case 42 -> 25;
            case 43 -> 13;
            case 44 -> 56;
            case 45 -> 22;
            case 46 -> 4;
            case 47 -> 8;
            case 48 -> 40;
            case 49 -> 2;
            case 50 -> 15;
            case 51 -> 47;
            case 52 -> 60;
            case 53 -> 28;
            case 54 -> 59;
            case 55 -> 31;
            case 56 -> 20;
            case 57 -> 44;
            case 58 -> 9;
            case 59 -> 23;
            case 60 -> 17;
            case 61 -> 5;
            case 62 -> 12;
            default -> 52;
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
        _92.d[n3] = new String(cArray);
        return n3;
    }

    public void void_9(Object[] objectArray) {
        double d = (Double)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = (l2 = a ^ l2) ^ 0x4BB25F7F2A91L;
        double d2 = 1.0 / _92.a("J", (Object)this, 4248279433792813828L, (long)l2);
        _92.a("\u00da", (Object)this, (double)((double)_92.a("\u00c7", (double)(_92.a("\u00c7", (double)_92.a("J", (Object)this, 4247926893230319835L, (long)l2), (double)_92.a("\u00c7", (double)_92.a("J", (Object)this, 4248133624189682526L, (long)l2), (double)d, 4248358579735450809L, (long)l2), 4248521412411422496L, (long)l2) * d2), 4247978780469437002L, (long)l2) / d2), 4248027417859882111L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _92.a("\u00c9", (Object)this, (Object)objectArray2, 4248425603241734365L, (long)l2);
    }

    private static void b() {
        Object[] objectArray = c;
        c[0] = "\u001c\u001co+%\u0012\u0001\tmj NAK";
        objectArray[1] = Double.TYPE;
        _92.d[1] = "java/lang/Double";
        objectArray[2] = "~;\u0000,u#r3\u0001g<+n;\u0003,X?r:(nw!x:\u0019";
        objectArray[3] = Boolean.TYPE;
        _92.d[3] = "java/lang/Boolean";
        objectArray[4] = "4\u001e%?N\nA>.0_E 0%;[\u001fT";
        objectArray[5] = Void.TYPE;
        _92.d[5] = "java/lang/Void";
        objectArray[6] = "$g\t@J:/h\u0018\u000f 9;d\u0013D";
        objectArray[7] = "4*\f6^\u0000?%\u001dy=\r*#";
        objectArray[8] = Long.TYPE;
        _92.d[8] = "java/lang/Long";
        objectArray[9] = "]$/hS\t@1-)VU\u0000t";
        objectArray[10] = "*kGt\u0001!_KL{\u0010n>EGp\u00144J";
        objectArray[11] = "S\u001e\u0002\u0011q\u0010X\u0011\u0013^\u0010\u001eS\u001a\u0017\u0004";
        objectArray[12] = "hQ!P\fGs\u0012;,_\"3V;M_Mo\u00023A";
        objectArray[13] = "+ ^\u0011yN|+\u0006\u0014\u0018\\~&\u001d@_L\u0017{^Jy\u0012x'\nBu\"+ ^\u0011yN|+\u0006\u0014\u0018";
        objectArray[14] = "D\u007fw5\u0007\u001e_<mI_{\u001fxm(T\u0014C,e$";
        objectArray[15] = "-X?p~x-\u000187\u0001`w\u001a``\u0001#.\u0000g<n\u007fz\bk\f<dv[`s{to\u001c\u0006";
        objectArray[16] = "R\u000e;\n\u0011\u0011IM!vJt\t\t!\u0017B\u001bU])\u001b";
        objectArray[17] = "#aeG=|8\"\u007f;c\u0019xf\u007fZnv$2wV";
        objectArray[18] = "U?.bRV\u0014&,ej\n\u0017\u00067n\f3\u0016%)h\u0016\n\u0012)L3\u0012\u0015\u0012{5r\f\u0000\bD";
        objectArray[19] = "\u000b d\u0010\u0019\u000e\u0010c~lEkP'~\rJ\u0004\fsv\u0001";
        objectArray[20] = "\r\u0010\u0002|hf\rI\u0005;\u0017aQI;9)cQ\u001fTe}k]/\u0002>pe\u0000@^jxi0\u0016\u0005gv4_JQoz\u0004";
        objectArray[21] = "\\axJ_zSc'\tb0b;q\u0014X4\u001b\u007f>\u001a\u0018\u000bYgyEXr\\t(\u0004b";
        objectArray[22] = "\u000ej\rlzK\u0015)\u0017\u0010(.Sc\u0011*&W\u0017,\u001fj\u0019\u0015\u000fk@*`\u0010\u001c:\u0001\u0010";
        objectArray[23] = "dii\u0016\u000b[d0nQt\\0&PSJ^8f?\u000f\u001eV4ViT\u0013Xi95\u0000\u001bTYon\r\u0015\t63:\u0005\u00199";
        Object[] objectArray2 = objectArray;
        objectArray[24] = "\f\b\u0007Z!sM\u0011\u0005]\u0019!X\u000f,JU)H\u0019\u0001\\\u0019w\u000b\u0014\u0004\u0001v+_\u001c\b1";
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _92.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'J' || c == '\u00da' || c == '\u00aa' || c == 'z') {
                field = _92.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'J' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00da' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00aa' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _92.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c7' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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
        int n = _92.e(l2, l3);
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
                clazz3 = _92.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _92.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _92.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _92.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _92.f(777399608673188L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _92.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _92.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _92.f(777399608673188L, 0L);
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
            int n = _92.e(l2, l3);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                _92.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _92.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _92.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _92.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _92.d(classArray2[j], string, clazz2, n, classArray);
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
            throw new RuntimeException("dev/krypton/92" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field g(long l2, long l3) {
        int n = _92.e(l2, l3);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = _92.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _92.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _92.c(clazz3, string2, clazz2)) != null) {
                    _92.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _92.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _92.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _92.f(777399608673188L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public double cfr_renamed_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (double)_92.a("J", (Object)this, -7911381912035611745L, (long)l2);
    }

    public double double_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (double)_92.a("J", (Object)this, -5009687082911387L, (long)l2);
    }

    public double double_4(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (double)_92.a("J", (Object)this, 2504363122268106655L, (long)l2);
    }

    public double double_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (double)_92.a("J", (Object)this, -1619705126864836491L, (long)l2);
    }

    public int int_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (int)_92.a("J", (Object)this, 5731470725975640321L, (long)l2);
    }

    @Override
    public boolean boolean_5(Object[] objectArray) {
        Object object;
        block2: {
            block3: {
                long l2 = (Long)objectArray[0];
                String string = _8j.cfr_renamed_3();
                try {
                    reference cfr_temp_0 = _92.a("J", (Object)this, 6338062164666618238L, (long)l2) - _92.a("J", (Object)this, 6337213393167817388L, (long)l2);
                    object = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                    if (string != null) break block2;
                    if (object != false) break block3;
                }
                catch (MatchException matchException) {
                    throw _92.a(matchException);
                }
                object = true;
                break block2;
            }
            object = false;
        }
        return (boolean)object;
    }

    @Override
    public void void_7(Object[] objectArray) {
        JsonElement jsonElement = (JsonElement)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = l2 ^ 0x67ED57521363L;
        try {
            if (_92.a("\u00c9", (Object)jsonElement, -1466339136736767910L, (long)l2) != false) {
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l3;
                objectArray2[0] = (double)_92.a("\u00c9", (Object)jsonElement, -1466980388118464005L, (long)l2);
                _92.a("\u00c9", (Object)this, (Object)objectArray2, -1466018655003774866L, (long)l2);
            }
        }
        catch (MatchException matchException) {
            throw _92.a(matchException);
        }
    }

    @Override
    public void void_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 ^ 0x134BF2E3DCD0L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = (double)_92.a("J", (Object)this, 2599235126268062028L, (long)l2);
        _92.a("\u00c9", (Object)this, (Object)objectArray2, 2599935338593304541L, (long)l2);
    }

    @Override
    public JsonElement com_google_gson_JsonElement_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return new JsonPrimitive((Number)((Object)_92.a("\u00c7", (double)_92.a("J", (Object)this, -4043334279205977752L, (long)l2), -4042987543928150212L, (long)l2)));
    }

    public float float_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (float)_92.a("J", (Object)this, 5811723312874460716L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_92.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

