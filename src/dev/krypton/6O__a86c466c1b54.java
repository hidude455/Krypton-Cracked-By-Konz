/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.krypton.9v
 *  dev.krypton.9y
 */
package dev.krypton;

import dev.krypton._39;
import dev.krypton._4w;
import dev.krypton._9v;
import dev.krypton._9y;
import dev.krypton.l;
import java.io.IOException;
import java.io.Serializable;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.net.ssl.HttpsURLConnection;

/*
 * Renamed from dev.krypton.6O
 */
public class _6o_0 {
    private final String cfr_renamed_7;
    private final List cfr_renamed_3 = new ArrayList();
    private String cfr_renamed_4;
    private String cfr_renamed_6;
    private String cfr_renamed_9;
    private boolean cfr_renamed_1;
    private static boolean cfr_renamed_5;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static final Object[] h;
    private static final String[] i;

    public _6o_0(String string) {
        this.cfr_renamed_7 = string;
    }

    public void cfr_renamed_1(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l2 = a ^ l2;
        _6o_0.c("F", (Object)this, (String)string, -3124377178350085195L, (long)l2);
    }

    public void cfr_renamed_7(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = a ^ l2;
        _6o_0.c("F", (Object)this, (String)string, -8084354724519772911L, (long)l2);
    }

    public void cfr_renamed_8(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = a ^ l2;
        _6o_0.c("F", (Object)this, (String)string, -7419595853254250153L, (long)l2);
    }

    public void cfr_renamed_2(Object[] objectArray) {
        boolean bl = (Boolean)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = a ^ l2;
        _6o_0.c("F", (Object)this, (boolean)bl, 3116470216337115282L, (long)l2);
    }

    public void cfr_renamed_6(Object[] objectArray) {
        _39 var2_2 = (_39)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = a ^ l2;
        _6o_0.c("\u00f0", (Object)_6o_0.c("\u00d6", (Object)this, 982075496866910520L, (long)l2), (Object)var2_2, 983794979292017252L, (long)l2);
    }

