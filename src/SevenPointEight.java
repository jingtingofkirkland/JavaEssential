/**
 * Created by Administrator on 2017/8/2.
 */
public class SevenPointEight {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter ten double numbers: ");
        double[] user = new double[10];
        for(int i = 0; i < 10; i++) {
            user[i] = input.nextDouble();
        }
        System.out.print("The average is " + average(user));
    }
    public static int average(int[] array) {
        int result = 0;
        int sum = 0;
        for(int i = 0; i < 10; i++) {
            sum += array[i];
        }
        result = sum / 10;
        return result;
    }
    public static double average(double[] array) {
        double result = 0;
        double sum = 0;
        for(int i = 0; i < 10; i++) {
            sum += array[i];
        }
        result = sum / 10.0;
        return result;
    }
}
