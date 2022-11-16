import java.util.Scanner;

public class NextDayCalculator {
    static Scanner sc = new Scanner(System.in);

    public static String nextDay(int dayInput, int monthInput, int yearInput) {
        switch (monthInput) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 12:
                if (dayInput == 31 && monthInput == 12) {
                    dayInput = 1;
                    monthInput = 1;
                    yearInput++;
                } else if (dayInput == 31){
                    dayInput = 1;
                    monthInput++;
                }else
                    dayInput++;
                break;
            case 2:
                if (isLeapYear(yearInput) && dayInput == 29) {
                    dayInput = 1;
                    monthInput++;
                } else if (dayInput == 28) {
                    dayInput = 1;
                    monthInput++;
                }
                break;
            default:
                if (dayInput == 30) {
                    dayInput = 1;
                    monthInput++;
                }
        }
        return dayInput + "/" + monthInput + "/" + yearInput;
    }


    public static void main(String[] args) {
        System.out.println(nextDay(31, 12, 2018));
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    return true;
            } else {
                return true;
            }
        }
        return false;
    }
}
