/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  java.lang.MatchException
 *  net.minecraft.class_11278
 *  net.minecraft.class_2338
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_4587
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 *  org.joml.Vector4f
 */
package dev.krypton;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import dev.krypton._4w;
import dev.krypton._6N;
import dev.krypton._87;
import dev.krypton._8B;
import dev.krypton._9x;
import dev.krypton.l;
import dev.krypton.mixin._8U;
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
import net.minecraft.class_11278;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_4587;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector4f;

public class _4k {
    public static final Matrix4f cfr_renamed_7;
    private static final class_11278 cfr_renamed_5;
    private static final Matrix4f cfr_renamed_1;
    private static final Matrix4f cfr_renamed_0;
    private static final Vector4f cfr_renamed_9;
    public static class_243 cfr_renamed_3;
    public static boolean cfr_renamed_8;
    public final _6N cfr_renamed_208;
    public final _6N cfr_renamed_2;
    private final RenderPipeline cfr_renamed_24;
    private final RenderPipeline cfr_renamed_6;
    private static String cfr_renamed_4;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static final Object[] e;
    private static final String[] f;

    public void cfr_renamed_5(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        int n3 = (Integer)objectArray[2];
        long l2 = (Long)objectArray[3];
        _8B b = (_8B)objectArray[4];
        int n4 = (Integer)objectArray[5];
        long l3 = (l2 = a ^ l2) ^ 0x2D38FEF11733L;
        Object[] objectArray2 = new Object[9];
        objectArray2[8] = n4;
        objectArray2[7] = b;
        objectArray2[6] = l3;
        objectArray2[5] = (double)(n3 + 1);
        objectArray2[4] = (double)(n2 + 1);
        objectArray2[3] = (double)(n + 1);
        objectArray2[2] = (double)n3;
        objectArray2[1] = (double)n2;
        objectArray2[0] = (double)n;
        _4k.b("e", (Object)this, (Object)objectArray2, 8690329134572920315L, (long)l2);
    }

