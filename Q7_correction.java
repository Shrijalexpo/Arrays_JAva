import java.util.Scanner;
/**
 * The result of a quiz competition is to be prepared as follows: The quiz has five questions with multiple choices
 * (A, B, C, D) with each question carrying 1 mark for the correct answer. Design a program to accept the number of
 * participants N such that N must be greater than 3 and less than 11. Create a double dimensional array of size
 * (N x 5) to store the answers of each participant row-wise. Calculate the marks of each participant by matching
 * the correct answer stored in a single dimensional array of size 5. Display the score of each participant and the
 * participant(s) having the highest score.
 */
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