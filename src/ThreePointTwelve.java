/**
 * Created by Administrator on 2017/6/29.
 */
import java.util.Scanner;
public class ThreePointTwelve {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int a = input.nextInt();
        int b = a / 100;
        int c = a %10;
        if(b == c){
            System.out.print(a + " is a palindrome");
        }
        else{
            System.out.print(a + " is not a palindrome");
        }
    }
}
