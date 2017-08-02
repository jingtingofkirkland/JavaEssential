/**
 * Created by Administrator on 2017/7/2.
 */
import java.util.Scanner;
public class ThreePointTwentyfive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();
        double a = y1 - y2;
        double b = x2 - x1;
        double e = a * x1 + b * y1;
        double c = y3 - y4;
        double d = x4 - x3;
        double f = c * x3 + d * y3;
        double deta = a * d - b * c;
        if(deta == 0){
            System.out.println("The two lines are parallel");
        }
        else{
            double x = (e * d - b * f) / deta;
            double y = (a * f - e * c) / deta;
            System.out.print("The intersecting point is at ( " + x + " , " + y + ")");
        }

    }

}
