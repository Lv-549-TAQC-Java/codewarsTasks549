package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class EightTest extends EightDataProvider {


    @Test(dataProvider = "validKeepHydrated")
    public void testLiters(Eight impl, double x, double expectedData) {
        double actualData = impl.liters(x);
        Assert.assertEquals(expectedData, actualData, impl.getClass().getName());
    }

    @Test
    public void testTestLiters() {
    }

    @Test
    public void testGetVolumeOfCuboid() {
    }

    @Test(dataProvider = "validMpgToKpmDataProvider")
    public void testMpgToKPM(Eight impl, float x, float expectedData) {
        float actualData = impl.mpgToKPM(x);
        Assert.assertEquals(expectedData, actualData, impl.getClass().getName());
    }

   @Test(dataProvider = "validSquareOrSquareRootDataProvider")
   public void testSquareOrSquareRoot(Eight impl, int[] input, int[] expectedData) {
          int[] actualData = impl.squareOrSquareRoot(input);
          Assert.assertEquals(Arrays.toString(actualData),Arrays.toString(expectedData),impl.getClass().getName());
   }

    @Test(dataProvider = "validCountPositivesSumNegativesProvider")
    public void testCountPositivesSumNegatives(Eight impl, int[] input, int[] expected) {
        Assert.assertEquals(impl.countPositivesSumNegatives(input), expected, impl.getClass().getName());
    }

    @Test
    public void testStringToNumber() {
    }

    @Test(dataProvider = "dataForWilsonNumber")
    public void testAmIWilson1(Eight impl, double number, boolean isWilsonNumber) {
        Assert.assertEquals(impl.amIWilson(number),isWilsonNumber,impl.getClass().getName());
    }

    @Test
    public void testTwoDecimalPlaces() {
    }

    @Test
    public void testDivisibleBy() {
    }
}