package Chapter10;

import java.util.stream.Stream;

public class FilteringDisplay {
    public static void main(String[] args) {
//        Stream<String> citiesStream = Stream.of("Париж", "Лондон", "Мадрид", "Берлин", "Брюссель");
//        citiesStream.forEach(System.out::println);

        Stream<String> citiesStream = Stream.of("Париж", "Лондон", "Мадрид","Берлин", "Брюссель");
        citiesStream.filter(s->s.length()==6).forEach(System.out::println);
    }

    class Phone{

        private String name;
        private int price;

        public Phone(String name, int price){
            this.name=name;
            this.price=price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }
}