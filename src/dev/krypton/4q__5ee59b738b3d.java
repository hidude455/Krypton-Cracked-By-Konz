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
 * Renamed from dev.krypton.4q
 */
public class _4q_0
extends Enum {
    public static final _4q_0 LENGTH;
    public static final _4q_0 ALPHABETICAL;
    public static final _4q_0 CATEGORY;
    private final String cfr_renamed_3;
    private static final _4q_0[] cfr_renamed_0;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _4q_0() {
        void var3_1;
        void cfr_renamed_27;
        void cfr_renamed_28;
        this.cfr_renamed_3 = var3_1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                _4q_0.a = l.a(6910933339618370339L, -6495250763489307186L, MethodHandles.lookup().lookupClass()).a(151130479611584L);
                var9 = _4q_0.a ^ 41356510450274L;
                _4q_0.b = new Object[14];
                _4q_0.c = new String[14];
                _4q_0.a();
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
                var5_5 = "0\u00dd\u0006\u00b8;K\u00d8Q\u00d7\u001f\u000f\u000e|a/&\b\u001d\u00a3N\u00f9$\u009ao\u000b\u0010hSO1\u0014\u00f8\u00127\u00d9\u00d8}\u00d4\u00ab\u0089\\\u008e\b1\u00dc\u00c7\u00c5I\u00d4\u00e5\u00c6";
                var7_6 = "0\u00dd\u0006\u00b8;K\u00d8Q\u00d7\u001f\u000f\u000e|a/&\b\u001d\u00a3N\u00f9$\u009ao\u000b\u0010hSO1\u0014\u00f8\u00127\u00d9\u00d8}\u00d4\u00ab\u0089\\\u008e\b1\u00dc\u00c7\u00c5I\u00d4\u00e5\u00c6".length();
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
                    var0_3[var6_4++] = _4q_0.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u00e7\u0091\u00f3}\u009e\u00bb\u00db\u00d9\u00d1\u00c9\u0082S\u00c4\u00fa\u00bf\u0085\u0010u4dH\u00cf\u001a\u0090\u0092\u00d7\u000b\u00cb~A:\u00a7\u00f4";
                    var7_6 = "\u00e7\u0091\u00f3}\u009e\u00bb\u00db\u00d9\u00d1\u00c9\u0082S\u00c4\u00fa\u00bf\u0085\u0010u4dH\u00cf\u001a\u0090\u0092\u00d7\u000b\u00cb~A:\u00a7\u00f4".length();
                    var4_7 = 16;
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
                    var0_3[var6_4++] = _4q_0.a(var8_9).intern();
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
        _4q_0.LENGTH = new _4q_0(var0_3[1], 0, var0_3[3]);
        _4q_0.ALPHABETICAL = new _4q_0(var0_3[4], 1, var0_3[0]);
        _4q_0.CATEGORY = new _4q_0(var0_3[2], 2, var0_3[5]);
        _4q_0.cfr_renamed_0 = _4q_0.a("n", (long)2432762471053607712L, (long)var9);
    }

    public String toString() {
        long l2 = a ^ 0x7169EC0AE0F2L;
        return _4q_0.a("\u00ce", (Object)((Object)this), -7830853407108828642L, (long)l2);
    }

    public static _4q_0[] values() {
        long l2 = a ^ 0x3F5AB4251EA8L;
        return (_4q_0[])((Enum)((Object)_4q_0.a("Q", 7857552454790118143L, (long)l2))).clone();
    }

    public static _4q_0 valueOf(String string) {
        long l2 = a ^ 0x27DACEB85973L;
        return (_4q_0)((Object)_4q_0.a("n", _4q_0.class, (Object)string, 3085986871365999795L, (long)l2));
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _4q_0.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _4q_0.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _4q_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _4q_0.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _4q_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _4q_0.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _4q_0.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _4q_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _4q_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _4q_0.a(clazz3, string2, clazz2)) != null) {
                    _4q_0.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _4q_0.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _4q_0.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _4q_0.b(487628900302562L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _4q_0.a(l2, l3);
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
                clazz3 = _4q_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _4q_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _4q_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _4q_0.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _4q_0.b(487628900302562L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _4q_0.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _4q_0.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _4q_0.b(487628900302562L, 0L);
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
            throw new RuntimeException("dev/krypton/4q" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ce' || c == 'R' || c == 'Q' || c == '\u00c6') {
                field = _4q_0.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ce' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'R' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'Q' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _4q_0.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'b' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'n' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _4q_0.a(lookup, mutableCallSite, string, methodType, l2, l3);
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
            case 0 -> 22;
            case 1 -> 33;
            case 2 -> 56;
            case 3 -> 45;
            case 4 -> 24;
            case 5 -> 0;
            case 6 -> 23;
            case 7 -> 53;
            case 8 -> 44;
            case 9 -> 49;
            case 10 -> 58;
            case 11 -> 20;
            case 12 -> 38;
            case 13 -> 54;
            case 14 -> 47;
            case 15 -> 4;
            case 16 -> 17;
            case 17 -> 25;
            case 18 -> 32;
            case 19 -> 31;
            case 20 -> 15;
            case 21 -> 11;
            case 22 -> 28;
            case 23 -> 5;
            case 24 -> 62;
            case 25 -> 57;
            case 26 -> 43;
            case 27 -> 18;
            case 28 -> 41;
            case 29 -> 30;
            case 30 -> 8;
            case 31 -> 59;
            case 32 -> 9;
            case 33 -> 36;
            case 34 -> 27;
            case 35 -> 29;
            case 36 -> 42;
            case 37 -> 61;
            case 38 -> 63;
            case 39 -> 39;
            case 40 -> 6;
            case 41 -> 48;
            case 42 -> 10;
            case 43 -> 40;
            case 44 -> 1;
            case 45 -> 3;
            case 46 -> 19;
            case 47 -> 52;
            case 48 -> 21;
            case 49 -> 13;
            case 50 -> 50;
            case 51 -> 60;
            case 52 -> 35;
            case 53 -> 2;
            case 54 -> 12;
            case 55 -> 14;
            case 56 -> 55;
            case 57 -> 46;
            case 58 -> 26;
            case 59 -> 51;
            case 60 -> 16;
            case 61 -> 7;
            case 62 -> 37;
            default -> 34;
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
        _4q_0.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "_fsqr<Tib>\u0019>@j";
        objectArray[1] = "v!e4\u000f-}.t{b-}3`";
        objectArray[2] = "%P>n|U._/!\u0001M=X&h";
        objectArray[3] = "\u007f\u001c~ZzGb\t|\u001b\u007f\u001b/\b";
        objectArray[4] = "DVcFR\"th~SPcq43R\u001f";
        objectArray[5] = "lO\u000eC]{\\q\u0013V_:Y-^W\u0010";
        objectArray[6] = "6=~\u0017D#=2oX%-69k\u0002";
        objectArray[7] = "~aiLk\u0015/ihD\u0012XDkhN~S5=kE-";
        objectArray[8] = "\u001b\u0005bR\u0001NJ\rcZxzel^|2~}uU|<3\u001b\u0005bR\u0001NJ\rcZ";
        objectArray[9] = "%DOj\u0014\u001etLNbm'R3|Q-c%DOj\u0014\u001etLNb";
        objectArray[10] = "\u0005^GXjCTVFP\u0013\u0002?TFZ\u007f\u0005N\u0002EQ,>";
        objectArray[11] = "\u0014\b/2\u0012/O\u0004>T\u00167M\u000b#\u0013\u0006^SK+&\u00131R\u000e+TRgC\u0019%+\u0016`O\u0016Ni\u0016?O\f?2\u001a.)";
        objectArray[12] = "UUQ\u001e3;\u0004]P\u0016J|o^\u0014\u0013%-\u0010\u001a\u0013\u001f*";
        Object[] objectArray2 = objectArray;
        objectArray[13] = "q\u000f6\u0000\u0006\n \u00077\b\u007f<\u0002b\u0007(8-\u001a>pV\u0003\u00102C!^\u0002\u0018";
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

    private static _4q_0[] cfr_renamed_7() {
        long l2 = a ^ 0x76BA54833BC1L;
        return new _4q_0[]{_4q_0.a("Q", 5215588026158116885L, (long)l2), _4q_0.a("Q", 5215501419449991359L, (long)l2), _4q_0.a("Q", 5215307773345384809L, (long)l2)};
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_4q_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

