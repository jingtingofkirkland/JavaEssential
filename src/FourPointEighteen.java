/**
 * Created by Administrator on 2017/7/7.
 */
import java.util.Scanner;
public class FourPointEighteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String majorstate = input.next();
        char major = majorstate.charAt(0);
        char state = majorstate.charAt(1);
        final String comparemajor = "MCI";
        int majorindex = comparemajor.indexOf(major);
        final String[] majorarray = {"Mathematic", "Computer Science", "Information Technology"};
        final String[] statearray = {"Freshman", "Sophomore", "Junior", "Senior"};
        int stateindex = (int)state - 48 - 1;
        if(majorindex != -1 && stateindex >= 0 && stateindex <=3) {
            System.out.print(majorarray[majorindex] + " " + statearray[stateindex]);
        }
        else {
            System.out.print("Invalid input");
        }
    }
}
