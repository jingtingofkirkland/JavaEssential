/**
 * Created by Administrator on 2017/7/6.
 */
import java.util.Scanner;
public class FourPointEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ASCII code(0-127): ");
        int code = input.nextInt();
        System.out.print("The character for ASCII code " + code + " is " + (char)code);
    }
}
