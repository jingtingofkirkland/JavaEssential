/**
 * Created by Administrator on 2017/7/2.
 */
public class ThreePointTwentyfour {
    public static void main(String[] args) {
        int number =(int)(Math.random() * 12);
        int colour = (int)(Math.random() * 4);
        final String[] NUM = new String[] {
                "Ace",
                "2",
                "3",
                "4",
                "5",
                "6",
                "7",
                "8",
                "9",
                "10",
                "Jack",
                "Queen",
                "King"
        };
        final String[] COL = new String[] {
                "clubs",
                "Diamonds",
                "Hearts",
                "Spades"
        } ;
        System.out.print("The card you picked is " + NUM[number] + " of " + COL[colour]);
    }
}
