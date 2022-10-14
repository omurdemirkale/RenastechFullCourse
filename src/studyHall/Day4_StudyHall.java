package studyHall;

import java.util.Scanner;

public class Day4_StudyHall {
    public static void main(String[] args) {

        /*Declare two variables to store the age and weight of a person.
        Ask the user to initialize the age and weight.
        Use the first if statement to check if the person is above 18 years of age.
        If the person is above 18 years of age then use another if statement to check if the weight of the person is above 50 or not.
        If the person's age is above 18 and weight is also above 50 then, print the message that the person is eligible to donate blood.
        If the person is above 18 years of age but his/her weight is below 50 then print the message that the person is not eligible to donate blood.
                If the person is below 18 years of age, then print the message that the age must be greater than 18.*/


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();

        System.out.println("Enter your weight");
        double weight = input.nextDouble();

        if (age >= 18) {
            if (weight >= 50) {
                System.out.println("Your age is over 18 and your weight is over 50 so you are eligible to donate blood");
            } else {
                System.out.println("You are over 18 but you are underweight so you are NOT eligible to donate blood ");
            }

        } else {
            System.out.println("Your age MUST BE grater than 18 to donate");
        }

    }

}