/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_11280$class_11281
 */
package dev.krypton;

import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import net.minecraft.class_11280;

/*
 * Renamed from dev.krypton.0f
 */
public class _0f_0
implements class_11280.class_11281 {
    float cfr_renamed_0;
    float cfr_renamed_7;
    float cfr_renamed_9;
    float cfr_renamed_3;
    float cfr_renamed_8;
    float cfr_renamed_1;
    float cfr_renamed_2;
    float cfr_renamed_5;
    float cfr_renamed_258;
    float cfr_renamed_6;
    float cfr_renamed_4;
    private static final long a = l.a(6716393623937126230L, 7849529792804322470L, MethodHandles.lookup().lookupClass()).a(156730156114507L);
    private static final Object[] b = new Object[18];
    private static final String[] c = new String[18];

    public void method_71104(ByteBuffer byteBuffer) {
        long l2 = a ^ 0x6791A5CE0DD4L;
        _0f_0.a("x", (Object)_0f_0.a("x", (Object)_0f_0.a("x", (Object)_0f_0.a("G", (Object)byteBuffer, 8199930678457871106L, (long)l2), (float)_0f_0.a("L", (Object)this, 8200133533702529942L, (long)l2), (float)_0f_0.a("L", (Object)this, 8200925976755269877L, (long)l2), (float)_0f_0.a("L", (Object)this, 8200419272092382005L, (long)l2), (float)_0f_0.a("L", (Object)this, 8200220676623992221L, (long)l2), 8200332641055605012L, (long)l2), (float)_0f_0.a("L", (Object)this, 8200457559662191709L, (long)l2), (float)_0f_0.a("L", (Object)this, 8200181151791795537L, (long)l2), (float)_0f_0.a("L", (Object)this, 8199441605808282913L, (long)l2), (float)_0f_0.a("L", (Object)this, 8200011239365366736L, (long)l2), 8200332641055605012L, (long)l2), (float)_0f_0.a("L", (Object)this, 8200986380437527168L, (long)l2), (float)_0f_0.a("L", (Object)this, 8200875863424177882L, (long)l2), (float)_0f_0.a("L", (Object)this, 8199369536047432290L, (long)l2), 0.0f, 8200332641055605012L, (long)l2);
    }

    private _0f_0() {
    }

    static {
        _0f_0.a();
    }

    public boolean equals(Object object) {
        return false;
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _0f_0.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _0f_0.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _0f_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _0f_0.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _0f_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _0f_0.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _0f_0.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _0f_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _0f_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _0f_0.a(clazz3, string2, clazz2)) != null) {
                    _0f_0.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _0f_0.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _0f_0.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _0f_0.b(312994403683513L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _0f_0.a(l2, l3);
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
                clazz3 = _0f_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _0f_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _0f_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _0f_0.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _0f_0.b(312994403683513L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _0f_0.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _0f_0.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _0f_0.b(312994403683513L, 0L);
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _0f_0.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'L' || c == '\u00ca' || c == '\u00e3' || c == 'p') {
                field = _0f_0.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'L' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ca' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _0f_0.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'x' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'G' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            throw new RuntimeException("dev/krypton/0f" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "\rB9<\u0005f\u0010W;}\u0000:YA";
        objectArray[1] = Float.TYPE;
        _0f_0.c[1] = "java/lang/Float";
        objectArray[2] = "}\u0003(d\u000bdt\r+-Hir\r?/Uo0\u000e0,\u0000nl\u001fk\u0019\u0012o/Xu\b\u0013br\b 8";
        objectArray[3] = "T'7\u000e*#W)o-}9[\u00044\tb(L";
        objectArray[4] = "<\r4^t\u00167\u0002%\u0011\u0015\u0018<\t!K";
        objectArray[5] = "\u001a\u000f\u0000\u0012RA\u0010\u0019F\"\u0000qBOVCV\u0000JOK]";
        objectArray[6] = "\u00190U\u001f\u0014\u0016\u0013&\u0013/A&Ap\u0003N\u0010WIp\u001eP";
        objectArray[7] = "\u0013I\u001dRP\u0011\u0019_[b\u0002\u001br\u0001\u0017\u000fXL\u0003\t\u0017\u0012F";
        objectArray[8] = "B\u0017m\u000bzJ\u0001\u0015&K\u0003K\u001eS:1~D\u0016B'{9O\u0002\u0011d\u000byJH\u0015]A;\u001a\bV=\u00029QH/";
        objectArray[9] = "(\u0016[{rU\"\u0000\u001dK\"epV\r*v\u0014xV\u00104";
        objectArray[10] = "\u000f;\u0012sAl\u0005-TC\u0018\\W{D\"E-_{Y<";
        objectArray[11] = "kO>\u0003\u0019&aYx3A\u00163\u000fhR\u001dg;\u000fuL";
        objectArray[12] = "\t5\u0003\t'\t\u0003#E9t9QuUX#HYuHF";
        objectArray[13] = "!]/(]Mb_dh$Uf\u0019A5O\u0011\u001b\\.5E@jT.([-\"Tr9I\\*To'$\u0014*\b~5U\u001c*\u0015`X\u001d\u001cv\u0004r)\u0015\u001ck\u001a\u001fb\u001c\u001dk\u001c\u007f!\u001eV+e";
        objectArray[14] = "a3R^\u0016Uk%\u0014n@e9s\u0004\u000f\u0012\u00141s\u0019\u0011";
        objectArray[15] = "hL?\u000f\u0011`bZy?EP0\fi^\u0015!8\ft@";
        objectArray[16] = "M\u00046>\\:G\u0012p\u000e\r\n\u0015D`oX{\u001dD}q";
        Object[] objectArray2 = objectArray;
        objectArray[17] = "[$r\u0018.]Q24(ym\u0003d$I*\u001c\u000bd9W";
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
            case 0 -> 22;
            case 1 -> 39;
            case 2 -> 12;
            case 3 -> 17;
            case 4 -> 58;
            case 5 -> 54;
            case 6 -> 44;
            case 7 -> 63;
            case 8 -> 60;
            case 9 -> 15;
            case 10 -> 35;
            case 11 -> 61;
            case 12 -> 42;
            case 13 -> 6;
            case 14 -> 34;
            case 15 -> 31;
            case 16 -> 2;
            case 17 -> 16;
            case 18 -> 0;
            case 19 -> 47;
            case 20 -> 57;
            case 21 -> 56;
            case 22 -> 38;
            case 23 -> 53;
            case 24 -> 62;
            case 25 -> 46;
            case 26 -> 3;
            case 27 -> 27;
            case 28 -> 23;
            case 29 -> 10;
            case 30 -> 49;
            case 31 -> 32;
            case 32 -> 8;
            case 33 -> 21;
            case 34 -> 4;
            case 35 -> 14;
            case 36 -> 29;
            case 37 -> 43;
            case 38 -> 28;
            case 39 -> 55;
            case 40 -> 30;
            case 41 -> 36;
            case 42 -> 7;
            case 43 -> 41;
            case 44 -> 51;
            case 45 -> 18;
            case 46 -> 13;
            case 47 -> 24;
            case 48 -> 33;
            case 49 -> 40;
            case 50 -> 25;
            case 51 -> 11;
            case 52 -> 59;
            case 53 -> 1;
            case 54 -> 45;
            case 55 -> 48;
            case 56 -> 50;
            case 57 -> 26;
            case 58 -> 5;
            case 59 -> 52;
            case 60 -> 37;
            case 61 -> 9;
            case 62 -> 20;
            default -> 19;
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
        _0f_0.c[n3] = new String(cArray);
        return n3;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_0f_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

