/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
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

public class _8h
extends Enum {
    public static final _8h north;
    public static final _8h south;
    public static final _8h east;
    public static final _8h west;
    public static final _8h northeast;
    public static final _8h northwest;
    public static final _8h southeast;
    public static final _8h southwest;
    private static final _8h[] cfr_renamed_3;
    private static String cfr_renamed_1;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static final Object[] e;
    private static final String[] f;

    /*
     * Exception decompiling
     */
    public _8h cfr_renamed_5() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _8h() {
        void cfr_renamed_27;
        void cfr_renamed_28;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    block19: {
                        _8h.a = l.a(6048617682996198840L, 4521074016680775753L, MethodHandles.lookup().lookupClass()).a(195216132345387L);
                        var20 = _8h.a ^ 122175825464028L;
                        _8h.e = new Object[20];
                        _8h.f = new String[20];
                        _8h.a();
                        if (_8h.cfr_renamed_4() != null) {
                            _8h.cfr_renamed_8("o5GEt");
                        }
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
                        var11_3 = new String[8];
                        var17_4 = 0;
                        var16_5 = "\u00ec\u00a9\u00bc@\u0092L\u00f2\u008d\b\u00dbl\u00af3`t\u00d0\u00a7\u0010z\u00e4fZ\u00f3\u0012\u0092\u00b7\u00d8\u00cc1\u00fc\u00b86\u00d5\u00ad\u0010\u0005RRZ\u001d\u001a\u00ee\u00f7G\u00d98\u000e\u00a8\u00e1A\u00c4\b\u008e\u00dca\u00ca=\u0092\u0098:\u0010\u00dd\u008f\u00f0\u00fb\u0017\u00e0\u00b4\u00f6\u00d0mL+\u007f\u00f5\u00aa\u00fc";
                        var18_6 = "\u00ec\u00a9\u00bc@\u0092L\u00f2\u008d\b\u00dbl\u00af3`t\u00d0\u00a7\u0010z\u00e4fZ\u00f3\u0012\u0092\u00b7\u00d8\u00cc1\u00fc\u00b86\u00d5\u00ad\u0010\u0005RRZ\u001d\u001a\u00ee\u00f7G\u00d98\u000e\u00a8\u00e1A\u00c4\b\u008e\u00dca\u00ca=\u0092\u0098:\u0010\u00dd\u008f\u00f0\u00fb\u0017\u00e0\u00b4\u00f6\u00d0mL+\u007f\u00f5\u00aa\u00fc".length();
                        var15_7 = 8;
                        var14_8 = -1;
lbl24:
                        // 2 sources

                        while (true) {
                            v3 = ++var14_8;
                            v4 = var16_5.substring(v3, v3 + var15_7);
                            v5 = -1;
                            break block19;
                            break;
                        }
lbl29:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = _8h.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "F\u0018\u00e1\u00d0\\\u00c9\u008bW\u0010\u0005\u009c\u0096\f*\u009cP\u00c0i\u00d1\\\u00f3e\u00f9\u0013\u00a4";
                            var18_6 = "F\u0018\u00e1\u00d0\\\u00c9\u008bW\u0010\u0005\u009c\u0096\f*\u009cP\u00c0i\u00d1\\\u00f3e\u00f9\u0013\u00a4".length();
                            var15_7 = 8;
                            var14_8 = -1;
lbl38:
                            // 2 sources

                            while (true) {
                                v6 = ++var14_8;
                                v4 = var16_5.substring(v6, v6 + var15_7);
                                v5 = 0;
                                break block19;
                                break;
                            }
                            break;
                        }
lbl43:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = _8h.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            break block20;
                            break;
                        }
                    }
                    var19_9 = var12_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                _8h.d = new HashMap<K, V>(13);
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
                var6_12 = new long[5];
                var3_13 = 0;
                var4_14 = "\u00fes\u00f9\u00ff\u001d\u00c2Y\u0090\u009f\u00e2\u0091B\u008bf\u00b4\u00c2\u00043\u00c8i\u0095\u00aa\u00f7\u00d6";
                var5_15 = "\u00fes\u00f9\u00ff\u001d\u00c2Y\u0090\u009f\u00e2\u0091B\u008bf\u00b4\u00c2\u00043\u00c8i\u0095\u00aa\u00f7\u00d6".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v10 = var6_12;
                    v11 = var3_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block21;
                    break;
                }
