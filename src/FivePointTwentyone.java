/**
 * Created by Administrator on 2017/7/14.
 */
import java.util.Scanner;
public class FivePointTwentyone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double amount = input.nextDouble();
        System.out.print("Number of year: ");
        int year = input.nextInt();
        System.out.printf("%-20s%-20s%-20s", "Interest Rate", "Monthly Payment", "Total Payment");
        System.out.println("");
        double rate = 5.000;
        while(rate <= 8.000) {
            double monthlyPayment = amount * rate / 1200 / (1 - 1.0 / Math.pow((1 + rate / 1200), year * 12));
            double totalPayment = monthlyPayment * year * 12;
            System.out.printf("%-4.3f%-16s%-20.2f%-20.2f", rate, "%", monthlyPayment, totalPayment);
            System.out.println("");
            rate += 1.0 / 8;
        }
    }
}
