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

public class _3z
extends Enum {
    public static final _3z ALWAYS_WALK;
    public static final _3z OCCASIONAL_LONG_STOP;
    public static final _3z INTERMITTENT_STOP;
    private static final _3z[] cfr_renamed_4;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _3z() {
        void cfr_renamed_27;
        void cfr_renamed_28;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = l.a(5316190339683008018L, -3180378687590081384L, MethodHandles.lookup().lookupClass()).a(88187777297778L);
        long l2 = a ^ 0x7EDE24DB3392L;
        b = new Object[13];
        c = new String[13];
        _3z.a();
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
        String string = "\u00ed~Tz\u00cfj\u00f9A\u00f3\u0001>\u001a\u0005\u00b4\u0007\u00e8\u00e8\u0006\u00c4\u00e9<\u00ac\u00d2\r\u0018\u00ae\u00f0\u00a5\u00e0\u00fas'@&\u00cf\u00ca9\u00cb\u0097z/Mu\u0081aY\u00f1\u00ea\u00d5\u0010\u00f3\u001dJ\u00c2\u008bw\u0005\u0097\u00cc\u00aaF\u00b3\u0080*\u00d8@";
        int n2 = "\u00ed~Tz\u00cfj\u00f9A\u00f3\u0001>\u001a\u0005\u00b4\u0007\u00e8\u00e8\u0006\u00c4\u00e9<\u00ac\u00d2\r\u0018\u00ae\u00f0\u00a5\u00e0\u00fas'@&\u00cf\u00ca9\u00cb\u0097z/Mu\u0081aY\u00f1\u00ea\u00d5\u0010\u00f3\u001dJ\u00c2\u008bw\u0005\u0097\u00cc\u00aaF\u00b3\u0080*\u00d8@".length();
        int n3 = 24;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = _3z.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                ALWAYS_WALK = new _3z(stringArray[2], 0);
                OCCASIONAL_LONG_STOP = new _3z(stringArray[1], 1);
                INTERMITTENT_STOP = new _3z(stringArray[0], 2);
                cfr_renamed_4 = _3z.a("N", 8884823079818731989L, (long)l2);
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    public static _3z[] values() {
        long l2 = a ^ 0x1ECD0DAED24FL;
        return (_3z[])((Enum)((Object)_3z.a("\u00c1", -7308807652920674423L, (long)l2))).clone();
    }

    public static _3z valueOf(String string) {
        long l2 = a ^ 0x727F37E0A648L;
        return (_3z)((Object)_3z.a("N", _3z.class, (Object)string, -1254578629404821014L, (long)l2));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _3z.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _3z.b(classArray[j], string, clazz2);
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
            int n = _3z.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _3z.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _3z.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _3z.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _3z.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _3z.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _3z.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _3z.a(clazz3, string2, clazz2)) != null) {
                    _3z.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _3z.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _3z.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _3z.b(491682331489471L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _3z.a(l2, l3);
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
                clazz3 = _3z.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _3z.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _3z.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _3z.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _3z.b(491682331489471L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _3z.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _3z.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _3z.b(491682331489471L, 0L);
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
            if (c == 'l' || c == '\u00ef' || c == '\u00c1' || c == '\u00c6') {
                field = _3z.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'l' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ef' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _3z.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00de' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'N' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _3z.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/3z" + " : " + string + " : " + methodType.toString(), exception);
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
            case 0 -> 56;
            case 1 -> 32;
            case 2 -> 40;
            case 3 -> 30;
            case 4 -> 27;
            case 5 -> 23;
            case 6 -> 3;
            case 7 -> 19;
            case 8 -> 44;
            case 9 -> 63;
            case 10 -> 15;
            case 11 -> 41;
            case 12 -> 52;
            case 13 -> 35;
            case 14 -> 46;
            case 15 -> 0;
            case 16 -> 49;
            case 17 -> 60;
            case 18 -> 20;
            case 19 -> 25;
            case 20 -> 29;
            case 21 -> 55;
            case 22 -> 34;
            case 23 -> 10;
            case 24 -> 59;
            case 25 -> 37;
            case 26 -> 26;
            case 27 -> 39;
            case 28 -> 31;
            case 29 -> 28;
            case 30 -> 2;
            case 31 -> 11;
            case 32 -> 38;
            case 33 -> 33;
            case 34 -> 17;
            case 35 -> 4;
            case 36 -> 13;
            case 37 -> 21;
            case 38 -> 24;
            case 39 -> 36;
            case 40 -> 6;
            case 41 -> 48;
            case 42 -> 57;
            case 43 -> 61;
            case 44 -> 50;
            case 45 -> 1;
            case 46 -> 47;
            case 47 -> 7;
            case 48 -> 14;
            case 49 -> 5;
            case 50 -> 18;
            case 51 -> 45;
            case 52 -> 53;
            case 53 -> 8;
            case 54 -> 12;
            case 55 -> 42;
            case 56 -> 62;
            case 57 -> 9;
            case 58 -> 58;
            case 59 -> 54;
            case 60 -> 22;
            case 61 -> 16;
            case 62 -> 51;
            default -> 43;
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
        _3z.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "b\u00006\u001b*hi\u000f'TAj}\f";
        objectArray[1] = "{s\u0000\n\u00176p|\u0011Ez6pa\u0005";
        objectArray[2] = "7p5Ku1<\u007f$\u0004\b)/x-M";
        objectArray[3] = "\u001fIXOM\u001f\u0002\\Z\u000eHCHV";
        objectArray[4] = "\\^W=P\u0010l`J(RQi<\u0000\"\u001d";
        objectArray[5] = "3\niQ\u001f\u0018\u00034tD\u001dY\u0006h>NR";
        objectArray[6] = "4\u0005X1LT?\nI~-Z4\u0001M$";
        objectArray[7] = "$\u000b[A\u001c2&V\u0001\u0010yKZd*,\"UAr'>y8.\u0003_\u0018I:sY\u000e";
        objectArray[8] = "I%\u0013k\u000e\"KxI:kS5If\r.S/If\u00117E(Il\u000fk(C-\u00172[*\u001ewF";
        objectArray[9] = "\u0011?u\u000e\rC\u0013b/_h4`D\u0004i)4mF\te,4m@\u001ai44s\u000fw\u0002PON?u_\n\u001e";
        objectArray[10] = "$&>z9,&{d+\\$\u001e-w|a`py}>$";
        objectArray[11] = "\u0015f(.v5\u001fx\"Cu2\u0014{*\u0004e[\b|zzk!\fx9C2=Ja.3tb\u001fwG&k4\u001d{),u>p";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "*\u00026$O0(_lu*:\u0010\t\u007f\"\u0017|~]u`R\u0000";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static _3z[] cfr_renamed_3() {
        long l2 = a ^ 0x23C86ABCEDB2L;
        return new _3z[]{_3z.a("\u00c1", -6525828654949567834L, (long)l2), _3z.a("\u00c1", -6526809271813707826L, (long)l2), _3z.a("\u00c1", -6526746194393914579L, (long)l2)};
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_3z.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

