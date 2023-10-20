package Chapter10;

import java.util.stream.Stream;

public class FilteringDisplay {
    public static void main(String[] args) {
        Stream<String> citiesStream = Stream.of("Париж", "Лондон", "Мадрид", "Берлин", "Брюссель");
        citiesStream.forEach(System.out::println);
    }
}