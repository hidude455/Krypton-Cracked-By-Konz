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

public class _0i
extends Enum {
    public static final _0i IDLE;
    public static final _0i CLEARING_INVENTORY;
    public static final _0i MINING_SPAWNERS;
    public static final _0i OPENING_ECHEST;
    public static final _0i STORING_SPAWNERS;
    public static final _0i EMERGENCY_STORE;
    public static final _0i LOGGING_OUT;
    private static final _0i[] cfr_renamed_4;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static final Object[] e;
    private static final String[] f;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _0i() {
        void cfr_renamed_27;
        void cfr_renamed_28;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        _0i.a = l.a(1273509854228070848L, -7283876193188472436L, MethodHandles.lookup().lookupClass()).a(102227099974078L);
                        var20 = _0i.a ^ 6791268878682L;
                        _0i.e = new Object[17];
                        _0i.f = new String[17];
                        _0i.a();
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
                        var11_3 = new String[7];
                        var17_4 = 0;
                        var16_5 = "a\"\u009f\u00c6\u00b6\u00cf\u00bc\u00b4\u00907'\u0094\u0093\u0081\u0006\u000e\u00d2\u0099o\u008f\u00cc:pY\u0010\u0094\u00d8b~\u001d\u00f0\u00877\u0006^\u00ed \u0099\u0081Z\u00d8\u0018'\u00d0*\u008c\u00c1t\n\u00d1\u0002\u0095\u00a8\u00e4\u0007\u0001\u00fe\u00e3eB\u00ca3\u00e9\u00db\u0083\u00ef\u0010\u001c\u0099\u009d\r7\u0086\u00ad;\u001c\u00d7\u00b5n4\u0004\u00ec\u00ef\u0010G\u00ff\u0090.\u0004\u001b\u00d2-r5\u0011i\fsn\u00e1";
                        var18_6 = "a\"\u009f\u00c6\u00b6\u00cf\u00bc\u00b4\u00907'\u0094\u0093\u0081\u0006\u000e\u00d2\u0099o\u008f\u00cc:pY\u0010\u0094\u00d8b~\u001d\u00f0\u00877\u0006^\u00ed \u0099\u0081Z\u00d8\u0018'\u00d0*\u008c\u00c1t\n\u00d1\u0002\u0095\u00a8\u00e4\u0007\u0001\u00fe\u00e3eB\u00ca3\u00e9\u00db\u0083\u00ef\u0010\u001c\u0099\u009d\r7\u0086\u00ad;\u001c\u00d7\u00b5n4\u0004\u00ec\u00ef\u0010G\u00ff\u0090.\u0004\u001b\u00d2-r5\u0011i\fsn\u00e1".length();
                        var15_7 = 24;
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
                            var11_3[var17_4++] = _0i.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "\u00ed\u001e\u0003\u00b9\u0088-Qk\u00e0\u00e4\u0093 W\u00ffR\u0080\b\u0018\u000e\u0091\u00e2s\u00aa\u0003\u008e";
                            var18_6 = "\u00ed\u001e\u0003\u00b9\u0088-Qk\u00e0\u00e4\u0093 W\u00ffR\u0080\b\u0018\u000e\u0091\u00e2s\u00aa\u0003\u008e".length();
                            var15_7 = 16;
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
                            var11_3[var17_4++] = _0i.a(var19_9).intern();
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
                _0i.d = new HashMap<K, V>(13);
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
                var4_14 = "`\u00cd\u0004\u00d3y=u\u001f\u00a8>\u008e\u00ca\u00eei~c\u00dc\u00cf\u00ce\u009az\u00d0V\u000b";
                var5_15 = "`\u00cd\u0004\u00d3y=u\u001f\u00a8>\u008e\u00ca\u00eei~c\u00dc\u00cf\u00ce\u009az\u00d0V\u000b".length();
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
        _0i.b = var6_12;
        _0i.c = new Integer[3];
        _0i.IDLE = new _0i(var11_3[6], 0);
        _0i.CLEARING_INVENTORY = new _0i(var11_3[2], 1);
        _0i.MINING_SPAWNERS = new _0i(var11_3[5], 2);
        _0i.OPENING_ECHEST = new _0i(var11_3[4], 3);
        _0i.STORING_SPAWNERS = new _0i(var11_3[0], 4);
        _0i.EMERGENCY_STORE = new _0i(var11_3[1], 5);
        _0i.LOGGING_OUT = new _0i(var11_3[3], (int)_0i.a("d", (int)4096, (long)(7379669110407646634L ^ var20)));
        _0i.cfr_renamed_4 = _0i.b("\u00f1", (long)-7392875170565063979L, (long)var20);
    }

    public static _0i[] values() {
        long l2 = a ^ 0x7AB97B805F74L;
        return (_0i[])((Enum)((Object)_0i.b("\u00fe", -8122017102748015911L, (long)l2))).clone();
    }

    public static _0i valueOf(String string) {
        long l2 = a ^ 0x4D93ED0C0116L;
        return (_0i)((Object)_0i.b("\u00f1", _0i.class, (Object)string, -3374436595811329168L, (long)l2));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0i" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _0i.a(l2, l3);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                _0i.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _0i.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _0i.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _0i.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _0i.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _0i.a(l2, l3);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = _0i.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _0i.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _0i.a(clazz3, string2, clazz2)) != null) {
                    _0i.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _0i.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _0i.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _0i.b(486556654924878L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _0i.a(l2, l3);
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
                clazz3 = _0i.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _0i.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _0i.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _0i.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _0i.b(486556654924878L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _0i.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _0i.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _0i.b(486556654924878L, 0L);
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0i" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
            if (c == '\u00ff' || c == 't' || c == '\u00fe' || c == 'm') {
                field = _0i.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ff' ? lookup.findGetter(clazz, string2, clazz2) : (c == 't' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00fe' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _0i.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'K' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _0i.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "1\u001b\baU{,\u000e\n P'e\u0017";
        objectArray[1] = "2\tW\u00124s\u00027J\u000762\u0007k\u0003\u001ey";
        objectArray[2] = "hjL@R4XTQUPu]\b\u0018L\u001f";
        objectArray[3] = "qS\rlc\u0017z\\\u001c#\b\u0015n_";
        objectArray[4] = "c?#BEEh02\r(Eh-&";
        objectArray[5] = "Qo\u0018\u001fl,Z`\tP\u00114Ig\u0000\u0019";
        objectArray[6] = " /(*L$+ 9e-* +=?";
        objectArray[7] = "\u000b\u0017\rwT\u001eX\u0005SFt`r&.\tfzl.7\u0000|{ogW6T\u0010QX\u0004$\n";
        objectArray[8] = "(`;A7g{rep\u001f\u001dZJ\u0011=\u0014\u0013FG\u0005,\u0015\u0002Z\u0010a\u00007ir/2\u0012i";
        objectArray[9] = "0\u0010\u001ahBMc\u0002DY|.H:>\u001fh%T86\u0006a?U;\u007ffW\u0017>\u0005@5EI";
        objectArray[10] = "\u0011kI\u0016[YBy\u0017'\u0006f\u0017iEC^XTr@H";
        objectArray[11] = "VM\u000bTa,\u0005_UeCK${/#KD$v.(_Oi\u0002\u001e\u00005vVQ\f^";
        objectArray[12] = "\u0019\u001czZ(\u0018J\u000e$kp'\u001f\u001ev\u000f-\u0019\\\u0005s\u0004M";
        objectArray[13] = "3@\\B\u0011@`R\u0002s08C\u007fx5;(KmesK\u000fi\u0001\\L\u0018\u001d7";
        objectArray[14] = "Z\u0003\u0012\u000e9?\t\u0011L?\u0017D(:-~\u001aO221a\u0011F94-n\\?\u0015\u0016FZcl\u0007H";
        objectArray[15] = "\n\u000bY\u0017\u001cVMS\u0011\b|NY\b\u001c\u0003;^0W\n\t\u0006YPU\u000fR\u00180\u000b\u001cQT\u0007_\u000b\u000fP\u0005|\nWT\u0018\u000e\u001aM\u000f\u001c\u0007n";
        Object[] objectArray2 = objectArray;
        objectArray[16] = "\u0005/\n`w@V=TQS3~\u0012onb\u001a\u000b:P=pD";
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
            case 0 -> 2;
            case 1 -> 51;
            case 2 -> 5;
            case 3 -> 28;
            case 4 -> 53;
            case 5 -> 54;
            case 6 -> 57;
            case 7 -> 12;
            case 8 -> 22;
            case 9 -> 40;
            case 10 -> 35;
            case 11 -> 36;
            case 12 -> 34;
            case 13 -> 44;
            case 14 -> 15;
            case 15 -> 9;
            case 16 -> 61;
            case 17 -> 49;
            case 18 -> 18;
            case 19 -> 8;
            case 20 -> 46;
            case 21 -> 43;
            case 22 -> 21;
            case 23 -> 19;
            case 24 -> 11;
            case 25 -> 23;
            case 26 -> 16;
            case 27 -> 56;
            case 28 -> 13;
            case 29 -> 59;
            case 30 -> 27;
            case 31 -> 0;
            case 32 -> 25;
            case 33 -> 50;
            case 34 -> 37;
            case 35 -> 4;
            case 36 -> 29;
            case 37 -> 38;
            case 38 -> 20;
            case 39 -> 24;
            case 40 -> 33;
            case 41 -> 47;
            case 42 -> 52;
            case 43 -> 30;
            case 44 -> 17;
            case 45 -> 42;
            case 46 -> 6;
            case 47 -> 39;
            case 48 -> 58;
            case 49 -> 10;
            case 50 -> 45;
            case 51 -> 26;
            case 52 -> 1;
            case 53 -> 41;
            case 54 -> 14;
            case 55 -> 3;
            case 56 -> 62;
            case 57 -> 32;
            case 58 -> 7;
            case 59 -> 55;
            case 60 -> 60;
            case 61 -> 48;
            case 62 -> 63;
            default -> 31;
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
        _0i.f[n3] = new String(cArray);
        return n3;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _0i.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x44CE;
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
                throw new RuntimeException("dev/krypton/0i", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _0i.c[n2] = n3;
        }
        return c[n2];
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
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

    private static _0i[] cfr_renamed_8() {
        long l2 = a ^ 0x6664CEC829C8L;
        _0i[] iArray = new _0i[_0i.a("d", 16630, (long)(0x5778A9B638C17DCFL ^ l2))];
        iArray[0] = _0i.b("\u00fe", -436194671993784822L, (long)l2);
        iArray[1] = _0i.b("\u00fe", -435173546905748022L, (long)l2);
        iArray[2] = _0i.b("\u00fe", -434687944944759505L, (long)l2);
        iArray[3] = _0i.b("\u00fe", -435522900286842844L, (long)l2);
        iArray[4] = _0i.b("\u00fe", -435710802439432354L, (long)l2);
        iArray[5] = _0i.b("\u00fe", -435599089190238459L, (long)l2);
        iArray[_0i.a("d", 9938, (long)(0x61D463CB9E861BE8L ^ l2))] = _0i.b("\u00fe", -435439380170542726L, (long)l2);
        return iArray;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_0i.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_0i.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

