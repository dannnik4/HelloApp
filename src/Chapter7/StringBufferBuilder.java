package Chapter7;

public class StringBufferBuilder {
    public static void main(String[] args) {
        String str = "Java";
        StringBuffer strBuffer = new StringBuffer(str);
        System.out.println("Емкость: " + strBuffer.capacity()); // 20
        strBuffer.ensureCapacity(32);
        System.out.println("Емкость: " + strBuffer.capacity()); // 42
        System.out.println("Длина: " + strBuffer.length()); // 4

        System.out.println(strBuffer.toString()); // Java
    }
}
