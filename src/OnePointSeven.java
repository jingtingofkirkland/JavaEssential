/**
 * Created by Administrator on 2017/6/2.
 */
public class OnePointSeven {
    public static void main(String[] args){
        double a = 0;
        double b = 0;
        int i;
        for(i = 1; i < 12; i=i+2){
            a = a + 4 * (1.0 / i);
        }
        System.out.println(a);
        System.out.println(b);
    }
}
