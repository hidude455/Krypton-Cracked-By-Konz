/*
 * Decompiled with CFR 0.152.
 */
package dev.krypton;

import dev.krypton._0A;
import dev.krypton._0j;
import dev.krypton._4w;
import dev.krypton._80;
import dev.krypton.l;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _0H {
    public static final String[] cfr_renamed_1;
    public static final List cfr_renamed_7;
    public static String cfr_renamed_2;
    public static _0j cfr_renamed_0;
    public static _0A cfr_renamed_3;
    private static boolean cfr_renamed_8;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final Object[] e;
    private static final String[] f;

    private _0H() {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = l.a(5792741081432079298L, -7479686966891801528L, MethodHandles.lookup().lookupClass()).a(247326307890625L);
        long l2 = a ^ 0x24BB989FFD76L;
        e = new Object[61];
        f = new String[61];
        _0H.a();
        d = new HashMap(13);
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
        String[] stringArray = new String[3];
        int n = 0;
        String string = "g\u00af\u009fV\u00e5\u0017\u00ebY\tw\u00b0\u0019 \fl\u0081\u00ff_\u00d88\u00c2\u0019]\u00e6\u00f3\u00be9W\r\u0013y\u00b95\u0010%\u00b6\r\u00ae{\u00038\u0099\u00e0\u0081X\u007f\u00d7\u009bT1\u00c2\u00ad$\u008f\u00b2\u0081\u000emf\u0094\u00e3\u00fe\b\u00f1\u00d7z\u0096\u0093\u00bb\u00f0\u00f9yz \u00a3\\\u0007\u00d4\u00b9\u0011S}E*\u0001\u008a\u009e\u00b3\u0015w\b\u00040\u00f8\u0014\u0085\u00bb\u0010\u00fc\u00af\u00d1\u00c9\u00d9\u00bf\u00da\u00bd\u00cd\u0016q\u0086:\t\u00d9\u009b";
        int n2 = "g\u00af\u009fV\u00e5\u0017\u00ebY\tw\u00b0\u0019 \fl\u0081\u00ff_\u00d88\u00c2\u0019]\u00e6\u00f3\u00be9W\r\u0013y\u00b95\u0010%\u00b6\r\u00ae{\u00038\u0099\u00e0\u0081X\u007f\u00d7\u009bT1\u00c2\u00ad$\u008f\u00b2\u0081\u000emf\u0094\u00e3\u00fe\b\u00f1\u00d7z\u0096\u0093\u00bb\u00f0\u00f9yz \u00a3\\\u0007\u00d4\u00b9\u0011S}E*\u0001\u008a\u009e\u00b3\u0015w\b\u00040\u00f8\u0014\u0085\u00bb\u0010\u00fc\u00af\u00d1\u00c9\u00d9\u00bf\u00da\u00bd\u00cd\u0016q\u0086:\t\u00d9\u009b".length();
        int n3 = 40;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = _0H.a(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        b = stringArray;
        c = new String[3];
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l2 >>> 56);
        int n6 = 1;
        while (true) {
            if (n6 >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l3 = -7904390483707916773L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
                long l4 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                cfr_renamed_1 = new String[]{_0H.a("o", 23542, (long)(0x1F288682F5826359L ^ l2))};
                cfr_renamed_7 = new ArrayList();
                _0H.b("\u00d0", (boolean)l4, 7030427392625668591L, (long)l2);
                return;
            }
            byArray5 = byArray5;
            byArray5[n6] = (byte)(l2 << n6 * 8 >>> 56);
            ++n6;
        }
    }

    public static void cfr_renamed_1(Object[] objectArray) {
        block7: {
            long l2 = (Long)objectArray[0];
            long l3 = l2 = a ^ l2;
            long l4 = l3 ^ 0x530CDE3D5E30L;
            long l5 = l3 ^ 0x11D9534AA32L;
            long l6 = l3 ^ 0x59C29DC1FCF1L;
            long l7 = l3 ^ 0x6F0F1BF7A573L;
            long l8 = l3 ^ 0x7AA099EA24BCL;
            long l9 = l3 ^ 0x192D8CE26D1AL;
            long l10 = l3 ^ 0x7AAC8F0DB748L;
            _0H.b("\u00c8", (Object)_0H.b("\u00ff", 5512985551081801272L, (long)l2), 5513324111817223091L, (long)l2);
            CallSite callSite = _0H.b("\u00ff", 5513510612832411703L, (long)l2);
            _4w[] wArray = _0j.cfr_renamed_1();
            for (CallSite callSite2 : callSite) {
                Object[] objectArray2 = new Object[3];
                objectArray2[2] = l5;
                objectArray2[1] = callSite2;
                objectArray2[0] = _0H.b("\u00ff", 5512985551081801272L, (long)l2);
                _0H.b("X", (Object)objectArray2, 5513703789359365750L, (long)l2);
                if (wArray != null) continue;
            }
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l9;
            callSite = _0H.b("\u00c8", (Object)_0H.b("X", (Object)objectArray3, 5513562610085193252L, (long)l2), 5514072462521666905L, (long)l2);
            block3: while (_0H.b("\u00c8", (Object)callSite, 5512849581655147561L, (long)l2) != false) {
                String string = (String)((Object)_0H.b("\u00c8", (Object)callSite, 5513864279168727289L, (long)l2));
                try {
                    Object[] objectArray4 = new Object[4];
                    objectArray4[3] = _0H.b("\u00ff", 5513510612832411703L, (long)l2);
                    objectArray4[2] = new File(string);
                    objectArray4[1] = l6;
                    objectArray4[0] = _0H.b("\u00ff", 5512985551081801272L, (long)l2);
                    _0H.b("X", (Object)objectArray4, 5513796831534703354L, (long)l2);
                    do {
                        _4w[] wArray2 = wArray;
                        if (l2 > 0L) {
                            if (wArray2 == null) break block7;
                            wArray2 = wArray;
                        }
                        if (wArray2 != null) continue block3;
                    } while (l2 < 0L);
                    break;
                }
                catch (RuntimeException runtimeException) {
                    throw _0H.a(runtimeException);
                }
            }
            _0H.b("\u00c8", (Object)_0H.b("\u00ff", 5512985551081801272L, (long)l2), (Object)_0H.b("X", _80::cfr_renamed_6, 5515496408215691391L, (long)l2), 5512910005647764585L, (long)l2);
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = _0H.b("\u00ff", 5513510612832411703L, (long)l2)[0];
            objectArray5[0] = l4;
            _0H.b("\u00d0", (String)((Object)_0H.b("\u00c8", (Object)_0H.b("X", (Object)objectArray5, 5513943687817367229L, (long)l2), 5514236178618522407L, (long)l2)), 5512567588214436242L, (long)l2);
            Object[] objectArray6 = new Object[2];
            objectArray6[1] = l10;
            objectArray6[0] = _0H.b("\u00ff", 5512567588214436242L, (long)l2);
            Object[] objectArray7 = new Object[2];
            objectArray7[1] = _0H.b("\u00ff", 5514418552580088380L, (long)l2);
            objectArray7[0] = l7;
            _0H.b("\u00d0", (_0j)((Object)_0H.b("\u00c8", (Object)_0H.b("X", (Object)objectArray6, 5514024401579298344L, (long)l2), (Object)objectArray7, 5515374616171460949L, (long)l2)), 5512630495440563655L, (long)l2);
            Object[] objectArray8 = new Object[2];
            objectArray8[1] = _0H.b("\u00ff", 5512630495440563655L, (long)l2);
            objectArray8[0] = l8;
            _0H.b("X", (Object)objectArray8, 5513405001210333515L, (long)l2);
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0H" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _0H.a(l2, l3);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                _0H.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _0H.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _0H.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _0H.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _0H.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _0H.a(l2, l3);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = _0H.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _0H.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _0H.a(clazz3, string2, clazz2)) != null) {
                    _0H.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _0H.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _0H.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _0H.b(366736030602021L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _0H.a(l2, l3);
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
                clazz3 = _0H.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _0H.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _0H.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _0H.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _0H.b(366736030602021L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _0H.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _0H.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _0H.b(366736030602021L, 0L);
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

    private static int a(long l2, long l3) {
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
            case 0 -> 35;
            case 1 -> 58;
            case 2 -> 4;
            case 3 -> 55;
            case 4 -> 40;
            case 5 -> 11;
            case 6 -> 1;
            case 7 -> 44;
            case 8 -> 57;
            case 9 -> 8;
            case 10 -> 10;
            case 11 -> 13;
            case 12 -> 30;
            case 13 -> 25;
            case 14 -> 17;
            case 15 -> 14;
            case 16 -> 26;
            case 17 -> 21;
            case 18 -> 23;
            case 19 -> 34;
            case 20 -> 50;
            case 21 -> 41;
            case 22 -> 32;
            case 23 -> 9;
            case 24 -> 63;
            case 25 -> 49;
            case 26 -> 29;
            case 27 -> 6;
            case 28 -> 0;
            case 29 -> 53;
            case 30 -> 5;
            case 31 -> 56;
            case 32 -> 39;
            case 33 -> 20;
            case 34 -> 52;
            case 35 -> 24;
            case 36 -> 37;
            case 37 -> 59;
            case 38 -> 2;
            case 39 -> 18;
            case 40 -> 51;
            case 41 -> 36;
            case 42 -> 45;
            case 43 -> 3;
            case 44 -> 43;
            case 45 -> 46;
            case 46 -> 22;
            case 47 -> 15;
            case 48 -> 38;
            case 49 -> 31;
            case 50 -> 7;
            case 51 -> 54;
            case 52 -> 60;
            case 53 -> 12;
            case 54 -> 42;
            case 55 -> 62;
            case 56 -> 48;
            case 57 -> 19;
            case 58 -> 47;
            case 59 -> 16;
            case 60 -> 33;
            case 61 -> 27;
            case 62 -> 28;
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
        _0H.f[n3] = new String(cArray);
        return n3;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c2' || c == 'F' || c == '\u00ff' || c == '\u00d0') {
                field = _0H.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c2' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'F' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ff' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _0H.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'X' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _0H.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _0H.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
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

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x5931;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l3 = Thread.currentThread().threadId();
                objectArray = (Object[])d.get(l3);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/0H", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l2 >>> 56);
            for (int j = 1; j < 8; ++j) {
                byArray[j] = (byte)(l2 << j * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            _0H.c[n2] = _0H.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0H" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "\u001f\u001cVtV\u001d\u0002\tT5SAK1";
        objectArray[1] = Boolean.TYPE;
        _0H.f[1] = "java/lang/Boolean";
        objectArray[2] = "v]\bf\nXhU\u0012)hDoH";
        objectArray[3] = " \u0019\u0019q\u0000I>\u0011\u0003>gH/\n\u000edAN";
        objectArray[4] = "\u007f/:*\u001det +e`}g'\",";
        objectArray[5] = "eu\u0002Q*onz\u0013\u001eKaeq\u0017D";
        objectArray[6] = "\u0006\u000f\u0010\u001c\u0016<\u001b\u001a\u0012]\u0013`ZZ";
        objectArray[7] = "3$F9RR8+Wv/G*1U5";
        objectArray[8] = "\u0003\u000e\u00109\u0017I\u0006A6*PN\u001d<\u0012*\\A\u0004";
        objectArray[9] = "M!+>\u001f\\P4)\u007f\u001a\u0000\u0019\u0005";
        objectArray[10] = "tW)\u0010\bG\u0001w\"\u001f\u0019\b`y)\u0014\u001dR\u0014";
        objectArray[11] = Void.TYPE;
        _0H.f[11] = "java/lang/Void";
        objectArray[12] = "Y:C<zVR5Rs\u0011BP>E)=U]";
        objectArray[13] = "y1\u0015L\u0012\"d$\u0017\r\u0017~->";
        objectArray[14] = "<\u000e&.\u000fUI.-!\u001e\u001a( &*\u001a@\\";
        objectArray[15] = "<\n\b2WV!\u001f\nsR\nh\u001b";
        objectArray[16] = "} Zb\\C\b\u0000QmM\fi\u000eZfIV\u001d";
        objectArray[17] = ":\u001ds\u0012Ac$\u0015i],y=\fd\u0001\u000eb?\u000e";
        objectArray[18] = "qS\u001f#Rzo[\u0005l\u001azuQ\u001d+\u0013a5t\u001c,\u001f{r]\u0007";
        objectArray[19] = "\u001f\u000b-\brW\u0002\u001e/Iw\u000bH1";
        objectArray[20] = "\u0005\u0000M\u001b1xp F\u0014 7\u0011.M\u001f$me";
        objectArray[21] = "`C?\u000bt8\u0015c4\u0004ewtm?\u000fa-\u0000";
        objectArray[22] = "M\u001a\f\u0011djS\u0012\u0016^\u0019zS";
        objectArray[23] = "\ru\u0007&r_xU\f)c\u0010\u0005M\u001f.jYm";
        objectArray[24] = "LCr~!\u00189cyq0WXmrz4\r,";
        objectArray[25] = "q\n99\fn\u0004*26\u001d!e$9=\u0019{\u0011";
        objectArray[26] = "\u001fy,$ \u000ejY'+1A\u000bW, 5\u001b\u007f";
        objectArray[27] = "\u0005\u0014\u0005jJ;\u0018\u0001\u0007+OgU\u001c";
        objectArray[28] = "\n\u0000>!I\u0001\u007f 5.XN\u001e.>%\\\u0014j";
        objectArray[29] = "\u007f\u001dY=>:(\u0000\u000f&E:,\u0002K,\u0002*E]R3:{+\u001cG'tD\u007f\u001dY=>:(\u0000\u000f&E";
        objectArray[30] = "N\u0006H-6/\u001cLO|[yrTPha#\u001bI\u0017o;HCX\u001f`f6J\u000eB [";
        objectArray[31] = "\u001b\u0005T~uYO\u001eOw\u0014V\u0017\nUwn\\\u0016\u0000-r(C\u0001\u0014Nt._\u0011oFtm]\u0011\u000b\u0012ovTp";
        objectArray[32] = ".tlh(\u0013-t+vV\u0004yhm\u0007m\u0006fg.i,\u0013r)\u0011";
        objectArray[33] = "[\u007fyJ6XU'1\u001a\f\u00047|v^6S^a1Yl8^gp\u001a|JM'`\\\f";
        objectArray[34] = "Jd+EWyM{$.Y\u0007\u0016}#\u0014\fn\u000b:$Ng;DefC\u0000i\u000eb7.";
        objectArray[35] = "m\u00019~K!;C,!{-\u007f\u0014/t\u0007+yyoq\u0006#}\blqA=\u0003";
        objectArray[36] = "\u0002x\u0013W\u001b\u0015\f [\u0007!In{\u001cC\u001b\u001e\u0007f[DAu\u0000a\u000fY\u0011\u0018V#\u001a\u0006!";
        objectArray[37] = "\u0007\u00059@0\u000bF\u0010-\u000e\u000f\bE\u001c\"[te\u0007\u00059@0\u000bF\u0010-\u000e\u000f\\V\u0019*@f^A\u001cq?";
        objectArray[38] = ";@JCQ\u00115\u0018\u0002\u0013kJWCEWQ\u001a>^\u0002P\u000bqh^KJ\u0007\u00171\u0018\u0007Dk";
        objectArray[39] = "Vhr6s4X0:fIl:k}\"s?Sv:%)T\u0005vs?%2\\0?1I";
        objectArray[40] = "\u0003~W\u0010\u0010\u000b\u0004k\u0005\u0016,*\u000fiI\u0018E\nbgL\u001f@L\u0019`YMF";
        objectArray[41] = "?\u0002H~Uj8\u001dG\u0015T\u0014c\u001b@/\u000e}~\\Gue+~\u0015]y\u0003r8YS\u0015";
        objectArray[42] = "!\u00018j\u0017`-\u0006:voff\u0012Q'\u0017yg\u000b=q_1$";
        objectArray[43] = "8\u0013.]|\u0016}[%N\u001eN\u0006\u0001kF$\u0014o\u001c,A~\u007f9\u001ce[r\u0019`Z)U\u001e";
        objectArray[44] = "7\u001bo\u007fX?>\u00190.h+}\u0004093/n\u000e5\u0019\u0012:l\bVz\u0017\"c\t0#Qnme";
        objectArray[45] = "})dSs9+n2\u001aH)8>tK4/>S4N5':\"7Nr9D";
        objectArray[46] = "\n>+Tcl\u0019~;\u0012\u0013$c})\u0006oe\u001d*4Pt\u001e";
        objectArray[47] = ")u\u0001\u001f\\\r~hW\u0004'\u001ejs\u0007\u0007\\2|h\t\u0019J8zu\u0003c\u001d\b|r\u0015\u001dJ\u0015*inZM\u000brq\u0007XZ\u000e)\u000e";
        objectArray[48] = "_\u0007.d]L\tOf'>X\u0018\u001e:cZFbE'pB[\u001c\u0012:&Y ]\u0000-{RF\u0004Fau>";
        objectArray[49] = "Y}R`$#\u001c5YsFrg<\u000627w\u00195Pow";
        objectArray[50] = "up:\" \u0010vp}<^\u0001&g\u0001 .\u001dO%-5?\u001e&':0da";
        objectArray[51] = "\\\u0010=!8W\nWkh\u0003]\u0002\u0010+PhL\u001c\n64<W\u0007\u0003Wo|W\u0001\u000616:\u001b\u000fj";
        objectArray[52] = "kFsAL1lY|*AOlJzK\u0003&n]\u007f\u0010";
        objectArray[53] = "D\u001cq0+nC\u0003~[!\u0010D\n:9yy\u0001B1*";
        objectArray[54] = "d\u0016\u007f\u001a\u0007\u0012c\tpq\tl`\u000ba\rL\u00127\u00167\u0016";
        objectArray[55] = "UF\u001aV\u00035RY\u0015=\u0003KZN[L\u000e5S\u0018\u0006\f";
        objectArray[56] = ",\u000bs>x\u0012~Ato\u0015N\u0010\u0001omi\u000enVr;ru";
        objectArray[57] = "K\u000fE\t\nP\u001dH\u0013@1J\u0016\u0018F\u00021\u001e\r\u0004K\u0014WGKHEx";
        objectArray[58] = "sh2Fodtw=-c\u001a/q:\u00174s26=M_%2\u007f'A9|t3)-";
        objectArray[59] = "z;.l\u0012}}$!\u0007\u0013\u0003+c':Dg|0ev";
        Object[] objectArray2 = objectArray;
        objectArray[60] = "3\u0007B\u001c)G4\u0018Mw%94\u001bY\u0006\"Hb\\\u000fO";
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public static _80 cfr_renamed_2(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = a ^ l2;
        _4w[] wArray = _0j.cfr_renamed_1();
        CallSite callSite = _0H.b("\u00c8", (Object)_0H.b("\u00ff", 7431032890860154266L, (long)l2), 7432085299599332941L, (long)l2);
        while (_0H.b("\u00c8", (Object)callSite, 7432005159205891979L, (long)l2) != false) {
            block6: {
                _80 v0;
                block5: {
                    _80 var6_5 = (_80)((Object)_0H.b("\u00c8", (Object)callSite, 7433037758247998299L, (long)l2));
                    try {
                        try {
                            v0 = var6_5;
                            if (wArray == null) break block5;
                            if (_0H.b("\u00c8", (Object)_0H.b("\u00c8", (Object)v0, 7431340643510418100L, (long)l2), (Object)string, 7432223580623966872L, (long)l2) == false) break block6;
                        }
                        catch (RuntimeException runtimeException) {
                            throw _0H.a(runtimeException);
                        }
                        v0 = var6_5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw _0H.a(runtimeException);
                    }
                }
                return v0;
            }
            if (wArray != null) continue;
        }
        return null;
    }

    public static void cfr_renamed_6(Object[] objectArray) {
        Object object;
        long l2;
        long l3;
        block2: {
            block3: {
                l3 = (Long)objectArray[0];
                l2 = (l3 = a ^ l3) ^ 0x2CD376834807L;
                _4w[] wArray = _0j.cfr_renamed_1();
                try {
                    object = _0H.b("\u00ff", -7463283209404741613L, (long)l3);
                    if (wArray == null) break block2;
                    if (object == false) break block3;
                }
                catch (RuntimeException runtimeException) {
                    throw _0H.a(runtimeException);
                }
                return;
            }
            object = true;
        }
        _0H.b("\u00d0", (boolean)object, -7463283209404741613L, (long)l3);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        _0H.b("X", (Object)objectArray2, -7464039886539955774L, (long)l3);
    }

    /*
     * Unable to fully structure code
     */
    public static void cfr_renamed_7(Object[] var0) {
        block14: {
            block15: {
                block16: {
                    block17: {
                        block21: {
                            block20: {
                                var2_1 = (Long)var0[0];
                                var1_2 = (_0j)var0[1];
                                v0 = var2_1 = _0H.a ^ var2_1;
                                var4_3 = v0 ^ 21902480888057L;
                                var6_4 = v0 ^ 105821341205880L;
                                var8_5 = v0 ^ 35734713834730L;
                                var10_6 = _0j.cfr_renamed_1();
                                v1 = _0H.b("\u00ff", (long)-804441831957817839L, (long)var2_1);
                                if (var10_6 == null) ** GOTO lbl49
                                if (v1 == null) break block14;
                                break block20;
                                catch (Exception v2) {
                                    throw _0H.a(v2);
                                }
                            }
                            v3 = _0H.b("\u00ff", (long)-804441831957817839L, (long)var2_1);
                            v4 = var10_6;
                            if (var2_1 <= 0L) break block15;
                            if (v4 == null) break block16;
                            break block21;
                            catch (Exception v5) {
                                throw _0H.a(v5);
                            }
                        }
                        try {
                            block22: {
                                if (_0H.b("\u00c8", (Object)_0H.b("\u00c2", (Object)v3, (long)-804163516429955280L, (long)var2_1), (Object)var1_2, (long)-805580665727615827L, (long)var2_1) == false) break block17;
                                break block22;
                                catch (Exception v6) {
                                    throw _0H.a(v6);
                                }
                            }
                            return;
                        }
                        catch (Exception v7) {
                            throw _0H.a(v7);
                        }
                    }
                    v3 = _0H.b("\u00ff", (long)-804441831957817839L, (long)var2_1);
                }
                v8 = new Object[1];
                v4 = v8;
                v8[0] = var6_4;
            }
            _0H.b("\u00c8", (Object)v3, (Object)v4, (long)-805660239599542191L, (long)var2_1);
        }
        try {
            v1 = new _0A(var4_3, var1_2);
lbl49:
            // 2 sources

            _0H.b("\u00d0", (_0A)v1, (long)-804441831957817839L, (long)var2_1);
        }
        catch (Exception var11_7) {
            block18: {
                block19: {
                    try {
                        try {
                            v9 = var1_2;
                            if (var10_6 == null) break block18;
                            if (_0H.b("\u00c8", (Object)v9, (Object)_0H.b("\u00ff", (long)-804290441775229551L, (long)var2_1), (long)-805580665727615827L, (long)var2_1) == false) break block19;
                        }
                        catch (Exception v10) {
                            throw _0H.a(v10);
                        }
                        throw new RuntimeException((String)_0H.a("o", (int)31879, (long)(3343745586507370860L ^ var2_1)) + (String)_0H.b("X", (Object)var1_2, (long)-802729927409289633L, (long)var2_1), var11_7);
                    }
                    catch (Exception v11) {
                        throw _0H.a(v11);
                    }
                }
                _0H.b("\u00c8", (Object)_0H.b("\u00ff", (long)-805645163214618530L, (long)var2_1), (Object)((String)_0H.a("o", (int)22830, (long)(3000527787188352196L ^ var2_1)) + (String)_0H.b("X", (Object)var1_2, (long)-802729927409289633L, (long)var2_1)), (long)-804085760347979260L, (long)var2_1);
                _0H.b("\u00c8", (Object)var11_7, (long)-806067578626489337L, (long)var2_1);
                v9 = _0H.b("\u00ff", (long)-804290441775229551L, (long)var2_1);
            }
            v12 = new Object[2];
            v12[1] = v9;
            v12[0] = var8_5;
            _0H.b("X", (Object)v12, (long)-804501097819950819L, (long)var2_1);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_0H.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_0H.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

