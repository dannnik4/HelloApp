package Chapter3;

public class AccessModifiers {
//    public static void main(String[] args) {
//
//        Person1 kate = new Person1("Kate", 32, "Baker Street", "+12334567");
//        kate.displayName();     // норм, метод public
//        kate.displayAge();      // норм, метод имеет модификатор по умолчанию
//        kate.displayPhone();    // норм, метод protected
//        //kate.displayAddress();  // ! Ошибка, метод private
//
//        System.out.println(kate.name);      // норм, модификатор по умолчанию
//        System.out.println(kate.address);   // норм, модификатор public
//        System.out.println(kate.age);       // норм, модификатор protected
//        //System.out.println(kate.phone);   // ! Ошибка, модификатор private
//    }
//}
//
//class Person1 {
//
//    String name;
//    protected int age;
//    public String address;
//    private String phone;
//
//    public Person1(String name, int age, String address, String phone) {
//        this.name = name;
//        this.age = age;
//        this.address = address;
//        this.phone = phone;
//    }
//
//    public void displayName() {
//        System.out.printf("Name: %s \n", name);
//    }
//
//    void displayAge() {
//        System.out.printf("Age: %d \n", age);
//    }
//
//    private void displayAddress() {
//        System.out.printf("Address: %s \n", address);
//    }
//
//    protected void displayPhone() {
//        System.out.printf("Phone: %s \n", phone);
//    }

    public static void main(String[] args) {

        Person1 kate = new Person1("Kate", 30);
        System.out.println(kate.getAge());      // 30
        kate.setAge(33);
        System.out.println(kate.getAge());      // 33
        kate.setAge(123450);
        System.out.println(kate.getAge());      // 33
    }
}

class Person1 {

    private String name;
    private int age = 1;

    public Person1(String name, int age) {

        setName(name);
        setAge(age);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 110)
            this.age = age;
    }
}
