package Chapter3;

public class ObjectClass {
    public static void main(String[] args) {
        Person4 tom = new Person4("Tom");
        System.out.println(tom.toString()); // Будет выводить что-то наподобие Person@7960847b
    }
}
class Person4 {

    private String name;

    public Person4(String name){

        this.name=name;
    }
}