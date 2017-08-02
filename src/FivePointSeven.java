/**
 * Created by Administrator on 2017/7/13.
 */
public class FivePointSeven {
    public static void main(String[] args) {
        final double tuition = 10000;
        final double rate = 0.05;
        double tenyearsTuition = tuition * Math.pow((1 + rate), 10);
        System.out.print("The tuition after ten years is " + tenyearsTuition);
        double sumTuition = tenyearsTuition;
        for(int i = 0; i < 3; i++) {
            sumTuition += tenyearsTuition * Math.pow((1 + rate), (i + 1));
        }
        System.out.print("The total tuition for four years after ten years is " + sumTuition);
    }
}
