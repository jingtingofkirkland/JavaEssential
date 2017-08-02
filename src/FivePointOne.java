/**
 * Created by Administrator on 2017/7/13.
 */
import java.util.Scanner;
public class FivePointOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        int positive = 0;
        int negative = 0;
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int everyInteger = input.nextInt();
        if(everyInteger == 0) {
            System.out.print("No numbers are entered except 0");
        }
        else {
            do {
                sum += everyInteger;
                if(everyInteger > 0) {
                    positive++;
                }
                else if(everyInteger < 0) {
                    negative++;
                }
                everyInteger = input.nextInt();
            }while(everyInteger != 0);
            double average = (int)(sum / (positive + negative) * 100) / 100.0;
            System.out.print("The number of positive is " + positive +
                    "\nThe number of negative is " + negative +
                    "\nThe total is " + sum + "\nThe average is " + average);
        }
    }
}
