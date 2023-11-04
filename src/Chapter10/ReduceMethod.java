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

        Stream<Phone2> phoneStream = Stream.of(new Phone2("iPhone 6 S", 54000),
                new Phone2("Lumia 950", 45000),
                new Phone2("Samsung Galaxy S 6", 40000),
                new Phone2("LG G 4", 32000));

        int sum = phoneStream.reduce(0,
                (x,y)-> {
                    if(y.getPrice()<50000)
                        return x + y.getPrice();
                    else
                        return x + 0;
                },
                (x, y)->x+y);

        System.out.println(sum); // 117000
    }
}
class Phone2{

    private String name;
    private int price;

    public Phone2(String name, int price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
