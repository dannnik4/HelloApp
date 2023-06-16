public class Arithmetics {
    public static void main(String args[]) {
        int a = 10;
        int b = 7;

        int c = a + b;  // 17
        int d = 4 + b;  // 11

        int c1 = a - b;  // 3
        int d1 = 4 - a;  // -6

        int c2 = a * b;  // 70
        int d2 = b * 5;  // 35

        a = 20;
        b = 5;
        int c3 = a / b;  // 4
        double d3 = 22.5 / 4.5;  // 5.0

        double k = 10 / 4;     // 2
        System.out.println(k);

        double k1 = 10.0 / 4;     // 2.5
        System.out.println(k1);

        a = 33;
        b = 5;
        int c4 = a % b;  // 3
        int d4 = 22 % 4; // 2 (22 - 4*5 = 2)

        a = 8;
        b = ++a;
        System.out.println(a);  // 9
        System.out.println(b);  // 9

        b = a++;
        System.out.println(a);  // 9
        System.out.println(b);  // 8
    }
}
