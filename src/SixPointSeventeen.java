/**
 * Created by Administrator on 2017/7/26.
 */
import java.util.Scanner;
public class SixPointSeventeen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int user = input.nextInt();
        printMatrix(user);
    }
    public static void printMatrix(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print((int)(Math.random() * 2) + " ");
            }
            System.out.println();
        }
    }
}
