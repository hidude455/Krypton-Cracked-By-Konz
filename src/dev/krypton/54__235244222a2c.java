/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1657
 *  net.minecraft.class_742
 */
package dev.krypton;

import dev.krypton._3C;
import dev.krypton._3i_0;
import dev.krypton._40;
import dev.krypton._4C;
import dev.krypton._4S;
import dev.krypton._4k;
import dev.krypton._4r;
import dev.krypton._4w;
import dev.krypton._6c_0;
import dev.krypton._6x_0;
import dev.krypton._8B;
import dev.krypton._92;
import dev.krypton._94;
import dev.krypton._95;
import dev.krypton._9E;
import dev.krypton._9L;
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
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1657;
import net.minecraft.class_742;

public class _54
extends _6x_0 {
    private final _9E cfr_renamed_236;
    private final _92 cfr_renamed_237;
    private final _92 cfr_renamed_3;
    private final _9r cfr_renamed_2;
    private final _92 cfr_renamed_238;
    private final _9r cfr_renamed_6;
    private final _9r cfr_renamed_9;
    private final _9E cfr_renamed_8;
    private final _9E cfr_renamed_0;
    private final _94 cfr_renamed_223;
    private final _94 cfr_renamed_1;
    private final _94 cfr_renamed_239;
    private final _94 cfr_renamed_4;
    private final Map cfr_renamed_7;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    private Boolean cfr_renamed_5(long l2) {
        Object object;
        block8: {
            block7: {
                int n;
                block6: {
                    long l3 = l2 = b ^ l2;
                    long l4 = l3 ^ 0x6192CBBE038DL;
                    long l5 = l3 ^ 0x1A1FBD5199EAL;
                    n = _3C.cfr_renamed_4();
                    try {
                        try {
                            Object[] objectArray = new Object[2];
                            objectArray[1] = l4;
                            objectArray[0] = _54.c("\u00e7", 6088642991101719532L, (long)l2);
                            object = _54.c("\u00ba", (Object)_54.c("\u00ec", (Object)this, 6086848484221015669L, (long)l2), (Object)objectArray, 6088208768043436822L, (long)l2);
                            if (n != 0) break block6;
                            if (object == false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw _54.a(matchException);
                        }
                        object = _54.c("\u00ba", (Object)_54.c("\u00ec", (Object)this, 6072560625165268469L, (long)l2), (long)l5, 6086360148924425715L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw _54.a(matchException);
                    }
                }
                try {
                    if (n != 0) break block8;
                    if (object == false) break block7;
                }
                catch (MatchException matchException) {
                    throw _54.a(matchException);
                }
                object = true;
                break block8;
            }
            object = false;
        }
        return _54.c("g", (boolean)object, 6087958003788669973L, (long)l2);
    }

    public _54(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x591A6C679DE2L;
        long l5 = l3 ^ 0x24939CB40906L;
        long l6 = l3 ^ 0x11683E2E2044L;
        long l7 = l3 ^ 0x1080CE759D7L;
        long l8 = l3 ^ 0x2EEB0EE810DEL;
        long l9 = l3 ^ 0x3B15D7FF5915L;
        long l10 = l9 >>> 8;
        int n = (int)(l9 << 56 >>> 56);
        long l11 = l3 ^ 0x4750A96DA82DL;
        long l12 = l3 ^ 0x32A008CC3CBDL;
        long l13 = l3 ^ 0x58903A49475FL;
        long l14 = l3 ^ 0x4C6BB07D3610L;
        super((int)_54.a("o", 19777, (long)(0x317BAF72C8774B0DL ^ l2)), -1, (_4r)((Object)_54.c("\u00e7", 81786095607809140L, (long)l2)), l11);
        this.cfr_renamed_236 = new _9E((int)_54.a("o", 868, (long)(0x27DDC4F518C80537L ^ l2)), l4, (Enum)((Object)_54.c("\u00e7", 76823527252763730L, (long)l2)), _9L.class);
        this.cfr_renamed_237 = new _92((int)_54.a("o", 3833, (long)(0x4662D888316388A1L ^ l2)), 0.0, l7, 255.0, 100.0, 1.0);
        this.cfr_renamed_3 = new _92((int)_54.a("o", 12031, (long)(0x4B61824E2DCF28B0L ^ l2)), 1.0, l7, 10.0, 1.0, 1.0);
        this.cfr_renamed_2 = new _9r((int)_54.a("o", 31543, (long)(0x7470CB08B78FFD73L ^ l2)), false, l6);
        this.cfr_renamed_238 = new _92((int)_54.a("o", 16816, (long)(0x43E0FF14D60CC7F9L ^ l2)), 0.1, l7, 5.0, 0.4, 0.1);
        this.cfr_renamed_6 = new _9r((int)_54.a("o", 25312, (long)(0x7A1B6884F2B1E4BAL ^ l2)), false, l6);
        this.cfr_renamed_9 = new _9r((int)_54.a("o", 15713, (long)(0x131FC105F8C83B3EL ^ l2)), true, l6);
        this.cfr_renamed_8 = new _9E((int)_54.a("o", 15157, (long)(0x629DA276F03D3D63L ^ l2)), l4, (Enum)((Object)_54.c("\u00e7", 80386437771884065L, (long)l2)), _4S.class);
        this.cfr_renamed_0 = new _9E((int)_54.a("o", 17548, (long)(0x4D6934B5F72342CAL ^ l2)), l4, (Enum)((Object)_54.c("\u00e7", 77670318572045682L, (long)l2)), _4C.class);
        this.cfr_renamed_223 = new _94((int)_54.a("o", 2467, (long)(0xFE22C7962E38FE3L ^ l2)), (int)_54.a("o", 5848, (long)(0x387661B426CB90A8L ^ l2)), (int)_54.a("o", 29622, (long)(0x7B26FDEA6B31F5E1L ^ l2)), (int)_54.a("o", 25136, (long)(0x71777F0B71B66465L ^ l2)), l12);
        int n2 = _3C.cfr_renamed_4();
        this.cfr_renamed_1 = new _94((int)_54.a("o", 2527, (long)(0x40F52FDAF8558F9AL ^ l2)), (int)_54.a("o", 15713, (long)(0x131FC105F8C83B3EL ^ l2)), (int)_54.a("o", 15713, (long)(0x131FC105F8C83B3EL ^ l2)), (int)_54.a("o", 14777, (long)(0x57CF183FE64EBFE5L ^ l2)), l12);
        this.cfr_renamed_239 = new _94((int)_54.a("o", 10525, (long)(0x4A0E25F9AAB7AF49L ^ l2)), (int)_54.a("o", 6252, (long)(0x3109C291DDC49E27L ^ l2)), (int)_54.a("o", 9089, (long)(0x34AEA71609E8A5CCL ^ l2)), (int)_54.a("o", 9089, (long)(0x34AEA71609E8A5CCL ^ l2)), l12);
        this.cfr_renamed_4 = new _94((int)_54.a("o", 12805, (long)(0x1644022645AAB447L ^ l2)), (int)_54.a("o", 5848, (long)(0x387661B426CB90A8L ^ l2)), (int)_54.a("o", 5848, (long)(0x387661B426CB90A8L ^ l2)), (int)_54.a("o", 5848, (long)(0x387661B426CB90A8L ^ l2)), l12);
        this.cfr_renamed_7 = new HashMap();
        Object[] objectArray = new Object[3];
        objectArray[2] = () -> this.cfr_renamed_8(l5);
        objectArray[1] = (int)((byte)n);
        objectArray[0] = l10;
        _54.c("\u00ba", (Object)_54.c("\u00ec", (Object)this, 81251402381971069L, (long)l2), (Object)objectArray, 81299414165624191L, (long)l2);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = () -> this.cfr_renamed_8(l5);
        objectArray2[1] = (int)((byte)n);
        objectArray2[0] = l10;
        _54.c("\u00ba", (Object)_54.c("\u00ec", (Object)this, 83167133561223334L, (long)l2), (Object)objectArray2, 81299414165624191L, (long)l2);
        int n3 = n2;
        try {
            Object[] objectArray3 = new Object[3];
            objectArray3[2] = () -> this.cfr_renamed_9(l8);
            objectArray3[1] = (int)((byte)n);
            objectArray3[0] = l10;
            _54.c("\u00ba", (Object)_54.c("\u00ec", (Object)this, 79819730428288055L, (long)l2), (Object)objectArray3, 81299414165624191L, (long)l2);
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = () -> this.cfr_renamed_9(l8);
            objectArray4[1] = (int)((byte)n);
            objectArray4[0] = l10;
            _54.c("\u00ba", (Object)_54.c("\u00ec", (Object)this, 79067025262032852L, (long)l2), (Object)objectArray4, 81299414165624191L, (long)l2);
            Object[] objectArray5 = new Object[3];
            objectArray5[2] = () -> this.cfr_renamed_9(l8);
            objectArray5[1] = (int)((byte)n);
            objectArray5[0] = l10;
            _54.c("\u00ba", (Object)_54.c("\u00ec", (Object)this, 85283359609036155L, (long)l2), (Object)objectArray5, 81299414165624191L, (long)l2);
            Object[] objectArray6 = new Object[3];
            objectArray6[2] = () -> this.cfr_renamed_5(l14);
            objectArray6[1] = (int)((byte)n);
            objectArray6[0] = l10;
            _54.c("\u00ba", (Object)_54.c("\u00ec", (Object)this, 78442140256942580L, (long)l2), (Object)objectArray6, 81299414165624191L, (long)l2);
            Object[] objectArray7 = new Object[3];
            objectArray7[2] = () -> this.cfr_renamed_9(l8);
            objectArray7[1] = (int)((byte)n);
            objectArray7[0] = l10;
            _54.c("\u00ba", (Object)_54.c("\u00ec", (Object)this, 85436192990317487L, (long)l2), (Object)objectArray7, 81299414165624191L, (long)l2);
            Object[] objectArray8 = new Object[3];
            objectArray8[2] = () -> this.cfr_renamed_9(l8);
            objectArray8[1] = (int)((byte)n);
            objectArray8[0] = l10;
            _54.c("\u00ba", (Object)_54.c("\u00ec", (Object)this, 76984727836429632L, (long)l2), (Object)objectArray8, 81299414165624191L, (long)l2);
            Object[] objectArray9 = new Object[3];
            objectArray9[2] = () -> this.cfr_renamed_9(l8);
            objectArray9[1] = (int)((byte)n);
            objectArray9[0] = l10;
            _54.c("\u00ba", (Object)_54.c("\u00ec", (Object)this, 84524218445232160L, (long)l2), (Object)objectArray9, 81299414165624191L, (long)l2);
            Object[] objectArray10 = new Object[3];
            objectArray10[2] = () -> this.cfr_renamed_9(l8);
            objectArray10[1] = (int)((byte)n);
            objectArray10[0] = l10;
            _54.c("\u00ba", (Object)_54.c("\u00ec", (Object)this, 81863818509309779L, (long)l2), (Object)objectArray10, 81299414165624191L, (long)l2);
            Object[] objectArray11 = new Object[3];
            objectArray11[2] = () -> this.cfr_renamed_9(l8);
            objectArray11[1] = (int)((byte)n);
            objectArray11[0] = l10;
            _54.c("\u00ba", (Object)_54.c("\u00ec", (Object)this, 78278186794781735L, (long)l2), (Object)objectArray11, 81299414165624191L, (long)l2);
            _95[] nullArray = new _95[_54.a("o", 26248, (long)(0x6C9EE0FF396060DAL ^ l2))];
            nullArray[0] = _54.c("\u00ec", (Object)this, 79899625075770134L, (long)l2);
            nullArray[1] = _54.c("\u00ec", (Object)this, 81251402381971069L, (long)l2);
            nullArray[2] = _54.c("\u00ec", (Object)this, 83167133561223334L, (long)l2);
            nullArray[3] = _54.c("\u00ec", (Object)this, 79819730428288055L, (long)l2);
            nullArray[4] = _54.c("\u00ec", (Object)this, 79067025262032852L, (long)l2);
            nullArray[5] = _54.c("\u00ec", (Object)this, 82500264748490902L, (long)l2);
            nullArray[_54.a("o", 7979, (long)(0x64B8C6CE9B24996AL ^ l2))] = _54.c("\u00ec", (Object)this, 85283359609036155L, (long)l2);
            nullArray[_54.a("o", 11027, (long)(0x54CC443AF9432D59L ^ l2))] = _54.c("\u00ec", (Object)this, 78442140256942580L, (long)l2);
            nullArray[_54.a("o", 3495, (long)(0x157F7AEBAA868BE4L ^ l2))] = _54.c("\u00ec", (Object)this, 85436192990317487L, (long)l2);
            nullArray[_54.a("o", 13047, (long)(0x1C473AFAC896B4A9L ^ l2))] = _54.c("\u00ec", (Object)this, 76984727836429632L, (long)l2);
            nullArray[_54.a("o", 1682, (long)(0x23FFB248615F80C3L ^ l2))] = _54.c("\u00ec", (Object)this, 84524218445232160L, (long)l2);
            nullArray[_54.a("o", 327, (long)(0x57DC7B31E5CE0717L ^ l2))] = _54.c("\u00ec", (Object)this, 81863818509309779L, (long)l2);
            nullArray[_54.a("o", 15551, (long)(0x4982243BBF83BAF8L ^ l2))] = _54.c("\u00ec", (Object)this, 78278186794781735L, (long)l2);
            Object[] objectArray12 = new Object[2];
            objectArray12[1] = nullArray;
            objectArray12[0] = l13;
            _54.c("\u00ba", (Object)this, (Object)objectArray12, 79164547384476246L, (long)l2);
            if (_4w.cfr_renamed_8() == null) {
                _3C.cfr_renamed_7(++n3);
            }
        }
        catch (MatchException matchException) {
            throw _54.a(matchException);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                _54.b = l.a(-5271358368050899636L, 7064394906999474698L, MethodHandles.lookup().lookupClass()).a(264354043389417L);
                _54.j = new Object[169];
                _54.k = new String[169];
                _54.b();
                _54.f = new HashMap<K, V>(13);
                var0 = _54.b ^ 95283244320358L;
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
                var8_3 = new long[34];
                var5_4 = 0;
                var6_5 = "\u0083y\u00e4`\u0099?f\u00ee\u00dc\u009cTA+\u00d3\u00bbu\u0081\u00c6\u0081w\u00ed\u00f6+\u00af9\u00ed\u00f89\u00fe}]G\u008db]A\u00fb\f\u00c1\u00edE\u00d0\"\u00de\u009c0\u000b\u00eb(\u00c6\u00f1\u0016:\u00a9\b\u009c\b\u0006\u00cb\u0098m\u0083\"Z\u00e6\u00d0\u00e3I\u0081\u00a3W\u00cb\u00c5\u00b7\u009b\u00fa\u00d2\u00e8\u0018_.v\u00f0\u00ce\u00df\u0001(\u00deW\u009f\u00c8\u0085\u009a\u0083s\u00fd8\u00b1A\u0083\u00cd@\u00b0\u00c6\u00fb\u00fb-\u009a\u00b3\u00f4\u00bd{\u0081p\u00f6\u008c\u00eb\u00cf\u00c5&<\u00e8\u00f3u\u00f6t\u00ba\u009d\u0016o\u00e8b%\u0080\u0019\u00a4\u00b3\u0087\u00cab\u001d\u000e\u00fb\u00b5g\u00ef\u0006\u00fcb}\u009d|\u00abq\\\u00d3R\u00e72\u00f8\u009b\u0016B*\u0098\u008e\u00e2)sZ\u0086Y7\u00ad\u008d\u00a6\u007f\u00c8\u00d2\u00e6\u00bfT\u00de\u0082\u0001\u00b5\u000f\u00c0\u00df\u00c0\u00b7\u00b9\u0098~|\u00ac\u0003c\u00f1\u00dbyI8\u0096\u00b7@\u00bcT\u0017\u00c1\u0015\u00ed\u00fdm\u000b\u00f7\u00efO\u00b0\u0091'\u00ee\u00f5\u008d\u00b3O\u00cf\u0081\u00e9\u00b5{|\u00a7\u00c2\u00f4)F\u00af.\u00c0\u00f9\u00b1\u009a\u00830Hf(\\\u0012\u00ff\\\b\u00f478";
                var7_6 = "\u0083y\u00e4`\u0099?f\u00ee\u00dc\u009cTA+\u00d3\u00bbu\u0081\u00c6\u0081w\u00ed\u00f6+\u00af9\u00ed\u00f89\u00fe}]G\u008db]A\u00fb\f\u00c1\u00edE\u00d0\"\u00de\u009c0\u000b\u00eb(\u00c6\u00f1\u0016:\u00a9\b\u009c\b\u0006\u00cb\u0098m\u0083\"Z\u00e6\u00d0\u00e3I\u0081\u00a3W\u00cb\u00c5\u00b7\u009b\u00fa\u00d2\u00e8\u0018_.v\u00f0\u00ce\u00df\u0001(\u00deW\u009f\u00c8\u0085\u009a\u0083s\u00fd8\u00b1A\u0083\u00cd@\u00b0\u00c6\u00fb\u00fb-\u009a\u00b3\u00f4\u00bd{\u0081p\u00f6\u008c\u00eb\u00cf\u00c5&<\u00e8\u00f3u\u00f6t\u00ba\u009d\u0016o\u00e8b%\u0080\u0019\u00a4\u00b3\u0087\u00cab\u001d\u000e\u00fb\u00b5g\u00ef\u0006\u00fcb}\u009d|\u00abq\\\u00d3R\u00e72\u00f8\u009b\u0016B*\u0098\u008e\u00e2)sZ\u0086Y7\u00ad\u008d\u00a6\u007f\u00c8\u00d2\u00e6\u00bfT\u00de\u0082\u0001\u00b5\u000f\u00c0\u00df\u00c0\u00b7\u00b9\u0098~|\u00ac\u0003c\u00f1\u00dbyI8\u0096\u00b7@\u00bcT\u0017\u00c1\u0015\u00ed\u00fdm\u000b\u00f7\u00efO\u00b0\u0091'\u00ee\u00f5\u008d\u00b3O\u00cf\u0081\u00e9\u00b5{|\u00a7\u00c2\u00f4)F\u00af.\u00c0\u00f9\u00b1\u009a\u00830Hf(\\\u0012\u00ff\\\b\u00f478".length();
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
                    var6_5 = "\u00f4\u001b\u00b1t\u00aa:\u008c\u00a9Io\u00ab-\u00cd\u00db>l";
                    var7_6 = "\u00f4\u001b\u00b1t\u00aa:\u008c\u00a9Io\u00ab-\u00cd\u00db>l".length();
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
        _54.d = var8_3;
        _54.e = new Integer[34];
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
            case 0 -> 63;
            case 1 -> 6;
            case 2 -> 53;
            case 3 -> 55;
            case 4 -> 23;
            case 5 -> 40;
            case 6 -> 34;
            case 7 -> 39;
            case 8 -> 17;
            case 9 -> 25;
            case 10 -> 46;
            case 11 -> 1;
            case 12 -> 45;
            case 13 -> 4;
            case 14 -> 61;
            case 15 -> 5;
            case 16 -> 7;
            case 17 -> 22;
            case 18 -> 57;
            case 19 -> 19;
            case 20 -> 59;
            case 21 -> 48;
            case 22 -> 11;
            case 23 -> 16;
            case 24 -> 44;
            case 25 -> 24;
            case 26 -> 41;
            case 27 -> 12;
            case 28 -> 2;
            case 29 -> 31;
            case 30 -> 14;
            case 31 -> 60;
            case 32 -> 35;
            case 33 -> 43;
            case 34 -> 20;
            case 35 -> 10;
            case 36 -> 49;
            case 37 -> 62;
            case 38 -> 58;
            case 39 -> 36;
            case 40 -> 9;
            case 41 -> 52;
            case 42 -> 37;
            case 43 -> 29;
            case 44 -> 32;
            case 45 -> 8;
            case 46 -> 30;
            case 47 -> 3;
            case 48 -> 42;
            case 49 -> 33;
            case 50 -> 0;
            case 51 -> 47;
            case 52 -> 26;
            case 53 -> 27;
            case 54 -> 38;
            case 55 -> 51;
            case 56 -> 54;
            case 57 -> 56;
            case 58 -> 15;
            case 59 -> 50;
            case 60 -> 28;
            case 61 -> 13;
            case 62 -> 18;
            default -> 21;
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
        _54.k[n3] = new String(cArray);
        return n3;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _54.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = "j&\ne$\u0018w3\b$!D:\u0000";
        objectArray[1] = "/,\u0006@d(29\u0004\u0001at~}";
        objectArray[2] = "2\b\fNbF/\u001d\u000e\u000fg\u001ao\u001f";
        objectArray[3] = "*\u0011a\u0018l(7\u0004cYitw@";
        objectArray[4] = "59\u00070I\b(,\u0005qLTi\u001e";
        objectArray[5] = Integer.TYPE;
        _54.k[5] = "java/lang/Integer";
        objectArray[6] = "FS.\u0005D|[F,DA \u001bs";
        objectArray[7] = "\t*zz#b\u0017\"`5Dc\u00069mobe";
        objectArray[8] = "\u0013;j3C\u007f\u00184{|\"q\u0013?\u007f&";
        objectArray[9] = "\u0017\b\u0013\u000fxq\u0017\b\u0004St~\rC\u0004Mtk\n2T\u0014&*";
        objectArray[10] = Float.TYPE;
        _54.k[10] = "java/lang/Float";
        objectArray[11] = "t\u0002'\u0003!\u0013t\u00020_-\u001cnI0A-\ti8b\u001byM";
        objectArray[12] = " tGk}{>|]$\u0006[\u0003Q";
        objectArray[13] = "\u0015Kq\u0017>V\b^sV;\nH\u001c";
        objectArray[14] = "E7~r\u001ffN8o=|k[>";
        objectArray[15] = "v\u001d)i\u001b\u0015\u0003=\"f\nZb3)m\u000e\u0000\u0016";
        objectArray[16] = Double.TYPE;
        _54.k[16] = "java/lang/Double";
        objectArray[17] = Long.TYPE;
        _54.k[17] = "java/lang/Long";
        objectArray[18] = Boolean.TYPE;
        _54.k[18] = "java/lang/Boolean";
        objectArray[19] = "P\"|1(IP\"km$FJiks$SM\u00189/q\u0011";
        objectArray[20] = "F7g%AjX?}j\"~\\";
        objectArray[21] = "lbk92dqwix78<T";
        objectArray[22] = "\u0000%)yF[u\u0005\"vW\u0014\u0014\u000b)}SN`";
        objectArray[23] = "_%?\u0011$h*\u00054\u001e5'K\u000b?\u00151}?";
        objectArray[24] = "d\f\u0004\u001cu\u007fd\f\u0013@yp~G\u0013^yey6C\u0003(";
        objectArray[25] = "ssk'*\\ss|{&Si8|e&FnI(=q";
        objectArray[26] = "%s\u0002o5\u001b%s\u001539\u0014?8\u0015-9\u00018I@r`";
        objectArray[27] = "\r\u0001IB)\u0016\u000f\u001f\u0000!\"\r\u0010\u001aVX%";
        objectArray[28] = "P\u0005`\u0006$pR\u001b)e/kM\u001e\u007f\u001c(|";
        objectArray[29] = "):\u0012\u0007!W4/\u0010F$\u000by4";
        objectArray[30] = "\u0015i-/m;`I& |t\u0001G-+x.u";
        objectArray[31] = "=}*Q\u001eg?cc)\u0011k&`?L\u0012";
        objectArray[32] = "lM\u001dv}\u0010qX\u001f7xL;f";
        objectArray[33] = "\u0013\u0013pwx*f3{xie\u0007=psm?s";
        objectArray[34] = Void.TYPE;
        _54.k[34] = "java/lang/Void";
        objectArray[35] = "}4%\u001b\u001d&c<?T`6c";
        objectArray[36] = "qO`K?\u001foGz\u0004w\u001fuMbC~\u00045~dOu\u0003xObO";
        objectArray[37] = ":\u0004R\u0015{\u0010O$Y\u001aj_.*R\u0011n\u0005Z";
        objectArray[38] = "YR98\u0000\u0011,r27\u0011^M|9<\u0015\u00049";
        objectArray[39] = "c+M\\\u0011S}#W\u0013sOz>";
        objectArray[40] = "<2\f J]I\u0012\u0007/[\u0012(\u001c\f$_H\\";
        objectArray[41] = "\u000b.vk\u000b&~\u000e}d\u001ai\u001f\u0000vo\u001e3k";
        objectArray[42] = "J4S\u0007I\n?\u0014X\bXE^\u001aS\u0003\\\u001f*";
        objectArray[43] = "Y.\u0007ksIR!\u0016$\u0018KF\"";
        objectArray[44] = "2W\u00010\u0019{Gw\n?\b4&y\u00014\fnR";
        objectArray[45] = "2Rh,\u0012:/Gjm\u0017fo{";
        objectArray[46] = "'\u001f8=\u0007i:\n:|\u00025u\u0002";
        objectArray[47] = "\u001c=L<cui\u001dG3r:\b\u0013L8v`|";
        objectArray[48] = "]\u000f<(\u0005\\C\u0007&gX]E\u000b+$\u0005zC\u001c/(F";
        objectArray[49] = "p\u001eV'Z\u0014m\u000bTf_H-N";
        objectArray[50] = "Aw0\u0003X\u00034W;\fILUY0\u0007M\u0016!";
        objectArray[51] = "/\traH22\u001cp Mn\u007f\u001e";
        objectArray[52] = "Nct\u000bS7;C\u007f\u0004BxZMt\u000fF\".";
        objectArray[53] = "\u0007t[G\u0002~\u0007tL\u001b\u000eq\u001d?L\u0005\u000ed\u001aN\u0018]]";
        objectArray[54] = "W}md\beW}z8\u0004jM6z&\u0004\u007fJG+y]";
        objectArray[55] = "\u0012/3\rt\u0015\u000f:1LqIO2";
        objectArray[56] = "hTK\fzVhT\\PvYr\u001f\\NvLun\r\u0016$";
        objectArray[57] = "\u000eN;,=W\u0013[9m8\u000bSb";
        objectArray[58] = "\rt\\Z\"sxTWU3<\u0019Z\\^7fm";
        objectArray[59] = "N\u0018Z!PV;8Q.A\u0019Z6Z%EC.";
        objectArray[60] = "_''i*s*\u0007,f;<K\t'm?f?";
        objectArray[61] = "u\u0005YJ\u0014\u0014\u0000%RE\u0005[a+YN\u0001\u0001\u0015";
        objectArray[62] = "O\u0019\u0007M\u0006L:9\fB\u0017\u0003[7\u0007I\u0013Y/";
        objectArray[63] = "IE\u001c5+\u001eBJ\rzG\u001dLH\u000f5k";
        objectArray[64] = "]Ob+\u0015\u0003\rD#I>\u0013\u000e-f+@\u001f\fS6 \u0001";
        objectArray[65] = "+%W\u0016.\f66_wonc'DN%\u0007#uK\u0018";
        objectArray[66] = "\u000b)kb\u0005X\u0001shvh\u00190.07\u001aF\u0001sjs\u0016";
        objectArray[67] = "KS=gHPV@5\u0006\f2\u0005@{d^X\u0003F#<";
        objectArray[68] = "\u0019\u0006w\u0012)i\\\u000e}\u0004-\u000fN^y\u0019,X\u0019\u0004.F@eARy\u001a&e_F+";
        objectArray[69] = "\u000eJ$\u001c\u0017OQ\u0017<\u0011|J]Q$\n\u0010x\f\u001d{]E/\u000fC5\u000f\u0018\u001fVG-W|\u0014V\u00146\rMI\fP:mGI\t_$\\\u001a\u0013MSDV\u001a\u0016BMu\u000b@RN-";
        objectArray[70] = "J/cw\u000b\\\u001di(|\u000eaO\u0014*-\u000e]\u0018ys}]\u0000\u000b\u0014(.\t\r\u001ej\"t\n\u0019s";
        objectArray[71] = "\u0016L\u001e#\ry\u000e\u001d\u0001{2y\u001e@lxT%\rF]%\u000ea\u0001&W%\u000bn\u001f\u0017\n\u007fOb\u007f\u001d\nz@|N@P>L\u001c";
        objectArray[72] = "^EOb a\u0001\u0015\u001f9P<o\u0013N:lm\u0002J\u001ei1~o@\u0010m=a\t@\u000eyo\u0006";
        objectArray[73] = "\u0017=\b\u0005hfM\u007fD[P9.*\u0006^`h\u0016pFE!\u0003E$\u0018\\-8\u0016;\u0015\u0003P";
        objectArray[74] = "\u0002 \u001f\u0016JuA \u0004\u0017siP#\u001e\u0013\u001f[\u0007dEML\fW>\u0013\u0019\u0014jW \u0007Ks";
        objectArray[75] = "(VB}}10\u0007]%B1(L0\",%#X\u0000{(={<\u000fs36%\fVw+nA\u0003^l 0qZZtxT";
        objectArray[76] = "8L\u0016b(\u001d1NRcW\u0010/F\u000eo>\u0013U\u0011\t0%\u0017dLSt)w";
        objectArray[77] = "\u0003\u0017&>/3\u0016\u000018\u0010(\u0002\u0013? |\u001aSRgy\u0010v\tV-'!+S\u0012!G";
        objectArray[78] = "^-I\u001c)\f\u001e\u007fFJ[Zd}\u001d\u001fg\u000e\t$ML:\u001dd\u007f\u001e\u00187\b\u001auD\u001b#e";
        objectArray[79] = "f\fT`\u001a5h\u0014W!t%h\u001f\ts#r6HQ\u001f\u00146n\u001c\u0000p\u0018;w\u0018";
        objectArray[80] = "\u001fK9V\u0006$KP1Rv8\u000f\\Z\u0010\f9\f\u0018<M\f}\u0014 gW\u000f>JF:WK&r\u001d T\bx\u0014@ \u0010\u0010@";
        objectArray[81] = "j2\"\u001f\u0003(/:(\t\u0007N=j,\u0014\u0006\u0019j0{Ij$2f,\u0017\f$,r~";
        objectArray[82] = "v[,]d\nu^wL\u0000IyM\u0017_dJzIv\u00078\u000bu1uW;Rp\tvR`C\u0014";
        objectArray[83] = "m\u0003^,_a.\u0003E-fv3\u0011[\"1&hG\u0002N]~k\u000e_\u007f\u0000$/\u0002";
        objectArray[84] = "\u0010bV\u0018\u0014\u0018M#\u001aCt\\s8\u0002B\u0013\u001cHk\u001dOL";
        objectArray[85] = ")3GP-Nj3\\Q\u0014R{0FUx`+|\u001c\u0003\u0014\u000e//I[rK'%__\u0014";
        objectArray[86] = "?$!`\u000e o/`\u0002&3l:\u0018?\u0000g`*fo\u000b&";
        objectArray[87] = "\\\u001f)i\\\u007f\u0003B1d7z\u000f\u0004)\u007f[H[Er&\f\u001f]\u00168zS/\u0004\u0012 \"7 \f\t+|\u0007y\b\u0011s\u0018\bq\u0013\u001a-(Qu\u000bBI'Yn\u0000\u001cy~]vXx";
        objectArray[88] = "z%E\u0016?\\9%^\u0017\u0006K$7@\u0018Q\u0018te\u001dtlD(7C\u0012lZ<e";
        objectArray[89] = "[ \u001a\u0018.5\u0018 \u0001\u0019\u0017)\t#\u001b\u001d{\u001b^d@C'L\u000e>\u0016\u0017p*\u000e \u0002E\u0017";
        objectArray[90] = "Oq[FyRW!]\u0016\u001ebV00V/C_'JN\u007fE\u000f";
        objectArray[91] = "t'.sNx-/$%1/\u0011{~x\r}|\".+Pn\u0011$;,\twc<'}\u000e\u0016";
        objectArray[92] = "L\u001c\u0017\u0011\u0010F\u0018\u0007\u001f\u0015`AL\u0006/\u0007\u001c\"FF\b\u001a_\u0013G\u0017\b\u0012`";
        objectArray[93] = "#<d\u0000'qf4n\u0016#\u0017tdj\u000b\"@#>=SN}{hj\b(}e|8";
        objectArray[94] = "\u001e&\u00176I\bZdG;\u0017m|}\u0014$Um\u001e&\u00176I\bZdG;\u0017";
        objectArray[95] = "cP Yi,~C(8,0\u0011\u00011S)<xAc\\\u007f";
        objectArray[96] = "w\u0005\tul\u0015*DE.\fV\u0014\r\u0002$6\u001deDZ.3P";
        objectArray[97] = "B=m\n1\u001a\u001b5g\\NI\u0017X;\u0004tHL5bT'\u0015_XdA LF*|]qK'";
        objectArray[98] = "^\u001a-\f\u0018\u0014FK2T'\u0014V\u0016_\u0006F\u001cZ\u00179\u0006X\b\bp5\rJ\u001cP\u00165\u0013^N7\u001a>\u0001J\u0016Q\u001a \u0015\u0018q";
        objectArray[99] = "H?h]H\u0006N90\u0005']t~i\u0005\u001b\u0007\u0019'9VF\u0014t,2]@\u0011O\u007f-P\u001fl";
        objectArray[100] = "~M@9\u0000D{\u0014\u001d=;\u001axGYoG\u001c~*\u001e9W\u0002uS\u001d;\u0004B\u0004";
        objectArray[101] = "y\u0016:k.y$Wv0N8U'3lt<qJj<'ab'l) 8{Ut5q?\u001a";
        objectArray[102] = "oq\u001d\u0007]08qASDM((C\u001eP\n8AL\u0007_*+z\u001f\u0018RuVx\u0017YY-+/\u0017\u0005\r4V";
        objectArray[103] = "\u0006$PE+`_,Z\u0013T?cx\u0000Nhe\u000e!P\u001d5vc'E\u001alo\u0011?YKk\u000e";
        objectArray[104] = "TR\\8\"8\u001d\nV=oI\u0003\bXf?\u001eTR\b;S#\f\u0004Xe5#\u0012\u0010\n";
        objectArray[105] = "|O$<_\u0018d\u001f\"l88o\u00153RFSi\u0010((^\u0003o@";
        objectArray[106] = "auXnhdom[/\u0006\u007fcw\u0001vjM41_!=\u001abs\u0018h9dwd\u000fn\u0006";
        objectArray[107] = "\u001aU\u000e.kQ_]\u00048o7M\r\u0000%n`\u001aWW{\u0002]B\u0001\u0000&d]\\\u0015R";
        objectArray[108] = "\t7*.\u0018\u0016J71/!\n[4++M8\bpuw!PX9)(\u0011\t\\!qL";
        objectArray[109] = "\rN\u0000]1*HF\nK5LZ\u0016\u000eV4\u001b\rLY\u000fX&U\u001a\u000eU>&K\u000e\\";
        objectArray[110] = "\u001e*H\u001ay@\u0014pK\u000e\u0014\u0005%-\u0013Of^\u0014pI\u000bj";
        objectArray[111] = "N\u001bMSL\u0016G\u0019\tR37Y\u001aOCS\u0015B\u00074UU\u0005H\u0002^\\WAI";
        objectArray[112] = "d\u000e#ogJ'\u000e8n^]:\u001c&a\t\u000ejAs\r4R6\u001c%k4L\"N";
        objectArray[113] = " _Z.\u0015M}\u001e\u0016uu\bC\f\u0000-\u0015P{\u000f\u0005v\u0004";
        objectArray[114] = "\u0015\u000eH\b<fJ^\u0018SL<$XIPpjI\u0001\u0019\u0003-y$Z\u0010S>a\u0015\u0007J\u00172\u0001";
        objectArray[115] = "|IfS\u0013!v\u0013eG~oGN=\u0006\f?v\u0013gB\u0000";
        objectArray[116] = "V\u000bSdL2C\u001cDbs)W\u000fJz\u001f\u001b\u0006O\u001b sw\\JX}B*\u0006\u000eT\u001d";
        objectArray[117] = ".V k\u0010\u001c$\f#\u007f}[\u0015S\"=A\tx\nrn\u001c\u001a\u0015Q!:\u0011\u000fk[{9\u0005b";
        objectArray[118] = "\u0002?.\u000378\u001f,&br;ph.\\,5\u001an(\u0004t";
        objectArray[119] = "\\6i4eaA%aU\"\u0003\u0017 ck$fMb/5";
        objectArray[120] = "oo\tk\u0010=lmZ+a\"? \u0019\u0012\\>+.]t\u0001>o6e";
        objectArray[121] = "DY\u0010\u0000)'\u0007Y\u000b\u0001\u0010;\u0016Z\u0011\u0005|\tF\u0018O]\u0010n\u001dC@\u0004|'CMLb";
        objectArray[122] = ";rrt!_&az\u0015dqI(e+:M.w5{a";
        objectArray[123] = "];\u001ei\r\u0015\u001e;\u0005h4\t\u000f8\u001flX;[{A;\u000el]*\u000eiP\\\u0004.\u001614";
        objectArray[124] = "[\u0006 C\u000b;\u0006Gl\u0018krx7)DQ~SZp\u0014\u0002#@7v\u0001\u0005zYEn\u001dT}8";
        objectArray[125] = "^\u00126\u000fT@@\u0015wJo\u0000!\u00103\u000bSRLIcX\u000eA!Ov_WXSWj\u000eP9";
        objectArray[126] = "V\u001a\u0010\u0019\"S\u0015\u001a\u000b\u0018\u001bO\u0004\u0019\u0011\u001cw}S^JA\"*\u0003\u0004\u001c\u0016|L\u0003\u001a\bD\u001b";
        objectArray[127] = "P2\u0007\u0003\nwE%\u0010\u00055lQ6\u001e\u001dY^\u0000vNK52Zs\f\u001a\u0004o\u00007\u0000z";
        objectArray[128] = "8^\u0006\u0017+mlE\u000e\u0013[f8IeQ!p+\r\u0003\f!435X\u0016\"wmS\u0005\u0016foU";
        objectArray[129] = "O0\u0017v\u0016\u0010Wa\b.)\u0010O*e|H\u0018K=\u0003|V\f\u0019Z\u000fwD\u0018A<\u000fiPJ&0\u0004{D\u0012@0\u001ao\u0016u";
        objectArray[130] = "x0S\u001b~0rjP\u000f\u0013r\u0006\fU\u0011*<#=\bKn0";
        objectArray[131] = "^s5\u0018go\u001e!:N\u0015:d#a\u001b)m\tz1Ht~d!b\u001cyk\u001a+8\u001fm\u0006";
        objectArray[132] = "j\rLQ7\u0019w\u001eD0t{)\t\nR>\u001cvYZ\t";
        objectArray[133] = "(/x\u0004'A&7{EIQ&<%\u0017\u001e\u0006ya~{(\u000696\u007f\u00074E9`";
        objectArray[134] = "p32\u0012pZ65#\u000fs:,f4\u001eqV\u001e6v@):ym-OpV03#C\u0016";
        objectArray[135] = "\"py\u001aG5}-a\u0017,0qky\f@\u0002%)%P\u0012Uvvt\u0006K3vh`T,?}zt\fJ?cn&kF4qz~\rF*e(\u0019\u0001M8qp\u007f\u0001S,#\u0017";
        objectArray[136] = "VSV>\r+N\u0002If2+^_$a\\?]]\u00148X'\u00059\u001b0C,[\tB4[t?\u0006J/P*\u000f_N7\bN";
        objectArray[137] = "\u00031\"GQu\\l:J:pP*\"QVB\u0004h~\r\u000b\u0015\u000283T^%[<+\f:*S' R\nsW?x6\u0005{L4&\u0006\\\u007fTlB\tTd_2rPP|\u0007V";
        objectArray[138] = "=b\u000ect\u007ft<\u0000o\u0012~ty\u00026i\u00130~\u0012,*um~V4\u0012xif\f/)+vkSR";
        objectArray[139] = "<8\u0002_\u0000\nayN\u0004`L_0\r]\\\u00182i]\u000e\u0001\u000b_mU\u001b[C01B_\u0001s";
        objectArray[140] = "D\u0001K\u001c\u0005aY\u0012C}@\u0003[\u0001P\u0006\fg\u000f\u001aX\u0002";
        objectArray[141] = "){4\u001ay?4h<{;]bm>E888/r\u001b";
        objectArray[142] = "!8(\u001b8'x0\"MGyD8\"Ev6*a*O ";
        objectArray[143] = "?\u007f>\u0014K\u0012>.>\u001ctY5+%\u001a\u0019b6N:X\bG'\u007f8\u0006\u0019[X%&\u0006\u0013^cv9\u000bL#";
        objectArray[144] = "q\u0016m\u0010\u001a>-\u0001)J* \u0015N\u007fZH5%\u0017{B\u0010";
        objectArray[145] = "Fb\n\u0006O\u001f\u001fj\u0000P0Nn\u0007\\\b\nMHj\u0005XY\u0010[\u0007\u0003M^IBu\u001bQ\u000fN#";
        objectArray[146] = "?O+ly[\"\\#\r<\u0002M\u001e:f9K$^hio";
        objectArray[147] = "cQ\u0010v\u0015+k\\\u00135l\u001e\\xb\u00036DcQ\u0010v\u0015+k\\\u00135";
        objectArray[148] = "N\u0015l\u0014\u0003!KL1\u00108eH\bbB]\u001eD\u001doAXuN\u000b~L8";
        objectArray[149] = "-}lb\u0006}d%fgK\fz'h<\u001b[-}8bwfu+h?\u0011fk?:";
        objectArray[150] = "ow??\u000ezs4?i0cc2!?\\Q7~}e\u000e\u0006t)\"g\u000b9qp\u007fc0";
        objectArray[151] = "-D\u0004%yPhL\u000e3}6z\u001c\n.|a-F]r\u0010\\u\u0010\n-v\\k\u0004X";
        objectArray[152] = "s-.3h`:u$6%\u0011$w*muFs-z1\u0019{+{*n\u007f{5ox";
        objectArray[153] = "i\u000e5/[D*\u000e..bX;\r4*\u000ejoNj}[=i\u001f%/\u0006\r0\u001b=wb";
        objectArray[154] = "\u0016dNVo\"\u001a5\f\u001e\fag3\u000b\u001e06\nj[Mm%g{Z^~>\u0018w\u000b\u001c6]";
        objectArray[155] = "(4'4\u0019/5'/U\\\u000eZn0k\u0002==1`;Y";
        objectArray[156] = "RA'(P}\u0011A<)ia\u0000B&-\u0005SS\u0006}pi;\u0003O$.Yb\u0007W|J";
        objectArray[157] = "\u000b*/^O'\r,w\u0006 |7k.\u0006\u001c&Z2~UA57//V[.N4)\u0004ZM";
        objectArray[158] = "pe\\Y\u000f\u0006zsMTo\u000bglQv\u0006\u0011kj<KS\u0011du\rI\r\u0000x\nWW\r\n}1\u0004H\u0000U\u0000";
        objectArray[159] = "H&(CS\u001bK${\u0003\"\u0002\u001cb\u0002WR\u001eur XE\u001fN!?U\u001ab";
        objectArray[160] = "<\u0013S[F6aR\u001f\u0000&r\u000e\"Z\\\u001cs4O\u0003\fO.'\"\u0005\u0019Hw>P\u001d\u0005\u0019p_";
        objectArray[161] = "\u000e@P:y\u0018\u0010G\u0011\u007fBXq\u0014\u0014==\u000f\u000f\u001a\f>|";
        objectArray[162] = "eKc\u0017A\u001fxXkv\u0007}.]iH\u0000\u0018t\u001f%\u0016";
        objectArray[163] = "XJ\"6(\u0011\u001bJ97\u0011\u0006\u0006X'8FV_\u000esT{\t\nX$2{\u0017\u001e\n";
        objectArray[164] = ":k\u001c{tYf|X!DF^3\u000e1&Rnj\n)~";
        objectArray[165] = "\u007fcx(BY/h9Jr@:\u0001|(\u0017E.\u007f,#V";
        objectArray[166] = "=\u001dp\r\u000fmd\u0015z[p<#x&\u0003J?3\u0015\u007fS\u0019b xyF\u001e;9\naZO<X";
        objectArray[167] = "bf [\u0017\u0010\u007fu(:^r,ufX\u0001\u0018*s>\u0000";
        Object[] objectArray2 = objectArray;
        objectArray[168] = "LhE3B\rQ{MR\no\u0004jVkI\u0006D8Y=";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ec' || c == 'a' || c == '\u00e7' || c == 'i') {
                field = _54.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ec' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'a' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e7' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _54.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ba' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'g' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/54" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
        int n = _54.e(l2, l3);
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
                clazz3 = _54.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _54.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _54.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _54.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _54.f(586074738821819L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _54.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _54.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _54.f(586074738821819L, 0L);
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
            int n = _54.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _54.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _54.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _54.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _54.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _54.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x756;
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
                throw new RuntimeException("dev/krypton/54", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _54.e[n2] = n3;
        }
        return e[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/54" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _54.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field g(long l2, long l3) {
        int n = _54.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _54.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _54.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _54.c(clazz3, string2, clazz2)) != null) {
                    _54.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _54.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _54.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _54.f(586074738821819L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static boolean cfr_renamed_4(int n, UUID uUID, int n2, class_742 class_7422) {
        long l2 = ((long)n << 32 | (long)n2 << 32 >>> 32) ^ b;
        return (boolean)_54.c("\u00ba", (Object)_54.c("\u00ba", (Object)class_7422, -6008689020145697784L, (long)l2), (Object)uUID, -6007856498035821699L, (long)l2);
    }

    private boolean cfr_renamed_2(long l2, UUID uUID) {
        long l3 = (l2 = b ^ l2) ^ 0x7852FA5E06ECL;
        int n = (int)(l3 >>> 32);
        int n2 = (int)(l3 << 32 >>> 32);
        return (boolean)_54.c("\u00ba", (Object)_54.c("\u00ba", (Object)_54.c("\u00ba", (Object)_54.c("\u00ec", (Object)_54.c("\u00ec", (Object)this, -3960297842406936400L, (long)l2), -3962285967089619225L, (long)l2), -3960979235282688240L, (long)l2), -3961116461871306097L, (long)l2), arg_0 -> _54.cfr_renamed_4(n, uUID, n2, arg_0), -3961480012353239877L, (long)l2);
    }

    /*
     * Exception decompiling
     */
    @_3i_0
    public void cfr_renamed_3(_40 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [46[TRYBLOCK]], but top level block is 47[SWITCH]
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @_3i_0
    public void cfr_renamed_7(_6c_0 c_0) {
        CallSite callSite;
        int n;
        int n2;
        int n3;
        int n4;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        long l7;
        long l8;
        block22: {
            _54 v2;
            block20: {
                long l9 = l8 = b ^ 0x6AC24B192EAFL;
                long l10 = l9 ^ 0xEC3B1041A34L;
                l7 = l9 ^ 0x615BBFC9AA8DL;
                l6 = l9 ^ 0x14D9FB5F6BCCL;
                l5 = l9 ^ 0x2ACCCBA8C063L;
                l4 = l9 ^ 0x3CC1B26FD18L;
                l3 = l9 ^ 0x64A141157C82L;
                l2 = l9 ^ 0x754EC7EB8053L;
                long l11 = l9 ^ 0x3CEB10F65783L;
                n4 = (int)(l11 >>> 48);
                n3 = (int)(l11 << 16 >>> 32);
                n2 = (int)(l11 << 48 >>> 48);
                n = _3C.cfr_renamed_4();
                try {
                    try {
                        v2 = this;
                        if (n != 0) break block20;
                        Object[] objectArray = new Object[2];
                        objectArray[1] = l10;
                        objectArray[0] = _54.c("\u00e7", 5605444407869008008L, (long)l8);
                        if (_54.c("\u00ba", (Object)_54.c("\u00ec", (Object)v2, 5602965170912776140L, (long)l8), (Object)objectArray, 5603822430110864047L, (long)l8) == false) {
                            return;
                        }
                    }
                    catch (MatchException matchException) {
                        throw _54.a(matchException);
                    }
                }
                catch (MatchException matchException) {
                    throw _54.a(matchException);
                }
                v2 = this;
            }
            try {
                try {
                    callSite = _54.c("\u00ec", (Object)v2, 5617193265347638350L, (long)l8);
                    if (n != 0) break block22;
                    if (_54.c("\u00ec", (Object)callSite, 5619740804874381849L, (long)l8) == null) return;
                }
                catch (MatchException matchException) {
                    throw _54.a(matchException);
                }
                callSite = _54.c("\u00ec", (Object)this, 5617193265347638350L, (long)l8);
            }
            catch (MatchException matchException) {
                throw _54.a(matchException);
            }
        }
        try {
            if (_54.c("\u00ec", (Object)callSite, 5606931105675822340L, (long)l8) == null) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw _54.a(matchException);
        }
        float f = c_0.cfr_renamed_9;
        CallSite callSite2 = _54.c("\u00ba", (Object)_54.c("\u00ba", (Object)_54.c("\u00ec", (Object)_54.c("\u00ec", (Object)this, 5617193265347638350L, (long)l8), 5619740804874381849L, (long)l8), 5618719664836404206L, (long)l8), 5603925579918129652L, (long)l8);
        while (_54.c("\u00ba", (Object)callSite2, 5619300389216543680L, (long)l8) != false) {
            block24: {
                Object object;
                Object object2;
                Object object3;
                Object object4;
                Object object5;
                Object object6;
                Object object7;
                _4k k;
                block23: {
                    class_1657 class_16572 = (class_1657)_54.c("\u00ba", (Object)callSite2, 5603041226298800273L, (long)l8);
                    try {
                        if (class_16572 == _54.c("\u00ec", (Object)_54.c("\u00ec", (Object)this, 5617193265347638350L, (long)l8), 5606931105675822340L, (long)l8)) {
                            continue;
                        }
                    }
                    catch (MatchException matchException) {
                        throw _54.a(matchException);
                    }
                    CallSite callSite3 = _54.c("g", (double)f, (double)_54.c("\u00ec", (Object)class_16572, 5617346321119845033L, (long)l8), (double)_54.c("\u00ba", (Object)class_16572, 5606605033245744883L, (long)l8), 5619906564651446050L, (long)l8);
                    CallSite callSite4 = _54.c("g", (double)f, (double)_54.c("\u00ec", (Object)class_16572, 5605351982390433171L, (long)l8), (double)_54.c("\u00ba", (Object)class_16572, 5605409803255699206L, (long)l8), 5619906564651446050L, (long)l8);
                    CallSite callSite5 = _54.c("g", (double)f, (double)_54.c("\u00ec", (Object)class_16572, 5602492994969927184L, (long)l8), (double)_54.c("\u00ba", (Object)class_16572, 5603518880510875162L, (long)l8), 5619906564651446050L, (long)l8);
                    CallSite callSite6 = _54.c("\u00ba", (Object)class_16572, 5605085736337398167L, (long)l8);
                    reference var32_16 = callSite3 - _54.c("\u00ba", (Object)class_16572, 5606605033245744883L, (long)l8);
                    reference var34_17 = callSite4 - _54.c("\u00ba", (Object)class_16572, 5605409803255699206L, (long)l8);
                    reference var36_18 = callSite5 - _54.c("\u00ba", (Object)class_16572, 5603518880510875162L, (long)l8);
                    try {
                        try {
                            k = c_0.cfr_renamed_7;
                            Object object2 = (float)(_54.c("\u00ec", (Object)callSite6, 5606159073370237776L, (long)l8) + var32_16);
                            object2 = (float)(_54.c("\u00ec", (Object)callSite6, 5604392852413066665L, (long)l8) + var34_17);
                            object2 = (float)(_54.c("\u00ec", (Object)callSite6, 5604801935804693134L, (long)l8) + var36_18);
                            object2 = (float)(_54.c("\u00ec", (Object)callSite6, 5618798175444341765L, (long)l8) + var32_16);
                            object2 = (float)(_54.c("\u00ec", (Object)callSite6, 5604553138532082842L, (long)l8) + var34_17);
                            object2 = (float)(_54.c("\u00ec", (Object)callSite6, 5605706658405398163L, (long)l8) + var36_18);
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l5;
                            Object[] objectArray2 = new Object[3];
                            objectArray2[2] = 1;
                            objectArray2[1] = (int)_54.c("\u00ba", (Object)_54.c("\u00ec", (Object)this, 5619030888299528871L, (long)l8), (Object)objectArray, 5602640580394298960L, (long)l8);
                            objectArray2[0] = l7;
                            Object[] objectArray3 = new Object[1];
                            objectArray3[0] = l3;
                            object = _54.c("\u00ba", (Object)_54.c("g", (Object)objectArray2, 5606280396248686938L, (long)l8), (Object)objectArray3, 5602868357224647073L, (long)l8);
                            if (n != 0) break block23;
                            Object[] objectArray4 = new Object[1];
                            objectArray4[0] = l5;
                            Object[] objectArray5 = new Object[3];
                            objectArray5[2] = 1;
                            objectArray5[1] = (int)_54.c("\u00ba", (Object)_54.c("\u00ec", (Object)this, 5619030888299528871L, (long)l8), (Object)objectArray4, 5602640580394298960L, (long)l8);
                            objectArray5[0] = l7;
                            Object[] objectArray6 = new Object[1];
                            objectArray6[0] = l3;
                            Object[] objectArray7 = new Object[11];
                            objectArray7[10] = l4;
                            objectArray7[9] = 0;
                            objectArray7[8] = _54.c("\u00e7", 5605725405147504837L, (long)l8);
                            objectArray7[7] = _54.c("\u00ba", (Object)_54.c("g", (Object)objectArray5, 5606280396248686938L, (long)l8), (Object)objectArray6, 5602868357224647073L, (long)l8);
                            objectArray7[6] = object;
                            objectArray7[5] = object2;
                            objectArray7[4] = object3;
                            objectArray7[3] = object4;
                            objectArray7[2] = object5;
                            objectArray7[1] = object6;
                            objectArray7[0] = object7;
                            _54.c("\u00ba", (Object)k, (Object)objectArray7, 5603343522633644435L, (long)l8);
                            if (_54.c("\u00ba", (Object)_54.c("\u00ec", (Object)this, 5620350392753056844L, (long)l8), (long)l2, 5606549563314928714L, (long)l8) == false) break block24;
                        }
                        catch (MatchException matchException) {
                            throw _54.a(matchException);
                        }
                        k = c_0.cfr_renamed_7;
                        Object object2 = _54.c("\u00ec", (Object)_54.c("\u00e7", 5603673172289863719L, (long)l8), 5618597592023702001L, (long)l8);
                        object2 = _54.c("\u00ec", (Object)_54.c("\u00e7", 5603673172289863719L, (long)l8), 5604186323426327962L, (long)l8);
                        object2 = _54.c("\u00ec", (Object)_54.c("\u00e7", 5603673172289863719L, (long)l8), 5618809079041724955L, (long)l8);
                        object2 = callSite3;
                        object2 = callSite4 + (double)(_54.c("\u00ba", (Object)class_16572, 5603254695704607434L, (long)l8) / 2.0f);
                        object2 = callSite5;
                        Object[] objectArray = new Object[3];
                        objectArray[2] = 1;
                        objectArray[1] = (int)_54.a("o", 5848, (long)(0x387606DE19BBDC72L ^ l8));
                        objectArray[0] = l7;
                        object = new _8B((_8B)((Object)_54.c("g", (Object)objectArray, 5606280396248686938L, (long)l8)), (char)n4, n3, (short)n2);
                    }
                    catch (MatchException matchException) {
                        throw _54.a(matchException);
                    }
                }
                Object[] objectArray = new Object[8];
                objectArray[7] = object;
                objectArray[6] = l6;
                objectArray[5] = object2;
                objectArray[4] = object3;
                objectArray[3] = object4;
                objectArray[2] = object5;
                objectArray[1] = object6;
                objectArray[0] = object7;
                _54.c("\u00ba", (Object)k, (Object)objectArray, 5604017833771841252L, (long)l8);
            }
            if (n != 0) break;
        }
        return;
    }

    private Boolean cfr_renamed_8(long l2) {
        long l3 = (l2 = b ^ l2) ^ 0x96AE7773C9BL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l3;
        objectArray[0] = _54.c("\u00e7", 7738748026759958055L, (long)l2);
        return _54.c("g", (boolean)_54.c("\u00ba", (Object)_54.c("\u00ec", (Object)this, 7741332111651989859L, (long)l2), (Object)objectArray, 7740493028488180736L, (long)l2), 7740189626062134019L, (long)l2);
    }

    private Boolean cfr_renamed_9(long l2) {
        long l3 = (l2 = b ^ l2) ^ 0x312752B2543L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l3;
        objectArray[0] = _54.c("\u00e7", 8264481392794998050L, (long)l2);
        return _54.c("g", (boolean)_54.c("\u00ba", (Object)_54.c("\u00ec", (Object)this, 8265995320224870587L, (long)l2), (Object)objectArray, 8265173073401015768L, (long)l2), 8264851936994706139L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_54.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_54.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

