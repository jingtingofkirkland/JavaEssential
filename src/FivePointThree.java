/**
 * Created by Administrator on 2017/7/13.
 */
public class FivePointThree {
    public static void main(String[] args) {
        System.out.printf("%-20s%-20s\n", "\u5343\u514b","\u78c5");
        for(int i = 0; i < 100; i++) {
            System.out.printf("%-20d%-20.1f\n", (2 * i + 1), (2 * i + 1) * 2.2);
        }
    }
}
