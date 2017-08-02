/**
 * Created by Administrator on 2017/6/22.
 */
import java.util.Scanner;
public class TwoPointThirteen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        int a = input.nextInt();
        double amount = 0;
        for(int i = 1; i < 7; i++){
            amount = a *1.00417 + amount * 1.00417;
        }
        System.out.print("After the sixth month, the account value is $" + amount);
    }

}
