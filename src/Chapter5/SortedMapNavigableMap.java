package Chapter5;

import java.util.*;

public class SortedMapNavigableMap {

    public static void main(String[] args) {

        TreeMap<Integer, String> states = new TreeMap<Integer, String>();
        states.put(10, "Germany");
        states.put(2, "Spain");
        states.put(14, "France");
        states.put(3, "Italy");

        // получим объект по ключу 2
        String first = states.get(2);
        // перебор элементов
        for(Map.Entry<Integer, String> item : states.entrySet()){

            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }
        // получим весь набор ключей
        Set<Integer> keys = states.keySet();
        // получить набор всех значений
        Collection<String> values = states.values();

        // получаем все объекты, которые стоят после объекта с ключом 4
        Map<Integer, String> afterMap = states.tailMap(4);

        // получаем все объекты, которые стоят до объекта с ключом 10
        Map<Integer, String> beforeMap = states.headMap(10);

        // получим последний элемент дерева
        Map.Entry<Integer, String> lastItem = states.lastEntry();

        System.out.printf("Last item has key %d value %s \n",lastItem.getKey(), lastItem.getValue());

        Map<String, Person5> people = new TreeMap<String, Person5>();
        people.put("1240i54", new Person5("Tom"));
        people.put("1564i55", new Person5("Bill"));
        people.put("4540i56", new Person5("Nick"));

        for(Map.Entry<String, Person5> item : people.entrySet()){

            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getName());
        }
    }
}
class Person5{

    private String name;
    public Person5(String name){

        this.name = name;
    }
    String getName(){return name;}
}