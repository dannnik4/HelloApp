package Chapter3;

public class ReferenceTypes {
    public static void main(String[] args) {

        Person5 tom = new Person5("Tom", 23);
        tom.display();      // Person Tom
        Person5 bob = tom;
        bob.setName("Bob");
        tom.display();      // Person Bob
    }
}
//class Person5{
//    private String name;
//    private int age;
//
//    Person5(String name, int age){
//        this.name=name;
//        this.age=age;
//    }
//    void setName(String name){
//        this.name = name;
//    }
//    void setAge(int age){
//        this.age = age;
//    }
//    void display(){
//        System.out.printf("Person Name: %s \n", name);
//    }
//}

class Person5 implements Cloneable{
    private String name;
    private int age;

    Person5(String name, int age){
        this.name=name;
        this.age=age;
    }
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    void display(){
        System.out.printf("Person %s \n", name);
    }

    public Person5 clone() throws CloneNotSupportedException{

        return (Person5) super.clone();
    }
}