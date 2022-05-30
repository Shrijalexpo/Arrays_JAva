import java.util.*;
class BubbleSort{
    int[] arr;
    int len;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements");
        len = sc.nextInt();
        arr = new int[len];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < len; i++){
            arr[i] = sc.nextInt();
        }
    }

    void sort(){
        int j, k, temp;
        for(j = 0; j < len; j ++){
            for(k = 0; k < len - j - 1; k ++){
                if(arr[k]>arr[k + 1]){
                    temp = arr[k + 1];
                    arr[k + 1] = arr[k];
                    arr[k] = temp;
                }
            }
        }

    }

    void display(){
        for(int i = 0; i < len; i++){
            System.out.print(arr[i]+"\t");
        }
    }

    public static void main(String Args[]){
        BubbleSort obj = new BubbleSort();
        obj.input();
        obj.sort();
        obj.display();
    }
}
