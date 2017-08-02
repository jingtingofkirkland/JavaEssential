/**
 * Created by Administrator on 2017/6/27.
 */
import java.util.Scanner;
public class ThreePointTwo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = (int)(Math.random() * 10);
        int b = (int)(Math.random() * 10);
        int c = (int)(Math.random() * 10);
        System.out.println("What is " + a + "+" + b + "+" + c + " ?");
        int sum = a + b + c;
        int insum = input.nextInt();
        System.out.println(a + "+" + b + "+" + c + "=" + insum + " is " + (a + b + c == sum));
    }
}
