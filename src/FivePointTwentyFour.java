/**
 * Created by Administrator on 2017/7/15.
 */
import java.util.Scanner;
public class FivePointTwentyFour {
    public static void main(String[] args) {
        double sum = 0;
        for(int i = 0; i <= 48; i++) {
            sum += (1.0 + 2 * i) / (3.0 + 2 * i);
        }
        System.out.print(sum);
    }
}
