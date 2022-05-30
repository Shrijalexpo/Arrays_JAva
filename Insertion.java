import java.util.*;
class Insertion{
    int[] arr;
    int len, input, pos;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements of array");
        len = sc.nextInt();
        arr = new int[len + 1];
        System.out.println("Enter the elements of the array");
        for(int idx = 0; idx < len; idx++){
            arr[idx] = sc.nextInt();
        }
        System.out.println("Enter the number to be entered in array");
        input = sc.nextInt();
        System.out.println("Enter the position at which number to be entered in array");
        pos = sc.nextInt();
    }

    void insert(){
        int i;
        for (i = len - 1; i >= pos; i --){
            arr[i + 1] = arr[i];
        }
        arr[pos] = input;
    }

    void display(){
        for(int idx = 0; idx < arr.length; idx++){
            System.out.print(arr[idx] + "\t");
        }
    }

    public static void main(String Args[]){
        Insertion obj = new Insertion();
        obj.input();
        obj.insert();
        obj.display();
    }
}