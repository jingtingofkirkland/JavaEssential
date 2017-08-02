/**
 * Created by Administrator on 2017/6/12.
 */
public class OnePointTwelve {
    public static void main(String[] args){
        int second = 35;
        double minute = 40 + second / 60;
        double hour = 1 + minute / 60;
        double change = 1.6;
        double s = 24 * change;
        double v = s / hour;
        System.out.println("the velocty is " + v);

    }
}
