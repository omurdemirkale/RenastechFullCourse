package Day8_Scanners;

import java.util.Scanner;

public class Topic2_nextVsNextline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first name and last name: ");
        String name = sc.nextLine();
        System.out.println("your first and last name is: " +name);

        System.out.println("Please enter your phone number : ");
        String phone = sc.nextLine();
        System.out.println("your name is : " +name + " and your phone number is: " +phone);

    }
}
