package Chapter5;

import java.util.*;

public class MapHashMap {

    public static void main(String[] args) {

        Map<Integer, String> states = new HashMap<Integer, String>();
        states.put(1, "Germany");
        states.put(2, "Spain");
        states.put(4, "France");
        states.put(3, "Italy");

        // получим объект по ключу 2
        String first = states.get(2);
        System.out.println(first);
        // получим весь набор ключей
        Set<Integer> keys = states.keySet();
        // получить набор всех значений
        Collection<String> values = states.values();
        //заменить элемент
        states.replace(1, "Poland");
        // удаление элемента по ключу 2
        states.remove(2);
        // перебор элементов
        for (Map.Entry<Integer, String> item : states.entrySet()) {

            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }

        Map<String, Person4> people = new HashMap<String, Person4>();
        people.put("1240i54", new Person4("Tom"));
        people.put("1564i55", new Person4("Bill"));
        people.put("4540i56", new Person4("Nick"));

        for (Map.Entry<String, Person4> item : people.entrySet()) {

            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getName());
        }
    }
}

class Person4 {

    private String name;

    public Person4(String value) {

        name = value;
    }

    String getName() {
        return name;
    }
}