package Chapter7;

//interface Printable{
//    void print(String s);
//}

public class LambdaApp {
//    static int x = 10;
//    static int y = 20;

    public static void main(String[] args) {

//        Operationable operation;
//        operation = (x,y)->x+y;
//
//        int result = operation.calculate(10, 20);
//        System.out.println(result); //30
//    }
//}
//interface Operationable{
//    int calculate(int x, int y);
//}

//        Operationable op = new Operationable(){
//
//            public int calculate(int x, int y){
//
//                return x + y;
//            }
//        };
//        int z = op.calculate(20, 10);
//        System.out.println(z); // 30
//    }
//}
//interface Operationable{
//    int calculate(int x, int y);
//}

//        Printable printer = s -> System.out.println(s);
//        printer.print("Hello Java!");
//    }

//        Operation op = () -> {
//
//            x = 30;
//            return x + y;
//        };
//        System.out.println(op.calculate()); // 50
//        System.out.println(x); // 30 - значение x изменилось
//    }
//}
//
//interface Operation {
//    int calculate();
//}

//        int n = 70;
//        int m = 30;
//        Operation op = () -> {
//
//            //n=100; - так нельзя сделать
//            return m + n;
//        };
//        // n=100;  - так тоже нельзя
//        System.out.println(op.calculate()); // 100
//    }
//
//}
//interface Operation{
//    int calculate();
//}

        Operationable operation = (int x, int y) -> {

            if (y == 0)
                return 0;
            else
                return x / y;
        };

        System.out.println(operation.calculate(20, 10)); //2
        System.out.println(operation.calculate(20, 0)); //0
    }

    interface Operationable {
        int calculate(int x, int y);
    }
}