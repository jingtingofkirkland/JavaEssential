/**
 * Created by Administrator on 2017/6/30.
 */
import java.util.Scanner;
public class ThreePointFifteen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int lottery = (int)(Math.random() * 1000);
        System.out.println("lottery is " + lottery);
        int a = lottery % 10;
        int mid = lottery / 10;
        int b = mid % 10;
        mid = mid / 10;
        int c = mid % 10;
        System.out.print("Enter a three-digit number: ");
        int inlottery = input.nextInt();
        int ina = inlottery % 10;
        int inmid = inlottery / 10;
        int inb = inmid % 10;
        inmid = inmid / 10;
        int inc = inmid % 10;
        if(inlottery == lottery){
            System.out.print("You won $10000");
        }
        else if(a == ina && b == inc && c == inb
                || b == inb && a == inc && c == ina
                || c == inc && a == inb && b == ina
                || a == inb && b == inc && c == ina
                || a == inc && b == ina && c == inb){
            System.out.print("You won $3000");
        }
        else if(a == ina && b != inb && c != inc && b != inc && c != inb
                || a == inb && b != ina && b != inc && c != ina && c != inc
                || a == inc && b != ina && b != inb && c != ina && c != inb
                || b == ina && a != inb && a != inc && c != inb && c != inc
                || b == inb && a != ina && a != inc && c != ina && c != inc
                || b == inc && a != ina && a != inb && c != ina && c != inb
                || c == ina && a != inb && a != inc && b != inb && b != inc
                || c == inb && a != ina && a != inc && c != ina && c != inc
                || c == inc && a != ina && a != inb && b != ina && b != inb){
            System.out.print("You won $1000");
        }
        else{
            System.out.print("No money");
        }
    }
}
