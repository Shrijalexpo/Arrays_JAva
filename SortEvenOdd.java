import java.util.Scanner;
class SortEvenOdd{
    int len = 10;
    int[] arr = new int[len];
    int[] odd;
    int[] even;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements");
        for(int counter = 0; counter < len; counter ++){
            arr[counter] = sc.nextInt();
        }
    }
    void distributeSort(){
        int[] temp = new int[len];
        int idx = 0;
        for(int counter = 0; counter < len; counter ++){
            if(arr[counter] % 2 == 0){
                temp[idx] = arr[counter];
                idx ++;
            }
        }
        even = idx > 0? new int[idx] : null;
        odd = idx < 10? new int[10 - idx]: null;
        idx = 0;
        for(int counter = 0; counter < len; counter ++){
            if(arr[counter] % 2 == 0){
                even[idx] = arr[counter];
                idx ++;
            }
        }
        idx = 0;
        for(int counter = 0; counter < len; counter ++){
            if(arr[counter] % 2 != 0){
                odd[idx] = arr[counter];
                idx ++;
            }
        }
        sort(even);
        sort(odd);
    }
    void sort(int[] arr){
        int i, j, temp;
        int len = arr.length;
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
    void display(){
        for(int counter = 0; counter < even.length; counter ++){
            System.out.print(even[counter] + "\t");
        }
        for(int counter = 0; counter < odd.length; counter ++){
            System.out.print(odd[counter] + "\t");
        }
    }
    public static void main(String[] Args){
        SortEvenOdd sort = new SortEvenOdd();
        sort.input();
        sort.distributeSort();
        sort.display();
    }
}