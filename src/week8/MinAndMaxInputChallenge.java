package week8;

import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void findMinAndMax() {

        //create scanner class for user inputs
        Scanner input = new Scanner(System.in);
        //first set min and max value to 0
        int count = 0, min = 0, max = 0;

            while (true) {
            int cnt = count++;
            System.out.println("Enter number: " + (cnt + 1));

        //first check user input is integer or not with if else
        boolean isValid = input.hasNextInt();
        if (isValid) {
        int number = input.nextInt();

                //now check user input is min or max number with if else
                     if (number < min) {
                     min = number;
                }    else if (number > min) {
                     max = number;
                }
            }        else {
                     System.out.println("Not Valid Number");
                     break;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }

    public static void main(String[] args) {
    findMinAndMax();
    }
}
