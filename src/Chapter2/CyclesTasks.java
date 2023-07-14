package Chapter2;

import java.util.Scanner;

public class CyclesTasks {
    public static void main(String args[]) {
//        int population = 10000000;
//        int born = 14;
//        int death = 8;
//        int dif = born - death;
//        for(int i = 1; i <= 10; i++){
//            population += population * dif / 1000;
//        }
//        System.out.println(population);

//        int population = 10000000;
//        int born = 14;
//        int death = 8;
//        for(int i = 1; i <= 10; i++){
//            if (born > 7) born -= 1;
//            if (death > 6) death -=1;
//            population += population * (born - death) / 1000;
//        }
//        System.out.println(population);

//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите сумму вклада: ");
//        float deposit = in.nextFloat();
//        System.out.print("Введите сумму вклада: ");
//        int months = in.nextInt();
//
//        for(int i = 1; i <= months; i++){
//            deposit += deposit * 0.07;
//        }
//        System.out.print("После " + months + " месяцев сумма вклада составит " + deposit);
//        in.close();

//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите сумму вклада: ");
//        float deposit = in.nextFloat();
//        System.out.print("Введите сумму вклада: ");
//        int months = in.nextInt();
//        int i = months;
//
//        while (i > 0){
//            deposit += deposit * 0.07;
//            i--;
//        }
//        System.out.print("После " + months + " месяцев сумма вклада составит " + deposit);
//        in.close();

//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                System.out.printf("%d\t", i * j);
//            }
//            System.out.println();
//        }

        Scanner in = new Scanner(System.in);
        int n = 0;
        do
        {
            System.out.println("Введите первое число: ");
            int num1 = in.nextInt();
            System.out.println("Введите второе число: ");
            int num2 = in.nextInt();
            System.out.printf("%d * %d = %d \n", num1, num2, num1 * num2);

            System.out.println("Для выхода из программы нажмите цифру 1, для подолжения любую другую цифру");
            n = in.nextInt();
        }
        while(n!=1);
        in.close();
    }
}
