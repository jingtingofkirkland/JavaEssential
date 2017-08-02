/**
 * Created by Administrator on 2017/7/6.
 */
import java.util.Scanner;
public class FourPointFourteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter a letter grade: ");
        String stringgrade = input.next();
        final String stringlettergrade = "FDCBA";
        if(stringlettergrade.contains(stringgrade)) {
            final String[]  lettergrade = {"F", "D", "C", "B", "A" };
            for(int i = 0; i < 5; i++){
                if(stringgrade.equals(lettergrade[i])) {
                    System.out.print("The numeric value for grade " + stringgrade + " is " + i);
                }
            }
        }
        else {
            System.out.print(stringgrade + " is an invalid input");
        }
    }
}
