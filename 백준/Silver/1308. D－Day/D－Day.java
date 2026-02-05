import java.util.*;
import java.io.*;
import java.time.*;
import java.time.temporal.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] today = br.readLine().split(" ");
        int tYear = Integer.parseInt(today[0]);
        int tMonth = Integer.parseInt(today[1]);
        int tDay = Integer.parseInt(today[2]);

        String[] dday = br.readLine().split(" ");
        int dYear = Integer.parseInt(dday[0]);
        int dMonth = Integer.parseInt(dday[1]);
        int dDay = Integer.parseInt(dday[2]);

        if (dYear - tYear > 1000 ||
           (dYear - tYear == 1000 && (dMonth > tMonth || (dMonth == tMonth && dDay >= tDay)))) {
            System.out.println("gg");
            return;
        }

        long tDays = dateToDays(tYear, tMonth, tDay);
        long dDays = dateToDays(dYear, dMonth, dDay);

        System.out.println("D-" + (dDays - tDays));
    }

    static long dateToDays(int year, int month, int day) {
        long totalDays = 0;
        int[] monthDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int y = 1; y < year; y++) {
            totalDays += isLeapYear(y) ? 366 : 365;
        }

        for (int m = 1; m < month; m++) {
            if (m == 2 && isLeapYear(year)) {
                totalDays += 29;
            } else {
                totalDays += monthDays[m];
            }
        }

        totalDays += day;
        
        return totalDays;
    }

    static boolean isLeapYear(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }
}