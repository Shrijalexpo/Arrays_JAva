/**
 * Write a program to declare a square matrix M [ ] [ ] of order ‘N’ where ‘N’ must be greater than 3 and less than
 * 10. Allow the user to accept three different characters from the keyboard and fill the array according to the
 * instruction given below:
 * (i) Fill the four corners of the square matrix by character 1.
 * (ii) Fill the boundary elements of the matrix (except the four corners) by character 2.
 * (iii) Fill the non-boundary elements of the matrix by character 3.
 */
import java.util.Scanner;
class Stylish_Entry {
    int n;
    char char1,char2,char3;
    char[][] arr;
    public static void main(String[] args) {
        Stylish_Entry ob = new Stylish_Entry();
        ob.input();
        ob.entry();
        ob.display();
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix size: ");
        n = sc.nextInt();
        if(n < 3 || n > 11){
            System.out.println("Erorr!!");
            System.exit(0);
        }
        arr = new char[n][n];
        System.out.println("Enter character 1");
        char1 = sc.next().charAt(0);
        System.out.println("Enter character 2");
        char2 = sc.next().charAt(0);
        System.out.println("Enter character 3");
        char3 = sc.next().charAt(0);
    }
    void entry(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i+j == 0) || ((i+j == n-1) && (i == n-1 || i == 0))|| (i+j == 2*n - 2 )) {
                    arr[i][j] = char1;
                }
                else if ((i == 0 && j > 0 && j < n - 1) || (i == n - 1 && j > 0 && j < n - 1)
                        || (j == 0 && i > 0 && i < n-1) || (j == n -1 && i > 0 && i < n-1)) {
                    arr[i][j] = char2;
                }
                else{
                    arr[i][j] = char3;
                }

            }
        }
    }
    void display(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}