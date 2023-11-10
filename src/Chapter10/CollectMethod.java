package Chapter10;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectMethod {
    public void main(String[] args) {

//        List<String> phones = new ArrayList<String>();
//        Collections.addAll(phones, "iPhone 8", "HTC U12", "Huawei Nexus 6P",
//                "Samsung Galaxy S9", "LG G6", "Xiaomi MI6", "ASUS Zenfone 2",
//                "Sony Xperia Z5", "Meizu Pro 6", "Lenovo S850");

//        List<String> filteredPhones = phones.stream()
//                .filter(s->s.length()<10)
//                .collect(Collectors.toList());

//        Set<String> filteredPhones = phones.stream()
//                .filter(s->s.length()<10)
//                .collect(Collectors.toSet());
//
//        for(String s : filteredPhones){
//            System.out.println(s);
//        }

        Stream<Phone3> phoneStream = Stream.of(new Phone3("iPhone 8", 54000),
                new Phone3("Nokia 9", 45000),
                new Phone3("Samsung Galaxy S9", 40000),
                new Phone3("LG G6", 32000));


        Map<String, Integer> phones = phoneStream
                .collect(Collectors.toMap(p->p.getName(), t->t.getPrice()));

        phones.forEach((k,v)->System.out.println(k + " " + v));
    }
    class Phone3{

        private String name;
        private int price;

        public Phone3(String name, int price){
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
}
