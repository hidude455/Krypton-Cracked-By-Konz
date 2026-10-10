/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 */
package dev.krypton;

import dev.krypton._4w;
import dev.krypton._87;
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

public class _9x
extends Enum {
    public static final _9x Lines;
    public static final _9x Sides;
    public static final _9x Both;
    private final String cfr_renamed_0;
    private static final _9x[] cfr_renamed_8;
    private static _4w[] cfr_renamed_1;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    public static _4w[] cfr_renamed_5() {
        return cfr_renamed_1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _9x() {
        void var3_1;
        void cfr_renamed_27;
        void cfr_renamed_28;
        this.cfr_renamed_0 = var3_1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                _9x.a = l.a(-6494485118157570483L, -8029037121887837084L, MethodHandles.lookup().lookupClass()).a(80441543890611L);
                var9 = _9x.a ^ 48381265976349L;
                _9x.b = new Object[14];
                _9x.c = new String[14];
                _9x.a();
                if (_9x.cfr_renamed_5() == null) {
                    _9x.cfr_renamed_8(new _4w[1]);
                }
                var1_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var2_2 = 1; var2_2 < 8; ++var2_2) {
                    v2 = v2;
                    v2[var2_2] = (byte)(var9 << var2_2 * 8 >>> 56);
                }
                var1_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_3 = new String[6];
                var6_4 = 0;
                var5_5 = "pX\u00b2\u008e\u00afCo<\b\u0085\u0097<\u00b3{2AW\bU/\u00ef\u00ba\u00ed\n\f\u0098\bpX\u00b2\u008e\u00afCo<";
                var7_6 = "pX\u00b2\u008e\u00afCo<\b\u0085\u0097<\u00b3{2AW\bU/\u00ef\u00ba\u00ed\n\f\u0098\bpX\u00b2\u008e\u00afCo<".length();
                var4_7 = 8;
                var3_8 = -1;
lbl24:
                // 2 sources

                while (true) {
                    v3 = ++var3_8;
                    v4 = var5_5.substring(v3, v3 + var4_7);
                    v5 = -1;
                    break block11;
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = _9x.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u0085\u0097<\u00b3{2AW\bU/\u00ef\u00ba\u00ed\n\f\u0098";
                    var7_6 = "\u0085\u0097<\u00b3{2AW\bU/\u00ef\u00ba\u00ed\n\f\u0098".length();
                    var4_7 = 8;
                    var3_8 = -1;
lbl38:
                    // 2 sources

                    while (true) {
                        v6 = ++var3_8;
                        v4 = var5_5.substring(v6, v6 + var4_7);
                        v5 = 0;
                        break block11;
                        break;
                    }
                    break;
                }
lbl43:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = _9x.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    break block12;
                    break;
                }
            }
            var8_9 = var1_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl55:
                // 1 sources

                ** continue;
            }
        }
        _9x.Lines = new _9x(var0_3[5], 0, var0_3[2]);
        _9x.Sides = new _9x(var0_3[0], 1, var0_3[3]);
        _9x.Both = new _9x(var0_3[1], 2, var0_3[4]);
        _9x.cfr_renamed_8 = _9x.a("N", (long)-961329894016520915L, (long)var9);
    }

    public String toString() {
        long l2 = a ^ 0x634E0F714F80L;
        return _9x.a("\u00da", (Object)((Object)this), -6830161298059146359L, (long)l2);
    }

    public static _9x[] values() {
        long l2 = a ^ 0x4C2C028E90B0L;
        return (_9x[])((Enum)((Object)_9x.a("\u00f3", 9081223603528469417L, (long)l2))).clone();
    }

    public static _9x valueOf(String string) {
        long l2 = a ^ 0x46B330435213L;
        return (_9x)((Object)_9x.a("N", _9x.class, (Object)string, -4853724006691366347L, (long)l2));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _9x.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _9x.b(classArray[j], string, clazz2);
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
            int n = _9x.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _9x.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _9x.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _9x.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _9x.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _9x.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _9x.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _9x.a(clazz3, string2, clazz2)) != null) {
                    _9x.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _9x.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _9x.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _9x.b(452667996441351L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _9x.a(l2, l3);
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
                clazz3 = _9x.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _9x.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _9x.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _9x.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _9x.b(452667996441351L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _9x.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _9x.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _9x.b(452667996441351L, 0L);
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
        MethodHandle methodHandle = _9x.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/9x" + " : " + string + " : " + methodType.toString(), exception);
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00da' || c == 'q' || c == '\u00f3' || c == 'F') {
                field = _9x.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00da' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'q' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _9x.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00cf' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'N' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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
            case 0 -> 38;
            case 1 -> 31;
            case 2 -> 33;
            case 3 -> 52;
            case 4 -> 39;
            case 5 -> 43;
            case 6 -> 40;
            case 7 -> 14;
            case 8 -> 9;
            case 9 -> 11;
            case 10 -> 34;
            case 11 -> 0;
            case 12 -> 53;
            case 13 -> 3;
            case 14 -> 48;
            case 15 -> 17;
            case 16 -> 49;
            case 17 -> 10;
            case 18 -> 47;
            case 19 -> 54;
            case 20 -> 22;
            case 21 -> 46;
            case 22 -> 51;
            case 23 -> 50;
            case 24 -> 35;
            case 25 -> 59;
            case 26 -> 8;
            case 27 -> 57;
            case 28 -> 58;
            case 29 -> 30;
            case 30 -> 20;
            case 31 -> 36;
            case 32 -> 45;
            case 33 -> 29;
            case 34 -> 2;
            case 35 -> 63;
            case 36 -> 25;
            case 37 -> 56;
            case 38 -> 44;
            case 39 -> 24;
            case 40 -> 7;
            case 41 -> 18;
            case 42 -> 32;
            case 43 -> 37;
            case 44 -> 27;
            case 45 -> 6;
            case 46 -> 23;
            case 47 -> 13;
            case 48 -> 41;
            case 49 -> 62;
            case 50 -> 42;
            case 51 -> 4;
            case 52 -> 1;
            case 53 -> 28;
            case 54 -> 5;
            case 55 -> 21;
            case 56 -> 12;
            case 57 -> 61;
            case 58 -> 55;
            case 59 -> 60;
            case 60 -> 19;
            case 61 -> 26;
            case 62 -> 16;
            default -> 15;
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
        _9x.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "lI\u001f^D-gF\u000e\u0011//sE";
        objectArray[1] = "\b\u0010\u000f7iS\u0003\u001f\u001ex\u0004S\u0003\u0002\n";
        objectArray[2] = "#\tQgMq(\u0006@(0i;\u0001Ia";
        objectArray[3] = ",qL)\u000e=1dNh\u000baql";
        objectArray[4] = "\u0011\u0013} }z!-`5\u007f;$q =0";
        objectArray[5] = "\u000eH5\u0019JD>v(\fH\u0005;*h\u0004\u0007";
        objectArray[6] = " b[9D7+mJv%9 fN,";
        objectArray[7] = "\u00178^%Y\u0017C5@}\"X-lItI\u001dR&\u0017\"Mg";
        objectArray[8] = "}P[-r/)]Eu\t\u001b&YF6\te(OK6y1%Q\u0013";
        objectArray[9] = "IdbUPs\u001di|\r+3s2vM\u0010|\u0017ur\n\u001a";
        objectArray[10] = "q_d^A\u0012%Rz\u0006:9*\\yE:X$@tEJ\f)^,";
        objectArray[11] = "-|\u0017&G\u000eyq\t~<C\u0017(\u0000wW\u0004hb^!S";
        objectArray[12] = "!\u001atwLBrD-OX\u0012'\t~\bH{zL(6\u001f\u0002r\u0012|v&B'\f(0B\u0005#K\"OD\u0015$Lyv\u0017K}t";
        Object[] objectArray2 = objectArray;
        objectArray[13] = "=j\u00010\u0011:ig\u001fhj\u0000`y\u0011PP%we\n \u0004(i=";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean cfr_renamed_8() {
        CallSite callSite;
        _9x x;
        block6: {
            long l2 = a ^ 0x33A5729A5950L;
            int n = _87.cfr_renamed_5();
            try {
                try {
                    x = this;
                    callSite = _9x.a("\u00f3", -5195185691289779514L, (long)l2);
                    if (n != 0) break block6;
                    if (x == callSite) return true;
                }
                catch (MatchException matchException) {
                    throw _9x.a(matchException);
                }
                x = this;
                callSite = _9x.a("\u00f3", -5195135268924752361L, (long)l2);
            }
            catch (MatchException matchException) {
                throw _9x.a(matchException);
            }
        }
        try {
            if (x != callSite) return false;
            return true;
        }
        catch (MatchException matchException) {
            throw _9x.a(matchException);
        }
    }

    public static void cfr_renamed_8(_4w[] wArray) {
        cfr_renamed_1 = wArray;
    }

    private static _9x[] dev_krypton_9x_arr_7() {
        long l2 = a ^ 0x301F8F8DD22AL;
        return new _9x[]{_9x.a("\u00f3", 4367503797248535196L, (long)l2), _9x.a("\u00f3", 4367644573915974076L, (long)l2), _9x.a("\u00f3", 4367691492764251501L, (long)l2)};
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean boolean_7() {
        CallSite callSite;
        _9x x;
        block6: {
            long l2 = a ^ 0x32DE51D9B68BL;
            int n = _87.cfr_renamed_5();
            try {
                try {
                    x = this;
                    callSite = _9x.a("\u00f3", 6358378237344566845L, (long)l2);
                    if (n != 0) break block6;
                    if (x == callSite) return true;
                }
                catch (MatchException matchException) {
                    throw _9x.a(matchException);
                }
                x = this;
                callSite = _9x.a("\u00f3", 6358003521788383692L, (long)l2);
            }
            catch (MatchException matchException) {
                throw _9x.a(matchException);
            }
        }
        try {
            if (x != callSite) return false;
            return true;
        }
        catch (MatchException matchException) {
            throw _9x.a(matchException);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_9x.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

