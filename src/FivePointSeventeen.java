/**
 * Created by Administrator on 2017/7/14.
 */
import java.util.Scanner;
public class FivePointSeventeen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines between 1 and 15: ");
        int n = input.nextInt();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i - 1; j++){
                System.out.print("  ");
            }
            for(int k = i + 1; k > 0; k--) {
                System.out.print(k + " ");
            }
            for(int p = 2; p <= i + 1; p++) {
                System.out.print(p + " ");
            }
            System.out.print("\n");
        }
    }
}
