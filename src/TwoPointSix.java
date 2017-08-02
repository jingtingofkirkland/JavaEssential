/**
 * Created by Administrator on 2017/6/15.
 */
import java.util.Scanner;
public class TwoPointSix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        int sum = 0;
        if(number >0 & number < 1000) {
            for(int i = 1; i < 4; i++){
                sum += number % 10;
                number = number / 10;
            }
            System.out.println("The sum of the digits is " + sum);
        }
        else{
            System.out.print("wrong number");
        }
    }
}
