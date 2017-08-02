/**
 * Created by Administrator on 2017/7/7.
 */
import java.util.Scanner;
public class FourPointTwentythree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double payrate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalrate = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double staterate = input.nextDouble();
        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay Rate: $" + payrate);
        System.out.println("Gross Pay: $" + payrate * hours);
        System.out.println("Deductions:");
        System.out.println("  Federal Withholding(20.0%): $" +
                (int)(payrate * hours * federalrate * 100) /100.0);
        System.out.println("  State Withholding(9.0%): $" +
                (int)(payrate * hours * staterate * 100) /100.0);
        System.out.println("  Federal Withholding(20.0%): $" +
                (int)(payrate * hours * (federalrate + staterate) * 100) / 100.0);
        System.out.println("Net Pay: $" +
                (int)(payrate * hours * (1 - federalrate - staterate) * 100) / 100.0);
    }
}
