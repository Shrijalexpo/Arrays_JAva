import java.util.Scanner;
/**
 * program in Java to store different numbers in a 5 x 5 matrix.
 *  Display the numbers which are below the right diagonal as shown below:
 */
class Q8_RightDiagonal{
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
                if(j >= 5 - i){
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
        Q8_RightDiagonal matrix = new Q8_RightDiagonal();
        matrix.input();
        matrix.display();
    }
}
