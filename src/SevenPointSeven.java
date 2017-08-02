/**
 * Created by Administrator on 2017/8/2.
 */
public class SevenPointSeven {
    public static void main(String[] args) {
        int[] user = new int[10];
        int index = 0;
        for(int i = 0; i < 100; i++) {
            index = (int)(Math.random() * 10);
            user[index]++;
        }
        for(int i = 0; i < 10; i++) {
            System.out.println(i + " appears " + user[i] + " times");
        }
    }
}
