/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  java.lang.MatchException
 */
package dev.krypton;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import dev.krypton._6_;
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
import java.util.HashSet;
import java.util.Set;

public class _90
extends _95 {
    private final Set cfr_renamed_9;
    private Set cfr_renamed_2;
    private static final long a = l.a(-2725710500752299090L, 2021643899408824331L, MethodHandles.lookup().lookupClass()).a(229104046891581L);
    private static final Object[] c = new Object[44];
    private static final String[] d = new String[44];

    public void void_1(Object[] objectArray) {
        _6_ _ = (_6_)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = (l2 = a ^ l2) ^ 0x2D4420C41CCFL;
        _90.a("\u00e3", (Object)_90.a("O", (Object)this, 911688027030662630L, (long)l2), (Object)_, 911566546426644615L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _90.a("\u00e3", (Object)this, (Object)objectArray2, 911885904604242691L, (long)l2);
    }

    public _90(int n, char c, Set set, long l2) {
        long l3 = ((long)c << 48 | l2 << 16 >>> 16) ^ a;
        long l4 = l3 ^ 0x1D8073739B83L;
        int n2 = (int)(l4 >>> 48);
        int n3 = (int)(l4 << 16 >>> 32);
        int n4 = (int)(l4 << 48 >>> 48);
        super((short)n2, n, n3, n4);
        _90.a("W", (Object)this, new HashSet(set), -2810309685940094529L, (long)l3);
        this.cfr_renamed_9 = new HashSet(set);
    }

    public _90(long l2, int n) {
        long l3 = (l2 = a ^ l2) ^ 0x4FF410CB5485L;
        int n2 = (int)(l3 >>> 48);
        long l4 = l3 << 16 >>> 16;
        HashSet hashSet = new HashSet();
        this(n, (char)n2, hashSet, l4);
    }

    static {
        _90.b();
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
            case 0 -> 43;
            case 1 -> 40;
            case 2 -> 34;
            case 3 -> 35;
            case 4 -> 44;
            case 5 -> 21;
            case 6 -> 58;
            case 7 -> 52;
            case 8 -> 32;
            case 9 -> 45;
            case 10 -> 19;
            case 11 -> 33;
            case 12 -> 5;
            case 13 -> 18;
            case 14 -> 27;
            case 15 -> 31;
            case 16 -> 61;
            case 17 -> 60;
            case 18 -> 1;
            case 19 -> 55;
            case 20 -> 48;
            case 21 -> 4;
            case 22 -> 63;
            case 23 -> 15;
            case 24 -> 46;
            case 25 -> 57;
            case 26 -> 49;
            case 27 -> 24;
            case 28 -> 20;
            case 29 -> 28;
            case 30 -> 11;
            case 31 -> 62;
            case 32 -> 12;
            case 33 -> 38;
            case 34 -> 29;
            case 35 -> 50;
            case 36 -> 56;
            case 37 -> 59;
            case 38 -> 16;
            case 39 -> 10;
            case 40 -> 30;
            case 41 -> 6;
            case 42 -> 53;
            case 43 -> 3;
            case 44 -> 22;
            case 45 -> 42;
            case 46 -> 54;
            case 47 -> 0;
            case 48 -> 14;
            case 49 -> 36;
            case 50 -> 8;
            case 51 -> 25;
            case 52 -> 17;
            case 53 -> 13;
            case 54 -> 37;
            case 55 -> 2;
            case 56 -> 51;
            case 57 -> 39;
            case 58 -> 47;
            case 59 -> 23;
            case 60 -> 41;
            case 61 -> 26;
            case 62 -> 9;
            default -> 7;
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
        _90.d[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = c;
        c[0] = "y(Y!\u0002\u001cd=[`\u0007@$}";
        objectArray[1] = "\u000b|\u0017\u0011\u001bo\u0015t\r^f\u007f\u0015";
        objectArray[2] = "H\\r\u0000!hCScO@fHXg\u0015";
        objectArray[3] = Boolean.TYPE;
        _90.d[3] = "java/lang/Boolean";
        objectArray[4] = "\u00017mB\u0001\u0005\u001c\"o\u0003\u0004Y\\g";
        objectArray[5] = "6\u0004s\u0012O\u0017C$x\u001d^X\"*s\u0016Z\u0002V";
        objectArray[6] = Void.TYPE;
        _90.d[6] = "java/lang/Void";
        objectArray[7] = "\rj \u007f>S\u0013b:0cR\u0015n7s>u\u0013y3\u007f}";
        objectArray[8] = "3\u0012S+%\t-\u001aIdm\t7\u0010Q#d\u0012w0J$x\t4\u0016W";
        objectArray[9] = "|KNXeHbCT\u0017\u0004_|O[M8";
        objectArray[10] = "u\u001f_d$4k\u0017E+l4q\u001d]le/18\\ki5v\u0011G";
        objectArray[11] = "\u0014o\"9\tWaO)6\u0018\u0018\u0000A\"=\u001cBt";
        objectArray[12] = "A$\u0006^\\c4\u0004\rQM,U\n\u0006ZIv!";
        objectArray[13] = "V]{.?\u0018#}p!.WBs{**\r6";
        objectArray[14] = ":>|e\u0000S66}.I[*>\u007fe-O6?P9\u0015] ";
        objectArray[15] = "\u0002MWi\u0007\u0014\u001cEM&`\u0015\r^@|F\u0013";
        objectArray[16] = "N6H!d)B>Ij-!^6K!I5B7`cf+H7Q";
        objectArray[17] = "iV\u0011oV\\bY\u0000 +Dq^\ti";
        objectArray[18] = "c\u0013T$d9~\u0006Veae38";
        objectArray[19] = "`h?9\u001bu\u0015H46\n:tF?=\u000e`\u0000";
        objectArray[20] = "F]<\u001d +[H>\\%w\u0014g";
        objectArray[21] = "\u0018u\u0017\u007fiaGk\u00047\u0007fUd\u0017g{`S\t\u0004`cf\u0012vU?hy)";
        objectArray[22] = "Zahi9v\u001b,9\tz;\\|<l\u0001{T+.3p7\u0019*4\t";
        objectArray[23] = "~g3\u0018]r|(}\"\u0004K)ufYLq7ar^=w\"z{Z\u0002p=\"a\"";
        objectArray[24] = "f\u001enR+3*SoH\u0011,=\u0016\u0019@z\"ZQ6Mt +\u000e+W{Bf\u000b6Pi}a\u0014nJ\u0011";
        objectArray[25] = ":\u0015Su\u001a8vXRo 2a\u001d\u0015cLI:\u0015Su\u001a8vXRo ";
        objectArray[26] = "(U1d}/$\\-(Mw9o63+_8W$%M,:T47/*~V|T";
        objectArray[27] = "/&r:O2nk#Z\u001cd5*&;\u0011xSo=aHs/1&>\u000e\u0003i.6#\u0014aoj4kw";
        objectArray[28] = "H3\u001a\u001dr\u0005\t~K}#XXC\u001e\u000fq\u000bD?@\u0014.M4y_\u00043WV\u007f\u001b\u0006{4";
        objectArray[29] = "8,Ag\u0010/isJx+6<2Y\u0006\u0012\"j}UzL95;%";
        objectArray[30] = "S\bB\f,7\u0002WI\u0013\u0017(S\u001d`\u0000g4:\\^\u0014n+XZ\u001a\u0016&H";
        objectArray[31] = "g4D\u001c\u001a|k=XP**`0qWq9w-^C*/}\"_J\u0012 \u007f|^,";
        objectArray[32] = "({(\u0012v\u001ai6yr%O9borrL6rmMuSnh\u0015";
        objectArray[33] = "99\u0015*P850\tf`n>= a\"z4' `\u001ah\"AXf\u001ap='\u0007x\t8S";
        objectArray[34] = "+\u001cB\u0007M\u001a)S\f=\u0013#l\u0013N]\u0015\u0012-^\u001f";
        objectArray[35] = "X/\tQ^6\u0019bX1\u001cjA8J\\f>Vd\u000bA\u001a`M;M1\\\u007f]&WSZ;_n4";
        objectArray[36] = "\u0018R|y[$\u001a\u001d2C\u0004\u001d_]p#\u0003,\u001e\u0010!";
        objectArray[37] = "VjMxx\\ZcQ4H\u0004GPJ/.=FsT)4\u0004B\u007f1r0\u001cEqStt\u001e\r\u0012";
        objectArray[38] = "\u000e\r\u0007U\bW\fBIoUnY\u001fR\u0014\u0019TG\u000bF\u0013hRR\u0010O\u0017WUMHUo";
        objectArray[39] = "\u0014\u0018We5VO\u001c\u0010jZ\u0013/\u001a\u0005\u007f!Y\u0015\u0004\u0011k&(\u0013\u0011\nb\"\u0017\u0014\u000eRxZ";
        objectArray[40] = ")h v,\"+'nLt\u001b~zu7=!`na0L!jnh/.'.l L";
        objectArray[41] = "af\u0004{Y;==\u0013 #\"2}\u0007\"Y5\u0019c\u001c\u0005^<;\u0004C1\u0018g/x\u001d*G!_=\bx\u001c(#c\u0013'ZX";
        objectArray[42] = "\u0014N)fxHX\u0003(|B\\AD\u0013\"-BHBwt9]Z</oxB\u0012Mc\"yX(";
        Object[] objectArray2 = objectArray;
        objectArray[43] = "\u000e)\u000e^Se\u00186UV6<e<\u0006PMr_\"\u0012DJ\u0003\ba\u0015UUh\u0018/\u000bE6";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'O' || c == 'W' || c == 'Y' || c == '\u00c0') {
                field = _90.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'O' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'W' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'Y' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _90.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00a5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _90.b(lookup, mutableCallSite, string, methodType, l2, l3);
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
        int n = _90.e(l2, l3);
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
                clazz3 = _90.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _90.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _90.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _90.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _90.f(200551178624174L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _90.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _90.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _90.f(200551178624174L, 0L);
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
            int n = _90.e(l2, l3);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                _90.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _90.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _90.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _90.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _90.d(classArray2[j], string, clazz2, n, classArray);
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
            throw new RuntimeException("dev/krypton/90" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field g(long l2, long l3) {
        int n = _90.e(l2, l3);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = _90.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _90.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _90.c(clazz3, string2, clazz2)) != null) {
                    _90.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _90.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _90.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _90.f(200551178624174L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public boolean boolean_0(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        _6_ _ = (_6_)objectArray[1];
        l2 = a ^ l2;
        return (boolean)_90.a("\u00e3", (Object)_90.a("O", (Object)this, 351707884530345377L, (long)l2), (Object)_, 355735114401121380L, (long)l2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void void_0(Object[] objectArray) {
        block8: {
            _6_ _;
            _90 v1;
            long l2;
            long l3;
            block6: {
                _6_ _2 = (_6_)objectArray[0];
                l3 = (Long)objectArray[1];
                long l4 = l3 = a ^ l3;
                long l5 = l4 ^ 0x7994FA7C7B09L;
                l2 = l4 ^ 0x8434F91C38DL;
                long l6 = l4 ^ 0xA8FFD7D734EL;
                String string = _8j.cfr_renamed_3();
                try {
                    block7: {
                        try {
                            try {
                                v1 = this;
                                _ = _2;
                                if (string != null) break block6;
                                Object[] objectArray2 = new Object[2];
                                objectArray2[1] = _;
                                objectArray2[0] = l6;
                                if (_90.a("\u00e3", (Object)v1, (Object)objectArray2, -3872956237105236729L, (long)l3) == false) break block7;
                            }
                            catch (MatchException matchException) {
                                throw _90.a(matchException);
                            }
                            Object[] objectArray3 = new Object[2];
                            objectArray3[1] = l5;
                            objectArray3[0] = _2;
                            _90.a("\u00e3", (Object)this, (Object)objectArray3, -3868693249357420883L, (long)l3);
                            if (string == null) break block8;
                        }
                        catch (MatchException matchException) {
                            throw _90.a(matchException);
                        }
                    }
                    v1 = this;
                    _ = _2;
                }
                catch (MatchException matchException) {
                    throw _90.a(matchException);
                }
            }
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = _;
            objectArray4[0] = l2;
            _90.a("\u00e3", (Object)v1, (Object)objectArray4, -3872018923993002150L, (long)l3);
        }
    }

    public void cfr_renamed_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        Set set = (Set)objectArray[1];
        long l3 = (l2 = a ^ l2) ^ 0x529444DBD338L;
        _90.a("W", (Object)this, new HashSet(set), -4372563412480400879L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _90.a("\u00e3", (Object)this, (Object)objectArray2, -4372761357888459532L, (long)l2);
    }

    @Override
    public boolean boolean_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return _90.a("O", (Object)this, 6339315658072585913L, (long)l2).equals(_90.a("O", (Object)this, 6338929020687611097L, (long)l2));
    }

    public Set java_util_Set_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return _90.a("O", (Object)this, -1805965842520914001L, (long)l2);
    }

    public void void_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        _6_ _ = (_6_)objectArray[1];
        long l3 = (l2 = a ^ l2) ^ 0x5C939529A44BL;
        _90.a("\u00e3", (Object)_90.a("O", (Object)this, -5466658866117864094L, (long)l2), (Object)_, -5463656004679924495L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _90.a("\u00e3", (Object)this, (Object)objectArray2, -5466285066026837113L, (long)l2);
    }

    @Override
    public void void_7(Object[] objectArray) {
        block17: {
            Object object;
            JsonElement jsonElement;
            String string;
            long l2;
            long l3;
            long l4;
            block16: {
                JsonElement jsonElement2 = (JsonElement)objectArray[0];
                l4 = (Long)objectArray[1];
                long l5 = l4;
                l3 = l5 ^ 0x701E675BFBC3L;
                l2 = l5 ^ 0x7FBC6FEAC0A5L;
                string = _8j.cfr_renamed_3();
                try {
                    try {
                        jsonElement = jsonElement2;
                        if (string != null) break block16;
                        if (_90.a("\u00e3", (Object)jsonElement, -1466888564517878250L, (long)l4) == false) break block17;
                    }
                    catch (MatchException matchException) {
                        throw _90.a(matchException);
                    }
                    jsonElement = jsonElement2;
                }
                catch (MatchException matchException) {
                    throw _90.a(matchException);
                }
            }
            CallSite callSite = _90.a("\u00e3", (Object)jsonElement, -1465236627621501854L, (long)l4);
            _90.a("\u00e3", (Object)_90.a("O", (Object)this, -1465171586784146710L, (long)l4), -1465335717591005289L, (long)l4);
            CallSite callSite2 = _90.a("\u00e3", (Object)callSite, -1466126946967023638L, (long)l4);
            block12: while (_90.a("\u00e3", (Object)callSite2, -1466587522003583378L, (long)l4) != false) {
                object = _90.a("\u00e3", (Object)callSite2, -1466630466487739723L, (long)l4);
                do {
                    Object object2;
                    block20: {
                        block19: {
                            JsonElement jsonElement3;
                            block18: {
                                JsonElement jsonElement4 = (JsonElement)object;
                                try {
                                    try {
                                        try {
                                            if (string != null) break block17;
                                            jsonElement3 = jsonElement4;
                                            if (string != null) break block18;
                                        }
                                        catch (MatchException matchException) {
                                            throw _90.a(matchException);
                                        }
                                        if (_90.a("\u00e3", (Object)jsonElement3, -1464977856538210726L, (long)l4) == false) break block19;
                                    }
                                    catch (MatchException matchException) {
                                        throw _90.a(matchException);
                                    }
                                    jsonElement3 = jsonElement4;
                                }
                                catch (MatchException matchException) {
                                    throw _90.a(matchException);
                                }
                            }
                            object2 = _90.a("\u00e3", (Object)jsonElement3, -1466506686966268169L, (long)l4);
                            if (l4 >= 0L) {
                                Object[] objectArray2 = new Object[2];
                                objectArray2[1] = l2;
                                objectArray2[0] = object2;
                                CallSite callSite3 = _90.a("\u00a5", (Object)objectArray2, -1465702622207928048L, (long)l4);
                                try {
                                    if (callSite3 != null) {
                                        _90.a("\u00e3", (Object)_90.a("O", (Object)this, -1465171586784146710L, (long)l4), (Object)callSite3, -1466733933119022215L, (long)l4);
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw _90.a(matchException);
                                }
                            }
                            break block20;
                        }
                        object2 = string;
                    }
                    if (object2 == null) continue block12;
                    object = this;
                } while (l4 <= 0L);
            }
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l3;
            _90.a("\u00e3", (Object)object, (Object)objectArray3, -1464806514676939761L, (long)l4);
        }
    }

    public Set java_util_Set_7(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return _90.a("O", (Object)this, 1667252794533590018L, (long)l2);
    }

    @Override
    public JsonElement com_google_gson_JsonElement_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        JsonArray jsonArray = new JsonArray();
        CallSite callSite = _90.a("\u00e3", (Object)_90.a("\u00e3", (Object)_90.a("\u00e3", (Object)_90.a("O", (Object)this, -4039826649591290193L, (long)l2), -4043472177465258434L, (long)l2), _6_::cfr_renamed_2, -4040370539952028405L, (long)l2), -4043811036245169258L, (long)l2);
        JsonArray jsonArray2 = jsonArray;
        _90.a("\u00a5", (Object)jsonArray2, -4040483041441565847L, (long)l2);
        _90.a("\u00e3", (Object)callSite, arg_0 -> ((JsonArray)jsonArray2).add(arg_0), -4043932091194221682L, (long)l2);
        return jsonArray;
    }

    @Override
    public void void_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 ^ 0x4B8C2EA3470L;
        _90.a("W", (Object)this, new HashSet(_90.a("O", (Object)this, 2600968190033823545L, (long)l2)), 2601354981769315673L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _90.a("\u00e3", (Object)this, (Object)objectArray2, 2600972386932165564L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_90.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

