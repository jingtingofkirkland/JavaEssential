/**
 * Created by Administrator on 2017/7/27.
 */
public class SixPointTwentyFour {
    public static void main(String[] args) {
        long totalMilliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMilliSeconds / 1000;
        long seconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long minutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long hours = totalHours % 24;
        long totalDays = totalHours / 24;
        int year = 1970;
        long remainDays = totalDays;

        while(remainDays >= 365) {
           // if(remainDays - yearDays(year) >= 0) {
                remainDays -= yearDays(year);
                year++;
           // }
        }
        //System.out.print(remainDays);
        int month = 1;
        while(remainDays >= monthDays(year, month)) {
            remainDays -= monthDays(year, month);
            month++;
        }
        System.out.print("Today is " + year + " " + monthName(month) + " " +
                (remainDays + 1) + "st " + hours + " : " + minutes + " : " + seconds);
    }
    public static String monthName(int month) {
        String monthName = "";
        switch(month) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December"; break;
        }
        return monthName;
    }
    public static int monthDays(int year, int testMonth) {
        int result = 0;
        if(testMonth == 1 || testMonth == 3 || testMonth == 5 || testMonth == 7
                || testMonth == 8 || testMonth == 10 || testMonth == 12) {
            result = 31;
        }
        if(testMonth == 2) {
            result = isLeapYear(year)? 29 : 28;
        }
        if(testMonth == 4 || testMonth == 6 || testMonth == 9 || testMonth == 11) {
            result = 30;
        }

        return result;
    }
    public static int yearDays(int testYear) {
        return isLeapYear(testYear)? 366 : 365;
    }
    public static boolean isLeapYear(int testLeapYear) {
        return (testLeapYear % 4 == 0 && testLeapYear % 100 != 0) || (testLeapYear % 400 == 0);
    }
}
