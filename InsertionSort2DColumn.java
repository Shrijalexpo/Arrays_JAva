import java.util.*;
class InsertionSort2DColumn{
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
        int i, j, k, key;
        for(i = 0; i < len; i ++){
            for(j = 1; j < len; j ++){
                key = arr[j][i];
                k = j - 1;
                while (k >= 0 && arr[k][i] > key){
                    arr[k + 1][i] = arr[k][i];
                    k --;
                }
                arr[k + 1][i] = key;
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
        InsertionSort2DColumn obj = new InsertionSort2DColumn();
        obj.input();
        obj.sort();
        obj.display();
    }
}
