/**
 * Created by Administrator on 2017/7/26.
 */
public class SixPointFourteen {
    public static void main(String[] args) {
        System.out.printf("%2s%12s", "i", "m(i)");
        System.out.println("\n________________");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-3d%12.4f", (1 + 100 * i), sum(1 + 100 * i));
            System.out.println();
        }
    }
    public static double sum(double num) {
        double result = 0;
        for(int i = 1; i <= num; i++) {
            result += 4 * (Math.pow(-1, i + 1) / (2 * i - 1.0));
        }
        return result;
    }
}
