/**
 * Created by Administrator on 2017/7/28.
 */
public class SixPointTwentyNine {
    public static void main(String[] args) {
        for(int i = 2; i < 998; i++) {
            if(isPrime(i) && isPrime(i + 2)) {
                System.out.println("( " + i + ", " + (i + 2) + " )");
            }
        }
    }
    public static boolean isPrime(int test) {
        boolean isPrime = true;
        for (int i = 2; i <= test / 2; i++) {
            if (test % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
