package semaphore;

public class OddThread extends Thread {

    SharePrinter sp;

    public OddThread(SharePrinter sp) {
        this.sp = sp;
    }

    public void run() {
        for (int i = 1; i < 10; i += 2) {
            try {
                sp.printOdd(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
