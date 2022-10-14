package Day7_SwitchStatements;

public class Topic1_IfElseExample {
    public static void main(String[] args) {

        String firsName = "Eloise";
        String Pre = "QA";
        int level = 3;


        if (Pre == "QA") {
            if (level == 1) {
                System.out.println(firsName + " is placed in beginner Level Class for QA");
            } else if (level == 2) {
                System.out.println(firsName + "is placed in Mid Level Class for QA");
            } else {
                System.out.println(firsName + "is placed in Advance Level Class for QA");
            }

        } else if (Pre == "SE") {
            if (level == 1) {
                System.out.println(firsName + " is placed in beginner Level Class for SE");
            } else if (level == 2) {
                System.out.println(firsName + "is placed in Mid Level Class for SE");
            } else {
                System.out.println(firsName + "is placed in Advance Level Class for SE");
            }


        } else if (Pre == "DA") {
            if (level == 1) {
                System.out.println(firsName + " is placed in beginner Level Class for DA");
            } else if (level == 2) {
                System.out.println(firsName + "is placed in Mid Level Class for DA");
            } else {
                System.out.println(firsName + "is placed in Advance Level Class for DA");
            }
        }else{
            System.out.println();
        }


    }
}








