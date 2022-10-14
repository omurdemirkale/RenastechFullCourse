package Homework;

import java.util.Scanner;

public class homework10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a whole number");
        int number = scan.nextInt();



        if(number>0){
            System.out.println(number +" is positive");
        }else if(number<0){
            System.out.println(number + " is negative");
        }else if(number==0){
            System.out.println(number + " is zero");
        }else{
            System.out.println(" invalid entry");
        }
    }
}
