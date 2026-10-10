/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1799
 */
package dev.krypton;

import dev.krypton._8j;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.runtime.ObjectMethods;
import java.util.function.Predicate;
import net.minecraft.class_1799;

public class _6_
extends Record {
    private final String cfr_renamed_6;
    private final String cfr_renamed_9;
    private final Predicate cfr_renamed_3;
    private static final long a = l.a(8410681990849880732L, 6465263762635698042L, MethodHandles.lookup().lookupClass()).a(82983646075439L);
    private static final Object[] b = new Object[13];
    private static final String[] c = new String[13];

    public _6_(String string, String string2, Predicate predicate) {
        long l2 = a ^ 0x162D0AD1B6L;
        this.cfr_renamed_6 = string;
        this.cfr_renamed_9 = _6_.a("\u00e4", string2, -6400113897715294371L, (long)l2);
        this.cfr_renamed_3 = predicate;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean cfr_renamed_1(String string) {
        CallSite callSite;
        long l2;
        block7: {
            String string2;
            String string3;
            block6: {
                l2 = a ^ 0x449163095117L;
                string3 = _8j.cfr_renamed_3();
                try {
                    string2 = string;
                    if (string3 != null) break block6;
                    if (string2 == null) return true;
                }
                catch (MatchException matchException) {
                    throw _6_.a(matchException);
                }
                string2 = string;
            }
            try {
                try {
                    callSite = _6_.a("\u00e4", string2, 2849885389655119624L, (long)l2);
                    if (string3 != null) return (boolean)callSite;
                    if (callSite == false) break block7;
                    return true;
                }
                catch (MatchException matchException) {
                    throw _6_.a(matchException);
                }
            }
            catch (MatchException matchException) {
                throw _6_.a(matchException);
            }
        }
        callSite = _6_.a("\u00e4", (Object)_6_.a("\u00c2", (Object)this, 2850525121206096434L, (long)l2), (Object)_6_.a("\u00e4", string, 2850636550807494652L, (long)l2), 2850724009640406158L, (long)l2);
        return (boolean)callSite;
    }

    public boolean cfr_renamed_1(class_1799 class_17992) {
        long l2 = a ^ 0x7AE48FB94669L;
        return (boolean)_6_.a("\u00e4", (Object)_6_.a("\u00c2", (Object)this, 3527071983749721763L, (long)l2), (Object)class_17992, 3526778128265122943L, (long)l2);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{_6_.class, "3;7;2", "3", "7", "2"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{_6_.class, "3;7;2", "3", "7", "2"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{_6_.class, "3;7;2", "3", "7", "2"}, this, object);
    }

    public String cfr_renamed_2() {
        long l2 = a ^ 0x2986BADCFE99L;
        return _6_.a("\u00c2", (Object)this, -8646780779578602063L, (long)l2);
    }

    public String cfr_renamed_8() {
        long l2 = a ^ 0x2BC6B4C5FE2L;
        return _6_.a("\u00c2", (Object)this, 2988806115763166407L, (long)l2);
    }

    public Predicate cfr_renamed_1() {
        long l2 = a ^ 0x3AE3E1699B91L;
        return _6_.a("\u00c2", (Object)this, -1366018611810749605L, (long)l2);
    }

    static {
        _6_.a();
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
            case 0 -> 63;
            case 1 -> 8;
            case 2 -> 62;
            case 3 -> 58;
            case 4 -> 55;
            case 5 -> 52;
            case 6 -> 23;
            case 7 -> 57;
            case 8 -> 59;
            case 9 -> 19;
            case 10 -> 17;
            case 11 -> 7;
            case 12 -> 53;
            case 13 -> 28;
            case 14 -> 1;
            case 15 -> 6;
            case 16 -> 2;
            case 17 -> 32;
            case 18 -> 48;
            case 19 -> 5;
            case 20 -> 41;
            case 21 -> 51;
            case 22 -> 37;
            case 23 -> 11;
            case 24 -> 47;
            case 25 -> 26;
            case 26 -> 25;
            case 27 -> 36;
            case 28 -> 42;
            case 29 -> 20;
            case 30 -> 61;
            case 31 -> 18;
            case 32 -> 24;
            case 33 -> 13;
            case 34 -> 4;
            case 35 -> 29;
            case 36 -> 33;
            case 37 -> 15;
            case 38 -> 38;
            case 39 -> 0;
            case 40 -> 14;
            case 41 -> 34;
            case 42 -> 44;
            case 43 -> 27;
            case 44 -> 40;
            case 45 -> 21;
            case 46 -> 3;
            case 47 -> 35;
            case 48 -> 39;
            case 49 -> 10;
            case 50 -> 30;
            case 51 -> 12;
            case 52 -> 43;
            case 53 -> 45;
            case 54 -> 56;
            case 55 -> 31;
            case 56 -> 9;
            case 57 -> 54;
            case 58 -> 22;
            case 59 -> 60;
            case 60 -> 49;
            case 61 -> 46;
            case 62 -> 16;
            default -> 50;
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
        _6_.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "=L\u0000p\u0011\u001d Y\u00021\u0014Aov";
        objectArray[1] = "K^[\"@sUVAm\bsO\\Y*\u0001h\u000fo_&\noB^Y&";
        objectArray[2] = "\u0004UT+eW\u000fZEd\u0004Y\u0004QA>";
        objectArray[3] = Boolean.TYPE;
        _6_.c[3] = "java/lang/Boolean";
        objectArray[4] = "H\u0015m\tC1C\u001a|F>)P\u001du\u000f";
        objectArray[5] = "494Ncg?6%\u0001\u000ec?*\u0011J<~;6!J";
        objectArray[6] = "*dHie\u001exb\n\u000b$\"x%\u001egf\u0013;d\u0016s";
        objectArray[7] = "w0\\-\u0010!',\u0007\"!$6\u0002\u00038]4Mu\u0003~\u0018}6\u007f\u0000$\u0018E";
        objectArray[8] = "\u0013'c\u0007G<A!!e\u0003\u0000B!b\b\rd\u0012=9\u0007";
        objectArray[9] = "\f\u0002r)e1\\\u001e)&T)Q9/;9/}\u00143)ToIG%u0?U\u001c*D";
        objectArray[10] = "Fcv%JD\u0005\"~12\t\u0012 gI\bLD6{y\\E\r:\u001bsWKFc`yT\u0011F[";
        objectArray[11] = "\bK#'5\u0015XWx(\u0004\u001aURe#e\u0017I4\",=\u001f\u0002X sg\u00122\u000e|t=II\u0004\u007f.=q";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "&=w\f'Ot;5ngsw;v\u0003m\u0017''-\f";
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _6_.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _6_.b[n] = clazz = Class.forName(c[n]);
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
        Field field = _6_.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _6_.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _6_.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _6_.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _6_.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _6_.a(clazz3, string2, clazz2)) != null) {
                    _6_.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _6_.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _6_.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _6_.b(206207632762686L, 0L);
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
        Method method = _6_.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _6_.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method d(long l2, long l3) {
        int n = _6_.a(l2, l3);
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
                clazz3 = _6_.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _6_.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _6_.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _6_.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _6_.b(206207632762686L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _6_.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _6_.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _6_.b(206207632762686L, 0L);
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
            if (c == '\u00c2' || c == '\u00cf' || c == '\u00e2' || c == '\u00d1') {
                field = _6_.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c2' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00cf' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _6_.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'P' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _6_.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_6_.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

