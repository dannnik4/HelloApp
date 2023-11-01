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

        ArrayList<String> names = new ArrayList<String>(Arrays.asList(new String[]{"Tom", "Sam", "Bob", "Alice"}));

        // есть ли в потоке строка, длина которой больше 3
        boolean any = names.stream().anyMatch(s->s.length()>3);
        System.out.println(any);    // true

        // все ли строки имеют длину в 3 символа
        boolean all = names.stream().allMatch(s->s.length()==3);
        System.out.println(all);    // false

        // НЕТ ЛИ в потоке строки "Bill". Если нет, то true, если есть, то false
        boolean none = names.stream().noneMatch(s->s=="Bill");
        System.out.println(none);   // true
    }
}
