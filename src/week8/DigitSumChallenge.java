package week8;

public class DigitSumChallenge {

    public static int sumDigits(int number) {
        int digit;
        int sum = 0;

        if (number < 10) {
            return -1;
        } else {
            while (number >= 10) {
                digit = number % 10;
//adds last digit to the variable su
                sum = sum + digit;
//removes the last digit from the number
                number = number / 10;

            }
            return sum;

        }
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(125)) ;
    }
}
