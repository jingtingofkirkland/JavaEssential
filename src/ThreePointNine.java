/**
 * Created by Administrator on 2017/6/29.
 */
import java.util.Scanner;
public class ThreePointNine {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int[] a = new int[10];
        int sum = 0;
        for(int i = 0; i < 9; i++){
            a[i] = input.nextInt();
            sum += a[i] * (i + 1);
        }
        System.out.print("The ISBN-10 number is ");
        for(int i = 0; i < 9; i++){
            System.out.print(a[i]);
        }
        a[9] = sum % 11;
        if(a[9] == 10){
            System.out.print("X");
        }
        else{
            System.out.print(a[9]);
        }
    }
}
