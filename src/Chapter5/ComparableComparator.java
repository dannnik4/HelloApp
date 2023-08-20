package Chapter5;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparableComparator {
    public static void main(String[] args) {
//        TreeSet<Person3> people = new TreeSet<Person3>();
//        people.add(new Person3("Tom"));

//        PersonComparator pcomp = new PersonComparator();
//        TreeSet<Person3> people = new TreeSet<Person3>(pcomp);
//        people.add(new Person3("Tom"));
//        people.add(new Person3("Nick"));
//        people.add(new Person3("Alice"));
//        people.add(new Person3("Bill"));
//        for(Person3  p : people){
//
//            System.out.println(p.getName());
        }
    }

//    class Person3 {
//
//        private String name;
//
//        Person3(String name) {
//
//            this.name = name;
//        }
//
//        String getName() {
//            return name;
//        }
//    }

//    static class Person3 implements Comparable<Person3>{
//
//        private String name;
//        Person3(String name){
//
//            this.name = name;
//        }
//        String getName(){return name;}
//
////        public int compareTo(Person3 p){
////
////            return name.compareTo(p.getName());
////        }
//
//        public int compareTo(Person3 p){
//
//            return name.length()-p.getName().length();
//        }
//    }
}

//    static abstract class PersonComparator implements Comparator<Person3>{
//
//        public int compare(Person a, Person b){
//
//            return a.getName().compareTo(b.getName());
//        }
//    }

//    public interface Comparator<E> {

//        int compare(T a, T b);
//        // остальные методы
//    }

class Person3{

    private String name;
    private int age;
    public Person3(String n, int a){

        name=n;
        age=a;
    }
    String getName(){return name;}
    int getAge(){return age;}
}

class PersonNameComparator implements Comparator<Person> {

    public int compare(Person a, Person b){

        return a.getName().compareTo(b.getName());
    }
}
class PersonAgeComparator implements Comparator<Person>{

    public int compare(Person a, Person b){

        if(a.getAge()> b.getAge())
            return 1;
        else if(a.getAge()< b.getAge())
            return -1;
        else
            return 0;
    }
}