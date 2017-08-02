/**
 * Created by Administrator on 2017/7/14.
 */
public class FivePointEightTwo {
    public static void main(String[] args) {
        for(int i = 1; i <= 6; i++) {
            for(int j = 1; j <= 7 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }
}
