package Package8;

public class LambdaApp3 {
    public static void main(String[] args) {

        Predicate<Integer> isPositive = x -> x > 0;

        System.out.println(isPositive.test(5)); // true
        System.out.println(isPositive.test(-7)); // false
    }
}

interface Predicate<T> {
    boolean test(T t);
}