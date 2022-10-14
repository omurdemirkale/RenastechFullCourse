package Homework;

public class homework8 {
    public static void main(String[] args) {
        String firstName = "Omur";
        String lastName = "Demirkale";
        int creditScore = 700 ;
        if( creditScore < 500){
            System.out.println(firstName + " " + lastName + " " + "has bad credit score");
        }else if(creditScore >=500 && creditScore <= 700){
            System.out.println(firstName + " " + lastName + " " + "has Average credit score");
        }else if(creditScore >700 && creditScore <= 750){
            System.out.println(firstName + " " + lastName + " " + "has Good credit score");
        }else if(creditScore >750){
            System.out.println(firstName + " " + lastName + " " + "has Great credit score");
        }else{
            System.out.println("Invalid Entry");
        }
    }
}
