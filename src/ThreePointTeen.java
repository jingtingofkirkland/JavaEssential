/**
 * Created by Administrator on 2017/6/29.
 */
import java.util.Scanner;
public class ThreePointTeen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = (int)(Math.random() * 100);
        int b = (int)(Math.random() * 100);
        int sum = a +  b;
        System.out.print(a + " + " + b + " = : ");
        int c = input.nextInt();
        if(sum == c){
            System.out.print("Your answer is correct!");
        }
        else{
            System.out.println("Your answer is wrong!");
            System.out.print("The right answer is: " + a + " + " + b + " = " + sum);
        }
    }
}
