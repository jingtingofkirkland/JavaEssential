/**
 * Created by Administrator on 2017/6/22.
 */
import java.util.Scanner;
public class TwoPointSeventeen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58\u2109 and 41\u2109: ");
        double ta = input.nextDouble();
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double v = input.nextDouble();
        double twc = 35.74 + 0.6215 * ta - 35.75 * Math.pow(v,0.16) + 0.4275 * ta * Math.pow(v,0.16);
        System.out.print("The wind chill index is " + twc);
    }
}
