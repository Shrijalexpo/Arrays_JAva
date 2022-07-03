/**
 * 15. Write a program in Java to store 6 different numbers in a Single Dimensional Array. Display the difference
 * of successive elements.
 */

import java.util.Scanner;
class Difference{
    int len = 6;
    int[] arr = new int[len];
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements");
        for(int counter = 0; counter < len; counter ++){
            arr[counter] = sc.nextInt();
        }
        for(int counter = 0; counter < len; counter ++){
            System.out.print(arr[counter] + "\t");
        }
        System.out.println();
    }

    void calculateDifference(int[] arr){
        if(arr.length > 1){
            int[] temp = new int[arr.length - 1];
            for(int counter = 1; counter < arr.length; counter ++){
                temp[counter - 1] = arr[counter] - arr[counter - 1];
            }
            for(int counter = 0; counter < arr.length - 1; counter ++){
                System.out.print(temp[counter] + "\t");
            }
            System.out.println();
            calculateDifference(temp);
        }
    }

    void display(){
        calculateDifference(arr);
    }

    public static void main(String[] Args){
        Difference diff = new Difference();
        diff.input();
        diff.display();
    }
}