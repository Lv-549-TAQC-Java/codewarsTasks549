package com.ss.ita.kata.implementation.mike;

import com.ss.ita.kata.Eight;

import java.util.ArrayList;
import java.util.List;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        return (int) (time / 2);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        return 1.609344f / 4.54609188f * mpg;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        return new int[0];
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        return new int[0];
    }

    @Override
    public int stringToNumber(String str) {
        return 0;
    }

    @Override
    public boolean amIWilson(double n) {
        return false;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        double rounded = Math.round(number*100)/100.0;
        return rounded;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        List<Integer> newList = new ArrayList<>();
        for (int value : numbers) {
            if (value % divider == 0) {
                newList.add(value);
            }
        }
        int[] exitArray = new int[newList.size()];
        for (int i = 0; i < newList.size(); i++) {
            exitArray[i] = newList.get(i);
        }
        return exitArray;

    }
}
