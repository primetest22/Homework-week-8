package week8;

public class Programme13 {

    public static boolean hasSharedDigit(int a, int b) {

        //verify inputs are between 10 to 99 using if
        if ((a >= 10 && a <= 99) && (b >= 10 && b <= 99)) {

        //now find last and first digit of each entered values for a and b variable
            a = a / 10; //first digit
            a = a % 10; //last digit
            b = b / 10;
            b = b % 10;

        //compare common digit from each entry using if
            if (((a / 10) == (b / 10) || (a / 10) == (b % 10) || (a % 10) == (b / 10) || (a % 10) == (b % 10))) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));

    }
}
