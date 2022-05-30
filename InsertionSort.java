import java.util.*;
class InsertionSort{
    int[] arr;
    int len;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements");
        len = sc.nextInt();
        arr = new int[len];
        System.out.println("Enter the elements of the array");
        for(int idx = 0; idx < len; idx++){
            arr[idx] = sc.nextInt();
        }
    }

    void sort(){
        int i, j, temp, key;
        for(i = 1; i < len; i ++){
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j --;
            }
            arr[j + 1] = key;
        }
    }

    void display(){
        for(int idx = 0; idx < len; idx++){
            System.out.print(arr[idx] + "\t");
        }
    }

    public static void main(String Args[]){
        InsertionSort obj = new InsertionSort();
        obj.input();
        obj.sort();
        obj.display();
    }
}   