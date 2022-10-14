package studyHall;

import java.util.Scanner;

public class nestedIfScanner2 {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        int a= scan.nextInt();
        int b= scan.nextInt();
        int c= scan.nextInt();

        if (a>b && a>c){
            System.out.println("The largest number is "+ a);

        }
        else if (b>a && b>c){
            System.out.println("The largest number is "+ b);

        } else {
            System.out.println("The largest number is "+ c);

        }






    }
}