import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/13.
 */
import java.util.Scanner;
public class FivePointNine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int number = input.nextInt();
        System.out.print("Enter the name and score of students: ");
        String[] name = new String[number];
        String nameHightest = input.next();
        double[] score = new double[number];
        double scoreHightest = input.nextDouble();
        String nameSecond = input.next();
        double scoreSecond = input.nextDouble();
        for(int i = 0; i < number - 2; i++) {
            name[i + 2] = input.next();
            score[i +2] = input.nextDouble();
            if(score[i + 2] > scoreSecond) {
                scoreSecond = score[i + 2];
                nameSecond = name[i + 2];
            }
            double scoreMiddle;
            String nameMiddle;
            if(scoreSecond > scoreHightest) {
                scoreMiddle = scoreHightest;
                scoreHightest = scoreSecond;
                scoreSecond = scoreMiddle;
                nameMiddle = nameHightest;
                nameHightest = nameSecond;
                nameSecond = nameMiddle;
            }
        }
        System.out.print("The name of hightest score student is " + nameHightest +
                "\nThe name of second hight score student is " + nameSecond);
    }
}
