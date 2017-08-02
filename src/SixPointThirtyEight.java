/**
 * Created by Administrator on 2017/7/28.
 */
public class SixPointThirtyEight {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            System.out.print(getRandomUpperCaseLetter() + " ");
            if((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
        for(int j = 0; j < 100; j++) {
            System.out.print(getRandomDigitCharacter() + " ");
            if((j + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
    public static char getRandomCharacter(char ch1, char ch2) {
            return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }
    public static char getRandomUpperCaseLetter() {
            return getRandomCharacter('A', 'Z');
    }
    public static char getRandomDigitCharacter() {
            return getRandomCharacter('0', '9');
    }
}
