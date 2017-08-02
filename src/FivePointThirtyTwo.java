/**
 * Created by Administrator on 2017/7/19.
 */
import java.util.Scanner;
public class FivePointThirtyTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = (int)(Math.random() * 10);
        int secondNumber = (int)(Math.random() * 10);
        while(secondNumber == firstNumber) {
            secondNumber = (int)(Math.random() * 10);
        };
        System.out.print("Enter your lottery pick (two digits): ");
        int guess = input.nextInt();
        int guessFirstNumber = guess / 10;
        int guessSecondNumber = guess % 10;
        System.out.println("The lottery number is " + firstNumber + secondNumber);
        if(guessFirstNumber == firstNumber && guessSecondNumber == secondNumber) {
            System.out.print("Exact match: you win $10,000");
        }
        else if(guessFirstNumber == secondNumber && guessSecondNumber == firstNumber) {
            System.out.print("Match all digits: you win $3,000");
        }
        else if(guessFirstNumber == secondNumber
                || guessFirstNumber == firstNumber
                || guessSecondNumber == secondNumber
                || guessSecondNumber == firstNumber) {
            System.out.print("Match one digit: you win 1,000");
        }
        else {
            System.out.print("Sorry, no match");
        }
    }
}
