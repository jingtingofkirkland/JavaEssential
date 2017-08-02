/**
 * Created by Administrator on 2017/7/22.
 */
public class SixPointOne {
    public static int getPentagonalNumber(int n) {
        int result = 0;
        if (n * (3 * n - 1) % 2 == 0) {
            result = (n * (3 * n - 1) / 2);
        }
        return result;
    }
    public static void main(String[] args) {
         int i = 1;
         int count = 0;
         while(count < 100) {
             count++;
             if(count % 10 == 0) {
                 System.out.println(getPentagonalNumber(i));
             }
             else {
                 System.out.print(getPentagonalNumber(i) + " ");
             }
             i++;

         }
    }


}
