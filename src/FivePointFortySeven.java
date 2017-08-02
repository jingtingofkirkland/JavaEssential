/**
 * Created by Administrator on 2017/7/20.
 */
import java.util.Scanner;
public class FivePointFortySeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String isbn = input.next();
        if(isbn.length() != 12) {
            System.out.print(isbn + " is an invalid input");
        }
        else {
            int[] everyIsbnNumber = new int[12];
            String[] everyIsbnString = new String[12];

            for(int i = 11; i >= 0; i--) {
                everyIsbnString[11 - i] = isbn.substring(11 - i, 12 - i);
                everyIsbnNumber[11 - i] = Integer.parseInt(everyIsbnString[11 - i]);
            }
            int endNumber = 10 - (everyIsbnNumber[0] + everyIsbnNumber[1] * 3 +
                    everyIsbnNumber[2] + everyIsbnNumber[3] * 3 + everyIsbnNumber[4] +
                    everyIsbnNumber[5] * 3 + everyIsbnNumber[6] + everyIsbnNumber[7] * 3 +
                    everyIsbnNumber[8] + everyIsbnNumber[9] * 3 + everyIsbnNumber[10] +
                    everyIsbnNumber[11] * 3) % 10;
            if(endNumber == 10) {
                endNumber = 0;
            }
            System.out.print("The ISBN-13 number is " + isbn + endNumber);

        }

    }
}
