import java.io.*;
import java.util.*;
class DayOfTheWeek {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("date");
        int date = Integer.parseInt(br.readLine());
        System.out.println("month");
        int month = Integer.parseInt(br.readLine());
        System.out.println("year");
        int year = Integer.parseInt(br.readLine());
        System.out.println(dayOnDate(date, month, year));
    }
    public static int dayOnDate(int date, int month, int year){
        String[] weekDays = {"Sunday", "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int[] days = {31, isleap}
    }
}
