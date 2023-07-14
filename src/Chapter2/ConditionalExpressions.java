package Chapter2;

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

        boolean c5 = 10 <= 10;    // true
        boolean b5 = 10 <= 4;     // false
        boolean d5 = 10 <= 20;    // true

        boolean a11 = (5 > 6) || (4 < 6); // 5 > 6 - false, 4 < 6 - true, поэтому возвращается true
        boolean a12 = (5 > 6) || (4 > 6); // 5 > 6 - false, 4 > 6 - false, поэтому возвращается false
        boolean a13 = (5 > 6) && (4 < 6); // 5 > 6 - false, поэтому возвращается false (4 < 6 - true, но не вычисляется)
        boolean a14 = (50 > 6) && (4 / 2 < 3); // 50 > 6 - true, 4/2 < 3 - true, поэтому возвращается true
        boolean a15 = (5 < 6) ^ (4 > 6); // 5 < 6 - true, поэтому возвращается true (4 > 6 - false)
        boolean a16 = (50 > 6) ^ (4 / 2 < 3); // 50 > 6 - true, 4/2 < 3 - true, поэтому возвращается false
    }
}
