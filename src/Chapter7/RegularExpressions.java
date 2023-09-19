package Chapter7;

public class RegularExpressions {
    public static void main(String[] args) {
        String text = "FIFA will never regret it";
        String[] words = text.split("\\s*(\\s|,|!|\\.)\\s*");
        for(String word : words){
            System.out.println(word);
        }
    }
}
