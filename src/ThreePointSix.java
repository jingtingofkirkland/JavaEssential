/**
 * Created by Administrator on 2017/6/28.
 */
import java.util.Scanner;
public class ThreePointSix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter feet: ");
        int feet = input.nextInt();
        System.out.print("Enter inches: ");
        double inches = input.nextDouble();
        double high = 0.0254 * (feet * 12 + inches);
        double BMI = weight * 0.45359237 / Math.pow(high, 2);
        System.out.println("BMI is " + BMI);
        if(BMI < 18.5){
            System.out.print("Underweight");
        }
        else if(BMI < 25){
            System.out.print("Normal");
        }
        else if(BMI < 30){
            System.out.print("Overweight");
        }
        else{
            System.out.print("Obese");
        }
    }
}
