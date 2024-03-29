package Chapter9;

public class SynchronizedOperator {

    public class Program {

        public void main(String[] args) {

//            CommonResource commonResource = new CommonResource();
//            for (int i = 1; i < 6; i++) {
//
//                Thread t = new Thread(new CountThread(commonResource));
//                t.setName("Thread " + i);
//                t.start();
//            }
//        }

            CommonResource commonResource = new CommonResource();
            for (
                    int i = 1;
                    i < 6; i++) {

                Thread t = new Thread(new CountThread(commonResource));
                t.setName("Thread " + i);
                t.start();
            }
        }
    }

//    class CommonResource{
//
//        int x=0;
//    }

//    class CountThread implements Runnable{
//
//        CommonResource res;
//        CountThread(CommonResource res){
//            this.res=res;
//        }
//        public void run(){
//            res.x=1;
//            for (int i = 1; i < 5; i++){
//                System.out.printf("%s %d \n", Thread.currentThread().getName(), res.x);
//                res.x++;
//                try{
//                    Thread.sleep(100);
//                }
//                catch(InterruptedException e){}
//            }
//        }
//    }


//    class CountThread implements Runnable{
//
//        CommonResource res;
//        CountThread(CommonResource res){
//            this.res=res;
//        }
//        public void run(){
//            synchronized(res){
//                res.x=1;
//                for (int i = 1; i < 5; i++){
//                    System.out.printf("%s %d \n", Thread.currentThread().getName(), res.x);
//                    res.x++;
//                    try{
//                        Thread.sleep(100);
//                    }
//                    catch(InterruptedException e){}
//                }
//            }
//        }
//    }
//}


    class CommonResource {

        int x;

        synchronized void increment() {
            x = 1;
            for (int i = 1; i < 5; i++) {
                System.out.printf("%s %d \n", Thread.currentThread().getName(), x);
                x++;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
            }
        }
    }

    class CountThread implements Runnable {

        CommonResource res;

        CountThread(CommonResource res) {
            this.res = res;
        }

        public void run() {
            res.increment();
        }
    }
}