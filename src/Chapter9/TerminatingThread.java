package Chapter9;

public class TerminatingThread extends Thread {

    public void main(String[] args) {

        System.out.println("Main thread started...");
        MyThread myThread = new MyThread();
        new Thread(myThread, "MyThread").start();

        try {
            Thread.sleep(1100);

            myThread.disable();

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        System.out.println("Main thread finished...");
    }

    class MyThread implements Runnable {

        private boolean isActive;

        void disable() {
            isActive = false;
        }

        MyThread() {
            isActive = true;
        }

        public void run() {

//            System.out.printf("%s started... \n", Thread.currentThread().getName());
//            int counter=1; // счетчик циклов
//            while(isActive){
//                System.out.println("Loop " + counter++);
//                try{
//                    Thread.sleep(400);
//                }
//                catch(InterruptedException e){
//                    System.out.println("Thread has been interrupted");
//                }
//            }
//            System.out.printf("%s finished... \n", Thread.currentThread().getName());

            System.out.printf("%s started... \n", Thread.currentThread().getName());
            int counter = 1; // счетчик циклов
            while (!Thread.currentThread().isInterrupted()) {

                System.out.println("Loop " + counter++);
            }
            System.out.printf("%s finished... \n", Thread.currentThread().getName());
        }
    }

    TerminatingThread(String name) {
        super(name);
    }

    public void run() {

//        System.out.printf("%s started... \n", Thread.currentThread().getName());
//        int counter = 1; // счетчик циклов
//        while (!isInterrupted()) {
//
//            System.out.println("Loop " + counter++);
//        }
//        System.out.printf("%s finished... \n", Thread.currentThread().getName());

        System.out.printf("%s started... \n", Thread.currentThread().getName());
        int counter=1; // счетчик циклов
        while(!isInterrupted()){

            System.out.println("Loop " + counter++);
//            try{
//                Thread.sleep(100);
//            }
//            catch(InterruptedException e){
//                System.out.println(getName() + " has been interrupted");
//                System.out.println(isInterrupted());    // false
//                interrupt();    // повторно сбрасываем состояние

            while(!isInterrupted()){

                System.out.println("Loop " + counter++);
                try{
                    Thread.sleep(100);
                }
                catch(InterruptedException e){
                    System.out.println(getName() + " has been interrupted");

                    break;  // выход из цикла
                }
            }
            }
        }
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}


class Program1 {

    public static void main(String[] args) {

        System.out.println("Main thread started...");
        TerminatingThread t = new TerminatingThread("JThread");
        t.start();
        try {
            Thread.sleep(150);
            t.interrupt();

            Thread.sleep(150);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        System.out.println("Main thread finished...");
    }
}