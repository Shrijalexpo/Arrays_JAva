import java.util.Scanner;

/**A bank intends to design a program to display the denomination of an input amount, up to 5 digits.
 * The available denominations with the bank are of rupees 2000, 500, 200, 100, 50, 20, 10 and 1.
 * Design a program to accept the amount from the user and display the break-up in descending order of denominations,
 * (ie, preference should be given to the highest denomination available) along with the total number of notes Note Only
 * the denomination used should be displayed. Also print the amount in words according to digits */
//99999=98000+1500+400+50+40+9
/* 98090 / 2000 > 0
 *2001 / 2000 > 0
 * 2001%2000
 *1/ choose
 * Recursion
 */
/*
 *Loop
 *
 */

class Q3_Denomination{
    int[] notes = {2000, 500, 200, 100, 50, 20, 10, 1};
    void denomination(int money){
        int count;
        for (int i = 0; i < notes.length; i ++){
            if (money/notes[i]>0){
                count = money/notes[i];
                System.out.println(notes[i]+"\t"+count);
                money %= notes[i];
                if (money <= 0){
                    System.exit(0);
                }
                denomination(money);

            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Q3_Denomination ob = new Q3_Denomination();
        System.out.print("Money: ");
        int money = sc.nextInt();
        if (money <= 99999 && money > 0)
            ob.denomination(money);
    }
}
