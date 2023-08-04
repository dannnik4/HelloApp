package Chapter3;

import java.util.Objects;

public class Records {
    public static void main(String[] args) {

        Person6 tom = new Person6("Tom", 36);
        System.out.println(tom.toString());
    }
}

class Person6 {
    private final String name;
    private final int age;

    Person6(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String name() { return name; }
    int age() { return age; }

    public boolean equals(Object o) {
        if (!(o instanceof Person)) return false;
        Person6 other = (Person6) o;
        return other.name == name && other.age == age;
    }

    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String toString() {
        return String.format("Person[name=%s, age=%d]", name, age);
    }
}