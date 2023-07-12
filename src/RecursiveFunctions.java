public class RecursiveFunctions {
    public static void main(String[] args) {

    }

    static int factorial(int x) {

        if (x == 1) {

            return 1;
        }
        return x * factorial(x - 1);
    }
}
