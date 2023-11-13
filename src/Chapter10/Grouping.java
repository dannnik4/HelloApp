package Chapter10;

public class Grouping {
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