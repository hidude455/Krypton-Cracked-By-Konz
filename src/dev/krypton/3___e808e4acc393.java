/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 */
package dev.krypton;

import dev.krypton._07;
import dev.krypton._0j;
import dev.krypton._0k;
import dev.krypton._0t;
import dev.krypton._4m_0;
import dev.krypton._4w;
import dev.krypton._80;
import dev.krypton.l;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _3_ {
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static final Object[] h;
    private static final String[] i;

    public static InputStream cfr_renamed_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l2 = a ^ l2;
        return _3_.c("l", _3_.class, (Object)((String)((Object)_3_.a("a", 1917, (long)(0x781059FD6A89464BL ^ l2))) + string + (String)((Object)_3_.a("a", 1948, (long)(0x223F83F803EEC6ACL ^ l2)))), 1096897046371257267L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        _3_.a = l.a(-5724848780262501503L, -4570284386367786596L, MethodHandles.lookup().lookupClass()).a(29567864564339L);
                        _3_.h = new Object[106];
                        _3_.i = new String[106];
                        _3_.a();
                        _3_.d = new HashMap<K, V>(13);
                        var11 = _3_.a ^ 20229092216462L;
                        var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var11 >>> 56);
                        for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                            v2 = v2;
                            v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                        }
                        var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var20_3 = new String[18];
                        var18_4 = 0;
                        var17_5 = "WV\u00c1\u00ae\u00d0\u00c9\u00c9X`\u0091\u008f\u00d4r\u00cd?\u00c5\u00f8)\u00f1\u00db\u0090\u00efU\u00fd\u0010{\u001338\u0000\bf\u00d0\u00cc\u00ab\u00ca\u00b3\u00bf\u0007\u00d6\u00b5\u0010\u0017\u00c9F\u0019\u0091\u00c8\u0080\u0018h\u0085\u00ceM\u0006\u008e\u00c1\u001c\u0010\u00e55,\u0002\rU$X\u008d\u0087UjW\u00f2\u00c5N(H\u0006\u00b76@\u00ba\u00fa\u00f5\u008b\u00a1\"$g3\u00e5\u00a7\u00150\u00ce6\u00f4\u00a19\u0090/\u00e8\u00eb'!\n\u00c8G\u00f0\u001fv\u001e\u0084\u009c\u0090\u00e30\u008a\u009d\u00c4@0\u00e7e(u\u00c7\u00ec\u00a2\u00a3\u00bf.M\u00af\u00bf\u00a7\u00f6\u00a4\u0098\u0082\u00fb\u00c5\u00fb5\u00b4\u00e2\u00d7\u0084l\nv\u00da\u0017\u00d5/s\u0091s\u00c4\u00fd& \u0083\u00cb|8\u00d1\u0096\u00dce2\u00a7\u0080,r\u00c2\u0011\u00aa\\\u00eatWc\u0017\u00a3\u00f1BG\u00d5\u00c5\u0019\u007f\u00d2\u00a4\u0091$\u0095\u0013\u00d4m\u00f9`#\u001b\u0003\u00d3>\u00bd\u00fc.\u0086;8\u009aN\u0003\u00a5\u00d5\u00df\u0093\u00ef\u00f3\u0018\u0094H\u00f0N\nQ\u0081S\u0015\u0091\u00040\u00f3\u00e4s\u00f7oQ\u0085\u00cbI\u00d9g\u00b5(\u001e\u00e2\"\u00f2G6b\u0004*\u00e6\u00dc\u00e3\u00beq\u00a3\u00cbqn\u00c8\u00dc\u0094\u00f3\u00de3W\u00e1E\u00e3\u00d8\u00d7!\u001dh\u0019\u0085\u00e6\u00bc\u0087n\u00d6\u0018\u0002\u009a\u00fe\u00f8\u00e5\u00d6s:\u00cf\u00b8x\u00d9\u00f0+\u0098\u00f6\u00dc\u00b3\u00b5\u00f0&\u00d3\u00fc\u0081\u0010`\u00003\u0088\u0090U\u00b0\u00c1\u00af\u00f5P\u00fb\u001b\u00de5\u008a \u00dbCt_\u00f5\u00f9\u00cf\u00f6\u0014\u008a\u00b8\u00bc\u00ab\u00e3\u00c3\u00b0-\u00c9-\u00d7\u0088\u00fc\u0099\u0083\u00eb\u001f\u009c\u00c5\u0095\u00c2\u0095:@\u00aft\u0018\u0018F\u00e3$xa\u00f3\u009c\u0091T\u0006x\u00d4\u0004\u00ec!PB\\\u00ff\u00de\u0017\u008c\u00e6\u00b6\u00a3\u00ee\u0092}\u00ca\u00c9G1\u00d8\u00b5(8L\u0095\u00da\u00a9\tr%\u008e\u00d1\u00ceI\t`\u0094\u00c9Y\u001ax?\u009eN\u00f6\u00eb3(\u00f9[\u0016\u00a5I\u00e7\u0097\u00fa9Ik$\u00a0\u00a7cP\u0007\u008b\u00bf\u008fw\u00ad\u00b6G#\u00a3\u00a9\u0017\u00d5\u0017\u0092>;\b}\u00a7\u00af\u00b7B\u0091\u0018\u00d6R\u0094\u009d<\u000b\u00cc\u00c1e\u007fo\u0080\u009e\u009a\u0015\u0099Z\u0091\u0087p\u009bM;\u00ff8\u00e7\u0014\u00c6j\u008f\u0082V$\u00d4vg*\u00da\u001a\u00f0\u00ecP\u00a5\u00cd7\u00ccW\u009d\u00efPNc1\u009f\u00a3#@\u00dat)\u00d6:\u0000\u0099\u00f05}_\u008f\u00f5S\u0091\u0098qy\u001d-8\u00ccx\u00db";
                        var19_6 = "WV\u00c1\u00ae\u00d0\u00c9\u00c9X`\u0091\u008f\u00d4r\u00cd?\u00c5\u00f8)\u00f1\u00db\u0090\u00efU\u00fd\u0010{\u001338\u0000\bf\u00d0\u00cc\u00ab\u00ca\u00b3\u00bf\u0007\u00d6\u00b5\u0010\u0017\u00c9F\u0019\u0091\u00c8\u0080\u0018h\u0085\u00ceM\u0006\u008e\u00c1\u001c\u0010\u00e55,\u0002\rU$X\u008d\u0087UjW\u00f2\u00c5N(H\u0006\u00b76@\u00ba\u00fa\u00f5\u008b\u00a1\"$g3\u00e5\u00a7\u00150\u00ce6\u00f4\u00a19\u0090/\u00e8\u00eb'!\n\u00c8G\u00f0\u001fv\u001e\u0084\u009c\u0090\u00e30\u008a\u009d\u00c4@0\u00e7e(u\u00c7\u00ec\u00a2\u00a3\u00bf.M\u00af\u00bf\u00a7\u00f6\u00a4\u0098\u0082\u00fb\u00c5\u00fb5\u00b4\u00e2\u00d7\u0084l\nv\u00da\u0017\u00d5/s\u0091s\u00c4\u00fd& \u0083\u00cb|8\u00d1\u0096\u00dce2\u00a7\u0080,r\u00c2\u0011\u00aa\\\u00eatWc\u0017\u00a3\u00f1BG\u00d5\u00c5\u0019\u007f\u00d2\u00a4\u0091$\u0095\u0013\u00d4m\u00f9`#\u001b\u0003\u00d3>\u00bd\u00fc.\u0086;8\u009aN\u0003\u00a5\u00d5\u00df\u0093\u00ef\u00f3\u0018\u0094H\u00f0N\nQ\u0081S\u0015\u0091\u00040\u00f3\u00e4s\u00f7oQ\u0085\u00cbI\u00d9g\u00b5(\u001e\u00e2\"\u00f2G6b\u0004*\u00e6\u00dc\u00e3\u00beq\u00a3\u00cbqn\u00c8\u00dc\u0094\u00f3\u00de3W\u00e1E\u00e3\u00d8\u00d7!\u001dh\u0019\u0085\u00e6\u00bc\u0087n\u00d6\u0018\u0002\u009a\u00fe\u00f8\u00e5\u00d6s:\u00cf\u00b8x\u00d9\u00f0+\u0098\u00f6\u00dc\u00b3\u00b5\u00f0&\u00d3\u00fc\u0081\u0010`\u00003\u0088\u0090U\u00b0\u00c1\u00af\u00f5P\u00fb\u001b\u00de5\u008a \u00dbCt_\u00f5\u00f9\u00cf\u00f6\u0014\u008a\u00b8\u00bc\u00ab\u00e3\u00c3\u00b0-\u00c9-\u00d7\u0088\u00fc\u0099\u0083\u00eb\u001f\u009c\u00c5\u0095\u00c2\u0095:@\u00aft\u0018\u0018F\u00e3$xa\u00f3\u009c\u0091T\u0006x\u00d4\u0004\u00ec!PB\\\u00ff\u00de\u0017\u008c\u00e6\u00b6\u00a3\u00ee\u0092}\u00ca\u00c9G1\u00d8\u00b5(8L\u0095\u00da\u00a9\tr%\u008e\u00d1\u00ceI\t`\u0094\u00c9Y\u001ax?\u009eN\u00f6\u00eb3(\u00f9[\u0016\u00a5I\u00e7\u0097\u00fa9Ik$\u00a0\u00a7cP\u0007\u008b\u00bf\u008fw\u00ad\u00b6G#\u00a3\u00a9\u0017\u00d5\u0017\u0092>;\b}\u00a7\u00af\u00b7B\u0091\u0018\u00d6R\u0094\u009d<\u000b\u00cc\u00c1e\u007fo\u0080\u009e\u009a\u0015\u0099Z\u0091\u0087p\u009bM;\u00ff8\u00e7\u0014\u00c6j\u008f\u0082V$\u00d4vg*\u00da\u001a\u00f0\u00ecP\u00a5\u00cd7\u00ccW\u009d\u00efPNc1\u009f\u00a3#@\u00dat)\u00d6:\u0000\u0099\u00f05}_\u008f\u00f5S\u0091\u0098qy\u001d-8\u00ccx\u00db".length();
                        var16_7 = 24;
                        var15_8 = -1;
