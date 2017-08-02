/**
 * Created by Administrator on 2017/7/20.
 */
import java.util.Scanner;
public class FivePointFortyOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int number = input.nextInt();
        int max = 0;
        int count = 1;
        while(number != 0) {
            max = number;
            number = input.nextInt();
            if (number > max) {
                max = number;
                count = 1;
            }
            if(number == max) {
                count++;
            }
        }
        System.out.print("The largest number is " + max +
                "\nThe occurence count of the largest number is " + count);
    }
}
