/**Write a program to input a natural number less than 1000 and then output it in words.
 Test your program for the following set of data :**/

import java.util.*;

class Q28_NumberToWord {
    static Q28_NumberToWord obj = new Q28_NumberToWord();
    int input, temp, flag;
    String output;
    String[] ones = {"", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN"};
    String[] tens = {"", "TEN", "TWENTY", "THIRTY", "FORTY", "FIFTY", "SIXTY", "SEVENTY", "EIGHTY", "NINETY", "TEN"};
    String[] ten_ones = {"", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN"};

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT : ");
        input = sc.nextInt();
        if (input >= 1000 || input <= 0) {
            flag = 1;
            obj.display();
        }
    }

    void numToWord(int input) {
        temp = input;
        if (input < 10) {
            output = ones[input];
        }
        else if (input < 20) {
            output = ten_ones[input - 9];
        }
        else if (input < 99) {
            if (input % 10 == 0) {
                output = tens[input / 10];
            }
            else {
                output = tens[input / 10] + " " + ones[input % 10];
            }
        }
        else if (input >= 100 && input < 1000) {
            output = ones[input / 100] + " HUNDRED ";  // 59 = 0, 905
            input %= 100;
            if (input == 0){
                output += "";
            }
            else if (input < 10) {
                output += "AND "+ ones[input];
            }
            else if (input < 20) {
                output += "AND "+ten_ones[input - 9];
            }
            else {
                if (input % 10 == 0) {
                    output += "AND "+tens[input / 10];
                }
                else {
                    output += "AND "+tens[input / 10] + " " + ones[input % 10];
                }
            }
        }
        obj.display();
    }


    void display() {
        if (flag == 1) {
            System.out.println("OUTPUT : OUT OF RANGE");
        }
        else {
            System.out.println("OUTPUT : " + temp + "\t" + output);
        }
    }

    void driver() {
        for (int i = 0; i < 1000; i++) {
            numToWord(i);
        }
    }

    public static void main(String[] Args) {
        // obj.input();
        obj.driver();
        // obj.display();
    }
}
