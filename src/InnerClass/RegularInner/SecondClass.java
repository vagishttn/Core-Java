package InnerClass.RegularInner;

public class SecondClass {
    private int x = 7;
    public void makeInner() {
        MyInner in = new MyInner();
        in.seeOuter();
        System.out.println("Inner abc is :"+in.abc);
    }
    class MyInner {
        private int abc=10;
        public void seeOuter() {
            System.out.println("Outer x is " + x);
            System.out.println("Inner class ref is " + this);
            System.out.println("Outer class ref is " + SecondClass.this);
        }
    }
    public static void main (String[] args) {
        SecondClass secondClass = new SecondClass();
        secondClass.makeInner();
    }
}
