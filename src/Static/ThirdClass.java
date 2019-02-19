package Static;

public class ThirdClass {

    ThirdClass(){
        System.out.println("Default Constructor");
    }
    {
        System.out.println("Init Block");
    }
    static{
        System.out.println("Static Block");
    }

    public static void main(String[] args) {
        ThirdClass thirdClass = new ThirdClass();
        ThirdClass thirdClass1 = new ThirdClass();
    }
}
