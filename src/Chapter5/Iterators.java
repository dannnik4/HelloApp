package Chapter5;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iterators {

    public static void main(String[] args) {

//        ArrayList<String> states = new ArrayList<String>();
//        states.add("Germany");
//        states.add("France");
//        states.add("Italy");
//        states.add("Spain");
//
//        Iterator<String> iter = (Iterator<String>) states.iterator();
//        while (iter.hasNext()) {
//
//            System.out.println(iter.next());
//        }
//    }

        ArrayList<String> states = new ArrayList<String>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");

        ListIterator<String> listIter = states.listIterator();

        while(listIter.hasNext()){

            System.out.println(listIter.next());
        }
        // сейчас текущий элемент - Испания
        // изменим значение этого элемента
        listIter.set("Португалия");
        // пройдемся по элементам в обратном порядке
        while(listIter.hasPrevious()){

            System.out.println(listIter.previous());
        }
    }

    public interface Iterator<E> {

        E next();

        boolean hasNext();

        void remove();
    }
}