/**
 * Created by Administrator on 2017/6/21.
 */
import java.util.Scanner;
public class TwoPointNine {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter v0, v1, and t: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();
        double averagea = (v1 - v0) / t;
        System.out.print("The average acceleration is " + averagea);
    }
}
