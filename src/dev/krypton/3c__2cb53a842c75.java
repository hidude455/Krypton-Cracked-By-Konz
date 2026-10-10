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

/*
 * Renamed from dev.krypton.3c
 */
public class _3c_0 {
    private final class_1937 cfr_renamed_6;
    private class_2791 cfr_renamed_4;
    private static final long a = l.a(3480510956320762159L, -4535746605963655892L, MethodHandles.lookup().lookupClass()).a(6352814598560L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static final Object[] e;
    private static final String[] f;

    public _3c_0(long l2) {
        l2 = a ^ l2;
        this.cfr_renamed_6 = _3c_0.b("\u00d6", (Object)_3c_0.b("\u00e8", -7951206722388854031L, (long)l2), -7951743489934529255L, (long)l2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_2680 cfr_renamed_2(Object[] var1_1) {
        block33: {
            block34: {
                block31: {
                    block32: {
                        block30: {
                            block29: {
                                block27: {
                                    block28: {
                                        var6_2 = (Integer)var1_1[0];
                                        var3_3 = (Integer)var1_1[1];
                                        var4_4 = (Long)var1_1[2];
                                        var2_5 = (Integer)var1_1[3];
                                        var4_4 = _3c_0.a ^ var4_4;
                                        var7_6 = _8h.cfr_renamed_4();
                                        try {
                                            try {
                                                v0 /* !! */  = _3c_0.b("\u00ba", (Object)_3c_0.b("\u00d6", (Object)this, (long)8307522744792956853L, (long)var4_4), (int)var3_3, (long)8307365986267722479L, (long)var4_4);
                                                if (var7_6 != null) break block27;
                                                if (v0 /* !! */  == false) break block28;
                                            }
                                            catch (MatchException v1) {
                                                throw _3c_0.a(v1);
                                            }
                                            return _3c_0.b("\u00ba", (Object)_3c_0.b("\u00e8", (long)8306974144381336987L, (long)var4_4), (long)8307030816093449316L, (long)var4_4);
                                        }
                                        catch (MatchException v2) {
                                            throw _3c_0.a(v2);
                                        }
                                    }
                                    v0 /* !! */  = (CallSite)(var6_2 >> 4);
                                }
                                var8_7 = v0 /* !! */ ;
                                var9_8 = var2_5 >> 4;
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    v3 = _3c_0.b("\u00d6", (Object)this, (long)8306907444719841475L, (long)var4_4);
                                                    if (var7_6 != null) break block29;
                                                    if (v3 != null) {
                                                    }
                                                    ** GOTO lbl60
                                                }
                                                catch (MatchException v4) {
                                                    throw _3c_0.a(v4);
                                                }
                                                v3 = _3c_0.b("\u00d6", (Object)this, (long)8306907444719841475L, (long)var4_4);
                                                if (var7_6 != null) break block29;
                                            }
                                            catch (MatchException v5) {
                                                throw _3c_0.a(v5);
                                            }
                                            if (var4_4 < 0L) break block29;
                                            if (_3c_0.b("\u00d6", (Object)_3c_0.b("\u00ba", (Object)v3, (long)8307182901662690743L, (long)var4_4), (long)8307265826448919939L, (long)var4_4) == var8_7) {
                                            }
                                            ** GOTO lbl60
                                        }
                                        catch (MatchException v6) {
                                            throw _3c_0.a(v6);
                                        }
                                        v3 = _3c_0.b("\u00d6", (Object)this, (long)8306907444719841475L, (long)var4_4);
                                        if (var7_6 != null) break block29;
                                    }
                                    catch (MatchException v7) {
                                        throw _3c_0.a(v7);
                                    }
                                    if (_3c_0.b("\u00d6", (Object)_3c_0.b("\u00ba", (Object)v3, (long)8307182901662690743L, (long)var4_4), (long)8307725500504237837L, (long)var4_4) == var9_8) {
                                    }
                                    ** GOTO lbl60
                                }
                                catch (MatchException v8) {
                                    throw _3c_0.a(v8);
                                }
                                var10_9 = _3c_0.b("\u00d6", (Object)this, (long)8306907444719841475L, (long)var4_4);
                                try {
                                    if (var4_4 <= 0L || var7_6 == null) break block30;
lbl60:
                                    // 4 sources

                                    v3 = _3c_0.b("\u00ba", (Object)_3c_0.b("\u00d6", (Object)this, (long)8307522744792956853L, (long)var4_4), (int)var8_7, (int)var9_8, (Object)_3c_0.b("\u00e8", (long)8307634937234185300L, (long)var4_4), (boolean)false, (long)8307853426430845720L, (long)var4_4);
                                }
                                catch (MatchException v9) {
                                    throw _3c_0.a(v9);
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
                                throw _3c_0.a(v11);
                            }
                            return _3c_0.b("\u00ba", (Object)_3c_0.b("\u00e8", (long)8306974144381336987L, (long)var4_4), (long)8307030816093449316L, (long)var4_4);
                        }
                        catch (MatchException v12) {
                            throw _3c_0.a(v12);
                        }
                    }
                    v10 = var10_9;
                }
                var11_10 = _3c_0.b("\u00ba", (Object)v10, (long)8307774327565816808L, (long)var4_4)[_3c_0.b("\u00ba", (Object)var10_9, (int)var3_3, (long)8307523331100094121L, (long)var4_4)];
                try {
                    try {
                        v13 = var11_10;
                        if (var7_6 != null) break block33;
                        if (v13 != null) break block34;
                    }
                    catch (MatchException v14) {
                        throw _3c_0.a(v14);
                    }
                    return _3c_0.b("\u00ba", (Object)_3c_0.b("\u00e8", (long)8306974144381336987L, (long)var4_4), (long)8307030816093449316L, (long)var4_4);
                }
                catch (MatchException v15) {
                    throw _3c_0.a(v15);
                }
            }
            _3c_0.b("a", (Object)this, (class_2791)var10_9, (long)8306907444719841475L, (long)var4_4);
            v13 = var11_10;
        }
        return _3c_0.b("\u00ba", (Object)v13, (int)(var6_2 & _3c_0.a("e", (int)5354, (long)(1469634598100659296L ^ var4_4))), (int)(var3_3 & _3c_0.a("e", (int)4025, (long)(9186656438190339890L ^ var4_4))), (int)(var2_5 & _3c_0.a("e", (int)4025, (long)(9186656438190339890L ^ var4_4))), (long)8307170922207258887L, (long)var4_4);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new Object[31];
        f = new String[31];
        _3c_0.a();
        d = new HashMap(13);
        long l2 = a ^ 0x9649A7470F3L;
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
        String string = "\u00e27D\u001b/[P\u0017#p+\u0002\u0095\u00b4D\u00f5";
        int n2 = "\u00e27D\u001b/[P\u0017#p+\u0002\u0095\u00b4D\u00f5".length();
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
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0xBC7;
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
                throw new RuntimeException("dev/krypton/3c", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _3c_0.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _3c_0.a(n, l2);
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
            throw new RuntimeException("dev/krypton/3c" + " : " + string + " : " + methodType.toString(), exception);
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
            case 0 -> 37;
            case 1 -> 8;
            case 2 -> 26;
            case 3 -> 22;
            case 4 -> 3;
            case 5 -> 45;
            case 6 -> 16;
            case 7 -> 5;
            case 8 -> 61;
            case 9 -> 40;
            case 10 -> 31;
            case 11 -> 55;
            case 12 -> 34;
            case 13 -> 42;
            case 14 -> 53;
            case 15 -> 54;
            case 16 -> 58;
            case 17 -> 18;
            case 18 -> 13;
            case 19 -> 47;
            case 20 -> 4;
            case 21 -> 32;
            case 22 -> 20;
            case 23 -> 46;
            case 24 -> 25;
            case 25 -> 23;
            case 26 -> 24;
            case 27 -> 9;
            case 28 -> 7;
            case 29 -> 12;
            case 30 -> 21;
            case 31 -> 39;
            case 32 -> 28;
            case 33 -> 43;
            case 34 -> 52;
            case 35 -> 6;
            case 36 -> 0;
            case 37 -> 41;
            case 38 -> 30;
            case 39 -> 48;
            case 40 -> 27;
            case 41 -> 11;
            case 42 -> 10;
            case 43 -> 50;
            case 44 -> 36;
            case 45 -> 33;
            case 46 -> 49;
            case 47 -> 2;
            case 48 -> 51;
            case 49 -> 1;
            case 50 -> 19;
            case 51 -> 29;
            case 52 -> 60;
            case 53 -> 59;
            case 54 -> 17;
            case 55 -> 14;
            case 56 -> 44;
            case 57 -> 57;
            case 58 -> 38;
            case 59 -> 63;
            case 60 -> 62;
            case 61 -> 35;
            case 62 -> 56;
            default -> 15;
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
        _3c_0.f[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "T'p\t(GT'gU$HNlgK$]I\u001d6\u0015q\u0018";
        objectArray[1] = ">\bB1o\u000e>\bUmc\u0001$CUsc\u0014#2\u0004-6_";
        objectArray[2] = "\u0016\\b\b/O\u000bI`I*\u0013AZ";
        objectArray[3] = "-U\u00002>\u0015-U\u0017n2\u001a7\u001e\u0017p2\u000f0oF+jM";
        objectArray[4] = "#Ke8O}#KrdCr9\u0000rzCg>q#.\u0010\"";
        objectArray[5] = Integer.TYPE;
        _3c_0.f[5] = "java/lang/Integer";
        objectArray[6] = "q%o\u001f\u001dLq%xC\u0011Cknx]\u0011Vl\u001f)\u0007H\u0015";
        objectArray[7] = "f23-\u00151f2$q\u0019>|y$o\u0019+{\bv:Jk";
        objectArray[8] = "\u001291|-n\u00129& !a\br&>!t\u000f\u0003tks0";
        objectArray[9] = Boolean.TYPE;
        _3c_0.f[9] = "java/lang/Boolean";
        objectArray[10] = "[uLSc\u001f[u[\u000fo\u0010A>[\u0011o\u0005FO\nE>@";
        objectArray[11] = "g%WfT3Q\u0000WfCo]\u000fM-Cq]\u001aJ\\\u0012%\u000e_\u0002";
        objectArray[12] = "\u0019\u0004X(?g\u0019\u0004Ot3h\u0003OOj3}\u0004>\u001f7b";
        objectArray[13] = ")IZ\u001b\b,)IMG\u0004#3\u0002MY\u000464s\u0018\u0006]";
        objectArray[14] = "_:H|\u001ceB/J=\u00199\t";
        objectArray[15] = "ki>[)F`f/\u0014HHkm+N";
        objectArray[16] = "}3wf\rIz:u\u001d\u0013FyftJD\u001f.>#\u001dD\u001ao~|}\u001fH)h";
        objectArray[17] = "\fN0vEBD\\okzJ5\n<&\u0002\u001fT@0`\u001e";
        objectArray[18] = "Olc\t8F\u000f{`\u001d\u0003O\u0019~<\u0003o}M8fY?*O}1\u0004r\u001bK=7\u001d\u0003\u0011\u000bo<\u00152\u0015Ki%d8U\u0019b-U<\u0015\u001f{\\XzR\bgc\u001f9\u0016\u0011\u0002";
        objectArray[19] = "\u0014h?\u0017tjO:y\u0001\u0010o@)$\f|]\u001chzW\u00106T-8\u000e/q\u0017i!k";
        objectArray[20] = "i\n\u0000h0x9\u001c\n2O\u007f4\u0016^4\u0018 lK\u0003Xtn8\u001bKip.>\u0002";
        objectArray[21] = "Z#y2A\u000b\u0010/?.,\u000f\r3&-@=Yu~r\u0010j\\>|zS\u0003\f(v ,";
        objectArray[22] = "\n8+S-*J-{\bU{[:q\u0003\u0002,\u0004g*od+WnpP;{Q4";
        objectArray[23] = "jf(Z\u0006*/\u007f8\u0012z\u007f:`#\f\u0016Ml%}SC\u001alc.\u000b\u000b+h#(\u0012z$0q<\u0012C ,a/k";
        objectArray[24] = "\u0004?4\fy/N3r\u0010\u0014+S/k\u0013x\u0019\u0005j5L.N\u0005,f\u0014e\u007f\u0001l`\r\u0014uA>k\u0005%q\u00018rt";
        objectArray[25] = "7\u0014W\u0018Na\u007f\u0006\b\u0005qj\u000eWM\u001c@->\u0012T\f\b";
        objectArray[26] = "e\u007fs\\_ 5iy\u0006 '8c-\u0000wx`>ql\u001b64n8]\u001fv2w";
        objectArray[27] = "\u007fq\t'5\u0001)-\u000fdI\u001d!-\tq\u001eJzpU&ILq$Wa;\u001a-\"\u0014";
        objectArray[28] = "s\u001fAllt6\u0006Q$\u0010!#\u0019J:|\u0013~Y\u0012g\u0010\u007f1\bJ,!{q\u000eS]+;#\u0005[l/{%\u001c*b! t\u0019X4}&7e\u0014:};7\\\u0010&m(N_Fbh)/\u0015J$tD";
        objectArray[29] = "/4*dw\u001ce8lx\u001a\u0018x$u{v*,b-$$}%ah#{\u0007h9pa\u001a";
        Object[] objectArray2 = objectArray;
        objectArray[30] = "\u000b+$8\u000eQTdu70\u0002aT*>\u000e\u0007Bkj+^\\";
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _3c_0.a(l2, l3);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                _3c_0.e[n] = clazz = Class.forName(f[n]);
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
        Field field = _3c_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _3c_0.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _3c_0.a(l2, l3);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = _3c_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _3c_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _3c_0.a(clazz3, string2, clazz2)) != null) {
                    _3c_0.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _3c_0.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _3c_0.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _3c_0.b(1057333966495069L, 0L);
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
        Method method = _3c_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _3c_0.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method d(long l2, long l3) {
        int n = _3c_0.a(l2, l3);
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
                clazz3 = _3c_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _3c_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _3c_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _3c_0.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _3c_0.b(1057333966495069L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _3c_0.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _3c_0.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _3c_0.b(1057333966495069L, 0L);
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
            if (c == '\u00d6' || c == 'a' || c == '\u00e8' || c == '\u00aa') {
                field = _3c_0.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d6' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'a' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _3c_0.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ba' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00a4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _3c_0.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/3c" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_3c_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_3c_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

