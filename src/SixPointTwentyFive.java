/**
 * Created by Administrator on 2017/7/27.
 */
import java.util.Scanner;
public class SixPointTwentyFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter milliseconds: ");
        long milliseconds = input.nextLong();
        System.out.print(convertMillis(milliseconds));
    }
    public static String convertMillis(long millis) {
        long totalSeconds = millis / 1000;
        long seconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long minutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long hours = totalHours % 24;
        return "" + hours + " : " + minutes + " : " + seconds;
    }
}
