/**
 * Created by Administrator on 2017/6/12.
 */
public class OnePointThirteen {
    public static void main(String[] args){
        double a = 3.4;
        double b = 50.2;
        double e = 44.5;
        double c, d, f;
        c = 2.1;
        d = 0.55;
        f = 5.9;
        double x, y;
        x = (e*d - b*f)/(a*d - b*c);
        y = (a*f - e*c)/(a*d - b*c);
        System.out.println("x = "+ x + "\n" + "y = " + y);
    }
}
