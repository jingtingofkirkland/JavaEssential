/**
 * Created by Administrator on 2017/8/2.
 */
public class SevenPointEleven {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] user = new double[10];
        for(int i = 0; i < 10; i++) {
            user[i] = input.nextDouble();
        }
        System.out.println("The mean is " + mean(user));
        System.out.println("The standard deviation is " + deviation(user));
    }
    public static double mean(double[] array) {
        double mean = 0;
        double sum = 0;
        for(int i = 0; i < 10; i++) {
            sum += array[i];
        }
        return mean = sum / 10.0;
    }
    public static double deviation(double[] array) {
        double result = 0;
        double sum = 0;
        for(int i = 0; i < 10; i++) {
            sum += Math.pow(array[i] - mean(array), 2);
        }
        return result = Math.sqrt(sum / (10.0 - 1));
    }
}
