/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._32;
import dev.krypton._4r;
import dev.krypton._4w;
import dev.krypton._6e_0;
import dev.krypton._6x_0;
import dev.krypton._95;
import dev.krypton._9E;
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

/*
 * Renamed from dev.krypton.6r
 */
public class _6r_0
extends _6x_0 {
    private static _6r_0 cfr_renamed_2;
    public final _6e_0 cfr_renamed_6;
    public final _6e_0 cfr_renamed_8;
    public final _9E cfr_renamed_7;
    public final _6e_0 cfr_renamed_3;
    public final _6e_0 cfr_renamed_5;
    private static final long b;
    private static final String d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map j;
    private static final Object[] k;
    private static final String[] l;

    public _6r_0(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x2B9BC0C69A03L;
        long l5 = l3 ^ 0x73F0FC5BEC06L;
        int n = (int)(l5 >>> 48);
        int n2 = (int)(l5 << 16 >>> 48);
        int n3 = (int)(l5 << 32 >>> 32);
        long l6 = l3 ^ 0x49947B5E5EF4L;
        long l7 = l6 >>> 8;
        int n4 = (int)(l6 << 56 >>> 56);
        long l8 = l3 ^ 0x35D105CCAFCCL;
        long l9 = l3 ^ 0x2A1196E840BEL;
        long l10 = l3 ^ 0x7585F72A72FAL;
        super((int)_6r_0.a("u", 13368, (long)(0x37AA5BD9AADB5A3L ^ l2)), -1, (_4r)((Object)_6r_0.c("H", 495776485079766930L, (long)l2)), l8);
        this.cfr_renamed_6 = new _6e_0((int)_6r_0.a("u", 21321, (long)(0x2ADFE457712E52D3L ^ l2)), l10, "");
        this.cfr_renamed_8 = new _6e_0(1, l10, d);
        this.cfr_renamed_7 = new _9E((int)_6r_0.a("u", 1130, (long)(0x29947495FEB205F2L ^ l2)), l4, (Enum)((Object)_6r_0.c("H", 496077377496275744L, (long)l2)), _32.class);
        this.cfr_renamed_3 = new _6e_0((int)_6r_0.a("u", 18161, (long)(0x4CC90575B6D64768L ^ l2)), l10, "");
        int n5 = _32.cfr_renamed_2();
        this.cfr_renamed_5 = new _6e_0((int)_6r_0.a("u", 2517, (long)(0x15667041D24F084BL ^ l2)), l10, "");
        _6r_0.c("\u00c7", (_6r_0)this, 496117709391825818L, (long)l2);
        Object[] objectArray = new Object[3];
        objectArray[2] = () -> this.cfr_renamed_8((short)n, (char)n2, n3);
        objectArray[1] = (int)((byte)n4);
        objectArray[0] = l7;
        _6r_0.c("j", (Object)_6r_0.c("\u00c5", (Object)this, 495630159903151794L, (long)l2), (Object)objectArray, 495983727528749420L, (long)l2);
        int n6 = n5;
        try {
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = new _95[]{_6r_0.c("\u00c5", (Object)this, 495721863905129376L, (long)l2), _6r_0.c("\u00c5", (Object)this, 495446394558940414L, (long)l2), _6r_0.c("\u00c5", (Object)this, 495952148576401703L, (long)l2), _6r_0.c("\u00c5", (Object)this, 496313736419976702L, (long)l2), _6r_0.c("\u00c5", (Object)this, 495630159903151794L, (long)l2)};
            objectArray2[0] = l9;
            _6r_0.c("j", (Object)this, (Object)objectArray2, 495482406255203582L, (long)l2);
            if (n6 == 0) {
                _4w.cfr_renamed_8(new String[3]);
            }
        }
        catch (MatchException matchException) {
            throw _6r_0.a(matchException);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                block12: {
                    a.init(_6r_0.class, 56);
                    _6r_0.b = dev.krypton.l.a(4375090904733843587L, 2957620866138096516L, MethodHandles.lookup().lookupClass()).a(10902236143399L);
                    _6r_0.k = new Object[32];
                    _6r_0.l = new String[32];
                    _6r_0.b();
                    var11 = _6r_0.b ^ 47342378847567L;
                    var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var11 >>> 56);
                    for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                        v2 = v2;
                        v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                    }
                    break block12;
lbl17:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var15_3 = var13_1.doFinal("ppa\u0092&]\u0092\u00fb".getBytes("ISO-8859-1"));
                ** while (true)
                _6r_0.d = _6r_0.b(var15_3).intern();
                _6r_0.j = new HashMap<K, V>(13);
                var0_4 = Cipher.getInstance("DES/CBC/NoPadding");
                v3 = SecretKeyFactory.getInstance("DES");
                v4 = new byte[8];
                v5 = v4;
                v4[0] = (byte)(var11 >>> 56);
                for (var1_5 = 1; var1_5 < 8; ++var1_5) {
                    v5 = v5;
                    v5[var1_5] = (byte)(var11 << var1_5 * 8 >>> 56);
                }
                var0_4.init(2, (Key)v3.generateSecret(new DESKeySpec(v5)), new IvParameterSpec(new byte[8]));
                var6_6 = new long[5];
                var3_7 = 0;
                var4_8 = "\u00f83\u00d9@~@\u00e0\u00a5U\u0017.\u0082\u00f1\u001f\u00de\u00da\u00c6\u0001\u0090\u00f9\u0094\u0096\u0010\u00a5";
                var5_9 = "\u00f83\u00d9@~@\u00e0\u00a5U\u0017.\u0082\u00f1\u001f\u00de\u00da\u00c6\u0001\u0090\u00f9\u0094\u0096\u0010\u00a5".length();
                var2_10 = 0;
                while (true) {
                    var7_11 = var4_8.substring(var2_10, var2_10 += 8).getBytes("ISO-8859-1");
                    v6 = var6_6;
                    v7 = var3_7++;
                    v8 = ((long)var7_11[0] & 255L) << 56 | ((long)var7_11[1] & 255L) << 48 | ((long)var7_11[2] & 255L) << 40 | ((long)var7_11[3] & 255L) << 32 | ((long)var7_11[4] & 255L) << 24 | ((long)var7_11[5] & 255L) << 16 | ((long)var7_11[6] & 255L) << 8 | (long)var7_11[7] & 255L;
                    v9 = -1;
                    break block10;
                    break;
                }
lbl48:
                // 1 sources

                while (true) {
                    v6[v7] = v10;
                    if (var2_10 < var5_9) ** continue;
                    var4_8 = "\u00fb\u00cb\u00f4\u00b6q:\u0016\u00f2\\|v\u001a\u0099\u00dc\u00afZ";
                    var5_9 = "\u00fb\u00cb\u00f4\u00b6q:\u0016\u00f2\\|v\u001a\u0099\u00dc\u00afZ".length();
                    var2_10 = 0;
                    while (true) {
                        var7_11 = var4_8.substring(var2_10, var2_10 += 8).getBytes("ISO-8859-1");
                        v6 = var6_6;
                        v7 = var3_7++;
                        v8 = ((long)var7_11[0] & 255L) << 56 | ((long)var7_11[1] & 255L) << 48 | ((long)var7_11[2] & 255L) << 40 | ((long)var7_11[3] & 255L) << 32 | ((long)var7_11[4] & 255L) << 24 | ((long)var7_11[5] & 255L) << 16 | ((long)var7_11[6] & 255L) << 8 | (long)var7_11[7] & 255L;
                        v9 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl61:
                // 1 sources

                while (true) {
                    v6[v7] = v10;
                    if (var2_10 < var5_9) ** continue;
                    break block11;
                    break;
                }
            }
            var8_12 = v8;
            var10_13 = var0_4.doFinal(new byte[]{(byte)(var8_12 >>> 56), (byte)(var8_12 >>> 48), (byte)(var8_12 >>> 40), (byte)(var8_12 >>> 32), (byte)(var8_12 >>> 24), (byte)(var8_12 >>> 16), (byte)(var8_12 >>> 8), (byte)var8_12});
            v10 = ((long)var10_13[0] & 255L) << 56 | ((long)var10_13[1] & 255L) << 48 | ((long)var10_13[2] & 255L) << 40 | ((long)var10_13[3] & 255L) << 32 | ((long)var10_13[4] & 255L) << 24 | ((long)var10_13[5] & 255L) << 16 | ((long)var10_13[6] & 255L) << 8 | (long)var10_13[7] & 255L;
            switch (v9) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl74:
                // 1 sources

                ** continue;
            }
        }
        _6r_0.e = var6_6;
        _6r_0.f = new Integer[5];
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (l[n3] != null) {
            return n3;
        }
        Object object = k[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 39;
            case 1 -> 43;
            case 2 -> 41;
            case 3 -> 20;
            case 4 -> 57;
            case 5 -> 13;
            case 6 -> 40;
            case 7 -> 59;
            case 8 -> 7;
            case 9 -> 25;
            case 10 -> 50;
            case 11 -> 17;
            case 12 -> 19;
            case 13 -> 47;
            case 14 -> 1;
            case 15 -> 37;
            case 16 -> 60;
            case 17 -> 27;
            case 18 -> 51;
            case 19 -> 11;
            case 20 -> 44;
            case 21 -> 31;
            case 22 -> 9;
            case 23 -> 34;
            case 24 -> 52;
            case 25 -> 33;
            case 26 -> 48;
            case 27 -> 4;
            case 28 -> 2;
            case 29 -> 0;
            case 30 -> 10;
            case 31 -> 12;
            case 32 -> 42;
            case 33 -> 32;
            case 34 -> 15;
            case 35 -> 18;
            case 36 -> 29;
            case 37 -> 45;
            case 38 -> 62;
            case 39 -> 24;
            case 40 -> 26;
            case 41 -> 23;
            case 42 -> 3;
            case 43 -> 54;
            case 44 -> 46;
            case 45 -> 53;
            case 46 -> 56;
            case 47 -> 21;
            case 48 -> 63;
            case 49 -> 36;
            case 50 -> 28;
            case 51 -> 61;
            case 52 -> 6;
            case 53 -> 38;
            case 54 -> 55;
            case 55 -> 14;
            case 56 -> 49;
            case 57 -> 8;
            case 58 -> 22;
            case 59 -> 58;
            case 60 -> 30;
            case 61 -> 5;
            case 62 -> 35;
            default -> 16;
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
        _6r_0.l[n3] = new String(cArray);
        return n3;
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

    private static void b() {
        Object[] objectArray = k;
        k[0] = "z\u0010a\u0012+[g\u0005cS.\u0007(\u0010";
        objectArray[1] = "=\u0010\u0014V\u00175H0\u001fY\u0006z)>\u0014R\u0002 ]";
        objectArray[2] = "\u0002&[%o6\t)Jj\u0012.\u001a.C#";
        objectArray[3] = "kpOZ\u0012IveM\u001b\u0017\u00159g";
        objectArray[4] = ")\u000bQ\f\r}4\u001eSM\b!{\u0016";
        objectArray[5] = "\u00037\u0007c\u001emv\u0017\fl\u000f\"\u0017\u0019\u0007g\u000bxc";
        objectArray[6] = Void.TYPE;
        _6r_0.l[6] = "java/lang/Void";
        objectArray[7] = Boolean.TYPE;
        _6r_0.l[7] = "java/lang/Boolean";
        objectArray[8] = "\u000f4Vp\u001d8\u0012!T1\u0018dR\u0014";
        objectArray[9] = "@=5^\u001br5\u001d>Q\n=T\u00135Z\u000eg ";
        objectArray[10] = "^+\toL\u001bU$\u0018  \u0018[&\u001ao\f";
        objectArray[11] = "\t\\\n<w\\\u0014I\b}r\u0000^\u000b";
        objectArray[12] = "\u001eGY\u001dnN\u0003R[\\k\u0012C\u0017";
        objectArray[13] = "EEr\u000bh,0ey\u0004ycQkr\u000f}9%";
        objectArray[14] = "\u0014K</>\u001f\t^>n;CD\\";
        objectArray[15] = "!\u0014N|\u0017jT4Es\u0006%5:Nx\u0002\u007fA";
        objectArray[16] = "?\u0005\u000ekxq4\n\u001f$\u0019\u007f?\u0001\u001b~";
        objectArray[17] = "\u001d\u001eRH_n]\u001fQR4='\u0000\tB_{B\u0003[\u0016";
        objectArray[18] = "B^U}vU\u001bI@yM\u0006\u007fL\u0016(#Z\u0013\u0018^\u007f 7B\u0017M%!G\u0004MT'M";
        objectArray[19] = "^$w\u0007fn\u0007ip\r\u0000|\t1n\u0000Gl`h\"\u000efn\u0010.x\u0017d\u0002^$w\u0007fn\u0007ip\r\u0000";
        objectArray[20] = "\u0014\\\u00029&HMXA{FN$K\u0005j(\u001fH\u001fM=+r\u0014\\\u00029&HMXA{F";
        objectArray[21] = "[G|\nwo\u000b\u0006wJ\u0007H#tZl:\u0013[G|\nwo\u000b\u0006wJ";
        objectArray[22] = "m9\\Ct\u001b-8_Y\u001fLWzAG\u007f\u0019>:@De";
        objectArray[23] = "\u001d\u0001S~|j\u001eS\u0007\u0015<\u000f\u0010\u0006R{mcDN\u0005x\u00006\u0006^\u0003)g2\u0015BE\u0015";
        objectArray[24] = "\u001b.k\u0019Ro[/h\u00039=!00\u0013RzD3bG";
        objectArray[25] = "\u0018\n\u0019y\\\"OVDtf\u00025ukQ:I\u0018\n\u0019y\\\"OVDt";
        objectArray[26] = "Gy\u0000/jC\u0005w]?\u0004\u0012|\u007fZ5jD\u0010+\u0012bi)@~Z$j\u0018\u001bj\b2\u0004";
        objectArray[27] = "'?\r8#`g>\u000e\"H5\u001d{\u0011#v2\u007f\"\u00066r";
        objectArray[28] = "u\u00013[\u0014m5\u00000A\u007f9O\u001fhQ\u0014x*\u001c:\u0005";
        objectArray[29] = "\u000f\u000f\u000b5B{M\u0001V%,(4\tQ/B|X]\u0019xA\u0011\b\bQ>B S\u001c\u0003(,";
        objectArray[30] = "2\u0014yt\u0017L6\u0007e2+Jp\"}'MH\u000bU(-MG{\u0013r4O+";
        Object[] objectArray2 = objectArray;
        objectArray[31] = "'7~/\u0005zg6}5n*\u001d)%%\u0005ox*wq";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c5' || c == '\u00c3' || c == 'H' || c == '\u00c7') {
                field = _6r_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c5' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c3' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'H' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _6r_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'j' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00aa' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _6r_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6r" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l2, long l3) {
        int n = _6r_0.e(l2, l3);
        Object object = k[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = l[n];
                int n3 = string2.indexOf(8);
                clazz3 = _6r_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _6r_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _6r_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _6r_0.k[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _6r_0.f(1190454861425566L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _6r_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _6r_0.k[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _6r_0.f(1190454861425566L, 0L);
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
            int n = _6r_0.e(l2, l3);
            object = k[n];
            try {
                if (!(object instanceof String)) break block2;
                _6r_0.k[n] = clazz = Class.forName(l[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _6r_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _6r_0.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _6r_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _6r_0.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x77D;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])j.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/6r", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _6r_0.f[n2] = n3;
        }
        return f[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6r" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _6r_0.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field g(long l2, long l3) {
        int n = _6r_0.e(l2, l3);
        Object object = k[n];
        if (object instanceof String) {
            String string = l[n];
            int n2 = string.indexOf(8);
            Class clazz = _6r_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _6r_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _6r_0.c(clazz3, string2, clazz2)) != null) {
                    _6r_0.k[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _6r_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _6r_0.k[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _6r_0.f(1190454861425566L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public native void cfr_renamed_2();

    public static _6r_0 dev_krypton_6r_0_3(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = b ^ l2;
        return _6r_0.c("H", 3943156377753795520L, (long)l2);
    }

    private Boolean cfr_renamed_8(short s, char c, int n) {
        long l2 = ((long)s << 48 | (long)c << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        long l3 = l2 ^ 0x50897962C6A7L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l3;
        objectArray[0] = _6r_0.c("H", -7977528475614294904L, (long)l2);
        return _6r_0.c("\u00aa", (boolean)_6r_0.c("j", (Object)_6r_0.c("\u00c5", (Object)this, -7977649033713062257L, (long)l2), (Object)objectArray, -7977029436732692445L, (long)l2), -7977089424687867305L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_6r_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_6r_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

