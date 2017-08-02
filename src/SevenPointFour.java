/**
 * Created by Administrator on 2017/7/29.
 */
public class SevenPointFour {
    private static final int LENGTH = 100 + 1;
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the scores: ");
        int highCount = 0;
        int count = 0;
        int sum = 0;
        int[] user = new int[LENGTH]; //by default it is zero.
        int in = 0;
        while(true) {
            in = input.nextInt();
            if(in == -1)
                break;
            user[in]++;
            count++;
        }
        // Sum = Sigma(i*user[i])
        for(int i = 0; i < LENGTH; i++) {
                sum += i * user[i];
        }
        double average = (double)sum / count;
        for(int j = 0; j < LENGTH; j++) {
            if(j >= average) highCount += user[j];
        }
        System.out.print("There is " + highCount + " scores high or equal to average, " +
                (count - highCount) + " scores lower than average");
    }
}
