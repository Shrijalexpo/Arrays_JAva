import java.util.Scanner;

class Q7_correction{
    static Scanner sc = new Scanner(System.in);
    String[] key = new String[5];
    static String[][] record;
    static int[] score;
    int highest = 0,topper =0;
    static int n;
    public static void main(String[] args) {
        System.out.println("Enter no. of participants: ");
        n = sc.nextInt();
        if(n<3 || n>11){
            System.out.println("Error!!!");
            System.exit(0);
        }
        record = new String[n][5];
        score = new int[n+1];
        Q7_correction ob = new Q7_correction();
        ob.enterKey();
        ob.input();
        ob.correct();
        ob.highest();
        ob.display();
    }

    void enterKey(){
        System.out.println("Input answer key");
        for (int idx = 0; idx < 5; idx++) {
            System.out.print("Correct Answer for Q"+(idx+1)+": ");
            key[idx] = sc.next();
        }
        System.out.println();

    }

    void input(){
        for (int idx = 0; idx < n; idx++) {
            System.out.println("Enter answer for Participant: "+ (idx+1));
            for (int i = 0; i < 5; i++) {
                System.out.print("Q"+(i+1)+": ");
                record[idx][i] = sc.next();
            }
            System.out.println();
        }
    }
    void correct(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                if(record[i][j].equalsIgnoreCase(key[j])){
                    score[i+1]++;
                }
            }
        }
    }

    void highest(){
        for (int i = 1; i < score.length; i++) {
            if(score[i] > highest){
                highest = score[i];
                topper = i;
            }
        }
    }

    void display(){
        for (int i = 1; i < score.length; i++) {
            System.out.println("Score of Participant: "+i+": "+ score[i]);
        }
        System.out.println("Highest score by Participant: "+ topper+" - "+ highest);
    }
}