lbl80:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "G\u00ee,v\u0003\u0094\u0097\u008d(~\u00fa\u00ce\u00fa-t'";
                    var5_15 = "G\u00ee,v\u0003\u0094\u0097\u008d(~\u00fa\u00ce\u00fa-t'".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v10 = var6_12;
                        v11 = var3_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block21;
                        break;
                    }
                    break;
                }
lbl93:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    break block22;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl106:
                // 1 sources

                ** continue;
            }
        }
        _8h.b = var6_12;
        _8h.c = new Integer[5];
        _8h.north = new _8h(var11_3[6], 0);
        _8h.south = new _8h(var11_3[4], 1);
        _8h.east = new _8h(var11_3[1], 2);
        _8h.west = new _8h(var11_3[0], 3);
        _8h.northeast = new _8h(var11_3[2], 4);
        _8h.northwest = new _8h(var11_3[5], 5);
        _8h.southeast = new _8h(var11_3[3], (int)_8h.a("h", (int)22874, (long)(153249467429771097L ^ var20)));
        _8h.southwest = new _8h(var11_3[7], (int)_8h.a("h", (int)10865, (long)(4368206427796907121L ^ var20)));
        _8h.cfr_renamed_3 = _8h.b("R", (long)-6496635952798022439L, (long)var20);
    }

    public static _8h[] values() {
        long l2 = a ^ 0x4BB857785BA5L;
        return (_8h[])((Enum)((Object)_8h.b("a", -5428646637041238878L, (long)l2))).clone();
    }

    public static _8h valueOf(String string) {
        long l2 = a ^ 0x2D61BEEF3364L;
        return (_8h)((Object)_8h.b("R", _8h.class, (Object)string, -2562643770600237917L, (long)l2));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8h" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _8h.a(l2, l3);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                _8h.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _8h.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _8h.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _8h.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _8h.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _8h.a(l2, l3);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = _8h.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _8h.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _8h.a(clazz3, string2, clazz2)) != null) {
                    _8h.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _8h.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _8h.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _8h.b(497567259913927L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _8h.a(l2, l3);
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
                clazz3 = _8h.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _8h.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _8h.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _8h.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _8h.b(497567259913927L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _8h.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _8h.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _8h.b(497567259913927L, 0L);
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8h" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ce' || c == '\u00df' || c == 'a' || c == '\u00d8') {
                field = _8h.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ce' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00df' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'a' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _8h.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ca' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'R' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _8h.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _8h.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x2BD4;
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
                throw new RuntimeException("dev/krypton/8h", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _8h.c[n2] = n3;
        }
        return c[n2];
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
            case 0 -> 58;
            case 1 -> 52;
            case 2 -> 56;
            case 3 -> 59;
            case 4 -> 61;
            case 5 -> 10;
            case 6 -> 33;
            case 7 -> 5;
            case 8 -> 26;
            case 9 -> 25;
            case 10 -> 31;
            case 11 -> 55;
            case 12 -> 37;
            case 13 -> 3;
            case 14 -> 2;
            case 15 -> 44;
            case 16 -> 9;
            case 17 -> 46;
            case 18 -> 50;
            case 19 -> 17;
            case 20 -> 62;
            case 21 -> 34;
            case 22 -> 19;
            case 23 -> 24;
            case 24 -> 0;
            case 25 -> 20;
            case 26 -> 15;
            case 27 -> 39;
            case 28 -> 41;
            case 29 -> 6;
            case 30 -> 43;
            case 31 -> 16;
            case 32 -> 29;
            case 33 -> 49;
            case 34 -> 51;
            case 35 -> 30;
            case 36 -> 53;
            case 37 -> 18;
            case 38 -> 36;
            case 39 -> 57;
            case 40 -> 13;
            case 41 -> 32;
            case 42 -> 47;
            case 43 -> 11;
            case 44 -> 28;
            case 45 -> 45;
            case 46 -> 63;
            case 47 -> 48;
            case 48 -> 7;
            case 49 -> 23;
            case 50 -> 54;
            case 51 -> 14;
            case 52 -> 38;
            case 53 -> 8;
            case 54 -> 4;
            case 55 -> 22;
            case 56 -> 27;
            case 57 -> 1;
            case 58 -> 40;
            case 59 -> 21;
            case 60 -> 42;
            case 61 -> 60;
            case 62 -> 12;
            default -> 35;
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
        _8h.f[n3] = new String(cArray);
        return n3;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "zM\u0013Hw8gX\u0011\trd&@";
        objectArray[1] = Integer.TYPE;
        _8h.f[1] = "java/lang/Integer";
        objectArray[2] = "%C\tg\u001c\n\u0015}\u0014r\u001eK\u0010!UjQ";
        objectArray[3] = "\u000b;./l\u0007;\u00053:nF>Yr\"!";
        objectArray[4] = "9xw-!%2wfbJ'&t";
        objectArray[5] = "\u001d]`#\u001e~\u0016Rqls~\u0016Oe";
        objectArray[6] = "\nm\u0013D^a\u0001b\u0002\u000b#y\u0012e\u000bB";
        objectArray[7] = "\u0010\u0016Qgh\\\u001b\u0019@(\tR\u0010\u0012Dr";
        objectArray[8] = "\u001f\u0011OkJVZQ\u0018TKZ^SF9YF_/\u001ajY\u0002YD_*\u000e";
        objectArray[9] = "\\u\u0016\u00003u\u00195A?.d\f*\u0019V-\u001eY{\r^,$\u000er\u0012NI";
        objectArray[10] = "\u001c\u0014\u000fl_ YTXSZ&[Vfo\u001b\"\u001fP\r*[u";
        objectArray[11] = "~uU\u001ebD;5\u0002!~H87\\LqT>K\u0000\u001fq\u00108 E_&";
        objectArray[12] = "z)PL;Q?i\u0007s:];kYs}\u0004/(C\u00188Dx";
        objectArray[13] = "Ke@ge\u0001\u000e%\u0017X/jM`V8f\u0016\nc\u00103\u001f";
        objectArray[14] = "H\u001eQ0yH\r^\u0006\u000feD\u000e\\X\u000f?\u001d\u001d\u001fBdz]J";
        objectArray[15] = "s{HMg\u007fw~\u0002N\u0002>!$ONE.H{@_z%u/UM|@t/L]r+\"!C^\u0002{s:\\F=\u007fvp_#";
        objectArray[16] = "gFy/,\u0010\"\u0006.\u00100\u001c!\u0004po;\u0000'x,.?D!\u0013inh";
        objectArray[17] = "}\u00033O,\u001f8Cdp;\u001d:AZLh\u001d~G1\t(J";
        objectArray[18] = "\u0005oy$%5@/.\u001be^\u0003jo{&\"Di)p";
        Object[] objectArray2 = objectArray;
        objectArray[19] = "Y \b>\n'\u001c`_\u0001\u000b+\u0018b\u0001~\u001d7\u0019\u001e]?\u0019s\u001fu\u0018\u007fN";
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

    public static String cfr_renamed_4() {
        return cfr_renamed_1;
    }

    public static void cfr_renamed_8(String string) {
        cfr_renamed_1 = string;
    }

    private static _8h[] dev_krypton_8h_arr_8() {
        long l2 = a ^ 0x7565FDBD647CL;
        _8h[] hArray = new _8h[_8h.a("h", 25277, (long)(0x5D924E7139CDC21CL ^ l2))];
        hArray[0] = _8h.b("a", -8397095213749594324L, (long)l2);
        hArray[1] = _8h.b("a", -8397201287826971960L, (long)l2);
        hArray[2] = _8h.b("a", -8399096974374243333L, (long)l2);
        hArray[3] = _8h.b("a", -8397316519354044779L, (long)l2);
        hArray[4] = _8h.b("a", -8397305522802987753L, (long)l2);
        hArray[5] = _8h.b("a", -8399168737179994912L, (long)l2);
        hArray[_8h.a("h", 30304, (long)(0x7BC4FFDD791056C2L ^ l2))] = _8h.b("a", -8397462658521320679L, (long)l2);
        hArray[_8h.a("h", 9960, (long)(0x775F89EF3AAA864CL ^ l2))] = _8h.b("a", -8398995168215248524L, (long)l2);
        return hArray;
    }

    /*
     * Exception decompiling
     */
    public _8h dev_krypton_8h_8() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_8h.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_8h.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

