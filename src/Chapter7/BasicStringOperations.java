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
    }
}
