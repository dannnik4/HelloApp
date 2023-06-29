public class CyclesQuestions {
    public static void main(String args[]) {
//        int i = 5;
//        while(i > 0)
//        {
//            i *= 3;
//            i *= -2;
//        }

//        int j = 2;
//        for (int i = 1; i < 100; i = i + 2)
//        {
//            j = j - 1;
//            while(j < 15)
//            {
//                j = j + 5;
//            }
//        }

        int j = 2;
        for (int i = 2; i < 32; i = i * 2)
        {
            while(i < j)
            {
                j = j * 2;
            }
            i = j - i;
        }
    }
}
