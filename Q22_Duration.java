/**The manager of a company wants to analyze the machine usage from the records to find the utilization of the machine.
 He wants to know for how long each user, used the machine. When the user wants to use the machine, he must log in to
 the machine and after finishing the work, he must log off the machine.*/

import java.util.*;

import static java.lang.Integer.*;

class Q22_Duration {
    static String maxDuration= "00:00";
    static Scanner sc = new Scanner(System.in);
    static int maxUserID, userID;
    String loginDate, loginTime, logoutDate, logoutTime;
    static String duration;
    void input(){
        System.out.println("Enter User ID");
        userID = sc.nextInt();
        System.out.println("Enter login Credentials\n Format: DD-MM, HH:MM");
        loginDate = sc.next();
        loginTime = sc.next();
        logoutDate = sc.next();
        logoutTime = sc.next();
    }


    void duration(){
        int temp = ((parseInt(logoutDate.substring(3)) - parseInt(loginDate.substring(3))) * 60 * 24 * 30) +
                ((parseInt(logoutDate.substring(0, 2)) - parseInt(loginDate.substring(0, 2))) * 60 * 24) +
                ((parseInt(logoutTime.substring(0, 2)) - parseInt(loginTime.substring(0, 2))) * 60) +
                (parseInt(logoutTime.substring(3)) - parseInt(loginTime.substring(3)));
        duration = temp/60 +":"+ temp%60;
    }
    void display(){
        System.out.println("User ID: " + userID);
        System.out.println("Login Date & Time: " + loginDate + " " + loginTime);
        System.out.println("Logout Date & Time: " + logoutDate + " " + logoutTime);
        System.out.println("Duration: " + duration);
    }

    static void findMaxDuration(){
        if(     parseInt(duration.split(":")[0])*60 + parseInt(duration.split(":")[1]) >
                parseInt(maxDuration.split(":")[0])*60 + parseInt(maxDuration.split(":")[1])){
            maxDuration = duration;
            maxUserID = userID;
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the no of users: ");
        int users = sc.nextInt();
        for(int counter = 1; counter <= users; counter ++){
            Q22_Duration time = new Q22_Duration();
            time.input();
            time.duration();
            time.display();
            findMaxDuration();
        }
        System.out.println("Max Duration "+ maxUserID +": "+ maxDuration);
    }
}