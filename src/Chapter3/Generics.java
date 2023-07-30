package Chapter3;

public class Generics {
    public static void main(String[] args) {

        Account acc1 = new Account(2334, 5000); // id - число
        int acc1Id = (int)acc1.getId();
        System.out.println(acc1Id);

        Account acc2 = new Account("sid5523", 5000);    // id - строка
        System.out.println(acc2.getId());
    }
}

//class Account{
//
//    private int id;
//    private int sum;
//
//    Account(int id, int sum){
//        this.id = id;
//        this.sum = sum;
//    }
//
//    public int getId() { return id; }
//    public int getSum() { return sum; }
//    public void setSum(int sum) { this.sum = sum; }
//}

class Account<T>{

    private T id;
    private int sum;

    Account(T id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public T getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}