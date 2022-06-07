import java.util.Scanner;
/**
 * Write a program in Java to create a 4 * 4 matrix and store the different numbers. 
 * Display the highest value of each column.
 */
class Q12_FindMax{
    int arr[][] = new int[4][4];
    int maxColumn = 0;
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
        for(int column = 0; column < 4; column ++){
            for(int counter = 0; counter < 3; counter ++){
                if(maxColumn < arr[counter][column]){
                    maxColumn = arr[counter][column];
                }
            }
            System.out.println("column " + column + ": " + maxColumn);
            maxColumn = 0;
        }
    }
    void display(){
        for(int row = 0; row < 4; row ++){
            for(int column = 0; column < 4; column ++){
                System.out.print(arr[row][column] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Q12_FindMax matrix = new Q12_FindMax();
        matrix.input();
        matrix.display();
        matrix.findMax();
    }
}