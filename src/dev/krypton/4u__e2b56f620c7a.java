/*
 * Decompiled with CFR 0.152.
 */
package dev.krypton;

import dev.krypton._4l;
import dev.krypton._4w;
import dev.krypton.l;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.security.Key;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Renamed from dev.krypton.4u
 */
public class _4u_0
extends _4l {
    private final Selector cfr_renamed_8;
    private final SocketChannel cfr_renamed_3;
    private final Consumer cfr_renamed_9;
    private static final long b = l.a(2278339164612198601L, 6278826717794162174L, MethodHandles.lookup().lookupClass()).a(235700747039318L);
    private static final String f;
    private static final Object[] g;
    private static final String[] h;

    @Override
    protected void cfr_renamed_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        ByteBuffer byteBuffer = (ByteBuffer)objectArray[1];
        try {
            _4u_0.b("\u00e0", (Object)_4u_0.b("\u00e7", (Object)this, -602463748657399763L, (long)l2), (Object)byteBuffer, -602131149750500098L, (long)l2);
        }
        catch (IOException iOException) {
            _4u_0.b("\u00e0", (Object)iOException, -602863740052949255L, (long)l2);
        }
    }

    public _4u_0(String string, Consumer consumer, long l2) throws IOException {
        long l3 = (l2 = b ^ l2) ^ 0x1E25DB787147L;
        this.cfr_renamed_8 = _4u_0.b("q", -2764243662417256640L, (long)l2);
        this.cfr_renamed_3 = _4u_0.b("q", (Object)_4u_0.b("q", string, -2764513674485256139L, (long)l2), -2761221941023164188L, (long)l2);
        this.cfr_renamed_9 = consumer;
        _4u_0.b("\u00e0", (Object)_4u_0.b("\u00e7", (Object)this, -2763645554710833621L, (long)l2), (boolean)false, -2763830551431904187L, (long)l2);
        _4w[] wArray = _4l.cfr_renamed_8();
        _4u_0.b("\u00e0", (Object)_4u_0.b("\u00e7", (Object)this, -2763645554710833621L, (long)l2), (Object)_4u_0.b("\u00e7", (Object)this, -2761170301488250309L, (long)l2), 1, -2764603420686540445L, (long)l2);
        Thread thread = new Thread(() -> this.cfr_renamed_7(l3));
        _4w[] wArray2 = wArray;
        try {
            _4u_0.b("\u00e0", (Object)thread, (Object)f, -2760948592268282225L, (long)l2);
            _4u_0.b("\u00e0", (Object)thread, -2764865514233905092L, (long)l2);
            if (_4w.cfr_renamed_8() == null) {
                _4l.cfr_renamed_8(new _4w[3]);
            }
        }
        catch (IOException iOException) {
            throw _4u_0.a(iOException);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        g = new Object[56];
        h = new String[56];
        _4u_0.b();
        long l2 = b ^ 0x6F125AC6784EL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l2 >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("ps\u00a6\u0083\u00bf\u00b5w\u001b\u00ef'XpD\u00cb\u00e6Y\u0082\u00bb\u00f4q\u00d6\u00c4GG\u000e8e*\u00de9\u00073".getBytes("ISO-8859-1"));
                f = _4u_0.b(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l2 << n * 8 >>> 56);
            ++n;
        }
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (h[n3] != null) {
            return n3;
        }
        Object object = g[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 2;
            case 1 -> 50;
            case 2 -> 48;
            case 3 -> 21;
            case 4 -> 39;
            case 5 -> 41;
            case 6 -> 40;
            case 7 -> 10;
            case 8 -> 11;
            case 9 -> 61;
            case 10 -> 31;
            case 11 -> 26;
            case 12 -> 53;
            case 13 -> 47;
            case 14 -> 57;
            case 15 -> 36;
            case 16 -> 62;
            case 17 -> 42;
            case 18 -> 55;
            case 19 -> 49;
            case 20 -> 43;
            case 21 -> 34;
            case 22 -> 58;
            case 23 -> 14;
            case 24 -> 16;
            case 25 -> 12;
            case 26 -> 5;
            case 27 -> 17;
            case 28 -> 37;
            case 29 -> 60;
            case 30 -> 25;
            case 31 -> 18;
            case 32 -> 4;
            case 33 -> 8;
            case 34 -> 32;
            case 35 -> 0;
            case 36 -> 20;
            case 37 -> 28;
            case 38 -> 19;
            case 39 -> 35;
            case 40 -> 9;
            case 41 -> 54;
            case 42 -> 24;
            case 43 -> 51;
            case 44 -> 30;
            case 45 -> 29;
            case 46 -> 59;
            case 47 -> 1;
            case 48 -> 44;
            case 49 -> 52;
            case 50 -> 27;
            case 51 -> 23;
            case 52 -> 46;
            case 53 -> 63;
            case 54 -> 38;
            case 55 -> 3;
            case 56 -> 22;
            case 57 -> 6;
            case 58 -> 7;
            case 59 -> 13;
            case 60 -> 56;
            case 61 -> 33;
            case 62 -> 45;
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
        _4u_0.h[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e7' || c == 'g' || c == 'W' || c == 'e') {
                field = _4u_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e7' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'g' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'W' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _4u_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e0' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'q' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static void b() {
        Object[] objectArray = g;
        g[0] = "vpc\fd-}\u007frC\u001e)ntt\t";
        objectArray[1] = ":.\u0007=b\u00101!\u0016r\u001f\b\"&\u001f;";
        objectArray[2] = Void.TYPE;
        _4u_0.h[2] = "java/lang/Void";
        objectArray[3] = "Lm[BlmQxY\u0003i1\u001c}";
        objectArray[4] = "-3P+V\u001b.=\b)\u0010\u0014)<C&\u000b[\u0014=E!\u001d\u0001\u0004:G$\u0016\u0010+";
        objectArray[5] = "}\u0003P\u0007#Fr\u0016\b5bK|\u0007R'iLe\u0007U\u0015";
        objectArray[6] = "\u0012|P\\Q,\u0011r\b^\u0017#\u0016sCQ\fl+xJX\u001c6\u0017o";
        objectArray[7] = Boolean.TYPE;
        _4u_0.h[7] = "java/lang/Boolean";
        objectArray[8] = "\u0001QB~Wu\u0002_\u001a|\u0011z\u0005^Qs\n58UXz\u001ao\nRXz:s\n^Zz\u0015";
        objectArray[9] = Integer.TYPE;
        _4u_0.h[9] = "java/lang/Integer";
        objectArray[10] = "pRG3(,s\\\u001f1n#t]T>ulIV]7e6s\\_\u0019c;";
        objectArray[11] = "\u001dxaZ\u0017i\u0012m9nWn\u000f]xVXn\u0019JxXRb\u0003Xs_Kb\u0004j";
        objectArray[12] = "2){\u0017\u000ff1'#4X|=\nx\u0010Gm*";
        objectArray[13] = "\u0016'kWA?\u0015)3u\u00070\u000e\u0004hP\t4\u000e";
        objectArray[14] = "r\u0016(\"?zq\u0018p yuj\u0004;7?Wp\u0016,0t`";
        objectArray[15] = "\u0007~!\u00176\\\u001ak#V3\u0000Vp";
        objectArray[16] = "\u00157sz\u001e\u000f\u000b?i5V\u000f\u00115qr_\u0014Q\u0015juC\u000f\u00123w";
        objectArray[17] = "41@%5%?>QjT+45U0";
        objectArray[18] = "A\u0013`I\u0007U\\\u0006b\b\u0002\t\u0010D";
        objectArray[19] = "W7C)\"E[?BbkMG7@)\u000fY[6kk GQ6Z";
        objectArray[20] = "22go`\u0006>:f$)\u000e\"2doM\u001a>3E#m\f2)";
        objectArray[21] = "\n!O\u00173&\u0001.^XT$\u0014%^\u0013o";
        objectArray[22] = "\n_6U`\u0016\u0006W7\u001e)\u001e\u001a_5UM\n\u0006^\u000b\u001au\n\fB";
        objectArray[23] = "\u001c$`u\u001c\u001f\u0019k_[w\u000e\u0015 f`[\u0019\u0018";
        objectArray[24] = "p\u0017[/I\u001b}\u0014X@]\u0013hoJ%K~-\u0018\u0018}O\u0002{H\\y&GiY_&\u001f\u0017lK\u001d@";
        objectArray[25] = "T)7aIoT80~w*\u0002\u0012(i\u00160\nIm\"Lk\f5;r\boe";
        objectArray[26] = "0',>ne\u007f#-*\u0010dm#U2l\u000b>&*/yo01h;\u00105yao=t;n#{T";
        objectArray[27] = "|\bx\b\u0012\u000fw\u0007r\rt\u001cxS|\u0018\u0019p%@#\u001e\n\u001ejD\"\ntAu[iJMAd\\vt";
        objectArray[28] = "eo&\u0016s)`{jAH$&k|+s;af*D%}2c\u001a\u0010!\u007fc=p\u0015534\u0006";
        objectArray[29] = "`\u001df}b\u001ee\u0011}h\u001aXZK~fpZk\r\"g+";
        objectArray[30] = "!\u0018cxg*{H\"q\u0004? \u001dv0xV!\u0007v$m2)\u0013!#\u0004o6\u0006g.=?3\u0014%H";
        objectArray[31] = "\u0019\u0010|^[._L}\u0005ddH\u0012z_\u0018\u001f\u001b\u000f)O\r{\u0015\u0018k[d";
        objectArray[32] = "\u001bGuXk\u0003\u0016Dv7\u007f\u001a\u0016\u0003q7=\u001b\u000f\u0005k\u000em\u001e\u001dG\r";
        objectArray[33] = "cT\u0010go\u0007f@\\0T\u00175T@Zd\u0015`WR4+\u0011aC,d-S#THj:\u00117=";
        objectArray[34] = "\u0004.NOnC\r=\u001aE\u00011\u0006/\u001euj\u0000Vi\u0018Kc\u0013\u0002c";
        objectArray[35] = "=- fVN4>tl94;6v Yp=- fVN4>tl";
        objectArray[36] = "\u0000gnXli\tt:R\u0003\u0010\u0013q0\u000enW\u0000gnXli\tt:R";
        objectArray[37] = "xaqn\u0017\u001d7epzi\u001a,}.o\u0000\u000f%\u0019w}W\b!}yj\u0015\u001cH)1<\u0003\r&f5=\u0017s";
        objectArray[38] = "\u001c\u001eVzQ!\u000e\bT257\u001d\u000etqw#\u0017\u0014z`W5\u001b\u000e=fK'L\u0003\u0000nJ9\u0002r";
        objectArray[39] = "kYD/3qnU_:K5QYT'{i-\u0003\u0004fr";
        objectArray[40] = "c6[aV;,2Zu(/>1\u0002mDUc6[aV;,2Zu(";
        objectArray[41] = "\u0013:\\!T\u0006Uf]zkPW1QKWQD6\bz\u0011\rEm7";
        objectArray[42] = "\u0005*s/[W\f9'%4\u000e\u0014;+s]\rni3+O\u0000\ng$i[i";
        objectArray[43] = "XK\u0003WP\u000eD\u001b@El\u000e[\nRM\u0017\u0019|\u0005CZ\u0017t\b\r\u0001L\u0005\u0010\u0006\u001aCXlJOJD^\bDX\bP7";
        objectArray[44] = "\u0006\u001cfOoW\u0003\b*\u0018TGP\u001a;\t(PGuf\u0014?W\u0002D H>\f=K#L/TYE4\u000e;=\u0002H%C+D]O>\u001bT";
        objectArray[45] = "Dv?)ZF\u0000`r' \u001e\u0015\f6s\u001bD\u0012p`#_@{3urK\u0003Dwc?Ey";
        objectArray[46] = "wrsB2\u0011v#j\\VVpgmA\rRc|pCV\u0017(&+E*Axb/,:BrmrU(Tp%\u0016";
        objectArray[47] = "lME)vRiY\t~MG-E\u0005yM\b/\u001c\u0013j#G+\u001d\u0007\u0014sAi_\u0010p}V+Ky";
        objectArray[48] = "ro`>\f{=ka*ru+l\u00029\u0017|#q92\u001d\u0015\u007f(f&Kls+;-r";
        objectArray[49] = "\u0015o\u000eUVLD VDj\u001c|/N\u0006\u0011D\u0018!YD\u0005-\u0015o\u000eUVLD VDj";
        objectArray[50] = "(APK\u0019?-MK^a~\u0012\u0010G\u0007\\\u007fx\u0015SK\u000b";
        objectArray[51] = "oD\u0000\u000bmVjPL\\VW0JG[V\u0005)]@PoU,O\u00026";
        objectArray[52] = "y1A7d\\(6\u0017?ZVllJs\u0001R\u007ffOS G}`,6'^jk\u0015f\"L(\r";
        objectArray[53] = "i\u0012\u0017z\u0001\f/N\u0016!>V1\u0013\u0007}>\u0004(\u0004\u0000v\u0007T-\u0016B\u0010";
        objectArray[54] = "V.\u0005\u0003\u0005\u001b]!\u000f\u0006c\bRp\u000f\u0002\u0007\u0018t~\u000f\u0005\u0018\tC\u001e\u000fO\u0000\u0018Ya\u0004@\n\u001d?";
        Object[] objectArray2 = objectArray;
        objectArray[55] = "b97G\u00177g-{\u0010,6>6e\u001bC #=A\u001eK6:1m\u0015,`fnyCUle3rz\u0011-6(2\u0015W3<-\u000b";
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/4u" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _4u_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static String b(byte[] byArray) {
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

    private static Method h(long l2, long l3) {
        int n = _4u_0.e(l2, l3);
        Object object = g[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = h[n];
                int n3 = string2.indexOf(8);
                clazz3 = _4u_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _4u_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _4u_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _4u_0.g[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _4u_0.f(1214203297522548L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _4u_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _4u_0.g[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _4u_0.f(1214203297522548L, 0L);
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
            int n = _4u_0.e(l2, l3);
            object = g[n];
            try {
                if (!(object instanceof String)) break block2;
                _4u_0.g[n] = clazz = Class.forName(h[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _4u_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _4u_0.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _4u_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _4u_0.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static Field g(long l2, long l3) {
        int n = _4u_0.e(l2, l3);
        Object object = g[n];
        if (object instanceof String) {
            String string = h[n];
            int n2 = string.indexOf(8);
            Class clazz = _4u_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _4u_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _4u_0.c(clazz3, string2, clazz2)) != null) {
                    _4u_0.g[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _4u_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _4u_0.g[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _4u_0.f(1214203297522548L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Exception decompiling
     */
    private void cfr_renamed_7(long var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [7[CASE]], but top level block is 2[TRYBLOCK]
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

    @Override
    public void cfr_renamed_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        try {
            _4u_0.b("\u00e0", (Object)_4u_0.b("\u00e7", (Object)this, -9072973900313126525L, (long)l2), -9071302309881667244L, (long)l2);
            _4u_0.b("\u00e0", (Object)_4u_0.b("\u00e7", (Object)this, -9070945154210017901L, (long)l2), -9070845921079457935L, (long)l2);
        }
        catch (IOException iOException) {
            _4u_0.b("\u00e0", (Object)iOException, -9071327686527990969L, (long)l2);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_4u_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

