/**
 * Created by Administrator on 2017/7/4.
 */
import java.util.Scanner;
public class ThreePointTwentyeight{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter r1 center x-, y-coordinates, width, and height: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double width1 = input.nextDouble();
        double height1 = input.nextDouble();
        System.out.print("Enter r2 center x-, y-coordinates, width, and height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double width2 = input.nextDouble();
        double height2 = input.nextDouble();
        if(Math.abs(x1 - x2) >= (width1 + width2) / 2
                || Math.abs(y1 - y2) >= (height1 + height2) / 2) {
            System.out.print("r2 does not overlaps r1");
        }
        else if(Math.abs(x1 - x2) <= (width1 - width2) / 2
                && Math.abs(y1 - y2) <= (height1 - height2) / 2) {
            System.out.print("r2 is inside r1");
        }
        else {
            System.out.print("r2 overlaps r1");
        }

    }

}
