/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1747
 *  net.minecraft.class_1811
 */
package dev.krypton;

import dev.krypton._3i_0;
import dev.krypton._4r;
import dev.krypton._6V;
import dev.krypton._6x_0;
import dev.krypton._7C;
import dev.krypton._92;
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
import net.minecraft.class_1747;
import net.minecraft.class_1811;

public class _5N
extends _6x_0 {
    private final _9r cfr_renamed_0;
    private final _9r cfr_renamed_3;
    private final _9r cfr_renamed_9;
    private final _92 cfr_renamed_8;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    public _5N(long l2, int n) {
        long l3;
        long l4 = l3 = (l2 << 32 | (long)n << 32 >>> 32) ^ b;
        long l5 = l4 ^ 0x38004E4C7684L;
        long l6 = l4 ^ 0x28607C850F17L;
        long l7 = l4 ^ 0x127DA79D0FD5L;
        long l8 = l7 >>> 8;
        int n2 = (int)(l7 << 56 >>> 56);
        long l9 = l4 ^ 0x6E38D90FFEEDL;
        long l10 = l4 ^ 0x71F84A2B119FL;
        long l11 = l4 ^ 0x177402BE8857L;
        super((int)_5N.a("y", 16720, (long)(0xE656564F06C2DBCL ^ l3)), -1, (_4r)((Object)_5N.c("\u00e8", 6323518783236103761L, (long)l3)), l9);
        this.cfr_renamed_0 = new _9r((int)_5N.a("y", 2832, (long)(0x1D36F8754AB67FDL ^ l3)), false, l5);
        this.cfr_renamed_3 = new _9r((int)_5N.a("y", 3444, (long)(0x218E14901831619AL ^ l3)), true, l5);
        this.cfr_renamed_9 = new _9r((int)_5N.a("y", 32739, (long)(0x9F71EC150B9309L ^ l3)), true, l5);
        this.cfr_renamed_8 = new _92((int)_5N.a("y", 31803, (long)(0x26784016D17610D4L ^ l3)), 0.0, l6, 10.0, 0.0, 1.0);
        Object[] objectArray = new Object[3];
        objectArray[2] = () -> this.cfr_renamed_1(l11);
        objectArray[1] = (int)((byte)n2);
        objectArray[0] = l8;
        _5N.c("I", (Object)_5N.c("o", (Object)this, 6324057569154151409L, (long)l3), (Object)objectArray, 6323378759006561857L, (long)l3);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = () -> this.cfr_renamed_1(l11);
        objectArray2[1] = (int)((byte)n2);
        objectArray2[0] = l8;
        _5N.c("I", (Object)_5N.c("o", (Object)this, 6327169387202298072L, (long)l3), (Object)objectArray2, 6323378759006561857L, (long)l3);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = new _95[]{_5N.c("o", (Object)this, 6323147288028639935L, (long)l3), _5N.c("o", (Object)this, 6324057569154151409L, (long)l3), _5N.c("o", (Object)this, 6327169387202298072L, (long)l3), _5N.c("o", (Object)this, 6327491640816886977L, (long)l3)};
        objectArray3[0] = l10;
        _5N.c("I", (Object)this, (Object)objectArray3, 6326570037532623201L, (long)l3);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                _5N.b = l.a(-1075847950317863414L, 6527955439816110609L, MethodHandles.lookup().lookupClass()).a(133932420836934L);
                _5N.j = new Object[45];
                _5N.k = new String[45];
                _5N.b();
                _5N.f = new HashMap<K, V>(13);
                var0 = _5N.b ^ 88932669129215L;
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
                var6_5 = ">\u0015_\u00ae\u00ee'\u00d1\u00c8\u00ff\u00d8Q+Kv\u00fd\u00ef\u00ba\rg\u0081\u00bd\u00f6\u000e\u00de";
                var7_6 = ">\u0015_\u00ae\u00ee'\u00d1\u00c8\u00ff\u00d8Q+Kv\u00fd\u00ef\u00ba\rg\u0081\u00bd\u00f6\u000e\u00de".length();
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
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u001eV\tE\u00f8\u00e6\u00b6Y\u00fb\u007f\u0015n+\u00fbI\u00b7";
                    var7_6 = "\u001eV\tE\u00f8\u00e6\u00b6Y\u00fb\u007f\u0015n+\u00fbI\u00b7".length();
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
lbl42:
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
lbl55:
                // 1 sources

                ** continue;
            }
        }
        _5N.d = var8_3;
        _5N.e = new Integer[5];
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
            case 0 -> 28;
            case 1 -> 19;
            case 2 -> 51;
            case 3 -> 24;
            case 4 -> 1;
            case 5 -> 60;
            case 6 -> 23;
            case 7 -> 52;
            case 8 -> 38;
            case 9 -> 17;
            case 10 -> 3;
            case 11 -> 46;
            case 12 -> 4;
            case 13 -> 27;
            case 14 -> 16;
            case 15 -> 25;
            case 16 -> 32;
            case 17 -> 29;
            case 18 -> 62;
            case 19 -> 26;
            case 20 -> 48;
            case 21 -> 13;
            case 22 -> 58;
            case 23 -> 31;
            case 24 -> 14;
            case 25 -> 34;
            case 26 -> 49;
            case 27 -> 6;
            case 28 -> 63;
            case 29 -> 59;
            case 30 -> 11;
            case 31 -> 44;
            case 32 -> 20;
            case 33 -> 21;
            case 34 -> 55;
            case 35 -> 37;
            case 36 -> 5;
            case 37 -> 8;
            case 38 -> 56;
            case 39 -> 40;
            case 40 -> 12;
            case 41 -> 15;
            case 42 -> 2;
            case 43 -> 0;
            case 44 -> 9;
            case 45 -> 7;
            case 46 -> 10;
            case 47 -> 61;
            case 48 -> 54;
            case 49 -> 18;
            case 50 -> 35;
            case 51 -> 57;
            case 52 -> 41;
            case 53 -> 36;
            case 54 -> 30;
            case 55 -> 33;
            case 56 -> 42;
            case 57 -> 45;
            case 58 -> 47;
            case 59 -> 43;
            case 60 -> 39;
            case 61 -> 50;
            case 62 -> 22;
            default -> 53;
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
        _5N.k[n3] = new String(cArray);
        return n3;
    }

    private Boolean cfr_renamed_1(long l2) {
        Object object;
        block2: {
            block3: {
                long l3 = (l2 = b ^ l2) ^ 0x32D84CF9C3AFL;
                int n = _7C.cfr_renamed_9();
                try {
                    object = _5N.c("I", (Object)_5N.c("o", (Object)this, 1019605033507597145L, (long)l2), (long)l3, 1020636213588983232L, (long)l2);
                    if (n == 0) break block2;
                    if (object != false) break block3;
                }
                catch (MatchException matchException) {
                    throw _5N.a(matchException);
                }
                object = true;
                break block2;
            }
            object = false;
        }
        return _5N.c("F", (boolean)object, 1019771889392993470L, (long)l2);
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = "'S+zg\u0012:F);bNvx";
        objectArray[1] = "\u0006}\f;\u001f(\u001bh\u000ez\u001at[j";
        objectArray[2] = "\u0013WYbs\u001c\u0018XH-\u001f\u001f\u0016ZJb3";
        objectArray[3] = Boolean.TYPE;
        _5N.k[3] = "java/lang/Boolean";
        objectArray[4] = Long.TYPE;
        _5N.k[4] = "java/lang/Long";
        objectArray[5] = "*T\nl'\u0012*T\u001d0+\u001d0\u001f\u001d.+\b7nOzzI";
        objectArray[6] = "\u000e{\u0001\u001fn\u0002\u000e{\u0016Cb\r\u00140\u0016]b\u0018\u0013AD\u0006:Y";
        objectArray[7] = "GQR|jwGQE fx]\u001aE>fmZk\u0011f1";
        objectArray[8] = "H<^B:8H<I\u001e67RwI\u00006\"U\u0006\u001b[nh";
        objectArray[9] = "\u0017J\u0015P\u0012\\\u0017J\u0002\f\u001eS\r\u0001\u0002\u0012\u001eF\npROO";
        objectArray[10] = "\u0011Z\u001c(nV\fO\u001eik\nCG";
        objectArray[11] = "I5nH(xI5y\u0014$wS~y\n$bT\u000f#Uw\"";
        objectArray[12] = "-|wJ4\u0004-|`\u00168\u000b77`\b8\u001e0F:Wj\\";
        objectArray[13] = "x\f o\u0006Vs\u00031 gXx\b5z";
        objectArray[14] = "a5?5B{| =tG'<b";
        objectArray[15] = "A\u0006\u0007\u0004\u0005DA\u0006\u0010X\tK[M\u0010F\t^\\<J\u0019[\u0019";
        objectArray[16] = "l<5Vm/\u0019\u001c>Y|`x\u00125Rx:\f";
        objectArray[17] = Integer.TYPE;
        _5N.k[17] = "java/lang/Integer";
        objectArray[18] = "2r\tn^h/g\u000b/[4o\"";
        objectArray[19] = "!`8i]>T@3fLq5N8mH+A";
        objectArray[20] = "kQ2Z[LvD0\u001b^\u0010;F";
        objectArray[21] = "Yu5\u001fm_,U>\u0010|\u0010M[5\u001bxJ9";
        objectArray[22] = Void.TYPE;
        _5N.k[22] = "java/lang/Void";
        objectArray[23] = "S6zRPj\u00034u(\u0013\u0018S7pS\u0018%VeuR";
        objectArray[24] = "@\u001031^$\u0010\u0012<K\u0017V@\u001190\u0016kEC<1";
        objectArray[25] = "sU:|NI4\u001aj,q_)J>)&\u0001r\u0017eEM\u0000rHdy\u0010TxV";
        objectArray[26] = "mH=d\f\u0002nZv|e\u0000=Ayv\"\u0010T\u001f|#\u0014@5\u001c:e\u000b~mH=d\f\u0002nZv|e";
        objectArray[27] = "\f\u0011OQ@xK^\u001f\u0001\u007fnV\u000eK\u0004(:\fZ\u0013Q\u007f<\u0006Y@VCaRS^";
        objectArray[28] = "G\u0002*gj\u000e\u0006T5)V[\u0017O-q:iD\u000br'V\u0003\u0019_vfk\u0000\u0010J)\u0016";
        objectArray[29] = "\u0004>ruw_\u000fhwzN^hl+xw\u001e\u000fn*o6b\u0004>ruw_\u000fhwzN";
        objectArray[30] = "iJ=\\\u0011c%RhWwt6]gA #h\n?-J+0A?\u001d\u000b}/\u000f";
        objectArray[31] = "S\u0000x\u001eoc\\\u0006!W\tH\u007feV&d3[\u0006{Hk5\u0002O";
        objectArray[32] = "\u0006$Mu<\u0016\u0005-X*LNV;A) |\u0000~\u001cqp+\u0007v\u001b!r\u0017Z\"\u0011?L\u0011C\u007fPp-\u0012\u00059ON";
        objectArray[33] = ";6a&)@z`~h\u0015\u0015k{f0y'8?:h\u0015Mek='(Nl~bW";
        objectArray[34] = "X({&\"sZ2l7O gu}t>\u007f\u001e9e!5";
        objectArray[35] = "\u000fyUU\b\u0013_{Z/Na\u000fx_T@\\\n*ZU";
        objectArray[36] = "\u0001T28\t/P\u00148gc/SSba\u000f\u001d\u0003\u001f<7_J\u000e^?y\u001a0LLo;c{^W}o\u0005pDKy\u0006";
        objectArray[37] = "t\u0017h.-\fw\u001e}q]T$\bdr1fvE<$]\rxNk+aP,Du\u0015";
        objectArray[38] = "3\\u!&\u0002c^z[bpcZe %\f3\u0000nk";
        objectArray[39] = "B\u000f\u0015[\u001e\u001d\u001f[\u001fE D\u0013BOSLvC\u0001\u0014\b\u001f!AE\u001f\nJD\u0010\u0005\u0015U ";
        objectArray[40] = "Lw\u001b-\u001c\u0011Nm\f<qBszZ=H\u0007\u0014x[*\t{\u001dt_>H\u0005\u0016~\n9q";
        objectArray[41] = "pQ\u001fvXou\u0003\u001awihIW\u0019fU)r\u001f\u001er\u0010Rs\u0015]|W3pS\u001bci";
        objectArray[42] = "_b\n(Z[\u000b+\u001c?:\u0005T7\u00125mV\rbId:[Dg\t @\u0019V7K";
        objectArray[43] = "F\u0019RT\u0005\u0017\u0016CY\u001f\u007fV/L\u000fSF\u0017HN\u000eD\u0007kDOJ\u0017A\u0007TM\u000eW\u007f";
        Object[] objectArray2 = objectArray;
        objectArray[44] = "lS\u0011\u0000<\u001e+\u001cAP\u0003\b6L\u0015UTVg\u0019H9?WmNO\u0005b\u0003gP";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'o' || c == '\u00c1' || c == '\u00e8' || c == '\u00e0') {
                field = _5N.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'o' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c1' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5N.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'I' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'F' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _5N.b(lookup, mutableCallSite, string, methodType, l2, l3);
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5N" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method h(long l2, long l3) {
        int n = _5N.e(l2, l3);
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
                clazz3 = _5N.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5N.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5N.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5N.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5N.f(964027883001664L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5N.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5N.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5N.f(964027883001664L, 0L);
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
            int n = _5N.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _5N.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5N.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5N.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5N.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5N.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5N" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x3B28;
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
                throw new RuntimeException("dev/krypton/5N", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5N.e[n2] = n3;
        }
        return e[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5N.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field g(long l2, long l3) {
        int n = _5N.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _5N.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5N.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5N.c(clazz3, string2, clazz2)) != null) {
                    _5N.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5N.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5N.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5N.f(964027883001664L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @_3i_0
    public void cfr_renamed_2(_6V v) {
        long l2;
        long l3;
        block71: {
            block70: {
                Object object;
                block69: {
                    int n;
                    CallSite callSite;
                    block67: {
                        CallSite callSite2;
                        block68: {
                            block64: {
                                block66: {
                                    CallSite callSite3;
                                    block65: {
                                        block63: {
                                            CallSite callSite4;
                                            CallSite callSite5;
                                            block61: {
                                                block62: {
                                                    block55: {
                                                        block56: {
                                                            Object object2;
                                                            block59: {
                                                                long l4;
                                                                block60: {
                                                                    Object object3;
                                                                    block57: {
                                                                        CallSite callSite6;
                                                                        block53: {
                                                                            block54: {
                                                                                long l5 = l3 = b ^ 0x3DC6413149CCL;
                                                                                l2 = l5 ^ 0x2778F28915C2L;
                                                                                l4 = l5 ^ 0x78FAFECA55F2L;
                                                                                callSite5 = _5N.c("I", (Object)_5N.c("o", (Object)_5N.c("o", (Object)this, -7460889075457937178L, (long)l3), -7459482248981226271L, (long)l3), -7460935831582030865L, (long)l3);
                                                                                callSite3 = _5N.c("I", (Object)_5N.c("o", (Object)_5N.c("o", (Object)this, -7460889075457937178L, (long)l3), -7459482248981226271L, (long)l3), -7459640429247993660L, (long)l3);
                                                                                callSite2 = _5N.c("I", (Object)callSite5, -7461253888620399166L, (long)l3);
                                                                                callSite = _5N.c("I", (Object)_5N.c("I", (Object)_5N.c("o", (Object)_5N.c("o", (Object)this, -7460889075457937178L, (long)l3), -7459482248981226271L, (long)l3), -7459640429247993660L, (long)l3), -7461253888620399166L, (long)l3);
                                                                                n = _7C.cfr_renamed_3();
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    callSite6 = _5N.c("I", (Object)callSite5, (Object)_5N.c("\u00e8", -7459262656619948892L, (long)l3), -7460991104965336022L, (long)l3);
                                                                                                    if (n != 0) break block53;
                                                                                                    if (callSite6 != false) break block54;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw _5N.a(matchException);
                                                                                                }
                                                                                                callSite6 = _5N.c("I", (Object)callSite3, (Object)_5N.c("\u00e8", -7459262656619948892L, (long)l3), -7460991104965336022L, (long)l3);
                                                                                                if (n != 0) break block53;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw _5N.a(matchException);
                                                                                            }
                                                                                            if (callSite6 != false) break block54;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw _5N.a(matchException);
                                                                                        }
                                                                                        callSite6 = _5N.c("I", (Object)_5N.c("o", (Object)this, -7459342783235998460L, (long)l3), (long)l4, -7460409491269522531L, (long)l3);
                                                                                        if (n != 0) break block53;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw _5N.a(matchException);
                                                                                    }
                                                                                    if (callSite6 == false) break block54;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw _5N.a(matchException);
                                                                                }
                                                                                return;
                                                                            }
                                                                            try {
                                                                                callSite4 = _5N.c("o", (Object)this, -7459342783235998460L, (long)l3);
                                                                                if (n != 0) break block55;
                                                                                callSite6 = _5N.c("I", (Object)callSite4, (long)l4, -7460409491269522531L, (long)l3);
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw _5N.a(matchException);
                                                                            }
                                                                        }
                                                                        try {
                                                                            try {
                                                                                block58: {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    if (callSite6 != false) break block56;
                                                                                                    object3 = callSite2 instanceof class_1747;
                                                                                                    if (n != 0) break block57;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw _5N.a(matchException);
                                                                                                }
                                                                                                if (object3) break block58;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw _5N.a(matchException);
                                                                                            }
                                                                                            object2 = callSite instanceof class_1747;
                                                                                            if (n != 0) break block59;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw _5N.a(matchException);
                                                                                        }
                                                                                        if (!object2) break block60;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw _5N.a(matchException);
                                                                                    }
                                                                                }
                                                                                callSite4 = _5N.c("o", (Object)this, -7459980321346388918L, (long)l3);
                                                                                if (n != 0) break block55;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw _5N.a(matchException);
                                                                            }
                                                                            object3 = _5N.c("I", (Object)callSite4, (long)l4, -7460409491269522531L, (long)l3);
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw _5N.a(matchException);
                                                                        }
                                                                    }
                                                                    if (!object3) {
                                                                        return;
                                                                    }
                                                                    break block56;
                                                                }
                                                                try {
                                                                    callSite4 = _5N.c("o", (Object)this, -7460814496452800669L, (long)l3);
                                                                    if (n != 0) break block55;
                                                                    object2 = _5N.c("I", (Object)callSite4, (long)l4, -7460409491269522531L, (long)l3);
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw _5N.a(matchException);
                                                                }
                                                            }
                                                            if (!object2) {
                                                                return;
                                                            }
                                                        }
                                                        callSite4 = _5N.c("I", (Object)_5N.c("I", (Object)callSite2, -7461094074660686173L, (long)l3), (Object)_5N.c("\u00e8", -7460316510933288182L, (long)l3), -7461326673277096136L, (long)l3);
                                                    }
                                                    try {
                                                        if (n != 0) break block61;
                                                        if (callSite4 == null) break block62;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _5N.a(matchException);
                                                    }
                                                    return;
                                                }
                                                callSite4 = _5N.c("I", (Object)_5N.c("I", (Object)callSite, -7461094074660686173L, (long)l3), (Object)_5N.c("\u00e8", -7460316510933288182L, (long)l3), -7461326673277096136L, (long)l3);
                                            }
                                            if (callSite4 != null) {
                                                return;
                                            }
                                            try {
                                                try {
                                                    object = _5N.c("I", (Object)callSite5, (Object)_5N.c("\u00e8", -7459115842442945305L, (long)l3), -7460991104965336022L, (long)l3);
                                                    if (n != 0) break block63;
                                                    if (object != false) break block64;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _5N.a(matchException);
                                                }
                                                object = _5N.c("I", (Object)callSite5, (Object)_5N.c("\u00e8", -7460757881329885297L, (long)l3), -7460991104965336022L, (long)l3);
                                            }
                                            catch (MatchException matchException) {
                                                throw _5N.a(matchException);
                                            }
                                        }
                                        try {
                                            try {
                                                if (n != 0) break block65;
                                                if (object != false) break block64;
                                            }
                                            catch (MatchException matchException) {
                                                throw _5N.a(matchException);
                                            }
                                            object = _5N.c("I", (Object)callSite3, (Object)_5N.c("\u00e8", -7459115842442945305L, (long)l3), -7460991104965336022L, (long)l3);
                                        }
                                        catch (MatchException matchException) {
                                            throw _5N.a(matchException);
                                        }
                                    }
                                    try {
                                        try {
                                            if (n != 0) break block66;
                                            if (object != false) break block64;
                                        }
                                        catch (MatchException matchException) {
                                            throw _5N.a(matchException);
                                        }
                                        object = _5N.c("I", (Object)callSite3, (Object)_5N.c("\u00e8", -7460757881329885297L, (long)l3), -7460991104965336022L, (long)l3);
                                    }
                                    catch (MatchException matchException) {
                                        throw _5N.a(matchException);
                                    }
                                }
                                try {
                                    if (n != 0) break block67;
                                    if (object == false) break block68;
                                }
                                catch (MatchException matchException) {
                                    throw _5N.a(matchException);
                                }
                            }
                            return;
                        }
                        object = callSite2 instanceof class_1811;
                    }
                    try {
                        try {
                            if (n != 0) break block69;
                            if (object != false) break block70;
                        }
                        catch (MatchException matchException) {
                            throw _5N.a(matchException);
                        }
                        object = callSite instanceof class_1811;
                    }
                    catch (MatchException matchException) {
                        throw _5N.a(matchException);
                    }
                }
                if (object == false) break block71;
            }
            return;
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        v.cfr_renamed_6 = (int)_5N.c("I", (Object)_5N.c("o", (Object)this, -7461189522658219142L, (long)l3), (Object)objectArray, -7460277087065437587L, (long)l3);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5N.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5N.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

