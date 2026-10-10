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
 * Renamed from dev.krypton.4j
 */
public class _4j_0
extends Enum {
    public static final _4j_0 TOP_LEFT;
    public static final _4j_0 TOP_RIGHT;
    public static final _4j_0 BOTTOM_LEFT;
    public static final _4j_0 BOTTOM_RIGHT;
    private final String cfr_renamed_3;
    private static final _4j_0[] cfr_renamed_5;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _4j_0() {
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
                _4j_0.a = l.a(-8358048890889771587L, -6867805191463100029L, MethodHandles.lookup().lookupClass()).a(58923769809339L);
                var9 = _4j_0.a ^ 134664316590344L;
                _4j_0.b = new Object[15];
                _4j_0.c = new String[15];
                _4j_0.a();
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
                var0_3 = new String[8];
                var6_4 = 0;
                var5_5 = "\u0086J\u0090'\u0090\u00cb\u0098!S\u00ed\u00e9\u00be\u00a9\u00ac\u00dd\u00ad\u0010\u00a7\u00cb\u0091\u001d\u00a3P\u0010\u008e\n\u0089`\u00c5\u00da25\u00ba\u0010\u00feF\u00a3\u00b3\u0081G\u0002\u00f4\u00e4\u0088\u00b5OQ\u00f8\u00f6\u00de\u0010h\u00b9\u0080\u0014;\u00f88@\u00a7=,\u00ecg\u0018\u00ee\u00a0\u0010P\u008f\u0081F\u00dbf\u00fdnY\u0018\u0080\u0093\u00c4\u0085!\u00a9\u0010\u0013\u00169g?\u00a6\u00c8b\u00c2\u0093\u000e)p\u0087\u0001\u0082";
                var7_6 = "\u0086J\u0090'\u0090\u00cb\u0098!S\u00ed\u00e9\u00be\u00a9\u00ac\u00dd\u00ad\u0010\u00a7\u00cb\u0091\u001d\u00a3P\u0010\u008e\n\u0089`\u00c5\u00da25\u00ba\u0010\u00feF\u00a3\u00b3\u0081G\u0002\u00f4\u00e4\u0088\u00b5OQ\u00f8\u00f6\u00de\u0010h\u00b9\u0080\u0014;\u00f88@\u00a7=,\u00ecg\u0018\u00ee\u00a0\u0010P\u008f\u0081F\u00dbf\u00fdnY\u0018\u0080\u0093\u00c4\u0085!\u00a9\u0010\u0013\u00169g?\u00a6\u00c8b\u00c2\u0093\u000e)p\u0087\u0001\u0082".length();
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
                    var0_3[var6_4++] = _4j_0.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u00c4\u008d\u00c6\u00c6c+\u00c9\u00d5\u0012\u00ac[O\u00eeUQ\u00b3\u0010o0\u0092\nK\u0016\u00c0wM\r\u000e\u000eI\u0007\u000e\u001a";
                    var7_6 = "\u00c4\u008d\u00c6\u00c6c+\u00c9\u00d5\u0012\u00ac[O\u00eeUQ\u00b3\u0010o0\u0092\nK\u0016\u00c0wM\r\u000e\u000eI\u0007\u000e\u001a".length();
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
                    var0_3[var6_4++] = _4j_0.a(var8_9).intern();
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
        _4j_0.TOP_LEFT = new _4j_0(var0_3[4], 0, var0_3[1]);
        _4j_0.TOP_RIGHT = new _4j_0(var0_3[6], 1, var0_3[3]);
        _4j_0.BOTTOM_LEFT = new _4j_0(var0_3[2], 2, var0_3[7]);
        _4j_0.BOTTOM_RIGHT = new _4j_0(var0_3[5], 3, var0_3[0]);
        _4j_0.cfr_renamed_5 = _4j_0.a("\u00d5", (long)5146526829091106268L, (long)var9);
    }

    public String toString() {
        long l2 = a ^ 0x57F1C88D7AL;
        return _4j_0.a("I", (Object)((Object)this), -3233714899484478533L, (long)l2);
    }

    public static _4j_0[] values() {
        long l2 = a ^ 0x550057C1C884L;
        return (_4j_0[])((Enum)((Object)_4j_0.a("\u00e2", -7574965354330374331L, (long)l2))).clone();
    }

    public static _4j_0 valueOf(String string) {
        long l2 = a ^ 0x22D4D9B67289L;
        return (_4j_0)((Object)_4j_0.a("\u00d5", _4j_0.class, (Object)string, 3237449776509915263L, (long)l2));
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _4j_0.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _4j_0.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _4j_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _4j_0.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _4j_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _4j_0.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _4j_0.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _4j_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _4j_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _4j_0.a(clazz3, string2, clazz2)) != null) {
                    _4j_0.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _4j_0.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _4j_0.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _4j_0.b(484775891134236L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _4j_0.a(l2, l3);
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
                clazz3 = _4j_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _4j_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _4j_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _4j_0.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _4j_0.b(484775891134236L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _4j_0.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _4j_0.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _4j_0.b(484775891134236L, 0L);
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
            throw new RuntimeException("dev/krypton/4j" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'I' || c == '\u00d0' || c == '\u00e2' || c == '\u00ee') {
                field = _4j_0.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'I' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d0' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _4j_0.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _4j_0.a(lookup, mutableCallSite, string, methodType, l2, l3);
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
            case 0 -> 55;
            case 1 -> 48;
            case 2 -> 9;
            case 3 -> 32;
            case 4 -> 38;
            case 5 -> 45;
            case 6 -> 3;
            case 7 -> 39;
            case 8 -> 29;
            case 9 -> 8;
            case 10 -> 28;
            case 11 -> 27;
            case 12 -> 2;
            case 13 -> 40;
            case 14 -> 17;
            case 15 -> 26;
            case 16 -> 33;
            case 17 -> 59;
            case 18 -> 0;
            case 19 -> 23;
            case 20 -> 21;
            case 21 -> 16;
            case 22 -> 18;
            case 23 -> 14;
            case 24 -> 22;
            case 25 -> 49;
            case 26 -> 61;
            case 27 -> 4;
            case 28 -> 54;
            case 29 -> 6;
            case 30 -> 24;
            case 31 -> 63;
            case 32 -> 11;
            case 33 -> 10;
            case 34 -> 47;
            case 35 -> 36;
            case 36 -> 43;
            case 37 -> 44;
            case 38 -> 62;
            case 39 -> 1;
            case 40 -> 30;
            case 41 -> 46;
            case 42 -> 41;
            case 43 -> 13;
            case 44 -> 12;
            case 45 -> 35;
            case 46 -> 19;
            case 47 -> 53;
            case 48 -> 34;
            case 49 -> 15;
            case 50 -> 50;
            case 51 -> 57;
            case 52 -> 56;
            case 53 -> 42;
            case 54 -> 51;
            case 55 -> 7;
            case 56 -> 20;
            case 57 -> 37;
            case 58 -> 58;
            case 59 -> 5;
            case 60 -> 25;
            case 61 -> 31;
            case 62 -> 60;
            default -> 52;
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
        _4j_0.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = ")O\nK\u0005t4Z\b\n\u0000(y@";
        objectArray[1] = "~4W\n<}N\nJ\u001f><KV\u0007\u0005q";
        objectArray[2] = "\u0004\u0007g/[T\u000f\bv`0V\u001b\u000b";
        objectArray[3] = "=t5Vex6{$\u0019\bx6f0";
        objectArray[4] = "|@lW$bwO}\u0018YzdHtQ";
        objectArray[5] = "\u0006\u000f&4\nI61;!\b\b3mv;G";
        objectArray[6] = "c6\u0015s\u0015eh9\u0004<tkc2\u0000f";
        objectArray[7] = "wI?\"E5sI`O \u0019@`\u001a\u00022\u0002\u0018X .\u0011gs\\ q";
        objectArray[8] = "Uz)I_\u0015Qzv$:9bS\u0012e)>f\u0004'Z\u0007\u0013\u0003o#ZX";
        objectArray[9] = "$YA\u001fz= Y\u001er\t\u0011\u0017{g7\u0014\f\nh`.C95FMK(=5\u0019";
        objectArray[10] = "\\pm\u0015\u0004yXp2x\u0007\u0012\bew\b\u0003t\b2i\u0005";
        objectArray[11] = "jXg\u001f\bLnX8r{`YzA7fcHhZr^YdK?\u0019ZY;";
        objectArray[12] = "-B0\u0001\bo)Bol\b\u0004y]2\u001cI9#\u00072\u001d";
        objectArray[13] = ":Uf\u0006\u000e~>U9k\t\u0015nJd\u001bO(4\u0010d\u001a7";
        Object[] objectArray2 = objectArray;
        objectArray[14] = "\u000boc`:\u0015\t=q S\u0005X2f=\u0014\u00151lp::\u0011\u00011r1-{\n=` m\u001d\nj~-SA\b.+9=CZ<kP";
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

    private static _4j_0[] cfr_renamed_2() {
        long l2 = a ^ 0x7327A433BA92L;
        return new _4j_0[]{_4j_0.a("\u00e2", -1948771965878896772L, (long)l2), _4j_0.a("\u00e2", -1947992738909245848L, (long)l2), _4j_0.a("\u00e2", -1947888023098535402L, (long)l2), _4j_0.a("\u00e2", -1948041122064968703L, (long)l2)};
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_4j_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

