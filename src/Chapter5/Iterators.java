package Chapter5;

public class Iterators {
    public interface Iterator <E>{

        E next();
        boolean hasNext();
        void remove();
    }
}
