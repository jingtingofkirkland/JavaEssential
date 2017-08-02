/**
 * Created by Administrator on 2017/6/29.
 */
import java.util.Scanner;
public class ThreePointEleven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of month: ");
        int month = input.nextInt();
        System.out.print("Enter a number of year: ");
        int year = input.nextInt();
        boolean isLeapyear = (year % 4 == 0) || (year % 400 == 0) && (year % 100 != 0);
        if (month == 2) {
            if (isLeapyear) {
                System.out.print("Februrary " + year + " has 29 days");
            } else {
                System.out.print("Februrary " + year + " has 28 days");
            }
        } else {
            switch (month) {
                case 1:
                    System.out.println("January" + year + "has 31 days");
                    break;
                case 3:
                    System.out.println("march" + year + "has 31 days");
                    break;
                case 4:
                    System.out.println("April" + year + "has 30 days");
                    break;
                case 5:
                    System.out.println("May" + year + "has 31 days");
                    break;
                case 6:
                    System.out.println("June" + year + "has 30 days");
                    break;
                case 7:
                    System.out.println("July" + year + "has 31 days");
                    break;
                case 8:
                    System.out.println("August" + year + "has 31 days");
                    break;
                case 9:
                    System.out.println("September" + year + "has 30 days");
                    break;
                case 10:
                    System.out.println("October" + year + "has 31 days");
                    break;
                case 11:
                    System.out.println("November" + year + "has 30 days");
                    break;
                case 12:
                    System.out.println("December" + year + "has 31 days");
                    break;
            }
        }
    }
}
