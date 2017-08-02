/**
 * Created by Administrator on 2017/7/19.
 */
import java.util.Scanner;
public class FivePointThirtyOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the initial deposit amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double annualYield = input.nextDouble();
        System.out.print("Enter maturity period(number of months): ");
        int months = input.nextInt();
        System.out.println("Month\t\tCD Value");
        double value = amount;
        for(int i = 1; i <= months; i++) {
            value += value * annualYield / 1200.0;
            System.out.println(i + "\t\t" + (int)(value * 100) / 100.0);
        }
    }


}
