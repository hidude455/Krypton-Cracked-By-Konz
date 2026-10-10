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
import dev.krypton._8a_0;
import dev.krypton._95;
import dev.krypton._97;
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

public class _0c
extends _0v {
    private final _97 cfr_renamed_4;
    private static final long a = l.a(3479379051289904870L, -6939594254707491918L, MethodHandles.lookup().lookupClass()).a(90811440274925L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final Object[] i;
    private static final String[] j;

    public _0c(_4t t, long l2, _95 var4_3, int n) {
        long l3 = (l2 = a ^ l2) ^ 0x4FB929D75502L;
        int n2 = (int)(l3 >>> 48);
        int n3 = (int)(l3 << 16 >>> 32);
        int n4 = (int)(l3 << 48 >>> 48);
        super((short)n2, t, var4_3, n, n3, (char)n4);
        this.cfr_renamed_4 = (_97)var4_3;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        i = new Object[42];
        j = new String[42];
        _0c.b();
        e = new HashMap(13);
        long l2 = a ^ 0x66E2AA860951L;
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
        String string = "\u00ef\u009f\u00bf\u00ac\u00d0\u0012c\u00a8\u0094\u00c0\u008eB1\u00a0\u0005\u0097\u0010\u00dbS\u0085D{\u00e6\u00b3\u00fb\u00b8\u0093\u00ec\u00eae\u00c6s\u0002";
        int n2 = "\u00ef\u009f\u00bf\u00ac\u00d0\u0012c\u00a8\u0094\u00c0\u008eB1\u00a0\u0005\u0097\u0010\u00dbS\u0085D{\u00e6\u00b3\u00fb\u00b8\u0093\u00ec\u00eae\u00c6s\u0002".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = _0c.a(byArray3).intern();
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
            case 0 -> 48;
            case 1 -> 1;
            case 2 -> 50;
            case 3 -> 18;
            case 4 -> 5;
            case 5 -> 9;
            case 6 -> 21;
            case 7 -> 58;
            case 8 -> 15;
            case 9 -> 59;
            case 10 -> 52;
            case 11 -> 45;
            case 12 -> 60;
            case 13 -> 13;
            case 14 -> 16;
            case 15 -> 49;
            case 16 -> 12;
            case 17 -> 26;
            case 18 -> 61;
            case 19 -> 44;
            case 20 -> 3;
            case 21 -> 33;
            case 22 -> 8;
            case 23 -> 10;
            case 24 -> 57;
            case 25 -> 6;
            case 26 -> 40;
            case 27 -> 39;
            case 28 -> 29;
            case 29 -> 25;
            case 30 -> 46;
            case 31 -> 27;
            case 32 -> 42;
            case 33 -> 23;
            case 34 -> 28;
            case 35 -> 55;
            case 36 -> 35;
            case 37 -> 7;
            case 38 -> 63;
            case 39 -> 41;
            case 40 -> 51;
            case 41 -> 4;
            case 42 -> 0;
            case 43 -> 53;
            case 44 -> 43;
            case 45 -> 24;
            case 46 -> 20;
            case 47 -> 37;
            case 48 -> 14;
            case 49 -> 19;
            case 50 -> 36;
            case 51 -> 38;
            case 52 -> 11;
            case 53 -> 17;
            case 54 -> 31;
            case 55 -> 32;
            case 56 -> 62;
            case 57 -> 30;
            case 58 -> 34;
            case 59 -> 54;
            case 60 -> 2;
            case 61 -> 56;
            case 62 -> 47;
            default -> 22;
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
        _0c.j[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'Y' || c == 'a' || c == '\u00c2' || c == '\u00a5') {
                field = _0c.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'Y' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'a' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _0c.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fe' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'i' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        i[0] = "oNHA\u000e;r[J\u0000\u000bg;]";
        objectArray[1] = "^V\u000b\u000e<r+v\u0000\u0001-=Jx\u000b\n)g>";
        objectArray[2] = Integer.TYPE;
        _0c.j[2] = "java/lang/Integer";
        objectArray[3] = "\"XBUd:?M@\u0014af\u007f\b";
        objectArray[4] = "\u0006\u0004\u000b\rH\"s$\u0000\u0002Ym\u0012*\u000b\t]7f";
        objectArray[5] = "cLrB\u0000mhCc\r}u{DjD";
        objectArray[6] = "74k m5*!iahijf";
        objectArray[7] = ";S\fv<ZNs\u0007y-\u0015/}\fr)O[";
        objectArray[8] = "\u000f\u0005Fx^*\u0011\r\\7=>\u0015";
        objectArray[9] = "ypA S\u0011deCaVM%\"";
        objectArray[10] = "\u0010hJ~\u0016ZeHAq\u0007\u0015\u0004FJz\u0003Op";
        objectArray[11] = Double.TYPE;
        _0c.j[11] = "java/lang/Double";
        objectArray[12] = "\u0011*\tmaud\n\u0002bp:\u0005\u0004\tit`q";
        objectArray[13] = "Rz\u001ayGNOo\u00188B\u0012\u0006|";
        objectArray[14] = "QB\t\u0004\\\u0019$b\u0002\u000bMVEl\t\u0000I\f1";
        objectArray[15] = "\"\fJ]p\rW,ARaB6\"JYe\u0018B";
        objectArray[16] = "@?1\u0016iV]*3Wl\n\u001c\u0018";
        objectArray[17] = "\n\r-Ben\n\r:\u001eia\u0010F:\u0000it\u00177h]17]";
        objectArray[18] = "V1 \u0015\\v#\u0011+\u001aM9B\u001f \u0011Ic6";
        objectArray[19] = Boolean.TYPE;
        _0c.j[19] = "java/lang/Boolean";
        objectArray[20] = "] #\u0017-O@5!V(\u0013\u000b";
        objectArray[21] = ">\u001b.\u0019n2>\u001b9Eb=$P9[b(#!i\u00063";
        objectArray[22] = "=T\u0010rvt=T\u0007.z{'\u001f\u00070zn nPo,";
        objectArray[23] = Void.TYPE;
        _0c.j[23] = "java/lang/Void";
        objectArray[24] = "\u001eh[\u0012o`\u0015gJ]\u000en\u001elN\u0007";
        objectArray[25] = "#bd[G[%e|\u0011$\u0001$a{MH3v!!\u0016\u0019dp|yMD\u0016we H$";
        objectArray[26] = ">vhS`w(~8)l\u0015?r7\u00108edkfK],5n`I/+,7e)";
        objectArray[27] = "]CL)Kc\b^_-&7gM\\'\u001fo\u0017\u0016EvD\n\\GZtIdXLHi&";
        objectArray[28] = "bw\u007f\u0000\u0007`3}s\u001b8&^y0I\u0001x.\")\u0018Z\u001dci)\u000b]t,y)I8";
        objectArray[29] = "C~tR`\u0007\u0014nk\u0013\tI}~r\u001b0\u0010\r%kJkuBnnZq\u000b\u0006,<A\t";
        objectArray[30] = "-dUP[o;l\u0005*\\\r,`\n\u0013\u0003}wy[Hf4&|]J\u00143?%X*";
        objectArray[31] = "P\u001b\u0006\u0014cF\u001f\u000b\u0006V\u0006T\f\u0012\ff?N\u000f\u0007\u0001\u00148WV\u0002a";
        objectArray[32] = "hsNU\u0014\u0003~{\u001e/\u0014aiw\u0011\u0016L\u00112n@M)\rhrQ\u0015O\nlc]/";
        objectArray[33] = "5\n\u001a\u0015\"7t\u0002\u001b\u0006G?\u0004\u000fE\\>8y^OP%";
        objectArray[34] = "<7\r?]\u0012*?]E^p=3R|\u0005\u0000f*\u0003'`I7/\u0005%\u0012N.v\u0000E";
        objectArray[35] = "'L #MU!K8i.\u0001*V'\u0005\u0012U|\u0003_mU\b<K!)\u0017Z'3";
        objectArray[36] = "qC\u0000A\u0015\rgKP;\u0014o\"X\r\\H\u001d%ATY";
        objectArray[37] = "x)&XT_n!v\"V=y-y\u001b\fM\"4(@i\u0004s1.B\u001b\u0003jh+\"";
        objectArray[38] = ":DT\u001cf?=\u0015\u0016\u0015\u0007{\ft\n\u001dfr.N\u0000_8+";
        objectArray[39] = "l\u0018>\u000e(yj\u001f&DK-a\u00029(wy7VA@0$w\u001f?\u0004rvlg";
        objectArray[40] = "rO# %\u0014dGsZ\"vr\tp7z\u001f%\\%1";
        Object[] objectArray2 = objectArray;
        objectArray[41] = "Ie\u001cM*QC'B\u0014S\u000eJ)\u001d\u001a?<\u001ehEBS\u0005Ke\u001f\u0012/W[6\u0005}<[V,\u0016\u0018<ZI;}";
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _0c.b(lookup, mutableCallSite, string, methodType, l2, l3);
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
            throw new RuntimeException("dev/krypton/0c" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l2, long l3) {
        int n = _0c.e(l2, l3);
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
                clazz3 = _0c.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _0c.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _0c.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _0c.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _0c.f(1690102307289276L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _0c.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _0c.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _0c.f(1690102307289276L, 0L);
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
            int n = _0c.e(l2, l3);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                _0c.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _0c.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _0c.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _0c.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _0c.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x513;
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
                throw new RuntimeException("dev/krypton/0c", exception);
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
            _0c.d[n2] = _0c.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _0c.a(n, l2);
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
            throw new RuntimeException("dev/krypton/0c" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = _0c.e(l2, l3);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = _0c.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _0c.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _0c.c(clazz3, string2, clazz2)) != null) {
                    _0c.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _0c.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _0c.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _0c.f(1690102307289276L, 0L);
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
        _0c c;
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
                long l6 = l4 ^ 0x14A8A1EF2404L;
                int n = (int)(l6 >>> 32);
                int n2 = (int)(l6 << 32 >>> 48);
                int n3 = (int)(l6 << 48 >>> 48);
                l2 = l4 ^ 0L;
                boolean bl2 = _02.cfr_renamed_2();
                try {
                    try {
                        try {
                            c = this;
                            class_119092 = class_119093;
                            if (bl2) break block6;
                            Object[] objectArray2 = new Object[3];
                            objectArray2[2] = l5;
                            objectArray2[1] = (double)_0c.c("\u00fe", (Object)class_119093, 5514021400103499896L, (long)l3);
                            objectArray2[0] = (double)_0c.c("\u00fe", (Object)class_119092, 5513742679312525956L, (long)l3);
                            if (_0c.c("\u00fe", (Object)c, (Object)objectArray2, 5513668732462503287L, (long)l3) == false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw _0c.a(matchException);
                        }
                        if (_0c.c("\u00fe", (Object)class_119093, 5515264182601492993L, (long)l3) != false) break block7;
                    }
                    catch (MatchException matchException) {
                        throw _0c.a(matchException);
                    }
                    _0c.c("\u00fe", (Object)_0c.c("\u00c2", 5514073751547203839L, (long)l3), (Object)new _8a_0(n, n2, (char)n3, (_97)((Object)_0c.c("Y", (Object)this, 5513580405907693589L, (long)l3))), 5514106297237997597L, (long)l3);
                }
                catch (MatchException matchException) {
                    throw _0c.a(matchException);
                }
            }
            c = this;
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
        _87 var6_2 = (_87)objectArray[0];
        int n = (Integer)objectArray[1];
        int n2 = (Integer)objectArray[2];
        long l2 = (Long)objectArray[3];
        float f = ((Float)objectArray[4]).floatValue();
        long l3 = l2;
        long l4 = l3 ^ 0x2AF2DB09C70AL;
        long l5 = l3 ^ 0x538DF2D376DEL;
        long l6 = l3 ^ 0x570C24C53811L;
        long l7 = l3 ^ 0x7238D2000367L;
        long l8 = l3 ^ 0x4A7C3F174665L;
        long l9 = l3 ^ 0x2A5D4FED087FL;
        long l10 = l3 ^ 0x88823B1F239L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l5;
        reference var22_14 = _0c.c("\u00fe", (Object)this, (Object)objectArray2, 7739578071027100528L, (long)l2) + 5;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l8;
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l7;
        reference var23_15 = _0c.c("\u00fe", (Object)this, (Object)objectArray3, 7739809296083081435L, (long)l2) + _0c.c("\u00fe", (Object)this, (Object)objectArray4, 7739324559162456794L, (long)l2) + _0c.c("Y", (Object)this, 7739783018991137305L, (long)l2) + _0c.c("\u00fe", (Object)this, (Object)objectArray5, 7739033034540255169L, (long)l2) / 2;
        reference var24_16 = var23_15 - 4;
        Object[] objectArray6 = new Object[1];
        objectArray6[0] = l9;
        CallSite callSite = _0c.c("\u00fe", (Object)_0c.c("\u00fe", (Object)_0c.c("Y", (Object)this, 7739552775850919929L, (long)l2), (Object)objectArray6, 7739223543399356967L, (long)l2), 7739394538187868477L, (long)l2);
        Object[] objectArray7 = new Object[1];
        objectArray7[0] = l10;
        String string = (String)((Object)_0c.c("\u00fe", (Object)_0c.c("Y", (Object)this, 7739552775850919929L, (long)l2), (Object)objectArray7, 7739152384880837190L, (long)l2)) + (String)((Object)_0c.a("f", 32304, (long)(0x5DEB3BEA90619042L ^ l2))) + (int)callSite + (String)((Object)_0c.a("f", 19704, (long)(0x5EC30C262310A28BL ^ l2)));
        Object[] objectArray8 = new Object[5];
        objectArray8[4] = _0c.c("\u00c2", 7740004328272022874L, (long)l2);
        objectArray8[3] = (double)var24_16;
        objectArray8[2] = (double)var22_14;
        objectArray8[1] = string;
        objectArray8[0] = l6;
        _0c.c("\u00fe", (Object)var6_2, (Object)objectArray8, 7739284779482983913L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_0c.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_0c.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

