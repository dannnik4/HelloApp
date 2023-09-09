package Chapter7;

public class ClassString {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = new String(); // пустая строка
        String str3 = new String(new char[] {'h', 'e', 'l', 'l', 'o'});
        String str4 = new String(new char[]{'w', 'e', 'l', 'c', 'o', 'm', 'e'}, 3, 4);//3 -начальный индекс, 4 -кол-во символов

        System.out.println(str1); // Java
        System.out.println(str2); //
        System.out.println(str3); // hello
        System.out.println(str4); // come

        System.out.println(str1.length()); // 4

        String s = "";   // пустая строка
        if(s.length() == 0) System.out.println("String is empty");
        if(s.isEmpty()) System.out.println("String is empty");
        if(s == null) System.out.println("String is null");
        if(s.length()==0) System.out.println("String is empty");    // ! Ошибка
        if(s==null || s.length()==0) System.out.println("String is empty");
    }
}
