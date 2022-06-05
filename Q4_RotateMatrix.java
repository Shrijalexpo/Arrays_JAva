import java.util.*;
/**
 * Write a program in Java to store different numbers in a 4 x 4 matrix. 
 * Now, swap the numbers of the 1st row with the 4th, row of a given matrix correspondingly.
 */
class Q4_RotateMatrix{
    int len = 4;
    int arr[][] = new int[len][len], trans[][] = new int[len][len];
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements");
        for (int i = 0; i < len; i++){
            for (int j = 0; j < len; j++){
                int input = sc.nextInt();
                arr[i][j] = input;
            }
        }
    }
    void rotate(){
        int i = 0;
        for (int j = 0; j < len; j++){
            trans[i][j] = arr[3][j];
        }
        for (i = 1; i < 3; i++){
            for (int j = 0; j < len; j++){
                trans[i][j] = arr[i][j];
            }
        }
        for (int j = 0; j < len; j++){
            trans[i][j] = arr[0][j];
        }
    }
    void display(){
        for (int i = 0; i < len; i++){
            for (int j = 0; j < len; j++){
                System.out.print(trans[i][j] + '\t');
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Q4_RotateMatrix matrix = new Q4_RotateMatrix();
        matrix.input();
        matrix.rotate();
        matrix.display();
    }
}