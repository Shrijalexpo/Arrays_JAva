import java.util.Scanner;

/**Write a program to declare a square matrix A[ ] [ ] of order N (N < 20).
 Allow the user to input positive integers into this matrix. Perform the following
 tasks on the matrix:

 i.Output the original matrix.
 ii.Find the SADDLE POINT for the matrix. A saddle point is an element of the matrix such that it is
 minimum element for the row to which it belongs and the maximum element for the column to which
 it belongs. Saddle point for a given matrix is always unique. If the matrix has no saddle point, output
 the message “NO SADDLE POINT”.
 iii. Sort the element along principal diagonal in ascending order using insertion sort technique.**/

class Saddle{
    int[][] arr;
    int[] sort;
    int len;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pp size");
        len = sc.nextInt();
        arr = new int[len][len];
        sort = new int[len];
        System.out.println("Enter the elements of the array");
        for(int row = 0; row < len; row++){
            for(int column = 0; column < len; column++){
                arr[row][column] = sc.nextInt();
            }
        }

    }

    boolean saddle(){
        int min_row , col_idx = 0;
        for (int i = 0; i < len; i ++){
            min_row = arr[i][0];
            for (int j = 0; j < len; j ++ ){
                if (min_row > arr[i][j]){
                    min_row = arr[i][j];
                    col_idx = j;
                }
            }
            int k;
            for (k = 0; k < len; k++){
                if (min_row < arr[k][col_idx]) {
                    break;
                }
            }
            if(k == len){
                System.out.println("Saddle Point: "+ min_row);
                return true;
            }
        }
        return false;
    }

    void principalSort()
    {
        System.out.println("Sorted principal diagonal of matrix using insertion Sort");
        for(int idx = 0; idx < len; idx++){
            sort[idx] = arr[idx][idx];
        }
        sort(sort);
        for(int idx = 0; idx < len; idx++){
            arr[idx][idx] = sort[idx];
        }
    }
    void display(){
        for(int row = 0; row < len; row++){
            for(int column = 0; column < len; column++){
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }

    void sort(int[] sort){
        int i, j, key;
        for(i = 1; i < len; i ++){
            key = sort[i];
            j = i - 1;
            while (j >= 0 && sort[j] > key){
                sort[j + 1] = sort[j];
                j --;
            }
            sort[j + 1] = key;
        }
    }

    public static void main(String[] args){
        Saddle point = new Saddle();
        point.input();
        point.display();
        if(!point.saddle())
        {
            System.out.println("No Saddle Point Found");
        }
        point.principalSort();
        point.display();

    }
}

