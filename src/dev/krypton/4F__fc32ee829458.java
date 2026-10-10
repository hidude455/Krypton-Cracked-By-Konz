/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.krypton.4w
 *  dev.krypton.7S
 *  dev.krypton.l
 *  java.lang.MatchException
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1542
 *  net.minecraft.class_1657
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_3965
 *  net.minecraft.class_742
 */
package dev.krypton;

import dev.krypton._4w;
import dev.krypton._7S;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1542;
import net.minecraft.class_1657;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3965;
import net.minecraft.class_742;

public class _4F {
    private static int[] cfr_renamed_2;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static List java_util_List_6(Object[] var0) {
        var1_1 = (Long)var0[0];
        var1_1 = _4F.a ^ var1_1;
        var4_2 = _4F.a("x", (int)2, (int)_4F.a("\u00e7", (Object)_4F.a("y", (Object)_4F.a("\u00f2", (long)6746842803911881620L, (long)var1_1), (long)6750824676621860922L, (long)var1_1), (long)6752068813821511185L, (long)var1_1), (long)6751368149528084330L, (long)var1_1) + 3;
        var5_3 = new ArrayList<E>();
        var6_4 = _4F.a("\u00e7", (Object)_4F.a("y", (Object)_4F.a("\u00f2", (long)6746842803911881620L, (long)var1_1), (long)6752522656008627039L, (long)var1_1), (long)6751066952636766736L, (long)var1_1);
        var7_5 = _4F.a("y", (Object)var6_4, (long)6752252051780086250L, (long)var1_1);
        var8_6 = _4F.a("y", (Object)var6_4, (long)6749760975569319432L, (long)var1_1);
        var9_7 = var7_5 - var4_2;
        var10_8 = var7_5 + var4_2;
        var11_9 = var8_6 - var4_2;
        var12_10 = var8_6 + var4_2;
        var3_11 = _4F.cfr_renamed_1();
        var13_12 = var9_7;
        block10: while (true) {
            v0 = var13_12;
            block11: while (v0 <= var10_8) {
                v1 = var14_13 = var11_9;
                while (var14_13 <= var12_10) {
                    block17: {
                        block18: {
                            block16: {
                                block15: {
                                    try {
                                        v2 = _4F.a("y", (Object)_4F.a("\u00f2", (long)6746842803911881620L, (long)var1_1), (long)6752499326406457334L, (long)var1_1);
                                        v3 = var13_12;
                                        v4 = var14_13;
                                        if (var3_11 != null) break block15;
                                        v0 = _4F.a("\u00e7", (Object)v2, (int)v3, (int)v4, (long)6747224859014732361L, (long)var1_1);
                                        if (var3_11 != null) continue block11;
                                        if (var1_1 <= 0L) continue;
                                    }
                                    catch (MatchException v5) {
                                        throw _4F.a(v5);
                                    }
                                    try {
                                        if (v0 == false) break block16;
                                        v2 = _4F.a("y", (Object)_4F.a("\u00f2", (long)6746842803911881620L, (long)var1_1), (long)6752499326406457334L, (long)var1_1);
                                        v3 = var13_12;
                                        v4 = var14_13;
                                    }
                                    catch (MatchException v6) {
                                        throw _4F.a(v6);
                                    }
                                }
                                var15_14 = _4F.a("\u00e7", (Object)v2, (int)v3, (int)v4, (long)6750369003395955453L, (long)var1_1);
                                try {
                                    try {
                                        v7 = var3_11;
                                        if (var1_1 < 0L) break block17;
                                        if (v7 != null) break block18;
                                        if (var15_14 == null) break block16;
                                    }
                                    catch (MatchException v8) {
                                        throw _4F.a(v8);
                                    }
                                    _4F.a("\u00e7", var5_3, (Object)var15_14, (long)6749078500150350568L, (long)var1_1);
                                }
                                catch (MatchException v9) {
                                    throw _4F.a(v9);
                                }
                            }
                            ++var14_13;
                        }
                        v7 = var3_11;
                    }
lbl60:
                    // 2 sources

                    ** while (v7 != null)
lbl61:
                    // 1 sources

                }
lbl62:
                // 2 sources

                ++var13_12;
                v7 = var3_11;
                if (var1_1 <= 0L) ** GOTO lbl60
                if (v7 == null) continue block10;
            }
            break;
        }
        try {
            v10 = var5_3;
            if (var1_1 > 0L && _4w.cfr_renamed_1() == null) {
                _4F.cfr_renamed_6(new int[3]);
            }
        }
        catch (MatchException v11) {
            throw _4F.a(v11);
        }
        return v10;
    }

    public static boolean boolean_7(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x72373C7910E1L;
        long l5 = l3 ^ 0x606DBC63F257L;
        return (boolean)_4F.a("\u00e7", (Object)_4F.a("\u00e7", (Object)_4F.a("\u00e7", (Object)_4F.a("\u00e7", (Object)_4F.a("\u00e7", (Object)_4F.a("y", (Object)_4F.a("\u00f2", -7007039474750279436L, (long)l2), -7001455660079860586L, (long)l2), -7003873633107385629L, (long)l2), -7004458321282530934L, (long)l2), arg_0 -> _4F.cfr_renamed_5(l5, arg_0), -7005016873136858885L, (long)l2), arg_0 -> _4F.cfr_renamed_13(l4, arg_0), -7005016873136858885L, (long)l2), class_1309::method_29504, -7001626079803991735L, (long)l2);
    }

    public static boolean cfr_renamed_3(Object[] objectArray) {
        boolean bl;
        long l2 = (Long)objectArray[0];
        class_2338 class_23382 = (class_2338)objectArray[1];
        class_2248 class_22482 = (class_2248)objectArray[2];
        l2 = a ^ l2;
        try {
            bl = _4F.a("\u00e7", (Object)_4F.a("\u00e7", (Object)_4F.a("y", (Object)_4F.a("\u00f2", -4032213967549176257L, (long)l2), -4026612420837842339L, (long)l2), (Object)class_23382, -4026962493527466982L, (long)l2), -4033226004620214329L, (long)l2) == class_22482;
        }
        catch (MatchException matchException) {
            throw _4F.a(matchException);
        }
        return bl;
    }

