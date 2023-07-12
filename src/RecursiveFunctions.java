public class RecursiveFunctions {
    public static void main(String[] args) {

    }

//    static int factorial(int x) {
//
//        if (x == 1) {
//
//            return 1;
//        }
//        return x * factorial(x - 1);
//    }

    static int factorial(int x){
        int result=1;
        for (int i = 1; i <= x; i++)
        {
            result *= i;
        }
        return  result;
    }
}
