/**
 * Created by Administrator on 2017/6/27.
 */
import java.util.Scanner;
public class ThreePointOne {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double deta = Math.pow(b, 2) - 4 * a * c;
        if(deta > 0){
            double r1 = (- b + Math.pow(deta, 0.5)) / 2 / a;
            double r2 = (- b - Math.pow(deta, 0.5)) / 2 / a;
            System.out.print("The equatiion has two roots " + r1 + " and " + r2);
        }
        else{
            if(deta == 0){
               double r = - b / 2 / a;
               System.out.print("The equation has one root " + r);
            }
            else{
                System.out.print("The equation has no real roots");
            }
        }
    }
}
