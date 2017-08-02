/**
 * Created by Administrator on 2017/7/21.
 */
import java.util.Scanner;
public class FivePointFiftyOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String firstString = input.nextLine();
        System.out.print("Enter the second string: ");
        String secondString = input.nextLine();
        String commonPrefix = "";
        for(int i = 0; i < firstString.length(); i++) {
            String firstPrefix = firstString.substring(0, i + 1);
            if(secondString.startsWith(firstPrefix)) {
                commonPrefix = firstPrefix;
            }
        }
        if(commonPrefix.equals("")) {
            System.out.print(firstString + " and " + secondString + "have no common prefix");
        }
        else {
            System.out.print("The common prefix is " + commonPrefix);
        }
    }
}
