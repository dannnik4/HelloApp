package Chapter3;

public class ObjectClass {
    public static void main(String[] args) {
        Person4 tom = new Person4("Tom");
//        System.out.println(tom.toString()); // Будет выводить что-то наподобие Person@7960847b
//        System.out.println(tom.toString()); // Person Tom
//        System.out.println(tom.hashCode()); // 2036368507
        System.out.println(tom.getClass()); // class Person
    }
}
class Person4 {

    private String name;

    public Person4(String name){

        this.name=name;
    }

    @Override
//    public String toString(){
//        return "Person " + name;

//    public int hashCode(){
//        return 10 * name.hashCode() + 20456;


    public boolean equals(Object obj){

        if (!(obj instanceof Person)) return false;

        Person p = (Person)obj;
        return this.name.equals(p.name);
    }
}