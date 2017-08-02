/**
 * Created by Administrator on 2017/6/21.
 */
import java.util.Scanner;
public class TwoPointEight {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int time = input.nextInt();
        if(time > 12 && time <-12){
            System.out.println("wrong time zone");
        }
        else{
            long totalMillisecond = System.currentTimeMillis();
            long totalSeconds = totalMillisecond / 1000;
            long totalMinutes = totalSeconds / 60;
            long currentSeconds = totalSeconds % 60;
            long totalHours = totalMinutes /60;
            long currentMinutes = totalMinutes % 60;
            long hours = totalHours % 24;
            long currentHours = hours + time;
            if(currentHours < 0){
                currentHours += 24;
            }
            else{
            }
            System.out.print("The current time is " + currentHours + " : " + currentMinutes +
              " : " + currentSeconds);
        }
    }
}
