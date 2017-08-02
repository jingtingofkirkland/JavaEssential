/**
 * Created by Administrator on 2017/7/14.
 */
public class FivePointNineteen {
    public static void main(String[] args) {
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 7 - i; j++){
                System.out.print("    ");
            }
            for(int k = 0; k < i + 1; k++) {
                System.out.print((int)Math.pow(2, k) + "   ");
            }
            for(int p = i - 1; p >= 0; p--) {
                System.out.print((int)Math.pow(2, p) + "   ");
            }
            System.out.print("\n");
        }
    }
}
