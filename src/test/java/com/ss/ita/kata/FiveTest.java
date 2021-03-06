package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigInteger;
import java.util.Arrays;

import static org.testng.Assert.*;

public class FiveTest extends FiveDataProvider {

    @Test(dataProvider = "validArtificialRainDataProvider")
    public void testArtificialRainPositive(Five impl, int[] inputData, int expectedData) {
        int result = impl.artificialRain(inputData);
        Assert.assertEquals(expectedData, result, impl.getClass().getName());
    }

    @Test(dataProvider = "invalidArtificialRainDataProvider")
    public void testArtificialRainNegative(Five impl, int[] inputData, int expectedData) {
        int result = impl.artificialRain(inputData);
        Assert.assertNotEquals(expectedData, result, impl.getClass().getName());
    }

    @Test(dataProvider ="validGapDataProvider")
    public void testGap(Five impl,int input1, int input2, int input3, long[] expectedData) {
        long[] actualData = impl.gap(input1, input2, input3);
        Assert.assertEquals(Arrays.toString(expectedData), Arrays.toString(actualData), impl.getClass().getName());
    }

    @Test(dataProvider ="invalidGapDataProvider")
    public void testGapInvalid(Five impl,int input1, int input2, int input3, long[] expectedData) {
        long[] actualData = impl.gap(input1, input2, input3);
        Assert.assertNotEquals(Arrays.toString(expectedData), Arrays.toString(actualData), impl.getClass().getName());
    }

    @Test(dataProvider = "validZerosProvider")
    public void testZeros(Five impl, int input, int expected) {
        Assert.assertEquals(impl.zeros(input), expected, impl.getClass().getName());
    }

    @Test(dataProvider = "validPerimeterDataProvider")
    public void testPerimeter(Five impl, long input, long expected) {
        //BigInteger in = input;
        Assert.assertEquals(impl.perimeter(BigInteger.valueOf(input)), BigInteger.valueOf(expected), impl.getClass().getName());

    }

    private static void assertFuzzyEquals(double act, double exp){
        boolean inrange;
        double merr = 1e-12;
        if (exp == 0.0)
            inrange = Math.abs(act) <= merr;
        else {
            double e = Math.abs((act - exp) / exp);
            inrange = e <= 1e-12;
            Assert.assertTrue(inrange);
        }
    }
    @Test(dataProvider = "dataForSolveSum")
    public void testSolveSum(Five impl, double act, double exp) {
        assertFuzzyEquals(impl.solveSum(act),exp);
    }

    @Test(dataProvider = "dataForSmalest")
    public void testSmallest(Five impl, long act, long[] exp) {
        long[] actualData = impl.smallest(act);
        Assert.assertEquals(Arrays.toString(exp), Arrays.toString(actualData), impl.getClass().getName());
    }
}