/**
 * Created by Administrator on 2017/7/2.
 */
import java.util.Scanner;
public class ThreePointTwentysix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = input.nextInt();
        if(a % 5 == 0 && a % 6 == 0){
            System.out.println("Is " + a + " divisible by 5 and 6? " + "ture");
        }
        else{
            System.out.println("Is " + a + " divisible by 5 and 6? " + "false");
        }
        if(a % 5 == 0 || a % 6 == 0){
            System.out.println("Is " + a + " divisible by 5 or 6? " + "ture");
        }
        else {
            System.out.println("Is " + a + " divisible by 5 or 6? " + "false");
        }
        if(a % 5 == 0 ^ a % 6 == 0){
            System.out.println("Is " + a + " divisible by 5 or 6, but not both? " + "ture");
        }
        else {
            System.out.println("Is " + a + " divisible by 5 and 6, but not both? " + "false");
        }

    }
}

