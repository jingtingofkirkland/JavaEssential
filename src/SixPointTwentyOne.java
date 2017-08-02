/**
 * Created by Administrator on 2017/7/26.
 */
import java.util.Scanner;
public class SixPointTwentyOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String user = input.nextLine();
        String upperUser = user.toUpperCase();
        char[] every = new char[user.length()];
        for(int i = 0; i <user.length(); i++) {
            every[i] = upperUser.charAt(i);
            if(getNumber(every[i]) == 0) {
                System.out.print(every[i]);
            }
            else {
                System.out.print(getNumber(every[i]));
            }

        }
    }
    public static int getNumber(char upperCaseLetter) {
        int result = 0;
        if(upperCaseLetter >= 'A' && upperCaseLetter <= 'Z') {
            final String[] corresponding = {
                    "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"
            };
            for(int i = 0; i < 8; i++) {
                if(corresponding[i].contains(upperCaseLetter + "")) {
                    result = i + 2;
                }
            }
        }
        return result;
    }
}
