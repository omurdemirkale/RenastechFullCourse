package Homework;

import java.util.Scanner;

public class homeWork13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        double firstNumber = scan.nextDouble();
        System.out.println("Please select an operation \n" +
                "1 for Summation \n" +
                "2 for Subtraction\n" +
                "3 for Multiplication\n" +
                "4 for Division");
        int operation = scan.nextInt();
        System.out.println("Enter another number");
        double secondNumber = scan.nextDouble();



        if (operation == 1) {
            System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        } else if (operation == 2) {
            System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        } else if (operation == 3) {
            System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        } else if (operation == 4) {
            System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
        } else {
            System.out.println("please enter a valid operation");
        }
    }
}