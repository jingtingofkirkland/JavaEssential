/**
 * Created by Administrator on 2017/6/14.
 */
import java.util.Scanner;
public class TwoPointFive {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();
        double numbergratuity = subtotal * gratuity / 100;
        double total = subtotal + numbergratuity;
        System.out.print("The gratuity is $" + numbergratuity + " and total is $" + total);
    }
}
