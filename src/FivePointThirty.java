/**
 * Created by Administrator on 2017/7/15.
 */
import java.util.Scanner;
public class FivePointThirty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter monthly amount: ");
        double amount = input.nextInt();
        System.out.print("Enter annual rate: ");
        double annualRate = input.nextDouble();
        System.out.print("Enter number of months: ");
        int month = input.nextInt();
        double monthlyRate = annualRate / 1200.0;
        double sum = 0;
        for(int i = 1; i <= month; i++) {
            sum = (100 + sum) * (1 + monthlyRate);
        }
        System.out.print("The total amount of money after " + month + " months is " + sum);
    }
}