    public static boolean cfr_renamed_15(Object[] objectArray) {
        Object object;
        block6: {
            block7: {
                Object object2;
                block8: {
                    block9: {
                        long l2 = (Long)objectArray[0];
                        class_2338 class_23382 = (class_2338)objectArray[1];
                        long l3 = (l2 = a ^ l2) ^ 0x5F6BCA5ED53EL;
                        int[] nArray = _4F.cfr_renamed_1();
                        try {
                            try {
                                try {
                                    Object[] objectArray2 = new Object[3];
                                    objectArray2[2] = _4F.a("\u00f2", 323782650557851387L, (long)l2);
                                    objectArray2[1] = class_23382;
                                    objectArray2[0] = l3;
                                    object = _4F.a("x", (Object)objectArray2, 316866313580685784L, (long)l2);
                                    if (nArray != null) break block6;
                                    if (object == false) break block7;
                                }
                                catch (MatchException matchException) {
                                    throw _4F.a(matchException);
                                }
                                object2 = _4F.a("\u00e7", (Object)((Integer)((Object)_4F.a("\u00e7", (Object)_4F.a("\u00e7", (Object)_4F.a("y", (Object)_4F.a("\u00f2", 320783050238274118L, (long)l2), 317378329906720292L, (long)l2), (Object)class_23382, 316463963016433763L, (long)l2), (Object)_4F.a("\u00f2", 316649171186950040L, (long)l2), 322170740810714791L, (long)l2))), 315914043719169505L, (long)l2);
                                if (nArray != null) break block8;
                            }
                            catch (MatchException matchException) {
                                throw _4F.a(matchException);
                            }
                            if (object2 == false) break block9;
                        }
                        catch (MatchException matchException) {
                            throw _4F.a(matchException);
                        }
                        object2 = true;
                        break block8;
                    }
                    object2 = false;
                }
                return (boolean)object2;
            }
            object = false;
        }
        return (boolean)object;
    }

    public static boolean boolean_1(Object[] objectArray) {
        Object object;
        block6: {
            block7: {
                Object object2;
                block8: {
                    block9: {
                        class_2338 class_23382 = (class_2338)objectArray[0];
                        long l2 = (Long)objectArray[1];
                        long l3 = (l2 = a ^ l2) ^ 0x5D6FC25B5ABAL;
                        int[] nArray = _4F.cfr_renamed_1();
                        try {
                            try {
                                try {
                                    Object[] objectArray2 = new Object[3];
                                    objectArray2[2] = _4F.a("\u00f2", -8360285512897205889L, (long)l2);
                                    objectArray2[1] = class_23382;
                                    objectArray2[0] = l3;
                                    object = _4F.a("x", (Object)objectArray2, -8367197451827403172L, (long)l2);
                                    if (nArray != null) break block6;
                                    if (object == false) break block7;
                                }
                                catch (MatchException matchException) {
                                    throw _4F.a(matchException);
                                }
                                object2 = _4F.a("\u00e7", (Object)((Integer)((Object)_4F.a("\u00e7", (Object)_4F.a("\u00e7", (Object)_4F.a("y", (Object)_4F.a("\u00f2", -8361033347762313790L, (long)l2), -8366685435233394272L, (long)l2), (Object)class_23382, -8367604234529857561L, (long)l2), (Object)_4F.a("\u00f2", -8367419026359414756L, (long)l2), -8359641258875322077L, (long)l2))), -8365902354012849563L, (long)l2);
                                if (nArray != null) break block8;
                            }
                            catch (MatchException matchException) {
                                throw _4F.a(matchException);
                            }
                            if (object2 != false) break block9;
                        }
                        catch (MatchException matchException) {
                            throw _4F.a(matchException);
                        }
                        object2 = true;
                        break block8;
                    }
                    object2 = false;
                }
                return (boolean)object2;
            }
            object = false;
        }
        return (boolean)object;
    }

