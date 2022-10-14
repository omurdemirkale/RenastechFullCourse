package Exercises;

import java.util.Scanner;

public class Bankaccount_Denemeler {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int accountType = 3;


            int chequingAccountOptions = 0;
            double chequingBalance = 250.25d;
            double savingBalance = 120.75d;
            System.out.println("Please enter you user name");
            int username = scan.nextInt();
            System.out.println("Please enter your PIN number ");
            int pin = scan.nextInt();

            if (username == 1234 && pin == 1234) {


                do {
                    System.out.println("Please choose your account \n" +
                            "1 for Chequing \n" +
                            "2 for Saving");
                    accountType = scan.nextInt();


                    switch (accountType) {

                        case 1: //chequing account main manu

                            System.out.println("Please choose one of the following \n" +
                                    "1 for Deposit Money\n" +
                                    "2 for Withdraw Money\n" +
                                    "3 Check your balance\n" +
                                    "4 for Return to previous menu");
                            chequingAccountOptions = scan.nextInt();

                            switch (chequingAccountOptions) {
                                case 1: //deposit money
                                    System.out.println("Enter the amount you would like to deposit");
                                    double chequingDeposit = scan.nextDouble();
                                    System.out.println("New Chequing account balance is : $ " + (chequingBalance + chequingDeposit));
                                    break;
                                case 2: //Withdraw money
                                    System.out.println("Enter the amount you would like to withdraw");
                                    double chequingWithdraw = scan.nextDouble();
                                    System.out.println("New Chequing account balance is : $ " + (chequingBalance - chequingWithdraw));
                                    chequingBalance = (chequingBalance - chequingWithdraw);
                                    break;
                                case 3:
                                    System.out.println("Your chequing account balance is : $ " + chequingBalance);

                                    break;
                                case 4:
                                    break;
                            }


                            break;


                        case 2://saving account main menu
                            System.out.println("Your saving account balance is : $ " + savingBalance);
                            System.out.println("Please choose one of the following \n" +
                                    "1 for Deposit Money\n" +
                                    "2 for Withdraw Money\n" +
                                    "3 Check your balance\n" +
                                    "4 for Return to previous menu");
                            int savingAccountOptions = scan.nextInt();
                            switch (savingAccountOptions) {
                                case 1: //deposit money
                                    System.out.println("Enter the amount you would like to deposit");
                                    double savingDeposit = scan.nextDouble();
                                    System.out.println("New Saving account balance is : $ " + (savingBalance + savingDeposit));
                                    break;
                                case 2: //Withdraw money
                                    System.out.println("Enter the amount you would like to withdraw");
                                    double savingWithdraw = scan.nextDouble();
                                    System.out.println("New Saving account balance is : $ " + (savingBalance - savingWithdraw));
                                    savingBalance = (savingBalance - savingWithdraw);
                                    break;
                                case 3:
                                    System.out.println("Your saving account balance is : $ " + savingBalance);
                                    break;
                                default:
                                    System.out.println("Have a nice day");
                                    break;
                            }
                        case 3 :
                            break;
                    }

                } while (accountType != 1 || accountType != 2);

                System.out.println("invalid entry");
            } else {
                System.out.println("Wrong username and Pin");
            }

        }
    }
