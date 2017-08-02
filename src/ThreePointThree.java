/**
 * Created by Administrator on 2017/6/28.
 */
import java.util.Scanner;
public class ThreePointThree {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        double deta = a * d - b * c;
        if(deta == 0){
            System.out.println("The equation has no solution");
        }
        else{
            double x = (e * d - b * f) / deta;
            double y = (a * f - e * c) / deta;
            System.out.print("x is " + x + " and y is " + y);
        }
    }
}
