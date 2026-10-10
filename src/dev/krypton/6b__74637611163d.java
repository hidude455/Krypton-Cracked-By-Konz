/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap$Entry
 *  net.minecraft.class_2338
 *  net.minecraft.class_2804
 *  net.minecraft.class_3558
 */
package dev.krypton;

import dev.krypton._3i_0;
import dev.krypton._4r;
import dev.krypton._6c_0;
import dev.krypton._6x_0;
import dev.krypton._8B;
import dev.krypton._8h;
import dev.krypton.l;
import dev.krypton.mixin._1;
import dev.krypton.mixin._9a;
import dev.krypton.mixin._9w;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
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
import net.minecraft.class_2338;
import net.minecraft.class_2804;
import net.minecraft.class_3558;

/*
 * Renamed from dev.krypton.6b
 */
public class _6b_0
extends _6x_0 {
    private static final long b = l.a(5960397624416607260L, 4672748244539976016L, MethodHandles.lookup().lookupClass()).a(60751398732764L);
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    public _6b_0(long l2) {
        long l3 = (l2 = b ^ l2) ^ 0x3DE2E621F0CCL;
        super((int)_6b_0.a("a", 11157, (long)(0x21FD87A236B24880L ^ l2)), -1, (_4r)((Object)_6b_0.c("\u00ea", 6480062890547490265L, (long)l2)), l3);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        j = new Object[50];
        k = new String[50];
        _6b_0.b();
        f = new HashMap(13);
        long l2 = b ^ 0x752A7C3645FL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l2 >>> 56);
        for (int j = 1; j < 8; ++j) {
            byArray2 = byArray2;
            byArray2[j] = (byte)(l2 << j * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n = 0;
        String string = "\u0087h\u008d\u00cf\u0013+\u00a81g\t\u0010\u001dF\u000e\u0091D\r\u00d0n\"`\u00a2\u00d2\u00af";
        int n2 = "\u0087h\u008d\u00cf\u0013+\u00a81g\t\u0010\u001dF\u000e\u0091D\r\u00d0n\"`\u00a2\u00d2\u00af".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l3 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        d = lArray;
        e = new Integer[3];
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (k[n3] != null) {
            return n3;
        }
        Object object = j[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 26;
            case 1 -> 21;
            case 2 -> 62;
            case 3 -> 31;
            case 4 -> 45;
            case 5 -> 46;
            case 6 -> 24;
            case 7 -> 55;
            case 8 -> 48;
            case 9 -> 35;
            case 10 -> 23;
            case 11 -> 59;
            case 12 -> 49;
            case 13 -> 51;
            case 14 -> 2;
            case 15 -> 47;
            case 16 -> 7;
            case 17 -> 18;
            case 18 -> 61;
            case 19 -> 4;
            case 20 -> 20;
            case 21 -> 10;
            case 22 -> 0;
            case 23 -> 54;
            case 24 -> 36;
            case 25 -> 14;
            case 26 -> 33;
            case 27 -> 58;
            case 28 -> 53;
            case 29 -> 19;
            case 30 -> 43;
            case 31 -> 52;
            case 32 -> 8;
            case 33 -> 16;
            case 34 -> 22;
            case 35 -> 11;
            case 36 -> 37;
            case 37 -> 9;
            case 38 -> 3;
            case 39 -> 30;
            case 40 -> 39;
            case 41 -> 15;
            case 42 -> 1;
            case 43 -> 41;
            case 44 -> 57;
            case 45 -> 63;
            case 46 -> 27;
            case 47 -> 25;
            case 48 -> 50;
            case 49 -> 12;
            case 50 -> 56;
            case 51 -> 44;
            case 52 -> 17;
            case 53 -> 60;
            case 54 -> 34;
            case 55 -> 40;
            case 56 -> 28;
            case 57 -> 6;
            case 58 -> 42;
            case 59 -> 5;
            case 60 -> 32;
            case 61 -> 29;
            case 62 -> 38;
            default -> 13;
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
        _6b_0.k[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = "v]jiXVkHh(]\n&J";
        objectArray[1] = "*\u0002uR\u001f\u0017*\u0002b\u000e\u0013\u00180Ib\u0010\u0013\r782IDF";
        objectArray[2] = "\u0000<&\u001e@2\u0000<1BL=\u001aw1\\L(\u001d\u0006c\t\u0019o";
        objectArray[3] = "8gJ VG8g]|ZH\",]bZ]%]\r;\r\u001c";
        objectArray[4] = "=kS\u0019\u0019p=kDE\u0015\u007f' D[\u0015j Q\u0015\u0004G!";
        objectArray[5] = Integer.TYPE;
        _6b_0.k[5] = "java/lang/Integer";
        objectArray[6] = "\u0013-qo\"9\u0013-f3.6\tff-.#\u000e\u00173rw";
        objectArray[7] = "\u0004W5_sM\u000fX$\u0010\u0018Y\rS3J4N\u0000";
        objectArray[8] = Void.TYPE;
        _6b_0.k[8] = "java/lang/Void";
        objectArray[9] = "v?Z\fUOv?MPY@ltMNYUk\u0005\u001a\u0012\u000f\u0010";
        objectArray[10] = "gy\u0002\u007f.Xgy\u0015#\"W}2\u0015=\"BzCE`s";
        objectArray[11] = "\u0017I} s.\u0017Ij|\u007f!\r\u0002jb\u007f4\ns>:(";
        objectArray[12] = "\u0003>'\u0018)k\u001e+%Y,7^#";
        objectArray[13] = "\u0006gv{:0\u0002zvj'0Au9} ,\u001bz4 86\u0001t+ \u00186\u0001tjA63\np,C5)KV6z& ";
        objectArray[14] = "#\t@8\u00134(\u0006Qwr:#\rU-";
        objectArray[15] = "\b\u001eX=75\u0016\u0016BrP4\u0007\rO(v2";
        objectArray[16] = Boolean.TYPE;
        _6b_0.k[16] = "java/lang/Boolean";
        objectArray[17] = "9]iU2\u0006$Hk\u00147Zk@";
        objectArray[18] = "\u0017_\u007fT\f\u0005\u0017_h\b\u0000\n\r\u0014h\u0016\u0000\u001f\ne9BQX";
        objectArray[19] = "9\u000e\u0003%\u0019 =\u0013\u00034\u0004 ~\u001cL#\u0003<$\u0013A~\u001b&>\u001d^~;&>\u001d\u001f\u001f\u0015#5\u0019Y\u001f\u0007,>2L#\u001f\u00041\n";
        objectArray[20] = "9\u0001i!B<=\u001ci0_<~\u0013&'X $\u001c+z@:>\u00124z`:>\u0012u\u001bN?5\u00163\u0019M%t3&'X\u0010>\u00015-\u007f0$";
        objectArray[21] = Long.TYPE;
        _6b_0.k[21] = "java/lang/Long";
        objectArray[22] = "\"--v\u001f\f?8/7\u001aPr#";
        objectArray[23] = "5g5t2\u0011@G>{#^!I5p'\u0004U";
        objectArray[24] = "gIUaS`cTUpN` [\u001agI|zT\u0017:RkdX\u0018`N'A_\u0011q^}GI\u001ef\\}aO";
        objectArray[25] = "6|t10I<mu3U|g\u007f\"pU\u0017i(un;\u001dx)w";
        objectArray[26] = "wVTU\nG8\u000fWEcQ+\u0013rS\u0007C+o\u001dH\u0002\u0006;\u001f\u0017C]LF";
        objectArray[27] = "n\u0002`\\PY;Mx]h\u000fj\rceY\u001bfEb\u0015S\u00109\u000f\u001f";
        objectArray[28] = "\u001eP5\u0001\u0017M]Gs\u000bjLFL)\u0006=\u0013\u001d\u0011wjSS_J0\u0005\u0010D\u0019@";
        objectArray[29] = ":mT6\u000fo{r\u00069oiim]2\u0003[=!\u0003jP\fimF*\u0012exoReo2xx^5\fsg*QU";
        objectArray[30] = "^_\u001d*B\u001f\u001f@O%\"\u0019\r_\u0014.N+Y\u0012Is\u0012|[Z\f#Y\u0007_\u001dE;\"";
        objectArray[31] = ">F\u0007yo'q\u001f\u0004i\u00061b\u0003;q`1L\u0012\u000e\u0016k\"t\u0000\u0002\u007fz `O\u007f";
        objectArray[32] = "+\b9\u000b)h%\faIF%\u0005tm\u000b~m9\u001a:DyzEIpG d;\u0018?M-\u0015";
        objectArray[33] = "y\u0005E[u\u0010$V\u001fW\u000b\u000fxAO\rg=(\u0004\u0014Z3j\u007f\rDQiPtR\u0014\u0013\u000b";
        objectArray[34] = "\u0010wd0g_\u0007u$UoV\u001e+}9]\u0002_v$o\n\u0002\u00133q(eA\u0004u{U0_YuhhhKS5\u001a";
        objectArray[35] = "q\n,2ve5\u001aq~\u0017a'\u0018r){Ss\\(p,\u0004q\u001dj$l\u007fuZ#<\u0017";
        objectArray[36] = "\nB\n\u0013\u000b\u0018W\u001b\u001e\u0015iF[\u0003\u0013\u001d\u0005t\fEHAW#DC\r\u001f\u0004GSAMz";
        objectArray[37] = "W0#)\u0017%\u0013\"ab.-\u0011 znu)\u0002*\u007fNT<\u0000,\u001c/\\'\r0b~\u0013-\u0000A";
        objectArray[38] = "@C\tuY6\u0001\\[z90\u0013C\u0000qU\u0002G\u000e],\u0006UEF\u0018|B.A\u0001Qd9";
        objectArray[39] = "q\u001aAInQ6IG[\t_/\u0015]H^\bqB\u0005$6Hu\u0002\u0006]6R0\n";
        objectArray[40] = "^\u001dJ$3o\u001f\u0002\u0018+Si\r\u001dC ?[YP\u001e}b\f[\u0018[-(w__\u00125S";
        objectArray[41] = "\u0000tc4\u0010cG'e&wm^{\u007f5 :\u0001&$YK>F\u007fyb\u0016gRy";
        objectArray[42] = "S\u0000\u000e&ER\u0006O\u0016'}\u0002S\u00047r\r\u001e:\u0015AtF\u0000\u0000\u001e\u001e$\u0004b";
        objectArray[43] = "LYX#*\u0001F^WL\u0019pv/w\r\u0015ul$vL2\u0002L\r@t8\u0005C";
        objectArray[44] = "qLLHM9r]BU,:\u001b\u000f\u001fSAd{HLUS";
        objectArray[45] = "M;\r2.)\u0010hW>P6L\u007f\u0007d<\u0004\u00189^8aS\u001az\u001fi+(\u001e=VqPhX{\rx+l\u001f2\u0015\u0003k*Yi\u001cxom\u0010qg8)+Kx\u001c<nbS\u0003";
        objectArray[46] = "\u0015:G\"\n0\u0004}\u001al:i\u001e&Ih}g\u001b-M.wk\u0005:W\tWqy-\u001c7G2\ty\u001a _\r";
        objectArray[47] = "r)~'(J69#kIN$; <%|p\u007fzeq+r>812Pvyq)I";
        objectArray[48] = "N#0n\u0010\u001d\n3m\"q\u0019\u00181nu\u001d+Lu4,M|N4vx\n\u0007Js?`q";
        Object[] objectArray2 = objectArray;
        objectArray[49] = "^:\rwh\u0004\n<\u001aoW\u0015Om\u0012c+\u0013I\u0000\u0007m1MC}\u0007cl\u00153";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00dc' || c == 'M' || c == '\u00ea' || c == '\u00e9') {
                field = _6b_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00dc' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'M' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ea' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _6b_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'F' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _6b_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
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
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6b" + " : " + string + " : " + methodType.toString(), exception);
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

    private static Method h(long l2, long l3) {
        int n = _6b_0.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = k[n];
                int n3 = string2.indexOf(8);
                clazz3 = _6b_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _6b_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _6b_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _6b_0.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _6b_0.f(1014190881316955L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _6b_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _6b_0.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _6b_0.f(1014190881316955L, 0L);
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
            int n = _6b_0.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _6b_0.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _6b_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _6b_0.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _6b_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _6b_0.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6b" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x3AF0;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])f.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/6b", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _6b_0.e[n2] = n3;
        }
        return e[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _6b_0.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field g(long l2, long l3) {
        int n = _6b_0.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _6b_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _6b_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _6b_0.c(clazz3, string2, clazz2)) != null) {
                    _6b_0.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _6b_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _6b_0.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _6b_0.f(1014190881316955L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @_3i_0
    public void cfr_renamed_0(_6c_0 var1_1) {
        block32: {
            block31: {
                block30: {
                    v0 = var2_2 = _6b_0.b ^ 87947940994351L;
                    var4_3 = v0 ^ 76591783363061L;
                    var6_4 = v0 ^ 112587186141436L;
                    var8_5 = _8h.cfr_renamed_4();
                    v1 = _6b_0.c("\u00dc", (Object)this, (long)-1064426885018922853L, (long)var2_2);
                    if (var8_5 != null) break block30;
                    try {
                        block35: {
                            if (_6b_0.c("\u00dc", (Object)v1, (long)-1064254457180692195L, (long)var2_2) == null) ** GOTO lbl27
                            break block35;
                            catch (Exception v2) {
                                throw _6b_0.a(v2);
                            }
                        }
                        v1 = _6b_0.c("\u00dc", (Object)this, (long)-1064426885018922853L, (long)var2_2);
                    }
                    catch (Exception v3) {
                        throw _6b_0.a(v3);
                    }
                }
                if (var8_5 != null) ** GOTO lbl34
                try {
                    block36: {
                        if (_6b_0.c("\u00dc", (Object)v1, (long)-1064896466229806981L, (long)var2_2) != null) break block31;
                        break block36;
                        catch (Exception v4) {
                            throw _6b_0.a(v4);
                        }
                    }
                    return;
                }
                catch (Exception v5) {
                    throw _6b_0.a(v5);
                }
            }
            try {
                v1 = _6b_0.c("\u00dc", (Object)this, (long)-1064426885018922853L, (long)var2_2);
lbl34:
                // 2 sources

                var9_6 = (class_3558)_6b_0.c("F", (Object)_6b_0.c("F", (Object)_6b_0.c("\u00dc", (Object)v1, (long)-1064254457180692195L, (long)var2_2), (long)-1065022982788104361L, (long)var2_2), (Object)_6b_0.c("\u00ea", (long)-1065546912775680139L, (long)var2_2), (long)-1064590195023872001L, (long)var2_2);
                var10_8 = ((_1)var9_6).getLightStorage();
                var11_9 = ((_9w)var10_8).getStorage();
                var12_10 = ((_9a)var11_9).getArrays();
                var13_11 = _6b_0.c("F", (Object)_6b_0.c("F", (Object)var12_10, (long)-1064323532580443977L, (long)var2_2), (long)-1063639860071211315L, (long)var2_2);
                block20: while (true) {
                    v6 /* !! */  = _6b_0.c("F", (Object)var13_11, (long)-1064044226993141158L, (long)var2_2);
                    block21: while (v6 /* !! */  != false) {
                        block33: {
                            var14_12 = (Long2ObjectMap.Entry)_6b_0.c("F", (Object)var13_11, (long)-1065193471738083492L, (long)var2_2);
                            var15_13 = _6b_0.c("F", (Object)var14_12, (long)-1065464632879912369L, (long)var2_2);
                            var17_14 = (class_2804)_6b_0.c("F", (Object)var14_12, (long)-1065121097829954313L, (long)var2_2);
                            if (var8_5 != null) break block32;
                            try {
                                block37: {
                                    v7 = var17_14;
                                    if (var8_5 != null) break block33;
                                    break block37;
                                    catch (Exception v8) {
                                        throw _6b_0.a(v8);
                                    }
                                }
                                if (v7 == null) continue block20;
                            }
                            catch (Exception v9) {
                                throw _6b_0.a(v9);
                            }
                            v7 = var17_14;
                        }
                        try {
                            if (_6b_0.c("F", (Object)v7, (long)-1064795128672589145L, (long)var2_2) != false) {
                                continue block20;
                            }
                        }
                        catch (Exception v10) {
                            throw _6b_0.a(v10);
                        }
                        var18_15 = _6b_0.c("\u00c3", (long)var15_13, (long)-1065615861983146585L, (long)var2_2);
                        var19_16 = _6b_0.c("F", (Object)var18_15, (long)-1064842902187053612L, (long)var2_2);
                        var20_17 = _6b_0.c("F", (Object)var18_15, (long)-1065430091398098756L, (long)var2_2);
                        var21_18 = _6b_0.c("F", (Object)var18_15, (long)-1064164936085233737L, (long)var2_2);
                        var22_19 = 0;
                        block22: while (true) {
                            v11 = var22_19;
                            block23: while (v11 < _6b_0.a("a", (int)10927, (long)(4598422324016767342L ^ var2_2))) {
                                v6 /* !! */  = (CallSite)false;
                                if (var8_5 != null) continue block21;
                                var23_20 = v6 /* !! */ ;
                                block24: while (true) {
                                    v12 /* !! */  = var23_20;
                                    block25: while (v12 /* !! */  < _6b_0.a("a", (int)14993, (long)(9053861316393693521L ^ var2_2))) {
                                        v11 = 0;
                                        if (var8_5 != null) continue block23;
                                        for (var24_21 = v2469258; var24_21 < _6b_0.a("a", (int)14993, (long)(9053861316393693521L ^ var2_2)); ++var24_21) {
                                            block34: {
                                                v12 /* !! */  = var25_22 = _6b_0.c("F", (Object)var17_14, (int)var22_19, (int)var23_20, (int)var24_21, (long)-1064506374349306657L, (long)var2_2);
                                                if (var8_5 != null) continue block25;
                                                try {
                                                    if (var8_5 != null) break block34;
                                                    if (v12 /* !! */  == false) {
                                                        continue;
                                                    }
                                                }
                                                catch (Exception v13) {
                                                    throw _6b_0.a(v13);
                                                }
                                                v14 = var25_22;
                                            }
                                            var26_23 = (float)v14 / 15.0f;
                                            var27_24 = new _8B(var6_4, var26_23, var26_23, 0.2f, 0.3f);
                                            var28_25 = new class_2338((int)(var19_16 + var22_19), (int)(var20_17 + var23_20), (int)(var21_18 + var24_21));
                                            try {
                                                if (_6b_0.c("F", (Object)var28_25, (long)-1063560202815331824L, (long)var2_2) >= 0) {
                                                    continue;
                                                }
                                            }
                                            catch (Exception v15) {
                                                throw _6b_0.a(v15);
                                            }
                                            v16 = new Object[11];
                                            v16[10] = var4_3;
                                            v16[9] = 0;
                                            v16[8] = _6b_0.c("\u00ea", (long)-1065344665540952995L, (long)var2_2);
                                            v16[7] = var27_24;
                                            v16[6] = var27_24;
                                            v16[5] = (double)(_6b_0.c("F", (Object)var28_25, (long)-1064372870299593215L, (long)var2_2) + true);
                                            v16[4] = (double)(_6b_0.c("F", (Object)var28_25, (long)-1063560202815331824L, (long)var2_2) + true);
                                            v16[3] = (double)(_6b_0.c("F", (Object)var28_25, (long)-1064675151676779129L, (long)var2_2) + true);
                                            v16[2] = (double)_6b_0.c("F", (Object)var28_25, (long)-1064372870299593215L, (long)var2_2);
                                            v16[1] = (double)_6b_0.c("F", (Object)var28_25, (long)-1063560202815331824L, (long)var2_2);
                                            v16[0] = (double)_6b_0.c("F", (Object)var28_25, (long)-1064675151676779129L, (long)var2_2);
                                            _6b_0.c("F", (Object)var1_1.cfr_renamed_7, (Object)v16, (long)-1064701299371080442L, (long)var2_2);
                                            if (var8_5 == null) continue;
                                        }
                                        ++var23_20;
                                        if (var8_5 == null) continue block24;
                                    }
                                    break;
                                }
                                ++var22_19;
                                if (var8_5 == null) continue block22;
                            }
                            break;
                        }
                        if (var8_5 != null) break block20;
                        continue block20;
                    }
                    break block32;
                    break;
                }
                {
                    break block32;
                    break;
                }
            }
            catch (Exception var9_7) {
                _6b_0.c("F", (Object)var9_7, (long)-1065100414607945009L, (long)var2_2);
            }
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_6b_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_6b_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

