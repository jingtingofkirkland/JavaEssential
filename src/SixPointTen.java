/**
 * Created by Administrator on 2017/7/25.
 */
public class SixPointTen {
    public static void main(String[] args) {
        int count = 2;
        for(int i = 3; i <= 10000; i++) {
            if(isPrime(i) == true) {
                count++;
            }
        }
        System.out.print("The number of prime under 10000 is " + count);
    }
    public static boolean isPrime(int number) {
        boolean result = true;
        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                result = false;
            }
        }
        return result;
    }
}
