/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  java.lang.MatchException
 */
package dev.krypton;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import dev.krypton._6z_0;
import dev.krypton._95;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class _9B
extends _95 {
    private final Set cfr_renamed_3;
    private Set cfr_renamed_2;
    private static final long a = l.a(-2830684576202236095L, -7989603845241012927L, MethodHandles.lookup().lookupClass()).a(82023116590019L);
    private static final Object[] c = new Object[39];
    private static final String[] d = new String[39];

    public _9B(int n, Set set, long l2) {
        long l3 = (l2 = a ^ l2) ^ 0x6681EADF2384L;
        int n2 = (int)(l3 >>> 48);
        int n3 = (int)(l3 << 16 >>> 32);
        int n4 = (int)(l3 << 48 >>> 48);
        super((short)n2, n, n3, n4);
        _9B.a("\u00c7", (Object)this, new HashSet(set), 6987567743963523900L, (long)l2);
        this.cfr_renamed_3 = new HashSet(set);
    }

    static {
        _9B.b();
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (d[n3] != null) {
            return n3;
        }
        Object object = c[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 10;
            case 1 -> 44;
            case 2 -> 35;
            case 3 -> 48;
            case 4 -> 20;
            case 5 -> 59;
            case 6 -> 62;
            case 7 -> 51;
            case 8 -> 17;
            case 9 -> 2;
            case 10 -> 53;
            case 11 -> 26;
            case 12 -> 42;
            case 13 -> 23;
            case 14 -> 30;
            case 15 -> 63;
            case 16 -> 7;
            case 17 -> 58;
            case 18 -> 55;
            case 19 -> 22;
            case 20 -> 24;
            case 21 -> 34;
            case 22 -> 54;
            case 23 -> 37;
            case 24 -> 6;
            case 25 -> 60;
            case 26 -> 9;
            case 27 -> 13;
            case 28 -> 50;
            case 29 -> 61;
            case 30 -> 8;
            case 31 -> 47;
            case 32 -> 36;
            case 33 -> 18;
            case 34 -> 0;
            case 35 -> 56;
            case 36 -> 49;
            case 37 -> 15;
            case 38 -> 16;
            case 39 -> 28;
            case 40 -> 40;
            case 41 -> 12;
            case 42 -> 29;
            case 43 -> 46;
            case 44 -> 3;
            case 45 -> 31;
            case 46 -> 14;
            case 47 -> 25;
            case 48 -> 39;
            case 49 -> 11;
            case 50 -> 19;
            case 51 -> 41;
            case 52 -> 27;
            case 53 -> 52;
            case 54 -> 38;
            case 55 -> 32;
            case 56 -> 4;
            case 57 -> 21;
            case 58 -> 43;
            case 59 -> 1;
            case 60 -> 57;
            case 61 -> 5;
            case 62 -> 45;
            default -> 33;
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
        _9B.d[n3] = new String(cArray);
        return n3;
    }

    public void void_9(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        Set set = (Set)objectArray[1];
        long l3 = (l2 = a ^ l2) ^ 0x393897F6C57BL;
        _9B.a("\u00c7", (Object)this, new HashSet(set), -3093253869407117610L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _9B.a("a", (Object)this, (Object)objectArray2, -3093169004927298718L, (long)l2);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'p' || c == '\u00c7' || c == 'l' || c == '\u00df') {
                field = _9B.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'p' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c7' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'l' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _9B.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'a' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static void b() {
        Object[] objectArray = c;
        c[0] = "O9K\u0015\u0001HR,IT\u0004\u0014\u0012i";
        objectArray[1] = " jT\u001b\f{UJ_\u0014\u001d44DT\u001f\u0019n@";
        objectArray[2] = Void.TYPE;
        _9B.d[2] = "java/lang/Void";
        objectArray[3] = "\u000eA}\u0015^\u001a\u0013T\u007fT[FSf";
        objectArray[4] = "\u001e\u0015+\u0018>\u0012\u0000\u001d1WC\u0002\u0000";
        objectArray[5] = "4&.Kfx*.4\u0004;y,\"9Gf^*5=K%";
        objectArray[6] = "(U.J\u0003M6]4\u0005KM,W,BBVlw7E^M/Q*";
        objectArray[7] = "37\u000bYWF-?\u0011\u00166Q33\u001eL\n";
        objectArray[8] = "\u001c\u0019o#~>\u0017\u0016~l\u001f0\u001c\u001dz6";
        objectArray[9] = "O7G\b\u000f6Q?]GG6K5E\u0000N-\u000b\u0010D\u0007B7L9_";
        objectArray[10] = "7T\u0016\u000ey@;\\\u0017E0H'T\u0015\u000eT\\;U:RlN-";
        objectArray[11] = "N4\u007fl\\{P<e#;zA'hy\u001d|";
        objectArray[12] = "\u0003B'/ah\u001dJ=`\u0003t\u001aW";
        objectArray[13] = "\u0000.m\\1\u0003\u001d;o\u001d4_P\u001d";
        objectArray[14] = "z-l\u001buJv%mP<Bj-o\u001bXVv,DYwH|,u";
        objectArray[15] = Boolean.TYPE;
        _9B.d[15] = "java/lang/Boolean";
        objectArray[16] = "\\ ks#hW/z<^pD(su";
        objectArray[17] = "tMthHjiXv)M6&R";
        objectArray[18] = "\u0014 >\u001b`)K,\u007f\u0007\u000fxV<;\u0014s~PQq\u0014j'Pn/\u0010b\u007f*";
        objectArray[19] = "6KY.X5o\f\u000091\"q\n\t5TY6\u0000\u0007=N2b\u0010\u0004-1";
        objectArray[20] = "F(r[[\f\u00128qK$\t\u001a\"\\SO\u0007}d~\u0002^Z\u0002;o\u0004\u001cgD:+]U\u0006\u001e$l\u0001$";
        objectArray[21] = "\u001aPyO;([\\)\u0017\u00061VM3Az7P yAcnP\u001f'Ek6*";
        objectArray[22] = "}p|\u0018ox)`\u007f\b\u0010h!zc\u0014|\u0013}p|\u0018ox)`\u007f\b\u0010";
        objectArray[23] = "/LA\u00142O/H\u0000\rHH\u001e\u001dJX/Jf\\F\bw";
        objectArray[24] = "(\tpKFCv\u001f|\\;Lb3zK]dc\u000bh];D}\u001fdFC\u001dk\ry,";
        objectArray[25] = "`\u0010_l\u0001\u0014>\u0014W4{M=\tFRFO1\t\u000b;BH\"\u0018:";
        objectArray[26] = ":6y_\u0013\\cq HzYmaD\u0010\u001eQq<-\u0014\u0019B`\r-I\u0014Ukut_\u0006H\u0001";
        objectArray[27] = "X\r{4Wj\u0006\tsl-5\u0001\u001fXg])h\rzdH?\u0010TlvUU";
        objectArray[28] = "3U\u0003*.HmC\u000f=SIoQ;6\bZxL\u0014\"SLmC\u0002(8L{OCM";
        objectArray[29] = "|l\u001a\fW\u000b|+Y\u0007:L\u0017<DSJ\u0012|<R_\u000bw";
        objectArray[30] = "Al('#I\u0018+q0JN\u001e:|/J\u001c\u0018mr$+F\u0006*.U";
        objectArray[31] = ">\u000f'>\u0001|`\u0019+)|}b\u000b\u001f\">ih\u0011\u001f#\u0006{~wh(\u0003t`G7$Bh\u000f";
        objectArray[32] = "~hE\u0015A\u0014:lJN&MD4\u0011BT\u001e(mV\u001bC";
        objectArray[33] = "<\u0017{_$\u001cb\u0001wHY\u0013v-q_?*w\u000eoY%\u0013s\u0002\nQ=\u001ch\u0005r\b+\u000euo";
        objectArray[34] = "\u001a\u000bOF`\u000fA\r\u001f/:}\u001eLA\u0013h\fC\t\u0018A\u0001DEJB^`\u001e[\r\u001e/";
        objectArray[35] = "a\\Uem\\%XZ>\n\u0001[\u0000\u00012xV7YFko";
        objectArray[36] = "\u0014\u007f\u0013)\tq\u00111U)9fD6Q6Cqo(J\u0011DxMO\u00113Xl\u0018&\u00154K})rH6I-@vO%X\u001c";
        objectArray[37] = "u]J 'u!MI0X{'U)\u007f2!-K\u00198(%w-\u00121;\u007f1FF!8oN";
        Object[] objectArray2 = objectArray;
        objectArray[38] = "y%)nU8y3%/0>j7.zKS..&n\u0001:*)5\u007f0:w$\"tHca6?\u001e";
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _9B.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Method h(long l2, long l3) {
        int n = _9B.e(l2, l3);
        Object object = c[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = d[n];
                int n3 = string2.indexOf(8);
                clazz3 = _9B.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _9B.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _9B.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _9B.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _9B.f(568526041235070L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _9B.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _9B.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _9B.f(568526041235070L, 0L);
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

    private static Class f(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _9B.e(l2, l3);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                _9B.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _9B.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _9B.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _9B.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _9B.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/9B" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field g(long l2, long l3) {
        int n = _9B.e(l2, l3);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = _9B.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _9B.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _9B.c(clazz3, string2, clazz2)) != null) {
                    _9B.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _9B.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _9B.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _9B.f(568526041235070L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public Set java_util_Set_3(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return _9B.a("p", (Object)this, 8999343407481801298L, (long)l2);
    }

    public Set java_util_Set_4(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return _9B.a("p", (Object)this, 148611026096359883L, (long)l2);
    }

    @Override
    public boolean boolean_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return _9B.a("p", (Object)this, 6339283686186245181L, (long)l2).equals(_9B.a("p", (Object)this, 6339225442599690575L, (long)l2));
    }

    /*
     * Exception decompiling
     */
    @Override
    public void void_7(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
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

    @Override
    public void void_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 ^ 0x4B8C2EA3470L;
        _9B.a("\u00c7", (Object)this, new HashSet(_9B.a("p", (Object)this, 2601228346288542383L, (long)l2)), 2601304318434750429L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _9B.a("a", (Object)this, (Object)objectArray2, 2601363894548275817L, (long)l2);
    }

    @Override
    public JsonElement com_google_gson_JsonElement_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        JsonArray jsonArray = new JsonArray();
        CallSite callSite = _9B.a("a", (Object)_9B.a("a", (Object)_9B.a("a", (Object)_9B.a("p", (Object)this, -4039788252683056085L, (long)l2), -4043160477479020238L, (long)l2), _6z_0::cfr_renamed_6, -4040157692070052129L, (long)l2), -4043509525848629421L, (long)l2);
        JsonArray jsonArray2 = jsonArray;
        _9B.a("\u00d2", (Object)jsonArray2, -4040288077065838007L, (long)l2);
        _9B.a("a", (Object)callSite, arg_0 -> ((JsonArray)jsonArray2).add(arg_0), -4043659597061435242L, (long)l2);
        return jsonArray;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_9B.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

