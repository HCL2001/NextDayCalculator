import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    void test1and1(){
        int testDay  = 2;
        int testMoth = 1;
        int testYear = 2022;
        String expectedAnswer = "3/1/2022";
        String result = NextDayCalculator.nextDay(testDay, testMoth, testYear);
        assertEquals(expectedAnswer, result);

    }

    @Test
    void test31and1(){
        int testDay  = 31;
        int testMoth = 1;
        int testYear = 2022;
        String expectedAnswer = "1/2/2022";
        String result = NextDayCalculator.nextDay(testDay, testMoth, testYear);
        assertEquals(expectedAnswer, result);

    }

    @Test
    void test30and4(){
        int testDay  = 30;
        int testMoth = 4;
        int testYear = 2022;
        String expectedAnswer = "1/5/2022";
        String result = NextDayCalculator.nextDay(testDay, testMoth, testYear);
        assertEquals(expectedAnswer, result);

    }

    @Test
    void test28and2and2018(){
        int testDay  = 28;
        int testMoth = 2;
        int testYear = 2018;
        String expectedAnswer = "1/3/2018";
        String result = NextDayCalculator.nextDay(testDay, testMoth, testYear);
        assertEquals(expectedAnswer, result);

    }

    @Test
    void test28and2and2020(){
        int testDay  = 29;
        int testMoth = 2;
        int testYear = 2020;
        String expectedAnswer = "1/3/2020";
        String result = NextDayCalculator.nextDay(testDay, testMoth, testYear);
        assertEquals(expectedAnswer, result);

    }

    @Test
    void test31and12(){
        int testDay  = 31;
        int testMoth = 12;
        int testYear = 2018;
        String expectedAnswer = "1/1/2019";
        String result = NextDayCalculator.nextDay(testDay, testMoth, testYear);
        assertEquals(expectedAnswer, result);

    }
}