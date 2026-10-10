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
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _48
extends Enum {
    public static final _48 eucentral;
    public static final _48 euwest;
    public static final _48 east;
    public static final _48 west;
    public static final _48 asia;
    public static final _48 oceania;
    public static final _48 random;
    private final String cfr_renamed_6;
    private static final _48[] cfr_renamed_3;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static final Object[] e;
    private static final String[] f;

    private static _48[] cfr_renamed_5() {
        long l2 = a ^ 0x7369B78386E5L;
        _48[] nullArray = new _48[_48.a("u", 25640, (long)(0x68FEC546514420A7L ^ l2))];
        nullArray[0] = _48.b("e", 7401685801945739220L, (long)l2);
        nullArray[1] = _48.b("e", 7402205342832795724L, (long)l2);
        nullArray[2] = _48.b("e", 7401760956238346605L, (long)l2);
        nullArray[3] = _48.b("e", 7403378903831772880L, (long)l2);
        nullArray[4] = _48.b("e", 7401924520979472964L, (long)l2);
        nullArray[5] = _48.b("e", 7402018107921626837L, (long)l2);
        nullArray[_48.a("u", 21145, (long)(0x512AC915C7A39615L ^ l2))] = _48.b("e", 7401968388267624930L, (long)l2);
        return nullArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _48() {
        void var3_1;
        void cfr_renamed_27;
        void cfr_renamed_28;
        this.cfr_renamed_6 = var3_1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        _48.a = l.a(7131725963122470798L, 237236170296796576L, MethodHandles.lookup().lookupClass()).a(11882483910425L);
                        var20 = _48.a ^ 116891938419815L;
                        _48.e = new Object[18];
                        _48.f = new String[18];
                        _48.a();
                        var12_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var13_2 = 1; var13_2 < 8; ++var13_2) {
                            v2 = v2;
                            v2[var13_2] = (byte)(var20 << var13_2 * 8 >>> 56);
                        }
                        var12_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var11_3 = new String[14];
                        var17_4 = 0;
                        var16_5 = "\u00f6x\u00ecd\u0081\u000f\n\u0096\bet}vc\u0016um\b^\u00d7\u008dV\u00db\u00d2\u0016\u001d\u0010\u00d2\u00d3\u009c\u0011\u0087\u00be\u0014\u0089\u00bd\"\u00a2}\u009f\u00ee\u0093\u00fe\b\u0085 \u00c2js\u0003@t\b\u00a67|\u000f\u00c9\t\u0016U\b\u0014z\u00aea\u001c\u0080\u0019~\bm\u00a5\u001b2&P\u00bew\b\u0005i\u00ab%$9\u00b2f\u0010\u00a0cwr\u0006j@\u00e5\u00e4\u0093\u00f1\u001f\u00c8c\u00c2\u00ee\bpo\\!\u00ea\u0096d\u00de\b\u000f\u00a3W\"\u00a2\u00a9R(";
                        var18_6 = "\u00f6x\u00ecd\u0081\u000f\n\u0096\bet}vc\u0016um\b^\u00d7\u008dV\u00db\u00d2\u0016\u001d\u0010\u00d2\u00d3\u009c\u0011\u0087\u00be\u0014\u0089\u00bd\"\u00a2}\u009f\u00ee\u0093\u00fe\b\u0085 \u00c2js\u0003@t\b\u00a67|\u000f\u00c9\t\u0016U\b\u0014z\u00aea\u001c\u0080\u0019~\bm\u00a5\u001b2&P\u00bew\b\u0005i\u00ab%$9\u00b2f\u0010\u00a0cwr\u0006j@\u00e5\u00e4\u0093\u00f1\u001f\u00c8c\u00c2\u00ee\bpo\\!\u00ea\u0096d\u00de\b\u000f\u00a3W\"\u00a2\u00a9R(".length();
                        var15_7 = 8;
                        var14_8 = -1;
lbl22:
                        // 2 sources

                        while (true) {
                            v3 = ++var14_8;
                            v4 = var16_5.substring(v3, v3 + var15_7);
                            v5 = -1;
                            break block13;
                            break;
                        }
lbl27:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = _48.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "\u00e6\u0019`pU\u00023\u00ef\bM\u00185*(\u00e4K\u00c7";
                            var18_6 = "\u00e6\u0019`pU\u00023\u00ef\bM\u00185*(\u00e4K\u00c7".length();
                            var15_7 = 8;
                            var14_8 = -1;
lbl36:
                            // 2 sources

                            while (true) {
                                v6 = ++var14_8;
                                v4 = var16_5.substring(v6, v6 + var15_7);
                                v5 = 0;
                                break block13;
                                break;
                            }
                            break;
                        }
lbl41:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = _48.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            break block14;
                            break;
                        }
                    }
                    var19_9 = var12_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                _48.d = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var20 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[3];
                var3_13 = 0;
                var4_14 = "\u00e5dX\u00c0Bv\u00e4\u00bfR~\"\u00bdZr\u0083\u0016\u008c\u00e8\u00e3H1\u00dd\u001fL";
                var5_15 = "\u00e5dX\u00c0Bv\u00e4\u00bfR~\"\u00bdZr\u0083\u0016\u008c\u00e8\u00e3H1\u00dd\u001fL".length();
                var2_16 = 0;
                while (true) {
                    break block15;
                    break;
                }
