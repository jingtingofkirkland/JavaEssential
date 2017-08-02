import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/21.
 */
import java.util.Scanner;
public class FivePointFifty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String user = input.nextLine();
        char[] every = new char[user.length()];
        int number = 0;
        for(int i = 0; i < user.length(); i++) {
            every[i] = user.charAt(i);
            if(Character.isUpperCase(every[i])) {
                number++;
            }
        }
        System.out.print("The number of uppercase letters is " + number);
    }
}
