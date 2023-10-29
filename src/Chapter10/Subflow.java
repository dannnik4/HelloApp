package Chapter10;

import java.util.stream.Stream;

public class Subflow {
    public static void main(String[] args) {

//        Stream<Integer> numbers = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
//        numbers.takeWhile(n -> n < 0)
//                .forEach(System.out::println);

//        Stream<Integer> numbers = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
//        numbers.sorted().takeWhile(n -> n < 0)
//                .forEach(System.out::println);

        Stream<Integer> numbers = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
        numbers.sorted().dropWhile(n -> n < 0)
                .forEach(System.out::println);

        Stream<String> people1 = Stream.of("Tom", "Bob", "Sam");
        Stream<String> people2 = Stream.of("Alice", "Kate", "Sam");

        Stream.concat(people1, people2).forEach(System.out::println);

        Stream<String> people = Stream.of("Tom", "Bob", "Sam", "Tom", "Alice", "Kate", "Sam");
        people.distinct().forEach(System.out::println);
    }
}