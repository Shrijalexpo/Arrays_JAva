import java.util.Scanner;
class nonsense {
    int M=4;
    //int[][] arr;
    int[][] arr = {{9,2,1,5},{8,13,8,4},{15,6,3,11},{7,12,23,8}};
    public static void main(String[] args) {
        nonsense ajeeb = new nonsense();
        //ajeeb.input();
        System.out.println("Original Matrix");
        ajeeb.display();
        ajeeb.sortDrive();
        System.out.println("Rearranged Matrix");
        ajeeb.display();
        ajeeb.sum();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix size: ");
        M = sc.nextInt();
        if (M < 3 || M > 10) {
            System.out.println("Erorr!!");
            System.exit(0);
        }
        arr = new int[M][M];
        System.out.println("Enter the elements of the array");
        for(int row = 0; row < M; row++){
            for(int column = 0; column < M; column++){
                arr[row][column] = sc.nextInt();
            }
        }
    }
    void display(){
        for(int row = 0; row < M; row++){
            for(int column = 0; column < M; column++){
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
    void sortDrive(){
        int[] temp = new int[(M - 2) * (M - 2)];
        int count = 0;
        for (int i = 1; i < M - 1; i++) {
            for (int j = 1; j < M - 1; j++) {
                temp[count++] = arr[i][j];
            }
        }
        sort(temp);
        count = 0;
        for (int i = 1; i < M - 1; i++) {
            for (int j = 1; j < M - 1; j++) {
                arr[i][j] = temp[count++];
            }
        }
    }
    void sort(int[] temp){
        for (int i = 0; i < temp.length ; i++) {
            for (int j = 0; j < temp.length - i - 1; j++) {
                if (temp[j] > temp[j + 1]) {
                    int t = temp[j];
                    temp[j] = temp[j+1];
                    temp[j+1] = t;
                }
            }
        }
    }

    void sum(){
        int sum = 0;
        System.out.println("Diagonal Elements");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                if (i == j || i + j == M - 1) {
                    sum += arr[i][j];
                    System.out.print(arr[i][j] + " ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Sum of the diagonal elements: " + sum);
    }
}