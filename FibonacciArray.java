/**
 * Write a program in Java to generate 20 terms of the Fibonacci series in a Single Dimensional Array.
 * Sample Input: 1,1,2,3,5,8,13,21,
 * Find the difference between the consecutive numbers and store them in another Single Dimensional Array.
 * Display the elements of second array which will also possess another Fibonacci series.
 */
class FibonacciArray{
    int[] fibonacci = new int[20], difference = new int[19];
    void storeFibonacci(){
        int num1 = 1, num2 = 1;
        fibonacci[0] = 1;
        for(int counter = 1; counter < 20; counter ++){
            fibonacci[counter] = num2;
            int temp = num1;
            num1 = num2;
            num2 = num1 + temp;
        }
    }
    void findDifference(){
        for(int counter = 1; counter < 20; counter ++){
            difference[counter - 1] = fibonacci[counter] - fibonacci[counter - 1];
        }
    }
    void display(){
        int counter;
        System.out.print("{");
        for(counter = 0; counter < 18; counter ++){
            System.out.print(difference[counter] + ", ");
        }
        System.out.print(difference[counter] + "}");
    }
    public static void main(String[] Args){
        FibonacciArray ob = new FibonacciArray();
        ob.storeFibonacci();
        ob.findDifference();
        ob.display();
    }
}