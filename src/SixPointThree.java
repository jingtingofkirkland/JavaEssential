/**
 * Created by Administrator on 2017/7/25.
 */
import java.util.Scanner;
public class SixPointThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entet an integer: ");
        int user = input.nextInt();
        boolean isPalindrome = isPalindrome(user);
        System.out.print("The integer is a palindrome is " + isPalindrome);
    }
    public static boolean isPalindrome(int number) {
        boolean result;
        int reverseNumber = reverse(number);
        if(number == reverseNumber) {
            result = true;
        }
        else {
            result = false;
        }
        return result;
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
