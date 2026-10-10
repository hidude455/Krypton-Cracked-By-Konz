/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.krypton.4w
 *  dev.krypton.6O
 *  dev.krypton.l
 *  java.lang.MatchException
 */
package dev.krypton;

import dev.krypton._4w;
import dev.krypton._6O;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class _9y {
    private final HashMap cfr_renamed_1 = new HashMap();
    private static final long a = l.a(3805780565433635197L, 1871504850537207717L, MethodHandles.lookup().lookupClass()).a(130745293178943L);
    private static final Object[] b = new Object[33];
    private static final String[] c = new String[33];

    private _9y(_6O o) {
    }

    void cfr_renamed_5(Object[] objectArray) {
        block4: {
            String string = (String)objectArray[0];
            Object object = objectArray[1];
            long l2 = (Long)objectArray[2];
            l2 = a ^ l2;
            boolean bl = _6O.cfr_renamed_9();
            try {
                Object object2;
                try {
                    object2 = object;
                    if (bl || object2 == null) break block4;
                }
                catch (MatchException matchException) {
                    throw _9y.a(matchException);
                }
                object2 = _9y.a("d", (Object)_9y.a("\u00d0", (Object)this, 4628960467338944324L, (long)l2), (Object)string, (Object)object, 4629666300461667253L, (long)l2);
            }
            catch (MatchException matchException) {
                throw _9y.a(matchException);
            }
        }
    }

    public String toString() {
        CallSite callSite;
        block56: {
            boolean bl;
            block58: {
                block57: {
                    Object object;
                    boolean bl2;
                    long l2;
                    block42: {
                        l2 = a ^ 0x57219FBFE622L;
                        StringBuilder stringBuilder = new StringBuilder();
                        CallSite callSite2 = _9y.a("d", (Object)_9y.a("\u00d0", (Object)this, -6494341542821643610L, (long)l2), -6496211129848085194L, (long)l2);
                        _9y.a("d", (Object)stringBuilder, (Object)"{", -6495063472489310478L, (long)l2);
                        int n = 0;
                        CallSite callSite3 = _9y.a("d", (Object)callSite2, -6494943605186672560L, (long)l2);
                        bl2 = _6O.cfr_renamed_9();
                        while (_9y.a("d", (Object)callSite3, -6494241776106929661L, (long)l2) != false) {
                            String string;
                            Object object2;
                            int n2;
                            Object object3;
                            block54: {
                                block45: {
                                    Object object4;
                                    CallSite callSite4;
                                    block52: {
                                        block50: {
                                            block48: {
                                                block46: {
                                                    block43: {
                                                        Map.Entry entry = (Map.Entry)((Object)_9y.a("d", (Object)callSite3, -6494274704333632390L, (long)l2));
                                                        callSite4 = _9y.a("d", (Object)entry, -6494605896165981310L, (long)l2);
                                                        try {
                                                            block44: {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            object = _9y.a("d", (Object)_9y.a("d", (Object)stringBuilder, (Object)_9y.a("d", (Object)this, (Object)new Object[]{(String)((Object)_9y.a("d", (Object)entry, -6494993178510643289L, (long)l2))}, -6494870200999833307L, (long)l2), -6495063472489310478L, (long)l2), (Object)":", -6495063472489310478L, (long)l2);
                                                                            if (bl2) break block42;
                                                                            object4 = callSite4 instanceof String;
                                                                            if (bl2) break block43;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw _9y.a(matchException);
                                                                        }
                                                                        if (object4 == 0) break block44;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw _9y.a(matchException);
                                                                    }
                                                                    _9y.a("d", (Object)stringBuilder, (Object)_9y.a("d", (Object)this, (Object)new Object[]{_9y.a("\u00ff", (Object)callSite4, -6496266385521070256L, (long)l2)}, -6494870200999833307L, (long)l2), -6495063472489310478L, (long)l2);
                                                                    if (!bl2) break block45;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw _9y.a(matchException);
                                                                }
                                                            }
                                                            object4 = callSite4 instanceof Integer;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _9y.a(matchException);
                                                        }
                                                    }
                                                    try {
                                                        block47: {
                                                            try {
                                                                try {
                                                                    if (bl2) break block46;
                                                                    if (object4 == 0) break block47;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw _9y.a(matchException);
                                                                }
                                                                _9y.a("d", (Object)stringBuilder, (Object)_9y.a("\u00ff", (Object)_9y.a("\u00ff", (Object)callSite4, -6496266385521070256L, (long)l2), -6494664034865662366L, (long)l2), -6495250832563998235L, (long)l2);
                                                                if (!bl2) break block45;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _9y.a(matchException);
                                                            }
                                                        }
                                                        object4 = callSite4 instanceof Boolean;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _9y.a(matchException);
                                                    }
                                                }
                                                try {
                                                    block49: {
                                                        try {
                                                            try {
                                                                if (bl2) break block48;
                                                                if (object4 == 0) break block49;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _9y.a(matchException);
                                                            }
                                                            _9y.a("d", (Object)stringBuilder, (Object)callSite4, -6495250832563998235L, (long)l2);
                                                            if (!bl2) break block45;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _9y.a(matchException);
                                                        }
                                                    }
                                                    object4 = callSite4 instanceof _9y;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _9y.a(matchException);
                                                }
                                            }
                                            try {
                                                block51: {
                                                    try {
                                                        try {
                                                            if (bl2) break block50;
                                                            if (object4 == 0) break block51;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _9y.a(matchException);
                                                        }
                                                        _9y.a("d", (Object)stringBuilder, (Object)callSite4, -6495250832563998235L, (long)l2);
                                                        if (!bl2) break block45;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _9y.a(matchException);
                                                    }
                                                }
                                                object4 = _9y.a("d", callSite4.getClass(), -6494724329047790294L, (long)l2);
                                            }
                                            catch (MatchException matchException) {
                                                throw _9y.a(matchException);
                                            }
                                        }
                                        try {
                                            try {
                                                if (bl2) break block52;
                                                if (object4 == 0) break block45;
                                            }
                                            catch (MatchException matchException) {
                                                throw _9y.a(matchException);
                                            }
                                            _9y.a("d", (Object)stringBuilder, (Object)"[", -6495063472489310478L, (long)l2);
                                            object4 = _9y.a("\u00ff", (Object)callSite4, -6494474894489798238L, (long)l2);
                                        }
                                        catch (MatchException matchException) {
                                            throw _9y.a(matchException);
                                        }
                                    }
                                    int n3 = object4;
                                    for (int i = 0; i < n3; ++i) {
                                        Object object5;
                                        block53: {
                                            block55: {
                                                try {
                                                    try {
                                                        object3 = stringBuilder;
                                                        object5 = _9y.a("d", (Object)_9y.a("\u00ff", (Object)callSite4, (int)i, -6494441537735133539L, (long)l2), -6497824505207874504L, (long)l2);
                                                        if (bl2) break block53;
                                                        object3 = _9y.a("d", (Object)object3, (Object)object5, -6495063472489310478L, (long)l2);
                                                        n2 = i;
                                                        object2 = n3 - 1;
                                                        if (bl2) break block54;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _9y.a(matchException);
                                                    }
                                                    if (n2 == object2) break block55;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _9y.a(matchException);
                                                }
                                                object5 = ",";
                                                break block53;
                                            }
                                            object5 = "";
                                        }
                                        _9y.a("d", (Object)object3, (Object)object5, -6495063472489310478L, (long)l2);
                                        if (!bl2) continue;
                                    }
                                    _9y.a("d", (Object)stringBuilder, (Object)"]", -6495063472489310478L, (long)l2);
                                }
                                object3 = stringBuilder;
                                n2 = ++n;
                                object2 = _9y.a("d", (Object)callSite2, -6495185007650034366L, (long)l2);
                            }
                            try {
                                string = n2 == object2 ? "}" : ",";
                            }
                            catch (MatchException matchException) {
                                throw _9y.a(matchException);
                            }
                            _9y.a("d", (Object)object3, (Object)string, -6495063472489310478L, (long)l2);
                            if (!bl2) continue;
                        }
                        object = stringBuilder;
                    }
                    try {
                        try {
                            callSite = _9y.a("d", (Object)object, -6495132681999896571L, (long)l2);
                            if (_4w.cfr_renamed_1() != null) break block56;
                            if (!bl2) break block57;
                        }
                        catch (MatchException matchException) {
                            throw _9y.a(matchException);
                        }
                        bl = false;
                        break block58;
                    }
                    catch (MatchException matchException) {
                        throw _9y.a(matchException);
                    }
                }
                bl = true;
            }
            _6O.cfr_renamed_16((boolean)bl);
        }
        return callSite;
    }

    private String cfr_renamed_1(Object[] objectArray) {
        String string = (String)objectArray[0];
        return "\"" + string + "\"";
    }

    static {
        _9y.a();
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
            case 0 -> 21;
            case 1 -> 41;
            case 2 -> 4;
            case 3 -> 32;
            case 4 -> 27;
            case 5 -> 18;
            case 6 -> 15;
            case 7 -> 10;
            case 8 -> 59;
            case 9 -> 28;
            case 10 -> 57;
            case 11 -> 63;
            case 12 -> 42;
            case 13 -> 48;
            case 14 -> 31;
            case 15 -> 19;
            case 16 -> 8;
            case 17 -> 46;
            case 18 -> 49;
            case 19 -> 47;
            case 20 -> 6;
            case 21 -> 17;
            case 22 -> 22;
            case 23 -> 35;
            case 24 -> 55;
            case 25 -> 43;
            case 26 -> 36;
            case 27 -> 9;
            case 28 -> 33;
            case 29 -> 25;
            case 30 -> 39;
            case 31 -> 29;
            case 32 -> 14;
            case 33 -> 60;
            case 34 -> 62;
            case 35 -> 56;
            case 36 -> 50;
            case 37 -> 0;
            case 38 -> 30;
            case 39 -> 3;
            case 40 -> 5;
            case 41 -> 53;
            case 42 -> 2;
            case 43 -> 12;
            case 44 -> 13;
            case 45 -> 34;
            case 46 -> 11;
            case 47 -> 61;
            case 48 -> 7;
            case 49 -> 38;
            case 50 -> 45;
            case 51 -> 20;
            case 52 -> 24;
            case 53 -> 26;
            case 54 -> 16;
            case 55 -> 37;
            case 56 -> 40;
            case 57 -> 54;
            case 58 -> 23;
            case 59 -> 44;
            case 60 -> 1;
            case 61 -> 51;
            case 62 -> 52;
            default -> 58;
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
        _9y.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "yQB\n- r^SEP8aYZ\f";
        objectArray[1] = "MI8mO|FF)\".rMM-x";
        objectArray[2] = "ue\\\u0018\u0014\rkmFWr\u0019llg\u0018J";
        objectArray[3] = "%)\u0019J`7;!\u0003\u0005\u001d';";
        objectArray[4] = "iCNf\\pbL_)\u0000yeN]d\u00062BPJf\u000b";
        objectArray[5] = Integer.TYPE;
        _9y.c[5] = "java/lang/Integer";
        objectArray[6] = "\u0001\u0007 }\u001a>\u001c\u0012\"<\u001fb\\\u001b";
        objectArray[7] = "!lLA\u0012l?dV\u000eum.\u007f[TSk";
        objectArray[8] = Boolean.TYPE;
        _9y.c[8] = "java/lang/Boolean";
        objectArray[9] = "r\u0000J!J}y\u000f[n'}y\u0012O";
        objectArray[10] = "\u001f{>VnM\u0014t/\u0019\tO\u0001\u007f/R2";
        objectArray[11] = "\u0004#N\u0019:W\u001a+TVYC\u001ef}\u0016`P\u0017";
        objectArray[12] = "/,6C\f2Z\f=L\u001d};\u00026G\u0019'O";
        objectArray[13] = "G/p(mmL ag\u0010u_'h.\u0001tD\"b,1";
        objectArray[14] = ">}\u00156) 9gd19\"#j#!P\u007f2:\u001a!!,9d\u0018O0</~\u001d)7&^";
        objectArray[15] = "v4t\u0006G:=q(\u0005%<)01\u000e~<3Lq\u0013N5=(v\u001bU,O";
        objectArray[16] = "va\u0015\\\u0004~.z\u0018\u001cuz!oi\u001b\u0019(2}\u0018H\u0012v0\u0013RZ\u0004(3o\u000eBKqL*\u0005\u001f\u000b{=y\u000eA\t\u0015";
        objectArray[17] = "\u001f)O\u000fokC)OO\u0012l#w\b\u000bk3H<MWh";
        objectArray[18] = "lKB86f(\u001e\u0019yO{<\u0001\u0007Dvql\u000f\u00155%z2\r{";
        objectArray[19] = "&\u0018\\ZJ7bM\u0007\u001b3,rY#KC0\u001b\u001c]\u0016\t,!S\u0002V\\L";
        objectArray[20] = ",d\bmZ!h2\u0010.`!iB\tn\t1\u00125K$Z (z\u0014d\u000f@";
        objectArray[21] = ">>C\u0004\u000e{n\"\u001f\rp|h7Z\f7l\u00013]\u0010\t{g4GaOoe6Y\u0018\u001fs9?'";
        objectArray[22] = "\u0006V\tzMS\r\u0003Hk&\\[\u0011*oBN[mMj\u001bMX\u001c\u001eaEO6";
        objectArray[23] = "\">ypi2z%t0\u00186u0Ac~6d,\u00057tdf\"td\u007f:dL>vidg0bn&=\u0018";
        objectArray[24] = "\r\u0004\u001a%\u00165\u0006Q[4}:PC$4\fU\u0004SZ'\u0013$WX\u0004%}";
        objectArray[25] = "p`9pV0wh\"i$56a(}X30\fo.\u001d(3w+{FiJ";
        objectArray[26] = "_F\u0000-^r\u0003F\u0000m#uc\u0011\\o\u0018w\u0007[OmRH\u0003[NoZ.\u0004A?";
        objectArray[27] = "'fiKg\u0011l#5H\u0005\u0002cbV\u000biG`p'Xb\u0019b\u001eo^8\u0004po<Uf\u0006\u001e':\u000f{\u0014ot1Qyz";
        objectArray[28] = "j<?\u001cg\u001049.\u0002\u0004C#&\"\u001dh*b2r\u0005j[19,\u0007\u0004\u001b9.(\u0018>E<?6{";
        objectArray[29] = "\r-'\u0018\u0017\u0019\n%<\u0001e\u0006V3!|^\u0005F|3\u0000\u0002\u001d\t%L";
        objectArray[30] = "\\8{zKa\u0002=jd('\n\u0001wgI=\u0002ZkgY\"\u0014<l}(";
        objectArray[31] = "'!m.YGy$|0:\u0014n;p/V}v9l0C\u001bq#\u001dxX\rq '&]\u001coC";
        Object[] objectArray2 = objectArray;
        objectArray[32] = "CL/:\t&\u0010Gq8g+\u001d{n>\u00061\u0015 r>\u0016.\u0003Fu$g";
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _9y.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _9y.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _9y.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = _9y.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _9y.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _9y.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _9y.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _9y.a(clazz3, string2, clazz2)) != null) {
                    _9y.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = _9y.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        _9y.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _9y.b(138694651182893L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n) continue;
            for (int i = 0; i < n; ++i) {
                if (classArray2[i] != classArray[i]) continue block0;
            }
            return method;
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _9y.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = _9y.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method d(long l2, long l3) {
        int n = _9y.a(l2, l3);
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
                clazz3 = _9y.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                for (int i = 0; i < n5; ++i) {
                    int n7 = string2.indexOf(8, n6);
                    clazz2 = _9y.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _9y.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _9y.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _9y.b(138694651182893L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = _9y.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _9y.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _9y.b(138694651182893L, 0L);
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d0' || c == 'C' || c == 'B' || c == '\u00eb') {
                field = _9y.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d0' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'C' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'B' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _9y.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'd' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ff' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _9y.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/9y" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_9y.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

