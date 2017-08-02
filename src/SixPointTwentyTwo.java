/**
 * Created by Administrator on 2017/7/27.
 */
import java.util.Scanner;
public class SixPointTwentyTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long user = input.nextLong();
        System.out.print("The square root is: " + sqrt(user));
    }
    public static double sqrt(long n) {
        double lastGuess = 1.0;
        double newGuess = (lastGuess + n / lastGuess) / 2;
        while(Math.abs(newGuess - lastGuess) > 0.0001) {
            lastGuess = newGuess;
            newGuess = (lastGuess + n / lastGuess) / 2;
        }
        return newGuess;
    }

}
