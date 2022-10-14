package Day5_IfElseStatements;

public class Topic1_PrimitiveCasting {
    public static void main(String[] args) {
        //primitive casting is to change the primitive data type but when we do the casting
        //lower level to upper level we will have issues.
        //we put type of data in front of it.

        byte by = 40;
        System.out.println("the byte value is: " + by);
        int inNum = (int)by;
        System.out.println(inNum);
        //int inNum = by;  other way to do it

        int a = 89009798; //  (10101010101010101010) binary representation
        short b = (short)a;
        System.out.println(b);

        int num1 = 90;
        System.out.println("the num1 value in int is : " +num1);

        float num2 = (float)num1;
        System.out.println("the value is in float: " +num2);

        int num3 = 89;
        int num4 = 23;
        float num5 =(float) num3/num4;
        System.out.println("the operation result is : " +num5);


    }
}
