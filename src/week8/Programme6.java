package week8;

import java.util.Scanner;

public class Programme6 {
    public void numPattern() {


        Scanner s = new Scanner(System.in);
        //Enter number of rows
            System.out.println("Enter number fo rows: ");
            int rows = s.nextInt();

        //use for loop to print patterns
            for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {

            System.out.print(j + " ");}

            System.out.println();
        }

    }

    public static void main(String[] args) {
        Programme6 obj = new Programme6();
        obj.numPattern();
    }
}

