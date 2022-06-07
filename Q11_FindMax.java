import java.util.Scanner;
/**
 * Write a program in Java to create a 4 * 4 matrix and store the different numbers. 
 * Display the highest value of each row.
 */
class Q11_FindMax{
    int arr[][] = new int[4][4];
    int maxRow = 0;
    void input(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter elements");
            for(int row = 0; row < 4; row ++){
                for(int column = 0; column < 4; column ++){
                    arr[row][column] = sc.nextInt();
                }
            }
        }
    }
    void findMax(){
        for(int row = 0; row < 4; row ++){
            for(int counter = 0; counter < 3; counter ++){
                if(arr[row][counter] > arr[row][counter + 1]){
                    maxRow = arr[row][counter];
                }
                else{
                    maxRow = arr[row][counter + 1];
                }
            }
            System.out.println("Row " + row + ": " + maxRow);
            maxRow = 0;
        }
    }
    public static void main(String[] args) {
        Q11_FindMax matrix = new Q11_FindMax();
        matrix.input();
        matrix.findMax();
    }
}