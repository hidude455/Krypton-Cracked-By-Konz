/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_4587
 */
package dev.krypton;

import dev.krypton._3T;
import dev.krypton._4k;
import dev.krypton._4w;
import dev.krypton.l;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_4587;

/*
 * Renamed from dev.krypton.6c
 */
public class _6c_0
implements _3T {
    public class_4587 cfr_renamed_2;
    public _4k cfr_renamed_7;
    public float cfr_renamed_9;
    public double cfr_renamed_8;
    public double cfr_renamed_5;
    public double cfr_renamed_6;
    private static int[] cfr_renamed_4;
    private static final long a;

    public _6c_0(class_4587 class_45872, _4k k, float f, double d, double d2, double d3) {
        long l2 = a ^ 0x456F7EFF7C9FL;
        this.cfr_renamed_2 = class_45872;
        this.cfr_renamed_7 = k;
        this.cfr_renamed_9 = f;
        int[] nArray = _6c_0.cfr_renamed_3();
        try {
            this.cfr_renamed_8 = d;
            this.cfr_renamed_5 = d2;
            this.cfr_renamed_6 = d3;
            if (nArray == null) {
                _4w.cfr_renamed_8(new String[3]);
            }
        }
        catch (MatchException matchException) {
            throw _6c_0.a(matchException);
        }
    }

    static {
        a = l.a(154324512304909110L, 601084628780502021L, MethodHandles.lookup().lookupClass()).a(203393537965483L);
        if (_6c_0.cfr_renamed_3() == null) {
            _6c_0.cfr_renamed_8(new int[3]);
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    public static int[] cfr_renamed_3() {
        return cfr_renamed_4;
    }

    public static void cfr_renamed_8(int[] nArray) {
        cfr_renamed_4 = nArray;
    }
}

