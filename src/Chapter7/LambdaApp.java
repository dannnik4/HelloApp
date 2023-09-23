package Chapter7;

//interface Printable{
//    void print(String s);
//}

public class LambdaApp {
    static int x = 10;
    static int y = 20;

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

        Operation op = () -> {

            x = 30;
            return x + y;
        };
        System.out.println(op.calculate()); // 50
        System.out.println(x); // 30 - значение x изменилось
    }
}

interface Operation {
    int calculate();
}