package week8;

import java.util.Scanner;

public class UserInputChallenge {
    public void sum() {

        //created scanner class to input numbers
        Scanner s = new Scanner(System.in);

        //created array to store user input
        int[] a = new int[10];
        int i = 0, sum = 0;

        //using while loop to check inputs in array not more than 10 numbers
        while (i < a.length) {

            for (int count = 1; count < 11; count++) {
                System.out.println("Enter number " + count);

                //check user input is valid, if valid put that in array and do sum
                if (s.hasNextInt()) {
                    a[i] = s.nextInt();
                    sum += a[i];
                    i++;

                } else {
                    System.out.println("invalid number");
                    break;
                }

            }

            break;}
            s.close();
            System.out.println("sum is:" + sum);
        }

    public static void main(String[] args) {
        UserInputChallenge obj = new UserInputChallenge();
        obj.sum();
    }
}
