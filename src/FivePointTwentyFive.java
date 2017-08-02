/**
 * Created by Administrator on 2017/7/15.
 */
public class FivePointTwentyFive {
    public static void main(String[] args) {
        for(int k = 1; k <= 10; k++) {
            double sum = 0;
            for(int i = 1; i <= k * 10000; i++) {
                sum += (-1.0) * Math.pow((-1), i) / (2 * i - 1);
            }
            System.out.println(k * 10000 + "\t\t" + 4 * sum);
        }
    }
}
