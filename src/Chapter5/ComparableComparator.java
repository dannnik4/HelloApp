package Chapter5;

public class ComparableComparator {
    public static void main(String[] args) {

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

    class Person3 implements Comparable<Person3>{

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
}
