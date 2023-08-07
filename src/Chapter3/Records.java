package Chapter3;

import java.util.Objects;

public class Records {
    public static void main(String[] args) {

//        Person tom = new Person("Tom", 36);
//        System.out.println(tom.toString());

//        Person6 tom = new Person6("Tom",  36);
//
//        System.out.println(tom.name());     // Tom
//        System.out.println(tom.age());      // 36
//        System.out.println(tom.hashCode());
//
//        Person bob = new Person("Bob", 21);
//        Person tomas = new Person("Tom", 36);
//        System.out.println(tom.equals(bob));    // false
//        System.out.println(tom.equals(tomas));  // true

//        Person6 tom = new Person6("Tom", -116);
//        System.out.println(tom.toString());

//        Person6 tom = new Person6("Tom",  36);
//        System.out.println(tom.toString());
//        System.out.println(tom.name());

        Person6 tom = new Person6("Tom", "Smith",  36);
        System.out.println(tom.toString());
    }
}

//class Person6 {
//    private final String name;
//    private final int age;
//
//    Person6(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    String name() { return name; }
//    int age() { return age; }
//
//    public boolean equals(Object o) {
//        if (!(o instanceof Person)) return false;
//        Person6 other = (Person6) o;
//        return other.name == name && other.age == age;
//    }
//
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }
//
//    public String toString() {
//        return String.format("Person[name=%s, age=%d]", name, age);
//    }

//record Person6(String name, int age) { }
record Person6(String name, int age) {

//    Person6{
//
//        if(age<1 || age > 110){
//            age = 18;
//        }

//    Person6(String name, int age) {
//
//        if (age < 0 || age > 120) age = 18;
//
//        this.name = name;
//        this.age = age;
//    }

    Person6(String firstName, String lastName, int age) {

        this(firstName + " " + lastName, age);
    }
}