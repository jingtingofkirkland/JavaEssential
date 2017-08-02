/**
 * Created by Administrator on 2017/7/26.
 */
import java.util.Scanner;
public class SixPointNineteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side1: ");
        double side1 = input.nextDouble();
        System.out.print("Enter side2: ");
        double side2 = input.nextDouble();
        System.out.print("Enter side3: ");
        double side3 = input.nextDouble();
        if(isValid(side1, side2, side3) == true) {
            System.out.print("The area is " + area(side1, side2, side3));
        }
        else {
            System.out.print("Invalid input");
        }
    }
    public static boolean isValid(double side1, double side2, double side3) {
        boolean result = true;
        if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1 == false) {
            result = false;
        }
        return result;
    }
    public static double area(double side1, double side2, double side3) {
        double result = 0;
        double s = (side1 + side2 + side3) / 2;
        result = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);
        return result;
    }
}
