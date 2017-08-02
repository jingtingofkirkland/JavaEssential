/**
 * Created by Administrator on 2017/7/29.
 */
public class SevenPointTwo {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter ten integers: ");
        int[] user = new int[10];
        for(int i = 0; i < 10; i++) {
            user[i] = input.nextInt();
        }
        System.out.println("The reverse is :");
        for(int j = 9; j >= 0; j--) {
            System.out.print(user[j] + " ");
        }
    }
}
