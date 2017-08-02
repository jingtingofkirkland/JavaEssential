/**
 * Created by Administrator on 2017/6/28.
 */
import java.util.Scanner;
public class ThreePointSeven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();
        int remainamount = (int)(amount * 100);
        int dollars = remainamount / 100;
        remainamount = remainamount % 100;
        int quarters = remainamount / 25;
        remainamount = remainamount % 25;
        int dimes = remainamount / 10;
        remainamount = remainamount % 10;
        int nickels = remainamount / 5;
        int pennies = remainamount % 5;
        System.out.println("Your amount " + amount + " consists of");
        if(dollars == 1){
            System.out.println("1 dollar");
        }
        else if(dollars > 1){
            System.out.println(dollars + "dollars");
        }
        if(quarters == 1){
            System.out.println("1 quarter");
        }
        else if(quarters > 1){
            System.out.println(quarters + "quarters");
        }
        if(dimes == 1){
            System.out.println("1 dime");
        }
        else if(dimes > 1){
            System.out.println(dimes + "dimes");
        }
        if(nickels == 1){
            System.out.println("1 nickel");
        }
        else if(nickels > 1) {
            System.out.println(nickels + "nickels");
        }
        if(pennies == 1){
            System.out.println("1 penny");
        }
        else if(pennies > 1) {
            System.out.println(pennies + "pennies");
        }
    }
}

