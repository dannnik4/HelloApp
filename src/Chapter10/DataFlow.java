package Chapter10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class DataFlow {

    public static void main(String[] args) {

//        ArrayList<String> cities = new ArrayList<String>();
//        Collections.addAll(cities, "Париж", "Лондон", "Мадрид");
//        cities.stream() // получаем поток
//                .filter(s->s.length()==6) // применяем фильтрацию по длине строки
//                .forEach(System.out::println); // выводим отфильтрованные строки на консоль
//
//        Stream<String> citiesStream = cities.stream(); // получаем поток
//        citiesStream = citiesStream.filter(s->s.length()==6); // применяем фильтрацию по длине строки
//        citiesStream.forEach(System.out::println); // выводим отфильтрованные строки на консоль
//
//        long number = citiesStream.count(); // здесь ошибка, так как поток уже употреблен
//        System.out.println(number);
//        citiesStream = citiesStream.filter(s->s.length()>5); // тоже нельзя, так как поток уже употреблен

        Stream<String> citiesStream = Arrays.stream(new String[]{"Париж", "Лондон", "Мадрид"}) ;
        citiesStream.forEach(System.out::println); // выводим все элементы массива

        // можно передать массив
        String[] cities = {"Париж", "Лондон", "Мадрид"};
        Stream<String> citiesStream2 =Stream.of(cities);

        IntStream intStream = Arrays.stream(new int[]{1,2,4,5,7});
        intStream.forEach(System.out::println);

        LongStream longStream = Arrays.stream(new long[]{100,250,400,5843787,237});
        longStream.forEach(System.out::println);

        DoubleStream doubleStream = Arrays.stream(new double[] {3.4, 6.7, 9.5, 8.2345, 121});
        doubleStream.forEach(System.out::println);
    }
}