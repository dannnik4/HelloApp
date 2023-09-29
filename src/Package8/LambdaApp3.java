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