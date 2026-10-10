/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1297
 *  net.minecraft.class_1299
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._3i_0;
import dev.krypton._4r;
import dev.krypton._6M;
import dev.krypton._6x_0;
import dev.krypton._8F;
import dev.krypton._95;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1297;
import net.minecraft.class_1299;

public class _5V
extends _6x_0 {
    private static final long b;
    private static final long d;
    private static final Object[] e;
    private static final String[] f;

    private void cfr_renamed_261(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x55419166EDAFL;
        long l5 = l3 ^ 0x327891803A7EL;
        CallSite callSite = _5V.a("\u00e3", (Object)_5V.a("\u00e3", (Object)this, -4503956773785425213L, (long)l2), -4503770186324638078L, (long)l2);
        try {
            if (callSite == null) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw _5V.a(matchException);
        }
        ArrayList arrayList = new ArrayList();
        _5V.a("\u00f5", (Object)_5V.a("\u00f5", (Object)callSite, -4507586900381342871L, (long)l2), arg_0 -> this.cfr_renamed_1(l4, arrayList, arg_0), -4504562035923893412L, (long)l2);
        _5V.a("\u00f5", arrayList, arg_0 -> _5V.cfr_renamed_1(l5, arg_0), -4503655509120970527L, (long)l2);
    }

    public _5V(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x7E70658EC81L;
        long l5 = l3 ^ 0x1827957C03F3L;
        super((int)d, -1, (_4r)((Object)_5V.a("\u00d4", 5020726405443332442L, (long)l2)), l4);
        Object[] objectArray = new Object[2];
        objectArray[1] = new _95[0];
        objectArray[0] = l5;
        _5V.a("\u00f5", (Object)this, (Object)objectArray, 5017679818522473131L, (long)l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a.init(_5V.class, 54);
        b = l.a(-5582872683376102019L, 8598426718609038892L, MethodHandles.lookup().lookupClass()).a(251381571958793L);
        e = new Object[38];
        f = new String[38];
        _5V.b();
        long l2 = b ^ 0x70B16E4438F5L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l2 >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l3 = 3019666473561197598L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
                d = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l2 << n * 8 >>> 56);
            ++n;
        }
    }

    private static int e(long l2, long l3) {
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
            case 0 -> 32;
            case 1 -> 15;
            case 2 -> 25;
            case 3 -> 63;
            case 4 -> 62;
            case 5 -> 60;
            case 6 -> 21;
            case 7 -> 47;
            case 8 -> 43;
            case 9 -> 26;
            case 10 -> 53;
            case 11 -> 42;
            case 12 -> 4;
            case 13 -> 35;
            case 14 -> 40;
            case 15 -> 59;
            case 16 -> 56;
            case 17 -> 5;
            case 18 -> 46;
            case 19 -> 55;
            case 20 -> 9;
            case 21 -> 37;
            case 22 -> 31;
            case 23 -> 3;
            case 24 -> 11;
            case 25 -> 44;
            case 26 -> 39;
            case 27 -> 45;
            case 28 -> 17;
            case 29 -> 57;
            case 30 -> 36;
            case 31 -> 6;
            case 32 -> 29;
            case 33 -> 33;
            case 34 -> 7;
            case 35 -> 19;
            case 36 -> 16;
            case 37 -> 61;
            case 38 -> 28;
            case 39 -> 1;
            case 40 -> 50;
            case 41 -> 34;
            case 42 -> 41;
            case 43 -> 24;
            case 44 -> 22;
            case 45 -> 48;
            case 46 -> 10;
            case 47 -> 51;
            case 48 -> 58;
            case 49 -> 2;
            case 50 -> 49;
            case 51 -> 54;
            case 52 -> 13;
            case 53 -> 52;
            case 54 -> 20;
            case 55 -> 12;
            case 56 -> 38;
            case 57 -> 23;
            case 58 -> 14;
            case 59 -> 30;
            case 60 -> 0;
            case 61 -> 8;
            case 62 -> 18;
            default -> 27;
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
        _5V.f[n3] = new String(cArray);
        return n3;
    }

    private void cfr_renamed_1(long l2, List list, class_1297 class_12972) {
        block6: {
            long l3 = (l2 = b ^ l2) ^ 0x2FD362268300L;
            int n = _8F.cfr_renamed_7();
            try {
                CallSite callSite;
                try {
                    try {
                        if (class_12972 == null) break block6;
                        Object[] objectArray = new Object[2];
                        objectArray[1] = l3;
                        objectArray[0] = _5V.a("\u00f5", (Object)class_12972, 634491938055173637L, (long)l2);
                        callSite = _5V.a("\u00f5", (Object)this, (Object)objectArray, 631094342817947708L, (long)l2);
                        if (n == 0) break block6;
                    }
                    catch (MatchException matchException) {
                        throw _5V.a(matchException);
                    }
                    if (callSite == false) break block6;
                }
                catch (MatchException matchException) {
                    throw _5V.a(matchException);
                }
                callSite = _5V.a("\u00f5", (Object)list, (Object)class_12972, 634199034738485350L, (long)l2);
            }
            catch (MatchException matchException) {
                throw _5V.a(matchException);
            }
        }
    }

    @_3i_0
    public void cfr_renamed_1(_6M m) {
        long l2 = b ^ 0x11B82781F1F0L;
        long l3 = l2 ^ 0x4FD18AF05E26L;
        try {
            Object[] objectArray = new Object[2];
            objectArray[1] = l3;
            objectArray[0] = _5V.a("\u00f5", (Object)m.cfr_renamed_4, -3032967439244122216L, (long)l2);
            if (_5V.a("\u00f5", (Object)this, (Object)objectArray, -3034167255752835814L, (long)l2) != false) {
                m.void_8();
            }
        }
        catch (MatchException matchException) {
            throw _5V.a(matchException);
        }
    }

    private static void cfr_renamed_1(long l2, class_1297 class_12972) {
        block5: {
            class_1297 class_12973;
            block4: {
                l2 = b ^ l2;
                int n = _8F.cfr_renamed_8();
                try {
                    try {
                        class_12973 = class_12972;
                        if (n != 0) break block4;
                        if (_5V.a("\u00f5", (Object)class_12973, -2372693711698322194L, (long)l2) != false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _5V.a(matchException);
                    }
                    class_12973 = class_12972;
                }
                catch (MatchException matchException) {
                    throw _5V.a(matchException);
                }
            }
            _5V.a("\u00f5", (Object)class_12973, (Object)_5V.a("\u00d4", -2369259672437073355L, (long)l2), -2369565191777462637L, (long)l2);
        }
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e3' || c == '\u00e6' || c == '\u00d4' || c == 'l') {
                field = _5V.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e3' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e6' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d4' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5V.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00aa' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        Object[] objectArray = e;
        e[0] = "\u0000PeO\u00198\u000b_t\u0000~ \u000fCrL[1";
        objectArray[1] = "\u0011.\u00146]\u0006\u000f&\u000ey\u0015\u0006\u0015,\u0016>\u001c\u001dU\f\r9\u0000\u0006\u0016*\u0010";
        objectArray[2] = Void.TYPE;
        _5V.f[2] = "java/lang/Void";
        objectArray[3] = "O?K3ZrO?\\oV}Ut\\qVhR\u0005\f,\u0007";
        objectArray[4] = "0qT\ng[0qCVkT*:CHkA-K\u0016\u00172";
        objectArray[5] = "7b\u0001\u001e\u00155)j\u001bQw).w";
        objectArray[6] = "\u007fV+e0NbC)$5\u0012-K";
        objectArray[7] = "8\f8\t#\u001d%\u0019:H&Ah\u001b";
        objectArray[8] = "+\u0018s-\fW^8x\"\u001d\u0018?6s)\u0019BK";
        objectArray[9] = "u782\u0018\u0014u7/n\u0014\u001bo|/p\u0014\u000eh\r}.LD";
        objectArray[10] = "[0z?\rVP?kplX[4o*";
        objectArray[11] = Boolean.TYPE;
        _5V.f[11] = "java/lang/Boolean";
        objectArray[12] = "G.aZS*G.v\u0006_%]ev\u0018_0Z\u0014'B\u000ew";
        objectArray[13] = "\u001e\u0010\u001aa\u0014\\\u0003\u0005\u0018 \u0011\u0000O#";
        objectArray[14] = "qG,pNZ\u0004g'\u007f_\u0015ei,t[O\u0011";
        objectArray[15] = "lQ?Y$\u0019lQ(\u0005(\u0016v\u001a(\u001b(\u0003qk|C\u007f";
        objectArray[16] = "cPEDe)\u0016pNKtfw~E@p<\u0003";
        objectArray[17] = "|\u001d$>KR|\u001d3bG]fV3|GHa'a\"\u001f\f6\u001b<qUHMMe\"\u001f";
        objectArray[18] = "|\u001f\u0006S#0|\u001f\u0011\u000f/?fT\u0011\u0011/*a%COwn";
        objectArray[19] = "qMfin\u0014q\u00045i^\u001d{\u0010hx\tI$L=%^\u0018*\u0017q$9\u0018cDq";
        objectArray[20] = "\u0004ns\u001d~*\u0013sd[@t\u0002bz\u0002,FR.$Y@/\u000bpb\u000b<aSa*e";
        objectArray[21] = "\u0010;.+c\u0001Pv38\f\u001dKg/7[J\u00150w[e\t\u0016g&f0\rZ0";
        objectArray[22] = "\u0012d\u0015*\ti\u0007wNZ\b`\u0001V\u001a1\u0006\u0007B*\u000e7\b;@~\b!f>\u001ed\u001d3\u001b7\u0007d\u0003Z";
        objectArray[23] = "T\u0017|(-\u0018\u000f\u0017c/P\u0004\t\u0017|4<6]R%maaZ\u000fr+>\u001d\u0014WccP";
        objectArray[24] = "\u000ei\\\u001a}oQ=GT\u001ecYj.\u0014':I6\u001e\u0017g6U\u0006\u0011Wfn\tzP\u0014we5";
        objectArray[25] = "y>ew099sxd_%\"bdk\br}??\u0007d y3;`2v.c";
        objectArray[26] = "_\u0012g\fI\\\u0011\u0001q\by\tP\u007fw\u0017\u0006\t\u0010Fl\u0001\u0000XnFx\u0012\u0017[\u0013Oa\u0012\t2";
        objectArray[27] = "\u001f09\u001c~g@d\"R\u001dlC%\u0006Dvb$fzPpl\u0018d.Vf\u0002\u001d:4Ct\u007f\u0014#4]\u001d";
        objectArray[28] = "E(u.}T@st-\u0016q?\u000eSL\u0016\u0000\u001830{\u007f\u0005C23";
        objectArray[29] = "\u0017\u000eI-4yYVXeZkH\u0007C9\r;\u0010Q\u001eUdaG\u0012I)*9VZ";
        objectArray[30] = "M8~KnM\r*rG^\bqm?\u0013.^\u0003-r\u000e=";
        objectArray[31] = "K\u0003)<7D\\\u001e>z\t\u001aM\u000f #e(\u001dM}|\t\u0014\u0010\u0019=tn\u0014YJ=D0\u001a_\u001d)99\u0003_\u0003@";
        objectArray[32] = ":\u0013xrDl-\u000eo4z2<\u001fqm\u0016\u0000jZ-:CWn\u001finF+/\\xez";
        objectArray[33] = "\\`{A\u007f.\u001crwMOk`eq\u0003t,Y~g\u0005%RYjt\u0012&/Pst\fO";
        objectArray[34] = "Z;6M`?Y{:QPb\u001c\u007foU+\u000fZ;6M`?Y{:QP0\u0019zb\r,qZki1";
        objectArray[35] = "\u001f\\\u00070w\u007fI\nP`L}IK]k O\u001d\u0007\u00045v\u0018MH[|#vX[\u0000\f";
        objectArray[36] = "w\\V\u0012\u0004\u00049O@\u00164RF[V\f\u000f\u0014\u007f@@\n^jyMT\u0017\b\u00168\u000eE\u001c4";
        Object[] objectArray2 = objectArray;
        objectArray[37] = "(E\u000fqHlf\u001d\u001e9&~wL\u0005eq./\u001b_\t\u0018txY\u000fuV,i\u0011";
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _5V.b(lookup, mutableCallSite, string, methodType, l2, l3);
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
        int n = _5V.e(l2, l3);
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
                clazz3 = _5V.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5V.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5V.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5V.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5V.f(714431343973697L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5V.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5V.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5V.f(714431343973697L, 0L);
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
            int n = _5V.e(l2, l3);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                _5V.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5V.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5V.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5V.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5V.d(classArray[j], string, clazz2);
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
            throw new RuntimeException("dev/krypton/5V" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field g(long l2, long l3) {
        int n = _5V.e(l2, l3);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = _5V.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5V.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5V.c(clazz3, string2, clazz2)) != null) {
                    _5V.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5V.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5V.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5V.f(714431343973697L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private boolean boolean_0(Object[] objectArray) {
        Object object;
        block10: {
            block9: {
                block11: {
                    class_1299 class_12992;
                    int n;
                    long l2;
                    class_1299 class_12993;
                    block8: {
                        class_12993 = (class_1299)objectArray[0];
                        l2 = (Long)objectArray[1];
                        l2 = b ^ l2;
                        n = _8F.cfr_renamed_7();
                        try {
                            class_12992 = class_12993;
                            if (n == 0) break block8;
                            if (class_12992 == null) break block9;
                        }
                        catch (MatchException matchException) {
                            throw _5V.a(matchException);
                        }
                        class_12992 = class_12993;
                    }
                    try {
                        try {
                            try {
                                object = _5V.a("\u00f5", (Object)class_12992, (Object)_5V.a("\u00d4", -5777805373392754029L, (long)l2), -5773927625868531092L, (long)l2);
                                if (n == 0) break block10;
                                if (object) break block11;
                            }
                            catch (MatchException matchException) {
                                throw _5V.a(matchException);
                            }
                            object = _5V.a("\u00f5", (Object)class_12993, (Object)_5V.a("\u00d4", -5773886897374362005L, (long)l2), -5773927625868531092L, (long)l2);
                            if (n == 0) break block10;
                        }
                        catch (MatchException matchException) {
                            throw _5V.a(matchException);
                        }
                        if (!object) break block9;
                    }
                    catch (MatchException matchException) {
                        throw _5V.a(matchException);
                    }
                }
                object = true;
                break block10;
            }
            object = false;
        }
        return object;
    }

    @Override
    public native void cfr_renamed_2();

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5V.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

