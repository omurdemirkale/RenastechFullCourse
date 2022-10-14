package Day6_IfElseStatements;

public class Topic1_IfElseCont {
    public static void main(String[] args) {

        double points = 72.9;

        if(points<0 || points>100){
            System.out.println("Not valid Point");
        }else if(points >=90){
            System.out.println("the Grade is A");
        }else if(points >=80){
            System.out.println("the Grade is B");
        }else if(points >=70){
            System.out.println("the Grade is C");
        }else if(points >=60){
            System.out.println("the Grade is D");
        }else{
            System.out.println("the Grade is F");
        }



    }
}
