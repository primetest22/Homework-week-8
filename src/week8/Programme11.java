package week8;

public class Programme11 {
    public static int getEvenDigitSum(int number) {
        int lastDigit = 0;
        int sum = 0;
        //check whether number is valid with if else
        if (number < 0) {
        return -1;

        } else {

        //while loop to repeat the process
        while (number != 0) {
                //find last digit
                lastDigit = number % 10;

                //check last digit is even
                if (lastDigit % 2 == 0) {
                sum = sum + lastDigit;
                }
                number = number / 10;
            }
            return sum;
        }
    }


    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));

    }
}
