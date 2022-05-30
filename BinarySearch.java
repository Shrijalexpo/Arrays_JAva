import java.util.*;
class BinarySearch{
    int[] arr;
    int len, input;
    int pos, flag;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements");
        len = sc.nextInt();
        arr = new int[len];
        System.out.println("Enter the elements of the array");
        for(int idx = 0; idx < len; idx++){
            arr[idx] = sc.nextInt();
        }
        System.out.println("Enter the element to search");
        input = sc.nextInt();
    }

    void sort(){
        int i, j, temp;
        for(i = 0; i < len; i ++){
            for(j = 0; j < len - i - 1; j ++){
                if(arr[j]>arr[j + 1]){
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    void search(){
        int left = 0, right = len - 1;
        int mid;
        while(left <= right){
            mid = (right + left)/2;
            if (input < arr[mid]){
                right = mid - 1;
            }
            else if (input > arr[mid]){
                left = mid + 1;
            }
            else if (input == arr[mid]){
                pos = mid;
                flag = 1;
                break;
            }
        }
    }

    void display(){
        if (flag == 1){
            System.out.print("Element " + input + " was found at " + pos);
        }
        else{
            System.out.print("Element not found");
        }
    }

    public static void main(String Args[]){
        BinarySearch obj = new BinarySearch();
        obj.input();
        obj.sort();
        obj.search();
        obj.display();
    }
}