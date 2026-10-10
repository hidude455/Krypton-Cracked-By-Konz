/*
 * Decompiled with CFR 0.152.
 */
package dev.krypton;

import dev.krypton._4;
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

public class _8t {
    private final String cfr_renamed_1;
    private int cfr_renamed_6;
    private static final long a;
    private static final String b;
    private static final long[] c;
    private static final Integer[] d;
    private static final Map e;
    private static final Object[] f;
    private static final String[] g;

    /*
     * Unable to fully structure code
     */
    private void cfr_renamed_5(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        var2_2 = _8t.a ^ var2_2;
        var4_3 = _4.cfr_renamed_3();
        var5_4 = _8t.b("l", (Object)_8t.b("\u00f3", (Object)this, (long)-4997839656916956713L, (long)var2_2), (long)-4998419550224405659L, (long)var2_2);
        while (_8t.b("\u00f3", (Object)this, (long)-4997410242004420958L, (long)var2_2) < var5_4) {
            block6: {
                try {
                    try {
                        v0 = this;
                        if (var4_3 == null) break block6;
                        if (_8t.b("\u00ce", (char)_8t.b("l", (Object)_8t.b("\u00f3", (Object)v0, (long)-4997839656916956713L, (long)var2_2), (int)_8t.b("\u00f3", (Object)this, (long)-4997410242004420958L, (long)var2_2), (long)-4997760619310866201L, (long)var2_2), (long)-4997563195882865446L, (long)var2_2) == false) break;
                    }
                    catch (IllegalStateException v1) {
                        throw _8t.a(v1);
                    }
                    v0 = this;
                }
                catch (IllegalStateException v2) {
                    throw _8t.a(v2);
                }
            }
            _8t.b("\u00ec", (Object)v0, (int)(_8t.b("\u00f3", (Object)v0, (long)-4997410242004420958L, (long)var2_2) + true), (long)-4997410242004420958L, (long)var2_2);
lbl21:
            // 2 sources

            ** while (var4_3 == null)
lbl22:
            // 1 sources

        }
lbl23:
        // 3 sources

        if (var2_2 < 0L) ** GOTO lbl21
    }

