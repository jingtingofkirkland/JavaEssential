/**
 * Created by Administrator on 2017/7/20.
 */
import java.util.Scanner;
public class FivePointThirtySeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an decimal integer: ");
        int decimal = input.nextInt();
        String binary = "";
        int remain = 0;
        while(decimal / 2 != 0) {
            decimal /= 2;
            remain = decimal % 2;
            binary = remain + binary;
        }
        System.out.print(decimal + binary);
    }

}
