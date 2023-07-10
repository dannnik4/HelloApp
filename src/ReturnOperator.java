public class ReturnOperator {
//    public static void main (String args[]){
//
//        return возвращаемое_значение;
//
//        int x = sum(1, 2, 3);
//        int y = sum(1, 4, 9);
//        System.out.println(x);  // 6
//        System.out.println(y);  // 14
//    }
//    static int sum(int a, int b, int c){
//
//        return a + b + c;
//    }

    public static void main (String args[]){

        System.out.println(daytime(7));     // Good morning
        System.out.println(daytime(13));    // Good after noon
        System.out.println(daytime(18));    // Good evening
        System.out.println(daytime(2));     // Good night
    }
    static String daytime(int hour){

        if (hour >24 || hour < 0)
            return "Invalid data";
        else if(hour > 21 || hour < 6)
            return "Good night";
        else if(hour >= 15)
            return "Good evening";
        else if(hour >= 11)
            return "Good after noon";
        else
            return "Good morning";
    }
}
