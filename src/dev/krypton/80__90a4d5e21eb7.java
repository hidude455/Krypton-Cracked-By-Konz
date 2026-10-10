/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 */
package dev.krypton;

import dev.krypton._0j;
import dev.krypton._4m_0;
import dev.krypton._4w;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class _80 {
    private final String cfr_renamed_7;
    private final List cfr_renamed_8 = new ArrayList();
    private static final long a = l.a(-8044491062891721736L, 8246744062894975902L, MethodHandles.lookup().lookupClass()).a(100677723119997L);
    private static final Object[] b = new Object[20];
    private static final String[] c = new String[20];

    public boolean cfr_renamed_5(Object[] objectArray) {
        _0j j = (_0j)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = a ^ l2;
        return (boolean)_80.a("j", (Object)_80.a("\u00d9", (Object)this, 1385952958641585208L, (long)l2), (Object)j, 1385615014144998115L, (long)l2);
    }

    public _80(String string) {
        this.cfr_renamed_7 = string;
    }

    static {
        _80.a();
    }

    public _0j cfr_renamed_1(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        _4m_0 m_0 = (_4m_0)((Object)objectArray[1]);
        l2 = a ^ l2;
        _4w[] wArray = _0j.cfr_renamed_1();
        try {
            if (m_0 == null) {
                return null;
            }
        }
        catch (MatchException matchException) {
            throw _80.a(matchException);
        }
        CallSite callSite = _80.a("j", (Object)_80.a("\u00d9", (Object)this, 7994339725794787826L, (long)l2), 7993959980294501925L, (long)l2);
        while (_80.a("j", (Object)callSite, 7995921086968823193L, (long)l2) != false) {
            block9: {
                _0j j;
                block8: {
                    _0j j2 = (_0j)((Object)_80.a("j", (Object)callSite, 7995974033665016464L, (long)l2));
                    try {
                        try {
                            j = j2;
                            if (wArray == null) break block8;
                            if (_80.a("j", (Object)_80.a("j", (Object)_80.a("\u00d9", (Object)j, 7994434194324188190L, (long)l2), 7994031400181007413L, (long)l2), (Object)((Object)m_0), 7996065328714261472L, (long)l2) == false) break block9;
                        }
                        catch (MatchException matchException) {
                            throw _80.a(matchException);
                        }
                        j = j2;
                    }
                    catch (MatchException matchException) {
                        throw _80.a(matchException);
                    }
                }
                return j;
            }
            if (wArray != null) continue;
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _80.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _80.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _80.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _80.b(classArray2[j], string, clazz2, n, classArray);
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
            int n = _80.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _80.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(long l2, long l3) {
        int n = _80.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _80.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _80.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _80.a(clazz3, string2, clazz2)) != null) {
                    _80.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _80.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _80.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _80.b(84201018573601L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _80.a(l2, l3);
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
                clazz3 = _80.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _80.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _80.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _80.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _80.b(84201018573601L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _80.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _80.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _80.b(84201018573601L, 0L);
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
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/80" + " : " + string + " : " + methodType.toString(), exception);
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _80.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d9' || c == '\u00c4' || c == 'V' || c == 'M') {
                field = _80.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d9' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c4' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'V' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _80.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'j' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'I' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "o)<\"J?q!&m(#v<";
        objectArray[1] = "\u0003A\u0003ms\u0014\bN\u0012\"\u0012\u001a\u0003E\u0016x";
        objectArray[2] = Boolean.TYPE;
        _80.c[2] = "java/lang/Boolean";
        objectArray[3] = "Kc1;l+Vv3ziw\u00176";
        objectArray[4] = "w6\u0012R\u0007c|9\u0003\u001dz{o>\nT";
        objectArray[5] = "*:L\"\u0005H_\u001aG-\u0014\u0007>\u0014L&\u0010]J";
        objectArray[6] = "(v\t7$\\5c\u000bv!\u0000|y";
        objectArray[7] = "\u0019\u00176O9+\u0007\u001f,\u0000^*\u0016\u0004!Zx,";
        objectArray[8] = "4r2S7i)g0\u001225`c";
        objectArray[9] = "7\u0017<1'\"*\u0002>p\"~g\u001f";
        objectArray[10] = "\u0016V.\u001a\u0002\u001aV\u0002}\u0019rQ*\u0007z\u0003N[QV*\u0019I";
        objectArray[11] = "TZSk2\u0013\u0005\u0007\u0000x]Mn\r\u0003h%\u001fQ\\]e";
        objectArray[12] = "Yb[rt\u000f\b<V\nzLX%Cv|J5cUh%LJ$T5g0";
        objectArray[13] = "t\nz\u0000Te%W)\u0013;7N\nhL\\e6Vv\u0018\u0002\u0006r^z\u001bKv2\n)\u0018;";
        objectArray[14] = "{-\u001cTI\u0002*s\u0011,OQ{\u0010\u0011QFPh\u007f\u0004S\u001f=.j\u0012\u0013\\\u0005ys\u0003S&";
        objectArray[15] = "R\u0002+}\u0006C\u0003R1z7\u0001l\u000583\u0006HU\u0005e>J8";
        objectArray[16] = "\u001cx\u0001\u0014PX[y\\V,AMw\u001f*PZ@j\u001cEEX\u0019\u0007";
        objectArray[17] = "M\\#\u0002\fK\n]~@pT\u0018X\u0007Q\u0000Hq\u001a;CONIM\"R\u000f4";
        objectArray[18] = "kd\u0007B|H:9TQ\u0013\u0017Qd\u0000Z-\u0012m \nZk";
        Object[] objectArray2 = objectArray;
        objectArray[19] = "\u0003<Ebj:\u0003aH.\u001anD\"^7a\u0003A\"W>elT \u000eS#yB`Mkt`S 7";
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
            case 0 -> 23;
            case 1 -> 14;
            case 2 -> 19;
            case 3 -> 5;
            case 4 -> 18;
            case 5 -> 30;
            case 6 -> 36;
            case 7 -> 35;
            case 8 -> 51;
            case 9 -> 32;
            case 10 -> 58;
            case 11 -> 20;
            case 12 -> 38;
            case 13 -> 15;
            case 14 -> 17;
            case 15 -> 52;
            case 16 -> 63;
            case 17 -> 25;
            case 18 -> 57;
            case 19 -> 41;
            case 20 -> 31;
            case 21 -> 44;
            case 22 -> 29;
            case 23 -> 34;
            case 24 -> 46;
            case 25 -> 4;
            case 26 -> 54;
            case 27 -> 39;
            case 28 -> 26;
            case 29 -> 47;
            case 30 -> 24;
            case 31 -> 56;
            case 32 -> 55;
            case 33 -> 10;
            case 34 -> 16;
            case 35 -> 48;
            case 36 -> 60;
            case 37 -> 3;
            case 38 -> 37;
            case 39 -> 50;
            case 40 -> 13;
            case 41 -> 49;
            case 42 -> 0;
            case 43 -> 28;
            case 44 -> 7;
            case 45 -> 12;
            case 46 -> 11;
            case 47 -> 62;
            case 48 -> 1;
            case 49 -> 43;
            case 50 -> 2;
            case 51 -> 9;
            case 52 -> 27;
            case 53 -> 22;
            case 54 -> 42;
            case 55 -> 40;
            case 56 -> 33;
            case 57 -> 45;
            case 58 -> 53;
            case 59 -> 8;
            case 60 -> 21;
            case 61 -> 59;
            case 62 -> 6;
            default -> 61;
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
        _80.c[n3] = new String(cArray);
        return n3;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    public boolean cfr_renamed_4(Object[] objectArray) {
        boolean bl;
        _4m_0 m_0 = (_4m_0)((Object)objectArray[0]);
        long l2 = (Long)objectArray[1];
        long l3 = (l2 = a ^ l2) ^ 0x46020B5346A1L;
        try {
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = m_0;
            objectArray2[0] = l3;
            bl = _80.a("j", (Object)this, (Object)objectArray2, -5810692988426282085L, (long)l2) != null;
        }
        catch (MatchException matchException) {
            throw _80.a(matchException);
        }
        return bl;
    }

    public String cfr_renamed_6() {
        long l2 = a ^ 0x3BC116F63700L;
        return _80.a("\u00d9", (Object)this, -5761927159574603433L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_80.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

