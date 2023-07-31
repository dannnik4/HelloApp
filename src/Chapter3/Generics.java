package Chapter3;

public class Generics {
    public static void main(String[] args) {

//        Account acc1 = new Account(2334, 5000); // id - число
//        int acc1Id = (int)acc1.getId();
//        System.out.println(acc1Id);
//
//        Account acc2 = new Account("sid5523", 5000);    // id - строка
//        System.out.println(acc2.getId());

//        Account<String> acc1 = new Account<String>("2345", 5000);
//        String acc1Id = acc1.getId();
//        System.out.println(acc1Id);
//
//        Account<Integer> acc2 = new Account<Integer>(2345, 5000);
//        Integer acc2Id = acc2.getId();
//        System.out.println(acc2Id);
//    }
//}

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

//class Account<T>{
//
//    private T id;
//    private int sum;
//
//    Account(T id, int sum){
//        this.id = id;
//        this.sum = sum;
//    }
//
//    public T getId() { return id; }
//    public int getSum() { return sum; }
//    public void setSum(int sum) { this.sum = sum; }
//}


//        Accountable<String> acc1 = new Account("1235rwr", 5000);
//        Account acc2 = new Account("2373", 4300);
//        System.out.println(acc1.getId());
//        System.out.println(acc2.getId());
//    }
//}
//interface Accountable<T>{
//    T getId();
//    int getSum();
//    void setSum(int sum);
//}
//class Account implements Accountable<String>{
//
//    private String id;
//    private int sum;
//
//    Account(String id, int sum){
//        this.id = id;
//        this.sum = sum;
//    }
//
//    public String getId() { return id; }
//    public int getSum() { return sum; }
//    public void setSum(int sum) { this.sum = sum; }
//}

        Account<String> acc1 = new Account<String>("1235rwr", 5000);
        Account<String> acc2 = new Account<String>("2373", 4300);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());
    }
}
interface Accountable<T>{
    T getId();
    int getSum();
    void setSum(int sum);
}
class Account<T> implements Accountable<T>{

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