lbl23:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block13;
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = _3_.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "$\u00fe\u00ac\u001e\u0080l\u00e7oA\u00f9\u00d4\u008c\u008ef|\u00e1\u00a5'\\\u00b4?\u0081]\u00dd3\u00fe\u009c\u00c0\u0011c\u0090\u00a20\u00cdS\u00aeQ\u0091\u00170[\u00c0\u00c5\u009b\u0088V\u0088\u009e{*\u0019\u00da\u00b2\u0080:[\u00ffw\u00ff\u00c3\u00b6M\fX\u00ed\u00cee\u00d0\u00ea\u00da\u008d\u00d6\u00bfb\u00ba7\u00c2\u00e7jP\u00cc";
                            var19_6 = "$\u00fe\u00ac\u001e\u0080l\u00e7oA\u00f9\u00d4\u008c\u008ef|\u00e1\u00a5'\\\u00b4?\u0081]\u00dd3\u00fe\u009c\u00c0\u0011c\u0090\u00a20\u00cdS\u00aeQ\u0091\u00170[\u00c0\u00c5\u009b\u0088V\u0088\u009e{*\u0019\u00da\u00b2\u0080:[\u00ffw\u00ff\u00c3\u00b6M\fX\u00ed\u00cee\u00d0\u00ea\u00da\u008d\u00d6\u00bfb\u00ba7\u00c2\u00e7jP\u00cc".length();
                            var16_7 = 32;
                            var15_8 = -1;
lbl37:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block13;
                                break;
                            }
                            break;
                        }
lbl42:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = _3_.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block14;
                            break;
                        }
                    }
                    var21_9 = var13_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                _3_.b = var20_3;
                _3_.c = new String[18];
                _3_.g = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[2];
                var3_13 = 0;
                var4_14 = "\u00a33\u008aEBR\n8\u00a5\u0092\u00c5\u00e8\u00bb\u0001\u00a9\u0095";
                var5_15 = "\u00a33\u008aEBR\n8\u00a5\u0092\u00c5\u00e8\u00bb\u0001\u00a9\u0095".length();
                var2_16 = 0;
                while (true) {
                    break block15;
                    break;
                }
