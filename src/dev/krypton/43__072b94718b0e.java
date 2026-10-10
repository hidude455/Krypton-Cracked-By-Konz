/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package dev.krypton;

import com.google.gson.JsonObject;
import dev.krypton._4l;
import dev.krypton._5k_0;
import dev.krypton._6Z;
import dev.krypton.l;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _43
extends _4l {
    private final RandomAccessFile cfr_renamed_6;
    private final Consumer cfr_renamed_1;
    private static final long b = dev.krypton.l.a(-2722709939584558185L, 3356659300829840305L, MethodHandles.lookup().lookupClass()).a(27841006816885L);
    private static final String[] f;
    private static final String[] g;
    private static final Map h;
    private static final long l;
    private static final Object[] o;
    private static final String[] p;

    @Override
    protected void cfr_renamed_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        ByteBuffer byteBuffer = (ByteBuffer)objectArray[1];
        try {
            _43.e("\u00c3", (Object)_43.e("O", (Object)this, -601315851205277532L, (long)l2), (Object)_43.e("\u00c3", (Object)byteBuffer, -601552478174160745L, (long)l2), -602123527322984885L, (long)l2);
        }
        catch (IOException iOException) {
            _43.e("\u00c3", (Object)iOException, -602511170813154700L, (long)l2);
        }
    }

    _43(String string, Consumer consumer, long l2) throws IOException {
        long l3 = (l2 = b ^ l2) ^ 0x845D20DC0C3L;
        this.cfr_renamed_6 = new RandomAccessFile(string, (String)((Object)_43.b("f", 22087, (long)(0x51EBAA68F6ECB474L ^ l2))));
        this.cfr_renamed_1 = consumer;
        Thread thread = new Thread(() -> this.cfr_renamed_7(l3));
        _43.e("\u00c3", (Object)thread, (Object)_43.b("f", 25304, (long)(0x1F601411169900EAL ^ l2)), -5539589941080382581L, (long)l2);
        _43.e("\u00c3", (Object)thread, -5543370868159826077L, (long)l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        o = new Object[52];
        p = new String[52];
        _43.b();
        h = new HashMap(13);
        long l2 = b ^ 0x10F7FAF19A5EL;
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
        String string = "\u000f\u00d1\u00b6\u00b7O\u0003\u0019\u00c0\u00a9?5'Vn\u00d8\u00e68\u00c6UC\u00e8R\u00c3\u00ff7\u00c9\u0007\u00dd\u00c4<\u008e\u00c7\u00e4rI\u0088\u009aA\u0007\u00fc\u00c3\u009a8\u00a6\u00f1\u000f\u00a4*NkrKL\u00a3\u00c2\u00e2'\u00b3\u0006\u00e0Q\u00d3\u0017T\u00ca\u00ca\u0095\u00e3`\u00be\r\u00a5\u001c";
        int n2 = "\u000f\u00d1\u00b6\u00b7O\u0003\u0019\u00c0\u00a9?5'Vn\u00d8\u00e68\u00c6UC\u00e8R\u00c3\u00ff7\u00c9\u0007\u00dd\u00c4<\u008e\u00c7\u00e4rI\u0088\u009aA\u0007\u00fc\u00c3\u009a8\u00a6\u00f1\u000f\u00a4*NkrKL\u00a3\u00c2\u00e2'\u00b3\u0006\u00e0Q\u00d3\u0017T\u00ca\u00ca\u0095\u00e3`\u00be\r\u00a5\u001c".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = _43.b(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        f = stringArray;
        g = new String[2];
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l2 >>> 56);
        int n6 = 1;
        while (true) {
            if (n6 >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l3 = 1203289825671687272L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
                l = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                return;
            }
            byArray5 = byArray5;
            byArray5[n6] = (byte)(l2 << n6 * 8 >>> 56);
            ++n6;
        }
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (p[n3] != null) {
            return n3;
        }
        Object object = o[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 28;
            case 1 -> 43;
            case 2 -> 57;
            case 3 -> 27;
            case 4 -> 34;
            case 5 -> 10;
            case 6 -> 31;
            case 7 -> 25;
            case 8 -> 53;
            case 9 -> 20;
            case 10 -> 12;
            case 11 -> 13;
            case 12 -> 30;
            case 13 -> 4;
            case 14 -> 58;
            case 15 -> 35;
            case 16 -> 1;
            case 17 -> 14;
            case 18 -> 63;
            case 19 -> 51;
            case 20 -> 41;
            case 21 -> 15;
            case 22 -> 22;
            case 23 -> 40;
            case 24 -> 49;
            case 25 -> 46;
            case 26 -> 16;
            case 27 -> 50;
            case 28 -> 2;
            case 29 -> 19;
            case 30 -> 0;
            case 31 -> 59;
            case 32 -> 62;
            case 33 -> 52;
            case 34 -> 56;
            case 35 -> 33;
            case 36 -> 9;
            case 37 -> 36;
            case 38 -> 61;
            case 39 -> 37;
            case 40 -> 6;
            case 41 -> 26;
            case 42 -> 11;
            case 43 -> 54;
            case 44 -> 39;
            case 45 -> 8;
            case 46 -> 38;
            case 47 -> 7;
            case 48 -> 21;
            case 49 -> 23;
            case 50 -> 17;
            case 51 -> 45;
            case 52 -> 18;
            case 53 -> 5;
            case 54 -> 60;
            case 55 -> 29;
            case 56 -> 3;
            case 57 -> 44;
            case 58 -> 47;
            case 59 -> 55;
            case 60 -> 32;
            case 61 -> 24;
            case 62 -> 48;
            default -> 42;
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
        _43.p[n3] = new String(cArray);
        return n3;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/43" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _43.b(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/43" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _43.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void b() {
        Object[] objectArray = o;
        o[0] = "Z'7<pKQ(&s\nOB# 9";
        objectArray[1] = Void.TYPE;
        _43.p[1] = "java/lang/Void";
        objectArray[2] = "{dj\u0019U\u0014xj2:\u0002\u000etGi\u001e\u001d\u001fc";
        objectArray[3] = Boolean.TYPE;
        _43.p[3] = "java/lang/Boolean";
        objectArray[4] = Long.TYPE;
        _43.p[4] = "java/lang/Long";
        objectArray[5] = "\u000b\u0002KW8\u0002\u000eMoWx\u000f\u000e\u000e|Uu\u000e\u0012\u0010{_z\u000e";
        objectArray[6] = "&#DZ'|-,U\u0015@~8'@I|`8'V~qs)2FRf~";
        objectArray[7] = Integer.TYPE;
        _43.p[7] = "java/lang/Integer";
        objectArray[8] = "MC\u0005e\u0004,NM]gB#IL\u0016hYlaK\u001fai*FL\u001daF";
        objectArray[9] = "\u0000\u001cxR()\u001d\tz\u0013-uPJ";
        objectArray[10] = "\u0017~\t\u0002Ib\u001cq\u0018M4z\u000fv\u0011\u0004";
        objectArray[11] = "bZ";
        objectArray[12] = "Y\u0004\u0003@ad\\K<n\nuP\u0000\u0005U&b]";
        objectArray[13] = "(\u0015";
        objectArray[14] = "a\u001fB$n9\u007f\u0017Xk&9e\u001d@,/\"%=[+39f\u001bF";
        objectArray[15] = "\b\u000eDh/\t\u000b\u0000\u001cJi\u0006\u0010-Gog\u0002\u0010";
        objectArray[16] = "\u000emk\\NP\rc3^\b_\u0016\u007fxIN}\fmoN\u0005J";
        objectArray[17] = "qg>7\u0015-lr<v\u0010q i";
        objectArray[18] = "\u0011YV\u0018Z:\u001aVGW;4\u0011]C\r";
        objectArray[19] = "Gl5\u000e6[2L>\u0001'\u0014SB5\n#N'";
        objectArray[20] = "\b\u0000ZnR-\u0004\b[%\u001b%\u0018\u0000Yn\u007f1\u0004\u0001r,P/\u000e\u0001C";
        objectArray[21] = "\u0007\njQlb\u000b\u0002k\u001a%j\u0017\niQA~\u000b\u000bH\u001dah\u0007\u0011";
        objectArray[22] = "44%\u0018a)?;4W\u0006+*04\u001c=";
        objectArray[23] = "1XRnP\u0005=PS%\u0019\r!XQn}\u0019=Yo!E\u00197E";
        objectArray[24] = "T\u0012^\u001ali\u0002\u001a\tdiq5\rR\u0002Q~\u000f\t3]gh\u0014\u0013MTw{\nu";
        objectArray[25] = "\t;[\u0018a\n_3\ffx\u0019O\u001a_\u0003nt\faP^|\u000f\u0002$U\u0007\u0003MZ#L\u0000}DJ0Rf";
        objectArray[26] = "(.Ng\u0007'o;H6?d\u0016dX0ChrhGdF";
        objectArray[27] = "Ea\u0010\bBm\u0013iGv[w\u0012k\u0005v\u001b}B}\f\u0010@(\u0015=}OIl\u0005`\u0003FY\u007f\u001b\u0006";
        objectArray[28] = "yR)7\u001b\r|\u001c}vz@ww0u\u001bZ\u007f,s2\u001c\u0004oW}w\u0019]\u0010";
        objectArray[29] = "z\u001c\u001fp\u0006\u001d2\u0000\u0013*z\u0014.\u00198/\u0006{~]\u001e7\u001a\u001a{Y\u001e\"zF{\u0002\u0007)\u001bC\u007f\u0002\u0012I";
        objectArray[30] = "\u0018P\u0010zI7CU\b{q8\u001fU\u0015}\u001cTKG\u0014(\r2\u0003[\u0018rq=\f[Jp@8B\u000f\u000b\u0011";
        objectArray[31] = "\t6WNrSGf\u0015B\u000eBOh\u0001YUF\\b\u0004ytS^dg\u001cgEOo\u0019\u0015wVQ\t";
        objectArray[32] = "_\u0014/\u007f|\u0019S\u000b{zA\u0014\u0005\u0006y{=}\u0005\u000f(`>\u0011V\u000e\u007fzAD\u0007\u0012ne?M\u0017\u0001p\u0003";
        objectArray[33] = "?\u001eTAdox\u000bR\u0010\\%\u0001\t\u0005O`-`\t]Hc\u001d8\fDW:c1\u001cWI\\";
        objectArray[34] = ".NbWv)i[d\u0006N`\u0010\u000e}CwbqY7V<";
        objectArray[35] = "k\u007f\"}\u001d\u001f=wu\u0003\u0004\u001d8b3\u0003F\b.b)}O\u0018=|O";
        objectArray[36] = "jU@fp\u0014\"IL<\f\u001b7HA4e\u000e>,\u001bgk\f3M\u001eck\u0019S\u0015_95\u000e5]C5or";
        objectArray[37] = ")_0.\u000e\u0013y\u000b<f7\u0006)I\tdu\u0012#S\u0007uU\u0004/I@rFS+U* \f\u000b:5";
        objectArray[38] = "jM@J\fQ\"QL\u0010pM>KG\u0015\u001c7jM@J\fQ\"QL\u0010p";
        objectArray[39] = "Ics\n/[\u0001\u007f\u007fPST\n`|BS\fNgx\u000e/L\u0011kv3";
        objectArray[40] = "0m%w\r\u0010o};'j\u000b3z*`\u0011\u001c\u0014u;w\u0011qc< d\n\u0010f8 qjLfc9z\u000bIbc,\u001a";
        objectArray[41] = "\u0002\u0018J\f'l\u0012OUJLq\u0004YA\u0018\u0017u\u0017B\\\u001aL6PE\u0002\n78\u0015@[u!c\u001d\u0012\u0003\u000fq7\u0011Z:";
        objectArray[42] = "MEY\u0004?\u0000\u0005YU^C\u0006\u001dGeP&\u000f\u0015Z^[,fNS^\f/\t\tZNMC";
        objectArray[43] = "\u001fBt\\bbH\ba\u0017[gITc\u0019;\u0003\u001f\\1\u001e*eD\tf^[";
        objectArray[44] = "s0\u0013q$Hc,\u00017T\u001c\u0019vA+*MxsE+?-s0\u0013q$Hc,\u00017T";
        objectArray[45] = "&Rk7j$q\u0018~|S.yEhcS|t]ih-udNw\u000e";
        objectArray[46] = "\u001cz6&R\u0017Tf:|.\u000bHf9~H\u0010ClP\"\u0016\u0016[c1'\u0012\u0016N\u0003";
        objectArray[47] = "\u000br~i\u0015\\\\8k\",BJcz=,\f\u000e\u007fkmPLQseP\u0015TOx`.\u001cD\\f\u0006";
        objectArray[48] = "\u001dVF\\\u001cCJ\u001cS\u0017%MKZu\u0005LD@KZe\u0018Z\u001fO\u000f\u0007ABG\u001b>";
        objectArray[49] = "\rs\u0007F\u0011%@nNRtlGlY\\/hTf\\|\u000e}V`?\u0019\u001dkGkA\u0010\rxY\r";
        objectArray[50] = "uJ?F2b,Rg\u0012\u0003z%[j/:y.\u000bzIre\"Q\u0006\u0012;g6Rg\u0017?g#2";
        Object[] objectArray2 = objectArray;
        objectArray[51] = "\u0006$s<\u0012_]!k=*P\u0001$x*N@'*x-QQ\u0010J{9HWT) <PVl";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'O' || c == '\u00f6' || c == 'v' || c == '\u00fb') {
                field = _43.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'O' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f6' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'v' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _43.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'a' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static String b(byte[] byArray) {
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

    private static String b(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x512A;
        if (g[n2] == null) {
            Object[] objectArray;
            try {
                Long l3 = Thread.currentThread().threadId();
                objectArray = (Object[])h.get(l3);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l3, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/43", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l2 >>> 56);
            for (int j = 1; j < 8; ++j) {
                byArray[j] = (byte)(l2 << j * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = f[n2].getBytes("ISO-8859-1");
            _43.g[n2] = _43.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
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
        int n = _43.e(l2, l3);
        Object object = o[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = p[n];
                int n3 = string2.indexOf(8);
                clazz3 = _43.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _43.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _43.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _43.o[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _43.f(1272679517344778L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _43.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _43.o[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _43.f(1272679517344778L, 0L);
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
            int n = _43.e(l2, l3);
            object = o[n];
            try {
                if (!(object instanceof String)) break block2;
                _43.o[n] = clazz = Class.forName(p[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _43.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _43.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _43.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _43.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    private static Field g(long l2, long l3) {
        int n = _43.e(l2, l3);
        Object object = o[n];
        if (object instanceof String) {
            String string = p[n];
            int n2 = string.indexOf(8);
            Class clazz = _43.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _43.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _43.c(clazz3, string2, clazz2)) != null) {
                    _43.o[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _43.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _43.o[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _43.f(1272679517344778L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void cfr_renamed_4(Object[] var1_1) throws IOException {
        var3_2 = (Integer)var1_1[0];
        var4_3 = (Integer)var1_1[1];
        var2_4 = (ByteBuffer)var1_1[2];
        var5_5 = (Integer)var1_1[3];
        var6_6 = ((long)var3_2 << 32 | (long)var4_3 << 48 >>> 32 | (long)var5_5 << 48 >>> 48) ^ _43.b;
        var8_7 = _4l.cfr_renamed_8();
        _43.e("\u00c3", (Object)var2_4, (long)4631306516449824303L, (long)var6_6);
        try {
            try {
                while (_43.e("\u00c3", (Object)_43.e("O", (Object)this, (long)4631012978052611911L, (long)var6_6), (long)4631606442937303035L, (long)var6_6) < (long)_43.e("\u00c3", (Object)var2_4, (long)4631823033946790088L, (long)var6_6)) {
                    _43.e("a", (long)4632571254129677325L, (long)var6_6);
                    try {
                        _43.e("a", (long)_43.l, (long)4632796511069053684L, (long)var6_6);
                        v0 = var8_7;
                        if (var5_5 >= 0) {
                        }
                        ** GOTO lbl36
                    }
                    catch (InterruptedException var9_8) {
                        _43.e("\u00c3", (Object)var9_8, (long)4633069908736614690L, (long)var6_6);
                        if (var3_2 <= 0 || var8_7 != null) continue;
                        break;
                    }
                    if (v0 == null) return;
                }
            }
            catch (IOException v1) {
                throw _43.a(v1);
            }
        }
        catch (IOException v2) {
            throw _43.a(v2);
        }
        while (_43.e("\u00c3", (Object)var2_4, (long)4631546314575610088L, (long)var6_6) != false) {
            _43.e("\u00c3", (Object)_43.e("\u00c3", (Object)_43.e("O", (Object)this, (long)4631012978052611911L, (long)var6_6), (long)4629736802003199114L, (long)var6_6), (Object)var2_4, (long)4629895095294511709L, (long)var6_6);
            v0 = var8_7;
lbl36:
            // 2 sources

            if (v0 != null) continue;
        }
    }

    private void cfr_renamed_7(long l2) {
        long l3 = (l2 = b ^ l2) ^ 0x1DC42CA93396L;
        int n = (int)(l3 >>> 32);
        int n2 = (int)(l3 << 32 >>> 48);
        int n3 = (int)(l3 << 48 >>> 48);
        CallSite callSite = _43.e("a", 4, 5990926289081863193L, (long)l2);
        try {
            while (true) {
                Object[] objectArray = new Object[4];
                objectArray[3] = (int)((short)n3);
                objectArray[2] = callSite;
                objectArray[1] = (int)((short)n2);
                objectArray[0] = n;
                _43.e("\u00c3", (Object)this, (Object)objectArray, 5991334483332452581L, (long)l2);
                CallSite callSite2 = _43.e("a", (int)_43.e("a", (int)_43.e("\u00c3", (Object)callSite, 0, 5992695522181874444L, (long)l2), 5991818377172948361L, (long)l2), 5991531844787138412L, (long)l2);
                Object[] objectArray2 = new Object[4];
                objectArray2[3] = (int)((short)n3);
                objectArray2[2] = callSite;
                objectArray2[1] = (int)((short)n2);
                objectArray2[0] = n;
                _43.e("\u00c3", (Object)this, (Object)objectArray2, 5991334483332452581L, (long)l2);
                CallSite callSite3 = _43.e("a", (int)_43.e("\u00c3", (Object)callSite, 0, 5992695522181874444L, (long)l2), 5991818377172948361L, (long)l2);
                CallSite callSite4 = _43.e("a", (int)callSite3, 5990926289081863193L, (long)l2);
                Object[] objectArray3 = new Object[4];
                objectArray3[3] = (int)((short)n3);
                objectArray3[2] = callSite4;
                objectArray3[1] = (int)((short)n2);
                objectArray3[0] = n;
                _43.e("\u00c3", (Object)this, (Object)objectArray3, 5991334483332452581L, (long)l2);
                CallSite callSite5 = _43.e("\u00c3", (Object)_43.e("\u00c3", (Object)_43.e("a", 5990326393947602013L, (long)l2), (Object)_43.e("\u00c3", (Object)callSite4, 5991094703989562702L, (long)l2), 5992769101163829979L, (long)l2), 5992621459291062468L, (long)l2);
                _43.e("\u00c3", (Object)_43.e("O", (Object)this, 5993053417193468485L, (long)l2), (Object)new _6Z((_5k_0)((Object)callSite2), (JsonObject)_43.e("\u00c3", (Object)_43.e("a", (Object)callSite5, 5991843713434545297L, (long)l2), 5991048944178162701L, (long)l2)), 5991260729724064259L, (long)l2);
            }
        }
        catch (Exception exception) {
            return;
        }
    }

    @Override
    public void cfr_renamed_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        try {
            _43.e("\u00c3", (Object)_43.e("O", (Object)this, -9072031459683697382L, (long)l2), -9071805833481831694L, (long)l2);
        }
        catch (IOException iOException) {
            _43.e("\u00c3", (Object)iOException, -9070977178748756022L, (long)l2);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_43.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_43.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

