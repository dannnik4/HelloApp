package Chapter3;

public class Inheritance {
    public static void main(String[] args) {
        class Person3 {

            String name;
            public String getName(){ return name; }

            public Person3(String name){

                this.name=name;
            }

            public void display(){

                System.out.println("Name: " + name);
            }
        }
        class Employee extends Person3{
            public Employee(String name){
                super(name);    // если базовый класс определяет конструктор
                //  то производный класс должен его вызвать
            }
        }
    }
}
