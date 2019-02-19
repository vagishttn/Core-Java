package Object;

public class Main {

    public static void main(String[] args) {

        final Employee e1 = new Employee("Vagish",23);
        Employee e2 = new Employee("Dixit",23);

        if(e1==e2)
            System.out.println("Assigment Equal");

        if(e1.equals(e2))
            System.out.println("Dot Equal");

        System.out.println(e1+"------------- "+e1.hashCode());
        System.out.println(e2+"------------- "+e2.hashCode());

        change(e1,e2);

        System.out.println("E1 HashCode "+e1.hashCode());
        System.out.println("E2 HashCode "+e2.hashCode());

    }

    private static void change(Employee emp1, Employee emp2) {

        System.out.println("E1 HashCode "+emp1.hashCode());
        System.out.println("E2 HashCode "+emp2.hashCode());

        emp1.setAge(24);
        emp2.setName("VD");


        System.out.println("E1 HashCode "+emp1.hashCode());
        System.out.println("E2 HashCode "+emp2.hashCode());

        System.out.println(emp1);
        System.out.println(emp2);

    }

}
