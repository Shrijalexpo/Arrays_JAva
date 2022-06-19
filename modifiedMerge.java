/**
 * Write a program in Java to store 10 numbers in two different Single Dimension arrays.Merge all the numbers of array
 * in a single array.Eliminate all the duplicating element and sort these numbers in ascending order.
 *
 */

import java.util.*;
class modifiedMerge{
    int[] arr1, arr2, ans;
    int[] temp;
    int len1= 10, len2 = 10;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the first array");
        arr1 = new int[len1];
        for(int idx = 0; idx < len1; idx++){
            arr1[idx] = sc.nextInt();
        }
        System.out.println("Enter the elements of the Second array");
        arr2 = new int[len2];
        for(int idx = 0; idx < len1; idx++){
            arr2[idx] = sc.nextInt();
        }
        ans = new int[len1 + len2];
    }

    void merge(){
        int i;
        for (i = 0; i < len1; i ++){
            ans[i] = arr1[i];
        }
        for (i = 0; i < len2; i ++){
            ans[len1 + i] = arr2[i];
        }
    }

    void sort(){
        int j, k, temp;
        for(j = 0; j < len1+len2; j ++){
            for(k = 0; k < len1+len2 - j - 1; k ++){
                if(ans[k]>ans[k + 1]){
                    temp = ans[k + 1];
                    ans[k + 1] = ans[k];
                    ans[k] = temp;
                }
            }
        }
    }
    void check(){
        temp = new int[len1];
        int counter = 0;
        for (int i = 0; i < ans.length - 1; i++) {
            if(ans[i] != ans[i+1]){
                temp[counter++] = ans[i];
            }
        }
        temp[counter++] = ans[ans.length - 1];

        for(int i = 0;i< counter; counter ++ ){
            ans[i] = temp[i];
        }
    }

    void display(){
        for(int idx = 0; idx < temp.length; idx++){
            System.out.print(temp[idx] + "\t");
        }
    }

    public static void main(String[] Args){
        modifiedMerge obj = new modifiedMerge();
        obj.input();
        obj.merge();
        obj.sort();
        obj.check();
        obj.display();
    }
}

