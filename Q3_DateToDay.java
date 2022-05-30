/**
 * Write a program to accept a date in the String format dd/mm/yyyy
 * and accept the name of the day on 1st January of the corresponding
 * year.Find the day for the given date
 **/

import java.util.*;
import static java.lang.Integer.*;
class Q3_DateToDay{
    Scanner sc = new Scanner(System.in);
    String date;
    String day;
    int dayIndex = 0;
    String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    void input(){
        System.out.println("Enter date dd/MM/YYYY");
        date = sc.next();
        if (parseInt(date.substring(0,2)) > 31 || parseInt(date.substring(3,5)) > 12){
            System.out.println("Incorrect Date");
            System.exit(0);
        }
        System.out.println("Enter day on the 1st January");
        day = sc.next();
    }

    void search(){
        for (int i = 0; i < days.length; i ++){
            if (days[i].equals(day)){
                dayIndex = i - 1;
                break;
            }
        }
    }

    void rotate(){
        String[] temp = new String[dayIndex];
        for (int i = 0; i < dayIndex; i++) {  // 1 2 3 4 5 6 7      =>   3 4 5 6 7 1 2
            temp[i] = days[i];
        }
        for (int i = dayIndex; i < 7; i++) {
            days[i - dayIndex] = days[i];
        }
        for (int i = 0; i < dayIndex; i++) {
            days[i + 7 - dayIndex] = temp[i];
        }
    }

    void isDay(){
        int dayNum = 0;
        if (((parseInt(date.substring(6))%4==0 && parseInt(date.substring(6))%100!=0) || parseInt(date.substring(6))%400==0) && parseInt(date.substring(3,5)) > 2){
            months[2] = 29;
        }
        for (int i = 1; i < parseInt(date.substring(3,5)); i ++){
            dayNum += months[i];
        }
        dayNum += parseInt(date.substring(0,2));
        dayNum %= 7;
        System.out.println("Day: " + days[dayNum]);
    }

    public static void main(String[] args) {
        Q3_DateToDay date = new Q3_DateToDay();
        date.input();
        date.search();
        date.rotate();
        date.isDay();
    }
}


