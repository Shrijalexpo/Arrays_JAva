import java.util.Scanner;

class Combine {
    int[] com;
    int size;
    int[] mix;
    static Scanner sc = new Scanner(System.in);
    Combine(int nn){
        size = nn;
    }
    void inputarray(){
        com = new int[size];
        for (int i = 0; i < size; i++) {
            com[i] = sc.nextInt();
        }
    }
    void sort(){
        for (int i = 0; i < mix.length; i++) {
            for (int j = 0; j < mix.length - i - 1; j++) {
                if(mix[j] > mix[j+1]){
                    mix[j] = mix[j] + mix[j+1];
                    mix[j+1] = mix[j] - mix[j+1];
                    mix[j] = mix[j] - mix[j+1];
                }
            }
        }
    }
    void mix(Combine A, Combine B){
        mix = new int[A.size + B.size];
        int count = 0;
        for (int i = 0; i < A.size; i++) {
            mix[count++] = A.com[i];
        }
        for (int i = 0; i < B.size; i++) {
            mix[count++] = B.com[i];
        }
    }

    void display(){
        for (int i = 0; i < mix.length; i++) {
            System.out.print(mix[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter size of First matrix:");
        Combine A = new Combine(sc.nextInt());
        System.out.println("Input First matrix");
        A.inputarray();
        System.out.println("Enter size of Second matrix:");
        Combine B = new Combine(sc.nextInt());
        System.out.println("Input Second matrix");
        B.inputarray();
        A.mix(A,B);
        A.sort();
        System.out.println("Combined Array: ");
        A.display();
    }
}