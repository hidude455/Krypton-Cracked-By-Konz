/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1657
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._32;
import dev.krypton._4r;
import dev.krypton._4w;
import dev.krypton._6X;
import dev.krypton._6x_0;
import dev.krypton._95;
import dev.krypton._9r;
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
import net.minecraft.class_1657;

public class _66
extends _6x_0 {
    public final _6X cfr_renamed_5;
    public final _9r cfr_renamed_9;
    public final _9r cfr_renamed_7;
    public final _9r cfr_renamed_6;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    public _66(short s, int n, char c) {
        long l2;
        long l3 = l2 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)c << 48 >>> 48) ^ b;
        long l4 = l3 ^ 0x2DAD9C2AC8BCL;
        long l5 = l3 ^ 0x3D102FE9C10CL;
        long l6 = l3 ^ 0x402E6A9DB05EL;
        long l7 = l3 ^ 0x6B28B8AA4965L;
        long l8 = l3 ^ 0x7947099BB3F7L;
        long l9 = l3 ^ 0x9DC915F195CL;
        long l10 = l3 ^ 0x74E82B8EA617L;
        super((int)_66.a("i", 16112, (long)(0x7B56AADA4D253537L ^ l2)), -1, (_4r)((Object)_66.c("\u00e3", -2285412719378543033L, (long)l2)), l7);
        Object[] objectArray = new Object[1];
        objectArray[0] = l4;
        this.cfr_renamed_5 = _66.c("A", (Object)new _6X(l8, (int)_66.a("i", 17565, (long)(0x5AD85F7391E4F5CL ^ l2)), new String[0]), (Object)objectArray, -2286087474862417205L, (long)l2);
        this.cfr_renamed_9 = new _9r((int)_66.a("i", 24541, (long)(0x35973A478746D418L ^ l2)), true, l5);
        int n2 = _32.cfr_renamed_4();
        try {
            this.cfr_renamed_7 = new _9r((int)_66.a("i", 14592, (long)(0x544D441D5E3932C4L ^ l2)), true, l5);
            this.cfr_renamed_6 = new _9r((int)_66.a("i", 13878, (long)(0x526BFDAB7D7ABDF0L ^ l2)), true, l5);
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l9;
            objectArray2[0] = true;
            _66.c("A", (Object)this, (Object)objectArray2, -2285176544992844481L, (long)l2);
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = new _95[]{_66.c("\u00d1", (Object)this, -2284500115327990283L, (long)l2), _66.c("\u00d1", (Object)this, -2285512467338066118L, (long)l2), _66.c("\u00d1", (Object)this, -2285363597169236874L, (long)l2), _66.c("\u00d1", (Object)this, -2285490468850555324L, (long)l2)};
            objectArray3[0] = l10;
            _66.c("A", (Object)this, (Object)objectArray3, -2285112277215480504L, (long)l2);
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = -1;
            objectArray4[0] = l6;
            _66.c("A", (Object)this, (Object)objectArray4, -2285270356781200662L, (long)l2);
            if (_4w.cfr_renamed_8() == null) {
                _32.cfr_renamed_6(++n2);
            }
        }
        catch (MatchException matchException) {
            throw _66.a(matchException);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                a.init(_66.class, 9);
                _66.b = l.a(-2218159978133196758L, 7762556406648677207L, MethodHandles.lookup().lookupClass()).a(130295822229115L);
                _66.j = new Object[36];
                _66.k = new String[36];
                _66.b();
                _66.f = new HashMap<K, V>(13);
                var0 = _66.b ^ 120724596595485L;
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
                var8_3 = new long[5];
                var5_4 = 0;
                var6_5 = "#\u00ba\u008b\u007f$\u0005\u0084\u0002\u0015\u0004\u00e6\u0017\u008b/\td\u00c1\u00c4\u0007]\u00b4\u001f\u00a9\u0084";
                var7_6 = "#\u00ba\u008b\u007f$\u0005\u0084\u0002\u0015\u0004\u00e6\u0017\u008b/\td\u00c1\u00c4\u0007]\u00b4\u001f\u00a9\u0084".length();
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
                    var6_5 = "\u00e9\u00a5\u008du-\f\u0015\u00ecG\u007f\u00c3\u00eb\u00e8ya\u00d1";
                    var7_6 = "\u00e9\u00a5\u008du-\f\u0015\u00ecG\u007f\u00c3\u00eb\u00e8ya\u00d1".length();
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
        _66.d = var8_3;
        _66.e = new Integer[5];
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
            case 1 -> 48;
            case 2 -> 13;
            case 3 -> 55;
            case 4 -> 4;
            case 5 -> 2;
            case 6 -> 11;
            case 7 -> 16;
            case 8 -> 27;
            case 9 -> 61;
            case 10 -> 34;
            case 11 -> 42;
            case 12 -> 12;
            case 13 -> 63;
            case 14 -> 44;
            case 15 -> 33;
            case 16 -> 29;
            case 17 -> 0;
            case 18 -> 62;
            case 19 -> 36;
            case 20 -> 24;
            case 21 -> 50;
            case 22 -> 30;
            case 23 -> 37;
            case 24 -> 58;
            case 25 -> 43;
            case 26 -> 35;
            case 27 -> 45;
            case 28 -> 18;
            case 29 -> 47;
            case 30 -> 38;
            case 31 -> 1;
            case 32 -> 53;
            case 33 -> 60;
            case 34 -> 7;
            case 35 -> 15;
            case 36 -> 25;
            case 37 -> 39;
            case 38 -> 46;
            case 39 -> 56;
            case 40 -> 17;
            case 41 -> 21;
            case 42 -> 57;
            case 43 -> 49;
            case 44 -> 14;
            case 45 -> 51;
            case 46 -> 22;
            case 47 -> 20;
            case 48 -> 59;
            case 49 -> 9;
            case 50 -> 32;
            case 51 -> 52;
            case 52 -> 19;
            case 53 -> 23;
            case 54 -> 28;
            case 55 -> 6;
            case 56 -> 31;
            case 57 -> 54;
            case 58 -> 3;
            case 59 -> 40;
            case 60 -> 5;
            case 61 -> 10;
            case 62 -> 41;
            default -> 8;
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
        _66.k[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d1' || c == '\u00fb' || c == '\u00e3' || c == 'o') {
                field = _66.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d1' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fb' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _66.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'A' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f6' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _66.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = "'zG\u000b2\u0006:oEJ7Zu)";
        objectArray[1] = "\u0002\u0010\u000e,W\u0010\u001f\u0005\fmRLP-";
        objectArray[2] = "bN\u0019@lW\u007f[\u001b\u0001i\u000b?Y";
        objectArray[3] = "pQx\u001a\u001b\u0001mDz[\u001e] F";
        objectArray[4] = "Oy7\u0018zGRl5Y\u007f\u001b\u001dd";
        objectArray[5] = "\u0003\u0013\u001c\b/#v3\u0017\u0007>l\u0017=\u001c\f:6c";
        objectArray[6] = Void.TYPE;
        _66.k[6] = "java/lang/Void";
        objectArray[7] = "21\u0017\u001a&\u0004G\u0011\u001c\u00157K&\u001f\u0017\u001e3\u0011R";
        objectArray[8] = ")kI[Zo\\KBTK =EI_OzI";
        objectArray[9] = "5Q\u001b\u0007\r\u0019@q\u0010\b\u001cV!\u007f\u001b\u0003\u0018\fU";
        objectArray[10] = "EFv\u0002I\u000b0f}\rXDQhv\u0006\\\u001e%";
        objectArray[11] = "8 P?A\u007fM\u0000[0P0,\u000eP;TjX";
        objectArray[12] = "\"N}>sz<Fgq\u0011f;[";
        objectArray[13] = " gJDge>oP\u000b:d8c]HgC>tYD$";
        objectArray[14] = "n(_5ftp Ez.tj*]='o*\u0019[1,hg(]1";
        objectArray[15] = Boolean.TYPE;
        _66.k[15] = "java/lang/Boolean";
        objectArray[16] = "q\u001aW|\u001a\u0016q\u001a@ \u0016\u0019kQ@>\u0016\fl \u0012dBH";
        objectArray[17] = "q/=z2Yq/*&>Vkd*8>Cl\u0015{ai\u0001";
        objectArray[18] = " 7\u00153#V+8\u0004|^N8?\r5";
        objectArray[19] = "AvDhYMJyU'8CArQ}";
        objectArray[20] = "m[\n|(]iY[\u0011i1&\u0001\u0004)3IgZ^,V\u0001pP^z8\nz^N\u0011";
        objectArray[21] = "x_\u001d\f\\;s]X\u0006-2/O&\u000fQ0)>R\u001e]c1N\u001c\u0014\u0016\"IW\u0011\u0006I##WR\u0014_[";
        objectArray[22] = "NP(d{<]\u0006b\u0007)\u0000WV'jnlSTv";
        objectArray[23] = "AB\u0005xx6\u0017ECf\u0017>SE\u0017al\u0012E^\u0019\u007fz\u0018CC\u0013\u0005|)QE\u0011`*.\u0017[~le3N@\u0014l&!X8";
        objectArray[24] = "T9K\u0012\t\\Go\u0001qY`\u000f#KLX]\u00079\u0010\u0010";
        objectArray[25] = "QY6sJ{B\u000f|\u0010\u001eG\nC6-\u001bz\u0002Ymq";
        objectArray[26] = "\u0012bRb\u0010\u0017\u00014\u0018\u0001G+IxR<A\u0016Ab\t`";
        objectArray[27] = " )\u000f%?e&&H)_G^\u0005x\u000f\u0003\f )\u000f%?e&&H)";
        objectArray[28] = "\u0017&*W\u001f\u0014Tk}WuS,&{\\M\tTg \u0006Hl\u0010w'\u0003\u000e\u0011M{#\u0001u";
        objectArray[29] = "g]R$!b$\u0010\u0005$K$\\]\u0003/s\u007f$\u001cXuv\u001a`\f_p0g=\u0000[rK";
        objectArray[30] = "_?%Lo\nT5+\\\u0004\u001f\u0013#\"Oad^81Lu\u0004U:tF\u0004";
        objectArray[31] = "w H.\r;4m\u001f.gzL \u0019%_&4aB\u007fZCpqEz\u001c>-}Axg";
        objectArray[32] = ";0IH>\u0015*2\u0015J@@<-\u0018\u0011,rlmGI@Na>A\t<\u0014+6Cv";
        objectArray[33] = "p~J(A#t|\u001bE\u0006O;$D}Z7z\u007f\u001ex?4j!\u0019;S0hpt";
        objectArray[34] = "\u0004W\u0003DL\u001bG\u001aTD&^?WRO\u001e\u0006G\u0016\t\u0015\u001bc\u0003\u0006\u000e\u0010]\u001e^\n\n\u0012&";
        Object[] objectArray2 = objectArray;
        objectArray[35] = "hT\u0007f&w2\u001e\u000fdYdn\u00183##je\u000bh4#p~\u000b\rb$6`d";
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
            throw new RuntimeException("dev/krypton/66" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l2, long l3) {
        int n = _66.e(l2, l3);
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
                clazz3 = _66.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _66.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _66.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _66.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _66.f(1365847814261181L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _66.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _66.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _66.f(1365847814261181L, 0L);
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
            int n = _66.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _66.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _66.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _66.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _66.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _66.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x6B8B;
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
                throw new RuntimeException("dev/krypton/66", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _66.e[n2] = n3;
        }
        return e[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/66" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _66.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field g(long l2, long l3) {
        int n = _66.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _66.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _66.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _66.c(clazz3, string2, clazz2)) != null) {
                    _66.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _66.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _66.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _66.f(1365847814261181L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public native void cfr_renamed_2();

    public boolean boolean_6(Object[] objectArray) {
        class_1657 class_16572 = (class_1657)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x7B1788018722L;
        long l5 = l3 ^ 0x6F2BBCA449CBL;
        CallSite callSite = _66.c("A", (Object)_66.c("A", (Object)class_16572, 9107432419544781393L, (long)l2), 9107685166577632064L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l5;
        return (boolean)_66.c("A", (Object)_66.c("A", (Object)_66.c("A", (Object)_66.c("\u00d1", (Object)this, 9109005759336995799L, (long)l2), (Object)objectArray2, 9108846412023286440L, (long)l2), 9109556094964576401L, (long)l2), arg_0 -> _66.cfr_renamed_8(l4, (String)((Object)callSite), arg_0), 9108882973694880959L, (long)l2);
    }

    private static boolean cfr_renamed_8(long l2, String string, String string2) {
        l2 = b ^ l2;
        return (boolean)_66.c("A", string2, (Object)string, 4897616543556049929L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_66.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_66.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

