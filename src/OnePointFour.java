/**
 * Created by Administrator on 2017/6/1.
 */
public class OnePointFour {
    public static void main(String[] args) {
        System.out.printf("%-6s%-6s%-6s\n", "a", "a^2", "a^3");
        int[][] a = new int[4][3];
        for(int i = 0; i < 4; i++){
            a[i][0] = i+1;
            a[i][1] = a[i][0] * a[i][0];
            a[i][2] = a[i][0] * a[i][0] * a[i][0];
            for (int j = 0; j < 3; j++){
                System.out.printf("%-6s", a[i][j]);
            }
            System.out.println(" ");
        }
    }
}
