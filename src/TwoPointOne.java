/**
 * Created by Administrator on 2017/6/13.
 */
import java.util.Scanner;
public class TwoPointOne {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a degree in Celsius: ");
       double Celsius = input.nextDouble();
       double Fahrenheit = (9.0 / 5) * Celsius + 32;
       System.out.print(Celsius + " Celsius is " + Fahrenheit + " Fahrenheit");
    }
}
