package semaphore;

public class EvenThread extends Thread {
    SharePrinter sp;

    public EvenThread(SharePrinter sp) {
        this.sp = sp;

    }

    public void run() {
        for (int i = 0; i < 10; i +=2 ) {
            try {
                sp.printEvent(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
