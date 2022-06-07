import java.util.Scanner;
/**
 * Write a program in Java to store the numbers in 4 x 4 matrix in Double Dimensional Array. 
 * Find display the product of each row and each column.
 */
class Q10_matrixProduct{
    int arr[][] = new int[4][4];
    int productRow = 1;
    int productColumn = 1;
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
                productRow *= arr[row][column];
            }
            System.out.println("Row " + (row + 1) + ": " + productRow);
            productRow = 0;
        }
    }
    void calculateColumn(){
        int row, column;
        for(column = 0; column < 4; column ++){
            for(row = 0; row < 4; row ++){
                productColumn *= arr[row][column];
            }
            System.out.println("Column " + (column + 1) + ": " + productColumn);
            productColumn = 0;
        }
    }
    public static void main(String[] args) {
        Q10_matrixProduct matrix = new Q10_matrixProduct();
        matrix.input();
        matrix.calculateRow();
        matrix.calculateColumn();
    }
}