    public static void cfr_renamed_1(Object[] objectArray) {
        block10: {
            Object object;
            long l2;
            block11: {
                int[] nArray;
                boolean bl;
                block9: {
                    l2 = (Long)objectArray[0];
                    class_3965 class_39652 = (class_3965)objectArray[1];
                    bl = (Boolean)objectArray[2];
                    l2 = a ^ l2;
                    nArray = _4F.cfr_renamed_1();
                    CallSite callSite = _4F.a("\u00e7", (Object)_4F.a("y", (Object)_4F.a("\u00f2", -4266675613773993220L, (long)l2), -4268533020030294869L, (long)l2), (Object)_4F.a("y", (Object)_4F.a("\u00f2", -4266675613773993220L, (long)l2), -4260995142081086921L, (long)l2), (Object)_4F.a("\u00f2", -4266459835027166704L, (long)l2), (Object)class_39652, -4260785164249598984L, (long)l2);
                    try {
                        try {
                            object = _4F.a("\u00e7", (Object)callSite, -4266434405353271462L, (long)l2);
                            if (nArray != null) break block9;
                            if (object == false) break block10;
                        }
                        catch (MatchException matchException) {
                            throw _4F.a(matchException);
                        }
                        object = _4F.a("\u00e7", (Object)callSite, -4266434405353271462L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw _4F.a(matchException);
                    }
                }
                try {
                    if (l2 < 0L || nArray != null) break block11;
                    if (object == false) break block10;
                }
                catch (MatchException matchException) {
                    throw _4F.a(matchException);
                }
                object = bl;
            }
            try {
                if (object != false) {
                    _4F.a("\u00e7", (Object)_4F.a("y", (Object)_4F.a("\u00f2", -4266675613773993220L, (long)l2), -4260995142081086921L, (long)l2), (Object)_4F.a("\u00f2", -4266459835027166704L, (long)l2), -4266877830237646600L, (long)l2);
                }
            }
            catch (MatchException matchException) {
                throw _4F.a(matchException);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void void_1(Object[] var0) {
        block37: {
            block39: {
                block41: {
                    block38: {
                        block35: {
                            block33: {
                                block34: {
                                    var2_1 = (Boolean)var0[0];
                                    var3_2 = (Long)var0[1];
                                    var1_3 = (Boolean)var0[2];
                                    var3_2 = _4F.a ^ var3_2;
                                    var5_4 = _4F.cfr_renamed_1();
                                    try {
                                        try {
                                            v0 = var2_1;
                                            if (var5_4 != null) break block33;
                                            if (v0 != false) break block34;
                                        }
                                        catch (MatchException v1) {
                                            throw _4F.a(v1);
                                        }
                                        _4F.a("\u00ee", (Object)_4F.a("\u00f2", (long)5299266725070464959L, (long)var3_2), (int)0, (long)5298468976001569838L, (long)var3_2);
                                    }
                                    catch (MatchException v2) {
                                        throw _4F.a(v2);
                                    }
                                }
                                v0 = var1_3;
                            }
                            try {
                                block36: {
                                    try {
                                        try {
                                            try {
                                                if (var5_4 != null) break block35;
                                                if (v0 != false) break block36;
                                            }
                                            catch (MatchException v3) {
                                                throw _4F.a(v3);
                                            }
                                            v0 = _4F.a("y", (Object)_4F.a("\u00f2", (long)5299266725070464959L, (long)var3_2), (long)5298468976001569838L, (long)var3_2);
                                            v4 = var5_4;
                                            if (var3_2 > 0L) {
                                                if (v4 != null) break block35;
                                            }
                                            ** GOTO lbl52
                                        }
                                        catch (MatchException v5) {
                                            throw _4F.a(v5);
                                        }
                                        if (v0 > 0) break block37;
                                    }
                                    catch (MatchException v6) {
                                        throw _4F.a(v6);
                                    }
                                }
                                v0 = _4F.a("\u00e7", (Object)_4F.a("y", (Object)_4F.a("\u00f2", (long)5299266725070464959L, (long)var3_2), (long)5304846042752481140L, (long)var3_2), (long)5297430948335590850L, (long)var3_2);
                            }
                            catch (MatchException v7) {
                                throw _4F.a(v7);
                            }
                        }
                        try {
                            if (var3_2 <= 0L) break block38;
                            v4 = var5_4;
lbl52:
                            // 2 sources

                            if (v4 != null) break block38;
                            if (v0 != false) break block37;
                        }
                        catch (MatchException v8) {
                            throw _4F.a(v8);
                        }
                        v0 = var2_1;
                    }
                    try {
                        try {
                            try {
                                try {
                                    if (v0 != 0) {
                                        v9 = _4F.a("\u00f2", (long)5299266725070464959L, (long)var3_2);
                                        if (var5_4 != null) break block39;
                                    }
                                    ** GOTO lbl108
                                }
                                catch (MatchException v10) {
                                    throw _4F.a(v10);
                                }
                                if (var3_2 < 0L) break block39;
                                if (_4F.a("y", (Object)v9, (long)5298881972016328407L, (long)var3_2) != null) {
                                }
                                ** GOTO lbl108
                            }
                            catch (MatchException v11) {
                                throw _4F.a(v11);
                            }
                            v9 = _4F.a("\u00f2", (long)5299266725070464959L, (long)var3_2);
                            if (var5_4 != null) break block39;
                        }
                        catch (MatchException v12) {
                            throw _4F.a(v12);
                        }
                        if (_4F.a("\u00e7", (Object)_4F.a("y", (Object)v9, (long)5298881972016328407L, (long)var3_2), (long)5305187158182408845L, (long)var3_2) == _4F.a("\u00f2", (long)5297827003245553188L, (long)var3_2)) {
                        }
                        ** GOTO lbl108
                    }
                    catch (MatchException v13) {
                        throw _4F.a(v13);
                    }
                    var6_5 = (class_3965)_4F.a("y", (Object)_4F.a("\u00f2", (long)5299266725070464959L, (long)var3_2), (long)5298881972016328407L, (long)var3_2);
                    var7_6 = _4F.a("\u00e7", (Object)var6_5, (long)5297352142449551596L, (long)var3_2);
                    if (var3_2 >= 0L && _4F.a("\u00e7", (Object)_4F.a("\u00e7", (Object)_4F.a("y", (Object)_4F.a("\u00f2", (long)5299266725070464959L, (long)var3_2), (long)5304937542893396957L, (long)var3_2), (Object)var7_6, (long)5304447829005753754L, (long)var3_2), (long)5296589605007049697L, (long)var3_2) == false) {
                        block40: {
                            var8_7 = _4F.a("\u00e7", (Object)var6_5, (long)5297369086532245716L, (long)var3_2);
                            try {
                                try {
                                    v14 = _4F.a("\u00f2", (long)5299266725070464959L, (long)var3_2);
                                    if (var5_4 != null) break block40;
                                    if (_4F.a("\u00e7", (Object)_4F.a("y", (Object)v14, (long)5296340869197277672L, (long)var3_2), (Object)var7_6, (Object)var8_7, (long)5297235185855410223L, (long)var3_2) == false) break block41;
                                }
                                catch (MatchException v15) {
                                    throw _4F.a(v15);
                                }
                                _4F.a("\u00e7", (Object)_4F.a("y", (Object)_4F.a("\u00f2", (long)5299266725070464959L, (long)var3_2), (long)5304937542893396957L, (long)var3_2), (Object)var7_6, (Object)var8_7, (long)5296902040337708256L, (long)var3_2);
                                v14 = _4F.a("\u00f2", (long)5299266725070464959L, (long)var3_2);
                            }
                            catch (MatchException v16) {
                                throw _4F.a(v16);
                            }
                        }
                        _4F.a("\u00e7", (Object)_4F.a("y", (Object)v14, (long)5304846042752481140L, (long)var3_2), (Object)_4F.a("\u00f2", (long)5298770021068662611L, (long)var3_2), (long)5299187654963797435L, (long)var3_2);
                    }
                }
                try {
                    if (var5_4 == null) break block37;
lbl108:
                    // 4 sources

                    v9 = _4F.a("\u00f2", (long)5299266725070464959L, (long)var3_2);
                }
                catch (MatchException v17) {
                    throw _4F.a(v17);
                }
            }
            _4F.a("\u00e7", (Object)_4F.a("y", (Object)v9, (long)5296340869197277672L, (long)var3_2), (long)5304017179976130873L, (long)var3_2);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean boolean_6(Object[] objectArray) {
        Object object;
        block8: {
            CallSite callSite;
            int[] nArray;
            long l2;
            class_1657 class_16572;
            block7: {
                class_16572 = (class_1657)objectArray[0];
                l2 = (Long)objectArray[1];
                l2 = a ^ l2;
                nArray = _4F.cfr_renamed_1();
                try {
                    callSite = _4F.a("y", (Object)_4F.a("\u00f2", 5660670113823744187L, (long)l2), 5664089237991518320L, (long)l2);
                    if (nArray != null) break block7;
                    if (callSite == null) return false;
                }
                catch (MatchException matchException) {
                    throw _4F.a(matchException);
                }
                callSite = class_16572;
            }
            try {
                if (callSite == null) {
                    return false;
                }
            }
            catch (MatchException matchException) {
                throw _4F.a(matchException);
            }
            CallSite callSite2 = _4F.a("\u00e7", (Object)_4F.a("y", (Object)_4F.a("\u00f2", 5660670113823744187L, (long)l2), 5664089237991518320L, (long)l2), 5658547732276000918L, (long)l2);
            CallSite callSite3 = _4F.a("\u00e7", (Object)class_16572, 5664254045651474990L, (long)l2);
            CallSite callSite4 = _4F.a("\u00e7", (Object)_4F.a("\u00e7", (Object)callSite2, (Object)callSite3, 5658424029432392319L, (long)l2), 5663882577672084132L, (long)l2);
            CallSite callSite5 = _4F.a("\u00e7", (Object)class_16572, 5660124185373180575L, (long)l2);
            CallSite callSite6 = _4F.a("\u00e7", (Object)class_16572, 5660757774698070792L, (long)l2);
            CallSite callSite7 = _4F.a("\u00e7", (Object)new class_243((double)(-_4F.a("x", (double)_4F.a("x", (double)((double)callSite5), 5663556717387124403L, (long)l2), 5659910537557614917L, (long)l2) * _4F.a("x", (double)_4F.a("x", (double)((double)callSite6), 5663556717387124403L, (long)l2), 5658176594424189138L, (long)l2)), (double)(-_4F.a("x", (double)_4F.a("x", (double)((double)callSite6), 5663556717387124403L, (long)l2), 5659910537557614917L, (long)l2)), (double)(_4F.a("x", (double)_4F.a("x", (double)((double)callSite5), 5663556717387124403L, (long)l2), 5658176594424189138L, (long)l2) * _4F.a("x", (double)_4F.a("x", (double)((double)callSite6), 5663556717387124403L, (long)l2), 5658176594424189138L, (long)l2))), 5663882577672084132L, (long)l2);
            reference var11_10 = _4F.a("\u00e7", (Object)callSite7, (Object)callSite4, 5657834828953803520L, (long)l2);
            try {
                reference cfr_temp_0 = var11_10 - 0.0;
                object = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                if (nArray != null) return (boolean)object;
                if (object >= 0) break block8;
            }
            catch (MatchException matchException) {
                throw _4F.a(matchException);
            }
            object = true;
            return (boolean)object;
        }
        object = false;
        return (boolean)object;
    }

    public static boolean cfr_renamed_16(Object[] objectArray) {
        CallSite callSite;
        CallSite callSite2;
        long l2;
        block4: {
            block5: {
                class_2338 class_23382 = (class_2338)objectArray[0];
                l2 = (Long)objectArray[1];
                l2 = a ^ l2;
                int[] nArray = _4F.cfr_renamed_1();
                callSite2 = _4F.a("\u00e7", (Object)class_23382, -1802485018165593229L, (long)l2);
                try {
                    try {
                        callSite = _4F.a("\u00e7", (Object)_4F.a("y", (Object)_4F.a("\u00f2", -1802419413874849591L, (long)l2), -1808003371086590805L, (long)l2), (Object)callSite2, -1801874511851706917L, (long)l2);
                        if (nArray != null) break block4;
                        if (callSite != false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _4F.a(matchException);
                    }
                    return false;
                }
                catch (MatchException matchException) {
                    throw _4F.a(matchException);
                }
            }
            callSite = _4F.a("\u00e7", (Object)callSite2, -1805680720026541487L, (long)l2);
        }
        double d = (double)callSite;
        double d2 = (double)_4F.a("\u00e7", (Object)callSite2, -1802175134326328511L, (long)l2);
        double d3 = (double)_4F.a("\u00e7", (Object)callSite2, -1802352650193702291L, (long)l2);
        CallSite callSite3 = _4F.a("\u00e7", (Object)_4F.a("y", (Object)_4F.a("\u00f2", -1802419413874849591L, (long)l2), -1808003371086590805L, (long)l2), null, (Object)new class_238(d, d2, d3, d + 1.0, d2 + 1.0, d3 + 1.0), -1807590949332722591L, (long)l2);
        _4F.a("\u00e7", (Object)callSite3, _4F::cfr_renamed_17, -1805165383659546556L, (long)l2);
        return (boolean)_4F.a("\u00e7", (Object)callSite3, -1804928115130282165L, (long)l2);
    }

    public static void cfr_renamed_13(Object[] objectArray) {
        block5: {
            CallSite callSite;
            long l2;
            block4: {
                int n = (Integer)objectArray[0];
                class_1297 class_12972 = (class_1297)objectArray[1];
                boolean bl = (Boolean)objectArray[2];
                int n2 = (Integer)objectArray[3];
                int n3 = (Integer)objectArray[4];
                l2 = ((long)n << 48 | (long)n2 << 32 >>> 16 | (long)n3 << 48 >>> 48) ^ a;
                int[] nArray = _4F.cfr_renamed_1();
                try {
                    try {
                        callSite = _4F.a("\u00f2", -7968319152439443617L, (long)l2);
                        if (nArray != null) break block4;
                        _4F.a("\u00e7", (Object)_4F.a("y", (Object)callSite, -7971247073924484856L, (long)l2), (Object)_4F.a("y", (Object)_4F.a("\u00f2", -7968319152439443617L, (long)l2), -7962775710620373100L, (long)l2), (Object)class_12972, -7963916037289835371L, (long)l2);
                        if (!bl) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _4F.a(matchException);
                    }
                    callSite = _4F.a("\u00f2", -7968319152439443617L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _4F.a(matchException);
                }
            }
            _4F.a("\u00e7", (Object)_4F.a("y", (Object)callSite, -7962775710620373100L, (long)l2), (Object)_4F.a("\u00f2", -7968816410221494349L, (long)l2), -7968433548112149157L, (long)l2);
        }
    }

    public static _7S dev_krypton_7S_7(Object[] objectArray) {
        class_1297 class_12972 = (class_1297)objectArray[0];
        class_243 class_2432 = (class_243)objectArray[1];
        long l2 = (Long)objectArray[2];
        l2 = a ^ l2;
        reference var5_4 = _4F.a("y", (Object)class_2432, 577077580009930735L, (long)l2) - _4F.a("\u00e7", (Object)class_12972, 576651643228740043L, (long)l2);
        reference var7_5 = _4F.a("y", (Object)class_2432, 580900950858393542L, (long)l2) - _4F.a("\u00e7", (Object)class_12972, 578151223141092629L, (long)l2);
        reference var9_6 = _4F.a("y", (Object)class_2432, 577005286832663971L, (long)l2) - _4F.a("\u00e7", (Object)class_12972, 576872157233625259L, (long)l2);
        double d = (double)_4F.a("x", (float)((float)(var5_4 * var5_4 + var9_6 * var9_6)), 584438579821282699L, (long)l2);
        return new _7S((double)_4F.a("x", (double)(_4F.a("x", (double)_4F.a("x", (double)var9_6, (double)var5_4, 583864452032556996L, (long)l2), 584795637829196938L, (long)l2) - 90.0), 577611751103282773L, (long)l2), (double)(-_4F.a("x", (double)_4F.a("x", (double)_4F.a("x", (double)var7_5, (double)d, 583864452032556996L, (long)l2), 584795637829196938L, (long)l2), 577611751103282773L, (long)l2)));
    }

    private static boolean cfr_renamed_17(class_1297 class_12972) {
        return class_12972 instanceof class_1542;
    }

    private static boolean cfr_renamed_13(long l2, class_742 class_7422) {
        Object object;
        block2: {
            block3: {
                l2 = a ^ l2;
                int[] nArray = _4F.cfr_renamed_1();
                try {
                    reference cfr_temp_0 = _4F.a("\u00e7", (Object)class_7422, (Object)_4F.a("y", (Object)_4F.a("\u00f2", -7536836259590784686L, (long)l2), -7533509498674861671L, (long)l2), -7534176230498853743L, (long)l2) - 36.0;
                    object = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                    if (nArray != null) break block2;
                    if (object > 0) break block3;
                }
                catch (MatchException matchException) {
                    throw _4F.a(matchException);
                }
                object = true;
                break block2;
            }
            object = false;
        }
        return (boolean)object;
    }

    private static boolean cfr_renamed_5(long l2, class_742 class_7422) {
        boolean bl;
        l2 = a ^ l2;
        try {
            bl = class_7422 != _4F.a("y", (Object)_4F.a("\u00f2", 8489800968829164516L, (long)l2), 8486342304186944303L, (long)l2);
        }
        catch (MatchException matchException) {
            throw _4F.a(matchException);
        }
        return bl;
    }

    public static void cfr_renamed_6(int[] nArray) {
        cfr_renamed_2 = nArray;
    }

    public static int[] cfr_renamed_1() {
        return cfr_renamed_2;
    }

    static {
        a = l.a(4242787639640987454L, 2989248811321987159L, MethodHandles.lookup().lookupClass()).a(93370308017253L);
        b = new Object[110];
        c = new String[110];
        _4F.a();
        if (_4F.cfr_renamed_1() != null) {
            _4F.cfr_renamed_6(new int[2]);
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (c[n3] != null) {
            return n3;
        }
        Object object = b[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 27;
            case 1 -> 58;
            case 2 -> 33;
            case 3 -> 30;
            case 4 -> 11;
            case 5 -> 10;
            case 6 -> 37;
            case 7 -> 22;
            case 8 -> 54;
            case 9 -> 47;
            case 10 -> 5;
            case 11 -> 29;
            case 12 -> 45;
            case 13 -> 0;
            case 14 -> 24;
            case 15 -> 34;
            case 16 -> 40;
            case 17 -> 1;
            case 18 -> 9;
            case 19 -> 50;
            case 20 -> 63;
            case 21 -> 20;
            case 22 -> 3;
            case 23 -> 12;
            case 24 -> 42;
            case 25 -> 55;
            case 26 -> 14;
            case 27 -> 49;
            case 28 -> 32;
            case 29 -> 56;
            case 30 -> 53;
            case 31 -> 59;
            case 32 -> 48;
            case 33 -> 35;
            case 34 -> 44;
            case 35 -> 60;
            case 36 -> 51;
            case 37 -> 4;
            case 38 -> 18;
            case 39 -> 36;
            case 40 -> 57;
            case 41 -> 46;
            case 42 -> 16;
            case 43 -> 8;
            case 44 -> 39;
            case 45 -> 28;
            case 46 -> 62;
            case 47 -> 2;
            case 48 -> 31;
            case 49 -> 52;
            case 50 -> 21;
            case 51 -> 61;
            case 52 -> 13;
            case 53 -> 19;
            case 54 -> 43;
            case 55 -> 38;
            case 56 -> 7;
            case 57 -> 41;
            case 58 -> 6;
            case 59 -> 25;
            case 60 -> 17;
            case 61 -> 23;
            case 62 -> 15;
            default -> 26;
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
        _4F.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "!lbes5!lu9\u007f:;'u'\u007f/<V x(";
        objectArray[1] = "a90\u001dT\u0006a9'AX\t{r'_X\u001c|\u0003u\u0005\fX";
        objectArray[2] = "\u001aJ\u0004@4\u0010\u001aJ\u0013\u001c8\u001f\u0000\u0001\u0013\u00028\n\u0007pA\\`N";
        objectArray[3] = Void.TYPE;
        _4F.c[3] = "java/lang/Void";
        objectArray[4] = "\u0019\u0001Tc#\u007f\u0019\u0001C?/p\u0003JC!/e\u0004;\u0013|~";
        objectArray[5] = "\u0005%K\u0014@W\u0005%\\HLX\u001fn\\VLM\u0018\u001f\b\u000e\u001b";
        objectArray[6] = "\u0006\u0013\u007f\u001ea,\u0006\u0013hBm#\u001cXh\\m6\u001b):\u0002:}";
        objectArray[7] = "M7A\bWIP\"CIR\u0015\u001b";
        objectArray[8] = "SEg\funSEpPyaI\u000epNytN\u007f \u001b.2";
        objectArray[9] = "Z\rfSy\u007fZ\rq\u000fup@Fq\u0011ueG7#O\"/";
        objectArray[10] = Boolean.TYPE;
        _4F.c[10] = "java/lang/Boolean";
        objectArray[11] = "P\u0002b_\u001dO[\rs\u0010~BN\u000b";
        objectArray[12] = Double.TYPE;
        _4F.c[12] = "java/lang/Double";
        objectArray[13] = "f\u0019AL\u001auf\u0019V\u0010\u0016z|RV\u000e\u0016o{#\u0007VD";
        objectArray[14] = "\u0002wv([a\u0002watWn\u0018<ajW{\u001fM13\u0005:";
        objectArray[15] = Float.TYPE;
        _4F.c[15] = "java/lang/Float";
        objectArray[16] = "b\u001f\u0012+<5b\u001f\u0005w0:xT\u0005i0/\u007f%T3il";
        objectArray[17] = "j\u0017|v\t\u0012j\u0017k*\u0005\u001dp\\k4\u0005\bw-:oRB";
        objectArray[18] = "\u0003\u001f\u0001r\u001b~\b\u0010\u0010=v}\u0004\u000e\u0016aTp\u0005\u001b";
        objectArray[19] = "x-D H&x-S|D)bfSbD<e\u0017\u00047\u0013v";
        objectArray[20] = "B\u007fy>e\"B\u007fnbi-X4n|i8_E?'=s";
        objectArray[21] = "acM f\"jl\\o\u0001 \u007fg\\$:";
        objectArray[22] = Integer.TYPE;
        _4F.c[22] = "java/lang/Integer";
        objectArray[23] = "8(X1qc8(Om}l\"cOs}y%\u0012\u001e-(<";
        objectArray[24] = "\t\u0005\u001e\u000bo\u007f\t\u0005\tWcp\u0013N\tIce\u0014?X\u00176.";
        objectArray[25] = "\u007f|s\u0010\u0012\u001d\u007f|dL\u001e\u0012e7dR\u001e\u0007bF1\rG";
        objectArray[26] = "\u0010=\u0002+{[\r(\u0000j~\u0007@\u001e";
        objectArray[27] = "\u000b]#O\u0001\\~}(@\u0010\u0013\u001fs#K\u0014Ik";
        objectArray[28] = "*;1eWV*;&9[Y0p&'[L7\u0001wx\t\u0007";
        objectArray[29] = "L\tD\u0007B\u000bR\u0001^H \u0017U\u001c";
        objectArray[30] = "\u001e\u001ba\u0010H\u0018\u0000\u0013{_\u0015\u0019\u0006\u001fv\u001cH>\u0000\br\u0010\u000b";
        objectArray[31] = "Ql\u000fGCGOd\u0015\b\u000bGUn\rO\u0002\\\u0015]\u000bC\t[Xl\rC";
        objectArray[32] = "\b\\&V\u0019\u0003\b\\1\n\u0015\f\u0012\u00171\u0014\u0015\u0019\u0015f`KL";
        objectArray[33] = "k \u0011r\u001cfk \u0006.\u0010iqk\u00060\u0010|v\u001aWoD?";
        objectArray[34] = "[j5v\u0011E[j\"*\u001dJA!\"4\u001d_FPskE";
        objectArray[35] = "\"Y7O=\u0014\"Y \u00131\u001b8\u0012 \r1\u000e?cqRiY/P\"\u0012#\"~\bs";
        objectArray[36] = "d[UPX\u0018oTD\u001f9\u0016d_@E";
        objectArray[37] = "`p\u001fMik`p\b\u0011edz;\b\u000feq}JXR1";
        objectArray[38] = "0\u001aW9_20\u001a@eS=*Q@{S(- \u0012.\u0000h";
        objectArray[39] = "\u0015}*)/\u0019\u0015}=u#\u0016\u000f6=k#\u0003\bGl?sH";
        objectArray[40] = "i\u0004\u0002@{]i\u0004\u0015\u001cwRsO\u0015\u0002wGt>AZ$";
        objectArray[41] = "^\u0018\u0017\u0012{(\u0010\u001e\u0017`r<\u001e\u0018\u0010\f@kSAG`.8X\u0002\b\u0000-a\u0003\u0006wYh3\u001f\u0006\b\u000bml\u001exM\u0005&`\u001e\u001cL\u0005hib";
        objectArray[42] = "\u0001en)A\u0003M3~.x\u0010V\u0013y-\u0002\u0001\\$\u0014r\u0000W^-*y\u001e\u0013\u000b_$:C\u0003Ca/$\u0007V1";
        objectArray[43] = "J\u0007E\u001c\u0017U\u0006QU\u001b._\u0013M?\u0019KC\b\u0007]HJX\u0013=Q\u0012WH@_\u0000\u0013LSzSZ\u000e\\\u0000\u0018\u0002[\u0015G:";
        objectArray[44] = "\u00144\u0003x!\u0004\u0003;\u0001fJ\u000e\u001f+3n.\u0012\u0014W\u0003b3\u001dC5Rc(\u0006y";
        objectArray[45] = "m\u001b\\$;eaY\u0018/\u0005ci]\u0001yiQ=\u001cZ#8\u0006mNY'h\u007fkD\\\u007f\u0005ok\u0019Xs|ia\u001c\u0000\u001e";
        objectArray[46] = "1>Dp)T\u007f8D\u0002 @q>Cn\u0012\u0017<d\u0019\u0002\u007fH<oXf~Hrf$";
        objectArray[47] = "\b\u000bFm\u001duSV\u0014rpyYKEq\u001cK\u000f\u000e\u0019)N\u001cMTXv\nv\u0004UKtp";
        objectArray[48] = "v1h\\\u001e.|gvU~&`qf\\\u0012\u00140=;\u000b~zro{E\u0001(w0z;N;6bt\u0005E%r7\u0006";
        objectArray[49] = "\u001c&3Y\u0014\u001f\u0007h'\\i\u001e\u0011%)\u0003\u0005,LbrYiB\u0003;4\u001a\u0016\u0010\u0006d5d\f\u0015\u001b()\u0016WCD7I\u0007\u0005KL!1\u0015PE\u0004Y";
        objectArray[50] = "h\u0013\u0018^Ul$E\bYl\u007f?s\u000bY\rj>Rb\u0005\u001487[\\\u000e\n|b)RMWl*\u0017YS\u00139X";
        objectArray[51] = "Q,f\\!u\b#&TJ+0)#\u0007(oI&<\fp\u0010\u000f+fQ0~I,/\u0002J";
        objectArray[52] = "a|\u001f\u0001g\u0018z2\u000b\u0004\u001a\u0019l\u007f\u0005[v+18_\u0004\u001a\u001ey:\u0017\u0003pC`n\u000e<p\u00068e\u000eZ{\u0013hfe";
        objectArray[53] = "\u000fL|\u0004\u001eTC\u001al\u0003'RC\u001f`U'\u000bGMi\u001d\u0019\u0000Y\t<o\u0017C\u0004\u0019tQ\u001c]@L\u0006__\u0000P\u00048TAD\u0005v";
        objectArray[54] = "7o\u001b\u0007`tf-NG\u0001%:<\u001bRVq`hB\u0005\u0001&0.\u000eL00j`\u001c";
        objectArray[55] = "Y\u0002L\f\fT\u0017\u0004L~\u0005@\u0019\u0002K\u00127\u0017US\u0012~\\\u0011\u0006\u0019A\u0017\u0007LT\u0006,B\tVX\u0003N\u001b\u0011J\\b\u0011\u0005_K\u001cS\u0016AX]e\\OAZ\u0013\u001c\u000f@\u000f\t-";
        objectArray[56] = "5$%\u000f\u0010\\&;(Yj\u00040(]\b\u0016\u00066Y}\\\r\u00060bf\u001dS\nVf{YV\u00178 |\u0010\u0005m";
        objectArray[57] = "&\u0012\u0007)@KsIWx\u007f\u0012z\u0004\t'\u0013 .@Sq\u007fF}\u0016\u0000\u007fC\u0013&FQ@";
        objectArray[58] = "q8\u0002\u0016Z1;7\u0005We2+9\u0007B2eun_.Y`)/\u000eG\u0002={0";
        objectArray[59] = "v-yV\u0019B<\"~\u0017&A,,|\u0002q\u0016sq'nFP7|e\n]\u001e#y";
        objectArray[60] = "[kOZ\u000beX2\u0014^t`\u000f~\u0015G\u0018R]9L\u0010E\u0005Sh\u001bIK9\u00063K\u0018t";
        objectArray[61] = "\t7Tf\u0007\u0018\u00136Te>D\u001d!\u000b;RvKmVf\u0007!\u001e8\u0012.\u0004CO9\t5>";
        objectArray[62] = "}0{s\u0014-41hqn)e>b\u007f9v=c?\u0013\u0000\"}!<qQ#f:";
        objectArray[63] = "\u001e[\u0005\u0001(m\u0001\u0000\b\u001cTn\u0015@\t\u00148\\A\u0003VCo\u000b\u001fP\u0015\u000b,fES\u0017\u000eT";
        objectArray[64] = ";J\u001ddxk)\u001f\u0013,\u0000k1\\D0d~<}Q.mz=&N)=}\"\u0017]60+X";
        objectArray[65] = ";y\u0001^6\\qv\u0006\u001f\t_ax\u0004\n^\b?+Yf5Q`g\f\u001f{W`";
        objectArray[66] = "8vi67Cqwz4MG xp:\u001a\u0018x%,V#L8g.4rM#|";
        objectArray[67] = "Q$ZB\u00139\u0004\u007f\n\u0013,`\r2TL@RYv\u000e\u0015,4\n ]\u0014\u0010aQp\f+\u001c}[!F\u0015\u0017c\u001ft4";
        objectArray[68] = "\u001b\u001f\u000bv\u001e\u0017I\u001aTw`\rO\u001c\tl\f?\u0018[R1Xh\u0012\u0018Rd\u0012V\u0019\u0006\u00161`";
        objectArray[69] = "&AJd?W-T\u001agTT!G\u0013e8fv\u0005I;i1sXK>._5_\u0002mT";
        objectArray[70] = "J'u\u0013\u001dQ\u0006qe\u0014$U\u001df\u000fH\\\u0005\u0015o1CBA@\u001d?\u0000\u001fQ\b#4\u001e[\u0004z";
        objectArray[71] = "r\u000b`b\u0002ty\u001e0aiwu\r9c\u0005E!Hg9U\u0012sLc~\u0000b}\bf5iyf\u0018%`\u0017/f\u0010i\u0004";
        objectArray[72] = "<@x\n/H/_u\\U\u0017>Y9\t/y:\u0000\"\u000f3B!A|\u0003U\u001a\"\u0000+\u001ed\t=\r}d";
        objectArray[73] = "\\CY.N]G\rM+3\\Q@Ct_n\u0003\u0000\u0019.\u000f9^D\u001aa\fS\u0003]Nx3_\\[F-\u0003REL\u001b\u0013\t\\\r\r_w\b\\C\u0004#";
        objectArray[74] = "\u000e@kp*\u000b[\u001b;!\u0015RRVe~y`\u0006\u0012?!\u0015\u0006UDl&)S\u000e\u0014=\u0019$]QC:%q\u0006\u0001\u0012\u0005";
        objectArray[75] = "p\u0017F\b\u0005ZbBH@}K\u007f\u0017v_\fB#@LA\u0000\u001by{I[E\u001ei\u0015\u000f\\\fM\u0013";
        objectArray[76] = "U)!UQVYke^oPQo|\b\u0003b\u0005.'T_5\fk'\u0000\u001d\u000b\u0007ucUo\u0005D(s\u001dQ\u000eZl&o";
        objectArray[77] = "*\u0000hgR,q]:x? {@k{S\u0012)\u00072,\u000eE'Veu\u0000yr\r5$?";
        objectArray[78] = "%1\"+\u0015Lk7\"Y\u001cXe1%5.\u000f(ixY\u001bM #}3FTt:B?\u0019R|or2\u0000E!Q}:A\tc?;=\bZ\u0019";
        objectArray[79] = "\u000fFnR\\^\b\u0002iD%\n_A1SI8\u000b\u0002n\u000b\u001aoPEhF\u001a\u0005\r\\<_%";
        objectArray[80] = "w?\u0010x{\u0015p{\u0017n\u0002A'8Oynss{\u0010.:$,$H{<\u0014!=_&\u0002";
        objectArray[81] = "\u0001GN\"mSZ\u001a\u001c=\u0000_P\u0007M>lm\u0003B\u0014d\u0000\u0005^C\u0011#nCY\nBY";
        objectArray[82] = "C9;0&\u000bQl5x^\tM0l~32NUn=9\u0018Fnu|g\u0014 jh8b\tN,oq1s";
        objectArray[83] = "\bQ\u0011m\u0019\u0011B^\u0016,&\u0012RP\u00149qE\r\fHU_\u0016\f\u0007IlE\u0017\f\u0004";
        objectArray[84] = "\u001c\u001e7RfnIEg\u0003Y<L\u0019=W\u000ek\u0016Ic;i*\u0016\u001b+\u0005b4RN";
        objectArray[85] = "`R#~ix{\u001c7{\u0014ymQ9$xK0\u0011h|\u0014reT+yv#dO0Czyy_c!+xbDY9ss;L=/\u007fxe-";
        objectArray[86] = "V\u0001\u0001\u000e=G\f\u0002\u0003\u000bEDP\u0000\u0019\u001a\u0012\u0013\nVGv\"FM\u0015\u0005\u001bxEO\u0010";
        objectArray[87] = "$ !4=W6u/|EN<\u0001t|9^Gsr<yU)5uu*/";
        objectArray[88] = "gD\u00010\rT|\n\u00155pUjG\u001bj\u001cg>\u000bG0N0dWK=\bHv\u0002Eup";
        objectArray[89] = ",ju\".D~o*#P^xiw8<l/.,ei;%m,0\"\u0005.sheP";
        objectArray[90] = "+N~\u0016RqvW*\u000fm~$J'\u0003\u0001Lp\u000e}ZV\u001b'S>\u0016WyvR%\rm";
        objectArray[91] = "Gn!S\t\u0013\u00125q\u00026A\u0017i+Va\u0016M9w:\u0006WMk=\u0004\rI\t>";
        objectArray[92] = "\b\u0003a]EJ\u0007CgU'\u001a\u0006S8SpN\\\u0007a\u0005'\u001b\u0015^f@\u001c\f\t\u0001#";
        objectArray[93] = "\u001d`X$\u0000%\u0016u\b'k&\u001af\u0001%\u0007\u0014M$[zWC\u0018h\u0001x\u0014x\u000ft^=k";
        objectArray[94] = ",bz\u0003\u0006^~g%\u0002xDxax\u0019\u0014v/&#GG!%e#\u0011\n\u001f.{gDx";
        objectArray[95] = "\u000b!\u00001+zA.\u0007p\u0014yQ \u0005eC.\u000frX\tzrI?[k+sR$";
        objectArray[96] = "\u001c1z29o\u0007\u007fn7Dn\u00112`h(\\Ft;3{\u000b\u001e69}{aC/mdD4\u001fv<u*r\u0018?o\u000f";
        objectArray[97] = "\u0002\u001eY\u001c\u0006NNHI\u001b?ZSB#GG\u001a]V\u001dLY^\b$\u0013\u000f\u0004N@\u001a\u0018\u0011@\u001b2";
        objectArray[98] = "4L\fP\u0002\u00007\u0015WT}\u0005`YVM\u001176\u001b\n\u0017A`dJ\u000e\u0013\u0010\u0019b@\u000bK}";
        objectArray[99] = "#\u000b\u00145gvvPDdX$s\f\u001e0\u000fs)\\C\\h2)\u000e\bbc,m[";
        objectArray[100] = "P\u001e\u000ebY|\t\u0006\u0012f8p\r\u001a\u00113o#\\OE_\u0004w\u0017J\u0014=]o\u000bN";
        objectArray[101] = "k'b\u0012|!!(eSC\"1&gF\u0014uou>*%+<9\u007fL:p1$";
        objectArray[102] = "\u001e\u00054J\b\f\u0005K Ou\r\u0013\u0006.\u0010\u0019?NA\u007fLu\u0006\u001b\u0003<M\u0017W\u001a\u0018'w\u001b\r\u0007\bt\u0015J\f\u001c\u0013NH\u0016PB\u0000 \u000e\u0011\u0019\u0011z";
        objectArray[103] = "4\u007f^\u0013Z/gp\u0010@d3g`\u0001N\b\u00010'_\u0017YV5\u007fY\u0015\u001e8sx\u0010Fd";
        objectArray[104] = "\u0014\u0001xw\u0014\u001fI\u0018,n+\u0010\u001b\u0005!bG\"OAy5\u0017u\u0014\u0001xw\u0014\u001fI\u0018,n+";
        objectArray[105] = "\\oS\u0002\u0013\u0018\u00072\u0001\u001d~\u0014\r/P\u001e\u0012&^j\bE~M\t(\r\u0018\u001c\u0014\u00114\tyD\u0014QbL\u001dE\u0014\u001fk0";
        objectArray[106] = "0E\u001aM5\u0006m\\NT\n\t?ACXf;k\u0005\u0019\u00012l<XZM0\u000emYAV\n";
        objectArray[107] = "7< q0`m8? M)Q\u0003|!,(5n6.+i";
        objectArray[108] = "\"\u0013\u0004\u000f\u0017~\u007f\nP\u0016(q-\u0017]\u001aDCyS\u0007C\u0014\u0014.\u000eD\u000f\u0012v\u007f\u000f_\u0014(";
        Object[] objectArray2 = objectArray;
        objectArray[109] = ">'9\u0007ms=~b\u0003\u0012vj2c\u001a~D<p?@/\u0013n!;D\u007fjh+>\u001c\u0012";
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _4F.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _4F.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _4F.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = _4F.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _4F.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _4F.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _4F.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _4F.a(clazz3, string2, clazz2)) != null) {
                    _4F.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = _4F.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        _4F.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _4F.b(2534706487953551L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n) continue;
            for (int i = 0; i < n; ++i) {
                if (classArray2[i] != classArray[i]) continue block0;
            }
            return method;
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _4F.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = _4F.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method d(long l2, long l3) {
        int n = _4F.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = c[n];
                int n3 = string2.indexOf(8);
                clazz3 = _4F.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                for (int i = 0; i < n5; ++i) {
                    int n7 = string2.indexOf(8, n6);
                    clazz2 = _4F.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _4F.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _4F.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _4F.b(2534706487953551L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = _4F.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _4F.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _4F.b(2534706487953551L, 0L);
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'y' || c == '\u00ee' || c == '\u00f2' || c == '\u00ca') {
                field = _4F.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'y' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ee' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _4F.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e7' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'x' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _4F.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/4F" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_4F.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

