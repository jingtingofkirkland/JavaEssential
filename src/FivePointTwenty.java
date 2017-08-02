/**
 * Created by Administrator on 2017/7/14.
 */
public class FivePointTwenty {
    public static void main(String[] args) {
        int count = 0;
        boolean isPrime = true;
        for(int i = 2; i <= 2000; i++) {
            for(int j = 2; j <= i / 2; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.print(i + " ");
                count++;
                if(count % 8 == 0) {
                    System.out.print("\n");
                }
            }
            isPrime = true;

        }
    }
}
