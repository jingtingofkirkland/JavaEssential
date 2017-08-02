/**
 * Created by Administrator on 2017/6/24.
 */
import java.util.Scanner;
public class TwoPointTwentyone {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double a = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double r = input.nextDouble();
        System.out.print("Enter number of year: ");
        int y = input.nextInt();
        double v = a * Math.pow((1 + r / 12 / 100), (y * 12));
        System.out.print("Accumulated value is $" + v);
    }
}

