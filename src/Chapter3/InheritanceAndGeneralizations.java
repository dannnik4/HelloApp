package Chapter3;

public class InheritanceAndGeneralizations {
    public static void main(String[] args) {

    }

//    class Account<T>
//    {
//        private T _id;
//        T getId(){return _id;}
//        Account(T id)
//        {
//            _id = id;
//        }
//    }
//
//    class DepositAccount<T> extends Account<T>{
//
//        DepositAccount(T id){
//            super(id);
//        }
//    }

//    class Account<T>
//    {
//        private T _id;
//        T getId(){return _id;}
//        Account(T id)
//        {
//            _id = id;
//        }
//    }
//
//    class DepositAccount<T, S> extends Account<T>{
//
//        private S _name;
//        S getName(){return _name;}
//        DepositAccount(T id, S name){
//            super(id);
//            this._name=name;
//        }
//    }

//    class Account<T>
//    {
//        private T _id;
//        T getId(){return _id;}
//        Account(T id)
//        {
//            _id = id;
//        }
//    }
//
//    class DepositAccount extends Account<Integer>{
//
//        DepositAccount(){
//            super(5);
//        }
//    }

//    class Account
//    {
//        private String _name;
//        String getName(){return _name;}
//        Account(String name)
//        {
//            _name=name;
//        }
//    }
//
//    class DepositAccount<T> extends Account{
//
//        private T _id;
//        T getId(){return _id;}
//        DepositAccount(String name, T id){
//            super(name);
//            _id = id;
//        }
//    }

    class Account<T>
    {
        private T _id;
        T getId(){return _id;}
        Account(T id)
        {
            _id = id;
        }
    }

    class DepositAccount<T> extends Account<T>{

        DepositAccount(T id){
            super(id);
        }
    }
}
