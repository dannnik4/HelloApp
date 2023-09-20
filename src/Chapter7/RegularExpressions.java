package Chapter7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
//        String text = "FIFA will never regret it";
//        String[] words = text.split("\\s*(\\s|,|!|\\.)\\s*");
//        for(String word : words){
//            System.out.println(word);
//        }

//        String input = "+12343454556";
//        boolean result = input.matches("(\\+*)\\d{11}");
//        if(result){
//            System.out.println("It is a phone number");
//        }
//        else{
//            System.out.println("It is not a phone number!");
//        }

//        String input = "Hello";
//        boolean found = Pattern.matches("Hello", input);
//        if(found)
//            System.out.println("Найдено");
//        else
//            System.out.println("Не найдено");

//        Pattern pattern = Pattern.compile("Hello");

//        String input = "Hello world! Hello Java!";
//        Pattern pattern = Pattern.compile("hello");
//        Matcher matcher = pattern.matcher(input);

        String input = "Hello";
        Pattern pattern = Pattern.compile("Hello");
        Matcher matcher = pattern.matcher(input);
        boolean found = matcher.matches();
        if(found)
            System.out.println("Найдено");
        else
            System.out.println("Не найдено");
    }
}
