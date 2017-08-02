/**
 * Created by Administrator on 2017/7/4.
 */
import java.util.Scanner;
public class ThreePointThirtythree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight and price for package 1 : ");
        double w1 = input.nextDouble();
        double p1 = input.nextDouble();
        System.out.print("Enter weight and price for package 2 : ");
        double w2 = input.nextDouble();
        double p2 = input.nextDouble();
        if(p1 / w1 < p2 / w2) {
            System.out.print("Package 1 has a better price.");
        }
        else if(p1 / w1 > p2 / w2) {
            System.out.print("Package 2 has a better price.");
        }
        else {
            System.out.print("Two package have the same price.");
        }
    }
}
