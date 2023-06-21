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
    }
}
