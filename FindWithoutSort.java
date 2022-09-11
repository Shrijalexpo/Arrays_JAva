import java.util.Scanner;
class FindWithoutSort{
    public static void main(String[] args) {
        FindWithoutSort ob = new FindWithoutSort();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("enter elements: ");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("second largest number is: "+ ob.secondLargest(arr));
    }
    int largest(int[] arr){
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > temp){
                temp = arr[i];
            }
        }
        return temp;
    }
    boolean search(int temp,int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == temp){
                return true;
            }
        }
        return false;
    }
    public int secondLargest(int[] arr){
        int i;
        int largest = largest(arr);
        for (i = largest - 1; i >= 0 ; i--) {
            if(search(i,arr)){
                break;
            }
        }
        return i;
    }
}