/**
 * Created by Administrator on 2017/7/25.
 */
public class SixPointEight {
    public static void main(String[] args) {
        System.out.println("\u6444\u6c0f\u5ea6\t\t\u534e\u6c0f\u5ea6\t\t\t\t\u534e\u6c0f\u5ea6\t\t\u6444\u6c0f\u5ea6");
        System.out.print("_________________________________________________\n");
        for(int i = 1; i <= 10; i++) {
            System.out.println((41.0 - i) + "\t\t" +
                    (int)(celsiusToFahrenheit(41.0 - i) * 10) / 10.0+
            "\t\t\t\t" + (130.0 - 10 * i) + "\t\t" +
                    (int)(fahrenheitToCelsius(130.0 - 10 * i) * 100) / 100.0);
        }
    }
    public static double celsiusToFahrenheit(double celsius) {
        double result = (9.0 / 5) * celsius + 32;
        return result;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double result = (5.0 / 9) * (fahrenheit - 32);
        return result;
    }
}
