/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 */
package dev.krypton;

import dev.krypton._0j;
import dev.krypton._4m_0;
import dev.krypton._4w;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.runtime.ObjectMethods;

public class _0t
extends Record {
    private final String cfr_renamed_0;
    private final _4m_0 cfr_renamed_8;
    private static final long a = l.a(6479901396149329020L, -5029465723040128275L, MethodHandles.lookup().lookupClass()).a(2416817323336L);
    private static final Object[] b = new Object[9];
    private static final String[] c = new String[9];

    public _4m_0 cfr_renamed_5() {
        long l2 = a ^ 0x64FE7FBAC68L;
        return _0t.a("\u00eb", (Object)this, -5156379378726440110L, (long)l2);
    }

    public _0t(String string, _4m_0 m_0) {
        this.cfr_renamed_0 = string;
        this.cfr_renamed_8 = m_0;
    }

    static {
        _0t.a();
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{_0t.class, "8;5", "8", "5"}, this, object);
    }

    @Override
    public String toString() {
        long l2 = a ^ 0x23DB39F61317L;
        return (String)((Object)_0t.a("\u00eb", (Object)this, 508829516964277005L, (long)l2)) + " " + (String)((Object)_0t.a("\u00f4", (Object)_0t.a("\u00eb", (Object)this, 508899965633940525L, (long)l2), 508667885116826471L, (long)l2));
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{_0t.class, "8;5", "8", "5"}, this);
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _0t.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _0t.b(classArray2[j], string, clazz2, n, classArray);
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
            int n = _0t.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _0t.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _0t.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _0t.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _0t.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _0t.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _0t.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _0t.a(clazz3, string2, clazz2)) != null) {
                    _0t.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _0t.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _0t.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _0t.b(239416003181317L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _0t.a(l2, l3);
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
                clazz3 = _0t.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _0t.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _0t.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _0t.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _0t.b(239416003181317L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _0t.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _0t.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _0t.b(239416003181317L, 0L);
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
            if (c == '\u00eb' || c == 'T' || c == '\u00f2' || c == '\u00db') {
                field = _0t.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00eb' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'T' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _0t.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _0t.a(lookup, mutableCallSite, string, methodType, l2, l3);
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0t" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
            case 0 -> 59;
            case 1 -> 55;
            case 2 -> 35;
            case 3 -> 8;
            case 4 -> 37;
            case 5 -> 30;
            case 6 -> 39;
            case 7 -> 1;
            case 8 -> 33;
            case 9 -> 22;
            case 10 -> 11;
            case 11 -> 60;
            case 12 -> 13;
            case 13 -> 6;
            case 14 -> 38;
            case 15 -> 24;
            case 16 -> 17;
            case 17 -> 41;
            case 18 -> 28;
            case 19 -> 42;
            case 20 -> 16;
            case 21 -> 10;
            case 22 -> 56;
            case 23 -> 23;
            case 24 -> 40;
            case 25 -> 15;
            case 26 -> 2;
            case 27 -> 47;
            case 28 -> 61;
            case 29 -> 31;
            case 30 -> 58;
            case 31 -> 3;
            case 32 -> 46;
            case 33 -> 20;
            case 34 -> 50;
            case 35 -> 53;
            case 36 -> 54;
            case 37 -> 43;
            case 38 -> 21;
            case 39 -> 7;
            case 40 -> 62;
            case 41 -> 27;
            case 42 -> 44;
            case 43 -> 34;
            case 44 -> 19;
            case 45 -> 32;
            case 46 -> 63;
            case 47 -> 29;
            case 48 -> 49;
            case 49 -> 12;
            case 50 -> 18;
            case 51 -> 36;
            case 52 -> 0;
            case 53 -> 25;
            case 54 -> 57;
            case 55 -> 9;
            case 56 -> 4;
            case 57 -> 51;
            case 58 -> 5;
            case 59 -> 52;
            case 60 -> 48;
            case 61 -> 45;
            case 62 -> 26;
            default -> 14;
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
        _0t.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "y:-\"&Sd//c#\u000f-+";
        objectArray[1] = "\u0012B\u001d\u0010Eb\u000fW\u001fQ@>BJ";
        objectArray[2] = "`\r`\u0007?/k\u0002qHB7x\u0005x\u0001";
        objectArray[3] = "\u0014\\#p\u0013 \u001fS2?r.\u0014X6e";
        objectArray[4] = Boolean.TYPE;
        _0t.c[4] = "java/lang/Boolean";
        objectArray[5] = "#D&y\u0006(wY +?.sQ<,x>\u001a\u000f*?\u0001nkO~0SP#D&y\u0006(wY +?";
        objectArray[6] = "v\"\u001a\rvn,\"\u001e<:\u0014v(\u0014\u0001d(-u\u0001D";
        objectArray[7] = "\u000b\u0005{P6\bQ\u0005\u007fawr\u000bN{Y~\n_S}\u000b";
        Object[] objectArray2 = objectArray;
        objectArray[8] = "<nu9\u0015`hssk,u|b{eW\u0018?tl?\u0012i\u007f cm,\"x qg\u001dai\u007f,\u0001";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public String cfr_renamed_3() {
        long l2 = a ^ 0x10A9B07F3834L;
        return _0t.a("\u00eb", (Object)this, 3183071651737272366L, (long)l2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean cfr_renamed_8(_0t t) {
        _0t t2;
        long l2;
        block26: {
            _4w[] wArray;
            block24: {
                block25: {
                    block23: {
                        block22: {
                            block20: {
                                block21: {
                                    l2 = a ^ 0x121973BFC794L;
                                    wArray = _0j.cfr_renamed_1();
                                    try {
                                        try {
                                            t2 = this;
                                            if (wArray == null) break block20;
                                            if (t2 != t) break block21;
                                            return true;
                                        }
                                        catch (MatchException matchException) {
                                            throw _0t.a(matchException);
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw _0t.a(matchException);
                                    }
                                }
                                t2 = t;
                            }
                            try {
                                if (wArray == null) break block22;
                                if (t2 == null) return false;
                            }
                            catch (MatchException matchException) {
                                throw _0t.a(matchException);
                            }
                            t2 = this;
                        }
                        try {
                            try {
                                if (wArray == null) break block23;
                                if (_0t.a("\u00eb", (Object)t2, -3203035161366462578L, (long)l2) == null) return false;
                            }
                            catch (MatchException matchException) {
                                throw _0t.a(matchException);
                            }
                            t2 = this;
                        }
                        catch (MatchException matchException) {
                            throw _0t.a(matchException);
                        }
                    }
                    try {
                        try {
                            if (wArray == null) break block24;
                            if (_0t.a("\u00eb", (Object)t2, -3202965260573599570L, (long)l2) != null) break block25;
                            return false;
                        }
                        catch (MatchException matchException) {
                            throw _0t.a(matchException);
                        }
                    }
                    catch (MatchException matchException) {
                        throw _0t.a(matchException);
                    }
                }
                t2 = this;
            }
            try {
                try {
                    if (wArray == null) break block26;
                    if (_0t.a("\u00d2", (Object)_0t.a("\u00eb", (Object)t2, -3203035161366462578L, (long)l2), (Object)_0t.a("\u00eb", (Object)t, -3203035161366462578L, (long)l2), -3202222838855594587L, (long)l2) == false) return false;
                }
                catch (MatchException matchException) {
                    throw _0t.a(matchException);
                }
                t2 = this;
            }
            catch (MatchException matchException) {
                throw _0t.a(matchException);
            }
        }
        try {
            if (_0t.a("\u00eb", (Object)t2, -3202965260573599570L, (long)l2) != _0t.a("\u00eb", (Object)t, -3202965260573599570L, (long)l2)) return false;
            return true;
        }
        catch (MatchException matchException) {
            throw _0t.a(matchException);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_0t.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

