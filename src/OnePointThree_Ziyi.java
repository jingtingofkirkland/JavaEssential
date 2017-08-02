/**
 * Created by Administrator on 2017/6/30.
 */
public class OnePointThree_Ziyi {
    private static String[][] CHARACTERS = {
            {
                    "   *   ",
                    "  * *  ",
                    " ***** ",
                    "*     *",
            },
            {},{},{},{},{},{},{},{}, //B-I
            {
                    "      *",
                    "      *",
                    " *    *",
                    "  *  * "
            },
            {},{},{},{},{},{},{},{},{},{},{},//K-U,
            {       "*     *",
                    " *   * ",
                    "  * *  ",
                    "   *   ",
            },
            {},{},{},{}
    };
    public static void main(String[] args) {
        String input = "JAVA";
        output(input.toCharArray());
    }
    public static void output(char[] in){
        for(int i=0;i<in.length;i++){
            String [] ch = CHARACTERS[in[i] - 'A'];
            for(int j=0;j<ch.length;j++){
                System.out.println(ch[j]);
            }
            System.out.println();
        }

    }
}
