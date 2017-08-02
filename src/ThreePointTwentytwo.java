/**
 * Created by Administrator on 2017/7/2.
 */
import java.util.Scanner;
public class ThreePointTwentytwo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double s = Math.pow((x * x + y * y), 0.5);
        if(s <= 10){
            System.out.print("Point (" + x +", " + y + ") is in the circle");
        }
        else{
            System.out.print("Point (" + x +", " + y + ") is not in the circle");
        }
    }
}
