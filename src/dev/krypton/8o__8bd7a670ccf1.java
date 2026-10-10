/*
 * Decompiled with CFR 0.152.
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
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _8o
extends Enum {
    public static final _8o FILL;
    public static final _8o STROKE;
    private static final _8o[] cfr_renamed_6;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _8o() {
        void cfr_renamed_27;
        void cfr_renamed_28;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = l.a(1661910341195417946L, -7207619120491014320L, MethodHandles.lookup().lookupClass()).a(195109176479034L);
        long l2 = a ^ 0x433C0DDC1DC1L;
        b = new Object[12];
        c = new String[12];
        _8o.a();
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
        String string = "P\u00f3\u00119\u00ca\u0085>4\b)\u00c0n\u00ca\u00f5\u00e9'\u0018";
        int n2 = "P\u00f3\u00119\u00ca\u0085>4\b)\u00c0n\u00ca\u00f5\u00e9'\u0018".length();
        int n3 = 8;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = _8o.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                FILL = new _8o(stringArray[0], 0);
                STROKE = new _8o(stringArray[1], 1);
                cfr_renamed_6 = _8o.a("O", -6105929359152385915L, (long)l2);
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    public static _8o[] values() {
        long l2 = a ^ 0x3351F4CB6A21L;
        return (_8o[])((Enum)((Object)_8o.a("\u00cc", -2547911817359850728L, (long)l2))).clone();
    }

    public static _8o valueOf(String string) {
        long l2 = a ^ 0x1F10578794A0L;
        return (_8o)((Object)_8o.a("O", _8o.class, (Object)string, 2459651655547870496L, (long)l2));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _8o.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _8o.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _8o.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _8o.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _8o.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _8o.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _8o.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _8o.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _8o.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _8o.a(clazz3, string2, clazz2)) != null) {
                    _8o.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _8o.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _8o.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _8o.b(423740008509297L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _8o.a(l2, l3);
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
                clazz3 = _8o.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _8o.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _8o.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _8o.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _8o.b(423740008509297L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _8o.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _8o.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _8o.b(423740008509297L, 0L);
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
            if (c == 'S' || c == '\u00e2' || c == '\u00cc' || c == 'D') {
                field = _8o.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'S' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e2' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00cc' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _8o.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'O' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _8o.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8o" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
            case 0 -> 21;
            case 1 -> 0;
            case 2 -> 51;
            case 3 -> 19;
            case 4 -> 61;
            case 5 -> 37;
            case 6 -> 52;
            case 7 -> 35;
            case 8 -> 11;
            case 9 -> 2;
            case 10 -> 12;
            case 11 -> 60;
            case 12 -> 4;
            case 13 -> 3;
            case 14 -> 54;
            case 15 -> 14;
            case 16 -> 16;
            case 17 -> 22;
            case 18 -> 6;
            case 19 -> 29;
            case 20 -> 24;
            case 21 -> 50;
            case 22 -> 10;
            case 23 -> 33;
            case 24 -> 56;
            case 25 -> 55;
            case 26 -> 36;
            case 27 -> 63;
            case 28 -> 43;
            case 29 -> 27;
            case 30 -> 57;
            case 31 -> 53;
            case 32 -> 48;
            case 33 -> 47;
            case 34 -> 44;
            case 35 -> 20;
            case 36 -> 9;
            case 37 -> 41;
            case 38 -> 42;
            case 39 -> 1;
            case 40 -> 18;
            case 41 -> 23;
            case 42 -> 62;
            case 43 -> 8;
            case 44 -> 30;
            case 45 -> 13;
            case 46 -> 49;
            case 47 -> 17;
            case 48 -> 34;
            case 49 -> 58;
            case 50 -> 46;
            case 51 -> 32;
            case 52 -> 26;
            case 53 -> 5;
            case 54 -> 59;
            case 55 -> 38;
            case 56 -> 25;
            case 57 -> 39;
            case 58 -> 40;
            case 59 -> 15;
            case 60 -> 31;
            case 61 -> 45;
            case 62 -> 28;
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
        _8o.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "\u001cNx0v\u007f\u0001[zqs#@D";
        objectArray[1] = "@XTxW)pfImUhu:\br\u001a";
        objectArray[2] = "\u0005KD\\-6\u000eDU\u0013F4\u001aG";
        objectArray[3] = "'K*~]M,D;10M,Y/";
        objectArray[4] = "wi71&;|f&~[#oa/7";
        objectArray[5] = "W5,mKNg\u000b1xI\u000fbWpg\u0006";
        objectArray[6] = "\u0016kcm\u0000-\u001ddr\"a#\u0016ovx";
        objectArray[7] = "\u0012iCl^=Ew\u001f\u0005 \u00180B$c\u0001>\u001d6@4\u001fb";
        objectArray[8] = "S~ic\u001c]\u0004`5\n\u00149\u000e`ucFTL)dh,";
        objectArray[9] = "ca6f\u000fD981ff\u00063d/v!\u0016Z:5\u007f\u000f\nk~ke\u0017xan5}\u0018\u0011`zk{fA;d/rZ\u001bbc/\u001b";
        objectArray[10] = "\":dfgPu$8\u000f\fh\u001e\u0012@BWR+2j?3\u00055n";
        Object[] objectArray2 = objectArray;
        objectArray[11] = "\u0011'@3\u001eLF9\u001cZ\u0015(L9\\3DE\u000epM8";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static _8o[] cfr_renamed_4() {
        long l2 = a ^ 0x1A76910C51BBL;
        return new _8o[]{_8o.a("\u00cc", -1784833915548324540L, (long)l2), _8o.a("\u00cc", -1785191996243829013L, (long)l2)};
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_8o.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

