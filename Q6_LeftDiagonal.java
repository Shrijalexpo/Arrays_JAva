import java.util.Scanner;
/**
 * 6. Write a program in Java to store different numbers in a 5 x 5 matrix. 
 * Display the numbers which are below the left diagonal as shown below:
 */
class Q6_LeftDiagonal{
    int len = 5;
    int arr[][] = new int[len][len];
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
    void display(){
        for (int i = 0; i < len; i++){
            for (int j = 0; j < len; j++){
                if(i > j){
                    System.out.print(arr[i][j] + "\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Q6_LeftDiagonal matrix = new Q6_LeftDiagonal();
        matrix.input();
        matrix.display();
    }
}