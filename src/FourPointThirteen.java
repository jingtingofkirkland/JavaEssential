/**
 * Created by Administrator on 2017/7/6.
 */
import java.util.Scanner;
public class FourPointThirteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String letter = input.nextLine();
        char upletter = Character.toUpperCase(letter.charAt(0));
        if(upletter > 'Z' || upletter < 'A') {
            System.out.println(letter + " is an invalid input");
            System.exit(1);
        }
        final String vowel = "AEIOU";
        String stringupletter = upletter + "";
        if(vowel.contains(stringupletter)) {
            System.out.print(letter + " is a vowel");
        }
        else {
            System.out.print(letter + " is a consonant");
        }
    }
}
