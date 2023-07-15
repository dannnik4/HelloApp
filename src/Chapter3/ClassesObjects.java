package Chapter3;

class ClassesObjects {
//    String name;        // имя
//    int age;            // возраст
//
//    void displayInfo() {
//        System.out.printf("Name: %s \tAge: %d\n", name, age);
//    }

//    public static void main(String[] args) {
//
//        Person tom;
//    }
//}
//
//class Person {
//
//    String name;    // имя
//    int age;        // возраст
//
//    void displayInfo() {
//        System.out.printf("Name: %s \tAge: %d\n", name, age);
//    }

//    public static void main(String[] args) {
//
//        Person tom = new Person(); // создание объекта
//        tom.displayInfo();
//
//        // изменяем имя и возраст
//        tom.name = "Tom";
//        tom.age = 34;
//        tom.displayInfo();
//    }
//}
//class Person{
//
//    String name;    // имя
//    int age;        // возраст
//    void displayInfo(){
//        System.out.printf("Name: %s \tAge: %d\n", name, age);
//    }

//    public static void main(String[] args) {
//
//        Person bob = new Person();      // вызов первого конструктора без параметров
//        bob.displayInfo();
//
//        Person tom = new Person("Tom"); // вызов второго конструктора с одним параметром
//        tom.displayInfo();
//
//        Person sam = new Person("Sam", 25); // вызов третьего конструктора с двумя параметрами
//        sam.displayInfo();
//    }
//}
//class Person{
//
//    String name;    // имя
//    int age;        // возраст
//    Person()
//    {
//        name = "Undefined";
//        age = 18;
//    }
//    Person(String n)
//    {
//        name = n;
//        age = 18;
//    }
//    Person(String n, int a)
//    {
//        name = n;
//        age = a;
//    }
//    void displayInfo(){
//        System.out.printf("Name: %s \tAge: %d\n", name, age);
//    }

//    public static void main(String[] args) {
//
//        Person undef = new Person();
//        undef.displayInfo();
//
//        Person tom = new Person("Tom");
//        tom.displayInfo();
//
//        Person sam = new Person("Sam", 25);
//        sam.displayInfo();
//    }
//}
//class Person{
//
//    String name;    // имя
//    int age;        // возраст
//    Person()
//    {
//        this("Undefined", 18);
//    }
//    Person(String name)
//    {
//        this(name, 18);
//    }
//    Person(String name, int age)
//    {
//        this.name = name;
//        this.age = age;
//    }
//    void displayInfo(){
//        System.out.printf("Name: %s \tAge: %d\n", name, age);
//    }

    public static void main(String[] args) {

        Person undef = new Person();
        undef.displayInfo();

        Person tom = new Person("Tom");
        tom.displayInfo();
    }
}
class Person{

    String name;    // имя
    int age;        // возраст

    /*начало блока инициализатора*/
    {
        name = "Undefined";
        age = 18;
    }
    /*конец блока инициализатора*/
    Person(){

    }
    Person(String name){

        this.name = name;
    }
    Person(String name, int age){

        this.name = name;
        this.age = age;
    }
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}
