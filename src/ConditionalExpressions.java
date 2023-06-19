public class ConditionalExpressions {
    public static void main(String args[]) {
        int a = 10;
        int b = 4;
        boolean c = a == b;         // false
        boolean d = a == 10;       // true

        int a1 = 10;
        int b1 = 4;
        boolean c1 = a != b;         // true
        boolean d1 = a != 10;       // false

        int a2 = 10;
        int b2 = 4;
        boolean c2 = a < b;   // false

        int a3 = 10;
        int b3 = 4;
        boolean c3 = a > b;   // true

        boolean c4 = 10 >= 10;    // true
        boolean b4 = 10 >= 4;     // true
        boolean d4 = 10 >= 20;    // false
    }
}
