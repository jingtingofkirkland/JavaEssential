/**
 * Created by Administrator on 2017/6/23.
 */
public class TwoPointEighteen {
    public static void main(String[] args){
        System.out.printf("%-10s%-10s%-10s\n","a","b","pow(a, b)");
        int [][] m = new int[5][3];
        for(int i = 0; i < 5; i++){
            m[i][0] = i + 1;
            m[i][1] = m[i][0] + 1;
            m[i][2] = (int)Math.pow(m[i][0], m[i][1]);
            System.out.printf("%-10s%-10s%-10s\n",m[i][0],m[i][1],m[i][2]);
            System.out.println(" ");
        }
    }
}
