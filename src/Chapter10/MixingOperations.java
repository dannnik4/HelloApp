package Chapter10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class MixingOperations {
    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList<String>(Arrays.asList(new String[]{"Tom", "Sam", "Bob", "Alice"}));
//        System.out.println((long) names.size());  // 4
//
//        // количество элементов с длиной не больше 3 символов
//        System.out.println(names.stream().filter(n->n.length()<=3).count());  // 3

//        ArrayList<String> names = new ArrayList<String>(Arrays.asList(new String[]{"Tom", "Sam", "Bob", "Alice"}));
//
//        Optional<String> first = names.stream().findFirst();
//        System.out.println(first.get());    // Tom
//
//        Optional<String> any = names.stream().findAny();
//        System.out.println(first.get());    // Tom

//        ArrayList<String> names = new ArrayList<String>(Arrays.asList(new String[]{"Tom", "Sam", "Bob", "Alice"}));
//
//        // есть ли в потоке строка, длина которой больше 3
//        boolean any = names.stream().anyMatch(s->s.length()>3);
//        System.out.println(any);    // true
//
//        // все ли строки имеют длину в 3 символа
//        boolean all = names.stream().allMatch(s->s.length()==3);
//        System.out.println(all);    // false
//
//        // НЕТ ЛИ в потоке строки "Bill". Если нет, то true, если есть, то false
//        boolean none = names.stream().noneMatch(s->s=="Bill");
//        System.out.println(none);   // true

//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        numbers.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9}));
//
//        Optional<Integer> min = numbers.stream().min(Integer::compare);
//        Optional<Integer> max = numbers.stream().max(Integer::compare);
//        System.out.println(min.get());  // 1
//        System.out.println(max.get());  // 9

        ArrayList<Phone1> phones = new ArrayList<Phone1>();
        phones.addAll(Arrays.asList(new Phone1[]{
                new Phone1("iPhone 8", 52000),
                new Phone1("Nokia 9", 35000),
                new Phone1("Samsung Galaxy S9", 48000),
                new Phone1("HTC U12", 36000)
        }));

        Phone1 min = phones.stream().min(Phone1::compare).get();
        Phone1 max = phones.stream().max(Phone1::compare).get();
        System.out.printf("MIN Name: %s Price: %d \n", min.getName(), min.getPrice());
        System.out.printf("MAX Name: %s Price: %d \n", max.getName(), max.getPrice());
    }
}
class Phone1{

    private String name;
    private int price;

    public Phone1(String name, int price){
        this.name=name;
        this.price=price;
    }
    public static int compare (Phone1 p1, Phone1 p2){
        if(p1.getPrice() > p2.getPrice())
            return 1;
        return -1;
    }
    public String getName() { return name; }
    public int getPrice() { return price;}
}