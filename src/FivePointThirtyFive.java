/**
 * Created by Administrator on 2017/7/20.
 */
public class FivePointThirtyFive {
    public static void main(String[] args) {
        double sum = 0;
        for(int i = 1; i <= 624; i++) {
            sum += 1.0 / (Math.sqrt(i) + Math.sqrt(i + 1));
        }
        System.out.print(sum);
     }
}
