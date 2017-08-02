/**
 * Created by Administrator on 2017/6/24.
 */
import java.util.Scanner;
public class TwoPointNineteen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three point for a triangle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double s11 = Math.pow((x1 - x2), 2);
        double s12 = Math.pow((y1 - y2), 2);
        double s1 = Math.pow((s11 + s12), 0.5);
        double s21 = Math.pow((x1 - x3), 2);
        double s22 = Math.pow((y1 - y3), 2);
        double s2 = Math.pow((s21 + s22), 0.5);
        double s31 = Math.pow((x2 - x3), 2);
        double s32 = Math.pow((y2 - y3), 2);
        double s3 = Math.pow((s31 + s32), 0.5);
        double s = (s1 + s2 + s3) / 2;
        double area = Math.pow((s * (s - s1) * (s - s2) * (s - s3)), 0.5);
        System.out.print("The area of the triangle is " + area);
    }
}
