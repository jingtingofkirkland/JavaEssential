/**
 * Created by Administrator on 2017/7/15.
 */
public class FivePointTwentySeven {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 101; i <= 2100; i++) {
            if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.print(i + " ");
                count++;
                if(count % 10 ==0) {
                    System.out.println("");
                }
            }
        }
        System.out.print("\nThe number of leap years is " + count);
    }
}
