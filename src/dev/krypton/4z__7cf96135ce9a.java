/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 */
package dev.krypton;

import dev.krypton._4w;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class _4z {
    private static final Map cfr_renamed_2;
    private static final Map cfr_renamed_6;
    private static final Map cfr_renamed_7;
    private static final Map cfr_renamed_3;
    private static String cfr_renamed_5;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    public static void cfr_renamed_5(Object[] objectArray) {
        String string = (String)objectArray[0];
        int n = (Integer)objectArray[1];
        int n2 = (Integer)objectArray[2];
        int n3 = (Integer)objectArray[3];
        int n4 = (Integer)objectArray[4];
        long l2 = (Long)objectArray[5];
        l2 = a ^ l2;
        String string2 = _4z.cfr_renamed_4();
        try {
            _4z.a("\u00f1", (Object)_4z.a("\u00cb", 2982492330637472629L, (long)l2), (Object)string, (Object)new int[]{n3, n4}, 2982074644315326597L, (long)l2);
            _4z.a("\u00f1", (Object)_4z.a("\u00cb", 2981974515615751890L, (long)l2), (Object)string, (Object)new int[]{n, n2}, 2982074644315326597L, (long)l2);
            if (string2 != null) {
                _4w.cfr_renamed_8(new String[1]);
            }
        }
        catch (MatchException matchException) {
            throw _4z.a(matchException);
        }
    }

    static {
        a = l.a(7316061856699847018L, -7862604826367263526L, MethodHandles.lookup().lookupClass()).a(90899923451032L);
        b = new Object[23];
        c = new String[23];
        _4z.a();
        cfr_renamed_2 = new LinkedHashMap();
        _4z.cfr_renamed_1(null);
        cfr_renamed_6 = new LinkedHashMap();
        cfr_renamed_7 = new LinkedHashMap();
        cfr_renamed_3 = new LinkedHashMap();
    }

    public static Map cfr_renamed_1(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return _4z.a("\u00cb", 6830796827242153181L, (long)l2);
    }

    public static void cfr_renamed_1(String string) {
        cfr_renamed_5 = string;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _4z.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _4z.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _4z.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _4z.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _4z.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _4z.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(long l2, long l3) {
        int n = _4z.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _4z.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _4z.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _4z.a(clazz3, string2, clazz2)) != null) {
                    _4z.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _4z.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _4z.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _4z.b(126324321687991L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _4z.a(l2, l3);
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
                clazz3 = _4z.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _4z.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _4z.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _4z.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _4z.b(126324321687991L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _4z.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _4z.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _4z.b(126324321687991L, 0L);
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ca' || c == 'i' || c == '\u00cb' || c == '\u00c3') {
                field = _4z.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ca' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'i' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00cb' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _4z.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _4z.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/4z" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
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
            case 0 -> 33;
            case 1 -> 0;
            case 2 -> 25;
            case 3 -> 58;
            case 4 -> 27;
            case 5 -> 59;
            case 6 -> 8;
            case 7 -> 47;
            case 8 -> 54;
            case 9 -> 12;
            case 10 -> 55;
            case 11 -> 13;
            case 12 -> 24;
            case 13 -> 34;
            case 14 -> 32;
            case 15 -> 38;
            case 16 -> 14;
            case 17 -> 11;
            case 18 -> 3;
            case 19 -> 62;
            case 20 -> 53;
            case 21 -> 1;
            case 22 -> 45;
            case 23 -> 46;
            case 24 -> 60;
            case 25 -> 30;
            case 26 -> 15;
            case 27 -> 37;
            case 28 -> 63;
            case 29 -> 50;
            case 30 -> 5;
            case 31 -> 49;
            case 32 -> 20;
            case 33 -> 57;
            case 34 -> 31;
            case 35 -> 35;
            case 36 -> 61;
            case 37 -> 21;
            case 38 -> 18;
            case 39 -> 43;
            case 40 -> 51;
            case 41 -> 4;
            case 42 -> 48;
            case 43 -> 41;
            case 44 -> 28;
            case 45 -> 39;
            case 46 -> 6;
            case 47 -> 52;
            case 48 -> 26;
            case 49 -> 40;
            case 50 -> 10;
            case 51 -> 19;
            case 52 -> 56;
            case 53 -> 16;
            case 54 -> 17;
            case 55 -> 7;
            case 56 -> 9;
            case 57 -> 23;
            case 58 -> 29;
            case 59 -> 22;
            case 60 -> 36;
            case 61 -> 44;
            case 62 -> 42;
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
        _4z.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "3\f\u0010\u0010\u0006H-\u0004\n_e\\)";
        objectArray[1] = "wbUhZ\u0014|mD';\u001awf@}";
        objectArray[2] = "\u0003~C>? \u001ekA\u007f:|Sa";
        objectArray[3] = "n\u001e\u0001_]7e\u0011\u0010\u0010:5p\u001a\u0010[\u0001";
        objectArray[4] = Integer.TYPE;
        _4z.c[4] = "java/lang/Integer";
        objectArray[5] = "\u00038&tLy\u001d0<;\u0004y\u0007:$|\rbG\u001b9V\rb\u001a,=p\u0010";
        objectArray[6] = Void.TYPE;
        _4z.c[6] = "java/lang/Void";
        objectArray[7] = "\"2bM\u000f\u0011<:x\u0002b\u000b$?qOU\r'=";
        objectArray[8] = "94UL\tC'<O\u0003nB6'BYHD";
        objectArray[9] = Boolean.TYPE;
        _4z.c[9] = "java/lang/Boolean";
        objectArray[10] = "D\u0016\u001bs|FM\u0017Eb\u0017L}\nE:r\u001e\u0010\u0000\u0002s";
        objectArray[11] = "\u000e\u0011\u0010\u0012([\u0004VYw?_\tWD\fA\u000bP\u0013V\u00178IVWEw";
        objectArray[12] = "wC {I,}\u0004i\u001eX<hx .[yp\u0012{w\u0011#\u0014A)e\u0018%~\u001ap/BA-Hb&D+v\u0011(| ";
        objectArray[13] = "\u0015}Z@];\u001c|\u0004Q64,a\u0004\tScAkC@";
        objectArray[14] = "\u0012l\fN}@PjH]\u001dXS<OXa^UQ\u000b\u000ffS@aGI}H/";
        objectArray[15] = "\u007f\\x\bUQ3\u001ac\u0013:\u0007,\u0012\u007fb\u0003Q:Zg\bX\bp\u0000\u0003";
        objectArray[16] = "P 5)|*\u001cf.2\u0013z\u0007e\b.cfn 0%(c\u0014%1zu\u001a";
        objectArray[17] = "Y\u0003B\u0002SFP\u0002\u001c\u00138M`\u001f\u001cK]\u001e\r\u0015[\u0002";
        objectArray[18] = "Yw\u0014s\rdReSb1`\nkVovpc4Bz@fXsBz[\u001eYw\u0014s\rdReSb1";
        objectArray[19] = "\r\u0014\u0006P\u0005g\u0007SO5\u0016g\u000bHAXl3^T\u0007Q\u0006h\u0007\u001e]5U:\u0015\u0017[_\u000ec_M?";
        objectArray[20] = "\u0002\\{-sQ\u000b]%<\u0018\\;@%d}\tVJb-";
        objectArray[21] = "\b$; TK^?6,=EX7*iA,\nl<)YFQ5vs=\u0015\u0003'\u007fuWNZm%\u0011\u0001N^azlFRZ%G";
        Object[] objectArray2 = objectArray;
        objectArray[22] = "v\u000f@IM[|H\t,K[i4@\u001c_\u000eq^\u001bE\u0015T\u0015\rIW\u001cR\u007fV\u0010\u001dF6";
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean cfr_renamed_4(Object[] var0) {
        var1_1 = (Double)var0[0];
        var3_2 = (Double)var0[1];
        var5_3 = (Long)var0[2];
        var5_3 = _4z.a ^ var5_3;
        var7_4 = _4z.cfr_renamed_4();
        var8_5 = _4z.a("\u00f1", (Object)_4z.a("\u00f1", (Object)_4z.a("\u00cb", (long)2139326920980775990L, (long)var5_3), (long)2141148104400071788L, (long)var5_3), (long)2141375869069800666L, (long)var5_3);
        do {
            v0 /* !! */  = _4z.a("\u00f1", (Object)var8_5, (long)2139237396254343174L, (long)var5_3);
            block15: while (true) {
                if (v0 /* !! */  == false) return (boolean)0;
                v1 = _4z.a("\u00f1", (Object)var8_5, (long)2141452754417925325L, (long)var5_3);
                do {
                    var10_7 = var9_6 = (int[][])v1;
                    var11_8 = var10_7.length;
                    v2 = 0;
                    block17: while (true) {
                        if (var7_4 != null) return (boolean)v2;
                        var12_9 = v2;
                        while (var12_9 < var11_8) {
                            block22: {
                                block23: {
                                    block24: {
                                        block26: {
                                            block25: {
                                                var13_10 = var10_7[var12_9];
                                                try {
                                                    v3 = var7_4;
                                                    if (var5_3 <= 0L) break block22;
                                                    if (v3 != null) break block23;
                                                    cfr_temp_0 = var1_1 - (double)var13_10[0];
                                                    v0 /* !! */  = (CallSite)(cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1));
                                                    if (var7_4 != null) continue block15;
                                                    if (var5_3 <= 0L) continue block17;
                                                }
                                                catch (MatchException v4) {
                                                    throw _4z.a(v4);
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            if (var5_3 >= 0L) {
                                                                if (v0 /* !! */  < 0) break block24;
                                                                cfr_temp_1 = var1_1 - (double)(var13_10[0] + var13_10[2]);
                                                                v5 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                                                            }
                                                            v6 = var7_4;
                                                            if (var5_3 >= 0L) {
                                                                if (v6 != null) break block25;
                                                            }
                                                            ** GOTO lbl60
                                                        }
                                                        catch (MatchException v7) {
                                                            throw _4z.a(v7);
                                                        }
                                                        if (v5 >= 0) break block24;
                                                    }
                                                    catch (MatchException v8) {
                                                        throw _4z.a(v8);
                                                    }
                                                    cfr_temp_2 = var3_2 - (double)var13_10[1];
                                                    v5 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                                                }
                                                catch (MatchException v9) {
                                                    throw _4z.a(v9);
                                                }
                                            }
                                            try {
                                                try {
                                                    v6 = var7_4;
lbl60:
                                                    // 2 sources

                                                    if (var5_3 > 0L) {
                                                        if (v6 != null) break block26;
                                                        if (v5 < 0) break block24;
                                                    }
                                                    ** GOTO lbl75
                                                }
                                                catch (MatchException v10) {
                                                    throw _4z.a(v10);
                                                }
                                                cfr_temp_3 = var3_2 - (double)(var13_10[1] + var13_10[3]);
                                                v5 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                                            }
                                            catch (MatchException v11) {
                                                throw _4z.a(v11);
                                            }
                                        }
                                        try {
                                            v6 = var7_4;
lbl75:
                                            // 2 sources

                                            if (v6 != null) return (boolean)v5;
                                            if (v5 >= 0) break block24;
                                        }
                                        catch (MatchException v12) {
                                            throw _4z.a(v12);
                                        }
                                        v5 = (double)true;
                                        return (boolean)v5;
                                    }
                                    ++var12_9;
                                }
                                v3 = var7_4;
                            }
                            if (v3 == null) continue;
                        }
                        break;
                    }
                    v1 = var7_4;
                } while (var5_3 < 0L);
                break;
            }
        } while (v1 == null);
        return (boolean)0;
    }

    public static String cfr_renamed_4() {
        return cfr_renamed_5;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void cfr_renamed_3(Object[] var0) {
        block14: {
            block12: {
                var1_1 = (String)var0[0];
                var4_2 = (int[][])var0[1];
                var2_3 = (Long)var0[2];
                var2_3 = _4z.a ^ var2_3;
                var5_4 = _4z.cfr_renamed_4();
                try {
                    block13: {
                        try {
                            try {
                                try {
                                    v0 /* !! */  = var4_2;
                                    if (var5_4 != null) break block12;
                                    if (v0 /* !! */  == null) break block13;
                                }
                                catch (MatchException v1) {
                                    throw _4z.a(v1);
                                }
                                v2 /* !! */  = var4_2;
                                if (var5_4 != null) break block14;
                            }
                            catch (MatchException v3) {
                                throw _4z.a(v3);
                            }
                            if (var2_3 <= 0L) break block14;
                            if (v2 /* !! */ .length == 0) {
                            }
                            ** GOTO lbl37
                        }
                        catch (MatchException v4) {
                            throw _4z.a(v4);
                        }
                    }
                    v0 /* !! */  = (int[][])_4z.a("\u00f1", (Object)_4z.a("\u00cb", (long)624682923183919405L, (long)var2_3), (Object)var1_1, (long)624841555286937475L, (long)var2_3);
                }
                catch (MatchException v5) {
                    throw _4z.a(v5);
                }
            }
            try {
                v2 /* !! */  = (int[][])var5_4;
                if (var2_3 <= 0L || v2 /* !! */  == null) break block14;
lbl37:
                // 2 sources

                v2 /* !! */  = (int[][])_4z.a("\u00f1", (Object)_4z.a("\u00cb", (long)624682923183919405L, (long)var2_3), (Object)var1_1, (Object)var4_2, (long)624886718322075979L, (long)var2_3);
            }
            catch (MatchException v6) {
                throw _4z.a(v6);
            }
        }
    }

    public static void cfr_renamed_8(Object[] objectArray) {
        String string = (String)objectArray[0];
        BiConsumer biConsumer = (BiConsumer)objectArray[1];
        long l2 = (Long)objectArray[2];
        l2 = a ^ l2;
        _4z.a("\u00f1", (Object)_4z.a("\u00cb", 7743750403223404402L, (long)l2), (Object)string, (Object)biConsumer, 7742092457797225110L, (long)l2);
    }

    public static Map cfr_renamed_9(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return _4z.a("\u00cb", -5932052654305388003L, (long)l2);
    }

    public static void cfr_renamed_0(Object[] objectArray) {
        long l2;
        block6: {
            BiConsumer biConsumer;
            int n;
            int n2;
            block5: {
                String string = (String)objectArray[0];
                n2 = (Integer)objectArray[1];
                n = (Integer)objectArray[2];
                l2 = (Long)objectArray[3];
                l2 = a ^ l2;
                _4z.a("\u00f1", (Object)_4z.a("\u00cb", -4162405046305377908L, (long)l2), (Object)string, (Object)new int[]{n2, n}, -4162375286618675237L, (long)l2);
                BiConsumer biConsumer2 = (BiConsumer)((Object)_4z.a("\u00f1", (Object)_4z.a("\u00cb", -4162902349969518017L, (long)l2), (Object)string, -4162796284141456700L, (long)l2));
                String string2 = _4z.cfr_renamed_4();
                try {
                    biConsumer = biConsumer2;
                    if (string2 != null) break block5;
                    if (biConsumer == null) break block6;
                }
                catch (MatchException matchException) {
                    throw _4z.a(matchException);
                }
                biConsumer = biConsumer2;
            }
            _4z.a("\u00f1", (Object)biConsumer, (Object)_4z.a("\u00d1", (int)n2, -4162503467872141456L, (long)l2), (Object)_4z.a("\u00d1", (int)n, -4162503467872141456L, (long)l2), -4162981958102427112L, (long)l2);
        }
        try {
            if (l2 >= 0L && _4w.cfr_renamed_8() == null) {
                _4z.cfr_renamed_1("wE5gv");
            }
        }
        catch (MatchException matchException) {
            throw _4z.a(matchException);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_4z.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

