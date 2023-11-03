package Chapter10;

import java.util.Optional;
import java.util.stream.Stream;

public class ReduceMethod {
    public static void main(String[] args) {

        Stream<Integer> numbersStream = Stream.of(1,2,3,4,5,6);
        Optional<Integer> result = numbersStream.reduce((x, y)->x*y);
        System.out.println(result.get()); // 720

        Stream<String> wordsStream = Stream.of("мама", "мыла", "раму");
        Optional<String> sentence = wordsStream.reduce((x,y)->x + " " + y);
        System.out.println(sentence.get());

        Stream<Integer> numberStream = Stream.of(-4, 3, -2, 1);
        int identity = 1;
        result = Optional.of(numberStream.reduce(identity, (x, y) -> x * y));
        System.out.println(result);  // 24
    }
}
