/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  java.lang.MatchException
 *  net.minecraft.class_2248
 */
package dev.krypton;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import dev.krypton._8j;
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
import net.minecraft.class_2248;

public class _96
extends _95 {
    private final Set cfr_renamed_7;
    private Set cfr_renamed_0;
    private static final long a = l.a(8147372547724075308L, -9121663295620489771L, MethodHandles.lookup().lookupClass()).a(147444231811712L);
    private static final Object[] c = new Object[40];
    private static final String[] d = new String[40];

    public Set java_util_Set_1(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return _96.a("C", (Object)this, 1466055017580480489L, (long)l2);
    }

    public _96(long l2, int n, Set set) {
        long l3 = (l2 = a ^ l2) ^ 0x2EDBDFE9685AL;
        int n2 = (int)(l3 >>> 48);
        int n3 = (int)(l3 << 16 >>> 32);
        int n4 = (int)(l3 << 48 >>> 48);
        super((short)n2, n, n3, n4);
        _96.a("R", (Object)this, new HashSet(set), 3110780110205162828L, (long)l2);
        this.cfr_renamed_7 = new HashSet(set);
    }

    static {
        _96.b();
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
            case 0 -> 17;
            case 1 -> 57;
            case 2 -> 15;
            case 3 -> 7;
            case 4 -> 0;
            case 5 -> 29;
            case 6 -> 51;
            case 7 -> 24;
            case 8 -> 36;
            case 9 -> 49;
            case 10 -> 10;
            case 11 -> 46;
            case 12 -> 30;
            case 13 -> 39;
            case 14 -> 53;
            case 15 -> 14;
            case 16 -> 58;
            case 17 -> 41;
            case 18 -> 35;
            case 19 -> 2;
            case 20 -> 32;
            case 21 -> 9;
            case 22 -> 61;
            case 23 -> 28;
            case 24 -> 1;
            case 25 -> 19;
            case 26 -> 11;
            case 27 -> 42;
            case 28 -> 50;
            case 29 -> 21;
            case 30 -> 6;
            case 31 -> 40;
            case 32 -> 44;
            case 33 -> 54;
            case 34 -> 5;
            case 35 -> 25;
            case 36 -> 55;
            case 37 -> 59;
            case 38 -> 37;
            case 39 -> 47;
            case 40 -> 34;
            case 41 -> 60;
            case 42 -> 18;
            case 43 -> 52;
            case 44 -> 27;
            case 45 -> 23;
            case 46 -> 62;
            case 47 -> 48;
            case 48 -> 43;
            case 49 -> 20;
            case 50 -> 13;
            case 51 -> 12;
            case 52 -> 45;
            case 53 -> 4;
            case 54 -> 33;
            case 55 -> 3;
            case 56 -> 31;
            case 57 -> 22;
            case 58 -> 26;
            case 59 -> 56;
            case 60 -> 16;
            case 61 -> 63;
            case 62 -> 8;
            default -> 38;
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
        _96.d[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'C' || c == 'R' || c == 'Q' || c == 'N') {
                field = _96.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'C' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'R' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'Q' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _96.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'k' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _96.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void b() {
        Object[] objectArray = c;
        c[0] = "e.I&\u001eKx;Kg\u001b\u00178}";
        objectArray[1] = "|.ST\bqb&I\u001buab";
        objectArray[2] = "\\\u0018=\u000b(\u0011\\\u0018*W$\u001eFS*I$\u000bA\"{\u001csH";
        objectArray[3] = "+\"]9M2 -Lv0*3*E?";
        objectArray[4] = "DQ!w@\u001eDQ6+L\u0011^\u001a65L\u0004Ykb`\u001fE";
        objectArray[5] = "\u000e\u001es%<T\u0005\u0011bj]Z\u000e\u001af0";
        objectArray[6] = "F3hy^'F3\u007f%R(\\x\u007f;R=[\t+n\u0001}";
        objectArray[7] = "\u0003~'t\n%\u001dv=;W$\u001bz0x\n\u0003\u001dm4tI";
        objectArray[8] = "3\u0017\u0006\u001ct}-\u001f\u001cS<}7\u0015\u0004\u00145fw5\u001f\u0013)}4\u0013\u0002";
        objectArray[9] = Void.TYPE;
        _96.d[9] = "java/lang/Void";
        objectArray[10] = "\u0005\u0013q=Ov\u001b\u001bkr.a\u0005\u0017d(\u0012";
        objectArray[11] = "EUEoT\n[]_ \u001c\nAWGg\u0015\u0011\u0001rF`\u0019\u000bF[]";
        objectArray[12] = "[T\rx|CFA\u000f9y\u001f\u0006\u0004";
        objectArray[13] = "gdys%\u0015\u0012Dr|4ZsJyw0\u0000\u0007";
        objectArray[14] = ",3B\u000f2; ;CD{3<3A\u000f\u001f' 2nS'56";
        objectArray[15] = "pgd oGno~o\bF\u007fts5.@";
        objectArray[16] = "r3Gb/\u000f~;F)f\u0007b3Db\u0002\u0013~2o -\rt2^";
        objectArray[17] = Boolean.TYPE;
        _96.d[17] = "java/lang/Boolean";
        objectArray[18] = "\u001fJ3\u0015\u000f\n\\J=Q2\u0013R[%DN\u0015T66O[\u0014II0V@\u0013.";
        objectArray[19] = "\u001dW'^\u001e\u001a\bYsbZ\u0001\u001bJs\u0007!A\u0011@e\u0006\u001aBXXyb";
        objectArray[20] = "S<\\!\u0010(PuD=t}\b6v7\u001fsoqK<\u0012}P%\nf\u000f\u0013Q\"\\3\u0005r\u000e1Ret";
        objectArray[21] = "8/@\u0019SC;fX\u00057\u0003c%[\u000b[x8/@\u0019SC;fX\u00057";
        objectArray[22] = "NX (\u0017,A\tz9z?_ud5\u001c\u0017^Mv#z5\u0014N h\u001d:\u0014[sR";
        objectArray[23] = ")5T\t\u0003a$5FkW]8#\u0006WX:--R";
        objectArray[24] = "U?\u001f}\r0S&\u0004zj)Q-\n\u001bQ2Ra\u0017+\u001b6V1v";
        objectArray[25] = "7c\"S\u0014e\"mvoBn'\u0013$\u0012E>*#n\u0016AnKx/\u0016\u00148,w/\u0003G\u0002";
        objectArray[26] = "/\n,\tk\u000f)\u00137\u000e\f\u0010/\u0013\u0003\u0002|\fF\u0003u\u00163J!\fu\u0003`p";
        objectArray[27] = "\u00138\u000fWEi\u001ciUF(t\u0014+yVsg\u00036VB(!G(UPT|\u0003'V-";
        objectArray[28] = "&3\u0013NBr3=Gr\u0016q7*TrC{=._\u0013\u001ch3x.";
        objectArray[29] = "G'YF2Q\u0000/\u000eFKV\u00112\u0001\u001c'dBu\\@v3E!\u0019\u0006 BA$\u0011\u0002K\b\u0001 ]\u001a{B\u0005$\r{";
        objectArray[30] = "\u0016o\u0015\u0018qT\u0019>O\t\u001cI\u0011|c\u0019^]\u001bfc\u0018fO\r\u0000\u001b\u001ep\u001eAxX\u001e~Z|";
        objectArray[31] = "\u0016P&y6r\u0012U.}]\u007fHd\"~<e@?d:\"fRC9~-e/";
        objectArray[32] = "hMa\u001c\u00182eMs~@\u000ey[3BCilUg";
        objectArray[33] = "1n9x\u0016+>?ci{8 C}e\u001d\u0001!`cc\u00078%l\u0006iK d;afK57\u0001";
        objectArray[34] = "Q=V@O.U8^D$:\u0005.NZH\bVj\u0010\u0000\u0018_RlQXY#\u000f(^[$f\u0007*SVUb\u0002\"W=";
        objectArray[35] = "\u0017\u0012\u0016\u000f+yV]JSF?']\u0017T>5C\u0011GM~\u0004\u0019\u0002O\\7eF\u0011A\nF";
        objectArray[36] = "\u0014yz r\u0000Sq- \u000b\u0007Bl\"zg5\u0016(x'2b\u0014m,!jR^i(q\u000b[@h?vz_E`;\u001d";
        objectArray[37] = "B1-r\u000fMBk93fY\u0010u)l\u001cN;k2K\u001bG\u0019\fop\b\u001f\u001c<%t\fO}7)cZBM}-g\n#";
        objectArray[38] = "\u0015\n9U\fM\u0016C!Ih\u0013@\u0002^\u0015\u0018\tO\u001fgM\u0003\u0014LzbZ\u000f\tMAa\u0013\u0017\u0015)";
        Object[] objectArray2 = objectArray;
        objectArray[39] = "\u000b'm\r4\u0016] 3GUFV26[\u0002\u0014\u000efm\nU\u0013^goN7TV0o";
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
        int n = _96.e(l2, l3);
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
                clazz3 = _96.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _96.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _96.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _96.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _96.f(390498440268217L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _96.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _96.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _96.f(390498440268217L, 0L);
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
            int n = _96.e(l2, l3);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                _96.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _96.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _96.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _96.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _96.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
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
            throw new RuntimeException("dev/krypton/96" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field g(long l2, long l3) {
        int n = _96.e(l2, l3);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = _96.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _96.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _96.c(clazz3, string2, clazz2)) != null) {
                    _96.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _96.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _96.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _96.f(390498440268217L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void cfr_renamed_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        Set set = (Set)objectArray[1];
        long l3 = (l2 = a ^ l2) ^ 0x24FCDB19770CL;
        _96.a("R", (Object)this, new HashSet(set), 7451414150686071055L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _96.a("\u00d9", (Object)this, (Object)objectArray2, 7450543262019082964L, (long)l2);
    }

    private static String cfr_renamed_6(short s, int n, char c, class_2248 class_22482) {
        long l2 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)c << 48 >>> 48) ^ a;
        return _96.a("\u00d9", (Object)_96.a("\u00d9", (Object)_96.a("Q", 153885213596617844L, (long)l2), (Object)class_22482, 153813206136788794L, (long)l2), 156649502704088756L, (long)l2);
    }

    @Override
    public boolean boolean_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return _96.a("C", (Object)this, 6337837252868336019L, (long)l2).equals(_96.a("C", (Object)this, 6339192152458921032L, (long)l2));
    }

    @Override
    public void void_7(Object[] objectArray) {
        block13: {
            Object object;
            JsonElement jsonElement;
            String string;
            long l2;
            long l3;
            block12: {
                JsonElement jsonElement2 = (JsonElement)objectArray[0];
                l3 = (Long)objectArray[1];
                l2 = l3 ^ 0x701E675BFBC3L;
                string = _8j.cfr_renamed_3();
                try {
                    try {
                        jsonElement = jsonElement2;
                        if (string != null) break block12;
                        if (_96.a("\u00d9", (Object)jsonElement, -1466035155049188426L, (long)l3) == false) break block13;
                    }
                    catch (MatchException matchException) {
                        throw _96.a(matchException);
                    }
                    jsonElement = jsonElement2;
                }
                catch (MatchException matchException) {
                    throw _96.a(matchException);
                }
            }
            CallSite callSite = _96.a("\u00d9", (Object)jsonElement, -1466587297029993480L, (long)l3);
            _96.a("\u00d9", (Object)_96.a("C", (Object)this, -1465946613515758144L, (long)l3), -1466707956596923752L, (long)l3);
            CallSite callSite2 = _96.a("\u00d9", (Object)callSite, -1466324574559223497L, (long)l3);
            block10: while (_96.a("\u00d9", (Object)callSite2, -1466906717441050440L, (long)l3) != false) {
                object = _96.a("\u00d9", (Object)callSite2, -1467028836148007993L, (long)l3);
                do {
                    block15: {
                        Object object2;
                        block14: {
                            JsonElement jsonElement3 = (JsonElement)object;
                            try {
                                try {
                                    try {
                                        if (string != null) break block13;
                                        object2 = jsonElement3;
                                        if (string != null) break block14;
                                    }
                                    catch (MatchException matchException) {
                                        throw _96.a(matchException);
                                    }
                                    if (_96.a("\u00d9", (Object)object2, -1465238657246178959L, (long)l3) == false) break block15;
                                }
                                catch (MatchException matchException) {
                                    throw _96.a(matchException);
                                }
                                object2 = _96.a("\u00d9", (Object)_96.a("Q", -1464843686971480579L, (long)l3), (Object)_96.a("k", (Object)_96.a("\u00d9", (Object)jsonElement3, -1466823538158127473L, (long)l3), -1465201240711193687L, (long)l3), -1466647182758803169L, (long)l3);
                            }
                            catch (MatchException matchException) {
                                throw _96.a(matchException);
                            }
                        }
                        class_2248 class_22482 = (class_2248)object2;
                        _96.a("\u00d9", (Object)_96.a("C", (Object)this, -1465946613515758144L, (long)l3), (Object)class_22482, -1466959410578423522L, (long)l3);
                    }
                    if (string == null) continue block10;
                    object = this;
                } while (l3 < 0L);
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l2;
            _96.a("\u00d9", (Object)object, (Object)objectArray2, -1465093205420583397L, (long)l3);
        }
    }

    public Set java_util_Set_7(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return _96.a("C", (Object)this, -3954262656716572808L, (long)l2);
    }

    @Override
    public JsonElement com_google_gson_JsonElement_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 ^ 0x50FB8D250E04L;
        int n = (int)(l3 >>> 48);
        int n2 = (int)(l3 << 16 >>> 32);
        int n3 = (int)(l3 << 48 >>> 48);
        JsonArray jsonArray = new JsonArray();
        CallSite callSite = _96.a("\u00d9", (Object)_96.a("\u00d9", (Object)_96.a("\u00d9", (Object)_96.a("C", (Object)this, -4043418316075894395L, (long)l2), -4043108705841632059L, (long)l2), arg_0 -> _96.cfr_renamed_6((short)n, n2, (char)n3, arg_0), -4040133269953163319L, (long)l2), -4043592522621082980L, (long)l2);
        JsonArray jsonArray2 = jsonArray;
        _96.a("k", (Object)jsonArray2, -4040179141263569111L, (long)l2);
        _96.a("\u00d9", (Object)callSite, arg_0 -> ((JsonArray)jsonArray2).add(arg_0), -4043650732327845170L, (long)l2);
        return jsonArray;
    }

    @Override
    public void void_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 ^ 0x4B8C2EA3470L;
        _96.a("R", (Object)this, new HashSet(_96.a("C", (Object)this, 2601195193352026024L, (long)l2)), 2599876559620086387L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _96.a("\u00d9", (Object)this, (Object)objectArray2, 2601257436998310312L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_96.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

