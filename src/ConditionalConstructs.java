public class ConditionalConstructs {
    public static void main(String args[]) {
        int num1 = 6;
        int num2 = 4;
        if (num1 > num2) {
            System.out.println("Первое число больше второго");
        }

        if(num1>num2){
            System.out.println("Первое число больше второго");
        }
        else{
            System.out.println("Первое число меньше второго");
        }

        if(num1>num2){
            System.out.println("Первое число больше второго");
        }
        else if(num1<num2){
            System.out.println("Первое число меньше второго");
        }
        else{
            System.out.println("Числа равны");
        }

        if(num1 > num2 && num1>7){
            System.out.println("Первое число больше второго и больше 7");
        }
    }
}
