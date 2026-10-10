/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_11909
 */
package dev.krypton;

import dev.krypton._02;
import dev.krypton._0v;
import dev.krypton._4t;
import dev.krypton._87;
import dev.krypton._8S;
import dev.krypton._95;
import dev.krypton._9t_0;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_11909;

public class _0O
extends _0v {
    private final _9t_0 cfr_renamed_2;
    private static final long a = l.a(1890705128011893182L, -6757353052282206224L, MethodHandles.lookup().lookupClass()).a(262583562370133L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final Object[] i;
    private static final String[] j;

    public _0O(_4t t, _95 var2_2, long l2, int n) {
        long l3 = (l2 = a ^ l2) ^ 0x431CDB97F7F1L;
        int n2 = (int)(l3 >>> 48);
        int n3 = (int)(l3 << 16 >>> 32);
        int n4 = (int)(l3 << 48 >>> 48);
        super((short)n2, t, var2_2, n, n3, (char)n4);
        this.cfr_renamed_2 = (_9t_0)var2_2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        i = new Object[45];
        j = new String[45];
        _0O.b();
        e = new HashMap(13);
        long l2 = a ^ 0x5A30BCCED250L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l2 >>> 56);
        for (int j = 1; j < 8; ++j) {
            byArray2 = byArray2;
            byArray2[j] = (byte)(l2 << j * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[2];
        int n = 0;
        String string = "\u00f2,S?'\u00c1\u00e5q\u0096\u00cd}\u00dd,p\u00a2\u00b9\u0010\u00b6\u00bd\u00b8o+Rf\u0001\u00a0\u00b3\u00cc[\u0003\u00a3\u00d9<";
        int n2 = "\u00f2,S?'\u00c1\u00e5q\u0096\u00cd}\u00dd,p\u00a2\u00b9\u0010\u00b6\u00bd\u00b8o+Rf\u0001\u00a0\u00b3\u00cc[\u0003\u00a3\u00d9<".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = _0O.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                c = stringArray;
                d = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (j[n3] != null) {
            return n3;
        }
        Object object = i[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 58;
            case 1 -> 10;
            case 2 -> 21;
            case 3 -> 56;
            case 4 -> 24;
            case 5 -> 34;
            case 6 -> 1;
            case 7 -> 44;
            case 8 -> 51;
            case 9 -> 33;
            case 10 -> 46;
            case 11 -> 12;
            case 12 -> 63;
            case 13 -> 35;
            case 14 -> 47;
            case 15 -> 49;
            case 16 -> 8;
            case 17 -> 25;
            case 18 -> 37;
            case 19 -> 43;
            case 20 -> 42;
            case 21 -> 57;
            case 22 -> 23;
            case 23 -> 27;
            case 24 -> 61;
            case 25 -> 6;
            case 26 -> 7;
            case 27 -> 30;
            case 28 -> 13;
            case 29 -> 45;
            case 30 -> 32;
            case 31 -> 11;
            case 32 -> 0;
            case 33 -> 19;
            case 34 -> 40;
            case 35 -> 26;
            case 36 -> 5;
            case 37 -> 59;
            case 38 -> 31;
            case 39 -> 39;
            case 40 -> 22;
            case 41 -> 9;
            case 42 -> 29;
            case 43 -> 54;
            case 44 -> 60;
            case 45 -> 17;
            case 46 -> 53;
            case 47 -> 52;
            case 48 -> 3;
            case 49 -> 20;
            case 50 -> 48;
            case 51 -> 2;
            case 52 -> 18;
            case 53 -> 15;
            case 54 -> 14;
            case 55 -> 55;
            case 56 -> 50;
            case 57 -> 4;
            case 58 -> 16;
            case 59 -> 28;
            case 60 -> 41;
            case 61 -> 38;
            case 62 -> 62;
            default -> 36;
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
        _0O.j[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'Z' || c == '\u00de' || c == '\u00da' || c == 'A') {
                field = _0O.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'Z' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00de' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00da' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _0O.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'b' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00eb' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static void b() {
        Object[] objectArray = i;
        i[0] = "5dE\u000f1$(qGN4xaw";
        objectArray[1] = "\u001bG\u0003L\u0002\u0015ng\bC\u0013Z\u000fi\u0003H\u0017\u0000{";
        objectArray[2] = Integer.TYPE;
        _0O.j[2] = "java/lang/Integer";
        objectArray[3] = "qJ!$\u0000Cl_#e\u0005\u001f,\u001a";
        objectArray[4] = "x|2Cq@\r\\9L`\u000flR2GdU\u0018";
        objectArray[5] = "MG\b;'cFH\u0019tZ{UO\u0010=";
        objectArray[6] = "V3w)3\tK&uh6U\u0002\u0019";
        objectArray[7] = "u0,pewh%.1`+(!";
        objectArray[8] = "\u000f\b'\u0013g!z(,\u001cvn\u001b&'\u0017r4o";
        objectArray[9] = "\u000fl\u00058R\u0006\u0011d\u001fw1\u0012\u0015";
        objectArray[10] = "Absc#X\\wq\"&\u0004\u001d0";
        objectArray[11] = "0\u0007  \nwE'+/\u001b8$) $\u001fbP";
        objectArray[12] = Double.TYPE;
        _0O.j[12] = "java/lang/Double";
        objectArray[13] = "\u0016H}kYnchvdH!\u0002f}oL{v";
        objectArray[14] = "z`H1M\u0010guJpHL&G";
        objectArray[15] = "N<t8j5;\u001c\u007f7{zZ\u0012t<\u007f .";
        objectArray[16] = "OU1\u0016C<:u:\u0019Rs[{1\u0012V)/";
        objectArray[17] = "\u000bcT\u0002dN~C_\ru\u0001\u001fMT\u0006q[k";
        objectArray[18] = "m=3zD m=$&H/wv$8H:p\u0007ve\u0010y:";
        objectArray[19] = "\fh^\b#jyHU\u00072%\u0018F^\f6\u007fl";
        objectArray[20] = Boolean.TYPE;
        _0O.j[20] = "java/lang/Boolean";
        objectArray[21] = "RY9d|;OL;%yg\u0004";
        objectArray[22] = "M<v@g>M<a\u001ck1Wwa\u0002k$P\u00061_:";
        objectArray[23] = "\tF=y(l\tF*%$c\u0013\r*;$v\u0014|}dr";
        objectArray[24] = Void.TYPE;
        _0O.j[24] = "java/lang/Void";
        objectArray[25] = "Y'*$\u0019\u0014R(;kx\u001aY#?1";
        objectArray[26] = "B\u0006e\u001f\u0017\n\u0018\u0000}D|\u0017D\u0002g\u0013\u0010%\u0016B=HAr\u0010\u0007m\rM\u0000HO;\u001d|";
        objectArray[27] = ")vm0\u0005\u000fb.k\u0001\u000f\u007f\u007fjoyA\u0013wl=}>Fj{.0L\u001e\"->\u0001";
        objectArray[28] = "Vtjf@t\u0000j+f:1lx/cBs\u0000p)1F\fWm()Yj\u0005sde:";
        objectArray[29] = "kZH\u0016([i\r\u0006\u0005S\u0001WV[^oNh\u0001V\u000b:";
        objectArray[30] = "I6\u0017\f`\u0003\u001e;BY\u0011\u0007t7U\biC\u0018?SZm<J&BL/\u0000\u000e+A\u000b\u0011";
        objectArray[31] = "\u001f\n\u0001MJ,\u0018\u0002G\u001fws \n\u0007M\u000f0L\u0002\u0001\u001f\u000bO\u0010\u0004\u0011\u0011\u0016w[X\u0018\u0005w";
        objectArray[32] = "C.j1L\u0018\bvl\u0000Mh\u00152hx\b\u0004\u001d4:|wQ\u0000#)1\u0005\tHu9\u0000";
        objectArray[33] = "q\b}dX[5\u0005~#f\u001c.\u0007|\u0018_\u001e%\f j\u0007Vs\u001c\u0011";
        objectArray[34] = "\u0013\u0014GPl\rXLAajF)B\u0001_0\u0001\u0014\u0012\u001c\u0001i";
        objectArray[35] = "\u0014\u001bJ\u0018?j_CL)9\u001aB\u0007HQ{vJ\u0001\u001aU\u0004w\u0017\u0006\u001cJggU\u0019L)";
        objectArray[36] = "49n }\u0013\u007fah\u0011xcb%li9\u000fj#>mFZw4- 4\u0002?b=\u0011";
        objectArray[37] = "\u000b]za*FQ[b:AU\u0007@`]}\u0001Q\u0015\u0018:#S\u0004D q\u007fZ\u0010%";
        objectArray[38] = "\u001a\u0001Ph+hQYVY,\u0018\u0019\u001f\u0000 !jAWV0";
        objectArray[39] = "?%\u0017 I1t}\u0011\u0011MAi9\u0015i\r-a?Gmrx|(T \u0000 4~D\u0011";
        objectArray[40] = "Mp6L4pXs8\u0006Y8xO*X2:A\"~Wdj";
        objectArray[41] = "\u000e1uC\u0015lT7m\u0018~\u007f\u0002,o\u007fB+Tx\u0017\u0018\u001cy\u0001(/S@p\u0015I";
        objectArray[42] = "\n\u00111*\u000e9\r\u0019wx3j5\u00117*K%Y\u00191xOZ\u0005\u001f!vRbNC(b3";
        objectArray[43] = "1\tNt:SzQHE;#:\u0012J\"}\u001ej\u000f\u0014{";
        Object[] objectArray2 = objectArray;
        objectArray[44] = "uVX%w$!Y\u000eu\u0015,vLSyy\u001e\"\r\u000b!\u0015& VMwypxTQ\u001ez/#\rXbo;e\u000e3";
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _0O.b(lookup, mutableCallSite, string, methodType, l2, l3);
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0O" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l2, long l3) {
        int n = _0O.e(l2, l3);
        Object object = i[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = j[n];
                int n3 = string2.indexOf(8);
                clazz3 = _0O.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _0O.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _0O.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _0O.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _0O.f(1766253739354129L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _0O.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _0O.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _0O.f(1766253739354129L, 0L);
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
            int n = _0O.e(l2, l3);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                _0O.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _0O.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _0O.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _0O.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _0O.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x3DCC;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l3 = Thread.currentThread().threadId();
                objectArray = (Object[])e.get(l3);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l3, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/0O", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l2 >>> 56);
            for (int j = 1; j < 8; ++j) {
                byArray[j] = (byte)(l2 << j * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            _0O.d[n2] = _0O.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _0O.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0O" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int j = 0; j < n2; ++j) {
            char c;
            int n3 = 0xFF & byArray[j];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++j];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (j >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++j];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++j];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    private static Field g(long l2, long l3) {
        int n = _0O.e(l2, l3);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = _0O.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _0O.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _0O.c(clazz3, string2, clazz2)) != null) {
                    _0O.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _0O.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _0O.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _0O.f(1766253739354129L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public void void_6(Object[] objectArray) {
        class_11909 class_119092;
        _0O o;
        long l2;
        boolean bl;
        block6: {
            class_11909 class_119093;
            block7: {
                class_119093 = (class_11909)objectArray[0];
                bl = (Boolean)objectArray[1];
                long l3 = (Long)objectArray[2];
                long l4 = l3;
                long l5 = l4 ^ 0xA239397A5E5L;
                long l6 = l4 ^ 0x65AAB987009AL;
                l2 = l4 ^ 0L;
                boolean bl2 = _02.cfr_renamed_3();
                try {
                    try {
                        try {
                            o = this;
                            class_119092 = class_119093;
                            if (!bl2) break block6;
                            Object[] objectArray2 = new Object[3];
                            objectArray2[2] = l5;
                            objectArray2[1] = (double)_0O.c("b", (Object)class_119093, 5514111673750752299L, (long)l3);
                            objectArray2[0] = (double)_0O.c("b", (Object)class_119092, 5513843992000144561L, (long)l3);
                            if (_0O.c("b", (Object)o, (Object)objectArray2, 5513731192189885610L, (long)l3) == false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw _0O.a(matchException);
                        }
                        if (_0O.c("b", (Object)class_119093, 5515474122269301561L, (long)l3) != false) break block7;
                    }
                    catch (MatchException matchException) {
                        throw _0O.a(matchException);
                    }
                    _0O.c("b", (Object)_0O.c("\u00da", 5514234986199173197L, (long)l3), (Object)new _8S(l6, this, (_9t_0)((Object)_0O.c("Z", (Object)this, 5515563024608884444L, (long)l3))), 5514462822888942590L, (long)l3);
                }
                catch (MatchException matchException) {
                    throw _0O.a(matchException);
                }
            }
            o = this;
            class_119092 = class_119093;
        }
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l2;
        objectArray3[1] = bl;
        objectArray3[0] = class_119092;
        super.void_6(objectArray3);
    }

    @Override
    protected void void_8(Object[] objectArray) {
        _87 var5_2 = (_87)objectArray[0];
        int n = (Integer)objectArray[1];
        int n2 = (Integer)objectArray[2];
        long l2 = (Long)objectArray[3];
        float f = ((Float)objectArray[4]).floatValue();
        long l3 = l2;
        long l4 = l3 ^ 0x2AF2DB09C70AL;
        long l5 = l3 ^ 0x538DF2D376DEL;
        long l6 = l3 ^ 0x764D0226F048L;
        long l7 = l3 ^ 0x570C24C53811L;
        long l8 = l3 ^ 0xE971B67985DL;
        int n3 = (int)(l8 >>> 32);
        int n4 = (int)(l8 << 32 >>> 32);
        long l9 = l3 ^ 0x7238D2000367L;
        long l10 = l3 ^ 0x4A7C3F174665L;
        long l11 = l3 ^ 0x88823B1F239L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l5;
        reference var24_16 = _0O.c("b", (Object)this, (Object)objectArray2, 7739721582164005870L, (long)l2) + 5;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l10;
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l9;
        reference var25_17 = _0O.c("b", (Object)this, (Object)objectArray3, 7739985199341710397L, (long)l2) + _0O.c("b", (Object)this, (Object)objectArray4, 7739497349767034874L, (long)l2) + _0O.c("Z", (Object)this, 7739871778561969573L, (long)l2) + _0O.c("b", (Object)this, (Object)objectArray5, 7739144022100506522L, (long)l2) / 2;
        reference var26_18 = var25_17 - 4;
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = n4;
        objectArray6[0] = n3;
        CallSite callSite = _0O.c("b", (Object)_0O.c("b", (Object)_0O.c("Z", (Object)this, 7739279064351002928L, (long)l2), (Object)objectArray6, 7739333923537977615L, (long)l2), 7739547011565676409L, (long)l2);
        Object[] objectArray7 = new Object[1];
        objectArray7[0] = l11;
        String string = (String)((Object)_0O.c("b", (Object)_0O.c("Z", (Object)this, 7739279064351002928L, (long)l2), (Object)objectArray7, 7739187601338276690L, (long)l2)) + (String)((Object)_0O.a("y", 4458, (long)(0x176A0447C89347C7L ^ l2)));
        Object[] objectArray8 = new Object[5];
        objectArray8[4] = _0O.c("\u00da", 7740265221464794591L, (long)l2);
        objectArray8[3] = (double)var26_18;
        objectArray8[2] = (double)var24_16;
        objectArray8[1] = string;
        objectArray8[0] = l7;
        _0O.c("b", (Object)var5_2, (Object)objectArray8, 7739366670839888269L, (long)l2);
        Object[] objectArray9 = new Object[2];
        objectArray9[1] = l6;
        objectArray9[0] = string;
        double d = (double)var24_16 + _0O.c("b", (Object)var5_2, (Object)objectArray9, 7740161716933903240L, (long)l2);
        Object[] objectArray10 = new Object[5];
        objectArray10[4] = _0O.c("Z", (Object)this, 7739632956158726760L, (long)l2);
        objectArray10[3] = (double)var26_18;
        objectArray10[2] = d;
        objectArray10[1] = (int)callSite + (String)((Object)_0O.a("y", 13329, (long)(0x6FCB63F1AEF662BDL ^ l2)));
        objectArray10[0] = l7;
        _0O.c("b", (Object)var5_2, (Object)objectArray10, 7739366670839888269L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_0O.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(_0O.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

