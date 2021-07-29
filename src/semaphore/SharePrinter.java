package semaphore;

import java.util.concurrent.Semaphore;

public class SharePrinter {
    Semaphore odd= new Semaphore(1);
    Semaphore even = new Semaphore(0);

    void printOdd(int num) throws InterruptedException {
        odd.acquire();
        System.out.println(num+" Odd");
        even.release();
    }
    void printEvent(int num ) throws InterruptedException {
        even.acquire();
        System.out.println(num+" Even");
        odd.release();
    }


}
