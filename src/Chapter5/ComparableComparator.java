package Chapter5;

import java.util.TreeSet;

public class ComparableComparator {
    public static void main(String[] args) {
        TreeSet<Person3> people = new TreeSet<Person3>();
        people.add(new Person3("Tom"));
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

    static class Person3 implements Comparable<Person3>{

        private String name;
        Person3(String name){

            this.name = name;
        }
        String getName(){return name;}

//        public int compareTo(Person3 p){
//
//            return name.compareTo(p.getName());
//        }

        public int compareTo(Person3 p){

            return name.length()-p.getName().length();
        }
    }

//    public interface Comparator<E> {
//
//        int compare(T a, T b);
//        // остальные методы
//    }
}
