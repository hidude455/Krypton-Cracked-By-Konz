/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.krypton.8z
 *  it.unimi.dsi.fastutil.objects.Object2IntArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  java.lang.MatchException
 *  net.minecraft.class_10192
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_5321
 *  net.minecraft.class_6880
 *  net.minecraft.class_9304
 */
package dev.krypton;

import dev.krypton._4w;
import dev.krypton._8z;
import dev.krypton.l;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.class_10192;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_5321;
import net.minecraft.class_6880;
import net.minecraft.class_9304;

public class _42 {
    private static final long a = l.a(5451565693980961037L, 2299951728142466257L, MethodHandles.lookup().lookupClass()).a(191463345342105L);
    private static final Object[] b = new Object[49];
    private static final String[] c = new String[49];

    public static boolean cfr_renamed_0(Object[] objectArray) {
        long l2;
        long l3;
        long l4;
        class_5321 class_53212;
        class_1799 class_17992;
        block3: {
            Object object;
            block2: {
                class_17992 = (class_1799)objectArray[0];
                class_53212 = (class_5321)objectArray[1];
                l4 = (Long)objectArray[2];
                long l5 = l4 = a ^ l4;
                l3 = l5 ^ 0x64AFF2E188ADL;
                l2 = l5 ^ 0x42C1C6575BCBL;
                String string = _8z.cfr_renamed_4();
                try {
                    object = _42.a("d", (Object)class_17992, 5901561947370638984L, (long)l4);
                    if (string != null) break block2;
                    if (object == false) break block3;
                }
                catch (MatchException matchException) {
                    throw _42.a(matchException);
                }
                object = false;
            }
            return (boolean)object;
        }
        Object2IntArrayMap object2IntArrayMap = new Object2IntArrayMap();
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l3;
        objectArray2[1] = object2IntArrayMap;
        objectArray2[0] = class_17992;
        _42.a("\u00f0", (Object)objectArray2, 5901818399679119363L, (long)l4);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l2;
        objectArray3[1] = class_53212;
        objectArray3[0] = object2IntArrayMap;
        return (boolean)_42.a("\u00f0", (Object)objectArray3, 5901200504470127948L, (long)l4);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean cfr_renamed_3(Object[] var0) {
        block17: {
            block16: {
                block15: {
                    var5_1 = (class_1799)var0[0];
                    var1_2 = (class_5321)var0[1];
                    var2_3 = (Long)var0[2];
                    var4_4 = (Integer)var0[3];
                    var6_5 = (var2_3 = _42.a ^ var2_3) ^ 61707987872517L;
                    var8_6 = _8z.cfr_renamed_4();
                    try {
                        v0 /* !! */  = _42.a("d", (Object)var5_1, (long)-5598304316127531744L, (long)var2_3);
                        if (var8_6 != null) break block15;
                        if (v0 /* !! */  == false) break block16;
                    }
                    catch (MatchException v1) {
                        throw _42.a(v1);
                    }
                    v0 /* !! */  = (CallSite)false;
                }
                return (boolean)v0 /* !! */ ;
            }
            var9_7 = new Object2IntArrayMap();
            v2 = new Object[3];
            v2[2] = var6_5;
            v2[1] = var9_7;
            v2[0] = var5_1;
            _42.a("\u00f0", (Object)v2, (long)-5598216088552807509L, (long)var2_3);
            var10_8 = _42.a("d", (Object)_42.a("d", (Object)var9_7, (long)-5599584903435761283L, (long)var2_3), (long)-5598477961580710803L, (long)var2_3);
            while (_42.a("d", (Object)var10_8, (long)-5599024186326140251L, (long)var2_3) != false) {
                block19: {
                    block20: {
                        block18: {
                            var11_9 = (Object2IntMap.Entry)_42.a("d", (Object)var10_8, (long)-5602418145030161636L, (long)var2_3);
                            try {
                                try {
                                    try {
                                        v3 /* !! */  = _42.a("d", (Object)((class_6880)_42.a("d", (Object)var11_9, (long)-5598868765545444570L, (long)var2_3)), (Object)var1_2, (long)-5602386922510599919L, (long)var2_3);
                                        v4 = var8_6;
                                        if (var2_3 >= 0L) {
                                            if (v4 != null) break block17;
                                            v4 = var8_6;
                                        }
                                        if (var2_3 >= 0L) {
                                            if (v4 != null) break block18;
                                        }
                                        ** GOTO lbl56
                                    }
                                    catch (MatchException v5) {
                                        throw _42.a(v5);
                                    }
                                    if (!v3 /* !! */ ) break block19;
                                }
                                catch (MatchException v6) {
                                    throw _42.a(v6);
                                }
                                v7 /* !! */  = _42.a("d", (Object)var11_9, (long)-5601432258459739589L, (long)var2_3);
                            }
                            catch (MatchException v8) {
                                throw _42.a(v8);
                            }
                        }
                        try {
                            try {
                                v4 = var8_6;
lbl56:
                                // 2 sources

                                if (v4 != null) break block20;
                                if (v7 /* !! */  != var4_4) break block19;
                            }
                            catch (MatchException v9) {
                                throw _42.a(v9);
                            }
                            v7 /* !! */  = true;
                        }
                        catch (MatchException v10) {
                            throw _42.a(v10);
                        }
                    }
                    return v7 /* !! */ ;
                }
                if (var8_6 == null) continue;
            }
            v3 /* !! */  = false;
        }
        return v3 /* !! */ ;
    }

    private static boolean cfr_renamed_4(Object[] objectArray) {
        Object object;
        block6: {
            Object2IntMap object2IntMap = (Object2IntMap)objectArray[0];
            class_5321 class_53212 = (class_5321)objectArray[1];
            long l2 = (Long)objectArray[2];
            l2 = a ^ l2;
            String string = _8z.cfr_renamed_4();
            CallSite callSite = _42.a("d", (Object)_42.a("d", (Object)object2IntMap, 1872853702963922111L, (long)l2), 1872459506628648927L, (long)l2);
            while (_42.a("d", (Object)callSite, 1872970633977139479L, (long)l2) != false) {
                block8: {
                    boolean bl;
                    block7: {
                        class_6880 class_68802 = (class_6880)_42.a("d", (Object)callSite, 1869648698410111150L, (long)l2);
                        try {
                            try {
                                object = _42.a("d", (Object)class_68802, (Object)class_53212, 1869617484419666595L, (long)l2);
                                String string2 = string;
                                if (l2 >= 0L) {
                                    if (string2 != null) break block6;
                                    string2 = string;
                                }
                                if (string2 != null) break block7;
                            }
                            catch (MatchException matchException) {
                                throw _42.a(matchException);
                            }
                            if (!object) break block8;
                        }
                        catch (MatchException matchException) {
                            throw _42.a(matchException);
                        }
                        bl = true;
                    }
                    return bl;
                }
                if (string == null) continue;
            }
            object = false;
        }
        return object;
    }

    public static void cfr_renamed_7(Object[] objectArray) {
        block10: {
            CallSite callSite;
            String string;
            long l2;
            Object2IntMap object2IntMap;
            block13: {
                class_1799 class_17992;
                block11: {
                    class_1799 class_17993;
                    block12: {
                        block9: {
                            class_17993 = (class_1799)objectArray[0];
                            object2IntMap = (Object2IntMap)objectArray[1];
                            l2 = (Long)objectArray[2];
                            l2 = a ^ l2;
                            string = _8z.cfr_renamed_4();
                            try {
                                try {
                                    _42.a("d", (Object)object2IntMap, -3849161980293568303L, (long)l2);
                                    class_17992 = class_17993;
                                    if (string != null) break block9;
                                    if (_42.a("d", (Object)class_17992, -3847604086062983692L, (long)l2) != false) break block10;
                                }
                                catch (MatchException matchException) {
                                    throw _42.a(matchException);
                                }
                                class_17992 = class_17993;
                            }
                            catch (MatchException matchException) {
                                throw _42.a(matchException);
                            }
                        }
                        try {
                            try {
                                if (string != null) break block11;
                                if (_42.a("d", (Object)class_17992, -3849014872114976593L, (long)l2) != _42.a("\u00e4", -3847221132664433421L, (long)l2)) break block12;
                            }
                            catch (MatchException matchException) {
                                throw _42.a(matchException);
                            }
                            callSite = _42.a("d", (Object)((class_9304)_42.a("d", (Object)class_17993, (Object)_42.a("\u00e4", -3848062550206393123L, (long)l2), -3847533287977976905L, (long)l2)), -3848041192416283579L, (long)l2);
                            break block13;
                        }
                        catch (MatchException matchException) {
                            throw _42.a(matchException);
                        }
                    }
                    class_17992 = class_17993;
                }
                callSite = _42.a("d", (Object)_42.a("d", (Object)class_17992, -3849190673894479183L, (long)l2), -3848041192416283579L, (long)l2);
            }
            CallSite callSite2 = callSite;
            CallSite callSite3 = _42.a("d", (Object)callSite2, -3849040480532811943L, (long)l2);
            while (_42.a("d", (Object)callSite3, -3848318526653414799L, (long)l2) != false) {
                Object2IntMap.Entry entry = (Object2IntMap.Entry)_42.a("d", (Object)callSite3, -3849322056584313912L, (long)l2);
                _42.a("d", (Object)object2IntMap, (Object)((class_6880)_42.a("d", (Object)entry, -3848166318237600782L, (long)l2)), (int)_42.a("d", (Object)entry, -3848338443152743697L, (long)l2), -3847424628966740207L, (long)l2);
                if (string == null) continue;
            }
        }
    }

    public static boolean cfr_renamed_0(long l2, class_1792 class_17922) {
        Object object;
        block11: {
            block10: {
                class_10192 class_101922;
                String string;
                block9: {
                    l2 = a ^ l2;
                    CallSite callSite = _42.a("d", (Object)class_17922, 5863504575220243759L, (long)l2);
                    class_10192 class_101923 = (class_10192)_42.a("d", (Object)callSite, (Object)_42.a("\u00e4", 5862707008889459438L, (long)l2), 5863563070789869682L, (long)l2);
                    string = _8z.cfr_renamed_4();
                    try {
                        class_101922 = class_101923;
                        if (string != null) break block9;
                        if (class_101922 == null) break block10;
                    }
                    catch (MatchException matchException) {
                        throw _42.a(matchException);
                    }
                    class_101922 = class_101923;
                }
                try {
                    try {
                        if (_42.a("d", (Object)class_101922, 5862796602083765666L, (long)l2) != _42.a("\u00e4", 5859720633543275337L, (long)l2)) break block10;
                        object = _42.a("d", (Object)class_17922, (Object)_42.a("\u00e4", 5862852372913731298L, (long)l2), 5859336796331749350L, (long)l2);
                        if (string != null) break block11;
                    }
                    catch (MatchException matchException) {
                        throw _42.a(matchException);
                    }
                    if (object) break block10;
                }
                catch (MatchException matchException) {
                    throw _42.a(matchException);
                }
                object = 1;
                break block11;
            }
            object = false;
        }
        try {
            if (l2 > 0L && _4w.cfr_renamed_8() == null) {
                _8z.cfr_renamed_7((String)"t9Jfwb");
            }
        }
        catch (MatchException matchException) {
            throw _42.a(matchException);
        }
        return object;
    }

    static {
        _42.a();
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
            case 1 -> 16;
            case 2 -> 17;
            case 3 -> 63;
            case 4 -> 1;
            case 5 -> 12;
            case 6 -> 50;
            case 7 -> 31;
            case 8 -> 46;
            case 9 -> 37;
            case 10 -> 55;
            case 11 -> 11;
            case 12 -> 40;
            case 13 -> 22;
            case 14 -> 26;
            case 15 -> 2;
            case 16 -> 15;
            case 17 -> 54;
            case 18 -> 29;
            case 19 -> 49;
            case 20 -> 9;
            case 21 -> 61;
            case 22 -> 38;
            case 23 -> 28;
            case 24 -> 8;
            case 25 -> 44;
            case 26 -> 33;
            case 27 -> 30;
            case 28 -> 14;
            case 29 -> 13;
            case 30 -> 57;
            case 31 -> 24;
            case 32 -> 48;
            case 33 -> 58;
            case 34 -> 42;
            case 35 -> 43;
            case 36 -> 7;
            case 37 -> 4;
            case 38 -> 20;
            case 39 -> 10;
            case 40 -> 19;
            case 41 -> 62;
            case 42 -> 56;
            case 43 -> 23;
            case 44 -> 53;
            case 45 -> 6;
            case 46 -> 45;
            case 47 -> 18;
            case 48 -> 34;
            case 49 -> 51;
            case 50 -> 52;
            case 51 -> 32;
            case 52 -> 0;
            case 53 -> 41;
            case 54 -> 36;
            case 55 -> 3;
            case 56 -> 39;
            case 57 -> 35;
            case 58 -> 60;
            case 59 -> 59;
            case 60 -> 5;
            case 61 -> 47;
            case 62 -> 21;
            default -> 25;
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
        _42.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "<\t\u0013\u000bPt8\u0014\u0013\u001aMt{\u001b\\\rJh!\u0014QPQ\u007f?\u0018^\nM3\u001a\u001fW\u001b]ig4S\ns|%Yx\u0010Jo,";
        objectArray[1] = Integer.TYPE;
        _42.c[1] = "java/lang/Integer";
        objectArray[2] = "\\q;\u00016H\\q,]:GF:,C:RAK~\u0018b\u0018";
        objectArray[3] = "\u00142?@v5\u00142(\u001cz:\u000ey(\u0002z/\t\br](m";
        objectArray[4] = "\u0001z{}\u0001\u0004\nuj2`\n\u0001~nh";
        objectArray[5] = "'\u000f]%08#\u0012]4-8`\u001d\u0012#*$:\u0012\u001f~13$\u001e\u0010$-\u007f\u0001\u0019\u00195=%|2\u001d$\u00130>";
        objectArray[6] = "\u001dHe\u001aw_\u001dHrF{P\u0007\u0003rX{E\u0000r \f*\u0004";
        objectArray[7] = "\u000e)Jy<=\u000e)]%02\u0014b];0'\u0013\u0013\u000f`hf";
        objectArray[8] = "\u00071g\u001fN\u001e\u00199}P)\u001f\b\"p\n\u000f\u0019";
        objectArray[9] = Boolean.TYPE;
        _42.c[9] = "java/lang/Boolean";
        objectArray[10] = ";MwNAb;M`\u0012Mm!\u0006`\fMx&w:S\u001c?";
        objectArray[11] = "(\u000f*j\u0005^(\u000f=6\tQ2D=(\tD55gw[\u0003";
        objectArray[12] = "\u0019C\u0013y5A\u0007K\t6HQ\u0007";
        objectArray[13] = Void.TYPE;
        _42.c[13] = "java/lang/Void";
        objectArray[14] = "Mno\u001e;dMnxB7kW%x\\7~PT*\u0003f9";
        objectArray[15] = "/Q)%y#/Q>yu,5\u001a>gu92kl;%ss";
        objectArray[16] = "i5E/<2t Gn9n9b";
        objectArray[17] = "v?9%[(\u0003\u001f2*Jgb\u00119!N=\u0016";
        objectArray[18] = "{?X:\u0006e{?Of\njatOx\n\u007ff\u0005\u001a,S<";
        objectArray[19] = "1u\u000b2]\r1u\u001cnQ\u0002+>\u001cpQ\u0017,OJ/\u0002U";
        objectArray[20] = "J\u0002Z%\n=N\u001fZ4\u0017=\r\u0010\u0015#\u0010!W\u001f\u0018~\u000b6I\u0013\u0017$\u0017zl\u0014\u001e5\u0007 p\u0013\u0000";
        objectArray[21] = "\"\t\ty\u000f\u0010&\u0014\th\u0012\u0010e\u001bF\u007f\u0015\f?\u0014K\"\u000e\u001b!\u0018Dx\u0012W\u0004\u001fMi\u0002\r\u0002\tB~\u0000\r$\u000f";
        objectArray[22] = "\"*\u007f+\u000e\nW\nt$\u001fE6\u0004\u007f/\u001b\u001fB";
        objectArray[23] = "?\u0012\u001b}(1b\u0001VE{,r=\u000f9J(j\u0001\u0004Eh#5\u001cQ>dyk|";
        objectArray[24] = "\u001b$R\u001fa:\u00158\\\u001d\u0003!\u001d$C\u0014o\u0013L`\u0019I>D\u001c6I\u0014a?\u0014i\u0013\u0014\u0003z\rd\u001c\u0012d4\t\"Ss";
        objectArray[25] = "L=sB\u0011H\u0019\u007f|\u0018}S\u001f}f!F\f\u0012icE\u0011\r\u001dt\u001a";
        objectArray[26] = "Ni@im\u0010[jC1\u0012\u0012F;\u001eeEB\u001eiF\t{C\u001d6\u0005en@\u001en";
        objectArray[27] = "6uyj4Pfr,jHNbupc$|29.9w+07zd:Hsv-~H";
        objectArray[28] = "sa7MOH8)rU\"J,~`Q\"\u0010,~yM\u0012\u0010&xf+";
        objectArray[29] = "um6\u007fGY%~4~&G9k<'ZA?\u0006x~OE){-<@\u001fE";
        objectArray[30] = "\u007fy!0{{/~t0\u0007e+y(9kWy4po\u0007=&{u;:1!uu^";
        objectArray[31] = "ML?o0\u0019\u001aM0rI\u0010\u000f\b6o2}ML?o0\u0019\u001aM0rIC\u000bI`j.\r\u000f\u000f/\u000b";
        objectArray[32] = "Z$!\u0003\u0013kV#/\u0003v3\n8?Y\u001a\u0001Xtb\u0002vo\u001b-1B\r?\u001cx1>";
        objectArray[33] = ",\u0019Z(\u0002x;\nO(gg<\u0005E!\u001ba:hR2]\u007f \bB*\u001a\u007f@";
        objectArray[34] = "!r@+S<qu\u0015+/\"urI\"C\u0010'?\u0017}/ye2\u0016$H7atYE";
        objectArray[35] = "IVVkS\u0019\u0019Q\u0003k/\u0007\u001dV_bC5M\u001a\u00014\u0013bJ\u0014^iE[\u0019PX=/YIJ[|K\u000eHEF\u0005";
        objectArray[36] = "-Js.i%f\u000266\u00044kDMs=,rA)$<#o81*?,.C=paLjZv(<7f\u0000(H";
        objectArray[37] = "[v\u001bY\u0015w\u000byHPus1rFO\u0005\u007fJ~@IDO\u0000xIG\u0013\u007f\u0000rOXu";
        objectArray[38] = "-lW\u0005FUf$\u0012\u001d+_{o2\u000eW<zo\f\u0003NBm|\u0019\u0003+";
        objectArray[39] = "\u0004A\u000eL_\u001b\u0005\u0012\f\u000b4\u0007YO\u0003[cY\u0005\u0013W7\t\tF\u001f\u0002\n\u0005\u000eH\u001f";
        objectArray[40] = "R9;\u0005\u0013<\u0007{4_\u007f!\u0005r\u0014\u000b\u000f=l7/Z@ \u000by+\u001c\u000fA";
        objectArray[41] = "rS$\u0017Mns\u0000&P&r/])\u0000q,~\u000bvl\u001b|0\r(Q\u0017{>\r";
        objectArray[42] = "M>cpo1\u0010-.H<,\u0000\u0013|9SzE0u17-D?hH";
        objectArray[43] = "p\u0015X9T~t\u0014Tr4).\u0000Q$c{~S\ts4}q\fY\"\r.5\n\r";
        objectArray[44] = "DaM.\u0001>\u0007 \u001a4s8\u0016#G)\u001f\nF`\u001auB]K4W\u007f\u0012\"\u001b'U~s";
        objectArray[45] = "\u0011C\u001e\u0012\u0015FALM\u001buF{GC\u0004\u0005N\u0000KE\u0002D~ET\u001dC\u0014\u0019\u000bP[\fu";
        objectArray[46] = "gI@cG_dN@t{\fiSDS@^1\n<mD]nIPxG^66";
        objectArray[47] = "\u000e\u0012\u000e=\f'\n\u0013\u0002vlpP\u0007\u0007 ;#\rSRrl$\u000f\u000b\u000f&UwK\r[";
        Object[] objectArray2 = objectArray;
        objectArray[48] = "\u0010ym\u00139@[1(\u000bTNAi>\u001e(\u0013jm/82UQz\b\u0018()Gz6\u00151WPi#\u0015T";
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _42.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _42.b[n] = clazz = Class.forName(c[n]);
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
        Field field = _42.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _42.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _42.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _42.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _42.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _42.a(clazz3, string2, clazz2)) != null) {
                    _42.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _42.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _42.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _42.b(308880491131034L, 0L);
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
            for (int j = 0; j < n; ++j) {
                if (classArray2[j] != classArray[j]) continue block0;
            }
            return method;
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _42.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _42.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method d(long l2, long l3) {
        int n = _42.a(l2, l3);
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
                clazz3 = _42.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _42.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _42.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _42.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _42.b(308880491131034L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _42.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _42.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _42.b(308880491131034L, 0L);
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
            if (c == '\u00e3' || c == '\u00dc' || c == '\u00e4' || c == '\u00f5') {
                field = _42.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e3' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00dc' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e4' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _42.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'd' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f0' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _42.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/42" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_42.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

