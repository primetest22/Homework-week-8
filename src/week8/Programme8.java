package week8;


import java.util.Scanner;

public class Programme8 {

    public static void pattern() {
        Scanner s = new Scanner(System.in);

        //Enter number rows using scanner
        System.out.println("Enter number of rows");
        int rows = s.nextInt();

        //use nested for loops for desired pattern
        for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= i; j++) {
                System.out.print('@');
            }
                System.out.println();
        }

    }
    public static void main(String[] args) {
    pattern();

    }
}
