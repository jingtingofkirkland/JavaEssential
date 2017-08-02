/**
 * Created by Administrator on 2017/6/30.
 */
import java.util.Scanner;
public class ThreePointSeventeen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int random = (int)((Math.random() * 10) / 4);
        System.out.print("Enter scissor(0), rock(1), paper(2): ");
        int guess = input.nextInt();
        final String[] game = new String[] {
                "scissor",
                "rock",
                "paper"
        };
        System.out.print("The computer is " + game[random] + ". " + "You are " +
                game[guess]);
        if(random == 0 && guess == 1
                || random == 2 && guess == 0
                || random == 1 && guess == 2) {
            System.out.print(". You lose");
        }
        else if(random == guess) {
            System.out.print(" too. It is a draw");
        }
        else{
            System.out.print(". You won");
        }
    }
}
