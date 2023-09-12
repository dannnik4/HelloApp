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

//        String str = "Hello world!";
        int start = 6;
        int end = 11;
        char[] dst=new char[end - start];
        str.getChars(start, end, dst, 0);
        System.out.println(dst); // world

        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equalsIgnoreCase(str2)); // true

        boolean result = str1.regionMatches(6, str2, 2, 3);
        System.out.println(result); // true


        System.out.println(str1.compareTo(str2)); // -15 - str1 меньше чем strt2
        System.out.println(str1.compareTo(str3)); // 1 - str1 больше чем str3

        int index1 = str.indexOf('l'); // 2
        int index2 = str.indexOf("wo"); //6
        int index3 = str.lastIndexOf('l'); //9

        String str = "myfile.exe";
        boolean start = str.startsWith("my"); //true
        boolean end = str.endsWith("exe"); //true
    }
}
