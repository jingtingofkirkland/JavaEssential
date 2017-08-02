/**
 * Created by Administrator on 2017/7/20.
 */
import java.util.Scanner;
public class FivePointThirtyNine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your target: ");
        double target = input.nextDouble();
        double salesVolume = 0;
        if (target - 5000 <= 0 ) {

        }
        if(target - 5000 - 5000 * 0.08 <= 0) {
            salesVolume = (target - 5000) / 0.08;
        }
        if(target - 5000 - 5000 * 0.08 - 5000 * 0.1 <= 0) {
            salesVolume = (target - 5000 - 5000 * 0.08) / 0.1;
        }
        else {
            salesVolume = (target - 5000 - 5000 * 0.08 - 5000 * 0.1) / 0.12 + 10000;

        }
        System.out.print("Tne min sales volume is " + salesVolume);
    }
}
