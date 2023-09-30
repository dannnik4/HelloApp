package Package8;

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