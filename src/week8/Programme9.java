package week8;

public class Programme9 {
    public void fibonacci() {
        int n1 = 1, n2 = 1, n3, count = 8;

        //print first two numbers
        System.out.print(n1 + " " + n2);

        //use for loop for fibonacci number
        for (int i = 2; i < count; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }

        public static void main(String[] args) {

        Programme9 obj = new Programme9();
        obj.fibonacci();

    }
}

