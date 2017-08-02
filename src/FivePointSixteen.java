/**
 * Created by Administrator on 2017/7/14.
 */
import java.util.Scanner;
public class FivePointSixteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        while(n != 0) {

            for(int j = 2; j <= n; j++) {
                if(n % j == 0) {
                    System.out.print(j + " ");
                    n = n / j;
                    break;
                }

            }

        }
    }
}
