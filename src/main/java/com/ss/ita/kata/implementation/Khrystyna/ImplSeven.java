package com.ss.ita.kata.implementation.Khrystyna;

import com.ss.ita.kata.Seven;

public class ImplSeven implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        if (navg < 0) {
            throw new IllegalArgumentException();
        }
        double donation = 0;
        for (double donat : arr) {
            donation += donat;
        }
        if (donation / arr.length > navg) {
            throw new IllegalArgumentException();
        } else {
            donation = navg * (arr.length + 1) - donation;
        }
        return Math.round(donation);
    }

    @Override
    public String seriesSum(int n) {
        double result = 0;
        int divider = 1;
        for (int i = 1; i <= n; i++) {
            result += 1.0 / divider;
            divider += 3;
        }
        return String.format("%.2f", result);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        int position = p - bef;
        for (int i = bef + 1; i < p - aft; i++) {
            position--;
        }
        return position;
    }
}
