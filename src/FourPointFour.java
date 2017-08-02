/**
 * Created by Administrator on 2017/7/6.
 */
import java.util.Scanner;
public class FourPointFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double s = input.nextDouble();
        double area = 6 * s * s / (4 * Math.tan(Math.PI / 6));
        System.out.print("The area of the hexagon is " + (int)(area * 100) / 100.0);
    }
 }
