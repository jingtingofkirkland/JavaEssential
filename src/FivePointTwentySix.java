/**
 * Created by Administrator on 2017/7/15.
 */
public class FivePointTwentySix {
    public static void main(String[] args) {
        //for(int k = 1; k <= 10; k++) {
        int k = 10;
        double e = 1.0;
        double item = 1.0;
        for (int i = 1; i < k * 10000; i++) {
            item = item / i;
            e += item;
            if (i % 10000 == 0) {
                System.out.println(String.format(i + "\t\t %.30f", e));
            }
        }

        //}
    }
}
