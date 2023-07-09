public class MethodsOptions {
//    public static void main(String args[]) {
//
//        int a = 6;
//        int b = 8;
//        sum(a, b);  // 14
//        sum(3, a);  // 9
//        sum(5, 23); // 28
//    }
//
//    static void sum(int x, int y) {
//
//        int z = x + y;
//        System.out.println(z);
//    }

    public static void main (String args[]){

        display("Tom", 34);
        display("Bob", 28);
        display("Sam", 23);
    }
    static void display(String name, int age){

        System.out.println(name);
        System.out.println(age);
    }

}
