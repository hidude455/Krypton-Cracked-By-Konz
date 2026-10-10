/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1657
 *  net.minecraft.class_2596
 *  net.minecraft.class_2824
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_5321
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._3C;
import dev.krypton._3i_0;
import dev.krypton._40;
import dev.krypton._4r;
import dev.krypton._6f_0;
import dev.krypton._6x_0;
import dev.krypton._8Y;
import dev.krypton._95;
import dev.krypton._9H;
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
import net.minecraft.class_1657;
import net.minecraft.class_2596;
import net.minecraft.class_2824;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_5321;

/*
 * Renamed from dev.krypton.5j
 */
public class _5j_0
extends _6x_0 {
    private static final long cfr_renamed_0;
    private final _9r cfr_renamed_4;
    private final _9H cfr_renamed_9;
    private long cfr_renamed_1;
    private float cfr_renamed_7;
    private class_1657 cfr_renamed_2;
    private static final long b;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static final long[] j;
    private static final Integer[] k;
    private static final Map l;
    private static final long[] m;
    private static final Long[] n;
    private static final Map o;
    private static final Object[] r;
    private static final String[] s;

    private static class_2960 cfr_renamed_5(long l2, class_5321 class_53212) {
        l2 = b ^ l2;
        return _5j_0.f("b", (Object)class_53212, 5776450501742129630L, (long)l2);
    }

    static class_310 net_minecraft_class_310_1(Object[] objectArray) {
        _5j_0 j_0 = (_5j_0)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = b ^ l2;
        return _5j_0.f("\u00c9", (Object)j_0, 2477381505847616240L, (long)l2);
    }

    private String java_lang_String_1(Object[] objectArray) {
        Object object;
        int n;
        long l2;
        block10: {
            int n2;
            block11: {
                block12: {
                    int n3;
                    block8: {
                        l2 = (Long)objectArray[0];
                        n = (Integer)objectArray[1];
                        l2 = b ^ l2;
                        int n4 = _3C.cfr_renamed_4();
                        try {
                            block9: {
                                try {
                                    try {
                                        try {
                                            n3 = n;
                                            if (n4 != 0) break block8;
                                            if (n3 < 1) break block9;
                                        }
                                        catch (MatchException matchException) {
                                            throw _5j_0.a(matchException);
                                        }
                                        object = n;
                                        if (n4 != 0) break block10;
                                    }
                                    catch (MatchException matchException) {
                                        throw _5j_0.a(matchException);
                                    }
                                    if (l2 < 0L) break block11;
                                    if (object <= _5j_0.c("l", 17176, (long)(0x10CEB3548CB5875EL ^ l2))) break block12;
                                }
                                catch (MatchException matchException) {
                                    throw _5j_0.a(matchException);
                                }
                            }
                            n3 = n;
                        }
                        catch (MatchException matchException) {
                            throw _5j_0.a(matchException);
                        }
                    }
                    return _5j_0.f("$", (int)n3, 4223649265118706437L, (long)l2);
                }
                n2 = 5260;
            }
            object = _5j_0.c("l", (int)n2, (long)(0x79231DD0440950DDL ^ l2));
        }
        String[] stringArray = new String[object];
        stringArray[0] = "I";
        stringArray[1] = _5j_0.a("e", 23461, (long)(0x24D7314D718F9D81L ^ l2));
        stringArray[2] = _5j_0.a("e", 21298, (long)(0x101B87117DE29511L ^ l2));
        stringArray[3] = _5j_0.a("e", 28909, (long)(0x1DDA59624D1036C3L ^ l2));
        stringArray[4] = "V";
        stringArray[5] = _5j_0.a("e", 24805, (long)(0x45BB659320CE26C5L ^ l2));
        stringArray[_5j_0.c("l", 31082, (long)(0x27BDAAF958D13D37L ^ l2))] = _5j_0.a("e", 961, (long)(0x1253C963F62B45E4L ^ l2));
        stringArray[_5j_0.c("l", 23009, (long)(0x4C7FF01EF0B81DABL ^ l2))] = _5j_0.a("e", 30507, (long)(0x72F8E5F1695C3106L ^ l2));
        stringArray[_5j_0.c("l", 445, (long)(0x628F012D980E45E5L ^ l2))] = _5j_0.a("e", 1812, (long)(0x10B8F83051574136L ^ l2));
        stringArray[_5j_0.c("l", 13819, (long)(0x8F899F84105F1ACL ^ l2))] = "X";
        return stringArray[n - 1];
    }

    @Override
    public native void cfr_renamed_5();

    /*
     * Exception decompiling
     */
    private void cfr_renamed_280(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [31[DOLOOP]], but top level block is 41[SIMPLE_IF_TAKEN]
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

    private void cfr_renamed_411(Object[] objectArray) {
        _5j_0 j_0;
        long l2;
        block4: {
            block5: {
                class_1657 class_16572 = (class_1657)objectArray[0];
                l2 = (Long)objectArray[1];
                l2 = b ^ l2;
                int n = _3C.cfr_renamed_7();
                try {
                    try {
                        j_0 = this;
                        if (n == 0) break block4;
                        if (_5j_0.f("\u00c9", (Object)j_0, -8587453446663589151L, (long)l2) == class_16572) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _5j_0.a(matchException);
                    }
                    _5j_0.f("\u00e1", (Object)this, (class_1657)class_16572, -8587453446663589151L, (long)l2);
                    _5j_0.f("\u00e1", (Object)this, (float)(_5j_0.f("b", (Object)class_16572, -8579811943666619249L, (long)l2) + _5j_0.f("b", (Object)class_16572, -8580240164971793171L, (long)l2)), -8587684388657510581L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _5j_0.a(matchException);
                }
            }
            j_0 = this;
        }
        _5j_0.f("\u00e1", (Object)j_0, (long)_5j_0.f("$", -8587863751056057609L, (long)l2), -8584757927222844695L, (long)l2);
    }

    public _5j_0(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x31DB6810A607L;
        long l5 = l3 ^ 0x496646202EEL;
        int n = (int)(l5 >>> 48);
        int n2 = (int)(l5 << 16 >>> 48);
        int n3 = (int)(l5 << 32 >>> 32);
        long l6 = l3 ^ 0x104BFA9867D9L;
        long l7 = l3 ^ 0x48371E20C47CL;
        long l8 = l7 >>> 16;
        int n4 = (int)(l7 << 48 >>> 48);
        long l9 = l3 ^ 0x67E3FF532E6EL;
        long l10 = l3 ^ 0x78236C77C11CL;
        super((int)_5j_0.c("l", 18116, (long)(0x645429205D703F71L ^ l2)), -1, (_4r)((Object)_5j_0.f("P", -8694111522915747482L, (long)l2)), l9);
        this.cfr_renamed_4 = new _9r((int)_5j_0.c("l", 28243, (long)(0x475A804EE6FF97E9L ^ l2)), true, l4);
        this.cfr_renamed_9 = new _9H(l8, (int)_5j_0.c("l", 25272, (long)(0xCD9F0B52E8F1B13L ^ l2)), (char)n4);
        _5j_0.f("\u00e1", (Object)this, (long)_5j_0.d("d", 26382, (long)(0x6C4C7CF85DDDBA61L ^ l2)), -8694221110733116062L, (long)l2);
        _5j_0.f("\u00e1", (Object)this, 0.0f, -8693828146798802752L, (long)l2);
        _5j_0.f("\u00e1", (Object)this, null, -8694191082817405590L, (long)l2);
        Object[] objectArray = new Object[2];
        objectArray[1] = new _95[]{_5j_0.f("\u00c9", (Object)this, -8692574971868986837L, (long)l2), _5j_0.f("\u00c9", (Object)this, -8694001517846244867L, (long)l2)};
        objectArray[0] = l10;
        _5j_0.f("b", (Object)this, (Object)objectArray, -8694581088721435292L, (long)l2);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l6;
        objectArray2[1] = (arg_0, arg_1) -> this.cfr_renamed_0((short)n, (short)n2, n3, arg_0, arg_1);
        objectArray2[0] = _5j_0.a("e", 19907, (long)(0x53A98541FFE0B62CL ^ l2));
        _5j_0.f("$", (Object)objectArray2, -8695660390107599190L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block26: {
            block25: {
                block24: {
                    block23: {
                        block22: {
                            block21: {
                                a.init(_5j_0.class, 32);
                                _5j_0.b = dev.krypton.l.a(7471364038107504941L, 4759545859368747479L, MethodHandles.lookup().lookupClass()).a(8080174962796L);
                                _5j_0.r = new Object[145];
                                _5j_0.s = new String[145];
                                _5j_0.b();
                                _5j_0.f = new HashMap<K, V>(13);
                                var22 = _5j_0.b ^ 96733307056268L;
                                var24_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                                v0 = SecretKeyFactory.getInstance("DES");
                                v1 = new byte[8];
                                v2 = v1;
                                v1[0] = (byte)(var22 >>> 56);
                                for (var25_2 = 1; var25_2 < 8; ++var25_2) {
                                    v2 = v2;
                                    v2[var25_2] = (byte)(var22 << var25_2 * 8 >>> 56);
                                }
                                var24_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                                var31_3 = new String[12];
                                var29_4 = 0;
                                var28_5 = "#\u008fk_\u00efM\u00a3({}\u00d5\u00caS\u00a0cJ \u00df\u00bdw\u00c4\u00c9+\u00c1\u00c6Hf\u00e2fh\u0088)\u00b0\u00b5\u00ec\u00e7S\u00d7\u00c3~l\u008a?_8\u00fd\u00cb\u00d40\u0010\u00cf2\u001c\u00be/\u00a6\u00a7\u00fa\u0017\u00c1\u00f3\u0018y\u0080\u00d7\u00ad\u0010\u008d\u00fcJ\u001a\u00ebH\u00ef\u00cc\u00cdTZ\u00bcq\u009f\u0000k\u0010p\u00ef3-u7O?\r\u00b46\u00e3\u00ed\u00d6\u00dc\u00fb\u0010\u00a9\\\u00b4{\u009b\u00dd\u00b2Z\u0007\u00d3ncyA\u001a\u009d\u0018\u000f\u0006\u00e2\u00d96z}\u00e6\u0002\u0013\u00eb\u00eb0k\u0085\u0004\u0094>\u00da\\\u0096\u00d3/X\u0010\u00dctz$\u00f3;\u008b>\tj\u00d2\u001b \u00ad\u00e0\u0084\u0010YAA\u00db\u00fdd\u00b9\u001a=/\u000e\b\u0087]\u00a2=\u0010\u00f2\u00b3\u00f5\u000bBP\u00cc\u0017\u00d6\u001dJP\u00ca\u0004\u001b\u00c3";
                                var30_6 = "#\u008fk_\u00efM\u00a3({}\u00d5\u00caS\u00a0cJ \u00df\u00bdw\u00c4\u00c9+\u00c1\u00c6Hf\u00e2fh\u0088)\u00b0\u00b5\u00ec\u00e7S\u00d7\u00c3~l\u008a?_8\u00fd\u00cb\u00d40\u0010\u00cf2\u001c\u00be/\u00a6\u00a7\u00fa\u0017\u00c1\u00f3\u0018y\u0080\u00d7\u00ad\u0010\u008d\u00fcJ\u001a\u00ebH\u00ef\u00cc\u00cdTZ\u00bcq\u009f\u0000k\u0010p\u00ef3-u7O?\r\u00b46\u00e3\u00ed\u00d6\u00dc\u00fb\u0010\u00a9\\\u00b4{\u009b\u00dd\u00b2Z\u0007\u00d3ncyA\u001a\u009d\u0018\u000f\u0006\u00e2\u00d96z}\u00e6\u0002\u0013\u00eb\u00eb0k\u0085\u0004\u0094>\u00da\\\u0096\u00d3/X\u0010\u00dctz$\u00f3;\u008b>\tj\u00d2\u001b \u00ad\u00e0\u0084\u0010YAA\u00db\u00fdd\u00b9\u001a=/\u000e\b\u0087]\u00a2=\u0010\u00f2\u00b3\u00f5\u000bBP\u00cc\u0017\u00d6\u001dJP\u00ca\u0004\u001b\u00c3".length();
                                var27_7 = 16;
                                var26_8 = -1;
lbl24:
                                // 2 sources

                                while (true) {
                                    v3 = ++var26_8;
                                    v4 = var28_5.substring(v3, v3 + var27_7);
                                    v5 = -1;
                                    break block21;
                                    break;
                                }
lbl29:
                                // 1 sources

                                while (true) {
                                    var31_3[var29_4++] = _5j_0.b(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    var28_5 = "]\u009a \u008c\u00bc\u00c0=\u00ed\\\u009d\u0012R\u00ee\u00e1\u00c3\u00c6 M\u009ev\u001e\n-9R{\u00c8\u00d5\u00c0\u00d33\u00d83\u00a5Q\u00fe\u00c03\u00e53\u0014\u00e7)\u008c\u00a6\u00ec\u00c7\u00c0\u0018";
                                    var30_6 = "]\u009a \u008c\u00bc\u00c0=\u00ed\\\u009d\u0012R\u00ee\u00e1\u00c3\u00c6 M\u009ev\u001e\n-9R{\u00c8\u00d5\u00c0\u00d33\u00d83\u00a5Q\u00fe\u00c03\u00e53\u0014\u00e7)\u008c\u00a6\u00ec\u00c7\u00c0\u0018".length();
                                    var27_7 = 16;
                                    var26_8 = -1;
lbl38:
                                    // 2 sources

                                    while (true) {
                                        v6 = ++var26_8;
                                        v4 = var28_5.substring(v6, v6 + var27_7);
                                        v5 = 0;
                                        break block21;
                                        break;
                                    }
                                    break;
                                }
lbl43:
                                // 1 sources

                                while (true) {
                                    var31_3[var29_4++] = _5j_0.b(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    break block22;
                                    break;
                                }
                            }
                            var32_9 = var24_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                        _5j_0.d = var31_3;
                        _5j_0.e = new String[12];
                        _5j_0.l = new HashMap<K, V>(13);
                        var11_10 = Cipher.getInstance("DES/CBC/NoPadding");
                        v7 = SecretKeyFactory.getInstance("DES");
                        v8 = new byte[8];
                        v9 = v8;
                        v8[0] = (byte)(var22 >>> 56);
                        for (var12_11 = 1; var12_11 < 8; ++var12_11) {
                            v9 = v9;
                            v9[var12_11] = (byte)(var22 << var12_11 * 8 >>> 56);
                        }
                        var11_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                        var17_12 = new long[53];
                        var14_13 = 0;
                        var15_14 = ".\u000b\u00cb\u008b4\u00d2\u001f\u00ea\u00b4\u0005\u0016\u001f\u00c4\u0014\u00b4\u00a2\u0015\u00eb\u0010\u00da\u001bq\u00c9cZ\u00f6q\u00e0h\u0092\u0087q\u00fc\u00aaQ\u0019\b\u0092\u008dG1\u00e4Y\u00c6ev\u008a\u00fc\u00c3X^t\u0093\u00e2\"\u009b\u00c8\u0012\u0083\"\u0005!O!\u00b2|\u00d6\u0019D\u00ca\u000b#/\u0088\u00f4^\u009b\u0091F\u009e\u00a6\u00c3$\u00de#\u000e'\u0007S)\u0096\u0010&j\u00c2\u00cci\u0018sMQ\t1\u00c3\u00dey\u008ez\u00d5\u008cU#\u0086p\u001c^\u00faf:wQ\u00f6\u00a1\u0093\u00b5\u00b4khQ\u001c\u009c\u0019\u00fcMUg\u00bdaO\u0013\u00982#\u0088\u00bd\u00bdd=\u00c3\u00fc\u00dd\u00d4\u00bcEtT/\u00b5\u00bc2BDk\f\u00d3\u00dd\u009bl\u00d0-3\u00da\u00fa\u00e2\u00d1!\u00ba\u00b9\u0003\u00c0\u00fe\u00048\u00e8>D\u0083-\u000e5\u00d6\u008f(\u00b3\u0083\u00fa\u00c2\u00aa\u0012c.\u00f0!q\u00ba\u00a9\u0087] ?\u00e7\u00c5\u0090\u00b9\u00dfEj=YV\u00f2D\u009b'\u00cf\u0089\u001aL\u00ca\u00a6\u00acl\u00ef\u00e6\u00fd{T\u00cfkE\u00bcj\u0001,\u0001\u00f5\u00cd\u0099Sscf\u00e8o\u00f2\u00c06\u00c5,\u0084G\u00c8]\u00d9\u00a0)\u00ca\u00f9\u00b1\u00fdZ\u00cc\u0017\u00a7\u00f8\u00c9\u00a1\u0014C\u00f8\u00ecc\u0096E\u008d\u008b\u008e\u00f0\u0099E\t\u00e2\u0017\u0083\u0085\u00d5!\u00f2\u00c3R\u0082@\u00f2vk2k\u00a1\u008d$0\u00bd\u00b6~\u00a6\u0081wM\u000b\u0087\u00b8\u00b3\u008ez\u00ef\u00f9\u0094\u00a6h\u00af\u00ec%DSX\u00d1!#\u00dcc\u000e\u0093=\u00f7P\u00a1\u00a6\u00ab\u0080q@y\u00dc\u00efE\u00ef\u00ebZs\u00daa\u00fb\u00fa~\u00cc\u00f6KFEY\u00fc\u00fb$Y\u00b3\u00ba\u00da\u00d4\u001d\u00f9\u00e6\u0001\u000bM3\u0082\u00c6\u00d0\u00ea\u00a9\u0019\u00b7t\u00ba\u00fe\u0087\u00fe\u00996\u00af\u00a1\u00da\u00bd\u00f0FT}H";
                        var16_15 = ".\u000b\u00cb\u008b4\u00d2\u001f\u00ea\u00b4\u0005\u0016\u001f\u00c4\u0014\u00b4\u00a2\u0015\u00eb\u0010\u00da\u001bq\u00c9cZ\u00f6q\u00e0h\u0092\u0087q\u00fc\u00aaQ\u0019\b\u0092\u008dG1\u00e4Y\u00c6ev\u008a\u00fc\u00c3X^t\u0093\u00e2\"\u009b\u00c8\u0012\u0083\"\u0005!O!\u00b2|\u00d6\u0019D\u00ca\u000b#/\u0088\u00f4^\u009b\u0091F\u009e\u00a6\u00c3$\u00de#\u000e'\u0007S)\u0096\u0010&j\u00c2\u00cci\u0018sMQ\t1\u00c3\u00dey\u008ez\u00d5\u008cU#\u0086p\u001c^\u00faf:wQ\u00f6\u00a1\u0093\u00b5\u00b4khQ\u001c\u009c\u0019\u00fcMUg\u00bdaO\u0013\u00982#\u0088\u00bd\u00bdd=\u00c3\u00fc\u00dd\u00d4\u00bcEtT/\u00b5\u00bc2BDk\f\u00d3\u00dd\u009bl\u00d0-3\u00da\u00fa\u00e2\u00d1!\u00ba\u00b9\u0003\u00c0\u00fe\u00048\u00e8>D\u0083-\u000e5\u00d6\u008f(\u00b3\u0083\u00fa\u00c2\u00aa\u0012c.\u00f0!q\u00ba\u00a9\u0087] ?\u00e7\u00c5\u0090\u00b9\u00dfEj=YV\u00f2D\u009b'\u00cf\u0089\u001aL\u00ca\u00a6\u00acl\u00ef\u00e6\u00fd{T\u00cfkE\u00bcj\u0001,\u0001\u00f5\u00cd\u0099Sscf\u00e8o\u00f2\u00c06\u00c5,\u0084G\u00c8]\u00d9\u00a0)\u00ca\u00f9\u00b1\u00fdZ\u00cc\u0017\u00a7\u00f8\u00c9\u00a1\u0014C\u00f8\u00ecc\u0096E\u008d\u008b\u008e\u00f0\u0099E\t\u00e2\u0017\u0083\u0085\u00d5!\u00f2\u00c3R\u0082@\u00f2vk2k\u00a1\u008d$0\u00bd\u00b6~\u00a6\u0081wM\u000b\u0087\u00b8\u00b3\u008ez\u00ef\u00f9\u0094\u00a6h\u00af\u00ec%DSX\u00d1!#\u00dcc\u000e\u0093=\u00f7P\u00a1\u00a6\u00ab\u0080q@y\u00dc\u00efE\u00ef\u00ebZs\u00daa\u00fb\u00fa~\u00cc\u00f6KFEY\u00fc\u00fb$Y\u00b3\u00ba\u00da\u00d4\u001d\u00f9\u00e6\u0001\u000bM3\u0082\u00c6\u00d0\u00ea\u00a9\u0019\u00b7t\u00ba\u00fe\u0087\u00fe\u00996\u00af\u00a1\u00da\u00bd\u00f0FT}H".length();
                        var13_16 = 0;
                        while (true) {
                            var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                            v10 = var17_12;
                            v11 = var14_13++;
                            v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                            v13 = -1;
                            break block23;
                            break;
                        }
lbl82:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            var15_14 = "2\u00a3\u00dc\u007f\r\u00dc\u0000K\b\u0014\u0090cA\u00f2\u00bc\u0090";
                            var16_15 = "2\u00a3\u00dc\u007f\r\u00dc\u0000K\b\u0014\u0090cA\u00f2\u00bc\u0090".length();
                            var13_16 = 0;
                            while (true) {
                                var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                                v10 = var17_12;
                                v11 = var14_13++;
                                v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                                v13 = 0;
                                break block23;
                                break;
                            }
                            break;
                        }
lbl95:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            break block24;
                            break;
                        }
                    }
                    var19_18 = v12;
                    var21_19 = var11_10.doFinal(new byte[]{(byte)(var19_18 >>> 56), (byte)(var19_18 >>> 48), (byte)(var19_18 >>> 40), (byte)(var19_18 >>> 32), (byte)(var19_18 >>> 24), (byte)(var19_18 >>> 16), (byte)(var19_18 >>> 8), (byte)var19_18});
                    v14 = ((long)var21_19[0] & 255L) << 56 | ((long)var21_19[1] & 255L) << 48 | ((long)var21_19[2] & 255L) << 40 | ((long)var21_19[3] & 255L) << 32 | ((long)var21_19[4] & 255L) << 24 | ((long)var21_19[5] & 255L) << 16 | ((long)var21_19[6] & 255L) << 8 | (long)var21_19[7] & 255L;
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
                _5j_0.j = var17_12;
                _5j_0.k = new Integer[53];
                _5j_0.o = new HashMap<K, V>(13);
                var0_20 = Cipher.getInstance("DES/CBC/NoPadding");
                v15 = SecretKeyFactory.getInstance("DES");
                v16 = new byte[8];
                v17 = v16;
                v16[0] = (byte)(var22 >>> 56);
                for (var1_21 = 1; var1_21 < 8; ++var1_21) {
                    v17 = v17;
                    v17[var1_21] = (byte)(var22 << var1_21 * 8 >>> 56);
                }
                var0_20.init(2, (Key)v15.generateSecret(new DESKeySpec(v17)), new IvParameterSpec(new byte[8]));
                var6_22 = new long[3];
                var3_23 = 0;
                var4_24 = "\u00e3\u00be?\u00b9\u0012\u0082\u00f1n\u00e3\u00f4\u00ca\u00cbTmV\u00a1\u00a0g\u00bf\u00e9\u001f\u000e\u00db\u00c3";
                var5_25 = "\u00e3\u00be?\u00b9\u0012\u0082\u00f1n\u00e3\u00f4\u00ca\u00cbTmV\u00a1\u00a0g\u00bf\u00e9\u001f\u000e\u00db\u00c3".length();
                var2_26 = 0;
                while (true) {
                    break block25;
                    break;
                }
lbl130:
                // 1 sources

                while (true) {
                    var6_22[v18] = ((long)var10_29[0] & 255L) << 56 | ((long)var10_29[1] & 255L) << 48 | ((long)var10_29[2] & 255L) << 40 | ((long)var10_29[3] & 255L) << 32 | ((long)var10_29[4] & 255L) << 24 | ((long)var10_29[5] & 255L) << 16 | ((long)var10_29[6] & 255L) << 8 | (long)var10_29[7] & 255L;
                    if (var2_26 < var5_25) ** continue;
                    break block26;
                    break;
                }
            }
            var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
            v18 = var3_23++;
            var8_28 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
            var10_29 = var0_20.doFinal(new byte[]{(byte)(var8_28 >>> 56), (byte)(var8_28 >>> 48), (byte)(var8_28 >>> 40), (byte)(var8_28 >>> 32), (byte)(var8_28 >>> 24), (byte)(var8_28 >>> 16), (byte)(var8_28 >>> 8), (byte)var8_28});
            ** while (true)
        }
        _5j_0.m = var6_22;
        _5j_0.n = new Long[3];
        _5j_0.cfr_renamed_0 = (long)_5j_0.d("d", (int)12991, (long)(var22 ^ 782762649643870778L));
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (s[n3] != null) {
            return n3;
        }
        Object object = r[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 63;
            case 1 -> 14;
            case 2 -> 13;
            case 3 -> 32;
            case 4 -> 16;
            case 5 -> 8;
            case 6 -> 47;
            case 7 -> 50;
            case 8 -> 41;
            case 9 -> 40;
            case 10 -> 59;
            case 11 -> 23;
            case 12 -> 2;
            case 13 -> 34;
            case 14 -> 18;
            case 15 -> 27;
            case 16 -> 38;
            case 17 -> 28;
            case 18 -> 11;
            case 19 -> 37;
            case 20 -> 44;
            case 21 -> 17;
            case 22 -> 57;
            case 23 -> 7;
            case 24 -> 35;
            case 25 -> 33;
            case 26 -> 42;
            case 27 -> 58;
            case 28 -> 54;
            case 29 -> 61;
            case 30 -> 56;
            case 31 -> 48;
            case 32 -> 22;
            case 33 -> 55;
            case 34 -> 20;
            case 35 -> 45;
            case 36 -> 21;
            case 37 -> 19;
            case 38 -> 24;
            case 39 -> 0;
            case 40 -> 53;
            case 41 -> 3;
            case 42 -> 29;
            case 43 -> 4;
            case 44 -> 25;
            case 45 -> 52;
            case 46 -> 1;
            case 47 -> 6;
            case 48 -> 31;
            case 49 -> 12;
            case 50 -> 39;
            case 51 -> 43;
            case 52 -> 10;
            case 53 -> 49;
            case 54 -> 26;
            case 55 -> 9;
            case 56 -> 46;
            case 57 -> 62;
            case 58 -> 15;
            case 59 -> 60;
            case 60 -> 51;
            case 61 -> 36;
            case 62 -> 30;
            default -> 5;
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
        _5j_0.s[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = r;
        r[0] = "r\u001fmC:Ar\u001fz\u001f6NhTz\u00016[o%+Ta\u0018";
        objectArray[1] = "ge\u0012$&Ilj\u0003k[Q\u007fm\n\"";
        objectArray[2] = "kH\u0017NO.u@\r\u0001.+u@\u000eA\u00007";
        objectArray[3] = "`j\u0011hb-ke\u0000'\u0003#`n\u0004}";
        objectArray[4] = "%-~\u0004\u000fN%-iX\u0003A?fiF\u0003T8\u00172\u001cZ\u0012";
        objectArray[5] = ")j(4r*)j?h~%3!?v~04Pm(/t~+?v~04Pm(/{v";
        objectArray[6] = "\u0004;\u001bXb\u001b\u0006%R;i\u0000\u0019 \u0004EpF\r\u001a\b\u0017k\u001f";
        objectArray[7] = Float.TYPE;
        _5j_0.s[7] = "java/lang/Float";
        objectArray[8] = "f\u001fv\u0018bdd\u0001?{i\u007f{\u0004i\u0005p9o";
        objectArray[9] = "\u0002V6\u0014fN\u001c^,[\u0001O\rE!\u0001'I";
        objectArray[10] = "\u00136\u0014\u0004C2\u00136\u0003XO=\t}\u0003FO(\u000e\fQ\u0019\u001eo";
        objectArray[11] = "&aA\u0017TD;tCVQ\u0018wn";
        objectArray[12] = "b^l2bn\u0017~g=s!vpl6w{\u0002";
        objectArray[13] = "qMvYw2qMa\u0005{=k\u0006a\u001b{(lw3A/l";
        objectArray[14] = "OEwf$3OE`:(<U\u000e`$()R\u007f2\u007fpc";
        objectArray[15] = "rS+/n\u0003l[1`\u0003\u0019t^8-4\u001fw\\";
        objectArray[16] = "\u001cq]o^\u000e\u001cqJ3R\u0001\u0006:J-R\u0014\u0001K\u001ar\u0001";
        objectArray[17] = "\u000f8\u00006C\u007f\u00066\u0003\u007f\u0000r\u00006\u0017}\u001dtB'\u0004hK|\u00059\b6|u\u00023\bj~y\u001c2\u0001q@u";
        objectArray[18] = Integer.TYPE;
        _5j_0.s[18] = "java/lang/Integer";
        objectArray[19] = Void.TYPE;
        _5j_0.s[19] = "java/lang/Void";
        objectArray[20] = Boolean.TYPE;
        _5j_0.s[20] = "java/lang/Boolean";
        objectArray[21] = "KzCv@4KzT*L;Q1T4L.V@\u0004j\u001a";
        objectArray[22] = "\r\u0000_-\u0006g\r\u0000Hq\nh\u0017KHo\n}\u0010:\u001a3\\7Z";
        objectArray[23] = "wZ{3c\u001fwZloo\u0010m\u0011lqo\u0005j`<,>";
        objectArray[24] = "$\u0014$lLa$\u001430@n>_3.@{9.gv\u0017";
        objectArray[25] = " \u0007UQ\u0018_+\bD\u001e{R>\u000e";
        objectArray[26] = "\u001an\u0004m%~\u001an\u00131)q\u0000%\u0013/)d\u0007TF{p'";
        objectArray[27] = "Wo^M)\u001aWoI\u0011%\u0015M$I\u000f%\u0000JU\u001cWt";
        objectArray[28] = "MH7lUFP]5-P\u001a\u001dF";
        objectArray[29] = "\f\u001aI\n\u001a4y:B\u0005\u000b{\u00184I\u000e\u000f!l";
        objectArray[30] = "E*]H5\u001cE*J\u00149\u0013_aJ\n9\u0006X\u0010\u0018TaF";
        objectArray[31] = "{7,94B{7;e8Ma|;{8Xf\ri%`\u001c";
        objectArray[32] = "xr6kWlxr!7[cb9!)[veHpp\f4";
        objectArray[33] = "Px\u0006\n+\nMm\u0004K.V\u0000L";
        objectArray[34] = "\"\u0007_H\u0014BW'TG\u0005\r6)_L\u0001WB";
        objectArray[35] = Double.TYPE;
        _5j_0.s[35] = "java/lang/Double";
        objectArray[36] = "E\\4HrOXI6\tw\u0013\u0019{";
        objectArray[37] = "-\f\u0010)/SX,\u001b&>\u001c9\"\u0010-:FM";
        objectArray[38] = "g$V`\u0005Sz1T!\u0000\u000f:y";
        objectArray[39] = "+\u000f~+\u001al^/u$\u000b#?!~/\u000fyK";
        objectArray[40] = "\u0006\u0016\u0013V/0\u0018\u001e\t\u0019g0\u0002\u0014\u0011^n+B1\u0010Yb1\u0005\u0018\u000b";
        objectArray[41] = "\t}\u001e,*p|]\u0015#;?\u001dS\u001e(?ei";
        objectArray[42] = "Px*a\"\\Mm( '\u0000\u0002e";
        objectArray[43] = "\u000f!xSf{\u000f!o\u000fjt\u0015jo\u0011ja\u0012\u001b=M?#";
        objectArray[44] = "9\u0019eG\u001f\r2\u0016t\bb\u0018 \fvK";
        objectArray[45] = Long.TYPE;
        _5j_0.s[45] = "java/lang/Long";
        objectArray[46] = "a09~&rj?(1Ap\u007f4(zz";
        objectArray[47] = "&:S\u0013/:;/QR*f{\u0017";
        objectArray[48] = "82y3W-M\u0012r<Fb,\u001cy7B8X";
        objectArray[49] = "0t.\u0013-\"-a,R(~`k";
        objectArray[50] = "u2t +*\u0000\u0012\u007f/:ea\u001ct$>?\u0015";
        objectArray[51] = "\t\u0015A'r\r\u0014\u0000CfwQY\u0002";
        objectArray[52] = "gWg:v`zBe{s<:@";
        objectArray[53] = "DH<m?\u001d1h7b.RPf<i*\b$";
        objectArray[54] = "sk\r_#1sk\u001a\u0003/>i \u001a\u001d/+nQLB|i";
        objectArray[55] = "\u0006\b@]\u0014w\u0006\bW\u0001\u0018x\u001cCW\u001f\u0018m\u001b2\u0002@M";
        objectArray[56] = "\u001f\u0001J\u0005!\u0007\u0001\tPJZ'<$";
        objectArray[57] = "Q7{\\7\"$\u0017pS&mE\u0019{X\"71";
        objectArray[58] = "MlL\r5\u00058LG\u0002$JYBL\t \u0010-";
        objectArray[59] = "@2p\u001e<\u00175\u0012{\u0011-XT\u001cp\u001a)\u0002 ";
        objectArray[60] = "^$\u000f-/\u0004+\u0004\u0004\">KJ\n\u000f):\u0011>";
        objectArray[61] = "lJ:\u0006\u0010R\u0019j1\t\u0001\u001dxd:\u0002\u0005G\f";
        objectArray[62] = "K\u0007gY%]K\u0007p\u0005)RQLp\u001b)GV=!Oz\u0000";
        objectArray[63] = "@\u0015;}!\u0016@\u0015,!-\u0019Z^,?-\f]/}k~K\n\u0013#2?\fqEvct";
        objectArray[64] = "2*dld;ll%\rdnwv8aV:1&d3\u0001~;{<4m;t\u007f_";
        objectArray[65] = "P\u000f\u0004#`\u0013\u000e\u0017F0\f\u0018\u00138X(a\u007fSIZ)m\u0015SH[/\fEU\u0013F2fET\u0012@S";
        objectArray[66] = "'O8F,\u0013{\u0019,TIH{E-jp\u001d&\u001eU\u00062@n\\.Ev[y ";
        objectArray[67] = "-\u000e\u001ay\u00107o\u001f\u0003gz34\u0018$l\u001e/?d\u0011u\u001f*jX\u0010k\u00071R";
        objectArray[68] = "r.\u0017\u0012eQ>0SXYI%)KGY\u000ft:DJeK~.U*d\b4+O\u0016 \u0002 :/\u0017&W4|\u001fE(\u000er@";
        objectArray[69] = "C\"JY+\u001c\u00169^ZJ\u0015\u00107PbpO\u001b=M\bpN\u001a;,";
        objectArray[70] = "qZ/li\u00176]:\"\t\u0004/T5>^Tw\u0007oR6\t0\u00071/q\u000e%I";
        objectArray[71] = "\u0010\u0012w\u001aPIJ\u0012xWl\u0010 \u0013v\u001aSG\u0010L2\u0006\u001cW Wx\u0006\u000f\u0010L\u00127\u0002l";
        objectArray[72] = "(cu_&vbf5\u0006Bht\"n\u0002.Z$n6XB`tbb\u0017\u007f6!;0e";
        objectArray[73] = "y@<\u001fY}3E|F=c%\u0001'BQQvD~\u0015=9+\u0003yE@~,\u00167%\fv.C!D_l%@G";
        objectArray[74] = "yp^b\ny#pQ/6(I6\u001b/U'r#\u0006-M";
        objectArray[75] = "\u0007\u00152AG\u0005M\u0010r\u0018#\u001b[T)\u001cO)\u000b\u0016wD#G\fV;\u0005MBZCr\u0019#";
        objectArray[76] = "(]D\u000b9WbX\u0004R]It\u001c_V1{'X\u0005\u000f]E|\u001d^C\"Ob\f]1";
        objectArray[77] = "YB\u0017L\u00136\u0015\\S\u0006/-\u0002Tj\u001dS/\u0004\\/HAm]\u0010L\u0004_)\u0017,";
        objectArray[78] = "\u001ayB'\u0000j]~Wi`yDwXu7)\u001c%\u0006\u0019_t[$\\d\u0018sNj";
        objectArray[79] = "dw&z2Ow~\"uQG\u00187#vn\u0010(hgj!\u0000\u0018b{84\u0013q>du4~";
        objectArray[80] = "\u000bAq\u0005\u0002\u0004]\u001d}\u0000\u0003t\bybD\u0004\u0017\fBwY\u0006\u000f2\u0014q\u0002T\u0006\u000fB$[\u0006t";
        objectArray[81] = " x?1/j2xza\u00152'?'<y\u0000p~|c/W!|87g6*{<2\u0015nvx&>-009G0e22{{1{*)C,+p/r\u007f-5h4J~}!~7v:w5oWwy=0uk3s)!\u0015<:&?c)=$>$[~'/;\u007fg\u007f97 G0e22{{1{*)C,+p/r\u007f-5h4J(7>mov))&vW!3\"#-k -:8\u0015;,|\"6|g31\"[";
        objectArray[82] = "k\u0014\\/e\u00068\u000eW,\u0003\u00027\u0018Zvo0eU\u0004)\u0003\n7XVc>\\b\u0001\u0004\u0011";
        objectArray[83] = "fo{gS\u001d%+`p/\r:q`B\u0014Xg+\u0018,\u0013]<q rU\u001c]";
        objectArray[84] = "p\u000e\u001c0]\u0018.H]Q]M5R@=o\u001eq\f\u001al8]y_DhT\u00186[',\bM*\u000bKiGII\u000b\u001bjYEqU]+8";
        objectArray[85] = "|\u0001@lX\u00196\u0004\u00005<\u0007 @[1P5s\u0004\u0004g<S=Z\u00050]\u0000'Q\u0006V";
        objectArray[86] = "tK\u0007 d\u0000sJJ&\u000b\u0005w\r[?g7#N\u0001g\u000b\u001d*\u001cXagXe\u0018;3{\u0005bI\u00072e\u001dyq";
        objectArray[87] = "U\u001aMND\u0001K\r^\u000b:\u000bZ\u000bC\u001emX\u0005V\u0017I:\u000e\u0004\u0019K\u0000[\u0005\u0003\u001dN";
        objectArray[88] = "/_2\"|CqWr3k8s\u000b2.~TA\\\u007fw&\u0007\u0016_rux].\u000144\u0019";
        objectArray[89] = "']*1G^!\u001bq:\u0007:{\n5 \u0010VI]y\u007fN:']72\tT\"\u000b\"{\u0015:\u007f\u0018+}\u0013Gu\u0000vyw";
        objectArray[90] = "Su|#;\u0007\u0013r$%`:\u000f'=,>V=q}va\u000bjs~>`Y\u00014z,;Qj&'s<W\u0003z8><:";
        objectArray[91] = "BN,qQj\u0017R3\u007f3oMR%\"d8\u0013\u0005}NS0HS'/\u0002}\u0017B";
        objectArray[92] = "\u0006\u0013:Z^|S\u000f%T<y\t\u000f3\tk.W]meR-T\u001a8\u0005U,\u0019\u001c";
        objectArray[93] = "M&(;X?Pi,,(92n(0\u0017i\u00021l,Xy2;p~Mj[go3M\u0007";
        objectArray[94] = "\r,S(a\u0018\u0006h\u0003*XY|)\r0g\nLvI,(\u001a||U~=\t\u0015 J3=d";
        objectArray[95] = "\\\u0012\u0005G<v\u0002TD&<#\u0019NYJ\u000ew_\u001e\u0005\u001cY3UC]\u001f5v\u001aG>";
        objectArray[96] = "$c]\u0001r\t(z\n\u0010\u0012\u0016%gl_(\t/aP\u001b\"\u001d>\u0001QXh\u0018$=\u0015R|\tD<V\u0018y\u0013xx\\\fhs";
        objectArray[97] = "Y]7\u0011\tw\u001eZ\"_id\u0007S-C>4_\u0000x/Vi\u0018\u0000)R\u0011n\rN";
        objectArray[98] = ">e^V2\u0002deQ\u001b\u000eZ\u000edYJ5X~2\u0005F0Y";
        objectArray[99] = "PLrHv8BL7\u0018L`W\u000bjE R\u0007N6\u0018s\u0005\u000b\u0007l\u001c*dX\u001dg\u001fLnJ\u0012r\u001apoT\ni\"'u_\u000f2\u001e&kG\u0014\nN*:_\u001ac\u00125w_w";
        objectArray[100] = "KwoA\nuYw*\u00110-L0wL\\\u001f\u001cu+\u0010\u000bHOv+S_(HwfU05\u0011!t\u0012\\p^%\u0017@@-Yt+A^5BL|[U0\u0019p}EM+!'gNHp\u001d&yVSHL!+GBu\u001atr\u00150$GsrFYxX>r+";
        objectArray[101] = "\r`4N*\u0005A~p\u0004\u0016\u001aKgj\rr\u000fMc\fK,\u001cZn0\u000f&\bK\u000e1Ll\rQ2uFx\u001c13s\u0013lZ\u0001a}J*f";
        objectArray[102] = "\u0014>U\u001aZSX \u0011PfHU+\rg\u000fLR1\u001d\"Z^\u0010hQA\u0016@T\"m";
        objectArray[103] = "Ir\u0005O\u0002E\u0018?Z^dAD?\u0001D\bs\u0014|Z\u0012d@V*\u0007F\u001d\u0019I<\u0019#Y\u001eS(\u0001\u001f\u001d\u0014G9a";
        objectArray[104] = ",Qx{7L1Eqe^\u0014 Uuz2&q\u0011/&fqtS-m2\u001d*Ko~^";
        objectArray[105] = "\u001d!\u001d3kR\u000f!XcQ\n\u001af\u0005>=8J Zaoo\u001c%\u001a5#\u000e\u0017\"\u001e0QVK!\u0004<i\b\r`e2!\n\u000f\"Y3?\u0012\u0014\u001a\u000e)4\u0017O&\u000f7,\fwq\u0015<)WKp\u000b$2o\u001cj\u0000!iS\u001dt\u0018:Q\u0003\u0011%\u000048_\u000eh\u0000Y";
        objectArray[106] = "\u001dhx`G)\u0017p%d#1\u0011kz:O\u0003A-*d\u001bTGxw&Fd\u001b.c4#";
        objectArray[107] = "r.\re_Cx0\u001cf-]g&\nmQ[aKNaK\u0007z$\u001bz_\u0004\u001b";
        objectArray[108] = "\u0019\u0019\u007fnJ\u001f\\V{\r\r\u001a\u0000T\u007fJ\u001ds\u000fYwuKO\u000eGons\u000eTDq4\u001fK\u001b@\u0012";
        objectArray[109] = "\u0011\u001a\u0006RgwV\u001d\u0013\u001c\u0007dO\u0014\u001c\u0000P4\u0017FDl8iPG\u0018\u0011\u007fnE\t";
        objectArray[110] = "f_j9^Sc\r&:/\tfg\"u^\u000bkW}1BD{gw-\u0010Qh\u000e+2]Q\u0005";
        objectArray[111] = "\u001eKmL9\u0002\fK(\u001c\u0003Z\u0019\fuAohII)\u001d:?\u001aJ)^l_\u001dKdX\u0003\u000e\u0004\u0016+@b]\u001e\u001d(&hO\u0011\b-\u001aiQ\t\u0013\u0015MsZ\fH)LmB\u0017py@<Z\u0019\u0019%_qZt";
        objectArray[112] = "Ho8\u00029\u001b\u0012o7O\u0005Gxj=\tn\u001bD.7\u001d\u007f";
        objectArray[113] = "e`\u001f\tY\u0002iyH\u00189\u0002b\u007fH\u00069E?xE\n\u0005\u00015lTjR\b`z\u0016VS\u0016xa.";
        objectArray[114] = "\baf6H/\u0003%64qjyd8.N=I;|2\u0001-y1``\u0014>\u0010m\u007f-\u0014S";
        objectArray[115] = "i\t\u007f6>g5K'>B;g\u000b%a.\t7Jz7B?r\u001a#o\u007f\"f\u0013=\u0006";
        objectArray[116] = "O\u0000S\rb\u0016\rF\u0014_\\)p:dx\u0006sO\u0000S\rb\u0016\rF\u0014_";
        objectArray[117] = "?\u0015\\\u000f\u000e\u001de\u0015SB2C\u000f\u001c^\u0005\b\u0019tV[EQ";
        objectArray[118] = "^M\u001b\u0011f~\u000bQ\u0004\u001f\u0004p]@\u0016IhB\t\u0001H\u0014\u0004,\n_\u0007\u001e`*L\u0004\f^\u0004";
        objectArray[119] = "z\rrT'v \r}\u0019\u001b)JJ<\u001bafrWs\u001fv";
        objectArray[120] = "A\u001aK!EP\\UO65U>RK*\n\u0006\u000e\r\u000f6E\u0016>\u0000\u0005>MP\u0002\u0001\u001b&Vh";
        objectArray[121] = "]V\\\u001ab2\u0017S\u001cC\u0006,\u0001\u0017GGj\u001eQT\u001c\u0011\u0006-\u0013\u0002AE\u007ft\f\u0014_ ;s\u0016\u0000G\u001c\u007fy\u0002\u0011'";
        objectArray[122] = " \rA{\u007ffj\b\u0001\"\u001bx|LZ&wJ,\f\u0005~\u001bxjQZ|fsmH\u0001A";
        objectArray[123] = "\nPi\u0002\u0012L\u001eW\u007fYi\u0006lQ(\u0015VP\\\u000el\t\u0019@l\u000fy\u001c\u0006N\u0010\u0015g\u000fW>";
        objectArray[124] = "\u0002f\rN^t\ta\u0014\u0015cf\na7R\u0019h\u0001rlSSd\u0004$\u0000\u0016\u001c`g";
        objectArray[125] = "}J\\P\u001a(wR\u0001T~0qI^\n\u0012\u0002&\u0004\u0003\\~>lPFUB?rH]m";
        objectArray[126] = "^\u001b|.kPQ\u0019k6\u0019E^\u0001\u007f8\u007fR\u007f\u001a`8\\OG\u001fd.\u0019PYGfk\"EDE~U";
        objectArray[127] = "*`\u001f\u007faB;:\u001f)\u001e\u0007R;\u001b>!Rbd_\"nBRiU*f\u0004nhK2}<";
        objectArray[128] = "#iWA*Lil\u0017\u0018NR\u007f(L\u001c\"`,l\u0017AN\n(.G\u001brN\":V{";
        objectArray[129] = "<n\u0017L!/|pXDD~E*VL{/uu\u0012P4?E\u007f\u000e\u0002!,,#\u0011O!A";
        objectArray[130] = "1e\u001f\u000f8k,*\u001b\u0018HlN-\u001f\u0004w=~r[\u00188-N\u007fQ\u00100kr~O\b+S";
        objectArray[131] = ")tD@\u001aScq\u0004\u0019~Mu5_\u001d\u0012\u007f&q\u0003E~\u0019h/\u0001\u001c\u001fJr$\u0002z";
        objectArray[132] = "\u000fg\u001bk\u0003)Z|\u000fhb&Xy;=\u0012:1o\u0010l\u000e4\f9E5\\F";
        objectArray[133] = "m,\u001aFd\u00147,\u0015\u000bXH8\u0014\u001c\t)K3$CM5\u0004#\u0014IQg\u00110}\u0015N*\u0011]";
        objectArray[134] = "IO1con\u0017Wsp\u0003g\u0019M\tisb\t\nc\">;\u000050i;r\u001cYnqyap";
        objectArray[135] = "Hm9W\u0004iM?uTu3zUq\u001b\u00041Ee._\u0018~UU$CJkF<x\\\u0007k+";
        objectArray[136] = "%=>\u000f9=64:\u0000Z5Y*t\u001fen2\u007fh\u0000k";
        objectArray[137] = "x&aq\u0001\u0001-:~\u007fc\u000f{+l)\u000f=,m2~Xjj)w0\fQw>iwc";
        objectArray[138] = "\u007f\u0017,\u0017'\u00055\u0012lNC\u001b#V7J/)p\u0012i\u0012CCtP<M\u007f\u0007~D--";
        objectArray[139] = "s`-\u0013u!9emJ\u0011?/!6N}\r|eh\u0012\u0011gx'=I-#r3,)";
        objectArray[140] = "o\u0010\\\u0012ax}\u0010\u0019B[ hWD\u001f7\u00128\u0012\u0018DkE9E\u001c@g&u[X\n[";
        objectArray[141] = "\u0012#9\u0019\u00120\u000f4'^}n\u0003!\"\u0000\u0011\\RasZ}`\u001e8:_Aa\u0000 !g";
        objectArray[142] = "\u001b=Wq\u0000\u0000\u0006rSfp\bduWzOVT*\u0013f\u0000Fd!\u00047\u001cJYwQnN8";
        objectArray[143] = "\u00174\u00159\u0013M\u0006n\u0015ol\u000f&VWkV\u0003\u0010(F1VU";
        Object[] objectArray2 = objectArray;
        objectArray[144] = "]4\u001a\to6\u0001vB\u0001\u0013jS6@^\u007fX\u0003w\u001f\t\u0013dN/X\u0001/eP7C9";
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _5j_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
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

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c9' || c == '\u00e1' || c == 'P' || c == '\u00f0') {
                field = _5j_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c9' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e1' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'P' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5j_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'b' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '$' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int c(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x7EDE;
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
                throw new RuntimeException("dev/krypton/5j", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5j_0.k[n2] = n3;
        }
        return k[n2];
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5j" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5j_0.c(n, l2);
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
        int n = _5j_0.e(l2, l3);
        Object object = r[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = s[n];
                int n3 = string2.indexOf(8);
                clazz3 = _5j_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5j_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5j_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5j_0.r[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5j_0.f(216266608831565L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5j_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5j_0.r[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5j_0.f(216266608831565L, 0L);
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
            int n = _5j_0.e(l2, l3);
            object = r[n];
            try {
                if (!(object instanceof String)) break block2;
                _5j_0.r[n] = clazz = Class.forName(s[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5j" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = _5j_0.d(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return l3;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5j" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5j_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5j_0.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static long d(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x5A28;
        if (_5j_0.n[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = m[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])o.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    o.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/5j", exception);
            }
            long l5 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            _5j_0.n[n2] = l5;
        }
        return _5j_0.n[n2];
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5j_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5j_0.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_3().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5j" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x7CA1;
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
                throw new RuntimeException("dev/krypton/5j", exception);
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
            _5j_0.e[n2] = _5j_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _5j_0.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static Field g(long l2, long l3) {
        int n = _5j_0.e(l2, l3);
        Object object = r[n];
        if (object instanceof String) {
            String string = s[n];
            int n2 = string.indexOf(8);
            Class clazz = _5j_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5j_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5j_0.c(clazz3, string2, clazz2)) != null) {
                    _5j_0.r[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5j_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5j_0.r[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5j_0.f(216266608831565L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    static class_310 net_minecraft_class_310_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        _5j_0 j_0 = (_5j_0)objectArray[1];
        l2 = b ^ l2;
        return _5j_0.f("\u00c9", (Object)j_0, 9183528586976575459L, (long)l2);
    }

    @_3i_0
    public void cfr_renamed_6(_6f_0 f_0) {
        block5: {
            class_2596 class_25962;
            long l2;
            block4: {
                l2 = b ^ 0x4B4C5349AFBCL;
                int n = _3C.cfr_renamed_4();
                class_2596 class_25963 = f_0.cfr_renamed_8;
                try {
                    try {
                        class_25962 = class_25963;
                        if (n != 0) break block4;
                        if (!(class_25962 instanceof class_2824)) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _5j_0.a(matchException);
                    }
                    class_25962 = class_25963;
                }
                catch (MatchException matchException) {
                    throw _5j_0.a(matchException);
                }
            }
            class_2824 class_28242 = (class_2824)class_25962;
            _5j_0.f("b", (Object)class_28242, (Object)new _8Y(this), 2128672434179536809L, (long)l2);
        }
    }

    static class_310 net_minecraft_class_310_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        _5j_0 j_0 = (_5j_0)objectArray[1];
        l2 = b ^ l2;
        return _5j_0.f("\u00c9", (Object)j_0, -5739189599930683189L, (long)l2);
    }

    static class_310 net_minecraft_class_310_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        _5j_0 j_0 = (_5j_0)objectArray[1];
        l2 = b ^ l2;
        return _5j_0.f("\u00c9", (Object)j_0, 2108104560257228240L, (long)l2);
    }

    @_3i_0
    public void cfr_renamed_0(_40 var1_1) {
        CallSite callSite;
        CallSite callSite2;
        CallSite callSite3;
        int n;
        class_332 class_3322;
        long l2;
        long l3;
        long l4;
        block51: {
            CallSite callSite4;
            block52: {
                CallSite callSite5;
                int n2;
                long l5;
                long l6;
                block49: {
                    CallSite callSite6;
                    block50: {
                        Object object;
                        long l7;
                        block47: {
                            block48: {
                                int n3;
                                block46: {
                                    block45: {
                                        block44: {
                                            Object object2;
                                            boolean bl;
                                            block41: {
                                                block43: {
                                                    block42: {
                                                        int n4;
                                                        long l8;
                                                        block40: {
                                                            block37: {
                                                                CallSite callSite7;
                                                                block39: {
                                                                    _5j_0 j_0;
                                                                    block38: {
                                                                        CallSite callSite8;
                                                                        block36: {
                                                                            long l9 = l4 = b ^ 0x22D1A5334484L;
                                                                            l6 = l9 ^ 0x726D7C81BF26L;
                                                                            l5 = l9 ^ 0x5AAECC6E6914L;
                                                                            l7 = l9 ^ 0x2D6ED928470BL;
                                                                            l3 = l9 ^ 0x7BF8FACEB89L;
                                                                            l2 = l9 ^ 0x22F989DD542BL;
                                                                            l8 = l9 ^ 0x5212CC13B2BL;
                                                                            n2 = _3C.cfr_renamed_4();
                                                                            class_3322 = var1_1.cfr_renamed_0;
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        callSite8 = _5j_0.f("\u00c9", (Object)this, -668449259633718133L, (long)l4);
                                                                                        if (n2 != 0) break block36;
                                                                                        if (callSite8 == null) break block37;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw _5j_0.a(matchException);
                                                                                    }
                                                                                    j_0 = this;
                                                                                    if (n2 != 0) break block38;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw _5j_0.a(matchException);
                                                                                }
                                                                                callSite8 = _5j_0.f("\u00c9", (Object)j_0, -668449259633718133L, (long)l4);
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw _5j_0.a(matchException);
                                                                            }
                                                                        }
                                                                        try {
                                                                            if (_5j_0.f("b", (Object)callSite8, -669237980440378364L, (long)l4) == false) break block37;
                                                                            j_0 = this;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw _5j_0.a(matchException);
                                                                        }
                                                                    }
                                                                    try {
                                                                        try {
                                                                            callSite7 = _5j_0.f("\u00c9", (Object)_5j_0.f("\u00c9", (Object)j_0, -682780250151668201L, (long)l4), -670268979760739741L, (long)l4);
                                                                            if (n2 != 0) break block39;
                                                                            if (callSite7 == null) break block37;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw _5j_0.a(matchException);
                                                                        }
                                                                        callSite7 = _5j_0.f("\u00c9", (Object)_5j_0.f("\u00c9", (Object)this, -682780250151668201L, (long)l4), -670268979760739741L, (long)l4);
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw _5j_0.a(matchException);
                                                                    }
                                                                }
                                                                try {
                                                                    reference cfr_temp_0 = _5j_0.f("b", (Object)callSite7, (Object)_5j_0.f("\u00c9", (Object)this, -668449259633718133L, (long)l4), -667187664179201669L, (long)l4) - 50.0f;
                                                                    n4 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                                                    if (n2 != 0) break block40;
                                                                    if (n4 >= 0) break block37;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw _5j_0.a(matchException);
                                                                }
                                                                n4 = 1;
                                                                break block40;
                                                            }
                                                            n4 = false;
                                                        }
                                                        bl = n4;
                                                        try {
                                                            try {
                                                                try {
                                                                    object2 = _5j_0.f("b", (Object)_5j_0.f("\u00c9", (Object)this, -667391838031170614L, (long)l4), (long)l8, -670956171296019808L, (long)l4);
                                                                    if (n2 != 0) break block41;
                                                                    if (object2 == false) break block42;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw _5j_0.a(matchException);
                                                                }
                                                                reference cfr_temp_1 = _5j_0.f("$", -667716862207269731L, (long)l4) - _5j_0.f("\u00c9", (Object)this, -669105326201987965L, (long)l4) - _5j_0.d("d", 30389, (long)(0x7EF73491F2EA5A39L ^ l4));
                                                                object2 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                                                                if (n2 != 0) break block41;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _5j_0.a(matchException);
                                                            }
                                                            if (object2 > 0) break block43;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _5j_0.a(matchException);
                                                        }
                                                    }
                                                    object2 = true;
                                                    break block41;
                                                }
                                                object2 = false;
                                            }
                                            Object object3 = object2;
                                            try {
                                                n3 = bl;
                                                if (n2 != 0) break block44;
                                                if (n3 == false) break block45;
                                            }
                                            catch (MatchException matchException) {
                                                throw _5j_0.a(matchException);
                                            }
                                            n3 = object3;
                                        }
                                        try {
                                            if (n2 != 0) break block46;
                                            if (n3 == 0) break block45;
                                        }
                                        catch (MatchException matchException) {
                                            throw _5j_0.a(matchException);
                                        }
                                        n3 = 1;
                                        break block46;
                                    }
                                    n3 = false;
                                }
                                int n5 = n3;
                                try {
                                    try {
                                        object = n5;
                                        if (n2 != 0) break block47;
                                        if (object) break block48;
                                    }
                                    catch (MatchException matchException) {
                                        throw _5j_0.a(matchException);
                                    }
                                    _5j_0.f("\u00e1", (Object)this, null, -668449259633718133L, (long)l4);
                                    return;
                                }
                                catch (MatchException matchException) {
                                    throw _5j_0.a(matchException);
                                }
                            }
                            object = _5j_0.c("l", 14242, (long)(0x436F9E39BA4A3FCDL ^ l4));
                        }
                        n = object;
                        callSite3 = _5j_0.c("l", 27333, (long)(0x6527014D99416293L ^ l4));
                        callSite6 = _5j_0.c("l", 30908, (long)(0x58228B282A0AF0C4L ^ l4));
                        callSite4 = _5j_0.c("l", 30908, (long)(0x58228B282A0AF0C4L ^ l4));
                        try {
                            try {
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l6;
                                callSite5 = _5j_0.f("b", (Object)_5j_0.f("\u00c9", (Object)this, -668357830294298596L, (long)l4), (Object)objectArray, -682358184913781012L, (long)l4);
                                if (n2 != 0) break block49;
                                if (callSite5 == false) break block50;
                            }
                            catch (MatchException matchException) {
                                throw _5j_0.a(matchException);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l7;
                            callSite5 = _5j_0.f("b", (Object)_5j_0.f("\u00c9", (Object)this, -668357830294298596L, (long)l4), (Object)objectArray, -683169710826891656L, (long)l4);
                            break block49;
                        }
                        catch (MatchException matchException) {
                            throw _5j_0.a(matchException);
                        }
                    }
                    callSite5 = callSite6;
                }
                callSite2 = callSite5;
                try {
                    try {
                        Object[] objectArray = new Object[1];
                        objectArray[0] = l6;
                        callSite = _5j_0.f("b", (Object)_5j_0.f("\u00c9", (Object)this, -668357830294298596L, (long)l4), (Object)objectArray, -682358184913781012L, (long)l4);
                        if (n2 != 0) break block51;
                        if (callSite == false) break block52;
                    }
                    catch (MatchException matchException) {
                        throw _5j_0.a(matchException);
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l5;
                    callSite = _5j_0.f("b", (Object)_5j_0.f("\u00c9", (Object)this, -668357830294298596L, (long)l4), (Object)objectArray, -668118964554938181L, (long)l4);
                    break block51;
                }
                catch (MatchException matchException) {
                    throw _5j_0.a(matchException);
                }
            }
            callSite = callSite4;
        }
        CallSite callSite9 = callSite;
        Object[] objectArray = new Object[6];
        objectArray[5] = l2;
        objectArray[4] = (int)callSite3;
        objectArray[3] = n;
        objectArray[2] = (int)callSite9;
        objectArray[1] = (int)callSite2;
        objectArray[0] = _5j_0.a("e", 18295, (long)(0x6A369112249A4D74L ^ l4));
        _5j_0.f("$", (Object)objectArray, -668522123480203312L, (long)l4);
        CallSite callSite10 = _5j_0.f("b", (Object)_5j_0.f("b", (Object)_5j_0.f("\u00c9", (Object)this, -682780250151668201L, (long)l4), -668234444062842338L, (long)l4), (Object)_5j_0.f("b", (Object)_5j_0.f("\u00c9", (Object)this, -668449259633718133L, (long)l4), -669152706674359018L, (long)l4), -670408229773203721L, (long)l4);
        _5j_0.f("\u00e1", (Object)this, (float)(_5j_0.f("b", (Object)_5j_0.f("\u00c9", (Object)this, -668449259633718133L, (long)l4), -683300191119764763L, (long)l4) + _5j_0.f("b", (Object)_5j_0.f("\u00c9", (Object)this, -668449259633718133L, (long)l4), -682628076205487481L, (long)l4)), -668671388354627295L, (long)l4);
        Object[] objectArray2 = new Object[7];
        objectArray2[6] = Float.valueOf(1.0f);
        objectArray2[5] = callSite10;
        objectArray2[4] = _5j_0.f("\u00c9", (Object)this, -668449259633718133L, (long)l4);
        objectArray2[3] = (int)callSite9;
        objectArray2[2] = l3;
        objectArray2[1] = (int)callSite2;
        objectArray2[0] = class_3322;
        _5j_0.f("b", (Object)this, (Object)objectArray2, -683120899345495035L, (long)l4);
    }

    private void cfr_renamed_0(short s, short s2, int n, Integer n2, Integer n3) {
        long l2 = ((long)s << 48 | (long)s2 << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        long l3 = l2 ^ 0x2E606227BCF8L;
        Object[] objectArray = new Object[3];
        objectArray[2] = (int)_5j_0.f("b", (Object)n3, 4007013621360666112L, (long)l2);
        objectArray[1] = (int)_5j_0.f("b", (Object)n2, 4007013621360666112L, (long)l2);
        objectArray[0] = l3;
        _5j_0.f("b", (Object)_5j_0.f("\u00c9", (Object)this, 4005612206304846131L, (long)l2), (Object)objectArray, 4007216654142790338L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5j_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_5j_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5j_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_3() {
        try {
            return MethodHandles.lookup().findStatic(_5j_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

