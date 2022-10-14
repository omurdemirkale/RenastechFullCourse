package Day8_Scanners;

import java.util.Scanner;

public class Topic1_Scanner {
    public static void main(String[] args) {

        //Next() == > only reads one word from console
        //Java Class ==> it will read only Java (any word until space

        //NextLine() ==> it will read whole line
        //Java Class ==?it will read Java Class
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName = scan.next();
        System.out.println("your firstname is " +firstName);
        System.out.println("Please enter your age: ");
        String age = scan.next();
        System.out.println("your age is :" +age);
        System.out.println("Please enter your zipcode");
        String zipcode = scan.next();
        String zipcodeAge = age + zipcode;
        System.out.println("the age + zipcode:  " +zipcodeAge);



    }
}
