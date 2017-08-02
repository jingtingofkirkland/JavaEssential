/**
 * Created by Administrator on 2017/7/13.
 */
import java.util.Scanner;
public class FivePointEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int number = input.nextInt();
        System.out.print("Enter the name and score of students: ");
        String[] name = new String[number];
        String nameHightest = input.next();
        double[] score = new double[number];
        double scoreHightest = input.nextDouble();
        for(int i = 0; i < number - 1; i++) {
            name[i + 1] = input.next();
            score[i +1] = input.nextDouble();
            if(score[i +1] > scoreHightest) {
                scoreHightest = score[i + 1];
                nameHightest = name[i + 1];
            }
        }
        System.out.print("The name of hightest score student is " + nameHightest);
    }
}
