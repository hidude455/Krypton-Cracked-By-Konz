/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  java.lang.MatchException
 */
package dev.krypton;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import dev.krypton._4w;
import dev.krypton._8B;
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
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _94
extends _95 {
    private final _8B cfr_renamed_7;
    private final _8B cfr_renamed_2;
    private double cfr_renamed_0;
    private static final long a = l.a(-7702708767617054790L, -1222452503069380891L, MethodHandles.lookup().lookupClass()).a(104601263877377L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long[] i;
    private static final Integer[] j;
    private static final Map k;
    private static final Object[] n;
    private static final String[] o;

    public void void_1(Object[] objectArray) {
        _8B b = (_8B)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x236C50ADF8EL;
        long l5 = l3 ^ 0x5D7090439036L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = b;
        objectArray2[0] = l5;
        _94.e("\u00c2", (Object)_94.e("r", (Object)this, -3465468066824283512L, (long)l2), (Object)objectArray2, -3466165957146658261L, (long)l2);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        _94.e("\u00c2", (Object)this, (Object)objectArray3, -3465874166613321042L, (long)l2);
    }

    public _94(short s, long l2, int n, _8B b) {
        long l3;
        long l4 = l3 = ((long)s << 48 | l2 << 16 >>> 16) ^ a;
        long l5 = l4 ^ 0x6A02A5D4C106L;
        long l6 = l4 ^ 0x476736058CF7L;
        int n2 = (int)(l6 >>> 48);
        int n3 = (int)(l6 << 16 >>> 32);
        int n4 = (int)(l6 << 48 >>> 48);
        long l7 = l4 ^ 0x7EF1021A3D35L;
        int n5 = (int)(l7 >>> 48);
        int n6 = (int)(l7 << 16 >>> 32);
        int n7 = (int)(l7 << 48 >>> 48);
        super((short)n5, n, n6, n7);
        _94.e("$", (Object)this, 0.0, 9100489180522612283L, (long)l3);
        Object[] objectArray = new Object[3];
        objectArray[2] = (int)((short)n4);
        objectArray[1] = n3;
        objectArray[0] = (int)((short)n2);
        this.cfr_renamed_2 = _94.e("\u00c2", (Object)b, (Object)objectArray, 9099412954843799435L, (long)l3);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = (int)((short)n4);
        objectArray2[1] = n3;
        objectArray2[0] = (int)((short)n2);
        this.cfr_renamed_7 = _94.e("\u00c2", (Object)b, (Object)objectArray2, 9099412954843799435L, (long)l3);
        Object[] objectArray3 = new Object[5];
        objectArray3[4] = null;
        objectArray3[3] = (int)_94.e("r", (Object)b, 9100106193367006177L, (long)l3);
        objectArray3[2] = (int)_94.e("r", (Object)b, 9099340002206364072L, (long)l3);
        objectArray3[1] = (int)_94.e("r", (Object)b, 9100203121941863789L, (long)l3);
        objectArray3[0] = l5;
        CallSite callSite = _94.e("q", (Object)objectArray3, 9099691493890015065L, (long)l3);
        _94.e("$", (Object)this, (double)((double)(callSite[0] * 360.0f)), 9100489180522612283L, (long)l3);
    }

    public _94(int n, int n2, int n3, int n4, int n5, long l2) {
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0xA71BD3FD871L;
        int n6 = (int)(l4 >>> 48);
        long l5 = l4 << 16 >>> 16;
        long l6 = l3 ^ 0x1A55EEE6DD11L;
        this((short)n6, l5, n, new _8B(n2, n3, l6, n4, n5));
    }

    public _94(int n, int n2, int n3, int n4, long l2) {
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x57BB8FDC43FAL;
        int n5 = (int)(l4 >>> 48);
        long l5 = l4 << 16 >>> 16;
        long l6 = l3 ^ 0x479FDC05469AL;
        this((short)n5, l5, n, new _8B(n2, n3, l6, n4, (int)_94.c("f", 15300, (long)(0x4ABDAE32A50639D4L ^ l2))));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        n = new Object[47];
        o = new String[47];
        _94.b();
        e = new HashMap(13);
        long l2 = a ^ 0x9E1AC0801AEL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l2 >>> 56);
        for (int j = 1; j < 8; ++j) {
            byArray2 = byArray2;
            byArray2[j] = (byte)(l2 << j * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[2];
        int n = 0;
        String string = "\u00ee?v\u00ca\u009bv\u008b\u007f\u00f2\u00909\u00e7\u0011E\u00d5\u0001\u0010\u00e7\u0082Q\u00d6\u00a2{.\u0018\u00ec\re\u0093s\u00ba\u00b4\u00e4";
        int n2 = "\u00ee?v\u00ca\u009bv\u008b\u007f\u00f2\u00909\u00e7\u0011E\u00d5\u0001\u0010\u00e7\u0082Q\u00d6\u00a2{.\u0018\u00ec\re\u0093s\u00ba\u00b4\u00e4".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = _94.a(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        c = stringArray;
        d = new String[2];
        k = new HashMap(13);
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l2 >>> 56);
        for (int j = 1; j < 8; ++j) {
            byArray5 = byArray5;
            byArray5[j] = (byte)(l2 << j * 8 >>> 56);
        }
        cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n6 = 0;
        String string2 = "#_\u0001M\u00fe \u00c3\u00a4'\u00f2 \u00dc\u00ab\u00d6z\u0081";
        int n7 = "#_\u0001M\u00fe \u00c3\u00a4'\u00f2 \u00dc\u00ab\u00d6z\u0081".length();
        int n8 = 0;
        do {
            byte[] byArray6 = string2.substring(n8, n8 += 8).getBytes("ISO-8859-1");
            int n9 = n6++;
            long l3 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
            lArray[n9] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n8 < n7);
        i = lArray;
        j = new Integer[2];
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/94" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (o[n3] != null) {
            return n3;
        }
        Object object = _94.n[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 52;
            case 1 -> 41;
            case 2 -> 63;
            case 3 -> 0;
            case 4 -> 53;
            case 5 -> 47;
            case 6 -> 31;
            case 7 -> 62;
            case 8 -> 21;
            case 9 -> 42;
            case 10 -> 12;
            case 11 -> 1;
            case 12 -> 54;
            case 13 -> 34;
            case 14 -> 27;
            case 15 -> 16;
            case 16 -> 37;
            case 17 -> 36;
            case 18 -> 45;
            case 19 -> 33;
            case 20 -> 60;
            case 21 -> 2;
            case 22 -> 18;
            case 23 -> 26;
            case 24 -> 32;
            case 25 -> 58;
            case 26 -> 28;
            case 27 -> 43;
            case 28 -> 30;
            case 29 -> 14;
            case 30 -> 25;
            case 31 -> 56;
            case 32 -> 17;
            case 33 -> 38;
            case 34 -> 55;
            case 35 -> 10;
            case 36 -> 39;
            case 37 -> 23;
            case 38 -> 8;
            case 39 -> 4;
            case 40 -> 57;
            case 41 -> 5;
            case 42 -> 40;
            case 43 -> 49;
            case 44 -> 13;
            case 45 -> 3;
            case 46 -> 11;
            case 47 -> 9;
            case 48 -> 6;
            case 49 -> 50;
            case 50 -> 22;
            case 51 -> 46;
            case 52 -> 51;
            case 53 -> 35;
            case 54 -> 20;
            case 55 -> 24;
            case 56 -> 59;
            case 57 -> 48;
            case 58 -> 44;
            case 59 -> 61;
            case 60 -> 15;
            case 61 -> 29;
            case 62 -> 7;
            default -> 19;
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
        _94.o[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = n;
        n[0] = "4\b\u0007?\\S)\u001d\u0005~Y\u000fiY";
        objectArray[1] = "Q]\u001aBW1LH\u0018\u0003Rm\rz";
        objectArray[2] = Integer.TYPE;
        _94.o[2] = "java/lang/Integer";
        objectArray[3] = "\u007fJd\u001e\\$\njo\u0011Mkkdd\u001aI1\u001f";
        objectArray[4] = Void.TYPE;
        _94.o[4] = "java/lang/Void";
        objectArray[5] = "\u0000@>n\u00127\u000bO/!x4\u001fC$j";
        objectArray[6] = Double.TYPE;
        _94.o[6] = "java/lang/Double";
        objectArray[7] = "AxGLQ\fMpF\u0007\u0018\u0004QxDL|\u0010Mye\u0000\\\u0006Ac";
        objectArray[8] = "f,\u0012\u0007]\nm#\u0003H \u0012~$\n\u0001";
        objectArray[9] = "\u0002TG\r\u000b*\t[VBk3\u0005WT\u001e";
        objectArray[10] = "F\t`XSNM\u0006q\u00174LX\rq\\\u000f";
        objectArray[11] = "}(\\^j8\b\bWQ{wi\u0006\\Z\u007f-\u001d";
        objectArray[12] = "^ (j\u001dNC5*+\u0018\u0012\u0003p";
        objectArray[13] = "\u0017B\u0005\u0002wFbb\u000e\rf\t\u0003l\u0005\u0006bSw";
        objectArray[14] = "1<4A}!D\u001c?Nln%\u00124Eh4Q";
        objectArray[15] = "u#;kih\u0000\u00030dx'a\r;o|}\u0015";
        objectArray[16] = "!L";
        objectArray[17] = "\u0019\u0007_RW\u001dl'T]FR\r)_VB\by";
        objectArray[18] = Boolean.TYPE;
        _94.o[18] = "java/lang/Boolean";
        objectArray[19] = "\u0010#jQLn\u001c+k\u001a\u0005f\u0000#iQar\u001c\"B\u0013Nl\u0016\"s";
        objectArray[20] = "VRm\u001aP[#rf\u0015A\u0014B|m\u001eEN6";
        objectArray[21] = "]\u001b\u0013\t8\u0011(;\u0018\u0006)^I5\u0013\r-\u0004=";
        objectArray[22] = "\"\tMV\r\u000f)\u0006\\\u0019l\u0001\"\rXC";
        objectArray[23] = ";yZ\u001a\u0016e`n\u0010Mqun|aI\u0012\u007fz?ZM\u0011hf\u0007\n\u0005\bd?>\u0003\u0004\u0001e\u0007";
        objectArray[24] = "\u0001\\9*Mr\u0001QaKKN\u0012Z52J~^R=";
        objectArray[25] = "k5;V$c'=3/&S/3n_ymg/2O";
        objectArray[26] = "\u0011P`xu\u007f]Xh\u0001uO\u0001Hqnq,\rSv1H2\u000b\\r<x~\u0003T\u000b";
        objectArray[27] = "\u0007\u0015oG\u0003\u0016K\u001dg>\u000faz\u001f{DQ\u001f\u0019\u0013`C\u000e&C\u0013:N^\u0018\u000b\u000ff^>";
        objectArray[28] = "<\u0007\u0004w^/<^H$0nn\u0000Euw~\u0007XZi\bu=\u0003YyW\u0010<\u0007\u0004w^/<^H$0";
        objectArray[29] = "|\u0012\u000b<@\u001b|\u001fS]D'o\u0014\u0007$G\u0017#\u001c\u000f";
        objectArray[30] = "*E0V.\u0016*Hh7)*)[-X-I%@*\u0007\u0014\u0011}Zj\u000b%\u0015+F57";
        objectArray[31] = "m\u001d=S@hzC=\n&1z>7Q@\u0017k\u001e!]ZPj\r5G\u001eic\f<F&";
        objectArray[32] = "b\u0004,Q\u0017W9\u0013f\u0006pN2\u0016OE\u0017_3\u0000kNp\u001a=\u0010j\u0007K\u001e>\u0007v?NM \u0018+\u0001\u0019\u001f,E\u0017\u0004IYcF&\u0000\u001fE<z";
        objectArray[33] = "\u0004/Mn22E{[oX|RqK>\u001fl;,Wm(b\u0005dK18\u0002\u0004/Mn22E{[oX";
        objectArray[34] = "\u000fs^RD/\u000f~\u00063F\u0013\fmC\\Gp\u0000vD\u0003~(Xl\u0004\u000fO,\u000ep[3";
        objectArray[35] = "m}pnI\u001e!ux\u0017O.){%g\u0014\u0010agyw";
        objectArray[36] = "\bd$2S1Dl,KQ\u0001\u0018|5$Wb\u0014g2{n|\u0012h6v^0\u001a`O";
        objectArray[37] = "go\u0005q\r%p1\u0005(krfr=o*{w\u000eMuUmk0\u0005i\t}\u000b";
        objectArray[38] = "Bi}\u001bJ-\u000eaubO\u001dRql\rN~^jkRww^tv_Ip_w.b";
        objectArray[39] = "j\u0002\u001eo\u000eke\u001a\u0019we7Z\u000b\u001bo\n59\u0007\u0000hU\fa_\u001a(Y=e\t\u0006we";
        objectArray[40] = "UC7\u0002\u0012GB\u001d7[t\u0010T^\u000f\u001c6\u0004^D\u0001\r\u0016\u0012R^F[\nDWE6\u0000\u001d\u000e\u0000\"";
        objectArray[41] = "Ck\bUyaCfP4s]\u0011h\u001e\f&gJk\u000eS";
        objectArray[42] = "\u001e\u0005N=&3E\u0012\u0004jA,O\u0007un\")_CNj!>C{\u001920&DC\u000el0\u007f\"";
        objectArray[43] = "~\tQ$\u000e,2\u0001Y]\t\u001cn\u0011@2\n\u007fb\nGm3ad\u0005C`\u0003-l\r:";
        objectArray[44] = "2*J;N(~\"BBC\u0018v,\u001f2\u0013&>0C\"";
        objectArray[45] = "]_ho\u00170\u0011W`\u0016\u0016E \u0001b(Z`\u001eI~tJ";
        Object[] objectArray2 = objectArray;
        objectArray[46] = "l*\t=1K{t\tdW\u001cm71#\u001b\u0014}!\u001c5WOb:@=m\u0014a*\u001fX";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'r' || c == '$' || c == 'C' || c == '\u00e7') {
                field = _94.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'r' ? lookup.findGetter(clazz, string2, clazz2) : (c == '$' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'C' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _94.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'q' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _94.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/94" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int c(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x6D5;
        if (j[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = i[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])k.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    k.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/94", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _94.j[n2] = n3;
        }
        return j[n2];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _94.c(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Method h(long l2, long l3) {
        int n = _94.e(l2, l3);
        Object object = _94.n[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = o[n];
                int n3 = string2.indexOf(8);
                clazz3 = _94.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _94.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _94.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _94.n[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _94.f(1590369885033576L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _94.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _94.n[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _94.f(1590369885033576L, 0L);
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
            int n = _94.e(l2, l3);
            object = _94.n[n];
            try {
                if (!(object instanceof String)) break block2;
                _94.n[n] = clazz = Class.forName(o[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _94.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _94.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _94.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _94.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x16D1;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l3 = Thread.currentThread().threadId();
                objectArray = (Object[])e.get(l3);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l3, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/94", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l2 >>> 56);
            for (int j = 1; j < 8; ++j) {
                byArray[j] = (byte)(l2 << j * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            _94.d[n2] = _94.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/94" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _94.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static Field g(long l2, long l3) {
        int n = _94.e(l2, l3);
        Object object = _94.n[n];
        if (object instanceof String) {
            String string = o[n];
            int n2 = string.indexOf(8);
            Class clazz = _94.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _94.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _94.c(clazz3, string2, clazz2)) != null) {
                    _94.n[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _94.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _94.n[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _94.f(1590369885033576L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public int int_0(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (int)_94.e("r", (Object)_94.e("r", (Object)this, -663129888656153684L, (long)l2), -665514764734498296L, (long)l2);
    }

    public double double_0(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (double)_94.e("r", (Object)this, -7391982621087440614L, (long)l2);
    }

    public void void_0(Object[] objectArray) {
        double d = (Double)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = a ^ l2;
        _94.e("$", (Object)this, (double)d, -4884610513292442554L, (long)l2);
    }

    public _8B dev_krypton_8B_0(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return _94.e("r", (Object)this, -1983187471773897959L, (long)l2);
    }

    public int int_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (int)_94.e("r", (Object)_94.e("r", (Object)this, -7917318018848667840L, (long)l2), -7913870061460514937L, (long)l2);
    }

    public int int_3(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (int)_94.e("r", (Object)_94.e("r", (Object)this, -1143537959835491007L, (long)l2), -1140133365334715638L, (long)l2);
    }

    public int int_4(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (int)_94.e("r", (Object)_94.e("r", (Object)this, -2494922838912235520L, (long)l2), -2494630185623711090L, (long)l2);
    }

    public _8B dev_krypton_8B_4(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return _94.e("r", (Object)this, 5162341059519976132L, (long)l2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public boolean boolean_5(Object[] var1_1) {
        block22: {
            block21: {
                block20: {
                    block19: {
                        var2_2 = (Long)var1_1[0];
                        var4_3 = _8j.cfr_renamed_3();
                        try {
                            try {
                                v0 /* !! */  = _94.e("r", (Object)_94.e("r", (Object)this, (long)6338307656367407766L, (long)var2_2), (long)6339390202499888349L, (long)var2_2);
                                v1 = _94.e("r", (Object)_94.e("r", (Object)this, (long)6338631333238069396L, (long)var2_2), (long)6339390202499888349L, (long)var2_2);
                                v2 = var4_3;
                                if (var2_2 < 0L) ** GOTO lbl25
                                if (v2 != null) break block19;
                                if (v0 /* !! */  == v1) {
                                }
                                ** GOTO lbl-1000
                            }
                            catch (MatchException v3) {
                                throw _94.a(v3);
                            }
                            v0 /* !! */  = _94.e("r", (Object)_94.e("r", (Object)this, (long)6338307656367407766L, (long)var2_2), (long)6338599661039065112L, (long)var2_2);
                            v1 = _94.e("r", (Object)_94.e("r", (Object)this, (long)6338631333238069396L, (long)var2_2), (long)6338599661039065112L, (long)var2_2);
                        }
                        catch (MatchException v4) {
                            throw _94.a(v4);
                        }
                    }
                    try {
                        try {
                            v2 = var4_3;
lbl25:
                            // 2 sources

                            if (var2_2 < 0L) ** GOTO lbl42
                            if (v2 != null) break block20;
                            if (v0 /* !! */  == v1) {
                            }
                            ** GOTO lbl-1000
                        }
                        catch (MatchException v5) {
                            throw _94.a(v5);
                        }
                        v0 /* !! */  = _94.e("r", (Object)_94.e("r", (Object)this, (long)6338307656367407766L, (long)var2_2), (long)6339503761196503633L, (long)var2_2);
                        v1 = _94.e("r", (Object)_94.e("r", (Object)this, (long)6338631333238069396L, (long)var2_2), (long)6339503761196503633L, (long)var2_2);
                    }
                    catch (MatchException v6) {
                        throw _94.a(v6);
                    }
                }
                try {
                    try {
                        try {
                            v2 = var4_3;
lbl42:
                            // 2 sources

                            if (v2 != null) break block21;
                            if (v0 /* !! */  == v1) {
                            }
                            ** GOTO lbl-1000
                        }
                        catch (MatchException v7) {
                            throw _94.a(v7);
                        }
                        v0 /* !! */  = _94.e("r", (Object)_94.e("r", (Object)this, (long)6338307656367407766L, (long)var2_2), (long)6339302470592191282L, (long)var2_2);
                        if (var4_3 != null) break block22;
                    }
                    catch (MatchException v8) {
                        throw _94.a(v8);
                    }
                    v1 = _94.e("r", (Object)_94.e("r", (Object)this, (long)6338631333238069396L, (long)var2_2), (long)6339302470592191282L, (long)var2_2);
                }
                catch (MatchException v9) {
                    throw _94.a(v9);
                }
            }
            if (v0 /* !! */  == v1) {
                v0 /* !! */  = (CallSite)true;
            } else lbl-1000:
            // 4 sources

            {
                v0 /* !! */  = (CallSite)false;
            }
        }
        return (boolean)v0 /* !! */ ;
    }

    public void void_5(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        long l2 = (Long)objectArray[2];
        int n3 = (Integer)objectArray[3];
        int n4 = (Integer)objectArray[4];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x4951ADC5678CL;
        long l5 = l3 ^ 0x2CF0A6576238L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = n4;
        objectArray2[3] = n3;
        objectArray2[2] = n2;
        objectArray2[1] = l4;
        objectArray2[0] = n;
        _94.e("\u00c2", (Object)_94.e("r", (Object)this, 8241026434335188798L, (long)l2), (Object)objectArray2, 8237166770203211378L, (long)l2);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l5;
        _94.e("\u00c2", (Object)this, (Object)objectArray3, 8237245383539091224L, (long)l2);
    }

    public int int_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = a ^ l2) ^ 0x64E44DFE3549L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        return (int)_94.e("\u00c2", (Object)_94.e("r", (Object)this, -6739020820808403174L, (long)l2), (Object)objectArray2, -6738609735737863385L, (long)l2);
    }

    @Override
    public void void_7(Object[] objectArray) {
        block26: {
            _94 v16;
            CallSite callSite;
            long l2;
            long l3;
            block35: {
                CallSite callSite2;
                CallSite callSite3;
                CallSite callSite4;
                CallSite callSite5;
                String string;
                long l4;
                block33: {
                    block34: {
                        CallSite callSite6;
                        block31: {
                            block32: {
                                CallSite callSite7;
                                block29: {
                                    block30: {
                                        CallSite callSite8;
                                        block27: {
                                            block28: {
                                                JsonElement jsonElement;
                                                block25: {
                                                    JsonElement jsonElement2 = (JsonElement)objectArray[0];
                                                    l3 = (Long)objectArray[1];
                                                    long l5 = l3;
                                                    l2 = l5 ^ 0x6C124066EE1L;
                                                    l4 = l5 ^ 0x5B7F442AA084L;
                                                    string = _8j.cfr_renamed_3();
                                                    try {
                                                        try {
                                                            jsonElement = jsonElement2;
                                                            if (string != null) break block25;
                                                            if (_94.e("\u00c2", (Object)jsonElement, -1466539948083110345L, (long)l3) == false) break block26;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _94.a(matchException);
                                                        }
                                                        jsonElement = jsonElement2;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _94.a(matchException);
                                                    }
                                                }
                                                callSite = _94.e("\u00c2", (Object)jsonElement, -1465898588165069637L, (long)l3);
                                                try {
                                                    try {
                                                        callSite8 = _94.e("\u00c2", (Object)callSite, (Object)"r", -1465940957957293975L, (long)l3);
                                                        if (string != null) break block27;
                                                        if (callSite8 == false) break block28;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _94.a(matchException);
                                                    }
                                                    callSite8 = _94.e("\u00c2", (Object)_94.e("\u00c2", (Object)callSite, (Object)"r", -1465755706111078932L, (long)l3), -1464990461258552094L, (long)l3);
                                                    break block27;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _94.a(matchException);
                                                }
                                            }
                                            callSite8 = _94.c("f", 31307, (long)(0x590F4212F754973CL ^ l3));
                                        }
                                        callSite5 = callSite8;
                                        try {
                                            try {
                                                callSite7 = _94.e("\u00c2", (Object)callSite, (Object)"g", -1465940957957293975L, (long)l3);
                                                if (string != null) break block29;
                                                if (callSite7 == false) break block30;
                                            }
                                            catch (MatchException matchException) {
                                                throw _94.a(matchException);
                                            }
                                            callSite7 = _94.e("\u00c2", (Object)_94.e("\u00c2", (Object)callSite, (Object)"g", -1465755706111078932L, (long)l3), -1464990461258552094L, (long)l3);
                                            break block29;
                                        }
                                        catch (MatchException matchException) {
                                            throw _94.a(matchException);
                                        }
                                    }
                                    callSite7 = _94.c("f", 15300, (long)(0x4ABDF167489AD6B2L ^ l3));
                                }
                                callSite4 = callSite7;
                                try {
                                    try {
                                        callSite6 = _94.e("\u00c2", (Object)callSite, (Object)"b", -1465940957957293975L, (long)l3);
                                        if (string != null) break block31;
                                        if (callSite6 == false) break block32;
                                    }
                                    catch (MatchException matchException) {
                                        throw _94.a(matchException);
                                    }
                                    callSite6 = _94.e("\u00c2", (Object)_94.e("\u00c2", (Object)callSite, (Object)"b", -1465755706111078932L, (long)l3), -1464990461258552094L, (long)l3);
                                    break block31;
                                }
                                catch (MatchException matchException) {
                                    throw _94.a(matchException);
                                }
                            }
                            callSite6 = _94.c("f", 15300, (long)(0x4ABDF167489AD6B2L ^ l3));
                        }
                        callSite3 = callSite6;
                        try {
                            try {
                                callSite2 = _94.e("\u00c2", (Object)callSite, (Object)"a", -1465940957957293975L, (long)l3);
                                if (string != null) break block33;
                                if (callSite2 == false) break block34;
                            }
                            catch (MatchException matchException) {
                                throw _94.a(matchException);
                            }
                            callSite2 = _94.e("\u00c2", (Object)_94.e("\u00c2", (Object)callSite, (Object)"a", -1465755706111078932L, (long)l3), -1464990461258552094L, (long)l3);
                            break block33;
                        }
                        catch (MatchException matchException) {
                            throw _94.a(matchException);
                        }
                    }
                    callSite2 = _94.c("f", 15300, (long)(0x4ABDF167489AD6B2L ^ l3));
                }
                CallSite callSite9 = callSite2;
                try {
                    try {
                        if (l3 > 0L) {
                            v16 = this;
                            if (string != null) break block35;
                            Object[] objectArray2 = new Object[5];
                            objectArray2[4] = (int)callSite9;
                            objectArray2[3] = (int)callSite3;
                            objectArray2[2] = l4;
                            objectArray2[1] = (int)callSite4;
                            objectArray2[0] = (int)callSite5;
                            _94.e("\u00c2", (Object)v16, (Object)objectArray2, -1466567638040874469L, (long)l3);
                        }
                        if (_94.e("\u00c2", (Object)callSite, (Object)_94.a("m", 15402, (long)(0x168ECB1EB6D1C158L ^ l3)), -1465940957957293975L, (long)l3) == false) break block26;
                    }
                    catch (MatchException matchException) {
                        throw _94.a(matchException);
                    }
                    v16 = this;
                }
                catch (MatchException matchException) {
                    throw _94.a(matchException);
                }
            }
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l2;
            objectArray3[0] = (double)_94.e("\u00c2", (Object)_94.e("\u00c2", (Object)callSite, (Object)_94.a("m", 25975, (long)(0x6CE1C7FEA7CF9804L ^ l3)), -1465755706111078932L, (long)l3), -1465447753780928729L, (long)l3);
            _94.e("\u00c2", (Object)v16, (Object)objectArray3, -1465171150409269904L, (long)l3);
        }
    }

    public _8B dev_krypton_8B_7(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = a ^ l2) ^ 0x61EC0C74B4EL;
        return new _8B((int)_94.e("r", (Object)_94.e("r", (Object)this, 655066879277489271L, (long)l2), 656253605342784060L, (long)l2), (int)_94.e("r", (Object)_94.e("r", (Object)this, 655066879277489271L, (long)l2), 654790160855811833L, (long)l2), l3, (int)_94.e("r", (Object)_94.e("r", (Object)this, 655066879277489271L, (long)l2), 656122522718211248L, (long)l2), (int)_94.e("r", (Object)_94.e("r", (Object)this, 655066879277489271L, (long)l2), 655494622645650899L, (long)l2));
    }

    @Override
    public void void_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 ^ 0x2FD9E19B6F37L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = (int)_94.e("r", (Object)_94.e("r", (Object)this, 2600634235851221876L, (long)l2), 2601289002129959122L, (long)l2);
        objectArray2[3] = (int)_94.e("r", (Object)_94.e("r", (Object)this, 2600634235851221876L, (long)l2), 2601507763623272881L, (long)l2);
        objectArray2[2] = l3;
        objectArray2[1] = (int)_94.e("r", (Object)_94.e("r", (Object)this, 2600634235851221876L, (long)l2), 2600585091731450872L, (long)l2);
        objectArray2[0] = (int)_94.e("r", (Object)_94.e("r", (Object)this, 2600634235851221876L, (long)l2), 2601410834511529789L, (long)l2);
        _94.e("\u00c2", (Object)this, (Object)objectArray2, 2600477106354568616L, (long)l2);
    }

    @Override
    public JsonElement com_google_gson_JsonElement_8(Object[] objectArray) {
        JsonObject jsonObject;
        long l2 = (Long)objectArray[0];
        JsonObject jsonObject2 = new JsonObject();
        String string = _8j.cfr_renamed_3();
        _94.e("\u00c2", (Object)jsonObject2, (Object)"r", (Object)_94.e("q", (int)_94.e("r", (Object)_94.e("r", (Object)this, -4044144318214860160L, (long)l2), -4040739466555398965L, (long)l2), -4039920295914241115L, (long)l2), -4039982332577936714L, (long)l2);
        _94.e("\u00c2", (Object)jsonObject2, (Object)"g", (Object)_94.e("q", (int)_94.e("r", (Object)_94.e("r", (Object)this, -4044144318214860160L, (long)l2), -4043849977549715442L, (long)l2), -4039920295914241115L, (long)l2), -4039982332577936714L, (long)l2);
        String string2 = string;
        try {
            _94.e("\u00c2", (Object)jsonObject2, (Object)"b", (Object)_94.e("q", (int)_94.e("r", (Object)_94.e("r", (Object)this, -4044144318214860160L, (long)l2), -4040837151043730873L, (long)l2), -4039920295914241115L, (long)l2), -4039982332577936714L, (long)l2);
            _94.e("\u00c2", (Object)jsonObject2, (Object)"a", (Object)_94.e("q", (int)_94.e("r", (Object)_94.e("r", (Object)this, -4044144318214860160L, (long)l2), -4039769467789522140L, (long)l2), -4039920295914241115L, (long)l2), -4039982332577936714L, (long)l2);
            _94.e("\u00c2", (Object)jsonObject2, (Object)_94.a("m", 25975, (long)(0x6CE1CADA2987B441L ^ l2)), (Object)_94.e("q", (double)_94.e("r", (Object)this, -4040453537892089955L, (long)l2), -4044192011852235728L, (long)l2), -4039982332577936714L, (long)l2);
            jsonObject = jsonObject2;
            if (l2 >= 0L && string2 != null) {
                _4w.cfr_renamed_8(new String[2]);
            }
        }
        catch (MatchException matchException) {
            throw _94.a(matchException);
        }
        return jsonObject;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_94.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_94.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_2() {
        try {
            return MethodHandles.lookup().findStatic(_94.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

