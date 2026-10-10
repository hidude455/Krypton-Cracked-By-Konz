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

/*
 * Renamed from dev.krypton.4m
 */
public class _4m_0
extends Enum {
    public static final _4m_0 Regular;
    public static final _4m_0 Bold;
    public static final _4m_0 Italic;
    public static final _4m_0 BoldItalic;
    private static final _4m_0[] cfr_renamed_1;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final Object[] e;
    private static final String[] f;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _4m_0() {
        void cfr_renamed_27;
        void cfr_renamed_28;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                _4m_0.a = l.a(2791305683177859153L, 4193225042462754000L, MethodHandles.lookup().lookupClass()).a(172334019242632L);
                var9 = _4m_0.a ^ 1379922141928L;
                _4m_0.e = new Object[19];
                _4m_0.f = new String[19];
                _4m_0.a();
                _4m_0.d = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var9 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var7_3 = new String[10];
                var5_4 = 0;
                var4_5 = "\u0095`c\u0085\u00a4\u0013\u008c\u00db\u00ab\u001fz\"<\u001b\u00b3\u008b@6u\u00e4R\u0092\u00c5K\u008e\u00d3\u0095*\u0000\u00d9\u0089\u0007\u0010Z\u000b\u00aa/9\u008e x\u0003\u008f\u00ea\u00cd\n\u00b2\b\u001f\u0010\u00b6\u00d8\u00bfk\u00ab\u00c7|\n\u001f\u0086M\u0088\u0017J\u00bd\u00d4\u0010\u000fj\u00ab\u00bfPM!\u00b3\u008f\u00e3\u0011\u00bc\u00e0'\u00c7L\u0018\u00e2\u0096\u0017\u0003\u0080c\u009fm\u00b3\u0089\u007f\u0084e\u00f5\u0007`\u00fb\u00f1\u00cc\u001cCl\u00ce\u007f i\u00fd\f\u00c7\u00f1\u009a\u00aa<}v\u009e\u00d79L\u00ca7i\u001d\u001av\u00db\u009aE\u00c1%79\u00e5\u00e2\u0006#\r\u0010\u00b0\u008e\u009e^\u00ca\u009e..,\u00ef\u0081\u001f\u00be\u00eb\u00cb\u00f7\u0018\u00dd\u00b6:\u009f\u00ea\u00db7\u008f \u00f1CNt\u009ek\u00a8\u0011\u00d9y(K,\u001c#";
                var6_6 = "\u0095`c\u0085\u00a4\u0013\u008c\u00db\u00ab\u001fz\"<\u001b\u00b3\u008b@6u\u00e4R\u0092\u00c5K\u008e\u00d3\u0095*\u0000\u00d9\u0089\u0007\u0010Z\u000b\u00aa/9\u008e x\u0003\u008f\u00ea\u00cd\n\u00b2\b\u001f\u0010\u00b6\u00d8\u00bfk\u00ab\u00c7|\n\u001f\u0086M\u0088\u0017J\u00bd\u00d4\u0010\u000fj\u00ab\u00bfPM!\u00b3\u008f\u00e3\u0011\u00bc\u00e0'\u00c7L\u0018\u00e2\u0096\u0017\u0003\u0080c\u009fm\u00b3\u0089\u007f\u0084e\u00f5\u0007`\u00fb\u00f1\u00cc\u001cCl\u00ce\u007f i\u00fd\f\u00c7\u00f1\u009a\u00aa<}v\u009e\u00d79L\u00ca7i\u001d\u001av\u00db\u009aE\u00c1%79\u00e5\u00e2\u0006#\r\u0010\u00b0\u008e\u009e^\u00ca\u009e..,\u00ef\u0081\u001f\u00be\u00eb\u00cb\u00f7\u0018\u00dd\u00b6:\u009f\u00ea\u00db7\u008f \u00f1CNt\u009ek\u00a8\u0011\u00d9y(K,\u001c#".length();
                var3_7 = 32;
                var2_8 = -1;
lbl23:
                // 2 sources

                while (true) {
                    v3 = ++var2_8;
                    v4 = var4_5.substring(v3, v3 + var3_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = _4m_0.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u00f2\u00f5\u0015H\u0082\u00e0\u00d0\u008e=\u00a7G\u00e1{\u0015C\u00d0\u0010E\u0099\u00c7\u00c9R\u0007\u0092\u00bf\u00e1\u00ac\u00b2g<K\na";
                    var6_6 = "\u00f2\u00f5\u0015H\u0082\u00e0\u00d0\u008e=\u00a7G\u00e1{\u0015C\u00d0\u0010E\u0099\u00c7\u00c9R\u0007\u0092\u00bf\u00e1\u00ac\u00b2g<K\na".length();
                    var3_7 = 16;
                    var2_8 = -1;
lbl37:
                    // 2 sources

                    while (true) {
                        v6 = ++var2_8;
                        v4 = var4_5.substring(v6, v6 + var3_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl42:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = _4m_0.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_9 = var0_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl54:
                // 1 sources

                ** continue;
            }
        }
        _4m_0.b = var7_3;
        _4m_0.c = new String[10];
        _4m_0.Regular = new _4m_0((String)_4m_0.a("q", (int)12276, (long)(3498614572314235572L ^ var9)), 0);
        _4m_0.Bold = new _4m_0((String)_4m_0.a("q", (int)27062, (long)(374284359308465393L ^ var9)), 1);
        _4m_0.Italic = new _4m_0((String)_4m_0.a("q", (int)15001, (long)(6105532892821293008L ^ var9)), 2);
        _4m_0.BoldItalic = new _4m_0((String)_4m_0.a("q", (int)8728, (long)(3084226944173186905L ^ var9)), 3);
        _4m_0.cfr_renamed_1 = _4m_0.b("F", (long)-3105457073317574790L, (long)var9);
    }

    /*
     * Exception decompiling
     */
    public String toString() {
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

    public static _4m_0[] values() {
        long l2 = a ^ 0x581D7537CC1EL;
        return (_4m_0[])((Enum)((Object)_4m_0.b("\u00df", -427735208210851265L, (long)l2))).clone();
    }

    public static _4m_0 valueOf(String string) {
        long l2 = a ^ 0x67BBE07B740EL;
        return (_4m_0)((Object)_4m_0.b("F", _4m_0.class, (Object)string, 4757894247558147256L, (long)l2));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/4m" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _4m_0.a(l2, l3);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                _4m_0.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _4m_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _4m_0.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _4m_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _4m_0.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _4m_0.a(l2, l3);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = _4m_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _4m_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _4m_0.a(clazz3, string2, clazz2)) != null) {
                    _4m_0.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _4m_0.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _4m_0.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _4m_0.b(519486516268902L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _4m_0.a(l2, l3);
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
                clazz3 = _4m_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _4m_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _4m_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _4m_0.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _4m_0.b(519486516268902L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _4m_0.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _4m_0.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _4m_0.b(519486516268902L, 0L);
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
            case 0 -> 60;
            case 1 -> 27;
            case 2 -> 49;
            case 3 -> 19;
            case 4 -> 61;
            case 5 -> 62;
            case 6 -> 9;
            case 7 -> 24;
            case 8 -> 21;
            case 9 -> 43;
            case 10 -> 14;
            case 11 -> 48;
            case 12 -> 57;
            case 13 -> 17;
            case 14 -> 3;
            case 15 -> 18;
            case 16 -> 2;
            case 17 -> 26;
            case 18 -> 38;
            case 19 -> 11;
            case 20 -> 7;
            case 21 -> 25;
            case 22 -> 42;
            case 23 -> 16;
            case 24 -> 23;
            case 25 -> 13;
            case 26 -> 53;
            case 27 -> 15;
            case 28 -> 50;
            case 29 -> 58;
            case 30 -> 33;
            case 31 -> 8;
            case 32 -> 46;
            case 33 -> 29;
            case 34 -> 36;
            case 35 -> 5;
            case 36 -> 59;
            case 37 -> 35;
            case 38 -> 4;
            case 39 -> 45;
            case 40 -> 30;
            case 41 -> 1;
            case 42 -> 63;
            case 43 -> 10;
            case 44 -> 28;
            case 45 -> 12;
            case 46 -> 34;
            case 47 -> 32;
            case 48 -> 37;
            case 49 -> 31;
            case 50 -> 40;
            case 51 -> 0;
            case 52 -> 20;
            case 53 -> 22;
            case 54 -> 39;
            case 55 -> 44;
            case 56 -> 56;
            case 57 -> 51;
            case 58 -> 55;
            case 59 -> 47;
            case 60 -> 54;
            case 61 -> 52;
            case 62 -> 6;
            default -> 41;
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
        _4m_0.f[n3] = new String(cArray);
        return n3;
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'M' || c == '\u00d2' || c == '\u00df' || c == 'y') {
                field = _4m_0.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'M' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d2' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00df' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _4m_0.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'A' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'F' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _4m_0.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x69A4;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l3 = Thread.currentThread().threadId();
                objectArray = (Object[])d.get(l3);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/4m", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l2 >>> 56);
            for (int j = 1; j < 8; ++j) {
                byArray[j] = (byte)(l2 << j * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            _4m_0.c[n2] = _4m_0.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _4m_0.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/4m" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "9hbv)E$}`7,\u0019i`";
        objectArray[1] = Integer.TYPE;
        _4m_0.f[1] = "java/lang/Integer";
        objectArray[2] = "%A?@!].N.\u000fJ_:M";
        objectArray[3] = "t\u0002dLxb\u007f\ru\u0003\u0015b\u007f\u0010a";
        objectArray[4] = "\u0010\u00056\u000e\u0017M\u001b\n'AjU\b\r.\b";
        objectArray[5] = "R\u000bzrWOb5ggU\u000egi*z\u001a";
        objectArray[6] = "q^C%9/A`^0;nD<\u0013-t";
        objectArray[7] = "\u0002>\u0015\nYS\t1\u0004E8]\u0002:\u0000\u001f";
        objectArray[8] = Boolean.TYPE;
        _4m_0.f[8] = "java/lang/Boolean";
        objectArray[9] = "\"U%Xyv<N:5$\u0007{N$Kdh-X=\\\u001f";
        objectArray[10] = "\u0011|6V\u0013V\u000fg);\u0012]\u0018o.R\u0011'M4w\u0001\u0005E\u0006js]u";
        objectArray[11] = "\u0012.F\u001e\ta\f5Ys%w\u00130y\u000f\u0006t\u001678\u0016\u001dn\u001a:I\b\u0006q";
        objectArray[12] = "\u0006.\u0018\u001a\u0002~\u00185\u0007w.h\u00070f\u0012\u0016q\u000e:\u0017\f\rn";
        objectArray[13] = "z\u0003\u0015\u001fIjd\u0018\nr\u001e\u001b#\u0018\u0014\fTtu\u000e\r\u001b";
        objectArray[14] = "\u001cAk3\u001b#\u0017\u00153&axNT7\u0002\u0006tJ/ns^\"WM%-Z~'";
        objectArray[15] = "5\u001czkm\\+\u0007e\u0006JQ9\nem\u000bH\"\u0010i`zV9\u000f";
        objectArray[16] = "\u0006d\u0019u=/\u0018\u007f\u0006\u0018\u00013\fk\u0003q!^\u0006d\u0019u=/\u0018\u007f\u0006";
        objectArray[17] = "6Ds\u000ee@iXrUXXfG?\\\u001fH\u000f\u0019(\u0000!]t@,\u0001;&4M~K\"\u001d?\u0019&^X\u001fh\u0012}\f>@t\u0013&1";
        Object[] objectArray2 = objectArray;
        objectArray[18] = "jY\u001c]w1a\rDH\rg(JICv\nl\u000b\u001d\u001bq5hVDF\r72Y\u0010Jc6#PF'";
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

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * Exception decompiling
     */
    public static _4m_0 cfr_renamed_4(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 10[SWITCH]
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

    private static _4m_0[] cfr_renamed_6() {
        long l2 = a ^ 0x7D1B513610E3L;
        return new _4m_0[]{_4m_0.b("\u00df", 2804104794330338310L, (long)l2), _4m_0.b("\u00df", 2804945328993702244L, (long)l2), _4m_0.b("\u00df", 2805129553964692132L, (long)l2), _4m_0.b("\u00df", 2804877084563222191L, (long)l2)};
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_4m_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_4m_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

