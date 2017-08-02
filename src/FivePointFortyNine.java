/**
 * Created by Administrator on 2017/7/21.
 */
import java.util.Scanner;
public class FivePointFortyNine{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String user = input.nextLine();
        final String vowel = "AEIOU";
        String userUpperCase = user.toUpperCase();
        int letterNumber = 0;
        int vowelNumber = 0;
        String[] everyString = new String[user.length()];
        char[] everyChar = new char [user.length()];
        for(int i = 0; i < user.length(); i++) {
            everyChar[i] = userUpperCase.charAt(i);
            everyString[i] = "" + everyChar[i];
            if (Character.isUpperCase(everyChar[i])) {
                letterNumber++;
            }
            if (vowel.contains(everyString[i])) {
                vowelNumber++;
            }

        }
        System.out.print("The number of vowels is " + vowelNumber +
                "\nThe number of consonants is " + (letterNumber - vowelNumber));
    }
}
