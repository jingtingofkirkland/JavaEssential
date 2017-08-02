/**
 * Created by Administrator on 2017/8/2.
 */
public class SevenPointTwelve{
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] user = new double[10];
        for(int i = 0; i < 10; i++) {
            user[i] = input.nextDouble();
        }
    }
}
