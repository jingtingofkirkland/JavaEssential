/**
 * Created by Administrator on 2017/7/26.
 */
import java.util.Scanner;
public class SixPointEighteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a code: ");
        String user = input.nextLine();
        if(eightChar(user) && onlyCaseAndDigit(user) && twoDigit(user) == true) {
            System.out.print("Valid Password");
        }
        else {
            System.out.print("InValid Password");
        }
    }
    public static boolean eightChar(String test) {
        boolean result = false;
        if(test.length() >= 8) {
            result = true;
        }
        return result;
    }
    public static boolean onlyCaseAndDigit(String test) {
        boolean result = true;
        char[] every = new char[test.length()];
        for(int i = 0; i < test.length(); i++) {
            every[i] = test.charAt(i);
            if(Character.isLetterOrDigit(every[i]) == false) {
                result = false;
            }
        }
        return result;
    }
    public static boolean twoDigit(String test) {
        boolean result = false;
        int count = 0;
        char[] every = new char[test.length()];
        for(int i = 0; i < test.length(); i++) {
            every[i] = test.charAt(i);
            if(Character.isDigit(every[i]) == true) {
                count++;
            }
        }
        if(count >= 2) {
            result = true;
        }
        return result;
    }
}
