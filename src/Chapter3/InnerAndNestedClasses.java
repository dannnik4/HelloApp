package Chapter3;

public class InnerAndNestedClasses {
    public static void main(String[] args) {
//        Person3 tom = new Person3("Tom", "qwerty");
//        tom.displayPerson();
//        tom.account.displayAccount();
//    }
//}
//
//class Person3 {
//
//    private String name;
//    Account account;
//
//    Person3(String name, String password) {
//        this.name = name;
//        account = new Account(password);
//    }
//
//    public void displayPerson() {
//        System.out.printf("Person \t Name: %s \t Password: %s \n", name, account.password);
//    }
//
//    public class Account {
//        private String password;
//
//        Account(String pass) {
//            this.password = pass;
//        }
//
//        void displayAccount() {
//            System.out.printf("Account Login: %s \t Password: %s \n", Person.this.name, password);
//        }
//    }
//}

//        Person3 tom = new Person3("Tom");
//        tom.setAccount("qwerty");
//    }
//}
//class Person3{
//
//    private String name;
//
//    Person3(String name){
//        this.name = name;
//    }
//
//    public void setAccount (String password){
//
//        class Account{
//
//            void display(){
//                System.out.printf("Account Login: %s \t Password: %s \n", name, password);
//            }
//        }
//        Account account = new Account();
//        account.display();
//    }
//}

        class Math {

            public static class Factorial {

                private int result;
                private int key;

                public Factorial(int number, int x) {

                    result = number;
                    key = x;
                }

                public int getResult() {
                    return result;
                }

                public int getKey() {
                    return key;
                }
            }

            public static Factorial getFactorial(int x) {

                int result = 1;
                for (int i = 1; i <= x; i++) {

                    result *= i;
                }
                return new Factorial(result, x);
            }
        }
    }
}