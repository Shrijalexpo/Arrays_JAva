import java.util.Scanner;
/**
 * Write a program in Java to store the numbers in 4 x 4 matrix in Double Dimensional Array.
 * Find display the sum of each row and each column.
 */
class Q1_matrix{
    int arr[][] = new int[4][4];
    int sumRow = 0;
    int sumColumn = 0;
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
    void calculateRow(){
        int row, column;
        for(row = 0; row < 4; row ++){
            for(column = 0; column < 4; column ++){
                sumRow += arr[row][column];
            }
            System.out.println("Row " + (row + 1) + ": " + sumRow);
            sumRow = 0;
        }
    }
    void calculateColumn(){
        int row, column;
        for(column = 0; column < 4; column ++){
            for(row = 0; row < 4; row ++){
                sumColumn += arr[row][column];
            }
            System.out.println("Column " + (column + 1) + ": " + sumColumn);
            sumColumn = 0;
        }
    }
    public static void main(String[] args) {
        Q1_matrix matrix = new Q1_matrix();
        matrix.input();
        matrix.calculateRow();
        matrix.calculateColumn();
    }
}