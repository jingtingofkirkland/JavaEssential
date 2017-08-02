/**
 * Created by Administrator on 2017/8/2.
 */
public class SevenPointSix {
    private static final int COUNT = 50;
    public static void main(String[] args) {

        int[] prime = new int[COUNT];
        prime[0] = 2;
        int i = 1;
        int n = 3;
        boolean isPrime = true;
        while(i < 50) {
            for(int j = 0; j < i; j++) {
                if(prime[j] <= Math.sqrt(n) && n % prime[j] == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                prime[i] = n;
                i++;
            }
            n++;
            isPrime = true;
        }
        for(int j = 0; j < 50; j++) {
            if((j + 1) % 10 == 0) System.out.println();
            else System.out.print(prime[j] + " ");
        }
    }
}
