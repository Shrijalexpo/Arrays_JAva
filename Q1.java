/**Write a program to input and store n integers (n> 0) in a single subscripted
variable and  print each number with its frequency.
the output should contain number and its frequency in two different columns.*/

class Q1 {
    int[] arr = {5, 12, 20, 14, 12, 12, 20 ,16 ,12 ,20 , 21,18 ,18}; // 5, 12  12  12  12,  14 , 16 , 18  18 , 20  20  20, 21
    void hasFrequency() {
        int count = 1;
        for (int n = 1; n < arr.length; n++) {
            if (arr[n - 1] == arr[n]) {
                count++;
            } else {
                System.out.println(arr[n - 1] + "\t" + count);
                count = 1;
            }
        }
        System.out.println(arr[arr.length-1] + "\t" + count);
    }

    void sort(){
        int temp;
        for (int i= 0;i<arr.length;i++){
            for(int j =0;j< arr.length -1-i; j++){
                if (arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Q1 ob = new Q1();
        ob.sort();
        ob.hasFrequency();
    }
}