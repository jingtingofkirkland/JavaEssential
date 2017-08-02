/**
 * Created by Administrator on 2017/7/25.
 */
import java.util.Scanner;
public class SixPointFive{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three number: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        System.out.print("The ascending order is ");
        displaySortedNumbers(a, b, c);
    }
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double mid;
        if(num1 > num2) {
            mid = num1;
            num1 = num2;
            num2 = mid;
        }
        if(num2 > num3) {
            mid = num2;
            num2 = num3;
            num3 = mid;
        }
        if(num1 > num2) {
            mid = num1;
            num1 = num2;
            num2 = mid;
        }
        System.out.print(num1 + ", " + num2 + ", " + num3);
    }
}
