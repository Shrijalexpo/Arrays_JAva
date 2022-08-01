/**
 * A wondrous square is an n by n grid which fulfils the following conditions:
 * (a) It contains integers from 1 to n², where each integer appears only once.
 * (b) The sum of integers in any row or column must add up to 0.5 x n x (n²+1).
 * For example, the following grid is a wondrous square where the sum of each row or column is 65 when n=5.
 *
 * Write a program to read n (2<=n<=10) and the values stored in these n by n cells and output if the grid
 * represents a wondrous square.
 * Also output all the prime numbers in the grid along with their row index and column index as shown
 * in the output. A natural number is said to be prime if it has exactly two divisors.
 * For example, 2, 3, 5, 7, 11........ The first element of the given grid i.e. 17 is stored
 * at row index 0 and column index 0 and the next element in the row i.e. 24
 * is stored at row index 0 and column index 1.
 */
import java.util.Scanner;
class WondrousSquare {
    int len;
    int[][] arr;
    //int[][] arr = {{16, 15, 1, 2}, {6, 4, 10, 14}, {9, 8, 12, 5}, {3, 7, 11, 13}};
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        len = sc.nextInt();
        if(len < 2 || len > 10){
            System.out.println("Invalid input");
            System.exit(0);
        }
        arr = new int[len][len];
        System.out.println("Enter the elements of the array");
        for(int row = 0; row < len; row++){
            for(int column = 0; column < len; column++){
                arr[row][column] = sc.nextInt();
            }
        }
    }
    void display(){
        System.out.println("The Given matrix");
        for(int row = 0; row < len; row++){
            for(int column = 0; column < len; column++){
                System.out.print(arr[row][column]+"\t");
            }
            System.out.println();
        }
    }
    boolean isPrime(int x){
        int count = 0;
        for (int i = 2; i < x/2+1; i++) {
            if(x% i == 0){
                count++;
            }
        }
        if(count == 0 && x != 1){
            return true;
        }
        return false;
    }
    int[] search(int num){
        int[] position = new int[2];
        for (int row = 0; row < len; row++) {
            for (int column = 0; column < len; column++) {
                if (arr[row][column] == num){
                    position[0] = row;
                    position[1] = column;
                }
            }
        }
        return position;
    }
    void checkPrime(){
        int count = 0;
        int[] temp = new int[len*len];
        for (int idx = 0; idx < len*len; idx++) {
            if(isPrime(idx)){
                temp[count] = idx;
            }
            count++;
        }
        System.out.println("Prime\tRow\tColumn");
        for (int idx = 0; idx < count; idx++) {
            int[] position = search(temp[idx]);
            if (temp[idx] != 0){
                System.out.println(temp[idx]+"\t\t"+position[0]+"\t"+ position[1]);
            }
        }
    }

    boolean isWondrous(){
        int[] temp = new int[len * len],
                generated = new int[len*len];
        int count = 0;
        for(int row = 0; row < len; row++){
            for(int column = 0; column < len; column++) {
                temp[count] += arr[row][column];
                count ++;
            }
        }

        sort(temp);
        for (int idx = 0; idx < len * len; idx++) {
            generated[idx] = idx + 1;
        }

        for (int idx = 0; idx < len * len; idx++) {
            if (temp[idx] != generated[idx]){
                return false;
            }
        }
        return true;
    }

    boolean sumIsSame(){
        int sum = len/2*(len*len + 1);
        int sumRow=0, sumColumn =0;
        for(int row = 0; row < len; row++){
            for(int column = 0; column < len; column++) {
                sumRow += arr[row][column];
            }
            if(sumRow != sum){
                return false;
            }
            sumRow = 0;
        }
        for(int row = 0; row < len; row++){
            for(int column = 0; column < len; column++) {
                sumColumn += arr[column][row];
            }
            if(sumColumn != sum){
                return false;
            }
            sumColumn = 0;
        }

        return true;
    }
    void sort(int[] arr){
        int j, k, temp;
        for(j = 0; j < len * len; j ++){
            for(k = 0; k < len * len - j - 1; k ++){
                if(arr[k]>arr[k + 1]){
                    temp = arr[k + 1];
                    arr[k + 1] = arr[k];
                    arr[k] = temp;
                }
            }
        }
    }
    void checkWondrous() {
        if (!(isWondrous() && sumIsSame())) {
            System.out.println("Not a Wondrous Square");
        } else {
            System.out.println("Wondrous Square");
        }
    }

    public static void main(String[] Args){
        WondrousSquare ob = new WondrousSquare();
        ob.input();
        ob.display();
        ob.checkWondrous();
        ob.checkPrime();
    }
}