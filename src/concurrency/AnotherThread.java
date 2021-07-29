package concurrency;


import concurrency.threadvaraible.ThreadColor;

public class AnotherThread implements Runnable {


    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_CYAN+"I am another thread");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(ThreadColor.ANSI_CYAN+"I am anotherThread and inturrupted");
//            e.printStackTrace();
        }
        System.out.println(ThreadColor.ANSI_CYAN+"Another thread complets");
    }
}
