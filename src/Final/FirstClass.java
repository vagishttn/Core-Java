package Final;

public class FirstClass {

    private final int x;

    FirstClass(int value){
       this.x=value;
    }

    public int getX() {
        return x;
    }

    final void doStuff()
    {
        System.out.println("First Class");
    }

   //Cannot Set value to final variable

//    public void setX(int value)
//    {
//        this.x=value;
//    }
}

class Second extends FirstClass{

    Second(int value) {
        super(value);
    }

//Cannot override final Method

//    void doStuff()
//    {
//        System.out.println("Second Class");
//    }
}
