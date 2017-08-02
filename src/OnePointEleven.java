/**
 * Created by Administrator on 2017/6/10.
 */
public class OnePointEleven {
    public static void main(String[] args){
        int addbirth = 7;
        int reducedead = 13;
        int addmove = 45;
        int base = 312032486;
        double time = 365 * 24 * 60 * 60;
        for(int i = 1; i < 6; i++){
            int sum = base + (int)(i * (time / addbirth - time / reducedead + time / addmove));
            System.out.println("the " + i +" year population is " + sum);
        }
    }
}