lbl73:
                // 1 sources

                while (true) {
                    var6_12[v10] = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
                    if (var2_16 < var5_15) ** continue;
                    break block16;
                    break;
                }
            }
            var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
            v10 = var3_13++;
            var8_18 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            ** while (true)
        }
        _48.b = var6_12;
        _48.c = new Integer[3];
        _48.eucentral = new _48(var11_3[3], 0, var11_3[9]);
        _48.euwest = new _48(var11_3[6], 1, var11_3[12]);
        _48.east = new _48(var11_3[0], 2, var11_3[4]);
        _48.west = new _48(var11_3[1], 3, var11_3[2]);
        _48.asia = new _48(var11_3[8], 4, var11_3[7]);
        _48.oceania = new _48(var11_3[10], 5, var11_3[5]);
        _48.random = new _48(var11_3[13], (int)_48.a("u", (int)10153, (long)(2701565672096633254L ^ var20)), var11_3[11]);
        _48.cfr_renamed_3 = _48.b("T", (long)-7765751320284906454L, (long)var20);
    }

    public String toString() {
        long l2 = a ^ 0x1D5B23EC6C29L;
        return _48.b("\u00e4", (Object)((Object)this), -8324925067389919345L, (long)l2);
    }

    public static _48[] values() {
        long l2 = a ^ 0x286EB4B6DE5FL;
        return (_48[])((Enum)((Object)_48.b("e", 4468706037310273261L, (long)l2))).clone();
    }

    public static _48 valueOf(String string) {
        long l2 = a ^ 0x5791B5D1FC7CL;
        return (_48)((Object)_48.b("T", _48.class, (Object)string, 2026820747774612639L, (long)l2));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/48" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _48.a(l2, l3);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                _48.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _48.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _48.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _48.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _48.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _48.a(l2, l3);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = _48.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _48.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _48.a(clazz3, string2, clazz2)) != null) {
                    _48.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _48.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _48.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _48.b(488214159560606L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _48.a(l2, l3);
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
                clazz3 = _48.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _48.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _48.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _48.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _48.b(488214159560606L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _48.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _48.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _48.b(488214159560606L, 0L);
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

    private static void a() {
        Object[] objectArray = e;
        e[0] = "L\r]!\u00005Q\u0018_`\u0005i\u001cP";
        objectArray[1] = "Z<\b\u0003\u0005NQ3\u0019LxVB4\u0010\u0005";
        objectArray[2] = "#Vx\u001f@\u0006(YiP+\u0004<Z";
        objectArray[3] = "+\f\b^z\u0012 \u0003\u0019\u0011\u0017\u0012 \u001e\r";
        objectArray[4] = "u4o\u00192hE\nr\f0)@V?D\u007f";
        objectArray[5] = ">\u000bx.:T\u000e5e;8\u0015\u000bi(sw";
        objectArray[6] = "\u001d\u000bEN8y\u0016\u0004T\u0001Yw\u001d\u000fP[";
        objectArray[7] = "&<[\u0016\\Zic\u001en^7og_QT\u0006(aZ";
        objectArray[8] = "\u000e\f}j\u0019%AS8\u0012M!E\u0011\u0002\"A7FTom\u001er";
        objectArray[9] = "\bT'#M=G\u000bb[\u0019-SX>'\u000e9\\5h:\u000b(\u0001X'eN";
        objectArray[10] = "kzG\u0006K\n$%\u0002~\u001b\u001c:r8N\u0013\u0018#\"U\u0001L]";
        objectArray[11] = "X\u0010(Utb\u0017Om-t\u000fS\u000b4P t\n\u0017;FM";
        objectArray[12] = "\\0&fG \u0013oc\u001e\u0019&\u00018?\u007f\u0017M\\0&fG \u0013oc";
        objectArray[13] = "i\u0018!\u0000y'&Gdx:#?\u00159\u001d@z8\u0006&A-5gC";
        objectArray[14] = "p}PFO\u0002?\"\u0015>\u001b\u0012?qTBv_!cW\u0007\u001b\u0010~&";
        objectArray[15] = "\u0007a%]\bQ\u0002+z[qRWu:L6B>+ C\u001dGQw(ZJ,G+<\u001e@\u001d\u0000-9!H\\\\m>\\M\u0016\u0003kG";
        objectArray[16] = "\u0001\u0002CwS[N]\u0006\u000fP6\n\u0019_r\u0007MS\u0005Pd";
        Object[] objectArray2 = objectArray;
        objectArray[17] = "\u0011K&\u0017.<^\u0014coh<ZVY_v.Y\u00134\u0010)k";
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e4' || c == 'W' || c == 'e' || c == 'i') {
                field = _48.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e4' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'W' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'e' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _48.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '$' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'T' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _48.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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
            case 0 -> 63;
            case 1 -> 41;
            case 2 -> 42;
            case 3 -> 56;
            case 4 -> 12;
            case 5 -> 19;
            case 6 -> 47;
            case 7 -> 23;
            case 8 -> 39;
            case 9 -> 1;
            case 10 -> 51;
            case 11 -> 30;
            case 12 -> 6;
            case 13 -> 54;
            case 14 -> 38;
            case 15 -> 57;
            case 16 -> 45;
            case 17 -> 20;
            case 18 -> 13;
            case 19 -> 2;
            case 20 -> 3;
            case 21 -> 31;
            case 22 -> 22;
            case 23 -> 17;
            case 24 -> 46;
            case 25 -> 40;
            case 26 -> 52;
            case 27 -> 60;
            case 28 -> 27;
            case 29 -> 43;
            case 30 -> 14;
            case 31 -> 44;
            case 32 -> 62;
            case 33 -> 25;
            case 34 -> 33;
            case 35 -> 49;
            case 36 -> 29;
            case 37 -> 16;
            case 38 -> 21;
            case 39 -> 26;
            case 40 -> 15;
            case 41 -> 36;
            case 42 -> 4;
            case 43 -> 50;
            case 44 -> 5;
            case 45 -> 0;
            case 46 -> 32;
            case 47 -> 9;
            case 48 -> 35;
            case 49 -> 34;
            case 50 -> 58;
            case 51 -> 7;
            case 52 -> 11;
            case 53 -> 37;
            case 54 -> 24;
            case 55 -> 10;
            case 56 -> 61;
            case 57 -> 59;
            case 58 -> 48;
            case 59 -> 18;
            case 60 -> 28;
            case 61 -> 53;
            case 62 -> 55;
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
        _48.f[n3] = new String(cArray);
        return n3;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/48" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _48.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x2237;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])d.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/48", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _48.c[n2] = n3;
        }
        return c[n2];
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_48.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_48.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

