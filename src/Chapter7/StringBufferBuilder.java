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

        StringBuffer strBuffer = new StringBuffer("hello");
        strBuffer.append(" world");
        System.out.println(strBuffer.toString()); // hello world
    }
}
