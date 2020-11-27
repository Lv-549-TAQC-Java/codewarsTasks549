package com.ss.ita.kata;

import com.ss.ita.kata.implementation.Krynytsky.EightImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EightTest {

    private EightImpl eight;
    private com.ss.ita.kata.implementation.mike.EightImpl eightMike;

    @BeforeClass
    public void createObject() {
        eight = new EightImpl();
        eightMike = new com.ss.ita.kata.implementation.mike.EightImpl();
    }

    @Test
    public void testLiters() {
        double actualResult = eight.liters(12);
        double expectedResult = 6;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testTestLiters() {
    }

    @Test
    public void testGetVolumeOfCuboid1() {
        double actualResult = eightMike.getVolumeOfCuboid(1,2,2);
        double expectedResult = 4;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetVolumeOfCuboid2() {
        double actualResult = eightMike.getVolumeOfCuboid(2,2,5);
        double expectedResult = 20;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test( expectedExceptions = ArithmeticException.class)
    public void testGetVolumeOfCuboid3() {
        double actualResult = eightMike.getVolumeOfCuboid((2/0),5,1);
        double expectedResult = 10;
        //Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testMpgToKPM() {
    }

    @Test
    public void testSquareOrSquareRoot() {
    }

    @Test
    public void testCountPositivesSumNegatives() {
    }

    @Test
    public void testStringToNumber() {
    }

    @Test
    public void testAmIWilson() {
    }

    @Test
    public void testTwoDecimalPlaces() {
    }

    @Test
    public void testDivisibleBy() {
    }
}