    _8t(short s, String string, char c, int n) {
        long l2 = ((long)s << 48 | (long)c << 48 >>> 16 | (long)n << 32 >>> 32) ^ a;
        long l3 = l2 ^ 0x31867572F696L;
        this.cfr_renamed_1 = string;
        Object[] objectArray = new Object[1];
        objectArray[0] = l3;
        _8t.b("l", (Object)this, (Object)objectArray, 4232021353724743799L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                block12: {
                    _8t.a = l.a(4684351431551648950L, -7424037153091775570L, MethodHandles.lookup().lookupClass()).a(74498954110852L);
                    _8t.f = new Object[22];
                    _8t.g = new String[22];
                    _8t.a();
                    var11 = _8t.a ^ 89895989260083L;
                    var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var11 >>> 56);
                    for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                        v2 = v2;
                        v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                    }
                    break block12;
lbl16:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var15_3 = var13_1.doFinal("\u00dd\u00ed[l\n7fs%o\u00ca\u00d3\u000b\u00d9\u008a\u0088\u008aJ\u00b6z\u00c2\u00bc\u0099\u00fe\u009e\u00ab\u00c3\u00d6\u008fT\u00d5\u00b9\u0080T\u00ee\u00ab\u00d4K\u00f3\u00c0".getBytes("ISO-8859-1"));
                ** while (true)
                _8t.b = _8t.a(var15_3).intern();
                _8t.e = new HashMap<K, V>(13);
                var0_4 = Cipher.getInstance("DES/CBC/NoPadding");
                v3 = SecretKeyFactory.getInstance("DES");
                v4 = new byte[8];
                v5 = v4;
                v4[0] = (byte)(var11 >>> 56);
                for (var1_5 = 1; var1_5 < 8; ++var1_5) {
                    v5 = v5;
                    v5[var1_5] = (byte)(var11 << var1_5 * 8 >>> 56);
                }
                var0_4.init(2, (Key)v3.generateSecret(new DESKeySpec(v5)), new IvParameterSpec(new byte[8]));
                var6_6 = new long[16];
                var3_7 = 0;
                var4_8 = "L\u00c9\u00ac\u00cd\u0006\u00d1\u00c6\b\u00ec\u009e\u001a\u0012=zs{\u00e2\u00ec\u00913\u00ddS\u00d3^\u00a6\u00ce\u000f#\u0083W\u0087m\u00a3c$7\u00a9\u0004\u008b(9\u008f\f\u00f5\u00999sS\u00e9\u00b0\b\u00f4\u008e+|\u00ea2o\u00e6\u00a5\u000e.+\u0003^a\u00d6Q\u0015!C\u00d1d\u00a1\r<]\r<\u00b6\u00c7%\u009c\u00c5|\u007f\u0081\u0089\"\u00cd\u00c3I.F\u00c6Y$BO\u000f!Ff\\\u0002\u00bb`D\u00d3}9{";
                var5_9 = "L\u00c9\u00ac\u00cd\u0006\u00d1\u00c6\b\u00ec\u009e\u001a\u0012=zs{\u00e2\u00ec\u00913\u00ddS\u00d3^\u00a6\u00ce\u000f#\u0083W\u0087m\u00a3c$7\u00a9\u0004\u008b(9\u008f\f\u00f5\u00999sS\u00e9\u00b0\b\u00f4\u008e+|\u00ea2o\u00e6\u00a5\u000e.+\u0003^a\u00d6Q\u0015!C\u00d1d\u00a1\r<]\r<\u00b6\u00c7%\u009c\u00c5|\u007f\u0081\u0089\"\u00cd\u00c3I.F\u00c6Y$BO\u000f!Ff\\\u0002\u00bb`D\u00d3}9{".length();
                var2_10 = 0;
                while (true) {
                    var7_11 = var4_8.substring(var2_10, var2_10 += 8).getBytes("ISO-8859-1");
                    v6 = var6_6;
                    v7 = var3_7++;
                    v8 = ((long)var7_11[0] & 255L) << 56 | ((long)var7_11[1] & 255L) << 48 | ((long)var7_11[2] & 255L) << 40 | ((long)var7_11[3] & 255L) << 32 | ((long)var7_11[4] & 255L) << 24 | ((long)var7_11[5] & 255L) << 16 | ((long)var7_11[6] & 255L) << 8 | (long)var7_11[7] & 255L;
                    v9 = -1;
                    break block10;
                    break;
                }
lbl47:
                // 1 sources

                while (true) {
                    v6[v7] = v10;
                    if (var2_10 < var5_9) ** continue;
                    var4_8 = "(\u00fdj\u0081\u008d\u00e8\u00c8\u00f2\u00d1H\u00a0\u0013\u00de\u00d0\u00b0\u00ec";
                    var5_9 = "(\u00fdj\u0081\u008d\u00e8\u00c8\u00f2\u00d1H\u00a0\u0013\u00de\u00d0\u00b0\u00ec".length();
                    var2_10 = 0;
                    while (true) {
                        var7_11 = var4_8.substring(var2_10, var2_10 += 8).getBytes("ISO-8859-1");
                        v6 = var6_6;
                        v7 = var3_7++;
                        v8 = ((long)var7_11[0] & 255L) << 56 | ((long)var7_11[1] & 255L) << 48 | ((long)var7_11[2] & 255L) << 40 | ((long)var7_11[3] & 255L) << 32 | ((long)var7_11[4] & 255L) << 24 | ((long)var7_11[5] & 255L) << 16 | ((long)var7_11[6] & 255L) << 8 | (long)var7_11[7] & 255L;
                        v9 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl60:
                // 1 sources

                while (true) {
                    v6[v7] = v10;
                    if (var2_10 < var5_9) ** continue;
                    break block11;
                    break;
                }
            }
            var8_12 = v8;
            var10_13 = var0_4.doFinal(new byte[]{(byte)(var8_12 >>> 56), (byte)(var8_12 >>> 48), (byte)(var8_12 >>> 40), (byte)(var8_12 >>> 32), (byte)(var8_12 >>> 24), (byte)(var8_12 >>> 16), (byte)(var8_12 >>> 8), (byte)var8_12});
            v10 = ((long)var10_13[0] & 255L) << 56 | ((long)var10_13[1] & 255L) << 48 | ((long)var10_13[2] & 255L) << 40 | ((long)var10_13[3] & 255L) << 32 | ((long)var10_13[4] & 255L) << 24 | ((long)var10_13[5] & 255L) << 16 | ((long)var10_13[6] & 255L) << 8 | (long)var10_13[7] & 255L;
            switch (v9) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl73:
                // 1 sources

                ** continue;
            }
        }
        _8t.c = var6_6;
        _8t.d = new Integer[16];
    }

    /*
     * Exception decompiling
     */
    double cfr_renamed_1(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [61[DOLOOP]], but top level block is 23[TRYBLOCK]
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

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _8t.a(l2, l3);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                _8t.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _8t.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _8t.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8t" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _8t.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _8t.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _8t.a(l2, l3);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = _8t.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _8t.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _8t.a(clazz3, string2, clazz2)) != null) {
                    _8t.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _8t.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _8t.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _8t.b(779268363591283L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _8t.a(l2, l3);
        Object object = f[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = g[n];
                int n3 = string2.indexOf(8);
                clazz3 = _8t.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _8t.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _8t.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _8t.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _8t.b(779268363591283L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _8t.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _8t.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _8t.b(779268363591283L, 0L);
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
            throw new RuntimeException("dev/krypton/8t" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f3' || c == '\u00ec' || c == '\u00dd' || c == 'L') {
                field = _8t.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f3' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ec' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00dd' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _8t.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'l' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ce' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _8t.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _8t.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x668B;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])e.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/8t", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _8t.d[n2] = n3;
        }
        return d[n2];
    }

    private static int a(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (g[n3] != null) {
            return n3;
        }
        Object object = f[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 6;
            case 1 -> 25;
            case 2 -> 22;
            case 3 -> 36;
            case 4 -> 20;
            case 5 -> 13;
            case 6 -> 43;
            case 7 -> 44;
            case 8 -> 46;
            case 9 -> 49;
            case 10 -> 7;
            case 11 -> 18;
            case 12 -> 54;
            case 13 -> 17;
            case 14 -> 48;
            case 15 -> 8;
            case 16 -> 53;
            case 17 -> 15;
            case 18 -> 3;
            case 19 -> 30;
            case 20 -> 57;
            case 21 -> 51;
            case 22 -> 31;
            case 23 -> 34;
            case 24 -> 61;
            case 25 -> 16;
            case 26 -> 40;
            case 27 -> 60;
            case 28 -> 5;
            case 29 -> 2;
            case 30 -> 10;
            case 31 -> 58;
            case 32 -> 41;
            case 33 -> 39;
            case 34 -> 52;
            case 35 -> 21;
            case 36 -> 11;
            case 37 -> 56;
            case 38 -> 19;
            case 39 -> 55;
            case 40 -> 59;
            case 41 -> 38;
            case 42 -> 24;
            case 43 -> 45;
            case 44 -> 9;
            case 45 -> 29;
            case 46 -> 14;
            case 47 -> 4;
            case 48 -> 47;
            case 49 -> 1;
            case 50 -> 0;
            case 51 -> 63;
            case 52 -> 42;
            case 53 -> 37;
            case 54 -> 35;
            case 55 -> 27;
            case 56 -> 33;
            case 57 -> 12;
            case 58 -> 32;
            case 59 -> 28;
            case 60 -> 62;
            case 61 -> 23;
            case 62 -> 26;
            default -> 50;
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
        _8t.g[n3] = new String(cArray);
        return n3;
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
        Object[] objectArray = f;
        f[0] = ":En\u0003U&'PlBPzfT";
        objectArray[1] = "\u00046U,\u0015'q\u0016^#\u0004h\u0010\u0018U(\u00002d";
        objectArray[2] = Void.TYPE;
        _8t.g[2] = "java/lang/Void";
        objectArray[3] = Integer.TYPE;
        _8t.g[3] = "java/lang/Integer";
        objectArray[4] = "wX\u0002Q~x|W\u0013\u001e\u0003`oP\u001aW";
        objectArray[5] = Character.TYPE;
        _8t.g[5] = "java/lang/Character";
        objectArray[6] = "\u000fXM-\u0006D\u0004W\\bk@\u0004KZ/\\M\u0017";
        objectArray[7] = Boolean.TYPE;
        _8t.g[7] = "java/lang/Boolean";
        objectArray[8] = "Q:\u0002QW+Z5\u0013\u001e=(N9\u0018U";
        objectArray[9] = Double.TYPE;
        _8t.g[9] = "java/lang/Double";
        objectArray[10] = "9xn/^\u001eLXe OQ-Vn+K\u000bY";
        objectArray[11] = "|6\u0018\u001a\u0015\u001ew9\tUt\u0010|2\r\u000f";
        objectArray[12] = "X,!p\u0013E@s:\u0011Mu\u0000#:t\u000b\u0016Ewa,uO\u0006*gt\u0012\t@y>\u0011";
        objectArray[13] = "{\"\u0013RF#9a]\\x},?CA\u0018\u0019{4BY\u0012vz(\\\u0002x";
        objectArray[14] = "\u001e-\u001c\u0004`7\\nR\n^vY<X\u0017$lB9#Q3c@<LP/}\u001bV\u0019\u00060iN9\u0018\u001a.2$lXT13\u001e.\u001b\u001a?\r";
        objectArray[15] = "&\u0007[v@'`U\u0015r;;a'\u000b\u007fZ&\u001aWR+T3z\u0015\u001a*]Z'\u0000\u0010.I cPSy;";
        objectArray[16] = "cb+U!z{=04~J;m0Q9)~9k\tGp=dmQ 6{744";
        objectArray[17] = "a\b+Xz\r'Ze\\\u0001\u0011&;z_}\u001d&\u001csUlpa\\!Qh\u0010#\u0014 X\u0001M6\u001e$L{\tf]s>";
        objectArray[18] = "\\\u001cn\u0016\u0010\u001a\u001aP\"^)\u001e\b\u001b(Je\u0001\u001c\u000b7J)\\\u001a^<\u0019\u0013\u001eY\u00102'\u0017\n\u001e\u001ao\\U\u0014\u001d\u0001S";
        objectArray[19] = "f\u001e\u001e@\bi~A\u0005!UY;\u0016\bE\u00046:\n\u0016\u001e";
        objectArray[20] = "l0pY\u001a\f.s>W$]6\"5\u007fX6l&!RNYm:?\t$\nnp _DH&q)6";
        Object[] objectArray2 = objectArray;
        objectArray[21] = "5kL\u001f9_-4W~nohu\u000b\u0011aU*6E\u001f";
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    char char_0(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = a ^ l2) ^ 0x12B95D32E516L;
        CallSite callSite = _8t.b("\u00f3", (Object)this, -290943078384367483L, (long)l2);
        _8t t = this;
        CallSite callSite2 = _8t.b("\u00f3", (Object)t, -290510364800632848L, (long)l2);
        _8t.b("\u00ec", (Object)t, (int)(callSite2 + true), -290510364800632848L, (long)l2);
        CallSite callSite3 = _8t.b("l", (Object)callSite, (int)callSite2, -291004778264501835L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _8t.b("l", (Object)this, (Object)objectArray2, -292691670195783306L, (long)l2);
        return (char)callSite3;
    }

    /*
     * Unable to fully structure code
     */
    private void void_0(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        var2_2 = _8t.a ^ var2_2;
        var4_3 = _4.cfr_renamed_3();
        var5_4 = _8t.b("l", (Object)_8t.b("\u00f3", (Object)this, (long)7523275927495645979L, (long)var2_2), (long)7524981926902069673L, (long)var2_2);
        while (_8t.b("\u00f3", (Object)this, (long)7523739315866149998L, (long)var2_2) < var5_4) {
            block24: {
                block25: {
                    block28: {
                        block27: {
                            block26: {
                                var6_5 = _8t.b("l", (Object)_8t.b("\u00f3", (Object)this, (long)7523275927495645979L, (long)var2_2), (int)_8t.b("\u00f3", (Object)this, (long)7523739315866149998L, (long)var2_2), (long)7523390606873260587L, (long)var2_2);
                                try {
                                    try {
                                        try {
                                            try {
                                                v0 = var4_3;
                                                if (var2_2 < 0L) break block24;
                                                if (v0 == null) break block25;
                                                if (var6_5 != _8t.a("d", (int)5206, (long)(3624394380621322939L ^ var2_2))) {
                                                }
                                                ** GOTO lbl74
                                            }
                                            catch (IllegalStateException v1) {
                                                throw _8t.a(v1);
                                            }
                                            v2 = var6_5;
                                            v3 = _8t.a("d", (int)4499, (long)(2723369724416892796L ^ var2_2));
                                            v4 = var4_3;
                                            if (var2_2 > 0L) {
                                                if (v4 == null) break block26;
                                            }
                                            ** GOTO lbl43
                                        }
                                        catch (IllegalStateException v5) {
                                            throw _8t.a(v5);
                                        }
                                        if (v2 != v3) {
                                        }
                                        ** GOTO lbl74
                                    }
                                    catch (IllegalStateException v6) {
                                        throw _8t.a(v6);
                                    }
                                    v2 = var6_5;
                                    v3 = _8t.a("d", (int)12877, (long)(3226658388202044583L ^ var2_2));
                                }
                                catch (IllegalStateException v7) {
                                    throw _8t.a(v7);
                                }
                            }
                            try {
                                try {
                                    v4 = var4_3;
lbl43:
                                    // 2 sources

                                    if (var2_2 <= 0L) ** GOTO lbl60
                                    if (v4 == null) break block27;
                                    if (v2 != v3) {
                                    }
                                    ** GOTO lbl74
                                }
                                catch (IllegalStateException v8) {
                                    throw _8t.a(v8);
                                }
                                v2 = var6_5;
                                v3 = _8t.a("d", (int)27951, (long)(4099564178813445068L ^ var2_2));
                            }
                            catch (IllegalStateException v9) {
                                throw _8t.a(v9);
                            }
                        }
                        try {
                            try {
                                if (var2_2 <= 0L) break block28;
                                v4 = var4_3;
lbl60:
                                // 2 sources

                                if (v4 == null) break block28;
                                if (v2 != v3) {
                                }
                                ** GOTO lbl74
                            }
                            catch (IllegalStateException v10) {
                                throw _8t.a(v10);
                            }
                            v2 = var6_5;
                            v3 = _8t.a("d", (int)17927, (long)(1541777121646954729L ^ var2_2));
                        }
                        catch (IllegalStateException v11) {
                            throw _8t.a(v11);
                        }
                    }
                    try {
                        if (v2 != v3) break;
lbl74:
                        // 5 sources

                        v12 = this;
                        _8t.b("\u00ec", (Object)v12, (int)(_8t.b("\u00f3", (Object)v12, (long)7523739315866149998L, (long)var2_2) + true), (long)7523739315866149998L, (long)var2_2);
                    }
                    catch (IllegalStateException v13) {
                        throw _8t.a(v13);
                    }
                }
                v0 = var4_3;
            }
            if (v0 != null) continue;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    boolean cfr_renamed_6(Object[] var1_1) {
        block27: {
            block28: {
                block25: {
                    block23: {
                        block24: {
                            var2_2 = (Integer)var1_1[0];
                            var4_3 = (Integer)var1_1[1];
                            var3_4 = (Integer)var1_1[2];
                            var5_5 = ((long)var2_2 << 32 | (long)var4_3 << 48 >>> 32 | (long)var3_4 << 48 >>> 48) ^ _8t.a;
                            var7_6 = _4.cfr_renamed_3();
                            try {
                                try {
                                    v0 = _8t.b("\u00f3", (Object)this, (long)-2970727563549009214L, (long)var5_5);
                                    if (var7_6 == null) break block23;
                                    if (v0 < _8t.b("l", (Object)_8t.b("\u00f3", (Object)this, (long)-2971142555954797129L, (long)var5_5), (long)-2971688287156058363L, (long)var5_5)) break block24;
                                }
                                catch (IllegalStateException v1) {
                                    throw _8t.a(v1);
                                }
                                return false;
                            }
                            catch (IllegalStateException v2) {
                                throw _8t.a(v2);
                            }
                        }
                        v0 = _8t.b("l", (Object)_8t.b("\u00f3", (Object)this, (long)-2971142555954797129L, (long)var5_5), (int)_8t.b("\u00f3", (Object)this, (long)-2970727563549009214L, (long)var5_5), (long)-2971221354099749753L, (long)var5_5);
                    }
                    var8_7 = v0;
                    try {
                        block26: {
                            try {
                                try {
                                    try {
                                        v3 /* !! */  = var8_7;
                                        v4 = _8t.a("d", (int)18935, (long)(5877903331077913015L ^ var5_5));
                                        v5 = var7_6;
                                        if (var4_3 >= 0) {
                                            if (v5 == null) break block25;
                                            if (v3 /* !! */  < v4) break block26;
                                        }
                                        ** GOTO lbl57
                                    }
                                    catch (IllegalStateException v6) {
                                        throw _8t.a(v6);
                                    }
                                    v3 /* !! */  = var8_7;
                                    if (var7_6 == null) break block27;
                                }
                                catch (IllegalStateException v7) {
                                    throw _8t.a(v7);
                                }
                                if (v3 /* !! */  > _8t.a("d", (int)12949, (long)(8758676410269893343L ^ var5_5))) {
                                }
                                ** GOTO lbl-1000
                            }
                            catch (IllegalStateException v8) {
                                throw _8t.a(v8);
                            }
                        }
                        v3 /* !! */  = var8_7;
                        v4 = _8t.a("d", (int)16294, (long)(6977963763981291502L ^ var5_5));
                    }
                    catch (IllegalStateException v9) {
                        throw _8t.a(v9);
                    }
                }
                try {
                    try {
                        try {
                            v5 = var7_6;
lbl57:
                            // 2 sources

                            if (v5 == null) break block28;
                            if (v3 /* !! */  >= v4) {
                            }
                            ** GOTO lbl-1000
                        }
                        catch (IllegalStateException v10) {
                            throw _8t.a(v10);
                        }
                        v3 /* !! */  = var8_7;
                        if (var7_6 == null) break block27;
                    }
                    catch (IllegalStateException v11) {
                        throw _8t.a(v11);
                    }
                    v4 = _8t.a("d", (int)22563, (long)(2811070799453874287L ^ var5_5));
                }
                catch (IllegalStateException v12) {
                    throw _8t.a(v12);
                }
            }
            if (v3 /* !! */  <= v4) lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = (CallSite)true;
            } else lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = (CallSite)false;
            }
        }
        return (boolean)v3 /* !! */ ;
    }

    boolean cfr_renamed_7(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l2 = (Long)objectArray[0];
                long l3 = (l2 = a ^ l2) ^ 0x412FC3664E23L;
                String string = _4.cfr_renamed_3();
                try {
                    try {
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l3;
                        _8t.b("l", (Object)this, (Object)objectArray2, 5820187752453837379L, (long)l2);
                        object = _8t.b("\u00f3", (Object)this, 5819413549183245509L, (long)l2);
                        if (string == null) break block4;
                        if (object >= _8t.b("l", (Object)_8t.b("\u00f3", (Object)this, 5819512019851551664L, (long)l2), 5820093210286178562L, (long)l2)) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw _8t.a(illegalStateException);
                    }
                    object = true;
                    break block4;
                }
                catch (IllegalStateException illegalStateException) {
                    throw _8t.a(illegalStateException);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_8t.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_8t.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

