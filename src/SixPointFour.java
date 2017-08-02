/**
 * Created by Administrator on 2017/7/25.
 */
import java.util.Scanner;
public class SixPointFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int user = input.nextInt();
        int reverseNumber = reverse(user);
        System.out.print("The reverse is " + reverseNumber);
    }

    public static int reverse(int number) {
        int result;
        String first = "" + number;
        String second = "";
        int[] everyDigit = new int[first.length()];
        for(int i = 0; i < first.length(); i++) {
            everyDigit[i] = number % 10;
            number /= 10;
            second += everyDigit[i];
        }
        result = Integer.parseInt(second);
        return result;
    }
}
