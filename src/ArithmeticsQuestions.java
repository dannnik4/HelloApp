public class ArithmeticsQuestions {
    public static void main(String args[]) {
        int a = 2;
        int b = 5;
        int result1 = b * 3 + 20 / 2 * a--;

        int step11 = b * 3; // 15
        int step12 = 20 / 2; // 10
        int step13 = a--; // 2
        int step14 = step12 * step13; // 20
        int step15 = step11 + step14; // 35


        int num1 = 4;
        int num2 = 5;
        int num3 = 15;
        int num4 = 10;
        int num5 = 5;
        int result2 = 12;

        result2 += num1 * num2 + num3 % num4 / num5;

        int step21 = num1 * num2; // 20
        int step22 = num3 % num4; // 5
        int step23 = step22 / num5; // 1
        int step24 = step21 + step23; // 21
        int step25 = result2 + step24; // 33
    }
}
