package Chapter10;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Grouping {
    public static void main(String[] args) {

        Stream<Phone3> phoneStream = Stream.of(new Phone3("iPhone X", "Apple", 600),
                new Phone3("Pixel 2", "Google", 500),
                new Phone3("iPhone 8", "Apple",450),
                new Phone3("Galaxy S9", "Samsung", 440),
                new Phone3("Galaxy S8", "Samsung", 340));

        Map<String, List<Phone3>> phonesByCompany = phoneStream.collect(
                Collectors.groupingBy(Phone3::getCompany));

        for(Map.Entry<String, List<Phone3>> item : phonesByCompany.entrySet()){

            System.out.println(item.getKey());
            for(Phone3 phone3 : item.getValue()){

                System.out.println(phone3.getName());
            }
            System.out.println();
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