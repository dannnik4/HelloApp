package Chapter10;

import java.util.ArrayList;
import java.util.Arrays;

public class MixingOperations {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList(new String[]{"Tom", "Sam", "Bob", "Alice"}));
        System.out.println((long) names.size());  // 4

        // количество элементов с длиной не больше 3 символов
        System.out.println(names.stream().filter(n->n.length()<=3).count());  // 3
    }
}
