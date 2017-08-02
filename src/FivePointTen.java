/**
 * Created by Administrator on 2017/7/14.
 */
public class FivePointTen {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 0; i < 901; i++) {
            if((100 + i) % 5 == 0 && (100 + i) % 6 == 0) {
                System.out.print((100 + i) + " ");
                count++;
                if(count % 10 == 0) {
                      System.out.print("\n");
                     }
            }
        }
    }
}
