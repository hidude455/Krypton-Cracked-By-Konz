/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.FilterMode
 *  com.mojang.blaze3d.textures.GpuTexture
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  com.mojang.blaze3d.textures.TextureFormat
 *  net.minecraft.class_1011
 *  net.minecraft.class_1044
 *  net.minecraft.class_12137
 */
package dev.krypton;

import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import dev.krypton._4w;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1011;
import net.minecraft.class_1044;
import net.minecraft.class_12137;

public class _0B
extends class_1044 {
    private static _4w[] cfr_renamed_6;
    private static final long a;
    private static final long b;
    private static final Object[] c;
    private static final String[] d;

    public static _4w[] cfr_renamed_5() {
        return cfr_renamed_6;
    }

    public _0B(int n, long l2, int n2, byte by, TextureFormat textureFormat, FilterMode filterMode, FilterMode filterMode2) {
        long l3 = (l2 << 8 | (long)by << 56 >>> 56) ^ a;
        _4w[] wArray = _0B.cfr_renamed_5();
        _0B.a("k", (Object)((Object)this), (GpuTexture)_0B.a("\u00c8", (Object)_0B.a("\u00db", 6035817009296907040L, (long)l3), (Object)"", (int)((int)b), (Object)textureFormat, (int)n, (int)n2, 1, 1, 6036717779386335859L, (long)l3), 6035279660896699460L, (long)l3);
        _4w[] wArray2 = wArray;
        try {
            _0B.a("k", (Object)((Object)this), (class_12137)_0B.a("\u00c8", (Object)_0B.a("\u00db", 6035705833744578010L, (long)l3), (Object)_0B.a("D", 6036220584741384599L, (long)l3), (Object)_0B.a("D", 6036220584741384599L, (long)l3), (Object)filterMode, (Object)filterMode2, (boolean)false, 6036036886998550887L, (long)l3), 6036387587780879109L, (long)l3);
            _0B.a("k", (Object)((Object)this), (GpuTextureView)_0B.a("\u00c8", (Object)_0B.a("\u00db", 6035817009296907040L, (long)l3), (Object)_0B.a("\u00c6", (Object)((Object)this), 6035279660896699460L, (long)l3), 6035170254220047170L, (long)l3), 6036313838289999613L, (long)l3);
            if (wArray2 != null) {
                _4w.cfr_renamed_8(new String[4]);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw _0B.a(illegalArgumentException);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = l.a(1434800453452027566L, 8674884757375062251L, MethodHandles.lookup().lookupClass()).a(116195046321846L);
        c = new Object[60];
        d = new String[60];
        _0B.a();
        long l2 = a ^ 0x14ED47467C17L;
        _0B.cfr_renamed_8(null);
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l2 >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l3 = -1365580600664445185L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l2 << n * 8 >>> 56);
            ++n;
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _0B.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _0B.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _0B.a(l2, l3);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                _0B.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _0B.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _0B.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _0B.a(l2, l3);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = _0B.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _0B.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _0B.a(clazz3, string2, clazz2)) != null) {
                    _0B.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _0B.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _0B.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _0B.b(2015073723085319L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _0B.a(l2, l3);
        Object object = c[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = d[n];
                int n3 = string2.indexOf(8);
                clazz3 = _0B.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _0B.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _0B.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _0B.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _0B.b(2015073723085319L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _0B.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _0B.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _0B.b(2015073723085319L, 0L);
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0B" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c6' || c == 'k' || c == 'D' || c == '\u00c0') {
                field = _0B.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c6' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'k' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'D' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _0B.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00db' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _0B.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private static int a(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (d[n3] != null) {
            return n3;
        }
        Object object = c[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 34;
            case 1 -> 8;
            case 2 -> 15;
            case 3 -> 39;
            case 4 -> 61;
            case 5 -> 10;
            case 6 -> 0;
            case 7 -> 25;
            case 8 -> 54;
            case 9 -> 11;
            case 10 -> 26;
            case 11 -> 1;
            case 12 -> 29;
            case 13 -> 12;
            case 14 -> 47;
            case 15 -> 45;
            case 16 -> 30;
            case 17 -> 51;
            case 18 -> 62;
            case 19 -> 57;
            case 20 -> 5;
            case 21 -> 60;
            case 22 -> 27;
            case 23 -> 63;
            case 24 -> 6;
            case 25 -> 41;
            case 26 -> 36;
            case 27 -> 19;
            case 28 -> 22;
            case 29 -> 32;
            case 30 -> 50;
            case 31 -> 4;
            case 32 -> 52;
            case 33 -> 28;
            case 34 -> 53;
            case 35 -> 2;
            case 36 -> 44;
            case 37 -> 16;
            case 38 -> 42;
            case 39 -> 21;
            case 40 -> 3;
            case 41 -> 46;
            case 42 -> 9;
            case 43 -> 14;
            case 44 -> 58;
            case 45 -> 35;
            case 46 -> 43;
            case 47 -> 23;
            case 48 -> 37;
            case 49 -> 33;
            case 50 -> 40;
            case 51 -> 13;
            case 52 -> 49;
            case 53 -> 55;
            case 54 -> 17;
            case 55 -> 18;
            case 56 -> 56;
            case 57 -> 38;
            case 58 -> 20;
            case 59 -> 59;
            case 60 -> 7;
            case 61 -> 31;
            case 62 -> 24;
            default -> 48;
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
        _0B.d[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "Zo0ZY\fGz2\u001b\\P\u000eH";
        objectArray[1] = "l\u0019\u000631ze\u0017\u0005zrwc\u0017\u0011xoq!\u0002\u000ee(`}\u0013\u00183\u001bez\"\u000ee(`}\u0013";
        objectArray[2] = Integer.TYPE;
        _0B.d[2] = "java/lang/Integer";
        objectArray[3] = "y\u0000J\u0011\u000e>p\u000eIXM3v\u000e]ZP54\u001c^L\u00174w\u001c\tx\u0013$^\nQV\u00004";
        objectArray[4] = "qlk3gIzcz|\u001aQids5";
        objectArray[5] = "0ap;3_9osrpR?ogpmT}zxm*E!kn;\nU+zhg;v<|pt*";
        objectArray[6] = "O5_M\u000bmF;\\\u0004H`@;H\u0006Uf\u0002.W\u001b\u0012w^?AM!rY\u000eW\u001b\u0012w^?d\n\u0003u";
        objectArray[7] = "\u0015+Dk$_\u0015+S7(P\u000f`S)(E\b\u0011\u0001wx\u0005L";
        objectArray[8] = ";+UQet;+B\ri{!`B\u0013in&\u0011\u0010M9.c";
        objectArray[9] = ":\u001fp4Db3\u0011s}\u0007o5\u0011g\u007f\u001aiw\u0004xb]x+\u0015n4hi=\u0002xiZ@6\u0014x";
        objectArray[10] = "\u0015g\b\rL[\u001ci\u000bD\u000fV\u001ai\u001fF\u0012PX|\u0000[UA\u0004m\u0016\rg]\u001a|\u0000Ql[\u0012m";
        objectArray[11] = Boolean.TYPE;
        _0B.d[11] = "java/lang/Boolean";
        objectArray[12] = ">qs\u0006\u0004 7\u007fpOG-1\u007fdMZ+smg[\u001d*0m0z\f!9{l{\u0010<){s";
        objectArray[13] = "]\u0012rq\u0005(]\u0012e-\t'GYe3\t2@(7oYp\u0017\u0014j>\u001b2lF6nZ";
        objectArray[14] = "hZQqJ`\u001dzZ~[/|tQu_u\b";
        objectArray[15] = "Z3Wk\u001e\u0019G&U*\u001bE\u0006\u0000";
        objectArray[16] = "hq";
        objectArray[17] = "(J\":Nr]j)5_=<d\">[gH";
        objectArray[18] = "Or \u0005>;:R+\n/t[\\ \u0001+./";
        objectArray[19] = Void.TYPE;
        _0B.d[19] = "java/lang/Void";
        objectArray[20] = "\u001cm_\u0014/Z\u001fc\u00077x@\u0013N\\\u0013gQ\u0004";
        objectArray[21] = "\u0017C";
        objectArray[22] = "N+0VYfK>;VwdG?2\n`eH5$";
        objectArray[23] = "LkIH[YEeJ\u0001\u0018TCe^\u0003\u0005R\u0001w]\u0015BSBw\n%Y[BeJ\u0002sXLk@\u0003D";
        objectArray[24] = "4\fs33.A,x<\"a \"s7&;T";
        objectArray[25] = "1\u0015x\u0003\u0007y1\u0015o_\u000bv+^oA\u000bc,/=\u001d[!";
        objectArray[26] = "\nX#YZP\u000fM(YE^\u0016^!\u001a\u0018j\u0000G+\u0005Or\u0011C(";
        objectArray[27] = Long.TYPE;
        _0B.d[27] = "java/lang/Long";
        objectArray[28] = "\u0016uG\\d\u0001\u001dzV\u0013\u0005\u000f\u0016qRI";
        objectArray[29] = "f'\u0013]%6!h\u000b%p9'8\bIBjk`W\u0019\u0015mc$P_d)4>\b%";
        objectArray[30] = "\u0001\tA\u0016we\u0007\u001c\u001d\u0000\u001crA\u001e\u0014\u0000qR\\\u0016\u0018\u0015zuv\u0015\u0016\u001bptAs\u0012\u001fqp\n\u0016\u0011\fnx;";
        objectArray[31] = "\u0012\u000f\u0018\u000e\u007f\u0013VX\u0002V\u0005\rFK$\\d\rKKd\be\u0018\u0016N\u0018\bz\u001e\u00137]Q\u007f_RK]NyZ+";
        objectArray[32] = "x^Foc~>\b\u0019 \u001f$>\u000f\u001avv'DZ\u001bj\":8Z\u0004l'C";
        objectArray[33] = "w\b\\ui\u001d0GD\r7\u001e'\u0013LZgGwF\u001f\reN;\u0011Fj!\u00181H";
        objectArray[34] = "%\":&\u0014ybm\"^Jzu9*\t\u001a &d}^\u0019$`c~9Gvj,";
        objectArray[35] = "'M{\u001cq\u0003&\u00175\u001a\u000b\u0001+\u0012\fBs\u0015F\u0015.\u0019`\u0018&\u0017!Gud$\u001e{Nw\u0004&\u0011%[\u000b\u0006/K,Yk\u0004 \u00159%g\u000b-M~\u001fe\u0000#\u0012G";
        objectArray[36] = "m9\u001dY[vn*\u0002Qjlx;\f]6t^7\u0000L\u0017ioZI\b\u0016,x+\r_\ft\u0002;H\u000e\u001a~8e\u0002\tR\u0013n5\u001b\nS)l>\u0015Uj";
        objectArray[37] = "\u001cQ\u0013s\u0015\u0003MM_}\u007f\u0001LRNp\u00133\u001e\u0013\u0014&Dd\u001fKLkOX\u001c\u0011Nf\u007fZDLR'CY\u001eN_\u0017@\u0005\u0019@\u0012uGUJH.(\u001e\\O\u0012L/N\u000fG.\u0011n\u0002TJ\u0014Lp\u0001\u001e!\u0013\u0011oA\\FMCe\u000ed";
        objectArray[38] = "RC(f9\u0005_\n=yS\u0004F\u001f:}>%M\u000e>K.\u0001R\u001f)\u0001j\u000fFO*}j\u0010@JSl=RN\u0018)m(RWr";
        objectArray[39] = "\fQyV\u0005g\u000f\u000b{[5\u0001\u007flVci[\fQyV\u0005g\u000f\u000b{[";
        objectArray[40] = "\u001ca\r|{k\u001d;Cz\u0001i\u0010>x)mv\u0010 JElb@)[?mw@01'h0\u0016'Q%gn\u0003[";
        objectArray[41] = "/\u000ejQ\u0012V.\u001bjHxV/\u001f6E\u0014,/\u000ejQ\u0012V.\u001bjHx";
        objectArray[42] = "P\u000egi\u0016G\u000bY4l'M\u0000\u0004h=p\u001fPX<Q\u0016D\nQ=5M\u0013YT";
        objectArray[43] = "\u0007k\u0004FK\t@$\u001c>CkZ$\u0016\u0005\u001b\u000b_sF\u0005{\n\u0002*\bSATH-@>";
        objectArray[44] = "~\\5%|J9\u0013-]|(#\u0013'f,H&DwfLD,HsdvF'F,]";
        objectArray[45] = ")iu\u0010W&w#rX:w,60\r:p':qY\u0000r,4.`";
        objectArray[46] = "\nu\u0002.oS\f`^8\u0004DJbW8is]\u007fB9~B04Q}e\u0015\u000btF&a/\toDy}S\tpB|\u0004\u0013\r2A89U[m\u000eD=OJ2G8=PL7>}dU\rvB}{S\b\u000f\u0007$~\u0012Is\u0007;x\u001706^>9VL6A8</\t7B{~^M`X#\u0004";
        objectArray[47] = "y;nWz4x.nN\u00106i)SH`'\u007f),\u001e*+hU>K-<~/?^-%\u0014";
        objectArray[48] = "c\u0016V\u001aw\u0016e\u0003\n\f\u001c\u0001#\u0001\u0003\fq64\u001c\u0016\rf\u0007\u0007\r\u0007\u000f\u001cSa\u0010U\nm\u00176\n\rp [(\n\f\u0017d\r\"Sj";
        objectArray[49] = "\u007f\u001cW\u0010D\u0003~\tW\t.\u0003\u007f\u0017\u0003\u0003H\u0018t\u001dj[N\u0003/\u000b\u0016[Q\u0005*r";
        objectArray[50] = "*$@&=5mkX^c6z?P\t0i&d\u0000^4okdF/p8q<";
        objectArray[51] = "o\n\rM\u0012W+]\u0017\u0015hI;N?\u0015\u0012C?NqNU\u001b)NL\b\u0003Df2";
        objectArray[52] = "j\u000e'\f$\u00061Yt\t\u0015\f:\u0004(XB^jXs4$\u00050Q}P\u007fRcT";
        objectArray[53] = "hpg/qI,'}w\u000bW<4DqgD1H\"pq\u0005(4\"ow\u0000Qq{j6A-qdl38";
        objectArray[54] = "8IC>$*\u007f\u0006[F(He\u0006Q}t(`Q\u0001}\u0014qeL\u0002?hqzJ\u0007F";
        objectArray[55] = "\u0001|^Hl1\u0017%LIWjhr\u001a^.\"\u0014([\b&";
        objectArray[56] = "w0h5s4&8/:Ik*'M?,|#6l\u001d o'6\u0016k69#1q:*u-[";
        objectArray[57] = "{c\u0012OdI<,\n7k+&,\u0000\f4K#{P\fT\u0012&fSN(\u00129`V7";
        objectArray[58] = "\u000b7x6o\u0001Z??9U^V J8+PP1\u0006o/\rQ7zi:QG\\";
        Object[] objectArray2 = objectArray;
        objectArray[59] = "%kv\u000b#1{!qCNn)/(\u001c\"\\zlwE\u007f\u000b&:t\u00102k$5*\u0005N";
    }

    /*
     * Exception decompiling
     */
    private class_1011 cfr_renamed_4(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
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

    public int cfr_renamed_7(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (int)_0B.a("\u00c8", (Object)_0B.a("\u00c8", (Object)((Object)this), -8168941792836047456L, (long)l2), 0, -8168798674358575525L, (long)l2);
    }

    public void cfr_renamed_8(Object[] objectArray) {
        byte[] byArray = (byte[])objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = (l2 = a ^ l2) ^ 0xC566D4ADD49L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = _0B.a("\u00c8", (Object)_0B.a("\u00db", (int)byArray.length, -1069326413276760652L, (long)l2), (Object)byArray, -1068887200306374948L, (long)l2);
        _0B.a("\u00c8", (Object)((Object)this), (Object)objectArray2, -1068953400386332530L, (long)l2);
    }

    public static void cfr_renamed_8(_4w[] wArray) {
        cfr_renamed_6 = wArray;
    }

    public int cfr_renamed_9(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (int)_0B.a("\u00c8", (Object)_0B.a("\u00c8", (Object)((Object)this), 2381877099147461132L, (long)l2), 0, 2379048296941502181L, (long)l2);
    }

    public void cfr_renamed_0(Object[] objectArray) {
        ByteBuffer byteBuffer = (ByteBuffer)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = (l2 = a ^ l2) ^ 0x440458282808L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        CallSite callSite = _0B.a("\u00c8", (Object)((Object)this), (Object)objectArray2, -6975049926273921366L, (long)l2);
        _4w[] wArray = _0B.cfr_renamed_5();
        _0B.a("\u00c8", (Object)byteBuffer, -6975207195947004956L, (long)l2);
        _4w[] wArray2 = wArray;
        try {
            _0B.a("\u00db", (long)_0B.a("\u00db", (Object)byteBuffer, -6975105614452863321L, (long)l2), (long)_0B.a("\u00c8", (Object)callSite, -6973959339223747796L, (long)l2), (long)((long)_0B.a("\u00c8", (Object)byteBuffer, -6974625639754757556L, (long)l2)), -6975599691887160135L, (long)l2);
            _0B.a("\u00c8", (Object)_0B.a("\u00c8", (Object)_0B.a("\u00db", -6973866764727101484L, (long)l2), -6971919282824295521L, (long)l2), (Object)_0B.a("\u00c6", (Object)((Object)this), -6974456967044691792L, (long)l2), (Object)callSite, -6975961855479719695L, (long)l2);
            _0B.a("\u00c8", (Object)callSite, -6975493177970776213L, (long)l2);
            if (_4w.cfr_renamed_8() == null) {
                _0B.cfr_renamed_8(new _4w[3]);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw _0B.a(illegalArgumentException);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_0B.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

