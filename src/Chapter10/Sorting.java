package Chapter10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {

        List<String> phones = new ArrayList<String>();
        Collections.addAll(phones, "iPhone X", "Nokia 9", "Huawei Nexus 6P",
                "Samsung Galaxy S8", "LG G6", "Xiaomi MI6",
                "ASUS Zenfone 3", "Sony Xperia Z5", "Meizu Pro 6",
                "Pixel 2");

        phones.stream()
                .filter(p->p.length()<12)
                .sorted() // сортировка по возрастанию
                .forEach(System.out::println);
    }
    static class Phone{

        private String name;
        private String company;
        private int price;

        public Phone(String name, String comp, int price){
            this.name=name;
            this.company=comp;
            this.price = price;
        }

        public String getName() { return name; }
        public int getPrice() { return price; }
        public String getCompany() { return company; }
    }

}
