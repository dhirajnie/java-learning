package reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class Thread2 extends Thread {

    CriticalSection ct;
    ReentrantLock rt;

    public Thread2(CriticalSection ct, ReentrantLock rt) {
        this.ct = ct;
        this.rt = rt;
    }

    @Override
    public void run() {
        rt.lock();
        ct.printCounting();
        rt.unlock();
    }
}
