package Chapter3;

public class InheritanceHierarchy {
    public static void main(String[] args) {
        Person4 tom = new Person4("Tom");
        tom.display();
        Person4 sam = new Employee("Sam", "Oracle");
        sam.display();
        Person4 bob = new Client("Bob", "DeutscheBank", 3000);
        bob.display();
    }
}
// класс человека
class Person4 {

    private String name;

    public String getName() { return name; }

    public Person4(String name){

        this.name=name;
    }

    public void display(){

        System.out.printf("Person %s \n", name);
    }
}
// служащий некоторой компании
class Employee extends Person4{

    private String company;

    public Employee(String name, String company) {

        super(name);
        this.company = company;
    }
    public String getCompany(){ return company; }

    public void display(){

        System.out.printf("Employee %s works in %s \n", super.getName(), company);
    }
}
// класс клиента банка
class Client extends Person4{

    private int sum; // Переменная для хранения суммы на счете
    private String bank;

    public Client(String name, String bank, int sum) {

        super(name);
        this.bank=bank;
        this.sum=sum;
    }

    public void display(){

        System.out.printf("Client %s has account in %s \n", super.getName(), bank);
    }

    public String getBank(){ return bank; }
    public int getSum(){ return sum; }
}