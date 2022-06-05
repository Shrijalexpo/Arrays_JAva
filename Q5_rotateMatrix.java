import java.util.Scanner;
/**
 * 5. Write a program in Java to store different numbers in a * 4 * 4 matrix. Now, interchange the numbers of the given 
 * matrix in a cyclic order, such that the elements of 1 ^ (st) . row is shifted to 2^ nd . row, 2 ^ (nd) , row is shifted 
 * to 3 ^ (rd) row, 3 ^ (rd) , row is shifted to 4 ^ (th) . row and 4th row is shifted to 1 ^ (st) . row.
 */
class Q5_RotateMatrix{
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
        int i;
        for (i = 0; i < 3; i++){
            for (int j = 0; j < len; j++){
                trans[i + 1][j] = arr[i][j];
            }
        }
        for (int j = 0; j < len; j++){
            trans[0][j] = arr[i][j];
        }
    }
    void display(){
        for (int i = 0; i < len; i++){
            for (int j = 0; j < len; j++){
                System.out.print(trans[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Q5_RotateMatrix matrix = new Q5_RotateMatrix();
        matrix.input();
        matrix.rotate();
        matrix.display();
    }
}a