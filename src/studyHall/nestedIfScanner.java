package studyHall;

import java.util.Scanner;

public class nestedIfScanner {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("is it sunny outside");
        boolean isSunny= scan.nextBoolean();



        if (isSunny==true){
            System.out.println("It is a sunny day, I should go somewhere!");
            System.out.println("What is the temperature outside?");
            int temperature= scan.nextInt();



            if (temperature>85){
                System.out.println("I am going to the beach");

            } else {
                System.out.println("I am going to the park");

            }


        } else {
            System.out.println("I stay home and practice Java");




        }





    }

}