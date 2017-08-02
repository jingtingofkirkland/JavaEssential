/**
 * Created by Administrator on 2017/7/2.
 */
import java.util.Scanner;
public class ThreePointTwentyseven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point's x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        if(x >= 0 && y >= 0 && (x + 2 * y) <= 200){
            System.out.print("The point is in the triangle");
        }
        else {
            System.out.print("The point is not in the triangle");
        }
    }
}
