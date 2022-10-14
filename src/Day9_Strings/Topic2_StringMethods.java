package Day9_Strings;

public class Topic2_StringMethods {
    public static void main(String[] args) {

        /*

Method	              Description                                                     	Return Type
charAt()	          Returns the character at the specified index (position)	        char
concat()	          Appends a string to the end of another string	                    String
contains()	          Checks whether a string contains a sequence of characters	        boolean
endsWith()	          Checks whether a string ends with the specified character(s)	    boolean
equals()	          Compares two strings. Returns true if the strings are equal,
                      and false if not	                                                boolean
equalsIgnoreCase()	  Compares two strings, ignoring case considerations	            boolean
indexOf()	          Returns the position of the first found occurrence
                      of specified characters in a string	                            int
isEmpty()	          Checks whether a string is empty or not	                        boolean
lastIndexOf()	      Returns the position of the last found occurrence of
                      specified characters in a string	                                int
length()	          Returns the length of a specified string	                        int
replace()	          Searches a string for a specified value, and returns
                      a new string where the specified values are replaced	            String
replaceFirst()	      Replaces the first occurrence of a substring that matches the
                      given regular expression with the given replacement	            String

startsWith()	      Checks whether a string starts with specified characters	        boolean
substring()	          Extracts the characters from a string,
                      beginning at a specified start position,
                      and through the specified number of character	                    String
toLowerCase()	      Converts a string to lower case letters	                        String
toUpperCase()	      Converts a string to upper case letters	                        String
trim()	              Removes whitespace from both ends of a string	                    String

     */


        String str = "Tanya";
char ch = str.charAt(0);
        System.out.println("Char at the position 0 is " + ch);
// concat()	          Appends a string to the end of another string	                    String
        String firstName = "Ziya";
        String lastName = "Yilmaz";
        String fullName= firstName.concat(lastName);
        System.out.println(fullName);
       // contains()	          Checks whether a string contains a sequence of characters	        boolean

        String name= "Omur Demirkale";
        boolean con = name.contains("m");
        System.out.println(con);
//endsWith()	          Checks whether a string ends with the specified character(s)	    boolean

        String str4 = "This is the String";
        boolean ends = str4.endsWith("ing");
        System.out.println("Does String end with ing: " + ends);

        //equals()	          Compares two strings. Returns true if the strings are equal,
        //                      and false if not	                                                boolean

        String str5 = "Hello";
        String str6 = "Hello";

        boolean equal = str5.equals(str6);
        System.out.println("Are they equal ?" +equal);

        String str7 = new String("Hello");

        boolean equal1 = str5.equals(str7);
        System.out.println("Are they equal?" + equal1 );


//equalsIgnoreCase()	  Compares two strings, ignoring case considerations	            boolean




//indexOf()	          Returns the position of the first found occurrence
//                      of specified characters in a string	                            int

        String str10 = "eloise";
        int index = str10.indexOf('e');
        System.out.println("Index of e on the string is :" +index);

    //    lastIndexOf()	      Returns the position of the last found occurrence of
            //                      specified characters in a string	                                int


            String str11 = "eloisesadasdwwe";
            int index1 = str11.lastIndexOf('e');
            System.out.println("Index of e on the string is :" +index1);

//isEmpty()	          Checks whether a string is empty or not	                        boolean

            String str12 = " "; // SPACE IS NOT EMPTY
            boolean index2 = str12.isEmpty();
            System.out.println("Index of e on the string is :" +index2);

//length()	          Returns the length of a specified string	                        int


            String str13 = "asddsfgdsfertertgdfgertergefgdfgrgasegfdh";//41 caracters
            System.out.println(str13.length());



    }
}
