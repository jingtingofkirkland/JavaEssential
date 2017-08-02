/**
 * Created by Administrator on 2017/7/6.
 */
public class FourPointSix {
    public static void main(String[] args) {
        final double r = 40;
        double m = Math.random() * 2 * Math.PI;
        double xa = r * Math.cos(m);
        double ya = r * Math.sin(m);
        double n = Math.random() * 2 * Math.PI;
        double xb = r * Math.cos(n);
        double yb = r * Math.sin(n);
        double p = Math.random() * 2 * Math.PI;
        double xc = r * Math.cos(p);
        double yc = r * Math.sin(p);
        double sa = Math.pow(((xb - xc) * (xb - xc) + (yb - yc)*(yb - yc)), 0.5);
        double sb = Math.pow(((xa - xc) * (xa - xc) + (ya - yc)*(ya - yc)), 0.5);
        double sc = Math.pow(((xa - xb) * (xa - xb) + (ya - yb)*(ya - yb)), 0.5);
        double a = Math.acos((sb * sb + sc * sc - sa * sa) / (2 * sb * sc));
        a = Math.toDegrees(a);
        double b = Math.acos((sa * sa + sc * sc - sb * sb) / (2 * sa * sc));
        b = Math.toDegrees(b);
        double c = Math.acos((sb * sb + sa * sa - sc * sc) / (2 * sb * sa));
        c = Math.toDegrees(c);
        System.out.print("The three degrees is " + a + " degree" + b + " degree" + c + " degree");
    }
}
