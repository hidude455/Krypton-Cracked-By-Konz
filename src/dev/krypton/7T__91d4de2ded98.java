/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1937
 *  net.minecraft.class_2680
 *  net.minecraft.class_2791
 */
package dev.krypton;

import dev.krypton._8h;
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
import net.minecraft.class_1937;
import net.minecraft.class_2680;
import net.minecraft.class_2791;

public class _7T {
    private final class_1937 cfr_renamed_1;
    private class_2791 cfr_renamed_0;
    private static final long a = l.a(-7413908484898936606L, 1987778376420137673L, MethodHandles.lookup().lookupClass()).a(203424092925964L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static final Object[] e;
    private static final String[] f;

    public _7T(int n, char c, int n2) {
        long l2 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ a;
        this.cfr_renamed_1 = _7T.b("\u00c4", (Object)_7T.b("q", 2120315158356161212L, (long)l2), 2120635928690197095L, (long)l2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_2680 cfr_renamed_6(Object[] var1_1) {
        block33: {
            block34: {
                block31: {
                    block32: {
                        block30: {
                            block29: {
                                block27: {
                                    block28: {
                                        var2_2 = (Integer)var1_1[0];
                                        var5_3 = (Integer)var1_1[1];
                                        var6_4 = (Integer)var1_1[2];
                                        var3_5 = (Long)var1_1[3];
                                        var3_5 = _7T.a ^ var3_5;
                                        var7_6 = _8h.cfr_renamed_4();
                                        try {
                                            try {
                                                v0 /* !! */  = _7T.b("\u00ef", (Object)_7T.b("\u00c4", (Object)this, (long)4022475566200425169L, (long)var3_5), (int)var5_3, (long)4022177578557733594L, (long)var3_5);
                                                if (var7_6 != null) break block27;
                                                if (v0 /* !! */  == false) break block28;
                                            }
                                            catch (MatchException v1) {
                                                throw _7T.a(v1);
                                            }
                                            return _7T.b("\u00ef", (Object)_7T.b("q", (long)4021760753825737148L, (long)var3_5), (long)4021919654038349341L, (long)var3_5);
                                        }
                                        catch (MatchException v2) {
                                            throw _7T.a(v2);
                                        }
                                    }
                                    v0 /* !! */  = (CallSite)(var2_2 >> 4);
                                }
                                var8_7 = v0 /* !! */ ;
                                var9_8 = var6_4 >> 4;
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    v3 = _7T.b("\u00c4", (Object)this, (long)4022534363242904022L, (long)var3_5);
                                                    if (var7_6 != null) break block29;
                                                    if (v3 != null) {
                                                    }
                                                    ** GOTO lbl60
                                                }
                                                catch (MatchException v4) {
                                                    throw _7T.a(v4);
                                                }
                                                v3 = _7T.b("\u00c4", (Object)this, (long)4022534363242904022L, (long)var3_5);
                                                if (var7_6 != null) break block29;
                                            }
                                            catch (MatchException v5) {
                                                throw _7T.a(v5);
                                            }
                                            if (var3_5 < 0L) break block29;
                                            if (_7T.b("\u00c4", (Object)_7T.b("\u00ef", (Object)v3, (long)4022065189571085436L, (long)var3_5), (long)4021954971371294951L, (long)var3_5) == var8_7) {
                                            }
                                            ** GOTO lbl60
                                        }
                                        catch (MatchException v6) {
                                            throw _7T.a(v6);
                                        }
                                        v3 = _7T.b("\u00c4", (Object)this, (long)4022534363242904022L, (long)var3_5);
                                        if (var7_6 != null) break block29;
                                    }
                                    catch (MatchException v7) {
                                        throw _7T.a(v7);
                                    }
                                    if (_7T.b("\u00c4", (Object)_7T.b("\u00ef", (Object)v3, (long)4022065189571085436L, (long)var3_5), (long)4022310770652453540L, (long)var3_5) == var9_8) {
                                    }
                                    ** GOTO lbl60
                                }
                                catch (MatchException v8) {
                                    throw _7T.a(v8);
                                }
                                var10_9 = _7T.b("\u00c4", (Object)this, (long)4022534363242904022L, (long)var3_5);
                                try {
                                    if (var3_5 < 0L || var7_6 == null) break block30;
lbl60:
                                    // 4 sources

                                    v3 = _7T.b("\u00ef", (Object)_7T.b("\u00c4", (Object)this, (long)4022475566200425169L, (long)var3_5), (int)var8_7, (int)var9_8, (Object)_7T.b("q", (long)4022406951441294153L, (long)var3_5), (boolean)false, (long)4022623577793510728L, (long)var3_5);
                                }
                                catch (MatchException v9) {
                                    throw _7T.a(v9);
                                }
                            }
                            var10_9 = v3;
                        }
                        try {
                            try {
                                v10 = var10_9;
                                if (var7_6 != null) break block31;
                                if (v10 != null) break block32;
                            }
                            catch (MatchException v11) {
                                throw _7T.a(v11);
                            }
                            return _7T.b("\u00ef", (Object)_7T.b("q", (long)4021760753825737148L, (long)var3_5), (long)4021919654038349341L, (long)var3_5);
                        }
                        catch (MatchException v12) {
                            throw _7T.a(v12);
                        }
                    }
                    v10 = var10_9;
                }
                var11_10 = _7T.b("\u00ef", (Object)v10, (long)4022629684461652835L, (long)var3_5)[_7T.b("\u00ef", (Object)var10_9, (int)var5_3, (long)4022262329041036418L, (long)var3_5)];
                try {
                    try {
                        v13 = var11_10;
                        if (var7_6 != null) break block33;
                        if (v13 != null) break block34;
                    }
                    catch (MatchException v14) {
                        throw _7T.a(v14);
                    }
                    return _7T.b("\u00ef", (Object)_7T.b("q", (long)4021760753825737148L, (long)var3_5), (long)4021919654038349341L, (long)var3_5);
                }
                catch (MatchException v15) {
                    throw _7T.a(v15);
                }
            }
            _7T.b("v", (Object)this, (class_2791)var10_9, (long)4022534363242904022L, (long)var3_5);
            v13 = var11_10;
        }
        return _7T.b("\u00ef", (Object)v13, (int)(var2_2 & _7T.a("s", (int)14798, (long)(919288140824680782L ^ var3_5))), (int)(var5_3 & _7T.a("s", (int)852, (long)(777188712528159701L ^ var3_5))), (int)(var6_4 & _7T.a("s", (int)852, (long)(777188712528159701L ^ var3_5))), (long)4021839591358154372L, (long)var3_5);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new Object[31];
        f = new String[31];
        _7T.a();
        d = new HashMap(13);
        long l2 = a ^ 0xAE6A10C9565L;
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
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u0007\u008d\u0099\u0093\u00d7\n|f\u001e\u00c2\u00c9D\u00d45Z\u00a7";
        int n2 = "\u0007\u008d\u0099\u0093\u00d7\n|f\u001e\u00c2\u00c9D\u00d45Z\u00a7".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l3 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Integer[2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x1755;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])d.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/7T", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _7T.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _7T.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/7T" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(long l2, long l3) {
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
            case 0 -> 15;
            case 1 -> 12;
            case 2 -> 34;
            case 3 -> 47;
            case 4 -> 62;
            case 5 -> 13;
            case 6 -> 45;
            case 7 -> 52;
            case 8 -> 28;
            case 9 -> 8;
            case 10 -> 6;
            case 11 -> 59;
            case 12 -> 38;
            case 13 -> 35;
            case 14 -> 20;
            case 15 -> 57;
            case 16 -> 24;
            case 17 -> 60;
            case 18 -> 0;
            case 19 -> 63;
            case 20 -> 33;
            case 21 -> 14;
            case 22 -> 53;
            case 23 -> 29;
            case 24 -> 41;
            case 25 -> 23;
            case 26 -> 30;
            case 27 -> 37;
            case 28 -> 50;
            case 29 -> 31;
            case 30 -> 4;
            case 31 -> 7;
            case 32 -> 22;
            case 33 -> 9;
            case 34 -> 51;
            case 35 -> 54;
            case 36 -> 61;
            case 37 -> 27;
            case 38 -> 18;
            case 39 -> 5;
            case 40 -> 32;
            case 41 -> 26;
            case 42 -> 16;
            case 43 -> 43;
            case 44 -> 44;
            case 45 -> 21;
            case 46 -> 39;
            case 47 -> 48;
            case 48 -> 42;
            case 49 -> 10;
            case 50 -> 3;
            case 51 -> 11;
            case 52 -> 40;
            case 53 -> 17;
            case 54 -> 2;
            case 55 -> 25;
            case 56 -> 19;
            case 57 -> 55;
            case 58 -> 49;
            case 59 -> 36;
            case 60 -> 1;
            case 61 -> 58;
            case 62 -> 56;
            default -> 46;
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
        _7T.f[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "l8\u0005aQyl8\u0012=]vvs\u0012#]cq\u0002C}\b&";
        objectArray[1] = "{fS!_h{fD}Sga-DcSrf\\\u0015=\u00069";
        objectArray[2] = "?_S\u0004l\t?_DX`\u0006%\u0014DF`\u0013\"e\u0015\u00123V";
        objectArray[3] = Integer.TYPE;
        _7T.f[3] = "java/lang/Integer";
        objectArray[4] = "R`q\"l)R`f~`&H+f``3OZ7:9p";
        objectArray[5] = "+;s\u0015Ny+;dIBv1pdWBc6\u00016\u0002\u0011#";
        objectArray[6] = "k<v\r Ik<aQ,FqwaO,Sv\u00060\u0014t\u0011";
        objectArray[7] = "\rhj*\u0019H\rh}v\u0015G\u0017#}h\u0015R\u0010R/=G\u0016";
        objectArray[8] = Boolean.TYPE;
        _7T.f[8] = "java/lang/Boolean";
        objectArray[9] = "1Mjn\u0001L1M}2\rC+\u0006},\rV,w,x\\\u0013";
        objectArray[10] = "p\tb\u001a\u0010hm\u001c`[\u00154#8";
        objectArray[11] = " &\u0003~IU\u0016\u0003\u0003~^\t\u001a\f\u00195^\u0017\u001a\u0019\u001eD\u000fCI\\V";
        objectArray[12] = "V\u001bY\u000f#]V\u001bNS/RLPNM/GK!\u001e\u0010~";
        objectArray[13] = "bNet\u0011EbNr(\u001dJx\u0005r6\u001d_\u007ft'iD";
        objectArray[14] = "\u0005OP\u00132<\u0018ZRR7`S";
        objectArray[15] = "b\nyI\u000b5i\u0005h\u0006j;b\u000el\\";
        objectArray[16] = "BpA\u0001T*@1\u0010sF%M+\u0015$\u0011|\u001asBs\u0011z[0HILuQ\"";
        objectArray[17] = "\u000bWp`4\"SCu)V!_Vvv:\u0013\u000b\u0010,,jD\b\u0017{|1<WL/!V~\u000fG{v.!T\u0013&\u0011ly_Gqi3\"\u000b\u001a\u0016+-#O\u0017wo8;L*";
        objectArray[18] = "\u00193iCN/D<cQ\u007fpMqr[\u0013B\u00110,\u0000\u007f/[jo\u0001\u001ekNrl<";
        objectArray[19] = "\u001cMaW\u001el\u0011\u00120\u0017.mA\u001bkKy2\u0019F6'\u0014>M\u001bh_Ke\u0019F";
        objectArray[20] = "\u0001\u0017@<|vMPB*LhPTM5 Z\u0004\u0012\u0015jp\r\u0001\u0013C\"|b\fL\u0012bL";
        objectArray[21] = "oZ\u0012\u0010e99EP\t\n6>FL\u0006]aa\u001b\u0017j;e!\u001bP\u00122:b\u0014";
        objectArray[22] = "C{5b\bR\u0017}5;g\u000e\u0013n:=\u000b<E+db^kD/77\u0000\u0013\u001btcjgV\u0001nb*\u000e\u0016\u001dm%Z";
        objectArray[23] = "#RT\u0012Vmo\u0015V\u0004fsr\u0011Y\u001b\nA$T\u0007D\\\u0016%PT\u0011\u0001nz\u000b\u0000Lf,\"\u0000T\u001b\u001esyT\t|";
        objectArray[24] = "t\u001a\"Au\u0004yEs\u0001E\u0005)L(]\u0012Zq\u0011t1\u007fV%L+I \rq\u0011";
        objectArray[25] = "\u0001~lF\u0010xCdi\u000b*p^kp\u0016}'\u00056,A* G~(@Lb]{e";
        objectArray[26] = "f\bvIza4\u001a<_BlYZoMz2`\u000eiM#";
        objectArray[27] = ")7^\u001a9[{%\u0014\f\u0001W\u0016d\u0011\u001coWm(V\u001ey";
        objectArray[28] = "\u0002\u001a`\n\bGV\u001c`Sg\u001bR\u000foU\u000b)\u000fO7\bgD\u0002\u001ebU\u001f\u001bYJ?2]CR\u001ehJ\u0002\u0018\u0006C\u000f\f\u001f\u0006\u0003IiN\u0005\u0003Ns2M\u001bFO\u001arQ\u0018\u0001?O0_\tND\u0003w]\u001f~";
        objectArray[29] = "?sycADs4{uqZn0tj\u001dh:v,5O?<<%i\u0014\u0000f</4q";
        Object[] objectArray2 = objectArray;
        objectArray[30] = "0.M%#|11I\"EtZSC8\u007f7n2\u0015'=.";
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _7T.a(l2, l3);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                _7T.e[n] = clazz = Class.forName(f[n]);
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
        Field field = _7T.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _7T.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _7T.a(l2, l3);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = _7T.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _7T.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _7T.a(clazz3, string2, clazz2)) != null) {
                    _7T.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _7T.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _7T.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _7T.b(1119312382799505L, 0L);
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
        Method method = _7T.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _7T.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method d(long l2, long l3) {
        int n = _7T.a(l2, l3);
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
                clazz3 = _7T.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _7T.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _7T.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _7T.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _7T.b(1119312382799505L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _7T.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _7T.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _7T.b(1119312382799505L, 0L);
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
            if (c == '\u00c4' || c == 'v' || c == 'q' || c == '\u00d8') {
                field = _7T.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c4' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'v' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'q' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _7T.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ef' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'I' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _7T.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/7T" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_7T.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_7T.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

