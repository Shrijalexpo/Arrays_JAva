class Interchange{
    int arr[][] = {{13,22,14,21},{16,14,15,10},{71,-11,10,12},{41,13,11,19}};
    int a[][] = new int[4][4];
    void interchange(){
        for (int i = 0; i < 4; i ++){
            for (int j = 0; j < 4; j ++){
                if (i != 3){
                    a[i+1][j] = arr[i][j];
                }
                else{
                    a[0][j] = arr[i][j];
                }
            }
        }
    }
    void display(){
        for (int i = 0; i < 4; i ++){
            for (int j = 0; j < 4; j ++){
                System.out.print(a[i][j]+ "  ");
            }
            System.out.println();
        }
    }
    public static void main(){
        Interchange obj = new Interchange();
        obj.interchange();
        obj.display();
    }
}