    public void cfr_renamed_209(Object[] objectArray) {
        class_4587 class_45872 = (class_4587)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x34BA40DED33BL;
        long l5 = l3 ^ 0x7B36B0155AF5L;
        long l6 = l3 ^ 0x751D0C3CFF25L;
        long l7 = l3 ^ 0x619C82C7A52DL;
        long l8 = l3 ^ 0x1ABC0757FCAFL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l8;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = _4k.b("e", (Object)_4k.b("\u00a4", 514927670411948692L, (long)l2), 513740970828654887L, (long)l2);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l7;
        objectArray4[0] = _4k.b("\u00f9", (Object)this, 513798074489315700L, (long)l2);
        Object[] objectArray5 = new Object[3];
        objectArray5[2] = class_45872;
        objectArray5[1] = l5;
        objectArray5[0] = _4k.b("\u00f9", (Object)this, 515067878823796770L, (long)l2);
        Object[] objectArray6 = new Object[1];
        objectArray6[0] = l6;
        _4k.b("e", (Object)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00a4", (Object)objectArray2, 515940937136200777L, (long)l2), (Object)objectArray3, 514179253029001334L, (long)l2), (Object)objectArray4, 522317078411868473L, (long)l2), (Object)objectArray5, 513648765201339514L, (long)l2), (Object)objectArray6, 514649685410616824L, (long)l2);
        Object[] objectArray7 = new Object[1];
        objectArray7[0] = l8;
        Object[] objectArray8 = new Object[2];
        objectArray8[1] = l4;
        objectArray8[0] = _4k.b("e", (Object)_4k.b("\u00a4", 514927670411948692L, (long)l2), 513740970828654887L, (long)l2);
        Object[] objectArray9 = new Object[2];
        objectArray9[1] = l7;
        objectArray9[0] = _4k.b("\u00f9", (Object)this, 521305951460475894L, (long)l2);
        Object[] objectArray10 = new Object[3];
        objectArray10[2] = class_45872;
        objectArray10[1] = l5;
        objectArray10[0] = _4k.b("\u00f9", (Object)this, 517024818391814927L, (long)l2);
        Object[] objectArray11 = new Object[1];
        objectArray11[0] = l6;
        _4k.b("e", (Object)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00a4", (Object)objectArray7, 515940937136200777L, (long)l2), (Object)objectArray8, 514179253029001334L, (long)l2), (Object)objectArray9, 522317078411868473L, (long)l2), (Object)objectArray10, 513648765201339514L, (long)l2), (Object)objectArray11, 514649685410616824L, (long)l2);
    }

    public void cfr_renamed_210(Object[] objectArray) {
        CallSite callSite;
        long l2;
        int n;
        long l3;
        _8B b;
        class_238 class_2382;
        block7: {
            _9x x;
            block8: {
                class_2382 = (class_238)objectArray[0];
                b = (_8B)objectArray[1];
                _8B b2 = (_8B)objectArray[2];
                l3 = (Long)objectArray[3];
                x = (_9x)((Object)objectArray[4]);
                n = (Integer)objectArray[5];
                long l4 = l3 = a ^ l3;
                long l5 = l4 ^ 0x19EEB8B23EA8L;
                l2 = l4 ^ 0x11285B860489L;
                int n2 = _87.cfr_renamed_7();
                try {
                    try {
                        callSite = _4k.b("e", (Object)((Object)x), 5837289342827004977L, (long)l3);
                        if (n2 == 0) break block7;
                        if (callSite == false) break block8;
                    }
                    catch (MatchException matchException) {
                        throw _4k.a(matchException);
                    }
                    Object[] objectArray2 = new Object[9];
                    objectArray2[8] = n;
                    objectArray2[7] = b2;
                    objectArray2[6] = l5;
                    objectArray2[5] = (double)_4k.b("\u00f9", (Object)class_2382, 5845079210529925942L, (long)l3);
                    objectArray2[4] = (double)_4k.b("\u00f9", (Object)class_2382, 5842828674210773766L, (long)l3);
                    objectArray2[3] = (double)_4k.b("\u00f9", (Object)class_2382, 5844131913711544435L, (long)l3);
                    objectArray2[2] = (double)_4k.b("\u00f9", (Object)class_2382, 5836741822711514453L, (long)l3);
                    objectArray2[1] = (double)_4k.b("\u00f9", (Object)class_2382, 5842600679545118939L, (long)l3);
                    objectArray2[0] = (double)_4k.b("\u00f9", (Object)class_2382, 5837709282094568457L, (long)l3);
                    _4k.b("e", (Object)this, (Object)objectArray2, 5837074804090434656L, (long)l3);
                }
                catch (MatchException matchException) {
                    throw _4k.a(matchException);
                }
            }
            callSite = _4k.b("e", (Object)((Object)x), 5837013859199570814L, (long)l3);
        }
        try {
            if (callSite != false) {
                Object[] objectArray3 = new Object[9];
                objectArray3[8] = n;
                objectArray3[7] = b;
                objectArray3[6] = (double)_4k.b("\u00f9", (Object)class_2382, 5845079210529925942L, (long)l3);
                objectArray3[5] = l2;
                objectArray3[4] = (double)_4k.b("\u00f9", (Object)class_2382, 5842828674210773766L, (long)l3);
                objectArray3[3] = (double)_4k.b("\u00f9", (Object)class_2382, 5844131913711544435L, (long)l3);
                objectArray3[2] = (double)_4k.b("\u00f9", (Object)class_2382, 5836741822711514453L, (long)l3);
                objectArray3[1] = (double)_4k.b("\u00f9", (Object)class_2382, 5842600679545118939L, (long)l3);
                objectArray3[0] = (double)_4k.b("\u00f9", (Object)class_2382, 5837709282094568457L, (long)l3);
                _4k.b("e", (Object)this, (Object)objectArray3, 5844752860547828180L, (long)l3);
            }
        }
        catch (MatchException matchException) {
            throw _4k.a(matchException);
        }
    }

    public static void cfr_renamed_211(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        float f = (float)(_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00d2", 4133820967861979008L, (long)l2), 4132912313422032934L, (long)l2), 4128913651411789773L, (long)l2) / _4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00d2", 4133820967861979008L, (long)l2), 4132912313422032934L, (long)l2), 4133916390765988285L, (long)l2));
        float f2 = (float)(_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00d2", 4133820967861979008L, (long)l2), 4132912313422032934L, (long)l2), 4128873399167835322L, (long)l2) / _4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00d2", 4133820967861979008L, (long)l2), 4132912313422032934L, (long)l2), 4133916390765988285L, (long)l2));
        _4k.b("\u00a4", (Object)_4k.b("e", (Object)_4k.b("\u00d2", 4129686822164380054L, (long)l2), (float)f, (float)f2, 4133070675255123779L, (long)l2), (Object)_4k.b("\u00d2", 4133132741954569431L, (long)l2), 4129737784912892300L, (long)l2);
        _4k.b("e", (Object)_4k.b("\u00d2", 4132244774038802182L, (long)l2), (Object)((_8U)((Object)_4k.b("\u00d2", 4129686822164380054L, (long)l2))).krypton$callGetMatrix(f, f2), 4129020948032584234L, (long)l2);
        _4k.b("\u00f1", (boolean)_4k.a("k", 31167, (long)(0x6B173A961B6EBD63L ^ l2)), 4130484789424395466L, (long)l2);
    }

    public void cfr_renamed_38(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = a ^ l2) ^ 0x6B837B766D25L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, 4231632566925696446L, (long)l2), (Object)objectArray2, 4230088248334906745L, (long)l2);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, 4229147999208156819L, (long)l2), (Object)objectArray3, 4230088248334906745L, (long)l2);
    }

    public void cfr_renamed_212(Object[] objectArray) {
        CallSite callSite;
        long l2;
        long l3;
        int n;
        _8B b;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        block7: {
            _9x x;
            block8: {
                d6 = (Double)objectArray[0];
                d5 = (Double)objectArray[1];
                d4 = (Double)objectArray[2];
                d3 = (Double)objectArray[3];
                d2 = (Double)objectArray[4];
                d = (Double)objectArray[5];
                b = (_8B)objectArray[6];
                _8B b2 = (_8B)objectArray[7];
                x = (_9x)((Object)objectArray[8]);
                n = (Integer)objectArray[9];
                l3 = (Long)objectArray[10];
                long l4 = l3 = a ^ l3;
                long l5 = l4 ^ 0x44D16723F057L;
                l2 = l4 ^ 0x4C178417CA76L;
                int n2 = _87.cfr_renamed_7();
                try {
                    try {
                        callSite = _4k.b("e", (Object)((Object)x), -6918256332068795698L, (long)l3);
                        if (n2 == 0) break block7;
                        if (callSite == false) break block8;
                    }
                    catch (MatchException matchException) {
                        throw _4k.a(matchException);
                    }
                    Object[] objectArray2 = new Object[9];
                    objectArray2[8] = n;
                    objectArray2[7] = b2;
                    objectArray2[6] = l5;
                    objectArray2[5] = d;
                    objectArray2[4] = d2;
                    objectArray2[3] = d3;
                    objectArray2[2] = d4;
                    objectArray2[1] = d5;
                    objectArray2[0] = d6;
                    _4k.b("e", (Object)this, (Object)objectArray2, -6918046191387100513L, (long)l3);
                }
                catch (MatchException matchException) {
                    throw _4k.a(matchException);
                }
            }
            callSite = _4k.b("e", (Object)((Object)x), -6917986347083981439L, (long)l3);
        }
        try {
            if (callSite != false) {
                Object[] objectArray3 = new Object[9];
                objectArray3[8] = n;
                objectArray3[7] = b;
                objectArray3[6] = d;
                objectArray3[5] = l2;
                objectArray3[4] = d2;
                objectArray3[3] = d3;
                objectArray3[2] = d4;
                objectArray3[1] = d5;
                objectArray3[0] = d6;
                _4k.b("e", (Object)this, (Object)objectArray3, -6925437826130049237L, (long)l3);
            }
        }
        catch (MatchException matchException) {
            throw _4k.a(matchException);
        }
    }

    public void cfr_renamed_213(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        double d3 = (Double)objectArray[2];
        double d4 = (Double)objectArray[3];
        double d5 = (Double)objectArray[4];
        double d6 = (Double)objectArray[5];
        long l2 = (Long)objectArray[6];
        _8B b = (_8B)objectArray[7];
        long l3 = (l2 = a ^ l2) ^ 0x105BBF0E17D4L;
        Object[] objectArray2 = new Object[9];
        objectArray2[8] = b;
        objectArray2[7] = b;
        objectArray2[6] = d6;
        objectArray2[5] = d5;
        objectArray2[4] = d4;
        objectArray2[3] = l3;
        objectArray2[2] = d3;
        objectArray2[1] = d2;
        objectArray2[0] = d;
        _4k.b("e", (Object)this, (Object)objectArray2, 663279265624057341L, (long)l2);
    }

    public void cfr_renamed_214(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        double d3 = (Double)objectArray[2];
        long l2 = (Long)objectArray[3];
        double d4 = (Double)objectArray[4];
        double d5 = (Double)objectArray[5];
        double d6 = (Double)objectArray[6];
        _8B b = (_8B)objectArray[7];
        _8B b2 = (_8B)objectArray[8];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x1354DE0A1E64L;
        long l5 = l3 ^ 0x37AE549DA1CL;
        long l6 = l3 ^ 0x270D57E10793L;
        long l7 = l3 ^ 0x703210A82755L;
        long l8 = l3 ^ 0x18F11119FACBL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l5;
        _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, 3589797099161949910L, (long)l2), (Object)objectArray2, 3590753790424328787L, (long)l2);
        Object[] objectArray3 = new Object[4];
        objectArray3[3] = d3;
        objectArray3[2] = d2;
        objectArray3[1] = l4;
        objectArray3[0] = d;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = b;
        objectArray4[0] = l6;
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l7;
        Object[] objectArray6 = new Object[4];
        objectArray6[3] = d6;
        objectArray6[2] = d5;
        objectArray6[1] = l4;
        objectArray6[0] = d4;
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = b2;
        objectArray7[0] = l6;
        Object[] objectArray8 = new Object[1];
        objectArray8[0] = l7;
        Object[] objectArray9 = new Object[3];
        objectArray9[2] = l8;
        objectArray9[1] = (int)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00f9", (Object)this, 3589797099161949910L, (long)l2), (Object)objectArray6, 3590412456908840351L, (long)l2), (Object)objectArray7, 3587460443728192607L, (long)l2), (Object)objectArray8, 3593837551664467020L, (long)l2);
        objectArray9[0] = (int)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00f9", (Object)this, 3589797099161949910L, (long)l2), (Object)objectArray3, 3590412456908840351L, (long)l2), (Object)objectArray4, 3587460443728192607L, (long)l2), (Object)objectArray5, 3593837551664467020L, (long)l2);
        _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, 3589797099161949910L, (long)l2), (Object)objectArray9, 3591502918396893848L, (long)l2);
    }

    public void cfr_renamed_215(Object[] objectArray) {
        CallSite callSite;
        long l2;
        _8B b;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        long l3;
        double d9;
        double d10;
        double d11;
        double d12;
        block5: {
            _9x x;
            block6: {
                d12 = (Double)objectArray[0];
                d11 = (Double)objectArray[1];
                d10 = (Double)objectArray[2];
                d9 = (Double)objectArray[3];
                l3 = (Long)objectArray[4];
                d8 = (Double)objectArray[5];
                d7 = (Double)objectArray[6];
                d6 = (Double)objectArray[7];
                d5 = (Double)objectArray[8];
                d4 = (Double)objectArray[9];
                d3 = (Double)objectArray[10];
                d2 = (Double)objectArray[11];
                d = (Double)objectArray[12];
                b = (_8B)objectArray[13];
                _8B b2 = (_8B)objectArray[14];
                x = (_9x)((Object)objectArray[15]);
                long l4 = l3 = a ^ l3;
                l2 = l4 ^ 0x7368D22904AAL;
                long l5 = l4 ^ 0x18AE7435B317L;
                long l6 = l4 ^ 0x75125BB8A546L;
                long l7 = l4 ^ 0x2CF7FDDEAAE0L;
                long l8 = l4 ^ 0x7BC8BA978A26L;
                long l9 = l4 ^ 0x130BBB2657B8L;
                int n = _87.cfr_renamed_5();
                try {
                    callSite = _4k.b("e", (Object)((Object)x), -7153297805801797239L, (long)l3);
                    if (n != 0) break block5;
                    if (callSite == false) break block6;
                }
                catch (MatchException matchException) {
                    throw _4k.a(matchException);
                }
                Object[] objectArray2 = new Object[3];
                objectArray2[2] = l6;
                objectArray2[1] = (int)_4k.a("k", 27599, (long)(0x662B6DFA134F0AEBL ^ l3));
                objectArray2[0] = 4;
                _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, -7160003727674754139L, (long)l3), (Object)objectArray2, -7159529829251982654L, (long)l3);
                Object[] objectArray3 = new Object[4];
                objectArray3[3] = d10;
                objectArray3[2] = d11;
                objectArray3[1] = l5;
                objectArray3[0] = d12;
                Object[] objectArray4 = new Object[2];
                objectArray4[1] = b2;
                objectArray4[0] = l7;
                Object[] objectArray5 = new Object[1];
                objectArray5[0] = l8;
                CallSite callSite2 = _4k.b("e", (Object)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00f9", (Object)this, -7160003727674754139L, (long)l3), (Object)objectArray3, -7160513529763598100L, (long)l3), (Object)objectArray4, -7153348164436588244L, (long)l3), (Object)objectArray5, -7157086442142555841L, (long)l3);
                Object[] objectArray6 = new Object[4];
                objectArray6[3] = d7;
                objectArray6[2] = d8;
                objectArray6[1] = l5;
                objectArray6[0] = d9;
                Object[] objectArray7 = new Object[2];
                objectArray7[1] = b2;
                objectArray7[0] = l7;
                Object[] objectArray8 = new Object[1];
                objectArray8[0] = l8;
                CallSite callSite3 = _4k.b("e", (Object)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00f9", (Object)this, -7160003727674754139L, (long)l3), (Object)objectArray6, -7160513529763598100L, (long)l3), (Object)objectArray7, -7153348164436588244L, (long)l3), (Object)objectArray8, -7157086442142555841L, (long)l3);
                Object[] objectArray9 = new Object[4];
                objectArray9[3] = d4;
                objectArray9[2] = d5;
                objectArray9[1] = l5;
                objectArray9[0] = d6;
                Object[] objectArray10 = new Object[2];
                objectArray10[1] = b2;
                objectArray10[0] = l7;
                Object[] objectArray11 = new Object[1];
                objectArray11[0] = l8;
                CallSite callSite4 = _4k.b("e", (Object)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00f9", (Object)this, -7160003727674754139L, (long)l3), (Object)objectArray9, -7160513529763598100L, (long)l3), (Object)objectArray10, -7153348164436588244L, (long)l3), (Object)objectArray11, -7157086442142555841L, (long)l3);
                Object[] objectArray12 = new Object[4];
                objectArray12[3] = d;
                objectArray12[2] = d2;
                objectArray12[1] = l5;
                objectArray12[0] = d3;
                Object[] objectArray13 = new Object[2];
                objectArray13[1] = b2;
                objectArray13[0] = l7;
                Object[] objectArray14 = new Object[1];
                objectArray14[0] = l8;
                CallSite callSite5 = _4k.b("e", (Object)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00f9", (Object)this, -7160003727674754139L, (long)l3), (Object)objectArray12, -7160513529763598100L, (long)l3), (Object)objectArray13, -7153348164436588244L, (long)l3), (Object)objectArray14, -7157086442142555841L, (long)l3);
                Object[] objectArray15 = new Object[3];
                objectArray15[2] = l9;
                objectArray15[1] = (int)callSite3;
                objectArray15[0] = (int)callSite2;
                _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, -7160003727674754139L, (long)l3), (Object)objectArray15, -7159422571330603029L, (long)l3);
                Object[] objectArray16 = new Object[3];
                objectArray16[2] = l9;
                objectArray16[1] = (int)callSite4;
                objectArray16[0] = (int)callSite3;
                _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, -7160003727674754139L, (long)l3), (Object)objectArray16, -7159422571330603029L, (long)l3);
                Object[] objectArray17 = new Object[3];
                objectArray17[2] = l9;
                objectArray17[1] = (int)callSite5;
                objectArray17[0] = (int)callSite4;
                _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, -7160003727674754139L, (long)l3), (Object)objectArray17, -7159422571330603029L, (long)l3);
                Object[] objectArray18 = new Object[3];
                objectArray18[2] = l9;
                objectArray18[1] = (int)callSite2;
                objectArray18[0] = (int)callSite5;
                _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, -7160003727674754139L, (long)l3), (Object)objectArray18, -7159422571330603029L, (long)l3);
            }
            callSite = _4k.b("e", (Object)((Object)x), -7153568762541269306L, (long)l3);
        }
        try {
            if (callSite != false) {
                Object[] objectArray19 = new Object[14];
                objectArray19[13] = b;
                objectArray19[12] = d;
                objectArray19[11] = d2;
                objectArray19[10] = d3;
                objectArray19[9] = d4;
                objectArray19[8] = d5;
                objectArray19[7] = d6;
                objectArray19[6] = d7;
                objectArray19[5] = d8;
                objectArray19[4] = d9;
                objectArray19[3] = d10;
                objectArray19[2] = l2;
                objectArray19[1] = d11;
                objectArray19[0] = d12;
                _4k.b("e", (Object)this, (Object)objectArray19, -7158793652124157469L, (long)l3);
            }
        }
        catch (MatchException matchException) {
            throw _4k.a(matchException);
        }
    }

    public void cfr_renamed_121(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        double d3 = (Double)objectArray[2];
        double d4 = (Double)objectArray[3];
        double d5 = (Double)objectArray[4];
        double d6 = (Double)objectArray[5];
        _8B b = (_8B)objectArray[6];
        _8B b2 = (_8B)objectArray[7];
        long l2 = (Long)objectArray[8];
        _9x x = (_9x)((Object)objectArray[9]);
        long l3 = (l2 = a ^ l2) ^ 0x335AD88AACFFL;
        Object[] objectArray2 = new Object[16];
        objectArray2[15] = x;
        objectArray2[14] = b2;
        objectArray2[13] = b;
        objectArray2[12] = d6;
        objectArray2[11] = d2;
        objectArray2[10] = d4;
        objectArray2[9] = d6;
        objectArray2[8] = d5;
        objectArray2[7] = d4;
        objectArray2[6] = d3;
        objectArray2[5] = d5;
        objectArray2[4] = l3;
        objectArray2[3] = d;
        objectArray2[2] = d3;
        objectArray2[1] = d2;
        objectArray2[0] = d;
        _4k.b("e", (Object)this, (Object)objectArray2, 2261095182161382742L, (long)l2);
    }

    public void cfr_renamed_88(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = (Integer)objectArray[2];
        int n3 = (Integer)objectArray[3];
        _8B b = (_8B)objectArray[4];
        int n4 = (Integer)objectArray[5];
        long l3 = (l2 = a ^ l2) ^ 0x58040F4AF5C7L;
        Object[] objectArray2 = new Object[9];
        objectArray2[8] = n4;
        objectArray2[7] = b;
        objectArray2[6] = (double)(n3 + 1);
        objectArray2[5] = l3;
        objectArray2[4] = (double)(n2 + 1);
        objectArray2[3] = (double)(n + 1);
        objectArray2[2] = (double)n3;
        objectArray2[1] = (double)n2;
        objectArray2[0] = (double)n;
        _4k.b("e", (Object)this, (Object)objectArray2, -6894180972042241894L, (long)l2);
    }

    public static void cfr_renamed_216(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        float f = (float)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00d2", -6230048676748322988L, (long)l2), -6228709035225112334L, (long)l2), -6225950579767199975L, (long)l2);
        float f2 = (float)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00d2", -6230048676748322988L, (long)l2), -6228709035225112334L, (long)l2), -6226059894927471506L, (long)l2);
        _4k.b("\u00a4", (Object)_4k.b("e", (Object)_4k.b("\u00d2", -6225175691834971838L, (long)l2), (float)f, (float)f2, -6228550741870129257L, (long)l2), (Object)_4k.b("\u00d2", -6228489637480721405L, (long)l2), -6225129882007748264L, (long)l2);
        _4k.b("e", (Object)_4k.b("\u00d2", -6229448868561182766L, (long)l2), (Object)((_8U)((Object)_4k.b("\u00d2", -6225175691834971838L, (long)l2))).krypton$callGetMatrix(f, f2), -6225917157690086658L, (long)l2);
        _4k.b("\u00f1", (boolean)_4k.a("k", 2770, (long)(0x183CD03BA249DEDCL ^ l2)), -6231207340348799970L, (long)l2);
    }

    public void cfr_renamed_217(Object[] objectArray) {
        CallSite callSite;
        long l2;
        int n;
        _8B b;
        class_2338 class_23382;
        long l3;
        block7: {
            _9x x;
            block8: {
                l3 = (Long)objectArray[0];
                class_23382 = (class_2338)objectArray[1];
                b = (_8B)objectArray[2];
                _8B b2 = (_8B)objectArray[3];
                x = (_9x)((Object)objectArray[4]);
                n = (Integer)objectArray[5];
                long l4 = l3 = a ^ l3;
                long l5 = l4 ^ 0x609502AFD584L;
                l2 = l4 ^ 0x6853E19BEFA5L;
                int n2 = _87.cfr_renamed_5();
                try {
                    try {
                        callSite = _4k.b("e", (Object)((Object)x), -5030997141405995235L, (long)l3);
                        if (n2 != 0) break block7;
                        if (callSite == false) break block8;
                    }
                    catch (MatchException matchException) {
                        throw _4k.a(matchException);
                    }
                    Object[] objectArray2 = new Object[9];
                    objectArray2[8] = n;
                    objectArray2[7] = b2;
                    objectArray2[6] = l5;
                    objectArray2[5] = (double)(_4k.b("e", (Object)class_23382, -5028156055290102601L, (long)l3) + true);
                    objectArray2[4] = (double)(_4k.b("e", (Object)class_23382, -5026172680493237225L, (long)l3) + true);
                    objectArray2[3] = (double)(_4k.b("e", (Object)class_23382, -5028975804216456138L, (long)l3) + true);
                    objectArray2[2] = (double)_4k.b("e", (Object)class_23382, -5028156055290102601L, (long)l3);
                    objectArray2[1] = (double)_4k.b("e", (Object)class_23382, -5026172680493237225L, (long)l3);
                    objectArray2[0] = (double)_4k.b("e", (Object)class_23382, -5028975804216456138L, (long)l3);
                    _4k.b("e", (Object)this, (Object)objectArray2, -5031349952791666868L, (long)l3);
                }
                catch (MatchException matchException) {
                    throw _4k.a(matchException);
                }
            }
            callSite = _4k.b("e", (Object)((Object)x), -5031290070925920174L, (long)l3);
        }
        try {
            if (callSite != false) {
                Object[] objectArray3 = new Object[9];
                objectArray3[8] = n;
                objectArray3[7] = b;
                objectArray3[6] = (double)(_4k.b("e", (Object)class_23382, -5028156055290102601L, (long)l3) + true);
                objectArray3[5] = l2;
                objectArray3[4] = (double)(_4k.b("e", (Object)class_23382, -5026172680493237225L, (long)l3) + true);
                objectArray3[3] = (double)(_4k.b("e", (Object)class_23382, -5028975804216456138L, (long)l3) + true);
                objectArray3[2] = (double)_4k.b("e", (Object)class_23382, -5028156055290102601L, (long)l3);
                objectArray3[1] = (double)_4k.b("e", (Object)class_23382, -5026172680493237225L, (long)l3);
                objectArray3[0] = (double)_4k.b("e", (Object)class_23382, -5028975804216456138L, (long)l3);
                _4k.b("e", (Object)this, (Object)objectArray3, -5030306682891459848L, (long)l3);
            }
        }
        catch (MatchException matchException) {
            throw _4k.a(matchException);
        }
    }

    public _4k(RenderPipeline renderPipeline, long l2, RenderPipeline renderPipeline2) {
        long l3 = (l2 = a ^ l2) ^ 0x14AE6191CE97L;
        this.cfr_renamed_208 = new _6N(renderPipeline, l3);
        this.cfr_renamed_2 = new _6N(renderPipeline2, l3);
        this.cfr_renamed_24 = renderPipeline;
        this.cfr_renamed_6 = renderPipeline2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                block13: {
                    _4k.a = l.a(5319617078922799522L, 6241475811083977239L, MethodHandles.lookup().lookupClass()).a(129954770385514L);
                    var15 = _4k.a ^ 136089088335454L;
                    _4k.e = new Object[117];
                    _4k.f = new String[117];
                    _4k.a();
                    if (_4k.cfr_renamed_4() != null) {
                        _4k.cfr_renamed_2("ep3OGb");
                    }
                    var12_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var15 >>> 56);
                    for (var13_2 = 1; var13_2 < 8; ++var13_2) {
                        v2 = v2;
                        v2[var13_2] = (byte)(var15 << var13_2 * 8 >>> 56);
                    }
                    break block13;
lbl18:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var12_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var14_4 = var12_1.doFinal("\u00a8B\u000f4\u00b3\u00fa\u0001\u0080/\u00d2\u00f0\u0081\u008e\u00ac\u0088\u008a\na\u000e\u0002y\u00d2\u00c4\u00bc\u00cas\u00bd\u00b6\u00a4D\u00d5\u00aa".getBytes("ISO-8859-1"));
                ** while (true)
                var11_3 = _4k.a(var14_4).intern();
                _4k.d = new HashMap<K, V>(13);
                var0_5 = Cipher.getInstance("DES/CBC/NoPadding");
                v3 = SecretKeyFactory.getInstance("DES");
                v4 = new byte[8];
                v5 = v4;
                v4[0] = (byte)(var15 >>> 56);
                for (var1_6 = 1; var1_6 < 8; ++var1_6) {
                    v5 = v5;
                    v5[var1_6] = (byte)(var15 << var1_6 * 8 >>> 56);
                }
                var0_5.init(2, (Key)v3.generateSecret(new DESKeySpec(v5)), new IvParameterSpec(new byte[8]));
                var6_7 = new long[13];
                var3_8 = 0;
                var4_9 = "i_>\"O\u00c2\u001f\u00c9?i\u008es\u0097\u007f\u00c7\u001a\u00f2\u00c5\u00fc\u0016\u000b1 \u00ebj\u000f\u00f9k\u00d9\u00e9\u00d98\u00cd\u0005\u0098\u00e4\u00c8`\u00e9\u00ae\u00ae\u0099\u0093\u00fa\u0016\"\u00c1\u00df\b^1N\u00aa-\u0083mz\u0095l\u00e1\u00af\u00986\u00a8\u00dbn\u00f5\u001d\u00dfU\u00c1\u0010`B+\u00f1*\n\u00eei\u0099\u00e6\u0000\u0091U4)\u00d3";
                var5_10 = "i_>\"O\u00c2\u001f\u00c9?i\u008es\u0097\u007f\u00c7\u001a\u00f2\u00c5\u00fc\u0016\u000b1 \u00ebj\u000f\u00f9k\u00d9\u00e9\u00d98\u00cd\u0005\u0098\u00e4\u00c8`\u00e9\u00ae\u00ae\u0099\u0093\u00fa\u0016\"\u00c1\u00df\b^1N\u00aa-\u0083mz\u0095l\u00e1\u00af\u00986\u00a8\u00dbn\u00f5\u001d\u00dfU\u00c1\u0010`B+\u00f1*\n\u00eei\u0099\u00e6\u0000\u0091U4)\u00d3".length();
                var2_11 = 0;
                while (true) {
                    var7_12 = var4_9.substring(var2_11, var2_11 += 8).getBytes("ISO-8859-1");
                    v6 = var6_7;
                    v7 = var3_8++;
                    v8 = ((long)var7_12[0] & 255L) << 56 | ((long)var7_12[1] & 255L) << 48 | ((long)var7_12[2] & 255L) << 40 | ((long)var7_12[3] & 255L) << 32 | ((long)var7_12[4] & 255L) << 24 | ((long)var7_12[5] & 255L) << 16 | ((long)var7_12[6] & 255L) << 8 | (long)var7_12[7] & 255L;
                    v9 = -1;
                    break block11;
                    break;
                }
lbl49:
                // 1 sources

                while (true) {
                    v6[v7] = v10;
                    if (var2_11 < var5_10) ** continue;
                    var4_9 = "\f\u001d\u009aF\r\u0000LA\u00b0\u0095g\u00d86\u00c8\u0018R";
                    var5_10 = "\f\u001d\u009aF\r\u0000LA\u00b0\u0095g\u00d86\u00c8\u0018R".length();
                    var2_11 = 0;
                    while (true) {
                        var7_12 = var4_9.substring(var2_11, var2_11 += 8).getBytes("ISO-8859-1");
                        v6 = var6_7;
                        v7 = var3_8++;
                        v8 = ((long)var7_12[0] & 255L) << 56 | ((long)var7_12[1] & 255L) << 48 | ((long)var7_12[2] & 255L) << 40 | ((long)var7_12[3] & 255L) << 32 | ((long)var7_12[4] & 255L) << 24 | ((long)var7_12[5] & 255L) << 16 | ((long)var7_12[6] & 255L) << 8 | (long)var7_12[7] & 255L;
                        v9 = 0;
                        break block11;
                        break;
                    }
                    break;
                }
lbl62:
                // 1 sources

                while (true) {
                    v6[v7] = v10;
                    if (var2_11 < var5_10) ** continue;
                    break block12;
                    break;
                }
            }
            var8_13 = v8;
            var10_14 = var0_5.doFinal(new byte[]{(byte)(var8_13 >>> 56), (byte)(var8_13 >>> 48), (byte)(var8_13 >>> 40), (byte)(var8_13 >>> 32), (byte)(var8_13 >>> 24), (byte)(var8_13 >>> 16), (byte)(var8_13 >>> 8), (byte)var8_13});
            v10 = ((long)var10_14[0] & 255L) << 56 | ((long)var10_14[1] & 255L) << 48 | ((long)var10_14[2] & 255L) << 40 | ((long)var10_14[3] & 255L) << 32 | ((long)var10_14[4] & 255L) << 24 | ((long)var10_14[5] & 255L) << 16 | ((long)var10_14[6] & 255L) << 8 | (long)var10_14[7] & 255L;
            switch (v9) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl75:
                // 1 sources

                ** continue;
            }
        }
        _4k.b = var6_7;
        _4k.c = new Integer[13];
        _4k.cfr_renamed_7 = new Matrix4f();
        _4k.cfr_renamed_5 = new class_11278(var11_3, -10.0f, 100.0f, true);
        _4k.cfr_renamed_1 = new Matrix4f();
        _4k.cfr_renamed_0 = new Matrix4f();
        _4k.cfr_renamed_9 = new Vector4f();
        _4k.b("\u00f1", (boolean)_4k.a("k", (int)19717, (long)(7835310583969284601L ^ var15)), (long)-5658104391050126110L, (long)var15);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void cfr_renamed_1(Object[] var1_1) {
        block117: {
            block151: {
                block148: {
                    block150: {
                        block149: {
                            block145: {
                                block147: {
                                    block146: {
                                        block142: {
                                            block144: {
                                                block143: {
                                                    block139: {
                                                        block141: {
                                                            block140: {
                                                                block136: {
                                                                    block138: {
                                                                        block137: {
                                                                            block133: {
                                                                                block135: {
                                                                                    block134: {
                                                                                        block130: {
                                                                                            block132: {
                                                                                                block131: {
                                                                                                    block127: {
                                                                                                        block129: {
                                                                                                            block128: {
                                                                                                                block124: {
                                                                                                                    block126: {
                                                                                                                        block125: {
                                                                                                                            block121: {
                                                                                                                                block123: {
                                                                                                                                    block122: {
                                                                                                                                        block118: {
                                                                                                                                            block120: {
                                                                                                                                                block119: {
                                                                                                                                                    block115: {
                                                                                                                                                        var4_2 = (Double)var1_1[0];
                                                                                                                                                        var6_3 = (Double)var1_1[1];
                                                                                                                                                        var8_4 = (Double)var1_1[2];
                                                                                                                                                        var10_5 = (Double)var1_1[3];
                                                                                                                                                        var12_6 = (Double)var1_1[4];
                                                                                                                                                        var14_7 = (Double)var1_1[5];
                                                                                                                                                        var16_8 = (Long)var1_1[6];
                                                                                                                                                        var3_9 = (_8B)var1_1[7];
                                                                                                                                                        var2_10 = (Integer)var1_1[8];
                                                                                                                                                        v0 = var16_8 = _4k.a ^ var16_8;
                                                                                                                                                        var18_11 = v0 ^ 88836673531699L;
                                                                                                                                                        var20_12 = v0 ^ 67584696482146L;
                                                                                                                                                        var22_13 = v0 ^ 110580102166212L;
                                                                                                                                                        var24_14 = v0 ^ 56818809984514L;
                                                                                                                                                        var26_15 = v0 ^ 100528697478044L;
                                                                                                                                                        var28_16 = v0 ^ 48353721671146L;
                                                                                                                                                        v1 = new Object[3];
                                                                                                                                                        v1[2] = var20_12;
                                                                                                                                                        v1[1] = (int)_4k.a("k", (int)10675, (long)(1924401410204374203L ^ var16_8));
                                                                                                                                                        v1[0] = (int)_4k.a("k", (int)21814, (long)(4747024765012928570L ^ var16_8));
                                                                                                                                                        _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)4649622391198246785L, (long)var16_8), (Object)v1, (long)4647844454923011814L, (long)var16_8);
                                                                                                                                                        v2 = new Object[4];
                                                                                                                                                        v2[3] = var8_4;
                                                                                                                                                        v2[2] = var6_3;
                                                                                                                                                        v2[1] = var18_11;
                                                                                                                                                        v2[0] = var4_2;
                                                                                                                                                        v3 = new Object[2];
                                                                                                                                                        v3[1] = var3_9;
                                                                                                                                                        v3[0] = var22_13;
                                                                                                                                                        v4 = new Object[1];
                                                                                                                                                        v4[0] = var24_14;
                                                                                                                                                        var31_17 = _4k.b("e", (Object)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)4649622391198246785L, (long)var16_8), (Object)v2, (long)4649111763951037640L, (long)var16_8), (Object)v3, (long)4656295245451580680L, (long)var16_8), (Object)v4, (long)4650146563371302171L, (long)var16_8);
                                                                                                                                                        v5 = new Object[4];
                                                                                                                                                        v5[3] = var14_7;
                                                                                                                                                        v5[2] = var6_3;
                                                                                                                                                        v5[1] = var18_11;
                                                                                                                                                        v5[0] = var4_2;
                                                                                                                                                        v6 = new Object[2];
                                                                                                                                                        v6[1] = var3_9;
                                                                                                                                                        v6[0] = var22_13;
                                                                                                                                                        v7 = new Object[1];
                                                                                                                                                        v7[0] = var24_14;
                                                                                                                                                        var32_18 = _4k.b("e", (Object)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)4649622391198246785L, (long)var16_8), (Object)v5, (long)4649111763951037640L, (long)var16_8), (Object)v6, (long)4656295245451580680L, (long)var16_8), (Object)v7, (long)4650146563371302171L, (long)var16_8);
                                                                                                                                                        v8 = new Object[4];
                                                                                                                                                        v8[3] = var8_4;
                                                                                                                                                        v8[2] = var6_3;
                                                                                                                                                        v8[1] = var18_11;
                                                                                                                                                        v8[0] = var10_5;
                                                                                                                                                        v9 = new Object[2];
                                                                                                                                                        v9[1] = var3_9;
                                                                                                                                                        v9[0] = var22_13;
                                                                                                                                                        v10 = new Object[1];
                                                                                                                                                        v10[0] = var24_14;
                                                                                                                                                        var33_19 = _4k.b("e", (Object)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)4649622391198246785L, (long)var16_8), (Object)v8, (long)4649111763951037640L, (long)var16_8), (Object)v9, (long)4656295245451580680L, (long)var16_8), (Object)v10, (long)4650146563371302171L, (long)var16_8);
                                                                                                                                                        v11 = new Object[4];
                                                                                                                                                        v11[3] = var14_7;
                                                                                                                                                        v11[2] = var6_3;
                                                                                                                                                        v11[1] = var18_11;
                                                                                                                                                        v11[0] = var10_5;
                                                                                                                                                        v12 = new Object[2];
                                                                                                                                                        v12[1] = var3_9;
                                                                                                                                                        v12[0] = var22_13;
                                                                                                                                                        v13 = new Object[1];
                                                                                                                                                        v13[0] = var24_14;
                                                                                                                                                        var34_20 = _4k.b("e", (Object)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)4649622391198246785L, (long)var16_8), (Object)v11, (long)4649111763951037640L, (long)var16_8), (Object)v12, (long)4656295245451580680L, (long)var16_8), (Object)v13, (long)4650146563371302171L, (long)var16_8);
                                                                                                                                                        v14 = new Object[4];
                                                                                                                                                        v14[3] = var8_4;
                                                                                                                                                        v14[2] = var12_6;
                                                                                                                                                        v14[1] = var18_11;
                                                                                                                                                        v14[0] = var4_2;
                                                                                                                                                        v15 = new Object[2];
                                                                                                                                                        v15[1] = var3_9;
                                                                                                                                                        v15[0] = var22_13;
                                                                                                                                                        v16 = new Object[1];
                                                                                                                                                        v16[0] = var24_14;
                                                                                                                                                        var35_21 = _4k.b("e", (Object)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)4649622391198246785L, (long)var16_8), (Object)v14, (long)4649111763951037640L, (long)var16_8), (Object)v15, (long)4656295245451580680L, (long)var16_8), (Object)v16, (long)4650146563371302171L, (long)var16_8);
                                                                                                                                                        var30_22 = _87.cfr_renamed_7();
                                                                                                                                                        v17 = new Object[4];
                                                                                                                                                        v17[3] = var14_7;
                                                                                                                                                        v17[2] = var12_6;
                                                                                                                                                        v17[1] = var18_11;
                                                                                                                                                        v17[0] = var4_2;
                                                                                                                                                        v18 = new Object[2];
                                                                                                                                                        v18[1] = var3_9;
                                                                                                                                                        v18[0] = var22_13;
                                                                                                                                                        v19 = new Object[1];
                                                                                                                                                        v19[0] = var24_14;
                                                                                                                                                        var36_23 = _4k.b("e", (Object)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)4649622391198246785L, (long)var16_8), (Object)v17, (long)4649111763951037640L, (long)var16_8), (Object)v18, (long)4656295245451580680L, (long)var16_8), (Object)v19, (long)4650146563371302171L, (long)var16_8);
                                                                                                                                                        v20 = new Object[4];
                                                                                                                                                        v20[3] = var8_4;
                                                                                                                                                        v20[2] = var12_6;
                                                                                                                                                        v20[1] = var18_11;
                                                                                                                                                        v20[0] = var10_5;
                                                                                                                                                        v21 = new Object[2];
                                                                                                                                                        v21[1] = var3_9;
                                                                                                                                                        v21[0] = var22_13;
                                                                                                                                                        v22 = new Object[1];
                                                                                                                                                        v22[0] = var24_14;
                                                                                                                                                        var37_24 = _4k.b("e", (Object)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)4649622391198246785L, (long)var16_8), (Object)v20, (long)4649111763951037640L, (long)var16_8), (Object)v21, (long)4656295245451580680L, (long)var16_8), (Object)v22, (long)4650146563371302171L, (long)var16_8);
                                                                                                                                                        v23 = new Object[4];
                                                                                                                                                        v23[3] = var14_7;
                                                                                                                                                        v23[2] = var12_6;
                                                                                                                                                        v23[1] = var18_11;
                                                                                                                                                        v23[0] = var10_5;
                                                                                                                                                        v24 = new Object[2];
                                                                                                                                                        v24[1] = var3_9;
                                                                                                                                                        v24[0] = var22_13;
                                                                                                                                                        v25 = new Object[1];
                                                                                                                                                        v25[0] = var24_14;
                                                                                                                                                        var38_25 = _4k.b("e", (Object)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)4649622391198246785L, (long)var16_8), (Object)v23, (long)4649111763951037640L, (long)var16_8), (Object)v24, (long)4656295245451580680L, (long)var16_8), (Object)v25, (long)4650146563371302171L, (long)var16_8);
                                                                                                                                                        try {
                                                                                                                                                            block116: {
                                                                                                                                                                try {
                                                                                                                                                                    try {
                                                                                                                                                                        v26 /* !! */  = var2_10;
                                                                                                                                                                        if (var30_22 == 0) break block115;
                                                                                                                                                                        if (v26 /* !! */  != 0) break block116;
                                                                                                                                                                    }
                                                                                                                                                                    catch (MatchException v27) {
                                                                                                                                                                        throw _4k.a(v27);
                                                                                                                                                                    }
                                                                                                                                                                    v28 = new Object[3];
                                                                                                                                                                    v28[2] = var26_15;
                                                                                                                                                                    v28[1] = (int)var35_21;
                                                                                                                                                                    v28[0] = (int)var31_17;
                                                                                                                                                                    _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)4649622391198246785L, (long)var16_8), (Object)v28, (long)4647951756251573199L, (long)var16_8);
                                                                                                                                                                    v29 = new Object[3];
                                                                                                                                                                    v29[2] = var26_15;
                                                                                                                                                                    v29[1] = (int)var36_23;
                                                                                                                                                                    v29[0] = (int)var32_18;
                                                                                                                                                                    _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)4649622391198246785L, (long)var16_8), (Object)v29, (long)4647951756251573199L, (long)var16_8);
                                                                                                                                                                    v30 = new Object[3];
                                                                                                                                                                    v30[2] = var26_15;
                                                                                                                                                                    v30[1] = (int)var37_24;
                                                                                                                                                                    v30[0] = (int)var33_19;
                                                                                                                                                                    _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)4649622391198246785L, (long)var16_8), (Object)v30, (long)4647951756251573199L, (long)var16_8);
                                                                                                                                                                    v31 = new Object[3];
                                                                                                                                                                    v31[2] = var26_15;
                                                                                                                                                                    v31[1] = (int)var38_25;
                                                                                                                                                                    v31[0] = (int)var34_20;
                                                                                                                                                                    _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)4649622391198246785L, (long)var16_8), (Object)v31, (long)4647951756251573199L, (long)var16_8);
                                                                                                                                                                    v32 = new Object[3];
                                                                                                                                                                    v32[2] = var26_15;
                                                                                                                                                                    v32[1] = (int)var32_18;
                                                                                                                                                                    v32[0] = (int)var31_17;
                                                                                                                                                                    _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)4649622391198246785L, (long)var16_8), (Object)v32, (long)4647951756251573199L, (long)var16_8);
                                                                                                                                                                    v33 = new Object[3];
                                                                                                                                                                    v33[2] = var26_15;
                                                                                                                                                                    v33[1] = (int)var34_20;
                                                                                                                                                                    v33[0] = (int)var33_19;
                                                                                                                                                                    _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)4649622391198246785L, (long)var16_8), (Object)v33, (long)4647951756251573199L, (long)var16_8);
                                                                                                                                                                    v34 = new Object[3];
                                                                                                                                                                    v34[2] = var26_15;
                                                                                                                                                                    v34[1] = (int)var33_19;
                                                                                                                                                                    v34[0] = (int)var31_17;
                                                                                                                                                                    _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)4649622391198246785L, (long)var16_8), (Object)v34, (long)4647951756251573199L, (long)var16_8);
                                                                                                                                                                    v35 = new Object[3];
                                                                                                                                                                    v35[2] = var26_15;
                                                                                                                                                                    v35[1] = (int)var34_20;
                                                                                                                                                                    v35[0] = (int)var32_18;
                                                                                                                                                                    _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)4649622391198246785L, (long)var16_8), (Object)v35, (long)4647951756251573199L, (long)var16_8);
                                                                                                                                                                    v36 = new Object[3];
                                                                                                                                                                    v36[2] = var26_15;
                                                                                                                                                                    v36[1] = (int)var36_23;
                                                                                                                                                                    v36[0] = (int)var35_21;
                                                                                                                                                                    _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)4649622391198246785L, (long)var16_8), (Object)v36, (long)4647951756251573199L, (long)var16_8);
                                                                                                                                                                    v37 = new Object[3];
                                                                                                                                                                    v37[2] = var26_15;
                                                                                                                                                                    v37[1] = (int)var38_25;
                                                                                                                                                                    v37[0] = (int)var37_24;
                                                                                                                                                                    _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)4649622391198246785L, (long)var16_8), (Object)v37, (long)4647951756251573199L, (long)var16_8);
                                                                                                                                                                    v38 = new Object[3];
                                                                                                                                                                    v38[2] = var26_15;
                                                                                                                                                                    v38[1] = (int)var37_24;
                                                                                                                                                                    v38[0] = (int)var35_21;
                                                                                                                                                                    _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)4649622391198246785L, (long)var16_8), (Object)v38, (long)4647951756251573199L, (long)var16_8);
                                                                                                                                                                    v39 = new Object[3];
                                                                                                                                                                    v39[2] = var26_15;
                                                                                                                                                                    v39[1] = (int)var38_25;
                                                                                                                                                                    v39[0] = (int)var36_23;
                                                                                                                                                                    _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)4649622391198246785L, (long)var16_8), (Object)v39, (long)4647951756251573199L, (long)var16_8);
                                                                                                                                                                    if (var16_8 <= 0L || var30_22 != 0) break block117;
                                                                                                                                                                }
                                                                                                                                                                catch (MatchException v40) {
                                                                                                                                                                    throw _4k.a(v40);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            v41 = new Object[3];
                                                                                                                                                            v41[2] = (int)_4k.a("k", (int)28656, (long)(4488373201987719930L ^ var16_8));
                                                                                                                                                            v41[1] = var28_16;
                                                                                                                                                            v41[0] = var2_10;
                                                                                                                                                            v26 /* !! */  = (int)_4k.b("\u00a4", (Object)v41, (long)4649208115415690484L, (long)var16_8);
                                                                                                                                                        }
                                                                                                                                                        catch (MatchException v42) {
                                                                                                                                                            throw _4k.a(v42);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                try {
                                                                                                                                                                    if (var30_22 == 0) break block118;
                                                                                                                                                                    if (v26 /* !! */  == 0) break block119;
                                                                                                                                                                }
                                                                                                                                                                catch (MatchException v43) {
                                                                                                                                                                    throw _4k.a(v43);
                                                                                                                                                                }
                                                                                                                                                                v44 = new Object[3];
                                                                                                                                                                v44[2] = (int)_4k.a("k", (int)21814, (long)(4747024765012928570L ^ var16_8));
                                                                                                                                                                v44[1] = var28_16;
                                                                                                                                                                v44[0] = var2_10;
                                                                                                                                                                v26 /* !! */  = (int)_4k.b("\u00a4", (Object)v44, (long)4649208115415690484L, (long)var16_8);
                                                                                                                                                                v45 = var30_22;
                                                                                                                                                                if (var16_8 > 0L) {
                                                                                                                                                                    if (v45 == 0) break block118;
                                                                                                                                                                }
                                                                                                                                                                ** GOTO lbl309
                                                                                                                                                            }
                                                                                                                                                            catch (MatchException v46) {
                                                                                                                                                                throw _4k.a(v46);
                                                                                                                                                            }
                                                                                                                                                            if (var16_8 < 0L) break block120;
                                                                                                                                                            if (v26 /* !! */  == 0) break block119;
                                                                                                                                                        }
                                                                                                                                                        catch (MatchException v47) {
                                                                                                                                                            throw _4k.a(v47);
                                                                                                                                                        }
                                                                                                                                                        v48 = new Object[3];
                                                                                                                                                        v48[2] = var26_15;
                                                                                                                                                        v48[1] = (int)var35_21;
                                                                                                                                                        v48[0] = (int)var31_17;
                                                                                                                                                        _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)4649622391198246785L, (long)var16_8), (Object)v48, (long)4647951756251573199L, (long)var16_8);
                                                                                                                                                    }
                                                                                                                                                    catch (MatchException v49) {
                                                                                                                                                        throw _4k.a(v49);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                v50 = var2_10;
                                                                                                                                            }
                                                                                                                                            v51 = new Object[3];
                                                                                                                                            v51[2] = (int)_4k.a("k", (int)28656, (long)(4488373201987719930L ^ var16_8));
                                                                                                                                            v51[1] = var28_16;
                                                                                                                                            v51[0] = v50;
                                                                                                                                            v26 /* !! */  = (int)_4k.b("\u00a4", (Object)v51, (long)4649208115415690484L, (long)var16_8);
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        v45 = var30_22;
lbl309:
                                                                                                                                                        // 2 sources

                                                                                                                                                        if (v45 == 0) break block121;
                                                                                                                                                        if (v26 /* !! */  == 0) break block122;
                                                                                                                                                    }
                                                                                                                                                    catch (MatchException v52) {
                                                                                                                                                        throw _4k.a(v52);
                                                                                                                                                    }
                                                                                                                                                    v53 = new Object[3];
                                                                                                                                                    v53[2] = (int)_4k.a("k", (int)16851, (long)(7132530158508342484L ^ var16_8));
                                                                                                                                                    v53[1] = var28_16;
                                                                                                                                                    v53[0] = var2_10;
                                                                                                                                                    v26 /* !! */  = (int)_4k.b("\u00a4", (Object)v53, (long)4649208115415690484L, (long)var16_8);
                                                                                                                                                    v54 = var30_22;
                                                                                                                                                    if (var16_8 > 0L) {
                                                                                                                                                        if (v54 == 0) break block121;
                                                                                                                                                    }
                                                                                                                                                    ** GOTO lbl356
                                                                                                                                                }
                                                                                                                                                catch (MatchException v55) {
                                                                                                                                                    throw _4k.a(v55);
                                                                                                                                                }
                                                                                                                                                if (var16_8 < 0L) break block123;
                                                                                                                                                if (v26 /* !! */  == 0) break block122;
                                                                                                                                            }
                                                                                                                                            catch (MatchException v56) {
                                                                                                                                                throw _4k.a(v56);
                                                                                                                                            }
                                                                                                                                            v57 = new Object[3];
                                                                                                                                            v57[2] = var26_15;
                                                                                                                                            v57[1] = (int)var36_23;
                                                                                                                                            v57[0] = (int)var32_18;
                                                                                                                                            _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)4649622391198246785L, (long)var16_8), (Object)v57, (long)4647951756251573199L, (long)var16_8);
                                                                                                                                        }
                                                                                                                                        catch (MatchException v58) {
                                                                                                                                            throw _4k.a(v58);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    v59 = var2_10;
                                                                                                                                }
                                                                                                                                v60 = new Object[3];
                                                                                                                                v60[2] = (int)_4k.a("k", (int)895, (long)(8101966354809863792L ^ var16_8));
                                                                                                                                v60[1] = var28_16;
                                                                                                                                v60[0] = v59;
                                                                                                                                v26 /* !! */  = (int)_4k.b("\u00a4", (Object)v60, (long)4649208115415690484L, (long)var16_8);
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            v54 = var30_22;
lbl356:
                                                                                                                                            // 2 sources

                                                                                                                                            if (v54 == 0) break block124;
                                                                                                                                            if (v26 /* !! */  == 0) break block125;
                                                                                                                                        }
                                                                                                                                        catch (MatchException v61) {
                                                                                                                                            throw _4k.a(v61);
                                                                                                                                        }
                                                                                                                                        v62 = new Object[3];
                                                                                                                                        v62[2] = (int)_4k.a("k", (int)21814, (long)(4747024765012928570L ^ var16_8));
                                                                                                                                        v62[1] = var28_16;
                                                                                                                                        v62[0] = var2_10;
                                                                                                                                        v26 /* !! */  = (int)_4k.b("\u00a4", (Object)v62, (long)4649208115415690484L, (long)var16_8);
                                                                                                                                        v63 = var30_22;
                                                                                                                                        if (var16_8 > 0L) {
                                                                                                                                            if (v63 == 0) break block124;
                                                                                                                                        }
                                                                                                                                        ** GOTO lbl403
                                                                                                                                    }
                                                                                                                                    catch (MatchException v64) {
                                                                                                                                        throw _4k.a(v64);
                                                                                                                                    }
                                                                                                                                    if (var16_8 <= 0L) break block126;
                                                                                                                                    if (v26 /* !! */  == 0) break block125;
                                                                                                                                }
                                                                                                                                catch (MatchException v65) {
                                                                                                                                    throw _4k.a(v65);
                                                                                                                                }
                                                                                                                                v66 = new Object[3];
                                                                                                                                v66[2] = var26_15;
                                                                                                                                v66[1] = (int)var37_24;
                                                                                                                                v66[0] = (int)var33_19;
                                                                                                                                _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)4649622391198246785L, (long)var16_8), (Object)v66, (long)4647951756251573199L, (long)var16_8);
                                                                                                                            }
                                                                                                                            catch (MatchException v67) {
                                                                                                                                throw _4k.a(v67);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        v68 = var2_10;
                                                                                                                    }
                                                                                                                    v69 = new Object[3];
                                                                                                                    v69[2] = (int)_4k.a("k", (int)895, (long)(8101966354809863792L ^ var16_8));
                                                                                                                    v69[1] = var28_16;
                                                                                                                    v69[0] = v68;
                                                                                                                    v26 /* !! */  = (int)_4k.b("\u00a4", (Object)v69, (long)4649208115415690484L, (long)var16_8);
                                                                                                                }
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                v63 = var30_22;
lbl403:
                                                                                                                                // 2 sources

                                                                                                                                if (v63 == 0) break block127;
                                                                                                                                if (v26 /* !! */  == 0) break block128;
                                                                                                                            }
                                                                                                                            catch (MatchException v70) {
                                                                                                                                throw _4k.a(v70);
                                                                                                                            }
                                                                                                                            v71 = new Object[3];
                                                                                                                            v71[2] = (int)_4k.a("k", (int)16851, (long)(7132530158508342484L ^ var16_8));
                                                                                                                            v71[1] = var28_16;
                                                                                                                            v71[0] = var2_10;
                                                                                                                            v26 /* !! */  = (int)_4k.b("\u00a4", (Object)v71, (long)4649208115415690484L, (long)var16_8);
                                                                                                                            v72 = var30_22;
                                                                                                                            if (var16_8 > 0L) {
                                                                                                                                if (v72 == 0) break block127;
                                                                                                                            }
                                                                                                                            ** GOTO lbl450
                                                                                                                        }
                                                                                                                        catch (MatchException v73) {
                                                                                                                            throw _4k.a(v73);
                                                                                                                        }
                                                                                                                        if (var16_8 <= 0L) break block129;
                                                                                                                        if (v26 /* !! */  == 0) break block128;
                                                                                                                    }
                                                                                                                    catch (MatchException v74) {
                                                                                                                        throw _4k.a(v74);
                                                                                                                    }
                                                                                                                    v75 = new Object[3];
                                                                                                                    v75[2] = var26_15;
                                                                                                                    v75[1] = (int)var38_25;
                                                                                                                    v75[0] = (int)var34_20;
                                                                                                                    _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)4649622391198246785L, (long)var16_8), (Object)v75, (long)4647951756251573199L, (long)var16_8);
                                                                                                                }
                                                                                                                catch (MatchException v76) {
                                                                                                                    throw _4k.a(v76);
                                                                                                                }
                                                                                                            }
                                                                                                            v77 = var2_10;
                                                                                                        }
                                                                                                        v78 = new Object[3];
                                                                                                        v78[2] = (int)_4k.a("k", (int)28656, (long)(4488373201987719930L ^ var16_8));
                                                                                                        v78[1] = var28_16;
                                                                                                        v78[0] = v77;
                                                                                                        v26 /* !! */  = (int)_4k.b("\u00a4", (Object)v78, (long)4649208115415690484L, (long)var16_8);
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    v72 = var30_22;
lbl450:
                                                                                                                    // 2 sources

                                                                                                                    if (v72 == 0) break block130;
                                                                                                                    if (v26 /* !! */  == 0) break block131;
                                                                                                                }
                                                                                                                catch (MatchException v79) {
                                                                                                                    throw _4k.a(v79);
                                                                                                                }
                                                                                                                v80 = new Object[3];
                                                                                                                v80[2] = 4;
                                                                                                                v80[1] = var28_16;
                                                                                                                v80[0] = var2_10;
                                                                                                                v26 /* !! */  = (int)_4k.b("\u00a4", (Object)v80, (long)4649208115415690484L, (long)var16_8);
                                                                                                                v81 = var30_22;
                                                                                                                if (var16_8 > 0L) {
                                                                                                                    if (v81 == 0) break block130;
                                                                                                                }
                                                                                                                ** GOTO lbl497
                                                                                                            }
                                                                                                            catch (MatchException v82) {
                                                                                                                throw _4k.a(v82);
                                                                                                            }
                                                                                                            if (var16_8 < 0L) break block132;
                                                                                                            if (v26 /* !! */  == 0) break block131;
                                                                                                        }
                                                                                                        catch (MatchException v83) {
                                                                                                            throw _4k.a(v83);
                                                                                                        }
                                                                                                        v84 = new Object[3];
                                                                                                        v84[2] = var26_15;
                                                                                                        v84[1] = (int)var32_18;
                                                                                                        v84[0] = (int)var31_17;
                                                                                                        _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)4649622391198246785L, (long)var16_8), (Object)v84, (long)4647951756251573199L, (long)var16_8);
                                                                                                    }
                                                                                                    catch (MatchException v85) {
                                                                                                        throw _4k.a(v85);
                                                                                                    }
                                                                                                }
                                                                                                v86 = var2_10;
                                                                                            }
                                                                                            v87 = new Object[3];
                                                                                            v87[2] = (int)_4k.a("k", (int)895, (long)(8101966354809863792L ^ var16_8));
                                                                                            v87[1] = var28_16;
                                                                                            v87[0] = v86;
                                                                                            v26 /* !! */  = (int)_4k.b("\u00a4", (Object)v87, (long)4649208115415690484L, (long)var16_8);
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        v81 = var30_22;
lbl497:
                                                                                                        // 2 sources

                                                                                                        if (v81 == 0) break block133;
                                                                                                        if (v26 /* !! */  == 0) break block134;
                                                                                                    }
                                                                                                    catch (MatchException v88) {
                                                                                                        throw _4k.a(v88);
                                                                                                    }
                                                                                                    v89 = new Object[3];
                                                                                                    v89[2] = 4;
                                                                                                    v89[1] = var28_16;
                                                                                                    v89[0] = var2_10;
                                                                                                    v26 /* !! */  = (int)_4k.b("\u00a4", (Object)v89, (long)4649208115415690484L, (long)var16_8);
                                                                                                    v90 = var30_22;
                                                                                                    if (var16_8 >= 0L) {
                                                                                                        if (v90 == 0) break block133;
                                                                                                    }
                                                                                                    ** GOTO lbl544
                                                                                                }
                                                                                                catch (MatchException v91) {
                                                                                                    throw _4k.a(v91);
                                                                                                }
                                                                                                if (var16_8 < 0L) break block135;
                                                                                                if (v26 /* !! */  == 0) break block134;
                                                                                            }
                                                                                            catch (MatchException v92) {
                                                                                                throw _4k.a(v92);
                                                                                            }
                                                                                            v93 = new Object[3];
                                                                                            v93[2] = var26_15;
                                                                                            v93[1] = (int)var34_20;
                                                                                            v93[0] = (int)var33_19;
                                                                                            _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)4649622391198246785L, (long)var16_8), (Object)v93, (long)4647951756251573199L, (long)var16_8);
                                                                                        }
                                                                                        catch (MatchException v94) {
                                                                                            throw _4k.a(v94);
                                                                                        }
                                                                                    }
                                                                                    v95 = var2_10;
                                                                                }
                                                                                v96 = new Object[3];
                                                                                v96[2] = (int)_4k.a("k", (int)21814, (long)(4747024765012928570L ^ var16_8));
                                                                                v96[1] = var28_16;
                                                                                v96[0] = v95;
                                                                                v26 /* !! */  = (int)_4k.b("\u00a4", (Object)v96, (long)4649208115415690484L, (long)var16_8);
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            v90 = var30_22;
lbl544:
                                                                                            // 2 sources

                                                                                            if (v90 == 0) break block136;
                                                                                            if (v26 /* !! */  == 0) break block137;
                                                                                        }
                                                                                        catch (MatchException v97) {
                                                                                            throw _4k.a(v97);
                                                                                        }
                                                                                        v98 = new Object[3];
                                                                                        v98[2] = 4;
                                                                                        v98[1] = var28_16;
                                                                                        v98[0] = var2_10;
                                                                                        v26 /* !! */  = (int)_4k.b("\u00a4", (Object)v98, (long)4649208115415690484L, (long)var16_8);
                                                                                        v99 = var30_22;
                                                                                        if (var16_8 > 0L) {
                                                                                            if (v99 == 0) break block136;
                                                                                        }
                                                                                        ** GOTO lbl591
                                                                                    }
                                                                                    catch (MatchException v100) {
                                                                                        throw _4k.a(v100);
                                                                                    }
                                                                                    if (var16_8 <= 0L) break block138;
                                                                                    if (v26 /* !! */  == 0) break block137;
                                                                                }
                                                                                catch (MatchException v101) {
                                                                                    throw _4k.a(v101);
                                                                                }
                                                                                v102 = new Object[3];
                                                                                v102[2] = var26_15;
                                                                                v102[1] = (int)var33_19;
                                                                                v102[0] = (int)var31_17;
                                                                                _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)4649622391198246785L, (long)var16_8), (Object)v102, (long)4647951756251573199L, (long)var16_8);
                                                                            }
                                                                            catch (MatchException v103) {
                                                                                throw _4k.a(v103);
                                                                            }
                                                                        }
                                                                        v104 = var2_10;
                                                                    }
                                                                    v105 = new Object[3];
                                                                    v105[2] = (int)_4k.a("k", (int)16851, (long)(7132530158508342484L ^ var16_8));
                                                                    v105[1] = var28_16;
                                                                    v105[0] = v104;
                                                                    v26 /* !! */  = (int)_4k.b("\u00a4", (Object)v105, (long)4649208115415690484L, (long)var16_8);
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                v99 = var30_22;
lbl591:
                                                                                // 2 sources

                                                                                if (v99 == 0) break block139;
                                                                                if (v26 /* !! */  == 0) break block140;
                                                                            }
                                                                            catch (MatchException v106) {
                                                                                throw _4k.a(v106);
                                                                            }
                                                                            v107 = new Object[3];
                                                                            v107[2] = 4;
                                                                            v107[1] = var28_16;
                                                                            v107[0] = var2_10;
                                                                            v26 /* !! */  = (int)_4k.b("\u00a4", (Object)v107, (long)4649208115415690484L, (long)var16_8);
                                                                            v108 = var30_22;
                                                                            if (var16_8 > 0L) {
                                                                                if (v108 == 0) break block139;
                                                                            }
                                                                            ** GOTO lbl638
                                                                        }
                                                                        catch (MatchException v109) {
                                                                            throw _4k.a(v109);
                                                                        }
                                                                        if (var16_8 < 0L) break block141;
                                                                        if (v26 /* !! */  == 0) break block140;
                                                                    }
                                                                    catch (MatchException v110) {
                                                                        throw _4k.a(v110);
                                                                    }
                                                                    v111 = new Object[3];
                                                                    v111[2] = var26_15;
                                                                    v111[1] = (int)var34_20;
                                                                    v111[0] = (int)var32_18;
                                                                    _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)4649622391198246785L, (long)var16_8), (Object)v111, (long)4647951756251573199L, (long)var16_8);
                                                                }
                                                                catch (MatchException v112) {
                                                                    throw _4k.a(v112);
                                                                }
                                                            }
                                                            v113 = var2_10;
                                                        }
                                                        v114 = new Object[3];
                                                        v114[2] = (int)_4k.a("k", (int)28656, (long)(4488373201987719930L ^ var16_8));
                                                        v114[1] = var28_16;
                                                        v114[0] = v113;
                                                        v26 /* !! */  = (int)_4k.b("\u00a4", (Object)v114, (long)4649208115415690484L, (long)var16_8);
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    v108 = var30_22;
lbl638:
                                                                    // 2 sources

                                                                    if (v108 == 0) break block142;
                                                                    if (v26 /* !! */  == 0) break block143;
                                                                }
                                                                catch (MatchException v115) {
                                                                    throw _4k.a(v115);
                                                                }
                                                                v116 = new Object[3];
                                                                v116[2] = 2;
                                                                v116[1] = var28_16;
                                                                v116[0] = var2_10;
                                                                v26 /* !! */  = (int)_4k.b("\u00a4", (Object)v116, (long)4649208115415690484L, (long)var16_8);
                                                                v117 = var30_22;
                                                                if (var16_8 >= 0L) {
                                                                    if (v117 == 0) break block142;
                                                                }
                                                                ** GOTO lbl685
                                                            }
                                                            catch (MatchException v118) {
                                                                throw _4k.a(v118);
                                                            }
                                                            if (var16_8 <= 0L) break block144;
                                                            if (v26 /* !! */  == 0) break block143;
                                                        }
                                                        catch (MatchException v119) {
                                                            throw _4k.a(v119);
                                                        }
                                                        v120 = new Object[3];
                                                        v120[2] = var26_15;
                                                        v120[1] = (int)var36_23;
                                                        v120[0] = (int)var35_21;
                                                        _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)4649622391198246785L, (long)var16_8), (Object)v120, (long)4647951756251573199L, (long)var16_8);
                                                    }
                                                    catch (MatchException v121) {
                                                        throw _4k.a(v121);
                                                    }
                                                }
                                                v122 = var2_10;
                                            }
                                            v123 = new Object[3];
                                            v123[2] = (int)_4k.a("k", (int)895, (long)(8101966354809863792L ^ var16_8));
                                            v123[1] = var28_16;
                                            v123[0] = v122;
                                            v26 /* !! */  = (int)_4k.b("\u00a4", (Object)v123, (long)4649208115415690484L, (long)var16_8);
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        v117 = var30_22;
lbl685:
                                                        // 2 sources

                                                        if (v117 == 0) break block145;
                                                        if (v26 /* !! */  == 0) break block146;
                                                    }
                                                    catch (MatchException v124) {
                                                        throw _4k.a(v124);
                                                    }
                                                    v125 = new Object[3];
                                                    v125[2] = 2;
                                                    v125[1] = var28_16;
                                                    v125[0] = var2_10;
                                                    v26 /* !! */  = (int)_4k.b("\u00a4", (Object)v125, (long)4649208115415690484L, (long)var16_8);
                                                    v126 = var30_22;
                                                    if (var16_8 > 0L) {
                                                        if (v126 == 0) break block145;
                                                    }
                                                    ** GOTO lbl732
                                                }
                                                catch (MatchException v127) {
                                                    throw _4k.a(v127);
                                                }
                                                if (var16_8 < 0L) break block147;
                                                if (v26 /* !! */  == 0) break block146;
                                            }
                                            catch (MatchException v128) {
                                                throw _4k.a(v128);
                                            }
                                            v129 = new Object[3];
                                            v129[2] = var26_15;
                                            v129[1] = (int)var38_25;
                                            v129[0] = (int)var37_24;
                                            _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)4649622391198246785L, (long)var16_8), (Object)v129, (long)4647951756251573199L, (long)var16_8);
                                        }
                                        catch (MatchException v130) {
                                            throw _4k.a(v130);
                                        }
                                    }
                                    v131 = var2_10;
                                }
                                v132 = new Object[3];
                                v132[2] = (int)_4k.a("k", (int)21814, (long)(4747024765012928570L ^ var16_8));
                                v132[1] = var28_16;
                                v132[0] = v131;
                                v26 /* !! */  = (int)_4k.b("\u00a4", (Object)v132, (long)4649208115415690484L, (long)var16_8);
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            v126 = var30_22;
lbl732:
                                            // 2 sources

                                            if (v126 == 0) break block148;
                                            if (v26 /* !! */  == 0) break block149;
                                        }
                                        catch (MatchException v133) {
                                            throw _4k.a(v133);
                                        }
                                        v134 = new Object[3];
                                        v134[2] = 2;
                                        v134[1] = var28_16;
                                        v134[0] = var2_10;
                                        v26 /* !! */  = (int)_4k.b("\u00a4", (Object)v134, (long)4649208115415690484L, (long)var16_8);
                                        v135 = var30_22;
                                        if (var16_8 >= 0L) {
                                            if (v135 == 0) break block148;
                                        }
                                        ** GOTO lbl778
                                    }
                                    catch (MatchException v136) {
                                        throw _4k.a(v136);
                                    }
                                    if (var16_8 < 0L) break block150;
                                    if (v26 /* !! */  == 0) break block149;
                                }
                                catch (MatchException v137) {
                                    throw _4k.a(v137);
                                }
                                v138 = new Object[3];
                                v138[2] = var26_15;
                                v138[1] = (int)var37_24;
                                v138[0] = (int)var35_21;
                                _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)4649622391198246785L, (long)var16_8), (Object)v138, (long)4647951756251573199L, (long)var16_8);
                            }
                            catch (MatchException v139) {
                                throw _4k.a(v139);
                            }
                        }
                        v140 = var2_10;
                    }
                    v141 = new Object[3];
                    v141[2] = (int)_4k.a("k", (int)16851, (long)(7132530158508342484L ^ var16_8));
                    v141[1] = var28_16;
                    v141[0] = v140;
                    v26 /* !! */  = (int)_4k.b("\u00a4", (Object)v141, (long)4649208115415690484L, (long)var16_8);
                }
                try {
                    try {
                        if (var16_8 <= 0L) break block151;
                        v135 = var30_22;
lbl778:
                        // 2 sources

                        if (v135 == 0) break block151;
                        if (v26 /* !! */  == 0) break block117;
                    }
                    catch (MatchException v142) {
                        throw _4k.a(v142);
                    }
                    v143 = new Object[3];
                    v143[2] = 2;
                    v143[1] = var28_16;
                    v143[0] = var2_10;
                    v26 /* !! */  = (int)_4k.b("\u00a4", (Object)v143, (long)4649208115415690484L, (long)var16_8);
                }
                catch (MatchException v144) {
                    throw _4k.a(v144);
                }
            }
            try {
                if (v26 /* !! */  != 0) {
                    v145 = new Object[3];
                    v145[2] = var26_15;
                    v145[1] = (int)var38_25;
                    v145[0] = (int)var36_23;
                    _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)4649622391198246785L, (long)var16_8), (Object)v145, (long)4647951756251573199L, (long)var16_8);
                }
            }
            catch (MatchException v146) {
                throw _4k.a(v146);
            }
        }
        try {
            if (var16_8 > 0L && _4w.cfr_renamed_8() == null) {
                _87.cfr_renamed_6(++var30_22);
            }
        }
        catch (MatchException v147) {
            throw _4k.a(v147);
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _4k.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _4k.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _4k.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _4k.b(classArray[j], string, clazz2);
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
            int n = _4k.a(l2, l3);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                _4k.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/4k" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l2, long l3) {
        int n = _4k.a(l2, l3);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = _4k.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _4k.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _4k.a(clazz3, string2, clazz2)) != null) {
                    _4k.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _4k.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _4k.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _4k.b(3410476876376212L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _4k.a(l2, l3);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = _4k.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _4k.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _4k.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _4k.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _4k.b(3410476876376212L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _4k.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _4k.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _4k.b(3410476876376212L, 0L);
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

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _4k.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "L{1\\w\u000fQn3\u001drS\u001cu";
        objectArray[1] = "\u0010\u000b'\r\u0011Ne+,\u0002\u0000\u0001\u0004%'\t\u0004[p";
        objectArray[2] = Void.TYPE;
        _4k.f[2] = "java/lang/Void";
        objectArray[3] = "Y<_rw\u0005,\u001cT}fJM\u0012_vb\u00109";
        objectArray[4] = "-j\u0010Q_`/tY)Pl6w\u0005KS";
        objectArray[5] = Float.TYPE;
        _4k.f[5] = "java/lang/Float";
        objectArray[6] = "=-'R\u0006|?3n1\rg 68H\n";
        objectArray[7] = "\u0007t\t\u0005~^\u0007t\u001eYrQ\u001d?\u001eGrD\u001aNO\u001f ";
        objectArray[8] = Double.TYPE;
        _4k.f[8] = "java/lang/Double";
        objectArray[9] = "*\u000fI\u000f\"\u001c*\u000f^S.\u00130D^M.\u000675\u000e\u0010\u007f";
        objectArray[10] = "~|d&IC~|szELd7sdEYcF'=\u0013";
        objectArray[11] = "'\u0012X8`?'\u0012Odl0=YOzl%:(\u0018'5b";
        objectArray[12] = "7~7y\rO5`~\u001a\u0006T*e(c\u0001C";
        objectArray[13] = "TUy%S\u0004I@{dVX\u0002";
        objectArray[14] = "p\u0002\\@\u001fF\u0005\"WO\u000e\td,\\D\nS\u0010";
        objectArray[15] = "[Mf0\"HFXdq'\u0014\tf";
        objectArray[16] = ")\u001fT3\u00065\\?_<\u0017z=1T7\u0013 I";
        objectArray[17] = "Q\u000fOkyx$/Ddh7E!Oolm1";
        objectArray[18] = "w\u007fVuw5\u0002_]zfzcQVqb \u0017";
        objectArray[19] = "\u0002F\fE#Ywf\u0007J2\u0016\u0016h\fA6Lb";
        objectArray[20] = "pH1W\\t\u0005h:XM;df1SIa\u0010";
        objectArray[21] = Integer.TYPE;
        _4k.f[21] = "java/lang/Integer";
        objectArray[22] = "\u0003WPtC\u001bvw[{RT\u0017yPpV\u000ec";
        objectArray[23] = "\u0000\"0A<1\u0000\"'\u001d0>\u001ai'\u00030+\u001d\u0018v\\i";
        objectArray[24] = "\u00063$iw%\u001b&&(ry[.";
        objectArray[25] = Boolean.TYPE;
        _4k.f[25] = "java/lang/Boolean";
        objectArray[26] = "\u000fa\u00107\u001aAzA\u001b8\u000b\u000e\u001bO\u00103\u000fTo";
        objectArray[27] = "^\u001e\u000ez\u0010\u0012^\u001e\u0019&\u001c\u001dDU\u00198\u001c\bC$HgNC";
        objectArray[28] = "N8>C\u007fq;\u00185Ln>Z\u0016>Gjd.";
        objectArray[29] = "\fi\u0018tpF\u0011|\u001a5u\u001a^u";
        objectArray[30] = "7\"\r\u0007\fdB\u0002\u0006\b\u001d+#\f\r\u0003\u0019qW";
        objectArray[31] = "\"l\u00156Q^WL\u001e9@\u00116B\u00152DKB";
        objectArray[32] = "f\"\"f9\u0018\u0013\u0002)i(Wr\f\"b,\r\u0006";
        objectArray[33] = "Knr\u001d\n9KneA\u00066Q%e_\u0006#VT7\u0003Sa";
        objectArray[34] = "\u0005spHOppS{G^?\u0011]pLZee";
        objectArray[35] = "T\fc3\u001ag!,h<\u000b(@\"c7\u000fr4";
        objectArray[36] = "\u0014\b\u0016I91\u001d\u0006\u0015\u0000z<\u001b\u0006\u0001\u0002g:Y\u0017\u0012\u001712\u001e\t\u001eI\u0006;\u0019\u0003\u001e\u0015\u00047\u0007\u0002\u0017\u000e:;";
        objectArray[37] = ":P#1)T'E!p,\bjw";
        objectArray[38] = "|),Mq]\t\t'B`\u0012h\u0007,IdH\u001c";
        objectArray[39] = "5p'\u0003^\u0007@P,\fOH!^'\u0007K\u0012U";
        objectArray[40] = "h\r3B*k\u001d-8M;$|#3F?~\b";
        objectArray[41] = "\b<zs\fo}\u001cq|\u001d \u001c\u0012zw\u0019zh";
        objectArray[42] = "tY<n>R\u0001y7a/\u001d`w<j+G\u0014";
        objectArray[43] = "8\u0000\u0019T>=8\u0000\u000e\b22\"K\u000e\u00162'%:_Me";
        objectArray[44] = "VW|%]j_Y\u007fl\u001egYYkn\u0003a\u001bKhxD`XK?YUkQ]cXIvA]|";
        objectArray[45] = "\bHuB$v\u0001Fv\u000bg{\u0007Fb\tz}EEm\n/|\u0019T6+9l)R~\n,k8Kq\u000f,";
        objectArray[46] = "\b\u0002\b|\u0018f\b\u0002\u001f \u0014i\u0012I\u001f>\u0014|\u00158MbF9P";
        objectArray[47] = "#g(2DL#g?nHC9,?pHV>]m-\u001b\u0012u";
        objectArray[48] = "M\u0007U;\u0011nF\bDtp`M\u0003@.";
        objectArray[49] = "\u000ejQ`o7Fx]\r:NL3\rw:rK1\u001b6";
        objectArray[50] = ":[2\u007fBe>J&*!1S_5zMc4\u001b45M\fj]!t^hmB|7!";
        objectArray[51] = "ED!Zk2C\u000f}]V<K\u0019 \f\u0001k\u0011N\u007f`k)WJz\r5?\u0017\u000f";
        objectArray[52] = "REY\u001b\u007feVTMN\u001c3;A^\u001epc\\\u0005_Qp\fREY\u001b\u007feVTMN\u001c";
        objectArray[53] = "d~7\u0012RL~'d\u0011\"\t\u0004w{\u0013NTkgl\u001fO6";
        objectArray[54] = "b,?Q4)/,<ZE9r!_M\" r6{V\"$Z4{M$2\u001f#\u007f\u000f >#:zU!B`d`\u000e /d\"mIE{a06H!|~mu7";
        objectArray[55] = "'%VF6Ro7Z+a+b#\u0002K4Vo|\f\u0015";
        objectArray[56] = "y\u0005CjK#1\u0017O\u0007\u0014Z?\u001cLkJ={\u001d\u0003k%c=\bBxAd\"U\u0001\u0007";
        objectArray[57] = "@W:'6IZ\u000ei$F\u000e ^v&*QONa*+3";
        objectArray[58] = "AzR!\b+EsK5w<J6I=\u001b\u000e\u001bv\u0019kw4D-C8\u001a9\u001ft@Z";
        objectArray[59] = "L\u001b\u00140Z H\u0012\r$%7GW\u000f,I\u0005\u0016\u0016Wu%?IL\u0005)H2\u0012\u0015\u0006K";
        objectArray[60] = "\u007fd*\u0005HGy/v\u0002uIq9+S\"\u001e+nv?H\\mjqR\u0016J-/";
        objectArray[61] = "P`\u0011w!U\u0017s\u0012rXA\u0001})9!C\u0012eVb*\u0001\u0011\u0001\u0015h`D\u0015nR{cAl";
        objectArray[62] = "\u0006o\u000bG&WN}\u0007*w.@v\u0004F'I\u0004wKFH\u0017Bb\nU,\u0010]?I*";
        objectArray[63] = ".QT3%2<GX<CoV\\_i/?1\u0018^&/P.QT3%2<GX<C";
        objectArray[64] = "N7\nm/\u0007\u0006%\u0006\u0000|~\u0014&Jl#\u0011\u00041Fm";
        objectArray[65] = "'Ci,+<oQeAx>\u001d_ ~)*z\u001b!1)E$]4p:!#Bi3E";
        objectArray[66] = "7p{Y\ta%fwVo8O}p\u0003\u0003l(9qL\u0003\u00037p{Y\ta%fwVo";
        objectArray[67] = "fP,~`\nbA8+\u0003R\u000fT+{o\fh\u0010*4oc6V?u|\u00071Ib6\u0003";
        objectArray[68] = "]\u0006WFUZ\u0015\u0014[+\u0007eg\u001e^GA\u0018[\u0019\\Q\u0000";
        objectArray[69] = "x;\\{Aiy8Ck(6+'[rD\u0004\u007ff\u0001/(.,d^rV<&8\\\u0015";
        objectArray[70] = "\tIw\n\u0004~\u0003\tx\u0002k-S\u000f\u0006X\u0013\u007fN\u001d|^\t?Iq=[\u001a(]N7\u001b\u0015 2";
        objectArray[71] = "c\u0011K_[6+\u0003G2\u000fO%\bD^Z(a\t\u000b^5v'\u001cJMQq8A\t2";
        objectArray[72] = "G5u~\u0000MMuzvo\u0002|6|)\u0013\u001e\u00060fi\u0014";
        objectArray[73] = "L\u0005AR4\u0006\u0004\u0017M?j\u007fJ\u0004IA#\u0010\r\u0017JD";
        objectArray[74] = "*9]\u001fmu,r\u0001\u0018P{$d\\I\u0007,~3\u0004%mn87\u0006H3xxr";
        objectArray[75] = "2M[wey [Wx\u0003&J@P-ot-\u0004Qbo\u001b2M[wey [Wx\u0003";
        objectArray[76] = "\u001b\u001aF_\u0011\u0002\u001f\u000bR\nrQr\u001eAZ\u001e\u0004\u0015Z@\u0015\u001ekK\u001cUT\r\u000fL\u0003\b\u0017r";
        objectArray[77] = "c,\u001dtU{ m\\i/`1/\u0001lCRcjX6\u0011\u0005al^p\u0013='2\\6/";
        objectArray[78] = "Y\u0017}9[W]\u0006il8\u00060\u0013z<TQWW{sT>\t\u0011n2GZ\u000e\u000e3q8";
        objectArray[79] = "Nz\u0017\u000eL%\u0006h\u001bc\u0019\\\bc\u0018\u000fM;LbW\u000f\"e\nw\u0016\u001cFb\u0015*Uc";
        objectArray[80] = "\u0014}]X~Y\u0006kQW\u0018\u0005lpV\u0002tT\u000b4WMt;UrB\fg_Rm\u001fO\u0018";
        objectArray[81] = "\u001a\u001bb&Z@R\tnK\u000b9\u001bC#\"[\u0006\u0011\u0003,*";
        objectArray[82] = "<\u000b@^o\u0002t\u0019L3;{;TOH=C}\nM\u000e";
        objectArray[83] = "J#p\u001b\rS\u00021|vR*L\"x\b\u001aE\u000b1{\r";
        objectArray[84] = "|^R^39}]MNZf/BUW6T{\u0003\b\tZ=\"Y[Y`<!FK0";
        objectArray[85] = "\nX\u0004\tY\u0019L\u0006\u0006OeOV\n_\u001e2\u0018\fZ\u0001rXZJY\u0005\u001f\u0006L\n\u001c";
        objectArray[86] = "w\u001e>ZA\u001a?\f27\u0013\tM\u0017vI\u0015\u0000$\u0013g]@";
        objectArray[87] = "\u0005\u007f\u000f\u0013\f+\u00034S\u00141%\u000b\"\u000eEfrQuR)\f0\u0017qTDR&W4";
        objectArray[88] = "00-?\ru7|= 6uS};`Z*49:/ZE3p23T*#g>26";
        objectArray[89] = "\u0001oWn\u000b'\u0018oQdo}\u000e*\u000fg\u0003OZnU>T\u0018\u000e5\bj\ru\u0003nQio";
        objectArray[90] = "E\u007f=\u00117\u0019O?2\u0019X]\u0013;LC \u0018\u0002+6E:X\u0005Gw\u0000fZ\u0012=q\u001a&]~|4F$J\u0004z.\u0006#&E?r\u00044\\C%2\u0003X\u001dF6%\u0017g\u0017\u00069-x";
        objectArray[91] = ":!\"^\u0013V|\u007f \u0018/\u0000fsyIxW<#%%\u0012\u0015z #HL\u0003:e";
        objectArray[92] = "dB:\u0018L}n\u00025\u0010#3_A3O_.%G)\u000fX";
        objectArray[93] = "5!\u000f- -4\"\u0010=Iyj,\f/\u001e.4~SCvwz\u007f\b!'fm ";
        objectArray[94] = "]e_*XWYtK\u007f;\u00064aX/WQS%Y`W>]e_*XWYtK\u007f;";
        objectArray[95] = "c+Um\u001aD2:B2zC17D4\u0016qez\u0018jJ&c4X,\u0000X u\u00191z";
        objectArray[96] = "&<gK` \"-s\u001e\u0003pO8`No&(|a\u0001oIv:t@|-q%)\u0003\u0003";
        objectArray[97] = "\u0010+l\u0000nm\u001akc\b\u0001 +(eW}>Q.\u007f\u0017z";
        objectArray[98] = "~^(uy0lH$z\u001fk\u0006S#/s=a\u0017\"`sR~^(uy0lH$z\u001f";
        objectArray[99] = "QAS\u001ee\u0012\u0017\u001fQXYD\r\u0013\b\t\u000e\u0013WCUedQ\u0011@R\b:GQ\u0005";
        objectArray[100] = "z&!Q\u001drpf.Yr(<zP\b\u000b4?z/S\u0000v<\u001ek\u0000\u0003$.!a@\f,A";
        objectArray[101] = "jQ7$\u001b~kR(4r!9M0-\u001e\u0013n\u000bnzID2\u0001+1\r66\b2%r";
        objectArray[102] = "\u000b\u0001!\u0006\u001fi\u000fG,Azj\u0015U\"S-9H\t{\u0004z{M_\u007fZ\u0017\u007f\u000bR8";
        objectArray[103] = "8+\u000b\u0011L(5t\u0005O 0*1\u000f\u0016L\u0002xtW@\u001aU|5Q\rL/z/\u0011\n n?s\u0013\u001dZh%3\u0014q^-\u007f(\u0013MG(%)o";
        objectArray[104] = "-S\u0016\u007fkz'\u0013\u0019w\u0004:\u0016P\u001f(x)lV\u0005h\u007f";
        objectArray[105] = "\u0013x\u0015g\u0012p\u00153I`/~\u001d%\u00141x)GrJ]\u0012k\u0001vN0L}A3";
        objectArray[106] = "W\u001a.\r\r\u0005QQr\n0\u000bYG/[g\\\u0003\u0010v7\r\u001eE\u0014uZS\b\u0005Q";
        objectArray[107] = "$=Lg\f3l/@\n^J\"<Dt\u001b%e/Gq";
        objectArray[108] = "~\u0011Ob(1z\u0000[7Kd\u0017\u0015Hg'7pQI('X.\u0017\\i4<)\b\u0001*K";
        objectArray[109] = "'\u0018#\u007f4h>\u0018%uP2(]{v<\u0000|\u0019!/hW(B|{2:%\u0019%xP";
        objectArray[110] = "R.\u001ae>\"\u0015=\u0019`G,\b1Oa;MR.\u001ae>\"\u0015=\u0019`G";
        objectArray[111] = "f]Y'U*bLMr6\u007f\u000fY^\"Z,h\u001d_mZCbF@wT.o\u001d\u0019t6";
        objectArray[112] = "xSN|\u001dM/RH4\u007f\r\u0012=\u0015$\u0018Z \u0007\u0014'\u0007J";
        objectArray[113] = "\u0004)\u0012u\u0018+\u001d)\u0014\u007f|q\u000blJ|\u0010C_(\u0010%@\u0014\u000bsMq\u001ey\u0006(\u0014r|";
        objectArray[114] = "\rvLD\u0017yEd@)G\u0000^n\u0002\u0013\u001aiZ\u007f\u0016F";
        objectArray[115] = "dU{\rJ!`\\b\u001956o\u0019`\u0011Y\u0004>Y1K5>a\u0002j\u0014X3:[iv";
        Object[] objectArray2 = objectArray;
        objectArray[116] = "~ET6kb6WX[5bDY\u001ddit#\u001d\u001c+i\u001b}[\tjz\u007fzDT)\u0005";
    }

    private static int a(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (f[n3] != null) {
            return n3;
        }
        Object object = e[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 29;
            case 1 -> 35;
            case 2 -> 33;
            case 3 -> 42;
            case 4 -> 23;
            case 5 -> 47;
            case 6 -> 50;
            case 7 -> 18;
            case 8 -> 20;
            case 9 -> 26;
            case 10 -> 21;
            case 11 -> 25;
            case 12 -> 43;
            case 13 -> 52;
            case 14 -> 6;
            case 15 -> 40;
            case 16 -> 0;
            case 17 -> 32;
            case 18 -> 54;
            case 19 -> 12;
            case 20 -> 3;
            case 21 -> 46;
            case 22 -> 56;
            case 23 -> 1;
            case 24 -> 60;
            case 25 -> 59;
            case 26 -> 53;
            case 27 -> 8;
            case 28 -> 5;
            case 29 -> 16;
            case 30 -> 11;
            case 31 -> 24;
            case 32 -> 58;
            case 33 -> 41;
            case 34 -> 19;
            case 35 -> 22;
            case 36 -> 28;
            case 37 -> 63;
            case 38 -> 55;
            case 39 -> 37;
            case 40 -> 48;
            case 41 -> 9;
            case 42 -> 62;
            case 43 -> 39;
            case 44 -> 31;
            case 45 -> 4;
            case 46 -> 14;
            case 47 -> 38;
            case 48 -> 44;
            case 49 -> 30;
            case 50 -> 61;
            case 51 -> 7;
            case 52 -> 45;
            case 53 -> 10;
            case 54 -> 17;
            case 55 -> 2;
            case 56 -> 34;
            case 57 -> 27;
            case 58 -> 49;
            case 59 -> 36;
            case 60 -> 57;
            case 61 -> 51;
            case 62 -> 13;
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
        _4k.f[n3] = new String(cArray);
        return n3;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/4k" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
            if (c == '\u00f9' || c == '\u00fa' || c == '\u00d2' || c == '\u00f1') {
                field = _4k.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f9' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fa' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _4k.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'e' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00a4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _4k.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
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

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x7D9F;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])d.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/4k", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _4k.c[n2] = n3;
        }
        return c[n2];
    }

    public void cfr_renamed_4(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        long l2 = (Long)objectArray[2];
        double d3 = (Double)objectArray[3];
        double d4 = (Double)objectArray[4];
        double d5 = (Double)objectArray[5];
        double d6 = (Double)objectArray[6];
        _8B b = (_8B)objectArray[7];
        long l3 = (l2 = a ^ l2) ^ 0x21C5085036EEL;
        Object[] objectArray2 = new Object[14];
        objectArray2[13] = b;
        objectArray2[12] = d6;
        objectArray2[11] = d2;
        objectArray2[10] = d4;
        objectArray2[9] = d6;
        objectArray2[8] = d5;
        objectArray2[7] = d4;
        objectArray2[6] = d3;
        objectArray2[5] = d5;
        objectArray2[4] = d;
        objectArray2[3] = d3;
        objectArray2[2] = l3;
        objectArray2[1] = d2;
        objectArray2[0] = d;
        _4k.b("e", (Object)this, (Object)objectArray2, -5844957943364564057L, (long)l2);
    }

    public static String cfr_renamed_4() {
        return cfr_renamed_4;
    }

    public static void cfr_renamed_2(Object[] objectArray) {
        Matrix4f matrix4f = (Matrix4f)objectArray[0];
        long l2 = (Long)objectArray[1];
        Matrix4f matrix4f2 = (Matrix4f)objectArray[2];
        l2 = a ^ l2;
        _4k.b("e", (Object)_4k.b("\u00d2", 3375447218786146441L, (long)l2), (Object)matrix4f, 3369373437166939557L, (long)l2);
        _4k.b("e", (Object)_4k.b("\u00d2", 3377499625699028321L, (long)l2), (Object)matrix4f, 3369373437166939557L, (long)l2);
        _4k.b("e", (Object)_4k.b("\u00d2", 3375960369086921878L, (long)l2), (Object)matrix4f2, 3369373437166939557L, (long)l2);
        CallSite callSite = _4k.b("e", (Object)new Matrix4f((Matrix4fc)matrix4f), 3375074620261489686L, (long)l2);
        CallSite callSite2 = _4k.b("e", (Object)new Matrix4f((Matrix4fc)matrix4f2), 3375074620261489686L, (long)l2);
        CallSite callSite3 = _4k.b("e", (Object)_4k.b("e", (Object)new Vector4f(0.0f, 0.0f, 0.0f, 1.0f), (Object)callSite, 3374352884694204320L, (long)l2), (Object)callSite2, 3374352884694204320L, (long)l2);
        _4k.b("e", (Object)callSite3, (float)_4k.b("\u00f9", (Object)callSite3, 3375189572448259788L, (long)l2), 3376772086625189829L, (long)l2);
        CallSite callSite4 = _4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00f9", (Object)_4k.b("\u00d2", 3373505780964757519L, (long)l2), 3376127788767859992L, (long)l2), 3376280720137539829L, (long)l2), 3377210543545442052L, (long)l2);
        _4k.b("\u00f1", (class_243)new class_243((double)(_4k.b("\u00f9", (Object)callSite4, 3375572778798962401L, (long)l2) + (double)_4k.b("\u00f9", (Object)callSite3, 3377439561103157224L, (long)l2)), (double)(_4k.b("\u00f9", (Object)callSite4, 3374858070027393293L, (long)l2) + (double)_4k.b("\u00f9", (Object)callSite3, 3376011701843816723L, (long)l2)), (double)(_4k.b("\u00f9", (Object)callSite4, 3376541134965917535L, (long)l2) + (double)_4k.b("\u00f9", (Object)callSite3, 3374742825291590550L, (long)l2))), 3375925994018896962L, (long)l2);
    }

    public static void cfr_renamed_2(String string) {
        cfr_renamed_4 = string;
    }

    public void cfr_renamed_3(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        long l2 = (Long)objectArray[2];
        double d3 = (Double)objectArray[3];
        double d4 = (Double)objectArray[4];
        double d5 = (Double)objectArray[5];
        double d6 = (Double)objectArray[6];
        double d7 = (Double)objectArray[7];
        double d8 = (Double)objectArray[8];
        double d9 = (Double)objectArray[9];
        double d10 = (Double)objectArray[10];
        double d11 = (Double)objectArray[11];
        double d12 = (Double)objectArray[12];
        _8B b = (_8B)objectArray[13];
        long l3 = (l2 = a ^ l2) ^ 0x6E70B37C0AA5L;
        Object[] objectArray2 = new Object[17];
        objectArray2[16] = b;
        objectArray2[15] = b;
        objectArray2[14] = b;
        objectArray2[13] = b;
        objectArray2[12] = d12;
        objectArray2[11] = d11;
        objectArray2[10] = d10;
        objectArray2[9] = l3;
        objectArray2[8] = d9;
        objectArray2[7] = d8;
        objectArray2[6] = d7;
        objectArray2[5] = d6;
        objectArray2[4] = d5;
        objectArray2[3] = d4;
        objectArray2[2] = d3;
        objectArray2[1] = d2;
        objectArray2[0] = d;
        _4k.b("e", (Object)this, (Object)objectArray2, -5249284074843191838L, (long)l2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void cfr_renamed_6(Object[] var1_1) {
        block35: {
            block44: {
                block45: {
                    block42: {
                        block43: {
                            block40: {
                                block41: {
                                    block38: {
                                        block39: {
                                            block36: {
                                                block37: {
                                                    block33: {
                                                        var4_2 = (Double)var1_1[0];
                                                        var6_3 = (Double)var1_1[1];
                                                        var8_4 = (Double)var1_1[2];
                                                        var10_5 = (Double)var1_1[3];
                                                        var12_6 = (Double)var1_1[4];
                                                        var14_7 = (Long)var1_1[5];
                                                        var16_8 = (Double)var1_1[6];
                                                        var2_9 = (_8B)var1_1[7];
                                                        var3_10 = (Integer)var1_1[8];
                                                        v0 = var14_7 = _4k.a ^ var14_7;
                                                        var18_11 = v0 ^ 96812948673810L;
                                                        var20_12 = v0 ^ 105391203403235L;
                                                        var22_13 = v0 ^ 59035045282627L;
                                                        var24_14 = v0 ^ 119110390336741L;
                                                        var26_15 = v0 ^ 65334166449187L;
                                                        var28_16 = v0 ^ 38744251131851L;
                                                        v1 = new Object[3];
                                                        v1[2] = var22_13;
                                                        v1[1] = (int)_4k.a("k", (int)22267, (long)(580291417894015454L ^ var14_7));
                                                        v1[0] = (int)_4k.a("k", (int)21814, (long)(4747032711223824923L ^ var14_7));
                                                        _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)8840279080775020173L, (long)var14_7), (Object)v1, (long)8836481584321313991L, (long)var14_7);
                                                        v2 = new Object[4];
                                                        v2[3] = var8_4;
                                                        v2[2] = var6_3;
                                                        v2[1] = var18_11;
                                                        v2[0] = var4_2;
                                                        v3 = new Object[2];
                                                        v3[1] = var2_9;
                                                        v3[0] = var24_14;
                                                        v4 = new Object[1];
                                                        v4[0] = var26_15;
                                                        var31_17 = _4k.b("e", (Object)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)8840279080775020173L, (long)var14_7), (Object)v2, (long)8837749405492713193L, (long)var14_7), (Object)v3, (long)8844914765484486441L, (long)var14_7), (Object)v4, (long)8838784239270610746L, (long)var14_7);
                                                        v5 = new Object[4];
                                                        v5[3] = var16_8;
                                                        v5[2] = var6_3;
                                                        v5[1] = var18_11;
                                                        v5[0] = var4_2;
                                                        v6 = new Object[2];
                                                        v6[1] = var2_9;
                                                        v6[0] = var24_14;
                                                        v7 = new Object[1];
                                                        v7[0] = var26_15;
                                                        var32_18 = _4k.b("e", (Object)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)8840279080775020173L, (long)var14_7), (Object)v5, (long)8837749405492713193L, (long)var14_7), (Object)v6, (long)8844914765484486441L, (long)var14_7), (Object)v7, (long)8838784239270610746L, (long)var14_7);
                                                        var30_19 = _87.cfr_renamed_7();
                                                        v8 = new Object[4];
                                                        v8[3] = var8_4;
                                                        v8[2] = var6_3;
                                                        v8[1] = var18_11;
                                                        v8[0] = var10_5;
                                                        v9 = new Object[2];
                                                        v9[1] = var2_9;
                                                        v9[0] = var24_14;
                                                        v10 = new Object[1];
                                                        v10[0] = var26_15;
                                                        var33_20 = _4k.b("e", (Object)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)8840279080775020173L, (long)var14_7), (Object)v8, (long)8837749405492713193L, (long)var14_7), (Object)v9, (long)8844914765484486441L, (long)var14_7), (Object)v10, (long)8838784239270610746L, (long)var14_7);
                                                        v11 = new Object[4];
                                                        v11[3] = var16_8;
                                                        v11[2] = var6_3;
                                                        v11[1] = var18_11;
                                                        v11[0] = var10_5;
                                                        v12 = new Object[2];
                                                        v12[1] = var2_9;
                                                        v12[0] = var24_14;
                                                        v13 = new Object[1];
                                                        v13[0] = var26_15;
                                                        var34_21 = _4k.b("e", (Object)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)8840279080775020173L, (long)var14_7), (Object)v11, (long)8837749405492713193L, (long)var14_7), (Object)v12, (long)8844914765484486441L, (long)var14_7), (Object)v13, (long)8838784239270610746L, (long)var14_7);
                                                        v14 = new Object[4];
                                                        v14[3] = var8_4;
                                                        v14[2] = var12_6;
                                                        v14[1] = var18_11;
                                                        v14[0] = var4_2;
                                                        v15 = new Object[2];
                                                        v15[1] = var2_9;
                                                        v15[0] = var24_14;
                                                        v16 = new Object[1];
                                                        v16[0] = var26_15;
                                                        var35_22 = _4k.b("e", (Object)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)8840279080775020173L, (long)var14_7), (Object)v14, (long)8837749405492713193L, (long)var14_7), (Object)v15, (long)8844914765484486441L, (long)var14_7), (Object)v16, (long)8838784239270610746L, (long)var14_7);
                                                        v17 = new Object[4];
                                                        v17[3] = var16_8;
                                                        v17[2] = var12_6;
                                                        v17[1] = var18_11;
                                                        v17[0] = var4_2;
                                                        v18 = new Object[2];
                                                        v18[1] = var2_9;
                                                        v18[0] = var24_14;
                                                        v19 = new Object[1];
                                                        v19[0] = var26_15;
                                                        var36_23 = _4k.b("e", (Object)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)8840279080775020173L, (long)var14_7), (Object)v17, (long)8837749405492713193L, (long)var14_7), (Object)v18, (long)8844914765484486441L, (long)var14_7), (Object)v19, (long)8838784239270610746L, (long)var14_7);
                                                        v20 = new Object[4];
                                                        v20[3] = var8_4;
                                                        v20[2] = var12_6;
                                                        v20[1] = var18_11;
                                                        v20[0] = var10_5;
                                                        v21 = new Object[2];
                                                        v21[1] = var2_9;
                                                        v21[0] = var24_14;
                                                        v22 = new Object[1];
                                                        v22[0] = var26_15;
                                                        var37_24 = _4k.b("e", (Object)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)8840279080775020173L, (long)var14_7), (Object)v20, (long)8837749405492713193L, (long)var14_7), (Object)v21, (long)8844914765484486441L, (long)var14_7), (Object)v22, (long)8838784239270610746L, (long)var14_7);
                                                        v23 = new Object[4];
                                                        v23[3] = var16_8;
                                                        v23[2] = var12_6;
                                                        v23[1] = var18_11;
                                                        v23[0] = var10_5;
                                                        v24 = new Object[2];
                                                        v24[1] = var2_9;
                                                        v24[0] = var24_14;
                                                        v25 = new Object[1];
                                                        v25[0] = var26_15;
                                                        var38_25 = _4k.b("e", (Object)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)8840279080775020173L, (long)var14_7), (Object)v23, (long)8837749405492713193L, (long)var14_7), (Object)v24, (long)8844914765484486441L, (long)var14_7), (Object)v25, (long)8838784239270610746L, (long)var14_7);
                                                        try {
                                                            block34: {
                                                                try {
                                                                    try {
                                                                        v26 /* !! */  = var3_10;
                                                                        if (var30_19 == 0) break block33;
                                                                        if (v26 /* !! */  != 0) break block34;
                                                                    }
                                                                    catch (MatchException v27) {
                                                                        throw _4k.a(v27);
                                                                    }
                                                                    v28 = new Object[5];
                                                                    v28[4] = (int)var35_22;
                                                                    v28[3] = (int)var36_23;
                                                                    v28[2] = (int)var32_18;
                                                                    v28[1] = (int)var31_17;
                                                                    v28[0] = var20_12;
                                                                    _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)8840279080775020173L, (long)var14_7), (Object)v28, (long)8844758972035683231L, (long)var14_7);
                                                                    v29 = new Object[5];
                                                                    v29[4] = (int)var34_21;
                                                                    v29[3] = (int)var38_25;
                                                                    v29[2] = (int)var37_24;
                                                                    v29[1] = (int)var33_20;
                                                                    v29[0] = var20_12;
                                                                    _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)8840279080775020173L, (long)var14_7), (Object)v29, (long)8844758972035683231L, (long)var14_7);
                                                                    v30 = new Object[5];
                                                                    v30[4] = (int)var33_20;
                                                                    v30[3] = (int)var37_24;
                                                                    v30[2] = (int)var35_22;
                                                                    v30[1] = (int)var31_17;
                                                                    v30[0] = var20_12;
                                                                    _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)8840279080775020173L, (long)var14_7), (Object)v30, (long)8844758972035683231L, (long)var14_7);
                                                                    v31 = new Object[5];
                                                                    v31[4] = (int)var36_23;
                                                                    v31[3] = (int)var38_25;
                                                                    v31[2] = (int)var34_21;
                                                                    v31[1] = (int)var32_18;
                                                                    v31[0] = var20_12;
                                                                    _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)8840279080775020173L, (long)var14_7), (Object)v31, (long)8844758972035683231L, (long)var14_7);
                                                                    v32 = new Object[5];
                                                                    v32[4] = (int)var32_18;
                                                                    v32[3] = (int)var34_21;
                                                                    v32[2] = (int)var33_20;
                                                                    v32[1] = (int)var31_17;
                                                                    v32[0] = var20_12;
                                                                    _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)8840279080775020173L, (long)var14_7), (Object)v32, (long)8844758972035683231L, (long)var14_7);
                                                                    v33 = new Object[5];
                                                                    v33[4] = (int)var37_24;
                                                                    v33[3] = (int)var38_25;
                                                                    v33[2] = (int)var36_23;
                                                                    v33[1] = (int)var35_22;
                                                                    v33[0] = var20_12;
                                                                    _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)8840279080775020173L, (long)var14_7), (Object)v33, (long)8844758972035683231L, (long)var14_7);
                                                                    if (var30_19 != 0) break block35;
                                                                }
                                                                catch (MatchException v34) {
                                                                    throw _4k.a(v34);
                                                                }
                                                            }
                                                            v35 = new Object[3];
                                                            v35[2] = (int)_4k.a("k", (int)15582, (long)(8288886145099971569L ^ var14_7));
                                                            v35[1] = var28_16;
                                                            v35[0] = var3_10;
                                                            v26 /* !! */  = (int)_4k.b("\u00a4", (Object)v35, (long)8837266310066018005L, (long)var14_7);
                                                        }
                                                        catch (MatchException v36) {
                                                            throw _4k.a(v36);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            v37 = var30_19;
                                                            if (var14_7 > 0L) {
                                                                if (v37 == 0) break block36;
                                                                if (v26 /* !! */  == 0) break block37;
                                                            }
                                                            ** GOTO lbl266
                                                        }
                                                        catch (MatchException v38) {
                                                            throw _4k.a(v38);
                                                        }
                                                        v39 = new Object[5];
                                                        v39[4] = (int)var35_22;
                                                        v39[3] = (int)var36_23;
                                                        v39[2] = (int)var32_18;
                                                        v39[1] = (int)var31_17;
                                                        v39[0] = var20_12;
                                                        _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)8840279080775020173L, (long)var14_7), (Object)v39, (long)8844758972035683231L, (long)var14_7);
                                                    }
                                                    catch (MatchException v40) {
                                                        throw _4k.a(v40);
                                                    }
                                                }
                                                v41 = new Object[3];
                                                v41[2] = (int)_4k.a("k", (int)7577, (long)(8369034024850070206L ^ var14_7));
                                                v41[1] = var28_16;
                                                v41[0] = var3_10;
                                                v26 /* !! */  = (int)_4k.b("\u00a4", (Object)v41, (long)8837266310066018005L, (long)var14_7);
                                            }
                                            try {
                                                try {
                                                    v37 = var30_19;
lbl266:
                                                    // 2 sources

                                                    if (var14_7 >= 0L) {
                                                        if (v37 == 0) break block38;
                                                        if (v26 /* !! */  == 0) break block39;
                                                    }
                                                    ** GOTO lbl295
                                                }
                                                catch (MatchException v42) {
                                                    throw _4k.a(v42);
                                                }
                                                v43 = new Object[5];
                                                v43[4] = (int)var34_21;
                                                v43[3] = (int)var38_25;
                                                v43[2] = (int)var37_24;
                                                v43[1] = (int)var33_20;
                                                v43[0] = var20_12;
                                                _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)8840279080775020173L, (long)var14_7), (Object)v43, (long)8844758972035683231L, (long)var14_7);
                                            }
                                            catch (MatchException v44) {
                                                throw _4k.a(v44);
                                            }
                                        }
                                        v45 = new Object[3];
                                        v45[2] = (int)_4k.a("k", (int)21814, (long)(4747032711223824923L ^ var14_7));
                                        v45[1] = var28_16;
                                        v45[0] = var3_10;
                                        v26 /* !! */  = (int)_4k.b("\u00a4", (Object)v45, (long)8837266310066018005L, (long)var14_7);
                                    }
                                    try {
                                        try {
                                            v37 = var30_19;
lbl295:
                                            // 2 sources

                                            if (var14_7 > 0L) {
                                                if (v37 == 0) break block40;
                                                if (v26 /* !! */  == 0) break block41;
                                            }
                                            ** GOTO lbl324
                                        }
                                        catch (MatchException v46) {
                                            throw _4k.a(v46);
                                        }
                                        v47 = new Object[5];
                                        v47[4] = (int)var33_20;
                                        v47[3] = (int)var37_24;
                                        v47[2] = (int)var35_22;
                                        v47[1] = (int)var31_17;
                                        v47[0] = var20_12;
                                        _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)8840279080775020173L, (long)var14_7), (Object)v47, (long)8844758972035683231L, (long)var14_7);
                                    }
                                    catch (MatchException v48) {
                                        throw _4k.a(v48);
                                    }
                                }
                                v49 = new Object[3];
                                v49[2] = (int)_4k.a("k", (int)1517, (long)(974818154838000325L ^ var14_7));
                                v49[1] = var28_16;
                                v49[0] = var3_10;
                                v26 /* !! */  = (int)_4k.b("\u00a4", (Object)v49, (long)8837266310066018005L, (long)var14_7);
                            }
                            try {
                                try {
                                    v37 = var30_19;
lbl324:
                                    // 2 sources

                                    if (var14_7 > 0L) {
                                        if (v37 == 0) break block42;
                                        if (v26 /* !! */  == 0) break block43;
                                    }
                                    ** GOTO lbl354
                                }
                                catch (MatchException v50) {
                                    throw _4k.a(v50);
                                }
                                v51 = new Object[5];
                                v51[4] = (int)var36_23;
                                v51[3] = (int)var38_25;
                                v51[2] = (int)var34_21;
                                v51[1] = (int)var32_18;
                                v51[0] = var20_12;
                                _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)8840279080775020173L, (long)var14_7), (Object)v51, (long)8844758972035683231L, (long)var14_7);
                            }
                            catch (MatchException v52) {
                                throw _4k.a(v52);
                            }
                        }
                        v53 = new Object[3];
                        v53[2] = 4;
                        v53[1] = var28_16;
                        v53[0] = var3_10;
                        v26 /* !! */  = (int)_4k.b("\u00a4", (Object)v53, (long)8837266310066018005L, (long)var14_7);
                    }
                    try {
                        try {
                            if (var14_7 <= 0L) break block44;
                            v37 = var30_19;
lbl354:
                            // 2 sources

                            if (v37 == 0) break block44;
                            if (v26 /* !! */  == 0) break block45;
                        }
                        catch (MatchException v54) {
                            throw _4k.a(v54);
                        }
                        v55 = new Object[5];
                        v55[4] = (int)var32_18;
                        v55[3] = (int)var34_21;
                        v55[2] = (int)var33_20;
                        v55[1] = (int)var31_17;
                        v55[0] = var20_12;
                        _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)8840279080775020173L, (long)var14_7), (Object)v55, (long)8844758972035683231L, (long)var14_7);
                    }
                    catch (MatchException v56) {
                        throw _4k.a(v56);
                    }
                }
                v57 = new Object[3];
                v57[2] = 2;
                v57[1] = var28_16;
                v57[0] = var3_10;
                v26 /* !! */  = (int)_4k.b("\u00a4", (Object)v57, (long)8837266310066018005L, (long)var14_7);
            }
            try {
                if (v26 /* !! */  != 0) {
                    v58 = new Object[5];
                    v58[4] = (int)var37_24;
                    v58[3] = (int)var38_25;
                    v58[2] = (int)var36_23;
                    v58[1] = (int)var35_22;
                    v58[0] = var20_12;
                    _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, (long)8840279080775020173L, (long)var14_7), (Object)v58, (long)8844758972035683231L, (long)var14_7);
                }
            }
            catch (MatchException v59) {
                throw _4k.a(v59);
            }
        }
    }

    public void cfr_renamed_7(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        double d = (Double)objectArray[1];
        double d2 = (Double)objectArray[2];
        double d3 = (Double)objectArray[3];
        double d4 = (Double)objectArray[4];
        double d5 = (Double)objectArray[5];
        _8B b = (_8B)objectArray[6];
        long l3 = (l2 = a ^ l2) ^ 0x5676BDFC7F85L;
        Object[] objectArray2 = new Object[14];
        objectArray2[13] = b;
        objectArray2[12] = d3;
        objectArray2[11] = d2;
        objectArray2[10] = d4;
        objectArray2[9] = d5;
        objectArray2[8] = d2;
        objectArray2[7] = d4;
        objectArray2[6] = d5;
        objectArray2[5] = d2;
        objectArray2[4] = d;
        objectArray2[3] = d3;
        objectArray2[2] = l3;
        objectArray2[1] = d2;
        objectArray2[0] = d;
        _4k.b("e", (Object)this, (Object)objectArray2, -1762598484411415860L, (long)l2);
    }

    public void cfr_renamed_8(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        long l2 = (Long)objectArray[2];
        double d3 = (Double)objectArray[3];
        double d4 = (Double)objectArray[4];
        double d5 = (Double)objectArray[5];
        double d6 = (Double)objectArray[6];
        _8B b = (_8B)objectArray[7];
        _8B b2 = (_8B)objectArray[8];
        long l3 = (l2 = a ^ l2) ^ 0x676BDB0823EAL;
        Object[] objectArray2 = new Object[17];
        objectArray2[16] = b2;
        objectArray2[15] = b2;
        objectArray2[14] = b;
        objectArray2[13] = b;
        objectArray2[12] = d6;
        objectArray2[11] = d2;
        objectArray2[10] = d4;
        objectArray2[9] = l3;
        objectArray2[8] = d6;
        objectArray2[7] = d5;
        objectArray2[6] = d4;
        objectArray2[5] = d3;
        objectArray2[4] = d5;
        objectArray2[3] = d;
        objectArray2[2] = d3;
        objectArray2[1] = d2;
        objectArray2[0] = d;
        _4k.b("e", (Object)this, (Object)objectArray2, -7031875035942916947L, (long)l2);
    }

    public void void_7(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        double d3 = (Double)objectArray[2];
        double d4 = (Double)objectArray[3];
        double d5 = (Double)objectArray[4];
        double d6 = (Double)objectArray[5];
        double d7 = (Double)objectArray[6];
        double d8 = (Double)objectArray[7];
        double d9 = (Double)objectArray[8];
        long l2 = (Long)objectArray[9];
        double d10 = (Double)objectArray[10];
        double d11 = (Double)objectArray[11];
        double d12 = (Double)objectArray[12];
        _8B b = (_8B)objectArray[13];
        _8B b2 = (_8B)objectArray[14];
        _8B b3 = (_8B)objectArray[15];
        _8B b4 = (_8B)objectArray[16];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x5B61560BD18L;
        long l5 = l3 ^ 0x2615D372DE9L;
        long l6 = l3 ^ 0x7C552B71007DL;
        long l7 = l3 ^ 0x31EF9C8BA4EFL;
        long l8 = l3 ^ 0x66D0DBC28429L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l6;
        _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, -7879989522914376057L, (long)l2), (Object)objectArray2, -7880405145445695521L, (long)l2);
        Object[] objectArray3 = new Object[4];
        objectArray3[3] = d3;
        objectArray3[2] = d2;
        objectArray3[1] = l4;
        objectArray3[0] = d;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = b4;
        objectArray4[0] = l7;
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l8;
        Object[] objectArray6 = new Object[4];
        objectArray6[3] = d6;
        objectArray6[2] = d5;
        objectArray6[1] = l4;
        objectArray6[0] = d4;
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = b;
        objectArray7[0] = l7;
        Object[] objectArray8 = new Object[1];
        objectArray8[0] = l8;
        Object[] objectArray9 = new Object[4];
        objectArray9[3] = d9;
        objectArray9[2] = d8;
        objectArray9[1] = l4;
        objectArray9[0] = d7;
        Object[] objectArray10 = new Object[2];
        objectArray10[1] = b2;
        objectArray10[0] = l7;
        Object[] objectArray11 = new Object[1];
        objectArray11[0] = l8;
        Object[] objectArray12 = new Object[4];
        objectArray12[3] = d12;
        objectArray12[2] = d11;
        objectArray12[1] = l4;
        objectArray12[0] = d10;
        Object[] objectArray13 = new Object[2];
        objectArray13[1] = b3;
        objectArray13[0] = l7;
        Object[] objectArray14 = new Object[1];
        objectArray14[0] = l8;
        Object[] objectArray15 = new Object[5];
        objectArray15[4] = (int)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00f9", (Object)this, -7879989522914376057L, (long)l2), (Object)objectArray12, -7876896930849423645L, (long)l2), (Object)objectArray13, -7875337078705912029L, (long)l2), (Object)objectArray14, -7880183529957413072L, (long)l2);
        objectArray15[3] = (int)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00f9", (Object)this, -7879989522914376057L, (long)l2), (Object)objectArray9, -7876896930849423645L, (long)l2), (Object)objectArray10, -7875337078705912029L, (long)l2), (Object)objectArray11, -7880183529957413072L, (long)l2);
        objectArray15[2] = (int)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00f9", (Object)this, -7879989522914376057L, (long)l2), (Object)objectArray6, -7876896930849423645L, (long)l2), (Object)objectArray7, -7875337078705912029L, (long)l2), (Object)objectArray8, -7880183529957413072L, (long)l2);
        objectArray15[1] = (int)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00f9", (Object)this, -7879989522914376057L, (long)l2), (Object)objectArray3, -7876896930849423645L, (long)l2), (Object)objectArray4, -7875337078705912029L, (long)l2), (Object)objectArray5, -7880183529957413072L, (long)l2);
        objectArray15[0] = l5;
        _4k.b("e", (Object)_4k.b("\u00f9", (Object)this, -7879989522914376057L, (long)l2), (Object)objectArray15, -7875466612723663979L, (long)l2);
    }

    public static Vector3f org_joml_Vector3f_7(Object[] objectArray) {
        Object object;
        Object object2;
        long l2;
        block4: {
            block5: {
                double d = (Double)objectArray[0];
                double d2 = (Double)objectArray[1];
                double d3 = (Double)objectArray[2];
                l2 = (Long)objectArray[3];
                l2 = a ^ l2;
                CallSite callSite = _4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00f9", (Object)_4k.b("\u00d2", -2691939086364351366L, (long)l2), -2688864079707659923L, (long)l2), -2688750790886120320L, (long)l2), -2690033180641580175L, (long)l2);
                int n = _87.cfr_renamed_5();
                _4k.b("e", (Object)_4k.b("\u00d2", -2689736255013670937L, (long)l2), (float)((float)(d - _4k.b("\u00f9", (Object)callSite, -2689449949016841580L, (long)l2))), (float)((float)(d2 - _4k.b("\u00f9", (Object)callSite, -2692957400210264712L, (long)l2))), (float)((float)(d3 - _4k.b("\u00f9", (Object)callSite, -2689013679231225046L, (long)l2))), 1.0f, -2688946473268042129L, (long)l2);
                _4k.b("e", (Object)_4k.b("\u00d2", -2689736255013670937L, (long)l2), (Object)_4k.b("\u00d2", -2689629629482137373L, (long)l2), -2692789628584211499L, (long)l2);
                _4k.b("e", (Object)_4k.b("\u00d2", -2689736255013670937L, (long)l2), (Object)_4k.b("\u00d2", -2690307005495846636L, (long)l2), -2692789628584211499L, (long)l2);
                int n2 = n;
                try {
                    try {
                        object2 = _4k.b("\u00f9", (Object)_4k.b("\u00d2", -2689736255013670937L, (long)l2), -2692515946630513991L, (long)l2);
                        object = 0.0f;
                        if (n2 != 0) break block4;
                        if (!(object2 <= object)) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _4k.a(matchException);
                    }
                    return null;
                }
                catch (MatchException matchException) {
                    throw _4k.a(matchException);
                }
            }
            object2 = 1.0f;
            object = _4k.b("\u00f9", (Object)_4k.b("\u00d2", -2689736255013670937L, (long)l2), -2692515946630513991L, (long)l2);
        }
        reference var11_7 = object2 / object;
        reference var12_8 = _4k.b("\u00f9", (Object)_4k.b("\u00d2", -2689736255013670937L, (long)l2), -2690261508322667619L, (long)l2) * var11_7;
        reference var13_9 = _4k.b("\u00f9", (Object)_4k.b("\u00d2", -2689736255013670937L, (long)l2), -2688835026806340250L, (long)l2) * var11_7;
        float f = (float)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00d2", -2691939086364351366L, (long)l2), -2692859868915608612L, (long)l2), -2691858574505711033L, (long)l2);
        reference var15_11 = (var12_8 * 0.5f + 0.5f) * (float)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00d2", -2691939086364351366L, (long)l2), -2692859868915608612L, (long)l2), -2686714960635771849L, (long)l2) / f;
        float f2 = (1.0f - (var13_9 * 0.5f + 0.5f)) * (float)_4k.b("e", (Object)_4k.b("e", (Object)_4k.b("\u00d2", -2691939086364351366L, (long)l2), -2692859868915608612L, (long)l2), -2686762668742688960L, (long)l2) / f;
        return new Vector3f((float)var15_11, f2, (float)(_4k.b("\u00f9", (Object)_4k.b("\u00d2", -2689736255013670937L, (long)l2), -2693107824955793437L, (long)l2) * var11_7));
    }

    public void cfr_renamed_0(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        long l2 = (Long)objectArray[2];
        double d3 = (Double)objectArray[3];
        double d4 = (Double)objectArray[4];
        double d5 = (Double)objectArray[5];
        _8B b = (_8B)objectArray[6];
        _8B b2 = (_8B)objectArray[7];
        _9x x = (_9x)((Object)objectArray[8]);
        long l3 = (l2 = a ^ l2) ^ 0x6D5F546F5637L;
        Object[] objectArray2 = new Object[16];
        objectArray2[15] = x;
        objectArray2[14] = b2;
        objectArray2[13] = b;
        objectArray2[12] = d3;
        objectArray2[11] = d2;
        objectArray2[10] = d4;
        objectArray2[9] = d5;
        objectArray2[8] = d2;
        objectArray2[7] = d4;
        objectArray2[6] = d5;
        objectArray2[5] = d2;
        objectArray2[4] = l3;
        objectArray2[3] = d;
        objectArray2[2] = d3;
        objectArray2[1] = d2;
        objectArray2[0] = d;
        _4k.b("e", (Object)this, (Object)objectArray2, -1897888928577980514L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_4k.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_4k.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

