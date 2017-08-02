/**
 * Created by Administrator on 2017/7/26.
 */
public class SixPointSixteen {
    public static void main(String[] args) {
        System.out.printf("%6s%6s", "year", "days");
        System.out.println("\n_______________");
        for(int i = 0; i <= 20; i++) {
            System.out.printf("%6d%6d", (2000 + i), numberOfDaysInAYear(2000 + i));
            System.out.println();
        }
    }
    public static int numberOfDaysInAYear(int year) {
        int result = 0;
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            result = 366;
        }
        else {
            result = 365;
        }
        return result;
    }
}
