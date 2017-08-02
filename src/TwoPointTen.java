/**
 * Created by Administrator on 2017/6/22.
 */
import java.util.Scanner;
public class TwoPointTen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        double kilograms = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double itemperature = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        double ftemperature = input.nextDouble();
        double energy = kilograms * (ftemperature - itemperature) * 4184;
        System.out.print("The energy needed is " + energy);
    }
}
