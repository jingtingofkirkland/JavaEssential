/**
 * Created by Administrator on 2017/6/30.
 */
import java.util.Scanner;
public class ThreePointFourteen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int rad = (int)(Math.random() * 10) / 5;
        System.out.print("Enter a guss number(0 or 1): ");
        int guss = input.nextInt();
        if(rad == guss){
            System.out.print("correct");
        }
        else{
            System.out.print("wrong");
        }
    }
}
