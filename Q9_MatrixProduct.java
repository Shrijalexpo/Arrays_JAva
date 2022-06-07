import java.util.Scanner;
/**
 * 9. Write a program in Java to store different numbers in two matrices 
 * A (3 x 4) and B (4 x 3). 
 * Find the product of the two matrices and store the result in another 
 * matrix Display the resultant matrix.
 */
class Q9_MatrixProduct{
    int[][] arr1 = new int[3][4], arr2 = new int[4][3];
    int[][] output = new int[3][3];
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of first array");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                int input = sc.nextInt();
                arr1[i][j] = input;
            }
        }
        System.out.println("Enter the elements of second array");
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 3; j++){
                int input = sc.nextInt();
                arr2[i][j] = input;
            }
        }
    }

    void calculateProduct(){
        int temp = 0;
        for(int i = 0; i < 3; i ++){
            for(int j = 0; j < 3; j ++){
                for(int k = 0; k < 4; k ++){
                    temp += arr1[i][k] * arr2[k][j];
                }
                output[i][j] = temp;
                temp = 0;
            }
        }
    }

    void display(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(output[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] Args){
        Q9_MatrixProduct matrix = new Q9_MatrixProduct();
        matrix.input();
        matrix.calculateProduct();
        matrix.display();
    }
}