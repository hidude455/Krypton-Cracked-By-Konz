/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_11909
 *  net.minecraft.class_1799
 *  net.minecraft.class_1935
 *  net.minecraft.class_437
 */
package dev.krypton;

import dev.krypton._02;
import dev.krypton._0v;
import dev.krypton._4t;
import dev.krypton._83;
import dev.krypton._87;
import dev.krypton._8B;
import dev.krypton._95;
import dev.krypton._9m_0;
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
import net.minecraft.class_11909;
import net.minecraft.class_1799;
import net.minecraft.class_1935;
import net.minecraft.class_437;

/*
 * Renamed from dev.krypton.0q
 */
public class _0q_0
extends _0v {
    private final _9m_0 cfr_renamed_2;
    private final _8B cfr_renamed_4;
    private final float cfr_renamed_9;
    private static final long a;
    private static final String c;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map i;
    private static final Object[] j;
    private static final String[] k;

    public _0q_0(_4t t, _95 var2_2, long l2, int n) {
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x136E24F56108L;
        int n2 = (int)(l4 >>> 48);
        int n3 = (int)(l4 << 16 >>> 32);
        int n4 = (int)(l4 << 48 >>> 48);
        long l5 = l3 ^ 0x3EB6A84C0665L;
        super((short)n2, t, var2_2, n, n3, (char)n4);
        this.cfr_renamed_4 = new _8B((int)_0q_0.a("y", 30071, (long)(0x5C718118CDAEA446L ^ l2)), l5, (int)_0q_0.a("y", 8591, (long)(0x75D328D7E4BC70BCL ^ l2)), (int)_0q_0.a("y", 5213, (long)(0x3946F9F1DFA44568L ^ l2)));
        this.cfr_renamed_9 = 4.0f;
        this.cfr_renamed_2 = (_9m_0)var2_2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                block12: {
                    _0q_0.a = l.a(-8010773468220364654L, -7914496522112471904L, MethodHandles.lookup().lookupClass()).a(206588078253976L);
                    _0q_0.j = new Object[50];
                    _0q_0.k = new String[50];
                    _0q_0.b();
                    var11 = _0q_0.a ^ 104069487831093L;
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
lbl16:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var15_3 = var13_1.doFinal("e(\rm9\u00bd,\u00d5".getBytes("ISO-8859-1"));
                ** while (true)
                _0q_0.c = _0q_0.a(var15_3).intern();
                _0q_0.i = new HashMap<K, V>(13);
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
                var6_6 = new long[9];
                var3_7 = 0;
                var4_8 = "\u008d\u0080Lf\u000e\u00f3\u00f7Y\u00b3W\u00d0I\u00b1\u00e9\u008eH\u0092\u00ccJ$v\u00c5yj\u00bf\u00e8d\u00c9\u00b0/!vfb\u0085cX\u00f2&p\u0081\u00f9 \u00f9VC~&\u0083\u001ff\u0004\u00e7\u00d1$\u00dd";
                var5_9 = "\u008d\u0080Lf\u000e\u00f3\u00f7Y\u00b3W\u00d0I\u00b1\u00e9\u008eH\u0092\u00ccJ$v\u00c5yj\u00bf\u00e8d\u00c9\u00b0/!vfb\u0085cX\u00f2&p\u0081\u00f9 \u00f9VC~&\u0083\u001ff\u0004\u00e7\u00d1$\u00dd".length();
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
lbl47:
                // 1 sources

                while (true) {
                    v6[v7] = v10;
                    if (var2_10 < var5_9) ** continue;
                    var4_8 = "o\u008d\u0091\u0098\u0019\t\u008d\u0087\u0005$bQ\u00e4\u00b9\u0095\u001c";
                    var5_9 = "o\u008d\u0091\u0098\u0019\t\u008d\u0087\u0005$bQ\u00e4\u00b9\u0095\u001c".length();
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
lbl60:
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
lbl73:
                // 1 sources

                ** continue;
            }
        }
        _0q_0.d = var6_6;
        _0q_0.e = new Integer[9];
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
            case 0 -> 59;
            case 1 -> 0;
            case 2 -> 11;
            case 3 -> 32;
            case 4 -> 4;
            case 5 -> 45;
            case 6 -> 28;
            case 7 -> 30;
            case 8 -> 9;
            case 9 -> 14;
            case 10 -> 60;
            case 11 -> 20;
            case 12 -> 16;
            case 13 -> 25;
            case 14 -> 27;
            case 15 -> 23;
            case 16 -> 54;
            case 17 -> 44;
            case 18 -> 19;
            case 19 -> 15;
            case 20 -> 33;
            case 21 -> 7;
            case 22 -> 38;
            case 23 -> 8;
            case 24 -> 43;
            case 25 -> 17;
            case 26 -> 49;
            case 27 -> 58;
            case 28 -> 21;
            case 29 -> 46;
            case 30 -> 3;
            case 31 -> 22;
            case 32 -> 55;
            case 33 -> 37;
            case 34 -> 47;
            case 35 -> 10;
            case 36 -> 31;
            case 37 -> 36;
            case 38 -> 62;
            case 39 -> 51;
            case 40 -> 48;
            case 41 -> 24;
            case 42 -> 34;
            case 43 -> 39;
            case 44 -> 2;
            case 45 -> 50;
            case 46 -> 57;
            case 47 -> 52;
            case 48 -> 41;
            case 49 -> 12;
            case 50 -> 13;
            case 51 -> 61;
            case 52 -> 42;
            case 53 -> 26;
            case 54 -> 53;
            case 55 -> 6;
            case 56 -> 35;
            case 57 -> 18;
            case 58 -> 29;
            case 59 -> 63;
            case 60 -> 40;
            case 61 -> 1;
            case 62 -> 5;
            default -> 56;
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
        _0q_0.k[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ed' || c == 'F' || c == 'r' || c == '\u00aa') {
                field = _0q_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ed' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'F' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'r' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _0q_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fb' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'w' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _0q_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = "6\u007f!)\u0015I6\u007f6u\u0019F,46k\u0019S+Ed6A\u0010a";
        objectArray[1] = Integer.TYPE;
        _0q_0.k[1] = "java/lang/Integer";
        objectArray[2] = "\u0012?\u001e4gA\u000f*\u001cub\u001dF,";
        objectArray[3] = "V\u000b\tk{?#+\u0002djpB%\ton*6";
        objectArray[4] = Boolean.TYPE;
        _0q_0.k[4] = "java/lang/Boolean";
        objectArray[5] = Double.TYPE;
        _0q_0.k[5] = "java/lang/Double";
        objectArray[6] = "Qg_'P\nLr]fUV\u0007";
        objectArray[7] = "\u001d@\r\u0007U\u001d\u001d@\u001a[Y\u0012\u0007\u000b\u001aEY\u0007\u0000zJ\u0018\b";
        objectArray[8] = "\\zsW#7\\zd\u000b/8F1d\u0015/-A@3Jy";
        objectArray[9] = Void.TYPE;
        _0q_0.k[9] = "java/lang/Void";
        objectArray[10] = "[a\u0013\u0017R\u0010Ft\u0011VWL\u000fu";
        objectArray[11] = "NJZYZpS_X\u0018_,\u0013B";
        objectArray[12] = "8ws\u001a\u0004O%bq[\u0001\u0013d%";
        objectArray[13] = "8#TUW\u007fM\u0003_ZF0,\rTQBjX";
        objectArray[14] = "7T^\u0000#\tBtU\u000f2F#z^\u00046\u001cW";
        objectArray[15] = "G\u00017{\u0014\u0006Z\u00145:\u0011Z\u001aQ";
        objectArray[16] = "\rx\u0004:u5xX\u000f5dz\u0019V\u0004>` m";
        objectArray[17] = "Gn~\\kfLao\u0013\u0016~_ffZ";
        objectArray[18] = "K.}e46>\u000evj%y_\u0000}a!#+";
        objectArray[19] = "L\u0004\u000ePO49$\u0005_^{X*\u000eTZ!,";
        objectArray[20] = "\u000enV\u00109\u0004\u000enAL5\u000b\u0014%AR5\u001e\u0013T\u0013\tm_";
        objectArray[21] = "mi\u0000jG\u000b\u0018I\u000beVDyG\u0000nR\u001e\r";
        objectArray[22] = "\u000f\u0015i^\u007fxz5bQn7\u001b;iZjmo";
        objectArray[23] = "En1<\b=En&`\u00042_%&~\u0004'XTt*Uf";
        objectArray[24] = "0\u0017\u0016\u00175H-\u0002\u0014V0\u0014l0";
        objectArray[25] = "DH\u0016mT,1h\u001dbEcPf\u0016iA9$";
        objectArray[26] = "&C7\u001a\u001aFSc<\u0015\u000b\t2m7\u001e\u000fSF";
        objectArray[27] = "\u001b'YSHgn\u0007R\\Y(\u000f\tYW]r{";
        objectArray[28] = "c\u0013\f\u0002=uh\u001c\u001dM\\{c\u0017\u0019\u0017";
        objectArray[29] = "\u00139vu5>\u001f>aiPg@G|m2=S+# 9\"#yfq<#R}'x7X";
        objectArray[30] = ")x\u000ee%\u001b\u007fy\u000e\u001f;Ko}\u0012s\t\u0019/'I\"^\u001f/`\u0011c`\u0019r!\u0017\u001f";
        objectArray[31] = "F)3ve\"N7&{\u001f(\u007f0&hzi\u0013okce\u0019Fm'nc'@0fh\u001f";
        objectArray[32] = "\u0007S'a .WE1wQmnB!r4 \u0002\u001dly+P\u0004^:m-)\u001e\u0013&.Q";
        objectArray[33] = "gKd\u0015\u001d\bkLs\txPWTs\u0013\u001d\u001e;\u000b>\u0018\u0002niNo\u001d\u0003\u001fm\u000ff\u0016x";
        objectArray[34] = "\u0011Q\u00123\u000be\u0011\u0018Nqy2.IPa\u001c~B\u0016\u001dj\u0003\u000eC\u0015Ue\u0007dENFoy";
        objectArray[35] = "6k\u001d\u0006\u007fV:l\n\u001a\u001a\f\u0006t\n\u0000\u007f@j+G\u000b`0=oI\u0006zY|vO[\u001a";
        objectArray[36] = "\u000fLP\"0\b\u0007RE/J\t6UE</CZ\n\b703\u000f\bD:6\r\tU\u0005<J";
        objectArray[37] = "P?nLoB\u0003}q@VG^nxI\u0001\u0019\u0006=&%;\u0014FebO=OUo";
        objectArray[38] = "PZ\fM6;XD\u0019@L=iC\u0019S)p\u0005\u001cTX6\u0000S^\u001eR(iPA\\NL";
        objectArray[39] = "\u0006\u001e`4\u0018gT\u0006;5z99\u001c1fAd\tL1=C";
        objectArray[40] = "W#n[I-_={V3(n:{EVf\u0002e6NI\u0016WgzCO(Q:;E3";
        objectArray[41] = "n>^[Y\\8?^!I\u00061#r\u001d\u001dPd[\u001e[\u001d\u000542_B\u001bXT";
        objectArray[42] = "t6\u0019\u0019-{|(\f\u0014W|MwL\u00183<sq\u0011Y5";
        objectArray[43] = "Dcy\u0005\u001bo\u0001!9\u0017{+#\u00189\u0007\u0003h\u0004t`N\u001by";
        objectArray[44] = "}N<.FC+O<TV\u0019\"S\u0010h\u0002Ov+|.\u0002\u001a'B=7\u0004GG";
        objectArray[45] = ".L\u001bc8W&R\u000enBS\u0017U\u000e}'\u001c{\nCv8l.\b\u000f{>R(UN}B";
        objectArray[46] = "o\u0004P\u001fBPc\u0003G\u0003'\u0006_\u001bG\u0019BF3D\n\u0012]6d\u0000\u0004\u001fG_%\u0019\u0002B'";
        objectArray[47] = "8Z\u0002jVm0D\u0017g,l\u0001B\u0001}\u001731\u0012\u0001&\u0015";
        objectArray[48] = "c[91<q:\u0012! @x2W!,,Jf\u0016yt@ <U?!;\".[%K~f?G::z'6LA";
        Object[] objectArray2 = objectArray;
        objectArray[49] = "\u0000V\\V9HRN\u0007W[\u0010?\u000b\u001eQk\\T\u000bW\r)";
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
            throw new RuntimeException("dev/krypton/0q" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l2, long l3) {
        int n = _0q_0.e(l2, l3);
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
                clazz3 = _0q_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _0q_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _0q_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _0q_0.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _0q_0.f(1994178898960454L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _0q_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _0q_0.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _0q_0.f(1994178898960454L, 0L);
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
            int n = _0q_0.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _0q_0.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _0q_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _0q_0.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _0q_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _0q_0.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x189E;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])i.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/0q", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _0q_0.e[n2] = n3;
        }
        return e[n2];
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0q" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _0q_0.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field g(long l2, long l3) {
        int n = _0q_0.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _0q_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _0q_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _0q_0.c(clazz3, string2, clazz2)) != null) {
                    _0q_0.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _0q_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _0q_0.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _0q_0.f(1994178898960454L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static class_437 net_minecraft_class_437_6(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        _9m_0 m_0 = (_9m_0)objectArray[1];
        long l3 = (l2 = a ^ l2) ^ 0x1944484D9360L;
        return new _83(m_0, l3);
    }

    @Override
    public void void_6(Object[] objectArray) {
        class_11909 class_119092;
        _0q_0 q_0;
        long l2;
        boolean bl;
        block6: {
            class_11909 class_119093;
            block7: {
                class_119093 = (class_11909)objectArray[0];
                bl = (Boolean)objectArray[1];
                long l3 = (Long)objectArray[2];
                long l4 = l3;
                long l5 = l4 ^ 0x2EFECB4CA11CL;
                long l6 = l4 ^ 0xA239397A5E5L;
                l2 = l4 ^ 0L;
                boolean bl2 = _02.cfr_renamed_3();
                try {
                    try {
                        try {
                            q_0 = this;
                            class_119092 = class_119093;
                            if (!bl2) break block6;
                            Object[] objectArray2 = new Object[3];
                            objectArray2[2] = l6;
                            objectArray2[1] = (double)_0q_0.c("\u00fb", (Object)class_119093, 5514499358026622232L, (long)l3);
                            objectArray2[0] = (double)_0q_0.c("\u00fb", (Object)class_119092, 5514152900705658777L, (long)l3);
                            if (_0q_0.c("\u00fb", (Object)q_0, (Object)objectArray2, 5514050069332042412L, (long)l3) == false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw _0q_0.a(matchException);
                        }
                        if (_0q_0.c("\u00fb", (Object)class_119093, 5515720913964173548L, (long)l3) != false) break block7;
                    }
                    catch (MatchException matchException) {
                        throw _0q_0.a(matchException);
                    }
                    _0q_0.c("\u00fb", (Object)_0q_0.c("r", 5514300914539056299L, (long)l3), (Object)new _83((_9m_0)((Object)_0q_0.c("\u00ed", (Object)this, 5512427421350097885L, (long)l3)), l5), 5512480323402834089L, (long)l3);
                }
                catch (MatchException matchException) {
                    throw _0q_0.a(matchException);
                }
            }
            q_0 = this;
            class_119092 = class_119093;
        }
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l2;
        objectArray3[1] = bl;
        objectArray3[0] = class_119092;
        super.void_6(objectArray3);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    protected void void_8(Object[] var1_1) {
        block7: {
            block6: {
                var7_2 = (_87)var1_1[0];
                var5_3 = (Integer)var1_1[1];
                var4_4 = (Integer)var1_1[2];
                var2_5 = (Long)var1_1[3];
                var6_6 = ((Float)var1_1[4]).floatValue();
                v0 = var2_5;
                var8_7 = v0 ^ 47222545303306L;
                var10_8 = v0 ^ 91869129438942L;
                var12_9 = v0 ^ 130073120665672L;
                var14_10 = v0 ^ 95709668128785L;
                var16_11 = v0 ^ 139830812653352L;
                var18_12 = v0 ^ 15242345130302L;
                var20_13 = v0 ^ 125588366951271L;
                var22_14 = v0 ^ 81897494890085L;
                var24_15 = v0 ^ 9380807438905L;
                var26_16 = v0 ^ 18328916035915L;
                var28_17 = v0 ^ 113975824667934L;
                v1 = new Object[1];
                v1[0] = var10_8;
                var34_18 = _0q_0.c("\u00fb", (Object)this, (Object)v1, (long)7740050160491856090L, (long)var2_5) + 5;
                v2 = new Object[1];
                v2[0] = var8_7;
                v3 = new Object[1];
                v3[0] = var22_14;
                v4 = new Object[1];
                v4[0] = var20_13;
                var35_19 = _0q_0.c("\u00fb", (Object)this, (Object)v2, (long)7740351735108015986L, (long)var2_5) + _0q_0.c("\u00fb", (Object)this, (Object)v3, (long)7739761894425975609L, (long)var2_5) + _0q_0.c("\u00ed", (Object)this, (long)7740202281441533874L, (long)var2_5) + _0q_0.c("\u00fb", (Object)this, (Object)v4, (long)7739395534071267376L, (long)var2_5) / 2;
                var33_20 = _02.cfr_renamed_3();
                var36_21 = var35_19 - _0q_0.a("y", (int)15883, (long)(6688732721539960317L ^ var2_5));
                v5 = new Object[1];
                v5[0] = var24_15;
                var37_22 = _0q_0.c("\u00fb", (Object)_0q_0.c("\u00ed", (Object)this, (long)7740655989151814705L, (long)var2_5), (Object)v5, (long)7739437568091755025L, (long)var2_5);
                var38_23 = (String)var37_22 + ":";
                v6 = new Object[5];
                v6[4] = _0q_0.c("r", (long)7740530620049028120L, (long)var2_5);
                v6[3] = (double)var36_21;
                v6[2] = (double)var34_18;
                v6[1] = var38_23;
                v6[0] = var14_10;
                _0q_0.c("\u00fb", (Object)var7_2, (Object)v6, (long)7739674450396316567L, (long)var2_5);
                var39_24 = (String)var37_22 + _0q_0.c;
                v7 = new Object[2];
                v7[1] = var12_9;
                v7[0] = var39_24;
                var40_25 = (double)var34_18 + _0q_0.c("\u00fb", (Object)var7_2, (Object)v7, (long)7740481563785877525L, (long)var2_5) + 5.0;
                var42_26 = _0q_0.a("y", (int)21799, (long)(7344244359560210139L ^ var2_5));
                var43_27 = _0q_0.a("y", (int)32752, (long)(2344540640126864392L ^ var2_5));
                var44_28 = var35_19 - var43_27 / 2;
                v8 = new Object[10];
                v8[9] = 4.0;
                v8[8] = 4.0;
                v8[7] = 4.0;
                v8[6] = 4.0;
                v8[5] = var16_11;
                v8[4] = (double)(var44_28 + var43_27);
                v8[3] = var40_25 + (double)var42_26;
                v8[2] = (double)var44_28;
                v8[1] = var40_25;
                v8[0] = _0q_0.c("\u00ed", (Object)this, (long)7739968483454854483L, (long)var2_5);
                _0q_0.c("\u00fb", (Object)var7_2, (Object)v8, (long)7739290136204695743L, (long)var2_5);
                v9 = new Object[1];
                v9[0] = var28_17;
                var45_29 = _0q_0.c("\u00fb", (Object)_0q_0.c("\u00ed", (Object)this, (long)7740655989151814705L, (long)var2_5), (Object)v9, (long)7739620982671800665L, (long)var2_5);
                try {
                    v10 = var45_29;
                    if (!var33_20) break block6;
                    if (v10 != null) {
                    }
                    ** GOTO lbl109
                }
                catch (MatchException v11) {
                    throw _0q_0.a(v11);
                }
                v10 = var45_29;
            }
            if (v10 == _0q_0.c("r", (long)7739804686073224132L, (long)var2_5)) ** GOTO lbl109
            var30_30 = var44_28 + 3;
            var31_31 = (int)(var40_25 + 3.0);
            var32_32 = new class_1799((class_1935)var45_29);
            try {
                v12 = new Object[4];
                v12[3] = (int)var30_30;
                v12[2] = var31_31;
                v12[1] = var32_32;
                v12[0] = var26_16;
                _0q_0.c("\u00fb", (Object)var7_2, (Object)v12, (long)7739573532570643097L, (long)var2_5);
                if (var2_5 <= 0L || var33_20) break block7;
lbl109:
                // 3 sources

                v13 = new Object[2];
                v13[1] = var12_9;
                v13[0] = "?";
                v14 = new Object[5];
                v14[4] = new _8B((int)_0q_0.a("y", (int)32507, (long)(5221532364475895046L ^ var2_5)), (int)_0q_0.a("y", (int)11381, (long)(5198858636527427471L ^ var2_5)), var18_12, (int)_0q_0.a("y", (int)11381, (long)(5198858636527427471L ^ var2_5)), (int)_0q_0.a("y", (int)14971, (long)(929849116403779973L ^ var2_5)));
                v14[3] = (double)(var44_28 + 4);
                v14[2] = var40_25 + (double)(var42_26 / 2) - 1.0 - _0q_0.c("\u00fb", (Object)var7_2, (Object)v13, (long)7740481563785877525L, (long)var2_5) / 2.0;
                v14[1] = "?";
                v14[0] = var14_10;
                _0q_0.c("\u00fb", (Object)var7_2, (Object)v14, (long)7739674450396316567L, (long)var2_5);
            }
            catch (MatchException v15) {
                throw _0q_0.a(v15);
            }
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_0q_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_0q_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

