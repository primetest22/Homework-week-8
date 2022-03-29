package week8;

public class Programme5 {
     static int reverse =0;
     static int lastDigit;

    public static boolean isPalindrome(int number) {
        while (number != 0) {
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;

            if (number == reverse) {
                return true;
            }

        }
        // return false;
    return  false;}

   public static void main(String[] args) {


       System.out.println(isPalindrome(-1221));
       System.out.println(isPalindrome(707));
       System.out.println(isPalindrome(11212));
    }
}
