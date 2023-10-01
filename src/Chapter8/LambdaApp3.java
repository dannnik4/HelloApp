package Chapter8;

import java.util.Scanner;

public class LambdaApp3 {
    public static void main(String[] args) {

        Predicate<Integer> isPositive = x -> x > 0;

        System.out.println(isPositive.test(5)); // true
        System.out.println(isPositive.test(-7)); // false

        BinaryOperator<Integer> multiply = (x, y) -> x * y;

        System.out.println(multiply.apply(3, 5)); // 15
        System.out.println(multiply.apply(10, -2)); // -20

        UnaryOperator<Integer> square = x -> x*x;
        System.out.println(square.apply(5)); // 25

        Function<Integer, String> convert = x-> String.valueOf(x) + " долларов";
        System.out.println(convert.apply(5)); // 5 долларов

        Consumer<Integer> printer = x-> System.out.printf("%d долларов \n", x);
        printer.accept(600); // 600 долларов

        Supplier<User> userFactory = ()->{

            Scanner in = new Scanner(System.in);
            System.out.println("Введите имя: ");
            String name = in.nextLine();
            return new User(name);
        };

        User user1 = userFactory.get();
        User user2 = userFactory.get();

        System.out.println("Имя user1: " + user1.getName());
        System.out.println("Имя user2: " + user2.getName());
    }
}

interface Predicate<T> {
    boolean test(T t);
}

interface BinaryOperator<T> {
    T apply(T t1, T t2);
}

interface UnaryOperator<T> {
    T apply(T t);
}

interface Function<T, R> {
    R apply(T t);
}

interface Consumer<T> {
    void accept(T t);
}

interface Supplier<T> {
    T get();
}

class User{

    private String name;
    String getName(){
        return name;
    }

    User(String n){
        this.name=n;
    }
}