package Static;

public class FirstClass {

    static void doStuff()
    {
        System.out.println("First Class");
    }

}

class SecondClass extends FirstClass{

    static void doStuff()
    {
        System.out.println("Second Class");
    }

    public static void main(String[] args) {

        SecondClass.doStuff();
        FirstClass.doStuff();

    }

}
