package Exercises;

import java.util.Scanner;

public class mergeDiffDenemeBankaifElse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double chequingBalance = 250.25d;
        double savingBalance = 120.75d;

        System.out.println("Please choose your account \n" +
                "1 for Chequing \n" +
                "2 for Saving");

        int accountType = scan.nextInt();

        if (accountType == 1) {
            System.out.println("Your chequing account balance is : $ " + chequingBalance);
            System.out.println("Please choose one of the following \n" +
                    "1 for Deposit Money\n" +
                    "2 for Withdraw Money\n" +
                    "3 for Return to previous menu");
            int chequingAccountOptions = scan.nextInt();

            if (chequingAccountOptions == 1) {
                System.out.println("Enter the amount you would like to deposit");
                double chequingDeposit = scan.nextDouble();
                System.out.println("New Chequing account balance is : $ " + (chequingBalance + chequingDeposit));
            } else if (chequingAccountOptions == 2) {
                System.out.println("Enter the amount you would like to withdraw");
                double chequingWithdraw = scan.nextDouble();
                System.out.println("New Chequing account balance is : $ " + (chequingBalance - chequingWithdraw));
                chequingBalance = (chequingBalance - chequingWithdraw);

            } else {
                //supposed to return main menu
            }



        }else if (accountType == 2) {
                        System.out.println("Your saving account balance is : $ " + savingBalance);
                        System.out.println("Please choose one of the following \n" +
                                "1 for Deposit Money\n" +
                                "2 for Withdraw Money\n" +
                                "3 for Return to previous menu");
                        int savingAccountOptions = scan.nextInt();

                        if (savingAccountOptions == 1) {
                            System.out.println("Enter the amount you would like to deposit");
                            double savingDeposit = scan.nextDouble();
                            System.out.println("New Saving account balance is : $ " + (savingBalance + savingDeposit));
                        } else if (savingAccountOptions == 2) {
                            System.out.println("Enter the amount you would like to withdraw");
                            double savingWithdraw = scan.nextDouble();
                            System.out.println("New Saving account balance is : $ " + (savingBalance - savingWithdraw));
                            savingBalance = (savingBalance - savingWithdraw);
                        }

                    } else {
                        //supposed to return main menu

                    }

            }

    }
