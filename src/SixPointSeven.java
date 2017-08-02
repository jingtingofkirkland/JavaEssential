/**
 * Created by Administrator on 2017/7/25.
 */
import java.util.Scanner;
public class SixPointSeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("The amount invested: ");
        double amount = input.nextDouble();
        System.out.print("Annual interest rate: ");
        double annualRate = input.nextDouble();
        System.out.println("Years\tFuture Value");
        for(int i = 1; i <= 30; i++) {
            System.out.println(i + "\t" +
                    (int)(futureInvestmentValue(amount, annualRate / 12, i) *100) / 100.0);
        }
    }
    public static double futureInvestmentValue(
            double investmentAmount, double monthlyInterestRate, int years) {
        double result;
        result = investmentAmount * Math.pow((1 + monthlyInterestRate / 100), (years * 12));
        return result;
    }
}
