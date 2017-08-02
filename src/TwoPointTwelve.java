/**
 * Created by Administrator on 2017/6/22.
 */
import java.util.Scanner;
public class TwoPointTwelve {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter speed and acceleration: ");
        double v = input.nextDouble();
        double a = input.nextDouble();
        double l = Math.pow(v, 2) / 2 / a;
        System.out.print("The minimum runway length for this airplane is " + l);
    }
}
