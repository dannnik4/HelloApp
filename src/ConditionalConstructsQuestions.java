public class ConditionalConstructsQuestions {
    public static void main(String args[]) {
//        int a = 5;
//        if (a <= 0) if (a == 5) a++; else a--;
//        System.out.println(a);

        int a = 5;
        switch(a){
            case 4:
                a++;
            case 5:
                a++;
            case 6:
            case 7:
            case 8:
                a++;
                break;
            case 9:
                a++;
                break;
            default:
                a++;
        }
        System.out.println(a);
    }
}
