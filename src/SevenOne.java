/**
 * Created by Administrator on 2017/7/29.
 */
public class SevenOne {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int num = input.nextInt();
        System.out.print("Enter " + num + " scores: ");
        double[] scores = new double[num];
        double max = 0;
        for(int i = 0; i < num; i++) {
            scores[i] = input.nextDouble();
            if(scores[i] > max) {
                max = scores[i];
            }
        }
        for( int i = 0; i < num; i++) {
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " +
            grade(scores[i], max));
        }
    }
    public static String grade(double sco, double max) {
        String result = "";
        if(sco + 10 >= max) result = "A";
        else if(sco + 20 >= max) result = "B";
        else if(sco + 30 >= max) result = "C";
        else if(sco + 40 >= max) result = "D";
        else result = "F";
        return result;
    }
}
