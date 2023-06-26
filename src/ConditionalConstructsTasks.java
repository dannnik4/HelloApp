import java.util.Scanner;

public class ConditionalConstructsTasks {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

//        System.out.print("Введите первое число: ");
//        int num1 = in.nextInt();
//
//        System.out.print("Введите второе число: ");
//        int num2 = in.nextInt();
//
//        if (num1 > num2) {
//            System.out.print("Первое число ("+num1+") больше второго чилса ("+num2+")");
//        } else if (num1 < num2) {
//            System.out.print("Первое число ("+num1+") меньше второго второго чилса ("+num2+")");
//        } else {
//            System.out.print("Первое число ("+num1+") равно второму числу ("+num2+")");
//        }
//        in.close();

//        System.out.print("Введите число: ");
//        int num1 = in.nextInt();
//
//        if (num1 < 9 && num1 > 2){
//            System.out.print("Число "+num1+" больше 2 и меньше 9");
//        } else {
//            System.out.print("Неизвестное число");
//        }
//        in.close();

//        System.out.print("Введите сумму вклада: ");
//        int sum = in.nextInt();
//
//        if (sum > 0 && sum < 100) {
//            sum += sum * 0.05;
//            System.out.print("Сумма вклада вместе с начисленными 5% составит "+sum+" грн");
//        } else if (sum >= 100 && sum < 200) {
//            sum += sum * 0.07;
//            System.out.print("Сумма вклада вместе с начисленными 7% составит "+sum+" грн");
//        } else if (sum >= 200) {
//            sum += sum * 0.10;
//            System.out.print("Сумма вклада вместе с начисленными 10% составит "+sum+" грн");
//        } else {
//            System.out.print("Ошибка");
//        }
//        in.close();

//        System.out.println("Введите номер операции: 1.Сложение  2.Вычитание  3.Умножение");
//        int operation = in.nextInt();
//
//        switch (operation)
//        {
//            case 1:
//                System.out.println("Сложение");
//                break;
//            case 2:
//                System.out.println("Вычитание");
//                break;
//            case 3:
//                System.out.println("Умножение");
//                break;
//            default:
//                System.out.println("Неизвестная операция");
//                break;
//        }
//        in.close();

        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();

        System.out.println("Введите номер операции: 1.Сложение  2.Вычитание  3.Умножение");
        int operation = in.nextInt();
        int result = 0;
    }
}
