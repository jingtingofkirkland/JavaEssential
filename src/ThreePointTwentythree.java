import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/2.
 */
import java.util.Scanner;
public class ThreePointTwentythree {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        if(x <= 5 && y <= 2.5){
            System.out.print("Point (" + x +", " + y + ") is in the rectangle");
        }
        else{
            System.out.print("Point (" + x +", " + y + ") is not in the rectangle");
        }
    }
}
