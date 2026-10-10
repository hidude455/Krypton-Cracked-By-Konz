/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonPrimitive
 *  java.lang.MatchException
 *  net.minecraft.class_1792
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
import java.util.List;
import net.minecraft.class_1792;

/*
 * Renamed from dev.krypton.9m
 */
public class _9m_0
extends _95 {
    private final class_1792 cfr_renamed_2;
    private final List cfr_renamed_6;
    private class_1792 cfr_renamed_0;
    private static final long a = l.a(-4234519715951719633L, 3167158009613491949L, MethodHandles.lookup().lookupClass()).a(111643732321798L);
    private static final Object[] c = new Object[26];
    private static final String[] d = new String[26];

    public _9m_0(int n, long l2, class_1792 class_17922) {
        long l3 = (l2 = a ^ l2) ^ 0x3B6C513C5E72L;
        this(l3, n, class_17922, null);
    }

    public _9m_0(long l2, int n, class_1792 class_17922, List list) {
        long l3 = (l2 = a ^ l2) ^ 0x7C8F4D78FCF3L;
        int n2 = (int)(l3 >>> 48);
        int n3 = (int)(l3 << 16 >>> 32);
        int n4 = (int)(l3 << 48 >>> 48);
        super((short)n2, n, n3, n4);
        _9m_0.a("P", (Object)this, (class_1792)class_17922, -4646704631812941705L, (long)l2);
        this.cfr_renamed_2 = class_17922;
        this.cfr_renamed_6 = list;
    }

    static {
        _9m_0.b();
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
            case 0 -> 14;
            case 1 -> 24;
            case 2 -> 7;
            case 3 -> 63;
            case 4 -> 19;
            case 5 -> 43;
            case 6 -> 29;
            case 7 -> 42;
            case 8 -> 3;
            case 9 -> 46;
            case 10 -> 45;
            case 11 -> 10;
            case 12 -> 39;
            case 13 -> 34;
            case 14 -> 62;
            case 15 -> 26;
            case 16 -> 23;
            case 17 -> 28;
            case 18 -> 2;
            case 19 -> 40;
            case 20 -> 18;
            case 21 -> 25;
            case 22 -> 48;
            case 23 -> 33;
            case 24 -> 32;
            case 25 -> 5;
            case 26 -> 11;
            case 27 -> 21;
            case 28 -> 37;
            case 29 -> 49;
            case 30 -> 1;
            case 31 -> 30;
            case 32 -> 31;
            case 33 -> 16;
            case 34 -> 57;
            case 35 -> 53;
            case 36 -> 50;
            case 37 -> 38;
            case 38 -> 59;
            case 39 -> 15;
            case 40 -> 35;
            case 41 -> 4;
            case 42 -> 17;
            case 43 -> 60;
            case 44 -> 44;
            case 45 -> 47;
            case 46 -> 51;
            case 47 -> 13;
            case 48 -> 36;
            case 49 -> 22;
            case 50 -> 0;
            case 51 -> 52;
            case 52 -> 20;
            case 53 -> 9;
            case 54 -> 8;
            case 55 -> 41;
            case 56 -> 6;
            case 57 -> 12;
            case 58 -> 55;
            case 59 -> 27;
            case 60 -> 56;
            case 61 -> 54;
            case 62 -> 58;
            default -> 61;
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
        _9m_0.d[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e7' || c == 'P' || c == 'Q' || c == '\u00cb') {
                field = _9m_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e7' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'P' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'Q' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _9m_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00b5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _9m_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void b() {
        Object[] objectArray = c;
        c[0] = " \nk\u0013|L=\u001fiRy\u0010}\u0002";
        objectArray[1] = "G\u001fuA%UG\u001fb\u001d)Z]Tb\u0003)OZ%0Xq\u000e";
        objectArray[2] = "0!<72f.)&xPz)4";
        objectArray[3] = "{X8G\u001aq\u000ex3H\u000b>ov8C\u000fd\u001b";
        objectArray[4] = Void.TYPE;
        _9m_0.d[4] = "java/lang/Void";
        objectArray[5] = "w!X/h\u001d{)Yd!\u0015g![/E\u0001{ pmj\u001fq A";
        objectArray[6] = "\u0007;\u000f\u0005oT\f4\u001eJ\u0012L\u001f3\u0017\u0003";
        objectArray[7] = "C\"\u0004'fkC\"\u0013{jdYi\u0013ejq^\u0018G090";
        objectArray[8] = "\u0011tfHH8\u0011tq\u0014D7\u000b?q\nD\"\fN _\u0013a";
        objectArray[9] = "\u0016\u0013ap7\u0000\u001d\u001cp?V\u000e\u0016\u0017te";
        objectArray[10] = "\u000ft~6}l\u000ftijqc\u0015?itqv\u0012N=!\"6";
        objectArray[11] = Boolean.TYPE;
        _9m_0.d[11] = "java/lang/Boolean";
        objectArray[12] = "\u0010\u00021)\u000fE\r\u00173h\n\u0019MR";
        objectArray[13] = "&G\u0011G3\u000bSg\u001aH\"D2i\u0011C&\u001eF";
        objectArray[14] = "'|B?xxw~PO2\u001b\u007f!R%7!~yT\"";
        objectArray[15] = "u\u001fN\t3\\z_\u000fKR[,x\u0002K3A$#BX(\u001a/XBI(GK";
        objectArray[16] = "*\u001do\u0011S\u0001vW#R!\rmg(\u000eG4lD6\b]\rhHSVQ\u001dtI=\u0016\u001b\fx%";
        objectArray[17] = "9Mhw]\u0001iOz\u0007\u0012baK'?U\t(\u0010}u";
        objectArray[18] = "1/L\u0005eVa-^u$5i)\u0003Mm^ rY\u0007";
        objectArray[19] = "R}]e}(]=\u001c'\u001c6\u0001=\r:p\u0004RyS` SP(\u0017`x(P9\u0017=\u001cmPqU<gb\u00100\u0017]";
        objectArray[20] = "\u0010i\rD\u0015BFw_Br\u0006 %\bB\u001b[Ij\u0019\u0001\u0013=\u001b,\b\u0010C\u0001\u001cd\u0007Ar";
        objectArray[21] = "\nV\rG6\u0006\n\u0017OEM\bZ\u0015\u0015M!:\u000eQO\u0010tm\t\u0017\bL<\u0015V\u0004\u0007ZMS\u000bYMK6\\K\u0018\u000f*";
        objectArray[22] = "64kp~\u007ff6y\u00001\u001cff$iiu)wga\u000f'ofv13 'i'\u0000";
        objectArray[23] = "Q\u0016CFW\u0003\r\\\u000f\u0005%\u0001\u0000R6E~\u0012\u0017O\u0019Q%R\u0004TBZ^R\u0015T\u001f>";
        objectArray[24] = "L\u0001mWF\u0019L@/U=\u0017\u001cBu]Q%O\u0005(\u0001\u0000rO\u0002%\u0002\\\t@Bd@=L\u000fCsKE\u0013\u001cLe:";
        Object[] objectArray2 = objectArray;
        objectArray[25] = "=\tX\u0012\u001b\u007fn\r[I#{c\\B\u001bt);\b\u0019G#(=IK\fH(|\u000bI";
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
        int n = _9m_0.e(l2, l3);
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
                clazz3 = _9m_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _9m_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _9m_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _9m_0.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _9m_0.f(699217236757869L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _9m_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _9m_0.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _9m_0.f(699217236757869L, 0L);
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
            int n = _9m_0.e(l2, l3);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                _9m_0.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _9m_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _9m_0.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _9m_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _9m_0.d(classArray2[j], string, clazz2, n, classArray);
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
            throw new RuntimeException("dev/krypton/9m" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field g(long l2, long l3) {
        int n = _9m_0.e(l2, l3);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = _9m_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _9m_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _9m_0.c(clazz3, string2, clazz2)) != null) {
                    _9m_0.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _9m_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _9m_0.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _9m_0.f(699217236757869L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void cfr_renamed_2(Object[] objectArray) {
        class_1792 class_17922 = (class_1792)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = (l2 = a ^ l2) ^ 0x7A0EFD543963L;
        _9m_0.a("P", (Object)this, (class_1792)class_17922, 2956210530213891826L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _9m_0.a("\u00f4", (Object)this, (Object)objectArray2, 2956375930723347777L, (long)l2);
    }

    public List java_util_List_4(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return _9m_0.a("\u00e7", (Object)this, 418464952702519130L, (long)l2);
    }

    public class_1792 net_minecraft_class_1792_4(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return _9m_0.a("\u00e7", (Object)this, -3188889961901722550L, (long)l2);
    }

    @Override
    public boolean boolean_5(Object[] objectArray) {
        boolean bl;
        long l2 = (Long)objectArray[0];
        try {
            bl = _9m_0.a("\u00e7", (Object)this, 6338244680091987969L, (long)l2) == _9m_0.a("\u00e7", (Object)this, 6337985868181129840L, (long)l2);
        }
        catch (MatchException matchException) {
            throw _9m_0.a(matchException);
        }
        return bl;
    }

    @Override
    public void void_7(Object[] objectArray) {
        JsonElement jsonElement = (JsonElement)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = l2 ^ 0x2A16E420AF64L;
        try {
            if (_9m_0.a("\u00f4", (Object)jsonElement, -1466451262687540644L, (long)l2) != false) {
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l3;
                objectArray2[0] = (class_1792)_9m_0.a("\u00f4", (Object)_9m_0.a("Q", -1466913118316460433L, (long)l2), (Object)_9m_0.a("\u00b5", (Object)_9m_0.a("\u00f4", (Object)jsonElement, -1465938896144938152L, (long)l2), -1466221453693513811L, (long)l2), -1467022008958205890L, (long)l2);
                _9m_0.a("\u00f4", (Object)this, (Object)objectArray2, -1466032663733848347L, (long)l2);
            }
        }
        catch (MatchException matchException) {
            throw _9m_0.a(matchException);
        }
    }

    @Override
    public JsonElement com_google_gson_JsonElement_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return new JsonPrimitive((String)((Object)_9m_0.a("\u00f4", (Object)_9m_0.a("\u00f4", (Object)_9m_0.a("Q", -4043819671975417302L, (long)l2), (Object)_9m_0.a("\u00e7", (Object)this, -4043222131986866153L, (long)l2), -4043589671720508787L, (long)l2), -4042885825095944996L, (long)l2)));
    }

    public class_1792 net_minecraft_class_1792_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return _9m_0.a("\u00e7", (Object)this, -3531651847368584328L, (long)l2);
    }

    @Override
    public void void_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 ^ 0x5EB0419160D7L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = _9m_0.a("\u00e7", (Object)this, 2600006363280095632L, (long)l2);
        _9m_0.a("\u00f4", (Object)this, (Object)objectArray2, 2599966397999610198L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_9m_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

