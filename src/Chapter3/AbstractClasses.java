package Chapter3;

public class AbstractClasses {
    public static void main(String[] args) {
//        abstract class Human{
//
//            private String name;
//
//            public String getName() { return name; }
//        }
//    }
//}

//        Employee1 sam = new Employee1("Sam", "Leman Brothers");
//        sam.display();
//        Client bob = new Client("Bob", "Leman Brothers");
//        bob.display();
//    }
//}
//abstract class Person4 {
//
//    private String name;
//
//    public String getName() { return name; }
//
//    public Person4(String name){
//
//        this.name=name;
//    }
//
//    public abstract void display();
//}
//
//class Employee1 extends Person4{
//
//    private String bank;
//
//    public Employee1(String name, String company) {
//
//        super(name);
//        this.bank = company;
//    }
//
//    public void display(){
//
//        System.out.printf("Employee Name: %s \t Bank: %s \n", super.getName(), bank);
//    }
//}
//
//class Client extends Person4
//{
//    private String bank;
//
//    public Client(String name, String company) {
//
//        super(name);
//        this.bank = company;
//    }
//
//    public void display(){
//
//        System.out.printf("Client Name: %s \t Bank: %s \n", super.getName(), bank);
//    }
//}

        // абстрактный класс фигуры
        abstract class Figure {

            float x; // x-координата точки
            float y; // y-координата точки

            Figure(float x, float y) {

                this.x = x;
                this.y = y;
            }

            // абстрактный метод для получения периметра
            public abstract float getPerimeter();

            // абстрактный метод для получения площади
            public abstract float getArea();
        }
        // производный класс прямоугольника
        class Rectangle extends Figure {
            private float width;
            private float height;

            // конструктор с обращением к конструктору класса Figure
            Rectangle(float x, float y, float width, float height) {

                super(x, y);
                this.width = width;
                this.height = height;
            }

            public float getPerimeter() {

                return width * 2 + height * 2;
            }

            public float getArea() {

                return width * height;
            }
        }
    }
}