/**
 * Created by Administrator on 2017/6/24.
 */
import java.util.Scanner;
public class TwoPointTwentythree {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double dis = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double mil = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        double pri = input.nextDouble();
        double cost = dis / mil * pri;
        System.out.print("The cost of driving is $" + cost);
    }
}
