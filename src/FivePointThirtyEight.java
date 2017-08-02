/**
 * Created by Administrator on 2017/7/21.
 */
import java.util.Scanner;
public class FivePointThirtyEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an decimal integer: ");
        int decimal = input.nextInt();
        String octonary = "";
        int remain = 0;
        while (decimal / 8 != 0) {
            remain = decimal % 8;
            decimal /= 8;

            octonary = remain + octonary;
        }
        System.out.print(decimal + octonary);
    }
}
