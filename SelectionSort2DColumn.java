import java.util.*;
class SelectionSort2DColumn{
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
            for(j = 0; j < len - 1; j ++){
                min_idx = j;
                for(k = j + 1; k < len; k ++){
                    if (arr[k][i] < arr[min_idx][i]){
                        min_idx = k;
                    }
                }
                temp = arr[min_idx][i];
                arr[min_idx][i] = arr[j][i];
                arr[j][i] = temp;
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
        SelectionSort2DColumn obj = new SelectionSort2DColumn();
        obj.input();
        obj.sort();
        obj.display();
    }
}
