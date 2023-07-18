package Chapter3;

public class StaticMembers {
    public static void main(String[] args) {

        Person2 tom = new Person2();
        Person2 bob = new Person2();

        tom.displayId();    // Id = 1
        bob.displayId();    // Id = 2
        System.out.println(Person2.counter); // 3

        // изменяем Person.counter
        Person2.counter = 8;

        Person2 sam = new Person2();
        sam.displayId();    // Id = 8
    }
}

class Person2 {

    private int id;
    static int counter = 1;

    Person2() {
        id = counter++;
    }

    public void displayId() {

        System.out.printf("Id: %d \n", id);
    }
}
