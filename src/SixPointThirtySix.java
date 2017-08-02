/**
 * Created by Administrator on 2017/7/28.
 */
import java.util.Scanner;
public class SixPointThirtySix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of side: ");
        int number = input.nextInt();
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        System.out.print("The area of the pentagon is " + area(number, side));
    }
    public static double area(int n, double s) {
        return n * s * s / 4.0 / Math.tan(Math.PI / n);
    }
}
