/**
 * Created by Administrator on 2017/7/7.
 */
import java.util.Scanner;

import static java.lang.Character.isDigit;

public class FourPointTwentyone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN: ");
        String number = input.next();
        if(number.length() == 11) {
            char[] digit = new char[11];
            boolean[] numberdigit = new boolean[11];
            for(int i = 0; i < 11; i++) {
                digit[i] = number.charAt(i);
                numberdigit[i] = isDigit(digit[i]);
            }
            System.out.print(digit[10]);
            if(numberdigit[0] && numberdigit[1] && numberdigit[2] && numberdigit[4]
                    && numberdigit[5] && numberdigit[7] && numberdigit[8] && numberdigit[9]
                    && numberdigit[10] && digit[3] == '-'
                    && digit[6] == '-') {
                System.out.print(number + "is a valid social security number");
            }
            //else {
            //    System.out.print(number + "is an invalid social security number");
           // }
        }
        else {
            System.out.print(number + "is an invalid social security number");
        }

    }
}
