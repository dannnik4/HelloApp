public class BasicDataTypesConversions {
    public static void main(String args[]) {
//        int a = 4;
//        byte b = a; // ! Ошибка

        int a = 4;
        byte b = (byte)a;  // преобразование типов: от типа int к типу byte
        System.out.println(b); // 4
    }
}
