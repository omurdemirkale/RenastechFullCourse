package Homework;

public class homework7 {
    public static void main(String[] args) {

        String personName = "Omur";
        double dHeight = 5.9;
        double dWeight = 185.5;
        if(dHeight>=5.5 && (dWeight >=140 && dWeight <=250)){
            System.out.println(personName + " " + "is eligible to join military");
        }else{
            System.out.println(personName + " " + "is NOT eligible to join military");
        }

    }
}
