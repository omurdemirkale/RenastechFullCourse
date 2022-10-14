package Homework;

import java.util.Scanner;

public class homework9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your first number");
        int firstNumber = scan.nextInt();

        System.out.println("Please enter your second number");
        int secondNumber = scan.nextInt();

        System.out.println("Please enter your third number");
        int thirdNumber = scan.nextInt();


        if(firstNumber>secondNumber && firstNumber>thirdNumber){
            System.out.println(firstNumber + " is the maximum number");
        }else if(secondNumber>firstNumber && secondNumber>thirdNumber){
            System.out.println(secondNumber + " is the maximum number");
        }else if(thirdNumber>firstNumber && thirdNumber>secondNumber){
            System.out.println(thirdNumber + " is the maximum number");
        }else{
            System.out.println(" numbers you entered are equal");
        }
    }
}
