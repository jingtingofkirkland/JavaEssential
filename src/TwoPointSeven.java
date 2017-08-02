/**
 * Created by Administrator on 2017/6/16.
 */
import java.util.Scanner;
public class TwoPointSeven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();
        if(minutes < 0){
            System.out.println("wrong number");
        }
        else{
            int totaldays = minutes /(60 * 24);
            int days = totaldays % 365;
            int years = totaldays / 365;
            System.out.print(minutes + " minutes is approximately " + years +
            " years and " + days +" days");
        }
    }
}