    public void cfr_renamed_0(Object[] objectArray) throws IOException {
        Object object;
        Object object2;
        Serializable serializable;
        _9y y;
        long l2;
        block24: {
            boolean bl;
            long l3;
            long l4;
            long l5;
            long l6;
            long l7;
            long l8;
            long l9;
            long l10;
            long l11;
            long l12;
            long l13;
            long l14;
            long l15;
            long l16;
            long l17;
            long l18;
            int n;
            int n2;
            int n3;
            long l19;
            long l20;
            long l21;
            block23: {
                _6o_0 o_0;
                block22: {
                    l2 = (Long)objectArray[0];
                    long l22 = l2 = a ^ l2;
                    l21 = l22 ^ 0x7190E1277FFBL;
                    l20 = l22 ^ 0x7A8D5A8A895CL;
                    l19 = l22 ^ 0x11D4DD752CBBL;
                    long l23 = l22 ^ 0x1663B93DC526L;
                    n3 = (int)(l23 >>> 32);
                    n2 = (int)(l23 << 32 >>> 48);
                    n = (int)(l23 << 48 >>> 48);
                    l18 = l22 ^ 0x6DC47E275B22L;
                    l17 = l22 ^ 0x586D004CEAF7L;
                    l16 = l22 ^ 0x2AA946270E51L;
                    l15 = l22 ^ 0x1680C2C3A713L;
                    l14 = l22 ^ 0x747B466593D3L;
                    l13 = l22 ^ 0x6E2B9C13E602L;
                    l12 = l22 ^ 0x7EDD32F5DBF5L;
                    l11 = l22 ^ 0x1366942D1505L;
                    l10 = l22 ^ 0x3549E652BBD0L;
                    l9 = l22 ^ 0x39578522C498L;
                    l8 = l22 ^ 0x20E5A2A8B7EDL;
                    l7 = l22 ^ 0x7E96221ECDFDL;
                    l6 = l22 ^ 0x8B1AB0FC133L;
                    l5 = l22 ^ 0x776F88ADB9AL;
                    l4 = l22 ^ 0x4EBD423ACD0BL;
                    l3 = l22 ^ 0x64A4B911DB6EL;
                    bl = _6o_0.cfr_renamed_4();
                    try {
                        try {
                            o_0 = this;
                            if (bl) break block22;
                            if (_6o_0.c("\u00d6", (Object)o_0, -4086561514234836897L, (long)l2) != null) break block23;
                        }
                        catch (IOException iOException) {
                            throw _6o_0.a(iOException);
                        }
                        o_0 = this;
                    }
                    catch (IOException iOException) {
                        throw _6o_0.a(iOException);
                    }
                }
                try {
                    if (_6o_0.c("\u00f0", (Object)_6o_0.c("\u00d6", (Object)o_0, -4085506790056535084L, (long)l2), -4085654587338190471L, (long)l2) != false) {
                        throw new IllegalArgumentException((String)((Object)_6o_0.a("h", 25639, (long)(0x67AEE7852CB8F1FAL ^ l2))));
                    }
                }
                catch (IOException iOException) {
                    throw _6o_0.a(iOException);
                }
            }
            y = new _9y(this);
            Object[] objectArray2 = new Object[3];
            objectArray2[2] = l9;
            objectArray2[1] = _6o_0.c("\u00d6", (Object)this, -4086561514234836897L, (long)l2);
            objectArray2[0] = _6o_0.a("h", 10849, (long)(0x148436A8CA673FB6L ^ l2));
            _6o_0.c("\u00f0", (Object)y, (Object)objectArray2, -4084990173794703374L, (long)l2);
            Object[] objectArray3 = new Object[3];
            objectArray3[2] = l9;
            objectArray3[1] = _6o_0.c("\u00d6", (Object)this, -4085698375655410285L, (long)l2);
            objectArray3[0] = _6o_0.a("h", 20591, (long)(0x346FF4DE33D245B6L ^ l2));
            _6o_0.c("\u00f0", (Object)y, (Object)objectArray3, -4084990173794703374L, (long)l2);
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = l9;
            objectArray4[1] = _6o_0.c("\u00d6", (Object)this, -4082962595168456951L, (long)l2);
            objectArray4[0] = _6o_0.a("h", 6948, (long)(0x2791D1810D160EE9L ^ l2));
            _6o_0.c("\u00f0", (Object)y, (Object)objectArray4, -4084990173794703374L, (long)l2);
            Object[] objectArray5 = new Object[3];
            objectArray5[2] = l9;
            objectArray5[1] = _6o_0.c("\u00f6", (boolean)_6o_0.c("\u00d6", (Object)this, -4089037979873041171L, (long)l2), -4085405766605014025L, (long)l2);
            objectArray5[0] = _6o_0.a("h", 11357, (long)(0x44F780EA460B3982L ^ l2));
            _6o_0.c("\u00f0", (Object)y, (Object)objectArray5, -4084990173794703374L, (long)l2);
            if (_6o_0.c("\u00f0", (Object)_6o_0.c("\u00d6", (Object)this, -4085506790056535084L, (long)l2), -4085654587338190471L, (long)l2) == false) {
                Object object3;
                serializable = new ArrayList();
                object2 = _6o_0.c("\u00f0", (Object)_6o_0.c("\u00d6", (Object)this, -4085506790056535084L, (long)l2), -4085328566915427760L, (long)l2);
                block12: while (_6o_0.c("\u00f0", (Object)object2, -4085303242515194150L, (long)l2) != false) {
                    object3 = _6o_0.c("\u00f0", (Object)object2, -4083169556885633425L, (long)l2);
                    do {
                        boolean bl2;
                        block27: {
                            block28: {
                                Object object4;
                                CallSite callSite;
                                Object object5;
                                _9y y2;
                                block25: {
                                    block26: {
                                        object = (_39)object3;
                                        y2 = new _9y(this);
                                        try {
                                            try {
                                                Object[] objectArray6 = new Object[1];
                                                objectArray6[0] = l7;
                                                Object[] objectArray7 = new Object[3];
                                                objectArray7[2] = l9;
                                                objectArray7[1] = _6o_0.c("\u00f0", (Object)object, (Object)objectArray6, -4086658884970720538L, (long)l2);
                                                objectArray7[0] = _6o_0.a("h", 26495, (long)(0x5576B38D40DBF2ABL ^ l2));
                                                _6o_0.c("\u00f0", (Object)y2, (Object)objectArray7, -4084990173794703374L, (long)l2);
                                                Object[] objectArray8 = new Object[1];
                                                objectArray8[0] = l20;
                                                Object[] objectArray9 = new Object[3];
                                                objectArray9[2] = l9;
                                                objectArray9[1] = _6o_0.c("\u00f0", (Object)object, (Object)objectArray8, -4086014986013052881L, (long)l2);
                                                objectArray9[0] = _6o_0.a("h", 23052, (long)(0x39017B97D7CB4FC8L ^ l2));
                                                _6o_0.c("\u00f0", (Object)y2, (Object)objectArray9, -4084990173794703374L, (long)l2);
                                                Object[] objectArray10 = new Object[1];
                                                objectArray10[0] = l21;
                                                Object[] objectArray11 = new Object[3];
                                                objectArray11[2] = l9;
                                                objectArray11[1] = _6o_0.c("\u00f0", (Object)object, (Object)objectArray10, -4084828903392380290L, (long)l2);
                                                objectArray11[0] = _6o_0.a("h", 6116, (long)(0x17537BBA2BFA022AL ^ l2));
                                                _6o_0.c("\u00f0", (Object)y2, (Object)objectArray11, -4084990173794703374L, (long)l2);
                                                if (bl) break block24;
                                                object5 = object;
                                                if (bl) break block25;
                                            }
                                            catch (IOException iOException) {
                                                throw _6o_0.a(iOException);
                                            }
                                            Object[] objectArray12 = new Object[1];
                                            objectArray12[0] = l16;
                                            if (_6o_0.c("\u00f0", (Object)object5, (Object)objectArray12, -4083014407831880416L, (long)l2) == null) break block26;
                                        }
                                        catch (IOException iOException) {
                                            throw _6o_0.a(iOException);
                                        }
                                        Object[] objectArray13 = new Object[1];
                                        objectArray13[0] = l16;
                                        callSite = _6o_0.c("\u00f0", (Object)object, (Object)objectArray13, -4083014407831880416L, (long)l2);
                                        CallSite callSite2 = _6o_0.c("\u00d6", (Object)callSite, -4082866528451218191L, (long)l2);
                                        reference var52_35 = (callSite2 << _6o_0.b("y", 9604, (long)(0x67DC87C6DC20129BL ^ l2))) + _6o_0.c("\u00d6", (Object)callSite, -4083431455417116423L, (long)l2);
                                        var52_35 = (var52_35 << _6o_0.b("y", 21657, (long)(0x688C372B95F9E387L ^ l2))) + _6o_0.c("\u00d6", (Object)callSite, -4089155023210728368L, (long)l2);
                                        Object[] objectArray14 = new Object[3];
                                        objectArray14[2] = l9;
                                        objectArray14[1] = _6o_0.c("\u00f6", (int)var52_35, -4086478155024731903L, (long)l2);
                                        objectArray14[0] = _6o_0.a("h", 31322, (long)(0x2E5E95DD7FF4EF9CL ^ l2));
                                        _6o_0.c("\u00f0", (Object)y2, (Object)objectArray14, -4084990173794703374L, (long)l2);
                                    }
                                    object5 = object;
                                }
                                Object[] objectArray15 = new Object[1];
                                objectArray15[0] = l12;
                                callSite = _6o_0.c("\u00f0", (Object)object5, (Object)objectArray15, -4085588144601336888L, (long)l2);
                                Object[] objectArray16 = new Object[1];
                                objectArray16[0] = l17;
                                CallSite callSite2 = _6o_0.c("\u00f0", (Object)object, (Object)objectArray16, -4086446558933926303L, (long)l2);
                                Object[] objectArray17 = new Object[1];
                                objectArray17[0] = l11;
                                CallSite callSite3 = _6o_0.c("\u00f0", (Object)object, (Object)objectArray17, -4082564450251341778L, (long)l2);
                                Object[] objectArray18 = new Object[1];
                                objectArray18[0] = l8;
                                CallSite callSite4 = _6o_0.c("\u00f0", (Object)object, (Object)objectArray18, -4086258536928099483L, (long)l2);
                                Object[] objectArray19 = new Object[1];
                                objectArray19[0] = l14;
                                CallSite callSite5 = _6o_0.c("\u00f0", (Object)object, (Object)objectArray19, -4083568031259783067L, (long)l2);
                                if (callSite != null) {
                                    object4 = new _9y(this);
                                    Object[] objectArray20 = new Object[1];
                                    objectArray20[0] = l6;
                                    Object[] objectArray21 = new Object[3];
                                    objectArray21[2] = l9;
                                    objectArray21[1] = _6o_0.c("\u00f0", (Object)callSite, (Object)objectArray20, -4085087955952466008L, (long)l2);
                                    objectArray21[0] = _6o_0.a("h", 19796, (long)(0x3EBAA9CDD6C15893L ^ l2));
                                    _6o_0.c("\u00f0", (Object)object4, (Object)objectArray21, -4084990173794703374L, (long)l2);
                                    Object[] objectArray22 = new Object[1];
                                    objectArray22[0] = l13;
                                    Object[] objectArray23 = new Object[3];
                                    objectArray23[2] = l9;
                                    objectArray23[1] = _6o_0.c("\u00f0", (Object)callSite, (Object)objectArray22, -4083592125089903172L, (long)l2);
                                    objectArray23[0] = _6o_0.a("h", 21843, (long)(0x52F5E677671409CL ^ l2));
                                    _6o_0.c("\u00f0", (Object)object4, (Object)objectArray23, -4084990173794703374L, (long)l2);
                                    Object[] objectArray24 = new Object[3];
                                    objectArray24[2] = l9;
                                    objectArray24[1] = object4;
                                    objectArray24[0] = _6o_0.a("h", 11273, (long)(0x3C3DC785B68AB9D7L ^ l2));
                                    _6o_0.c("\u00f0", (Object)y2, (Object)objectArray24, -4084990173794703374L, (long)l2);
                                }
                                if (callSite2 != null) {
                                    object4 = new _9y(this);
                                    Object[] objectArray25 = new Object[1];
                                    objectArray25[0] = l15;
                                    Object[] objectArray26 = new Object[3];
                                    objectArray26[2] = l9;
                                    objectArray26[1] = _6o_0.c("\u00f0", (Object)callSite2, (Object)objectArray25, -4085119151717925386L, (long)l2);
                                    objectArray26[0] = _6o_0.a("h", 12369, (long)(0x51649911B425A594L ^ l2));
                                    _6o_0.c("\u00f0", (Object)object4, (Object)objectArray26, -4084990173794703374L, (long)l2);
                                    Object[] objectArray27 = new Object[3];
                                    objectArray27[2] = l9;
                                    objectArray27[1] = object4;
                                    objectArray27[0] = _6o_0.a("h", 92, (long)(0x717915D25523958CL ^ l2));
                                    _6o_0.c("\u00f0", (Object)y2, (Object)objectArray27, -4084990173794703374L, (long)l2);
                                }
                                if (callSite3 != null) {
                                    object4 = new _9y(this);
                                    Object[] objectArray28 = new Object[3];
                                    objectArray28[2] = n;
                                    objectArray28[1] = (int)((short)n2);
                                    objectArray28[0] = n3;
                                    Object[] objectArray29 = new Object[3];
                                    objectArray29[2] = l9;
                                    objectArray29[1] = _6o_0.c("\u00f0", (Object)callSite3, (Object)objectArray28, -4089219188112915680L, (long)l2);
                                    objectArray29[0] = _6o_0.a("h", 12369, (long)(0x51649911B425A594L ^ l2));
                                    _6o_0.c("\u00f0", (Object)object4, (Object)objectArray29, -4084990173794703374L, (long)l2);
                                    Object[] objectArray30 = new Object[3];
                                    objectArray30[2] = l9;
                                    objectArray30[1] = object4;
                                    objectArray30[0] = _6o_0.a("h", 26559, (long)(0x3CC296E9A032F27DL ^ l2));
                                    _6o_0.c("\u00f0", (Object)y2, (Object)objectArray30, -4084990173794703374L, (long)l2);
                                }
                                if (callSite4 != null) {
                                    object4 = new _9y(this);
                                    Object[] objectArray31 = new Object[1];
                                    objectArray31[0] = l10;
                                    Object[] objectArray32 = new Object[3];
                                    objectArray32[2] = l9;
                                    objectArray32[1] = _6o_0.c("\u00f0", (Object)callSite4, (Object)objectArray31, -4083415609999874065L, (long)l2);
                                    objectArray32[0] = _6o_0.a("h", 31591, (long)(0x7510BC941978EEA4L ^ l2));
                                    _6o_0.c("\u00f0", (Object)object4, (Object)objectArray32, -4084990173794703374L, (long)l2);
                                    Object[] objectArray33 = new Object[1];
                                    objectArray33[0] = l18;
                                    Object[] objectArray34 = new Object[3];
                                    objectArray34[2] = l9;
                                    objectArray34[1] = _6o_0.c("\u00f0", (Object)callSite4, (Object)objectArray33, -4085932719196218597L, (long)l2);
                                    objectArray34[0] = _6o_0.a("h", 12369, (long)(0x51649911B425A594L ^ l2));
                                    _6o_0.c("\u00f0", (Object)object4, (Object)objectArray34, -4084990173794703374L, (long)l2);
                                    Object[] objectArray35 = new Object[1];
                                    objectArray35[0] = l3;
                                    Object[] objectArray36 = new Object[3];
                                    objectArray36[2] = l9;
                                    objectArray36[1] = _6o_0.c("\u00f0", (Object)callSite4, (Object)objectArray35, -4083105831973292026L, (long)l2);
                                    objectArray36[0] = _6o_0.a("h", 2207, (long)(0x173FF2E641931D4AL ^ l2));
                                    _6o_0.c("\u00f0", (Object)object4, (Object)objectArray36, -4084990173794703374L, (long)l2);
                                    Object[] objectArray37 = new Object[3];
                                    objectArray37[2] = l9;
                                    objectArray37[1] = object4;
                                    objectArray37[0] = _6o_0.a("h", 25365, (long)(0x648424214CAD76C9L ^ l2));
                                    _6o_0.c("\u00f0", (Object)y2, (Object)objectArray37, -4084990173794703374L, (long)l2);
                                }
                                object4 = new ArrayList();
                                CallSite callSite6 = _6o_0.c("\u00f0", (Object)callSite5, -4085328566915427760L, (long)l2);
                                block14: while (_6o_0.c("\u00f0", (Object)callSite6, -4085303242515194150L, (long)l2) != false) {
                                    _9v v = (_9v)_6o_0.c("\u00f0", (Object)callSite6, -4083169556885633425L, (long)l2);
                                    _9y y3 = new _9y(this);
                                    try {
                                        Object[] objectArray38 = new Object[1];
                                        objectArray38[0] = l5;
                                        Object[] objectArray39 = new Object[3];
                                        objectArray39[2] = l9;
                                        objectArray39[1] = _6o_0.c("\u00f0", (Object)v, (Object)objectArray38, -4082584077907530924L, (long)l2);
                                        objectArray39[0] = _6o_0.a("h", 9616, (long)(0x1F2B957B252A3042L ^ l2));
                                        _6o_0.c("\u00f0", (Object)y3, (Object)objectArray39, -4084990173794703374L, (long)l2);
                                        Object[] objectArray40 = new Object[1];
                                        objectArray40[0] = l4;
                                        Object[] objectArray41 = new Object[3];
                                        objectArray41[2] = l9;
                                        objectArray41[1] = _6o_0.c("\u00f0", (Object)v, (Object)objectArray40, -4083261257626958514L, (long)l2);
                                        objectArray41[0] = _6o_0.a("h", 30958, (long)(0x2D5D92D6414D6D38L ^ l2));
                                        _6o_0.c("\u00f0", (Object)y3, (Object)objectArray41, -4084990173794703374L, (long)l2);
                                        Object[] objectArray42 = new Object[1];
                                        objectArray42[0] = l19;
                                        Object[] objectArray43 = new Object[3];
                                        objectArray43[2] = l9;
                                        objectArray43[1] = _6o_0.c("\u00f6", (boolean)_6o_0.c("\u00f0", (Object)v, (Object)objectArray42, -4085771906509498410L, (long)l2), -4085405766605014025L, (long)l2);
                                        objectArray43[0] = _6o_0.a("h", 28257, (long)(0x1C682961173CFBBBL ^ l2));
                                        _6o_0.c("\u00f0", (Object)y3, (Object)objectArray43, -4084990173794703374L, (long)l2);
                                        _6o_0.c("\u00f0", (Object)object4, (Object)y3, -4086047871182915448L, (long)l2);
                                        do {
                                            bl2 = bl;
                                            if (l2 <= 0L) break block27;
                                            if (bl2) break block28;
                                            if (!bl) continue block14;
                                        } while (l2 < 0L);
                                    }
                                    catch (IOException iOException) {
                                        throw _6o_0.a(iOException);
                                    }
                                    _4w.cfr_renamed_8(new String[1]);
                                    break;
                                }
                                Object[] objectArray44 = new Object[3];
                                objectArray44[2] = l9;
                                objectArray44[1] = _6o_0.c("\u00f0", (Object)object4, -4086108412325014230L, (long)l2);
                                objectArray44[0] = _6o_0.a("h", 10229, (long)(0x65936D9B86073226L ^ l2));
                                _6o_0.c("\u00f0", (Object)y2, (Object)objectArray44, -4084990173794703374L, (long)l2);
                                _6o_0.c("\u00f0", serializable, (Object)y2, -4086047871182915448L, (long)l2);
                            }
                            bl2 = bl;
                        }
                        if (!bl2) continue block12;
                        object3 = y;
                    } while (l2 < 0L);
                }
                Object[] objectArray45 = new Object[3];
                objectArray45[2] = l9;
                objectArray45[1] = _6o_0.c("\u00f0", serializable, -4086108412325014230L, (long)l2);
                objectArray45[0] = _6o_0.a("h", 17642, (long)(0x5856A39F4A14D131L ^ l2));
                _6o_0.c("\u00f0", (Object)object3, (Object)objectArray45, -4084990173794703374L, (long)l2);
            }
        }
        serializable = new URL((String)((Object)_6o_0.c("\u00d6", (Object)this, -4086830195493646994L, (long)l2)));
        object2 = (HttpsURLConnection)((Object)_6o_0.c("\u00f0", serializable, -4084961546297780789L, (long)l2));
        _6o_0.c("\u00f0", (Object)object2, (Object)_6o_0.a("h", 11026, (long)(0x656ED9FE9713BECAL ^ l2)), (Object)_6o_0.a("h", 28701, (long)(0x1FF5EC9E30FD65CCL ^ l2)), -4086235791857638881L, (long)l2);
        _6o_0.c("\u00f0", (Object)object2, (Object)_6o_0.a("h", 1606, (long)(0x59F0BB0CAA129386L ^ l2)), (Object)_6o_0.a("h", 8471, (long)(0x5D88EE8D94EE34D6L ^ l2)), -4086235791857638881L, (long)l2);
        _6o_0.c("\u00f0", (Object)object2, (boolean)true, -4086800734442484381L, (long)l2);
        _6o_0.c("\u00f0", (Object)object2, (Object)_6o_0.a("h", 21566, (long)(0xD037298159B41F2L ^ l2)), -4085207923949806749L, (long)l2);
        object = _6o_0.c("\u00f0", (Object)object2, -4086337876206175864L, (long)l2);
        _6o_0.c("\u00f0", (Object)object, (Object)_6o_0.c("\u00f0", (Object)_6o_0.c("\u00f0", (Object)y, -4082835464168055827L, (long)l2), (Object)_6o_0.c("\u00fc", -4083330232062234239L, (long)l2), -4085833597740970789L, (long)l2), -4086682932280582600L, (long)l2);
        _6o_0.c("\u00f0", (Object)object, -4086960330301948656L, (long)l2);
        _6o_0.c("\u00f0", (Object)object, -4086922022596793724L, (long)l2);
        _6o_0.c("\u00f0", (Object)_6o_0.c("\u00f0", (Object)object2, -4082654980163705308L, (long)l2), -4082762460728768290L, (long)l2);
        _6o_0.c("\u00f0", (Object)object2, -4084835735001252890L, (long)l2);
    }

