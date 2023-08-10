package Chapter4;

public class ExceptionClasses {
    public static void main(String[] args) {
        try {
            int x = 6 / 0;
        } catch (Exception ex) {

            ex.printStackTrace();
        }
    }

//    public Person clone() throws CloneNotSupportedException {
//
//        Person p = (Person) super.clone();
//        return p;
//    }
}
