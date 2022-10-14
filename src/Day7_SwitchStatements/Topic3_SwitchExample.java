package Day7_SwitchStatements;

public class Topic3_SwitchExample {
    public static void main(String[] args) {


        int day = 6;
        switch (day){
            case 1:
                System.out.println("the fisrt day of the day is Monday");
                break;
            case 2:
                System.out.println("the second day of the day is Tuesday");
                break;
            case 3:
                System.out.println("the third day of the day is Wednesday");
                break;
            case 4:
                System.out.println("the fourth day of the day is Thursday");
                break;
            case 5:
                System.out.println("the fifth day of the day is Friday");
                break;
            case 6:
                System.out.println("the sixth day of the day is Saturday");
                break;
            case 7:
                System.out.println("the seventh day of the day is Sunday");
                break;

            default:
                System.out.println("Invalid day of the week");

        }


    }
}
