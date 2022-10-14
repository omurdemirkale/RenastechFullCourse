package Day6_IfElseStatements;

public class Topic5_nestedIfElseStatements {
    public static void main(String[] args) {
        int number = 40;
        if (number % 2 == 0) {
            if (number >= 10 && number < 40) {
                number = number * 2;
                System.out.println("the result is : " + number);
            } else {
                System.out.println("the result is : " + number);
            }
        } else {
            if (number >= 33 && number < 99) {
                number = number * 3;
                System.out.println("the result is :" + number);
            } else {
                number = number * 2;
                System.out.println("the result is : " + number);
            }
        }

    }
}
