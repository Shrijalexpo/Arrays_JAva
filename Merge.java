import java.util.*;
class Merge{
    int[] arr1, arr2, ans;
    int len1, len2;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements of first array");
        len1 = sc.nextInt();
        System.out.println("Enter the elements of the first array");
        arr1 = new int[len1];
        for(int idx = 0; idx < len1; idx++){
            arr1[idx] = sc.nextInt();
        }
        System.out.println("Enter the number of Elements of second array");
        len2 = sc.nextInt();
        System.out.println("Enter the elements of the first array");
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

    void display(){
        for(int idx = 0; idx < ans.length; idx++){
            System.out.print(ans[idx] + "\t");
        }
    }

    public static void main(String Args[]){
        Merge obj = new Merge();
        obj.input();
        obj.merge();
        obj.display();
    }
}