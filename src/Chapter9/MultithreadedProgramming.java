package Chapter9;

public class MultithreadedProgramming {
    public static void main(String[] args) {

//        Thread t = Thread.currentThread(); // получаем главный поток
//        System.out.println(t.getName()); // main

        Thread t = Thread.currentThread(); // получаем главный поток
        System.out.println(t); // main
    }
}
