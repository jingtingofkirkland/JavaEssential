/**
 * Created by Administrator on 2017/7/22.
 */
import java.util.Scanner;
public class SixPointTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
         long n = input.nextLong();
         int sum = sumDigits(n);
         System.out.print("The sum of all digits is: " + sum);
    }
    public static int sumDigits(long n) {
        int result = 0;
        while(n != 0) {
            result += n % 10;
            n = n / 10;
        }
        return result;
    }
}
