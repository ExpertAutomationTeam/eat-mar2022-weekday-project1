package datatype.nonprimitive;

public class UseString {
    public static void main(String[] args) {
        //non-primitive variables
        //chain characters
        String str = "John Doe";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.replace(" ", "+++"));

        //+ sign in java
        //+ sign does concatenation with strings
        String str2 = "classandobject.Hello";
        System.out.println(str2 + " " + str);

        //+ does math with numbers
        System.out.println(4 + 7);
    }
}
