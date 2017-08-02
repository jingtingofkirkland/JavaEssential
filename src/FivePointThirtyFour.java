import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/20.
 */
import java.util.Scanner;
public class FivePointThirtyFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final String[] game = new String[] {
                "scissor",
                "rock",
                "paper"
        };
        int userWin = 0;
        int computerWin = 0;
        while(userWin < 3 && computerWin < 3) {
            int random = (int)((Math.random() * 10) / 4);
            System.out.print("Enter scissor(0), rock(1), paper(2): ");
            int guess = input.nextInt();

            System.out.print("The computer is " + game[random] + ". " + "You are " +
                    game[guess]);
            if(random == 0 && guess == 1
                    || random == 2 && guess == 0
                    || random == 1 && guess == 2) {
                System.out.println(". You lose");
                computerWin++;
            }
            else if(random == guess) {
                System.out.println(" too. It is a draw");
            }
            else{
                System.out.println(". You won");
                userWin++;
            }
        }

    }
}
