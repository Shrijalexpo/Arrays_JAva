import java.util.*;
class RightDiagonal{
    int total, sumB, sumW;
    int arr[][] = {{13,22,14,23,21}, {16, 14, 15, 34, 10}, {71, -11, 10, 40, 12}, {41,13, 11, 56, 19}, {22, 71, 45, 12, 34}};
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                int input = sc.nextInt();
                arr[i][j] = input;
            }
        }
    }
    void printRightDiagonal(){
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (i + j > 4){
                    System.out.print(arr[i][j]+ "  ");
                }
                else{
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }
    public static void main(){
        RightDiagonal obj = new RightDiagonal();
        // obj.input();
        obj.printRightDiagonal();
    }
}