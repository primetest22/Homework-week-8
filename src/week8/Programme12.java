package week8;

import java.util.Scanner;

public class Programme12 {

    public static int primeNumber(int num) {

        if (num > 1 && (num % 1 == 0 || num % num == 0)) {
            return num;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int input = s.nextInt();

        System.out.println("Input number is prime " + (primeNumber(input)));

    }
}
