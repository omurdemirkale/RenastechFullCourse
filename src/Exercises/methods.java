package Exercises;

import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("result is " + multNumbers(11));
        System.out.println("result is " + addNumbers(11, 22));

        System.out.println("Please enter a number between 0 and 100");
        int a = scan.nextInt();
        System.out.println("Please enter another number between 0 and 100");
        int b= scan.nextInt();

        System.out.println("number 1 and number 2 are equal : " +equalNumbers(a,b));
    }

    public static int multNumbers(int a) {
        return (a * 11);


    }

    public static int addNumbers(int a, int b) {
        int result = a + b;
        return result;


    }

    public static boolean equalNumbers(int a, int b) {

        if (a == b) {
          return true;
        } else {
            return false;
        }

    }

}
