/**
 * Created by Administrator on 2017/7/28.
 */
import java.util.Scanner;
public class SixPointThirtyFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        System.out.print("The area of the pentagon is " + area(side));
    }
    public static double area(double s) {
        return 5.0 * s * s / 4 / Math.tan(Math.PI / 5.0);
    }
}
