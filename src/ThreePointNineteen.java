/**
 * Created by Administrator on 2017/7/1.
 */
import java.util.Scanner;
public class ThreePointNineteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three side of a triangle: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.print("The perimeter of the triangle is " + (a + b + c));
        }
        else {
            System.out.print("The input is illegal");
        }
    }
}
