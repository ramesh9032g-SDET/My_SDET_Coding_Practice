package org.pratcticeOrg.Tests.Helpers.Common;

import org.example.Enums.Trade;
import org.example.Enums.TradeType;
import org.testng.annotations.DataProvider;

import java.util.Arrays;
import java.util.List;

public class DataProviderClass {

    @DataProvider
    public static Object[][] fibonacciCheckerDataProvider() {

        return new Object[][]{
                {40},
                {100}
        };
    }

    @DataProvider
    public static Object[][] removeDuplicateCharsDataProvider() {

        return new Object[][]{
                {"my name is Ramesh"},
                {"my name is Billa"}
        };
    }

    @DataProvider
    public static Object[][] findLeadersInArrayDataProvider() {

        return new Object[][]{
                {42,65,3,78,56,12},
                {92,65,3,78,56,12}
        };
    }

    @DataProvider
    public static Object[][] bubbleSortDataProvider() {

        return new Object[][]{
                {42,65,3,78,56,12},
                {92,65,3,78,56,12}
        };
    }

    @DataProvider
    public static Object[][] runLengthEncodingDataProvider() {

        return new Object[][]{
                {"aabbbccaa"},
                {"Myy                Naame Iss Rameshhhh"}
        };
    }

    @DataProvider
    public static Object[][] ReverseAlphabetDataProvider() {

        return new Object[][]{
                {"aabyz"},
                {"my name is Ramesh"},
                {"my NAME is RAMESH"},
                {"MYNAMEISRAMESH"},
                {"MY NAME IS RAMESH"}
        };
    }

    @DataProvider
    public static Object[][] checkStringCharactersAreEqualDataProvider() {

        return new Object[][]{
                {"Sister","Resist"},
                {"Sister","Resiss"}
        };
    }

    @DataProvider
    public static Object[][] reverseNumberDataProvider() {

        return new Object[][]{
                {3483074},
                {4703843}
        };
    }

    @DataProvider
    public static Object[][] isNumberPalindromeDataProvider() {
        return new Object[][]{
                {1221221},
                {1221},
                {12345}
        };
    }

    @DataProvider
    public static Object[][] reverseWordsDataProvider() {

        return new Object[][]{
                {"Hello there ! Ramesh Here"},
                {"ereH hsemaR ! ereht olleH"}
        };
    }

    @DataProvider
    public static Object[][] pyramidPatternDataProvider() {

        return new Object[][]{
                {5},
                {6}
        };
    }

    @DataProvider
    public static Object[][] swapAlternateCharsDataProvider() {

        return new Object[][]{
                {"abcdefgh"},
                {"hfdisufydnjf"}
        };
    }

    @DataProvider
    public static Object[][] secondLargestDigitDataProvider() {

        return new Object[][]{
                {"dfa12321afd"},
                {"str1025rts"}
        };
    }

    @DataProvider
    public static Object[][] wordCountInACentenenceDataProvider() {

        return new Object[][]{
                {"my name is Rohan Rohan"},
                {"Hello there ! Ramesh Here"}
        };
    }

    @DataProvider
    public static Object[][] mergeTwoArraysDataProvider() {

        int[] arr1 = {5, 3, 2};
        int[] arr2 = {9, 0, 1};
        return new Object[][]{
                {arr1, arr2,}
        };
    }

    @DataProvider
    public static Object[][] incrementANumberRepresentedAsAnArrayDataProvider() {
        int[] arr1 = {1,2,3};
        int[] arr2 = {9, 9,9};
        int[] arr3 = {1, 3, 9};
        return new Object[][]{
                {arr1},
                {arr2},
                {arr3}
        };
    }

    @DataProvider
    public static Object[][] duplicateElementsInListDataProvider() {

        return new Object[][]{
                {Arrays.asList("A", "B", "C", "A", "B", "D", "A")},
                //{Arrays.asList(10, 20, 10, 30, 20, 40, 10)}
        };
    }

    @DataProvider
    public static Object[][] calculateTradeAmountsDataProvider() {

        List<Trade> trades = List.of(
                new Trade(TradeType.BUY, 100),
                new Trade(TradeType.SELL, 40),
                new Trade(TradeType.BUY, 60),
                new Trade(TradeType.CANCEL, 30),
                new Trade(TradeType.SELL, 20)
        );
        return new Object[][]{
                {trades}
        };
    }

    @DataProvider
    public static Object[][] duplicateWordsInStringDataProvider() {

        return new Object[][]{
                {"Java is good and Java is fast. But Python is easy than Java"},
        };
    }

    @DataProvider
    public static Object[][] getConsecutiveOnesDataProvider() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
        int[] arr1 = {0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1};

        return new Object[][]{
                {arr},
                {arr1}
        };
    }

    @DataProvider
    public static Object[][] getConsecutiveOnes1DataProvider() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
        int[] arr1 = {0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1};

        return new Object[][]{
                {arr},
                {arr1}
        };
    }


    @DataProvider
    public static Object[][] uniqueCharacterDataProvider() {

        return new Object[][]{
                new String[]{"cookiecrumble"},
                new String[]{"cookie crumble"}
        };
    }


    @DataProvider
    public static Object[][] stringSequenceCheckerDataProvider() {

        return new Object[][]{
                new String[]{"Testing", "Developments", "Testings", "Designs", "Maintenance"},
                new String[]{"Testing", "Development", "Testing", "Design", "Maintenance"}
        };
    }

}
