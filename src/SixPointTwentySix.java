/**
 * Created by Administrator on 2017/7/28.
 */
public class SixPointTwentySix {
    public static void main(String[] args) {
        int count = 0;
        int prime = 2;
        while(count <= 100) {
            if(isPrime(prime) && isPalindrome(prime)) {
                System.out.print(prime + " ");
                count++;
                if(count % 10 == 0) {
                    System.out.println();
                }
            }
            prime++;
        }
    }
    public static boolean isPrime(int test) {
        boolean isPrime = true;
        for(int i = 2; i <= test / 2; i++) {
            if (test % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static boolean isPalindrome(int test) {
        boolean isPalindrome = false;
        int origin = test;
        String first = "" + test;
        String second = "";
        int[] everyDigit = new int[first.length()];
        for(int i = 0; i < first.length(); i++) {
            everyDigit[i] = test % 10;
            test /= 10;
            second += everyDigit[i];
        }
        int reversr = Integer.parseInt(second);
        if(origin == reversr) {
            isPalindrome = true;
        }
        return isPalindrome;
    }
}
