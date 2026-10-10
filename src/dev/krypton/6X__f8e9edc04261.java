/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  java.lang.MatchException
 */
package dev.krypton;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
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
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _6X
extends _95 {
    private final List cfr_renamed_5;
    private List cfr_renamed_6;
    private static final long a = l.a(3664014923721076639L, -1216327243311500501L, MethodHandles.lookup().lookupClass()).a(3424295758830L);
    private static final String c;
    private static final Object[] d;
    private static final String[] e;

    public void void_1(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = a ^ l2) ^ 0x7222E4E83ADDL;
        _6X.a("\u00e0", (Object)_6X.a("W", (Object)this, 3077386289443211014L, (long)l2), 3077833454157574120L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _6X.a("\u00e0", (Object)this, (Object)objectArray2, 3079233696565619072L, (long)l2);
    }

    public int int_1(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (int)_6X.a("\u00e0", (Object)_6X.a("W", (Object)this, 5193049060354024866L, (long)l2), 5197038469204159270L, (long)l2);
    }

    public _6X dev_krypton_6X_1(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = a ^ l2) ^ 0x61392021E800L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        super.dev_krypton_95_0(objectArray2);
        return this;
    }

    public void cfr_renamed_378(Object[] objectArray) {
        block6: {
            int n;
            long l2;
            long l3;
            String string;
            int n2;
            block5: {
                n2 = (Integer)objectArray[0];
                string = (String)objectArray[1];
                l3 = (Long)objectArray[2];
                l2 = (l3 = a ^ l3) ^ 0x467992079594L;
                String string2 = _8j.cfr_renamed_3();
                try {
                    n = n2;
                    if (string2 != null) break block5;
                    if (n < 0) break block6;
                }
                catch (MatchException matchException) {
                    throw _6X.a(matchException);
                }
                n = n2;
            }
            try {
                if (n < _6X.a("\u00e0", (Object)_6X.a("W", (Object)this, -8792109637676292017L, (long)l3), -8794726650783471925L, (long)l3)) {
                    _6X.a("\u00e0", (Object)_6X.a("W", (Object)this, -8792109637676292017L, (long)l3), (int)n2, (Object)string, -8791644549765067073L, (long)l3);
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l2;
                    _6X.a("\u00e0", (Object)this, (Object)objectArray2, -8794801229208533303L, (long)l3);
                }
            }
            catch (MatchException matchException) {
                throw _6X.a(matchException);
            }
        }
    }

    public _6X(long l2, int n, String[] stringArray) {
        long l3 = (l2 = a ^ l2) ^ 0x68558767CEF7L;
        int n2 = (int)(l3 >>> 48);
        int n3 = (int)(l3 << 16 >>> 32);
        int n4 = (int)(l3 << 48 >>> 48);
        super((short)n2, n, n3, n4);
        this.cfr_renamed_5 = _6X.a("\u00cd", new ArrayList(_6X.a("\u00cd", (Object)stringArray, -8247612185782609640L, (long)l2)), -8248876488394490188L, (long)l2);
        _6X.a("\u00aa", (Object)this, new ArrayList(_6X.a("\u00cd", (Object)stringArray, -8247612185782609640L, (long)l2)), -8247769453559603143L, (long)l2);
    }

    public _6X(int n, char c, int n2, short s, List list) {
        long l2 = ((long)c << 48 | (long)n2 << 32 >>> 16 | (long)s << 48 >>> 48) ^ a;
        long l3 = l2 ^ 0x2C2DFF77A5C2L;
        int n3 = (int)(l3 >>> 48);
        int n4 = (int)(l3 << 16 >>> 32);
        int n5 = (int)(l3 << 48 >>> 48);
        super((short)n3, n, n4, n5);
        this.cfr_renamed_5 = _6X.a("\u00cd", new ArrayList(list), -1823009032001235583L, (long)l2);
        _6X.a("\u00aa", (Object)this, new ArrayList(list), -1819650954340644084L, (long)l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new Object[46];
        e = new String[46];
        _6X.b();
        long l2 = a ^ 0x22C0B8FAB024L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l2 >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("Y\u00e8\u0093(\u00f8\u0010\u00dc\u00f8".getBytes("ISO-8859-1"));
                c = _6X.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l2 << n * 8 >>> 56);
            ++n;
        }
    }

    public String toString() {
        long l2 = a ^ 0x66F4AB1AFCB0L;
        return _6X.a("\u00cd", c, (Object)_6X.a("W", (Object)this, 2486958216770719536L, (long)l2), 2486881976135657399L, (long)l2);
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (e[n3] != null) {
            return n3;
        }
        Object object = d[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 49;
            case 1 -> 60;
            case 2 -> 21;
            case 3 -> 18;
            case 4 -> 0;
            case 5 -> 34;
            case 6 -> 1;
            case 7 -> 25;
            case 8 -> 46;
            case 9 -> 30;
            case 10 -> 29;
            case 11 -> 3;
            case 12 -> 48;
            case 13 -> 20;
            case 14 -> 55;
            case 15 -> 61;
            case 16 -> 38;
            case 17 -> 59;
            case 18 -> 32;
            case 19 -> 56;
            case 20 -> 10;
            case 21 -> 47;
            case 22 -> 8;
            case 23 -> 19;
            case 24 -> 45;
            case 25 -> 33;
            case 26 -> 39;
            case 27 -> 22;
            case 28 -> 4;
            case 29 -> 63;
            case 30 -> 51;
            case 31 -> 28;
            case 32 -> 12;
            case 33 -> 31;
            case 34 -> 11;
            case 35 -> 40;
            case 36 -> 44;
            case 37 -> 17;
            case 38 -> 37;
            case 39 -> 36;
            case 40 -> 7;
            case 41 -> 42;
            case 42 -> 5;
            case 43 -> 16;
            case 44 -> 54;
            case 45 -> 13;
            case 46 -> 50;
            case 47 -> 57;
            case 48 -> 52;
            case 49 -> 58;
            case 50 -> 9;
            case 51 -> 23;
            case 52 -> 27;
            case 53 -> 53;
            case 54 -> 62;
            case 55 -> 43;
            case 56 -> 26;
            case 57 -> 14;
            case 58 -> 6;
            case 59 -> 41;
            case 60 -> 2;
            case 61 -> 24;
            case 62 -> 35;
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
        _6X.e[n3] = new String(cArray);
        return n3;
    }

    public void void_9(Object[] objectArray) {
        block5: {
            long l2;
            long l3;
            block4: {
                String string = (String)objectArray[0];
                l3 = (Long)objectArray[1];
                l2 = (l3 = a ^ l3) ^ 0x4A77759AB41AL;
                String string2 = _8j.cfr_renamed_3();
                try {
                    CallSite callSite;
                    try {
                        callSite = _6X.a("\u00e0", (Object)_6X.a("W", (Object)this, -6597163417954874943L, (long)l3), (Object)string, -6594091719279097017L, (long)l3);
                        if (string2 != null) break block4;
                        if (callSite != false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _6X.a(matchException);
                    }
                    callSite = _6X.a("\u00e0", (Object)_6X.a("W", (Object)this, -6597163417954874943L, (long)l3), (Object)string, -6593555197732113374L, (long)l3);
                }
                catch (MatchException matchException) {
                    throw _6X.a(matchException);
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l2;
            _6X.a("\u00e0", (Object)this, (Object)objectArray2, -6594225406960310457L, (long)l3);
        }
    }

    private static void b() {
        Object[] objectArray = d;
        d[0] = "\t54\f>\u0016\u0014 6M;J[\b";
        objectArray[1] = "{2*\nA\u0006e:0E#\u001ab'";
        objectArray[2] = Integer.TYPE;
        _6X.e[2] = "java/lang/Integer";
        objectArray[3] = Void.TYPE;
        _6X.e[3] = "java/lang/Void";
        objectArray[4] = "I@;\u007f\u0006[TU9>\u0003\u0007\u0014\u0010";
        objectArray[5] = "8\r:j;EM-1e*\n,#:n.PX";
        objectArray[6] = "\u0019ry}6p\u0007zc2[j\u001f\u007fj\u007fll\u001c}|";
        objectArray[7] = "])kIu\u001cC!q\u0006\u001a\u001bE)d[";
        objectArray[8] = "!3\u0018\u0016K2T\u0013\u0013\u0019Z}5\u001d\u0018\u0012^'A";
        objectArray[9] = "Q\\3\u0014b\u001cZS\"[\u0003\u0012QX&\u0001";
        objectArray[10] = Boolean.TYPE;
        _6X.e[10] = "java/lang/Boolean";
        objectArray[11] = "\u0006]5_.6s}>P?y\u0012s5[;#f";
        objectArray[12] = "lj\u00186\n\u0014\u0019J\u00139\u001b[xD\u00182\u001f\u0001\f";
        objectArray[13] = "3'9u\bn-/#:oo<4.`Ii";
        objectArray[14] = "/\u001c\u001efr\u000f#\u0014\u001f-;\u0007?\u001c\u001df_\u0013#\u001d2:g\u00015";
        objectArray[15] = "\u00146>;%\u007f\u001f9/tXg\f>&=";
        objectArray[16] = "dpG/EUo\u007fV`(Qocb+\u001aLk\u007fR+";
        objectArray[17] = "\u0011R|MsP\u001a]m\u0002\u0014H\u001eAkN1Y";
        objectArray[18] = "86A{144>@0x<(6B{\u001c(47i936>7X";
        objectArray[19] = "WTGp%b\"tL\u007f4-CzGt0w7";
        objectArray[20] = "_UGzU1\u0018Q@\"0|\u0005[I*Qo\u0002WD\"]E\u0002ERF\tk\u0007\\\u0013(\\jZ\u0004.\u007fZe\u0001\u0003@*[8Y>";
        objectArray[21] = "(1(\u0006@M>px9H))b#E\u000fO/l'Fp\u0013\u007f~\u007fK\u001cL=~/9";
        objectArray[22] = "le\u001a\u0015\u0019<;r\u001cM%4|A\u000bHC\u001c}y\u0019^%jd?\u0000N^$7a\u001d/";
        objectArray[23] = "\u0012> &'-G?}~\u001a*G8Dz`1\u0011>9zz HT{'&3J/5tx.+";
        objectArray[24] = "-`eGyLxa8\u001fDIsl}L%Do\n?_6\u0018~w?E'A\u00145b\u00194Co{1G)\"";
        objectArray[25] = "~\u001d\u0015#\r\u0004v\u0013\u000b~g\t\"\u0003\u0017\u0013Y\u0015=I\u0001nY\u000f,\u0010k";
        objectArray[26] = "H\u0003)0\"6\u001d\u0002th\u001f7\u001c\u0015Mk`i\u000bV0>%>\u001eis(mb\u001b\u0014s2|;q";
        objectArray[27] = "6\u0003\u000fI..c\u0002R\u0011\u0013:b\f\fU~@6\u0016ZQ,=cS\rD\u0013~u\u001bQAn~o\n\b+";
        objectArray[28] = "h/q((\t~n!\u0017!m<{\u007fu%\u0003iz\"-";
        objectArray[29] = "\u00120O\u0001j\r\u0004q\u001f>ci\u0013cDB%\u000f\u0015m@AZSE\u007f\u0018L6\f\u0007\u007fH>";
        objectArray[30] = "eK.\u000b\u0013\u0005#E-\u0006r\u0003_V Z\u000eG9P.^\r8e\u0000<\u0006\u0000T:B<Vr";
        objectArray[31] = "c.I,\u001aA6/\u0014t'T;6@N\u001ePk>\u00123K\u0015<+-";
        objectArray[32] = "FQ\u001d$27\u0013\nX\"\f0S\u0001\u001c7p6UlW0raE\u0007_>l</";
        objectArray[33] = "Q5j[\u0018[\u000447\u0003%O\u0005:iGH5V%|\u0003OHV?mZ%\n\u000bc~X^DX=c9";
        objectArray[34] = "7jnED^bk3\u001dyQrmpN\u0005Wt\u0000;I\u0007\u0000dk3G\u0019]\u000e";
        objectArray[35] = "w^\u0017rmj\"_J*P\u007f#Hs)/54\u000b\u000e|jb!4Mj\">$IMp3gN\n\tbjn3\n\u0013s3\u0004";
        objectArray[36] = "Q\bu%\u0013fGI%\u001a\u0018\u0002\u0005\\{x\u001elP]& ";
        objectArray[37] = "z\u0011\u0013kBT\"\u0011\u0019z|Mt\u000b\u001e\u0002\u0016\u0011u[\u00148\u0010R#\u0007xiMBp\u0006\u0006`\u0002Jzj\u0011y\u0017F-\u0011Iy\u001dW\u0013";
        objectArray[38] = "\u000bf\tXZ,I=\u0019W*uM\u001f\u0004^V\u001cZ6\u0004YUz\\8\u0000Z*%\\?\u0007\u0018Dp]b_%";
        objectArray[39] = "!M\u0002:\u001e\r)C\u001cgt\u0006yX:g\u0004\u001a\u0010\u001c\u001f6\u0004\u0007kRLh\u0019f";
        objectArray[40] = "|\u0011h*{\u0019+\u0006nrG\u001fz\u000bKk\u001c\fm\u0016d\u007fG\u0019l\u001ck.<Al\u0016z\u0010";
        objectArray[41] = "\u0004097wyS'?oK\u007f\u0002*\u001av\tk\b0\u001aw1y\u001eV:00jQ0okulo";
        objectArray[42] = "9\u0018`\u000bJ/l\u0019=Sw*d\u001fm\u0013w{:\u00039\u001b\u001b$x\u0003ii";
        objectArray[43] = "{4\u0014=^\u0013.oQ;`\u001c~eo.\u001b\u001e{7\u0014v\u001b\u0014j\tU}\u0011H`e\n?\u0011\u0018\u0012";
        objectArray[44] = "\u0019\u00044$/\u0017N\u00132|\u0013\u001f\t %yu&\b\u0003;\u007fo\u001f\f\u000f^!pB\u0002\u0003%o#\u001c\u001fb";
        Object[] objectArray2 = objectArray;
        objectArray[45] = "Q>O\u000b<IG\u007f\u001f45-PmDHsKVc@K\f@\u0002j\u001a\u0004hVC:%";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'W' || c == '\u00aa' || c == '\u00e6' || c == 'k') {
                field = _6X.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'W' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00aa' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _6X.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e0' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00cd' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _6X.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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

    private static Method h(long l2, long l3) {
        int n = _6X.e(l2, l3);
        Object object = d[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = e[n];
                int n3 = string2.indexOf(8);
                clazz3 = _6X.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _6X.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _6X.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _6X.d[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _6X.f(688277522638964L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _6X.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _6X.d[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _6X.f(688277522638964L, 0L);
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
            int n = _6X.e(l2, l3);
            object = d[n];
            try {
                if (!(object instanceof String)) break block2;
                _6X.d[n] = clazz = Class.forName(e[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _6X.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _6X.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _6X.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _6X.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6X" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
        int n = _6X.e(l2, l3);
        Object object = d[n];
        if (object instanceof String) {
            String string = e[n];
            int n2 = string.indexOf(8);
            Class clazz = _6X.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _6X.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _6X.c(clazz3, string2, clazz2)) != null) {
                    _6X.d[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _6X.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _6X.d[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _6X.f(688277522638964L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void void_0(Object[] objectArray) {
        List list = (List)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = (l2 = a ^ l2) ^ 0xC4BBB3E6F34L;
        _6X.a("\u00aa", (Object)this, new ArrayList(list), 9177329918004810479L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _6X.a("\u00e0", (Object)this, (Object)objectArray2, 9174638189030325353L, (long)l2);
    }

    @Override
    public _95 dev_krypton_95_0(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 ^ 0x47B93A10363AL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        return _6X.a("\u00e0", (Object)this, (Object)objectArray2, 2216739783031721609L, (long)l2);
    }

    public void cfr_renamed_2(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = (l2 = a ^ l2) ^ 0x44006698D0ADL;
        _6X.a("\u00e0", (Object)_6X.a("W", (Object)this, -4556195161077748362L, (long)l2), (Object)string, -4556411895661222383L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _6X.a("\u00e0", (Object)this, (Object)objectArray2, -4554383213131987984L, (long)l2);
    }

    public boolean boolean_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l2 = a ^ l2;
        return (boolean)_6X.a("\u00e0", (Object)_6X.a("W", (Object)this, 7736661030727698157L, (long)l2), (Object)string, 7732991035592049771L, (long)l2);
    }

    public List java_util_List_4(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return _6X.a("W", (Object)this, 2847777377624535296L, (long)l2);
    }

    public String java_lang_String_4(Object[] objectArray) {
        block6: {
            int n;
            int n2;
            long l2;
            block5: {
                l2 = (Long)objectArray[0];
                n2 = (Integer)objectArray[1];
                l2 = a ^ l2;
                String string = _8j.cfr_renamed_3();
                try {
                    n = n2;
                    if (string != null) break block5;
                    if (n < 0) break block6;
                }
                catch (MatchException matchException) {
                    throw _6X.a(matchException);
                }
                n = n2;
            }
            try {
                if (n < _6X.a("\u00e0", (Object)_6X.a("W", (Object)this, -7168558313879883465L, (long)l2), -7166680177472962637L, (long)l2)) {
                    return (String)((Object)_6X.a("\u00e0", (Object)_6X.a("W", (Object)this, -7168558313879883465L, (long)l2), (int)n2, -7166453482525789052L, (long)l2));
                }
            }
            catch (MatchException matchException) {
                throw _6X.a(matchException);
            }
        }
        return null;
    }

    @Override
    public boolean boolean_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return _6X.a("W", (Object)this, 6338953427361004107L, (long)l2).equals(_6X.a("W", (Object)this, 6338366754253128051L, (long)l2));
    }

    public void void_5(Object[] objectArray) {
        block6: {
            int n;
            long l2;
            int n2;
            long l3;
            block5: {
                l3 = (Long)objectArray[0];
                n2 = (Integer)objectArray[1];
                l2 = (l3 = a ^ l3) ^ 0x266D5738ED0AL;
                String string = _8j.cfr_renamed_3();
                try {
                    n = n2;
                    if (string != null) break block5;
                    if (n < 0) break block6;
                }
                catch (MatchException matchException) {
                    throw _6X.a(matchException);
                }
                n = n2;
            }
            try {
                if (n < _6X.a("\u00e0", (Object)_6X.a("W", (Object)this, -188510404333580079L, (long)l3), -185568280111702443L, (long)l3)) {
                    _6X.a("\u00e0", (Object)_6X.a("W", (Object)this, -188510404333580079L, (long)l3), (int)n2, -185294207576139799L, (long)l3);
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l2;
                    _6X.a("\u00e0", (Object)this, (Object)objectArray2, -185501955791765929L, (long)l3);
                }
            }
            catch (MatchException matchException) {
                throw _6X.a(matchException);
            }
        }
    }

    public List java_util_List_7(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return new ArrayList(_6X.a("W", (Object)this, -1615529702193019865L, (long)l2));
    }

    @Override
    public void void_7(Object[] objectArray) {
        block13: {
            Object object;
            JsonElement jsonElement;
            String string;
            long l2;
            long l3;
            long l4;
            block12: {
                JsonElement jsonElement2 = (JsonElement)objectArray[0];
                l4 = (Long)objectArray[1];
                long l5 = l4;
                l3 = l5 ^ 0x701E675BFBC3L;
                l2 = l5 ^ 0x24BC99821F24L;
                string = _8j.cfr_renamed_3();
                try {
                    try {
                        jsonElement = jsonElement2;
                        if (string != null) break block12;
                        if (_6X.a("\u00e0", (Object)jsonElement, -1465998370146631008L, (long)l4) == false) break block13;
                    }
                    catch (MatchException matchException) {
                        throw _6X.a(matchException);
                    }
                    jsonElement = jsonElement2;
                }
                catch (MatchException matchException) {
                    throw _6X.a(matchException);
                }
            }
            CallSite callSite = _6X.a("\u00e0", (Object)jsonElement, -1465799196915820942L, (long)l4);
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l2;
            _6X.a("\u00e0", (Object)this, (Object)objectArray2, -1466661620899095329L, (long)l4);
            CallSite callSite2 = _6X.a("\u00e0", (Object)callSite, -1465303054495684101L, (long)l4);
            block10: while (_6X.a("\u00e0", (Object)callSite2, -1464844920754154286L, (long)l4) != false) {
                object = _6X.a("\u00e0", (Object)callSite2, -1466932519365104603L, (long)l4);
                do {
                    block14: {
                        JsonElement jsonElement3 = (JsonElement)object;
                        try {
                            CallSite callSite3;
                            try {
                                try {
                                    if (string != null) break block13;
                                    callSite3 = _6X.a("\u00e0", (Object)jsonElement3, -1465598222507687920L, (long)l4);
                                    if (string != null) break block14;
                                }
                                catch (MatchException matchException) {
                                    throw _6X.a(matchException);
                                }
                                if (callSite3 == false) break block14;
                            }
                            catch (MatchException matchException) {
                                throw _6X.a(matchException);
                            }
                            callSite3 = _6X.a("\u00e0", (Object)_6X.a("W", (Object)this, -1465058862572222952L, (long)l4), (Object)_6X.a("\u00e0", (Object)jsonElement3, -1465897464448689618L, (long)l4), -1465985371815904261L, (long)l4);
                        }
                        catch (MatchException matchException) {
                            throw _6X.a(matchException);
                        }
                    }
                    if (string == null) continue block10;
                    object = this;
                } while (l4 <= 0L);
            }
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l3;
            _6X.a("\u00e0", (Object)object, (Object)objectArray3, -1466589601764792162L, (long)l4);
        }
    }

    @Override
    public void void_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 ^ 0x2E7363E5857EL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = new ArrayList(_6X.a("W", (Object)this, 2600404824861586067L, (long)l2));
        _6X.a("\u00e0", (Object)this, (Object)objectArray2, 2599732647752334408L, (long)l2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public JsonElement com_google_gson_JsonElement_8(Object[] objectArray) {
        JsonArray jsonArray;
        long l2 = (Long)objectArray[0];
        JsonArray jsonArray2 = new JsonArray();
        CallSite callSite = _6X.a("\u00e0", (Object)_6X.a("W", (Object)this, -4040259248996717987L, (long)l2), -4039848418437573994L, (long)l2);
        String string = _8j.cfr_renamed_3();
        block2: while (_6X.a("\u00e0", (Object)callSite, -4040047265885063017L, (long)l2) != false) {
            String string2 = (String)((Object)_6X.a("\u00e0", (Object)callSite, -4043839381926182816L, (long)l2));
            try {
                do {
                    jsonArray = jsonArray2;
                    String string3 = string;
                    if (l2 >= 0L) {
                        if (string3 != null) return jsonArray;
                        string3 = string2;
                    }
                    _6X.a("\u00e0", (Object)jsonArray, (Object)string3, -4040336542710087097L, (long)l2);
                    if (string == null) continue block2;
                } while (l2 <= 0L);
                break;
            }
            catch (MatchException matchException) {
                throw _6X.a(matchException);
            }
        }
        jsonArray = jsonArray2;
        return jsonArray;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_6X.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

