/**
 * Created by Administrator on 2017/6/14.
 */
import java.util.Scanner;
public class TwoPointTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = radius * radius * Math.PI;
        double volum = area * length;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volum);
    }
}
