public class CyclesQuestions {
    public static void main(String args[]) {
//        int i = 5;
//        while(i > 0)
//        {
//            i *= 3;
//            i *= -2;
//        }

        int j = 2;
        for (int i = 1; i < 100; i = i + 2)
        {
            j = j - 1;
            while(j < 15)
            {
                j = j + 5;
            }
        }
    }
}
