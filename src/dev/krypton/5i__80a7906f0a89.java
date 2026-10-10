/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_243
 */
package dev.krypton;

import dev.krypton._3C;
import dev.krypton._3i_0;
import dev.krypton._4r;
import dev.krypton._6c_0;
import dev.krypton._6x_0;
import dev.krypton._8B;
import dev.krypton._92;
import dev.krypton._94;
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
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_243;

/*
 * Renamed from dev.krypton.5i
 */
public class _5i_0
extends _6x_0 {
    private static final double cfr_renamed_2 = 0.03;
    private static final double cfr_renamed_7 = 0.99;
    private static final double cfr_renamed_1 = 1.5;
    private static final int cfr_renamed_241;
    private final _94 cfr_renamed_369;
    private final _94 cfr_renamed_412;
    private final _9r cfr_renamed_6;
    private final _9r cfr_renamed_9;
    private final _9r cfr_renamed_30;
    private final _9r cfr_renamed_270;
    private final _92 cfr_renamed_4;
    private final _9r cfr_renamed_8;
    private final _9r cfr_renamed_3;
    private final _9r cfr_renamed_0;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    private void cfr_renamed_413(Object[] objectArray) {
        class_243 class_2432 = (class_243)objectArray[0];
        _8B b = (_8B)objectArray[1];
        _6c_0 c_0 = (_6c_0)objectArray[2];
        long l2 = (Long)objectArray[3];
        long l3 = l2 = _5i_0.b ^ l2;
        long l4 = l3 ^ 0x7674F5AAA9AEL;
        long l5 = l3 ^ 0x497C509D664FL;
        long l6 = l3 ^ 0x5F8012703AE1L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        CallSite callSite = _5i_0.c("v", (Object)_5i_0.c("K", (Object)this, 2596764766011061926L, (long)l2), (Object)objectArray2, 2607863142343556681L, (long)l2);
        _8B b2 = new _8B((int)_5i_0.c("K", (Object)b, 2595094274424645366L, (long)l2), (int)_5i_0.c("K", (Object)b, 2602622615060356627L, (long)l2), l5, (int)_5i_0.c("K", (Object)b, 2607754348215195068L, (long)l2), 0);
        Object[] objectArray3 = new Object[9];
        objectArray3[8] = b2;
        objectArray3[7] = b;
        objectArray3[6] = (double)_5i_0.c("K", (Object)class_2432, 2597472731484015198L, (long)l2);
        objectArray3[5] = (double)(_5i_0.c("K", (Object)class_2432, 2598055912810703252L, (long)l2) + (double)callSite);
        objectArray3[4] = (double)_5i_0.c("K", (Object)class_2432, 2596935718441693795L, (long)l2);
        objectArray3[3] = l6;
        objectArray3[2] = (double)_5i_0.c("K", (Object)class_2432, 2597472731484015198L, (long)l2);
        objectArray3[1] = (double)_5i_0.c("K", (Object)class_2432, 2598055912810703252L, (long)l2);
        objectArray3[0] = (double)_5i_0.c("K", (Object)class_2432, 2596935718441693795L, (long)l2);
        _5i_0.c("v", (Object)c_0.cfr_renamed_7, (Object)objectArray3, 2595232199787613066L, (long)l2);
    }

    private void cfr_renamed_414(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        class_243 class_2432 = (class_243)objectArray[1];
        _8B b = (_8B)objectArray[2];
        _6c_0 c_0 = (_6c_0)objectArray[3];
        long l3 = (l2 = _5i_0.b ^ l2) ^ 0x1C098FD6E325L;
        double d = 0.25;
        Object[] objectArray2 = new Object[8];
        objectArray2[7] = b;
        objectArray2[6] = l3;
        objectArray2[5] = (double)_5i_0.c("K", (Object)class_2432, -4240060126002304134L, (long)l2);
        objectArray2[4] = (double)_5i_0.c("K", (Object)class_2432, -4239450213067749200L, (long)l2);
        objectArray2[3] = (double)(_5i_0.c("K", (Object)class_2432, -4238310361335966905L, (long)l2) + d);
        objectArray2[2] = (double)_5i_0.c("K", (Object)class_2432, -4240060126002304134L, (long)l2);
        objectArray2[1] = (double)_5i_0.c("K", (Object)class_2432, -4239450213067749200L, (long)l2);
        objectArray2[0] = (double)(_5i_0.c("K", (Object)class_2432, -4238310361335966905L, (long)l2) - d);
        _5i_0.c("v", (Object)c_0.cfr_renamed_7, (Object)objectArray2, -4239905855007552612L, (long)l2);
        Object[] objectArray3 = new Object[8];
        objectArray3[7] = b;
        objectArray3[6] = l3;
        objectArray3[5] = (double)_5i_0.c("K", (Object)class_2432, -4240060126002304134L, (long)l2);
        objectArray3[4] = (double)(_5i_0.c("K", (Object)class_2432, -4239450213067749200L, (long)l2) + d);
        objectArray3[3] = (double)_5i_0.c("K", (Object)class_2432, -4238310361335966905L, (long)l2);
        objectArray3[2] = (double)_5i_0.c("K", (Object)class_2432, -4240060126002304134L, (long)l2);
        objectArray3[1] = (double)(_5i_0.c("K", (Object)class_2432, -4239450213067749200L, (long)l2) - d);
        objectArray3[0] = (double)_5i_0.c("K", (Object)class_2432, -4238310361335966905L, (long)l2);
        _5i_0.c("v", (Object)c_0.cfr_renamed_7, (Object)objectArray3, -4239905855007552612L, (long)l2);
        Object[] objectArray4 = new Object[8];
        objectArray4[7] = b;
        objectArray4[6] = l3;
        objectArray4[5] = (double)(_5i_0.c("K", (Object)class_2432, -4240060126002304134L, (long)l2) + d);
        objectArray4[4] = (double)_5i_0.c("K", (Object)class_2432, -4239450213067749200L, (long)l2);
        objectArray4[3] = (double)_5i_0.c("K", (Object)class_2432, -4238310361335966905L, (long)l2);
        objectArray4[2] = (double)(_5i_0.c("K", (Object)class_2432, -4240060126002304134L, (long)l2) - d);
        objectArray4[1] = (double)_5i_0.c("K", (Object)class_2432, -4239450213067749200L, (long)l2);
        objectArray4[0] = (double)_5i_0.c("K", (Object)class_2432, -4238310361335966905L, (long)l2);
        _5i_0.c("v", (Object)c_0.cfr_renamed_7, (Object)objectArray4, -4239905855007552612L, (long)l2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void cfr_renamed_415(Object[] objectArray) {
        int n;
        int n2;
        CallSite callSite;
        int n3;
        long l2;
        long l3;
        long l4;
        long l5;
        _6c_0 c_0;
        long l6;
        boolean bl;
        _8B b;
        List list;
        block15: {
            list = (List)objectArray[0];
            b = (_8B)objectArray[1];
            bl = (Boolean)objectArray[2];
            l6 = (Long)objectArray[3];
            c_0 = (_6c_0)objectArray[4];
            long l7 = l6 = _5i_0.b ^ l6;
            l5 = l7 ^ 0xEB49D56852L;
            l4 = l7 ^ 0x411BABAA3224L;
            l3 = l7 ^ 0x219102DEBDF5L;
            l2 = l7 ^ 0x57E7E9476E8AL;
            n3 = _3C.cfr_renamed_4();
            try {
                callSite = _5i_0.c("v", (Object)list, 8098023633351316093L, (long)l6);
                n2 = 2;
                if (n3 != 0) break block15;
                if (callSite < n2) {
                    return;
                }
            }
            catch (MatchException matchException) {
                throw _5i_0.a(matchException);
            }
            callSite = _5i_0.c("v", (Object)list, 8098023633351316093L, (long)l6);
            n2 = 1;
        }
        reference var17_12 = callSite - n2;
        _8B b2 = new _8B((int)_5i_0.a("l", 11613, (long)(0x535182A13B4CB737L ^ l6)), (int)_5i_0.a("l", 28578, (long)(0x3562B6D742A9F5D2L ^ l6)), l4, (int)_5i_0.a("l", 28578, (long)(0x3562B6D742A9F5D2L ^ l6)), (int)_5i_0.c("K", (Object)b, 8095998080315436356L, (long)l6));
        int n4 = 0;
        do {
            Object object;
            Object object2;
            class_243 class_2432;
            class_243 class_2433;
            block21: {
                block22: {
                    Object object3;
                    float f;
                    float f2;
                    block16: {
                        block17: {
                            block19: {
                                block20: {
                                    float f3;
                                    float f4;
                                    block18: {
                                        if (n4 >= var17_12) return;
                                        class_2433 = (class_243)_5i_0.c("v", (Object)list, (int)n4, 8103656157902892381L, (long)l6);
                                        class_2432 = (class_243)_5i_0.c("v", (Object)list, (int)(n4 + 1), 8103656157902892381L, (long)l6);
                                        f2 = (float)n4 / (float)var17_12;
                                        f = (float)(n4 + 1) / (float)var17_12;
                                        try {
                                            object3 = _5i_0.c("v", (Object)_5i_0.c("K", (Object)this, 8098247302584553551L, (long)l6), (long)l3, 8100485697086916271L, (long)l6);
                                            if (n3 != 0) break block16;
                                            if (object3 == false) break block17;
                                        }
                                        catch (MatchException matchException) {
                                            throw _5i_0.a(matchException);
                                        }
                                        f4 = 1.0f - f2 * 0.75f;
                                        f3 = 1.0f - f * 0.75f;
                                        if (!bl) break block18;
                                        Object[] objectArray2 = new Object[5];
                                        objectArray2[4] = Float.valueOf(f4);
                                        objectArray2[3] = l5;
                                        objectArray2[2] = Float.valueOf(f2);
                                        objectArray2[1] = b2;
                                        objectArray2[0] = b;
                                        object2 = _5i_0.c("v", (Object)this, (Object)objectArray2, 8095314937222388326L, (long)l6);
                                        Object[] objectArray3 = new Object[5];
                                        objectArray3[4] = Float.valueOf(f3);
                                        objectArray3[3] = l5;
                                        objectArray3[2] = Float.valueOf(f);
                                        objectArray3[1] = b2;
                                        objectArray3[0] = b;
                                        object = _5i_0.c("v", (Object)this, (Object)objectArray3, 8095314937222388326L, (long)l6);
                                        n = n3;
                                        if (l6 < 0L) break block19;
                                        if (n == 0) break block20;
                                    }
                                    object2 = new _8B((int)_5i_0.c("K", (Object)b, 8099908758283252381L, (long)l6), (int)_5i_0.c("K", (Object)b, 8103478888134691448L, (long)l6), l4, (int)_5i_0.c("K", (Object)b, 8096225990783500759L, (long)l6), (int)((float)_5i_0.c("K", (Object)b, 8095998080315436356L, (long)l6) * f4));
                                    object = new _8B((int)_5i_0.c("K", (Object)b, 8099908758283252381L, (long)l6), (int)_5i_0.c("K", (Object)b, 8103478888134691448L, (long)l6), l4, (int)_5i_0.c("K", (Object)b, 8096225990783500759L, (long)l6), (int)((float)_5i_0.c("K", (Object)b, 8095998080315436356L, (long)l6) * f3));
                                }
                                n = n3;
                            }
                            if (l6 <= 0L) continue;
                            if (n == 0) break block21;
                        }
                        object3 = bl;
                    }
                    if (object3 == false) break block22;
                    Object[] objectArray4 = new Object[5];
                    objectArray4[4] = Float.valueOf(1.0f);
                    objectArray4[3] = l5;
                    objectArray4[2] = Float.valueOf(f2);
                    objectArray4[1] = b2;
                    objectArray4[0] = b;
                    object2 = _5i_0.c("v", (Object)this, (Object)objectArray4, 8095314937222388326L, (long)l6);
                    Object[] objectArray5 = new Object[5];
                    objectArray5[4] = Float.valueOf(1.0f);
                    objectArray5[3] = l5;
                    objectArray5[2] = Float.valueOf(f);
                    objectArray5[1] = b2;
                    objectArray5[0] = b;
                    object = _5i_0.c("v", (Object)this, (Object)objectArray5, 8095314937222388326L, (long)l6);
                    n = n3;
                    if (l6 < 0L) continue;
                    if (n == 0) break block21;
                }
                object2 = b;
                object = b;
            }
            Object[] objectArray6 = new Object[9];
            objectArray6[8] = object;
            objectArray6[7] = object2;
            objectArray6[6] = (double)_5i_0.c("K", (Object)class_2432, 8099473000839585333L, (long)l6);
            objectArray6[5] = (double)_5i_0.c("K", (Object)class_2432, 8098930570288446975L, (long)l6);
            objectArray6[4] = (double)_5i_0.c("K", (Object)class_2432, 8097792230184117768L, (long)l6);
            objectArray6[3] = l2;
            objectArray6[2] = (double)_5i_0.c("K", (Object)class_2433, 8099473000839585333L, (long)l6);
            objectArray6[1] = (double)_5i_0.c("K", (Object)class_2433, 8098930570288446975L, (long)l6);
            objectArray6[0] = (double)_5i_0.c("K", (Object)class_2433, 8097792230184117768L, (long)l6);
            _5i_0.c("v", (Object)c_0.cfr_renamed_7, (Object)objectArray6, 8101717930582499297L, (long)l6);
            ++n4;
            n = n3;
        } while (n == 0);
    }

    /*
     * Exception decompiling
     */
    private void cfr_renamed_171(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [50[DOLOOP]], but top level block is 60[SIMPLE_IF_TAKEN]
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

    private void cfr_renamed_183(Object[] objectArray) {
        block10: {
            _5i_0 i_0;
            long l2;
            long l3;
            _6c_0 c_0;
            class_1657 class_16572;
            block8: {
                block9: {
                    class_16572 = (class_1657)objectArray[0];
                    c_0 = (_6c_0)objectArray[1];
                    l3 = (Long)objectArray[2];
                    long l4 = l3 = b ^ l3;
                    l2 = l4 ^ 0x7BEA3155E3DDL;
                    long l5 = l4 ^ 0x3852A6BE4A5EL;
                    CallSite callSite = _5i_0.c("v", (Object)class_16572, (Object)_5i_0.c("j", -925598604087575449L, (long)l3), -924468936788589335L, (long)l3);
                    CallSite callSite2 = _5i_0.c("v", (Object)class_16572, (Object)_5i_0.c("j", -926364282516987638L, (long)l3), -924468936788589335L, (long)l3);
                    int n = _3C.cfr_renamed_7();
                    try {
                        try {
                            try {
                                try {
                                    i_0 = this;
                                    if (n == 0) break block8;
                                    Object[] objectArray2 = new Object[2];
                                    objectArray2[1] = l5;
                                    objectArray2[0] = callSite;
                                    if (_5i_0.c("v", (Object)i_0, (Object)objectArray2, -927089266591952621L, (long)l3) != false) break block9;
                                }
                                catch (MatchException matchException) {
                                    throw _5i_0.a(matchException);
                                }
                                if (l3 <= 0L) break block10;
                                i_0 = this;
                                if (n == 0) break block8;
                            }
                            catch (MatchException matchException) {
                                throw _5i_0.a(matchException);
                            }
                            Object[] objectArray3 = new Object[2];
                            objectArray3[1] = l5;
                            objectArray3[0] = callSite2;
                            if (_5i_0.c("v", (Object)i_0, (Object)objectArray3, -927089266591952621L, (long)l3) != false) break block9;
                        }
                        catch (MatchException matchException) {
                            throw _5i_0.a(matchException);
                        }
                        return;
                    }
                    catch (MatchException matchException) {
                        throw _5i_0.a(matchException);
                    }
                }
                i_0 = this;
            }
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = l2;
            objectArray4[1] = c_0;
            objectArray4[0] = class_16572;
            _5i_0.c("v", (Object)i_0, (Object)objectArray4, -929942734943264906L, (long)l3);
        }
    }

    public _5i_0(short s, char c, int n) {
        long l2;
        long l3 = l2 = ((long)s << 48 | (long)c << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        long l4 = l3 ^ 0x45B2CA1C0900L;
        long l5 = l3 ^ 0x3BB0CE1D8E72L;
        long l6 = l3 ^ 0x55D2F8D57093L;
        long l7 = l3 ^ 0x138A5D5F8169L;
        long l8 = l3 ^ 0xC4ACE7B6E1BL;
        super((int)_5i_0.a("l", 9357, (long)(0x1F87EEFFCE20E6D2L ^ l2)), -1, (_4r)((Object)_5i_0.c("j", 2907193095614655749L, (long)l2)), l7);
        this.cfr_renamed_369 = new _94(4, (int)_5i_0.a("l", 9750, (long)(0x88A037D630E645BL ^ l2)), (int)_5i_0.a("l", 27991, (long)(0x2ABADF032E742F13L ^ l2)), (int)_5i_0.a("l", 16351, (long)(0x1EF64C5756707D87L ^ l2)), (int)_5i_0.a("l", 31940, (long)(0x50DCF427A79E3E98L ^ l2)), l5);
        this.cfr_renamed_412 = new _94((int)_5i_0.a("l", 29135, (long)(0x4426BBBAFBDBB386L ^ l2)), (int)_5i_0.a("l", 13169, (long)(0x5B910961B8C77120L ^ l2)), (int)_5i_0.a("l", 14128, (long)(0x3A9E0FFA29267575L ^ l2)), (int)_5i_0.a("l", 11613, (long)(0x5351E5CE353BEF0FL ^ l2)), (int)_5i_0.a("l", 16578, (long)(0xF4A4CA592E8298L ^ l2)), l5);
        this.cfr_renamed_6 = new _9r((int)_5i_0.a("l", 713, (long)(0x3574B3F03A87C097L ^ l2)), false, l4);
        this.cfr_renamed_9 = new _9r((int)_5i_0.a("l", 13550, (long)(0x40464F3CA20276B5L ^ l2)), true, l4);
        this.cfr_renamed_30 = new _9r((int)_5i_0.a("l", 1192, (long)(0x709D41555E5746E2L ^ l2)), true, l4);
        this.cfr_renamed_270 = new _9r((int)_5i_0.a("l", 27277, (long)(0x2E8F7AB02E2C28D8L ^ l2)), true, l4);
        this.cfr_renamed_4 = new _92(1, 1.0, l6, 20.0, 6.0, 1.0);
        this.cfr_renamed_8 = new _9r((int)_5i_0.a("l", 25707, (long)(0x2063EB1AAAC6A638L ^ l2)), true, l4);
        this.cfr_renamed_3 = new _9r((int)_5i_0.a("l", 9501, (long)(0x5904E60E8400675BL ^ l2)), true, l4);
        this.cfr_renamed_0 = new _9r((int)_5i_0.a("l", 25180, (long)(0x5B13D1E2FA1C2010L ^ l2)), false, l4);
        _95[] nullArray = new _95[_5i_0.a("l", 12567, (long)(0x7CEEA993BCC7357L ^ l2))];
        nullArray[0] = _5i_0.c("K", (Object)this, 2906549883842924779L, (long)l2);
        nullArray[1] = _5i_0.c("K", (Object)this, 2904871682859226878L, (long)l2);
        nullArray[2] = _5i_0.c("K", (Object)this, 2909549241573931634L, (long)l2);
        nullArray[3] = _5i_0.c("K", (Object)this, 2905400493894696199L, (long)l2);
        nullArray[4] = _5i_0.c("K", (Object)this, 2906422869441662498L, (long)l2);
        nullArray[5] = _5i_0.c("K", (Object)this, 2906661416708798644L, (long)l2);
        nullArray[_5i_0.a("l", 13527, (long)(0x7E25319F0EA2F694L ^ l2))] = _5i_0.c("K", (Object)this, 2907883637914925813L, (long)l2);
        nullArray[_5i_0.a("l", 17088, (long)(0x33E023266BFB8094L ^ l2))] = _5i_0.c("K", (Object)this, 2907819496027064439L, (long)l2);
        nullArray[_5i_0.a("l", 31761, (long)(0x3F896DBA2064BE46L ^ l2))] = _5i_0.c("K", (Object)this, 2905109069787892973L, (long)l2);
        nullArray[_5i_0.a("l", 32656, (long)(0x40D5D5A121FD3DD2L ^ l2))] = _5i_0.c("K", (Object)this, 2909469057143074216L, (long)l2);
        Object[] objectArray = new Object[2];
        objectArray[1] = nullArray;
        objectArray[0] = l8;
        _5i_0.c("v", (Object)this, (Object)objectArray, 2905528097268567198L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                _5i_0.b = l.a(-4632671109066916982L, 8094392395812699310L, MethodHandles.lookup().lookupClass()).a(24924529985084L);
                _5i_0.j = new Object[141];
                _5i_0.k = new String[141];
                _5i_0.b();
                _5i_0.f = new HashMap<K, V>(13);
                var0 = _5i_0.b ^ 122444135064L;
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
                var8_3 = new long[32];
                var5_4 = 0;
                var6_5 = "\u00af\u00c0\u00cb\u00a5f\u00a8Q6\u00b9\u0013\u00ac*\u00ce\u00f7h\u00c6\u0081\u0087!\u0080\u00f3\u00f8\u00ee\u0082\u009a\u009dW\u00b8\u00cf\u00a8\u001b\u00f5\u0093\u0013#\u00e6\u00fc\u00f0\u009e\u00b2\u0007\u00f4H\u0016\u0084\u0019~\u00b4\u0005\u00e2\u00e2,z\u00e0\u00e61r9\u0003\u00f1\u0012\r\u00d0p\u00fa\u00a6\u001b\u00c3\u0096n\u00d16\u00a7h\u0014\u00f2\u009cI\u008ad\u00adh\u0099J\u0095aY-\u00fc\u00e9\u00b7\u00eb/\u0093\u00c8\u00f1\u00d3\u00d0\u00c7\u00feOm\u00c6\u008f\u00f3M[.f\"\u00f9\u0086\u00ea\u0007\u0001w\u0006\u00f2u\u00eaU\u0085\u00d4\u00c6\u00dd?\u00112\u00be\u0014\u00f8E\u007f\u0010\u0084X+#\u0098\u00c3x\u00fd\u00b9\u0017E\u00db\u00cd6a*:l_\u00edh^\u00be\u001d.\u0081\u00b3\u00c9\u00dc\u00db3\u00b8\u00e4\u0000\u00c3\u00f4\u001e+\u00f9\u00c0\u00e3E\u00d6\u009d\u0081!\u0010\u001a\u0098TN\u008a\u00ddl\u0089\u00b7P\u00d2\u0096\\\\\u000f\u0006\u00aaWG8\u0017\u000f}\u00b3\u001a\u00baV\u008f\u009d\u00f9\u00009\u00f1\r\u009bk\u00a3\\*)y*8 \u00e6\u001f\u0016\u00df\u0001Y\u00ccI\u00a2^\u0092\\\u0007\u00dd2";
                var7_6 = "\u00af\u00c0\u00cb\u00a5f\u00a8Q6\u00b9\u0013\u00ac*\u00ce\u00f7h\u00c6\u0081\u0087!\u0080\u00f3\u00f8\u00ee\u0082\u009a\u009dW\u00b8\u00cf\u00a8\u001b\u00f5\u0093\u0013#\u00e6\u00fc\u00f0\u009e\u00b2\u0007\u00f4H\u0016\u0084\u0019~\u00b4\u0005\u00e2\u00e2,z\u00e0\u00e61r9\u0003\u00f1\u0012\r\u00d0p\u00fa\u00a6\u001b\u00c3\u0096n\u00d16\u00a7h\u0014\u00f2\u009cI\u008ad\u00adh\u0099J\u0095aY-\u00fc\u00e9\u00b7\u00eb/\u0093\u00c8\u00f1\u00d3\u00d0\u00c7\u00feOm\u00c6\u008f\u00f3M[.f\"\u00f9\u0086\u00ea\u0007\u0001w\u0006\u00f2u\u00eaU\u0085\u00d4\u00c6\u00dd?\u00112\u00be\u0014\u00f8E\u007f\u0010\u0084X+#\u0098\u00c3x\u00fd\u00b9\u0017E\u00db\u00cd6a*:l_\u00edh^\u00be\u001d.\u0081\u00b3\u00c9\u00dc\u00db3\u00b8\u00e4\u0000\u00c3\u00f4\u001e+\u00f9\u00c0\u00e3E\u00d6\u009d\u0081!\u0010\u001a\u0098TN\u008a\u00ddl\u0089\u00b7P\u00d2\u0096\\\\\u000f\u0006\u00aaWG8\u0017\u000f}\u00b3\u001a\u00baV\u008f\u009d\u00f9\u00009\u00f1\r\u009bk\u00a3\\*)y*8 \u00e6\u001f\u0016\u00df\u0001Y\u00ccI\u00a2^\u0092\\\u0007\u00dd2".length();
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
                    var6_5 = "*Z\u001b\u0086\u00b5\u00cak[\u0089r\u00f9\u00d5\u00b2\u009f\u00d2/";
                    var7_6 = "*Z\u001b\u0086\u00b5\u00cak[\u0089r\u00f9\u00d5\u00b2\u009f\u00d2/".length();
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
        _5i_0.d = var8_3;
        _5i_0.e = new Integer[32];
        _5i_0.cfr_renamed_241 = (int)_5i_0.a("l", (int)25396, (long)(var0 ^ 7331434437855792645L));
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
            case 0 -> 48;
            case 1 -> 33;
            case 2 -> 45;
            case 3 -> 34;
            case 4 -> 47;
            case 5 -> 15;
            case 6 -> 5;
            case 7 -> 25;
            case 8 -> 14;
            case 9 -> 26;
            case 10 -> 38;
            case 11 -> 44;
            case 12 -> 4;
            case 13 -> 2;
            case 14 -> 52;
            case 15 -> 55;
            case 16 -> 53;
            case 17 -> 0;
            case 18 -> 46;
            case 19 -> 54;
            case 20 -> 49;
            case 21 -> 12;
            case 22 -> 36;
            case 23 -> 43;
            case 24 -> 39;
            case 25 -> 17;
            case 26 -> 16;
            case 27 -> 40;
            case 28 -> 21;
            case 29 -> 30;
            case 30 -> 51;
            case 31 -> 20;
            case 32 -> 22;
            case 33 -> 3;
            case 34 -> 23;
            case 35 -> 10;
            case 36 -> 7;
            case 37 -> 31;
            case 38 -> 57;
            case 39 -> 9;
            case 40 -> 29;
            case 41 -> 59;
            case 42 -> 11;
            case 43 -> 58;
            case 44 -> 35;
            case 45 -> 19;
            case 46 -> 18;
            case 47 -> 60;
            case 48 -> 32;
            case 49 -> 1;
            case 50 -> 8;
            case 51 -> 28;
            case 52 -> 50;
            case 53 -> 42;
            case 54 -> 62;
            case 55 -> 56;
            case 56 -> 6;
            case 57 -> 24;
            case 58 -> 63;
            case 59 -> 27;
            case 60 -> 37;
            case 61 -> 61;
            case 62 -> 13;
            default -> 41;
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
        _5i_0.k[n3] = new String(cArray);
        return n3;
    }

    /*
     * Unable to fully structure code
     */
    private boolean boolean_9(Object[] var1_1) {
        block21: {
            block20: {
                block19: {
                    block18: {
                        block16: {
                            block17: {
                                var2_2 = (class_1799)var1_1[0];
                                var3_3 = (Long)var1_1[1];
                                var3_3 = _5i_0.b ^ var3_3;
                                var5_4 = _3C.cfr_renamed_4();
                                try {
                                    try {
                                        v0 = var2_2;
                                        if (var5_4 != 0) break block16;
                                        if (_5i_0.c("v", (Object)v0, (long)4960910897398194739L, (long)var3_3) == false) break block17;
                                    }
                                    catch (MatchException v1) {
                                        throw _5i_0.a(v1);
                                    }
                                    return false;
                                }
                                catch (MatchException v2) {
                                    throw _5i_0.a(v2);
                                }
                            }
                            v0 = var2_2;
                        }
                        try {
                            try {
                                v3 = _5i_0.c("v", (Object)v0, (long)4958786194311286957L, (long)var3_3);
                                v4 = _5i_0.c("j", (long)4959444939600981811L, (long)var3_3);
                                v5 = var5_4;
                                if (var3_3 <= 0L) ** GOTO lbl42
                                if (v5 != 0) break block18;
                                if (v3 != v4) {
                                }
                                ** GOTO lbl56
                            }
                            catch (MatchException v6) {
                                throw _5i_0.a(v6);
                            }
                            v3 = _5i_0.c("v", (Object)var2_2, (long)4958786194311286957L, (long)var3_3);
                            v4 = _5i_0.c("j", (long)4962045166463394593L, (long)var3_3);
                        }
                        catch (MatchException v7) {
                            throw _5i_0.a(v7);
                        }
                    }
                    try {
                        try {
                            if (var3_3 <= 0L) break block19;
                            v5 = var5_4;
lbl42:
                            // 2 sources

                            if (v5 != 0) break block19;
                            if (v3 != v4) {
                            }
                            ** GOTO lbl56
                        }
                        catch (MatchException v8) {
                            throw _5i_0.a(v8);
                        }
                        v3 = _5i_0.c("v", (Object)var2_2, (long)4958786194311286957L, (long)var3_3);
                        v4 = _5i_0.c("j", (long)4960484094083230344L, (long)var3_3);
                    }
                    catch (MatchException v9) {
                        throw _5i_0.a(v9);
                    }
                }
                try {
                    if (v3 != v4) break block20;
lbl56:
                    // 3 sources

                    v10 = true;
                    break block21;
                }
                catch (MatchException v11) {
                    throw _5i_0.a(v11);
                }
            }
            v10 = false;
        }
        return v10;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'K' || c == 'w' || c == 'j' || c == 'f') {
                field = _5i_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'K' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'w' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'j' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5i_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'v' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'Q' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        Object[] objectArray = j;
        j[0] = "I\u007fd_dJI\u007fs\u0003hES4s\u001dhPTE&B1";
        objectArray[1] = "\u0002]%9G$\u001cU?v%8\u001bH";
        objectArray[2] = "4$`<{T*,zs\u001cU;7w):S";
        objectArray[3] = "\u007fs*i\u001cb\u007fs=5\u0010me8=+\u0010xbImvA";
        objectArray[4] = "S\u0017D\u007f'*S\u0017S#+%I\\S=+0N-\u0007e|";
        objectArray[5] = "#\f\u0015;I\u0006(\u0003\u0004t(\b#\b\u0000.";
        objectArray[6] = Boolean.TYPE;
        _5i_0.k[6] = "java/lang/Boolean";
        objectArray[7] = "\fP\u001a#'A\u0011E\u0018b\"\u001d^M";
        objectArray[8] = ";^^\u0015A.&K\\TDrfI";
        objectArray[9] = Long.TYPE;
        _5i_0.k[9] = "java/lang/Long";
        objectArray[10] = "-#\u0017\u0003\"z06\u0015B'&|/";
        objectArray[11] = ";\u0005c$W\u001bN%h+FT/+c B\u000e[";
        objectArray[12] = Void.TYPE;
        _5i_0.k[12] = "java/lang/Void";
        objectArray[13] = "\u001fR\u001a\u0007tW\u001fR\r[xX\u0005\u0019\rExM\u0002h\\\u001d*";
        objectArray[14] = Double.TYPE;
        _5i_0.k[14] = "java/lang/Double";
        objectArray[15] = "\u0003aX\u001c^\u0015\u001etZ][ISo";
        objectArray[16] = "\u0016o*\u0005n\u0003cO!\n\u007fL\u0002A*\u0001{\u0016v";
        objectArray[17] = "is\u0000l\u0000\u0007tf\u0002-\u0005[5T";
        objectArray[18] = Integer.TYPE;
        _5i_0.k[18] = "java/lang/Integer";
        objectArray[19] = "?aQ1Cf\"tSpF:b6";
        objectArray[20] = "dS\u000e?ym\u0011s\u00050h\"p}\u000e;lx\u0004";
        objectArray[21] = "\u001cvB`PPiVIoA\u001f\bXBdEE|";
        objectArray[22] = "D^\"\u0000,~YK A)\"\u0019\u000f";
        objectArray[23] = "Y\u000f2}\u0014.D\u001a0<\u0011r\t\u0018";
        objectArray[24] = "KxQe\u0003i>XZj\u0012&_VQa\u0016|+";
        objectArray[25] = "qOgwk.\u0004olxzaeags~;\u0011";
        objectArray[26] = "]){B=\u0012])l\u001e1\u001dGbl\u00001\b@\u0013=_h";
        objectArray[27] = "\u000bf.\u0000;\r\u000bf9\\7\u0002\u0011-9B7\u0017\u0016\\i\u0017`Q";
        objectArray[28] = "\u00056I_2H\u00056^\u0003>G\u001f}^\u001d>R\u0018\f\u000eHj\u0018O0Q\u0010,R4a\tC";
        objectArray[29] = "?Li,\u000f8!Dscn=!Dp#@!";
        objectArray[30] = "('cadK52a a\u0017u\u000b";
        objectArray[31] = "K\u0015y\u0012\u0018\t>5r\u001d\tF_;y\u0016\r\u001c+";
        objectArray[32] = "\u001f\u001c)]SX\u0014\u00138\u00120U\u0001\u0015";
        objectArray[33] = "v$\u007f\u00053M\u0003\u0004t\n\"\u0002b\n\u007f\u0001&X\u0016";
        objectArray[34] = "w)\r#\u0001\u001bw)\u001a\u007f\r\u0014mb\u001aa\r\u0001j\u0013H;YE";
        objectArray[35] = "8<\u0018I\u00146M\u001c\u0013F\u0005y,\u0012\u0018M\u0001#X";
        objectArray[36] = "\"\u0001$\u001b\b4\"\u00013G\u0004;8J3Y\u0004.?;c\u0000Vo";
        objectArray[37] = ">^y9\u001dF>^ne\u0011I$\u0015n{\u0011\\#d?$I\u000b3Wld\u0003pb\u000f=";
        objectArray[38] = "G\u0018;\u0010\u0011F280\u001f\u0000\tS6;\u0014\u0004S'";
        objectArray[39] = "\u0017{bpl]\nn`1i\u0001Jf";
        objectArray[40] = "\u000e6T?gH\u000e6CckG\u0014}C}kR\u0013\f\u0013(?\u0018";
        objectArray[41] = "N)\u0013\u0016+\u0002N)\u0004J'\rTb\u0004T'\u0018S\u0013V\n\u007f\\";
        objectArray[42] = "\u00077\u001e:d\n\u0019?\u0004u,\n\u00035\u001c2%\u0011C\u0006\u001a>.\u0016\u000e7\u001c>";
        objectArray[43] = "v\u0012\u0006\bi\u001av\u0012\u0011Te\u0015lY\u0011Je\u0000k(@\u00157K";
        objectArray[44] = "d\u0000+\u001cx\u001a\u0011  \u0013iUp.+\u0018m\u000f\u0004";
        objectArray[45] = "!ZYF-{TzRI<45tYB8nA";
        objectArray[46] = Float.TYPE;
        _5i_0.k[46] = "java/lang/Float";
        objectArray[47] = "zM\t\u0006\u0003b\u000fm\u0002\t\u0012-nc\t\u0002\u0016w\u001a";
        objectArray[48] = "~k7856~k d99d  z9,cQp/mf4m/w+,O=z h";
        objectArray[49] = "8\u001b\u0013z,I8\u001b\u0004& F\"P\u00048 S%!Vfw\u0018";
        objectArray[50] = "\u0018dEWgl\u0018dR\u000bkc\u0002/R\u0015kv\u0005^\u0000N3<";
        objectArray[51] = "c?]\u0000ZZ\u0016\u001fV\u000fK\u0015w\u0011]\u0004OO\u0003";
        objectArray[52] = "\u0005f \u000e\u0017\u001bpF+\u0001\u0006T\u0011H \n\u0002\u000ee";
        objectArray[53] = "\"q\u0012'/]\"q\u0005{#R8:\u0005e#G?KW1r\u0006";
        objectArray[54] = "\\\n\u0010i\u0004}\\\n\u00075\brFA\u0007+\bgA0UpP&";
        objectArray[55] = "iB~etE#\u001fx1\u0016G5^g3zua\u001a=i\u0016\u00138[66qYe]bT'[1\u001bk.xC2H\u0007";
        objectArray[56] = "W8#\u0002>\u001dM|$\u0006\u0006C[x \fjq\u000f<yW\u0006\u0017Omy\u0007|HWn*kg\u001aUmxP}^Ri@";
        objectArray[57] = "UNn'U+Y\u0011\u007f&7%Z\u000fo/[\u0017\u000eL0x\u000b@\u0006\u0013vyU'LNp-7";
        objectArray[58] = "u\u0015\u0002uo:|\t\tt\u0012jv\t\u0006|E=,XR\u0010puw\u0001\u001f.yi|\u0000";
        objectArray[59] = "T'j\u007f|S\\+f:\u0011WZf\u001b;)[T!jjwGY\u001a";
        objectArray[60] = "\u001dc$%za\bak|@av5`$p8\t``6 ";
        objectArray[61] = "b\tEdl]>\u001e\u0000<\u000eZ6\u0004C\u00042\u00048\u0017\u0004ucZ$\u001a?";
        objectArray[62] = "\u001c:\\GAvEaYO,vHz3AUy\u0015`L\u0014UkE\u0006\u000f\u0012Oz\u001ew^LSw%";
        objectArray[63] = "G\u000fp*\u0011mQ\u0006|.pi#\u0007*+\u0002nBU\"#I,#U/u\u0011o\u001c@-:HU";
        objectArray[64] = "wS\u0014P\u0015}r\b\u001fTs!HR\nC\t\u007f.\u0012LKH";
        objectArray[65] = ":^i0Wz:H,o./>RT>W*oR+kW8?4?,Nz9Kj,\\*__-5\u001e, \n-'NJ";
        objectArray[66] = "U\u001a\u0014[\"$\fZ\u001d\u0006Hbh\u001fB\\:`\tMJTq\"h\u0016\u0018\u0000#eX\\\u0015T5[";
        objectArray[67] = "\u0002/V\u00058WBi^DY\u000b?iAD)\u0001\u000fgZ\u0006?1\u0003,L\u001eg\fB2WFY";
        objectArray[68] = "\u0014'T\\L%\u0011|_X*z\u001a\u001b\u000b\u0006I4\u0010zY\u000eA\u007fR\u001b\u0002\\\u0015-\u0015+HQA;+";
        objectArray[69] = "rj<Yo4r|y\u0006\u0016xpZhPwmq{\u0001\rom.l{Rwn}\u00000E\u007f={zo]|n\u0017";
        objectArray[70] = "\u001f \u0015\u001cD,\u001a4\bY&/\u0014%\r\u0007J\u001dCbVZ\u001fJH \u0004YJ0\u00178\u0007\n&";
        objectArray[71] = "TO\u0007\u0015C\u0015Q[\u001aP!\u0016_J\u001f\u000eM$\b\rDP\u001es\u0003O\u0016PM\t\\W\u0015\u0003!";
        objectArray[72] = "3mz\u007f\u0017S66q{q\reQrs\u0011\u000eo5bl\rN";
        objectArray[73] = "_pb\u0018\u0012m_f'Gk8Sj_L\u00124\u0003v%\u0013\n7P\u001an\u0004\u0002dV`1\u001c\u00017:+&\u0014R1@t>\u0017\u0001]";
        objectArray[74] = "\bx?4Y\u0010\u001d`9q?\u000e\u0014}`*S<F0>u?W\u0002jas\u0002\u0016\u001cq9M";
        objectArray[75] = "{/cCa\u0002n-,\u001a[\u0001U\u00125[;\rvm`[)]";
        objectArray[76] = "?}\u0019%*A:&\u0012!L\u0018\u0000|\u000766Cf<A>w";
        objectArray[77] = ":\u001e'u/j*\u0001;5L1TI\u007f(>55\u001bw uwT\u001bzv-4k\u000ex9t\u000e";
        objectArray[78] = "A$8$1\u001d\u0003 j1CC\u001a.e:\u0014\u0014Dy=Vx\u0010F9>;*QD~";
        objectArray[79] = "Cl\u0013\r\b*Fx\u000eHj)Hi\u000b\u0016\u0006\u001b\u0018$ZAj=@j\u001a\r\u0007'\u0018k[q\u001b5\u001al\r\n\u000e-\u001c)k";
        objectArray[80] = "+X;7T\u0019.\u0003032GJd3;RDw\u0000#$N\u0004";
        objectArray[81] = "4%!m,\u0015v!sx^Ko/|s\t\u001c0r'\u001fb\u0018d&u'=^q";
        objectArray[82] = "U$(vl<P\u007f#r\nb!\u0018sl{%\u000b~3*sd";
        objectArray[83] = "\t9\u0002G\u001ef\u0013}\u0005C&8\u0005y\u0001IJ\nY4[.\u0017=\u00114\u0003I]`\u0017`a\u001fF$Yg\u0006U\u001b\"\r\u0005\u0002\u0013W%\u0005n\n\u001f[`h";
        objectArray[84] = "\u0018'N^\u0019\u001eP'M\u0002dE\r`\\Z\bwY\"\u0000\u0006Z QeU\u0004\bZ\u000e}VWd\u0011\u0019u\u0005Q\u001eN\u0001vV=UY\t%PG\nA\nv<\f\u001dIYpFS\u0005J\n\u001c";
        objectArray[85] = "1F\u001bV\u0000\u0016>A\u001a\\?F# S\u0014\\\tcA\u0001\u001cTB! ZN\u0000\u0010f\u0010\u0010CT\u0006X";
        objectArray[86] = "km`\u0012Cvny}W!~ly|\u0002v-<+!n\u0010id-t\u0014Oqg~";
        objectArray[87] = "%\u001dj(|H \twm\u001eK.\u0018r3ryy_)m..r\u001d{mrT-\u0005x>\u001e";
        objectArray[88] = "Pz0\u0003|\u0003\\%!\u0002\u001e\r_;1\u000br?\u000bxn\\%hKz3\\\u007f\u0019\f&:S\u001e";
        objectArray[89] = "n\u0016.y>@kM%}X\u0012;*q#;QjK#+3\u001a(*xygHo\u001a2t3^Q";
        objectArray[90] = "U\u000e]]\r2U\n\u0018\u000eL\\\u0002WI\u0000\\\u000b\\\u000b\u0018_0eUXY\\K0\u0014\nJ\t";
        objectArray[91] = "hDn?\">x[r\u007fAb\u0006\u00136b3agA>jx#\u0006Awaq<y\u0014ws!Z";
        objectArray[92] = "/Q\u007flG+l\u0011uu7\u001f2\u0012\u007f\u0011Mj5\u0013oo\u000e*?\n";
        objectArray[93] = ">\"\\?r\tadI[z\\~\u007fQ7H\n;!\u000ed\u001fZ{\u007f\u0006=`\u000f{mV[";
        objectArray[94] = "_cz\r|MZ8q\t\u001a\u0013\u000e_!\u0017kT\u00019aQc\u0015";
        objectArray[95] = "Gx\u001dD7\u001fGnX\u001bNDEi \u00107F\u001b~ZO/EH\u0012\u0011X'\u0016NhN@$E\"";
        objectArray[96] = "Lgei'SIsx,EPGb}r)b\u0010%&/}5\u001bgt,)OD\u007fw\u007fE";
        objectArray[97] = "p\u001cfWFA)Gc_+G%L\t\u0006\u0013M*\u001bxWMQ' 5A@Ow\u001dt_[\u0017I";
        objectArray[98] = "`cN|@He8Ex&\u0016_bPo\\J9\"\u0016g\u001d";
        objectArray[99] = "$Y\u0018(\u0012e!\u0002\u0013,t>\u001b\t\u0010.\u0018b|\u0006\u0003*\u0019";
        objectArray[100] = "v\u0011g\u0013M;)WrwEn6Lj\u001bw:u\u00131M x \u0013uF\u001be/\u00146wB>+Co\u001cNa:B\r";
        objectArray[101] = "\u0019WK\u001b\u0014%\u0019S\u000eHUKN\u000e_FE\u001c\u0010Q\t\u001e)r\u0019\u0001O\u001aR'XS\\O";
        objectArray[102] = "ir6E!`64#!)5)/;M\u001bhntg!7;80cL-gl#\\@p;<wgZ4<8O @q87u2\u001d.5Uv`N!5:/;K)X";
        objectArray[103] = "$\u0016dE%R(IuDG\\+WeM+n\u007f\u0014:\u0015x9;FxR<W,R5\u0012G";
        objectArray[104] = "S\u0018\u00002y\u0015VC\u000b6\u001fGl\u001d^3mM\rOV;&\u000fl\u0018\u001d;~HQY\u0003 &v";
        objectArray[105] = "z%L5\f]{?[(}`X\u0006j\t':z%L5\f]{?[(";
        objectArray[106] = "\u0012x'\u001d\u0010)\b$s\u000e/!\u0004g*\u0005C\u0013T+pS/%Ux#Z\u0014?\u0011\u007f'b";
        objectArray[107] = "1Kfg\u0002\\1]#8{\t5G[3\u0002\u0005mM!l\u001a\u0006>!j{\u0012U8[5c\u0011\u0006T\u0010\"kB\u0000.O:h\u0011l";
        objectArray[108] = "\u0012a\u001e?w+\u0007y\u0018z\u00115\u000edA!}\u0007\\)\u0019w\u0011iZv\\~j<\u001b$O+\u0011";
        objectArray[109] = "0IA\u001bb!z\u0014GO\u0000(`D\\FW\u007f:\u0014\u0002*1?h\u0010TPn'kC";
        objectArray[110] = "@\u001b)l_\u001a\u0019@,d2\u000e\u0018U+\u0001Y\f\u0019\u0017 ~\f\f\u000bGF";
        objectArray[111] = ",\u001fI\u0003DT)DB\u0007\"\ba#\u0016YAE(BDQI\u000ej#\u001f\u0003\u001d\\-\u0013U\u000eIJ\u0013";
        objectArray[112] = "\u001fXU{(wX\u0004\\tIh\u0007\bS'\u001e?]^\rK0;\u0004UV:wg\rZ";
        objectArray[113] = "\u001aBeCN(C\u0019`K#&X3oV_6#BqEBy\u001e\u0003o^\u001aG";
        objectArray[114] = "\u0011\u0018:*\u001c\u0013\u000b@;k`\u0010\u0001\u0010!77CPD}[\u0011\u001b\u001f\f96\u000bC\u001eM";
        objectArray[115] = "GjYXX\u001a\u0018,L<PO\u00077TPb\u001bKk\u000e\u00025\u001bG8^QZB\u001c=V<";
        objectArray[116] = "X\u0004\u0014\u0016vOX\u0000QE7!\u000f]\u0000K'vQ\fU\u0014K\u0018XR\u0010\u00170M\u0019\u0000\u0003B";
        objectArray[117] = "0X\u0015\u001b_Gz\u0005\u0013O=N`U\bFj\u0019:\u0005T*\fYh\u0001\u0000PSAkR";
        objectArray[118] = "L:\rw!Y\u0015a\b\u007fLW\tk\u0018s0Q\u000f\u0006[g6V\u0017g\u0007ps\u000eu";
        objectArray[119] = "DLztOaKK{~p4b*26\u0013~\u0016K`>\u001b5T*;lOg\u0013\u001aqa\u001bq-";
        objectArray[120] = "x)*o}*$>o7\u001f+(/\u0016bo7Ah+d~u|)5\u007f&K";
        objectArray[121] = "\u0012:(\u0006Gb\u001a6$C*h\n_#\u0013Qd\u0017{YBQb\u00109d\u0003OyH\u0007";
        objectArray[122] = "w\u0011k$9)w\u0007.{@bs\u001dVp9p+\u0017,/!sx{g8) ~\u00018 *s\u0012";
        objectArray[123] = "\u0018]Q\"~r\u0017ZP(A!\u001a;\u0019`\"mJZKh*&\b;\u0010:~tO\u000bZ7*bq";
        objectArray[124] = "1~b[=Z4j\u007f\u001e_Y:{z@3kl9&\u001ac<)ye\u001bnU(?cC_";
        objectArray[125] = "B*-8e\u0016\bw+l\u0007\u001f\u0012'0ePHHwm\t6\b\u001as8si\u0010\u0019 ";
        objectArray[126] = "U_Kq`d\f\u001fB,\n\"hYB,xiX\u001bF~m";
        objectArray[127] = "Q3H'i;KkIf\u00158A;S:Bk\u0010n\u0007Vd3_'K;~k^f";
        objectArray[128] = "4].?mJ1I3z\u000fB3I2/X\u0012j\u001ffC>U;\u001d:9aM8N";
        objectArray[129] = "oy\b^T[j\"\u0003Z2\t\u0017EW\u0004QJk$\u0005\fY\u0001)E^^\rSnu\u0014SYEP";
        objectArray[130] = "s0 z\u001a\u001bf2o# \u001f\u0018fd{\u0010Bg3di@";
        objectArray[131] = "|S$Yy\\yG9\u001c\u001bT{G8IL\u0007+\u001am%*Cs\u00130_u[p@";
        objectArray[132] = "|,?G4h%w:OY|8z\u0014K\"{E{)Jia:.)X9\u0007.i0\u001a?x{i\"JY>y\u007f=G6g\"z5*";
        objectArray[133] = "\u000ehB\u001b\u001f\u0013\u000b3I\u001fyO\u000eT\u001dA\u001a\u0002\n5OI\u0012IHT\u0014\u001bF\u001b\u000fd^\u0016\u0012\r1";
        objectArray[134] = "\r\u000b\u0006,F!\u0002\u0018\u0002-\"{a\\Z#P}\u0000\u000eR+\u001b?a\u000e\u001b \u0012 \u001e[\u001b2BF";
        objectArray[135] = "=ja}\u0016Y(h.$,VV<%|\u001c\u0000)i%nL";
        objectArray[136] = "k\u0001\u000eDF\u001bnZ\u0005@ ET\u0004PERC5VXM\u0019\u0001TVU\u001bABkCWT\u0018x";
        objectArray[137] = "GVRtPN\fDXy5]VT_hb\n\b\u0004\u000645CXPKaH\bJZF";
        objectArray[138] = "^\u001eh@l\n[EcD\nYa\u001fvSp\b\u0007_0[1";
        objectArray[139] = "\u001a\u0017/\u0011\u0014m\u001fL$\u0015r5%\u00161\u0002\boCVw\nI";
        Object[] objectArray2 = objectArray;
        objectArray[140] = ")i\u001fYO\u0006,}\u0002\u001c-\u0005\"l\u0007BA7t.[\u0018\u0010`1n\u0018\u0019\u001c\t0(\u001eA-";
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _5i_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
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

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5i" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l2, long l3) {
        int n = _5i_0.e(l2, l3);
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
                clazz3 = _5i_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5i_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5i_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5i_0.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5i_0.f(407850884791935L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5i_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5i_0.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5i_0.f(407850884791935L, 0L);
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
            int n = _5i_0.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _5i_0.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5i_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5i_0.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5i_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5i_0.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5i_0.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5i" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x6A08;
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
                throw new RuntimeException("dev/krypton/5i", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5i_0.e[n2] = n3;
        }
        return e[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field g(long l2, long l3) {
        int n = _5i_0.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _5i_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5i_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5i_0.c(clazz3, string2, clazz2)) != null) {
                    _5i_0.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5i_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5i_0.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5i_0.f(407850884791935L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @_3i_0
    public void cfr_renamed_6(_6c_0 c_0) {
        _5i_0 i_0;
        int n;
        long l2;
        long l3;
        block19: {
            long l4;
            block18: {
                CallSite callSite;
                block17: {
                    long l5 = l3 = b ^ 0x5F02B1FE620FL;
                    l2 = l5 ^ 0x6B6772A9137L;
                    l4 = l5 ^ 0x572C02CF522CL;
                    n = _3C.cfr_renamed_4();
                    try {
                        try {
                            try {
                                callSite = _5i_0.c("K", (Object)this, -6936498863871783151L, (long)l3);
                                if (n != 0) break block17;
                                if (_5i_0.c("K", (Object)callSite, -6939901175674704225L, (long)l3) == null) return;
                            }
                            catch (MatchException matchException) {
                                throw _5i_0.a(matchException);
                            }
                            i_0 = this;
                            if (n != 0) break block18;
                        }
                        catch (MatchException matchException) {
                            throw _5i_0.a(matchException);
                        }
                        callSite = _5i_0.c("K", (Object)i_0, -6936498863871783151L, (long)l3);
                    }
                    catch (MatchException matchException) {
                        throw _5i_0.a(matchException);
                    }
                }
                try {
                    if (_5i_0.c("K", (Object)callSite, -6937956169438387849L, (long)l3) == null) {
                        return;
                    }
                }
                catch (MatchException matchException) {
                    throw _5i_0.a(matchException);
                }
                Object[] objectArray = new Object[3];
                objectArray[2] = l2;
                objectArray[1] = c_0;
                objectArray[0] = _5i_0.c("K", (Object)_5i_0.c("K", (Object)this, -6936498863871783151L, (long)l3), -6939901175674704225L, (long)l3);
                _5i_0.c("v", (Object)this, (Object)objectArray, -6938568672443573054L, (long)l3);
                i_0 = this;
            }
            try {
                try {
                    if (n != 0) break block19;
                    if (_5i_0.c("v", (Object)_5i_0.c("K", (Object)i_0, -6953114295024068023L, (long)l3), (long)l4, -6938988815580239498L, (long)l3) == false) return;
                }
                catch (MatchException matchException) {
                    throw _5i_0.a(matchException);
                }
                i_0 = this;
            }
            catch (MatchException matchException) {
                throw _5i_0.a(matchException);
            }
        }
        CallSite callSite = _5i_0.c("v", (Object)_5i_0.c("v", (Object)_5i_0.c("K", (Object)_5i_0.c("K", (Object)i_0, -6936498863871783151L, (long)l3), -6937956169438387849L, (long)l3), -6935572693855608374L, (long)l3), -6935925292142823318L, (long)l3);
        while (_5i_0.c("v", (Object)callSite, -6936379875676144173L, (long)l3) != false) {
            class_1657 class_16572 = (class_1657)_5i_0.c("v", (Object)callSite, -6941054381860203418L, (long)l3);
            try {
                if (class_16572 != _5i_0.c("K", (Object)_5i_0.c("K", (Object)this, -6936498863871783151L, (long)l3), -6939901175674704225L, (long)l3)) {
                    Object[] objectArray = new Object[3];
                    objectArray[2] = l2;
                    objectArray[1] = c_0;
                    objectArray[0] = class_16572;
                    _5i_0.c("v", (Object)this, (Object)objectArray, -6938568672443573054L, (long)l3);
                }
            }
            catch (MatchException matchException) {
                throw _5i_0.a(matchException);
            }
            if (n == 0) continue;
        }
    }

    private static boolean cfr_renamed_7(class_1297 class_12972) {
        return class_12972 instanceof class_1309;
    }

    private _8B dev_krypton_8B_5(Object[] objectArray) {
        _8B b = (_8B)objectArray[0];
        _8B b2 = (_8B)objectArray[1];
        float f = ((Float)objectArray[2]).floatValue();
        long l2 = (Long)objectArray[3];
        float f2 = ((Float)objectArray[4]).floatValue();
        long l3 = (l2 = _5i_0.b ^ l2) ^ 0x1202280BA7DAL;
        return new _8B((int)((float)_5i_0.c("K", (Object)b, -1903057814139574429L, (long)l2) + (float)(_5i_0.c("K", (Object)b2, -1903057814139574429L, (long)l2) - _5i_0.c("K", (Object)b, -1903057814139574429L, (long)l2)) * f), (int)((float)_5i_0.c("K", (Object)b, -1906425598284865658L, (long)l2) + (float)(_5i_0.c("K", (Object)b2, -1906425598284865658L, (long)l2) - _5i_0.c("K", (Object)b, -1906425598284865658L, (long)l2)) * f), l3, (int)((float)_5i_0.c("K", (Object)b, -1898898649932491735L, (long)l2) + (float)(_5i_0.c("K", (Object)b2, -1898898649932491735L, (long)l2) - _5i_0.c("K", (Object)b, -1898898649932491735L, (long)l2)) * f), (int)(((float)_5i_0.c("K", (Object)b, -1899234514453677894L, (long)l2) + (float)(_5i_0.c("K", (Object)b2, -1899234514453677894L, (long)l2) - _5i_0.c("K", (Object)b, -1899234514453677894L, (long)l2)) * f) * f2));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5i_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5i_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

