package InnerClass.LocalInner;

public class FirstClass {

    private int x=10;

    public void doStuff()
    {
        int y=10;
        System.out.println("Inside Outter Class");
        class InnerClass{
            public void doStuff()
            {
                System.out.println("Outer Class Variable "+ x);
                System.out.println("Inner Class Variable "+ y);
                System.out.println("Inside inner Class");
            }
        }
        InnerClass innerClass = new InnerClass();
        innerClass.doStuff();
    }

    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass();
        firstClass.doStuff();
    }

}
