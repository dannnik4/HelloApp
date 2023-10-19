package Chapter10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class DataFlow {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<String>();
        Collections.addAll(cities, "Париж", "Лондон", "Мадрид");
        cities.stream() // получаем поток
                .filter(s->s.length()==6) // применяем фильтрацию по длине строки
                .forEach(System.out::println); // выводим отфильтрованные строки на консоль

        Stream<String> citiesStream = cities.stream(); // получаем поток
        citiesStream = citiesStream.filter(s->s.length()==6); // применяем фильтрацию по длине строки
        citiesStream.forEach(System.out::println); // выводим отфильтрованные строки на консоль
    }
}