package Chapter10;

import java.util.Optional;
import java.util.stream.Stream;

public class ParallelStreams {
    public static void main(String[] args) {

        Stream<Integer> numbersStream = Stream.of(1, 2, 3, 4, 5, 6);
        Optional<Integer> result = numbersStream.parallel().reduce((x, y)-> x*y);
        System.out.println(result.get());
    }
}