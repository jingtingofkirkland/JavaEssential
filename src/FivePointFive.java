/**
 * Created by Administrator on 2017/7/13.
 */
public class FivePointFive {
    public static void main(String[] args) {
        System.out.printf("%-20s%-20s%-20s%-20s\n", "\u5343\u514b", "\u78c5", "\u78c5",
                "\u5343\u514b" );
        for(int i = 0; i < 100; i++) {
            System.out.printf("%-20d%-20.1f%-20d%-20.2f\n", (2 * i + 1), (2 * i + 1) * 2.2,
                    (20 + 5 * i), (20 + 5 * i) / 2.2) ;
        }
    }
}