    public static void cfr_renamed_0(boolean bl) {
        cfr_renamed_5 = bl;
    }

    public static boolean cfr_renamed_9() {
        return cfr_renamed_5;
    }

    public static boolean cfr_renamed_4() {
        boolean bl = _6o_0.cfr_renamed_9();
        return !bl;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        _6o_0.a = l.a(8268024681191202532L, -1727372226632888341L, MethodHandles.lookup().lookupClass()).a(40775866292085L);
                        _6o_0.h = new Object[99];
                        _6o_0.i = new String[99];
                        _6o_0.a();
                        _6o_0.d = new HashMap<K, V>(13);
                        var11 = _6o_0.a ^ 53554471064825L;
                        _6o_0.cfr_renamed_0(true);
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
                        var20_3 = new String[28];
                        var18_4 = 0;
                        var17_5 = "\u00f2\u00d7:wsi\u00e6\u00c5j\u00e4A\u0083\u0006\u00df<\u00e8\u0018\u001c\u00ce\u00d4'\u0006\u00b2R\u00ec&\u00ce\u00facVc\u00e3\u00e5\u0091\u0081\u00ab)`\u0087\u00ea\u00a1\u0010\u00f0'`\u0002g\u00e2\u00d3WW&\u0018\u0013\u00bd\u00bcG\u00bc\u0010\u00fb\u00aa\u00c5\u0099\u00edD\u00d6\u0005{\u00eal\u00db\u00d0\u001e\u00ace\u0010\u00db\u00bd \u0097\u00afU]\u00b050\u0087M\u00b8\u0002Qx(\u00b6&\u0014j_\u000bI\u0097\u00fcI\u00f4\u00f3{7\u0081\u0091\u000eLC\u0011\u001d>\u00fe\b\u00c6\"\u0090\u0080J\u00e6v|!\r\u009e\u0085\u00fdONF\u0010\u00b9\u0001;\u009c\u00d0\u00ee)\u0015l\u0091\u00a7;#\u00b4\u00aeX\u0010\u00d0I'G\u00e2\u00fb\u0096+\u00fd5\u00f0\u00ac\u00a9\u008c\u00ba\u00ce\u00104v`\u0085\u00f3%\u008dp\u00af\u00d7\u008e\u00e5\u0010\u00b0\u008d\u00deH:@\u00ba\u00dd\u00a5/77\u009eA\u00ba6f\u00b5\u00bb\u009d\u00d1\u007f\u00eaf\u0003\u0090$\rY\u00f0;\u0086\u0010\u00af\f\u0081\u00e4\u000eY\u0088<\u001c\\`<\u0016\u00e3\u0080?4\u00d7\u00c0\u00f8\u00cd\u0086\u00d9\u000b\u00c1\u0084\u0086\u008c\u0099\u00d3\u009f\r\u000b\u00ccOVU\u0092\u00fb\u00a1\u00c8\u00e6b\u0010\u000b8\u00af\u00f5\u00fa\u00f8\u0086\u008d%\u00dd\u00ae\u00ab\u0012\u0094\u00f7m\u0010\u007f\u0001Sl/\u001b\u0086\u0095e\u008c\u00d7,(n\u00c5K\u0018J/\u0013\u00b9\u00b7c\u00b98\u00156E\u0002\u00e7\u0012\u00a1\u00d9\u00f5\u0096&he\u008bF\u00ff \u00ae\u0088\u0094}Q. \u00e9\u0099T+\u00b2\u00a0K\u0001\u009f\u00fb\u00d6\u000fj,\u0080\u00978\u00f8\u00f9\u0099\u00d2\u0097\u00d1E6\u0010\u00dc\u00fa\u00e1\u00c6^J\u00a5)\u009a\u0082\u00e7\fr\u001e=\u0080\u0010\u00a1\u00a3Q\u00d3-\u001fYE\u001c\u00ac\u0087\u0003\u00cd\u0097\u0083\u001f J\u000f3\u0015\r\u00cd\u001b\u00a4\u0090l M\u00c6\u00b7eM&\u00cdm`\u009cu\u0084\u0082\u00e5\u000b/|\u00fe\u00c4\u008c\u0089\u0010\r\u001aIx\u00f7\u00e8\u00d4\u00af\u001c\u00f2\u00d9\n\u0093'\u00d5\u0097\u0010\u00b7$\u00bf\u00cbA\u00c5\u00ee\u0004\u00d7\u00ea\u00dd\u0094\u0082$]O\u0010\u00b5g\u0011D\u00bb=\u0007\u00cf\u0087\u00fep\u00a3\u00ec\u00bd\u0007\n\u0018\u00b3 \u0017\u00aeR\u00e5\u0082\u00ba\u00d7\u00a7\u001a\u001a$\u001dK\u00eb*\u00cd\u00cbc9\u0002&\u00c0(N\u0083z5\u0013j\u0010\u00b8\n\t\u00c2H\u00a9\u00db\u00e1kBr\u00b6\u00ab\u0011\u00c6\u00b7\u00e5I\u0080\u0001\u008b{P\t<C\u00d4\u00d6\u00a0\u009ag\t\u00b8\u0018\u00e2?k]\u0005%\u0016\u00fa\u0001\u00c0\u00b3}\u00b0\u00b8\u001e\u00c2\u00c7\u00dc\u0085\u009d\u00d9j>u\u00104\u00db\u00e2\u00d67u\r\u001d4z\u0000\u0086\u00f0{\u0013N\u0010\u0013/?q\u00b2\u00d0\u00bb\u0099\u001a \u008f\u00ffMTf\u0093 \u00dc$\\\u00a8\u00e5\u0091\u0003c6\u00a5\u00de\u00f8\u00de\u0099\u00ea\u00b8\u00a1\u00ac.\u0084\u00ba;\\\u0012\u00c8C2\u00ea\u001a\u0094]c";
                        var19_6 = "\u00f2\u00d7:wsi\u00e6\u00c5j\u00e4A\u0083\u0006\u00df<\u00e8\u0018\u001c\u00ce\u00d4'\u0006\u00b2R\u00ec&\u00ce\u00facVc\u00e3\u00e5\u0091\u0081\u00ab)`\u0087\u00ea\u00a1\u0010\u00f0'`\u0002g\u00e2\u00d3WW&\u0018\u0013\u00bd\u00bcG\u00bc\u0010\u00fb\u00aa\u00c5\u0099\u00edD\u00d6\u0005{\u00eal\u00db\u00d0\u001e\u00ace\u0010\u00db\u00bd \u0097\u00afU]\u00b050\u0087M\u00b8\u0002Qx(\u00b6&\u0014j_\u000bI\u0097\u00fcI\u00f4\u00f3{7\u0081\u0091\u000eLC\u0011\u001d>\u00fe\b\u00c6\"\u0090\u0080J\u00e6v|!\r\u009e\u0085\u00fdONF\u0010\u00b9\u0001;\u009c\u00d0\u00ee)\u0015l\u0091\u00a7;#\u00b4\u00aeX\u0010\u00d0I'G\u00e2\u00fb\u0096+\u00fd5\u00f0\u00ac\u00a9\u008c\u00ba\u00ce\u00104v`\u0085\u00f3%\u008dp\u00af\u00d7\u008e\u00e5\u0010\u00b0\u008d\u00deH:@\u00ba\u00dd\u00a5/77\u009eA\u00ba6f\u00b5\u00bb\u009d\u00d1\u007f\u00eaf\u0003\u0090$\rY\u00f0;\u0086\u0010\u00af\f\u0081\u00e4\u000eY\u0088<\u001c\\`<\u0016\u00e3\u0080?4\u00d7\u00c0\u00f8\u00cd\u0086\u00d9\u000b\u00c1\u0084\u0086\u008c\u0099\u00d3\u009f\r\u000b\u00ccOVU\u0092\u00fb\u00a1\u00c8\u00e6b\u0010\u000b8\u00af\u00f5\u00fa\u00f8\u0086\u008d%\u00dd\u00ae\u00ab\u0012\u0094\u00f7m\u0010\u007f\u0001Sl/\u001b\u0086\u0095e\u008c\u00d7,(n\u00c5K\u0018J/\u0013\u00b9\u00b7c\u00b98\u00156E\u0002\u00e7\u0012\u00a1\u00d9\u00f5\u0096&he\u008bF\u00ff \u00ae\u0088\u0094}Q. \u00e9\u0099T+\u00b2\u00a0K\u0001\u009f\u00fb\u00d6\u000fj,\u0080\u00978\u00f8\u00f9\u0099\u00d2\u0097\u00d1E6\u0010\u00dc\u00fa\u00e1\u00c6^J\u00a5)\u009a\u0082\u00e7\fr\u001e=\u0080\u0010\u00a1\u00a3Q\u00d3-\u001fYE\u001c\u00ac\u0087\u0003\u00cd\u0097\u0083\u001f J\u000f3\u0015\r\u00cd\u001b\u00a4\u0090l M\u00c6\u00b7eM&\u00cdm`\u009cu\u0084\u0082\u00e5\u000b/|\u00fe\u00c4\u008c\u0089\u0010\r\u001aIx\u00f7\u00e8\u00d4\u00af\u001c\u00f2\u00d9\n\u0093'\u00d5\u0097\u0010\u00b7$\u00bf\u00cbA\u00c5\u00ee\u0004\u00d7\u00ea\u00dd\u0094\u0082$]O\u0010\u00b5g\u0011D\u00bb=\u0007\u00cf\u0087\u00fep\u00a3\u00ec\u00bd\u0007\n\u0018\u00b3 \u0017\u00aeR\u00e5\u0082\u00ba\u00d7\u00a7\u001a\u001a$\u001dK\u00eb*\u00cd\u00cbc9\u0002&\u00c0(N\u0083z5\u0013j\u0010\u00b8\n\t\u00c2H\u00a9\u00db\u00e1kBr\u00b6\u00ab\u0011\u00c6\u00b7\u00e5I\u0080\u0001\u008b{P\t<C\u00d4\u00d6\u00a0\u009ag\t\u00b8\u0018\u00e2?k]\u0005%\u0016\u00fa\u0001\u00c0\u00b3}\u00b0\u00b8\u001e\u00c2\u00c7\u00dc\u0085\u009d\u00d9j>u\u00104\u00db\u00e2\u00d67u\r\u001d4z\u0000\u0086\u00f0{\u0013N\u0010\u0013/?q\u00b2\u00d0\u00bb\u0099\u001a \u008f\u00ffMTf\u0093 \u00dc$\\\u00a8\u00e5\u0091\u0003c6\u00a5\u00de\u00f8\u00de\u0099\u00ea\u00b8\u00a1\u00ac.\u0084\u00ba;\\\u0012\u00c8C2\u00ea\u001a\u0094]c".length();
                        var16_7 = 16;
                        var15_8 = -1;
lbl24:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block13;
                            break;
                        }
lbl29:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = _6o_0.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00d0:\u00d0\u00ae)\u0017\u00a1Z\u00cc\u0087\u008c\u00b6`(\u00a1E\u0018\u000e\u00d4\b\u000e\u0018\\\u00e6\u00c0\u0082.\u00c9)vv\u00ef\u00bd\u00c7N\u00be\u000f\u00adD\u0012\u00d5";
                            var19_6 = "\u00d0:\u00d0\u00ae)\u0017\u00a1Z\u00cc\u0087\u008c\u00b6`(\u00a1E\u0018\u000e\u00d4\b\u000e\u0018\\\u00e6\u00c0\u0082.\u00c9)vv\u00ef\u00bd\u00c7N\u00be\u000f\u00adD\u0012\u00d5".length();
                            var16_7 = 16;
                            var15_8 = -1;
