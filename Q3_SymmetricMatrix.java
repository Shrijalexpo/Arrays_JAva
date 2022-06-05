import java.util.*;
/**
 * A square matrix is said to be symmetric, if the element of the ith row and jth column is same as the element of jth row and ith column.
 * Write a program to create and store the numbers in it. Check and display whether it is a symmetric matrix or not.
 */
class Q3_SymmetricMatrix{
    int len;
    int arr[][], trans[][];
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        len = sc.nextInt();
        arr = new int[len][len];
        trans = new int[len][len];
        System.out.println("Enter the elements");
        for (int i = 0; i < len; i++){
            for (int j = 0; j < len; j++){
                int input = sc.nextInt();
                arr[i][j] = input;
            }
        }
    }
    void isSymmetric(){
        for (int i = 0; i < len; i++){
            for (int j = 0; j < len; j++){
                if(trans[i][j] != arr[i][j]){
                    System.out.println("Not Symmetric");
                    System.exit(0);
                }
            }
        }
        System.out.println("Symmetric Matrix");
    }
    void transpose(){
        for (int i = 0; i < len; i++){
            for (int j = 0; j < len; j++){
                trans[i][j] = arr[j][i];
            }
        }
    }
    public static void main(String[] args) {
        Q3_SymmetricMatrix matrix = new Q3_SymmetricMatrix();
        matrix.input();
        matrix.transpose();
        matrix.isSymmetric();
    }
}