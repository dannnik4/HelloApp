package Chapter10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.Random;

public class OptionalType {
    public static void main(String[] args) {

//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        numbers.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9}));
//        Optional<Integer> min = numbers.stream().min(Integer::compare);
//        System.out.println(min.get());  // 1

//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        Optional<Integer> min = numbers.stream().min(Integer::compare);
//        if(min.isPresent()){
//
//            System.out.println(min.get());
//        }

//        // пустой список
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        Optional<Integer> min = numbers.stream().min(Integer::compare);
//        System.out.println(min.orElse(-1)); // -1
//
//        // непустой список
//        numbers.addAll(Arrays.asList(new Integer[]{4,5,6,7,8,9}));
//        min = numbers.stream().min(Integer::compare);
//        System.out.println(min.orElse(-1)); // 4

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        Random rnd = new Random();
        System.out.println(min.orElseGet(()->rnd.nextInt(100)));
    }
}
