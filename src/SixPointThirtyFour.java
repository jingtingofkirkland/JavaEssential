/**
 * Created by Administrator on 2017/7/28.
 */
import java.util.Scanner;
public class SixPointThirtyFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter full year (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month as number between 1 and 12: ");
        int month = input.nextInt();
        System.out.println("\t\t" + monthName(month) + "  " + year);
        System.out.println("- - - - - - - - - - - - - - - - - - -");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        int count = 0;
        if(dayOfWeek(year, month) == 0) {
            System.out.print("\t\t\t\t\t\t");
            count = 6;
        }
        else {
            for(int j = 0; j < dayOfWeek(year, month) - 1 - 1; j++) {
                System.out.print("\t");
                count++;
            }
        }
        for(int i = 1; i <= dayOfMonth(year, month); i++) {
            System.out.print(i + "\t");
            count++;
            if(count % 7 == 0) {
                System.out.println();
            }
        }
    }
    public static int dayOfMonth(int year, int testMonth) {
        int result = 0;
        if(testMonth == 1 || testMonth == 3 || testMonth == 5 || testMonth == 7
                || testMonth == 8 || testMonth == 10 || testMonth == 12) {
            result = 31;
        }
        else if(testMonth == 2) {
            result = isLeapYear(year)? 29 : 28;
        }
        else if(testMonth == 4 || testMonth == 6 || testMonth == 9 || testMonth == 11) {
            result = 30;
        }
        return result;
    }
    public static boolean isLeapYear(int testLeapYear) {
        return (testLeapYear % 4 == 0 && testLeapYear % 100 != 0) || (testLeapYear % 400 == 0);
    }
    public static int dayOfWeek(int year, int month) {
        switch(month){
            case 1: month = 13;
                year -= 1;
                break;
            case 2: month = 14;
                year -= 1;
                break;
        }
        int q = 1;
        int k = year % 100;
        int j = Math.abs(year / 100);
        int h = (q + 26 * (month + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
        return h;
    }
    public static String monthName(int month) {
        String monthName = "";
        switch(month) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December"; break;
        }
        return monthName;
    }
}
