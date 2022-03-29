package week8;

import java.util.Scanner;

public class Programme3 {

    public void findVowelAndConsonant() {
        char ch;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter single character from A to Z :");

        //check user input is character or not
        boolean isValid = s.hasNextInt();

            if (isValid) {
            System.out.println("Not Valid Input");
            } else {

        //convert user input to lowercase and check whether it is vowel or consonant with if else
        ch = s.next().toLowerCase().charAt(0);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is vowel");

            } else {
            System.out.println(ch + " is consonant");
            }

        }
    }

    public static void main(String[] args) {

    Programme3 obj = new Programme3();
    obj.findVowelAndConsonant();
    }
}
