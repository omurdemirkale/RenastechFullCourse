package Exercises;

public class exercise_Methods {
    public static void main(String[] args) {
        double newAccountBalance = bankAccount("John Lemon", 1000,500);


System.out.println("Acoount balance is  " + newAccountBalance);

        newAccountBalance = bankAccount("John Lemon", 1000,500);

        System.out.println("Acoount balance is  " + newAccountBalance);
        newAccountBalance = bankAccount("John Lemon", 1000,500);

        System.out.println("Acoount balance is  " + newAccountBalance);


    }

    public static double bankAccount(String accountHolderName, double depositAmount, double withdrawAmount) {
        double accountBalance = 0;
        accountBalance = accountBalance + depositAmount - withdrawAmount;
        if (accountBalance >= 0) {
return accountBalance;
        } else {
            System.out.println(accountHolderName + "'s " + "new account balance is " + accountBalance + " and it is insufficient");
return -1;
        }
        }
    }