lbl76:
                // 1 sources

                while (true) {
                    var6_12[v10] = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
                    if (var2_16 < var5_15) ** continue;
                    break block16;
                    break;
                }
            }
            var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
            v10 = var3_13++;
            var8_18 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            ** while (true)
        }
        _3_.e = var6_12;
        _3_.f = new Integer[2];
    }

    /*
     * Exception decompiling
     */
    public static List java_util_List_9(Object[] var0) {
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

    public static InputStream java_io_InputStream_9(Object[] objectArray) {
        File file = (File)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = a ^ l2;
        try {
            return new FileInputStream(file);
        }
        catch (FileNotFoundException fileNotFoundException) {
            _3_.c("l", (Object)fileNotFoundException, 3426461322729588761L, (long)l2);
            return null;
        }
    }

    private static boolean cfr_renamed_1(char c, int n, int n2, File file) {
        Object object;
        block12: {
            block14: {
                block13: {
                    _4w[] wArray;
                    block10: {
                        long l2 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ a;
                        wArray = _0j.cfr_renamed_1();
                        try {
                            block11: {
                                try {
                                    try {
                                        try {
                                            object = _3_.c("l", (Object)file, -355073996980513214L, (long)l2);
                                            if (wArray == null) break block10;
                                            if (object == false) break block11;
                                        }
                                        catch (MatchException matchException) {
                                            throw _3_.a(matchException);
                                        }
                                        object = _3_.c("l", (Object)_3_.c("l", (Object)file, -355451089004900021L, (long)l2), (Object)_3_.a("a", 1919, (long)(0x55AF4840CB8BB26BL ^ l2)), -357469859303335310L, (long)l2);
                                        if (wArray == null) break block12;
                                    }
                                    catch (MatchException matchException) {
                                        throw _3_.a(matchException);
                                    }
                                    if (object != false) break block13;
                                }
                                catch (MatchException matchException) {
                                    throw _3_.a(matchException);
                                }
                            }
                            object = _3_.c("l", (Object)file, -352232349503791311L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw _3_.a(matchException);
                        }
                    }
                    try {
                        if (wArray == null) break block12;
                        if (object == false) break block14;
                    }
                    catch (MatchException matchException) {
                        throw _3_.a(matchException);
                    }
                }
                object = true;
                break block12;
            }
            object = false;
        }
        return (boolean)object;
    }

    public static byte[] byte_arr_9(Object[] objectArray) {
        InputStream inputStream = (InputStream)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = a ^ l2;
        try {
            return _3_.c("l", (Object)inputStream, -2329187553849219687L, (long)l2);
        }
        catch (Exception exception) {
            _3_.c("l", (Object)_3_.c("\u00ff", -2328455315040448478L, (long)l2), (Object)((String)((Object)_3_.a("a", 19241, (long)(0x3442EFD642305A90L ^ l2))) + (String)((Object)_3_.c("l", (Object)exception, -2329852480172498863L, (long)l2))), -2327014260383090007L, (long)l2);
            return new byte[0];
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/3_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _3_.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _3_.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _3_.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _3_.b(classArray2[j], string, clazz2, n, classArray);
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
            int n = _3_.a(l2, l3);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                _3_.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _3_.b(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static int b(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x6663;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])g.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/3_", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _3_.f[n2] = n3;
        }
        return f[n2];
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/3_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l2, long l3) {
        int n = _3_.a(l2, l3);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = _3_.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _3_.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _3_.a(clazz3, string2, clazz2)) != null) {
                    _3_.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _3_.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _3_.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _3_.b(254774800956997L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _3_.a(l2, l3);
        Object object = h[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = i[n];
                int n3 = string2.indexOf(8);
                clazz3 = _3_.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _3_.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _3_.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _3_.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _3_.b(254774800956997L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _3_.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _3_.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _3_.b(254774800956997L, 0L);
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
        if (i[n3] != null) {
            return n3;
        }
        Object object = h[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 28;
            case 1 -> 22;
            case 2 -> 5;
            case 3 -> 0;
            case 4 -> 41;
            case 5 -> 54;
            case 6 -> 30;
            case 7 -> 38;
            case 8 -> 32;
            case 9 -> 60;
            case 10 -> 52;
            case 11 -> 19;
            case 12 -> 56;
            case 13 -> 14;
            case 14 -> 55;
            case 15 -> 34;
            case 16 -> 12;
            case 17 -> 4;
            case 18 -> 26;
            case 19 -> 40;
            case 20 -> 35;
            case 21 -> 3;
            case 22 -> 10;
            case 23 -> 29;
            case 24 -> 48;
            case 25 -> 20;
            case 26 -> 46;
            case 27 -> 45;
            case 28 -> 23;
            case 29 -> 37;
            case 30 -> 44;
            case 31 -> 63;
            case 32 -> 18;
            case 33 -> 31;
            case 34 -> 51;
            case 35 -> 47;
            case 36 -> 1;
            case 37 -> 58;
            case 38 -> 53;
            case 39 -> 25;
            case 40 -> 2;
            case 41 -> 21;
            case 42 -> 8;
            case 43 -> 33;
            case 44 -> 27;
            case 45 -> 43;
            case 46 -> 16;
            case 47 -> 24;
            case 48 -> 50;
            case 49 -> 59;
            case 50 -> 36;
            case 51 -> 6;
            case 52 -> 17;
            case 53 -> 42;
            case 54 -> 13;
            case 55 -> 57;
            case 56 -> 11;
            case 57 -> 9;
            case 58 -> 62;
            case 59 -> 49;
            case 60 -> 7;
            case 61 -> 61;
            case 62 -> 39;
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
        _3_.i[n3] = new String(cArray);
        return n3;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x4E13;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l3 = Thread.currentThread().threadId();
                objectArray = (Object[])d.get(l3);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/3_", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l2 >>> 56);
            for (int j = 1; j < 8; ++j) {
                byArray[j] = (byte)(l2 << j * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            _3_.c[n2] = _3_.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00aa' || c == '\u00d6' || c == '\u00ff' || c == 'L') {
                field = _3_.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00aa' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d6' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ff' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _3_.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'l' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'o' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _3_.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/3_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "<\u001b\u001dG'\n7\u0014\f\bZ\u001f%\u000e\u000eK";
        objectArray[1] = "uP\u001aVb\u0014p\u001f<E%\u0013kb\u0018E)\u001cr";
        objectArray[2] = "\f\u0013\u0013[S\u0005\u0007\u001c\u0002\u0014.\u001d\u0014\u001b\u000b]";
        objectArray[3] = "\u0007\fu\u001e]P\f\u0003dQ<^\u0007\b`\u000b";
        objectArray[4] = "Psd\u001a[@Mff[^\u001c\u0004b";
        objectArray[5] = "+Vi\"\u0001'6Ckc\u0004{|l";
        objectArray[6] = "\u0010[\u001c2\u0018Fe{\u0017=\t\t\u0004u\u001c6\rSp";
        objectArray[7] = Void.TYPE;
        _3_.i[7] = "java/lang/Void";
        objectArray[8] = "_,>?\\xZc\u000e7\u001et";
        objectArray[9] = Boolean.TYPE;
        _3_.i[9] = "java/lang/Boolean";
        objectArray[10] = "-\u007f?\u001epCX_4\u0011a\f9Q?\u001aeVM";
        objectArray[11] = "N#2p.T;\u00039\u007f?\u001bZ\r2t;A.";
        objectArray[12] = "<\u0016E=\u001f\u0004?\u0018\u001d:X\u00063Yc=E\u0002";
        objectArray[13] = "\u001c\u0000cA(\u0016\u0019OSIj\u001a0\byTc\r";
        objectArray[14] = "m\u001a 0rF\u0018?%\u007fBNZ3q";
        objectArray[15] = "5%\rp:z+-\u0017?Xf,0";
        objectArray[16] = "NaAf\u00133StC'\u0016o\u001ei";
        objectArray[17] = "\nI\u0011\u000f,\u0010\u0017\\\u0013N)L^F";
        objectArray[18] = "\u0006\u0018dz7T\u001b\rf;2\bZM";
        objectArray[19] = "v>PjL\u0003\u0003\u001e[e]Lb\u0010PnY\u0016\u0016";
        objectArray[20] = "e\u0002%bd\b\u0010\".muGq,%fq\u001d\u0005";
        objectArray[21] = "\b4\u001cn\u0007g}\u0014\u0017a\u0016(\u001c\u001a\u001cj\u0012rh";
        objectArray[22] = "\u00069O@yq\u00069X\u001cu~\u001crX\u0002uk\u001b\u0003\n[\"<\u000b0Z\u001dgGYi\u0003";
        objectArray[23] = Integer.TYPE;
        _3_.i[23] = "java/lang/Integer";
        objectArray[24] = "yL\u001d_^cyL\n\u0003Rlc\u0007\n\u001dRydvXD\u0005";
        objectArray[25] = "Z\u0002\u0017\u0014xdG\u0017\u0015U}8\u000e\u001f";
        objectArray[26] = "\\M";
        objectArray[27] = "\nq*\u001ed-\u0001~;Q\t-\u0001c/";
        objectArray[28] = "e2\fJ* `}3Et<{\u0000\u000eYa(b";
        objectArray[29] = "ubJ\u0004&\b\u0000BA\u000b7GaLJ\u00003\u001d\u0015";
        objectArray[30] = ":bkB\u0019mOB`M\b\".LkF\fxZ";
        objectArray[31] = "\u0017e\u0010\u001d=>\tm\nRZ?\u0018v\u0007\b|9";
        objectArray[32] = "1u\u0000\u0001l5/}\u001aN\u0011%/";
        objectArray[33] = "{EC eB\u000eeH/t\rokC$pW\u001b";
        objectArray[34] = "\u0006\u0017\u0003^x$s7\bQik\u00129\u0003Zm1f";
        objectArray[35] = "\u0015a3u8<`A8z)s\u0001O3q-)u";
        objectArray[36] = "#4";
        objectArray[37] = "(W_lxW#XN#\u0013C!SYy?T,";
        objectArray[38] = "5SjZ_&0\u001cZR\u001d*\u0011]h}\u001e:1VYC\u0012*/FuT\u001f";
        objectArray[39] = "+]z+gM^}q$v\u0002?sz/rXK";
        objectArray[40] = "\u0014\u001a\fYF~\u0017\u0014T{\u0000q\f9\u000f^\u000eu\f";
        objectArray[41] = "\u001b-\b\u0003mD\u0018#P\u0001+K\u0003?\u001b\u0016mi\u0019-\f\u0011&^";
        objectArray[42] = "w+dqq\u0004t%<R&\u001ex\bgv9\u000fo";
        objectArray[43] = "?)";
        objectArray[44] = "~\u00066\u0004{j{\u0013=\u0004disZ\u0002~UIc\u00014^nmt";
        objectArray[45] = "7Axev\u00062Tsei\u0005:\u001dL\u001fX%\fup%n\u00186Up";
        objectArray[46] = "\n\u0011\u0012*\u0010\u0015\u007f1\u0019%\u0001Z\u001e?\u0012.\u0005\u0000j";
        objectArray[47] = "m\u001c";
        objectArray[48] = "#<t\u001e\\# 2,\u001c\u001a,;.g\u000b\\\u001e=<l\u001b\u0013?-\u001ej\u001e\u0000>,)q";
        objectArray[49] = "Keu~FyNp~~h{Bqw\"\u007fzM{a";
        objectArray[50] = "\b8#\u0005k\u001fYnl\u0004\u001b\u0010[ec\u0005\\\u00002;\u007f\u0002&\u001e_lr\f\"n\b8#\u0005k\u001fYnl\u0004\u001b";
        objectArray[51] = ">\u0006\u0007Y\u0013.#\u0001\n\u001c}0#'\u0019X\u001c*+|_\u001b@!4\r\u000eM\u000f D";
        objectArray[52] = "67`G\u00031}s \u001exu\f&u\u001bC'fs#GAL";
        objectArray[53] = "zO\u0017\r9w/LT\u0012S!sC\u0017ki&t\u000e\u001b\u0006>+z\nk";
        objectArray[54] = "<1p+_Efi$%:\r\u0007)!(TDeg$\u007f\u0003<e$\"3\u0001M7f&<:";
        objectArray[55] = "\u0018]uc\u0010\u001bB\u0005!mu^#E$`\u001b\u001aA\u000b!7Lb\u0019Ad:\u000e\u001fR\u0005$cu";
        objectArray[56] = "e\u0006`E=Ga]\"E\u0005\u001abe`Do@|\b7IaD\f\f9\u001feE6\bb]e}";
        objectArray[57] = "#8\u0018]N\u0013rnW\\>\u000f\u007fm^o_\u001ey\u0001\u001f\t\u0003\u000fipN_L\u000e\u0019?I_C\u001a'{OU]b";
        objectArray[58] = "eI2FGi2H/L+j5K\u0018\\Pb<J-[sl$WQ\f\u001285G ]Dw47";
        objectArray[59] = "X\\\u001fWqzY\u000e\nQA\u007f\\_\u001aF,\u0014X\\\u001fWqzY\u000e\nQA";
        objectArray[60] = "kc\u0004\u0015\u001e\u0003 'DLeDQ\"G\u0014\b\u000e s\u0011[\t~";
        objectArray[61] = "\u001e<qf\u0015\u0014Oj>ge\b]x%o\u001e$Kc+q\b.M~!\u000b_\\\u0019h<z\u000e\nViL5\t\nY}rq\u000f\u0000G\u0005";
        objectArray[62] = "8|G/HI%9\u001b<#@9<x'\u001aS88\u00028YJ*@\u0004k\u001c@/1\u0019.@SD";
        objectArray[63] = "GbC.Hq\u0004(KSIsXvX7W\t\u0003)\u0019>AxR\u007fV?14YiZ+AsDlKS";
        objectArray[64] = "ND\u0018%){\u0014\u001cL+L;u\\I&\"z\u0017\u0012Lqu\u0002\u0017QJ=wsE\u0013N2L";
        objectArray[65] = ")=~\u0001 \u0002se*\u000fEF\u0012%/\u0002+\u0003pk*U|{{9/\u0004}A\u007fbm\u0004E";
        objectArray[66] = "\u0016\r\u001b\u0005nxLN\u0006uczW\u0019\u001d\u000b\f-\u0012I\u0016\u0005}|D\u0006\u0017u6.\u0016\u0019\u000b\u0004gxY\u0018{";
        objectArray[67] = "/F\n:C62\u0003V)()7\u001bMBT{l\u0002^3I>0\u00115";
        objectArray[68] = "\n-X/^\u001f],E%2\u001eG2@#Is\t?T\"JMM9^<2";
        objectArray[69] = "\u0019o\u0001gu\u0014\u0017yZdN\u001ays_k5\u0017\u0005y\u0006i3";
        objectArray[70] = "Qm\u00062\u0013V\u0013v\u0011{\u007f\u0005Dl.g\u0004\u0011@\u007f\u0006\nES\u0014}\u001b{\u0014\u0005[|k";
        objectArray[71] = "\u0005Ped\u00166_\b1jss>H4g\u001d7\\\u000610JOUTb:\u0012(XWcas";
        objectArray[72] = "HJ\u007f'h'\u001fKb-\u0004/\u0014O`\u0019e/\u0018O\u001cfd6\u0019['=?)\u001a4-.?*\u000fDf(c3u";
        objectArray[73] = "\u00187~V\u001dm\u001bdsWd}\tf\u007fC\t\u0011\u00181'W\u000f`\u0005t{Ddk\u001eocA\u0006v\u0019b&/";
        objectArray[74] = "u\u0003EK\tt/[\u0011El6N\u001b\u0014H\u0002u,U\u0011\u001fU\rt\u001fT\u0012\u0017p?[\u0014Kl";
        objectArray[75] = "\u0006fH:\u0005a\u0002=\n:=2\u0003ir`\\1Ru\u001f7Q?V\u0005L6R&\u0017;\b0X8o";
        objectArray[76] = "o[NH\u0010\u00116D\u0017L \u0016fZq\u001fA\u00157F\u001cHL\u001b36OIO\u0002r\b\u000bOE\u001c\n";
        objectArray[77] = "Uy{v\u0005J['zhjzyUS?T'Y!b\u007f\u0013[Zro~";
        objectArray[78] = "zcs+Bo4`f,3kq6s=^Jz'w\u000bNne6`A\\mq>p,B}va\u001a=\u000f?s0k Jc`[";
        objectArray[79] = "\u0010\u0007\u001ej8eEQBhS7zRGl>\u007f\u000b\u0003\u0011#?\u000f\u0010\u0007\u001ej8eEQBhS";
        objectArray[80] = "k\u0000:F:E1XnH_\u0004P\u0018kE1D2Vn\u0012f<m\u0007(]'L*\u001a-L_";
        objectArray[81] = "\u0001g?-?\u0002P1p,O\u001eB#k$4s\u0001?h}?\u001eV2fyOMW1\u007f8q\tQ;a@";
        objectArray[82] = "6fqyn\u0019l%l\ta\fq\u001fo{k\u000brg,1c";
        objectArray[83] = "R,\u001f\u0014Z+\fi\u0005\u0015?+F8\u0007KV(<;\u000bWZ&Q%\u001bP\u0005L";
        objectArray[84] = "!\u001c2\u0012T\u0006=\u001a?\t1\u001b\"\u0010%\fj\u001f1\u001a ,K\n3\u001cCMQ\u001a&\t3\nL\u001f7q";
        objectArray[85] = "G\u0007+ICF\u0010\u00066C/E\u0017\u0005\u000ePJGzCq\u0004BZ\u000b\u0012'KC*";
        objectArray[86] = "%!\b3SP!zJ3k\u000b0/H:\u0017\r6BV/\u0017\f&r\u0003,T\u0013L";
        objectArray[87] = "boT\th@8,IyeB#NN\u001erB%jEy0\u0016b{D\ba@-z4C3\u00122fE\u0012e]3\u0016";
        objectArray[88] = "&M\u0011D\\dt\u000f\u0015Kgo)VDp\u0003q\u000eNTT\u001c\u00154\u0006CE\u001fo+EZWg";
        objectArray[89] = "3Q%;SkfRf$9;>V\u001f0I'W\u001352D#iW38Z[";
        objectArray[90] = "\b\u0012#Q\u0016.\u0012^sPd'\t\ndS3\u001d\u0013\u0001da\u0003:\t`fA\b1E\u000eg\u0013\u001d7u\u001c$\u0010\u001c7\u0004\u0001aL\u000f\\K\fwR\u001cb\u000f\n}Ld";
        objectArray[91] = "6\nzF{oa\u000bgL\u0017bp:xRz\u00035\u0018vKo=q\u001e|U\u0017";
        objectArray[92] = "\u001f\u001e2#I\nEFf-,B$\u0006c B\u000bFHfw\u0015sM\u001ac&\u0014IIA!&,";
        objectArray[93] = "\\F%x)\u000b\u0006\u001eqvLCg^t{\"\n\u0005\u0010q,ur\u0017\u0018%a4\b\b[<sL";
        objectArray[94] = "_\\\u001e\u0006Nd\u000bJX\u0012,1]YE\u0013@\u0003\u000e\u001b\u0015tB,I\u001c@\u0013\u001ciS\u001d%";
        objectArray[95] = "/\\B`c!+\\^6\u0004#DYKp8c9\u0012\u000f0a";
        objectArray[96] = "}T9V?_pW8\r^\u0003\u0016\rlP3Hg\\:\u001f28";
        objectArray[97] = "U\u001bkx.TX\u0018j#O\n>\u0007=%!K\\I8rv3\u0000\u0014h>7\rD\u0012b O";
        objectArray[98] = "*;\u0011gvJpcEi\u0013\u0003\u0011#@d}KsmE3*3/0\u0015\u007fk\rk6\u001fa\u0013";
        objectArray[99] = "AfL\u0003k\u0018\u0016gQ\t\u0007\u0015\u0007TN\tj\u001f\u0000\u007fU\u0002\u0007J\u0010wR\u000b9\u000e\u0016}Ls";
        objectArray[100] = "*\u00165!Bf.Mw!z;-u5 \u0010a3\u0018b-\u001eeCOn+G,.\u0018c%C\\*\u00165!Bf.Mw!z";
        objectArray[101] = "\u001a__\u0001l\u0007\u0000\u0013\u000f\u0000\u001e\u000e\u001bG\u0018\u0003I:\nQ*\u0018x\t!D\u0001\u0012E\t\u001dL\u0002\u0010\u001e\u000b\tA\tOp\n[T\u000f\u007fq\u0018\u001dH\u000e\u0012o\b\u001a\u0017d\u0010s\u000f\u0002G\t\u000ec\b]-\u000b\u0012d\u0010\r@\u0015\u0002cOgB\t\u0005{\u001f\n\\\u0019\u0002$u\u001b\u0011[\u0007u\u0004\u0006T\u0007\u0014\u001e";
        objectArray[102] = "#%\u0000w138-\u0015$^8,a\"s%0<g\u0013s\u0017,\u001aa\u0002s72A'A#3'0v\u0017l2W#oAce&q-El^";
        objectArray[103] = "uUg=U*/\r330kNM6>^+,\u00033i\tStIvdK.?\r6=0";
        objectArray[104] = "BJ<n=}\u0015K!dQm\u0018l6b1\u0011OY` ;*\u001cT6.Q";
        Object[] objectArray2 = objectArray;
        objectArray[105] = "'*R9-#*)SbL|L6\u0004d\"<.x\u00013uDr%Q\u007f4z6#[aL";
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

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _3_.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void void_0(Object[] var0) {
        block42: {
            block43: {
                block41: {
                    block54: {
                        block40: {
                            block39: {
                                var1_1 = (List)var0[0];
                                var2_2 = (Long)var0[1];
                                var4_3 = (File)var0[2];
                                var5_4 = (String[])var0[3];
                                v0 = var2_2 = _3_.a ^ var2_2;
                                v1 = v0 ^ 32220296727416L;
                                var6_5 = (int)(v1 >>> 48);
                                var7_6 = (int)(v1 << 16 >>> 32);
                                var8_7 = (int)(v1 << 48 >>> 48);
                                var9_8 = v0 ^ 72552643932385L;
                                var11_9 = v0 ^ 14818402293695L;
                                var13_10 = v0 ^ 26723049004117L;
                                var15_11 = _0j.cfr_renamed_1();
                                try {
                                    try {
                                        try {
                                            v2 = _3_.c("l", (Object)var4_3, (long)7481153800679785418L, (long)var2_2);
                                            if (var15_11 == null) break block39;
                                            if (v2 == false) break block40;
                                        }
                                        catch (MatchException v3) {
                                            throw _3_.a(v3);
                                        }
                                        v4 = var4_3;
                                        if (var15_11 == null) break block41;
                                    }
                                    catch (MatchException v5) {
                                        throw _3_.a(v5);
                                    }
                                    v2 = _3_.c("l", (Object)v4, (long)7483732146790679542L, (long)var2_2);
                                }
                                catch (MatchException v6) {
                                    throw _3_.a(v6);
                                }
                            }
                            if (v2 != false) break block54;
                        }
                        return;
                    }
                    v4 = var4_3;
                }
                var16_12 = _3_.c("l", (Object)v4, (Object)(FileFilter)LambdaMetafactory.metafactory(null, null, null, (Ljava/io/File;)Z, 9(char int int java.io.File ), (Ljava/io/File;)Z)((char)((char)var6_5), (int)var7_6, (int)var8_7), (long)7480861868626256256L, (long)var2_2);
                try {
                    v7 = var16_12;
                    if (var15_11 == null) break block42;
                    if (v7 != null) break block43;
                }
                catch (MatchException v8) {
                    throw _3_.a(v8);
                }
                return;
            }
            v7 = var16_12;
        }
        var17_13 = v7;
        var18_14 = ((CallSite)var17_13).length;
        var19_15 = 0;
        while (var19_15 < var18_14) {
            block52: {
                block53: {
                    block47: {
                        block55: {
                            block51: {
                                block48: {
                                    block44: {
                                        block45: {
                                            var20_16 = var17_13[var19_15];
                                            try {
                                                block46: {
                                                    try {
                                                        try {
                                                            v9 = var20_16;
                                                            v10 = var15_11;
                                                            if (var2_2 < 0L) break block44;
                                                            if (v10 == null) break block45;
                                                            if (_3_.c("l", (Object)v9, (long)7483732146790679542L, (long)var2_2) == false) break block46;
                                                        }
                                                        catch (MatchException v11) {
                                                            throw _3_.a(v11);
                                                        }
                                                        v12 = new Object[4];
                                                        v12[3] = var5_4;
                                                        v12[2] = var20_16;
                                                        v12[1] = var11_9;
                                                        v12[0] = var1_1;
                                                        _3_.c("o", (Object)v12, (long)7482523908272908190L, (long)var2_2);
                                                        if (var15_11 != null) break block47;
                                                    }
                                                    catch (MatchException v13) {
                                                        throw _3_.a(v13);
                                                    }
                                                }
                                                v9 = var20_16;
                                            }
                                            catch (MatchException v14) {
                                                throw _3_.a(v14);
                                            }
                                        }
                                        v15 = new Object[2];
                                        v10 = v15;
                                        v15[1] = var9_8;
                                    }
                                    v10[0] = v9;
                                    var21_17 = _3_.c("o", (Object)v10, (long)7481029871297272665L, (long)var2_2);
                                    try {
                                        if (var21_17 != null) break block48;
                                        break block47;
                                    }
                                    catch (MatchException v16) {
                                        throw _3_.a(v16);
                                    }
                                }
                                var22_18 = false;
                                var23_19 /* !! */  = var5_4;
                                var24_20 = var23_19 /* !! */ .length;
                                var25_21 = 0;
                                while (var25_21 < var24_20) {
                                    block49: {
                                        block50: {
                                            var26_22 = var23_19 /* !! */ [var25_21];
                                            try {
                                                try {
                                                    v17 = var15_11;
                                                    if (var2_2 <= 0L) break block49;
                                                    if (v17 == null) break block50;
                                                    v18 /* !! */  = _3_.c("l", var26_22, (Object)_3_.c("l", (Object)var21_17, (long)7479489130468554601L, (long)var2_2), (long)7482490088800588259L, (long)var2_2);
                                                    if (var15_11 == null) break block51;
                                                }
                                                catch (MatchException v19) {
                                                    throw _3_.a(v19);
                                                }
                                                if (v18 /* !! */ ) {
                                                }
                                                ** GOTO lbl126
                                            }
                                            catch (MatchException v20) {
                                                throw _3_.a(v20);
                                            }
                                            var22_18 = true;
                                            try {
                                                if (var2_2 > 0L) {
                                                    if (var15_11 != null) break;
                                                }
                                                break block50;
lbl126:
                                                // 2 sources

                                                ++var25_21;
                                            }
                                            catch (MatchException v21) {
                                                throw _3_.a(v21);
                                            }
                                        }
                                        v17 = var15_11;
                                    }
                                    if (v17 != null) continue;
                                }
                                if (var2_2 <= 0L) break block55;
                                v18 /* !! */  = var22_18;
                            }
                            if (v18 /* !! */ ) break block47;
                        }
                        var23_19 /* !! */  = new _07((_0t)var21_17, (Path)_3_.c("l", (Object)var20_16, (long)7483085744482002561L, (long)var2_2));
                        try {
                            try {
                                v22 = var15_11;
                                if (var2_2 < 0L) break block52;
                                if (v22 == null) break block53;
                                v23 = new Object[3];
                                v23[2] = var23_19 /* !! */ ;
                                v23[1] = var13_10;
                                v23[0] = var1_1;
                                if (_3_.c("o", (Object)v23, (long)7483810600171485849L, (long)var2_2) != false) break block47;
                            }
                            catch (MatchException v24) {
                                throw _3_.a(v24);
                            }
                            _3_.c("l", (Object)_3_.c("\u00ff", (long)7482699045650786394L, (long)var2_2), (Object)((String)_3_.a("a", (int)12678, (long)(8146222693210626137L ^ var2_2)) + (String)_3_.c("o", (Object)var23_19 /* !! */ , (long)7480440067569190614L, (long)var2_2)), (long)7479495754065068753L, (long)var2_2);
                        }
                        catch (MatchException v25) {
                            throw _3_.a(v25);
                        }
                    }
                    ++var19_15;
                }
                v22 = var15_11;
            }
            if (v22 != null) continue;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static _0t dev_krypton_0t_0(Object[] var0) {
        block56: {
            block55: {
                block53: {
                    block54: {
                        block51: {
                            block52: {
                                block50: {
                                    block49: {
                                        block48: {
                                            block47: {
                                                block45: {
                                                    block46: {
                                                        block43: {
                                                            block44: {
                                                                var1_1 = (InputStream)var0[0];
                                                                var2_2 = (Long)var0[1];
                                                                var4_3 = (var2_2 = _3_.a ^ var2_2) ^ 44740960207255L;
                                                                var6_4 = _0j.cfr_renamed_1();
                                                                try {
                                                                    try {
                                                                        v0 = var1_1;
                                                                        if (var6_4 == null) break block43;
                                                                        if (v0 != null) break block44;
                                                                    }
                                                                    catch (MatchException v1) {
                                                                        throw _3_.a(v1);
                                                                    }
                                                                    return null;
                                                                }
                                                                catch (MatchException v2) {
                                                                    throw _3_.a(v2);
                                                                }
                                                            }
                                                            v0 = var1_1;
                                                        }
                                                        v3 = new Object[2];
                                                        v3[1] = var4_3;
                                                        v3[0] = v0;
                                                        var7_5 = _3_.c("o", (Object)v3, (long)5297459226891330973L, (long)var2_2);
                                                        try {
                                                            try {
                                                                v4 /* !! */  = ((CallSite)var7_5).length;
                                                                v5 = var6_4;
                                                                if (var2_2 >= 0L) {
                                                                    if (v5 == null) break block45;
                                                                    if (v4 /* !! */  >= 5) break block46;
                                                                }
                                                                ** GOTO lbl46
                                                            }
                                                            catch (MatchException v6) {
                                                                throw _3_.a(v6);
                                                            }
                                                            return null;
                                                        }
                                                        catch (MatchException v7) {
                                                            throw _3_.a(v7);
                                                        }
                                                    }
                                                    v4 /* !! */  = (int)var7_5[0];
                                                }
                                                try {
                                                    try {
                                                        v5 = var6_4;
lbl46:
                                                        // 2 sources

                                                        if (var2_2 <= 0L) ** GOTO lbl61
                                                        if (v5 == null) break block47;
                                                        if (v4 /* !! */  == 0) {
                                                        }
                                                        ** GOTO lbl111
                                                    }
                                                    catch (MatchException v8) {
                                                        throw _3_.a(v8);
                                                    }
                                                    v4 /* !! */  = (int)var7_5[1];
                                                }
                                                catch (MatchException v9) {
                                                    throw _3_.a(v9);
                                                }
                                            }
                                            try {
                                                try {
                                                    v5 = var6_4;
lbl61:
                                                    // 2 sources

                                                    if (var2_2 <= 0L) ** GOTO lbl76
                                                    if (v5 == null) break block48;
                                                    if (v4 /* !! */  == 1) {
                                                    }
                                                    ** GOTO lbl111
                                                }
                                                catch (MatchException v10) {
                                                    throw _3_.a(v10);
                                                }
                                                v4 /* !! */  = (int)var7_5[2];
                                            }
                                            catch (MatchException v11) {
                                                throw _3_.a(v11);
                                            }
                                        }
                                        try {
                                            try {
                                                v5 = var6_4;
lbl76:
                                                // 2 sources

                                                if (var2_2 < 0L) ** GOTO lbl91
                                                if (v5 == null) break block49;
                                                if (v4 /* !! */  == 0) {
                                                }
                                                ** GOTO lbl111
                                            }
                                            catch (MatchException v12) {
                                                throw _3_.a(v12);
                                            }
                                            v4 /* !! */  = (int)var7_5[3];
                                        }
                                        catch (MatchException v13) {
                                            throw _3_.a(v13);
                                        }
                                    }
                                    try {
                                        try {
                                            v5 = var6_4;
lbl91:
                                            // 2 sources

                                            if (var2_2 < 0L) ** GOTO lbl106
                                            if (v5 == null) break block50;
                                            if (v4 /* !! */  == 0) {
                                            }
                                            ** GOTO lbl111
                                        }
                                        catch (MatchException v14) {
                                            throw _3_.a(v14);
                                        }
                                        v4 /* !! */  = (int)var7_5[4];
                                    }
                                    catch (MatchException v15) {
                                        throw _3_.a(v15);
                                    }
                                }
                                try {
                                    try {
                                        v5 = var6_4;
lbl106:
                                        // 2 sources

                                        if (v5 == null) break block51;
                                        if (v4 /* !! */  == 0) break block52;
                                    }
                                    catch (MatchException v16) {
                                        throw _3_.a(v16);
                                    }
lbl111:
                                    // 5 sources

                                    return null;
                                }
                                catch (MatchException v17) {
                                    throw _3_.a(v17);
                                }
                            }
                            v4 /* !! */  = ((CallSite)var7_5).length;
                        }
                        var8_6 = _3_.c("l", (Object)_3_.c("l", (Object)_3_.c("o", (int)v4 /* !! */ , (long)5296378146611470387L, (long)var2_2), (Object)var7_5, (long)5304305152374300578L, (long)var2_2), (long)5297289046280969805L, (long)var2_2);
                        var9_7 = _3_.c("o", (long)5304626820269454558L, (long)var2_2);
                        try {
                            try {
                                v18 = var9_7;
                                if (var6_4 == null) break block53;
                                if (_3_.c("o", (Object)v18, (Object)var8_6, (long)5297792558830174828L, (long)var2_2) != false) break block54;
                            }
                            catch (MatchException v19) {
                                throw _3_.a(v19);
                            }
                            return null;
                        }
                        catch (MatchException v20) {
                            throw _3_.a(v20);
                        }
                    }
                    v18 = var9_7;
                }
                var10_8 = _3_.c("o", (Object)v18, (int)3, (int)1, (int)_3_.b("u", (int)5903, (long)(8230224935600666878L ^ var2_2)), (int)1, (long)5299170605287200051L, (long)var2_2);
                var11_9 = _3_.c("o", (Object)var9_7, (int)3, (int)1, (int)_3_.b("u", (int)7233, (long)(7802934984969827249L ^ var2_2)), (int)2, (long)5299170605287200051L, (long)var2_2);
                try {
                    v21 = var11_9;
                    if (var2_2 < 0L || var6_4 == null) break block55;
                    if (v21 != null) {
                    }
                    ** GOTO lbl147
                }
                catch (MatchException v22) {
                    throw _3_.a(v22);
                }
                v21 = var10_8;
            }
            try {
                if (v21 != null) break block56;
lbl147:
                // 2 sources

                return null;
            }
            catch (MatchException v23) {
                throw _3_.a(v23);
            }
        }
        return new _0t((String)_3_.c("l", (Object)_3_.c("l", (Object)_3_.c("\u00ff", (long)5296367900007332512L, (long)var2_2), (Object)var10_8, (long)5296637201638084143L, (long)var2_2), (long)5305182401682116754L, (long)var2_2), (_4m_0)_3_.c("o", (Object)_3_.c("l", (Object)_3_.c("l", (Object)_3_.c("\u00ff", (long)5296367900007332512L, (long)var2_2), (Object)var11_9, (long)5296637201638084143L, (long)var2_2), (long)5305182401682116754L, (long)var2_2), (long)5296508503208641233L, (long)var2_2));
    }

    public static _0t dev_krypton_0t_3(Object[] objectArray) {
        File file = (File)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x297788F7F8BAL;
        long l5 = l3 ^ 0x2D2E108E9EB1L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l4;
        objectArray2[0] = file;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l5;
        objectArray3[0] = _3_.c("o", (Object)objectArray2, 40701866241058894L, (long)l2);
        return _3_.c("o", (Object)objectArray3, 37433810497954171L, (long)l2);
    }

    public static void void_3(Object[] objectArray) {
        List list = (List)objectArray[0];
        String string = (String)objectArray[1];
        long l2 = (Long)objectArray[2];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x5F6B669323BDL;
        long l5 = l3 ^ 0x4092F9228A96L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = string;
        objectArray2[0] = l4;
        CallSite callSite = _3_.c("o", (Object)objectArray2, 3534743707418686067L, (long)l2);
        try {
            if (callSite == null) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw _3_.a(matchException);
        }
        _0k k = new _0k((_0t)((Object)callSite), string);
        try {
            if (l2 >= 0L) {
                Object[] objectArray3 = new Object[3];
                objectArray3[2] = k;
                objectArray3[1] = l5;
                objectArray3[0] = list;
                if (_3_.c("o", (Object)objectArray3, 3537734497169796186L, (long)l2) == false) {
                    _3_.c("l", (Object)_3_.c("\u00ff", 3536658298832830105L, (long)l2), (Object)((String)((Object)_3_.a("a", 9334, (long)(0x2EC89E969B3A5B63L ^ l2))) + (String)((Object)_3_.c("o", (Object)k, 3534345238258307093L, (long)l2))), 3535282953919796242L, (long)l2);
                }
            }
        }
        catch (MatchException matchException) {
            throw _3_.a(matchException);
        }
    }

    public static _80 dev_krypton_80_4(Object[] objectArray) {
        List list = (List)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string = (String)objectArray[2];
        l2 = a ^ l2;
        _4w[] wArray = _0j.cfr_renamed_1();
        CallSite callSite = _3_.c("l", (Object)list, 2638169567502785915L, (long)l2);
        while (_3_.c("l", (Object)callSite, 2638933632055378147L, (long)l2) != false) {
            block6: {
                _80 v0;
                block5: {
                    _80 var7_6 = (_80)((Object)_3_.c("l", (Object)callSite, 2631366093874209013L, (long)l2));
                    try {
                        try {
                            v0 = var7_6;
                            if (wArray == null) break block5;
                            if (_3_.c("l", (Object)_3_.c("l", (Object)v0, 2634932563321430638L, (long)l2), (Object)string, 2631902155871563163L, (long)l2) == false) break block6;
                        }
                        catch (MatchException matchException) {
                            throw _3_.a(matchException);
                        }
                        v0 = var7_6;
                    }
                    catch (MatchException matchException) {
                        throw _3_.a(matchException);
                    }
                }
                return v0;
            }
            if (wArray != null) continue;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public static Set java_util_Set_4(Object[] var0) {
        var1_1 = (Long)var0[0];
        v0 = var1_1 = _3_.a ^ var1_1;
        var3_2 = v0 ^ 9235549602575L;
        var5_3 = v0 ^ 78270429910637L;
        var8_4 = new HashSet<E>();
        _3_.c("l", var8_4, (Object)((String)_3_.c("o", (Object)_3_.a("a", (int)12403, (long)(2084258457669339224L ^ var1_1)), (long)-703125059377074192L, (long)var1_1) + (String)_3_.a("a", (int)7476, (long)(4760465098816857352L ^ var1_1))), (long)-703921704583898746L, (long)var1_1);
        v1 = new Object[1];
        v1[0] = var5_3;
        var9_5 = _3_.c("l", (Object)_3_.c("o", (Object)v1, (long)-704731862354731563L, (long)var1_1), (long)-703219485496766502L, (long)var1_1);
        var7_6 = _0j.cfr_renamed_1();
        block10: while (_3_.c("l", (Object)var9_5, (long)-703018333459131838L, (long)var1_1) != false) {
            v2 = _3_.c("l", (Object)var9_5, (long)-710023782792957356L, (long)var1_1);
            do {
                block15: {
                    var10_7 = (File)v2;
                    try {
                        try {
                            try {
                                block17: {
                                    v3 = _3_.c("l", (Object)var10_7, (long)-704490833684557279L, (long)var1_1);
                                    v4 = var7_6;
                                    if (var1_1 <= 0L) break block17;
                                    if (v4 == null) ** GOTO lbl51
                                    v4 = var7_6;
                                }
                                if (v4 == null) break block15;
                            }
                            catch (MatchException v5) {
                                throw _3_.a(v5);
                            }
                            if (v3 == false) break block15;
                        }
                        catch (MatchException v6) {
                            throw _3_.a(v6);
                        }
                        _3_.c("l", var8_4, (Object)_3_.c("l", (Object)var10_7, (long)-709707535173247212L, (long)var1_1), (long)-703921704583898746L, (long)var1_1);
                    }
                    catch (MatchException v7) {
                        throw _3_.a(v7);
                    }
                }
                if (var7_6 != null) continue block10;
                v8 = new Object[1];
                v8[0] = var3_2;
                v2 = _3_.c("l", (Object)_3_.c("o", (Object)v8, (long)-702800235256549599L, (long)var1_1), (long)-703219485496766502L, (long)var1_1);
            } while (var1_1 <= 0L);
        }
        var9_5 = v2;
        block12: while (true) {
            v3 = _3_.c("l", (Object)var9_5, (long)-703018333459131838L, (long)var1_1);
lbl51:
            // 2 sources

            if (v3 == false) ** GOTO lbl68
            v9 = _3_.c("l", (Object)var9_5, (long)-710023782792957356L, (long)var1_1);
            do {
                block16: {
                    var10_7 = (File)v9;
                    try {
                        try {
                            v10 = _3_.c("l", (Object)var10_7, (long)-704490833684557279L, (long)var1_1);
                            if (var7_6 == null || v10 == false) break block16;
                        }
                        catch (MatchException v11) {
                            throw _3_.a(v11);
                        }
                        v10 = _3_.c("l", var8_4, (Object)_3_.c("l", (Object)var10_7, (long)-709707535173247212L, (long)var1_1), (long)-703921704583898746L, (long)var1_1);
                    }
                    catch (MatchException v12) {
                        throw _3_.a(v12);
                    }
                }
                if (var7_6 != null) continue block12;
lbl68:
                // 2 sources

                v9 = var8_4;
            } while (var1_1 <= 0L);
            break;
        }
        return v9;
    }

    public static _0t dev_krypton_0t_4(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x6B6604795B2EL;
        long l5 = l3 ^ 0x298D899A1D9CL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = string;
        objectArray2[0] = l5;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = _3_.c("o", (Object)objectArray2, -4246197415026428120L, (long)l2);
        return _3_.c("o", (Object)objectArray3, -4243591987495295772L, (long)l2);
    }

    /*
     * Exception decompiling
     */
    public static List cfr_renamed_8(Object[] var0) {
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

    /*
     * Unable to fully structure code
     */
    public static boolean cfr_renamed_0(Object[] var0) {
        block15: {
            block16: {
                block13: {
                    block14: {
                        block11: {
                            block12: {
                                var1_1 = (List)var0[0];
                                var3_2 = (Long)var0[1];
                                var2_3 = (_0j)var0[2];
                                v0 = var3_2 = _3_.a ^ var3_2;
                                var5_4 = v0 ^ 92088009029661L;
                                var7_5 = v0 ^ 96783180930847L;
                                var9_6 = v0 ^ 94580391167099L;
                                var11_7 = _0j.cfr_renamed_1();
                                try {
                                    try {
                                        v1 = var2_3;
                                        if (var11_7 == null) break block11;
                                        if (v1 != null) break block12;
                                    }
                                    catch (MatchException v2) {
                                        throw _3_.a(v2);
                                    }
                                    return false;
                                }
                                catch (MatchException v3) {
                                    throw _3_.a(v3);
                                }
                            }
                            v1 = var2_3;
                        }
                        var12_8 = _3_.c("\u00aa", (Object)v1, (long)7799870035564111294L, (long)var3_2);
                        v4 = new Object[3];
                        v4[2] = _3_.c("l", (Object)var12_8, (long)7793037751421779075L, (long)var3_2);
                        v4[1] = var7_5;
                        v4[0] = var1_1;
                        var13_9 = _3_.c("o", (Object)v4, (long)7798129681276844752L, (long)var3_2);
                        try {
                            v5 = var13_9;
                            v6 = var11_7;
                            if (var3_2 > 0L) {
                                if (v6 == null) break block13;
                                if (v5 != null) break block14;
                            }
                            ** GOTO lbl56
                        }
                        catch (MatchException v7) {
                            throw _3_.a(v7);
                        }
                        var13_9 = new _80((String)_3_.c("l", (Object)var12_8, (long)7793037751421779075L, (long)var3_2));
                        _3_.c("l", (Object)var1_1, (Object)var13_9, (long)7799036725537210963L, (long)var3_2);
                    }
                    v5 = var13_9;
                }
                try {
                    try {
                        v8 = new Object[2];
                        v8[1] = var9_6;
                        v6 = v8;
                        v8[0] = _3_.c("l", (Object)var12_8, (long)7792454072315356995L, (long)var3_2);
lbl56:
                        // 2 sources

                        v9 = _3_.c("l", (Object)v5, (Object)v6, (long)7796616340863702613L, (long)var3_2);
                        if (var11_7 == null) break block15;
                        if (v9 == false) break block16;
                    }
                    catch (MatchException v10) {
                        throw _3_.a(v10);
                    }
                    return false;
                }
                catch (MatchException v11) {
                    throw _3_.a(v11);
                }
            }
            v12 = new Object[2];
            v12[1] = var5_4;
            v12[0] = var2_3;
            v9 = _3_.c("l", (Object)var13_9, (Object)v12, (long)7796065475980253769L, (long)var3_2);
        }
        return (boolean)v9;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_3_.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_3_.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_2() {
        try {
            return MethodHandles.lookup().findStatic(_3_.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

