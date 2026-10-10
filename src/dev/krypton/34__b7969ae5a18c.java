/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1799
 */
package dev.krypton;

import dev.krypton._0p;
import dev.krypton._4Q;
import dev.krypton._4w;
import dev.krypton._5R;
import dev.krypton._8b_0;
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
import net.minecraft.class_1799;

public class _34 {
    private static final long a = l.a(-5622527449353297982L, 8948806084357873714L, MethodHandles.lookup().lookupClass()).a(248094007452581L);
    private static final long[] b;
    private static final Long[] c;
    private static final Map d;
    private static final Object[] e;
    private static final String[] f;

    private _34() {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new Object[47];
        f = new String[47];
        _34.a();
        d = new HashMap(13);
        long l2 = a ^ 0x7CD03D265A6CL;
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
        String string = "\u008e\u00cc\u0081\u001b\u00e4>\u00b6Y?\u009c8\u00a5Y\u00a4\u00ce\u00b1";
        int n2 = "\u008e\u00cc\u0081\u001b\u00e4>\u00b6Y?\u009c8\u00a5Y\u00a4\u00ce\u00b1".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l3 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Long[2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void cfr_renamed_1(Object[] var0) {
        block55: {
            block56: {
                block54: {
                    block53: {
                        block52: {
                            block51: {
                                block50: {
                                    block47: {
                                        block48: {
                                            block49: {
                                                block46: {
                                                    block43: {
                                                        block44: {
                                                            block45: {
                                                                block42: {
                                                                    block41: {
                                                                        block40: {
                                                                            block39: {
                                                                                var3_1 = (_8b_0)var0[0];
                                                                                var1_2 = (String)var0[1];
                                                                                var2_3 = (String)var0[2];
                                                                                var4_4 = (class_1799)var0[3];
                                                                                var5_5 = (Long)var0[4];
                                                                                var7_6 = (Long)var0[5];
                                                                                v0 = var7_6 = _34.a ^ var7_6;
                                                                                var9_7 = v0 ^ 37813128922524L;
                                                                                var11_8 = v0 ^ 48487975869813L;
                                                                                var13_9 = v0 ^ 69724782410932L;
                                                                                var15_10 = v0 ^ 36974118188017L;
                                                                                var17_11 = v0 ^ 86409061287074L;
                                                                                var19_12 = v0 ^ 30222316442569L;
                                                                                var21_13 = v0 ^ 109358003646920L;
                                                                                var23_14 = v0 ^ 115248598420445L;
                                                                                var25_15 = _4Q.cfr_renamed_9();
                                                                                try {
                                                                                    v1 /* !! */  = var4_4;
                                                                                    if (var25_15 == null) break block39;
                                                                                    if (v1 /* !! */  == null) break block40;
                                                                                }
                                                                                catch (MatchException v2) {
                                                                                    throw _34.a(v2);
                                                                                }
                                                                                v1 /* !! */  = var4_4;
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    if (var25_15 == null) break block41;
                                                                                    if (_34.b("\u00c1", (Object)v1 /* !! */ , (long)8989388107585943195L, (long)var7_6) != false) break block40;
                                                                                }
                                                                                catch (MatchException v3) {
                                                                                    throw _34.a(v3);
                                                                                }
                                                                                v1 /* !! */  = var4_4;
                                                                                break block41;
                                                                            }
                                                                            catch (MatchException v4) {
                                                                                throw _34.a(v4);
                                                                            }
                                                                        }
                                                                        v1 /* !! */  = _34.b("\u00c1", (Object)var3_1, (long)8989853688296662602L, (long)var7_6);
                                                                    }
                                                                    var26_16 /* !! */  = v1 /* !! */ ;
                                                                    var27_17 = null;
                                                                    try {
                                                                        v5 = _34.b("x", (long)8992923046727606076L, (long)var7_6);
                                                                        v6 = var25_15;
                                                                        if (var7_6 > 0L) {
                                                                            if (v6 == null) break block42;
                                                                            if (v5 == null) break block43;
                                                                        }
                                                                        ** GOTO lbl62
                                                                    }
                                                                    catch (MatchException v7) {
                                                                        throw _34.a(v7);
                                                                    }
                                                                    v5 = _34.b("x", (long)8992923046727606076L, (long)var7_6);
                                                                }
                                                                try {
                                                                    try {
                                                                        v8 = new Object[1];
                                                                        v6 = v8;
                                                                        v8[0] = var11_8;
lbl62:
                                                                        // 2 sources

                                                                        v9 = _34.b("\u00c1", (Object)v5, (Object)v6, (long)8989488207936221396L, (long)var7_6);
                                                                        v10 = var25_15;
                                                                        if (var7_6 < 0L) break block44;
                                                                        if (v10 == null) break block45;
                                                                        if (v9 == null) break block43;
                                                                    }
                                                                    catch (MatchException v11) {
                                                                        throw _34.a(v11);
                                                                    }
                                                                    v12 = new Object[1];
                                                                    v12[0] = var11_8;
                                                                    v9 = _34.b("\u00c1", (Object)_34.b("x", (long)8992923046727606076L, (long)var7_6), (Object)v12, (long)8989488207936221396L, (long)var7_6);
                                                                }
                                                                catch (MatchException v13) {
                                                                    throw _34.a(v13);
                                                                }
                                                            }
                                                            v14 = new Object[2];
                                                            v14[1] = _5R.class;
                                                            v10 = v14;
                                                            v14[0] = var19_12;
                                                        }
                                                        var27_17 = (_5R)_34.b("\u00c1", (Object)v9, (Object)v10, (long)8989658545459660770L, (long)var7_6);
                                                    }
                                                    try {
                                                        v15 = var27_17;
                                                        v16 = var25_15;
                                                        if (var7_6 >= 0L) {
                                                            if (v16 == null) break block46;
                                                            if (v15 == null) break block47;
                                                        }
                                                        ** GOTO lbl101
                                                    }
                                                    catch (MatchException v17) {
                                                        throw _34.a(v17);
                                                    }
                                                    v15 = var27_17;
                                                }
                                                try {
                                                    try {
                                                        v16 = var25_15;
lbl101:
                                                        // 2 sources

                                                        if (var7_6 <= 0L) break block48;
                                                        if (v16 == null) break block49;
                                                        if (_34.b("\u00c1", (Object)v15, (long)8989426942500922785L, (long)var7_6) == false) break block47;
                                                    }
                                                    catch (MatchException v18) {
                                                        throw _34.a(v18);
                                                    }
                                                    v15 = var27_17;
                                                }
                                                catch (MatchException v19) {
                                                    throw _34.a(v19);
                                                }
                                            }
                                            v20 = new Object[6];
                                            v20[5] = var5_5;
                                            v20[4] = var26_16 /* !! */ ;
                                            v20[3] = var2_3;
                                            v20[2] = var1_2;
                                            v20[1] = var3_1;
                                            v16 = v20;
                                            v20[0] = var23_14;
                                        }
                                        _34.b("\u00c1", (Object)v15, (Object)v16, (long)8993003021264031855L, (long)var7_6);
                                        return;
                                    }
                                    var28_18 = new _0p(var15_10, var1_2);
                                    try {
                                        v21 = var2_3;
                                        if (var7_6 < 0L || var25_15 == null) break block50;
                                        if (v21 == null) break block51;
                                    }
                                    catch (MatchException v22) {
                                        throw _34.a(v22);
                                    }
                                    v21 = var2_3;
                                }
                                try {
                                    if (_34.b("\u00c1", v21, (long)8989947190010820617L, (long)var7_6) == false) {
                                        _34.b("\u00c1", (Object)var28_18, (long)var21_13, (Object)var2_3, (long)8992853861199377745L, (long)var7_6);
                                    }
                                }
                                catch (MatchException v23) {
                                    throw _34.a(v23);
                                }
                            }
                            try {
                                v24 /* !! */  = var26_16 /* !! */ ;
                                if (var7_6 <= 0L || var25_15 == null) break block52;
                                if (v24 /* !! */  == null) break block53;
                            }
                            catch (MatchException v25) {
                                throw _34.a(v25);
                            }
                            v24 /* !! */  = var26_16 /* !! */ ;
                        }
                        try {
                            if (_34.b("\u00c1", (Object)v24 /* !! */ , (long)8989388107585943195L, (long)var7_6) == false) {
                                _34.b("\u00c1", (Object)var28_18, (Object)_34.b("\u00c1", (Object)var26_16 /* !! */ , (long)8990261782443266987L, (long)var7_6), (long)var17_11, (long)8989253926272347587L, (long)var7_6);
                            }
                        }
                        catch (MatchException v26) {
                            throw _34.a(v26);
                        }
                    }
                    try {
                        v27 = new Object[2];
                        v27[1] = var9_7;
                        v27[0] = var5_5;
                        _34.b("\u00c1", (Object)var28_18, (Object)v27, (long)8993055617872086591L, (long)var7_6);
                        v28 = _34.b("x", (long)8989258081507160400L, (long)var7_6);
                        if (var7_6 <= 0L || var25_15 == null) break block54;
                        if (v28 == null) break block55;
                    }
                    catch (MatchException v29) {
                        throw _34.a(v29);
                    }
                    v28 = _34.b("x", (long)8989258081507160400L, (long)var7_6);
                }
                try {
                    try {
                        v30 = _34.b("\u00c1", (Object)v28, (long)8989567185345219362L, (long)var7_6);
                        if (var25_15 == null) break block56;
                        if (v30 == null) break block55;
                    }
                    catch (MatchException v31) {
                        throw _34.a(v31);
                    }
                    v30 = _34.b("\u00c1", (Object)_34.b("x", (long)8989258081507160400L, (long)var7_6), (long)8989567185345219362L, (long)var7_6);
                }
                catch (MatchException v32) {
                    throw _34.a(v32);
                }
            }
            v33 = new Object[1];
            v33[0] = var13_9;
            _34.b("\u00c1", (Object)v30, (Object)_34.b("\u00c1", (Object)var28_18, (Object)v33, (long)8990029167450776642L, (long)var7_6), (long)8990081651638897112L, (long)var7_6);
        }
        try {
            if (var7_6 > 0L && _4w.cfr_renamed_8() == null) {
                _4Q.cfr_renamed_4(new _4w[1]);
            }
        }
        catch (MatchException v34) {
            throw _34.a(v34);
        }
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _34.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _34.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/34" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _34.a(l2, l3);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                _34.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _34.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _34.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _34.a(l2, l3);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = _34.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _34.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _34.a(clazz3, string2, clazz2)) != null) {
                    _34.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _34.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _34.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _34.b(1748083887452453L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _34.a(l2, l3);
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
                clazz3 = _34.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _34.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _34.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _34.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _34.b(1748083887452453L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _34.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _34.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _34.b(1748083887452453L, 0L);
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/34" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "i\u007fChx\u0016tjA)}J>.";
        objectArray[1] = "\u001a\u000f[\u0000`}o/P\u000fq2\u000e![\u0004uhz";
        objectArray[2] = Void.TYPE;
        _34.f[2] = "java/lang/Void";
        objectArray[3] = "\u0016r\u00107+;\u000bg\u0012v.gJu";
        objectArray[4] = "'\u0006F+A<R&M$Ps3(F/T)G";
        objectArray[5] = "8OR\t\u0005F%ZPH\u0000\u001alZ";
        objectArray[6] = Long.TYPE;
        _34.f[6] = "java/lang/Long";
        objectArray[7] = ".\u0005\u0001F\u000e5%\n\u0010\ts-6\r\u0019@";
        objectArray[8] = ")`\u0000\u000b=<4u\u0002J8`\u007f";
        objectArray[9] = "nZ\u007f8wEsO}yr\u0019?m";
        objectArray[10] = "\"UW\u0000d\u001fWu\\\u000fuP6{W\u0004q\nB";
        objectArray[11] = "h7\u001bSEZ\u001d\u0017\u0010\\T\u0015|\u0019\u001bWPO\b";
        objectArray[12] = "{\u0016_-\u0014u{\u0016Hq\u0018za]Ho\u0018of,\u001a4@%";
        objectArray[13] = Boolean.TYPE;
        _34.f[13] = "java/lang/Boolean";
        objectArray[14] = "Bfu:Nv7F~5_9VHu>[c\"";
        objectArray[15] = "\u001dX\u0016\u0005!V\u0000M\u0014D$\n@L";
        objectArray[16] = "C\u0001\u001arA$C\u0001\r.M+YJ\r0M>^;]k\u0018";
        objectArray[17] = "u\u0007:NgGu\u0007-\u0012kHoL-\fk]h=}V2";
        objectArray[18] = "[\u0014RLLc[\u0014E\u0010@lA_E\u000e@yF.\u0017U\u00188";
        objectArray[19] = "YE0t#\u007fYE'(/pC\u000e'6/eD\u007fwk~";
        objectArray[20] = "/dc:6\u000b2qa{3W}y";
        objectArray[21] = "o 7'3{\u001a\u0000<(\"4{\u000e7#&n\u000f";
        objectArray[22] = "8.V|[v%;T=^*ly";
        objectArray[23] = "\u0004WN_\u000b$qwEP\u001ak\u0010yN[\u001e1d";
        objectArray[24] = "B\u0005\u0010da~I\n\u0001+\u0000pB\u0001\u0005q";
        objectArray[25] = "\b+0fV\u001aIy:0$'{\u0018\u0019\t\u001e\u0011]--k_CW{";
        objectArray[26] = "qw,0. 0%&f\\\u0003\rP\u0004_f+$q1='y.'";
        objectArray[27] = "W~P\u001aQx\u000f?\u0014}PIZ%P\u0018\u000b.R(S\u001fjpP+\u0014\u0018V2I+A}";
        objectArray[28] = "Z\u0019p2Lu\b\u001bn;s2aAp{O7\u0019\u0005(3C\u000b]\rup\u001a2\u001f@.4s0\u0005\u0018-5\rb\u0007\u0006$\n";
        objectArray[29] = "\u0006Q\u0005la&[\u0012\u001c{\u001etx,[z}&DG\u00069d1";
        objectArray[30] = "Eo$;u9\u0002g85H<>\u000b(25a\u001al ?6f{2\"<qaGp;<$\u0004";
        objectArray[31] = "M\u0007fzV\u0017\u001f\u0005xsiXv\fi?\f\b\u0011\u0004d<\u000biM\u0007fzV\u0017\u001f\u0005xsi";
        objectArray[32] = "\u0002Z\u0003NjHC\b\t\u0018\u0018qex'lCq8\t\u0005NwXZHWD!";
        objectArray[33] = "]@h\u0012t3\u001c\u0012bD\u0006ig\u0019j\u000fak]\u0014bEeQ";
        objectArray[34] = "7A\u0011k6 u\fJ/_xp|\u0014i#h\u000b\u0000\u0017q/`mCIro\u0019";
        objectArray[35] = "tQ@^\"\u001a&S^W\u001d\\OZO\u001bx\u0005(RB\u0018\u007fd&Q[\fxT0O[\u0001\u001d";
        objectArray[36] = "<{7\u0004'j9=7ZUh;}1\u00019Zo0`WUfh|)\ro3m1jflh284Z.q2mQ";
        objectArray[37] = "\u000b\u001e%\u001fB[S_axHj\u0006E%\u001d\u0018\r\u000eH&\u001ayS\fKa\u001dE\u0011\u0015K4x";
        objectArray[38] = "O\u0006\t9U8\u000eT\u0003o'\u0017/5!\f'`\u001c\u0000\t$E!N\n_";
        objectArray[39] = "I2cflSD:)bV\f\u0014#qf:>Fn)0V\u0002\b#zj:\u0018Agz\u0001";
        objectArray[40] = "!\t\" X s\u000b<)go\u001a\u00066d\f5v\u001c\u007f \f^&\b6$[&bP~(ge~\b\u007f'\u00197|\u0016v\u0018";
        objectArray[41] = "\u0014\u0010O\u0005\u0007\fISV\u0012x^rm@\u0016\u0000\u000eM\u001fR\u0000\u0018\u0016";
        objectArray[42] = "^pEkD\u0001Sx\u000fo~^\u0003aWk\u0012lQ,\t4~\n\b}Gu\u0018IV~\u0007\f";
        objectArray[43] = "h4hfUo> w,,d\u0004{s<\\,b8-?\u001cU";
        objectArray[44] = "i$\u00030ft4g\u001a'\u0019$T6\n&|~3>\u0007%{\u001f:8\\;u.k'\u001e \u0019";
        objectArray[45] = "V\u0019=`UHD\u000f%x1_W\u001d%n]m\u0003\\{71P@\u0007'{VU\u0006\u0007y\t";
        Object[] objectArray2 = objectArray;
        objectArray[46] = "%{<a\u0010\u001ftd~z|\u0013Kuj|\u0019O,}g\u007f\u001e.'d};\u0005\u0014qpbq|";
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fb' || c == '\u00ec' || c == 'x' || c == 'B') {
                field = _34.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fb' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ec' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'x' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _34.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00aa' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _34.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static long a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = _34.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return l3;
    }

    private static long a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x77EF;
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
                throw new RuntimeException("dev/krypton/34", exception);
            }
            long l5 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            _34.c[n2] = l5;
        }
        return c[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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
            case 0 -> 4;
            case 1 -> 29;
            case 2 -> 24;
            case 3 -> 35;
            case 4 -> 7;
            case 5 -> 22;
            case 6 -> 5;
            case 7 -> 59;
            case 8 -> 61;
            case 9 -> 62;
            case 10 -> 17;
            case 11 -> 13;
            case 12 -> 33;
            case 13 -> 19;
            case 14 -> 27;
            case 15 -> 51;
            case 16 -> 43;
            case 17 -> 49;
            case 18 -> 3;
            case 19 -> 53;
            case 20 -> 15;
            case 21 -> 18;
            case 22 -> 54;
            case 23 -> 21;
            case 24 -> 39;
            case 25 -> 37;
            case 26 -> 8;
            case 27 -> 12;
            case 28 -> 34;
            case 29 -> 52;
            case 30 -> 9;
            case 31 -> 58;
            case 32 -> 45;
            case 33 -> 23;
            case 34 -> 11;
            case 35 -> 6;
            case 36 -> 25;
            case 37 -> 44;
            case 38 -> 36;
            case 39 -> 57;
            case 40 -> 60;
            case 41 -> 31;
            case 42 -> 10;
            case 43 -> 2;
            case 44 -> 46;
            case 45 -> 50;
            case 46 -> 30;
            case 47 -> 55;
            case 48 -> 20;
            case 49 -> 41;
            case 50 -> 48;
            case 51 -> 56;
            case 52 -> 0;
            case 53 -> 40;
            case 54 -> 63;
            case 55 -> 14;
            case 56 -> 38;
            case 57 -> 42;
            case 58 -> 1;
            case 59 -> 16;
            case 60 -> 32;
            case 61 -> 26;
            case 62 -> 47;
            default -> 28;
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
        _34.f[n3] = new String(cArray);
        return n3;
    }

    public static void cfr_renamed_2(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = (String)objectArray[2];
        long l3 = (l2 = a ^ l2) ^ 0x7B53ACE82210L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l3;
        objectArray2[2] = string2;
        objectArray2[1] = string;
        objectArray2[0] = _34.b("x", -8709544405549985005L, (long)l2);
        _34.b("\u00aa", (Object)objectArray2, -8705564000739197320L, (long)l2);
    }

    public static void cfr_renamed_3(Object[] objectArray) {
        _8b_0 b_0 = (_8b_0)((Object)objectArray[0]);
        String string = (String)objectArray[1];
        String string2 = (String)objectArray[2];
        long l2 = (Long)objectArray[3];
        long l3 = (l2 = a ^ l2) ^ 0xA6C93A4D9F3L;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = l3;
        objectArray2[4] = (long)_34.a("a", 21261, (long)(0x3B55CF97DE8EE2CCL ^ l2));
        objectArray2[3] = null;
        objectArray2[2] = string2;
        objectArray2[1] = string;
        objectArray2[0] = b_0;
        _34.b("\u00aa", (Object)objectArray2, 5054751903208969528L, (long)l2);
    }

    public static void cfr_renamed_6(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = (String)objectArray[2];
        long l3 = (l2 = a ^ l2) ^ 0x1424DB34FB0FL;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l3;
        objectArray2[2] = string2;
        objectArray2[1] = string;
        objectArray2[0] = _34.b("x", 6791335646162808498L, (long)l2);
        _34.b("\u00aa", (Object)objectArray2, 6787189470985594727L, (long)l2);
    }

    public static void cfr_renamed_7(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = (String)objectArray[2];
        long l3 = (l2 = a ^ l2) ^ 0x7C27B140AF35L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l3;
        objectArray2[2] = string2;
        objectArray2[1] = string;
        objectArray2[0] = _34.b("x", 723621176896041957L, (long)l2);
        _34.b("\u00aa", (Object)objectArray2, 723558770657620829L, (long)l2);
    }

    public static void cfr_renamed_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        String string2 = (String)objectArray[2];
        long l3 = (l2 = a ^ l2) ^ 0x633277CADB01L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l3;
        objectArray2[2] = string2;
        objectArray2[1] = string;
        objectArray2[0] = _34.b("x", 9096720022139262895L, (long)l2);
        _34.b("\u00aa", (Object)objectArray2, 9096857605659166569L, (long)l2);
    }

    public static void cfr_renamed_0(Object[] objectArray) {
        _8b_0 b_0 = (_8b_0)((Object)objectArray[0]);
        long l2 = (Long)objectArray[1];
        String string = (String)objectArray[2];
        String string2 = (String)objectArray[3];
        class_1799 class_17992 = (class_1799)objectArray[4];
        long l3 = (l2 = a ^ l2) ^ 0x3055DD528F7DL;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = l3;
        objectArray2[4] = (long)_34.a("a", 128, (long)(0x38E83FBB76D867CEL ^ l2));
        objectArray2[3] = class_17992;
        objectArray2[2] = string2;
        objectArray2[1] = string;
        objectArray2[0] = b_0;
        _34.b("\u00aa", (Object)objectArray2, 1200257861414175670L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_34.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_34.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

