/**
 * Created by Administrator on 2017/6/28.
 */
import java.util.Scanner;
public class ThreePointFive {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int today = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int number = input.nextInt();
        int future = (number + today) % 7;
        switch(today){
            case 0: System.out.print("Today is Sunday ");
                    break;
            case 1: System.out.print("Today is Monday ");
                    break;
            case 2: System.out.print("Today is Tuesday ");
                    break;
            case 3: System.out.print("Today is Wednesday ");
                    break;
            case 4: System.out.print("Today is Thurday ");
                    break;
            case 5: System.out.print("Today is Friday ");
                    break;
            case 6: System.out.print("Today is Saturday ");
                    break;
        }
        switch(future){
            case 0: System.out.print("and the future day is Sunday ");
                break;
            case 1: System.out.print("and the future day is Monday ");
                break;
            case 2: System.out.print("and the future day is Tuesday ");
                break;
            case 3: System.out.print("and the future day is Wednesday ");
                break;
            case 4: System.out.print("and the future day is Thurday ");
                break;
            case 5: System.out.print("and the future day is Friday ");
                break;
            case 6: System.out.print("and the future day is Saturday ");
                break;
        }
    }
}
