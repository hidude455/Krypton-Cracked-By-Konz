/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1113
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_2561
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package dev.krypton;

import dev.krypton._9M;
import dev.krypton._9q;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1113;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_2561;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class _0p {
    @NotNull
    private final class_2561 cfr_renamed_4;
    @Nullable
    private class_2561 cfr_renamed_5;
    @Nullable
    private class_1799 cfr_renamed_8;
    @Nullable
    private class_1113 cfr_renamed_7;
    private long cfr_renamed_6;
    private static final long a = l.a(8325601442799364909L, 7615738133736462439L, MethodHandles.lookup().lookupClass()).a(170604291304456L);
    private static final long b;
    private static final Object[] c;
    private static final String[] d;

    public _0p(@NotNull long l2, @NotNull String string) {
        l2 = a ^ l2;
        _0p.a("\u00e2", (Object)this, (class_1113)_0p.a("E", 2058911140430037339L, (long)l2), 2059197586342283954L, (long)l2);
        _0p.a("\u00e2", (Object)this, (long)b, 2059207236884915004L, (long)l2);
        this.cfr_renamed_4 = _0p.a("\u00f0", (Object)_0p.a("U", string, 2059739757255657686L, (long)l2), (Object)_0p.a("\u00f0", (Object)_0p.a("E", 2058327310802646810L, (long)l2), (Object)_0p.a("U", (int)_0p.a("E", 2058769486738482313L, (long)l2), 2058277113525033319L, (long)l2), 2058787064912454291L, (long)l2), 2058471678602014815L, (long)l2);
    }

    public _0p cfr_renamed_5(@Nullable long l2, @Nullable String string) {
        CallSite callSite;
        _0p p;
        block11: {
            block9: {
                Object object;
                block10: {
                    int n;
                    block8: {
                        l2 = a ^ l2;
                        n = _9M.cfr_renamed_0();
                        try {
                            try {
                                p = this;
                                object = string;
                                if (n == 0) break block8;
                                if (object == null) break block9;
                            }
                            catch (MatchException matchException) {
                                throw _0p.a(matchException);
                            }
                            object = _0p.a("\u00f0", string, -2402461848555381553L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw _0p.a(matchException);
                        }
                    }
                    try {
                        try {
                            if (n == 0) break block10;
                            if (_0p.a("\u00f0", (Object)object, -2402265495896791490L, (long)l2) != false) break block9;
                        }
                        catch (MatchException matchException) {
                            throw _0p.a(matchException);
                        }
                        object = string;
                    }
                    catch (MatchException matchException) {
                        throw _0p.a(matchException);
                    }
                }
                callSite = _0p.a("\u00f0", (Object)_0p.a("U", (Object)object, -2401288658127500561L, (long)l2), (Object)_0p.a("\u00f0", (Object)_0p.a("E", -2402134811025361629L, (long)l2), (Object)_0p.a("U", (int)_0p.a("E", -2402067098401781794L, (long)l2), -2402324104546739362L, (long)l2), -2401820237497540438L, (long)l2), -2402551926431567258L, (long)l2);
                break block11;
            }
            callSite = null;
        }
        _0p.a("\u00e2", (Object)p, callSite, -2402004784402775229L, (long)l2);
        return this;
    }

    public _0p cfr_renamed_1(@Nullable class_1792 class_17922, long l2) {
        CallSite callSite;
        _0p p;
        block4: {
            block3: {
                class_1792 class_17923;
                block2: {
                    l2 = a ^ l2;
                    int n = _9M.cfr_renamed_0();
                    try {
                        p = this;
                        class_17923 = class_17922;
                        if (n == 0) break block2;
                        if (class_17923 == null) break block3;
                    }
                    catch (MatchException matchException) {
                        throw _0p.a(matchException);
                    }
                    class_17923 = class_17922;
                }
                callSite = _0p.a("\u00f0", (Object)class_17923, 7764828879170906564L, (long)l2);
                break block4;
            }
            callSite = null;
        }
        _0p.a("\u00e2", (Object)p, (class_1799)callSite, 7764635049668077510L, (long)l2);
        return this;
    }

    public _0p cfr_renamed_7(@Nullable class_1113 class_11132, long l2) {
        l2 = a ^ l2;
        _0p.a("\u00e2", (Object)this, (class_1113)class_11132, 501505454432784596L, (long)l2);
        return this;
    }

    public _0p cfr_renamed_1(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (Long)objectArray[1];
        l3 = a ^ l3;
        _0p.a("\u00e2", (Object)this, (long)_0p.a("U", 0L, (long)l2, 3097863801298672804L, (long)l3), 3098131120252802385L, (long)l3);
        return this;
    }

    public _9q cfr_renamed_4(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = a ^ l2) ^ 0x2793697EBAAEL;
        int n = (int)(l3 >>> 56);
        int n2 = (int)(l3 << 8 >>> 32);
        int n3 = (int)(l3 << 40 >>> 40);
        return new _9q(this, (byte)n, n2, n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        c = new Object[31];
        d = new String[31];
        _0p.a();
        long l2 = a ^ 0x783D2D7FED52L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l2 >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l3 = 3449475240916105912L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l2 << n * 8 >>> 56);
            ++n;
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(long l2, long l3) {
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
            case 0 -> 2;
            case 1 -> 23;
            case 2 -> 36;
            case 3 -> 10;
            case 4 -> 12;
            case 5 -> 54;
            case 6 -> 9;
            case 7 -> 30;
            case 8 -> 19;
            case 9 -> 56;
            case 10 -> 27;
            case 11 -> 45;
            case 12 -> 0;
            case 13 -> 8;
            case 14 -> 61;
            case 15 -> 24;
            case 16 -> 21;
            case 17 -> 13;
            case 18 -> 6;
            case 19 -> 35;
            case 20 -> 59;
            case 21 -> 55;
            case 22 -> 20;
            case 23 -> 14;
            case 24 -> 3;
            case 25 -> 26;
            case 26 -> 42;
            case 27 -> 47;
            case 28 -> 5;
            case 29 -> 11;
            case 30 -> 60;
            case 31 -> 17;
            case 32 -> 49;
            case 33 -> 1;
            case 34 -> 38;
            case 35 -> 15;
            case 36 -> 62;
            case 37 -> 51;
            case 38 -> 46;
            case 39 -> 48;
            case 40 -> 43;
            case 41 -> 40;
            case 42 -> 18;
            case 43 -> 63;
            case 44 -> 16;
            case 45 -> 41;
            case 46 -> 52;
            case 47 -> 7;
            case 48 -> 53;
            case 49 -> 37;
            case 50 -> 34;
            case 51 -> 31;
            case 52 -> 4;
            case 53 -> 33;
            case 54 -> 39;
            case 55 -> 57;
            case 56 -> 25;
            case 57 -> 58;
            case 58 -> 44;
            case 59 -> 32;
            case 60 -> 29;
            case 61 -> 28;
            case 62 -> 50;
            default -> 22;
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
        _0p.d[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "\u000f5\u0011uzj\u0012 \u00134\u007f6[ ";
        objectArray[1] = Long.TYPE;
        _0p.d[1] = "java/lang/Long";
        objectArray[2] = "uI1\u0005'\u0001~F JD\fk@";
        objectArray[3] = "/Is]`\u0014/Id\u0001l\u001b5\u0002d\u001fl\u000e2s5F;L";
        objectArray[4] = "~\u007fd)#7upuf^/fw|/";
        objectArray[5] = "\u001f{+23~\u001f{<n?q\u00050<p?d\u0002Aj.k'";
        objectArray[6] = "6#D\"Y\\6#S~US,hS`UF+\u0019\u00029\f\u0006";
        objectArray[7] = "\u0011T\u001eY\u001d\u0006\u0011T\t\u0005\u0011\t\u000b\u001f\t\u001b\u0011\u001c\fn_EE^";
        objectArray[8] = "\u0012W\u000e\t\u0017t\u000fB\fH\u0012(OC";
        objectArray[9] = Integer.TYPE;
        _0p.d[9] = "java/lang/Integer";
        objectArray[10] = ";\\F |`;\\Q|po!\u0017Qbpz&f\u0003? :";
        objectArray[11] = "o2\u0014q&$o2\u0003-*+uy\u00033*>r\bQhrt";
        objectArray[12] = "U`I\u000eQsU`^R]|O+^L]iHZ\f\u0017\u0005(";
        objectArray[13] = Boolean.TYPE;
        _0p.d[13] = "java/lang/Boolean";
        objectArray[14] = "\u0003A\\@\u000eP\bNM\u000fo^\u0003EIU";
        objectArray[15] = "0s\u0015\u0016\u00009w3\u0018K{fg?\u0012\u0014\u0017T6xNLC\u00031(\u001e\fFlm&\u001b\t{?1x\u0017\u001a\u0018{5)\u0014s";
        objectArray[16] = "m7QN%,1*J\u0019G5<'UN+\u0007kd\n\u0011|Pl7SU'-k6\u0005BGl=?RK;0 $\u0005)";
        objectArray[17] = "B;\u0002\u0010T)\u0001w\u000bFj$\u0012FS\u0000\u0012c\u0001;\u0013M\u0006x";
        objectArray[18] = "Nmk>\u0002\"Gm~CRZ\u0015pn#\u000bjZz}s";
        objectArray[19] = "jFX8\u0001q)\nQn?zW\u0004Z<Sxo\u0002T8M";
        objectArray[20] = "\u0018_C/\u001e_[\u0013Jy V%\u001cQ:Z\u0011X\\\u001c.A";
        objectArray[21] = "\u0013\u001dTRU\u0011\u001a\u001dA/\u0001iMJYJCS\n\nT\u0017";
        objectArray[22] = "\u0016]\u0006#%\u001b\u001f]\u0013^sc\u0002J\t%v\u0006\u000fK\u0000";
        objectArray[23] = "]Pk^nsTP~#?\u000b\u0006ZhO:3\u0000TlQ";
        objectArray[24] = "F]\rS\u0017\u0010A\\[Dw\b\u0016M\u000bH\u001b:A\u000eT\u0016HmEL\u0013U\t\u0010\u0005\u0001\u0007NwP\u0017W\u0017O\nW\u0016\u0001\u0000/";
        objectArray[25] = "&pIch\u001az~LfU\u0014fV@d)\u0004\u001d*\u0019s8\u001erkZ`5u";
        objectArray[26] = "\u0010I`^@R\u0017V5M0F@DZS@FR\n?^AO)D*FK\u001dLI+O0SYQ!\u001dU^XXZ";
        objectArray[27] = "\u0017[TYR\u0019KFO\u000e0\u000bJZTRg_\u0017\f\u000e\u00060YGSW\\L\u0005ZH\u0000";
        objectArray[28] = "r_}uj49Y=,\fl/^g*`^}\u0012:q\f68Mg)<y2^7M";
        objectArray[29] = "pF\u000eU%_4B_VLY!\u0001UW kuE\u0005\u000ev<p\u0011QW.@,\fJ\u0000L\u0000wFPY/Ds\u0017S0";
        Object[] objectArray2 = objectArray;
        objectArray[30] = "RAf-dJ\u000eOc(YY\u0013KoRbN\u0005U7=>@\u0000P\n";
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _0p.a(l2, l3);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                _0p.c[n] = clazz = Class.forName(d[n]);
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
        Field field = _0p.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _0p.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _0p.a(l2, l3);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = _0p.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _0p.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _0p.a(clazz3, string2, clazz2)) != null) {
                    _0p.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _0p.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _0p.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _0p.b(1042109512308812L, 0L);
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
            for (int j = 0; j < n; ++j) {
                if (classArray2[j] != classArray[j]) continue block0;
            }
            return method;
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _0p.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _0p.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method d(long l2, long l3) {
        int n = _0p.a(l2, l3);
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
                clazz3 = _0p.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _0p.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _0p.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _0p.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _0p.b(1042109512308812L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _0p.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _0p.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _0p.b(1042109512308812L, 0L);
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
            if (c == 'f' || c == '\u00e2' || c == 'E' || c == 'a') {
                field = _0p.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'f' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e2' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'E' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _0p.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f0' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'U' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _0p.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0p" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_0p.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

