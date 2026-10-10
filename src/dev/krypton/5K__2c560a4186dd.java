/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1011
 *  net.minecraft.class_1043
 *  net.minecraft.class_12079$class_12080
 *  net.minecraft.class_2960
 *  net.minecraft.class_7920
 *  net.minecraft.class_8685
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._4r;
import dev.krypton._6e_0;
import dev.krypton._6x_0;
import dev.krypton._7C;
import dev.krypton._95;
import dev.krypton._9r;
import dev.krypton.l;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
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
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_12079;
import net.minecraft.class_2960;
import net.minecraft.class_7920;
import net.minecraft.class_8685;

public class _5K
extends _6x_0 {
    private final _6e_0 cfr_renamed_1;
    private final _9r cfr_renamed_6;
    private final _9r cfr_renamed_9;
    private class_8685 cfr_renamed_2;
    private String cfr_renamed_4;
    private static final long b;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static final long[] j;
    private static final Integer[] k;
    private static final Map l;
    private static final Object[] m;
    private static final String[] n;

    @Override
    public native void cfr_renamed_5();

    public class_8685 net_minecraft_class_8685_1(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x40EE0975BE2DL;
        long l5 = l3 ^ 0x4F310380C32DL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        CallSite callSite = _5K.d("q", (Object)_5K.d("\u00aa", (Object)this, -7032993808156921220L, (long)l2), (Object)objectArray2, -7032525741412483787L, (long)l2);
        try {
            if (_5K.d("q", (Object)callSite, (Object)_5K.d("\u00aa", (Object)this, -7026317471571532056L, (long)l2), -7032827701870490394L, (long)l2) == false) {
                Object[] objectArray3 = new Object[1];
                objectArray3[0] = l5;
                _5K.d("q", (Object)this, (Object)objectArray3, -7026775121564113833L, (long)l2);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw _5K.a(illegalStateException);
        }
        return _5K.d("\u00aa", (Object)this, -7025745388584833536L, (long)l2);
    }

    private void cfr_renamed_94(Object[] objectArray) {
        _5K k;
        CallSite callSite;
        long l2;
        long l3;
        block15: {
            _5K k2;
            block16: {
                block14: {
                    CallSite callSite2;
                    int n;
                    block12: {
                        block13: {
                            block11: {
                                CallSite callSite3;
                                block10: {
                                    l3 = (Long)objectArray[0];
                                    long l4 = l3 = b ^ l3;
                                    l2 = l4 ^ 0x78681E4E1187L;
                                    long l5 = l4 ^ 0x1E3A8D37CE9BL;
                                    n = _7C.cfr_renamed_3();
                                    Object[] objectArray2 = new Object[1];
                                    objectArray2[0] = l5;
                                    callSite = _5K.d("q", (Object)_5K.d("\u00aa", (Object)this, -1237478689067072822L, (long)l3), (Object)objectArray2, -1238158061490467453L, (long)l3);
                                    try {
                                        callSite3 = callSite;
                                        if (n != 0) break block10;
                                        if (callSite3 == null) break block11;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        throw _5K.a(illegalStateException);
                                    }
                                    callSite3 = callSite;
                                }
                                try {
                                    callSite2 = _5K.d("q", (Object)callSite3, -1237085555456850737L, (long)l3);
                                    if (l3 < 0L || n != 0) break block12;
                                    if (callSite2 == false) break block13;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw _5K.a(illegalStateException);
                                }
                            }
                            return;
                        }
                        callSite2 = _5K.d("q", (Object)callSite, (Object)_5K.d("\u00aa", (Object)this, -1239651359366982050L, (long)l3), -1238421023645631408L, (long)l3);
                    }
                    try {
                        try {
                            try {
                                if (callSite2 == false) break block14;
                                k = this;
                                if (n != 0) break block15;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw _5K.a(illegalStateException);
                            }
                            if (l3 <= 0L) break block16;
                            if (_5K.d("\u00aa", (Object)k, -1240223692017000778L, (long)l3) == null) break block14;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw _5K.a(illegalStateException);
                        }
                        return;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw _5K.a(illegalStateException);
                    }
                }
                _5K.d("X", (Object)this, (String)((Object)callSite), -1239651359366982050L, (long)l3);
                k2 = this;
            }
            _5K.d("X", (Object)k2, null, -1240223692017000778L, (long)l3);
            k = this;
        }
        _5K.d("\u00f5", () -> k.cfr_renamed_6(l2, (String)((Object)callSite)), -1239277871190571707L, (long)l3);
    }

    /*
     * Exception decompiling
     */
    private static void cfr_renamed_283(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[DOLOOP]], but top level block is 5[SIMPLE_IF_TAKEN]
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
     * Exception decompiling
     */
    private static void cfr_renamed_268(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[DOLOOP], 5[WHILELOOP]], but top level block is 6[WHILELOOP]
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

    public _5K(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x615A27F87727L;
        long l5 = l3 ^ 0x3762B0BBFF4EL;
        long l6 = l3 ^ 0x28A2239F103CL;
        long l7 = l3 ^ 0x7736425D2278L;
        super((int)_5K.c("b", 6205, (long)(0x6EC3884E965E5516L ^ l2)), -1, (_4r)((Object)_5K.d("a", 6228071272672292291L, (long)l2)), l5);
        this.cfr_renamed_1 = new _6e_0((int)_5K.c("b", 29408, (long)(0x43402F5F744A3FC6L ^ l2)), l7, (String)((Object)_5K.a("v", 20400, (long)(0x269AA105B1E5E887L ^ l2))));
        this.cfr_renamed_6 = new _9r((int)_5K.c("b", 18372, (long)(0x480A81E80C658AFEL ^ l2)), true, l4);
        this.cfr_renamed_9 = new _9r((int)_5K.c("b", 18305, (long)(0x1F6A1950AF5C0AAFL ^ l2)), true, l4);
        _5K.d("X", (Object)this, null, 6226995288711439893L, (long)l2);
        _5K.d("X", (Object)this, (String)"", 6226423909679984381L, (long)l2);
        Object[] objectArray = new Object[2];
        objectArray[1] = new _95[]{_5K.d("\u00aa", (Object)this, 6228754909738187369L, (long)l2), _5K.d("\u00aa", (Object)this, 6229815694085129608L, (long)l2), _5K.d("\u00aa", (Object)this, 6230511571759227962L, (long)l2)};
        objectArray[0] = l6;
        _5K.d("q", (Object)this, (Object)objectArray, 6227113069099855765L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        a.init(_5K.class, 11);
                        _5K.b = dev.krypton.l.a(-3654619814414732170L, -3812391039617829532L, MethodHandles.lookup().lookupClass()).a(127209122910142L);
                        _5K.m = new Object[100];
                        _5K.n = new String[100];
                        _5K.b();
                        _5K.f = new HashMap<K, V>(13);
                        var11 = _5K.b ^ 52858640089994L;
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
                        var20_3 = new String[23];
                        var18_4 = 0;
                        var17_5 = "\u0083\u00af\u00af\u00ed\u00e19\u0089>r\u0014\u00cf\b(\u0005%|\u00e2~\u00b3\u00bf\u00ba\u0089\u001c\u00dd\u0010)\u00f7\u000f\u00a7\u0013!}\u00df\u0088\u00ca\u0012\u00bel*\u0094C\u0010<\u00c8\u00d6\u0014\u008d\u00e5vG\u00f2\u00e3\u00d2v\u0087Q\u00c5\u008f`CU\u00ae 5\u00a5a_&)\u0093Y\u00ebDX\u001b\u00ab\u00b4Ai\u0086\u0092\f\u00e0|\u00f2^\u000f\u000f\u007f\u0080J_N\u00839\u0006\u00cf\u00da\u009e\u00b1\u00e3\u00b5\u0004%\u00c3\u00e2F\u00ab\u0089a%\u00acP!\u00a5\u00bf\u00a2\u00f9\u00cb\u00ae\u00a1\u00be0\bO=\u00caK\u00f2\u00b5v\u009b\u00a3\u00ac\u00ba\u00a6\n\u00c9!\u0003\u009d\u00efY\u0091\u00be\u00ce\u0001\u009e\u00ff\u00c1\u00a0K\u00d7\u00bf/ \u00cdW\u0012i\u00fcJT\u00ad\u009e:\u001b\u00f4\u0085\u00deJbi\u00baO\u00bf\u00a2\u001e\u0006\u008b\u00e1dD2\u00e5\u00ac\u0091\u00ab\u0010\u0083\u00fe\u0094 \u00cew\u00ec\u00db7\u00dd\u0080\u0082\u0096\u00fc\u00cal\u0010D\u00bc\u0001\u00c2\u0014\u00b9\u00ef\u00e9\u0010\u00ec\u00d0r/\u00c4\u0010\u00c1\u0010,\u008b4\"\u00b3\u00a8\u0012\u00ea?\u00e2\u00bf\u00aaR?\u00b4\u00e2X.\u00c8C\u008a\u008e\u00bc\r\u00dcf#\t\u0099,\u001d\u00edu\u00d0\u00cf-\u00fb\u00a2f\u00e1\u008df\u0018\u00c3\u00aa]*\u001fP\u0005\u00b0\u00f3\u0010vx\u0093\u00b4\u00c1\u00ee\u00cf)\u0006\u00a2`z-0x9\u0017a\u00a9\u009c\u008b\u00b8\u00f8`\u0005} 9\u0000\u0093\u00ffc\"\u00053\u00ac\u00b3\u00ba\u00bf\u00d8\u00d6!L\u0085\u008au\u0083bS\u0014h\u00cf\u0018\u00cc\u00e0\u001e'\u0093\u00b2\u0089\u0089j\u00e3%\u00ad\u001eb\u0006\u000f/\u0012\u008c\u00d2P/\u001f\\\u0010\u00fb6\u000bj2\u0086sZ\u00b9D{|re#\u00a3\u0018\u00b4<\u00be\u00bf\u00933\u001fi;`\u008f\u0014\u00b1\u00d0\u00f42\u00c9h\u008f\u00de\u00eb\u000e\u008ep \u0018\u00ad|%\u00a4L\u00c6\r\u00f3gq\u00fe\u00f4\u0084\u00ac\u00d6W\u00f9Cq\u00b3\u000ev\u001e\u0089\\\u00c8\u00df\u00df\"\n\u00b28\u0092\u00ac\u00ab\u001c\u001a\u0013gy\u00cd\u00d2\u0010\u009f\u00ccS\u00da{\u00d1\tSr \u0018 \u0019k\u00db\u00b0\u00e2\u00e1\u00b5\u00b5/\u00ba%\u00c3\u00b2\u008d\r\u00dch\u00eep\u00f7\u001e\u00a8uz\u0089\u00ceG$\u00b9\u00cfG_I\u0010y\u007f\tE\u00fa\u00cf\u00eevE\u00b0\u00b6\u00b0]\u008cJ\u00c4 \u00e1\u00b9\u00a9a3~G\u00f7x|\u00c8\u00d3\u00b7}{\"r\u000b\u0000F&h\u00e8s-\u0089\u001e({\u0088w\u00f1\u0018\u008c_\u00f5\u00f7\u00faMi\u00a6\u0003\u0018I\u00e9<\u00f1+\u00d0\u001e\u00f9g\u0093J\u0090\u00d0\u00a7\u0010-\u008f<\u0088\u00c6D\u0090M\n\u00f3\u00b7|\u009d;*\u001b\u0018\u0006\u00a0t\u00dc\u0083\u00cf\u00135\u00a5g\f#\u00b1U\u00ae\u00f1,\u00ca\u00bb\u00c8\u0090)\\\u00b2\u0010\u00cc\u00ce\u0003D%l\u008c1\u00f3\u0092\u00c4/\u00cak\u00e9\u001c\u0010,\u0082\u0013\u00e5H\u001a\u00a1\"\u00cb\u0016N\u00b5\u00dfqfm";
                        var19_6 = "\u0083\u00af\u00af\u00ed\u00e19\u0089>r\u0014\u00cf\b(\u0005%|\u00e2~\u00b3\u00bf\u00ba\u0089\u001c\u00dd\u0010)\u00f7\u000f\u00a7\u0013!}\u00df\u0088\u00ca\u0012\u00bel*\u0094C\u0010<\u00c8\u00d6\u0014\u008d\u00e5vG\u00f2\u00e3\u00d2v\u0087Q\u00c5\u008f`CU\u00ae 5\u00a5a_&)\u0093Y\u00ebDX\u001b\u00ab\u00b4Ai\u0086\u0092\f\u00e0|\u00f2^\u000f\u000f\u007f\u0080J_N\u00839\u0006\u00cf\u00da\u009e\u00b1\u00e3\u00b5\u0004%\u00c3\u00e2F\u00ab\u0089a%\u00acP!\u00a5\u00bf\u00a2\u00f9\u00cb\u00ae\u00a1\u00be0\bO=\u00caK\u00f2\u00b5v\u009b\u00a3\u00ac\u00ba\u00a6\n\u00c9!\u0003\u009d\u00efY\u0091\u00be\u00ce\u0001\u009e\u00ff\u00c1\u00a0K\u00d7\u00bf/ \u00cdW\u0012i\u00fcJT\u00ad\u009e:\u001b\u00f4\u0085\u00deJbi\u00baO\u00bf\u00a2\u001e\u0006\u008b\u00e1dD2\u00e5\u00ac\u0091\u00ab\u0010\u0083\u00fe\u0094 \u00cew\u00ec\u00db7\u00dd\u0080\u0082\u0096\u00fc\u00cal\u0010D\u00bc\u0001\u00c2\u0014\u00b9\u00ef\u00e9\u0010\u00ec\u00d0r/\u00c4\u0010\u00c1\u0010,\u008b4\"\u00b3\u00a8\u0012\u00ea?\u00e2\u00bf\u00aaR?\u00b4\u00e2X.\u00c8C\u008a\u008e\u00bc\r\u00dcf#\t\u0099,\u001d\u00edu\u00d0\u00cf-\u00fb\u00a2f\u00e1\u008df\u0018\u00c3\u00aa]*\u001fP\u0005\u00b0\u00f3\u0010vx\u0093\u00b4\u00c1\u00ee\u00cf)\u0006\u00a2`z-0x9\u0017a\u00a9\u009c\u008b\u00b8\u00f8`\u0005} 9\u0000\u0093\u00ffc\"\u00053\u00ac\u00b3\u00ba\u00bf\u00d8\u00d6!L\u0085\u008au\u0083bS\u0014h\u00cf\u0018\u00cc\u00e0\u001e'\u0093\u00b2\u0089\u0089j\u00e3%\u00ad\u001eb\u0006\u000f/\u0012\u008c\u00d2P/\u001f\\\u0010\u00fb6\u000bj2\u0086sZ\u00b9D{|re#\u00a3\u0018\u00b4<\u00be\u00bf\u00933\u001fi;`\u008f\u0014\u00b1\u00d0\u00f42\u00c9h\u008f\u00de\u00eb\u000e\u008ep \u0018\u00ad|%\u00a4L\u00c6\r\u00f3gq\u00fe\u00f4\u0084\u00ac\u00d6W\u00f9Cq\u00b3\u000ev\u001e\u0089\\\u00c8\u00df\u00df\"\n\u00b28\u0092\u00ac\u00ab\u001c\u001a\u0013gy\u00cd\u00d2\u0010\u009f\u00ccS\u00da{\u00d1\tSr \u0018 \u0019k\u00db\u00b0\u00e2\u00e1\u00b5\u00b5/\u00ba%\u00c3\u00b2\u008d\r\u00dch\u00eep\u00f7\u001e\u00a8uz\u0089\u00ceG$\u00b9\u00cfG_I\u0010y\u007f\tE\u00fa\u00cf\u00eevE\u00b0\u00b6\u00b0]\u008cJ\u00c4 \u00e1\u00b9\u00a9a3~G\u00f7x|\u00c8\u00d3\u00b7}{\"r\u000b\u0000F&h\u00e8s-\u0089\u001e({\u0088w\u00f1\u0018\u008c_\u00f5\u00f7\u00faMi\u00a6\u0003\u0018I\u00e9<\u00f1+\u00d0\u001e\u00f9g\u0093J\u0090\u00d0\u00a7\u0010-\u008f<\u0088\u00c6D\u0090M\n\u00f3\u00b7|\u009d;*\u001b\u0018\u0006\u00a0t\u00dc\u0083\u00cf\u00135\u00a5g\f#\u00b1U\u00ae\u00f1,\u00ca\u00bb\u00c8\u0090)\\\u00b2\u0010\u00cc\u00ce\u0003D%l\u008c1\u00f3\u0092\u00c4/\u00cak\u00e9\u001c\u0010,\u0082\u0013\u00e5H\u001a\u00a1\"\u00cb\u0016N\u00b5\u00dfqfm".length();
                        var16_7 = 24;
                        var15_8 = -1;
lbl24:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl29:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = _5K.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "%\u00c0\u00f0\u00dbo\u001e\u00da\u00e2\rC\u00fbNB\u00dd\u00d9\u00f3\u0010,\u009d\u00db\u000fh6T\u00d9\u00ad\u00a9\u0015\u00c6\u0018\t\u0091{";
                            var19_6 = "%\u00c0\u00f0\u00dbo\u001e\u00da\u00e2\rC\u00fbNB\u00dd\u00d9\u00f3\u0010,\u009d\u00db\u000fh6T\u00d9\u00ad\u00a9\u0015\u00c6\u0018\t\u0091{".length();
                            var16_7 = 16;
                            var15_8 = -1;
lbl38:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl43:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = _5K.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var21_9 = var13_1.doFinal(v4.getBytes("ISO-8859-1"));
                    switch (v5) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl55:
                        // 1 sources

                        ** continue;
                    }
                }
                _5K.d = var20_3;
                _5K.e = new String[23];
                _5K.l = new HashMap<K, V>(13);
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
                var6_12 = new long[32];
                var3_13 = 0;
                var4_14 = "\u00b9\u00e8{\u001b\u00fbo\u00f7`\u00ca\u00d1\u00be\u00bb(,\u0016\u00962\u00af\u00c9\u001c|\u00f4\u00bb\u00a4&\u00de\u00ea\u00ffFJ\u00ae\u00e7Z3#\u00a5\u0003\u00be\u00c7\u00e4\u00b5\u0096,\u009d\u00ad%\u00e8\u00a8o\u001c\u00bc\u001d\u00c0(o\u00f8M\u00e6#\u0082\u00aeK\u00de\u0089\u0093\u0096DHa\u00ca\u0092\u00b5\u008bc\u00f0\u009f3\u001e\u0095\u00e1Y\u00aa\u00efF\u00c9[\u00b7\u00b7\u008e\u00fb\u00a5)\u00d4\u00b4\u00cc3\u00b0\u009b\u001a\u00dc\u00f4\u00edl\u001a\u001b'\u00ab'\u00e6~|\u009eMR8\u00ae\u00ca\u00f3\u00d4\u0084\u001f\u00b4\u00c3\"\u0002c9M\tr\u0084K\u00e2\u00c0\u0001;\b\u0015S\u008b\u00dec\u00d1&.\u00f1\u0005\t\u00e0\u00b0\u0007\u0018\u009a\u008e0\u00e5\u0011\u00b4\u00a1#\u008f\u0094\u000eV<\u00f5\u00ec\u0011\u001b\u00bc\u00f7\u0086h\u00a8\u00b5(\u00bf\u0086\u000b)\u00df\n\u008c\u00c6f3+)\u0004!'k\u000b\u00b1Y\u00dd\u008f+#v\u00b5\u0093\u008e\u008f\u0018\u008b\u00c3\u008eU\u0005~\u00fc\u0014\u00a4\u00f6X\u00fdE\u00c3\u00b0\u00b0e\u00a2\u00fa\u00971e-\u00fe Zx\u00c3aE\u008dj\u0091\u00885";
                var5_15 = "\u00b9\u00e8{\u001b\u00fbo\u00f7`\u00ca\u00d1\u00be\u00bb(,\u0016\u00962\u00af\u00c9\u001c|\u00f4\u00bb\u00a4&\u00de\u00ea\u00ffFJ\u00ae\u00e7Z3#\u00a5\u0003\u00be\u00c7\u00e4\u00b5\u0096,\u009d\u00ad%\u00e8\u00a8o\u001c\u00bc\u001d\u00c0(o\u00f8M\u00e6#\u0082\u00aeK\u00de\u0089\u0093\u0096DHa\u00ca\u0092\u00b5\u008bc\u00f0\u009f3\u001e\u0095\u00e1Y\u00aa\u00efF\u00c9[\u00b7\u00b7\u008e\u00fb\u00a5)\u00d4\u00b4\u00cc3\u00b0\u009b\u001a\u00dc\u00f4\u00edl\u001a\u001b'\u00ab'\u00e6~|\u009eMR8\u00ae\u00ca\u00f3\u00d4\u0084\u001f\u00b4\u00c3\"\u0002c9M\tr\u0084K\u00e2\u00c0\u0001;\b\u0015S\u008b\u00dec\u00d1&.\u00f1\u0005\t\u00e0\u00b0\u0007\u0018\u009a\u008e0\u00e5\u0011\u00b4\u00a1#\u008f\u0094\u000eV<\u00f5\u00ec\u0011\u001b\u00bc\u00f7\u0086h\u00a8\u00b5(\u00bf\u0086\u000b)\u00df\n\u008c\u00c6f3+)\u0004!'k\u000b\u00b1Y\u00dd\u008f+#v\u00b5\u0093\u008e\u008f\u0018\u008b\u00c3\u008eU\u0005~\u00fc\u0014\u00a4\u00f6X\u00fdE\u00c3\u00b0\u00b0e\u00a2\u00fa\u00971e-\u00fe Zx\u00c3aE\u008dj\u0091\u00885".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v10 = var6_12;
                    v11 = var3_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl82:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u009b\u00b0\u0015KD\u00956\u00fdY{@Gv\u00cd\u00e5\u00aa";
                    var5_15 = "\u009b\u00b0\u0015KD\u00956\u00fdY{@Gv\u00cd\u00e5\u00aa".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v10 = var6_12;
                        v11 = var3_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl95:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    break block21;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl108:
                // 1 sources

                ** continue;
            }
        }
        _5K.j = var6_12;
        _5K.k = new Integer[32];
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (_5K.n[n3] != null) {
            return n3;
        }
        Object object = m[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 49;
            case 1 -> 43;
            case 2 -> 53;
            case 3 -> 40;
            case 4 -> 5;
            case 5 -> 4;
            case 6 -> 54;
            case 7 -> 32;
            case 8 -> 24;
            case 9 -> 8;
            case 10 -> 26;
            case 11 -> 0;
            case 12 -> 35;
            case 13 -> 30;
            case 14 -> 58;
            case 15 -> 21;
            case 16 -> 46;
            case 17 -> 39;
            case 18 -> 17;
            case 19 -> 7;
            case 20 -> 28;
            case 21 -> 41;
            case 22 -> 20;
            case 23 -> 13;
            case 24 -> 36;
            case 25 -> 12;
            case 26 -> 48;
            case 27 -> 19;
            case 28 -> 18;
            case 29 -> 59;
            case 30 -> 9;
            case 31 -> 6;
            case 32 -> 45;
            case 33 -> 33;
            case 34 -> 1;
            case 35 -> 52;
            case 36 -> 15;
            case 37 -> 3;
            case 38 -> 2;
            case 39 -> 63;
            case 40 -> 60;
            case 41 -> 42;
            case 42 -> 57;
            case 43 -> 31;
            case 44 -> 50;
            case 45 -> 51;
            case 46 -> 55;
            case 47 -> 16;
            case 48 -> 56;
            case 49 -> 10;
            case 50 -> 62;
            case 51 -> 38;
            case 52 -> 11;
            case 53 -> 23;
            case 54 -> 25;
            case 55 -> 34;
            case 56 -> 61;
            case 57 -> 29;
            case 58 -> 27;
            case 59 -> 14;
            case 60 -> 22;
            case 61 -> 44;
            case 62 -> 37;
            default -> 47;
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
        _5K.n[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = m;
        m[0] = "!/\u0017bC:<:\u0015#Ffp\u0001";
        objectArray[1] = "E.\\x`zX;^9e&\u00189";
        objectArray[2] = Long.TYPE;
        _5K.n[2] = "java/lang/Long";
        objectArray[3] = Boolean.TYPE;
        _5K.n[3] = "java/lang/Boolean";
        objectArray[4] = "!-#F:8*\"2\tG 9%;@";
        objectArray[5] = "x8\u0010^\u000fae-\u0012\u001f\n=*8";
        objectArray[6] = "3s\u0015/\u0013pFS\u001e \u0002?']\u0015+\u0006eS";
        objectArray[7] = "\u0004K\u0016\u001bBOqk\u001d\u0014S\u0000\u0010e\u0016\u001fWZd";
        objectArray[8] = Void.TYPE;
        _5K.n[8] = "java/lang/Void";
        objectArray[9] = "S5wpz'X:f?\u001b)S1be";
        objectArray[10] = "ap}g\u001d\u0001apj;\u0011\u000e{;j%\u0011\u001b|J1\u007fH]";
        objectArray[11] = "+4^1\u0014.+4Im\u0018!1\u007fIs\u001846\u000e\u001b/Hv";
        objectArray[12] = Integer.TYPE;
        _5K.n[12] = "java/lang/Integer";
        objectArray[13] = "QGF\be\u001e$gM\u0007tQEiF\fp\u000b1";
        objectArray[14] = "K8\u007f,\u0005\u0019>\u0018t#\u0014V_\u0016\u007f(\u0010\f+";
        objectArray[15] = "]\u001c\tFqG]\u001c\u001e\u001a}HGW\u001e\u0004}]@&LZ,\u0019\n]\u001e\u0004}]@&LZ,\u0016\u0002";
        objectArray[16] = ">\u0019\">{\u0015>\u00195bw\u001a$R5|w\u000f##a)$L";
        objectArray[17] = "r\u0011\":c&o\u0004 {fz \f";
        objectArray[18] = "Kcr]<IKce\u00010FQ(e\u001f0SVY5Ba";
        objectArray[19] = "3DLIz 3D[\u0015v/)\u000f[\u000bv:.~\tW!y";
        objectArray[20] = ">\u0011D~7\u000f>\u0011S\";\u0000$ZS<;\u0015#+\u0002ilV";
        objectArray[21] = "f~fd\u0000\u001df~q8\f\u0012|5q&\f\u0007{D#zY@";
        objectArray[22] = ":rcj\u0007D5g;c]^ =]\u007f]Z\u0002vf{FD#v1IFN)[teMF5af";
        objectArray[23] = "<cx\u0000*\u000b3v \tp\u0011&,F\u0015p\u0015\u0004g}\u0011k\u000b%g*#k\u0001/Jo\u000f`\t3p";
        objectArray[24] = "hQo\u001c\u001aDgD7\u0015@^r\u001eQ\t@ZPUj\r[DqU";
        objectArray[25] = "%$WM\u007f\u001b khB!\u0007;\u0016U^4\u0013\"";
        objectArray[26] = "Eiq\u0012`[J|)&\u001c|";
        objectArray[27] = "(].L\"&'HvEx<2\u0012\u0010Yx8\u0010Y)Xi;6";
        objectArray[28] = "Lfw\b\u001dICs/\u0001GSV)I\u001dGWtbp\u001cVTR#C\u001cZKBbs";
        objectArray[29] = "\u001ezXMS>\u0012rY\u0006\u001a6\u000ez[M~\"\u0012{t\u0011F0\u0004";
        objectArray[30] = "V/\u0000_r\u0003Z'\u0001\u0014;\u000bF/\u0003__\u001fZ.(\u001dp\u0001P.\u0019";
        objectArray[31] = "sUC\u0004\u0000p|@\u001b\rZji\u001a}\u0011ZnZX\\\u0000@j";
        objectArray[32] = "<P\u0006Q6M7_\u0017\u001eJT8_\u0011RtD";
        objectArray[33] = "H=>\u0004FXD5?O\u000fPX==\u0004kDD<\u001cHKRH&";
        objectArray[34] = "aRvet\bmZw.=\u0000qRueY\u0014mSK*a\u0014gO";
        objectArray[35] = "PQ9%#z[^(jHnYU?0dyT";
        objectArray[36] = ",L\u00141*M2D\u000e~FY5HTd |#N\r4aJ";
        objectArray[37] = "<8";
        objectArray[38] = "\u001ap\\\f4h\u0004xFCX|\u0003t\u001cY";
        objectArray[39] = "+\u0018\u0004KA@^8\u000fDP\u000f?6\u0004OTUK";
        objectArray[40] = "\tV{\u001d\u001d\u0013\u0017^aRP\t\rTx\u000eA\u0003\rC#?\\\u000b\u0013[h\bR\u0004\u000fRK\tG\u0013\u0011R";
        objectArray[41] = "xM\u0012_f.eX\u0010\u001ecr(Z";
        objectArray[42] = "&G`\u0014T#Sgk\u001bEl2i`\u0010A6F";
        objectArray[43] = "~#'mr53y\u007f4\u001e\"#n&cr\u0010r)~5\u001e'6r\u007f`~>\"#|\u0004.v/{*vc,w\"F";
        objectArray[44] = "pV\u0007\n\u001d\u001c=\f_Sq\u000b-\u001b\u0006\u0004\u001d9~^W_Hnp\u0002\u001b\r\nW:_\u000f\u000eq^%\u001a\b\u0018H\u0014x\u000e\u000bcA\u000b=\t\u001dZ\u000bV)\nf^\u0000P\"W\u000b\n\u0003\u0014;g";
        objectArray[45] = "8\u001e_#2\u001e(\u001d\u0019!C\u0005>Co`2\u0019(%Ca=\u00041\u0014\u0016t%DC^\u001db{\u000e\"N\u001e$y\u007f";
        objectArray[46] = "#\u0001KO#\u0007dY^\u0004L>\u0019;k=7\u001a3\u0012OApB&Y";
        objectArray[47] = "[\u001fkA,nP\u0010b0`}<\u0003w\u000b3:A\u0005`_`\u0004\u0001\u000e0RaiU\rtKQ";
        objectArray[48] = "\u007ft]nQ\u0012``Y32\u0016pa,~S\u0014qs\u001c\u0003P\u0013$n\\zONqdf";
        objectArray[49] = "\u0016\u0005be1r[_:<]eKHck1W\u0018\r20e\u0000\u0016Q~b&9\\\fja]0CImwdz\u001e]n\fme[Zx5'8OY\u0003";
        objectArray[50] = "\u001c\u000b\\L\u0015 QQ\u0004\u0015y7AF]B\u0015\u0005\u0010\u0001\u0007\u001eybIGS^@(\u0014SP%";
        objectArray[51] = "DOwt[<@\\0\u007f*lJJ\f)O~IM5c\u0012jJ6h%LjJOrz\u001ai'";
        objectArray[52] = "fCW1$cy\u001e\u0002;\u001eUI|n#}#t\u001a\u0017< v~ ";
        objectArray[53] = "<t(Q\u0012Ln{1\bp\u001f'|9\u0016\f\u001fWt(\u0015\u000b\u0000f!=\rKrj`l\t@\u001f>c(\u0010p";
        objectArray[54] = "((G:\u0005u#'NK@\u001ftuM.\u0015`\u007f9\u0018w";
        objectArray[55] = "=U\u001a!v)'\nL\"\u001b?4\u001553Y+>\u000f;\"y=2\u0015|.*-=X\u0017)d-3i";
        objectArray[56] = "1C\u001ch)g=A\u0012u[a[B\u000e<9f&D\u0019hjXfOIek52L\r|[";
        objectArray[57] = "\t[Yb8$\u0000\\Dk\u0006b0\\N0jeRU\u001eg<X\n\u000b\u001fq{eM\u000e^h\u0006";
        objectArray[58] = "\u0007\u0019\u0000\u00044x\u0000W\u0000\n\u0005|\fT4\u001bGh\u0006N4\u001a\u007fz\u0010(F]jv\fWM\u0011?/aK\u0004\u001bhb^O\u0017\\c\u0013";
        objectArray[59] = "\u001d\u00119*1'PKas]0@\\8$1\u0002\u0011\u001bb}]eH]68d/\u0015I5Cm0PN#z'mDMXs8(C[a9e<@ h& ;V\u0019\"{48-\u0010=>3.\u0014Z`*0U\u0010Qf!m8DR\"8]";
        objectArray[60] = ".Gsw\u001e\u000e&\u0004$+|\u0018 \u0004n''\u001c3\u001fs%|[t\u0011p'\u0003P8D)J\u0018\\/\u0017x3\u0002\u0003y\u0014\u0015";
        objectArray[61] = "\fj}jZ>\u000b$}dk:\u0007'Iu).\r=Gd\t8\u0001'\u00005V:\u000f6\u007f>\u001aoV[f?\u00161[0aq\u0016?j";
        objectArray[62] = "^c\r\u0011F!Ul\u0004`\u0005K\u00069\u0018\u0018[$Cl\u0016X";
        objectArray[63] = "\u0002T\"%OC\u0005\u001a\"+~H\r\u001e_zCG\u0001\b q\u000f\u0012Xee/AT\u0019X\"*\u0000Md";
        objectArray[64] = ":?z\u0018\"G10siai]#fR=\u0013 %q\u0006n-`.!\u000bo@4-e\u0012_";
        objectArray[65] = "Z\u001a\u001aqh\u0010SE\u0012b\u000f\tZZ\u0013fc;\t\u001eM<2l\f\u001b\u001cdb\u0013\u0007WI=\u000fW\nI\u0016lp\\F\u001cO\u0001bP^V\u0014}k\u000fVEs";
        objectArray[66] = "\u0005+\n(:\u001fZ&\u001d3B\u0007\u0005\u000e\u0000.?\u001c03\u001c;+\u0005k \u0006/r\u001f\u00156\bn(`";
        objectArray[67] = "3f*<\u001d\u00028i#M^WTz6v\u0002V)|!\"Qhiwq/P\u0005=t56`";
        objectArray[68] = "U38hRvM)z;<aH(d(ge[\"a\bFpY$\u0002iM'Pyo=NcII";
        objectArray[69] = "e}lPW]lq7L&\np\u007f7GKf&)?NK\u0019-ej\u0017&\u001e`k7GK\u0005py +";
        objectArray[70] = "9sQ\u0015\u0001't)\tLm0d>P\u001b\u0001\u00025y\bCmel?^\u0007T/1+]|";
        objectArray[71] = "b:&Yw*i5/(1@<d:G4<5c'N";
        objectArray[72] = "\u000f\b\u0001\"FL\u0004\u0007\bS\u0004&QV\u001d<\u0005ZXQ\u00005";
        objectArray[73] = "(\u000eP\u001f0_,\u001d\u0017\u0014A\u001b*\u0005Frq\u00056\u0019PK;X\"\u001a+";
        objectArray[74] = "RQJ|~'Y\u001d\u001f%\u00139\u0012!@ao)iVK&o%T\u0011NgvX";
        objectArray[75] = "84\u000b\u0002\u000383x^[n;dM\u0003\u0018\u0003=H`\u001f\nn|>f\u0001\n\u0011wr3Xg";
        objectArray[76] = "p\u0019Ge^\u001bwWGko\u001f{T::R\u001fsEE1\u001eJ*(^=\t\u0019{QDb_\u001a\u0016";
        objectArray[77] = "\u0010\u0002nnW\u0011\u0019\u0012b1&T\u0019\u001asSDEO\u0011|1[QKL\u001f<FVD\u0003a*H\u0017\u001e|p!H_\f\u0003~-WFt";
        objectArray[78] = "\u001cg\u0015\u000bVFNh\fR4\u001d\u001a~\u000fVX/N?T\b4\u0014\u0012p\u000e\rTIL<\u00141";
        objectArray[79] = "@vDuP;_+\u0011\u007fj(_t\u0019ij H.\u0010f\b?\\*M\u0005";
        objectArray[80] = "#%\u001au\u001fw4)\u0002fz&(*\fs-tp~R%z\"+5\u0002zE5'-\u0011";
        objectArray[81] = "SQ3hT:\f\\$s,\"Sn#lM#R50vUuBK&x\u0014/=";
        objectArray[82] = "ht*jf\u000ffx5s\u001e\u001a`j5\u001a \u0011|b+bl\u001b}dD";
        objectArray[83] = "(\u001d&Ve\u001a(\u00110^\u001eN3\u001e)Hs%rN/QsZy\u0002z\b\u001eD'\u0015\"O!D+\u0003*4";
        objectArray[84] = "\u0013`QU\n8V5_\u0015j2A&AJ\u0006\u0000\u0013f\u0011\u001dVWE>\u001c\u001cU4Q'\u001bMj>Hg\u0010\u0012\t*Q`A-\u00033\u0011k\u001eN\u0017*\u0016:!G\b%F?\u001eP\u0004=UZ\u001e\u0017\u001a/L5[B\u0014o,";
        objectArray[85] = "p\u000br|\u0007\u0012=Q*%k\u0005-Fsr\u00077|\u0001**kPq[zy\u0019\u001d+\u0003#\u0015V\u0011~X#x\u0002\u0012:A\u0013";
        objectArray[86] = "\u00153\u001b\u0012N\\XiCK\"KH~\u001a\u001cNy\u00199BG\"\u001e@\u007f\u0014\u0000\u001bT\u001dk\u0017{\u0012KXl\u0001BX\u0016LozKGSKyC\u0001\u001aGH\u0002J\u001e_@^;\u0000CKC%2\u001f\u0006LU\u001cxB\u0012O.\u0015g\u0007\u0015Y\u0017_:\u0013\u0016\"\u0014K=\u0006\u0006\u001fSN|\u001f{\u0018@\u001a~\u0007F_E[gzFS\u0010G2\u0017\u0012PT^\u0002";
        objectArray[87] = "|e\n(U6wj\u0003Y\u0019\\ gT5A5zw\u00028";
        objectArray[88] = ":0:4xr3 6k\t*31\u000buu4\u0015**do0^*5x4=`#%tkL";
        objectArray[89] = "\nz9y\u0010\u0011\u00016l }\u0003H:?x\u0006n\u000f&-x\u0012\u0016C,,~}T_x*a@\u0013Z93\u001c";
        objectArray[90] = "6T\n&\u0010~!X\u00125u/=[\u001c \"}e\u000fBwu+>D\u0012)J<2\\\u0001";
        objectArray[91] = "g3&$\t_*i~}eF3e< e\u0010&<%}\bD%x<M";
        objectArray[92] = "xK;\u001f}0vG$\u0006\u00054kP)\u0012~\u0004pU8o5*jW.V\u007fw~TU";
        objectArray[93] = "Hze\u0002\\]\u0012j3\u000f5\bsd'UW\n\u000eb0\u0001\u00044H%1\u000bXKCidR5";
        objectArray[94] = "G~}E%J]!+FH\\N>RW\u0013OY#}CH\b\u001e-~A7\u0003Rx',";
        objectArray[95] = "\u0001Av{Y|\rCxf+zkWxn\u0011!U\u0005wwH";
        objectArray[96] = "HC\r\u0006i\u0013RNX\u001f\u0019\u0012\\Mq\u0016r\u001a]\\G{a\u0014\rJL@h\u0018VV=";
        objectArray[97] = "~1;@kcalnJQgf3\u0002Q?|~)=Q3jvR`Shj&+\u007f\u000e=`\u001c";
        objectArray[98] = "v6gk0\u0002}9n\u001aphm/9xs\u0015k8m+MX 7kv?\u0015zo2\u001a";
        Object[] objectArray2 = objectArray;
        objectArray[99] = "\u0017[\u001f\f,@J\u0005S\u0016\u0010E\u0016B\r\n|wG\u0000TS\u0010MGW\u001d\nlD\u0018_\u000em}D\nU\u000eVkC\u0018TmPa\u001e\u0019\u000e\u0000\u0004bZ\u0000>";
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

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _5K.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00aa' || c == 'X' || c == 'a' || c == 'E') {
                field = _5K.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00aa' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'X' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'a' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5K.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'q' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5K" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x1B4F;
        if (k[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = j[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])l.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    l.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/5K", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5K.k[n2] = n3;
        }
        return k[n2];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5K.c(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
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
        int n = _5K.e(l2, l3);
        Object object = m[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = _5K.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = _5K.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5K.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5K.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5K.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5K.f(662380638467167L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5K.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5K.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5K.f(662380638467167L, 0L);
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
            int n = _5K.e(l2, l3);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                _5K.m[n] = clazz = Class.forName(_5K.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5K.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5K.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5K.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5K.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5K" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _5K.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x7141;
        if (e[n2] == null) {
            Object[] objectArray;
            try {
                Long l3 = Thread.currentThread().threadId();
                objectArray = (Object[])f.get(l3);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l3, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/5K", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l2 >>> 56);
            for (int j = 1; j < 8; ++j) {
                byArray[j] = (byte)(l2 << j * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n2].getBytes("ISO-8859-1");
            _5K.e[n2] = _5K.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5K" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field g(long l2, long l3) {
        int n = _5K.e(l2, l3);
        Object object = m[n];
        if (object instanceof String) {
            String string = _5K.n[n];
            int n2 = string.indexOf(8);
            Class clazz = _5K.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5K.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5K.c(clazz3, string2, clazz2)) != null) {
                    _5K.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5K.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5K.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5K.f(662380638467167L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public native void cfr_renamed_2();

    public boolean boolean_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = b ^ l2) ^ 0x5ADE4BF2129BL;
        return (boolean)_5K.d("q", (Object)_5K.d("\u00aa", (Object)this, -2376219908248269575L, (long)l2), (long)l3, -2370455441626755210L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    private void cfr_renamed_6(long var1_1, String var3_2) {
        block38: {
            v0 = var1_1 = _5K.b ^ var1_1;
            var4_3 = v0 ^ 87489527996269L;
            var6_4 = v0 ^ 4439492496784L;
            var8_5 = _7C.cfr_renamed_9();
            try {
                block52: {
                    block53: {
                        block54: {
                            block50: {
                                block51: {
                                    block48: {
                                        block49: {
                                            block45: {
                                                block46: {
                                                    block47: {
                                                        block42: {
                                                            block43: {
                                                                block44: {
                                                                    block40: {
                                                                        block41: {
                                                                            block36: {
                                                                                block37: {
                                                                                    block33: {
                                                                                        block34: {
                                                                                            block35: {
                                                                                                block30: {
                                                                                                    block31: {
                                                                                                        block32: {
                                                                                                            var9_6 = _5K.d("\u00f5", (long)5533837452601203774L, (long)var1_1);
                                                                                                            var10_8 = _5K.d("q", (Object)_5K.d("q", (Object)_5K.d("q", (Object)_5K.d("\u00f5", (long)5536635995902781128L, (long)var1_1), (Object)_5K.d("\u00f5", (String)_5K.a("v", (int)4298, (long)(5205632650789236057L ^ var1_1)) + var3_2, (long)5534588421352250009L, (long)var1_1), (long)5531058676172078529L, (long)var1_1), (long)5536930572699310056L, (long)var1_1), (long)5533211361861791803L, (long)var1_1);
                                                                                                            var11_9 = _5K.d("q", (Object)var9_6, (Object)var10_8, (Object)_5K.d("\u00f5", (long)5534491101516240388L, (long)var1_1), (long)5533087174253405716L, (long)var1_1);
                                                                                                            try {
                                                                                                                v1 = var11_9;
                                                                                                                if (var8_5 == 0) break block30;
                                                                                                                v2 = 5534081466842701190L;
                                                                                                                v3 = var1_1;
                                                                                                                if (var1_1 <= 0L) break block31;
                                                                                                                if (_5K.d("q", (Object)v1, (long)v2, (long)v3) == _5K.c("b", (int)5286, (long)(5391183790975664948L ^ var1_1))) break block32;
                                                                                                            }
                                                                                                            catch (Exception v4) {
                                                                                                                throw _5K.a(v4);
                                                                                                            }
                                                                                                            return;
                                                                                                        }
                                                                                                        v5 = var11_9;
                                                                                                        v2 = 5534539204405503597L;
                                                                                                        v3 = var1_1;
                                                                                                    }
                                                                                                    v1 = _5K.d("q", (Object)v5, (long)v2, (long)v3);
                                                                                                }
                                                                                                var12_10 = _5K.d("q", (Object)_5K.d("\u00f5", (String)v1, (long)5536401633635245635L, (long)var1_1), (long)5537125849015770172L, (long)var1_1);
                                                                                                var13_11 = _5K.d("q", (Object)_5K.d("q", (Object)var12_10, (Object)_5K.a("v", (int)7988, (long)(370865159656350393L ^ var1_1)), (long)5532955793735021271L, (long)var1_1), (long)5534249730367289791L, (long)var1_1);
                                                                                                var14_12 = _5K.d("q", (Object)_5K.d("q", (Object)_5K.d("q", (Object)_5K.d("\u00f5", (long)5536635995902781128L, (long)var1_1), (Object)_5K.d("\u00f5", (String)_5K.a("v", (int)30760, (long)(5712794238030366128L ^ var1_1)) + (String)var13_11, (long)5534588421352250009L, (long)var1_1), (long)5531058676172078529L, (long)var1_1), (long)5536930572699310056L, (long)var1_1), (long)5533211361861791803L, (long)var1_1);
                                                                                                var15_13 = _5K.d("q", (Object)var9_6, (Object)var14_12, (Object)_5K.d("\u00f5", (long)5534491101516240388L, (long)var1_1), (long)5533087174253405716L, (long)var1_1);
                                                                                                try {
                                                                                                    v6 = var15_13;
                                                                                                    if (var8_5 == 0) break block33;
                                                                                                    v7 = 5534081466842701190L;
                                                                                                    v8 = var1_1;
                                                                                                    if (var1_1 <= 0L) break block34;
                                                                                                    if (_5K.d("q", (Object)v6, (long)v7, (long)v8) == _5K.c("b", (int)14683, (long)(3193187133376163523L ^ var1_1))) break block35;
                                                                                                }
                                                                                                catch (Exception v9) {
                                                                                                    throw _5K.a(v9);
                                                                                                }
                                                                                                return;
                                                                                            }
                                                                                            v10 = var15_13;
                                                                                            v7 = 5534539204405503597L;
                                                                                            v8 = var1_1;
                                                                                        }
                                                                                        v6 = _5K.d("q", (Object)v10, (long)v7, (long)v8);
                                                                                    }
                                                                                    var16_14 = _5K.d("q", (Object)_5K.d("\u00f5", (String)v6, (long)5536401633635245635L, (long)var1_1), (long)5537125849015770172L, (long)var1_1);
                                                                                    try {
                                                                                        v11 = var16_14;
                                                                                        v12 = _5K.a("v", (int)25778, (long)(8071697316290058528L ^ var1_1));
                                                                                        if (var8_5 == 0) break block36;
                                                                                        if (_5K.d("q", (Object)v11, (Object)v12, (long)5536564096227446516L, (long)var1_1) != false) break block37;
                                                                                    }
                                                                                    catch (Exception v13) {
                                                                                        throw _5K.a(v13);
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                v11 = var16_14;
                                                                                v12 = _5K.a("v", (int)16487, (long)(8970775334518095344L ^ var1_1));
                                                                            }
                                                                            var17_15 = _5K.d("q", (Object)v11, (Object)v12, (long)5536237874078188740L, (long)var1_1);
                                                                            var18_16 = null;
                                                                            var19_17 = 0;
                                                                            while (var19_17 < _5K.d("q", (Object)var17_15, (long)5532802711879590307L, (long)var1_1)) {
                                                                                block39: {
                                                                                    var20_19 = _5K.d("q", (Object)_5K.d("q", (Object)var17_15, (int)var19_17, (long)5536870441753137272L, (long)var1_1), (long)5537125849015770172L, (long)var1_1);
                                                                                    if (var1_1 < 0L) break block38;
                                                                                    v14 = var8_5;
                                                                                    if (var1_1 <= 0L) ** GOTO lbl76
                                                                                    if (v14 == 0) break block38;
                                                                                    try {
                                                                                        block55: {
                                                                                            v14 = var8_5;
lbl76:
                                                                                            // 2 sources

                                                                                            if (v14 == 0) continue;
                                                                                            break block55;
                                                                                            catch (Exception v15) {
                                                                                                throw _5K.a(v15);
                                                                                            }
                                                                                        }
                                                                                        if (_5K.d("q", (Object)_5K.a("v", (int)31105, (long)(6150928161048970257L ^ var1_1)), (Object)_5K.d("q", (Object)_5K.d("q", (Object)var20_19, (Object)_5K.a("v", (int)1283, (long)(6377806476078528658L ^ var1_1)), (long)5532955793735021271L, (long)var1_1), (long)5534249730367289791L, (long)var1_1), (long)5533893899001880140L, (long)var1_1) == false) break block39;
                                                                                    }
                                                                                    catch (Exception v16) {
                                                                                        throw _5K.a(v16);
                                                                                    }
                                                                                    var18_16 = _5K.d("q", (Object)_5K.d("q", (Object)var20_19, (Object)_5K.a("v", (int)23731, (long)(7105231338142916921L ^ var1_1)), (long)5532955793735021271L, (long)var1_1), (long)5534249730367289791L, (long)var1_1);
                                                                                    break;
                                                                                }
                                                                                ++var19_17;
                                                                            }
                                                                            try {
                                                                                v17 = var18_16;
                                                                                if (var8_5 == 0) break block40;
                                                                                if (v17 != null) break block41;
                                                                            }
                                                                            catch (Exception v18) {
                                                                                throw _5K.a(v18);
                                                                            }
                                                                            return;
                                                                        }
                                                                        v17 = new String((byte[])_5K.d("q", (Object)_5K.d("\u00f5", (long)5531052798754254332L, (long)var1_1), (Object)var18_16, (long)5533591968649533229L, (long)var1_1));
                                                                    }
                                                                    var19_18 = v17;
                                                                    var20_19 = _5K.d("q", (Object)_5K.d("\u00f5", var19_18, (long)5536401633635245635L, (long)var1_1), (long)5537125849015770172L, (long)var1_1);
                                                                    try {
                                                                        v19 = var20_19;
                                                                        if (var1_1 <= 0L) break block42;
                                                                        v20 = _5K.a("v", (int)19507, (long)(4197463952630673832L ^ var1_1));
                                                                        if (var8_5 == 0) break block43;
                                                                        if (_5K.d("q", (Object)v19, (Object)v20, (long)5536564096227446516L, (long)var1_1) != false) break block44;
                                                                    }
                                                                    catch (Exception v21) {
                                                                        throw _5K.a(v21);
                                                                    }
                                                                    return;
                                                                }
                                                                v22 = var20_19;
                                                                v20 = _5K.a("v", (int)19507, (long)(4197463952630673832L ^ var1_1));
                                                            }
                                                            v19 = _5K.d("q", (Object)v22, (Object)v20, (long)5536445493944710955L, (long)var1_1);
                                                        }
                                                        var21_20 = v19;
                                                        try {
                                                            v23 = var21_20;
                                                            if (var1_1 <= 0L) break block45;
                                                            v24 = _5K.a("v", (int)19188, (long)(6736878099848755066L ^ var1_1));
                                                            if (var8_5 == 0) break block46;
                                                            if (_5K.d("q", (Object)v23, (Object)v24, (long)5536564096227446516L, (long)var1_1) != false) break block47;
                                                        }
                                                        catch (Exception v25) {
                                                            throw _5K.a(v25);
                                                        }
                                                        return;
                                                    }
                                                    v26 = var21_20;
                                                    v24 = _5K.a("v", (int)21644, (long)(1646657229135243537L ^ var1_1));
                                                }
                                                v23 = _5K.d("q", (Object)v26, (Object)v24, (long)5536445493944710955L, (long)var1_1);
                                            }
                                            var22_21 = v23;
                                            var23_22 = _5K.d("q", (Object)_5K.d("q", (Object)var22_21, (Object)_5K.a("v", (int)30193, (long)(3937470264087693423L ^ var1_1)), (long)5532955793735021271L, (long)var1_1), (long)5534249730367289791L, (long)var1_1);
                                            var24_23 = _5K.d("a", (long)5533970554843058271L, (long)var1_1);
                                            v27 = var22_21;
                                            if (var1_1 <= 0L) break block48;
                                            v28 = _5K.a("v", (int)15849, (long)(2746775994927808610L ^ var1_1));
                                            if (var8_5 == 0) break block49;
                                            try {
                                                block56: {
                                                    if (_5K.d("q", (Object)v27, (Object)v28, (long)5536564096227446516L, (long)var1_1) == false) break block50;
                                                    break block56;
                                                    catch (Exception v29) {
                                                        throw _5K.a(v29);
                                                    }
                                                }
                                                v30 = var22_21;
                                                v28 = _5K.a("v", (int)21446, (long)(9209470676226698834L ^ var1_1));
                                            }
                                            catch (Exception v31) {
                                                throw _5K.a(v31);
                                            }
                                        }
                                        v27 = _5K.d("q", (Object)v30, (Object)v28, (long)5536445493944710955L, (long)var1_1);
                                    }
                                    var25_24 = v27;
                                    v32 = _5K.d("q", (Object)var25_24, (Object)_5K.a("v", (int)7818, (long)(6318516175517623062L ^ var1_1)), (long)5536564096227446516L, (long)var1_1);
                                    if (var8_5 == 0) break block51;
                                    try {
                                        block57: {
                                            if (v32 == false) break block50;
                                            break block57;
                                            catch (Exception v33) {
                                                throw _5K.a(v33);
                                            }
                                        }
                                        v32 = _5K.d("q", (Object)_5K.a("v", (int)19538, (long)(3805322312926491101L ^ var1_1)), (Object)_5K.d("q", (Object)_5K.d("q", (Object)var25_24, (Object)_5K.a("v", (int)31295, (long)(8858627169269991333L ^ var1_1)), (long)5532955793735021271L, (long)var1_1), (long)5534249730367289791L, (long)var1_1), (long)5533893899001880140L, (long)var1_1);
                                    }
                                    catch (Exception v34) {
                                        throw _5K.a(v34);
                                    }
                                }
                                if (v32 != false) {
                                    var24_23 = _5K.d("a", (long)5534425890015199793L, (long)var1_1);
                                }
                            }
                            var25_24 = _5K.d("q", (Object)_5K.d("q", (Object)_5K.d("q", (Object)_5K.d("\u00f5", (long)5536635995902781128L, (long)var1_1), (Object)_5K.d("\u00f5", (Object)var23_22, (long)5534588421352250009L, (long)var1_1), (long)5531058676172078529L, (long)var1_1), (long)5536930572699310056L, (long)var1_1), (long)5533211361861791803L, (long)var1_1);
                            var26_25 = _5K.d("q", (Object)var9_6, (Object)var25_24, (Object)_5K.d("\u00f5", (long)5533442791830894415L, (long)var1_1), (long)5533087174253405716L, (long)var1_1);
                            try {
                                v35 = var26_25;
                                if (var8_5 == 0) break block52;
                                v36 = 5534081466842701190L;
                                v37 = var1_1;
                                if (var1_1 < 0L) break block53;
                                if (_5K.d("q", (Object)v35, (long)v36, (long)v37) == _5K.c("b", (int)14683, (long)(3193187133376163523L ^ var1_1))) break block54;
                            }
                            catch (Exception v38) {
                                throw _5K.a(v38);
                            }
                            return;
                        }
                        v39 = var26_25;
                        v36 = 5534539204405503597L;
                        v37 = var1_1;
                    }
                    v35 = _5K.d("q", (Object)v39, (long)v36, (long)v37);
                }
                var27_26 = _5K.d("\u00f5", (Object)((InputStream)v35), (long)5535173678640124075L, (long)var1_1);
                v40 = new Object[2];
                v40[1] = var6_4;
                v40[0] = var27_26;
                var28_27 = _5K.d("\u00f5", (Object)v40, (long)5531164435208564536L, (long)var1_1);
                var29_28 = _5K.d("\u00f5", (Object)_5K.a("v", (int)19261, (long)(8328539655253554852L ^ var1_1)), (Object)((String)_5K.a("v", (int)5408, (long)(8452187207646652597L ^ var1_1)) + (String)_5K.d("q", var3_2, (long)5532897992730030783L, (long)var1_1)), (long)5533340081455044946L, (long)var1_1);
                var30_29 = var24_23;
                _5K.d("q", (Object)_5K.d("\u00aa", (Object)this, (long)5534291686948513184L, (long)var1_1), (Object)(Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, 7(net.minecraft.class_2960 java.lang.String net.minecraft.class_1011 long java.lang.String net.minecraft.class_7920 ), ()V)((_5K)this, (class_2960)var29_28, (String)var3_2, (class_1011)var28_27, (long)var4_3, (String)var23_22, (class_7920)var30_29), (long)5537026084624222289L, (long)var1_1);
            }
            catch (Exception var9_7) {
                _5K.d("q", (Object)var9_7, (long)5533581779216474982L, (long)var1_1);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static class_1011 net_minecraft_class_1011_5(Object[] var0) {
        block29: {
            block30: {
                block27: {
                    block28: {
                        block26: {
                            block24: {
                                block25: {
                                    var1_1 = (class_1011)var0[0];
                                    var2_2 = (Long)var0[1];
                                    v0 = var2_2 = _5K.b ^ var2_2;
                                    var4_3 = v0 ^ 92769022952684L;
                                    var6_4 = v0 ^ 121560698236199L;
                                    var8_5 = _7C.cfr_renamed_9();
                                    var9_6 = _5K.d("q", (Object)var1_1, (long)8276920745413212840L, (long)var2_2);
                                    var10_7 = _5K.d("q", (Object)var1_1, (long)8268767579042200773L, (long)var2_2);
                                    try {
                                        block23: {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (var8_5 == 0) ** GOTO lbl51
                                                                if (var10_7 != _5K.c("b", (int)30578, (long)(4403892637764230896L ^ var2_2))) break block23;
                                                            }
                                                            catch (IllegalStateException v1) {
                                                                throw _5K.a(v1);
                                                            }
                                                            v2 = var9_6;
                                                            v3 /* !! */  = _5K.c("b", (int)28216, (long)(7676554643817629616L ^ var2_2));
                                                            if (var8_5 == 0) break block24;
                                                        }
                                                        catch (IllegalStateException v4) {
                                                            throw _5K.a(v4);
                                                        }
                                                        if (var2_2 >= 0L) {
                                                            if (v2 == v3 /* !! */ ) break block25;
                                                        }
                                                        ** GOTO lbl56
                                                    }
                                                    catch (IllegalStateException v5) {
                                                        throw _5K.a(v5);
                                                    }
                                                    v2 = var9_6;
                                                    v3 /* !! */  = _5K.c("b", (int)27548, (long)(8522786725666652682L ^ var2_2));
                                                    if (var8_5 == 0) break block24;
                                                }
                                                catch (IllegalStateException v6) {
                                                    throw _5K.a(v6);
                                                }
                                                if (var2_2 >= 0L) {
                                                    if (v2 == v3 /* !! */ ) break block25;
                                                }
                                                ** GOTO lbl56
                                            }
                                            catch (IllegalStateException v7) {
                                                throw _5K.a(v7);
                                            }
                                        }
                                        _5K.d("q", (Object)var1_1, (long)8270800696911718323L, (long)var2_2);
                                    }
                                    catch (IllegalStateException v8) {
                                        throw _5K.a(v8);
                                    }
lbl51:
                                    // 2 sources

                                    throw new IllegalStateException((String)_5K.a("v", (int)6053, (long)(7778092051093394488L ^ var2_2)) + (int)var10_7 + (String)_5K.a("v", (int)21730, (long)(8407438805627590518L ^ var2_2)) + (int)var9_6 + ")");
                                }
                                try {
                                    v2 = var9_6;
                                    v3 /* !! */  = (CallSite)var8_5;
lbl56:
                                    // 3 sources

                                    if (var2_2 <= 0L) break block24;
                                    if (v3 /* !! */  == false) break block26;
                                    v3 /* !! */  = _5K.c("b", (int)28426, (long)(1605032310908126858L ^ var2_2));
                                }
                                catch (IllegalStateException v9) {
                                    throw _5K.a(v9);
                                }
                            }
                            v2 = v2 == v3 /* !! */  ? (Object)true : (Object)false;
                        }
                        var11_8 = v2;
                        try {
                            v10 = var11_8;
                            if (var2_2 <= 0L || var8_5 == 0) break block27;
                            if (v10 == false) break block28;
                        }
                        catch (IllegalStateException v11) {
                            throw _5K.a(v11);
                        }
                        var12_9 = new class_1011((int)_5K.c("b", (int)27548, (long)(8522786725666652682L ^ var2_2)), (int)_5K.c("b", (int)27548, (long)(8522786725666652682L ^ var2_2)), true);
                        _5K.d("q", (Object)var12_9, (Object)var1_1, (long)8269849122801993662L, (long)var2_2);
                        _5K.d("q", (Object)var1_1, (long)8270800696911718323L, (long)var2_2);
                        var1_1 = var12_9;
                        _5K.d("q", (Object)var1_1, (int)0, (int)_5K.c("b", (int)28426, (long)(1605032310908126858L ^ var2_2)), (int)_5K.c("b", (int)27548, (long)(8522786725666652682L ^ var2_2)), (int)_5K.c("b", (int)28426, (long)(1605032310908126858L ^ var2_2)), (int)0, (long)8277599045426365863L, (long)var2_2);
                        _5K.d("q", (Object)var1_1, (int)4, (int)_5K.c("b", (int)13133, (long)(8457537217953913538L ^ var2_2)), (int)_5K.c("b", (int)24487, (long)(7401142823126414884L ^ var2_2)), (int)_5K.c("b", (int)28426, (long)(1605032310908126858L ^ var2_2)), (int)4, (int)4, (boolean)true, (boolean)false, (long)8269892282035869825L, (long)var2_2);
                        _5K.d("q", (Object)var1_1, (int)_5K.c("b", (int)21039, (long)(6939732538437745577L ^ var2_2)), (int)_5K.c("b", (int)24487, (long)(7401142823126414884L ^ var2_2)), (int)_5K.c("b", (int)24487, (long)(7401142823126414884L ^ var2_2)), (int)_5K.c("b", (int)28426, (long)(1605032310908126858L ^ var2_2)), (int)4, (int)4, (boolean)true, (boolean)false, (long)8269892282035869825L, (long)var2_2);
                        _5K.d("q", (Object)var1_1, (int)0, (int)_5K.c("b", (int)23670, (long)(4168307214521349629L ^ var2_2)), (int)_5K.c("b", (int)815, (long)(739490143132871338L ^ var2_2)), (int)_5K.c("b", (int)28426, (long)(1605032310908126858L ^ var2_2)), (int)4, (int)_5K.c("b", (int)18079, (long)(3173667650638851850L ^ var2_2)), (boolean)true, (boolean)false, (long)8269892282035869825L, (long)var2_2);
                        _5K.d("q", (Object)var1_1, (int)4, (int)_5K.c("b", (int)29408, (long)(4845942572817521522L ^ var2_2)), (int)_5K.c("b", (int)24487, (long)(7401142823126414884L ^ var2_2)), (int)_5K.c("b", (int)28426, (long)(1605032310908126858L ^ var2_2)), (int)4, (int)_5K.c("b", (int)3129, (long)(4576926954126239166L ^ var2_2)), (boolean)true, (boolean)false, (long)8269892282035869825L, (long)var2_2);
                        _5K.d("q", (Object)var1_1, (int)_5K.c("b", (int)19623, (long)(5653592012574238011L ^ var2_2)), (int)_5K.c("b", (int)29408, (long)(4845942572817521522L ^ var2_2)), (int)_5K.c("b", (int)19623, (long)(5653592012574238011L ^ var2_2)), (int)_5K.c("b", (int)28426, (long)(1605032310908126858L ^ var2_2)), (int)4, (int)_5K.c("b", (int)3129, (long)(4576926954126239166L ^ var2_2)), (boolean)true, (boolean)false, (long)8269892282035869825L, (long)var2_2);
                        _5K.d("q", (Object)var1_1, (int)_5K.c("b", (int)3129, (long)(4576926954126239166L ^ var2_2)), (int)_5K.c("b", (int)29408, (long)(4845942572817521522L ^ var2_2)), (int)_5K.c("b", (int)24487, (long)(7401142823126414884L ^ var2_2)), (int)_5K.c("b", (int)28426, (long)(1605032310908126858L ^ var2_2)), (int)4, (int)_5K.c("b", (int)3129, (long)(4576926954126239166L ^ var2_2)), (boolean)true, (boolean)false, (long)8269892282035869825L, (long)var2_2);
                        _5K.d("q", (Object)var1_1, (int)_5K.c("b", (int)2199, (long)(6316985312029270284L ^ var2_2)), (int)_5K.c("b", (int)24487, (long)(7401142823126414884L ^ var2_2)), (int)_5K.c("b", (int)7949, (long)(4558185715513030297L ^ var2_2)), (int)_5K.c("b", (int)28426, (long)(1605032310908126858L ^ var2_2)), (int)4, (int)4, (boolean)true, (boolean)false, (long)8269892282035869825L, (long)var2_2);
                        _5K.d("q", (Object)var1_1, (int)_5K.c("b", (int)3508, (long)(2250434628757087274L ^ var2_2)), (int)_5K.c("b", (int)24487, (long)(7401142823126414884L ^ var2_2)), (int)_5K.c("b", (int)21019, (long)(7605517536216398737L ^ var2_2)), (int)_5K.c("b", (int)28426, (long)(1605032310908126858L ^ var2_2)), (int)4, (int)4, (boolean)true, (boolean)false, (long)8269892282035869825L, (long)var2_2);
                        _5K.d("q", (Object)var1_1, (int)_5K.c("b", (int)5237, (long)(5358773833034825186L ^ var2_2)), (int)_5K.c("b", (int)29408, (long)(4845942572817521522L ^ var2_2)), (int)0, (int)_5K.c("b", (int)28426, (long)(1605032310908126858L ^ var2_2)), (int)4, (int)_5K.c("b", (int)3129, (long)(4576926954126239166L ^ var2_2)), (boolean)true, (boolean)false, (long)8269892282035869825L, (long)var2_2);
                        _5K.d("q", (Object)var1_1, (int)_5K.c("b", (int)8375, (long)(2864992278094989615L ^ var2_2)), (int)_5K.c("b", (int)29408, (long)(4845942572817521522L ^ var2_2)), (int)_5K.c("b", (int)21019, (long)(7605517536216398737L ^ var2_2)), (int)_5K.c("b", (int)28426, (long)(1605032310908126858L ^ var2_2)), (int)4, (int)_5K.c("b", (int)3129, (long)(4576926954126239166L ^ var2_2)), (boolean)true, (boolean)false, (long)8269892282035869825L, (long)var2_2);
                        _5K.d("q", (Object)var1_1, (int)_5K.c("b", (int)7984, (long)(8388591983730161313L ^ var2_2)), (int)_5K.c("b", (int)29408, (long)(4845942572817521522L ^ var2_2)), (int)_5K.c("b", (int)29337, (long)(4693094985568951064L ^ var2_2)), (int)_5K.c("b", (int)28426, (long)(1605032310908126858L ^ var2_2)), (int)4, (int)_5K.c("b", (int)3129, (long)(4576926954126239166L ^ var2_2)), (boolean)true, (boolean)false, (long)8269892282035869825L, (long)var2_2);
                        _5K.d("q", (Object)var1_1, (int)_5K.c("b", (int)19962, (long)(1092629999180227699L ^ var2_2)), (int)_5K.c("b", (int)29408, (long)(4845942572817521522L ^ var2_2)), (int)_5K.c("b", (int)21019, (long)(7605517536216398737L ^ var2_2)), (int)_5K.c("b", (int)28426, (long)(1605032310908126858L ^ var2_2)), (int)4, (int)_5K.c("b", (int)3129, (long)(4576926954126239166L ^ var2_2)), (boolean)true, (boolean)false, (long)8269892282035869825L, (long)var2_2);
                    }
                    try {
                        v12 = var1_1;
                        if (var2_2 < 0L) break block29;
                        v13 = new Object[6];
                        v13[5] = (int)_5K.c("b", (int)24487, (long)(7401142823126414884L ^ var2_2));
                        v13[4] = var6_4;
                        v13[3] = (int)_5K.c("b", (int)28426, (long)(1605032310908126858L ^ var2_2));
                        v13[2] = 0;
                        v13[1] = 0;
                        v13[0] = v12;
                        _5K.d("\u00f5", (Object)v13, (long)8269161414938114003L, (long)var2_2);
                        if (var8_5 == 0) break block30;
                        v10 = var11_8;
                    }
                    catch (IllegalStateException v14) {
                        throw _5K.a(v14);
                    }
                }
                try {
                    if (v10 != false) {
                        v15 = new Object[6];
                        v15[5] = var4_3;
                        v15[4] = (int)_5K.c("b", (int)28426, (long)(1605032310908126858L ^ var2_2));
                        v15[3] = (int)_5K.c("b", (int)27548, (long)(8522786725666652682L ^ var2_2));
                        v15[2] = 0;
                        v15[1] = (int)_5K.c("b", (int)28426, (long)(1605032310908126858L ^ var2_2));
                        v15[0] = var1_1;
                        _5K.d("\u00f5", (Object)v15, (long)8268910133197650446L, (long)var2_2);
                    }
                }
                catch (IllegalStateException v16) {
                    throw _5K.a(v16);
                }
                v17 = new Object[6];
                v17[5] = (int)_5K.c("b", (int)28426, (long)(1605032310908126858L ^ var2_2));
                v17[4] = var6_4;
                v17[3] = (int)_5K.c("b", (int)27548, (long)(8522786725666652682L ^ var2_2));
                v17[2] = (int)_5K.c("b", (int)24487, (long)(7401142823126414884L ^ var2_2));
                v17[1] = 0;
                v17[0] = var1_1;
                _5K.d("\u00f5", (Object)v17, (long)8269161414938114003L, (long)var2_2);
                v18 = new Object[6];
                v18[5] = (int)_5K.c("b", (int)27548, (long)(8522786725666652682L ^ var2_2));
                v18[4] = var6_4;
                v18[3] = (int)_5K.c("b", (int)7984, (long)(8388591983730161313L ^ var2_2));
                v18[2] = (int)_5K.c("b", (int)7984, (long)(8388591983730161313L ^ var2_2));
                v18[1] = (int)_5K.c("b", (int)24487, (long)(7401142823126414884L ^ var2_2));
                v18[0] = var1_1;
                _5K.d("\u00f5", (Object)v18, (long)8269161414938114003L, (long)var2_2);
            }
            v12 = var1_1;
        }
        return v12;
    }

    public boolean boolean_7(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = b ^ l2) ^ 0x716D9EB33102L;
        return (boolean)_5K.d("q", (Object)_5K.d("\u00aa", (Object)this, -243429430748918062L, (long)l2), (long)l3, -251259409056715537L, (long)l2);
    }

    private void cfr_renamed_9(class_2960 class_29602, String string, class_1011 class_10112, long l2, String string2, class_7920 class_79202) {
        long l3 = (l2 = b ^ l2) ^ 0x1C067D33981AL;
        _5K.d("q", (Object)_5K.d("q", (Object)_5K.d("\u00aa", (Object)this, 2322624305869408598L, (long)l2), 2323812903033051023L, (long)l2), (Object)class_29602, (Object)new class_1043(() -> _5K.cfr_renamed_9(l3, string), class_10112), 2320684710504020205L, (long)l2);
        _5K.d("X", (Object)this, (class_8685)_5K.d("\u00f5", (Object)new class_12079.class_12080(class_29602, string2), null, null, (Object)class_79202, 2321993452479293884L, (long)l2), 2315941910289535068L, (long)l2);
    }

    private static String cfr_renamed_9(long l2, String string) {
        l2 = b ^ l2;
        return (String)((Object)_5K.a("v", 21637, (long)(0x3719C3E297EDAE7BL ^ l2))) + (String)((Object)_5K.d("q", string, 846570062959244744L, (long)l2));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5K.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_5K.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5K.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

