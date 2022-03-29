package week8;

public class Programme15 {

    public static void starLeftTriangle(int k) {
        int a, b;

        // 1st loop
         for (a = 0; a < k; a++) {

        // nested 2nd loop
        for (b = 2 * (k - a); b >= 0; b--) {

            // printing spaces
            System.out.print(" ");
        }
        // nested 3rd loop
        for (b = 0; b <= a; b++) {

        // printing stars
        System.out.print("* "); }
             System.out.println();
        }
        // end-line
        System.out.println();
    }

    // Driver Function
    public static void main(String args[]) {

    starLeftTriangle(3);
    }

}