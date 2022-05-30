/**Write a program to accept a set of n integers (where n > 0) in a single dimensional array Arrange the elements of the array
such that the lowest number appears in the centre of the array, next lower number in the right cell of the centre,
next lower in the left cell of the centre and so on. The process will stop when the highest number will be set in its appropriate cell.
Finally, display the array elements. Assume that the memory space is less. Hence, you don't need to create extra array
1 2 3 4 5 0 0 0 0 0
0 1 2 3 4 5 6 7 8 9
1 2 3 4 5 5 3 1 2 4 */


import java.util.Scanner;

class Q2_PendulumArrangement{

    int[] input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int length = sc.nextInt();
        System.out.println("Enter Elements");
        int[] arr = new int[length*2];
        for(int i = 0; i < length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    int[] arrange(int[] arr)
    {
        int midin = ((arr.length/2)-1)/2;
        int midout = (arr.length - 1)/2 + midin + 1;
        arr[midout] = arr[midin];
        int i, j = 1;
        for(i = arr.length/2+1;i < midin; i ++){
            arr[midout+i] = arr[j++];
            System.out.print(arr[j]+"\t");
            arr[midout-i] = arr[j++];
            System.out.print(arr[j]+"\t");
            System.out.println();
        }
        if(arr.length/2%2==0){
            arr[midout+i] = arr[j];
        }
        return arr;
    }
    void display(int[] arr){
        for (int i = arr.length/2; i < arr.length; i ++){
            System.out.print(arr[i]+"\t");
        }
    }
    int[] sort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length/2; i++) {
            for (int j = 0; j < arr.length/2 - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String args[]){
        Q2_PendulumArrangement ob = new Q2_PendulumArrangement();
        ob.display((ob.arrange(ob.sort(ob.input()))));
    }
}