/**
 * Created by Administrator on 2017/7/28.
 */
public class SixPointThirtyTwo {
    public static void main(String[] args) {
        int winTime = 0;
        for(int i = 0; i < 1000; i++) {
            if(ifWin()) {
                winTime++;
            }
        }
        System.out.print("\nThe times of win is " + winTime);
    }
    public static boolean ifWin() {
        boolean win = false;
        int user1 = (int)(Math.random() * 6 + 1);
        int user2 = (int)(Math.random() * 6 + 1);
        int userSum = user1 + user2;
        if(userSum == 2 || userSum == 3 || userSum == 12) {
            System.out.print("You rolled " + user1 + " + " + user2 + " = " + userSum +
                    "\nYou win");
            win = true;
        }
        else if(userSum == 2 || userSum == 7) {
            System.out.print("You rolled " + user1 + " + " + user2 + " = " + userSum +
                    "\nYou lose");
        }
        else {
            System.out.println("You rolled " + user1 + " + " + user2 + " = " + userSum +
                    "\nPoint is " + userSum);
            int test = userSum;
            int userSumAgain = 0;
            int user1Again = 0;
            int user2Again = 0;
            do {
                user1Again = (int)(Math.random() * 6 + 1);
                user2Again = (int)(Math.random() * 6 + 1);
                userSumAgain = user1Again + user2Again;
                test = userSumAgain;
            } while(userSumAgain != 7  && userSumAgain != test);
            if(userSumAgain == 7) {
                System.out.print("You rolled " + user1Again + " + " + user2Again +
                        " = 7" + "\nYou lose");
            }
            else if(userSumAgain == test) {
                System.out.print("You rolled " + user1Again + " + " + user2Again +
                        " = " + userSumAgain + "\nYou win");
                win = true;
            }
        }
        return win;
    }
}
