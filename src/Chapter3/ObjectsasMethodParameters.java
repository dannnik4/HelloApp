package Chapter3;

public class ObjectsasMethodParameters {
    public static void main(String[] args) {

//        Person2 kate = new Person2("Kate");
//        System.out.println(kate.getName());     // Kate
//        changeName(kate);
//        System.out.println(kate.getName());     // Alice
//    }
//
//    static void changeName(Person2 p) {
//        p.setName("Alice");
//    }
//}
//
//class Person2 {
//
//    private String name;
//
//    Person2(String name) {
//        this.name = name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//
//        return this.name;
//    }
//}

        Person2 kate = new Person2("Kate");
        System.out.println(kate.getName());     // Kate
        changePerson(kate);
        System.out.println(kate.getName());     // Kate - изменения не произошло
        // kate хранит ссылку на старый объект
    }

    static void changePerson(Person2 p) {
        p = new Person2("Alice");    // p указывает на новый объект
        p.setName("Ann");
    }

    static void changeName(Person2 p) {
        p.setName("Alice");
    }
}

class Person2 {

    private String name;

    Person2(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return this.name;
    }
}