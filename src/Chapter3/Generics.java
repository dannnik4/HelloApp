package Chapter3;

public class Generics {
    public static void main(String[] args) {

    }
}

class Account{

    private int id;
    private int sum;

    Account(int id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public int getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}