/**
 * Created by Administrator on 2017/7/28.
 */
public class SixPointTwentyEight {
    public static void main(String[] args) {
        System.out.println("p\t\t2^p-1");
        System.out.println("______________");
        for(int p = 2; p <= 31; p++) {
            int num = (int)(Math.pow(2, p)) - 1;
            if(isPrime(num)) {
                System.out.println(p + "\t\t" + num);
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
