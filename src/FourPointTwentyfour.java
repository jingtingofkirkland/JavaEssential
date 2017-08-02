/**
 * Created by Administrator on 2017/7/7.
 */
import java.util.Scanner;
public class FourPointTwentyfour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String firstcity = input.next();
        System.out.print("Enter the second city: ");
        String secondcity = input.next();
        System.out.print("Enter the third city: ");
        String thirdcity = input.next();
        String a, b, c, m;
        if(firstcity.compareTo(secondcity) < 0) {
            a = firstcity;
            b = secondcity;
        }
        else {
            a = secondcity;
            b = firstcity;
        }
        if(b.compareTo(thirdcity) < 0) {
            c = thirdcity;
        }
        else {
            c = b;
            b = thirdcity;
        }
        if(a.compareTo(b) > 0) {
            m = a;
            a = b;
            b = m;
        }
        System.out.print("The three cities in alphabetical order are " + a + b + c);
    }
}
