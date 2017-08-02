/**
 * Created by Administrator on 2017/7/20.
 */
public class FivePointForty {
    public static void main(String[] args) {
        int positiveCount = 0;
        int oppositeCount = 0;
        for(int i = 1; i <= 1000000; i++) {
            int side = (int)(Math.random() * 2);
            if(side == 0) {
                oppositeCount++;
            }
            else {
                positiveCount++;
            }
        }
        System.out.print("The count of positive side is " + positiveCount +
        "\nThe count of opposite side is " + oppositeCount);
    }
}
