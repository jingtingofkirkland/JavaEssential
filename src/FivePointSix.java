/**
 * Created by Administrator on 2017/7/13.
 */
public class FivePointSix {
    public static void main(String[] args) {
        System.out.printf("%-20s%-20s%-20s%-20s\n", "\u82f1\u91cc", "\u5343\u7c73",
                "\u5343\u7c73", "\u82f1\u91cc");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-20d%-20.3f%-20d%-20.3f\n", (i + 1), (i + 1) * 1.609,
                    (20 + 5 * i), (20 + 5 * i) / 1.609);
        }
    }
}
