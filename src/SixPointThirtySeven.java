/**
 * Created by Administrator on 2017/7/28.
 */
import java.util.Scanner;
public class SixPointThirtySeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.print("Enter the width: ");
        int width = input.nextInt();
        System.out.print(format(number,width));
    }
    public static String format(int num, int w) {
        String orign = "" + num;
        String result ="" + num;
        if(w > orign.length()) {
            for(int i = 0; i < w - orign.length(); i++) {
                result = "0" + result;
            }
        }
        return result;
    }
}

