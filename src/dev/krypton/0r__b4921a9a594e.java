/*
 * Decompiled with CFR 0.152.
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
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
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Renamed from dev.krypton.0r
 */
public class _0r_0 {
    private static final AtomicLong cfr_renamed_6;
    private static ScheduledExecutorService cfr_renamed_3;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static final long[] h;
    private static final Long[] i;
    private static final Map j;
    private static final Object[] k;
    private static final String[] l;

    /*
     * Enabled aggressive block sorting
     */
    static {
        a.b3478b03966d6fbad.a.init(_0r_0.class, 6);
        a = dev.krypton.l.a(-7921346552608971433L, -4620240024591201067L, MethodHandles.lookup().lookupClass()).a(239952090819920L);
        long l2 = a ^ 0x4E6F4C8B3905L;
        k = new Object[48];
        l = new String[48];
        _0r_0.a();
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l2 >>> 56);
        for (int j = 1; j < 8; ++j) {
            byArray2 = byArray2;
            byArray2[j] = (byte)(l2 << j * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[2];
        int n = 0;
        String string = "PI\u0083i\u00db\u00f1W2L\u001fW!n\u009b\u009b\u00e9\u0001WI\u001d\u00be\u0091\u00ce\u00d0\u0080\u00d6\u00c4\u00bcp&V\u00c8 \u00a7\u00c2\u0011\u00ef\u0089kx\u00f5d\u0097\u0011\u00d5J\u00ff\u00f7p\u00d5g\u009b\u00b5\u0096W\u0002\u0088\u00a7\u009f\u00a8\u00e1l>\u0085\u00d7";
        int n2 = "PI\u0083i\u00db\u00f1W2L\u001fW!n\u009b\u009b\u00e9\u0001WI\u001d\u00be\u0091\u00ce\u00d0\u0080\u00d6\u00c4\u00bcp&V\u00c8 \u00a7\u00c2\u0011\u00ef\u0089kx\u00f5d\u0097\u0011\u00d5J\u00ff\u00f7p\u00d5g\u009b\u00b5\u0096W\u0002\u0088\u00a7\u009f\u00a8\u00e1l>\u0085\u00d7".length();
        int n3 = 32;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = _0r_0.a(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        b = stringArray;
        c = new String[2];
        g = new HashMap(13);
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l2 >>> 56);
        for (int j = 1; j < 8; ++j) {
            byArray5 = byArray5;
            byArray5[j] = (byte)(l2 << j * 8 >>> 56);
        }
        cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n6 = 0;
        String string2 = "\u00eb\u0004\u00f4\u00b2U\u00da~\u00d1\u0086\u00ef\u0093S\u0081ij\u0084\u00c0\u00b0\r\u00b3:\u00ad\u0014Y";
        int n7 = "\u00eb\u0004\u00f4\u00b2U\u00da~\u00d1\u0086\u00ef\u0093S\u0081ij\u0084\u00c0\u00b0\r\u00b3:\u00ad\u0014Y".length();
        int n8 = 0;
        do {
            byte[] byArray6 = string2.substring(n8, n8 += 8).getBytes("ISO-8859-1");
            int n9 = n6++;
            long l3 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
            lArray[n9] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n8 < n7);
        e = lArray;
        f = new Integer[3];
        j = new HashMap(13);
        Cipher cipher3 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory3 = SecretKeyFactory.getInstance("DES");
        byte[] byArray8 = new byte[8];
        byte[] byArray9 = byArray8;
        byArray8[0] = (byte)(l2 >>> 56);
        for (int j = 1; j < 8; ++j) {
            byArray9 = byArray9;
            byArray9[j] = (byte)(l2 << j * 8 >>> 56);
        }
        cipher3.init(2, (Key)secretKeyFactory3.generateSecret(new DESKeySpec(byArray9)), new IvParameterSpec(new byte[8]));
        long[] lArray2 = new long[3];
        int n10 = 0;
        String string3 = "\u00a9\u00ba\u00edb\u00be\u00b71P\u001d\u00abjH\u0017H\\\u0004\u000b\u00c6\u00eb\u009d\u00cd\u00b3\u008e_";
        int n11 = "\u00a9\u00ba\u00edb\u00be\u00b71P\u001d\u00abjH\u0017H\\\u0004\u000b\u00c6\u00eb\u009d\u00cd\u00b3\u008e_".length();
        int n12 = 0;
        do {
            byte[] byArray10 = string3.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            long l4 = ((long)byArray10[0] & 0xFFL) << 56 | ((long)byArray10[1] & 0xFFL) << 48 | ((long)byArray10[2] & 0xFFL) << 40 | ((long)byArray10[3] & 0xFFL) << 32 | ((long)byArray10[4] & 0xFFL) << 24 | ((long)byArray10[5] & 0xFFL) << 16 | ((long)byArray10[6] & 0xFFL) << 8 | (long)byArray10[7] & 0xFFL;
            byte[] byArray11 = cipher3.doFinal(new byte[]{(byte)(l4 >>> 56), (byte)(l4 >>> 48), (byte)(l4 >>> 40), (byte)(l4 >>> 32), (byte)(l4 >>> 24), (byte)(l4 >>> 16), (byte)(l4 >>> 8), (byte)l4});
            lArray2[n13] = ((long)byArray11[0] & 0xFFL) << 56 | ((long)byArray11[1] & 0xFFL) << 48 | ((long)byArray11[2] & 0xFFL) << 40 | ((long)byArray11[3] & 0xFFL) << 32 | ((long)byArray11[4] & 0xFFL) << 24 | ((long)byArray11[5] & 0xFFL) << 16 | ((long)byArray11[6] & 0xFFL) << 8 | (long)byArray11[7] & 0xFFL;
        } while (n12 < n11);
        h = lArray2;
        i = new Long[3];
        cfr_renamed_6 = new AtomicLong((long)_0r_0.d("\u00db", -4167464131882719971L, (long)l2));
    }

    private static native Class b(long var0, long var2);

    private static native int b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

    private static native CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2);

    private static native int b(int var0, long var1);

    private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

    private static native Field b(Class var0, String var1, Class var2);

    private static native CallSite c(MethodHandles.Lookup var0, String var1, MethodType var2);

    private static native Field c(long var0, long var2);

    private static native long c(int var0, long var1);

    private static native long c(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

    private static native Method d(long var0, long var2);

    private static native CallSite d(MethodHandles.Lookup var0, String var1, MethodType var2);

    private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

    private static native Field a(Class var0, String var1, Class var2);

    private static native CallSite a(MethodHandles.Lookup var0, String var1, MethodType var2);

    private static native MethodHandle a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

    private static native Object a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

    private static native String a(byte[] var0);

    private static native String a(int var0, long var1);

    private static native int a(long var0, long var2);

    private static native Object a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

    private static native void a();

    private static native Exception a(Exception var0);

    private static native Thread cfr_renamed_4(Runnable var0);

    private static native void cfr_renamed_7();

    public native void cfr_renamed_0(String var1);
}