lbl38:
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
lbl43:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = _6o_0.a(var21_9).intern();
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
lbl55:
                        // 1 sources

                        ** continue;
                    }
                }
                _6o_0.b = var20_3;
                _6o_0.c = new String[28];
                _6o_0.g = new HashMap<K, V>(13);
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
                var4_14 = "\u00c2\u00ee\u0093\r\u00de\u008b\u0007bE\u00b6 P\u00b5q2\u00bc";
                var5_15 = "\u00c2\u00ee\u0093\r\u00de\u008b\u0007bE\u00b6 P\u00b5q2\u00bc".length();
                var2_16 = 0;
                while (true) {
                    break block15;
                    break;
                }
lbl77:
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
        _6o_0.e = var6_12;
        _6o_0.f = new Integer[2];
    }

    private static IOException a(IOException iOException) {
        return iOException;
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

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x528C;
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
                throw new RuntimeException("dev/krypton/6O", exception);
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
            _6o_0.c[n2] = _6o_0.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _6o_0.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6O" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x7046;
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
                throw new RuntimeException("dev/krypton/6O", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _6o_0.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _6o_0.b(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6O" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
            case 0 -> 1;
            case 1 -> 56;
            case 2 -> 43;
            case 3 -> 55;
            case 4 -> 3;
            case 5 -> 50;
            case 6 -> 49;
            case 7 -> 28;
            case 8 -> 27;
            case 9 -> 20;
            case 10 -> 2;
            case 11 -> 60;
            case 12 -> 41;
            case 13 -> 63;
            case 14 -> 34;
            case 15 -> 18;
            case 16 -> 10;
            case 17 -> 25;
            case 18 -> 8;
            case 19 -> 7;
            case 20 -> 45;
            case 21 -> 35;
            case 22 -> 9;
            case 23 -> 44;
            case 24 -> 58;
            case 25 -> 22;
            case 26 -> 24;
            case 27 -> 51;
            case 28 -> 54;
            case 29 -> 62;
            case 30 -> 32;
            case 31 -> 33;
            case 32 -> 23;
            case 33 -> 36;
            case 34 -> 19;
            case 35 -> 5;
            case 36 -> 46;
            case 37 -> 16;
            case 38 -> 37;
            case 39 -> 31;
            case 40 -> 57;
            case 41 -> 12;
            case 42 -> 6;
            case 43 -> 13;
            case 44 -> 29;
            case 45 -> 61;
            case 46 -> 59;
            case 47 -> 26;
            case 48 -> 39;
            case 49 -> 38;
            case 50 -> 21;
            case 51 -> 47;
            case 52 -> 48;
            case 53 -> 0;
            case 54 -> 40;
            case 55 -> 52;
            case 56 -> 30;
            case 57 -> 15;
            case 58 -> 42;
            case 59 -> 4;
            case 60 -> 53;
            case 61 -> 17;
            case 62 -> 14;
            default -> 11;
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
        _6o_0.i[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "yirE\u0013Jd|p\u0004\u0016\u0016.5";
        objectArray[1] = "\u00071!$\u000e^r\u0011*+\u001f\u0011\u0013\u001f! \u001bKg";
        objectArray[2] = ":;|-\\O$3fb>S#.";
        objectArray[3] = "m\b\u001a\u0002\u001f\fp\u001d\u0018C\u001aP>\f";
        objectArray[4] = "\u0013O:x\u0003.fo1w\u0012a\u0007a:|\u0016;s";
        objectArray[5] = "B\"[\u001c1\u001cI-JSL\u0004Z*C\u001a";
        objectArray[6] = "hu\u000b\f3:u`\tM6f5@";
        objectArray[7] = "&\u0018g\f0\bS8l\u0003!G26g\b%\u001dF";
        objectArray[8] = "O\u00035\u000659R\u00167G0e\u0013$";
        objectArray[9] = Integer.TYPE;
        _6o_0.i[9] = "java/lang/Integer";
        objectArray[10] = "\u0002\u000b\u0014-E\u0000\u001f\u001e\u0016l@\\_\u0018";
        objectArray[11] = "c6ld.?\u0016\u0016gk?pw\u0018l`;*\u0003";
        objectArray[12] = "3IrlI\u000b0G*n\u000f\u0004+[ayI6-Iji\u0006\u0017=kll\u0015\u0016<\\w";
        objectArray[13] = "c\u0011\u001cn^\u0016`\u001fDl\u0018\u0019{\u0003\u000f{^;a\u0011\u0018|\u0015\f";
        objectArray[14] = "K=l\u007fqs>\u001dgp`<_\u0013l{df+";
        objectArray[15] = "O9V<,\u0019Q1LsK\u0018@*A)m\u001e";
        objectArray[16] = ":)\u000b\u0007e\u00131&\u001aH\u0004\u001d:-\u001e\u0012";
        objectArray[17] = "l\u0012Uf9~q\u0007W'<\">8";
        objectArray[18] = " \u000e<pr@U.7\u007fc\u000f4 <tgU@";
        objectArray[19] = "m\u0015A9h+p\u0000Cxmw0\t";
        objectArray[20] = "u4)\u001bpjq0+T{7s{\u0017\u000e|4l\u0000\r6K+q;:\u0019|-p;";
        objectArray[21] = "Tb+X\u0017TQ-\u0014WIHJP)K\\\\S";
        objectArray[22] = Void.TYPE;
        _6o_0.i[22] = "java/lang/Void";
        objectArray[23] = "\u001aA\t\u0018>%oa\u0002\u0017/j\u000eo\t\u001c+0z";
        objectArray[24] = "N8\u0010t|\bS-\u00125yT\u001d\u0005";
        objectArray[25] = "]K[j\u0017T(kPe\u0006\u001bIe[n\u0002A=";
        objectArray[26] = "\u0016HR\u001f0w\u0013\u0007k\u000bjn\t]w\nl{\u001dD";
        objectArray[27] = Boolean.TYPE;
        _6o_0.i[27] = "java/lang/Boolean";
        objectArray[28] = "za)71;\u000fA\"8 tnO)3$.\u001a";
        objectArray[29] = "Cj";
        objectArray[30] = "}O\u0010E\"\u000fv@\u0001\nE\rcK\u0001A~";
        objectArray[31] = "0r\u0000fMhER\u000bi\\'$\\\u0000bX}P";
        objectArray[32] = "OJ-^@{R_/\u001fE'\u0013W";
        objectArray[33] = ">z~,*tKZu#;;*T~(?a^";
        objectArray[34] = "N\u0011yTB$;1r[SkZ?yPW1.";
        objectArray[35] = "\u0010_pG-\u001fe\u007f{H<P\u0004qpC8\np";
        objectArray[36] = "Uc~\u0010k% Cu\u001fzjAM~\u0014~05";
        objectArray[37] = "JRZ\rH/?rQ\u0002Y`^|Z\t]:*";
        objectArray[38] = "\u0013^";
        objectArray[39] = "H\u0012v\u0007aA=2}\bp\u000e\\<v\u0003tT(";
        objectArray[40] = "R\bYWw\u007fY\u0007H\u0018\u001b|W\u0005JW7";
        objectArray[41] = "EF\b\fNs0f\u0003\u0003_<Qh\b\b[f%";
        objectArray[42] = "?UX\u0005\u000b5JuS\n\u001az+{X\u0001\u001e _";
        objectArray[43] = ":9He#\u00125,\u0010Q_0";
        objectArray[44] = "yU+-cqv@s\u0019\u001fSP[3\"(|g]2\"";
        objectArray[45] = "q\u0003V\u007f\u0014\u0019\u0004#]p\u0005Ve-V{\u0001\f\u0011";
        objectArray[46] = "\u001aT\u0007~\u0017!ot\fq\u0006n\u000ez\u0007z\u00024z";
        objectArray[47] = "\u0013D\u0016t7(fd\u001d{&g\u0007j\u0016p\"=s";
        objectArray[48] = "\u001appw\u0001o\u001d3sIC\rVr&\"\u0004u[01-~4B.0+\f`\u001btxI";
        objectArray[49] = "@w\u007f;\b\u0003\u0014d~mj\u0002zl>j\u0001C\u0002a|}\u000e9Abek\u0006V\u0001%dej";
        objectArray[50] = "9\nFDD_yVDI4\u0001\u0005\u0018\u000eH_@}\u0015L_P:>\u0016UIXU~QTG4";
        objectArray[51] = "e\u000f$8\u0001iaVo/9$[\fx7\u0007t!Td&X";
        objectArray[52] = "5{=x0i62y`\t \u000by;\u007fbastyhm\u001b0w`~etp0ap\t";
        objectArray[53] = "{f$pvYw&0yIx\u0017Y\u0015#I\u0014sv.swA0z+";
        objectArray[54] = "\u0005gx\t=HE;z\u0004M\u00149u0\u0005&WAxr\u0012)-\u0002{k\u0004!BB<j\nM";
        objectArray[55] = "F\u0015,e\fQWUr=v]B\u001cm\u0005\u001c]M\u0015t4\u0012\nH\u0001\u0011";
        objectArray[56] = "\u0015m~\u0018\\BDi2\b=\u0001\u007f-1\u0014RR\u0010mv\u0015\\";
        objectArray[57] = "aOni$=f\fmWg_-M8<!' \u000f/3[a`L$o)e9\u00073W";
        objectArray[58] = "kqm\u001ew%ij1\u0000\u0012b`I \u0005sxh\u0012g\u0001sqk}'Fr\u007f\u0007";
        objectArray[59] = ".\u0012\u00133ia*KX$Q/U/\u0016&,-\u007fUN:=r";
        objectArray[60] = "l\nA\u007fU\"f\fL7(=l\u0016a P/}1\\<E;djM<C#f\u0001K{Mh\u0001";
        objectArray[61] = "/u\t(y\u001e)2\u0007c\u001e\u001e&h\u00194\u001e\u001b,7\u0018?x\u0017}7\u001fY";
        objectArray[62] = "zb-C\t\f}!.}Hn6`{\u0016\f\u0016;\"l\u0019v\u00014+d\u0017\u0004\u000b~f(}";
        objectArray[63] = ";OOo{\u00048\u0006\u000bwBJ\u0005MIh)\f}@\u000b\u007f&v>C\u0012i.\u0019~\u0004\u0013gB";
        objectArray[64] = "XGD| 5RGAsP:]\u001a_wP?WE^|63\u0006EY\u001a";
        objectArray[65] = ":\u001d\u007fWNf0\u001dzX>l?ZdQ>l5\u001feWX`d\u001fb1";
        objectArray[66] = "\u0006\u000f\"]\b\\\f\t/\u0015uW\u0006\u0013\u000f\u00032Q\u0017\u0017>\u0018uM\u0013\u000br\r\u0018H\b^3d\u001bBS\u0015%\u0002\u0017\u0013S\u0012C";
        objectArray[67] = "\"PcayFsT/q\u0018\u0006H\u0010,mwV'Pkly";
        objectArray[68] = "mO\u00147]Wj\f\u0017\t\u001a5!MBbXM,\u000fUm\"\u000e/\u0016CeMNh\u0017M\t";
        objectArray[69] = "\u0007+B\u001bb$\r+G\u0014\u0012?\u001cp^\u0010\u0012:^\u007f]\u0013,}\u001drB}|.^kD\u001bp\u007f^l\"";
        objectArray[70] = "*x/\u000b;turoSW: g,\u0004\u0010*I=6\u0014i+3e*\u00056D*x/\u000b;turoSW";
        objectArray[71] = "B\u0019g>\u001f+\u0013\u001d+.~o(Y(2\u0011;G\u0019o3\u001f";
        objectArray[72] = "DS\u0015x4lNU\u00180IsDO3<5dTO/=3q@Vt s|OC\u0010*sy@3";
        objectArray[73] = "(\u0006;O\u001fE/E8q_'d\u0004m\u001a\u001a_iFz\u0015`Bv\\;NY\u0018.\u0007|q";
        objectArray[74] = "|2RsFHv4_;;Q}>i'BE|)O\u0012A_i?I6J8*,R%WWjkS+;\u0003o3\\&TC(2RJUV)(U,Y\u0007)/3";
        objectArray[75] = "\u0001\\r_\u0000F\u0006\u001fqa@$M^$\n\u0005\\@\u001c3\u0005\u007f\u0018_\u0016(\u0011\u001aX\u0003\u0014%a";
        objectArray[76] = "'9b**ks`8bHpr1\u00048.{g856y~s]e*,(w0`1yi\u001e";
        objectArray[77] = "'\u001e>\u0013i+sGd[\u000b%y3\"\u0011b(\u001e\nb\u0005`#f\u0007 \u0012oY";
        objectArray[78] = "\u0019b$oaIY>&b\u0011\u0016%plczV]}.tu,\u001e~7b}C^96l\u0011";
        objectArray[79] = "56}M.\b2u~sjjy4+\u0018+\u0012tv<\u0017QQwo*\u001f>\u00110n$s";
        objectArray[80] = "E87\f.vFqs\u0014\u0017;{:1\u000b|~\u00037s\u001cs\u0004\u001a2oT~i\u001f):\u0015\u0017";
        objectArray[81] = "x'A\u0016=\"8`@\u0018Q\".%j\b- 8Y\u0011A0!#gD\u0002<$C#\u0018\u0017.#}d[\u001a1M";
        objectArray[82] = "0\u00022\u0011\u0014\td[hYv\u001ar+1\u0011\n\n\t\u0007,\rG\u0012d\u00027X\u0006{";
        objectArray[83] = "\u001deN`RULa\u0002p3\u0012w%\u0001l\\E\u0018eFmR";
        objectArray[84] = "BlM^a/\u0013h\u0001N\u0000i(.\u0018Ux1ZzA\u000f0";
        objectArray[85] = "Zl\u001ce1\u0007]/\u001f[re\u0016nJ04\u001d\u001b,]?N_\r/\u001b9t\u000b\u001e.M[";
        objectArray[86] = "Pv\u001d8\u00057\u0004/Gpg$\u0015\u007f\u0001)\u001b\"\u0013\u0012\u00129Z%\u0013x\u0003y\u0004}i";
        objectArray[87] = "9\tsS\u000fC;\u000f.]fR+S7@!BBV2IWE/S)\u001c\u0016,9\tsS\u000fC;\u000f.]f";
        objectArray[88] = "0%MACA:#@\t>J09v\u0015GL0>P=SM=\"@x\u0005O<*@\u0017E\b=$,\u0016P\t'#J\u001a\u0001\t E";
        objectArray[89] = "q@\u00151t7`\u0000Ki\u000e=qBn<~!\u0018XP5?4u]K`~]";
        objectArray[90] = "!\u000fE{\bcu\u001cD-je\u001b\u0014\u0004*\u0001#c\u0019F=\u000eY \u001a_+\u00066`]^%j";
        objectArray[91] = "-Z\u0001yP\u0011w\u0002Z>o\u0012HHY/\u0004R0E\u001b8\u000b(sF\u0002.\u0003G3\u0001\u0003 o";
        objectArray[92] = "_Q4\u000e\r\u001e\u0012\u001a.Kr\u0007Z\u00059<\u0015\u0006D\u00054\u000b\u0013\u0007Dh\"\u000eO\u0010RR&\u000e\u000bQ\"";
        objectArray[93] = "2\u000b'!n_0\u0010{?\u000b[^\u0018,.`\u001e&\u0015n9od0\u0006.:m\u0002<W.=\u000b";
        objectArray[94] = "\u0003\u001e\r-\u0014e\u0004]\u000e\u0013U\u0007O\u001c[x\u0011\u007fB^Lwk<AGZ\u007f\u0004|\u0006FT\u0013";
        objectArray[95] = "\u001c\u0019@\u0016\u001eH\u0016\u001fM^cT\u0010\u0002JH\u0005^\u001c\u0012]/\rVI\u0003GI\u0001\u0007I\u0004!";
        objectArray[96] = "N{b\u0006{\u0017J\")\u0011CUpx>\t}\n\n \"\u0018\"";
        objectArray[97] = "3B3T\u0012\u001a9\b~\u0018xV\\@xK\u0013\u0012$M:\\\u001chgN#J\u0014\u0007'\t\"Dx";
        Object[] objectArray2 = objectArray;
        objectArray[98] = "Wf\u0011.^Q\u0006b]>?\u001c=|X'\u000eDPyCrO";
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _6o_0.a(l2, l3);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                _6o_0.h[n] = clazz = Class.forName(i[n]);
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
        Field field = _6o_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _6o_0.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _6o_0.a(l2, l3);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = _6o_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _6o_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _6o_0.a(clazz3, string2, clazz2)) != null) {
                    _6o_0.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _6o_0.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _6o_0.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _6o_0.b(1183591913047358L, 0L);
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
        Method method = _6o_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _6o_0.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method d(long l2, long l3) {
        int n = _6o_0.a(l2, l3);
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
                clazz3 = _6o_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _6o_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _6o_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _6o_0.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _6o_0.b(1183591913047358L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _6o_0.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _6o_0.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _6o_0.b(1183591913047358L, 0L);
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
            if (c == '\u00d6' || c == 'F' || c == '\u00fc' || c == '\u00ee') {
                field = _6o_0.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d6' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'F' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00fc' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _6o_0.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f0' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f6' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _6o_0.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6O" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_6o_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_6o_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_6o_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

