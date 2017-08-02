/**
 * Created by Administrator on 2017/7/14.
 */
public class FivePointThirteen {
    public static void main(String[] args) {
        int n = 1;
        int low = 1;
        while(n * n * n < 12000) {
            low = n;
            n++;
        }
        System.out.print("The max integer is " + low);
    }
}
