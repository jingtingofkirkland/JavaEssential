/**
 * Created by Administrator on 2017/7/7.
 */
import java.util.Scanner;
public class FourPointFifteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String stringletter = input.next();
        String upperstringletter = stringletter.toUpperCase();
        char letter = upperstringletter.charAt(0);
        if(letter >= 'A' && letter <= 'Z') {
            final String[] corresponding = {
                    "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"
            };
            for(int i = 0; i < 8; i++) {
                if(corresponding[i].contains(upperstringletter)) {
                    System.out.print("The corresponding number is " + (i + 2));
                }
            }
        }
        else {
            System.out.print(stringletter + " is an invalid input");
        }
    }
}
