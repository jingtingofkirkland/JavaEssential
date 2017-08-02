/**
 * Created by Administrator on 2017/6/24.
 */
import java.util.Scanner;
public class TwoPointTwentytwo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount, for example, 1156: ");
        int a = input.nextInt();
        int d = a / 100;
        int sheng = a % 100;
        int q = sheng / 25;
        sheng = sheng % 25;
        int dimes = sheng / 10;
        sheng = sheng % 10;
        int n = sheng / 5;
        int p = sheng % 5;
        double newa = a /100.0;
        System.out.println("Your amount " + newa + " consists of");
        System.out.println(d + " dollars");
        System.out.println(q + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(n + " nickels");
        System.out.println(p + " pennies");
    }

}
