public class ArithmeticsQuestions {
    public static void main(String args[]) {
        int a = 2;
        int b = 5;
        int result = b * 3 + 20 / 2 * a--;

        int step1 = b * 3; // 15
        int step2 = 20 / 2; // 10
        int step3 = a--; // 2
        int step4 = step2 * step3; // 20
        int step5 = step1 + step4; // 35
    }
}
