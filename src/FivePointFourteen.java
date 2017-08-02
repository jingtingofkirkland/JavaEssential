/**
 * Created by Administrator on 2017/7/14.
 */
import java.util.Scanner;
public class FivePointFourteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter first integer: ");
        int n2 = input.nextInt();
        int d;
        if(n1 < n2) {
            d = n1;
        }
        else {
            d = n2;
        }
        int gcd = 1;
        for(int i = d; i > 0; i--) {
            if(n1 % i == 0 && n2 % i == 0) {
                gcd = i;
                break;
            }
        }
        System.out.print("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
    }
}
