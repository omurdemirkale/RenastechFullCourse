package Exercises;

import java.util.Scanner;

public class ScannerSwitch {
    public static void main(String[] args) {
      /*
           You are driving a little too fast, and a police officer stops you. Write code to compute the result,
           encoded as an int value:
            0=no ticket,
            1=small ticket,
            2=big ticket.
            If speed is 60 or less, the result is 0.
           If speed is between 61 and 80 inclusive, the result is 1.
           If speed is 81 or more, the result is 2.
           Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
           some answers:
            speed : 60, isBirthday: False  --- result = 0
            speed : 65, isBirthday: False  --- result = 1
            speed : 65, isBirthday: True   --- result = 0
             */
        System.out.println("Please enter speed:");
        Scanner in = new Scanner(System.in);
        int speed = in.nextInt();
        System.out.println("Is it your birthday? : (1 for yes 0 for no)");
        int birthday = in.nextInt();
        if (speed<=60){
            if (birthday==1){
                System.out.println("The result is 0 and your speed can be 5km higher");
            }else{
                System.out.println("The result is 0,so No ticket");
            }
        } else if (speed>=61 && speed<=66) {
            if (birthday==1){
                System.out.println("The result is 0,so No ticket");
            } else if (birthday==0) {
                System.out.println("The result is 1 so you got a small ticket");
            }
        }  else if (speed>=67 && speed<=80) {
            if (birthday==1){
                System.out.println("The result is 1 aso you got a small ticket");
            } else if (birthday==0) {
                System.out.println("The result is 1 so you got a small ticket");
            }
        }else if (speed>=80 && speed<=85) {
            if (birthday==1){
                System.out.println("The result is 1 so you got a small ticket");
            } else if (birthday==0) {
                System.out.println("The result is 2 so you got a big ticket");
            }
        }else if (speed>=86) {
            if (birthday==1){
                System.out.println("The result is 2 so you got a big ticket");
            } else if (birthday==0) {
                System.out.println("The result is 2 so you got a big ticket");
            }
        }



    }
}
