/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 */
package dev.krypton;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.vertex.VertexFormat;
import dev.krypton._6N;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _00 {
    public static GpuBuffer cfr_renamed_0;
    public static GpuBuffer cfr_renamed_1;
    public static _6N cfr_renamed_2;
    private static final long a;
    private static final long b;
    private static final Object[] c;
    private static final String[] d;

    private _00() {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = l.a(6921400583871789297L, 3700221593972770292L, MethodHandles.lookup().lookupClass()).a(176608358660709L);
        c = new Object[28];
        d = new String[28];
        _00.a();
        long l2 = a ^ 0xE7AAA04F4EBL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l2 >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l3 = 316457839680585346L;
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
        Method method = _00.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _00.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _00.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _00.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _00.a(l2, l3);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                _00.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(long l2, long l3) {
        int n = _00.a(l2, l3);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = _00.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _00.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _00.a(clazz3, string2, clazz2)) != null) {
                    _00.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _00.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _00.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _00.b(1060164609520405L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _00.a(l2, l3);
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
                clazz3 = _00.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _00.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _00.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _00.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _00.b(1060164609520405L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _00.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _00.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _00.b(1060164609520405L, 0L);
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
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/00" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _00.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'j' || c == '\u00ed' || c == '\u00e3' || c == '\u00de') {
                field = _00.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'j' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ed' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _00.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'l' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'A' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "o[\u001b\b9erN\u0019I<9=p";
        objectArray[1] = "\u0005\u0007w\u0003Zzp'|\fK5\u0011)w\u0007Ooe";
        objectArray[2] = Void.TYPE;
        _00.d[2] = "java/lang/Void";
        objectArray[3] = "X%\u0011C2M-\u0005\u001aL#\u0002L\u000b\u0011G'X8";
        objectArray[4] = "d?.D\u0014k\u0011\u001f%K\u0005$p\u0011.@\u0001~\u0004";
        objectArray[5] = "PU\b[6!%u\u0003T'nD{\b_#40";
        objectArray[6] = "2#nP@:;-m\u0019\u00037=-y\u001b\u001e1\u007f.v\u0018K0#?-9] \u00139e\u0018H'";
        objectArray[7] = "5\u000ez@3\u0006(\u001bx\u00016Za[";
        objectArray[8] = "Vf%<P+#F.3AdBH%8E>6";
        objectArray[9] = "\u001aJo\\sk\u0007_m\u001dv7NA";
        objectArray[10] = "W\t?~f\u001a^\u0007<7%\u0017X\u0007(58\u0011\u001a\u00107\"\u007f\u0010LH\u00045y\u0001Q\u001e\u0014?y\u0018U\u0012";
        objectArray[11] = "d\u0007++@t\u0011' $Q;p)+/Ua\u0004";
        objectArray[12] = "\bd}M\r9\u0001j~\u0004N4\u0007jj\u0006S2E}u\u0011\u00143\u0013%F\u0006\u0012\"\u000esV\f\u0012;\n\u007f4\u0000\f7\u0018xOVUo]";
        objectArray[13] = "|1\u0017\u0017+\u0005\t\u0011\u001c\u0018:Jh\u001f\u0017\u0013>\u0010\u001c";
        objectArray[14] = Integer.TYPE;
        _00.d[14] = "java/lang/Integer";
        objectArray[15] = "\u0016\u0003\u001b'rg\u001d\f\nh\u0013i\u0016\u0007\u000e2";
        objectArray[16] = "'^g\fU\u001ev\u0007.\r?\u0018\u001a\u0002#N\u0006Af\u001d:\u000b";
        objectArray[17] = "/\\\u000b@Y}0ENy\u0005\u0001x\u001a\u0007HBm%\u0012O\u001c>8;H]\u001cY}6\u001d\ty";
        objectArray[18] = "4eZ\f6m+|\u001f5`\u0011c#V\u0004-}>+\u001ePQ-='X\u00045x.w\u00005";
        objectArray[19] = "\u0013`\u007fE0\\\fy:|n D&sM+L\u0019.;\u0019WF\n\"{\u001b+Y\u0013gB";
        objectArray[20] = "3\u007f\u0017\n\u0003v,fR3Y\nd9\u001b\u0002\u0018f91SVd3'kAV\u0003v*>\u00153";
        objectArray[21] = "z;dG*?e\"!~tC-}hO1/pu \u001bM\u007fsyfO)*`)>~";
        objectArray[22] = "v\u0011\u0017m*F*\u001cU{X\u0017'\u001eIe\u000fCyH\u00128XI$II{g\u0015)\u000b_";
        objectArray[23] = "1\u0005=,\fw`\\t-f~\f\u0003inY~hVz>\u0001";
        objectArray[24] = "\u001a7;\rR\b\u0005.~4\ftMq7\u0005I\u0018\u0010y\u007fQ5M\u000e#mQR\b\u0003v94";
        objectArray[25] = "4.A\nL\u001eew\b\u000b&\u0016\t(\u0015H\u0019\u0017m}\u0006\u0018A";
        objectArray[26] = "hfz^dQw\u007f?g?-? vV\u007fAb(>\u0002\u0003D6\u007f#\u0007dGry9g";
        Object[] objectArray2 = objectArray;
        objectArray[27] = "\\.dGdbS#w\u000f\u0007`bl{V}:\t#qI>";
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
        if (d[n3] != null) {
            return n3;
        }
        Object object = c[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 44;
            case 1 -> 55;
            case 2 -> 16;
            case 3 -> 6;
            case 4 -> 17;
            case 5 -> 46;
            case 6 -> 39;
            case 7 -> 0;
            case 8 -> 5;
            case 9 -> 15;
            case 10 -> 28;
            case 11 -> 18;
            case 12 -> 32;
            case 13 -> 58;
            case 14 -> 33;
            case 15 -> 30;
            case 16 -> 42;
            case 17 -> 49;
            case 18 -> 22;
            case 19 -> 29;
            case 20 -> 60;
            case 21 -> 34;
            case 22 -> 63;
            case 23 -> 13;
            case 24 -> 41;
            case 25 -> 8;
            case 26 -> 27;
            case 27 -> 38;
            case 28 -> 61;
            case 29 -> 43;
            case 30 -> 48;
            case 31 -> 51;
            case 32 -> 19;
            case 33 -> 52;
            case 34 -> 54;
            case 35 -> 45;
            case 36 -> 57;
            case 37 -> 59;
            case 38 -> 11;
            case 39 -> 20;
            case 40 -> 35;
            case 41 -> 25;
            case 42 -> 24;
            case 43 -> 37;
            case 44 -> 4;
            case 45 -> 12;
            case 46 -> 21;
            case 47 -> 56;
            case 48 -> 50;
            case 49 -> 10;
            case 50 -> 1;
            case 51 -> 9;
            case 52 -> 23;
            case 53 -> 3;
            case 54 -> 47;
            case 55 -> 7;
            case 56 -> 36;
            case 57 -> 53;
            case 58 -> 40;
            case 59 -> 2;
            case 60 -> 62;
            case 61 -> 26;
            case 62 -> 14;
            default -> 31;
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
        _00.d[n3] = new String(cArray);
        return n3;
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

    public static void cfr_renamed_0(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x1488D2C0FAC6L;
        long l5 = l3 ^ 0x2C5DD03265EAL;
        long l6 = l3 ^ 0x6E8AB6480A6FL;
        long l7 = l3 ^ 0x328DC35FD00AL;
        long l8 = l3 ^ 0x4F3CC8EF85BFL;
        long l9 = l3 ^ 0xA3B30BDA3AFL;
        long l10 = l3 ^ 0x539D37B1E2B7L;
        long l11 = l3 ^ 0x4DAFFF67C022L;
        int n = (int)(l11 >>> 32);
        int n2 = (int)(l11 << 32 >>> 48);
        int n3 = (int)(l11 << 48 >>> 48);
        _00.a("\u00de", (_6N)new _6N(n, (VertexFormat)_00.a("\u00e3", -5388362966914421557L, (long)l2), (VertexFormat.class_5596)_00.a("\u00e3", -5387496669683797870L, (long)l2), 4, (short)n2, (int)b, n3), -5387873498340466702L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l10;
        _00.a("l", (Object)_00.a("\u00e3", -5387873498340466702L, (long)l2), (Object)objectArray2, -5388481022391222124L, (long)l2);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = -1.0;
        objectArray3[1] = -1.0;
        objectArray3[0] = l5;
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l9;
        Object[] objectArray5 = new Object[3];
        objectArray5[2] = 1.0;
        objectArray5[1] = -1.0;
        objectArray5[0] = l5;
        Object[] objectArray6 = new Object[1];
        objectArray6[0] = l9;
        Object[] objectArray7 = new Object[3];
        objectArray7[2] = 1.0;
        objectArray7[1] = 1.0;
        objectArray7[0] = l5;
        Object[] objectArray8 = new Object[1];
        objectArray8[0] = l9;
        Object[] objectArray9 = new Object[3];
        objectArray9[2] = -1.0;
        objectArray9[1] = 1.0;
        objectArray9[0] = l5;
        Object[] objectArray10 = new Object[1];
        objectArray10[0] = l9;
        Object[] objectArray11 = new Object[5];
        objectArray11[4] = (int)_00.a("l", (Object)_00.a("l", (Object)_00.a("\u00e3", -5387873498340466702L, (long)l2), (Object)objectArray9, -5387822582058203881L, (long)l2), (Object)objectArray10, -5388283264772643709L, (long)l2);
        objectArray11[3] = (int)_00.a("l", (Object)_00.a("l", (Object)_00.a("\u00e3", -5387873498340466702L, (long)l2), (Object)objectArray7, -5387822582058203881L, (long)l2), (Object)objectArray8, -5388283264772643709L, (long)l2);
        objectArray11[2] = (int)_00.a("l", (Object)_00.a("l", (Object)_00.a("\u00e3", -5387873498340466702L, (long)l2), (Object)objectArray5, -5387822582058203881L, (long)l2), (Object)objectArray6, -5388283264772643709L, (long)l2);
        objectArray11[1] = (int)_00.a("l", (Object)_00.a("l", (Object)_00.a("\u00e3", -5387873498340466702L, (long)l2), (Object)objectArray3, -5387822582058203881L, (long)l2), (Object)objectArray4, -5388283264772643709L, (long)l2);
        objectArray11[0] = l6;
        _00.a("l", (Object)_00.a("\u00e3", -5387873498340466702L, (long)l2), (Object)objectArray11, -5387611991068619988L, (long)l2);
        Object[] objectArray12 = new Object[1];
        objectArray12[0] = l4;
        _00.a("l", (Object)_00.a("\u00e3", -5387873498340466702L, (long)l2), (Object)objectArray12, -5387978154363775832L, (long)l2);
        Object[] objectArray13 = new Object[1];
        objectArray13[0] = l7;
        _00.a("\u00de", (GpuBuffer)_00.a("l", (Object)_00.a("\u00e3", -5387873498340466702L, (long)l2), (Object)objectArray13, -5387698148574864282L, (long)l2), -5388502745059483927L, (long)l2);
        Object[] objectArray14 = new Object[1];
        objectArray14[0] = l8;
        _00.a("\u00de", (GpuBuffer)_00.a("l", (Object)_00.a("\u00e3", -5387873498340466702L, (long)l2), (Object)objectArray14, -5387770597080529126L, (long)l2), -5387549329958123153L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_00.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

