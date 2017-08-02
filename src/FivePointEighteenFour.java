/**
 * Created by Administrator on 2017/7/14.
 */
public class FivePointEighteenFour {
    public static void main(String[] args) {
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for(int k = 0; k < 6 - i; k++) {
                System.out.print((k + 1) + " ");
            }
            System.out.print("\n");
        }
    }
}
