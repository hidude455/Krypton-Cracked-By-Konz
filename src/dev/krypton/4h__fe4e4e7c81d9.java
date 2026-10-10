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

import dev.krypton._8F;
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

public class _4h {
    private final class_1937 cfr_renamed_5;
    private class_2791 cfr_renamed_4;
    private static final long a = l.a(-1260927175982234821L, 9149016300971461156L, MethodHandles.lookup().lookupClass()).a(2635594395795L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static final Object[] e;
    private static final String[] f;

    public _4h(long l2) {
        l2 = a ^ l2;
        this.cfr_renamed_5 = _4h.b("\u00c6", (Object)_4h.b("\u00a2", -3987050397252065108L, (long)l2), -3987614542572833804L, (long)l2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_2680 cfr_renamed_3(Object[] var1_1) {
        block33: {
            block34: {
                block35: {
                    block31: {
                        block32: {
                            block30: {
                                block29: {
                                    block27: {
                                        block28: {
                                            var5_2 = (Integer)var1_1[0];
                                            var2_3 = (Integer)var1_1[1];
                                            var6_4 = (Integer)var1_1[2];
                                            var3_5 = (Long)var1_1[3];
                                            var3_5 = _4h.a ^ var3_5;
                                            var7_6 = _8F.cfr_renamed_7();
                                            try {
                                                try {
                                                    v0 /* !! */  = _4h.b("\u00ef", (Object)_4h.b("\u00c6", (Object)this, (long)-193435474767292657L, (long)var3_5), (int)var2_3, (long)-192630160315018422L, (long)var3_5);
                                                    if (var7_6 == 0) break block27;
                                                    if (v0 /* !! */  == false) break block28;
                                                }
                                                catch (MatchException v1) {
                                                    throw _4h.a(v1);
                                                }
                                                return _4h.b("\u00ef", (Object)_4h.b("\u00a2", (long)-193028188955597194L, (long)var3_5), (long)-192939184972576315L, (long)var3_5);
                                            }
                                            catch (MatchException v2) {
                                                throw _4h.a(v2);
                                            }
                                        }
                                        v0 /* !! */  = (CallSite)(var5_2 >> 4);
                                    }
                                    var8_7 = v0 /* !! */ ;
                                    var9_8 = var6_4 >> 4;
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        v3 = _4h.b("\u00c6", (Object)this, (long)-193212856051107659L, (long)var3_5);
                                                        if (var7_6 == 0) break block29;
                                                        if (v3 != null) {
                                                        }
                                                        ** GOTO lbl60
                                                    }
                                                    catch (MatchException v4) {
                                                        throw _4h.a(v4);
                                                    }
                                                    v3 = _4h.b("\u00c6", (Object)this, (long)-193212856051107659L, (long)var3_5);
                                                    if (var7_6 == 0) break block29;
                                                }
                                                catch (MatchException v5) {
                                                    throw _4h.a(v5);
                                                }
                                                if (var3_5 < 0L) break block29;
                                                if (_4h.b("\u00c6", (Object)_4h.b("\u00ef", (Object)v3, (long)-192805530070934983L, (long)var3_5), (long)-192873475323150960L, (long)var3_5) == var8_7) {
                                                }
                                                ** GOTO lbl60
                                            }
                                            catch (MatchException v6) {
                                                throw _4h.a(v6);
                                            }
                                            v3 = _4h.b("\u00c6", (Object)this, (long)-193212856051107659L, (long)var3_5);
                                            if (var7_6 == 0) break block29;
                                        }
                                        catch (MatchException v7) {
                                            throw _4h.a(v7);
                                        }
                                        if (_4h.b("\u00c6", (Object)_4h.b("\u00ef", (Object)v3, (long)-192805530070934983L, (long)var3_5), (long)-193619243556711187L, (long)var3_5) == var9_8) {
                                        }
                                        ** GOTO lbl60
                                    }
                                    catch (MatchException v8) {
                                        throw _4h.a(v8);
                                    }
                                    var10_9 = _4h.b("\u00c6", (Object)this, (long)-193212856051107659L, (long)var3_5);
                                    try {
                                        if (var3_5 <= 0L || var7_6 != 0) break block30;
lbl60:
                                        // 4 sources

                                        v3 = _4h.b("\u00ef", (Object)_4h.b("\u00c6", (Object)this, (long)-193435474767292657L, (long)var3_5), (int)var8_7, (int)var9_8, (Object)_4h.b("\u00a2", (long)-193533029335015991L, (long)var3_5), (boolean)false, (long)-193513902002750135L, (long)var3_5);
                                    }
                                    catch (MatchException v9) {
                                        throw _4h.a(v9);
                                    }
                                }
                                var10_9 = v3;
                            }
                            try {
                                try {
                                    v10 = var10_9;
                                    if (var7_6 == 0) break block31;
                                    if (v10 != null) break block32;
                                }
                                catch (MatchException v11) {
                                    throw _4h.a(v11);
                                }
                                return _4h.b("\u00ef", (Object)_4h.b("\u00a2", (long)-193028188955597194L, (long)var3_5), (long)-192939184972576315L, (long)var3_5);
                            }
                            catch (MatchException v12) {
                                throw _4h.a(v12);
                            }
                        }
                        v10 = var10_9;
                    }
                    var11_10 = _4h.b("\u00ef", (Object)v10, (long)-193355495779640235L, (long)var3_5)[_4h.b("\u00ef", (Object)var10_9, (int)var2_3, (long)-192565918355665536L, (long)var3_5)];
                    try {
                        try {
                            v13 = var11_10;
                            v14 = var7_6;
                            if (var3_5 < 0L) break block33;
                            if (v14 == 0) break block34;
                            if (v13 != null) break block35;
                        }
                        catch (MatchException v15) {
                            throw _4h.a(v15);
                        }
                        return _4h.b("\u00ef", (Object)_4h.b("\u00a2", (long)-193028188955597194L, (long)var3_5), (long)-192939184972576315L, (long)var3_5);
                    }
                    catch (MatchException v16) {
                        throw _4h.a(v16);
                    }
                }
                _4h.b("o", (Object)this, (class_2791)var10_9, (long)-193212856051107659L, (long)var3_5);
                v13 = var11_10;
            }
            v14 = var5_2 & _4h.a("k", (int)22879, (long)(760620843686505084L ^ var3_5));
        }
        return _4h.b("\u00ef", (Object)v13, (int)v14, (int)(var2_3 & _4h.a("k", (int)15363, (long)(7031837536620760865L ^ var3_5))), (int)(var6_4 & _4h.a("k", (int)15363, (long)(7031837536620760865L ^ var3_5))), (long)-193014620256357175L, (long)var3_5);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new Object[31];
        f = new String[31];
        _4h.a();
        d = new HashMap(13);
        long l2 = a ^ 0x5D19E2B32747L;
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
        String string = "\u00ed\u0087\u00e3\u0019\u00d8\u00ee+\u00a6u\u00ea\u00e48\t.B\u00b9";
        int n2 = "\u00ed\u0087\u00e3\u0019\u00d8\u00ee+\u00a6u\u00ea\u00e48\t.B\u00b9".length();
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
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0xE74;
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
                throw new RuntimeException("dev/krypton/4h", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _4h.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _4h.a(n, l2);
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
            throw new RuntimeException("dev/krypton/4h" + " : " + string + " : " + methodType.toString(), exception);
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
            case 0 -> 47;
            case 1 -> 49;
            case 2 -> 31;
            case 3 -> 29;
            case 4 -> 38;
            case 5 -> 30;
            case 6 -> 13;
            case 7 -> 12;
            case 8 -> 10;
            case 9 -> 55;
            case 10 -> 26;
            case 11 -> 11;
            case 12 -> 27;
            case 13 -> 59;
            case 14 -> 61;
            case 15 -> 50;
            case 16 -> 4;
            case 17 -> 8;
            case 18 -> 9;
            case 19 -> 20;
            case 20 -> 60;
            case 21 -> 56;
            case 22 -> 36;
            case 23 -> 41;
            case 24 -> 57;
            case 25 -> 18;
            case 26 -> 14;
            case 27 -> 42;
            case 28 -> 54;
            case 29 -> 52;
            case 30 -> 28;
            case 31 -> 21;
            case 32 -> 19;
            case 33 -> 25;
            case 34 -> 51;
            case 35 -> 2;
            case 36 -> 35;
            case 37 -> 58;
            case 38 -> 17;
            case 39 -> 44;
            case 40 -> 40;
            case 41 -> 1;
            case 42 -> 23;
            case 43 -> 6;
            case 44 -> 46;
            case 45 -> 7;
            case 46 -> 39;
            case 47 -> 63;
            case 48 -> 0;
            case 49 -> 37;
            case 50 -> 34;
            case 51 -> 32;
            case 52 -> 3;
            case 53 -> 48;
            case 54 -> 22;
            case 55 -> 15;
            case 56 -> 5;
            case 57 -> 53;
            case 58 -> 45;
            case 59 -> 43;
            case 60 -> 24;
            case 61 -> 16;
            case 62 -> 62;
            default -> 33;
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
        _4h.f[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "\u0000M}\u0014&J\u0000MjH*E\u001a\u0006jV*P\u001dw;\b\u007f\u0015";
        objectArray[1] = "P.T\u0018)TP.CD%[JeCZ%NM\u0014\u0012\u0004p\u0005";
        objectArray[2] = "\u0006yK&&L\u0006y\\z*C\u001c2\\d*V\u001bC\r0y\u0013";
        objectArray[3] = Integer.TYPE;
        _4h.f[3] = "java/lang/Integer";
        objectArray[4] = "enYb\u0001\u001fenN>\r\u0010\u007f%N \r\u0005xT\u001fzTF";
        objectArray[5] = "2_#U%`2_4\t)o(\u00144\u0017)z/efBz:";
        objectArray[6] = "aG%$\u0011\u0005aG2x\u001d\n{\f2f\u001d\u001f|}c=E]";
        objectArray[7] = "s\u000e\u007f+$us\u000ehw(ziEhi(on4:<z+";
        objectArray[8] = Boolean.TYPE;
        _4h.f[8] = "java/lang/Boolean";
        objectArray[9] = "o\u0017L\n?+o\u0017[V3$u\\[H31r-\n\u001cbt";
        objectArray[10] = "t/\u001aV^\\i:\u0018\u0017[\u0000$\"";
        objectArray[11] = "\u007fio\u0015V\nILo\u0015AVECu^AHEVr/\u0010\u001c\u0016\u0013:";
        objectArray[12] = "]N\u0010^\u0007\u0000]N\u0007\u0002\u000b\u000fG\u0005\u0007\u001c\u000b\u001a@tWAZ";
        objectArray[13] = "z\u0004Z\u000fgpz\u0004MSk\u007f`OMMkjg>\u0018\u00122";
        objectArray[14] = ")2\\A\u0014=4'^\u0000\u0011a\u007f";
        objectArray[15] = "F4..6jM;?aWdF0;;";
        objectArray[16] = "N._\"lp\u0010 HAzoB6U\u0016-6\u0015n\u0002Anb\u00156\u0006,qp\u001e";
        objectArray[17] = "3gdT/\u0002k7rBS\ng{oZ?83=5\u0000oo0bv\r:\u0015lgcDSUo~?T)\tjkv=i\ns7fG5\u000ff~\u000f\u0006:\u001e7cp\u00052\u0011n\u0007";
        objectArray[18] = "d\u001dfkog{\u000fm\u000f5gb\u0011;c\u0007;#O`\u000fkcoL8phk`\u0015\\";
        objectArray[19] = "M]\t\u001f=q\r\u0012\u001aGYp\u0017@\u001cM\u000e/O\u001dA!c{\u000f\u001d\u0011[?~\u001aT";
        objectArray[20] = "g\u000b\u001b_C>d\u0011\u0017\\8<6\u000fGRT\u000ebI\u001f\r\u0004Y`\u0003V\u000b\\6 LES8";
        objectArray[21] = "\u001eDaw\b9N\u001ac}e)OFwp2~\u0010\u001b,\u001cT \u0013Vkc\u000f!NR";
        objectArray[22] = "fPLD\u001d\u0019aVIW&\u00036F\u0017@J1`\u0003I\u001f\u001ffa_\u000e\u0017O\u001c=Z\u001b^&Xe\\F\u001eM\u00188K\u0018'";
        objectArray[23] = "#X6\b2Y B:\u000bI[r\\j\u0005%i$\u00194Zs>%EsR Dy@f\u001bI\u0004zY:\u000b3X\u007fLsb";
        objectArray[24] = "o/B-TG/`Qu0F52W\u007fg\u0019mo\u000b\u0013\nM-oZiVH8&";
        objectArray[25] = "#\u007f-e\u0014eyx-8$l|o.9s;'2rn$<`ezeCfge'";
        objectArray[26] = "cA\u0010En\u000bdG\u0015VU\u00113WKA9#n\u0017\u0013\u001cUN;R\u001bO/\u0012>GR&o\u0011'\u001bB\\3\u00142R+\u0018(\u0013n\u001bLB/\u00133+\u0015\u00183Eg@UE$\u001b^\u0017S\u001a?\u000f9\u0014I\u0016<t";
        objectArray[27] = "T8RFUXP=\u001aR,\u0018kgH\rO\u001a\u0014`N\b\\";
        objectArray[28] = "xL\u0010%`;{V\u001c&\u001b9)HL(w\u000b}\u000e\u0014w%\\t\u000e]7xl:PU7\u001b";
        objectArray[29] = "V\u001b[H\u0003OV\u0000KV?Fdp\u0012\\M\u0014R\u000eB\u0002O\u001e";
        Object[] objectArray2 = objectArray;
        objectArray[30] = "\u001aL\u0003-\t!\u001eIK9p`%\u0012\u000ba\u001a#B\u0011\u0011m\u0019";
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _4h.a(l2, l3);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                _4h.e[n] = clazz = Class.forName(f[n]);
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
        Field field = _4h.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _4h.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _4h.a(l2, l3);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = _4h.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _4h.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _4h.a(clazz3, string2, clazz2)) != null) {
                    _4h.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _4h.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _4h.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _4h.b(1114794683257878L, 0L);
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
        Method method = _4h.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _4h.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method d(long l2, long l3) {
        int n = _4h.a(l2, l3);
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
                clazz3 = _4h.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _4h.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _4h.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _4h.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _4h.b(1114794683257878L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _4h.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _4h.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _4h.b(1114794683257878L, 0L);
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
            if (c == '\u00c6' || c == 'o' || c == '\u00a2' || c == '\u00a4') {
                field = _4h.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c6' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'o' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00a2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _4h.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ef' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'c' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _4h.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/4h" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_4h.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_4h.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

