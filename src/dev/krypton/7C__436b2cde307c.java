/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  java.lang.MatchException
 *  net.minecraft.class_1657
 *  net.minecraft.class_310
 *  net.minecraft.class_638
 *  net.minecraft.class_640
 *  net.minecraft.class_745
 */
package dev.krypton;

import com.mojang.authlib.GameProfile;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.UUID;
import net.minecraft.class_1657;
import net.minecraft.class_310;
import net.minecraft.class_638;
import net.minecraft.class_640;
import net.minecraft.class_745;

public class _7C
extends class_745 {
    private final UUID cfr_renamed_3;
    private class_640 cfr_renamed_5;
    private static int cfr_renamed_4;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    protected class_640 method_3123() {
        CallSite callSite;
        block5: {
            long l2;
            block6: {
                l2 = a ^ 0x6A845688032CL;
                int n = _7C.cfr_renamed_9();
                try {
                    callSite = _7C.a("\u00f8", (Object)((Object)this), 4187826339639296523L, (long)l2);
                    if (n == 0) break block5;
                    if (callSite != null) break block6;
                }
                catch (MatchException matchException) {
                    throw _7C.a(matchException);
                }
                CallSite callSite2 = _7C.a("\u00dd", 4185498287911405771L, (long)l2);
                try {
                    if (_7C.a("\u00a2", (Object)callSite2, 4185324378159685017L, (long)l2) != null) {
                        _7C.a("\u00aa", (Object)((Object)this), (class_640)_7C.a("\u00a2", (Object)_7C.a("\u00a2", (Object)callSite2, 4185324378159685017L, (long)l2), (Object)_7C.a("\u00f8", (Object)((Object)this), 4186861979293055601L, (long)l2), 4186369511569696772L, (long)l2), 4187826339639296523L, (long)l2);
                    }
                }
                catch (MatchException matchException) {
                    throw _7C.a(matchException);
                }
            }
            callSite = _7C.a("\u00f8", (Object)((Object)this), 4187826339639296523L, (long)l2);
        }
        return callSite;
    }

    public _7C(char c, int n, class_1657 class_16572, int n2, float f, boolean bl) {
        long l2 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ a;
        super((class_638)_7C.a("\u00f8", (Object)class_310.method_1551(), -2237520325044948244L, (long)l2), new GameProfile(UUID.randomUUID(), class_16572.method_5477().getString()));
        this.cfr_renamed_3 = _7C.a("\u00a2", (Object)class_16572, -2234255664125779612L, (long)l2);
        _7C.a("\u00a2", (Object)((Object)this), (double)_7C.a("\u00a2", (Object)class_16572, -2238016395954504694L, (long)l2), (double)_7C.a("\u00a2", (Object)class_16572, -2236892213780501493L, (long)l2), (double)_7C.a("\u00a2", (Object)class_16572, -2238152876714440030L, (long)l2), -2234177048334384932L, (long)l2);
        int n3 = _7C.cfr_renamed_3();
        _7C.a("\u00a2", (Object)((Object)this), (float)_7C.a("\u00a2", (Object)class_16572, -2237354820105223830L, (long)l2), -2237210941057679757L, (long)l2);
        _7C.a("\u00a2", (Object)((Object)this), (float)_7C.a("\u00a2", (Object)class_16572, -2236710673906418072L, (long)l2), -2233868197699893803L, (long)l2);
        _7C.a("\u00aa", (Object)((Object)this), (float)_7C.a("\u00a2", (Object)class_16572, -2237354820105223830L, (long)l2), -2234754335167279635L, (long)l2);
        _7C.a("\u00aa", (Object)((Object)this), (float)_7C.a("\u00a2", (Object)class_16572, -2236710673906418072L, (long)l2), -2237796686646738915L, (long)l2);
        _7C.a("\u00a2", (Object)((Object)this), (float)_7C.a("\u00a2", (Object)class_16572, -2234428286308199751L, (long)l2), -2234560196728464157L, (long)l2);
        _7C.a("\u00aa", (Object)((Object)this), (float)_7C.a("\u00a2", (Object)class_16572, -2234428286308199751L, (long)l2), -2237772378139005335L, (long)l2);
        _7C.a("\u00a2", (Object)((Object)this), (float)_7C.a("\u00a2", (Object)class_16572, -2237413520426324155L, (long)l2), -2234537846959779524L, (long)l2);
        _7C.a("\u00aa", (Object)((Object)this), (float)_7C.a("\u00a2", (Object)class_16572, -2237413520426324155L, (long)l2), -2236991303110707595L, (long)l2);
        _7C.a("\u00a2", (Object)((Object)this), (Object)_7C.a("\u00a2", (Object)class_16572, -2237084077962249392L, (long)l2), -2236861218502457214L, (long)l2);
        int n4 = n3;
        _7C.a("\u00a2", (Object)((Object)this), (float)f, -2237895610034042403L, (long)l2);
        _7C.a("\u00a2", (Object)((Object)this), (boolean)true, -2234073509386989367L, (long)l2);
        if (bl) {
            for (CallSite callSite : _7C.a("\u00dd", -2236649157357851132L, (long)l2)) {
                _7C.a("\u00a2", (Object)((Object)this), (Object)callSite, (Object)_7C.a("\u00a2", (Object)_7C.a("\u00a2", (Object)class_16572, (Object)callSite, -2234348343800050263L, (long)l2), -2236788611833734051L, (long)l2), -2234380057936631932L, (long)l2);
                if (n4 == 0) continue;
            }
        }
    }

    static {
        a = l.a(-923614180199052405L, 8118519853454866603L, MethodHandles.lookup().lookupClass()).a(268868599475214L);
        b = new Object[56];
        c = new String[56];
        _7C.a();
        if (_7C.cfr_renamed_9() == 0) {
            _7C.cfr_renamed_1(53);
        }
    }

    public static void cfr_renamed_1(int n) {
        cfr_renamed_4 = n;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _7C.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _7C.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _7C.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _7C.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _7C.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _7C.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(long l2, long l3) {
        int n = _7C.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _7C.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _7C.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _7C.a(clazz3, string2, clazz2)) != null) {
                    _7C.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _7C.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _7C.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _7C.b(1318823305255419L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _7C.a(l2, l3);
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
                clazz3 = _7C.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _7C.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _7C.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _7C.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _7C.b(1318823305255419L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _7C.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _7C.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _7C.b(1318823305255419L, 0L);
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
            if (c == '\u00f8' || c == '\u00aa' || c == '\u00e7' || c == 'n') {
                field = _7C.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f8' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00aa' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e7' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _7C.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00a2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00dd' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            throw new RuntimeException("dev/krypton/7C" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _7C.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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
            case 0 -> 5;
            case 1 -> 45;
            case 2 -> 28;
            case 3 -> 61;
            case 4 -> 52;
            case 5 -> 27;
            case 6 -> 22;
            case 7 -> 16;
            case 8 -> 4;
            case 9 -> 56;
            case 10 -> 53;
            case 11 -> 14;
            case 12 -> 35;
            case 13 -> 29;
            case 14 -> 57;
            case 15 -> 12;
            case 16 -> 7;
            case 17 -> 40;
            case 18 -> 37;
            case 19 -> 42;
            case 20 -> 31;
            case 21 -> 46;
            case 22 -> 2;
            case 23 -> 9;
            case 24 -> 21;
            case 25 -> 0;
            case 26 -> 44;
            case 27 -> 24;
            case 28 -> 48;
            case 29 -> 23;
            case 30 -> 6;
            case 31 -> 60;
            case 32 -> 25;
            case 33 -> 10;
            case 34 -> 49;
            case 35 -> 38;
            case 36 -> 1;
            case 37 -> 19;
            case 38 -> 36;
            case 39 -> 43;
            case 40 -> 11;
            case 41 -> 17;
            case 42 -> 8;
            case 43 -> 59;
            case 44 -> 13;
            case 45 -> 54;
            case 46 -> 47;
            case 47 -> 55;
            case 48 -> 50;
            case 49 -> 18;
            case 50 -> 58;
            case 51 -> 32;
            case 52 -> 26;
            case 53 -> 30;
            case 54 -> 15;
            case 55 -> 3;
            case 56 -> 34;
            case 57 -> 51;
            case 58 -> 62;
            case 59 -> 63;
            case 60 -> 20;
            case 61 -> 41;
            case 62 -> 39;
            default -> 33;
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
        _7C.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "IMMvs=IMZ*\u007f2S\u0006Z4\u007f'Tw\bj'c\u0003KU9m'x\u001d\fj'";
        objectArray[1] = "}%LGR\u000e`0N\u0006WR.\u0003";
        objectArray[2] = Integer.TYPE;
        _7C.c[2] = "java/lang/Integer";
        objectArray[3] = "f{\u00015z0f{\u0016iv?|0\u0016wv*{AF*'";
        objectArray[4] = "\u0010\u000e\u0003l1\\\u0010\u000e\u00140=S\nE\u0014.=F\r4Aqd";
        objectArray[5] = Void.TYPE;
        _7C.c[5] = "java/lang/Void";
        objectArray[6] = Float.TYPE;
        _7C.c[6] = "java/lang/Float";
        objectArray[7] = "~\u001e2;\u0000\u007f~\u001e%g\fpdU%y\fec$w&]\"";
        objectArray[8] = "5\fk6y)5\f|ju&/G|tu3(6./-y";
        objectArray[9] = "\u0010o3o%x\u0010o$3)w\n$$-)b\rUvw}&";
        objectArray[10] = "RK&'Q\u0012LC<h*2qn";
        objectArray[11] = Boolean.TYPE;
        _7C.c[11] = "java/lang/Boolean";
        objectArray[12] = Double.TYPE;
        _7C.c[12] = "java/lang/Double";
        objectArray[13] = "k\u0012g\u00187|k\u0012pD;sqYpZ;fv('\u0006o%";
        objectArray[14] = "Uzu:oxc_u:x$oPoqx:oEh\u0000*e>\u0002 ";
        objectArray[15] = "d\u0005\u0004N\u0003vd\u0005\u0013\u0012\u000fy~N\u0013\f\u000fly?ARW(";
        objectArray[16] = "\u0015KQF7!\u0015KF\u001a;.\u000f\u0000F\u0004;;\bq\u0013[n";
        objectArray[17] = ")[iL* )[~\u0010&/3\u0010~\u000e&:4a+Vw";
        objectArray[18] = "YMl*V,RB}e7\"YIy?";
        objectArray[19] = ",.\u0002J\u000b\u0001#)\t;\\\u001c0/\u0014l\u000fLmqx\u0007^Em5\u0017C\u0003\u0012`";
        objectArray[20] = "]\f@\u0015\u001edR\u000bKdBuP\t]\bp%\u0012R\u0004d\u001bt\u0014YD\u000b_)CT:_ZxL\u001bH\t^vBi";
        objectArray[21] = "r`(%\r+}g#TQ:\u007fe58cj39mT\b;;5,;Lfl8RoI7cw 9M9m\u0005";
        objectArray[22] = "D\u0001\u0002\u001a2\u0005K\u0006\tkn\u0014I\u0004\u001f\u0007\\D\u000b[Ck6\u0015OXCSk\u0013W\txV{\u0005_\u0001A\u001af\u0014JdC\u0016k\u0019G\u0016\u0015\u0012e\u00175";
        objectArray[23] = "-ml\"C.uyl'3u~is8_G.*\"f3,\u007f-#!\\h\"z._";
        objectArray[24] = "?W?\u0004\u00107gC?\u0001`llS \u001e\f^<\u0011~F`7pA/\u0016\u001e21D/y";
        objectArray[25] = "\u0010\u000040+|H\u001445['C\u0004+*7\u0015\u0010Ar}[\u007fB\u0002wvc\"D\u001a&Mf2R\u0012.t*/C\u0007K";
        objectArray[26] = "\u001a\u000bj$\u0000v\u0015\faU\\g\u0017\u000ew9n7[Q-U\u0006r\fTykHe[\u0002\u0010nDj\u000b\u001cb8@d\u0005n";
        objectArray[27] = "<XtL\u0000a3_\u007f=\\p1]iQn }\u00042=\t|3\\?WVd=Z\u000e\rXc,\fdR@m*=>\\G||WaDIzM\u0006s]Yo?PwSW\u001d";
        objectArray[28] = "jA\u0000\u0010!k<\u000b\u0012N\u001e?=\f\u0000\u0016r\riM^K\u001e0:NY\u000bn+`N\nq";
        objectArray[29] = "\"o\"VOa-h)'\u0013p/j?K!&j6h\u001dv&.j8U\u0004p*d6'";
        objectArray[30] = "\u0014o]\u001dv\fB%OCIXC\"]\u001b%j\u0017c\u0000EI\u0007\u001f>\\CxQU,\u0002|";
        objectArray[31] = "kW=t\u0010pdP6\u0005LafR i~7$\u000ez:)0v\nw{Ft+]z\u0005\u0012qzR5wDut\\G";
        objectArray[32] = "(\u0000=\u001ec\u0017p\u0014=\u001b\u0013L{\u0004\"\u0004\u007f~,CyY*)&\u0019<\u0002\"Cy\u00012\u0004\u0013";
        objectArray[33] = "G>Az%\u0005H9J\u000by\u0014J;\\gKB\u000fd\u00076\u001c\u0010\r#\u0005y}\u0007[a;0a\u0019V)Ife\u0017X[";
        objectArray[34] = "+\u0012P&{\ns\u0006P#\u000bQx\u0016O<gc/Q\u0014b44%\u000bQ::^z\u0013_<\u000b";
        objectArray[35] = "h\u001f0\b\u007fEg\u0018;y|9'\u000b$\u0016)G\"J!\u0016";
        objectArray[36] = "%W&1+\u0019*P-@w\b(R;,E[l\tg@.\tl\u0002\"/jT;\u000f\\{o\u00054@.-k\u000b:2";
        objectArray[37] = "Z:\u0007)\u0013\u0000MlE\u0017\u000f\u0000^e\u0013@[_\u00020N\u0017\bZK?\rv\u001f\f\t";
        objectArray[38] = "\u0007OQD;\n\bHZ5l\u0017\u001bNGb<LK\u001b+\tnNFTDM3\u0019K";
        objectArray[39] = "M%D\u0017\u00110B\"OfF-Q$R1\u0016t\u0004|>ZDt\f>Q\u001e\u0019#\u0001";
        objectArray[40] = "*w88\\3{7/=bi|4*;\u000e[,szc_\fx'p7\u0019gl+-<b7l(*.\u0010ah&$\\";
        objectArray[41] = ":\u0016mg\t;5\u0011f\u0016U*7\u0013pzgzuI'\u0016\t84\u0016w,\\5,\u0015\u0017";
        objectArray[42] = "O\b\f\u001ey\u0005TR\fM\u0003\u0010H\u001eR@o\"\u001fR\r\u001e\u0003KT\f]H}N\u0015\t]'i\u000eW\u0012@\u0018}\u0007\u0014\u00192";
        objectArray[43] = "\u0015\u0010@WJTCZR\tu\u000bNLDZ\"\\\u0011\u0011\u001f6NZ]E\u001e\t\u001f\u001aJ@";
        objectArray[44] = "SFc5wh\u000bRc0\u00073\u0000B|/k\u0001V\u0000 u;VQR$xy9\u0015\u000fsu\u0007";
        objectArray[45] = "*mV'n\u0002ryV\"\u001eYyiI=rk+.\u0010j.<(y\u0011j`Sl$Fg\u001e";
        objectArray[46] = "Ss`\u0017\u001b\f\\tkfG\u001d^v}\nuK\u001c*'X\"LN.*\u0018M\b\u0013y'f\u0019\rBvh\u0014O\tLx\u001a";
        objectArray[47] = "Q^;\u0017$\u0005\u0000\u001e,\u0012\u001a_\u0007\u001d)\u0014vmPPuN\u001a\u0003\u0015\u001e,\u0013 V\u0018\u0006/ss\u0001\u0012_;\u0012dWPar\u000ezZ\u0018\u0013$\ntTj";
        objectArray[48] = "\u0012\u001eq\u0015rMJ\nq\u0010\u0002\u0016A\u001an\u000fn$\u0015V5W<s\u001dVi\u00112CM\u0002g\u0002\u0002";
        objectArray[49] = "!8|`Vd.?w\u0011V\u0018:&ta\u001d'./7j";
        objectArray[50] = "\u001d\u0013W*\u001b\u000bE\u0007W/kPN\u0017H0\u0007b\u0019P\u0013n[5\u0013\nV6Z_L\u0012X0k";
        objectArray[51] = "[hb;\u001b~ToiJLcGit\u001d\u001c8\u00105\u0018vN:\u001asw2\u0013m\u0017";
        objectArray[52] = "\u0016\u0011q\u000b3;Z\f`\u001eVgF\u001dm\u0006:U\u0014P2[V?[\u001dg\u0004osF\fra";
        objectArray[53] = "\u0019\u0019yV\u0000/\u0016\u001er'\\>\u0014\u001cdKnjXG3\u001f9bX\u001bz\u0017\t2\f\u0015i'\u0002.\b\u001cqUT*\u0006\u0012\u0003";
        objectArray[54] = "wL\u00012/K*J\u0019c\u0014\r#D\u0006cos{\\@rz\u00013FCh\u0014";
        Object[] objectArray2 = objectArray;
        objectArray[55] = "\u0005;\u0013'V7]/\u0013\"&lV?\f=J^\u0000}Pg\u001b\t\u0007/TjXfCr\u0003g&";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static int cfr_renamed_3() {
        return cfr_renamed_4;
    }

    public void cfr_renamed_7(Object[] objectArray) {
        block4: {
            long l2;
            block5: {
                l2 = (Long)objectArray[0];
                l2 = a ^ l2;
                int n = _7C.cfr_renamed_3();
                CallSite callSite = _7C.a("\u00dd", 8497983568995239728L, (long)l2);
                try {
                    try {
                        if (n != 0) break block4;
                        if (_7C.a("\u00f8", (Object)callSite, 8494781938820589565L, (long)l2) == null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _7C.a(matchException);
                    }
                    _7C.a("\u00a2", (Object)_7C.a("\u00f8", (Object)callSite, 8494781938820589565L, (long)l2), (int)_7C.a("\u00a2", (Object)((Object)this), 8494649562290766230L, (long)l2), (Object)_7C.a("\u00e7", 8493823937371327127L, (long)l2), 8494498178979064112L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _7C.a(matchException);
                }
            }
            _7C.a("\u00a2", (Object)((Object)this), (Object)_7C.a("\u00e7", 8493823937371327127L, (long)l2), 8494140131818993681L, (long)l2);
        }
    }

    public static int cfr_renamed_9() {
        int n = _7C.cfr_renamed_3();
        if (n == 0) {
            return 122;
        }
        return 0;
    }

    public void cfr_renamed_0(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        _7C.a("\u00a2", (Object)((Object)this), 1633141847715650561L, (long)l2);
        _7C.a("\u00a2", (Object)_7C.a("\u00f8", (Object)_7C.a("\u00dd", 1633390621051659380L, (long)l2), 1632440786327061689L, (long)l2), (Object)((Object)this), 1632352818234480916L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_7C.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

