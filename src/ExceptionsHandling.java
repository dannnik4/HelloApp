import java.util.Scanner;

public class ExceptionsHandling {
//    public static void main(String[] args) {
//        try{
//            int[] numbers = new int[3];
//            numbers[4]=45;
//            System.out.println(numbers[4]);
//        }
//        catch(Exception ex){
//
//            ex.printStackTrace();
//        }
//        System.out.println("Программа завершена");

//        try{
//            int[] numbers = new int[3];
//            numbers[4]=45;
//            System.out.println(numbers[4]);
//        }
//        catch(Exception ex){
//
//            ex.printStackTrace();
//        }
//        finally{
//            System.out.println("Блок finally");
//        }
//        System.out.println("Программа завершена");

//        int[] numbers = new int[3];
//        try{
//            numbers[6]=45;
//            numbers[6]=Integer.parseInt("gfd");
//        }
//        catch(ArrayIndexOutOfBoundsException ex){
//
//            System.out.println("Выход за пределы массива");
//        }
//        catch(NumberFormatException ex){
//
//            System.out.println("Ошибка преобразования из строки в число");
//        }
//    }

    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            if (x >= 30) {
                throw new Exception("Число х должно быть меньше 30");
            }
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
        System.out.println("Программа завершена");
    }
}
