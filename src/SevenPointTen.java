/**
 * Created by Administrator on 2017/8/2.
 */
public class SevenPointTen {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] user = new double[10];
        for (int i = 0; i < 10; i++) {
            user[i] = input.nextDouble();
        }
        System.out.print("The minimum number's index is: " + indexOfSmallestElement(user));
    }
    public static int indexOfSmallestElement(double[] array) {
        double smallest = array[0];
        int index = 0;
        for(int i = 1; i < 10; i++) {
            if(array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
}
