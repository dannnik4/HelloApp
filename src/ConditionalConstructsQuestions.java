public class ConditionalConstructsQuestions {
    public static void main(String args[]) {
        int a = 5;
        if (a <= 0) if (a == 5) a++; else a--;
        System.out.println(a);
    }
}
