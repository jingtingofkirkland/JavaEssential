import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/7.
 */
import java.util.Scanner;
public class FourPointNineteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String isbn = input.next();
        char[] isbnarray = new char[9];
        int[] isbndigit = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            isbnarray[i] = isbn.charAt(i);
            isbndigit[i] = (int) isbnarray[i] - 48;
            sum += isbndigit[i] * (i + 1);
        }
        int isbnten = sum % 11;
        if (isbnten == 10) {
            System.out.print("The ISBN-10 number is " + isbn + "X");
        } else {
            System.out.print("The ISBN-10 number is " + isbn + isbnten);
        }
    }
}
