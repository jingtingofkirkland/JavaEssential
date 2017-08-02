/**
 * Created by Administrator on 2017/6/22.
 */
import java.util.Scanner;
public class TwoPointfourteen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        double w = weight * 0.45359237;
        double h = height * 0.0254;
        double BMI = w / h / h;
        System.out.print("BMI is " + BMI);
    }
}
