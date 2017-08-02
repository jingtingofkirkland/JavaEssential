/**
 * Created by Administrator on 2017/7/7.
 */
import java.util.Scanner;
public class FourPointTwenty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String aa = input.next();
        System.out.print("The length of the string is " + aa.length() +
        " and the first char is " + aa.charAt(0));
    }
}
