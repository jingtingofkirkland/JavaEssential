/**
 * Created by Administrator on 2017/7/28.
 */
import java.util.Scanner;
public class SixPointThirtyOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number as a long integer: ");
        long user = input.nextLong();
        if((sumOfOddPlace(user) + sumOfDoubleEvenPlace(user)) % 10 == 0) {
            System.out.print(user + " is valid");
        }
        else {
            System.out.print(user + " is invalid");
        }

    }
    public static int sumOfOddPlace(long number) {
        int[] every = new int[getSize(number)];
        long mid = number;
        int sum = 0;
        for(int i = 0; i < getSize(number); i++) {
            every[i] = (int)(mid % (int)(Math.pow(10, i + 1)));
            mid /= (int)(Math.pow(10, i + 1));
            if((i + 3) % 2 != 0) {
                sum += every[i];
            }
        }
        return sum;
    }
    public static int sumOfDoubleEvenPlace(long number) {
        int[] everyDigit = new int[getSize(number) - 1];
        int[] doubleEveryDigit = new int[getSize(number) - 1];
        int[] oneDigitInTwoStep = new int[getSize(number) - 1];
        int sumInTwoStep = 0;
        for(int i = 0; i < getSize(number) - 1; i++) {
            long mid = (long)(number / 10);
            everyDigit[i] = (int)(mid % (int)(Math.pow(10, i + 2)));
            mid = mid / (int)(Math.pow(10, i + 2));
            doubleEveryDigit[i] = everyDigit[i] * 2;
            oneDigitInTwoStep[i] = getDigit(doubleEveryDigit[i]);
            sumInTwoStep += oneDigitInTwoStep[i];
        }
        return sumInTwoStep;
    }
    public static int getDigit(int num) {
        int result = num;
        if(num >= 10) {
            result = num % 10 + num / 10;
        }
        return result;
    }
    public static int getSize(long d) {
        String turnString = "" + d;
        return turnString.length();
    }
    public static long getPrefix(long number, int k) {
        if(k > getSize(number)) {
            return number;
        }
        else {
            return (int)(number / Math.pow(10, getSize(number) - k));
        }
    }
    public static boolean prefixMatched(long number) {
        boolean result = false;
        if(getPrefix(number, 1) == 3) {
            if(getPrefix(number, 2) == 37) {
                result = true;
            }
        }
        else if(getPrefix(number, 1) == 4 || getPrefix(number, 1) == 5 ||
                getPrefix(number, 1) == 6) {
            result = true;
        }
        return result;
    }
    public static boolean isValid(long number) {
        boolean result = false;
        if (prefixMatched(number) && getSize(number) >= 13 && getSize(number) <= 16) {
            result = true;
        }
        return result;
    }
}



