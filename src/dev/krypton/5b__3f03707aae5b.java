/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 */
package dev.krypton;

import dev.krypton._3i_0;
import dev.krypton._4r;
import dev.krypton._6x_0;
import dev.krypton._7C;
import dev.krypton._9o;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _5b
extends _6x_0 {
    private static final long b = l.a(7751576118726177511L, -8483982322678846376L, MethodHandles.lookup().lookupClass()).a(230980290501054L);
    private static final long d;
    private static final Object[] e;
    private static final String[] f;

    @_3i_0
    public void cfr_renamed_5(_9o o) {
        block9: {
            CallSite callSite;
            long l2;
            block8: {
                CallSite callSite2;
                block6: {
                    int n;
                    block7: {
                        l2 = b ^ 0x23FF058F5476L;
                        n = _7C.cfr_renamed_9();
                        try {
                            callSite2 = _5b.a("Q", (Object)_5b.a("Q", (Object)this, -5724346870387860714L, (long)l2), -5726246301631135976L, (long)l2);
                            if (n == 0) break block6;
                            if (callSite2 != null) break block7;
                        }
                        catch (MatchException matchException) {
                            throw _5b.a(matchException);
                        }
                        return;
                    }
                    try {
                        callSite = _5b.a("Q", (Object)this, -5724346870387860714L, (long)l2);
                        if (n == 0) break block8;
                        callSite2 = _5b.a("Q", (Object)callSite, -5726246301631135976L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw _5b.a(matchException);
                    }
                }
                try {
                    if (!(_5b.a("Q", (Object)callSite2, -5725899645166440486L, (long)l2) > 0.0f)) break block9;
                    callSite = _5b.a("Q", (Object)this, -5724346870387860714L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _5b.a(matchException);
                }
            }
            _5b.a("G", (Object)_5b.a("Q", (Object)_5b.a("Q", (Object)callSite, -5726123682931292967L, (long)l2), -5726276431927747334L, (long)l2), (boolean)true, -5725828736623252578L, (long)l2);
        }
    }

    public _5b(char c, int n, char c2) {
        long l2 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)c2 << 48 >>> 48) ^ b;
        long l3 = l2 ^ 0x2E48644C8CC2L;
        super((int)d, -1, (_4r)((Object)_5b.a("\u00f2", 2732241822109871368L, (long)l2)), l3);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new Object[17];
        f = new String[17];
        _5b.b();
        long l2 = b ^ 0x497222F5CF37L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l2 >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l3 = -6448431250244753594L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
                d = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l2 << n * 8 >>> 56);
            ++n;
        }
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (f[n3] != null) {
            return n3;
        }
        Object object = e[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 19;
            case 1 -> 14;
            case 2 -> 23;
            case 3 -> 27;
            case 4 -> 54;
            case 5 -> 44;
            case 6 -> 40;
            case 7 -> 42;
            case 8 -> 58;
            case 9 -> 51;
            case 10 -> 61;
            case 11 -> 20;
            case 12 -> 0;
            case 13 -> 12;
            case 14 -> 62;
            case 15 -> 5;
            case 16 -> 29;
            case 17 -> 46;
            case 18 -> 43;
            case 19 -> 49;
            case 20 -> 36;
            case 21 -> 57;
            case 22 -> 28;
            case 23 -> 11;
            case 24 -> 39;
            case 25 -> 47;
            case 26 -> 24;
            case 27 -> 2;
            case 28 -> 1;
            case 29 -> 6;
            case 30 -> 25;
            case 31 -> 4;
            case 32 -> 38;
            case 33 -> 33;
            case 34 -> 30;
            case 35 -> 9;
            case 36 -> 3;
            case 37 -> 53;
            case 38 -> 48;
            case 39 -> 41;
            case 40 -> 34;
            case 41 -> 35;
            case 42 -> 37;
            case 43 -> 21;
            case 44 -> 15;
            case 45 -> 59;
            case 46 -> 10;
            case 47 -> 17;
            case 48 -> 63;
            case 49 -> 45;
            case 50 -> 13;
            case 51 -> 18;
            case 52 -> 52;
            case 53 -> 60;
            case 54 -> 26;
            case 55 -> 50;
            case 56 -> 31;
            case 57 -> 7;
            case 58 -> 16;
            case 59 -> 22;
            case 60 -> 32;
            case 61 -> 55;
            case 62 -> 56;
            default -> 8;
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
        _5b.f[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = e;
        e[0] = "86u[\u001a3%#w\u001a\u001foh!";
        objectArray[1] = "o4<0\u0002]o4+l\u000eRu\u007f+r\u000eGr\u000e\u007f*Y";
        objectArray[2] = Float.TYPE;
        _5b.f[2] = "java/lang/Float";
        objectArray[3] = "A\u0013=-.;A\u0013*q\"4[X*o\"!\\)z2v";
        objectArray[4] = "\u0015\u001fyJ~m\u0015\u001fn\u0016rb\u000fTn\brw\b%>T'";
        objectArray[5] = "\u00161~S\u000b\u001b\u00161i\u000f\u0007\u0014\fzi\u0011\u0007\u0001\u000b\u000b9LV";
        objectArray[6] = "o0/%c\u0004r%-dfX=-";
        objectArray[7] = Boolean.TYPE;
        _5b.f[7] = "java/lang/Boolean";
        objectArray[8] = Void.TYPE;
        _5b.f[8] = "java/lang/Void";
        objectArray[9] = "\\\u0019\u0005$>uW\u0016\u0014k_{\\\u001d\u00101";
        objectArray[10] = "a\u000ei~L*'[>x=.9\b`{j~bX<\u0017\u0004$(]zgG'=\u0003";
        objectArray[11] = "d-\u0018\u001a@0')\u0000\u000e,n2m\u0007\u0014@\\e*[C\u0015\u000bbpV\u001d\u001dg:\u007f\\\u0018,6 |\u001d\u0017\u0015n3(\u0002s";
        objectArray[12] = "v.\"_\u0017V3$j\f-X-.6\\z\u000f|}m0\u0016\n3*>\u000bU\u000e+>";
        objectArray[13] = "p\n\t,:D([\u00079\n\u0010*\b\u001f/]Gt_GC3\u0015&\f\n)u@q\n";
        objectArray[14] = "qs\u001b-aq)\"\u00158Q%+q\r.\u0006rt-QBk&:sS\".,r ";
        objectArray[15] = "X)mD;4Yko D\u00109\u001f\u001d\u001a|!\u0006nx\u001b>#";
        Object[] objectArray2 = objectArray;
        objectArray[16] = "\nt\u001e^7eR)]\u0002L;6)NO#2\fq\u001fA6";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'Q' || c == 'z' || c == '\u00f2' || c == 'u') {
                field = _5b.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'Q' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'z' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5b.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'G' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00cd' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _5b.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method h(long l2, long l3) {
        int n = _5b.e(l2, l3);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = _5b.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5b.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5b.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5b.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5b.f(666339477032356L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5b.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5b.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5b.f(666339477032356L, 0L);
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
            int n = _5b.e(l2, l3);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                _5b.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5b.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5b.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5b.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5b.d(classArray[j], string, clazz2);
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
            throw new RuntimeException("dev/krypton/5b" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field g(long l2, long l3) {
        int n = _5b.e(l2, l3);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = _5b.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5b.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5b.c(clazz3, string2, clazz2)) != null) {
                    _5b.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5b.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5b.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5b.f(666339477032356L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5b.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

