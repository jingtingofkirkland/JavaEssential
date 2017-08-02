/**
 * Created by Administrator on 2017/7/20.
 */
public class FivePointFortyThree {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1; i < 7; i++) {
            for(int j = 2; j <= 7; j++) {
                if(j > i) {
                    System.out.println(i + " " + j);
                    count++;
                }
            }
        }
        System.out.print("The total number of all combination is " + count);
    }
}
