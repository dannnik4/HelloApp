package Chapter3;

public class ReferenceTypes {
    public static void main(String[] args) {

        Person5 tom = new Person5("Tom", 23);
        tom.display();      // Person Tom
        Person5 bob = tom;
        bob.setName("Bob");
        tom.display();      // Person Bob
    }
}
//class Person5{
//    private String name;
//    private int age;
//
//    Person5(String name, int age){
//        this.name=name;
//        this.age=age;
//    }
//    void setName(String name){
//        this.name = name;
//    }
//    void setAge(int age){
//        this.age = age;
//    }
//    void display(){
//        System.out.printf("Person Name: %s \n", name);
//    }
//}

class Person5 implements Cloneable{
    private String name;
    private int age;

    Person5(String name, int age){
        this.name=name;
        this.age=age;
    }
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    void display(){
        System.out.printf("Person %s \n", name);
    }

    public Person5 clone() throws CloneNotSupportedException{

        return (Person5) super.clone();
    }
}

class Book1 implements Cloneable{

    private String name;
    private Author author;

    public void setName(String n){ name=n;}
    public String getName(){ return name;}

    public void setAuthor(String n){ author.setName(n);}
    public String getAuthor(){ return author.getName();}

    Book1(String name, String author){

        this.name = name;
        this.author = new Author(author);
    }

    public String toString(){

        return "Книга '" + name + "' (автор " +  author + ")";
    }

    public Book1 clone() throws CloneNotSupportedException{

        return (Book1) super.clone();
    }
}

class Author{

    private String name;

    public void setName(String n){ name=n;}
    public String getName(){ return name;}

    public Author(String name){

        this.name=name;
    }
}