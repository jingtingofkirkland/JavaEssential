/**
 * Created by Administrator on 2017/6/22.
 */
import java.util.Scanner;
public class TwoPointSixteen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double s = input.nextDouble();
        double area = 3.0 / 2 * Math.pow(3, 0.5) * Math.pow(s, 2);
        System.out.print("The area of the hexagon is " + area);
    }
}
