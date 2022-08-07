/**Write a program to input two valid dates, each comprising of Day (2 digits), Month (2 digits) and Year
 * (4 digits) and calculate the days elapsed between both the dates. Test your program for the
 * following data values:
 */

import java.util.Scanner;
import static java.lang.Integer.*;
class Q25_DaysElapsed{
    Scanner sc = new Scanner(System.in);
    String date1, date2;
    int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int duration = 0;
    void input(){
        System.out.println("Enter date dd/MM/YYYY");
        date1 = sc.next();
        date2 = sc.next();
        if(parseInt(date1.substring(6))*365 + parseInt(date1.substring(3,5))*30 + parseInt(date1.substring(0,2)) > parseInt(date2.substring(6))*365 + parseInt(date2.substring(3,5))*30 + parseInt(date2.substring(0,2))){
            String temp;
            temp = date1;
            date1 = date2;
            date2 = temp;
        }
    }
    void daysElapsed(){
        int dayNum1 = 0,  dayNum2 = 0;
        if (((parseInt(date1.substring(6))%4==0 && parseInt(date1.substring(6))%100!=0) || parseInt(date1.substring(6))%400==0) && parseInt(date1.substring(3,5)) > 2){
            months[2] = 29;
        }
        for (int i = 1; i < parseInt(date1.substring(3,5)); i ++){
            dayNum1 += months[i];
        }
        dayNum1 += parseInt(date1.substring(0,2));
        months[2] = 28;

        if (((parseInt(date2.substring(6))%4==0 && parseInt(date2.substring(6))%100!=0) || parseInt(date2.substring(6))%400==0) && parseInt(date2.substring(3,5)) > 2){
            months[2] = 29;
        }
        for (int i = 1; i < parseInt(date2.substring(3,5)); i ++){
            dayNum2 += months[i];
        }
        dayNum2 += parseInt(date2.substring(0,2));
        duration = Math.abs(dayNum2 - dayNum1);
        for (int idx = parseInt(date1.substring(6)); idx < parseInt(date2.substring(6)); idx++) {
            if((idx % 4 == 0 && idx % 100 != 0) || (idx % 400 == 0)){
                duration ++;
            }
            duration += 365;
        }
        System.out.println(duration);
    }
    public static void main(String[] args) {
        Q25_DaysElapsed date = new Q25_DaysElapsed();
        date.input();
        date.daysElapsed();
    }
}