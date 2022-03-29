package week8;

import java.util.Scanner;

public class Programme10 {

    public void armStrong(){
    int number,a, b, c;
    int count=0;
    int sum=0;

    Scanner s = new Scanner(System.in);
    System.out.println("Enter number");
    number = s.nextInt();
    a= number;
    c= number;
    while (a>0){
        a= a/10;
        count++;
    }
    while (number>0){
        b= number%10;
        sum= (int)(sum+Math.pow(b, count));
        number= number/10;
    }
    if(sum==c){
        System.out.println("Armstrong number");
    } else {
        System.out.println("Not a Armstrong number");
    }

    }
    public static void main(String[] args) {

    Programme10 obj = new Programme10();
    obj.armStrong();

    }
}
