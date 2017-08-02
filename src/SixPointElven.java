/**
 * Created by Administrator on 2017/7/25.
 */
import java.util.Scanner;
public class SixPointElven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter  the first char: ");
        String firstString = input.next();
        char firstChar = firstString.charAt(0);
        System.out.print("Enter  the second char: ");
        String secondString = input.next();
        char secondChar = secondString.charAt(0);
        System.out.print("Enter  the number per line: ");
        int number = input.nextInt();
        printChars(firstChar, secondChar, number);
    }
    public static void printChars(char ch1, char ch2, int numberPerLine) {
        int count = 0;
        for(char i = ch1; i <= ch2; i++) {
            System.out.print(i + " ");
            count++;
            if(count % numberPerLine == 0) {
                System.out.println();
            }
        }
    }
}
