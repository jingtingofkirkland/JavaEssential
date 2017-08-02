/**
 * Created by Administrator on 2017/7/20.
 */
import java.util.Scanner;
public class FivePointFortFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double sum = 0;
        double squareSum = 0;
        for(int i = 1; i <= 10; i++) {
            double number = input.nextDouble();
            sum += number;
            squareSum += Math.pow(number, 2);
        }
        double mean = sum / 10.0;
        double deviation = Math.sqrt((squareSum - sum * sum / 10.0) / 9.0 );
        System.out.print("The mean is " + (int)(mean * 100) / 100.0 +
                "\nThe standard deviation is " + (int)(deviation * 100000) / 100000.0);

    }
}

