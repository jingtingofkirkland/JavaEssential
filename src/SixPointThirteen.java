/**
 * Created by Administrator on 2017/7/26.
 */
public class SixPointThirteen {
    public static void main(String[] args) {
        System.out.printf("%2s%12s", "i", "m(i)");
        System.out.println("\n________________");
        for(int i = 1; i <= 20; i++) {
            System.out.printf("%2d%12.4f", i, sum(i));
            System.out.println();
        }
    }
    public static double sum(int num) {
        double result = 0;
        for(int i = 1; i <= num; i++) {
            result += i / (i + 1.0);
        }
        return result;
    }
}
