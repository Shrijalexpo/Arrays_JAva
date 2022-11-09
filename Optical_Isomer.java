import java.util.Scanner;

class Optical_Isomer{
    int[][] arr;
    int M;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        M = sc.nextInt();
        if(M < 2 || M > 20){
            System.out.println("Error 404!!!!!!!!!");
        }
        arr = new int[M][M];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    void Walden_inversion(){
        int i,j,t;
        int count;
        for(i=0, count = M-1; i < M/2; i++, count--){
            for(j=0;j < M; j++){
                t = arr[j][i];
                arr[j][i] = arr[j][count];
                arr[j][count] = t;

            }
        }
    }

    void display(){
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Optical_Isomer obj = new Optical_Isomer();
        obj.input();
        System.out.println("Dextro Structure: ");
        obj.display();
        obj.Walden_inversion();
        System.out.println("laevo Structure: ");
        obj.display();
    }
}
