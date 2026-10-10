/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  java.lang.MatchException
 */
package dev.krypton;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import dev.krypton._4w;
import dev.krypton._8j;
import dev.krypton._95;
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
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Renamed from dev.krypton.9k
 */
public class _9k_0
extends _95 {
    private final double cfr_renamed_6;
    private final double cfr_renamed_2;
    private final double cfr_renamed_7;
    private final double cfr_renamed_4;
    private final double cfr_renamed_0;
    private double cfr_renamed_9;
    private double cfr_renamed_8;
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final Object[] i;
    private static final String[] j;

    public void void_1(Object[] objectArray) {
        double d = (Double)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = (l2 = a ^ l2) ^ 0x7C13CC69FBB7L;
        double d2 = 1.0 / _9k_0.c("g", (Object)this, -1451827844841043741L, (long)l2);
        _9k_0.c("\u00eb", (Object)this, (double)((double)_9k_0.c("S", (double)(_9k_0.c("S", (double)_9k_0.c("g", (Object)this, -1450697222048596680L, (long)l2), (double)_9k_0.c("S", (double)_9k_0.c("g", (Object)this, -1450161940693222259L, (long)l2), (double)d, -1451219552992156274L, (long)l2), -1451055834662673362L, (long)l2) * d2), -1450538320961830789L, (long)l2) / d2), -1452304622399723415L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _9k_0.c("k", (Object)this, (Object)objectArray2, -1451212998911483254L, (long)l2);
    }

    public long long_1(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (long)_9k_0.c("g", (Object)this, 8138720253696798617L, (long)l2);
    }

    public _9k_0(int n, double d, double d2, double d3, double d4, long l2, double d5) {
        long l3 = (l2 = a ^ l2) ^ 0x600F6BBF0709L;
        int n2 = (int)(l3 >>> 48);
        int n3 = (int)(l3 << 16 >>> 32);
        int n4 = (int)(l3 << 48 >>> 48);
        super((short)n2, n, n3, n4);
        this.cfr_renamed_6 = d;
        this.cfr_renamed_2 = d2;
        String string = _8j.cfr_renamed_3();
        try {
            this.cfr_renamed_7 = d3;
            _9k_0.c("\u00eb", (Object)this, (double)d4, 4933094338788383518L, (long)l2);
            _9k_0.c("\u00eb", (Object)this, (double)d5, 4932423661371344834L, (long)l2);
            this.cfr_renamed_4 = d4;
            this.cfr_renamed_0 = d5;
            if (_4w.cfr_renamed_8() == null) {
                _8j.cfr_renamed_8("dA73T");
            }
        }
        catch (MatchException matchException) {
            throw _9k_0.a(matchException);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                _9k_0.a = l.a(3976615021688319016L, -2983656304128522104L, MethodHandles.lookup().lookupClass()).a(29349087125536L);
                _9k_0.i = new Object[59];
                _9k_0.j = new String[59];
                _9k_0.b();
                _9k_0.e = new HashMap<K, V>(13);
                var0 = _9k_0.a ^ 28575324476439L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[4];
                var7_4 = 0;
                var6_5 = "\u00808\u00a8\u000b\u00cdx\u00c0\u0094`\u00a4\u0011\u00a1SP\u00ea\u00e2\u0010\u00f1\u00c5\u0018M\u00c6\u00c1SB\u00bc\u007fc\u00dc1\\\u00be\u00f8";
                var8_6 = "\u00808\u00a8\u000b\u00cdx\u00c0\u0094`\u00a4\u0011\u00a1SP\u00ea\u00e2\u0010\u00f1\u00c5\u0018M\u00c6\u00c1SB\u00bc\u007fc\u00dc1\\\u00be\u00f8".length();
                var5_7 = 16;
                var4_8 = -1;
lbl23:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = _9k_0.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00a0V\u009a\u00b0l\u0090?Q\u00aa\u0017\u0018\u00eb\u00e8_\u00a2\\\u0010\u0090\u0012\u0087\u00a3\u00ef\u008eM\u00a5\u00cc\u008ac\u0001I\u00e6?Y";
                    var8_6 = "\u00a0V\u009a\u00b0l\u0090?Q\u00aa\u0017\u0018\u00eb\u00e8_\u00a2\\\u0010\u0090\u0012\u0087\u00a3\u00ef\u008eM\u00a5\u00cc\u008ac\u0001I\u00e6?Y".length();
                    var5_7 = 16;
                    var4_8 = -1;
lbl37:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl42:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = _9k_0.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl54:
                // 1 sources

                ** continue;
            }
        }
        _9k_0.c = var9_3;
        _9k_0.d = new String[4];
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (j[n3] != null) {
            return n3;
        }
        Object object = i[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 40;
            case 1 -> 0;
            case 2 -> 46;
            case 3 -> 23;
            case 4 -> 34;
            case 5 -> 7;
            case 6 -> 48;
            case 7 -> 61;
            case 8 -> 13;
            case 9 -> 29;
            case 10 -> 9;
            case 11 -> 59;
            case 12 -> 63;
            case 13 -> 47;
            case 14 -> 24;
            case 15 -> 36;
            case 16 -> 18;
            case 17 -> 52;
            case 18 -> 39;
            case 19 -> 33;
            case 20 -> 45;
            case 21 -> 58;
            case 22 -> 55;
            case 23 -> 26;
            case 24 -> 3;
            case 25 -> 60;
            case 26 -> 21;
            case 27 -> 35;
            case 28 -> 1;
            case 29 -> 53;
            case 30 -> 28;
            case 31 -> 10;
            case 32 -> 8;
            case 33 -> 56;
            case 34 -> 6;
            case 35 -> 42;
            case 36 -> 2;
            case 37 -> 37;
            case 38 -> 38;
            case 39 -> 32;
            case 40 -> 16;
            case 41 -> 62;
            case 42 -> 20;
            case 43 -> 41;
            case 44 -> 17;
            case 45 -> 49;
            case 46 -> 54;
            case 47 -> 19;
            case 48 -> 43;
            case 49 -> 31;
            case 50 -> 22;
            case 51 -> 27;
            case 52 -> 44;
            case 53 -> 30;
            case 54 -> 15;
            case 55 -> 12;
            case 56 -> 5;
            case 57 -> 4;
            case 58 -> 11;
            case 59 -> 25;
            case 60 -> 50;
            case 61 -> 14;
            case 62 -> 51;
            default -> 57;
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
        _9k_0.j[n3] = new String(cArray);
        return n3;
    }

    public double double_9(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (double)_9k_0.c("g", (Object)this, 4280295411695085893L, (long)l2);
    }

    private static void b() {
        Object[] objectArray = i;
        i[0] = "K\\/xV\bVI-9ST\u0016R";
        objectArray[1] = Double.TYPE;
        _9k_0.j[1] = "java/lang/Double";
        objectArray[2] = "\u007fA\u0013wp%aI\t8\f1{D\n{";
        objectArray[3] = "*C?V#'_c4Y2h>m?R62J";
        objectArray[4] = "\t9_so<|\u0019T|~s\u001d\u0017_wz)i";
        objectArray[5] = "ne\u000ei\u0014\u0013\u001bE\u0005f\u0005\\zK\u000em\u0001\u0006\u000e";
        objectArray[6] = Float.TYPE;
        _9k_0.j[6] = "java/lang/Float";
        objectArray[7] = "#GDde\u001dVgOktR7iD`p\bC";
        objectArray[8] = "\u0014O!V\u0015L\u001f@0\u0019vA\nF";
        objectArray[9] = Long.TYPE;
        _9k_0.j[9] = "java/lang/Long";
        objectArray[10] = "Nx5~F:Sm7?Cf\u0013(";
        objectArray[11] = "d\u007f\n2\u001bg\u0011_\u0001=\n(pQ\n6\u000er\u0004";
        objectArray[12] = Void.TYPE;
        _9k_0.j[12] = "java/lang/Void";
        objectArray[13] = "ufd\nz\tyneA3\u0001efg\nW\u0015ygFFw\u0003u}";
        objectArray[14] = "u7U`5Y~8D/HAm?Mf";
        objectArray[15] = Boolean.TYPE;
        _9k_0.j[15] = "java/lang/Boolean";
        objectArray[16] = "\b@t\\\u0016f}`\u007fS\u0007)\u001cntX\u0003sh";
        objectArray[17] = "\u0016.!Tu\u0013c\u000e*[d\\\u0002\u0000!P`\u0006v";
        objectArray[18] = "QaKD$g]iJ\u000fmoAaHD\t{]`c\u0006&eW`R";
        objectArray[19] = "Yl6^c\u0014,L=Qr[MB6Zv\u00019";
        objectArray[20] = "\u0006[\"|Wcs{)sF,\u0012u\"xBvf";
        objectArray[21] = "iN\u001cS?bbA\r\u001cUavM\u0006W";
        objectArray[22] = "a0H+/\u001dj?YdO\u0004f3[8";
        objectArray[23] = "\u0001c\u0000:1+tC\u000b5 d\u0015M\u0000>$>a";
        objectArray[24] = Integer.TYPE;
        _9k_0.j[24] = "java/lang/Integer";
        objectArray[25] = "uw55%\u007f\u0000W>:40aY510j\u0015";
        objectArray[26] = "oVuL(\u0016dYd\u0003I\u0018oR`Y";
        objectArray[27] = "+`p\u001d\\\u0019u2w|\u001d)$yr\u001b\u001f\u0015:3sC&\u0015)7#@YM-8+|";
        objectArray[28] = "&R6:)3.^ /X;r^8\u0014?;p.z7f0mAy5:6\u001f\u0010#n5/p\u0013!23]!Iz=*2\"K&;X";
        objectArray[29] = "\u0002ck\u001a\tz\\1l{CJ\rzi\u001cJv\u00130hDs3\u0007h6\u0005\u0017q\fmS";
        objectArray[30] = "T~\n@\u0010E\n,\r!Tu[g\bFSIE-\t\u001ejK\\)_S\u0005H^uY!";
        objectArray[31] = "\u0014=nf\u001dx\u001c1xslp@1`B\bqD=\u001c0\u0001(F}ch\u0005'NA aR}\u0011>xe]u-}q2\u0007*R%u=\u000f\u0016";
        objectArray[32] = "o\u001dE\fgn1OBm&^y\u001e\u001f\bc:;\u0015\u001a";
        objectArray[33] = "\r\u0002\u001f\u001f*\r\u001a\b\u001c\u0012O\u0017\t\u0017\u0007\u0012\b\u0007`\n\u0010\u001d*\u0017\u0004H\u001b\u0018O\u0004\u0011\u0016\u001a\u001a+\u0013\u001b\u0015\u0017\u007f";
        objectArray[34] = "?G\u0002\u0001bO\u007f\u000f\u0004\u0017YUeJ\u001b\u001fYVhU\u0018\r=\u0014cP}M>\u0011oE\u0012N<Mi7";
        objectArray[35] = "j?#\\Wr4m$=\u0012B|<yXS&>7|";
        objectArray[36] = "N_;\u0013\"\u001a\u0010\r<ra*AF9\u0015a\u0016_\f8MX\u001aYI8\b%NGVxr";
        objectArray[37] = "]\u0017\u0012g-Y\u0003E\u0015\u0006giK\u0014Hc)\r\t\u001fM";
        objectArray[38] = "\u0019:\u001cic\u001eIwB2X\u001dDk!\"?\fE}\u0005)XEZiA8gJSf\u001bX6\u0012OeD*f\u0011R<yh \u000b\u0013}\u0004<>\u0014S\u0007";
        objectArray[39] = "U~)\u0017p\u0017\u000b,.v4'C}s\u0013tC\u0001vv";
        objectArray[40] = "N\u0003\u001c\"&9\u000eK\u001a4\u001d<\u0012\u0015c)w;\u0016\r\u0007k|>s\n\t2x'\u0017H\u00027\u001d \u0019\u0011\u0006.yb\u0012\u0014c";
        objectArray[41] = "\u000eXR5\u001b\u0001A\u000b\u00123g\n1W\\0\u0000\b\rI\u00161X1\u0001OS1\u001dLUQLqg";
        objectArray[42] = "+=\u000e\\Q-x`QB,'*y&In3 c(XN%,yo\u0003\u0011-v>\u0005S\\s-\u0005";
        objectArray[43] = "s#\u0017[UW3k\u0011MnR'#hP\u0004U+-\f\u0012\u000fPN*\u0002K\u000bI*h\tNnN$1\rW\n\f/4h";
        objectArray[44] = "rG\f.+1!\u001aS0V;s\u0003$;\u001a3c\u0015\t-V-t\u001d\b>2o\u007f\u0018m";
        objectArray[45] = "\u0017VdW u\u001fZrBQ}CZjq6fDN{=(qLOhYjzI*oW3~PN-\\6\u001bW@tX/\u007f\u0015Kq=";
        objectArray[46] = "5+!GkDef\u007f\u001cPNmmDG\"@<v{H+Of\u0016-\u00114W\u007f|4\u0017k\u0012\u0004";
        objectArray[47] = "_W3\u0015n9\u0001\u00054t-\tPN1\u0013-5N\u00040K\u00147W\u0000f\u0006{4U\\`t";
        objectArray[48] = "qOI4P)/\u001dNU\u0016\u0019gL\u00130T}%G\u0016";
        objectArray[49] = "6\u000b}9V<hYzX\u0014\f9\u0012\u007f?\u00150'X~g,u3\u0000 &H78\u0005E";
        objectArray[50] = "UB'\fi\u001c\u000b\u0010 m+,Z[%\n*\u0010D\u0011$R\u0013\u001cBT$\u0017nH\\Kdm";
        objectArray[51] = "\u001c\u007fw`A4B-p\u0001\u0007\u0004\u0013fuf\u00028\r,t>;d\u001ak\"{F`\bu#\u0001";
        objectArray[52] = "}4YM\u0010,u8OXa$)8Wf\u0007>D(BZ\f89,PD\rB$!VJ\u001b? 3HKa\"-5F]\u001c&?+G'";
        objectArray[53] = "'\u0001\u0006)[\u001et\\Y7&\u001a0{\u001c @<![\n,Z{\"^\u0003>]\u0011;X\\{&";
        objectArray[54] = "C\n\u0004w%1\u001dX\u0003\u0016g\u0001L\u0013\u0006qf=RY\u0007)_=A]W* eER_\u0016";
        objectArray[55] = "JdP-gw\u001a)\u000ev\\r\u0016%5-.sC9\n\"'|\u0019YY$=s\u0006<\nybm{";
        objectArray[56] = "KvI7\f\u001c\u0015$NVN,DoK1O\u0010Z%JivLMb\u001c,\u000bH_|\u001dV";
        objectArray[57] = "\"k$~\u0014&|9#\u001fS\u00164h~z\u0010rvc{";
        Object[] objectArray2 = objectArray;
        objectArray[58] = "\u001f=t`\b;Aos\u0001J\u000b\t>.d\foK5+";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'g' || c == '\u00eb' || c == 'n' || c == '\u00db') {
                field = _9k_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'g' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00eb' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'n' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _9k_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'k' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'S' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _9k_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
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

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/9k" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l2, long l3) {
        int n = _9k_0.e(l2, l3);
        Object object = i[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = j[n];
                int n3 = string2.indexOf(8);
                clazz3 = _9k_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _9k_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _9k_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _9k_0.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _9k_0.f(1883139191311243L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _9k_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _9k_0.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _9k_0.f(1883139191311243L, 0L);
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
            int n = _9k_0.e(l2, l3);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                _9k_0.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _9k_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _9k_0.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _9k_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _9k_0.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x59D6;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l3 = Thread.currentThread().threadId();
                objectArray = (Object[])e.get(l3);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l3, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/9k", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l2 >>> 56);
            for (int j = 1; j < 8; ++j) {
                byArray[j] = (byte)(l2 << j * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            _9k_0.d[n2] = _9k_0.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/9k" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _9k_0.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
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

    private static Field g(long l2, long l3) {
        int n = _9k_0.e(l2, l3);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = _9k_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _9k_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _9k_0.c(clazz3, string2, clazz2)) != null) {
                    _9k_0.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _9k_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _9k_0.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _9k_0.f(1883139191311243L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public float float_0(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (float)_9k_0.c("g", (Object)this, -6042165505955974322L, (long)l2);
    }

    public int int_0(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (int)_9k_0.c("g", (Object)this, -3095143880575202720L, (long)l2);
    }

    public void void_0(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        double d = (Double)objectArray[1];
        long l3 = (l2 = a ^ l2) ^ 0x5632BA35450CL;
        double d2 = 1.0 / _9k_0.c("g", (Object)this, 6152260572934452824L, (long)l2);
        _9k_0.c("\u00eb", (Object)this, (double)((double)_9k_0.c("S", (double)(_9k_0.c("S", (double)_9k_0.c("g", (Object)this, 6153391198883611523L, (long)l2), (double)_9k_0.c("S", (double)_9k_0.c("g", (Object)this, 6153279680174408246L, (long)l2), (double)d, 6153906795029044021L, (long)l2), 6154162609411119765L, (long)l2) * d2), 6153479722021306048L, (long)l2) / d2), 6153580133620238862L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _9k_0.c("k", (Object)this, (Object)objectArray2, 6154005433275063345L, (long)l2);
    }

    public double double_0(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (double)_9k_0.c("g", (Object)this, 618612100082735102L, (long)l2);
    }

    public long long_6(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (long)_9k_0.c("g", (Object)this, -2558472620883845169L, (long)l2);
    }

    public double double_6(Object[] objectArray) {
        CallSite callSite;
        block4: {
            long l2;
            long l3;
            block5: {
                l3 = (Long)objectArray[0];
                long l4 = l3 = a ^ l3;
                long l5 = l4 ^ 0x6AD67F0FE3EEL;
                l2 = l4 ^ 0x4A9FFD60FE6CL;
                String string = _8j.cfr_renamed_3();
                try {
                    try {
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l5;
                        callSite = _9k_0.c("k", (Object)this, (Object)objectArray2, -140662849728825121L, (long)l3);
                        if (string != null) break block4;
                        Object[] objectArray3 = new Object[1];
                        objectArray3[0] = l2;
                        if (!(callSite > _9k_0.c("k", (Object)this, (Object)objectArray3, -142057126306734930L, (long)l3))) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _9k_0.a(matchException);
                    }
                    Object[] objectArray4 = new Object[1];
                    objectArray4[0] = l2;
                    Object[] objectArray5 = new Object[1];
                    objectArray5[0] = l5;
                    return (double)_9k_0.c("k", (Object)new Random(), (double)_9k_0.c("k", (Object)this, (Object)objectArray4, -142057126306734930L, (long)l3), (double)_9k_0.c("k", (Object)this, (Object)objectArray5, -140662849728825121L, (long)l3), -144001600985451324L, (long)l3);
                }
                catch (MatchException matchException) {
                    throw _9k_0.a(matchException);
                }
            }
            Object[] objectArray6 = new Object[1];
            objectArray6[0] = l2;
            callSite = _9k_0.c("k", (Object)this, (Object)objectArray6, -142057126306734930L, (long)l3);
        }
        return (double)callSite;
    }

    public double double_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (double)_9k_0.c("g", (Object)this, 7385746291553207622L, (long)l2);
    }

    public float float_3(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (float)_9k_0.c("g", (Object)this, -5516545773203640128L, (long)l2);
    }

    public double double_3(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (double)_9k_0.c("g", (Object)this, 8382289894775513857L, (long)l2);
    }

    public int int_4(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (int)_9k_0.c("g", (Object)this, -7870463089468075657L, (long)l2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean boolean_5(Object[] objectArray) {
        reference v0;
        block8: {
            String string;
            block6: {
                String string2;
                block7: {
                    long l2 = (Long)objectArray[0];
                    string2 = _8j.cfr_renamed_3();
                    try {
                        try {
                            reference v0 = _9k_0.c("g", (Object)this, 6339276754434902162L, (long)l2) - _9k_0.c("g", (Object)this, 6341000896169936348L, (long)l2);
                            v0 = v0 == 0 ? 0 : (v0 > 0 ? 1 : -1);
                            string = string2;
                            if (l2 <= 0L) break block6;
                            if (string != null) break block7;
                            if (v0 != false) break block8;
                        }
                        catch (MatchException matchException) {
                            throw _9k_0.a(matchException);
                        }
                        reference v0 = _9k_0.c("g", (Object)this, 6340787465204683854L, (long)l2) - _9k_0.c("g", (Object)this, 6338838614576274665L, (long)l2);
                        v0 = v0 == 0 ? 0 : (v0 > 0 ? 1 : -1);
                    }
                    catch (MatchException matchException) {
                        throw _9k_0.a(matchException);
                    }
                }
                string = string2;
            }
            if (string != null) return (boolean)v0;
            if (v0 == false) {
                v0 = (reference)true;
                return (boolean)v0;
            }
        }
        v0 = (reference)false;
        return (boolean)v0;
    }

    public int int_5(Object[] objectArray) {
        CallSite callSite;
        block4: {
            long l2;
            long l3;
            block5: {
                l3 = (Long)objectArray[0];
                long l4 = l3 = a ^ l3;
                long l5 = l4 ^ 0x448A51BD115BL;
                long l6 = l4 ^ 0x64C3D3D20CD9L;
                l2 = l4 ^ 0x73A4A975D147L;
                long l7 = l4 ^ 0x792E79B1968CL;
                String string = _8j.cfr_renamed_3();
                try {
                    try {
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l5;
                        Object[] objectArray3 = new Object[1];
                        objectArray3[0] = l6;
                        reference cfr_temp_0 = _9k_0.c("k", (Object)this, (Object)objectArray2, 916884662064990826L, (long)l3) - _9k_0.c("k", (Object)this, (Object)objectArray3, 914900979606777371L, (long)l3);
                        callSite = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                        if (string != null) break block4;
                        if (callSite <= 0) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _9k_0.a(matchException);
                    }
                    Object[] objectArray4 = new Object[1];
                    objectArray4[0] = l2;
                    Object[] objectArray5 = new Object[1];
                    objectArray5[0] = l7;
                    return (int)_9k_0.c("k", (Object)new Random(), (int)_9k_0.c("k", (Object)this, (Object)objectArray4, 914296277030358549L, (long)l3), (int)_9k_0.c("k", (Object)this, (Object)objectArray5, 915056680214930313L, (long)l3), 915142706495637842L, (long)l3);
                }
                catch (MatchException matchException) {
                    throw _9k_0.a(matchException);
                }
            }
            Object[] objectArray6 = new Object[1];
            objectArray6[0] = l2;
            callSite = _9k_0.c("k", (Object)this, (Object)objectArray6, 914296277030358549L, (long)l3);
        }
        return (int)callSite;
    }

    public double double_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (double)_9k_0.c("g", (Object)this, -6607849296124054870L, (long)l2);
    }

    @Override
    public void void_7(Object[] objectArray) {
        block12: {
            CallSite callSite;
            CallSite callSite2;
            long l2;
            long l3;
            long l4;
            block13: {
                JsonElement jsonElement;
                String string;
                block11: {
                    JsonElement jsonElement2 = (JsonElement)objectArray[0];
                    l4 = (Long)objectArray[1];
                    long l5 = l4;
                    l3 = l5 ^ 0x41B25FDDB635L;
                    l2 = l5 ^ 0x6B932981088EL;
                    string = _8j.cfr_renamed_3();
                    try {
                        try {
                            jsonElement = jsonElement2;
                            if (string != null) break block11;
                            if (_9k_0.c("k", (Object)jsonElement, -1463831808763966410L, (long)l4) == false) break block12;
                        }
                        catch (MatchException matchException) {
                            throw _9k_0.a(matchException);
                        }
                        jsonElement = jsonElement2;
                    }
                    catch (MatchException matchException) {
                        throw _9k_0.a(matchException);
                    }
                }
                callSite2 = _9k_0.c("k", (Object)jsonElement, -1465735629918109980L, (long)l4);
                try {
                    try {
                        callSite = _9k_0.c("k", (Object)callSite2, (Object)_9k_0.a("d", 9349, (long)(0x37DE314D827416F1L ^ l4)), -1465442365049616758L, (long)l4);
                        if (l4 < 0L || string != null) break block13;
                        if (callSite == false) break block12;
                    }
                    catch (MatchException matchException) {
                        throw _9k_0.a(matchException);
                    }
                    callSite = _9k_0.c("k", (Object)callSite2, (Object)_9k_0.a("d", 476, (long)(0x1B15FF9C604433A9L ^ l4)), -1465442365049616758L, (long)l4);
                }
                catch (MatchException matchException) {
                    throw _9k_0.a(matchException);
                }
            }
            try {
                if (callSite != false) {
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = (double)_9k_0.c("k", (Object)_9k_0.c("k", (Object)callSite2, (Object)_9k_0.a("d", 14678, (long)(0x50352E5A939A8B20L ^ l4)), -1463706178625491604L, (long)l4), -1465610602313363242L, (long)l4);
                    objectArray2[0] = l3;
                    _9k_0.c("k", (Object)this, (Object)objectArray2, -1464033678091203605L, (long)l4);
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l2;
                    objectArray3[0] = (double)_9k_0.c("k", (Object)_9k_0.c("k", (Object)callSite2, (Object)_9k_0.a("d", 12556, (long)(0x1ADF5EFEC53D037BL ^ l4)), -1463706178625491604L, (long)l4), -1465610602313363242L, (long)l4);
                    _9k_0.c("k", (Object)this, (Object)objectArray3, -1465040890308306968L, (long)l4);
                }
            }
            catch (MatchException matchException) {
                throw _9k_0.a(matchException);
            }
        }
    }

    public double double_7(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (double)_9k_0.c("g", (Object)this, -222257685877442565L, (long)l2);
    }

    public float float_7(Object[] objectArray) {
        _9k_0 k_0;
        long l2;
        long l3;
        block4: {
            block5: {
                l3 = (Long)objectArray[0];
                long l4 = l3 = a ^ l3;
                long l5 = l4 ^ 0xFB9CC8FE9E8L;
                l2 = l4 ^ 0xD18C1D1F6BAL;
                long l6 = l4 ^ 0x74003EE4F88L;
                long l7 = l4 ^ 0x27098181520AL;
                String string = _8j.cfr_renamed_3();
                try {
                    try {
                        k_0 = this;
                        if (string != null) break block4;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l6;
                        Object[] objectArray3 = new Object[1];
                        objectArray3[0] = l7;
                        if (!(_9k_0.c("k", (Object)k_0, (Object)objectArray2, 5938610135804941497L, (long)l3) > _9k_0.c("k", (Object)this, (Object)objectArray3, 5936063569434849480L, (long)l3))) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _9k_0.a(matchException);
                    }
                    Object[] objectArray4 = new Object[1];
                    objectArray4[0] = l2;
                    Object[] objectArray5 = new Object[1];
                    objectArray5[0] = l5;
                    return (float)_9k_0.c("k", (Object)new Random(), (float)_9k_0.c("k", (Object)this, (Object)objectArray4, 5935959859871475696L, (long)l3), (float)_9k_0.c("k", (Object)this, (Object)objectArray5, 5939037405256437568L, (long)l3), 5938769349930998311L, (long)l3);
                }
                catch (MatchException matchException) {
                    throw _9k_0.a(matchException);
                }
            }
            k_0 = this;
        }
        Object[] objectArray6 = new Object[1];
        objectArray6[0] = l2;
        return (float)_9k_0.c("k", (Object)k_0, (Object)objectArray6, 5935959859871475696L, (long)l3);
    }

    public long long_7(Object[] objectArray) {
        _9k_0 k_0;
        long l2;
        long l3;
        block4: {
            block5: {
                l3 = (Long)objectArray[0];
                long l4 = l3 = a ^ l3;
                l2 = l4 ^ 0x51A9A66F500FL;
                long l5 = l4 ^ 0x3B7E64EF35EAL;
                long l6 = l4 ^ 0x1B37E6802868L;
                long l7 = l4 ^ 0x3EBA22AFC85L;
                String string = _8j.cfr_renamed_3();
                try {
                    try {
                        k_0 = this;
                        if (string != null) break block4;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l5;
                        Object[] objectArray3 = new Object[1];
                        objectArray3[0] = l6;
                        if (!(_9k_0.c("k", (Object)k_0, (Object)objectArray2, 2884575671226560219L, (long)l3) > _9k_0.c("k", (Object)this, (Object)objectArray3, 2883181600274401962L, (long)l3))) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _9k_0.a(matchException);
                    }
                    Object[] objectArray4 = new Object[1];
                    objectArray4[0] = l2;
                    Object[] objectArray5 = new Object[1];
                    objectArray5[0] = l7;
                    return (long)_9k_0.c("k", (Object)new Random(), (long)_9k_0.c("k", (Object)this, (Object)objectArray4, 2883617325328355259L, (long)l3), (long)_9k_0.c("k", (Object)this, (Object)objectArray5, 2884819170707313311L, (long)l3), 2884642789158907549L, (long)l3);
                }
                catch (MatchException matchException) {
                    throw _9k_0.a(matchException);
                }
            }
            k_0 = this;
        }
        Object[] objectArray6 = new Object[1];
        objectArray6[0] = l2;
        return (long)_9k_0.c("k", (Object)k_0, (Object)objectArray6, 2883617325328355259L, (long)l3);
    }

    public double double_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (double)_9k_0.c("g", (Object)this, 1518067259680102048L, (long)l2);
    }

    @Override
    public void void_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2;
        long l4 = l3 ^ 0x3514FA6C7986L;
        long l5 = l3 ^ 0x1F358C30C73DL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = (double)_9k_0.c("g", (Object)this, 2603038984268805692L, (long)l2);
        objectArray2[0] = l4;
        _9k_0.c("k", (Object)this, (Object)objectArray2, 2602448944241542232L, (long)l2);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l5;
        objectArray3[0] = (double)_9k_0.c("g", (Object)this, 2600842737530466057L, (long)l2);
        _9k_0.c("k", (Object)this, (Object)objectArray3, 2600923016966805595L, (long)l2);
    }

    @Override
    public JsonElement com_google_gson_JsonElement_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        JsonObject jsonObject = new JsonObject();
        _9k_0.c("k", (Object)jsonObject, (Object)_9k_0.a("d", 14678, (long)(0x5035237E1DD2A765L ^ l2)), (Object)_9k_0.c("S", (double)_9k_0.c("g", (Object)this, -4039795321336539004L, (long)l2), -4039924684024814973L, (long)l2), -4040088873446032058L, (long)l2);
        _9k_0.c("k", (Object)jsonObject, (Object)_9k_0.a("d", 12556, (long)(0x1ADF53DA4B752F3EL ^ l2)), (Object)_9k_0.c("S", (double)_9k_0.c("g", (Object)this, -4041591941609110440L, (long)l2), -4039924684024814973L, (long)l2), -4040088873446032058L, (long)l2);
        return jsonObject;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_9k_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_9k_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

