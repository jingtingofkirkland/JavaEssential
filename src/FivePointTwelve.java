/**
 * Created by Administrator on 2017/7/14.
 */
public class FivePointTwelve {
    public static void main(String[] args) {
        int n = 12000;
        int low = 1;
        while(n * n > 12000) {
            low = n;
            n--;
        }
        System.out.print("The min integer is " + low);
    }
}
