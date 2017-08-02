import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/30.
 */
public class ThreePointFive_Ziyi {
    private static final String [] WEEK = new String[] {
            "Sunday",
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday"
    };

    /**
     *
     * @param today
     * @param offset
     * @return a string array that first is today' day, and second is offset's day
     */
    public String[] solve(int today, int offset) {
        return new String[] {WEEK[today%7], WEEK[(today+ offset)%7]};
    }

    public static void main(String[] args) {
        ThreePointFive_Ziyi question = new ThreePointFive_Ziyi();
        //input
        Scanner sin = new Scanner(System.in);
        System.out.print("Enter today's day:");
        int today = sin.nextInt();
        System.out.print("Enter the number of days elasped since today:");
        int offset = sin.nextInt();
        String [] result = question.solve(today, offset);
        System.out.println(
                String.format("Today is %s and the future day is %s",
                result[0],
                result[1]));
    }
}
