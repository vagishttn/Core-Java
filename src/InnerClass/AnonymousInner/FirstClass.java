package InnerClass.AnonymousInner;

public class FirstClass {

    public void info(){
        System.out.println("Inside FirstClass");
    }

}

interface MyInterface{
   default void abcd()
   {
       System.out.println("abcd");
   }
    void go();
}

class Second{
    FirstClass firstClass  = new FirstClass(){
        public void info(){
            System.out.println("Inside Second Class");
        }
    };

    MyInterface myInterface = new MyInterface() {
        @Override
        public void go() {
            System.out.println("Hello");
        }
    };

    public static void main(String[] args) {
        Second second = new Second();
        second.firstClass.info();
        second.myInterface.go();
        second.myInterface.abcd();
    }


}
