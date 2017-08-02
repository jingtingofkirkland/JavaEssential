/**
 * Created by Administrator on 2017/7/20.
 */
import java.util.Scanner;
public class FivePointFortySix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String first = input.next();
        String second = "";
        for(int i = first.length() - 1; i >= 0; i--) {
            char every = first.charAt(i);
            second += every;
        }
        System.out.print("The reversed string is " + second);
    }
}
