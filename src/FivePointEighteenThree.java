/**
 * Created by Administrator on 2017/7/14.
 */
public class FivePointEighteenThree {
    public static void main(String[] args) {
        for(int i = 1; i <= 6; i++) {
            for(int j = 6 - i; j > 0; j--) {
                System.out.print("  ");
            }
            for(int k = i; k >= 1; k--) {
                System.out.print(k +" ");
            }
            System.out.print("\n");
        }
    }
}
