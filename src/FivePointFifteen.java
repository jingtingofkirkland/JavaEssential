/**
 * Created by Administrator on 2017/7/14.
 */
public class FivePointFifteen {
    public static void main(String[] args) {
        int count = 0;
        char a = '\u0021';
        for(int i = 0; i < 94; i++) {
            System.out.print(a++ + " ");
            count++;
            if(count % 10 == 0) {
                System.out.print("\n");
            }
        }
    }
}
