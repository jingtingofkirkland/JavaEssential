/**
 * Created by Administrator on 2017/7/1.
 */
import java.util.Scanner;
public class ThreePointTwentyone {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int q = input.nextInt();
        switch(month){
            case 1: month = 13;
                    year -= 1;
                    break;
            case 2: month = 14;
                    year -= 1;
                    break;
        }
        int k = year % 100;
        int j = Math.abs(year / 100);
        int h = (q + 26 * (month + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
        final String[] WEEK = new String[] {
                "saturday",
                "sunday",
                "monday",
                "tuesday",
                "wednesday",
                "thursday",
                "friday",
        };
        System.out.print("Day of the week is " + WEEK[h]);
    }
}
