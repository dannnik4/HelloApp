package Chapter7;

public class BasicStringOperations {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Hello";
//        String str3 = str1 + " " + str2;
//
//        System.out.println(str3); // Hello Java

//        String str3 = "Год " + 2015;
//        System.out.println(str3);

        str2 = str2.concat(str1); // HelloJava
        System.out.println(str2);

        String str3 = String.join(" ", str2, str1); // Hello Java
        System.out.println(str3);

//        String str = "Java";
//        char c = str.charAt(2);
//        System.out.println(c); // v

        String str = "Hello world!";
        int start = 6;
        int end = 11;
        char[] dst=new char[end - start];
        str.getChars(start, end, dst, 0);
        System.out.println(dst); // world
    }
}
