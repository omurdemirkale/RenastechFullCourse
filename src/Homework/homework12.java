package Homework;

import java.util.Scanner;

public class homework12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        System.out.println("Please enter Student's First name");
        String firstName = scan.next();

        System.out.println("Please enter Student's Last name");
        String lastName = scan.next();


        System.out.println("Please enter Student's Exam result");
        double points = scan.nextDouble();

        if(points<0 || points>100){
            System.out.println("Not valid Point");
        }else if(points >=90){
            System.out.println("First Name = " + firstName + " Last Name = " + lastName +"'s Grade is A");
        }else if(points >=80){
            System.out.println("First Name = " + firstName + " Last Name = " + lastName +"'s Grade is B");
        }else if(points >=70){
            System.out.println("First Name = " + firstName + " Last Name = " + lastName +"'s Grade is C");
        }else if(points >=60){
            System.out.println("First Name = " + firstName + " Last Name = " + lastName +"'s Grade is D");
        }else{
            System.out.println("First Name = " + firstName + " Last Name = " + lastName +"'s Grade is F");
        }
    }
}
