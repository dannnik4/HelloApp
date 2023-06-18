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
    }
}
