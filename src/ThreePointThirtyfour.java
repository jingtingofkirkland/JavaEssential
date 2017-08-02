import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/4.
 */
import java.util.Scanner;
public class ThreePointThirtyfour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double a0, a1, b0, b1;
        if(x1 < x0){
            a0 = x1;
            a1 = x0;
        }
        else {
            a0 = x0;
            a1 = x1;
        }
        if(y1 < y0){
            b0 = y1;
            b1 = y0;
        }
        else {
            b0 = y0;
            b1 = y1;
        }
        if(((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) == 0
                && x2 <= a1
                && x2 >= a0
                && y2 <= b1
                && y2 >= b0) {
            System.out.print("(" + x2 + ", " + y2 +") " + "is on the line segment from (" +
                    x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        }
        else  {
            System.out.print("(" + x2 + ", " + y2 +") " + "is not on the line segment from (" +
                    x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        }
    }
}
