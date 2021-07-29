package reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class Thread1 extends Thread {
    CriticalSection ct;
    ReentrantLock rt;

    public Thread1(CriticalSection ct, ReentrantLock rt) {
        this.ct = ct;
        this.rt=rt;
    }

    @Override
    public void run() {
        /**
          THis is same as synchronize block
         we can call rt.lock() multiple times as we can configure to have a lock count that will
         allow to have the lock like counting semaphore

         */
        rt.lock();
        ct.printCounting();
        rt.unlock();
    }
}
