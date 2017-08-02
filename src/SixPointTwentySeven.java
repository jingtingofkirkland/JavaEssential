/**
 * Created by Administrator on 2017/7/28.
 */
public class SixPointTwentySeven {
    public static void main(String[] args) {
        int count = 0;
        int prime = 2;
        while(count <= 100) {
            if(isPrime(prime) && (!isPalindrome(reverse(prime), prime)) && isPrime(reverse(prime))) {
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
        for (int i = 2; i <= test / 2; i++) {
            if (test % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static int reverse(int test) {
        String first = "" + test;
        String second = "";
        int[] everyDigit = new int[first.length()];
        for(int i = 0; i < first.length(); i++) {
            everyDigit[i] = test % 10;
            test /= 10;
            second += everyDigit[i];
        }
        return Integer.parseInt(second);
    }
    public static boolean isPalindrome(int reverse, int prime) {
        return reverse == prime;
    }
}
