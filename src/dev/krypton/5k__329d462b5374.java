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

/*
 * Renamed from dev.krypton.5k
 */
public class _5k_0
extends Enum {
    public static final _5k_0 Handshake;
    public static final _5k_0 Frame;
    public static final _5k_0 Close;
    public static final _5k_0 Ping;
    public static final _5k_0 Pong;
    private static final _5k_0[] cfr_renamed_6;
    private static final _5k_0[] cfr_renamed_4;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _5k_0() {
        void cfr_renamed_27;
        void cfr_renamed_28;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                _5k_0.a = l.a(-6397159933715354621L, -1140408551239775865L, MethodHandles.lookup().lookupClass()).a(272897565124938L);
                var9 = _5k_0.a ^ 79290024225253L;
                _5k_0.b = new Object[19];
                _5k_0.c = new String[19];
                _5k_0.a();
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
                var0_3 = new String[5];
                var6_4 = 0;
                var5_5 = "N#g\u00de\u001b\u000b:n\u00fd\u00f7\u00f7PP\u009b\u0010{\b\u00e4\u009a\u0085\u00d0@\u00c03\t\b$\u00bc[\u0080\u0087\t7\u001e";
                var7_6 = "N#g\u00de\u001b\u000b:n\u00fd\u00f7\u00f7PP\u009b\u0010{\b\u00e4\u009a\u0085\u00d0@\u00c03\t\b$\u00bc[\u0080\u0087\t7\u001e".length();
                var4_7 = 16;
                var3_8 = -1;
lbl22:
                // 2 sources

                while (true) {
                    v3 = ++var3_8;
                    v4 = var5_5.substring(v3, v3 + var4_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = _5k_0.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\r\u00d6k)M\u0089\u008fH\b\u00b4>\u00a9\u000b\u00f85\u00ac\u0090";
                    var7_6 = "\r\u00d6k)M\u0089\u008fH\b\u00b4>\u00a9\u000b\u00f85\u00ac\u0090".length();
                    var4_7 = 8;
                    var3_8 = -1;
lbl36:
                    // 2 sources

                    while (true) {
                        v6 = ++var3_8;
                        v4 = var5_5.substring(v6, v6 + var4_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl41:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = _5k_0.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_9 = var1_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl53:
                // 1 sources

                ** continue;
            }
        }
        _5k_0.Handshake = new _5k_0(var0_3[0], 0);
        _5k_0.Frame = new _5k_0(var0_3[1], 1);
        _5k_0.Close = new _5k_0(var0_3[2], 2);
        _5k_0.Ping = new _5k_0(var0_3[4], 3);
        _5k_0.Pong = new _5k_0(var0_3[3], 4);
        _5k_0.cfr_renamed_4 = _5k_0.a("C", (long)-2715294011740282662L, (long)var9);
        _5k_0.cfr_renamed_6 = _5k_0.a("C", (long)-2715503561717393710L, (long)var9);
    }

    public static _5k_0[] values() {
        long l2 = a ^ 0x414A56A4623EL;
        return (_5k_0[])((Enum)((Object)_5k_0.a("\u00fe", -3347534102248429171L, (long)l2))).clone();
    }

    public static _5k_0 valueOf(String string) {
        long l2 = a ^ 0x7AD9056AC0C0L;
        return (_5k_0)((Object)_5k_0.a("C", _5k_0.class, (Object)string, 8319256319632319994L, (long)l2));
    }

    public static _5k_0 cfr_renamed_1(int n) {
        long l2 = a ^ 0x4912C526D430L;
        return _5k_0.a("\u00fe", 7459278220097649911L, (long)l2)[n];
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _5k_0.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _5k_0.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _5k_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5k_0.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5k_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5k_0.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _5k_0.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _5k_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5k_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5k_0.a(clazz3, string2, clazz2)) != null) {
                    _5k_0.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5k_0.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5k_0.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5k_0.b(617823116770782L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _5k_0.a(l2, l3);
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
                clazz3 = _5k_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5k_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5k_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5k_0.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5k_0.b(617823116770782L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5k_0.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5k_0.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5k_0.b(617823116770782L, 0L);
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5k" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00a3' || c == '\u00ef' || c == '\u00fe' || c == '\u00cd') {
                field = _5k_0.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a3' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ef' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00fe' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5k_0.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'G' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'C' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _5k_0.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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
            case 0 -> 11;
            case 1 -> 30;
            case 2 -> 26;
            case 3 -> 5;
            case 4 -> 37;
            case 5 -> 60;
            case 6 -> 38;
            case 7 -> 43;
            case 8 -> 12;
            case 9 -> 39;
            case 10 -> 17;
            case 11 -> 54;
            case 12 -> 56;
            case 13 -> 53;
            case 14 -> 46;
            case 15 -> 44;
            case 16 -> 28;
            case 17 -> 49;
            case 18 -> 7;
            case 19 -> 27;
            case 20 -> 8;
            case 21 -> 18;
            case 22 -> 0;
            case 23 -> 61;
            case 24 -> 3;
            case 25 -> 9;
            case 26 -> 6;
            case 27 -> 32;
            case 28 -> 21;
            case 29 -> 42;
            case 30 -> 31;
            case 31 -> 58;
            case 32 -> 29;
            case 33 -> 4;
            case 34 -> 40;
            case 35 -> 15;
            case 36 -> 41;
            case 37 -> 63;
            case 38 -> 50;
            case 39 -> 47;
            case 40 -> 25;
            case 41 -> 19;
            case 42 -> 24;
            case 43 -> 52;
            case 44 -> 51;
            case 45 -> 14;
            case 46 -> 55;
            case 47 -> 23;
            case 48 -> 33;
            case 49 -> 59;
            case 50 -> 45;
            case 51 -> 62;
            case 52 -> 34;
            case 53 -> 13;
            case 54 -> 36;
            case 55 -> 1;
            case 56 -> 22;
            case 57 -> 48;
            case 58 -> 10;
            case 59 -> 20;
            case 60 -> 57;
            case 61 -> 35;
            case 62 -> 16;
            default -> 2;
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
        _5k_0.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "w\bs\u00038|j\u001dqB= &\u0006";
        objectArray[1] = "\nij 6\u0001:Ww54@?\u000b;.{";
        objectArray[2] = "Y/,/\u00169i\u00111:\u0014xlM}![";
        objectArray[3] = "\u0017Yg\u001ch9'gz\tjx\";6\u0012%";
        objectArray[4] = "Tj[Y\u0013\"dTFL\u0011ca\b\nW^";
        objectArray[5] = "x*k$\u0016zs%zk}xg&";
        objectArray[6] = "\\Up~\u0005fWZa1hfWGu";
        objectArray[7] = "\bJ_p\u001d\u0014\u0003EN?`\f\u0010BGv";
        objectArray[8] = "o+u\u000bmJd$dD\fDo/`\u001e";
        objectArray[9] = "?\u0005;\f!\u0010>C6=ea>V#C \u0002|\u0002eZ";
        objectArray[10] = "swMk'{r1@Z\u0003k/%+`flx6Za a";
        objectArray[11] = "3b5}}\t2$8L\u007f\u0011m\">7\u0001Cg!-1b\u00013g4L";
        objectArray[12] = "Ff\u0010B3#G \u001dsuRG5\b\r21\u0005aN\u0014O";
        objectArray[13] = "\u0017\b\u001f-{+\u0016N\u0012\u001cI DP\u0014\u001c=gK\u0004\u0005m<!F";
        objectArray[14] = "eoOB<9d)Bs\u000b,8)Dszu9cU\u0002{34";
        objectArray[15] = "YA\u0003\na6X\u0007\u000e;&GX\u0012\u001bE`$\u001aF]\\";
        objectArray[16] = "\u0005mUb?0\u0004+XS\u001b&Y?3i~'\u000e,Bh8*";
        objectArray[17] = "0\u0015\\\"o,1SQ\u0013S4lDAsz>g(\u0000.ulvY\u0001hx";
        Object[] objectArray2 = objectArray;
        objectArray[18] = "\"dSS\u001f4'cS@r,pc\u0013U5<\u0019;\u0017B\u001d-'`\u0005B\u0019R$eQ^C8dy\u0016\u0006riz:\u0005U\u0014l}:\u00168";
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static _5k_0[] cfr_renamed_3() {
        long l2 = a ^ 0x50A873711615L;
        return new _5k_0[]{_5k_0.a("\u00fe", -6510477187736145083L, (long)l2), _5k_0.a("\u00fe", -6511878740569701459L, (long)l2), _5k_0.a("\u00fe", -6511660158671398704L, (long)l2), _5k_0.a("\u00fe", -6511967078636247532L, (long)l2), _5k_0.a("\u00fe", -6510391478470651579L, (long)l2)};
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5k_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

