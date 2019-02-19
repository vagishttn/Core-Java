package InnerClass.RegularInner;

public class FirstClass {

    private int x = 10;

    public void inner()
    {
        Second second = new Second();
        second.info();
    }

    class Second {


        public void info() {
            System.out.println(x);
        }

    }

    public static void main(String[] args) {

        FirstClass firstClass = new FirstClass();
        Second sc = firstClass.new Second();
        sc.info();
        firstClass.inner();
    }
}
