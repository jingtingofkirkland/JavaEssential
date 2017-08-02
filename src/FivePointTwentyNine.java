import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/15.
 */
import java.util.Scanner;
public class FivePointTwentyNine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("What day is the first day of this year:  ");
        int day = input.nextInt();
        String[] month = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        int febDay;
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            febDay = 29;
        }
        else {
            febDay = 28;
        }
        int[] amountDay = {0, 31, febDay, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday"};
        for(int i = 0; i < 12; i++) {
            day += amountDay[i];
            System.out.println("\t\t" + month[i] + " " + year);
            System.out.println("__________________________________");
            System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
            int count = 0;
            for(int j = 0; j < day % 7; j++) {
                System.out.print("\t");
                count++;
            }
            for(int k = 1; k <= amountDay[i + 1]; k++) {
                System.out.print(k + "\t");
                count++;
                if(count % 7 == 0) {
                    System.out.println("");
                }
            }
            System.out.println("");
        }
    }
}
