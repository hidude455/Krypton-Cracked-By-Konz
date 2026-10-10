/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  java.lang.MatchException
 *  net.minecraft.class_1299
 */
package dev.krypton;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import dev.krypton._8B;
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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1299;

public class _97
extends _95 {
    private final Map cfr_renamed_6;
    private Map cfr_renamed_9;
    private Runnable cfr_renamed_4;
    private static final long a = l.a(-4262038157539878533L, -4118671619535612700L, MethodHandles.lookup().lookupClass()).a(72466810610260L);
    private static final long[] c;
    private static final Integer[] d;
    private static final Map e;
    private static final Object[] i;
    private static final String[] j;

    public void void_1(Object[] objectArray) {
        block5: {
            CallSite callSite;
            long l2;
            block4: {
                class_1299 class_12992 = (class_1299)objectArray[0];
                l2 = (Long)objectArray[1];
                l2 = a ^ l2;
                String string = _8j.cfr_renamed_3();
                try {
                    try {
                        _97.c("\u00f1", (Object)_97.c("T", (Object)this, 1951610775678182577L, (long)l2), (Object)class_12992, 1953135374551887279L, (long)l2);
                        callSite = _97.c("T", (Object)this, 1953237423173295602L, (long)l2);
                        if (string != null) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _97.a(matchException);
                    }
                    callSite = _97.c("T", (Object)this, 1953237423173295602L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _97.a(matchException);
                }
            }
            _97.c("\u00f1", (Object)callSite, 1953781233870537032L, (long)l2);
        }
    }

    public _97(int n, Map map, long l2) {
        long l3 = (l2 = a ^ l2) ^ 0x597DB809F0C4L;
        int n2 = (int)(l3 >>> 48);
        int n3 = (int)(l3 << 16 >>> 32);
        int n4 = (int)(l3 << 48 >>> 48);
        super((short)n2, n, n3, n4);
        _97.c("\u00df", (Object)this, new HashMap(map), -5496754645166797805L, (long)l2);
        this.cfr_renamed_6 = new HashMap(map);
    }

    public _97(int n, long l2) {
        long l3 = (l2 = a ^ l2) ^ 0x7175F8E77C38L;
        this(n, new HashMap(), l3);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        i = new Object[65];
        j = new String[65];
        _97.b();
        e = new HashMap(13);
        long l2 = a ^ 0xA21F4CA6995L;
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
        String string = "\u001d^'\u00f0\u00ebt\u0002\u00dfe\u00a1\u007f\f\u008c\u00da\u00e4h";
        int n2 = "\u001d^'\u00f0\u00ebt\u0002\u00dfe\u00a1\u007f\f\u008c\u00da\u00e4h".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l3 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        c = lArray;
        d = new Integer[2];
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
            case 0 -> 56;
            case 1 -> 46;
            case 2 -> 1;
            case 3 -> 37;
            case 4 -> 55;
            case 5 -> 30;
            case 6 -> 2;
            case 7 -> 13;
            case 8 -> 51;
            case 9 -> 31;
            case 10 -> 32;
            case 11 -> 23;
            case 12 -> 33;
            case 13 -> 3;
            case 14 -> 60;
            case 15 -> 16;
            case 16 -> 17;
            case 17 -> 54;
            case 18 -> 19;
            case 19 -> 40;
            case 20 -> 52;
            case 21 -> 15;
            case 22 -> 27;
            case 23 -> 6;
            case 24 -> 12;
            case 25 -> 21;
            case 26 -> 10;
            case 27 -> 57;
            case 28 -> 20;
            case 29 -> 47;
            case 30 -> 24;
            case 31 -> 28;
            case 32 -> 8;
            case 33 -> 41;
            case 34 -> 18;
            case 35 -> 25;
            case 36 -> 42;
            case 37 -> 44;
            case 38 -> 5;
            case 39 -> 58;
            case 40 -> 35;
            case 41 -> 49;
            case 42 -> 48;
            case 43 -> 14;
            case 44 -> 39;
            case 45 -> 7;
            case 46 -> 63;
            case 47 -> 26;
            case 48 -> 62;
            case 49 -> 4;
            case 50 -> 11;
            case 51 -> 29;
            case 52 -> 38;
            case 53 -> 43;
            case 54 -> 34;
            case 55 -> 0;
            case 56 -> 36;
            case 57 -> 59;
            case 58 -> 9;
            case 59 -> 61;
            case 60 -> 50;
            case 61 -> 53;
            case 62 -> 22;
            default -> 45;
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
        _97.j[n3] = new String(cArray);
        return n3;
    }

    public boolean boolean_9(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        class_1299 class_12992 = (class_1299)objectArray[1];
        l2 = a ^ l2;
        return (boolean)_97.c("\u00f1", (Object)_97.c("T", (Object)this, 5310732766400689687L, (long)l2), (Object)class_12992, 5306409952609002946L, (long)l2);
    }

    public _97 dev_krypton_97_9(Object[] objectArray) {
        Runnable runnable = (Runnable)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = a ^ l2;
        _97.c("\u00df", (Object)this, (Runnable)runnable, -6555506264052014097L, (long)l2);
        return this;
    }

    private static void cfr_renamed_1(JsonObject jsonObject, long l2, Map.Entry entry) {
        l2 = a ^ l2;
        JsonObject jsonObject2 = new JsonObject();
        _8B b = (_8B)((Object)_97.c("\u00f1", (Object)entry, 1466957443164449518L, (long)l2));
        _97.c("\u00f1", (Object)jsonObject2, (Object)"r", (Object)_97.c("\u00f5", (int)_97.c("T", (Object)b, 1467479290953134334L, (long)l2), 1466219654792425165L, (long)l2), 1467973485698530320L, (long)l2);
        _97.c("\u00f1", (Object)jsonObject2, (Object)"g", (Object)_97.c("\u00f5", (int)_97.c("T", (Object)b, 1464184012052022087L, (long)l2), 1466219654792425165L, (long)l2), 1467973485698530320L, (long)l2);
        _97.c("\u00f1", (Object)jsonObject2, (Object)"b", (Object)_97.c("\u00f5", (int)_97.c("T", (Object)b, 1466164997065805021L, (long)l2), 1466219654792425165L, (long)l2), 1467973485698530320L, (long)l2);
        _97.c("\u00f1", (Object)jsonObject2, (Object)"a", (Object)_97.c("\u00f5", (int)_97.c("T", (Object)b, 1466468661223112190L, (long)l2), 1466219654792425165L, (long)l2), 1467973485698530320L, (long)l2);
        _97.c("\u00f1", (Object)jsonObject, (Object)_97.c("\u00f1", (Object)_97.c("\u00f1", (Object)_97.c("C", 1466517857255585857L, (long)l2), (Object)((class_1299)_97.c("\u00f1", (Object)entry, 1466755938826034812L, (long)l2)), 1467751614274305361L, (long)l2), 1466318763585625629L, (long)l2), (Object)jsonObject2, 1464033005658123246L, (long)l2);
    }

    public void void_9(Object[] objectArray) {
        block5: {
            CallSite callSite;
            long l2;
            block4: {
                l2 = (Long)objectArray[0];
                class_1299 class_12992 = (class_1299)objectArray[1];
                _8B b = (_8B)objectArray[2];
                long l3 = (l2 = a ^ l2) ^ 0x2C957CF0EA8L;
                int n = (int)(l3 >>> 48);
                int n2 = (int)(l3 << 16 >>> 32);
                int n3 = (int)(l3 << 48 >>> 48);
                String string = _8j.cfr_renamed_3();
                try {
                    try {
                        Object[] objectArray2 = new Object[3];
                        objectArray2[2] = (int)((short)n3);
                        objectArray2[1] = n2;
                        objectArray2[0] = (int)((short)n);
                        _97.c("\u00f1", (Object)_97.c("T", (Object)this, -280919829932440643L, (long)l2), (Object)class_12992, (Object)_97.c("\u00f1", (Object)b, (Object)objectArray2, -282169437311416549L, (long)l2), -283036866221635764L, (long)l2);
                        callSite = _97.c("T", (Object)this, -281703295886378242L, (long)l2);
                        if (string != null) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _97.a(matchException);
                    }
                    callSite = _97.c("T", (Object)this, -281703295886378242L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _97.a(matchException);
                }
            }
            _97.c("\u00f1", (Object)callSite, -283371771653953980L, (long)l2);
        }
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'T' || c == '\u00df' || c == 'C' || c == '\u00c4') {
                field = _97.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'T' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00df' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'C' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _97.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _97.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void b() {
        Object[] objectArray = i;
        i[0] = "q\u0007>$Q5o\u000f$k,%o";
        objectArray[1] = "a;\u0001\u001aHR\u007f3\u001bU\u0015Sy?\u0016\u0016Ht\u007f(\u0012\u001a\u000b";
        objectArray[2] = "d\u001cxN{ez\u0014b\u00013e`\u001ezF:~ >aA&ec\u0018|";
        objectArray[3] = Void.TYPE;
        _97.j[3] = "java/lang/Void";
        objectArray[4] = "\u0013}\t\\\u0016X\ru\u0013\u0013uL\t8:SL_\u0000";
        objectArray[5] = "UCVPBAKKL\u001f/[RRAC\r@PP";
        objectArray[6] = "\f\u0016sh-2\u0012\u001ei'e2\b\u0014q`l)H1pg`3\u000f\u0018k";
        objectArray[7] = "\u000f2?ZUJ\u0012'=\u001bP\u0016R`";
        objectArray[8] = "Wb\u001b$h\u0013Ij\u0001k\u000b\u0007M";
        objectArray[9] = Boolean.TYPE;
        _97.j[9] = "java/lang/Boolean";
        objectArray[10] = "lw$1\u0003\u0000qb&p\u0006\\0P";
        objectArray[11] = "T\u000e)\u000e,z!.\"\u0001=5@ )\n9o4";
        objectArray[12] = "\u0010Yj]B@\u001bV{\u0012#N\u0010]\u007fH";
        objectArray[13] = "VFd\u0006L\u0001]IuI0\u0018RIs\u0005\u000e\b";
        objectArray[14] = "!\u0002\u0012t\u001c~-\n\u0013?Uv1\u0002\u0011t1b-\u000308\u0011t!\u0019";
        objectArray[15] = "~Y\"\t\"\u0005uV3F_\u001dfQ:\u000f";
        objectArray[16] = "\u001d4\f^~M\u0011<\r\u00157E\r4\u000f^SQ\u00115$\u001c|O\u001b5\u0015";
        objectArray[17] = Integer.TYPE;
        _97.j[17] = "java/lang/Integer";
        objectArray[18] = "m#0(57m#'t98wh'j9-p\u0019s?jm";
        objectArray[19] = "{\u0005\u001e\u0015~\b{\u0005\tIr\u0007aN\tWr\u0012f?]\u0002!S";
        objectArray[20] = "'Q5\u00134\u0018,^$\\T\u0001 R&\u0000";
        objectArray[21] = "\rw?\u0011\u0003\u001d\rw(M\u000f\u0012\u0017<(S\u000f\u0007\u0010My\u0006XD";
        objectArray[22] = "( \"6|r#/3y\u001bp6$32 ";
        objectArray[23] = "\u0000r;U!P\u001ez!\u001aFQ\u000fa,@`W";
        objectArray[24] = "c\rK9(\u0017;ZV.K\u001cfX.\"s\u0015x\u000f\u0017#r\u000bh4D%v\u0016tNW/r\u001f\n\u000eCp5\u000bhS\\8(u";
        objectArray[25] = "5v;?9M`#;_)[ qn:R\u001ekl>n<M3'n_";
        objectArray[26] = "U\u0000\n\u001b:\t\u0003\u0001YL\u0003ZjW\u000f@8\u0000\u0016\\Y\u0002}";
        objectArray[27] = "xN\fj\rP \u0019\u0011}nQ|\u00062v\u00122~\u001dU{\u0005X+HU\u001b";
        objectArray[28] = "\u001a!&2\u0016-[eb x&F:$)\u0002,G0\\|\u0002|G01!\u001e\"\\_g>\u0002?O?&zF-!";
        objectArray[29] = "Z\"orA(G--':vX=i\u0018\nkR4yr\u000bw\nr\u0015";
        objectArray[30] = ">\u001dE\u0010fMg\u000bM\u0016]N\u0003L\u0014\u0006'\u00119\u0002N\u001a4";
        objectArray[31] = "\n\u001b9{=\u0014YCr+\f\u0001TP5/`z\bT30b\u001aI\u0010w\"\fC\u0002Zpsb\u0010Z\u0011 B";
        objectArray[32] = "\u0018\u0005P\u000f\u007fa@RM\u0018\u001cj\u001dPm\u0004{{\u001cFI\u000f\u001ciI\\GE%hHBW~q=\u000fM^\u0003c}M\u00055Dq;\u000fBW\u0019ns\u0012<";
        objectArray[33] = "`ZO\u00123$5\u000fOr92bJ\u001a\u000e?4\u000f_\u001c\b257B\u0013JgN";
        objectArray[34] = "+\u001bKI3\u001c8\u0011O@M\t,\n?Q\f\u0000=v\u001dF}]$\n\u0016\u0010?\u0018A";
        objectArray[35] = "m\u0010'i(\"#J;zHb>K=m%\u0018cU=j$rbIe,H((I#\u007f\")4\u0011e\u0013";
        objectArray[36] = "FXMG <PYX\f\u0010+FCH[|\u0019\u0015\u0007\u0016\u0001,NA\u0007HN+w@\u0006V^\u0010#LZS\fb5MO\u0018<";
        objectArray[37] = "2P%\u001dAqkF-\u001bzu\u000f\u000e+\u000b\u001e2w\u0000s\f\u0013";
        objectArray[38] = "t\u0016%]_?g\u001c!T!*s\u0007QEc>y\u001d_TC(u\u0007\u0018W\u0018 o\u0018z\u000fO=x{";
        objectArray[39] = ".\u001edxF0<V4,(9/Sk$D\u000b{\u00171y\u0011\\rTl:D6sH4|(1%JpsZ'$_;C";
        objectArray[40] = "GXZ\r\u000f>\t\u0002F\u001eoo\u001d\u000bN\ro>\u0014^Y\t\rc\u000b\u0016Dw";
        objectArray[41] = "xg\u0007\"796=\u001b1Wb=\u0014\u001f +rFg\u0018:nf9!\u0000b<\u0003";
        objectArray[42] = "\u0019e^4HpW?B'(%J'#~S-^7I\u007fOu\u0018[\u00135O3K1\u0012)\u0017u'";
        objectArray[43] = "{kT~\u0002w-j\u0007);'\u0001WVy\u000b !+]/Ie";
        objectArray[44] = "\r*\u00197cYU}\u0004 \u0000[\rh|,8[\u0016(E-9E\u0006\u0013B$b\u0002\u0001l\u0004<:Pd";
        objectArray[45] = "UqQ\u001bI6\u0006)\u001aKx6\u000b:lK\u00138lyDOD \u00008\u0019E\u0003XV-\u0019\\\u0006:\u000b2QAx";
        objectArray[46] = "0& YO\u0006t~r\u0007 \u0017lrd^Z\u001dmxVFc\u0011z\u0017'IZ\u000eewf\r\u001e\u001c\u000b,bMR\u0012km&\t@|";
        objectArray[47] = "6Z)\u007fc\u0005`[z(ZT\tVy~=Qk\u0006+)+i6Z)\u007fc\u0005`[z(Z";
        objectArray[48] = "rf_w\u001cb<<Cd| 1$\"=\u0007?54H<\u001bgsX\u0012v\u001b! 2\u0013jCgLhYj\u00054&iE2CX";
        objectArray[49] = "{r\u0017\u0013\u0002G\"d\u001f\u00159@F#F\u0005C\u001b|m\u001c\u0019P";
        objectArray[50] = "y(Ty)8d'\u0016,R`\u007f<h~\"|\u0016yLqkei?T)9\u0000";
        objectArray[51] = "\u0005*8l\u001aKArj2u^SgZk\u0011LS\u001b4y\u0012HRq5eJ\u000e>";
        objectArray[52] = "\u001e\u0003;\u007f*S\fKk+DZ\u001fN4#(hL\ti\u007fy?\u001fU1?tM\tT$tD\u000f\tU-(.\u000e\u0015\rkD";
        objectArray[53] = "\u001c:n=p;Op{x\u0017;\u0011lol@iI84?\u00179An0n{+\t>d";
        objectArray[54] = "6\rC\u0013\fprU\u0011Mce`@<\u0010\u0012\n=G\u0018\u0004\u000f`<[@Bc";
        objectArray[55] = "cg[gf@pm_n\u0018[rH\u001dc~}ch\u000bod:7h\u0004=}Eqp\\o\u0018";
        objectArray[56] = "5axJ*2#`m\u0001\u001a<?]aK{&7\u0006w\tz2c?v\bd\"X";
        objectArray[57] = "\u001cWH\b0\u0006\nV\u001c\u0000Q\b\u001bW\n]\u0016\u0018rX\u001b\u0000j\u0013\u000eSMB/v\u001cWH\b0\u0006\nV\u001c\u0000Q";
        objectArray[58] = "fP\u0015\u0013zE0QFDC\u0012Y\u0007\u0010HxL%\fF\n=";
        objectArray[59] = "?\u001ej\t5\u001bqDv\u001aULg\\m\u0002\u000eL} x\u0019iAjJ-Li!";
        objectArray[60] = "l_tZcJb\u0007sW\u001cH X\t\u0004q\n#@kYnB>>";
        objectArray[61] = ".l&\u0003q\u0019v;;\u0014\u0012\u0014*)C\u0018*\u001b5nz\u0019+\u0005%U)\u001f/\u00189/:\u0015+\u0011G";
        objectArray[62] = "f]\u0001!\u0012\u00180\\Rv+DY\n\u0004z\u0010\u0011%\u0001R8U";
        objectArray[63] = "\u001bq\\H@\u0013U+@[ JH>z_\\)J%\u001dRKC\u001fp\u001d2";
        Object[] objectArray2 = objectArray;
        objectArray[64] = "\u0013_\u0018[=A]\u0005\u0004H]\u0010J\u0007\u0019H<\u001dV\"\bP]KV\u0006\u001cM7JJ^Z!c\u0019OX\u0000^%\u0001\u0017\ne";
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
            throw new RuntimeException("dev/krypton/97" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = _97.e(l2, l3);
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
                clazz3 = _97.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _97.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _97.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _97.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _97.f(893408872022467L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _97.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _97.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _97.f(893408872022467L, 0L);
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
            int n = _97.e(l2, l3);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                _97.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _97.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _97.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _97.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _97.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
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
            throw new RuntimeException("dev/krypton/97" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _97.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x75DB;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])e.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/97", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _97.d[n2] = n3;
        }
        return d[n2];
    }

    private static Field g(long l2, long l3) {
        int n = _97.e(l2, l3);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = _97.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _97.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _97.c(clazz3, string2, clazz2)) != null) {
                    _97.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _97.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _97.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _97.f(893408872022467L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void void_0(Object[] objectArray) {
        block5: {
            CallSite callSite;
            long l2;
            block4: {
                l2 = (Long)objectArray[0];
                Map map = (Map)objectArray[1];
                l2 = a ^ l2;
                String string = _8j.cfr_renamed_3();
                try {
                    try {
                        _97.c("\u00df", (Object)this, new HashMap(map), -8262215112934493454L, (long)l2);
                        callSite = _97.c("T", (Object)this, -8261713198260040783L, (long)l2);
                        if (string != null) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _97.a(matchException);
                    }
                    callSite = _97.c("T", (Object)this, -8261713198260040783L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _97.a(matchException);
                }
            }
            _97.c("\u00f1", (Object)callSite, -8260150209387030773L, (long)l2);
        }
    }

    public void cfr_renamed_2(Object[] objectArray) {
        block5: {
            CallSite callSite;
            long l2;
            block4: {
                int n = (Integer)objectArray[0];
                class_1299 class_12992 = (class_1299)objectArray[1];
                int n2 = (Integer)objectArray[2];
                int n3 = (Integer)objectArray[3];
                _8B b = (_8B)objectArray[4];
                l2 = ((long)n << 48 | (long)n2 << 48 >>> 16 | (long)n3 << 32 >>> 32) ^ a;
                long l3 = l2 ^ 0x3478D263DA8L;
                int n4 = (int)(l3 >>> 48);
                int n5 = (int)(l3 << 16 >>> 32);
                int n6 = (int)(l3 << 48 >>> 48);
                String string = _8j.cfr_renamed_3();
                try {
                    try {
                        Object[] objectArray2 = new Object[3];
                        objectArray2[2] = (int)((short)n6);
                        objectArray2[1] = n5;
                        objectArray2[0] = (int)((short)n4);
                        _97.c("\u00f1", (Object)_97.c("T", (Object)this, -3523510999973187395L, (long)l2), (Object)class_12992, (Object)_97.c("\u00f1", (Object)b, (Object)objectArray2, -3524759492808018917L, (long)l2), -3525629154832927668L, (long)l2);
                        callSite = _97.c("T", (Object)this, -3524293385679828482L, (long)l2);
                        if (string != null) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _97.a(matchException);
                    }
                    callSite = _97.c("T", (Object)this, -3524293385679828482L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _97.a(matchException);
                }
            }
            _97.c("\u00f1", (Object)callSite, -3525962889874090684L, (long)l2);
        }
    }

    public Map java_util_Map_3(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return _97.c("T", (Object)this, -5430318748575741177L, (long)l2);
    }

    public Map java_util_Map_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return _97.c("T", (Object)this, -4631031462144008912L, (long)l2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean boolean_5(Object[] objectArray) {
        Object object;
        block8: {
            String string;
            block6: {
                String string2;
                block7: {
                    long l2 = (Long)objectArray[0];
                    string2 = _8j.cfr_renamed_3();
                    try {
                        try {
                            object = _97.c("\u00f1", (Object)_97.c("T", (Object)this, 6338497626629941330L, (long)l2), 6339700005460908981L, (long)l2);
                            string = string2;
                            if (l2 < 0L) break block6;
                            if (string != null) break block7;
                            if (object == false) break block8;
                        }
                        catch (MatchException matchException) {
                            throw _97.a(matchException);
                        }
                        object = _97.c("\u00f1", (Object)_97.c("T", (Object)this, 6340290623960610166L, (long)l2), 6339700005460908981L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw _97.a(matchException);
                    }
                }
                string = string2;
            }
            if (string != null) return (boolean)object;
            if (object != false) {
                object = true;
                return (boolean)object;
            }
        }
        object = false;
        return (boolean)object;
    }

    private static String cfr_renamed_9(long l2, class_1299 class_12992) {
        l2 = a ^ l2;
        return _97.c("\u00f1", (Object)_97.c("\u00f1", (Object)_97.c("C", -7963162503026901658L, (long)l2), (Object)class_12992, -7964132648342652810L, (long)l2), -7962822664330912966L, (long)l2);
    }

    /*
     * Exception decompiling
     */
    @Override
    public void void_7(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [30[WHILELOOP], 31[DOLOOP]], but top level block is 14[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public Set java_util_Set_7(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return _97.c("\u00f1", (Object)_97.c("T", (Object)this, 1378306639565384836L, (long)l2), 1380588491242863081L, (long)l2);
    }

    @Override
    public JsonElement com_google_gson_JsonElement_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2;
        long l4 = l3 ^ 0x71AF5B39040BL;
        long l5 = l3 ^ 0x46731F1B812CL;
        JsonObject jsonObject = new JsonObject();
        _97.c("\u00f1", (Object)_97.c("\u00f1", (Object)_97.c("\u00f1", (Object)_97.c("\u00f1", (Object)_97.c("T", (Object)this, -4044022380704057276L, (long)l2), -4041470678337648854L, (long)l2), -4043870163488215005L, (long)l2), (Object)_97.c("\u00f5", (Object)_97.c("\u00f5", arg_0 -> _97.cfr_renamed_9(l5, arg_0), -4044227006182011006L, (long)l2), -4040648311546696249L, (long)l2), -4043964861941398123L, (long)l2), arg_0 -> _97.cfr_renamed_1(jsonObject, l4, arg_0), -4040734824524282106L, (long)l2);
        return jsonObject;
    }

    @Override
    public void void_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        _97.c("\u00df", (Object)this, new HashMap(_97.c("T", (Object)this, 2602275917474039446L, (long)l2)), 2600484156859112370L, (long)l2);
    }

    public _8B dev_krypton_8B_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        class_1299 class_12992 = (class_1299)objectArray[1];
        l2 = a ^ l2;
        return (_8B)((Object)_97.c("\u00f1", (Object)_97.c("T", (Object)this, -1844629322156566078L, (long)l2), (Object)class_12992, -1843182656349212367L, (long)l2));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_97.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_97.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

