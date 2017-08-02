/**
 * Created by Administrator on 2017/7/7.
 */
import java.util.Scanner;
public class FourPointNine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a  character: ");
        String aa = input.next();
        char a = aa.charAt(0);
        System.out.print("The Unicode for the character " + a + " is " + (int)a);
    }
}
