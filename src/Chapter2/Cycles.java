package Chapter2;

public class Cycles {
    public static void main(String args[]) {
//        for ([инициализация счетчика]; [условие]; [изменение счетчика])
//        {
//            // действия
//        }

//        for (int i = 1; i < 9; i++){
//            System.out.printf("Квадрат числа %d равен %d \n", i, i * i);
//        }

//        int i = 1;
//        for (; ;){
//            System.out.printf("Квадрат числа %d равен %d \n", i, i * i);
//        }

//        int i = 1;
//        for (; i<9;){
//            System.out.printf("Квадрат числа %d равен %d \n", i, i * i);
//            i++;
//        }

//        int n = 10;
//        for(int i=0, j = n - 1; i < j; i++, j--){
//
//            System.out.println(i * j);
//        }

//        int j = 7;
//        do{
//            System.out.println(j);
//            j--;
//        }
//        while (j > 0);

//        int j = -1;
//        do{
//            System.out.println(j);
//            j--;
//        }
//        while (j > 0);

//        int j = 6;
//        while (j > 0){
//
//            System.out.println(j);
//            j--;
//        }

//        for (int i = 0; i < 10; i++){
//            if (i == 5)
//                break;
//            System.out.println(i);
//        }

        for (int i = 0; i < 10; i++){
            if (i == 5)
                continue;
            System.out.println(i);
        }
    }
}
