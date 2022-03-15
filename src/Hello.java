public class Hello {
    public static void main(String[] args){

        /*
        Java syntax:
        Class name should start with capital
        Everything you write in java must be in a class
        Class is delimited by curly brackets
        Main method is required and you will see it in every java program
        The code inside main will be executed
        Print statement is a method to print a line of text to the screen
        By convention java use camel case for naming (example: exampleCamelCaseName)
        */

        //this is a one line comment

        /*
        this is
        a multi line
        comment
        */

        //print statement with new line
        System.out.println("Hello Selenium");
        System.out.println("Hello Students");

        //print statement without new line
        //System.out.print("Hello All");

        //Variables or data type: numbers/character/chain characters/true or false

        //primitive variables
        //numbers:
            //whole number
            byte b = 127;//1 byte
            short s = 24642;//2 bytes
            int x = 1765569660;//4 bytes
            long l = 1254345698579045785L;//8 bytes

            //decimal or fraction
            float f = 1.5676544535334565645343F;//4 bytes
            double d = 1.766535467809435676345678765467876544;//8 bytes

        //character
        char y = 'a';//2 bytes

        //boolean (true or false)
        boolean w = true;//1 bit (1/8 byte)

        //non-primitive variables
        //chain characters
        String str = "John Doe";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.replace(" ", "+++"));

        //array: variable that hold multiple values in the same time
        int[] array1 = {1, 2, 3, 4, 5};

        String[] array2 = {"John", "kevin", "david"};

        //variable declaration: variableType variableName;
        /*
        for array: arrayType[] arrayName;
         */
        int a;
        int[] array3;

        //variable assignment: variableName = variableValue;
        /*
        for array: arrayName = new arrayType[arrayLimit];
        array[index] = variableValue;
         */
        a = 1234;
        array3 = new int[5];
        array3[0] = 6;
        array3[1] = 5;
        array3[2] = 2;
        array3[3] = 5;
        array3[4] = 2;

        //in line variable declaration and assignment: variableType variableName = variableValue;
        /*
        for array: arrayType[] arrayName = {value1, value2, value3};
         */
        int z = 12345;
        int[] array4 = {1, 2, 3, 4, 5};

    }
}