/**
 * Created by Administrator on 2017/7/7.
 */
public class FourPointTwentyfive {
    public static void main(String[] args) {
        int a = 90 - (int)(Math.random() * 26);
        int b = 90 - (int)(Math.random() * 26);
        int c = 90 - (int)(Math.random() * 26);
        int d = (int)(Math.random() * 10);
        int e = (int)(Math.random() * 10);
        int f = (int)(Math.random() * 10);
        int g = (int)(Math.random() * 10);
        System.out.print("The number is " + (char)a + (char)b + (char)c + d + e + f + g);
    }
}
