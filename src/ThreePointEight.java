/**
 * Created by Administrator on 2017/6/28.
 */
import java.util.Scanner;
public class ThreePointEight {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(c < b){
            int middle = b;
            b = c;
            c = middle;
            if(b < a){
                int middle1 = a;
                a = b;
                b = middle1;
                if(c < b){
                    int middle2 = b;
                    b = c;
                    c = middle2;
                }
            }
        }

        System.out.print(a + " " + b + " " + c);
    }
}
