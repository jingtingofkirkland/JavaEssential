/**
 * Created by Administrator on 2017/7/29.
 */
public class SevenPointThree {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100: ");
        int[] user = new int[101];
        for(int i = 0; i <= 100; i++) {
            user[i] = 0;
        }
        int i = 0;
        do {
           i = input.nextInt();
           user[i]++;
        } while(i != 0);

        for(i = 1; i <= 100; i++) {
            if(user[i] != 0)
            System.out.println(i + " occurs " + user[i] + frequency(user[i]));
        }
    }
    public static String frequency(int count) {
        String result = "";
        if(count == 1) result = "time";
        else result = "times";
        return result;
    }
}
