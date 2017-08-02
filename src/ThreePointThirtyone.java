/**
 * Created by Administrator on 2017/7/4.
 */
import java.util.Scanner;
public class ThreePointThirtyone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double rate = input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int kind = input.nextInt();
        switch(kind) {
            case 0: System.out.print("Enter the dollar amount: ");
                    double dollar = input.nextDouble();
                    double amount1 = dollar * rate;
                    System.out.print("$" + dollar + " is " + amount1 + " yuan");
                    break;
            case 1: System.out.print("Enter the RMB amount: ");
                    double RMB = input.nextDouble();
                    double amount2 = RMB / rate;
                    System.out.print(RMB + " yuan is " + "$" +amount2);
                    break;
        }
    }
}
