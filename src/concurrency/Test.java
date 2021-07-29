package concurrency;


import concurrency.threadvaraible.ThreadColor;

public class Test {

    public static void main(String ds[]) {
        Thread anotherThd = new Thread(new AnotherThread());
        anotherThd.start();
        Runnable r = () -> {

            try {
//                Thread.sleep(6000);
                anotherThd.join();

            } catch (InterruptedException e) {
                System.out.println(ThreadColor.ANSI_GREEN+"Either i am interrupted or timed out");
//                e.printStackTrace();
            }
            System.out.println(ThreadColor.ANSI_GREEN+"Back to the end ");
        };
        Thread t = new Thread(r);


        t.start();

        t.interrupt();
//        t.interrupt();

    }
}
