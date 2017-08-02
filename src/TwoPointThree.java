/**
 * Created by Administrator on 2017/6/14.
 */
import java.util.Scanner;
public class TwoPointThree {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();
        double change = 0.305;
        double metre = feet * change;
        System.out.print(feet + " feet is " + metre + " metres");
    }
}
