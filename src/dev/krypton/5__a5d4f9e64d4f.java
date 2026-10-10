/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1268
 *  net.minecraft.class_1511
 *  net.minecraft.class_243
 *  net.minecraft.class_2824$class_5908
 *  net.minecraft.class_3966
 */
package dev.krypton;

import dev.krypton._3s;
import dev.krypton._4w;
import dev.krypton._62;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.class_1268;
import net.minecraft.class_1511;
import net.minecraft.class_243;
import net.minecraft.class_2824;
import net.minecraft.class_3966;

public class _5
implements class_2824.class_5908 {
    final _62 cfr_renamed_7;
    private static final long a = l.a(-3313907673321160931L, -3488808247473660630L, MethodHandles.lookup().lookupClass()).a(232725047854966L);
    private static final Object[] b = new Object[25];
    private static final String[] c = new String[25];

    _5(_62 var1_1) {
        this.cfr_renamed_7 = var1_1;
    }

    public void method_34219(class_1268 class_12682) {
    }

    public void method_34220(class_1268 class_12682, class_243 class_2432) {
    }

    public void method_34218() {
        block18: {
            CallSite callSite;
            long l2;
            block20: {
                CallSite callSite2;
                _4w[] wArray;
                block19: {
                    CallSite callSite3;
                    block17: {
                        long l3;
                        block15: {
                            long l4;
                            block16: {
                                long l5 = l2 = a ^ 0x69E1067BD76CL;
                                l3 = l5 ^ 0x5CBE825316E2L;
                                l4 = l5 ^ 0x2025093F987AL;
                                long l6 = l5 ^ 0x749C6AC14C5FL;
                                wArray = _3s.cfr_renamed_5();
                                try {
                                    Object[] objectArray = new Object[2];
                                    objectArray[1] = _5.a("I", (Object)this, -8930574044550943912L, (long)l2);
                                    objectArray[0] = l6;
                                    callSite3 = _5.a("I", (Object)_5.a("\u00c8", (Object)objectArray, -8928481201091525546L, (long)l2), -8929948153756602650L, (long)l2);
                                    if (wArray != null) break block15;
                                    if (callSite3 != null) break block16;
                                }
                                catch (MatchException matchException) {
                                    throw _5.a(matchException);
                                }
                                return;
                            }
                            Object[] objectArray = new Object[2];
                            objectArray[1] = _5.a("I", (Object)this, -8930574044550943912L, (long)l2);
                            objectArray[0] = l4;
                            callSite3 = _5.a("I", (Object)_5.a("\u00c8", (Object)objectArray, -8928409181794045022L, (long)l2), -8929948153756602650L, (long)l2);
                        }
                        try {
                            try {
                                if (wArray != null) break block17;
                                if (_5.a("\u00fd", (Object)callSite3, -8930137260576592331L, (long)l2) == _5.a("\u00c2", -8930457885329908155L, (long)l2)) {
                                }
                                break block18;
                            }
                            catch (MatchException matchException) {
                                throw _5.a(matchException);
                            }
                            Object[] objectArray = new Object[2];
                            objectArray[1] = _5.a("I", (Object)this, -8930574044550943912L, (long)l2);
                            objectArray[0] = l3;
                            callSite3 = _5.a("I", (Object)_5.a("\u00c8", (Object)objectArray, -8930243236123329517L, (long)l2), -8929948153756602650L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw _5.a(matchException);
                        }
                    }
                    CallSite callSite4 = callSite3;
                    try {
                        try {
                            callSite2 = callSite4;
                            if (wArray != null) break block19;
                            if (!(callSite2 instanceof class_3966)) break block18;
                        }
                        catch (MatchException matchException) {
                            throw _5.a(matchException);
                        }
                        callSite2 = callSite4;
                    }
                    catch (MatchException matchException) {
                        throw _5.a(matchException);
                    }
                }
                class_3966 class_39662 = (class_3966)callSite2;
                try {
                    try {
                        callSite = _5.a("\u00fd", (Object)class_39662, -8930292437530253542L, (long)l2);
                        if (wArray != null) break block20;
                        if (!(callSite instanceof class_1511)) break block18;
                    }
                    catch (MatchException matchException) {
                        throw _5.a(matchException);
                    }
                    _5.a("\u00fd", (Object)_5.a("\u00fd", (Object)class_39662, -8930292437530253542L, (long)l2), (Object)_5.a("\u00c2", -8930213883775376276L, (long)l2), -8930521677358206591L, (long)l2);
                    _5.a("\u00fd", (Object)_5.a("\u00fd", (Object)class_39662, -8930292437530253542L, (long)l2), (Object)_5.a("\u00c2", -8930213883775376276L, (long)l2), -8930393068437098725L, (long)l2);
                    callSite = _5.a("\u00fd", (Object)class_39662, -8930292437530253542L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _5.a(matchException);
                }
            }
            _5.a("\u00fd", (Object)callSite, -8928632731462925127L, (long)l2);
        }
    }

    static {
        _5.a();
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
            case 0 -> 42;
            case 1 -> 57;
            case 2 -> 32;
            case 3 -> 37;
            case 4 -> 31;
            case 5 -> 41;
            case 6 -> 34;
            case 7 -> 13;
            case 8 -> 59;
            case 9 -> 16;
            case 10 -> 43;
            case 11 -> 0;
            case 12 -> 52;
            case 13 -> 21;
            case 14 -> 12;
            case 15 -> 6;
            case 16 -> 10;
            case 17 -> 55;
            case 18 -> 28;
            case 19 -> 18;
            case 20 -> 56;
            case 21 -> 33;
            case 22 -> 5;
            case 23 -> 3;
            case 24 -> 63;
            case 25 -> 20;
            case 26 -> 61;
            case 27 -> 9;
            case 28 -> 23;
            case 29 -> 27;
            case 30 -> 51;
            case 31 -> 54;
            case 32 -> 48;
            case 33 -> 2;
            case 34 -> 7;
            case 35 -> 47;
            case 36 -> 17;
            case 37 -> 40;
            case 38 -> 38;
            case 39 -> 14;
            case 40 -> 44;
            case 41 -> 58;
            case 42 -> 35;
            case 43 -> 11;
            case 44 -> 22;
            case 45 -> 45;
            case 46 -> 4;
            case 47 -> 26;
            case 48 -> 49;
            case 49 -> 60;
            case 50 -> 19;
            case 51 -> 1;
            case 52 -> 39;
            case 53 -> 53;
            case 54 -> 24;
            case 55 -> 36;
            case 56 -> 25;
            case 57 -> 30;
            case 58 -> 8;
            case 59 -> 62;
            case 60 -> 50;
            case 61 -> 15;
            case 62 -> 46;
            default -> 29;
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
        _5.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "\u0010,{}?H\u0010,l!3G\ngl?3R\r\u0016>ak\u0016";
        objectArray[1] = Void.TYPE;
        _5.c[1] = "java/lang/Void";
        objectArray[2] = "p\u0015!<\"'m\u0000#}'{\"B";
        objectArray[3] = "nZ6Lq1\u001bz=C`~zt6Hd$\u000e";
        objectArray[4] = "4;J9\u0005d4;]e\tk.p]{\t~)\u0001\r&X";
        objectArray[5] = "U\u0003\u0004\u000e#j #\u000f\u00012%A-\u0004\n6\u007f5";
        objectArray[6] = "w;yA%\u001aw;n\u001d)\u0015mpn\u0003)\u0000j\u0001?\\qWz2l\u001c;,+j=";
        objectArray[7] = ")\r*X6M\\-!W'\u0002=#*\\#XI";
        objectArray[8] = "}$\u001a-\"6}$\rq.9go\ro.,`\u001e\\0v";
        objectArray[9] = "A`o\u0019/fA`xE#i[+x[#|\\Z*\u0005{8\u000bfwV1|p0.\u0005{";
        objectArray[10] = "\ti\u000eE@3\u0014|\f\u0004EoX";
        objectArray[11] = "p\u001fNw\u0004rp\u001fY+\b}jTY5\bhm%\t`_-";
        objectArray[12] = "n\u0005W\u0006v)e\nFI\u0017'n\u0001B\u0013";
        objectArray[13] = "`Z\u0000z\bx<N\u0004\n\u0000|~P\u001bf2*<\nD;e(;]\u0000iZ!8R\u0005\n";
        objectArray[14] = "^*+gfV\n,\u007fnV\u0016gr+ij\u0017Xs'i,-]=&hn\u0013[=!mV";
        objectArray[15] = "\u0018UtcahLS jQ,!\rtmm)\u001e\fxm+\u0013\u001bByli-\u001dB~iQ";
        objectArray[16] = "*t5,)\u0017v`1\\!\u00134~.0\u0013Cv#q\\z\u001b\" 4&8\u0007:$Ie}\u00134}vl~\u001c1\u001e";
        objectArray[17] = ".\u00045|,z|\u00048!\\v\u0011\u0005;s-zjQ='$";
        objectArray[18] = "n\u001a\u001a\u0004y42\u000e\u001etq0p\u0010\u0001\u0018Cf5OZI\u0014ci\u001aX\tn!u\u0002\\t-da\f\u0005K$gn\tf";
        objectArray[19] = "3UKcl\b4\u0003Kx\u0014_nU\u001f~C\b4\u0003B\u0012(\\?I\u0003+/\n?R";
        objectArray[20] = "H#I6[\t\u001c%\u001d?kCq{I8WHNzE8\u0011rK4D9SLM4C<k";
        objectArray[21] = "\u001c~X>\fuU;\u001ab4iA<\u00024X[\u0015\u007f]c\u000e\fN*\u001e#Ye\u0012>\u001aS";
        objectArray[22] = "Dvd\u0011Ib\u0014b=\u00172j\u0014o=\u0013^X@,bD\t\u000fE~m\u0005J6B(m\u001e2";
        objectArray[23] = "\u0019fo g8[zw$\u001a,FnarMx\u001924.\u001a|Bi;c`>^q?";
        Object[] objectArray2 = objectArray;
        objectArray[24] = "XM<R\u0005d^M;W=4\u0003R8@jc]\u0001a,\u0000?[Z'AP+\u0002\\";
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _5.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _5.b[n] = clazz = Class.forName(c[n]);
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
        Field field = _5.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _5.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _5.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5.a(clazz3, string2, clazz2)) != null) {
                    _5.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5.b(872120630541671L, 0L);
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
        Method method = _5.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method d(long l2, long l3) {
        int n = _5.a(l2, l3);
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
                clazz3 = _5.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5.b(872120630541671L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5.b(872120630541671L, 0L);
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
            if (c == 'I' || c == '\u00cb' || c == '\u00c2' || c == 'y') {
                field = _5.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'I' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00cb' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fd' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c8' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _5.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

