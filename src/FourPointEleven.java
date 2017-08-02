/**
 * Created by Administrator on 2017/7/6.
 */
import java.util.Scanner;
public class FourPointEleven {
    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer(0-15): ");
        int hex = input.nextInt();
        if(hex > 15 || hex < 0) {
            System.out.print(" is an invalid input");
            System.exit(1);
        }
        if(hex >= 10) {
            char value = (char)(hex - 10 + 65);
            System.out.print("The hex value is " + value);
        }
        else {
            System.out.print("The hex value is " + hex);
        }
    }
}
