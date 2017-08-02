/**
 * Created by Administrator on 2017/6/24.
 */
import java.util.Scanner;
public class TwoPointTwenty {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double r = input.nextDouble();
        double i = balance * (r / 1200);
        System.out.print("The interest is " + i);
    }
}
