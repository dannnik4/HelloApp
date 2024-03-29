package Chapter10;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Grouping {
    public static void main(String[] args) {

        Stream<Phone3> phoneStream = Stream.of(new Phone3("iPhone X", "Apple", 600),
                new Phone3("Pixel 2", "Google", 500),
                new Phone3("iPhone 8", "Apple",450),
                new Phone3("Galaxy S9", "Samsung", 440),
                new Phone3("Galaxy S8", "Samsung", 340));

//        Map<String, List<Phone3>> phonesByCompany = phoneStream.collect(
//                Collectors.groupingBy(Phone3::getCompany));
//
//        for(Map.Entry<String, List<Phone3>> item : phonesByCompany.entrySet()){
//
//            System.out.println(item.getKey());
//            for(Phone3 phone3 : item.getValue()){
//
//                System.out.println(phone3.getName());
//            }
//            System.out.println();
//        }

//        Map<Boolean, List<Phone3>> phonesByCompany = phoneStream.collect(
//                Collectors.partitioningBy(p->p.getCompany()=="Apple"));
//
//        for(Map.Entry<Boolean, List<Phone3>> item : phonesByCompany.entrySet()){
//
//            System.out.println(item.getKey());
//            for(Phone3 phone : item.getValue()){
//
//                System.out.println(phone.getName());
//            }
//            System.out.println();
//        }

//        Map<String, Long> phonesByCompany = phoneStream.collect(
//                Collectors.groupingBy(Phone3::getCompany, Collectors.counting()));
//
//        for(Map.Entry<String, Long> item : phonesByCompany.entrySet()){
//
//            System.out.println(item.getKey() + " - " + item.getValue());
//        }

//        Map<String, Integer> phonesByCompany = phoneStream.collect(
//                Collectors.groupingBy(Phone3::getCompany, Collectors.summingInt(Phone3::getPrice)));
//
//        for(Map.Entry<String, Integer> item : phonesByCompany.entrySet()){
//
//            System.out.println(item.getKey() + " - " + item.getValue());
//        }

//        Map<String, Optional<Phone3>> phonesByCompany = phoneStream.collect(
//                Collectors.groupingBy(Phone3::getCompany,
//                        Collectors.minBy(Comparator.comparing(Phone3::getPrice))));
//
//        for(Map.Entry<String, Optional<Phone3>> item : phonesByCompany.entrySet()){
//
//            System.out.println(item.getKey() + " - " + item.getValue().get().getName());
//        }

//        Map<String, IntSummaryStatistics> priceSummary = phoneStream.collect(
//                Collectors.groupingBy(Phone3::getCompany,
//                        Collectors.summarizingInt(Phone3::getPrice)));
//
//        for(Map.Entry<String, IntSummaryStatistics> item : priceSummary.entrySet()){
//
//            System.out.println(item.getKey() + " - " + item.getValue().getAverage());
//        }

        Map<String, List<String>> phonesByCompany = phoneStream.collect(
                Collectors.groupingBy(Phone3::getCompany,
                        Collectors.mapping(Phone3::getName, Collectors.toList())));

        for(Map.Entry<String, List<String>> item : phonesByCompany.entrySet()){

            System.out.println(item.getKey());
            for(String name : item.getValue()){
                System.out.println(name);
            }
        }
    }
}

class Phone3 {

    private String name;
    private String company;
    private int price;

    public Phone3(String name, String comp, int price) {
        this.name = name;
        this.company = comp;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getCompany() {
        return company;
    }
}