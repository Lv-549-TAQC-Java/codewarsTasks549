package com.ss.ita.kata.implementation.HannaVasiunyk;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        boolean dropFall = false;
        int countDrop = 1;
        int maxDrop = 1;
        int i = 0;
        while (i < v.length - 1) {
            if (!dropFall && v[i] >= v[i + 1]) {
                countDrop++;
                dropFall = true;
            } else if (dropFall) {
                if(v[i] >= v[i + 1]){
                    countDrop++;
                } else {
                    dropFall = false;
                    countDrop = 2;
                }
            }
            if (maxDrop < countDrop) {
                maxDrop = countDrop;
            }
            i++;
        }
        return maxDrop;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        long previousPrime = n;
        for (long i = m; i <= n; i++) {
            if (isPrime(i)) {
                if (i - previousPrime == g) {
                    return new long[]{previousPrime, i};
                }
                previousPrime = i;
            }
        }
        return null;
    }


    @Override
    public int zeros(int n) {
        int zeroSum = 0;
        while (n > 0) {
            n = n / 5;
            zeroSum += n;
        }
        return zeroSum;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger first = BigInteger.valueOf(1);
        BigInteger second = BigInteger.valueOf(1);
        BigInteger third = BigInteger.valueOf(0);
        BigInteger sum = BigInteger.valueOf(2);
        BigInteger four = BigInteger.valueOf(4);

        for (int i = 3; i <= n.intValue() + 1; i++) {
            third = first.add(second);
            sum = sum.add(third);
            first = second;
            second = third;
        }
        return sum.multiply(four);
    }

    @Override
    public double solveSum(double m) {
        double discriminant = Math.pow((1 + 2 * m), 2) - 4 * Math.pow(m, 2);
        double argument = ((-1 *(1 + 2 * m)) + Math.sqrt(discriminant)) / (-2 * m);
        return argument;
    }

    @Override
    public long[] smallest(long n) {
        long[] smallest = new long[]{n, 0, 0};
        StringBuilder oldNumber = new StringBuilder(String.valueOf(n));
        StringBuilder newNumber = new StringBuilder(oldNumber);

        for (int i = 0; i < oldNumber.length(); i++) {
            char currentNumber = oldNumber.charAt(i);
            newNumber.deleteCharAt(i);

            for (int j = 0; j <= newNumber.length(); j++) {
                newNumber.insert(j, currentNumber);

                if ((Long.parseLong(newNumber.toString()) < smallest[0])
                        || (Long.parseLong(newNumber.toString()) == smallest[0] && smallest[1] > i)) {

                    smallest[0] = Long.parseLong(newNumber.toString());
                    smallest[1] = i;
                    smallest[2] = j;
                }
                newNumber.deleteCharAt(j);
            }
            newNumber.insert(i, currentNumber);
        }
        return smallest;
    }

    private boolean isPrime(long n) {
        for (int i = 2; i < Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}