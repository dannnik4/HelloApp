package Chapter3;

public class AbstractClasses {
    public static void main(String[] args) {
//        abstract class Human{
//
//            private String name;
//
//            public String getName() { return name; }
//        }
//    }
//}

        Employee1 sam = new Employee1("Sam", "Leman Brothers");
        sam.display();
        Client bob = new Client("Bob", "Leman Brothers");
        bob.display();
    }
}
abstract class Person4 {

    private String name;

    public String getName() { return name; }

    public Person4(String name){

        this.name=name;
    }

    public abstract void display();
}

class Employee1 extends Person4{

    private String bank;

    public Employee1(String name, String company) {

        super(name);
        this.bank = company;
    }

    public void display(){

        System.out.printf("Employee Name: %s \t Bank: %s \n", super.getName(), bank);
    }
}

class Client extends Person4
{
    private String bank;

    public Client(String name, String company) {

        super(name);
        this.bank = company;
    }

    public void display(){

        System.out.printf("Client Name: %s \t Bank: %s \n", super.getName(), bank);
    }
}