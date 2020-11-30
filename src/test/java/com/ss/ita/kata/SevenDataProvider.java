package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class SevenDataProvider extends DataProviderClass{


    @DataProvider(name = "validSumOfTheFirstNthDataProvider")
    public static Object[][] validSumOfTheFirstNthDataProvider(){
         Object[][] param = new Object[][]{
                {5,"1,57"},{9,"1,77"},
                {15,"1,94"},{20,"2,5"}};

      return getObjectCodes(validSevenImplPackageProvider(),param);
    }

    @DataProvider
    public static Object[][] validLookingForABenefactorDataProvide() {
        Object[][] param = new Object[][] {
                {new double[] {14, 30, 5, 7, 9, 11, 15}, 92, 645 },
                {new double[] {14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0}, 90, 628}
        };
        return getObjectCodes(validSevenImplPackageProvider(), param);
    }

    @DataProvider
    public static Object[][] inValidLookingForABenefactorDataProvide() {
        Object[][] param = new Object[][] {
                {new double[] {14, 30, 5, 7, 9, 11, 15}, 2},
                {new double[] {12, 33, 1, 3, 9, 6, 15}, -3}
        };
        return getObjectCodes(validSevenImplPackageProvider(), param);
    }



}
