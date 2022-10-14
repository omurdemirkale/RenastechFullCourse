package Exercises;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in) ;
        double  a ;
        double b ;

        String operation = "1. Addition \n"
                + "2 subtraction \n"
                +"3 multiplication \n "
                + "4 division \n" ;
        System.out.println( operation);


        System.out.println( "you can choose operation");
        String  oper = scan.nextLine();
        switch (oper){
            case  "1" :
                System.out.println("type first number");
                a = scan.nextInt();
                System.out.println( "type second number");
                b = scan.nextInt();
                System.out.println( "Addition ;" + ( a+b ) );
                break;
            case "2" :
                System.out.println("type first number");
                a = scan.nextInt();
                System.out.println( "type second number");
                b = scan.nextInt();
                System.out.println( "Subtraction  ;" + ( a-b ));
                break;

            case "3" :
                System.out.println("type first number");
                a = scan.nextInt();
                System.out.println( "type second number");
                b = scan.nextInt();
                System.out.println( "Multiplication ;" + ( a*b ));
                break;

            case "4" :
                System.out.println("type first number");
                a = scan.nextInt();
                System.out.println( "type second number");
                b = scan.nextInt();
                System.out.println( "Division ;" + ( (double) a /b ));
                break;

            default:
                System.out.println( "invalid operation");


        }




    }
}











