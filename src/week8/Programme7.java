package week8;

import java.util.Scanner;

public class Programme7 {

    public static int sumFirstAndLastDigit(int number) {
        int lastDitit, firstDigit, reverse = 0, sum, r;

        //first find last digit
        lastDitit = number % 10;

        //check number is not negative
        if (number < 0) {
            return -1;
        } else {

        //find firtdigit
            while (number > 0) {
                r = number % 10;
                reverse = reverse * 10 + r;
                number = number / 10;
            }
            firstDigit = reverse % 10;
            sum = firstDigit + lastDitit;
            return sum;
        }
    }

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));

    }
}
