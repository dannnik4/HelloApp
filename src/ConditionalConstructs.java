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

        int num = 8;
        switch(num) {

            case 1:
                System.out.println("число равно 1");
                break;
            case 8:
                System.out.println("число равно 8");
                num++;
                break;
            case 9:
                System.out.println("число равно 9");
                break;
            default:
                System.out.println("число не равно 1, 8, 9");
        }

        int output = 0;
        switch(num){

            case 1:
                output = 3;
                break;
            case 2:
            case 3:
            case 4:
                output = 6;
                break;
            case 5:
                output = 12;
                break;
            default:
                output = 24;
        }
        System.out.println(output);

        int x=3;
        int y=2;
        int z = x<y? (x+y) : (x-y);
        System.out.println(z);
    }
}
