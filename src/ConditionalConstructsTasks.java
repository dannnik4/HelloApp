import java.util.Scanner;

public class ConditionalConstructsTasks {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();

        if (num1 > num2) {
            System.out.print("Первое число ("+num1+") больше второго чилса ("+num2+")");
        } else if (num1 < num2) {
            System.out.print("Первое число ("+num1+") меньше второго второго чилса ("+num2+")");
        } else {
            System.out.print("Первое число ("+num1+") равно второму числу ("+num2+")");
        }
    }
}
