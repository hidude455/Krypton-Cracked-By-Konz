/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 */
package dev.krypton;

import dev.krypton._3i_0;
import dev.krypton._4w;
import dev.krypton._5D;
import dev.krypton._9o;
import dev.krypton.l;
import dev.krypton.mixin._9Y;
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

public class _8 {
    public static _8 cfr_renamed_4;
    private boolean cfr_renamed_9;
    private boolean cfr_renamed_5;
    private int cfr_renamed_6;
    private int cfr_renamed_8;
    private static int[] cfr_renamed_7;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static final Object[] e;
    private static final String[] f;

    private void cfr_renamed_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        _9Y y = (_9Y)((Object)_8.b("\u00a2", (Object)_8.b("\u00a2", (Object)_8.b("p", -9166544189568987552L, (long)l2), -9166709437588054802L, (long)l2), -9167499647460726638L, (long)l2));
        y.setTimesPressed(y.getTimesPressed() + 1);
    }

    public _8(long l2) {
        l2 = a ^ l2;
        _8.b("\u00d9", (Object)this, (boolean)_8.a("t", 9073, (long)(0x5F45B46E73E59309L ^ l2)), 1954989548897263403L, (long)l2);
        _8.b("\u00d9", (Object)this, (boolean)_8.a("t", 9073, (long)(0x5F45B46E73E59309L ^ l2)), 1955662968853736967L, (long)l2);
        _8.b("\u00d9", (Object)this, (int)_8.a("t", 9073, (long)(0x5F45B46E73E59309L ^ l2)), 1958247207082026776L, (long)l2);
        _8.b("\u00d9", (Object)this, (int)_8.a("t", 9073, (long)(0x5F45B46E73E59309L ^ l2)), 1958424604982907627L, (long)l2);
        _8.b("c", (_8)this, 1955293967030909101L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                _8.a = l.a(-3094699614979538601L, 188527462077003239L, MethodHandles.lookup().lookupClass()).a(279153371779632L);
                _8.e = new Object[38];
                _8.f = new String[38];
                _8.a();
                _8.d = new HashMap<K, V>(13);
                var0 = _8.a ^ 109937858488432L;
                _8.cfr_renamed_7(null);
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[6];
                var5_4 = 0;
                var6_5 = "7\u0083{W@\u0098\u009e'\u0082\u00eaL\u0015\u0014fp\u00df\u001d\u00891\u00a5\u0015)\u00d1*d,\u00a8\u00e9\u00bc\u00cd\u00ce\u00bc";
                var7_6 = "7\u0083{W@\u0098\u009e'\u0082\u00eaL\u0015\u0014fp\u00df\u001d\u00891\u00a5\u0015)\u00d1*d,\u00a8\u00e9\u00bc\u00cd\u00ce\u00bc".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl30:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00bd\u00ed\u00c2\u00e3\u00dbI\u00bf\u00c1_>\u00d2\u0080\u00e5|\u00f9;";
                    var7_6 = "\u00bd\u00ed\u00c2\u00e3\u00dbI\u00bf\u00c1_>\u00d2\u0080\u00e5|\u00f9;".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl43:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl56:
                // 1 sources

                ** continue;
            }
        }
        _8.b = var8_3;
        _8.c = new Integer[6];
    }

    public boolean cfr_renamed_1(Object[] objectArray) {
        Object object;
        block6: {
            block8: {
                block7: {
                    long l2 = (Long)objectArray[0];
                    l2 = a ^ l2;
                    int[] nArray = _8.cfr_renamed_2();
                    try {
                        try {
                            try {
                                object = _8.b("\u00a2", (Object)this, -9125522749683321729L, (long)l2);
                                if (nArray != null) break block6;
                                if (object != false) break block7;
                            }
                            catch (MatchException matchException) {
                                throw _8.a(matchException);
                            }
                            object = _8.b("\u00a2", (Object)this, -9127284586579034784L, (long)l2);
                            if (nArray != null) break block6;
                        }
                        catch (MatchException matchException) {
                            throw _8.a(matchException);
                        }
                        if (object <= 0) break block8;
                    }
                    catch (MatchException matchException) {
                        throw _8.a(matchException);
                    }
                }
                object = true;
                break block6;
            }
            object = false;
        }
        return (boolean)object;
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _8.a(l2, l3);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                _8.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _8.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _8.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
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
            throw new RuntimeException("dev/krypton/8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _8.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _8.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _8.a(l2, l3);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = _8.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _8.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _8.a(clazz3, string2, clazz2)) != null) {
                    _8.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _8.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _8.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _8.b(1226760686753482L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _8.a(l2, l3);
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
                clazz3 = _8.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _8.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _8.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _8.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _8.b(1226760686753482L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _8.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _8.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _8.b(1226760686753482L, 0L);
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
            throw new RuntimeException("dev/krypton/8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = ",7>_\u0007\u00161\"<\u001e\u0002Jp";
        objectArray[1] = Boolean.TYPE;
        _8.f[1] = "java/lang/Boolean";
        objectArray[2] = "(<\u0003A#b]\u001c\bN2-<\u0012\u0003E6wH";
        objectArray[3] = Void.TYPE;
        _8.f[3] = "java/lang/Void";
        objectArray[4] = "\u0004M!8$w\u0004M6d(x\u001e\u00066z(m\u0019wf'|";
        objectArray[5] = "E\u0007h\\t%E\u0007\u007f\u0000x*_L\u007f\u001ex?X=/B-";
        objectArray[6] = "0xCHrm0xT\u0014~b*3T\n~w-B\u0004W/";
        objectArray[7] = Integer.TYPE;
        _8.f[7] = "java/lang/Integer";
        objectArray[8] = "[\n!cJ6F\u001f#\"Oj\r";
        objectArray[9] = "j\u0017Q\n\u0019\u001bj\u0017FV\u0015\u0014p\\FH\u0015\u0001w-\u0013\u0017B";
        objectArray[10] = "vRnZ\tWkGl\u001b\f\u000b's";
        objectArray[11] = "D?= S21\u001f6/B}P\u0011=$F'$";
        objectArray[12] = ";?\u0011|wV;?\u0006 {Y!t\u0006>{L&\u0005Qa-";
        objectArray[13] = "p\n\u001f\\[\u0012m\u001f\u001d\u001d^N$]";
        objectArray[14] = "p\u0007\u001fk?\u0000\u0005'\u0014d.Od)\u001fo*\u0015\u0010";
        objectArray[15] = "}%!\u001em@`0#_h\u001c/8";
        objectArray[16] = "Fmp\u00194e3M{\u0016%*RCp\u001d!p&";
        objectArray[17] = "\u001fT#2\u0005$\u0014[2}d*\u001fP6'";
        objectArray[18] = "\u0004kz=f[C<{4\u001d];n>5q\u0007A>o1%b\u0002o`7c\u0005Rv?)\u001d";
        objectArray[19] = "\u001b\u0018B'\n\tDOW\u0019Wn\u001eJ\\~\u0016\tNS\u0003`";
        objectArray[20] = "fHxpZ\u0018cN~0!\u000b;L' v\\e\u001ezL\u001c\u000e M &B\u0005'C";
        objectArray[21] = "UzM<B2P|K|9!\b~\u0012lnvV.K\u0000\t>\b+KgV?\u000bh";
        objectArray[22] = ":_\n\u0006m]eP\u000e@\u0017YiEV\u001f{k>\b\fE\u0017\u0006eP\u000b\u0015v\rm\u0002Zx";
        objectArray[23] = "\u007fQFf_3 \u0006SX\u0004T)V]4X.y\u0007Y`=n\"\u0001\u00055\\e*STX";
        objectArray[24] = "\u0000-|\u0018\u001a\"D}c\u0012d+}\u0013-\u001d\u000b)@#iM\u0014#";
        objectArray[25] = "\tc>I0\u0002M3!CN\u000b[]`O0]\t#1\n3]";
        objectArray[26] = "\u000f\tt\u000b/\u0012P^a5tu\n[jR3\u0012ZB5L";
        objectArray[27] = "{\u001a<#j{~\u001c:c\u0011h&\u001ecsF?xM>\u001f/`{\r}~po\u007fK";
        objectArray[28] = "es\u0017S]B .\u001d\u0018!J?!\u001fEv\u001dn|E)\u001aZ#u\u0018C\u001cI=%";
        objectArray[29] = "\u0012\nyKbHM]lu?/D\rb\u0019eU\u0014\\fM\u0000\u0015OZ:\u0018a\u001eG\bku";
        objectArray[30] = "$\u0001A\u0011q\u001b\"\u0012_A\u0012\u0014r\u0003\\O~&%D\u0000\u0018+q&\u0014\\Ol\u0016v\r\u0003Q\u0012K~\u0016\u0001Es@vDP(";
        objectArray[31] = "XY=$*n\u0007\u000e(\u001ap\tXY=$*n\u0007\u000e(";
        objectArray[32] = "\u001462*fy\u001104j\u001djI2mzJ=\u0016n1\u0016&;D%upcfNn";
        objectArray[33] = "N9\u0017\u001c/e\u0011n\u0002\"v\u0002Ok\u0013N.h\u0011`\u0014@";
        objectArray[34] = "h\\>)(Z,\f!#VS\rbm{mV-\u001fh}k\u0016";
        objectArray[35] = "\u0004;W\u001c\u0003K[lB\"\\,\u0005iSN\u0002F[bT@";
        objectArray[36] = "\u0007\u0019JW+\u0018\u001c@M[LYn@EY+\u0016\t\u0010\\\u00065h";
        Object[] objectArray2 = objectArray;
        objectArray[37] = "78k\u0015?{f}h\u0015\u00018\u0006o+\u001fm`|?z\u001b9\u0005oeq\u0014fut<v\u0018\u0001";
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
            if (c == '\u00a2' || c == '\u00d9' || c == 'p' || c == 'c') {
                field = _8.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a2' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d9' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'p' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _8.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c7' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ea' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _8.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _8.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x2B5D;
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
                throw new RuntimeException("dev/krypton/8", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _8.c[n2] = n3;
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
            case 0 -> 17;
            case 1 -> 35;
            case 2 -> 4;
            case 3 -> 36;
            case 4 -> 52;
            case 5 -> 59;
            case 6 -> 0;
            case 7 -> 45;
            case 8 -> 21;
            case 9 -> 3;
            case 10 -> 23;
            case 11 -> 26;
            case 12 -> 28;
            case 13 -> 39;
            case 14 -> 25;
            case 15 -> 49;
            case 16 -> 51;
            case 17 -> 16;
            case 18 -> 20;
            case 19 -> 56;
            case 20 -> 15;
            case 21 -> 58;
            case 22 -> 2;
            case 23 -> 44;
            case 24 -> 54;
            case 25 -> 46;
            case 26 -> 29;
            case 27 -> 34;
            case 28 -> 60;
            case 29 -> 10;
            case 30 -> 48;
            case 31 -> 53;
            case 32 -> 14;
            case 33 -> 22;
            case 34 -> 13;
            case 35 -> 55;
            case 36 -> 9;
            case 37 -> 27;
            case 38 -> 43;
            case 39 -> 50;
            case 40 -> 11;
            case 41 -> 18;
            case 42 -> 5;
            case 43 -> 63;
            case 44 -> 32;
            case 45 -> 57;
            case 46 -> 8;
            case 47 -> 37;
            case 48 -> 24;
            case 49 -> 33;
            case 50 -> 1;
            case 51 -> 7;
            case 52 -> 40;
            case 53 -> 47;
            case 54 -> 12;
            case 55 -> 62;
            case 56 -> 19;
            case 57 -> 61;
            case 58 -> 41;
            case 59 -> 42;
            case 60 -> 31;
            case 61 -> 6;
            case 62 -> 30;
            default -> 38;
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
        _8.f[n3] = new String(cArray);
        return n3;
    }

    public static int[] cfr_renamed_2() {
        return cfr_renamed_7;
    }

    public void cfr_renamed_6(Object[] objectArray) {
        int[] nArray;
        long l2;
        block14: {
            CallSite callSite;
            block13: {
                CallSite callSite2;
                block11: {
                    block12: {
                        l2 = (Long)objectArray[0];
                        l2 = a ^ l2;
                        _8.b("\u00d9", (Object)this, (boolean)_8.a("t", 9073, (long)(0x5F459C7B323CCB35L ^ l2)), 4836211473628137239L, (long)l2);
                        int[] nArray2 = _8.cfr_renamed_2();
                        _8.b("\u00d9", (Object)this, (boolean)_8.a("t", 9073, (long)(0x5F459C7B323CCB35L ^ l2)), 4836796793095255611L, (long)l2);
                        _8.b("\u00d9", (Object)this, (int)_8.a("t", 9073, (long)(0x5F459C7B323CCB35L ^ l2)), 4832713560609996580L, (long)l2);
                        _8.b("\u00d9", (Object)this, (int)_8.a("t", 9073, (long)(0x5F459C7B323CCB35L ^ l2)), 4832803132846983895L, (long)l2);
                        nArray = nArray2;
                        try {
                            try {
                                callSite2 = _8.b("p", 4832875742324723128L, (long)l2);
                                if (nArray != null) break block11;
                                if (_8.b("\u00a2", (Object)callSite2, 4832775906723897142L, (long)l2) == null) break block12;
                            }
                            catch (MatchException matchException) {
                                throw _8.a(matchException);
                            }
                            _8.b("\u00c7", (Object)_8.b("\u00a2", (Object)_8.b("\u00a2", (Object)_8.b("p", 4832875742324723128L, (long)l2), 4832775906723897142L, (long)l2), 4836384301641263946L, (long)l2), (boolean)false, 4836553847750697405L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw _8.a(matchException);
                        }
                    }
                    callSite2 = _8.b("p", 4832875742324723128L, (long)l2);
                }
                try {
                    try {
                        callSite = _8.b("\u00a2", (Object)callSite2, 4836734759712263309L, (long)l2);
                        if (nArray != null) break block13;
                        if (callSite == null) break block14;
                    }
                    catch (MatchException matchException) {
                        throw _8.a(matchException);
                    }
                    callSite = _8.b("\u00a2", (Object)_8.b("p", 4832875742324723128L, (long)l2), 4836734759712263309L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _8.a(matchException);
                }
            }
            _8.b("\u00c7", (Object)callSite, 4836011407381566808L, (long)l2);
        }
        try {
            if (l2 >= 0L && nArray != null) {
                _4w.cfr_renamed_8(new String[5]);
            }
        }
        catch (MatchException matchException) {
            throw _8.a(matchException);
        }
    }

    public static void cfr_renamed_7(int[] nArray) {
        cfr_renamed_7 = nArray;
    }

    @_3i_0
    public void cfr_renamed_9(_9o o) {
        block54: {
            _8 v28;
            long l2;
            long l3;
            block53: {
                Object object;
                block49: {
                    int[] nArray;
                    block50: {
                        block52: {
                            _8 v22;
                            long l4;
                            block51: {
                                block47: {
                                    block48: {
                                        block43: {
                                            block44: {
                                                block45: {
                                                    block46: {
                                                        boolean bl;
                                                        block41: {
                                                            CallSite callSite;
                                                            block42: {
                                                                _5D d;
                                                                _5D d2;
                                                                long l5;
                                                                block40: {
                                                                    long l6;
                                                                    block39: {
                                                                        long l7 = l3 = a ^ 0x4E5C17A02603L;
                                                                        l2 = l7 ^ 0x616C667A6C2L;
                                                                        l4 = l7 ^ 0x3CAF39C4386EL;
                                                                        l6 = l7 ^ 0x3688CEB5C78L;
                                                                        l5 = l7 ^ 0x2E7E16305F94L;
                                                                        nArray = _8.cfr_renamed_2();
                                                                        try {
                                                                            try {
                                                                                if (_8.b("\u00a2", (Object)this, -5512464968992819339L, (long)l3) != false && _8.b("\u00a2", (Object)_8.b("p", -5515867177800040998L, (long)l3), -5516031086997803180L, (long)l3) != null) break block39;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw _8.a(matchException);
                                                                            }
                                                                            return;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw _8.a(matchException);
                                                                        }
                                                                    }
                                                                    Object[] objectArray = new Object[2];
                                                                    objectArray[1] = _5D.class;
                                                                    objectArray[0] = l6;
                                                                    d2 = (_5D)((Object)_8.b("\u00c7", (Object)_8.b("\u00a2", (Object)_8.b("p", -5513233458082471762L, (long)l3), -5513114834494321397L, (long)l3), (Object)objectArray, -5516239803973947450L, (long)l3));
                                                                    try {
                                                                        d = d2;
                                                                        if (nArray != null) break block40;
                                                                        if (d == null) break block41;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw _8.a(matchException);
                                                                    }
                                                                    d = d2;
                                                                }
                                                                try {
                                                                    try {
                                                                        callSite = _8.b("\u00c7", (Object)d, -5516301526924475641L, (long)l3);
                                                                        if (nArray != null) break block42;
                                                                        if (callSite == false) break block41;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw _8.a(matchException);
                                                                    }
                                                                    Object[] objectArray = new Object[1];
                                                                    objectArray[0] = l5;
                                                                    callSite = _8.b("\u00c7", (Object)d2, (Object)objectArray, -5512504697407869324L, (long)l3);
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw _8.a(matchException);
                                                                }
                                                            }
                                                            try {
                                                                if (callSite != false) {
                                                                    _8.b("\u00c7", (Object)_8.b("\u00a2", (Object)_8.b("\u00a2", (Object)_8.b("p", -5515867177800040998L, (long)l3), -5516031086997803180L, (long)l3), -5513480155777361112L, (long)l3), (boolean)false, -5513387816004267553L, (long)l3);
                                                                    return;
                                                                }
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _8.a(matchException);
                                                            }
                                                        }
                                                        try {
                                                            bl = _8.b("\u00a2", (Object)_8.b("p", -5515867177800040998L, (long)l3), -5512876392955803772L, (long)l3) != null;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _8.a(matchException);
                                                        }
                                                        boolean bl2 = bl;
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        object = bl2;
                                                                        if (nArray != null) break block43;
                                                                        if (object == false) break block44;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw _8.a(matchException);
                                                                    }
                                                                    _8.b("\u00d9", (Object)this, (boolean)_8.a("t", 1565, (long)(0x6D42274C61259E3AL ^ l3)), -5513065745752062375L, (long)l3);
                                                                    _8.b("\u00c7", (Object)_8.b("\u00a2", (Object)_8.b("\u00a2", (Object)_8.b("p", -5515867177800040998L, (long)l3), -5516031086997803180L, (long)l3), -5513480155777361112L, (long)l3), (boolean)false, -5513387816004267553L, (long)l3);
                                                                    if (nArray != null) break block45;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw _8.a(matchException);
                                                                }
                                                                if (_8.b("\u00a2", (Object)_8.b("p", -5515867177800040998L, (long)l3), -5512988392212857617L, (long)l3) == null) break block46;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _8.a(matchException);
                                                            }
                                                            _8.b("\u00c7", (Object)_8.b("\u00a2", (Object)_8.b("p", -5515867177800040998L, (long)l3), -5512988392212857617L, (long)l3), -5512810393110256326L, (long)l3);
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _8.a(matchException);
                                                        }
                                                    }
                                                    _8.b("\u00d9", (Object)this, (int)_8.a("t", 18673, (long)(0x742DF1DB28E5D0D4L ^ l3)), -5515794366198793547L, (long)l3);
                                                }
                                                return;
                                            }
                                            object = _8.b("\u00a2", (Object)this, -5513065745752062375L, (long)l3);
                                        }
                                        try {
                                            try {
                                                if (nArray != null) break block47;
                                                if (object == false) break block48;
                                            }
                                            catch (MatchException matchException) {
                                                throw _8.a(matchException);
                                            }
                                            _8.b("\u00d9", (Object)this, (boolean)_8.a("t", 9073, (long)(0x5F45FA9C541F3B57L ^ l3)), -5513065745752062375L, (long)l3);
                                            _8.b("\u00d9", (Object)this, (int)_8.a("t", 25382, (long)(0x5BB8040162E9FB02L ^ l3)), -5515966679835947194L, (long)l3);
                                            _8.b("\u00c7", (Object)_8.b("\u00a2", (Object)_8.b("\u00a2", (Object)_8.b("p", -5515867177800040998L, (long)l3), -5516031086997803180L, (long)l3), -5513480155777361112L, (long)l3), (boolean)false, -5513387816004267553L, (long)l3);
                                            return;
                                        }
                                        catch (MatchException matchException) {
                                            throw _8.a(matchException);
                                        }
                                    }
                                    object = _8.b("\u00a2", (Object)this, -5515966679835947194L, (long)l3);
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                if (nArray != null) break block49;
                                                if (object <= 0) break block50;
                                            }
                                            catch (MatchException matchException) {
                                                throw _8.a(matchException);
                                            }
                                            _8 v21 = this;
                                            _8.b("\u00d9", (Object)v21, (int)(_8.b("\u00a2", (Object)v21, -5515966679835947194L, (long)l3) - true), -5515966679835947194L, (long)l3);
                                            _8.b("\u00c7", (Object)_8.b("\u00a2", (Object)_8.b("\u00a2", (Object)_8.b("p", -5515867177800040998L, (long)l3), -5516031086997803180L, (long)l3), -5513480155777361112L, (long)l3), (boolean)false, -5513387816004267553L, (long)l3);
                                            v22 = this;
                                            if (nArray != null) break block51;
                                        }
                                        catch (MatchException matchException) {
                                            throw _8.a(matchException);
                                        }
                                        if (_8.b("\u00a2", (Object)v22, -5515966679835947194L, (long)l3) != false) break block52;
                                    }
                                    catch (MatchException matchException) {
                                        throw _8.a(matchException);
                                    }
                                    v22 = this;
                                }
                                catch (MatchException matchException) {
                                    throw _8.a(matchException);
                                }
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l4;
                            _8.b("\u00c7", (Object)v22, (Object)objectArray, -5513411548505540022L, (long)l3);
                        }
                        return;
                    }
                    try {
                        _8.b("\u00c7", (Object)_8.b("\u00a2", (Object)_8.b("\u00a2", (Object)_8.b("p", -5515867177800040998L, (long)l3), -5516031086997803180L, (long)l3), -5513480155777361112L, (long)l3), (boolean)true, -5513387816004267553L, (long)l3);
                        _8 v27 = this;
                        _8.b("\u00d9", (Object)v27, (int)(_8.b("\u00a2", (Object)v27, -5515794366198793547L, (long)l3) + true), -5515794366198793547L, (long)l3);
                        v28 = this;
                        if (nArray != null) break block53;
                        object = _8.b("\u00a2", (Object)v28, -5515794366198793547L, (long)l3);
                    }
                    catch (MatchException matchException) {
                        throw _8.a(matchException);
                    }
                }
                try {
                    if (object < _8.a("t", 1108, (long)(0x530C3E16C9C89C76L ^ l3))) break block54;
                    _8.b("\u00d9", (Object)this, (int)_8.a("t", 9073, (long)(0x5F45FA9C541F3B57L ^ l3)), -5515794366198793547L, (long)l3);
                    _8.b("\u00d9", (Object)_8.b("p", -5515867177800040998L, (long)l3), 0, -5512929654740299139L, (long)l3);
                    v28 = this;
                }
                catch (MatchException matchException) {
                    throw _8.a(matchException);
                }
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l2;
            _8.b("\u00c7", (Object)v28, (Object)objectArray, -5512745191708713473L, (long)l3);
        }
    }

    private void cfr_renamed_9(Object[] objectArray) {
        block11: {
            CallSite callSite;
            long l2;
            block10: {
                CallSite callSite2;
                int[] nArray;
                block8: {
                    long l3;
                    block9: {
                        l2 = (Long)objectArray[0];
                        l3 = (l2 = a ^ l2) ^ 0x6C09D5E80BD4L;
                        nArray = _8.cfr_renamed_2();
                        try {
                            try {
                                callSite2 = _8.b("p", 2190400995919548620L, (long)l2);
                                if (nArray != null) break block8;
                                if (_8.b("\u00a2", (Object)callSite2, 2191991171042202105L, (long)l2) == null) break block9;
                            }
                            catch (MatchException matchException) {
                                throw _8.a(matchException);
                            }
                            _8.b("\u00c7", (Object)_8.b("\u00a2", (Object)_8.b("p", 2190400995919548620L, (long)l2), 2191991171042202105L, (long)l2), 2191276340481312812L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw _8.a(matchException);
                        }
                    }
                    _8.b("\u00d9", (Object)_8.b("p", 2190400995919548620L, (long)l2), 0, 2191082234733363051L, (long)l2);
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l3;
                    _8.b("\u00c7", (Object)this, (Object)objectArray2, 2191178702425567465L, (long)l2);
                    callSite2 = _8.b("p", 2190400995919548620L, (long)l2);
                }
                try {
                    try {
                        callSite = _8.b("\u00a2", (Object)callSite2, 2190285353077981762L, (long)l2);
                        if (nArray != null) break block10;
                        if (callSite == null) break block11;
                    }
                    catch (MatchException matchException) {
                        throw _8.a(matchException);
                    }
                    callSite = _8.b("\u00a2", (Object)_8.b("p", 2190400995919548620L, (long)l2), 2190285353077981762L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _8.a(matchException);
                }
            }
            _8.b("\u00c7", (Object)_8.b("\u00a2", (Object)callSite, 2191640162163111486L, (long)l2), (boolean)true, 2191820221828234441L, (long)l2);
        }
    }

    public void cfr_renamed_0(Object[] objectArray) {
        long l2;
        block8: {
            CallSite callSite;
            block7: {
                l2 = (Long)objectArray[0];
                long l3 = (l2 = a ^ l2) ^ 0x1128146A817EL;
                _8.b("\u00d9", (Object)this, (boolean)_8.a("t", 28372, (long)(0xF44101F6A1DD14BL ^ l2)), -7727089062726020919L, (long)l2);
                _8.b("\u00d9", (Object)this, (boolean)_8.a("t", 9073, (long)(0x5F45EDA286121CEBL ^ l2)), -7727701047134772763L, (long)l2);
                int[] nArray = _8.cfr_renamed_2();
                _8.b("\u00d9", (Object)this, (int)_8.a("t", 9073, (long)(0x5F45EDA286121CEBL ^ l2)), -7723868277873448710L, (long)l2);
                int[] nArray2 = nArray;
                try {
                    try {
                        _8.b("\u00d9", (Object)this, (int)_8.a("t", 9073, (long)(0x5F45EDA286121CEBL ^ l2)), -7723707438711202551L, (long)l2);
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l3;
                        _8.b("\u00c7", (Object)this, (Object)objectArray2, -7727371798534636989L, (long)l2);
                        callSite = _8.b("\u00a2", (Object)_8.b("p", -7723775372907455898L, (long)l2), -7723944058578089752L, (long)l2);
                        if (nArray2 != null) break block7;
                        if (callSite == null) break block8;
                    }
                    catch (MatchException matchException) {
                        throw _8.a(matchException);
                    }
                    callSite = _8.b("\u00a2", (Object)_8.b("p", -7723775372907455898L, (long)l2), -7723944058578089752L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _8.a(matchException);
                }
            }
            _8.b("\u00c7", (Object)_8.b("\u00a2", (Object)callSite, -7728115128663229292L, (long)l2), (boolean)true, -7728012305411836317L, (long)l2);
        }
        try {
            if (l2 >= 0L && _4w.cfr_renamed_8() == null) {
                _8.cfr_renamed_7(new int[1]);
            }
        }
        catch (MatchException matchException) {
            throw _8.a(matchException);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_8.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_8.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

