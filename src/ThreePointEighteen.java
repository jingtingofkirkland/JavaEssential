/**
 * Created by Administrator on 2017/7/1.
 */
import java.util.Scanner;
public class ThreePointEighteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight of package: ");
        double weight = input.nextDouble();
        if(weight <= 1) {
            System.out.print("The cost of shipped is 3.5");
        }
        else if(weight <= 3) {
            System.out.print("The cost of shipped is 5.5");
        }
        else if(weight <= 10) {
            System.out.print("The cost of shipped is 8.5");
        }
        else if(weight <= 20) {
            System.out.print("The cost of shipped is 10.5");
        }
        else {
            System.out.print("The package cannot be shipped");
        }
    }
}
