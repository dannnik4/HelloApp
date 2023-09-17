package Chapter7;

public class StringBufferBuilder {
    public static void main(String[] args) {
//        String str = "Java";
//        StringBuffer strBuffer = new StringBuffer(str);
//        System.out.println("Емкость: " + strBuffer.capacity()); // 20
//        strBuffer.ensureCapacity(32);
//        System.out.println("Емкость: " + strBuffer.capacity()); // 42
//        System.out.println("Длина: " + strBuffer.length()); // 4
//
//        System.out.println(strBuffer.toString()); // Java

//        StringBuffer strBuffer = new StringBuffer("Java");
//        char c = strBuffer.charAt(0); // J
//        System.out.println(c);
//        strBuffer.setCharAt(0, 'c');
//        System.out.println(strBuffer.toString()); // cava

//        StringBuffer strBuffer = new StringBuffer("world");
//        int startIndex = 1;
//        int endIndex = 4;
//        char[] buffer = new char[endIndex-startIndex];
//        strBuffer.getChars(startIndex, endIndex, buffer, 0);
//        System.out.println(buffer); // orl

//        StringBuffer strBuffer = new StringBuffer("hello");
//        strBuffer.append(" world");
//        System.out.println(strBuffer.toString()); // hello world

//        StringBuffer strBuffer = new StringBuffer("word");
//
//        strBuffer.insert(3, 'l');
//        System.out.println(strBuffer.toString()); //world
//
//        strBuffer.insert(0, "s");
//        System.out.println(strBuffer.toString()); //sworld

//        StringBuffer strBuffer = new StringBuffer("assembler");
//        strBuffer.delete(0,2);
//        System.out.println(strBuffer.toString()); //sembler
//
//        strBuffer.deleteCharAt(6);
//        System.out.println(strBuffer.toString()); //semble

        StringBuffer strBuffer = new StringBuffer("hello java!");
        String str1 = strBuffer.substring(6); // обрезка строки с 6 символа до конца
        System.out.println(str1); //java!

        String str2 = strBuffer.substring(3, 9); // обрезка строки с 3 по 9 символ
        System.out.println(str2); //lo jav
    }
}
