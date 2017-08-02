/**
 * Created by Administrator on 2017/7/13.
 */
import java.util.Scanner;
public class FivePointTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count1, count2, inputAnswer;
        int correctNumber = 0;
        int wrongNumber = 0;
        String output = " ";
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 10; i++) {
            count1 = (int)(Math.random() * 15 + 1);
            count2 = (int)(Math.random() * 15 + 1);
            System.out.print("\nWhat is " + count1 + " + " + count2 + " ? ");
            inputAnswer = input.nextInt();
            if(inputAnswer == count1 + count2) {
                correctNumber++;
                System.out.print("\nYou are correct!\n");
                output += count1 + " + " + count2 + " = " + inputAnswer + " is correct\n";
            }
            else {
                wrongNumber++;
                System.out.print("\nYour answer is wrong!\n" + count1 + " + " + count2 +
                        " should be " + (count1 + count2) + "\n" );
                output += count1 + " + " + count2 + " = " + inputAnswer + " is wrong\n";
            }
        }
        long endTime = System.currentTimeMillis();
        long testTime = (endTime - startTime)/1000;
        System.out.print("\nCorrect count is " + correctNumber +
                "\nTest time is " + testTime + " seconds\n" + "\n" + output);
    }
}
