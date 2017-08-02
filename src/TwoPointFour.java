/**
 * Created by Administrator on 2017/6/14.
 */
import java.util.Scanner;
public class TwoPointFour {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();
        double change = 0.454;
        double kilograms = pounds * change;
        System.out.print(pounds + " pounds is " + kilograms + " kilograms");
    }
}
