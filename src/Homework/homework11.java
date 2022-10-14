package Homework;

import java.util.Scanner;

public class homework11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter sold product quantity");
        int soldProductQuantity = scan.nextInt();

        System.out.println("Please enter the price per product");
        double productPrice = scan.nextDouble();

        System.out.println("Your Total revenue is : $" + (soldProductQuantity*productPrice));
    }
}
