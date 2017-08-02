/**
 * Created by Administrator on 2017/7/21.
 */
import java.util.Scanner;
public class FivePointFortyFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int user = input.nextInt();
        int[] every = new int[16];
        for(int i = 0; i < 16; i++) {
            int test = 1;
            every[i] = test & user;
            user = user >> 1;
        }
        for(int i = 15; i >= 0; i--) {
            System.out.print(every[i]);
        }
    }
}
