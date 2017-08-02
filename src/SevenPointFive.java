/**
 * Created by Administrator on 2017/8/2.
 */
public class SevenPointFive {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int[] user = new int[10];
        int count = 1;
        user[0] = input.nextInt();
        for(int i = 1; i < 10; i++) {
            user[i] = input.nextInt();
            count++;

            for(int j = 0; j < i; j++) {
                if(user[i] == user[j]) {
                    i--;
                    count--;
                    break;
                }
                System.out.print(user[i]);
            }
        }
        System.out.print("The number of distinct number is " + count +
                "\nThe distinct numbers are " );
        for(int i = 0; i < count; i++) {
            System.out.print(user[i] + " ");
        }
    }
}
