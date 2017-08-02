/**
 * Created by Administrator on 2017/7/25.
 */
public class SixPointNine {
    public static void main(String[] args) {
        System.out.printf("%2s%8s%19s%9s","\u82f1\u5c3a","\u7c73", "\u7c73","\u82f1\u5c3a");
        System.out.print("\n_____________________________________________\n");
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%4.1f%10.3f%20.1f%10.3f",i * 1.0, footToMeter(i * 1.0), (15.0 + i * 5), meterToFoot(15.0 + i * 5));
            System.out.println();
        }
    }
    public static double footToMeter(double foot) {
        double result = 0.305 * foot;
        return result;
    }
    public static double meterToFoot(double meter) {
        double result = 3.279 * meter;
        return result;
    }
}
