/**
 * Created by Administrator on 2017/7/15.
 */
public class FivePointTwentyThree {
    public static void main(String[] args) {
        double leftToRightSum = 0;
        for(int i = 1; i <= 50000; i++) {
            leftToRightSum += 1.0 / i;
        }
        double rightToLeftSum = 0;
        for(int j = 50000; j >= 1; j--) {
            rightToLeftSum += 1.0 / j;
        }
        System.out.print("The sum from left to right is " + leftToRightSum +
                " and the sum from right to left is " + rightToLeftSum);
    }
}
