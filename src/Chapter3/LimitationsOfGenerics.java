package Chapter3;

public class LimitationsOfGenerics {
    public static void main(String[] args) {

//        Account1 acc1 = new Account1("1876", 4500);
//        Account1 acc2 = new Account1("3476", 1500);
//
//        Transaction<Account1> tran1 = new Transaction<Account1>(acc1,acc2, 4000);
//        tran1.execute();
//        tran1 = new Transaction<Account1>(acc1,acc2, 4000);
//        tran1.execute();
//    }
//}
//class Transaction<T extends Account1>{
//
//    private T from;     // с какого счета перевод
//    private T to;       // на какой счет перевод
//    private int sum;    // сумма перевода
//
//    Transaction(T from, T to, int sum){
//        this.from = from;
//        this.to = to;
//        this.sum = sum;
//    }
//    public void execute(){
//
//        if (from.getSum() > sum)
//        {
//            from.setSum(from.getSum() - sum);
//            to.setSum(to.getSum() + sum);
//            System.out.printf("Account %s: %d \nAccount %s: %d \n",
//                    from.getId(), from.getSum(),to.getId(), to.getSum());
//        }
//        else{
//            System.out.printf("Operation is invalid");
//        }
//    }
//}
//class Account1{
//
//    private String id;
//    private int sum;
//
//    Account1(String id, int sum){
//        this.id = id;
//        this.sum = sum;
//    }
//
//    public String getId() { return id; }
//    public int getSum() { return sum; }
//    public void setSum(int sum) { this.sum = sum; }
//}

        Account1<String> acc1 = new Account1<String>("1876", 4500);
        Account1<String> acc2 = new Account1<String>("3476", 1500);

        Transaction<Account1<String>> tran1 = new Transaction<Account1<String>>(acc1,acc2, 4000);
        tran1.execute();
        tran1 = new Transaction<Account1<String>>(acc1,acc2, 4000);
        tran1.execute();
    }
}
class Transaction<T extends Account1<String>>{

    private T from;     // с какого счета перевод
    private T to;       // на какой счет перевод
    private int sum;    // сумма перевода

    Transaction(T from, T to, int sum){
        this.from = from;
        this.to = to;
        this.sum = sum;
    }
    public void execute(){

        if (from.getSum() > sum)
        {
            from.setSum(from.getSum() - sum);
            to.setSum(to.getSum() + sum);
            System.out.printf("Account %s: %d \nAccount %s: %d \n",
                    from.getId(), from.getSum(),to.getId(), to.getSum());
        }
        else{
            System.out.printf("Operation is invalid");
        }
    }
}
class Account1<T>{

    private T id;
    private int sum;

    Account1(T id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public T getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}