public class BitwiseOperations {
    public static void main(String args[]) {
        byte b = 7;     // 0000 0111
        short s = 7;    // 0000 0000 0000 0111

        int a1 = 2; //010
        int b1 = 5;//101
        System.out.println(a1&b1); // результат 0

        int a2 = 4; //100
        int b2 = 5; //101
        System.out.println(a2 & b2); // результат 4

        int a11 = 2; //010
        int b11 = 5;//101
        System.out.println(a11|b11); // результат 7 - 111
        int a12 = 4; //100
        int b12 = 5;//101
        System.out.println(a12 | b12); // результат 5 - 101
    }
}
