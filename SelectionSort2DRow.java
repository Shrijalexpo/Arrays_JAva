import java.util.*;
class SelectionSort2DRow{
    int[][] arr;
    int len;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements");
        len = sc.nextInt();
        arr = new int[len][len];
        System.out.println("Enter the elements of the array");
        for(int row = 0; row < len; row++){
            for(int column = 0; column < len; column++){
                arr[row][column] = sc.nextInt();
            }
        }
    }

    void sort(){
        int i,j,k, min_idx, temp;
        for(i = 0; i < len; i ++){
            for(j = 0; j < len - 1;j ++){
                min_idx = j;
                for(k = j + 1; k < len; k ++){
                    if (arr[i][k] < arr[i][min_idx]){
                        min_idx = k;
                    }
                }
                temp = arr[i][min_idx];
                arr[i][min_idx] = arr[i][j];
                arr[i][j] = temp;
            }
        }
    }

    void display(){
        for(int row = 0; row < len; row++){
            for(int column = 0; column < len; column++){
                System.out.print(arr[row][column]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String Args[]){
        SelectionSort2DRow obj = new SelectionSort2DRow();
        obj.input();
        obj.sort();
        obj.display();
    }
}
