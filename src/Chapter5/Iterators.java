package Chapter5;

import java.util.ArrayList;

public class Iterators {

    public static void main(String[] args) {

        ArrayList<String> states = new ArrayList<String>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");

        Iterator<String> iter = (Iterator<String>) states.iterator();
        while (iter.hasNext()) {

            System.out.println(iter.next());
        }
    }

    public interface Iterator<E> {

        E next();

        boolean hasNext();

        void remove();
    }
}