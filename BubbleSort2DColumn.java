import java.util.*;
class BubbleSort2DColumn{
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
        int i, j, k, temp;
        for(i = 0; i < len; i++){
            for(j = 0; j < len; j ++){
                for(k = 0; k < len - j - 1; k ++){
                    if(arr[k][i]>arr[k + 1][i]){
                        temp = arr[k + 1][i];
                        arr[k + 1][i] = arr[k][i];
                        arr[k][i] = temp;
                    }
                }
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
        BubbleSort2DColumn obj = new BubbleSort2DColumn();
        obj.input();
        obj.sort();
        obj.display();
    }
}
