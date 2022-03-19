package classandobject;

public class Hello {
    public static void main(String[] args) {
        //object is an instance of a class
        //syntax: ClassName objectName = new ClassName();
        //object of a class inherits all the class properties

        World myWorld = new World();
        System.out.println(myWorld.name);
        myWorld.name = "new john";
        System.out.println(myWorld.name);

    }
}