/**
 * Created by Administrator on 2017/7/27.
 */
import java.util.Scanner;
public class SixPointTwentyThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String user = input.nextLine();
        System.out.print("Enter a char: ");
        String containLetter = input.next();
        char letter = containLetter.charAt(0);
        System.out.print("The count of " + letter + " letter appears time is " + count(user, letter));
    }
    public static int count(String str, char a) {
        int count = 0;
        char[] every = new char[str.length()];
        for(int i = 0; i < str.length(); i++) {
            every[i] = str.charAt(i);
            if(every[i] == a) {
                count++;
            }
        }
        return count;
    }
}
