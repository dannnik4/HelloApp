package Chapter9;

public class Semaphore {

    public Semaphore(int i) {
        
    }

    public static void main(String[] args) {

//        java.util.concurrent.Semaphore sem = new java.util.concurrent.Semaphore(1); // 1 разрешение
//        CommonResource res = new CommonResource();
//        new Thread(new CountThread(res, sem, "CountThread 1")).start();
//        new Thread(new CountThread(res, sem, "CountThread 2")).start();
//        new Thread(new CountThread(res, sem, "CountThread 3")).start();
//    }
//}
//class CommonResource{
//
//    int x=0;
//}
//
//class CountThread implements Runnable{
//
//    CommonResource res;
//    java.util.concurrent.Semaphore sem;
//    String name;
//    CountThread(CommonResource res, java.util.concurrent.Semaphore sem, String name){
//        this.res=res;
//        this.sem=sem;
//        this.name=name;
//    }
//
//    public void run(){
//
//        try{
//            System.out.println(name + " ожидает разрешение");
//            sem.acquire();
//            res.x=1;
//            for (int i = 1; i < 5; i++){
//                System.out.println(this.name + ": " + res.x);
//                res.x++;
//                Thread.sleep(100);
//            }
//        }
//        catch(InterruptedException e){System.out.println(e.getMessage());}
//        System.out.println(name + " освобождает разрешение");
//        sem.release();
//    }
//}

        Semaphore sem = new Semaphore(2);
        for (int i = 1; i < 6; i++)
            new Philosopher(sem, i).start();
    }

    public void acquire() {
        
    }

    public void release() {
    }
}

// класс философа
class Philosopher extends Thread {
    Semaphore sem; // семафор. ограничивающий число философов
    // кол-во приемов пищи
    int num = 0;
    // условный номер философа
    int id;

    // в качестве параметров конструктора передаем идентификатор философа и семафор
    Philosopher(Semaphore sem, int id) {
        this.sem = sem;
        this.id = id;
    }

    public void run() {
        try {
            while (num < 3)// пока количество приемов пищи не достигнет 3
            {
                //Запрашиваем у семафора разрешение на выполнение
                sem.acquire();
                System.out.println("Философ " + id + " садится за стол");
                // философ ест
                sleep(500);
                num++;

                System.out.println("Философ " + id + " выходит из-за стола");
                sem.release();

                // философ гуляет
                sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("у философа " + id + " проблемы со здоровьем");
        }
    }
}