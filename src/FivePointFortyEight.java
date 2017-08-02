/**
 * Created by Administrator on 2017/7/21.
 */
import java.util.Scanner;
public class FivePointFortyEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String user = input.nextLine();
        int number = user.length();

        char[] every = new char[number];
        for(int i = 0; i < number; i++) {
            every[i] = user.charAt(i);
            if(i % 2 == 0) {
                System.out.print(every[i]);
            }

        }
    }
}
