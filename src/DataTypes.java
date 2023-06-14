public class DataTypes {
    public static void main(String args[]) {
        boolean isActive = false;
        boolean isAlive = true;

        byte a1 = 3;
        byte b1 = 8;

        short a2 = 3;
        short b2 = 8;

        int a3 = 4;
        int b3 = 9;

        long a4 = 5;
        long b4 = 10;

        double x5 = 8.5;
        double y5 = 2.7;

        float x6 = 8.5F;
        float y6 = 2.7F;

        byte a7 = 1;
        short b7 = 2;
        long c7 = 2121;

        int num111 = 0x6F; // 16-теричная система, число 111
        int num8 = 010; // 8-ричная система, число 8
        int num13 = 0b1101; // 2-ичная система, число 13

        int x = 123_456;
        int y = 234_567__789;
        System.out.println(x);  // 123456
        System.out.println(y);  // 234567789

        float fl = 30.6f;
        double db = 30.6;

        char ch=102; // символ 'f'
        System.out.println(ch);

        String hello = "Hello...";
        System.out.println(hello);

        String text = "Hello \nworld";
        System.out.println(text);

        String text1 = "Вот мысль, которой весь я предан,\n"+
                "Итог всего, что ум скопил.\n"+
                "Лишь тот, кем бой за жизнь изведан,\n"+
                "Жизнь и свободу заслужил.";
        System.out.println(text1);

        String text2 = """
                Вот мысль, которой весь я предан,
                Итог всего, что ум скопил.
                Лишь тот, кем бой за жизнь изведан,
                Жизнь и свободу заслужил.
                """;
        System.out.println(text2);
    }
}
