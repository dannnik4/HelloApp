package Chapter4;

public class ExceptionClasses {
    public static void main(String[] args){

    }
    public Person clone() throws CloneNotSupportedException{

        Person p = (Person) super.clone();
        return p;
    }
}
