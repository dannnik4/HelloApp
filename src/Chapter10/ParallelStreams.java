package Chapter10;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ParallelStreams {
    public static void main(String[] args) {

//        Stream<Integer> numbersStream = Stream.of(1, 2, 3, 4, 5, 6);
//        Optional<Integer> result = numbersStream.parallel().reduce((x, y)-> x*y);
//        System.out.println(result.get()); // 720

//        List<String> people = Arrays.asList("Tom","Bob", "Sam", "Kate", "Tim");
//
//        System.out.println("Последовательный поток");
//        people.stream().filter(p->p.length()==3).forEach(System.out::println);
//
//        System.out.println("\nПараллельный поток");
//        people.parallelStream().filter(p->p.length()==3).forEach(System.out::println);

        Stream<Integer> numbersStream = Stream.of(1, 2, 3, 4, 5, 6);
        Integer result = numbersStream.parallel().reduce(1, (x,y)->x * y);
        System.out.println(result);

//        phones.parallelStream()
//                .sorted()
//                .forEachOrdered(s->System.out.println(s));
    }
}