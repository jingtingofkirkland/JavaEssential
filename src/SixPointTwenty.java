/**
 * Created by Administrator on 2017/7/26.
 */
import java.util.Scanner;
public class SixPointTwenty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a code: ");
        String user = input.nextLine();
        System.out.print("The case number is " + countLetters(user));
    }
    public static int countLetters(String test) {
        int count = 0;
        char[] every = new char[test.length()];
        for(int i = 0; i < test.length(); i++) {
            every[i] = test.charAt(i);
            if(Character.isLetter(every[i]) == true) {
                count++;
            }
        }
        return count;
    }
}
