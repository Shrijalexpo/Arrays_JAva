import java.util.*;
class SelectionSort{
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
        int i,j, min_idx, temp;
        for(i = 0; i < len - 1; i ++){
            min_idx = i;
            for(j = i + 1; j < len; j ++){
                if (arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    void display(){
        for(int idx = 0; idx < len; idx++){
            System.out.print(arr[idx] + "\t");
        }
    }
    public static void main(String args[]){
        SelectionSort obj = new SelectionSort();
        obj.input();
        obj.sort();
        obj.display();
    }
}

