/**
 * Created by Administrator on 2017/7/7.
 */

import java.util.Scanner;
public class FourPointSeventeen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a month: ");
        String month = input.next();
        if(month.equals("Feb")) {
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.print(month + " " + year + " has 29 days");
            }
            else {
                System.out.print(month + " " + year + " has 28 days");
            }
        }
        else {
            final String[] stringmonth = {"AprJunSepNov","JanMarMayJulAugOctDec"};
            for(int i = 0; i < 2; i++) {
                if(stringmonth[i].contains(month)) {
                    System.out.print(month + " " + year + " has " + (i + 30) +" days");
                }
            }
        }
    }
}
