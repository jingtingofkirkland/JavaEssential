/**
 * Created by Administrator on 2017/6/22.
 */
import java.util.Scanner;
public class TwoPointEleven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();
        int totalseconds = years * 365 * 24 * 60 * 60;
        int born = totalseconds / 7;
        int death = totalseconds / 13;
        int immigrant = totalseconds / 45;
        int population = 312032486 + born + immigrant - death;
        System.out.print("The population in " + years + " is " + population);
    }
}
