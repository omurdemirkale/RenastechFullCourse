package Homework;

public class homework5 {
    public static void main(String[] args) {
        double Temp =70;
        if(Temp <= 10){
            System.out.println("The Weather is So Cold");
        }else if(Temp > 10 && Temp <= 40){
            System.out.println("The Weather is cold");
        }else if(Temp > 40 && Temp <=70){
            System.out.println("The Weather is Good");
        }else if(Temp > 70 && Temp <= 90){
            System.out.println("The Weather is Hot");
        }else if(Temp >=90){
            System.out.println("The Weather is So Hot");
        }else{
            System.out.println("Invalid Data");
        }


    }
}
