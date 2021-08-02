package concurrency.interrupt;


class Task implements Runnable {
    public void run() {

        try {
            for (int i = 0; i < 1000000; i++) {
                for (int j = 0; j < 100000; j++) {
                    if(Thread.interrupted()){
                        System.out.println("Thread interrupted");
                        return;
                    }
                    System.out.print("T");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Done");
    }
}


public class InterruptTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Task());
        t1.start();
        t1.interrupt();
    }
}
