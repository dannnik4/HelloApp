package Chapter3;

public class InheritanceAndGeneralizations {
    public static void main(String[] args) {

    }

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
