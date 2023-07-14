package Chapter2;

public class BasicDataTypesConversions {
    public static void main(String args[]) {
//        int a = 4;
//        byte b = a; // ! Ошибка

        int a = 4;
        byte b = (byte)a;  // преобразование типов: от типа int к типу byte
        System.out.println(b); // 4

        byte c = 7;
        int d = c;  // преобразование от byte к int

        int a1 = 2147483647;
        float b1 = a;            // от типа int к типу float
        System.out.println(b1);  // 2.14748365E9

        long a2 = 4;
        int b2 = (int) a2;

        int a3 = 5;
        byte b3 = (byte) a3;
        System.out.println(b3);      // 5

        int a4 = 258;
        byte b4 = (byte) a4;
        System.out.println(b4);      // 2

        double a5 = 56.9898;
        int b5 = (int)a5;

        double a6 = 56.9898;
        int b6 = (int)Math.round(a6);

        int a7 = 3;
        double b7 = 4.6;
        double c7 = a7+b7;

        byte a8 = 3;
        short b8 = 4;
        byte c8 = (byte)(a8+b8);

        int d9 = 'a' + 5;
        System.out.println(d9);  // 102
    }
}
