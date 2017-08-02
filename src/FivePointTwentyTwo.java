/**
 * Created by Administrator on 2017/7/15.
 */
import java.util.Scanner;
public class FivePointTwentyTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double amount = input.nextDouble();
        System.out.print("Number of year: ");
        int year = input.nextInt();
        System.out.print("Annual Interest Rsste: ");
        double annualRate = input.nextDouble();
        double monthlyRate = annualRate / 12;
        double monthlyPayment = amount * monthlyRate / 100 / (1 - 1.0 / Math.pow((1 + monthlyRate / 100), year * 12));
        double totalPayment = monthlyPayment * year * 12;
        System.out.println("\nMonthly Payment: " + (int)(monthlyPayment * 100) / 100.0);
        System.out.println("Total Payment: " + (int)(totalPayment * 100) / 100.0);
        System.out.println("\nPayment#\tInterest\tPrincipal\tBanlance");
        double banlance = amount;
        for(int i = 1; i <= year * 12; i++) {
            double interest, principal;
            interest = banlance * monthlyRate / 100;
            principal = monthlyPayment - interest;
            banlance -= principal;
            System.out.println(i + "\t\t" + (int)(interest * 100) / 100.0
                    + "\t\t" + (int)(principal * 100) / 100.0 + "\t\t" +
                    (int)(banlance * 100) / 100.0);
        }
    }
}
